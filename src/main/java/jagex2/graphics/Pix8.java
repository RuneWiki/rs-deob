package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("DSMJIEPN")
public final class Pix8 extends Pix2D {

	@ObfuscatedName("DSMJIEPN.H")
	public int width;

	@ObfuscatedName("DSMJIEPN.I")
	public int height;

	@ObfuscatedName("DSMJIEPN.C")
	public int[] palette;

	@ObfuscatedName("DSMJIEPN.F")
	public int cropLeft;

	@ObfuscatedName("DSMJIEPN.G")
	public int cropTop;

	@ObfuscatedName("DSMJIEPN.D")
	public int cropRight;

	@ObfuscatedName("DSMJIEPN.E")
	public int cropBottom;

	@ObfuscatedName("DSMJIEPN.B")
	public byte[] pixels;

	public Pix8(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));
		var5.pos = var4.g2();
		width = var5.g2();
		height = var5.g2();
		int var6 = var5.g1();
		palette = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			palette[var7 + 1] = var5.g3();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}

		cropLeft = var5.g1();
		cropTop = var5.g1();
		cropRight = var5.g2();
		cropBottom = var5.g2();
		int var9 = var5.g1();
		int var10 = cropBottom * cropRight;
		pixels = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				pixels[var11] = var4.g1b();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < cropRight; var12++) {
				for (int var13 = 0; var13 < cropBottom; var13++) {
					pixels[cropRight * var13 + var12] = var4.g1b();
				}
			}
		}
	}

	@ObfuscatedName("DSMJIEPN.b(Z)V")
	public void shrink() {
		width /= 2;
		height /= 2;
		byte[] var1 = new byte[height * width];
		int var2 = 0;
		for (int var3 = 0; var3 < cropBottom; var3++) {
			for (int var4 = 0; var4 < cropRight; var4++) {
				var1[(cropLeft + var4 >> 1) + (cropTop + var3 >> 1) * width] = pixels[var2++];
			}
		}

		pixels = var1;
		cropRight = width;
		cropBottom = height;
		cropLeft = 0;
		cropTop = 0;
	}

	@ObfuscatedName("DSMJIEPN.c(Z)V")
	public void crop() {
		if (width != cropRight || height != cropBottom) {
			byte[] var1 = new byte[height * width];
			int var2 = 0;
			for (int var3 = 0; var3 < cropBottom; var3++) {
				for (int var4 = 0; var4 < cropRight; var4++) {
					var1[(cropTop + var3) * width + cropLeft + var4] = pixels[var2++];
				}
			}

			pixels = var1;
			cropRight = width;
			cropBottom = height;
			cropLeft = 0;
			cropTop = 0;
		}
	}

	@ObfuscatedName("DSMJIEPN.b(I)V")
	public void flipHorizontally() {
		byte[] var1 = new byte[cropBottom * cropRight];
		int var2 = 0;
		for (int var3 = 0; var3 < cropBottom; var3++) {
			for (int var4 = cropRight - 1; var4 >= 0; var4--) {
				var1[var2++] = pixels[cropRight * var3 + var4];
			}
		}

		pixels = var1;
		cropLeft = width - cropRight - cropLeft;
	}

	@ObfuscatedName("DSMJIEPN.d(Z)V")
	public void flipVertically() {
		byte[] var1 = new byte[cropBottom * cropRight];
		int var2 = 0;
		for (int var3 = cropBottom - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < cropRight; var4++) {
				var1[var2++] = pixels[cropRight * var3 + var4];
			}
		}

		pixels = var1;
		cropTop = height - cropBottom - cropTop;
	}

	@ObfuscatedName("DSMJIEPN.a(IIII)V")
	public void translate(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < palette.length; var4++) {
			int var5 = palette[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = palette[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = palette[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			palette[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("DSMJIEPN.a(III)V")
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
			copyPixels(var5, Pix2D.data, pixels, var7, var3, var6, var4, palette, var8);
		}
	}

	@ObfuscatedName("DSMJIEPN.a(IB[I[BIIII[II)V")
	public void copyPixels(int arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg6++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg7[var13 & 0xFF];
				}

				byte var14 = arg2[arg6++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg7[var14 & 0xFF];
				}

				byte var15 = arg2[arg6++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg7[var15 & 0xFF];
				}

				byte var16 = arg2[arg6++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg7[var16 & 0xFF];
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				byte var18 = arg2[arg6++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg7[var18 & 0xFF];
				}
			}

			arg4 += arg3;
			arg6 += arg8;
		}
	}
}
