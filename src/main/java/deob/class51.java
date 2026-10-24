package deob;

@ObfuscatedName("yb")
public final class class51 {

	@ObfuscatedName("yb.f")
	public static int field699;

	@ObfuscatedName("yb.g")
	public static int[] field700;

	@ObfuscatedName("yb.h")
	public static class36 field701;

	@ObfuscatedName("yb.i")
	public static class51[] field702;

	@ObfuscatedName("yb.j")
	public static int field703;

	@ObfuscatedName("yb.k")
	public int field704 = -1;

	@ObfuscatedName("yb.l")
	public int field705;

	@ObfuscatedName("yb.m")
	public String field706;

	@ObfuscatedName("yb.n")
	public byte[] field707;

	@ObfuscatedName("yb.o")
	public int[] field708;

	@ObfuscatedName("yb.p")
	public int[] field709;

	@ObfuscatedName("yb.q")
	public int field710;

	@ObfuscatedName("yb.r")
	public int field711;

	@ObfuscatedName("yb.s")
	public int field712;

	@ObfuscatedName("yb.t")
	public int field713;

	@ObfuscatedName("yb.u")
	public int field714;

	@ObfuscatedName("yb.v")
	public int field715;

	@ObfuscatedName("yb.x")
	public int field716;

	@ObfuscatedName("yb.y")
	public boolean field717;

	@ObfuscatedName("yb.z")
	public int field718;

	@ObfuscatedName("yb.N")
	public static class18 field732 = new class18(50);

	@ObfuscatedName("yb.O")
	public static class18 field733 = new class18(200);

	@ObfuscatedName("yb.F")
	public byte field724;

	@ObfuscatedName("yb.I")
	public byte field727;

	@ObfuscatedName("yb.D")
	public int field722;

	@ObfuscatedName("yb.E")
	public int field723;

	@ObfuscatedName("yb.G")
	public int field725;

	@ObfuscatedName("yb.H")
	public int field726;

	@ObfuscatedName("yb.J")
	public int field728;

	@ObfuscatedName("yb.K")
	public int field729;

	@ObfuscatedName("yb.L")
	public int field730;

	@ObfuscatedName("yb.M")
	public int field731;

	@ObfuscatedName("yb.A")
	public boolean field719;

	@ObfuscatedName("yb.B")
	public String[] field720;

	@ObfuscatedName("yb.C")
	public String[] field721;

	@ObfuscatedName("yb.a(Ltb;)V")
	public static final void method247(class46 arg0) {
		field701 = new class36(arg0.method225(null, "obj.dat"));
		class36 var1 = new class36(arg0.method225(null, "obj.idx"));
		field699 = var1.method187();
		field700 = new int[field699];
		int var2 = 2;
		for (int var3 = 0; var3 < field699; var3++) {
			field700[var3] = var2;
			var2 += var1.method187();
		}

		field702 = new class51[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field702[var4] = new class51();
		}
	}

	@ObfuscatedName("yb.a(I)V")
	public static final void method248() {
		field732 = null;
		field733 = null;
		field700 = null;
		field702 = null;
		field701 = null;
	}

	@ObfuscatedName("yb.b(I)Lyb;")
	public static final class51 method249(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field702[var1].field704 == arg0) {
				return field702[var1];
			}
		}

		field703 = (field703 + 1) % 10;
		class51 var2 = field702[field703];
		field701.field525 = field700[arg0];
		var2.field704 = arg0;
		var2.method250();
		var2.method251(field701);
		return var2;
	}

	@ObfuscatedName("yb.a()V")
	public final void method250() {
		field705 = 0;
		field706 = null;
		field707 = null;
		field708 = null;
		field709 = null;
		field710 = 2000;
		field711 = 0;
		field712 = 0;
		field713 = 0;
		field714 = 0;
		field715 = 0;
		field716 = -1;
		field717 = false;
		field718 = 1;
		field719 = false;
		field720 = null;
		field721 = null;
		field722 = -1;
		field723 = -1;
		field724 = 0;
		field725 = -1;
		field726 = -1;
		field727 = 0;
		field728 = -1;
		field729 = -1;
		field730 = -1;
		field731 = -1;
	}

	@ObfuscatedName("yb.a(BLjb;)V")
	public final void method251(class36 arg0) {
		while (true) {
			int var2 = arg0.method185();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field705 = arg0.method187();
			} else if (var2 == 2) {
				field706 = arg0.method192();
			} else if (var2 == 3) {
				field707 = arg0.method193();
			} else if (var2 == 4) {
				field710 = arg0.method187();
			} else if (var2 == 5) {
				field711 = arg0.method187();
			} else if (var2 == 6) {
				field712 = arg0.method187();
			} else if (var2 == 7) {
				field714 = arg0.method187();
				if (field714 > 32767) {
					field714 -= 0x10000;
				}
			} else if (var2 == 8) {
				field715 = arg0.method187();
				if (field715 > 32767) {
					field715 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field716 = arg0.method187();
				} else if (var2 == 11) {
					field717 = true;
				} else if (var2 == 12) {
					field718 = arg0.method190();
				} else if (var2 == 16) {
					field719 = true;
				} else if (var2 == 23) {
					field722 = arg0.method187();
					field724 = arg0.method186();
				} else if (var2 == 24) {
					field723 = arg0.method187();
				} else if (var2 == 25) {
					field725 = arg0.method187();
					field727 = arg0.method186();
				} else if (var2 == 26) {
					field726 = arg0.method187();
				} else if (var2 >= 30 && var2 < 35) {
					if (field720 == null) {
						field720 = new String[5];
					}

					field720[var2 - 30] = arg0.method192();
				} else if (var2 >= 35 && var2 < 40) {
					if (field721 == null) {
						field721 = new String[5];
					}

					field721[var2 - 35] = arg0.method192();
				} else if (var2 == 40) {
					int var3 = arg0.method185();
					field708 = new int[var3];
					field709 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field708[var4] = arg0.method187();
						field709[var4] = arg0.method187();
					}
				} else if (var2 == 90) {
					field728 = arg0.method187();
				} else if (var2 == 91) {
					field730 = arg0.method187();
				} else if (var2 == 92) {
					field729 = arg0.method187();
				} else if (var2 == 93) {
					field731 = arg0.method187();
				} else if (var2 == 95) {
					field713 = arg0.method187();
				}
			}
		}
	}

	@ObfuscatedName("yb.b()Ldb;")
	public final class30 method252() {
		class30 var1 = (class30) field732.method84(field704);
		if (var1 != null) {
			return var1;
		}

		class30 var2 = new class30(field705);
		if (field708 != null) {
			for (int var3 = 0; var3 < field708.length; var3++) {
				var2.method115(field708[var3], field709[var3]);
			}
		}

		var2.method118(64, 768, -50, -10, -50, true);
		field732.method85(var2, field704);
		return var2;
	}

	@ObfuscatedName("yb.a(II)Lgb;")
	public static final class33 method253(int arg0) {
		class33 var1 = (class33) field733.method84(arg0);
		if (var1 != null) {
			return var1;
		}

		class51 var2 = method249(arg0);
		class33 var3 = new class33(32, 32);
		int var4 = class32.field482;
		int var5 = class32.field483;
		int[] var6 = class32.field488;
		int[] var7 = class31.field467;
		int var8 = class31.field468;
		int var9 = class31.field469;
		class32.field480 = false;
		class31.method127(32, var3.field500, 32);
		class31.method131(0, 32, 0, 32, 0);
		class32.method136();
		class30 var10 = var2.method252();
		int var11 = class32.field486[var2.field711] * var2.field710 >> 16;
		int var12 = class32.field487[var2.field711] * var2.field710 >> 16;
		var10.method121(var10.field411 / 2 + var11 + var2.field715, var2.field715 + var12, var2.field714, 0, var2.field713, var2.field711, var2.field712);

		for (int var13 = 31; var13 >= 0; var13--) {
			for (int var14 = 31; var14 >= 0; var14--) {
				if (var3.field500[var14 * 32 + var13] == 0) {
					if (var13 > 0 && var3.field500[var14 * 32 + var13 - 1] > 1) {
						var3.field500[var14 * 32 + var13] = 1;
					} else if (var14 > 0 && var3.field500[(var14 - 1) * 32 + var13] > 1) {
						var3.field500[var14 * 32 + var13] = 1;
					} else if (var13 < 31 && var3.field500[var14 * 32 + var13 + 1] > 1) {
						var3.field500[var14 * 32 + var13] = 1;
					} else if (var14 < 31 && var3.field500[(var14 + 1) * 32 + var13] > 1) {
						var3.field500[var14 * 32 + var13] = 1;
					}
				}
			}
		}

		for (int var15 = 31; var15 >= 0; var15--) {
			for (int var16 = 31; var16 >= 0; var16--) {
				if (var3.field500[var16 * 32 + var15] == 0 && var15 > 0 && var16 > 0 && var3.field500[(var16 - 1) * 32 + var15 - 1] > 0) {
					var3.field500[var16 * 32 + var15] = 0x302020;
				}
			}
		}

		field733.method85(var3, arg0);
		class31.method127(var8, var7, var9);
		class32.field482 = var4;
		class32.field483 = var5;
		class32.field488 = var6;
		class32.field480 = true;

		if (var2.field717) {
			var3.field505 = 33;
		} else {
			var3.field505 = 32;
		}

		return var3;
	}

	@ObfuscatedName("yb.a(IB)Ldb;")
	public final class30 method254(int arg0) {
		int var2 = field722;
		if (arg0 == 1) {
			var2 = field725;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field723;
		if (arg0 == 1) {
			var3 = field726;
		}

		class30 var4 = new class30(var2);
		if (var3 != -1) {
			class30 var5 = new class30(var3);
			class30[] var6 = new class30[] { var4, var5 };
			var4 = new class30(2, var6);
		}

		if (arg0 == 0 && field724 != 0) {
			var4.method114(0, 0, field724);
		}

		if (arg0 == 1 && field727 != 0) {
			var4.method114(0, 0, field727);
		}

		if (field708 != null) {
			for (int var7 = 0; var7 < field708.length; var7++) {
				var4.method115(field708[var7], field709[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("yb.b(II)Ldb;")
	public final class30 method255(int arg0) {
		int var2 = field728;
		if (arg0 == 1) {
			var2 = field730;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field729;
		if (arg0 == 1) {
			var3 = field731;
		}

		class30 var4 = new class30(var2);
		if (var3 != -1) {
			class30 var5 = new class30(var3);
			class30[] var6 = new class30[] { var4, var5 };
			var4 = new class30(2, var6);
		}

		if (field708 != null) {
			for (int var7 = 0; var7 < field708.length; var7++) {
				var4.method115(field708[var7], field709[var7]);
			}
		}

		return var4;
	}
}
