package deob;

@ObfuscatedName("yb")
public final class class51 {

	@ObfuscatedName("yb.a")
	public static int field688;

	@ObfuscatedName("yb.b")
	public static int[] field689;

	@ObfuscatedName("yb.c")
	public static class37 field690;

	@ObfuscatedName("yb.d")
	public static class51[] field691;

	@ObfuscatedName("yb.e")
	public static int field692;

	@ObfuscatedName("yb.f")
	public long field693 = -1L;

	@ObfuscatedName("yb.g")
	public String field694;

	@ObfuscatedName("yb.h")
	public byte[] field695;

	@ObfuscatedName("yb.i")
	public byte field696 = 1;

	@ObfuscatedName("yb.j")
	public int[] field697;

	@ObfuscatedName("yb.k")
	public int[] field698;

	@ObfuscatedName("yb.l")
	public int field699 = -1;

	@ObfuscatedName("yb.m")
	public int field700 = -1;

	@ObfuscatedName("yb.n")
	public int field701 = -1;

	@ObfuscatedName("yb.o")
	public int field702 = -1;

	@ObfuscatedName("yb.p")
	public int field703 = -1;

	@ObfuscatedName("yb.q")
	public boolean field704 = false;

	@ObfuscatedName("yb.r")
	public int[] field705;

	@ObfuscatedName("yb.s")
	public int[] field706;

	@ObfuscatedName("yb.t")
	public String[] field707;

	@ObfuscatedName("yb.u")
	public int field708 = -1;

	@ObfuscatedName("yb.v")
	public int field709 = -1;

	@ObfuscatedName("yb.w")
	public int field710 = -1;

	@ObfuscatedName("yb.x")
	public boolean field711 = true;

	@ObfuscatedName("yb.y")
	public int field712 = -1;

	@ObfuscatedName("yb.z")
	public int field713 = 128;

	@ObfuscatedName("yb.A")
	public int field714 = 128;

	@ObfuscatedName("yb.B")
	public static class19 field715 = new class19(30);

	@ObfuscatedName("yb.a(Lub;)V")
	public static final void method257(class47 arg0) {
		field690 = new class37(arg0.method242(null, "npc.dat"));
		class37 var1 = new class37(arg0.method242(null, "npc.idx"));
		field688 = var1.method203();
		field689 = new int[field688];
		int var2 = 2;
		for (int var3 = 0; var3 < field688; var3++) {
			field689[var3] = var2;
			var2 += var1.method203();
		}

		field691 = new class51[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field691[var4] = new class51();
		}
	}

	@ObfuscatedName("yb.a(I)V")
	public static final void method258() {
		field715 = null;
		field689 = null;
		field691 = null;
		field690 = null;
	}

	@ObfuscatedName("yb.b(I)Lyb;")
	public static final class51 method259(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field691[var1].field693) {
				return field691[var1];
			}
		}

		field692 = (field692 + 1) % 20;
		class51 var2 = field691[field692] = new class51();
		field690.field537 = field689[arg0];
		var2.field693 = arg0;
		var2.method260(field690);
		return var2;
	}

	@ObfuscatedName("yb.a(ILkb;)V")
	public final void method260(class37 arg0) {
		while (true) {
			int var2 = arg0.method201();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method201();
				field697 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field697[var4] = arg0.method203();
				}
			} else if (var2 == 2) {
				field694 = arg0.method208();
			} else if (var2 == 3) {
				field695 = arg0.method209();
			} else if (var2 == 12) {
				field696 = arg0.method202();
			} else if (var2 == 13) {
				field699 = arg0.method203();
			} else if (var2 == 14) {
				field700 = arg0.method203();
			} else if (var2 == 16) {
				field704 = true;
			} else if (var2 == 17) {
				field700 = arg0.method203();
				field701 = arg0.method203();
				field702 = arg0.method203();
				field703 = arg0.method203();
			} else if (var2 >= 30 && var2 < 40) {
				if (field707 == null) {
					field707 = new String[5];
				}

				field707[var2 - 30] = arg0.method208();
			} else if (var2 == 40) {
				int var5 = arg0.method201();
				field705 = new int[var5];
				field706 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field705[var6] = arg0.method203();
					field706[var6] = arg0.method203();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method201();
				field698 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field698[var8] = arg0.method203();
				}
			} else if (var2 == 90) {
				field708 = arg0.method203();
			} else if (var2 == 91) {
				field709 = arg0.method203();
			} else if (var2 == 92) {
				field710 = arg0.method203();
			} else if (var2 == 93) {
				field711 = false;
			} else if (var2 == 95) {
				field712 = arg0.method203();
			} else if (var2 == 97) {
				field713 = arg0.method203();
			} else if (var2 == 98) {
				field714 = arg0.method203();
			}
		}
	}

	@ObfuscatedName("yb.a(II[I)Leb;")
	public final class31 method261(int arg0, int arg1, int[] arg2) {
		Object var4 = null;
		class31 var5 = (class31) field715.method99(field693);
		if (var5 == null) {
			class31[] var6 = new class31[field697.length];
			for (int var7 = 0; var7 < field697.length; var7++) {
				var6[var7] = new class31(field697[var7]);
			}

			if (var6.length == 1) {
				var5 = var6[0];
			} else {
				var5 = new class31(var6.length, var6);
			}

			if (field705 != null) {
				for (int var8 = 0; var8 < field705.length; var8++) {
					var5.method129(field705[var8], field706[var8]);
				}
			}

			var5.method122();
			var5.method132(64, 850, -30, -50, -30, true);
			field715.method100(field693, var5);
		}

		class31 var9 = new class31(!field704, var5);
		if (arg0 != -1 && arg1 != -1) {
			var9.method124(arg0, arg2, arg1);
		} else if (arg0 != -1) {
			var9.method123(arg0);
		}

		if (field713 != 128 || field714 != 128) {
			var9.method131(field713, field714, field713);
		}

		var9.method120();
		var9.field430 = null;
		var9.field429 = null;

		if (field696 == 1) {
			var9.field431 = true;
		}

		return var9;
	}

	@ObfuscatedName("yb.c(I)Leb;")
	public final class31 method262() {
		if (field698 == null) {
			return null;
		}

		class31[] var1 = new class31[field698.length];
		for (int var2 = 0; var2 < field698.length; var2++) {
			var1[var2] = new class31(field698[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1.length, var1);
		}

		if (field705 != null) {
			for (int var4 = 0; var4 < field705.length; var4++) {
				var3.method129(field705[var4], field706[var4]);
			}
		}

		return var3;
	}
}
