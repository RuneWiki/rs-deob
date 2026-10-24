package deob;

@ObfuscatedName("fb")
public class class32 extends class30 {

	@ObfuscatedName("fb.m")
	public static int[] field484;

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

	@ObfuscatedName("fb.u")
	public static int field492;

	@ObfuscatedName("fb.v")
	public static int field493;

	@ObfuscatedName("fb.a(BI[II)V")
	public static void method145(int arg0, int[] arg1, int arg2) {
		field484 = arg1;
		field485 = arg2;
		field486 = arg0;
		method147(arg0, 0, 0, arg2);
	}

	@ObfuscatedName("fb.a(I)V")
	public static void method146() {
		field489 = 0;
		field487 = 0;
		field490 = field485;
		field488 = field486;
		field491 = field490 - 1;
		field492 = field490 / 2;
	}

	@ObfuscatedName("fb.a(IIIII)V")
	public static void method147(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg3 > field485) {
			arg3 = field485;
		}

		if (arg0 > field486) {
			arg0 = field486;
		}

		field489 = arg1;
		field487 = arg2;
		field490 = arg3;
		field488 = arg0;
		field491 = field490 - 1;
		field492 = field490 / 2;
		field493 = field488 / 2;
	}

	@ObfuscatedName("fb.b(I)V")
	public static void method148() {
		int var0 = field486 * field485;
		for (int var1 = 0; var1 < var0; var1++) {
			field484[var1] = 0;
		}
	}

	@ObfuscatedName("fb.a(IIIIII)V")
	public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field489) {
			arg3 -= field489 - arg1;
			arg1 = field489;
		}

		if (arg2 < field487) {
			arg4 -= field487 - arg2;
			arg2 = field487;
		}

		if (arg1 + arg3 > field490) {
			arg3 = field490 - arg1;
		}

		if (arg2 + arg4 > field488) {
			arg4 = field488 - arg2;
		}

		int var5 = field485 - arg3;
		int var6 = field485 * arg2 + arg1;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field484[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("fb.a(IZIIII)V")
	public static void method150(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method151(arg0, arg2, arg1, arg4);
		method151(arg0, arg2 + arg3 - 1, arg1, arg4);
		method152(arg2, arg0, arg3, arg1);
		method152(arg2, arg0, arg3, arg1 + arg4 - 1);
	}

	@ObfuscatedName("fb.a(IIIIZ)V")
	public static void method151(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field487 && arg1 < field488) {
			if (arg2 < field489) {
				arg3 -= field489 - arg2;
				arg2 = field489;
			}

			if (arg2 + arg3 > field490) {
				arg3 = field490 - arg2;
			}

			int var4 = field485 * arg1 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field484[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("fb.b(IIIII)V")
	public static void method152(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field489 && arg3 < field490) {
			if (arg0 < field487) {
				arg2 -= field487 - arg0;
				arg0 = field487;
			}

			if (arg0 + arg2 > field488) {
				arg2 = field488 - arg0;
			}

			int var4 = field485 * arg0 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				field484[field485 * var5 + var4] = arg1;
			}
		}
	}
}
