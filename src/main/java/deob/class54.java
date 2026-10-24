package deob;

@ObfuscatedName("bc")
public final class class54 {

	@ObfuscatedName("bc.b")
	public static int field738;

	@ObfuscatedName("bc.c")
	public static int[] field739;

	@ObfuscatedName("bc.d")
	public static class37 field740;

	@ObfuscatedName("bc.e")
	public static class54[] field741;

	@ObfuscatedName("bc.f")
	public static int field742;

	@ObfuscatedName("bc.g")
	public long field743 = -1L;

	@ObfuscatedName("bc.h")
	public String field744;

	@ObfuscatedName("bc.i")
	public byte[] field745;

	@ObfuscatedName("bc.j")
	public byte field746 = 1;

	@ObfuscatedName("bc.k")
	public int[] field747;

	@ObfuscatedName("bc.l")
	public int[] field748;

	@ObfuscatedName("bc.m")
	public int field749 = -1;

	@ObfuscatedName("bc.n")
	public int field750 = -1;

	@ObfuscatedName("bc.o")
	public int field751 = -1;

	@ObfuscatedName("bc.p")
	public int field752 = -1;

	@ObfuscatedName("bc.q")
	public int field753 = -1;

	@ObfuscatedName("bc.r")
	public boolean field754 = false;

	@ObfuscatedName("bc.s")
	public int[] field755;

	@ObfuscatedName("bc.t")
	public int[] field756;

	@ObfuscatedName("bc.u")
	public String[] field757;

	@ObfuscatedName("bc.v")
	public int field758 = -1;

	@ObfuscatedName("bc.w")
	public int field759 = -1;

	@ObfuscatedName("bc.x")
	public int field760 = -1;

	@ObfuscatedName("bc.y")
	public boolean field761 = true;

	@ObfuscatedName("bc.z")
	public int field762 = -1;

	@ObfuscatedName("bc.A")
	public int field763 = 128;

	@ObfuscatedName("bc.B")
	public int field764 = 128;

	@ObfuscatedName("bc.C")
	public static class19 field765 = new class19(30);

	@ObfuscatedName("bc.a(Lub;)V")
	public static final void method279(class47 arg0) {
		field740 = new class37(arg0.method250("npc.dat", null));
		class37 var1 = new class37(arg0.method250("npc.idx", null));
		field738 = var1.method211();
		field739 = new int[field738];
		int var2 = 2;
		for (int var3 = 0; var3 < field738; var3++) {
			field739[var3] = var2;
			var2 += var1.method211();
		}

		field741 = new class54[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field741[var4] = new class54();
		}
	}

	@ObfuscatedName("bc.a(B)V")
	public static final void method280() {
		field765 = null;
		field739 = null;
		field741 = null;
		field740 = null;
	}

	@ObfuscatedName("bc.a(I)Lbc;")
	public static final class54 method281(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field741[var1].field743) {
				return field741[var1];
			}
		}

		field742 = (field742 + 1) % 20;
		class54 var2 = field741[field742] = new class54();
		field740.field542 = field739[arg0];
		var2.field743 = arg0;
		var2.method282(field740);
		return var2;
	}

	@ObfuscatedName("bc.a(Lkb;I)V")
	public final void method282(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method209();
				field747 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field747[var4] = arg0.method211();
				}
			} else if (var2 == 2) {
				field744 = arg0.method216();
			} else if (var2 == 3) {
				field745 = arg0.method217();
			} else if (var2 == 12) {
				field746 = arg0.method210();
			} else if (var2 == 13) {
				field749 = arg0.method211();
			} else if (var2 == 14) {
				field750 = arg0.method211();
			} else if (var2 == 16) {
				field754 = true;
			} else if (var2 == 17) {
				field750 = arg0.method211();
				field751 = arg0.method211();
				field752 = arg0.method211();
				field753 = arg0.method211();
			} else if (var2 >= 30 && var2 < 40) {
				if (field757 == null) {
					field757 = new String[5];
				}

				field757[var2 - 30] = arg0.method216();
				if (field757[var2 - 30].equalsIgnoreCase("hidden")) {
					field757[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method209();
				field755 = new int[var5];
				field756 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field755[var6] = arg0.method211();
					field756[var6] = arg0.method211();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method209();
				field748 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field748[var8] = arg0.method211();
				}
			} else if (var2 == 90) {
				field758 = arg0.method211();
			} else if (var2 == 91) {
				field759 = arg0.method211();
			} else if (var2 == 92) {
				field760 = arg0.method211();
			} else if (var2 == 93) {
				field761 = false;
			} else if (var2 == 95) {
				field762 = arg0.method211();
			} else if (var2 == 97) {
				field763 = arg0.method211();
			} else if (var2 == 98) {
				field764 = arg0.method211();
			}
		}
	}

	@ObfuscatedName("bc.a(II[I)Leb;")
	public final class31 method283(int arg0, int arg1, int[] arg2) {
		Object var4 = null;
		class31 var5 = (class31) field765.method102(field743);
		if (var5 == null) {
			class31[] var6 = new class31[field747.length];
			for (int var7 = 0; var7 < field747.length; var7++) {
				var6[var7] = new class31(field747[var7]);
			}

			if (var6.length == 1) {
				var5 = var6[0];
			} else {
				var5 = new class31(6, var6.length, var6);
			}

			if (field755 != null) {
				for (int var8 = 0; var8 < field755.length; var8++) {
					var5.method133(field755[var8], field756[var8]);
				}
			}

			var5.method126();
			var5.method136(64, 850, -30, -50, -30, true);
			field765.method103(field743, var5);
		}

		class31 var9 = new class31(6, !field754, var5);
		if (arg0 != -1 && arg1 != -1) {
			var9.method128(arg2, arg1, arg0);
		} else if (arg0 != -1) {
			var9.method127(arg0);
		}

		if (field763 != 128 || field764 != 128) {
			var9.method135(field763, field763, field764);
		}

		var9.method123();
		var9.field435 = null;
		var9.field434 = null;

		if (field746 == 1) {
			var9.field436 = true;
		}

		return var9;
	}

	@ObfuscatedName("bc.b(I)Leb;")
	public final class31 method284() {
		if (field748 == null) {
			return null;
		}

		class31[] var1 = new class31[field748.length];
		for (int var2 = 0; var2 < field748.length; var2++) {
			var1[var2] = new class31(field748[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(6, var1.length, var1);
		}

		if (field755 != null) {
			for (int var4 = 0; var4 < field755.length; var4++) {
				var3.method133(field755[var4], field756[var4]);
			}
		}

		return var3;
	}
}
