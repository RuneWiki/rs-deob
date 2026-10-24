package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.e")
	public static int field907;

	@ObfuscatedName("kc.f")
	public static class63[] field908;

	@ObfuscatedName("kc.g")
	public int field909;

	@ObfuscatedName("kc.h")
	public int field910;

	@ObfuscatedName("kc.i")
	public class62 field911;

	@ObfuscatedName("kc.j")
	public boolean field912 = false;

	@ObfuscatedName("kc.k")
	public int[] field913 = new int[6];

	@ObfuscatedName("kc.l")
	public int[] field914 = new int[6];

	@ObfuscatedName("kc.m")
	public int field915 = 128;

	@ObfuscatedName("kc.n")
	public int field916 = 128;

	@ObfuscatedName("kc.o")
	public int field917;

	@ObfuscatedName("kc.p")
	public int field918;

	@ObfuscatedName("kc.q")
	public int field919;

	@ObfuscatedName("kc.r")
	public static class19 field920 = new class19(30);

	@ObfuscatedName("kc.a(ILub;)V")
	public static void method320(class47 arg0) {
		class37 var1 = new class37(arg0.method250("spotanim.dat", null));
		field907 = var1.method211();
		if (field908 == null) {
			field908 = new class63[field907];
		}

		for (int var2 = 0; var2 < field907; var2++) {
			if (field908[var2] == null) {
				field908[var2] = new class63();
			}

			field908[var2].field909 = var2;
			field908[var2].method321(var1);
		}
	}

	@ObfuscatedName("kc.a(BLkb;)V")
	public void method321(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field910 = arg0.method211();
			} else if (var2 == 2) {
				field911 = class62.field895[arg0.method211()];
			} else if (var2 == 3) {
				field912 = true;
			} else if (var2 == 4) {
				field915 = arg0.method211();
			} else if (var2 == 5) {
				field916 = arg0.method211();
			} else if (var2 == 6) {
				field917 = arg0.method211();
			} else if (var2 == 7) {
				field918 = arg0.method209();
			} else if (var2 == 8) {
				field919 = arg0.method209();
			} else if (var2 >= 40 && var2 < 50) {
				field913[var2 - 40] = arg0.method211();
			} else if (var2 >= 50 && var2 < 60) {
				field914[var2 - 50] = arg0.method211();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a()Leb;")
	public class31 method322() {
		class31 var1 = (class31) field920.method102(field909);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = new class31(field910);
		for (int var3 = 0; var3 < 6; var3++) {
			if (field913[0] != 0) {
				var2.method133(field913[var3], field914[var3]);
			}
		}

		field920.method103(var2, field909);
		return var2;
	}
}
