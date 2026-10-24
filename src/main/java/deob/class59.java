package deob;

@ObfuscatedName("gc")
public final class class59 {

	@ObfuscatedName("gc.e")
	public static int field859;

	@ObfuscatedName("gc.f")
	public static int[] field860;

	@ObfuscatedName("gc.g")
	public static class39 field861;

	@ObfuscatedName("gc.h")
	public static class59[] field862;

	@ObfuscatedName("gc.i")
	public static int field863;

	@ObfuscatedName("gc.j")
	public long field864 = -1L;

	@ObfuscatedName("gc.k")
	public String field865;

	@ObfuscatedName("gc.l")
	public byte[] field866;

	@ObfuscatedName("gc.m")
	public byte field867 = 1;

	@ObfuscatedName("gc.n")
	public int[] field868;

	@ObfuscatedName("gc.o")
	public int[] field869;

	@ObfuscatedName("gc.p")
	public int field870 = -1;

	@ObfuscatedName("gc.q")
	public int field871 = -1;

	@ObfuscatedName("gc.r")
	public int field872 = -1;

	@ObfuscatedName("gc.s")
	public int field873 = -1;

	@ObfuscatedName("gc.t")
	public int field874 = -1;

	@ObfuscatedName("gc.u")
	public boolean field875 = false;

	@ObfuscatedName("gc.v")
	public int[] field876;

	@ObfuscatedName("gc.w")
	public int[] field877;

	@ObfuscatedName("gc.x")
	public String[] field878;

	@ObfuscatedName("gc.y")
	public int field879 = -1;

	@ObfuscatedName("gc.z")
	public int field880 = -1;

	@ObfuscatedName("gc.A")
	public int field881 = -1;

	@ObfuscatedName("gc.B")
	public boolean field882 = true;

	@ObfuscatedName("gc.C")
	public int field883 = -1;

	@ObfuscatedName("gc.D")
	public int field884 = 128;

	@ObfuscatedName("gc.E")
	public int field885 = 128;

	@ObfuscatedName("gc.F")
	public boolean field886 = false;

	@ObfuscatedName("gc.I")
	public int field889 = -1;

	@ObfuscatedName("gc.J")
	public static class20 field890 = new class20(30);

	@ObfuscatedName("gc.G")
	public int field887;

	@ObfuscatedName("gc.H")
	public int field888;

	@ObfuscatedName("gc.a(Lyb;)V")
	public static final void method340(class51 arg0) {
		field861 = new class39(arg0.method308("npc.dat", null));
		class39 var1 = new class39(arg0.method308("npc.idx", null));
		field859 = var1.method240();
		field860 = new int[field859];
		int var2 = 2;
		for (int var3 = 0; var3 < field859; var3++) {
			field860[var3] = var2;
			var2 += var1.method240();
		}

		field862 = new class59[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field862[var4] = new class59();
		}
	}

	@ObfuscatedName("gc.a(B)V")
	public static final void method341() {
		field890 = null;
		field860 = null;
		field862 = null;
		field861 = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static final class59 method342(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field862[var1].field864) {
				return field862[var1];
			}
		}

		field863 = (field863 + 1) % 20;
		class59 var2 = field862[field863] = new class59();
		field861.field623 = field860[arg0];
		var2.field864 = arg0;
		var2.method343(field861);
		return var2;
	}

	@ObfuscatedName("gc.a(ZLmb;)V")
	public final void method343(class39 arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method238();
				field868 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field868[var4] = arg0.method240();
				}
			} else if (var2 == 2) {
				field865 = arg0.method245();
			} else if (var2 == 3) {
				field866 = arg0.method246();
			} else if (var2 == 12) {
				field867 = arg0.method239();
			} else if (var2 == 13) {
				field870 = arg0.method240();
			} else if (var2 == 14) {
				field871 = arg0.method240();
			} else if (var2 == 16) {
				field875 = true;
			} else if (var2 == 17) {
				field871 = arg0.method240();
				field872 = arg0.method240();
				field873 = arg0.method240();
				field874 = arg0.method240();
			} else if (var2 >= 30 && var2 < 40) {
				if (field878 == null) {
					field878 = new String[5];
				}

				field878[var2 - 30] = arg0.method245();
				if (field878[var2 - 30].equalsIgnoreCase("hidden")) {
					field878[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method238();
				field876 = new int[var5];
				field877 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field876[var6] = arg0.method240();
					field877[var6] = arg0.method240();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method238();
				field869 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field869[var8] = arg0.method240();
				}
			} else if (var2 == 90) {
				field879 = arg0.method240();
			} else if (var2 == 91) {
				field880 = arg0.method240();
			} else if (var2 == 92) {
				field881 = arg0.method240();
			} else if (var2 == 93) {
				field882 = false;
			} else if (var2 == 95) {
				field883 = arg0.method240();
			} else if (var2 == 97) {
				field884 = arg0.method240();
			} else if (var2 == 98) {
				field885 = arg0.method240();
			} else if (var2 == 99) {
				field886 = true;
			} else if (var2 == 100) {
				field887 = arg0.method239();
			} else if (var2 == 101) {
				field888 = arg0.method239() * 5;
			} else if (var2 == 102) {
				field889 = arg0.method240();
			}
		}
	}

	@ObfuscatedName("gc.a(IB[II)Lfb;")
	public final class32 method344(int arg0, int[] arg1, int arg2) {
		class32 var4 = (class32) field890.method114(field864);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < field868.length; var6++) {
				if (!class32.method139(field868[var6])) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			}

			class32[] var7 = new class32[field868.length];
			for (int var8 = 0; var8 < field868.length; var8++) {
				var7[var8] = class32.method138(field868[var8]);
			}

			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new class32(var7, var7.length);
			}

			if (field876 != null) {
				for (int var9 = 0; var9 < field876.length; var9++) {
					var4.method152(field876[var9], field877[var9]);
				}
			}

			var4.method145();
			var4.method155(field887 + 64, field888 + 850, -30, -50, -30, true);
			field890.method115(var4, field864);
		}

		class32 var10 = class32.field482;
		var10.method140(var4, !field875);

		if (arg0 != -1 && arg2 != -1) {
			var10.method147(arg1, arg2, arg0);
		} else if (arg0 != -1) {
			var10.method146(arg0);
		}

		if (field884 != 128 || field885 != 128) {
			var10.method154(field884, field884, field885);
		}

		var10.method142();
		var10.field519 = null;
		var10.field518 = null;

		if (field867 == 1) {
			var10.field520 = true;
		}

		return var10;
	}

	@ObfuscatedName("gc.a(Z)Lfb;")
	public final class32 method345() {
		if (field869 == null) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < field869.length; var2++) {
			if (!class32.method139(field869[var2])) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class32[] var3 = new class32[field869.length];
		for (int var4 = 0; var4 < field869.length; var4++) {
			var3[var4] = class32.method138(field869[var4]);
		}

		class32 var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new class32(var3, var3.length);
		}

		if (field876 != null) {
			for (int var6 = 0; var6 < field876.length; var6++) {
				var5.method152(field876[var6], field877[var6]);
			}
		}

		return var5;
	}
}
