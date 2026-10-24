package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.a")
	public static int field921;

	@ObfuscatedName("lc.b")
	public static class64[] field922;

	@ObfuscatedName("lc.c")
	public static int field923;

	@ObfuscatedName("lc.d")
	public static int[] field924;

	@ObfuscatedName("lc.e")
	public String field925;

	@ObfuscatedName("lc.f")
	public int field926;

	@ObfuscatedName("lc.g")
	public int field927;

	@ObfuscatedName("lc.h")
	public boolean field928 = false;

	@ObfuscatedName("lc.i")
	public boolean field929 = true;

	@ObfuscatedName("lc.j")
	public int field930;

	@ObfuscatedName("lc.k")
	public boolean field931 = false;

	@ObfuscatedName("lc.l")
	public int field932;

	@ObfuscatedName("lc.m")
	public boolean field933 = false;

	@ObfuscatedName("lc.a(ILub;)V")
	public static void method323(class47 arg0) {
		class37 var1 = new class37(arg0.method250(null, "varp.dat"));
		field923 = 0;
		field921 = var1.method211();
		if (field922 == null) {
			field922 = new class64[field921];
		}

		if (field924 == null) {
			field924 = new int[field921];
		}

		for (int var2 = 0; var2 < field921; var2++) {
			if (field922[var2] == null) {
				field922[var2] = new class64();
			}

			field922[var2].method324(var2, var1);
		}
	}

	@ObfuscatedName("lc.a(IILkb;)V")
	public void method324(int arg0, class37 arg1) {
		while (true) {
			int var3 = arg1.method209();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field926 = arg1.method209();
			} else if (var3 == 2) {
				field927 = arg1.method209();
			} else if (var3 == 3) {
				field928 = true;
				field924[field923++] = arg0;
			} else if (var3 == 4) {
				field929 = false;
			} else if (var3 == 5) {
				field930 = arg1.method211();
			} else if (var3 == 6) {
				field931 = true;
			} else if (var3 == 7) {
				field932 = arg1.method214();
			} else if (var3 == 8) {
				field933 = true;
			} else if (var3 == 10) {
				field925 = arg1.method216();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
