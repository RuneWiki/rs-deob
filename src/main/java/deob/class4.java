package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("d")
public final class class4 implements Runnable {

	@ObfuscatedName("d.a")
	public InputStream field49;

	@ObfuscatedName("d.b")
	public OutputStream field50;

	@ObfuscatedName("d.c")
	public Socket field51;

	@ObfuscatedName("d.d")
	public boolean field52 = false;

	@ObfuscatedName("d.e")
	public class1 field53;

	@ObfuscatedName("d.f")
	public byte[] field54;

	@ObfuscatedName("d.g")
	public int field55;

	@ObfuscatedName("d.h")
	public int field56;

	@ObfuscatedName("d.i")
	public boolean field57 = false;

	@ObfuscatedName("d.j")
	public boolean field58 = false;

	public class4(class1 arg0, Socket arg1) throws IOException {
		field53 = arg0;
		field51 = arg1;
		field51.setSoTimeout(30000);
		field51.setTcpNoDelay(true);
		field49 = field51.getInputStream();
		field50 = field51.getOutputStream();
	}

	@ObfuscatedName("d.a()V")
	public void method29() {
		field52 = true;

		try {
			if (field49 != null) {
				field49.close();
			}

			if (field50 != null) {
				field50.close();
			}

			if (field51 != null) {
				field51.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field57 = false;

		synchronized (this) {
			notify();
		}

		field54 = null;
	}

	@ObfuscatedName("d.b()I")
	public int method30() throws IOException {
		if (field52) {
			return 0;
		}

		return field49.read();
	}

	@ObfuscatedName("d.c()I")
	public int method31() throws IOException {
		if (field52) {
			return 0;
		}

		return field49.available();
	}

	@ObfuscatedName("d.a([BII)V")
	public void method32(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field52) {
			while (arg2 > 0) {
				int var4 = field49.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("d.a(BI[BI)V")
	public void method33(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field52) {
			if (field58) {
				field58 = false;
				throw new IOException("Error in writer thread");
			}

			if (field54 == null) {
				field54 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field54[field56] = arg1[arg0 + var5];
					field56 = (field56 + 1) % 5000;
					if ((field55 + 4900) % 5000 == field56) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field57) {
					field57 = true;
					field53.method12(this, 2);
				}

				notify();
			}
		}
	}

	public void run() {
		while (field57) {
			int var2;
			int var3;
			synchronized (this) {
				if (field56 == field55) {
					try {
						wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!field57) {
					return;
				}

				var2 = field55;

				if (field56 >= field55) {
					var3 = field56 - field55;
				} else {
					var3 = 5000 - field55;
				}
			}

			if (var3 > 0) {
				try {
					field50.write(field54, var2, var3);
				} catch (IOException var7) {
					field58 = true;
				}

				field55 = (field55 + var3) % 5000;
				try {
					if (field56 == field55) {
						field50.flush();
					}
				} catch (IOException var6) {
					field58 = true;
				}
			}
		}
	}
}
