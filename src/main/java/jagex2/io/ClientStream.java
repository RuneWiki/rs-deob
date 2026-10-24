package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.GameShell;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public final class ClientStream implements Runnable {

	@ObfuscatedName("e.d")
	public InputStream in;

	@ObfuscatedName("e.e")
	public OutputStream out;

	@ObfuscatedName("e.f")
	public Socket socket;

	@ObfuscatedName("e.g")
	public boolean dummy = false;

	@ObfuscatedName("e.h")
	public GameShell shell;

	@ObfuscatedName("e.i")
	public byte[] data;

	@ObfuscatedName("e.j")
	public int tcycl;

	@ObfuscatedName("e.k")
	public int tnum;

	@ObfuscatedName("e.l")
	public boolean writer = false;

	@ObfuscatedName("e.m")
	public boolean ioerror = false;

	public ClientStream(GameShell arg0, Socket arg1) throws IOException {
		shell = arg0;
		socket = arg1;
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		in = socket.getInputStream();
		out = socket.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
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

	@ObfuscatedName("e.b()I")
	public int read() throws IOException {
		if (dummy) {
			return 0;
		}

		return in.read();
	}

	@ObfuscatedName("e.c()I")
	public int available() throws IOException {
		if (dummy) {
			return 0;
		}

		return in.available();
	}

	@ObfuscatedName("e.a([BII)V")
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

	@ObfuscatedName("e.a([BIII)V")
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
				for (int var5 = 0; var5 < arg2; var5++) {
					data[tnum] = arg0[arg1 + var5];
					tnum = (tnum + 1) % 5000;
					if ((tcycl + 4900) % 5000 == tnum) {
						throw new IOException("buffer overflow");
					}
				}

				if (!writer) {
					writer = true;
					shell.startThread(this, 3);
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

	@ObfuscatedName("e.a(I)V")
	public void debug() {
		System.out.println("dummy:" + dummy);
		System.out.println("tcycl:" + tcycl);
		System.out.println("tnum:" + tnum);
		System.out.println("writer:" + writer);
		System.out.println("ioerror:" + ioerror);

		try {
			System.out.println("available:" + available());
		} catch (IOException var1) {
		}
	}
}
