package deob;

@ObfuscatedName("zb")
public class class52 {

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
	public class50 field681;

	@ObfuscatedName("zb.k")
	public int[] field682 = new int[5];

	@ObfuscatedName("zb.l")
	public int[] field683 = new int[5];

	@ObfuscatedName("zb.m")
	public int[] field684 = new int[5];

	@ObfuscatedName("zb.n")
	public int field685;

	@ObfuscatedName("zb.o")
	public int field686 = 100;

	@ObfuscatedName("zb.p")
	public int field687 = 500;

	@ObfuscatedName("zb.q")
	public int field688;

	@ObfuscatedName("zb.r")
	public static int[] field689;

	@ObfuscatedName("zb.s")
	public static int[] field690;

	@ObfuscatedName("zb.t")
	public static int[] field691;

	@ObfuscatedName("zb.u")
	public static int[] field692 = new int[5];

	@ObfuscatedName("zb.v")
	public static int[] field693 = new int[5];

	@ObfuscatedName("zb.w")
	public static int[] field694 = new int[5];

	@ObfuscatedName("zb.x")
	public static int[] field695 = new int[5];

	@ObfuscatedName("zb.y")
	public static int[] field696 = new int[5];

	@ObfuscatedName("zb.a()V")
	public static final void method269() {
		field690 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field690[var0] = 1;
			} else {
				field690[var0] = -1;
			}
		}

		field691 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field691[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field689 = new int[220500];
	}

	@ObfuscatedName("zb.a(II)[I")
	public final int[] method270(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field689[var3] = 0;
		}

		if (arg1 < 10) {
			return field689;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field674.method261();
		field675.method261();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field676 != null) {
			field676.method261();
			field677.method261();
			var6 = (int) ((field676.field660 - field676.field659) * 32.768D / var4);
			var7 = (int) (field676.field659 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field678 != null) {
			field678.method261();
			field679.method261();
			var9 = (int) ((field678.field660 - field678.field659) * 32.768D / var4);
			var10 = (int) (field678.field659 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field682[var12] != 0) {
				field692[var12] = 0;
				field693[var12] = (int) (field684[var12] * var4);
				field694[var12] = (field682[var12] << 14) / 100;
				field695[var12] = (int) ((field674.field660 - field674.field659) * 32.768D * Math.pow(1.0057929410678534D, field683[var12]) / var4);
				field696[var12] = (int) (field674.field659 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field674.method262(arg0);
			int var15 = field675.method262(arg0);

			if (field676 != null) {
				int var16 = field676.method262(arg0);
				int var17 = field677.method262(arg0);
				var14 += method271(var17, var8, field676.field661) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field678 != null) {
				int var18 = field678.method262(arg0);
				int var19 = field679.method262(arg0);
				var15 = var15 * ((method271(var19, var11, field678.field661) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field682[var20] != 0) {
					int var21 = field693[var20] + var13;
					if (var21 < arg0) {
						field689[var21] += method271(field694[var20] * var15 >> 15, field692[var20], field674.field661);
						field692[var20] += (field695[var20] * var14 >> 16) + field696[var20];
					}
				}
			}
		}

		if (field680 != null) {
			field680.method261();
			field681.method261();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field680.method262(arg0);
				int var27 = field681.method262(arg0);
				int var28;
				if (var24) {
					var28 = ((field680.field660 - field680.field659) * var26 >> 8) + field680.field659;
				} else {
					var28 = ((field680.field660 - field680.field659) * var27 >> 8) + field680.field659;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field689[var25] = 0;
				}
			}
		}

		if (field685 > 0 && field686 > 0) {
			int var29 = (int) (field685 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field689[var30] += field689[var30 - var29] * field686 / 100;
			}
		}

		for (int var31 = 0; var31 < arg0; var31++) {
			if (field689[var31] < -32768) {
				field689[var31] = -32768;
			}

			if (field689[var31] > 32767) {
				field689[var31] = 32767;
			}
		}

		return field689;
	}

	@ObfuscatedName("zb.a(IIII)I")
	public final int method271(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg2 == 2) {
			return field691[arg1 & 0x7FFF] * arg0 >> 14;
		}

		if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg2 == 4) {
			return field690[arg1 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("zb.a(Lkb;I)V")
	public final void method272(class37 arg0) {
		field674 = new class50();
		field674.method260(arg0);
		field675 = new class50();
		field675.method260(arg0);
		int var2 = arg0.method209();
		if (var2 != 0) {
			arg0.field542--;
			field676 = new class50();
			field676.method260(arg0);
			field677 = new class50();
			field677.method260(arg0);
		}

		int var3 = arg0.method209();
		if (var3 != 0) {
			arg0.field542--;
			field678 = new class50();
			field678.method260(arg0);
			field679 = new class50();
			field679.method260(arg0);
		}

		int var4 = arg0.method209();
		if (var4 != 0) {
			arg0.field542--;
			field680 = new class50();
			field680.method260(arg0);
			field681 = new class50();
			field681.method260(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method223();
			if (var6 == 0) {
				break;
			}

			field682[var5] = var6;
			field683[var5] = arg0.method222();
			field684[var5] = arg0.method223();
		}

		field685 = arg0.method223();
		field686 = arg0.method223();
		field687 = arg0.method211();
		field688 = arg0.method211();
	}
}
