package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.c")
	public class53 field789;

	@ObfuscatedName("dc.d")
	public class53 field790;

	@ObfuscatedName("dc.e")
	public class53 field791;

	@ObfuscatedName("dc.f")
	public class53 field792;

	@ObfuscatedName("dc.g")
	public class53 field793;

	@ObfuscatedName("dc.h")
	public class53 field794;

	@ObfuscatedName("dc.i")
	public class53 field795;

	@ObfuscatedName("dc.j")
	public class53 field796;

	@ObfuscatedName("dc.k")
	public int[] field797 = new int[5];

	@ObfuscatedName("dc.l")
	public int[] field798 = new int[5];

	@ObfuscatedName("dc.m")
	public int[] field799 = new int[5];

	@ObfuscatedName("dc.n")
	public int field800;

	@ObfuscatedName("dc.o")
	public int field801 = 100;

	@ObfuscatedName("dc.p")
	public class54 field802;

	@ObfuscatedName("dc.q")
	public class53 field803;

	@ObfuscatedName("dc.r")
	public int field804 = 500;

	@ObfuscatedName("dc.s")
	public int field805;

	@ObfuscatedName("dc.t")
	public static int[] field806;

	@ObfuscatedName("dc.u")
	public static int[] field807;

	@ObfuscatedName("dc.v")
	public static int[] field808;

	@ObfuscatedName("dc.w")
	public static int[] field809 = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] field810 = new int[5];

	@ObfuscatedName("dc.y")
	public static int[] field811 = new int[5];

	@ObfuscatedName("dc.z")
	public static int[] field812 = new int[5];

	@ObfuscatedName("dc.A")
	public static int[] field813 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method319() {
		field807 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field807[var0] = 1;
			} else {
				field807[var0] = -1;
			}
		}

		field808 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field808[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field806 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method320(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field806[var3] = 0;
		}

		if (arg1 < 10) {
			return field806;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field789.method306();
		field790.method306();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field791 != null) {
			field791.method306();
			field792.method306();
			var6 = (int) ((field791.field767 - field791.field766) * 32.768D / var4);
			var7 = (int) (field791.field766 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field793 != null) {
			field793.method306();
			field794.method306();
			var9 = (int) ((field793.field767 - field793.field766) * 32.768D / var4);
			var10 = (int) (field793.field766 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field797[var12] != 0) {
				field809[var12] = 0;
				field810[var12] = (int) (field799[var12] * var4);
				field811[var12] = (field797[var12] << 14) / 100;
				field812[var12] = (int) ((field789.field767 - field789.field766) * 32.768D * Math.pow(1.0057929410678534D, field798[var12]) / var4);
				field813[var12] = (int) (field789.field766 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field789.method307(arg0);
			int var15 = field790.method307(arg0);

			if (field791 != null) {
				int var16 = field791.method307(arg0);
				int var17 = field792.method307(arg0);
				var14 += method321(var17, var8, field791.field768) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field793 != null) {
				int var18 = field793.method307(arg0);
				int var19 = field794.method307(arg0);
				var15 = var15 * ((method321(var19, var11, field793.field768) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field797[var20] != 0) {
					int var21 = field810[var20] + var13;
					if (var21 < arg0) {
						field806[var21] += method321(field811[var20] * var15 >> 15, field809[var20], field789.field768);
						field809[var20] += (field812[var20] * var14 >> 16) + field813[var20];
					}
				}
			}
		}

		if (field795 != null) {
			field795.method306();
			field796.method306();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field795.method307(arg0);
				int var27 = field796.method307(arg0);
				int var28;
				if (var24) {
					var28 = ((field795.field767 - field795.field766) * var26 >> 8) + field795.field766;
				} else {
					var28 = ((field795.field767 - field795.field766) * var27 >> 8) + field795.field766;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field806[var25] = 0;
				}
			}
		}

		if (field800 > 0 && field801 > 0) {
			int var29 = (int) (field800 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field806[var30] += field806[var30 - var29] * field801 / 100;
			}
		}

		if (field802.field774[0] > 0 || field802.field774[1] > 0) {
			field803.method306();
			int var31 = field803.method307(arg0 + 1);
			int var32 = field802.method311(var31 / 65536.0F, 0);
			int var33 = field802.method311(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field806[var32 + var34] * (long) class54.field781 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field806[var32 + var34 - var37 - 1] * (long) class54.field779[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field806[var34 - var38 - 1] * (long) class54.field779[1][var38] >> 16);
					}

					field806[var34] = var36;
					var31 = field803.method307(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field806[var32 + var34] * (long) class54.field781 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field806[var32 + var34 - var42 - 1] * (long) class54.field779[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field806[var34 - var43 - 1] * (long) class54.field779[1][var43] >> 16);
						}

						field806[var34] = var41;
						var31 = field803.method307(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field802.method311(var31 / 65536.0F, 0);
					var33 = field802.method311(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field806[var32 + var34 - var45 - 1] * (long) class54.field779[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field806[var34 - var46 - 1] * (long) class54.field779[1][var46] >> 16);
					}

					field806[var34] = var44;
					field803.method307(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field806[var48] < -32768) {
				field806[var48] = -32768;
			}

			if (field806[var48] > 32767) {
				field806[var48] = 32767;
			}
		}

		return field806;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public final int method321(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg2 == 2) {
			return field808[arg1 & 0x7FFF] * arg0 >> 14;
		}

		if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg2 == 4) {
			return field807[arg1 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(Llb;I)V")
	public final void method322(class38 arg0) {
		field789 = new class53();
		field789.method304(arg0);
		field790 = new class53();
		field790.method304(arg0);
		int var2 = arg0.method224();
		if (var2 != 0) {
			arg0.field616--;
			field791 = new class53();
			field791.method304(arg0);
			field792 = new class53();
			field792.method304(arg0);
		}

		int var3 = arg0.method224();
		if (var3 != 0) {
			arg0.field616--;
			field793 = new class53();
			field793.method304(arg0);
			field794 = new class53();
			field794.method304(arg0);
		}

		int var4 = arg0.method224();
		if (var4 != 0) {
			arg0.field616--;
			field795 = new class53();
			field795.method304(arg0);
			field796 = new class53();
			field796.method304(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method238();
			if (var6 == 0) {
				break;
			}

			field797[var5] = var6;
			field798[var5] = arg0.method237();
			field799[var5] = arg0.method238();
		}

		field800 = arg0.method238();
		field801 = arg0.method238();
		field804 = arg0.method226();
		field805 = arg0.method226();
		field802 = new class54();
		field803 = new class53();
		field802.method312(field803, arg0);
	}
}
