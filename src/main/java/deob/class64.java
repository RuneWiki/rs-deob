package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.c")
	public static int field959;

	@ObfuscatedName("lc.d")
	public static class64[] field960;

	@ObfuscatedName("lc.e")
	public int field961 = -1;

	@ObfuscatedName("lc.f")
	public int[] field962;

	@ObfuscatedName("lc.g")
	public int[] field963 = new int[6];

	@ObfuscatedName("lc.h")
	public int[] field964 = new int[6];

	@ObfuscatedName("lc.i")
	public int[] field965 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean field966 = false;

	@ObfuscatedName("lc.a(ZLyb;)V")
	public static void method377(class51 arg0) {
		class39 var1 = new class39(arg0.method309("idk.dat", null));
		field959 = var1.method241();
		if (field960 == null) {
			field960 = new class64[field959];
		}

		for (int var2 = 0; var2 < field959; var2++) {
			if (field960[var2] == null) {
				field960[var2] = new class64();
			}

			field960[var2].method378(var1);
		}
	}

	@ObfuscatedName("lc.a(ILmb;)V")
	public void method378(class39 arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field961 = arg0.method239();
			} else if (var2 == 2) {
				int var3 = arg0.method239();
				field962 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field962[var4] = arg0.method241();
				}
			} else if (var2 == 3) {
				field966 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field963[var2 - 40] = arg0.method241();
			} else if (var2 >= 50 && var2 < 60) {
				field964[var2 - 50] = arg0.method241();
			} else if (var2 >= 60 && var2 < 70) {
				field965[var2 - 60] = arg0.method241();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(B)Z")
	public boolean method379() {
		if (field962 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field962.length; var2++) {
			if (!class32.method140(field962[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.a(I)Lfb;")
	public class32 method380() {
		if (field962 == null) {
			return null;
		}

		class32[] var1 = new class32[field962.length];
		for (int var2 = 0; var2 < field962.length; var2++) {
			var1[var2] = class32.method139(field962[var2]);
		}

		class32 var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new class32(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field963[var4] != 0; var4++) {
			var3.method153(field963[var4], field964[var4]);
		}

		return var3;
	}

	@ObfuscatedName("lc.b(I)Z")
	public boolean method381() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field965[var2] != -1 && !class32.method140(field965[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.c(I)Lfb;")
	public class32 method382() {
		class32[] var1 = new class32[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field965[var3] != -1) {
				var1[var2++] = class32.method139(field965[var3]);
			}
		}

		class32 var4 = new class32(var1, var2);
		for (int var5 = 0; var5 < 6 && field963[var5] != 0; var5++) {
			var4.method153(field963[var5], field964[var5]);
		}

		return var4;
	}
}
