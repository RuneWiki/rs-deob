package deob;

@ObfuscatedName("oc")
public class class67 {

	@ObfuscatedName("oc.a")
	public static int field973;

	@ObfuscatedName("oc.b")
	public static class67[] field974;

	@ObfuscatedName("oc.c")
	public static int field975;

	@ObfuscatedName("oc.d")
	public static int[] field976;

	@ObfuscatedName("oc.e")
	public String field977;

	@ObfuscatedName("oc.f")
	public int field978;

	@ObfuscatedName("oc.g")
	public int field979;

	@ObfuscatedName("oc.h")
	public boolean field980 = false;

	@ObfuscatedName("oc.i")
	public boolean field981 = true;

	@ObfuscatedName("oc.j")
	public int field982;

	@ObfuscatedName("oc.k")
	public boolean field983 = false;

	@ObfuscatedName("oc.l")
	public int field984;

	@ObfuscatedName("oc.m")
	public boolean field985 = false;

	@ObfuscatedName("oc.a(Lyb;I)V")
	public static void method378(class51 arg0) {
		class39 var1 = new class39(arg0.method299("varp.dat", null));
		field975 = 0;
		field973 = var1.method233();
		if (field974 == null) {
			field974 = new class67[field973];
		}

		if (field976 == null) {
			field976 = new int[field973];
		}

		for (int var2 = 0; var2 < field973; var2++) {
			if (field974[var2] == null) {
				field974[var2] = new class67();
			}

			field974[var2].method379(var2, var1);
		}
	}

	@ObfuscatedName("oc.a(IILmb;)V")
	public void method379(int arg0, class39 arg1) {
		while (true) {
			int var3 = arg1.method231();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field978 = arg1.method231();
			} else if (var3 == 2) {
				field979 = arg1.method231();
			} else if (var3 == 3) {
				field980 = true;
				field976[field975++] = arg0;
			} else if (var3 == 4) {
				field981 = false;
			} else if (var3 == 5) {
				field982 = arg1.method233();
			} else if (var3 == 6) {
				field983 = true;
			} else if (var3 == 7) {
				field984 = arg1.method236();
			} else if (var3 == 8) {
				field985 = true;
			} else if (var3 == 10) {
				field977 = arg1.method238();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
