package deob;

@ObfuscatedName("bc")
public final class class54 {

	@ObfuscatedName("bc.f")
	public static int field734;

	@ObfuscatedName("bc.g")
	public static int[] field735;

	@ObfuscatedName("bc.h")
	public static class37 field736;

	@ObfuscatedName("bc.i")
	public static class54[] field737;

	@ObfuscatedName("bc.j")
	public static int field738;

	@ObfuscatedName("bc.k")
	public long field739 = -1L;

	@ObfuscatedName("bc.l")
	public String field740;

	@ObfuscatedName("bc.m")
	public byte[] field741;

	@ObfuscatedName("bc.n")
	public byte field742 = 1;

	@ObfuscatedName("bc.o")
	public int[] field743;

	@ObfuscatedName("bc.p")
	public int[] field744;

	@ObfuscatedName("bc.q")
	public int field745 = -1;

	@ObfuscatedName("bc.r")
	public int field746 = -1;

	@ObfuscatedName("bc.s")
	public int field747 = -1;

	@ObfuscatedName("bc.t")
	public int field748 = -1;

	@ObfuscatedName("bc.u")
	public int field749 = -1;

	@ObfuscatedName("bc.v")
	public boolean field750 = false;

	@ObfuscatedName("bc.w")
	public int[] field751;

	@ObfuscatedName("bc.x")
	public int[] field752;

	@ObfuscatedName("bc.y")
	public String[] field753;

	@ObfuscatedName("bc.z")
	public int field754 = -1;

	@ObfuscatedName("bc.A")
	public int field755 = -1;

	@ObfuscatedName("bc.B")
	public int field756 = -1;

	@ObfuscatedName("bc.C")
	public boolean field757 = true;

	@ObfuscatedName("bc.D")
	public int field758 = -1;

	@ObfuscatedName("bc.E")
	public int field759 = 128;

	@ObfuscatedName("bc.F")
	public int field760 = 128;

	@ObfuscatedName("bc.G")
	public static class19 field761 = new class19(30);

	@ObfuscatedName("bc.a(Lub;)V")
	public static final void method279(class47 arg0) {
		field736 = new class37(arg0.method250("npc.dat", null));
		class37 var1 = new class37(arg0.method250("npc.idx", null));
		field734 = var1.method211();
		field735 = new int[field734];
		int var2 = 2;
		for (int var3 = 0; var3 < field734; var3++) {
			field735[var3] = var2;
			var2 += var1.method211();
		}

		field737 = new class54[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field737[var4] = new class54();
		}
	}

	@ObfuscatedName("bc.a(Z)V")
	public static final void method280() {
		field761 = null;
		field735 = null;
		field737 = null;
		field736 = null;
	}

	@ObfuscatedName("bc.a(I)Lbc;")
	public static final class54 method281(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field737[var1].field739) {
				return field737[var1];
			}
		}

		field738 = (field738 + 1) % 20;
		class54 var2 = field737[field738] = new class54();
		field736.field540 = field735[arg0];
		var2.field739 = arg0;
		var2.method282(field736);
		return var2;
	}

	@ObfuscatedName("bc.a(BLkb;)V")
	public final void method282(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method209();
				field743 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field743[var4] = arg0.method211();
				}
			} else if (var2 == 2) {
				field740 = arg0.method216();
			} else if (var2 == 3) {
				field741 = arg0.method217();
			} else if (var2 == 12) {
				field742 = arg0.method210();
			} else if (var2 == 13) {
				field745 = arg0.method211();
			} else if (var2 == 14) {
				field746 = arg0.method211();
			} else if (var2 == 16) {
				field750 = true;
			} else if (var2 == 17) {
				field746 = arg0.method211();
				field747 = arg0.method211();
				field748 = arg0.method211();
				field749 = arg0.method211();
			} else if (var2 >= 30 && var2 < 40) {
				if (field753 == null) {
					field753 = new String[5];
				}

				field753[var2 - 30] = arg0.method216();
				if (field753[var2 - 30].equalsIgnoreCase("hidden")) {
					field753[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method209();
				field751 = new int[var5];
				field752 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field751[var6] = arg0.method211();
					field752[var6] = arg0.method211();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method209();
				field744 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field744[var8] = arg0.method211();
				}
			} else if (var2 == 90) {
				field754 = arg0.method211();
			} else if (var2 == 91) {
				field755 = arg0.method211();
			} else if (var2 == 92) {
				field756 = arg0.method211();
			} else if (var2 == 93) {
				field757 = false;
			} else if (var2 == 95) {
				field758 = arg0.method211();
			} else if (var2 == 97) {
				field759 = arg0.method211();
			} else if (var2 == 98) {
				field760 = arg0.method211();
			}
		}
	}

	@ObfuscatedName("bc.a(II[I)Leb;")
	public final class31 method283(int arg0, int arg1, int[] arg2) {
		Object var4 = null;
		class31 var5 = (class31) field761.method102(field739);
		if (var5 == null) {
			class31[] var6 = new class31[field743.length];
			for (int var7 = 0; var7 < field743.length; var7++) {
				var6[var7] = new class31(field743[var7]);
			}

			if (var6.length == 1) {
				var5 = var6[0];
			} else {
				var5 = new class31(var6, var6.length);
			}

			if (field751 != null) {
				for (int var8 = 0; var8 < field751.length; var8++) {
					var5.method133(field751[var8], field752[var8]);
				}
			}

			var5.method126();
			var5.method136(64, 850, -30, -50, -30, true);
			field761.method103(var5, field739);
		}

		class31 var9 = new class31(var5, !field750);
		if (arg0 != -1 && arg1 != -1) {
			var9.method128(arg1, arg0, arg2);
		} else if (arg0 != -1) {
			var9.method127(arg0);
		}

		if (field759 != 128 || field760 != 128) {
			var9.method135(field760, field759, field759);
		}

		var9.method123();
		var9.field433 = null;
		var9.field432 = null;

		if (field742 == 1) {
			var9.field434 = true;
		}

		return var9;
	}

	@ObfuscatedName("bc.b(I)Leb;")
	public final class31 method284() {
		if (field744 == null) {
			return null;
		}

		class31[] var1 = new class31[field744.length];
		for (int var2 = 0; var2 < field744.length; var2++) {
			var1[var2] = new class31(field744[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1, var1.length);
		}

		if (field751 != null) {
			for (int var4 = 0; var4 < field751.length; var4++) {
				var3.method133(field751[var4], field752[var4]);
			}
		}

		return var3;
	}
}
