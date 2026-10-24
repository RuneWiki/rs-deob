package deob;

@ObfuscatedName("z")
public final class class26 extends class24 {

	@ObfuscatedName("z.kb")
	public String field321;

	@ObfuscatedName("z.lb")
	public boolean field322 = false;

	@ObfuscatedName("z.mb")
	public int field323;

	@ObfuscatedName("z.nb")
	public int field324;

	@ObfuscatedName("z.ob")
	public int[] field325 = new int[12];

	@ObfuscatedName("z.pb")
	public int[] field326 = new int[5];

	@ObfuscatedName("z.qb")
	public int field327;

	@ObfuscatedName("z.rb")
	public long field328;

	@ObfuscatedName("z.sb")
	public int field329;

	@ObfuscatedName("z.tb")
	public int field330;

	@ObfuscatedName("z.ub")
	public int field331;

	@ObfuscatedName("z.vb")
	public int field332;

	@ObfuscatedName("z.wb")
	public int field333;

	@ObfuscatedName("z.xb")
	public int field334;

	@ObfuscatedName("z.yb")
	public class31 field335;

	@ObfuscatedName("z.zb")
	public int field336;

	@ObfuscatedName("z.Db")
	public boolean field340 = false;

	@ObfuscatedName("z.Eb")
	public static class19 field341 = new class19(200);

	@ObfuscatedName("z.Ab")
	public int field337;

	@ObfuscatedName("z.Bb")
	public int field338;

	@ObfuscatedName("z.Cb")
	public int field339;

	@ObfuscatedName("z.a(ILkb;)V")
	public final void method113(class37 arg0) {
		arg0.field540 = 0;
		field323 = arg0.method209();
		field324 = arg0.method209();

		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method209();
			if (var3 == 0) {
				field325[var2] = 0;
			} else {
				int var4 = arg0.method209();
				field325[var2] = (var3 << 8) + var4;
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method209();
			if (var6 < 0 || var6 >= client.field1073[var5].length) {
				var6 = 0;
			}

			field326[var5] = var6;
		}

		field273 = arg0.method211();
		if (field273 == 0xFFFF) {
			field273 = -1;
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

		field321 = class48.method255(class48.method252(arg0.method215()));
		field327 = arg0.method209();
		field322 = true;
		field328 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field328 <<= 4;
			if (field325[var7] >= 256) {
				field328 += field325[var7] - 256;
			}
		}

		if (field325[0] >= 256) {
			field328 += field325[0] - 256 >> 4;
		}

		if (field325[1] >= 256) {
			field328 += field325[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field328 <<= 3;
			field328 += field326[var8];
		}

		field328 <<= 1;
		field328 += field323;
	}

	@ObfuscatedName("z.a(Z)Leb;")
	public final class31 method108() {
		if (!field322) {
			return null;
		}

		class31 var1 = method114();
		field313 = var1.field425;
		var1.field434 = true;

		if (field340) {
			return var1;
		}

		if (field300 != -1 && field301 != -1) {
			class63 var2 = class63.field908[field300];
			class31 var3 = new class31(var2.method322(), !var2.field912, false, true);
			var3.method132(0, 0, -field304);
			var3.method126();
			var3.method127(var2.field911.field897[field301]);
			var3.field433 = null;
			var3.field432 = null;

			if (var2.field915 != 128 || var2.field916 != 128) {
				var3.method135(var2.field915, var2.field915, var2.field916);
			}

			var3.method136(var2.field918 + 64, var2.field919 + 850, -30, -50, -30, true);
			class31[] var4 = new class31[] { var1, var3 };
			var1 = new class31(var4, 2, true);
		}

		if (field335 != null) {
			if (client.field1209 >= field331) {
				field335 = null;
			}

			if (client.field1209 >= field330 && client.field1209 < field331) {
				class31 var5 = field335;
				var5.method132(field334 - field269, field332 - field268, field333 - field329);

				if (field314 == 512) {
					var5.method130();
					var5.method130();
					var5.method130();
				} else if (field314 == 1024) {
					var5.method130();
					var5.method130();
				} else if (field314 == 1536) {
					var5.method130();
				}

				class31[] var6 = new class31[] { var1, var5 };
				var1 = new class31(var6, 2, true);

				if (field314 == 512) {
					var5.method130();
				} else if (field314 == 1024) {
					var5.method130();
					var5.method130();
				} else if (field314 == 1536) {
					var5.method130();
					var5.method130();
					var5.method130();
				}

				var5.method132(field269 - field334, field268 - field332, field329 - field333);
			}
		}

		var1.field434 = true;
		return var1;
	}

	@ObfuscatedName("z.b(I)Leb;")
	public final class31 method114() {
		long var1 = field328;
		int var3 = -1;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		if (field295 >= 0 && field298 == 0) {
			class62 var7 = class62.field895[field295];
			var3 = var7.field897[field296];

			if (field292 >= 0 && field292 != field273) {
				var4 = class62.field895[field292].field897[field293];
			}

			if (var7.field904 >= 0) {
				var5 = var7.field904;
				var1 += var5 - field325[5] << 40;
			}

			if (var7.field905 >= 0) {
				var6 = var7.field905;
				var1 += var6 - field325[3] << 48;
			}
		} else if (field292 >= 0) {
			var3 = class62.field895[field292].field897[field293];
		}

		class31 var8 = (class31) field341.method102(var1);
		if (var8 == null) {
			class31[] var9 = new class31[12];
			int var10 = 0;
			for (int var11 = 0; var11 < 12; var11++) {
				int var12 = field325[var11];
				if (var6 >= 0 && var11 == 3) {
					var12 = var6;
				}

				if (var5 >= 0 && var11 == 5) {
					var12 = var5;
				}

				if (var12 >= 256 && var12 < 512) {
					var9[var10++] = class59.field822[var12 - 256].method312();
				}

				if (var12 >= 512) {
					class55 var13 = class55.method287(var12 - 512);
					class31 var14 = var13.method293(field323);
					if (var14 != null) {
						var9[var10++] = var14;
					}
				}
			}

			var8 = new class31(var9, var10);
			for (int var15 = 0; var15 < 5; var15++) {
				if (field326[var15] != 0) {
					var8.method133(client.field1073[var15][0], client.field1073[var15][field326[var15]]);

					if (var15 == 1) {
						var8.method133(client.field1019[0], client.field1019[field326[var15]]);
					}
				}
			}

			var8.method126();
			var8.method136(64, 850, -30, -50, -30, true);
			field341.method103(var8, var1);
		}

		if (field340) {
			return var8;
		}

		class31 var16 = new class31(var8, true);
		if (var3 != -1 && var4 != -1) {
			var16.method128(class62.field895[field295].field901, var4, var3);
		} else if (var3 != -1) {
			var16.method127(var3);
		}

		var16.method123();
		var16.field433 = null;
		var16.field432 = null;
		return var16;
	}

	@ObfuscatedName("z.c(I)Leb;")
	public final class31 method115() {
		if (!field322) {
			return null;
		}

		class31[] var1 = new class31[12];
		int var2 = 0;
		for (int var3 = 0; var3 < 12; var3++) {
			int var4 = field325[var3];
			if (var4 >= 256 && var4 < 512) {
				var1[var2++] = class59.field822[var4 - 256].method313();
			}

			if (var4 >= 512) {
				class31 var5 = class55.method287(var4 - 512).method294(field323);
				if (var5 != null) {
					var1[var2++] = var5;
				}
			}
		}

		class31 var6 = new class31(var1, var2);
		for (int var7 = 0; var7 < 5; var7++) {
			if (field326[var7] != 0) {
				var6.method133(client.field1073[var7][0], client.field1073[var7][field326[var7]]);

				if (var7 == 1) {
					var6.method133(client.field1019[0], client.field1019[field326[var7]]);
				}
			}
		}

		return var6;
	}

	@ObfuscatedName("z.a(I)Z")
	public final boolean method111() {
		if (!field322) {
			return false;
		}

		return true;
	}
}
