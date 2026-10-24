package deob;

@ObfuscatedName("ac")
public final class class53 {

	@ObfuscatedName("ac.c")
	public static boolean field692;

	@ObfuscatedName("ac.d")
	public static int field693;

	@ObfuscatedName("ac.e")
	public static int[] field694;

	@ObfuscatedName("ac.f")
	public static class37 field695;

	@ObfuscatedName("ac.g")
	public static class53[] field696;

	@ObfuscatedName("ac.h")
	public static int field697;

	@ObfuscatedName("ac.i")
	public int field698 = -1;

	@ObfuscatedName("ac.j")
	public int[] field699;

	@ObfuscatedName("ac.k")
	public int[] field700;

	@ObfuscatedName("ac.l")
	public String field701;

	@ObfuscatedName("ac.m")
	public byte[] field702;

	@ObfuscatedName("ac.n")
	public int[] field703;

	@ObfuscatedName("ac.o")
	public int[] field704;

	@ObfuscatedName("ac.p")
	public int field705;

	@ObfuscatedName("ac.q")
	public int field706;

	@ObfuscatedName("ac.r")
	public boolean field707;

	@ObfuscatedName("ac.s")
	public boolean field708;

	@ObfuscatedName("ac.t")
	public boolean field709;

	@ObfuscatedName("ac.u")
	public boolean field710;

	@ObfuscatedName("ac.v")
	public boolean field711;

	@ObfuscatedName("ac.w")
	public boolean field712;

	@ObfuscatedName("ac.x")
	public int field713;

	@ObfuscatedName("ac.y")
	public int field714;

	@ObfuscatedName("ac.z")
	public byte field715;

	@ObfuscatedName("ac.P")
	public static class19 field731 = new class19(500);

	@ObfuscatedName("ac.Q")
	public static class19 field732 = new class19(30);

	@ObfuscatedName("ac.A")
	public byte field716;

	@ObfuscatedName("ac.D")
	public int field719;

	@ObfuscatedName("ac.E")
	public int field720;

	@ObfuscatedName("ac.H")
	public int field723;

	@ObfuscatedName("ac.I")
	public int field724;

	@ObfuscatedName("ac.J")
	public int field725;

	@ObfuscatedName("ac.K")
	public int field726;

	@ObfuscatedName("ac.L")
	public int field727;

	@ObfuscatedName("ac.M")
	public int field728;

	@ObfuscatedName("ac.N")
	public int field729;

	@ObfuscatedName("ac.C")
	public boolean field718;

	@ObfuscatedName("ac.F")
	public boolean field721;

	@ObfuscatedName("ac.G")
	public boolean field722;

	@ObfuscatedName("ac.O")
	public boolean field730;

	@ObfuscatedName("ac.B")
	public String[] field717;

	@ObfuscatedName("ac.a(Lub;)V")
	public static final void method272(class47 arg0) {
		field695 = new class37(arg0.method249("loc.dat", null));
		class37 var1 = new class37(arg0.method249("loc.idx", null));
		field693 = var1.method210();
		field694 = new int[field693];
		int var2 = 2;
		for (int var3 = 0; var3 < field693; var3++) {
			field694[var3] = var2;
			var2 += var1.method210();
		}

		field696 = new class53[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field696[var4] = new class53();
		}
	}

	@ObfuscatedName("ac.a(Z)V")
	public static final void method273() {
		field731 = null;
		field732 = null;
		field694 = null;
		field696 = null;
		field695 = null;
	}

	@ObfuscatedName("ac.a(I)Lac;")
	public static final class53 method274(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field696[var1].field698 == arg0) {
				return field696[var1];
			}
		}

		field697 = (field697 + 1) % 10;
		class53 var2 = field696[field697];
		field695.field540 = field694[arg0];
		var2.field698 = arg0;
		var2.method275();
		var2.method276(field695);
		return var2;
	}

	@ObfuscatedName("ac.a()V")
	public final void method275() {
		field699 = null;
		field700 = null;
		field701 = null;
		field702 = null;
		field703 = null;
		field704 = null;
		field705 = 1;
		field706 = 1;
		field707 = true;
		field708 = true;
		field709 = false;
		field710 = false;
		field711 = false;
		field712 = false;
		field713 = -1;
		field714 = 16;
		field715 = 0;
		field716 = 0;
		field717 = null;
		field718 = false;
		field719 = -1;
		field720 = -1;
		field721 = false;
		field722 = true;
		field723 = 128;
		field724 = 128;
		field725 = 128;
		field729 = 0;
		field726 = 0;
		field727 = 0;
		field728 = 0;
		field730 = false;
	}

	@ObfuscatedName("ac.a(BLkb;)V")
	public final void method276(class37 arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method208();
			if (var3 == 0) {
				if (field700 == null) {
					field700 = new int[0];
				}

				if (var2 == -1) {
					field709 = false;
					if (field700.length > 0 && field700[0] == 10) {
						field709 = true;
					}

					if (field717 != null) {
						field709 = true;
						return;
					}
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method208();
				field700 = new int[var4];
				field699 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field699[var5] = arg0.method210();
					field700[var5] = arg0.method208();
				}
			} else if (var3 == 2) {
				field701 = arg0.method215();
			} else if (var3 == 3) {
				field702 = arg0.method216();
			} else if (var3 == 14) {
				field705 = arg0.method208();
			} else if (var3 == 15) {
				field706 = arg0.method208();
			} else if (var3 == 17) {
				field707 = false;
			} else if (var3 == 18) {
				field708 = false;
			} else if (var3 == 19) {
				var2 = arg0.method208();
				if (var2 == 1) {
					field709 = true;
				}
			} else if (var3 == 21) {
				field710 = true;
			} else if (var3 == 22) {
				field711 = true;
			} else if (var3 == 23) {
				field712 = true;
			} else if (var3 == 24) {
				field713 = arg0.method210();
				if (field713 == 0xFFFF) {
					field713 = -1;
				}
			} else if (var3 == 25) {
				field718 = true;
			} else if (var3 == 28) {
				field714 = arg0.method208();
			} else if (var3 == 29) {
				field715 = arg0.method209();
			} else if (var3 == 39) {
				field716 = arg0.method209();
			} else if (var3 >= 30 && var3 < 39) {
				if (field717 == null) {
					field717 = new String[5];
				}

				field717[var3 - 30] = arg0.method215();
				if (field717[var3 - 30].equalsIgnoreCase("hidden")) {
					field717[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg0.method208();
				field703 = new int[var6];
				field704 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field703[var7] = arg0.method210();
					field704[var7] = arg0.method210();
				}
			} else if (var3 == 60) {
				field719 = arg0.method210();
			} else if (var3 == 62) {
				field721 = true;
			} else if (var3 == 64) {
				field722 = false;
			} else if (var3 == 65) {
				field723 = arg0.method210();
			} else if (var3 == 66) {
				field724 = arg0.method210();
			} else if (var3 == 67) {
				field725 = arg0.method210();
			} else if (var3 == 68) {
				field720 = arg0.method210();
			} else if (var3 == 69) {
				field729 = arg0.method208();
			} else if (var3 == 70) {
				field726 = arg0.method211();
			} else if (var3 == 71) {
				field727 = arg0.method211();
			} else if (var3 == 72) {
				field728 = arg0.method211();
			} else if (var3 == 73) {
				field730 = true;
			}
		}
	}

	@ObfuscatedName("ac.a(IIIIIII)Leb;")
	public final class31 method277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field700.length; var9++) {
			if (field700[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field698 << 6) + (var8 << 3) + arg1);
		if (field692) {
			var10 = 0L;
		}

		class31 var12 = (class31) field732.method101(var10);
		if (var12 == null) {
			if (var8 >= field699.length) {
				return null;
			}

			int var20 = field699[var8];
			if (var20 == -1) {
				return null;
			}

			boolean var21 = field721 ^ arg1 > 3;
			if (var21) {
				var20 += 0x10000;
			}

			class31 var22 = (class31) field731.method101(var20);
			if (var22 == null) {
				var22 = new class31(var20 & 0xFFFF);
				if (var21) {
					var22.method133();
				}

				field731.method102(var20, var22);
			}

			boolean var23;
			if (field723 == 128 && field724 == 128 && field725 == 128) {
				var23 = false;
			} else {
				var23 = true;
			}

			boolean var24;
			if (field726 == 0 && field727 == 0 && field728 == 0) {
				var24 = false;
			} else {
				var24 = true;
			}

			class31 var25 = new class31(arg1 == 0 && arg6 == -1 && !var23 && !var24, field703 == null, !field718, var22);
			if (arg6 != -1) {
				var25.method125();
				var25.method126(arg6);
				var25.field433 = null;
				var25.field432 = null;
			}

			while (arg1-- > 0) {
				var25.method129();
			}

			if (field703 != null) {
				for (int var26 = 0; var26 < field703.length; var26++) {
					var25.method132(field703[var26], field704[var26]);
				}
			}

			if (var23) {
				var25.method134(field724, field725, field723);
			}

			if (var24) {
				var25.method131(field727, field728, field726);
			}

			var25.method135(field715 + 64, field716 * 5 + 768, -50, -10, -50, !field711);

			if (field707) {
				var25.field429 = var25.field425;
			}

			field732.method102(var10, var25);

			if (field710 || field711) {
				var25 = new class31(var25, field710, field711);
			}

			if (field710) {
				int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var28 = 0; var28 < var25.field400; var28++) {
					int var29 = var25.field401[var28];
					int var30 = var25.field403[var28];
					int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
					int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
					int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
					var25.field402[var28] += var33 - var27;
				}

				var25.method123();
			}

			return var25;
		} else if (field692) {
			return var12;
		} else {
			if (field710 || field711) {
				var12 = new class31(var12, field710, field711);
			}

			if (field710) {
				int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var14 = 0; var14 < var12.field400; var14++) {
					int var15 = var12.field401[var14];
					int var16 = var12.field403[var14];
					int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
					int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
					int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
					var12.field402[var14] += var19 - var13;
				}

				var12.method123();
			}

			return var12;
		}
	}
}
