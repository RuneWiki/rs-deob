package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("kc")
public class FloType {

	@ObfuscatedName("kc.a")
	public static int numDefinitions;

	@ObfuscatedName("kc.b")
	public static FloType[] list;

	@ObfuscatedName("kc.c")
	public int colour;

	@ObfuscatedName("kc.d")
	public int texture = -1;

	@ObfuscatedName("kc.e")
	public boolean overlay = false;

	@ObfuscatedName("kc.f")
	public boolean occlude = true;

	@ObfuscatedName("kc.g")
	public String debugname;

	@ObfuscatedName("kc.h")
	public int hue;

	@ObfuscatedName("kc.i")
	public int saturation;

	@ObfuscatedName("kc.j")
	public int lightness;

	@ObfuscatedName("kc.k")
	public int underlayHue;

	@ObfuscatedName("kc.l")
	public int chroma;

	@ObfuscatedName("kc.m")
	public int overlayHsl;

	@ObfuscatedName("kc.a(ZLyb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("flo.dat", null));
		numDefinitions = var1.g2();
		if (list == null) {
			list = new FloType[numDefinitions];
		}

		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new FloType();
			}

			list[var2].decode(var1);
		}
	}

	@ObfuscatedName("kc.a(ILmb;)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				colour = arg0.g3();
				getHsl(colour);
			} else if (var2 == 2) {
				texture = arg0.g1();
			} else if (var2 == 3) {
				overlay = true;
			} else if (var2 == 5) {
				occlude = false;
			} else if (var2 == 6) {
				debugname = arg0.gstr();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public void getHsl(int arg0) {
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
			chroma = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			chroma = (int) (var14 * var16 * 512.0D);
		}

		if (chroma < 1) {
			chroma = 1;
		}

		underlayHue = (int) (chroma * var12);
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

		overlayHsl = getTable(var18, var19, var20);
	}

	@ObfuscatedName("kc.a(III)I")
	public final int getTable(int arg0, int arg1, int arg2) {
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
