package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.c")
	public static int field925;

	@ObfuscatedName("kc.d")
	public static class63[] field926;

	@ObfuscatedName("kc.e")
	public int field927 = -1;

	@ObfuscatedName("kc.f")
	public int[] field928;

	@ObfuscatedName("kc.g")
	public int[] field929 = new int[6];

	@ObfuscatedName("kc.h")
	public int[] field930 = new int[6];

	@ObfuscatedName("kc.i")
	public int[] field931 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("kc.j")
	public boolean field932 = false;

	@ObfuscatedName("kc.a(Lyb;B)V")
	public static void method362(class51 arg0) {
		class39 var1 = new class39(arg0.method295("idk.dat", null));
		field925 = var1.method233();
		if (field926 == null) {
			field926 = new class63[field925];
		}

		for (int var2 = 0; var2 < field925; var2++) {
			if (field926[var2] == null) {
				field926[var2] = new class63();
			}

			field926[var2].method363(var1);
		}
	}

	@ObfuscatedName("kc.a(ZLmb;)V")
	public void method363(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field927 = arg0.method231();
			} else if (var2 == 2) {
				int var3 = arg0.method231();
				field928 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field928[var4] = arg0.method233();
				}
			} else if (var2 == 3) {
				field932 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field929[var2 - 40] = arg0.method233();
			} else if (var2 >= 50 && var2 < 60) {
				field930[var2 - 50] = arg0.method233();
			} else if (var2 >= 60 && var2 < 70) {
				field931[var2 - 60] = arg0.method233();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(I)Z")
	public boolean method364() {
		if (field928 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field928.length; var2++) {
			if (!class32.method136(field928[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("kc.b(I)Lfb;")
	public class32 method365() {
		if (field928 == null) {
			return null;
		}

		class32[] var1 = new class32[field928.length];
		for (int var2 = 0; var2 < field928.length; var2++) {
			var1[var2] = class32.method135(field928[var2]);
		}

		class32 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class32(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field929[var4] != 0; var4++) {
			var3.method149(field929[var4], field930[var4]);
		}

		return var3;
	}

	@ObfuscatedName("kc.c(I)Z")
	public boolean method366() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field931[var2] != -1 && !class32.method136(field931[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("kc.a(B)Lfb;")
	public class32 method367() {
		class32[] var1 = new class32[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field931[var3] != -1) {
				var1[var2++] = class32.method135(field931[var3]);
			}
		}

		class32 var4 = new class32(var2, var1);
		for (int var5 = 0; var5 < 6 && field929[var5] != 0; var5++) {
			var4.method149(field929[var5], field930[var5]);
		}

		return var4;
	}
}
