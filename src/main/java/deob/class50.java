package deob;

@ObfuscatedName("xb")
public final class class50 {

	@ObfuscatedName("xb.d")
	public static int field671;

	@ObfuscatedName("xb.e")
	public static int[] field672;

	@ObfuscatedName("xb.f")
	public static class36 field673;

	@ObfuscatedName("xb.g")
	public static class50[] field674;

	@ObfuscatedName("xb.h")
	public static int field675;

	@ObfuscatedName("xb.i")
	public long field676 = -1L;

	@ObfuscatedName("xb.j")
	public String field677;

	@ObfuscatedName("xb.k")
	public byte[] field678;

	@ObfuscatedName("xb.l")
	public byte field679 = 1;

	@ObfuscatedName("xb.m")
	public int[] field680;

	@ObfuscatedName("xb.n")
	public int[] field681;

	@ObfuscatedName("xb.o")
	public int field682 = -1;

	@ObfuscatedName("xb.p")
	public int field683 = -1;

	@ObfuscatedName("xb.q")
	public int field684 = -1;

	@ObfuscatedName("xb.r")
	public int field685 = -1;

	@ObfuscatedName("xb.s")
	public int field686 = -1;

	@ObfuscatedName("xb.t")
	public boolean field687 = false;

	@ObfuscatedName("xb.u")
	public int[] field688;

	@ObfuscatedName("xb.v")
	public int[] field689;

	@ObfuscatedName("xb.w")
	public String[] field690;

	@ObfuscatedName("xb.x")
	public int field691 = -1;

	@ObfuscatedName("xb.y")
	public int field692 = -1;

	@ObfuscatedName("xb.z")
	public int field693 = -1;

	@ObfuscatedName("xb.A")
	public boolean field694 = true;

	@ObfuscatedName("xb.B")
	public int field695 = -1;

	@ObfuscatedName("xb.C")
	public int field696 = 128;

	@ObfuscatedName("xb.D")
	public int field697 = 128;

	@ObfuscatedName("xb.E")
	public static class18 field698 = new class18(30);

	@ObfuscatedName("xb.a(Ltb;)V")
	public static final void method241(class46 arg0) {
		field673 = new class36(arg0.method225(null, "npc.dat"));
		class36 var1 = new class36(arg0.method225(null, "npc.idx"));
		field671 = var1.method187();
		field672 = new int[field671];
		int var2 = 2;
		for (int var3 = 0; var3 < field671; var3++) {
			field672[var3] = var2;
			var2 += var1.method187();
		}

		field674 = new class50[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field674[var4] = new class50();
		}
	}

	@ObfuscatedName("xb.a(I)V")
	public static final void method242() {
		field698 = null;
		field672 = null;
		field674 = null;
		field673 = null;
	}

	@ObfuscatedName("xb.b(I)Lxb;")
	public static final class50 method243(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field674[var1].field676) {
				return field674[var1];
			}
		}

		field675 = (field675 + 1) % 20;
		class50 var2 = field674[field675] = new class50();
		field673.field525 = field672[arg0];
		var2.field676 = arg0;
		var2.method244(field673);
		return var2;
	}

	@ObfuscatedName("xb.a(BLjb;)V")
	public final void method244(class36 arg0) {
		while (true) {
			int var2 = arg0.method185();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method185();
				field680 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field680[var4] = arg0.method187();
				}
			} else if (var2 == 2) {
				field677 = arg0.method192();
			} else if (var2 == 3) {
				field678 = arg0.method193();
			} else if (var2 == 12) {
				field679 = arg0.method186();
			} else if (var2 == 13) {
				field682 = arg0.method187();
			} else if (var2 == 14) {
				field683 = arg0.method187();
			} else if (var2 == 16) {
				field687 = true;
			} else if (var2 == 17) {
				field683 = arg0.method187();
				field684 = arg0.method187();
				field685 = arg0.method187();
				field686 = arg0.method187();
			} else if (var2 >= 30 && var2 < 40) {
				if (field690 == null) {
					field690 = new String[5];
				}

				field690[var2 - 30] = arg0.method192();
			} else if (var2 == 40) {
				int var5 = arg0.method185();
				field688 = new int[var5];
				field689 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field688[var6] = arg0.method187();
					field689[var6] = arg0.method187();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method185();
				field681 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field681[var8] = arg0.method187();
				}
			} else if (var2 == 90) {
				field691 = arg0.method187();
			} else if (var2 == 91) {
				field692 = arg0.method187();
			} else if (var2 == 92) {
				field693 = arg0.method187();
			} else if (var2 == 93) {
				field694 = false;
			} else if (var2 == 95) {
				field695 = arg0.method187();
			} else if (var2 == 97) {
				field696 = arg0.method187();
			} else if (var2 == 98) {
				field697 = arg0.method187();
			}
		}
	}

	@ObfuscatedName("xb.a(II[I)Ldb;")
	public final class30 method245(int arg0, int arg1, int[] arg2) {
		Object var4 = null;
		class30 var5 = (class30) field698.method84(field676);
		if (var5 == null) {
			class30[] var6 = new class30[field680.length];
			for (int var7 = 0; var7 < field680.length; var7++) {
				var6[var7] = new class30(field680[var7]);
			}

			if (var6.length == 1) {
				var5 = var6[0];
			} else {
				var5 = new class30(var6.length, var6);
			}

			if (field688 != null) {
				for (int var8 = 0; var8 < field688.length; var8++) {
					var5.method115(field688[var8], field689[var8]);
				}
			}

			var5.method108();
			var5.method118(64, 850, -30, -50, -30, true);
			field698.method85(var5, field676);
		}

		class30 var9 = new class30(!field687, var5);
		if (arg0 != -1 && arg1 != -1) {
			var9.method110(arg0, arg1, arg2);
		} else if (arg0 != -1) {
			var9.method109(arg0);
		}

		if (field696 != 128 || field697 != 128) {
			var9.method117(field697, field696, field696);
		}

		var9.method106();
		var9.field419 = null;
		var9.field418 = null;
		return var9;
	}

	@ObfuscatedName("xb.c(I)Ldb;")
	public final class30 method246() {
		if (field681 == null) {
			return null;
		}

		class30[] var1 = new class30[field681.length];
		for (int var2 = 0; var2 < field681.length; var2++) {
			var1[var2] = new class30(field681[var2]);
		}

		class30 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class30(var1.length, var1);
		}

		if (field688 != null) {
			for (int var4 = 0; var4 < field688.length; var4++) {
				var3.method115(field688[var4], field689[var4]);
			}
		}

		return var3;
	}
}
