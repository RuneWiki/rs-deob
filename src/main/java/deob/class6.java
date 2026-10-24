package deob;

@ObfuscatedName("f")
public class class6 {

	@ObfuscatedName("f.b")
	public static class6[] field61;

	@ObfuscatedName("f.c")
	public int field62;

	@ObfuscatedName("f.d")
	public class5 field63;

	@ObfuscatedName("f.e")
	public int field64;

	@ObfuscatedName("f.f")
	public int[] field65;

	@ObfuscatedName("f.g")
	public int[] field66;

	@ObfuscatedName("f.h")
	public int[] field67;

	@ObfuscatedName("f.i")
	public int[] field68;

	@ObfuscatedName("f.a(BLtb;)V")
	public static void method34(class46 arg0) {
		class36 var1 = new class36(arg0.method225(null, "frame_head.dat"));
		class36 var2 = new class36(arg0.method225(null, "frame_tran1.dat"));
		class36 var3 = new class36(arg0.method225(null, "frame_tran2.dat"));
		class36 var4 = new class36(arg0.method225(null, "frame_del.dat"));
		int var5 = var1.method187();
		int var6 = var1.method187();
		field61 = new class6[var6 + 1];
		int[] var7 = new int[500];
		int[] var8 = new int[500];
		int[] var9 = new int[500];
		int[] var10 = new int[500];
		for (int var11 = 0; var11 < var5; var11++) {
			int var12 = var1.method187();
			class6 var13 = field61[var12] = new class6();
			var13.field62 = var4.method185();
			int var14 = var1.method187();
			class5 var15 = class5.field57[var14];
			var13.field63 = var15;
			int var16 = var1.method185();
			int var17 = -1;
			int var18 = 0;
			for (int var19 = 0; var19 < var16; var19++) {
				int var20 = var2.method185();
				if (var20 > 0) {
					if (var15.field59[var19] != 0) {
						for (int var21 = var19 - 1; var21 > var17; var21--) {
							if (var15.field59[var21] == 0) {
								var7[var18] = var21;
								var8[var18] = 0;
								var9[var18] = 0;
								var10[var18] = 0;
								var18++;
								break;
							}
						}
					}

					var7[var18] = var19;
					short var22 = 0;
					if (var15.field59[var7[var18]] == 3) {
						var22 = 128;
					}

					if ((var20 & 0x1) == 0) {
						var8[var18] = var22;
					} else {
						var8[var18] = var3.method198();
					}

					if ((var20 & 0x2) == 0) {
						var9[var18] = var22;
					} else {
						var9[var18] = var3.method198();
					}

					if ((var20 & 0x4) == 0) {
						var10[var18] = var22;
					} else {
						var10[var18] = var3.method198();
					}

					var17 = var19;
					var18++;
				}
			}

			var13.field64 = var18;
			var13.field65 = new int[var18];
			var13.field66 = new int[var18];
			var13.field67 = new int[var18];
			var13.field68 = new int[var18];
			for (int var23 = 0; var23 < var18; var23++) {
				var13.field65[var23] = var7[var23];
				var13.field66[var23] = var8[var23];
				var13.field67[var23] = var9[var23];
				var13.field68[var23] = var10[var23];
			}
		}
	}
}
