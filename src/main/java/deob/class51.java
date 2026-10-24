package deob;

@ObfuscatedName("yb")
public class class51 {

	@ObfuscatedName("yb.e")
	public static class51[] field662 = new class51[1000];

	@ObfuscatedName("yb.f")
	public static int[] field663 = new int[1000];

	@ObfuscatedName("yb.g")
	public static byte[] field664;

	@ObfuscatedName("yb.h")
	public static class37 field665;

	@ObfuscatedName("yb.i")
	public class52[] field666 = new class52[10];

	@ObfuscatedName("yb.j")
	public int field667;

	@ObfuscatedName("yb.k")
	public int field668;

	@ObfuscatedName("yb.a(ILkb;)V")
	public static final void method262(class37 arg0) {
		field664 = new byte[441000];
		field665 = new class37(field664);
		class52.method268();

		while (true) {
			int var1 = arg0.method210();
			if (var1 == 0xFFFF) {
				return;
			}

			field662[var1] = new class51();
			field662[var1].method264(arg0);
			field663[var1] = field662[var1].method265();
		}
	}

	@ObfuscatedName("yb.a(III)Lkb;")
	public static final class37 method263(int arg0, int arg1) {
		if (field662[arg0] != null) {
			class51 var2 = field662[arg0];
			return var2.method266(arg1);
		}

		return null;
	}

	@ObfuscatedName("yb.a(BLkb;)V")
	public final void method264(class37 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method208();
			if (var3 != 0) {
				arg0.field540--;
				field666[var2] = new class52();
				field666[var2].method271(arg0);
			}
		}

		field667 = arg0.method210();
		field668 = arg0.method210();
	}

	@ObfuscatedName("yb.a(Z)I")
	public final int method265() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field666[var2] != null && field666[var2].field683 / 20 < var1) {
				var1 = field666[var2].field683 / 20;
			}
		}

		if (field667 < field668 && field667 / 20 < var1) {
			var1 = field667 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field666[var3] != null) {
					field666[var3].field683 -= var1 * 20;
				}
			}

			if (field667 < field668) {
				field667 -= var1 * 20;
				field668 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("yb.a(IB)Lkb;")
	public final class37 method266(int arg0) {
		int var2 = method267(arg0);
		field665.field540 = 0;
		field665.method202(0x52494646);
		field665.method203(var2 + 36);
		field665.method202(0x57415645);
		field665.method202(0x666D7420);
		field665.method203(16);
		field665.method200(1);
		field665.method200(1);
		field665.method203(22050);
		field665.method203(22050);
		field665.method200(1);
		field665.method200(8);
		field665.method202(0x64617461);
		field665.method203(var2);
		field665.field540 += var2;
		return field665;
	}

	@ObfuscatedName("yb.a(I)I")
	public final int method267(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field666[var3] != null && field666[var3].field683 + field666[var3].field682 > var2) {
				var2 = field666[var3].field683 + field666[var3].field682;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field667 * 22050 / 1000;
		int var6 = field668 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field664[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field666[var9] != null) {
				int var10 = field666[var9].field682 * 22050 / 1000;
				int var11 = field666[var9].field683 * 22050 / 1000;
				int[] var12 = field666[var9].method269(var10, field666[var9].field682);
				for (int var13 = 0; var13 < var10; var13++) {
					field664[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field664[var14 + var15] = field664[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field664[var17 + var18] = field664[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
