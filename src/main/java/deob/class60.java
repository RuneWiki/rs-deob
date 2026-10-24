package deob;

@ObfuscatedName("hc")
public class class60 {

	@ObfuscatedName("hc.a")
	public static class60[] field830;

	@ObfuscatedName("hc.b")
	public int[] field831;

	@ObfuscatedName("hc.c")
	public int[] field832;

	@ObfuscatedName("hc.d")
	public int field833;

	@ObfuscatedName("hc.e")
	public int field834;

	@ObfuscatedName("hc.f")
	public int field835;

	@ObfuscatedName("hc.g")
	public int field836;

	@ObfuscatedName("hc.h")
	public int field837;

	@ObfuscatedName("hc.i")
	public int field838;

	@ObfuscatedName("hc.j")
	public int field839;

	@ObfuscatedName("hc.k")
	public int field840;

	@ObfuscatedName("hc.l")
	public int field841;

	@ObfuscatedName("hc.m")
	public int field842;

	@ObfuscatedName("hc.n")
	public int field843;

	@ObfuscatedName("hc.o")
	public int[][] field844;

	@ObfuscatedName("hc.p")
	public int[] field845;

	@ObfuscatedName("hc.q")
	public int[] field846;

	@ObfuscatedName("hc.r")
	public int field847;

	@ObfuscatedName("hc.s")
	public int field848;

	@ObfuscatedName("hc.t")
	public int field849;

	@ObfuscatedName("hc.u")
	public boolean field850;

	@ObfuscatedName("hc.v")
	public int[] field851;

	@ObfuscatedName("hc.w")
	public int[] field852;

	@ObfuscatedName("hc.x")
	public int[] field853;

	@ObfuscatedName("hc.y")
	public int field854;

	@ObfuscatedName("hc.z")
	public boolean field855;

	@ObfuscatedName("hc.ab")
	public int field882;

	@ObfuscatedName("hc.bb")
	public String field883;

	@ObfuscatedName("hc.cb")
	public String field884;

	@ObfuscatedName("hc.db")
	public int field885;

	@ObfuscatedName("hc.eb")
	public String field886;

	@ObfuscatedName("hc.fb")
	public static class19 field887;

	@ObfuscatedName("hc.gb")
	public static class19 field888;

	@ObfuscatedName("hc.D")
	public int field859;

	@ObfuscatedName("hc.E")
	public int field860;

	@ObfuscatedName("hc.P")
	public int field871;

	@ObfuscatedName("hc.Q")
	public int field872;

	@ObfuscatedName("hc.R")
	public int field873;

	@ObfuscatedName("hc.W")
	public int field878;

	@ObfuscatedName("hc.X")
	public int field879;

	@ObfuscatedName("hc.Y")
	public int field880;

	@ObfuscatedName("hc.Z")
	public int field881;

	@ObfuscatedName("hc.U")
	public class31 field876;

	@ObfuscatedName("hc.V")
	public class31 field877;

	@ObfuscatedName("hc.S")
	public class34 field874;

	@ObfuscatedName("hc.T")
	public class34 field875;

	@ObfuscatedName("hc.M")
	public class36 field868;

	@ObfuscatedName("hc.N")
	public String field869;

	@ObfuscatedName("hc.O")
	public String field870;

	@ObfuscatedName("hc.A")
	public boolean field856;

	@ObfuscatedName("hc.B")
	public boolean field857;

	@ObfuscatedName("hc.C")
	public boolean field858;

	@ObfuscatedName("hc.J")
	public boolean field865;

	@ObfuscatedName("hc.K")
	public boolean field866;

	@ObfuscatedName("hc.L")
	public boolean field867;

	@ObfuscatedName("hc.G")
	public int[] field862;

	@ObfuscatedName("hc.H")
	public int[] field863;

	@ObfuscatedName("hc.F")
	public class34[] field861;

	@ObfuscatedName("hc.I")
	public String[] field864;

	@ObfuscatedName("hc.a(Lub;I[Ljb;Lub;)V")
	public static void method314(class47 arg0, class36[] arg1, class47 arg2) {
		field887 = new class19(50000);
		field888 = new class19(50000);
		class37 var3 = new class37(arg0.method250(null, "data"));
		int var4 = -1;
		int var5 = var3.method211();
		field830 = new class60[var5];
		while (true) {
			class60 var7;
			do {
				if (var3.field541 >= var3.field540.length) {
					field887 = null;
					field888 = null;
					return;
				}

				int var6 = var3.method211();
				if (var6 == 0xFFFF) {
					var4 = var3.method211();
					var6 = var3.method211();
				}

				var7 = field830[var6] = new class60();
				var7.field835 = var6;
				var7.field836 = var4;
				var7.field837 = var3.method209();
				var7.field838 = var3.method209();
				var7.field839 = var3.method211();
				var7.field840 = var3.method211();
				var7.field841 = var3.method211();
				var7.field847 = var3.method209();
				if (var7.field847 == 0) {
					var7.field847 = -1;
				} else {
					var7.field847 = (var7.field847 - 1 << 8) + var3.method209();
				}

				int var8 = var3.method209();
				if (var8 > 0) {
					var7.field845 = new int[var8];
					var7.field846 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field845[var9] = var3.method209();
						var7.field846[var9] = var3.method211();
					}
				}

				int var10 = var3.method209();
				if (var10 > 0) {
					var7.field844 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.method211();
						var7.field844[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field844[var11][var13] = var3.method211();
						}
					}
				}

				if (var7.field837 == 0) {
					var7.field848 = var3.method211();
					var7.field850 = var3.method209() == 1;
					int var14 = var3.method209();
					var7.field851 = new int[var14];
					var7.field852 = new int[var14];
					var7.field853 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field851[var15] = var3.method211();
						var7.field852[var15] = var3.method212();
						var7.field853[var15] = var3.method212();
					}
				}

				if (var7.field837 == 1) {
					var7.field854 = var3.method211();
					var7.field855 = var3.method209() == 1;
				}

				if (var7.field837 == 2) {
					var7.field831 = new int[var7.field841 * var7.field840];
					var7.field832 = new int[var7.field841 * var7.field840];
					var7.field856 = var3.method209() == 1;
					var7.field857 = var3.method209() == 1;
					var7.field858 = var3.method209() == 1;
					var7.field859 = var3.method209();
					var7.field860 = var3.method209();
					var7.field862 = new int[20];
					var7.field863 = new int[20];
					var7.field861 = new class34[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.method209();
						if (var17 == 1) {
							var7.field862[var16] = var3.method212();
							var7.field863[var16] = var3.method212();
							String var18 = var3.method216();
							if (arg2 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field861[var16] = method316(arg2, Integer.parseInt(var18.substring(var19 + 1)), var18.substring(0, var19));
							}
						}
					}

					var7.field864 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field864[var20] = var3.method216();
						if (var7.field864[var20].length() == 0) {
							var7.field864[var20] = null;
						}
					}
				}

				if (var7.field837 == 3) {
					var7.field865 = var3.method209() == 1;
				}

				if (var7.field837 == 4 || var7.field837 == 1) {
					var7.field866 = var3.method209() == 1;
					int var21 = var3.method209();
					if (arg1 != null) {
						var7.field868 = arg1[var21];
					}

					var7.field867 = var3.method209() == 1;
				}

				if (var7.field837 == 4) {
					var7.field869 = var3.method216();
					var7.field870 = var3.method216();
				}

				if (var7.field837 == 1 || var7.field837 == 3 || var7.field837 == 4) {
					var7.field871 = var3.method214();
				}

				if (var7.field837 == 3 || var7.field837 == 4) {
					var7.field872 = var3.method214();
					var7.field873 = var3.method214();
				}

				if (var7.field837 == 5) {
					String var22 = var3.method216();
					if (arg2 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field874 = method316(arg2, Integer.parseInt(var22.substring(var23 + 1)), var22.substring(0, var23));
					}

					String var24 = var3.method216();
					if (arg2 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field875 = method316(arg2, Integer.parseInt(var24.substring(var25 + 1)), var24.substring(0, var25));
					}
				}

				if (var7.field837 == 6) {
					int var26 = var3.method209();
					if (var26 != 0) {
						var7.field876 = method317((var26 - 1 << 8) + var3.method209());
					}

					int var27 = var3.method209();
					if (var27 != 0) {
						var7.field877 = method317((var27 - 1 << 8) + var3.method209());
					}

					int var28 = var3.method209();
					if (var28 == 0) {
						var7.field878 = -1;
					} else {
						var7.field878 = (var28 - 1 << 8) + var3.method209();
					}

					int var29 = var3.method209();
					if (var29 == 0) {
						var7.field879 = -1;
					} else {
						var7.field879 = (var29 - 1 << 8) + var3.method209();
					}

					var7.field880 = var3.method211();
					var7.field881 = var3.method211();
					var7.field882 = var3.method211();
				}

				if (var7.field837 == 7) {
					var7.field831 = new int[var7.field841 * var7.field840];
					var7.field832 = new int[var7.field841 * var7.field840];
					var7.field866 = var3.method209() == 1;
					int var30 = var3.method209();
					if (arg1 != null) {
						var7.field868 = arg1[var30];
					}

					var7.field867 = var3.method209() == 1;
					var7.field871 = var3.method214();
					var7.field859 = var3.method212();
					var7.field860 = var3.method212();
					var7.field857 = var3.method209() == 1;
					var7.field864 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field864[var31] = var3.method216();
						if (var7.field864[var31].length() == 0) {
							var7.field864[var31] = null;
						}
					}
				}

				if (var7.field838 == 2 || var7.field837 == 2) {
					var7.field883 = var3.method216();
					var7.field884 = var3.method216();
					var7.field885 = var3.method211();
				}
			} while (var7.field838 != 1 && var7.field838 != 4 && var7.field838 != 5 && var7.field838 != 6);

			var7.field886 = var3.method216();
			if (var7.field886.length() == 0) {
				if (var7.field838 == 1) {
					var7.field886 = "Ok";
				}

				if (var7.field838 == 4) {
					var7.field886 = "Select";
				}

				if (var7.field838 == 5) {
					var7.field886 = "Select";
				}

				if (var7.field838 == 6) {
					var7.field886 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("hc.a(IIZ)Leb;")
	public class31 method315(int arg0, int arg1, boolean arg2) {
		class31 var4 = field876;
		if (arg2) {
			var4 = field877;
		}

		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.field414 == null) {
			return var4;
		} else {
			class31 var5 = new class31(true, var4, true, false);
			if (arg0 != -1 || arg1 != -1) {
				var5.method126();
			}

			if (arg0 != -1) {
				var5.method127(arg0);
			}

			if (arg1 != -1) {
				var5.method127(arg1);
			}

			var5.method136(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("hc.a(Lub;ILjava/lang/String;Z)Lhb;")
	public static class34 method316(class47 arg0, int arg1, String arg2) {
		long var3 = (class48.method253(arg2) << 8) + arg1;
		class34 var5 = (class34) field887.method102(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			class34 var6 = new class34(arg0, arg2, arg1);
			field887.method103(var3, var6);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}

	@ObfuscatedName("hc.a(IZ)Leb;")
	public static class31 method317(int arg0) {
		class31 var1 = (class31) field888.method102(arg0);
		if (var1 == null) {
			class31 var2 = new class31(arg0);
			field888.method103(arg0, var2);
			return var2;
		}

		return var1;
	}
}
