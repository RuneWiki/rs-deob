package deob;

import java.math.BigInteger;

@ObfuscatedName("mb")
public final class class39 extends class24 {

	@ObfuscatedName("mb.p")
	public byte[] field622;

	@ObfuscatedName("mb.q")
	public int field623;

	@ObfuscatedName("mb.r")
	public int field624;

	@ObfuscatedName("mb.s")
	public static int[] field625 = new int[256];

	@ObfuscatedName("mb.t")
	public static final int[] field626 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("mb.u")
	public class50 field627;

	@ObfuscatedName("mb.v")
	public static int field628;

	@ObfuscatedName("mb.w")
	public static int field629;

	@ObfuscatedName("mb.x")
	public static int field630;

	@ObfuscatedName("mb.y")
	public static class42 field631 = new class42();

	@ObfuscatedName("mb.z")
	public static class42 field632 = new class42();

	@ObfuscatedName("mb.A")
	public static class42 field633 = new class42();

	@ObfuscatedName("mb.a(ZI)Lmb;")
	public static class39 method225(int arg0) {
		synchronized (field632) {
			class39 var2 = null;
			if (arg0 == 0 && field628 > 0) {
				field628--;
				var2 = (class39) field631.method256();
			} else if (arg0 == 1 && field629 > 0) {
				field629--;
				var2 = (class39) field632.method256();
			} else if (arg0 == 2 && field630 > 0) {
				field630--;
				var2 = (class39) field633.method256();
			}

			if (var2 != null) {
				var2.field623 = 0;
				return var2;
			}
		}

		class39 var4 = new class39();
		var4.field623 = 0;

		if (arg0 == 0) {
			var4.field622 = new byte[100];
		} else if (arg0 == 1) {
			var4.field622 = new byte[5000];
		} else {
			var4.field622 = new byte[30000];
		}

		return var4;
	}

	@ObfuscatedName("mb.a(Z)V")
	public void method226() {
		synchronized (field632) {
			field623 = 0;

			if (field622.length == 100 && field628 < 1000) {
				field631.method254(this);
				field628++;
			} else if (field622.length == 5000 && field629 < 250) {
				field632.method254(this);
				field629++;
			} else if (field622.length == 30000 && field630 < 50) {
				field633.method254(this);
				field630++;
			}
		}
	}

	public class39() {
	}

	public class39(byte[] arg0) {
		field622 = arg0;
		field623 = 0;
	}

	@ObfuscatedName("mb.a(II)V")
	public void method227(int arg0) {
		field622[field623++] = (byte) (arg0 + field627.method304());
	}

	@ObfuscatedName("mb.a(I)V")
	public void method228(int arg0) {
		field622[field623++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(I)V")
	public void method229(int arg0) {
		field622[field623++] = (byte) (arg0 >> 8);
		field622[field623++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(II)V")
	public void method230(int arg0) {
		field622[field623++] = (byte) arg0;
		field622[field623++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("mb.c(I)V")
	public void method231(int arg0) {
		field622[field623++] = (byte) (arg0 >> 16);
		field622[field623++] = (byte) (arg0 >> 8);
		field622[field623++] = (byte) arg0;
	}

	@ObfuscatedName("mb.d(I)V")
	public void method232(int arg0) {
		field622[field623++] = (byte) (arg0 >> 24);
		field622[field623++] = (byte) (arg0 >> 16);
		field622[field623++] = (byte) (arg0 >> 8);
		field622[field623++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(IB)V")
	public void method233(int arg0) {
		field622[field623++] = (byte) arg0;
		field622[field623++] = (byte) (arg0 >> 8);
		field622[field623++] = (byte) (arg0 >> 16);
		field622[field623++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("mb.a(IJ)V")
	public void method234(long arg0) {
		field622[field623++] = (byte) (arg0 >> 56);
		field622[field623++] = (byte) (arg0 >> 48);
		field622[field623++] = (byte) (arg0 >> 40);
		field622[field623++] = (byte) (arg0 >> 32);
		field622[field623++] = (byte) (arg0 >> 24);
		field622[field623++] = (byte) (arg0 >> 16);
		field622[field623++] = (byte) (arg0 >> 8);
		field622[field623++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(Ljava/lang/String;)V")
	public void method235(String arg0) {
		arg0.getBytes(0, arg0.length(), field622, field623);
		field623 += arg0.length();
		field622[field623++] = 10;
	}

	@ObfuscatedName("mb.a([BIII)V")
	public void method236(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			field622[field623++] = arg0[var4];
		}
	}

	@ObfuscatedName("mb.a(IZ)V")
	public void method237(int arg0) {
		field622[field623 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("mb.c()I")
	public int method238() {
		return field622[field623++] & 0xFF;
	}

	@ObfuscatedName("mb.d()B")
	public byte method239() {
		return field622[field623++];
	}

	@ObfuscatedName("mb.e()I")
	public int method240() {
		field623 += 2;
		return ((field622[field623 - 2] & 0xFF) << 8) + (field622[field623 - 1] & 0xFF);
	}

	@ObfuscatedName("mb.f()I")
	public int method241() {
		field623 += 2;
		int var1 = ((field622[field623 - 2] & 0xFF) << 8) + (field622[field623 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("mb.g()I")
	public int method242() {
		field623 += 3;
		return (field622[field623 - 1] & 0xFF) + ((field622[field623 - 3] & 0xFF) << 16) + ((field622[field623 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("mb.h()I")
	public int method243() {
		field623 += 4;
		return (field622[field623 - 1] & 0xFF) + ((field622[field623 - 2] & 0xFF) << 8) + ((field622[field623 - 4] & 0xFF) << 24) + ((field622[field623 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("mb.b(Z)J")
	public long method244() {
		long var1 = method243() & 0xFFFFFFFFL;
		long var3 = method243() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("mb.i()Ljava/lang/String;")
	public String method245() {
		int var1 = field623;

		while (field622[field623++] != 10) {
		}

		return new String(field622, var1, field623 - var1 - 1);
	}

	@ObfuscatedName("mb.e(I)[B")
	public byte[] method246() {
		int var1 = field623;

		while (field622[field623++] != 10) {
		}

		byte[] var2 = new byte[field623 - var1 - 1];
		for (int var3 = var1; var3 < field623 - 1; var3++) {
			var2[var3 - var1] = field622[var3];
		}

		return var2;
	}

	@ObfuscatedName("mb.a(II[BI)V")
	public void method247(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field622[field623++];
		}
	}

	@ObfuscatedName("mb.f(I)V")
	public void method248() {
		field624 = field623 * 8;
	}

	@ObfuscatedName("mb.c(II)I")
	public int method249(int arg0) {
		int var2 = field624 >> 3;
		int var3 = 8 - (field624 & 0x7);
		int var4 = 0;
		field624 += arg0;

		while (arg0 > var3) {
			var4 += (field622[var2++] & field626[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field622[var2] & field626[var3];
		} else {
			var4 += field622[var2] >> var3 - arg0 & field626[arg0];
		}

		return var4;
	}

	@ObfuscatedName("mb.g(I)V")
	public void method250() {
		field623 = (field624 + 7) / 8;
	}

	@ObfuscatedName("mb.j()I")
	public int method251() {
		int var1 = field622[field623] & 0xFF;
		if (var1 < 128) {
			return method238() - 64;
		}

		return method240() - 49152;
	}

	@ObfuscatedName("mb.k()I")
	public int method252() {
		int var1 = field622[field623] & 0xFF;
		if (var1 < 128) {
			return method238();
		}

		return method240() - 32768;
	}

	@ObfuscatedName("mb.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method253(BigInteger arg0, BigInteger arg1) {
		int var3 = field623;
		field623 = 0;
		byte[] var4 = new byte[var3];
		method247(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field623 = 0;
		method228(var7.length);
		method236(var7, var7.length, 0);
	}

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 1;
				}
			}

			field625[var0] = var1;
		}
	}
}
