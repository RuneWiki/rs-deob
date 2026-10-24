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

	@ObfuscatedName("hb.a(IBI[I)V")
	public static void method161(int arg0, int arg1, int[] arg2) {
		field552 = arg2;
		field553 = arg1;
		field554 = arg0;
		method163(0, 0, arg0, arg1);
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

	@ObfuscatedName("hb.a(ZIIII)V")
	public static void method163(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 > field553) {
			arg3 = field553;
		}

		if (arg2 > field554) {
			arg2 = field554;
		}

		field557 = arg0;
		field555 = arg1;
		field558 = arg3;
		field556 = arg2;
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

	@ObfuscatedName("hb.a(IIIIBI)V")
	public static void method165(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field557) {
			arg1 -= field557 - arg0;
			arg0 = field557;
		}

		if (arg4 < field555) {
			arg3 -= field555 - arg4;
			arg4 = field555;
		}

		if (arg0 + arg1 > field558) {
			arg1 = field558 - arg0;
		}

		if (arg3 + arg4 > field556) {
			arg3 = field556 - arg4;
		}

		int var5 = field553 - arg1;
		int var6 = field553 * arg4 + arg0;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field552[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("hb.a(IIIIIB)V")
	public static void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method167(arg2, arg4, arg3, arg0);
		method167(arg2, arg4, arg3, arg0 + arg1 - 1);
		method168(arg0, arg4, arg2, arg1);
		method168(arg0, arg4, arg2 + arg3 - 1, arg1);
	}

	@ObfuscatedName("hb.a(IBIII)V")
	public static void method167(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field555 && arg3 < field556) {
			if (arg0 < field557) {
				arg2 -= field557 - arg0;
				arg0 = field557;
			}

			if (arg0 + arg2 > field558) {
				arg2 = field558 - arg0;
			}

			int var4 = field553 * arg3 + arg0;
			for (int var5 = 0; var5 < arg2; var5++) {
				field552[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("hb.a(IIIIZ)V")
	public static void method168(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field557 && arg2 < field558) {
			if (arg0 < field555) {
				arg3 -= field555 - arg0;
				arg0 = field555;
			}

			if (arg0 + arg3 > field556) {
				arg3 = field556 - arg0;
			}

			int var4 = field553 * arg0 + arg2;
			for (int var5 = 0; var5 < arg3; var5++) {
				field552[field553 * var5 + var4] = arg1;
			}
		}
	}
}
