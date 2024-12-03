package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class Pix8 extends Pix2D {

	@ObfuscatedName("DSMJIEPN.y")
	public boolean _flowObfuscator10 = false;

	@ObfuscatedName("DSMJIEPN.z")
	public int _flowObfuscator11 = 360;

	@ObfuscatedName("DSMJIEPN.A")
	public byte _flowObfuscator12 = 3;

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

	@ObfuscatedName("DSMJIEPN.x")
	public int _flowObfuscator9;

	public Pix8(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.read(arg1 + ".dat", null), 891);
		Packet var5 = new Packet(arg0.read("index.dat", null), 891);
		var5.pos = var4.g2();
		this.width = var5.g2();
		this.height = var5.g2();
		int var6 = var5.g1();
		this.palette = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			this.palette[var7 + 1] = var5.g3();
		}
		for (int var8 = 0; var8 < arg2; var8++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}
		this.cropLeft = var5.g1();
		this.cropTop = var5.g1();
		this.cropRight = var5.g2();
		this.cropBottom = var5.g2();
		int var9 = var5.g1();
		int var10 = this.cropBottom * this.cropRight;
		this.pixels = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				this.pixels[var11] = var4.g1b();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < this.cropRight; var12++) {
				for (int var13 = 0; var13 < this.cropBottom; var13++) {
					this.pixels[this.cropRight * var13 + var12] = var4.g1b();
				}
			}
		}
	}

	@ObfuscatedName("DSMJIEPN.b(Z)V")
	public void shrink(boolean arg0) {
		this.width /= 2;
		this.height /= 2;
		byte[] var2 = new byte[this.height * this.width];
		int var3 = 0;
		for (int var4 = 0; var4 < this.cropBottom; var4++) {
			for (int var5 = 0; var5 < this.cropRight; var5++) {
				var2[(this.cropLeft + var5 >> 1) + (this.cropTop + var4 >> 1) * this.width] = this.pixels[var3++];
			}
		}
		this.pixels = var2;
		this.cropRight = this.width;
		this.cropBottom = this.height;
		this.cropLeft = 0;
		if (!arg0) {
			this.cropTop = 0;
		}
	}

	@ObfuscatedName("DSMJIEPN.c(Z)V")
	public void crop(boolean arg0) {
		if (this.width == this.cropRight && this.height == this.cropBottom) {
			return;
		}
		byte[] var2 = new byte[this.height * this.width];
		if (arg0) {
			return;
		}
		int var3 = 0;
		for (int var4 = 0; var4 < this.cropBottom; var4++) {
			for (int var5 = 0; var5 < this.cropRight; var5++) {
				var2[(this.cropTop + var4) * this.width + this.cropLeft + var5] = this.pixels[var3++];
			}
		}
		this.pixels = var2;
		this.cropRight = this.width;
		this.cropBottom = this.height;
		this.cropLeft = 0;
		this.cropTop = 0;
	}

	@ObfuscatedName("DSMJIEPN.b(I)V")
	public void flipHorizontally(int arg0) {
		if (arg0 != 0) {
			return;
		}
		byte[] var2 = new byte[this.cropBottom * this.cropRight];
		int var3 = 0;
		for (int var4 = 0; var4 < this.cropBottom; var4++) {
			for (int var5 = this.cropRight - 1; var5 >= 0; var5--) {
				var2[var3++] = this.pixels[this.cropRight * var4 + var5];
			}
		}
		this.pixels = var2;
		this.cropLeft = this.width - this.cropRight - this.cropLeft;
	}

	@ObfuscatedName("DSMJIEPN.d(Z)V")
	public void flipVertically(boolean arg0) {
		byte[] var2 = new byte[this.cropBottom * this.cropRight];
		int var3 = 0;
		for (int var4 = this.cropBottom - 1; var4 >= 0; var4--) {
			for (int var5 = 0; var5 < this.cropRight; var5++) {
				var2[var3++] = this.pixels[this.cropRight * var4 + var5];
			}
		}
		this.pixels = var2;
		if (!arg0) {
			this._flowObfuscator9 = -48;
		}
		this.cropTop = this.height - this.cropBottom - this.cropTop;
	}

	@ObfuscatedName("DSMJIEPN.a(IIII)V")
	public void translate(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.palette.length; var5++) {
			int var6 = this.palette[var5] >> 16 & 0xFF;
			int var7 = arg0 + var6;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}
			int var8 = this.palette[var5] >> 8 & 0xFF;
			int var9 = arg1 + var8;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 > 255) {
				var9 = 255;
			}
			int var10 = this.palette[var5] & 0xFF;
			int var11 = arg2 + var10;
			if (var11 < 0) {
				var11 = 0;
			} else if (var11 > 255) {
				var11 = 255;
			}
			this.palette[var5] = (var7 << 16) + (var9 << 8) + var11;
		}
		if (arg3 != 0) {
			this._flowObfuscator9 = 69;
		}
	}

	@ObfuscatedName("DSMJIEPN.a(III)V")
	public void draw(int arg0, int arg1, int arg2) {
		int var4 = this.cropLeft + arg0;
		int var5 = this.cropTop + arg2;
		int var6 = Pix2D.width2d * var5 + var4;
		int var7 = 0;
		if (arg1 != 16083) {
			return;
		}
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
			this.copyPixels(var8, (byte) 9, Pix2D.data, this.pixels, var10, var6, var9, var7, this.palette, var11);
		}
	}

	@ObfuscatedName("DSMJIEPN.a(IB[I[BIIII[II)V")
	public void copyPixels(int arg0, byte arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		if (arg1 != 9) {
			this._flowObfuscator10 = !this._flowObfuscator10;
		}
		int var11 = -(arg6 >> 2);
		int var12 = -(arg6 & 0x3);
		for (int var13 = -arg0; var13 < 0; var13++) {
			for (int var14 = var11; var14 < 0; var14++) {
				byte var17 = arg3[arg7++];
				if (var17 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg8[var17 & 0xFF];
				}
				byte var18 = arg3[arg7++];
				if (var18 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg8[var18 & 0xFF];
				}
				byte var19 = arg3[arg7++];
				if (var19 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg8[var19 & 0xFF];
				}
				byte var20 = arg3[arg7++];
				if (var20 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg8[var20 & 0xFF];
				}
			}
			for (int var15 = var12; var15 < 0; var15++) {
				byte var16 = arg3[arg7++];
				if (var16 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg8[var16 & 0xFF];
				}
			}
			arg5 += arg4;
			arg7 += arg9;
		}
	}
}
