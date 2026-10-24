package deob;

@ObfuscatedName("z")
public final class class26 extends class24 {

	@ObfuscatedName("z.hb")
	public String field318;

	@ObfuscatedName("z.ib")
	public boolean field319 = false;

	@ObfuscatedName("z.jb")
	public int field320;

	@ObfuscatedName("z.kb")
	public int field321;

	@ObfuscatedName("z.lb")
	public int[] field322 = new int[13];

	@ObfuscatedName("z.mb")
	public int[] field323 = new int[5];

	@ObfuscatedName("z.nb")
	public int field324;

	@ObfuscatedName("z.ob")
	public long field325;

	@ObfuscatedName("z.pb")
	public int field326;

	@ObfuscatedName("z.qb")
	public int field327;

	@ObfuscatedName("z.rb")
	public int field328;

	@ObfuscatedName("z.sb")
	public int field329;

	@ObfuscatedName("z.tb")
	public int field330;

	@ObfuscatedName("z.ub")
	public int field331;

	@ObfuscatedName("z.vb")
	public class31 field332;

	@ObfuscatedName("z.wb")
	public int field333;

	@ObfuscatedName("z.xb")
	public int field334;

	@ObfuscatedName("z.yb")
	public int field335;

	@ObfuscatedName("z.zb")
	public int field336;

	@ObfuscatedName("z.Ab")
	public boolean field337 = false;

	@ObfuscatedName("z.Bb")
	public static class19 field338 = new class19(200);

	@ObfuscatedName("z.a(Lkb;Z)V")
	public final void method110(class37 arg0) {
		arg0.field537 = 0;
		field320 = arg0.method201();
		field321 = arg0.method201();

		for (int var2 = 0; var2 < 13; var2++) {
			int var3 = arg0.method201();
			if (var3 == 0) {
				field322[var2] = 0;
			} else {
				int var4 = arg0.method201();
				field322[var2] = (var3 << 8) + var4;
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method201();
			if (var6 < 0 || var6 >= client.field1153[var5].length) {
				var6 = 0;
			}

			field323[var5] = var6;
		}

		field270 = arg0.method203();
		if (field270 == 0xFFFF) {
			field270 = -1;
		}

		field271 = arg0.method203();
		if (field271 == 0xFFFF) {
			field271 = -1;
		}

		field272 = arg0.method203();
		if (field272 == 0xFFFF) {
			field272 = -1;
		}

		field273 = arg0.method203();
		if (field273 == 0xFFFF) {
			field273 = -1;
		}

		field274 = arg0.method203();
		if (field274 == 0xFFFF) {
			field274 = -1;
		}

		field275 = arg0.method203();
		if (field275 == 0xFFFF) {
			field275 = -1;
		}

		field276 = arg0.method203();
		if (field276 == 0xFFFF) {
			field276 = -1;
		}

		field318 = class48.method246(class48.method244(arg0.method207()));
		field324 = arg0.method201();
		field319 = true;
		field325 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field325 <<= 4;
			if (field322[var7] >= 256) {
				field325 += field322[var7] - 256;
			}
		}

		if (field322[0] >= 256) {
			field325 += field322[0] - 256 >> 4;
		}

		if (field322[1] >= 256) {
			field325 += field322[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field325 <<= 3;
			field325 += field323[var8];
		}

		field325 <<= 1;
		field325 += field320;
	}

	@ObfuscatedName("z.a(I)Leb;")
	public final class31 method105() {
		if (!field319) {
			return null;
		}

		class31 var1 = method111();
		field310 = var1.field422;
		var1.field431 = true;

		if (field337) {
			return var1;
		}

		if (field297 != -1 && field298 != -1) {
			class60 var2 = class60.field856[field297];
			class31 var3 = new class31(true, var2.method299(), true, false, !var2.field860);
			var3.method128(0, 0, -field301);
			var3.method122();
			var3.method123(var2.field859.field845[field298]);
			var3.field430 = null;
			var3.field429 = null;
			var3.method132(64, 850, -30, -50, -30, true);
			class31[] var4 = new class31[] { var1, var3 };
			var1 = new class31(true, var4, 2);
		}

		if (field332 != null) {
			if (client.field994 >= field328) {
				field332 = null;
			}

			if (client.field994 >= field327 && client.field994 < field328) {
				class31 var5 = field332;
				var5.method128(field331 - field266, field329 - field265, field330 - field326);

				if (field311 == 512) {
					var5.method126();
					var5.method126();
					var5.method126();
				} else if (field311 == 1024) {
					var5.method126();
					var5.method126();
				} else if (field311 == 1536) {
					var5.method126();
				}

				class31[] var6 = new class31[] { var1, var5 };
				var1 = new class31(true, var6, 2);

				if (field311 == 512) {
					var5.method126();
				} else if (field311 == 1024) {
					var5.method126();
					var5.method126();
				} else if (field311 == 1536) {
					var5.method126();
					var5.method126();
					var5.method126();
				}

				var5.method128(field266 - field331, field265 - field329, field326 - field330);
			}
		}

		var1.field431 = true;
		return var1;
	}

	@ObfuscatedName("z.c(I)Leb;")
	public final class31 method111() {
		long var1 = field325;
		int var3 = -1;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		if (field292 >= 0 && field295 == 0) {
			class59 var7 = class59.field843[field292];
			var3 = var7.field845[field293];

			if (field289 >= 0 && field289 != field270) {
				var4 = class59.field843[field289].field845[field290];
			}

			if (var7.field852 >= 0) {
				var5 = var7.field852;
				var1 += var5 - field322[5] << 40;
			}

			if (var7.field853 >= 0) {
				var6 = var7.field853;
				var1 += var6 - field322[3] << 48;
			}
		} else if (field289 >= 0) {
			var3 = class59.field843[field289].field845[field290];
		}

		class31 var8 = (class31) field338.method99(var1);
		if (var8 == null) {
			class31[] var9 = new class31[13];
			int var10 = 0;
			for (int var11 = 0; var11 < 13; var11++) {
				int var12 = field322[var11];
				if (var6 >= 0 && var11 == 3) {
					var12 = var6;
				}

				if (var5 >= 0 && var11 == 5) {
					var12 = var5;
				}

				if (var12 >= 256 && var12 < 512) {
					var9[var10++] = class56.field771[var12 - 256].method289();
				}

				if (var12 >= 512) {
					class52 var13 = class52.method265(var12 - 512);
					class31 var14 = var13.method270(field320);
					if (var14 != null) {
						var9[var10++] = var14;
					}
				}
			}

			var8 = new class31(var10, var9);
			for (int var15 = 0; var15 < 5; var15++) {
				if (field323[var15] != 0) {
					var8.method129(client.field1153[var15][0], client.field1153[var15][field323[var15]]);

					if (var15 == 1) {
						var8.method129(client.field907[0], client.field907[field323[var15]]);
					}
				}
			}

			var8.method122();
			var8.method132(64, 850, -30, -50, -30, true);
			field338.method100(var1, var8);
		}

		if (field337) {
			return var8;
		}

		class31 var16 = new class31(true, var8);
		if (var3 != -1 && var4 != -1) {
			var16.method124(var3, class59.field843[field292].field849, var4);
		} else if (var3 != -1) {
			var16.method123(var3);
		}

		var16.method120();
		var16.field430 = null;
		var16.field429 = null;
		return var16;
	}

	@ObfuscatedName("z.a(Z)Leb;")
	public final class31 method112() {
		if (!field319) {
			return null;
		}

		class31[] var1 = new class31[13];
		int var2 = 0;
		for (int var3 = 0; var3 < 13; var3++) {
			int var4 = field322[var3];
			if (var4 >= 256 && var4 < 512) {
				var1[var2++] = class56.field771[var4 - 256].method290();
			}

			if (var4 >= 512) {
				class31 var5 = class52.method265(var4 - 512).method271(field320);
				if (var5 != null) {
					var1[var2++] = var5;
				}
			}
		}

		class31 var6 = new class31(var2, var1);
		for (int var7 = 0; var7 < 5; var7++) {
			if (field323[var7] != 0) {
				var6.method129(client.field1153[var7][0], client.field1153[var7][field323[var7]]);

				if (var7 == 1) {
					var6.method129(client.field907[0], client.field907[field323[var7]]);
				}
			}
		}

		return var6;
	}

	@ObfuscatedName("z.b(I)Z")
	public final boolean method108() {
		if (!field319) {
			return false;
		}

		return true;
	}
}
