package deob;

@ObfuscatedName("cc")
public final class class55 {

	@ObfuscatedName("cc.f")
	public static int field765;

	@ObfuscatedName("cc.g")
	public static int[] field766;

	@ObfuscatedName("cc.h")
	public static class37 field767;

	@ObfuscatedName("cc.i")
	public static class55[] field768;

	@ObfuscatedName("cc.j")
	public static int field769;

	@ObfuscatedName("cc.k")
	public static boolean field770 = true;

	@ObfuscatedName("cc.l")
	public int field771 = -1;

	@ObfuscatedName("cc.m")
	public int field772;

	@ObfuscatedName("cc.n")
	public String field773;

	@ObfuscatedName("cc.o")
	public byte[] field774;

	@ObfuscatedName("cc.p")
	public int[] field775;

	@ObfuscatedName("cc.q")
	public int[] field776;

	@ObfuscatedName("cc.r")
	public int field777;

	@ObfuscatedName("cc.s")
	public int field778;

	@ObfuscatedName("cc.t")
	public int field779;

	@ObfuscatedName("cc.u")
	public int field780;

	@ObfuscatedName("cc.v")
	public int field781;

	@ObfuscatedName("cc.w")
	public int field782;

	@ObfuscatedName("cc.y")
	public int field783;

	@ObfuscatedName("cc.z")
	public boolean field784;

	@ObfuscatedName("cc.U")
	public static class19 field805 = new class19(50);

	@ObfuscatedName("cc.V")
	public static class19 field806 = new class19(200);

	@ObfuscatedName("cc.G")
	public byte field791;

	@ObfuscatedName("cc.J")
	public byte field794;

	@ObfuscatedName("cc.A")
	public int field785;

	@ObfuscatedName("cc.E")
	public int field789;

	@ObfuscatedName("cc.F")
	public int field790;

	@ObfuscatedName("cc.H")
	public int field792;

	@ObfuscatedName("cc.I")
	public int field793;

	@ObfuscatedName("cc.K")
	public int field795;

	@ObfuscatedName("cc.L")
	public int field796;

	@ObfuscatedName("cc.M")
	public int field797;

	@ObfuscatedName("cc.N")
	public int field798;

	@ObfuscatedName("cc.O")
	public int field799;

	@ObfuscatedName("cc.P")
	public int field800;

	@ObfuscatedName("cc.S")
	public int field803;

	@ObfuscatedName("cc.T")
	public int field804;

	@ObfuscatedName("cc.B")
	public boolean field786;

	@ObfuscatedName("cc.Q")
	public int[] field801;

	@ObfuscatedName("cc.R")
	public int[] field802;

	@ObfuscatedName("cc.C")
	public String[] field787;

	@ObfuscatedName("cc.D")
	public String[] field788;

	@ObfuscatedName("cc.a(Lub;)V")
	public static final void method292(class47 arg0) {
		field767 = new class37(arg0.method257(null, "obj.dat"));
		class37 var1 = new class37(arg0.method257(null, "obj.idx"));
		field765 = var1.method218();
		field766 = new int[field765];
		int var2 = 2;
		for (int var3 = 0; var3 < field765; var3++) {
			field766[var3] = var2;
			var2 += var1.method218();
		}

		field768 = new class55[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field768[var4] = new class55();
		}
	}

	@ObfuscatedName("cc.a(I)V")
	public static final void method293() {
		field805 = null;
		field806 = null;
		field766 = null;
		field768 = null;
		field767 = null;
	}

	@ObfuscatedName("cc.b(I)Lcc;")
	public static final class55 method294(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field768[var1].field771 == arg0) {
				return field768[var1];
			}
		}

		field769 = (field769 + 1) % 10;
		class55 var2 = field768[field769];
		field767.field543 = field766[arg0];
		var2.field771 = arg0;
		var2.method295();
		var2.method296(field767);

		if (var2.field804 != -1) {
			var2.method297();
		}

		if (!field770 && var2.field786) {
			var2.field773 = "Members Object";
			var2.field774 = "Login to a members' server to use this object.".getBytes();
			var2.field787 = null;
			var2.field788 = null;
		}

		return var2;
	}

	@ObfuscatedName("cc.a()V")
	public final void method295() {
		field772 = 0;
		field773 = null;
		field774 = null;
		field775 = null;
		field776 = null;
		field777 = 2000;
		field778 = 0;
		field779 = 0;
		field780 = 0;
		field781 = 0;
		field782 = 0;
		field783 = -1;
		field784 = false;
		field785 = 1;
		field786 = false;
		field787 = null;
		field788 = null;
		field789 = -1;
		field790 = -1;
		field791 = 0;
		field792 = -1;
		field793 = -1;
		field794 = 0;
		field795 = -1;
		field796 = -1;
		field797 = -1;
		field798 = -1;
		field799 = -1;
		field800 = -1;
		field801 = null;
		field802 = null;
		field803 = -1;
		field804 = -1;
	}

	@ObfuscatedName("cc.a(Lkb;Z)V")
	public final void method296(class37 arg0) {
		while (true) {
			int var2 = arg0.method216();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field772 = arg0.method218();
			} else if (var2 == 2) {
				field773 = arg0.method223();
			} else if (var2 == 3) {
				field774 = arg0.method224();
			} else if (var2 == 4) {
				field777 = arg0.method218();
			} else if (var2 == 5) {
				field778 = arg0.method218();
			} else if (var2 == 6) {
				field779 = arg0.method218();
			} else if (var2 == 7) {
				field781 = arg0.method218();
				if (field781 > 32767) {
					field781 -= 0x10000;
				}
			} else if (var2 == 8) {
				field782 = arg0.method218();
				if (field782 > 32767) {
					field782 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field783 = arg0.method218();
				} else if (var2 == 11) {
					field784 = true;
				} else if (var2 == 12) {
					field785 = arg0.method221();
				} else if (var2 == 16) {
					field786 = true;
				} else if (var2 == 23) {
					field789 = arg0.method218();
					field791 = arg0.method217();
				} else if (var2 == 24) {
					field790 = arg0.method218();
				} else if (var2 == 25) {
					field792 = arg0.method218();
					field794 = arg0.method217();
				} else if (var2 == 26) {
					field793 = arg0.method218();
				} else if (var2 >= 30 && var2 < 35) {
					if (field787 == null) {
						field787 = new String[5];
					}

					field787[var2 - 30] = arg0.method223();
					if (field787[var2 - 30].equalsIgnoreCase("hidden")) {
						field787[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (field788 == null) {
						field788 = new String[5];
					}

					field788[var2 - 35] = arg0.method223();
				} else if (var2 == 40) {
					int var3 = arg0.method216();
					field775 = new int[var3];
					field776 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field775[var4] = arg0.method218();
						field776[var4] = arg0.method218();
					}
				} else if (var2 == 78) {
					field795 = arg0.method218();
				} else if (var2 == 79) {
					field796 = arg0.method218();
				} else if (var2 == 90) {
					field797 = arg0.method218();
				} else if (var2 == 91) {
					field799 = arg0.method218();
				} else if (var2 == 92) {
					field798 = arg0.method218();
				} else if (var2 == 93) {
					field800 = arg0.method218();
				} else if (var2 == 95) {
					field780 = arg0.method218();
				} else if (var2 == 97) {
					field803 = arg0.method218();
				} else if (var2 == 98) {
					field804 = arg0.method218();
				} else if (var2 >= 100 && var2 < 110) {
					if (field801 == null) {
						field801 = new int[10];
						field802 = new int[10];
					}

					field801[var2 - 100] = arg0.method218();
					field802[var2 - 100] = arg0.method218();
				}
			}
		}
	}

	@ObfuscatedName("cc.a(Z)V")
	public void method297() {
		class55 var1 = method294(field804);
		field772 = var1.field772;
		field777 = var1.field777;
		field778 = var1.field778;
		field779 = var1.field779;
		field780 = var1.field780;
		field781 = var1.field781;
		field782 = var1.field782;
		field775 = var1.field775;
		field776 = var1.field776;
		class55 var2 = method294(field803);
		field773 = var2.field773;
		field786 = var2.field786;
		field785 = var2.field785;
		String var3 = "a";
		char var4 = var2.field773.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field774 = ("Swap this note at any bank for " + var3 + " " + var2.field773 + ".").getBytes();
		field784 = true;
	}

	@ObfuscatedName("cc.c(I)Leb;")
	public final class31 method298(int arg0) {
		if (field801 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field802[var3] && field802[var3] != 0) {
					var2 = field801[var3];
				}
			}

			if (var2 != -1) {
				return method294(var2).method298(1);
			}
		}

		class31 var4 = (class31) field805.method103(field771);
		if (var4 != null) {
			return var4;
		}

		class31 var5 = new class31(field772);
		if (field775 != null) {
			for (int var6 = 0; var6 < field775.length; var6++) {
				var5.method134(field775[var6], field776[var6]);
			}
		}

		var5.method137(64, 768, -50, -10, -50, true);
		var5.field436 = true;
		field805.method104(var5, field771);
		return var5;
	}

	@ObfuscatedName("cc.a(IIZ)Lhb;")
	public static final class34 method299(int arg0, int arg1) {
		class34 var2 = (class34) field806.method103(arg1);
		if (var2 != null && var2.field523 != arg0 && var2.field523 != -1) {
			var2.method108();
			var2 = null;
		}

		if (var2 != null) {
			return var2;
		}

		class55 var3 = method294(arg1);
		if (var3.field801 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg0 >= var3.field802[var5] && var3.field802[var5] != 0) {
					var4 = var3.field801[var5];
				}
			}

			if (var4 != -1) {
				var3 = method294(var4);
			}
		}

		class34 var6 = new class34(32, 32);
		int var7 = class33.field499;
		int var8 = class33.field500;
		int[] var9 = class33.field505;
		int[] var10 = class32.field484;
		int var11 = class32.field485;
		int var12 = class32.field486;
		int var13 = class32.field489;
		int var14 = class32.field490;
		int var15 = class32.field487;
		int var16 = class32.field488;
		class33.field497 = false;
		class32.method146(32, 32, var6.field517);
		class32.method150(0, 32, 0, 0, 32);
		class33.method155();
		class31 var17 = var3.method298(1);
		int var18 = class33.field503[var3.field778] * var3.field777 >> 16;
		int var19 = class33.field504[var3.field778] * var3.field777 >> 16;
		var17.method140(0, var3.field779, var3.field780, var3.field778, var3.field781, var17.field427 / 2 + var18 + var3.field782, var3.field782 + var19);

		for (int var20 = 31; var20 >= 0; var20--) {
			for (int var21 = 31; var21 >= 0; var21--) {
				if (var6.field517[var21 * 32 + var20] == 0) {
					if (var20 > 0 && var6.field517[var21 * 32 + var20 - 1] > 1) {
						var6.field517[var21 * 32 + var20] = 1;
					} else if (var21 > 0 && var6.field517[(var21 - 1) * 32 + var20] > 1) {
						var6.field517[var21 * 32 + var20] = 1;
					} else if (var20 < 31 && var6.field517[var21 * 32 + var20 + 1] > 1) {
						var6.field517[var21 * 32 + var20] = 1;
					} else if (var21 < 31 && var6.field517[(var21 + 1) * 32 + var20] > 1) {
						var6.field517[var21 * 32 + var20] = 1;
					}
				}
			}
		}

		for (int var22 = 31; var22 >= 0; var22--) {
			for (int var23 = 31; var23 >= 0; var23--) {
				if (var6.field517[var23 * 32 + var22] == 0 && var22 > 0 && var23 > 0 && var6.field517[(var23 - 1) * 32 + var22 - 1] > 0) {
					var6.field517[var23 * 32 + var22] = 0x302020;
				}
			}
		}

		if (var3.field804 != -1) {
			class34 var24 = method299(10, var3.field803);
			int var25 = var24.field522;
			int var26 = var24.field523;
			var24.field522 = 32;
			var24.field523 = 32;
			var24.method177(5, 22, 22, 5);
			var24.field522 = var25;
			var24.field523 = var26;
		}

		field806.method104(var6, arg1);
		class32.method146(var11, var12, var10);
		class32.method148(var16, var14, var13, var15);
		class33.field499 = var7;
		class33.field500 = var8;
		class33.field505 = var9;
		class33.field497 = true;

		if (var3.field784) {
			var6.field522 = 33;
		} else {
			var6.field522 = 32;
		}

		var6.field523 = arg0;
		return var6;
	}

	@ObfuscatedName("cc.a(II)Leb;")
	public final class31 method300(int arg0) {
		int var2 = field789;
		if (arg0 == 1) {
			var2 = field792;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field790;
		int var4 = field795;
		if (arg0 == 1) {
			var3 = field793;
			var4 = field796;
		}

		class31 var5 = new class31(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				class31 var9 = new class31(var3);
				class31[] var10 = new class31[] { var5, var9 };
				var5 = new class31(var10, 2);
			} else {
				class31 var6 = new class31(var3);
				class31 var7 = new class31(var4);
				class31[] var8 = new class31[] { var5, var6, var7 };
				var5 = new class31(var8, 3);
			}
		}

		if (arg0 == 0 && field791 != 0) {
			var5.method133(0, 0, field791);
		}

		if (arg0 == 1 && field794 != 0) {
			var5.method133(0, 0, field794);
		}

		if (field775 != null) {
			for (int var11 = 0; var11 < field775.length; var11++) {
				var5.method134(field775[var11], field776[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("cc.b(II)Leb;")
	public final class31 method301(int arg0) {
		int var2 = field797;
		if (arg0 == 1) {
			var2 = field799;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field798;
		if (arg0 == 1) {
			var3 = field800;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(var6, 2);
		}

		if (field775 != null) {
			for (int var7 = 0; var7 < field775.length; var7++) {
				var4.method134(field775[var7], field776[var7]);
			}
		}

		return var4;
	}
}
