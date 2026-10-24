package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.e")
	public static int field977;

	@ObfuscatedName("lc.f")
	public static class64[] field978;

	@ObfuscatedName("lc.g")
	public int field979 = -1;

	@ObfuscatedName("lc.h")
	public int[] field980;

	@ObfuscatedName("lc.i")
	public int[] field981 = new int[6];

	@ObfuscatedName("lc.j")
	public int[] field982 = new int[6];

	@ObfuscatedName("lc.k")
	public int[] field983 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.l")
	public boolean field984 = false;

	@ObfuscatedName("lc.a(Lxb;I)V")
	public static void method375(class50 arg0) {
		class38 var1 = new class38(arg0.method299("idk.dat", null));
		field977 = var1.method231();
		if (field978 == null) {
			field978 = new class64[field977];
		}

		for (int var2 = 0; var2 < field977; var2++) {
			if (field978[var2] == null) {
				field978[var2] = new class64();
			}

			field978[var2].method376(var1);
		}
	}

	@ObfuscatedName("lc.a(ILlb;)V")
	public void method376(class38 arg0) {
		while (true) {
			int var2 = arg0.method229();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field979 = arg0.method229();
			} else if (var2 == 2) {
				int var3 = arg0.method229();
				field980 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field980[var4] = arg0.method231();
				}
			} else if (var2 == 3) {
				field984 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field981[var2 - 40] = arg0.method231();
			} else if (var2 >= 50 && var2 < 60) {
				field982[var2 - 50] = arg0.method231();
			} else if (var2 >= 60 && var2 < 70) {
				field983[var2 - 60] = arg0.method231();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean method377() {
		if (field980 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field980.length; var2++) {
			if (!class31.method127(field980[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.a(Z)Leb;")
	public class31 method378() {
		if (field980 == null) {
			return null;
		}

		class31[] var1 = new class31[field980.length];
		for (int var2 = 0; var2 < field980.length; var2++) {
			var1[var2] = class31.method126(field980[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field981[var4] != 0; var4++) {
			var3.method140(field981[var4], field982[var4]);
		}

		return var3;
	}

	@ObfuscatedName("lc.b(I)Z")
	public boolean method379() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field983[var2] != -1 && !class31.method127(field983[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.b(Z)Leb;")
	public class31 method380() {
		class31[] var1 = new class31[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field983[var3] != -1) {
				var1[var2++] = class31.method126(field983[var3]);
			}
		}

		class31 var4 = new class31(var2, var1);
		for (int var5 = 0; var5 < 6 && field981[var5] != 0; var5++) {
			var4.method140(field981[var5], field982[var5]);
		}

		return var4;
	}
}
