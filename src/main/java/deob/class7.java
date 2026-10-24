package deob;

@ObfuscatedName("g")
public class class7 {

	@ObfuscatedName("g.a")
	public static class7[] field72;

	@ObfuscatedName("g.b")
	public int field73;

	@ObfuscatedName("g.c")
	public class6 field74;

	@ObfuscatedName("g.d")
	public int field75;

	@ObfuscatedName("g.e")
	public int[] field76;

	@ObfuscatedName("g.f")
	public int[] field77;

	@ObfuscatedName("g.g")
	public int[] field78;

	@ObfuscatedName("g.h")
	public int[] field79;

	@ObfuscatedName("g.a(Lub;Z)V")
	public static void method49(class47 arg0) {
		class37 var1 = new class37(arg0.method257(null, "frame_head.dat"));
		class37 var2 = new class37(arg0.method257(null, "frame_tran1.dat"));
		class37 var3 = new class37(arg0.method257(null, "frame_tran2.dat"));
		class37 var4 = new class37(arg0.method257(null, "frame_del.dat"));
		int var5 = var1.method218();
		int var6 = var1.method218();
		field72 = new class7[var6 + 1];
		int[] var7 = new int[500];
		int[] var8 = new int[500];
		int[] var9 = new int[500];
		int[] var10 = new int[500];
		for (int var11 = 0; var11 < var5; var11++) {
			int var12 = var1.method218();
			class7 var13 = field72[var12] = new class7();
			var13.field73 = var4.method216();
			int var14 = var1.method218();
			class6 var15 = class6.field68[var14];
			var13.field74 = var15;
			int var16 = var1.method216();
			int var17 = -1;
			int var18 = 0;
			for (int var19 = 0; var19 < var16; var19++) {
				int var20 = var2.method216();
				if (var20 > 0) {
					if (var15.field70[var19] != 0) {
						for (int var21 = var19 - 1; var21 > var17; var21--) {
							if (var15.field70[var21] == 0) {
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
					if (var15.field70[var7[var18]] == 3) {
						var22 = 128;
					}

					if ((var20 & 0x1) == 0) {
						var8[var18] = var22;
					} else {
						var8[var18] = var3.method229();
					}

					if ((var20 & 0x2) == 0) {
						var9[var18] = var22;
					} else {
						var9[var18] = var3.method229();
					}

					if ((var20 & 0x4) == 0) {
						var10[var18] = var22;
					} else {
						var10[var18] = var3.method229();
					}

					var17 = var19;
					var18++;
				}
			}

			var13.field75 = var18;
			var13.field76 = new int[var18];
			var13.field77 = new int[var18];
			var13.field78 = new int[var18];
			var13.field79 = new int[var18];
			for (int var23 = 0; var23 < var18; var23++) {
				var13.field76[var23] = var7[var23];
				var13.field77[var23] = var8[var23];
				var13.field78[var23] = var9[var23];
				var13.field79[var23] = var10[var23];
			}
		}
	}
}
