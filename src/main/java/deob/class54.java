package deob;

@ObfuscatedName("bc")
public final class class54 {

	@ObfuscatedName("bc.e")
	public static int field735;

	@ObfuscatedName("bc.f")
	public static int[] field736;

	@ObfuscatedName("bc.g")
	public static class37 field737;

	@ObfuscatedName("bc.h")
	public static class54[] field738;

	@ObfuscatedName("bc.i")
	public static int field739;

	@ObfuscatedName("bc.j")
	public long field740 = -1L;

	@ObfuscatedName("bc.k")
	public String field741;

	@ObfuscatedName("bc.l")
	public byte[] field742;

	@ObfuscatedName("bc.m")
	public byte field743 = 1;

	@ObfuscatedName("bc.n")
	public int[] field744;

	@ObfuscatedName("bc.o")
	public int[] field745;

	@ObfuscatedName("bc.p")
	public int field746 = -1;

	@ObfuscatedName("bc.q")
	public int field747 = -1;

	@ObfuscatedName("bc.r")
	public int field748 = -1;

	@ObfuscatedName("bc.s")
	public int field749 = -1;

	@ObfuscatedName("bc.t")
	public int field750 = -1;

	@ObfuscatedName("bc.u")
	public boolean field751 = false;

	@ObfuscatedName("bc.v")
	public int[] field752;

	@ObfuscatedName("bc.w")
	public int[] field753;

	@ObfuscatedName("bc.x")
	public String[] field754;

	@ObfuscatedName("bc.y")
	public int field755 = -1;

	@ObfuscatedName("bc.z")
	public int field756 = -1;

	@ObfuscatedName("bc.A")
	public int field757 = -1;

	@ObfuscatedName("bc.B")
	public boolean field758 = true;

	@ObfuscatedName("bc.C")
	public int field759 = -1;

	@ObfuscatedName("bc.D")
	public int field760 = 128;

	@ObfuscatedName("bc.E")
	public int field761 = 128;

	@ObfuscatedName("bc.F")
	public static class19 field762 = new class19(30);

	@ObfuscatedName("bc.a(Lub;)V")
	public static final void method279(class47 arg0) {
		field737 = new class37(arg0.method250(null, "npc.dat"));
		class37 var1 = new class37(arg0.method250(null, "npc.idx"));
		field735 = var1.method211();
		field736 = new int[field735];
		int var2 = 2;
		for (int var3 = 0; var3 < field735; var3++) {
			field736[var3] = var2;
			var2 += var1.method211();
		}

		field738 = new class54[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field738[var4] = new class54();
		}
	}

	@ObfuscatedName("bc.a(I)V")
	public static final void method280() {
		field762 = null;
		field736 = null;
		field738 = null;
		field737 = null;
	}

	@ObfuscatedName("bc.b(I)Lbc;")
	public static final class54 method281(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field738[var1].field740) {
				return field738[var1];
			}
		}

		field739 = (field739 + 1) % 20;
		class54 var2 = field738[field739] = new class54();
		field737.field541 = field736[arg0];
		var2.field740 = arg0;
		var2.method282(field737);
		return var2;
	}

	@ObfuscatedName("bc.a(ILkb;)V")
	public final void method282(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method209();
				field744 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field744[var4] = arg0.method211();
				}
			} else if (var2 == 2) {
				field741 = arg0.method216();
			} else if (var2 == 3) {
				field742 = arg0.method217();
			} else if (var2 == 12) {
				field743 = arg0.method210();
			} else if (var2 == 13) {
				field746 = arg0.method211();
			} else if (var2 == 14) {
				field747 = arg0.method211();
			} else if (var2 == 16) {
				field751 = true;
			} else if (var2 == 17) {
				field747 = arg0.method211();
				field748 = arg0.method211();
				field749 = arg0.method211();
				field750 = arg0.method211();
			} else if (var2 >= 30 && var2 < 40) {
				if (field754 == null) {
					field754 = new String[5];
				}

				field754[var2 - 30] = arg0.method216();
				if (field754[var2 - 30].equalsIgnoreCase("hidden")) {
					field754[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method209();
				field752 = new int[var5];
				field753 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field752[var6] = arg0.method211();
					field753[var6] = arg0.method211();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method209();
				field745 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field745[var8] = arg0.method211();
				}
			} else if (var2 == 90) {
				field755 = arg0.method211();
			} else if (var2 == 91) {
				field756 = arg0.method211();
			} else if (var2 == 92) {
				field757 = arg0.method211();
			} else if (var2 == 93) {
				field758 = false;
			} else if (var2 == 95) {
				field759 = arg0.method211();
			} else if (var2 == 97) {
				field760 = arg0.method211();
			} else if (var2 == 98) {
				field761 = arg0.method211();
			}
		}
	}

	@ObfuscatedName("bc.a(II[I)Leb;")
	public final class31 method283(int arg0, int arg1, int[] arg2) {
		Object var4 = null;
		class31 var5 = (class31) field762.method102(field740);
		if (var5 == null) {
			class31[] var6 = new class31[field744.length];
			for (int var7 = 0; var7 < field744.length; var7++) {
				var6[var7] = new class31(field744[var7]);
			}

			if (var6.length == 1) {
				var5 = var6[0];
			} else {
				var5 = new class31(var6.length, var6);
			}

			if (field752 != null) {
				for (int var8 = 0; var8 < field752.length; var8++) {
					var5.method133(field752[var8], field753[var8]);
				}
			}

			var5.method126();
			var5.method136(64, 850, -30, -50, -30, true);
			field762.method103(field740, var5);
		}

		class31 var9 = new class31(!field751, var5);
		if (arg0 != -1 && arg1 != -1) {
			var9.method128(arg1, arg2, arg0);
		} else if (arg0 != -1) {
			var9.method127(arg0);
		}

		if (field760 != 128 || field761 != 128) {
			var9.method135(field761, field760, field760);
		}

		var9.method123();
		var9.field433 = null;
		var9.field432 = null;

		if (field743 == 1) {
			var9.field434 = true;
		}

		return var9;
	}

	@ObfuscatedName("bc.a(B)Leb;")
	public final class31 method284() {
		if (field745 == null) {
			return null;
		}

		class31[] var1 = new class31[field745.length];
		for (int var2 = 0; var2 < field745.length; var2++) {
			var1[var2] = new class31(field745[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1.length, var1);
		}

		if (field752 != null) {
			for (int var4 = 0; var4 < field752.length; var4++) {
				var3.method133(field752[var4], field753[var4]);
			}
		}

		return var3;
	}
}
