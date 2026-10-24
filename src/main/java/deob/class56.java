package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.a")
	public class53 field791;

	@ObfuscatedName("dc.b")
	public class53 field792;

	@ObfuscatedName("dc.c")
	public class53 field793;

	@ObfuscatedName("dc.d")
	public class53 field794;

	@ObfuscatedName("dc.e")
	public class53 field795;

	@ObfuscatedName("dc.f")
	public class53 field796;

	@ObfuscatedName("dc.g")
	public class53 field797;

	@ObfuscatedName("dc.h")
	public class53 field798;

	@ObfuscatedName("dc.i")
	public int[] field799 = new int[5];

	@ObfuscatedName("dc.j")
	public int[] field800 = new int[5];

	@ObfuscatedName("dc.k")
	public int[] field801 = new int[5];

	@ObfuscatedName("dc.l")
	public int field802;

	@ObfuscatedName("dc.m")
	public int field803 = 100;

	@ObfuscatedName("dc.n")
	public class54 field804;

	@ObfuscatedName("dc.o")
	public class53 field805;

	@ObfuscatedName("dc.p")
	public int field806 = 500;

	@ObfuscatedName("dc.q")
	public int field807;

	@ObfuscatedName("dc.r")
	public static int[] field808;

	@ObfuscatedName("dc.s")
	public static int[] field809;

	@ObfuscatedName("dc.t")
	public static int[] field810;

	@ObfuscatedName("dc.u")
	public static int[] field811 = new int[5];

	@ObfuscatedName("dc.v")
	public static int[] field812 = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] field813 = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] field814 = new int[5];

	@ObfuscatedName("dc.y")
	public static int[] field815 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method320() {
		field809 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field809[var0] = 1;
			} else {
				field809[var0] = -1;
			}
		}

		field810 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field810[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field808 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method321(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field808[var3] = 0;
		}

		if (arg1 < 10) {
			return field808;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field791.method307();
		field792.method307();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field793 != null) {
			field793.method307();
			field794.method307();
			var6 = (int) ((field793.field769 - field793.field768) * 32.768D / var4);
			var7 = (int) (field793.field768 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field795 != null) {
			field795.method307();
			field796.method307();
			var9 = (int) ((field795.field769 - field795.field768) * 32.768D / var4);
			var10 = (int) (field795.field768 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field799[var12] != 0) {
				field811[var12] = 0;
				field812[var12] = (int) (field801[var12] * var4);
				field813[var12] = (field799[var12] << 14) / 100;
				field814[var12] = (int) ((field791.field769 - field791.field768) * 32.768D * Math.pow(1.0057929410678534D, field800[var12]) / var4);
				field815[var12] = (int) (field791.field768 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field791.method308(arg0);
			int var15 = field792.method308(arg0);

			if (field793 != null) {
				int var16 = field793.method308(arg0);
				int var17 = field794.method308(arg0);
				var14 += method322(var17, field793.field770, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field795 != null) {
				int var18 = field795.method308(arg0);
				int var19 = field796.method308(arg0);
				var15 = var15 * ((method322(var19, field795.field770, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field799[var20] != 0) {
					int var21 = field812[var20] + var13;
					if (var21 < arg0) {
						field808[var21] += method322(field813[var20] * var15 >> 15, field791.field770, field811[var20]);
						field811[var20] += (field814[var20] * var14 >> 16) + field815[var20];
					}
				}
			}
		}

		if (field797 != null) {
			field797.method307();
			field798.method307();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field797.method308(arg0);
				int var27 = field798.method308(arg0);
				int var28;
				if (var24) {
					var28 = ((field797.field769 - field797.field768) * var26 >> 8) + field797.field768;
				} else {
					var28 = ((field797.field769 - field797.field768) * var27 >> 8) + field797.field768;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field808[var25] = 0;
				}
			}
		}

		if (field802 > 0 && field803 > 0) {
			int var29 = (int) (field802 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field808[var30] += field808[var30 - var29] * field803 / 100;
			}
		}

		if (field804.field776[0] > 0 || field804.field776[1] > 0) {
			field805.method307();
			int var31 = field805.method308(arg0 + 1);
			int var32 = field804.method312(0, var31 / 65536.0F);
			int var33 = field804.method312(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field808[var32 + var34] * (long) class54.field783 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field808[var32 + var34 - var37 - 1] * (long) class54.field781[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field808[var34 - var38 - 1] * (long) class54.field781[1][var38] >> 16);
					}

					field808[var34] = var36;
					var31 = field805.method308(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field808[var32 + var34] * (long) class54.field783 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field808[var32 + var34 - var42 - 1] * (long) class54.field781[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field808[var34 - var43 - 1] * (long) class54.field781[1][var43] >> 16);
						}

						field808[var34] = var41;
						var31 = field805.method308(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field804.method312(0, var31 / 65536.0F);
					var33 = field804.method312(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field808[var32 + var34 - var45 - 1] * (long) class54.field781[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field808[var34 - var46 - 1] * (long) class54.field781[1][var46] >> 16);
					}

					field808[var34] = var44;
					field805.method308(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field808[var48] < -32768) {
				field808[var48] = -32768;
			}

			if (field808[var48] > 32767) {
				field808[var48] = 32767;
			}
		}

		return field808;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public final int method322(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field810[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field809[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(Llb;B)V")
	public final void method323(class38 arg0) {
		field791 = new class53();
		field791.method305(arg0);
		field792 = new class53();
		field792.method305(arg0);
		int var2 = arg0.method225();
		if (var2 != 0) {
			arg0.field617--;
			field793 = new class53();
			field793.method305(arg0);
			field794 = new class53();
			field794.method305(arg0);
		}

		int var3 = arg0.method225();
		if (var3 != 0) {
			arg0.field617--;
			field795 = new class53();
			field795.method305(arg0);
			field796 = new class53();
			field796.method305(arg0);
		}

		int var4 = arg0.method225();
		if (var4 != 0) {
			arg0.field617--;
			field797 = new class53();
			field797.method305(arg0);
			field798 = new class53();
			field798.method305(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method239();
			if (var6 == 0) {
				break;
			}

			field799[var5] = var6;
			field800[var5] = arg0.method238();
			field801[var5] = arg0.method239();
		}

		field802 = arg0.method239();
		field803 = arg0.method239();
		field806 = arg0.method227();
		field807 = arg0.method227();
		field804 = new class54();
		field805 = new class53();
		field804.method313(field805, arg0);
	}
}
