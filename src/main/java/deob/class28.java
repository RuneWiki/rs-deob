package deob;

@ObfuscatedName("bb")
public final class class28 extends class26 {

	@ObfuscatedName("bb.tb")
	public String field424;

	@ObfuscatedName("bb.ub")
	public boolean field425 = false;

	@ObfuscatedName("bb.vb")
	public int field426;

	@ObfuscatedName("bb.wb")
	public int field427;

	@ObfuscatedName("bb.xb")
	public int[] field428 = new int[12];

	@ObfuscatedName("bb.yb")
	public int[] field429 = new int[5];

	@ObfuscatedName("bb.zb")
	public int field430;

	@ObfuscatedName("bb.Mb")
	public boolean field443 = false;

	@ObfuscatedName("bb.Nb")
	public long field444 = -1L;

	@ObfuscatedName("bb.Ob")
	public static class20 field445 = new class20(260);

	@ObfuscatedName("bb.Bb")
	public int field432;

	@ObfuscatedName("bb.Cb")
	public int field433;

	@ObfuscatedName("bb.Db")
	public int field434;

	@ObfuscatedName("bb.Eb")
	public int field435;

	@ObfuscatedName("bb.Fb")
	public int field436;

	@ObfuscatedName("bb.Gb")
	public int field437;

	@ObfuscatedName("bb.Ib")
	public int field439;

	@ObfuscatedName("bb.Jb")
	public int field440;

	@ObfuscatedName("bb.Kb")
	public int field441;

	@ObfuscatedName("bb.Lb")
	public int field442;

	@ObfuscatedName("bb.Ab")
	public long field431;

	@ObfuscatedName("bb.Hb")
	public class32 field438;

	@ObfuscatedName("bb.a(BLmb;)V")
	public final void method130(class39 arg0) {
		arg0.field624 = 0;
		field426 = arg0.method239();
		field427 = arg0.method239();

		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method239();
			if (var3 == 0) {
				field428[var2] = 0;
			} else {
				int var4 = arg0.method239();
				field428[var2] = (var3 << 8) + var4;
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method239();
			if (var6 < 0 || var6 >= client.field1204[var5].length) {
				var6 = 0;
			}

			field429[var5] = var6;
		}

		field373 = arg0.method241();
		if (field373 == 0xFFFF) {
			field373 = -1;
		}

		field374 = arg0.method241();
		if (field374 == 0xFFFF) {
			field374 = -1;
		}

		field375 = arg0.method241();
		if (field375 == 0xFFFF) {
			field375 = -1;
		}

		field376 = arg0.method241();
		if (field376 == 0xFFFF) {
			field376 = -1;
		}

		field377 = arg0.method241();
		if (field377 == 0xFFFF) {
			field377 = -1;
		}

		field378 = arg0.method241();
		if (field378 == 0xFFFF) {
			field378 = -1;
		}

		field379 = arg0.method241();
		if (field379 == 0xFFFF) {
			field379 = -1;
		}

		field424 = class52.method314(class52.method311(arg0.method245()));
		field430 = arg0.method239();
		field425 = true;
		field431 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field431 <<= 4;
			if (field428[var7] >= 256) {
				field431 += field428[var7] - 256;
			}
		}

		if (field428[0] >= 256) {
			field431 += field428[0] - 256 >> 4;
		}

		if (field428[1] >= 256) {
			field431 += field428[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field431 <<= 3;
			field431 += field429[var8];
		}

		field431 <<= 1;
		field431 += field426;
	}

	@ObfuscatedName("bb.a(I)Lfb;")
	public final class32 method123() {
		if (!field425) {
			return null;
		}

		class32 var1 = method131();
		if (var1 == null) {
			return null;
		}

		field414 = var1.field367;
		var1.field521 = true;

		if (field443) {
			return var1;
		}

		if (field401 != -1 && field402 != -1) {
			class68 var2 = class68.field999[field401];
			class32 var3 = var2.method388();
			if (var3 != null) {
				class32 var4 = new class32(class8.method62(field402), var3, true, false);
				var4.method152(0, 0, -field405);
				var4.method146();
				var4.method147(var2.field1003.field982[field402]);
				var4.field520 = null;
				var4.field519 = null;

				if (var2.field1006 != 128 || var2.field1007 != 128) {
					var4.method155(var2.field1006, var2.field1006, var2.field1007);
				}

				var4.method156(var2.field1009 + 64, var2.field1010 + 850, -30, -50, -30, true);
				class32[] var5 = new class32[] { var1, var4 };
				var1 = new class32(var5, 2, true);
			}
		}

		if (field438 != null) {
			if (client.field1417 >= field434) {
				field438 = null;
			}

			if (client.field1417 >= field433 && client.field1417 < field434) {
				class32 var6 = field438;
				var6.method152(field435 - field368, field437 - field369, field436 - field432);

				if (field415 == 512) {
					var6.method150();
					var6.method150();
					var6.method150();
				} else if (field415 == 1024) {
					var6.method150();
					var6.method150();
				} else if (field415 == 1536) {
					var6.method150();
				}

				class32[] var7 = new class32[] { var1, var6 };
				var1 = new class32(var7, 2, true);

				if (field415 == 512) {
					var6.method150();
				} else if (field415 == 1024) {
					var6.method150();
					var6.method150();
				} else if (field415 == 1536) {
					var6.method150();
					var6.method150();
					var6.method150();
				}

				var6.method152(field368 - field435, field369 - field437, field432 - field436);
			}
		}

		var1.field521 = true;
		return var1;
	}

	@ObfuscatedName("bb.d(I)Lfb;")
	public final class32 method131() {
		long var1 = field431;
		int var3 = -1;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		if (field396 >= 0 && field399 == 0) {
			class66 var7 = class66.field980[field396];
			var3 = var7.field982[field397];

			if (field393 >= 0 && field393 != field373) {
				var4 = class66.field980[field393].field982[field394];
			}

			if (var7.field989 >= 0) {
				var5 = var7.field989;
				var1 += var5 - field428[5] << 40;
			}

			if (var7.field990 >= 0) {
				var6 = var7.field990;
				var1 += var6 - field428[3] << 48;
			}
		} else if (field393 >= 0) {
			var3 = class66.field980[field393].field982[field394];
		}

		class32 var8 = (class32) field445.method115(var1);
		if (var8 == null) {
			boolean var9 = false;
			for (int var10 = 0; var10 < 12; var10++) {
				int var11 = field428[var10];
				if (var6 >= 0 && var10 == 3) {
					var11 = var6;
				}

				if (var5 >= 0 && var10 == 5) {
					var11 = var5;
				}

				if (var11 >= 256 && var11 < 512 && !class64.field960[var11 - 256].method379()) {
					var9 = true;
				}

				if (var11 >= 512 && !class60.method350(var11 - 512).method357(field426)) {
					var9 = true;
				}
			}

			if (var9) {
				if (field444 != -1L) {
					var8 = (class32) field445.method115(field444);
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
				int var15 = field428[var14];
				if (var6 >= 0 && var14 == 3) {
					var15 = var6;
				}

				if (var5 >= 0 && var14 == 5) {
					var15 = var5;
				}

				if (var15 >= 256 && var15 < 512) {
					class32 var16 = class64.field960[var15 - 256].method380();
					if (var16 != null) {
						var12[var13++] = var16;
					}
				}

				if (var15 >= 512) {
					class32 var17 = class60.method350(var15 - 512).method358(field426);
					if (var17 != null) {
						var12[var13++] = var17;
					}
				}
			}

			var8 = new class32(var12, var13);
			for (int var18 = 0; var18 < 5; var18++) {
				if (field429[var18] != 0) {
					var8.method153(client.field1204[var18][0], client.field1204[var18][field429[var18]]);

					if (var18 == 1) {
						var8.method153(client.field1439[0], client.field1439[field429[var18]]);
					}
				}
			}

			var8.method146();
			var8.method156(64, 850, -30, -50, -30, true);
			field445.method116(var8, var1);
			field444 = var1;
		}

		if (field443) {
			return var8;
		}

		class32 var19 = class32.field483;
		var19.method141(class8.method62(var3) & class8.method62(var4), var8);

		if (var3 != -1 && var4 != -1) {
			var19.method148(var4, var3, class66.field980[field396].field986);
		} else if (var3 != -1) {
			var19.method147(var3);
		}

		var19.method143();
		var19.field520 = null;
		var19.field519 = null;
		return var19;
	}

	@ObfuscatedName("bb.e(I)Lfb;")
	public final class32 method132() {
		if (!field425) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = field428[var2];
			if (var3 >= 256 && var3 < 512 && !class64.field960[var3 - 256].method381()) {
				var1 = true;
			}

			if (var3 >= 512 && !class60.method350(var3 - 512).method359(field426)) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class32[] var4 = new class32[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = field428[var6];
			if (var7 >= 256 && var7 < 512) {
				class32 var8 = class64.field960[var7 - 256].method382();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}

			if (var7 >= 512) {
				class32 var9 = class60.method350(var7 - 512).method360(field426);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}

		class32 var10 = new class32(var4, var5);
		for (int var11 = 0; var11 < 5; var11++) {
			if (field429[var11] != 0) {
				var10.method153(client.field1204[var11][0], client.field1204[var11][field429[var11]]);

				if (var11 == 1) {
					var10.method153(client.field1439[0], client.field1439[field429[var11]]);
				}
			}
		}

		return var10;
	}

	@ObfuscatedName("bb.c(I)Z")
	public final boolean method127() {
		if (!field425) {
			return false;
		}

		return true;
	}
}
