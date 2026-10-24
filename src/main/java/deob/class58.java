package deob;

@ObfuscatedName("fc")
public final class class58 {

	@ObfuscatedName("fc.a")
	public static int field835;

	@ObfuscatedName("fc.b")
	public static int[] field836;

	@ObfuscatedName("fc.c")
	public static class39 field837;

	@ObfuscatedName("fc.d")
	public static class58[] field838;

	@ObfuscatedName("fc.e")
	public static int field839;

	@ObfuscatedName("fc.f")
	public long field840 = -1L;

	@ObfuscatedName("fc.g")
	public String field841;

	@ObfuscatedName("fc.h")
	public byte[] field842;

	@ObfuscatedName("fc.i")
	public byte field843 = 1;

	@ObfuscatedName("fc.j")
	public int[] field844;

	@ObfuscatedName("fc.k")
	public int[] field845;

	@ObfuscatedName("fc.l")
	public int field846 = -1;

	@ObfuscatedName("fc.m")
	public int field847 = -1;

	@ObfuscatedName("fc.n")
	public int field848 = -1;

	@ObfuscatedName("fc.o")
	public int field849 = -1;

	@ObfuscatedName("fc.p")
	public int field850 = -1;

	@ObfuscatedName("fc.q")
	public boolean field851 = false;

	@ObfuscatedName("fc.r")
	public int[] field852;

	@ObfuscatedName("fc.s")
	public int[] field853;

	@ObfuscatedName("fc.t")
	public String[] field854;

	@ObfuscatedName("fc.u")
	public int field855 = -1;

	@ObfuscatedName("fc.v")
	public int field856 = -1;

	@ObfuscatedName("fc.w")
	public int field857 = -1;

	@ObfuscatedName("fc.x")
	public boolean field858 = true;

	@ObfuscatedName("fc.y")
	public int field859 = -1;

	@ObfuscatedName("fc.z")
	public int field860 = 128;

	@ObfuscatedName("fc.A")
	public int field861 = 128;

	@ObfuscatedName("fc.B")
	public static class20 field862 = new class20(30);

	@ObfuscatedName("fc.a(Lyb;)V")
	public static final void method327(class51 arg0) {
		field837 = new class39(arg0.method295("npc.dat", null));
		class39 var1 = new class39(arg0.method295("npc.idx", null));
		field835 = var1.method233();
		field836 = new int[field835];
		int var2 = 2;
		for (int var3 = 0; var3 < field835; var3++) {
			field836[var3] = var2;
			var2 += var1.method233();
		}

		field838 = new class58[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field838[var4] = new class58();
		}
	}

	@ObfuscatedName("fc.a(Z)V")
	public static final void method328() {
		field862 = null;
		field836 = null;
		field838 = null;
		field837 = null;
	}

	@ObfuscatedName("fc.a(I)Lfc;")
	public static final class58 method329(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field838[var1].field840) {
				return field838[var1];
			}
		}

		field839 = (field839 + 1) % 20;
		class58 var2 = field838[field839] = new class58();
		field837.field611 = field836[arg0];
		var2.field840 = arg0;
		var2.method330(field837);
		return var2;
	}

	@ObfuscatedName("fc.a(ZLmb;)V")
	public final void method330(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method231();
				field844 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field844[var4] = arg0.method233();
				}
			} else if (var2 == 2) {
				field841 = arg0.method238();
			} else if (var2 == 3) {
				field842 = arg0.method239();
			} else if (var2 == 12) {
				field843 = arg0.method232();
			} else if (var2 == 13) {
				field846 = arg0.method233();
			} else if (var2 == 14) {
				field847 = arg0.method233();
			} else if (var2 == 16) {
				field851 = true;
			} else if (var2 == 17) {
				field847 = arg0.method233();
				field848 = arg0.method233();
				field849 = arg0.method233();
				field850 = arg0.method233();
			} else if (var2 >= 30 && var2 < 40) {
				if (field854 == null) {
					field854 = new String[5];
				}

				field854[var2 - 30] = arg0.method238();
				if (field854[var2 - 30].equalsIgnoreCase("hidden")) {
					field854[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method231();
				field852 = new int[var5];
				field853 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field852[var6] = arg0.method233();
					field853[var6] = arg0.method233();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method231();
				field845 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field845[var8] = arg0.method233();
				}
			} else if (var2 == 90) {
				field855 = arg0.method233();
			} else if (var2 == 91) {
				field856 = arg0.method233();
			} else if (var2 == 92) {
				field857 = arg0.method233();
			} else if (var2 == 93) {
				field858 = false;
			} else if (var2 == 95) {
				field859 = arg0.method233();
			} else if (var2 == 97) {
				field860 = arg0.method233();
			} else if (var2 == 98) {
				field861 = arg0.method233();
			}
		}
	}

	@ObfuscatedName("fc.a(II[II)Lfb;")
	public final class32 method331(int arg0, int arg1, int[] arg2) {
		class32 var4 = (class32) field862.method113(field840);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < field844.length; var6++) {
				if (!class32.method136(field844[var6])) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			}

			class32[] var7 = new class32[field844.length];
			for (int var8 = 0; var8 < field844.length; var8++) {
				var7[var8] = class32.method135(field844[var8]);
			}

			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new class32(var7.length, var7);
			}

			if (field852 != null) {
				for (int var9 = 0; var9 < field852.length; var9++) {
					var4.method149(field852[var9], field853[var9]);
				}
			}

			var4.method142();
			var4.method152(64, 850, -30, -50, -30, true);
			field862.method114(field840, var4);
		}

		class32 var10 = class32.field471;
		var10.method137(!field851, var4);

		if (arg0 != -1 && arg1 != -1) {
			var10.method144(arg1, arg0, arg2);
		} else if (arg0 != -1) {
			var10.method143(arg0);
		}

		if (field860 != 128 || field861 != 128) {
			var10.method151(field860, field860, field861);
		}

		var10.method139();
		var10.field508 = null;
		var10.field507 = null;

		if (field843 == 1) {
			var10.field509 = true;
		}

		return var10;
	}

	@ObfuscatedName("fc.b(I)Lfb;")
	public final class32 method332() {
		if (field845 == null) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < field845.length; var2++) {
			if (!class32.method136(field845[var2])) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class32[] var3 = new class32[field845.length];
		for (int var4 = 0; var4 < field845.length; var4++) {
			var3[var4] = class32.method135(field845[var4]);
		}

		class32 var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new class32(var3.length, var3);
		}

		if (field852 != null) {
			for (int var6 = 0; var6 < field852.length; var6++) {
				var5.method149(field852[var6], field853[var6]);
			}
		}

		return var5;
	}
}
