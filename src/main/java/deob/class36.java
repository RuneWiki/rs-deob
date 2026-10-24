package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("jb")
public final class class36 extends class34 {

	@ObfuscatedName("jb.C")
	public int[] field594;

	@ObfuscatedName("jb.H")
	public int field599;

	@ObfuscatedName("jb.D")
	public int field595;

	@ObfuscatedName("jb.I")
	public int field600;

	@ObfuscatedName("jb.E")
	public int field596;

	@ObfuscatedName("jb.G")
	public int field598;

	@ObfuscatedName("jb.F")
	public int field597;

	public class36(int arg0, int arg1) {
		field594 = new int[arg0 * arg1];
		field595 = field599 = arg0;
		field596 = field600 = arg1;
		field597 = field598 = 0;
	}

	public class36(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field595 = var3.getWidth(arg1);
			field596 = var3.getHeight(arg1);
			field599 = field595;
			field600 = field596;
			field597 = 0;
			field598 = 0;
			field594 = new int[field596 * field595];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field595, field596, field594, 0, field595);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class36(class51 arg0, String arg1, int arg2) {
		class39 var4 = new class39(arg0.method308(arg1 + ".dat", null));
		class39 var5 = new class39(arg0.method308("index.dat", null));
		var5.field621 = var4.method240();
		field599 = var5.method240();
		field600 = var5.method240();
		int var6 = var5.method238();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method242();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field621 += 2;
			var4.field621 += var5.method240() * var5.method240();
			var5.field621++;
		}

		field597 = var5.method238();
		field598 = var5.method238();
		field595 = var5.method240();
		field596 = var5.method240();
		int var10 = var5.method238();
		int var11 = field596 * field595;
		field594 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field594[var12] = var7[var4.method238()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field595; var13++) {
				for (int var14 = 0; var14 < field596; var14++) {
					field594[field595 * var14 + var13] = var7[var4.method238()];
				}
			}
		}
	}

	@ObfuscatedName("jb.b(I)V")
	public void method193() {
		class34.method164(field595, field594, field596);
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void method194(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field594.length; var4++) {
			int var5 = field594[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg2;
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
				var8 += arg0;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field594[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("jb.c(I)V")
	public void method195() {
		int[] var1 = new int[field600 * field599];
		for (int var2 = 0; var2 < field596; var2++) {
			for (int var3 = 0; var3 < field595; var3++) {
				var1[(field598 + var2) * field599 + field597 + var3] = field594[field595 * var2 + var3];
			}
		}

		field594 = var1;
		field595 = field599;
		field596 = field600;
		field597 = 0;
		field598 = 0;
	}

	@ObfuscatedName("jb.a(BII)V")
	public void method196(int arg0, int arg1) {
		arg1 += field597;
		arg0 += field598;
		int var3 = class34.field562 * arg0 + arg1;
		int var4 = 0;
		int var5 = field596;
		int var6 = field595;
		int var7 = class34.field562 - var6;
		int var8 = 0;

		if (arg0 < class34.field564) {
			int var9 = class34.field564 - arg0;
			var5 -= var9;
			arg0 = class34.field564;
			var4 += var6 * var9;
			var3 += class34.field562 * var9;
		}

		if (arg0 + var5 > class34.field565) {
			var5 -= arg0 + var5 - class34.field565;
		}

		if (arg1 < class34.field566) {
			int var10 = class34.field566 - arg1;
			var6 -= var10;
			arg1 = class34.field566;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class34.field567) {
			int var11 = arg1 + var6 - class34.field567;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method197(var3, var4, var6, var8, var7, class34.field561, var5, field594);
		}
	}

	@ObfuscatedName("jb.a(IIIII[III[I)V")
	public void method197(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7) {
		int var9 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg0++] = arg7[arg1++];
				arg5[arg0++] = arg7[arg1++];
				arg5[arg0++] = arg7[arg1++];
				arg5[arg0++] = arg7[arg1++];
			}

			for (int var12 = arg2; var12 < 0; var12++) {
				arg5[arg0++] = arg7[arg1++];
			}

			arg0 += arg4;
			arg1 += arg3;
		}
	}

	@ObfuscatedName("jb.a(IIB)V")
	public void method198(int arg0, int arg1) {
		arg1 += field597;
		arg0 += field598;
		int var3 = class34.field562 * arg0 + arg1;
		int var4 = 0;
		int var5 = field596;
		int var6 = field595;
		int var7 = class34.field562 - var6;
		int var8 = 0;

		if (arg0 < class34.field564) {
			int var9 = class34.field564 - arg0;
			var5 -= var9;
			arg0 = class34.field564;
			var4 += var6 * var9;
			var3 += class34.field562 * var9;
		}

		if (arg0 + var5 > class34.field565) {
			var5 -= arg0 + var5 - class34.field565;
		}

		if (arg1 < class34.field566) {
			int var10 = class34.field566 - arg1;
			var6 -= var10;
			arg1 = class34.field566;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class34.field567) {
			int var11 = arg1 + var6 - class34.field567;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method199(class34.field561, field594, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("jb.a([I[IIIIIIII)V")
	public void method199(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("jb.b(IIII)V")
	public void method200(int arg0, int arg1, int arg2) {
		arg2 += field597;
		arg1 += field598;
		int var4 = class34.field562 * arg1 + arg2;
		int var5 = 0;
		int var6 = field596;
		int var7 = field595;
		int var8 = class34.field562 - var7;
		int var9 = 0;

		if (arg1 < class34.field564) {
			int var10 = class34.field564 - arg1;
			var6 -= var10;
			arg1 = class34.field564;
			var5 += var7 * var10;
			var4 += class34.field562 * var10;
		}

		if (arg1 + var6 > class34.field565) {
			var6 -= arg1 + var6 - class34.field565;
		}

		if (arg2 < class34.field566) {
			int var11 = class34.field566 - arg2;
			var7 -= var11;
			arg2 = class34.field566;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > class34.field567) {
			int var12 = arg2 + var7 - class34.field567;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method201(field594, 0, arg0, var8, var4, class34.field561, var9, var5, var6, var7);
		}
	}

	@ObfuscatedName("jb.a([IIIII[IIIIZI)V")
	public void method201(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg2;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg9; var13 < 0; var13++) {
				int var14 = arg0[arg7++];
				if (var14 == 0) {
					arg4++;
				} else {
					int var15 = arg5[arg4];
					arg5[arg4++] = ((var14 & 0xFF00FF) * arg2 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg2 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg4 += arg3;
			arg7 += arg6;
		}
	}

	@ObfuscatedName("jb.a(IIII[IIIII[IZ)V")
	public void method202(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg6 / 2;
			int var12 = -arg8 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg7 * var13 >> 8;
			var14 = arg7 * var14 >> 8;
			int var15 = (arg3 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg1 << 16) + var12 * var14 - var11 * var13;
			int var17 = class34.field562 * arg5 + arg2;
			for (int var18 = 0; var18 < arg8; var18++) {
				int var19 = arg4[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg9[var18]; var23 < 0; var23++) {
					class34.field561[var20++] = field594[(var21 >> 16) + (var22 >> 16) * field595];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += class34.field562;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("jb.a(IIIZIIIDI)V")
	public void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
		try {
			int var10 = -arg7 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg6) * 65536.0D);
			int var13 = (int) (Math.cos(arg6) * 65536.0D);
			var12 = arg1 * var12 >> 8;
			var13 = arg1 * var13 >> 8;
			int var14 = (arg4 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg2 << 16) + var11 * var13 - var10 * var12;
			int var16 = class34.field562 * arg0 + arg5;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg7; var21 < 0; var21++) {
					int var22 = field594[(var19 >> 16) + (var20 >> 16) * field595];
					if (var22 == 0) {
						var18++;
					} else {
						class34.field561[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += class34.field562;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("jb.a(Lkb;III)V")
	public void method204(class37 arg0, int arg1, int arg2) {
		arg1 += field597;
		arg2 += field598;
		int var4 = class34.field562 * arg2 + arg1;
		int var5 = 0;
		int var6 = field596;
		int var7 = field595;
		int var8 = class34.field562 - var7;
		int var9 = 0;

		if (arg2 < class34.field564) {
			int var10 = class34.field564 - arg2;
			var6 -= var10;
			arg2 = class34.field564;
			var5 += var7 * var10;
			var4 += class34.field562 * var10;
		}

		if (arg2 + var6 > class34.field565) {
			var6 -= arg2 + var6 - class34.field565;
		}

		if (arg1 < class34.field566) {
			int var11 = class34.field566 - arg1;
			var7 -= var11;
			arg1 = class34.field566;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > class34.field567) {
			int var12 = arg1 + var7 - class34.field567;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method205(var7, var9, var4, var5, class34.field561, field594, var8, arg0.field601, var6, 0);
		}
	}

	@ObfuscatedName("jb.a(IIIII[I[II[BII)V")
	public void method205(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, byte[] arg7, int arg8, int arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg5[arg3++];
				if (var14 != 0 && arg7[arg2] == 0) {
					arg4[arg2++] = var14;
				} else {
					arg2++;
				}

				int var15 = arg5[arg3++];
				if (var15 != 0 && arg7[arg2] == 0) {
					arg4[arg2++] = var15;
				} else {
					arg2++;
				}

				int var16 = arg5[arg3++];
				if (var16 != 0 && arg7[arg2] == 0) {
					arg4[arg2++] = var16;
				} else {
					arg2++;
				}

				int var17 = arg5[arg3++];
				if (var17 != 0 && arg7[arg2] == 0) {
					arg4[arg2++] = var17;
				} else {
					arg2++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg5[arg3++];
				if (var19 != 0 && arg7[arg2] == 0) {
					arg4[arg2++] = var19;
				} else {
					arg2++;
				}
			}

			arg2 += arg6;
			arg3 += arg1;
		}
	}
}
