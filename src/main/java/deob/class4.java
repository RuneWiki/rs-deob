package deob;

@ObfuscatedName("d")
public class class4 {

	@ObfuscatedName("d.e")
	public static class4[] field56;

	@ObfuscatedName("d.f")
	public int[] field57;

	@ObfuscatedName("d.g")
	public int[] field58;

	@ObfuscatedName("d.h")
	public int field59;

	@ObfuscatedName("d.i")
	public int field60;

	@ObfuscatedName("d.j")
	public int field61;

	@ObfuscatedName("d.k")
	public int field62;

	@ObfuscatedName("d.l")
	public int field63;

	@ObfuscatedName("d.m")
	public int field64;

	@ObfuscatedName("d.n")
	public int field65;

	@ObfuscatedName("d.o")
	public int field66;

	@ObfuscatedName("d.p")
	public int field67;

	@ObfuscatedName("d.q")
	public byte field68;

	@ObfuscatedName("d.r")
	public int field69;

	@ObfuscatedName("d.s")
	public int field70;

	@ObfuscatedName("d.t")
	public int[][] field71;

	@ObfuscatedName("d.u")
	public int[] field72;

	@ObfuscatedName("d.v")
	public int[] field73;

	@ObfuscatedName("d.w")
	public int field74;

	@ObfuscatedName("d.x")
	public int field75;

	@ObfuscatedName("d.y")
	public int field76;

	@ObfuscatedName("d.z")
	public boolean field77;

	@ObfuscatedName("d.ab")
	public class36 field104;

	@ObfuscatedName("d.bb")
	public int field105;

	@ObfuscatedName("d.cb")
	public int field106;

	@ObfuscatedName("d.db")
	public int field107;

	@ObfuscatedName("d.eb")
	public int field108;

	@ObfuscatedName("d.fb")
	public int field109;

	@ObfuscatedName("d.gb")
	public int field110;

	@ObfuscatedName("d.hb")
	public int field111;

	@ObfuscatedName("d.ib")
	public int field112;

	@ObfuscatedName("d.jb")
	public int field113;

	@ObfuscatedName("d.kb")
	public String field114;

	@ObfuscatedName("d.lb")
	public String field115;

	@ObfuscatedName("d.mb")
	public int field116;

	@ObfuscatedName("d.nb")
	public String field117;

	@ObfuscatedName("d.ob")
	public static class20 field118 = new class20(30);

	@ObfuscatedName("d.pb")
	public static class20 field119;

	@ObfuscatedName("d.W")
	public int field100;

	@ObfuscatedName("d.X")
	public int field101;

	@ObfuscatedName("d.Y")
	public int field102;

	@ObfuscatedName("d.D")
	public int field81;

	@ObfuscatedName("d.J")
	public int field87;

	@ObfuscatedName("d.K")
	public int field88;

	@ObfuscatedName("d.V")
	public int field99;

	@ObfuscatedName("d.Z")
	public class36 field103;

	@ObfuscatedName("d.S")
	public class38 field96;

	@ObfuscatedName("d.T")
	public String field97;

	@ObfuscatedName("d.U")
	public String field98;

	@ObfuscatedName("d.E")
	public boolean field82;

	@ObfuscatedName("d.F")
	public boolean field83;

	@ObfuscatedName("d.G")
	public boolean field84;

	@ObfuscatedName("d.H")
	public boolean field85;

	@ObfuscatedName("d.I")
	public boolean field86;

	@ObfuscatedName("d.P")
	public boolean field93;

	@ObfuscatedName("d.Q")
	public boolean field94;

	@ObfuscatedName("d.R")
	public boolean field95;

	@ObfuscatedName("d.A")
	public int[] field78;

	@ObfuscatedName("d.B")
	public int[] field79;

	@ObfuscatedName("d.C")
	public int[] field80;

	@ObfuscatedName("d.M")
	public int[] field90;

	@ObfuscatedName("d.N")
	public int[] field91;

	@ObfuscatedName("d.L")
	public class36[] field89;

	@ObfuscatedName("d.O")
	public String[] field92;

	@ObfuscatedName("d.a(B[Llb;Lyb;Lyb;)V")
	public static void method32(class38[] arg0, class51 arg1, class51 arg2) {
		field119 = new class20(50000);
		class39 var3 = new class39(arg1.method309("data", null));
		int var4 = -1;
		int var5 = var3.method241();
		field56 = new class4[var5];
		while (true) {
			class4 var7;
			do {
				if (var3.field623 >= var3.field622.length) {
					field119 = null;
					return;
				}

				int var6 = var3.method241();
				if (var6 == 0xFFFF) {
					var4 = var3.method241();
					var6 = var3.method241();
				}

				var7 = field56[var6] = new class4();
				var7.field61 = var6;
				var7.field62 = var4;
				var7.field63 = var3.method239();
				var7.field64 = var3.method239();
				var7.field65 = var3.method241();
				var7.field66 = var3.method241();
				var7.field67 = var3.method241();
				var7.field68 = (byte) var3.method239();
				var7.field74 = var3.method239();
				if (var7.field74 == 0) {
					var7.field74 = -1;
				} else {
					var7.field74 = (var7.field74 - 1 << 8) + var3.method239();
				}

				int var8 = var3.method239();
				if (var8 > 0) {
					var7.field72 = new int[var8];
					var7.field73 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field72[var9] = var3.method239();
						var7.field73[var9] = var3.method241();
					}
				}

				int var10 = var3.method239();
				if (var10 > 0) {
					var7.field71 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.method241();
						var7.field71[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field71[var11][var13] = var3.method241();
						}
					}
				}

				if (var7.field63 == 0) {
					var7.field75 = var3.method241();
					var7.field77 = var3.method239() == 1;
					int var14 = var3.method241();
					var7.field78 = new int[var14];
					var7.field79 = new int[var14];
					var7.field80 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field78[var15] = var3.method241();
						var7.field79[var15] = var3.method242();
						var7.field80[var15] = var3.method242();
					}
				}

				if (var7.field63 == 1) {
					var7.field81 = var3.method241();
					var7.field82 = var3.method239() == 1;
				}

				if (var7.field63 == 2) {
					var7.field57 = new int[var7.field67 * var7.field66];
					var7.field58 = new int[var7.field67 * var7.field66];
					var7.field83 = var3.method239() == 1;
					var7.field84 = var3.method239() == 1;
					var7.field85 = var3.method239() == 1;
					var7.field86 = var3.method239() == 1;
					var7.field87 = var3.method239();
					var7.field88 = var3.method239();
					var7.field90 = new int[20];
					var7.field91 = new int[20];
					var7.field89 = new class36[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.method239();
						if (var17 == 1) {
							var7.field90[var16] = var3.method242();
							var7.field91[var16] = var3.method242();
							String var18 = var3.method246();
							if (arg2 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field89[var16] = method37(Integer.parseInt(var18.substring(var19 + 1)), arg2, var18.substring(0, var19));
							}
						}
					}

					var7.field92 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field92[var20] = var3.method246();
						if (var7.field92[var20].length() == 0) {
							var7.field92[var20] = null;
						}
					}
				}

				if (var7.field63 == 3) {
					var7.field93 = var3.method239() == 1;
				}

				if (var7.field63 == 4 || var7.field63 == 1) {
					var7.field94 = var3.method239() == 1;
					int var21 = var3.method239();
					if (arg0 != null) {
						var7.field96 = arg0[var21];
					}

					var7.field95 = var3.method239() == 1;
				}

				if (var7.field63 == 4) {
					var7.field97 = var3.method246();
					var7.field98 = var3.method246();
				}

				if (var7.field63 == 1 || var7.field63 == 3 || var7.field63 == 4) {
					var7.field99 = var3.method244();
				}

				if (var7.field63 == 3 || var7.field63 == 4) {
					var7.field100 = var3.method244();
					var7.field101 = var3.method244();
					var7.field102 = var3.method244();
				}

				if (var7.field63 == 5) {
					String var22 = var3.method246();
					if (arg2 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field103 = method37(Integer.parseInt(var22.substring(var23 + 1)), arg2, var22.substring(0, var23));
					}

					String var24 = var3.method246();
					if (arg2 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field104 = method37(Integer.parseInt(var24.substring(var25 + 1)), arg2, var24.substring(0, var25));
					}
				}

				if (var7.field63 == 6) {
					int var26 = var3.method239();
					if (var26 != 0) {
						var7.field105 = 1;
						var7.field106 = (var26 - 1 << 8) + var3.method239();
					}

					int var27 = var3.method239();
					if (var27 != 0) {
						var7.field107 = 1;
						var7.field108 = (var27 - 1 << 8) + var3.method239();
					}

					int var28 = var3.method239();
					if (var28 == 0) {
						var7.field109 = -1;
					} else {
						var7.field109 = (var28 - 1 << 8) + var3.method239();
					}

					int var29 = var3.method239();
					if (var29 == 0) {
						var7.field110 = -1;
					} else {
						var7.field110 = (var29 - 1 << 8) + var3.method239();
					}

					var7.field111 = var3.method241();
					var7.field112 = var3.method241();
					var7.field113 = var3.method241();
				}

				if (var7.field63 == 7) {
					var7.field57 = new int[var7.field67 * var7.field66];
					var7.field58 = new int[var7.field67 * var7.field66];
					var7.field94 = var3.method239() == 1;
					int var30 = var3.method239();
					if (arg0 != null) {
						var7.field96 = arg0[var30];
					}

					var7.field95 = var3.method239() == 1;
					var7.field99 = var3.method244();
					var7.field87 = var3.method242();
					var7.field88 = var3.method242();
					var7.field84 = var3.method239() == 1;
					var7.field92 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field92[var31] = var3.method246();
						if (var7.field92[var31].length() == 0) {
							var7.field92[var31] = null;
						}
					}
				}

				if (var7.field64 == 2 || var7.field63 == 2) {
					var7.field114 = var3.method246();
					var7.field115 = var3.method246();
					var7.field116 = var3.method241();
				}
			} while (var7.field64 != 1 && var7.field64 != 4 && var7.field64 != 5 && var7.field64 != 6);

			var7.field117 = var3.method246();
			if (var7.field117.length() == 0) {
				if (var7.field64 == 1) {
					var7.field117 = "Ok";
				}

				if (var7.field64 == 4) {
					var7.field117 = "Select";
				}

				if (var7.field64 == 5) {
					var7.field117 = "Select";
				}

				if (var7.field64 == 6) {
					var7.field117 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(III)V")
	public void method33(int arg0, int arg1) {
		int var3 = field57[arg1];
		field57[arg1] = field57[arg0];
		field57[arg0] = var3;
		int var4 = field58[arg1];
		field58[arg1] = field58[arg0];
		field58[arg0] = var4;
	}

	@ObfuscatedName("d.a(IIZI)Lfb;")
	public class32 method34(int arg0, int arg1, boolean arg2) {
		class32 var4;
		if (arg2) {
			var4 = method35(field107, field108);
		} else {
			var4 = method35(field105, field106);
		}

		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.field501 == null) {
			return var4;
		} else {
			class32 var5 = new class32(class8.method62(arg0) & class8.method62(arg1), false, true, var4);
			if (arg0 != -1 || arg1 != -1) {
				var5.method146();
			}

			if (arg0 != -1) {
				var5.method147(arg0);
			}

			if (arg1 != -1) {
				var5.method147(arg1);
			}

			var5.method156(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("d.a(II)Lfb;")
	public class32 method35(int arg0, int arg1) {
		class32 var3 = (class32) field118.method115((arg0 << 16) + arg1);
		if (var3 != null) {
			return var3;
		}

		if (arg0 == 1) {
			var3 = class32.method139(arg1);
		}

		if (arg0 == 2) {
			var3 = class59.method344(arg1).method347();
		}

		if (arg0 == 3) {
			var3 = client.field1377.method132();
		}

		if (arg0 == 4) {
			var3 = class60.method350(arg1).method355(50);
		}

		if (arg0 == 5) {
			var3 = null;
		}

		if (var3 != null) {
			field118.method116((arg0 << 16) + arg1, var3);
		}

		return var3;
	}

	@ObfuscatedName("d.a(ILfb;IZ)V")
	public static void method36(int arg0, class32 arg1, int arg2) {
		field118.method117();

		if (arg1 != null && arg2 != 4) {
			field118.method116((arg2 << 16) + arg0, arg1);
		}
	}

	@ObfuscatedName("d.a(ILyb;Ljava/lang/String;I)Ljb;")
	public static class36 method37(int arg0, class51 arg1, String arg2) {
		long var3 = (class52.method312(arg2) << 8) + arg0;
		class36 var5 = (class36) field119.method115(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			class36 var6 = new class36(arg1, arg2, arg0);
			field119.method116(var3, var6);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}
}
