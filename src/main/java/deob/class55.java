package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.f")
	public int[] field783 = new int[2];

	@ObfuscatedName("cc.g")
	public int[][][] field784 = new int[2][2][4];

	@ObfuscatedName("cc.h")
	public int[][][] field785 = new int[2][2][4];

	@ObfuscatedName("cc.i")
	public int[] field786 = new int[2];

	@ObfuscatedName("cc.j")
	public static float[][] field787 = new float[2][8];

	@ObfuscatedName("cc.k")
	public static int[][] field788 = new int[2][8];

	@ObfuscatedName("cc.l")
	public static float field789;

	@ObfuscatedName("cc.m")
	public static int field790;

	@ObfuscatedName("cc.a(FIII)F")
	public float method312(float arg0, int arg1, int arg2) {
		float var4 = (field785[arg2][1][arg1] - field785[arg2][0][arg1]) * arg0 + field785[arg2][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("cc.a(IF)F")
	public float method313(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("cc.a(FIZI)F")
	public float method314(float arg0, int arg1, int arg2) {
		float var4 = (field784[arg2][1][arg1] - field784[arg2][0][arg1]) * arg0 + field784[arg2][0][arg1];
		var4 *= 1.2207031E-4F;
		return method313(var4);
	}

	@ObfuscatedName("cc.a(FII)I")
	public int method315(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field786[1] - field786[0]) * arg0 + field786[0];
			var3 *= 0.0030517578F;
			field789 = (float) Math.pow(0.1D, var3 / 20.0F);
			field790 = (int) (field789 * 65536.0F);
		}

		if (field783[arg1] == 0) {
			return 0;
		}

		float var4 = method312(arg0, 0, arg1);
		field787[arg1][0] = var4 * -2.0F * (float) Math.cos(method314(arg0, 0, arg1));
		field787[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field783[arg1]; var5++) {
			float var6 = method312(arg0, var5, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method314(arg0, var5, arg1));
			float var8 = var6 * var6;
			field787[arg1][var5 * 2 + 1] = field787[arg1][var5 * 2 - 1] * var8;
			field787[arg1][var5 * 2] = field787[arg1][var5 * 2 - 1] * var7 + field787[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field787[arg1][var9] += field787[arg1][var9 - 1] * var7 + field787[arg1][var9 - 2] * var8;
			}

			field787[arg1][1] += field787[arg1][0] * var7 + var8;
			field787[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field783[0] * 2; var10++) {
				field787[0][var10] *= field789;
			}
		}

		for (int var11 = 0; var11 < field783[arg1] * 2; var11++) {
			field788[arg1][var11] = (int) (field787[arg1][var11] * 65536.0F);
		}

		return field783[arg1] * 2;
	}

	@ObfuscatedName("cc.a(Lmb;Lbc;Z)V")
	public final void method316(class39 arg0, class54 arg1) {
		int var3 = arg0.method228();
		field783[0] = var3 >> 4;
		field783[1] = var3 & 0xF;
		if (var3 == 0) {
			field786[0] = field786[1] = 0;
		} else {
			field786[0] = arg0.method230();
			field786[1] = arg0.method230();
			int var4 = arg0.method228();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field783[var5]; var6++) {
					field784[var5][0][var6] = arg0.method230();
					field785[var5][0][var6] = arg0.method230();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field783[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field784[var7][1][var8] = field784[var7][0][var8];
						field785[var7][1][var8] = field785[var7][0][var8];
					} else {
						field784[var7][1][var8] = arg0.method230();
						field785[var7][1][var8] = arg0.method230();
					}
				}
			}

			if (var4 != 0 || field786[1] != field786[0]) {
				arg1.method309(arg0);
			}
		}
	}
}
