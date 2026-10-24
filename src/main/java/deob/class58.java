package deob;

@ObfuscatedName("fc")
public class class58 {

	@ObfuscatedName("fc.b")
	public static int field814;

	@ObfuscatedName("fc.c")
	public static class58[] field815;

	@ObfuscatedName("fc.d")
	public int field816;

	@ObfuscatedName("fc.e")
	public int field817 = -1;

	@ObfuscatedName("fc.f")
	public boolean field818 = false;

	@ObfuscatedName("fc.g")
	public boolean field819 = true;

	@ObfuscatedName("fc.h")
	public String field820;

	@ObfuscatedName("fc.i")
	public int field821;

	@ObfuscatedName("fc.j")
	public int field822;

	@ObfuscatedName("fc.k")
	public int field823;

	@ObfuscatedName("fc.l")
	public int field824;

	@ObfuscatedName("fc.m")
	public int field825;

	@ObfuscatedName("fc.n")
	public int field826;

	@ObfuscatedName("fc.a(ZLub;)V")
	public static void method314(class47 arg0) {
		class37 var1 = new class37(arg0.method257(null, "flo.dat"));
		field814 = var1.method218();
		if (field815 == null) {
			field815 = new class58[field814];
		}

		for (int var2 = 0; var2 < field814; var2++) {
			if (field815[var2] == null) {
				field815[var2] = new class58();
			}

			field815[var2].method315(var1);
		}
	}

	@ObfuscatedName("fc.a(Lkb;Z)V")
	public void method315(class37 arg0) {
		while (true) {
			int var2 = arg0.method216();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field816 = arg0.method220();
				method316(field816);
			} else if (var2 == 2) {
				field817 = arg0.method216();
			} else if (var2 == 3) {
				field818 = true;
			} else if (var2 == 5) {
				field819 = false;
			} else if (var2 == 6) {
				field820 = arg0.method223();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("fc.a(II)V")
	public void method316(int arg0) {
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
		field821 = (int) (var12 * 256.0D);
		field822 = (int) (var14 * 256.0D);
		field823 = (int) (var16 * 256.0D);

		if (field822 < 0) {
			field822 = 0;
		} else if (field822 > 255) {
			field822 = 255;
		}

		if (field823 < 0) {
			field823 = 0;
		} else if (field823 > 255) {
			field823 = 255;
		}

		if (var16 > 0.5D) {
			field825 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field825 = (int) (var14 * var16 * 512.0D);
		}

		if (field825 < 1) {
			field825 = 1;
		}

		field824 = (int) (field825 * var12);
		int var18 = field821 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field822 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field823 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field826 = method317(var18, var19, var20);
	}

	@ObfuscatedName("fc.a(III)I")
	public final int method317(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}

		if (arg2 > 192) {
			arg1 /= 2;
		}

		if (arg2 > 217) {
			arg1 /= 2;
		}

		if (arg2 > 243) {
			arg1 /= 2;
		}

		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}
}
