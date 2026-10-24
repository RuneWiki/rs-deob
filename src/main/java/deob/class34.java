package deob;

@ObfuscatedName("hb")
public class class34 extends class24 {

	@ObfuscatedName("hb.o")
	public static int[] field564;

	@ObfuscatedName("hb.p")
	public static int field565;

	@ObfuscatedName("hb.q")
	public static int field566;

	@ObfuscatedName("hb.r")
	public static int field567;

	@ObfuscatedName("hb.s")
	public static int field568;

	@ObfuscatedName("hb.t")
	public static int field569;

	@ObfuscatedName("hb.u")
	public static int field570;

	@ObfuscatedName("hb.v")
	public static int field571;

	@ObfuscatedName("hb.w")
	public static int field572;

	@ObfuscatedName("hb.x")
	public static int field573;

	@ObfuscatedName("hb.a([IIIB)V")
	public static void method165(int[] arg0, int arg1, int arg2) {
		field564 = arg0;
		field565 = arg1;
		field566 = arg2;
		method167(0, arg1, arg2, 0);
	}

	@ObfuscatedName("hb.a(B)V")
	public static void method166() {
		field569 = 0;
		field567 = 0;
		field570 = field565;
		field568 = field566;
		field571 = field570 - 1;
		field572 = field570 / 2;
	}

	@ObfuscatedName("hb.a(IIIIZ)V")
	public static void method167(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg1 > field565) {
			arg1 = field565;
		}

		if (arg2 > field566) {
			arg2 = field566;
		}

		field569 = arg0;
		field567 = arg3;
		field570 = arg1;
		field568 = arg2;
		field571 = field570 - 1;
		field572 = field570 / 2;
		field573 = field568 / 2;
	}

	@ObfuscatedName("hb.a(I)V")
	public static void method168() {
		int var0 = field566 * field565;
		for (int var1 = 0; var1 < var0; var1++) {
			field564[var1] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIBIII)V")
	public static void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < field569) {
			arg4 -= field569 - arg0;
			arg0 = field569;
		}

		if (arg2 < field567) {
			arg1 -= field567 - arg2;
			arg2 = field567;
		}

		if (arg0 + arg4 > field570) {
			arg4 = field570 - arg0;
		}

		if (arg1 + arg2 > field568) {
			arg1 = field568 - arg2;
		}

		int var6 = 256 - arg3;
		int var7 = (arg5 >> 16 & 0xFF) * arg3;
		int var8 = (arg5 >> 8 & 0xFF) * arg3;
		int var9 = (arg5 & 0xFF) * arg3;
		int var10 = field565 - arg4;
		int var11 = field565 * arg2 + arg0;
		for (int var12 = 0; var12 < arg1; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (field564[var11] >> 16 & 0xFF) * var6;
				int var15 = (field564[var11] >> 8 & 0xFF) * var6;
				int var16 = (field564[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field564[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field569) {
			arg0 -= field569 - arg1;
			arg1 = field569;
		}

		if (arg2 < field567) {
			arg3 -= field567 - arg2;
			arg2 = field567;
		}

		if (arg0 + arg1 > field570) {
			arg0 = field570 - arg1;
		}

		if (arg2 + arg3 > field568) {
			arg3 = field568 - arg2;
		}

		int var5 = field565 - arg0;
		int var6 = field565 * arg2 + arg1;
		for (int var7 = -arg3; var7 < 0; var7++) {
			for (int var8 = -arg0; var8 < 0; var8++) {
				field564[var6++] = arg4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("hb.b(IIIIII)V")
	public static void method171(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method173(arg1, arg4, arg2, arg3);
		method173(arg0 + arg1 - 1, arg4, arg2, arg3);
		method175(arg1, arg0, arg3, arg4);
		method175(arg1, arg0, arg3, arg2 + arg4 - 1);
	}

	@ObfuscatedName("hb.a(IIIIIII)V")
	public static void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method174(arg3, arg5, arg0, arg1, arg4);
		method174(arg2 + arg3 - 1, arg5, arg0, arg1, arg4);

		if (arg2 >= 3) {
			method176(arg4, arg1, arg2 - 2, arg5, arg3 + 1);
			method176(arg0 + arg4 - 1, arg1, arg2 - 2, arg5, arg3 + 1);
		}
	}

	@ObfuscatedName("hb.a(IIIIB)V")
	public static void method173(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field567 && arg0 < field568) {
			if (arg1 < field569) {
				arg2 -= field569 - arg1;
				arg1 = field569;
			}

			if (arg1 + arg2 > field570) {
				arg2 = field570 - arg1;
			}

			int var4 = field565 * arg0 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field564[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("hb.a(IIIIIB)V")
	public static void method174(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field567 && arg0 < field568) {
			if (arg4 < field569) {
				arg2 -= field569 - arg4;
				arg4 = field569;
			}

			if (arg2 + arg4 > field570) {
				arg2 = field570 - arg4;
			}

			int var5 = 256 - arg1;
			int var6 = (arg3 >> 16 & 0xFF) * arg1;
			int var7 = (arg3 >> 8 & 0xFF) * arg1;
			int var8 = (arg3 & 0xFF) * arg1;
			int var9 = field565 * arg0 + arg4;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field564[var9] >> 16 & 0xFF) * var5;
				int var12 = (field564[var9] >> 8 & 0xFF) * var5;
				int var13 = (field564[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field564[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("hb.a(IIZII)V")
	public static void method175(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field569 && arg3 < field570) {
			if (arg0 < field567) {
				arg1 -= field567 - arg0;
				arg0 = field567;
			}

			if (arg0 + arg1 > field568) {
				arg1 = field568 - arg0;
			}

			int var4 = field565 * arg0 + arg3;
			for (int var5 = 0; var5 < arg1; var5++) {
				field564[field565 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("hb.a(IIIZII)V")
	public static void method176(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field569 && arg0 < field570) {
			if (arg4 < field567) {
				arg2 -= field567 - arg4;
				arg4 = field567;
			}

			if (arg2 + arg4 > field568) {
				arg2 = field568 - arg4;
			}

			int var5 = 256 - arg3;
			int var6 = (arg1 >> 16 & 0xFF) * arg3;
			int var7 = (arg1 >> 8 & 0xFF) * arg3;
			int var8 = (arg1 & 0xFF) * arg3;
			int var9 = field565 * arg4 + arg0;
			for (int var10 = 0; var10 < arg2; var10++) {
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
