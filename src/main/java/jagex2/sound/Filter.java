package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("VADHJTLJ")
public class Filter {

	@ObfuscatedName("VADHJTLJ.c")
	public int[] pairs = new int[2];

	@ObfuscatedName("VADHJTLJ.d")
	public int[][][] frequencies = new int[2][2][4];

	@ObfuscatedName("VADHJTLJ.e")
	public int[][][] ranges = new int[2][2][4];

	@ObfuscatedName("VADHJTLJ.f")
	public int[] unities = new int[2];

	@ObfuscatedName("VADHJTLJ.g")
	public static float[][] coefficient = new float[2][8];

	@ObfuscatedName("VADHJTLJ.h")
	public static int[][] coefficient16 = new int[2][8];

	@ObfuscatedName("VADHJTLJ.i")
	public static float unity;

	@ObfuscatedName("VADHJTLJ.j")
	public static int unity16;

	@ObfuscatedName("VADHJTLJ.a(IIFZ)F")
	public float gain(int arg0, int arg1, float arg2) {
		float var4 = (ranges[arg0][1][arg1] - ranges[arg0][0][arg1]) * arg2 + ranges[arg0][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("VADHJTLJ.a(BF)F")
	public float normalize(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("VADHJTLJ.a(BFII)F")
	public float phase(float arg0, int arg1, int arg2) {
		float var4 = (frequencies[arg2][1][arg1] - frequencies[arg2][0][arg1]) * arg0 + frequencies[arg2][0][arg1];
		var4 *= 1.2207031E-4F;
		return normalize(var4);
	}

	@ObfuscatedName("VADHJTLJ.a(IFI)I")
	public int evaluate(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (unities[1] - unities[0]) * arg1 + unities[0];
			var3 *= 0.0030517578F;
			unity = (float) Math.pow(0.1D, var3 / 20.0F);
			unity16 = (int) (unity * 65536.0F);
		}

		if (pairs[arg0] == 0) {
			return 0;
		}

		float var4 = gain(arg0, 0, arg1);
		coefficient[arg0][0] = var4 * -2.0F * (float) Math.cos(phase(arg1, 0, arg0));
		coefficient[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < pairs[arg0]; var5++) {
			float var6 = gain(arg0, var5, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(phase(arg1, var5, arg0));
			float var8 = var6 * var6;
			coefficient[arg0][var5 * 2 + 1] = coefficient[arg0][var5 * 2 - 1] * var8;
			coefficient[arg0][var5 * 2] = coefficient[arg0][var5 * 2 - 1] * var7 + coefficient[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				coefficient[arg0][var9] += coefficient[arg0][var9 - 1] * var7 + coefficient[arg0][var9 - 2] * var8;
			}

			coefficient[arg0][1] += coefficient[arg0][0] * var7 + var8;
			coefficient[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < pairs[0] * 2; var10++) {
				coefficient[0][var10] *= unity;
			}
		}

		for (int var11 = 0; var11 < pairs[arg0] * 2; var11++) {
			coefficient16[arg0][var11] = (int) (coefficient[arg0][var11] * 65536.0F);
		}

		return pairs[arg0] * 2;
	}

	@ObfuscatedName("VADHJTLJ.a(LMBMGIXGO;ZLOZKFTHAD;)V")
	public final void read(Packet arg0, Envelope arg1) {
		int var3 = arg0.g1();
		pairs[0] = var3 >> 4;
		pairs[1] = var3 & 0xF;
		if (var3 == 0) {
			unities[0] = unities[1] = 0;
		} else {
			unities[0] = arg0.g2();
			unities[1] = arg0.g2();
			int var4 = arg0.g1();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < pairs[var5]; var6++) {
					frequencies[var5][0][var6] = arg0.g2();
					ranges[var5][0][var6] = arg0.g2();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < pairs[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						frequencies[var7][1][var8] = frequencies[var7][0][var8];
						ranges[var7][1][var8] = ranges[var7][0][var8];
					} else {
						frequencies[var7][1][var8] = arg0.g2();
						ranges[var7][1][var8] = arg0.g2();
					}
				}
			}

			if (var4 != 0 || unities[1] != unities[0]) {
				arg1.readShape(arg0);
			}
		}
	}
}
