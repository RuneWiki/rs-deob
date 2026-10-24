package deob;

@ObfuscatedName("gc")
public class class59 {

	@ObfuscatedName("gc.b")
	public static int field842;

	@ObfuscatedName("gc.c")
	public static class59[] field843;

	@ObfuscatedName("gc.d")
	public int field844;

	@ObfuscatedName("gc.e")
	public int[] field845;

	@ObfuscatedName("gc.f")
	public int[] field846;

	@ObfuscatedName("gc.g")
	public int[] field847;

	@ObfuscatedName("gc.h")
	public int field848 = -1;

	@ObfuscatedName("gc.i")
	public int[] field849;

	@ObfuscatedName("gc.j")
	public int field850;

	@ObfuscatedName("gc.k")
	public int field851 = 5;

	@ObfuscatedName("gc.l")
	public int field852 = -1;

	@ObfuscatedName("gc.m")
	public int field853 = -1;

	@ObfuscatedName("gc.n")
	public int field854 = 99;

	@ObfuscatedName("gc.a(ZLub;)V")
	public static void method295(class47 arg0) {
		class37 var1 = new class37(arg0.method242(null, "seq.dat"));
		field842 = var1.method203();
		if (field843 == null) {
			field843 = new class59[field842];
		}

		for (int var2 = 0; var2 < field842; var2++) {
			if (field843[var2] == null) {
				field843[var2] = new class59();
			}

			field843[var2].method296(var1);
		}
	}

	@ObfuscatedName("gc.a(ILkb;)V")
	public void method296(class37 arg0) {
		while (true) {
			int var2 = arg0.method201();
			if (var2 == 0) {
				if (field844 == 0) {
					field844 = 1;
					field845 = new int[1];
					field845[0] = -1;
					field846 = new int[1];
					field846[0] = -1;
					field847 = new int[1];
					field847[0] = -1;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field844 = arg0.method201();
				field845 = new int[field844];
				field846 = new int[field844];
				field847 = new int[field844];
				for (int var3 = 0; var3 < field844; var3++) {
					field845[var3] = arg0.method203();
					field846[var3] = arg0.method203();
					if (field846[var3] == 0xFFFF) {
						field846[var3] = -1;
					}

					field847[var3] = arg0.method203();
					if (field847[var3] == 0) {
						field847[var3] = class7.field68[field845[var3]].field69;
					}

					if (field847[var3] == 0) {
						field847[var3] = 1;
					}
				}
			} else if (var2 == 2) {
				field848 = arg0.method203();
			} else if (var2 == 3) {
				int var4 = arg0.method201();
				field849 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field849[var5] = arg0.method201();
				}

				field849[var4] = 9999999;
			} else if (var2 == 4) {
				field850 = arg0.method203();
			} else if (var2 == 5) {
				field851 = arg0.method201();
			} else if (var2 == 6) {
				field852 = arg0.method203();
			} else if (var2 == 7) {
				field853 = arg0.method203();
			} else if (var2 == 8) {
				field854 = arg0.method201();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
