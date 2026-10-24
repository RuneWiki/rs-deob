package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("hb")
public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("hb.p")
	public static int[] field561;

	@ObfuscatedName("hb.q")
	public static int field562;

	@ObfuscatedName("hb.r")
	public static int field563;

	@ObfuscatedName("hb.s")
	public static int field564;

	@ObfuscatedName("hb.t")
	public static int field565;

	@ObfuscatedName("hb.u")
	public static int field566;

	@ObfuscatedName("hb.v")
	public static int field567;

	@ObfuscatedName("hb.w")
	public static int field568;

	@ObfuscatedName("hb.x")
	public static int field569;

	@ObfuscatedName("hb.y")
	public static int field570;

	@ObfuscatedName("hb.a(II[II)V")
	public static void method164(int arg0, int[] arg1, int arg2) {
		field561 = arg1;
		field562 = arg0;
		field563 = arg2;
		method166(arg0, arg2, 0, 0);
	}

	@ObfuscatedName("hb.a(B)V")
	public static void method165() {
		field566 = 0;
		field564 = 0;
		field567 = field562;
		field565 = field563;
		field568 = field567 - 1;
		field569 = field567 / 2;
	}

	@ObfuscatedName("hb.a(IIIII)V")
	public static void method166(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg0 > field562) {
			arg0 = field562;
		}

		if (arg1 > field563) {
			arg1 = field563;
		}

		field566 = arg3;
		field564 = arg2;
		field567 = arg0;
		field565 = arg1;
		field568 = field567 - 1;
		field569 = field567 / 2;
		field570 = field565 / 2;
	}

	@ObfuscatedName("hb.a(Z)V")
	public static void method167() {
		int var0 = field563 * field562;
		for (int var1 = 0; var1 < var0; var1++) {
			field561[var1] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIIIB)V")
	public static void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 < field566) {
			arg3 -= field566 - arg5;
			arg5 = field566;
		}

		if (arg0 < field564) {
			arg2 -= field564 - arg0;
			arg0 = field564;
		}

		if (arg3 + arg5 > field567) {
			arg3 = field567 - arg5;
		}

		if (arg0 + arg2 > field565) {
			arg2 = field565 - arg0;
		}

		int var6 = 256 - arg1;
		int var7 = (arg4 >> 16 & 0xFF) * arg1;
		int var8 = (arg4 >> 8 & 0xFF) * arg1;
		int var9 = (arg4 & 0xFF) * arg1;
		int var10 = field562 - arg3;
		int var11 = field562 * arg0 + arg5;
		for (int var12 = 0; var12 < arg2; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field561[var11] >> 16 & 0xFF) * var6;
				int var15 = (field561[var11] >> 8 & 0xFF) * var6;
				int var16 = (field561[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field561[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void method169(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field566) {
			arg1 -= field566 - arg3;
			arg3 = field566;
		}

		if (arg4 < field564) {
			arg2 -= field564 - arg4;
			arg4 = field564;
		}

		if (arg1 + arg3 > field567) {
			arg1 = field567 - arg3;
		}

		if (arg2 + arg4 > field565) {
			arg2 = field565 - arg4;
		}

		int var5 = field562 - arg1;
		int var6 = field562 * arg4 + arg3;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field561[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("hb.b(IIIIII)V")
	public static void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method172(arg2, arg4, arg1, arg3);
		method172(arg2, arg0 + arg4 - 1, arg1, arg3);
		method174(arg3, arg2, arg4, arg0);
		method174(arg1 + arg3 - 1, arg2, arg4, arg0);
	}

	@ObfuscatedName("hb.a(IIIIIZI)V")
	public static void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method173(arg3, arg4, arg1, arg2, arg5);
		method173(arg0 + arg3 - 1, arg4, arg1, arg2, arg5);

		if (arg0 >= 3) {
			method175(arg2, arg3 + 1, arg5, arg0 - 2, arg1);
			method175(arg2 + arg4 - 1, arg3 + 1, arg5, arg0 - 2, arg1);
		}
	}

	@ObfuscatedName("hb.b(IIIII)V")
	public static void method172(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field564 && arg1 < field565) {
			if (arg3 < field566) {
				arg2 -= field566 - arg3;
				arg3 = field566;
			}

			if (arg2 + arg3 > field567) {
				arg2 = field567 - arg3;
			}

			int var4 = field562 * arg1 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				field561[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("hb.c(IIIIII)V")
	public static void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field564 && arg0 < field565) {
			if (arg3 < field566) {
				arg1 -= field566 - arg3;
				arg3 = field566;
			}

			if (arg1 + arg3 > field567) {
				arg1 = field567 - arg3;
			}

			int var5 = 256 - arg4;
			int var6 = (arg2 >> 16 & 0xFF) * arg4;
			int var7 = (arg2 >> 8 & 0xFF) * arg4;
			int var8 = (arg2 & 0xFF) * arg4;
			int var9 = field562 * arg0 + arg3;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field561[var9] >> 16 & 0xFF) * var5;
				int var12 = (field561[var9] >> 8 & 0xFF) * var5;
				int var13 = (field561[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field561[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("hb.a(IIIIZ)V")
	public static void method174(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field566 && arg0 < field567) {
			if (arg2 < field564) {
				arg3 -= field564 - arg2;
				arg2 = field564;
			}

			if (arg2 + arg3 > field565) {
				arg3 = field565 - arg2;
			}

			int var4 = field562 * arg2 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field561[field562 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("hb.a(IIIIIB)V")
	public static void method175(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field566 && arg0 < field567) {
			if (arg1 < field564) {
				arg3 -= field564 - arg1;
				arg1 = field564;
			}

			if (arg1 + arg3 > field565) {
				arg3 = field565 - arg1;
			}

			int var5 = 256 - arg2;
			int var6 = (arg4 >> 16 & 0xFF) * arg2;
			int var7 = (arg4 >> 8 & 0xFF) * arg2;
			int var8 = (arg4 & 0xFF) * arg2;
			int var9 = field562 * arg1 + arg0;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field561[var9] >> 16 & 0xFF) * var5;
				int var12 = (field561[var9] >> 8 & 0xFF) * var5;
				int var13 = (field561[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field561[var9] = var14;
				var9 += field562;
			}
		}
	}
}
