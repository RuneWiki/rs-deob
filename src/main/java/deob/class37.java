package deob;

import java.math.BigInteger;

@ObfuscatedName("kb")
public final class class37 extends class30 {

	@ObfuscatedName("kb.r")
	public byte[] field541;

	@ObfuscatedName("kb.s")
	public int field542;

	@ObfuscatedName("kb.t")
	public int field543;

	@ObfuscatedName("kb.u")
	public static int[] field544 = new int[256];

	@ObfuscatedName("kb.v")
	public static final int[] field545 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("kb.w")
	public class46 field546;

	@ObfuscatedName("kb.x")
	public static int field547;

	@ObfuscatedName("kb.y")
	public static int field548;

	@ObfuscatedName("kb.z")
	public static int field549;

	@ObfuscatedName("kb.A")
	public static class41 field550 = new class41();

	@ObfuscatedName("kb.B")
	public static class41 field551 = new class41();

	@ObfuscatedName("kb.C")
	public static class41 field552 = new class41();

	@ObfuscatedName("kb.a(BI)Lkb;")
	public static class37 method196(int arg0) {
		synchronized (field551) {
			class37 var2 = null;
			if (arg0 == 0 && field547 > 0) {
				field547--;
				var2 = (class37) field550.method227();
			} else if (arg0 == 1 && field548 > 0) {
				field548--;
				var2 = (class37) field551.method227();
			} else if (arg0 == 2 && field549 > 0) {
				field549--;
				var2 = (class37) field552.method227();
			}

			if (var2 != null) {
				var2.field542 = 0;
				return var2;
			}
		}

		class37 var4 = new class37();
		var4.field542 = 0;

		if (arg0 == 0) {
			var4.field541 = new byte[100];
		} else if (arg0 == 1) {
			var4.field541 = new byte[5000];
		} else {
			var4.field541 = new byte[30000];
		}

		return var4;
	}

	@ObfuscatedName("kb.a(I)V")
	public void method197() {
		synchronized (field551) {
			field542 = 0;

			if (field541.length == 100 && field547 < 1000) {
				field550.method225(this);
				field547++;
			} else if (field541.length == 5000 && field548 < 250) {
				field551.method225(this);
				field548++;
			} else if (field541.length == 30000 && field549 < 50) {
				field552.method225(this);
				field549++;
			}
		}
	}

	public class37() {
	}

	public class37(byte[] arg0) {
		field541 = arg0;
		field542 = 0;
	}

	@ObfuscatedName("kb.a(II)V")
	public void method198(int arg0) {
		field541[field542++] = (byte) (arg0 + field546.method246());
	}

	@ObfuscatedName("kb.b(I)V")
	public void method199(int arg0) {
		field541[field542++] = (byte) arg0;
	}

	@ObfuscatedName("kb.c(I)V")
	public void method200(int arg0) {
		field541[field542++] = (byte) (arg0 >> 8);
		field541[field542++] = (byte) arg0;
	}

	@ObfuscatedName("kb.b(BI)V")
	public void method201(int arg0) {
		field541[field542++] = (byte) arg0;
		field541[field542++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("kb.d(I)V")
	public void method202(int arg0) {
		field541[field542++] = (byte) (arg0 >> 16);
		field541[field542++] = (byte) (arg0 >> 8);
		field541[field542++] = (byte) arg0;
	}

	@ObfuscatedName("kb.e(I)V")
	public void method203(int arg0) {
		field541[field542++] = (byte) (arg0 >> 24);
		field541[field542++] = (byte) (arg0 >> 16);
		field541[field542++] = (byte) (arg0 >> 8);
		field541[field542++] = (byte) arg0;
	}

	@ObfuscatedName("kb.c(BI)V")
	public void method204(int arg0) {
		field541[field542++] = (byte) arg0;
		field541[field542++] = (byte) (arg0 >> 8);
		field541[field542++] = (byte) (arg0 >> 16);
		field541[field542++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("kb.a(IJ)V")
	public void method205(long arg0) {
		field541[field542++] = (byte) (arg0 >> 56);
		field541[field542++] = (byte) (arg0 >> 48);
		field541[field542++] = (byte) (arg0 >> 40);
		field541[field542++] = (byte) (arg0 >> 32);
		field541[field542++] = (byte) (arg0 >> 24);
		field541[field542++] = (byte) (arg0 >> 16);
		field541[field542++] = (byte) (arg0 >> 8);
		field541[field542++] = (byte) arg0;
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;)V")
	public void method206(String arg0) {
		arg0.getBytes(0, arg0.length(), field541, field542);
		field542 += arg0.length();
		field541[field542++] = 10;
	}

	@ObfuscatedName("kb.a(I[BII)V")
	public void method207(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field541[field542++] = arg1[var4];
		}
	}

	@ObfuscatedName("kb.a(IZ)V")
	public void method208(int arg0) {
		field541[field542 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("kb.c()I")
	public int method209() {
		return field541[field542++] & 0xFF;
	}

	@ObfuscatedName("kb.d()B")
	public byte method210() {
		return field541[field542++];
	}

	@ObfuscatedName("kb.e()I")
	public int method211() {
		field542 += 2;
		return ((field541[field542 - 2] & 0xFF) << 8) + (field541[field542 - 1] & 0xFF);
	}

	@ObfuscatedName("kb.f()I")
	public int method212() {
		field542 += 2;
		int var1 = ((field541[field542 - 2] & 0xFF) << 8) + (field541[field542 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("kb.g()I")
	public int method213() {
		field542 += 3;
		return (field541[field542 - 1] & 0xFF) + ((field541[field542 - 3] & 0xFF) << 16) + ((field541[field542 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("kb.h()I")
	public int method214() {
		field542 += 4;
		return (field541[field542 - 1] & 0xFF) + ((field541[field542 - 2] & 0xFF) << 8) + ((field541[field542 - 4] & 0xFF) << 24) + ((field541[field542 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("kb.a(B)J")
	public long method215() {
		long var1 = method214() & 0xFFFFFFFFL;
		long var3 = method214() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("kb.i()Ljava/lang/String;")
	public String method216() {
		int var1 = field542;

		while (field541[field542++] != 10) {
		}

		return new String(field541, var1, field542 - var1 - 1);
	}

	@ObfuscatedName("kb.f(I)[B")
	public byte[] method217() {
		int var1 = field542;

		while (field541[field542++] != 10) {
		}

		byte[] var2 = new byte[field542 - var1 - 1];
		for (int var3 = var1; var3 < field542 - 1; var3++) {
			var2[var3 - var1] = field541[var3];
		}

		return var2;
	}

	@ObfuscatedName("kb.a(I[BIZ)V")
	public void method218(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field541[field542++];
		}
	}

	@ObfuscatedName("kb.g(I)V")
	public void method219() {
		field543 = field542 * 8;
	}

	@ObfuscatedName("kb.b(II)I")
	public int method220(int arg0) {
		int var2 = field543 >> 3;
		int var3 = 8 - (field543 & 0x7);
		int var4 = 0;
		field543 += arg0;

		while (arg0 > var3) {
			var4 += (field541[var2++] & field545[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field541[var2] & field545[var3];
		} else {
			var4 += field541[var2] >> var3 - arg0 & field545[arg0];
		}

		return var4;
	}

	@ObfuscatedName("kb.h(I)V")
	public void method221() {
		field542 = (field543 + 7) / 8;
	}

	@ObfuscatedName("kb.j()I")
	public int method222() {
		int var1 = field541[field542] & 0xFF;
		if (var1 < 128) {
			return method209() - 64;
		}

		return method211() - 49152;
	}

	@ObfuscatedName("kb.k()I")
	public int method223() {
		int var1 = field541[field542] & 0xFF;
		if (var1 < 128) {
			return method209();
		}

		return method211() - 32768;
	}

	@ObfuscatedName("kb.a(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method224(BigInteger arg0, BigInteger arg1) {
		int var3 = field542;
		field542 = 0;
		byte[] var4 = new byte[var3];
		method218(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field542 = 0;
		method199(var7.length);
		method207(var7.length, var7, 0);
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

			field544[var0] = var1;
		}
	}
}
