package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.dash3d.entity.Entity;
import jagex2.dash3d.type.Decor;
import jagex2.dash3d.type.Ground;
import jagex2.dash3d.type.GroundDecor;
import jagex2.dash3d.type.GroundObject;
import jagex2.dash3d.type.Location;
import jagex2.dash3d.type.TileOverlay;
import jagex2.dash3d.type.TileUnderlay;
import jagex2.dash3d.type.Wall;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Model;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;

@ObfuscatedName("s")
public class World3D {

	@ObfuscatedName("s.g")
	public static boolean field264 = true;

	@ObfuscatedName("s.h")
	public int field265;

	@ObfuscatedName("s.i")
	public int field266;

	@ObfuscatedName("s.j")
	public int field267;

	@ObfuscatedName("s.k")
	public int[][][] field268;

	@ObfuscatedName("s.l")
	public Ground[][][] field269;

	@ObfuscatedName("s.m")
	public int field270;

	@ObfuscatedName("s.n")
	public int field271;

	@ObfuscatedName("s.o")
	public Location[] field272 = new Location[5000];

	@ObfuscatedName("s.p")
	public int[][][] field273;

	@ObfuscatedName("s.q")
	public static int field274;

	@ObfuscatedName("s.r")
	public static int field275;

	@ObfuscatedName("s.s")
	public static int field276;

	@ObfuscatedName("s.t")
	public static int field277;

	@ObfuscatedName("s.u")
	public static int field278;

	@ObfuscatedName("s.v")
	public static int field279;

	@ObfuscatedName("s.w")
	public static int field280;

	@ObfuscatedName("s.x")
	public static int field281;

	@ObfuscatedName("s.y")
	public static int field282;

	@ObfuscatedName("s.z")
	public static int field283;

	@ObfuscatedName("s.ab")
	public static final int[] field310 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("s.bb")
	public static final int[] field311 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("s.cb")
	public static final int[] field312 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("s.db")
	public static final int[] field313 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("s.eb")
	public int[] field314 = new int[10000];

	@ObfuscatedName("s.fb")
	public int[] field315 = new int[10000];

	@ObfuscatedName("s.gb")
	public int field316;

	@ObfuscatedName("s.hb")
	public int[][] field317 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("s.ib")
	public int[][] field318 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("s.jb")
	public static boolean[][][][] field319 = new boolean[8][32][51][51];

	@ObfuscatedName("s.kb")
	public static boolean[][] field320;

	@ObfuscatedName("s.lb")
	public static int field321;

	@ObfuscatedName("s.mb")
	public static int field322;

	@ObfuscatedName("s.nb")
	public static int field323;

	@ObfuscatedName("s.ob")
	public static int field324;

	@ObfuscatedName("s.pb")
	public static int field325;

	@ObfuscatedName("s.qb")
	public static int field326;

	@ObfuscatedName("s.G")
	public static Location[] field290 = new Location[100];

	@ObfuscatedName("s.H")
	public static final int[] field291 = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("s.I")
	public static final int[] field292 = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("s.J")
	public static final int[] field293 = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("s.K")
	public static final int[] field294 = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("s.O")
	public static int field298 = -1;

	@ObfuscatedName("s.P")
	public static int field299 = -1;

	@ObfuscatedName("s.Q")
	public static int field300 = 4;

	@ObfuscatedName("s.U")
	public static Occlude[] field304 = new Occlude[500];

	@ObfuscatedName("s.V")
	public static LinkList field305 = new LinkList();

	@ObfuscatedName("s.W")
	public static final int[] field306 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("s.X")
	public static final int[] field307 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("s.Y")
	public static final int[] field308 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("s.Z")
	public static final int[] field309 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("s.R")
	public static int[] field301 = new int[field300];

	@ObfuscatedName("s.S")
	public static Occlude[][] field302 = new Occlude[field300][500];

	@ObfuscatedName("s.A")
	public static int field284;

	@ObfuscatedName("s.B")
	public static int field285;

	@ObfuscatedName("s.C")
	public static int field286;

	@ObfuscatedName("s.D")
	public static int field287;

	@ObfuscatedName("s.E")
	public static int field288;

	@ObfuscatedName("s.F")
	public static int field289;

	@ObfuscatedName("s.M")
	public static int field296;

	@ObfuscatedName("s.N")
	public static int field297;

	@ObfuscatedName("s.T")
	public static int field303;

	@ObfuscatedName("s.L")
	public static boolean field295;

	public World3D(int arg0, int[][][] arg1, int arg2, int arg3) {
		field265 = arg3;
		field266 = arg2;
		field267 = arg0;
		field269 = new Ground[arg3][arg2][arg0];
		field273 = new int[arg3][arg2 + 1][arg0 + 1];
		field268 = arg1;
		method63();
	}

	@ObfuscatedName("s.a(B)V")
	public static void method62() {
		field290 = null;
		field301 = null;
		field302 = null;
		field305 = null;
		field319 = null;
		field320 = null;
	}

	@ObfuscatedName("s.a(I)V")
	public void method63() {
		for (int var1 = 0; var1 < field265; var1++) {
			for (int var2 = 0; var2 < field266; var2++) {
				for (int var3 = 0; var3 < field267; var3++) {
					field269[var1][var2][var3] = null;
				}
			}
		}

		for (int var4 = 0; var4 < field300; var4++) {
			for (int var5 = 0; var5 < field301[var4]; var5++) {
				field302[var4][var5] = null;
			}

			field301[var4] = 0;
		}

		for (int var6 = 0; var6 < field271; var6++) {
			field272[var6] = null;
		}

		field271 = 0;

		for (int var7 = 0; var7 < field290.length; var7++) {
			field290[var7] = null;
		}
	}

	@ObfuscatedName("s.a(II)V")
	public void method64(int arg0) {
		field270 = arg0;

		for (int var2 = 0; var2 < field266; var2++) {
			for (int var3 = 0; var3 < field267; var3++) {
				field269[arg0][var2][var3] = new Ground(arg0, var2, var3);
			}
		}
	}

	@ObfuscatedName("s.a(ZII)V")
	public void method65(int arg0, int arg1) {
		Ground var3 = field269[0][arg1][arg0];

		for (int var4 = 0; var4 < 3; var4++) {
			field269[var4][arg1][arg0] = field269[var4 + 1][arg1][arg0];
			if (field269[var4][arg1][arg0] != null) {
				field269[var4][arg1][arg0].field339--;
			}
		}

		if (field269[0][arg1][arg0] == null) {
			field269[0][arg1][arg0] = new Ground(0, arg1, arg0);
		}

		field269[0][arg1][arg0].field361 = var3;
		field269[3][arg1][arg0] = null;
	}

	@ObfuscatedName("s.a(IIIIIIBII)V")
	public static void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.field212 = arg0 / 128;
		var8.field213 = arg5 / 128;
		var8.field214 = arg7 / 128;
		var8.field215 = arg3 / 128;
		var8.field216 = arg1;
		var8.field217 = arg0;
		var8.field218 = arg5;
		var8.field219 = arg7;
		var8.field220 = arg3;
		var8.field221 = arg6;
		var8.field222 = arg2;
		field302[arg4][field301[arg4]++] = var8;
	}

	@ObfuscatedName("s.a(IIII)V")
	public void method67(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = field269[arg0][arg1][arg2];
		if (var5 != null) {
			field269[arg0][arg1][arg2].field353 = arg3;
		}
	}

	@ObfuscatedName("s.a(IIIIIIIIIIIIIIIIIIII)V")
	public void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			TileUnderlay var21 = new TileUnderlay(arg10, arg11, arg12, arg13, -1, arg18, false);

			for (int var22 = arg0; var22 >= 0; var22--) {
				if (field269[var22][arg1][arg2] == null) {
					field269[var22][arg1][arg2] = new Ground(var22, arg1, arg2);
				}
			}

			field269[arg0][arg1][arg2].field343 = var21;
		} else if (arg3 == 1) {
			TileUnderlay var23 = new TileUnderlay(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);

			for (int var24 = arg0; var24 >= 0; var24--) {
				if (field269[var24][arg1][arg2] == null) {
					field269[var24][arg1][arg2] = new Ground(var24, arg1, arg2);
				}
			}

			field269[arg0][arg1][arg2].field343 = var23;
		} else {
			TileOverlay var25 = new TileOverlay(arg13, arg8, arg19, arg18, arg3, arg6, arg5, arg11, arg4, arg14, arg16, arg1, arg9, arg17, arg2, arg12, arg15, arg10, arg7);

			for (int var26 = arg0; var26 >= 0; var26--) {
				if (field269[var26][arg1][arg2] == null) {
					field269[var26][arg1][arg2] = new Ground(var26, arg1, arg2);
				}
			}

			field269[arg0][arg1][arg2].field344 = var25;
		}
	}

	@ObfuscatedName("s.a(IIIIIILy;B)V")
	public void method69(int arg0, int arg1, int arg2, int arg3, int arg4, Entity arg5, byte arg6) {
		if (arg5 != null) {
			GroundDecor var8 = new GroundDecor();
			var8.field184 = arg5;
			var8.field182 = arg2 * 128 + 64;
			var8.field183 = arg0 * 128 + 64;
			var8.field181 = arg4;
			var8.field185 = arg3;
			var8.field186 = arg6;

			if (field269[arg1][arg2][arg0] == null) {
				field269[arg1][arg2][arg0] = new Ground(arg1, arg2, arg0);
			}

			field269[arg1][arg2][arg0].field347 = var8;
		}
	}

	@ObfuscatedName("s.a(IZIIILy;Ly;ILy;)V")
	public void method70(int arg0, int arg1, int arg2, int arg3, Entity arg4, Entity arg5, int arg6, Entity arg7) {
		GroundObject var9 = new GroundObject();
		var9.field190 = arg5;
		var9.field188 = arg2 * 128 + 64;
		var9.field189 = arg3 * 128 + 64;
		var9.field187 = arg1;
		var9.field193 = arg0;
		var9.field191 = arg7;
		var9.field192 = arg4;
		int var10 = 0;
		Ground var11 = field269[arg6][arg2][arg3];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.field349; var12++) {
				if (var11.field350[var12].field245 instanceof Model) {
					int var13 = ((Model) var11.field350[var12].field245).field513;
					if (var13 > var10) {
						var10 = var13;
					}
				}
			}
		}

		var9.field194 = var10;

		if (field269[arg6][arg2][arg3] == null) {
			field269[arg6][arg2][arg3] = new Ground(arg6, arg2, arg3);
		}

		field269[arg6][arg2][arg3].field348 = var9;
	}

	@ObfuscatedName("s.a(IIIIZIILy;Ly;BI)V")
	public void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Entity arg6, Entity arg7, byte arg8, int arg9) {
		if (arg7 != null || arg6 != null) {
			Wall var11 = new Wall();
			var11.field262 = arg1;
			var11.field263 = arg8;
			var11.field256 = arg0 * 128 + 64;
			var11.field257 = arg9 * 128 + 64;
			var11.field255 = arg5;
			var11.field260 = arg7;
			var11.field261 = arg6;
			var11.field258 = arg4;
			var11.field259 = arg3;

			for (int var12 = arg2; var12 >= 0; var12--) {
				if (field269[var12][arg0][arg9] == null) {
					field269[var12][arg0][arg9] = new Ground(var12, arg0, arg9);
				}
			}

			field269[arg2][arg0][arg9].field345 = var11;
		}
	}

	@ObfuscatedName("s.a(BLy;IIIIIIIIII)V")
	public void method72(byte arg0, Entity arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (arg1 != null) {
			Decor var12 = new Decor();
			var12.field154 = arg10;
			var12.field155 = arg0;
			var12.field149 = arg3 * 128 + arg2 + 64;
			var12.field150 = arg4 * 128 + arg6 + 64;
			var12.field148 = arg9;
			var12.field153 = arg1;
			var12.field151 = arg5;
			var12.field152 = arg7;

			for (int var13 = arg8; var13 >= 0; var13--) {
				if (field269[var13][arg3][arg4] == null) {
					field269[var13][arg3][arg4] = new Ground(var13, arg3, arg4);
				}
			}

			field269[arg8][arg3][arg4].field346 = var12;
		}
	}

	@ObfuscatedName("s.a(BIIIIIIILy;II)Z")
	public boolean method73(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Entity arg7, int arg8, int arg9) {
		if (arg7 == null) {
			return true;
		} else {
			int var11 = arg2 * 128 + arg5 * 64;
			int var12 = arg8 * 64 + arg9 * 128;
			return method76(arg3, arg2, arg9, arg5, arg8, var11, var12, arg4, arg7, arg6, false, arg1, arg0);
		}
	}

	@ObfuscatedName("s.a(IZIIILy;IZII)Z")
	public boolean method74(int arg0, boolean arg1, int arg2, int arg3, int arg4, Entity arg5, int arg6, int arg7, int arg8) {
		if (arg5 == null) {
			return true;
		}

		int var10 = arg6 - arg0;
		int var11 = arg4 - arg0;
		int var12 = arg0 + arg6;
		int var13 = arg0 + arg4;
		if (arg1) {
			if (arg3 > 640 && arg3 < 1408) {
				var13 += 128;
			}

			if (arg3 > 1152 && arg3 < 1920) {
				var12 += 128;
			}

			if (arg3 > 1664 || arg3 < 384) {
				var11 -= 128;
			}

			if (arg3 > 128 && arg3 < 896) {
				var10 -= 128;
			}
		}

		var10 /= 128;
		var11 /= 128;
		var12 /= 128;
		var13 /= 128;
		return method76(arg8, var10, var11, var12 + 1 - var10, var13 - var11 + 1, arg6, arg4, arg2, arg5, arg3, true, arg7, (byte) 0);
	}

	@ObfuscatedName("s.a(ILy;IIIBIIIIIII)Z")
	public boolean method75(int arg0, Entity arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg1 == null) {
			return true;
		}

		return method76(arg0, arg8, arg11, arg3 + 1 - arg8, arg4 - arg11 + 1, arg7, arg2, arg5, arg1, arg6, true, arg10, (byte) 0);
	}

	@ObfuscatedName("s.a(IIIIIIIILy;IZIB)Z")
	public boolean method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Entity arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= field266 || var15 >= field267) {
					return false;
				}

				Ground var16 = field269[arg0][var14][var15];
				if (var16 != null && var16.field349 >= 5) {
					return false;
				}
			}
		}

		Location var17 = new Location();
		var17.field253 = arg11;
		var17.field254 = arg12;
		var17.field241 = arg0;
		var17.field243 = arg5;
		var17.field244 = arg6;
		var17.field242 = arg7;
		var17.field245 = arg8;
		var17.field246 = arg9;
		var17.field247 = arg1;
		var17.field249 = arg2;
		var17.field248 = arg1 + arg3 - 1;
		var17.field250 = arg2 + arg4 - 1;

		for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
			for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
				int var20 = 0;
				if (var18 > arg1) {
					var20++;
				}

				if (var18 < arg1 + arg3 - 1) {
					var20 += 4;
				}

				if (var19 > arg2) {
					var20 += 8;
				}

				if (var19 < arg2 + arg4 - 1) {
					var20 += 2;
				}

				for (int var21 = arg0; var21 >= 0; var21--) {
					if (field269[var21][var18][var19] == null) {
						field269[var21][var18][var19] = new Ground(var21, var18, var19);
					}
				}

				Ground var22 = field269[arg0][var18][var19];
				var22.field350[var22.field349] = var17;
				var22.field351[var22.field349] = var20;
				var22.field352 |= var20;
				var22.field349++;
			}
		}

		if (arg10) {
			field272[field271++] = var17;
		}

		return true;
	}

	@ObfuscatedName("s.b(B)V")
	public void method77() {
		for (int var1 = 0; var1 < field271; var1++) {
			Location var2 = field272[var1];
			method78(var2);
			field272[var1] = null;
		}

		field271 = 0;
	}

	@ObfuscatedName("s.a(ILq;)V")
	public void method78(Location arg0) {
		for (int var2 = arg0.field247; var2 <= arg0.field248; var2++) {
			for (int var3 = arg0.field249; var3 <= arg0.field250; var3++) {
				Ground var4 = field269[arg0.field241][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.field349; var5++) {
						if (var4.field350[var5] == arg0) {
							var4.field349--;
							for (int var6 = var5; var6 < var4.field349; var6++) {
								var4.field350[var6] = var4.field350[var6 + 1];
								var4.field351[var6] = var4.field351[var6 + 1];
							}

							var4.field350[var4.field349] = null;
							break;
						}
					}

					var4.field352 = 0;
					for (int var7 = 0; var7 < var4.field349; var7++) {
						var4.field352 |= var4.field351[var7];
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIIII)V")
	public void method79(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = field269[arg3][arg1][arg2];
		if (var5 != null) {
			Decor var6 = var5.field346;
			if (var6 != null) {
				int var7 = arg1 * 128 + 64;
				int var8 = arg2 * 128 + 64;
				var6.field149 = (var6.field149 - var7) * arg0 / 16 + var7;
				var6.field150 = (var6.field150 - var8) * arg0 / 16 + var8;
			}
		}
	}

	@ObfuscatedName("s.b(IIII)V")
	public void method80(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg1][arg0][arg2];
		if (var4 != null) {
			var4.field345 = null;
		}
	}

	@ObfuscatedName("s.a(IBII)V")
	public void method81(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg2][arg1][arg0];
		if (var4 != null) {
			var4.field346 = null;
		}
	}

	@ObfuscatedName("s.c(IIII)V")
	public void method82(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg2][arg0][arg1];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.field349; var5++) {
				Location var6 = var4.field350[var5];
				if ((var6.field253 >> 29 & 0x3) == 2 && var6.field247 == arg0 && var6.field249 == arg1) {
					method78(var6);
					return;
				}
			}
		}
	}

	@ObfuscatedName("s.d(IIII)V")
	public void method83(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg1][arg2][arg0];
		if (var4 != null) {
			var4.field347 = null;
		}
	}

	@ObfuscatedName("s.a(III)V")
	public void method84(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field348 = null;
		}
	}

	@ObfuscatedName("s.a(IIIZ)Lr;")
	public Wall method85(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg2][arg0][arg1];
		if (var4 == null) {
			return null;
		}

		return var4.field345;
	}

	@ObfuscatedName("s.e(IIII)Li;")
	public Decor method86(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg1][arg0][arg2];
		if (var4 == null) {
			return null;
		}

		return var4.field346;
	}

	@ObfuscatedName("s.f(IIII)Lq;")
	public Location method87(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg0][arg2][arg1];
		if (var4 == null) {
			return null;
		}

		for (int var5 = 0; var5 < var4.field349; var5++) {
			Location var6 = var4.field350[var5];
			if ((var6.field253 >> 29 & 0x3) == 2 && var6.field247 == arg2 && var6.field249 == arg1) {
				return var6;
			}
		}

		return null;
	}

	@ObfuscatedName("s.a(ZIII)Lk;")
	public GroundDecor method88(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg2][arg0][arg1];
		if (var4 != null && var4.field347 != null) {
			return var4.field347;
		}

		return null;
	}

	@ObfuscatedName("s.b(III)I")
	public int method89(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg0][arg1][arg2];
		if (var4 != null && var4.field345 != null) {
			return var4.field345.field262;
		}

		return 0;
	}

	@ObfuscatedName("s.g(IIII)I")
	public int method90(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg1][arg2][arg0];
		if (var4 != null && var4.field346 != null) {
			return var4.field346.field154;
		}

		return 0;
	}

	@ObfuscatedName("s.c(III)I")
	public int method91(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}

		for (int var5 = 0; var5 < var4.field349; var5++) {
			Location var6 = var4.field350[var5];
			if ((var6.field253 >> 29 & 0x3) == 2 && var6.field247 == arg1 && var6.field249 == arg2) {
				return var6.field253;
			}
		}

		return 0;
	}

	@ObfuscatedName("s.d(III)I")
	public int method92(int arg0, int arg1, int arg2) {
		Ground var4 = field269[arg0][arg1][arg2];
		if (var4 != null && var4.field347 != null) {
			return var4.field347.field185;
		}

		return 0;
	}

	@ObfuscatedName("s.h(IIII)I")
	public int method93(int arg0, int arg1, int arg2, int arg3) {
		Ground var5 = field269[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.field345 != null && var5.field345.field262 == arg3) {
			return var5.field345.field263 & 0xFF;
		} else if (var5.field346 != null && var5.field346.field154 == arg3) {
			return var5.field346.field155 & 0xFF;
		} else if (var5.field347 != null && var5.field347.field185 == arg3) {
			return var5.field347.field186 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.field349; var6++) {
				if (var5.field350[var6].field253 == arg3) {
					return var5.field350[var6].field254 & 0xFF;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("s.a(IIIIII)V")
	public void method94(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = (int) Math.sqrt(arg1 * arg1 + arg0 * arg0 + arg2 * arg2);
		int var7 = arg4 * var6 >> 8;
		for (int var8 = 0; var8 < field265; var8++) {
			for (int var9 = 0; var9 < field266; var9++) {
				for (int var10 = 0; var10 < field267; var10++) {
					Ground var11 = field269[var8][var9][var10];
					if (var11 != null) {
						Wall var12 = var11.field345;
						if (var12 != null && var12.field260 != null && var12.field260.field364 != null) {
							method96(var10, (Model) var12.field260, var9, var8, 1, 1);

							if (var12.field261 != null && var12.field261.field364 != null) {
								method96(var10, (Model) var12.field261, var9, var8, 1, 1);
								method97((Model) var12.field260, (Model) var12.field261, 0, 0, 0, false);
								((Model) var12.field261).method156(arg3, var7, arg2, arg0, arg1);
							}

							((Model) var12.field260).method156(arg3, var7, arg2, arg0, arg1);
						}

						for (int var13 = 0; var13 < var11.field349; var13++) {
							Location var14 = var11.field350[var13];
							if (var14 != null && var14.field245 != null && var14.field245.field364 != null) {
								method96(var10, (Model) var14.field245, var9, var8, var14.field248 + 1 - var14.field247, var14.field250 - var14.field249 + 1);
								((Model) var14.field245).method156(arg3, var7, arg2, arg0, arg1);
							}
						}

						GroundDecor var15 = var11.field347;
						if (var15 != null && var15.field184.field364 != null) {
							method95(var10, var8, var9, (Model) var15.field184);
							((Model) var15.field184).method156(arg3, var7, arg2, arg0, arg1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIIILfb;)V")
	public void method95(int arg0, int arg1, int arg2, Model arg3) {
		if (arg2 < field266) {
			Ground var5 = field269[arg1][arg2 + 1][arg0];
			if (var5 != null && var5.field347 != null && var5.field347.field184.field364 != null) {
				method97(arg3, (Model) var5.field347.field184, 128, 0, 0, true);
			}
		}

		if (arg0 < field266) {
			Ground var6 = field269[arg1][arg2][arg0 + 1];
			if (var6 != null && var6.field347 != null && var6.field347.field184.field364 != null) {
				method97(arg3, (Model) var6.field347.field184, 0, 0, 128, true);
			}
		}

		if (arg2 < field266 && arg0 < field267) {
			Ground var7 = field269[arg1][arg2 + 1][arg0 + 1];
			if (var7 != null && var7.field347 != null && var7.field347.field184.field364 != null) {
				method97(arg3, (Model) var7.field347.field184, 128, 0, 128, true);
			}
		}

		if (arg2 < field266 && arg0 > 0) {
			Ground var8 = field269[arg1][arg2 + 1][arg0 - 1];
			if (var8 != null && var8.field347 != null && var8.field347.field184.field364 != null) {
				method97(arg3, (Model) var8.field347.field184, 128, 0, -128, true);
				return;
			}
		}
	}

	@ObfuscatedName("s.a(IILfb;IIII)V")
	public void method96(int arg0, Model arg1, int arg2, int arg3, int arg4, int arg5) {
		boolean var7 = true;
		int var8 = arg2;
		int var9 = arg2 + arg4;
		int var10 = arg0 - 1;
		int var11 = arg0 + arg5;
		for (int var12 = arg3; var12 <= arg3 + 1; var12++) {
			if (field265 != var12) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < field266) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < field267 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg0 && arg2 != var13)) {
								Ground var15 = field269[var12][var13][var14];
								if (var15 != null) {
									int var16 = (field268[var12][var13 + 1][var14] + field268[var12][var13][var14] + field268[var12][var13][var14 + 1] + field268[var12][var13 + 1][var14 + 1]) / 4 - (field268[arg3][arg2 + 1][arg0] + field268[arg3][arg2][arg0] + field268[arg3][arg2][arg0 + 1] + field268[arg3][arg2 + 1][arg0 + 1]) / 4;
									Wall var17 = var15.field345;
									if (var17 != null && var17.field260 != null && var17.field260.field364 != null) {
										method97(arg1, (Model) var17.field260, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg0) * 128 + (1 - arg5) * 64, var7);
									}

									if (var17 != null && var17.field261 != null && var17.field261.field364 != null) {
										method97(arg1, (Model) var17.field261, (var13 - arg2) * 128 + (1 - arg4) * 64, var16, (var14 - arg0) * 128 + (1 - arg5) * 64, var7);
									}

									for (int var18 = 0; var18 < var15.field349; var18++) {
										Location var19 = var15.field350[var18];
										if (var19 != null && var19.field245 != null && var19.field245.field364 != null) {
											int var20 = var19.field248 + 1 - var19.field247;
											int var21 = var19.field250 + 1 - var19.field249;
											method97(arg1, (Model) var19.field245, (var19.field247 - arg2) * 128 + (var20 - arg4) * 64, var16, (var19.field249 - arg0) * 128 + (var21 - arg5) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				var8--;
				var7 = false;
			}
		}
	}

	@ObfuscatedName("s.a(Lfb;Lfb;IIIZ)V")
	public void method97(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		field316++;
		int var7 = 0;
		int[] var8 = arg1.field486;
		int var9 = arg1.field485;
		for (int var10 = 0; var10 < arg0.field485; var10++) {
			Model.VertexNormal var11 = arg0.field364[var10];
			Model.VertexNormal var12 = arg0.field519[var10];
			if (var12.field233 != 0) {
				int var13 = arg0.field487[var10] - arg3;
				if (var13 <= arg1.field510) {
					int var14 = arg0.field486[var10] - arg2;
					if (var14 >= arg1.field505 && var14 <= arg1.field506) {
						int var15 = arg0.field488[var10] - arg4;
						if (var15 >= arg1.field508 && var15 <= arg1.field507) {
							for (int var16 = 0; var16 < var9; var16++) {
								Model.VertexNormal var17 = arg1.field364[var16];
								Model.VertexNormal var18 = arg1.field519[var16];
								if (var8[var16] == var14 && arg1.field488[var16] == var15 && arg1.field487[var16] == var13 && var18.field233 != 0) {
									var11.field230 += var18.field230;
									var11.field231 += var18.field231;
									var11.field232 += var18.field232;
									var11.field233 += var18.field233;
									var17.field230 += var12.field230;
									var17.field231 += var12.field231;
									var17.field232 += var12.field232;
									var17.field233 += var12.field233;
									var7++;
									field314[var10] = field316;
									field315[var16] = field316;
								}
							}
						}
					}
				}
			}
		}

		if (var7 >= 3 && arg5) {
			for (int var19 = 0; var19 < arg0.field489; var19++) {
				if (field314[arg0.field490[var19]] == field316 && field314[arg0.field491[var19]] == field316 && field314[arg0.field492[var19]] == field316) {
					arg0.field496[var19] = -1;
				}
			}

			for (int var20 = 0; var20 < arg1.field489; var20++) {
				if (field315[arg1.field490[var20]] == field316 && field315[arg1.field491[var20]] == field316 && field315[arg1.field492[var20]] == field316) {
					arg1.field496[var20] = -1;
				}
			}
		}
	}

	@ObfuscatedName("s.a([IIIIII)V")
	public void method98(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Ground var7 = field269[arg3][arg4][arg5];
		if (var7 != null) {
			TileUnderlay var8 = var7.field343;
			if (var8 == null) {
				TileOverlay var11 = var7.field344;
				if (var11 != null) {
					int var12 = var11.field167;
					int var13 = var11.field168;
					int var14 = var11.field169;
					int var15 = var11.field170;
					int[] var16 = field317[var12];
					int[] var17 = field318[var13];
					int var18 = 0;
					if (var14 == 0) {
						for (int var20 = 0; var20 < 4; var20++) {
							if (var16[var17[var18++]] != 0) {
								arg0[arg1] = var15;
							}

							if (var16[var17[var18++]] != 0) {
								arg0[arg1 + 1] = var15;
							}

							if (var16[var17[var18++]] != 0) {
								arg0[arg1 + 2] = var15;
							}

							if (var16[var17[var18++]] != 0) {
								arg0[arg1 + 3] = var15;
							}

							arg1 += arg2;
						}
					} else {
						for (int var19 = 0; var19 < 4; var19++) {
							arg0[arg1] = var16[var17[var18++]] == 0 ? var14 : var15;
							arg0[arg1 + 1] = var16[var17[var18++]] == 0 ? var14 : var15;
							arg0[arg1 + 2] = var16[var17[var18++]] == 0 ? var14 : var15;
							arg0[arg1 + 3] = var16[var17[var18++]] == 0 ? var14 : var15;
							arg1 += arg2;
						}
					}
				}
			} else {
				int var9 = var8.field240;
				if (var9 != 0) {
					for (int var10 = 0; var10 < 4; var10++) {
						arg0[arg1] = var9;
						arg0[arg1 + 1] = var9;
						arg0[arg1 + 2] = var9;
						arg0[arg1 + 3] = var9;
						arg1 += arg2;
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIBII[I)V")
	public static void method99(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
		field323 = 0;
		field324 = 0;
		field325 = arg3;
		field326 = arg1;
		field321 = arg3 / 2;
		field322 = arg1 / 2;
		boolean[][][][] var5 = new boolean[9][32][53][53];
		for (int var6 = 128; var6 <= 384; var6 += 32) {
			for (int var7 = 0; var7 < 2048; var7 += 64) {
				field286 = Model.field548[var6];
				field287 = Model.field549[var6];
				field288 = Model.field548[var7];
				field289 = Model.field549[var7];
				int var8 = (var6 - 128) / 32;
				int var9 = var7 / 64;
				for (int var10 = -26; var10 <= 26; var10++) {
					for (int var11 = -26; var11 <= 26; var11++) {
						int var12 = var10 * 128;
						int var13 = var11 * 128;
						boolean var14 = false;
						for (int var15 = -arg2; var15 <= arg0; var15 += 128) {
							if (method100(var13, arg4[var8] + var15, var12)) {
								var14 = true;
								break;
							}
						}

						var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
					}
				}
			}
		}

		for (int var16 = 0; var16 < 8; var16++) {
			for (int var17 = 0; var17 < 32; var17++) {
				for (int var18 = -25; var18 < 25; var18++) {
					for (int var19 = -25; var19 < 25; var19++) {
						boolean var20 = false;
						label76: for (int var21 = -1; var21 <= 1; var21++) {
							for (int var22 = -1; var22 <= 1; var22++) {
								if (var5[var16][var17][var18 + var21 + 25 + 1][var19 + var22 + 25 + 1]) {
									var20 = true;
									break label76;
								}

								if (var5[var16][(var17 + 1) % 31][var18 + var21 + 25 + 1][var19 + var22 + 25 + 1]) {
									var20 = true;
									break label76;
								}

								if (var5[var16 + 1][var17][var18 + var21 + 25 + 1][var19 + var22 + 25 + 1]) {
									var20 = true;
									break label76;
								}

								if (var5[var16 + 1][(var17 + 1) % 31][var18 + var21 + 25 + 1][var19 + var22 + 25 + 1]) {
									var20 = true;
									break label76;
								}
							}
						}

						field319[var16][var17][var18 + 25][var19 + 25] = var20;
					}
				}
			}
		}
	}

	@ObfuscatedName("s.i(IIII)Z")
	public static boolean method100(int arg0, int arg1, int arg2) {
		int var3 = field289 * arg2 + field288 * arg0 >> 16;
		int var4 = field289 * arg0 - field288 * arg2 >> 16;
		int var5 = field287 * var4 + field286 * arg1 >> 16;
		int var6 = field287 * arg1 - field286 * var4 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = (var3 << 9) / var5 + field321;
			int var8 = (var6 << 9) / var5 + field322;
			if (var7 >= field323 && var7 <= field325 && var8 >= field324 && var8 <= field326) {
				return true;
			}

			return false;
		}

		return false;
	}

	@ObfuscatedName("s.a(BII)V")
	public void method101(int arg0, int arg1) {
		field295 = true;
		field296 = arg1;
		field297 = arg0;
		field298 = -1;
		field299 = -1;
	}

	@ObfuscatedName("s.a(IIIIIII)V")
	public void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= field266 * 128) {
			arg0 = field266 * 128 - 1;
		}

		if (arg4 < 0) {
			arg4 = 0;
		} else if (arg4 >= field267 * 128) {
			arg4 = field267 * 128 - 1;
		}

		field276++;
		field286 = Model.field548[arg3];
		field287 = Model.field549[arg3];
		field288 = Model.field548[arg2];
		field289 = Model.field549[arg2];
		field320 = field319[(arg3 - 128) / 32][arg2 / 64];
		field283 = arg0;
		field284 = arg5;
		field285 = arg4;
		field281 = arg0 / 128;
		field282 = arg4 / 128;
		field275 = arg1;
		field277 = field281 - 25;
		if (field277 < 0) {
			field277 = 0;
		}

		field279 = field282 - 25;
		if (field279 < 0) {
			field279 = 0;
		}

		field278 = field281 + 25;
		if (field278 > field266) {
			field278 = field266;
		}

		field280 = field282 + 25;
		if (field280 > field267) {
			field280 = field267;
		}

		method108();
		field274 = 0;
		for (int var7 = field270; var7 < field265; var7++) {
			Ground[][] var8 = field269[var7];
			for (int var9 = field277; var9 < field278; var9++) {
				for (int var10 = field279; var10 < field280; var10++) {
					Ground var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field353 <= arg1 && (field320[var9 + 25 - field281][var10 + 25 - field282] || field268[var7][var9][var10] - arg5 >= 2000)) {
							var11.field354 = true;
							var11.field355 = true;

							if (var11.field349 > 0) {
								var11.field356 = true;
							} else {
								var11.field356 = false;
							}

							field274++;
						} else {
							var11.field354 = false;
							var11.field355 = false;
							var11.field357 = 0;
						}
					}
				}
			}
		}

		for (int var12 = field270; var12 < field265; var12++) {
			Ground[][] var13 = field269[var12];
			for (int var14 = -25; var14 <= 0; var14++) {
				int var15 = field281 + var14;
				int var16 = field281 - var14;
				if (var15 >= field277 || var16 < field278) {
					for (int var17 = -25; var17 <= 0; var17++) {
						int var18 = field282 + var17;
						int var19 = field282 - var17;
						if (var15 >= field277) {
							if (var18 >= field279) {
								Ground var20 = var13[var15][var18];
								if (var20 != null && var20.field354) {
									method103(var20, true);
								}
							}

							if (var19 < field280) {
								Ground var21 = var13[var15][var19];
								if (var21 != null && var21.field354) {
									method103(var21, true);
								}
							}
						}

						if (var16 < field278) {
							if (var18 >= field279) {
								Ground var22 = var13[var16][var18];
								if (var22 != null && var22.field354) {
									method103(var22, true);
								}
							}

							if (var19 < field280) {
								Ground var23 = var13[var16][var19];
								if (var23 != null && var23.field354) {
									method103(var23, true);
								}
							}
						}

						if (field274 == 0) {
							field295 = false;
							return;
						}
					}
				}
			}
		}

		for (int var24 = field270; var24 < field265; var24++) {
			Ground[][] var25 = field269[var24];
			for (int var26 = -25; var26 <= 0; var26++) {
				int var27 = field281 + var26;
				int var28 = field281 - var26;
				if (var27 >= field277 || var28 < field278) {
					for (int var29 = -25; var29 <= 0; var29++) {
						int var30 = field282 + var29;
						int var31 = field282 - var29;
						if (var27 >= field277) {
							if (var30 >= field279) {
								Ground var32 = var25[var27][var30];
								if (var32 != null && var32.field354) {
									method103(var32, false);
								}
							}

							if (var31 < field280) {
								Ground var33 = var25[var27][var31];
								if (var33 != null && var33.field354) {
									method103(var33, false);
								}
							}
						}

						if (var28 < field278) {
							if (var30 >= field279) {
								Ground var34 = var25[var28][var30];
								if (var34 != null && var34.field354) {
									method103(var34, false);
								}
							}

							if (var31 < field280) {
								Ground var35 = var25[var28][var31];
								if (var35 != null && var35.field354) {
									method103(var35, false);
								}
							}
						}

						if (field274 == 0) {
							field295 = false;
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lw;Z)V")
	public void method103(Ground arg0, boolean arg1) {
		field305.method254(arg0);

		while (true) {
			Ground var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Ground[][] var8;
			Ground var66;
			do {
				Ground var65;
				do {
					Ground var64;
					do {
						Ground var63;
						while (true) {
							do {
								while (true) {
									while (true) {
										do {
											var3 = (Ground) field305.method256();
											if (var3 == null) {
												return;
											}
										} while (!var3.field355);

										var4 = var3.field340;
										var5 = var3.field341;
										var6 = var3.field339;
										var7 = var3.field342;
										var8 = field269[var6];

										if (!var3.field354) {
											break;
										}

										if (arg1) {
											if (var6 > 0) {
												Ground var9 = field269[var6 - 1][var4][var5];
												if (var9 != null && var9.field355) {
													continue;
												}
											}

											if (var4 <= field281 && var4 > field277) {
												Ground var10 = var8[var4 - 1][var5];
												if (var10 != null && var10.field355 && (var10.field354 || (var3.field352 & 0x1) == 0)) {
													continue;
												}
											}

											if (var4 >= field281 && var4 < field278 - 1) {
												Ground var11 = var8[var4 + 1][var5];
												if (var11 != null && var11.field355 && (var11.field354 || (var3.field352 & 0x4) == 0)) {
													continue;
												}
											}

											if (var5 <= field282 && var5 > field279) {
												Ground var12 = var8[var4][var5 - 1];
												if (var12 != null && var12.field355 && (var12.field354 || (var3.field352 & 0x8) == 0)) {
													continue;
												}
											}

											if (var5 >= field282 && var5 < field280 - 1) {
												Ground var13 = var8[var4][var5 + 1];
												if (var13 != null && var13.field355 && (var13.field354 || (var3.field352 & 0x2) == 0)) {
													continue;
												}
											}
										} else {
											arg1 = true;
										}

										var3.field354 = false;

										if (var3.field361 != null) {
											Ground var14 = var3.field361;
											if (var14.field343 == null) {
												if (var14.field344 != null && !method109(0, var4, var5)) {
													method105(var4, field286, field288, field289, var14.field344, field287, var5);
												}
											} else if (!method109(0, var4, var5)) {
												method104(var14.field343, 0, field286, field287, field288, field289, var4, var5);
											}

											Wall var15 = var14.field345;
											if (var15 != null) {
												var15.field260.method121(0, field286, field287, field288, field289, var15.field256 - field283, var15.field255 - field284, var15.field257 - field285, var15.field262);
											}

											for (int var16 = 0; var16 < var14.field349; var16++) {
												Location var17 = var14.field350[var16];
												if (var17 != null) {
													var17.field245.method121(var17.field246, field286, field287, field288, field289, var17.field243 - field283, var17.field242 - field284, var17.field244 - field285, var17.field253);
												}
											}
										}

										boolean var18 = false;
										if (var3.field343 == null) {
											if (var3.field344 != null && !method109(var7, var4, var5)) {
												var18 = true;
												method105(var4, field286, field288, field289, var3.field344, field287, var5);
											}
										} else if (!method109(var7, var4, var5)) {
											var18 = true;
											method104(var3.field343, var7, field286, field287, field288, field289, var4, var5);
										}

										int var19 = 0;
										int var20 = 0;
										Wall var21 = var3.field345;
										Decor var22 = var3.field346;
										if (var21 != null || var22 != null) {
											if (field281 == var4) {
												var19++;
											} else if (field281 < var4) {
												var19 += 2;
											}

											if (field282 == var5) {
												var19 += 3;
											} else if (field282 > var5) {
												var19 += 6;
											}

											var20 = field306[var19];
											var3.field360 = field308[var19];
										}

										if (var21 != null) {
											if ((var21.field258 & field307[var19]) == 0) {
												var3.field357 = 0;
											} else if (var21.field258 == 16) {
												var3.field357 = 3;
												var3.field358 = field309[var19];
												var3.field359 = 3 - var3.field358;
											} else if (var21.field258 == 32) {
												var3.field357 = 6;
												var3.field358 = field310[var19];
												var3.field359 = 6 - var3.field358;
											} else if (var21.field258 == 64) {
												var3.field357 = 12;
												var3.field358 = field311[var19];
												var3.field359 = 12 - var3.field358;
											} else {
												var3.field357 = 9;
												var3.field358 = field312[var19];
												var3.field359 = 9 - var3.field358;
											}

											if ((var21.field258 & var20) != 0 && !method110(var7, var4, var5, var21.field258)) {
												var21.field260.method121(0, field286, field287, field288, field289, var21.field256 - field283, var21.field255 - field284, var21.field257 - field285, var21.field262);
											}

											if ((var21.field259 & var20) != 0 && !method110(var7, var4, var5, var21.field259)) {
												var21.field261.method121(0, field286, field287, field288, field289, var21.field256 - field283, var21.field255 - field284, var21.field257 - field285, var21.field262);
											}
										}

										if (var22 != null && !method111(var7, var4, var5, var22.field153.field365)) {
											if ((var22.field151 & var20) != 0) {
												var22.field153.method121(var22.field152, field286, field287, field288, field289, var22.field149 - field283, var22.field148 - field284, var22.field150 - field285, var22.field154);
											} else if ((var22.field151 & 0x300) != 0) {
												int var23 = var22.field149 - field283;
												int var24 = var22.field148 - field284;
												int var25 = var22.field150 - field285;
												int var26 = var22.field152;
												int var27;
												if (var26 == 1 || var26 == 2) {
													var27 = -var23;
												} else {
													var27 = var23;
												}

												int var28;
												if (var26 == 2 || var26 == 3) {
													var28 = -var25;
												} else {
													var28 = var25;
												}

												if ((var22.field151 & 0x100) != 0 && var28 < var27) {
													int var29 = field291[var26] + var23;
													int var30 = field292[var26] + var25;
													var22.field153.method121(var26 * 512 + 256, field286, field287, field288, field289, var29, var24, var30, var22.field154);
												}

												if ((var22.field151 & 0x200) != 0 && var28 > var27) {
													int var31 = field293[var26] + var23;
													int var32 = field294[var26] + var25;
													var22.field153.method121(var26 * 512 + 1280 & 0x7FF, field286, field287, field288, field289, var31, var24, var32, var22.field154);
												}
											}
										}

										if (var18) {
											GroundDecor var33 = var3.field347;
											if (var33 != null) {
												var33.field184.method121(0, field286, field287, field288, field289, var33.field182 - field283, var33.field181 - field284, var33.field183 - field285, var33.field185);
											}

											GroundObject var34 = var3.field348;
											if (var34 != null && var34.field194 == 0) {
												if (var34.field191 != null) {
													var34.field191.method121(0, field286, field287, field288, field289, var34.field188 - field283, var34.field187 - field284, var34.field189 - field285, var34.field193);
												}

												if (var34.field192 != null) {
													var34.field192.method121(0, field286, field287, field288, field289, var34.field188 - field283, var34.field187 - field284, var34.field189 - field285, var34.field193);
												}

												if (var34.field190 != null) {
													var34.field190.method121(0, field286, field287, field288, field289, var34.field188 - field283, var34.field187 - field284, var34.field189 - field285, var34.field193);
												}
											}
										}

										int var35 = var3.field352;
										if (var35 == 0) {
											break;
										}

										if (var4 < field281 && (var35 & 0x4) != 0) {
											Ground var36 = var8[var4 + 1][var5];
											if (var36 != null && var36.field355) {
												field305.method254(var36);
											}
										}

										if (var5 < field282 && (var35 & 0x2) != 0) {
											Ground var37 = var8[var4][var5 + 1];
											if (var37 != null && var37.field355) {
												field305.method254(var37);
											}
										}

										if (var4 > field281 && (var35 & 0x1) != 0) {
											Ground var38 = var8[var4 - 1][var5];
											if (var38 != null && var38.field355) {
												field305.method254(var38);
											}
										}

										if (var5 <= field282 || (var35 & 0x8) == 0) {
											break;
										}

										Ground var39 = var8[var4][var5 - 1];
										if (var39 == null || !var39.field355) {
											break;
										}

										field305.method254(var39);
										break;
									}

									if (var3.field357 != 0) {
										boolean var40 = true;
										for (int var41 = 0; var41 < var3.field349; var41++) {
											if (field276 != var3.field350[var41].field252 && (var3.field351[var41] & var3.field357) == var3.field358) {
												var40 = false;
												break;
											}
										}

										if (var40) {
											Wall var42 = var3.field345;
											if (!method110(var7, var4, var5, var42.field258)) {
												var42.field260.method121(0, field286, field287, field288, field289, var42.field256 - field283, var42.field255 - field284, var42.field257 - field285, var42.field262);
											}

											var3.field357 = 0;
										}
									}

									if (!var3.field356) {
										break;
									}

									int var43 = var3.field349;
									var3.field356 = false;
									int var44 = 0;
									label551: for (int var45 = 0; var45 < var43; var45++) {
										Location var46 = var3.field350[var45];
										if (field276 != var46.field252) {
											for (int var47 = var46.field247; var47 <= var46.field248; var47++) {
												for (int var48 = var46.field249; var48 <= var46.field250; var48++) {
													Ground var49 = var8[var47][var48];
													if (var49.field354) {
														var3.field356 = true;
														continue label551;
													}

													if (var49.field357 != 0) {
														int var50 = 0;
														if (var47 > var46.field247) {
															var50++;
														}

														if (var47 < var46.field248) {
															var50 += 4;
														}

														if (var48 > var46.field249) {
															var50 += 8;
														}

														if (var48 < var46.field250) {
															var50 += 2;
														}

														if ((var50 & var49.field357) == var3.field359) {
															var3.field356 = true;
															continue label551;
														}
													}
												}
											}

											field290[var44++] = var46;
											int var51 = field281 - var46.field247;
											int var52 = var46.field248 - field281;
											if (var52 > var51) {
												var51 = var52;
											}

											int var53 = field282 - var46.field249;
											int var54 = var46.field250 - field282;
											if (var54 > var53) {
												var46.field251 = var51 + var54;
											} else {
												var46.field251 = var51 + var53;
											}
										}
									}

									while (var44 > 0) {
										int var55 = -50;
										int var56 = -1;
										for (int var57 = 0; var57 < var44; var57++) {
											Location var58 = field290[var57];
											if (var58.field251 > var55 && field276 != var58.field252) {
												var55 = var58.field251;
												var56 = var57;
											}
										}

										if (var56 == -1) {
											break;
										}

										Location var59 = field290[var56];
										var59.field252 = field276;

										if (!method112(var7, var59.field247, var59.field248, var59.field249, var59.field250, var59.field245.field365)) {
											var59.field245.method121(var59.field246, field286, field287, field288, field289, var59.field243 - field283, var59.field242 - field284, var59.field244 - field285, var59.field253);
										}

										for (int var60 = var59.field247; var60 <= var59.field248; var60++) {
											for (int var61 = var59.field249; var61 <= var59.field250; var61++) {
												Ground var62 = var8[var60][var61];
												if (var62.field357 != 0) {
													field305.method254(var62);
												} else if ((var4 != var60 || var5 != var61) && var62.field355) {
													field305.method254(var62);
												}
											}
										}
									}

									if (!var3.field356) {
										break;
									}
								}
							} while (!var3.field355);

							if (var3.field357 == 0) {
								if (var4 > field281 || var4 <= field277) {
									break;
								}

								var63 = var8[var4 - 1][var5];
								if (var63 == null || !var63.field355) {
									break;
								}
							}
						}

						if (var4 < field281 || var4 >= field278 - 1) {
							break;
						}

						var64 = var8[var4 + 1][var5];
					} while (var64 != null && var64.field355);

					if (var5 > field282 || var5 <= field279) {
						break;
					}

					var65 = var8[var4][var5 - 1];
				} while (var65 != null && var65.field355);

				if (var5 < field282 || var5 >= field280 - 1) {
					break;
				}

				var66 = var8[var4][var5 + 1];
			} while (var66 != null && var66.field355);

			var3.field355 = false;
			field274--;
			GroundObject var67 = var3.field348;
			if (var67 != null && var67.field194 != 0) {
				if (var67.field191 != null) {
					var67.field191.method121(0, field286, field287, field288, field289, var67.field188 - field283, var67.field187 - field284 - var67.field194, var67.field189 - field285, var67.field193);
				}

				if (var67.field192 != null) {
					var67.field192.method121(0, field286, field287, field288, field289, var67.field188 - field283, var67.field187 - field284 - var67.field194, var67.field189 - field285, var67.field193);
				}

				if (var67.field190 != null) {
					var67.field190.method121(0, field286, field287, field288, field289, var67.field188 - field283, var67.field187 - field284 - var67.field194, var67.field189 - field285, var67.field193);
				}
			}

			if (var3.field360 != 0) {
				Decor var68 = var3.field346;
				if (var68 != null && !method111(var7, var4, var5, var68.field153.field365)) {
					if ((var68.field151 & var3.field360) != 0) {
						var68.field153.method121(var68.field152, field286, field287, field288, field289, var68.field149 - field283, var68.field148 - field284, var68.field150 - field285, var68.field154);
					} else if ((var68.field151 & 0x300) != 0) {
						int var69 = var68.field149 - field283;
						int var70 = var68.field148 - field284;
						int var71 = var68.field150 - field285;
						int var72 = var68.field152;
						int var73;
						if (var72 == 1 || var72 == 2) {
							var73 = -var69;
						} else {
							var73 = var69;
						}

						int var74;
						if (var72 == 2 || var72 == 3) {
							var74 = -var71;
						} else {
							var74 = var71;
						}

						if ((var68.field151 & 0x100) != 0 && var74 >= var73) {
							int var75 = field291[var72] + var69;
							int var76 = field292[var72] + var71;
							var68.field153.method121(var72 * 512 + 256, field286, field287, field288, field289, var75, var70, var76, var68.field154);
						}

						if ((var68.field151 & 0x200) != 0 && var74 <= var73) {
							int var77 = field293[var72] + var69;
							int var78 = field294[var72] + var71;
							var68.field153.method121(var72 * 512 + 1280 & 0x7FF, field286, field287, field288, field289, var77, var70, var78, var68.field154);
						}
					}
				}

				Wall var79 = var3.field345;
				if (var79 != null) {
					if ((var79.field259 & var3.field360) != 0 && !method110(var7, var4, var5, var79.field259)) {
						var79.field261.method121(0, field286, field287, field288, field289, var79.field256 - field283, var79.field255 - field284, var79.field257 - field285, var79.field262);
					}

					if ((var79.field258 & var3.field360) != 0 && !method110(var7, var4, var5, var79.field258)) {
						var79.field260.method121(0, field286, field287, field288, field289, var79.field256 - field283, var79.field255 - field284, var79.field257 - field285, var79.field262);
					}
				}
			}

			if (var6 < field265 - 1) {
				Ground var80 = field269[var6 + 1][var4][var5];
				if (var80 != null && var80.field355) {
					field305.method254(var80);
				}
			}

			if (var4 < field281) {
				Ground var81 = var8[var4 + 1][var5];
				if (var81 != null && var81.field355) {
					field305.method254(var81);
				}
			}

			if (var5 < field282) {
				Ground var82 = var8[var4][var5 + 1];
				if (var82 != null && var82.field355) {
					field305.method254(var82);
				}
			}

			if (var4 > field281) {
				Ground var83 = var8[var4 - 1][var5];
				if (var83 != null && var83.field355) {
					field305.method254(var83);
				}
			}

			if (var5 > field282) {
				Ground var84 = var8[var4][var5 - 1];
				if (var84 != null && var84.field355) {
					field305.method254(var84);
				}
			}
		}
	}

	@ObfuscatedName("s.a(Lp;IIIIIII)V")
	public void method104(TileUnderlay arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - field283;
		int var11;
		int var12 = var11 = (arg7 << 7) - field285;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = field268[arg1][arg6][arg7] - field284;
		int var18 = field268[arg1][arg6 + 1][arg7] - field284;
		int var19 = field268[arg1][arg6 + 1][arg7 + 1] - field284;
		int var20 = field268[arg1][arg6][arg7 + 1] - field284;
		int var21 = arg4 * var12 + arg5 * var10 >> 16;
		var12 = arg5 * var12 - arg4 * var10 >> 16;
		int var23 = arg3 * var17 - arg2 * var12 >> 16;
		var12 = arg2 * var17 + arg3 * var12 >> 16;
		if (var12 >= 50) {
			int var25 = arg4 * var11 + arg5 * var14 >> 16;
			var11 = arg5 * var11 - arg4 * var14 >> 16;
			int var27 = arg3 * var18 - arg2 * var11 >> 16;
			var11 = arg2 * var18 + arg3 * var11 >> 16;
			if (var11 >= 50) {
				int var29 = arg4 * var16 + arg5 * var13 >> 16;
				var16 = arg5 * var16 - arg4 * var13 >> 16;
				int var31 = arg3 * var19 - arg2 * var16 >> 16;
				var16 = arg2 * var19 + arg3 * var16 >> 16;
				if (var16 >= 50) {
					int var33 = arg4 * var15 + arg5 * var9 >> 16;
					var15 = arg5 * var15 - arg4 * var9 >> 16;
					int var35 = arg3 * var20 - arg2 * var15 >> 16;
					var15 = arg2 * var20 + arg3 * var15 >> 16;
					if (var15 >= 50) {
						int var37 = (var21 << 9) / var12 + Pix3D.field576;
						int var38 = (var23 << 9) / var12 + Pix3D.field577;
						int var39 = (var25 << 9) / var11 + Pix3D.field576;
						int var40 = (var27 << 9) / var11 + Pix3D.field577;
						int var41 = (var29 << 9) / var16 + Pix3D.field576;
						int var42 = (var31 << 9) / var16 + Pix3D.field577;
						int var43 = (var33 << 9) / var15 + Pix3D.field576;
						int var44 = (var35 << 9) / var15 + Pix3D.field577;
						Pix3D.field575 = 0;

						if ((var40 - var44) * (var41 - var43) - (var39 - var43) * (var42 - var44) > 0) {
							Pix3D.field572 = false;
							if (var41 < 0 || var43 < 0 || var39 < 0 || var41 > Pix2D.field568 || var43 > Pix2D.field568 || var39 > Pix2D.field568) {
								Pix3D.field572 = true;
							}

							if (field295 && method107(field296, field297, var42, var44, var40, var41, var43, var39)) {
								field298 = arg6;
								field299 = arg7;
							}

							if (arg0.field238 == -1) {
								if (arg0.field236 != 12345678) {
									Pix3D.method187(var42, var44, var40, var41, var43, var39, arg0.field236, arg0.field237, arg0.field235);
								}
							} else if (field264) {
								int var45 = field313[arg0.field238];
								Pix3D.method187(var42, var44, var40, var41, var43, var39, method106(arg0.field236, var45), method106(arg0.field237, var45), method106(arg0.field235, var45));
							} else if (arg0.field239) {
								Pix3D.method191(var42, var44, var40, var41, var43, var39, arg0.field236, arg0.field237, arg0.field235, var21, var25, var33, var23, var27, var35, var12, var11, var15, arg0.field238);
							} else {
								Pix3D.method191(var42, var44, var40, var41, var43, var39, arg0.field236, arg0.field237, arg0.field235, var29, var33, var25, var31, var35, var27, var16, var15, var11, arg0.field238);
							}
						}

						if ((var37 - var39) * (var44 - var40) - (var38 - var40) * (var43 - var39) > 0) {
							Pix3D.field572 = false;
							if (var37 < 0 || var39 < 0 || var43 < 0 || var37 > Pix2D.field568 || var39 > Pix2D.field568 || var43 > Pix2D.field568) {
								Pix3D.field572 = true;
							}

							if (field295 && method107(field296, field297, var38, var40, var44, var37, var39, var43)) {
								field298 = arg6;
								field299 = arg7;
							}

							if (arg0.field238 != -1) {
								if (!field264) {
									Pix3D.method191(var38, var40, var44, var37, var39, var43, arg0.field234, arg0.field235, arg0.field237, var21, var25, var33, var23, var27, var35, var12, var11, var15, arg0.field238);
									return;
								}

								int var46 = field313[arg0.field238];
								Pix3D.method187(var38, var40, var44, var37, var39, var43, method106(arg0.field234, var46), method106(arg0.field235, var46), method106(arg0.field237, var46));
							} else if (arg0.field234 != 12345678) {
								Pix3D.method187(var38, var40, var44, var37, var39, var43, arg0.field234, arg0.field235, arg0.field237);
								return;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.a(IIIILj;III)V")
	public void method105(int arg0, int arg1, int arg2, int arg3, TileOverlay arg4, int arg5, int arg6) {
		int var8 = arg4.field156.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg4.field156[var9] - field283;
			int var11 = arg4.field157[var9] - field284;
			int var12 = arg4.field158[var9] - field285;
			int var13 = arg2 * var12 + arg3 * var10 >> 16;
			var12 = arg3 * var12 - arg2 * var10 >> 16;
			int var15 = arg5 * var11 - arg1 * var12 >> 16;
			var12 = arg1 * var11 + arg5 * var12 >> 16;
			if (var12 < 50) {
				return;
			}

			if (arg4.field165 != null) {
				TileOverlay.field173[var9] = var13;
				TileOverlay.field174[var9] = var15;
				TileOverlay.field175[var9] = var12;
			}

			TileOverlay.field171[var9] = (var13 << 9) / var12 + Pix3D.field576;
			TileOverlay.field172[var9] = (var15 << 9) / var12 + Pix3D.field577;
		}

		Pix3D.field575 = 0;
		int var17 = arg4.field162.length;
		for (int var18 = 0; var18 < var17; var18++) {
			int var19 = arg4.field162[var18];
			int var20 = arg4.field163[var18];
			int var21 = arg4.field164[var18];
			int var22 = TileOverlay.field171[var19];
			int var23 = TileOverlay.field171[var20];
			int var24 = TileOverlay.field171[var21];
			int var25 = TileOverlay.field172[var19];
			int var26 = TileOverlay.field172[var20];
			int var27 = TileOverlay.field172[var21];
			if ((var22 - var23) * (var27 - var26) - (var24 - var23) * (var25 - var26) > 0) {
				Pix3D.field572 = false;
				if (var22 < 0 || var23 < 0 || var24 < 0 || var22 > Pix2D.field568 || var23 > Pix2D.field568 || var24 > Pix2D.field568) {
					Pix3D.field572 = true;
				}

				if (field295 && method107(field296, field297, var25, var26, var27, var22, var23, var24)) {
					field298 = arg0;
					field299 = arg6;
				}

				if (arg4.field165 == null || arg4.field165[var18] == -1) {
					if (arg4.field159[var18] != 12345678) {
						Pix3D.method187(var25, var26, var27, var22, var23, var24, arg4.field159[var18], arg4.field160[var18], arg4.field161[var18]);
					}
				} else if (field264) {
					int var28 = field313[arg4.field165[var18]];
					Pix3D.method187(var25, var26, var27, var22, var23, var24, method106(arg4.field159[var18], var28), method106(arg4.field160[var18], var28), method106(arg4.field161[var18], var28));
				} else if (arg4.field166) {
					Pix3D.method191(var25, var26, var27, var22, var23, var24, arg4.field159[var18], arg4.field160[var18], arg4.field161[var18], TileOverlay.field173[0], TileOverlay.field173[1], TileOverlay.field173[3], TileOverlay.field174[0], TileOverlay.field174[1], TileOverlay.field174[3], TileOverlay.field175[0], TileOverlay.field175[1], TileOverlay.field175[3], arg4.field165[var18]);
				} else {
					Pix3D.method191(var25, var26, var27, var22, var23, var24, arg4.field159[var18], arg4.field160[var18], arg4.field161[var18], TileOverlay.field173[var19], TileOverlay.field173[var20], TileOverlay.field173[var21], TileOverlay.field174[var19], TileOverlay.field174[var20], TileOverlay.field174[var21], TileOverlay.field175[var19], TileOverlay.field175[var20], TileOverlay.field175[var21], arg4.field165[var18]);
				}
			}
		}
	}

	@ObfuscatedName("s.e(III)I")
	public int method106(int arg0, int arg1) {
		arg0 = 127 - arg0;
		arg0 = (arg1 & 0x7F) * arg0 / 160;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}

		return (arg1 & 0xFF80) + arg0;
	}

	@ObfuscatedName("s.a(IIIIIIII)Z")
	public boolean method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			int var9 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			int var10 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			int var11 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			if (var9 * var11 > 0 && var10 * var11 > 0) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("s.b(I)V")
	public void method108() {
		int var1 = field301[field275];
		Occlude[] var2 = field302[field275];
		field303 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			Occlude var4 = var2[var3];
			if (var4.field216 == 1) {
				int var5 = var4.field212 + 25 - field281;
				if (var5 >= 0 && var5 <= 50) {
					int var6 = var4.field214 + 25 - field282;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = var4.field215 + 25 - field282;
					if (var7 > 50) {
						var7 = 50;
					}

					boolean var8 = false;
					while (var6 <= var7) {
						if (field320[var5][var6++]) {
							var8 = true;
							break;
						}
					}

					if (var8) {
						int var9 = field283 - var4.field217;
						if (var9 > 32) {
							var4.field223 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field223 = 2;
							var9 = -var9;
						}

						var4.field226 = (var4.field219 - field285 << 8) / var9;
						var4.field227 = (var4.field220 - field285 << 8) / var9;
						var4.field228 = (var4.field221 - field284 << 8) / var9;
						var4.field229 = (var4.field222 - field284 << 8) / var9;
						field304[field303++] = var4;
					}
				}
			} else if (var4.field216 == 2) {
				int var10 = var4.field214 + 25 - field282;
				if (var10 >= 0 && var10 <= 50) {
					int var11 = var4.field212 + 25 - field281;
					if (var11 < 0) {
						var11 = 0;
					}

					int var12 = var4.field213 + 25 - field281;
					if (var12 > 50) {
						var12 = 50;
					}

					boolean var13 = false;
					while (var11 <= var12) {
						if (field320[var11++][var10]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						int var14 = field285 - var4.field219;
						if (var14 > 32) {
							var4.field223 = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}

							var4.field223 = 4;
							var14 = -var14;
						}

						var4.field224 = (var4.field217 - field283 << 8) / var14;
						var4.field225 = (var4.field218 - field283 << 8) / var14;
						var4.field228 = (var4.field221 - field284 << 8) / var14;
						var4.field229 = (var4.field222 - field284 << 8) / var14;
						field304[field303++] = var4;
					}
				}
			} else if (var4.field216 == 4) {
				int var15 = var4.field221 - field284;
				if (var15 > 128) {
					int var16 = var4.field214 + 25 - field282;
					if (var16 < 0) {
						var16 = 0;
					}

					int var17 = var4.field215 + 25 - field282;
					if (var17 > 50) {
						var17 = 50;
					}

					if (var16 <= var17) {
						int var18 = var4.field212 + 25 - field281;
						if (var18 < 0) {
							var18 = 0;
						}

						int var19 = var4.field213 + 25 - field281;
						if (var19 > 50) {
							var19 = 50;
						}

						boolean var20 = false;
						label142: for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (field320[var21][var22]) {
									var20 = true;
									break label142;
								}
							}
						}

						if (var20) {
							var4.field223 = 5;
							var4.field224 = (var4.field217 - field283 << 8) / var15;
							var4.field225 = (var4.field218 - field283 << 8) / var15;
							var4.field226 = (var4.field219 - field285 << 8) / var15;
							var4.field227 = (var4.field220 - field285 << 8) / var15;
							field304[field303++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s.f(III)Z")
	public boolean method109(int arg0, int arg1, int arg2) {
		int var4 = field273[arg0][arg1][arg2];
		if (-field276 == var4) {
			return false;
		} else if (field276 == var4) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (method113(var5 + 1, field268[arg0][arg1][arg2], var6 + 1) && method113(var5 + 128 - 1, field268[arg0][arg1 + 1][arg2], var6 + 1) && method113(var5 + 128 - 1, field268[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && method113(var5 + 1, field268[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				field273[arg0][arg1][arg2] = field276;
				return true;
			} else {
				field273[arg0][arg1][arg2] = -field276;
				return false;
			}
		}
	}

	@ObfuscatedName("s.j(IIII)Z")
	public boolean method110(int arg0, int arg1, int arg2, int arg3) {
		if (!method109(arg0, arg1, arg2)) {
			return false;
		}

		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = field268[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;

		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > field283) {
					if (!method113(var5, var7, var6)) {
						return false;
					}

					if (!method113(var5, var7, var6 + 128)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!method113(var5, var8, var6)) {
						return false;
					}

					if (!method113(var5, var8, var6 + 128)) {
						return false;
					}
				}

				if (!method113(var5, var9, var6)) {
					return false;
				}

				if (!method113(var5, var9, var6 + 128)) {
					return false;
				}

				return true;
			}

			if (arg3 == 2) {
				if (var6 < field285) {
					if (!method113(var5, var7, var6 + 128)) {
						return false;
					}

					if (!method113(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!method113(var5, var8, var6 + 128)) {
						return false;
					}

					if (!method113(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}

				if (!method113(var5, var9, var6 + 128)) {
					return false;
				}

				if (!method113(var5 + 128, var9, var6 + 128)) {
					return false;
				}

				return true;
			}

			if (arg3 == 4) {
				if (var5 < field283) {
					if (!method113(var5 + 128, var7, var6)) {
						return false;
					}

					if (!method113(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!method113(var5 + 128, var8, var6)) {
						return false;
					}

					if (!method113(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}

				if (!method113(var5 + 128, var9, var6)) {
					return false;
				}

				if (!method113(var5 + 128, var9, var6 + 128)) {
					return false;
				}

				return true;
			}

			if (arg3 == 8) {
				if (var6 > field285) {
					if (!method113(var5, var7, var6)) {
						return false;
					}

					if (!method113(var5 + 128, var7, var6)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!method113(var5, var8, var6)) {
						return false;
					}

					if (!method113(var5 + 128, var8, var6)) {
						return false;
					}
				}

				if (!method113(var5, var9, var6)) {
					return false;
				}

				if (!method113(var5 + 128, var9, var6)) {
					return false;
				}

				return true;
			}
		}

		if (!method113(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			if (!method113(var5, var9, var6 + 128)) {
				return false;
			}

			return true;
		} else if (arg3 == 32) {
			if (!method113(var5 + 128, var9, var6 + 128)) {
				return false;
			}

			return true;
		} else if (arg3 == 64) {
			if (!method113(var5 + 128, var9, var6)) {
				return false;
			}

			return true;
		} else if (arg3 == 128) {
			if (!method113(var5, var9, var6)) {
				return false;
			}

			return true;
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("s.k(IIII)Z")
	public boolean method111(int arg0, int arg1, int arg2, int arg3) {
		if (!method109(arg0, arg1, arg2)) {
			return false;
		}

		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		if (method113(var5 + 1, field268[arg0][arg1][arg2] - arg3, var6 + 1) && method113(var5 + 128 - 1, field268[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && method113(var5 + 128 - 1, field268[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && method113(var5 + 1, field268[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("s.b(IIIIII)Z")
	public boolean method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (field273[arg0][var9][var10] == -field276) {
						return false;
					}
				}
			}

			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = field268[arg0][arg1][arg3] - arg5;
			if (!method113(var11, var13, var12)) {
				return false;
			}

			int var14 = (arg2 << 7) - 1;
			if (!method113(var14, var13, var12)) {
				return false;
			}

			int var15 = (arg4 << 7) - 1;
			if (!method113(var11, var13, var15)) {
				return false;
			}

			if (!method113(var14, var13, var15)) {
				return false;
			}

			return true;
		}

		if (method109(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			if (method113(var7 + 1, field268[arg0][arg1][arg3] - arg5, var8 + 1) && method113(var7 + 128 - 1, field268[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && method113(var7 + 128 - 1, field268[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && method113(var7 + 1, field268[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1)) {
				return true;
			}

			return false;
		}

		return false;
	}

	@ObfuscatedName("s.g(III)Z")
	public boolean method113(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field303; var4++) {
			Occlude var5 = field304[var4];
			if (var5.field223 == 1) {
				int var6 = var5.field217 - arg0;
				if (var6 > 0) {
					int var7 = (var5.field226 * var6 >> 8) + var5.field219;
					int var8 = (var5.field227 * var6 >> 8) + var5.field220;
					int var9 = (var5.field228 * var6 >> 8) + var5.field221;
					int var10 = (var5.field229 * var6 >> 8) + var5.field222;
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.field223 == 2) {
				int var11 = arg0 - var5.field217;
				if (var11 > 0) {
					int var12 = (var5.field226 * var11 >> 8) + var5.field219;
					int var13 = (var5.field227 * var11 >> 8) + var5.field220;
					int var14 = (var5.field228 * var11 >> 8) + var5.field221;
					int var15 = (var5.field229 * var11 >> 8) + var5.field222;
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.field223 == 3) {
				int var16 = var5.field219 - arg2;
				if (var16 > 0) {
					int var17 = (var5.field224 * var16 >> 8) + var5.field217;
					int var18 = (var5.field225 * var16 >> 8) + var5.field218;
					int var19 = (var5.field228 * var16 >> 8) + var5.field221;
					int var20 = (var5.field229 * var16 >> 8) + var5.field222;
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.field223 == 4) {
				int var21 = arg2 - var5.field219;
				if (var21 > 0) {
					int var22 = (var5.field224 * var21 >> 8) + var5.field217;
					int var23 = (var5.field225 * var21 >> 8) + var5.field218;
					int var24 = (var5.field228 * var21 >> 8) + var5.field221;
					int var25 = (var5.field229 * var21 >> 8) + var5.field222;
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.field223 == 5) {
				int var26 = arg1 - var5.field221;
				if (var26 > 0) {
					int var27 = (var5.field224 * var26 >> 8) + var5.field217;
					int var28 = (var5.field225 * var26 >> 8) + var5.field218;
					int var29 = (var5.field226 * var26 >> 8) + var5.field219;
					int var30 = (var5.field227 * var26 >> 8) + var5.field220;
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}

		return false;
	}
}
