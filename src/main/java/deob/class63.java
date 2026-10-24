package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.b")
	public static int field948;

	@ObfuscatedName("kc.c")
	public static class63[] field949;

	@ObfuscatedName("kc.d")
	public int field950;

	@ObfuscatedName("kc.e")
	public int field951 = -1;

	@ObfuscatedName("kc.f")
	public boolean field952 = false;

	@ObfuscatedName("kc.g")
	public boolean field953 = true;

	@ObfuscatedName("kc.h")
	public String field954;

	@ObfuscatedName("kc.i")
	public int field955;

	@ObfuscatedName("kc.j")
	public int field956;

	@ObfuscatedName("kc.k")
	public int field957;

	@ObfuscatedName("kc.l")
	public int field958;

	@ObfuscatedName("kc.m")
	public int field959;

	@ObfuscatedName("kc.n")
	public int field960;

	@ObfuscatedName("kc.a(ILxb;)V")
	public static void method364(class50 arg0) {
		class38 var1 = new class38(arg0.method294("flo.dat", null));
		field948 = var1.method226();
		if (field949 == null) {
			field949 = new class63[field948];
		}

		for (int var2 = 0; var2 < field948; var2++) {
			if (field949[var2] == null) {
				field949[var2] = new class63();
			}

			field949[var2].method365(var1);
		}
	}

	@ObfuscatedName("kc.a(Llb;I)V")
	public void method365(class38 arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field950 = arg0.method228();
				method366(field950);
			} else if (var2 == 2) {
				field951 = arg0.method224();
			} else if (var2 == 3) {
				field952 = true;
			} else if (var2 == 5) {
				field953 = false;
			} else if (var2 == 6) {
				field954 = arg0.method231();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public void method366(int arg0) {
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
		field955 = (int) (var12 * 256.0D);
		field956 = (int) (var14 * 256.0D);
		field957 = (int) (var16 * 256.0D);

		if (field956 < 0) {
			field956 = 0;
		} else if (field956 > 255) {
			field956 = 255;
		}

		if (field957 < 0) {
			field957 = 0;
		} else if (field957 > 255) {
			field957 = 255;
		}

		if (var16 > 0.5D) {
			field959 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field959 = (int) (var14 * var16 * 512.0D);
		}

		if (field959 < 1) {
			field959 = 1;
		}

		field958 = (int) (field959 * var12);
		int var18 = field955 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field956 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field957 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field960 = method367(var18, var19, var20);
	}

	@ObfuscatedName("kc.a(III)I")
	public final int method367(int arg0, int arg1, int arg2) {
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
