package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("kb")
public final class Pix8 extends Pix2D {

	@ObfuscatedName("kb.G")
	public int owi;

	@ObfuscatedName("kb.H")
	public int ohi;

	@ObfuscatedName("kb.B")
	public int[] bpal;

	@ObfuscatedName("kb.E")
	public int xof;

	@ObfuscatedName("kb.F")
	public int yof;

	@ObfuscatedName("kb.C")
	public int wi;

	@ObfuscatedName("kb.D")
	public int hi;

	@ObfuscatedName("kb.A")
	public byte[] data;

	public Pix8(JagFile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.read("index.dat", null));
		var5.pos = var4.g2();
		owi = var5.g2();
		ohi = var5.g2();
		int var6 = var5.g1();
		bpal = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			bpal[var7 + 1] = var5.g3();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}

		xof = var5.g1();
		yof = var5.g1();
		wi = var5.g2();
		hi = var5.g2();
		int var9 = var5.g1();
		int var10 = hi * wi;
		data = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				data[var11] = var4.g1b();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < wi; var12++) {
				for (int var13 = 0; var13 < hi; var13++) {
					data[wi * var13 + var12] = var4.g1b();
				}
			}
		}
	}

	@ObfuscatedName("kb.a(Z)V")
	public void halveSize() {
		owi /= 2;
		ohi /= 2;
		byte[] var1 = new byte[ohi * owi];
		int var2 = 0;
		for (int var3 = 0; var3 < hi; var3++) {
			for (int var4 = 0; var4 < wi; var4++) {
				var1[(xof + var4 >> 1) + (yof + var3 >> 1) * owi] = data[var2++];
			}
		}

		data = var1;
		wi = owi;
		hi = ohi;
		xof = 0;
		yof = 0;
	}

	@ObfuscatedName("kb.a(B)V")
	public void trim() {
		if (owi != wi || ohi != hi) {
			byte[] var1 = new byte[ohi * owi];
			int var2 = 0;
			for (int var3 = 0; var3 < hi; var3++) {
				for (int var4 = 0; var4 < wi; var4++) {
					var1[(yof + var3) * owi + xof + var4] = data[var2++];
				}
			}

			data = var1;
			wi = owi;
			hi = ohi;
			xof = 0;
			yof = 0;
		}
	}

	@ObfuscatedName("kb.b(B)V")
	public void hflip() {
		byte[] var1 = new byte[hi * wi];
		int var2 = 0;
		for (int var3 = 0; var3 < hi; var3++) {
			for (int var4 = wi - 1; var4 >= 0; var4--) {
				var1[var2++] = data[wi * var3 + var4];
			}
		}

		data = var1;
		xof = owi - wi - xof;
	}

	@ObfuscatedName("kb.b(Z)V")
	public void vflip() {
		byte[] var1 = new byte[hi * wi];
		int var2 = 0;
		for (int var3 = hi - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < wi; var4++) {
				var1[var2++] = data[wi * var3 + var4];
			}
		}

		data = var1;
		yof = ohi - hi - yof;
	}

	@ObfuscatedName("kb.a(IIII)V")
	public void rgbAdjust(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < bpal.length; var4++) {
			int var5 = bpal[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = bpal[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = bpal[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			bpal[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("kb.a(III)V")
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
			plotSprite(data, Pix2D.pixels, var4, var8, bpal, var5, var6, var7, var3);
		}
	}

	@ObfuscatedName("kb.a([BI[III[IIIII)V")
	public void plotSprite(byte[] arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg0[arg2++];
				if (var13 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg4[var13 & 0xFF];
				}

				byte var14 = arg0[arg2++];
				if (var14 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg4[var14 & 0xFF];
				}

				byte var15 = arg0[arg2++];
				if (var15 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg4[var15 & 0xFF];
				}

				byte var16 = arg0[arg2++];
				if (var16 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg4[var16 & 0xFF];
				}
			}

			for (int var17 = arg6; var17 < 0; var17++) {
				byte var18 = arg0[arg2++];
				if (var18 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg4[var18 & 0xFF];
				}
			}

			arg8 += arg7;
			arg2 += arg3;
		}
	}
}
