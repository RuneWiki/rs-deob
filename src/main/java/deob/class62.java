package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.c")
	public static int field894;

	@ObfuscatedName("jc.d")
	public static class62[] field895;

	@ObfuscatedName("jc.e")
	public int field896;

	@ObfuscatedName("jc.f")
	public int[] field897;

	@ObfuscatedName("jc.g")
	public int[] field898;

	@ObfuscatedName("jc.h")
	public int[] field899;

	@ObfuscatedName("jc.i")
	public int field900 = -1;

	@ObfuscatedName("jc.j")
	public int[] field901;

	@ObfuscatedName("jc.k")
	public boolean field902 = false;

	@ObfuscatedName("jc.l")
	public int field903 = 5;

	@ObfuscatedName("jc.m")
	public int field904 = -1;

	@ObfuscatedName("jc.n")
	public int field905 = -1;

	@ObfuscatedName("jc.o")
	public int field906 = 99;

	@ObfuscatedName("jc.a(ILub;)V")
	public static void method318(class47 arg0) {
		class37 var1 = new class37(arg0.method250("seq.dat", null));
		field894 = var1.method211();
		if (field895 == null) {
			field895 = new class62[field894];
		}

		for (int var2 = 0; var2 < field894; var2++) {
			if (field895[var2] == null) {
				field895[var2] = new class62();
			}

			field895[var2].method319(var1);
		}
	}

	@ObfuscatedName("jc.a(BLkb;)V")
	public void method319(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				if (field896 == 0) {
					field896 = 1;
					field897 = new int[1];
					field897[0] = -1;
					field898 = new int[1];
					field898[0] = -1;
					field899 = new int[1];
					field899[0] = -1;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field896 = arg0.method209();
				field897 = new int[field896];
				field898 = new int[field896];
				field899 = new int[field896];
				for (int var3 = 0; var3 < field896; var3++) {
					field897[var3] = arg0.method211();
					field898[var3] = arg0.method211();
					if (field898[var3] == 0xFFFF) {
						field898[var3] = -1;
					}

					field899[var3] = arg0.method211();
					if (field899[var3] == 0) {
						field899[var3] = class7.field70[field897[var3]].field71;
					}

					if (field899[var3] == 0) {
						field899[var3] = 1;
					}
				}
			} else if (var2 == 2) {
				field900 = arg0.method211();
			} else if (var2 == 3) {
				int var4 = arg0.method209();
				field901 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field901[var5] = arg0.method209();
				}

				field901[var4] = 9999999;
			} else if (var2 == 4) {
				field902 = true;
			} else if (var2 == 5) {
				field903 = arg0.method209();
			} else if (var2 == 6) {
				field904 = arg0.method211();
			} else if (var2 == 7) {
				field905 = arg0.method211();
			} else if (var2 == 8) {
				field906 = arg0.method209();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
