package deob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("d")
public final class class4 implements Runnable {

	@ObfuscatedName("d.b")
	public InputStream field47;

	@ObfuscatedName("d.c")
	public OutputStream field48;

	@ObfuscatedName("d.d")
	public Socket field49;

	@ObfuscatedName("d.e")
	public boolean field50 = false;

	@ObfuscatedName("d.f")
	public class1 field51;

	@ObfuscatedName("d.g")
	public byte[] field52;

	@ObfuscatedName("d.h")
	public int field53;

	@ObfuscatedName("d.i")
	public int field54;

	@ObfuscatedName("d.j")
	public boolean field55 = false;

	@ObfuscatedName("d.k")
	public boolean field56 = false;

	public class4(Socket arg0, class1 arg1) throws IOException {
		field51 = arg1;
		field49 = arg0;
		field49.setSoTimeout(30000);
		field49.setTcpNoDelay(true);
		field47 = field49.getInputStream();
		field48 = field49.getOutputStream();
	}

	@ObfuscatedName("d.a()V")
	public void method28() {
		field50 = true;

		try {
			if (field47 != null) {
				field47.close();
			}

			if (field48 != null) {
				field48.close();
			}

			if (field49 != null) {
				field49.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}

		field55 = false;

		synchronized (this) {
			notify();
		}

		field52 = null;
	}

	@ObfuscatedName("d.b()I")
	public int method29() throws IOException {
		if (field50) {
			return 0;
		}

		return field47.read();
	}

	@ObfuscatedName("d.c()I")
	public int method30() throws IOException {
		if (field50) {
			return 0;
		}

		return field47.available();
	}

	@ObfuscatedName("d.a([BII)V")
	public void method31(byte[] arg0, int arg1, int arg2) throws IOException {
		if (!field50) {
			while (arg2 > 0) {
				int var4 = field47.read(arg0, arg1, arg2);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				arg1 += var4;
				arg2 -= var4;
			}
		}
	}

	@ObfuscatedName("d.a(II[BI)V")
	public void method32(int arg0, byte[] arg1, int arg2) throws IOException {
		if (!field50) {
			if (field56) {
				field56 = false;
				throw new IOException("Error in writer thread");
			}

			if (field52 == null) {
				field52 = new byte[5000];
			}

			synchronized (this) {
				for (int var5 = 0; var5 < arg2; var5++) {
					field52[field54] = arg1[arg0 + var5];
					field54 = (field54 + 1) % 5000;
					if ((field53 + 4900) % 5000 == field54) {
						throw new IOException("buffer overflow");
					}
				}

				if (!field55) {
					field55 = true;
					field51.method12(this, 2);
				}

				notify();
			}
		}
	}

	public void run() {
		System.out.println("clientstream writer starting");

		while (field55) {
			int var2;
			int var3;
			synchronized (this) {
				if (field54 == field53) {
					try {
						wait();
					} catch (InterruptedException var6) {
					}
				}

				if (!field55) {
					break;
				}

				var2 = field53;

				if (field54 >= field53) {
					var3 = field54 - field53;
				} else {
					var3 = 5000 - field53;
				}
			}

			if (var3 > 0) {
				try {
					field48.write(field52, var2, var3);
				} catch (IOException var8) {
					field56 = true;
				}

				field53 = (field53 + var3) % 5000;
				try {
					if (field54 == field53) {
						field48.flush();
					}
				} catch (IOException var7) {
					field56 = true;
				}
			}
		}

		System.out.println("clientstream writer stopping");
	}
}
