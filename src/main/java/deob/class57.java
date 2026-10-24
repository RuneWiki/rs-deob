package deob;

@ObfuscatedName("ec")
public class class57 {

	@ObfuscatedName("ec.c")
	public class54 field798;

	@ObfuscatedName("ec.d")
	public class54 field799;

	@ObfuscatedName("ec.e")
	public class54 field800;

	@ObfuscatedName("ec.f")
	public class54 field801;

	@ObfuscatedName("ec.g")
	public class54 field802;

	@ObfuscatedName("ec.h")
	public class54 field803;

	@ObfuscatedName("ec.i")
	public class54 field804;

	@ObfuscatedName("ec.j")
	public class54 field805;

	@ObfuscatedName("ec.k")
	public int[] field806 = new int[5];

	@ObfuscatedName("ec.l")
	public int[] field807 = new int[5];

	@ObfuscatedName("ec.m")
	public int[] field808 = new int[5];

	@ObfuscatedName("ec.n")
	public int field809;

	@ObfuscatedName("ec.o")
	public int field810 = 100;

	@ObfuscatedName("ec.p")
	public class55 field811;

	@ObfuscatedName("ec.q")
	public class54 field812;

	@ObfuscatedName("ec.r")
	public int field813 = 500;

	@ObfuscatedName("ec.s")
	public int field814;

	@ObfuscatedName("ec.t")
	public static int[] field815;

	@ObfuscatedName("ec.u")
	public static int[] field816;

	@ObfuscatedName("ec.v")
	public static int[] field817;

	@ObfuscatedName("ec.w")
	public static int[] field818 = new int[5];

	@ObfuscatedName("ec.x")
	public static int[] field819 = new int[5];

	@ObfuscatedName("ec.y")
	public static int[] field820 = new int[5];

	@ObfuscatedName("ec.z")
	public static int[] field821 = new int[5];

	@ObfuscatedName("ec.A")
	public static int[] field822 = new int[5];

	@ObfuscatedName("ec.a()V")
	public static final void method323() {
		field816 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field816[var0] = 1;
			} else {
				field816[var0] = -1;
			}
		}

		field817 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field817[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field815 = new int[220500];
	}

	@ObfuscatedName("ec.a(II)[I")
	public final int[] method324(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field815[var3] = 0;
		}

		if (arg1 < 10) {
			return field815;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field798.method310();
		field799.method310();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field800 != null) {
			field800.method310();
			field801.method310();
			var6 = (int) ((field800.field776 - field800.field775) * 32.768D / var4);
			var7 = (int) (field800.field775 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field802 != null) {
			field802.method310();
			field803.method310();
			var9 = (int) ((field802.field776 - field802.field775) * 32.768D / var4);
			var10 = (int) (field802.field775 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field806[var12] != 0) {
				field818[var12] = 0;
				field819[var12] = (int) (field808[var12] * var4);
				field820[var12] = (field806[var12] << 14) / 100;
				field821[var12] = (int) ((field798.field776 - field798.field775) * 32.768D * Math.pow(1.0057929410678534D, field807[var12]) / var4);
				field822[var12] = (int) (field798.field775 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field798.method311(arg0);
			int var15 = field799.method311(arg0);

			if (field800 != null) {
				int var16 = field800.method311(arg0);
				int var17 = field801.method311(arg0);
				var14 += method325(var8, var17, field800.field777) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field802 != null) {
				int var18 = field802.method311(arg0);
				int var19 = field803.method311(arg0);
				var15 = var15 * ((method325(var11, var19, field802.field777) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field806[var20] != 0) {
					int var21 = field819[var20] + var13;
					if (var21 < arg0) {
						field815[var21] += method325(field818[var20], field820[var20] * var15 >> 15, field798.field777);
						field818[var20] += (field821[var20] * var14 >> 16) + field822[var20];
					}
				}
			}
		}

		if (field804 != null) {
			field804.method310();
			field805.method310();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field804.method311(arg0);
				int var27 = field805.method311(arg0);
				int var28;
				if (var24) {
					var28 = ((field804.field776 - field804.field775) * var26 >> 8) + field804.field775;
				} else {
					var28 = ((field804.field776 - field804.field775) * var27 >> 8) + field804.field775;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field815[var25] = 0;
				}
			}
		}

		if (field809 > 0 && field810 > 0) {
			int var29 = (int) (field809 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field815[var30] += field815[var30 - var29] * field810 / 100;
			}
		}

		if (field811.field783[0] > 0 || field811.field783[1] > 0) {
			field812.method310();
			int var31 = field812.method311(arg0 + 1);
			int var32 = field811.method315(var31 / 65536.0F, 0);
			int var33 = field811.method315(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field815[var32 + var34] * (long) class55.field790 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field815[var32 + var34 - var37 - 1] * (long) class55.field788[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field815[var34 - var38 - 1] * (long) class55.field788[1][var38] >> 16);
					}

					field815[var34] = var36;
					var31 = field812.method311(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field815[var32 + var34] * (long) class55.field790 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field815[var32 + var34 - var42 - 1] * (long) class55.field788[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field815[var34 - var43 - 1] * (long) class55.field788[1][var43] >> 16);
						}

						field815[var34] = var41;
						var31 = field812.method311(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field811.method315(var31 / 65536.0F, 0);
					var33 = field811.method315(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field815[var32 + var34 - var45 - 1] * (long) class55.field788[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field815[var34 - var46 - 1] * (long) class55.field788[1][var46] >> 16);
					}

					field815[var34] = var44;
					field812.method311(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field815[var48] < -32768) {
				field815[var48] = -32768;
			}

			if (field815[var48] > 32767) {
				field815[var48] = 32767;
			}
		}

		return field815;
	}

	@ObfuscatedName("ec.a(IZII)I")
	public final int method325(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg2 == 2) {
			return field817[arg0 & 0x7FFF] * arg1 >> 14;
		}

		if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg2 == 4) {
			return field816[arg0 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("ec.a(BLmb;)V")
	public final void method326(class39 arg0) {
		field798 = new class54();
		field798.method308(arg0);
		field799 = new class54();
		field799.method308(arg0);
		int var2 = arg0.method228();
		if (var2 != 0) {
			arg0.field625--;
			field800 = new class54();
			field800.method308(arg0);
			field801 = new class54();
			field801.method308(arg0);
		}

		int var3 = arg0.method228();
		if (var3 != 0) {
			arg0.field625--;
			field802 = new class54();
			field802.method308(arg0);
			field803 = new class54();
			field803.method308(arg0);
		}

		int var4 = arg0.method228();
		if (var4 != 0) {
			arg0.field625--;
			field804 = new class54();
			field804.method308(arg0);
			field805 = new class54();
			field805.method308(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method242();
			if (var6 == 0) {
				break;
			}

			field806[var5] = var6;
			field807[var5] = arg0.method241();
			field808[var5] = arg0.method242();
		}

		field809 = arg0.method242();
		field810 = arg0.method242();
		field813 = arg0.method230();
		field814 = arg0.method230();
		field811 = new class55();
		field812 = new class54();
		field811.method316(arg0, field812);
	}
}
