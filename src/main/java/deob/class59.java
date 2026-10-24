package deob;

@ObfuscatedName("gc")
public final class class59 {

	@ObfuscatedName("gc.c")
	public static int field864;

	@ObfuscatedName("gc.d")
	public static int[] field865;

	@ObfuscatedName("gc.e")
	public static class38 field866;

	@ObfuscatedName("gc.f")
	public static class59[] field867;

	@ObfuscatedName("gc.g")
	public static int field868;

	@ObfuscatedName("gc.h")
	public long field869 = -1L;

	@ObfuscatedName("gc.i")
	public String field870;

	@ObfuscatedName("gc.j")
	public byte[] field871;

	@ObfuscatedName("gc.k")
	public byte field872 = 1;

	@ObfuscatedName("gc.l")
	public int[] field873;

	@ObfuscatedName("gc.m")
	public int[] field874;

	@ObfuscatedName("gc.n")
	public int field875 = -1;

	@ObfuscatedName("gc.o")
	public int field876 = -1;

	@ObfuscatedName("gc.p")
	public int field877 = -1;

	@ObfuscatedName("gc.q")
	public int field878 = -1;

	@ObfuscatedName("gc.r")
	public int field879 = -1;

	@ObfuscatedName("gc.s")
	public int[] field880;

	@ObfuscatedName("gc.t")
	public int[] field881;

	@ObfuscatedName("gc.u")
	public String[] field882;

	@ObfuscatedName("gc.v")
	public int field883 = -1;

	@ObfuscatedName("gc.w")
	public int field884 = -1;

	@ObfuscatedName("gc.x")
	public int field885 = -1;

	@ObfuscatedName("gc.y")
	public boolean field886 = true;

	@ObfuscatedName("gc.z")
	public int field887 = -1;

	@ObfuscatedName("gc.A")
	public int field888 = 128;

	@ObfuscatedName("gc.B")
	public int field889 = 128;

	@ObfuscatedName("gc.C")
	public boolean field890 = false;

	@ObfuscatedName("gc.F")
	public int field893 = -1;

	@ObfuscatedName("gc.G")
	public int field894 = 32;

	@ObfuscatedName("gc.H")
	public static class19 field895 = new class19(30);

	@ObfuscatedName("gc.D")
	public int field891;

	@ObfuscatedName("gc.E")
	public int field892;

	@ObfuscatedName("gc.a(Lxb;)V")
	public static final void method334(class50 arg0) {
		field866 = new class38(arg0.method295("npc.dat", null));
		class38 var1 = new class38(arg0.method295("npc.idx", null));
		field864 = var1.method227();
		field865 = new int[field864];
		int var2 = 2;
		for (int var3 = 0; var3 < field864; var3++) {
			field865[var3] = var2;
			var2 += var1.method227();
		}

		field867 = new class59[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field867[var4] = new class59();
		}
	}

	@ObfuscatedName("gc.a(I)V")
	public static final void method335() {
		field895 = null;
		field865 = null;
		field867 = null;
		field866 = null;
	}

	@ObfuscatedName("gc.b(I)Lgc;")
	public static final class59 method336(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field867[var1].field869) {
				return field867[var1];
			}
		}

		field868 = (field868 + 1) % 20;
		class59 var2 = field867[field868] = new class59();
		field866.field617 = field865[arg0];
		var2.field869 = arg0;
		var2.method337(field866);
		return var2;
	}

	@ObfuscatedName("gc.a(Llb;B)V")
	public final void method337(class38 arg0) {
		while (true) {
			int var2 = arg0.method225();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method225();
				field873 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field873[var4] = arg0.method227();
				}
			} else if (var2 == 2) {
				field870 = arg0.method232();
			} else if (var2 == 3) {
				field871 = arg0.method233();
			} else if (var2 == 12) {
				field872 = arg0.method226();
			} else if (var2 == 13) {
				field875 = arg0.method227();
			} else if (var2 == 14) {
				field876 = arg0.method227();
			} else if (var2 == 17) {
				field876 = arg0.method227();
				field877 = arg0.method227();
				field878 = arg0.method227();
				field879 = arg0.method227();
			} else if (var2 >= 30 && var2 < 40) {
				if (field882 == null) {
					field882 = new String[5];
				}

				field882[var2 - 30] = arg0.method232();
				if (field882[var2 - 30].equalsIgnoreCase("hidden")) {
					field882[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method225();
				field880 = new int[var5];
				field881 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field880[var6] = arg0.method227();
					field881[var6] = arg0.method227();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method225();
				field874 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field874[var8] = arg0.method227();
				}
			} else if (var2 == 90) {
				field883 = arg0.method227();
			} else if (var2 == 91) {
				field884 = arg0.method227();
			} else if (var2 == 92) {
				field885 = arg0.method227();
			} else if (var2 == 93) {
				field886 = false;
			} else if (var2 == 95) {
				field887 = arg0.method227();
			} else if (var2 == 97) {
				field888 = arg0.method227();
			} else if (var2 == 98) {
				field889 = arg0.method227();
			} else if (var2 == 99) {
				field890 = true;
			} else if (var2 == 100) {
				field891 = arg0.method226();
			} else if (var2 == 101) {
				field892 = arg0.method226() * 5;
			} else if (var2 == 102) {
				field893 = arg0.method227();
			} else if (var2 == 103) {
				field894 = arg0.method227();
			}
		}
	}

	@ObfuscatedName("gc.a(III[I)Leb;")
	public final class31 method338(int arg0, int arg1, int[] arg2) {
		class31 var4 = (class31) field895.method101(field869);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < field873.length; var6++) {
				if (!class31.method126(field873[var6])) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			}

			class31[] var7 = new class31[field873.length];
			for (int var8 = 0; var8 < field873.length; var8++) {
				var7[var8] = class31.method125(field873[var8]);
			}

			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new class31(var7.length, var7);
			}

			if (field880 != null) {
				for (int var9 = 0; var9 < field880.length; var9++) {
					var4.method139(field880[var9], field881[var9]);
				}
			}

			var4.method132();
			var4.method142(field891 + 64, field892 + 850, -30, -50, -30, true);
			field895.method102(var4, field869);
		}

		class31 var10 = class31.field478;
		var10.method127(var4, class7.method48(arg0) & class7.method48(arg1));

		if (arg0 != -1 && arg1 != -1) {
			var10.method134(arg2, arg1, arg0);
		} else if (arg0 != -1) {
			var10.method133(arg0);
		}

		if (field888 != 128 || field889 != 128) {
			var10.method141(field888, field888, field889);
		}

		var10.method129();
		var10.field515 = null;
		var10.field514 = null;

		if (field872 == 1) {
			var10.field516 = true;
		}

		return var10;
	}

	@ObfuscatedName("gc.c(I)Leb;")
	public final class31 method339() {
		if (field874 == null) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < field874.length; var2++) {
			if (!class31.method126(field874[var2])) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class31[] var3 = new class31[field874.length];
		for (int var4 = 0; var4 < field874.length; var4++) {
			var3[var4] = class31.method125(field874[var4]);
		}

		class31 var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new class31(var3.length, var3);
		}

		if (field880 != null) {
			for (int var6 = 0; var6 < field880.length; var6++) {
				var5.method139(field880[var6], field881[var6]);
			}
		}

		return var5;
	}
}
