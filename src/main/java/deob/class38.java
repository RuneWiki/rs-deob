package deob;

import java.math.BigInteger;

@ObfuscatedName("lb")
public final class class38 extends class23 {

	@ObfuscatedName("lb.w")
	public byte[] field616;

	@ObfuscatedName("lb.x")
	public int field617;

	@ObfuscatedName("lb.y")
	public int field618;

	@ObfuscatedName("lb.z")
	public static int[] field619 = new int[256];

	@ObfuscatedName("lb.A")
	public static final int[] field620 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("lb.F")
	public static class41 field625 = new class41();

	@ObfuscatedName("lb.G")
	public static class41 field626 = new class41();

	@ObfuscatedName("lb.H")
	public static class41 field627 = new class41();

	@ObfuscatedName("lb.I")
	public static char[] field628 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("lb.C")
	public static int field622;

	@ObfuscatedName("lb.D")
	public static int field623;

	@ObfuscatedName("lb.E")
	public static int field624;

	@ObfuscatedName("lb.B")
	public class49 field621;

	@ObfuscatedName("lb.a(II)Llb;")
	public static class38 method213(int arg0) {
		synchronized (field626) {
			class38 var2 = null;
			if (arg0 == 0 && field622 > 0) {
				field622--;
				var2 = (class38) field625.method243();
			} else if (arg0 == 1 && field623 > 0) {
				field623--;
				var2 = (class38) field626.method243();
			} else if (arg0 == 2 && field624 > 0) {
				field624--;
				var2 = (class38) field627.method243();
			}

			if (var2 != null) {
				var2.field617 = 0;
				return var2;
			}
		}

		class38 var4 = new class38();
		var4.field617 = 0;

		if (arg0 == 0) {
			var4.field616 = new byte[100];
		} else if (arg0 == 1) {
			var4.field616 = new byte[5000];
		} else {
			var4.field616 = new byte[30000];
		}

		return var4;
	}

	public class38() {
	}

	public class38(byte[] arg0) {
		field616 = arg0;
		field617 = 0;
	}

	@ObfuscatedName("lb.b(II)V")
	public void method214(int arg0) {
		field616[field617++] = (byte) (arg0 + field621.method291());
	}

	@ObfuscatedName("lb.a(I)V")
	public void method215(int arg0) {
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("lb.b(I)V")
	public void method216(int arg0) {
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("lb.c(II)V")
	public void method217(int arg0) {
		field616[field617++] = (byte) arg0;
		field616[field617++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("lb.c(I)V")
	public void method218(int arg0) {
		field616[field617++] = (byte) (arg0 >> 16);
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("lb.d(I)V")
	public void method219(int arg0) {
		field616[field617++] = (byte) (arg0 >> 24);
		field616[field617++] = (byte) (arg0 >> 16);
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("lb.d(II)V")
	public void method220(int arg0) {
		field616[field617++] = (byte) arg0;
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) (arg0 >> 16);
		field616[field617++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("lb.a(IJ)V")
	public void method221(long arg0) {
		field616[field617++] = (byte) (arg0 >> 56);
		field616[field617++] = (byte) (arg0 >> 48);
		field616[field617++] = (byte) (arg0 >> 40);
		field616[field617++] = (byte) (arg0 >> 32);
		field616[field617++] = (byte) (arg0 >> 24);
		field616[field617++] = (byte) (arg0 >> 16);
		field616[field617++] = (byte) (arg0 >> 8);
		field616[field617++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;)V")
	public void method222(String arg0) {
		arg0.getBytes(0, arg0.length(), field616, field617);
		field617 += arg0.length();
		field616[field617++] = 10;
	}

	@ObfuscatedName("lb.a([BIII)V")
	public void method223(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field616[field617++] = arg0[var4];
		}
	}

	@ObfuscatedName("lb.a(IZ)V")
	public void method224(int arg0) {
		field616[field617 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("lb.c()I")
	public int method225() {
		return field616[field617++] & 0xFF;
	}

	@ObfuscatedName("lb.d()B")
	public byte method226() {
		return field616[field617++];
	}

	@ObfuscatedName("lb.e()I")
	public int method227() {
		field617 += 2;
		return ((field616[field617 - 2] & 0xFF) << 8) + (field616[field617 - 1] & 0xFF);
	}

	@ObfuscatedName("lb.f()I")
	public int method228() {
		field617 += 2;
		int var1 = ((field616[field617 - 2] & 0xFF) << 8) + (field616[field617 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("lb.g()I")
	public int method229() {
		field617 += 3;
		return (field616[field617 - 1] & 0xFF) + ((field616[field617 - 3] & 0xFF) << 16) + ((field616[field617 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("lb.h()I")
	public int method230() {
		field617 += 4;
		return (field616[field617 - 1] & 0xFF) + ((field616[field617 - 2] & 0xFF) << 8) + ((field616[field617 - 4] & 0xFF) << 24) + ((field616[field617 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("lb.a(Z)J")
	public long method231() {
		long var1 = method230() & 0xFFFFFFFFL;
		long var3 = method230() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("lb.i()Ljava/lang/String;")
	public String method232() {
		int var1 = field617;

		while (field616[field617++] != 10) {
		}

		return new String(field616, var1, field617 - var1 - 1);
	}

	@ObfuscatedName("lb.e(I)[B")
	public byte[] method233() {
		int var1 = field617;

		while (field616[field617++] != 10) {
		}

		byte[] var2 = new byte[field617 - var1 - 1];
		for (int var3 = var1; var3 < field617 - 1; var3++) {
			var2[var3 - var1] = field616[var3];
		}

		return var2;
	}

	@ObfuscatedName("lb.a(III[B)V")
	public void method234(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field616[field617++];
		}
	}

	@ObfuscatedName("lb.b(Z)V")
	public void method235() {
		field618 = field617 * 8;
	}

	@ObfuscatedName("lb.e(II)I")
	public int method236(int arg0) {
		int var2 = field618 >> 3;
		int var3 = 8 - (field618 & 0x7);
		int var4 = 0;
		field618 += arg0;

		while (arg0 > var3) {
			var4 += (field616[var2++] & field620[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field616[var2] & field620[var3];
		} else {
			var4 += field616[var2] >> var3 - arg0 & field620[arg0];
		}

		return var4;
	}

	@ObfuscatedName("lb.f(I)V")
	public void method237() {
		field617 = (field618 + 7) / 8;
	}

	@ObfuscatedName("lb.j()I")
	public int method238() {
		int var1 = field616[field617] & 0xFF;
		if (var1 < 128) {
			return method225() - 64;
		}

		return method227() - 49152;
	}

	@ObfuscatedName("lb.k()I")
	public int method239() {
		int var1 = field616[field617] & 0xFF;
		if (var1 < 128) {
			return method225();
		}

		return method227() - 32768;
	}

	@ObfuscatedName("lb.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method240(BigInteger arg0, BigInteger arg1) {
		int var3 = field617;
		field617 = 0;
		byte[] var4 = new byte[var3];
		method234(0, var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field617 = 0;
		method215(var7.length);
		method223(var7, 0, var7.length);
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

			field619[var0] = var1;
		}
	}
}
