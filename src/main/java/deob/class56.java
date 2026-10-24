package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.c")
	public static class56[] field791 = new class56[1000];

	@ObfuscatedName("dc.d")
	public static int[] field792 = new int[1000];

	@ObfuscatedName("dc.e")
	public static byte[] field793;

	@ObfuscatedName("dc.f")
	public static class39 field794;

	@ObfuscatedName("dc.g")
	public class57[] field795 = new class57[10];

	@ObfuscatedName("dc.h")
	public int field796;

	@ObfuscatedName("dc.i")
	public int field797;

	@ObfuscatedName("dc.a(ILmb;)V")
	public static final void method317(class39 arg0) {
		field793 = new byte[441000];
		field794 = new class39(field793);
		class57.method323();

		while (true) {
			int var1 = arg0.method230();
			if (var1 == 0xFFFF) {
				return;
			}

			field791[var1] = new class56();
			field791[var1].method319(arg0);
			field792[var1] = field791[var1].method320();
		}
	}

	@ObfuscatedName("dc.a(III)Lmb;")
	public static final class39 method318(int arg0, int arg1) {
		if (field791[arg0] != null) {
			class56 var2 = field791[arg0];
			return var2.method321(arg1);
		}

		return null;
	}

	@ObfuscatedName("dc.a(BLmb;)V")
	public final void method319(class39 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method228();
			if (var3 != 0) {
				arg0.field625--;
				field795[var2] = new class57();
				field795[var2].method326(arg0);
			}
		}

		field796 = arg0.method230();
		field797 = arg0.method230();
	}

	@ObfuscatedName("dc.a(Z)I")
	public final int method320() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field795[var2] != null && field795[var2].field814 / 20 < var1) {
				var1 = field795[var2].field814 / 20;
			}
		}

		if (field796 < field797 && field796 / 20 < var1) {
			var1 = field796 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field795[var3] != null) {
					field795[var3].field814 -= var1 * 20;
				}
			}

			if (field796 < field797) {
				field796 -= var1 * 20;
				field797 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("dc.a(II)Lmb;")
	public final class39 method321(int arg0) {
		int var2 = method322(arg0);
		field794.field625 = 0;
		field794.method222(0x52494646);
		field794.method223(var2 + 36);
		field794.method222(0x57415645);
		field794.method222(0x666D7420);
		field794.method223(16);
		field794.method220(1);
		field794.method220(1);
		field794.method223(22050);
		field794.method223(22050);
		field794.method220(1);
		field794.method220(8);
		field794.method222(0x64617461);
		field794.method223(var2);
		field794.field625 += var2;
		return field794;
	}

	@ObfuscatedName("dc.a(I)I")
	public final int method322(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field795[var3] != null && field795[var3].field814 + field795[var3].field813 > var2) {
				var2 = field795[var3].field814 + field795[var3].field813;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field796 * 22050 / 1000;
		int var6 = field797 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field793[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field795[var9] != null) {
				int var10 = field795[var9].field813 * 22050 / 1000;
				int var11 = field795[var9].field814 * 22050 / 1000;
				int[] var12 = field795[var9].method324(var10, field795[var9].field813);
				for (int var13 = 0; var13 < var10; var13++) {
					field793[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field793[var14 + var15] = field793[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field793[var17 + var18] = field793[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
