package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("ib")
public final class class35 extends class33 {

	@ObfuscatedName("ib.A")
	public int[] field590;

	@ObfuscatedName("ib.F")
	public int field595;

	@ObfuscatedName("ib.B")
	public int field591;

	@ObfuscatedName("ib.G")
	public int field596;

	@ObfuscatedName("ib.C")
	public int field592;

	@ObfuscatedName("ib.E")
	public int field594;

	@ObfuscatedName("ib.D")
	public int field593;

	public class35(int arg0, int arg1) {
		field590 = new int[arg0 * arg1];
		field591 = field595 = arg0;
		field592 = field596 = arg1;
		field593 = field594 = 0;
	}

	public class35(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field591 = var3.getWidth(arg1);
			field592 = var3.getHeight(arg1);
			field595 = field591;
			field596 = field592;
			field593 = 0;
			field594 = 0;
			field590 = new int[field592 * field591];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field591, field592, field590, 0, field591);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class35(class51 arg0, String arg1, int arg2) {
		class39 var4 = new class39(arg0.method298(arg1 + ".dat", null));
		class39 var5 = new class39(arg0.method298("index.dat", null));
		var5.field625 = var4.method230();
		field595 = var5.method230();
		field596 = var5.method230();
		int var6 = var5.method228();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method232();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field625 += 2;
			var4.field625 += var5.method230() * var5.method230();
			var5.field625++;
		}

		field593 = var5.method228();
		field594 = var5.method228();
		field591 = var5.method230();
		field592 = var5.method230();
		int var10 = var5.method228();
		int var11 = field592 * field591;
		field590 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field590[var12] = var7[var4.method228()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field591; var13++) {
				for (int var14 = 0; var14 < field592; var14++) {
					field590[field591 * var14 + var13] = var7[var4.method228()];
				}
			}
		}
	}

	@ObfuscatedName("ib.c(I)V")
	public void method180() {
		class33.method151(field590, field591, field592);
	}

	@ObfuscatedName("ib.a(IIIB)V")
	public void method181(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field590.length; var4++) {
			int var5 = field590[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg1;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg2;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var8 = var5 & 0xFF;
				var8 += arg0;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field590[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("ib.a(Z)V")
	public void method182() {
		int[] var1 = new int[field596 * field595];
		for (int var2 = 0; var2 < field592; var2++) {
			for (int var3 = 0; var3 < field591; var3++) {
				var1[(field594 + var2) * field595 + field593 + var3] = field590[field591 * var2 + var3];
			}
		}

		field590 = var1;
		field591 = field595;
		field592 = field596;
		field593 = 0;
		field594 = 0;
	}

	@ObfuscatedName("ib.a(III)V")
	public void method183(int arg0, int arg1) {
		arg1 += field593;
		arg0 += field594;
		int var3 = class33.field558 * arg0 + arg1;
		int var4 = 0;
		int var5 = field592;
		int var6 = field591;
		int var7 = class33.field558 - var6;
		int var8 = 0;

		if (arg0 < class33.field560) {
			int var9 = class33.field560 - arg0;
			var5 -= var9;
			arg0 = class33.field560;
			var4 += var6 * var9;
			var3 += class33.field558 * var9;
		}

		if (arg0 + var5 > class33.field561) {
			var5 -= arg0 + var5 - class33.field561;
		}

		if (arg1 < class33.field562) {
			int var10 = class33.field562 - arg1;
			var6 -= var10;
			arg1 = class33.field562;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class33.field563) {
			int var11 = arg1 + var6 - class33.field563;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method184(var8, var7, var6, class33.field557, var4, field590, var5, var3);
		}
	}

	@ObfuscatedName("ib.a(IIII[II[III)V")
	public void method184(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7) {
		int var9 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg3[arg7++] = arg5[arg4++];
				arg3[arg7++] = arg5[arg4++];
				arg3[arg7++] = arg5[arg4++];
				arg3[arg7++] = arg5[arg4++];
			}

			for (int var12 = arg2; var12 < 0; var12++) {
				arg3[arg7++] = arg5[arg4++];
			}

			arg7 += arg1;
			arg4 += arg0;
		}
	}

	@ObfuscatedName("ib.a(BII)V")
	public void method185(int arg0, int arg1) {
		arg0 += field593;
		arg1 += field594;
		int var3 = class33.field558 * arg1 + arg0;
		int var4 = 0;
		int var5 = field592;
		int var6 = field591;
		int var7 = class33.field558 - var6;
		int var8 = 0;

		if (arg1 < class33.field560) {
			int var9 = class33.field560 - arg1;
			var5 -= var9;
			arg1 = class33.field560;
			var4 += var6 * var9;
			var3 += class33.field558 * var9;
		}

		if (arg1 + var5 > class33.field561) {
			var5 -= arg1 + var5 - class33.field561;
		}

		if (arg0 < class33.field562) {
			int var10 = class33.field562 - arg0;
			var6 -= var10;
			arg0 = class33.field562;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class33.field563) {
			int var11 = arg0 + var6 - class33.field563;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method186(class33.field557, field590, 0, var4, var3, var6, var5, var7, var8);
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
		arg0 += field593;
		arg2 += field594;
		int var4 = class33.field558 * arg2 + arg0;
		int var5 = 0;
		int var6 = field592;
		int var7 = field591;
		int var8 = class33.field558 - var7;
		int var9 = 0;

		if (arg2 < class33.field560) {
			int var10 = class33.field560 - arg2;
			var6 -= var10;
			arg2 = class33.field560;
			var5 += var7 * var10;
			var4 += class33.field558 * var10;
		}

		if (arg2 + var6 > class33.field561) {
			var6 -= arg2 + var6 - class33.field561;
		}

		if (arg0 < class33.field562) {
			int var11 = class33.field562 - arg0;
			var7 -= var11;
			arg0 = class33.field562;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > class33.field563) {
			int var12 = arg0 + var7 - class33.field563;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method188(class33.field557, arg1, 0, var7, var8, var9, var6, var4, field590, var5);
		}
	}

	@ObfuscatedName("ib.a([IIBIIIIII[II)V")
	public void method188(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		int var11 = 256 - arg1;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = arg8[arg9++];
				if (var14 == 0) {
					arg7++;
				} else {
					int var15 = arg0[arg7];
					arg0[arg7++] = ((var14 & 0xFF00FF) * arg1 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg1 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg7 += arg4;
			arg9 += arg5;
		}
	}

	@ObfuscatedName("ib.a(IIIII[II[IIII)V")
	public void method189(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg5 / 2;
			int var12 = -arg9 / 2;
			int var13 = (int) (Math.sin(arg1 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg1 / 326.11D) * 65536.0D);
			var13 = arg0 * var13 >> 8;
			var14 = arg0 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg3 << 16) + var12 * var14 - var11 * var13;
			int var17 = class33.field558 * arg7 + arg8;
			for (int var18 = 0; var18 < arg9; var18++) {
				int var19 = arg4[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg6[var18]; var23 < 0; var23++) {
					class33.field557[var20++] = field590[(var21 >> 16) + (var22 >> 16) * field591];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += class33.field558;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("ib.a(IDZIIIIII)V")
	public void method190(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg4 / 2;
			int var11 = -arg0 / 2;
			int var12 = (int) (Math.sin(arg1) * 65536.0D);
			int var13 = (int) (Math.cos(arg1) * 65536.0D);
			var12 = arg7 * var12 >> 8;
			var13 = arg7 * var13 >> 8;
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg3 << 16) + var11 * var13 - var10 * var12;
			int var16 = class33.field558 * arg2 + arg5;
			for (int var17 = 0; var17 < arg0; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg4; var21 < 0; var21++) {
					int var22 = field590[(var19 >> 16) + (var20 >> 16) * field591];
					if (var22 == 0) {
						var18++;
					} else {
						class33.field557[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += class33.field558;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("ib.a(IILjb;I)V")
	public void method191(int arg0, int arg1, class36 arg2) {
		arg1 += field593;
		arg0 += field594;
		int var4 = class33.field558 * arg0 + arg1;
		int var5 = 0;
		int var6 = field592;
		int var7 = field591;
		int var8 = class33.field558 - var7;
		int var9 = 0;

		if (arg0 < class33.field560) {
			int var10 = class33.field560 - arg0;
			var6 -= var10;
			arg0 = class33.field560;
			var5 += var7 * var10;
			var4 += class33.field558 * var10;
		}

		if (arg0 + var6 > class33.field561) {
			var6 -= arg0 + var6 - class33.field561;
		}

		if (arg1 < class33.field562) {
			int var11 = class33.field562 - arg1;
			var7 -= var11;
			arg1 = class33.field562;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > class33.field563) {
			int var12 = arg1 + var7 - class33.field563;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method192(var7, var6, var4, var8, field590, arg2.field597, 0, class33.field557, var9, var5);
		}
	}

	@ObfuscatedName("ib.a(IIII[I[BI[IIII)V")
	public void method192(int arg0, int arg1, int arg2, int arg3, int[] arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg4[arg9++];
				if (var14 != 0 && arg5[arg2] == 0) {
					arg7[arg2++] = var14;
				} else {
					arg2++;
				}

				int var15 = arg4[arg9++];
				if (var15 != 0 && arg5[arg2] == 0) {
					arg7[arg2++] = var15;
				} else {
					arg2++;
				}

				int var16 = arg4[arg9++];
				if (var16 != 0 && arg5[arg2] == 0) {
					arg7[arg2++] = var16;
				} else {
					arg2++;
				}

				int var17 = arg4[arg9++];
				if (var17 != 0 && arg5[arg2] == 0) {
					arg7[arg2++] = var17;
				} else {
					arg2++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg4[arg9++];
				if (var19 != 0 && arg5[arg2] == 0) {
					arg7[arg2++] = var19;
				} else {
					arg2++;
				}
			}

			arg2 += arg3;
			arg9 += arg8;
		}
	}
}
