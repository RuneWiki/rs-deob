package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("DXRZIVAQ")
public class Tone {

	@ObfuscatedName("DXRZIVAQ.k")
	public int[] field580 = new int[5];

	@ObfuscatedName("DXRZIVAQ.l")
	public int[] field581 = new int[5];

	@ObfuscatedName("DXRZIVAQ.m")
	public int[] field582 = new int[5];

	@ObfuscatedName("DXRZIVAQ.o")
	public int field584 = 100;

	@ObfuscatedName("DXRZIVAQ.r")
	public int field587 = 500;

	@ObfuscatedName("DXRZIVAQ.w")
	public static int[] field592 = new int[5];

	@ObfuscatedName("DXRZIVAQ.x")
	public static int[] field593 = new int[5];

	@ObfuscatedName("DXRZIVAQ.y")
	public static int[] field594 = new int[5];

	@ObfuscatedName("DXRZIVAQ.z")
	public static int[] field595 = new int[5];

	@ObfuscatedName("DXRZIVAQ.A")
	public static int[] field596 = new int[5];

	@ObfuscatedName("DXRZIVAQ.n")
	public int field583;

	@ObfuscatedName("DXRZIVAQ.s")
	public int field588;

	@ObfuscatedName("DXRZIVAQ.c")
	public Envelope field572;

	@ObfuscatedName("DXRZIVAQ.d")
	public Envelope field573;

	@ObfuscatedName("DXRZIVAQ.e")
	public Envelope field574;

	@ObfuscatedName("DXRZIVAQ.f")
	public Envelope field575;

	@ObfuscatedName("DXRZIVAQ.g")
	public Envelope field576;

	@ObfuscatedName("DXRZIVAQ.h")
	public Envelope field577;

	@ObfuscatedName("DXRZIVAQ.i")
	public Envelope field578;

	@ObfuscatedName("DXRZIVAQ.j")
	public Envelope field579;

	@ObfuscatedName("DXRZIVAQ.q")
	public Envelope field586;

	@ObfuscatedName("DXRZIVAQ.p")
	public Filter field585;

	@ObfuscatedName("DXRZIVAQ.t")
	public static int[] field589;

	@ObfuscatedName("DXRZIVAQ.u")
	public static int[] field590;

	@ObfuscatedName("DXRZIVAQ.v")
	public static int[] field591;

	@ObfuscatedName("DXRZIVAQ.a()V")
	public static final void method186() {
		field590 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field590[var0] = 1;
			} else {
				field590[var0] = -1;
			}
		}

		field591 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field591[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field589 = new int[220500];
	}

	@ObfuscatedName("DXRZIVAQ.a(II)[I")
	public final int[] method187(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field589[var3] = 0;
		}

		if (arg1 < 10) {
			return field589;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field572.method443();
		field573.method443();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field574 != null) {
			field574.method443();
			field575.method443();
			var6 = (int) ((field574.field1167 - field574.field1166) * 32.768D / var4);
			var7 = (int) (field574.field1166 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field576 != null) {
			field576.method443();
			field577.method443();
			var9 = (int) ((field576.field1167 - field576.field1166) * 32.768D / var4);
			var10 = (int) (field576.field1166 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field580[var12] != 0) {
				field592[var12] = 0;
				field593[var12] = (int) (field582[var12] * var4);
				field594[var12] = (field580[var12] << 14) / 100;
				field595[var12] = (int) ((field572.field1167 - field572.field1166) * 32.768D * Math.pow(1.0057929410678534D, field581[var12]) / var4);
				field596[var12] = (int) (field572.field1166 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field572.method444(arg0);
			int var15 = field573.method444(arg0);

			if (field574 != null) {
				int var16 = field574.method444(arg0);
				int var17 = field575.method444(arg0);
				var14 += method188(var8, field574.field1168, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field576 != null) {
				int var18 = field576.method444(arg0);
				int var19 = field577.method444(arg0);
				var15 = var15 * ((method188(var11, field576.field1168, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field580[var20] != 0) {
					int var21 = field593[var20] + var13;
					if (var21 < arg0) {
						field589[var21] += method188(field592[var20], field572.field1168, field594[var20] * var15 >> 15);
						field592[var20] += (field595[var20] * var14 >> 16) + field596[var20];
					}
				}
			}
		}

		if (field578 != null) {
			field578.method443();
			field579.method443();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field578.method444(arg0);
				int var27 = field579.method444(arg0);
				int var28;
				if (var24) {
					var28 = ((field578.field1167 - field578.field1166) * var26 >> 8) + field578.field1166;
				} else {
					var28 = ((field578.field1167 - field578.field1166) * var27 >> 8) + field578.field1166;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field589[var25] = 0;
				}
			}
		}

		if (field583 > 0 && field584 > 0) {
			int var29 = (int) (field583 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field589[var30] += field589[var30 - var29] * field584 / 100;
			}
		}

		if (field585.field1222[0] > 0 || field585.field1222[1] > 0) {
			field586.method443();
			int var31 = field586.method444(arg0 + 1);
			int var32 = field585.method468(0, var31 / 65536.0F);
			int var33 = field585.method468(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field589[var32 + var34] * (long) Filter.field1229 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field589[var32 + var34 - var37 - 1] * (long) Filter.field1227[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field589[var34 - var38 - 1] * (long) Filter.field1227[1][var38] >> 16);
					}

					field589[var34] = var36;
					var31 = field586.method444(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field589[var32 + var34] * (long) Filter.field1229 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field589[var32 + var34 - var42 - 1] * (long) Filter.field1227[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field589[var34 - var43 - 1] * (long) Filter.field1227[1][var43] >> 16);
						}

						field589[var34] = var41;
						var31 = field586.method444(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field585.method468(0, var31 / 65536.0F);
					var33 = field585.method468(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field589[var32 + var34 - var45 - 1] * (long) Filter.field1227[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field589[var34 - var46 - 1] * (long) Filter.field1227[1][var46] >> 16);
					}

					field589[var34] = var44;
					field586.method444(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field589[var48] < -32768) {
				field589[var48] = -32768;
			}

			if (field589[var48] > 32767) {
				field589[var48] = 32767;
			}
		}

		return field589;
	}

	@ObfuscatedName("DXRZIVAQ.a(IIII)I")
	public final int method188(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field591[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field590[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("DXRZIVAQ.a(BLMFMVIYHT;)V")
	public final void method189(Packet arg0) {
		field572 = new Envelope();
		field572.method441(arg0);
		field573 = new Envelope();
		field573.method441(arg0);
		int var2 = arg0.g1();
		if (var2 != 0) {
			arg0.pos--;
			field574 = new Envelope();
			field574.method441(arg0);
			field575 = new Envelope();
			field575.method441(arg0);
		}

		int var3 = arg0.g1();
		if (var3 != 0) {
			arg0.pos--;
			field576 = new Envelope();
			field576.method441(arg0);
			field577 = new Envelope();
			field577.method441(arg0);
		}

		int var4 = arg0.g1();
		if (var4 != 0) {
			arg0.pos--;
			field578 = new Envelope();
			field578.method441(arg0);
			field579 = new Envelope();
			field579.method441(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.gsmarts();
			if (var6 == 0) {
				break;
			}

			field580[var5] = var6;
			field581[var5] = arg0.gsmart();
			field582[var5] = arg0.gsmarts();
		}

		field583 = arg0.gsmarts();
		field584 = arg0.gsmarts();
		field587 = arg0.g2();
		field588 = arg0.g2();
		field585 = new Filter();
		field586 = new Envelope();
		field585.method469(field586, arg0);
	}
}
