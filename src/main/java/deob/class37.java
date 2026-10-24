package deob;

import java.math.BigInteger;

@ObfuscatedName("kb")
public final class class37 extends class30 {

	@ObfuscatedName("kb.q")
	public byte[] field542;

	@ObfuscatedName("kb.r")
	public int field543;

	@ObfuscatedName("kb.s")
	public int field544;

	@ObfuscatedName("kb.t")
	public static int[] field545 = new int[256];

	@ObfuscatedName("kb.u")
	public static final int[] field546 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("kb.v")
	public class46 field547;

	@ObfuscatedName("kb.w")
	public static int field548;

	@ObfuscatedName("kb.x")
	public static int field549;

	@ObfuscatedName("kb.y")
	public static int field550;

	@ObfuscatedName("kb.z")
	public static class41 field551 = new class41();

	@ObfuscatedName("kb.A")
	public static class41 field552 = new class41();

	@ObfuscatedName("kb.B")
	public static class41 field553 = new class41();

	@ObfuscatedName("kb.a(IZ)Lkb;")
	public static class37 method203(int arg0) {
		synchronized (field552) {
			class37 var2 = null;
			if (arg0 == 0 && field548 > 0) {
				field548--;
				var2 = (class37) field551.method234();
			} else if (arg0 == 1 && field549 > 0) {
				field549--;
				var2 = (class37) field552.method234();
			} else if (arg0 == 2 && field550 > 0) {
				field550--;
				var2 = (class37) field553.method234();
			}

			if (var2 != null) {
				var2.field543 = 0;
				return var2;
			}
		}

		class37 var4 = new class37();
		var4.field543 = 0;

		if (arg0 == 0) {
			var4.field542 = new byte[100];
		} else if (arg0 == 1) {
			var4.field542 = new byte[5000];
		} else {
			var4.field542 = new byte[30000];
		}

		return var4;
	}

	@ObfuscatedName("kb.a(I)V")
	public void method204() {
		synchronized (field552) {
			field543 = 0;

			if (field542.length == 100 && field548 < 1000) {
				field551.method232(this);
				field548++;
			} else if (field542.length == 5000 && field549 < 250) {
				field552.method232(this);
				field549++;
			} else if (field542.length == 30000 && field550 < 50) {
				field553.method232(this);
				field550++;
			}
		}
	}

	public class37() {
	}

	public class37(byte[] arg0) {
		field542 = arg0;
		field543 = 0;
	}

	@ObfuscatedName("kb.a(II)V")
	public void method205(int arg0) {
		field542[field543++] = (byte) (arg0 + field547.method253());
	}

	@ObfuscatedName("kb.b(I)V")
	public void method206(int arg0) {
		field542[field543++] = (byte) arg0;
	}

	@ObfuscatedName("kb.c(I)V")
	public void method207(int arg0) {
		field542[field543++] = (byte) (arg0 >> 8);
		field542[field543++] = (byte) arg0;
	}

	@ObfuscatedName("kb.b(II)V")
	public void method208(int arg0) {
		field542[field543++] = (byte) arg0;
		field542[field543++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("kb.d(I)V")
	public void method209(int arg0) {
		field542[field543++] = (byte) (arg0 >> 16);
		field542[field543++] = (byte) (arg0 >> 8);
		field542[field543++] = (byte) arg0;
	}

	@ObfuscatedName("kb.e(I)V")
	public void method210(int arg0) {
		field542[field543++] = (byte) (arg0 >> 24);
		field542[field543++] = (byte) (arg0 >> 16);
		field542[field543++] = (byte) (arg0 >> 8);
		field542[field543++] = (byte) arg0;
	}

	@ObfuscatedName("kb.b(IZ)V")
	public void method211(int arg0) {
		field542[field543++] = (byte) arg0;
		field542[field543++] = (byte) (arg0 >> 8);
		field542[field543++] = (byte) (arg0 >> 16);
		field542[field543++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("kb.a(IJ)V")
	public void method212(long arg0) {
		field542[field543++] = (byte) (arg0 >> 56);
		field542[field543++] = (byte) (arg0 >> 48);
		field542[field543++] = (byte) (arg0 >> 40);
		field542[field543++] = (byte) (arg0 >> 32);
		field542[field543++] = (byte) (arg0 >> 24);
		field542[field543++] = (byte) (arg0 >> 16);
		field542[field543++] = (byte) (arg0 >> 8);
		field542[field543++] = (byte) arg0;
	}

	@ObfuscatedName("kb.a(Ljava/lang/String;)V")
	public void method213(String arg0) {
		arg0.getBytes(0, arg0.length(), field542, field543);
		field543 += arg0.length();
		field542[field543++] = 10;
	}

	@ObfuscatedName("kb.a(ZI[BI)V")
	public void method214(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field542[field543++] = arg1[var4];
		}
	}

	@ObfuscatedName("kb.c(II)V")
	public void method215(int arg0) {
		field542[field543 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("kb.c()I")
	public int method216() {
		return field542[field543++] & 0xFF;
	}

	@ObfuscatedName("kb.d()B")
	public byte method217() {
		return field542[field543++];
	}

	@ObfuscatedName("kb.e()I")
	public int method218() {
		field543 += 2;
		return ((field542[field543 - 2] & 0xFF) << 8) + (field542[field543 - 1] & 0xFF);
	}

	@ObfuscatedName("kb.f()I")
	public int method219() {
		field543 += 2;
		int var1 = ((field542[field543 - 2] & 0xFF) << 8) + (field542[field543 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("kb.g()I")
	public int method220() {
		field543 += 3;
		return (field542[field543 - 1] & 0xFF) + ((field542[field543 - 3] & 0xFF) << 16) + ((field542[field543 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("kb.h()I")
	public int method221() {
		field543 += 4;
		return (field542[field543 - 1] & 0xFF) + ((field542[field543 - 2] & 0xFF) << 8) + ((field542[field543 - 4] & 0xFF) << 24) + ((field542[field543 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("kb.f(I)J")
	public long method222() {
		long var1 = method221() & 0xFFFFFFFFL;
		long var3 = method221() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("kb.i()Ljava/lang/String;")
	public String method223() {
		int var1 = field543;

		while (field542[field543++] != 10) {
		}

		return new String(field542, var1, field543 - var1 - 1);
	}

	@ObfuscatedName("kb.g(I)[B")
	public byte[] method224() {
		int var1 = field543;

		while (field542[field543++] != 10) {
		}

		byte[] var2 = new byte[field543 - var1 - 1];
		for (int var3 = var1; var3 < field543 - 1; var3++) {
			var2[var3 - var1] = field542[var3];
		}

		return var2;
	}

	@ObfuscatedName("kb.a(II[BI)V")
	public void method225(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field542[field543++];
		}
	}

	@ObfuscatedName("kb.h(I)V")
	public void method226() {
		field544 = field543 * 8;
	}

	@ObfuscatedName("kb.a(ZI)I")
	public int method227(int arg0) {
		int var2 = field544 >> 3;
		int var3 = 8 - (field544 & 0x7);
		int var4 = 0;
		field544 += arg0;

		while (arg0 > var3) {
			var4 += (field542[var2++] & field546[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field542[var2] & field546[var3];
		} else {
			var4 += field542[var2] >> var3 - arg0 & field546[arg0];
		}

		return var4;
	}

	@ObfuscatedName("kb.a(B)V")
	public void method228() {
		field543 = (field544 + 7) / 8;
	}

	@ObfuscatedName("kb.j()I")
	public int method229() {
		int var1 = field542[field543] & 0xFF;
		if (var1 < 128) {
			return method216() - 64;
		}

		return method218() - 49152;
	}

	@ObfuscatedName("kb.k()I")
	public int method230() {
		int var1 = field542[field543] & 0xFF;
		if (var1 < 128) {
			return method216();
		}

		return method218() - 32768;
	}

	@ObfuscatedName("kb.a(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method231(BigInteger arg0, BigInteger arg1) {
		int var3 = field543;
		field543 = 0;
		byte[] var4 = new byte[var3];
		method225(0, var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field543 = 0;
		method206(var7.length);
		method214(var7.length, var7, 0);
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

			field545[var0] = var1;
		}
	}
}
