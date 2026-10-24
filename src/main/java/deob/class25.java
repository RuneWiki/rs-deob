package deob;

@ObfuscatedName("y")
public final class class25 extends class23 {

	@ObfuscatedName("y.ib")
	public String field307;

	@ObfuscatedName("y.jb")
	public boolean field308 = false;

	@ObfuscatedName("y.kb")
	public int field309;

	@ObfuscatedName("y.lb")
	public int field310;

	@ObfuscatedName("y.mb")
	public int[] field311 = new int[13];

	@ObfuscatedName("y.nb")
	public int[] field312 = new int[5];

	@ObfuscatedName("y.ob")
	public int field313;

	@ObfuscatedName("y.pb")
	public long field314;

	@ObfuscatedName("y.qb")
	public int field315;

	@ObfuscatedName("y.rb")
	public int field316;

	@ObfuscatedName("y.sb")
	public int field317;

	@ObfuscatedName("y.tb")
	public int field318;

	@ObfuscatedName("y.ub")
	public int field319;

	@ObfuscatedName("y.vb")
	public int field320;

	@ObfuscatedName("y.wb")
	public class30 field321;

	@ObfuscatedName("y.xb")
	public int field322;

	@ObfuscatedName("y.yb")
	public int field323;

	@ObfuscatedName("y.zb")
	public int field324;

	@ObfuscatedName("y.Bb")
	public boolean field326 = false;

	@ObfuscatedName("y.Cb")
	public static class18 field327 = new class18(200);

	@ObfuscatedName("y.Ab")
	public int field325;

	@ObfuscatedName("y.a(Ljb;I)V")
	public final void method95(class36 arg0) {
		arg0.field525 = 0;
		field309 = arg0.method185();
		field310 = arg0.method185();

		for (int var2 = 0; var2 < 13; var2++) {
			int var3 = arg0.method185();
			if (var3 == 0) {
				field311[var2] = 0;
			} else {
				int var4 = arg0.method185();
				field311[var2] = (var3 << 8) + var4;
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method185();
			if (var6 < 0 || var6 >= client.field1065[var5].length) {
				var6 = 0;
			}

			field312[var5] = var6;
		}

		field265 = arg0.method187();
		field266 = arg0.method187();
		field261 = arg0.method187();
		field262 = arg0.method187();
		field263 = arg0.method187();
		field264 = arg0.method187();
		field307 = class47.method230(class47.method227(arg0.method191()));
		field313 = arg0.method185();
		field308 = true;
		field314 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field314 <<= 4;
			if (field311[var7] >= 256) {
				field314 += field311[var7] - 256;
			}
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field314 <<= 3;
			field314 += field312[var8];
		}

		field314 <<= 1;
		field314 += field309;
	}

	@ObfuscatedName("y.a(I)Ldb;")
	public final class30 method90() {
		if (!field308) {
			return null;
		}

		class30 var1 = method96();
		field300 = var1.field411;

		if (field326) {
			return var1;
		}

		if (field287 != -1 && field288 != -1) {
			class59 var2 = class59.field836[field287];
			class30 var3 = new class30(true, !var2.field840, var2.method283(), true, false);
			var3.method114(0, 0, -field291);
			var3.method108();
			var3.method109(var2.field839.field825[field288]);
			var3.field419 = null;
			var3.field418 = null;
			var3.method118(64, 850, -30, -50, -30, true);
			class30[] var4 = new class30[] { var1, var3 };
			var1 = new class30(true, var4, 2);
		}

		if (field321 != null) {
			if (client.field877 >= field317) {
				field321 = null;
			}

			if (client.field877 >= field316 && client.field877 < field317) {
				class30 var5 = field321;
				var5.method114(field320 - field257, field318 - field256, field319 - field315);

				if (field301 == 512) {
					var5.method112();
					var5.method112();
					var5.method112();
				} else if (field301 == 1024) {
					var5.method112();
					var5.method112();
				} else if (field301 == 1536) {
					var5.method112();
				}

				class30[] var6 = new class30[] { var1, var5 };
				var1 = new class30(true, var6, 2);

				if (field301 == 512) {
					var5.method112();
				} else if (field301 == 1024) {
					var5.method112();
					var5.method112();
				} else if (field301 == 1536) {
					var5.method112();
					var5.method112();
					var5.method112();
				}

				var5.method114(field257 - field320, field256 - field318, field315 - field319);
			}
		}

		return var1;
	}

	@ObfuscatedName("y.b(I)Ldb;")
	public final class30 method96() {
		long var1 = field314;
		int var3 = -1;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		if (field282 >= 0 && field285 == 0) {
			class58 var7 = class58.field823[field282];
			var3 = var7.field825[field283];

			if (field279 >= 0 && field279 != field265) {
				var4 = class58.field823[field279].field825[field280];
			}

			if (var7.field832 >= 0) {
				var5 = var7.field832;
				var1 += var5 - field311[5] << 40;
			}

			if (var7.field833 >= 0) {
				var6 = var7.field833;
				var1 += var5 - field311[3] << 48;
			}
		} else if (field279 >= 0) {
			var3 = class58.field823[field279].field825[field280];
		}

		class30 var8 = (class30) field327.method84(var1);
		if (var8 == null) {
			class30[] var9 = new class30[13];
			int var10 = 0;
			for (int var11 = 0; var11 < 13; var11++) {
				int var12 = field311[var11];
				if (var6 >= 0 && var11 == 3) {
					var12 = var6;
				}

				if (var5 >= 0 && var11 == 5) {
					var12 = var5;
				}

				if (var12 >= 256 && var12 < 512) {
					var9[var10++] = class55.field754[var12 - 256].method273();
				}

				if (var12 >= 512) {
					class51 var13 = class51.method249(var12 - 512);
					class30 var14 = var13.method254(field309);
					if (var14 != null) {
						var9[var10++] = var14;
					}
				}
			}

			var8 = new class30(var10, var9);
			for (int var15 = 0; var15 < 5; var15++) {
				if (field312[var15] != 0) {
					var8.method115(client.field1065[var15][0], client.field1065[var15][field312[var15]]);

					if (var15 == 1) {
						var8.method115(client.field871[0], client.field871[field312[var15]]);
					}
				}
			}

			var8.method108();
			var8.method118(64, 850, -30, -50, -30, true);
			field327.method85(var8, var1);
		}

		if (field326) {
			return var8;
		}

		class30 var16 = new class30(true, var8);
		if (var3 != -1 && var4 != -1) {
			var16.method110(var3, var4, class58.field823[field282].field829);
		} else if (var3 != -1) {
			var16.method109(var3);
		}

		var16.method106();
		var16.field419 = null;
		var16.field418 = null;
		return var16;
	}

	@ObfuscatedName("y.c(I)Ldb;")
	public final class30 method97() {
		if (!field308) {
			return null;
		}

		class30[] var1 = new class30[13];
		int var2 = 0;
		for (int var3 = 0; var3 < 13; var3++) {
			int var4 = field311[var3];
			if (var4 >= 256 && var4 < 512) {
				var1[var2++] = class55.field754[var4 - 256].method274();
			}

			if (var4 >= 512) {
				class30 var5 = class51.method249(var4 - 512).method255(field309);
				if (var5 != null) {
					var1[var2++] = var5;
				}
			}
		}

		class30 var6 = new class30(var2, var1);
		for (int var7 = 0; var7 < 5; var7++) {
			if (field312[var7] != 0) {
				var6.method115(client.field1065[var7][0], client.field1065[var7][field312[var7]]);

				if (var7 == 1) {
					var6.method115(client.field871[0], client.field871[field312[var7]]);
				}
			}
		}

		return var6;
	}

	@ObfuscatedName("y.d(I)Z")
	public final boolean method98() {
		if (!field308) {
			return false;
		}

		return true;
	}
}
