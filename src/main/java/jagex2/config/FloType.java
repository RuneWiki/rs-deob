package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("FZFOSJCE")
public class FloType {

	@ObfuscatedName("FZFOSJCE.h")
	public int field700 = -1;

	@ObfuscatedName("FZFOSJCE.i")
	public boolean field701 = false;

	@ObfuscatedName("FZFOSJCE.j")
	public boolean field702 = true;

	@ObfuscatedName("FZFOSJCE.d")
	public static int field696;

	@ObfuscatedName("FZFOSJCE.g")
	public int field699;

	@ObfuscatedName("FZFOSJCE.k")
	public int field703;

	@ObfuscatedName("FZFOSJCE.l")
	public int field704;

	@ObfuscatedName("FZFOSJCE.m")
	public int field705;

	@ObfuscatedName("FZFOSJCE.n")
	public int field706;

	@ObfuscatedName("FZFOSJCE.o")
	public int field707;

	@ObfuscatedName("FZFOSJCE.p")
	public int field708;

	@ObfuscatedName("FZFOSJCE.f")
	public String field698;

	@ObfuscatedName("FZFOSJCE.e")
	public static FloType[] field697;

	@ObfuscatedName("FZFOSJCE.a(LATJMVOZR;I)V")
	public static void method216(Jagfile arg0) {
		Packet var1 = new Packet(arg0.method2("flo.dat", null));
		field696 = var1.g2();
		if (field697 == null) {
			field697 = new FloType[field696];
		}

		for (int var2 = 0; var2 < field696; var2++) {
			if (field697[var2] == null) {
				field697[var2] = new FloType();
			}

			field697[var2].method217(var1);
		}
	}

	@ObfuscatedName("FZFOSJCE.a(BLMFMVIYHT;)V")
	public void method217(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field699 = arg0.g3();
				method218(field699);
			} else if (var2 == 2) {
				field700 = arg0.g1();
			} else if (var2 == 3) {
				field701 = true;
			} else if (var2 == 5) {
				field702 = false;
			} else if (var2 == 6) {
				field698 = arg0.gjstr();
			} else if (var2 == 7) {
				int var3 = field703;
				int var4 = field704;
				int var5 = field705;
				int var6 = field706;
				int var7 = arg0.g3();
				method218(var7);
				field703 = var3;
				field704 = var4;
				field705 = var5;
				field706 = var6;
				field707 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FZFOSJCE.a(ZI)V")
	public void method218(int arg0) {
		if (arg0 == 0xFF00FF) {
			arg0 = 0;
		}

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
		field703 = (int) (var12 * 256.0D);
		field704 = (int) (var14 * 256.0D);
		field705 = (int) (var16 * 256.0D);

		if (field704 < 0) {
			field704 = 0;
		} else if (field704 > 255) {
			field704 = 255;
		}

		if (field705 < 0) {
			field705 = 0;
		} else if (field705 > 255) {
			field705 = 255;
		}

		if (var16 > 0.5D) {
			field707 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field707 = (int) (var14 * var16 * 512.0D);
		}

		if (field707 < 1) {
			field707 = 1;
		}

		field706 = (int) (field707 * var12);
		int var18 = field703 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field704 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field705 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field708 = method219(var18, var19, var20);
	}

	@ObfuscatedName("FZFOSJCE.a(III)I")
	public final int method219(int arg0, int arg1, int arg2) {
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
