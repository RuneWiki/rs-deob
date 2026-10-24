package deob;

@ObfuscatedName("bc")
public final class class54 {

	@ObfuscatedName("bc.c")
	public static int field737;

	@ObfuscatedName("bc.d")
	public static int[] field738;

	@ObfuscatedName("bc.e")
	public static class37 field739;

	@ObfuscatedName("bc.f")
	public static class54[] field740;

	@ObfuscatedName("bc.g")
	public static int field741;

	@ObfuscatedName("bc.h")
	public long field742 = -1L;

	@ObfuscatedName("bc.i")
	public String field743;

	@ObfuscatedName("bc.j")
	public byte[] field744;

	@ObfuscatedName("bc.k")
	public byte field745 = 1;

	@ObfuscatedName("bc.l")
	public int[] field746;

	@ObfuscatedName("bc.m")
	public int[] field747;

	@ObfuscatedName("bc.n")
	public int field748 = -1;

	@ObfuscatedName("bc.o")
	public int field749 = -1;

	@ObfuscatedName("bc.p")
	public int field750 = -1;

	@ObfuscatedName("bc.q")
	public int field751 = -1;

	@ObfuscatedName("bc.r")
	public int field752 = -1;

	@ObfuscatedName("bc.s")
	public boolean field753 = false;

	@ObfuscatedName("bc.t")
	public int[] field754;

	@ObfuscatedName("bc.u")
	public int[] field755;

	@ObfuscatedName("bc.v")
	public String[] field756;

	@ObfuscatedName("bc.w")
	public int field757 = -1;

	@ObfuscatedName("bc.x")
	public int field758 = -1;

	@ObfuscatedName("bc.y")
	public int field759 = -1;

	@ObfuscatedName("bc.z")
	public boolean field760 = true;

	@ObfuscatedName("bc.A")
	public int field761 = -1;

	@ObfuscatedName("bc.B")
	public int field762 = 128;

	@ObfuscatedName("bc.C")
	public int field763 = 128;

	@ObfuscatedName("bc.D")
	public static class19 field764 = new class19(30);

	@ObfuscatedName("bc.a(Lub;)V")
	public static final void method286(class47 arg0) {
		field739 = new class37(arg0.method257(null, "npc.dat"));
		class37 var1 = new class37(arg0.method257(null, "npc.idx"));
		field737 = var1.method218();
		field738 = new int[field737];
		int var2 = 2;
		for (int var3 = 0; var3 < field737; var3++) {
			field738[var3] = var2;
			var2 += var1.method218();
		}

		field740 = new class54[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field740[var4] = new class54();
		}
	}

	@ObfuscatedName("bc.a(I)V")
	public static final void method287() {
		field764 = null;
		field738 = null;
		field740 = null;
		field739 = null;
	}

	@ObfuscatedName("bc.b(I)Lbc;")
	public static final class54 method288(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field740[var1].field742) {
				return field740[var1];
			}
		}

		field741 = (field741 + 1) % 20;
		class54 var2 = field740[field741] = new class54();
		field739.field543 = field738[arg0];
		var2.field742 = arg0;
		var2.method289(field739);
		return var2;
	}

	@ObfuscatedName("bc.a(Lkb;Z)V")
	public final void method289(class37 arg0) {
		while (true) {
			int var2 = arg0.method216();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method216();
				field746 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field746[var4] = arg0.method218();
				}
			} else if (var2 == 2) {
				field743 = arg0.method223();
			} else if (var2 == 3) {
				field744 = arg0.method224();
			} else if (var2 == 12) {
				field745 = arg0.method217();
			} else if (var2 == 13) {
				field748 = arg0.method218();
			} else if (var2 == 14) {
				field749 = arg0.method218();
			} else if (var2 == 16) {
				field753 = true;
			} else if (var2 == 17) {
				field749 = arg0.method218();
				field750 = arg0.method218();
				field751 = arg0.method218();
				field752 = arg0.method218();
			} else if (var2 >= 30 && var2 < 40) {
				if (field756 == null) {
					field756 = new String[5];
				}

				field756[var2 - 30] = arg0.method223();
				if (field756[var2 - 30].equalsIgnoreCase("hidden")) {
					field756[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method216();
				field754 = new int[var5];
				field755 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field754[var6] = arg0.method218();
					field755[var6] = arg0.method218();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method216();
				field747 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field747[var8] = arg0.method218();
				}
			} else if (var2 == 90) {
				field757 = arg0.method218();
			} else if (var2 == 91) {
				field758 = arg0.method218();
			} else if (var2 == 92) {
				field759 = arg0.method218();
			} else if (var2 == 93) {
				field760 = false;
			} else if (var2 == 95) {
				field761 = arg0.method218();
			} else if (var2 == 97) {
				field762 = arg0.method218();
			} else if (var2 == 98) {
				field763 = arg0.method218();
			}
		}
	}

	@ObfuscatedName("bc.a(II[I)Leb;")
	public final class31 method290(int arg0, int arg1, int[] arg2) {
		Object var4 = null;
		class31 var5 = (class31) field764.method103(field742);
		if (var5 == null) {
			class31[] var6 = new class31[field746.length];
			for (int var7 = 0; var7 < field746.length; var7++) {
				var6[var7] = new class31(field746[var7]);
			}

			if (var6.length == 1) {
				var5 = var6[0];
			} else {
				var5 = new class31(var6, var6.length);
			}

			if (field754 != null) {
				for (int var8 = 0; var8 < field754.length; var8++) {
					var5.method134(field754[var8], field755[var8]);
				}
			}

			var5.method127();
			var5.method137(64, 850, -30, -50, -30, true);
			field764.method104(var5, field742);
		}

		class31 var9 = new class31(var5, !field753);
		if (arg0 != -1 && arg1 != -1) {
			var9.method129(arg0, arg1, arg2);
		} else if (arg0 != -1) {
			var9.method128(arg0);
		}

		if (field762 != 128 || field763 != 128) {
			var9.method136(field763, field762, field762);
		}

		var9.method124();
		var9.field435 = null;
		var9.field434 = null;

		if (field745 == 1) {
			var9.field436 = true;
		}

		return var9;
	}

	@ObfuscatedName("bc.c(I)Leb;")
	public final class31 method291() {
		if (field747 == null) {
			return null;
		}

		class31[] var1 = new class31[field747.length];
		for (int var2 = 0; var2 < field747.length; var2++) {
			var1[var2] = new class31(field747[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1, var1.length);
		}

		if (field754 != null) {
			for (int var4 = 0; var4 < field754.length; var4++) {
				var3.method134(field754[var4], field755[var4]);
			}
		}

		return var3;
	}
}
