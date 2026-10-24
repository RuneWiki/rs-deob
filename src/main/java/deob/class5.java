package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public final class class5 implements Runnable {

	@ObfuscatedName("e.c")
	public InputStream field112;

	@ObfuscatedName("e.d")
	public OutputStream field113;

	@ObfuscatedName("e.e")
	public Socket field114;

	@ObfuscatedName("e.f")
	public boolean field115 = false;

	@ObfuscatedName("e.g")
	public class1 field116;

	@ObfuscatedName("e.h")
	public byte[] field117;

	@ObfuscatedName("e.i")
	public int field118;

	@ObfuscatedName("e.j")
	public int field119;

	@ObfuscatedName("e.k")
	public boolean field120 = false;

	@ObfuscatedName("e.l")
	public boolean field121 = false;

	public class5(Socket arg0, class1 arg1) throws IOException {
		field116 = arg1;
		field114 = arg0;
		field114.setSoTimeout(30000);
		field114.setTcpNoDelay(true);
		field112 = field114.getInputStream();
		field113 = field114.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
	public void method37() {
		field115 = true;

		try {
			if (field112 != null) {
				field112.close();
			}

			if (field113 != null) {
				field113.close();
			}

			if (field114 != null) {
				field114.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field120 = false;

		synchronized (this) {
			notify();
		}

		field117 = null;
	}

	@ObfuscatedName("e.b()I")
	public int method38() throws IOException {
		if (field115) {
			return 0;
		}

		return field112.read();
	}

	@ObfuscatedName("e.c()I")
	public int method39() throws IOException {
		if (field115) {
			return 0;
		}

		return field112.available();
	}

	@ObfuscatedName("e.a([BII)V")
	public void method40(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field115) {
			while (arg2 > 0) {
				int var4 = field112.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("e.a([BIIZ)V")
	public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field115) {
			if (field121) {
				field121 = false;
				throw new IOException("Error in writer thread");
			}

			if (field117 == null) {
				field117 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field117[field119] = arg0[arg1 + var5];
					field119 = (field119 + 1) % 5000;
					if ((field118 + 4900) % 5000 == field119) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field120) {
					field120 = true;
					field116.method12(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field120) {
			int var2;
			int var3;
			synchronized (this) {
				if (field119 == field118) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field120) {
					return;
				}

				var2 = field118;

				if (field119 >= field118) {
					var3 = field119 - field118;
				} else {
					var3 = 5000 - field118;
				}
			}

			if (var3 > 0) {
				try {
					field113.write(field117, var2, var3);
				} catch (IOException var7) {
					field121 = true;
				}

				field118 = (field118 + var3) % 5000;
				try {
					if (field119 == field118) {
						field113.flush();
					}
				} catch (IOException var6) {
					field121 = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(B)V")
	public void method42() {
		System.out.println("dummy:" + field115);
		System.out.println("tcycl:" + field118);
		System.out.println("tnum:" + field119);
		System.out.println("writer:" + field120);
		System.out.println("ioerror:" + field121);

		try {
			System.out.println("available:" + method39());
		} catch (IOException var1) {
		}
	}
}
