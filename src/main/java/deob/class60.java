package deob;

@ObfuscatedName("hc")
public class class60 {

	@ObfuscatedName("hc.b")
	public static class60[] field835;

	@ObfuscatedName("hc.c")
	public int[] field836;

	@ObfuscatedName("hc.d")
	public int[] field837;

	@ObfuscatedName("hc.e")
	public int field838;

	@ObfuscatedName("hc.f")
	public int field839;

	@ObfuscatedName("hc.g")
	public int field840;

	@ObfuscatedName("hc.h")
	public int field841;

	@ObfuscatedName("hc.i")
	public int field842;

	@ObfuscatedName("hc.j")
	public int field843;

	@ObfuscatedName("hc.k")
	public int field844;

	@ObfuscatedName("hc.l")
	public int field845;

	@ObfuscatedName("hc.m")
	public int field846;

	@ObfuscatedName("hc.n")
	public int field847;

	@ObfuscatedName("hc.o")
	public int field848;

	@ObfuscatedName("hc.p")
	public int[][] field849;

	@ObfuscatedName("hc.q")
	public int[] field850;

	@ObfuscatedName("hc.r")
	public int[] field851;

	@ObfuscatedName("hc.s")
	public int field852;

	@ObfuscatedName("hc.t")
	public int field853;

	@ObfuscatedName("hc.u")
	public int field854;

	@ObfuscatedName("hc.v")
	public boolean field855;

	@ObfuscatedName("hc.w")
	public int[] field856;

	@ObfuscatedName("hc.x")
	public int[] field857;

	@ObfuscatedName("hc.y")
	public int[] field858;

	@ObfuscatedName("hc.z")
	public int field859;

	@ObfuscatedName("hc.ab")
	public int field886;

	@ObfuscatedName("hc.bb")
	public int field887;

	@ObfuscatedName("hc.cb")
	public String field888;

	@ObfuscatedName("hc.db")
	public String field889;

	@ObfuscatedName("hc.eb")
	public int field890;

	@ObfuscatedName("hc.fb")
	public String field891;

	@ObfuscatedName("hc.gb")
	public static class19 field892;

	@ObfuscatedName("hc.hb")
	public static class19 field893;

	@ObfuscatedName("hc.E")
	public int field864;

	@ObfuscatedName("hc.F")
	public int field865;

	@ObfuscatedName("hc.Q")
	public int field876;

	@ObfuscatedName("hc.R")
	public int field877;

	@ObfuscatedName("hc.S")
	public int field878;

	@ObfuscatedName("hc.X")
	public int field883;

	@ObfuscatedName("hc.Y")
	public int field884;

	@ObfuscatedName("hc.Z")
	public int field885;

	@ObfuscatedName("hc.V")
	public class31 field881;

	@ObfuscatedName("hc.W")
	public class31 field882;

	@ObfuscatedName("hc.T")
	public class34 field879;

	@ObfuscatedName("hc.U")
	public class34 field880;

	@ObfuscatedName("hc.N")
	public class36 field873;

	@ObfuscatedName("hc.O")
	public String field874;

	@ObfuscatedName("hc.P")
	public String field875;

	@ObfuscatedName("hc.A")
	public boolean field860;

	@ObfuscatedName("hc.B")
	public boolean field861;

	@ObfuscatedName("hc.C")
	public boolean field862;

	@ObfuscatedName("hc.D")
	public boolean field863;

	@ObfuscatedName("hc.K")
	public boolean field870;

	@ObfuscatedName("hc.L")
	public boolean field871;

	@ObfuscatedName("hc.M")
	public boolean field872;

	@ObfuscatedName("hc.H")
	public int[] field867;

	@ObfuscatedName("hc.I")
	public int[] field868;

	@ObfuscatedName("hc.G")
	public class34[] field866;

	@ObfuscatedName("hc.J")
	public String[] field869;

	@ObfuscatedName("hc.a(ZLub;Lub;[Ljb;)V")
	public static void method322(class47 arg0, class47 arg1, class36[] arg2) {
		field892 = new class19(50000);
		field893 = new class19(50000);
		class37 var3 = new class37(arg1.method257(null, "data"));
		int var4 = -1;
		int var5 = var3.method218();
		field835 = new class60[var5];
		while (true) {
			class60 var7;
			do {
				if (var3.field543 >= var3.field542.length) {
					field892 = null;
					field893 = null;
					return;
				}

				int var6 = var3.method218();
				if (var6 == 0xFFFF) {
					var4 = var3.method218();
					var6 = var3.method218();
				}

				var7 = field835[var6] = new class60();
				var7.field840 = var6;
				var7.field841 = var4;
				var7.field842 = var3.method216();
				var7.field843 = var3.method216();
				var7.field844 = var3.method218();
				var7.field845 = var3.method218();
				var7.field846 = var3.method218();
				var7.field852 = var3.method216();
				if (var7.field852 == 0) {
					var7.field852 = -1;
				} else {
					var7.field852 = (var7.field852 - 1 << 8) + var3.method216();
				}

				int var8 = var3.method216();
				if (var8 > 0) {
					var7.field850 = new int[var8];
					var7.field851 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field850[var9] = var3.method216();
						var7.field851[var9] = var3.method218();
					}
				}

				int var10 = var3.method216();
				if (var10 > 0) {
					var7.field849 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.method218();
						var7.field849[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field849[var11][var13] = var3.method218();
						}
					}
				}

				if (var7.field842 == 0) {
					var7.field853 = var3.method218();
					var7.field855 = var3.method216() == 1;
					int var14 = var3.method216();
					var7.field856 = new int[var14];
					var7.field857 = new int[var14];
					var7.field858 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field856[var15] = var3.method218();
						var7.field857[var15] = var3.method219();
						var7.field858[var15] = var3.method219();
					}
				}

				if (var7.field842 == 1) {
					var7.field859 = var3.method218();
					var7.field860 = var3.method216() == 1;
				}

				if (var7.field842 == 2) {
					var7.field836 = new int[var7.field846 * var7.field845];
					var7.field837 = new int[var7.field846 * var7.field845];
					var7.field861 = var3.method216() == 1;
					var7.field862 = var3.method216() == 1;
					var7.field863 = var3.method216() == 1;
					var7.field864 = var3.method216();
					var7.field865 = var3.method216();
					var7.field867 = new int[20];
					var7.field868 = new int[20];
					var7.field866 = new class34[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.method216();
						if (var17 == 1) {
							var7.field867[var16] = var3.method219();
							var7.field868[var16] = var3.method219();
							String var18 = var3.method223();
							if (arg0 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field866[var16] = method324(var18.substring(0, var19), arg0, Integer.parseInt(var18.substring(var19 + 1)));
							}
						}
					}

					var7.field869 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field869[var20] = var3.method223();
						if (var7.field869[var20].length() == 0) {
							var7.field869[var20] = null;
						}
					}
				}

				if (var7.field842 == 3) {
					var7.field870 = var3.method216() == 1;
				}

				if (var7.field842 == 4 || var7.field842 == 1) {
					var7.field871 = var3.method216() == 1;
					int var21 = var3.method216();
					if (arg2 != null) {
						var7.field873 = arg2[var21];
					}

					var7.field872 = var3.method216() == 1;
				}

				if (var7.field842 == 4) {
					var7.field874 = var3.method223();
					var7.field875 = var3.method223();
				}

				if (var7.field842 == 1 || var7.field842 == 3 || var7.field842 == 4) {
					var7.field876 = var3.method221();
				}

				if (var7.field842 == 3 || var7.field842 == 4) {
					var7.field877 = var3.method221();
					var7.field878 = var3.method221();
				}

				if (var7.field842 == 5) {
					String var22 = var3.method223();
					if (arg0 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field879 = method324(var22.substring(0, var23), arg0, Integer.parseInt(var22.substring(var23 + 1)));
					}

					String var24 = var3.method223();
					if (arg0 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field880 = method324(var24.substring(0, var25), arg0, Integer.parseInt(var24.substring(var25 + 1)));
					}
				}

				if (var7.field842 == 6) {
					int var26 = var3.method216();
					if (var26 != 0) {
						var7.field881 = method325((var26 - 1 << 8) + var3.method216());
					}

					int var27 = var3.method216();
					if (var27 != 0) {
						var7.field882 = method325((var27 - 1 << 8) + var3.method216());
					}

					int var28 = var3.method216();
					if (var28 == 0) {
						var7.field883 = -1;
					} else {
						var7.field883 = (var28 - 1 << 8) + var3.method216();
					}

					int var29 = var3.method216();
					if (var29 == 0) {
						var7.field884 = -1;
					} else {
						var7.field884 = (var29 - 1 << 8) + var3.method216();
					}

					var7.field885 = var3.method218();
					var7.field886 = var3.method218();
					var7.field887 = var3.method218();
				}

				if (var7.field842 == 7) {
					var7.field836 = new int[var7.field846 * var7.field845];
					var7.field837 = new int[var7.field846 * var7.field845];
					var7.field871 = var3.method216() == 1;
					int var30 = var3.method216();
					if (arg2 != null) {
						var7.field873 = arg2[var30];
					}

					var7.field872 = var3.method216() == 1;
					var7.field876 = var3.method221();
					var7.field864 = var3.method219();
					var7.field865 = var3.method219();
					var7.field862 = var3.method216() == 1;
					var7.field869 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field869[var31] = var3.method223();
						if (var7.field869[var31].length() == 0) {
							var7.field869[var31] = null;
						}
					}
				}

				if (var7.field843 == 2 || var7.field842 == 2) {
					var7.field888 = var3.method223();
					var7.field889 = var3.method223();
					var7.field890 = var3.method218();
				}
			} while (var7.field843 != 1 && var7.field843 != 4 && var7.field843 != 5 && var7.field843 != 6);

			var7.field891 = var3.method223();
			if (var7.field891.length() == 0) {
				if (var7.field843 == 1) {
					var7.field891 = "Ok";
				}

				if (var7.field843 == 4) {
					var7.field891 = "Select";
				}

				if (var7.field843 == 5) {
					var7.field891 = "Select";
				}

				if (var7.field843 == 6) {
					var7.field891 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("hc.a(IIZ)Leb;")
	public class31 method323(int arg0, int arg1, boolean arg2) {
		class31 var4 = field881;
		if (arg2) {
			var4 = field882;
		}

		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.field416 == null) {
			return var4;
		} else {
			class31 var5 = new class31(true, true, var4, false);
			if (arg0 != -1 || arg1 != -1) {
				var5.method127();
			}

			if (arg0 != -1) {
				var5.method128(arg0);
			}

			if (arg1 != -1) {
				var5.method128(arg1);
			}

			var5.method137(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("hc.a(Ljava/lang/String;Lub;BI)Lhb;")
	public static class34 method324(String arg0, class47 arg1, int arg2) {
		long var3 = (class48.method260(arg0) << 8) + arg2;
		class34 var5 = (class34) field892.method103(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			class34 var6 = new class34(arg1, arg0, arg2);
			field892.method104(var6, var3);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}

	@ObfuscatedName("hc.a(IZ)Leb;")
	public static class31 method325(int arg0) {
		class31 var1 = (class31) field893.method103(arg0);
		if (var1 == null) {
			class31 var2 = new class31(arg0);
			field893.method104(var2, arg0);
			return var2;
		}

		return var1;
	}
}
