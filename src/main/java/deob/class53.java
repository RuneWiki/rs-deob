package deob;

@ObfuscatedName("ac")
public final class class53 {

	@ObfuscatedName("ac.c")
	public static boolean field693;

	@ObfuscatedName("ac.d")
	public static int field694;

	@ObfuscatedName("ac.e")
	public static int[] field695;

	@ObfuscatedName("ac.f")
	public static class37 field696;

	@ObfuscatedName("ac.g")
	public static class53[] field697;

	@ObfuscatedName("ac.h")
	public static int field698;

	@ObfuscatedName("ac.i")
	public int field699 = -1;

	@ObfuscatedName("ac.j")
	public int[] field700;

	@ObfuscatedName("ac.k")
	public int[] field701;

	@ObfuscatedName("ac.l")
	public String field702;

	@ObfuscatedName("ac.m")
	public byte[] field703;

	@ObfuscatedName("ac.n")
	public int[] field704;

	@ObfuscatedName("ac.o")
	public int[] field705;

	@ObfuscatedName("ac.p")
	public int field706;

	@ObfuscatedName("ac.q")
	public int field707;

	@ObfuscatedName("ac.r")
	public boolean field708;

	@ObfuscatedName("ac.s")
	public boolean field709;

	@ObfuscatedName("ac.t")
	public boolean field710;

	@ObfuscatedName("ac.u")
	public boolean field711;

	@ObfuscatedName("ac.v")
	public boolean field712;

	@ObfuscatedName("ac.w")
	public boolean field713;

	@ObfuscatedName("ac.x")
	public int field714;

	@ObfuscatedName("ac.y")
	public int field715;

	@ObfuscatedName("ac.z")
	public byte field716;

	@ObfuscatedName("ac.P")
	public static class19 field732 = new class19(500);

	@ObfuscatedName("ac.Q")
	public static class19 field733 = new class19(30);

	@ObfuscatedName("ac.A")
	public byte field717;

	@ObfuscatedName("ac.D")
	public int field720;

	@ObfuscatedName("ac.E")
	public int field721;

	@ObfuscatedName("ac.H")
	public int field724;

	@ObfuscatedName("ac.I")
	public int field725;

	@ObfuscatedName("ac.J")
	public int field726;

	@ObfuscatedName("ac.K")
	public int field727;

	@ObfuscatedName("ac.L")
	public int field728;

	@ObfuscatedName("ac.M")
	public int field729;

	@ObfuscatedName("ac.N")
	public int field730;

	@ObfuscatedName("ac.C")
	public boolean field719;

	@ObfuscatedName("ac.F")
	public boolean field722;

	@ObfuscatedName("ac.G")
	public boolean field723;

	@ObfuscatedName("ac.O")
	public boolean field731;

	@ObfuscatedName("ac.B")
	public String[] field718;

	@ObfuscatedName("ac.a(Lub;)V")
	public static final void method273(class47 arg0) {
		field696 = new class37(arg0.method250(null, "loc.dat"));
		class37 var1 = new class37(arg0.method250(null, "loc.idx"));
		field694 = var1.method211();
		field695 = new int[field694];
		int var2 = 2;
		for (int var3 = 0; var3 < field694; var3++) {
			field695[var3] = var2;
			var2 += var1.method211();
		}

		field697 = new class53[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field697[var4] = new class53();
		}
	}

	@ObfuscatedName("ac.a(Z)V")
	public static final void method274() {
		field732 = null;
		field733 = null;
		field695 = null;
		field697 = null;
		field696 = null;
	}

	@ObfuscatedName("ac.a(I)Lac;")
	public static final class53 method275(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field697[var1].field699 == arg0) {
				return field697[var1];
			}
		}

		field698 = (field698 + 1) % 10;
		class53 var2 = field697[field698];
		field696.field540 = field695[arg0];
		var2.field699 = arg0;
		var2.method276();
		var2.method277(field696);
		return var2;
	}

	@ObfuscatedName("ac.a()V")
	public final void method276() {
		field700 = null;
		field701 = null;
		field702 = null;
		field703 = null;
		field704 = null;
		field705 = null;
		field706 = 1;
		field707 = 1;
		field708 = true;
		field709 = true;
		field710 = false;
		field711 = false;
		field712 = false;
		field713 = false;
		field714 = -1;
		field715 = 16;
		field716 = 0;
		field717 = 0;
		field718 = null;
		field719 = false;
		field720 = -1;
		field721 = -1;
		field722 = false;
		field723 = true;
		field724 = 128;
		field725 = 128;
		field726 = 128;
		field730 = 0;
		field727 = 0;
		field728 = 0;
		field729 = 0;
		field731 = false;
	}

	@ObfuscatedName("ac.a(Lkb;B)V")
	public final void method277(class37 arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method209();
			if (var3 == 0) {
				if (field701 == null) {
					field701 = new int[0];
				}

				if (var2 == -1) {
					field710 = false;
					if (field701.length > 0 && field701[0] == 10) {
						field710 = true;
					}

					if (field718 != null) {
						field710 = true;
						return;
					}
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method209();
				field701 = new int[var4];
				field700 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field700[var5] = arg0.method211();
					field701[var5] = arg0.method209();
				}
			} else if (var3 == 2) {
				field702 = arg0.method216();
			} else if (var3 == 3) {
				field703 = arg0.method217();
			} else if (var3 == 14) {
				field706 = arg0.method209();
			} else if (var3 == 15) {
				field707 = arg0.method209();
			} else if (var3 == 17) {
				field708 = false;
			} else if (var3 == 18) {
				field709 = false;
			} else if (var3 == 19) {
				var2 = arg0.method209();
				if (var2 == 1) {
					field710 = true;
				}
			} else if (var3 == 21) {
				field711 = true;
			} else if (var3 == 22) {
				field712 = true;
			} else if (var3 == 23) {
				field713 = true;
			} else if (var3 == 24) {
				field714 = arg0.method211();
				if (field714 == 0xFFFF) {
					field714 = -1;
				}
			} else if (var3 == 25) {
				field719 = true;
			} else if (var3 == 28) {
				field715 = arg0.method209();
			} else if (var3 == 29) {
				field716 = arg0.method210();
			} else if (var3 == 39) {
				field717 = arg0.method210();
			} else if (var3 >= 30 && var3 < 39) {
				if (field718 == null) {
					field718 = new String[5];
				}

				field718[var3 - 30] = arg0.method216();
				if (field718[var3 - 30].equalsIgnoreCase("hidden")) {
					field718[var3 - 30] = null;
				}
			} else if (var3 == 40) {
				int var6 = arg0.method209();
				field704 = new int[var6];
				field705 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field704[var7] = arg0.method211();
					field705[var7] = arg0.method211();
				}
			} else if (var3 == 60) {
				field720 = arg0.method211();
			} else if (var3 == 62) {
				field722 = true;
			} else if (var3 == 64) {
				field723 = false;
			} else if (var3 == 65) {
				field724 = arg0.method211();
			} else if (var3 == 66) {
				field725 = arg0.method211();
			} else if (var3 == 67) {
				field726 = arg0.method211();
			} else if (var3 == 68) {
				field721 = arg0.method211();
			} else if (var3 == 69) {
				field730 = arg0.method209();
			} else if (var3 == 70) {
				field727 = arg0.method212();
			} else if (var3 == 71) {
				field728 = arg0.method212();
			} else if (var3 == 72) {
				field729 = arg0.method212();
			} else if (var3 == 73) {
				field731 = true;
			}
		}
	}

	@ObfuscatedName("ac.a(IIIIIII)Leb;")
	public final class31 method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field701.length; var9++) {
			if (field701[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field699 << 6) + (var8 << 3) + arg1);
		if (field693) {
			var10 = 0L;
		}

		class31 var12 = (class31) field733.method102(var10);
		if (var12 == null) {
			if (var8 >= field700.length) {
				return null;
			}

			int var20 = field700[var8];
			if (var20 == -1) {
				return null;
			}

			boolean var21 = field722 ^ arg1 > 3;
			if (var21) {
				var20 += 0x10000;
			}

			class31 var22 = (class31) field732.method102(var20);
			if (var22 == null) {
				var22 = new class31(var20 & 0xFFFF);
				if (var21) {
					var22.method134();
				}

				field732.method103(var22, var20);
			}

			boolean var23;
			if (field724 == 128 && field725 == 128 && field726 == 128) {
				var23 = false;
			} else {
				var23 = true;
			}

			boolean var24;
			if (field727 == 0 && field728 == 0 && field729 == 0) {
				var24 = false;
			} else {
				var24 = true;
			}

			class31 var25 = new class31(var22, !field719, arg1 == 0 && arg6 == -1 && !var23 && !var24, field704 == null);
			if (arg6 != -1) {
				var25.method126();
				var25.method127(arg6);
				var25.field433 = null;
				var25.field432 = null;
			}

			while (arg1-- > 0) {
				var25.method130();
			}

			if (field704 != null) {
				for (int var26 = 0; var26 < field704.length; var26++) {
					var25.method133(field704[var26], field705[var26]);
				}
			}

			if (var23) {
				var25.method135(field724, field726, field725);
			}

			if (var24) {
				var25.method132(field729, field727, field728);
			}

			var25.method136(field716 + 64, field717 * 5 + 768, -50, -10, -50, !field712);

			if (field708) {
				var25.field429 = var25.field425;
			}

			field733.method103(var25, var10);

			if (field711 || field712) {
				var25 = new class31(var25, field711, field712);
			}

			if (field711) {
				int var27 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var28 = 0; var28 < var25.field400; var28++) {
					int var29 = var25.field401[var28];
					int var30 = var25.field403[var28];
					int var31 = (arg3 - arg2) * (var29 + 64) / 128 + arg2;
					int var32 = (arg4 - arg5) * (var29 + 64) / 128 + arg5;
					int var33 = (var32 - var31) * (var30 + 64) / 128 + var31;
					var25.field402[var28] += var33 - var27;
				}

				var25.method124();
			}

			return var25;
		} else if (field693) {
			return var12;
		} else {
			if (field711 || field712) {
				var12 = new class31(var12, field711, field712);
			}

			if (field711) {
				int var13 = (arg2 + arg3 + arg4 + arg5) / 4;
				for (int var14 = 0; var14 < var12.field400; var14++) {
					int var15 = var12.field401[var14];
					int var16 = var12.field403[var14];
					int var17 = (arg3 - arg2) * (var15 + 64) / 128 + arg2;
					int var18 = (arg4 - arg5) * (var15 + 64) / 128 + arg5;
					int var19 = (var18 - var17) * (var16 + 64) / 128 + var17;
					var12.field402[var14] += var19 - var13;
				}

				var12.method124();
			}

			return var12;
		}
	}
}
