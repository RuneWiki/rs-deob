package deob;

import java.math.BigInteger;

@ObfuscatedName("lb")
public final class class38 extends class23 {

	@ObfuscatedName("lb.v")
	public byte[] field615;

	@ObfuscatedName("lb.w")
	public int field616;

	@ObfuscatedName("lb.x")
	public int field617;

	@ObfuscatedName("lb.y")
	public static int[] field618 = new int[256];

	@ObfuscatedName("lb.z")
	public static final int[] field619 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("lb.H")
	public char[] field627 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("lb.E")
	public static class41 field624 = new class41();

	@ObfuscatedName("lb.F")
	public static class41 field625 = new class41();

	@ObfuscatedName("lb.G")
	public static class41 field626 = new class41();

	@ObfuscatedName("lb.B")
	public static int field621;

	@ObfuscatedName("lb.C")
	public static int field622;

	@ObfuscatedName("lb.D")
	public static int field623;

	@ObfuscatedName("lb.A")
	public class49 field620;

	@ObfuscatedName("lb.a(IB)Llb;")
	public static class38 method212(int arg0) {
		synchronized (field625) {
			class38 var2 = null;
			if (arg0 == 0 && field621 > 0) {
				field621--;
				var2 = (class38) field624.method242();
			} else if (arg0 == 1 && field622 > 0) {
				field622--;
				var2 = (class38) field625.method242();
			} else if (arg0 == 2 && field623 > 0) {
				field623--;
				var2 = (class38) field626.method242();
			}

			if (var2 != null) {
				var2.field616 = 0;
				return var2;
			}
		}

		class38 var4 = new class38();
		var4.field616 = 0;

		if (arg0 == 0) {
			var4.field615 = new byte[100];
		} else if (arg0 == 1) {
			var4.field615 = new byte[5000];
		} else {
			var4.field615 = new byte[30000];
		}

		return var4;
	}

	public class38() {
	}

	public class38(byte[] arg0) {
		field615 = arg0;
		field616 = 0;
	}

	@ObfuscatedName("lb.b(IB)V")
	public void method213(int arg0) {
		field615[field616++] = (byte) (arg0 + field620.method290());
	}

	@ObfuscatedName("lb.a(I)V")
	public void method214(int arg0) {
		field615[field616++] = (byte) arg0;
	}

	@ObfuscatedName("lb.b(I)V")
	public void method215(int arg0) {
		field615[field616++] = (byte) (arg0 >> 8);
		field615[field616++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(II)V")
	public void method216(int arg0) {
		field615[field616++] = (byte) arg0;
		field615[field616++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("lb.c(I)V")
	public void method217(int arg0) {
		field615[field616++] = (byte) (arg0 >> 16);
		field615[field616++] = (byte) (arg0 >> 8);
		field615[field616++] = (byte) arg0;
	}

	@ObfuscatedName("lb.d(I)V")
	public void method218(int arg0) {
		field615[field616++] = (byte) (arg0 >> 24);
		field615[field616++] = (byte) (arg0 >> 16);
		field615[field616++] = (byte) (arg0 >> 8);
		field615[field616++] = (byte) arg0;
	}

	@ObfuscatedName("lb.c(IB)V")
	public void method219(int arg0) {
		field615[field616++] = (byte) arg0;
		field615[field616++] = (byte) (arg0 >> 8);
		field615[field616++] = (byte) (arg0 >> 16);
		field615[field616++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("lb.a(JZ)V")
	public void method220(long arg0) {
		field615[field616++] = (byte) (arg0 >> 56);
		field615[field616++] = (byte) (arg0 >> 48);
		field615[field616++] = (byte) (arg0 >> 40);
		field615[field616++] = (byte) (arg0 >> 32);
		field615[field616++] = (byte) (arg0 >> 24);
		field615[field616++] = (byte) (arg0 >> 16);
		field615[field616++] = (byte) (arg0 >> 8);
		field615[field616++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(Ljava/lang/String;)V")
	public void method221(String arg0) {
		arg0.getBytes(0, arg0.length(), field615, field616);
		field616 += arg0.length();
		field615[field616++] = 10;
	}

	@ObfuscatedName("lb.a(I[BII)V")
	public void method222(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			field615[field616++] = arg0[var4];
		}
	}

	@ObfuscatedName("lb.b(II)V")
	public void method223(int arg0) {
		field615[field616 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("lb.c()I")
	public int method224() {
		return field615[field616++] & 0xFF;
	}

	@ObfuscatedName("lb.d()B")
	public byte method225() {
		return field615[field616++];
	}

	@ObfuscatedName("lb.e()I")
	public int method226() {
		field616 += 2;
		return ((field615[field616 - 2] & 0xFF) << 8) + (field615[field616 - 1] & 0xFF);
	}

	@ObfuscatedName("lb.f()I")
	public int method227() {
		field616 += 2;
		int var1 = ((field615[field616 - 2] & 0xFF) << 8) + (field615[field616 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("lb.g()I")
	public int method228() {
		field616 += 3;
		return (field615[field616 - 1] & 0xFF) + ((field615[field616 - 3] & 0xFF) << 16) + ((field615[field616 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("lb.h()I")
	public int method229() {
		field616 += 4;
		return (field615[field616 - 1] & 0xFF) + ((field615[field616 - 2] & 0xFF) << 8) + ((field615[field616 - 4] & 0xFF) << 24) + ((field615[field616 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("lb.e(I)J")
	public long method230() {
		long var1 = method229() & 0xFFFFFFFFL;
		long var3 = method229() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("lb.i()Ljava/lang/String;")
	public String method231() {
		int var1 = field616;

		while (field615[field616++] != 10) {
		}

		return new String(field615, var1, field616 - var1 - 1);
	}

	@ObfuscatedName("lb.f(I)[B")
	public byte[] method232() {
		int var1 = field616;

		while (field615[field616++] != 10) {
		}

		byte[] var2 = new byte[field616 - var1 - 1];
		for (int var3 = var1; var3 < field616 - 1; var3++) {
			var2[var3 - var1] = field615[var3];
		}

		return var2;
	}

	@ObfuscatedName("lb.a(III[B)V")
	public void method233(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field615[field616++];
		}
	}

	@ObfuscatedName("lb.g(I)V")
	public void method234() {
		field617 = field616 * 8;
	}

	@ObfuscatedName("lb.c(II)I")
	public int method235(int arg0) {
		int var2 = field617 >> 3;
		int var3 = 8 - (field617 & 0x7);
		int var4 = 0;
		field617 += arg0;

		while (arg0 > var3) {
			var4 += (field615[var2++] & field619[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field615[var2] & field619[var3];
		} else {
			var4 += field615[var2] >> var3 - arg0 & field619[arg0];
		}

		return var4;
	}

	@ObfuscatedName("lb.h(I)V")
	public void method236() {
		field616 = (field617 + 7) / 8;
	}

	@ObfuscatedName("lb.j()I")
	public int method237() {
		int var1 = field615[field616] & 0xFF;
		if (var1 < 128) {
			return method224() - 64;
		}

		return method226() - 49152;
	}

	@ObfuscatedName("lb.k()I")
	public int method238() {
		int var1 = field615[field616] & 0xFF;
		if (var1 < 128) {
			return method224();
		}

		return method226() - 32768;
	}

	@ObfuscatedName("lb.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method239(BigInteger arg0, BigInteger arg1) {
		int var3 = field616;
		field616 = 0;
		byte[] var4 = new byte[var3];
		method233(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field616 = 0;
		method214(var7.length);
		method222(var7, 0, var7.length);
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

			field618[var0] = var1;
		}
	}
}
