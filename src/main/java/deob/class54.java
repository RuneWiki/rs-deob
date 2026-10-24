package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.c")
	public int[] field776 = new int[2];

	@ObfuscatedName("bc.d")
	public int[][][] field777 = new int[2][2][4];

	@ObfuscatedName("bc.e")
	public int[][][] field778 = new int[2][2][4];

	@ObfuscatedName("bc.f")
	public int[] field779 = new int[2];

	@ObfuscatedName("bc.g")
	public static float[][] field780 = new float[2][8];

	@ObfuscatedName("bc.h")
	public static int[][] field781 = new int[2][8];

	@ObfuscatedName("bc.i")
	public static float field782;

	@ObfuscatedName("bc.j")
	public static int field783;

	@ObfuscatedName("bc.a(FZII)F")
	public float method309(float arg0, int arg1, int arg2) {
		float var4 = (field778[arg2][1][arg1] - field778[arg2][0][arg1]) * arg0 + field778[arg2][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("bc.a(ZF)F")
	public float method310(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("bc.a(IIFI)F")
	public float method311(int arg0, int arg1, float arg2) {
		float var4 = (field777[arg1][1][arg0] - field777[arg1][0][arg0]) * arg2 + field777[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method310(var4);
	}

	@ObfuscatedName("bc.a(IFZ)I")
	public int method312(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field779[1] - field779[0]) * arg1 + field779[0];
			var3 *= 0.0030517578F;
			field782 = (float) Math.pow(0.1D, var3 / 20.0F);
			field783 = (int) (field782 * 65536.0F);
		}

		if (field776[arg0] == 0) {
			return 0;
		}

		float var4 = method309(arg1, 0, arg0);
		field780[arg0][0] = var4 * -2.0F * (float) Math.cos(method311(0, arg0, arg1));
		field780[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field776[arg0]; var5++) {
			float var6 = method309(arg1, var5, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method311(var5, arg0, arg1));
			float var8 = var6 * var6;
			field780[arg0][var5 * 2 + 1] = field780[arg0][var5 * 2 - 1] * var8;
			field780[arg0][var5 * 2] = field780[arg0][var5 * 2 - 1] * var7 + field780[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field780[arg0][var9] += field780[arg0][var9 - 1] * var7 + field780[arg0][var9 - 2] * var8;
			}

			field780[arg0][1] += field780[arg0][0] * var7 + var8;
			field780[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field776[0] * 2; var10++) {
				field780[0][var10] *= field782;
			}
		}

		for (int var11 = 0; var11 < field776[arg0] * 2; var11++) {
			field781[arg0][var11] = (int) (field780[arg0][var11] * 65536.0F);
		}

		return field776[arg0] * 2;
	}

	@ObfuscatedName("bc.a(Lac;Llb;I)V")
	public final void method313(class53 arg0, class38 arg1) {
		int var3 = arg1.method225();
		field776[0] = var3 >> 4;
		field776[1] = var3 & 0xF;
		if (var3 == 0) {
			field779[0] = field779[1] = 0;
		} else {
			field779[0] = arg1.method227();
			field779[1] = arg1.method227();
			int var4 = arg1.method225();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field776[var5]; var6++) {
					field777[var5][0][var6] = arg1.method227();
					field778[var5][0][var6] = arg1.method227();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field776[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field777[var7][1][var8] = field777[var7][0][var8];
						field778[var7][1][var8] = field778[var7][0][var8];
					} else {
						field777[var7][1][var8] = arg1.method227();
						field778[var7][1][var8] = arg1.method227();
					}
				}
			}

			if (var4 != 0 || field779[1] != field779[0]) {
				arg0.method306(arg1);
			}
		}
	}
}
