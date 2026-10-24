package deob;

@ObfuscatedName("ic")
public final class class61 {

	@ObfuscatedName("ic.d")
	public static int field903;

	@ObfuscatedName("ic.e")
	public static int[] field904;

	@ObfuscatedName("ic.f")
	public static class39 field905;

	@ObfuscatedName("ic.g")
	public static class61[] field906;

	@ObfuscatedName("ic.h")
	public static int field907;

	@ObfuscatedName("ic.i")
	public static boolean field908 = true;

	@ObfuscatedName("ic.j")
	public int field909 = -1;

	@ObfuscatedName("ic.k")
	public int field910;

	@ObfuscatedName("ic.l")
	public String field911;

	@ObfuscatedName("ic.m")
	public byte[] field912;

	@ObfuscatedName("ic.n")
	public int[] field913;

	@ObfuscatedName("ic.o")
	public int[] field914;

	@ObfuscatedName("ic.p")
	public int field915;

	@ObfuscatedName("ic.q")
	public int field916;

	@ObfuscatedName("ic.r")
	public int field917;

	@ObfuscatedName("ic.s")
	public int field918;

	@ObfuscatedName("ic.t")
	public int field919;

	@ObfuscatedName("ic.u")
	public int field920;

	@ObfuscatedName("ic.v")
	public int field921;

	@ObfuscatedName("ic.w")
	public boolean field922;

	@ObfuscatedName("ic.x")
	public int field923;

	@ObfuscatedName("ic.y")
	public boolean field924;

	@ObfuscatedName("ic.z")
	public String[] field925;

	@ObfuscatedName("ic.W")
	public static class19 field948 = new class19(50);

	@ObfuscatedName("ic.X")
	public static class19 field949 = new class19(100);

	@ObfuscatedName("ic.D")
	public byte field929;

	@ObfuscatedName("ic.G")
	public byte field932;

	@ObfuscatedName("ic.B")
	public int field927;

	@ObfuscatedName("ic.C")
	public int field928;

	@ObfuscatedName("ic.E")
	public int field930;

	@ObfuscatedName("ic.F")
	public int field931;

	@ObfuscatedName("ic.H")
	public int field933;

	@ObfuscatedName("ic.I")
	public int field934;

	@ObfuscatedName("ic.J")
	public int field935;

	@ObfuscatedName("ic.K")
	public int field936;

	@ObfuscatedName("ic.L")
	public int field937;

	@ObfuscatedName("ic.M")
	public int field938;

	@ObfuscatedName("ic.P")
	public int field941;

	@ObfuscatedName("ic.Q")
	public int field942;

	@ObfuscatedName("ic.R")
	public int field943;

	@ObfuscatedName("ic.S")
	public int field944;

	@ObfuscatedName("ic.T")
	public int field945;

	@ObfuscatedName("ic.U")
	public int field946;

	@ObfuscatedName("ic.V")
	public int field947;

	@ObfuscatedName("ic.N")
	public int[] field939;

	@ObfuscatedName("ic.O")
	public int[] field940;

	@ObfuscatedName("ic.A")
	public String[] field926;

	@ObfuscatedName("ic.a(Lyb;)V")
	public static final void method343(class51 arg0) {
		field905 = new class39(arg0.method298("obj.dat", null));
		class39 var1 = new class39(arg0.method298("obj.idx", null));
		field903 = var1.method230();
		field904 = new int[field903];
		int var2 = 2;
		for (int var3 = 0; var3 < field903; var3++) {
			field904[var3] = var2;
			var2 += var1.method230();
		}

		field906 = new class61[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field906[var4] = new class61();
		}
	}

	@ObfuscatedName("ic.a(I)V")
	public static final void method344() {
		field948 = null;
		field949 = null;
		field904 = null;
		field906 = null;
		field905 = null;
	}

	@ObfuscatedName("ic.b(I)Lic;")
	public static final class61 method345(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field906[var1].field909 == arg0) {
				return field906[var1];
			}
		}

		field907 = (field907 + 1) % 10;
		class61 var2 = field906[field907];
		field905.field625 = field904[arg0];
		var2.field909 = arg0;
		var2.method346();
		var2.method347(field905);

		if (var2.field942 != -1) {
			var2.method348();
		}

		if (!field908 && var2.field924) {
			var2.field911 = "Members Object";
			var2.field912 = "Login to a members' server to use this object.".getBytes();
			var2.field925 = null;
			var2.field926 = null;
		}

		return var2;
	}

	@ObfuscatedName("ic.a()V")
	public final void method346() {
		field910 = 0;
		field911 = null;
		field912 = null;
		field913 = null;
		field914 = null;
		field915 = 2000;
		field916 = 0;
		field917 = 0;
		field918 = 0;
		field919 = 0;
		field920 = 0;
		field921 = -1;
		field922 = false;
		field923 = 1;
		field924 = false;
		field925 = null;
		field926 = null;
		field927 = -1;
		field928 = -1;
		field929 = 0;
		field930 = -1;
		field931 = -1;
		field932 = 0;
		field933 = -1;
		field934 = -1;
		field935 = -1;
		field936 = -1;
		field937 = -1;
		field938 = -1;
		field939 = null;
		field940 = null;
		field941 = -1;
		field942 = -1;
		field943 = 128;
		field944 = 128;
		field945 = 128;
		field946 = 0;
		field947 = 0;
	}

	@ObfuscatedName("ic.a(BLmb;)V")
	public final void method347(class39 arg0) {
		while (true) {
			int var2 = arg0.method228();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field910 = arg0.method230();
			} else if (var2 == 2) {
				field911 = arg0.method235();
			} else if (var2 == 3) {
				field912 = arg0.method236();
			} else if (var2 == 4) {
				field915 = arg0.method230();
			} else if (var2 == 5) {
				field916 = arg0.method230();
			} else if (var2 == 6) {
				field917 = arg0.method230();
			} else if (var2 == 7) {
				field919 = arg0.method230();
				if (field919 > 32767) {
					field919 -= 0x10000;
				}
			} else if (var2 == 8) {
				field920 = arg0.method230();
				if (field920 > 32767) {
					field920 -= 0x10000;
				}
			} else if (var2 == 10) {
				field921 = arg0.method230();
			} else if (var2 == 11) {
				field922 = true;
			} else if (var2 == 12) {
				field923 = arg0.method233();
			} else if (var2 == 16) {
				field924 = true;
			} else if (var2 == 23) {
				field927 = arg0.method230();
				field929 = arg0.method229();
			} else if (var2 == 24) {
				field928 = arg0.method230();
			} else if (var2 == 25) {
				field930 = arg0.method230();
				field932 = arg0.method229();
			} else if (var2 == 26) {
				field931 = arg0.method230();
			} else if (var2 >= 30 && var2 < 35) {
				if (field925 == null) {
					field925 = new String[5];
				}

				field925[var2 - 30] = arg0.method235();
				if (field925[var2 - 30].equalsIgnoreCase("hidden")) {
					field925[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field926 == null) {
					field926 = new String[5];
				}

				field926[var2 - 35] = arg0.method235();
			} else if (var2 == 40) {
				int var3 = arg0.method228();
				field913 = new int[var3];
				field914 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field913[var4] = arg0.method230();
					field914[var4] = arg0.method230();
				}
			} else if (var2 == 78) {
				field933 = arg0.method230();
			} else if (var2 == 79) {
				field934 = arg0.method230();
			} else if (var2 == 90) {
				field935 = arg0.method230();
			} else if (var2 == 91) {
				field937 = arg0.method230();
			} else if (var2 == 92) {
				field936 = arg0.method230();
			} else if (var2 == 93) {
				field938 = arg0.method230();
			} else if (var2 == 95) {
				field918 = arg0.method230();
			} else if (var2 == 97) {
				field941 = arg0.method230();
			} else if (var2 == 98) {
				field942 = arg0.method230();
			} else if (var2 >= 100 && var2 < 110) {
				if (field939 == null) {
					field939 = new int[10];
					field940 = new int[10];
				}

				field939[var2 - 100] = arg0.method230();
				field940[var2 - 100] = arg0.method230();
			} else if (var2 == 110) {
				field943 = arg0.method230();
			} else if (var2 == 111) {
				field944 = arg0.method230();
			} else if (var2 == 112) {
				field945 = arg0.method230();
			} else if (var2 == 113) {
				field946 = arg0.method229();
			} else if (var2 == 114) {
				field947 = arg0.method229() * 5;
			}
		}
	}

	@ObfuscatedName("ic.c(I)V")
	public void method348() {
		class61 var1 = method345(field942);
		field910 = var1.field910;
		field915 = var1.field915;
		field916 = var1.field916;
		field917 = var1.field917;
		field918 = var1.field918;
		field919 = var1.field919;
		field920 = var1.field920;
		field913 = var1.field913;
		field914 = var1.field914;
		class61 var2 = method345(field941);
		field911 = var2.field911;
		field924 = var2.field924;
		field923 = var2.field923;
		String var3 = "a";
		char var4 = var2.field911.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field912 = ("Swap this note at any bank for " + var3 + " " + var2.field911 + ".").getBytes();
		field922 = true;
	}

	@ObfuscatedName("ic.d(I)Leb;")
	public final class31 method349(int arg0) {
		if (field939 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field940[var3] && field940[var3] != 0) {
					var2 = field939[var3];
				}
			}

			if (var2 != -1) {
				return method345(var2).method349(1);
			}
		}

		class31 var4 = (class31) field948.method101(field909);
		if (var4 != null) {
			return var4;
		}

		class31 var5 = class31.method125(field910);
		if (var5 == null) {
			return null;
		}

		if (field943 != 128 || field944 != 128 || field945 != 128) {
			var5.method141(field943, field945, field944);
		}

		if (field913 != null) {
			for (int var6 = 0; var6 < field913.length; var6++) {
				var5.method139(field913[var6], field914[var6]);
			}
		}

		var5.method142(field946 + 64, field947 + 768, -50, -10, -50, true);
		var5.field514 = true;
		field948.method102(var5, field909);
		return var5;
	}

	@ObfuscatedName("ic.a(II)Leb;")
	public final class31 method350(int arg0) {
		if (field939 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field940[var3] && field940[var3] != 0) {
					var2 = field939[var3];
				}
			}

			if (var2 != -1) {
				return method345(var2).method350(1);
			}
		}

		class31 var4 = class31.method125(field910);
		if (var4 == null) {
			return null;
		}

		if (field913 != null) {
			for (int var5 = 0; var5 < field913.length; var5++) {
				var4.method139(field913[var5], field914[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("ic.a(BIII)Lib;")
	public static final class35 method351(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			class35 var3 = (class35) field949.method101(arg1);
			if (var3 != null && var3.field596 != arg2 && var3.field596 != -1) {
				var3.method106();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		class61 var4 = method345(arg1);
		if (var4.field939 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field940[var6] && var4.field940[var6] != 0) {
					var5 = var4.field939[var6];
				}
			}

			if (var5 != -1) {
				var4 = method345(var5);
			}
		}

		class31 var7 = var4.method349(1);
		if (var7 == null) {
			return null;
		}

		class35 var8 = null;
		if (var4.field942 != -1) {
			var8 = method351(-1, var4.field941, 10);
			if (var8 == null) {
				return null;
			}
		}

		class35 var9 = new class35(32, 32);
		int var10 = class34.field572;
		int var11 = class34.field573;
		int[] var12 = class34.field578;
		int[] var13 = class33.field557;
		int var14 = class33.field558;
		int var15 = class33.field559;
		int var16 = class33.field562;
		int var17 = class33.field563;
		int var18 = class33.field560;
		int var19 = class33.field561;
		class34.field570 = false;
		class33.method151(var9.field590, 32, 32);
		class33.method156(32, 0, 0, 32, 0);
		class34.method164();
		int var20 = var4.field915;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = class34.field576[var4.field916] * var20 >> 16;
		int var22 = class34.field577[var4.field916] * var20 >> 16;
		var7.method145(0, var4.field917, var4.field918, var4.field916, var4.field919, var7.field359 / 2 + var21 + var4.field920, var4.field920 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field590[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field590[var24 * 32 + var23 - 1] > 1) {
						var9.field590[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field590[(var24 - 1) * 32 + var23] > 1) {
						var9.field590[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field590[var24 * 32 + var23 + 1] > 1) {
						var9.field590[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field590[(var24 + 1) * 32 + var23] > 1) {
						var9.field590[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field590[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field590[var26 * 32 + var25 - 1] == 1) {
							var9.field590[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field590[(var26 - 1) * 32 + var25] == 1) {
							var9.field590[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field590[var26 * 32 + var25 + 1] == 1) {
							var9.field590[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field590[(var26 + 1) * 32 + var25] == 1) {
							var9.field590[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field590[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field590[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field590[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field942 != -1) {
			int var29 = var8.field595;
			int var30 = var8.field596;
			var8.field595 = 32;
			var8.field596 = 32;
			var8.method185(0, 0);
			var8.field595 = var29;
			var8.field596 = var30;
		}

		if (arg0 == 0) {
			field949.method102(var9, arg1);
		}

		class33.method151(var13, var14, var15);
		class33.method153(var19, var18, var16, var17);
		class34.field572 = var10;
		class34.field573 = var11;
		class34.field578 = var12;
		class34.field570 = true;

		if (var4.field922) {
			var9.field595 = 33;
		} else {
			var9.field595 = 32;
		}

		var9.field596 = arg2;
		return var9;
	}

	@ObfuscatedName("ic.b(II)Z")
	public final boolean method352(int arg0) {
		int var2 = field927;
		int var3 = field928;
		int var4 = field933;
		if (arg0 == 1) {
			var2 = field930;
			var3 = field931;
			var4 = field934;
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

	@ObfuscatedName("ic.c(II)Leb;")
	public final class31 method353(int arg0) {
		int var2 = field927;
		int var3 = field928;
		int var4 = field933;
		if (arg0 == 1) {
			var2 = field930;
			var3 = field931;
			var4 = field934;
		}

		if (var2 == -1) {
			return null;
		}

		class31 var5 = class31.method125(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				class31 var9 = class31.method125(var3);
				class31[] var10 = new class31[] { var5, var9 };
				var5 = new class31(var10, 2);
			} else {
				class31 var6 = class31.method125(var3);
				class31 var7 = class31.method125(var4);
				class31[] var8 = new class31[] { var5, var6, var7 };
				var5 = new class31(var8, 3);
			}
		}

		if (arg0 == 0 && field929 != 0) {
			var5.method138(field929, 0, 0);
		}

		if (arg0 == 1 && field932 != 0) {
			var5.method138(field932, 0, 0);
		}

		if (field913 != null) {
			for (int var11 = 0; var11 < field913.length; var11++) {
				var5.method139(field913[var11], field914[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("ic.d(II)Z")
	public final boolean method354(int arg0) {
		int var2 = field935;
		int var3 = field936;
		if (arg0 == 1) {
			var2 = field937;
			var3 = field938;
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

	@ObfuscatedName("ic.e(II)Leb;")
	public final class31 method355(int arg0) {
		int var2 = field935;
		int var3 = field936;
		if (arg0 == 1) {
			var2 = field937;
			var3 = field938;
		}

		if (var2 == -1) {
			return null;
		}

		class31 var4 = class31.method125(var2);
		if (var3 != -1) {
			class31 var5 = class31.method125(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(var6, 2);
		}

		if (field913 != null) {
			for (int var7 = 0; var7 < field913.length; var7++) {
				var4.method139(field913[var7], field914[var7]);
			}
		}

		return var4;
	}
}
