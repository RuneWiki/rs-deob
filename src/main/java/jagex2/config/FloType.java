package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("MNHKFPQO")
public class FloType {

	@ObfuscatedName("MNHKFPQO.g")
	public int texture = -1;

	@ObfuscatedName("MNHKFPQO.h")
	public boolean overlay = false;

	@ObfuscatedName("MNHKFPQO.i")
	public boolean occlude = true;

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
	public static void unpack(Jagfile arg0) {
		Packet var1 = new Packet(arg0.read("flo.dat", null));
		count = var1.g2();
		if (instances == null) {
			instances = new FloType[count];
		}

		for (int var2 = 0; var2 < count; var2++) {
			if (instances[var2] == null) {
				instances[var2] = new FloType();
			}

			instances[var2].decodeClient(var1);
		}
	}

	@ObfuscatedName("MNHKFPQO.a(ZLMBMGIXGO;)V")
	public void decodeClient(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				rgb = arg0.g3();
				setColour(rgb);
			} else if (var2 == 2) {
				texture = arg0.g1();
			} else if (var2 == 3) {
				overlay = true;
			} else if (var2 == 5) {
				occlude = false;
			} else if (var2 == 6) {
				debugname = arg0.gjstr();
			} else if (var2 == 7) {
				int var3 = hue;
				int var4 = saturation;
				int var5 = lightness;
				int var6 = chroma;
				int var7 = arg0.g3();
				setColour(var7);
				hue = var3;
				saturation = var4;
				lightness = var5;
				chroma = var6;
				luminance = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("MNHKFPQO.a(II)V")
	public void setColour(int arg0) {
		double var2 = (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		hue = (int) (var12 * 256.0D);
		saturation = (int) (var14 * 256.0D);
		lightness = (int) (var16 * 256.0D);

		if (saturation < 0) {
			saturation = 0;
		} else if (saturation > 255) {
			saturation = 255;
		}

		if (lightness < 0) {
			lightness = 0;
		} else if (lightness > 255) {
			lightness = 255;
		}

		if (var16 > 0.5D) {
			luminance = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			luminance = (int) (var14 * var16 * 512.0D);
		}

		if (luminance < 1) {
			luminance = 1;
		}

		chroma = (int) (luminance * var12);
		int var18 = hue + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = saturation + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = lightness + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		hsl = hsl24to16(var18, var19, var20);
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
