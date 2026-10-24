package deob;

@ObfuscatedName("fc")
public class class58 {

	@ObfuscatedName("fc.b")
	public static int field810;

	@ObfuscatedName("fc.c")
	public static class58[] field811;

	@ObfuscatedName("fc.d")
	public int field812;

	@ObfuscatedName("fc.e")
	public int field813 = -1;

	@ObfuscatedName("fc.f")
	public boolean field814 = false;

	@ObfuscatedName("fc.g")
	public boolean field815 = true;

	@ObfuscatedName("fc.h")
	public String field816;

	@ObfuscatedName("fc.i")
	public int field817;

	@ObfuscatedName("fc.j")
	public int field818;

	@ObfuscatedName("fc.k")
	public int field819;

	@ObfuscatedName("fc.l")
	public int field820;

	@ObfuscatedName("fc.m")
	public int field821;

	@ObfuscatedName("fc.a(Lub;B)V")
	public static void method307(class47 arg0) {
		class37 var1 = new class37(arg0.method250(null, "flo.dat"));
		field810 = var1.method211();
		if (field811 == null) {
			field811 = new class58[field810];
		}

		for (int var2 = 0; var2 < field810; var2++) {
			if (field811[var2] == null) {
				field811[var2] = new class58();
			}

			field811[var2].method308(var1);
		}
	}

	@ObfuscatedName("fc.a(ILkb;)V")
	public void method308(class37 arg0) {
		while (true) {
			int var2 = arg0.method209();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field812 = arg0.method213();
				method309(field812);
			} else if (var2 == 2) {
				field813 = arg0.method209();
			} else if (var2 == 3) {
				field814 = true;
			} else if (var2 == 5) {
				field815 = false;
			} else if (var2 == 6) {
				field816 = arg0.method216();
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
		field817 = (int) (var12 * 256.0D);
		field818 = (int) (var14 * 256.0D);
		field819 = (int) (var16 * 256.0D);

		if (field818 < 0) {
			field818 = 0;
		} else if (field818 > 255) {
			field818 = 255;
		}

		if (field819 < 0) {
			field819 = 0;
		} else if (field819 > 255) {
			field819 = 255;
		}

		if (var16 > 0.5D) {
			field821 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field821 = (int) (var14 * var16 * 512.0D);
		}

		if (field821 < 1) {
			field821 = 1;
		}

		field820 = (int) (field821 * var12);
	}
}
