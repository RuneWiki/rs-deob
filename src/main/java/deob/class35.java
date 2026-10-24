package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("ib")
public final class class35 extends class33 {

	@ObfuscatedName("ib.E")
	public int[] field591;

	@ObfuscatedName("ib.J")
	public int field596;

	@ObfuscatedName("ib.F")
	public int field592;

	@ObfuscatedName("ib.K")
	public int field597;

	@ObfuscatedName("ib.G")
	public int field593;

	@ObfuscatedName("ib.I")
	public int field595;

	@ObfuscatedName("ib.H")
	public int field594;

	public class35(int arg0, int arg1) {
		field591 = new int[arg0 * arg1];
		field592 = field596 = arg0;
		field593 = field597 = arg1;
		field594 = field595 = 0;
	}

	public class35(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field592 = var3.getWidth(arg1);
			field593 = var3.getHeight(arg1);
			field596 = field592;
			field597 = field593;
			field594 = 0;
			field595 = 0;
			field591 = new int[field593 * field592];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field592, field593, field591, 0, field592);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class35(class50 arg0, String arg1, int arg2) {
		class38 var4 = new class38(arg0.method294(arg1 + ".dat", null));
		class38 var5 = new class38(arg0.method294("index.dat", null));
		var5.field616 = var4.method226();
		field596 = var5.method226();
		field597 = var5.method226();
		int var6 = var5.method224();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method228();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field616 += 2;
			var4.field616 += var5.method226() * var5.method226();
			var5.field616++;
		}

		field594 = var5.method224();
		field595 = var5.method224();
		field592 = var5.method226();
		field593 = var5.method226();
		int var10 = var5.method224();
		int var11 = field593 * field592;
		field591 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field591[var12] = var7[var4.method224()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field592; var13++) {
				for (int var14 = 0; var14 < field593; var14++) {
					field591[field592 * var14 + var13] = var7[var4.method224()];
				}
			}
		}
	}

	@ObfuscatedName("ib.b(I)V")
	public void method180() {
		class33.method151(field591, field593, field592);
	}

	@ObfuscatedName("ib.a(IIZI)V")
	public void method181(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field591.length; var4++) {
			int var5 = field591[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg0;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg1;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var8 = var5 & 0xFF;
				var8 += arg2;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field591[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("ib.c(I)V")
	public void method182() {
		int[] var1 = new int[field597 * field596];
		for (int var2 = 0; var2 < field593; var2++) {
			for (int var3 = 0; var3 < field592; var3++) {
				var1[(field595 + var2) * field596 + field594 + var3] = field591[field592 * var2 + var3];
			}
		}

		field591 = var1;
		field592 = field596;
		field593 = field597;
		field594 = 0;
		field595 = 0;
	}

	@ObfuscatedName("ib.a(III)V")
	public void method183(int arg0, int arg1) {
		arg1 += field594;
		arg0 += field595;
		int var3 = class33.field559 * arg0 + arg1;
		int var4 = 0;
		int var5 = field593;
		int var6 = field592;
		int var7 = class33.field559 - var6;
		int var8 = 0;

		if (arg0 < class33.field561) {
			int var9 = class33.field561 - arg0;
			var5 -= var9;
			arg0 = class33.field561;
			var4 += var6 * var9;
			var3 += class33.field559 * var9;
		}

		if (arg0 + var5 > class33.field562) {
			var5 -= arg0 + var5 - class33.field562;
		}

		if (arg1 < class33.field563) {
			int var10 = class33.field563 - arg1;
			var6 -= var10;
			arg1 = class33.field563;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class33.field564) {
			int var11 = arg1 + var6 - class33.field564;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method184(var4, class33.field558, field591, var3, var8, var7, var6, var5);
		}
	}

	@ObfuscatedName("ib.a(I[I[IIIIIII)V")
	public void method184(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg7; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg3++] = arg2[arg0++];
				arg1[arg3++] = arg2[arg0++];
				arg1[arg3++] = arg2[arg0++];
				arg1[arg3++] = arg2[arg0++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg1[arg3++] = arg2[arg0++];
			}

			arg3 += arg5;
			arg0 += arg4;
		}
	}

	@ObfuscatedName("ib.b(III)V")
	public void method185(int arg0, int arg1) {
		arg1 += field594;
		arg0 += field595;
		int var3 = class33.field559 * arg0 + arg1;
		int var4 = 0;
		int var5 = field593;
		int var6 = field592;
		int var7 = class33.field559 - var6;
		int var8 = 0;

		if (arg0 < class33.field561) {
			int var9 = class33.field561 - arg0;
			var5 -= var9;
			arg0 = class33.field561;
			var4 += var6 * var9;
			var3 += class33.field559 * var9;
		}

		if (arg0 + var5 > class33.field562) {
			var5 -= arg0 + var5 - class33.field562;
		}

		if (arg1 < class33.field563) {
			int var10 = class33.field563 - arg1;
			var6 -= var10;
			arg1 = class33.field563;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class33.field564) {
			int var11 = arg1 + var6 - class33.field564;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method186(class33.field558, field591, 0, var4, var3, var6, var5, var7, var8);
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

	@ObfuscatedName("ib.a(IIIB)V")
	public void method187(int arg0, int arg1, int arg2) {
		arg0 += field594;
		arg2 += field595;
		int var4 = class33.field559 * arg2 + arg0;
		int var5 = 0;
		int var6 = field593;
		int var7 = field592;
		int var8 = class33.field559 - var7;
		int var9 = 0;

		if (arg2 < class33.field561) {
			int var10 = class33.field561 - arg2;
			var6 -= var10;
			arg2 = class33.field561;
			var5 += var7 * var10;
			var4 += class33.field559 * var10;
		}

		if (arg2 + var6 > class33.field562) {
			var6 -= arg2 + var6 - class33.field562;
		}

		if (arg0 < class33.field563) {
			int var11 = class33.field563 - arg0;
			var7 -= var11;
			arg0 = class33.field563;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > class33.field564) {
			int var12 = arg0 + var7 - class33.field564;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method188(0, var8, arg1, var5, field591, class33.field558, var6, var7, var9, var4);
		}
	}

	@ObfuscatedName("ib.a(IIIII[I[IIIII)V")
	public void method188(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg2;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg7; var13 < 0; var13++) {
				int var14 = arg4[arg3++];
				if (var14 == 0) {
					arg9++;
				} else {
					int var15 = arg5[arg9];
					arg5[arg9++] = ((var14 & 0xFF00FF) * arg2 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg2 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg9 += arg1;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("ib.a(IIII[IIIIII[I)V")
	public void method189(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg7 / 2;
			int var12 = -arg1 / 2;
			int var13 = (int) (Math.sin(arg6 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg6 / 326.11D) * 65536.0D);
			var13 = arg4 * var13 >> 8;
			var14 = arg4 * var14 >> 8;
			int var15 = (arg0 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg8 << 16) + var12 * var14 - var11 * var13;
			int var17 = class33.field559 * arg2 + arg5;
			for (int var18 = 0; var18 < arg1; var18++) {
				int var19 = arg9[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg3[var18]; var23 < 0; var23++) {
					class33.field558[var20++] = field591[(var21 >> 16) + (var22 >> 16) * field592];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += class33.field559;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("ib.a(IIIBIIIID)V")
	public void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg7) * 65536.0D);
			int var13 = (int) (Math.cos(arg7) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg2 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg5 << 16) + var11 * var13 - var10 * var12;
			int var16 = class33.field559 * arg1 + arg0;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field591[(var19 >> 16) + (var20 >> 16) * field592];
					if (var22 == 0) {
						var18++;
					} else {
						class33.field558[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += class33.field559;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("ib.a(IIILjb;)V")
	public void method191(int arg0, int arg1, class36 arg2) {
		arg1 += field594;
		arg0 += field595;
		int var4 = class33.field559 * arg0 + arg1;
		int var5 = 0;
		int var6 = field593;
		int var7 = field592;
		int var8 = class33.field559 - var7;
		int var9 = 0;

		if (arg0 < class33.field561) {
			int var10 = class33.field561 - arg0;
			var6 -= var10;
			arg0 = class33.field561;
			var5 += var7 * var10;
			var4 += class33.field559 * var10;
		}

		if (arg0 + var6 > class33.field562) {
			var6 -= arg0 + var6 - class33.field562;
		}

		if (arg1 < class33.field563) {
			int var11 = class33.field563 - arg1;
			var7 -= var11;
			arg1 = class33.field563;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > class33.field564) {
			int var12 = arg1 + var7 - class33.field564;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method192(0, field591, var7, var6, var9, arg2.field598, class33.field558, var8, var4, var5);
		}
	}

	@ObfuscatedName("ib.a(I[IIIII[B[IIII)V")
	public void method192(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg1[arg9++];
				if (var14 != 0 && arg5[arg8] == 0) {
					arg6[arg8++] = var14;
				} else {
					arg8++;
				}

				int var15 = arg1[arg9++];
				if (var15 != 0 && arg5[arg8] == 0) {
					arg6[arg8++] = var15;
				} else {
					arg8++;
				}

				int var16 = arg1[arg9++];
				if (var16 != 0 && arg5[arg8] == 0) {
					arg6[arg8++] = var16;
				} else {
					arg8++;
				}

				int var17 = arg1[arg9++];
				if (var17 != 0 && arg5[arg8] == 0) {
					arg6[arg8++] = var17;
				} else {
					arg8++;
				}
			}

			for (int var18 = arg2; var18 < 0; var18++) {
				int var19 = arg1[arg9++];
				if (var19 != 0 && arg5[arg8] == 0) {
					arg6[arg8++] = var19;
				} else {
					arg8++;
				}
			}

			arg8 += arg7;
			arg9 += arg4;
		}
	}
}
