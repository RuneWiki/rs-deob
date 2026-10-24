package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.c")
	public static class55[] field767 = new class55[1000];

	@ObfuscatedName("cc.d")
	public static int[] field768 = new int[1000];

	@ObfuscatedName("cc.e")
	public static byte[] field769;

	@ObfuscatedName("cc.f")
	public static class39 field770;

	@ObfuscatedName("cc.g")
	public class56[] field771 = new class56[10];

	@ObfuscatedName("cc.h")
	public int field772;

	@ObfuscatedName("cc.i")
	public int field773;

	@ObfuscatedName("cc.a(Lmb;I)V")
	public static final void method312(class39 arg0) {
		field769 = new byte[441000];
		field770 = new class39(field769);
		class56.method318();

		while (true) {
			int var1 = arg0.method233();
			if (var1 == 0xFFFF) {
				return;
			}

			field767[var1] = new class55();
			field767[var1].method314(arg0);
			field768[var1] = field767[var1].method315();
		}
	}

	@ObfuscatedName("cc.a(III)Lmb;")
	public static final class39 method313(int arg0, int arg1) {
		if (field767[arg1] != null) {
			class55 var2 = field767[arg1];
			return var2.method316(arg0);
		}

		return null;
	}

	@ObfuscatedName("cc.a(ILmb;)V")
	public final void method314(class39 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method231();
			if (var3 != 0) {
				arg0.field611--;
				field771[var2] = new class56();
				field771[var2].method321(arg0);
			}
		}

		field772 = arg0.method233();
		field773 = arg0.method233();
	}

	@ObfuscatedName("cc.a(I)I")
	public final int method315() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field771[var2] != null && field771[var2].field788 / 20 < var1) {
				var1 = field771[var2].field788 / 20;
			}
		}

		if (field772 < field773 && field772 / 20 < var1) {
			var1 = field772 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field771[var3] != null) {
					field771[var3].field788 -= var1 * 20;
				}
			}

			if (field772 < field773) {
				field772 -= var1 * 20;
				field773 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("cc.a(BI)Lmb;")
	public final class39 method316(int arg0) {
		int var2 = method317(arg0);
		field770.field611 = 0;
		field770.method225(0x52494646);
		field770.method226(var2 + 36);
		field770.method225(0x57415645);
		field770.method225(0x666D7420);
		field770.method226(16);
		field770.method223(1);
		field770.method223(1);
		field770.method226(22050);
		field770.method226(22050);
		field770.method223(1);
		field770.method223(8);
		field770.method225(0x64617461);
		field770.method226(var2);
		field770.field611 += var2;
		return field770;
	}

	@ObfuscatedName("cc.b(I)I")
	public final int method317(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field771[var3] != null && field771[var3].field788 + field771[var3].field787 > var2) {
				var2 = field771[var3].field788 + field771[var3].field787;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field772 * 22050 / 1000;
		int var6 = field773 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field769[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field771[var9] != null) {
				int var10 = field771[var9].field787 * 22050 / 1000;
				int var11 = field771[var9].field788 * 22050 / 1000;
				int[] var12 = field771[var9].method319(var10, field771[var9].field787);
				for (int var13 = 0; var13 < var10; var13++) {
					field769[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field769[var14 + var15] = field769[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field769[var17 + var18] = field769[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
