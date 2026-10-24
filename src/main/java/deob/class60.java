package deob;

@ObfuscatedName("hc")
public final class class60 {

	@ObfuscatedName("hc.e")
	public static int field891;

	@ObfuscatedName("hc.f")
	public static int[] field892;

	@ObfuscatedName("hc.g")
	public static class39 field893;

	@ObfuscatedName("hc.h")
	public static class60[] field894;

	@ObfuscatedName("hc.i")
	public static int field895;

	@ObfuscatedName("hc.j")
	public static boolean field896 = true;

	@ObfuscatedName("hc.k")
	public int field897 = -1;

	@ObfuscatedName("hc.l")
	public int field898;

	@ObfuscatedName("hc.m")
	public String field899;

	@ObfuscatedName("hc.n")
	public byte[] field900;

	@ObfuscatedName("hc.o")
	public int[] field901;

	@ObfuscatedName("hc.p")
	public int[] field902;

	@ObfuscatedName("hc.q")
	public int field903;

	@ObfuscatedName("hc.r")
	public int field904;

	@ObfuscatedName("hc.s")
	public int field905;

	@ObfuscatedName("hc.t")
	public int field906;

	@ObfuscatedName("hc.u")
	public int field907;

	@ObfuscatedName("hc.v")
	public int field908;

	@ObfuscatedName("hc.x")
	public int field909;

	@ObfuscatedName("hc.y")
	public boolean field910;

	@ObfuscatedName("hc.z")
	public int field911;

	@ObfuscatedName("hc.Y")
	public static class20 field936 = new class20(50);

	@ObfuscatedName("hc.Z")
	public static class20 field937 = new class20(100);

	@ObfuscatedName("hc.F")
	public byte field917;

	@ObfuscatedName("hc.I")
	public byte field920;

	@ObfuscatedName("hc.D")
	public int field915;

	@ObfuscatedName("hc.E")
	public int field916;

	@ObfuscatedName("hc.G")
	public int field918;

	@ObfuscatedName("hc.H")
	public int field919;

	@ObfuscatedName("hc.J")
	public int field921;

	@ObfuscatedName("hc.K")
	public int field922;

	@ObfuscatedName("hc.L")
	public int field923;

	@ObfuscatedName("hc.M")
	public int field924;

	@ObfuscatedName("hc.N")
	public int field925;

	@ObfuscatedName("hc.O")
	public int field926;

	@ObfuscatedName("hc.R")
	public int field929;

	@ObfuscatedName("hc.S")
	public int field930;

	@ObfuscatedName("hc.T")
	public int field931;

	@ObfuscatedName("hc.U")
	public int field932;

	@ObfuscatedName("hc.V")
	public int field933;

	@ObfuscatedName("hc.W")
	public int field934;

	@ObfuscatedName("hc.X")
	public int field935;

	@ObfuscatedName("hc.A")
	public boolean field912;

	@ObfuscatedName("hc.P")
	public int[] field927;

	@ObfuscatedName("hc.Q")
	public int[] field928;

	@ObfuscatedName("hc.B")
	public String[] field913;

	@ObfuscatedName("hc.C")
	public String[] field914;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static final void method346(class51 arg0) {
		field893 = new class39(arg0.method308("obj.dat", null));
		class39 var1 = new class39(arg0.method308("obj.idx", null));
		field891 = var1.method240();
		field892 = new int[field891];
		int var2 = 2;
		for (int var3 = 0; var3 < field891; var3++) {
			field892[var3] = var2;
			var2 += var1.method240();
		}

		field894 = new class60[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field894[var4] = new class60();
		}
	}

	@ObfuscatedName("hc.a(B)V")
	public static final void method347() {
		field936 = null;
		field937 = null;
		field892 = null;
		field894 = null;
		field893 = null;
	}

	@ObfuscatedName("hc.a(I)Lhc;")
	public static final class60 method348(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field894[var1].field897 == arg0) {
				return field894[var1];
			}
		}

		field895 = (field895 + 1) % 10;
		class60 var2 = field894[field895];
		field893.field623 = field892[arg0];
		var2.field897 = arg0;
		var2.method349();
		var2.method350(field893);

		if (var2.field930 != -1) {
			var2.method351();
		}

		if (!field896 && var2.field912) {
			var2.field899 = "Members Object";
			var2.field900 = "Login to a members' server to use this object.".getBytes();
			var2.field913 = null;
			var2.field914 = null;
		}

		return var2;
	}

	@ObfuscatedName("hc.a()V")
	public final void method349() {
		field898 = 0;
		field899 = null;
		field900 = null;
		field901 = null;
		field902 = null;
		field903 = 2000;
		field904 = 0;
		field905 = 0;
		field906 = 0;
		field907 = 0;
		field908 = 0;
		field909 = -1;
		field910 = false;
		field911 = 1;
		field912 = false;
		field913 = null;
		field914 = null;
		field915 = -1;
		field916 = -1;
		field917 = 0;
		field918 = -1;
		field919 = -1;
		field920 = 0;
		field921 = -1;
		field922 = -1;
		field923 = -1;
		field924 = -1;
		field925 = -1;
		field926 = -1;
		field927 = null;
		field928 = null;
		field929 = -1;
		field930 = -1;
		field931 = 128;
		field932 = 128;
		field933 = 128;
		field934 = 0;
		field935 = 0;
	}

	@ObfuscatedName("hc.a(ZLmb;)V")
	public final void method350(class39 arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field898 = arg0.method240();
			} else if (var2 == 2) {
				field899 = arg0.method245();
			} else if (var2 == 3) {
				field900 = arg0.method246();
			} else if (var2 == 4) {
				field903 = arg0.method240();
			} else if (var2 == 5) {
				field904 = arg0.method240();
			} else if (var2 == 6) {
				field905 = arg0.method240();
			} else if (var2 == 7) {
				field907 = arg0.method240();
				if (field907 > 32767) {
					field907 -= 0x10000;
				}
			} else if (var2 == 8) {
				field908 = arg0.method240();
				if (field908 > 32767) {
					field908 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field909 = arg0.method240();
				} else if (var2 == 11) {
					field910 = true;
				} else if (var2 == 12) {
					field911 = arg0.method243();
				} else if (var2 == 16) {
					field912 = true;
				} else if (var2 == 23) {
					field915 = arg0.method240();
					field917 = arg0.method239();
				} else if (var2 == 24) {
					field916 = arg0.method240();
				} else if (var2 == 25) {
					field918 = arg0.method240();
					field920 = arg0.method239();
				} else if (var2 == 26) {
					field919 = arg0.method240();
				} else if (var2 >= 30 && var2 < 35) {
					if (field913 == null) {
						field913 = new String[5];
					}

					field913[var2 - 30] = arg0.method245();
					if (field913[var2 - 30].equalsIgnoreCase("hidden")) {
						field913[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (field914 == null) {
						field914 = new String[5];
					}

					field914[var2 - 35] = arg0.method245();
				} else if (var2 == 40) {
					int var3 = arg0.method238();
					field901 = new int[var3];
					field902 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field901[var4] = arg0.method240();
						field902[var4] = arg0.method240();
					}
				} else if (var2 == 78) {
					field921 = arg0.method240();
				} else if (var2 == 79) {
					field922 = arg0.method240();
				} else if (var2 == 90) {
					field923 = arg0.method240();
				} else if (var2 == 91) {
					field925 = arg0.method240();
				} else if (var2 == 92) {
					field924 = arg0.method240();
				} else if (var2 == 93) {
					field926 = arg0.method240();
				} else if (var2 == 95) {
					field906 = arg0.method240();
				} else if (var2 == 97) {
					field929 = arg0.method240();
				} else if (var2 == 98) {
					field930 = arg0.method240();
				} else if (var2 >= 100 && var2 < 110) {
					if (field927 == null) {
						field927 = new int[10];
						field928 = new int[10];
					}

					field927[var2 - 100] = arg0.method240();
					field928[var2 - 100] = arg0.method240();
				} else if (var2 == 110) {
					field931 = arg0.method240();
				} else if (var2 == 111) {
					field932 = arg0.method240();
				} else if (var2 == 112) {
					field933 = arg0.method240();
				} else if (var2 == 113) {
					field934 = arg0.method239();
				} else if (var2 == 114) {
					field935 = arg0.method239() * 5;
				}
			}
		}
	}

	@ObfuscatedName("hc.a(Z)V")
	public void method351() {
		class60 var1 = method348(field930);
		field898 = var1.field898;
		field903 = var1.field903;
		field904 = var1.field904;
		field905 = var1.field905;
		field906 = var1.field906;
		field907 = var1.field907;
		field908 = var1.field908;
		field901 = var1.field901;
		field902 = var1.field902;
		class60 var2 = method348(field929);
		field899 = var2.field899;
		field912 = var2.field912;
		field911 = var2.field911;
		String var3 = "a";
		char var4 = var2.field899.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field900 = ("Swap this note at any bank for " + var3 + " " + var2.field899 + ".").getBytes();
		field910 = true;
	}

	@ObfuscatedName("hc.b(I)Lfb;")
	public final class32 method352(int arg0) {
		if (field927 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field928[var3] && field928[var3] != 0) {
					var2 = field927[var3];
				}
			}

			if (var2 != -1) {
				return method348(var2).method352(1);
			}
		}

		class32 var4 = (class32) field936.method114(field897);
		if (var4 != null) {
			return var4;
		}

		class32 var5 = class32.method138(field898);
		if (var5 == null) {
			return null;
		}

		if (field931 != 128 || field932 != 128 || field933 != 128) {
			var5.method154(field931, field933, field932);
		}

		if (field901 != null) {
			for (int var6 = 0; var6 < field901.length; var6++) {
				var5.method152(field901[var6], field902[var6]);
			}
		}

		var5.method155(field934 + 64, field935 + 768, -50, -10, -50, true);
		var5.field520 = true;
		field936.method115(var5, field897);
		return var5;
	}

	@ObfuscatedName("hc.a(II)Lfb;")
	public final class32 method353(int arg0) {
		if (field927 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field928[var3] && field928[var3] != 0) {
					var2 = field927[var3];
				}
			}

			if (var2 != -1) {
				return method348(var2).method353(1);
			}
		}

		class32 var4 = class32.method138(field898);
		if (var4 == null) {
			return null;
		}

		if (field901 != null) {
			for (int var5 = 0; var5 < field901.length; var5++) {
				var4.method152(field901[var5], field902[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("hc.a(IIII)Ljb;")
	public static final class36 method354(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			class36 var3 = (class36) field937.method114(arg2);
			if (var3 != null && var3.field602 != arg1 && var3.field602 != -1) {
				var3.method119();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		class60 var4 = method348(arg2);
		if (var4.field927 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field928[var6] && var4.field928[var6] != 0) {
					var5 = var4.field927[var6];
				}
			}

			if (var5 != -1) {
				var4 = method348(var5);
			}
		}

		class32 var7 = var4.method352(1);
		if (var7 == null) {
			return null;
		}

		class36 var8 = null;
		if (var4.field930 != -1) {
			var8 = method354(-1, 10, var4.field929);
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
		class34.method164(var9.field596, 32, 32);
		class34.method169(0, 32, 0, 32, 0);
		class35.method177();
		int var20 = var4.field903;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = class35.field582[var4.field904] * var20 >> 16;
		int var22 = class35.field583[var4.field904] * var20 >> 16;
		var7.method158(0, var4.field905, var4.field906, var4.field904, var4.field907, var7.field367 / 2 + var21 + var4.field908, var4.field908 + var22);

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

		if (var4.field930 != -1) {
			int var29 = var8.field601;
			int var30 = var8.field602;
			var8.field601 = 32;
			var8.field602 = 32;
			var8.method198(0, 0);
			var8.field601 = var29;
			var8.field602 = var30;
		}

		if (arg0 == 0) {
			field937.method115(var9, arg2);
		}

		class34.method164(var13, var14, var15);
		class34.method166(var18, var17, var19, var16);
		class35.field578 = var10;
		class35.field579 = var11;
		class35.field584 = var12;
		class35.field576 = true;

		if (var4.field910) {
			var9.field601 = 33;
		} else {
			var9.field601 = 32;
		}

		var9.field602 = arg1;
		return var9;
	}

	@ObfuscatedName("hc.a(ZI)Z")
	public final boolean method355(int arg0) {
		int var2 = field915;
		int var3 = field916;
		int var4 = field921;
		if (arg0 == 1) {
			var2 = field918;
			var3 = field919;
			var4 = field922;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!class32.method139(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !class32.method139(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !class32.method139(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("hc.b(II)Lfb;")
	public final class32 method356(int arg0) {
		int var2 = field915;
		int var3 = field916;
		int var4 = field921;
		if (arg0 == 1) {
			var2 = field918;
			var3 = field919;
			var4 = field922;
		}

		if (var2 == -1) {
			return null;
		}

		class32 var5 = class32.method138(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				class32 var9 = class32.method138(var3);
				class32[] var10 = new class32[] { var5, var9 };
				var5 = new class32(var10, 2);
			} else {
				class32 var6 = class32.method138(var3);
				class32 var7 = class32.method138(var4);
				class32[] var8 = new class32[] { var5, var6, var7 };
				var5 = new class32(var8, 3);
			}
		}

		if (arg0 == 0 && field917 != 0) {
			var5.method151(0, 0, field917);
		}

		if (arg0 == 1 && field920 != 0) {
			var5.method151(0, 0, field920);
		}

		if (field901 != null) {
			for (int var11 = 0; var11 < field901.length; var11++) {
				var5.method152(field901[var11], field902[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("hc.c(II)Z")
	public final boolean method357(int arg0) {
		int var2 = field923;
		int var3 = field924;
		if (arg0 == 1) {
			var2 = field925;
			var3 = field926;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!class32.method139(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !class32.method139(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("hc.d(II)Lfb;")
	public final class32 method358(int arg0) {
		int var2 = field923;
		int var3 = field924;
		if (arg0 == 1) {
			var2 = field925;
			var3 = field926;
		}

		if (var2 == -1) {
			return null;
		}

		class32 var4 = class32.method138(var2);
		if (var3 != -1) {
			class32 var5 = class32.method138(var3);
			class32[] var6 = new class32[] { var4, var5 };
			var4 = new class32(var6, 2);
		}

		if (field901 != null) {
			for (int var7 = 0; var7 < field901.length; var7++) {
				var4.method152(field901[var7], field902[var7]);
			}
		}

		return var4;
	}
}
