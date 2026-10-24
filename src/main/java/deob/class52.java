package deob;

@ObfuscatedName("zb")
public class class52 {

	@ObfuscatedName("zb.b")
	public class50 field673;

	@ObfuscatedName("zb.c")
	public class50 field674;

	@ObfuscatedName("zb.d")
	public class50 field675;

	@ObfuscatedName("zb.e")
	public class50 field676;

	@ObfuscatedName("zb.f")
	public class50 field677;

	@ObfuscatedName("zb.g")
	public class50 field678;

	@ObfuscatedName("zb.h")
	public class50 field679;

	@ObfuscatedName("zb.i")
	public class50 field680;

	@ObfuscatedName("zb.j")
	public int[] field681 = new int[5];

	@ObfuscatedName("zb.k")
	public int[] field682 = new int[5];

	@ObfuscatedName("zb.l")
	public int[] field683 = new int[5];

	@ObfuscatedName("zb.m")
	public int field684;

	@ObfuscatedName("zb.n")
	public int field685 = 100;

	@ObfuscatedName("zb.o")
	public int field686 = 500;

	@ObfuscatedName("zb.p")
	public int field687;

	@ObfuscatedName("zb.q")
	public static int[] field688;

	@ObfuscatedName("zb.r")
	public static int[] field689;

	@ObfuscatedName("zb.s")
	public static int[] field690;

	@ObfuscatedName("zb.t")
	public static int[] field691 = new int[5];

	@ObfuscatedName("zb.u")
	public static int[] field692 = new int[5];

	@ObfuscatedName("zb.v")
	public static int[] field693 = new int[5];

	@ObfuscatedName("zb.w")
	public static int[] field694 = new int[5];

	@ObfuscatedName("zb.x")
	public static int[] field695 = new int[5];

	@ObfuscatedName("zb.a()V")
	public static final void method276() {
		field689 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field689[var0] = 1;
			} else {
				field689[var0] = -1;
			}
		}

		field690 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field690[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field688 = new int[220500];
	}

	@ObfuscatedName("zb.a(II)[I")
	public final int[] method277(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field688[var3] = 0;
		}

		if (arg1 < 10) {
			return field688;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field673.method268();
		field674.method268();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field675 != null) {
			field675.method268();
			field676.method268();
			var6 = (int) ((field675.field659 - field675.field658) * 32.768D / var4);
			var7 = (int) (field675.field658 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field677 != null) {
			field677.method268();
			field678.method268();
			var9 = (int) ((field677.field659 - field677.field658) * 32.768D / var4);
			var10 = (int) (field677.field658 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field681[var12] != 0) {
				field691[var12] = 0;
				field692[var12] = (int) (field683[var12] * var4);
				field693[var12] = (field681[var12] << 14) / 100;
				field694[var12] = (int) ((field673.field659 - field673.field658) * 32.768D * Math.pow(1.0057929410678534D, field682[var12]) / var4);
				field695[var12] = (int) (field673.field658 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field673.method269(arg0);
			int var15 = field674.method269(arg0);

			if (field675 != null) {
				int var16 = field675.method269(arg0);
				int var17 = field676.method269(arg0);
				var14 += method278(var17, var8, field675.field660) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field677 != null) {
				int var18 = field677.method269(arg0);
				int var19 = field678.method269(arg0);
				var15 = var15 * ((method278(var19, var11, field677.field660) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field681[var20] != 0) {
					int var21 = field692[var20] + var13;
					if (var21 < arg0) {
						field688[var21] += method278(field693[var20] * var15 >> 15, field691[var20], field673.field660);
						field691[var20] += (field694[var20] * var14 >> 16) + field695[var20];
					}
				}
			}
		}

		if (field679 != null) {
			field679.method268();
			field680.method268();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field679.method269(arg0);
				int var27 = field680.method269(arg0);
				int var28;
				if (var24) {
					var28 = ((field679.field659 - field679.field658) * var26 >> 8) + field679.field658;
				} else {
					var28 = ((field679.field659 - field679.field658) * var27 >> 8) + field679.field658;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field688[var25] = 0;
				}
			}
		}

		if (field684 > 0 && field685 > 0) {
			int var29 = (int) (field684 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field688[var30] += field688[var30 - var29] * field685 / 100;
			}
		}

		for (int var31 = 0; var31 < arg0; var31++) {
			if (field688[var31] < -32768) {
				field688[var31] = -32768;
			}

			if (field688[var31] > 32767) {
				field688[var31] = 32767;
			}
		}

		return field688;
	}

	@ObfuscatedName("zb.a(IBII)I")
	public final int method278(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg2 == 2) {
			return field690[arg1 & 0x7FFF] * arg0 >> 14;
		}

		if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg2 == 4) {
			return field689[arg1 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("zb.a(Lkb;Z)V")
	public final void method279(class37 arg0) {
		field673 = new class50();
		field673.method267(arg0);
		field674 = new class50();
		field674.method267(arg0);
		int var2 = arg0.method216();
		if (var2 != 0) {
			arg0.field543--;
			field675 = new class50();
			field675.method267(arg0);
			field676 = new class50();
			field676.method267(arg0);
		}

		int var3 = arg0.method216();
		if (var3 != 0) {
			arg0.field543--;
			field677 = new class50();
			field677.method267(arg0);
			field678 = new class50();
			field678.method267(arg0);
		}

		int var4 = arg0.method216();
		if (var4 != 0) {
			arg0.field543--;
			field679 = new class50();
			field679.method267(arg0);
			field680 = new class50();
			field680.method267(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method230();
			if (var6 == 0) {
				break;
			}

			field681[var5] = var6;
			field682[var5] = arg0.method229();
			field683[var5] = arg0.method230();
		}

		field684 = arg0.method230();
		field685 = arg0.method230();
		field686 = arg0.method218();
		field687 = arg0.method218();
	}
}
