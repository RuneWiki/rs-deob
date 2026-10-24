package deob;

@ObfuscatedName("gc")
public class class59 {

	@ObfuscatedName("gc.d")
	public static int field821;

	@ObfuscatedName("gc.e")
	public static class59[] field822;

	@ObfuscatedName("gc.f")
	public int field823 = -1;

	@ObfuscatedName("gc.g")
	public int[] field824;

	@ObfuscatedName("gc.h")
	public int[] field825 = new int[6];

	@ObfuscatedName("gc.i")
	public int[] field826 = new int[6];

	@ObfuscatedName("gc.j")
	public int[] field827 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("gc.k")
	public boolean field828 = false;

	@ObfuscatedName("gc.a(ILub;)V")
	public static void method310(class47 arg0) {
		class37 var1 = new class37(arg0.method250("idk.dat", null));
		field821 = var1.method211();
		if (field822 == null) {
			field822 = new class59[field821];
		}

		for (int var2 = 0; var2 < field821; var2++) {
			if (field822[var2] == null) {
				field822[var2] = new class59();
			}

			field822[var2].method311(var1);
		}
	}

	@ObfuscatedName("gc.a(BLkb;)V")
	public void method311(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field823 = arg0.method209();
			} else if (var2 == 2) {
				int var3 = arg0.method209();
				field824 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field824[var4] = arg0.method211();
				}
			} else if (var2 == 3) {
				field828 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field825[var2 - 40] = arg0.method211();
			} else if (var2 >= 50 && var2 < 60) {
				field826[var2 - 50] = arg0.method211();
			} else if (var2 >= 60 && var2 < 70) {
				field827[var2 - 60] = arg0.method211();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("gc.a()Leb;")
	public class31 method312() {
		if (field824 == null) {
			return null;
		}

		class31[] var1 = new class31[field824.length];
		for (int var2 = 0; var2 < field824.length; var2++) {
			var1[var2] = new class31(field824[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field825[var4] != 0; var4++) {
			var3.method133(field825[var4], field826[var4]);
		}

		return var3;
	}

	@ObfuscatedName("gc.a(I)Leb;")
	public class31 method313() {
		class31[] var1 = new class31[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field827[var3] != -1) {
				var1[var2++] = new class31(field827[var3]);
			}
		}

		class31 var4 = new class31(var1, var2);
		for (int var5 = 0; var5 < 6 && field825[var5] != 0; var5++) {
			var4.method133(field825[var5], field826[var5]);
		}

		return var4;
	}
}
