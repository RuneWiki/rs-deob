package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.d")
	public static int field892;

	@ObfuscatedName("jc.e")
	public static class62[] field893;

	@ObfuscatedName("jc.f")
	public int field894;

	@ObfuscatedName("jc.g")
	public int[] field895;

	@ObfuscatedName("jc.h")
	public int[] field896;

	@ObfuscatedName("jc.i")
	public int[] field897;

	@ObfuscatedName("jc.j")
	public int field898 = -1;

	@ObfuscatedName("jc.k")
	public int[] field899;

	@ObfuscatedName("jc.l")
	public boolean field900 = false;

	@ObfuscatedName("jc.m")
	public int field901 = 5;

	@ObfuscatedName("jc.n")
	public int field902 = -1;

	@ObfuscatedName("jc.o")
	public int field903 = -1;

	@ObfuscatedName("jc.p")
	public int field904 = 99;

	@ObfuscatedName("jc.a(ILub;)V")
	public static void method317(class47 arg0) {
		class37 var1 = new class37(arg0.method249("seq.dat", null));
		field892 = var1.method210();
		if (field893 == null) {
			field893 = new class62[field892];
		}

		for (int var2 = 0; var2 < field892; var2++) {
			if (field893[var2] == null) {
				field893[var2] = new class62();
			}

			field893[var2].method318(var1);
		}
	}

	@ObfuscatedName("jc.a(BLkb;)V")
	public void method318(class37 arg0) {
		while (true) {
			int var2 = arg0.method208();
			if (var2 == 0) {
				if (field894 == 0) {
					field894 = 1;
					field895 = new int[1];
					field895[0] = -1;
					field896 = new int[1];
					field896[0] = -1;
					field897 = new int[1];
					field897[0] = -1;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field894 = arg0.method208();
				field895 = new int[field894];
				field896 = new int[field894];
				field897 = new int[field894];
				for (int var3 = 0; var3 < field894; var3++) {
					field895[var3] = arg0.method210();
					field896[var3] = arg0.method210();
					if (field896[var3] == 0xFFFF) {
						field896[var3] = -1;
					}

					field897[var3] = arg0.method210();
					if (field897[var3] == 0) {
						field897[var3] = class7.field70[field895[var3]].field71;
					}

					if (field897[var3] == 0) {
						field897[var3] = 1;
					}
				}
			} else if (var2 == 2) {
				field898 = arg0.method210();
			} else if (var2 == 3) {
				int var4 = arg0.method208();
				field899 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field899[var5] = arg0.method208();
				}

				field899[var4] = 9999999;
			} else if (var2 == 4) {
				field900 = true;
			} else if (var2 == 5) {
				field901 = arg0.method208();
			} else if (var2 == 6) {
				field902 = arg0.method210();
			} else if (var2 == 7) {
				field903 = arg0.method210();
			} else if (var2 == 8) {
				field904 = arg0.method208();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
