package deob;

@ObfuscatedName("ac")
public final class class53 {

	@ObfuscatedName("ac.a")
	public static boolean field697;

	@ObfuscatedName("ac.b")
	public static int field698;

	@ObfuscatedName("ac.c")
	public static int[] field699;

	@ObfuscatedName("ac.d")
	public static class37 field700;

	@ObfuscatedName("ac.e")
	public static class53[] field701;

	@ObfuscatedName("ac.f")
	public static int field702;

	@ObfuscatedName("ac.g")
	public int field703 = -1;

	@ObfuscatedName("ac.h")
	public int[] field704;

	@ObfuscatedName("ac.i")
	public int[] field705;

	@ObfuscatedName("ac.j")
	public String field706;

	@ObfuscatedName("ac.k")
	public byte[] field707;

	@ObfuscatedName("ac.l")
	public int[] field708;

	@ObfuscatedName("ac.m")
	public int[] field709;

	@ObfuscatedName("ac.n")
	public int field710;

	@ObfuscatedName("ac.o")
	public int field711;

	@ObfuscatedName("ac.p")
	public boolean field712;

	@ObfuscatedName("ac.q")
	public boolean field713;

	@ObfuscatedName("ac.r")
	public boolean field714;

	@ObfuscatedName("ac.s")
	public boolean field715;

	@ObfuscatedName("ac.t")
	public boolean field716;

	@ObfuscatedName("ac.u")
	public boolean field717;

	@ObfuscatedName("ac.v")
	public int field718;

	@ObfuscatedName("ac.w")
	public int field719;

	@ObfuscatedName("ac.x")
	public byte field720;

	@ObfuscatedName("ac.y")
	public byte field721;

	@ObfuscatedName("ac.z")
	public String[] field722;

	@ObfuscatedName("ac.N")
	public static class19 field736 = new class19(500);

	@ObfuscatedName("ac.O")
	public static class19 field737 = new class19(30);

	@ObfuscatedName("ac.B")
	public int field724;

	@ObfuscatedName("ac.C")
	public int field725;

	@ObfuscatedName("ac.F")
	public int field728;

	@ObfuscatedName("ac.G")
	public int field729;

	@ObfuscatedName("ac.H")
	public int field730;

	@ObfuscatedName("ac.I")
	public int field731;

	@ObfuscatedName("ac.J")
	public int field732;

	@ObfuscatedName("ac.K")
	public int field733;

	@ObfuscatedName("ac.L")
	public int field734;

	@ObfuscatedName("ac.A")
	public boolean field723;

	@ObfuscatedName("ac.D")
	public boolean field726;

	@ObfuscatedName("ac.E")
	public boolean field727;

	@ObfuscatedName("ac.M")
	public boolean field735;

	@ObfuscatedName("ac.a(Lub;)V")
	public static final void method273(class47 arg0) {
		field700 = new class37(arg0.method250("loc.dat", null));
		class37 var1 = new class37(arg0.method250("loc.idx", null));
		field698 = var1.method211();
		field699 = new int[field698];
		int var2 = 2;
		for (int var3 = 0; var3 < field698; var3++) {
			field699[var3] = var2;
			var2 += var1.method211();
		}

		field701 = new class53[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field701[var4] = new class53();
		}
	}

	@ObfuscatedName("ac.a(B)V")
	public static final void method274() {
		field736 = null;
		field737 = null;
		field699 = null;
		field701 = null;
		field700 = null;
	}

	@ObfuscatedName("ac.a(I)Lac;")
	public static final class53 method275(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field701[var1].field703 == arg0) {
				return field701[var1];
			}
		}

		field702 = (field702 + 1) % 10;
		class53 var2 = field701[field702];
		field700.field542 = field699[arg0];
		var2.field703 = arg0;
		var2.method276();
		var2.method277(field700);
		return var2;
	}

	@ObfuscatedName("ac.a()V")
	public final void method276() {
		field704 = null;
		field705 = null;
		field706 = null;
		field707 = null;
		field708 = null;
		field709 = null;
		field710 = 1;
		field711 = 1;
		field712 = true;
		field713 = true;
		field714 = false;
		field715 = false;
		field716 = false;
		field717 = false;
		field718 = -1;
		field719 = 16;
		field720 = 0;
		field721 = 0;
		field722 = null;
		field723 = false;
		field724 = -1;
		field725 = -1;
		field726 = false;
		field727 = true;
		field728 = 128;
		field729 = 128;
		field730 = 128;
		field734 = 0;
		field731 = 0;
		field732 = 0;
		field733 = 0;
		field735 = false;
	}

	@ObfuscatedName("ac.a(Lkb;I)V")
	public final void method277(class37 arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method209();
			if (var3 == 0) {
				if (field705 == null) {
					field705 = new int[0];
				}

				if (var2 == -1) {
					field714 = false;
					if (field705.length > 0 && field705[0] == 10) {
						field714 = true;
					}

					if (field722 != null) {
						field714 = true;
						return;
					}
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method209();
				field705 = new int[var4];
				field704 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field704[var5] = arg0.method211();
					field705[var5] = arg0.method209();
				}
			} else if (var3 == 2) {
				field706 = arg0.method216();
			} else if (var3 == 3) {
				field707 = arg0.method217();
			} else if (var3 == 14) {
				field710 = arg0.method209();
			} else if (var3 == 15) {
				field711 = arg0.method209();
			} else if (var3 == 17) {
				field712 = false;
			} else if (var3 == 18) {
				field713 = false;
			} else if (var3 == 19) {
				var2 = arg0.method209();
				if (var2 == 1) {
					field714 = true;
				}
			} else if (var3 == 21) {
				field715 = true;
			} else if (var3 == 22) {
				field716 = true;
			} else if (var3 == 23) {
				field717 = true;
			} else if (var3 == 24) {
				field718 = arg0.method211();
				if (field718 == 0xFFFF) {
					field718 = -1;
				}
			} else if (var3 == 25) {
				field723 = true;
			} else if (var3 == 28) {
				field719 = arg0.method209();
			} else if (var3 == 29) {
				field720 = arg0.method210();
			} else if (var3 == 39) {
				field721 = arg0.method210();
			} else if (var3 >= 30 && var3 < 39) {
				if (field722 == null) {
					field722 = new String[5];
				}

				field722[var3 - 30] = arg0.method216();
				if (field722[var3 - 30].equalsIgnoreCase("hidden")) {
					field722[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg0.method209();
				field708 = new int[var6];
				field709 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field708[var7] = arg0.method211();
					field709[var7] = arg0.method211();
				}
			} else if (var3 == 60) {
				field724 = arg0.method211();
			} else if (var3 == 62) {
				field726 = true;
			} else if (var3 == 64) {
				field727 = false;
			} else if (var3 == 65) {
				field728 = arg0.method211();
			} else if (var3 == 66) {
				field729 = arg0.method211();
			} else if (var3 == 67) {
				field730 = arg0.method211();
			} else if (var3 == 68) {
				field725 = arg0.method211();
			} else if (var3 == 69) {
				field734 = arg0.method209();
			} else if (var3 == 70) {
				field731 = arg0.method212();
			} else if (var3 == 71) {
				field732 = arg0.method212();
			} else if (var3 == 72) {
				field733 = arg0.method212();
			} else if (var3 == 73) {
				field735 = true;
			}
		}
	}

	@ObfuscatedName("ac.a(IIIIIII)Leb;")
	public final class31 method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field705.length; var9++) {
			if (field705[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field703 << 6) + (var8 << 3) + arg1);
		if (field697) {
			var10 = 0L;
		}

		class31 var12 = (class31) field737.method102(var10);
		if (var12 == null) {
			if (var8 >= field704.length) {
				return null;
			}

			int var20 = field704[var8];
			if (var20 == -1) {
				return null;
			}

			boolean var21 = field726 ^ arg1 > 3;
			if (var21) {
				var20 += 0x10000;
			}

			class31 var22 = (class31) field736.method102(var20);
			if (var22 == null) {
				var22 = new class31(var20 & 0xFFFF);
				if (var21) {
					var22.method134();
				}

				field736.method103(var20, var22);
			}

			boolean var23;
			if (field728 == 128 && field729 == 128 && field730 == 128) {
				var23 = false;
			} else {
				var23 = true;
			}

			boolean var24;
			if (field731 == 0 && field732 == 0 && field733 == 0) {
				var24 = false;
			} else {
				var24 = true;
			}

			class31 var25 = new class31(!field723, arg1 == 0 && arg6 == -1 && !var23 && !var24, var22, field708 == null);
			if (arg6 != -1) {
				var25.method126();
				var25.method127(arg6);
				var25.field435 = null;
				var25.field434 = null;
			}

			while (arg1-- > 0) {
				var25.method130();
			}

			if (field708 != null) {
				for (int var26 = 0; var26 < field708.length; var26++) {
					var25.method133(field708[var26], field709[var26]);
				}
			}

			if (var23) {
				var25.method135(field730, field728, field729);
			}

			if (var24) {
				var25.method132(field731, field732, field733);
			}

			var25.method136(field720 + 64, field721 * 5 + 768, -50, -10, -50, !field716);

			if (field712) {
				var25.field431 = var25.field427;
			}

			field737.method103(var10, var25);

			if (field715 || field716) {
				var25 = new class31(field715, field716, var25);
			}

			if (field715) {
				int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var28 = 0; var28 < var25.field402; var28++) {
					int var29 = var25.field403[var28];
					int var30 = var25.field405[var28];
					int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
					int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
					int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
					var25.field404[var28] += var33 - var27;
				}

				var25.method124();
			}

			return var25;
		} else if (field697) {
			return var12;
		} else {
			if (field715 || field716) {
				var12 = new class31(field715, field716, var12);
			}

			if (field715) {
				int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var14 = 0; var14 < var12.field402; var14++) {
					int var15 = var12.field403[var14];
					int var16 = var12.field405[var14];
					int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
					int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
					int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
					var12.field404[var14] += var19 - var13;
				}

				var12.method124();
			}

			return var12;
		}
	}
}
