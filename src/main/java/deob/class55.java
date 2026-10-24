package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.e")
	public static class55[] field764 = new class55[1000];

	@ObfuscatedName("cc.f")
	public static int[] field765 = new int[1000];

	@ObfuscatedName("cc.g")
	public static byte[] field766;

	@ObfuscatedName("cc.h")
	public static class39 field767;

	@ObfuscatedName("cc.i")
	public class56[] field768 = new class56[10];

	@ObfuscatedName("cc.j")
	public int field769;

	@ObfuscatedName("cc.k")
	public int field770;

	@ObfuscatedName("cc.a(Lmb;B)V")
	public static final void method308(class39 arg0) {
		field766 = new byte[441000];
		field767 = new class39(field766);
		class56.method314();

		while (true) {
			int var1 = arg0.method233();
			if (var1 == 0xFFFF) {
				return;
			}

			field764[var1] = new class55();
			field764[var1].method310(arg0);
			field765[var1] = field764[var1].method311();
		}
	}

	@ObfuscatedName("cc.a(III)Lmb;")
	public static final class39 method309(int arg0, int arg1) {
		if (field764[arg1] != null) {
			class55 var2 = field764[arg1];
			return var2.method312(arg0);
		}

		return null;
	}

	@ObfuscatedName("cc.a(ZLmb;)V")
	public final void method310(class39 arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method231();
			if (var3 != 0) {
				arg0.field611--;
				field768[var2] = new class56();
				field768[var2].method317(arg0);
			}
		}

		field769 = arg0.method233();
		field770 = arg0.method233();
	}

	@ObfuscatedName("cc.a(B)I")
	public final int method311() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field768[var2] != null && field768[var2].field785 / 20 < var1) {
				var1 = field768[var2].field785 / 20;
			}
		}

		if (field769 < field770 && field769 / 20 < var1) {
			var1 = field769 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field768[var3] != null) {
					field768[var3].field785 -= var1 * 20;
				}
			}

			if (field769 < field770) {
				field769 -= var1 * 20;
				field770 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("cc.a(ZI)Lmb;")
	public final class39 method312(int arg0) {
		int var2 = method313(arg0);
		field767.field611 = 0;
		field767.method225(0x52494646);
		field767.method226(var2 + 36);
		field767.method225(0x57415645);
		field767.method225(0x666D7420);
		field767.method226(16);
		field767.method223(1);
		field767.method223(1);
		field767.method226(22050);
		field767.method226(22050);
		field767.method223(1);
		field767.method223(8);
		field767.method225(0x64617461);
		field767.method226(var2);
		field767.field611 += var2;
		return field767;
	}

	@ObfuscatedName("cc.a(I)I")
	public final int method313(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field768[var3] != null && field768[var3].field785 + field768[var3].field784 > var2) {
				var2 = field768[var3].field785 + field768[var3].field784;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field769 * 22050 / 1000;
		int var6 = field770 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field766[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field768[var9] != null) {
				int var10 = field768[var9].field784 * 22050 / 1000;
				int var11 = field768[var9].field785 * 22050 / 1000;
				int[] var12 = field768[var9].method315(var10, field768[var9].field784);
				for (int var13 = 0; var13 < var10; var13++) {
					field766[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field766[var14 + var15] = field766[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field766[var17 + var18] = field766[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
