package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.c")
	public static int field913;

	@ObfuscatedName("kc.d")
	public static class63[] field914;

	@ObfuscatedName("kc.e")
	public int field915;

	@ObfuscatedName("kc.f")
	public int field916;

	@ObfuscatedName("kc.g")
	public class62 field917;

	@ObfuscatedName("kc.h")
	public boolean field918 = false;

	@ObfuscatedName("kc.i")
	public int[] field919 = new int[6];

	@ObfuscatedName("kc.j")
	public int[] field920 = new int[6];

	@ObfuscatedName("kc.k")
	public int field921 = 128;

	@ObfuscatedName("kc.l")
	public int field922 = 128;

	@ObfuscatedName("kc.m")
	public int field923;

	@ObfuscatedName("kc.n")
	public int field924;

	@ObfuscatedName("kc.o")
	public int field925;

	@ObfuscatedName("kc.p")
	public static class19 field926 = new class19(30);

	@ObfuscatedName("kc.a(Lub;I)V")
	public static void method320(class47 arg0) {
		class37 var1 = new class37(arg0.method250("spotanim.dat", null));
		field913 = var1.method211();
		if (field914 == null) {
			field914 = new class63[field913];
		}

		for (int var2 = 0; var2 < field913; var2++) {
			if (field914[var2] == null) {
				field914[var2] = new class63();
			}

			field914[var2].field915 = var2;
			field914[var2].method321(var1);
		}
	}

	@ObfuscatedName("kc.a(Lkb;I)V")
	public void method321(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field916 = arg0.method211();
			} else if (var2 == 2) {
				field917 = class62.field901[arg0.method211()];
			} else if (var2 == 3) {
				field918 = true;
			} else if (var2 == 4) {
				field921 = arg0.method211();
			} else if (var2 == 5) {
				field922 = arg0.method211();
			} else if (var2 == 6) {
				field923 = arg0.method211();
			} else if (var2 == 7) {
				field924 = arg0.method209();
			} else if (var2 == 8) {
				field925 = arg0.method209();
			} else if (var2 >= 40 && var2 < 50) {
				field919[var2 - 40] = arg0.method211();
			} else if (var2 >= 50 && var2 < 60) {
				field920[var2 - 50] = arg0.method211();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a()Leb;")
	public class31 method322() {
		class31 var1 = (class31) field926.method102(field915);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = new class31(field916);
		for (int var3 = 0; var3 < 6; var3++) {
			if (field919[0] != 0) {
				var2.method133(field919[var3], field920[var3]);
			}
		}

		field926.method103(field915, var2);
		return var2;
	}
}
