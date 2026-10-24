package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.GameShell;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("d")
public final class ClientStream implements Runnable {

	@ObfuscatedName("d.b")
	public InputStream in;

	@ObfuscatedName("d.c")
	public OutputStream out;

	@ObfuscatedName("d.d")
	public Socket socket;

	@ObfuscatedName("d.e")
	public boolean dummy = false;

	@ObfuscatedName("d.f")
	public GameShell shell;

	@ObfuscatedName("d.g")
	public byte[] data;

	@ObfuscatedName("d.h")
	public int tcycl;

	@ObfuscatedName("d.i")
	public int tnum;

	@ObfuscatedName("d.j")
	public boolean writer = false;

	@ObfuscatedName("d.k")
	public boolean ioerror = false;

	public ClientStream(GameShell arg0, Socket arg1) throws IOException {
		shell = arg0;
		socket = arg1;
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		in = socket.getInputStream();
		out = socket.getOutputStream();
	}

	@ObfuscatedName("d.a()V")
	public void close() {
		dummy = true;

		try {
			if (in != null) {
				in.close();
			}

			if (out != null) {
				out.close();
			}

			if (socket != null) {
				socket.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		writer = false;

		synchronized (this) {
			notify();
		}

		data = null;
	}

	@ObfuscatedName("d.b()I")
	public int read() throws IOException {
		if (dummy) {
			return 0;
		}

		return in.read();
	}

	@ObfuscatedName("d.c()I")
	public int available() throws IOException {
		if (dummy) {
			return 0;
		}

		return in.available();
	}

	@ObfuscatedName("d.a([BII)V")
	public void read(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!dummy) {
			while (arg2 > 0) {
				int var4 = in.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("d.a([BIZI)V")
	public void write(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!dummy) {
			if (ioerror) {
				ioerror = false;
				throw new IOException("Error in writer thread");
			}

			if (data == null) {
				data = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					data[tnum] = arg0[arg2 + var5];
					tnum = (tnum + 1) % 5000;
					if ((tcycl + 4900) % 5000 == tnum) {
						throw new IOException("buffer overflow");
					}
				}

				if (!writer) {
					writer = true;
					shell.startThread(this, 2);
				}

				notify();
			}
		}
	}

	public void run() {
		while (writer) {
			int var2;
			int var3;
			synchronized (this) {
				if (tnum == tcycl) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!writer) {
					return;
				}

				var2 = tcycl;

				if (tnum >= tcycl) {
					var3 = tnum - tcycl;
				} else {
					var3 = 5000 - tcycl;
				}
			}

			if (var3 > 0) {
				try {
					out.write(data, var2, var3);
				} catch (IOException var7) {
					ioerror = true;
				}

				tcycl = (tcycl + var3) % 5000;
				try {
					if (tnum == tcycl) {
						out.flush();
					}
				} catch (IOException var6) {
					ioerror = true;
				}
			}
		}
	}
}
