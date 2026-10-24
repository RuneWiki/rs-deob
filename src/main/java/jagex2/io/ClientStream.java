package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.GameShell;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("GXWEWMHV")
public final class ClientStream implements Runnable {

	@ObfuscatedName("GXWEWMHV.f")
	public boolean field760 = false;

	@ObfuscatedName("GXWEWMHV.k")
	public boolean field765 = false;

	@ObfuscatedName("GXWEWMHV.l")
	public boolean field766 = false;

	@ObfuscatedName("GXWEWMHV.g")
	public GameShell field761;

	@ObfuscatedName("GXWEWMHV.e")
	public Socket field759;

	@ObfuscatedName("GXWEWMHV.c")
	public InputStream field757;

	@ObfuscatedName("GXWEWMHV.d")
	public OutputStream field758;

	@ObfuscatedName("GXWEWMHV.i")
	public int field763;

	@ObfuscatedName("GXWEWMHV.j")
	public int field764;

	@ObfuscatedName("GXWEWMHV.h")
	public byte[] field762;

	public ClientStream(Socket arg0, GameShell arg1) throws IOException {
		field761 = arg1;
		field759 = arg0;
		field759.setSoTimeout(30000);
		field759.setTcpNoDelay(true);
		field757 = field759.getInputStream();
		field758 = field759.getOutputStream();
	}

	@ObfuscatedName("GXWEWMHV.a()V")
	public void method233() {
		field760 = true;

		try {
			if (field757 != null) {
				field757.close();
			}

			if (field758 != null) {
				field758.close();
			}

			if (field759 != null) {
				field759.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field765 = false;

		synchronized (this) {
			notify();
		}

		field762 = null;
	}

	@ObfuscatedName("GXWEWMHV.b()I")
	public int method234() throws IOException {
		if (field760) {
			return 0;
		}

		return field757.read();
	}

	@ObfuscatedName("GXWEWMHV.c()I")
	public int method235() throws IOException {
		if (field760) {
			return 0;
		}

		return field757.available();
	}

	@ObfuscatedName("GXWEWMHV.a([BII)V")
	public void method236(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field760) {
			while (arg2 > 0) {
				int var4 = field757.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("GXWEWMHV.a(III[B)V")
	public void method237(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field760) {
			if (field766) {
				field766 = false;
				throw new IOException("Error in writer thread");
			}

			if (field762 == null) {
				field762 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field762[field764] = arg2[arg1 + var5];
					field764 = (field764 + 1) % 5000;
					if ((field763 + 4900) % 5000 == field764) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field765) {
					field765 = true;
					field761.method142(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field765) {
			int var2;
			int var3;
			synchronized (this) {
				if (field764 == field763) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field765) {
					return;
				}

				var2 = field763;

				if (field764 >= field763) {
					var3 = field764 - field763;
				} else {
					var3 = 5000 - field763;
				}
			}

			if (var3 > 0) {
				try {
					field758.write(field762, var2, var3);
				} catch (IOException var7) {
					field766 = true;
				}

				field763 = (field763 + var3) % 5000;
				try {
					if (field764 == field763) {
						field758.flush();
					}
				} catch (IOException var6) {
					field766 = true;
				}
			}
		}
	}

	@ObfuscatedName("GXWEWMHV.a(Z)V")
	public void method238() {
		System.out.println("dummy:" + field760);
		System.out.println("tcycl:" + field763);
		System.out.println("tnum:" + field764);
		System.out.println("writer:" + field765);
		System.out.println("ioerror:" + field766);

		try {
			System.out.println("available:" + method235());
		} catch (IOException var1) {
		}
	}
}
