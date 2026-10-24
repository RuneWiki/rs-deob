package deob;

@ObfuscatedName("gb")
public class class33 extends class23 {

	@ObfuscatedName("gb.n")
	public static int[] field558;

	@ObfuscatedName("gb.o")
	public static int field559;

	@ObfuscatedName("gb.p")
	public static int field560;

	@ObfuscatedName("gb.q")
	public static int field561;

	@ObfuscatedName("gb.r")
	public static int field562;

	@ObfuscatedName("gb.s")
	public static int field563;

	@ObfuscatedName("gb.t")
	public static int field564;

	@ObfuscatedName("gb.u")
	public static int field565;

	@ObfuscatedName("gb.v")
	public static int field566;

	@ObfuscatedName("gb.w")
	public static int field567;

	@ObfuscatedName("gb.a([IIII)V")
	public static void method151(int[] arg0, int arg1, int arg2) {
		field558 = arg0;
		field559 = arg2;
		field560 = arg1;
		method153(0, arg2, 0, arg1);
	}

	@ObfuscatedName("gb.a(I)V")
	public static void method152() {
		field563 = 0;
		field561 = 0;
		field564 = field559;
		field562 = field560;
		field565 = field564 - 1;
		field566 = field564 / 2;
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void method153(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 > field559) {
			arg1 = field559;
		}

		if (arg3 > field560) {
			arg3 = field560;
		}

		field563 = arg0;
		field561 = arg2;
		field564 = arg1;
		field562 = arg3;
		field565 = field564 - 1;
		field566 = field564 / 2;
		field567 = field562 / 2;
	}

	@ObfuscatedName("gb.a(Z)V")
	public static void method154() {
		int var0 = field560 * field559;
		for (int var1 = 0; var1 < var0; var1++) {
			field558[var1] = 0;
		}
	}

	@ObfuscatedName("gb.a(IIIIBII)V")
	public static void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field563) {
			arg0 -= field563 - arg3;
			arg3 = field563;
		}

		if (arg4 < field561) {
			arg5 -= field561 - arg4;
			arg4 = field561;
		}

		if (arg0 + arg3 > field564) {
			arg0 = field564 - arg3;
		}

		if (arg4 + arg5 > field562) {
			arg5 = field562 - arg4;
		}

		int var6 = 256 - arg2;
		int var7 = (arg1 >> 16 & 0xFF) * arg2;
		int var8 = (arg1 >> 8 & 0xFF) * arg2;
		int var9 = (arg1 & 0xFF) * arg2;
		int var10 = field559 - arg0;
		int var11 = field559 * arg4 + arg3;
		for (int var12 = 0; var12 < arg5; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = (field558[var11] >> 16 & 0xFF) * var6;
				int var15 = (field558[var11] >> 8 & 0xFF) * var6;
				int var16 = (field558[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field558[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("gb.a(IIIIII)V")
	public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field563) {
			arg1 -= field563 - arg4;
			arg4 = field563;
		}

		if (arg2 < field561) {
			arg3 -= field561 - arg2;
			arg2 = field561;
		}

		if (arg1 + arg4 > field564) {
			arg1 = field564 - arg4;
		}

		if (arg2 + arg3 > field562) {
			arg3 = field562 - arg2;
		}

		int var5 = field559 - arg1;
		int var6 = field559 * arg2 + arg4;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field558[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("gb.b(IIIIII)V")
	public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method159(arg2, arg4, arg3, arg0);
		method159(arg2, arg4, arg1 + arg3 - 1, arg0);
		method161(arg1, arg3, arg2, arg4);
		method161(arg1, arg3, arg0 + arg2 - 1, arg4);
	}

	@ObfuscatedName("gb.a(IIIIIII)V")
	public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method160(arg4, arg0, arg5, arg3, arg1);
		method160(arg2 + arg4 - 1, arg0, arg5, arg3, arg1);

		if (arg2 >= 3) {
			method162(arg0, arg3, arg1, arg4 + 1, arg2 - 2);
			method162(arg0, arg3, arg1 + arg5 - 1, arg4 + 1, arg2 - 2);
		}
	}

	@ObfuscatedName("gb.b(IIIII)V")
	public static void method159(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field561 && arg2 < field562) {
			if (arg0 < field563) {
				arg3 -= field563 - arg0;
				arg0 = field563;
			}

			if (arg0 + arg3 > field564) {
				arg3 = field564 - arg0;
			}

			int var4 = field559 * arg2 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field558[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("gb.a(IIIIZI)V")
	public static void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field561 && arg0 < field562) {
			if (arg4 < field563) {
				arg2 -= field563 - arg4;
				arg4 = field563;
			}

			if (arg2 + arg4 > field564) {
				arg2 = field564 - arg4;
			}

			int var5 = 256 - arg1;
			int var6 = (arg3 >> 16 & 0xFF) * arg1;
			int var7 = (arg3 >> 8 & 0xFF) * arg1;
			int var8 = (arg3 & 0xFF) * arg1;
			int var9 = field559 * arg0 + arg4;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field558[var9] >> 16 & 0xFF) * var5;
				int var12 = (field558[var9] >> 8 & 0xFF) * var5;
				int var13 = (field558[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field558[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("gb.a(IIBII)V")
	public static void method161(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field563 && arg2 < field564) {
			if (arg1 < field561) {
				arg0 -= field561 - arg1;
				arg1 = field561;
			}

			if (arg0 + arg1 > field562) {
				arg0 = field562 - arg1;
			}

			int var4 = field559 * arg1 + arg2;
			for (int var5 = 0; var5 < arg0; var5++) {
				field558[field559 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("gb.c(IIIIII)V")
	public static void method162(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field563 && arg2 < field564) {
			if (arg3 < field561) {
				arg4 -= field561 - arg3;
				arg3 = field561;
			}

			if (arg3 + arg4 > field562) {
				arg4 = field562 - arg3;
			}

			int var5 = 256 - arg0;
			int var6 = (arg1 >> 16 & 0xFF) * arg0;
			int var7 = (arg1 >> 8 & 0xFF) * arg0;
			int var8 = (arg1 & 0xFF) * arg0;
			int var9 = field559 * arg3 + arg2;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field558[var9] >> 16 & 0xFF) * var5;
				int var12 = (field558[var9] >> 8 & 0xFF) * var5;
				int var13 = (field558[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field558[var9] = var14;
				var9 += field559;
			}
		}
	}
}
