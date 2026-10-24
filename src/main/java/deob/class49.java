package deob;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.c")
	public static int field635;

	@ObfuscatedName("wb.d")
	public static int[] field636;

	@ObfuscatedName("wb.e")
	public static class36 field637;

	@ObfuscatedName("wb.f")
	public static class49[] field638;

	@ObfuscatedName("wb.g")
	public static int field639;

	@ObfuscatedName("wb.h")
	public int field640 = -1;

	@ObfuscatedName("wb.i")
	public int[] field641;

	@ObfuscatedName("wb.j")
	public int[] field642;

	@ObfuscatedName("wb.k")
	public String field643;

	@ObfuscatedName("wb.l")
	public byte[] field644;

	@ObfuscatedName("wb.m")
	public int[] field645;

	@ObfuscatedName("wb.n")
	public int[] field646;

	@ObfuscatedName("wb.o")
	public int field647;

	@ObfuscatedName("wb.p")
	public int field648;

	@ObfuscatedName("wb.q")
	public boolean field649;

	@ObfuscatedName("wb.r")
	public boolean field650;

	@ObfuscatedName("wb.s")
	public boolean field651;

	@ObfuscatedName("wb.t")
	public boolean field652;

	@ObfuscatedName("wb.u")
	public boolean field653;

	@ObfuscatedName("wb.v")
	public boolean field654;

	@ObfuscatedName("wb.w")
	public int field655;

	@ObfuscatedName("wb.x")
	public int field656;

	@ObfuscatedName("wb.y")
	public byte field657;

	@ObfuscatedName("wb.z")
	public byte field658;

	@ObfuscatedName("wb.K")
	public static class18 field669 = new class18(500);

	@ObfuscatedName("wb.L")
	public static class18 field670 = new class18(30);

	@ObfuscatedName("wb.C")
	public int field661;

	@ObfuscatedName("wb.D")
	public int field662;

	@ObfuscatedName("wb.G")
	public int field665;

	@ObfuscatedName("wb.H")
	public int field666;

	@ObfuscatedName("wb.I")
	public int field667;

	@ObfuscatedName("wb.J")
	public int field668;

	@ObfuscatedName("wb.B")
	public boolean field660;

	@ObfuscatedName("wb.E")
	public boolean field663;

	@ObfuscatedName("wb.F")
	public boolean field664;

	@ObfuscatedName("wb.A")
	public String[] field659;

	@ObfuscatedName("wb.a(Ltb;)V")
	public static final void method235(class46 arg0) {
		field637 = new class36(arg0.method225(null, "loc.dat"));
		class36 var1 = new class36(arg0.method225(null, "loc.idx"));
		field635 = var1.method187();
		field636 = new int[field635];
		int var2 = 2;
		for (int var3 = 0; var3 < field635; var3++) {
			field636[var3] = var2;
			var2 += var1.method187();
		}

		field638 = new class49[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field638[var4] = new class49();
		}
	}

	@ObfuscatedName("wb.a(I)V")
	public static final void method236() {
		field669 = null;
		field670 = null;
		field636 = null;
		field638 = null;
		field637 = null;
	}

	@ObfuscatedName("wb.b(I)Lwb;")
	public static final class49 method237(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field638[var1].field640 == arg0) {
				return field638[var1];
			}
		}

		field639 = (field639 + 1) % 10;
		class49 var2 = field638[field639];
		field637.field525 = field636[arg0];
		var2.field640 = arg0;
		var2.method238();
		var2.method239(field637);
		return var2;
	}

	@ObfuscatedName("wb.a()V")
	public final void method238() {
		field641 = null;
		field642 = null;
		field643 = null;
		field644 = null;
		field645 = null;
		field646 = null;
		field647 = 1;
		field648 = 1;
		field649 = true;
		field650 = true;
		field651 = false;
		field652 = false;
		field653 = false;
		field654 = false;
		field655 = -1;
		field656 = 16;
		field657 = 0;
		field658 = 0;
		field659 = null;
		field660 = false;
		field661 = -1;
		field662 = -1;
		field663 = false;
		field664 = true;
		field665 = 128;
		field666 = 128;
		field667 = 128;
		field668 = 0;
	}

	@ObfuscatedName("wb.a(BLjb;)V")
	public final void method239(class36 arg0) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method185();
			if (var3 == 0) {
				if (field642 == null) {
					field642 = new int[0];
				}

				if (var2 == -1) {
					field651 = false;
					if (field642.length > 0 && field642[0] == 10) {
						field651 = true;
					}

					if (field659 != null) {
						field651 = true;
					}
				}

				return;
			}

			if (var3 == 1) {
				int var4 = arg0.method185();
				field642 = new int[var4];
				field641 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field641[var5] = arg0.method187();
					field642[var5] = arg0.method185();
				}
			} else if (var3 == 2) {
				field643 = arg0.method192();
			} else if (var3 == 3) {
				field644 = arg0.method193();
			} else if (var3 == 14) {
				field647 = arg0.method185();
			} else if (var3 == 15) {
				field648 = arg0.method185();
			} else if (var3 == 17) {
				field649 = false;
			} else if (var3 == 18) {
				field650 = false;
			} else if (var3 == 19) {
				var2 = arg0.method185();
				if (var2 == 1) {
					field651 = true;
				}
			} else if (var3 == 21) {
				field652 = true;
			} else if (var3 == 22) {
				field653 = true;
			} else if (var3 == 23) {
				field654 = true;
			} else if (var3 == 24) {
				field655 = arg0.method187();
				if (field655 == 0xFFFF) {
					field655 = -1;
				}
			} else if (var3 == 25) {
				field660 = true;
			} else if (var3 == 28) {
				field656 = arg0.method185();
			} else if (var3 == 29) {
				field657 = arg0.method186();
			} else if (var3 == 39) {
				field658 = arg0.method186();
			} else if (var3 >= 30 && var3 < 39) {
				if (field659 == null) {
					field659 = new String[5];
				}

				field659[var3 - 30] = arg0.method192();
			} else if (var3 == 40) {
				int var6 = arg0.method185();
				field645 = new int[var6];
				field646 = new int[var6];
				for (int var7 = 0; var7 < var6; var7++) {
					field645[var7] = arg0.method187();
					field646[var7] = arg0.method187();
				}
			} else if (var3 == 60) {
				field661 = arg0.method187();
			} else if (var3 == 62) {
				field663 = true;
			} else if (var3 == 64) {
				field664 = false;
			} else if (var3 == 65) {
				field665 = arg0.method187();
			} else if (var3 == 66) {
				field666 = arg0.method187();
			} else if (var3 == 67) {
				field667 = arg0.method187();
			} else if (var3 == 68) {
				field662 = arg0.method187();
			} else if (var3 == 69) {
				field668 = arg0.method185();
			}
		}
	}

	@ObfuscatedName("wb.a(IIIIIII)Ldb;")
	public final class30 method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < field642.length; var9++) {
			if (field642[var9] == arg0) {
				var8 = var9;
				break;
			}
		}

		if (var8 == -1) {
			return null;
		}

		long var10 = ((long) (arg6 + 1) << 32) + ((field640 << 6) + (var8 << 3) + arg1);
		if (!field652 && !field653) {
			class30 var12 = (class30) field670.method84(var10);
			if (var12 != null) {
				return var12;
			}
		}

		if (var8 >= field641.length) {
			return null;
		}

		int var13 = field641[var8];
		if (var13 == -1) {
			return null;
		}

		boolean var14 = field663 ^ arg1 > 3;
		if (var14) {
			var13 += 0x10000;
		}

		class30 var15 = (class30) field669.method84(var13);
		if (var15 == null) {
			var15 = new class30(var13 & 0xFFFF);
			if (var14) {
				var15.method116();
			}

			field669.method85(var15, var13);
		}

		boolean var16;
		if (field665 == 128 && field666 == 128 && field667 == 128) {
			var16 = false;
		} else {
			var16 = true;
		}

		class30 var17 = new class30(field645 == null, !field660, var15, !field653, arg1 == 0 && !field652 && arg6 == -1 && !var16);
		if (arg6 != -1) {
			var17.method108();
			var17.method109(arg6);
			var17.field419 = null;
			var17.field418 = null;
		}

		while (arg1-- > 0) {
			var17.method112();
		}

		if (field645 != null) {
			for (int var18 = 0; var18 < field645.length; var18++) {
				var17.method115(field645[var18], field646[var18]);
			}
		}

		if (var16) {
			var17.method117(field666, field665, field667);
		}

		if (field652) {
			int var19 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var20 = 0; var20 < var17.field386; var20++) {
				int var21 = var17.field387[var20];
				int var22 = var17.field389[var20];
				int var23 = (arg3 - arg2) * (var21 + 64) / 128 + arg2;
				int var24 = (arg4 - arg5) * (var21 + 64) / 128 + arg5;
				int var25 = (var24 - var23) * (var22 + 64) / 128 + var23;
				var17.field388[var20] += var25 - var19;
			}
		}

		var17.method118(field657 + 64, field658 * 5 + 768, -50, -10, -50, !field653);

		if (field649) {
			var17.field415 = var17.field411;
		}

		if (!field652 && !field653) {
			field670.method85(var17, var10);
		}

		return var17;
	}
}
