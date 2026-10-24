package deob;

@ObfuscatedName("cc")
public final class class55 {

	@ObfuscatedName("cc.d")
	public static int field763;

	@ObfuscatedName("cc.e")
	public static int[] field764;

	@ObfuscatedName("cc.f")
	public static class37 field765;

	@ObfuscatedName("cc.g")
	public static class55[] field766;

	@ObfuscatedName("cc.h")
	public static int field767;

	@ObfuscatedName("cc.i")
	public static boolean field768 = true;

	@ObfuscatedName("cc.j")
	public int field769 = -1;

	@ObfuscatedName("cc.k")
	public int field770;

	@ObfuscatedName("cc.l")
	public String field771;

	@ObfuscatedName("cc.m")
	public byte[] field772;

	@ObfuscatedName("cc.n")
	public int[] field773;

	@ObfuscatedName("cc.o")
	public int[] field774;

	@ObfuscatedName("cc.p")
	public int field775;

	@ObfuscatedName("cc.q")
	public int field776;

	@ObfuscatedName("cc.r")
	public int field777;

	@ObfuscatedName("cc.s")
	public int field778;

	@ObfuscatedName("cc.t")
	public int field779;

	@ObfuscatedName("cc.u")
	public int field780;

	@ObfuscatedName("cc.w")
	public int field781;

	@ObfuscatedName("cc.x")
	public boolean field782;

	@ObfuscatedName("cc.y")
	public int field783;

	@ObfuscatedName("cc.z")
	public boolean field784;

	@ObfuscatedName("cc.Q")
	public static class19 field801 = new class19(50);

	@ObfuscatedName("cc.R")
	public static class19 field802 = new class19(200);

	@ObfuscatedName("cc.E")
	public byte field789;

	@ObfuscatedName("cc.H")
	public byte field792;

	@ObfuscatedName("cc.C")
	public int field787;

	@ObfuscatedName("cc.D")
	public int field788;

	@ObfuscatedName("cc.F")
	public int field790;

	@ObfuscatedName("cc.G")
	public int field791;

	@ObfuscatedName("cc.I")
	public int field793;

	@ObfuscatedName("cc.J")
	public int field794;

	@ObfuscatedName("cc.K")
	public int field795;

	@ObfuscatedName("cc.L")
	public int field796;

	@ObfuscatedName("cc.O")
	public int field799;

	@ObfuscatedName("cc.P")
	public int field800;

	@ObfuscatedName("cc.M")
	public int[] field797;

	@ObfuscatedName("cc.N")
	public int[] field798;

	@ObfuscatedName("cc.A")
	public String[] field785;

	@ObfuscatedName("cc.B")
	public String[] field786;

	@ObfuscatedName("cc.a(Lub;)V")
	public static final void method285(class47 arg0) {
		field765 = new class37(arg0.method250(null, "obj.dat"));
		class37 var1 = new class37(arg0.method250(null, "obj.idx"));
		field763 = var1.method211();
		field764 = new int[field763];
		int var2 = 2;
		for (int var3 = 0; var3 < field763; var3++) {
			field764[var3] = var2;
			var2 += var1.method211();
		}

		field766 = new class55[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field766[var4] = new class55();
		}
	}

	@ObfuscatedName("cc.a(I)V")
	public static final void method286() {
		field801 = null;
		field802 = null;
		field764 = null;
		field766 = null;
		field765 = null;
	}

	@ObfuscatedName("cc.b(I)Lcc;")
	public static final class55 method287(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field766[var1].field769 == arg0) {
				return field766[var1];
			}
		}

		field767 = (field767 + 1) % 10;
		class55 var2 = field766[field767];
		field765.field541 = field764[arg0];
		var2.field769 = arg0;
		var2.method288();
		var2.method289(field765);

		if (var2.field800 != -1) {
			var2.method290();
		}

		if (!field768 && var2.field784) {
			var2.field771 = "Members Object";
			var2.field772 = "Login to a members' server to use this object.".getBytes();
			var2.field785 = null;
			var2.field786 = null;
		}

		return var2;
	}

	@ObfuscatedName("cc.a()V")
	public final void method288() {
		field770 = 0;
		field771 = null;
		field772 = null;
		field773 = null;
		field774 = null;
		field775 = 2000;
		field776 = 0;
		field777 = 0;
		field778 = 0;
		field779 = 0;
		field780 = 0;
		field781 = -1;
		field782 = false;
		field783 = 1;
		field784 = false;
		field785 = null;
		field786 = null;
		field787 = -1;
		field788 = -1;
		field789 = 0;
		field790 = -1;
		field791 = -1;
		field792 = 0;
		field793 = -1;
		field794 = -1;
		field795 = -1;
		field796 = -1;
		field797 = null;
		field798 = null;
		field799 = -1;
		field800 = -1;
	}

	@ObfuscatedName("cc.a(ILkb;)V")
	public final void method289(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field770 = arg0.method211();
			} else if (var2 == 2) {
				field771 = arg0.method216();
			} else if (var2 == 3) {
				field772 = arg0.method217();
			} else if (var2 == 4) {
				field775 = arg0.method211();
			} else if (var2 == 5) {
				field776 = arg0.method211();
			} else if (var2 == 6) {
				field777 = arg0.method211();
			} else if (var2 == 7) {
				field779 = arg0.method211();
				if (field779 > 32767) {
					field779 -= 0x10000;
				}
			} else if (var2 == 8) {
				field780 = arg0.method211();
				if (field780 > 32767) {
					field780 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field781 = arg0.method211();
				} else if (var2 == 11) {
					field782 = true;
				} else if (var2 == 12) {
					field783 = arg0.method214();
				} else if (var2 == 16) {
					field784 = true;
				} else if (var2 == 23) {
					field787 = arg0.method211();
					field789 = arg0.method210();
				} else if (var2 == 24) {
					field788 = arg0.method211();
				} else if (var2 == 25) {
					field790 = arg0.method211();
					field792 = arg0.method210();
				} else if (var2 == 26) {
					field791 = arg0.method211();
				} else if (var2 >= 30 && var2 < 35) {
					if (field785 == null) {
						field785 = new String[5];
					}

					field785[var2 - 30] = arg0.method216();
					if (field785[var2 - 30].equalsIgnoreCase("hidden")) {
						field785[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (field786 == null) {
						field786 = new String[5];
					}

					field786[var2 - 35] = arg0.method216();
				} else if (var2 == 40) {
					int var3 = arg0.method209();
					field773 = new int[var3];
					field774 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field773[var4] = arg0.method211();
						field774[var4] = arg0.method211();
					}
				} else if (var2 == 90) {
					field793 = arg0.method211();
				} else if (var2 == 91) {
					field795 = arg0.method211();
				} else if (var2 == 92) {
					field794 = arg0.method211();
				} else if (var2 == 93) {
					field796 = arg0.method211();
				} else if (var2 == 95) {
					field778 = arg0.method211();
				} else if (var2 == 97) {
					field799 = arg0.method211();
				} else if (var2 == 98) {
					field800 = arg0.method211();
				} else if (var2 >= 100 && var2 < 110) {
					if (field797 == null) {
						field797 = new int[10];
						field798 = new int[10];
					}

					field797[var2 - 100] = arg0.method211();
					field798[var2 - 100] = arg0.method211();
				}
			}
		}
	}

	@ObfuscatedName("cc.c(I)V")
	public void method290() {
		class55 var1 = method287(field800);
		field770 = var1.field770;
		field775 = var1.field775;
		field776 = var1.field776;
		field777 = var1.field777;
		field778 = var1.field778;
		field779 = var1.field779;
		field780 = var1.field780;
		field773 = var1.field773;
		field774 = var1.field774;
		class55 var2 = method287(field799);
		field771 = var2.field771;
		field784 = var2.field784;
		field783 = var2.field783;
		String var3 = "a";
		char var4 = var2.field771.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field772 = ("Swap this note at any bank for " + var3 + " " + var2.field771 + ".").getBytes();
		field782 = true;
	}

	@ObfuscatedName("cc.d(I)Leb;")
	public final class31 method291(int arg0) {
		if (field797 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field798[var3] && field798[var3] != 0) {
					var2 = field797[var3];
				}
			}

			if (var2 != -1) {
				return method287(var2).method291(1);
			}
		}

		class31 var4 = (class31) field801.method102(field769);
		if (var4 != null) {
			return var4;
		}

		class31 var5 = new class31(field770);
		if (field773 != null) {
			for (int var6 = 0; var6 < field773.length; var6++) {
				var5.method133(field773[var6], field774[var6]);
			}
		}

		var5.method136(64, 768, -50, -10, -50, true);
		var5.field434 = true;
		field801.method103(field769, var5);
		return var5;
	}

	@ObfuscatedName("cc.a(III)Lhb;")
	public static final class34 method292(int arg0, int arg1) {
		class34 var2 = (class34) field802.method102(arg1);
		if (var2 != null && var2.field521 != arg0 && var2.field521 != -1) {
			var2.method107();
			var2 = null;
		}

		if (var2 != null) {
			return var2;
		}

		class55 var3 = method287(arg1);
		if (var3.field797 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg0 >= var3.field798[var5] && var3.field798[var5] != 0) {
					var4 = var3.field797[var5];
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
		class32.method145(32, var6.field515, 32);
		class32.method149(0, 32, 0, 32, 0);
		class33.method154();
		class31 var17 = var3.method291(1);
		int var18 = class33.field501[var3.field776] * var3.field775 >> 16;
		int var19 = class33.field502[var3.field776] * var3.field775 >> 16;
		var17.method139(0, var3.field777, var3.field778, var3.field776, var3.field779, var17.field425 / 2 + var18 + var3.field780, var3.field780 + var19);

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

		if (var3.field800 != -1) {
			class34 var24 = method292(10, var3.field799);
			int var25 = var24.field520;
			int var26 = var24.field521;
			var24.field520 = 32;
			var24.field521 = 32;
			var24.method175(5, 5, 22, 22);
			var24.field520 = var25;
			var24.field521 = var26;
		}

		field802.method103(arg1, var6);
		class32.method145(var11, var10, var12);
		class32.method147(var15, var13, var16, var14);
		class33.field497 = var7;
		class33.field498 = var8;
		class33.field503 = var9;
		class33.field495 = true;

		if (var3.field782) {
			var6.field520 = 33;
		} else {
			var6.field520 = 32;
		}

		var6.field521 = arg0;
		return var6;
	}

	@ObfuscatedName("cc.a(II)Leb;")
	public final class31 method293(int arg0) {
		int var2 = field787;
		if (arg0 == 1) {
			var2 = field790;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field788;
		if (arg0 == 1) {
			var3 = field791;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(2, var6);
		}

		if (arg0 == 0 && field789 != 0) {
			var4.method132(field789, 0, 0);
		}

		if (arg0 == 1 && field792 != 0) {
			var4.method132(field792, 0, 0);
		}

		if (field773 != null) {
			for (int var7 = 0; var7 < field773.length; var7++) {
				var4.method133(field773[var7], field774[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("cc.a(IZ)Leb;")
	public final class31 method294(int arg0) {
		int var2 = field793;
		if (arg0 == 1) {
			var2 = field795;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field794;
		if (arg0 == 1) {
			var3 = field796;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(2, var6);
		}

		if (field773 != null) {
			for (int var7 = 0; var7 < field773.length; var7++) {
				var4.method133(field773[var7], field774[var7]);
			}
		}

		return var4;
	}
}
