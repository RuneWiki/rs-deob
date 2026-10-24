package deob;

import java.math.BigInteger;

@ObfuscatedName("lb")
public final class class38 extends class23 {

	@ObfuscatedName("lb.s")
	public byte[] field620;

	@ObfuscatedName("lb.t")
	public int field621;

	@ObfuscatedName("lb.u")
	public int field622;

	@ObfuscatedName("lb.v")
	public static int[] field623 = new int[256];

	@ObfuscatedName("lb.w")
	public static final int[] field624 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("lb.x")
	public class49 field625;

	@ObfuscatedName("lb.y")
	public static int field626;

	@ObfuscatedName("lb.z")
	public static int field627;

	@ObfuscatedName("lb.B")
	public static class41 field629 = new class41();

	@ObfuscatedName("lb.C")
	public static class41 field630 = new class41();

	@ObfuscatedName("lb.D")
	public static class41 field631 = new class41();

	@ObfuscatedName("lb.E")
	public static char[] field632 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("lb.A")
	public static int field628;

	@ObfuscatedName("lb.a(IZ)Llb;")
	public static class38 method217(int arg0) {
		synchronized (field630) {
			class38 var2 = null;
			if (arg0 == 0 && field626 > 0) {
				field626--;
				var2 = (class38) field629.method247();
			} else if (arg0 == 1 && field627 > 0) {
				field627--;
				var2 = (class38) field630.method247();
			} else if (arg0 == 2 && field628 > 0) {
				field628--;
				var2 = (class38) field631.method247();
			}

			if (var2 != null) {
				var2.field621 = 0;
				return var2;
			}
		}

		class38 var4 = new class38();
		var4.field621 = 0;

		if (arg0 == 0) {
			var4.field620 = new byte[100];
		} else if (arg0 == 1) {
			var4.field620 = new byte[5000];
		} else {
			var4.field620 = new byte[30000];
		}

		return var4;
	}

	public class38() {
	}

	public class38(byte[] arg0) {
		field620 = arg0;
		field621 = 0;
	}

	@ObfuscatedName("lb.a(ZI)V")
	public void method218(int arg0) {
		field620[field621++] = (byte) (arg0 + field625.method295());
	}

	@ObfuscatedName("lb.a(I)V")
	public void method219(int arg0) {
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("lb.b(I)V")
	public void method220(int arg0) {
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(II)V")
	public void method221(int arg0) {
		field620[field621++] = (byte) arg0;
		field620[field621++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("lb.c(I)V")
	public void method222(int arg0) {
		field620[field621++] = (byte) (arg0 >> 16);
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("lb.d(I)V")
	public void method223(int arg0) {
		field620[field621++] = (byte) (arg0 >> 24);
		field620[field621++] = (byte) (arg0 >> 16);
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(BI)V")
	public void method224(int arg0) {
		field620[field621++] = (byte) arg0;
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) (arg0 >> 16);
		field620[field621++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("lb.a(IJ)V")
	public void method225(long arg0) {
		field620[field621++] = (byte) (arg0 >> 56);
		field620[field621++] = (byte) (arg0 >> 48);
		field620[field621++] = (byte) (arg0 >> 40);
		field620[field621++] = (byte) (arg0 >> 32);
		field620[field621++] = (byte) (arg0 >> 24);
		field620[field621++] = (byte) (arg0 >> 16);
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;)V")
	public void method226(String arg0) {
		arg0.getBytes(0, arg0.length(), field620, field621);
		field621 += arg0.length();
		field620[field621++] = 10;
	}

	@ObfuscatedName("lb.a(II[BI)V")
	public void method227(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			field620[field621++] = arg2[var4];
		}
	}

	@ObfuscatedName("lb.b(II)V")
	public void method228(int arg0) {
		field620[field621 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("lb.c()I")
	public int method229() {
		return field620[field621++] & 0xFF;
	}

	@ObfuscatedName("lb.d()B")
	public byte method230() {
		return field620[field621++];
	}

	@ObfuscatedName("lb.e()I")
	public int method231() {
		field621 += 2;
		return ((field620[field621 - 2] & 0xFF) << 8) + (field620[field621 - 1] & 0xFF);
	}

	@ObfuscatedName("lb.f()I")
	public int method232() {
		field621 += 2;
		int var1 = ((field620[field621 - 2] & 0xFF) << 8) + (field620[field621 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("lb.g()I")
	public int method233() {
		field621 += 3;
		return (field620[field621 - 1] & 0xFF) + ((field620[field621 - 3] & 0xFF) << 16) + ((field620[field621 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("lb.h()I")
	public int method234() {
		field621 += 4;
		return (field620[field621 - 1] & 0xFF) + ((field620[field621 - 2] & 0xFF) << 8) + ((field620[field621 - 4] & 0xFF) << 24) + ((field620[field621 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("lb.e(I)J")
	public long method235() {
		long var1 = method234() & 0xFFFFFFFFL;
		long var3 = method234() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("lb.i()Ljava/lang/String;")
	public String method236() {
		int var1 = field621;

		while (field620[field621++] != 10) {
		}

		return new String(field620, var1, field621 - var1 - 1);
	}

	@ObfuscatedName("lb.a(B)[B")
	public byte[] method237() {
		int var1 = field621;

		while (field620[field621++] != 10) {
		}

		byte[] var2 = new byte[field621 - var1 - 1];
		for (int var3 = var1; var3 < field621 - 1; var3++) {
			var2[var3 - var1] = field620[var3];
		}

		return var2;
	}

	@ObfuscatedName("lb.a(II[BB)V")
	public void method238(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field620[field621++];
		}
	}

	@ObfuscatedName("lb.f(I)V")
	public void method239() {
		field622 = field621 * 8;
	}

	@ObfuscatedName("lb.c(II)I")
	public int method240(int arg0) {
		int var2 = field622 >> 3;
		int var3 = 8 - (field622 & 0x7);
		int var4 = 0;
		field622 += arg0;

		while (arg0 > var3) {
			var4 += (field620[var2++] & field624[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field620[var2] & field624[var3];
		} else {
			var4 += field620[var2] >> var3 - arg0 & field624[arg0];
		}

		return var4;
	}

	@ObfuscatedName("lb.g(I)V")
	public void method241() {
		field621 = (field622 + 7) / 8;
	}

	@ObfuscatedName("lb.j()I")
	public int method242() {
		int var1 = field620[field621] & 0xFF;
		if (var1 < 128) {
			return method229() - 64;
		}

		return method231() - 49152;
	}

	@ObfuscatedName("lb.k()I")
	public int method243() {
		int var1 = field620[field621] & 0xFF;
		if (var1 < 128) {
			return method229();
		}

		return method231() - 32768;
	}

	@ObfuscatedName("lb.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method244(BigInteger arg0, BigInteger arg1) {
		int var3 = field621;
		field621 = 0;
		byte[] var4 = new byte[var3];
		method238(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		field621 = 0;
		method219(var7.length);
		method227(0, var7.length, var7);
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

			field623[var0] = var1;
		}
	}
}
