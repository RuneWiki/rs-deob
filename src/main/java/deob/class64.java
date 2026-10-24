package deob;

@ObfuscatedName("lc")
public class class64 {

	@ObfuscatedName("lc.b")
	public static int field957;

	@ObfuscatedName("lc.c")
	public static class64[] field958;

	@ObfuscatedName("lc.d")
	public int field959;

	@ObfuscatedName("lc.e")
	public int field960 = -1;

	@ObfuscatedName("lc.f")
	public boolean field961 = false;

	@ObfuscatedName("lc.g")
	public boolean field962 = true;

	@ObfuscatedName("lc.h")
	public String field963;

	@ObfuscatedName("lc.i")
	public int field964;

	@ObfuscatedName("lc.j")
	public int field965;

	@ObfuscatedName("lc.k")
	public int field966;

	@ObfuscatedName("lc.l")
	public int field967;

	@ObfuscatedName("lc.m")
	public int field968;

	@ObfuscatedName("lc.n")
	public int field969;

	@ObfuscatedName("lc.a(ILyb;)V")
	public static void method368(class51 arg0) {
		class39 var1 = new class39(arg0.method298("flo.dat", null));
		field957 = var1.method230();
		if (field958 == null) {
			field958 = new class64[field957];
		}

		for (int var2 = 0; var2 < field957; var2++) {
			if (field958[var2] == null) {
				field958[var2] = new class64();
			}

			field958[var2].method369(var1);
		}
	}

	@ObfuscatedName("lc.a(BLmb;)V")
	public void method369(class39 arg0) {
		while (true) {
			int var2 = arg0.method228();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field959 = arg0.method232();
				method370(field959);
			} else if (var2 == 2) {
				field960 = arg0.method228();
			} else if (var2 == 3) {
				field961 = true;
			} else if (var2 == 5) {
				field962 = false;
			} else if (var2 == 6) {
				field963 = arg0.method235();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(II)V")
	public void method370(int arg0) {
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
		field964 = (int) (var12 * 256.0D);
		field965 = (int) (var14 * 256.0D);
		field966 = (int) (var16 * 256.0D);

		if (field965 < 0) {
			field965 = 0;
		} else if (field965 > 255) {
			field965 = 255;
		}

		if (field966 < 0) {
			field966 = 0;
		} else if (field966 > 255) {
			field966 = 255;
		}

		if (var16 > 0.5D) {
			field968 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field968 = (int) (var14 * var16 * 512.0D);
		}

		if (field968 < 1) {
			field968 = 1;
		}

		field967 = (int) (field968 * var12);
		int var18 = field964 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field965 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field966 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field969 = method371(var18, var19, var20);
	}

	@ObfuscatedName("lc.a(III)I")
	public final int method371(int arg0, int arg1, int arg2) {
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
