package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.a")
	public static int field946;

	@ObfuscatedName("kc.b")
	public static class63[] field947;

	@ObfuscatedName("kc.c")
	public int field948;

	@ObfuscatedName("kc.d")
	public int field949 = -1;

	@ObfuscatedName("kc.e")
	public boolean field950 = false;

	@ObfuscatedName("kc.f")
	public boolean field951 = true;

	@ObfuscatedName("kc.g")
	public String field952;

	@ObfuscatedName("kc.h")
	public int field953;

	@ObfuscatedName("kc.i")
	public int field954;

	@ObfuscatedName("kc.j")
	public int field955;

	@ObfuscatedName("kc.k")
	public int field956;

	@ObfuscatedName("kc.l")
	public int field957;

	@ObfuscatedName("kc.m")
	public int field958;

	@ObfuscatedName("kc.a(ZLyb;)V")
	public static void method373(class51 arg0) {
		class39 var1 = new class39(arg0.method309("flo.dat", null));
		field946 = var1.method241();
		if (field947 == null) {
			field947 = new class63[field946];
		}

		for (int var2 = 0; var2 < field946; var2++) {
			if (field947[var2] == null) {
				field947[var2] = new class63();
			}

			field947[var2].method374(var1);
		}
	}

	@ObfuscatedName("kc.a(ILmb;)V")
	public void method374(class39 arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field948 = arg0.method243();
				method375(field948);
			} else if (var2 == 2) {
				field949 = arg0.method239();
			} else if (var2 == 3) {
				field950 = true;
			} else if (var2 == 5) {
				field951 = false;
			} else if (var2 == 6) {
				field952 = arg0.method246();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(ZI)V")
	public void method375(int arg0) {
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
		field953 = (int) (var12 * 256.0D);
		field954 = (int) (var14 * 256.0D);
		field955 = (int) (var16 * 256.0D);

		if (field954 < 0) {
			field954 = 0;
		} else if (field954 > 255) {
			field954 = 255;
		}

		if (field955 < 0) {
			field955 = 0;
		} else if (field955 > 255) {
			field955 = 255;
		}

		if (var16 > 0.5D) {
			field957 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field957 = (int) (var14 * var16 * 512.0D);
		}

		if (field957 < 1) {
			field957 = 1;
		}

		field956 = (int) (field957 * var12);
		int var18 = field953 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field954 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field955 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field958 = method376(var18, var19, var20);
	}

	@ObfuscatedName("kc.a(III)I")
	public final int method376(int arg0, int arg1, int arg2) {
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
