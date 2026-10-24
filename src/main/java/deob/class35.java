package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("ib")
public final class class35 extends class33 {

	@ObfuscatedName("ib.C")
	public int[] field592;

	@ObfuscatedName("ib.H")
	public int field597;

	@ObfuscatedName("ib.D")
	public int field593;

	@ObfuscatedName("ib.I")
	public int field598;

	@ObfuscatedName("ib.E")
	public int field594;

	@ObfuscatedName("ib.G")
	public int field596;

	@ObfuscatedName("ib.F")
	public int field595;

	public class35(int arg0, int arg1) {
		field592 = new int[arg0 * arg1];
		field593 = field597 = arg0;
		field594 = field598 = arg1;
		field595 = field596 = 0;
	}

	public class35(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field593 = var3.getWidth(arg1);
			field594 = var3.getHeight(arg1);
			field597 = field593;
			field598 = field594;
			field595 = 0;
			field596 = 0;
			field592 = new int[field594 * field593];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field593, field594, field592, 0, field593);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class35(class50 arg0, String arg1, int arg2) {
		class38 var4 = new class38(arg0.method295(arg1 + ".dat", null));
		class38 var5 = new class38(arg0.method295("index.dat", null));
		var5.field617 = var4.method227();
		field597 = var5.method227();
		field598 = var5.method227();
		int var6 = var5.method225();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method229();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field617 += 2;
			var4.field617 += var5.method227() * var5.method227();
			var5.field617++;
		}

		field595 = var5.method225();
		field596 = var5.method225();
		field593 = var5.method227();
		field594 = var5.method227();
		int var10 = var5.method225();
		int var11 = field594 * field593;
		field592 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field592[var12] = var7[var4.method225()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field593; var13++) {
				for (int var14 = 0; var14 < field594; var14++) {
					field592[field593 * var14 + var13] = var7[var4.method225()];
				}
			}
		}
	}

	@ObfuscatedName("ib.a(I)V")
	public void method180() {
		class33.method151(field593, field594, field592);
	}

	@ObfuscatedName("ib.a(IIZI)V")
	public void method181(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field592.length; var4++) {
			int var5 = field592[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg2;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg0;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var8 = var5 & 0xFF;
				var8 += arg1;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field592[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("ib.c(Z)V")
	public void method182() {
		int[] var1 = new int[field598 * field597];
		for (int var2 = 0; var2 < field594; var2++) {
			for (int var3 = 0; var3 < field593; var3++) {
				var1[(field596 + var2) * field597 + field595 + var3] = field592[field593 * var2 + var3];
			}
		}

		field592 = var1;
		field593 = field597;
		field594 = field598;
		field595 = 0;
		field596 = 0;
	}

	@ObfuscatedName("ib.a(III)V")
	public void method183(int arg0, int arg1) {
		arg1 += field595;
		arg0 += field596;
		int var3 = class33.field560 * arg0 + arg1;
		int var4 = 0;
		int var5 = field594;
		int var6 = field593;
		int var7 = class33.field560 - var6;
		int var8 = 0;

		if (arg0 < class33.field562) {
			int var9 = class33.field562 - arg0;
			var5 -= var9;
			arg0 = class33.field562;
			var4 += var6 * var9;
			var3 += class33.field560 * var9;
		}

		if (arg0 + var5 > class33.field563) {
			var5 -= arg0 + var5 - class33.field563;
		}

		if (arg1 < class33.field564) {
			int var10 = class33.field564 - arg1;
			var6 -= var10;
			arg1 = class33.field564;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class33.field565) {
			int var11 = arg1 + var6 - class33.field565;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method184(var6, var4, class33.field559, field592, var3, var5, var7, var8);
		}
	}

	@ObfuscatedName("ib.a(II[I[IIIIIB)V")
	public void method184(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg2[arg4++] = arg3[arg1++];
				arg2[arg4++] = arg3[arg1++];
				arg2[arg4++] = arg3[arg1++];
				arg2[arg4++] = arg3[arg1++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg2[arg4++] = arg3[arg1++];
			}

			arg4 += arg6;
			arg1 += arg7;
		}
	}

	@ObfuscatedName("ib.a(IBI)V")
	public void method185(int arg0, int arg1) {
		arg0 += field595;
		arg1 += field596;
		int var3 = class33.field560 * arg1 + arg0;
		int var4 = 0;
		int var5 = field594;
		int var6 = field593;
		int var7 = class33.field560 - var6;
		int var8 = 0;

		if (arg1 < class33.field562) {
			int var9 = class33.field562 - arg1;
			var5 -= var9;
			arg1 = class33.field562;
			var4 += var6 * var9;
			var3 += class33.field560 * var9;
		}

		if (arg1 + var5 > class33.field563) {
			var5 -= arg1 + var5 - class33.field563;
		}

		if (arg0 < class33.field564) {
			int var10 = class33.field564 - arg0;
			var6 -= var10;
			arg0 = class33.field564;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class33.field565) {
			int var11 = arg0 + var6 - class33.field565;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method186(class33.field559, field592, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("ib.a([I[IIIIIIII)V")
	public void method186(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				int var13 = arg1[arg3++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var13;
				}

				int var14 = arg1[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var14;
				}

				int var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}

				int var16 = arg1[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var16;
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				int var18 = arg1[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var18;
				}
			}

			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("ib.a(IIII)V")
	public void method187(int arg0, int arg1, int arg2) {
		arg1 += field595;
		arg2 += field596;
		int var4 = class33.field560 * arg2 + arg1;
		int var5 = 0;
		int var6 = field594;
		int var7 = field593;
		int var8 = class33.field560 - var7;
		int var9 = 0;

		if (arg2 < class33.field562) {
			int var10 = class33.field562 - arg2;
			var6 -= var10;
			arg2 = class33.field562;
			var5 += var7 * var10;
			var4 += class33.field560 * var10;
		}

		if (arg2 + var6 > class33.field563) {
			var6 -= arg2 + var6 - class33.field563;
		}

		if (arg1 < class33.field564) {
			int var11 = class33.field564 - arg1;
			var7 -= var11;
			arg1 = class33.field564;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > class33.field565) {
			int var12 = arg1 + var7 - class33.field565;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method188(arg0, var4, var7, 0, var6, var9, var5, var8, class33.field559, field592);
		}
	}

	@ObfuscatedName("ib.a(IIIIIIIII[I[I)V")
	public void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		int var11 = 256 - arg0;
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = arg9[arg6++];
				if (var14 == 0) {
					arg1++;
				} else {
					int var15 = arg8[arg1];
					arg8[arg1++] = ((var14 & 0xFF00FF) * arg0 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg0 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg1 += arg7;
			arg6 += arg5;
		}
	}

	@ObfuscatedName("ib.a(III[II[IIIIII)V")
	public void method189(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg0 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg9 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg9 / 326.11D) * 65536.0D);
			var13 = arg7 * var13 >> 8;
			var14 = arg7 * var14 >> 8;
			int var15 = (arg1 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg3 << 16) + var12 * var14 - var11 * var13;
			int var17 = class33.field560 * arg5 + arg8;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg4[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg2[var18]; var23 < 0; var23++) {
					class33.field559[var20++] = field592[(var21 >> 16) + (var22 >> 16) * field593];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += class33.field560;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("ib.a(IDIIIIIII)V")
	public void method190(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg0 / 2;
			int var11 = -arg6 / 2;
			int var12 = (int) (Math.sin(arg1) * 65536.0D);
			int var13 = (int) (Math.cos(arg1) * 65536.0D);
			var12 = arg7 * var12 >> 8;
			var13 = arg7 * var13 >> 8;
			int var14 = (arg3 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = class33.field560 * arg5 + arg2;
			for (int var17 = 0; var17 < arg6; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg0; var21 < 0; var21++) {
					int var22 = field592[(var19 >> 16) + (var20 >> 16) * field593];
					if (var22 == 0) {
						var18++;
					} else {
						class33.field559[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += class33.field560;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("ib.a(IBILjb;)V")
	public void method191(int arg0, int arg1, class36 arg2) {
		arg0 += field595;
		arg1 += field596;
		int var4 = class33.field560 * arg1 + arg0;
		int var5 = 0;
		int var6 = field594;
		int var7 = field593;
		int var8 = class33.field560 - var7;
		int var9 = 0;

		if (arg1 < class33.field562) {
			int var10 = class33.field562 - arg1;
			var6 -= var10;
			arg1 = class33.field562;
			var5 += var7 * var10;
			var4 += class33.field560 * var10;
		}

		if (arg1 + var6 > class33.field563) {
			var6 -= arg1 + var6 - class33.field563;
		}

		if (arg0 < class33.field564) {
			int var11 = class33.field564 - arg0;
			var7 -= var11;
			arg0 = class33.field564;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > class33.field565) {
			int var12 = arg0 + var7 - class33.field565;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method192(field592, arg2.field599, var7, var4, var6, 0, var5, class33.field559, var9, var8);
		}
	}

	@ObfuscatedName("ib.a([II[BIIIII[III)V")
	public void method192(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg0[arg6++];
				if (var14 != 0 && arg1[arg3] == 0) {
					arg7[arg3++] = var14;
				} else {
					arg3++;
				}

				int var15 = arg0[arg6++];
				if (var15 != 0 && arg1[arg3] == 0) {
					arg7[arg3++] = var15;
				} else {
					arg3++;
				}

				int var16 = arg0[arg6++];
				if (var16 != 0 && arg1[arg3] == 0) {
					arg7[arg3++] = var16;
				} else {
					arg3++;
				}

				int var17 = arg0[arg6++];
				if (var17 != 0 && arg1[arg3] == 0) {
					arg7[arg3++] = var17;
				} else {
					arg3++;
				}
			}

			for (int var18 = arg2; var18 < 0; var18++) {
				int var19 = arg0[arg6++];
				if (var19 != 0 && arg1[arg3] == 0) {
					arg7[arg3++] = var19;
				} else {
					arg3++;
				}
			}

			arg3 += arg9;
			arg6 += arg8;
		}
	}
}
