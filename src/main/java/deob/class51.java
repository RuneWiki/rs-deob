package deob;

@ObfuscatedName("yb")
public class class51 {

	@ObfuscatedName("yb.h")
	public static class51[] field663 = new class51[1000];

	@ObfuscatedName("yb.i")
	public static int[] field664 = new int[1000];

	@ObfuscatedName("yb.j")
	public static byte[] field665;

	@ObfuscatedName("yb.k")
	public static class37 field666;

	@ObfuscatedName("yb.l")
	public class52[] field667 = new class52[10];

	@ObfuscatedName("yb.m")
	public int field668;

	@ObfuscatedName("yb.n")
	public int field669;

	@ObfuscatedName("yb.a(ILkb;)V")
	public static final void method263(class37 arg0) {
		field665 = new byte[441000];
		field666 = new class37(field665);
		class52.method269();

		while (true) {
			int var1 = arg0.method211();
			if (var1 == 0xFFFF) {
				return;
			}

			field663[var1] = new class51();
			field663[var1].method265(arg0);
			field664[var1] = field663[var1].method266();
		}
	}

	@ObfuscatedName("yb.a(IBI)Lkb;")
	public static final class37 method264(int arg0, int arg1) {
		if (field663[arg0] != null) {
			class51 var2 = field663[arg0];
			return var2.method267(arg1);
		}

		return null;
	}

	@ObfuscatedName("yb.a(BLkb;)V")
	public final void method265(class37 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method209();
			if (var3 != 0) {
				arg0.field540--;
				field667[var2] = new class52();
				field667[var2].method272(arg0);
			}
		}

		field668 = arg0.method211();
		field669 = arg0.method211();
	}

	@ObfuscatedName("yb.a(I)I")
	public final int method266() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field667[var2] != null && field667[var2].field684 / 20 < var1) {
				var1 = field667[var2].field684 / 20;
			}
		}

		if (field668 < field669 && field668 / 20 < var1) {
			var1 = field668 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field667[var3] != null) {
					field667[var3].field684 -= var1 * 20;
				}
			}

			if (field668 < field669) {
				field668 -= var1 * 20;
				field669 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("yb.a(II)Lkb;")
	public final class37 method267(int arg0) {
		int var2 = method268(arg0);
		field666.field540 = 0;
		field666.method203(0x52494646);
		field666.method204(var2 + 36);
		field666.method203(0x57415645);
		field666.method203(0x666D7420);
		field666.method204(16);
		field666.method201(1);
		field666.method201(1);
		field666.method204(22050);
		field666.method204(22050);
		field666.method201(1);
		field666.method201(8);
		field666.method203(0x64617461);
		field666.method204(var2);
		field666.field540 += var2;
		return field666;
	}

	@ObfuscatedName("yb.b(I)I")
	public final int method268(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field667[var3] != null && field667[var3].field684 + field667[var3].field683 > var2) {
				var2 = field667[var3].field684 + field667[var3].field683;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field668 * 22050 / 1000;
		int var6 = field669 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field665[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field667[var9] != null) {
				int var10 = field667[var9].field683 * 22050 / 1000;
				int var11 = field667[var9].field684 * 22050 / 1000;
				int[] var12 = field667[var9].method270(var10, field667[var9].field683);
				for (int var13 = 0; var13 < var10; var13++) {
					field665[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				field665[var14 + var15] = field665[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field665[var17 + var18] = field665[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
