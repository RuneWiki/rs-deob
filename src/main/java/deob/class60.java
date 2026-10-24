package deob;

@ObfuscatedName("hc")
public final class class60 {

	@ObfuscatedName("hc.d")
	public static int field909;

	@ObfuscatedName("hc.e")
	public static int[] field910;

	@ObfuscatedName("hc.f")
	public static class38 field911;

	@ObfuscatedName("hc.g")
	public static class60[] field912;

	@ObfuscatedName("hc.h")
	public static int field913;

	@ObfuscatedName("hc.i")
	public static boolean field914 = true;

	@ObfuscatedName("hc.j")
	public int field915 = -1;

	@ObfuscatedName("hc.k")
	public int field916;

	@ObfuscatedName("hc.l")
	public String field917;

	@ObfuscatedName("hc.m")
	public byte[] field918;

	@ObfuscatedName("hc.n")
	public int[] field919;

	@ObfuscatedName("hc.o")
	public int[] field920;

	@ObfuscatedName("hc.p")
	public int field921;

	@ObfuscatedName("hc.q")
	public int field922;

	@ObfuscatedName("hc.r")
	public int field923;

	@ObfuscatedName("hc.s")
	public int field924;

	@ObfuscatedName("hc.t")
	public int field925;

	@ObfuscatedName("hc.u")
	public int field926;

	@ObfuscatedName("hc.v")
	public int field927;

	@ObfuscatedName("hc.w")
	public boolean field928;

	@ObfuscatedName("hc.x")
	public int field929;

	@ObfuscatedName("hc.y")
	public boolean field930;

	@ObfuscatedName("hc.z")
	public String[] field931;

	@ObfuscatedName("hc.X")
	public static class19 field955 = new class19(50);

	@ObfuscatedName("hc.Y")
	public static class19 field956 = new class19(100);

	@ObfuscatedName("hc.D")
	public byte field935;

	@ObfuscatedName("hc.G")
	public byte field938;

	@ObfuscatedName("hc.B")
	public int field933;

	@ObfuscatedName("hc.C")
	public int field934;

	@ObfuscatedName("hc.E")
	public int field936;

	@ObfuscatedName("hc.F")
	public int field937;

	@ObfuscatedName("hc.H")
	public int field939;

	@ObfuscatedName("hc.I")
	public int field940;

	@ObfuscatedName("hc.J")
	public int field941;

	@ObfuscatedName("hc.K")
	public int field942;

	@ObfuscatedName("hc.L")
	public int field943;

	@ObfuscatedName("hc.M")
	public int field944;

	@ObfuscatedName("hc.P")
	public int field947;

	@ObfuscatedName("hc.Q")
	public int field948;

	@ObfuscatedName("hc.R")
	public int field949;

	@ObfuscatedName("hc.S")
	public int field950;

	@ObfuscatedName("hc.T")
	public int field951;

	@ObfuscatedName("hc.U")
	public int field952;

	@ObfuscatedName("hc.V")
	public int field953;

	@ObfuscatedName("hc.W")
	public int field954;

	@ObfuscatedName("hc.N")
	public int[] field945;

	@ObfuscatedName("hc.O")
	public int[] field946;

	@ObfuscatedName("hc.A")
	public String[] field932;

	@ObfuscatedName("hc.a(Lxb;)V")
	public static final void method346(class50 arg0) {
		field911 = new class38(arg0.method299("obj.dat", null));
		class38 var1 = new class38(arg0.method299("obj.idx", null));
		field909 = var1.method231();
		field910 = new int[field909];
		int var2 = 2;
		for (int var3 = 0; var3 < field909; var3++) {
			field910[var3] = var2;
			var2 += var1.method231();
		}

		field912 = new class60[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field912[var4] = new class60();
		}
	}

	@ObfuscatedName("hc.a(I)V")
	public static final void method347() {
		field955 = null;
		field956 = null;
		field910 = null;
		field912 = null;
		field911 = null;
	}

	@ObfuscatedName("hc.b(I)Lhc;")
	public static final class60 method348(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field912[var1].field915 == arg0) {
				return field912[var1];
			}
		}

		field913 = (field913 + 1) % 10;
		class60 var2 = field912[field913];
		field911.field621 = field910[arg0];
		var2.field915 = arg0;
		var2.method349();
		var2.method350(field911);

		if (var2.field948 != -1) {
			var2.method351();
		}

		if (!field914 && var2.field930) {
			var2.field917 = "Members Object";
			var2.field918 = "Login to a members' server to use this object.".getBytes();
			var2.field931 = null;
			var2.field932 = null;
			var2.field954 = 0;
		}

		return var2;
	}

	@ObfuscatedName("hc.a()V")
	public final void method349() {
		field916 = 0;
		field917 = null;
		field918 = null;
		field919 = null;
		field920 = null;
		field921 = 2000;
		field922 = 0;
		field923 = 0;
		field924 = 0;
		field925 = 0;
		field926 = 0;
		field927 = -1;
		field928 = false;
		field929 = 1;
		field930 = false;
		field931 = null;
		field932 = null;
		field933 = -1;
		field934 = -1;
		field935 = 0;
		field936 = -1;
		field937 = -1;
		field938 = 0;
		field939 = -1;
		field940 = -1;
		field941 = -1;
		field942 = -1;
		field943 = -1;
		field944 = -1;
		field945 = null;
		field946 = null;
		field947 = -1;
		field948 = -1;
		field949 = 128;
		field950 = 128;
		field951 = 128;
		field952 = 0;
		field953 = 0;
		field954 = 0;
	}

	@ObfuscatedName("hc.a(Llb;I)V")
	public final void method350(class38 arg0) {
		while (true) {
			int var2 = arg0.method229();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field916 = arg0.method231();
			} else if (var2 == 2) {
				field917 = arg0.method236();
			} else if (var2 == 3) {
				field918 = arg0.method237();
			} else if (var2 == 4) {
				field921 = arg0.method231();
			} else if (var2 == 5) {
				field922 = arg0.method231();
			} else if (var2 == 6) {
				field923 = arg0.method231();
			} else if (var2 == 7) {
				field925 = arg0.method231();
				if (field925 > 32767) {
					field925 -= 0x10000;
				}
			} else if (var2 == 8) {
				field926 = arg0.method231();
				if (field926 > 32767) {
					field926 -= 0x10000;
				}
			} else if (var2 == 10) {
				field927 = arg0.method231();
			} else if (var2 == 11) {
				field928 = true;
			} else if (var2 == 12) {
				field929 = arg0.method234();
			} else if (var2 == 16) {
				field930 = true;
			} else if (var2 == 23) {
				field933 = arg0.method231();
				field935 = arg0.method230();
			} else if (var2 == 24) {
				field934 = arg0.method231();
			} else if (var2 == 25) {
				field936 = arg0.method231();
				field938 = arg0.method230();
			} else if (var2 == 26) {
				field937 = arg0.method231();
			} else if (var2 >= 30 && var2 < 35) {
				if (field931 == null) {
					field931 = new String[5];
				}

				field931[var2 - 30] = arg0.method236();
				if (field931[var2 - 30].equalsIgnoreCase("hidden")) {
					field931[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field932 == null) {
					field932 = new String[5];
				}

				field932[var2 - 35] = arg0.method236();
			} else if (var2 == 40) {
				int var3 = arg0.method229();
				field919 = new int[var3];
				field920 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field919[var4] = arg0.method231();
					field920[var4] = arg0.method231();
				}
			} else if (var2 == 78) {
				field939 = arg0.method231();
			} else if (var2 == 79) {
				field940 = arg0.method231();
			} else if (var2 == 90) {
				field941 = arg0.method231();
			} else if (var2 == 91) {
				field943 = arg0.method231();
			} else if (var2 == 92) {
				field942 = arg0.method231();
			} else if (var2 == 93) {
				field944 = arg0.method231();
			} else if (var2 == 95) {
				field924 = arg0.method231();
			} else if (var2 == 97) {
				field947 = arg0.method231();
			} else if (var2 == 98) {
				field948 = arg0.method231();
			} else if (var2 >= 100 && var2 < 110) {
				if (field945 == null) {
					field945 = new int[10];
					field946 = new int[10];
				}

				field945[var2 - 100] = arg0.method231();
				field946[var2 - 100] = arg0.method231();
			} else if (var2 == 110) {
				field949 = arg0.method231();
			} else if (var2 == 111) {
				field950 = arg0.method231();
			} else if (var2 == 112) {
				field951 = arg0.method231();
			} else if (var2 == 113) {
				field952 = arg0.method230();
			} else if (var2 == 114) {
				field953 = arg0.method230() * 5;
			} else if (var2 == 115) {
				field954 = arg0.method229();
			}
		}
	}

	@ObfuscatedName("hc.c(I)V")
	public void method351() {
		class60 var1 = method348(field948);
		field916 = var1.field916;
		field921 = var1.field921;
		field922 = var1.field922;
		field923 = var1.field923;
		field924 = var1.field924;
		field925 = var1.field925;
		field926 = var1.field926;
		field919 = var1.field919;
		field920 = var1.field920;
		class60 var2 = method348(field947);
		field917 = var2.field917;
		field930 = var2.field930;
		field929 = var2.field929;
		String var3 = "a";
		char var4 = var2.field917.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field918 = ("Swap this note at any bank for " + var3 + " " + var2.field917 + ".").getBytes();
		field928 = true;
	}

	@ObfuscatedName("hc.d(I)Leb;")
	public final class31 method352(int arg0) {
		if (field945 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field946[var3] && field946[var3] != 0) {
					var2 = field945[var3];
				}
			}

			if (var2 != -1) {
				return method348(var2).method352(1);
			}
		}

		class31 var4 = (class31) field955.method101(field915);
		if (var4 != null) {
			return var4;
		}

		class31 var5 = class31.method126(field916);
		if (var5 == null) {
			return null;
		}

		if (field949 != 128 || field950 != 128 || field951 != 128) {
			var5.method142(field949, field951, field950);
		}

		if (field919 != null) {
			for (int var6 = 0; var6 < field919.length; var6++) {
				var5.method140(field919[var6], field920[var6]);
			}
		}

		var5.method143(field952 + 64, field953 + 768, -50, -10, -50, true);
		var5.field520 = true;
		field955.method102(field915, var5);
		return var5;
	}

	@ObfuscatedName("hc.a(IB)Leb;")
	public final class31 method353(int arg0) {
		if (field945 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field946[var3] && field946[var3] != 0) {
					var2 = field945[var3];
				}
			}

			if (var2 != -1) {
				return method348(var2).method353(1);
			}
		}

		class31 var4 = class31.method126(field916);
		if (var4 == null) {
			return null;
		}

		if (field919 != null) {
			for (int var5 = 0; var5 < field919.length; var5++) {
				var4.method140(field919[var5], field920[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("hc.a(IIII)Lib;")
	public static final class35 method354(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			class35 var3 = (class35) field956.method101(arg2);
			if (var3 != null && var3.field602 != arg0 && var3.field602 != -1) {
				var3.method106();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		class60 var4 = method348(arg2);
		if (var4.field945 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field946[var6] && var4.field946[var6] != 0) {
					var5 = var4.field945[var6];
				}
			}

			if (var5 != -1) {
				var4 = method348(var5);
			}
		}

		class31 var7 = var4.method352(1);
		if (var7 == null) {
			return null;
		}

		class35 var8 = null;
		if (var4.field948 != -1) {
			var8 = method354(10, -1, var4.field947);
			if (var8 == null) {
				return null;
			}
		}

		class35 var9 = new class35(32, 32);
		int var10 = class34.field578;
		int var11 = class34.field579;
		int[] var12 = class34.field584;
		int[] var13 = class33.field563;
		int var14 = class33.field564;
		int var15 = class33.field565;
		int var16 = class33.field568;
		int var17 = class33.field569;
		int var18 = class33.field566;
		int var19 = class33.field567;
		class34.field576 = false;
		class33.method152(var9.field596, 32, 32);
		class33.method157(0, 32, 0, 32, 0);
		class34.method165();
		int var20 = var4.field921;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = class34.field582[var4.field922] * var20 >> 16;
		int var22 = class34.field583[var4.field922] * var20 >> 16;
		var7.method146(0, var4.field923, var4.field924, var4.field922, var4.field925, var7.field359 / 2 + var21 + var4.field926, var4.field926 + var22);

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

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field596[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field596[var26 * 32 + var25 - 1] == 1) {
							var9.field596[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field596[(var26 - 1) * 32 + var25] == 1) {
							var9.field596[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field596[var26 * 32 + var25 + 1] == 1) {
							var9.field596[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field596[(var26 + 1) * 32 + var25] == 1) {
							var9.field596[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field596[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field596[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field596[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field948 != -1) {
			int var29 = var8.field601;
			int var30 = var8.field602;
			var8.field601 = 32;
			var8.field602 = 32;
			var8.method186(0, 0);
			var8.field601 = var29;
			var8.field602 = var30;
		}

		if (arg1 == 0) {
			field956.method102(arg2, var9);
		}

		class33.method152(var13, var15, var14);
		class33.method154(var16, var17, var18, var19);
		class34.field578 = var10;
		class34.field579 = var11;
		class34.field584 = var12;
		class34.field576 = true;

		if (var4.field928) {
			var9.field601 = 33;
		} else {
			var9.field601 = 32;
		}

		var9.field602 = arg0;
		return var9;
	}

	@ObfuscatedName("hc.b(IB)Z")
	public final boolean method355(int arg0) {
		int var2 = field933;
		int var3 = field934;
		int var4 = field939;
		if (arg0 == 1) {
			var2 = field936;
			var3 = field937;
			var4 = field940;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!class31.method127(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !class31.method127(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !class31.method127(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("hc.a(ZI)Leb;")
	public final class31 method356(int arg0) {
		int var2 = field933;
		int var3 = field934;
		int var4 = field939;
		if (arg0 == 1) {
			var2 = field936;
			var3 = field937;
			var4 = field940;
		}

		if (var2 == -1) {
			return null;
		}

		class31 var5 = class31.method126(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				class31 var9 = class31.method126(var3);
				class31[] var10 = new class31[] { var5, var9 };
				var5 = new class31(2, var10);
			} else {
				class31 var6 = class31.method126(var3);
				class31 var7 = class31.method126(var4);
				class31[] var8 = new class31[] { var5, var6, var7 };
				var5 = new class31(3, var8);
			}
		}

		if (arg0 == 0 && field935 != 0) {
			var5.method139(field935, 0, 0);
		}

		if (arg0 == 1 && field938 != 0) {
			var5.method139(field938, 0, 0);
		}

		if (field919 != null) {
			for (int var11 = 0; var11 < field919.length; var11++) {
				var5.method140(field919[var11], field920[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("hc.a(BI)Z")
	public final boolean method357(int arg0) {
		int var2 = field941;
		int var3 = field942;
		if (arg0 == 1) {
			var2 = field943;
			var3 = field944;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!class31.method127(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !class31.method127(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("hc.a(IZ)Leb;")
	public final class31 method358(int arg0) {
		int var2 = field941;
		int var3 = field942;
		if (arg0 == 1) {
			var2 = field943;
			var3 = field944;
		}

		if (var2 == -1) {
			return null;
		}

		class31 var4 = class31.method126(var2);
		if (var3 != -1) {
			class31 var5 = class31.method126(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(2, var6);
		}

		if (field919 != null) {
			for (int var7 = 0; var7 < field919.length; var7++) {
				var4.method140(field919[var7], field920[var7]);
			}
		}

		return var4;
	}
}
