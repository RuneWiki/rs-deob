package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.GameShell;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("NQABEVLK")
public final class ClientStream implements Runnable {

	@ObfuscatedName("NQABEVLK.g")
	public boolean dummy = false;

	@ObfuscatedName("NQABEVLK.l")
	public boolean writer = false;

	@ObfuscatedName("NQABEVLK.m")
	public boolean ioerror = false;

	@ObfuscatedName("NQABEVLK.h")
	public GameShell shell;

	@ObfuscatedName("NQABEVLK.f")
	public Socket socket;

	@ObfuscatedName("NQABEVLK.d")
	public InputStream in;

	@ObfuscatedName("NQABEVLK.e")
	public OutputStream out;

	@ObfuscatedName("NQABEVLK.j")
	public int tcyl;

	@ObfuscatedName("NQABEVLK.k")
	public int tnum;

	@ObfuscatedName("NQABEVLK.i")
	public byte[] data;

	public ClientStream(GameShell arg0, Socket arg1) throws IOException {
		shell = arg0;
		socket = arg1;
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		in = socket.getInputStream();
		out = socket.getOutputStream();
	}

	@ObfuscatedName("NQABEVLK.a()V")
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

	@ObfuscatedName("NQABEVLK.b()I")
	public int read() throws IOException {
		if (dummy) {
			return 0;
		}

		return in.read();
	}

	@ObfuscatedName("NQABEVLK.c()I")
	public int available() throws IOException {
		if (dummy) {
			return 0;
		}

		return in.available();
	}

	@ObfuscatedName("NQABEVLK.a([BII)V")
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

	@ObfuscatedName("NQABEVLK.a(II[BI)V")
	public void write(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!dummy) {
			if (ioerror) {
				ioerror = false;
				throw new IOException("Error in writer thread");
			}

			if (data == null) {
				data = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					data[tnum] = arg1[arg2 + var5];
					tnum = (tnum + 1) % 5000;
					if ((tcyl + 4900) % 5000 == tnum) {
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
				if (tnum == tcyl) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!writer) {
					return;
				}

				var2 = tcyl;

				if (tnum >= tcyl) {
					var3 = tnum - tcyl;
				} else {
					var3 = 5000 - tcyl;
				}
			}

			if (var3 > 0) {
				try {
					out.write(data, var2, var3);
				} catch (IOException var7) {
					ioerror = true;
				}

				tcyl = (tcyl + var3) % 5000;
				try {
					if (tnum == tcyl) {
						out.flush();
					}
				} catch (IOException var6) {
					ioerror = true;
				}
			}
		}
	}

	@ObfuscatedName("NQABEVLK.a(B)V")
	public void debug() {
		System.out.println("dummy:" + dummy);
		System.out.println("tcycl:" + tcyl);
		System.out.println("tnum:" + tnum);
		System.out.println("writer:" + writer);
		System.out.println("ioerror:" + ioerror);

		try {
			System.out.println("available:" + available());
		} catch (IOException var1) {
		}
	}
}
