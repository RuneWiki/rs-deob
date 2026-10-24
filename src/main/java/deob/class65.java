package deob;

@ObfuscatedName("mc")
public class class65 {

	@ObfuscatedName("mc.c")
	public static int field970;

	@ObfuscatedName("mc.d")
	public static class65[] field971;

	@ObfuscatedName("mc.e")
	public int field972 = -1;

	@ObfuscatedName("mc.f")
	public int[] field973;

	@ObfuscatedName("mc.g")
	public int[] field974 = new int[6];

	@ObfuscatedName("mc.h")
	public int[] field975 = new int[6];

	@ObfuscatedName("mc.i")
	public int[] field976 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("mc.j")
	public boolean field977 = false;

	@ObfuscatedName("mc.a(ILyb;)V")
	public static void method372(class51 arg0) {
		class39 var1 = new class39(arg0.method298("idk.dat", null));
		field970 = var1.method230();
		if (field971 == null) {
			field971 = new class65[field970];
		}

		for (int var2 = 0; var2 < field970; var2++) {
			if (field971[var2] == null) {
				field971[var2] = new class65();
			}

			field971[var2].method373(var1);
		}
	}

	@ObfuscatedName("mc.a(BLmb;)V")
	public void method373(class39 arg0) {
		while (true) {
			int var2 = arg0.method228();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field972 = arg0.method228();
			} else if (var2 == 2) {
				int var3 = arg0.method228();
				field973 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field973[var4] = arg0.method230();
				}
			} else if (var2 == 3) {
				field977 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field974[var2 - 40] = arg0.method230();
			} else if (var2 >= 50 && var2 < 60) {
				field975[var2 - 50] = arg0.method230();
			} else if (var2 >= 60 && var2 < 70) {
				field976[var2 - 60] = arg0.method230();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("mc.a(I)Z")
	public boolean method374() {
		if (field973 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field973.length; var2++) {
			if (!class31.method126(field973[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("mc.b(I)Leb;")
	public class31 method375() {
		if (field973 == null) {
			return null;
		}

		class31[] var1 = new class31[field973.length];
		for (int var2 = 0; var2 < field973.length; var2++) {
			var1[var2] = class31.method125(field973[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field974[var4] != 0; var4++) {
			var3.method139(field974[var4], field975[var4]);
		}

		return var3;
	}

	@ObfuscatedName("mc.a(B)Z")
	public boolean method376() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field976[var2] != -1 && !class31.method126(field976[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("mc.a(Z)Leb;")
	public class31 method377() {
		class31[] var1 = new class31[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field976[var3] != -1) {
				var1[var2++] = class31.method125(field976[var3]);
			}
		}

		class31 var4 = new class31(var1, var2);
		for (int var5 = 0; var5 < 6 && field974[var5] != 0; var5++) {
			var4.method139(field974[var5], field975[var5]);
		}

		return var4;
	}
}
