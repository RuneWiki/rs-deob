package deob;

@ObfuscatedName("fc")
public class class58 {

	@ObfuscatedName("fc.b")
	public static int field815;

	@ObfuscatedName("fc.c")
	public static class58[] field816;

	@ObfuscatedName("fc.d")
	public int field817;

	@ObfuscatedName("fc.e")
	public int field818 = -1;

	@ObfuscatedName("fc.f")
	public boolean field819 = false;

	@ObfuscatedName("fc.g")
	public boolean field820 = true;

	@ObfuscatedName("fc.h")
	public String field821;

	@ObfuscatedName("fc.i")
	public int field822;

	@ObfuscatedName("fc.j")
	public int field823;

	@ObfuscatedName("fc.k")
	public int field824;

	@ObfuscatedName("fc.l")
	public int field825;

	@ObfuscatedName("fc.m")
	public int field826;

	@ObfuscatedName("fc.a(Lub;I)V")
	public static void method307(class47 arg0) {
		class37 var1 = new class37(arg0.method250("flo.dat", null));
		field815 = var1.method211();
		if (field816 == null) {
			field816 = new class58[field815];
		}

		for (int var2 = 0; var2 < field815; var2++) {
			if (field816[var2] == null) {
				field816[var2] = new class58();
			}

			field816[var2].method308(var1);
		}
	}

	@ObfuscatedName("fc.a(Lkb;I)V")
	public void method308(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field817 = arg0.method213();
				method309(field817);
			} else if (var2 == 2) {
				field818 = arg0.method209();
			} else if (var2 == 3) {
				field819 = true;
			} else if (var2 == 5) {
				field820 = false;
			} else if (var2 == 6) {
				field821 = arg0.method216();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("fc.a(IB)V")
	public void method309(int arg0) {
		double var2 = (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		field822 = (int) (var12 * 256.0D);
		field823 = (int) (var14 * 256.0D);
		field824 = (int) (var16 * 256.0D);

		if (field823 < 0) {
			field823 = 0;
		} else if (field823 > 255) {
			field823 = 255;
		}

		if (field824 < 0) {
			field824 = 0;
		} else if (field824 > 255) {
			field824 = 255;
		}

		if (var16 > 0.5D) {
			field826 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field826 = (int) (var14 * var16 * 512.0D);
		}

		if (field826 < 1) {
			field826 = 1;
		}

		field825 = (int) (field826 * var12);
	}
}
