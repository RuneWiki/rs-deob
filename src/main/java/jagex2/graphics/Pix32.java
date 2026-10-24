package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("CXGZMTJK")
public final class Pix32 extends Pix2D {

	@ObfuscatedName("CXGZMTJK.I")
	public int[] pixels;

	@ObfuscatedName("CXGZMTJK.N")
	public int width;

	@ObfuscatedName("CXGZMTJK.J")
	public int cropRight;

	@ObfuscatedName("CXGZMTJK.O")
	public int height;

	@ObfuscatedName("CXGZMTJK.K")
	public int cropBottom;

	@ObfuscatedName("CXGZMTJK.M")
	public int cropTop;

	@ObfuscatedName("CXGZMTJK.L")
	public int cropLeft;

	public Pix32(int arg0, int arg1) {
		pixels = new int[arg0 * arg1];
		cropRight = width = arg0;
		cropBottom = height = arg1;
		cropLeft = cropTop = 0;
	}

	public Pix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			cropRight = var3.getWidth(arg1);
			cropBottom = var3.getHeight(arg1);
			width = cropRight;
			height = cropBottom;
			cropLeft = 0;
			cropTop = 0;
			pixels = new int[cropBottom * cropRight];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, cropRight, cropBottom, pixels, 0, cropRight);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));
		var5.pos = var4.g2();
		width = var5.g2();
		height = var5.g2();
		int var6 = var5.g1();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.g3();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}

		cropLeft = var5.g1();
		cropTop = var5.g1();
		cropRight = var5.g2();
		cropBottom = var5.g2();
		int var10 = var5.g1();
		int var11 = cropBottom * cropRight;
		pixels = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				pixels[var12] = var7[var4.g1()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < cropRight; var13++) {
				for (int var14 = 0; var14 < cropBottom; var14++) {
					pixels[cropRight * var14 + var13] = var7[var4.g1()];
				}
			}
		}
	}

	@ObfuscatedName("CXGZMTJK.b(I)V")
	public void bind() {
		Pix2D.bind(cropBottom, cropRight, pixels);
	}

	@ObfuscatedName("CXGZMTJK.a(IIII)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < pixels.length; var4++) {
			int var5 = pixels[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg0;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg1;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var8 = var5 & 0xFF;
				var8 += arg2;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				pixels[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("CXGZMTJK.c(I)V")
	public void crop() {
		int[] var1 = new int[height * width];
		for (int var2 = 0; var2 < cropBottom; var2++) {
			for (int var3 = 0; var3 < cropRight; var3++) {
				var1[(cropTop + var2) * width + cropLeft + var3] = pixels[cropRight * var2 + var3];
			}
		}

		pixels = var1;
		cropRight = width;
		cropBottom = height;
		cropLeft = 0;
		cropTop = 0;
	}

	@ObfuscatedName("CXGZMTJK.a(III)V")
	public void blitOpaque(int arg0, int arg1) {
		arg0 += cropLeft;
		arg1 += cropTop;
		int var3 = Pix2D.width2d * arg1 + arg0;
		int var4 = 0;
		int var5 = cropBottom;
		int var6 = cropRight;
		int var7 = Pix2D.width2d - var6;
		int var8 = 0;

		if (arg1 < Pix2D.top) {
			int var9 = Pix2D.top - arg1;
			var5 -= var9;
			arg1 = Pix2D.top;
			var4 += var6 * var9;
			var3 += Pix2D.width2d * var9;
		}

		if (arg1 + var5 > Pix2D.bottom) {
			var5 -= arg1 + var5 - Pix2D.bottom;
		}

		if (arg0 < Pix2D.left) {
			int var10 = Pix2D.left - arg0;
			var6 -= var10;
			arg0 = Pix2D.left;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > Pix2D.right) {
			int var11 = arg0 + var6 - Pix2D.right;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			copyPixels(var3, var6, var5, var8, var4, var7, pixels, Pix2D.data);
		}
	}

	@ObfuscatedName("CXGZMTJK.a(IIIIIII[I[I)V")
	public void copyPixels(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
		int var9 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var10 = -arg2; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg7[arg0++] = arg6[arg4++];
				arg7[arg0++] = arg6[arg4++];
				arg7[arg0++] = arg6[arg4++];
				arg7[arg0++] = arg6[arg4++];
			}

			for (int var12 = arg1; var12 < 0; var12++) {
				arg7[arg0++] = arg6[arg4++];
			}

			arg0 += arg5;
			arg4 += arg3;
		}
	}

	@ObfuscatedName("CXGZMTJK.b(III)V")
	public void draw(int arg0, int arg1) {
		arg0 += cropLeft;
		arg1 += cropTop;
		int var3 = Pix2D.width2d * arg1 + arg0;
		int var4 = 0;
		int var5 = cropBottom;
		int var6 = cropRight;
		int var7 = Pix2D.width2d - var6;
		int var8 = 0;

		if (arg1 < Pix2D.top) {
			int var9 = Pix2D.top - arg1;
			var5 -= var9;
			arg1 = Pix2D.top;
			var4 += var6 * var9;
			var3 += Pix2D.width2d * var9;
		}

		if (arg1 + var5 > Pix2D.bottom) {
			var5 -= arg1 + var5 - Pix2D.bottom;
		}

		if (arg0 < Pix2D.left) {
			int var10 = Pix2D.left - arg0;
			var6 -= var10;
			arg0 = Pix2D.left;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > Pix2D.right) {
			int var11 = arg0 + var6 - Pix2D.right;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			copyPixels(Pix2D.data, pixels, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("CXGZMTJK.a([I[IIIIIIII)V")
	public void copyPixels(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				int var13 = arg1[arg3++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var13;
				}

				int var14 = arg1[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var14;
				}

				int var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}

				int var16 = arg1[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var16;
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				int var18 = arg1[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var18;
				}
			}

			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("CXGZMTJK.a(IIIZ)V")
	public void drawAlpha(int arg0, int arg1, int arg2) {
		arg0 += cropLeft;
		arg1 += cropTop;
		int var4 = Pix2D.width2d * arg1 + arg0;
		int var5 = 0;
		int var6 = cropBottom;
		int var7 = cropRight;
		int var8 = Pix2D.width2d - var7;
		int var9 = 0;

		if (arg1 < Pix2D.top) {
			int var10 = Pix2D.top - arg1;
			var6 -= var10;
			arg1 = Pix2D.top;
			var5 += var7 * var10;
			var4 += Pix2D.width2d * var10;
		}

		if (arg1 + var6 > Pix2D.bottom) {
			var6 -= arg1 + var6 - Pix2D.bottom;
		}

		if (arg0 < Pix2D.left) {
			int var11 = Pix2D.left - arg0;
			var7 -= var11;
			arg0 = Pix2D.left;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > Pix2D.right) {
			int var12 = arg0 + var7 - Pix2D.right;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			copyPixelsAlpha(var5, var7, Pix2D.data, 0, pixels, var9, var6, var8, arg2, var4);
		}
	}

	@ObfuscatedName("CXGZMTJK.a(II[II[IIIIIII)V")
	public void copyPixelsAlpha(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg8;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = arg4[arg0++];
				if (var14 == 0) {
					arg9++;
				} else {
					int var15 = arg2[arg9];
					arg2[arg9++] = ((var14 & 0xFF00FF) * arg8 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg8 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg9 += arg7;
			arg0 += arg5;
		}
	}

	@ObfuscatedName("CXGZMTJK.b(II[II[IIIIIII)V")
	public void drawRotatedMasked(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg8 / 2;
			int var12 = -arg0 / 2;
			int var13 = (int) (Math.sin(arg1 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg1 / 326.11D) * 65536.0D);
			var13 = arg3 * var13 >> 8;
			var14 = arg3 * var14 >> 8;
			int var15 = (arg9 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg5 << 16) + var12 * var14 - var11 * var13;
			int var17 = Pix2D.width2d * arg6 + arg7;
			for (int var18 = 0; var18 < arg0; var18++) {
				int var19 = arg4[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg2[var18]; var23 < 0; var23++) {
					Pix2D.data[var20++] = pixels[(var21 >> 16) + (var22 >> 16) * cropRight];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += Pix2D.width2d;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("CXGZMTJK.a(IIIIIIIDI)V")
	public void drawRotated(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg5 / 2;
			int var12 = (int) (Math.sin(arg6) * 65536.0D);
			int var13 = (int) (Math.cos(arg6) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg3 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg1 << 16) + var11 * var13 - var10 * var12;
			int var16 = Pix2D.width2d * arg0 + arg7;
			for (int var17 = 0; var17 < arg5; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = pixels[(var19 >> 16) + (var20 >> 16) * cropRight];
					if (var22 == 0) {
						var18++;
					} else {
						Pix2D.data[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += Pix2D.width2d;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("CXGZMTJK.a(LDSMJIEPN;ZII)V")
	public void drawMasked(Pix8 arg0, int arg1, int arg2) {
		arg2 += cropLeft;
		arg1 += cropTop;
		int var4 = Pix2D.width2d * arg1 + arg2;
		int var5 = 0;
		int var6 = cropBottom;
		int var7 = cropRight;
		int var8 = Pix2D.width2d - var7;
		int var9 = 0;

		if (arg1 < Pix2D.top) {
			int var10 = Pix2D.top - arg1;
			var6 -= var10;
			arg1 = Pix2D.top;
			var5 += var7 * var10;
			var4 += Pix2D.width2d * var10;
		}

		if (arg1 + var6 > Pix2D.bottom) {
			var6 -= arg1 + var6 - Pix2D.bottom;
		}

		if (arg2 < Pix2D.left) {
			int var11 = Pix2D.left - arg2;
			var7 -= var11;
			arg2 = Pix2D.left;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > Pix2D.right) {
			int var12 = arg2 + var7 - Pix2D.right;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			copyPixelsMasked(pixels, var7, arg0.pixels, var6, Pix2D.data, 0, var8, var4, var9, var5);
		}
	}

	@ObfuscatedName("CXGZMTJK.a([II[BI[IIZIIII)V")
	public void copyPixelsMasked(int[] arg0, int arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg0[arg9++];
				if (var14 != 0 && arg2[arg7] == 0) {
					arg4[arg7++] = var14;
				} else {
					arg7++;
				}

				int var15 = arg0[arg9++];
				if (var15 != 0 && arg2[arg7] == 0) {
					arg4[arg7++] = var15;
				} else {
					arg7++;
				}

				int var16 = arg0[arg9++];
				if (var16 != 0 && arg2[arg7] == 0) {
					arg4[arg7++] = var16;
				} else {
					arg7++;
				}

				int var17 = arg0[arg9++];
				if (var17 != 0 && arg2[arg7] == 0) {
					arg4[arg7++] = var17;
				} else {
					arg7++;
				}
			}

			for (int var18 = arg1; var18 < 0; var18++) {
				int var19 = arg0[arg9++];
				if (var19 != 0 && arg2[arg7] == 0) {
					arg4[arg7++] = var19;
				} else {
					arg7++;
				}
			}

			arg7 += arg6;
			arg9 += arg8;
		}
	}
}
