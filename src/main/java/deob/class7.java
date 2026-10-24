package deob;

@ObfuscatedName("g")
public class class7 {

	@ObfuscatedName("g.b")
	public static class7[] field133;

	@ObfuscatedName("g.c")
	public int field134;

	@ObfuscatedName("g.d")
	public class6 field135;

	@ObfuscatedName("g.e")
	public int field136;

	@ObfuscatedName("g.f")
	public int[] field137;

	@ObfuscatedName("g.g")
	public int[] field138;

	@ObfuscatedName("g.h")
	public int[] field139;

	@ObfuscatedName("g.i")
	public int[] field140;

	@ObfuscatedName("g.j")
	public static boolean[] field141;

	@ObfuscatedName("g.a(I)V")
	public static void method44(int arg0) {
		field133 = new class7[arg0 + 1];
		field141 = new boolean[arg0 + 1];
		for (int var1 = 0; var1 < arg0 + 1; var1++) {
			field141[var1] = true;
		}
	}

	@ObfuscatedName("g.a(I[B)V")
	public static void method45(byte[] arg0) {
		class39 var1 = new class39(arg0);
		var1.field625 = arg0.length - 8;
		int var2 = var1.method230();
		int var3 = var1.method230();
		int var4 = var1.method230();
		int var5 = var1.method230();
		int var6 = 0;
		class39 var7 = new class39(arg0);
		var7.field625 = var6;
		var6 += var2 + 2;
		class39 var8 = new class39(arg0);
		var8.field625 = var6;
		var6 += var3;
		class39 var9 = new class39(arg0);
		var9.field625 = var6;
		var6 += var4;
		class39 var10 = new class39(arg0);
		var10.field625 = var6;
		var6 += var5;
		class39 var11 = new class39(arg0);
		var11.field625 = var6;
		class6 var12 = new class6(var11);
		int var13 = var7.method230();
		int[] var14 = new int[500];
		int[] var15 = new int[500];
		int[] var16 = new int[500];
		int[] var17 = new int[500];
		for (int var18 = 0; var18 < var13; var18++) {
			int var19 = var7.method230();
			class7 var20 = field133[var19] = new class7();
			var20.field134 = var10.method228();
			var20.field135 = var12;
			int var21 = var7.method228();
			int var22 = -1;
			int var23 = 0;
			for (int var24 = 0; var24 < var21; var24++) {
				int var25 = var8.method228();
				if (var25 > 0) {
					if (var12.field131[var24] != 0) {
						for (int var26 = var24 - 1; var26 > var22; var26--) {
							if (var12.field131[var26] == 0) {
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
					if (var12.field131[var24] == 3) {
						var27 = 128;
					}

					if ((var25 & 0x1) == 0) {
						var15[var23] = var27;
					} else {
						var15[var23] = var9.method241();
					}

					if ((var25 & 0x2) == 0) {
						var16[var23] = var27;
					} else {
						var16[var23] = var9.method241();
					}

					if ((var25 & 0x4) == 0) {
						var17[var23] = var27;
					} else {
						var17[var23] = var9.method241();
					}

					var22 = var24;
					var23++;

					if (var12.field131[var24] == 5) {
						field141[var19] = false;
					}
				}
			}

			var20.field136 = var23;
			var20.field137 = new int[var23];
			var20.field138 = new int[var23];
			var20.field139 = new int[var23];
			var20.field140 = new int[var23];
			for (int var28 = 0; var28 < var23; var28++) {
				var20.field137[var28] = var14[var28];
				var20.field138[var28] = var15[var28];
				var20.field139[var28] = var16[var28];
				var20.field140[var28] = var17[var28];
			}
		}
	}

	@ObfuscatedName("g.b(I)V")
	public static void method46() {
		field133 = null;
	}

	@ObfuscatedName("g.a(II)Lg;")
	public static class7 method47(int arg0) {
		if (field133 == null) {
			return null;
		}

		return field133[arg0];
	}

	@ObfuscatedName("g.b(II)Z")
	public static boolean method48(int arg0) {
		if (arg0 == -1) {
			return true;
		}

		return false;
	}
}
