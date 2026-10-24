package deob;

@ObfuscatedName("bb")
public final class class28 extends class26 {

	@ObfuscatedName("bb.ub")
	public String field421;

	@ObfuscatedName("bb.vb")
	public boolean field422 = false;

	@ObfuscatedName("bb.wb")
	public int field423;

	@ObfuscatedName("bb.xb")
	public int field424;

	@ObfuscatedName("bb.yb")
	public int[] field425 = new int[12];

	@ObfuscatedName("bb.zb")
	public int[] field426 = new int[5];

	@ObfuscatedName("bb.Nb")
	public boolean field440 = false;

	@ObfuscatedName("bb.Ob")
	public long field441 = -1L;

	@ObfuscatedName("bb.Pb")
	public static class20 field442 = new class20(260);

	@ObfuscatedName("bb.Ab")
	public int field427;

	@ObfuscatedName("bb.Cb")
	public int field429;

	@ObfuscatedName("bb.Db")
	public int field430;

	@ObfuscatedName("bb.Eb")
	public int field431;

	@ObfuscatedName("bb.Fb")
	public int field432;

	@ObfuscatedName("bb.Gb")
	public int field433;

	@ObfuscatedName("bb.Hb")
	public int field434;

	@ObfuscatedName("bb.Jb")
	public int field436;

	@ObfuscatedName("bb.Kb")
	public int field437;

	@ObfuscatedName("bb.Lb")
	public int field438;

	@ObfuscatedName("bb.Mb")
	public int field439;

	@ObfuscatedName("bb.Bb")
	public long field428;

	@ObfuscatedName("bb.Ib")
	public class32 field435;

	@ObfuscatedName("bb.a(ILmb;)V")
	public final void method129(class39 arg0) {
		arg0.field621 = 0;
		field423 = arg0.method238();
		field424 = arg0.method238();

		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				field425[var2] = 0;
			} else {
				int var4 = arg0.method238();
				field425[var2] = (var3 << 8) + var4;
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method238();
			if (var6 < 0 || var6 >= client.field1347[var5].length) {
				var6 = 0;
			}

			field426[var5] = var6;
		}

		field371 = arg0.method240();
		if (field371 == 0xFFFF) {
			field371 = -1;
		}

		field372 = arg0.method240();
		if (field372 == 0xFFFF) {
			field372 = -1;
		}

		field373 = arg0.method240();
		if (field373 == 0xFFFF) {
			field373 = -1;
		}

		field374 = arg0.method240();
		if (field374 == 0xFFFF) {
			field374 = -1;
		}

		field375 = arg0.method240();
		if (field375 == 0xFFFF) {
			field375 = -1;
		}

		field376 = arg0.method240();
		if (field376 == 0xFFFF) {
			field376 = -1;
		}

		field377 = arg0.method240();
		if (field377 == 0xFFFF) {
			field377 = -1;
		}

		field421 = class52.method313(class52.method310(arg0.method244()));
		field427 = arg0.method238();
		field422 = true;
		field428 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field428 <<= 4;
			if (field425[var7] >= 256) {
				field428 += field425[var7] - 256;
			}
		}

		if (field425[0] >= 256) {
			field428 += field425[0] - 256 >> 4;
		}

		if (field425[1] >= 256) {
			field428 += field425[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field428 <<= 3;
			field428 += field426[var8];
		}

		field428 <<= 1;
		field428 += field423;
	}

	@ObfuscatedName("bb.a(Z)Lfb;")
	public final class32 method122() {
		if (!field422) {
			return null;
		}

		class32 var1 = method130();
		if (var1 == null) {
			return null;
		}

		field412 = var1.field365;
		var1.field518 = true;

		if (field440) {
			return var1;
		}

		if (field399 != -1 && field400 != -1) {
			class67 var2 = class67.field989[field399];
			class32 var3 = var2.method386();
			if (var3 != null) {
				class32 var4 = new class32(false, true, var3, !var2.field994);
				var4.method151(0, -field403, 0);
				var4.method145();
				var4.method146(var2.field993.field975[field400]);
				var4.field517 = null;
				var4.field516 = null;

				if (var2.field997 != 128 || var2.field998 != 128) {
					var4.method154(var2.field997, var2.field997, var2.field998);
				}

				var4.method155(var2.field1000 + 64, var2.field1001 + 850, -30, -50, -30, true);
				class32[] var5 = new class32[] { var1, var4 };
				var1 = new class32(2, var5, true);
			}
		}

		if (field435 != null) {
			if (client.field1371 >= field431) {
				field435 = null;
			}

			if (client.field1371 >= field430 && client.field1371 < field431) {
				class32 var6 = field435;
				var6.method151(field434 - field367, field433 - field429, field432 - field366);

				if (field413 == 512) {
					var6.method149();
					var6.method149();
					var6.method149();
				} else if (field413 == 1024) {
					var6.method149();
					var6.method149();
				} else if (field413 == 1536) {
					var6.method149();
				}

				class32[] var7 = new class32[] { var1, var6 };
				var1 = new class32(2, var7, true);

				if (field413 == 512) {
					var6.method149();
				} else if (field413 == 1024) {
					var6.method149();
					var6.method149();
				} else if (field413 == 1536) {
					var6.method149();
					var6.method149();
					var6.method149();
				}

				var6.method151(field367 - field434, field429 - field433, field366 - field432);
			}
		}

		var1.field518 = true;
		return var1;
	}

	@ObfuscatedName("bb.b(Z)Lfb;")
	public final class32 method130() {
		long var1 = field428;
		int var3 = -1;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		if (field394 >= 0 && field397 == 0) {
			class66 var7 = class66.field973[field394];
			var3 = var7.field975[field395];

			if (field391 >= 0 && field391 != field371) {
				var4 = class66.field973[field391].field975[field392];
			}

			if (var7.field982 >= 0) {
				var5 = var7.field982;
				var1 += var5 - field425[5] << 40;
			}

			if (var7.field983 >= 0) {
				var6 = var7.field983;
				var1 += var6 - field425[3] << 48;
			}
		} else if (field391 >= 0) {
			var3 = class66.field973[field391].field975[field392];
		}

		class32 var8 = (class32) field442.method114(var1);
		if (var8 == null) {
			boolean var9 = false;
			for (int var10 = 0; var10 < 12; var10++) {
				int var11 = field425[var10];
				if (var6 >= 0 && var10 == 3) {
					var11 = var6;
				}

				if (var5 >= 0 && var10 == 5) {
					var11 = var5;
				}

				if (var11 >= 256 && var11 < 512 && !class64.field956[var11 - 256].method377()) {
					var9 = true;
				}

				if (var11 >= 512 && !class60.method348(var11 - 512).method355(field423)) {
					var9 = true;
				}
			}

			if (var9) {
				if (field441 != -1L) {
					var8 = (class32) field442.method114(field441);
				}

				if (var8 == null) {
					return null;
				}
			}
		}

		if (var8 == null) {
			class32[] var12 = new class32[12];
			int var13 = 0;
			for (int var14 = 0; var14 < 12; var14++) {
				int var15 = field425[var14];
				if (var6 >= 0 && var14 == 3) {
					var15 = var6;
				}

				if (var5 >= 0 && var14 == 5) {
					var15 = var5;
				}

				if (var15 >= 256 && var15 < 512) {
					class32 var16 = class64.field956[var15 - 256].method378();
					if (var16 != null) {
						var12[var13++] = var16;
					}
				}

				if (var15 >= 512) {
					class32 var17 = class60.method348(var15 - 512).method356(field423);
					if (var17 != null) {
						var12[var13++] = var17;
					}
				}
			}

			var8 = new class32(var13, var12);
			for (int var18 = 0; var18 < 5; var18++) {
				if (field426[var18] != 0) {
					var8.method152(client.field1347[var18][0], client.field1347[var18][field426[var18]]);

					if (var18 == 1) {
						var8.method152(client.field1300[0], client.field1300[field426[var18]]);
					}
				}
			}

			var8.method145();
			var8.method155(64, 850, -30, -50, -30, true);
			field442.method115(var8, var1);
			field441 = var1;
		}

		if (field440) {
			return var8;
		}

		class32 var19 = class32.field480;
		var19.method140(var8, true);

		if (var3 != -1 && var4 != -1) {
			var19.method147(var3, class66.field973[field394].field979, var4);
		} else if (var3 != -1) {
			var19.method146(var3);
		}

		var19.method142();
		var19.field517 = null;
		var19.field516 = null;
		return var19;
	}

	@ObfuscatedName("bb.c(I)Lfb;")
	public final class32 method131() {
		if (!field422) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = field425[var2];
			if (var3 >= 256 && var3 < 512 && !class64.field956[var3 - 256].method379()) {
				var1 = true;
			}

			if (var3 >= 512 && !class60.method348(var3 - 512).method357(field423)) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class32[] var4 = new class32[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = field425[var6];
			if (var7 >= 256 && var7 < 512) {
				class32 var8 = class64.field956[var7 - 256].method380();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}

			if (var7 >= 512) {
				class32 var9 = class60.method348(var7 - 512).method358(field423);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}

		class32 var10 = new class32(var5, var4);
		for (int var11 = 0; var11 < 5; var11++) {
			if (field426[var11] != 0) {
				var10.method152(client.field1347[var11][0], client.field1347[var11][field426[var11]]);

				if (var11 == 1) {
					var10.method152(client.field1300[0], client.field1300[field426[var11]]);
				}
			}
		}

		return var10;
	}

	@ObfuscatedName("bb.b(I)Z")
	public final boolean method126() {
		if (!field422) {
			return false;
		}

		return true;
	}
}
