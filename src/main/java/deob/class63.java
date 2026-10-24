package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.d")
	public static int field905;

	@ObfuscatedName("kc.e")
	public static class63[] field906;

	@ObfuscatedName("kc.f")
	public int field907;

	@ObfuscatedName("kc.g")
	public int field908;

	@ObfuscatedName("kc.h")
	public class62 field909;

	@ObfuscatedName("kc.i")
	public boolean field910 = false;

	@ObfuscatedName("kc.j")
	public int[] field911 = new int[6];

	@ObfuscatedName("kc.k")
	public int[] field912 = new int[6];

	@ObfuscatedName("kc.l")
	public int field913 = 128;

	@ObfuscatedName("kc.m")
	public int field914 = 128;

	@ObfuscatedName("kc.n")
	public int field915;

	@ObfuscatedName("kc.o")
	public int field916;

	@ObfuscatedName("kc.p")
	public int field917;

	@ObfuscatedName("kc.q")
	public static class19 field918 = new class19(30);

	@ObfuscatedName("kc.a(ILub;)V")
	public static void method319(class47 arg0) {
		class37 var1 = new class37(arg0.method249("spotanim.dat", null));
		field905 = var1.method210();
		if (field906 == null) {
			field906 = new class63[field905];
		}

		for (int var2 = 0; var2 < field905; var2++) {
			if (field906[var2] == null) {
				field906[var2] = new class63();
			}

			field906[var2].field907 = var2;
			field906[var2].method320(var1);
		}
	}

	@ObfuscatedName("kc.a(BLkb;)V")
	public void method320(class37 arg0) {
		while (true) {
			int var2 = arg0.method208();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field908 = arg0.method210();
			} else if (var2 == 2) {
				field909 = class62.field893[arg0.method210()];
			} else if (var2 == 3) {
				field910 = true;
			} else if (var2 == 4) {
				field913 = arg0.method210();
			} else if (var2 == 5) {
				field914 = arg0.method210();
			} else if (var2 == 6) {
				field915 = arg0.method210();
			} else if (var2 == 7) {
				field916 = arg0.method208();
			} else if (var2 == 8) {
				field917 = arg0.method208();
			} else if (var2 >= 40 && var2 < 50) {
				field911[var2 - 40] = arg0.method210();
			} else if (var2 >= 50 && var2 < 60) {
				field912[var2 - 50] = arg0.method210();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a()Leb;")
	public class31 method321() {
		class31 var1 = (class31) field918.method101(field907);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = new class31(field908);
		for (int var3 = 0; var3 < 6; var3++) {
			if (field911[0] != 0) {
				var2.method132(field911[var3], field912[var3]);
			}
		}

		field918.method102(field907, var2);
		return var2;
	}
}
