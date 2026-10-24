package deob;

@ObfuscatedName("fb")
public class class32 extends class30 {

	@ObfuscatedName("fb.m")
	public static int[] field482;

	@ObfuscatedName("fb.n")
	public static int field483;

	@ObfuscatedName("fb.o")
	public static int field484;

	@ObfuscatedName("fb.p")
	public static int field485;

	@ObfuscatedName("fb.q")
	public static int field486;

	@ObfuscatedName("fb.r")
	public static int field487;

	@ObfuscatedName("fb.s")
	public static int field488;

	@ObfuscatedName("fb.t")
	public static int field489;

	@ObfuscatedName("fb.u")
	public static int field490;

	@ObfuscatedName("fb.v")
	public static int field491;

	@ObfuscatedName("fb.a(IZI[I)V")
	public static void method144(int arg0, int arg1, int[] arg2) {
		field482 = arg2;
		field483 = arg0;
		field484 = arg1;
		method146(0, 0, arg0, arg1);
	}

	@ObfuscatedName("fb.a(Z)V")
	public static void method145() {
		field487 = 0;
		field485 = 0;
		field488 = field483;
		field486 = field484;
		field489 = field488 - 1;
		field490 = field488 / 2;
	}

	@ObfuscatedName("fb.a(ZIIII)V")
	public static void method146(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 > field483) {
			arg2 = field483;
		}

		if (arg3 > field484) {
			arg3 = field484;
		}

		field487 = arg0;
		field485 = arg1;
		field488 = arg2;
		field486 = arg3;
		field489 = field488 - 1;
		field490 = field488 / 2;
		field491 = field486 / 2;
	}

	@ObfuscatedName("fb.b(Z)V")
	public static void method147() {
		int var0 = field484 * field483;
		for (int var1 = 0; var1 < var0; var1++) {
			field482[var1] = 0;
		}
	}

	@ObfuscatedName("fb.a(IIIBII)V")
	public static void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field487) {
			arg3 -= field487 - arg2;
			arg2 = field487;
		}

		if (arg1 < field485) {
			arg4 -= field485 - arg1;
			arg1 = field485;
		}

		if (arg2 + arg3 > field488) {
			arg3 = field488 - arg2;
		}

		if (arg1 + arg4 > field486) {
			arg4 = field486 - arg1;
		}

		int var5 = field483 - arg3;
		int var6 = field483 * arg1 + arg2;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field482[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("fb.a(IIIIII)V")
	public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method150(arg3, arg2, arg0, arg1);
		method150(arg3, arg2 + arg4 - 1, arg0, arg1);
		method151(arg4, arg1, arg2, arg3);
		method151(arg4, arg1, arg2, arg0 + arg3 - 1);
	}

	@ObfuscatedName("fb.a(IIIII)V")
	public static void method150(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field485 && arg1 < field486) {
			if (arg0 < field487) {
				arg2 -= field487 - arg0;
				arg0 = field487;
			}

			if (arg0 + arg2 > field488) {
				arg2 = field488 - arg0;
			}

			int var4 = field483 * arg1 + arg0;
			for (int var5 = 0; var5 < arg2; var5++) {
				field482[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("fb.a(IZIII)V")
	public static void method151(int arg0, int arg1, int arg2, int arg3) {
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
