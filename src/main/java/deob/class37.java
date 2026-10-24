package deob;

import java.math.BigInteger;

@ObfuscatedName("kb")
public final class class37 extends class30 {

	@ObfuscatedName("kb.r")
	public byte[] field539;

	@ObfuscatedName("kb.s")
	public int field540;

	@ObfuscatedName("kb.t")
	public int field541;

	@ObfuscatedName("kb.u")
	public static int[] field542 = new int[256];

	@ObfuscatedName("kb.v")
	public static final int[] field543 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("kb.w")
	public class46 field544;

	@ObfuscatedName("kb.x")
	public static int field545;

	@ObfuscatedName("kb.y")
	public static int field546;

	@ObfuscatedName("kb.z")
	public static int field547;

	@ObfuscatedName("kb.A")
	public static class41 field548 = new class41();

	@ObfuscatedName("kb.B")
	public static class41 field549 = new class41();

	@ObfuscatedName("kb.C")
	public static class41 field550 = new class41();

	@ObfuscatedName("kb.a(II)Lkb;")
	public static class37 method195(int arg0) {
		synchronized (field549) {
			class37 var2 = null;
			if (arg0 == 0 && field545 > 0) {
				field545--;
				var2 = (class37) field548.method226();
			} else if (arg0 == 1 && field546 > 0) {
				field546--;
				var2 = (class37) field549.method226();
			} else if (arg0 == 2 && field547 > 0) {
				field547--;
				var2 = (class37) field550.method226();
			}

			if (var2 != null) {
				var2.field540 = 0;
				return var2;
			}
		}

		class37 var4 = new class37();
		var4.field540 = 0;

		if (arg0 == 0) {
			var4.field539 = new byte[100];
		} else if (arg0 == 1) {
			var4.field539 = new byte[5000];
		} else {
			var4.field539 = new byte[30000];
		}

		return var4;
	}

	@ObfuscatedName("kb.a(I)V")
	public void method196() {
		synchronized (field549) {
			field540 = 0;

			if (field539.length == 100 && field545 < 1000) {
				field548.method224(this);
				field545++;
			} else if (field539.length == 5000 && field546 < 250) {
				field549.method224(this);
				field546++;
			} else if (field539.length == 30000 && field547 < 50) {
				field550.method224(this);
				field547++;
			}
		}
	}

	public class37() {
	}

	public class37(byte[] arg0) {
		field539 = arg0;
		field540 = 0;
	}

	@ObfuscatedName("kb.b(II)V")
	public void method197(int arg0) {
		field539[field540++] = (byte) (arg0 + field544.method245());
	}

	@ObfuscatedName("kb.b(I)V")
	public void method198(int arg0) {
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("kb.c(I)V")
	public void method199(int arg0) {
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("kb.c(II)V")
	public void method200(int arg0) {
		field539[field540++] = (byte) arg0;
		field539[field540++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("kb.d(I)V")
	public void method201(int arg0) {
		field539[field540++] = (byte) (arg0 >> 16);
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("kb.e(I)V")
	public void method202(int arg0) {
		field539[field540++] = (byte) (arg0 >> 24);
		field539[field540++] = (byte) (arg0 >> 16);
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("kb.d(II)V")
	public void method203(int arg0) {
		field539[field540++] = (byte) arg0;
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) (arg0 >> 16);
		field539[field540++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("kb.a(IJ)V")
	public void method204(long arg0) {
		field539[field540++] = (byte) (arg0 >> 56);
		field539[field540++] = (byte) (arg0 >> 48);
		field539[field540++] = (byte) (arg0 >> 40);
		field539[field540++] = (byte) (arg0 >> 32);
		field539[field540++] = (byte) (arg0 >> 24);
		field539[field540++] = (byte) (arg0 >> 16);
		field539[field540++] = (byte) (arg0 >> 8);
		field539[field540++] = (byte) arg0;
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;)V")
	public void method205(String arg0) {
		arg0.getBytes(0, arg0.length(), field539, field540);
		field540 += arg0.length();
		field539[field540++] = 10;
	}

	@ObfuscatedName("kb.a(BI[BI)V")
	public void method206(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field539[field540++] = arg1[var4];
		}
	}

	@ObfuscatedName("kb.e(II)V")
	public void method207(int arg0) {
		field539[field540 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("kb.c()I")
	public int method208() {
		return field539[field540++] & 0xFF;
	}

	@ObfuscatedName("kb.d()B")
	public byte method209() {
		return field539[field540++];
	}

	@ObfuscatedName("kb.e()I")
	public int method210() {
		field540 += 2;
		return ((field539[field540 - 2] & 0xFF) << 8) + (field539[field540 - 1] & 0xFF);
	}

	@ObfuscatedName("kb.f()I")
	public int method211() {
		field540 += 2;
		int var1 = ((field539[field540 - 2] & 0xFF) << 8) + (field539[field540 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("kb.g()I")
	public int method212() {
		field540 += 3;
		return (field539[field540 - 1] & 0xFF) + ((field539[field540 - 3] & 0xFF) << 16) + ((field539[field540 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("kb.h()I")
	public int method213() {
		field540 += 4;
		return (field539[field540 - 1] & 0xFF) + ((field539[field540 - 2] & 0xFF) << 8) + ((field539[field540 - 4] & 0xFF) << 24) + ((field539[field540 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("kb.f(I)J")
	public long method214() {
		long var1 = method213() & 0xFFFFFFFFL;
		long var3 = method213() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("kb.i()Ljava/lang/String;")
	public String method215() {
		int var1 = field540;

		while (field539[field540++] != 10) {
		}

		return new String(field539, var1, field540 - var1 - 1);
	}

	@ObfuscatedName("kb.g(I)[B")
	public byte[] method216() {
		int var1 = field540;

		while (field539[field540++] != 10) {
		}

		byte[] var2 = new byte[field540 - var1 - 1];
		for (int var3 = var1; var3 < field540 - 1; var3++) {
			var2[var3 - var1] = field539[var3];
		}

		return var2;
	}

	@ObfuscatedName("kb.a([BIII)V")
	public void method217(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field539[field540++];
		}
	}

	@ObfuscatedName("kb.h(I)V")
	public void method218() {
		field541 = field540 * 8;
	}

	@ObfuscatedName("kb.f(II)I")
	public int method219(int arg0) {
		int var2 = field541 >> 3;
		int var3 = 8 - (field541 & 0x7);
		int var4 = 0;
		field541 += arg0;

		while (arg0 > var3) {
			var4 += (field539[var2++] & field543[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field539[var2] & field543[var3];
		} else {
			var4 += field539[var2] >> var3 - arg0 & field543[arg0];
		}

		return var4;
	}

	@ObfuscatedName("kb.i(I)V")
	public void method220() {
		field540 = (field541 + 7) / 8;
	}

	@ObfuscatedName("kb.j()I")
	public int method221() {
		int var1 = field539[field540] & 0xFF;
		if (var1 < 128) {
			return method208() - 64;
		}

		return method210() - 49152;
	}

	@ObfuscatedName("kb.k()I")
	public int method222() {
		int var1 = field539[field540] & 0xFF;
		if (var1 < 128) {
			return method208();
		}

		return method210() - 32768;
	}

	@ObfuscatedName("kb.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method223(BigInteger arg0, BigInteger arg1) {
		int var3 = field540;
		field540 = 0;
		byte[] var4 = new byte[var3];
		method217(var4, var3, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field540 = 0;
		method198(var7.length);
		method206(var7.length, var7, 0);
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

			field542[var0] = var1;
		}
	}
}
