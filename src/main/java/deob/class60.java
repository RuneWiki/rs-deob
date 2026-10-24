package deob;

@ObfuscatedName("hc")
public class class60 {

	@ObfuscatedName("hc.a")
	public static int field855;

	@ObfuscatedName("hc.b")
	public static class60[] field856;

	@ObfuscatedName("hc.c")
	public int field857;

	@ObfuscatedName("hc.d")
	public int field858;

	@ObfuscatedName("hc.e")
	public class59 field859;

	@ObfuscatedName("hc.f")
	public boolean field860 = false;

	@ObfuscatedName("hc.g")
	public int[] field861 = new int[6];

	@ObfuscatedName("hc.h")
	public int[] field862 = new int[6];

	@ObfuscatedName("hc.i")
	public static class19 field863 = new class19(30);

	@ObfuscatedName("hc.a(ZLub;)V")
	public static void method297(class47 arg0) {
		class37 var1 = new class37(arg0.method242(null, "spotanim.dat"));
		field855 = var1.method203();
		if (field856 == null) {
			field856 = new class60[field855];
		}

		for (int var2 = 0; var2 < field855; var2++) {
			if (field856[var2] == null) {
				field856[var2] = new class60();
			}

			field856[var2].field857 = var2;
			field856[var2].method298(var1);
		}
	}

	@ObfuscatedName("hc.a(ILkb;)V")
	public void method298(class37 arg0) {
		while (true) {
			int var2 = arg0.method201();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field858 = arg0.method203();
			} else if (var2 == 2) {
				field859 = class59.field843[arg0.method203()];
			} else if (var2 == 3) {
				field860 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field861[var2 - 40] = arg0.method203();
			} else if (var2 >= 50 && var2 < 60) {
				field862[var2 - 50] = arg0.method203();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("hc.a()Leb;")
	public class31 method299() {
		class31 var1 = (class31) field863.method99(field857);
		if (var1 != null) {
			return var1;
		}

		class31 var2 = new class31(field858);
		for (int var3 = 0; var3 < 6; var3++) {
			if (field861[0] != 0) {
				var2.method129(field861[var3], field862[var3]);
			}
		}

		field863.method100(field857, var2);
		return var2;
	}
}
