package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.e")
	public static int field961;

	@ObfuscatedName("lc.f")
	public static class64[] field962;

	@ObfuscatedName("lc.g")
	public int field963 = -1;

	@ObfuscatedName("lc.h")
	public int[] field964;

	@ObfuscatedName("lc.i")
	public int[] field965 = new int[6];

	@ObfuscatedName("lc.j")
	public int[] field966 = new int[6];

	@ObfuscatedName("lc.k")
	public int[] field967 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.l")
	public boolean field968 = false;

	@ObfuscatedName("lc.a(ILxb;)V")
	public static void method368(class50 arg0) {
		class38 var1 = new class38(arg0.method294("idk.dat", null));
		field961 = var1.method226();
		if (field962 == null) {
			field962 = new class64[field961];
		}

		for (int var2 = 0; var2 < field961; var2++) {
			if (field962[var2] == null) {
				field962[var2] = new class64();
			}

			field962[var2].method369(var1);
		}
	}

	@ObfuscatedName("lc.a(Llb;I)V")
	public void method369(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field963 = arg0.method224();
			} else if (var2 == 2) {
				int var3 = arg0.method224();
				field964 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field964[var4] = arg0.method226();
				}
			} else if (var2 == 3) {
				field968 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field965[var2 - 40] = arg0.method226();
			} else if (var2 >= 50 && var2 < 60) {
				field966[var2 - 50] = arg0.method226();
			} else if (var2 >= 60 && var2 < 70) {
				field967[var2 - 60] = arg0.method226();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean method370() {
		if (field964 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field964.length; var2++) {
			if (!class31.method126(field964[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.a(B)Leb;")
	public class31 method371() {
		if (field964 == null) {
			return null;
		}

		class31[] var1 = new class31[field964.length];
		for (int var2 = 0; var2 < field964.length; var2++) {
			var1[var2] = class31.method125(field964[var2]);
		}

		class31 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class31(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field965[var4] != 0; var4++) {
			var3.method139(field965[var4], field966[var4]);
		}

		return var3;
	}

	@ObfuscatedName("lc.b(B)Z")
	public boolean method372() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field967[var2] != -1 && !class31.method126(field967[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.b(I)Leb;")
	public class31 method373() {
		class31[] var1 = new class31[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field967[var3] != -1) {
				var1[var2++] = class31.method125(field967[var3]);
			}
		}

		class31 var4 = new class31(var2, var1);
		for (int var5 = 0; var5 < 6 && field965[var5] != 0; var5++) {
			var4.method139(field965[var5], field966[var5]);
		}

		return var4;
	}
}
