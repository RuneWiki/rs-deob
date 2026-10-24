package deob;

@ObfuscatedName("hc")
public final class class60 {

	@ObfuscatedName("hc.e")
	public static int field894;

	@ObfuscatedName("hc.f")
	public static int[] field895;

	@ObfuscatedName("hc.g")
	public static class38 field896;

	@ObfuscatedName("hc.h")
	public static class60[] field897;

	@ObfuscatedName("hc.i")
	public static int field898;

	@ObfuscatedName("hc.j")
	public static boolean field899 = true;

	@ObfuscatedName("hc.k")
	public int field900 = -1;

	@ObfuscatedName("hc.l")
	public int field901;

	@ObfuscatedName("hc.m")
	public String field902;

	@ObfuscatedName("hc.n")
	public byte[] field903;

	@ObfuscatedName("hc.o")
	public int[] field904;

	@ObfuscatedName("hc.p")
	public int[] field905;

	@ObfuscatedName("hc.q")
	public int field906;

	@ObfuscatedName("hc.r")
	public int field907;

	@ObfuscatedName("hc.s")
	public int field908;

	@ObfuscatedName("hc.t")
	public int field909;

	@ObfuscatedName("hc.u")
	public int field910;

	@ObfuscatedName("hc.v")
	public int field911;

	@ObfuscatedName("hc.w")
	public int field912;

	@ObfuscatedName("hc.x")
	public boolean field913;

	@ObfuscatedName("hc.y")
	public int field914;

	@ObfuscatedName("hc.z")
	public boolean field915;

	@ObfuscatedName("hc.X")
	public static class19 field939 = new class19(50);

	@ObfuscatedName("hc.Y")
	public static class19 field940 = new class19(100);

	@ObfuscatedName("hc.E")
	public byte field920;

	@ObfuscatedName("hc.H")
	public byte field923;

	@ObfuscatedName("hc.C")
	public int field918;

	@ObfuscatedName("hc.D")
	public int field919;

	@ObfuscatedName("hc.F")
	public int field921;

	@ObfuscatedName("hc.G")
	public int field922;

	@ObfuscatedName("hc.I")
	public int field924;

	@ObfuscatedName("hc.J")
	public int field925;

	@ObfuscatedName("hc.K")
	public int field926;

	@ObfuscatedName("hc.L")
	public int field927;

	@ObfuscatedName("hc.M")
	public int field928;

	@ObfuscatedName("hc.N")
	public int field929;

	@ObfuscatedName("hc.Q")
	public int field932;

	@ObfuscatedName("hc.R")
	public int field933;

	@ObfuscatedName("hc.S")
	public int field934;

	@ObfuscatedName("hc.T")
	public int field935;

	@ObfuscatedName("hc.U")
	public int field936;

	@ObfuscatedName("hc.V")
	public int field937;

	@ObfuscatedName("hc.W")
	public int field938;

	@ObfuscatedName("hc.O")
	public int[] field930;

	@ObfuscatedName("hc.P")
	public int[] field931;

	@ObfuscatedName("hc.A")
	public String[] field916;

	@ObfuscatedName("hc.B")
	public String[] field917;

	@ObfuscatedName("hc.a(Lxb;)V")
	public static final void method339(class50 arg0) {
		field896 = new class38(arg0.method294("obj.dat", null));
		class38 var1 = new class38(arg0.method294("obj.idx", null));
		field894 = var1.method226();
		field895 = new int[field894];
		int var2 = 2;
		for (int var3 = 0; var3 < field894; var3++) {
			field895[var3] = var2;
			var2 += var1.method226();
		}

		field897 = new class60[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field897[var4] = new class60();
		}
	}

	@ObfuscatedName("hc.a(B)V")
	public static final void method340() {
		field939 = null;
		field940 = null;
		field895 = null;
		field897 = null;
		field896 = null;
	}

	@ObfuscatedName("hc.a(I)Lhc;")
	public static final class60 method341(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field897[var1].field900 == arg0) {
				return field897[var1];
			}
		}

		field898 = (field898 + 1) % 10;
		class60 var2 = field897[field898];
		field896.field616 = field895[arg0];
		var2.field900 = arg0;
		var2.method342();
		var2.method343(field896);

		if (var2.field933 != -1) {
			var2.method344();
		}

		if (!field899 && var2.field915) {
			var2.field902 = "Members Object";
			var2.field903 = "Login to a members' server to use this object.".getBytes();
			var2.field916 = null;
			var2.field917 = null;
		}

		return var2;
	}

	@ObfuscatedName("hc.a()V")
	public final void method342() {
		field901 = 0;
		field902 = null;
		field903 = null;
		field904 = null;
		field905 = null;
		field906 = 2000;
		field907 = 0;
		field908 = 0;
		field909 = 0;
		field910 = 0;
		field911 = 0;
		field912 = -1;
		field913 = false;
		field914 = 1;
		field915 = false;
		field916 = null;
		field917 = null;
		field918 = -1;
		field919 = -1;
		field920 = 0;
		field921 = -1;
		field922 = -1;
		field923 = 0;
		field924 = -1;
		field925 = -1;
		field926 = -1;
		field927 = -1;
		field928 = -1;
		field929 = -1;
		field930 = null;
		field931 = null;
		field932 = -1;
		field933 = -1;
		field934 = 128;
		field935 = 128;
		field936 = 128;
		field937 = 0;
		field938 = 0;
	}

	@ObfuscatedName("hc.a(Llb;I)V")
	public final void method343(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field901 = arg0.method226();
			} else if (var2 == 2) {
				field902 = arg0.method231();
			} else if (var2 == 3) {
				field903 = arg0.method232();
			} else if (var2 == 4) {
				field906 = arg0.method226();
			} else if (var2 == 5) {
				field907 = arg0.method226();
			} else if (var2 == 6) {
				field908 = arg0.method226();
			} else if (var2 == 7) {
				field910 = arg0.method226();
				if (field910 > 32767) {
					field910 -= 0x10000;
				}
			} else if (var2 == 8) {
				field911 = arg0.method226();
				if (field911 > 32767) {
					field911 -= 0x10000;
				}
			} else if (var2 == 10) {
				field912 = arg0.method226();
			} else if (var2 == 11) {
				field913 = true;
			} else if (var2 == 12) {
				field914 = arg0.method229();
			} else if (var2 == 16) {
				field915 = true;
			} else if (var2 == 23) {
				field918 = arg0.method226();
				field920 = arg0.method225();
			} else if (var2 == 24) {
				field919 = arg0.method226();
			} else if (var2 == 25) {
				field921 = arg0.method226();
				field923 = arg0.method225();
			} else if (var2 == 26) {
				field922 = arg0.method226();
			} else if (var2 >= 30 && var2 < 35) {
				if (field916 == null) {
					field916 = new String[5];
				}

				field916[var2 - 30] = arg0.method231();
				if (field916[var2 - 30].equalsIgnoreCase("hidden")) {
					field916[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field917 == null) {
					field917 = new String[5];
				}

				field917[var2 - 35] = arg0.method231();
			} else if (var2 == 40) {
				int var3 = arg0.method224();
				field904 = new int[var3];
				field905 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field904[var4] = arg0.method226();
					field905[var4] = arg0.method226();
				}
			} else if (var2 == 78) {
				field924 = arg0.method226();
			} else if (var2 == 79) {
				field925 = arg0.method226();
			} else if (var2 == 90) {
				field926 = arg0.method226();
			} else if (var2 == 91) {
				field928 = arg0.method226();
			} else if (var2 == 92) {
				field927 = arg0.method226();
			} else if (var2 == 93) {
				field929 = arg0.method226();
			} else if (var2 == 95) {
				field909 = arg0.method226();
			} else if (var2 == 97) {
				field932 = arg0.method226();
			} else if (var2 == 98) {
				field933 = arg0.method226();
			} else if (var2 >= 100 && var2 < 110) {
				if (field930 == null) {
					field930 = new int[10];
					field931 = new int[10];
				}

				field930[var2 - 100] = arg0.method226();
				field931[var2 - 100] = arg0.method226();
			} else if (var2 == 110) {
				field934 = arg0.method226();
			} else if (var2 == 111) {
				field935 = arg0.method226();
			} else if (var2 == 112) {
				field936 = arg0.method226();
			} else if (var2 == 113) {
				field937 = arg0.method225();
			} else if (var2 == 114) {
				field938 = arg0.method225() * 5;
			}
		}
	}

	@ObfuscatedName("hc.b(I)V")
	public void method344() {
		class60 var1 = method341(field933);
		field901 = var1.field901;
		field906 = var1.field906;
		field907 = var1.field907;
		field908 = var1.field908;
		field909 = var1.field909;
		field910 = var1.field910;
		field911 = var1.field911;
		field904 = var1.field904;
		field905 = var1.field905;
		class60 var2 = method341(field932);
		field902 = var2.field902;
		field915 = var2.field915;
		field914 = var2.field914;
		String var3 = "a";
		char var4 = var2.field902.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field903 = ("Swap this note at any bank for " + var3 + " " + var2.field902 + ".").getBytes();
		field913 = true;
	}

	@ObfuscatedName("hc.c(I)Leb;")
	public final class31 method345(int arg0) {
		if (field930 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field931[var3] && field931[var3] != 0) {
					var2 = field930[var3];
				}
			}

			if (var2 != -1) {
				return method341(var2).method345(1);
			}
		}

		class31 var4 = (class31) field939.method101(field900);
		if (var4 != null) {
			return var4;
		}

		class31 var5 = class31.method125(field901);
		if (var5 == null) {
			return null;
		}

		if (field934 != 128 || field935 != 128 || field936 != 128) {
			var5.method141(field936, field935, field934);
		}

		if (field904 != null) {
			for (int var6 = 0; var6 < field904.length; var6++) {
				var5.method139(field904[var6], field905[var6]);
			}
		}

		var5.method142(field937 + 64, field938 + 768, -50, -10, -50, true);
		var5.field515 = true;
		field939.method102(field900, var5);
		return var5;
	}

	@ObfuscatedName("hc.a(II)Leb;")
	public final class31 method346(int arg0) {
		if (field930 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field931[var3] && field931[var3] != 0) {
					var2 = field930[var3];
				}
			}

			if (var2 != -1) {
				return method341(var2).method346(1);
			}
		}

		class31 var4 = class31.method125(field901);
		if (var4 == null) {
			return null;
		}

		if (field904 != null) {
			for (int var5 = 0; var5 < field904.length; var5++) {
				var4.method139(field904[var5], field905[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("hc.a(IIII)Lib;")
	public static final class35 method347(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			class35 var3 = (class35) field940.method101(arg0);
			if (var3 != null && var3.field597 != arg2 && var3.field597 != -1) {
				var3.method106();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		class60 var4 = method341(arg0);
		if (var4.field930 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field931[var6] && var4.field931[var6] != 0) {
					var5 = var4.field930[var6];
				}
			}

			if (var5 != -1) {
				var4 = method341(var5);
			}
		}

		class31 var7 = var4.method345(1);
		if (var7 == null) {
			return null;
		}

		class35 var8 = null;
		if (var4.field933 != -1) {
			var8 = method347(var4.field932, -1, 10);
			if (var8 == null) {
				return null;
			}
		}

		class35 var9 = new class35(32, 32);
		int var10 = class34.field573;
		int var11 = class34.field574;
		int[] var12 = class34.field579;
		int[] var13 = class33.field558;
		int var14 = class33.field559;
		int var15 = class33.field560;
		int var16 = class33.field563;
		int var17 = class33.field564;
		int var18 = class33.field561;
		int var19 = class33.field562;
		class34.field571 = false;
		class33.method151(var9.field591, 32, 32);
		class33.method156(0, 32, 0, 32, 0);
		class34.method164();
		int var20 = var4.field906;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = class34.field577[var4.field907] * var20 >> 16;
		int var22 = class34.field578[var4.field907] * var20 >> 16;
		var7.method145(0, var4.field908, var4.field909, var4.field907, var4.field910, var7.field359 / 2 + var21 + var4.field911, var4.field911 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field591[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field591[var24 * 32 + var23 - 1] > 1) {
						var9.field591[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field591[(var24 - 1) * 32 + var23] > 1) {
						var9.field591[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field591[var24 * 32 + var23 + 1] > 1) {
						var9.field591[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field591[(var24 + 1) * 32 + var23] > 1) {
						var9.field591[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field591[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field591[var26 * 32 + var25 - 1] == 1) {
							var9.field591[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field591[(var26 - 1) * 32 + var25] == 1) {
							var9.field591[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field591[var26 * 32 + var25 + 1] == 1) {
							var9.field591[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field591[(var26 + 1) * 32 + var25] == 1) {
							var9.field591[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field591[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field591[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field591[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field933 != -1) {
			int var29 = var8.field596;
			int var30 = var8.field597;
			var8.field596 = 32;
			var8.field597 = 32;
			var8.method185(0, 0);
			var8.field596 = var29;
			var8.field597 = var30;
		}

		if (arg1 == 0) {
			field940.method102(arg0, var9);
		}

		class33.method151(var13, var15, var14);
		class33.method153(var16, var17, var18, var19);
		class34.field573 = var10;
		class34.field574 = var11;
		class34.field579 = var12;
		class34.field571 = true;

		if (var4.field913) {
			var9.field596 = 33;
		} else {
			var9.field596 = 32;
		}

		var9.field597 = arg2;
		return var9;
	}

	@ObfuscatedName("hc.b(II)Z")
	public final boolean method348(int arg0) {
		int var2 = field918;
		int var3 = field919;
		int var4 = field924;
		if (arg0 == 1) {
			var2 = field921;
			var3 = field922;
			var4 = field925;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!class31.method126(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !class31.method126(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !class31.method126(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("hc.a(IB)Leb;")
	public final class31 method349(int arg0) {
		int var2 = field918;
		int var3 = field919;
		int var4 = field924;
		if (arg0 == 1) {
			var2 = field921;
			var3 = field922;
			var4 = field925;
		}

		if (var2 == -1) {
			return null;
		}

		class31 var5 = class31.method125(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				class31 var9 = class31.method125(var3);
				class31[] var10 = new class31[] { var5, var9 };
				var5 = new class31(2, var10);
			} else {
				class31 var6 = class31.method125(var3);
				class31 var7 = class31.method125(var4);
				class31[] var8 = new class31[] { var5, var6, var7 };
				var5 = new class31(3, var8);
			}
		}

		if (arg0 == 0 && field920 != 0) {
			var5.method138(0, field920, 0);
		}

		if (arg0 == 1 && field923 != 0) {
			var5.method138(0, field923, 0);
		}

		if (field904 != null) {
			for (int var11 = 0; var11 < field904.length; var11++) {
				var5.method139(field904[var11], field905[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("hc.c(II)Z")
	public final boolean method350(int arg0) {
		int var2 = field926;
		int var3 = field927;
		if (arg0 == 1) {
			var2 = field928;
			var3 = field929;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!class31.method126(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !class31.method126(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("hc.d(II)Leb;")
	public final class31 method351(int arg0) {
		int var2 = field926;
		int var3 = field927;
		if (arg0 == 1) {
			var2 = field928;
			var3 = field929;
		}

		if (var2 == -1) {
			return null;
		}

		class31 var4 = class31.method125(var2);
		if (var3 != -1) {
			class31 var5 = class31.method125(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(2, var6);
		}

		if (field904 != null) {
			for (int var7 = 0; var7 < field904.length; var7++) {
				var4.method139(field904[var7], field905[var7]);
			}
		}

		return var4;
	}
}
