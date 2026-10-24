package deob;

@ObfuscatedName("hc")
public final class class60 {

	@ObfuscatedName("hc.f")
	public static int field890;

	@ObfuscatedName("hc.g")
	public static int[] field891;

	@ObfuscatedName("hc.h")
	public static class39 field892;

	@ObfuscatedName("hc.i")
	public static class60[] field893;

	@ObfuscatedName("hc.j")
	public static int field894;

	@ObfuscatedName("hc.k")
	public static boolean field895 = true;

	@ObfuscatedName("hc.l")
	public int field896 = -1;

	@ObfuscatedName("hc.m")
	public int field897;

	@ObfuscatedName("hc.n")
	public String field898;

	@ObfuscatedName("hc.o")
	public byte[] field899;

	@ObfuscatedName("hc.p")
	public int[] field900;

	@ObfuscatedName("hc.q")
	public int[] field901;

	@ObfuscatedName("hc.r")
	public int field902;

	@ObfuscatedName("hc.s")
	public int field903;

	@ObfuscatedName("hc.t")
	public int field904;

	@ObfuscatedName("hc.u")
	public int field905;

	@ObfuscatedName("hc.v")
	public int field906;

	@ObfuscatedName("hc.w")
	public int field907;

	@ObfuscatedName("hc.x")
	public int field908;

	@ObfuscatedName("hc.y")
	public boolean field909;

	@ObfuscatedName("hc.z")
	public int field910;

	@ObfuscatedName("hc.Y")
	public static class20 field935 = new class20(50);

	@ObfuscatedName("hc.Z")
	public static class20 field936 = new class20(100);

	@ObfuscatedName("hc.F")
	public byte field916;

	@ObfuscatedName("hc.I")
	public byte field919;

	@ObfuscatedName("hc.D")
	public int field914;

	@ObfuscatedName("hc.E")
	public int field915;

	@ObfuscatedName("hc.G")
	public int field917;

	@ObfuscatedName("hc.H")
	public int field918;

	@ObfuscatedName("hc.J")
	public int field920;

	@ObfuscatedName("hc.K")
	public int field921;

	@ObfuscatedName("hc.L")
	public int field922;

	@ObfuscatedName("hc.M")
	public int field923;

	@ObfuscatedName("hc.N")
	public int field924;

	@ObfuscatedName("hc.O")
	public int field925;

	@ObfuscatedName("hc.R")
	public int field928;

	@ObfuscatedName("hc.S")
	public int field929;

	@ObfuscatedName("hc.T")
	public int field930;

	@ObfuscatedName("hc.U")
	public int field931;

	@ObfuscatedName("hc.V")
	public int field932;

	@ObfuscatedName("hc.W")
	public int field933;

	@ObfuscatedName("hc.X")
	public int field934;

	@ObfuscatedName("hc.A")
	public boolean field911;

	@ObfuscatedName("hc.P")
	public int[] field926;

	@ObfuscatedName("hc.Q")
	public int[] field927;

	@ObfuscatedName("hc.B")
	public String[] field912;

	@ObfuscatedName("hc.C")
	public String[] field913;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static final void method348(class51 arg0) {
		field892 = new class39(arg0.method309("obj.dat", null));
		class39 var1 = new class39(arg0.method309("obj.idx", null));
		field890 = var1.method241();
		field891 = new int[field890];
		int var2 = 2;
		for (int var3 = 0; var3 < field890; var3++) {
			field891[var3] = var2;
			var2 += var1.method241();
		}

		field893 = new class60[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field893[var4] = new class60();
		}
	}

	@ObfuscatedName("hc.a(Z)V")
	public static final void method349() {
		field935 = null;
		field936 = null;
		field891 = null;
		field893 = null;
		field892 = null;
	}

	@ObfuscatedName("hc.a(I)Lhc;")
	public static final class60 method350(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field893[var1].field896 == arg0) {
				return field893[var1];
			}
		}

		field894 = (field894 + 1) % 10;
		class60 var2 = field893[field894];
		field892.field623 = field891[arg0];
		var2.field896 = arg0;
		var2.method351();
		var2.method352(field892);

		if (var2.field929 != -1) {
			var2.method353();
		}

		if (!field895 && var2.field911) {
			var2.field898 = "Members Object";
			var2.field899 = "Login to a members' server to use this object.".getBytes();
			var2.field912 = null;
			var2.field913 = null;
		}

		return var2;
	}

	@ObfuscatedName("hc.a()V")
	public final void method351() {
		field897 = 0;
		field898 = null;
		field899 = null;
		field900 = null;
		field901 = null;
		field902 = 2000;
		field903 = 0;
		field904 = 0;
		field905 = 0;
		field906 = 0;
		field907 = 0;
		field908 = -1;
		field909 = false;
		field910 = 1;
		field911 = false;
		field912 = null;
		field913 = null;
		field914 = -1;
		field915 = -1;
		field916 = 0;
		field917 = -1;
		field918 = -1;
		field919 = 0;
		field920 = -1;
		field921 = -1;
		field922 = -1;
		field923 = -1;
		field924 = -1;
		field925 = -1;
		field926 = null;
		field927 = null;
		field928 = -1;
		field929 = -1;
		field930 = 128;
		field931 = 128;
		field932 = 128;
		field933 = 0;
		field934 = 0;
	}

	@ObfuscatedName("hc.a(Lmb;B)V")
	public final void method352(class39 arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field897 = arg0.method241();
			} else if (var2 == 2) {
				field898 = arg0.method246();
			} else if (var2 == 3) {
				field899 = arg0.method247();
			} else if (var2 == 4) {
				field902 = arg0.method241();
			} else if (var2 == 5) {
				field903 = arg0.method241();
			} else if (var2 == 6) {
				field904 = arg0.method241();
			} else if (var2 == 7) {
				field906 = arg0.method241();
				if (field906 > 32767) {
					field906 -= 0x10000;
				}
			} else if (var2 == 8) {
				field907 = arg0.method241();
				if (field907 > 32767) {
					field907 -= 0x10000;
				}
			} else if (var2 == 10) {
				field908 = arg0.method241();
			} else if (var2 == 11) {
				field909 = true;
			} else if (var2 == 12) {
				field910 = arg0.method244();
			} else if (var2 == 16) {
				field911 = true;
			} else if (var2 == 23) {
				field914 = arg0.method241();
				field916 = arg0.method240();
			} else if (var2 == 24) {
				field915 = arg0.method241();
			} else if (var2 == 25) {
				field917 = arg0.method241();
				field919 = arg0.method240();
			} else if (var2 == 26) {
				field918 = arg0.method241();
			} else if (var2 >= 30 && var2 < 35) {
				if (field912 == null) {
					field912 = new String[5];
				}

				field912[var2 - 30] = arg0.method246();
				if (field912[var2 - 30].equalsIgnoreCase("hidden")) {
					field912[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field913 == null) {
					field913 = new String[5];
				}

				field913[var2 - 35] = arg0.method246();
			} else if (var2 == 40) {
				int var3 = arg0.method239();
				field900 = new int[var3];
				field901 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field900[var4] = arg0.method241();
					field901[var4] = arg0.method241();
				}
			} else if (var2 == 78) {
				field920 = arg0.method241();
			} else if (var2 == 79) {
				field921 = arg0.method241();
			} else if (var2 == 90) {
				field922 = arg0.method241();
			} else if (var2 == 91) {
				field924 = arg0.method241();
			} else if (var2 == 92) {
				field923 = arg0.method241();
			} else if (var2 == 93) {
				field925 = arg0.method241();
			} else if (var2 == 95) {
				field905 = arg0.method241();
			} else if (var2 == 97) {
				field928 = arg0.method241();
			} else if (var2 == 98) {
				field929 = arg0.method241();
			} else if (var2 >= 100 && var2 < 110) {
				if (field926 == null) {
					field926 = new int[10];
					field927 = new int[10];
				}

				field926[var2 - 100] = arg0.method241();
				field927[var2 - 100] = arg0.method241();
			} else if (var2 == 110) {
				field930 = arg0.method241();
			} else if (var2 == 111) {
				field931 = arg0.method241();
			} else if (var2 == 112) {
				field932 = arg0.method241();
			} else if (var2 == 113) {
				field933 = arg0.method240();
			} else if (var2 == 114) {
				field934 = arg0.method240() * 5;
			}
		}
	}

	@ObfuscatedName("hc.b(Z)V")
	public void method353() {
		class60 var1 = method350(field929);
		field897 = var1.field897;
		field902 = var1.field902;
		field903 = var1.field903;
		field904 = var1.field904;
		field905 = var1.field905;
		field906 = var1.field906;
		field907 = var1.field907;
		field900 = var1.field900;
		field901 = var1.field901;
		class60 var2 = method350(field928);
		field898 = var2.field898;
		field911 = var2.field911;
		field910 = var2.field910;
		String var3 = "a";
		char var4 = var2.field898.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field899 = ("Swap this note at any bank for " + var3 + " " + var2.field898 + ".").getBytes();
		field909 = true;
	}

	@ObfuscatedName("hc.b(I)Lfb;")
	public final class32 method354(int arg0) {
		if (field926 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field927[var3] && field927[var3] != 0) {
					var2 = field926[var3];
				}
			}

			if (var2 != -1) {
				return method350(var2).method354(1);
			}
		}

		class32 var4 = (class32) field935.method115(field896);
		if (var4 != null) {
			return var4;
		}

		class32 var5 = class32.method139(field897);
		if (var5 == null) {
			return null;
		}

		if (field930 != 128 || field931 != 128 || field932 != 128) {
			var5.method155(field932, field931, field930);
		}

		if (field900 != null) {
			for (int var6 = 0; var6 < field900.length; var6++) {
				var5.method153(field900[var6], field901[var6]);
			}
		}

		var5.method156(field933 + 64, field934 + 768, -50, -10, -50, true);
		var5.field520 = true;
		field935.method116(field896, var5);
		return var5;
	}

	@ObfuscatedName("hc.a(II)Lfb;")
	public final class32 method355(int arg0) {
		if (field926 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field927[var3] && field927[var3] != 0) {
					var2 = field926[var3];
				}
			}

			if (var2 != -1) {
				return method350(var2).method355(1);
			}
		}

		class32 var4 = class32.method139(field897);
		if (var4 == null) {
			return null;
		}

		if (field900 != null) {
			for (int var5 = 0; var5 < field900.length; var5++) {
				var4.method153(field900[var5], field901[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("hc.a(ZIII)Ljb;")
	public static final class36 method356(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			class36 var3 = (class36) field936.method115(arg2);
			if (var3 != null && var3.field602 != arg1 && var3.field602 != -1) {
				var3.method120();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		class60 var4 = method350(arg2);
		if (var4.field926 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field927[var6] && var4.field927[var6] != 0) {
					var5 = var4.field926[var6];
				}
			}

			if (var5 != -1) {
				var4 = method350(var5);
			}
		}

		class32 var7 = var4.method354(1);
		if (var7 == null) {
			return null;
		}

		class36 var8 = null;
		if (var4.field929 != -1) {
			var8 = method356(-1, 10, var4.field928);
			if (var8 == null) {
				return null;
			}
		}

		class36 var9 = new class36(32, 32);
		int var10 = class35.field578;
		int var11 = class35.field579;
		int[] var12 = class35.field584;
		int[] var13 = class34.field563;
		int var14 = class34.field564;
		int var15 = class34.field565;
		int var16 = class34.field568;
		int var17 = class34.field569;
		int var18 = class34.field566;
		int var19 = class34.field567;
		class35.field576 = false;
		class34.method165(var9.field596, 32, 32);
		class34.method170(0, 0, 0, 32, 32);
		class35.method178();
		int var20 = var4.field902;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = class35.field582[var4.field903] * var20 >> 16;
		int var22 = class35.field583[var4.field903] * var20 >> 16;
		var7.method159(0, var4.field904, var4.field905, var4.field903, var4.field906, var7.field367 / 2 + var21 + var4.field907, var4.field907 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field596[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field596[var24 * 32 + var23 - 1] > 1) {
						var9.field596[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field596[(var24 - 1) * 32 + var23] > 1) {
						var9.field596[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field596[var24 * 32 + var23 + 1] > 1) {
						var9.field596[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field596[(var24 + 1) * 32 + var23] > 1) {
						var9.field596[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field596[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field596[var26 * 32 + var25 - 1] == 1) {
							var9.field596[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field596[(var26 - 1) * 32 + var25] == 1) {
							var9.field596[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field596[var26 * 32 + var25 + 1] == 1) {
							var9.field596[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field596[(var26 + 1) * 32 + var25] == 1) {
							var9.field596[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field596[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field596[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field596[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field929 != -1) {
			int var29 = var8.field601;
			int var30 = var8.field602;
			var8.field601 = 32;
			var8.field602 = 32;
			var8.method199(0, 0);
			var8.field601 = var29;
			var8.field602 = var30;
		}

		if (arg0 == 0) {
			field936.method116(arg2, var9);
		}

		class34.method165(var13, var14, var15);
		class34.method167(var17, var16, var18, var19);
		class35.field578 = var10;
		class35.field579 = var11;
		class35.field584 = var12;
		class35.field576 = true;

		if (var4.field909) {
			var9.field601 = 33;
		} else {
			var9.field601 = 32;
		}

		var9.field602 = arg1;
		return var9;
	}

	@ObfuscatedName("hc.a(ZI)Z")
	public final boolean method357(int arg0) {
		int var2 = field914;
		int var3 = field915;
		int var4 = field920;
		if (arg0 == 1) {
			var2 = field917;
			var3 = field918;
			var4 = field921;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!class32.method140(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !class32.method140(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !class32.method140(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("hc.b(II)Lfb;")
	public final class32 method358(int arg0) {
		int var2 = field914;
		int var3 = field915;
		int var4 = field920;
		if (arg0 == 1) {
			var2 = field917;
			var3 = field918;
			var4 = field921;
		}

		if (var2 == -1) {
			return null;
		}

		class32 var5 = class32.method139(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				class32 var9 = class32.method139(var3);
				class32[] var10 = new class32[] { var5, var9 };
				var5 = new class32(2, var10);
			} else {
				class32 var6 = class32.method139(var3);
				class32 var7 = class32.method139(var4);
				class32[] var8 = new class32[] { var5, var6, var7 };
				var5 = new class32(3, var8);
			}
		}

		if (arg0 == 0 && field916 != 0) {
			var5.method152(0, 0, field916);
		}

		if (arg0 == 1 && field919 != 0) {
			var5.method152(0, 0, field919);
		}

		if (field900 != null) {
			for (int var11 = 0; var11 < field900.length; var11++) {
				var5.method153(field900[var11], field901[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("hc.c(II)Z")
	public final boolean method359(int arg0) {
		int var2 = field922;
		int var3 = field923;
		if (arg0 == 1) {
			var2 = field924;
			var3 = field925;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!class32.method140(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !class32.method140(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("hc.d(II)Lfb;")
	public final class32 method360(int arg0) {
		int var2 = field922;
		int var3 = field923;
		if (arg0 == 1) {
			var2 = field924;
			var3 = field925;
		}

		if (var2 == -1) {
			return null;
		}

		class32 var4 = class32.method139(var2);
		if (var3 != -1) {
			class32 var5 = class32.method139(var3);
			class32[] var6 = new class32[] { var4, var5 };
			var4 = new class32(2, var6);
		}

		if (field900 != null) {
			for (int var7 = 0; var7 < field900.length; var7++) {
				var4.method153(field900[var7], field901[var7]);
			}
		}

		return var4;
	}
}
