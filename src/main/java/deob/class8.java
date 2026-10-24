package deob;

@ObfuscatedName("h")
public class class8 {

	@ObfuscatedName("h.c")
	public static class8[] field142;

	@ObfuscatedName("h.d")
	public int field143;

	@ObfuscatedName("h.e")
	public class7 field144;

	@ObfuscatedName("h.f")
	public int field145;

	@ObfuscatedName("h.g")
	public int[] field146;

	@ObfuscatedName("h.h")
	public int[] field147;

	@ObfuscatedName("h.i")
	public int[] field148;

	@ObfuscatedName("h.j")
	public int[] field149;

	@ObfuscatedName("h.a(I)V")
	public static void method58(int arg0) {
		field142 = new class8[arg0 + 1];
	}

	@ObfuscatedName("h.a(Z[B)V")
	public static void method59(byte[] arg0) {
		class39 var1 = new class39(arg0);
		var1.field623 = arg0.length - 8;
		int var2 = var1.method240();
		int var3 = var1.method240();
		int var4 = var1.method240();
		int var5 = var1.method240();
		int var6 = 0;
		class39 var7 = new class39(arg0);
		var7.field623 = var6;
		var6 += var2 + 2;
		class39 var8 = new class39(arg0);
		var8.field623 = var6;
		var6 += var3;
		class39 var9 = new class39(arg0);
		var9.field623 = var6;
		var6 += var4;
		class39 var10 = new class39(arg0);
		var10.field623 = var6;
		var6 += var5;
		class39 var11 = new class39(arg0);
		var11.field623 = var6;
		class7 var12 = new class7(var11);
		int var13 = var7.method240();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method240();
			class8 var20 = field142[var19] = new class8();
			var20.field143 = var10.method238();
			var20.field144 = var12;
			int var21 = var7.method238();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method238();
				if (var25 > 0) {
					if (var12.field140[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field140[var26] == 0) {
								var14[var23] = var26;
								var15[var23] = 0;
								var16[var23] = 0;
								var17[var23] = 0;
								var23++;
								break;
							}
						}
					}

					var14[var23] = var24;
					short var27 = 0;
					if (var12.field140[var14[var23]] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method251();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method251();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method251();
					}

					var22 = var24;
					var23++;
				}
			}

			var20.field145 = var23;
			var20.field146 = new int[var23];
			var20.field147 = new int[var23];
			var20.field148 = new int[var23];
			var20.field149 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field146[var28] = var14[var28];
				var20.field147[var28] = var15[var28];
				var20.field148[var28] = var16[var28];
				var20.field149[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("h.a(B)V")
	public static void method60() {
		field142 = null;
	}

	@ObfuscatedName("h.a(II)Lh;")
	public static class8 method61(int arg0) {
		if (field142 == null) {
			return null;
		}

		return field142[arg0];
	}
}
