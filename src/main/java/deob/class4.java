package deob;

@ObfuscatedName("d")
public class class4 {

	@ObfuscatedName("d.d")
	public static class4[] field57;

	@ObfuscatedName("d.e")
	public int[] field58;

	@ObfuscatedName("d.f")
	public int[] field59;

	@ObfuscatedName("d.g")
	public int field60;

	@ObfuscatedName("d.h")
	public int field61;

	@ObfuscatedName("d.i")
	public int field62;

	@ObfuscatedName("d.j")
	public int field63;

	@ObfuscatedName("d.k")
	public int field64;

	@ObfuscatedName("d.l")
	public int field65;

	@ObfuscatedName("d.m")
	public int field66;

	@ObfuscatedName("d.n")
	public int field67;

	@ObfuscatedName("d.o")
	public int field68;

	@ObfuscatedName("d.p")
	public byte field69;

	@ObfuscatedName("d.q")
	public int field70;

	@ObfuscatedName("d.r")
	public int field71;

	@ObfuscatedName("d.s")
	public int[][] field72;

	@ObfuscatedName("d.t")
	public int[] field73;

	@ObfuscatedName("d.u")
	public int[] field74;

	@ObfuscatedName("d.v")
	public int field75;

	@ObfuscatedName("d.w")
	public int field76;

	@ObfuscatedName("d.x")
	public int field77;

	@ObfuscatedName("d.y")
	public boolean field78;

	@ObfuscatedName("d.z")
	public int[] field79;

	@ObfuscatedName("d.ab")
	public int field106;

	@ObfuscatedName("d.bb")
	public int field107;

	@ObfuscatedName("d.cb")
	public int field108;

	@ObfuscatedName("d.db")
	public int field109;

	@ObfuscatedName("d.eb")
	public int field110;

	@ObfuscatedName("d.fb")
	public int field111;

	@ObfuscatedName("d.gb")
	public int field112;

	@ObfuscatedName("d.hb")
	public String field113;

	@ObfuscatedName("d.ib")
	public String field114;

	@ObfuscatedName("d.jb")
	public int field115;

	@ObfuscatedName("d.kb")
	public String field116;

	@ObfuscatedName("d.lb")
	public static class20 field117 = new class20(30);

	@ObfuscatedName("d.mb")
	public static class20 field118;

	@ObfuscatedName("d.U")
	public int field100;

	@ObfuscatedName("d.V")
	public int field101;

	@ObfuscatedName("d.Y")
	public int field104;

	@ObfuscatedName("d.Z")
	public int field105;

	@ObfuscatedName("d.C")
	public int field82;

	@ObfuscatedName("d.H")
	public int field87;

	@ObfuscatedName("d.I")
	public int field88;

	@ObfuscatedName("d.T")
	public int field99;

	@ObfuscatedName("d.W")
	public class36 field102;

	@ObfuscatedName("d.X")
	public class36 field103;

	@ObfuscatedName("d.Q")
	public class38 field96;

	@ObfuscatedName("d.R")
	public String field97;

	@ObfuscatedName("d.S")
	public String field98;

	@ObfuscatedName("d.D")
	public boolean field83;

	@ObfuscatedName("d.E")
	public boolean field84;

	@ObfuscatedName("d.F")
	public boolean field85;

	@ObfuscatedName("d.G")
	public boolean field86;

	@ObfuscatedName("d.N")
	public boolean field93;

	@ObfuscatedName("d.O")
	public boolean field94;

	@ObfuscatedName("d.P")
	public boolean field95;

	@ObfuscatedName("d.A")
	public int[] field80;

	@ObfuscatedName("d.B")
	public int[] field81;

	@ObfuscatedName("d.K")
	public int[] field90;

	@ObfuscatedName("d.L")
	public int[] field91;

	@ObfuscatedName("d.J")
	public class36[] field89;

	@ObfuscatedName("d.M")
	public String[] field92;

	@ObfuscatedName("d.a([Llb;Lyb;Lyb;I)V")
	public static void method32(class38[] arg0, class51 arg1, class51 arg2) {
		field118 = new class20(50000);
		class39 var3 = new class39(arg1.method308("data", null));
		int var4 = -1;
		int var5 = var3.method240();
		field57 = new class4[var5];
		while (true) {
			class4 var7;
			do {
				if (var3.field621 >= var3.field620.length) {
					field118 = null;
					return;
				}

				int var6 = var3.method240();
				if (var6 == 0xFFFF) {
					var4 = var3.method240();
					var6 = var3.method240();
				}

				var7 = field57[var6] = new class4();
				var7.field62 = var6;
				var7.field63 = var4;
				var7.field64 = var3.method238();
				var7.field65 = var3.method238();
				var7.field66 = var3.method240();
				var7.field67 = var3.method240();
				var7.field68 = var3.method240();
				var7.field69 = (byte) var3.method238();
				var7.field75 = var3.method238();
				if (var7.field75 == 0) {
					var7.field75 = -1;
				} else {
					var7.field75 = (var7.field75 - 1 << 8) + var3.method238();
				}

				int var8 = var3.method238();
				if (var8 > 0) {
					var7.field73 = new int[var8];
					var7.field74 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field73[var9] = var3.method238();
						var7.field74[var9] = var3.method240();
					}
				}

				int var10 = var3.method238();
				if (var10 > 0) {
					var7.field72 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.method240();
						var7.field72[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field72[var11][var13] = var3.method240();
						}
					}
				}

				if (var7.field64 == 0) {
					var7.field76 = var3.method240();
					var7.field78 = var3.method238() == 1;
					int var14 = var3.method240();
					var7.field79 = new int[var14];
					var7.field80 = new int[var14];
					var7.field81 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field79[var15] = var3.method240();
						var7.field80[var15] = var3.method241();
						var7.field81[var15] = var3.method241();
					}
				}

				if (var7.field64 == 1) {
					var7.field82 = var3.method240();
					var7.field83 = var3.method238() == 1;
				}

				if (var7.field64 == 2) {
					var7.field58 = new int[var7.field68 * var7.field67];
					var7.field59 = new int[var7.field68 * var7.field67];
					var7.field84 = var3.method238() == 1;
					var7.field85 = var3.method238() == 1;
					var7.field86 = var3.method238() == 1;
					var7.field87 = var3.method238();
					var7.field88 = var3.method238();
					var7.field90 = new int[20];
					var7.field91 = new int[20];
					var7.field89 = new class36[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.method238();
						if (var17 == 1) {
							var7.field90[var16] = var3.method241();
							var7.field91[var16] = var3.method241();
							String var18 = var3.method245();
							if (arg2 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field89[var16] = method37(var18.substring(0, var19), Integer.parseInt(var18.substring(var19 + 1)), arg2);
							}
						}
					}

					var7.field92 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field92[var20] = var3.method245();
						if (var7.field92[var20].length() == 0) {
							var7.field92[var20] = null;
						}
					}
				}

				if (var7.field64 == 3) {
					var7.field93 = var3.method238() == 1;
				}

				if (var7.field64 == 4 || var7.field64 == 1) {
					var7.field94 = var3.method238() == 1;
					int var21 = var3.method238();
					if (arg0 != null) {
						var7.field96 = arg0[var21];
					}

					var7.field95 = var3.method238() == 1;
				}

				if (var7.field64 == 4) {
					var7.field97 = var3.method245();
					var7.field98 = var3.method245();
				}

				if (var7.field64 == 1 || var7.field64 == 3 || var7.field64 == 4) {
					var7.field99 = var3.method243();
				}

				if (var7.field64 == 3 || var7.field64 == 4) {
					var7.field100 = var3.method243();
					var7.field101 = var3.method243();
				}

				if (var7.field64 == 5) {
					String var22 = var3.method245();
					if (arg2 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field102 = method37(var22.substring(0, var23), Integer.parseInt(var22.substring(var23 + 1)), arg2);
					}

					String var24 = var3.method245();
					if (arg2 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field103 = method37(var24.substring(0, var25), Integer.parseInt(var24.substring(var25 + 1)), arg2);
					}
				}

				if (var7.field64 == 6) {
					int var26 = var3.method238();
					if (var26 != 0) {
						var7.field104 = 1;
						var7.field105 = (var26 - 1 << 8) + var3.method238();
					}

					int var27 = var3.method238();
					if (var27 != 0) {
						var7.field106 = 1;
						var7.field107 = (var27 - 1 << 8) + var3.method238();
					}

					int var28 = var3.method238();
					if (var28 == 0) {
						var7.field108 = -1;
					} else {
						var7.field108 = (var28 - 1 << 8) + var3.method238();
					}

					int var29 = var3.method238();
					if (var29 == 0) {
						var7.field109 = -1;
					} else {
						var7.field109 = (var29 - 1 << 8) + var3.method238();
					}

					var7.field110 = var3.method240();
					var7.field111 = var3.method240();
					var7.field112 = var3.method240();
				}

				if (var7.field64 == 7) {
					var7.field58 = new int[var7.field68 * var7.field67];
					var7.field59 = new int[var7.field68 * var7.field67];
					var7.field94 = var3.method238() == 1;
					int var30 = var3.method238();
					if (arg0 != null) {
						var7.field96 = arg0[var30];
					}

					var7.field95 = var3.method238() == 1;
					var7.field99 = var3.method243();
					var7.field87 = var3.method241();
					var7.field88 = var3.method241();
					var7.field85 = var3.method238() == 1;
					var7.field92 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field92[var31] = var3.method245();
						if (var7.field92[var31].length() == 0) {
							var7.field92[var31] = null;
						}
					}
				}

				if (var7.field65 == 2 || var7.field64 == 2) {
					var7.field113 = var3.method245();
					var7.field114 = var3.method245();
					var7.field115 = var3.method240();
				}
			} while (var7.field65 != 1 && var7.field65 != 4 && var7.field65 != 5 && var7.field65 != 6);

			var7.field116 = var3.method245();
			if (var7.field116.length() == 0) {
				if (var7.field65 == 1) {
					var7.field116 = "Ok";
				}

				if (var7.field65 == 4) {
					var7.field116 = "Select";
				}

				if (var7.field65 == 5) {
					var7.field116 = "Select";
				}

				if (var7.field65 == 6) {
					var7.field116 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(III)V")
	public void method33(int arg0, int arg1) {
		int var3 = field58[arg1];
		field58[arg1] = field58[arg0];
		field58[arg0] = var3;
		int var4 = field59[arg1];
		field59[arg1] = field59[arg0];
		field59[arg0] = var4;
	}

	@ObfuscatedName("d.a(ZBII)Lfb;")
	public class32 method34(boolean arg0, int arg1, int arg2) {
		class32 var4;
		if (arg0) {
			var4 = method35(field106, field107);
		} else {
			var4 = method35(field104, field105);
		}

		if (var4 == null) {
			return null;
		} else if (arg1 == -1 && arg2 == -1 && var4.field499 == null) {
			return var4;
		} else {
			class32 var5 = new class32(false, true, var4, true);
			if (arg1 != -1 || arg2 != -1) {
				var5.method145();
			}

			if (arg1 != -1) {
				var5.method146(arg1);
			}

			if (arg2 != -1) {
				var5.method146(arg2);
			}

			var5.method155(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("d.a(II)Lfb;")
	public class32 method35(int arg0, int arg1) {
		class32 var3 = (class32) field117.method114((arg0 << 16) + arg1);
		if (var3 != null) {
			return var3;
		}

		if (arg0 == 1) {
			var3 = class32.method138(arg1);
		}

		if (arg0 == 2) {
			var3 = class59.method342(arg1).method345();
		}

		if (arg0 == 3) {
			var3 = client.field1115.method131();
		}

		if (arg0 == 4) {
			var3 = class60.method348(arg1).method353(50);
		}

		if (arg0 == 5) {
			var3 = null;
		}

		if (var3 != null) {
			field117.method115(var3, (arg0 << 16) + arg1);
		}

		return var3;
	}

	@ObfuscatedName("d.a(ILfb;II)V")
	public static void method36(int arg0, class32 arg1, int arg2) {
		field117.method116();

		if (arg1 != null && arg2 != 4) {
			field117.method115(arg1, (arg2 << 16) + arg0);
		}
	}

	@ObfuscatedName("d.a(Ljava/lang/String;IZLyb;)Ljb;")
	public static class36 method37(String arg0, int arg1, class51 arg2) {
		long var3 = (class52.method311(arg0) << 8) + arg1;
		class36 var5 = (class36) field118.method114(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			class36 var6 = new class36(arg2, arg0, arg1);
			field118.method115(var6, var3);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}
}
