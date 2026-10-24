package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("jb")
public final class class36 extends class34 {

	@ObfuscatedName("jb.C")
	public int[] field585;

	@ObfuscatedName("jb.H")
	public int field590;

	@ObfuscatedName("jb.D")
	public int field586;

	@ObfuscatedName("jb.I")
	public int field591;

	@ObfuscatedName("jb.E")
	public int field587;

	@ObfuscatedName("jb.G")
	public int field589;

	@ObfuscatedName("jb.F")
	public int field588;

	public class36(int arg0, int arg1) {
		field585 = new int[arg0 * arg1];
		field586 = field590 = arg0;
		field587 = field591 = arg1;
		field588 = field589 = 0;
	}

	public class36(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field586 = var3.getWidth(arg1);
			field587 = var3.getHeight(arg1);
			field590 = field586;
			field591 = field587;
			field588 = 0;
			field589 = 0;
			field585 = new int[field587 * field586];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field586, field587, field585, 0, field586);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class36(class51 arg0, String arg1, int arg2) {
		class39 var4 = new class39(arg0.method299(arg1 + ".dat", null));
		class39 var5 = new class39(arg0.method299("index.dat", null));
		var5.field611 = var4.method233();
		field590 = var5.method233();
		field591 = var5.method233();
		int var6 = var5.method231();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method235();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field611 += 2;
			var4.field611 += var5.method233() * var5.method233();
			var5.field611++;
		}

		field588 = var5.method231();
		field589 = var5.method231();
		field586 = var5.method233();
		field587 = var5.method233();
		int var10 = var5.method231();
		int var11 = field587 * field586;
		field585 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field585[var12] = var7[var4.method231()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field586; var13++) {
				for (int var14 = 0; var14 < field587; var14++) {
					field585[field586 * var14 + var13] = var7[var4.method231()];
				}
			}
		}
	}

	@ObfuscatedName("jb.a(B)V")
	public void method186() {
		class34.method161(field585, field587, field586);
	}

	@ObfuscatedName("jb.a(IBII)V")
	public void method187(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field585.length; var4++) {
			int var5 = field585[var4];
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

				field585[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("jb.a(III)V")
	public void method188(int arg0, int arg1) {
		arg1 += field588;
		arg0 += field589;
		int var3 = class34.field553 * arg0 + arg1;
		int var4 = 0;
		int var5 = field587;
		int var6 = field586;
		int var7 = class34.field553 - var6;
		int var8 = 0;

		if (arg0 < class34.field555) {
			int var9 = class34.field555 - arg0;
			var5 -= var9;
			arg0 = class34.field555;
			var4 += var6 * var9;
			var3 += class34.field553 * var9;
		}

		if (arg0 + var5 > class34.field556) {
			var5 -= arg0 + var5 - class34.field556;
		}

		if (arg1 < class34.field557) {
			int var10 = class34.field557 - arg1;
			var6 -= var10;
			arg1 = class34.field557;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class34.field558) {
			int var11 = arg1 + var6 - class34.field558;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method189(field585, var7, class34.field552, var5, var6, var4, var8, var3);
		}
	}

	@ObfuscatedName("jb.a([III[IIIIII)V")
	public void method189(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var10 = -arg3; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg2[arg7++] = arg0[arg5++];
				arg2[arg7++] = arg0[arg5++];
				arg2[arg7++] = arg0[arg5++];
				arg2[arg7++] = arg0[arg5++];
			}

			for (int var12 = arg4; var12 < 0; var12++) {
				arg2[arg7++] = arg0[arg5++];
			}

			arg7 += arg1;
			arg5 += arg6;
		}
	}

	@ObfuscatedName("jb.b(III)V")
	public void method190(int arg0, int arg1) {
		arg1 += field588;
		arg0 += field589;
		int var3 = class34.field553 * arg0 + arg1;
		int var4 = 0;
		int var5 = field587;
		int var6 = field586;
		int var7 = class34.field553 - var6;
		int var8 = 0;

		if (arg0 < class34.field555) {
			int var9 = class34.field555 - arg0;
			var5 -= var9;
			arg0 = class34.field555;
			var4 += var6 * var9;
			var3 += class34.field553 * var9;
		}

		if (arg0 + var5 > class34.field556) {
			var5 -= arg0 + var5 - class34.field556;
		}

		if (arg1 < class34.field557) {
			int var10 = class34.field557 - arg1;
			var6 -= var10;
			arg1 = class34.field557;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class34.field558) {
			int var11 = arg1 + var6 - class34.field558;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method191(class34.field552, field585, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("jb.a([I[IIIIIIII)V")
	public void method191(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("jb.a(IIIIZ)V")
	public void method192(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var5 = field586;
			int var6 = field587;
			int var7 = 0;
			int var8 = 0;
			int var9 = (var5 << 16) / arg2;
			int var10 = (var6 << 16) / arg3;
			int var11 = field590;
			int var12 = field591;
			int var13 = (var11 << 16) / arg2;
			int var14 = (var12 << 16) / arg3;
			arg0 += (field588 * arg2 + var11 - 1) / var11;
			arg1 += (field589 * arg3 + var12 - 1) / var12;

			if (field588 * arg2 % var11 != 0) {
				var7 = (var11 - field588 * arg2 % var11 << 16) / arg2;
			}

			if (field589 * arg3 % var12 != 0) {
				var8 = (var12 - field589 * arg3 % var12 << 16) / arg3;
			}

			arg2 = (field586 - (var7 >> 16)) * arg2 / var11;
			arg3 = (field587 - (var8 >> 16)) * arg3 / var12;
			int var15 = class34.field553 * arg1 + arg0;
			int var16 = class34.field553 - arg2;

			if (arg1 < class34.field555) {
				int var17 = class34.field555 - arg1;
				arg3 -= var17;
				arg1 = 0;
				var15 += class34.field553 * var17;
				var8 += var14 * var17;
			}

			if (arg1 + arg3 > class34.field556) {
				arg3 -= arg1 + arg3 - class34.field556;
			}

			if (arg0 < class34.field557) {
				int var18 = class34.field557 - arg0;
				arg2 -= var18;
				arg0 = 0;
				var15 += var18;
				var7 += var13 * var18;
				var16 += var18;
			}

			if (arg0 + arg2 > class34.field558) {
				int var19 = arg0 + arg2 - class34.field558;
				arg2 -= var19;
				var16 += var19;
			}

			method193(0, var13, var5, arg3, arg2, var16, field585, var15, class34.field552, var8, var14, var7);
		} catch (Exception var20) {
			System.out.println("error in sprite clipping routine");
		}
	}

	@ObfuscatedName("jb.a(IIIIIII[II[IIII)V")
	public void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11) {
		try {
			int var13 = arg11;
			for (int var14 = -arg3; var14 < 0; var14++) {
				int var15 = (arg9 >> 16) * arg2;
				for (int var16 = -arg4; var16 < 0; var16++) {
					int var17 = arg6[(arg11 >> 16) + var15];
					if (var17 == 0) {
						arg7++;
					} else {
						arg8[arg7++] = var17;
					}

					arg11 += arg1;
				}

				arg9 += arg10;
				arg11 = var13;
				arg7 += arg5;
			}
		} catch (Exception var18) {
			System.out.println("error in plot_scale");
		}
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void method194(int arg0, int arg1, int arg2) {
		arg1 += field588;
		arg2 += field589;
		int var4 = class34.field553 * arg2 + arg1;
		int var5 = 0;
		int var6 = field587;
		int var7 = field586;
		int var8 = class34.field553 - var7;
		int var9 = 0;

		if (arg2 < class34.field555) {
			int var10 = class34.field555 - arg2;
			var6 -= var10;
			arg2 = class34.field555;
			var5 += var7 * var10;
			var4 += class34.field553 * var10;
		}

		if (arg2 + var6 > class34.field556) {
			var6 -= arg2 + var6 - class34.field556;
		}

		if (arg1 < class34.field557) {
			int var11 = class34.field557 - arg1;
			var7 -= var11;
			arg1 = class34.field557;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > class34.field558) {
			int var12 = arg1 + var7 - class34.field558;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method195(var7, var8, 0, var4, var5, field585, class34.field552, var9, arg0, var6);
		}
	}

	@ObfuscatedName("jb.a(IIIII[I[IZIII)V")
	public void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg8;
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = arg5[arg4++];
				if (var14 == 0) {
					arg3++;
				} else {
					int var15 = arg6[arg3];
					arg6[arg3++] = ((var14 & 0xFF00FF) * arg8 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg8 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg3 += arg1;
			arg4 += arg7;
		}
	}

	@ObfuscatedName("jb.a(IIIIZI[II[III)V")
	public void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		try {
			int var11 = -arg2 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin(arg8 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg8 / 326.11D) * 65536.0D);
			var13 = arg9 * var13 >> 8;
			var14 = arg9 * var14 >> 8;
			int var15 = (arg1 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg0 << 16) + var12 * var14 - var11 * var13;
			int var17 = class34.field553 * arg4 + arg6;
			for (int var18 = 0; var18 < arg3; var18++) {
				int var19 = arg7[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg5[var18]; var23 < 0; var23++) {
					class34.field552[var20++] = field585[(var21 >> 16) + (var22 >> 16) * field586];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += class34.field553;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("jb.a(IIILkb;)V")
	public void method197(int arg0, int arg1, class37 arg2) {
		arg0 += field588;
		arg1 += field589;
		int var4 = class34.field553 * arg1 + arg0;
		int var5 = 0;
		int var6 = field587;
		int var7 = field586;
		int var8 = class34.field553 - var7;
		int var9 = 0;

		if (arg1 < class34.field555) {
			int var10 = class34.field555 - arg1;
			var6 -= var10;
			arg1 = class34.field555;
			var5 += var7 * var10;
			var4 += class34.field553 * var10;
		}

		if (arg1 + var6 > class34.field556) {
			var6 -= arg1 + var6 - class34.field556;
		}

		if (arg0 < class34.field557) {
			int var11 = class34.field557 - arg0;
			var7 -= var11;
			arg0 = class34.field557;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > class34.field558) {
			int var12 = arg0 + var7 - class34.field558;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method198(var7, var5, class34.field552, var6, var9, 0, field585, arg2.field592, var8, var4);
		}
	}

	@ObfuscatedName("jb.a(III[IIII[I[BII)V")
	public void method198(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, byte[] arg7, int arg8, int arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg6[arg1++];
				if (var14 != 0 && arg7[arg9] == 0) {
					arg2[arg9++] = var14;
				} else {
					arg9++;
				}

				int var15 = arg6[arg1++];
				if (var15 != 0 && arg7[arg9] == 0) {
					arg2[arg9++] = var15;
				} else {
					arg9++;
				}

				int var16 = arg6[arg1++];
				if (var16 != 0 && arg7[arg9] == 0) {
					arg2[arg9++] = var16;
				} else {
					arg9++;
				}

				int var17 = arg6[arg1++];
				if (var17 != 0 && arg7[arg9] == 0) {
					arg2[arg9++] = var17;
				} else {
					arg9++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg6[arg1++];
				if (var19 != 0 && arg7[arg9] == 0) {
					arg2[arg9++] = var19;
				} else {
					arg9++;
				}
			}

			arg9 += arg8;
			arg1 += arg4;
		}
	}
}
