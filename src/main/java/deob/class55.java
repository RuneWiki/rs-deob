package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.c")
	public static class55[] field782 = new class55[1000];

	@ObfuscatedName("cc.d")
	public static int[] field783 = new int[1000];

	@ObfuscatedName("cc.e")
	public static byte[] field784;

	@ObfuscatedName("cc.f")
	public static class39 field785;

	@ObfuscatedName("cc.g")
	public class56[] field786 = new class56[10];

	@ObfuscatedName("cc.h")
	public int field787;

	@ObfuscatedName("cc.i")
	public int field788;

	@ObfuscatedName("cc.a(ZLmb;)V")
	public static final void method322(class39 arg0) {
		field784 = new byte[441000];
		field785 = new class39(field784);
		class56.method328();

		while (true) {
			int var1 = arg0.method241();
			if (var1 == 0xFFFF) {
				return;
			}

			field782[var1] = new class55();
			field782[var1].method324(arg0);
			field783[var1] = field782[var1].method325();
		}
	}

	@ObfuscatedName("cc.a(III)Lmb;")
	public static final class39 method323(int arg0, int arg1) {
		if (field782[arg1] != null) {
			class55 var2 = field782[arg1];
			return var2.method326(arg0);
		}

		return null;
	}

	@ObfuscatedName("cc.a(ILmb;)V")
	public final void method324(class39 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method239();
			if (var3 != 0) {
				arg0.field624--;
				field786[var2] = new class56();
				field786[var2].method331(arg0);
			}
		}

		field787 = arg0.method241();
		field788 = arg0.method241();
	}

	@ObfuscatedName("cc.a(I)I")
	public final int method325() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field786[var2] != null && field786[var2].field803 / 20 < var1) {
				var1 = field786[var2].field803 / 20;
			}
		}

		if (field787 < field788 && field787 / 20 < var1) {
			var1 = field787 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field786[var3] != null) {
					field786[var3].field803 -= var1 * 20;
				}
			}

			if (field787 < field788) {
				field787 -= var1 * 20;
				field788 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("cc.a(II)Lmb;")
	public final class39 method326(int arg0) {
		int var2 = method327(arg0);
		field785.field624 = 0;
		field785.method233(0x52494646);
		field785.method234(var2 + 36);
		field785.method233(0x57415645);
		field785.method233(0x666D7420);
		field785.method234(16);
		field785.method231(1);
		field785.method231(1);
		field785.method234(22050);
		field785.method234(22050);
		field785.method231(1);
		field785.method231(8);
		field785.method233(0x64617461);
		field785.method234(var2);
		field785.field624 += var2;
		return field785;
	}

	@ObfuscatedName("cc.b(I)I")
	public final int method327(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field786[var3] != null && field786[var3].field803 + field786[var3].field802 > var2) {
				var2 = field786[var3].field803 + field786[var3].field802;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field787 * 22050 / 1000;
		int var6 = field788 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field784[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field786[var9] != null) {
				int var10 = field786[var9].field802 * 22050 / 1000;
				int var11 = field786[var9].field803 * 22050 / 1000;
				int[] var12 = field786[var9].method329(var10, field786[var9].field802);
				for (int var13 = 0; var13 < var10; var13++) {
					field784[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field784[var14 + var15] = field784[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field784[var17 + var18] = field784[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
