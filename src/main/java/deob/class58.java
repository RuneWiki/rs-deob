package deob;

@ObfuscatedName("fc")
public class class58 {

	@ObfuscatedName("fc.b")
	public static int field822;

	@ObfuscatedName("fc.c")
	public static class58[] field823;

	@ObfuscatedName("fc.d")
	public int field824;

	@ObfuscatedName("fc.e")
	public int[] field825;

	@ObfuscatedName("fc.f")
	public int[] field826;

	@ObfuscatedName("fc.g")
	public int[] field827;

	@ObfuscatedName("fc.h")
	public int field828 = -1;

	@ObfuscatedName("fc.i")
	public int[] field829;

	@ObfuscatedName("fc.j")
	public int field830;

	@ObfuscatedName("fc.k")
	public int field831 = 5;

	@ObfuscatedName("fc.l")
	public int field832 = -1;

	@ObfuscatedName("fc.m")
	public int field833 = -1;

	@ObfuscatedName("fc.n")
	public int field834 = 99;

	@ObfuscatedName("fc.a(Ltb;I)V")
	public static void method279(class46 arg0) {
		class36 var1 = new class36(arg0.method225(null, "seq.dat"));
		field822 = var1.method187();
		if (field823 == null) {
			field823 = new class58[field822];
		}

		for (int var2 = 0; var2 < field822; var2++) {
			if (field823[var2] == null) {
				field823[var2] = new class58();
			}

			field823[var2].method280(var1);
		}
	}

	@ObfuscatedName("fc.a(BLjb;)V")
	public void method280(class36 arg0) {
		while (true) {
			int var2 = arg0.method185();
			if (var2 == 0) {
				if (field824 == 0) {
					field824 = 1;
					field825 = new int[1];
					field825[0] = -1;
					field826 = new int[1];
					field826[0] = -1;
					field827 = new int[1];
					field827[0] = -1;
				}

				return;
			}

			if (var2 == 1) {
				field824 = arg0.method185();
				field825 = new int[field824];
				field826 = new int[field824];
				field827 = new int[field824];
				for (int var3 = 0; var3 < field824; var3++) {
					field825[var3] = arg0.method187();
					field826[var3] = arg0.method187();
					if (field826[var3] == 0xFFFF) {
						field826[var3] = -1;
					}

					field827[var3] = arg0.method187();
					if (field827[var3] == 0) {
						field827[var3] = class6.field61[field825[var3]].field62;
					}

					if (field827[var3] == 0) {
						field827[var3] = 1;
					}
				}
			} else if (var2 == 2) {
				field828 = arg0.method187();
			} else if (var2 == 3) {
				int var4 = arg0.method185();
				field829 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field829[var5] = arg0.method185();
				}

				field829[var4] = 9999999;
			} else if (var2 == 4) {
				field830 = arg0.method187();
			} else if (var2 == 5) {
				field831 = arg0.method185();
			} else if (var2 == 6) {
				field832 = arg0.method187();
			} else if (var2 == 7) {
				field833 = arg0.method187();
			} else if (var2 == 8) {
				field834 = arg0.method185();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
