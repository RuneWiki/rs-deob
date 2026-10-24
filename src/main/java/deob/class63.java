package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.c")
	public static int field942;

	@ObfuscatedName("kc.d")
	public static class63[] field943;

	@ObfuscatedName("kc.e")
	public int field944;

	@ObfuscatedName("kc.f")
	public int field945 = -1;

	@ObfuscatedName("kc.g")
	public boolean field946 = false;

	@ObfuscatedName("kc.h")
	public boolean field947 = true;

	@ObfuscatedName("kc.i")
	public String field948;

	@ObfuscatedName("kc.j")
	public int field949;

	@ObfuscatedName("kc.k")
	public int field950;

	@ObfuscatedName("kc.l")
	public int field951;

	@ObfuscatedName("kc.m")
	public int field952;

	@ObfuscatedName("kc.n")
	public int field953;

	@ObfuscatedName("kc.o")
	public int field954;

	@ObfuscatedName("kc.a(ILyb;)V")
	public static void method371(class51 arg0) {
		class39 var1 = new class39(arg0.method308("flo.dat", null));
		field942 = var1.method240();
		if (field943 == null) {
			field943 = new class63[field942];
		}

		for (int var2 = 0; var2 < field942; var2++) {
			if (field943[var2] == null) {
				field943[var2] = new class63();
			}

			field943[var2].method372(var1);
		}
	}

	@ObfuscatedName("kc.a(Lmb;I)V")
	public void method372(class39 arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field944 = arg0.method242();
				method373(field944);
			} else if (var2 == 2) {
				field945 = arg0.method238();
			} else if (var2 == 3) {
				field946 = true;
			} else if (var2 == 5) {
				field947 = false;
			} else if (var2 == 6) {
				field948 = arg0.method245();
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
		field949 = (int) (var12 * 256.0D);
		field950 = (int) (var14 * 256.0D);
		field951 = (int) (var16 * 256.0D);

		if (field950 < 0) {
			field950 = 0;
		} else if (field950 > 255) {
			field950 = 255;
		}

		if (field951 < 0) {
			field951 = 0;
		} else if (field951 > 255) {
			field951 = 255;
		}

		if (var16 > 0.5D) {
			field953 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field953 = (int) (var14 * var16 * 512.0D);
		}

		if (field953 < 1) {
			field953 = 1;
		}

		field952 = (int) (field953 * var12);
		int var18 = field949 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field950 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field951 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field954 = method374(var18, var19, var20);
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
