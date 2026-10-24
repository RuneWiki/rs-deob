package deob;

@ObfuscatedName("cc")
public final class class55 {

	@ObfuscatedName("cc.e")
	public static int field762;

	@ObfuscatedName("cc.f")
	public static int[] field763;

	@ObfuscatedName("cc.g")
	public static class37 field764;

	@ObfuscatedName("cc.h")
	public static class55[] field765;

	@ObfuscatedName("cc.i")
	public static int field766;

	@ObfuscatedName("cc.j")
	public static boolean field767 = true;

	@ObfuscatedName("cc.k")
	public int field768 = -1;

	@ObfuscatedName("cc.l")
	public int field769;

	@ObfuscatedName("cc.m")
	public String field770;

	@ObfuscatedName("cc.n")
	public byte[] field771;

	@ObfuscatedName("cc.o")
	public int[] field772;

	@ObfuscatedName("cc.p")
	public int[] field773;

	@ObfuscatedName("cc.q")
	public int field774;

	@ObfuscatedName("cc.r")
	public int field775;

	@ObfuscatedName("cc.s")
	public int field776;

	@ObfuscatedName("cc.t")
	public int field777;

	@ObfuscatedName("cc.u")
	public int field778;

	@ObfuscatedName("cc.v")
	public int field779;

	@ObfuscatedName("cc.x")
	public int field780;

	@ObfuscatedName("cc.y")
	public boolean field781;

	@ObfuscatedName("cc.z")
	public int field782;

	@ObfuscatedName("cc.R")
	public static class19 field800 = new class19(50);

	@ObfuscatedName("cc.S")
	public static class19 field801 = new class19(200);

	@ObfuscatedName("cc.F")
	public byte field788;

	@ObfuscatedName("cc.I")
	public byte field791;

	@ObfuscatedName("cc.D")
	public int field786;

	@ObfuscatedName("cc.E")
	public int field787;

	@ObfuscatedName("cc.G")
	public int field789;

	@ObfuscatedName("cc.H")
	public int field790;

	@ObfuscatedName("cc.J")
	public int field792;

	@ObfuscatedName("cc.K")
	public int field793;

	@ObfuscatedName("cc.L")
	public int field794;

	@ObfuscatedName("cc.M")
	public int field795;

	@ObfuscatedName("cc.P")
	public int field798;

	@ObfuscatedName("cc.Q")
	public int field799;

	@ObfuscatedName("cc.A")
	public boolean field783;

	@ObfuscatedName("cc.N")
	public int[] field796;

	@ObfuscatedName("cc.O")
	public int[] field797;

	@ObfuscatedName("cc.B")
	public String[] field784;

	@ObfuscatedName("cc.C")
	public String[] field785;

	@ObfuscatedName("cc.a(Lub;)V")
	public static final void method285(class47 arg0) {
		field764 = new class37(arg0.method250("obj.dat", null));
		class37 var1 = new class37(arg0.method250("obj.idx", null));
		field762 = var1.method211();
		field763 = new int[field762];
		int var2 = 2;
		for (int var3 = 0; var3 < field762; var3++) {
			field763[var3] = var2;
			var2 += var1.method211();
		}

		field765 = new class55[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field765[var4] = new class55();
		}
	}

	@ObfuscatedName("cc.a(Z)V")
	public static final void method286() {
		field800 = null;
		field801 = null;
		field763 = null;
		field765 = null;
		field764 = null;
	}

	@ObfuscatedName("cc.a(I)Lcc;")
	public static final class55 method287(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field765[var1].field768 == arg0) {
				return field765[var1];
			}
		}

		field766 = (field766 + 1) % 10;
		class55 var2 = field765[field766];
		field764.field540 = field763[arg0];
		var2.field768 = arg0;
		var2.method288();
		var2.method289(field764);

		if (var2.field799 != -1) {
			var2.method290();
		}

		if (!field767 && var2.field783) {
			var2.field770 = "Members Object";
			var2.field771 = "Login to a members' server to use this object.".getBytes();
			var2.field784 = null;
			var2.field785 = null;
		}

		return var2;
	}

	@ObfuscatedName("cc.a()V")
	public final void method288() {
		field769 = 0;
		field770 = null;
		field771 = null;
		field772 = null;
		field773 = null;
		field774 = 2000;
		field775 = 0;
		field776 = 0;
		field777 = 0;
		field778 = 0;
		field779 = 0;
		field780 = -1;
		field781 = false;
		field782 = 1;
		field783 = false;
		field784 = null;
		field785 = null;
		field786 = -1;
		field787 = -1;
		field788 = 0;
		field789 = -1;
		field790 = -1;
		field791 = 0;
		field792 = -1;
		field793 = -1;
		field794 = -1;
		field795 = -1;
		field796 = null;
		field797 = null;
		field798 = -1;
		field799 = -1;
	}

	@ObfuscatedName("cc.a(BLkb;)V")
	public final void method289(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field769 = arg0.method211();
			} else if (var2 == 2) {
				field770 = arg0.method216();
			} else if (var2 == 3) {
				field771 = arg0.method217();
			} else if (var2 == 4) {
				field774 = arg0.method211();
			} else if (var2 == 5) {
				field775 = arg0.method211();
			} else if (var2 == 6) {
				field776 = arg0.method211();
			} else if (var2 == 7) {
				field778 = arg0.method211();
				if (field778 > 32767) {
					field778 -= 0x10000;
				}
			} else if (var2 == 8) {
				field779 = arg0.method211();
				if (field779 > 32767) {
					field779 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field780 = arg0.method211();
				} else if (var2 == 11) {
					field781 = true;
				} else if (var2 == 12) {
					field782 = arg0.method214();
				} else if (var2 == 16) {
					field783 = true;
				} else if (var2 == 23) {
					field786 = arg0.method211();
					field788 = arg0.method210();
				} else if (var2 == 24) {
					field787 = arg0.method211();
				} else if (var2 == 25) {
					field789 = arg0.method211();
					field791 = arg0.method210();
				} else if (var2 == 26) {
					field790 = arg0.method211();
				} else if (var2 >= 30 && var2 < 35) {
					if (field784 == null) {
						field784 = new String[5];
					}

					field784[var2 - 30] = arg0.method216();
					if (field784[var2 - 30].equalsIgnoreCase("hidden")) {
						field784[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (field785 == null) {
						field785 = new String[5];
					}

					field785[var2 - 35] = arg0.method216();
				} else if (var2 == 40) {
					int var3 = arg0.method209();
					field772 = new int[var3];
					field773 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field772[var4] = arg0.method211();
						field773[var4] = arg0.method211();
					}
				} else if (var2 == 90) {
					field792 = arg0.method211();
				} else if (var2 == 91) {
					field794 = arg0.method211();
				} else if (var2 == 92) {
					field793 = arg0.method211();
				} else if (var2 == 93) {
					field795 = arg0.method211();
				} else if (var2 == 95) {
					field777 = arg0.method211();
				} else if (var2 == 97) {
					field798 = arg0.method211();
				} else if (var2 == 98) {
					field799 = arg0.method211();
				} else if (var2 >= 100 && var2 < 110) {
					if (field796 == null) {
						field796 = new int[10];
						field797 = new int[10];
					}

					field796[var2 - 100] = arg0.method211();
					field797[var2 - 100] = arg0.method211();
				}
			}
		}
	}

	@ObfuscatedName("cc.b(I)V")
	public void method290() {
		class55 var1 = method287(field799);
		field769 = var1.field769;
		field774 = var1.field774;
		field775 = var1.field775;
		field776 = var1.field776;
		field777 = var1.field777;
		field778 = var1.field778;
		field779 = var1.field779;
		field772 = var1.field772;
		field773 = var1.field773;
		class55 var2 = method287(field798);
		field770 = var2.field770;
		field783 = var2.field783;
		field782 = var2.field782;
		String var3 = "a";
		char var4 = var2.field770.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field771 = ("Swap this note at any bank for " + var3 + " " + var2.field770 + ".").getBytes();
		field781 = true;
	}

	@ObfuscatedName("cc.c(I)Leb;")
	public final class31 method291(int arg0) {
		if (field796 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field797[var3] && field797[var3] != 0) {
					var2 = field796[var3];
				}
			}

			if (var2 != -1) {
				return method287(var2).method291(1);
			}
		}

		class31 var4 = (class31) field800.method102(field768);
		if (var4 != null) {
			return var4;
		}

		class31 var5 = new class31(field769);
		if (field772 != null) {
			for (int var6 = 0; var6 < field772.length; var6++) {
				var5.method133(field772[var6], field773[var6]);
			}
		}

		var5.method136(64, 768, -50, -10, -50, true);
		var5.field434 = true;
		field800.method103(var5, field768);
		return var5;
	}

	@ObfuscatedName("cc.a(III)Lhb;")
	public static final class34 method292(int arg0, int arg1) {
		class34 var2 = (class34) field801.method102(arg1);
		if (var2 != null && var2.field521 != arg0 && var2.field521 != -1) {
			var2.method107();
			var2 = null;
		}

		if (var2 != null) {
			return var2;
		}

		class55 var3 = method287(arg1);
		if (var3.field796 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg0 >= var3.field797[var5] && var3.field797[var5] != 0) {
					var4 = var3.field796[var5];
				}
			}

			if (var4 != -1) {
				var3 = method287(var4);
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
		class32.method145(var6.field515, 32, 32);
		class32.method149(0, 32, 0, 0, 32);
		class33.method154();
		class31 var17 = var3.method291(1);
		int var18 = class33.field501[var3.field775] * var3.field774 >> 16;
		int var19 = class33.field502[var3.field775] * var3.field774 >> 16;
		var17.method139(0, var3.field776, var3.field777, var3.field775, var3.field778, var17.field425 / 2 + var18 + var3.field779, var3.field779 + var19);

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

		if (var3.field799 != -1) {
			class34 var24 = method292(10, var3.field798);
			int var25 = var24.field520;
			int var26 = var24.field521;
			var24.field520 = 32;
			var24.field521 = 32;
			var24.method175(22, 5, 5, 22);
			var24.field520 = var25;
			var24.field521 = var26;
		}

		field801.method103(var6, arg1);
		class32.method145(var10, var11, var12);
		class32.method147(var13, var15, var14, var16);
		class33.field497 = var7;
		class33.field498 = var8;
		class33.field503 = var9;
		class33.field495 = true;

		if (var3.field781) {
			var6.field520 = 33;
		} else {
			var6.field520 = 32;
		}

		var6.field521 = arg0;
		return var6;
	}

	@ObfuscatedName("cc.a(II)Leb;")
	public final class31 method293(int arg0) {
		int var2 = field786;
		if (arg0 == 1) {
			var2 = field789;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field787;
		if (arg0 == 1) {
			var3 = field790;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(var6, 2);
		}

		if (arg0 == 0 && field788 != 0) {
			var4.method132(0, 0, field788);
		}

		if (arg0 == 1 && field791 != 0) {
			var4.method132(0, 0, field791);
		}

		if (field772 != null) {
			for (int var7 = 0; var7 < field772.length; var7++) {
				var4.method133(field772[var7], field773[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("cc.b(II)Leb;")
	public final class31 method294(int arg0) {
		int var2 = field792;
		if (arg0 == 1) {
			var2 = field794;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field793;
		if (arg0 == 1) {
			var3 = field795;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(var6, 2);
		}

		if (field772 != null) {
			for (int var7 = 0; var7 < field772.length; var7++) {
				var4.method133(field772[var7], field773[var7]);
			}
		}

		return var4;
	}
}
