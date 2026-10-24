package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public final class class5 implements Runnable {

	@ObfuscatedName("e.c")
	public InputStream field121;

	@ObfuscatedName("e.d")
	public OutputStream field122;

	@ObfuscatedName("e.e")
	public Socket field123;

	@ObfuscatedName("e.f")
	public boolean field124 = false;

	@ObfuscatedName("e.g")
	public class1 field125;

	@ObfuscatedName("e.h")
	public byte[] field126;

	@ObfuscatedName("e.i")
	public int field127;

	@ObfuscatedName("e.j")
	public int field128;

	@ObfuscatedName("e.k")
	public boolean field129 = false;

	@ObfuscatedName("e.l")
	public boolean field130 = false;

	public class5(class1 arg0, Socket arg1) throws IOException {
		field125 = arg0;
		field123 = arg1;
		field123.setSoTimeout(30000);
		field123.setTcpNoDelay(true);
		field121 = field123.getInputStream();
		field122 = field123.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
	public void method38() {
		field124 = true;

		try {
			if (field121 != null) {
				field121.close();
			}

			if (field122 != null) {
				field122.close();
			}

			if (field123 != null) {
				field123.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field129 = false;

		synchronized (this) {
			notify();
		}

		field126 = null;
	}

	@ObfuscatedName("e.b()I")
	public int method39() throws IOException {
		if (field124) {
			return 0;
		}

		return field121.read();
	}

	@ObfuscatedName("e.c()I")
	public int method40() throws IOException {
		if (field124) {
			return 0;
		}

		return field121.available();
	}

	@ObfuscatedName("e.a([BII)V")
	public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field124) {
			while (arg2 > 0) {
				int var4 = field121.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("e.a(II[BI)V")
	public void method42(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field124) {
			if (field130) {
				field130 = false;
				throw new IOException("Error in writer thread");
			}

			if (field126 == null) {
				field126 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field126[field128] = arg2[arg0 + var5];
					field128 = (field128 + 1) % 5000;
					if ((field127 + 4900) % 5000 == field128) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field129) {
					field129 = true;
					field125.method12(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field129) {
			int var2;
			int var3;
			synchronized (this) {
				if (field128 == field127) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field129) {
					return;
				}

				var2 = field127;

				if (field128 >= field127) {
					var3 = field128 - field127;
				} else {
					var3 = 5000 - field127;
				}
			}

			if (var3 > 0) {
				try {
					field122.write(field126, var2, var3);
				} catch (IOException var7) {
					field130 = true;
				}

				field127 = (field127 + var3) % 5000;
				try {
					if (field128 == field127) {
						field122.flush();
					}
				} catch (IOException var6) {
					field130 = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(B)V")
	public void method43() {
		System.out.println("dummy:" + field124);
		System.out.println("tcycl:" + field127);
		System.out.println("tnum:" + field128);
		System.out.println("writer:" + field129);
		System.out.println("ioerror:" + field130);

		try {
			System.out.println("available:" + method40());
		} catch (IOException var1) {
		}
	}
}
