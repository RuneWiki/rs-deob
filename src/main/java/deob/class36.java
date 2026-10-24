package deob;

import java.math.BigInteger;

@ObfuscatedName("jb")
public final class class36 extends class29 {

	@ObfuscatedName("jb.o")
	public byte[] field524;

	@ObfuscatedName("jb.p")
	public int field525;

	@ObfuscatedName("jb.q")
	public int field526;

	@ObfuscatedName("jb.r")
	public static int[] field527 = new int[256];

	@ObfuscatedName("jb.s")
	public static final int[] field528 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("jb.t")
	public class45 field529;

	@ObfuscatedName("jb.u")
	public static int field530;

	@ObfuscatedName("jb.v")
	public static int field531;

	@ObfuscatedName("jb.w")
	public static int field532;

	@ObfuscatedName("jb.x")
	public static class40 field533 = new class40();

	@ObfuscatedName("jb.y")
	public static class40 field534 = new class40();

	@ObfuscatedName("jb.z")
	public static class40 field535 = new class40();

	@ObfuscatedName("jb.a(II)Ljb;")
	public static class36 method176(int arg0) {
		synchronized (field534) {
			class36 var2 = null;
			if (arg0 == 0 && field530 > 0) {
				field530--;
				var2 = (class36) field533.method202();
			} else if (arg0 == 1 && field531 > 0) {
				field531--;
				var2 = (class36) field534.method202();
			} else if (arg0 == 2 && field532 > 0) {
				field532--;
				var2 = (class36) field535.method202();
			}

			if (var2 != null) {
				var2.field525 = 0;
				return var2;
			}
		}

		class36 var4 = new class36();
		var4.field525 = 0;

		if (arg0 == 0) {
			var4.field524 = new byte[100];
		} else if (arg0 == 1) {
			var4.field524 = new byte[5000];
		} else {
			var4.field524 = new byte[30000];
		}

		return var4;
	}

	public class36() {
	}

	public class36(byte[] arg0) {
		field524 = arg0;
		field525 = 0;
	}

	@ObfuscatedName("jb.a(ZI)V")
	public void method177(int arg0) {
		field524[field525++] = (byte) (arg0 + field529.method221());
	}

	@ObfuscatedName("jb.a(I)V")
	public void method178(int arg0) {
		field524[field525++] = (byte) arg0;
	}

	@ObfuscatedName("jb.b(I)V")
	public void method179(int arg0) {
		field524[field525++] = (byte) (arg0 >> 8);
		field524[field525++] = (byte) arg0;
	}

	@ObfuscatedName("jb.c(I)V")
	public void method180(int arg0) {
		field524[field525++] = (byte) (arg0 >> 24);
		field524[field525++] = (byte) (arg0 >> 16);
		field524[field525++] = (byte) (arg0 >> 8);
		field524[field525++] = (byte) arg0;
	}

	@ObfuscatedName("jb.a(JI)V")
	public void method181(long arg0) {
		field524[field525++] = (byte) (arg0 >> 56);
		field524[field525++] = (byte) (arg0 >> 48);
		field524[field525++] = (byte) (arg0 >> 40);
		field524[field525++] = (byte) (arg0 >> 32);
		field524[field525++] = (byte) (arg0 >> 24);
		field524[field525++] = (byte) (arg0 >> 16);
		field524[field525++] = (byte) (arg0 >> 8);
		field524[field525++] = (byte) arg0;
	}

	@ObfuscatedName("jb.a(Ljava/lang/String;)V")
	public void method182(String arg0) {
		arg0.getBytes(0, arg0.length(), field524, field525);
		field525 += arg0.length();
		field524[field525++] = 10;
	}

	@ObfuscatedName("jb.a(IZI[B)V")
	public void method183(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			field524[field525++] = arg2[var4];
		}
	}

	@ObfuscatedName("jb.b(II)V")
	public void method184(int arg0) {
		field524[field525 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("jb.c()I")
	public int method185() {
		return field524[field525++] & 0xFF;
	}

	@ObfuscatedName("jb.d()B")
	public byte method186() {
		return field524[field525++];
	}

	@ObfuscatedName("jb.e()I")
	public int method187() {
		field525 += 2;
		return ((field524[field525 - 2] & 0xFF) << 8) + (field524[field525 - 1] & 0xFF);
	}

	@ObfuscatedName("jb.f()I")
	public int method188() {
		field525 += 2;
		int var1 = ((field524[field525 - 2] & 0xFF) << 8) + (field524[field525 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("jb.g()I")
	public int method189() {
		field525 += 3;
		return (field524[field525 - 1] & 0xFF) + ((field524[field525 - 3] & 0xFF) << 16) + ((field524[field525 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("jb.h()I")
	public int method190() {
		field525 += 4;
		return (field524[field525 - 1] & 0xFF) + ((field524[field525 - 2] & 0xFF) << 8) + ((field524[field525 - 4] & 0xFF) << 24) + ((field524[field525 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("jb.d(I)J")
	public long method191() {
		long var1 = method190() & 0xFFFFFFFFL;
		long var3 = method190() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("jb.i()Ljava/lang/String;")
	public String method192() {
		int var1 = field525;

		while (field524[field525++] != 10) {
		}

		return new String(field524, var1, field525 - var1 - 1);
	}

	@ObfuscatedName("jb.a(B)[B")
	public byte[] method193() {
		int var1 = field525;

		while (field524[field525++] != 10) {
		}

		byte[] var2 = new byte[field525 - var1 - 1];
		for (int var3 = var1; var3 < field525 - 1; var3++) {
			var2[var3 - var1] = field524[var3];
		}

		return var2;
	}

	@ObfuscatedName("jb.a(II[BZ)V")
	public void method194(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0; var4 < arg0 + arg1; var4++) {
			arg2[var4] = field524[field525++];
		}
	}

	@ObfuscatedName("jb.e(I)V")
	public void method195() {
		field526 = field525 * 8;
	}

	@ObfuscatedName("jb.c(II)I")
	public int method196(int arg0) {
		int var2 = field526 >> 3;
		int var3 = 8 - (field526 & 0x7);
		int var4 = 0;
		field526 += arg0;

		while (arg0 > var3) {
			var4 += (field524[var2++] & field528[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += field524[var2] & field528[var3];
		} else {
			var4 += field524[var2] >> var3 - arg0 & field528[arg0];
		}

		return var4;
	}

	@ObfuscatedName("jb.f(I)V")
	public void method197() {
		field525 = (field526 + 7) / 8;
	}

	@ObfuscatedName("jb.j()I")
	public int method198() {
		int var1 = field524[field525] & 0xFF;
		if (var1 < 128) {
			return method185() - 64;
		}

		return method187() - 49152;
	}

	@ObfuscatedName("jb.k()I")
	public int method199() {
		int var1 = field524[field525] & 0xFF;
		if (var1 < 128) {
			return method185();
		}

		return method187() - 32768;
	}

	@ObfuscatedName("jb.a(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method200(BigInteger arg0, BigInteger arg1) {
		int var3 = field525;
		field525 = 0;
		byte[] var4 = new byte[var3];
		method194(0, var3, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field525 = 0;
		method178(var7.length);
		method183(var7.length, 0, var7);
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

			field527[var0] = var1;
		}
	}
}
