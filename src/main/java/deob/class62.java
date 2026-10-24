package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.b")
	public static int field915;

	@ObfuscatedName("jc.c")
	public static class62[] field916;

	@ObfuscatedName("jc.d")
	public int field917;

	@ObfuscatedName("jc.e")
	public int field918 = -1;

	@ObfuscatedName("jc.f")
	public boolean field919 = false;

	@ObfuscatedName("jc.g")
	public boolean field920 = true;

	@ObfuscatedName("jc.h")
	public String field921;

	@ObfuscatedName("jc.i")
	public int field922;

	@ObfuscatedName("jc.j")
	public int field923;

	@ObfuscatedName("jc.k")
	public int field924;

	@ObfuscatedName("jc.l")
	public int field925;

	@ObfuscatedName("jc.m")
	public int field926;

	@ObfuscatedName("jc.n")
	public int field927;

	@ObfuscatedName("jc.a(Lyb;I)V")
	public static void method362(class51 arg0) {
		class39 var1 = new class39(arg0.method299("flo.dat", null));
		field915 = var1.method233();
		if (field916 == null) {
			field916 = new class62[field915];
		}

		for (int var2 = 0; var2 < field915; var2++) {
			if (field916[var2] == null) {
				field916[var2] = new class62();
			}

			field916[var2].method363(var1);
		}
	}

	@ObfuscatedName("jc.a(ILmb;)V")
	public void method363(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field917 = arg0.method235();
				method364(field917);
			} else if (var2 == 2) {
				field918 = arg0.method231();
			} else if (var2 == 3) {
				field919 = true;
			} else if (var2 == 5) {
				field920 = false;
			} else if (var2 == 6) {
				field921 = arg0.method238();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("jc.a(IZ)V")
	public void method364(int arg0) {
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
		field922 = (int) (var12 * 256.0D);
		field923 = (int) (var14 * 256.0D);
		field924 = (int) (var16 * 256.0D);

		if (field923 < 0) {
			field923 = 0;
		} else if (field923 > 255) {
			field923 = 255;
		}

		if (field924 < 0) {
			field924 = 0;
		} else if (field924 > 255) {
			field924 = 255;
		}

		if (var16 > 0.5D) {
			field926 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field926 = (int) (var14 * var16 * 512.0D);
		}

		if (field926 < 1) {
			field926 = 1;
		}

		field925 = (int) (field926 * var12);
		int var18 = field922 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field923 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field924 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field927 = method365(var18, var19, var20);
	}

	@ObfuscatedName("jc.a(III)I")
	public final int method365(int arg0, int arg1, int arg2) {
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
