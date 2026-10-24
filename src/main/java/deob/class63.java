package deob;

@ObfuscatedName("kc")
public class class63 {

	@ObfuscatedName("kc.b")
	public static int field964;

	@ObfuscatedName("kc.c")
	public static class63[] field965;

	@ObfuscatedName("kc.d")
	public String field966;

	@ObfuscatedName("kc.e")
	public int field967;

	@ObfuscatedName("kc.f")
	public int field968 = -1;

	@ObfuscatedName("kc.g")
	public boolean field969 = false;

	@ObfuscatedName("kc.h")
	public boolean field970 = true;

	@ObfuscatedName("kc.i")
	public int field971;

	@ObfuscatedName("kc.j")
	public int field972;

	@ObfuscatedName("kc.k")
	public int field973;

	@ObfuscatedName("kc.l")
	public int field974;

	@ObfuscatedName("kc.m")
	public int field975;

	@ObfuscatedName("kc.n")
	public int field976;

	@ObfuscatedName("kc.a(ZLxb;)V")
	public static void method371(class50 arg0) {
		class38 var1 = new class38(arg0.method299("flo.dat", null));
		field964 = var1.method231();
		if (field965 == null) {
			field965 = new class63[field964];
		}

		for (int var2 = 0; var2 < field964; var2++) {
			if (field965[var2] == null) {
				field965[var2] = new class63();
			}

			field965[var2].method372(var1);
		}
	}

	@ObfuscatedName("kc.a(ILlb;)V")
	public void method372(class38 arg0) {
		while (true) {
			int var2 = arg0.method229();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field967 = arg0.method233();
				method373(field967);
			} else if (var2 == 2) {
				field968 = arg0.method229();
			} else if (var2 == 3) {
				field969 = true;
			} else if (var2 == 5) {
				field970 = false;
			} else if (var2 == 6) {
				field966 = arg0.method236();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("kc.a(ZI)V")
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
		field971 = (int) (var12 * 256.0D);
		field972 = (int) (var14 * 256.0D);
		field973 = (int) (var16 * 256.0D);

		if (field972 < 0) {
			field972 = 0;
		} else if (field972 > 255) {
			field972 = 255;
		}

		if (field973 < 0) {
			field973 = 0;
		} else if (field973 > 255) {
			field973 = 255;
		}

		if (var16 > 0.5D) {
			field975 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field975 = (int) (var14 * var16 * 512.0D);
		}

		if (field975 < 1) {
			field975 = 1;
		}

		field974 = (int) (field975 * var12);
		int var18 = field971 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field972 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field973 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field976 = method374(var18, var19, var20);
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
