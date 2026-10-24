package deob;

@ObfuscatedName("cc")
public final class class55 {

	@ObfuscatedName("cc.e")
	public static int field761;

	@ObfuscatedName("cc.f")
	public static int[] field762;

	@ObfuscatedName("cc.g")
	public static class37 field763;

	@ObfuscatedName("cc.h")
	public static class55[] field764;

	@ObfuscatedName("cc.i")
	public static int field765;

	@ObfuscatedName("cc.j")
	public static boolean field766 = true;

	@ObfuscatedName("cc.k")
	public int field767 = -1;

	@ObfuscatedName("cc.l")
	public int field768;

	@ObfuscatedName("cc.m")
	public String field769;

	@ObfuscatedName("cc.n")
	public byte[] field770;

	@ObfuscatedName("cc.o")
	public int[] field771;

	@ObfuscatedName("cc.p")
	public int[] field772;

	@ObfuscatedName("cc.q")
	public int field773;

	@ObfuscatedName("cc.r")
	public int field774;

	@ObfuscatedName("cc.s")
	public int field775;

	@ObfuscatedName("cc.t")
	public int field776;

	@ObfuscatedName("cc.u")
	public int field777;

	@ObfuscatedName("cc.v")
	public int field778;

	@ObfuscatedName("cc.x")
	public int field779;

	@ObfuscatedName("cc.y")
	public boolean field780;

	@ObfuscatedName("cc.z")
	public int field781;

	@ObfuscatedName("cc.R")
	public static class19 field799 = new class19(50);

	@ObfuscatedName("cc.S")
	public static class19 field800 = new class19(200);

	@ObfuscatedName("cc.F")
	public byte field787;

	@ObfuscatedName("cc.I")
	public byte field790;

	@ObfuscatedName("cc.D")
	public int field785;

	@ObfuscatedName("cc.E")
	public int field786;

	@ObfuscatedName("cc.G")
	public int field788;

	@ObfuscatedName("cc.H")
	public int field789;

	@ObfuscatedName("cc.J")
	public int field791;

	@ObfuscatedName("cc.K")
	public int field792;

	@ObfuscatedName("cc.L")
	public int field793;

	@ObfuscatedName("cc.M")
	public int field794;

	@ObfuscatedName("cc.P")
	public int field797;

	@ObfuscatedName("cc.Q")
	public int field798;

	@ObfuscatedName("cc.A")
	public boolean field782;

	@ObfuscatedName("cc.N")
	public int[] field795;

	@ObfuscatedName("cc.O")
	public int[] field796;

	@ObfuscatedName("cc.B")
	public String[] field783;

	@ObfuscatedName("cc.C")
	public String[] field784;

	@ObfuscatedName("cc.a(Lub;)V")
	public static final void method284(class47 arg0) {
		field763 = new class37(arg0.method249("obj.dat", null));
		class37 var1 = new class37(arg0.method249("obj.idx", null));
		field761 = var1.method210();
		field762 = new int[field761];
		int var2 = 2;
		for (int var3 = 0; var3 < field761; var3++) {
			field762[var3] = var2;
			var2 += var1.method210();
		}

		field764 = new class55[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field764[var4] = new class55();
		}
	}

	@ObfuscatedName("cc.a(Z)V")
	public static final void method285() {
		field799 = null;
		field800 = null;
		field762 = null;
		field764 = null;
		field763 = null;
	}

	@ObfuscatedName("cc.a(I)Lcc;")
	public static final class55 method286(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field764[var1].field767 == arg0) {
				return field764[var1];
			}
		}

		field765 = (field765 + 1) % 10;
		class55 var2 = field764[field765];
		field763.field540 = field762[arg0];
		var2.field767 = arg0;
		var2.method287();
		var2.method288(field763);

		if (var2.field798 != -1) {
			var2.method289();
		}

		if (!field766 && var2.field782) {
			var2.field769 = "Members Object";
			var2.field770 = "Login to a members' server to use this object.".getBytes();
			var2.field783 = null;
			var2.field784 = null;
		}

		return var2;
	}

	@ObfuscatedName("cc.a()V")
	public final void method287() {
		field768 = 0;
		field769 = null;
		field770 = null;
		field771 = null;
		field772 = null;
		field773 = 2000;
		field774 = 0;
		field775 = 0;
		field776 = 0;
		field777 = 0;
		field778 = 0;
		field779 = -1;
		field780 = false;
		field781 = 1;
		field782 = false;
		field783 = null;
		field784 = null;
		field785 = -1;
		field786 = -1;
		field787 = 0;
		field788 = -1;
		field789 = -1;
		field790 = 0;
		field791 = -1;
		field792 = -1;
		field793 = -1;
		field794 = -1;
		field795 = null;
		field796 = null;
		field797 = -1;
		field798 = -1;
	}

	@ObfuscatedName("cc.a(BLkb;)V")
	public final void method288(class37 arg0) {
		while (true) {
			int var2 = arg0.method208();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field768 = arg0.method210();
			} else if (var2 == 2) {
				field769 = arg0.method215();
			} else if (var2 == 3) {
				field770 = arg0.method216();
			} else if (var2 == 4) {
				field773 = arg0.method210();
			} else if (var2 == 5) {
				field774 = arg0.method210();
			} else if (var2 == 6) {
				field775 = arg0.method210();
			} else if (var2 == 7) {
				field777 = arg0.method210();
				if (field777 > 32767) {
					field777 -= 0x10000;
				}
			} else if (var2 == 8) {
				field778 = arg0.method210();
				if (field778 > 32767) {
					field778 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field779 = arg0.method210();
				} else if (var2 == 11) {
					field780 = true;
				} else if (var2 == 12) {
					field781 = arg0.method213();
				} else if (var2 == 16) {
					field782 = true;
				} else if (var2 == 23) {
					field785 = arg0.method210();
					field787 = arg0.method209();
				} else if (var2 == 24) {
					field786 = arg0.method210();
				} else if (var2 == 25) {
					field788 = arg0.method210();
					field790 = arg0.method209();
				} else if (var2 == 26) {
					field789 = arg0.method210();
				} else if (var2 >= 30 && var2 < 35) {
					if (field783 == null) {
						field783 = new String[5];
					}

					field783[var2 - 30] = arg0.method215();
					if (field783[var2 - 30].equalsIgnoreCase("hidden")) {
						field783[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (field784 == null) {
						field784 = new String[5];
					}

					field784[var2 - 35] = arg0.method215();
				} else if (var2 == 40) {
					int var3 = arg0.method208();
					field771 = new int[var3];
					field772 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field771[var4] = arg0.method210();
						field772[var4] = arg0.method210();
					}
				} else if (var2 == 90) {
					field791 = arg0.method210();
				} else if (var2 == 91) {
					field793 = arg0.method210();
				} else if (var2 == 92) {
					field792 = arg0.method210();
				} else if (var2 == 93) {
					field794 = arg0.method210();
				} else if (var2 == 95) {
					field776 = arg0.method210();
				} else if (var2 == 97) {
					field797 = arg0.method210();
				} else if (var2 == 98) {
					field798 = arg0.method210();
				} else if (var2 >= 100 && var2 < 110) {
					if (field795 == null) {
						field795 = new int[10];
						field796 = new int[10];
					}

					field795[var2 - 100] = arg0.method210();
					field796[var2 - 100] = arg0.method210();
				}
			}
		}
	}

	@ObfuscatedName("cc.b(I)V")
	public void method289() {
		class55 var1 = method286(field798);
		field768 = var1.field768;
		field773 = var1.field773;
		field774 = var1.field774;
		field775 = var1.field775;
		field776 = var1.field776;
		field777 = var1.field777;
		field778 = var1.field778;
		field771 = var1.field771;
		field772 = var1.field772;
		class55 var2 = method286(field797);
		field769 = var2.field769;
		field782 = var2.field782;
		field781 = var2.field781;
		String var3 = "a";
		char var4 = var2.field769.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field770 = ("Swap this note at any bank for " + var3 + " " + var2.field769 + ".").getBytes();
		field780 = true;
	}

	@ObfuscatedName("cc.c(I)Leb;")
	public final class31 method290(int arg0) {
		if (field795 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field796[var3] && field796[var3] != 0) {
					var2 = field795[var3];
				}
			}

			if (var2 != -1) {
				return method286(var2).method290(1);
			}
		}

		class31 var4 = (class31) field799.method101(field767);
		if (var4 != null) {
			return var4;
		}

		class31 var5 = new class31(field768);
		if (field771 != null) {
			for (int var6 = 0; var6 < field771.length; var6++) {
				var5.method132(field771[var6], field772[var6]);
			}
		}

		var5.method135(64, 768, -50, -10, -50, true);
		var5.field434 = true;
		field799.method102(field767, var5);
		return var5;
	}

	@ObfuscatedName("cc.a(III)Lhb;")
	public static final class34 method291(int arg0, int arg1) {
		class34 var2 = (class34) field800.method101(arg0);
		if (var2 != null && var2.field521 != arg1 && var2.field521 != -1) {
			var2.method106();
			var2 = null;
		}

		if (var2 != null) {
			return var2;
		}

		class55 var3 = method286(arg0);
		if (var3.field795 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg1 >= var3.field796[var5] && var3.field796[var5] != 0) {
					var4 = var3.field795[var5];
				}
			}

			if (var4 != -1) {
				var3 = method286(var4);
			}
		}

		class34 var6 = new class34(32, 32);
		int var7 = class33.field497;
		int var8 = class33.field498;
		int[] var9 = class33.field503;
		int[] var10 = class32.field482;
		int var11 = class32.field483;
		int var12 = class32.field484;
		int var13 = class32.field487;
		int var14 = class32.field488;
		int var15 = class32.field485;
		int var16 = class32.field486;
		class33.field495 = false;
		class32.method144(32, 32, var6.field515);
		class32.method148(0, 0, 0, 32, 32);
		class33.method153();
		class31 var17 = var3.method290(1);
		int var18 = class33.field501[var3.field774] * var3.field773 >> 16;
		int var19 = class33.field502[var3.field774] * var3.field773 >> 16;
		var17.method138(0, var3.field775, var3.field776, var3.field774, var3.field777, var17.field425 / 2 + var18 + var3.field778, var3.field778 + var19);

		for (int var20 = 31; var20 >= 0; var20--) {
			for (int var21 = 31; var21 >= 0; var21--) {
				if (var6.field515[var21 * 32 + var20] == 0) {
					if (var20 > 0 && var6.field515[var21 * 32 + var20 - 1] > 1) {
						var6.field515[var21 * 32 + var20] = 1;
					} else if (var21 > 0 && var6.field515[(var21 - 1) * 32 + var20] > 1) {
						var6.field515[var21 * 32 + var20] = 1;
					} else if (var20 < 31 && var6.field515[var21 * 32 + var20 + 1] > 1) {
						var6.field515[var21 * 32 + var20] = 1;
					} else if (var21 < 31 && var6.field515[(var21 + 1) * 32 + var20] > 1) {
						var6.field515[var21 * 32 + var20] = 1;
					}
				}
			}
		}

		for (int var22 = 31; var22 >= 0; var22--) {
			for (int var23 = 31; var23 >= 0; var23--) {
				if (var6.field515[var23 * 32 + var22] == 0 && var22 > 0 && var23 > 0 && var6.field515[(var23 - 1) * 32 + var22 - 1] > 0) {
					var6.field515[var23 * 32 + var22] = 0x302020;
				}
			}
		}

		if (var3.field798 != -1) {
			class34 var24 = method291(var3.field797, 10);
			int var25 = var24.field520;
			int var26 = var24.field521;
			var24.field520 = 32;
			var24.field521 = 32;
			var24.method174(22, 22, 5, 5);
			var24.field520 = var25;
			var24.field521 = var26;
		}

		field800.method102(arg0, var6);
		class32.method144(var11, var12, var10);
		class32.method146(var13, var15, var14, var16);
		class33.field497 = var7;
		class33.field498 = var8;
		class33.field503 = var9;
		class33.field495 = true;

		if (var3.field780) {
			var6.field520 = 33;
		} else {
			var6.field520 = 32;
		}

		var6.field521 = arg1;
		return var6;
	}

	@ObfuscatedName("cc.a(IB)Leb;")
	public final class31 method292(int arg0) {
		int var2 = field785;
		if (arg0 == 1) {
			var2 = field788;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field786;
		if (arg0 == 1) {
			var3 = field789;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(2, var6);
		}

		if (arg0 == 0 && field787 != 0) {
			var4.method131(field787, 0, 0);
		}

		if (arg0 == 1 && field790 != 0) {
			var4.method131(field790, 0, 0);
		}

		if (field771 != null) {
			for (int var7 = 0; var7 < field771.length; var7++) {
				var4.method132(field771[var7], field772[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("cc.a(IZ)Leb;")
	public final class31 method293(int arg0) {
		int var2 = field791;
		if (arg0 == 1) {
			var2 = field793;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field792;
		if (arg0 == 1) {
			var3 = field794;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(2, var6);
		}

		if (field771 != null) {
			for (int var7 = 0; var7 < field771.length; var7++) {
				var4.method132(field771[var7], field772[var7]);
			}
		}

		return var4;
	}
}
