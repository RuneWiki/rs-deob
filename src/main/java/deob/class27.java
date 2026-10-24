package deob;

@ObfuscatedName("ab")
public final class class27 extends class25 {

	@ObfuscatedName("ab.vb")
	public String field416;

	@ObfuscatedName("ab.wb")
	public boolean field417 = false;

	@ObfuscatedName("ab.xb")
	public int field418;

	@ObfuscatedName("ab.yb")
	public int field419;

	@ObfuscatedName("ab.zb")
	public int[] field420 = new int[12];

	@ObfuscatedName("ab.Ab")
	public int[] field421 = new int[5];

	@ObfuscatedName("ab.Pb")
	public boolean field436 = false;

	@ObfuscatedName("ab.Qb")
	public long field437 = -1L;

	@ObfuscatedName("ab.Sb")
	public static class19 field439 = new class19(260);

	@ObfuscatedName("ab.Bb")
	public int field422;

	@ObfuscatedName("ab.Cb")
	public int field423;

	@ObfuscatedName("ab.Eb")
	public int field425;

	@ObfuscatedName("ab.Fb")
	public int field426;

	@ObfuscatedName("ab.Gb")
	public int field427;

	@ObfuscatedName("ab.Hb")
	public int field428;

	@ObfuscatedName("ab.Ib")
	public int field429;

	@ObfuscatedName("ab.Jb")
	public int field430;

	@ObfuscatedName("ab.Lb")
	public int field432;

	@ObfuscatedName("ab.Mb")
	public int field433;

	@ObfuscatedName("ab.Nb")
	public int field434;

	@ObfuscatedName("ab.Ob")
	public int field435;

	@ObfuscatedName("ab.Db")
	public long field424;

	@ObfuscatedName("ab.Kb")
	public class31 field431;

	@ObfuscatedName("ab.Rb")
	public class59 field438;

	@ObfuscatedName("ab.a(BLlb;)V")
	public final void method116(class38 arg0) {
		arg0.field616 = 0;
		field418 = arg0.method224();
		field419 = arg0.method224();
		field438 = null;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method224();
			if (var3 == 0) {
				field420[var2] = 0;
			} else {
				int var4 = arg0.method224();
				field420[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field420[0] == 0xFFFF) {
					field438 = class59.method335(arg0.method226());
					break;
				}
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method224();
			if (var6 < 0 || var6 >= client.field1342[var5].length) {
				var6 = 0;
			}

			field421[var5] = var6;
		}

		field365 = arg0.method226();
		if (field365 == 0xFFFF) {
			field365 = -1;
		}

		field366 = arg0.method226();
		if (field366 == 0xFFFF) {
			field366 = -1;
		}

		field367 = arg0.method226();
		if (field367 == 0xFFFF) {
			field367 = -1;
		}

		field368 = arg0.method226();
		if (field368 == 0xFFFF) {
			field368 = -1;
		}

		field369 = arg0.method226();
		if (field369 == 0xFFFF) {
			field369 = -1;
		}

		field370 = arg0.method226();
		if (field370 == 0xFFFF) {
			field370 = -1;
		}

		field371 = arg0.method226();
		if (field371 == 0xFFFF) {
			field371 = -1;
		}

		field416 = class51.method299(class51.method296(arg0.method230()));
		field422 = arg0.method224();
		field423 = arg0.method226();
		field417 = true;
		field424 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field424 <<= 4;
			if (field420[var7] >= 256) {
				field424 += field420[var7] - 256;
			}
		}

		if (field420[0] >= 256) {
			field424 += field420[0] - 256 >> 4;
		}

		if (field420[1] >= 256) {
			field424 += field420[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field424 <<= 3;
			field424 += field421[var8];
		}

		field424 <<= 1;
		field424 += field418;
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
		var1.field515 = true;

		if (field436) {
			return var1;
		}

		if (field393 != -1 && field394 != -1) {
			class68 var2 = class68.field1001[field393];
			class31 var3 = var2.method379();
			if (var3 != null) {
				class31 var4 = new class31(false, true, var3, class7.method48(field394));
				var4.method138(0, -field397, 0);
				var4.method132();
				var4.method133(var2.field1005.field984[field394]);
				var4.field514 = null;
				var4.field513 = null;

				if (var2.field1008 != 128 || var2.field1009 != 128) {
					var4.method141(var2.field1008, var2.field1009, var2.field1008);
				}

				var4.method142(var2.field1011 + 64, var2.field1012 + 850, -30, -50, -30, true);
				class31[] var5 = new class31[] { var1, var4 };
				var1 = new class31(true, var5, 2);
			}
		}

		if (field431 != null) {
			if (client.field1410 >= field427) {
				field431 = null;
			}

			if (client.field1410 >= field426 && client.field1410 < field427) {
				class31 var6 = field431;
				var6.method138(field428 - field360, field429 - field425, field430 - field361);

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
				var1 = new class31(true, var7, 2);

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

				var6.method138(field360 - field428, field425 - field429, field361 - field430);
			}
		}

		var1.field515 = true;
		return var1;
	}

	@ObfuscatedName("ab.a(B)Leb;")
	public final class31 method117() {
		if (field438 != null) {
			int var1 = -1;
			if (field388 >= 0 && field391 == 0) {
				var1 = class66.field982[field388].field984[field389];
			} else if (field385 >= 0) {
				var1 = class66.field982[field385].field984[field386];
			}

			return field438.method337(var1, null, -1);
		}

		long var3 = field424;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field388 >= 0 && field391 == 0) {
			class66 var9 = class66.field982[field388];
			var5 = var9.field984[field389];

			if (field385 >= 0 && field385 != field365) {
				var6 = class66.field982[field385].field984[field386];
			}

			if (var9.field991 >= 0) {
				var7 = var9.field991;
				var3 += var7 - field420[5] << 40;
			}

			if (var9.field992 >= 0) {
				var8 = var9.field992;
				var3 += var8 - field420[3] << 48;
			}
		} else if (field385 >= 0) {
			var5 = class66.field982[field385].field984[field386];
		}

		class31 var10 = (class31) field439.method101(var3);
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

				if (var13 >= 256 && var13 < 512 && !class64.field962[var13 - 256].method370()) {
					var11 = true;
				}

				if (var13 >= 512 && !class60.method341(var13 - 512).method348(field418)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field437 != -1L) {
					var10 = (class31) field439.method101(field437);
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
					class31 var18 = class64.field962[var17 - 256].method371();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					class31 var19 = class60.method341(var17 - 512).method349(field418);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new class31(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field421[var20] != 0) {
					var10.method139(client.field1342[var20][0], client.field1342[var20][field421[var20]]);

					if (var20 == 1) {
						var10.method139(client.field1047[0], client.field1047[field421[var20]]);
					}
				}
			}

			var10.method132();
			var10.method142(64, 850, -30, -50, -30, true);
			field439.method102(var3, var10);
			field437 = var3;
		}

		if (field436) {
			return var10;
		}

		class31 var21 = class31.field477;
		var21.method127(class7.method48(var5) & class7.method48(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method134(var6, class66.field982[field388].field988, var5);
		} else if (var5 != -1) {
			var21.method133(var5);
		}

		var21.method129();
		var21.field514 = null;
		var21.field513 = null;
		return var21;
	}

	@ObfuscatedName("ab.a(Z)Leb;")
	public final class31 method118() {
		if (!field417) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = field420[var2];
			if (var3 >= 256 && var3 < 512 && !class64.field962[var3 - 256].method372()) {
				var1 = true;
			}

			if (var3 >= 512 && !class60.method341(var3 - 512).method350(field418)) {
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
				class31 var8 = class64.field962[var7 - 256].method373();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}

			if (var7 >= 512) {
				class31 var9 = class60.method341(var7 - 512).method351(field418);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}

		class31 var10 = new class31(var5, var4);
		for (int var11 = 0; var11 < 5; var11++) {
			if (field421[var11] != 0) {
				var10.method139(client.field1342[var11][0], client.field1342[var11][field421[var11]]);

				if (var11 == 1) {
					var10.method139(client.field1047[0], client.field1047[field421[var11]]);
				}
			}
		}

		return var10;
	}

	@ObfuscatedName("ab.c(I)Z")
	public final boolean method113() {
		if (!field417) {
			return false;
		}

		return true;
	}
}
