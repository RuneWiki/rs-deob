package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class FloType {

	@ObfuscatedName("MNHKFPQO.a")
	public boolean _flowObfuscator1 = true;

	@ObfuscatedName("MNHKFPQO.g")
	public int texture = -1;

	@ObfuscatedName("MNHKFPQO.h")
	public boolean overlay = false;

	@ObfuscatedName("MNHKFPQO.i")
	public boolean occlude = true;

	@ObfuscatedName("MNHKFPQO.b")
	public static int _flowObfuscator2;

	@ObfuscatedName("MNHKFPQO.c")
	public static int count;

	@ObfuscatedName("MNHKFPQO.f")
	public int rgb;

	@ObfuscatedName("MNHKFPQO.j")
	public int hue;

	@ObfuscatedName("MNHKFPQO.k")
	public int saturation;

	@ObfuscatedName("MNHKFPQO.l")
	public int lightness;

	@ObfuscatedName("MNHKFPQO.m")
	public int chroma;

	@ObfuscatedName("MNHKFPQO.n")
	public int luminance;

	@ObfuscatedName("MNHKFPQO.o")
	public int hsl;

	@ObfuscatedName("MNHKFPQO.e")
	public String debugname;

	@ObfuscatedName("MNHKFPQO.d")
	public static FloType[] instances;

	@ObfuscatedName("MNHKFPQO.a(ILXTGLDHGX;)V")
	public static void unpack(int arg0, Jagfile arg1) {
		if (arg0 != 0) {
			_flowObfuscator2 = 115;
		}
		Packet var2 = new Packet(arg1.read("flo.dat", null), 891);
		count = var2.g2();
		if (instances == null) {
			instances = new FloType[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (instances[var3] == null) {
				instances[var3] = new FloType();
			}
			instances[var3].decodeClient(true, var2);
		}
	}

	@ObfuscatedName("MNHKFPQO.a(ZLMBMGIXGO;)V")
	public void decodeClient(boolean arg0, Packet arg1) {
		if (!arg0) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}
			if (var3 == 1) {
				this.rgb = arg1.g3();
				this.setColour(this.rgb, 9);
			} else if (var3 == 2) {
				this.texture = arg1.g1();
			} else if (var3 == 3) {
				this.overlay = true;
			} else if (var3 == 5) {
				this.occlude = false;
			} else if (var3 == 6) {
				this.debugname = arg1.gjstr();
			} else if (var3 == 7) {
				int var4 = this.hue;
				int var5 = this.saturation;
				int var6 = this.lightness;
				int var7 = this.chroma;
				int var8 = arg1.g3();
				this.setColour(var8, 9);
				this.hue = var4;
				this.saturation = var5;
				this.lightness = var6;
				this.chroma = var7;
				this.luminance = var7;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}

	@ObfuscatedName("MNHKFPQO.a(II)V")
	public void setColour(int arg0, int arg1) {
		double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var7 = (double) (arg0 & 0xFF) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}
		if (var7 < var9) {
			var9 = var7;
		}
		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}
		if (var7 > var11) {
			var11 = var7;
		}
		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var9 + var11) / 2.0D;
		if (var9 != var11) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}
			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}
			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var7 == var11) {
				var13 = (var3 - var5) / (var11 - var9) + 4.0D;
			}
		}
		double var19 = var13 / 6.0D;
		this.hue = (int) (var19 * 256.0D);
		this.saturation = (int) (var15 * 256.0D);
		this.lightness = (int) (var17 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
		if (var17 > 0.5D) {
			this.luminance = (int) ((1.0D - var17) * var15 * 512.0D);
		} else {
			this.luminance = (int) (var15 * var17 * 512.0D);
		}
		if (this.luminance < 1) {
			this.luminance = 1;
		}
		this.chroma = (int) ((double) this.luminance * var19);
		int var21 = this.hue + (int) (Math.random() * 16.0D) - 8;
		if (var21 < 0) {
			var21 = 0;
		} else if (var21 > 255) {
			var21 = 255;
		}
		int var22 = this.saturation + (int) (Math.random() * 48.0D) - 24;
		if (arg1 < 9 || arg1 > 9) {
			return;
		}
		if (var22 < 0) {
			var22 = 0;
		} else if (var22 > 255) {
			var22 = 255;
		}
		int var23 = this.lightness + (int) (Math.random() * 48.0D) - 24;
		if (var23 < 0) {
			var23 = 0;
		} else if (var23 > 255) {
			var23 = 255;
		}
		this.hsl = this.hsl24to16(var21, var22, var23);
	}

	@ObfuscatedName("MNHKFPQO.a(III)I")
	public final int hsl24to16(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}
}
