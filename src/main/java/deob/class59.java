package deob;

@ObfuscatedName("gc")
public class class59 {

	@ObfuscatedName("gc.e")
	public static int field820;

	@ObfuscatedName("gc.f")
	public static class59[] field821;

	@ObfuscatedName("gc.g")
	public int field822 = -1;

	@ObfuscatedName("gc.h")
	public int[] field823;

	@ObfuscatedName("gc.i")
	public int[] field824 = new int[6];

	@ObfuscatedName("gc.j")
	public int[] field825 = new int[6];

	@ObfuscatedName("gc.k")
	public int[] field826 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("gc.a(ILub;)V")
	public static void method309(class47 arg0) {
		class37 var1 = new class37(arg0.method249("idk.dat", null));
		field820 = var1.method210();
		if (field821 == null) {
			field821 = new class59[field820];
		}

		for (int var2 = 0; var2 < field820; var2++) {
			if (field821[var2] == null) {
				field821[var2] = new class59();
			}

			field821[var2].method310(var1);
		}
	}

	@ObfuscatedName("gc.a(BLkb;)V")
	public void method310(class37 arg0) {
		while (true) {
			int var2 = arg0.method208();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field822 = arg0.method208();
			} else if (var2 == 2) {
				int var3 = arg0.method208();
				field823 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field823[var4] = arg0.method210();
				}
			} else if (var2 >= 40 && var2 < 50) {
				field824[var2 - 40] = arg0.method210();
			} else if (var2 >= 50 && var2 < 60) {
				field825[var2 - 50] = arg0.method210();
			} else if (var2 >= 60 && var2 < 70) {
				field826[var2 - 60] = arg0.method210();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("gc.a()Leb;")
	public class31 method311() {
		if (field823 == null) {
			return null;
		}

		class31[] var1 = new class31[field823.length];
		for (int var2 = 0; var2 < field823.length; var2++) {
			var1[var2] = new class31(field823[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field824[var4] != 0; var4++) {
			var3.method132(field824[var4], field825[var4]);
		}

		return var3;
	}

	@ObfuscatedName("gc.a(B)Leb;")
	public class31 method312() {
		class31[] var1 = new class31[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field826[var3] != -1) {
				var1[var2++] = new class31(field826[var3]);
			}
		}

		class31 var4 = new class31(var2, var1);
		for (int var5 = 0; var5 < 6 && field824[var5] != 0; var5++) {
			var4.method132(field824[var5], field825[var5]);
		}

		return var4;
	}
}
