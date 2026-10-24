package deob;

@ObfuscatedName("gc")
public final class class59 {

	@ObfuscatedName("gc.h")
	public static client field874;

	@ObfuscatedName("gc.i")
	public static int field875;

	@ObfuscatedName("gc.j")
	public static int[] field876;

	@ObfuscatedName("gc.k")
	public static class38 field877;

	@ObfuscatedName("gc.l")
	public static class59[] field878;

	@ObfuscatedName("gc.m")
	public static int field879;

	@ObfuscatedName("gc.n")
	public long field880 = -1L;

	@ObfuscatedName("gc.o")
	public String field881;

	@ObfuscatedName("gc.p")
	public byte[] field882;

	@ObfuscatedName("gc.q")
	public byte field883 = 1;

	@ObfuscatedName("gc.r")
	public int[] field884;

	@ObfuscatedName("gc.s")
	public int[] field885;

	@ObfuscatedName("gc.t")
	public int field886 = -1;

	@ObfuscatedName("gc.u")
	public int field887 = -1;

	@ObfuscatedName("gc.v")
	public int field888 = -1;

	@ObfuscatedName("gc.w")
	public int field889 = -1;

	@ObfuscatedName("gc.x")
	public int field890 = -1;

	@ObfuscatedName("gc.y")
	public int[] field891;

	@ObfuscatedName("gc.z")
	public int[] field892;

	@ObfuscatedName("gc.B")
	public int field894 = -1;

	@ObfuscatedName("gc.C")
	public int field895 = -1;

	@ObfuscatedName("gc.D")
	public int field896 = -1;

	@ObfuscatedName("gc.E")
	public boolean field897 = true;

	@ObfuscatedName("gc.F")
	public int field898 = -1;

	@ObfuscatedName("gc.G")
	public int field899 = 128;

	@ObfuscatedName("gc.H")
	public int field900 = 128;

	@ObfuscatedName("gc.I")
	public boolean field901 = false;

	@ObfuscatedName("gc.L")
	public int field904 = -1;

	@ObfuscatedName("gc.M")
	public int field905 = 32;

	@ObfuscatedName("gc.O")
	public int field907 = -1;

	@ObfuscatedName("gc.P")
	public int field908 = -1;

	@ObfuscatedName("gc.Q")
	public static class19 field909 = new class19(30);

	@ObfuscatedName("gc.J")
	public int field902;

	@ObfuscatedName("gc.K")
	public int field903;

	@ObfuscatedName("gc.N")
	public int[] field906;

	@ObfuscatedName("gc.A")
	public String[] field893;

	@ObfuscatedName("gc.a(Lxb;)V")
	public static final void method339(class50 arg0) {
		field877 = new class38(arg0.method299("npc.dat", null));
		class38 var1 = new class38(arg0.method299("npc.idx", null));
		field875 = var1.method231();
		field876 = new int[field875];
		int var2 = 2;
		for (int var3 = 0; var3 < field875; var3++) {
			field876[var3] = var2;
			var2 += var1.method231();
		}

		field878 = new class59[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field878[var4] = new class59();
		}
	}

	@ObfuscatedName("gc.a(B)V")
	public static final void method340() {
		field909 = null;
		field876 = null;
		field878 = null;
		field877 = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static final class59 method341(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field878[var1].field880) {
				return field878[var1];
			}
		}

		field879 = (field879 + 1) % 20;
		class59 var2 = field878[field879] = new class59();
		field877.field621 = field876[arg0];
		var2.field880 = arg0;
		var2.method342(field877);
		return var2;
	}

	@ObfuscatedName("gc.a(Llb;Z)V")
	public final void method342(class38 arg0) {
		while (true) {
			int var2 = arg0.method229();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method229();
				field884 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field884[var4] = arg0.method231();
				}
			} else if (var2 == 2) {
				field881 = arg0.method236();
			} else if (var2 == 3) {
				field882 = arg0.method237();
			} else if (var2 == 12) {
				field883 = arg0.method230();
			} else if (var2 == 13) {
				field886 = arg0.method231();
			} else if (var2 == 14) {
				field887 = arg0.method231();
			} else if (var2 == 17) {
				field887 = arg0.method231();
				field888 = arg0.method231();
				field889 = arg0.method231();
				field890 = arg0.method231();
			} else if (var2 >= 30 && var2 < 40) {
				if (field893 == null) {
					field893 = new String[5];
				}

				field893[var2 - 30] = arg0.method236();
				if (field893[var2 - 30].equalsIgnoreCase("hidden")) {
					field893[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method229();
				field891 = new int[var5];
				field892 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field891[var6] = arg0.method231();
					field892[var6] = arg0.method231();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method229();
				field885 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field885[var8] = arg0.method231();
				}
			} else if (var2 == 90) {
				field894 = arg0.method231();
			} else if (var2 == 91) {
				field895 = arg0.method231();
			} else if (var2 == 92) {
				field896 = arg0.method231();
			} else if (var2 == 93) {
				field897 = false;
			} else if (var2 == 95) {
				field898 = arg0.method231();
			} else if (var2 == 97) {
				field899 = arg0.method231();
			} else if (var2 == 98) {
				field900 = arg0.method231();
			} else if (var2 == 99) {
				field901 = true;
			} else if (var2 == 100) {
				field902 = arg0.method230();
			} else if (var2 == 101) {
				field903 = arg0.method230() * 5;
			} else if (var2 == 102) {
				field904 = arg0.method231();
			} else if (var2 == 103) {
				field905 = arg0.method231();
			} else if (var2 == 106) {
				field907 = arg0.method231();
				if (field907 == 0xFFFF) {
					field907 = -1;
				}

				field908 = arg0.method231();
				if (field908 == 0xFFFF) {
					field908 = -1;
				}

				int var9 = arg0.method229();
				field906 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field906[var10] = arg0.method231();
					if (field906[var10] == 0xFFFF) {
						field906[var10] = -1;
					}
				}
			}
		}
	}

	@ObfuscatedName("gc.a(IZ[II)Leb;")
	public final class31 method343(int arg0, int[] arg1, int arg2) {
		if (field906 != null) {
			class59 var4 = method345();
			if (var4 == null) {
				return null;
			}

			return var4.method343(arg0, arg1, arg2);
		}

		class31 var5 = (class31) field909.method101(field880);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field884.length; var7++) {
				if (!class31.method127(field884[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			class31[] var8 = new class31[field884.length];
			for (int var9 = 0; var9 < field884.length; var9++) {
				var8[var9] = class31.method126(field884[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new class31(var8.length, var8);
			}

			if (field891 != null) {
				for (int var10 = 0; var10 < field891.length; var10++) {
					var5.method140(field891[var10], field892[var10]);
				}
			}

			var5.method133();
			var5.method143(field902 + 64, field903 + 850, -30, -50, -30, true);
			field909.method102(var5, field880);
		}

		class31 var11 = class31.field482;
		var11.method128(class7.method48(arg2) & class7.method48(arg0), var5);

		if (arg2 != -1 && arg0 != -1) {
			var11.method135(arg0, arg1, arg2);
		} else if (arg2 != -1) {
			var11.method134(arg2);
		}

		if (field899 != 128 || field900 != 128) {
			var11.method142(field900, field899, field899);
		}

		var11.method130();
		var11.field519 = null;
		var11.field518 = null;

		if (field883 == 1) {
			var11.field520 = true;
		}

		return var11;
	}

	@ObfuscatedName("gc.b(B)Leb;")
	public final class31 method344() {
		if (field906 != null) {
			class59 var1 = method345();
			if (var1 == null) {
				return null;
			}

			return var1.method344();
		} else if (field885 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field885.length; var3++) {
				if (!class31.method127(field885[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			class31[] var4 = new class31[field885.length];
			for (int var5 = 0; var5 < field885.length; var5++) {
				var4[var5] = class31.method126(field885[var5]);
			}

			class31 var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new class31(var4.length, var4);
			}

			if (field891 != null) {
				for (int var7 = 0; var7 < field891.length; var7++) {
					var6.method140(field891[var7], field892[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("gc.c(B)Lgc;")
	public final class59 method345() {
		int var1 = -1;
		if (field907 != -1) {
			class69 var2 = class69.field1031[field907];
			int var3 = var2.field1033;
			int var4 = var2.field1034;
			int var5 = var2.field1035;
			int var6 = client.field1192[var5 - var4];
			var1 = field874.field1075[var3] >> var4 & var6;
		} else if (field908 != -1) {
			var1 = field874.field1075[field908];
		}

		if (var1 >= 0 && var1 < field906.length && field906[var1] != -1) {
			return method341(field906[var1]);
		}

		return null;
	}
}
