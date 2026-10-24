package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.c")
	public static int field958;

	@ObfuscatedName("lc.d")
	public static class64[] field959;

	@ObfuscatedName("lc.e")
	public int field960 = -1;

	@ObfuscatedName("lc.f")
	public int[] field961;

	@ObfuscatedName("lc.g")
	public int[] field962 = new int[6];

	@ObfuscatedName("lc.h")
	public int[] field963 = new int[6];

	@ObfuscatedName("lc.i")
	public int[] field964 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean field965 = false;

	@ObfuscatedName("lc.a(ILyb;)V")
	public static void method375(class51 arg0) {
		class39 var1 = new class39(arg0.method308("idk.dat", null));
		field958 = var1.method240();
		if (field959 == null) {
			field959 = new class64[field958];
		}

		for (int var2 = 0; var2 < field958; var2++) {
			if (field959[var2] == null) {
				field959[var2] = new class64();
			}

			field959[var2].method376(var1);
		}
	}

	@ObfuscatedName("lc.a(ZLmb;)V")
	public void method376(class39 arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field960 = arg0.method238();
			} else if (var2 == 2) {
				int var3 = arg0.method238();
				field961 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field961[var4] = arg0.method240();
				}
			} else if (var2 == 3) {
				field965 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field962[var2 - 40] = arg0.method240();
			} else if (var2 >= 50 && var2 < 60) {
				field963[var2 - 50] = arg0.method240();
			} else if (var2 >= 60 && var2 < 70) {
				field964[var2 - 60] = arg0.method240();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean method377() {
		if (field961 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field961.length; var2++) {
			if (!class32.method139(field961[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.a(Z)Lfb;")
	public class32 method378() {
		if (field961 == null) {
			return null;
		}

		class32[] var1 = new class32[field961.length];
		for (int var2 = 0; var2 < field961.length; var2++) {
			var1[var2] = class32.method138(field961[var2]);
		}

		class32 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class32(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field962[var4] != 0; var4++) {
			var3.method152(field962[var4], field963[var4]);
		}

		return var3;
	}

	@ObfuscatedName("lc.b(I)Z")
	public boolean method379() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field964[var2] != -1 && !class32.method139(field964[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.a(B)Lfb;")
	public class32 method380() {
		class32[] var1 = new class32[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field964[var3] != -1) {
				var1[var2++] = class32.method138(field964[var3]);
			}
		}

		class32 var4 = new class32(var1, var2);
		for (int var5 = 0; var5 < 6 && field962[var5] != 0; var5++) {
			var4.method152(field962[var5], field963[var5]);
		}

		return var4;
	}
}
