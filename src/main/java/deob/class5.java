package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public final class class5 implements Runnable {

	@ObfuscatedName("e.c")
	public InputStream field120;

	@ObfuscatedName("e.d")
	public OutputStream field121;

	@ObfuscatedName("e.e")
	public Socket field122;

	@ObfuscatedName("e.f")
	public boolean field123 = false;

	@ObfuscatedName("e.g")
	public class1 field124;

	@ObfuscatedName("e.h")
	public byte[] field125;

	@ObfuscatedName("e.i")
	public int field126;

	@ObfuscatedName("e.j")
	public int field127;

	@ObfuscatedName("e.k")
	public boolean field128 = false;

	@ObfuscatedName("e.l")
	public boolean field129 = false;

	public class5(Socket arg0, class1 arg1) throws IOException {
		field124 = arg1;
		field122 = arg0;
		field122.setSoTimeout(30000);
		field122.setTcpNoDelay(true);
		field120 = field122.getInputStream();
		field121 = field122.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
	public void method38() {
		field123 = true;

		try {
			if (field120 != null) {
				field120.close();
			}

			if (field121 != null) {
				field121.close();
			}

			if (field122 != null) {
				field122.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field128 = false;

		synchronized (this) {
			notify();
		}

		field125 = null;
	}

	@ObfuscatedName("e.b()I")
	public int method39() throws IOException {
		if (field123) {
			return 0;
		}

		return field120.read();
	}

	@ObfuscatedName("e.c()I")
	public int method40() throws IOException {
		if (field123) {
			return 0;
		}

		return field120.available();
	}

	@ObfuscatedName("e.a([BII)V")
	public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field123) {
			while (arg2 > 0) {
				int var4 = field120.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("e.a(B[BII)V")
	public void method42(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field123) {
			if (field129) {
				field129 = false;
				throw new IOException("Error in writer thread");
			}

			if (field125 == null) {
				field125 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field125[field127] = arg0[arg1 + var5];
					field127 = (field127 + 1) % 5000;
					if ((field126 + 4900) % 5000 == field127) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field128) {
					field128 = true;
					field124.method12(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field128) {
			int var2;
			int var3;
			synchronized (this) {
				if (field127 == field126) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field128) {
					return;
				}

				var2 = field126;

				if (field127 >= field126) {
					var3 = field127 - field126;
				} else {
					var3 = 5000 - field126;
				}
			}

			if (var3 > 0) {
				try {
					field121.write(field125, var2, var3);
				} catch (IOException var7) {
					field129 = true;
				}

				field126 = (field126 + var3) % 5000;
				try {
					if (field127 == field126) {
						field121.flush();
					}
				} catch (IOException var6) {
					field129 = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(Z)V")
	public void method43() {
		System.out.println("dummy:" + field123);
		System.out.println("tcycl:" + field126);
		System.out.println("tnum:" + field127);
		System.out.println("writer:" + field128);
		System.out.println("ioerror:" + field129);

		try {
			System.out.println("available:" + method40());
		} catch (IOException var1) {
		}
	}
}
