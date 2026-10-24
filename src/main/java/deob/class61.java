package deob;

@ObfuscatedName("ic")
public class class61 {

	@ObfuscatedName("ic.b")
	public static int field864;

	@ObfuscatedName("ic.c")
	public static class61[] field865;

	@ObfuscatedName("ic.d")
	public static int field866;

	@ObfuscatedName("ic.e")
	public static int[] field867;

	@ObfuscatedName("ic.f")
	public String field868;

	@ObfuscatedName("ic.g")
	public int field869;

	@ObfuscatedName("ic.h")
	public int field870;

	@ObfuscatedName("ic.i")
	public boolean field871 = false;

	@ObfuscatedName("ic.j")
	public boolean field872 = true;

	@ObfuscatedName("ic.k")
	public int field873;

	@ObfuscatedName("ic.a(ZLub;)V")
	public static void method300(class47 arg0) {
		class37 var1 = new class37(arg0.method242(null, "varp.dat"));
		field866 = 0;
		field864 = var1.method203();
		if (field865 == null) {
			field865 = new class61[field864];
		}

		if (field867 == null) {
			field867 = new int[field864];
		}

		for (int var2 = 0; var2 < field864; var2++) {
			if (field865[var2] == null) {
				field865[var2] = new class61();
			}

			field865[var2].method301(var2, var1);
		}
	}

	@ObfuscatedName("ic.a(ILkb;Z)V")
	public void method301(int arg0, class37 arg1) {
		while (true) {
			int var3 = arg1.method201();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field869 = arg1.method201();
			} else if (var3 == 2) {
				field870 = arg1.method201();
			} else if (var3 == 3) {
				field871 = true;
				field867[field866++] = arg0;
			} else if (var3 == 4) {
				field872 = false;
			} else if (var3 == 5) {
				field873 = arg1.method203();
			} else if (var3 == 10) {
				field868 = arg1.method208();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
