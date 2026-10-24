package deob;

@ObfuscatedName("fc")
public final class class58 {

	@ObfuscatedName("fc.c")
	public static int field838;

	@ObfuscatedName("fc.d")
	public static int[] field839;

	@ObfuscatedName("fc.e")
	public static class39 field840;

	@ObfuscatedName("fc.f")
	public static class58[] field841;

	@ObfuscatedName("fc.g")
	public static int field842;

	@ObfuscatedName("fc.h")
	public long field843 = -1L;

	@ObfuscatedName("fc.i")
	public String field844;

	@ObfuscatedName("fc.j")
	public byte[] field845;

	@ObfuscatedName("fc.k")
	public byte field846 = 1;

	@ObfuscatedName("fc.l")
	public int[] field847;

	@ObfuscatedName("fc.m")
	public int[] field848;

	@ObfuscatedName("fc.n")
	public int field849 = -1;

	@ObfuscatedName("fc.o")
	public int field850 = -1;

	@ObfuscatedName("fc.p")
	public int field851 = -1;

	@ObfuscatedName("fc.q")
	public int field852 = -1;

	@ObfuscatedName("fc.r")
	public int field853 = -1;

	@ObfuscatedName("fc.s")
	public boolean field854 = false;

	@ObfuscatedName("fc.t")
	public int[] field855;

	@ObfuscatedName("fc.u")
	public int[] field856;

	@ObfuscatedName("fc.v")
	public String[] field857;

	@ObfuscatedName("fc.w")
	public int field858 = -1;

	@ObfuscatedName("fc.x")
	public int field859 = -1;

	@ObfuscatedName("fc.y")
	public int field860 = -1;

	@ObfuscatedName("fc.z")
	public boolean field861 = true;

	@ObfuscatedName("fc.A")
	public int field862 = -1;

	@ObfuscatedName("fc.B")
	public int field863 = 128;

	@ObfuscatedName("fc.C")
	public int field864 = 128;

	@ObfuscatedName("fc.D")
	public static class20 field865 = new class20(30);

	@ObfuscatedName("fc.a(Lyb;)V")
	public static final void method331(class51 arg0) {
		field840 = new class39(arg0.method299("npc.dat", null));
		class39 var1 = new class39(arg0.method299("npc.idx", null));
		field838 = var1.method233();
		field839 = new int[field838];
		int var2 = 2;
		for (int var3 = 0; var3 < field838; var3++) {
			field839[var3] = var2;
			var2 += var1.method233();
		}

		field841 = new class58[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field841[var4] = new class58();
		}
	}

	@ObfuscatedName("fc.a(B)V")
	public static final void method332() {
		field865 = null;
		field839 = null;
		field841 = null;
		field840 = null;
	}

	@ObfuscatedName("fc.a(I)Lfc;")
	public static final class58 method333(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field841[var1].field843) {
				return field841[var1];
			}
		}

		field842 = (field842 + 1) % 20;
		class58 var2 = field841[field842] = new class58();
		field840.field611 = field839[arg0];
		var2.field843 = arg0;
		var2.method334(field840);
		return var2;
	}

	@ObfuscatedName("fc.a(ILmb;)V")
	public final void method334(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method231();
				field847 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field847[var4] = arg0.method233();
				}
			} else if (var2 == 2) {
				field844 = arg0.method238();
			} else if (var2 == 3) {
				field845 = arg0.method239();
			} else if (var2 == 12) {
				field846 = arg0.method232();
			} else if (var2 == 13) {
				field849 = arg0.method233();
			} else if (var2 == 14) {
				field850 = arg0.method233();
			} else if (var2 == 16) {
				field854 = true;
			} else if (var2 == 17) {
				field850 = arg0.method233();
				field851 = arg0.method233();
				field852 = arg0.method233();
				field853 = arg0.method233();
			} else if (var2 >= 30 && var2 < 40) {
				if (field857 == null) {
					field857 = new String[5];
				}

				field857[var2 - 30] = arg0.method238();
				if (field857[var2 - 30].equalsIgnoreCase("hidden")) {
					field857[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method231();
				field855 = new int[var5];
				field856 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field855[var6] = arg0.method233();
					field856[var6] = arg0.method233();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method231();
				field848 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field848[var8] = arg0.method233();
				}
			} else if (var2 == 90) {
				field858 = arg0.method233();
			} else if (var2 == 91) {
				field859 = arg0.method233();
			} else if (var2 == 92) {
				field860 = arg0.method233();
			} else if (var2 == 93) {
				field861 = false;
			} else if (var2 == 95) {
				field862 = arg0.method233();
			} else if (var2 == 97) {
				field863 = arg0.method233();
			} else if (var2 == 98) {
				field864 = arg0.method233();
			}
		}
	}

	@ObfuscatedName("fc.a(IIZ[I)Lfb;")
	public final class32 method335(int arg0, int arg1, int[] arg2) {
		class32 var4 = (class32) field865.method113(field843);
		if (var4 == null) {
			boolean var5 = false;
			for (int var6 = 0; var6 < field847.length; var6++) {
				if (!class32.method136(field847[var6])) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			}

			class32[] var7 = new class32[field847.length];
			for (int var8 = 0; var8 < field847.length; var8++) {
				var7[var8] = class32.method135(field847[var8]);
			}

			if (var7.length == 1) {
				var4 = var7[0];
			} else {
				var4 = new class32(var7.length, var7);
			}

			if (field855 != null) {
				for (int var9 = 0; var9 < field855.length; var9++) {
					var4.method149(field855[var9], field856[var9]);
				}
			}

			var4.method142();
			var4.method152(64, 850, -30, -50, -30, true);
			field865.method114(var4, field843);
		}

		class32 var10 = class32.field471;
		var10.method137(var4, !field854);

		if (arg1 != -1 && arg0 != -1) {
			var10.method144(arg0, arg1, arg2);
		} else if (arg1 != -1) {
			var10.method143(arg1);
		}

		if (field863 != 128 || field864 != 128) {
			var10.method151(field864, field863, field863);
		}

		var10.method139();
		var10.field508 = null;
		var10.field507 = null;

		if (field846 == 1) {
			var10.field509 = true;
		}

		return var10;
	}

	@ObfuscatedName("fc.b(I)Lfb;")
	public final class32 method336() {
		if (field848 == null) {
			return null;
		}

		boolean var1 = false;
		for (int var2 = 0; var2 < field848.length; var2++) {
			if (!class32.method136(field848[var2])) {
				var1 = true;
			}
		}

		if (var1) {
			return null;
		}

		class32[] var3 = new class32[field848.length];
		for (int var4 = 0; var4 < field848.length; var4++) {
			var3[var4] = class32.method135(field848[var4]);
		}

		class32 var5;
		if (var3.length == 1) {
			var5 = var3[0];
		} else {
			var5 = new class32(var3.length, var3);
		}

		if (field855 != null) {
			for (int var6 = 0; var6 < field855.length; var6++) {
				var5.method149(field855[var6], field856[var6]);
			}
		}

		return var5;
	}
}
