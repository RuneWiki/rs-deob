package deob;

@ObfuscatedName("oc")
public class class67 {

	@ObfuscatedName("oc.b")
	public static int field988;

	@ObfuscatedName("oc.c")
	public static class67[] field989;

	@ObfuscatedName("oc.d")
	public int field990;

	@ObfuscatedName("oc.e")
	public int field991;

	@ObfuscatedName("oc.f")
	public int field992 = -1;

	@ObfuscatedName("oc.g")
	public class66 field993;

	@ObfuscatedName("oc.h")
	public boolean field994 = false;

	@ObfuscatedName("oc.i")
	public int[] field995 = new int[6];

	@ObfuscatedName("oc.j")
	public int[] field996 = new int[6];

	@ObfuscatedName("oc.k")
	public int field997 = 128;

	@ObfuscatedName("oc.l")
	public int field998 = 128;

	@ObfuscatedName("oc.m")
	public int field999;

	@ObfuscatedName("oc.n")
	public int field1000;

	@ObfuscatedName("oc.o")
	public int field1001;

	@ObfuscatedName("oc.p")
	public static class20 field1002 = new class20(30);

	@ObfuscatedName("oc.a(ILyb;)V")
	public static void method384(class51 arg0) {
		class39 var1 = new class39(arg0.method308("spotanim.dat", null));
		field988 = var1.method240();
		if (field989 == null) {
			field989 = new class67[field988];
		}

		for (int var2 = 0; var2 < field988; var2++) {
			if (field989[var2] == null) {
				field989[var2] = new class67();
			}

			field989[var2].field990 = var2;
			field989[var2].method385(var1);
		}
	}

	@ObfuscatedName("oc.a(Lmb;I)V")
	public void method385(class39 arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field991 = arg0.method240();
			} else if (var2 == 2) {
				field992 = arg0.method240();
				if (class66.field973 != null) {
					field993 = class66.field973[field992];
				}
			} else if (var2 == 3) {
				field994 = true;
			} else if (var2 == 4) {
				field997 = arg0.method240();
			} else if (var2 == 5) {
				field998 = arg0.method240();
			} else if (var2 == 6) {
				field999 = arg0.method240();
			} else if (var2 == 7) {
				field1000 = arg0.method238();
			} else if (var2 == 8) {
				field1001 = arg0.method238();
			} else if (var2 >= 40 && var2 < 50) {
				field995[var2 - 40] = arg0.method240();
			} else if (var2 >= 50 && var2 < 60) {
				field996[var2 - 50] = arg0.method240();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("oc.a()Lfb;")
	public class32 method386() {
		class32 var1 = (class32) field1002.method114(field990);
		if (var1 != null) {
			return var1;
		}

		class32 var2 = class32.method138(field991);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field995[0] != 0) {
				var2.method152(field995[var3], field996[var3]);
			}
		}

		field1002.method115(var2, field990);
		return var2;
	}
}
