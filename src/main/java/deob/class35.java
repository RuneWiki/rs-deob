package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("ib")
public final class class35 extends class33 {

	@ObfuscatedName("ib.G")
	public int[] field596;

	@ObfuscatedName("ib.L")
	public int field601;

	@ObfuscatedName("ib.H")
	public int field597;

	@ObfuscatedName("ib.M")
	public int field602;

	@ObfuscatedName("ib.I")
	public int field598;

	@ObfuscatedName("ib.K")
	public int field600;

	@ObfuscatedName("ib.J")
	public int field599;

	public class35(int arg0, int arg1) {
		field596 = new int[arg0 * arg1];
		field597 = field601 = arg0;
		field598 = field602 = arg1;
		field599 = field600 = 0;
	}

	public class35(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field597 = var3.getWidth(arg1);
			field598 = var3.getHeight(arg1);
			field601 = field597;
			field602 = field598;
			field599 = 0;
			field600 = 0;
			field596 = new int[field598 * field597];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field597, field598, field596, 0, field597);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class35(class50 arg0, String arg1, int arg2) {
		class38 var4 = new class38(arg0.method299(arg1 + ".dat", null));
		class38 var5 = new class38(arg0.method299("index.dat", null));
		var5.field621 = var4.method231();
		field601 = var5.method231();
		field602 = var5.method231();
		int var6 = var5.method229();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method233();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field621 += 2;
			var4.field621 += var5.method231() * var5.method231();
			var5.field621++;
		}

		field599 = var5.method229();
		field600 = var5.method229();
		field597 = var5.method231();
		field598 = var5.method231();
		int var10 = var5.method229();
		int var11 = field598 * field597;
		field596 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field596[var12] = var7[var4.method229()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field597; var13++) {
				for (int var14 = 0; var14 < field598; var14++) {
					field596[field597 * var14 + var13] = var7[var4.method229()];
				}
			}
		}
	}

	@ObfuscatedName("ib.b(I)V")
	public void method181() {
		class33.method152(field596, field598, field597);
	}

	@ObfuscatedName("ib.a(IIII)V")
	public void method182(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field596.length; var4++) {
			int var5 = field596[var4];
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

				field596[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("ib.c(I)V")
	public void method183() {
		int[] var1 = new int[field602 * field601];
		for (int var2 = 0; var2 < field598; var2++) {
			for (int var3 = 0; var3 < field597; var3++) {
				var1[(field600 + var2) * field601 + field599 + var3] = field596[field597 * var2 + var3];
			}
		}

		field596 = var1;
		field597 = field601;
		field598 = field602;
		field599 = 0;
		field600 = 0;
	}

	@ObfuscatedName("ib.a(III)V")
	public void method184(int arg0, int arg1) {
		arg0 += field599;
		arg1 += field600;
		int var3 = class33.field564 * arg1 + arg0;
		int var4 = 0;
		int var5 = field598;
		int var6 = field597;
		int var7 = class33.field564 - var6;
		int var8 = 0;

		if (arg1 < class33.field566) {
			int var9 = class33.field566 - arg1;
			var5 -= var9;
			arg1 = class33.field566;
			var4 += var6 * var9;
			var3 += class33.field564 * var9;
		}

		if (arg1 + var5 > class33.field567) {
			var5 -= arg1 + var5 - class33.field567;
		}

		if (arg0 < class33.field568) {
			int var10 = class33.field568 - arg0;
			var6 -= var10;
			arg0 = class33.field568;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class33.field569) {
			int var11 = arg0 + var6 - class33.field569;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method185(var6, var8, var5, var3, var7, var4, class33.field563, field596);
		}
	}

	@ObfuscatedName("ib.a(IIBIIII[I[I)V")
	public void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg2; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg6[arg3++] = arg7[arg5++];
				arg6[arg3++] = arg7[arg5++];
				arg6[arg3++] = arg7[arg5++];
				arg6[arg3++] = arg7[arg5++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg6[arg3++] = arg7[arg5++];
			}

			arg3 += arg4;
			arg5 += arg1;
		}
	}

	@ObfuscatedName("ib.b(III)V")
	public void method186(int arg0, int arg1) {
		arg0 += field599;
		arg1 += field600;
		int var3 = class33.field564 * arg1 + arg0;
		int var4 = 0;
		int var5 = field598;
		int var6 = field597;
		int var7 = class33.field564 - var6;
		int var8 = 0;

		if (arg1 < class33.field566) {
			int var9 = class33.field566 - arg1;
			var5 -= var9;
			arg1 = class33.field566;
			var4 += var6 * var9;
			var3 += class33.field564 * var9;
		}

		if (arg1 + var5 > class33.field567) {
			var5 -= arg1 + var5 - class33.field567;
		}

		if (arg0 < class33.field568) {
			int var10 = class33.field568 - arg0;
			var6 -= var10;
			arg0 = class33.field568;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class33.field569) {
			int var11 = arg0 + var6 - class33.field569;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method187(class33.field563, field596, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("ib.a([I[IIIIIIII)V")
	public void method187(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("ib.a(ZIII)V")
	public void method188(int arg0, int arg1, int arg2) {
		arg2 += field599;
		arg0 += field600;
		int var4 = class33.field564 * arg0 + arg2;
		int var5 = 0;
		int var6 = field598;
		int var7 = field597;
		int var8 = class33.field564 - var7;
		int var9 = 0;

		if (arg0 < class33.field566) {
			int var10 = class33.field566 - arg0;
			var6 -= var10;
			arg0 = class33.field566;
			var5 += var7 * var10;
			var4 += class33.field564 * var10;
		}

		if (arg0 + var6 > class33.field567) {
			var6 -= arg0 + var6 - class33.field567;
		}

		if (arg2 < class33.field568) {
			int var11 = class33.field568 - arg2;
			var7 -= var11;
			arg2 = class33.field568;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > class33.field569) {
			int var12 = arg2 + var7 - class33.field569;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method189(class33.field563, var5, field596, var6, var4, var9, var8, arg1, var7, 0);
		}
	}

	@ObfuscatedName("ib.a([IZI[IIIIIIII)V")
	public void method189(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg7;
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = -arg8; var13 < 0; var13++) {
				int var14 = arg2[arg1++];
				if (var14 == 0) {
					arg4++;
				} else {
					int var15 = arg0[arg4];
					arg0[arg4++] = ((var14 & 0xFF00FF) * arg7 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg7 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg4 += arg6;
			arg1 += arg5;
		}
	}

	@ObfuscatedName("ib.a(IIIII[IB[IIII)V")
	public void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg3 / 2;
			int var12 = -arg1 / 2;
			int var13 = (int) (Math.sin(arg4 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg4 / 326.11D) * 65536.0D);
			var13 = arg7 * var13 >> 8;
			var14 = arg7 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg9 << 16) + var12 * var14 - var11 * var13;
			int var17 = class33.field564 * arg0 + arg8;
			for (int var18 = 0; var18 < arg1; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg6[var18]; var23 < 0; var23++) {
					class33.field563[var20++] = field596[(var21 >> 16) + (var22 >> 16) * field597];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += class33.field564;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("ib.a(IIIIIDIBI)V")
	public void method191(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg7 / 2;
			int var12 = (int) (Math.sin(arg5) * 65536.0D);
			int var13 = (int) (Math.cos(arg5) * 65536.0D);
			var12 = arg6 * var12 >> 8;
			var13 = arg6 * var13 >> 8;
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg1 << 16) + var11 * var13 - var10 * var12;
			int var16 = class33.field564 * arg3 + arg4;
			for (int var17 = 0; var17 < arg7; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = field596[(var19 >> 16) + (var20 >> 16) * field597];
					if (var22 == 0) {
						var18++;
					} else {
						class33.field563[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += class33.field564;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("ib.a(ILjb;II)V")
	public void method192(int arg0, class36 arg1, int arg2) {
		arg0 += field599;
		arg2 += field600;
		int var4 = class33.field564 * arg2 + arg0;
		int var5 = 0;
		int var6 = field598;
		int var7 = field597;
		int var8 = class33.field564 - var7;
		int var9 = 0;

		if (arg2 < class33.field566) {
			int var10 = class33.field566 - arg2;
			var6 -= var10;
			arg2 = class33.field566;
			var5 += var7 * var10;
			var4 += class33.field564 * var10;
		}

		if (arg2 + var6 > class33.field567) {
			var6 -= arg2 + var6 - class33.field567;
		}

		if (arg0 < class33.field568) {
			int var11 = class33.field568 - arg0;
			var7 -= var11;
			arg0 = class33.field568;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > class33.field569) {
			int var12 = arg0 + var7 - class33.field569;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method193(var4, var6, class33.field563, field596, 0, var5, var7, var8, var9, arg1.field603);
		}
	}

	@ObfuscatedName("ib.a(III[I[IIIIII[B)V")
	public void method193(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		int var11 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg3[arg5++];
				if (var14 != 0 && arg9[arg0] == 0) {
					arg2[arg0++] = var14;
				} else {
					arg0++;
				}

				int var15 = arg3[arg5++];
				if (var15 != 0 && arg9[arg0] == 0) {
					arg2[arg0++] = var15;
				} else {
					arg0++;
				}

				int var16 = arg3[arg5++];
				if (var16 != 0 && arg9[arg0] == 0) {
					arg2[arg0++] = var16;
				} else {
					arg0++;
				}

				int var17 = arg3[arg5++];
				if (var17 != 0 && arg9[arg0] == 0) {
					arg2[arg0++] = var17;
				} else {
					arg0++;
				}
			}

			for (int var18 = arg6; var18 < 0; var18++) {
				int var19 = arg3[arg5++];
				if (var19 != 0 && arg9[arg0] == 0) {
					arg2[arg0++] = var19;
				} else {
					arg0++;
				}
			}

			arg0 += arg7;
			arg5 += arg8;
		}
	}
}
