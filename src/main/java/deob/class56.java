package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.b")
	public class54 field771;

	@ObfuscatedName("dc.c")
	public class54 field772;

	@ObfuscatedName("dc.d")
	public class54 field773;

	@ObfuscatedName("dc.e")
	public class54 field774;

	@ObfuscatedName("dc.f")
	public class54 field775;

	@ObfuscatedName("dc.g")
	public class54 field776;

	@ObfuscatedName("dc.h")
	public class54 field777;

	@ObfuscatedName("dc.i")
	public class54 field778;

	@ObfuscatedName("dc.j")
	public int[] field779 = new int[5];

	@ObfuscatedName("dc.k")
	public int[] field780 = new int[5];

	@ObfuscatedName("dc.l")
	public int[] field781 = new int[5];

	@ObfuscatedName("dc.m")
	public int field782;

	@ObfuscatedName("dc.n")
	public int field783 = 100;

	@ObfuscatedName("dc.o")
	public int field784 = 500;

	@ObfuscatedName("dc.p")
	public int field785;

	@ObfuscatedName("dc.q")
	public static int[] field786;

	@ObfuscatedName("dc.r")
	public static int[] field787;

	@ObfuscatedName("dc.s")
	public static int[] field788;

	@ObfuscatedName("dc.t")
	public static int[] field789 = new int[5];

	@ObfuscatedName("dc.u")
	public static int[] field790 = new int[5];

	@ObfuscatedName("dc.v")
	public static int[] field791 = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] field792 = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] field793 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method314() {
		field787 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field787[var0] = 1;
			} else {
				field787[var0] = -1;
			}
		}

		field788 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field788[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field786 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method315(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field786[var3] = 0;
		}

		if (arg1 < 10) {
			return field786;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field771.method306();
		field772.method306();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field773 != null) {
			field773.method306();
			field774.method306();
			var6 = (int) ((field773.field757 - field773.field756) * 32.768D / var4);
			var7 = (int) (field773.field756 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field775 != null) {
			field775.method306();
			field776.method306();
			var9 = (int) ((field775.field757 - field775.field756) * 32.768D / var4);
			var10 = (int) (field775.field756 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field779[var12] != 0) {
				field789[var12] = 0;
				field790[var12] = (int) (field781[var12] * var4);
				field791[var12] = (field779[var12] << 14) / 100;
				field792[var12] = (int) ((field771.field757 - field771.field756) * 32.768D * Math.pow(1.0057929410678534D, field780[var12]) / var4);
				field793[var12] = (int) (field771.field756 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field771.method307(arg0);
			int var15 = field772.method307(arg0);

			if (field773 != null) {
				int var16 = field773.method307(arg0);
				int var17 = field774.method307(arg0);
				var14 += method316(var17, field773.field758, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field775 != null) {
				int var18 = field775.method307(arg0);
				int var19 = field776.method307(arg0);
				var15 = var15 * ((method316(var19, field775.field758, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field779[var20] != 0) {
					int var21 = field790[var20] + var13;
					if (var21 < arg0) {
						field786[var21] += method316(field791[var20] * var15 >> 15, field771.field758, field789[var20]);
						field789[var20] += (field792[var20] * var14 >> 16) + field793[var20];
					}
				}
			}
		}

		if (field777 != null) {
			field777.method306();
			field778.method306();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field777.method307(arg0);
				int var27 = field778.method307(arg0);
				int var28;
				if (var24) {
					var28 = ((field777.field757 - field777.field756) * var26 >> 8) + field777.field756;
				} else {
					var28 = ((field777.field757 - field777.field756) * var27 >> 8) + field777.field756;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field786[var25] = 0;
				}
			}
		}

		if (field782 > 0 && field783 > 0) {
			int var29 = (int) (field782 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field786[var30] += field786[var30 - var29] * field783 / 100;
			}
		}

		for (int var31 = 0; var31 < arg0; var31++) {
			if (field786[var31] < -32768) {
				field786[var31] = -32768;
			}

			if (field786[var31] > 32767) {
				field786[var31] = 32767;
			}
		}

		return field786;
	}

	@ObfuscatedName("dc.a(IIII)I")
	public final int method316(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field788[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field787[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(ZLmb;)V")
	public final void method317(class39 arg0) {
		field771 = new class54();
		field771.method305(arg0);
		field772 = new class54();
		field772.method305(arg0);
		int var2 = arg0.method231();
		if (var2 != 0) {
			arg0.field611--;
			field773 = new class54();
			field773.method305(arg0);
			field774 = new class54();
			field774.method305(arg0);
		}

		int var3 = arg0.method231();
		if (var3 != 0) {
			arg0.field611--;
			field775 = new class54();
			field775.method305(arg0);
			field776 = new class54();
			field776.method305(arg0);
		}

		int var4 = arg0.method231();
		if (var4 != 0) {
			arg0.field611--;
			field777 = new class54();
			field777.method305(arg0);
			field778 = new class54();
			field778.method305(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method245();
			if (var6 == 0) {
				break;
			}

			field779[var5] = var6;
			field780[var5] = arg0.method244();
			field781[var5] = arg0.method245();
		}

		field782 = arg0.method245();
		field783 = arg0.method245();
		field784 = arg0.method233();
		field785 = arg0.method233();
	}
}
