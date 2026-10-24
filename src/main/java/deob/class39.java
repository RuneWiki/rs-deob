package deob;

import java.math.BigInteger;

@ObfuscatedName("mb")
public final class class39 extends class23 {

	@ObfuscatedName("mb.n")
	public byte[] field624;

	@ObfuscatedName("mb.o")
	public int field625;

	@ObfuscatedName("mb.p")
	public int field626;

	@ObfuscatedName("mb.q")
	public static int[] field627 = new int[256];

	@ObfuscatedName("mb.r")
	public static final int[] field628 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("mb.s")
	public class50 field629;

	@ObfuscatedName("mb.t")
	public static int field630;

	@ObfuscatedName("mb.u")
	public static int field631;

	@ObfuscatedName("mb.v")
	public static int field632;

	@ObfuscatedName("mb.w")
	public static class42 field633 = new class42();

	@ObfuscatedName("mb.x")
	public static class42 field634 = new class42();

	@ObfuscatedName("mb.y")
	public static class42 field635 = new class42();

	@ObfuscatedName("mb.z")
	public char[] field636 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("mb.a(II)Lmb;")
	public static class39 method216(int arg0) {
		synchronized (field634) {
			class39 var2 = null;
			if (arg0 == 0 && field630 > 0) {
				field630--;
				var2 = (class39) field633.method246();
			} else if (arg0 == 1 && field631 > 0) {
				field631--;
				var2 = (class39) field634.method246();
			} else if (arg0 == 2 && field632 > 0) {
				field632--;
				var2 = (class39) field635.method246();
			}

			if (var2 != null) {
				var2.field625 = 0;
				return var2;
			}
		}

		class39 var4 = new class39();
		var4.field625 = 0;

		if (arg0 == 0) {
			var4.field624 = new byte[100];
		} else if (arg0 == 1) {
			var4.field624 = new byte[5000];
		} else {
			var4.field624 = new byte[30000];
		}

		return var4;
	}

	public class39() {
	}

	public class39(byte[] arg0) {
		field624 = arg0;
		field625 = 0;
	}

	@ObfuscatedName("mb.a(IB)V")
	public void method217(int arg0) {
		field624[field625++] = (byte) (arg0 + field629.method294());
	}

	@ObfuscatedName("mb.a(I)V")
	public void method218(int arg0) {
		field624[field625++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(I)V")
	public void method219(int arg0) {
		field624[field625++] = (byte) (arg0 >> 8);
		field624[field625++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(II)V")
	public void method220(int arg0) {
		field624[field625++] = (byte) arg0;
		field624[field625++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("mb.c(I)V")
	public void method221(int arg0) {
		field624[field625++] = (byte) (arg0 >> 16);
		field624[field625++] = (byte) (arg0 >> 8);
		field624[field625++] = (byte) arg0;
	}

	@ObfuscatedName("mb.d(I)V")
	public void method222(int arg0) {
		field624[field625++] = (byte) (arg0 >> 24);
		field624[field625++] = (byte) (arg0 >> 16);
		field624[field625++] = (byte) (arg0 >> 8);
		field624[field625++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(IB)V")
	public void method223(int arg0) {
		field624[field625++] = (byte) arg0;
		field624[field625++] = (byte) (arg0 >> 8);
		field624[field625++] = (byte) (arg0 >> 16);
		field624[field625++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("mb.a(JI)V")
	public void method224(long arg0) {
		field624[field625++] = (byte) (arg0 >> 56);
		field624[field625++] = (byte) (arg0 >> 48);
		field624[field625++] = (byte) (arg0 >> 40);
		field624[field625++] = (byte) (arg0 >> 32);
		field624[field625++] = (byte) (arg0 >> 24);
		field624[field625++] = (byte) (arg0 >> 16);
		field624[field625++] = (byte) (arg0 >> 8);
		field624[field625++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(Ljava/lang/String;)V")
	public void method225(String arg0) {
		arg0.getBytes(0, arg0.length(), field624, field625);
		field625 += arg0.length();
		field624[field625++] = 10;
	}

	@ObfuscatedName("mb.a(II[BI)V")
	public void method226(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field624[field625++] = arg1[var4];
		}
	}

	@ObfuscatedName("mb.a(BI)V")
	public void method227(int arg0) {
		field624[field625 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("mb.c()I")
	public int method228() {
		return field624[field625++] & 0xFF;
	}

	@ObfuscatedName("mb.d()B")
	public byte method229() {
		return field624[field625++];
	}

	@ObfuscatedName("mb.e()I")
	public int method230() {
		field625 += 2;
		return ((field624[field625 - 2] & 0xFF) << 8) + (field624[field625 - 1] & 0xFF);
	}

	@ObfuscatedName("mb.f()I")
	public int method231() {
		field625 += 2;
		int var1 = ((field624[field625 - 2] & 0xFF) << 8) + (field624[field625 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("mb.g()I")
	public int method232() {
		field625 += 3;
		return (field624[field625 - 1] & 0xFF) + ((field624[field625 - 3] & 0xFF) << 16) + ((field624[field625 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("mb.h()I")
	public int method233() {
		field625 += 4;
		return (field624[field625 - 1] & 0xFF) + ((field624[field625 - 2] & 0xFF) << 8) + ((field624[field625 - 4] & 0xFF) << 24) + ((field624[field625 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("mb.e(I)J")
	public long method234() {
		long var1 = method233() & 0xFFFFFFFFL;
		long var3 = method233() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("mb.i()Ljava/lang/String;")
	public String method235() {
		int var1 = field625;

		while (field624[field625++] != 10) {
		}

		return new String(field624, var1, field625 - var1 - 1);
	}

	@ObfuscatedName("mb.f(I)[B")
	public byte[] method236() {
		int var1 = field625;

		while (field624[field625++] != 10) {
		}

		byte[] var2 = new byte[field625 - var1 - 1];
		for (int var3 = var1; var3 < field625 - 1; var3++) {
			var2[var3 - var1] = field624[var3];
		}

		return var2;
	}

	@ObfuscatedName("mb.a(IZI[B)V")
	public void method237(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field624[field625++];
		}
	}

	@ObfuscatedName("mb.g(I)V")
	public void method238() {
		field626 = field625 * 8;
	}

	@ObfuscatedName("mb.c(II)I")
	public int method239(int arg0) {
		int var2 = field626 >> 3;
		int var3 = 8 - (field626 & 0x7);
		int var4 = 0;
		field626 += arg0;

		while (arg0 > var3) {
			var4 += (field624[var2++] & field628[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field624[var2] & field628[var3];
		} else {
			var4 += field624[var2] >> var3 - arg0 & field628[arg0];
		}

		return var4;
	}

	@ObfuscatedName("mb.a(Z)V")
	public void method240() {
		field625 = (field626 + 7) / 8;
	}

	@ObfuscatedName("mb.j()I")
	public int method241() {
		int var1 = field624[field625] & 0xFF;
		if (var1 < 128) {
			return method228() - 64;
		}

		return method230() - 49152;
	}

	@ObfuscatedName("mb.k()I")
	public int method242() {
		int var1 = field624[field625] & 0xFF;
		if (var1 < 128) {
			return method228();
		}

		return method230() - 32768;
	}

	@ObfuscatedName("mb.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method243(BigInteger arg0, BigInteger arg1) {
		int var3 = field625;
		field625 = 0;
		byte[] var4 = new byte[var3];
		method237(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field625 = 0;
		method218(var7.length);
		method226(0, var7, var7.length);
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

			field627[var0] = var1;
		}
	}
}
