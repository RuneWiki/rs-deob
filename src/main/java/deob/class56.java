package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.b")
	public class53 field797;

	@ObfuscatedName("dc.c")
	public class53 field798;

	@ObfuscatedName("dc.d")
	public class53 field799;

	@ObfuscatedName("dc.e")
	public class53 field800;

	@ObfuscatedName("dc.f")
	public class53 field801;

	@ObfuscatedName("dc.g")
	public class53 field802;

	@ObfuscatedName("dc.h")
	public class53 field803;

	@ObfuscatedName("dc.i")
	public class53 field804;

	@ObfuscatedName("dc.j")
	public int[] field805 = new int[5];

	@ObfuscatedName("dc.k")
	public int[] field806 = new int[5];

	@ObfuscatedName("dc.l")
	public int[] field807 = new int[5];

	@ObfuscatedName("dc.m")
	public int field808;

	@ObfuscatedName("dc.n")
	public int field809 = 100;

	@ObfuscatedName("dc.o")
	public class54 field810;

	@ObfuscatedName("dc.p")
	public class53 field811;

	@ObfuscatedName("dc.q")
	public int field812 = 500;

	@ObfuscatedName("dc.r")
	public int field813;

	@ObfuscatedName("dc.s")
	public static int[] field814;

	@ObfuscatedName("dc.t")
	public static int[] field815;

	@ObfuscatedName("dc.u")
	public static int[] field816;

	@ObfuscatedName("dc.v")
	public static int[] field817 = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] field818 = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] field819 = new int[5];

	@ObfuscatedName("dc.y")
	public static int[] field820 = new int[5];

	@ObfuscatedName("dc.z")
	public static int[] field821 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method324() {
		field815 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field815[var0] = 1;
			} else {
				field815[var0] = -1;
			}
		}

		field816 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field816[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field814 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method325(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field814[var3] = 0;
		}

		if (arg1 < 10) {
			return field814;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field797.method311();
		field798.method311();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field799 != null) {
			field799.method311();
			field800.method311();
			var6 = (int) ((field799.field775 - field799.field774) * 32.768D / var4);
			var7 = (int) (field799.field774 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field801 != null) {
			field801.method311();
			field802.method311();
			var9 = (int) ((field801.field775 - field801.field774) * 32.768D / var4);
			var10 = (int) (field801.field774 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field805[var12] != 0) {
				field817[var12] = 0;
				field818[var12] = (int) (field807[var12] * var4);
				field819[var12] = (field805[var12] << 14) / 100;
				field820[var12] = (int) ((field797.field775 - field797.field774) * 32.768D * Math.pow(1.0057929410678534D, field806[var12]) / var4);
				field821[var12] = (int) (field797.field774 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field797.method312(arg0);
			int var15 = field798.method312(arg0);

			if (field799 != null) {
				int var16 = field799.method312(arg0);
				int var17 = field800.method312(arg0);
				var14 += method326(var17, var8, field799.field776) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field801 != null) {
				int var18 = field801.method312(arg0);
				int var19 = field802.method312(arg0);
				var15 = var15 * ((method326(var19, var11, field801.field776) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field805[var20] != 0) {
					int var21 = field818[var20] + var13;
					if (var21 < arg0) {
						field814[var21] += method326(field819[var20] * var15 >> 15, field817[var20], field797.field776);
						field817[var20] += (field820[var20] * var14 >> 16) + field821[var20];
					}
				}
			}
		}

		if (field803 != null) {
			field803.method311();
			field804.method311();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field803.method312(arg0);
				int var27 = field804.method312(arg0);
				int var28;
				if (var24) {
					var28 = ((field803.field775 - field803.field774) * var26 >> 8) + field803.field774;
				} else {
					var28 = ((field803.field775 - field803.field774) * var27 >> 8) + field803.field774;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field814[var25] = 0;
				}
			}
		}

		if (field808 > 0 && field809 > 0) {
			int var29 = (int) (field808 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field814[var30] += field814[var30 - var29] * field809 / 100;
			}
		}

		if (field810.field782[0] > 0 || field810.field782[1] > 0) {
			field811.method311();
			int var31 = field811.method312(arg0 + 1);
			int var32 = field810.method316(var31 / 65536.0F, 0);
			int var33 = field810.method316(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field814[var32 + var34] * (long) class54.field789 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field814[var32 + var34 - var37 - 1] * (long) class54.field787[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field814[var34 - var38 - 1] * (long) class54.field787[1][var38] >> 16);
					}

					field814[var34] = var36;
					var31 = field811.method312(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field814[var32 + var34] * (long) class54.field789 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field814[var32 + var34 - var42 - 1] * (long) class54.field787[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field814[var34 - var43 - 1] * (long) class54.field787[1][var43] >> 16);
						}

						field814[var34] = var41;
						var31 = field811.method312(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field810.method316(var31 / 65536.0F, 0);
					var33 = field810.method316(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field814[var32 + var34 - var45 - 1] * (long) class54.field787[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field814[var34 - var46 - 1] * (long) class54.field787[1][var46] >> 16);
					}

					field814[var34] = var44;
					field811.method312(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field814[var48] < -32768) {
				field814[var48] = -32768;
			}

			if (field814[var48] > 32767) {
				field814[var48] = 32767;
			}
		}

		return field814;
	}

	@ObfuscatedName("dc.a(IIIB)I")
	public final int method326(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg2 == 2) {
			return field816[arg1 & 0x7FFF] * arg0 >> 14;
		}

		if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg2 == 4) {
			return field815[arg1 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(Llb;Z)V")
	public final void method327(class38 arg0) {
		field797 = new class53();
		field797.method309(arg0);
		field798 = new class53();
		field798.method309(arg0);
		int var2 = arg0.method229();
		if (var2 != 0) {
			arg0.field622--;
			field799 = new class53();
			field799.method309(arg0);
			field800 = new class53();
			field800.method309(arg0);
		}

		int var3 = arg0.method229();
		if (var3 != 0) {
			arg0.field622--;
			field801 = new class53();
			field801.method309(arg0);
			field802 = new class53();
			field802.method309(arg0);
		}

		int var4 = arg0.method229();
		if (var4 != 0) {
			arg0.field622--;
			field803 = new class53();
			field803.method309(arg0);
			field804 = new class53();
			field804.method309(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method243();
			if (var6 == 0) {
				break;
			}

			field805[var5] = var6;
			field806[var5] = arg0.method242();
			field807[var5] = arg0.method243();
		}

		field808 = arg0.method243();
		field809 = arg0.method243();
		field812 = arg0.method231();
		field813 = arg0.method231();
		field810 = new class54();
		field811 = new class53();
		field810.method317(arg0, field811);
	}
}
