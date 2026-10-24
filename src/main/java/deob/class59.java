package deob;

@ObfuscatedName("gc")
public final class class59 {

	@ObfuscatedName("gc.b")
	public static client field873;

	@ObfuscatedName("gc.c")
	public static int field874;

	@ObfuscatedName("gc.d")
	public static int[] field875;

	@ObfuscatedName("gc.e")
	public static class38 field876;

	@ObfuscatedName("gc.f")
	public static class59[] field877;

	@ObfuscatedName("gc.g")
	public static int field878;

	@ObfuscatedName("gc.h")
	public long field879 = -1L;

	@ObfuscatedName("gc.i")
	public String field880;

	@ObfuscatedName("gc.j")
	public byte[] field881;

	@ObfuscatedName("gc.k")
	public byte field882 = 1;

	@ObfuscatedName("gc.l")
	public int[] field883;

	@ObfuscatedName("gc.m")
	public int[] field884;

	@ObfuscatedName("gc.n")
	public int field885 = -1;

	@ObfuscatedName("gc.o")
	public int field886 = -1;

	@ObfuscatedName("gc.p")
	public int field887 = -1;

	@ObfuscatedName("gc.q")
	public int field888 = -1;

	@ObfuscatedName("gc.r")
	public int field889 = -1;

	@ObfuscatedName("gc.s")
	public int[] field890;

	@ObfuscatedName("gc.t")
	public int[] field891;

	@ObfuscatedName("gc.u")
	public String[] field892;

	@ObfuscatedName("gc.v")
	public int field893 = -1;

	@ObfuscatedName("gc.w")
	public int field894 = -1;

	@ObfuscatedName("gc.x")
	public int field895 = -1;

	@ObfuscatedName("gc.y")
	public boolean field896 = true;

	@ObfuscatedName("gc.z")
	public int field897 = -1;

	@ObfuscatedName("gc.A")
	public int field898 = 128;

	@ObfuscatedName("gc.B")
	public int field899 = 128;

	@ObfuscatedName("gc.C")
	public boolean field900 = false;

	@ObfuscatedName("gc.F")
	public int field903 = -1;

	@ObfuscatedName("gc.G")
	public int field904 = 32;

	@ObfuscatedName("gc.I")
	public int field906 = -1;

	@ObfuscatedName("gc.J")
	public int field907 = -1;

	@ObfuscatedName("gc.K")
	public static class19 field908 = new class19(30);

	@ObfuscatedName("gc.D")
	public int field901;

	@ObfuscatedName("gc.E")
	public int field902;

	@ObfuscatedName("gc.H")
	public int[] field905;

	@ObfuscatedName("gc.a(Lxb;)V")
	public static final void method339(class50 arg0) {
		field876 = new class38(arg0.method299("npc.dat", null));
		class38 var1 = new class38(arg0.method299("npc.idx", null));
		field874 = var1.method231();
		field875 = new int[field874];
		int var2 = 2;
		for (int var3 = 0; var3 < field874; var3++) {
			field875[var3] = var2;
			var2 += var1.method231();
		}

		field877 = new class59[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field877[var4] = new class59();
		}
	}

	@ObfuscatedName("gc.a(I)V")
	public static final void method340() {
		field908 = null;
		field875 = null;
		field877 = null;
		field876 = null;
	}

	@ObfuscatedName("gc.b(I)Lgc;")
	public static final class59 method341(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field877[var1].field879) {
				return field877[var1];
			}
		}

		field878 = (field878 + 1) % 20;
		class59 var2 = field877[field878] = new class59();
		field876.field621 = field875[arg0];
		var2.field879 = arg0;
		var2.method342(field876);
		return var2;
	}

	@ObfuscatedName("gc.a(Llb;I)V")
	public final void method342(class38 arg0) {
		while (true) {
			int var2 = arg0.method229();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method229();
				field883 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field883[var4] = arg0.method231();
				}
			} else if (var2 == 2) {
				field880 = arg0.method236();
			} else if (var2 == 3) {
				field881 = arg0.method237();
			} else if (var2 == 12) {
				field882 = arg0.method230();
			} else if (var2 == 13) {
				field885 = arg0.method231();
			} else if (var2 == 14) {
				field886 = arg0.method231();
			} else if (var2 == 17) {
				field886 = arg0.method231();
				field887 = arg0.method231();
				field888 = arg0.method231();
				field889 = arg0.method231();
			} else if (var2 >= 30 && var2 < 40) {
				if (field892 == null) {
					field892 = new String[5];
				}

				field892[var2 - 30] = arg0.method236();
				if (field892[var2 - 30].equalsIgnoreCase("hidden")) {
					field892[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method229();
				field890 = new int[var5];
				field891 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field890[var6] = arg0.method231();
					field891[var6] = arg0.method231();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method229();
				field884 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field884[var8] = arg0.method231();
				}
			} else if (var2 == 90) {
				field893 = arg0.method231();
			} else if (var2 == 91) {
				field894 = arg0.method231();
			} else if (var2 == 92) {
				field895 = arg0.method231();
			} else if (var2 == 93) {
				field896 = false;
			} else if (var2 == 95) {
				field897 = arg0.method231();
			} else if (var2 == 97) {
				field898 = arg0.method231();
			} else if (var2 == 98) {
				field899 = arg0.method231();
			} else if (var2 == 99) {
				field900 = true;
			} else if (var2 == 100) {
				field901 = arg0.method230();
			} else if (var2 == 101) {
				field902 = arg0.method230() * 5;
			} else if (var2 == 102) {
				field903 = arg0.method231();
			} else if (var2 == 103) {
				field904 = arg0.method231();
			} else if (var2 == 106) {
				field906 = arg0.method231();
				if (field906 == 0xFFFF) {
					field906 = -1;
				}

				field907 = arg0.method231();
				if (field907 == 0xFFFF) {
					field907 = -1;
				}

				int var9 = arg0.method229();
				field905 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field905[var10] = arg0.method231();
					if (field905[var10] == 0xFFFF) {
						field905[var10] = -1;
					}
				}
			}
		}
	}

	@ObfuscatedName("gc.a(I[IIZ)Leb;")
	public final class31 method343(int arg0, int[] arg1, int arg2) {
		if (field905 != null) {
			class59 var4 = method345();
			if (var4 == null) {
				return null;
			}

			return var4.method343(arg0, arg1, arg2);
		}

		class31 var5 = (class31) field908.method101(field879);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field883.length; var7++) {
				if (!class31.method127(field883[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			class31[] var8 = new class31[field883.length];
			for (int var9 = 0; var9 < field883.length; var9++) {
				var8[var9] = class31.method126(field883[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new class31(var8.length, var8);
			}

			if (field890 != null) {
				for (int var10 = 0; var10 < field890.length; var10++) {
					var5.method140(field890[var10], field891[var10]);
				}
			}

			var5.method133();
			var5.method143(field901 + 64, field902 + 850, -30, -50, -30, true);
			field908.method102(field879, var5);
		}

		class31 var11 = class31.field482;
		var11.method128(var5, class7.method48(arg2) & class7.method48(arg0));

		if (arg2 != -1 && arg0 != -1) {
			var11.method135(arg0, arg2, arg1);
		} else if (arg2 != -1) {
			var11.method134(arg2);
		}

		if (field898 != 128 || field899 != 128) {
			var11.method142(field898, field898, field899);
		}

		var11.method130();
		var11.field519 = null;
		var11.field518 = null;

		if (field882 == 1) {
			var11.field520 = true;
		}

		return var11;
	}

	@ObfuscatedName("gc.c(I)Leb;")
	public final class31 method344() {
		if (field905 != null) {
			class59 var1 = method345();
			if (var1 == null) {
				return null;
			}

			return var1.method344();
		} else if (field884 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field884.length; var3++) {
				if (!class31.method127(field884[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			class31[] var4 = new class31[field884.length];
			for (int var5 = 0; var5 < field884.length; var5++) {
				var4[var5] = class31.method126(field884[var5]);
			}

			class31 var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new class31(var4.length, var4);
			}

			if (field890 != null) {
				for (int var7 = 0; var7 < field890.length; var7++) {
					var6.method140(field890[var7], field891[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("gc.d(I)Lgc;")
	public final class59 method345() {
		int var1 = -1;
		if (field906 != -1) {
			class69 var2 = class69.field1030[field906];
			int var3 = var2.field1032;
			int var4 = var2.field1033;
			int var5 = var2.field1034;
			int var6 = client.field1166[var5 - var4];
			var1 = field873.field1202[var3] >> var4 & var6;
		} else if (field907 != -1) {
			var1 = field873.field1202[field907];
		}

		if (var1 >= 0 && var1 < field905.length && field905[var1] != -1) {
			return method341(field905[var1]);
		}

		return null;
	}
}
