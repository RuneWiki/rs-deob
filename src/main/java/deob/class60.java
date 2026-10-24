package deob;

@ObfuscatedName("hc")
public class class60 {

	@ObfuscatedName("hc.c")
	public static class60[] field827;

	@ObfuscatedName("hc.d")
	public int[] field828;

	@ObfuscatedName("hc.e")
	public int[] field829;

	@ObfuscatedName("hc.f")
	public int field830;

	@ObfuscatedName("hc.g")
	public int field831;

	@ObfuscatedName("hc.h")
	public int field832;

	@ObfuscatedName("hc.i")
	public int field833;

	@ObfuscatedName("hc.j")
	public int field834;

	@ObfuscatedName("hc.k")
	public int field835;

	@ObfuscatedName("hc.l")
	public int field836;

	@ObfuscatedName("hc.m")
	public int field837;

	@ObfuscatedName("hc.n")
	public int field838;

	@ObfuscatedName("hc.o")
	public int field839;

	@ObfuscatedName("hc.p")
	public int field840;

	@ObfuscatedName("hc.q")
	public int[][] field841;

	@ObfuscatedName("hc.r")
	public int[] field842;

	@ObfuscatedName("hc.s")
	public int[] field843;

	@ObfuscatedName("hc.t")
	public int field844;

	@ObfuscatedName("hc.u")
	public int field845;

	@ObfuscatedName("hc.v")
	public int field846;

	@ObfuscatedName("hc.w")
	public boolean field847;

	@ObfuscatedName("hc.x")
	public int[] field848;

	@ObfuscatedName("hc.y")
	public int[] field849;

	@ObfuscatedName("hc.z")
	public int[] field850;

	@ObfuscatedName("hc.ab")
	public int field877;

	@ObfuscatedName("hc.bb")
	public int field878;

	@ObfuscatedName("hc.cb")
	public int field879;

	@ObfuscatedName("hc.db")
	public String field880;

	@ObfuscatedName("hc.eb")
	public String field881;

	@ObfuscatedName("hc.fb")
	public int field882;

	@ObfuscatedName("hc.gb")
	public String field883;

	@ObfuscatedName("hc.hb")
	public static class19 field884;

	@ObfuscatedName("hc.ib")
	public static class19 field885;

	@ObfuscatedName("hc.A")
	public int field851;

	@ObfuscatedName("hc.F")
	public int field856;

	@ObfuscatedName("hc.G")
	public int field857;

	@ObfuscatedName("hc.R")
	public int field868;

	@ObfuscatedName("hc.S")
	public int field869;

	@ObfuscatedName("hc.T")
	public int field870;

	@ObfuscatedName("hc.Y")
	public int field875;

	@ObfuscatedName("hc.Z")
	public int field876;

	@ObfuscatedName("hc.W")
	public class31 field873;

	@ObfuscatedName("hc.X")
	public class31 field874;

	@ObfuscatedName("hc.U")
	public class34 field871;

	@ObfuscatedName("hc.V")
	public class34 field872;

	@ObfuscatedName("hc.O")
	public class36 field865;

	@ObfuscatedName("hc.P")
	public String field866;

	@ObfuscatedName("hc.Q")
	public String field867;

	@ObfuscatedName("hc.B")
	public boolean field852;

	@ObfuscatedName("hc.C")
	public boolean field853;

	@ObfuscatedName("hc.D")
	public boolean field854;

	@ObfuscatedName("hc.E")
	public boolean field855;

	@ObfuscatedName("hc.L")
	public boolean field862;

	@ObfuscatedName("hc.M")
	public boolean field863;

	@ObfuscatedName("hc.N")
	public boolean field864;

	@ObfuscatedName("hc.I")
	public int[] field859;

	@ObfuscatedName("hc.J")
	public int[] field860;

	@ObfuscatedName("hc.H")
	public class34[] field858;

	@ObfuscatedName("hc.K")
	public String[] field861;

	@ObfuscatedName("hc.a(Lub;ILub;[Ljb;)V")
	public static void method313(class47 arg0, class47 arg1, class36[] arg2) {
		field884 = new class19(50000);
		field885 = new class19(50000);
		class37 var3 = new class37(arg1.method249("data", null));
		int var4 = -1;
		int var5 = var3.method210();
		field827 = new class60[var5];
		while (true) {
			class60 var7;
			do {
				if (var3.field540 >= var3.field539.length) {
					field884 = null;
					field885 = null;
					return;
				}

				int var6 = var3.method210();
				if (var6 == 0xFFFF) {
					var4 = var3.method210();
					var6 = var3.method210();
				}

				var7 = field827[var6] = new class60();
				var7.field832 = var6;
				var7.field833 = var4;
				var7.field834 = var3.method208();
				var7.field835 = var3.method208();
				var7.field836 = var3.method210();
				var7.field837 = var3.method210();
				var7.field838 = var3.method210();
				var7.field844 = var3.method208();
				if (var7.field844 == 0) {
					var7.field844 = -1;
				} else {
					var7.field844 = (var7.field844 - 1 << 8) + var3.method208();
				}

				int var8 = var3.method208();
				if (var8 > 0) {
					var7.field842 = new int[var8];
					var7.field843 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field842[var9] = var3.method208();
						var7.field843[var9] = var3.method210();
					}
				}

				int var10 = var3.method208();
				if (var10 > 0) {
					var7.field841 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.method210();
						var7.field841[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field841[var11][var13] = var3.method210();
						}
					}
				}

				if (var7.field834 == 0) {
					var7.field845 = var3.method210();
					var7.field847 = var3.method208() == 1;
					int var14 = var3.method208();
					var7.field848 = new int[var14];
					var7.field849 = new int[var14];
					var7.field850 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field848[var15] = var3.method210();
						var7.field849[var15] = var3.method211();
						var7.field850[var15] = var3.method211();
					}
				}

				if (var7.field834 == 1) {
					var7.field851 = var3.method210();
					var7.field852 = var3.method208() == 1;
				}

				if (var7.field834 == 2) {
					var7.field828 = new int[var7.field838 * var7.field837];
					var7.field829 = new int[var7.field838 * var7.field837];
					var7.field853 = var3.method208() == 1;
					var7.field854 = var3.method208() == 1;
					var7.field855 = var3.method208() == 1;
					var7.field856 = var3.method208();
					var7.field857 = var3.method208();
					var7.field859 = new int[20];
					var7.field860 = new int[20];
					var7.field858 = new class34[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.method208();
						if (var17 == 1) {
							var7.field859[var16] = var3.method211();
							var7.field860[var16] = var3.method211();
							String var18 = var3.method215();
							if (arg0 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field858[var16] = method315(arg0, var18.substring(0, var19), Integer.parseInt(var18.substring(var19 + 1)));
							}
						}
					}

					var7.field861 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field861[var20] = var3.method215();
						if (var7.field861[var20].length() == 0) {
							var7.field861[var20] = null;
						}
					}
				}

				if (var7.field834 == 3) {
					var7.field862 = var3.method208() == 1;
				}

				if (var7.field834 == 4 || var7.field834 == 1) {
					var7.field863 = var3.method208() == 1;
					int var21 = var3.method208();
					if (arg2 != null) {
						var7.field865 = arg2[var21];
					}

					var7.field864 = var3.method208() == 1;
				}

				if (var7.field834 == 4) {
					var7.field866 = var3.method215();
					var7.field867 = var3.method215();
				}

				if (var7.field834 == 1 || var7.field834 == 3 || var7.field834 == 4) {
					var7.field868 = var3.method213();
				}

				if (var7.field834 == 3 || var7.field834 == 4) {
					var7.field869 = var3.method213();
					var7.field870 = var3.method213();
				}

				if (var7.field834 == 5) {
					String var22 = var3.method215();
					if (arg0 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field871 = method315(arg0, var22.substring(0, var23), Integer.parseInt(var22.substring(var23 + 1)));
					}

					String var24 = var3.method215();
					if (arg0 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field872 = method315(arg0, var24.substring(0, var25), Integer.parseInt(var24.substring(var25 + 1)));
					}
				}

				if (var7.field834 == 6) {
					int var26 = var3.method208();
					if (var26 != 0) {
						var7.field873 = method316((var26 - 1 << 8) + var3.method208());
					}

					int var27 = var3.method208();
					if (var27 != 0) {
						var7.field874 = method316((var27 - 1 << 8) + var3.method208());
					}

					int var28 = var3.method208();
					if (var28 == 0) {
						var7.field875 = -1;
					} else {
						var7.field875 = (var28 - 1 << 8) + var3.method208();
					}

					int var29 = var3.method208();
					if (var29 == 0) {
						var7.field876 = -1;
					} else {
						var7.field876 = (var29 - 1 << 8) + var3.method208();
					}

					var7.field877 = var3.method210();
					var7.field878 = var3.method210();
					var7.field879 = var3.method210();
				}

				if (var7.field834 == 7) {
					var7.field828 = new int[var7.field838 * var7.field837];
					var7.field829 = new int[var7.field838 * var7.field837];
					var7.field863 = var3.method208() == 1;
					int var30 = var3.method208();
					if (arg2 != null) {
						var7.field865 = arg2[var30];
					}

					var7.field864 = var3.method208() == 1;
					var7.field868 = var3.method213();
					var7.field856 = var3.method211();
					var7.field857 = var3.method211();
					var7.field854 = var3.method208() == 1;
					var7.field861 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field861[var31] = var3.method215();
						if (var7.field861[var31].length() == 0) {
							var7.field861[var31] = null;
						}
					}
				}

				if (var7.field835 == 2 || var7.field834 == 2) {
					var7.field880 = var3.method215();
					var7.field881 = var3.method215();
					var7.field882 = var3.method210();
				}
			} while (var7.field835 != 1 && var7.field835 != 4 && var7.field835 != 5 && var7.field835 != 6);

			var7.field883 = var3.method215();
			if (var7.field883.length() == 0) {
				if (var7.field835 == 1) {
					var7.field883 = "Ok";
				}

				if (var7.field835 == 4) {
					var7.field883 = "Select";
				}

				if (var7.field835 == 5) {
					var7.field883 = "Select";
				}

				if (var7.field835 == 6) {
					var7.field883 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("hc.a(IIZ)Leb;")
	public class31 method314(int arg0, int arg1, boolean arg2) {
		class31 var4 = field873;
		if (arg2) {
			var4 = field874;
		}

		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.field414 == null) {
			return var4;
		} else {
			class31 var5 = new class31(false, true, true, var4);
			if (arg0 != -1 || arg1 != -1) {
				var5.method125();
			}

			if (arg0 != -1) {
				var5.method126(arg0);
			}

			if (arg1 != -1) {
				var5.method126(arg1);
			}

			var5.method135(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("hc.a(Lub;Ljava/lang/String;II)Lhb;")
	public static class34 method315(class47 arg0, String arg1, int arg2) {
		long var3 = (class48.method252(arg1) << 8) + arg2;
		class34 var5 = (class34) field884.method101(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			class34 var6 = new class34(arg0, arg1, arg2);
			field884.method102(var3, var6);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}

	@ObfuscatedName("hc.a(II)Leb;")
	public static class31 method316(int arg0) {
		class31 var1 = (class31) field885.method101(arg0);
		if (var1 == null) {
			class31 var2 = new class31(arg0);
			field885.method102(arg0, var2);
			return var2;
		}

		return var1;
	}
}
