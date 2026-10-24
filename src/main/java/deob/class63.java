package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.c")
	public static int field928;

	@ObfuscatedName("kc.d")
	public static class63[] field929;

	@ObfuscatedName("kc.e")
	public int field930 = -1;

	@ObfuscatedName("kc.f")
	public int[] field931;

	@ObfuscatedName("kc.g")
	public int[] field932 = new int[6];

	@ObfuscatedName("kc.h")
	public int[] field933 = new int[6];

	@ObfuscatedName("kc.i")
	public int[] field934 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("kc.j")
	public boolean field935 = false;

	@ObfuscatedName("kc.a(Lyb;I)V")
	public static void method366(class51 arg0) {
		class39 var1 = new class39(arg0.method299("idk.dat", null));
		field928 = var1.method233();
		if (field929 == null) {
			field929 = new class63[field928];
		}

		for (int var2 = 0; var2 < field928; var2++) {
			if (field929[var2] == null) {
				field929[var2] = new class63();
			}

			field929[var2].method367(var1);
		}
	}

	@ObfuscatedName("kc.a(ILmb;)V")
	public void method367(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field930 = arg0.method231();
			} else if (var2 == 2) {
				int var3 = arg0.method231();
				field931 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field931[var4] = arg0.method233();
				}
			} else if (var2 == 3) {
				field935 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field932[var2 - 40] = arg0.method233();
			} else if (var2 >= 50 && var2 < 60) {
				field933[var2 - 50] = arg0.method233();
			} else if (var2 >= 60 && var2 < 70) {
				field934[var2 - 60] = arg0.method233();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(Z)Z")
	public boolean method368() {
		if (field931 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field931.length; var2++) {
			if (!class32.method136(field931[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("kc.a(I)Lfb;")
	public class32 method369() {
		if (field931 == null) {
			return null;
		}

		class32[] var1 = new class32[field931.length];
		for (int var2 = 0; var2 < field931.length; var2++) {
			var1[var2] = class32.method135(field931[var2]);
		}

		class32 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class32(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field932[var4] != 0; var4++) {
			var3.method149(field932[var4], field933[var4]);
		}

		return var3;
	}

	@ObfuscatedName("kc.b(I)Z")
	public boolean method370() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field934[var2] != -1 && !class32.method136(field934[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("kc.b(Z)Lfb;")
	public class32 method371() {
		class32[] var1 = new class32[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field934[var3] != -1) {
				var1[var2++] = class32.method135(field934[var3]);
			}
		}

		class32 var4 = new class32(var2, var1);
		for (int var5 = 0; var5 < 6 && field932[var5] != 0; var5++) {
			var4.method149(field932[var5], field933[var5]);
		}

		return var4;
	}
}
