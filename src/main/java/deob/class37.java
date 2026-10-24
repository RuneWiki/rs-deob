package deob;

import java.math.BigInteger;

@ObfuscatedName("kb")
public final class class37 extends class30 {

	@ObfuscatedName("kb.q")
	public byte[] field536;

	@ObfuscatedName("kb.r")
	public int field537;

	@ObfuscatedName("kb.s")
	public int field538;

	@ObfuscatedName("kb.t")
	public static int[] field539 = new int[256];

	@ObfuscatedName("kb.u")
	public static final int[] field540 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("kb.v")
	public class46 field541;

	@ObfuscatedName("kb.w")
	public static int field542;

	@ObfuscatedName("kb.x")
	public static int field543;

	@ObfuscatedName("kb.y")
	public static int field544;

	@ObfuscatedName("kb.z")
	public static class41 field545 = new class41();

	@ObfuscatedName("kb.A")
	public static class41 field546 = new class41();

	@ObfuscatedName("kb.B")
	public static class41 field547 = new class41();

	@ObfuscatedName("kb.a(II)Lkb;")
	public static class37 method190(int arg0) {
		synchronized (field546) {
			class37 var2 = null;
			if (arg0 == 0 && field542 > 0) {
				field542--;
				var2 = (class37) field545.method219();
			} else if (arg0 == 1 && field543 > 0) {
				field543--;
				var2 = (class37) field546.method219();
			} else if (arg0 == 2 && field544 > 0) {
				field544--;
				var2 = (class37) field547.method219();
			}

			if (var2 != null) {
				var2.field537 = 0;
				return var2;
			}
		}

		class37 var4 = new class37();
		var4.field537 = 0;

		if (arg0 == 0) {
			var4.field536 = new byte[100];
		} else if (arg0 == 1) {
			var4.field536 = new byte[5000];
		} else {
			var4.field536 = new byte[30000];
		}

		return var4;
	}

	@ObfuscatedName("kb.a(I)V")
	public void method191() {
		synchronized (field546) {
			field537 = 0;

			if (field536.length == 100 && field542 < 1000) {
				field545.method217(this);
				field542++;
			} else if (field536.length == 5000 && field543 < 250) {
				field546.method217(this);
				field543++;
			} else if (field536.length == 30000 && field544 < 50) {
				field547.method217(this);
				field544++;
			}
		}
	}

	public class37() {
	}

	public class37(byte[] arg0) {
		field536 = arg0;
		field537 = 0;
	}

	@ObfuscatedName("kb.b(II)V")
	public void method192(int arg0) {
		field536[field537++] = (byte) (arg0 + field541.method238());
	}

	@ObfuscatedName("kb.b(I)V")
	public void method193(int arg0) {
		field536[field537++] = (byte) arg0;
	}

	@ObfuscatedName("kb.c(I)V")
	public void method194(int arg0) {
		field536[field537++] = (byte) (arg0 >> 8);
		field536[field537++] = (byte) arg0;
	}

	@ObfuscatedName("kb.d(I)V")
	public void method195(int arg0) {
		field536[field537++] = (byte) (arg0 >> 16);
		field536[field537++] = (byte) (arg0 >> 8);
		field536[field537++] = (byte) arg0;
	}

	@ObfuscatedName("kb.e(I)V")
	public void method196(int arg0) {
		field536[field537++] = (byte) (arg0 >> 24);
		field536[field537++] = (byte) (arg0 >> 16);
		field536[field537++] = (byte) (arg0 >> 8);
		field536[field537++] = (byte) arg0;
	}

	@ObfuscatedName("kb.a(JI)V")
	public void method197(long arg0) {
		field536[field537++] = (byte) (arg0 >> 56);
		field536[field537++] = (byte) (arg0 >> 48);
		field536[field537++] = (byte) (arg0 >> 40);
		field536[field537++] = (byte) (arg0 >> 32);
		field536[field537++] = (byte) (arg0 >> 24);
		field536[field537++] = (byte) (arg0 >> 16);
		field536[field537++] = (byte) (arg0 >> 8);
		field536[field537++] = (byte) arg0;
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;)V")
	public void method198(String arg0) {
		arg0.getBytes(0, arg0.length(), field536, field537);
		field537 += arg0.length();
		field536[field537++] = 10;
	}

	@ObfuscatedName("kb.a(I[BII)V")
	public void method199(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field536[field537++] = arg0[var4];
		}
	}

	@ObfuscatedName("kb.a(IB)V")
	public void method200(int arg0) {
		field536[field537 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("kb.c()I")
	public int method201() {
		return field536[field537++] & 0xFF;
	}

	@ObfuscatedName("kb.d()B")
	public byte method202() {
		return field536[field537++];
	}

	@ObfuscatedName("kb.e()I")
	public int method203() {
		field537 += 2;
		return ((field536[field537 - 2] & 0xFF) << 8) + (field536[field537 - 1] & 0xFF);
	}

	@ObfuscatedName("kb.f()I")
	public int method204() {
		field537 += 2;
		int var1 = ((field536[field537 - 2] & 0xFF) << 8) + (field536[field537 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("kb.g()I")
	public int method205() {
		field537 += 3;
		return (field536[field537 - 1] & 0xFF) + ((field536[field537 - 3] & 0xFF) << 16) + ((field536[field537 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("kb.h()I")
	public int method206() {
		field537 += 4;
		return (field536[field537 - 1] & 0xFF) + ((field536[field537 - 2] & 0xFF) << 8) + ((field536[field537 - 4] & 0xFF) << 24) + ((field536[field537 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("kb.f(I)J")
	public long method207() {
		long var1 = method206() & 0xFFFFFFFFL;
		long var3 = method206() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("kb.i()Ljava/lang/String;")
	public String method208() {
		int var1 = field537;

		while (field536[field537++] != 10) {
		}

		return new String(field536, var1, field537 - var1 - 1);
	}

	@ObfuscatedName("kb.a(Z)[B")
	public byte[] method209() {
		int var1 = field537;

		while (field536[field537++] != 10) {
		}

		byte[] var2 = new byte[field537 - var1 - 1];
		for (int var3 = var1; var3 < field537 - 1; var3++) {
			var2[var3 - var1] = field536[var3];
		}

		return var2;
	}

	@ObfuscatedName("kb.a([BIII)V")
	public void method210(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field536[field537++];
		}
	}

	@ObfuscatedName("kb.g(I)V")
	public void method211() {
		field538 = field537 * 8;
	}

	@ObfuscatedName("kb.b(IB)I")
	public int method212(int arg0) {
		int var2 = field538 >> 3;
		int var3 = 8 - (field538 & 0x7);
		int var4 = 0;
		field538 += arg0;

		while (arg0 > var3) {
			var4 += (field536[var2++] & field540[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field536[var2] & field540[var3];
		} else {
			var4 += field536[var2] >> var3 - arg0 & field540[arg0];
		}

		return var4;
	}

	@ObfuscatedName("kb.a(B)V")
	public void method213() {
		field537 = (field538 + 7) / 8;
	}

	@ObfuscatedName("kb.j()I")
	public int method214() {
		int var1 = field536[field537] & 0xFF;
		if (var1 < 128) {
			return method201() - 64;
		}

		return method203() - 49152;
	}

	@ObfuscatedName("kb.k()I")
	public int method215() {
		int var1 = field536[field537] & 0xFF;
		if (var1 < 128) {
			return method201();
		}

		return method203() - 32768;
	}

	@ObfuscatedName("kb.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method216(BigInteger arg0, BigInteger arg1) {
		int var3 = field537;
		field537 = 0;
		byte[] var4 = new byte[var3];
		method210(var4, var3, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field537 = 0;
		method193(var7.length);
		method199(var7, 0, var7.length);
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

			field539[var0] = var1;
		}
	}
}
