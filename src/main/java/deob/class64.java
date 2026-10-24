package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.c")
	public static int field964;

	@ObfuscatedName("lc.d")
	public static class64[] field965;

	@ObfuscatedName("lc.e")
	public int field966 = -1;

	@ObfuscatedName("lc.f")
	public int[] field967;

	@ObfuscatedName("lc.g")
	public int[] field968 = new int[6];

	@ObfuscatedName("lc.h")
	public int[] field969 = new int[6];

	@ObfuscatedName("lc.i")
	public int[] field970 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean field971 = false;

	@ObfuscatedName("lc.a(Lxb;I)V")
	public static void method369(class50 arg0) {
		class38 var1 = new class38(arg0.method295("idk.dat", null));
		field964 = var1.method227();
		if (field965 == null) {
			field965 = new class64[field964];
		}

		for (int var2 = 0; var2 < field964; var2++) {
			if (field965[var2] == null) {
				field965[var2] = new class64();
			}

			field965[var2].method370(var1);
		}
	}

	@ObfuscatedName("lc.a(Llb;B)V")
	public void method370(class38 arg0) {
		while (true) {
			int var2 = arg0.method225();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field966 = arg0.method225();
			} else if (var2 == 2) {
				int var3 = arg0.method225();
				field967 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field967[var4] = arg0.method227();
				}
			} else if (var2 == 3) {
				field971 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field968[var2 - 40] = arg0.method227();
			} else if (var2 >= 50 && var2 < 60) {
				field969[var2 - 50] = arg0.method227();
			} else if (var2 >= 60 && var2 < 70) {
				field970[var2 - 60] = arg0.method227();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(B)Z")
	public boolean method371() {
		if (field967 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field967.length; var2++) {
			if (!class31.method126(field967[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.a(Z)Leb;")
	public class31 method372() {
		if (field967 == null) {
			return null;
		}

		class31[] var1 = new class31[field967.length];
		for (int var2 = 0; var2 < field967.length; var2++) {
			var1[var2] = class31.method125(field967[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field968[var4] != 0; var4++) {
			var3.method139(field968[var4], field969[var4]);
		}

		return var3;
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean method373() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field970[var2] != -1 && !class31.method126(field970[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.b(B)Leb;")
	public class31 method374() {
		class31[] var1 = new class31[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field970[var3] != -1) {
				var1[var2++] = class31.method125(field970[var3]);
			}
		}

		class31 var4 = new class31(var2, var1);
		for (int var5 = 0; var5 < 6 && field968[var5] != 0; var5++) {
			var4.method139(field968[var5], field969[var5]);
		}

		return var4;
	}
}
