package deob;

@ObfuscatedName("dc")
public class class56 {

	@ObfuscatedName("dc.a")
	public static int field770;

	@ObfuscatedName("dc.b")
	public static class56[] field771;

	@ObfuscatedName("dc.c")
	public int field772 = -1;

	@ObfuscatedName("dc.d")
	public int[] field773;

	@ObfuscatedName("dc.e")
	public int[] field774 = new int[6];

	@ObfuscatedName("dc.f")
	public int[] field775 = new int[6];

	@ObfuscatedName("dc.g")
	public int[] field776 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("dc.a(ZLub;)V")
	public static void method287(class47 arg0) {
		class37 var1 = new class37(arg0.method242(null, "idk.dat"));
		field770 = var1.method203();
		if (field771 == null) {
			field771 = new class56[field770];
		}

		for (int var2 = 0; var2 < field770; var2++) {
			if (field771[var2] == null) {
				field771[var2] = new class56();
			}

			field771[var2].method288(var1);
		}
	}

	@ObfuscatedName("dc.a(ILkb;)V")
	public void method288(class37 arg0) {
		while (true) {
			int var2 = arg0.method201();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field772 = arg0.method201();
			} else if (var2 == 2) {
				int var3 = arg0.method201();
				field773 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field773[var4] = arg0.method203();
				}
			} else if (var2 >= 40 && var2 < 50) {
				field774[var2 - 40] = arg0.method203();
			} else if (var2 >= 50 && var2 < 60) {
				field775[var2 - 50] = arg0.method203();
			} else if (var2 >= 60 && var2 < 70) {
				field776[var2 - 60] = arg0.method203();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("dc.a()Leb;")
	public class31 method289() {
		if (field773 == null) {
			return null;
		}

		class31[] var1 = new class31[field773.length];
		for (int var2 = 0; var2 < field773.length; var2++) {
			var1[var2] = new class31(field773[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field774[var4] != 0; var4++) {
			var3.method129(field774[var4], field775[var4]);
		}

		return var3;
	}

	@ObfuscatedName("dc.a(I)Leb;")
	public class31 method290() {
		class31[] var1 = new class31[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field776[var3] != -1) {
				var1[var2++] = new class31(field776[var3]);
			}
		}

		class31 var4 = new class31(var2, var1);
		for (int var5 = 0; var5 < 6 && field774[var5] != 0; var5++) {
			var4.method129(field774[var5], field775[var5]);
		}

		return var4;
	}
}
