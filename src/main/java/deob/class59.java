package deob;

@ObfuscatedName("gc")
public class class59 {

	@ObfuscatedName("gc.b")
	public static int field827;

	@ObfuscatedName("gc.c")
	public static class59[] field828;

	@ObfuscatedName("gc.d")
	public int field829 = -1;

	@ObfuscatedName("gc.e")
	public int[] field830;

	@ObfuscatedName("gc.f")
	public int[] field831 = new int[6];

	@ObfuscatedName("gc.g")
	public int[] field832 = new int[6];

	@ObfuscatedName("gc.h")
	public int[] field833 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("gc.i")
	public boolean field834 = false;

	@ObfuscatedName("gc.a(ZLub;)V")
	public static void method318(class47 arg0) {
		class37 var1 = new class37(arg0.method257(null, "idk.dat"));
		field827 = var1.method218();
		if (field828 == null) {
			field828 = new class59[field827];
		}

		for (int var2 = 0; var2 < field827; var2++) {
			if (field828[var2] == null) {
				field828[var2] = new class59();
			}

			field828[var2].method319(var1);
		}
	}

	@ObfuscatedName("gc.a(Lkb;Z)V")
	public void method319(class37 arg0) {
		while (true) {
			int var2 = arg0.method216();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field829 = arg0.method216();
			} else if (var2 == 2) {
				int var3 = arg0.method216();
				field830 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field830[var4] = arg0.method218();
				}
			} else if (var2 == 3) {
				field834 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field831[var2 - 40] = arg0.method218();
			} else if (var2 >= 50 && var2 < 60) {
				field832[var2 - 50] = arg0.method218();
			} else if (var2 >= 60 && var2 < 70) {
				field833[var2 - 60] = arg0.method218();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("gc.a()Leb;")
	public class31 method320() {
		if (field830 == null) {
			return null;
		}

		class31[] var1 = new class31[field830.length];
		for (int var2 = 0; var2 < field830.length; var2++) {
			var1[var2] = new class31(field830[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field831[var4] != 0; var4++) {
			var3.method134(field831[var4], field832[var4]);
		}

		return var3;
	}

	@ObfuscatedName("gc.a(B)Leb;")
	public class31 method321() {
		class31[] var1 = new class31[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field833[var3] != -1) {
				var1[var2++] = new class31(field833[var3]);
			}
		}

		class31 var4 = new class31(var1, var2);
		for (int var5 = 0; var5 < 6 && field831[var5] != 0; var5++) {
			var4.method134(field831[var5], field832[var5]);
		}

		return var4;
	}
}
