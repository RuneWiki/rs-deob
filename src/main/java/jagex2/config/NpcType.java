package jagex2.config;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.dash3d.AnimFrame;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("SLDUQHOR")
public final class NpcType {

	@ObfuscatedName("SLDUQHOR.a")
	public int field1230 = -1;

	@ObfuscatedName("SLDUQHOR.g")
	public int field1234 = -1;

	@ObfuscatedName("SLDUQHOR.h")
	public long field1235 = -1L;

	@ObfuscatedName("SLDUQHOR.j")
	public int field1237 = 128;

	@ObfuscatedName("SLDUQHOR.k")
	public boolean field1238 = true;

	@ObfuscatedName("SLDUQHOR.l")
	public int field1239 = 128;

	@ObfuscatedName("SLDUQHOR.m")
	public int field1240 = -1;

	@ObfuscatedName("SLDUQHOR.p")
	public boolean field1243 = true;

	@ObfuscatedName("SLDUQHOR.q")
	public int field1244 = -1;

	@ObfuscatedName("SLDUQHOR.r")
	public int field1245 = -1;

	@ObfuscatedName("SLDUQHOR.s")
	public int field1246 = -1;

	@ObfuscatedName("SLDUQHOR.u")
	public int field1247 = -1;

	@ObfuscatedName("SLDUQHOR.v")
	public byte field1248 = 1;

	@ObfuscatedName("SLDUQHOR.w")
	public int field1249 = -1;

	@ObfuscatedName("SLDUQHOR.x")
	public boolean field1250 = false;

	@ObfuscatedName("SLDUQHOR.y")
	public int field1251 = -1;

	@ObfuscatedName("SLDUQHOR.B")
	public int field1253 = -1;

	@ObfuscatedName("SLDUQHOR.E")
	public int field1256 = 32;

	@ObfuscatedName("SLDUQHOR.F")
	public String field1257 = "null";

	@ObfuscatedName("SLDUQHOR.H")
	public int field1258 = -1;

	@ObfuscatedName("SLDUQHOR.M")
	public int field1263 = -1;

	@ObfuscatedName("SLDUQHOR.o")
	public static LruCache field1242 = new LruCache(30);

	@ObfuscatedName("SLDUQHOR.C")
	public static int field1254;

	@ObfuscatedName("SLDUQHOR.L")
	public int field1262;

	@ObfuscatedName("SLDUQHOR.O")
	public static int field1265;

	@ObfuscatedName("SLDUQHOR.Q")
	public int field1266;

	@ObfuscatedName("SLDUQHOR.K")
	public static Packet field1261;

	@ObfuscatedName("SLDUQHOR.i")
	public static Client field1236;

	@ObfuscatedName("SLDUQHOR.N")
	public byte[] field1264;

	@ObfuscatedName("SLDUQHOR.b")
	public int[] field1231;

	@ObfuscatedName("SLDUQHOR.e")
	public int[] field1232;

	@ObfuscatedName("SLDUQHOR.f")
	public int[] field1233;

	@ObfuscatedName("SLDUQHOR.n")
	public int[] field1241;

	@ObfuscatedName("SLDUQHOR.D")
	public static int[] field1255;

	@ObfuscatedName("SLDUQHOR.J")
	public int[] field1260;

	@ObfuscatedName("SLDUQHOR.I")
	public static NpcType[] field1259;

	@ObfuscatedName("SLDUQHOR.z")
	public String[] field1252;

	@ObfuscatedName("SLDUQHOR.a(BLMFMVIYHT;)V")
	public final void method470(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.g1();
				field1233 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1233[var4] = arg0.g2();
				}
			} else if (var2 == 2) {
				field1257 = arg0.gjstr();
			} else if (var2 == 3) {
				field1264 = arg0.gjstrraw();
			} else if (var2 == 12) {
				field1248 = arg0.g1b();
			} else if (var2 == 13) {
				field1230 = arg0.g2();
			} else if (var2 == 14) {
				field1251 = arg0.g2();
			} else if (var2 == 17) {
				field1251 = arg0.g2();
				field1249 = arg0.g2();
				field1247 = arg0.g2();
				field1240 = arg0.g2();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1252 == null) {
					field1252 = new String[5];
				}

				field1252[var2 - 30] = arg0.gjstr();
				if (field1252[var2 - 30].equalsIgnoreCase("hidden")) {
					field1252[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.g1();
				field1241 = new int[var5];
				field1260 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1241[var6] = arg0.g2();
					field1260[var6] = arg0.g2();
				}
			} else if (var2 == 60) {
				int var7 = arg0.g1();
				field1232 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1232[var8] = arg0.g2();
				}
			} else if (var2 == 90) {
				field1253 = arg0.g2();
			} else if (var2 == 91) {
				field1234 = arg0.g2();
			} else if (var2 == 92) {
				field1244 = arg0.g2();
			} else if (var2 == 93) {
				field1243 = false;
			} else if (var2 == 95) {
				field1246 = arg0.g2();
			} else if (var2 == 97) {
				field1239 = arg0.g2();
			} else if (var2 == 98) {
				field1237 = arg0.g2();
			} else if (var2 == 99) {
				field1250 = true;
			} else if (var2 == 100) {
				field1266 = arg0.g1b();
			} else if (var2 == 101) {
				field1262 = arg0.g1b() * 5;
			} else if (var2 == 102) {
				field1245 = arg0.g2();
			} else if (var2 == 103) {
				field1256 = arg0.g2();
			} else if (var2 == 106) {
				field1258 = arg0.g2();
				if (field1258 == 0xFFFF) {
					field1258 = -1;
				}

				field1263 = arg0.g2();
				if (field1263 == 0xFFFF) {
					field1263 = -1;
				}

				int var9 = arg0.g1();
				field1231 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1231[var10] = arg0.g2();
					if (field1231[var10] == 0xFFFF) {
						field1231[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1238 = false;
			}
		}
	}

	@ObfuscatedName("SLDUQHOR.a(Z)V")
	public static final void method471() {
		field1242 = null;
		field1255 = null;
		field1259 = null;
		field1261 = null;
	}

	@ObfuscatedName("SLDUQHOR.a(I)LLZYQDKJV;")
	public final Model method472() {
		if (field1231 != null) {
			NpcType var1 = method476();
			if (var1 == null) {
				return null;
			}

			return var1.method472();
		} else if (field1232 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1232.length; var3++) {
				if (!Model.method360(field1232[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			Model[] var4 = new Model[field1232.length];
			for (int var5 = 0; var5 < field1232.length; var5++) {
				var4[var5] = Model.method359(field1232[var5]);
			}

			Model var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new Model(var4.length, var4);
			}

			if (field1241 != null) {
				for (int var7 = 0; var7 < field1241.length; var7++) {
					var6.method373(field1241[var7], field1260[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("SLDUQHOR.b(I)Z")
	public boolean method473() {
		if (field1231 == null) {
			return true;
		}

		int var1 = -1;
		if (field1258 != -1) {
			VarbitType var2 = VarbitType.field1502[field1258];
			int var3 = var2.field1504;
			int var4 = var2.field1505;
			int var5 = var2.field1506;
			int var6 = Client.field450[var5 - var4];
			var1 = field1236.field296[var3] >> var4 & var6;
		} else if (field1263 != -1) {
			var1 = field1236.field296[field1263];
		}

		if (var1 >= 0 && var1 < field1231.length && field1231[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("SLDUQHOR.a(LATJMVOZR;)V")
	public static final void method474(Jagfile arg0) {
		field1261 = new Packet(arg0.method2("npc.dat", null));
		Packet var1 = new Packet(arg0.method2("npc.idx", null));
		field1254 = var1.g2();
		field1255 = new int[field1254];
		int var2 = 2;
		for (int var3 = 0; var3 < field1254; var3++) {
			field1255[var3] = var2;
			var2 += var1.g2();
		}

		field1259 = new NpcType[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1259[var4] = new NpcType();
		}
	}

	@ObfuscatedName("SLDUQHOR.a(III[I)LLZYQDKJV;")
	public final Model method475(int arg0, int arg1, int[] arg2) {
		if (field1231 != null) {
			NpcType var4 = method476();
			if (var4 == null) {
				return null;
			}

			return var4.method475(arg0, arg1, arg2);
		}

		Model var5 = (Model) field1242.method458(field1235);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1233.length; var7++) {
				if (!Model.method360(field1233[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			Model[] var8 = new Model[field1233.length];
			for (int var9 = 0; var9 < field1233.length; var9++) {
				var8[var9] = Model.method359(field1233[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new Model(var8.length, var8);
			}

			if (field1241 != null) {
				for (int var10 = 0; var10 < field1241.length; var10++) {
					var5.method373(field1241[var10], field1260[var10]);
				}
			}

			var5.method366();
			var5.method376(field1266 + 64, field1262 + 850, -30, -50, -30, true);
			field1242.method459(var5, field1235);
		}

		Model var11 = Model.field1033;
		var11.method361(AnimFrame.method265(arg0) & AnimFrame.method265(arg1), var5);

		if (arg0 != -1 && arg1 != -1) {
			var11.method368(arg1, arg0, arg2);
		} else if (arg0 != -1) {
			var11.method367(arg0);
		}

		if (field1239 != 128 || field1237 != 128) {
			var11.method375(field1237, field1239, field1239);
		}

		var11.method363();
		var11.field1069 = null;
		var11.field1068 = null;

		if (field1248 == 1) {
			var11.field1070 = true;
		}

		return var11;
	}

	@ObfuscatedName("SLDUQHOR.b(Z)LSLDUQHOR;")
	public final NpcType method476() {
		int var1 = -1;
		if (field1258 != -1) {
			VarbitType var2 = VarbitType.field1502[field1258];
			int var3 = var2.field1504;
			int var4 = var2.field1505;
			int var5 = var2.field1506;
			int var6 = Client.field450[var5 - var4];
			var1 = field1236.field296[var3] >> var4 & var6;
		} else if (field1263 != -1) {
			var1 = field1236.field296[field1263];
		}

		if (var1 >= 0 && var1 < field1231.length && field1231[var1] != -1) {
			return method477(field1231[var1]);
		}

		return null;
	}

	@ObfuscatedName("SLDUQHOR.c(I)LSLDUQHOR;")
	public static final NpcType method477(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1259[var1].field1235) {
				return field1259[var1];
			}
		}

		field1265 = (field1265 + 1) % 20;
		NpcType var2 = field1259[field1265] = new NpcType();
		field1261.pos = field1255[arg0];
		var2.field1235 = arg0;
		var2.method470(field1261);
		return var2;
	}
}
