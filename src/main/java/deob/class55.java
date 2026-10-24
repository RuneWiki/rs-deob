package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.d")
	public static class55[] field790 = new class55[5000];

	@ObfuscatedName("cc.e")
	public static int[] field791 = new int[5000];

	@ObfuscatedName("cc.f")
	public static byte[] field792;

	@ObfuscatedName("cc.g")
	public static class38 field793;

	@ObfuscatedName("cc.h")
	public class56[] field794 = new class56[10];

	@ObfuscatedName("cc.i")
	public int field795;

	@ObfuscatedName("cc.j")
	public int field796;

	@ObfuscatedName("cc.a(Llb;Z)V")
	public static final void method318(class38 arg0) {
		field792 = new byte[441000];
		field793 = new class38(field792);
		class56.method324();

		while (true) {
			int var1 = arg0.method231();
			if (var1 == 0xFFFF) {
				return;
			}

			field790[var1] = new class55();
			field790[var1].method320(arg0);
			field791[var1] = field790[var1].method321();
		}
	}

	@ObfuscatedName("cc.a(BII)Llb;")
	public static final class38 method319(int arg0, int arg1) {
		if (field790[arg1] != null) {
			class55 var2 = field790[arg1];
			return var2.method322(arg0);
		}

		return null;
	}

	@ObfuscatedName("cc.b(Llb;Z)V")
	public final void method320(class38 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method229();
			if (var3 != 0) {
				arg0.field622--;
				field794[var2] = new class56();
				field794[var2].method327(arg0);
			}
		}

		field795 = arg0.method231();
		field796 = arg0.method231();
	}

	@ObfuscatedName("cc.a(I)I")
	public final int method321() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field794[var2] != null && field794[var2].field813 / 20 < var1) {
				var1 = field794[var2].field813 / 20;
			}
		}

		if (field795 < field796 && field795 / 20 < var1) {
			var1 = field795 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field794[var3] != null) {
					field794[var3].field813 -= var1 * 20;
				}
			}

			if (field795 < field796) {
				field795 -= var1 * 20;
				field796 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("cc.a(IZ)Llb;")
	public final class38 method322(int arg0) {
		int var2 = method323(arg0);
		field793.field622 = 0;
		field793.method223(0x52494646);
		field793.method224(var2 + 36);
		field793.method223(0x57415645);
		field793.method223(0x666D7420);
		field793.method224(16);
		field793.method221(1);
		field793.method221(1);
		field793.method224(22050);
		field793.method224(22050);
		field793.method221(1);
		field793.method221(8);
		field793.method223(0x64617461);
		field793.method224(var2);
		field793.field622 += var2;
		return field793;
	}

	@ObfuscatedName("cc.b(I)I")
	public final int method323(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field794[var3] != null && field794[var3].field813 + field794[var3].field812 > var2) {
				var2 = field794[var3].field813 + field794[var3].field812;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field795 * 22050 / 1000;
		int var6 = field796 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field792[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field794[var9] != null) {
				int var10 = field794[var9].field812 * 22050 / 1000;
				int var11 = field794[var9].field813 * 22050 / 1000;
				int[] var12 = field794[var9].method325(var10, field794[var9].field812);
				for (int var13 = 0; var13 < var10; var13++) {
					field792[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field792[var14 + var15] = field792[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field792[var17 + var18] = field792[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
