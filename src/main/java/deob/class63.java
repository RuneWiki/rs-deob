package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.c")
	public static int field908;

	@ObfuscatedName("kc.d")
	public static class63[] field909;

	@ObfuscatedName("kc.e")
	public int field910;

	@ObfuscatedName("kc.f")
	public int field911;

	@ObfuscatedName("kc.g")
	public class62 field912;

	@ObfuscatedName("kc.h")
	public boolean field913 = false;

	@ObfuscatedName("kc.i")
	public int[] field914 = new int[6];

	@ObfuscatedName("kc.j")
	public int[] field915 = new int[6];

	@ObfuscatedName("kc.k")
	public int field916 = 128;

	@ObfuscatedName("kc.l")
	public int field917 = 128;

	@ObfuscatedName("kc.m")
	public int field918;

	@ObfuscatedName("kc.n")
	public int field919;

	@ObfuscatedName("kc.o")
	public int field920;

	@ObfuscatedName("kc.p")
	public static class19 field921 = new class19(30);

	@ObfuscatedName("kc.a(Lub;B)V")
	public static void method320(class47 arg0) {
		class37 var1 = new class37(arg0.method250(null, "spotanim.dat"));
		field908 = var1.method211();
		if (field909 == null) {
			field909 = new class63[field908];
		}

		for (int var2 = 0; var2 < field908; var2++) {
			if (field909[var2] == null) {
				field909[var2] = new class63();
			}

			field909[var2].field910 = var2;
			field909[var2].method321(var1);
		}
	}

	@ObfuscatedName("kc.a(ILkb;)V")
	public void method321(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field911 = arg0.method211();
			} else if (var2 == 2) {
				field912 = class62.field896[arg0.method211()];
			} else if (var2 == 3) {
				field913 = true;
			} else if (var2 == 4) {
				field916 = arg0.method211();
			} else if (var2 == 5) {
				field917 = arg0.method211();
			} else if (var2 == 6) {
				field918 = arg0.method211();
			} else if (var2 == 7) {
				field919 = arg0.method209();
			} else if (var2 == 8) {
				field920 = arg0.method209();
			} else if (var2 >= 40 && var2 < 50) {
				field914[var2 - 40] = arg0.method211();
			} else if (var2 >= 50 && var2 < 60) {
				field915[var2 - 50] = arg0.method211();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a()Leb;")
	public class31 method322() {
		class31 var1 = (class31) field921.method102(field910);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = new class31(field911);
		for (int var3 = 0; var3 < 6; var3++) {
			if (field914[0] != 0) {
				var2.method133(field914[var3], field915[var3]);
			}
		}

		field921.method103(field910, var2);
		return var2;
	}
}
