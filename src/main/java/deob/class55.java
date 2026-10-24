package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.c")
	public static class55[] field781 = new class55[1000];

	@ObfuscatedName("cc.d")
	public static int[] field782 = new int[1000];

	@ObfuscatedName("cc.e")
	public static byte[] field783;

	@ObfuscatedName("cc.f")
	public static class39 field784;

	@ObfuscatedName("cc.g")
	public class56[] field785 = new class56[10];

	@ObfuscatedName("cc.h")
	public int field786;

	@ObfuscatedName("cc.i")
	public int field787;

	@ObfuscatedName("cc.a(ILmb;)V")
	public static final void method321(class39 arg0) {
		field783 = new byte[441000];
		field784 = new class39(field783);
		class56.method327();

		while (true) {
			int var1 = arg0.method240();
			if (var1 == 0xFFFF) {
				return;
			}

			field781[var1] = new class55();
			field781[var1].method323(arg0);
			field782[var1] = field781[var1].method324();
		}
	}

	@ObfuscatedName("cc.a(IIZ)Lmb;")
	public static final class39 method322(int arg0, int arg1) {
		if (field781[arg0] != null) {
			class55 var2 = field781[arg0];
			return var2.method325(arg1);
		}

		return null;
	}

	@ObfuscatedName("cc.a(ZLmb;)V")
	public final void method323(class39 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method238();
			if (var3 != 0) {
				arg0.field623--;
				field785[var2] = new class56();
				field785[var2].method330(arg0);
			}
		}

		field786 = arg0.method240();
		field787 = arg0.method240();
	}

	@ObfuscatedName("cc.a(Z)I")
	public final int method324() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field785[var2] != null && field785[var2].field802 / 20 < var1) {
				var1 = field785[var2].field802 / 20;
			}
		}

		if (field786 < field787 && field786 / 20 < var1) {
			var1 = field786 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field785[var3] != null) {
					field785[var3].field802 -= var1 * 20;
				}
			}

			if (field786 < field787) {
				field786 -= var1 * 20;
				field787 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("cc.a(II)Lmb;")
	public final class39 method325(int arg0) {
		int var2 = method326(arg0);
		field784.field623 = 0;
		field784.method232(0x52494646);
		field784.method233(var2 + 36);
		field784.method232(0x57415645);
		field784.method232(0x666D7420);
		field784.method233(16);
		field784.method230(1);
		field784.method230(1);
		field784.method233(22050);
		field784.method233(22050);
		field784.method230(1);
		field784.method230(8);
		field784.method232(0x64617461);
		field784.method233(var2);
		field784.field623 += var2;
		return field784;
	}

	@ObfuscatedName("cc.a(I)I")
	public final int method326(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field785[var3] != null && field785[var3].field802 + field785[var3].field801 > var2) {
				var2 = field785[var3].field802 + field785[var3].field801;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field786 * 22050 / 1000;
		int var6 = field787 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field783[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field785[var9] != null) {
				int var10 = field785[var9].field801 * 22050 / 1000;
				int var11 = field785[var9].field802 * 22050 / 1000;
				int[] var12 = field785[var9].method328(var10, field785[var9].field801);
				for (int var13 = 0; var13 < var10; var13++) {
					field783[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field783[var14 + var15] = field783[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field783[var17 + var18] = field783[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
