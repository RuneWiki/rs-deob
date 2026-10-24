package deob;

@ObfuscatedName("gb")
public class class33 extends class23 {

	@ObfuscatedName("gb.o")
	public static int[] field564;

	@ObfuscatedName("gb.p")
	public static int field565;

	@ObfuscatedName("gb.q")
	public static int field566;

	@ObfuscatedName("gb.r")
	public static int field567;

	@ObfuscatedName("gb.s")
	public static int field568;

	@ObfuscatedName("gb.t")
	public static int field569;

	@ObfuscatedName("gb.u")
	public static int field570;

	@ObfuscatedName("gb.v")
	public static int field571;

	@ObfuscatedName("gb.w")
	public static int field572;

	@ObfuscatedName("gb.x")
	public static int field573;

	@ObfuscatedName("gb.a(II[II)V")
	public static void method152(int arg0, int[] arg1, int arg2) {
		field564 = arg1;
		field565 = arg0;
		field566 = arg2;
		method154(arg2, 0, arg0, 0);
	}

	@ObfuscatedName("gb.a(Z)V")
	public static void method153() {
		field569 = 0;
		field567 = 0;
		field570 = field565;
		field568 = field566;
		field571 = field570 - 1;
		field572 = field570 / 2;
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void method154(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 > field565) {
			arg2 = field565;
		}

		if (arg0 > field566) {
			arg0 = field566;
		}

		field569 = arg3;
		field567 = arg1;
		field570 = arg2;
		field568 = arg0;
		field571 = field570 - 1;
		field572 = field570 / 2;
		field573 = field568 / 2;
	}

	@ObfuscatedName("gb.b(Z)V")
	public static void method155() {
		int var0 = field566 * field565;
		for (int var1 = 0; var1 < var0; var1++) {
			field564[var1] = 0;
		}
	}

	@ObfuscatedName("gb.a(IIIZIII)V")
	public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field569) {
			arg0 -= field569 - arg4;
			arg4 = field569;
		}

		if (arg1 < field567) {
			arg5 -= field567 - arg1;
			arg1 = field567;
		}

		if (arg0 + arg4 > field570) {
			arg0 = field570 - arg4;
		}

		if (arg1 + arg5 > field568) {
			arg5 = field568 - arg1;
		}

		int var6 = 256 - arg2;
		int var7 = (arg3 >> 16 & 0xFF) * arg2;
		int var8 = (arg3 >> 8 & 0xFF) * arg2;
		int var9 = (arg3 & 0xFF) * arg2;
		int var10 = field565 - arg0;
		int var11 = field565 * arg1 + arg4;
		for (int var12 = 0; var12 < arg5; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = (field564[var11] >> 16 & 0xFF) * var6;
				int var15 = (field564[var11] >> 8 & 0xFF) * var6;
				int var16 = (field564[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field564[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("gb.a(IIIIII)V")
	public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field569) {
			arg4 -= field569 - arg3;
			arg3 = field569;
		}

		if (arg1 < field567) {
			arg2 -= field567 - arg1;
			arg1 = field567;
		}

		if (arg3 + arg4 > field570) {
			arg4 = field570 - arg3;
		}

		if (arg1 + arg2 > field568) {
			arg2 = field568 - arg1;
		}

		int var5 = field565 - arg4;
		int var6 = field565 * arg1 + arg3;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				field564[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("gb.b(IIIIII)V")
	public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method160(arg1, arg0, arg4, arg3);
		method160(arg1, arg0, arg2 + arg4 - 1, arg3);
		method162(arg0, arg3, arg2, arg4);
		method162(arg0, arg1 + arg3 - 1, arg2, arg4);
	}

	@ObfuscatedName("gb.a(IIIIIII)V")
	public static void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method161(arg2, arg0, arg3, arg5, arg4);
		method161(arg2, arg0, arg3, arg1 + arg5 - 1, arg4);

		if (arg1 >= 3) {
			method163(arg0, arg5 + 1, arg3, arg1 - 2, arg4);
			method163(arg0, arg5 + 1, arg3, arg1 - 2, arg2 + arg4 - 1);
		}
	}

	@ObfuscatedName("gb.b(IIIII)V")
	public static void method160(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field567 && arg2 < field568) {
			if (arg3 < field569) {
				arg0 -= field569 - arg3;
				arg3 = field569;
			}

			if (arg0 + arg3 > field570) {
				arg0 = field570 - arg3;
			}

			int var4 = field565 * arg2 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field564[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("gb.a(IBIIII)V")
	public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field567 && arg3 < field568) {
			if (arg4 < field569) {
				arg0 -= field569 - arg4;
				arg4 = field569;
			}

			if (arg0 + arg4 > field570) {
				arg0 = field570 - arg4;
			}

			int var5 = 256 - arg1;
			int var6 = (arg2 >> 16 & 0xFF) * arg1;
			int var7 = (arg2 >> 8 & 0xFF) * arg1;
			int var8 = (arg2 & 0xFF) * arg1;
			int var9 = field565 * arg3 + arg4;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field564[var9] >> 16 & 0xFF) * var5;
				int var12 = (field564[var9] >> 8 & 0xFF) * var5;
				int var13 = (field564[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field564[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("gb.c(IIIII)V")
	public static void method162(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field569 && arg1 < field570) {
			if (arg3 < field567) {
				arg2 -= field567 - arg3;
				arg3 = field567;
			}

			if (arg2 + arg3 > field568) {
				arg2 = field568 - arg3;
			}

			int var4 = field565 * arg3 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field564[field565 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("gb.a(BIIIII)V")
	public static void method163(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field569 && arg4 < field570) {
			if (arg1 < field567) {
				arg3 -= field567 - arg1;
				arg1 = field567;
			}

			if (arg1 + arg3 > field568) {
				arg3 = field568 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg2 >> 16 & 0xFF) * arg0;
			int var7 = (arg2 >> 8 & 0xFF) * arg0;
			int var8 = (arg2 & 0xFF) * arg0;
			int var9 = field565 * arg1 + arg4;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field564[var9] >> 16 & 0xFF) * var5;
				int var12 = (field564[var9] >> 8 & 0xFF) * var5;
				int var13 = (field564[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field564[var9] = var14;
				var9 += field565;
			}
		}
	}
}
