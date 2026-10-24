package deob;

import java.math.BigInteger;

@ObfuscatedName("mb")
public final class class39 extends class24 {

	@ObfuscatedName("mb.s")
	public byte[] field620;

	@ObfuscatedName("mb.t")
	public int field621;

	@ObfuscatedName("mb.u")
	public int field622;

	@ObfuscatedName("mb.v")
	public static int[] field623 = new int[256];

	@ObfuscatedName("mb.w")
	public static final int[] field624 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("mb.x")
	public class50 field625;

	@ObfuscatedName("mb.y")
	public static int field626;

	@ObfuscatedName("mb.z")
	public static int field627;

	@ObfuscatedName("mb.B")
	public static class42 field629 = new class42();

	@ObfuscatedName("mb.C")
	public static class42 field630 = new class42();

	@ObfuscatedName("mb.D")
	public static class42 field631 = new class42();

	@ObfuscatedName("mb.A")
	public static int field628;

	@ObfuscatedName("mb.a(II)Lmb;")
	public static class39 method225(int arg0) {
		synchronized (field630) {
			class39 var2 = null;
			if (arg0 == 0 && field626 > 0) {
				field626--;
				var2 = (class39) field629.method256();
			} else if (arg0 == 1 && field627 > 0) {
				field627--;
				var2 = (class39) field630.method256();
			} else if (arg0 == 2 && field628 > 0) {
				field628--;
				var2 = (class39) field631.method256();
			}

			if (var2 != null) {
				var2.field621 = 0;
				return var2;
			}
		}

		class39 var4 = new class39();
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

	@ObfuscatedName("mb.a(I)V")
	public void method226() {
		synchronized (field630) {
			field621 = 0;

			if (field620.length == 100 && field626 < 1000) {
				field629.method254(this);
				field626++;
			} else if (field620.length == 5000 && field627 < 250) {
				field630.method254(this);
				field627++;
			} else if (field620.length == 30000 && field628 < 50) {
				field631.method254(this);
				field628++;
			}
		}
	}

	public class39() {
	}

	public class39(byte[] arg0) {
		field620 = arg0;
		field621 = 0;
	}

	@ObfuscatedName("mb.a(BI)V")
	public void method227(int arg0) {
		field620[field621++] = (byte) (arg0 + field625.method304());
	}

	@ObfuscatedName("mb.b(I)V")
	public void method228(int arg0) {
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("mb.c(I)V")
	public void method229(int arg0) {
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(IZ)V")
	public void method230(int arg0) {
		field620[field621++] = (byte) arg0;
		field620[field621++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("mb.d(I)V")
	public void method231(int arg0) {
		field620[field621++] = (byte) (arg0 >> 16);
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("mb.e(I)V")
	public void method232(int arg0) {
		field620[field621++] = (byte) (arg0 >> 24);
		field620[field621++] = (byte) (arg0 >> 16);
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("mb.b(II)V")
	public void method233(int arg0) {
		field620[field621++] = (byte) arg0;
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) (arg0 >> 16);
		field620[field621++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("mb.a(JZ)V")
	public void method234(long arg0) {
		field620[field621++] = (byte) (arg0 >> 56);
		field620[field621++] = (byte) (arg0 >> 48);
		field620[field621++] = (byte) (arg0 >> 40);
		field620[field621++] = (byte) (arg0 >> 32);
		field620[field621++] = (byte) (arg0 >> 24);
		field620[field621++] = (byte) (arg0 >> 16);
		field620[field621++] = (byte) (arg0 >> 8);
		field620[field621++] = (byte) arg0;
	}

	@ObfuscatedName("mb.a(Ljava/lang/String;)V")
	public void method235(String arg0) {
		arg0.getBytes(0, arg0.length(), field620, field621);
		field621 += arg0.length();
		field620[field621++] = 10;
	}

	@ObfuscatedName("mb.a(I[BII)V")
	public void method236(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			field620[field621++] = arg1[var4];
		}
	}

	@ObfuscatedName("mb.c(II)V")
	public void method237(int arg0) {
		field620[field621 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("mb.c()I")
	public int method238() {
		return field620[field621++] & 0xFF;
	}

	@ObfuscatedName("mb.d()B")
	public byte method239() {
		return field620[field621++];
	}

	@ObfuscatedName("mb.e()I")
	public int method240() {
		field621 += 2;
		return ((field620[field621 - 2] & 0xFF) << 8) + (field620[field621 - 1] & 0xFF);
	}

	@ObfuscatedName("mb.f()I")
	public int method241() {
		field621 += 2;
		int var1 = ((field620[field621 - 2] & 0xFF) << 8) + (field620[field621 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("mb.g()I")
	public int method242() {
		field621 += 3;
		return (field620[field621 - 1] & 0xFF) + ((field620[field621 - 3] & 0xFF) << 16) + ((field620[field621 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("mb.h()I")
	public int method243() {
		field621 += 4;
		return (field620[field621 - 1] & 0xFF) + ((field620[field621 - 2] & 0xFF) << 8) + ((field620[field621 - 4] & 0xFF) << 24) + ((field620[field621 - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("mb.f(I)J")
	public long method244() {
		long var1 = method243() & 0xFFFFFFFFL;
		long var3 = method243() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("mb.i()Ljava/lang/String;")
	public String method245() {
		int var1 = field621;

		while (field620[field621++] != 10) {
		}

		return new String(field620, var1, field621 - var1 - 1);
	}

	@ObfuscatedName("mb.g(I)[B")
	public byte[] method246() {
		int var1 = field621;

		while (field620[field621++] != 10) {
		}

		byte[] var2 = new byte[field621 - var1 - 1];
		for (int var3 = var1; var3 < field621 - 1; var3++) {
			var2[var3 - var1] = field620[var3];
		}

		return var2;
	}

	@ObfuscatedName("mb.a([BIIB)V")
	public void method247(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			arg0[var4] = field620[field621++];
		}
	}

	@ObfuscatedName("mb.h(I)V")
	public void method248() {
		field622 = field621 * 8;
	}

	@ObfuscatedName("mb.b(IZ)I")
	public int method249(int arg0) {
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

	@ObfuscatedName("mb.a(Z)V")
	public void method250() {
		field621 = (field622 + 7) / 8;
	}

	@ObfuscatedName("mb.j()I")
	public int method251() {
		int var1 = field620[field621] & 0xFF;
		if (var1 < 128) {
			return method238() - 64;
		}

		return method240() - 49152;
	}

	@ObfuscatedName("mb.k()I")
	public int method252() {
		int var1 = field620[field621] & 0xFF;
		if (var1 < 128) {
			return method238();
		}

		return method240() - 32768;
	}

	@ObfuscatedName("mb.a(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method253(BigInteger arg0, BigInteger arg1) {
		int var3 = field621;
		field621 = 0;
		byte[] var4 = new byte[var3];
		method247(var4, var3, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		field621 = 0;
		method228(var7.length);
		method236(var7.length, var7, 0);
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
