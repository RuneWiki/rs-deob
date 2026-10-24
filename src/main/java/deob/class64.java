package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.b")
	public static int field922;

	@ObfuscatedName("lc.c")
	public static class64[] field923;

	@ObfuscatedName("lc.d")
	public static int field924;

	@ObfuscatedName("lc.e")
	public static int[] field925;

	@ObfuscatedName("lc.f")
	public String field926;

	@ObfuscatedName("lc.g")
	public int field927;

	@ObfuscatedName("lc.h")
	public int field928;

	@ObfuscatedName("lc.i")
	public boolean field929 = false;

	@ObfuscatedName("lc.j")
	public boolean field930 = true;

	@ObfuscatedName("lc.k")
	public int field931;

	@ObfuscatedName("lc.l")
	public boolean field932 = false;

	@ObfuscatedName("lc.m")
	public int field933;

	@ObfuscatedName("lc.n")
	public boolean field934 = false;

	@ObfuscatedName("lc.a(Lub;B)V")
	public static void method323(class47 arg0) {
		class37 var1 = new class37(arg0.method250(null, "varp.dat"));
		field924 = 0;
		field922 = var1.method211();
		if (field923 == null) {
			field923 = new class64[field922];
		}

		if (field925 == null) {
			field925 = new int[field922];
		}

		for (int var2 = 0; var2 < field922; var2++) {
			if (field923[var2] == null) {
				field923[var2] = new class64();
			}

			field923[var2].method324(var2, var1);
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
				field927 = arg1.method209();
			} else if (var3 == 2) {
				field928 = arg1.method209();
			} else if (var3 == 3) {
				field929 = true;
				field925[field924++] = arg0;
			} else if (var3 == 4) {
				field930 = false;
			} else if (var3 == 5) {
				field931 = arg1.method211();
			} else if (var3 == 6) {
				field932 = true;
			} else if (var3 == 7) {
				field933 = arg1.method214();
			} else if (var3 == 8) {
				field934 = true;
			} else if (var3 == 10) {
				field926 = arg1.method216();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
