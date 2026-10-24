package deob;

@ObfuscatedName("hb")
public class class34 extends class24 {

	@ObfuscatedName("hb.m")
	public static int[] field552;

	@ObfuscatedName("hb.n")
	public static int field553;

	@ObfuscatedName("hb.o")
	public static int field554;

	@ObfuscatedName("hb.p")
	public static int field555;

	@ObfuscatedName("hb.q")
	public static int field556;

	@ObfuscatedName("hb.r")
	public static int field557;

	@ObfuscatedName("hb.s")
	public static int field558;

	@ObfuscatedName("hb.t")
	public static int field559;

	@ObfuscatedName("hb.u")
	public static int field560;

	@ObfuscatedName("hb.v")
	public static int field561;

	@ObfuscatedName("hb.a([IIII)V")
	public static void method161(int[] arg0, int arg1, int arg2) {
		field552 = arg0;
		field553 = arg2;
		field554 = arg1;
		method163(arg1, 0, 0, arg2);
	}

	@ObfuscatedName("hb.a(I)V")
	public static void method162() {
		field557 = 0;
		field555 = 0;
		field558 = field553;
		field556 = field554;
		field559 = field558 - 1;
		field560 = field558 / 2;
	}

	@ObfuscatedName("hb.a(IIIII)V")
	public static void method163(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 > field553) {
			arg3 = field553;
		}

		if (arg0 > field554) {
			arg0 = field554;
		}

		field557 = arg2;
		field555 = arg1;
		field558 = arg3;
		field556 = arg0;
		field559 = field558 - 1;
		field560 = field558 / 2;
		field561 = field556 / 2;
	}

	@ObfuscatedName("hb.b(I)V")
	public static void method164() {
		int var0 = field554 * field553;
		for (int var1 = 0; var1 < var0; var1++) {
			field552[var1] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void method165(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field557) {
			arg2 -= field557 - arg3;
			arg3 = field557;
		}

		if (arg1 < field555) {
			arg0 -= field555 - arg1;
			arg1 = field555;
		}

		if (arg2 + arg3 > field558) {
			arg2 = field558 - arg3;
		}

		if (arg0 + arg1 > field556) {
			arg0 = field556 - arg1;
		}

		int var5 = field553 - arg2;
		int var6 = field553 * arg1 + arg3;
		for (int var7 = -arg0; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field552[var6++] = arg4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("hb.a(IIBIII)V")
	public static void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method167(arg1, arg0, arg2, arg3);
		method167(arg1, arg0 + arg4 - 1, arg2, arg3);
		method168(arg3, arg0, arg4, arg1);
		method168(arg3, arg0, arg4, arg1 + arg2 - 1);
	}

	@ObfuscatedName("hb.b(IIIII)V")
	public static void method167(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field555 && arg1 < field556) {
			if (arg0 < field557) {
				arg2 -= field557 - arg0;
				arg0 = field557;
			}

			if (arg0 + arg2 > field558) {
				arg2 = field558 - arg0;
			}

			int var4 = field553 * arg1 + arg0;
			for (int var5 = 0; var5 < arg2; var5++) {
				field552[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("hb.c(IIIII)V")
	public static void method168(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field557 && arg3 < field558) {
			if (arg1 < field555) {
				arg2 -= field555 - arg1;
				arg1 = field555;
			}

			if (arg1 + arg2 > field556) {
				arg2 = field556 - arg1;
			}

			int var4 = field553 * arg1 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				field552[field553 * var5 + var4] = arg0;
			}
		}
	}
}
