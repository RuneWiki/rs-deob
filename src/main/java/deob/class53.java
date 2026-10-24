package deob;

@ObfuscatedName("ac")
public final class class53 {

	@ObfuscatedName("ac.c")
	public static boolean field696;

	@ObfuscatedName("ac.d")
	public static int field697;

	@ObfuscatedName("ac.e")
	public static int[] field698;

	@ObfuscatedName("ac.f")
	public static class37 field699;

	@ObfuscatedName("ac.g")
	public static class53[] field700;

	@ObfuscatedName("ac.h")
	public static int field701;

	@ObfuscatedName("ac.i")
	public int field702 = -1;

	@ObfuscatedName("ac.j")
	public int[] field703;

	@ObfuscatedName("ac.k")
	public int[] field704;

	@ObfuscatedName("ac.l")
	public String field705;

	@ObfuscatedName("ac.m")
	public byte[] field706;

	@ObfuscatedName("ac.n")
	public int[] field707;

	@ObfuscatedName("ac.o")
	public int[] field708;

	@ObfuscatedName("ac.p")
	public int field709;

	@ObfuscatedName("ac.q")
	public int field710;

	@ObfuscatedName("ac.r")
	public boolean field711;

	@ObfuscatedName("ac.s")
	public boolean field712;

	@ObfuscatedName("ac.t")
	public boolean field713;

	@ObfuscatedName("ac.u")
	public boolean field714;

	@ObfuscatedName("ac.v")
	public boolean field715;

	@ObfuscatedName("ac.w")
	public boolean field716;

	@ObfuscatedName("ac.x")
	public int field717;

	@ObfuscatedName("ac.y")
	public int field718;

	@ObfuscatedName("ac.z")
	public byte field719;

	@ObfuscatedName("ac.P")
	public static class19 field735 = new class19(500);

	@ObfuscatedName("ac.Q")
	public static class19 field736 = new class19(30);

	@ObfuscatedName("ac.A")
	public byte field720;

	@ObfuscatedName("ac.D")
	public int field723;

	@ObfuscatedName("ac.E")
	public int field724;

	@ObfuscatedName("ac.H")
	public int field727;

	@ObfuscatedName("ac.I")
	public int field728;

	@ObfuscatedName("ac.J")
	public int field729;

	@ObfuscatedName("ac.K")
	public int field730;

	@ObfuscatedName("ac.L")
	public int field731;

	@ObfuscatedName("ac.M")
	public int field732;

	@ObfuscatedName("ac.N")
	public int field733;

	@ObfuscatedName("ac.C")
	public boolean field722;

	@ObfuscatedName("ac.F")
	public boolean field725;

	@ObfuscatedName("ac.G")
	public boolean field726;

	@ObfuscatedName("ac.O")
	public boolean field734;

	@ObfuscatedName("ac.B")
	public String[] field721;

	@ObfuscatedName("ac.a(Lub;)V")
	public static final void method280(class47 arg0) {
		field699 = new class37(arg0.method257(null, "loc.dat"));
		class37 var1 = new class37(arg0.method257(null, "loc.idx"));
		field697 = var1.method218();
		field698 = new int[field697];
		int var2 = 2;
		for (int var3 = 0; var3 < field697; var3++) {
			field698[var3] = var2;
			var2 += var1.method218();
		}

		field700 = new class53[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field700[var4] = new class53();
		}
	}

	@ObfuscatedName("ac.a(I)V")
	public static final void method281() {
		field735 = null;
		field736 = null;
		field698 = null;
		field700 = null;
		field699 = null;
	}

	@ObfuscatedName("ac.b(I)Lac;")
	public static final class53 method282(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field700[var1].field702 == arg0) {
				return field700[var1];
			}
		}

		field701 = (field701 + 1) % 10;
		class53 var2 = field700[field701];
		field699.field543 = field698[arg0];
		var2.field702 = arg0;
		var2.method283();
		var2.method284(field699);
		return var2;
	}

	@ObfuscatedName("ac.a()V")
	public final void method283() {
		field703 = null;
		field704 = null;
		field705 = null;
		field706 = null;
		field707 = null;
		field708 = null;
		field709 = 1;
		field710 = 1;
		field711 = true;
		field712 = true;
		field713 = false;
		field714 = false;
		field715 = false;
		field716 = false;
		field717 = -1;
		field718 = 16;
		field719 = 0;
		field720 = 0;
		field721 = null;
		field722 = false;
		field723 = -1;
		field724 = -1;
		field725 = false;
		field726 = true;
		field727 = 128;
		field728 = 128;
		field729 = 128;
		field733 = 0;
		field730 = 0;
		field731 = 0;
		field732 = 0;
		field734 = false;
	}

	@ObfuscatedName("ac.a(Lkb;Z)V")
	public final void method284(class37 arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method216();
			if (var3 == 0) {
				if (field704 == null) {
					field704 = new int[0];
				}

				if (var2 == -1) {
					field713 = false;
					if (field704.length > 0 && field704[0] == 10) {
						field713 = true;
					}

					if (field721 != null) {
						field713 = true;
						return;
					}
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method216();
				field704 = new int[var4];
				field703 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field703[var5] = arg0.method218();
					field704[var5] = arg0.method216();
				}
			} else if (var3 == 2) {
				field705 = arg0.method223();
			} else if (var3 == 3) {
				field706 = arg0.method224();
			} else if (var3 == 14) {
				field709 = arg0.method216();
			} else if (var3 == 15) {
				field710 = arg0.method216();
			} else if (var3 == 17) {
				field711 = false;
			} else if (var3 == 18) {
				field712 = false;
			} else if (var3 == 19) {
				var2 = arg0.method216();
				if (var2 == 1) {
					field713 = true;
				}
			} else if (var3 == 21) {
				field714 = true;
			} else if (var3 == 22) {
				field715 = true;
			} else if (var3 == 23) {
				field716 = true;
			} else if (var3 == 24) {
				field717 = arg0.method218();
				if (field717 == 0xFFFF) {
					field717 = -1;
				}
			} else if (var3 == 25) {
				field722 = true;
			} else if (var3 == 28) {
				field718 = arg0.method216();
			} else if (var3 == 29) {
				field719 = arg0.method217();
			} else if (var3 == 39) {
				field720 = arg0.method217();
			} else if (var3 >= 30 && var3 < 39) {
				if (field721 == null) {
					field721 = new String[5];
				}

				field721[var3 - 30] = arg0.method223();
				if (field721[var3 - 30].equalsIgnoreCase("hidden")) {
					field721[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg0.method216();
				field707 = new int[var6];
				field708 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field707[var7] = arg0.method218();
					field708[var7] = arg0.method218();
				}
			} else if (var3 == 60) {
				field723 = arg0.method218();
			} else if (var3 == 62) {
				field725 = true;
			} else if (var3 == 64) {
				field726 = false;
			} else if (var3 == 65) {
				field727 = arg0.method218();
			} else if (var3 == 66) {
				field728 = arg0.method218();
			} else if (var3 == 67) {
				field729 = arg0.method218();
			} else if (var3 == 68) {
				field724 = arg0.method218();
			} else if (var3 == 69) {
				field733 = arg0.method216();
			} else if (var3 == 70) {
				field730 = arg0.method219();
			} else if (var3 == 71) {
				field731 = arg0.method219();
			} else if (var3 == 72) {
				field732 = arg0.method219();
			} else if (var3 == 73) {
				field734 = true;
			}
		}
	}

	@ObfuscatedName("ac.a(IIIIIII)Leb;")
	public final class31 method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field704.length; var9++) {
			if (field704[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field702 << 6) + (var8 << 3) + arg1);
		if (field696) {
			var10 = 0L;
		}

		class31 var12 = (class31) field736.method103(var10);
		if (var12 == null) {
			if (var8 >= field703.length) {
				return null;
			}

			int var20 = field703[var8];
			if (var20 == -1) {
				return null;
			}

			boolean var21 = field725 ^ arg1 > 3;
			if (var21) {
				var20 += 0x10000;
			}

			class31 var22 = (class31) field735.method103(var20);
			if (var22 == null) {
				var22 = new class31(var20 & 0xFFFF);
				if (var21) {
					var22.method135();
				}

				field735.method104(var22, var20);
			}

			boolean var23;
			if (field727 == 128 && field728 == 128 && field729 == 128) {
				var23 = false;
			} else {
				var23 = true;
			}

			boolean var24;
			if (field730 == 0 && field731 == 0 && field732 == 0) {
				var24 = false;
			} else {
				var24 = true;
			}

			class31 var25 = new class31(!field722, field707 == null, var22, arg1 == 0 && arg6 == -1 && !var23 && !var24);
			if (arg6 != -1) {
				var25.method127();
				var25.method128(arg6);
				var25.field435 = null;
				var25.field434 = null;
			}

			while (arg1-- > 0) {
				var25.method131();
			}

			if (field707 != null) {
				for (int var26 = 0; var26 < field707.length; var26++) {
					var25.method134(field707[var26], field708[var26]);
				}
			}

			if (var23) {
				var25.method136(field728, field727, field729);
			}

			if (var24) {
				var25.method133(field732, field731, field730);
			}

			var25.method137(field719 + 64, field720 * 5 + 768, -50, -10, -50, !field715);

			if (field711) {
				var25.field431 = var25.field427;
			}

			field736.method104(var25, var10);

			if (field714 || field715) {
				var25 = new class31(field715, var25, field714);
			}

			if (field714) {
				int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var28 = 0; var28 < var25.field402; var28++) {
					int var29 = var25.field403[var28];
					int var30 = var25.field405[var28];
					int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
					int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
					int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
					var25.field404[var28] += var33 - var27;
				}

				var25.method125();
			}

			return var25;
		} else if (field696) {
			return var12;
		} else {
			if (field714 || field715) {
				var12 = new class31(field715, var12, field714);
			}

			if (field714) {
				int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var14 = 0; var14 < var12.field402; var14++) {
					int var15 = var12.field403[var14];
					int var16 = var12.field405[var14];
					int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
					int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
					int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
					var12.field404[var14] += var19 - var13;
				}

				var12.method125();
			}

			return var12;
		}
	}
}
