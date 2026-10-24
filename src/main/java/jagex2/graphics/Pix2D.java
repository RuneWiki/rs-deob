package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable2;

@ObfuscatedName("hb")
public class Pix2D extends Linkable2 {

	@ObfuscatedName("hb.o")
	public static int[] pixels;

	@ObfuscatedName("hb.p")
	public static int width;

	@ObfuscatedName("hb.q")
	public static int height;

	@ObfuscatedName("hb.r")
	public static int clipMinY;

	@ObfuscatedName("hb.s")
	public static int clipMaxY;

	@ObfuscatedName("hb.t")
	public static int clipMinX;

	@ObfuscatedName("hb.u")
	public static int clipMaxX;

	@ObfuscatedName("hb.v")
	public static int sizeX;

	@ObfuscatedName("hb.w")
	public static int maxX;

	@ObfuscatedName("hb.x")
	public static int maxY;

	@ObfuscatedName("hb.a(II[II)V")
	public static void setPixels(int arg0, int[] arg1, int arg2) {
		pixels = arg1;
		width = arg2;
		height = arg0;
		setClipping(arg2, 0, arg0, 0);
	}

	@ObfuscatedName("hb.a(I)V")
	public static void resetClipping() {
		clipMinX = 0;
		clipMinY = 0;
		clipMaxX = width;
		clipMaxY = height;
		sizeX = clipMaxX - 1;
		maxX = clipMaxX / 2;
	}

	@ObfuscatedName("hb.a(IZIII)V")
	public static void setClipping(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 > width) {
			arg0 = width;
		}

		if (arg2 > height) {
			arg2 = height;
		}

		clipMinX = arg1;
		clipMinY = arg3;
		clipMaxX = arg0;
		clipMaxY = arg2;
		sizeX = clipMaxX - 1;
		maxX = clipMaxX / 2;
		maxY = clipMaxY / 2;
	}

	@ObfuscatedName("hb.b(I)V")
	public static void cls() {
		int var0 = height * width;
		for (int var1 = 0; var1 < var0; var1++) {
			pixels[var1] = 0;
		}
	}

	@ObfuscatedName("hb.a(IIIIIII)V")
	public static void fillRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < clipMinX) {
			arg4 -= clipMinX - arg2;
			arg2 = clipMinX;
		}

		if (arg0 < clipMinY) {
			arg3 -= clipMinY - arg0;
			arg0 = clipMinY;
		}

		if (arg2 + arg4 > clipMaxX) {
			arg4 = clipMaxX - arg2;
		}

		if (arg0 + arg3 > clipMaxY) {
			arg3 = clipMaxY - arg0;
		}

		int var6 = 256 - arg1;
		int var7 = (arg5 >> 16 & 0xFF) * arg1;
		int var8 = (arg5 >> 8 & 0xFF) * arg1;
		int var9 = (arg5 & 0xFF) * arg1;
		int var10 = width - arg4;
		int var11 = width * arg0 + arg2;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = (pixels[var11] >> 16 & 0xFF) * var6;
				int var15 = (pixels[var11] >> 8 & 0xFF) * var6;
				int var16 = (pixels[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				pixels[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("hb.a(IIIIBI)V")
	public static void fillRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < clipMinX) {
			arg1 -= clipMinX - arg2;
			arg2 = clipMinX;
		}

		if (arg3 < clipMinY) {
			arg0 -= clipMinY - arg3;
			arg3 = clipMinY;
		}

		if (arg1 + arg2 > clipMaxX) {
			arg1 = clipMaxX - arg2;
		}

		if (arg0 + arg3 > clipMaxY) {
			arg0 = clipMaxY - arg3;
		}

		int var5 = width - arg1;
		int var6 = width * arg3 + arg2;
		for (int var7 = -arg0; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				pixels[var6++] = arg4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("hb.a(IIIZII)V")
	public static void drawRect(int arg0, int arg1, int arg2, int arg3, int arg4) {
		hline(arg3, arg2, arg0, arg1);
		hline(arg3, arg2 + arg4 - 1, arg0, arg1);
		vline(arg2, arg4, arg0, arg3);
		vline(arg2, arg4, arg0, arg1 + arg3 - 1);
	}

	@ObfuscatedName("hb.a(IBIIIII)V")
	public static void drawRectTrans(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		hlineTrans(arg1, arg5, arg2, arg0, arg3);
		hlineTrans(arg1, arg4 + arg5 - 1, arg2, arg0, arg3);

		if (arg4 >= 3) {
			vlineTrans(arg3, arg0, arg1, arg5 + 1, arg4 - 2);
			vlineTrans(arg2 + arg3 - 1, arg0, arg1, arg5 + 1, arg4 - 2);
		}
	}

	@ObfuscatedName("hb.a(IIIII)V")
	public static void hline(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= clipMinY && arg1 < clipMaxY) {
			if (arg0 < clipMinX) {
				arg3 -= clipMinX - arg0;
				arg0 = clipMinX;
			}

			if (arg0 + arg3 > clipMaxX) {
				arg3 = clipMaxX - arg0;
			}

			int var4 = width * arg1 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				pixels[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("hb.a(IIIIII)V")
	public static void hlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= clipMinY && arg1 < clipMaxY) {
			if (arg4 < clipMinX) {
				arg2 -= clipMinX - arg4;
				arg4 = clipMinX;
			}

			if (arg2 + arg4 > clipMaxX) {
				arg2 = clipMaxX - arg4;
			}

			int var5 = 256 - arg3;
			int var6 = (arg0 >> 16 & 0xFF) * arg3;
			int var7 = (arg0 >> 8 & 0xFF) * arg3;
			int var8 = (arg0 & 0xFF) * arg3;
			int var9 = width * arg1 + arg4;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
				int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
				int var13 = (pixels[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				pixels[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("hb.b(IIIII)V")
	public static void vline(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= clipMinX && arg3 < clipMaxX) {
			if (arg0 < clipMinY) {
				arg1 -= clipMinY - arg0;
				arg0 = clipMinY;
			}

			if (arg0 + arg1 > clipMaxY) {
				arg1 = clipMaxY - arg0;
			}

			int var4 = width * arg0 + arg3;
			for (int var5 = 0; var5 < arg1; var5++) {
				pixels[width * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("hb.a(IIZIII)V")
	public static void vlineTrans(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= clipMinX && arg0 < clipMaxX) {
			if (arg3 < clipMinY) {
				arg4 -= clipMinY - arg3;
				arg3 = clipMinY;
			}

			if (arg3 + arg4 > clipMaxY) {
				arg4 = clipMaxY - arg3;
			}

			int var5 = 256 - arg1;
			int var6 = (arg2 >> 16 & 0xFF) * arg1;
			int var7 = (arg2 >> 8 & 0xFF) * arg1;
			int var8 = (arg2 & 0xFF) * arg1;
			int var9 = width * arg3 + arg0;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (pixels[var9] >> 16 & 0xFF) * var5;
				int var12 = (pixels[var9] >> 8 & 0xFF) * var5;
				int var13 = (pixels[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				pixels[var9] = var14;
				var9 += width;
			}
		}
	}
}
