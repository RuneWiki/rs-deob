package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.c")
	public int[] field782 = new int[2];

	@ObfuscatedName("bc.d")
	public int[][][] field783 = new int[2][2][4];

	@ObfuscatedName("bc.e")
	public int[][][] field784 = new int[2][2][4];

	@ObfuscatedName("bc.f")
	public int[] field785 = new int[2];

	@ObfuscatedName("bc.g")
	public static float[][] field786 = new float[2][8];

	@ObfuscatedName("bc.h")
	public static int[][] field787 = new int[2][8];

	@ObfuscatedName("bc.i")
	public static float field788;

	@ObfuscatedName("bc.j")
	public static int field789;

	@ObfuscatedName("bc.a(IIIF)F")
	public float method313(int arg0, int arg1, float arg2) {
		float var4 = (field784[arg0][1][arg1] - field784[arg0][0][arg1]) * arg2 + field784[arg0][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("bc.a(BF)F")
	public float method314(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("bc.a(FIII)F")
	public float method315(float arg0, int arg1, int arg2) {
		float var4 = (field783[arg1][1][arg2] - field783[arg1][0][arg2]) * arg0 + field783[arg1][0][arg2];
		var4 *= 1.2207031E-4F;
		return method314(var4);
	}

	@ObfuscatedName("bc.a(FIB)I")
	public int method316(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field785[1] - field785[0]) * arg0 + field785[0];
			var3 *= 0.0030517578F;
			field788 = (float) Math.pow(0.1D, var3 / 20.0F);
			field789 = (int) (field788 * 65536.0F);
		}

		if (field782[arg1] == 0) {
			return 0;
		}

		float var4 = method313(arg1, 0, arg0);
		field786[arg1][0] = var4 * -2.0F * (float) Math.cos(method315(arg0, arg1, 0));
		field786[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field782[arg1]; var5++) {
			float var6 = method313(arg1, var5, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method315(arg0, arg1, var5));
			float var8 = var6 * var6;
			field786[arg1][var5 * 2 + 1] = field786[arg1][var5 * 2 - 1] * var8;
			field786[arg1][var5 * 2] = field786[arg1][var5 * 2 - 1] * var7 + field786[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field786[arg1][var9] += field786[arg1][var9 - 1] * var7 + field786[arg1][var9 - 2] * var8;
			}

			field786[arg1][1] += field786[arg1][0] * var7 + var8;
			field786[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field782[0] * 2; var10++) {
				field786[0][var10] *= field788;
			}
		}

		for (int var11 = 0; var11 < field782[arg1] * 2; var11++) {
			field787[arg1][var11] = (int) (field786[arg1][var11] * 65536.0F);
		}

		return field782[arg1] * 2;
	}

	@ObfuscatedName("bc.a(ZLlb;Lac;)V")
	public final void method317(class38 arg0, class53 arg1) {
		int var3 = arg0.method229();
		field782[0] = var3 >> 4;
		field782[1] = var3 & 0xF;
		if (var3 == 0) {
			field785[0] = field785[1] = 0;
		} else {
			field785[0] = arg0.method231();
			field785[1] = arg0.method231();
			int var4 = arg0.method229();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field782[var5]; var6++) {
					field783[var5][0][var6] = arg0.method231();
					field784[var5][0][var6] = arg0.method231();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field782[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field783[var7][1][var8] = field783[var7][0][var8];
						field784[var7][1][var8] = field784[var7][0][var8];
					} else {
						field783[var7][1][var8] = arg0.method231();
						field784[var7][1][var8] = arg0.method231();
					}
				}
			}

			if (var4 != 0 || field785[1] != field785[0]) {
				arg1.method310(arg0);
			}
		}
	}
}
