package deob;

@ObfuscatedName("fb")
public class class32 extends class30 {

	@ObfuscatedName("fb.k")
	public static int[] field482;

	@ObfuscatedName("fb.l")
	public static int field483;

	@ObfuscatedName("fb.m")
	public static int field484;

	@ObfuscatedName("fb.n")
	public static int field485;

	@ObfuscatedName("fb.o")
	public static int field486;

	@ObfuscatedName("fb.p")
	public static int field487;

	@ObfuscatedName("fb.q")
	public static int field488;

	@ObfuscatedName("fb.r")
	public static int field489;

	@ObfuscatedName("fb.s")
	public static int field490;

	@ObfuscatedName("fb.t")
	public static int field491;

	@ObfuscatedName("fb.a(I[IBI)V")
	public static void method145(int arg0, int[] arg1, int arg2) {
		field482 = arg1;
		field483 = arg2;
		field484 = arg0;
		method147(0, arg2, arg0, 0);
	}

	@ObfuscatedName("fb.a(Z)V")
	public static void method146() {
		field487 = 0;
		field485 = 0;
		field488 = field483;
		field486 = field484;
		field489 = field488 - 1;
		field490 = field488 / 2;
	}

	@ObfuscatedName("fb.a(IIIZI)V")
	public static void method147(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 > field483) {
			arg1 = field483;
		}

		if (arg2 > field484) {
			arg2 = field484;
		}

		field487 = arg3;
		field485 = arg0;
		field488 = arg1;
		field486 = arg2;
		field489 = field488 - 1;
		field490 = field488 / 2;
		field491 = field486 / 2;
	}

	@ObfuscatedName("fb.b(Z)V")
	public static void method148() {
		int var0 = field484 * field483;
		for (int var1 = 0; var1 < var0; var1++) {
			field482[var1] = 0;
		}
	}

	@ObfuscatedName("fb.a(IIIIBI)V")
	public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field487) {
			arg0 -= field487 - arg4;
			arg4 = field487;
		}

		if (arg3 < field485) {
			arg1 -= field485 - arg3;
			arg3 = field485;
		}

		if (arg0 + arg4 > field488) {
			arg0 = field488 - arg4;
		}

		if (arg1 + arg3 > field486) {
			arg1 = field486 - arg3;
		}

		int var5 = field483 - arg0;
		int var6 = field483 * arg3 + arg4;
		for (int var7 = -arg1; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field482[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("fb.a(IIIIII)V")
	public static void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method151(arg0, arg2, arg4, arg3);
		method151(arg0 + arg1 - 1, arg2, arg4, arg3);
		method152(arg1, arg2, arg0, arg4);
		method152(arg1, arg2, arg0, arg3 + arg4 - 1);
	}

	@ObfuscatedName("fb.a(IIIII)V")
	public static void method151(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field485 && arg0 < field486) {
			if (arg2 < field487) {
				arg3 -= field487 - arg2;
				arg2 = field487;
			}

			if (arg2 + arg3 > field488) {
				arg3 = field488 - arg2;
			}

			int var4 = field483 * arg0 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field482[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("fb.b(IIIII)V")
	public static void method152(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field487 && arg3 < field488) {
			if (arg2 < field485) {
				arg0 -= field485 - arg2;
				arg2 = field485;
			}

			if (arg0 + arg2 > field486) {
				arg0 = field486 - arg2;
			}

			int var4 = field483 * arg2 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field482[field483 * var5 + var4] = arg1;
			}
		}
	}
}
