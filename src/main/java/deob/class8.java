package deob;

@ObfuscatedName("h")
public class class8 {

	@ObfuscatedName("h.b")
	public static class8[] field141;

	@ObfuscatedName("h.c")
	public int field142;

	@ObfuscatedName("h.d")
	public class7 field143;

	@ObfuscatedName("h.e")
	public int field144;

	@ObfuscatedName("h.f")
	public int[] field145;

	@ObfuscatedName("h.g")
	public int[] field146;

	@ObfuscatedName("h.h")
	public int[] field147;

	@ObfuscatedName("h.i")
	public int[] field148;

	@ObfuscatedName("h.j")
	public static boolean[] field149;

	@ObfuscatedName("h.a(I)V")
	public static void method58(int arg0) {
		field141 = new class8[arg0 + 1];
		field149 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field149[var1] = true;
		}
	}

	@ObfuscatedName("h.a([BI)V")
	public static void method59(byte[] arg0) {
		class39 var1 = new class39(arg0);
		var1.field624 = arg0.length - 8;
		int var2 = var1.method241();
		int var3 = var1.method241();
		int var4 = var1.method241();
		int var5 = var1.method241();
		int var6 = 0;
		class39 var7 = new class39(arg0);
		var7.field624 = var6;
		var6 += var2 + 2;
		class39 var8 = new class39(arg0);
		var8.field624 = var6;
		var6 += var3;
		class39 var9 = new class39(arg0);
		var9.field624 = var6;
		var6 += var4;
		class39 var10 = new class39(arg0);
		var10.field624 = var6;
		var6 += var5;
		class39 var11 = new class39(arg0);
		var11.field624 = var6;
		class7 var12 = new class7(var11);
		int var13 = var7.method241();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method241();
			class8 var20 = field141[var19] = new class8();
			var20.field142 = var10.method239();
			var20.field143 = var12;
			int var21 = var7.method239();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method239();
				if (var25 > 0) {
					if (var12.field139[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field139[var26] == 0) {
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
					if (var12.field139[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method252();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method252();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method252();
					}

					var22 = var24;
					var23++;

					if (var12.field139[var24] == 5) {
						field149[var19] = false;
					}
				}
			}

			var20.field144 = var23;
			var20.field145 = new int[var23];
			var20.field146 = new int[var23];
			var20.field147 = new int[var23];
			var20.field148 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field145[var28] = var14[var28];
				var20.field146[var28] = var15[var28];
				var20.field147[var28] = var16[var28];
				var20.field148[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("h.a(Z)V")
	public static void method60() {
		field141 = null;
	}

	@ObfuscatedName("h.a(ZI)Lh;")
	public static class8 method61(int arg0) {
		if (field141 == null) {
			return null;
		}

		return field141[arg0];
	}

	@ObfuscatedName("h.a(BI)Z")
	public static boolean method62(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
