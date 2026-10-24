package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("hb")
public final class class34 extends class32 {

	@ObfuscatedName("hb.C")
	public int[] field512;

	@ObfuscatedName("hb.H")
	public int field517;

	@ObfuscatedName("hb.D")
	public int field513;

	@ObfuscatedName("hb.I")
	public int field518;

	@ObfuscatedName("hb.E")
	public int field514;

	@ObfuscatedName("hb.G")
	public int field516;

	@ObfuscatedName("hb.F")
	public int field515;

	public class34(int arg0, int arg1) {
		field512 = new int[arg0 * arg1];
		field513 = field517 = arg0;
		field514 = field518 = arg1;
		field515 = field516 = 0;
	}

	public class34(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field513 = var3.getWidth(arg1);
			field514 = var3.getHeight(arg1);
			field517 = field513;
			field518 = field514;
			field515 = 0;
			field516 = 0;
			field512 = new int[field514 * field513];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field513, field514, field512, 0, field513);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class34(class47 arg0, String arg1, int arg2) {
		class37 var4 = new class37(arg0.method242(null, arg1 + ".dat"));
		class37 var5 = new class37(arg0.method242(null, "index.dat"));
		var5.field537 = var4.method203();
		field517 = var5.method203();
		field518 = var5.method203();
		int var6 = var5.method201();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method205();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field537 += 2;
			var4.field537 += var5.method203() * var5.method203();
			var5.field537++;
		}

		field515 = var5.method201();
		field516 = var5.method201();
		field513 = var5.method203();
		field514 = var5.method203();
		int var10 = var5.method201();
		int var11 = field514 * field513;
		field512 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field512[var12] = var7[var4.method201()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field513; var13++) {
				for (int var14 = 0; var14 < field514; var14++) {
					field512[field513 * var14 + var13] = var7[var4.method201()];
				}
			}
		}
	}

	@ObfuscatedName("hb.c(I)V")
	public void method166() {
		class32.method141(field513, field512, field514);
	}

	@ObfuscatedName("hb.a(III)V")
	public void method167(int arg0, int arg1) {
		arg1 += field515;
		arg0 += field516;
		int var3 = class32.field480 * arg0 + arg1;
		int var4 = 0;
		int var5 = field514;
		int var6 = field513;
		int var7 = class32.field480 - var6;
		int var8 = 0;

		if (arg0 < class32.field482) {
			int var9 = class32.field482 - arg0;
			var5 -= var9;
			arg0 = class32.field482;
			var4 += var6 * var9;
			var3 += class32.field480 * var9;
		}

		if (arg0 + var5 > class32.field483) {
			var5 -= arg0 + var5 - class32.field483;
		}

		if (arg1 < class32.field484) {
			int var10 = class32.field484 - arg1;
			var6 -= var10;
			arg1 = class32.field484;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class32.field485) {
			int var11 = arg1 + var6 - class32.field485;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method168(var6, var5, var3, class32.field479, field512, var4, var7, var8);
		}
	}

	@ObfuscatedName("hb.a(III[II[IIII)V")
	public void method168(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg1; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg3[arg2++] = arg4[arg5++];
				arg3[arg2++] = arg4[arg5++];
				arg3[arg2++] = arg4[arg5++];
				arg3[arg2++] = arg4[arg5++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg3[arg2++] = arg4[arg5++];
			}

			arg2 += arg6;
			arg5 += arg7;
		}
	}

	@ObfuscatedName("hb.b(III)V")
	public void method169(int arg0, int arg1) {
		arg1 += field515;
		arg0 += field516;
		int var3 = class32.field480 * arg0 + arg1;
		int var4 = 0;
		int var5 = field514;
		int var6 = field513;
		int var7 = class32.field480 - var6;
		int var8 = 0;

		if (arg0 < class32.field482) {
			int var9 = class32.field482 - arg0;
			var5 -= var9;
			arg0 = class32.field482;
			var4 += var6 * var9;
			var3 += class32.field480 * var9;
		}

		if (arg0 + var5 > class32.field483) {
			var5 -= arg0 + var5 - class32.field483;
		}

		if (arg1 < class32.field484) {
			int var10 = class32.field484 - arg1;
			var6 -= var10;
			arg1 = class32.field484;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class32.field485) {
			int var11 = arg1 + var6 - class32.field485;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method170(class32.field479, field512, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("hb.a([I[IIIIIIII)V")
	public void method170(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("hb.a(ZIII)V")
	public void method171(int arg0, int arg1, int arg2) {
		arg0 += field515;
		arg2 += field516;
		int var4 = class32.field480 * arg2 + arg0;
		int var5 = 0;
		int var6 = field514;
		int var7 = field513;
		int var8 = class32.field480 - var7;
		int var9 = 0;

		if (arg2 < class32.field482) {
			int var10 = class32.field482 - arg2;
			var6 -= var10;
			arg2 = class32.field482;
			var5 += var7 * var10;
			var4 += class32.field480 * var10;
		}

		if (arg2 + var6 > class32.field483) {
			var6 -= arg2 + var6 - class32.field483;
		}

		if (arg0 < class32.field484) {
			int var11 = class32.field484 - arg0;
			var7 -= var11;
			arg0 = class32.field484;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > class32.field485) {
			int var12 = arg0 + var7 - class32.field485;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method172(field512, var7, arg1, var5, var6, var9, class32.field479, var8, 0, var4);
		}
	}

	@ObfuscatedName("hb.a([IIIIIBI[IIII)V")
	public void method172(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg2;
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = arg0[arg3++];
				if (var14 == 0) {
					arg9++;
				} else {
					int var15 = arg6[arg9];
					arg6[arg9++] = ((var14 & 0xFF00FF) * arg2 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg2 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg9 += arg7;
			arg3 += arg5;
		}
	}

	@ObfuscatedName("hb.a([IIII[IIIIII)V")
	public void method173(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		try {
			int var10 = -arg1 / 2;
			int var11 = -arg2 / 2;
			int var12 = (int) (Math.sin(arg7 / 326.11D) * 65536.0D);
			int var13 = (int) (Math.cos(arg7 / 326.11D) * 65536.0D);
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg8 << 16) + var11 * var13 - var10 * var12;
			int var16 = class32.field480 * arg5 + arg4;
			for (int var17 = 0; var17 < arg2; var17++) {
				int var18 = arg3[var17];
				int var19 = var16 + var18;
				int var20 = var13 * var18 + var14;
				int var21 = var15 - var12 * var18;
				for (int var22 = -arg0[var17]; var22 < 0; var22++) {
					class32.field479[var19++] = field512[(var20 >> 16) + (var21 >> 16) * field513];
					var20 += var13;
					var21 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += class32.field480;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("hb.a(IILib;I)V")
	public void method174(int arg0, class35 arg1, int arg2) {
		arg0 += field515;
		arg2 += field516;
		int var4 = class32.field480 * arg2 + arg0;
		int var5 = 0;
		int var6 = field514;
		int var7 = field513;
		int var8 = class32.field480 - var7;
		int var9 = 0;

		if (arg2 < class32.field482) {
			int var10 = class32.field482 - arg2;
			var6 -= var10;
			arg2 = class32.field482;
			var5 += var7 * var10;
			var4 += class32.field480 * var10;
		}

		if (arg2 + var6 > class32.field483) {
			var6 -= arg2 + var6 - class32.field483;
		}

		if (arg0 < class32.field484) {
			int var11 = class32.field484 - arg0;
			var7 -= var11;
			arg0 = class32.field484;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > class32.field485) {
			int var12 = arg0 + var7 - class32.field485;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method175(var5, 0, class32.field479, var7, var6, field512, var9, var4, var8, arg1.field519);
		}
	}

	@ObfuscatedName("hb.a(II[III[IZIII[B)V")
	public void method175(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		int var11 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg5[arg0++];
				if (var14 != 0 && arg9[arg7] == 0) {
					arg2[arg7++] = var14;
				} else {
					arg7++;
				}

				int var15 = arg5[arg0++];
				if (var15 != 0 && arg9[arg7] == 0) {
					arg2[arg7++] = var15;
				} else {
					arg7++;
				}

				int var16 = arg5[arg0++];
				if (var16 != 0 && arg9[arg7] == 0) {
					arg2[arg7++] = var16;
				} else {
					arg7++;
				}

				int var17 = arg5[arg0++];
				if (var17 != 0 && arg9[arg7] == 0) {
					arg2[arg7++] = var17;
				} else {
					arg7++;
				}
			}

			for (int var18 = arg3; var18 < 0; var18++) {
				int var19 = arg5[arg0++];
				if (var19 != 0 && arg9[arg7] == 0) {
					arg2[arg7++] = var19;
				} else {
					arg7++;
				}
			}

			arg7 += arg8;
			arg0 += arg6;
		}
	}
}
