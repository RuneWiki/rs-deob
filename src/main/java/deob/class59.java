package deob;

@ObfuscatedName("gc")
public final class class59 {

	@ObfuscatedName("gc.f")
	public static int field866;

	@ObfuscatedName("gc.g")
	public static int[] field867;

	@ObfuscatedName("gc.h")
	public static class39 field868;

	@ObfuscatedName("gc.i")
	public static class59[] field869;

	@ObfuscatedName("gc.j")
	public static int field870;

	@ObfuscatedName("gc.k")
	public static boolean field871 = true;

	@ObfuscatedName("gc.l")
	public int field872 = -1;

	@ObfuscatedName("gc.m")
	public int field873;

	@ObfuscatedName("gc.n")
	public String field874;

	@ObfuscatedName("gc.o")
	public byte[] field875;

	@ObfuscatedName("gc.p")
	public int[] field876;

	@ObfuscatedName("gc.q")
	public int[] field877;

	@ObfuscatedName("gc.r")
	public int field878;

	@ObfuscatedName("gc.s")
	public int field879;

	@ObfuscatedName("gc.t")
	public int field880;

	@ObfuscatedName("gc.u")
	public int field881;

	@ObfuscatedName("gc.v")
	public int field882;

	@ObfuscatedName("gc.w")
	public int field883;

	@ObfuscatedName("gc.y")
	public int field884;

	@ObfuscatedName("gc.z")
	public boolean field885;

	@ObfuscatedName("gc.U")
	public static class20 field906 = new class20(50);

	@ObfuscatedName("gc.V")
	public static class20 field907 = new class20(100);

	@ObfuscatedName("gc.G")
	public byte field892;

	@ObfuscatedName("gc.J")
	public byte field895;

	@ObfuscatedName("gc.A")
	public int field886;

	@ObfuscatedName("gc.E")
	public int field890;

	@ObfuscatedName("gc.F")
	public int field891;

	@ObfuscatedName("gc.H")
	public int field893;

	@ObfuscatedName("gc.I")
	public int field894;

	@ObfuscatedName("gc.K")
	public int field896;

	@ObfuscatedName("gc.L")
	public int field897;

	@ObfuscatedName("gc.M")
	public int field898;

	@ObfuscatedName("gc.N")
	public int field899;

	@ObfuscatedName("gc.O")
	public int field900;

	@ObfuscatedName("gc.P")
	public int field901;

	@ObfuscatedName("gc.S")
	public int field904;

	@ObfuscatedName("gc.T")
	public int field905;

	@ObfuscatedName("gc.B")
	public boolean field887;

	@ObfuscatedName("gc.Q")
	public int[] field902;

	@ObfuscatedName("gc.R")
	public int[] field903;

	@ObfuscatedName("gc.C")
	public String[] field888;

	@ObfuscatedName("gc.D")
	public String[] field889;

	@ObfuscatedName("gc.a(Lyb;)V")
	public static final void method337(class51 arg0) {
		field868 = new class39(arg0.method299("obj.dat", null));
		class39 var1 = new class39(arg0.method299("obj.idx", null));
		field866 = var1.method233();
		field867 = new int[field866];
		int var2 = 2;
		for (int var3 = 0; var3 < field866; var3++) {
			field867[var3] = var2;
			var2 += var1.method233();
		}

		field869 = new class59[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field869[var4] = new class59();
		}
	}

	@ObfuscatedName("gc.a(B)V")
	public static final void method338() {
		field906 = null;
		field907 = null;
		field867 = null;
		field869 = null;
		field868 = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static final class59 method339(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field869[var1].field872 == arg0) {
				return field869[var1];
			}
		}

		field870 = (field870 + 1) % 10;
		class59 var2 = field869[field870];
		field868.field611 = field867[arg0];
		var2.field872 = arg0;
		var2.method340();
		var2.method341(field868);

		if (var2.field905 != -1) {
			var2.method342();
		}

		if (!field871 && var2.field887) {
			var2.field874 = "Members Object";
			var2.field875 = "Login to a members' server to use this object.".getBytes();
			var2.field888 = null;
			var2.field889 = null;
		}

		return var2;
	}

	@ObfuscatedName("gc.a()V")
	public final void method340() {
		field873 = 0;
		field874 = null;
		field875 = null;
		field876 = null;
		field877 = null;
		field878 = 2000;
		field879 = 0;
		field880 = 0;
		field881 = 0;
		field882 = 0;
		field883 = 0;
		field884 = -1;
		field885 = false;
		field886 = 1;
		field887 = false;
		field888 = null;
		field889 = null;
		field890 = -1;
		field891 = -1;
		field892 = 0;
		field893 = -1;
		field894 = -1;
		field895 = 0;
		field896 = -1;
		field897 = -1;
		field898 = -1;
		field899 = -1;
		field900 = -1;
		field901 = -1;
		field902 = null;
		field903 = null;
		field904 = -1;
		field905 = -1;
	}

	@ObfuscatedName("gc.a(ILmb;)V")
	public final void method341(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field873 = arg0.method233();
			} else if (var2 == 2) {
				field874 = arg0.method238();
			} else if (var2 == 3) {
				field875 = arg0.method239();
			} else if (var2 == 4) {
				field878 = arg0.method233();
			} else if (var2 == 5) {
				field879 = arg0.method233();
			} else if (var2 == 6) {
				field880 = arg0.method233();
			} else if (var2 == 7) {
				field882 = arg0.method233();
				if (field882 > 32767) {
					field882 -= 0x10000;
				}
			} else if (var2 == 8) {
				field883 = arg0.method233();
				if (field883 > 32767) {
					field883 -= 0x10000;
				}
			} else if (var2 != 9) {
				if (var2 == 10) {
					field884 = arg0.method233();
				} else if (var2 == 11) {
					field885 = true;
				} else if (var2 == 12) {
					field886 = arg0.method236();
				} else if (var2 == 16) {
					field887 = true;
				} else if (var2 == 23) {
					field890 = arg0.method233();
					field892 = arg0.method232();
				} else if (var2 == 24) {
					field891 = arg0.method233();
				} else if (var2 == 25) {
					field893 = arg0.method233();
					field895 = arg0.method232();
				} else if (var2 == 26) {
					field894 = arg0.method233();
				} else if (var2 >= 30 && var2 < 35) {
					if (field888 == null) {
						field888 = new String[5];
					}

					field888[var2 - 30] = arg0.method238();
					if (field888[var2 - 30].equalsIgnoreCase("hidden")) {
						field888[var2 - 30] = null;
					}
				} else if (var2 >= 35 && var2 < 40) {
					if (field889 == null) {
						field889 = new String[5];
					}

					field889[var2 - 35] = arg0.method238();
				} else if (var2 == 40) {
					int var3 = arg0.method231();
					field876 = new int[var3];
					field877 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						field876[var4] = arg0.method233();
						field877[var4] = arg0.method233();
					}
				} else if (var2 == 78) {
					field896 = arg0.method233();
				} else if (var2 == 79) {
					field897 = arg0.method233();
				} else if (var2 == 90) {
					field898 = arg0.method233();
				} else if (var2 == 91) {
					field900 = arg0.method233();
				} else if (var2 == 92) {
					field899 = arg0.method233();
				} else if (var2 == 93) {
					field901 = arg0.method233();
				} else if (var2 == 95) {
					field881 = arg0.method233();
				} else if (var2 == 97) {
					field904 = arg0.method233();
				} else if (var2 == 98) {
					field905 = arg0.method233();
				} else if (var2 >= 100 && var2 < 110) {
					if (field902 == null) {
						field902 = new int[10];
						field903 = new int[10];
					}

					field902[var2 - 100] = arg0.method233();
					field903[var2 - 100] = arg0.method233();
				}
			}
		}
	}

	@ObfuscatedName("gc.b(I)V")
	public void method342() {
		class59 var1 = method339(field905);
		field873 = var1.field873;
		field878 = var1.field878;
		field879 = var1.field879;
		field880 = var1.field880;
		field881 = var1.field881;
		field882 = var1.field882;
		field883 = var1.field883;
		field876 = var1.field876;
		field877 = var1.field877;
		class59 var2 = method339(field904);
		field874 = var2.field874;
		field887 = var2.field887;
		field886 = var2.field886;
		String var3 = "a";
		char var4 = var2.field874.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field875 = ("Swap this note at any bank for " + var3 + " " + var2.field874 + ".").getBytes();
		field885 = true;
	}

	@ObfuscatedName("gc.c(I)Lfb;")
	public final class32 method343(int arg0) {
		if (field902 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field903[var3] && field903[var3] != 0) {
					var2 = field902[var3];
				}
			}

			if (var2 != -1) {
				return method339(var2).method343(1);
			}
		}

		class32 var4 = (class32) field906.method113(field872);
		if (var4 != null) {
			return var4;
		}

		class32 var5 = class32.method135(field873);
		if (var5 == null) {
			return null;
		}

		if (field876 != null) {
			for (int var6 = 0; var6 < field876.length; var6++) {
				var5.method149(field876[var6], field877[var6]);
			}
		}

		var5.method152(64, 768, -50, -10, -50, true);
		var5.field509 = true;
		field906.method114(var5, field872);
		return var5;
	}

	@ObfuscatedName("gc.a(IZ)Lfb;")
	public final class32 method344(int arg0) {
		if (field902 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field903[var3] && field903[var3] != 0) {
					var2 = field902[var3];
				}
			}

			if (var2 != -1) {
				return method339(var2).method344(1);
			}
		}

		class32 var4 = class32.method135(field873);
		if (var4 == null) {
			return null;
		}

		if (field876 != null) {
			for (int var5 = 0; var5 < field876.length; var5++) {
				var4.method149(field876[var5], field877[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("gc.a(III)Ljb;")
	public static final class36 method345(int arg0, int arg1) {
		class36 var2 = (class36) field907.method113(arg1);
		if (var2 != null && var2.field591 != arg0 && var2.field591 != -1) {
			var2.method118();
			var2 = null;
		}

		if (var2 != null) {
			return var2;
		}

		class59 var3 = method339(arg1);
		if (var3.field902 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var4 = -1;
			for (int var5 = 0; var5 < 10; var5++) {
				if (arg0 >= var3.field903[var5] && var3.field903[var5] != 0) {
					var4 = var3.field902[var5];
				}
			}

			if (var4 != -1) {
				var3 = method339(var4);
			}
		}

		class32 var6 = var3.method343(1);
		if (var6 == null) {
			return null;
		}

		class36 var7 = null;
		if (var3.field905 != -1) {
			var7 = method345(10, var3.field904);
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
		class34.method161(var8.field585, 32, 32);
		class34.method165(32, 0, 32, 0, 0);
		class35.method170();
		int var19 = class35.field571[var3.field879] * var3.field878 >> 16;
		int var20 = class35.field572[var3.field879] * var3.field878 >> 16;
		var6.method155(0, var3.field880, var3.field881, var3.field879, var3.field882, var6.field358 / 2 + var19 + var3.field883, var3.field883 + var20);

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

		if (var3.field905 != -1) {
			int var25 = var7.field590;
			int var26 = var7.field591;
			var7.field590 = 32;
			var7.field591 = 32;
			var7.method192(5, 5, 22, 22);
			var7.field590 = var25;
			var7.field591 = var26;
		}

		field907.method114(var8, arg1);
		class34.method161(var12, var14, var13);
		class34.method163(var18, var17, var15, var16);
		class35.field567 = var9;
		class35.field568 = var10;
		class35.field573 = var11;
		class35.field565 = true;

		if (var3.field885) {
			var8.field590 = 33;
		} else {
			var8.field590 = 32;
		}

		var8.field591 = arg0;
		return var8;
	}

	@ObfuscatedName("gc.a(BI)Z")
	public final boolean method346(int arg0) {
		int var2 = field890;
		int var3 = field891;
		int var4 = field896;
		if (arg0 == 1) {
			var2 = field893;
			var3 = field894;
			var4 = field897;
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

	@ObfuscatedName("gc.a(ZI)Lfb;")
	public final class32 method347(int arg0) {
		int var2 = field890;
		int var3 = field891;
		int var4 = field896;
		if (arg0 == 1) {
			var2 = field893;
			var3 = field894;
			var4 = field897;
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

		if (arg0 == 0 && field892 != 0) {
			var5.method148(field892, 0, 0);
		}

		if (arg0 == 1 && field895 != 0) {
			var5.method148(field895, 0, 0);
		}

		if (field876 != null) {
			for (int var11 = 0; var11 < field876.length; var11++) {
				var5.method149(field876[var11], field877[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("gc.a(II)Z")
	public final boolean method348(int arg0) {
		int var2 = field898;
		int var3 = field899;
		if (arg0 == 1) {
			var2 = field900;
			var3 = field901;
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

	@ObfuscatedName("gc.a(IB)Lfb;")
	public final class32 method349(int arg0) {
		int var2 = field898;
		int var3 = field899;
		if (arg0 == 1) {
			var2 = field900;
			var3 = field901;
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

		if (field876 != null) {
			for (int var7 = 0; var7 < field876.length; var7++) {
				var4.method149(field876[var7], field877[var7]);
			}
		}

		return var4;
	}
}
