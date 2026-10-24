package deob;

@ObfuscatedName("gb")
public class class33 extends class23 {

	@ObfuscatedName("gb.l")
	public static int[] field563;

	@ObfuscatedName("gb.m")
	public static int field564;

	@ObfuscatedName("gb.n")
	public static int field565;

	@ObfuscatedName("gb.o")
	public static int field566;

	@ObfuscatedName("gb.p")
	public static int field567;

	@ObfuscatedName("gb.q")
	public static int field568;

	@ObfuscatedName("gb.r")
	public static int field569;

	@ObfuscatedName("gb.s")
	public static int field570;

	@ObfuscatedName("gb.t")
	public static int field571;

	@ObfuscatedName("gb.u")
	public static int field572;

	@ObfuscatedName("gb.a([IIII)V")
	public static void method152(int[] arg0, int arg1, int arg2) {
		field563 = arg0;
		field564 = arg2;
		field565 = arg1;
		method154(0, arg2, 0, arg1);
	}

	@ObfuscatedName("gb.a(Z)V")
	public static void method153() {
		field568 = 0;
		field566 = 0;
		field569 = field564;
		field567 = field565;
		field570 = field569 - 1;
		field571 = field569 / 2;
	}

	@ObfuscatedName("gb.a(IIIBI)V")
	public static void method154(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 > field564) {
			arg1 = field564;
		}

		if (arg3 > field565) {
			arg3 = field565;
		}

		field568 = arg0;
		field566 = arg2;
		field569 = arg1;
		field567 = arg3;
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

	@ObfuscatedName("gb.a(IIIIIZI)V")
	public static void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field568) {
			arg0 -= field568 - arg3;
			arg3 = field568;
		}

		if (arg1 < field566) {
			arg2 -= field566 - arg1;
			arg1 = field566;
		}

		if (arg0 + arg3 > field569) {
			arg0 = field569 - arg3;
		}

		if (arg1 + arg2 > field567) {
			arg2 = field567 - arg1;
		}

		int var6 = 256 - arg4;
		int var7 = (arg5 >> 16 & 0xFF) * arg4;
		int var8 = (arg5 >> 8 & 0xFF) * arg4;
		int var9 = (arg5 & 0xFF) * arg4;
		int var10 = field564 - arg0;
		int var11 = field564 * arg1 + arg3;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = (field563[var11] >> 16 & 0xFF) * var6;
				int var15 = (field563[var11] >> 8 & 0xFF) * var6;
				int var16 = (field563[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field563[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("gb.a(IIIZII)V")
	public static void method157(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field568) {
			arg3 -= field568 - arg4;
			arg4 = field568;
		}

		if (arg0 < field566) {
			arg1 -= field566 - arg0;
			arg0 = field566;
		}

		if (arg3 + arg4 > field569) {
			arg3 = field569 - arg4;
		}

		if (arg0 + arg1 > field567) {
			arg1 = field567 - arg0;
		}

		int var5 = field564 - arg3;
		int var6 = field564 * arg0 + arg4;
		for (int var7 = -arg1; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field563[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("gb.a(IIIIII)V")
	public static void method158(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method160(arg1, arg0, arg3, arg2);
		method160(arg1 + arg4 - 1, arg0, arg3, arg2);
		method162(arg3, arg4, arg0, arg1);
		method162(arg3, arg4, arg0 + arg2 - 1, arg1);
	}

	@ObfuscatedName("gb.a(IIZIIII)V")
	public static void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method161(arg1, arg4, arg0, arg5, arg2);
		method161(arg1 + arg3 - 1, arg4, arg0, arg5, arg2);

		if (arg3 >= 3) {
			method163(arg4, arg0, arg1 + 1, arg3 - 2, arg2);
			method163(arg4 + arg5 - 1, arg0, arg1 + 1, arg3 - 2, arg2);
		}
	}

	@ObfuscatedName("gb.a(IIIII)V")
	public static void method160(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field566 && arg0 < field567) {
			if (arg1 < field568) {
				arg3 -= field568 - arg1;
				arg1 = field568;
			}

			if (arg1 + arg3 > field569) {
				arg3 = field569 - arg1;
			}

			int var4 = field564 * arg0 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field563[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("gb.a(IIIIIB)V")
	public static void method161(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field566 && arg0 < field567) {
			if (arg1 < field568) {
				arg3 -= field568 - arg1;
				arg1 = field568;
			}

			if (arg1 + arg3 > field569) {
				arg3 = field569 - arg1;
			}

			int var5 = 256 - arg4;
			int var6 = (arg2 >> 16 & 0xFF) * arg4;
			int var7 = (arg2 >> 8 & 0xFF) * arg4;
			int var8 = (arg2 & 0xFF) * arg4;
			int var9 = field564 * arg0 + arg1;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field563[var9] >> 16 & 0xFF) * var5;
				int var12 = (field563[var9] >> 8 & 0xFF) * var5;
				int var13 = (field563[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field563[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("gb.b(IIIII)V")
	public static void method162(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field568 && arg2 < field569) {
			if (arg3 < field566) {
				arg1 -= field566 - arg3;
				arg3 = field566;
			}

			if (arg1 + arg3 > field567) {
				arg1 = field567 - arg3;
			}

			int var4 = field564 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field563[field564 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("gb.a(ZIIIII)V")
	public static void method163(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field568 && arg0 < field569) {
			if (arg2 < field566) {
				arg3 -= field566 - arg2;
				arg2 = field566;
			}

			if (arg2 + arg3 > field567) {
				arg3 = field567 - arg2;
			}

			int var5 = 256 - arg4;
			int var6 = (arg1 >> 16 & 0xFF) * arg4;
			int var7 = (arg1 >> 8 & 0xFF) * arg4;
			int var8 = (arg1 & 0xFF) * arg4;
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
