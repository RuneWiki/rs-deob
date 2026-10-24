package deob;

@ObfuscatedName("bc")
public final class class54 {

	@ObfuscatedName("bc.c")
	public static int field733;

	@ObfuscatedName("bc.d")
	public static int[] field734;

	@ObfuscatedName("bc.e")
	public static class37 field735;

	@ObfuscatedName("bc.f")
	public static class54[] field736;

	@ObfuscatedName("bc.g")
	public static int field737;

	@ObfuscatedName("bc.h")
	public long field738 = -1L;

	@ObfuscatedName("bc.i")
	public String field739;

	@ObfuscatedName("bc.j")
	public byte[] field740;

	@ObfuscatedName("bc.k")
	public byte field741 = 1;

	@ObfuscatedName("bc.l")
	public int[] field742;

	@ObfuscatedName("bc.m")
	public int[] field743;

	@ObfuscatedName("bc.n")
	public int field744 = -1;

	@ObfuscatedName("bc.o")
	public int field745 = -1;

	@ObfuscatedName("bc.p")
	public int field746 = -1;

	@ObfuscatedName("bc.q")
	public int field747 = -1;

	@ObfuscatedName("bc.r")
	public int field748 = -1;

	@ObfuscatedName("bc.s")
	public boolean field749 = false;

	@ObfuscatedName("bc.t")
	public int[] field750;

	@ObfuscatedName("bc.u")
	public int[] field751;

	@ObfuscatedName("bc.v")
	public String[] field752;

	@ObfuscatedName("bc.w")
	public int field753 = -1;

	@ObfuscatedName("bc.x")
	public int field754 = -1;

	@ObfuscatedName("bc.y")
	public int field755 = -1;

	@ObfuscatedName("bc.z")
	public boolean field756 = true;

	@ObfuscatedName("bc.A")
	public int field757 = -1;

	@ObfuscatedName("bc.B")
	public int field758 = 128;

	@ObfuscatedName("bc.C")
	public int field759 = 128;

	@ObfuscatedName("bc.D")
	public static class19 field760 = new class19(30);

	@ObfuscatedName("bc.a(Lub;)V")
	public static final void method278(class47 arg0) {
		field735 = new class37(arg0.method249("npc.dat", null));
		class37 var1 = new class37(arg0.method249("npc.idx", null));
		field733 = var1.method210();
		field734 = new int[field733];
		int var2 = 2;
		for (int var3 = 0; var3 < field733; var3++) {
			field734[var3] = var2;
			var2 += var1.method210();
		}

		field736 = new class54[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field736[var4] = new class54();
		}
	}

	@ObfuscatedName("bc.a(Z)V")
	public static final void method279() {
		field760 = null;
		field734 = null;
		field736 = null;
		field735 = null;
	}

	@ObfuscatedName("bc.a(I)Lbc;")
	public static final class54 method280(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field736[var1].field738) {
				return field736[var1];
			}
		}

		field737 = (field737 + 1) % 20;
		class54 var2 = field736[field737] = new class54();
		field735.field540 = field734[arg0];
		var2.field738 = arg0;
		var2.method281(field735);
		return var2;
	}

	@ObfuscatedName("bc.a(BLkb;)V")
	public final void method281(class37 arg0) {
		while (true) {
			int var2 = arg0.method208();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method208();
				field742 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field742[var4] = arg0.method210();
				}
			} else if (var2 == 2) {
				field739 = arg0.method215();
			} else if (var2 == 3) {
				field740 = arg0.method216();
			} else if (var2 == 12) {
				field741 = arg0.method209();
			} else if (var2 == 13) {
				field744 = arg0.method210();
			} else if (var2 == 14) {
				field745 = arg0.method210();
			} else if (var2 == 16) {
				field749 = true;
			} else if (var2 == 17) {
				field745 = arg0.method210();
				field746 = arg0.method210();
				field747 = arg0.method210();
				field748 = arg0.method210();
			} else if (var2 >= 30 && var2 < 40) {
				if (field752 == null) {
					field752 = new String[5];
				}

				field752[var2 - 30] = arg0.method215();
				if (field752[var2 - 30].equalsIgnoreCase("hidden")) {
					field752[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method208();
				field750 = new int[var5];
				field751 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field750[var6] = arg0.method210();
					field751[var6] = arg0.method210();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method208();
				field743 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field743[var8] = arg0.method210();
				}
			} else if (var2 == 90) {
				field753 = arg0.method210();
			} else if (var2 == 91) {
				field754 = arg0.method210();
			} else if (var2 == 92) {
				field755 = arg0.method210();
			} else if (var2 == 93) {
				field756 = false;
			} else if (var2 == 95) {
				field757 = arg0.method210();
			} else if (var2 == 97) {
				field758 = arg0.method210();
			} else if (var2 == 98) {
				field759 = arg0.method210();
			}
		}
	}

	@ObfuscatedName("bc.a(II[I)Leb;")
	public final class31 method282(int arg0, int arg1, int[] arg2) {
		Object var4 = null;
		class31 var5 = (class31) field760.method101(field738);
		if (var5 == null) {
			class31[] var6 = new class31[field742.length];
			for (int var7 = 0; var7 < field742.length; var7++) {
				var6[var7] = new class31(field742[var7]);
			}

			if (var6.length == 1) {
				var5 = var6[0];
			} else {
				var5 = new class31(var6.length, var6);
			}

			if (field750 != null) {
				for (int var8 = 0; var8 < field750.length; var8++) {
					var5.method132(field750[var8], field751[var8]);
				}
			}

			var5.method125();
			var5.method135(64, 850, -30, -50, -30, true);
			field760.method102(field738, var5);
		}

		class31 var9 = new class31(!field749, var5);
		if (arg0 != -1 && arg1 != -1) {
			var9.method127(arg1, arg2, arg0);
		} else if (arg0 != -1) {
			var9.method126(arg0);
		}

		if (field758 != 128 || field759 != 128) {
			var9.method134(field759, field758, field758);
		}

		var9.method122();
		var9.field433 = null;
		var9.field432 = null;

		if (field741 == 1) {
			var9.field434 = true;
		}

		return var9;
	}

	@ObfuscatedName("bc.a(B)Leb;")
	public final class31 method283() {
		if (field743 == null) {
			return null;
		}

		class31[] var1 = new class31[field743.length];
		for (int var2 = 0; var2 < field743.length; var2++) {
			var1[var2] = new class31(field743[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1.length, var1);
		}

		if (field750 != null) {
			for (int var4 = 0; var4 < field750.length; var4++) {
				var3.method132(field750[var4], field751[var4]);
			}
		}

		return var3;
	}
}
