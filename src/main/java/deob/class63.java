package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.b")
	public static int field951;

	@ObfuscatedName("kc.c")
	public static class63[] field952;

	@ObfuscatedName("kc.d")
	public String field953;

	@ObfuscatedName("kc.e")
	public int field954;

	@ObfuscatedName("kc.f")
	public int field955 = -1;

	@ObfuscatedName("kc.g")
	public boolean field956 = false;

	@ObfuscatedName("kc.h")
	public boolean field957 = true;

	@ObfuscatedName("kc.i")
	public int field958;

	@ObfuscatedName("kc.j")
	public int field959;

	@ObfuscatedName("kc.k")
	public int field960;

	@ObfuscatedName("kc.l")
	public int field961;

	@ObfuscatedName("kc.m")
	public int field962;

	@ObfuscatedName("kc.n")
	public int field963;

	@ObfuscatedName("kc.a(Lxb;I)V")
	public static void method365(class50 arg0) {
		class38 var1 = new class38(arg0.method295("flo.dat", null));
		field951 = var1.method227();
		if (field952 == null) {
			field952 = new class63[field951];
		}

		for (int var2 = 0; var2 < field951; var2++) {
			if (field952[var2] == null) {
				field952[var2] = new class63();
			}

			field952[var2].method366(var1);
		}
	}

	@ObfuscatedName("kc.a(Llb;B)V")
	public void method366(class38 arg0) {
		while (true) {
			int var2 = arg0.method225();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field954 = arg0.method229();
				method367(field954);
			} else if (var2 == 2) {
				field955 = arg0.method225();
			} else if (var2 == 3) {
				field956 = true;
			} else if (var2 == 5) {
				field957 = false;
			} else if (var2 == 6) {
				field953 = arg0.method232();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(II)V")
	public void method367(int arg0) {
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
		field958 = (int) (var12 * 256.0D);
		field959 = (int) (var14 * 256.0D);
		field960 = (int) (var16 * 256.0D);

		if (field959 < 0) {
			field959 = 0;
		} else if (field959 > 255) {
			field959 = 255;
		}

		if (field960 < 0) {
			field960 = 0;
		} else if (field960 > 255) {
			field960 = 255;
		}

		if (var16 > 0.5D) {
			field962 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field962 = (int) (var14 * var16 * 512.0D);
		}

		if (field962 < 1) {
			field962 = 1;
		}

		field961 = (int) (field962 * var12);
		int var18 = field958 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field959 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field960 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field963 = method368(var18, var19, var20);
	}

	@ObfuscatedName("kc.a(III)I")
	public final int method368(int arg0, int arg1, int arg2) {
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
