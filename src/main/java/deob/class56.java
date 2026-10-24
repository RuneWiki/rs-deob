package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.a")
	public class54 field789;

	@ObfuscatedName("dc.b")
	public class54 field790;

	@ObfuscatedName("dc.c")
	public class54 field791;

	@ObfuscatedName("dc.d")
	public class54 field792;

	@ObfuscatedName("dc.e")
	public class54 field793;

	@ObfuscatedName("dc.f")
	public class54 field794;

	@ObfuscatedName("dc.g")
	public class54 field795;

	@ObfuscatedName("dc.h")
	public class54 field796;

	@ObfuscatedName("dc.i")
	public int[] field797 = new int[5];

	@ObfuscatedName("dc.j")
	public int[] field798 = new int[5];

	@ObfuscatedName("dc.k")
	public int[] field799 = new int[5];

	@ObfuscatedName("dc.l")
	public int field800;

	@ObfuscatedName("dc.m")
	public int field801 = 100;

	@ObfuscatedName("dc.n")
	public int field802 = 500;

	@ObfuscatedName("dc.o")
	public int field803;

	@ObfuscatedName("dc.p")
	public static int[] field804;

	@ObfuscatedName("dc.q")
	public static int[] field805;

	@ObfuscatedName("dc.r")
	public static int[] field806;

	@ObfuscatedName("dc.s")
	public static int[] field807 = new int[5];

	@ObfuscatedName("dc.t")
	public static int[] field808 = new int[5];

	@ObfuscatedName("dc.u")
	public static int[] field809 = new int[5];

	@ObfuscatedName("dc.v")
	public static int[] field810 = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] field811 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method328() {
		field805 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field805[var0] = 1;
			} else {
				field805[var0] = -1;
			}
		}

		field806 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field806[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field804 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method329(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field804[var3] = 0;
		}

		if (arg1 < 10) {
			return field804;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field789.method320();
		field790.method320();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field791 != null) {
			field791.method320();
			field792.method320();
			var6 = (int) ((field791.field775 - field791.field774) * 32.768D / var4);
			var7 = (int) (field791.field774 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field793 != null) {
			field793.method320();
			field794.method320();
			var9 = (int) ((field793.field775 - field793.field774) * 32.768D / var4);
			var10 = (int) (field793.field774 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field797[var12] != 0) {
				field807[var12] = 0;
				field808[var12] = (int) (field799[var12] * var4);
				field809[var12] = (field797[var12] << 14) / 100;
				field810[var12] = (int) ((field789.field775 - field789.field774) * 32.768D * Math.pow(1.0057929410678534D, field798[var12]) / var4);
				field811[var12] = (int) (field789.field774 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field789.method321(arg0);
			int var15 = field790.method321(arg0);

			if (field791 != null) {
				int var16 = field791.method321(arg0);
				int var17 = field792.method321(arg0);
				var14 += method330(var8, field791.field776, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field793 != null) {
				int var18 = field793.method321(arg0);
				int var19 = field794.method321(arg0);
				var15 = var15 * ((method330(var11, field793.field776, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field797[var20] != 0) {
					int var21 = field808[var20] + var13;
					if (var21 < arg0) {
						field804[var21] += method330(field807[var20], field789.field776, field809[var20] * var15 >> 15);
						field807[var20] += (field810[var20] * var14 >> 16) + field811[var20];
					}
				}
			}
		}

		if (field795 != null) {
			field795.method320();
			field796.method320();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field795.method321(arg0);
				int var27 = field796.method321(arg0);
				int var28;
				if (var24) {
					var28 = ((field795.field775 - field795.field774) * var26 >> 8) + field795.field774;
				} else {
					var28 = ((field795.field775 - field795.field774) * var27 >> 8) + field795.field774;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field804[var25] = 0;
				}
			}
		}

		if (field800 > 0 && field801 > 0) {
			int var29 = (int) (field800 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field804[var30] += field804[var30 - var29] * field801 / 100;
			}
		}

		for (int var31 = 0; var31 < arg0; var31++) {
			if (field804[var31] < -32768) {
				field804[var31] = -32768;
			}

			if (field804[var31] > 32767) {
				field804[var31] = 32767;
			}
		}

		return field804;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public final int method330(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field806[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field805[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(ILmb;)V")
	public final void method331(class39 arg0) {
		field789 = new class54();
		field789.method319(arg0);
		field790 = new class54();
		field790.method319(arg0);
		int var2 = arg0.method239();
		if (var2 != 0) {
			arg0.field624--;
			field791 = new class54();
			field791.method319(arg0);
			field792 = new class54();
			field792.method319(arg0);
		}

		int var3 = arg0.method239();
		if (var3 != 0) {
			arg0.field624--;
			field793 = new class54();
			field793.method319(arg0);
			field794 = new class54();
			field794.method319(arg0);
		}

		int var4 = arg0.method239();
		if (var4 != 0) {
			arg0.field624--;
			field795 = new class54();
			field795.method319(arg0);
			field796 = new class54();
			field796.method319(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method253();
			if (var6 == 0) {
				break;
			}

			field797[var5] = var6;
			field798[var5] = arg0.method252();
			field799[var5] = arg0.method253();
		}

		field800 = arg0.method253();
		field801 = arg0.method253();
		field802 = arg0.method241();
		field803 = arg0.method241();
	}
}
