package deob;

import java.math.BigInteger;

@ObfuscatedName("kb")
public final class class37 extends class30 {

	@ObfuscatedName("kb.r")
	public byte[] field540;

	@ObfuscatedName("kb.s")
	public int field541;

	@ObfuscatedName("kb.t")
	public int field542;

	@ObfuscatedName("kb.u")
	public static int[] field543 = new int[256];

	@ObfuscatedName("kb.v")
	public static final int[] field544 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("kb.w")
	public class46 field545;

	@ObfuscatedName("kb.x")
	public static int field546;

	@ObfuscatedName("kb.y")
	public static int field547;

	@ObfuscatedName("kb.z")
	public static int field548;

	@ObfuscatedName("kb.A")
	public static class41 field549 = new class41();

	@ObfuscatedName("kb.B")
	public static class41 field550 = new class41();

	@ObfuscatedName("kb.C")
	public static class41 field551 = new class41();

	@ObfuscatedName("kb.a(BI)Lkb;")
	public static class37 method196(int arg0) {
		synchronized (field550) {
			class37 var2 = null;
			if (arg0 == 0 && field546 > 0) {
				field546--;
				var2 = (class37) field549.method227();
			} else if (arg0 == 1 && field547 > 0) {
				field547--;
				var2 = (class37) field550.method227();
			} else if (arg0 == 2 && field548 > 0) {
				field548--;
				var2 = (class37) field551.method227();
			}

			if (var2 != null) {
				var2.field541 = 0;
				return var2;
			}
		}

		class37 var4 = new class37();
		var4.field541 = 0;

		if (arg0 == 0) {
			var4.field540 = new byte[100];
		} else if (arg0 == 1) {
			var4.field540 = new byte[5000];
		} else {
			var4.field540 = new byte[30000];
		}

		return var4;
	}

	@ObfuscatedName("kb.a(I)V")
	public void method197() {
		synchronized (field550) {
			field541 = 0;

			if (field540.length == 100 && field546 < 1000) {
				field549.method225(this);
				field546++;
			} else if (field540.length == 5000 && field547 < 250) {
				field550.method225(this);
				field547++;
			} else if (field540.length == 30000 && field548 < 50) {
				field551.method225(this);
				field548++;
			}
		}
	}

	public class37() {
	}

	public class37(byte[] arg0) {
		field540 = arg0;
		field541 = 0;
	}

	@ObfuscatedName("kb.a(II)V")
	public void method198(int arg0) {
		field540[field541++] = (byte) (arg0 + field545.method246());
	}

	@ObfuscatedName("kb.b(I)V")
	public void method199(int arg0) {
		field540[field541++] = (byte) arg0;
	}

	@ObfuscatedName("kb.c(I)V")
	public void method200(int arg0) {
		field540[field541++] = (byte) (arg0 >> 8);
		field540[field541++] = (byte) arg0;
	}

	@ObfuscatedName("kb.a(IB)V")
	public void method201(int arg0) {
		field540[field541++] = (byte) arg0;
		field540[field541++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("kb.d(I)V")
	public void method202(int arg0) {
		field540[field541++] = (byte) (arg0 >> 16);
		field540[field541++] = (byte) (arg0 >> 8);
		field540[field541++] = (byte) arg0;
	}

	@ObfuscatedName("kb.e(I)V")
	public void method203(int arg0) {
		field540[field541++] = (byte) (arg0 >> 24);
		field540[field541++] = (byte) (arg0 >> 16);
		field540[field541++] = (byte) (arg0 >> 8);
		field540[field541++] = (byte) arg0;
	}

	@ObfuscatedName("kb.a(ZI)V")
	public void method204(int arg0) {
		field540[field541++] = (byte) arg0;
		field540[field541++] = (byte) (arg0 >> 8);
		field540[field541++] = (byte) (arg0 >> 16);
		field540[field541++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("kb.a(IJ)V")
	public void method205(long arg0) {
		field540[field541++] = (byte) (arg0 >> 56);
		field540[field541++] = (byte) (arg0 >> 48);
		field540[field541++] = (byte) (arg0 >> 40);
		field540[field541++] = (byte) (arg0 >> 32);
		field540[field541++] = (byte) (arg0 >> 24);
		field540[field541++] = (byte) (arg0 >> 16);
		field540[field541++] = (byte) (arg0 >> 8);
		field540[field541++] = (byte) arg0;
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;)V")
	public void method206(String arg0) {
		arg0.getBytes(0, arg0.length(), field540, field541);
		field541 += arg0.length();
		field540[field541++] = 10;
	}

	@ObfuscatedName("kb.a([BIII)V")
	public void method207(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field540[field541++] = arg0[var4];
		}
	}

	@ObfuscatedName("kb.b(BI)V")
	public void method208(int arg0) {
		field540[field541 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("kb.c()I")
	public int method209() {
		return field540[field541++] & 0xFF;
	}

	@ObfuscatedName("kb.d()B")
	public byte method210() {
		return field540[field541++];
	}

	@ObfuscatedName("kb.e()I")
	public int method211() {
		field541 += 2;
		return ((field540[field541 - 2] & 0xFF) << 8) + (field540[field541 - 1] & 0xFF);
	}

	@ObfuscatedName("kb.f()I")
	public int method212() {
		field541 += 2;
		int var1 = ((field540[field541 - 2] & 0xFF) << 8) + (field540[field541 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("kb.g()I")
	public int method213() {
		field541 += 3;
		return (field540[field541 - 1] & 0xFF) + ((field540[field541 - 3] & 0xFF) << 16) + ((field540[field541 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("kb.h()I")
	public int method214() {
		field541 += 4;
		return (field540[field541 - 1] & 0xFF) + ((field540[field541 - 2] & 0xFF) << 8) + ((field540[field541 - 4] & 0xFF) << 24) + ((field540[field541 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("kb.a(B)J")
	public long method215() {
		long var1 = method214() & 0xFFFFFFFFL;
		long var3 = method214() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("kb.i()Ljava/lang/String;")
	public String method216() {
		int var1 = field541;

		while (field540[field541++] != 10) {
		}

		return new String(field540, var1, field541 - var1 - 1);
	}

	@ObfuscatedName("kb.b(B)[B")
	public byte[] method217() {
		int var1 = field541;

		while (field540[field541++] != 10) {
		}

		byte[] var2 = new byte[field541 - var1 - 1];
		for (int var3 = var1; var3 < field541 - 1; var3++) {
			var2[var3 - var1] = field540[var3];
		}

		return var2;
	}

	@ObfuscatedName("kb.a(I[BII)V")
	public void method218(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field540[field541++];
		}
	}

	@ObfuscatedName("kb.f(I)V")
	public void method219() {
		field542 = field541 * 8;
	}

	@ObfuscatedName("kb.b(II)I")
	public int method220(int arg0) {
		int var2 = field542 >> 3;
		int var3 = 8 - (field542 & 0x7);
		int var4 = 0;
		field542 += arg0;

		while (arg0 > var3) {
			var4 += (field540[var2++] & field544[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field540[var2] & field544[var3];
		} else {
			var4 += field540[var2] >> var3 - arg0 & field544[arg0];
		}

		return var4;
	}

	@ObfuscatedName("kb.a(Z)V")
	public void method221() {
		field541 = (field542 + 7) / 8;
	}

	@ObfuscatedName("kb.j()I")
	public int method222() {
		int var1 = field540[field541] & 0xFF;
		if (var1 < 128) {
			return method209() - 64;
		}

		return method211() - 49152;
	}

	@ObfuscatedName("kb.k()I")
	public int method223() {
		int var1 = field540[field541] & 0xFF;
		if (var1 < 128) {
			return method209();
		}

		return method211() - 32768;
	}

	@ObfuscatedName("kb.a(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public void method224(BigInteger arg0, BigInteger arg1) {
		int var3 = field541;
		field541 = 0;
		byte[] var4 = new byte[var3];
		method218(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field541 = 0;
		method199(var7.length);
		method207(var7, 0, var7.length);
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

			field543[var0] = var1;
		}
	}
}
