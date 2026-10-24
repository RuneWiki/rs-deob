package deob;

@ObfuscatedName("z")
public final class class26 extends class24 {

	@ObfuscatedName("z.hb")
	public String field322;

	@ObfuscatedName("z.ib")
	public boolean field323 = false;

	@ObfuscatedName("z.jb")
	public int field324;

	@ObfuscatedName("z.kb")
	public int field325;

	@ObfuscatedName("z.lb")
	public int[] field326 = new int[12];

	@ObfuscatedName("z.mb")
	public int[] field327 = new int[5];

	@ObfuscatedName("z.nb")
	public int field328;

	@ObfuscatedName("z.ob")
	public long field329;

	@ObfuscatedName("z.pb")
	public int field330;

	@ObfuscatedName("z.qb")
	public int field331;

	@ObfuscatedName("z.rb")
	public int field332;

	@ObfuscatedName("z.sb")
	public int field333;

	@ObfuscatedName("z.tb")
	public int field334;

	@ObfuscatedName("z.ub")
	public int field335;

	@ObfuscatedName("z.vb")
	public class31 field336;

	@ObfuscatedName("z.wb")
	public int field337;

	@ObfuscatedName("z.xb")
	public int field338;

	@ObfuscatedName("z.yb")
	public int field339;

	@ObfuscatedName("z.zb")
	public int field340;

	@ObfuscatedName("z.Ab")
	public boolean field341 = false;

	@ObfuscatedName("z.Bb")
	public static class19 field342 = new class19(200);

	@ObfuscatedName("z.a(BLkb;)V")
	public final void method113(class37 arg0) {
		arg0.field542 = 0;
		field324 = arg0.method209();
		field325 = arg0.method209();

		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method209();
			if (var3 == 0) {
				field326[var2] = 0;
			} else {
				int var4 = arg0.method209();
				field326[var2] = (var3 << 8) + var4;
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method209();
			if (var6 < 0 || var6 >= client.field1329[var5].length) {
				var6 = 0;
			}

			field327[var5] = var6;
		}

		field274 = arg0.method211();
		if (field274 == 0xFFFF) {
			field274 = -1;
		}

		field275 = arg0.method211();
		if (field275 == 0xFFFF) {
			field275 = -1;
		}

		field276 = arg0.method211();
		if (field276 == 0xFFFF) {
			field276 = -1;
		}

		field277 = arg0.method211();
		if (field277 == 0xFFFF) {
			field277 = -1;
		}

		field278 = arg0.method211();
		if (field278 == 0xFFFF) {
			field278 = -1;
		}

		field279 = arg0.method211();
		if (field279 == 0xFFFF) {
			field279 = -1;
		}

		field280 = arg0.method211();
		if (field280 == 0xFFFF) {
			field280 = -1;
		}

		field322 = class48.method255(class48.method252(arg0.method215()));
		field328 = arg0.method209();
		field323 = true;
		field329 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field329 <<= 4;
			if (field326[var7] >= 256) {
				field329 += field326[var7] - 256;
			}
		}

		if (field326[0] >= 256) {
			field329 += field326[0] - 256 >> 4;
		}

		if (field326[1] >= 256) {
			field329 += field326[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field329 <<= 3;
			field329 += field327[var8];
		}

		field329 <<= 1;
		field329 += field324;
	}

	@ObfuscatedName("z.a(I)Leb;")
	public final class31 method108() {
		if (!field323) {
			return null;
		}

		class31 var1 = method114();
		field314 = var1.field427;
		var1.field436 = true;

		if (field341) {
			return var1;
		}

		if (field301 != -1 && field302 != -1) {
			class63 var2 = class63.field914[field301];
			class31 var3 = new class31(!var2.field918, false, var2.method322(), true);
			var3.method132(0, -field305, 0);
			var3.method126();
			var3.method127(var2.field917.field903[field302]);
			var3.field435 = null;
			var3.field434 = null;

			if (var2.field921 != 128 || var2.field922 != 128) {
				var3.method135(var2.field921, var2.field921, var2.field922);
			}

			var3.method136(var2.field924 + 64, var2.field925 + 850, -30, -50, -30, true);
			class31[] var4 = new class31[] { var1, var3 };
			var1 = new class31(2, true, var4);
		}

		if (field336 != null) {
			if (client.field1147 >= field332) {
				field336 = null;
			}

			if (client.field1147 >= field331 && client.field1147 < field332) {
				class31 var5 = field336;
				var5.method132(field333 - field269, field334 - field330, field335 - field270);

				if (field315 == 512) {
					var5.method130();
					var5.method130();
					var5.method130();
				} else if (field315 == 1024) {
					var5.method130();
					var5.method130();
				} else if (field315 == 1536) {
					var5.method130();
				}

				class31[] var6 = new class31[] { var1, var5 };
				var1 = new class31(2, true, var6);

				if (field315 == 512) {
					var5.method130();
				} else if (field315 == 1024) {
					var5.method130();
					var5.method130();
				} else if (field315 == 1536) {
					var5.method130();
					var5.method130();
					var5.method130();
				}

				var5.method132(field269 - field333, field330 - field334, field270 - field335);
			}
		}

		var1.field436 = true;
		return var1;
	}

	@ObfuscatedName("z.b(Z)Leb;")
	public final class31 method114() {
		long var1 = field329;
		int var3 = -1;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		if (field296 >= 0 && field299 == 0) {
			class62 var7 = class62.field901[field296];
			var3 = var7.field903[field297];

			if (field293 >= 0 && field293 != field274) {
				var4 = class62.field901[field293].field903[field294];
			}

			if (var7.field910 >= 0) {
				var5 = var7.field910;
				var1 += var5 - field326[5] << 40;
			}

			if (var7.field911 >= 0) {
				var6 = var7.field911;
				var1 += var6 - field326[3] << 48;
			}
		} else if (field293 >= 0) {
			var3 = class62.field901[field293].field903[field294];
		}

		class31 var8 = (class31) field342.method102(var1);
		if (var8 == null) {
			class31[] var9 = new class31[12];
			int var10 = 0;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = field326[var11];
				if (var6 >= 0 && var11 == 3) {
					var12 = var6;
				}

				if (var5 >= 0 && var11 == 5) {
					var12 = var5;
				}

				if (var12 >= 256 && var12 < 512) {
					var9[var10++] = class59.field828[var12 - 256].method312();
				}

				if (var12 >= 512) {
					class55 var13 = class55.method287(var12 - 512);
					class31 var14 = var13.method293(field324);
					if (var14 != null) {
						var9[var10++] = var14;
					}
				}
			}

			var8 = new class31(6, var10, var9);
			for (int var15 = 0; var15 < 5; var15++) {
				if (field327[var15] != 0) {
					var8.method133(client.field1329[var15][0], client.field1329[var15][field327[var15]]);

					if (var15 == 1) {
						var8.method133(client.field1077[0], client.field1077[field327[var15]]);
					}
				}
			}

			var8.method126();
			var8.method136(64, 850, -30, -50, -30, true);
			field342.method103(var1, var8);
		}

		if (field341) {
			return var8;
		}

		class31 var16 = new class31(6, true, var8);
		if (var3 != -1 && var4 != -1) {
			var16.method128(class62.field901[field296].field907, var4, var3);
		} else if (var3 != -1) {
			var16.method127(var3);
		}

		var16.method123();
		var16.field435 = null;
		var16.field434 = null;
		return var16;
	}

	@ObfuscatedName("z.b(I)Leb;")
	public final class31 method115() {
		if (!field323) {
			return null;
		}

		class31[] var1 = new class31[12];
		int var2 = 0;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = field326[var3];
			if (var4 >= 256 && var4 < 512) {
				var1[var2++] = class59.field828[var4 - 256].method313();
			}

			if (var4 >= 512) {
				class31 var5 = class55.method287(var4 - 512).method294(field324);
				if (var5 != null) {
					var1[var2++] = var5;
				}
			}
		}

		class31 var6 = new class31(6, var2, var1);
		for (int var7 = 0; var7 < 5; var7++) {
			if (field327[var7] != 0) {
				var6.method133(client.field1329[var7][0], client.field1329[var7][field327[var7]]);

				if (var7 == 1) {
					var6.method133(client.field1077[0], client.field1077[field327[var7]]);
				}
			}
		}

		return var6;
	}

	@ObfuscatedName("z.a(Z)Z")
	public final boolean method111() {
		if (!field323) {
			return false;
		}

		return true;
	}
}
