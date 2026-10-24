package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("d")
public final class class4 implements Runnable {

	@ObfuscatedName("d.b")
	public InputStream field50;

	@ObfuscatedName("d.c")
	public OutputStream field51;

	@ObfuscatedName("d.d")
	public Socket field52;

	@ObfuscatedName("d.e")
	public boolean field53 = false;

	@ObfuscatedName("d.f")
	public class1 field54;

	@ObfuscatedName("d.g")
	public byte[] field55;

	@ObfuscatedName("d.h")
	public int field56;

	@ObfuscatedName("d.i")
	public int field57;

	@ObfuscatedName("d.j")
	public boolean field58 = false;

	@ObfuscatedName("d.k")
	public boolean field59 = false;

	public class4(class1 arg0, Socket arg1) throws IOException {
		field54 = arg0;
		field52 = arg1;
		field52.setSoTimeout(30000);
		field52.setTcpNoDelay(true);
		field50 = field52.getInputStream();
		field51 = field52.getOutputStream();
	}

	@ObfuscatedName("d.a()V")
	public void method29() {
		field53 = true;

		try {
			if (field50 != null) {
				field50.close();
			}

			if (field51 != null) {
				field51.close();
			}

			if (field52 != null) {
				field52.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field58 = false;

		synchronized (this) {
			notify();
		}

		field55 = null;
	}

	@ObfuscatedName("d.b()I")
	public int method30() throws IOException {
		if (field53) {
			return 0;
		}

		return field50.read();
	}

	@ObfuscatedName("d.c()I")
	public int method31() throws IOException {
		if (field53) {
			return 0;
		}

		return field50.available();
	}

	@ObfuscatedName("d.a([BII)V")
	public void method32(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field53) {
			while (arg2 > 0) {
				int var4 = field50.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("d.a([BIII)V")
	public void method33(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field53) {
			if (field59) {
				field59 = false;
				throw new IOException("Error in writer thread");
			}

			if (field55 == null) {
				field55 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field55[field57] = arg0[arg1 + var5];
					field57 = (field57 + 1) % 5000;
					if ((field56 + 4900) % 5000 == field57) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field58) {
					field58 = true;
					field54.method12(this, 2);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field58) {
			int var2;
			int var3;
			synchronized (this) {
				if (field57 == field56) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field58) {
					return;
				}

				var2 = field56;

				if (field57 >= field56) {
					var3 = field57 - field56;
				} else {
					var3 = 5000 - field56;
				}
			}

			if (var3 > 0) {
				try {
					field51.write(field55, var2, var3);
				} catch (IOException var7) {
					field59 = true;
				}

				field56 = (field56 + var3) % 5000;
				try {
					if (field57 == field56) {
						field51.flush();
					}
				} catch (IOException var6) {
					field59 = true;
				}
			}
		}
	}
}
