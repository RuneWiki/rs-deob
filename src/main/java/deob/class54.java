package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.e")
	public int[] field774 = new int[2];

	@ObfuscatedName("bc.f")
	public int[][][] field775 = new int[2][2][4];

	@ObfuscatedName("bc.g")
	public int[][][] field776 = new int[2][2][4];

	@ObfuscatedName("bc.h")
	public int[] field777 = new int[2];

	@ObfuscatedName("bc.i")
	public static float[][] field778 = new float[2][8];

	@ObfuscatedName("bc.j")
	public static int[][] field779 = new int[2][8];

	@ObfuscatedName("bc.k")
	public static float field780;

	@ObfuscatedName("bc.l")
	public static int field781;

	@ObfuscatedName("bc.a(FIII)F")
	public float method308(float arg0, int arg1, int arg2) {
		float var4 = (field776[arg2][1][arg1] - field776[arg2][0][arg1]) * arg0 + field776[arg2][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("bc.a(FZ)F")
	public float method309(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("bc.a(IIIF)F")
	public float method310(int arg0, int arg1, float arg2) {
		float var4 = (field775[arg0][1][arg1] - field775[arg0][0][arg1]) * arg2 + field775[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method309(var4);
	}

	@ObfuscatedName("bc.a(IFI)I")
	public int method311(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field777[1] - field777[0]) * arg0 + field777[0];
			var3 *= 0.0030517578F;
			field780 = (float) Math.pow(0.1D, var3 / 20.0F);
			field781 = (int) (field780 * 65536.0F);
		}

		if (field774[arg1] == 0) {
			return 0;
		}

		float var4 = method308(arg0, 0, arg1);
		field778[arg1][0] = var4 * -2.0F * (float) Math.cos(method310(arg1, 0, arg0));
		field778[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field774[arg1]; var5++) {
			float var6 = method308(arg0, var5, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method310(arg1, var5, arg0));
			float var8 = var6 * var6;
			field778[arg1][var5 * 2 + 1] = field778[arg1][var5 * 2 - 1] * var8;
			field778[arg1][var5 * 2] = field778[arg1][var5 * 2 - 1] * var7 + field778[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field778[arg1][var9] += field778[arg1][var9 - 1] * var7 + field778[arg1][var9 - 2] * var8;
			}

			field778[arg1][1] += field778[arg1][0] * var7 + var8;
			field778[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field774[0] * 2; var10++) {
				field778[0][var10] *= field780;
			}
		}

		for (int var11 = 0; var11 < field774[arg1] * 2; var11++) {
			field779[arg1][var11] = (int) (field778[arg1][var11] * 65536.0F);
		}

		return field774[arg1] * 2;
	}

	@ObfuscatedName("bc.a(ILac;Llb;)V")
	public final void method312(class53 arg0, class38 arg1) {
		int var3 = arg1.method224();
		field774[0] = var3 >> 4;
		field774[1] = var3 & 0xF;
		if (var3 == 0) {
			field777[0] = field777[1] = 0;
		} else {
			field777[0] = arg1.method226();
			field777[1] = arg1.method226();
			int var4 = arg1.method224();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field774[var5]; var6++) {
					field775[var5][0][var6] = arg1.method226();
					field776[var5][0][var6] = arg1.method226();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field774[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field775[var7][1][var8] = field775[var7][0][var8];
						field776[var7][1][var8] = field776[var7][0][var8];
					} else {
						field775[var7][1][var8] = arg1.method226();
						field776[var7][1][var8] = arg1.method226();
					}
				}
			}

			if (var4 != 0 || field777[1] != field777[0]) {
				arg0.method305(arg1);
			}
		}
	}
}
