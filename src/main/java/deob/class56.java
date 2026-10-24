package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.e")
	public static class56[] field760;

	@ObfuscatedName("dc.f")
	public int[] field761;

	@ObfuscatedName("dc.g")
	public int[] field762;

	@ObfuscatedName("dc.h")
	public int field763;

	@ObfuscatedName("dc.i")
	public int field764;

	@ObfuscatedName("dc.j")
	public int field765;

	@ObfuscatedName("dc.k")
	public int field766;

	@ObfuscatedName("dc.l")
	public int field767;

	@ObfuscatedName("dc.m")
	public int field768;

	@ObfuscatedName("dc.n")
	public int field769;

	@ObfuscatedName("dc.o")
	public int field770;

	@ObfuscatedName("dc.p")
	public int field771;

	@ObfuscatedName("dc.q")
	public int[][] field772;

	@ObfuscatedName("dc.r")
	public int[] field773;

	@ObfuscatedName("dc.s")
	public int[] field774;

	@ObfuscatedName("dc.t")
	public int field775;

	@ObfuscatedName("dc.u")
	public int field776;

	@ObfuscatedName("dc.v")
	public int field777;

	@ObfuscatedName("dc.w")
	public boolean field778;

	@ObfuscatedName("dc.x")
	public int[] field779;

	@ObfuscatedName("dc.y")
	public int[] field780;

	@ObfuscatedName("dc.z")
	public int[] field781;

	@ObfuscatedName("dc.ab")
	public int field808;

	@ObfuscatedName("dc.bb")
	public int field809;

	@ObfuscatedName("dc.cb")
	public int field810;

	@ObfuscatedName("dc.db")
	public String field811;

	@ObfuscatedName("dc.eb")
	public String field812;

	@ObfuscatedName("dc.fb")
	public int field813;

	@ObfuscatedName("dc.gb")
	public String field814;

	@ObfuscatedName("dc.hb")
	public static class18 field815;

	@ObfuscatedName("dc.ib")
	public static class18 field816;

	@ObfuscatedName("dc.A")
	public int field782;

	@ObfuscatedName("dc.F")
	public int field787;

	@ObfuscatedName("dc.G")
	public int field788;

	@ObfuscatedName("dc.R")
	public int field799;

	@ObfuscatedName("dc.S")
	public int field800;

	@ObfuscatedName("dc.T")
	public int field801;

	@ObfuscatedName("dc.Y")
	public int field806;

	@ObfuscatedName("dc.Z")
	public int field807;

	@ObfuscatedName("dc.W")
	public class30 field804;

	@ObfuscatedName("dc.X")
	public class30 field805;

	@ObfuscatedName("dc.U")
	public class33 field802;

	@ObfuscatedName("dc.V")
	public class33 field803;

	@ObfuscatedName("dc.O")
	public class35 field796;

	@ObfuscatedName("dc.P")
	public String field797;

	@ObfuscatedName("dc.Q")
	public String field798;

	@ObfuscatedName("dc.B")
	public boolean field783;

	@ObfuscatedName("dc.C")
	public boolean field784;

	@ObfuscatedName("dc.D")
	public boolean field785;

	@ObfuscatedName("dc.E")
	public boolean field786;

	@ObfuscatedName("dc.L")
	public boolean field793;

	@ObfuscatedName("dc.M")
	public boolean field794;

	@ObfuscatedName("dc.N")
	public boolean field795;

	@ObfuscatedName("dc.I")
	public int[] field790;

	@ObfuscatedName("dc.J")
	public int[] field791;

	@ObfuscatedName("dc.H")
	public class33[] field789;

	@ObfuscatedName("dc.K")
	public String[] field792;

	@ObfuscatedName("dc.a([Lib;Ltb;BLtb;)V")
	public static void method275(class35[] arg0, class46 arg1, class46 arg2) {
		field815 = new class18(50000);
		field816 = new class18(50000);
		class36 var3 = new class36(arg2.method225(null, "data"));
		int var4 = -1;
		int var5 = var3.method187();
		field760 = new class56[var5];
		while (true) {
			class56 var7;
			do {
				if (var3.field525 >= var3.field524.length) {
					field815 = null;
					field816 = null;
					return;
				}

				int var6 = var3.method187();
				if (var6 == 0xFFFF) {
					var4 = var3.method187();
					var6 = var3.method187();
				}

				var7 = field760[var6] = new class56();
				var7.field765 = var6;
				var7.field766 = var4;
				var7.field767 = var3.method185();
				var7.field768 = var3.method185();
				var7.field769 = var3.method187();
				var7.field770 = var3.method187();
				var7.field771 = var3.method187();
				var7.field775 = var3.method185();
				if (var7.field775 == 0) {
					var7.field775 = -1;
				} else {
					var7.field775 = (var7.field775 - 1 << 8) + var3.method185();
				}

				int var8 = var3.method185();
				if (var8 > 0) {
					var7.field773 = new int[var8];
					var7.field774 = new int[var8];
					for (int var9 = 0; var9 < var8; var9++) {
						var7.field773[var9] = var3.method185();
						var7.field774[var9] = var3.method187();
					}
				}

				int var10 = var3.method185();
				if (var10 > 0) {
					var7.field772 = new int[var10][];
					for (int var11 = 0; var11 < var10; var11++) {
						int var12 = var3.method187();
						var7.field772[var11] = new int[var12];
						for (int var13 = 0; var13 < var12; var13++) {
							var7.field772[var11][var13] = var3.method187();
						}
					}
				}

				if (var7.field767 == 0) {
					var7.field776 = var3.method187();
					var7.field778 = var3.method185() == 1;
					int var14 = var3.method185();
					var7.field779 = new int[var14];
					var7.field780 = new int[var14];
					var7.field781 = new int[var14];
					for (int var15 = 0; var15 < var14; var15++) {
						var7.field779[var15] = var3.method187();
						var7.field780[var15] = var3.method188();
						var7.field781[var15] = var3.method188();
					}
				}

				if (var7.field767 == 1) {
					var7.field782 = var3.method187();
					var7.field783 = var3.method185() == 1;
				}

				if (var7.field767 == 2) {
					var7.field761 = new int[var7.field771 * var7.field770];
					var7.field762 = new int[var7.field771 * var7.field770];
					var7.field784 = var3.method185() == 1;
					var7.field785 = var3.method185() == 1;
					var7.field786 = var3.method185() == 1;
					var7.field787 = var3.method185();
					var7.field788 = var3.method185();
					var7.field790 = new int[20];
					var7.field791 = new int[20];
					var7.field789 = new class33[20];
					for (int var16 = 0; var16 < 20; var16++) {
						int var17 = var3.method185();
						if (var17 == 1) {
							var7.field790[var16] = var3.method188();
							var7.field791[var16] = var3.method188();
							String var18 = var3.method192();
							if (arg1 != null && var18.length() > 0) {
								int var19 = var18.lastIndexOf(",");
								var7.field789[var16] = method277(var18.substring(0, var19), arg1, Integer.parseInt(var18.substring(var19 + 1)));
							}
						}
					}

					var7.field792 = new String[5];
					for (int var20 = 0; var20 < 5; var20++) {
						var7.field792[var20] = var3.method192();
						if (var7.field792[var20].length() == 0) {
							var7.field792[var20] = null;
						}
					}
				}

				if (var7.field767 == 3) {
					var7.field793 = var3.method185() == 1;
				}

				if (var7.field767 == 4 || var7.field767 == 1) {
					var7.field794 = var3.method185() == 1;
					int var21 = var3.method185();
					if (arg0 != null) {
						var7.field796 = arg0[var21];
					}

					var7.field795 = var3.method185() == 1;
				}

				if (var7.field767 == 4) {
					var7.field797 = var3.method192();
					var7.field798 = var3.method192();
				}

				if (var7.field767 == 1 || var7.field767 == 3 || var7.field767 == 4) {
					var7.field799 = var3.method190();
				}

				if (var7.field767 == 3 || var7.field767 == 4) {
					var7.field800 = var3.method190();
					var7.field801 = var3.method190();
				}

				if (var7.field767 == 5) {
					String var22 = var3.method192();
					if (arg1 != null && var22.length() > 0) {
						int var23 = var22.lastIndexOf(",");
						var7.field802 = method277(var22.substring(0, var23), arg1, Integer.parseInt(var22.substring(var23 + 1)));
					}

					String var24 = var3.method192();
					if (arg1 != null && var24.length() > 0) {
						int var25 = var24.lastIndexOf(",");
						var7.field803 = method277(var24.substring(0, var25), arg1, Integer.parseInt(var24.substring(var25 + 1)));
					}
				}

				if (var7.field767 == 6) {
					int var26 = var3.method185();
					if (var26 != 0) {
						var7.field804 = method278((var26 - 1 << 8) + var3.method185());
					}

					int var27 = var3.method185();
					if (var27 != 0) {
						var7.field805 = method278((var27 - 1 << 8) + var3.method185());
					}

					int var28 = var3.method185();
					if (var28 == 0) {
						var7.field806 = -1;
					} else {
						var7.field806 = (var28 - 1 << 8) + var3.method185();
					}

					int var29 = var3.method185();
					if (var29 == 0) {
						var7.field807 = -1;
					} else {
						var7.field807 = (var29 - 1 << 8) + var3.method185();
					}

					var7.field808 = var3.method187();
					var7.field809 = var3.method187();
					var7.field810 = var3.method187();
				}

				if (var7.field767 == 7) {
					var7.field761 = new int[var7.field771 * var7.field770];
					var7.field762 = new int[var7.field771 * var7.field770];
					var7.field794 = var3.method185() == 1;
					int var30 = var3.method185();
					if (arg0 != null) {
						var7.field796 = arg0[var30];
					}

					var7.field795 = var3.method185() == 1;
					var7.field799 = var3.method190();
					var7.field787 = var3.method188();
					var7.field788 = var3.method188();
					var7.field785 = var3.method185() == 1;
					var7.field792 = new String[5];
					for (int var31 = 0; var31 < 5; var31++) {
						var7.field792[var31] = var3.method192();
						if (var7.field792[var31].length() == 0) {
							var7.field792[var31] = null;
						}
					}
				}

				if (var7.field768 == 2 || var7.field767 == 2) {
					var7.field811 = var3.method192();
					var7.field812 = var3.method192();
					var7.field813 = var3.method187();
				}
			} while (var7.field768 != 1 && var7.field768 != 4 && var7.field768 != 5 && var7.field768 != 6);

			var7.field814 = var3.method192();
			if (var7.field814.length() == 0) {
				if (var7.field768 == 1) {
					var7.field814 = "Ok";
				}

				if (var7.field768 == 4) {
					var7.field814 = "Select";
				}

				if (var7.field768 == 5) {
					var7.field814 = "Select";
				}

				if (var7.field768 == 6) {
					var7.field814 = "Continue";
				}
			}
		}
	}

	@ObfuscatedName("dc.a(IIZ)Ldb;")
	public class30 method276(int arg0, int arg1, boolean arg2) {
		class30 var4 = field804;
		if (arg2) {
			var4 = field805;
		}

		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.field400 == null) {
			return var4;
		} else {
			class30 var5 = new class30(true, true, var4, true, false);
			if (arg0 != -1 || arg1 != -1) {
				var5.method108();
			}

			if (arg0 != -1) {
				var5.method109(arg0);
			}

			if (arg1 != -1) {
				var5.method109(arg1);
			}

			var5.method118(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	@ObfuscatedName("dc.a(BLjava/lang/String;Ltb;I)Lgb;")
	public static class33 method277(String arg0, class46 arg1, int arg2) {
		long var3 = (class47.method228(arg0) << 4) + arg2;
		class33 var5 = (class33) field815.method84(var3);
		if (var5 == null) {
			class33 var6 = new class33(arg0, arg2, arg1);
			field815.method85(var6, var3);
			return var6;
		}

		return var5;
	}

	@ObfuscatedName("dc.a(IZ)Ldb;")
	public static class30 method278(int arg0) {
		class30 var1 = (class30) field816.method84(arg0);
		if (var1 == null) {
			class30 var2 = new class30(arg0);
			field816.method85(var2, arg0);
			return var2;
		}

		return var1;
	}
}
