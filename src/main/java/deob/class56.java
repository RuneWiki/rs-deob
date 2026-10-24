package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.b")
	public class54 field788;

	@ObfuscatedName("dc.c")
	public class54 field789;

	@ObfuscatedName("dc.d")
	public class54 field790;

	@ObfuscatedName("dc.e")
	public class54 field791;

	@ObfuscatedName("dc.f")
	public class54 field792;

	@ObfuscatedName("dc.g")
	public class54 field793;

	@ObfuscatedName("dc.h")
	public class54 field794;

	@ObfuscatedName("dc.i")
	public class54 field795;

	@ObfuscatedName("dc.j")
	public int[] field796 = new int[5];

	@ObfuscatedName("dc.k")
	public int[] field797 = new int[5];

	@ObfuscatedName("dc.l")
	public int[] field798 = new int[5];

	@ObfuscatedName("dc.m")
	public int field799;

	@ObfuscatedName("dc.n")
	public int field800 = 100;

	@ObfuscatedName("dc.o")
	public int field801 = 500;

	@ObfuscatedName("dc.p")
	public int field802;

	@ObfuscatedName("dc.q")
	public static int[] field803;

	@ObfuscatedName("dc.r")
	public static int[] field804;

	@ObfuscatedName("dc.s")
	public static int[] field805;

	@ObfuscatedName("dc.t")
	public static int[] field806 = new int[5];

	@ObfuscatedName("dc.u")
	public static int[] field807 = new int[5];

	@ObfuscatedName("dc.v")
	public static int[] field808 = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] field809 = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] field810 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method328() {
		field804 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field804[var0] = 1;
			} else {
				field804[var0] = -1;
			}
		}

		field805 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field805[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field803 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method329(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field803[var3] = 0;
		}

		if (arg1 < 10) {
			return field803;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field788.method320();
		field789.method320();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field790 != null) {
			field790.method320();
			field791.method320();
			var6 = (int) ((field790.field774 - field790.field773) * 32.768D / var4);
			var7 = (int) (field790.field773 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field792 != null) {
			field792.method320();
			field793.method320();
			var9 = (int) ((field792.field774 - field792.field773) * 32.768D / var4);
			var10 = (int) (field792.field773 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field796[var12] != 0) {
				field806[var12] = 0;
				field807[var12] = (int) (field798[var12] * var4);
				field808[var12] = (field796[var12] << 14) / 100;
				field809[var12] = (int) ((field788.field774 - field788.field773) * 32.768D * Math.pow(1.0057929410678534D, field797[var12]) / var4);
				field810[var12] = (int) (field788.field773 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field788.method321(arg0);
			int var15 = field789.method321(arg0);

			if (field790 != null) {
				int var16 = field790.method321(arg0);
				int var17 = field791.method321(arg0);
				var14 += method330(field790.field775, var8, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field792 != null) {
				int var18 = field792.method321(arg0);
				int var19 = field793.method321(arg0);
				var15 = var15 * ((method330(field792.field775, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field796[var20] != 0) {
					int var21 = field807[var20] + var13;
					if (var21 < arg0) {
						field803[var21] += method330(field788.field775, field806[var20], field808[var20] * var15 >> 15);
						field806[var20] += (field809[var20] * var14 >> 16) + field810[var20];
					}
				}
			}
		}

		if (field794 != null) {
			field794.method320();
			field795.method320();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field794.method321(arg0);
				int var27 = field795.method321(arg0);
				int var28;
				if (var24) {
					var28 = ((field794.field774 - field794.field773) * var26 >> 8) + field794.field773;
				} else {
					var28 = ((field794.field774 - field794.field773) * var27 >> 8) + field794.field773;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field803[var25] = 0;
				}
			}
		}

		if (field799 > 0 && field800 > 0) {
			int var29 = (int) (field799 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field803[var30] += field803[var30 - var29] * field800 / 100;
			}
		}

		for (int var31 = 0; var31 < arg0; var31++) {
			if (field803[var31] < -32768) {
				field803[var31] = -32768;
			}

			if (field803[var31] > 32767) {
				field803[var31] = 32767;
			}
		}

		return field803;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public final int method330(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg0 == 2) {
			return field805[arg1 & 0x7FFF] * arg2 >> 14;
		}

		if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg0 == 4) {
			return field804[arg1 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(Lmb;B)V")
	public final void method331(class39 arg0) {
		field788 = new class54();
		field788.method319(arg0);
		field789 = new class54();
		field789.method319(arg0);
		int var2 = arg0.method239();
		if (var2 != 0) {
			arg0.field623--;
			field790 = new class54();
			field790.method319(arg0);
			field791 = new class54();
			field791.method319(arg0);
		}

		int var3 = arg0.method239();
		if (var3 != 0) {
			arg0.field623--;
			field792 = new class54();
			field792.method319(arg0);
			field793 = new class54();
			field793.method319(arg0);
		}

		int var4 = arg0.method239();
		if (var4 != 0) {
			arg0.field623--;
			field794 = new class54();
			field794.method319(arg0);
			field795 = new class54();
			field795.method319(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method253();
			if (var6 == 0) {
				break;
			}

			field796[var5] = var6;
			field797[var5] = arg0.method252();
			field798[var5] = arg0.method253();
		}

		field799 = arg0.method253();
		field800 = arg0.method253();
		field801 = arg0.method241();
		field802 = arg0.method241();
	}
}
