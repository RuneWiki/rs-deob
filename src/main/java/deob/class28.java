package deob;

@ObfuscatedName("bb")
public final class class28 extends class26 {

	@ObfuscatedName("bb.qb")
	public String field412;

	@ObfuscatedName("bb.rb")
	public boolean field413 = false;

	@ObfuscatedName("bb.sb")
	public int field414;

	@ObfuscatedName("bb.tb")
	public int field415;

	@ObfuscatedName("bb.ub")
	public int[] field416 = new int[12];

	@ObfuscatedName("bb.vb")
	public int[] field417 = new int[5];

	@ObfuscatedName("bb.wb")
	public int field418;

	@ObfuscatedName("bb.xb")
	public long field419;

	@ObfuscatedName("bb.yb")
	public int field420;

	@ObfuscatedName("bb.zb")
	public int field421;

	@ObfuscatedName("bb.Jb")
	public boolean field431 = false;

	@ObfuscatedName("bb.Kb")
	public long field432 = -1L;

	@ObfuscatedName("bb.Lb")
	public static class20 field433 = new class20(260);

	@ObfuscatedName("bb.Ab")
	public int field422;

	@ObfuscatedName("bb.Bb")
	public int field423;

	@ObfuscatedName("bb.Cb")
	public int field424;

	@ObfuscatedName("bb.Db")
	public int field425;

	@ObfuscatedName("bb.Fb")
	public int field427;

	@ObfuscatedName("bb.Gb")
	public int field428;

	@ObfuscatedName("bb.Hb")
	public int field429;

	@ObfuscatedName("bb.Ib")
	public int field430;

	@ObfuscatedName("bb.Eb")
	public class32 field426;

	@ObfuscatedName("bb.a(Lmb;I)V")
	public final void method126(class39 arg0) {
		arg0.field611 = 0;
		field414 = arg0.method231();
		field415 = arg0.method231();

		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method231();
			if (var3 == 0) {
				field416[var2] = 0;
			} else {
				int var4 = arg0.method231();
				field416[var2] = (var3 << 8) + var4;
			}
		}

		for (int var5 = 0; var5 < 5; var5++) {
			int var6 = arg0.method231();
			if (var6 < 0 || var6 >= client.field1098[var5].length) {
				var6 = 0;
			}

			field417[var5] = var6;
		}

		field364 = arg0.method233();
		if (field364 == 0xFFFF) {
			field364 = -1;
		}

		field365 = arg0.method233();
		if (field365 == 0xFFFF) {
			field365 = -1;
		}

		field366 = arg0.method233();
		if (field366 == 0xFFFF) {
			field366 = -1;
		}

		field367 = arg0.method233();
		if (field367 == 0xFFFF) {
			field367 = -1;
		}

		field368 = arg0.method233();
		if (field368 == 0xFFFF) {
			field368 = -1;
		}

		field369 = arg0.method233();
		if (field369 == 0xFFFF) {
			field369 = -1;
		}

		field370 = arg0.method233();
		if (field370 == 0xFFFF) {
			field370 = -1;
		}

		field412 = class52.method304(class52.method301(arg0.method237()));
		field418 = arg0.method231();
		field413 = true;
		field419 = 0L;
		for (int var7 = 0; var7 < 12; var7++) {
			field419 <<= 4;
			if (field416[var7] >= 256) {
				field419 += field416[var7] - 256;
			}
		}

		if (field416[0] >= 256) {
			field419 += field416[0] - 256 >> 4;
		}

		if (field416[1] >= 256) {
			field419 += field416[1] - 256 >> 8;
		}

		for (int var8 = 0; var8 < 5; var8++) {
			field419 <<= 3;
			field419 += field417[var8];
		}

		field419 <<= 1;
		field419 += field414;
	}

	@ObfuscatedName("bb.a(Z)Lfb;")
	public final class32 method121() {
		if (!field413) {
			return null;
		}

		class32 var1 = method127();
		if (var1 == null) {
			return null;
		}

		field404 = var1.field358;
		var1.field509 = true;

		if (field431) {
			return var1;
		}

		if (field391 != -1 && field392 != -1) {
			class66 var2 = class66.field959[field391];
			class32 var3 = var2.method377();
			if (var3 != null) {
				class32 var4 = new class32(true, false, var3, !var2.field964);
				var4.method148(-field395, 0, 0);
				var4.method142();
				var4.method143(var2.field963.field948[field392]);
				var4.field508 = null;
				var4.field507 = null;

				if (var2.field967 != 128 || var2.field968 != 128) {
					var4.method151(var2.field968, var2.field967, var2.field967);
				}

				var4.method152(var2.field970 + 64, var2.field971 + 850, -30, -50, -30, true);
				class32[] var5 = new class32[] { var1, var4 };
				var1 = new class32(var5, 2, true);
			}
		}

		if (field426 != null) {
			if (client.field1256 >= field422) {
				field426 = null;
			}

			if (client.field1256 >= field421 && client.field1256 < field422) {
				class32 var6 = field426;
				var6.method148(field424 - field420, field423 - field359, field425 - field360);

				if (field405 == 512) {
					var6.method146();
					var6.method146();
					var6.method146();
				} else if (field405 == 1024) {
					var6.method146();
					var6.method146();
				} else if (field405 == 1536) {
					var6.method146();
				}

				class32[] var7 = new class32[] { var1, var6 };
				var1 = new class32(var7, 2, true);

				if (field405 == 512) {
					var6.method146();
				} else if (field405 == 1024) {
					var6.method146();
					var6.method146();
				} else if (field405 == 1536) {
					var6.method146();
					var6.method146();
					var6.method146();
				}

				var6.method148(field420 - field424, field359 - field423, field360 - field425);
			}
		}

		var1.field509 = true;
		return var1;
	}

	@ObfuscatedName("bb.a(B)Lfb;")
	public final class32 method127() {
		long var1 = field419;
		int var3 = -1;
		int var4 = -1;
		int var5 = -1;
		int var6 = -1;
		if (field386 >= 0 && field389 == 0) {
			class65 var7 = class65.field946[field386];
			var3 = var7.field948[field387];

			if (field383 >= 0 && field383 != field364) {
				var4 = class65.field946[field383].field948[field384];
			}

			if (var7.field955 >= 0) {
				var5 = var7.field955;
				var1 += var5 - field416[5] << 40;
			}

			if (var7.field956 >= 0) {
				var6 = var7.field956;
				var1 += var6 - field416[3] << 48;
			}
		} else if (field383 >= 0) {
			var3 = class65.field946[field383].field948[field384];
		}

		class32 var8 = (class32) field433.method113(var1);
		if (var8 == null) {
			boolean var9 = false;
			for (int var10 = 0; var10 < 12; var10++) {
				int var11 = field416[var10];
				if (var6 >= 0 && var10 == 3) {
					var11 = var6;
				}

				if (var5 >= 0 && var10 == 5) {
					var11 = var5;
				}

				if (var11 >= 256 && var11 < 512 && !class63.field929[var11 - 256].method368()) {
					var9 = true;
				}

				if (var11 >= 512 && !class59.method339(var11 - 512).method346(field414)) {
					var9 = true;
				}
			}

			if (var9) {
				if (field432 != -1L) {
					var8 = (class32) field433.method113(field432);
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
				int var15 = field416[var14];
				if (var6 >= 0 && var14 == 3) {
					var15 = var6;
				}

				if (var5 >= 0 && var14 == 5) {
					var15 = var5;
				}

				if (var15 >= 256 && var15 < 512) {
					class32 var16 = class63.field929[var15 - 256].method369();
					if (var16 != null) {
						var12[var13++] = var16;
					}
				}

				if (var15 >= 512) {
					class32 var17 = class59.method339(var15 - 512).method347(field414);
					if (var17 != null) {
						var12[var13++] = var17;
					}
				}
			}

			var8 = new class32(var13, var12);
			for (int var18 = 0; var18 < 5; var18++) {
				if (field417[var18] != 0) {
					var8.method149(client.field1098[var18][0], client.field1098[var18][field417[var18]]);

					if (var18 == 1) {
						var8.method149(client.field1192[0], client.field1192[field417[var18]]);
					}
				}
			}

			var8.method142();
			var8.method152(64, 850, -30, -50, -30, true);
			field433.method114(var8, var1);
			field432 = var1;
		}

		if (field431) {
			return var8;
		}

		class32 var19 = class32.field471;
		var19.method137(var8, true);

		if (var3 != -1 && var4 != -1) {
			var19.method144(var4, var3, class65.field946[field386].field952);
		} else if (var3 != -1) {
			var19.method143(var3);
		}

		var19.method139();
		var19.field508 = null;
		var19.field507 = null;
		return var19;
	}

	@ObfuscatedName("bb.b(Z)Lfb;")
	public final class32 method128() {
		if (!field413) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = field416[var2];
			if (var3 >= 256 && var3 < 512 && !class63.field929[var3 - 256].method370()) {
				var1 = true;
			}

			if (var3 >= 512 && !class59.method339(var3 - 512).method348(field414)) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class32[] var4 = new class32[12];
		int var5 = 0;
		for (int var6 = 0; var6 < 12; var6++) {
			int var7 = field416[var6];
			if (var7 >= 256 && var7 < 512) {
				class32 var8 = class63.field929[var7 - 256].method371();
				if (var8 != null) {
					var4[var5++] = var8;
				}
			}

			if (var7 >= 512) {
				class32 var9 = class59.method339(var7 - 512).method349(field414);
				if (var9 != null) {
					var4[var5++] = var9;
				}
			}
		}

		class32 var10 = new class32(var5, var4);
		for (int var11 = 0; var11 < 5; var11++) {
			if (field417[var11] != 0) {
				var10.method149(client.field1098[var11][0], client.field1098[var11][field417[var11]]);

				if (var11 == 1) {
					var10.method149(client.field1192[0], client.field1192[field417[var11]]);
				}
			}
		}

		return var10;
	}

	@ObfuscatedName("bb.a(I)Z")
	public final boolean method124() {
		if (!field413) {
			return false;
		}

		return true;
	}
}
