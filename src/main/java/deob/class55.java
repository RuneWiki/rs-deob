package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.c")
	public static int field753;

	@ObfuscatedName("cc.d")
	public static class55[] field754;

	@ObfuscatedName("cc.e")
	public int field755 = -1;

	@ObfuscatedName("cc.f")
	public int[] field756;

	@ObfuscatedName("cc.g")
	public int[] field757 = new int[6];

	@ObfuscatedName("cc.h")
	public int[] field758 = new int[6];

	@ObfuscatedName("cc.i")
	public int[] field759 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("cc.a(Ltb;I)V")
	public static void method271(class46 arg0) {
		class36 var1 = new class36(arg0.method225(null, "idk.dat"));
		field753 = var1.method187();
		if (field754 == null) {
			field754 = new class55[field753];
		}

		for (int var2 = 0; var2 < field753; var2++) {
			if (field754[var2] == null) {
				field754[var2] = new class55();
			}

			field754[var2].method272(var1);
		}
	}

	@ObfuscatedName("cc.a(BLjb;)V")
	public void method272(class36 arg0) {
		while (true) {
			int var2 = arg0.method185();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field755 = arg0.method185();
			} else if (var2 == 2) {
				int var3 = arg0.method185();
				field756 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field756[var4] = arg0.method187();
				}
			} else if (var2 >= 40 && var2 < 50) {
				field757[var2 - 40] = arg0.method187();
			} else if (var2 >= 50 && var2 < 60) {
				field758[var2 - 50] = arg0.method187();
			} else if (var2 >= 60 && var2 < 70) {
				field759[var2 - 60] = arg0.method187();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("cc.a()Ldb;")
	public class30 method273() {
		if (field756 == null) {
			return null;
		}

		class30[] var1 = new class30[field756.length];
		for (int var2 = 0; var2 < field756.length; var2++) {
			var1[var2] = new class30(field756[var2]);
		}

		class30 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class30(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field757[var4] != 0; var4++) {
			var3.method115(field757[var4], field758[var4]);
		}

		return var3;
	}

	@ObfuscatedName("cc.a(I)Ldb;")
	public class30 method274() {
		class30[] var1 = new class30[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field759[var3] != -1) {
				var1[var2++] = new class30(field759[var3]);
			}
		}

		class30 var4 = new class30(var2, var1);
		for (int var5 = 0; var5 < 6 && field757[var5] != 0; var5++) {
			var4.method115(field757[var5], field758[var5]);
		}

		return var4;
	}
}
