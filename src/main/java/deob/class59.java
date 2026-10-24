package deob;

@ObfuscatedName("gc")
public final class class59 {

	@ObfuscatedName("gc.c")
	public static int field860;

	@ObfuscatedName("gc.d")
	public static int[] field861;

	@ObfuscatedName("gc.e")
	public static class39 field862;

	@ObfuscatedName("gc.f")
	public static class59[] field863;

	@ObfuscatedName("gc.g")
	public static int field864;

	@ObfuscatedName("gc.h")
	public long field865 = -1L;

	@ObfuscatedName("gc.i")
	public String field866;

	@ObfuscatedName("gc.j")
	public byte[] field867;

	@ObfuscatedName("gc.k")
	public byte field868 = 1;

	@ObfuscatedName("gc.l")
	public int[] field869;

	@ObfuscatedName("gc.m")
	public int[] field870;

	@ObfuscatedName("gc.n")
	public int field871 = -1;

	@ObfuscatedName("gc.o")
	public int field872 = -1;

	@ObfuscatedName("gc.p")
	public int field873 = -1;

	@ObfuscatedName("gc.q")
	public int field874 = -1;

	@ObfuscatedName("gc.r")
	public int field875 = -1;

	@ObfuscatedName("gc.s")
	public int[] field876;

	@ObfuscatedName("gc.t")
	public int[] field877;

	@ObfuscatedName("gc.u")
	public String[] field878;

	@ObfuscatedName("gc.v")
	public int field879 = -1;

	@ObfuscatedName("gc.w")
	public int field880 = -1;

	@ObfuscatedName("gc.x")
	public int field881 = -1;

	@ObfuscatedName("gc.y")
	public boolean field882 = true;

	@ObfuscatedName("gc.z")
	public int field883 = -1;

	@ObfuscatedName("gc.A")
	public int field884 = 128;

	@ObfuscatedName("gc.B")
	public int field885 = 128;

	@ObfuscatedName("gc.C")
	public boolean field886 = false;

	@ObfuscatedName("gc.F")
	public int field889 = -1;

	@ObfuscatedName("gc.G")
	public static class20 field890 = new class20(30);

	@ObfuscatedName("gc.D")
	public int field887;

	@ObfuscatedName("gc.E")
	public int field888;

	@ObfuscatedName("gc.a(Lyb;)V")
	public static final void method342(class51 arg0) {
		field862 = new class39(arg0.method309("npc.dat", null));
		class39 var1 = new class39(arg0.method309("npc.idx", null));
		field860 = var1.method241();
		field861 = new int[field860];
		int var2 = 2;
		for (int var3 = 0; var3 < field860; var3++) {
			field861[var3] = var2;
			var2 += var1.method241();
		}

		field863 = new class59[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field863[var4] = new class59();
		}
	}

	@ObfuscatedName("gc.a(Z)V")
	public static final void method343() {
		field890 = null;
		field861 = null;
		field863 = null;
		field862 = null;
	}

	@ObfuscatedName("gc.a(I)Lgc;")
	public static final class59 method344(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field863[var1].field865) {
				return field863[var1];
			}
		}

		field864 = (field864 + 1) % 20;
		class59 var2 = field863[field864] = new class59();
		field862.field624 = field861[arg0];
		var2.field865 = arg0;
		var2.method345(field862);
		return var2;
	}

	@ObfuscatedName("gc.a(ILmb;)V")
	public final void method345(class39 arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method239();
				field869 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field869[var4] = arg0.method241();
				}
			} else if (var2 == 2) {
				field866 = arg0.method246();
			} else if (var2 == 3) {
				field867 = arg0.method247();
			} else if (var2 == 12) {
				field868 = arg0.method240();
			} else if (var2 == 13) {
				field871 = arg0.method241();
			} else if (var2 == 14) {
				field872 = arg0.method241();
			} else if (var2 == 17) {
				field872 = arg0.method241();
				field873 = arg0.method241();
				field874 = arg0.method241();
				field875 = arg0.method241();
			} else if (var2 >= 30 && var2 < 40) {
				if (field878 == null) {
					field878 = new String[5];
				}

				field878[var2 - 30] = arg0.method246();
				if (field878[var2 - 30].equalsIgnoreCase("hidden")) {
					field878[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method239();
				field876 = new int[var5];
				field877 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field876[var6] = arg0.method241();
					field877[var6] = arg0.method241();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method239();
				field870 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field870[var8] = arg0.method241();
				}
			} else if (var2 == 90) {
				field879 = arg0.method241();
			} else if (var2 == 91) {
				field880 = arg0.method241();
			} else if (var2 == 92) {
				field881 = arg0.method241();
			} else if (var2 == 93) {
				field882 = false;
			} else if (var2 == 95) {
				field883 = arg0.method241();
			} else if (var2 == 97) {
				field884 = arg0.method241();
			} else if (var2 == 98) {
				field885 = arg0.method241();
			} else if (var2 == 99) {
				field886 = true;
			} else if (var2 == 100) {
				field887 = arg0.method240();
			} else if (var2 == 101) {
				field888 = arg0.method240() * 5;
			} else if (var2 == 102) {
				field889 = arg0.method241();
			}
		}
	}

	@ObfuscatedName("gc.a(III[I)Lfb;")
	public final class32 method346(int arg0, int arg1, int[] arg2) {
		class32 var4 = (class32) field890.method115(field865);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < field869.length; var6++) {
				if (!class32.method140(field869[var6])) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			}

			class32[] var7 = new class32[field869.length];
			for (int var8 = 0; var8 < field869.length; var8++) {
				var7[var8] = class32.method139(field869[var8]);
			}

			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new class32(var7.length, var7);
			}

			if (field876 != null) {
				for (int var9 = 0; var9 < field876.length; var9++) {
					var4.method153(field876[var9], field877[var9]);
				}
			}

			var4.method146();
			var4.method156(field887 + 64, field888 + 850, -30, -50, -30, true);
			field890.method116(field865, var4);
		}

		class32 var10 = class32.field483;
		var10.method141(var4, class8.method62(arg1) & class8.method62(arg0));

		if (arg1 != -1 && arg0 != -1) {
			var10.method148(arg2, arg0, arg1);
		} else if (arg1 != -1) {
			var10.method147(arg1);
		}

		if (field884 != 128 || field885 != 128) {
			var10.method155(field884, field885, field884);
		}

		var10.method143();
		var10.field520 = null;
		var10.field519 = null;

		if (field868 == 1) {
			var10.field521 = true;
		}

		return var10;
	}

	@ObfuscatedName("gc.b(I)Lfb;")
	public final class32 method347() {
		if (field870 == null) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < field870.length; var2++) {
			if (!class32.method140(field870[var2])) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class32[] var3 = new class32[field870.length];
		for (int var4 = 0; var4 < field870.length; var4++) {
			var3[var4] = class32.method139(field870[var4]);
		}

		class32 var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new class32(var3.length, var3);
		}

		if (field876 != null) {
			for (int var6 = 0; var6 < field876.length; var6++) {
				var5.method153(field876[var6], field877[var6]);
			}
		}

		return var5;
	}
}
