package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.b")
	public static int field895;

	@ObfuscatedName("jc.c")
	public static class62[] field896;

	@ObfuscatedName("jc.d")
	public int field897;

	@ObfuscatedName("jc.e")
	public int[] field898;

	@ObfuscatedName("jc.f")
	public int[] field899;

	@ObfuscatedName("jc.g")
	public int[] field900;

	@ObfuscatedName("jc.h")
	public int field901 = -1;

	@ObfuscatedName("jc.i")
	public int[] field902;

	@ObfuscatedName("jc.j")
	public boolean field903 = false;

	@ObfuscatedName("jc.k")
	public int field904 = 5;

	@ObfuscatedName("jc.l")
	public int field905 = -1;

	@ObfuscatedName("jc.m")
	public int field906 = -1;

	@ObfuscatedName("jc.n")
	public int field907 = 99;

	@ObfuscatedName("jc.a(Lub;B)V")
	public static void method318(class47 arg0) {
		class37 var1 = new class37(arg0.method250(null, "seq.dat"));
		field895 = var1.method211();
		if (field896 == null) {
			field896 = new class62[field895];
		}

		for (int var2 = 0; var2 < field895; var2++) {
			if (field896[var2] == null) {
				field896[var2] = new class62();
			}

			field896[var2].method319(var1);
		}
	}

	@ObfuscatedName("jc.a(ILkb;)V")
	public void method319(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				if (field897 == 0) {
					field897 = 1;
					field898 = new int[1];
					field898[0] = -1;
					field899 = new int[1];
					field899[0] = -1;
					field900 = new int[1];
					field900[0] = -1;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field897 = arg0.method209();
				field898 = new int[field897];
				field899 = new int[field897];
				field900 = new int[field897];
				for (int var3 = 0; var3 < field897; var3++) {
					field898[var3] = arg0.method211();
					field899[var3] = arg0.method211();
					if (field899[var3] == 0xFFFF) {
						field899[var3] = -1;
					}

					field900[var3] = arg0.method211();
					if (field900[var3] == 0) {
						field900[var3] = class7.field70[field898[var3]].field71;
					}

					if (field900[var3] == 0) {
						field900[var3] = 1;
					}
				}
			} else if (var2 == 2) {
				field901 = arg0.method211();
			} else if (var2 == 3) {
				int var4 = arg0.method209();
				field902 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field902[var5] = arg0.method209();
				}

				field902[var4] = 9999999;
			} else if (var2 == 4) {
				field903 = true;
			} else if (var2 == 5) {
				field904 = arg0.method209();
			} else if (var2 == 6) {
				field905 = arg0.method211();
			} else if (var2 == 7) {
				field906 = arg0.method211();
			} else if (var2 == 8) {
				field907 = arg0.method209();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
