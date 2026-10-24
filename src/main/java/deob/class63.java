package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.b")
	public static int field945;

	@ObfuscatedName("kc.c")
	public static class63[] field946;

	@ObfuscatedName("kc.d")
	public int field947;

	@ObfuscatedName("kc.e")
	public int field948 = -1;

	@ObfuscatedName("kc.f")
	public boolean field949 = false;

	@ObfuscatedName("kc.g")
	public boolean field950 = true;

	@ObfuscatedName("kc.h")
	public String field951;

	@ObfuscatedName("kc.i")
	public int field952;

	@ObfuscatedName("kc.j")
	public int field953;

	@ObfuscatedName("kc.k")
	public int field954;

	@ObfuscatedName("kc.l")
	public int field955;

	@ObfuscatedName("kc.m")
	public int field956;

	@ObfuscatedName("kc.n")
	public int field957;

	@ObfuscatedName("kc.a(ILyb;)V")
	public static void method371(class51 arg0) {
		class39 var1 = new class39(arg0.method308("flo.dat", null));
		field945 = var1.method240();
		if (field946 == null) {
			field946 = new class63[field945];
		}

		for (int var2 = 0; var2 < field945; var2++) {
			if (field946[var2] == null) {
				field946[var2] = new class63();
			}

			field946[var2].method372(var1);
		}
	}

	@ObfuscatedName("kc.a(ZLmb;)V")
	public void method372(class39 arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field947 = arg0.method242();
				method373(field947);
			} else if (var2 == 2) {
				field948 = arg0.method238();
			} else if (var2 == 3) {
				field949 = true;
			} else if (var2 == 5) {
				field950 = false;
			} else if (var2 == 6) {
				field951 = arg0.method245();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public void method373(int arg0) {
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
		field952 = (int) (var12 * 256.0D);
		field953 = (int) (var14 * 256.0D);
		field954 = (int) (var16 * 256.0D);

		if (field953 < 0) {
			field953 = 0;
		} else if (field953 > 255) {
			field953 = 255;
		}

		if (field954 < 0) {
			field954 = 0;
		} else if (field954 > 255) {
			field954 = 255;
		}

		if (var16 > 0.5D) {
			field956 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field956 = (int) (var14 * var16 * 512.0D);
		}

		if (field956 < 1) {
			field956 = 1;
		}

		field955 = (int) (field956 * var12);
		int var18 = field952 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field953 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field954 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field957 = method374(var18, var19, var20);
	}

	@ObfuscatedName("kc.a(III)I")
	public final int method374(int arg0, int arg1, int arg2) {
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
