package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable2;

@ObfuscatedName("fb")
public class Pix2D extends Linkable2 {

	@ObfuscatedName("fb.k")
	public static int[] pixels;

	@ObfuscatedName("fb.l")
	public static int width;

	@ObfuscatedName("fb.m")
	public static int height;

	@ObfuscatedName("fb.n")
	public static int clipMinY;

	@ObfuscatedName("fb.o")
	public static int clipMaxY;

	@ObfuscatedName("fb.p")
	public static int clipMinX;

	@ObfuscatedName("fb.q")
	public static int clipMaxX;

	@ObfuscatedName("fb.r")
	public static int sizeX;

	@ObfuscatedName("fb.s")
	public static int maxX;

	@ObfuscatedName("fb.t")
	public static int maxY;

	@ObfuscatedName("fb.a(I[III)V")
	public static void setPixels(int arg0, int[] arg1, int arg2) {
		pixels = arg1;
		width = arg0;
		height = arg2;
		setClipping(arg2, 0, arg0, 0);
	}

	@ObfuscatedName("fb.a(I)V")
	public static void resetClipping() {
		clipMinX = 0;
		clipMinY = 0;
		clipMaxX = width;
		clipMaxY = height;
		sizeX = clipMaxX - 1;
		maxX = clipMaxX / 2;
	}

	@ObfuscatedName("fb.a(IIIII)V")
	public static void setClipping(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 > width) {
			arg2 = width;
		}

		if (arg0 > height) {
			arg0 = height;
		}

		clipMinX = arg3;
		clipMinY = arg1;
		clipMaxX = arg2;
		clipMaxY = arg0;
		sizeX = clipMaxX - 1;
		maxX = clipMaxX / 2;
		maxY = clipMaxY / 2;
	}

	@ObfuscatedName("fb.b(I)V")
	public static void cls() {
		int var0 = height * width;
		for (int var1 = 0; var1 < var0; var1++) {
			pixels[var1] = 0;
		}
	}

	@ObfuscatedName("fb.a(IIIBII)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < clipMinX) {
			arg3 -= clipMinX - arg1;
			arg1 = clipMinX;
		}

		if (arg0 < clipMinY) {
			arg4 -= clipMinY - arg0;
			arg0 = clipMinY;
		}

		if (arg1 + arg3 > clipMaxX) {
			arg3 = clipMaxX - arg1;
		}

		if (arg0 + arg4 > clipMaxY) {
			arg4 = clipMaxY - arg0;
		}

		int var5 = width - arg3;
		int var6 = width * arg0 + arg1;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				pixels[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("fb.a(IIIIII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		hline(arg1, arg3, arg4, arg0);
		hline(arg1, arg2 + arg3 - 1, arg4, arg0);
		vline(arg1, arg3, arg2, arg0);
		vline(arg1, arg3, arg2, arg0 + arg4 - 1);
	}

	@ObfuscatedName("fb.b(IIIII)V")
	public static void hline(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= clipMinY && arg1 < clipMaxY) {
			if (arg3 < clipMinX) {
				arg2 -= clipMinX - arg3;
				arg3 = clipMinX;
			}

			if (arg2 + arg3 > clipMaxX) {
				arg2 = clipMaxX - arg3;
			}

			int var4 = width * arg1 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				pixels[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("fb.c(IIIII)V")
	public static void vline(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= clipMinX && arg3 < clipMaxX) {
			if (arg1 < clipMinY) {
				arg2 -= clipMinY - arg1;
				arg1 = clipMinY;
			}

			if (arg1 + arg2 > clipMaxY) {
				arg2 = clipMaxY - arg1;
			}

			int var4 = width * arg1 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				pixels[width * var5 + var4] = arg0;
			}
		}
	}
}
