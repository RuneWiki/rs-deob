package deob;

@ObfuscatedName("hc")
public final class class60 {

	@ObfuscatedName("hc.e")
	public static int field888;

	@ObfuscatedName("hc.f")
	public static int[] field889;

	@ObfuscatedName("hc.g")
	public static class39 field890;

	@ObfuscatedName("hc.h")
	public static class60[] field891;

	@ObfuscatedName("hc.i")
	public static int field892;

	@ObfuscatedName("hc.j")
	public static boolean field893 = true;

	@ObfuscatedName("hc.k")
	public int field894 = -1;

	@ObfuscatedName("hc.l")
	public int field895;

	@ObfuscatedName("hc.m")
	public String field896;

	@ObfuscatedName("hc.n")
	public byte[] field897;

	@ObfuscatedName("hc.o")
	public int[] field898;

	@ObfuscatedName("hc.p")
	public int[] field899;

	@ObfuscatedName("hc.q")
	public int field900;

	@ObfuscatedName("hc.r")
	public int field901;

	@ObfuscatedName("hc.s")
	public int field902;

	@ObfuscatedName("hc.t")
	public int field903;

	@ObfuscatedName("hc.u")
	public int field904;

	@ObfuscatedName("hc.v")
	public int field905;

	@ObfuscatedName("hc.x")
	public int field906;

	@ObfuscatedName("hc.y")
	public boolean field907;

	@ObfuscatedName("hc.z")
	public int field908;

	@ObfuscatedName("hc.Y")
	public static class20 field933 = new class20(50);

	@ObfuscatedName("hc.Z")
	public static class20 field934 = new class20(100);

	@ObfuscatedName("hc.F")
	public byte field914;

	@ObfuscatedName("hc.I")
	public byte field917;

	@ObfuscatedName("hc.D")
	public int field912;

	@ObfuscatedName("hc.E")
	public int field913;

	@ObfuscatedName("hc.G")
	public int field915;

	@ObfuscatedName("hc.H")
	public int field916;

	@ObfuscatedName("hc.J")
	public int field918;

	@ObfuscatedName("hc.K")
	public int field919;

	@ObfuscatedName("hc.L")
	public int field920;

	@ObfuscatedName("hc.M")
	public int field921;

	@ObfuscatedName("hc.N")
	public int field922;

	@ObfuscatedName("hc.O")
	public int field923;

	@ObfuscatedName("hc.R")
	public int field926;

	@ObfuscatedName("hc.S")
	public int field927;

	@ObfuscatedName("hc.T")
	public int field928;

	@ObfuscatedName("hc.U")
	public int field929;

	@ObfuscatedName("hc.V")
	public int field930;

	@ObfuscatedName("hc.W")
	public int field931;

	@ObfuscatedName("hc.X")
	public int field932;

	@ObfuscatedName("hc.A")
	public boolean field909;

	@ObfuscatedName("hc.P")
	public int[] field924;

	@ObfuscatedName("hc.Q")
	public int[] field925;

	@ObfuscatedName("hc.B")
	public String[] field910;

	@ObfuscatedName("hc.C")
	public String[] field911;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static final void method346(class51 arg0) {
		field890 = new class39(arg0.method308("obj.dat", null));
		class39 var1 = new class39(arg0.method308("obj.idx", null));
		field888 = var1.method240();
		field889 = new int[field888];
		int var2 = 2;
		for (int var3 = 0; var3 < field888; var3++) {
			field889[var3] = var2;
			var2 += var1.method240();
		}

		field891 = new class60[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field891[var4] = new class60();
		}
	}

	@ObfuscatedName("hc.a(I)V")
	public static final void method347() {
		field933 = null;
		field934 = null;
		field889 = null;
		field891 = null;
		field890 = null;
	}

	@ObfuscatedName("hc.b(I)Lhc;")
	public static final class60 method348(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field891[var1].field894 == arg0) {
				return field891[var1];
			}
		}

		field892 = (field892 + 1) % 10;
		class60 var2 = field891[field892];
		field890.field621 = field889[arg0];
		var2.field894 = arg0;
		var2.method349();
		var2.method350(field890);

		if (var2.field927 != -1) {
			var2.method351();
		}

		if (!field893 && var2.field909) {
			var2.field896 = "Members Object";
			var2.field897 = "Login to a members' server to use this object.".getBytes();
			var2.field910 = null;
			var2.field911 = null;
		}

		return var2;
	}

	@ObfuscatedName("hc.a()V")
	public final void method349() {
		field895 = 0;
		field896 = null;
		field897 = null;
		field898 = null;
		field899 = null;
		field900 = 2000;
		field901 = 0;
		field902 = 0;
		field903 = 0;
		field904 = 0;
		field905 = 0;
		field906 = -1;
		field907 = false;
		field908 = 1;
		field909 = false;
		field910 = null;
		field911 = null;
		field912 = -1;
		field913 = -1;
		field914 = 0;
		field915 = -1;
		field916 = -1;
		field917 = 0;
		field918 = -1;
		field919 = -1;
		field920 = -1;
		field921 = -1;
		field922 = -1;
		field923 = -1;
		field924 = null;
		field925 = null;
		field926 = -1;
		field927 = -1;
		field928 = 128;
		field929 = 128;
		field930 = 128;
		field931 = 0;
		field932 = 0;
	}

	@ObfuscatedName("hc.a(Lmb;I)V")
	public final void method350(class39 arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field895 = arg0.method240();
			} else if (var2 == 2) {
				field896 = arg0.method245();
			} else if (var2 == 3) {
				field897 = arg0.method246();
			} else if (var2 == 4) {
				field900 = arg0.method240();
			} else if (var2 == 5) {
				field901 = arg0.method240();
			} else if (var2 == 6) {
				field902 = arg0.method240();
			} else if (var2 == 7) {
				field904 = arg0.method240();
				if (field904 > 32767) {
					field904 -= 0x10000;
				}
			} else if (var2 == 8) {
				field905 = arg0.method240();
				if (field905 > 32767) {
					field905 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field906 = arg0.method240();
				} else if (var2 == 11) {
					field907 = true;
				} else if (var2 == 12) {
					field908 = arg0.method243();
				} else if (var2 == 16) {
					field909 = true;
				} else if (var2 == 23) {
					field912 = arg0.method240();
					field914 = arg0.method239();
				} else if (var2 == 24) {
					field913 = arg0.method240();
				} else if (var2 == 25) {
					field915 = arg0.method240();
					field917 = arg0.method239();
				} else if (var2 == 26) {
					field916 = arg0.method240();
				} else if (var2 >= 30 && var2 < 35) {
					if (field910 == null) {
						field910 = new String[5];
					}

					field910[var2 - 30] = arg0.method245();
					if (field910[var2 - 30].equalsIgnoreCase("hidden")) {
						field910[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (field911 == null) {
						field911 = new String[5];
					}

					field911[var2 - 35] = arg0.method245();
				} else if (var2 == 40) {
					int var3 = arg0.method238();
					field898 = new int[var3];
					field899 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field898[var4] = arg0.method240();
						field899[var4] = arg0.method240();
					}
				} else if (var2 == 78) {
					field918 = arg0.method240();
				} else if (var2 == 79) {
					field919 = arg0.method240();
				} else if (var2 == 90) {
					field920 = arg0.method240();
				} else if (var2 == 91) {
					field922 = arg0.method240();
				} else if (var2 == 92) {
					field921 = arg0.method240();
				} else if (var2 == 93) {
					field923 = arg0.method240();
				} else if (var2 == 95) {
					field903 = arg0.method240();
				} else if (var2 == 97) {
					field926 = arg0.method240();
				} else if (var2 == 98) {
					field927 = arg0.method240();
				} else if (var2 >= 100 && var2 < 110) {
					if (field924 == null) {
						field924 = new int[10];
						field925 = new int[10];
					}

					field924[var2 - 100] = arg0.method240();
					field925[var2 - 100] = arg0.method240();
				} else if (var2 == 110) {
					field928 = arg0.method240();
				} else if (var2 == 111) {
					field929 = arg0.method240();
				} else if (var2 == 112) {
					field930 = arg0.method240();
				} else if (var2 == 113) {
					field931 = arg0.method239();
				} else if (var2 == 114) {
					field932 = arg0.method239() * 5;
				}
			}
		}
	}

	@ObfuscatedName("hc.a(B)V")
	public void method351() {
		class60 var1 = method348(field927);
		field895 = var1.field895;
		field900 = var1.field900;
		field901 = var1.field901;
		field902 = var1.field902;
		field903 = var1.field903;
		field904 = var1.field904;
		field905 = var1.field905;
		field898 = var1.field898;
		field899 = var1.field899;
		class60 var2 = method348(field926);
		field896 = var2.field896;
		field909 = var2.field909;
		field908 = var2.field908;
		String var3 = "a";
		char var4 = var2.field896.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field897 = ("Swap this note at any bank for " + var3 + " " + var2.field896 + ".").getBytes();
		field907 = true;
	}

	@ObfuscatedName("hc.c(I)Lfb;")
	public final class32 method352(int arg0) {
		if (field924 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field925[var3] && field925[var3] != 0) {
					var2 = field924[var3];
				}
			}

			if (var2 != -1) {
				return method348(var2).method352(1);
			}
		}

		class32 var4 = (class32) field933.method114(field894);
		if (var4 != null) {
			return var4;
		}

		class32 var5 = class32.method138(field895);
		if (var5 == null) {
			return null;
		}

		if (field928 != 128 || field929 != 128 || field930 != 128) {
			var5.method154(field930, field928, field929);
		}

		if (field898 != null) {
			for (int var6 = 0; var6 < field898.length; var6++) {
				var5.method152(field898[var6], field899[var6]);
			}
		}

		var5.method155(field931 + 64, field932 + 768, -50, -10, -50, true);
		var5.field518 = true;
		field933.method115(var5, field894);
		return var5;
	}

	@ObfuscatedName("hc.a(II)Lfb;")
	public final class32 method353(int arg0) {
		if (field924 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field925[var3] && field925[var3] != 0) {
					var2 = field924[var3];
				}
			}

			if (var2 != -1) {
				return method348(var2).method353(1);
			}
		}

		class32 var4 = class32.method138(field895);
		if (var4 == null) {
			return null;
		}

		if (field898 != null) {
			for (int var5 = 0; var5 < field898.length; var5++) {
				var4.method152(field898[var5], field899[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("hc.a(IIZI)Ljb;")
	public static final class36 method354(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			class36 var3 = (class36) field934.method114(arg0);
			if (var3 != null && var3.field600 != arg1 && var3.field600 != -1) {
				var3.method119();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		class60 var4 = method348(arg0);
		if (var4.field924 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field925[var6] && var4.field925[var6] != 0) {
					var5 = var4.field924[var6];
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
		if (var4.field927 != -1) {
			var8 = method354(var4.field926, 10, -1);
			if (var8 == null) {
				return null;
			}
		}

		class36 var9 = new class36(32, 32);
		int var10 = class35.field576;
		int var11 = class35.field577;
		int[] var12 = class35.field582;
		int[] var13 = class34.field561;
		int var14 = class34.field562;
		int var15 = class34.field563;
		int var16 = class34.field566;
		int var17 = class34.field567;
		int var18 = class34.field564;
		int var19 = class34.field565;
		class35.field574 = false;
		class34.method164(32, var9.field594, 32);
		class34.method169(32, 32, 0, 0, 0);
		class35.method177();
		int var20 = var4.field900;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = class35.field580[var4.field901] * var20 >> 16;
		int var22 = class35.field581[var4.field901] * var20 >> 16;
		var7.method158(0, var4.field902, var4.field903, var4.field901, var4.field904, var7.field365 / 2 + var21 + var4.field905, var4.field905 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field594[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field594[var24 * 32 + var23 - 1] > 1) {
						var9.field594[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field594[(var24 - 1) * 32 + var23] > 1) {
						var9.field594[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field594[var24 * 32 + var23 + 1] > 1) {
						var9.field594[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field594[(var24 + 1) * 32 + var23] > 1) {
						var9.field594[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field594[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field594[var26 * 32 + var25 - 1] == 1) {
							var9.field594[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field594[(var26 - 1) * 32 + var25] == 1) {
							var9.field594[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field594[var26 * 32 + var25 + 1] == 1) {
							var9.field594[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field594[(var26 + 1) * 32 + var25] == 1) {
							var9.field594[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field594[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field594[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field594[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field927 != -1) {
			int var29 = var8.field599;
			int var30 = var8.field600;
			var8.field599 = 32;
			var8.field600 = 32;
			var8.method198(0, 0);
			var8.field599 = var29;
			var8.field600 = var30;
		}

		if (arg2 == 0) {
			field934.method115(var9, arg0);
		}

		class34.method164(var14, var13, var15);
		class34.method166(var19, var17, var18, var16);
		class35.field576 = var10;
		class35.field577 = var11;
		class35.field582 = var12;
		class35.field574 = true;

		if (var4.field907) {
			var9.field599 = 33;
		} else {
			var9.field599 = 32;
		}

		var9.field600 = arg1;
		return var9;
	}

	@ObfuscatedName("hc.b(II)Z")
	public final boolean method355(int arg0) {
		int var2 = field912;
		int var3 = field913;
		int var4 = field918;
		if (arg0 == 1) {
			var2 = field915;
			var3 = field916;
			var4 = field919;
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

	@ObfuscatedName("hc.c(II)Lfb;")
	public final class32 method356(int arg0) {
		int var2 = field912;
		int var3 = field913;
		int var4 = field918;
		if (arg0 == 1) {
			var2 = field915;
			var3 = field916;
			var4 = field919;
		}

		if (var2 == -1) {
			return null;
		}

		class32 var5 = class32.method138(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				class32 var9 = class32.method138(var3);
				class32[] var10 = new class32[] { var5, var9 };
				var5 = new class32(2, var10);
			} else {
				class32 var6 = class32.method138(var3);
				class32 var7 = class32.method138(var4);
				class32[] var8 = new class32[] { var5, var6, var7 };
				var5 = new class32(3, var8);
			}
		}

		if (arg0 == 0 && field914 != 0) {
			var5.method151(0, field914, 0);
		}

		if (arg0 == 1 && field917 != 0) {
			var5.method151(0, field917, 0);
		}

		if (field898 != null) {
			for (int var11 = 0; var11 < field898.length; var11++) {
				var5.method152(field898[var11], field899[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("hc.d(II)Z")
	public final boolean method357(int arg0) {
		int var2 = field920;
		int var3 = field921;
		if (arg0 == 1) {
			var2 = field922;
			var3 = field923;
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

	@ObfuscatedName("hc.a(IB)Lfb;")
	public final class32 method358(int arg0) {
		int var2 = field920;
		int var3 = field921;
		if (arg0 == 1) {
			var2 = field922;
			var3 = field923;
		}

		if (var2 == -1) {
			return null;
		}

		class32 var4 = class32.method138(var2);
		if (var3 != -1) {
			class32 var5 = class32.method138(var3);
			class32[] var6 = new class32[] { var4, var5 };
			var4 = new class32(2, var6);
		}

		if (field898 != null) {
			for (int var7 = 0; var7 < field898.length; var7++) {
				var4.method152(field898[var7], field899[var7]);
			}
		}

		return var4;
	}
}
