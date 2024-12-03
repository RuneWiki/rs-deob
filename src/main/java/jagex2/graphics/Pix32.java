package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Pix32 extends Pix2D {

	@ObfuscatedName("CXGZMTJK.x")
	public boolean _flowObfuscator9 = false;

	@ObfuscatedName("CXGZMTJK.y")
	public int _flowObfuscator10 = 24869;

	@ObfuscatedName("CXGZMTJK.A")
	public int _flowObfuscator12 = -32357;

	@ObfuscatedName("CXGZMTJK.B")
	public byte _flowObfuscator13 = 3;

	@ObfuscatedName("CXGZMTJK.C")
	public boolean _flowObfuscator14 = false;

	@ObfuscatedName("CXGZMTJK.D")
	public int _flowObfuscator15 = -388;

	@ObfuscatedName("CXGZMTJK.E")
	public boolean _flowObfuscator16 = false;

	@ObfuscatedName("CXGZMTJK.F")
	public boolean _flowObfuscator17 = true;

	@ObfuscatedName("CXGZMTJK.G")
	public boolean _flowObfuscator18 = true;

	@ObfuscatedName("CXGZMTJK.H")
	public boolean _flowObfuscator19 = false;

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

	@ObfuscatedName("CXGZMTJK.z")
	public int _flowObfuscator11;

	public Pix32(int arg0, int arg1) {
		this.pixels = new int[arg0 * arg1];
		this.cropRight = this.width = arg0;
		this.cropBottom = this.height = arg1;
		this.cropLeft = this.cropTop = 0;
	}

	public Pix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.cropRight = var3.getWidth(arg1);
			this.cropBottom = var3.getHeight(arg1);
			this.width = this.cropRight;
			this.height = this.cropBottom;
			this.cropLeft = 0;
			this.cropTop = 0;
			this.pixels = new int[this.cropBottom * this.cropRight];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.cropRight, this.cropBottom, this.pixels, 0, this.cropRight);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null), 891);
		Packet var5 = new Packet(arg0.read("index.dat", null), 891);
		var5.pos = var4.g2();
		this.width = var5.g2();
		this.height = var5.g2();
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
		this.cropLeft = var5.g1();
		this.cropTop = var5.g1();
		this.cropRight = var5.g2();
		this.cropBottom = var5.g2();
		int var10 = var5.g1();
		int var11 = this.cropBottom * this.cropRight;
		this.pixels = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				this.pixels[var12] = var7[var4.g1()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < this.cropRight; var13++) {
				for (int var14 = 0; var14 < this.cropBottom; var14++) {
					this.pixels[this.cropRight * var14 + var13] = var7[var4.g1()];
				}
			}
		}
	}

	@ObfuscatedName("CXGZMTJK.b(I)V")
	public void bind(int arg0) {
		if (arg0 != 0) {
			this._flowObfuscator19 = !this._flowObfuscator19;
		}
		Pix2D.bind(this.cropBottom, this.cropRight, -293, this.pixels);
	}

	@ObfuscatedName("CXGZMTJK.a(IIII)V")
	public void translate(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 != 0) {
			this._flowObfuscator11 = 314;
		}
		for (int var5 = 0; var5 < this.pixels.length; var5++) {
			int var6 = this.pixels[var5];
			if (var6 != 0) {
				int var7 = var6 >> 16 & 0xFF;
				int var8 = arg0 + var7;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}
				int var9 = var6 >> 8 & 0xFF;
				int var10 = arg1 + var9;
				if (var10 < 1) {
					var10 = 1;
				} else if (var10 > 255) {
					var10 = 255;
				}
				int var11 = var6 & 0xFF;
				int var12 = arg2 + var11;
				if (var12 < 1) {
					var12 = 1;
				} else if (var12 > 255) {
					var12 = 255;
				}
				this.pixels[var5] = (var8 << 16) + (var10 << 8) + var12;
			}
		}
	}

	@ObfuscatedName("CXGZMTJK.c(I)V")
	public void crop(int arg0) {
		int[] var2 = new int[this.height * this.width];
		if (arg0 != 5059) {
			this._flowObfuscator10 = -247;
		}
		for (int var3 = 0; var3 < this.cropBottom; var3++) {
			for (int var4 = 0; var4 < this.cropRight; var4++) {
				var2[(this.cropTop + var3) * this.width + this.cropLeft + var4] = this.pixels[this.cropRight * var3 + var4];
			}
		}
		this.pixels = var2;
		this.cropRight = this.width;
		this.cropBottom = this.height;
		this.cropLeft = 0;
		this.cropTop = 0;
	}

	@ObfuscatedName("CXGZMTJK.a(III)V")
	public void blitOpaque(int arg0, int arg1, int arg2) {
		int var4 = this.cropLeft + arg0;
		int var5 = this.cropTop + arg1;
		int var6 = Pix2D.width2d * var5 + var4;
		int var7 = 0;
		int var8 = this.cropBottom;
		int var9 = this.cropRight;
		int var10 = Pix2D.width2d - var9;
		int var11 = 0;
		if (this._flowObfuscator12 != arg2) {
			this._flowObfuscator19 = !this._flowObfuscator19;
		}
		if (var5 < Pix2D.top) {
			int var12 = Pix2D.top - var5;
			var8 -= var12;
			var5 = Pix2D.top;
			var7 += var9 * var12;
			var6 += Pix2D.width2d * var12;
		}
		if (var5 + var8 > Pix2D.bottom) {
			var8 -= var5 + var8 - Pix2D.bottom;
		}
		if (var4 < Pix2D.left) {
			int var13 = Pix2D.left - var4;
			var9 -= var13;
			var4 = Pix2D.left;
			var7 += var13;
			var6 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.right) {
			int var14 = var4 + var9 - Pix2D.right;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.copyPixels(var6, var9, var8, var11, var7, 28339, var10, this.pixels, Pix2D.data);
		}
	}

	@ObfuscatedName("CXGZMTJK.a(IIIIIII[I[I)V")
	public void copyPixels(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8) {
		int var10 = -(arg1 >> 2);
		int var11 = -(arg1 & 0x3);
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				arg8[arg0++] = arg7[arg4++];
				arg8[arg0++] = arg7[arg4++];
				arg8[arg0++] = arg7[arg4++];
				arg8[arg0++] = arg7[arg4++];
			}
			for (int var14 = var11; var14 < 0; var14++) {
				arg8[arg0++] = arg7[arg4++];
			}
			arg0 += arg6;
			arg4 += arg3;
		}
		if (arg5 != 28339) {
			this._flowObfuscator12 = 90;
		}
	}

	@ObfuscatedName("CXGZMTJK.b(III)V")
	public void draw(int arg0, int arg1, int arg2) {
		int var4 = this.cropLeft + arg0;
		int var5 = this.cropTop + arg2;
		if (arg1 != 16083) {
			return;
		}
		int var6 = Pix2D.width2d * var5 + var4;
		int var7 = 0;
		int var8 = this.cropBottom;
		int var9 = this.cropRight;
		int var10 = Pix2D.width2d - var9;
		int var11 = 0;
		if (var5 < Pix2D.top) {
			int var12 = Pix2D.top - var5;
			var8 -= var12;
			var5 = Pix2D.top;
			var7 += var9 * var12;
			var6 += Pix2D.width2d * var12;
		}
		if (var5 + var8 > Pix2D.bottom) {
			var8 -= var5 + var8 - Pix2D.bottom;
		}
		if (var4 < Pix2D.left) {
			int var13 = Pix2D.left - var4;
			var9 -= var13;
			var4 = Pix2D.left;
			var7 += var13;
			var6 += var13;
			var11 += var13;
			var10 += var13;
		}
		if (var4 + var9 > Pix2D.right) {
			int var14 = var4 + var9 - Pix2D.right;
			var9 -= var14;
			var11 += var14;
			var10 += var14;
		}
		if (var9 > 0 && var8 > 0) {
			this.copyPixels(Pix2D.data, this.pixels, 0, var7, var6, var9, var8, var10, var11);
		}
	}

	@ObfuscatedName("CXGZMTJK.a([I[IIIIIIII)V")
	public void copyPixels(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		int var11 = -(arg5 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var10; var13 < 0; var13++) {
				int var16 = arg1[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var16;
				}
				int var17 = arg1[arg3++];
				if (var17 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var17;
				}
				int var18 = arg1[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var18;
				}
				int var19 = arg1[arg3++];
				if (var19 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var19;
				}
			}
			for (int var14 = var11; var14 < 0; var14++) {
				int var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("CXGZMTJK.a(IIIZ)V")
	public void drawAlpha(int arg0, int arg1, int arg2, boolean arg3) {
		int var5 = this.cropLeft + arg0;
		if (arg3) {
			for (int var6 = 1; var6 > 0; var6++) {
			}
		}
		int var7 = this.cropTop + arg1;
		int var8 = Pix2D.width2d * var7 + var5;
		int var9 = 0;
		int var10 = this.cropBottom;
		int var11 = this.cropRight;
		int var12 = Pix2D.width2d - var11;
		int var13 = 0;
		if (var7 < Pix2D.top) {
			int var14 = Pix2D.top - var7;
			var10 -= var14;
			var7 = Pix2D.top;
			var9 += var11 * var14;
			var8 += Pix2D.width2d * var14;
		}
		if (var7 + var10 > Pix2D.bottom) {
			var10 -= var7 + var10 - Pix2D.bottom;
		}
		if (var5 < Pix2D.left) {
			int var15 = Pix2D.left - var5;
			var11 -= var15;
			var5 = Pix2D.left;
			var9 += var15;
			var8 += var15;
			var13 += var15;
			var12 += var15;
		}
		if (var5 + var11 > Pix2D.right) {
			int var16 = var5 + var11 - Pix2D.right;
			var11 -= var16;
			var13 += var16;
			var12 += var16;
		}
		if (var11 > 0 && var10 > 0) {
			this.copyPixelsAlpha(var9, var11, Pix2D.data, 0, this.pixels, var13, var10, var12, arg2, var8, 8);
		}
	}

	@ObfuscatedName("CXGZMTJK.a(II[II[IIIIIII)V")
	public void copyPixelsAlpha(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		int var12 = 256 - arg8;
		for (int var13 = -arg6; var13 < 0; var13++) {
			for (int var14 = -arg1; var14 < 0; var14++) {
				int var15 = arg4[arg0++];
				if (var15 == 0) {
					arg9++;
				} else {
					int var16 = arg2[arg9];
					arg2[arg9++] = ((var15 & 0xFF00FF) * arg8 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg8 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
				}
			}
			arg9 += arg7;
			arg0 += arg5;
		}
		if (arg10 < 8 || arg10 > 8) {
			this._flowObfuscator9 = !this._flowObfuscator9;
		}
	}

	@ObfuscatedName("CXGZMTJK.b(II[II[IIIIIII)V")
	public void drawRotatedMasked(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		while (arg5 >= 0) {
			this._flowObfuscator15 = 362;
		}
		try {
			int var12 = -arg9 / 2;
			int var13 = -arg0 / 2;
			int var14 = (int) (Math.sin((double) arg1 / 326.11D) * 65536.0D);
			int var15 = (int) (Math.cos((double) arg1 / 326.11D) * 65536.0D);
			int var16 = arg3 * var14 >> 8;
			int var17 = arg3 * var15 >> 8;
			int var18 = (arg10 << 16) + var12 * var17 + var13 * var16;
			int var19 = (arg6 << 16) + (var13 * var17 - var12 * var16);
			int var20 = Pix2D.width2d * arg7 + arg8;
			for (int var21 = 0; var21 < arg0; var21++) {
				int var22 = arg4[var21];
				int var23 = var20 + var22;
				int var24 = var17 * var22 + var18;
				int var25 = var19 - var16 * var22;
				for (int var26 = -arg2[var21]; var26 < 0; var26++) {
					Pix2D.data[var23++] = this.pixels[(var24 >> 16) + (var25 >> 16) * this.cropRight];
					var24 += var17;
					var25 -= var16;
				}
				var18 += var16;
				var19 += var17;
				var20 += Pix2D.width2d;
			}
		} catch (Exception var27) {
		}
	}

	@ObfuscatedName("CXGZMTJK.a(IIIIIIIDI)V")
	public void drawRotated(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7, int arg8) {
		if (arg4 != 41960) {
			return;
		}
		try {
			int var11 = -arg2 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg7) * 65536.0D);
			int var14 = (int) (Math.cos(arg7) * 65536.0D);
			int var15 = arg5 * var13 >> 8;
			int var16 = arg5 * var14 >> 8;
			int var17 = (arg3 << 16) + var11 * var16 + var12 * var15;
			int var18 = (arg1 << 16) + (var12 * var16 - var11 * var15);
			int var19 = Pix2D.width2d * arg0 + arg8;
			for (int var20 = 0; var20 < arg6; var20++) {
				int var21 = var19;
				int var22 = var17;
				int var23 = var18;
				for (int var24 = -arg2; var24 < 0; var24++) {
					int var25 = this.pixels[(var22 >> 16) + (var23 >> 16) * this.cropRight];
					if (var25 == 0) {
						var21++;
					} else {
						Pix2D.data[var21++] = var25;
					}
					var22 += var16;
					var23 -= var15;
				}
				var17 += var15;
				var18 += var16;
				var19 += Pix2D.width2d;
			}
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("CXGZMTJK.a(LDSMJIEPN;ZII)V")
	public void drawMasked(Pix8 arg0, boolean arg1, int arg2, int arg3) {
		int var5 = this.cropLeft + arg3;
		int var6 = this.cropTop + arg2;
		int var7 = Pix2D.width2d * var6 + var5;
		int var8 = 0;
		if (arg1) {
			this._flowObfuscator10 = -364;
		}
		int var9 = this.cropBottom;
		int var10 = this.cropRight;
		int var11 = Pix2D.width2d - var10;
		int var12 = 0;
		if (var6 < Pix2D.top) {
			int var13 = Pix2D.top - var6;
			var9 -= var13;
			var6 = Pix2D.top;
			var8 += var10 * var13;
			var7 += Pix2D.width2d * var13;
		}
		if (var6 + var9 > Pix2D.bottom) {
			var9 -= var6 + var9 - Pix2D.bottom;
		}
		if (var5 < Pix2D.left) {
			int var14 = Pix2D.left - var5;
			var10 -= var14;
			var5 = Pix2D.left;
			var8 += var14;
			var7 += var14;
			var12 += var14;
			var11 += var14;
		}
		if (var5 + var10 > Pix2D.right) {
			int var15 = var5 + var10 - Pix2D.right;
			var10 -= var15;
			var12 += var15;
			var11 += var15;
		}
		if (var10 > 0 && var9 > 0) {
			this.copyPixelsMasked(this.pixels, var10, arg0.pixels, var9, Pix2D.data, 0, this._flowObfuscator17, var11, var7, var12, var8);
		}
	}

	@ObfuscatedName("CXGZMTJK.a([II[BI[IIZIIII)V")
	public void copyPixelsMasked(int[] arg0, int arg1, byte[] arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
		int var12 = -(arg1 >> 2);
		if (!arg6) {
			for (int var13 = 1; var13 > 0; var13++) {
			}
		}
		int var14 = -(arg1 & 0x3);
		for (int var15 = -arg3; var15 < 0; var15++) {
			for (int var16 = var12; var16 < 0; var16++) {
				int var19 = arg0[arg10++];
				if (var19 != 0 && arg2[arg8] == 0) {
					arg4[arg8++] = var19;
				} else {
					arg8++;
				}
				int var20 = arg0[arg10++];
				if (var20 != 0 && arg2[arg8] == 0) {
					arg4[arg8++] = var20;
				} else {
					arg8++;
				}
				int var21 = arg0[arg10++];
				if (var21 != 0 && arg2[arg8] == 0) {
					arg4[arg8++] = var21;
				} else {
					arg8++;
				}
				int var22 = arg0[arg10++];
				if (var22 != 0 && arg2[arg8] == 0) {
					arg4[arg8++] = var22;
				} else {
					arg8++;
				}
			}
			for (int var17 = var14; var17 < 0; var17++) {
				int var18 = arg0[arg10++];
				if (var18 != 0 && arg2[arg8] == 0) {
					arg4[arg8++] = var18;
				} else {
					arg8++;
				}
			}
			arg8 += arg7;
			arg10 += arg9;
		}
	}
}
