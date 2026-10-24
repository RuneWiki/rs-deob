package deob;

@ObfuscatedName("zb")
public class class52 {

	@ObfuscatedName("zb.b")
	public class50 field671;

	@ObfuscatedName("zb.c")
	public class50 field672;

	@ObfuscatedName("zb.d")
	public class50 field673;

	@ObfuscatedName("zb.e")
	public class50 field674;

	@ObfuscatedName("zb.f")
	public class50 field675;

	@ObfuscatedName("zb.g")
	public class50 field676;

	@ObfuscatedName("zb.h")
	public class50 field677;

	@ObfuscatedName("zb.i")
	public class50 field678;

	@ObfuscatedName("zb.j")
	public int[] field679 = new int[5];

	@ObfuscatedName("zb.k")
	public int[] field680 = new int[5];

	@ObfuscatedName("zb.l")
	public int[] field681 = new int[5];

	@ObfuscatedName("zb.m")
	public int field682;

	@ObfuscatedName("zb.n")
	public int field683 = 100;

	@ObfuscatedName("zb.o")
	public int field684 = 500;

	@ObfuscatedName("zb.p")
	public int field685;

	@ObfuscatedName("zb.q")
	public static int[] field686;

	@ObfuscatedName("zb.r")
	public static int[] field687;

	@ObfuscatedName("zb.s")
	public static int[] field688;

	@ObfuscatedName("zb.t")
	public static int[] field689 = new int[5];

	@ObfuscatedName("zb.u")
	public static int[] field690 = new int[5];

	@ObfuscatedName("zb.v")
	public static int[] field691 = new int[5];

	@ObfuscatedName("zb.w")
	public static int[] field692 = new int[5];

	@ObfuscatedName("zb.x")
	public static int[] field693 = new int[5];

	@ObfuscatedName("zb.a()V")
	public static final void method269() {
		field687 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field687[var0] = 1;
			} else {
				field687[var0] = -1;
			}
		}

		field688 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field688[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field686 = new int[220500];
	}

	@ObfuscatedName("zb.a(II)[I")
	public final int[] method270(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field686[var3] = 0;
		}

		if (arg1 < 10) {
			return field686;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field671.method261();
		field672.method261();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field673 != null) {
			field673.method261();
			field674.method261();
			var6 = (int) ((field673.field657 - field673.field656) * 32.768D / var4);
			var7 = (int) (field673.field656 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field675 != null) {
			field675.method261();
			field676.method261();
			var9 = (int) ((field675.field657 - field675.field656) * 32.768D / var4);
			var10 = (int) (field675.field656 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field679[var12] != 0) {
				field689[var12] = 0;
				field690[var12] = (int) (field681[var12] * var4);
				field691[var12] = (field679[var12] << 14) / 100;
				field692[var12] = (int) ((field671.field657 - field671.field656) * 32.768D * Math.pow(1.0057929410678534D, field680[var12]) / var4);
				field693[var12] = (int) (field671.field656 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field671.method262(arg0);
			int var15 = field672.method262(arg0);

			if (field673 != null) {
				int var16 = field673.method262(arg0);
				int var17 = field674.method262(arg0);
				var14 += method271(var8, field673.field658, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field675 != null) {
				int var18 = field675.method262(arg0);
				int var19 = field676.method262(arg0);
				var15 = var15 * ((method271(var11, field675.field658, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field679[var20] != 0) {
					int var21 = field690[var20] + var13;
					if (var21 < arg0) {
						field686[var21] += method271(field689[var20], field671.field658, field691[var20] * var15 >> 15);
						field689[var20] += (field692[var20] * var14 >> 16) + field693[var20];
					}
				}
			}
		}

		if (field677 != null) {
			field677.method261();
			field678.method261();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field677.method262(arg0);
				int var27 = field678.method262(arg0);
				int var28;
				if (var24) {
					var28 = ((field677.field657 - field677.field656) * var26 >> 8) + field677.field656;
				} else {
					var28 = ((field677.field657 - field677.field656) * var27 >> 8) + field677.field656;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field686[var25] = 0;
				}
			}
		}

		if (field682 > 0 && field683 > 0) {
			int var29 = (int) (field682 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field686[var30] += field686[var30 - var29] * field683 / 100;
			}
		}

		for (int var31 = 0; var31 < arg0; var31++) {
			if (field686[var31] < -32768) {
				field686[var31] = -32768;
			}

			if (field686[var31] > 32767) {
				field686[var31] = 32767;
			}
		}

		return field686;
	}

	@ObfuscatedName("zb.a(ZIII)I")
	public final int method271(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field688[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field687[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("zb.a(ILkb;)V")
	public final void method272(class37 arg0) {
		field671 = new class50();
		field671.method260(arg0);
		field672 = new class50();
		field672.method260(arg0);
		int var2 = arg0.method209();
		if (var2 != 0) {
			arg0.field541--;
			field673 = new class50();
			field673.method260(arg0);
			field674 = new class50();
			field674.method260(arg0);
		}

		int var3 = arg0.method209();
		if (var3 != 0) {
			arg0.field541--;
			field675 = new class50();
			field675.method260(arg0);
			field676 = new class50();
			field676.method260(arg0);
		}

		int var4 = arg0.method209();
		if (var4 != 0) {
			arg0.field541--;
			field677 = new class50();
			field677.method260(arg0);
			field678 = new class50();
			field678.method260(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method223();
			if (var6 == 0) {
				break;
			}

			field679[var5] = var6;
			field680[var5] = arg0.method222();
			field681[var5] = arg0.method223();
		}

		field682 = arg0.method223();
		field683 = arg0.method223();
		field684 = arg0.method211();
		field685 = arg0.method211();
	}
}
