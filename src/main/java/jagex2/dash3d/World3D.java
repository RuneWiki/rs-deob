package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;

@ObfuscatedName("KJCMXHNO")
public class World3D {

	@ObfuscatedName("KJCMXHNO.u")
	public Sprite[] field883 = new Sprite[5000];

	@ObfuscatedName("KJCMXHNO.kb")
	public int[] field925 = new int[10000];

	@ObfuscatedName("KJCMXHNO.lb")
	public int[] field926 = new int[10000];

	@ObfuscatedName("KJCMXHNO.nb")
	public int[][] field928 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("KJCMXHNO.ob")
	public int[][] field929 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("KJCMXHNO.n")
	public int field876;

	@ObfuscatedName("KJCMXHNO.o")
	public int field877;

	@ObfuscatedName("KJCMXHNO.p")
	public int field878;

	@ObfuscatedName("KJCMXHNO.r")
	public Square[][][] field880;

	@ObfuscatedName("KJCMXHNO.v")
	public int[][][] field884;

	@ObfuscatedName("KJCMXHNO.q")
	public int[][][] field879;

	@ObfuscatedName("KJCMXHNO.m")
	public static boolean field875 = true;

	@ObfuscatedName("KJCMXHNO.M")
	public static Sprite[] field901 = new Sprite[100];

	@ObfuscatedName("KJCMXHNO.N")
	public static final int[] field902 = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("KJCMXHNO.O")
	public static final int[] field903 = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("KJCMXHNO.P")
	public static final int[] field904 = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("KJCMXHNO.Q")
	public static final int[] field905 = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("KJCMXHNO.U")
	public static int field909 = -1;

	@ObfuscatedName("KJCMXHNO.V")
	public static int field910 = -1;

	@ObfuscatedName("KJCMXHNO.W")
	public static int field911 = 4;

	@ObfuscatedName("KJCMXHNO.ab")
	public static Occlude[] field915 = new Occlude[500];

	@ObfuscatedName("KJCMXHNO.bb")
	public static LinkList field916 = new LinkList();

	@ObfuscatedName("KJCMXHNO.cb")
	public static final int[] field917 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("KJCMXHNO.db")
	public static final int[] field918 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("KJCMXHNO.eb")
	public static final int[] field919 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("KJCMXHNO.fb")
	public static final int[] field920 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("KJCMXHNO.gb")
	public static final int[] field921 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("KJCMXHNO.hb")
	public static final int[] field922 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("KJCMXHNO.ib")
	public static final int[] field923 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("KJCMXHNO.jb")
	public static final int[] field924 = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("KJCMXHNO.pb")
	public static boolean[][][][] field930 = new boolean[8][32][51][51];

	@ObfuscatedName("KJCMXHNO.X")
	public static int[] field912 = new int[field911];

	@ObfuscatedName("KJCMXHNO.Y")
	public static Occlude[][] field913 = new Occlude[field911][500];

	@ObfuscatedName("KJCMXHNO.s")
	public int field881;

	@ObfuscatedName("KJCMXHNO.t")
	public int field882;

	@ObfuscatedName("KJCMXHNO.w")
	public static int field885;

	@ObfuscatedName("KJCMXHNO.x")
	public static int field886;

	@ObfuscatedName("KJCMXHNO.y")
	public static int field887;

	@ObfuscatedName("KJCMXHNO.z")
	public static int field888;

	@ObfuscatedName("KJCMXHNO.A")
	public static int field889;

	@ObfuscatedName("KJCMXHNO.B")
	public static int field890;

	@ObfuscatedName("KJCMXHNO.C")
	public static int field891;

	@ObfuscatedName("KJCMXHNO.D")
	public static int field892;

	@ObfuscatedName("KJCMXHNO.E")
	public static int field893;

	@ObfuscatedName("KJCMXHNO.F")
	public static int field894;

	@ObfuscatedName("KJCMXHNO.G")
	public static int field895;

	@ObfuscatedName("KJCMXHNO.H")
	public static int field896;

	@ObfuscatedName("KJCMXHNO.I")
	public static int field897;

	@ObfuscatedName("KJCMXHNO.J")
	public static int field898;

	@ObfuscatedName("KJCMXHNO.K")
	public static int field899;

	@ObfuscatedName("KJCMXHNO.L")
	public static int field900;

	@ObfuscatedName("KJCMXHNO.S")
	public static int field907;

	@ObfuscatedName("KJCMXHNO.T")
	public static int field908;

	@ObfuscatedName("KJCMXHNO.Z")
	public static int field914;

	@ObfuscatedName("KJCMXHNO.mb")
	public int field927;

	@ObfuscatedName("KJCMXHNO.rb")
	public static int field932;

	@ObfuscatedName("KJCMXHNO.sb")
	public static int field933;

	@ObfuscatedName("KJCMXHNO.tb")
	public static int field934;

	@ObfuscatedName("KJCMXHNO.ub")
	public static int field935;

	@ObfuscatedName("KJCMXHNO.vb")
	public static int field936;

	@ObfuscatedName("KJCMXHNO.wb")
	public static int field937;

	@ObfuscatedName("KJCMXHNO.R")
	public static boolean field906;

	@ObfuscatedName("KJCMXHNO.qb")
	public static boolean[][] field931;

	public World3D(int[][][] arg0, int arg1, int arg2, int arg3) {
		field876 = arg2;
		field877 = arg3;
		field878 = arg1;
		field880 = new Square[arg2][arg3][arg1];
		field884 = new int[arg2][arg3 + 1][arg1 + 1];
		field879 = arg0;
		method274();
	}

	@ObfuscatedName("KJCMXHNO.a(Z)V")
	public static void method273() {
		field901 = null;
		field912 = null;
		field913 = null;
		field916 = null;
		field930 = null;
		field931 = null;
	}

	@ObfuscatedName("KJCMXHNO.a(B)V")
	public void method274() {
		for (int var1 = 0; var1 < field876; var1++) {
			for (int var2 = 0; var2 < field877; var2++) {
				for (int var3 = 0; var3 < field878; var3++) {
					field880[var1][var2][var3] = null;
				}
			}
		}

		for (int var4 = 0; var4 < field911; var4++) {
			for (int var5 = 0; var5 < field912[var4]; var5++) {
				field913[var4][var5] = null;
			}

			field912[var4] = 0;
		}

		for (int var6 = 0; var6 < field882; var6++) {
			field883[var6] = null;
		}

		field882 = 0;

		for (int var7 = 0; var7 < field901.length; var7++) {
			field901[var7] = null;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IZ)V")
	public void method275(int arg0) {
		field881 = arg0;

		for (int var2 = 0; var2 < field877; var2++) {
			for (int var3 = 0; var3 < field878; var3++) {
				if (field880[arg0][var2][var3] == null) {
					field880[arg0][var2][var3] = new Square(arg0, var2, var3);
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(ZII)V")
	public void method276(int arg0, int arg1) {
		Square var3 = field880[0][arg0][arg1];

		for (int var4 = 0; var4 < 3; var4++) {
			Square var5 = field880[var4][arg0][arg1] = field880[var4 + 1][arg0][arg1];
			if (var5 != null) {
				var5.field1191--;

				for (int var6 = 0; var6 < var5.field1201; var6++) {
					Sprite var7 = var5.field1202[var6];
					if ((var7.field85 >> 29 & 0x3) == 2 && var7.field79 == arg0 && var7.field81 == arg1) {
						var7.field73--;
					}
				}
			}
		}

		if (field880[0][arg0][arg1] == null) {
			field880[0][arg0][arg1] = new Square(0, arg0, arg1);
		}

		field880[0][arg0][arg1].field1213 = var3;
		field880[3][arg0][arg1] = null;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIIIII)V")
	public static void method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.field1274 = arg0 / 128;
		var8.field1275 = arg2 / 128;
		var8.field1276 = arg5 / 128;
		var8.field1277 = arg3 / 128;
		var8.field1278 = arg7;
		var8.field1279 = arg0;
		var8.field1280 = arg2;
		var8.field1281 = arg5;
		var8.field1282 = arg3;
		var8.field1283 = arg6;
		var8.field1284 = arg1;
		field913[arg4][field912[arg4]++] = var8;
	}

	@ObfuscatedName("KJCMXHNO.a(IIII)V")
	public void method278(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = field880[arg0][arg1][arg2];
		if (var5 != null) {
			field880[arg0][arg1][arg2].field1205 = arg3;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIIIIIIIIIIIIIIII)V")
	public void method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);

			for (int var22 = arg0; var22 >= 0; var22--) {
				if (field880[var22][arg1][arg2] == null) {
					field880[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}

			field880[arg0][arg1][arg2].field1195 = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);

			for (int var24 = arg0; var24 >= 0; var24--) {
				if (field880[var24][arg1][arg2] == null) {
					field880[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}

			field880[arg0][arg1][arg2].field1195 = var23;
		} else {
			Ground var25 = new Ground(arg9, arg14, arg8, arg6, arg1, arg12, arg13, arg19, arg11, arg16, arg10, arg3, arg7, arg17, arg5, arg18, arg15, arg2, arg4);

			for (int var26 = arg0; var26 >= 0; var26--) {
				if (field880[var26][arg1][arg2] == null) {
					field880[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}

			field880[arg0][arg1][arg2].field1196 = var25;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIBIIILZOXDNIET;)V")
	public void method280(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, ModelSource arg6) {
		if (arg6 != null) {
			GroundDecor var8 = new GroundDecor();
			var8.field1134 = arg6;
			var8.field1132 = arg0 * 128 + 64;
			var8.field1133 = arg1 * 128 + 64;
			var8.field1131 = arg4;
			var8.field1135 = arg3;
			var8.field1136 = arg2;

			if (field880[arg5][arg0][arg1] == null) {
				field880[arg5][arg0][arg1] = new Square(arg5, arg0, arg1);
			}

			field880[arg5][arg0][arg1].field1199 = var8;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IILZOXDNIET;LZOXDNIET;ILZOXDNIET;III)V")
	public void method281(int arg0, int arg1, ModelSource arg2, ModelSource arg3, int arg4, ModelSource arg5, int arg6, int arg7) {
		GroundObject var9 = new GroundObject();
		var9.field567 = arg2;
		var9.field565 = arg7 * 128 + 64;
		var9.field566 = arg6 * 128 + 64;
		var9.field564 = arg0;
		var9.field570 = arg4;
		var9.field568 = arg3;
		var9.field569 = arg5;
		int var10 = 0;
		Square var11 = field880[arg1][arg7][arg6];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.field1201; var12++) {
				if (var11.field1202[var12].field77 instanceof Model) {
					int var13 = ((Model) var11.field1202[var12].field77).field1065;
					if (var13 > var10) {
						var10 = var13;
					}
				}
			}
		}

		var9.field571 = var10;

		if (field880[arg1][arg7][arg6] == null) {
			field880[arg1][arg7][arg6] = new Square(arg1, arg7, arg6);
		}

		field880[arg1][arg7][arg6].field1200 = var9;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIILZOXDNIET;IIBILZOXDNIET;I)V")
	public void method282(int arg0, int arg1, int arg2, ModelSource arg3, int arg4, int arg5, byte arg6, int arg7, ModelSource arg8, int arg9) {
		if (arg8 != null || arg3 != null) {
			Wall var11 = new Wall();
			var11.field1334 = arg5;
			var11.field1335 = arg6;
			var11.field1328 = arg4 * 128 + 64;
			var11.field1329 = arg7 * 128 + 64;
			var11.field1327 = arg0;
			var11.field1332 = arg8;
			var11.field1333 = arg3;
			var11.field1330 = arg2;
			var11.field1331 = arg1;

			for (int var12 = arg9; var12 >= 0; var12--) {
				if (field880[var12][arg4][arg7] == null) {
					field880[var12][arg4][arg7] = new Square(var12, arg4, arg7);
				}
			}

			field880[arg9][arg4][arg7].field1197 = var11;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIBIIIIILZOXDNIET;I)V")
	public void method283(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, ModelSource arg10) {
		if (arg10 != null) {
			Decor var12 = new Decor();
			var12.field1220 = arg3;
			var12.field1221 = arg4;
			var12.field1215 = arg5 * 128 + arg8 + 64;
			var12.field1216 = arg7 * 128 + arg6 + 64;
			var12.field1214 = arg9;
			var12.field1219 = arg10;
			var12.field1217 = arg1;
			var12.field1218 = arg2;

			for (int var13 = arg0; var13 >= 0; var13--) {
				if (field880[var13][arg5][arg7] == null) {
					field880[var13][arg5][arg7] = new Square(var13, arg5, arg7);
				}
			}

			field880[arg0][arg5][arg7].field1198 = var12;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIILZOXDNIET;BIIIIII)Z")
	public boolean method284(int arg0, int arg1, int arg2, ModelSource arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		if (arg3 == null) {
			return true;
		} else {
			int var11 = arg1 * 64 + arg6 * 128;
			int var12 = arg2 * 128 + arg7 * 64;
			return method287(arg0, arg6, arg2, arg1, arg7, var11, var12, arg8, arg3, arg5, false, arg9, arg4);
		}
	}

	@ObfuscatedName("KJCMXHNO.a(ILZOXDNIET;IIZIIIII)Z")
	public boolean method285(int arg0, ModelSource arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
		if (arg1 == null) {
			return true;
		}

		int var10 = arg2 - arg6;
		int var11 = arg7 - arg6;
		int var12 = arg2 + arg6;
		int var13 = arg6 + arg7;
		if (arg4) {
			if (arg8 > 640 && arg8 < 1408) {
				var13 += 128;
			}

			if (arg8 > 1152 && arg8 < 1920) {
				var12 += 128;
			}

			if (arg8 > 1664 || arg8 < 384) {
				var11 -= 128;
			}

			if (arg8 > 128 && arg8 < 896) {
				var10 -= 128;
			}
		}

		var10 /= 128;
		var11 /= 128;
		var12 /= 128;
		var13 /= 128;
		return method287(arg5, var10, var11, var12 + 1 - var10, var13 - var11 + 1, arg2, arg7, arg3, arg1, arg8, true, arg0, (byte) 0);
	}

	@ObfuscatedName("KJCMXHNO.a(IIIILZOXDNIET;IIIIIIII)Z")
	public boolean method286(int arg0, int arg1, int arg2, ModelSource arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		if (arg3 == null) {
			return true;
		}

		return method287(arg10, arg4, arg1, arg9 + 1 - arg4, arg6 - arg1 + 1, arg7, arg5, arg0, arg3, arg8, true, arg11, (byte) 0);
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIIIILZOXDNIET;IZIB)Z")
	public boolean method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ModelSource arg8, int arg9, boolean arg10, int arg11, byte arg12) {
		for (int var14 = arg1; var14 < arg1 + arg3; var14++) {
			for (int var15 = arg2; var15 < arg2 + arg4; var15++) {
				if (var14 < 0 || var15 < 0 || var14 >= field877 || var15 >= field878) {
					return false;
				}

				Square var16 = field880[arg0][var14][var15];
				if (var16 != null && var16.field1201 >= 5) {
					return false;
				}
			}
		}

		Sprite var17 = new Sprite();
		var17.field85 = arg11;
		var17.field86 = arg12;
		var17.field73 = arg0;
		var17.field75 = arg5;
		var17.field76 = arg6;
		var17.field74 = arg7;
		var17.field77 = arg8;
		var17.field78 = arg9;
		var17.field79 = arg1;
		var17.field81 = arg2;
		var17.field80 = arg1 + arg3 - 1;
		var17.field82 = arg2 + arg4 - 1;

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
					if (field880[var21][var18][var19] == null) {
						field880[var21][var18][var19] = new Square(var21, var18, var19);
					}
				}

				Square var22 = field880[arg0][var18][var19];
				var22.field1202[var22.field1201] = var17;
				var22.field1203[var22.field1201] = var20;
				var22.field1204 |= var20;
				var22.field1201++;
			}
		}

		if (arg10) {
			field883[field882++] = var17;
		}

		return true;
	}

	@ObfuscatedName("KJCMXHNO.a(I)V")
	public void method288() {
		for (int var1 = 0; var1 < field882; var1++) {
			Sprite var2 = field883[var1];
			method289(var2);
			field883[var1] = null;
		}

		field882 = 0;
	}

	@ObfuscatedName("KJCMXHNO.a(LBHOSVTIT;I)V")
	public void method289(Sprite arg0) {
		for (int var2 = arg0.field79; var2 <= arg0.field80; var2++) {
			for (int var3 = arg0.field81; var3 <= arg0.field82; var3++) {
				Square var4 = field880[arg0.field73][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.field1201; var5++) {
						if (var4.field1202[var5] == arg0) {
							var4.field1201--;
							for (int var6 = var5; var6 < var4.field1201; var6++) {
								var4.field1202[var6] = var4.field1202[var6 + 1];
								var4.field1203[var6] = var4.field1203[var6 + 1];
							}

							var4.field1202[var4.field1201] = null;
							break;
						}
					}

					var4.field1204 = 0;
					for (int var7 = 0; var7 < var4.field1201; var7++) {
						var4.field1204 |= var4.field1203[var7];
					}
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIII)V")
	public void method290(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = field880[arg2][arg3][arg0];
		if (var5 != null) {
			Decor var6 = var5.field1198;
			if (var6 != null) {
				int var7 = arg3 * 128 + 64;
				int var8 = arg0 * 128 + 64;
				var6.field1215 = (var6.field1215 - var7) * arg1 / 16 + var7;
				var6.field1216 = (var6.field1216 - var8) * arg1 / 16 + var8;
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIZ)V")
	public void method291(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg1][arg2][arg0];
		if (var4 != null) {
			var4.field1197 = null;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(ZIII)V")
	public void method292(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg2][arg0][arg1];
		if (var4 != null) {
			var4.field1198 = null;
		}
	}

	@ObfuscatedName("KJCMXHNO.b(IIII)V")
	public void method293(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg1][arg2][arg0];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.field1201; var5++) {
				Sprite var6 = var4.field1202[var5];
				if ((var6.field85 >> 29 & 0x3) == 2 && var6.field79 == arg2 && var6.field81 == arg0) {
					method289(var6);
					return;
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIZI)V")
	public void method294(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg2][arg0][arg1];
		if (var4 != null) {
			var4.field1199 = null;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(III)V")
	public void method295(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg0][arg1][arg2];
		if (var4 != null) {
			var4.field1200 = null;
		}
	}

	@ObfuscatedName("KJCMXHNO.c(IIII)LWQXKHZYN;")
	public Wall method296(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg0][arg1][arg2];
		if (var4 == null) {
			return null;
		}

		return var4.field1197;
	}

	@ObfuscatedName("KJCMXHNO.b(IIIZ)LSEMZHDXN;")
	public Decor method297(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg0][arg2][arg1];
		if (var4 == null) {
			return null;
		}

		return var4.field1198;
	}

	@ObfuscatedName("KJCMXHNO.a(IBII)LBHOSVTIT;")
	public Sprite method298(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg2][arg0][arg1];
		if (var4 == null) {
			return null;
		}

		for (int var5 = 0; var5 < var4.field1201; var5++) {
			Sprite var6 = var4.field1202[var5];
			if ((var6.field85 >> 29 & 0x3) == 2 && var6.field79 == arg0 && var6.field81 == arg1) {
				return var6;
			}
		}

		return null;
	}

	@ObfuscatedName("KJCMXHNO.d(IIII)LMOLUZZPG;")
	public GroundDecor method299(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg0][arg2][arg1];
		if (var4 != null && var4.field1199 != null) {
			return var4.field1199;
		}

		return null;
	}

	@ObfuscatedName("KJCMXHNO.b(III)I")
	public int method300(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg0][arg1][arg2];
		if (var4 != null && var4.field1197 != null) {
			return var4.field1197.field1334;
		}

		return 0;
	}

	@ObfuscatedName("KJCMXHNO.b(IBII)I")
	public int method301(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg1][arg0][arg2];
		if (var4 != null && var4.field1198 != null) {
			return var4.field1198.field1220;
		}

		return 0;
	}

	@ObfuscatedName("KJCMXHNO.c(III)I")
	public int method302(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}

		for (int var5 = 0; var5 < var4.field1201; var5++) {
			Sprite var6 = var4.field1202[var5];
			if ((var6.field85 >> 29 & 0x3) == 2 && var6.field79 == arg1 && var6.field81 == arg2) {
				return var6.field85;
			}
		}

		return 0;
	}

	@ObfuscatedName("KJCMXHNO.d(III)I")
	public int method303(int arg0, int arg1, int arg2) {
		Square var4 = field880[arg0][arg1][arg2];
		if (var4 != null && var4.field1199 != null) {
			return var4.field1199.field1135;
		}

		return 0;
	}

	@ObfuscatedName("KJCMXHNO.e(IIII)I")
	public int method304(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = field880[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.field1197 != null && var5.field1197.field1334 == arg3) {
			return var5.field1197.field1335 & 0xFF;
		} else if (var5.field1198 != null && var5.field1198.field1220 == arg3) {
			return var5.field1198.field1221 & 0xFF;
		} else if (var5.field1199 != null && var5.field1199.field1135 == arg3) {
			return var5.field1199.field1136 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.field1201; var6++) {
				if (var5.field1202[var6].field85 == arg3) {
					return var5.field1202[var6].field86 & 0xFF;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("KJCMXHNO.a(BIII)V")
	public void method305(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field876; var4++) {
			for (int var5 = 0; var5 < field877; var5++) {
				for (int var6 = 0; var6 < field878; var6++) {
					Square var7 = field880[var4][var5][var6];
					if (var7 != null) {
						Wall var8 = var7.field1197;
						if (var8 != null && var8.field1332 != null && var8.field1332.field1460 != null) {
							method307(var6, var4, 1, (Model) var8.field1332, var5, 1);

							if (var8.field1333 != null && var8.field1333.field1460 != null) {
								method307(var6, var4, 1, (Model) var8.field1333, var5, 1);
								method308((Model) var8.field1332, (Model) var8.field1333, 0, 0, 0, false);
								((Model) var8.field1333).method377(arg0, arg1, arg2);
							}

							((Model) var8.field1332).method377(arg0, arg1, arg2);
						}

						for (int var9 = 0; var9 < var7.field1201; var9++) {
							Sprite var10 = var7.field1202[var9];
							if (var10 != null && var10.field77 != null && var10.field77.field1460 != null) {
								method307(var6, var4, var10.field80 + 1 - var10.field79, (Model) var10.field77, var5, var10.field82 + 1 - var10.field81);
								((Model) var10.field77).method377(arg0, arg1, arg2);
							}
						}

						GroundDecor var11 = var7.field1199;
						if (var11 != null && var11.field1134.field1460 != null) {
							method306(var5, (Model) var11.field1134, var6, var4);
							((Model) var11.field1134).method377(arg0, arg1, arg2);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(ILLZYQDKJV;III)V")
	public void method306(int arg0, Model arg1, int arg2, int arg3) {
		if (arg0 < field877) {
			Square var5 = field880[arg3][arg0 + 1][arg2];
			if (var5 != null && var5.field1199 != null && var5.field1199.field1134.field1460 != null) {
				method308(arg1, (Model) var5.field1199.field1134, 128, 0, 0, true);
			}
		}

		if (arg2 < field877) {
			Square var6 = field880[arg3][arg0][arg2 + 1];
			if (var6 != null && var6.field1199 != null && var6.field1199.field1134.field1460 != null) {
				method308(arg1, (Model) var6.field1199.field1134, 0, 0, 128, true);
			}
		}

		if (arg0 < field877 && arg2 < field878) {
			Square var7 = field880[arg3][arg0 + 1][arg2 + 1];
			if (var7 != null && var7.field1199 != null && var7.field1199.field1134.field1460 != null) {
				method308(arg1, (Model) var7.field1199.field1134, 128, 0, 128, true);
			}
		}

		if (arg0 < field877 && arg2 > 0) {
			Square var8 = field880[arg3][arg0 + 1][arg2 - 1];
			if (var8 != null && var8.field1199 != null && var8.field1199.field1134.field1460 != null) {
				method308(arg1, (Model) var8.field1199.field1134, 128, 0, -128, true);
				return;
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IIIILLZYQDKJV;II)V")
	public void method307(int arg0, int arg1, int arg2, Model arg3, int arg4, int arg5) {
		boolean var7 = true;
		int var8 = arg4;
		int var9 = arg2 + arg4;
		int var10 = arg0 - 1;
		int var11 = arg0 + arg5;
		for (int var12 = arg1; var12 <= arg1 + 1; var12++) {
			if (field876 != var12) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < field877) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < field878 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg0 && arg4 != var13)) {
								Square var15 = field880[var12][var13][var14];
								if (var15 != null) {
									int var16 = (field879[var12][var13 + 1][var14] + field879[var12][var13][var14] + field879[var12][var13][var14 + 1] + field879[var12][var13 + 1][var14 + 1]) / 4 - (field879[arg1][arg4 + 1][arg0] + field879[arg1][arg4][arg0] + field879[arg1][arg4][arg0 + 1] + field879[arg1][arg4 + 1][arg0 + 1]) / 4;
									Wall var17 = var15.field1197;
									if (var17 != null && var17.field1332 != null && var17.field1332.field1460 != null) {
										method308(arg3, (Model) var17.field1332, (1 - arg2) * 64 + (var13 - arg4) * 128, var16, (var14 - arg0) * 128 + (1 - arg5) * 64, var7);
									}

									if (var17 != null && var17.field1333 != null && var17.field1333.field1460 != null) {
										method308(arg3, (Model) var17.field1333, (1 - arg2) * 64 + (var13 - arg4) * 128, var16, (var14 - arg0) * 128 + (1 - arg5) * 64, var7);
									}

									for (int var18 = 0; var18 < var15.field1201; var18++) {
										Sprite var19 = var15.field1202[var18];
										if (var19 != null && var19.field77 != null && var19.field77.field1460 != null) {
											int var20 = var19.field80 + 1 - var19.field79;
											int var21 = var19.field82 + 1 - var19.field81;
											method308(arg3, (Model) var19.field77, (var19.field79 - arg4) * 128 + (var20 - arg2) * 64, var16, (var19.field81 - arg0) * 128 + (var21 - arg5) * 64, var7);
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

	@ObfuscatedName("KJCMXHNO.a(LLZYQDKJV;LLZYQDKJV;IIIZ)V")
	public void method308(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		field927++;
		int var7 = 0;
		int[] var8 = arg1.field1039;
		int var9 = arg1.field1038;
		int var10 = arg1.field1059 >> 16;
		int var11 = arg1.field1059 << 16 >> 16;
		int var12 = arg1.field1060 >> 16;
		int var13 = arg1.field1060 << 16 >> 16;
		for (int var14 = 0; var14 < arg0.field1038; var14++) {
			VertexNormal var15 = arg0.field1460[var14];
			VertexNormal var16 = arg0.field1071[var14];
			if (var16.field1295 != 0) {
				int var17 = arg0.field1040[var14] - arg3;
				if (var17 <= arg1.field1062) {
					int var18 = arg0.field1039[var14] - arg2;
					if (var18 >= var10 && var18 <= var11) {
						int var19 = arg0.field1041[var14] - arg4;
						if (var19 >= var13 && var19 <= var12) {
							for (int var20 = 0; var20 < var9; var20++) {
								VertexNormal var21 = arg1.field1460[var20];
								VertexNormal var22 = arg1.field1071[var20];
								if (var8[var20] == var18 && arg1.field1041[var20] == var19 && arg1.field1040[var20] == var17 && var22.field1295 != 0) {
									var15.field1292 += var22.field1292;
									var15.field1293 += var22.field1293;
									var15.field1294 += var22.field1294;
									var15.field1295 += var22.field1295;
									var21.field1292 += var16.field1292;
									var21.field1293 += var16.field1293;
									var21.field1294 += var16.field1294;
									var21.field1295 += var16.field1295;
									var7++;
									field925[var14] = field927;
									field926[var20] = field927;
								}
							}
						}
					}
				}
			}
		}

		if (var7 >= 3 && arg5) {
			for (int var23 = 0; var23 < arg0.field1042; var23++) {
				if (field925[arg0.field1043[var23]] == field927 && field925[arg0.field1044[var23]] == field927 && field925[arg0.field1045[var23]] == field927) {
					arg0.field1049[var23] = -1;
				}
			}

			for (int var24 = 0; var24 < arg1.field1042; var24++) {
				if (field926[arg1.field1043[var24]] == field927 && field926[arg1.field1044[var24]] == field927 && field926[arg1.field1045[var24]] == field927) {
					arg1.field1049[var24] = -1;
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a([IIIIII)V")
	public void method309(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Square var7 = field880[arg3][arg4][arg5];
		if (var7 != null) {
			QuickGround var8 = var7.field1195;
			if (var8 == null) {
				Ground var11 = var7.field1196;
				if (var11 != null) {
					int var12 = var11.field798;
					int var13 = var11.field799;
					int var14 = var11.field800;
					int var15 = var11.field801;
					int[] var16 = field928[var12];
					int[] var17 = field929[var13];
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
				int var9 = var8.field62;
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

	@ObfuscatedName("KJCMXHNO.a(II[IIII)V")
	public static void method310(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		field934 = 0;
		field935 = 0;
		field936 = arg4;
		field937 = arg0;
		field932 = arg4 / 2;
		field933 = arg0 / 2;
		boolean[][][][] var5 = new boolean[9][32][53][53];
		for (int var6 = 128; var6 <= 384; var6 += 32) {
			for (int var7 = 0; var7 < 2048; var7 += 64) {
				field897 = Model.field1100[var6];
				field898 = Model.field1101[var6];
				field899 = Model.field1100[var7];
				field900 = Model.field1101[var7];
				int var8 = (var6 - 128) / 32;
				int var9 = var7 / 64;
				for (int var10 = -26; var10 <= 26; var10++) {
					for (int var11 = -26; var11 <= 26; var11++) {
						int var12 = var10 * 128;
						int var13 = var11 * 128;
						boolean var14 = false;
						for (int var15 = -arg3; var15 <= arg2; var15 += 128) {
							if (method311(var13, var12, arg1[var8] + var15)) {
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

						field930[var16][var17][var18 + 25][var19 + 25] = var20;
					}
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.f(IIII)Z")
	public static boolean method311(int arg0, int arg1, int arg2) {
		int var3 = field900 * arg1 + field899 * arg0 >> 16;
		int var4 = field900 * arg0 - field899 * arg1 >> 16;
		int var5 = field898 * var4 + field897 * arg2 >> 16;
		int var6 = field898 * arg2 - field897 * var4 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = (var3 << 9) / var5 + field932;
			int var8 = (var6 << 9) / var5 + field933;
			if (var7 >= field934 && var7 <= field936 && var8 >= field935 && var8 <= field937) {
				return true;
			}

			return false;
		}

		return false;
	}

	@ObfuscatedName("KJCMXHNO.e(III)V")
	public void method312(int arg0, int arg1) {
		field906 = true;
		field907 = arg0;
		field908 = arg1;
		field909 = -1;
		field910 = -1;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIII)V")
	public void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= field877 * 128) {
			arg0 = field877 * 128 - 1;
		}

		if (arg3 < 0) {
			arg3 = 0;
		} else if (arg3 >= field878 * 128) {
			arg3 = field878 * 128 - 1;
		}

		field887++;
		field897 = Model.field1100[arg5];
		field898 = Model.field1101[arg5];
		field899 = Model.field1100[arg4];
		field900 = Model.field1101[arg4];
		field931 = field930[(arg5 - 128) / 32][arg4 / 64];
		field894 = arg0;
		field895 = arg2;
		field896 = arg3;
		field892 = arg0 / 128;
		field893 = arg3 / 128;
		field886 = arg1;
		field888 = field892 - 25;
		if (field888 < 0) {
			field888 = 0;
		}

		field890 = field893 - 25;
		if (field890 < 0) {
			field890 = 0;
		}

		field889 = field892 + 25;
		if (field889 > field877) {
			field889 = field877;
		}

		field891 = field893 + 25;
		if (field891 > field878) {
			field891 = field878;
		}

		method319();
		field885 = 0;
		for (int var7 = field881; var7 < field876; var7++) {
			Square[][] var8 = field880[var7];
			for (int var9 = field888; var9 < field889; var9++) {
				for (int var10 = field890; var10 < field891; var10++) {
					Square var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field1205 <= arg1 && (field931[var9 + 25 - field892][var10 + 25 - field893] || field879[var7][var9][var10] - arg2 >= 2000)) {
							var11.field1206 = true;
							var11.field1207 = true;

							if (var11.field1201 > 0) {
								var11.field1208 = true;
							} else {
								var11.field1208 = false;
							}

							field885++;
						} else {
							var11.field1206 = false;
							var11.field1207 = false;
							var11.field1209 = 0;
						}
					}
				}
			}
		}

		for (int var12 = field881; var12 < field876; var12++) {
			Square[][] var13 = field880[var12];
			for (int var14 = -25; var14 <= 0; var14++) {
				int var15 = field892 + var14;
				int var16 = field892 - var14;
				if (var15 >= field888 || var16 < field889) {
					for (int var17 = -25; var17 <= 0; var17++) {
						int var18 = field893 + var17;
						int var19 = field893 - var17;
						if (var15 >= field888) {
							if (var18 >= field890) {
								Square var20 = var13[var15][var18];
								if (var20 != null && var20.field1206) {
									method314(var20, true);
								}
							}

							if (var19 < field891) {
								Square var21 = var13[var15][var19];
								if (var21 != null && var21.field1206) {
									method314(var21, true);
								}
							}
						}

						if (var16 < field889) {
							if (var18 >= field890) {
								Square var22 = var13[var16][var18];
								if (var22 != null && var22.field1206) {
									method314(var22, true);
								}
							}

							if (var19 < field891) {
								Square var23 = var13[var16][var19];
								if (var23 != null && var23.field1206) {
									method314(var23, true);
								}
							}
						}

						if (field885 == 0) {
							field906 = false;
							return;
						}
					}
				}
			}
		}

		for (int var24 = field881; var24 < field876; var24++) {
			Square[][] var25 = field880[var24];
			for (int var26 = -25; var26 <= 0; var26++) {
				int var27 = field892 + var26;
				int var28 = field892 - var26;
				if (var27 >= field888 || var28 < field889) {
					for (int var29 = -25; var29 <= 0; var29++) {
						int var30 = field893 + var29;
						int var31 = field893 - var29;
						if (var27 >= field888) {
							if (var30 >= field890) {
								Square var32 = var25[var27][var30];
								if (var32 != null && var32.field1206) {
									method314(var32, false);
								}
							}

							if (var31 < field891) {
								Square var33 = var25[var27][var31];
								if (var33 != null && var33.field1206) {
									method314(var33, false);
								}
							}
						}

						if (var28 < field889) {
							if (var30 >= field890) {
								Square var34 = var25[var28][var30];
								if (var34 != null && var34.field1206) {
									method314(var34, false);
								}
							}

							if (var31 < field891) {
								Square var35 = var25[var28][var31];
								if (var35 != null && var35.field1206) {
									method314(var35, false);
								}
							}
						}

						if (field885 == 0) {
							field906 = false;
							return;
						}
					}
				}
			}
		}

		field906 = false;
	}

	@ObfuscatedName("KJCMXHNO.a(LRIEEXHOP;Z)V")
	public void method314(Square arg0, boolean arg1) {
		field916.method3(arg0);

		while (true) {
			Square var3;
			int var4;
			int var5;
			int var6;
			int var7;
			Square[][] var8;
			Square var70;
			do {
				Square var69;
				do {
					Square var68;
					do {
						Square var67;
						while (true) {
							do {
								while (true) {
									while (true) {
										do {
											var3 = (Square) field916.method5();
											if (var3 == null) {
												return;
											}
										} while (!var3.field1207);

										var4 = var3.field1192;
										var5 = var3.field1193;
										var6 = var3.field1191;
										var7 = var3.field1194;
										var8 = field880[var6];

										if (!var3.field1206) {
											break;
										}

										if (arg1) {
											if (var6 > 0) {
												Square var9 = field880[var6 - 1][var4][var5];
												if (var9 != null && var9.field1207) {
													continue;
												}
											}

											if (var4 <= field892 && var4 > field888) {
												Square var10 = var8[var4 - 1][var5];
												if (var10 != null && var10.field1207 && (var10.field1206 || (var3.field1204 & 0x1) == 0)) {
													continue;
												}
											}

											if (var4 >= field892 && var4 < field889 - 1) {
												Square var11 = var8[var4 + 1][var5];
												if (var11 != null && var11.field1207 && (var11.field1206 || (var3.field1204 & 0x4) == 0)) {
													continue;
												}
											}

											if (var5 <= field893 && var5 > field890) {
												Square var12 = var8[var4][var5 - 1];
												if (var12 != null && var12.field1207 && (var12.field1206 || (var3.field1204 & 0x8) == 0)) {
													continue;
												}
											}

											if (var5 >= field893 && var5 < field891 - 1) {
												Square var13 = var8[var4][var5 + 1];
												if (var13 != null && var13.field1207 && (var13.field1206 || (var3.field1204 & 0x2) == 0)) {
													continue;
												}
											}
										} else {
											arg1 = true;
										}

										var3.field1206 = false;

										if (var3.field1213 != null) {
											Square var14 = var3.field1213;
											if (var14.field1195 == null) {
												if (var14.field1196 != null && !method320(0, var4, var5)) {
													method316(field898, field900, var14.field1196, field897, var5, var4, field899);
												}
											} else if (!method320(0, var4, var5)) {
												method315(var14.field1195, 0, field897, field898, field899, field900, var4, var5);
											}

											Wall var15 = var14.field1197;
											if (var15 != null) {
												var15.field1332.method381(0, field897, field898, field899, field900, var15.field1328 - field894, var15.field1327 - field895, var15.field1329 - field896, var15.field1334);
											}

											for (int var16 = 0; var16 < var14.field1201; var16++) {
												Sprite var17 = var14.field1202[var16];
												if (var17 != null) {
													var17.field77.method381(var17.field78, field897, field898, field899, field900, var17.field75 - field894, var17.field74 - field895, var17.field76 - field896, var17.field85);
												}
											}
										}

										boolean var18 = false;
										if (var3.field1195 == null) {
											if (var3.field1196 != null && !method320(var7, var4, var5)) {
												var18 = true;
												method316(field898, field900, var3.field1196, field897, var5, var4, field899);
											}
										} else if (!method320(var7, var4, var5)) {
											var18 = true;
											method315(var3.field1195, var7, field897, field898, field899, field900, var4, var5);
										}

										int var19 = 0;
										int var20 = 0;
										Wall var21 = var3.field1197;
										Decor var22 = var3.field1198;
										if (var21 != null || var22 != null) {
											if (field892 == var4) {
												var19++;
											} else if (field892 < var4) {
												var19 += 2;
											}

											if (field893 == var5) {
												var19 += 3;
											} else if (field893 > var5) {
												var19 += 6;
											}

											var20 = field917[var19];
											var3.field1212 = field919[var19];
										}

										if (var21 != null) {
											if ((var21.field1330 & field918[var19]) == 0) {
												var3.field1209 = 0;
											} else if (var21.field1330 == 16) {
												var3.field1209 = 3;
												var3.field1210 = field920[var19];
												var3.field1211 = 3 - var3.field1210;
											} else if (var21.field1330 == 32) {
												var3.field1209 = 6;
												var3.field1210 = field921[var19];
												var3.field1211 = 6 - var3.field1210;
											} else if (var21.field1330 == 64) {
												var3.field1209 = 12;
												var3.field1210 = field922[var19];
												var3.field1211 = 12 - var3.field1210;
											} else {
												var3.field1209 = 9;
												var3.field1210 = field923[var19];
												var3.field1211 = 9 - var3.field1210;
											}

											if ((var21.field1330 & var20) != 0 && !method321(var7, var4, var5, var21.field1330)) {
												var21.field1332.method381(0, field897, field898, field899, field900, var21.field1328 - field894, var21.field1327 - field895, var21.field1329 - field896, var21.field1334);
											}

											if ((var21.field1331 & var20) != 0 && !method321(var7, var4, var5, var21.field1331)) {
												var21.field1333.method381(0, field897, field898, field899, field900, var21.field1328 - field894, var21.field1327 - field895, var21.field1329 - field896, var21.field1334);
											}
										}

										if (var22 != null && !method322(var7, var4, var5, var22.field1219.field1461)) {
											if ((var22.field1217 & var20) != 0) {
												var22.field1219.method381(var22.field1218, field897, field898, field899, field900, var22.field1215 - field894, var22.field1214 - field895, var22.field1216 - field896, var22.field1220);
											} else if ((var22.field1217 & 0x300) != 0) {
												int var23 = var22.field1215 - field894;
												int var24 = var22.field1214 - field895;
												int var25 = var22.field1216 - field896;
												int var26 = var22.field1218;
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

												if ((var22.field1217 & 0x100) != 0 && var28 < var27) {
													int var29 = field902[var26] + var23;
													int var30 = field903[var26] + var25;
													var22.field1219.method381(var26 * 512 + 256, field897, field898, field899, field900, var29, var24, var30, var22.field1220);
												}

												if ((var22.field1217 & 0x200) != 0 && var28 > var27) {
													int var31 = field904[var26] + var23;
													int var32 = field905[var26] + var25;
													var22.field1219.method381(var26 * 512 + 1280 & 0x7FF, field897, field898, field899, field900, var31, var24, var32, var22.field1220);
												}
											}
										}

										if (var18) {
											GroundDecor var33 = var3.field1199;
											if (var33 != null) {
												var33.field1134.method381(0, field897, field898, field899, field900, var33.field1132 - field894, var33.field1131 - field895, var33.field1133 - field896, var33.field1135);
											}

											GroundObject var34 = var3.field1200;
											if (var34 != null && var34.field571 == 0) {
												if (var34.field568 != null) {
													var34.field568.method381(0, field897, field898, field899, field900, var34.field565 - field894, var34.field564 - field895, var34.field566 - field896, var34.field570);
												}

												if (var34.field569 != null) {
													var34.field569.method381(0, field897, field898, field899, field900, var34.field565 - field894, var34.field564 - field895, var34.field566 - field896, var34.field570);
												}

												if (var34.field567 != null) {
													var34.field567.method381(0, field897, field898, field899, field900, var34.field565 - field894, var34.field564 - field895, var34.field566 - field896, var34.field570);
												}
											}
										}

										int var35 = var3.field1204;
										if (var35 == 0) {
											break;
										}

										if (var4 < field892 && (var35 & 0x4) != 0) {
											Square var36 = var8[var4 + 1][var5];
											if (var36 != null && var36.field1207) {
												field916.method3(var36);
											}
										}

										if (var5 < field893 && (var35 & 0x2) != 0) {
											Square var37 = var8[var4][var5 + 1];
											if (var37 != null && var37.field1207) {
												field916.method3(var37);
											}
										}

										if (var4 > field892 && (var35 & 0x1) != 0) {
											Square var38 = var8[var4 - 1][var5];
											if (var38 != null && var38.field1207) {
												field916.method3(var38);
											}
										}

										if (var5 <= field893 || (var35 & 0x8) == 0) {
											break;
										}

										Square var39 = var8[var4][var5 - 1];
										if (var39 == null || !var39.field1207) {
											break;
										}

										field916.method3(var39);
										break;
									}

									if (var3.field1209 != 0) {
										boolean var40 = true;
										for (int var41 = 0; var41 < var3.field1201; var41++) {
											if (field887 != var3.field1202[var41].field84 && (var3.field1203[var41] & var3.field1209) == var3.field1210) {
												var40 = false;
												break;
											}
										}

										if (var40) {
											Wall var42 = var3.field1197;
											if (!method321(var7, var4, var5, var42.field1330)) {
												var42.field1332.method381(0, field897, field898, field899, field900, var42.field1328 - field894, var42.field1327 - field895, var42.field1329 - field896, var42.field1334);
											}

											var3.field1209 = 0;
										}
									}

									if (!var3.field1208) {
										break;
									}

									try {
										int var43 = var3.field1201;
										var3.field1208 = false;
										int var44 = 0;
										label559: for (int var45 = 0; var45 < var43; var45++) {
											Sprite var46 = var3.field1202[var45];
											if (field887 != var46.field84) {
												for (int var47 = var46.field79; var47 <= var46.field80; var47++) {
													for (int var48 = var46.field81; var48 <= var46.field82; var48++) {
														Square var49 = var8[var47][var48];
														if (var49.field1206) {
															var3.field1208 = true;
															continue label559;
														}

														if (var49.field1209 != 0) {
															int var50 = 0;
															if (var47 > var46.field79) {
																var50++;
															}

															if (var47 < var46.field80) {
																var50 += 4;
															}

															if (var48 > var46.field81) {
																var50 += 8;
															}

															if (var48 < var46.field82) {
																var50 += 2;
															}

															if ((var50 & var49.field1209) == var3.field1211) {
																var3.field1208 = true;
																continue label559;
															}
														}
													}
												}

												field901[var44++] = var46;
												int var51 = field892 - var46.field79;
												int var52 = var46.field80 - field892;
												if (var52 > var51) {
													var51 = var52;
												}

												int var53 = field893 - var46.field81;
												int var54 = var46.field82 - field893;
												if (var54 > var53) {
													var46.field83 = var51 + var54;
												} else {
													var46.field83 = var51 + var53;
												}
											}
										}

										while (var44 > 0) {
											int var55 = -50;
											int var56 = -1;
											for (int var57 = 0; var57 < var44; var57++) {
												Sprite var58 = field901[var57];
												if (field887 != var58.field84) {
													if (var58.field83 > var55) {
														var55 = var58.field83;
														var56 = var57;
													} else if (var58.field83 == var55) {
														int var59 = var58.field75 - field894;
														int var60 = var58.field76 - field896;
														int var61 = field901[var56].field75 - field894;
														int var62 = field901[var56].field76 - field896;
														if (var59 * var59 + var60 * var60 > var61 * var61 + var62 * var62) {
															var56 = var57;
														}
													}
												}
											}

											if (var56 == -1) {
												break;
											}

											Sprite var63 = field901[var56];
											var63.field84 = field887;

											if (!method323(var7, var63.field79, var63.field80, var63.field81, var63.field82, var63.field77.field1461)) {
												var63.field77.method381(var63.field78, field897, field898, field899, field900, var63.field75 - field894, var63.field74 - field895, var63.field76 - field896, var63.field85);
											}

											for (int var64 = var63.field79; var64 <= var63.field80; var64++) {
												for (int var65 = var63.field81; var65 <= var63.field82; var65++) {
													Square var66 = var8[var64][var65];
													if (var66.field1209 != 0) {
														field916.method3(var66);
													} else if ((var4 != var64 || var5 != var65) && var66.field1207) {
														field916.method3(var66);
													}
												}
											}
										}

										if (!var3.field1208) {
											break;
										}
									} catch (Exception var89) {
										var3.field1208 = false;
										break;
									}
								}
							} while (!var3.field1207);

							if (var3.field1209 == 0) {
								if (var4 > field892 || var4 <= field888) {
									break;
								}

								var67 = var8[var4 - 1][var5];
								if (var67 == null || !var67.field1207) {
									break;
								}
							}
						}

						if (var4 < field892 || var4 >= field889 - 1) {
							break;
						}

						var68 = var8[var4 + 1][var5];
					} while (var68 != null && var68.field1207);

					if (var5 > field893 || var5 <= field890) {
						break;
					}

					var69 = var8[var4][var5 - 1];
				} while (var69 != null && var69.field1207);

				if (var5 < field893 || var5 >= field891 - 1) {
					break;
				}

				var70 = var8[var4][var5 + 1];
			} while (var70 != null && var70.field1207);

			var3.field1207 = false;
			field885--;
			GroundObject var71 = var3.field1200;
			if (var71 != null && var71.field571 != 0) {
				if (var71.field568 != null) {
					var71.field568.method381(0, field897, field898, field899, field900, var71.field565 - field894, var71.field564 - field895 - var71.field571, var71.field566 - field896, var71.field570);
				}

				if (var71.field569 != null) {
					var71.field569.method381(0, field897, field898, field899, field900, var71.field565 - field894, var71.field564 - field895 - var71.field571, var71.field566 - field896, var71.field570);
				}

				if (var71.field567 != null) {
					var71.field567.method381(0, field897, field898, field899, field900, var71.field565 - field894, var71.field564 - field895 - var71.field571, var71.field566 - field896, var71.field570);
				}
			}

			if (var3.field1212 != 0) {
				Decor var72 = var3.field1198;
				if (var72 != null && !method322(var7, var4, var5, var72.field1219.field1461)) {
					if ((var72.field1217 & var3.field1212) != 0) {
						var72.field1219.method381(var72.field1218, field897, field898, field899, field900, var72.field1215 - field894, var72.field1214 - field895, var72.field1216 - field896, var72.field1220);
					} else if ((var72.field1217 & 0x300) != 0) {
						int var73 = var72.field1215 - field894;
						int var74 = var72.field1214 - field895;
						int var75 = var72.field1216 - field896;
						int var76 = var72.field1218;
						int var77;
						if (var76 == 1 || var76 == 2) {
							var77 = -var73;
						} else {
							var77 = var73;
						}

						int var78;
						if (var76 == 2 || var76 == 3) {
							var78 = -var75;
						} else {
							var78 = var75;
						}

						if ((var72.field1217 & 0x100) != 0 && var78 >= var77) {
							int var79 = field902[var76] + var73;
							int var80 = field903[var76] + var75;
							var72.field1219.method381(var76 * 512 + 256, field897, field898, field899, field900, var79, var74, var80, var72.field1220);
						}

						if ((var72.field1217 & 0x200) != 0 && var78 <= var77) {
							int var81 = field904[var76] + var73;
							int var82 = field905[var76] + var75;
							var72.field1219.method381(var76 * 512 + 1280 & 0x7FF, field897, field898, field899, field900, var81, var74, var82, var72.field1220);
						}
					}
				}

				Wall var83 = var3.field1197;
				if (var83 != null) {
					if ((var83.field1331 & var3.field1212) != 0 && !method321(var7, var4, var5, var83.field1331)) {
						var83.field1333.method381(0, field897, field898, field899, field900, var83.field1328 - field894, var83.field1327 - field895, var83.field1329 - field896, var83.field1334);
					}

					if ((var83.field1330 & var3.field1212) != 0 && !method321(var7, var4, var5, var83.field1330)) {
						var83.field1332.method381(0, field897, field898, field899, field900, var83.field1328 - field894, var83.field1327 - field895, var83.field1329 - field896, var83.field1334);
					}
				}
			}

			if (var6 < field876 - 1) {
				Square var84 = field880[var6 + 1][var4][var5];
				if (var84 != null && var84.field1207) {
					field916.method3(var84);
				}
			}

			if (var4 < field892) {
				Square var85 = var8[var4 + 1][var5];
				if (var85 != null && var85.field1207) {
					field916.method3(var85);
				}
			}

			if (var5 < field893) {
				Square var86 = var8[var4][var5 + 1];
				if (var86 != null && var86.field1207) {
					field916.method3(var86);
				}
			}

			if (var4 > field892) {
				Square var87 = var8[var4 - 1][var5];
				if (var87 != null && var87.field1207) {
					field916.method3(var87);
				}
			}

			if (var5 > field893) {
				Square var88 = var8[var4][var5 - 1];
				if (var88 != null && var88.field1207) {
					field916.method3(var88);
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(LAYYYSATX;IIIIIII)V")
	public void method315(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - field894;
		int var11;
		int var12 = var11 = (arg7 << 7) - field896;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = field879[arg1][arg6][arg7] - field895;
		int var18 = field879[arg1][arg6 + 1][arg7] - field895;
		int var19 = field879[arg1][arg6 + 1][arg7 + 1] - field895;
		int var20 = field879[arg1][arg6][arg7 + 1] - field895;
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
						int var37 = (var21 << 9) / var12 + Pix3D.field1361;
						int var38 = (var23 << 9) / var12 + Pix3D.field1362;
						int var39 = (var25 << 9) / var11 + Pix3D.field1361;
						int var40 = (var27 << 9) / var11 + Pix3D.field1362;
						int var41 = (var29 << 9) / var16 + Pix3D.field1361;
						int var42 = (var31 << 9) / var16 + Pix3D.field1362;
						int var43 = (var33 << 9) / var15 + Pix3D.field1361;
						int var44 = (var35 << 9) / var15 + Pix3D.field1362;
						Pix3D.field1360 = 0;

						if ((var40 - var44) * (var41 - var43) - (var39 - var43) * (var42 - var44) > 0) {
							Pix3D.field1357 = false;
							if (var41 < 0 || var43 < 0 || var39 < 0 || var41 > Pix2D.field956 || var43 > Pix2D.field956 || var39 > Pix2D.field956) {
								Pix3D.field1357 = true;
							}

							if (field906 && method318(field907, field908, var42, var44, var40, var41, var43, var39)) {
								field909 = arg6;
								field910 = arg7;
							}

							if (arg0.field60 == -1) {
								if (arg0.field58 != 12345678) {
									Pix3D.method555(var42, var44, var40, var41, var43, var39, arg0.field58, arg0.field59, arg0.field57);
								}
							} else if (field875) {
								int var45 = field924[arg0.field60];
								Pix3D.method555(var42, var44, var40, var41, var43, var39, method317(arg0.field58, var45), method317(arg0.field59, var45), method317(arg0.field57, var45));
							} else if (arg0.field61) {
								Pix3D.method559(var42, var44, var40, var41, var43, var39, arg0.field58, arg0.field59, arg0.field57, var21, var25, var33, var23, var27, var35, var12, var11, var15, arg0.field60);
							} else {
								Pix3D.method559(var42, var44, var40, var41, var43, var39, arg0.field58, arg0.field59, arg0.field57, var29, var33, var25, var31, var35, var27, var16, var15, var11, arg0.field60);
							}
						}

						if ((var37 - var39) * (var44 - var40) - (var38 - var40) * (var43 - var39) > 0) {
							Pix3D.field1357 = false;
							if (var37 < 0 || var39 < 0 || var43 < 0 || var37 > Pix2D.field956 || var39 > Pix2D.field956 || var43 > Pix2D.field956) {
								Pix3D.field1357 = true;
							}

							if (field906 && method318(field907, field908, var38, var40, var44, var37, var39, var43)) {
								field909 = arg6;
								field910 = arg7;
							}

							if (arg0.field60 != -1) {
								if (!field875) {
									Pix3D.method559(var38, var40, var44, var37, var39, var43, arg0.field56, arg0.field57, arg0.field59, var21, var25, var33, var23, var27, var35, var12, var11, var15, arg0.field60);
									return;
								}

								int var46 = field924[arg0.field60];
								Pix3D.method555(var38, var40, var44, var37, var39, var43, method317(arg0.field56, var46), method317(arg0.field57, var46), method317(arg0.field59, var46));
							} else if (arg0.field56 != 12345678) {
								Pix3D.method555(var38, var40, var44, var37, var39, var43, arg0.field56, arg0.field57, arg0.field59);
								return;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.a(IILJQCVNYYR;IIIIB)V")
	public void method316(int arg0, int arg1, Ground arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2.field787.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg2.field787[var9] - field894;
			int var11 = arg2.field788[var9] - field895;
			int var12 = arg2.field789[var9] - field896;
			int var13 = arg1 * var10 + arg6 * var12 >> 16;
			var12 = arg1 * var12 - arg6 * var10 >> 16;
			int var15 = arg0 * var11 - arg3 * var12 >> 16;
			var12 = arg0 * var12 + arg3 * var11 >> 16;
			if (var12 < 50) {
				return;
			}

			if (arg2.field796 != null) {
				Ground.field804[var9] = var13;
				Ground.field805[var9] = var15;
				Ground.field806[var9] = var12;
			}

			Ground.field802[var9] = (var13 << 9) / var12 + Pix3D.field1361;
			Ground.field803[var9] = (var15 << 9) / var12 + Pix3D.field1362;
		}

		Pix3D.field1360 = 0;
		int var17 = arg2.field793.length;
		for (int var18 = 0; var18 < var17; var18++) {
			int var19 = arg2.field793[var18];
			int var20 = arg2.field794[var18];
			int var21 = arg2.field795[var18];
			int var22 = Ground.field802[var19];
			int var23 = Ground.field802[var20];
			int var24 = Ground.field802[var21];
			int var25 = Ground.field803[var19];
			int var26 = Ground.field803[var20];
			int var27 = Ground.field803[var21];
			if ((var22 - var23) * (var27 - var26) - (var24 - var23) * (var25 - var26) > 0) {
				Pix3D.field1357 = false;
				if (var22 < 0 || var23 < 0 || var24 < 0 || var22 > Pix2D.field956 || var23 > Pix2D.field956 || var24 > Pix2D.field956) {
					Pix3D.field1357 = true;
				}

				if (field906 && method318(field907, field908, var25, var26, var27, var22, var23, var24)) {
					field909 = arg5;
					field910 = arg4;
				}

				if (arg2.field796 == null || arg2.field796[var18] == -1) {
					if (arg2.field790[var18] != 12345678) {
						Pix3D.method555(var25, var26, var27, var22, var23, var24, arg2.field790[var18], arg2.field791[var18], arg2.field792[var18]);
					}
				} else if (field875) {
					int var28 = field924[arg2.field796[var18]];
					Pix3D.method555(var25, var26, var27, var22, var23, var24, method317(arg2.field790[var18], var28), method317(arg2.field791[var18], var28), method317(arg2.field792[var18], var28));
				} else if (arg2.field797) {
					Pix3D.method559(var25, var26, var27, var22, var23, var24, arg2.field790[var18], arg2.field791[var18], arg2.field792[var18], Ground.field804[0], Ground.field804[1], Ground.field804[3], Ground.field805[0], Ground.field805[1], Ground.field805[3], Ground.field806[0], Ground.field806[1], Ground.field806[3], arg2.field796[var18]);
				} else {
					Pix3D.method559(var25, var26, var27, var22, var23, var24, arg2.field790[var18], arg2.field791[var18], arg2.field792[var18], Ground.field804[var19], Ground.field804[var20], Ground.field804[var21], Ground.field805[var19], Ground.field805[var20], Ground.field805[var21], Ground.field806[var19], Ground.field806[var20], Ground.field806[var21], arg2.field796[var18]);
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.f(III)I")
	public int method317(int arg0, int arg1) {
		arg0 = 127 - arg0;
		arg0 = (arg1 & 0x7F) * arg0 / 160;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}

		return (arg1 & 0xFF80) + arg0;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIIIII)Z")
	public boolean method318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

	@ObfuscatedName("KJCMXHNO.b(I)V")
	public void method319() {
		int var1 = field912[field886];
		Occlude[] var2 = field913[field886];
		field914 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			Occlude var4 = var2[var3];
			if (var4.field1278 == 1) {
				int var5 = var4.field1274 + 25 - field892;
				if (var5 >= 0 && var5 <= 50) {
					int var6 = var4.field1276 + 25 - field893;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = var4.field1277 + 25 - field893;
					if (var7 > 50) {
						var7 = 50;
					}

					boolean var8 = false;
					while (var6 <= var7) {
						if (field931[var5][var6++]) {
							var8 = true;
							break;
						}
					}

					if (var8) {
						int var9 = field894 - var4.field1279;
						if (var9 > 32) {
							var4.field1285 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field1285 = 2;
							var9 = -var9;
						}

						var4.field1288 = (var4.field1281 - field896 << 8) / var9;
						var4.field1289 = (var4.field1282 - field896 << 8) / var9;
						var4.field1290 = (var4.field1283 - field895 << 8) / var9;
						var4.field1291 = (var4.field1284 - field895 << 8) / var9;
						field915[field914++] = var4;
					}
				}
			} else if (var4.field1278 == 2) {
				int var10 = var4.field1276 + 25 - field893;
				if (var10 >= 0 && var10 <= 50) {
					int var11 = var4.field1274 + 25 - field892;
					if (var11 < 0) {
						var11 = 0;
					}

					int var12 = var4.field1275 + 25 - field892;
					if (var12 > 50) {
						var12 = 50;
					}

					boolean var13 = false;
					while (var11 <= var12) {
						if (field931[var11++][var10]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						int var14 = field896 - var4.field1281;
						if (var14 > 32) {
							var4.field1285 = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}

							var4.field1285 = 4;
							var14 = -var14;
						}

						var4.field1286 = (var4.field1279 - field894 << 8) / var14;
						var4.field1287 = (var4.field1280 - field894 << 8) / var14;
						var4.field1290 = (var4.field1283 - field895 << 8) / var14;
						var4.field1291 = (var4.field1284 - field895 << 8) / var14;
						field915[field914++] = var4;
					}
				}
			} else if (var4.field1278 == 4) {
				int var15 = var4.field1283 - field895;
				if (var15 > 128) {
					int var16 = var4.field1276 + 25 - field893;
					if (var16 < 0) {
						var16 = 0;
					}

					int var17 = var4.field1277 + 25 - field893;
					if (var17 > 50) {
						var17 = 50;
					}

					if (var16 <= var17) {
						int var18 = var4.field1274 + 25 - field892;
						if (var18 < 0) {
							var18 = 0;
						}

						int var19 = var4.field1275 + 25 - field892;
						if (var19 > 50) {
							var19 = 50;
						}

						boolean var20 = false;
						label142: for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (field931[var21][var22]) {
									var20 = true;
									break label142;
								}
							}
						}

						if (var20) {
							var4.field1285 = 5;
							var4.field1286 = (var4.field1279 - field894 << 8) / var15;
							var4.field1287 = (var4.field1280 - field894 << 8) / var15;
							var4.field1288 = (var4.field1281 - field896 << 8) / var15;
							var4.field1289 = (var4.field1282 - field896 << 8) / var15;
							field915[field914++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.g(III)Z")
	public boolean method320(int arg0, int arg1, int arg2) {
		int var4 = field884[arg0][arg1][arg2];
		if (-field887 == var4) {
			return false;
		} else if (field887 == var4) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (method324(var5 + 1, field879[arg0][arg1][arg2], var6 + 1) && method324(var5 + 128 - 1, field879[arg0][arg1 + 1][arg2], var6 + 1) && method324(var5 + 128 - 1, field879[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && method324(var5 + 1, field879[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				field884[arg0][arg1][arg2] = field887;
				return true;
			} else {
				field884[arg0][arg1][arg2] = -field887;
				return false;
			}
		}
	}

	@ObfuscatedName("KJCMXHNO.g(IIII)Z")
	public boolean method321(int arg0, int arg1, int arg2, int arg3) {
		if (!method320(arg0, arg1, arg2)) {
			return false;
		}

		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = field879[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;

		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > field894) {
					if (!method324(var5, var7, var6)) {
						return false;
					}

					if (!method324(var5, var7, var6 + 128)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!method324(var5, var8, var6)) {
						return false;
					}

					if (!method324(var5, var8, var6 + 128)) {
						return false;
					}
				}

				if (!method324(var5, var9, var6)) {
					return false;
				}

				if (!method324(var5, var9, var6 + 128)) {
					return false;
				}

				return true;
			}

			if (arg3 == 2) {
				if (var6 < field896) {
					if (!method324(var5, var7, var6 + 128)) {
						return false;
					}

					if (!method324(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!method324(var5, var8, var6 + 128)) {
						return false;
					}

					if (!method324(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}

				if (!method324(var5, var9, var6 + 128)) {
					return false;
				}

				if (!method324(var5 + 128, var9, var6 + 128)) {
					return false;
				}

				return true;
			}

			if (arg3 == 4) {
				if (var5 < field894) {
					if (!method324(var5 + 128, var7, var6)) {
						return false;
					}

					if (!method324(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!method324(var5 + 128, var8, var6)) {
						return false;
					}

					if (!method324(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}

				if (!method324(var5 + 128, var9, var6)) {
					return false;
				}

				if (!method324(var5 + 128, var9, var6 + 128)) {
					return false;
				}

				return true;
			}

			if (arg3 == 8) {
				if (var6 > field896) {
					if (!method324(var5, var7, var6)) {
						return false;
					}

					if (!method324(var5 + 128, var7, var6)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!method324(var5, var8, var6)) {
						return false;
					}

					if (!method324(var5 + 128, var8, var6)) {
						return false;
					}
				}

				if (!method324(var5, var9, var6)) {
					return false;
				}

				if (!method324(var5 + 128, var9, var6)) {
					return false;
				}

				return true;
			}
		}

		if (!method324(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			if (!method324(var5, var9, var6 + 128)) {
				return false;
			}

			return true;
		} else if (arg3 == 32) {
			if (!method324(var5 + 128, var9, var6 + 128)) {
				return false;
			}

			return true;
		} else if (arg3 == 64) {
			if (!method324(var5 + 128, var9, var6)) {
				return false;
			}

			return true;
		} else if (arg3 == 128) {
			if (!method324(var5, var9, var6)) {
				return false;
			}

			return true;
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("KJCMXHNO.h(IIII)Z")
	public boolean method322(int arg0, int arg1, int arg2, int arg3) {
		if (!method320(arg0, arg1, arg2)) {
			return false;
		}

		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		if (method324(var5 + 1, field879[arg0][arg1][arg2] - arg3, var6 + 1) && method324(var5 + 128 - 1, field879[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && method324(var5 + 128 - 1, field879[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && method324(var5 + 1, field879[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("KJCMXHNO.a(IIIIII)Z")
	public boolean method323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (field884[arg0][var9][var10] == -field887) {
						return false;
					}
				}
			}

			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = field879[arg0][arg1][arg3] - arg5;
			if (!method324(var11, var13, var12)) {
				return false;
			}

			int var14 = (arg2 << 7) - 1;
			if (!method324(var14, var13, var12)) {
				return false;
			}

			int var15 = (arg4 << 7) - 1;
			if (!method324(var11, var13, var15)) {
				return false;
			}

			if (!method324(var14, var13, var15)) {
				return false;
			}

			return true;
		}

		if (method320(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			if (method324(var7 + 1, field879[arg0][arg1][arg3] - arg5, var8 + 1) && method324(var7 + 128 - 1, field879[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && method324(var7 + 128 - 1, field879[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && method324(var7 + 1, field879[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1)) {
				return true;
			}

			return false;
		}

		return false;
	}

	@ObfuscatedName("KJCMXHNO.h(III)Z")
	public boolean method324(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field914; var4++) {
			Occlude var5 = field915[var4];
			if (var5.field1285 == 1) {
				int var6 = var5.field1279 - arg0;
				if (var6 > 0) {
					int var7 = (var5.field1288 * var6 >> 8) + var5.field1281;
					int var8 = (var5.field1289 * var6 >> 8) + var5.field1282;
					int var9 = (var5.field1290 * var6 >> 8) + var5.field1283;
					int var10 = (var5.field1291 * var6 >> 8) + var5.field1284;
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.field1285 == 2) {
				int var11 = arg0 - var5.field1279;
				if (var11 > 0) {
					int var12 = (var5.field1288 * var11 >> 8) + var5.field1281;
					int var13 = (var5.field1289 * var11 >> 8) + var5.field1282;
					int var14 = (var5.field1290 * var11 >> 8) + var5.field1283;
					int var15 = (var5.field1291 * var11 >> 8) + var5.field1284;
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.field1285 == 3) {
				int var16 = var5.field1281 - arg2;
				if (var16 > 0) {
					int var17 = (var5.field1286 * var16 >> 8) + var5.field1279;
					int var18 = (var5.field1287 * var16 >> 8) + var5.field1280;
					int var19 = (var5.field1290 * var16 >> 8) + var5.field1283;
					int var20 = (var5.field1291 * var16 >> 8) + var5.field1284;
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.field1285 == 4) {
				int var21 = arg2 - var5.field1281;
				if (var21 > 0) {
					int var22 = (var5.field1286 * var21 >> 8) + var5.field1279;
					int var23 = (var5.field1287 * var21 >> 8) + var5.field1280;
					int var24 = (var5.field1290 * var21 >> 8) + var5.field1283;
					int var25 = (var5.field1291 * var21 >> 8) + var5.field1284;
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.field1285 == 5) {
				int var26 = arg1 - var5.field1283;
				if (var26 > 0) {
					int var27 = (var5.field1286 * var26 >> 8) + var5.field1279;
					int var28 = (var5.field1287 * var26 >> 8) + var5.field1280;
					int var29 = (var5.field1288 * var26 >> 8) + var5.field1281;
					int var30 = (var5.field1289 * var26 >> 8) + var5.field1282;
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}

		return false;
	}
}
