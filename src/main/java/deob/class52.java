package deob;

@ObfuscatedName("zb")
public final class class52 {

	@ObfuscatedName("zb.b")
	public static int field716;

	@ObfuscatedName("zb.c")
	public static int[] field717;

	@ObfuscatedName("zb.d")
	public static class37 field718;

	@ObfuscatedName("zb.e")
	public static class52[] field719;

	@ObfuscatedName("zb.f")
	public static int field720;

	@ObfuscatedName("zb.g")
	public int field721 = -1;

	@ObfuscatedName("zb.h")
	public int field722;

	@ObfuscatedName("zb.i")
	public String field723;

	@ObfuscatedName("zb.j")
	public byte[] field724;

	@ObfuscatedName("zb.k")
	public int[] field725;

	@ObfuscatedName("zb.l")
	public int[] field726;

	@ObfuscatedName("zb.m")
	public int field727;

	@ObfuscatedName("zb.n")
	public int field728;

	@ObfuscatedName("zb.o")
	public int field729;

	@ObfuscatedName("zb.p")
	public int field730;

	@ObfuscatedName("zb.q")
	public int field731;

	@ObfuscatedName("zb.r")
	public int field732;

	@ObfuscatedName("zb.t")
	public int field733;

	@ObfuscatedName("zb.u")
	public boolean field734;

	@ObfuscatedName("zb.v")
	public int field735;

	@ObfuscatedName("zb.w")
	public boolean field736;

	@ObfuscatedName("zb.x")
	public String[] field737;

	@ObfuscatedName("zb.y")
	public String[] field738;

	@ObfuscatedName("zb.z")
	public int field739;

	@ObfuscatedName("zb.J")
	public static class19 field749 = new class19(50);

	@ObfuscatedName("zb.K")
	public static class19 field750 = new class19(200);

	@ObfuscatedName("zb.B")
	public byte field741;

	@ObfuscatedName("zb.E")
	public byte field744;

	@ObfuscatedName("zb.A")
	public int field740;

	@ObfuscatedName("zb.C")
	public int field742;

	@ObfuscatedName("zb.D")
	public int field743;

	@ObfuscatedName("zb.F")
	public int field745;

	@ObfuscatedName("zb.G")
	public int field746;

	@ObfuscatedName("zb.H")
	public int field747;

	@ObfuscatedName("zb.I")
	public int field748;

	@ObfuscatedName("zb.a(Lub;)V")
	public static final void method263(class47 arg0) {
		field718 = new class37(arg0.method242(null, "obj.dat"));
		class37 var1 = new class37(arg0.method242(null, "obj.idx"));
		field716 = var1.method203();
		field717 = new int[field716];
		int var2 = 2;
		for (int var3 = 0; var3 < field716; var3++) {
			field717[var3] = var2;
			var2 += var1.method203();
		}

		field719 = new class52[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field719[var4] = new class52();
		}
	}

	@ObfuscatedName("zb.a(I)V")
	public static final void method264() {
		field749 = null;
		field750 = null;
		field717 = null;
		field719 = null;
		field718 = null;
	}

	@ObfuscatedName("zb.b(I)Lzb;")
	public static final class52 method265(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field719[var1].field721 == arg0) {
				return field719[var1];
			}
		}

		field720 = (field720 + 1) % 10;
		class52 var2 = field719[field720];
		field718.field537 = field717[arg0];
		var2.field721 = arg0;
		var2.method266();
		var2.method267(field718);
		return var2;
	}

	@ObfuscatedName("zb.a()V")
	public final void method266() {
		field722 = 0;
		field723 = null;
		field724 = null;
		field725 = null;
		field726 = null;
		field727 = 2000;
		field728 = 0;
		field729 = 0;
		field730 = 0;
		field731 = 0;
		field732 = 0;
		field733 = -1;
		field734 = false;
		field735 = 1;
		field736 = false;
		field737 = null;
		field738 = null;
		field739 = -1;
		field740 = -1;
		field741 = 0;
		field742 = -1;
		field743 = -1;
		field744 = 0;
		field745 = -1;
		field746 = -1;
		field747 = -1;
		field748 = -1;
	}

	@ObfuscatedName("zb.a(ILkb;)V")
	public final void method267(class37 arg0) {
		while (true) {
			int var2 = arg0.method201();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field722 = arg0.method203();
			} else if (var2 == 2) {
				field723 = arg0.method208();
			} else if (var2 == 3) {
				field724 = arg0.method209();
			} else if (var2 == 4) {
				field727 = arg0.method203();
			} else if (var2 == 5) {
				field728 = arg0.method203();
			} else if (var2 == 6) {
				field729 = arg0.method203();
			} else if (var2 == 7) {
				field731 = arg0.method203();
				if (field731 > 32767) {
					field731 -= 0x10000;
				}
			} else if (var2 == 8) {
				field732 = arg0.method203();
				if (field732 > 32767) {
					field732 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field733 = arg0.method203();
				} else if (var2 == 11) {
					field734 = true;
				} else if (var2 == 12) {
					field735 = arg0.method206();
				} else if (var2 == 16) {
					field736 = true;
				} else if (var2 == 23) {
					field739 = arg0.method203();
					field741 = arg0.method202();
				} else if (var2 == 24) {
					field740 = arg0.method203();
				} else if (var2 == 25) {
					field742 = arg0.method203();
					field744 = arg0.method202();
				} else if (var2 == 26) {
					field743 = arg0.method203();
				} else if (var2 >= 30 && var2 < 35) {
					if (field737 == null) {
						field737 = new String[5];
					}

					field737[var2 - 30] = arg0.method208();
				} else if (var2 >= 35 && var2 < 40) {
					if (field738 == null) {
						field738 = new String[5];
					}

					field738[var2 - 35] = arg0.method208();
				} else if (var2 == 40) {
					int var3 = arg0.method201();
					field725 = new int[var3];
					field726 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field725[var4] = arg0.method203();
						field726[var4] = arg0.method203();
					}
				} else if (var2 == 90) {
					field745 = arg0.method203();
				} else if (var2 == 91) {
					field747 = arg0.method203();
				} else if (var2 == 92) {
					field746 = arg0.method203();
				} else if (var2 == 93) {
					field748 = arg0.method203();
				} else if (var2 == 95) {
					field730 = arg0.method203();
				}
			}
		}
	}

	@ObfuscatedName("zb.b()Leb;")
	public final class31 method268() {
		class31 var1 = (class31) field749.method99(field721);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = new class31(field722);
		if (field725 != null) {
			for (int var3 = 0; var3 < field725.length; var3++) {
				var2.method129(field725[var3], field726[var3]);
			}
		}

		var2.method132(64, 768, -50, -10, -50, true);
		var2.field431 = true;
		field749.method100(field721, var2);
		return var2;
	}

	@ObfuscatedName("zb.a(IB)Lhb;")
	public static final class34 method269(int arg0) {
		class34 var1 = (class34) field750.method99(arg0);
		if (var1 != null) {
			return var1;
		}

		class52 var2 = method265(arg0);
		class34 var3 = new class34(32, 32);
		int var4 = class33.field494;
		int var5 = class33.field495;
		int[] var6 = class33.field500;
		int[] var7 = class32.field479;
		int var8 = class32.field480;
		int var9 = class32.field481;
		class33.field492 = false;
		class32.method141(32, var3.field512, 32);
		class32.method145(0, 32, 0, 32, 0);
		class33.method150();
		class31 var10 = var2.method268();
		int var11 = class33.field498[var2.field728] * var2.field727 >> 16;
		int var12 = class33.field499[var2.field728] * var2.field727 >> 16;
		var10.method135(0, var2.field729, var2.field730, var2.field728, var2.field731, var10.field422 / 2 + var11 + var2.field732, var2.field732 + var12);

		for (int var13 = 31; var13 >= 0; var13--) {
			for (int var14 = 31; var14 >= 0; var14--) {
				if (var3.field512[var14 * 32 + var13] == 0) {
					if (var13 > 0 && var3.field512[var14 * 32 + var13 - 1] > 1) {
						var3.field512[var14 * 32 + var13] = 1;
					} else if (var14 > 0 && var3.field512[(var14 - 1) * 32 + var13] > 1) {
						var3.field512[var14 * 32 + var13] = 1;
					} else if (var13 < 31 && var3.field512[var14 * 32 + var13 + 1] > 1) {
						var3.field512[var14 * 32 + var13] = 1;
					} else if (var14 < 31 && var3.field512[(var14 + 1) * 32 + var13] > 1) {
						var3.field512[var14 * 32 + var13] = 1;
					}
				}
			}
		}

		for (int var15 = 31; var15 >= 0; var15--) {
			for (int var16 = 31; var16 >= 0; var16--) {
				if (var3.field512[var16 * 32 + var15] == 0 && var15 > 0 && var16 > 0 && var3.field512[(var16 - 1) * 32 + var15 - 1] > 0) {
					var3.field512[var16 * 32 + var15] = 0x302020;
				}
			}
		}

		field750.method100(arg0, var3);
		class32.method141(var8, var7, var9);
		class33.field494 = var4;
		class33.field495 = var5;
		class33.field500 = var6;
		class33.field492 = true;

		if (var2.field734) {
			var3.field517 = 33;
		} else {
			var3.field517 = 32;
		}

		return var3;
	}

	@ObfuscatedName("zb.a(II)Leb;")
	public final class31 method270(int arg0) {
		int var2 = field739;
		if (arg0 == 1) {
			var2 = field742;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field740;
		if (arg0 == 1) {
			var3 = field743;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(2, var6);
		}

		if (arg0 == 0 && field741 != 0) {
			var4.method128(0, 0, field741);
		}

		if (arg0 == 1 && field744 != 0) {
			var4.method128(0, 0, field744);
		}

		if (field725 != null) {
			for (int var7 = 0; var7 < field725.length; var7++) {
				var4.method129(field725[var7], field726[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("zb.a(BI)Leb;")
	public final class31 method271(int arg0) {
		int var2 = field745;
		if (arg0 == 1) {
			var2 = field747;
		}

		if (var2 == -1) {
			return null;
		}

		int var3 = field746;
		if (arg0 == 1) {
			var3 = field748;
		}

		class31 var4 = new class31(var2);
		if (var3 != -1) {
			class31 var5 = new class31(var3);
			class31[] var6 = new class31[] { var4, var5 };
			var4 = new class31(2, var6);
		}

		if (field725 != null) {
			for (int var7 = 0; var7 < field725.length; var7++) {
				var4.method129(field725[var7], field726[var7]);
			}
		}

		return var4;
	}
}
