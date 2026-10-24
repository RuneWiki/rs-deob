package deob;

@ObfuscatedName("hc")
public final class class60 {

	@ObfuscatedName("hc.c")
	public static int field871;

	@ObfuscatedName("hc.d")
	public static int[] field872;

	@ObfuscatedName("hc.e")
	public static class39 field873;

	@ObfuscatedName("hc.f")
	public static class60[] field874;

	@ObfuscatedName("hc.g")
	public static int field875;

	@ObfuscatedName("hc.h")
	public long field876 = -1L;

	@ObfuscatedName("hc.i")
	public String field877;

	@ObfuscatedName("hc.j")
	public byte[] field878;

	@ObfuscatedName("hc.k")
	public byte field879 = 1;

	@ObfuscatedName("hc.l")
	public int[] field880;

	@ObfuscatedName("hc.m")
	public int[] field881;

	@ObfuscatedName("hc.n")
	public int field882 = -1;

	@ObfuscatedName("hc.o")
	public int field883 = -1;

	@ObfuscatedName("hc.p")
	public int field884 = -1;

	@ObfuscatedName("hc.q")
	public int field885 = -1;

	@ObfuscatedName("hc.r")
	public int field886 = -1;

	@ObfuscatedName("hc.s")
	public int[] field887;

	@ObfuscatedName("hc.t")
	public int[] field888;

	@ObfuscatedName("hc.u")
	public String[] field889;

	@ObfuscatedName("hc.v")
	public int field890 = -1;

	@ObfuscatedName("hc.w")
	public int field891 = -1;

	@ObfuscatedName("hc.x")
	public int field892 = -1;

	@ObfuscatedName("hc.y")
	public boolean field893 = true;

	@ObfuscatedName("hc.z")
	public int field894 = -1;

	@ObfuscatedName("hc.A")
	public int field895 = 128;

	@ObfuscatedName("hc.B")
	public int field896 = 128;

	@ObfuscatedName("hc.C")
	public boolean field897 = false;

	@ObfuscatedName("hc.F")
	public int field900 = -1;

	@ObfuscatedName("hc.G")
	public int field901 = 32;

	@ObfuscatedName("hc.H")
	public static class19 field902 = new class19(30);

	@ObfuscatedName("hc.D")
	public int field898;

	@ObfuscatedName("hc.E")
	public int field899;

	@ObfuscatedName("hc.a(Lyb;)V")
	public static final void method337(class51 arg0) {
		field873 = new class39(arg0.method298("npc.dat", null));
		class39 var1 = new class39(arg0.method298("npc.idx", null));
		field871 = var1.method230();
		field872 = new int[field871];
		int var2 = 2;
		for (int var3 = 0; var3 < field871; var3++) {
			field872[var3] = var2;
			var2 += var1.method230();
		}

		field874 = new class60[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field874[var4] = new class60();
		}
	}

	@ObfuscatedName("hc.a(I)V")
	public static final void method338() {
		field902 = null;
		field872 = null;
		field874 = null;
		field873 = null;
	}

	@ObfuscatedName("hc.b(I)Lhc;")
	public static final class60 method339(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field874[var1].field876) {
				return field874[var1];
			}
		}

		field875 = (field875 + 1) % 20;
		class60 var2 = field874[field875] = new class60();
		field873.field625 = field872[arg0];
		var2.field876 = arg0;
		var2.method340(field873);
		return var2;
	}

	@ObfuscatedName("hc.a(BLmb;)V")
	public final void method340(class39 arg0) {
		while (true) {
			int var2 = arg0.method228();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method228();
				field880 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field880[var4] = arg0.method230();
				}
			} else if (var2 == 2) {
				field877 = arg0.method235();
			} else if (var2 == 3) {
				field878 = arg0.method236();
			} else if (var2 == 12) {
				field879 = arg0.method229();
			} else if (var2 == 13) {
				field882 = arg0.method230();
			} else if (var2 == 14) {
				field883 = arg0.method230();
			} else if (var2 == 17) {
				field883 = arg0.method230();
				field884 = arg0.method230();
				field885 = arg0.method230();
				field886 = arg0.method230();
			} else if (var2 >= 30 && var2 < 40) {
				if (field889 == null) {
					field889 = new String[5];
				}

				field889[var2 - 30] = arg0.method235();
				if (field889[var2 - 30].equalsIgnoreCase("hidden")) {
					field889[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method228();
				field887 = new int[var5];
				field888 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field887[var6] = arg0.method230();
					field888[var6] = arg0.method230();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method228();
				field881 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field881[var8] = arg0.method230();
				}
			} else if (var2 == 90) {
				field890 = arg0.method230();
			} else if (var2 == 91) {
				field891 = arg0.method230();
			} else if (var2 == 92) {
				field892 = arg0.method230();
			} else if (var2 == 93) {
				field893 = false;
			} else if (var2 == 95) {
				field894 = arg0.method230();
			} else if (var2 == 97) {
				field895 = arg0.method230();
			} else if (var2 == 98) {
				field896 = arg0.method230();
			} else if (var2 == 99) {
				field897 = true;
			} else if (var2 == 100) {
				field898 = arg0.method229();
			} else if (var2 == 101) {
				field899 = arg0.method229() * 5;
			} else if (var2 == 102) {
				field900 = arg0.method230();
			} else if (var2 == 103) {
				field901 = arg0.method230();
			}
		}
	}

	@ObfuscatedName("hc.a(ZII[I)Leb;")
	public final class31 method341(int arg0, int arg1, int[] arg2) {
		class31 var4 = (class31) field902.method101(field876);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < field880.length; var6++) {
				if (!class31.method126(field880[var6])) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			}

			class31[] var7 = new class31[field880.length];
			for (int var8 = 0; var8 < field880.length; var8++) {
				var7[var8] = class31.method125(field880[var8]);
			}

			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new class31(var7, var7.length);
			}

			if (field887 != null) {
				for (int var9 = 0; var9 < field887.length; var9++) {
					var4.method139(field887[var9], field888[var9]);
				}
			}

			var4.method132();
			var4.method142(field898 + 64, field899 + 850, -30, -50, -30, true);
			field902.method102(var4, field876);
		}

		class31 var10 = class31.field476;
		var10.method127(var4, class7.method48(arg1) & class7.method48(arg0));

		if (arg1 != -1 && arg0 != -1) {
			var10.method134(arg1, arg2, arg0);
		} else if (arg1 != -1) {
			var10.method133(arg1);
		}

		if (field895 != 128 || field896 != 128) {
			var10.method141(field895, field895, field896);
		}

		var10.method129();
		var10.field513 = null;
		var10.field512 = null;

		if (field879 == 1) {
			var10.field514 = true;
		}

		return var10;
	}

	@ObfuscatedName("hc.a(B)Leb;")
	public final class31 method342() {
		if (field881 == null) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < field881.length; var2++) {
			if (!class31.method126(field881[var2])) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class31[] var3 = new class31[field881.length];
		for (int var4 = 0; var4 < field881.length; var4++) {
			var3[var4] = class31.method125(field881[var4]);
		}

		class31 var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new class31(var3, var3.length);
		}

		if (field887 != null) {
			for (int var6 = 0; var6 < field887.length; var6++) {
				var5.method139(field887[var6], field888[var6]);
			}
		}

		return var5;
	}
}
