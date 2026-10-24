package deob;

@ObfuscatedName("cc")
public final class class55 {

	@ObfuscatedName("cc.d")
	public static int field766;

	@ObfuscatedName("cc.e")
	public static int[] field767;

	@ObfuscatedName("cc.f")
	public static class37 field768;

	@ObfuscatedName("cc.g")
	public static class55[] field769;

	@ObfuscatedName("cc.h")
	public static int field770;

	@ObfuscatedName("cc.i")
	public static boolean field771 = true;

	@ObfuscatedName("cc.j")
	public int field772 = -1;

	@ObfuscatedName("cc.k")
	public int field773;

	@ObfuscatedName("cc.l")
	public String field774;

	@ObfuscatedName("cc.m")
	public byte[] field775;

	@ObfuscatedName("cc.n")
	public int[] field776;

	@ObfuscatedName("cc.o")
	public int[] field777;

	@ObfuscatedName("cc.p")
	public int field778;

	@ObfuscatedName("cc.q")
	public int field779;

	@ObfuscatedName("cc.r")
	public int field780;

	@ObfuscatedName("cc.s")
	public int field781;

	@ObfuscatedName("cc.t")
	public int field782;

	@ObfuscatedName("cc.u")
	public int field783;

	@ObfuscatedName("cc.w")
	public int field784;

	@ObfuscatedName("cc.x")
	public boolean field785;

	@ObfuscatedName("cc.y")
	public int field786;

	@ObfuscatedName("cc.z")
	public boolean field787;

	@ObfuscatedName("cc.S")
	public static class19 field806 = new class19(50);

	@ObfuscatedName("cc.T")
	public static class19 field807 = new class19(200);

	@ObfuscatedName("cc.E")
	public byte field792;

	@ObfuscatedName("cc.H")
	public byte field795;

	@ObfuscatedName("cc.C")
	public int field790;

	@ObfuscatedName("cc.D")
	public int field791;

	@ObfuscatedName("cc.F")
	public int field793;

	@ObfuscatedName("cc.G")
	public int field794;

	@ObfuscatedName("cc.I")
	public int field796;

	@ObfuscatedName("cc.J")
	public int field797;

	@ObfuscatedName("cc.K")
	public int field798;

	@ObfuscatedName("cc.L")
	public int field799;

	@ObfuscatedName("cc.M")
	public int field800;

	@ObfuscatedName("cc.N")
	public int field801;

	@ObfuscatedName("cc.Q")
	public int field804;

	@ObfuscatedName("cc.R")
	public int field805;

	@ObfuscatedName("cc.O")
	public int[] field802;

	@ObfuscatedName("cc.P")
	public int[] field803;

	@ObfuscatedName("cc.A")
	public String[] field788;

	@ObfuscatedName("cc.B")
	public String[] field789;

	@ObfuscatedName("cc.a(Lub;)V")
	public static final void method285(class47 arg0) {
		field768 = new class37(arg0.method250("obj.dat", null));
		class37 var1 = new class37(arg0.method250("obj.idx", null));
		field766 = var1.method211();
		field767 = new int[field766];
		int var2 = 2;
		for (int var3 = 0; var3 < field766; var3++) {
			field767[var3] = var2;
			var2 += var1.method211();
		}

		field769 = new class55[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field769[var4] = new class55();
		}
	}

	@ObfuscatedName("cc.a(B)V")
	public static final void method286() {
		field806 = null;
		field807 = null;
		field767 = null;
		field769 = null;
		field768 = null;
	}

	@ObfuscatedName("cc.a(I)Lcc;")
	public static final class55 method287(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field769[var1].field772 == arg0) {
				return field769[var1];
			}
		}

		field770 = (field770 + 1) % 10;
		class55 var2 = field769[field770];
		field768.field542 = field767[arg0];
		var2.field772 = arg0;
		var2.method288();
		var2.method289(field768);

		if (var2.field805 != -1) {
			var2.method290();
		}

		if (!field771 && var2.field787) {
			var2.field774 = "Members Object";
			var2.field775 = "Login to a members' server to use this object.".getBytes();
			var2.field788 = null;
			var2.field789 = null;
		}

		return var2;
	}

	@ObfuscatedName("cc.a()V")
	public final void method288() {
		field773 = 0;
		field774 = null;
		field775 = null;
		field776 = null;
		field777 = null;
		field778 = 2000;
		field779 = 0;
		field780 = 0;
		field781 = 0;
		field782 = 0;
		field783 = 0;
		field784 = -1;
		field785 = false;
		field786 = 1;
		field787 = false;
		field788 = null;
		field789 = null;
		field790 = -1;
		field791 = -1;
		field792 = 0;
		field793 = -1;
		field794 = -1;
		field795 = 0;
		field796 = -1;
		field797 = -1;
		field798 = -1;
		field799 = -1;
		field800 = -1;
		field801 = -1;
		field802 = null;
		field803 = null;
		field804 = -1;
		field805 = -1;
	}

	@ObfuscatedName("cc.a(Lkb;I)V")
	public final void method289(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field773 = arg0.method211();
			} else if (var2 == 2) {
				field774 = arg0.method216();
			} else if (var2 == 3) {
				field775 = arg0.method217();
			} else if (var2 == 4) {
				field778 = arg0.method211();
			} else if (var2 == 5) {
				field779 = arg0.method211();
			} else if (var2 == 6) {
				field780 = arg0.method211();
			} else if (var2 == 7) {
				field782 = arg0.method211();
				if (field782 > 32767) {
					field782 -= 0x10000;
				}
			} else if (var2 == 8) {
				field783 = arg0.method211();
				if (field783 > 32767) {
					field783 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field784 = arg0.method211();
				} else if (var2 == 11) {
					field785 = true;
				} else if (var2 == 12) {
					field786 = arg0.method214();
				} else if (var2 == 16) {
					field787 = true;
				} else if (var2 == 23) {
					field790 = arg0.method211();
					field792 = arg0.method210();
				} else if (var2 == 24) {
					field791 = arg0.method211();
				} else if (var2 == 25) {
					field793 = arg0.method211();
					field795 = arg0.method210();
				} else if (var2 == 26) {
					field794 = arg0.method211();
				} else if (var2 >= 30 && var2 < 35) {
					if (field788 == null) {
						field788 = new String[5];
					}

					field788[var2 - 30] = arg0.method216();
					if (field788[var2 - 30].equalsIgnoreCase("hidden")) {
						field788[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (field789 == null) {
						field789 = new String[5];
					}

					field789[var2 - 35] = arg0.method216();
				} else if (var2 == 40) {
					int var3 = arg0.method209();
					field776 = new int[var3];
					field777 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field776[var4] = arg0.method211();
						field777[var4] = arg0.method211();
					}
				} else if (var2 == 78) {
					field796 = arg0.method211();
				} else if (var2 == 79) {
					field797 = arg0.method211();
				} else if (var2 == 90) {
					field798 = arg0.method211();
				} else if (var2 == 91) {
					field800 = arg0.method211();
				} else if (var2 == 92) {
					field799 = arg0.method211();
				} else if (var2 == 93) {
					field801 = arg0.method211();
				} else if (var2 == 95) {
					field781 = arg0.method211();
				} else if (var2 == 97) {
					field804 = arg0.method211();
				} else if (var2 == 98) {
					field805 = arg0.method211();
				} else if (var2 >= 100 && var2 < 110) {
					if (field802 == null) {
						field802 = new int[10];
						field803 = new int[10];
					}

					field802[var2 - 100] = arg0.method211();
					field803[var2 - 100] = arg0.method211();
				}
			}
		}
	}

	@ObfuscatedName("cc.b(B)V")
	public void method290() {
		class55 var1 = method287(field805);
		field773 = var1.field773;
		field778 = var1.field778;
		field779 = var1.field779;
		field780 = var1.field780;
		field781 = var1.field781;
		field782 = var1.field782;
		field783 = var1.field783;
		field776 = var1.field776;
		field777 = var1.field777;
		class55 var2 = method287(field804);
		field774 = var2.field774;
		field787 = var2.field787;
		field786 = var2.field786;
		String var3 = "a";
		char var4 = var2.field774.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field775 = ("Swap this note at any bank for " + var3 + " " + var2.field774 + ".").getBytes();
		field785 = true;
	}

	@ObfuscatedName("cc.b(I)Leb;")
	public final class31 method291(int arg0) {
		if (field802 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field803[var3] && field803[var3] != 0) {
					var2 = field802[var3];
				}
			}

			if (var2 != -1) {
				return method287(var2).method291(1);
			}
		}

		class31 var4 = (class31) field806.method102(field772);
		if (var4 != null) {
			return var4;
		}

		class31 var5 = new class31(field773);
		if (field776 != null) {
			for (int var6 = 0; var6 < field776.length; var6++) {
				var5.method133(field776[var6], field777[var6]);
			}
		}

		var5.method136(64, 768, -50, -10, -50, true);
		var5.field436 = true;
		field806.method103(field772, var5);
		return var5;
	}

	@ObfuscatedName("cc.a(III)Lhb;")
	public static final class34 method292(int arg0, int arg1) {
		class34 var2 = (class34) field807.method102(arg0);
		if (var2 != null && var2.field523 != arg1 && var2.field523 != -1) {
			var2.method107();
			var2 = null;
		}

		if (var2 != null) {
			return var2;
		}

		class55 var3 = method287(arg0);
		if (var3.field802 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg1 >= var3.field803[var5] && var3.field803[var5] != 0) {
					var4 = var3.field802[var5];
				}
			}

			if (var4 != -1) {
				var3 = method287(var4);
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
		class32.method145(32, var6.field517, 32);
		class32.method149(0, 0, 0, 32, 32);
		class33.method154();
		class31 var17 = var3.method291(1);
		int var18 = class33.field503[var3.field779] * var3.field778 >> 16;
		int var19 = class33.field504[var3.field779] * var3.field778 >> 16;
		var17.method139(0, var3.field780, var3.field781, var3.field779, var3.field782, var17.field427 / 2 + var18 + var3.field783, var3.field783 + var19);

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

		if (var3.field805 != -1) {
			class34 var24 = method292(var3.field804, 10);
			int var25 = var24.field522;
			int var26 = var24.field523;
			var24.field522 = 32;
			var24.field523 = 32;
			var24.method175(5, 5, 22, 22);
			var24.field522 = var25;
			var24.field523 = var26;
		}

		field807.method103(arg0, var6);
		class32.method145(var12, var10, var11);
		class32.method147(var16, var13, var15, var14);
		class33.field499 = var7;
		class33.field500 = var8;
		class33.field505 = var9;
		class33.field497 = true;

		if (var3.field785) {
			var6.field522 = 33;
		} else {
			var6.field522 = 32;
		}

		var6.field523 = arg1;
		return var6;
	}

	@ObfuscatedName("cc.a(IB)Leb;")
	public final class31 method293(int arg0) {
		int var2 = field790;
		if (arg0 == 1) {
			var2 = field793;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field791;
		int var4 = field796;
		if (arg0 == 1) {
			var3 = field794;
			var4 = field797;
		}

		class31 var5 = new class31(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				class31 var9 = new class31(var3);
				class31[] var10 = new class31[] { var5, var9 };
				var5 = new class31(6, 2, var10);
			} else {
				class31 var6 = new class31(var3);
				class31 var7 = new class31(var4);
				class31[] var8 = new class31[] { var5, var6, var7 };
				var5 = new class31(6, 3, var8);
			}
		}

		if (arg0 == 0 && field792 != 0) {
			var5.method132(0, field792, 0);
		}

		if (arg0 == 1 && field795 != 0) {
			var5.method132(0, field795, 0);
		}

		if (field776 != null) {
			for (int var11 = 0; var11 < field776.length; var11++) {
				var5.method133(field776[var11], field777[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("cc.a(II)Leb;")
	public final class31 method294(int arg0) {
		int var2 = field798;
		if (arg0 == 1) {
			var2 = field800;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field799;
		if (arg0 == 1) {
			var3 = field801;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(6, 2, var6);
		}

		if (field776 != null) {
			for (int var7 = 0; var7 < field776.length; var7++) {
				var4.method133(field776[var7], field777[var7]);
			}
		}

		return var4;
	}
}
