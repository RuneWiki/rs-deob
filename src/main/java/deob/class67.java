package deob;

@ObfuscatedName("oc")
public class class67 {

	@ObfuscatedName("oc.a")
	public static int field970;

	@ObfuscatedName("oc.b")
	public static class67[] field971;

	@ObfuscatedName("oc.c")
	public static int field972;

	@ObfuscatedName("oc.d")
	public static int[] field973;

	@ObfuscatedName("oc.e")
	public String field974;

	@ObfuscatedName("oc.f")
	public int field975;

	@ObfuscatedName("oc.g")
	public int field976;

	@ObfuscatedName("oc.h")
	public boolean field977 = false;

	@ObfuscatedName("oc.i")
	public boolean field978 = true;

	@ObfuscatedName("oc.j")
	public int field979;

	@ObfuscatedName("oc.k")
	public boolean field980 = false;

	@ObfuscatedName("oc.l")
	public int field981;

	@ObfuscatedName("oc.m")
	public boolean field982 = false;

	@ObfuscatedName("oc.a(Lyb;B)V")
	public static void method374(class51 arg0) {
		class39 var1 = new class39(arg0.method295("varp.dat", null));
		field972 = 0;
		field970 = var1.method233();
		if (field971 == null) {
			field971 = new class67[field970];
		}

		if (field973 == null) {
			field973 = new int[field970];
		}

		for (int var2 = 0; var2 < field970; var2++) {
			if (field971[var2] == null) {
				field971[var2] = new class67();
			}

			field971[var2].method375(var1, var2);
		}
	}

	@ObfuscatedName("oc.a(Lmb;II)V")
	public void method375(class39 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method231();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field975 = arg0.method231();
			} else if (var3 == 2) {
				field976 = arg0.method231();
			} else if (var3 == 3) {
				field977 = true;
				field973[field972++] = arg1;
			} else if (var3 == 4) {
				field978 = false;
			} else if (var3 == 5) {
				field979 = arg0.method233();
			} else if (var3 == 6) {
				field980 = true;
			} else if (var3 == 7) {
				field981 = arg0.method236();
			} else if (var3 == 8) {
				field982 = true;
			} else if (var3 == 10) {
				field974 = arg0.method238();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
