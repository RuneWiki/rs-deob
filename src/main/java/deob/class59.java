package deob;

@ObfuscatedName("gc")
public class class59 {

	@ObfuscatedName("gc.c")
	public static int field822;

	@ObfuscatedName("gc.d")
	public static class59[] field823;

	@ObfuscatedName("gc.e")
	public int field824 = -1;

	@ObfuscatedName("gc.f")
	public int[] field825;

	@ObfuscatedName("gc.g")
	public int[] field826 = new int[6];

	@ObfuscatedName("gc.h")
	public int[] field827 = new int[6];

	@ObfuscatedName("gc.i")
	public int[] field828 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("gc.j")
	public boolean field829 = false;

	@ObfuscatedName("gc.a(Lub;B)V")
	public static void method310(class47 arg0) {
		class37 var1 = new class37(arg0.method250(null, "idk.dat"));
		field822 = var1.method211();
		if (field823 == null) {
			field823 = new class59[field822];
		}

		for (int var2 = 0; var2 < field822; var2++) {
			if (field823[var2] == null) {
				field823[var2] = new class59();
			}

			field823[var2].method311(var1);
		}
	}

	@ObfuscatedName("gc.a(ILkb;)V")
	public void method311(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field824 = arg0.method209();
			} else if (var2 == 2) {
				int var3 = arg0.method209();
				field825 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field825[var4] = arg0.method211();
				}
			} else if (var2 == 3) {
				field829 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field826[var2 - 40] = arg0.method211();
			} else if (var2 >= 50 && var2 < 60) {
				field827[var2 - 50] = arg0.method211();
			} else if (var2 >= 60 && var2 < 70) {
				field828[var2 - 60] = arg0.method211();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("gc.a()Leb;")
	public class31 method312() {
		if (field825 == null) {
			return null;
		}

		class31[] var1 = new class31[field825.length];
		for (int var2 = 0; var2 < field825.length; var2++) {
			var1[var2] = new class31(field825[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field826[var4] != 0; var4++) {
			var3.method133(field826[var4], field827[var4]);
		}

		return var3;
	}

	@ObfuscatedName("gc.a(B)Leb;")
	public class31 method313() {
		class31[] var1 = new class31[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field828[var3] != -1) {
				var1[var2++] = new class31(field828[var3]);
			}
		}

		class31 var4 = new class31(var2, var1);
		for (int var5 = 0; var5 < 6 && field826[var5] != 0; var5++) {
			var4.method133(field826[var5], field827[var5]);
		}

		return var4;
	}
}
