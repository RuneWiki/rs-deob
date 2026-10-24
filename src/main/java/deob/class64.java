package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.b")
	public static int field928;

	@ObfuscatedName("lc.c")
	public static class64[] field929;

	@ObfuscatedName("lc.d")
	public static int field930;

	@ObfuscatedName("lc.e")
	public static int[] field931;

	@ObfuscatedName("lc.f")
	public String field932;

	@ObfuscatedName("lc.g")
	public int field933;

	@ObfuscatedName("lc.h")
	public int field934;

	@ObfuscatedName("lc.i")
	public boolean field935 = false;

	@ObfuscatedName("lc.j")
	public boolean field936 = true;

	@ObfuscatedName("lc.k")
	public int field937;

	@ObfuscatedName("lc.l")
	public boolean field938 = false;

	@ObfuscatedName("lc.m")
	public int field939;

	@ObfuscatedName("lc.n")
	public boolean field940 = false;

	@ObfuscatedName("lc.a(ZLub;)V")
	public static void method331(class47 arg0) {
		class37 var1 = new class37(arg0.method257(null, "varp.dat"));
		field930 = 0;
		field928 = var1.method218();
		if (field929 == null) {
			field929 = new class64[field928];
		}

		if (field931 == null) {
			field931 = new int[field928];
		}

		for (int var2 = 0; var2 < field928; var2++) {
			if (field929[var2] == null) {
				field929[var2] = new class64();
			}

			field929[var2].method332(var2, var1);
		}
	}

	@ObfuscatedName("lc.a(ILkb;Z)V")
	public void method332(int arg0, class37 arg1) {
		while (true) {
			int var3 = arg1.method216();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field933 = arg1.method216();
			} else if (var3 == 2) {
				field934 = arg1.method216();
			} else if (var3 == 3) {
				field935 = true;
				field931[field930++] = arg0;
			} else if (var3 == 4) {
				field936 = false;
			} else if (var3 == 5) {
				field937 = arg1.method218();
			} else if (var3 == 6) {
				field938 = true;
			} else if (var3 == 7) {
				field939 = arg1.method221();
			} else if (var3 == 8) {
				field940 = true;
			} else if (var3 == 10) {
				field932 = arg1.method223();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
