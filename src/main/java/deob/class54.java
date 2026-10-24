package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.c")
	public int[] field781 = new int[2];

	@ObfuscatedName("bc.d")
	public int[][][] field782 = new int[2][2][4];

	@ObfuscatedName("bc.e")
	public int[][][] field783 = new int[2][2][4];

	@ObfuscatedName("bc.f")
	public int[] field784 = new int[2];

	@ObfuscatedName("bc.g")
	public static float[][] field785 = new float[2][8];

	@ObfuscatedName("bc.h")
	public static int[][] field786 = new int[2][8];

	@ObfuscatedName("bc.i")
	public static float field787;

	@ObfuscatedName("bc.j")
	public static int field788;

	@ObfuscatedName("bc.a(IFZI)F")
	public float method313(int arg0, float arg1, int arg2) {
		float var4 = (field783[arg2][1][arg0] - field783[arg2][0][arg0]) * arg1 + field783[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("bc.a(IF)F")
	public float method314(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("bc.a(ZIIF)F")
	public float method315(int arg0, int arg1, float arg2) {
		float var4 = (field782[arg1][1][arg0] - field782[arg1][0][arg0]) * arg2 + field782[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method314(var4);
	}

	@ObfuscatedName("bc.a(IIF)I")
	public int method316(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field784[1] - field784[0]) * arg1 + field784[0];
			var3 *= 0.0030517578F;
			field787 = (float) Math.pow(0.1D, var3 / 20.0F);
			field788 = (int) (field787 * 65536.0F);
		}

		if (field781[arg0] == 0) {
			return 0;
		}

		float var4 = method313(0, arg1, arg0);
		field785[arg0][0] = var4 * -2.0F * (float) Math.cos(method315(0, arg0, arg1));
		field785[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field781[arg0]; var5++) {
			float var6 = method313(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method315(var5, arg0, arg1));
			float var8 = var6 * var6;
			field785[arg0][var5 * 2 + 1] = field785[arg0][var5 * 2 - 1] * var8;
			field785[arg0][var5 * 2] = field785[arg0][var5 * 2 - 1] * var7 + field785[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field785[arg0][var9] += field785[arg0][var9 - 1] * var7 + field785[arg0][var9 - 2] * var8;
			}

			field785[arg0][1] += field785[arg0][0] * var7 + var8;
			field785[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field781[0] * 2; var10++) {
				field785[0][var10] *= field787;
			}
		}

		for (int var11 = 0; var11 < field781[arg0] * 2; var11++) {
			field786[arg0][var11] = (int) (field785[arg0][var11] * 65536.0F);
		}

		return field781[arg0] * 2;
	}

	@ObfuscatedName("bc.a(Lac;Llb;I)V")
	public final void method317(class53 arg0, class38 arg1) {
		int var3 = arg1.method229();
		field781[0] = var3 >> 4;
		field781[1] = var3 & 0xF;
		if (var3 == 0) {
			field784[0] = field784[1] = 0;
		} else {
			field784[0] = arg1.method231();
			field784[1] = arg1.method231();
			int var4 = arg1.method229();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field781[var5]; var6++) {
					field782[var5][0][var6] = arg1.method231();
					field783[var5][0][var6] = arg1.method231();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field781[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field782[var7][1][var8] = field782[var7][0][var8];
						field783[var7][1][var8] = field783[var7][0][var8];
					} else {
						field782[var7][1][var8] = arg1.method231();
						field783[var7][1][var8] = arg1.method231();
					}
				}
			}

			if (var4 != 0 || field784[1] != field784[0]) {
				arg0.method310(arg1);
			}
		}
	}
}
