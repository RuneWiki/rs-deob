package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.d")
	public static class55[] field782 = new class55[1000];

	@ObfuscatedName("cc.e")
	public static int[] field783 = new int[1000];

	@ObfuscatedName("cc.f")
	public static byte[] field784;

	@ObfuscatedName("cc.g")
	public static class38 field785;

	@ObfuscatedName("cc.h")
	public class56[] field786 = new class56[10];

	@ObfuscatedName("cc.i")
	public int field787;

	@ObfuscatedName("cc.j")
	public int field788;

	@ObfuscatedName("cc.a(ILlb;)V")
	public static final void method313(class38 arg0) {
		field784 = new byte[441000];
		field785 = new class38(field784);
		class56.method319();

		while (true) {
			int var1 = arg0.method226();
			if (var1 == 0xFFFF) {
				return;
			}

			field782[var1] = new class55();
			field782[var1].method315(arg0);
			field783[var1] = field782[var1].method316();
		}
	}

	@ObfuscatedName("cc.a(ZII)Llb;")
	public static final class38 method314(int arg0, int arg1) {
		if (field782[arg0] != null) {
			class55 var2 = field782[arg0];
			return var2.method317(arg1);
		}

		return null;
	}

	@ObfuscatedName("cc.a(Llb;I)V")
	public final void method315(class38 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method224();
			if (var3 != 0) {
				arg0.field616--;
				field786[var2] = new class56();
				field786[var2].method322(arg0);
			}
		}

		field787 = arg0.method226();
		field788 = arg0.method226();
	}

	@ObfuscatedName("cc.a(Z)I")
	public final int method316() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field786[var2] != null && field786[var2].field805 / 20 < var1) {
				var1 = field786[var2].field805 / 20;
			}
		}

		if (field787 < field788 && field787 / 20 < var1) {
			var1 = field787 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field786[var3] != null) {
					field786[var3].field805 -= var1 * 20;
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

	@ObfuscatedName("cc.a(ZI)Llb;")
	public final class38 method317(int arg0) {
		int var2 = method318(arg0);
		field785.field616 = 0;
		field785.method218(0x52494646);
		field785.method219(var2 + 36);
		field785.method218(0x57415645);
		field785.method218(0x666D7420);
		field785.method219(16);
		field785.method216(1);
		field785.method216(1);
		field785.method219(22050);
		field785.method219(22050);
		field785.method216(1);
		field785.method216(8);
		field785.method218(0x64617461);
		field785.method219(var2);
		field785.field616 += var2;
		return field785;
	}

	@ObfuscatedName("cc.a(I)I")
	public final int method318(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field786[var3] != null && field786[var3].field805 + field786[var3].field804 > var2) {
				var2 = field786[var3].field805 + field786[var3].field804;
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
				int var10 = field786[var9].field804 * 22050 / 1000;
				int var11 = field786[var9].field805 * 22050 / 1000;
				int[] var12 = field786[var9].method320(var10, field786[var9].field804);
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
