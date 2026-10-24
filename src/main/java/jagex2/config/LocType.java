package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.Jagfile;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("YMYTDPVW")
public final class LocType {

	@ObfuscatedName("YMYTDPVW.p")
	public int field1393 = -1;

	@ObfuscatedName("YMYTDPVW.s")
	public String field1395 = "null";

	@ObfuscatedName("YMYTDPVW.e")
	public static LruCache field1383 = new LruCache(40);

	@ObfuscatedName("YMYTDPVW.n")
	public static Model[] field1391 = new Model[4];

	@ObfuscatedName("YMYTDPVW.v")
	public static LruCache field1398 = new LruCache(500);

	@ObfuscatedName("YMYTDPVW.A")
	public byte field1403;

	@ObfuscatedName("YMYTDPVW.D")
	public byte field1405;

	@ObfuscatedName("YMYTDPVW.c")
	public int field1381;

	@ObfuscatedName("YMYTDPVW.d")
	public int field1382;

	@ObfuscatedName("YMYTDPVW.g")
	public int field1385;

	@ObfuscatedName("YMYTDPVW.i")
	public int field1387;

	@ObfuscatedName("YMYTDPVW.r")
	public int field1394;

	@ObfuscatedName("YMYTDPVW.t")
	public static int field1396;

	@ObfuscatedName("YMYTDPVW.u")
	public int field1397;

	@ObfuscatedName("YMYTDPVW.w")
	public int field1399;

	@ObfuscatedName("YMYTDPVW.x")
	public int field1400;

	@ObfuscatedName("YMYTDPVW.B")
	public int field1404;

	@ObfuscatedName("YMYTDPVW.K")
	public int field1410;

	@ObfuscatedName("YMYTDPVW.L")
	public int field1411;

	@ObfuscatedName("YMYTDPVW.M")
	public int field1412;

	@ObfuscatedName("YMYTDPVW.R")
	public int field1416;

	@ObfuscatedName("YMYTDPVW.S")
	public int field1417;

	@ObfuscatedName("YMYTDPVW.T")
	public int field1418;

	@ObfuscatedName("YMYTDPVW.W")
	public int field1421;

	@ObfuscatedName("YMYTDPVW.Y")
	public static int field1423;

	@ObfuscatedName("YMYTDPVW.j")
	public static Packet field1388;

	@ObfuscatedName("YMYTDPVW.m")
	public static Client field1390;

	@ObfuscatedName("YMYTDPVW.b")
	public boolean field1380;

	@ObfuscatedName("YMYTDPVW.h")
	public boolean field1386;

	@ObfuscatedName("YMYTDPVW.l")
	public boolean field1389;

	@ObfuscatedName("YMYTDPVW.o")
	public static boolean field1392;

	@ObfuscatedName("YMYTDPVW.H")
	public boolean field1408;

	@ObfuscatedName("YMYTDPVW.N")
	public boolean field1413;

	@ObfuscatedName("YMYTDPVW.O")
	public boolean field1414;

	@ObfuscatedName("YMYTDPVW.U")
	public boolean field1419;

	@ObfuscatedName("YMYTDPVW.X")
	public boolean field1422;

	@ObfuscatedName("YMYTDPVW.Z")
	public boolean field1424;

	@ObfuscatedName("YMYTDPVW.ab")
	public boolean field1425;

	@ObfuscatedName("YMYTDPVW.z")
	public byte[] field1402;

	@ObfuscatedName("YMYTDPVW.a")
	public static int[] field1379;

	@ObfuscatedName("YMYTDPVW.f")
	public int[] field1384;

	@ObfuscatedName("YMYTDPVW.F")
	public int[] field1406;

	@ObfuscatedName("YMYTDPVW.I")
	public int[] field1409;

	@ObfuscatedName("YMYTDPVW.P")
	public int[] field1415;

	@ObfuscatedName("YMYTDPVW.V")
	public int[] field1420;

	@ObfuscatedName("YMYTDPVW.y")
	public static LocType[] field1401;

	@ObfuscatedName("YMYTDPVW.G")
	public String[] field1407;

	@ObfuscatedName("YMYTDPVW.a(I)LYMYTDPVW;")
	public static final LocType method561(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1401[var1].field1393 == arg0) {
				return field1401[var1];
			}
		}

		field1396 = (field1396 + 1) % 20;
		LocType var2 = field1401[field1396];
		field1388.pos = field1379[arg0];
		var2.field1393 = arg0;
		var2.method567();
		var2.method568(field1388);
		return var2;
	}

	@ObfuscatedName("YMYTDPVW.b(I)LYMYTDPVW;")
	public final LocType method562() {
		int var1 = -1;
		if (field1397 != -1) {
			VarbitType var2 = VarbitType.field1502[field1397];
			int var3 = var2.field1504;
			int var4 = var2.field1505;
			int var5 = var2.field1506;
			int var6 = Client.field450[var5 - var4];
			var1 = field1390.field296[var3] >> var4 & var6;
		} else if (field1400 != -1) {
			var1 = field1390.field296[field1400];
		}

		if (var1 >= 0 && var1 < field1420.length && field1420[var1] != -1) {
			return method561(field1420[var1]);
		}

		return null;
	}

	@ObfuscatedName("YMYTDPVW.a(LZPGPWCCV;I)V")
	public final void method563(OnDemand arg0) {
		if (field1384 != null) {
			for (int var2 = 0; var2 < field1384.length; var2++) {
				arg0.method594(field1384[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("YMYTDPVW.a(LATJMVOZR;)V")
	public static final void method564(Jagfile arg0) {
		field1388 = new Packet(arg0.method2("loc.dat", null));
		Packet var1 = new Packet(arg0.method2("loc.idx", null));
		field1423 = var1.g2();
		field1379 = new int[field1423];
		int var2 = 2;
		for (int var3 = 0; var3 < field1423; var3++) {
			field1379[var3] = var2;
			var2 += var1.g2();
		}

		field1401 = new LocType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1401[var4] = new LocType();
		}
	}

	@ObfuscatedName("YMYTDPVW.a(IIII)LLZYQDKJV;")
	public final Model method565(int arg0, int arg1, int arg2) {
		Model var4 = null;
		long var5;
		if (field1406 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1393 << 6) + arg0);
			Model var7 = (Model) field1383.method458(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1384 == null) {
				return null;
			}

			boolean var8 = field1414 ^ arg0 > 3;
			int var9 = field1384.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1384[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (Model) field1398.method458(var11);
				if (var4 == null) {
					var4 = Model.method359(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method374();
					}

					field1398.method459(var4, var11);
				}

				if (var9 > 1) {
					field1391[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new Model(var9, field1391);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1406.length; var13++) {
				if (field1406[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1393 << 6) + (var12 << 3) + arg0);
			Model var14 = (Model) field1383.method458(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1384[var12];
			boolean var16 = field1414 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (Model) field1398.method458(var15);
			if (var4 == null) {
				var4 = Model.method359(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method374();
				}

				field1398.method459(var4, var15);
			}
		}

		boolean var17;
		if (field1399 == 128 && field1381 == 128 && field1412 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1382 == 0 && field1404 == 0 && field1387 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		Model var19 = new Model(arg0 == 0 && arg1 == -1 && !var17 && !var18, field1415 == null, var4, AnimFrame.method265(arg1));
		if (arg1 != -1) {
			var19.method366();
			var19.method367(arg1);
			var19.field1069 = null;
			var19.field1068 = null;
		}

		while (arg0-- > 0) {
			var19.method370();
		}

		if (field1415 != null) {
			for (int var20 = 0; var20 < field1415.length; var20++) {
				var19.method373(field1415[var20], field1409[var20]);
			}
		}

		if (var17) {
			var19.method375(field1381, field1412, field1399);
		}

		if (var18) {
			var19.method372(field1382, field1387, field1404);
		}

		var19.method376(field1403 + 64, field1405 * 5 + 768, -50, -10, -50, !field1419);

		if (field1410 == 1) {
			var19.field1065 = var19.field1461;
		}

		field1383.method459(var19, var5);
		return var19;
	}

	@ObfuscatedName("YMYTDPVW.c(I)Z")
	public final boolean method566() {
		if (field1384 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1384.length; var2++) {
			var1 &= Model.method360(field1384[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("YMYTDPVW.a()V")
	public final void method567() {
		field1384 = null;
		field1406 = null;
		field1395 = "null";
		field1402 = null;
		field1415 = null;
		field1409 = null;
		field1416 = 1;
		field1394 = 1;
		field1425 = true;
		field1424 = true;
		field1380 = false;
		field1389 = false;
		field1419 = false;
		field1413 = false;
		field1418 = -1;
		field1417 = 16;
		field1403 = 0;
		field1405 = 0;
		field1407 = null;
		field1421 = -1;
		field1411 = -1;
		field1414 = false;
		field1422 = true;
		field1399 = 128;
		field1381 = 128;
		field1412 = 128;
		field1385 = 0;
		field1382 = 0;
		field1404 = 0;
		field1387 = 0;
		field1386 = false;
		field1408 = false;
		field1410 = -1;
		field1397 = -1;
		field1400 = -1;
		field1420 = null;
	}

	@ObfuscatedName("YMYTDPVW.a(BLMFMVIYHT;)V")
	public final void method568(Packet arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.g1();
					if (var3 == 0) {
						if (var2 == -1) {
							field1380 = false;
							if (field1384 != null && (field1406 == null || field1406[0] == 10)) {
								field1380 = true;
							}

							if (field1407 != null) {
								field1380 = true;
							}
						}

						if (field1408) {
							field1425 = false;
							field1424 = false;
						}

						if (field1410 == -1) {
							field1410 = field1425 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1395 = arg0.gjstr();
					} else if (var3 == 3) {
						field1402 = arg0.gjstrraw();
					} else if (var3 == 5) {
						int var6 = arg0.g1();
						if (var6 > 0) {
							if (field1384 == null || field1392) {
								field1406 = null;
								field1384 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1384[var7] = arg0.g2();
								}
							} else {
								arg0.pos += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1416 = arg0.g1();
					} else if (var3 == 15) {
						field1394 = arg0.g1();
					} else if (var3 == 17) {
						field1425 = false;
					} else if (var3 == 18) {
						field1424 = false;
					} else if (var3 == 19) {
						var2 = arg0.g1();
						if (var2 == 1) {
							field1380 = true;
						}
					} else if (var3 == 21) {
						field1389 = true;
					} else if (var3 == 22) {
						field1419 = true;
					} else if (var3 == 23) {
						field1413 = true;
					} else if (var3 == 24) {
						field1418 = arg0.g2();
						if (field1418 == 0xFFFF) {
							field1418 = -1;
						}
					} else if (var3 == 28) {
						field1417 = arg0.g1();
					} else if (var3 == 29) {
						field1403 = arg0.g1b();
					} else if (var3 == 39) {
						field1405 = arg0.g1b();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1407 == null) {
							field1407 = new String[5];
						}

						field1407[var3 - 30] = arg0.gjstr();
						if (field1407[var3 - 30].equalsIgnoreCase("hidden")) {
							field1407[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.g1();
						field1415 = new int[var8];
						field1409 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1415[var9] = arg0.g2();
							field1409[var9] = arg0.g2();
						}
					} else if (var3 == 60) {
						field1421 = arg0.g2();
					} else if (var3 == 62) {
						field1414 = true;
					} else if (var3 == 64) {
						field1422 = false;
					} else if (var3 == 65) {
						field1399 = arg0.g2();
					} else if (var3 == 66) {
						field1381 = arg0.g2();
					} else if (var3 == 67) {
						field1412 = arg0.g2();
					} else if (var3 == 68) {
						field1411 = arg0.g2();
					} else if (var3 == 69) {
						field1385 = arg0.g1();
					} else if (var3 == 70) {
						field1382 = arg0.g2b();
					} else if (var3 == 71) {
						field1404 = arg0.g2b();
					} else if (var3 == 72) {
						field1387 = arg0.g2b();
					} else if (var3 == 73) {
						field1386 = true;
					} else if (var3 == 74) {
						field1408 = true;
					} else if (var3 == 75) {
						field1410 = arg0.g1();
					} else if (var3 == 77) {
						field1397 = arg0.g2();
						if (field1397 == 0xFFFF) {
							field1397 = -1;
						}

						field1400 = arg0.g2();
						if (field1400 == 0xFFFF) {
							field1400 = -1;
						}

						int var10 = arg0.g1();
						field1420 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1420[var11] = arg0.g2();
							if (field1420[var11] == 0xFFFF) {
								field1420[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.g1();
			} while (var4 <= 0);

			if (field1384 == null || field1392) {
				field1406 = new int[var4];
				field1384 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1384[var5] = arg0.g2();
					field1406[var5] = arg0.g1();
				}
			} else {
				arg0.pos += var4 * 3;
			}
		}
	}

	@ObfuscatedName("YMYTDPVW.a(IIIIIII)LLZYQDKJV;")
	public final Model method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		Model var8 = method565(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field1389 || field1419) {
			var8 = new Model(field1389, field1419, var8);
		}

		if (field1389) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1038; var10++) {
				int var11 = var8.field1039[var10];
				int var12 = var8.field1041[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1040[var10] += var15 - var9;
			}

			var8.method364();
		}

		return var8;
	}

	@ObfuscatedName("YMYTDPVW.a(II)Z")
	public final boolean method570(int arg0) {
		if (field1406 != null) {
			for (int var4 = 0; var4 < field1406.length; var4++) {
				if (field1406[var4] == arg0) {
					return Model.method360(field1384[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1384 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1384.length; var3++) {
				var2 &= Model.method360(field1384[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("YMYTDPVW.a(Z)V")
	public static final void method571() {
		field1398 = null;
		field1383 = null;
		field1379 = null;
		field1401 = null;
		field1388 = null;
	}
}
