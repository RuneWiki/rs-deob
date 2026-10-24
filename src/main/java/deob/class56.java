package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.b")
	public class54 field786;

	@ObfuscatedName("dc.c")
	public class54 field787;

	@ObfuscatedName("dc.d")
	public class54 field788;

	@ObfuscatedName("dc.e")
	public class54 field789;

	@ObfuscatedName("dc.f")
	public class54 field790;

	@ObfuscatedName("dc.g")
	public class54 field791;

	@ObfuscatedName("dc.h")
	public class54 field792;

	@ObfuscatedName("dc.i")
	public class54 field793;

	@ObfuscatedName("dc.j")
	public int[] field794 = new int[5];

	@ObfuscatedName("dc.k")
	public int[] field795 = new int[5];

	@ObfuscatedName("dc.l")
	public int[] field796 = new int[5];

	@ObfuscatedName("dc.m")
	public int field797;

	@ObfuscatedName("dc.n")
	public int field798 = 100;

	@ObfuscatedName("dc.o")
	public int field799 = 500;

	@ObfuscatedName("dc.p")
	public int field800;

	@ObfuscatedName("dc.q")
	public static int[] field801;

	@ObfuscatedName("dc.r")
	public static int[] field802;

	@ObfuscatedName("dc.s")
	public static int[] field803;

	@ObfuscatedName("dc.t")
	public static int[] field804 = new int[5];

	@ObfuscatedName("dc.u")
	public static int[] field805 = new int[5];

	@ObfuscatedName("dc.v")
	public static int[] field806 = new int[5];

	@ObfuscatedName("dc.w")
	public static int[] field807 = new int[5];

	@ObfuscatedName("dc.x")
	public static int[] field808 = new int[5];

	@ObfuscatedName("dc.a()V")
	public static final void method327() {
		field802 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field802[var0] = 1;
			} else {
				field802[var0] = -1;
			}
		}

		field803 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field803[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field801 = new int[220500];
	}

	@ObfuscatedName("dc.a(II)[I")
	public final int[] method328(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field801[var3] = 0;
		}

		if (arg1 < 10) {
			return field801;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field786.method319();
		field787.method319();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field788 != null) {
			field788.method319();
			field789.method319();
			var6 = (int) ((field788.field772 - field788.field771) * 32.768D / var4);
			var7 = (int) (field788.field771 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field790 != null) {
			field790.method319();
			field791.method319();
			var9 = (int) ((field790.field772 - field790.field771) * 32.768D / var4);
			var10 = (int) (field790.field771 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field794[var12] != 0) {
				field804[var12] = 0;
				field805[var12] = (int) (field796[var12] * var4);
				field806[var12] = (field794[var12] << 14) / 100;
				field807[var12] = (int) ((field786.field772 - field786.field771) * 32.768D * Math.pow(1.0057929410678534D, field795[var12]) / var4);
				field808[var12] = (int) (field786.field771 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field786.method320(arg0);
			int var15 = field787.method320(arg0);

			if (field788 != null) {
				int var16 = field788.method320(arg0);
				int var17 = field789.method320(arg0);
				var14 += method329(field788.field773, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field790 != null) {
				int var18 = field790.method320(arg0);
				int var19 = field791.method320(arg0);
				var15 = var15 * ((method329(field790.field773, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field794[var20] != 0) {
					int var21 = field805[var20] + var13;
					if (var21 < arg0) {
						field801[var21] += method329(field786.field773, field806[var20] * var15 >> 15, field804[var20]);
						field804[var20] += (field807[var20] * var14 >> 16) + field808[var20];
					}
				}
			}
		}

		if (field792 != null) {
			field792.method319();
			field793.method319();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field792.method320(arg0);
				int var27 = field793.method320(arg0);
				int var28;
				if (var24) {
					var28 = ((field792.field772 - field792.field771) * var26 >> 8) + field792.field771;
				} else {
					var28 = ((field792.field772 - field792.field771) * var27 >> 8) + field792.field771;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field801[var25] = 0;
				}
			}
		}

		if (field797 > 0 && field798 > 0) {
			int var29 = (int) (field797 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field801[var30] += field801[var30 - var29] * field798 / 100;
			}
		}

		for (int var31 = 0; var31 < arg0; var31++) {
			if (field801[var31] < -32768) {
				field801[var31] = -32768;
			}

			if (field801[var31] > 32767) {
				field801[var31] = 32767;
			}
		}

		return field801;
	}

	@ObfuscatedName("dc.a(IBII)I")
	public final int method329(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field803[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field802[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(Lmb;I)V")
	public final void method330(class39 arg0) {
		field786 = new class54();
		field786.method318(arg0);
		field787 = new class54();
		field787.method318(arg0);
		int var2 = arg0.method238();
		if (var2 != 0) {
			arg0.field621--;
			field788 = new class54();
			field788.method318(arg0);
			field789 = new class54();
			field789.method318(arg0);
		}

		int var3 = arg0.method238();
		if (var3 != 0) {
			arg0.field621--;
			field790 = new class54();
			field790.method318(arg0);
			field791 = new class54();
			field791.method318(arg0);
		}

		int var4 = arg0.method238();
		if (var4 != 0) {
			arg0.field621--;
			field792 = new class54();
			field792.method318(arg0);
			field793 = new class54();
			field793.method318(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method252();
			if (var6 == 0) {
				break;
			}

			field794[var5] = var6;
			field795[var5] = arg0.method251();
			field796[var5] = arg0.method252();
		}

		field797 = arg0.method252();
		field798 = arg0.method252();
		field799 = arg0.method240();
		field800 = arg0.method240();
	}
}
