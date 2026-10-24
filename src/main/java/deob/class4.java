package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("d")
public final class class4 implements Runnable {

	@ObfuscatedName("d.b")
	public InputStream field48;

	@ObfuscatedName("d.c")
	public OutputStream field49;

	@ObfuscatedName("d.d")
	public Socket field50;

	@ObfuscatedName("d.e")
	public boolean field51 = false;

	@ObfuscatedName("d.f")
	public class1 field52;

	@ObfuscatedName("d.g")
	public byte[] field53;

	@ObfuscatedName("d.h")
	public int field54;

	@ObfuscatedName("d.i")
	public int field55;

	@ObfuscatedName("d.j")
	public boolean field56 = false;

	@ObfuscatedName("d.k")
	public boolean field57 = false;

	public class4(class1 arg0, Socket arg1) throws IOException {
		field52 = arg0;
		field50 = arg1;
		field50.setSoTimeout(30000);
		field50.setTcpNoDelay(true);
		field48 = field50.getInputStream();
		field49 = field50.getOutputStream();
	}

	@ObfuscatedName("d.a()V")
	public void method28() {
		field51 = true;

		try {
			if (field48 != null) {
				field48.close();
			}

			if (field49 != null) {
				field49.close();
			}

			if (field50 != null) {
				field50.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field56 = false;

		synchronized (this) {
			notify();
		}

		field53 = null;
	}

	@ObfuscatedName("d.b()I")
	public int method29() throws IOException {
		if (field51) {
			return 0;
		}

		return field48.read();
	}

	@ObfuscatedName("d.c()I")
	public int method30() throws IOException {
		if (field51) {
			return 0;
		}

		return field48.available();
	}

	@ObfuscatedName("d.a([BII)V")
	public void method31(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field51) {
			while (arg2 > 0) {
				int var4 = field48.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("d.a([BIZI)V")
	public void method32(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field51) {
			if (field57) {
				field57 = false;
				throw new IOException("Error in writer thread");
			}

			if (field53 == null) {
				field53 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg1; var5++) {
					field53[field55] = arg0[arg2 + var5];
					field55 = (field55 + 1) % 5000;
					if ((field54 + 4900) % 5000 == field55) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field56) {
					field56 = true;
					field52.method12(this, 2);
				}

				notify();
			}
		}
	}

	public void run() {
		System.out.println("clientstream writer starting");

		while (field56) {
			int var2;
			int var3;
			synchronized (this) {
				if (field55 == field54) {
					try {
						wait();
					} catch (InterruptedException var6) {
					}
				}

				if (!field56) {
					break;
				}

				var2 = field54;

				if (field55 >= field54) {
					var3 = field55 - field54;
				} else {
					var3 = 5000 - field54;
				}
			}

			if (var3 > 0) {
				try {
					field49.write(field53, var2, var3);
				} catch (IOException var8) {
					field57 = true;
				}

				field54 = (field54 + var3) % 5000;
				try {
					if (field55 == field54) {
						field49.flush();
					}
				} catch (IOException var7) {
					field57 = true;
				}
			}
		}

		System.out.println("clientstream writer stopping");
	}
}
