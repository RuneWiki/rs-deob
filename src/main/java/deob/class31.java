package deob;

@ObfuscatedName("eb")
public class class31 extends class29 {

	@ObfuscatedName("eb.j")
	public static int[] field467;

	@ObfuscatedName("eb.k")
	public static int field468;

	@ObfuscatedName("eb.l")
	public static int field469;

	@ObfuscatedName("eb.m")
	public static int field470;

	@ObfuscatedName("eb.n")
	public static int field471;

	@ObfuscatedName("eb.o")
	public static int field472;

	@ObfuscatedName("eb.p")
	public static int field473;

	@ObfuscatedName("eb.q")
	public static int field474;

	@ObfuscatedName("eb.r")
	public static int field475;

	@ObfuscatedName("eb.s")
	public static int field476;

	@ObfuscatedName("eb.a(ZI[II)V")
	public static void method127(int arg0, int[] arg1, int arg2) {
		field467 = arg1;
		field468 = arg0;
		field469 = arg2;
		method129(arg0, 0, 0, arg2);
	}

	@ObfuscatedName("eb.a(B)V")
	public static void method128() {
		field472 = 0;
		field470 = 0;
		field473 = field468;
		field471 = field469;
		field474 = field473 - 1;
		field475 = field473 / 2;
	}

	@ObfuscatedName("eb.a(IBIII)V")
	public static void method129(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg0 > field468) {
			arg0 = field468;
		}

		if (arg3 > field469) {
			arg3 = field469;
		}

		field472 = arg1;
		field470 = arg2;
		field473 = arg0;
		field471 = arg3;
		field474 = field473 - 1;
		field475 = field473 / 2;
		field476 = field471 / 2;
	}

	@ObfuscatedName("eb.a(I)V")
	public static void method130() {
		int var0 = field469 * field468;
		for (int var1 = 0; var1 < var0; var1++) {
			field467[var1] = 0;
		}
	}

	@ObfuscatedName("eb.a(IIIZII)V")
	public static void method131(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field472) {
			arg1 -= field472 - arg4;
			arg4 = field472;
		}

		if (arg2 < field470) {
			arg3 -= field470 - arg2;
			arg2 = field470;
		}

		if (arg1 + arg4 > field473) {
			arg1 = field473 - arg4;
		}

		if (arg2 + arg3 > field471) {
			arg3 = field471 - arg2;
		}

		int var5 = field468 - arg1;
		int var6 = field468 * arg2 + arg4;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field467[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("eb.a(IIIIZI)V")
	public static void method132(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method133(arg4, arg3, arg0, arg2);
		method133(arg4, arg1 + arg3 - 1, arg0, arg2);
		method134(arg3, arg2, arg1, arg4);
		method134(arg3, arg0 + arg2 - 1, arg1, arg4);
	}

	@ObfuscatedName("eb.a(ZIIII)V")
	public static void method133(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field470 && arg1 < field471) {
			if (arg3 < field472) {
				arg2 -= field472 - arg3;
				arg3 = field472;
			}

			if (arg2 + arg3 > field473) {
				arg2 = field473 - arg3;
			}

			int var4 = field468 * arg1 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				field467[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("eb.a(IIIZI)V")
	public static void method134(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field472 && arg1 < field473) {
			if (arg0 < field470) {
				arg2 -= field470 - arg0;
				arg0 = field470;
			}

			if (arg0 + arg2 > field471) {
				arg2 = field471 - arg0;
			}

			int var4 = field468 * arg0 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field467[field468 * var5 + var4] = arg3;
			}
		}
	}
}
