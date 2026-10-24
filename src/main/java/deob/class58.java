package deob;

@ObfuscatedName("fc")
public class class58 {

	@ObfuscatedName("fc.c")
	public static int field808;

	@ObfuscatedName("fc.d")
	public static class58[] field809;

	@ObfuscatedName("fc.e")
	public int field810;

	@ObfuscatedName("fc.f")
	public int field811 = -1;

	@ObfuscatedName("fc.g")
	public boolean field812 = false;

	@ObfuscatedName("fc.h")
	public boolean field813 = true;

	@ObfuscatedName("fc.i")
	public String field814;

	@ObfuscatedName("fc.j")
	public int field815;

	@ObfuscatedName("fc.k")
	public int field816;

	@ObfuscatedName("fc.l")
	public int field817;

	@ObfuscatedName("fc.m")
	public int field818;

	@ObfuscatedName("fc.n")
	public int field819;

	@ObfuscatedName("fc.a(ILub;)V")
	public static void method306(class47 arg0) {
		class37 var1 = new class37(arg0.method249("flo.dat", null));
		field808 = var1.method210();
		if (field809 == null) {
			field809 = new class58[field808];
		}

		for (int var2 = 0; var2 < field808; var2++) {
			if (field809[var2] == null) {
				field809[var2] = new class58();
			}

			field809[var2].method307(var1);
		}
	}

	@ObfuscatedName("fc.a(BLkb;)V")
	public void method307(class37 arg0) {
		while (true) {
			int var2 = arg0.method208();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field810 = arg0.method212();
				method308(field810);
			} else if (var2 == 2) {
				field811 = arg0.method208();
			} else if (var2 == 3) {
				field812 = true;
			} else if (var2 == 5) {
				field813 = false;
			} else if (var2 == 6) {
				field814 = arg0.method215();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("fc.a(II)V")
	public void method308(int arg0) {
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
		field815 = (int) (var12 * 256.0D);
		field816 = (int) (var14 * 256.0D);
		field817 = (int) (var16 * 256.0D);

		if (field816 < 0) {
			field816 = 0;
		} else if (field816 > 255) {
			field816 = 255;
		}

		if (field817 < 0) {
			field817 = 0;
		} else if (field817 > 255) {
			field817 = 255;
		}

		if (var16 > 0.5D) {
			field819 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field819 = (int) (var14 * var16 * 512.0D);
		}

		if (field819 < 1) {
			field819 = 1;
		}

		field818 = (int) (field819 * var12);
	}
}
