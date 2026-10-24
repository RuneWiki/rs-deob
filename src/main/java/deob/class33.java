package deob;

@ObfuscatedName("gb")
public class class33 extends class23 {

	@ObfuscatedName("gb.l")
	public static int[] field557;

	@ObfuscatedName("gb.m")
	public static int field558;

	@ObfuscatedName("gb.n")
	public static int field559;

	@ObfuscatedName("gb.o")
	public static int field560;

	@ObfuscatedName("gb.p")
	public static int field561;

	@ObfuscatedName("gb.q")
	public static int field562;

	@ObfuscatedName("gb.r")
	public static int field563;

	@ObfuscatedName("gb.s")
	public static int field564;

	@ObfuscatedName("gb.t")
	public static int field565;

	@ObfuscatedName("gb.u")
	public static int field566;

	@ObfuscatedName("gb.a(I[III)V")
	public static void method151(int[] arg0, int arg1, int arg2) {
		field557 = arg0;
		field558 = arg1;
		field559 = arg2;
		method153(arg2, 0, 0, arg1);
	}

	@ObfuscatedName("gb.a(I)V")
	public static void method152() {
		field562 = 0;
		field560 = 0;
		field563 = field558;
		field561 = field559;
		field564 = field563 - 1;
		field565 = field563 / 2;
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void method153(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 > field558) {
			arg3 = field558;
		}

		if (arg0 > field559) {
			arg0 = field559;
		}

		field562 = arg2;
		field560 = arg1;
		field563 = arg3;
		field561 = arg0;
		field564 = field563 - 1;
		field565 = field563 / 2;
		field566 = field561 / 2;
	}

	@ObfuscatedName("gb.b(I)V")
	public static void method154() {
		int var0 = field559 * field558;
		for (int var1 = 0; var1 < var0; var1++) {
			field557[var1] = 0;
		}
	}

	@ObfuscatedName("gb.a(IIIIIII)V")
	public static void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < field562) {
			arg4 -= field562 - arg2;
			arg2 = field562;
		}

		if (arg5 < field560) {
			arg3 -= field560 - arg5;
			arg5 = field560;
		}

		if (arg2 + arg4 > field563) {
			arg4 = field563 - arg2;
		}

		if (arg3 + arg5 > field561) {
			arg3 = field561 - arg5;
		}

		int var6 = 256 - arg0;
		int var7 = (arg1 >> 16 & 0xFF) * arg0;
		int var8 = (arg1 >> 8 & 0xFF) * arg0;
		int var9 = (arg1 & 0xFF) * arg0;
		int var10 = field558 - arg4;
		int var11 = field558 * arg5 + arg2;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (field557[var11] >> 16 & 0xFF) * var6;
				int var15 = (field557[var11] >> 8 & 0xFF) * var6;
				int var16 = (field557[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field557[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("gb.a(IIIIII)V")
	public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field562) {
			arg0 -= field562 - arg4;
			arg4 = field562;
		}

		if (arg2 < field560) {
			arg3 -= field560 - arg2;
			arg2 = field560;
		}

		if (arg0 + arg4 > field563) {
			arg0 = field563 - arg4;
		}

		if (arg2 + arg3 > field561) {
			arg3 = field561 - arg2;
		}

		int var5 = field558 - arg0;
		int var6 = field558 * arg2 + arg4;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field557[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("gb.b(IIIIII)V")
	public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method159(arg4, arg1, arg0, arg3);
		method159(arg4, arg1, arg0, arg2 + arg3 - 1);
		method161(arg3, arg0, arg4, arg2);
		method161(arg3, arg0 + arg1 - 1, arg4, arg2);
	}

	@ObfuscatedName("gb.a(IZIIIII)V")
	public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method160(arg1, arg2, arg4, arg0, arg5);
		method160(arg1 + arg3 - 1, arg2, arg4, arg0, arg5);

		if (arg3 >= 3) {
			method162(arg4, arg3 - 2, arg1 + 1, arg5, arg0);
			method162(arg4, arg3 - 2, arg1 + 1, arg2 + arg5 - 1, arg0);
		}
	}

	@ObfuscatedName("gb.a(IIIIB)V")
	public static void method159(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field560 && arg3 < field561) {
			if (arg2 < field562) {
				arg1 -= field562 - arg2;
				arg2 = field562;
			}

			if (arg1 + arg2 > field563) {
				arg1 = field563 - arg2;
			}

			int var4 = field558 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field557[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("gb.c(IIIIII)V")
	public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field560 && arg0 < field561) {
			if (arg4 < field562) {
				arg1 -= field562 - arg4;
				arg4 = field562;
			}

			if (arg1 + arg4 > field563) {
				arg1 = field563 - arg4;
			}

			int var5 = 256 - arg2;
			int var6 = (arg3 >> 16 & 0xFF) * arg2;
			int var7 = (arg3 >> 8 & 0xFF) * arg2;
			int var8 = (arg3 & 0xFF) * arg2;
			int var9 = field558 * arg0 + arg4;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field557[var9] >> 16 & 0xFF) * var5;
				int var12 = (field557[var9] >> 8 & 0xFF) * var5;
				int var13 = (field557[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field557[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("gb.a(IIIIZ)V")
	public static void method161(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field562 && arg1 < field563) {
			if (arg0 < field560) {
				arg3 -= field560 - arg0;
				arg0 = field560;
			}

			if (arg0 + arg3 > field561) {
				arg3 = field561 - arg0;
			}

			int var4 = field558 * arg0 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field557[field558 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("gb.d(IIIIII)V")
	public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field562 && arg3 < field563) {
			if (arg2 < field560) {
				arg1 -= field560 - arg2;
				arg2 = field560;
			}

			if (arg1 + arg2 > field561) {
				arg1 = field561 - arg2;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field558 * arg2 + arg3;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field557[var9] >> 16 & 0xFF) * var5;
				int var12 = (field557[var9] >> 8 & 0xFF) * var5;
				int var13 = (field557[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field557[var9] = var14;
				var9 += field558;
			}
		}
	}
}
