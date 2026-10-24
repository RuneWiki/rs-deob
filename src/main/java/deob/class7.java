package deob;

@ObfuscatedName("g")
public class class7 {

	@ObfuscatedName("g.c")
	public static class7[] field70;

	@ObfuscatedName("g.d")
	public int field71;

	@ObfuscatedName("g.e")
	public class6 field72;

	@ObfuscatedName("g.f")
	public int field73;

	@ObfuscatedName("g.g")
	public int[] field74;

	@ObfuscatedName("g.h")
	public int[] field75;

	@ObfuscatedName("g.i")
	public int[] field76;

	@ObfuscatedName("g.j")
	public int[] field77;

	@ObfuscatedName("g.a(BLub;)V")
	public static void method48(class47 arg0) {
		class37 var1 = new class37(arg0.method249("frame_head.dat", null));
		class37 var2 = new class37(arg0.method249("frame_tran1.dat", null));
		class37 var3 = new class37(arg0.method249("frame_tran2.dat", null));
		class37 var4 = new class37(arg0.method249("frame_del.dat", null));
		int var5 = var1.method210();
		int var6 = var1.method210();
		field70 = new class7[var6 + 1];
		int[] var7 = new int[500];
		int[] var8 = new int[500];
		int[] var9 = new int[500];
		int[] var10 = new int[500];
		for (int var11 = 0; var11 < var5; var11++) {
			int var12 = var1.method210();
			class7 var13 = field70[var12] = new class7();
			var13.field71 = var4.method208();
			int var14 = var1.method210();
			class6 var15 = class6.field66[var14];
			var13.field72 = var15;
			int var16 = var1.method208();
			int var17 = -1;
			int var18 = 0;
			for (int var19 = 0; var19 < var16; var19++) {
				int var20 = var2.method208();
				if (var20 > 0) {
					if (var15.field68[var19] != 0) {
						for (int var21 = var19 - 1; var21 > var17; var21--) {
							if (var15.field68[var21] == 0) {
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
					if (var15.field68[var7[var18]] == 3) {
						var22 = 128;
					}

					if ((var20 & 0x1) == 0) {
						var8[var18] = var22;
					} else {
						var8[var18] = var3.method221();
					}

					if ((var20 & 0x2) == 0) {
						var9[var18] = var22;
					} else {
						var9[var18] = var3.method221();
					}

					if ((var20 & 0x4) == 0) {
						var10[var18] = var22;
					} else {
						var10[var18] = var3.method221();
					}

					var17 = var19;
					var18++;
				}
			}

			var13.field73 = var18;
			var13.field74 = new int[var18];
			var13.field75 = new int[var18];
			var13.field76 = new int[var18];
			var13.field77 = new int[var18];
			for (int var23 = 0; var23 < var18; var23++) {
				var13.field74[var23] = var7[var23];
				var13.field75[var23] = var8[var23];
				var13.field76[var23] = var9[var23];
				var13.field77[var23] = var10[var23];
			}
		}
	}
}
