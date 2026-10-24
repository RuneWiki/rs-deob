package deob;

@ObfuscatedName("hc")
public class class60 {

	@ObfuscatedName("hc.a")
	public static int field844;

	@ObfuscatedName("hc.b")
	public static class60[] field845;

	@ObfuscatedName("hc.c")
	public static int field846;

	@ObfuscatedName("hc.d")
	public static int[] field847;

	@ObfuscatedName("hc.e")
	public String field848;

	@ObfuscatedName("hc.f")
	public int field849;

	@ObfuscatedName("hc.g")
	public int field850;

	@ObfuscatedName("hc.h")
	public boolean field851 = false;

	@ObfuscatedName("hc.i")
	public boolean field852 = true;

	@ObfuscatedName("hc.j")
	public int field853;

	@ObfuscatedName("hc.a(Ltb;I)V")
	public static void method284(class46 arg0) {
		class36 var1 = new class36(arg0.method225(null, "varp.dat"));
		field846 = 0;
		field844 = var1.method187();
		if (field845 == null) {
			field845 = new class60[field844];
		}

		if (field847 == null) {
			field847 = new int[field844];
		}

		for (int var2 = 0; var2 < field844; var2++) {
			if (field845[var2] == null) {
				field845[var2] = new class60();
			}

			field845[var2].method285(var1, var2);
		}
	}

	@ObfuscatedName("hc.a(Ljb;II)V")
	public void method285(class36 arg0, int arg1) {
		while (true) {
			int var3 = arg0.method185();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field849 = arg0.method185();
			} else if (var3 == 2) {
				field850 = arg0.method185();
			} else if (var3 == 3) {
				field851 = true;
				field847[field846++] = arg1;
			} else if (var3 == 4) {
				field852 = false;
			} else if (var3 == 5) {
				field853 = arg0.method187();
			} else if (var3 == 10) {
				field848 = arg0.method192();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
