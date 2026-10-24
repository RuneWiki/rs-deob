package deob;

@ObfuscatedName("fb")
public class class32 extends class30 {

	@ObfuscatedName("fb.k")
	public static int[] field479;

	@ObfuscatedName("fb.l")
	public static int field480;

	@ObfuscatedName("fb.m")
	public static int field481;

	@ObfuscatedName("fb.n")
	public static int field482;

	@ObfuscatedName("fb.o")
	public static int field483;

	@ObfuscatedName("fb.p")
	public static int field484;

	@ObfuscatedName("fb.q")
	public static int field485;

	@ObfuscatedName("fb.r")
	public static int field486;

	@ObfuscatedName("fb.s")
	public static int field487;

	@ObfuscatedName("fb.t")
	public static int field488;

	@ObfuscatedName("fb.a(I[III)V")
	public static void method141(int arg0, int[] arg1, int arg2) {
		field479 = arg1;
		field480 = arg0;
		field481 = arg2;
		method143(arg2, arg0, 0, 0);
	}

	@ObfuscatedName("fb.a(I)V")
	public static void method142() {
		field484 = 0;
		field482 = 0;
		field485 = field480;
		field483 = field481;
		field486 = field485 - 1;
		field487 = field485 / 2;
	}

	@ObfuscatedName("fb.a(IIIII)V")
	public static void method143(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 > field480) {
			arg1 = field480;
		}

		if (arg0 > field481) {
			arg0 = field481;
		}

		field484 = arg3;
		field482 = arg2;
		field485 = arg1;
		field483 = arg0;
		field486 = field485 - 1;
		field487 = field485 / 2;
		field488 = field483 / 2;
	}

	@ObfuscatedName("fb.b(I)V")
	public static void method144() {
		int var0 = field481 * field480;
		for (int var1 = 0; var1 < var0; var1++) {
			field479[var1] = 0;
		}
	}

	@ObfuscatedName("fb.a(IIIIII)V")
	public static void method145(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field484) {
			arg3 -= field484 - arg4;
			arg4 = field484;
		}

		if (arg2 < field482) {
			arg1 -= field482 - arg2;
			arg2 = field482;
		}

		if (arg3 + arg4 > field485) {
			arg3 = field485 - arg4;
		}

		if (arg1 + arg2 > field483) {
			arg1 = field483 - arg2;
		}

		int var5 = field480 - arg3;
		int var6 = field480 * arg2 + arg4;
		for (int var7 = -arg1; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field479[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("fb.b(IIIIII)V")
	public static void method146(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method147(arg2, arg4, arg1, arg0);
		method147(arg2, arg4, arg1 + arg3 - 1, arg0);
		method148(arg0, arg1, arg4, arg3);
		method148(arg0, arg1, arg2 + arg4 - 1, arg3);
	}

	@ObfuscatedName("fb.a(IZIII)V")
	public static void method147(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field482 && arg2 < field483) {
			if (arg1 < field484) {
				arg0 -= field484 - arg1;
				arg1 = field484;
			}

			if (arg0 + arg1 > field485) {
				arg0 = field485 - arg1;
			}

			int var4 = field480 * arg2 + arg1;
			for (int var5 = 0; var5 < arg0; var5++) {
				field479[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("fb.b(IIIII)V")
	public static void method148(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field484 && arg2 < field485) {
			if (arg1 < field482) {
				arg3 -= field482 - arg1;
				arg1 = field482;
			}

			if (arg1 + arg3 > field483) {
				arg3 = field483 - arg1;
			}

			int var4 = field480 * arg1 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field479[field480 * var5 + var4] = arg0;
			}
		}
	}
}
