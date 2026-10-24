package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.a")
	public class54 field774;

	@ObfuscatedName("dc.b")
	public class54 field775;

	@ObfuscatedName("dc.c")
	public class54 field776;

	@ObfuscatedName("dc.d")
	public class54 field777;

	@ObfuscatedName("dc.e")
	public class54 field778;

	@ObfuscatedName("dc.f")
	public class54 field779;

	@ObfuscatedName("dc.g")
	public class54 field780;

	@ObfuscatedName("dc.h")
	public class54 field781;

	@ObfuscatedName("dc.i")
	public int[] field782 = new int[5];

	@ObfuscatedName("dc.j")
	public int[] field783 = new int[5];

	@ObfuscatedName("dc.k")
	public int[] field784 = new int[5];

	@ObfuscatedName("dc.l")
	public int field785;

	@ObfuscatedName("dc.m")
	public int field786 = 100;

	@ObfuscatedName("dc.n")
	public int field787 = 500;

	@ObfuscatedName("dc.o")
	public int field788;

	@ObfuscatedName("dc.p")
	public static int[] field789;

	@ObfuscatedName("dc.q")
	public static int[] field790;

	@ObfuscatedName("dc.r")
	public static int[] field791;

	@ObfuscatedName("dc.s")
	public static int[] field792 = new int[5];

	@ObfuscatedName("dc.t")
	public static int[] field793 = new int[5];

	@ObfuscatedName("dc.u")
	public static int[] field794 = new int[5];

	@ObfuscatedName("dc.v")
	public static int[] field795 = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] field796 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method318() {
		field790 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field790[var0] = 1;
			} else {
				field790[var0] = -1;
			}
		}

		field791 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field791[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field789 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method319(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field789[var3] = 0;
		}

		if (arg1 < 10) {
			return field789;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field774.method310();
		field775.method310();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field776 != null) {
			field776.method310();
			field777.method310();
			var6 = (int) ((field776.field760 - field776.field759) * 32.768D / var4);
			var7 = (int) (field776.field759 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field778 != null) {
			field778.method310();
			field779.method310();
			var9 = (int) ((field778.field760 - field778.field759) * 32.768D / var4);
			var10 = (int) (field778.field759 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field782[var12] != 0) {
				field792[var12] = 0;
				field793[var12] = (int) (field784[var12] * var4);
				field794[var12] = (field782[var12] << 14) / 100;
				field795[var12] = (int) ((field774.field760 - field774.field759) * 32.768D * Math.pow(1.0057929410678534D, field783[var12]) / var4);
				field796[var12] = (int) (field774.field759 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field774.method311(arg0);
			int var15 = field775.method311(arg0);

			if (field776 != null) {
				int var16 = field776.method311(arg0);
				int var17 = field777.method311(arg0);
				var14 += method320(var8, var17, field776.field761) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field778 != null) {
				int var18 = field778.method311(arg0);
				int var19 = field779.method311(arg0);
				var15 = var15 * ((method320(var11, var19, field778.field761) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field782[var20] != 0) {
					int var21 = field793[var20] + var13;
					if (var21 < arg0) {
						field789[var21] += method320(field792[var20], field794[var20] * var15 >> 15, field774.field761);
						field792[var20] += (field795[var20] * var14 >> 16) + field796[var20];
					}
				}
			}
		}

		if (field780 != null) {
			field780.method310();
			field781.method310();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field780.method311(arg0);
				int var27 = field781.method311(arg0);
				int var28;
				if (var24) {
					var28 = ((field780.field760 - field780.field759) * var26 >> 8) + field780.field759;
				} else {
					var28 = ((field780.field760 - field780.field759) * var27 >> 8) + field780.field759;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field789[var25] = 0;
				}
			}
		}

		if (field785 > 0 && field786 > 0) {
			int var29 = (int) (field785 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field789[var30] += field789[var30 - var29] * field786 / 100;
			}
		}

		for (int var31 = 0; var31 < arg0; var31++) {
			if (field789[var31] < -32768) {
				field789[var31] = -32768;
			}

			if (field789[var31] > 32767) {
				field789[var31] = 32767;
			}
		}

		return field789;
	}

	@ObfuscatedName("dc.a(IZII)I")
	public final int method320(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg2 == 2) {
			return field791[arg0 & 0x7FFF] * arg1 >> 14;
		}

		if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg2 == 4) {
			return field790[arg0 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(ILmb;)V")
	public final void method321(class39 arg0) {
		field774 = new class54();
		field774.method309(arg0);
		field775 = new class54();
		field775.method309(arg0);
		int var2 = arg0.method231();
		if (var2 != 0) {
			arg0.field611--;
			field776 = new class54();
			field776.method309(arg0);
			field777 = new class54();
			field777.method309(arg0);
		}

		int var3 = arg0.method231();
		if (var3 != 0) {
			arg0.field611--;
			field778 = new class54();
			field778.method309(arg0);
			field779 = new class54();
			field779.method309(arg0);
		}

		int var4 = arg0.method231();
		if (var4 != 0) {
			arg0.field611--;
			field780 = new class54();
			field780.method309(arg0);
			field781 = new class54();
			field781.method309(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method245();
			if (var6 == 0) {
				break;
			}

			field782[var5] = var6;
			field783[var5] = arg0.method244();
			field784[var5] = arg0.method245();
		}

		field785 = arg0.method245();
		field786 = arg0.method245();
		field787 = arg0.method233();
		field788 = arg0.method233();
	}
}
