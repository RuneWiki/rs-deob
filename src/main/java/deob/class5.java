package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("e")
public final class class5 implements Runnable {

	@ObfuscatedName("e.b")
	public InputStream field119;

	@ObfuscatedName("e.c")
	public OutputStream field120;

	@ObfuscatedName("e.d")
	public Socket field121;

	@ObfuscatedName("e.e")
	public boolean field122 = false;

	@ObfuscatedName("e.f")
	public class1 field123;

	@ObfuscatedName("e.g")
	public byte[] field124;

	@ObfuscatedName("e.h")
	public int field125;

	@ObfuscatedName("e.i")
	public int field126;

	@ObfuscatedName("e.j")
	public boolean field127 = false;

	@ObfuscatedName("e.k")
	public boolean field128 = false;

	public class5(class1 arg0, Socket arg1) throws IOException {
		field123 = arg0;
		field121 = arg1;
		field121.setSoTimeout(30000);
		field121.setTcpNoDelay(true);
		field119 = field121.getInputStream();
		field120 = field121.getOutputStream();
	}

	@ObfuscatedName("e.a()V")
	public void method38() {
		field122 = true;

		try {
			if (field119 != null) {
				field119.close();
			}

			if (field120 != null) {
				field120.close();
			}

			if (field121 != null) {
				field121.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field127 = false;

		synchronized (this) {
			notify();
		}

		field124 = null;
	}

	@ObfuscatedName("e.b()I")
	public int method39() throws IOException {
		if (field122) {
			return 0;
		}

		return field119.read();
	}

	@ObfuscatedName("e.c()I")
	public int method40() throws IOException {
		if (field122) {
			return 0;
		}

		return field119.available();
	}

	@ObfuscatedName("e.a([BII)V")
	public void method41(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field122) {
			while (arg2 > 0) {
				int var4 = field119.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("e.a(III[B)V")
	public void method42(int arg0, int arg1, byte[] arg2) throws IOException {
		if (!field122) {
			if (field128) {
				field128 = false;
				throw new IOException("Error in writer thread");
			}

			if (field124 == null) {
				field124 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg0; var5++) {
					field124[field126] = arg2[arg1 + var5];
					field126 = (field126 + 1) % 5000;
					if ((field125 + 4900) % 5000 == field126) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field127) {
					field127 = true;
					field123.method12(this, 3);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field127) {
			int var2;
			int var3;
			synchronized (this) {
				if (field126 == field125) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field127) {
					return;
				}

				var2 = field125;

				if (field126 >= field125) {
					var3 = field126 - field125;
				} else {
					var3 = 5000 - field125;
				}
			}

			if (var3 > 0) {
				try {
					field120.write(field124, var2, var3);
				} catch (IOException var7) {
					field128 = true;
				}

				field125 = (field125 + var3) % 5000;
				try {
					if (field126 == field125) {
						field120.flush();
					}
				} catch (IOException var6) {
					field128 = true;
				}
			}
		}
	}

	@ObfuscatedName("e.a(B)V")
	public void method43() {
		System.out.println("dummy:" + field122);
		System.out.println("tcycl:" + field125);
		System.out.println("tnum:" + field126);
		System.out.println("writer:" + field127);
		System.out.println("ioerror:" + field128);

		try {
			System.out.println("available:" + method40());
		} catch (IOException var1) {
		}
	}
}
