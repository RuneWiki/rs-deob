package deob;

@ObfuscatedName("gc")
public final class class59 {

	@ObfuscatedName("gc.f")
	public static int field862;

	@ObfuscatedName("gc.g")
	public static int[] field863;

	@ObfuscatedName("gc.h")
	public static class38 field864;

	@ObfuscatedName("gc.i")
	public static class59[] field865;

	@ObfuscatedName("gc.j")
	public static int field866;

	@ObfuscatedName("gc.k")
	public long field867 = -1L;

	@ObfuscatedName("gc.l")
	public String field868;

	@ObfuscatedName("gc.m")
	public byte[] field869;

	@ObfuscatedName("gc.n")
	public byte field870 = 1;

	@ObfuscatedName("gc.o")
	public int[] field871;

	@ObfuscatedName("gc.p")
	public int[] field872;

	@ObfuscatedName("gc.q")
	public int field873 = -1;

	@ObfuscatedName("gc.r")
	public int field874 = -1;

	@ObfuscatedName("gc.s")
	public int field875 = -1;

	@ObfuscatedName("gc.t")
	public int field876 = -1;

	@ObfuscatedName("gc.u")
	public int field877 = -1;

	@ObfuscatedName("gc.v")
	public int[] field878;

	@ObfuscatedName("gc.w")
	public int[] field879;

	@ObfuscatedName("gc.x")
	public String[] field880;

	@ObfuscatedName("gc.y")
	public int field881 = -1;

	@ObfuscatedName("gc.z")
	public int field882 = -1;

	@ObfuscatedName("gc.A")
	public int field883 = -1;

	@ObfuscatedName("gc.B")
	public boolean field884 = true;

	@ObfuscatedName("gc.C")
	public int field885 = -1;

	@ObfuscatedName("gc.D")
	public int field886 = 128;

	@ObfuscatedName("gc.E")
	public int field887 = 128;

	@ObfuscatedName("gc.F")
	public boolean field888 = false;

	@ObfuscatedName("gc.I")
	public int field891 = -1;

	@ObfuscatedName("gc.J")
	public int field892 = 32;

	@ObfuscatedName("gc.K")
	public static class19 field893 = new class19(30);

	@ObfuscatedName("gc.G")
	public int field889;

	@ObfuscatedName("gc.H")
	public int field890;

	@ObfuscatedName("gc.a(Lxb;)V")
	public static final void method333(class50 arg0) {
		field864 = new class38(arg0.method294("npc.dat", null));
		class38 var1 = new class38(arg0.method294("npc.idx", null));
		field862 = var1.method226();
		field863 = new int[field862];
		int var2 = 2;
		for (int var3 = 0; var3 < field862; var3++) {
			field863[var3] = var2;
			var2 += var1.method226();
		}

		field865 = new class59[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field865[var4] = new class59();
		}
	}

	@ObfuscatedName("gc.a(B)V")
	public static final void method334() {
		field893 = null;
		field863 = null;
		field865 = null;
		field864 = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static final class59 method335(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field865[var1].field867) {
				return field865[var1];
			}
		}

		field866 = (field866 + 1) % 20;
		class59 var2 = field865[field866] = new class59();
		field864.field616 = field863[arg0];
		var2.field867 = arg0;
		var2.method336(field864);
		return var2;
	}

	@ObfuscatedName("gc.a(Llb;I)V")
	public final void method336(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method224();
				field871 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field871[var4] = arg0.method226();
				}
			} else if (var2 == 2) {
				field868 = arg0.method231();
			} else if (var2 == 3) {
				field869 = arg0.method232();
			} else if (var2 == 12) {
				field870 = arg0.method225();
			} else if (var2 == 13) {
				field873 = arg0.method226();
			} else if (var2 == 14) {
				field874 = arg0.method226();
			} else if (var2 == 17) {
				field874 = arg0.method226();
				field875 = arg0.method226();
				field876 = arg0.method226();
				field877 = arg0.method226();
			} else if (var2 >= 30 && var2 < 40) {
				if (field880 == null) {
					field880 = new String[5];
				}

				field880[var2 - 30] = arg0.method231();
				if (field880[var2 - 30].equalsIgnoreCase("hidden")) {
					field880[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method224();
				field878 = new int[var5];
				field879 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field878[var6] = arg0.method226();
					field879[var6] = arg0.method226();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method224();
				field872 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field872[var8] = arg0.method226();
				}
			} else if (var2 == 90) {
				field881 = arg0.method226();
			} else if (var2 == 91) {
				field882 = arg0.method226();
			} else if (var2 == 92) {
				field883 = arg0.method226();
			} else if (var2 == 93) {
				field884 = false;
			} else if (var2 == 95) {
				field885 = arg0.method226();
			} else if (var2 == 97) {
				field886 = arg0.method226();
			} else if (var2 == 98) {
				field887 = arg0.method226();
			} else if (var2 == 99) {
				field888 = true;
			} else if (var2 == 100) {
				field889 = arg0.method225();
			} else if (var2 == 101) {
				field890 = arg0.method225() * 5;
			} else if (var2 == 102) {
				field891 = arg0.method226();
			} else if (var2 == 103) {
				field892 = arg0.method226();
			}
		}
	}

	@ObfuscatedName("gc.a(I[III)Leb;")
	public final class31 method337(int arg0, int[] arg1, int arg2) {
		class31 var4 = (class31) field893.method101(field867);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < field871.length; var6++) {
				if (!class31.method126(field871[var6])) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			}

			class31[] var7 = new class31[field871.length];
			for (int var8 = 0; var8 < field871.length; var8++) {
				var7[var8] = class31.method125(field871[var8]);
			}

			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new class31(var7.length, var7);
			}

			if (field878 != null) {
				for (int var9 = 0; var9 < field878.length; var9++) {
					var4.method139(field878[var9], field879[var9]);
				}
			}

			var4.method132();
			var4.method142(field889 + 64, field890 + 850, -30, -50, -30, true);
			field893.method102(field867, var4);
		}

		class31 var10 = class31.field477;
		var10.method127(class7.method48(arg0) & class7.method48(arg2), var4);

		if (arg0 != -1 && arg2 != -1) {
			var10.method134(arg2, arg1, arg0);
		} else if (arg0 != -1) {
			var10.method133(arg0);
		}

		if (field886 != 128 || field887 != 128) {
			var10.method141(field886, field887, field886);
		}

		var10.method129();
		var10.field514 = null;
		var10.field513 = null;

		if (field870 == 1) {
			var10.field515 = true;
		}

		return var10;
	}

	@ObfuscatedName("gc.a(Z)Leb;")
	public final class31 method338() {
		if (field872 == null) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < field872.length; var2++) {
			if (!class31.method126(field872[var2])) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class31[] var3 = new class31[field872.length];
		for (int var4 = 0; var4 < field872.length; var4++) {
			var3[var4] = class31.method125(field872[var4]);
		}

		class31 var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new class31(var3.length, var3);
		}

		if (field878 != null) {
			for (int var6 = 0; var6 < field878.length; var6++) {
				var5.method139(field878[var6], field879[var6]);
			}
		}

		return var5;
	}
}
