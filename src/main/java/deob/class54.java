package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.b")
	public static int field741;

	@ObfuscatedName("bc.c")
	public static class54[] field742;

	@ObfuscatedName("bc.d")
	public int field743;

	@ObfuscatedName("bc.e")
	public int field744 = -1;

	@ObfuscatedName("bc.f")
	public boolean field745 = false;

	@ObfuscatedName("bc.g")
	public boolean field746 = true;

	@ObfuscatedName("bc.h")
	public String field747;

	@ObfuscatedName("bc.i")
	public int field748;

	@ObfuscatedName("bc.j")
	public int field749;

	@ObfuscatedName("bc.k")
	public int field750;

	@ObfuscatedName("bc.l")
	public int field751;

	@ObfuscatedName("bc.m")
	public int field752;

	@ObfuscatedName("bc.a(Ltb;I)V")
	public static void method268(class46 arg0) {
		class36 var1 = new class36(arg0.method225(null, "flo.dat"));
		field741 = var1.method187();
		if (field742 == null) {
			field742 = new class54[field741];
		}

		for (int var2 = 0; var2 < field741; var2++) {
			if (field742[var2] == null) {
				field742[var2] = new class54();
			}

			field742[var2].method269(var1);
		}
	}

	@ObfuscatedName("bc.a(BLjb;)V")
	public void method269(class36 arg0) {
		while (true) {
			int var2 = arg0.method185();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field743 = arg0.method189();
				method270(field743);
			} else if (var2 == 2) {
				field744 = arg0.method185();
			} else if (var2 == 3) {
				field745 = true;
			} else if (var2 == 5) {
				field746 = false;
			} else if (var2 == 6) {
				field747 = arg0.method192();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("bc.a(II)V")
	public void method270(int arg0) {
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
		field748 = (int) (var12 * 256.0D);
		field749 = (int) (var14 * 256.0D);
		field750 = (int) (var16 * 256.0D);

		if (field749 < 0) {
			field749 = 0;
		} else if (field749 > 255) {
			field749 = 255;
		}

		if (field750 < 0) {
			field750 = 0;
		} else if (field750 > 255) {
			field750 = 255;
		}

		if (var16 > 0.5D) {
			field752 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field752 = (int) (var14 * var16 * 512.0D);
		}

		if (field752 < 1) {
			field752 = 1;
		}

		field751 = (int) (field752 * var12);
	}
}
