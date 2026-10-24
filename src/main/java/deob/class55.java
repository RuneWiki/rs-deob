package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.e")
	public static class55[] field784 = new class55[1000];

	@ObfuscatedName("cc.f")
	public static int[] field785 = new int[1000];

	@ObfuscatedName("cc.g")
	public static byte[] field786;

	@ObfuscatedName("cc.h")
	public static class38 field787;

	@ObfuscatedName("cc.i")
	public class56[] field788 = new class56[10];

	@ObfuscatedName("cc.j")
	public int field789;

	@ObfuscatedName("cc.k")
	public int field790;

	@ObfuscatedName("cc.a(Llb;I)V")
	public static final void method314(class38 arg0) {
		field786 = new byte[441000];
		field787 = new class38(field786);
		class56.method320();

		while (true) {
			int var1 = arg0.method227();
			if (var1 == 0xFFFF) {
				return;
			}

			field784[var1] = new class55();
			field784[var1].method316(arg0);
			field785[var1] = field784[var1].method317();
		}
	}

	@ObfuscatedName("cc.a(III)Llb;")
	public static final class38 method315(int arg0, int arg1) {
		if (field784[arg0] != null) {
			class55 var2 = field784[arg0];
			return var2.method318(arg1);
		}

		return null;
	}

	@ObfuscatedName("cc.a(Llb;B)V")
	public final void method316(class38 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method225();
			if (var3 != 0) {
				arg0.field617--;
				field788[var2] = new class56();
				field788[var2].method323(arg0);
			}
		}

		field789 = arg0.method227();
		field790 = arg0.method227();
	}

	@ObfuscatedName("cc.a(B)I")
	public final int method317() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field788[var2] != null && field788[var2].field807 / 20 < var1) {
				var1 = field788[var2].field807 / 20;
			}
		}

		if (field789 < field790 && field789 / 20 < var1) {
			var1 = field789 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field788[var3] != null) {
					field788[var3].field807 -= var1 * 20;
				}
			}

			if (field789 < field790) {
				field789 -= var1 * 20;
				field790 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("cc.a(II)Llb;")
	public final class38 method318(int arg0) {
		int var2 = method319(arg0);
		field787.field617 = 0;
		field787.method219(0x52494646);
		field787.method220(var2 + 36);
		field787.method219(0x57415645);
		field787.method219(0x666D7420);
		field787.method220(16);
		field787.method217(1);
		field787.method217(1);
		field787.method220(22050);
		field787.method220(22050);
		field787.method217(1);
		field787.method217(8);
		field787.method219(0x64617461);
		field787.method220(var2);
		field787.field617 += var2;
		return field787;
	}

	@ObfuscatedName("cc.a(I)I")
	public final int method319(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field788[var3] != null && field788[var3].field807 + field788[var3].field806 > var2) {
				var2 = field788[var3].field807 + field788[var3].field806;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field789 * 22050 / 1000;
		int var6 = field790 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field786[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field788[var9] != null) {
				int var10 = field788[var9].field806 * 22050 / 1000;
				int var11 = field788[var9].field807 * 22050 / 1000;
				int[] var12 = field788[var9].method321(var10, field788[var9].field806);
				for (int var13 = 0; var13 < var10; var13++) {
					field786[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field786[var14 + var15] = field786[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field786[var17 + var18] = field786[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
