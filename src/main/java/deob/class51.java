package deob;

@ObfuscatedName("yb")
public class class51 {

	@ObfuscatedName("yb.c")
	public static class51[] field666 = new class51[1000];

	@ObfuscatedName("yb.d")
	public static int[] field667 = new int[1000];

	@ObfuscatedName("yb.e")
	public static byte[] field668;

	@ObfuscatedName("yb.f")
	public static class37 field669;

	@ObfuscatedName("yb.g")
	public class52[] field670 = new class52[10];

	@ObfuscatedName("yb.h")
	public int field671;

	@ObfuscatedName("yb.i")
	public int field672;

	@ObfuscatedName("yb.a(ILkb;)V")
	public static final void method270(class37 arg0) {
		field668 = new byte[441000];
		field669 = new class37(field668);
		class52.method276();

		while (true) {
			int var1 = arg0.method218();
			if (var1 == 0xFFFF) {
				return;
			}

			field666[var1] = new class51();
			field666[var1].method272(arg0);
			field667[var1] = field666[var1].method273();
		}
	}

	@ObfuscatedName("yb.a(ZII)Lkb;")
	public static final class37 method271(int arg0, int arg1) {
		if (field666[arg1] != null) {
			class51 var2 = field666[arg1];
			return var2.method274(arg0);
		}

		return null;
	}

	@ObfuscatedName("yb.a(Lkb;Z)V")
	public final void method272(class37 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method216();
			if (var3 != 0) {
				arg0.field543--;
				field670[var2] = new class52();
				field670[var2].method279(arg0);
			}
		}

		field671 = arg0.method218();
		field672 = arg0.method218();
	}

	@ObfuscatedName("yb.a(I)I")
	public final int method273() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field670[var2] != null && field670[var2].field687 / 20 < var1) {
				var1 = field670[var2].field687 / 20;
			}
		}

		if (field671 < field672 && field671 / 20 < var1) {
			var1 = field671 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field670[var3] != null) {
					field670[var3].field687 -= var1 * 20;
				}
			}

			if (field671 < field672) {
				field671 -= var1 * 20;
				field672 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("yb.a(II)Lkb;")
	public final class37 method274(int arg0) {
		int var2 = method275(arg0);
		field669.field543 = 0;
		field669.method210(0x52494646);
		field669.method211(var2 + 36);
		field669.method210(0x57415645);
		field669.method210(0x666D7420);
		field669.method211(16);
		field669.method208(1);
		field669.method208(1);
		field669.method211(22050);
		field669.method211(22050);
		field669.method208(1);
		field669.method208(8);
		field669.method210(0x64617461);
		field669.method211(var2);
		field669.field543 += var2;
		return field669;
	}

	@ObfuscatedName("yb.b(I)I")
	public final int method275(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field670[var3] != null && field670[var3].field687 + field670[var3].field686 > var2) {
				var2 = field670[var3].field687 + field670[var3].field686;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field671 * 22050 / 1000;
		int var6 = field672 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field668[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field670[var9] != null) {
				int var10 = field670[var9].field686 * 22050 / 1000;
				int var11 = field670[var9].field687 * 22050 / 1000;
				int[] var12 = field670[var9].method277(var10, field670[var9].field686);
				for (int var13 = 0; var13 < var10; var13++) {
					field668[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field668[var14 + var15] = field668[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field668[var17 + var18] = field668[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
