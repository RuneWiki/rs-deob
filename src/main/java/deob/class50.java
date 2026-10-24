package deob;

@ObfuscatedName("xb")
public final class class50 {

	@ObfuscatedName("xb.c")
	public static boolean field647;

	@ObfuscatedName("xb.d")
	public static int field648;

	@ObfuscatedName("xb.e")
	public static int[] field649;

	@ObfuscatedName("xb.f")
	public static class37 field650;

	@ObfuscatedName("xb.g")
	public static class50[] field651;

	@ObfuscatedName("xb.h")
	public static int field652;

	@ObfuscatedName("xb.i")
	public int field653 = -1;

	@ObfuscatedName("xb.j")
	public int[] field654;

	@ObfuscatedName("xb.k")
	public int[] field655;

	@ObfuscatedName("xb.l")
	public String field656;

	@ObfuscatedName("xb.m")
	public byte[] field657;

	@ObfuscatedName("xb.n")
	public int[] field658;

	@ObfuscatedName("xb.o")
	public int[] field659;

	@ObfuscatedName("xb.p")
	public int field660;

	@ObfuscatedName("xb.q")
	public int field661;

	@ObfuscatedName("xb.r")
	public boolean field662;

	@ObfuscatedName("xb.s")
	public boolean field663;

	@ObfuscatedName("xb.t")
	public boolean field664;

	@ObfuscatedName("xb.u")
	public boolean field665;

	@ObfuscatedName("xb.v")
	public boolean field666;

	@ObfuscatedName("xb.w")
	public boolean field667;

	@ObfuscatedName("xb.x")
	public int field668;

	@ObfuscatedName("xb.y")
	public int field669;

	@ObfuscatedName("xb.z")
	public byte field670;

	@ObfuscatedName("xb.P")
	public static class19 field686 = new class19(500);

	@ObfuscatedName("xb.Q")
	public static class19 field687 = new class19(30);

	@ObfuscatedName("xb.A")
	public byte field671;

	@ObfuscatedName("xb.D")
	public int field674;

	@ObfuscatedName("xb.E")
	public int field675;

	@ObfuscatedName("xb.H")
	public int field678;

	@ObfuscatedName("xb.I")
	public int field679;

	@ObfuscatedName("xb.J")
	public int field680;

	@ObfuscatedName("xb.K")
	public int field681;

	@ObfuscatedName("xb.L")
	public int field682;

	@ObfuscatedName("xb.M")
	public int field683;

	@ObfuscatedName("xb.N")
	public int field684;

	@ObfuscatedName("xb.C")
	public boolean field673;

	@ObfuscatedName("xb.F")
	public boolean field676;

	@ObfuscatedName("xb.G")
	public boolean field677;

	@ObfuscatedName("xb.O")
	public boolean field685;

	@ObfuscatedName("xb.B")
	public String[] field672;

	@ObfuscatedName("xb.a(Lub;)V")
	public static final void method251(class47 arg0) {
		field650 = new class37(arg0.method242(null, "loc.dat"));
		class37 var1 = new class37(arg0.method242(null, "loc.idx"));
		field648 = var1.method203();
		field649 = new int[field648];
		int var2 = 2;
		for (int var3 = 0; var3 < field648; var3++) {
			field649[var3] = var2;
			var2 += var1.method203();
		}

		field651 = new class50[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field651[var4] = new class50();
		}
	}

	@ObfuscatedName("xb.a(I)V")
	public static final void method252() {
		field686 = null;
		field687 = null;
		field649 = null;
		field651 = null;
		field650 = null;
	}

	@ObfuscatedName("xb.b(I)Lxb;")
	public static final class50 method253(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field651[var1].field653 == arg0) {
				return field651[var1];
			}
		}

		field652 = (field652 + 1) % 10;
		class50 var2 = field651[field652];
		field650.field537 = field649[arg0];
		var2.field653 = arg0;
		var2.method254();
		var2.method255(field650);
		return var2;
	}

	@ObfuscatedName("xb.a()V")
	public final void method254() {
		field654 = null;
		field655 = null;
		field656 = null;
		field657 = null;
		field658 = null;
		field659 = null;
		field660 = 1;
		field661 = 1;
		field662 = true;
		field663 = true;
		field664 = false;
		field665 = false;
		field666 = false;
		field667 = false;
		field668 = -1;
		field669 = 16;
		field670 = 0;
		field671 = 0;
		field672 = null;
		field673 = false;
		field674 = -1;
		field675 = -1;
		field676 = false;
		field677 = true;
		field678 = 128;
		field679 = 128;
		field680 = 128;
		field684 = 0;
		field681 = 0;
		field682 = 0;
		field683 = 0;
		field685 = false;
	}

	@ObfuscatedName("xb.a(ILkb;)V")
	public final void method255(class37 arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method201();
			if (var3 == 0) {
				if (field655 == null) {
					field655 = new int[0];
				}

				if (var2 == -1) {
					field664 = false;
					if (field655.length > 0 && field655[0] == 10) {
						field664 = true;
					}

					if (field672 != null) {
						field664 = true;
						return;
					}
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method201();
				field655 = new int[var4];
				field654 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field654[var5] = arg0.method203();
					field655[var5] = arg0.method201();
				}
			} else if (var3 == 2) {
				field656 = arg0.method208();
			} else if (var3 == 3) {
				field657 = arg0.method209();
			} else if (var3 == 14) {
				field660 = arg0.method201();
			} else if (var3 == 15) {
				field661 = arg0.method201();
			} else if (var3 == 17) {
				field662 = false;
			} else if (var3 == 18) {
				field663 = false;
			} else if (var3 == 19) {
				var2 = arg0.method201();
				if (var2 == 1) {
					field664 = true;
				}
			} else if (var3 == 21) {
				field665 = true;
			} else if (var3 == 22) {
				field666 = true;
			} else if (var3 == 23) {
				field667 = true;
			} else if (var3 == 24) {
				field668 = arg0.method203();
				if (field668 == 0xFFFF) {
					field668 = -1;
				}
			} else if (var3 == 25) {
				field673 = true;
			} else if (var3 == 28) {
				field669 = arg0.method201();
			} else if (var3 == 29) {
				field670 = arg0.method202();
			} else if (var3 == 39) {
				field671 = arg0.method202();
			} else if (var3 >= 30 && var3 < 39) {
				if (field672 == null) {
					field672 = new String[5];
				}

				field672[var3 - 30] = arg0.method208();
			} else if (var3 == 40) {
				int var6 = arg0.method201();
				field658 = new int[var6];
				field659 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field658[var7] = arg0.method203();
					field659[var7] = arg0.method203();
				}
			} else if (var3 == 60) {
				field674 = arg0.method203();
			} else if (var3 == 62) {
				field676 = true;
			} else if (var3 == 64) {
				field677 = false;
			} else if (var3 == 65) {
				field678 = arg0.method203();
			} else if (var3 == 66) {
				field679 = arg0.method203();
			} else if (var3 == 67) {
				field680 = arg0.method203();
			} else if (var3 == 68) {
				field675 = arg0.method203();
			} else if (var3 == 69) {
				field684 = arg0.method201();
			} else if (var3 == 70) {
				field681 = arg0.method204();
			} else if (var3 == 71) {
				field682 = arg0.method204();
			} else if (var3 == 72) {
				field683 = arg0.method204();
			} else if (var3 == 73) {
				field685 = true;
			}
		}
	}

	@ObfuscatedName("xb.a(IIIIIII)Leb;")
	public final class31 method256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field655.length; var9++) {
			if (field655[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field653 << 6) + (var8 << 3) + arg1);
		if (field647) {
			var10 = 0L;
		}

		if (!field665 && !field666) {
			class31 var12 = (class31) field687.method99(var10);
			if (var12 != null) {
				return var12;
			}
		}

		if (var8 >= field654.length) {
			return null;
		}

		int var13 = field654[var8];
		if (var13 == -1) {
			return null;
		}

		boolean var14 = field676 ^ arg1 > 3;
		if (var14) {
			var13 += 0x10000;
		}

		class31 var15 = (class31) field686.method99(var13);
		if (var15 == null) {
			var15 = new class31(var13 & 0xFFFF);
			if (var14) {
				var15.method130();
			}

			field686.method100(var13, var15);
		}

		boolean var16;
		if (field678 == 128 && field679 == 128 && field680 == 128) {
			var16 = false;
		} else {
			var16 = true;
		}

		boolean var17;
		if (field681 == 0 && field682 == 0 && field683 == 0) {
			var17 = false;
		} else {
			var17 = true;
		}

		class31 var18 = new class31(!field666, var15, field658 == null, arg1 == 0 && !field665 && arg6 == -1 && !var16 && !var17, !field673);
		if (arg6 != -1) {
			var18.method122();
			var18.method123(arg6);
			var18.field430 = null;
			var18.field429 = null;
		}

		while (arg1-- > 0) {
			var18.method126();
		}

		if (field658 != null) {
			for (int var19 = 0; var19 < field658.length; var19++) {
				var18.method129(field658[var19], field659[var19]);
			}
		}

		if (var16) {
			var18.method131(field678, field679, field680);
		}

		if (field665) {
			int var20 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var21 = 0; var21 < var18.field397; var21++) {
				int var22 = var18.field398[var21];
				int var23 = var18.field400[var21];
				int var24 = (arg3 - arg2) * (var22 + 64) / 128 + arg2;
				int var25 = (arg4 - arg5) * (var22 + 64) / 128 + arg5;
				int var26 = (var25 - var24) * (var23 + 64) / 128 + var24;
				var18.field399[var21] += var26 - var20;
			}
		}

		if (var17) {
			var18.method128(field683, field681, field682);
		}

		var18.method132(field670 + 64, field671 * 5 + 768, -50, -10, -50, !field666);

		if (field662) {
			var18.field426 = var18.field422;
		}

		if (!field665 && !field666) {
			field687.method100(var10, var18);
		}

		return var18;
	}
}
