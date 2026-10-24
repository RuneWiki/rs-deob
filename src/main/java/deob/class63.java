package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.b")
	public static int field913;

	@ObfuscatedName("kc.c")
	public static class63[] field914;

	@ObfuscatedName("kc.d")
	public int field915;

	@ObfuscatedName("kc.e")
	public int field916;

	@ObfuscatedName("kc.f")
	public int field917 = -1;

	@ObfuscatedName("kc.g")
	public class62 field918;

	@ObfuscatedName("kc.h")
	public boolean field919 = false;

	@ObfuscatedName("kc.i")
	public int[] field920 = new int[6];

	@ObfuscatedName("kc.j")
	public int[] field921 = new int[6];

	@ObfuscatedName("kc.k")
	public int field922 = 128;

	@ObfuscatedName("kc.l")
	public int field923 = 128;

	@ObfuscatedName("kc.m")
	public int field924;

	@ObfuscatedName("kc.n")
	public int field925;

	@ObfuscatedName("kc.o")
	public int field926;

	@ObfuscatedName("kc.p")
	public static class19 field927 = new class19(30);

	@ObfuscatedName("kc.a(ILub;)V")
	public static void method328(class47 arg0) {
		class37 var1 = new class37(arg0.method257(null, "spotanim.dat"));
		field913 = var1.method218();
		if (field914 == null) {
			field914 = new class63[field913];
		}

		for (int var2 = 0; var2 < field913; var2++) {
			if (field914[var2] == null) {
				field914[var2] = new class63();
			}

			field914[var2].field915 = var2;
			field914[var2].method329(var1);
		}
	}

	@ObfuscatedName("kc.a(Lkb;Z)V")
	public void method329(class37 arg0) {
		while (true) {
			int var2 = arg0.method216();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field916 = arg0.method218();
			} else if (var2 == 2) {
				field917 = arg0.method218();
				if (class62.field901 != null) {
					field918 = class62.field901[field917];
				}
			} else if (var2 == 3) {
				field919 = true;
			} else if (var2 == 4) {
				field922 = arg0.method218();
			} else if (var2 == 5) {
				field923 = arg0.method218();
			} else if (var2 == 6) {
				field924 = arg0.method218();
			} else if (var2 == 7) {
				field925 = arg0.method216();
			} else if (var2 == 8) {
				field926 = arg0.method216();
			} else if (var2 >= 40 && var2 < 50) {
				field920[var2 - 40] = arg0.method218();
			} else if (var2 >= 50 && var2 < 60) {
				field921[var2 - 50] = arg0.method218();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a()Leb;")
	public class31 method330() {
		class31 var1 = (class31) field927.method103(field915);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = new class31(field916);
		for (int var3 = 0; var3 < 6; var3++) {
			if (field920[0] != 0) {
				var2.method134(field920[var3], field921[var3]);
			}
		}

		field927.method104(var2, field915);
		return var2;
	}
}
