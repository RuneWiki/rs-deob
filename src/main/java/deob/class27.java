package deob;

@ObfuscatedName("ab")
public final class class27 extends class25 {

	@ObfuscatedName("ab.Bb")
	public boolean field417 = false;

	@ObfuscatedName("ab.Eb")
	public int[] field420 = new int[12];

	@ObfuscatedName("ab.Fb")
	public int[] field421 = new int[5];

	@ObfuscatedName("ab.Ub")
	public boolean field436 = false;

	@ObfuscatedName("ab.Vb")
	public long field437 = -1L;

	@ObfuscatedName("ab.Yb")
	public static class19 field440 = new class19(260);

	@ObfuscatedName("ab.Cb")
	public int field418;

	@ObfuscatedName("ab.Db")
	public int field419;

	@ObfuscatedName("ab.Gb")
	public int field422;

	@ObfuscatedName("ab.Hb")
	public int field423;

	@ObfuscatedName("ab.Jb")
	public int field425;

	@ObfuscatedName("ab.Kb")
	public int field426;

	@ObfuscatedName("ab.Lb")
	public int field427;

	@ObfuscatedName("ab.Mb")
	public int field428;

	@ObfuscatedName("ab.Nb")
	public int field429;

	@ObfuscatedName("ab.Ob")
	public int field430;

	@ObfuscatedName("ab.Qb")
	public int field432;

	@ObfuscatedName("ab.Rb")
	public int field433;

	@ObfuscatedName("ab.Sb")
	public int field434;

	@ObfuscatedName("ab.Tb")
	public int field435;

	@ObfuscatedName("ab.Xb")
	public int field439;

	@ObfuscatedName("ab.Ib")
	public long field424;

	@ObfuscatedName("ab.Pb")
	public class31 field431;

	@ObfuscatedName("ab.Wb")
	public class59 field438;

	@ObfuscatedName("ab.Ab")
	public String field416;

	@ObfuscatedName("ab.a(Llb;B)V")
	public final void method116(class38 arg0) {
		arg0.field622 = 0;
		field418 = arg0.method229();
		field419 = arg0.method229();
		field438 = null;
		field439 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method229();
			if (var3 == 0) {
				field420[var2] = 0;
			} else {
				int var4 = arg0.method229();
				field420[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field420[0] == 0xFFFF) {
					field438 = class59.method341(arg0.method231());
					break;
				}

				if (field420[var2] >= 512 && field420[var2] - 512 < class60.field910) {
					int var5 = class60.method348(field420[var2] - 512).field955;
					if (var5 != 0) {
						field439 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method229();
			if (var7 < 0 || var7 >= client.field1356[var6].length) {
				var7 = 0;
			}

			field421[var6] = var7;
		}

		field365 = arg0.method231();
		if (field365 == 0xFFFF) {
			field365 = -1;
		}

		field366 = arg0.method231();
		if (field366 == 0xFFFF) {
			field366 = -1;
		}

		field367 = arg0.method231();
		if (field367 == 0xFFFF) {
			field367 = -1;
		}

		field368 = arg0.method231();
		if (field368 == 0xFFFF) {
			field368 = -1;
		}

		field369 = arg0.method231();
		if (field369 == 0xFFFF) {
			field369 = -1;
		}

		field370 = arg0.method231();
		if (field370 == 0xFFFF) {
			field370 = -1;
		}

		field371 = arg0.method231();
		if (field371 == 0xFFFF) {
			field371 = -1;
		}

		field416 = class51.method304(class51.method301(arg0.method235()));
		field422 = arg0.method229();
		field423 = arg0.method231();
		field417 = true;
		field424 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field424 <<= 4;
			if (field420[var8] >= 256) {
				field424 += field420[var8] - 256;
			}
		}

		if (field420[0] >= 256) {
			field424 += field420[0] - 256 >> 4;
		}

		if (field420[1] >= 256) {
			field424 += field420[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field424 <<= 3;
			field424 += field421[var9];
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
		var1.field521 = true;

		if (field436) {
			return var1;
		}

		if (field393 != -1 && field394 != -1) {
			class68 var2 = class68.field1017[field393];
			class31 var3 = var2.method386();
			if (var3 != null) {
				class31 var4 = new class31(false, -16051, var3, class7.method48(field394), true);
				var4.method139(-field397, 0, 0);
				var4.method133();
				var4.method134(var2.field1021.field999[field394]);
				var4.field520 = null;
				var4.field519 = null;

				if (var2.field1024 != 128 || var2.field1025 != 128) {
					var4.method142(var2.field1024, var2.field1024, var2.field1025);
				}

				var4.method143(var2.field1027 + 64, var2.field1028 + 850, -30, -50, -30, true);
				class31[] var5 = new class31[] { var1, var4 };
				var1 = new class31(var5, true, 2);
			}
		}

		if (field431 != null) {
			if (client.field1136 >= field427) {
				field431 = null;
			}

			if (client.field1136 >= field426 && client.field1136 < field427) {
				class31 var6 = field431;
				var6.method139(field429 - field425, field430 - field361, field428 - field360);

				if (field407 == 512) {
					var6.method137();
					var6.method137();
					var6.method137();
				} else if (field407 == 1024) {
					var6.method137();
					var6.method137();
				} else if (field407 == 1536) {
					var6.method137();
				}

				class31[] var7 = new class31[] { var1, var6 };
				var1 = new class31(var7, true, 2);

				if (field407 == 512) {
					var6.method137();
				} else if (field407 == 1024) {
					var6.method137();
					var6.method137();
				} else if (field407 == 1536) {
					var6.method137();
					var6.method137();
					var6.method137();
				}

				var6.method139(field425 - field429, field361 - field430, field360 - field428);
			}
		}

		var1.field521 = true;
		return var1;
	}

	@ObfuscatedName("ab.b(Z)Leb;")
	public final class31 method117() {
		if (field438 != null) {
			int var1 = -1;
			if (field388 >= 0 && field391 == 0) {
				var1 = class66.field997[field388].field999[field389];
			} else if (field385 >= 0) {
				var1 = class66.field997[field385].field999[field386];
			}

			return field438.method343(var1, -1, null);
		}

		long var3 = field424;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field388 >= 0 && field391 == 0) {
			class66 var9 = class66.field997[field388];
			var5 = var9.field999[field389];

			if (field385 >= 0 && field385 != field365) {
				var6 = class66.field997[field385].field999[field386];
			}

			if (var9.field1006 >= 0) {
				var7 = var9.field1006;
				var3 += var7 - field420[5] << 40;
			}

			if (var9.field1007 >= 0) {
				var8 = var9.field1007;
				var3 += var8 - field420[3] << 48;
			}
		} else if (field385 >= 0) {
			var5 = class66.field997[field385].field999[field386];
		}

		class31 var10 = (class31) field440.method101(var3);
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

				if (var13 >= 256 && var13 < 512 && !class64.field979[var13 - 256].method377()) {
					var11 = true;
				}

				if (var13 >= 512 && !class60.method348(var13 - 512).method355(field418)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field437 != -1L) {
					var10 = (class31) field440.method101(field437);
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
					class31 var18 = class64.field979[var17 - 256].method378();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					class31 var19 = class60.method348(var17 - 512).method356(field418);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new class31(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field421[var20] != 0) {
					var10.method140(client.field1356[var20][0], client.field1356[var20][field421[var20]]);

					if (var20 == 1) {
						var10.method140(client.field1354[0], client.field1354[field421[var20]]);
					}
				}
			}

			var10.method133();
			var10.method143(64, 850, -30, -50, -30, true);
			field440.method102(var3, var10);
			field437 = var3;
		}

		if (field436) {
			return var10;
		}

		class31 var21 = class31.field483;
		var21.method128(var10, class7.method48(var5) & class7.method48(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method135(var5, class66.field997[field388].field1003, var6);
		} else if (var5 != -1) {
			var21.method134(var5);
		}

		var21.method130();
		var21.field520 = null;
		var21.field519 = null;
		return var21;
	}

	@ObfuscatedName("ab.c(Z)Leb;")
	public final class31 method118() {
		if (!field417) {
			return null;
		}

		if (field438 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field420[var2];
				if (var3 >= 256 && var3 < 512 && !class64.field979[var3 - 256].method379()) {
					var1 = true;
				}

				if (var3 >= 512 && !class60.method348(var3 - 512).method357(field418)) {
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
					class31 var8 = class64.field979[var7 - 256].method380();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					class31 var9 = class60.method348(var7 - 512).method358(field418);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			class31 var10 = new class31(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field421[var11] != 0) {
					var10.method140(client.field1356[var11][0], client.field1356[var11][field421[var11]]);

					if (var11 == 1) {
						var10.method140(client.field1354[0], client.field1354[field421[var11]]);
					}
				}
			}

			return var10;
		}

		return field438.method344();
	}

	@ObfuscatedName("ab.a(Z)Z")
	public final boolean method113() {
		if (!field417) {
			return false;
		}

		return true;
	}
}
