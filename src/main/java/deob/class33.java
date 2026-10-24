package deob;

@ObfuscatedName("gb")
public class class33 extends class23 {

	@ObfuscatedName("gb.m")
	public static int[] field563;

	@ObfuscatedName("gb.n")
	public static int field564;

	@ObfuscatedName("gb.o")
	public static int field565;

	@ObfuscatedName("gb.p")
	public static int field566;

	@ObfuscatedName("gb.q")
	public static int field567;

	@ObfuscatedName("gb.r")
	public static int field568;

	@ObfuscatedName("gb.s")
	public static int field569;

	@ObfuscatedName("gb.t")
	public static int field570;

	@ObfuscatedName("gb.u")
	public static int field571;

	@ObfuscatedName("gb.v")
	public static int field572;

	@ObfuscatedName("gb.a(II[II)V")
	public static void method152(int arg0, int arg1, int[] arg2) {
		field563 = arg2;
		field564 = arg1;
		field565 = arg0;
		method154(arg0, arg1, 0, 0);
	}

	@ObfuscatedName("gb.a(B)V")
	public static void method153() {
		field568 = 0;
		field566 = 0;
		field569 = field564;
		field567 = field565;
		field570 = field569 - 1;
		field571 = field569 / 2;
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void method154(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg1 > field564) {
			arg1 = field564;
		}

		if (arg0 > field565) {
			arg0 = field565;
		}

		field568 = arg2;
		field566 = arg3;
		field569 = arg1;
		field567 = arg0;
		field570 = field569 - 1;
		field571 = field569 / 2;
		field572 = field567 / 2;
	}

	@ObfuscatedName("gb.a(I)V")
	public static void method155() {
		int var0 = field565 * field564;
		for (int var1 = 0; var1 < var0; var1++) {
			field563[var1] = 0;
		}
	}

	@ObfuscatedName("gb.a(IIIIIII)V")
	public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field568) {
			arg2 -= field568 - arg3;
			arg3 = field568;
		}

		if (arg4 < field566) {
			arg1 -= field566 - arg4;
			arg4 = field566;
		}

		if (arg2 + arg3 > field569) {
			arg2 = field569 - arg3;
		}

		if (arg1 + arg4 > field567) {
			arg1 = field567 - arg4;
		}

		int var6 = 256 - arg5;
		int var7 = (arg0 >> 16 & 0xFF) * arg5;
		int var8 = (arg0 >> 8 & 0xFF) * arg5;
		int var9 = (arg0 & 0xFF) * arg5;
		int var10 = field564 - arg2;
		int var11 = field564 * arg4 + arg3;
		for (int var12 = 0; var12 < arg1; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (field563[var11] >> 16 & 0xFF) * var6;
				int var15 = (field563[var11] >> 8 & 0xFF) * var6;
				int var16 = (field563[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field563[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("gb.a(IIIIIB)V")
	public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field568) {
			arg2 -= field568 - arg3;
			arg3 = field568;
		}

		if (arg4 < field566) {
			arg1 -= field566 - arg4;
			arg4 = field566;
		}

		if (arg2 + arg3 > field569) {
			arg2 = field569 - arg3;
		}

		if (arg1 + arg4 > field567) {
			arg1 = field567 - arg4;
		}

		int var5 = field564 - arg2;
		int var6 = field564 * arg4 + arg3;
		for (int var7 = -arg1; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field563[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("gb.a(IIIIII)V")
	public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method160(arg4, arg2, arg1, arg3);
		method160(arg4, arg2, arg0 + arg1 - 1, arg3);
		method162(arg4, arg1, arg2, arg0);
		method162(arg3 + arg4 - 1, arg1, arg2, arg0);
	}

	@ObfuscatedName("gb.b(IIIIIII)V")
	public static void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method161(arg2, arg4, arg5, arg0, arg3);
		method161(arg2, arg4, arg5, arg0, arg1 + arg3 - 1);

		if (arg1 >= 3) {
			method163(arg5, arg4, arg3 + 1, arg1 - 2, arg2);
			method163(arg0 + arg5 - 1, arg4, arg3 + 1, arg1 - 2, arg2);
		}
	}

	@ObfuscatedName("gb.b(IIIII)V")
	public static void method160(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field566 && arg2 < field567) {
			if (arg0 < field568) {
				arg3 -= field568 - arg0;
				arg0 = field568;
			}

			if (arg0 + arg3 > field569) {
				arg3 = field569 - arg0;
			}

			int var4 = field564 * arg2 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field563[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("gb.b(IIIIIB)V")
	public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field566 && arg4 < field567) {
			if (arg2 < field568) {
				arg3 -= field568 - arg2;
				arg2 = field568;
			}

			if (arg2 + arg3 > field569) {
				arg3 = field569 - arg2;
			}

			int var5 = 256 - arg1;
			int var6 = (arg0 >> 16 & 0xFF) * arg1;
			int var7 = (arg0 >> 8 & 0xFF) * arg1;
			int var8 = (arg0 & 0xFF) * arg1;
			int var9 = field564 * arg4 + arg2;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field563[var9] >> 16 & 0xFF) * var5;
				int var12 = (field563[var9] >> 8 & 0xFF) * var5;
				int var13 = (field563[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field563[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("gb.c(IIIII)V")
	public static void method162(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field568 && arg0 < field569) {
			if (arg1 < field566) {
				arg3 -= field566 - arg1;
				arg1 = field566;
			}

			if (arg1 + arg3 > field567) {
				arg3 = field567 - arg1;
			}

			int var4 = field564 * arg1 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field563[field564 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("gb.b(IIIIII)V")
	public static void method163(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field568 && arg0 < field569) {
			if (arg2 < field566) {
				arg3 -= field566 - arg2;
				arg2 = field566;
			}

			if (arg2 + arg3 > field567) {
				arg3 = field567 - arg2;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field564 * arg2 + arg0;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field563[var9] >> 16 & 0xFF) * var5;
				int var12 = (field563[var9] >> 8 & 0xFF) * var5;
				int var13 = (field563[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field563[var9] = var14;
				var9 += field564;
			}
		}
	}
}
