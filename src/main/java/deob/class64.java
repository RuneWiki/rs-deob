package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.b")
	public static int field927;

	@ObfuscatedName("lc.c")
	public static class64[] field928;

	@ObfuscatedName("lc.d")
	public static int field929;

	@ObfuscatedName("lc.e")
	public static int[] field930;

	@ObfuscatedName("lc.f")
	public String field931;

	@ObfuscatedName("lc.g")
	public int field932;

	@ObfuscatedName("lc.h")
	public int field933;

	@ObfuscatedName("lc.i")
	public boolean field934 = false;

	@ObfuscatedName("lc.j")
	public boolean field935 = true;

	@ObfuscatedName("lc.k")
	public int field936;

	@ObfuscatedName("lc.l")
	public boolean field937 = false;

	@ObfuscatedName("lc.m")
	public int field938;

	@ObfuscatedName("lc.n")
	public boolean field939 = false;

	@ObfuscatedName("lc.a(Lub;I)V")
	public static void method323(class47 arg0) {
		class37 var1 = new class37(arg0.method250("varp.dat", null));
		field929 = 0;
		field927 = var1.method211();
		if (field928 == null) {
			field928 = new class64[field927];
		}

		if (field930 == null) {
			field930 = new int[field927];
		}

		for (int var2 = 0; var2 < field927; var2++) {
			if (field928[var2] == null) {
				field928[var2] = new class64();
			}

			field928[var2].method324(var1, var2);
		}
	}

	@ObfuscatedName("lc.a(Lkb;IB)V")
	public void method324(class37 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method209();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field932 = arg0.method209();
			} else if (var3 == 2) {
				field933 = arg0.method209();
			} else if (var3 == 3) {
				field934 = true;
				field930[field929++] = arg1;
			} else if (var3 == 4) {
				field935 = false;
			} else if (var3 == 5) {
				field936 = arg0.method211();
			} else if (var3 == 6) {
				field937 = true;
			} else if (var3 == 7) {
				field938 = arg0.method214();
			} else if (var3 == 8) {
				field939 = true;
			} else if (var3 == 10) {
				field931 = arg0.method216();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
