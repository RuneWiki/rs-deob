package deob;

@ObfuscatedName("d")
public class class4 {

	@ObfuscatedName("d.b")
	public static class4[] field51;

	@ObfuscatedName("d.c")
	public int[] field52;

	@ObfuscatedName("d.d")
	public int[] field53;

	@ObfuscatedName("d.e")
	public int field54;

	@ObfuscatedName("d.f")
	public int field55;

	@ObfuscatedName("d.g")
	public int field56;

	@ObfuscatedName("d.h")
	public int field57;

	@ObfuscatedName("d.i")
	public int field58;

	@ObfuscatedName("d.j")
	public int field59;

	@ObfuscatedName("d.k")
	public int field60;

	@ObfuscatedName("d.l")
	public int field61;

	@ObfuscatedName("d.m")
	public int field62;

	@ObfuscatedName("d.n")
	public int field63;

	@ObfuscatedName("d.o")
	public int field64;

	@ObfuscatedName("d.p")
	public int[][] field65;

	@ObfuscatedName("d.q")
	public int[] field66;

	@ObfuscatedName("d.r")
	public int[] field67;

	@ObfuscatedName("d.s")
	public int field68;

	@ObfuscatedName("d.t")
	public int field69;

	@ObfuscatedName("d.u")
	public int field70;

	@ObfuscatedName("d.v")
	public boolean field71;

	@ObfuscatedName("d.w")
	public int[] field72;

	@ObfuscatedName("d.x")
	public int[] field73;

	@ObfuscatedName("d.y")
	public int[] field74;

	@ObfuscatedName("d.z")
	public int field75;

	@ObfuscatedName("d.ab")
	public int field102;

	@ObfuscatedName("d.bb")
	public int field103;

	@ObfuscatedName("d.cb")
	public int field104;

	@ObfuscatedName("d.db")
	public int field105;

	@ObfuscatedName("d.eb")
	public String field106;

	@ObfuscatedName("d.fb")
	public String field107;

	@ObfuscatedName("d.gb")
	public int field108;

	@ObfuscatedName("d.hb")
	public String field109;

	@ObfuscatedName("d.ib")
	public static class20 field110 = new class20(30);

	@ObfuscatedName("d.jb")
	public static class20 field111;

	@ObfuscatedName("d.Y")
	public int field100;

	@ObfuscatedName("d.Z")
	public int field101;

	@ObfuscatedName("d.E")
	public int field80;

	@ObfuscatedName("d.F")
	public int field81;

	@ObfuscatedName("d.Q")
	public int field92;

	@ObfuscatedName("d.R")
	public int field93;

	@ObfuscatedName("d.S")
	public int field94;

	@ObfuscatedName("d.V")
	public int field97;

	@ObfuscatedName("d.W")
	public int field98;

	@ObfuscatedName("d.X")
	public int field99;

	@ObfuscatedName("d.T")
	public class36 field95;

	@ObfuscatedName("d.U")
	public class36 field96;

	@ObfuscatedName("d.N")
	public class38 field89;

	@ObfuscatedName("d.O")
	public String field90;

	@ObfuscatedName("d.P")
	public String field91;

	@ObfuscatedName("d.A")
	public boolean field76;

	@ObfuscatedName("d.B")
	public boolean field77;

	@ObfuscatedName("d.C")
	public boolean field78;

	@ObfuscatedName("d.D")
	public boolean field79;

	@ObfuscatedName("d.K")
	public boolean field86;

	@ObfuscatedName("d.L")
	public boolean field87;

	@ObfuscatedName("d.M")
	public boolean field88;

	@ObfuscatedName("d.H")
	public int[] field83;

	@ObfuscatedName("d.I")
	public int[] field84;

	@ObfuscatedName("d.G")
	public class36[] field82;

	@ObfuscatedName("d.J")
	public String[] field85;

	@ObfuscatedName("d.a(BLyb;[Llb;Lyb;)V")
	public static void method32(class51 arg0, class38[] arg1, class51 arg2) {
		field111 = new class20(50000);
		class39 var3 = new class39(arg0.method295("data", null));
		int var4 = -1;
		int var5 = var3.method233();
		field51 = new class4[var5];
		while (true) {
			class4 var7;
			do {
				if (var3.field611 >= var3.field610.length) {
					field111 = null;
					return;
				}

				int var6 = var3.method233();
				if (var6 == 0xFFFF) {
					var4 = var3.method233();
					var6 = var3.method233();
				}

				var7 = field51[var6] = new class4();
				var7.field56 = var6;
				var7.field57 = var4;
				var7.field58 = var3.method231();
				var7.field59 = var3.method231();
				var7.field60 = var3.method233();
				var7.field61 = var3.method233();
				var7.field62 = var3.method233();
				var7.field68 = var3.method231();
				if (var7.field68 == 0) {
					var7.field68 = -1;
				} else {
					var7.field68 = (var7.field68 - 1 << 8) + var3.method231();
				}

				int var8 = var3.method231();
				if (var8 > 0) {
					var7.field66 = new int[var8];
					var7.field67 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field66[var9] = var3.method231();
						var7.field67[var9] = var3.method233();
					}
				}

				int var10 = var3.method231();
				if (var10 > 0) {
					var7.field65 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.method233();
						var7.field65[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field65[var11][var13] = var3.method233();
						}
					}
				}

				if (var7.field58 == 0) {
					var7.field69 = var3.method233();
					var7.field71 = var3.method231() == 1;
					int var14 = var3.method231();
					var7.field72 = new int[var14];
					var7.field73 = new int[var14];
					var7.field74 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field72[var15] = var3.method233();
						var7.field73[var15] = var3.method234();
						var7.field74[var15] = var3.method234();
					}
				}

				if (var7.field58 == 1) {
					var7.field75 = var3.method233();
					var7.field76 = var3.method231() == 1;
				}

				if (var7.field58 == 2) {
					var7.field52 = new int[var7.field62 * var7.field61];
					var7.field53 = new int[var7.field62 * var7.field61];
					var7.field77 = var3.method231() == 1;
					var7.field78 = var3.method231() == 1;
					var7.field79 = var3.method231() == 1;
					var7.field80 = var3.method231();
					var7.field81 = var3.method231();
					var7.field83 = new int[20];
					var7.field84 = new int[20];
					var7.field82 = new class36[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.method231();
						if (var17 == 1) {
							var7.field83[var16] = var3.method234();
							var7.field84[var16] = var3.method234();
							String var18 = var3.method238();
							if (arg2 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field82[var16] = method36(arg2, var18.substring(0, var19), Integer.parseInt(var18.substring(var19 + 1)));
							}
						}
					}

					var7.field85 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field85[var20] = var3.method238();
						if (var7.field85[var20].length() == 0) {
							var7.field85[var20] = null;
						}
					}
				}

				if (var7.field58 == 3) {
					var7.field86 = var3.method231() == 1;
				}

				if (var7.field58 == 4 || var7.field58 == 1) {
					var7.field87 = var3.method231() == 1;
					int var21 = var3.method231();
					if (arg1 != null) {
						var7.field89 = arg1[var21];
					}

					var7.field88 = var3.method231() == 1;
				}

				if (var7.field58 == 4) {
					var7.field90 = var3.method238();
					var7.field91 = var3.method238();
				}

				if (var7.field58 == 1 || var7.field58 == 3 || var7.field58 == 4) {
					var7.field92 = var3.method236();
				}

				if (var7.field58 == 3 || var7.field58 == 4) {
					var7.field93 = var3.method236();
					var7.field94 = var3.method236();
				}

				if (var7.field58 == 5) {
					String var22 = var3.method238();
					if (arg2 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field95 = method36(arg2, var22.substring(0, var23), Integer.parseInt(var22.substring(var23 + 1)));
					}

					String var24 = var3.method238();
					if (arg2 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field96 = method36(arg2, var24.substring(0, var25), Integer.parseInt(var24.substring(var25 + 1)));
					}
				}

				if (var7.field58 == 6) {
					int var26 = var3.method231();
					if (var26 != 0) {
						var7.field97 = 1;
						var7.field98 = (var26 - 1 << 8) + var3.method231();
					}

					int var27 = var3.method231();
					if (var27 != 0) {
						var7.field99 = 1;
						var7.field100 = (var27 - 1 << 8) + var3.method231();
					}

					int var28 = var3.method231();
					if (var28 == 0) {
						var7.field101 = -1;
					} else {
						var7.field101 = (var28 - 1 << 8) + var3.method231();
					}

					int var29 = var3.method231();
					if (var29 == 0) {
						var7.field102 = -1;
					} else {
						var7.field102 = (var29 - 1 << 8) + var3.method231();
					}

					var7.field103 = var3.method233();
					var7.field104 = var3.method233();
					var7.field105 = var3.method233();
				}

				if (var7.field58 == 7) {
					var7.field52 = new int[var7.field62 * var7.field61];
					var7.field53 = new int[var7.field62 * var7.field61];
					var7.field87 = var3.method231() == 1;
					int var30 = var3.method231();
					if (arg1 != null) {
						var7.field89 = arg1[var30];
					}

					var7.field88 = var3.method231() == 1;
					var7.field92 = var3.method236();
					var7.field80 = var3.method234();
					var7.field81 = var3.method234();
					var7.field78 = var3.method231() == 1;
					var7.field85 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field85[var31] = var3.method238();
						if (var7.field85[var31].length() == 0) {
							var7.field85[var31] = null;
						}
					}
				}

				if (var7.field59 == 2 || var7.field58 == 2) {
					var7.field106 = var3.method238();
					var7.field107 = var3.method238();
					var7.field108 = var3.method233();
				}
			} while (var7.field59 != 1 && var7.field59 != 4 && var7.field59 != 5 && var7.field59 != 6);

			var7.field109 = var3.method238();
			if (var7.field109.length() == 0) {
				if (var7.field59 == 1) {
					var7.field109 = "Ok";
				}

				if (var7.field59 == 4) {
					var7.field109 = "Select";
				}

				if (var7.field59 == 5) {
					var7.field109 = "Select";
				}

				if (var7.field59 == 6) {
					var7.field109 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("d.a(IIZI)Lfb;")
	public class32 method33(int arg0, int arg1, boolean arg2) {
		class32 var4;
		if (arg2) {
			var4 = method34(field99, field100);
		} else {
			var4 = method34(field97, field98);
		}

		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.field490 == null) {
			return var4;
		} else {
			class32 var5 = new class32(true, true, false, var4);
			if (arg0 != -1 || arg1 != -1) {
				var5.method142();
			}

			if (arg0 != -1) {
				var5.method143(arg0);
			}

			if (arg1 != -1) {
				var5.method143(arg1);
			}

			var5.method152(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("d.a(II)Lfb;")
	public class32 method34(int arg0, int arg1) {
		class32 var3 = (class32) field110.method113((arg0 << 16) + arg1);
		if (var3 != null) {
			return var3;
		}

		if (arg0 == 1) {
			var3 = class32.method135(arg1);
		}

		if (arg0 == 2) {
			var3 = class58.method329(arg1).method332();
		}

		if (arg0 == 3) {
			var3 = client.field1156.method128();
		}

		if (arg0 == 4) {
			var3 = class59.method335(arg1).method340(50);
		}

		if (arg0 == 5) {
			var3 = null;
		}

		if (var3 != null) {
			field110.method114((arg0 << 16) + arg1, var3);
		}

		return var3;
	}

	@ObfuscatedName("d.a(IIILfb;)V")
	public static void method35(int arg0, int arg1, class32 arg2) {
		field110.method115();

		if (arg2 != null && arg0 != 4) {
			field110.method114((arg0 << 16) + arg1, arg2);
		}
	}

	@ObfuscatedName("d.a(Lyb;ILjava/lang/String;I)Ljb;")
	public static class36 method36(class51 arg0, String arg1, int arg2) {
		long var3 = (class52.method298(arg1) << 8) + arg2;
		class36 var5 = (class36) field111.method113(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			class36 var6 = new class36(arg0, arg1, arg2);
			field111.method114(var3, var6);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}
}
