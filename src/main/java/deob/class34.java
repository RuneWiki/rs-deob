package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("hb")
public final class class34 extends class32 {

	@ObfuscatedName("hb.E")
	public int[] field515;

	@ObfuscatedName("hb.J")
	public int field520;

	@ObfuscatedName("hb.F")
	public int field516;

	@ObfuscatedName("hb.K")
	public int field521;

	@ObfuscatedName("hb.G")
	public int field517;

	@ObfuscatedName("hb.I")
	public int field519;

	@ObfuscatedName("hb.H")
	public int field518;

	public class34(int arg0, int arg1) {
		field515 = new int[arg0 * arg1];
		field516 = field520 = arg0;
		field517 = field521 = arg1;
		field518 = field519 = 0;
	}

	public class34(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field516 = var3.getWidth(arg1);
			field517 = var3.getHeight(arg1);
			field520 = field516;
			field521 = field517;
			field518 = 0;
			field519 = 0;
			field515 = new int[field517 * field516];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field516, field517, field515, 0, field516);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class34(class47 arg0, String arg1, int arg2) {
		class37 var4 = new class37(arg0.method249(arg1 + ".dat", null));
		class37 var5 = new class37(arg0.method249("index.dat", null));
		var5.field540 = var4.method210();
		field520 = var5.method210();
		field521 = var5.method210();
		int var6 = var5.method208();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method212();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field540 += 2;
			var4.field540 += var5.method210() * var5.method210();
			var5.field540++;
		}

		field518 = var5.method208();
		field519 = var5.method208();
		field516 = var5.method210();
		field517 = var5.method210();
		int var10 = var5.method208();
		int var11 = field517 * field516;
		field515 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field515[var12] = var7[var4.method208()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field516; var13++) {
				for (int var14 = 0; var14 < field517; var14++) {
					field515[field516 * var14 + var13] = var7[var4.method208()];
				}
			}
		}
	}

	@ObfuscatedName("hb.a(I)V")
	public void method169() {
		class32.method144(field516, field517, field515);
	}

	@ObfuscatedName("hb.a(III)V")
	public void method170(int arg0, int arg1) {
		arg1 += field518;
		arg0 += field519;
		int var3 = class32.field483 * arg0 + arg1;
		int var4 = 0;
		int var5 = field517;
		int var6 = field516;
		int var7 = class32.field483 - var6;
		int var8 = 0;

		if (arg0 < class32.field485) {
			int var9 = class32.field485 - arg0;
			var5 -= var9;
			arg0 = class32.field485;
			var4 += var6 * var9;
			var3 += class32.field483 * var9;
		}

		if (arg0 + var5 > class32.field486) {
			var5 -= arg0 + var5 - class32.field486;
		}

		if (arg1 < class32.field487) {
			int var10 = class32.field487 - arg1;
			var6 -= var10;
			arg1 = class32.field487;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class32.field488) {
			int var11 = arg1 + var6 - class32.field488;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method171(var6, var3, field515, var7, var5, var8, var4, class32.field482);
		}
	}

	@ObfuscatedName("hb.a(IIB[IIIII[I)V")
	public void method171(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg4; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg7[arg1++] = arg2[arg6++];
				arg7[arg1++] = arg2[arg6++];
				arg7[arg1++] = arg2[arg6++];
				arg7[arg1++] = arg2[arg6++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg7[arg1++] = arg2[arg6++];
			}

			arg1 += arg3;
			arg6 += arg5;
		}
	}

	@ObfuscatedName("hb.b(III)V")
	public void method172(int arg0, int arg1) {
		arg0 += field518;
		arg1 += field519;
		int var3 = class32.field483 * arg1 + arg0;
		int var4 = 0;
		int var5 = field517;
		int var6 = field516;
		int var7 = class32.field483 - var6;
		int var8 = 0;

		if (arg1 < class32.field485) {
			int var9 = class32.field485 - arg1;
			var5 -= var9;
			arg1 = class32.field485;
			var4 += var6 * var9;
			var3 += class32.field483 * var9;
		}

		if (arg1 + var5 > class32.field486) {
			var5 -= arg1 + var5 - class32.field486;
		}

		if (arg0 < class32.field487) {
			int var10 = class32.field487 - arg0;
			var6 -= var10;
			arg0 = class32.field487;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class32.field488) {
			int var11 = arg0 + var6 - class32.field488;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method173(class32.field482, field515, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("hb.a([I[IIIIIIII)V")
	public void method173(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("hb.a(IIIIB)V")
	public void method174(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var5 = field516;
			int var6 = field517;
			int var7 = 0;
			int var8 = 0;
			int var9 = (var5 << 16) / arg1;
			int var10 = (var6 << 16) / arg0;
			int var11 = field520;
			int var12 = field521;
			int var13 = (var11 << 16) / arg1;
			int var14 = (var12 << 16) / arg0;
			arg3 += (field518 * arg1 + var11 - 1) / var11;
			arg2 += (field519 * arg0 + var12 - 1) / var12;

			if (field518 * arg1 % var11 != 0) {
				var7 = (var11 - field518 * arg1 % var11 << 16) / arg1;
			}

			if (field519 * arg0 % var12 != 0) {
				var8 = (var12 - field519 * arg0 % var12 << 16) / arg0;
			}

			arg1 = (field516 - (var7 >> 16)) * arg1 / var11;
			arg0 = (field517 - (var8 >> 16)) * arg0 / var12;
			int var15 = class32.field483 * arg2 + arg3;
			int var16 = class32.field483 - arg1;

			if (arg2 < class32.field485) {
				int var17 = class32.field485 - arg2;
				arg0 -= var17;
				arg2 = 0;
				var15 += class32.field483 * var17;
				var8 += var14 * var17;
			}

			if (arg0 + arg2 > class32.field486) {
				arg0 -= arg0 + arg2 - class32.field486;
			}

			if (arg3 < class32.field487) {
				int var18 = class32.field487 - arg3;
				arg1 -= var18;
				arg3 = 0;
				var15 += var18;
				var7 += var13 * var18;
				var16 += var18;
			}

			if (arg1 + arg3 > class32.field488) {
				int var19 = arg1 + arg3 - class32.field488;
				arg1 -= var19;
				var16 += var19;
			}

			method175(var7, var16, class32.field482, 0, var8, arg0, arg1, var15, var14, field515, var5, var13);
		} catch (Exception var20) {
			System.out.println("error in sprite clipping routine");
		}
	}

	@ObfuscatedName("hb.a(II[IIBIIIII[III)V")
	public void method175(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11) {
		try {
			int var13 = arg0;
			for (int var14 = -arg5; var14 < 0; var14++) {
				int var15 = (arg4 >> 16) * arg10;
				for (int var16 = -arg6; var16 < 0; var16++) {
					int var17 = arg9[(arg0 >> 16) + var15];
					if (var17 == 0) {
						arg7++;
					} else {
						arg2[arg7++] = var17;
					}

					arg0 += arg11;
				}

				arg4 += arg8;
				arg0 = var13;
				arg7 += arg1;
			}
		} catch (Exception var18) {
			System.out.println("error in plot_scale");
		}
	}

	@ObfuscatedName("hb.a(IBII)V")
	public void method176(int arg0, int arg1, int arg2) {
		arg0 += field518;
		arg1 += field519;
		int var4 = class32.field483 * arg1 + arg0;
		int var5 = 0;
		int var6 = field517;
		int var7 = field516;
		int var8 = class32.field483 - var7;
		int var9 = 0;

		if (arg1 < class32.field485) {
			int var10 = class32.field485 - arg1;
			var6 -= var10;
			arg1 = class32.field485;
			var5 += var7 * var10;
			var4 += class32.field483 * var10;
		}

		if (arg1 + var6 > class32.field486) {
			var6 -= arg1 + var6 - class32.field486;
		}

		if (arg0 < class32.field487) {
			int var11 = class32.field487 - arg0;
			var7 -= var11;
			arg0 = class32.field487;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > class32.field488) {
			int var12 = arg0 + var7 - class32.field488;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method177(arg2, var7, 0, var8, var6, field515, var5, class32.field482, var4, var9);
		}
	}

	@ObfuscatedName("hb.a(IIIIII[II[III)V")
	public void method177(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg0;
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = arg5[arg6++];
				if (var14 == 0) {
					arg8++;
				} else {
					int var15 = arg7[arg8];
					arg7[arg8++] = ((var14 & 0xFF00FF) * arg0 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg0 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg8 += arg3;
			arg6 += arg9;
		}
	}

	@ObfuscatedName("hb.a(I[IIIIIIII[I)V")
	public void method178(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg5 / 2;
			int var12 = (int) (Math.sin(arg2 / 326.11D) * 65536.0D);
			int var13 = (int) (Math.cos(arg2 / 326.11D) * 65536.0D);
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = class32.field483 * arg3 + arg7;
			for (int var17 = 0; var17 < arg5; var17++) {
				int var18 = arg8[var17];
				int var19 = var16 + var18;
				int var20 = var13 * var18 + var14;
				int var21 = var15 - var12 * var18;
				for (int var22 = -arg1[var17]; var22 < 0; var22++) {
					class32.field482[var19++] = field515[(var20 >> 16) + (var21 >> 16) * field516];
					var20 += var13;
					var21 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += class32.field483;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("hb.a(ILib;ZI)V")
	public void method179(int arg0, class35 arg1, int arg2) {
		arg2 += field518;
		arg0 += field519;
		int var4 = class32.field483 * arg0 + arg2;
		int var5 = 0;
		int var6 = field517;
		int var7 = field516;
		int var8 = class32.field483 - var7;
		int var9 = 0;

		if (arg0 < class32.field485) {
			int var10 = class32.field485 - arg0;
			var6 -= var10;
			arg0 = class32.field485;
			var5 += var7 * var10;
			var4 += class32.field483 * var10;
		}

		if (arg0 + var6 > class32.field486) {
			var6 -= arg0 + var6 - class32.field486;
		}

		if (arg2 < class32.field487) {
			int var11 = class32.field487 - arg2;
			var7 -= var11;
			arg2 = class32.field487;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > class32.field488) {
			int var12 = arg2 + var7 - class32.field488;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method180(var5, var9, arg1.field522, var4, var6, 0, var7, field515, class32.field482, var8);
		}
	}

	@ObfuscatedName("hb.a(BII[BIIII[I[II)V")
	public void method180(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8, int arg9) {
		int var11 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg7[arg0++];
				if (var14 != 0 && arg2[arg3] == 0) {
					arg8[arg3++] = var14;
				} else {
					arg3++;
				}

				int var15 = arg7[arg0++];
				if (var15 != 0 && arg2[arg3] == 0) {
					arg8[arg3++] = var15;
				} else {
					arg3++;
				}

				int var16 = arg7[arg0++];
				if (var16 != 0 && arg2[arg3] == 0) {
					arg8[arg3++] = var16;
				} else {
					arg3++;
				}

				int var17 = arg7[arg0++];
				if (var17 != 0 && arg2[arg3] == 0) {
					arg8[arg3++] = var17;
				} else {
					arg3++;
				}
			}

			for (int var18 = arg6; var18 < 0; var18++) {
				int var19 = arg7[arg0++];
				if (var19 != 0 && arg2[arg3] == 0) {
					arg8[arg3++] = var19;
				} else {
					arg3++;
				}
			}

			arg3 += arg9;
			arg0 += arg1;
		}
	}
}
