package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.c")
	public static int field957;

	@ObfuscatedName("lc.d")
	public static class64[] field958;

	@ObfuscatedName("lc.e")
	public int field959 = -1;

	@ObfuscatedName("lc.f")
	public int[] field960;

	@ObfuscatedName("lc.g")
	public int[] field961 = new int[6];

	@ObfuscatedName("lc.h")
	public int[] field962 = new int[6];

	@ObfuscatedName("lc.i")
	public int[] field963 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean field964 = false;

	@ObfuscatedName("lc.a(Lyb;I)V")
	public static void method377(class51 arg0) {
		class39 var1 = new class39(arg0.method309("idk.dat", null));
		field957 = var1.method241();
		if (field958 == null) {
			field958 = new class64[field957];
		}

		for (int var2 = 0; var2 < field957; var2++) {
			if (field958[var2] == null) {
				field958[var2] = new class64();
			}

			field958[var2].method378(var1);
		}
	}

	@ObfuscatedName("lc.a(Lmb;B)V")
	public void method378(class39 arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field959 = arg0.method239();
			} else if (var2 == 2) {
				int var3 = arg0.method239();
				field960 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field960[var4] = arg0.method241();
				}
			} else if (var2 == 3) {
				field964 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field961[var2 - 40] = arg0.method241();
			} else if (var2 >= 50 && var2 < 60) {
				field962[var2 - 50] = arg0.method241();
			} else if (var2 >= 60 && var2 < 70) {
				field963[var2 - 60] = arg0.method241();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(B)Z")
	public boolean method379() {
		if (field960 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field960.length; var2++) {
			if (!class32.method140(field960[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.a(I)Lfb;")
	public class32 method380() {
		if (field960 == null) {
			return null;
		}

		class32[] var1 = new class32[field960.length];
		for (int var2 = 0; var2 < field960.length; var2++) {
			var1[var2] = class32.method139(field960[var2]);
		}

		class32 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class32(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field961[var4] != 0; var4++) {
			var3.method153(field961[var4], field962[var4]);
		}

		return var3;
	}

	@ObfuscatedName("lc.b(I)Z")
	public boolean method381() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field963[var2] != -1 && !class32.method140(field963[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.a(Z)Lfb;")
	public class32 method382() {
		class32[] var1 = new class32[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field963[var3] != -1) {
				var1[var2++] = class32.method139(field963[var3]);
			}
		}

		class32 var4 = new class32(var2, var1);
		for (int var5 = 0; var5 < 6 && field961[var5] != 0; var5++) {
			var4.method153(field961[var5], field962[var5]);
		}

		return var4;
	}
}
