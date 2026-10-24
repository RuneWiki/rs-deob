package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

@ObfuscatedName("AFCKELYG")
public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("AFCKELYG.v")
	public static int centerY2d;

	@ObfuscatedName("AFCKELYG.n")
	public static int width2d;

	@ObfuscatedName("AFCKELYG.o")
	public static int height2d;

	@ObfuscatedName("AFCKELYG.p")
	public static int top;

	@ObfuscatedName("AFCKELYG.q")
	public static int bottom;

	@ObfuscatedName("AFCKELYG.r")
	public static int left;

	@ObfuscatedName("AFCKELYG.s")
	public static int right;

	@ObfuscatedName("AFCKELYG.t")
	public static int boundX;

	@ObfuscatedName("AFCKELYG.u")
	public static int centerX2d;

	@ObfuscatedName("AFCKELYG.m")
	public static int[] data;

	@ObfuscatedName("AFCKELYG.a(III[I)V")
	public static void bind(int arg0, int arg1, int[] arg2) {
		data = arg2;
		width2d = arg1;
		height2d = arg0;
		setBounds(arg0, 0, arg1, 0);
	}

	@ObfuscatedName("AFCKELYG.a(I)V")
	public static void resetBounds() {
		left = 0;
		top = 0;
		right = width2d;
		bottom = height2d;
		boundX = right - 1;
		centerX2d = right / 2;
	}

	@ObfuscatedName("AFCKELYG.a(IIZII)V")
	public static void setBounds(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg2 > width2d) {
			arg2 = width2d;
		}

		if (arg0 > height2d) {
			arg0 = height2d;
		}

		left = arg1;
		top = arg3;
		right = arg2;
		bottom = arg0;
		boundX = right - 1;
		centerX2d = right / 2;
		centerY2d = bottom / 2;
	}

	@ObfuscatedName("AFCKELYG.a(Z)V")
	public static void clear() {
		int var0 = height2d * width2d;
		for (int var1 = 0; var1 < var0; var1++) {
			data[var1] = 0;
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIIII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg5 < left) {
			arg2 -= left - arg5;
			arg5 = left;
		}

		if (arg1 < top) {
			arg3 -= top - arg1;
			arg1 = top;
		}

		if (arg2 + arg5 > right) {
			arg2 = right - arg5;
		}

		if (arg1 + arg3 > bottom) {
			arg3 = bottom - arg1;
		}

		int var6 = 256 - arg4;
		int var7 = (arg0 >> 16 & 0xFF) * arg4;
		int var8 = (arg0 >> 8 & 0xFF) * arg4;
		int var9 = (arg0 & 0xFF) * arg4;
		int var10 = width2d - arg2;
		int var11 = width2d * arg1 + arg5;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = (data[var11] >> 16 & 0xFF) * var6;
				int var15 = (data[var11] >> 8 & 0xFF) * var6;
				int var16 = (data[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				data[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < left) {
			arg4 -= left - arg2;
			arg2 = left;
		}

		if (arg1 < top) {
			arg0 -= top - arg1;
			arg1 = top;
		}

		if (arg2 + arg4 > right) {
			arg4 = right - arg2;
		}

		if (arg0 + arg1 > bottom) {
			arg0 = bottom - arg1;
		}

		int var5 = width2d - arg4;
		int var6 = width2d * arg1 + arg2;
		for (int var7 = -arg0; var7 < 0; var7++) {
			for (int var8 = -arg4; var8 < 0; var8++) {
				data[var6++] = arg3;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIIZ)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		drawHorizontalLine(arg4, arg3, arg1, arg0);
		drawHorizontalLine(arg2 + arg4 - 1, arg3, arg1, arg0);
		drawVerticalLine(arg4, arg3, arg2, arg0);
		drawVerticalLine(arg4, arg3, arg2, arg0 + arg1 - 1);
	}

	@ObfuscatedName("AFCKELYG.b(IIIIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		drawHorizontalLine(arg3, arg4, arg0, arg2, arg5);
		drawHorizontalLine(arg3, arg4, arg0 + arg1 - 1, arg2, arg5);

		if (arg1 >= 3) {
			drawVerticalLine(arg3, arg5, arg2, arg0 + 1, arg1 - 2);
			drawVerticalLine(arg3, arg4 + arg5 - 1, arg2, arg0 + 1, arg1 - 2);
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIB)V")
	public static void drawHorizontalLine(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= top && arg0 < bottom) {
			if (arg3 < left) {
				arg2 -= left - arg3;
				arg3 = left;
			}

			if (arg2 + arg3 > right) {
				arg2 = right - arg3;
			}

			int var4 = width2d * arg0 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				data[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIZII)V")
	public static void drawHorizontalLine(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= top && arg2 < bottom) {
			if (arg4 < left) {
				arg1 -= left - arg4;
				arg4 = left;
			}

			if (arg1 + arg4 > right) {
				arg1 = right - arg4;
			}

			int var5 = 256 - arg3;
			int var6 = (arg0 >> 16 & 0xFF) * arg3;
			int var7 = (arg0 >> 8 & 0xFF) * arg3;
			int var8 = (arg0 & 0xFF) * arg3;
			int var9 = width2d * arg2 + arg4;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (data[var9] >> 16 & 0xFF) * var5;
				int var12 = (data[var9] >> 8 & 0xFF) * var5;
				int var13 = (data[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				data[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIII)V")
	public static void drawVerticalLine(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= left && arg3 < right) {
			if (arg0 < top) {
				arg2 -= top - arg0;
				arg0 = top;
			}

			if (arg0 + arg2 > bottom) {
				arg2 = bottom - arg0;
			}

			int var4 = width2d * arg0 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				data[width2d * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIBI)V")
	public static void drawVerticalLine(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= left && arg1 < right) {
			if (arg3 < top) {
				arg4 -= top - arg3;
				arg3 = top;
			}

			if (arg3 + arg4 > bottom) {
				arg4 = bottom - arg3;
			}

			int var5 = 256 - arg2;
			int var6 = (arg0 >> 16 & 0xFF) * arg2;
			int var7 = (arg0 >> 8 & 0xFF) * arg2;
			int var8 = (arg0 & 0xFF) * arg2;
			int var9 = width2d * arg3 + arg1;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (data[var9] >> 16 & 0xFF) * var5;
				int var12 = (data[var9] >> 8 & 0xFF) * var5;
				int var13 = (data[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				data[var9] = var14;
				var9 += width2d;
			}
		}
	}
}
