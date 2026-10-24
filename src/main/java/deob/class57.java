package deob;

@ObfuscatedName("ec")
public class class57 {

	@ObfuscatedName("ec.b")
	public static class57[] field777;

	@ObfuscatedName("ec.c")
	public int[] field778;

	@ObfuscatedName("ec.d")
	public int[] field779;

	@ObfuscatedName("ec.e")
	public int field780;

	@ObfuscatedName("ec.f")
	public int field781;

	@ObfuscatedName("ec.g")
	public int field782;

	@ObfuscatedName("ec.h")
	public int field783;

	@ObfuscatedName("ec.i")
	public int field784;

	@ObfuscatedName("ec.j")
	public int field785;

	@ObfuscatedName("ec.k")
	public int field786;

	@ObfuscatedName("ec.l")
	public int field787;

	@ObfuscatedName("ec.m")
	public int field788;

	@ObfuscatedName("ec.n")
	public int field789;

	@ObfuscatedName("ec.o")
	public int field790;

	@ObfuscatedName("ec.p")
	public int[][] field791;

	@ObfuscatedName("ec.q")
	public int[] field792;

	@ObfuscatedName("ec.r")
	public int[] field793;

	@ObfuscatedName("ec.s")
	public int field794;

	@ObfuscatedName("ec.t")
	public int field795;

	@ObfuscatedName("ec.u")
	public int field796;

	@ObfuscatedName("ec.v")
	public boolean field797;

	@ObfuscatedName("ec.w")
	public int[] field798;

	@ObfuscatedName("ec.x")
	public int[] field799;

	@ObfuscatedName("ec.y")
	public int[] field800;

	@ObfuscatedName("ec.z")
	public int field801;

	@ObfuscatedName("ec.ab")
	public int field828;

	@ObfuscatedName("ec.bb")
	public int field829;

	@ObfuscatedName("ec.cb")
	public String field830;

	@ObfuscatedName("ec.db")
	public String field831;

	@ObfuscatedName("ec.eb")
	public int field832;

	@ObfuscatedName("ec.fb")
	public String field833;

	@ObfuscatedName("ec.gb")
	public static class19 field834;

	@ObfuscatedName("ec.hb")
	public static class19 field835;

	@ObfuscatedName("ec.E")
	public int field806;

	@ObfuscatedName("ec.F")
	public int field807;

	@ObfuscatedName("ec.Q")
	public int field818;

	@ObfuscatedName("ec.R")
	public int field819;

	@ObfuscatedName("ec.S")
	public int field820;

	@ObfuscatedName("ec.X")
	public int field825;

	@ObfuscatedName("ec.Y")
	public int field826;

	@ObfuscatedName("ec.Z")
	public int field827;

	@ObfuscatedName("ec.V")
	public class31 field823;

	@ObfuscatedName("ec.W")
	public class31 field824;

	@ObfuscatedName("ec.T")
	public class34 field821;

	@ObfuscatedName("ec.U")
	public class34 field822;

	@ObfuscatedName("ec.N")
	public class36 field815;

	@ObfuscatedName("ec.O")
	public String field816;

	@ObfuscatedName("ec.P")
	public String field817;

	@ObfuscatedName("ec.A")
	public boolean field802;

	@ObfuscatedName("ec.B")
	public boolean field803;

	@ObfuscatedName("ec.C")
	public boolean field804;

	@ObfuscatedName("ec.D")
	public boolean field805;

	@ObfuscatedName("ec.K")
	public boolean field812;

	@ObfuscatedName("ec.L")
	public boolean field813;

	@ObfuscatedName("ec.M")
	public boolean field814;

	@ObfuscatedName("ec.H")
	public int[] field809;

	@ObfuscatedName("ec.I")
	public int[] field810;

	@ObfuscatedName("ec.G")
	public class34[] field808;

	@ObfuscatedName("ec.J")
	public String[] field811;

	@ObfuscatedName("ec.a(ILub;Lub;[Ljb;)V")
	public static void method291(class47 arg0, class47 arg1, class36[] arg2) {
		field834 = new class19(50000);
		field835 = new class19(50000);
		class37 var3 = new class37(arg1.method242(null, "data"));
		int var4 = -1;
		int var5 = var3.method203();
		field777 = new class57[var5];
		while (true) {
			class57 var7;
			do {
				if (var3.field537 >= var3.field536.length) {
					field834 = null;
					field835 = null;
					return;
				}

				int var6 = var3.method203();
				if (var6 == 0xFFFF) {
					var4 = var3.method203();
					var6 = var3.method203();
				}

				var7 = field777[var6] = new class57();
				var7.field782 = var6;
				var7.field783 = var4;
				var7.field784 = var3.method201();
				var7.field785 = var3.method201();
				var7.field786 = var3.method203();
				var7.field787 = var3.method203();
				var7.field788 = var3.method203();
				var7.field794 = var3.method201();
				if (var7.field794 == 0) {
					var7.field794 = -1;
				} else {
					var7.field794 = (var7.field794 - 1 << 8) + var3.method201();
				}

				int var8 = var3.method201();
				if (var8 > 0) {
					var7.field792 = new int[var8];
					var7.field793 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field792[var9] = var3.method201();
						var7.field793[var9] = var3.method203();
					}
				}

				int var10 = var3.method201();
				if (var10 > 0) {
					var7.field791 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.method203();
						var7.field791[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field791[var11][var13] = var3.method203();
						}
					}
				}

				if (var7.field784 == 0) {
					var7.field795 = var3.method203();
					var7.field797 = var3.method201() == 1;
					int var14 = var3.method201();
					var7.field798 = new int[var14];
					var7.field799 = new int[var14];
					var7.field800 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field798[var15] = var3.method203();
						var7.field799[var15] = var3.method204();
						var7.field800[var15] = var3.method204();
					}
				}

				if (var7.field784 == 1) {
					var7.field801 = var3.method203();
					var7.field802 = var3.method201() == 1;
				}

				if (var7.field784 == 2) {
					var7.field778 = new int[var7.field788 * var7.field787];
					var7.field779 = new int[var7.field788 * var7.field787];
					var7.field803 = var3.method201() == 1;
					var7.field804 = var3.method201() == 1;
					var7.field805 = var3.method201() == 1;
					var7.field806 = var3.method201();
					var7.field807 = var3.method201();
					var7.field809 = new int[20];
					var7.field810 = new int[20];
					var7.field808 = new class34[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.method201();
						if (var17 == 1) {
							var7.field809[var16] = var3.method204();
							var7.field810[var16] = var3.method204();
							String var18 = var3.method208();
							if (arg0 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field808[var16] = method293(Integer.parseInt(var18.substring(var19 + 1)), var18.substring(0, var19), arg0);
							}
						}
					}

					var7.field811 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field811[var20] = var3.method208();
						if (var7.field811[var20].length() == 0) {
							var7.field811[var20] = null;
						}
					}
				}

				if (var7.field784 == 3) {
					var7.field812 = var3.method201() == 1;
				}

				if (var7.field784 == 4 || var7.field784 == 1) {
					var7.field813 = var3.method201() == 1;
					int var21 = var3.method201();
					if (arg2 != null) {
						var7.field815 = arg2[var21];
					}

					var7.field814 = var3.method201() == 1;
				}

				if (var7.field784 == 4) {
					var7.field816 = var3.method208();
					var7.field817 = var3.method208();
				}

				if (var7.field784 == 1 || var7.field784 == 3 || var7.field784 == 4) {
					var7.field818 = var3.method206();
				}

				if (var7.field784 == 3 || var7.field784 == 4) {
					var7.field819 = var3.method206();
					var7.field820 = var3.method206();
				}

				if (var7.field784 == 5) {
					String var22 = var3.method208();
					if (arg0 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field821 = method293(Integer.parseInt(var22.substring(var23 + 1)), var22.substring(0, var23), arg0);
					}

					String var24 = var3.method208();
					if (arg0 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field822 = method293(Integer.parseInt(var24.substring(var25 + 1)), var24.substring(0, var25), arg0);
					}
				}

				if (var7.field784 == 6) {
					int var26 = var3.method201();
					if (var26 != 0) {
						var7.field823 = method294((var26 - 1 << 8) + var3.method201());
					}

					int var27 = var3.method201();
					if (var27 != 0) {
						var7.field824 = method294((var27 - 1 << 8) + var3.method201());
					}

					int var28 = var3.method201();
					if (var28 == 0) {
						var7.field825 = -1;
					} else {
						var7.field825 = (var28 - 1 << 8) + var3.method201();
					}

					int var29 = var3.method201();
					if (var29 == 0) {
						var7.field826 = -1;
					} else {
						var7.field826 = (var29 - 1 << 8) + var3.method201();
					}

					var7.field827 = var3.method203();
					var7.field828 = var3.method203();
					var7.field829 = var3.method203();
				}

				if (var7.field784 == 7) {
					var7.field778 = new int[var7.field788 * var7.field787];
					var7.field779 = new int[var7.field788 * var7.field787];
					var7.field813 = var3.method201() == 1;
					int var30 = var3.method201();
					if (arg2 != null) {
						var7.field815 = arg2[var30];
					}

					var7.field814 = var3.method201() == 1;
					var7.field818 = var3.method206();
					var7.field806 = var3.method204();
					var7.field807 = var3.method204();
					var7.field804 = var3.method201() == 1;
					var7.field811 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field811[var31] = var3.method208();
						if (var7.field811[var31].length() == 0) {
							var7.field811[var31] = null;
						}
					}
				}

				if (var7.field785 == 2 || var7.field784 == 2) {
					var7.field830 = var3.method208();
					var7.field831 = var3.method208();
					var7.field832 = var3.method203();
				}
			} while (var7.field785 != 1 && var7.field785 != 4 && var7.field785 != 5 && var7.field785 != 6);

			var7.field833 = var3.method208();
			if (var7.field833.length() == 0) {
				if (var7.field785 == 1) {
					var7.field833 = "Ok";
				}

				if (var7.field785 == 4) {
					var7.field833 = "Select";
				}

				if (var7.field785 == 5) {
					var7.field833 = "Select";
				}

				if (var7.field785 == 6) {
					var7.field833 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIZ)Leb;")
	public class31 method292(int arg0, int arg1, boolean arg2) {
		class31 var4 = field823;
		if (arg2) {
			var4 = field824;
		}

		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.field411 == null) {
			return var4;
		} else {
			class31 var5 = new class31(true, var4, true, false, true);
			if (arg0 != -1 || arg1 != -1) {
				var5.method122();
			}

			if (arg0 != -1) {
				var5.method123(arg0);
			}

			if (arg1 != -1) {
				var5.method123(arg1);
			}

			var5.method132(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("ec.a(IBLjava/lang/String;Lub;)Lhb;")
	public static class34 method293(int arg0, String arg1, class47 arg2) {
		long var3 = (class48.method245(arg1) << 4) + arg0;
		class34 var5 = (class34) field834.method99(var3);
		if (var5 != null) {
			return var5;
		}

		try {
			class34 var6 = new class34(arg2, arg1, arg0);
			field834.method100(var3, var6);
			return var6;
		} catch (Exception var7) {
			return null;
		}
	}

	@ObfuscatedName("ec.a(IB)Leb;")
	public static class31 method294(int arg0) {
		class31 var1 = (class31) field835.method99(arg0);
		if (var1 == null) {
			class31 var2 = new class31(arg0);
			field835.method100(arg0, var2);
			return var2;
		}

		return var1;
	}
}
