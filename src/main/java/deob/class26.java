package deob;

@ObfuscatedName("z")
public final class class26 extends class24 {

	@ObfuscatedName("z.mb")
	public String field323;

	@ObfuscatedName("z.nb")
	public boolean field324 = false;

	@ObfuscatedName("z.ob")
	public int field325;

	@ObfuscatedName("z.pb")
	public int field326;

	@ObfuscatedName("z.qb")
	public int[] field327 = new int[12];

	@ObfuscatedName("z.rb")
	public int[] field328 = new int[5];

	@ObfuscatedName("z.sb")
	public int field329;

	@ObfuscatedName("z.tb")
	public long field330;

	@ObfuscatedName("z.ub")
	public int field331;

	@ObfuscatedName("z.vb")
	public int field332;

	@ObfuscatedName("z.wb")
	public int field333;

	@ObfuscatedName("z.xb")
	public int field334;

	@ObfuscatedName("z.yb")
	public int field335;

	@ObfuscatedName("z.zb")
	public int field336;

	@ObfuscatedName("z.Fb")
	public boolean field342 = false;

	@ObfuscatedName("z.Gb")
	public static class19 field343 = new class19(200);

	@ObfuscatedName("z.Bb")
	public int field338;

	@ObfuscatedName("z.Cb")
	public int field339;

	@ObfuscatedName("z.Db")
	public int field340;

	@ObfuscatedName("z.Eb")
	public int field341;

	@ObfuscatedName("z.Ab")
	public class31 field337;

	@ObfuscatedName("z.a(Lkb;B)V")
	public final void method114(class37 arg0) {
		arg0.field543 = 0;
		field325 = arg0.method216();
		field326 = arg0.method216();

		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method216();
			if (var3 == 0) {
				field327[var2] = 0;
			} else {
				int var4 = arg0.method216();
				field327[var2] = (var3 << 8) + var4;
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method216();
			if (var6 < 0 || var6 >= client.field1047[var5].length) {
				var6 = 0;
			}

			field328[var5] = var6;
		}

		field275 = arg0.method218();
		if (field275 == 0xFFFF) {
			field275 = -1;
		}

		field276 = arg0.method218();
		if (field276 == 0xFFFF) {
			field276 = -1;
		}

		field277 = arg0.method218();
		if (field277 == 0xFFFF) {
			field277 = -1;
		}

		field278 = arg0.method218();
		if (field278 == 0xFFFF) {
			field278 = -1;
		}

		field279 = arg0.method218();
		if (field279 == 0xFFFF) {
			field279 = -1;
		}

		field280 = arg0.method218();
		if (field280 == 0xFFFF) {
			field280 = -1;
		}

		field281 = arg0.method218();
		if (field281 == 0xFFFF) {
			field281 = -1;
		}

		field323 = class48.method262(class48.method259(arg0.method222()));
		field329 = arg0.method216();
		field324 = true;
		field330 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field330 <<= 4;
			if (field327[var7] >= 256) {
				field330 += field327[var7] - 256;
			}
		}

		if (field327[0] >= 256) {
			field330 += field327[0] - 256 >> 4;
		}

		if (field327[1] >= 256) {
			field330 += field327[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field330 <<= 3;
			field330 += field328[var8];
		}

		field330 <<= 1;
		field330 += field325;
	}

	@ObfuscatedName("z.a(I)Leb;")
	public final class31 method109() {
		if (!field324) {
			return null;
		}

		class31 var1 = method115();
		field315 = var1.field427;
		var1.field436 = true;

		if (field342) {
			return var1;
		}

		if (field302 != -1 && field303 != -1) {
			class63 var2 = class63.field914[field302];
			class31 var3 = new class31(!var2.field919, true, var2.method330(), false);
			var3.method133(0, -field306, 0);
			var3.method127();
			var3.method128(var2.field918.field903[field303]);
			var3.field435 = null;
			var3.field434 = null;

			if (var2.field922 != 128 || var2.field923 != 128) {
				var3.method136(var2.field923, var2.field922, var2.field922);
			}

			var3.method137(var2.field925 + 64, var2.field926 + 850, -30, -50, -30, true);
			class31[] var4 = new class31[] { var1, var3 };
			var1 = new class31(true, var4, 2);
		}

		if (field337 != null) {
			if (client.field1202 >= field333) {
				field337 = null;
			}

			if (client.field1202 >= field332 && client.field1202 < field333) {
				class31 var5 = field337;
				var5.method133(field336 - field271, field335 - field331, field334 - field270);

				if (field316 == 512) {
					var5.method131();
					var5.method131();
					var5.method131();
				} else if (field316 == 1024) {
					var5.method131();
					var5.method131();
				} else if (field316 == 1536) {
					var5.method131();
				}

				class31[] var6 = new class31[] { var1, var5 };
				var1 = new class31(true, var6, 2);

				if (field316 == 512) {
					var5.method131();
				} else if (field316 == 1024) {
					var5.method131();
					var5.method131();
				} else if (field316 == 1536) {
					var5.method131();
					var5.method131();
					var5.method131();
				}

				var5.method133(field271 - field336, field331 - field335, field270 - field334);
			}
		}

		var1.field436 = true;
		return var1;
	}

	@ObfuscatedName("z.c(I)Leb;")
	public final class31 method115() {
		long var1 = field330;
		int var3 = -1;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		if (field297 >= 0 && field300 == 0) {
			class62 var7 = class62.field901[field297];
			var3 = var7.field903[field298];

			if (field294 >= 0 && field294 != field275) {
				var4 = class62.field901[field294].field903[field295];
			}

			if (var7.field910 >= 0) {
				var5 = var7.field910;
				var1 += var5 - field327[5] << 40;
			}

			if (var7.field911 >= 0) {
				var6 = var7.field911;
				var1 += var6 - field327[3] << 48;
			}
		} else if (field294 >= 0) {
			var3 = class62.field901[field294].field903[field295];
		}

		class31 var8 = (class31) field343.method103(var1);
		if (var8 == null) {
			class31[] var9 = new class31[12];
			int var10 = 0;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = field327[var11];
				if (var6 >= 0 && var11 == 3) {
					var12 = var6;
				}

				if (var5 >= 0 && var11 == 5) {
					var12 = var5;
				}

				if (var12 >= 256 && var12 < 512) {
					var9[var10++] = class59.field828[var12 - 256].method320();
				}

				if (var12 >= 512) {
					class55 var13 = class55.method294(var12 - 512);
					class31 var14 = var13.method300(field325);
					if (var14 != null) {
						var9[var10++] = var14;
					}
				}
			}

			var8 = new class31(var9, var10);
			for (int var15 = 0; var15 < 5; var15++) {
				if (field328[var15] != 0) {
					var8.method134(client.field1047[var15][0], client.field1047[var15][field328[var15]]);

					if (var15 == 1) {
						var8.method134(client.field1316[0], client.field1316[field328[var15]]);
					}
				}
			}

			var8.method127();
			var8.method137(64, 850, -30, -50, -30, true);
			field343.method104(var8, var1);
		}

		if (field342) {
			return var8;
		}

		class31 var16 = new class31(var8, true);
		if (var3 != -1 && var4 != -1) {
			var16.method129(var3, var4, class62.field901[field297].field907);
		} else if (var3 != -1) {
			var16.method128(var3);
		}

		var16.method124();
		var16.field435 = null;
		var16.field434 = null;
		return var16;
	}

	@ObfuscatedName("z.a(B)Leb;")
	public final class31 method116() {
		if (!field324) {
			return null;
		}

		class31[] var1 = new class31[12];
		int var2 = 0;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = field327[var3];
			if (var4 >= 256 && var4 < 512) {
				var1[var2++] = class59.field828[var4 - 256].method321();
			}

			if (var4 >= 512) {
				class31 var5 = class55.method294(var4 - 512).method301(field325);
				if (var5 != null) {
					var1[var2++] = var5;
				}
			}
		}

		class31 var6 = new class31(var1, var2);
		for (int var7 = 0; var7 < 5; var7++) {
			if (field328[var7] != 0) {
				var6.method134(client.field1047[var7][0], client.field1047[var7][field328[var7]]);

				if (var7 == 1) {
					var6.method134(client.field1316[0], client.field1316[field328[var7]]);
				}
			}
		}

		return var6;
	}

	@ObfuscatedName("z.b(I)Z")
	public final boolean method112() {
		if (!field324) {
			return false;
		}

		return true;
	}
}
