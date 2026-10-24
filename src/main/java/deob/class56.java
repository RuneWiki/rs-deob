package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.a")
	public class53 field796;

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
	public int[] field804 = new int[5];

	@ObfuscatedName("dc.j")
	public int[] field805 = new int[5];

	@ObfuscatedName("dc.k")
	public int[] field806 = new int[5];

	@ObfuscatedName("dc.l")
	public int field807;

	@ObfuscatedName("dc.m")
	public int field808 = 100;

	@ObfuscatedName("dc.n")
	public class54 field809;

	@ObfuscatedName("dc.o")
	public class53 field810;

	@ObfuscatedName("dc.p")
	public int field811 = 500;

	@ObfuscatedName("dc.q")
	public int field812;

	@ObfuscatedName("dc.r")
	public static int[] field813;

	@ObfuscatedName("dc.s")
	public static int[] field814;

	@ObfuscatedName("dc.t")
	public static int[] field815;

	@ObfuscatedName("dc.u")
	public static int[] field816 = new int[5];

	@ObfuscatedName("dc.v")
	public static int[] field817 = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] field818 = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] field819 = new int[5];

	@ObfuscatedName("dc.y")
	public static int[] field820 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method324() {
		field814 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field814[var0] = 1;
			} else {
				field814[var0] = -1;
			}
		}

		field815 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field815[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field813 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method325(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field813[var3] = 0;
		}

		if (arg1 < 10) {
			return field813;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field796.method311();
		field797.method311();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field798 != null) {
			field798.method311();
			field799.method311();
			var6 = (int) ((field798.field774 - field798.field773) * 32.768D / var4);
			var7 = (int) (field798.field773 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field800 != null) {
			field800.method311();
			field801.method311();
			var9 = (int) ((field800.field774 - field800.field773) * 32.768D / var4);
			var10 = (int) (field800.field773 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field804[var12] != 0) {
				field816[var12] = 0;
				field817[var12] = (int) (field806[var12] * var4);
				field818[var12] = (field804[var12] << 14) / 100;
				field819[var12] = (int) ((field796.field774 - field796.field773) * 32.768D * Math.pow(1.0057929410678534D, field805[var12]) / var4);
				field820[var12] = (int) (field796.field773 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field796.method312(arg0);
			int var15 = field797.method312(arg0);

			if (field798 != null) {
				int var16 = field798.method312(arg0);
				int var17 = field799.method312(arg0);
				var14 += method326(field798.field775, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field800 != null) {
				int var18 = field800.method312(arg0);
				int var19 = field801.method312(arg0);
				var15 = var15 * ((method326(field800.field775, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field804[var20] != 0) {
					int var21 = field817[var20] + var13;
					if (var21 < arg0) {
						field813[var21] += method326(field796.field775, field818[var20] * var15 >> 15, field816[var20]);
						field816[var20] += (field819[var20] * var14 >> 16) + field820[var20];
					}
				}
			}
		}

		if (field802 != null) {
			field802.method311();
			field803.method311();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field802.method312(arg0);
				int var27 = field803.method312(arg0);
				int var28;
				if (var24) {
					var28 = ((field802.field774 - field802.field773) * var26 >> 8) + field802.field773;
				} else {
					var28 = ((field802.field774 - field802.field773) * var27 >> 8) + field802.field773;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field813[var25] = 0;
				}
			}
		}

		if (field807 > 0 && field808 > 0) {
			int var29 = (int) (field807 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field813[var30] += field813[var30 - var29] * field808 / 100;
			}
		}

		if (field809.field781[0] > 0 || field809.field781[1] > 0) {
			field810.method311();
			int var31 = field810.method312(arg0 + 1);
			int var32 = field809.method316(0, var31 / 65536.0F);
			int var33 = field809.method316(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field813[var32 + var34] * (long) class54.field788 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field813[var32 + var34 - var37 - 1] * (long) class54.field786[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field813[var34 - var38 - 1] * (long) class54.field786[1][var38] >> 16);
					}

					field813[var34] = var36;
					var31 = field810.method312(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field813[var32 + var34] * (long) class54.field788 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field813[var32 + var34 - var42 - 1] * (long) class54.field786[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field813[var34 - var43 - 1] * (long) class54.field786[1][var43] >> 16);
						}

						field813[var34] = var41;
						var31 = field810.method312(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field809.method316(0, var31 / 65536.0F);
					var33 = field809.method316(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field813[var32 + var34 - var45 - 1] * (long) class54.field786[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field813[var34 - var46 - 1] * (long) class54.field786[1][var46] >> 16);
					}

					field813[var34] = var44;
					field810.method312(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field813[var48] < -32768) {
				field813[var48] = -32768;
			}

			if (field813[var48] > 32767) {
				field813[var48] = 32767;
			}
		}

		return field813;
	}

	@ObfuscatedName("dc.a(BIII)I")
	public final int method326(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field815[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field814[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(ILlb;)V")
	public final void method327(class38 arg0) {
		field796 = new class53();
		field796.method309(arg0);
		field797 = new class53();
		field797.method309(arg0);
		int var2 = arg0.method229();
		if (var2 != 0) {
			arg0.field621--;
			field798 = new class53();
			field798.method309(arg0);
			field799 = new class53();
			field799.method309(arg0);
		}

		int var3 = arg0.method229();
		if (var3 != 0) {
			arg0.field621--;
			field800 = new class53();
			field800.method309(arg0);
			field801 = new class53();
			field801.method309(arg0);
		}

		int var4 = arg0.method229();
		if (var4 != 0) {
			arg0.field621--;
			field802 = new class53();
			field802.method309(arg0);
			field803 = new class53();
			field803.method309(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method243();
			if (var6 == 0) {
				break;
			}

			field804[var5] = var6;
			field805[var5] = arg0.method242();
			field806[var5] = arg0.method243();
		}

		field807 = arg0.method243();
		field808 = arg0.method243();
		field811 = arg0.method231();
		field812 = arg0.method231();
		field809 = new class54();
		field810 = new class53();
		field809.method317(field810, arg0);
	}
}
