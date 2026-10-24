package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("bc")
public class Filter {

	@ObfuscatedName("bc.c")
	public int[] pairs = new int[2];

	@ObfuscatedName("bc.d")
	public int[][][] frequencies = new int[2][2][4];

	@ObfuscatedName("bc.e")
	public int[][][] ranges = new int[2][2][4];

	@ObfuscatedName("bc.f")
	public int[] unities = new int[2];

	@ObfuscatedName("bc.g")
	public static float[][] coeff = new float[2][8];

	@ObfuscatedName("bc.h")
	public static int[][] coeffInt = new int[2][8];

	@ObfuscatedName("bc.i")
	public static float reduceCoeff;

	@ObfuscatedName("bc.j")
	public static int reduceCoeffInt;

	@ObfuscatedName("bc.a(IZFI)F")
	public float radius(int arg0, float arg1, int arg2) {
		float var4 = (ranges[arg2][1][arg0] - ranges[arg2][0][arg0]) * arg1 + ranges[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("bc.a(IF)F")
	public float frequency(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("bc.a(IIIF)F")
	public float frequency(int arg0, int arg1, float arg2) {
		float var4 = (frequencies[arg0][1][arg1] - frequencies[arg0][0][arg1]) * arg2 + frequencies[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return frequency(var4);
	}

	@ObfuscatedName("bc.a(IIF)I")
	public int calculateCoeffs(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (unities[1] - unities[0]) * arg1 + unities[0];
			var3 *= 0.0030517578F;
			reduceCoeff = (float) Math.pow(0.1D, var3 / 20.0F);
			reduceCoeffInt = (int) (reduceCoeff * 65536.0F);
		}

		if (pairs[arg0] == 0) {
			return 0;
		}

		float var4 = radius(0, arg1, arg0);
		coeff[arg0][0] = var4 * -2.0F * (float) Math.cos(frequency(arg0, 0, arg1));
		coeff[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < pairs[arg0]; var5++) {
			float var6 = radius(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(frequency(arg0, var5, arg1));
			float var8 = var6 * var6;
			coeff[arg0][var5 * 2 + 1] = coeff[arg0][var5 * 2 - 1] * var8;
			coeff[arg0][var5 * 2] = coeff[arg0][var5 * 2 - 1] * var7 + coeff[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				coeff[arg0][var9] += coeff[arg0][var9 - 1] * var7 + coeff[arg0][var9 - 2] * var8;
			}

			coeff[arg0][1] += coeff[arg0][0] * var7 + var8;
			coeff[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < pairs[0] * 2; var10++) {
				coeff[0][var10] *= reduceCoeff;
			}
		}

		for (int var11 = 0; var11 < pairs[arg0] * 2; var11++) {
			coeffInt[arg0][var11] = (int) (coeff[arg0][var11] * 65536.0F);
		}

		return pairs[arg0] * 2;
	}

	@ObfuscatedName("bc.a(ILac;Llb;)V")
	public final void load(Envelope arg0, Packet arg1) {
		int var3 = arg1.g1();
		pairs[0] = var3 >> 4;
		pairs[1] = var3 & 0xF;
		if (var3 == 0) {
			unities[0] = unities[1] = 0;
		} else {
			unities[0] = arg1.g2();
			unities[1] = arg1.g2();
			int var4 = arg1.g1();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < pairs[var5]; var6++) {
					frequencies[var5][0][var6] = arg1.g2();
					ranges[var5][0][var6] = arg1.g2();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < pairs[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						frequencies[var7][1][var8] = frequencies[var7][0][var8];
						ranges[var7][1][var8] = ranges[var7][0][var8];
					} else {
						frequencies[var7][1][var8] = arg1.g2();
						ranges[var7][1][var8] = arg1.g2();
					}
				}
			}

			if (var4 != 0 || unities[1] != unities[0]) {
				arg0.loadPoints(arg1);
			}
		}
	}
}
