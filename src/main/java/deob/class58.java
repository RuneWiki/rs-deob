package deob;

@ObfuscatedName("fc")
public class class58 {

	@ObfuscatedName("fc.c")
	public static int field809;

	@ObfuscatedName("fc.d")
	public static class58[] field810;

	@ObfuscatedName("fc.e")
	public int field811;

	@ObfuscatedName("fc.f")
	public int field812 = -1;

	@ObfuscatedName("fc.g")
	public boolean field813 = false;

	@ObfuscatedName("fc.h")
	public boolean field814 = true;

	@ObfuscatedName("fc.i")
	public String field815;

	@ObfuscatedName("fc.j")
	public int field816;

	@ObfuscatedName("fc.k")
	public int field817;

	@ObfuscatedName("fc.l")
	public int field818;

	@ObfuscatedName("fc.m")
	public int field819;

	@ObfuscatedName("fc.n")
	public int field820;

	@ObfuscatedName("fc.a(ILub;)V")
	public static void method307(class47 arg0) {
		class37 var1 = new class37(arg0.method250(null, "flo.dat"));
		field809 = var1.method211();
		if (field810 == null) {
			field810 = new class58[field809];
		}

		for (int var2 = 0; var2 < field809; var2++) {
			if (field810[var2] == null) {
				field810[var2] = new class58();
			}

			field810[var2].method308(var1);
		}
	}

	@ObfuscatedName("fc.a(Lkb;B)V")
	public void method308(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field811 = arg0.method213();
				method309(field811);
			} else if (var2 == 2) {
				field812 = arg0.method209();
			} else if (var2 == 3) {
				field813 = true;
			} else if (var2 == 5) {
				field814 = false;
			} else if (var2 == 6) {
				field815 = arg0.method216();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("fc.a(II)V")
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
		field816 = (int) (var12 * 256.0D);
		field817 = (int) (var14 * 256.0D);
		field818 = (int) (var16 * 256.0D);

		if (field817 < 0) {
			field817 = 0;
		} else if (field817 > 255) {
			field817 = 255;
		}

		if (field818 < 0) {
			field818 = 0;
		} else if (field818 > 255) {
			field818 = 255;
		}

		if (var16 > 0.5D) {
			field820 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field820 = (int) (var14 * var16 * 512.0D);
		}

		if (field820 < 1) {
			field820 = 1;
		}

		field819 = (int) (field820 * var12);
	}
}
