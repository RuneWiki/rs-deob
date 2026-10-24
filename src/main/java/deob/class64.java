package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.d")
	public static int field919;

	@ObfuscatedName("lc.e")
	public static class64[] field920;

	@ObfuscatedName("lc.f")
	public static int field921;

	@ObfuscatedName("lc.g")
	public static int[] field922;

	@ObfuscatedName("lc.h")
	public String field923;

	@ObfuscatedName("lc.i")
	public int field924;

	@ObfuscatedName("lc.j")
	public int field925;

	@ObfuscatedName("lc.k")
	public boolean field926 = false;

	@ObfuscatedName("lc.l")
	public boolean field927 = true;

	@ObfuscatedName("lc.m")
	public int field928;

	@ObfuscatedName("lc.n")
	public boolean field929 = false;

	@ObfuscatedName("lc.o")
	public int field930;

	@ObfuscatedName("lc.p")
	public boolean field931 = false;

	@ObfuscatedName("lc.a(ILub;)V")
	public static void method322(class47 arg0) {
		class37 var1 = new class37(arg0.method249("varp.dat", null));
		field921 = 0;
		field919 = var1.method210();
		if (field920 == null) {
			field920 = new class64[field919];
		}

		if (field922 == null) {
			field922 = new int[field919];
		}

		for (int var2 = 0; var2 < field919; var2++) {
			if (field920[var2] == null) {
				field920[var2] = new class64();
			}

			field920[var2].method323(var1, var2);
		}
	}

	@ObfuscatedName("lc.a(BLkb;I)V")
	public void method323(class37 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method208();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field924 = arg0.method208();
			} else if (var3 == 2) {
				field925 = arg0.method208();
			} else if (var3 == 3) {
				field926 = true;
				field922[field921++] = arg1;
			} else if (var3 == 4) {
				field927 = false;
			} else if (var3 == 5) {
				field928 = arg0.method210();
			} else if (var3 == 6) {
				field929 = true;
			} else if (var3 == 7) {
				field930 = arg0.method213();
			} else if (var3 == 8) {
				field931 = true;
			} else if (var3 == 10) {
				field923 = arg0.method215();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
