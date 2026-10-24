package deob;

@ObfuscatedName("ab")
public final class class27 extends class25 {

	@ObfuscatedName("ab.sb")
	public String field416;

	@ObfuscatedName("ab.tb")
	public boolean field417 = false;

	@ObfuscatedName("ab.ub")
	public int field418;

	@ObfuscatedName("ab.vb")
	public int field419;

	@ObfuscatedName("ab.wb")
	public int[] field420 = new int[12];

	@ObfuscatedName("ab.xb")
	public int[] field421 = new int[5];

	@ObfuscatedName("ab.yb")
	public int field422;

	@ObfuscatedName("ab.zb")
	public long field423;

	@ObfuscatedName("ab.Lb")
	public boolean field435 = false;

	@ObfuscatedName("ab.Mb")
	public long field436 = -1L;

	@ObfuscatedName("ab.Ob")
	public static class19 field438 = new class19(260);

	@ObfuscatedName("ab.Ab")
	public int field424;

	@ObfuscatedName("ab.Bb")
	public int field425;

	@ObfuscatedName("ab.Cb")
	public int field426;

	@ObfuscatedName("ab.Db")
	public int field427;

	@ObfuscatedName("ab.Eb")
	public int field428;

	@ObfuscatedName("ab.Fb")
	public int field429;

	@ObfuscatedName("ab.Hb")
	public int field431;

	@ObfuscatedName("ab.Ib")
	public int field432;

	@ObfuscatedName("ab.Jb")
	public int field433;

	@ObfuscatedName("ab.Kb")
	public int field434;

	@ObfuscatedName("ab.Gb")
	public class31 field430;

	@ObfuscatedName("ab.Nb")
	public class60 field437;

	@ObfuscatedName("ab.a(Lmb;I)V")
	public final void method116(class39 arg0) {
		arg0.field625 = 0;
		field418 = arg0.method228();
		field419 = arg0.method228();
		field437 = null;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method228();
			if (var3 == 0) {
				field420[var2] = 0;
			} else {
				int var4 = arg0.method228();
				field420[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field420[0] == 0xFFFF) {
					field437 = class60.method339(arg0.method230());
					break;
				}
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method228();
			if (var6 < 0 || var6 >= client.field1063[var5].length) {
				var6 = 0;
			}

			field421[var5] = var6;
		}

		field365 = arg0.method230();
		if (field365 == 0xFFFF) {
			field365 = -1;
		}

		field366 = arg0.method230();
		if (field366 == 0xFFFF) {
			field366 = -1;
		}

		field367 = arg0.method230();
		if (field367 == 0xFFFF) {
			field367 = -1;
		}

		field368 = arg0.method230();
		if (field368 == 0xFFFF) {
			field368 = -1;
		}

		field369 = arg0.method230();
		if (field369 == 0xFFFF) {
			field369 = -1;
		}

		field370 = arg0.method230();
		if (field370 == 0xFFFF) {
			field370 = -1;
		}

		field371 = arg0.method230();
		if (field371 == 0xFFFF) {
			field371 = -1;
		}

		field416 = class52.method303(class52.method300(arg0.method234()));
		field422 = arg0.method228();
		field417 = true;
		field423 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field423 <<= 4;
			if (field420[var7] >= 256) {
				field423 += field420[var7] - 256;
			}
		}

		if (field420[0] >= 256) {
			field423 += field420[0] - 256 >> 4;
		}

		if (field420[1] >= 256) {
			field423 += field420[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field423 <<= 3;
			field423 += field421[var8];
		}

		field423 <<= 1;
		field423 += field418;
	}

	@ObfuscatedName("ab.a(I)Leb;")
	public final class31 method109() {
		if (!field417) {
			return null;
		}

		class31 var1 = method117();
		if (var1 == null) {
			return null;
		}

		field406 = var1.field359;
		var1.field514 = true;

		if (field435) {
			return var1;
		}

		if (field393 != -1 && field394 != -1) {
			class69 var2 = class69.field1010[field393];
			class31 var3 = var2.method383();
			if (var3 != null) {
				class31 var4 = new class31(false, var3, true, class7.method48(field394));
				var4.method138(-field397, 0, 0);
				var4.method132();
				var4.method133(var2.field1014.field993[field394]);
				var4.field513 = null;
				var4.field512 = null;

				if (var2.field1017 != 128 || var2.field1018 != 128) {
					var4.method141(var2.field1017, var2.field1017, var2.field1018);
				}

				var4.method142(var2.field1020 + 64, var2.field1021 + 850, -30, -50, -30, true);
				class31[] var5 = new class31[] { var1, var4 };
				var1 = new class31(2, true, var5);
			}
		}

		if (field430 != null) {
			if (client.field1058 >= field426) {
				field430 = null;
			}

			if (client.field1058 >= field425 && client.field1058 < field426) {
				class31 var6 = field430;
				var6.method138(field428 - field424, field427 - field360, field429 - field361);

				if (field407 == 512) {
					var6.method136();
					var6.method136();
					var6.method136();
				} else if (field407 == 1024) {
					var6.method136();
					var6.method136();
				} else if (field407 == 1536) {
					var6.method136();
				}

				class31[] var7 = new class31[] { var1, var6 };
				var1 = new class31(2, true, var7);

				if (field407 == 512) {
					var6.method136();
				} else if (field407 == 1024) {
					var6.method136();
					var6.method136();
				} else if (field407 == 1536) {
					var6.method136();
					var6.method136();
					var6.method136();
				}

				var6.method138(field424 - field428, field360 - field427, field361 - field429);
			}
		}

		var1.field514 = true;
		return var1;
	}

	@ObfuscatedName("ab.b(Z)Leb;")
	public final class31 method117() {
		if (field437 != null) {
			int var1 = -1;
			if (field388 >= 0 && field391 == 0) {
				var1 = class67.field991[field388].field993[field389];
			} else if (field385 >= 0) {
				var1 = class67.field991[field385].field993[field386];
			}

			return field437.method341(-1, var1, null);
		}

		long var3 = field423;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field388 >= 0 && field391 == 0) {
			class67 var9 = class67.field991[field388];
			var5 = var9.field993[field389];

			if (field385 >= 0 && field385 != field365) {
				var6 = class67.field991[field385].field993[field386];
			}

			if (var9.field1000 >= 0) {
				var7 = var9.field1000;
				var3 += var7 - field420[5] << 40;
			}

			if (var9.field1001 >= 0) {
				var8 = var9.field1001;
				var3 += var8 - field420[3] << 48;
			}
		} else if (field385 >= 0) {
			var5 = class67.field991[field385].field993[field386];
		}

		class31 var10 = (class31) field438.method101(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field420[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !class65.field971[var13 - 256].method374()) {
					var11 = true;
				}

				if (var13 >= 512 && !class61.method345(var13 - 512).method352(field418)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field436 != -1L) {
					var10 = (class31) field438.method101(field436);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			class31[] var14 = new class31[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field420[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					class31 var18 = class65.field971[var17 - 256].method375();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					class31 var19 = class61.method345(var17 - 512).method353(field418);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new class31(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field421[var20] != 0) {
					var10.method139(client.field1063[var20][0], client.field1063[var20][field421[var20]]);

					if (var20 == 1) {
						var10.method139(client.field1281[0], client.field1281[field421[var20]]);
					}
				}
			}

			var10.method132();
			var10.method142(64, 850, -30, -50, -30, true);
			field438.method102(var10, var3);
			field436 = var3;
		}

		if (field435) {
			return var10;
		}

		class31 var21 = class31.field476;
		var21.method127(var10, class7.method48(var5) & class7.method48(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method134(var5, class67.field991[field388].field997, var6);
		} else if (var5 != -1) {
			var21.method133(var5);
		}

		var21.method129();
		var21.field513 = null;
		var21.field512 = null;
		return var21;
	}

	@ObfuscatedName("ab.a(B)Leb;")
	public final class31 method118() {
		if (!field417) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = field420[var2];
			if (var3 >= 256 && var3 < 512 && !class65.field971[var3 - 256].method376()) {
				var1 = true;
			}

			if (var3 >= 512 && !class61.method345(var3 - 512).method354(field418)) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class31[] var4 = new class31[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = field420[var6];
			if (var7 >= 256 && var7 < 512) {
				class31 var8 = class65.field971[var7 - 256].method377();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}

			if (var7 >= 512) {
				class31 var9 = class61.method345(var7 - 512).method355(field418);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}

		class31 var10 = new class31(var4, var5);
		for (int var11 = 0; var11 < 5; var11++) {
			if (field421[var11] != 0) {
				var10.method139(client.field1063[var11][0], client.field1063[var11][field421[var11]]);

				if (var11 == 1) {
					var10.method139(client.field1281[0], client.field1281[field421[var11]]);
				}
			}
		}

		return var10;
	}

	@ObfuscatedName("ab.a(Z)Z")
	public final boolean method113() {
		if (!field417) {
			return false;
		}

		return true;
	}
}
