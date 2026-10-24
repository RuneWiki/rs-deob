package deob;

@ObfuscatedName("hc")
public final class class60 {

	@ObfuscatedName("hc.d")
	public static int field896;

	@ObfuscatedName("hc.e")
	public static int[] field897;

	@ObfuscatedName("hc.f")
	public static class38 field898;

	@ObfuscatedName("hc.g")
	public static class60[] field899;

	@ObfuscatedName("hc.h")
	public static int field900;

	@ObfuscatedName("hc.i")
	public static boolean field901 = true;

	@ObfuscatedName("hc.j")
	public int field902 = -1;

	@ObfuscatedName("hc.k")
	public int field903;

	@ObfuscatedName("hc.l")
	public String field904;

	@ObfuscatedName("hc.m")
	public byte[] field905;

	@ObfuscatedName("hc.n")
	public int[] field906;

	@ObfuscatedName("hc.o")
	public int[] field907;

	@ObfuscatedName("hc.p")
	public int field908;

	@ObfuscatedName("hc.q")
	public int field909;

	@ObfuscatedName("hc.r")
	public int field910;

	@ObfuscatedName("hc.s")
	public int field911;

	@ObfuscatedName("hc.t")
	public int field912;

	@ObfuscatedName("hc.u")
	public int field913;

	@ObfuscatedName("hc.v")
	public int field914;

	@ObfuscatedName("hc.w")
	public boolean field915;

	@ObfuscatedName("hc.x")
	public int field916;

	@ObfuscatedName("hc.y")
	public boolean field917;

	@ObfuscatedName("hc.z")
	public String[] field918;

	@ObfuscatedName("hc.X")
	public static class19 field942 = new class19(50);

	@ObfuscatedName("hc.Y")
	public static class19 field943 = new class19(100);

	@ObfuscatedName("hc.D")
	public byte field922;

	@ObfuscatedName("hc.G")
	public byte field925;

	@ObfuscatedName("hc.B")
	public int field920;

	@ObfuscatedName("hc.C")
	public int field921;

	@ObfuscatedName("hc.E")
	public int field923;

	@ObfuscatedName("hc.F")
	public int field924;

	@ObfuscatedName("hc.H")
	public int field926;

	@ObfuscatedName("hc.I")
	public int field927;

	@ObfuscatedName("hc.J")
	public int field928;

	@ObfuscatedName("hc.K")
	public int field929;

	@ObfuscatedName("hc.L")
	public int field930;

	@ObfuscatedName("hc.M")
	public int field931;

	@ObfuscatedName("hc.P")
	public int field934;

	@ObfuscatedName("hc.Q")
	public int field935;

	@ObfuscatedName("hc.R")
	public int field936;

	@ObfuscatedName("hc.S")
	public int field937;

	@ObfuscatedName("hc.T")
	public int field938;

	@ObfuscatedName("hc.U")
	public int field939;

	@ObfuscatedName("hc.V")
	public int field940;

	@ObfuscatedName("hc.W")
	public int field941;

	@ObfuscatedName("hc.N")
	public int[] field932;

	@ObfuscatedName("hc.O")
	public int[] field933;

	@ObfuscatedName("hc.A")
	public String[] field919;

	@ObfuscatedName("hc.a(Lxb;)V")
	public static final void method340(class50 arg0) {
		field898 = new class38(arg0.method295("obj.dat", null));
		class38 var1 = new class38(arg0.method295("obj.idx", null));
		field896 = var1.method227();
		field897 = new int[field896];
		int var2 = 2;
		for (int var3 = 0; var3 < field896; var3++) {
			field897[var3] = var2;
			var2 += var1.method227();
		}

		field899 = new class60[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field899[var4] = new class60();
		}
	}

	@ObfuscatedName("hc.a(I)V")
	public static final void method341() {
		field942 = null;
		field943 = null;
		field897 = null;
		field899 = null;
		field898 = null;
	}

	@ObfuscatedName("hc.b(I)Lhc;")
	public static final class60 method342(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field899[var1].field902 == arg0) {
				return field899[var1];
			}
		}

		field900 = (field900 + 1) % 10;
		class60 var2 = field899[field900];
		field898.field617 = field897[arg0];
		var2.field902 = arg0;
		var2.method343();
		var2.method344(field898);

		if (var2.field935 != -1) {
			var2.method345();
		}

		if (!field901 && var2.field917) {
			var2.field904 = "Members Object";
			var2.field905 = "Login to a members' server to use this object.".getBytes();
			var2.field918 = null;
			var2.field919 = null;
		}

		return var2;
	}

	@ObfuscatedName("hc.a()V")
	public final void method343() {
		field903 = 0;
		field904 = null;
		field905 = null;
		field906 = null;
		field907 = null;
		field908 = 2000;
		field909 = 0;
		field910 = 0;
		field911 = 0;
		field912 = 0;
		field913 = 0;
		field914 = -1;
		field915 = false;
		field916 = 1;
		field917 = false;
		field918 = null;
		field919 = null;
		field920 = -1;
		field921 = -1;
		field922 = 0;
		field923 = -1;
		field924 = -1;
		field925 = 0;
		field926 = -1;
		field927 = -1;
		field928 = -1;
		field929 = -1;
		field930 = -1;
		field931 = -1;
		field932 = null;
		field933 = null;
		field934 = -1;
		field935 = -1;
		field936 = 128;
		field937 = 128;
		field938 = 128;
		field939 = 0;
		field940 = 0;
		field941 = 0;
	}

	@ObfuscatedName("hc.a(Llb;B)V")
	public final void method344(class38 arg0) {
		while (true) {
			int var2 = arg0.method225();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field903 = arg0.method227();
			} else if (var2 == 2) {
				field904 = arg0.method232();
			} else if (var2 == 3) {
				field905 = arg0.method233();
			} else if (var2 == 4) {
				field908 = arg0.method227();
			} else if (var2 == 5) {
				field909 = arg0.method227();
			} else if (var2 == 6) {
				field910 = arg0.method227();
			} else if (var2 == 7) {
				field912 = arg0.method227();
				if (field912 > 32767) {
					field912 -= 0x10000;
				}
			} else if (var2 == 8) {
				field913 = arg0.method227();
				if (field913 > 32767) {
					field913 -= 0x10000;
				}
			} else if (var2 == 10) {
				field914 = arg0.method227();
			} else if (var2 == 11) {
				field915 = true;
			} else if (var2 == 12) {
				field916 = arg0.method230();
			} else if (var2 == 16) {
				field917 = true;
			} else if (var2 == 23) {
				field920 = arg0.method227();
				field922 = arg0.method226();
			} else if (var2 == 24) {
				field921 = arg0.method227();
			} else if (var2 == 25) {
				field923 = arg0.method227();
				field925 = arg0.method226();
			} else if (var2 == 26) {
				field924 = arg0.method227();
			} else if (var2 >= 30 && var2 < 35) {
				if (field918 == null) {
					field918 = new String[5];
				}

				field918[var2 - 30] = arg0.method232();
				if (field918[var2 - 30].equalsIgnoreCase("hidden")) {
					field918[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field919 == null) {
					field919 = new String[5];
				}

				field919[var2 - 35] = arg0.method232();
			} else if (var2 == 40) {
				int var3 = arg0.method225();
				field906 = new int[var3];
				field907 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field906[var4] = arg0.method227();
					field907[var4] = arg0.method227();
				}
			} else if (var2 == 78) {
				field926 = arg0.method227();
			} else if (var2 == 79) {
				field927 = arg0.method227();
			} else if (var2 == 90) {
				field928 = arg0.method227();
			} else if (var2 == 91) {
				field930 = arg0.method227();
			} else if (var2 == 92) {
				field929 = arg0.method227();
			} else if (var2 == 93) {
				field931 = arg0.method227();
			} else if (var2 == 95) {
				field911 = arg0.method227();
			} else if (var2 == 97) {
				field934 = arg0.method227();
			} else if (var2 == 98) {
				field935 = arg0.method227();
			} else if (var2 >= 100 && var2 < 110) {
				if (field932 == null) {
					field932 = new int[10];
					field933 = new int[10];
				}

				field932[var2 - 100] = arg0.method227();
				field933[var2 - 100] = arg0.method227();
			} else if (var2 == 110) {
				field936 = arg0.method227();
			} else if (var2 == 111) {
				field937 = arg0.method227();
			} else if (var2 == 112) {
				field938 = arg0.method227();
			} else if (var2 == 113) {
				field939 = arg0.method226();
			} else if (var2 == 114) {
				field940 = arg0.method226() * 5;
			} else if (var2 == 115) {
				field941 = arg0.method225();
			}
		}
	}

	@ObfuscatedName("hc.a(Z)V")
	public void method345() {
		class60 var1 = method342(field935);
		field903 = var1.field903;
		field908 = var1.field908;
		field909 = var1.field909;
		field910 = var1.field910;
		field911 = var1.field911;
		field912 = var1.field912;
		field913 = var1.field913;
		field906 = var1.field906;
		field907 = var1.field907;
		class60 var2 = method342(field934);
		field904 = var2.field904;
		field917 = var2.field917;
		field916 = var2.field916;
		String var3 = "a";
		char var4 = var2.field904.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field905 = ("Swap this note at any bank for " + var3 + " " + var2.field904 + ".").getBytes();
		field915 = true;
	}

	@ObfuscatedName("hc.c(I)Leb;")
	public final class31 method346(int arg0) {
		if (field932 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field933[var3] && field933[var3] != 0) {
					var2 = field932[var3];
				}
			}

			if (var2 != -1) {
				return method342(var2).method346(1);
			}
		}

		class31 var4 = (class31) field942.method101(field902);
		if (var4 != null) {
			return var4;
		}

		class31 var5 = class31.method125(field903);
		if (var5 == null) {
			return null;
		}

		if (field936 != 128 || field937 != 128 || field938 != 128) {
			var5.method141(field938, field936, field937);
		}

		if (field906 != null) {
			for (int var6 = 0; var6 < field906.length; var6++) {
				var5.method139(field906[var6], field907[var6]);
			}
		}

		var5.method142(field939 + 64, field940 + 768, -50, -10, -50, true);
		var5.field516 = true;
		field942.method102(var5, field902);
		return var5;
	}

	@ObfuscatedName("hc.a(II)Leb;")
	public final class31 method347(int arg0) {
		if (field932 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field933[var3] && field933[var3] != 0) {
					var2 = field932[var3];
				}
			}

			if (var2 != -1) {
				return method342(var2).method347(1);
			}
		}

		class31 var4 = class31.method125(field903);
		if (var4 == null) {
			return null;
		}

		if (field906 != null) {
			for (int var5 = 0; var5 < field906.length; var5++) {
				var4.method139(field906[var5], field907[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("hc.a(IIIB)Lib;")
	public static final class35 method348(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			class35 var3 = (class35) field943.method101(arg1);
			if (var3 != null && var3.field598 != arg0 && var3.field598 != -1) {
				var3.method106();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		class60 var4 = method342(arg1);
		if (var4.field932 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field933[var6] && var4.field933[var6] != 0) {
					var5 = var4.field932[var6];
				}
			}

			if (var5 != -1) {
				var4 = method342(var5);
			}
		}

		class31 var7 = var4.method346(1);
		if (var7 == null) {
			return null;
		}

		class35 var8 = null;
		if (var4.field935 != -1) {
			var8 = method348(10, var4.field934, -1);
			if (var8 == null) {
				return null;
			}
		}

		class35 var9 = new class35(32, 32);
		int var10 = class34.field574;
		int var11 = class34.field575;
		int[] var12 = class34.field580;
		int[] var13 = class33.field559;
		int var14 = class33.field560;
		int var15 = class33.field561;
		int var16 = class33.field564;
		int var17 = class33.field565;
		int var18 = class33.field562;
		int var19 = class33.field563;
		class34.field572 = false;
		class33.method151(32, 32, var9.field592);
		class33.method156(0, 0, 32, 32, 0);
		class34.method164();
		int var20 = var4.field908;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = class34.field578[var4.field909] * var20 >> 16;
		int var22 = class34.field579[var4.field909] * var20 >> 16;
		var7.method145(0, var4.field910, var4.field911, var4.field909, var4.field912, var7.field359 / 2 + var21 + var4.field913, var4.field913 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field592[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field592[var24 * 32 + var23 - 1] > 1) {
						var9.field592[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field592[(var24 - 1) * 32 + var23] > 1) {
						var9.field592[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field592[var24 * 32 + var23 + 1] > 1) {
						var9.field592[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field592[(var24 + 1) * 32 + var23] > 1) {
						var9.field592[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field592[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field592[var26 * 32 + var25 - 1] == 1) {
							var9.field592[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field592[(var26 - 1) * 32 + var25] == 1) {
							var9.field592[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field592[var26 * 32 + var25 + 1] == 1) {
							var9.field592[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field592[(var26 + 1) * 32 + var25] == 1) {
							var9.field592[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field592[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field592[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field592[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field935 != -1) {
			int var29 = var8.field597;
			int var30 = var8.field598;
			var8.field597 = 32;
			var8.field598 = 32;
			var8.method185(0, 0);
			var8.field597 = var29;
			var8.field598 = var30;
		}

		if (arg2 == 0) {
			field943.method102(var9, arg1);
		}

		class33.method151(var14, var15, var13);
		class33.method153(var18, var16, var17, var19);
		class34.field574 = var10;
		class34.field575 = var11;
		class34.field580 = var12;
		class34.field572 = true;

		if (var4.field915) {
			var9.field597 = 33;
		} else {
			var9.field597 = 32;
		}

		var9.field598 = arg0;
		return var9;
	}

	@ObfuscatedName("hc.b(II)Z")
	public final boolean method349(int arg0) {
		int var2 = field920;
		int var3 = field921;
		int var4 = field926;
		if (arg0 == 1) {
			var2 = field923;
			var3 = field924;
			var4 = field927;
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

	@ObfuscatedName("hc.a(ZI)Leb;")
	public final class31 method350(int arg0) {
		int var2 = field920;
		int var3 = field921;
		int var4 = field926;
		if (arg0 == 1) {
			var2 = field923;
			var3 = field924;
			var4 = field927;
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

		if (arg0 == 0 && field922 != 0) {
			var5.method138(0, field922, 0);
		}

		if (arg0 == 1 && field925 != 0) {
			var5.method138(0, field925, 0);
		}

		if (field906 != null) {
			for (int var11 = 0; var11 < field906.length; var11++) {
				var5.method139(field906[var11], field907[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("hc.b(ZI)Z")
	public final boolean method351(int arg0) {
		int var2 = field928;
		int var3 = field929;
		if (arg0 == 1) {
			var2 = field930;
			var3 = field931;
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

	@ObfuscatedName("hc.a(IZ)Leb;")
	public final class31 method352(int arg0) {
		int var2 = field928;
		int var3 = field929;
		if (arg0 == 1) {
			var2 = field930;
			var3 = field931;
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

		if (field906 != null) {
			for (int var7 = 0; var7 < field906.length; var7++) {
				var4.method139(field906[var7], field907[var7]);
			}
		}

		return var4;
	}
}
