package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.a")
	public static int field912;

	@ObfuscatedName("jc.b")
	public static class62[] field913;

	@ObfuscatedName("jc.c")
	public int field914;

	@ObfuscatedName("jc.d")
	public int field915 = -1;

	@ObfuscatedName("jc.e")
	public boolean field916 = false;

	@ObfuscatedName("jc.f")
	public boolean field917 = true;

	@ObfuscatedName("jc.g")
	public String field918;

	@ObfuscatedName("jc.h")
	public int field919;

	@ObfuscatedName("jc.i")
	public int field920;

	@ObfuscatedName("jc.j")
	public int field921;

	@ObfuscatedName("jc.k")
	public int field922;

	@ObfuscatedName("jc.l")
	public int field923;

	@ObfuscatedName("jc.m")
	public int field924;

	@ObfuscatedName("jc.a(Lyb;B)V")
	public static void method358(class51 arg0) {
		class39 var1 = new class39(arg0.method295("flo.dat", null));
		field912 = var1.method233();
		if (field913 == null) {
			field913 = new class62[field912];
		}

		for (int var2 = 0; var2 < field912; var2++) {
			if (field913[var2] == null) {
				field913[var2] = new class62();
			}

			field913[var2].method359(var1);
		}
	}

	@ObfuscatedName("jc.a(ZLmb;)V")
	public void method359(class39 arg0) {
		while (true) {
			int var2 = arg0.method231();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field914 = arg0.method235();
				method360(field914);
			} else if (var2 == 2) {
				field915 = arg0.method231();
			} else if (var2 == 3) {
				field916 = true;
			} else if (var2 == 5) {
				field917 = false;
			} else if (var2 == 6) {
				field918 = arg0.method238();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("jc.a(IB)V")
	public void method360(int arg0) {
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
		field919 = (int) (var12 * 256.0D);
		field920 = (int) (var14 * 256.0D);
		field921 = (int) (var16 * 256.0D);

		if (field920 < 0) {
			field920 = 0;
		} else if (field920 > 255) {
			field920 = 255;
		}

		if (field921 < 0) {
			field921 = 0;
		} else if (field921 > 255) {
			field921 = 255;
		}

		if (var16 > 0.5D) {
			field923 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field923 = (int) (var14 * var16 * 512.0D);
		}

		if (field923 < 1) {
			field923 = 1;
		}

		field922 = (int) (field923 * var12);
		int var18 = field919 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field920 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field921 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field924 = method361(var18, var19, var20);
	}

	@ObfuscatedName("jc.a(III)I")
	public final int method361(int arg0, int arg1, int arg2) {
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
