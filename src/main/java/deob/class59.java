package deob;

@ObfuscatedName("gc")
public final class class59 {

	@ObfuscatedName("gc.c")
	public static int field863;

	@ObfuscatedName("gc.d")
	public static int[] field864;

	@ObfuscatedName("gc.e")
	public static class39 field865;

	@ObfuscatedName("gc.f")
	public static class59[] field866;

	@ObfuscatedName("gc.g")
	public static int field867;

	@ObfuscatedName("gc.h")
	public static boolean field868 = true;

	@ObfuscatedName("gc.i")
	public int field869 = -1;

	@ObfuscatedName("gc.j")
	public int field870;

	@ObfuscatedName("gc.k")
	public String field871;

	@ObfuscatedName("gc.l")
	public byte[] field872;

	@ObfuscatedName("gc.m")
	public int[] field873;

	@ObfuscatedName("gc.n")
	public int[] field874;

	@ObfuscatedName("gc.o")
	public int field875;

	@ObfuscatedName("gc.p")
	public int field876;

	@ObfuscatedName("gc.q")
	public int field877;

	@ObfuscatedName("gc.r")
	public int field878;

	@ObfuscatedName("gc.s")
	public int field879;

	@ObfuscatedName("gc.t")
	public int field880;

	@ObfuscatedName("gc.v")
	public int field881;

	@ObfuscatedName("gc.w")
	public boolean field882;

	@ObfuscatedName("gc.x")
	public int field883;

	@ObfuscatedName("gc.y")
	public boolean field884;

	@ObfuscatedName("gc.z")
	public String[] field885;

	@ObfuscatedName("gc.R")
	public static class20 field903 = new class20(50);

	@ObfuscatedName("gc.S")
	public static class20 field904 = new class20(100);

	@ObfuscatedName("gc.D")
	public byte field889;

	@ObfuscatedName("gc.G")
	public byte field892;

	@ObfuscatedName("gc.B")
	public int field887;

	@ObfuscatedName("gc.C")
	public int field888;

	@ObfuscatedName("gc.E")
	public int field890;

	@ObfuscatedName("gc.F")
	public int field891;

	@ObfuscatedName("gc.H")
	public int field893;

	@ObfuscatedName("gc.I")
	public int field894;

	@ObfuscatedName("gc.J")
	public int field895;

	@ObfuscatedName("gc.K")
	public int field896;

	@ObfuscatedName("gc.L")
	public int field897;

	@ObfuscatedName("gc.M")
	public int field898;

	@ObfuscatedName("gc.P")
	public int field901;

	@ObfuscatedName("gc.Q")
	public int field902;

	@ObfuscatedName("gc.N")
	public int[] field899;

	@ObfuscatedName("gc.O")
	public int[] field900;

	@ObfuscatedName("gc.A")
	public String[] field886;

	@ObfuscatedName("gc.a(Lyb;)V")
	public static final void method333(class51 arg0) {
		field865 = new class39(arg0.method295("obj.dat", null));
		class39 var1 = new class39(arg0.method295("obj.idx", null));
		field863 = var1.method233();
		field864 = new int[field863];
		int var2 = 2;
		for (int var3 = 0; var3 < field863; var3++) {
			field864[var3] = var2;
			var2 += var1.method233();
		}

		field866 = new class59[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field866[var4] = new class59();
		}
	}

	@ObfuscatedName("gc.a(Z)V")
	public static final void method334() {
		field903 = null;
		field904 = null;
		field864 = null;
		field866 = null;
		field865 = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static final class59 method335(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field866[var1].field869 == arg0) {
				return field866[var1];
			}
		}

		field867 = (field867 + 1) % 10;
		class59 var2 = field866[field867];
		field865.field611 = field864[arg0];
		var2.field869 = arg0;
		var2.method336();
		var2.method337(field865);

		if (var2.field902 != -1) {
			var2.method338();
		}

		if (!field868 && var2.field884) {
			var2.field871 = "Members Object";
			var2.field872 = "Login to a members' server to use this object.".getBytes();
			var2.field885 = null;
			var2.field886 = null;
		}

		return var2;
	}

	@ObfuscatedName("gc.a()V")
	public final void method336() {
		field870 = 0;
		field871 = null;
		field872 = null;
		field873 = null;
		field874 = null;
		field875 = 2000;
		field876 = 0;
		field877 = 0;
		field878 = 0;
		field879 = 0;
		field880 = 0;
		field881 = -1;
		field882 = false;
		field883 = 1;
		field884 = false;
		field885 = null;
		field886 = null;
		field887 = -1;
		field888 = -1;
		field889 = 0;
		field890 = -1;
		field891 = -1;
		field892 = 0;
		field893 = -1;
		field894 = -1;
		field895 = -1;
		field896 = -1;
		field897 = -1;
		field898 = -1;
		field899 = null;
		field900 = null;
		field901 = -1;
		field902 = -1;
	}

	@ObfuscatedName("gc.a(ZLmb;)V")
	public final void method337(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field870 = arg0.method233();
			} else if (var2 == 2) {
				field871 = arg0.method238();
			} else if (var2 == 3) {
				field872 = arg0.method239();
			} else if (var2 == 4) {
				field875 = arg0.method233();
			} else if (var2 == 5) {
				field876 = arg0.method233();
			} else if (var2 == 6) {
				field877 = arg0.method233();
			} else if (var2 == 7) {
				field879 = arg0.method233();
				if (field879 > 32767) {
					field879 -= 0x10000;
				}
			} else if (var2 == 8) {
				field880 = arg0.method233();
				if (field880 > 32767) {
					field880 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field881 = arg0.method233();
				} else if (var2 == 11) {
					field882 = true;
				} else if (var2 == 12) {
					field883 = arg0.method236();
				} else if (var2 == 16) {
					field884 = true;
				} else if (var2 == 23) {
					field887 = arg0.method233();
					field889 = arg0.method232();
				} else if (var2 == 24) {
					field888 = arg0.method233();
				} else if (var2 == 25) {
					field890 = arg0.method233();
					field892 = arg0.method232();
				} else if (var2 == 26) {
					field891 = arg0.method233();
				} else if (var2 >= 30 && var2 < 35) {
					if (field885 == null) {
						field885 = new String[5];
					}

					field885[var2 - 30] = arg0.method238();
					if (field885[var2 - 30].equalsIgnoreCase("hidden")) {
						field885[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (field886 == null) {
						field886 = new String[5];
					}

					field886[var2 - 35] = arg0.method238();
				} else if (var2 == 40) {
					int var3 = arg0.method231();
					field873 = new int[var3];
					field874 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field873[var4] = arg0.method233();
						field874[var4] = arg0.method233();
					}
				} else if (var2 == 78) {
					field893 = arg0.method233();
				} else if (var2 == 79) {
					field894 = arg0.method233();
				} else if (var2 == 90) {
					field895 = arg0.method233();
				} else if (var2 == 91) {
					field897 = arg0.method233();
				} else if (var2 == 92) {
					field896 = arg0.method233();
				} else if (var2 == 93) {
					field898 = arg0.method233();
				} else if (var2 == 95) {
					field878 = arg0.method233();
				} else if (var2 == 97) {
					field901 = arg0.method233();
				} else if (var2 == 98) {
					field902 = arg0.method233();
				} else if (var2 >= 100 && var2 < 110) {
					if (field899 == null) {
						field899 = new int[10];
						field900 = new int[10];
					}

					field899[var2 - 100] = arg0.method233();
					field900[var2 - 100] = arg0.method233();
				}
			}
		}
	}

	@ObfuscatedName("gc.b(I)V")
	public void method338() {
		class59 var1 = method335(field902);
		field870 = var1.field870;
		field875 = var1.field875;
		field876 = var1.field876;
		field877 = var1.field877;
		field878 = var1.field878;
		field879 = var1.field879;
		field880 = var1.field880;
		field873 = var1.field873;
		field874 = var1.field874;
		class59 var2 = method335(field901);
		field871 = var2.field871;
		field884 = var2.field884;
		field883 = var2.field883;
		String var3 = "a";
		char var4 = var2.field871.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field872 = ("Swap this note at any bank for " + var3 + " " + var2.field871 + ".").getBytes();
		field882 = true;
	}

	@ObfuscatedName("gc.c(I)Lfb;")
	public final class32 method339(int arg0) {
		if (field899 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field900[var3] && field900[var3] != 0) {
					var2 = field899[var3];
				}
			}

			if (var2 != -1) {
				return method335(var2).method339(1);
			}
		}

		class32 var4 = (class32) field903.method113(field869);
		if (var4 != null) {
			return var4;
		}

		class32 var5 = class32.method135(field870);
		if (var5 == null) {
			return null;
		}

		if (field873 != null) {
			for (int var6 = 0; var6 < field873.length; var6++) {
				var5.method149(field873[var6], field874[var6]);
			}
		}

		var5.method152(64, 768, -50, -10, -50, true);
		var5.field509 = true;
		field903.method114(field869, var5);
		return var5;
	}

	@ObfuscatedName("gc.a(II)Lfb;")
	public final class32 method340(int arg0) {
		if (field899 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field900[var3] && field900[var3] != 0) {
					var2 = field899[var3];
				}
			}

			if (var2 != -1) {
				return method335(var2).method340(1);
			}
		}

		class32 var4 = class32.method135(field870);
		if (var4 == null) {
			return null;
		}

		if (field873 != null) {
			for (int var5 = 0; var5 < field873.length; var5++) {
				var4.method149(field873[var5], field874[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("gc.a(III)Ljb;")
	public static final class36 method341(int arg0, int arg1) {
		class36 var2 = (class36) field904.method113(arg1);
		if (var2 != null && var2.field591 != arg0 && var2.field591 != -1) {
			var2.method118();
			var2 = null;
		}

		if (var2 != null) {
			return var2;
		}

		class59 var3 = method335(arg1);
		if (var3.field899 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg0 >= var3.field900[var5] && var3.field900[var5] != 0) {
					var4 = var3.field899[var5];
				}
			}

			if (var4 != -1) {
				var3 = method335(var4);
			}
		}

		class32 var6 = var3.method339(1);
		if (var6 == null) {
			return null;
		}

		class36 var7 = null;
		if (var3.field902 != -1) {
			var7 = method341(10, var3.field901);
			if (var7 == null) {
				return null;
			}
		}

		class36 var8 = new class36(32, 32);
		int var9 = class35.field567;
		int var10 = class35.field568;
		int[] var11 = class35.field573;
		int[] var12 = class34.field552;
		int var13 = class34.field553;
		int var14 = class34.field554;
		int var15 = class34.field557;
		int var16 = class34.field558;
		int var17 = class34.field555;
		int var18 = class34.field556;
		class35.field565 = false;
		class34.method161(32, 32, var8.field585);
		class34.method165(0, 32, 0, 32, 0);
		class35.method170();
		int var19 = class35.field571[var3.field876] * var3.field875 >> 16;
		int var20 = class35.field572[var3.field876] * var3.field875 >> 16;
		var6.method155(0, var3.field877, var3.field878, var3.field876, var3.field879, var6.field358 / 2 + var19 + var3.field880, var3.field880 + var20);

		for (int var21 = 31; var21 >= 0; var21--) {
			for (int var22 = 31; var22 >= 0; var22--) {
				if (var8.field585[var22 * 32 + var21] == 0) {
					if (var21 > 0 && var8.field585[var22 * 32 + var21 - 1] > 1) {
						var8.field585[var22 * 32 + var21] = 1;
					} else if (var22 > 0 && var8.field585[(var22 - 1) * 32 + var21] > 1) {
						var8.field585[var22 * 32 + var21] = 1;
					} else if (var21 < 31 && var8.field585[var22 * 32 + var21 + 1] > 1) {
						var8.field585[var22 * 32 + var21] = 1;
					} else if (var22 < 31 && var8.field585[(var22 + 1) * 32 + var21] > 1) {
						var8.field585[var22 * 32 + var21] = 1;
					}
				}
			}
		}

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var8.field585[var24 * 32 + var23] == 0 && var23 > 0 && var24 > 0 && var8.field585[(var24 - 1) * 32 + var23 - 1] > 0) {
					var8.field585[var24 * 32 + var23] = 0x302020;
				}
			}
		}

		if (var3.field902 != -1) {
			int var25 = var7.field590;
			int var26 = var7.field591;
			var7.field590 = 32;
			var7.field591 = 32;
			var7.method192(22, 5, 22, 5);
			var7.field590 = var25;
			var7.field591 = var26;
		}

		field904.method114(arg1, var8);
		class34.method161(var14, var13, var12);
		class34.method163(var15, var17, var18, var16);
		class35.field567 = var9;
		class35.field568 = var10;
		class35.field573 = var11;
		class35.field565 = true;

		if (var3.field882) {
			var8.field590 = 33;
		} else {
			var8.field590 = 32;
		}

		var8.field591 = arg0;
		return var8;
	}

	@ObfuscatedName("gc.b(II)Z")
	public final boolean method342(int arg0) {
		int var2 = field887;
		int var3 = field888;
		int var4 = field893;
		if (arg0 == 1) {
			var2 = field890;
			var3 = field891;
			var4 = field894;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!class32.method136(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !class32.method136(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !class32.method136(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("gc.c(II)Lfb;")
	public final class32 method343(int arg0) {
		int var2 = field887;
		int var3 = field888;
		int var4 = field893;
		if (arg0 == 1) {
			var2 = field890;
			var3 = field891;
			var4 = field894;
		}

		if (var2 == -1) {
			return null;
		}

		class32 var5 = class32.method135(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				class32 var9 = class32.method135(var3);
				class32[] var10 = new class32[] { var5, var9 };
				var5 = new class32(2, var10);
			} else {
				class32 var6 = class32.method135(var3);
				class32 var7 = class32.method135(var4);
				class32[] var8 = new class32[] { var5, var6, var7 };
				var5 = new class32(3, var8);
			}
		}

		if (arg0 == 0 && field889 != 0) {
			var5.method148(field889, 0, 0);
		}

		if (arg0 == 1 && field892 != 0) {
			var5.method148(field892, 0, 0);
		}

		if (field873 != null) {
			for (int var11 = 0; var11 < field873.length; var11++) {
				var5.method149(field873[var11], field874[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("gc.d(II)Z")
	public final boolean method344(int arg0) {
		int var2 = field895;
		int var3 = field896;
		if (arg0 == 1) {
			var2 = field897;
			var3 = field898;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!class32.method136(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !class32.method136(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("gc.e(II)Lfb;")
	public final class32 method345(int arg0) {
		int var2 = field895;
		int var3 = field896;
		if (arg0 == 1) {
			var2 = field897;
			var3 = field898;
		}

		if (var2 == -1) {
			return null;
		}

		class32 var4 = class32.method135(var2);
		if (var3 != -1) {
			class32 var5 = class32.method135(var3);
			class32[] var6 = new class32[] { var4, var5 };
			var4 = new class32(2, var6);
		}

		if (field873 != null) {
			for (int var7 = 0; var7 < field873.length; var7++) {
				var4.method149(field873[var7], field874[var7]);
			}
		}

		return var4;
	}
}
