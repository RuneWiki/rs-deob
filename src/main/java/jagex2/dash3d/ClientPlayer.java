package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.IdkType;
import jagex2.config.NpcType;
import jagex2.config.ObjType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.datastruct.LruCache;
import jagex2.io.Packet;
import jagex2.jstring.JString;

@ObfuscatedName("ZGNGQRPJ")
public final class ClientPlayer extends ClientEntity {

	@ObfuscatedName("ZGNGQRPJ.vb")
	public int field1430 = -1;

	@ObfuscatedName("ZGNGQRPJ.wb")
	public long field1431 = -1L;

	@ObfuscatedName("ZGNGQRPJ.zb")
	public int[] field1434 = new int[12];

	@ObfuscatedName("ZGNGQRPJ.Db")
	public int field1438 = -1;

	@ObfuscatedName("ZGNGQRPJ.Fb")
	public boolean field1440 = false;

	@ObfuscatedName("ZGNGQRPJ.Hb")
	public int[] field1442 = new int[5];

	@ObfuscatedName("ZGNGQRPJ.Kb")
	public boolean field1444 = false;

	@ObfuscatedName("ZGNGQRPJ.Ib")
	public static LruCache field1443 = new LruCache(260);

	@ObfuscatedName("ZGNGQRPJ.qb")
	public int field1426;

	@ObfuscatedName("ZGNGQRPJ.rb")
	public int field1427;

	@ObfuscatedName("ZGNGQRPJ.sb")
	public int field1428;

	@ObfuscatedName("ZGNGQRPJ.xb")
	public int field1432;

	@ObfuscatedName("ZGNGQRPJ.Ab")
	public int field1435;

	@ObfuscatedName("ZGNGQRPJ.Cb")
	public int field1437;

	@ObfuscatedName("ZGNGQRPJ.Gb")
	public int field1441;

	@ObfuscatedName("ZGNGQRPJ.Lb")
	public int field1445;

	@ObfuscatedName("ZGNGQRPJ.Mb")
	public int field1446;

	@ObfuscatedName("ZGNGQRPJ.Nb")
	public int field1447;

	@ObfuscatedName("ZGNGQRPJ.Pb")
	public int field1448;

	@ObfuscatedName("ZGNGQRPJ.Qb")
	public int field1449;

	@ObfuscatedName("ZGNGQRPJ.Rb")
	public int field1450;

	@ObfuscatedName("ZGNGQRPJ.Sb")
	public int field1451;

	@ObfuscatedName("ZGNGQRPJ.Bb")
	public long field1436;

	@ObfuscatedName("ZGNGQRPJ.tb")
	public Model field1429;

	@ObfuscatedName("ZGNGQRPJ.Eb")
	public NpcType field1439;

	@ObfuscatedName("ZGNGQRPJ.yb")
	public String field1433;

	@ObfuscatedName("ZGNGQRPJ.a(Z)LLZYQDKJV;")
	public final Model method572() {
		if (!field1440) {
			return null;
		}

		if (field1439 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1434[var2];
				if (var3 >= 256 && var3 < 512 && !IdkType.field1453[var3 - 256].method579()) {
					var1 = true;
				}

				if (var3 >= 512 && !ObjType.method221(var3 - 512).method220(field1437)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			Model[] var4 = new Model[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1434[var6];
				if (var7 >= 256 && var7 < 512) {
					Model var8 = IdkType.field1453[var7 - 256].method580();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					Model var9 = ObjType.method221(var7 - 512).method228(field1437);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			Model var10 = new Model(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1442[var11] != 0) {
					var10.method373(Client.field272[var11][0], Client.field272[var11][field1442[var11]]);

					if (var11 == 1) {
						var10.method373(Client.field500[0], Client.field500[field1442[var11]]);
					}
				}
			}

			return var10;
		}

		return field1439.method472();
	}

	@ObfuscatedName("ZGNGQRPJ.b(B)LLZYQDKJV;")
	public final Model method573() {
		if (field1439 != null) {
			int var1 = -1;
			if (field1020 >= 0 && field1023 == 0) {
				var1 = SeqType.field680[field1020].field682[field1021];
			} else if (field984 >= 0) {
				var1 = SeqType.field680[field984].field682[field985];
			}

			return field1439.method475(var1, -1, null);
		}

		long var3 = field1436;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1020 >= 0 && field1023 == 0) {
			SeqType var9 = SeqType.field680[field1020];
			var5 = var9.field682[field1021];

			if (field984 >= 0 && field984 != field1030) {
				var6 = SeqType.field680[field984].field682[field985];
			}

			if (var9.field689 >= 0) {
				var7 = var9.field689;
				var3 += var7 - field1434[5] << 40;
			}

			if (var9.field690 >= 0) {
				var8 = var9.field690;
				var3 += var8 - field1434[3] << 48;
			}
		} else if (field984 >= 0) {
			var5 = SeqType.field680[field984].field682[field985];
		}

		Model var10 = (Model) field1443.method458(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1434[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !IdkType.field1453[var13 - 256].method577()) {
					var11 = true;
				}

				if (var13 >= 512 && !ObjType.method221(var13 - 512).method225(field1437)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1431 != -1L) {
					var10 = (Model) field1443.method458(field1431);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			Model[] var14 = new Model[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1434[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					Model var18 = IdkType.field1453[var17 - 256].method578();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					Model var19 = ObjType.method221(var17 - 512).method222(field1437);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new Model(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1442[var20] != 0) {
					var10.method373(Client.field272[var20][0], Client.field272[var20][field1442[var20]]);

					if (var20 == 1) {
						var10.method373(Client.field500[0], Client.field500[field1442[var20]]);
					}
				}
			}

			var10.method366();
			var10.method376(64, 850, -30, -50, -30, true);
			field1443.method459(var10, var3);
			field1431 = var3;
		}

		if (field1444) {
			return var10;
		}

		Model var21 = Model.field1033;
		var21.method361(AnimFrame.method265(var5) & AnimFrame.method265(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method368(var6, var5, SeqType.field680[field1020].field686);
		} else if (var5 != -1) {
			var21.method367(var5);
		}

		var21.method363();
		var21.field1069 = null;
		var21.field1068 = null;
		return var21;
	}

	@ObfuscatedName("ZGNGQRPJ.b(I)Z")
	public final boolean method351() {
		if (!field1440) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ZGNGQRPJ.a(B)LLZYQDKJV;")
	public final Model method239() {
		if (!field1440) {
			return null;
		}

		Model var1 = method573();
		if (var1 == null) {
			return null;
		}

		field990 = var1.field1461;
		var1.field1070 = true;

		if (field1444) {
			return var1;
		}

		if (field1010 != -1 && field1011 != -1) {
			SpotAnimType var2 = SpotAnimType.field1118[field1010];
			Model var3 = var2.method439();
			if (var3 != null) {
				Model var4 = new Model(false, true, var3, AnimFrame.method265(field1011));
				var4.method372(0, 0, -field1014);
				var4.method366();
				var4.method367(var2.field1122.field682[field1011]);
				var4.field1069 = null;
				var4.field1068 = null;

				if (var2.field1125 != 128 || var2.field1126 != 128) {
					var4.method375(var2.field1126, var2.field1125, var2.field1125);
				}

				var4.method376(var2.field1128 + 64, var2.field1129 + 850, -30, -50, -30, true);
				Model[] var5 = new Model[] { var1, var4 };
				var1 = new Model(2, true, var5);
			}
		}

		if (field1429 != null) {
			if (Client.field553 >= field1446) {
				field1429 = null;
			}

			if (Client.field553 >= field1445 && Client.field553 < field1446) {
				Model var6 = field1429;
				var6.method372(field1426 - field1006, field1428 - field1007, field1427 - field1432);

				if (field980 == 512) {
					var6.method370();
					var6.method370();
					var6.method370();
				} else if (field980 == 1024) {
					var6.method370();
					var6.method370();
				} else if (field980 == 1536) {
					var6.method370();
				}

				Model[] var7 = new Model[] { var1, var6 };
				var1 = new Model(2, true, var7);

				if (field980 == 512) {
					var6.method370();
				} else if (field980 == 1024) {
					var6.method370();
					var6.method370();
				} else if (field980 == 1536) {
					var6.method370();
					var6.method370();
					var6.method370();
				}

				var6.method372(field1006 - field1426, field1007 - field1428, field1432 - field1427);
			}
		}

		var1.field1070 = true;
		return var1;
	}

	@ObfuscatedName("ZGNGQRPJ.a(LMFMVIYHT;I)V")
	public final void method574(Packet arg0) {
		arg0.pos = 0;
		field1437 = arg0.g1();
		field1438 = arg0.g1b();
		field1430 = arg0.g1b();
		field1439 = null;
		field1447 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				field1434[var2] = 0;
			} else {
				int var4 = arg0.g1();
				field1434[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1434[0] == 0xFFFF) {
					field1439 = NpcType.method477(arg0.g2());
					break;
				}

				if (field1434[var2] >= 512 && field1434[var2] - 512 < ObjType.field718) {
					int var5 = ObjType.method221(field1434[var2] - 512).field715;
					if (var5 != 0) {
						field1447 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.g1();
			if (var7 < 0 || var7 >= Client.field272[var6].length) {
				var7 = 0;
			}

			field1442[var6] = var7;
		}

		field1030 = arg0.g2();
		if (field1030 == 0xFFFF) {
			field1030 = -1;
		}

		field1031 = arg0.g2();
		if (field1031 == 0xFFFF) {
			field1031 = -1;
		}

		field1015 = arg0.g2();
		if (field1015 == 0xFFFF) {
			field1015 = -1;
		}

		field1016 = arg0.g2();
		if (field1016 == 0xFFFF) {
			field1016 = -1;
		}

		field1017 = arg0.g2();
		if (field1017 == 0xFFFF) {
			field1017 = -1;
		}

		field1018 = arg0.g2();
		if (field1018 == 0xFFFF) {
			field1018 = -1;
		}

		field1025 = arg0.g2();
		if (field1025 == 0xFFFF) {
			field1025 = -1;
		}

		field1433 = JString.method348(JString.method345(arg0.g8()));
		field1435 = arg0.g1();
		field1441 = arg0.g2();
		field1440 = true;
		field1436 = 0L;
		int var8 = field1434[5];
		int var9 = field1434[9];
		field1434[5] = var9;
		field1434[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1436 <<= 4;
			if (field1434[var10] >= 256) {
				field1436 += field1434[var10] - 256;
			}
		}

		if (field1434[0] >= 256) {
			field1436 += field1434[0] - 256 >> 4;
		}

		if (field1434[1] >= 256) {
			field1436 += field1434[1] - 256 >> 8;
		}

		field1434[5] = var8;
		field1434[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1436 <<= 3;
			field1436 += field1442[var11];
		}

		field1436 <<= 1;
		field1436 += field1437;
	}
}
