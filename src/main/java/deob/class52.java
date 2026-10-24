package deob;

@ObfuscatedName("zb")
public class class52 {

	@ObfuscatedName("zb.c")
	public class50 field669;

	@ObfuscatedName("zb.d")
	public class50 field670;

	@ObfuscatedName("zb.e")
	public class50 field671;

	@ObfuscatedName("zb.f")
	public class50 field672;

	@ObfuscatedName("zb.g")
	public class50 field673;

	@ObfuscatedName("zb.h")
	public class50 field674;

	@ObfuscatedName("zb.i")
	public class50 field675;

	@ObfuscatedName("zb.j")
	public class50 field676;

	@ObfuscatedName("zb.k")
	public int[] field677 = new int[5];

	@ObfuscatedName("zb.l")
	public int[] field678 = new int[5];

	@ObfuscatedName("zb.m")
	public int[] field679 = new int[5];

	@ObfuscatedName("zb.n")
	public int field680;

	@ObfuscatedName("zb.o")
	public int field681 = 100;

	@ObfuscatedName("zb.p")
	public int field682 = 500;

	@ObfuscatedName("zb.q")
	public int field683;

	@ObfuscatedName("zb.r")
	public static int[] field684;

	@ObfuscatedName("zb.s")
	public static int[] field685;

	@ObfuscatedName("zb.t")
	public static int[] field686;

	@ObfuscatedName("zb.u")
	public static int[] field687 = new int[5];

	@ObfuscatedName("zb.v")
	public static int[] field688 = new int[5];

	@ObfuscatedName("zb.w")
	public static int[] field689 = new int[5];

	@ObfuscatedName("zb.x")
	public static int[] field690 = new int[5];

	@ObfuscatedName("zb.y")
	public static int[] field691 = new int[5];

	@ObfuscatedName("zb.a()V")
	public static final void method268() {
		field685 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field685[var0] = 1;
			} else {
				field685[var0] = -1;
			}
		}

		field686 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field686[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field684 = new int[220500];
	}

	@ObfuscatedName("zb.a(II)[I")
	public final int[] method269(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field684[var3] = 0;
		}

		if (arg1 < 10) {
			return field684;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field669.method260();
		field670.method260();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field671 != null) {
			field671.method260();
			field672.method260();
			var6 = (int) ((field671.field655 - field671.field654) * 32.768D / var4);
			var7 = (int) (field671.field654 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field673 != null) {
			field673.method260();
			field674.method260();
			var9 = (int) ((field673.field655 - field673.field654) * 32.768D / var4);
			var10 = (int) (field673.field654 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field677[var12] != 0) {
				field687[var12] = 0;
				field688[var12] = (int) (field679[var12] * var4);
				field689[var12] = (field677[var12] << 14) / 100;
				field690[var12] = (int) ((field669.field655 - field669.field654) * 32.768D * Math.pow(1.0057929410678534D, field678[var12]) / var4);
				field691[var12] = (int) (field669.field654 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field669.method261(arg0);
			int var15 = field670.method261(arg0);

			if (field671 != null) {
				int var16 = field671.method261(arg0);
				int var17 = field672.method261(arg0);
				var14 += method270(var8, var17, field671.field656) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field673 != null) {
				int var18 = field673.method261(arg0);
				int var19 = field674.method261(arg0);
				var15 = var15 * ((method270(var11, var19, field673.field656) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field677[var20] != 0) {
					int var21 = field688[var20] + var13;
					if (var21 < arg0) {
						field684[var21] += method270(field687[var20], field689[var20] * var15 >> 15, field669.field656);
						field687[var20] += (field690[var20] * var14 >> 16) + field691[var20];
					}
				}
			}
		}

		if (field675 != null) {
			field675.method260();
			field676.method260();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field675.method261(arg0);
				int var27 = field676.method261(arg0);
				int var28;
				if (var24) {
					var28 = ((field675.field655 - field675.field654) * var26 >> 8) + field675.field654;
				} else {
					var28 = ((field675.field655 - field675.field654) * var27 >> 8) + field675.field654;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field684[var25] = 0;
				}
			}
		}

		if (field680 > 0 && field681 > 0) {
			int var29 = (int) (field680 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field684[var30] += field684[var30 - var29] * field681 / 100;
			}
		}

		for (int var31 = 0; var31 < arg0; var31++) {
			if (field684[var31] < -32768) {
				field684[var31] = -32768;
			}

			if (field684[var31] > 32767) {
				field684[var31] = 32767;
			}
		}

		return field684;
	}

	@ObfuscatedName("zb.a(BIII)I")
	public final int method270(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg2 == 2) {
			return field686[arg0 & 0x7FFF] * arg1 >> 14;
		}

		if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg2 == 4) {
			return field685[arg0 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("zb.a(BLkb;)V")
	public final void method271(class37 arg0) {
		field669 = new class50();
		field669.method259(arg0);
		field670 = new class50();
		field670.method259(arg0);
		int var2 = arg0.method208();
		if (var2 != 0) {
			arg0.field540--;
			field671 = new class50();
			field671.method259(arg0);
			field672 = new class50();
			field672.method259(arg0);
		}

		int var3 = arg0.method208();
		if (var3 != 0) {
			arg0.field540--;
			field673 = new class50();
			field673.method259(arg0);
			field674 = new class50();
			field674.method259(arg0);
		}

		int var4 = arg0.method208();
		if (var4 != 0) {
			arg0.field540--;
			field675 = new class50();
			field675.method259(arg0);
			field676 = new class50();
			field676.method259(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method222();
			if (var6 == 0) {
				break;
			}

			field677[var5] = var6;
			field678[var5] = arg0.method221();
			field679[var5] = arg0.method222();
		}

		field680 = arg0.method222();
		field681 = arg0.method222();
		field682 = arg0.method210();
		field683 = arg0.method210();
	}
}
