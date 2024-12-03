package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;

public class Pix2D extends DoublyLinkable {

	@ObfuscatedName("AFCKELYG.i")
	public static int _flowObfuscator4 = 1;

	@ObfuscatedName("AFCKELYG.j")
	public static boolean _flowObfuscator5 = true;

	@ObfuscatedName("AFCKELYG.k")
	public static int _flowObfuscator6 = -12499;

	@ObfuscatedName("AFCKELYG.r")
	public static int left;

	@ObfuscatedName("AFCKELYG.s")
	public static int right;

	@ObfuscatedName("AFCKELYG.t")
	public static int boundX;

	@ObfuscatedName("AFCKELYG.u")
	public static int centerX2d;

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

	@ObfuscatedName("AFCKELYG.w")
	public static boolean _flowObfuscator8;

	@ObfuscatedName("AFCKELYG.l")
	public static boolean _flowObfuscator7;

	@ObfuscatedName("AFCKELYG.m")
	public static int[] data;

	@ObfuscatedName("AFCKELYG.a(III[I)V")
	public static void bind(int arg0, int arg1, int arg2, int[] arg3) {
		data = arg3;
		while (arg2 >= 0) {
			_flowObfuscator4 = 275;
		}
		width2d = arg1;
		height2d = arg0;
		setBounds(arg0, 0, false, arg1, 0);
	}

	@ObfuscatedName("AFCKELYG.a(I)V")
	public static void resetBounds(int arg0) {
		if (arg0 < 4 || arg0 > 4) {
			return;
		}
		left = 0;
		top = 0;
		right = width2d;
		bottom = height2d;
		boundX = right - 1;
		centerX2d = right / 2;
	}

	@ObfuscatedName("AFCKELYG.a(IIZII)V")
	public static void setBounds(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg3 > width2d) {
			arg3 = width2d;
		}
		if (arg0 > height2d) {
			arg0 = height2d;
		}
		left = arg1;
		top = arg4;
		right = arg3;
		bottom = arg0;
		boundX = right - 1;
		if (arg2) {
			_flowObfuscator4 = 458;
		}
		centerX2d = right / 2;
		centerY2d = bottom / 2;
	}

	@ObfuscatedName("AFCKELYG.a(Z)V")
	public static void clear(boolean arg0) {
		if (!arg0) {
			_flowObfuscator7 = !_flowObfuscator7;
		}
		int var1 = height2d * width2d;
		for (int var2 = 0; var2 < var1; var2++) {
			data[var2] = 0;
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIIII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 < left) {
			arg2 -= left - arg6;
			arg6 = left;
		}
		if (arg1 < top) {
			arg3 -= top - arg1;
			arg1 = top;
		}
		if (arg2 + arg6 > right) {
			arg2 = right - arg6;
		}
		if (arg1 + arg3 > bottom) {
			arg3 = bottom - arg1;
		}
		int var7 = 256 - arg4;
		int var8 = (arg0 >> 16 & 0xFF) * arg4;
		int var9 = (arg0 >> 8 & 0xFF) * arg4;
		int var10 = (arg0 & 0xFF) * arg4;
		int var11 = width2d - arg2;
		int var12 = width2d * arg1 + arg6;
		for (int var13 = 0; var13 < arg3; var13++) {
			for (int var14 = -arg2; var14 < 0; var14++) {
				int var15 = (data[var12] >> 16 & 0xFF) * var7;
				int var16 = (data[var12] >> 8 & 0xFF) * var7;
				int var17 = (data[var12] & 0xFF) * var7;
				int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
				data[var12++] = var18;
			}
			var12 += var11;
		}
		if (arg5 == 0) {
			;
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
		int var6 = width2d - arg4;
		int var7 = width2d * arg1 + arg2;
		if (arg5 != 0) {
			_flowObfuscator4 = -374;
		}
		for (int var8 = -arg0; var8 < 0; var8++) {
			for (int var9 = -arg4; var9 < 0; var9++) {
				data[var7++] = arg3;
			}
			var7 += var6;
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIIZ)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		drawHorizontalLine(arg4, arg3, arg1, arg0, (byte) 4);
		drawHorizontalLine(arg2 + arg4 - 1, arg3, arg1, arg0, (byte) 4);
		drawVerticalLine(arg4, arg3, arg2, arg0, _flowObfuscator6);
		drawVerticalLine(arg4, arg3, arg2, arg0 + arg1 - 1, _flowObfuscator6);
		if (arg5) {
			;
		}
	}

	@ObfuscatedName("AFCKELYG.b(IIIIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		drawHorizontalLine(arg3, arg4, arg0, true, arg2, arg5);
		if (arg6 != -17319) {
			for (int var7 = 1; var7 > 0; var7++) {
			}
		}
		drawHorizontalLine(arg3, arg4, arg0 + arg1 - 1, true, arg2, arg5);
		if (arg1 >= 3) {
			drawVerticalLine(arg3, arg5, arg2, arg0 + 1, (byte) 3, arg1 - 2);
			drawVerticalLine(arg3, arg4 + arg5 - 1, arg2, arg0 + 1, (byte) 3, arg1 - 2);
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIB)V")
	public static void drawHorizontalLine(int arg0, int arg1, int arg2, int arg3, byte arg4) {
		if (arg0 < top || arg0 >= bottom) {
			return;
		}
		if (arg3 < left) {
			arg2 -= left - arg3;
			arg3 = left;
		}
		if (arg2 + arg3 > right) {
			arg2 = right - arg3;
		}
		int var5 = width2d * arg0 + arg3;
		if (arg4 == 4) {
			for (int var6 = 0; var6 < arg2; var6++) {
				data[var5 + var6] = arg1;
			}
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIZII)V")
	public static void drawHorizontalLine(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		if (arg2 < top || arg2 >= bottom) {
			return;
		}
		if (arg5 < left) {
			arg1 -= left - arg5;
			arg5 = left;
		}
		if (arg1 + arg5 > right) {
			arg1 = right - arg5;
		}
		int var6 = 256 - arg4;
		int var7 = (arg0 >> 16 & 0xFF) * arg4;
		int var8 = (arg0 >> 8 & 0xFF) * arg4;
		int var9 = (arg0 & 0xFF) * arg4;
		int var10 = width2d * arg2 + arg5;
		if (!arg3) {
			_flowObfuscator4 = 86;
		}
		for (int var11 = 0; var11 < arg1; var11++) {
			int var12 = (data[var10] >> 16 & 0xFF) * var6;
			int var13 = (data[var10] >> 8 & 0xFF) * var6;
			int var14 = (data[var10] & 0xFF) * var6;
			int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
			data[var10++] = var15;
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIII)V")
	public static void drawVerticalLine(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < left || arg3 >= right) {
			return;
		}
		if (arg0 < top) {
			arg2 -= top - arg0;
			arg0 = top;
		}
		if (arg0 + arg2 > bottom) {
			arg2 = bottom - arg0;
		}
		int var5 = width2d * arg0 + arg3;
		if (_flowObfuscator6 == arg4) {
			for (int var6 = 0; var6 < arg2; var6++) {
				data[width2d * var6 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("AFCKELYG.a(IIIIBI)V")
	public static void drawVerticalLine(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
		if (arg1 < left || arg1 >= right) {
			return;
		}
		if (arg3 < top) {
			arg5 -= top - arg3;
			arg3 = top;
		}
		if (arg3 + arg5 > bottom) {
			arg5 = bottom - arg3;
		}
		int var6 = 256 - arg2;
		int var7 = (arg0 >> 16 & 0xFF) * arg2;
		int var8 = (arg0 >> 8 & 0xFF) * arg2;
		int var9 = (arg0 & 0xFF) * arg2;
		if (arg4 != 3) {
			return;
		}
		int var10 = width2d * arg3 + arg1;
		for (int var11 = 0; var11 < arg5; var11++) {
			int var12 = (data[var10] >> 16 & 0xFF) * var6;
			int var13 = (data[var10] >> 8 & 0xFF) * var6;
			int var14 = (data[var10] & 0xFF) * var6;
			int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
			data[var10] = var15;
			var10 += width2d;
		}
	}
}
