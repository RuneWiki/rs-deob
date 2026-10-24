package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.graphics.Pix2D;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemandProvider;
import jagex2.io.Packet;

@ObfuscatedName("LZYQDKJV")
public class Model extends ModelSource {

	@ObfuscatedName("LZYQDKJV.eb")
	public boolean field1070 = false;

	@ObfuscatedName("LZYQDKJV.y")
	public int field1038;

	@ObfuscatedName("LZYQDKJV.C")
	public int field1042;

	@ObfuscatedName("LZYQDKJV.O")
	public int field1054;

	@ObfuscatedName("LZYQDKJV.z")
	public int[] field1039;

	@ObfuscatedName("LZYQDKJV.A")
	public int[] field1040;

	@ObfuscatedName("LZYQDKJV.B")
	public int[] field1041;

	@ObfuscatedName("LZYQDKJV.D")
	public int[] field1043;

	@ObfuscatedName("LZYQDKJV.E")
	public int[] field1044;

	@ObfuscatedName("LZYQDKJV.F")
	public int[] field1045;

	@ObfuscatedName("LZYQDKJV.P")
	public int[] field1055;

	@ObfuscatedName("LZYQDKJV.Q")
	public int[] field1056;

	@ObfuscatedName("LZYQDKJV.R")
	public int[] field1057;

	@ObfuscatedName("LZYQDKJV.ab")
	public int[] field1066;

	@ObfuscatedName("LZYQDKJV.J")
	public int[] field1049;

	@ObfuscatedName("LZYQDKJV.K")
	public int[] field1050;

	@ObfuscatedName("LZYQDKJV.N")
	public int field1053;

	@ObfuscatedName("LZYQDKJV.L")
	public int[] field1051;

	@ObfuscatedName("LZYQDKJV.bb")
	public int[] field1067;

	@ObfuscatedName("LZYQDKJV.M")
	public int[] field1052;

	@ObfuscatedName("LZYQDKJV.G")
	public int[] field1046;

	@ObfuscatedName("LZYQDKJV.H")
	public int[] field1047;

	@ObfuscatedName("LZYQDKJV.I")
	public int[] field1048;

	@ObfuscatedName("LZYQDKJV.fb")
	public VertexNormal[] field1071;

	@ObfuscatedName("LZYQDKJV.W")
	public int field1062;

	@ObfuscatedName("LZYQDKJV.V")
	public int field1061;

	@ObfuscatedName("LZYQDKJV.Y")
	public int field1064;

	@ObfuscatedName("LZYQDKJV.X")
	public int field1063;

	@ObfuscatedName("LZYQDKJV.T")
	public int field1059;

	@ObfuscatedName("LZYQDKJV.U")
	public int field1060;

	@ObfuscatedName("LZYQDKJV.S")
	public int field1058;

	@ObfuscatedName("LZYQDKJV.t")
	public static Model field1033 = new Model();

	@ObfuscatedName("LZYQDKJV.u")
	public static int[] field1034 = new int[2000];

	@ObfuscatedName("LZYQDKJV.v")
	public static int[] field1035 = new int[2000];

	@ObfuscatedName("LZYQDKJV.w")
	public static int[] field1036 = new int[2000];

	@ObfuscatedName("LZYQDKJV.x")
	public static int[] field1037 = new int[2000];

	@ObfuscatedName("LZYQDKJV.ib")
	public static boolean[] field1074 = new boolean[4096];

	@ObfuscatedName("LZYQDKJV.jb")
	public static boolean[] field1075 = new boolean[4096];

	@ObfuscatedName("LZYQDKJV.kb")
	public static int[] field1076 = new int[4096];

	@ObfuscatedName("LZYQDKJV.lb")
	public static int[] field1077 = new int[4096];

	@ObfuscatedName("LZYQDKJV.mb")
	public static int[] field1078 = new int[4096];

	@ObfuscatedName("LZYQDKJV.nb")
	public static int[] field1079 = new int[4096];

	@ObfuscatedName("LZYQDKJV.ob")
	public static int[] field1080 = new int[4096];

	@ObfuscatedName("LZYQDKJV.pb")
	public static int[] field1081 = new int[4096];

	@ObfuscatedName("LZYQDKJV.qb")
	public static int[] field1082 = new int[1500];

	@ObfuscatedName("LZYQDKJV.rb")
	public static int[][] field1083 = new int[1500][512];

	@ObfuscatedName("LZYQDKJV.sb")
	public static int[] field1084 = new int[12];

	@ObfuscatedName("LZYQDKJV.tb")
	public static int[][] field1085 = new int[12][2000];

	@ObfuscatedName("LZYQDKJV.ub")
	public static int[] field1086 = new int[2000];

	@ObfuscatedName("LZYQDKJV.vb")
	public static int[] field1087 = new int[2000];

	@ObfuscatedName("LZYQDKJV.wb")
	public static int[] field1088 = new int[12];

	@ObfuscatedName("LZYQDKJV.xb")
	public static int[] field1089 = new int[10];

	@ObfuscatedName("LZYQDKJV.yb")
	public static int[] field1090 = new int[10];

	@ObfuscatedName("LZYQDKJV.zb")
	public static int[] field1091 = new int[10];

	@ObfuscatedName("LZYQDKJV.Hb")
	public static int[] field1099 = new int[1000];

	@ObfuscatedName("LZYQDKJV.Ib")
	public static int[] field1100 = Pix3D.field1365;

	@ObfuscatedName("LZYQDKJV.Jb")
	public static int[] field1101 = Pix3D.field1366;

	@ObfuscatedName("LZYQDKJV.Kb")
	public static int[] field1102 = Pix3D.field1377;

	@ObfuscatedName("LZYQDKJV.Lb")
	public static int[] field1103 = Pix3D.field1364;

	@ObfuscatedName("LZYQDKJV.s")
	public static int field1032;

	@ObfuscatedName("LZYQDKJV.Z")
	public int field1065;

	@ObfuscatedName("LZYQDKJV.Ab")
	public static int field1092;

	@ObfuscatedName("LZYQDKJV.Bb")
	public static int field1093;

	@ObfuscatedName("LZYQDKJV.Cb")
	public static int field1094;

	@ObfuscatedName("LZYQDKJV.Eb")
	public static int field1096;

	@ObfuscatedName("LZYQDKJV.Fb")
	public static int field1097;

	@ObfuscatedName("LZYQDKJV.Gb")
	public static int field1098;

	@ObfuscatedName("LZYQDKJV.hb")
	public static OnDemandProvider field1073;

	@ObfuscatedName("LZYQDKJV.Db")
	public static boolean field1095;

	@ObfuscatedName("LZYQDKJV.gb")
	public static Metadata[] field1072;

	@ObfuscatedName("LZYQDKJV.cb")
	public int[][] field1068;

	@ObfuscatedName("LZYQDKJV.db")
	public int[][] field1069;

	@ObfuscatedName("LZYQDKJV.a(Z)V")
	public static void method355() {
		field1072 = null;
		field1074 = null;
		field1075 = null;
		field1076 = null;
		field1077 = null;
		field1078 = null;
		field1079 = null;
		field1080 = null;
		field1081 = null;
		field1082 = null;
		field1083 = null;
		field1084 = null;
		field1085 = null;
		field1086 = null;
		field1087 = null;
		field1088 = null;
		field1100 = null;
		field1101 = null;
		field1102 = null;
		field1103 = null;
	}

	@ObfuscatedName("LZYQDKJV.a(ILQUWTPUDC;)V")
	public static void method356(int arg0, OnDemandProvider arg1) {
		field1072 = new Metadata[arg0];
		field1073 = arg1;
	}

	@ObfuscatedName("LZYQDKJV.a([BIB)V")
	public static void method357(byte[] arg0, int arg1) {
		if (arg0 == null) {
			Metadata var2 = field1072[arg1] = new Metadata();
			var2.field961 = 0;
			var2.field962 = 0;
			var2.field963 = 0;
		} else {
			Packet var3 = new Packet(arg0);
			var3.pos = arg0.length - 18;
			Metadata var4 = field1072[arg1] = new Metadata();
			var4.field960 = arg0;
			var4.field961 = var3.g2();
			var4.field962 = var3.g2();
			var4.field963 = var3.g1();
			int var5 = var3.g1();
			int var6 = var3.g1();
			int var7 = var3.g1();
			int var8 = var3.g1();
			int var9 = var3.g1();
			int var10 = var3.g2();
			int var11 = var3.g2();
			int var12 = var3.g2();
			int var13 = var3.g2();
			int var14 = 0;
			var4.field964 = var14;
			var14 += var4.field961;
			var4.field970 = var14;
			var14 += var4.field962;
			var4.field973 = var14;
			if (var6 == 255) {
				var14 += var4.field962;
			} else {
				var4.field973 = -var6 - 1;
			}

			var4.field975 = var14;
			if (var8 == 1) {
				var14 += var4.field962;
			} else {
				var4.field975 = -1;
			}

			var4.field972 = var14;
			if (var5 == 1) {
				var14 += var4.field962;
			} else {
				var4.field972 = -1;
			}

			var4.field968 = var14;
			if (var9 == 1) {
				var14 += var4.field961;
			} else {
				var4.field968 = -1;
			}

			var4.field974 = var14;
			if (var7 == 1) {
				var14 += var4.field962;
			} else {
				var4.field974 = -1;
			}

			var4.field969 = var14;
			var14 += var13;
			var4.field971 = var14;
			var14 += var4.field962 * 2;
			var4.field976 = var14;
			var14 += var4.field963 * 6;
			var4.field965 = var14;
			var14 += var10;
			var4.field966 = var14;
			var14 += var11;
			var4.field967 = var14;
			int var10000 = var12 + var14;
		}
	}

	@ObfuscatedName("LZYQDKJV.a(II)V")
	public static void method358(int arg0) {
		field1072[arg0] = null;
	}

	@ObfuscatedName("LZYQDKJV.a(I)LLZYQDKJV;")
	public static Model method359(int arg0) {
		if (field1072 == null) {
			return null;
		}

		Metadata var1 = field1072[arg0];
		if (var1 == null) {
			field1073.method456(arg0);
			return null;
		}

		return new Model(arg0);
	}

	@ObfuscatedName("LZYQDKJV.b(I)Z")
	public static boolean method360(int arg0) {
		if (field1072 == null) {
			return false;
		}

		Metadata var1 = field1072[arg0];
		if (var1 == null) {
			field1073.method456(arg0);
			return false;
		}

		return true;
	}

	public Model() {
	}

	public Model(int arg0) {
		field1032++;
		Metadata var2 = field1072[arg0];
		field1038 = var2.field961;
		field1042 = var2.field962;
		field1054 = var2.field963;
		field1039 = new int[field1038];
		field1040 = new int[field1038];
		field1041 = new int[field1038];
		field1043 = new int[field1042];
		field1044 = new int[field1042];
		field1045 = new int[field1042];
		field1055 = new int[field1054];
		field1056 = new int[field1054];
		field1057 = new int[field1054];

		if (var2.field968 >= 0) {
			field1066 = new int[field1038];
		}

		if (var2.field972 >= 0) {
			field1049 = new int[field1042];
		}

		if (var2.field973 >= 0) {
			field1050 = new int[field1042];
		} else {
			field1053 = -var2.field973 - 1;
		}

		if (var2.field974 >= 0) {
			field1051 = new int[field1042];
		}

		if (var2.field975 >= 0) {
			field1067 = new int[field1042];
		}

		field1052 = new int[field1042];
		Packet var3 = new Packet(var2.field960);
		var3.pos = var2.field964;
		Packet var4 = new Packet(var2.field960);
		var4.pos = var2.field965;
		Packet var5 = new Packet(var2.field960);
		var5.pos = var2.field966;
		Packet var6 = new Packet(var2.field960);
		var6.pos = var2.field967;
		Packet var7 = new Packet(var2.field960);
		var7.pos = var2.field968;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		for (int var11 = 0; var11 < field1038; var11++) {
			int var12 = var3.g1();
			int var13 = 0;
			if ((var12 & 0x1) != 0) {
				var13 = var4.gsmart();
			}

			int var14 = 0;
			if ((var12 & 0x2) != 0) {
				var14 = var5.gsmart();
			}

			int var15 = 0;
			if ((var12 & 0x4) != 0) {
				var15 = var6.gsmart();
			}

			field1039[var11] = var8 + var13;
			field1040[var11] = var9 + var14;
			field1041[var11] = var10 + var15;
			var8 = field1039[var11];
			var9 = field1040[var11];
			var10 = field1041[var11];

			if (field1066 != null) {
				field1066[var11] = var7.g1();
			}
		}

		var3.pos = var2.field971;
		var4.pos = var2.field972;
		var5.pos = var2.field973;
		var6.pos = var2.field974;
		var7.pos = var2.field975;

		for (int var16 = 0; var16 < field1042; var16++) {
			field1052[var16] = var3.g2();

			if (field1049 != null) {
				field1049[var16] = var4.g1();
			}

			if (field1050 != null) {
				field1050[var16] = var5.g1();
			}

			if (field1051 != null) {
				field1051[var16] = var6.g1();
			}

			if (field1067 != null) {
				field1067[var16] = var7.g1();
			}
		}

		var3.pos = var2.field969;
		var4.pos = var2.field970;
		int var17 = 0;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		for (int var21 = 0; var21 < field1042; var21++) {
			int var22 = var4.g1();
			if (var22 == 1) {
				var17 = var3.gsmart() + var20;
				var18 = var3.gsmart() + var17;
				var19 = var3.gsmart() + var18;
				var20 = var19;
				field1043[var21] = var17;
				field1044[var21] = var18;
				field1045[var21] = var19;
			}

			if (var22 == 2) {
				var18 = var19;
				var19 = var3.gsmart() + var20;
				var20 = var19;
				field1043[var21] = var17;
				field1044[var21] = var18;
				field1045[var21] = var19;
			}

			if (var22 == 3) {
				var17 = var19;
				var19 = var3.gsmart() + var20;
				var20 = var19;
				field1043[var21] = var17;
				field1044[var21] = var18;
				field1045[var21] = var19;
			}

			if (var22 == 4) {
				int var25 = var17;
				var17 = var18;
				var18 = var25;
				var19 = var3.gsmart() + var20;
				var20 = var19;
				field1043[var21] = var17;
				field1044[var21] = var25;
				field1045[var21] = var19;
			}
		}

		var3.pos = var2.field976;

		for (int var26 = 0; var26 < field1054; var26++) {
			field1055[var26] = var3.g2();
			field1056[var26] = var3.g2();
			field1057[var26] = var3.g2();
		}
	}

	public Model(int arg0, Model[] arg1) {
		field1032++;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		field1038 = 0;
		field1042 = 0;
		field1054 = 0;
		field1053 = -1;
		for (int var7 = 0; var7 < arg0; var7++) {
			Model var8 = arg1[var7];
			if (var8 != null) {
				field1038 += var8.field1038;
				field1042 += var8.field1042;
				field1054 += var8.field1054;
				var3 |= var8.field1049 != null;

				if (var8.field1050 == null) {
					if (field1053 == -1) {
						field1053 = var8.field1053;
					}

					if (field1053 != var8.field1053) {
						var4 = true;
					}
				} else {
					var4 = true;
				}

				var5 |= var8.field1051 != null;
				var6 |= var8.field1067 != null;
			}
		}

		field1039 = new int[field1038];
		field1040 = new int[field1038];
		field1041 = new int[field1038];
		field1066 = new int[field1038];
		field1043 = new int[field1042];
		field1044 = new int[field1042];
		field1045 = new int[field1042];
		field1055 = new int[field1054];
		field1056 = new int[field1054];
		field1057 = new int[field1054];

		if (var3) {
			field1049 = new int[field1042];
		}

		if (var4) {
			field1050 = new int[field1042];
		}

		if (var5) {
			field1051 = new int[field1042];
		}

		if (var6) {
			field1067 = new int[field1042];
		}

		field1052 = new int[field1042];
		field1038 = 0;
		field1042 = 0;
		field1054 = 0;
		int var9 = 0;
		for (int var10 = 0; var10 < arg0; var10++) {
			Model var11 = arg1[var10];
			if (var11 != null) {
				for (int var12 = 0; var12 < var11.field1042; var12++) {
					if (var3) {
						if (var11.field1049 == null) {
							field1049[field1042] = 0;
						} else {
							int var13 = var11.field1049[var12];
							if ((var13 & 0x2) == 2) {
								var13 += var9 << 2;
							}

							field1049[field1042] = var13;
						}
					}

					if (var4) {
						if (var11.field1050 == null) {
							field1050[field1042] = var11.field1053;
						} else {
							field1050[field1042] = var11.field1050[var12];
						}
					}

					if (var5) {
						if (var11.field1051 == null) {
							field1051[field1042] = 0;
						} else {
							field1051[field1042] = var11.field1051[var12];
						}
					}

					if (var6 && var11.field1067 != null) {
						field1067[field1042] = var11.field1067[var12];
					}

					field1052[field1042] = var11.field1052[var12];
					field1043[field1042] = method362(var11, var11.field1043[var12]);
					field1044[field1042] = method362(var11, var11.field1044[var12]);
					field1045[field1042] = method362(var11, var11.field1045[var12]);
					field1042++;
				}

				for (int var14 = 0; var14 < var11.field1054; var14++) {
					field1055[field1054] = method362(var11, var11.field1055[var14]);
					field1056[field1054] = method362(var11, var11.field1056[var14]);
					field1057[field1054] = method362(var11, var11.field1057[var14]);
					field1054++;
				}

				var9 += var11.field1054;
			}
		}
	}

	public Model(int arg0, boolean arg1, Model[] arg2) {
		field1032++;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		field1038 = 0;
		field1042 = 0;
		field1054 = 0;
		field1053 = -1;
		for (int var8 = 0; var8 < arg0; var8++) {
			Model var9 = arg2[var8];
			if (var9 != null) {
				field1038 += var9.field1038;
				field1042 += var9.field1042;
				field1054 += var9.field1054;
				var4 |= var9.field1049 != null;

				if (var9.field1050 == null) {
					if (field1053 == -1) {
						field1053 = var9.field1053;
					}

					if (field1053 != var9.field1053) {
						var5 = true;
					}
				} else {
					var5 = true;
				}

				var6 |= var9.field1051 != null;
				var7 |= var9.field1052 != null;
			}
		}

		field1039 = new int[field1038];
		field1040 = new int[field1038];
		field1041 = new int[field1038];
		field1043 = new int[field1042];
		field1044 = new int[field1042];
		field1045 = new int[field1042];
		field1046 = new int[field1042];
		field1047 = new int[field1042];
		field1048 = new int[field1042];
		field1055 = new int[field1054];
		field1056 = new int[field1054];
		field1057 = new int[field1054];

		if (var4) {
			field1049 = new int[field1042];
		}

		if (var5) {
			field1050 = new int[field1042];
		}

		if (var6) {
			field1051 = new int[field1042];
		}

		if (var7) {
			field1052 = new int[field1042];
		}

		field1038 = 0;
		field1042 = 0;
		field1054 = 0;
		int var10 = 0;
		for (int var11 = 0; var11 < arg0; var11++) {
			Model var12 = arg2[var11];
			if (var12 != null) {
				int var13 = field1038;

				for (int var14 = 0; var14 < var12.field1038; var14++) {
					field1039[field1038] = var12.field1039[var14];
					field1040[field1038] = var12.field1040[var14];
					field1041[field1038] = var12.field1041[var14];
					field1038++;
				}

				for (int var15 = 0; var15 < var12.field1042; var15++) {
					field1043[field1042] = var12.field1043[var15] + var13;
					field1044[field1042] = var12.field1044[var15] + var13;
					field1045[field1042] = var12.field1045[var15] + var13;
					field1046[field1042] = var12.field1046[var15];
					field1047[field1042] = var12.field1047[var15];
					field1048[field1042] = var12.field1048[var15];

					if (var4) {
						if (var12.field1049 == null) {
							field1049[field1042] = 0;
						} else {
							int var16 = var12.field1049[var15];
							if ((var16 & 0x2) == 2) {
								var16 += var10 << 2;
							}

							field1049[field1042] = var16;
						}
					}

					if (var5) {
						if (var12.field1050 == null) {
							field1050[field1042] = var12.field1053;
						} else {
							field1050[field1042] = var12.field1050[var15];
						}
					}

					if (var6) {
						if (var12.field1051 == null) {
							field1051[field1042] = 0;
						} else {
							field1051[field1042] = var12.field1051[var15];
						}
					}

					if (var7 && var12.field1052 != null) {
						field1052[field1042] = var12.field1052[var15];
					}

					field1042++;
				}

				for (int var17 = 0; var17 < var12.field1054; var17++) {
					field1055[field1054] = var12.field1055[var17] + var13;
					field1056[field1054] = var12.field1056[var17] + var13;
					field1057[field1054] = var12.field1057[var17] + var13;
					field1054++;
				}

				var10 += var12.field1054;
			}
		}

		method363();
	}

	public Model(boolean arg0, boolean arg1, Model arg2, boolean arg3) {
		field1032++;
		field1038 = arg2.field1038;
		field1042 = arg2.field1042;
		field1054 = arg2.field1054;

		if (arg0) {
			field1039 = arg2.field1039;
			field1040 = arg2.field1040;
			field1041 = arg2.field1041;
		} else {
			field1039 = new int[field1038];
			field1040 = new int[field1038];
			field1041 = new int[field1038];
			for (int var5 = 0; var5 < field1038; var5++) {
				field1039[var5] = arg2.field1039[var5];
				field1040[var5] = arg2.field1040[var5];
				field1041[var5] = arg2.field1041[var5];
			}
		}

		if (arg1) {
			field1052 = arg2.field1052;
		} else {
			field1052 = new int[field1042];
			for (int var6 = 0; var6 < field1042; var6++) {
				field1052[var6] = arg2.field1052[var6];
			}
		}

		if (arg3) {
			field1051 = arg2.field1051;
		} else {
			field1051 = new int[field1042];
			if (arg2.field1051 == null) {
				for (int var7 = 0; var7 < field1042; var7++) {
					field1051[var7] = 0;
				}
			} else {
				for (int var8 = 0; var8 < field1042; var8++) {
					field1051[var8] = arg2.field1051[var8];
				}
			}
		}

		field1066 = arg2.field1066;
		field1067 = arg2.field1067;
		field1049 = arg2.field1049;
		field1043 = arg2.field1043;
		field1044 = arg2.field1044;
		field1045 = arg2.field1045;
		field1050 = arg2.field1050;
		field1053 = arg2.field1053;
		field1055 = arg2.field1055;
		field1056 = arg2.field1056;
		field1057 = arg2.field1057;
	}

	public Model(boolean arg0, boolean arg1, Model arg2) {
		field1032++;
		field1038 = arg2.field1038;
		field1042 = arg2.field1042;
		field1054 = arg2.field1054;

		if (arg0) {
			field1040 = new int[field1038];
			for (int var4 = 0; var4 < field1038; var4++) {
				field1040[var4] = arg2.field1040[var4];
			}
		} else {
			field1040 = arg2.field1040;
		}

		if (arg1) {
			field1046 = new int[field1042];
			field1047 = new int[field1042];
			field1048 = new int[field1042];
			for (int var5 = 0; var5 < field1042; var5++) {
				field1046[var5] = arg2.field1046[var5];
				field1047[var5] = arg2.field1047[var5];
				field1048[var5] = arg2.field1048[var5];
			}

			field1049 = new int[field1042];
			if (arg2.field1049 == null) {
				for (int var6 = 0; var6 < field1042; var6++) {
					field1049[var6] = 0;
				}
			} else {
				for (int var7 = 0; var7 < field1042; var7++) {
					field1049[var7] = arg2.field1049[var7];
				}
			}

			field1460 = new VertexNormal[field1038];
			for (int var8 = 0; var8 < field1038; var8++) {
				VertexNormal var9 = field1460[var8] = new VertexNormal();
				VertexNormal var10 = arg2.field1460[var8];
				var9.field1292 = var10.field1292;
				var9.field1293 = var10.field1293;
				var9.field1294 = var10.field1294;
				var9.field1295 = var10.field1295;
			}

			field1071 = arg2.field1071;
		} else {
			field1046 = arg2.field1046;
			field1047 = arg2.field1047;
			field1048 = arg2.field1048;
			field1049 = arg2.field1049;
		}

		field1039 = arg2.field1039;
		field1041 = arg2.field1041;
		field1052 = arg2.field1052;
		field1051 = arg2.field1051;
		field1050 = arg2.field1050;
		field1053 = arg2.field1053;
		field1043 = arg2.field1043;
		field1044 = arg2.field1044;
		field1045 = arg2.field1045;
		field1055 = arg2.field1055;
		field1056 = arg2.field1056;
		field1057 = arg2.field1057;
		field1461 = arg2.field1461;
		field1062 = arg2.field1062;
		field1061 = arg2.field1061;
		field1064 = arg2.field1064;
		field1063 = arg2.field1063;
		field1059 = arg2.field1059;
		field1060 = arg2.field1060;
		field1058 = arg2.field1058;
	}

	@ObfuscatedName("LZYQDKJV.a(ZLLZYQDKJV;I)V")
	public void method361(boolean arg0, Model arg1) {
		field1038 = arg1.field1038;
		field1042 = arg1.field1042;
		field1054 = arg1.field1054;

		if (field1034.length < field1038) {
			field1034 = new int[field1038 + 100];
			field1035 = new int[field1038 + 100];
			field1036 = new int[field1038 + 100];
		}

		field1039 = field1034;
		field1040 = field1035;
		field1041 = field1036;
		for (int var3 = 0; var3 < field1038; var3++) {
			field1039[var3] = arg1.field1039[var3];
			field1040[var3] = arg1.field1040[var3];
			field1041[var3] = arg1.field1041[var3];
		}

		if (arg0) {
			field1051 = arg1.field1051;
		} else {
			if (field1037.length < field1042) {
				field1037 = new int[field1042 + 100];
			}

			field1051 = field1037;
			if (arg1.field1051 == null) {
				for (int var4 = 0; var4 < field1042; var4++) {
					field1051[var4] = 0;
				}
			} else {
				for (int var5 = 0; var5 < field1042; var5++) {
					field1051[var5] = arg1.field1051[var5];
				}
			}
		}

		field1049 = arg1.field1049;
		field1052 = arg1.field1052;
		field1050 = arg1.field1050;
		field1053 = arg1.field1053;
		field1069 = arg1.field1069;
		field1068 = arg1.field1068;
		field1043 = arg1.field1043;
		field1044 = arg1.field1044;
		field1045 = arg1.field1045;
		field1046 = arg1.field1046;
		field1047 = arg1.field1047;
		field1048 = arg1.field1048;
		field1055 = arg1.field1055;
		field1056 = arg1.field1056;
		field1057 = arg1.field1057;
	}

	@ObfuscatedName("LZYQDKJV.a(LLZYQDKJV;I)I")
	public final int method362(Model arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.field1039[arg1];
		int var5 = arg0.field1040[arg1];
		int var6 = arg0.field1041[arg1];
		for (int var7 = 0; var7 < field1038; var7++) {
			if (field1039[var7] == var4 && field1040[var7] == var5 && field1041[var7] == var6) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			field1039[field1038] = var4;
			field1040[field1038] = var5;
			field1041[field1038] = var6;

			if (arg0.field1066 != null) {
				field1066[field1038] = arg0.field1066[arg1];
			}

			var3 = field1038++;
		}

		return var3;
	}

	@ObfuscatedName("LZYQDKJV.c(I)V")
	public void method363() {
		field1461 = 0;
		field1061 = 0;
		field1062 = 0;
		for (int var1 = 0; var1 < field1038; var1++) {
			int var2 = field1039[var1];
			int var3 = field1040[var1];
			int var4 = field1041[var1];

			if (-var3 > field1461) {
				field1461 = -var3;
			}

			if (var3 > field1062) {
				field1062 = var3;
			}

			int var5 = var2 * var2 + var4 * var4;
			if (var5 > field1061) {
				field1061 = var5;
			}
		}

		field1061 = (int) (Math.sqrt(field1061) + 0.99D);
		field1064 = (int) (Math.sqrt(field1461 * field1461 + field1061 * field1061) + 0.99D);
		field1063 = field1064 + (int) (Math.sqrt(field1062 * field1062 + field1061 * field1061) + 0.99D);
	}

	@ObfuscatedName("LZYQDKJV.d(I)V")
	public void method364() {
		field1461 = 0;
		field1062 = 0;
		for (int var1 = 0; var1 < field1038; var1++) {
			int var2 = field1040[var1];
			if (-var2 > field1461) {
				field1461 = -var2;
			}

			if (var2 > field1062) {
				field1062 = var2;
			}
		}

		field1064 = (int) (Math.sqrt(field1461 * field1461 + field1061 * field1061) + 0.99D);
		field1063 = field1064 + (int) (Math.sqrt(field1062 * field1062 + field1061 * field1061) + 0.99D);
	}

	@ObfuscatedName("LZYQDKJV.e(I)V")
	public void method365() {
		field1461 = 0;
		field1061 = 0;
		field1062 = 0;
		int var1 = 32767;
		int var2 = -32767;
		int var3 = -32767;
		int var4 = 32767;
		for (int var5 = 0; var5 < field1038; var5++) {
			int var6 = field1039[var5];
			int var7 = field1040[var5];
			int var8 = field1041[var5];

			if (var6 < var1) {
				var1 = var6;
			}

			if (var6 > var2) {
				var2 = var6;
			}

			if (var8 < var4) {
				var4 = var8;
			}

			if (var8 > var3) {
				var3 = var8;
			}

			if (-var7 > field1461) {
				field1461 = -var7;
			}

			if (var7 > field1062) {
				field1062 = var7;
			}

			int var9 = var6 * var6 + var8 * var8;
			if (var9 > field1061) {
				field1061 = var9;
			}
		}

		field1061 = (int) Math.sqrt(field1061);
		field1064 = (int) Math.sqrt(field1461 * field1461 + field1061 * field1061);
		field1063 = field1064 + (int) Math.sqrt(field1062 * field1062 + field1061 * field1061);
		field1059 = (var1 << 16) + (var2 & 0xFFFF);
		field1060 = (var3 << 16) + (var4 & 0xFFFF);
	}

	@ObfuscatedName("LZYQDKJV.f(I)V")
	public void method366() {
		if (field1066 != null) {
			int[] var1 = new int[256];
			int var2 = 0;
			for (int var3 = 0; var3 < field1038; var3++) {
				int var4 = field1066[var3];
				var1[var4]++;

				if (var4 > var2) {
					var2 = var4;
				}
			}

			field1068 = new int[var2 + 1][];
			for (int var5 = 0; var5 <= var2; var5++) {
				field1068[var5] = new int[var1[var5]];
				var1[var5] = 0;
			}

			int var6 = 0;
			while (var6 < field1038) {
				int var7 = field1066[var6];
				field1068[var7][var1[var7]++] = var6++;
			}

			field1066 = null;
		}

		if (field1067 != null) {
			int[] var8 = new int[256];
			int var9 = 0;
			for (int var10 = 0; var10 < field1042; var10++) {
				int var11 = field1067[var10];
				var8[var11]++;

				if (var11 > var9) {
					var9 = var11;
				}
			}

			field1069 = new int[var9 + 1][];
			for (int var12 = 0; var12 <= var9; var12++) {
				field1069[var12] = new int[var8[var12]];
				var8[var12] = 0;
			}

			int var13 = 0;
			while (var13 < field1042) {
				int var14 = field1067[var13];
				field1069[var14][var8[var14]++] = var13++;
			}

			field1067 = null;
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IB)V")
	public void method367(int arg0) {
		if (field1068 != null && arg0 != -1) {
			AnimFrame var2 = AnimFrame.method264(arg0);
			if (var2 != null) {
				AnimBase var3 = var2.field814;
				field1092 = 0;
				field1093 = 0;
				field1094 = 0;

				for (int var4 = 0; var4 < var2.field815; var4++) {
					int var5 = var2.field816[var4];
					method369(var3.field1297[var5], var3.field1298[var5], var2.field817[var4], var2.field818[var4], var2.field819[var4]);
				}
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.a(III[I)V")
	public void method368(int arg0, int arg1, int[] arg2) {
		if (arg1 != -1) {
			if (arg2 == null || arg0 == -1) {
				method367(arg1);
			} else {
				AnimFrame var4 = AnimFrame.method264(arg1);
				if (var4 != null) {
					AnimFrame var5 = AnimFrame.method264(arg0);
					if (var5 == null) {
						method367(arg1);
					} else {
						AnimBase var6 = var4.field814;
						field1092 = 0;
						field1093 = 0;
						field1094 = 0;
						byte var7 = 0;
						int var15 = var7 + 1;
						int var8 = arg2[var7];
						for (int var9 = 0; var9 < var4.field815; var9++) {
							int var10 = var4.field816[var9];
							while (var10 > var8) {
								var8 = arg2[var15++];
							}

							if (var8 != var10 || var6.field1297[var10] == 0) {
								method369(var6.field1297[var10], var6.field1298[var10], var4.field817[var9], var4.field818[var9], var4.field819[var9]);
							}
						}

						field1092 = 0;
						field1093 = 0;
						field1094 = 0;
						byte var11 = 0;
						int var16 = var11 + 1;
						int var12 = arg2[var11];
						for (int var13 = 0; var13 < var5.field815; var13++) {
							int var14 = var5.field816[var13];
							while (var14 > var12) {
								var12 = arg2[var16++];
							}

							if (var12 == var14 || var6.field1297[var14] == 0) {
								method369(var6.field1297[var14], var6.field1298[var14], var5.field817[var13], var5.field818[var13], var5.field819[var13]);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.a(I[IIII)V")
	public void method369(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
		int var6 = arg1.length;
		if (arg0 == 0) {
			int var7 = 0;
			field1092 = 0;
			field1093 = 0;
			field1094 = 0;
			for (int var8 = 0; var8 < var6; var8++) {
				int var9 = arg1[var8];
				if (var9 < field1068.length) {
					int[] var10 = field1068[var9];
					for (int var11 = 0; var11 < var10.length; var11++) {
						int var12 = var10[var11];
						field1092 += field1039[var12];
						field1093 += field1040[var12];
						field1094 += field1041[var12];
						var7++;
					}
				}
			}

			if (var7 > 0) {
				field1092 = field1092 / var7 + arg2;
				field1093 = field1093 / var7 + arg3;
				field1094 = field1094 / var7 + arg4;
			} else {
				field1092 = arg2;
				field1093 = arg3;
				field1094 = arg4;
			}
		} else if (arg0 == 1) {
			for (int var13 = 0; var13 < var6; var13++) {
				int var14 = arg1[var13];
				if (var14 < field1068.length) {
					int[] var15 = field1068[var14];
					for (int var16 = 0; var16 < var15.length; var16++) {
						int var17 = var15[var16];
						field1039[var17] += arg2;
						field1040[var17] += arg3;
						field1041[var17] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (int var18 = 0; var18 < var6; var18++) {
				int var19 = arg1[var18];
				if (var19 < field1068.length) {
					int[] var20 = field1068[var19];
					for (int var21 = 0; var21 < var20.length; var21++) {
						int var22 = var20[var21];
						field1039[var22] -= field1092;
						field1040[var22] -= field1093;
						field1041[var22] -= field1094;
						int var23 = (arg2 & 0xFF) * 8;
						int var24 = (arg3 & 0xFF) * 8;
						int var25 = (arg4 & 0xFF) * 8;
						if (var25 != 0) {
							int var26 = field1100[var25];
							int var27 = field1101[var25];
							int var28 = field1040[var22] * var26 + field1039[var22] * var27 >> 16;
							field1040[var22] = field1040[var22] * var27 - field1039[var22] * var26 >> 16;
							field1039[var22] = var28;
						}

						if (var23 != 0) {
							int var29 = field1100[var23];
							int var30 = field1101[var23];
							int var31 = field1040[var22] * var30 - field1041[var22] * var29 >> 16;
							field1041[var22] = field1041[var22] * var30 + field1040[var22] * var29 >> 16;
							field1040[var22] = var31;
						}

						if (var24 != 0) {
							int var32 = field1100[var24];
							int var33 = field1101[var24];
							int var34 = field1041[var22] * var32 + field1039[var22] * var33 >> 16;
							field1041[var22] = field1041[var22] * var33 - field1039[var22] * var32 >> 16;
							field1039[var22] = var34;
						}

						field1039[var22] += field1092;
						field1040[var22] += field1093;
						field1041[var22] += field1094;
					}
				}
			}
		} else if (arg0 == 3) {
			for (int var35 = 0; var35 < var6; var35++) {
				int var36 = arg1[var35];
				if (var36 < field1068.length) {
					int[] var37 = field1068[var36];
					for (int var38 = 0; var38 < var37.length; var38++) {
						int var39 = var37[var38];
						field1039[var39] -= field1092;
						field1040[var39] -= field1093;
						field1041[var39] -= field1094;
						field1039[var39] = field1039[var39] * arg2 / 128;
						field1040[var39] = field1040[var39] * arg3 / 128;
						field1041[var39] = field1041[var39] * arg4 / 128;
						field1039[var39] += field1092;
						field1040[var39] += field1093;
						field1041[var39] += field1094;
					}
				}
			}
		} else if (arg0 == 5 && (field1069 != null && field1051 != null)) {
			for (int var40 = 0; var40 < var6; var40++) {
				int var41 = arg1[var40];
				if (var41 < field1069.length) {
					int[] var42 = field1069[var41];
					for (int var43 = 0; var43 < var42.length; var43++) {
						int var44 = var42[var43];
						field1051[var44] += arg2 * 8;
						if (field1051[var44] < 0) {
							field1051[var44] = 0;
						}

						if (field1051[var44] > 255) {
							field1051[var44] = 255;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.b(Z)V")
	public void method370() {
		for (int var1 = 0; var1 < field1038; var1++) {
			int var2 = field1039[var1];
			field1039[var1] = field1041[var1];
			field1041[var1] = -var2;
		}
	}

	@ObfuscatedName("LZYQDKJV.b(II)V")
	public void method371(int arg0) {
		int var2 = field1100[arg0];
		int var3 = field1101[arg0];
		for (int var4 = 0; var4 < field1038; var4++) {
			int var5 = field1040[var4] * var3 - field1041[var4] * var2 >> 16;
			field1041[var4] = field1041[var4] * var3 + field1040[var4] * var2 >> 16;
			field1040[var4] = var5;
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IIZI)V")
	public void method372(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1038; var4++) {
			field1039[var4] += arg0;
			field1040[var4] += arg2;
			field1041[var4] += arg1;
		}
	}

	@ObfuscatedName("LZYQDKJV.c(II)V")
	public void method373(int arg0, int arg1) {
		for (int var3 = 0; var3 < field1042; var3++) {
			if (field1052[var3] == arg0) {
				field1052[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.g(I)V")
	public void method374() {
		for (int var1 = 0; var1 < field1038; var1++) {
			field1041[var1] = -field1041[var1];
		}

		for (int var2 = 0; var2 < field1042; var2++) {
			int var3 = field1043[var2];
			field1043[var2] = field1045[var2];
			field1045[var2] = var3;
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IIII)V")
	public void method375(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1038; var4++) {
			field1039[var4] = field1039[var4] * arg2 / 128;
			field1040[var4] = field1040[var4] * arg0 / 128;
			field1041[var4] = field1041[var4] * arg1 / 128;
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IIIIIZ)V")
	public final void method376(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = (int) Math.sqrt(arg4 * arg4 + arg2 * arg2 + arg3 * arg3);
		int var8 = arg1 * var7 >> 8;

		if (field1046 == null) {
			field1046 = new int[field1042];
			field1047 = new int[field1042];
			field1048 = new int[field1042];
		}

		if (field1460 == null) {
			field1460 = new VertexNormal[field1038];
			for (int var9 = 0; var9 < field1038; var9++) {
				field1460[var9] = new VertexNormal();
			}
		}

		for (int var10 = 0; var10 < field1042; var10++) {
			int var11 = field1043[var10];
			int var12 = field1044[var10];
			int var13 = field1045[var10];
			int var14 = field1039[var12] - field1039[var11];
			int var15 = field1040[var12] - field1040[var11];
			int var16 = field1041[var12] - field1041[var11];
			int var17 = field1039[var13] - field1039[var11];
			int var18 = field1040[var13] - field1040[var11];
			int var19 = field1041[var13] - field1041[var11];
			int var20 = var15 * var19 - var16 * var18;
			int var21 = var16 * var17 - var14 * var19;
			int var22;
			for (var22 = var14 * var18 - var15 * var17; var20 > 8192 || var21 > 8192 || var22 > 8192 || var20 < -8192 || var21 < -8192 || var22 < -8192; var22 >>= 1) {
				var20 >>= 1;
				var21 >>= 1;
			}

			int var23 = (int) Math.sqrt(var22 * var22 + var20 * var20 + var21 * var21);
			if (var23 <= 0) {
				var23 = 1;
			}

			var20 = var20 * 256 / var23;
			var21 = var21 * 256 / var23;
			var22 = var22 * 256 / var23;
			if (field1049 == null || (field1049[var10] & 0x1) == 0) {
				VertexNormal var24 = field1460[var11];
				var24.field1292 += var20;
				var24.field1293 += var21;
				var24.field1294 += var22;
				var24.field1295++;
				VertexNormal var25 = field1460[var12];
				var25.field1292 += var20;
				var25.field1293 += var21;
				var25.field1294 += var22;
				var25.field1295++;
				VertexNormal var26 = field1460[var13];
				var26.field1292 += var20;
				var26.field1293 += var21;
				var26.field1294 += var22;
				var26.field1295++;
			} else {
				int var27 = (arg4 * var22 + arg2 * var20 + arg3 * var21) / (var8 / 2 + var8) + arg0;
				field1046[var10] = method379(field1052[var10], var27, field1049[var10]);
			}
		}

		if (arg5) {
			method378(arg0, var8, arg2, arg3, arg4);
		} else {
			field1071 = new VertexNormal[field1038];
			for (int var28 = 0; var28 < field1038; var28++) {
				VertexNormal var29 = field1460[var28];
				VertexNormal var30 = field1071[var28] = new VertexNormal();
				var30.field1292 = var29.field1292;
				var30.field1293 = var29.field1293;
				var30.field1294 = var29.field1294;
				var30.field1295 = var29.field1295;
			}

			field1058 = (arg0 << 16) + (var8 & 0xFFFF);
		}

		if (arg5) {
			method363();
		} else {
			method365();
		}
	}

	@ObfuscatedName("LZYQDKJV.b(IIII)V")
	public final void method377(int arg0, int arg1, int arg2) {
		int var4 = field1058 >> 16;
		int var5 = field1058 << 16 >> 16;
		method378(var4, var5, arg2, arg0, arg1);
	}

	@ObfuscatedName("LZYQDKJV.a(IIIII)V")
	public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < field1042; var6++) {
			int var7 = field1043[var6];
			int var8 = field1044[var6];
			int var9 = field1045[var6];
			if (field1049 == null) {
				int var10 = field1052[var6];
				VertexNormal var11 = field1460[var7];
				int var12 = (var11.field1294 * arg4 + var11.field1293 * arg3 + var11.field1292 * arg2) / (var11.field1295 * arg1) + arg0;
				field1046[var6] = method379(var10, var12, 0);
				VertexNormal var13 = field1460[var8];
				int var14 = (var13.field1294 * arg4 + var13.field1293 * arg3 + var13.field1292 * arg2) / (var13.field1295 * arg1) + arg0;
				field1047[var6] = method379(var10, var14, 0);
				VertexNormal var15 = field1460[var9];
				int var16 = (var15.field1294 * arg4 + var15.field1293 * arg3 + var15.field1292 * arg2) / (var15.field1295 * arg1) + arg0;
				field1048[var6] = method379(var10, var16, 0);
			} else if ((field1049[var6] & 0x1) == 0) {
				int var17 = field1052[var6];
				int var18 = field1049[var6];
				VertexNormal var19 = field1460[var7];
				int var20 = (var19.field1294 * arg4 + var19.field1293 * arg3 + var19.field1292 * arg2) / (var19.field1295 * arg1) + arg0;
				field1046[var6] = method379(var17, var20, var18);
				VertexNormal var21 = field1460[var8];
				int var22 = (var21.field1294 * arg4 + var21.field1293 * arg3 + var21.field1292 * arg2) / (var21.field1295 * arg1) + arg0;
				field1047[var6] = method379(var17, var22, var18);
				VertexNormal var23 = field1460[var9];
				int var24 = (var23.field1294 * arg4 + var23.field1293 * arg3 + var23.field1292 * arg2) / (var23.field1295 * arg1) + arg0;
				field1048[var6] = method379(var17, var24, var18);
			}
		}

		field1460 = null;
		field1071 = null;
		field1066 = null;
		field1067 = null;

		if (field1049 != null) {
			for (int var25 = 0; var25 < field1042; var25++) {
				if ((field1049[var25] & 0x2) == 2) {
					return;
				}
			}
		}

		field1052 = null;
	}

	@ObfuscatedName("LZYQDKJV.a(III)I")
	public static final int method379(int arg0, int arg1, int arg2) {
		if ((arg2 & 0x2) == 2) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}

			return 127 - arg1;
		}

		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}

		return (arg0 & 0xFF80) + arg1;
	}

	@ObfuscatedName("LZYQDKJV.a(IIIIIII)V")
	public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = Pix3D.field1361;
		int var9 = Pix3D.field1362;
		int var10 = field1100[arg0];
		int var11 = field1101[arg0];
		int var12 = field1100[arg1];
		int var13 = field1101[arg1];
		int var14 = field1100[arg2];
		int var15 = field1101[arg2];
		int var16 = field1100[arg3];
		int var17 = field1101[arg3];
		int var18 = arg5 * var16 + arg6 * var17 >> 16;
		for (int var19 = 0; var19 < field1038; var19++) {
			int var20 = field1039[var19];
			int var21 = field1040[var19];
			int var22 = field1041[var19];

			if (arg2 != 0) {
				int var23 = var14 * var21 + var15 * var20 >> 16;
				var21 = var15 * var21 - var14 * var20 >> 16;
				var20 = var23;
			}

			if (arg0 != 0) {
				int var24 = var11 * var21 - var10 * var22 >> 16;
				var22 = var10 * var21 + var11 * var22 >> 16;
				var21 = var24;
			}

			if (arg1 != 0) {
				int var25 = var12 * var22 + var13 * var20 >> 16;
				var22 = var13 * var22 - var12 * var20 >> 16;
				var20 = var25;
			}

			var20 += arg4;
			var21 += arg5;
			var22 += arg6;
			int var26 = var17 * var21 - var16 * var22 >> 16;
			var22 = var16 * var21 + var17 * var22 >> 16;
			field1078[var19] = var22 - var18;
			field1076[var19] = (var20 << 9) / var22 + var8;
			field1077[var19] = (var26 << 9) / var22 + var9;

			if (field1054 > 0) {
				field1079[var19] = var20;
				field1080[var19] = var26;
				field1081[var19] = var22;
			}
		}

		try {
			method382(false, false, 0);
		} catch (Exception var28) {
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IIIIIIIII)V")
	public final void method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
		int var11 = arg1 * arg6 + arg2 * var10 >> 16;
		int var12 = field1061 * arg2 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
			int var15 = var14 - field1061 << 9;
			if (var15 / var13 < Pix2D.field957) {
				int var16 = field1061 + var14 << 9;
				if (var16 / var13 > -Pix2D.field957) {
					int var17 = arg2 * arg6 - arg1 * var10 >> 16;
					int var18 = field1061 * arg1 >> 16;
					int var19 = var17 + var18 << 9;
					if (var19 / var13 > -Pix2D.field958) {
						int var20 = (field1461 * arg2 >> 16) + var18;
						int var21 = var17 - var20 << 9;
						if (var21 / var13 < Pix2D.field958) {
							int var22 = (field1461 * arg1 >> 16) + var12;
							boolean var23 = false;
							if (var11 - var22 <= 50) {
								var23 = true;
							}

							boolean var24 = false;
							if (arg8 > 0 && field1095) {
								int var25 = var11 - var12;
								if (var25 <= 50) {
									var25 = 50;
								}

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var25;
								} else {
									var16 /= var13;
									var15 /= var25;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var25;
								} else {
									var19 /= var13;
									var21 /= var25;
								}

								int var26 = field1096 - Pix3D.field1361;
								int var27 = field1097 - Pix3D.field1362;
								if (var26 > var15 && var26 < var16 && var27 > var21 && var27 < var19) {
									if (field1070) {
										field1099[field1098++] = arg8;
									} else {
										var24 = true;
									}
								}
							}

							int var28 = Pix3D.field1361;
							int var29 = Pix3D.field1362;
							int var30 = 0;
							int var31 = 0;
							if (arg0 != 0) {
								var30 = field1100[arg0];
								var31 = field1101[arg0];
							}

							for (int var32 = 0; var32 < field1038; var32++) {
								int var33 = field1039[var32];
								int var34 = field1040[var32];
								int var35 = field1041[var32];
								if (arg0 != 0) {
									int var36 = var30 * var35 + var31 * var33 >> 16;
									var35 = var31 * var35 - var30 * var33 >> 16;
									var33 = var36;
								}

								var33 += arg5;
								var34 += arg6;
								var35 += arg7;
								int var37 = arg3 * var35 + arg4 * var33 >> 16;
								var35 = arg4 * var35 - arg3 * var33 >> 16;
								int var39 = arg2 * var34 - arg1 * var35 >> 16;
								var35 = arg1 * var34 + arg2 * var35 >> 16;
								field1078[var32] = var35 - var11;

								if (var35 >= 50) {
									field1076[var32] = (var37 << 9) / var35 + var28;
									field1077[var32] = (var39 << 9) / var35 + var29;
								} else {
									field1076[var32] = -5000;
									var23 = true;
								}

								if (var23 || field1054 > 0) {
									field1079[var32] = var37;
									field1080[var32] = var39;
									field1081[var32] = var35;
								}
							}

							try {
								method382(var23, var24, arg8);
							} catch (Exception var41) {
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.a(ZZI)V")
	public final void method382(boolean arg0, boolean arg1, int arg2) {
		for (int var4 = 0; var4 < field1063; var4++) {
			field1082[var4] = 0;
		}

		for (int var5 = 0; var5 < field1042; var5++) {
			if (field1049 == null || field1049[var5] != -1) {
				int var6 = field1043[var5];
				int var7 = field1044[var5];
				int var8 = field1045[var5];
				int var9 = field1076[var6];
				int var10 = field1076[var7];
				int var11 = field1076[var8];
				if (arg0 && (var9 == -5000 || var10 == -5000 || var11 == -5000)) {
					field1075[var5] = true;
					int var12 = (field1078[var6] + field1078[var7] + field1078[var8]) / 3 + field1064;
					field1083[var12][field1082[var12]++] = var5;
				} else {
					if (arg1 && method385(field1096, field1097, field1077[var6], field1077[var7], field1077[var8], var9, var10, var11)) {
						field1099[field1098++] = arg2;
						arg1 = false;
					}

					if ((field1077[var8] - field1077[var7]) * (var9 - var10) - (field1077[var6] - field1077[var7]) * (var11 - var10) > 0) {
						field1075[var5] = false;

						if (var9 >= 0 && var10 >= 0 && var11 >= 0 && var9 <= Pix2D.field956 && var10 <= Pix2D.field956 && var11 <= Pix2D.field956) {
							field1074[var5] = false;
						} else {
							field1074[var5] = true;
						}

						int var13 = (field1078[var6] + field1078[var7] + field1078[var8]) / 3 + field1064;
						field1083[var13][field1082[var13]++] = var5;
					}
				}
			}
		}

		if (field1050 == null) {
			for (int var14 = field1063 - 1; var14 >= 0; var14--) {
				int var15 = field1082[var14];
				if (var15 > 0) {
					int[] var16 = field1083[var14];
					for (int var17 = 0; var17 < var15; var17++) {
						method383(var16[var17]);
					}
				}
			}
		} else {
			for (int var18 = 0; var18 < 12; var18++) {
				field1084[var18] = 0;
				field1088[var18] = 0;
			}

			for (int var19 = field1063 - 1; var19 >= 0; var19--) {
				int var20 = field1082[var19];
				if (var20 > 0) {
					int[] var21 = field1083[var19];
					for (int var22 = 0; var22 < var20; var22++) {
						int var23 = var21[var22];
						int var24 = field1050[var23];
						int var25 = field1084[var24]++;
						field1085[var24][var25] = var23;

						if (var24 < 10) {
							field1088[var24] += var19;
						} else if (var24 == 10) {
							field1086[var25] = var19;
						} else {
							field1087[var25] = var19;
						}
					}
				}
			}

			int var26 = 0;
			if (field1084[1] > 0 || field1084[2] > 0) {
				var26 = (field1088[1] + field1088[2]) / (field1084[1] + field1084[2]);
			}

			int var27 = 0;
			if (field1084[3] > 0 || field1084[4] > 0) {
				var27 = (field1088[3] + field1088[4]) / (field1084[3] + field1084[4]);
			}

			int var28 = 0;
			if (field1084[6] > 0 || field1084[8] > 0) {
				var28 = (field1088[6] + field1088[8]) / (field1084[6] + field1084[8]);
			}

			int var29 = 0;
			int var30 = field1084[10];
			int[] var31 = field1085[10];
			int[] var32 = field1086;
			if (var29 == var30) {
				var29 = 0;
				var30 = field1084[11];
				var31 = field1085[11];
				var32 = field1087;
			}

			int var33;
			if (var29 < var30) {
				var33 = var32[var29];
			} else {
				var33 = -1000;
			}

			for (int var34 = 0; var34 < 10; var34++) {
				while (var34 == 0 && var33 > var26) {
					method383(var31[var29++]);

					if (var29 == var30 && field1085[11] != var31) {
						var29 = 0;
						var30 = field1084[11];
						var31 = field1085[11];
						var32 = field1087;
					}

					if (var29 < var30) {
						var33 = var32[var29];
					} else {
						var33 = -1000;
					}
				}

				while (var34 == 3 && var33 > var27) {
					method383(var31[var29++]);

					if (var29 == var30 && field1085[11] != var31) {
						var29 = 0;
						var30 = field1084[11];
						var31 = field1085[11];
						var32 = field1087;
					}

					if (var29 < var30) {
						var33 = var32[var29];
					} else {
						var33 = -1000;
					}
				}

				while (var34 == 5 && var33 > var28) {
					method383(var31[var29++]);

					if (var29 == var30 && field1085[11] != var31) {
						var29 = 0;
						var30 = field1084[11];
						var31 = field1085[11];
						var32 = field1087;
					}

					if (var29 < var30) {
						var33 = var32[var29];
					} else {
						var33 = -1000;
					}
				}

				int var35 = field1084[var34];
				int[] var36 = field1085[var34];
				for (int var37 = 0; var37 < var35; var37++) {
					method383(var36[var37]);
				}
			}

			while (var33 != -1000) {
				method383(var31[var29++]);

				if (var29 == var30 && field1085[11] != var31) {
					var29 = 0;
					var31 = field1085[11];
					var30 = field1084[11];
					var32 = field1087;
				}

				if (var29 < var30) {
					var33 = var32[var29];
				} else {
					var33 = -1000;
				}
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.h(I)V")
	public final void method383(int arg0) {
		if (field1075[arg0]) {
			method384(arg0);
		} else {
			int var2 = field1043[arg0];
			int var3 = field1044[arg0];
			int var4 = field1045[arg0];
			Pix3D.field1357 = field1074[arg0];

			if (field1051 == null) {
				Pix3D.field1360 = 0;
			} else {
				Pix3D.field1360 = field1051[arg0];
			}

			int var5;
			if (field1049 == null) {
				var5 = 0;
			} else {
				var5 = field1049[arg0] & 0x3;
			}

			if (var5 == 0) {
				Pix3D.method555(field1077[var2], field1077[var3], field1077[var4], field1076[var2], field1076[var3], field1076[var4], field1046[arg0], field1047[arg0], field1048[arg0]);
			} else if (var5 == 1) {
				Pix3D.method557(field1077[var2], field1077[var3], field1077[var4], field1076[var2], field1076[var3], field1076[var4], field1102[field1046[arg0]]);
			} else if (var5 == 2) {
				int var6 = field1049[arg0] >> 2;
				int var7 = field1055[var6];
				int var8 = field1056[var6];
				int var9 = field1057[var6];
				Pix3D.method559(field1077[var2], field1077[var3], field1077[var4], field1076[var2], field1076[var3], field1076[var4], field1046[arg0], field1047[arg0], field1048[arg0], field1079[var7], field1079[var8], field1079[var9], field1080[var7], field1080[var8], field1080[var9], field1081[var7], field1081[var8], field1081[var9], field1052[arg0]);
			} else if (var5 == 3) {
				int var10 = field1049[arg0] >> 2;
				int var11 = field1055[var10];
				int var12 = field1056[var10];
				int var13 = field1057[var10];
				Pix3D.method559(field1077[var2], field1077[var3], field1077[var4], field1076[var2], field1076[var3], field1076[var4], field1046[arg0], field1046[arg0], field1046[arg0], field1079[var11], field1079[var12], field1079[var13], field1080[var11], field1080[var12], field1080[var13], field1081[var11], field1081[var12], field1081[var13], field1052[arg0]);
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.i(I)V")
	public final void method384(int arg0) {
		int var2 = Pix3D.field1361;
		int var3 = Pix3D.field1362;
		int var4 = 0;
		int var5 = field1043[arg0];
		int var6 = field1044[arg0];
		int var7 = field1045[arg0];
		int var8 = field1081[var5];
		int var9 = field1081[var6];
		int var10 = field1081[var7];
		if (var8 >= 50) {
			field1089[var4] = field1076[var5];
			field1090[var4] = field1077[var5];
			field1091[var4++] = field1046[arg0];
		} else {
			int var11 = field1079[var5];
			int var12 = field1080[var5];
			int var13 = field1046[arg0];
			if (var10 >= 50) {
				int var14 = (50 - var8) * field1103[var10 - var8];
				field1089[var4] = (((field1079[var7] - var11) * var14 >> 16) + var11 << 9) / 50 + var2;
				field1090[var4] = (((field1080[var7] - var12) * var14 >> 16) + var12 << 9) / 50 + var3;
				field1091[var4++] = ((field1048[arg0] - var13) * var14 >> 16) + var13;
			}

			if (var9 >= 50) {
				int var15 = (50 - var8) * field1103[var9 - var8];
				field1089[var4] = (((field1079[var6] - var11) * var15 >> 16) + var11 << 9) / 50 + var2;
				field1090[var4] = (((field1080[var6] - var12) * var15 >> 16) + var12 << 9) / 50 + var3;
				field1091[var4++] = ((field1047[arg0] - var13) * var15 >> 16) + var13;
			}
		}

		if (var9 >= 50) {
			field1089[var4] = field1076[var6];
			field1090[var4] = field1077[var6];
			field1091[var4++] = field1047[arg0];
		} else {
			int var16 = field1079[var6];
			int var17 = field1080[var6];
			int var18 = field1047[arg0];
			if (var8 >= 50) {
				int var19 = (50 - var9) * field1103[var8 - var9];
				field1089[var4] = (((field1079[var5] - var16) * var19 >> 16) + var16 << 9) / 50 + var2;
				field1090[var4] = (((field1080[var5] - var17) * var19 >> 16) + var17 << 9) / 50 + var3;
				field1091[var4++] = ((field1046[arg0] - var18) * var19 >> 16) + var18;
			}

			if (var10 >= 50) {
				int var20 = (50 - var9) * field1103[var10 - var9];
				field1089[var4] = (((field1079[var7] - var16) * var20 >> 16) + var16 << 9) / 50 + var2;
				field1090[var4] = (((field1080[var7] - var17) * var20 >> 16) + var17 << 9) / 50 + var3;
				field1091[var4++] = ((field1048[arg0] - var18) * var20 >> 16) + var18;
			}
		}

		if (var10 >= 50) {
			field1089[var4] = field1076[var7];
			field1090[var4] = field1077[var7];
			field1091[var4++] = field1048[arg0];
		} else {
			int var21 = field1079[var7];
			int var22 = field1080[var7];
			int var23 = field1048[arg0];
			if (var9 >= 50) {
				int var24 = (50 - var10) * field1103[var9 - var10];
				field1089[var4] = (((field1079[var6] - var21) * var24 >> 16) + var21 << 9) / 50 + var2;
				field1090[var4] = (((field1080[var6] - var22) * var24 >> 16) + var22 << 9) / 50 + var3;
				field1091[var4++] = ((field1047[arg0] - var23) * var24 >> 16) + var23;
			}

			if (var8 >= 50) {
				int var25 = (50 - var10) * field1103[var8 - var10];
				field1089[var4] = (((field1079[var5] - var21) * var25 >> 16) + var21 << 9) / 50 + var2;
				field1090[var4] = (((field1080[var5] - var22) * var25 >> 16) + var22 << 9) / 50 + var3;
				field1091[var4++] = ((field1046[arg0] - var23) * var25 >> 16) + var23;
			}
		}

		int var26 = field1089[0];
		int var27 = field1089[1];
		int var28 = field1089[2];
		int var29 = field1090[0];
		int var30 = field1090[1];
		int var31 = field1090[2];
		if ((var26 - var27) * (var31 - var30) - (var28 - var27) * (var29 - var30) > 0) {
			Pix3D.field1357 = false;
			if (var4 == 3) {
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.field956 || var27 > Pix2D.field956 || var28 > Pix2D.field956) {
					Pix3D.field1357 = true;
				}

				int var32;
				if (field1049 == null) {
					var32 = 0;
				} else {
					var32 = field1049[arg0] & 0x3;
				}

				if (var32 == 0) {
					Pix3D.method555(var29, var30, var31, var26, var27, var28, field1091[0], field1091[1], field1091[2]);
				} else if (var32 == 1) {
					Pix3D.method557(var29, var30, var31, var26, var27, var28, field1102[field1046[arg0]]);
				} else if (var32 == 2) {
					int var33 = field1049[arg0] >> 2;
					int var34 = field1055[var33];
					int var35 = field1056[var33];
					int var36 = field1057[var33];
					Pix3D.method559(var29, var30, var31, var26, var27, var28, field1091[0], field1091[1], field1091[2], field1079[var34], field1079[var35], field1079[var36], field1080[var34], field1080[var35], field1080[var36], field1081[var34], field1081[var35], field1081[var36], field1052[arg0]);
				} else if (var32 == 3) {
					int var37 = field1049[arg0] >> 2;
					int var38 = field1055[var37];
					int var39 = field1056[var37];
					int var40 = field1057[var37];
					Pix3D.method559(var29, var30, var31, var26, var27, var28, field1046[arg0], field1046[arg0], field1046[arg0], field1079[var38], field1079[var39], field1079[var40], field1080[var38], field1080[var39], field1080[var40], field1081[var38], field1081[var39], field1081[var40], field1052[arg0]);
				}
			}

			if (var4 == 4) {
				if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Pix2D.field956 || var27 > Pix2D.field956 || var28 > Pix2D.field956 || field1089[3] < 0 || field1089[3] > Pix2D.field956) {
					Pix3D.field1357 = true;
				}

				int var41;
				if (field1049 == null) {
					var41 = 0;
				} else {
					var41 = field1049[arg0] & 0x3;
				}

				if (var41 == 0) {
					Pix3D.method555(var29, var30, var31, var26, var27, var28, field1091[0], field1091[1], field1091[2]);
					Pix3D.method555(var29, var31, field1090[3], var26, var28, field1089[3], field1091[0], field1091[2], field1091[3]);
					return;
				}

				if (var41 == 1) {
					int var42 = field1102[field1046[arg0]];
					Pix3D.method557(var29, var30, var31, var26, var27, var28, var42);
					Pix3D.method557(var29, var31, field1090[3], var26, var28, field1089[3], var42);
					return;
				}

				if (var41 == 2) {
					int var43 = field1049[arg0] >> 2;
					int var44 = field1055[var43];
					int var45 = field1056[var43];
					int var46 = field1057[var43];
					Pix3D.method559(var29, var30, var31, var26, var27, var28, field1091[0], field1091[1], field1091[2], field1079[var44], field1079[var45], field1079[var46], field1080[var44], field1080[var45], field1080[var46], field1081[var44], field1081[var45], field1081[var46], field1052[arg0]);
					Pix3D.method559(var29, var31, field1090[3], var26, var28, field1089[3], field1091[0], field1091[2], field1091[3], field1079[var44], field1079[var45], field1079[var46], field1080[var44], field1080[var45], field1080[var46], field1081[var44], field1081[var45], field1081[var46], field1052[arg0]);
					return;
				}

				if (var41 == 3) {
					int var47 = field1049[arg0] >> 2;
					int var48 = field1055[var47];
					int var49 = field1056[var47];
					int var50 = field1057[var47];
					Pix3D.method559(var29, var30, var31, var26, var27, var28, field1046[arg0], field1046[arg0], field1046[arg0], field1079[var48], field1079[var49], field1079[var50], field1080[var48], field1080[var49], field1080[var50], field1081[var48], field1081[var49], field1081[var50], field1052[arg0]);
					Pix3D.method559(var29, var31, field1090[3], var26, var28, field1089[3], field1046[arg0], field1046[arg0], field1046[arg0], field1079[var48], field1079[var49], field1079[var50], field1080[var48], field1080[var49], field1080[var50], field1081[var48], field1081[var49], field1081[var50], field1052[arg0]);
				}
			}
		}
	}

	@ObfuscatedName("LZYQDKJV.a(IIIIIIII)Z")
	public final boolean method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		}

		if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		}

		if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		}

		if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		}

		return true;
	}
}
