package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.b")
	public static int field900;

	@ObfuscatedName("jc.c")
	public static class62[] field901;

	@ObfuscatedName("jc.d")
	public int field902;

	@ObfuscatedName("jc.e")
	public int[] field903;

	@ObfuscatedName("jc.f")
	public int[] field904;

	@ObfuscatedName("jc.g")
	public int[] field905;

	@ObfuscatedName("jc.h")
	public int field906 = -1;

	@ObfuscatedName("jc.i")
	public int[] field907;

	@ObfuscatedName("jc.j")
	public boolean field908 = false;

	@ObfuscatedName("jc.k")
	public int field909 = 5;

	@ObfuscatedName("jc.l")
	public int field910 = -1;

	@ObfuscatedName("jc.m")
	public int field911 = -1;

	@ObfuscatedName("jc.n")
	public int field912 = 99;

	@ObfuscatedName("jc.a(Lub;I)V")
	public static void method318(class47 arg0) {
		class37 var1 = new class37(arg0.method250("seq.dat", null));
		field900 = var1.method211();
		if (field901 == null) {
			field901 = new class62[field900];
		}

		for (int var2 = 0; var2 < field900; var2++) {
			if (field901[var2] == null) {
				field901[var2] = new class62();
			}

			field901[var2].method319(var1);
		}
	}

	@ObfuscatedName("jc.a(Lkb;I)V")
	public void method319(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				if (field902 == 0) {
					field902 = 1;
					field903 = new int[1];
					field903[0] = -1;
					field904 = new int[1];
					field904[0] = -1;
					field905 = new int[1];
					field905[0] = -1;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field902 = arg0.method209();
				field903 = new int[field902];
				field904 = new int[field902];
				field905 = new int[field902];
				for (int var3 = 0; var3 < field902; var3++) {
					field903[var3] = arg0.method211();
					field904[var3] = arg0.method211();
					if (field904[var3] == 0xFFFF) {
						field904[var3] = -1;
					}

					field905[var3] = arg0.method211();
					if (field905[var3] == 0) {
						field905[var3] = class7.field71[field903[var3]].field72;
					}

					if (field905[var3] == 0) {
						field905[var3] = 1;
					}
				}
			} else if (var2 == 2) {
				field906 = arg0.method211();
			} else if (var2 == 3) {
				int var4 = arg0.method209();
				field907 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field907[var5] = arg0.method209();
				}

				field907[var4] = 9999999;
			} else if (var2 == 4) {
				field908 = true;
			} else if (var2 == 5) {
				field909 = arg0.method209();
			} else if (var2 == 6) {
				field910 = arg0.method211();
			} else if (var2 == 7) {
				field911 = arg0.method211();
			} else if (var2 == 8) {
				field912 = arg0.method209();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
