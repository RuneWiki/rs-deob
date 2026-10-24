package deob;

import java.math.BigInteger;

@ObfuscatedName("mb")
public final class class39 extends class24 {

	@ObfuscatedName("mb.l")
	public byte[] field610;

	@ObfuscatedName("mb.m")
	public int field611;

	@ObfuscatedName("mb.n")
	public int field612;

	@ObfuscatedName("mb.o")
	public static int[] field613 = new int[256];

	@ObfuscatedName("mb.p")
	public static final int[] field614 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("mb.q")
	public class50 field615;

	@ObfuscatedName("mb.r")
	public static int field616;

	@ObfuscatedName("mb.s")
	public static int field617;

	@ObfuscatedName("mb.t")
	public static int field618;

	@ObfuscatedName("mb.u")
	public static class42 field619 = new class42();

	@ObfuscatedName("mb.v")
	public static class42 field620 = new class42();

	@ObfuscatedName("mb.w")
	public static class42 field621 = new class42();

	@ObfuscatedName("mb.a(II)Lmb;")
	public static class39 method218(int arg0) {
		synchronized (field620) {
			class39 var2 = null;
			if (arg0 == 0 && field616 > 0) {
				field616--;
				var2 = (class39) field619.method249();
			} else if (arg0 == 1 && field617 > 0) {
				field617--;
				var2 = (class39) field620.method249();
			} else if (arg0 == 2 && field618 > 0) {
				field618--;
				var2 = (class39) field621.method249();
			}

			if (var2 != null) {
				var2.field611 = 0;
				return var2;
			}
		}

		class39 var4 = new class39();
		var4.field611 = 0;

		if (arg0 == 0) {
			var4.field610 = new byte[100];
		} else if (arg0 == 1) {
			var4.field610 = new byte[5000];
		} else {
			var4.field610 = new byte[30000];
		}

		return var4;
	}

	@ObfuscatedName("mb.a(I)V")
	public void method219() {
		synchronized (field620) {
			field611 = 0;

			if (field610.length == 100 && field616 < 1000) {
				field619.method247(this);
				field616++;
			} else if (field610.length == 5000 && field617 < 250) {
				field620.method247(this);
				field617++;
			} else if (field610.length == 30000 && field618 < 50) {
				field621.method247(this);
				field618++;
			}
		}
	}

	public class39() {
	}

	public class39(byte[] arg0) {
		field610 = arg0;
		field611 = 0;
	}

	@ObfuscatedName("mb.a(BI)V")
	public void method220(int arg0) {
		field610[field611++] = (byte) (arg0 + field615.method295());
	}

	@ObfuscatedName("mb.b(I)V")
	public void method221(int arg0) {
		field610[field611++] = (byte) arg0;
	}

	@ObfuscatedName("mb.c(I)V")
	public void method222(int arg0) {
		field610[field611++] = (byte) (arg0 >> 8);
		field610[field611++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(II)V")
	public void method223(int arg0) {
		field610[field611++] = (byte) arg0;
		field610[field611++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("mb.d(I)V")
	public void method224(int arg0) {
		field610[field611++] = (byte) (arg0 >> 16);
		field610[field611++] = (byte) (arg0 >> 8);
		field610[field611++] = (byte) arg0;
	}

	@ObfuscatedName("mb.e(I)V")
	public void method225(int arg0) {
		field610[field611++] = (byte) (arg0 >> 24);
		field610[field611++] = (byte) (arg0 >> 16);
		field610[field611++] = (byte) (arg0 >> 8);
		field610[field611++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(ZI)V")
	public void method226(int arg0) {
		field610[field611++] = (byte) arg0;
		field610[field611++] = (byte) (arg0 >> 8);
		field610[field611++] = (byte) (arg0 >> 16);
		field610[field611++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("mb.a(JZ)V")
	public void method227(long arg0) {
		field610[field611++] = (byte) (arg0 >> 56);
		field610[field611++] = (byte) (arg0 >> 48);
		field610[field611++] = (byte) (arg0 >> 40);
		field610[field611++] = (byte) (arg0 >> 32);
		field610[field611++] = (byte) (arg0 >> 24);
		field610[field611++] = (byte) (arg0 >> 16);
		field610[field611++] = (byte) (arg0 >> 8);
		field610[field611++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(Ljava/lang/String;)V")
	public void method228(String arg0) {
		arg0.getBytes(0, arg0.length(), field610, field611);
		field611 += arg0.length();
		field610[field611++] = 10;
	}

	@ObfuscatedName("mb.a(I[BBI)V")
	public void method229(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			field610[field611++] = arg1[var4];
		}
	}

	@ObfuscatedName("mb.c(II)V")
	public void method230(int arg0) {
		field610[field611 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("mb.c()I")
	public int method231() {
		return field610[field611++] & 0xFF;
	}

	@ObfuscatedName("mb.d()B")
	public byte method232() {
		return field610[field611++];
	}

	@ObfuscatedName("mb.e()I")
	public int method233() {
		field611 += 2;
		return ((field610[field611 - 2] & 0xFF) << 8) + (field610[field611 - 1] & 0xFF);
	}

	@ObfuscatedName("mb.f()I")
	public int method234() {
		field611 += 2;
		int var1 = ((field610[field611 - 2] & 0xFF) << 8) + (field610[field611 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("mb.g()I")
	public int method235() {
		field611 += 3;
		return (field610[field611 - 1] & 0xFF) + ((field610[field611 - 3] & 0xFF) << 16) + ((field610[field611 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("mb.h()I")
	public int method236() {
		field611 += 4;
		return (field610[field611 - 1] & 0xFF) + ((field610[field611 - 2] & 0xFF) << 8) + ((field610[field611 - 4] & 0xFF) << 24) + ((field610[field611 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("mb.f(I)J")
	public long method237() {
		long var1 = method236() & 0xFFFFFFFFL;
		long var3 = method236() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("mb.i()Ljava/lang/String;")
	public String method238() {
		int var1 = field611;

		while (field610[field611++] != 10) {
		}

		return new String(field610, var1, field611 - var1 - 1);
	}

	@ObfuscatedName("mb.a(Z)[B")
	public byte[] method239() {
		int var1 = field611;

		while (field610[field611++] != 10) {
		}

		byte[] var2 = new byte[field611 - var1 - 1];
		for (int var3 = var1; var3 < field611 - 1; var3++) {
			var2[var3 - var1] = field610[var3];
		}

		return var2;
	}

	@ObfuscatedName("mb.a(I[BIZ)V")
	public void method240(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0; var4 < arg0 + arg2; var4++) {
			arg1[var4] = field610[field611++];
		}
	}

	@ObfuscatedName("mb.g(I)V")
	public void method241() {
		field612 = field611 * 8;
	}

	@ObfuscatedName("mb.d(II)I")
	public int method242(int arg0) {
		int var2 = field612 >> 3;
		int var3 = 8 - (field612 & 0x7);
		int var4 = 0;
		field612 += arg0;

		while (arg0 > var3) {
			var4 += (field610[var2++] & field614[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field610[var2] & field614[var3];
		} else {
			var4 += field610[var2] >> var3 - arg0 & field614[arg0];
		}

		return var4;
	}

	@ObfuscatedName("mb.a(B)V")
	public void method243() {
		field611 = (field612 + 7) / 8;
	}

	@ObfuscatedName("mb.j()I")
	public int method244() {
		int var1 = field610[field611] & 0xFF;
		if (var1 < 128) {
			return method231() - 64;
		}

		return method233() - 49152;
	}

	@ObfuscatedName("mb.k()I")
	public int method245() {
		int var1 = field610[field611] & 0xFF;
		if (var1 < 128) {
			return method231();
		}

		return method233() - 32768;
	}

	@ObfuscatedName("mb.a(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method246(BigInteger arg0, BigInteger arg1) {
		int var3 = field611;
		field611 = 0;
		byte[] var4 = new byte[var3];
		method240(0, var4, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field611 = 0;
		method221(var7.length);
		method229(0, var7, var7.length);
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

			field613[var0] = var1;
		}
	}
}
