package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("jb")
public final class Pix32 extends Pix2D {

	@ObfuscatedName("jb.G")
	public int[] data;

	@ObfuscatedName("jb.L")
	public int owi;

	@ObfuscatedName("jb.H")
	public int wi;

	@ObfuscatedName("jb.M")
	public int ohi;

	@ObfuscatedName("jb.I")
	public int hi;

	@ObfuscatedName("jb.K")
	public int yof;

	@ObfuscatedName("jb.J")
	public int xof;

	public Pix32(int arg0, int arg1) {
		data = new int[arg0 * arg1];
		wi = owi = arg0;
		hi = ohi = arg1;
		xof = yof = 0;
	}

	public Pix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			wi = var3.getWidth(arg1);
			hi = var3.getHeight(arg1);
			owi = wi;
			ohi = hi;
			xof = 0;
			yof = 0;
			data = new int[hi * wi];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, wi, hi, data, 0, wi);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));
		var5.pos = var4.g2();
		owi = var5.g2();
		ohi = var5.g2();
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

		xof = var5.g1();
		yof = var5.g1();
		wi = var5.g2();
		hi = var5.g2();
		int var10 = var5.g1();
		int var11 = hi * wi;
		data = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				data[var12] = var7[var4.g1()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < wi; var13++) {
				for (int var14 = 0; var14 < hi; var14++) {
					data[wi * var14 + var13] = var7[var4.g1()];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(B)V")
	public void setPixels() {
		Pix2D.setPixels(hi, data, wi);
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < data.length; var4++) {
			int var5 = data[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg1;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg0;
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

				data[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("jb.a(Z)V")
	public void trim() {
		int[] var1 = new int[ohi * owi];
		for (int var2 = 0; var2 < hi; var2++) {
			for (int var3 = 0; var3 < wi; var3++) {
				var1[(yof + var2) * owi + xof + var3] = data[wi * var2 + var3];
			}
		}

		data = var1;
		wi = owi;
		hi = ohi;
		xof = 0;
		yof = 0;
	}

	@ObfuscatedName("jb.a(III)V")
	public void quickPlotSprite(int arg0, int arg1) {
		arg1 += xof;
		arg0 += yof;
		int var3 = Pix2D.width * arg0 + arg1;
		int var4 = 0;
		int var5 = hi;
		int var6 = wi;
		int var7 = Pix2D.width - var6;
		int var8 = 0;

		if (arg0 < Pix2D.clipMinY) {
			int var9 = Pix2D.clipMinY - arg0;
			var5 -= var9;
			arg0 = Pix2D.clipMinY;
			var4 += var6 * var9;
			var3 += Pix2D.width * var9;
		}

		if (arg0 + var5 > Pix2D.clipMaxY) {
			var5 -= arg0 + var5 - Pix2D.clipMaxY;
		}

		if (arg1 < Pix2D.clipMinX) {
			int var10 = Pix2D.clipMinX - arg1;
			var6 -= var10;
			arg1 = Pix2D.clipMinX;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > Pix2D.clipMaxX) {
			int var11 = arg1 + var6 - Pix2D.clipMaxX;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			plotQuick(Pix2D.pixels, var8, data, var4, var3, var7, var5, var6);
		}
	}

	@ObfuscatedName("jb.a(I[II[IIIIII)V")
	public void plotQuick(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg0[arg4++] = arg2[arg3++];
				arg0[arg4++] = arg2[arg3++];
				arg0[arg4++] = arg2[arg3++];
				arg0[arg4++] = arg2[arg3++];
			}

			for (int var12 = arg7; var12 < 0; var12++) {
				arg0[arg4++] = arg2[arg3++];
			}

			arg4 += arg5;
			arg3 += arg1;
		}
	}

	@ObfuscatedName("jb.b(III)V")
	public void plotSprite(int arg0, int arg1) {
		arg0 += xof;
		arg1 += yof;
		int var3 = Pix2D.width * arg1 + arg0;
		int var4 = 0;
		int var5 = hi;
		int var6 = wi;
		int var7 = Pix2D.width - var6;
		int var8 = 0;

		if (arg1 < Pix2D.clipMinY) {
			int var9 = Pix2D.clipMinY - arg1;
			var5 -= var9;
			arg1 = Pix2D.clipMinY;
			var4 += var6 * var9;
			var3 += Pix2D.width * var9;
		}

		if (arg1 + var5 > Pix2D.clipMaxY) {
			var5 -= arg1 + var5 - Pix2D.clipMaxY;
		}

		if (arg0 < Pix2D.clipMinX) {
			int var10 = Pix2D.clipMinX - arg0;
			var6 -= var10;
			arg0 = Pix2D.clipMinX;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > Pix2D.clipMaxX) {
			int var11 = arg0 + var6 - Pix2D.clipMaxX;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			plot(Pix2D.pixels, data, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("jb.a([I[IIIIIIII)V")
	public void plot(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("jb.b(IIII)V")
	public void transPlotSprite(int arg0, int arg1, int arg2) {
		arg0 += xof;
		arg2 += yof;
		int var4 = Pix2D.width * arg2 + arg0;
		int var5 = 0;
		int var6 = hi;
		int var7 = wi;
		int var8 = Pix2D.width - var7;
		int var9 = 0;

		if (arg2 < Pix2D.clipMinY) {
			int var10 = Pix2D.clipMinY - arg2;
			var6 -= var10;
			arg2 = Pix2D.clipMinY;
			var5 += var7 * var10;
			var4 += Pix2D.width * var10;
		}

		if (arg2 + var6 > Pix2D.clipMaxY) {
			var6 -= arg2 + var6 - Pix2D.clipMaxY;
		}

		if (arg0 < Pix2D.clipMinX) {
			int var11 = Pix2D.clipMinX - arg0;
			var7 -= var11;
			arg0 = Pix2D.clipMinX;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > Pix2D.clipMaxX) {
			int var12 = arg0 + var7 - Pix2D.clipMaxX;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			tranSprite(var7, var5, var4, Pix2D.pixels, arg1, 0, data, var9, var6, var8);
		}
	}

	@ObfuscatedName("jb.a(IBII[III[IIII)V")
	public void tranSprite(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg4;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = arg6[arg1++];
				if (var14 == 0) {
					arg2++;
				} else {
					int var15 = arg3[arg2];
					arg3[arg2++] = ((var14 & 0xFF00FF) * arg4 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg4 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg2 += arg9;
			arg1 += arg7;
		}
	}

	@ObfuscatedName("jb.a(I[II[IZIIIIII)V")
	public void scanlineRotatePlotSprite(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg0 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg9 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg9 / 326.11D) * 65536.0D);
			var13 = arg2 * var13 >> 8;
			var14 = arg2 * var14 >> 8;
			int var15 = (arg5 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg8 << 16) + var12 * var14 - var11 * var13;
			int var17 = Pix2D.width * arg7 + arg4;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg1[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg3[var18]; var23 < 0; var23++) {
					Pix2D.pixels[var20++] = data[(var21 >> 16) + (var22 >> 16) * wi];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += Pix2D.width;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("jb.a(IIIIIIIDI)V")
	public void rotatePlotSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
		try {
			int var10 = -arg5 / 2;
			int var11 = -arg1 / 2;
			int var12 = (int) (Math.sin(arg6) * 65536.0D);
			int var13 = (int) (Math.cos(arg6) * 65536.0D);
			var12 = arg2 * var12 >> 8;
			var13 = arg2 * var13 >> 8;
			int var14 = (arg3 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg7 << 16) + var11 * var13 - var10 * var12;
			int var16 = Pix2D.width * arg0 + arg4;
			for (int var17 = 0; var17 < arg1; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg5; var21 < 0; var21++) {
					int var22 = data[(var19 >> 16) + (var20 >> 16) * wi];
					if (var22 == 0) {
						var18++;
					} else {
						Pix2D.pixels[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += Pix2D.width;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("jb.a(ZLkb;II)V")
	public void scanlinePlotSprite(Pix8 arg0, int arg1, int arg2) {
		arg2 += xof;
		arg1 += yof;
		int var4 = Pix2D.width * arg1 + arg2;
		int var5 = 0;
		int var6 = hi;
		int var7 = wi;
		int var8 = Pix2D.width - var7;
		int var9 = 0;

		if (arg1 < Pix2D.clipMinY) {
			int var10 = Pix2D.clipMinY - arg1;
			var6 -= var10;
			arg1 = Pix2D.clipMinY;
			var5 += var7 * var10;
			var4 += Pix2D.width * var10;
		}

		if (arg1 + var6 > Pix2D.clipMaxY) {
			var6 -= arg1 + var6 - Pix2D.clipMaxY;
		}

		if (arg2 < Pix2D.clipMinX) {
			int var11 = Pix2D.clipMinX - arg2;
			var7 -= var11;
			arg2 = Pix2D.clipMinX;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > Pix2D.clipMaxX) {
			int var12 = arg2 + var7 - Pix2D.clipMaxX;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			plotScanline(var5, var9, 0, data, arg0.data, var7, var6, Pix2D.pixels, var8, var4);
		}
	}

	@ObfuscatedName("jb.a(III[I[BII[IBII)V")
	public void plotScanline(int arg0, int arg1, int arg2, int[] arg3, byte[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg3[arg0++];
				if (var14 != 0 && arg4[arg9] == 0) {
					arg7[arg9++] = var14;
				} else {
					arg9++;
				}

				int var15 = arg3[arg0++];
				if (var15 != 0 && arg4[arg9] == 0) {
					arg7[arg9++] = var15;
				} else {
					arg9++;
				}

				int var16 = arg3[arg0++];
				if (var16 != 0 && arg4[arg9] == 0) {
					arg7[arg9++] = var16;
				} else {
					arg9++;
				}

				int var17 = arg3[arg0++];
				if (var17 != 0 && arg4[arg9] == 0) {
					arg7[arg9++] = var17;
				} else {
					arg9++;
				}
			}

			for (int var18 = arg5; var18 < 0; var18++) {
				int var19 = arg3[arg0++];
				if (var19 != 0 && arg4[arg9] == 0) {
					arg7[arg9++] = var19;
				} else {
					arg9++;
				}
			}

			arg9 += arg8;
			arg0 += arg1;
		}
	}
}
