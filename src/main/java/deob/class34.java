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
		class37 var4 = new class37(arg0.method250(null, arg1 + ".dat"));
		class37 var5 = new class37(arg0.method250(null, "index.dat"));
		var5.field541 = var4.method211();
		field520 = var5.method211();
		field521 = var5.method211();
		int var6 = var5.method209();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method213();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field541 += 2;
			var4.field541 += var5.method211() * var5.method211();
			var5.field541++;
		}

		field518 = var5.method209();
		field519 = var5.method209();
		field516 = var5.method211();
		field517 = var5.method211();
		int var10 = var5.method209();
		int var11 = field517 * field516;
		field515 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field515[var12] = var7[var4.method209()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field516; var13++) {
				for (int var14 = 0; var14 < field517; var14++) {
					field515[field516 * var14 + var13] = var7[var4.method209()];
				}
			}
		}
	}

	@ObfuscatedName("hb.b(I)V")
	public void method170() {
		class32.method145(field516, field515, field517);
	}

	@ObfuscatedName("hb.a(III)V")
	public void method171(int arg0, int arg1) {
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
			method172(var5, var4, var7, var8, var6, class32.field482, var3, field515);
		}
	}

	@ObfuscatedName("hb.a(IIIIII[II[I)V")
	public void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7) {
		int var9 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg6++] = arg7[arg1++];
				arg5[arg6++] = arg7[arg1++];
				arg5[arg6++] = arg7[arg1++];
				arg5[arg6++] = arg7[arg1++];
			}

			for (int var12 = arg4; var12 < 0; var12++) {
				arg5[arg6++] = arg7[arg1++];
			}

			arg6 += arg2;
			arg1 += arg3;
		}
	}

	@ObfuscatedName("hb.b(III)V")
	public void method173(int arg0, int arg1) {
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
			method174(class32.field482, field515, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("hb.a([I[IIIIIIII)V")
	public void method174(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("hb.d(IIIII)V")
	public void method175(int arg0, int arg1, int arg2, int arg3) {
		try {
			int var5 = field516;
			int var6 = field517;
			int var7 = 0;
			int var8 = 0;
			int var9 = (var5 << 16) / arg2;
			int var10 = (var6 << 16) / arg3;
			int var11 = field520;
			int var12 = field521;
			int var13 = (var11 << 16) / arg2;
			int var14 = (var12 << 16) / arg3;
			arg1 += (field518 * arg2 + var11 - 1) / var11;
			arg0 += (field519 * arg3 + var12 - 1) / var12;

			if (field518 * arg2 % var11 != 0) {
				var7 = (var11 - field518 * arg2 % var11 << 16) / arg2;
			}

			if (field519 * arg3 % var12 != 0) {
				var8 = (var12 - field519 * arg3 % var12 << 16) / arg3;
			}

			arg2 = (field516 - (var7 >> 16)) * arg2 / var11;
			arg3 = (field517 - (var8 >> 16)) * arg3 / var12;
			int var15 = class32.field483 * arg0 + arg1;
			int var16 = class32.field483 - arg2;

			if (arg0 < class32.field485) {
				int var17 = class32.field485 - arg0;
				arg3 -= var17;
				arg0 = 0;
				var15 += class32.field483 * var17;
				var8 += var14 * var17;
			}

			if (arg0 + arg3 > class32.field486) {
				arg3 -= arg0 + arg3 - class32.field486;
			}

			if (arg1 < class32.field487) {
				int var18 = class32.field487 - arg1;
				arg2 -= var18;
				arg1 = 0;
				var15 += var18;
				var7 += var13 * var18;
				var16 += var18;
			}

			if (arg1 + arg2 > class32.field488) {
				int var19 = arg1 + arg2 - class32.field488;
				arg2 -= var19;
				var16 += var19;
			}

			method176(class32.field482, var8, 0, var5, field515, var15, arg3, var14, var7, var16, var13, arg2);
		} catch (Exception var20) {
			System.out.println("error in sprite clipping routine");
		}
	}

	@ObfuscatedName("hb.a([IBIII[IIIIIIII)V")
	public void method176(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		try {
			int var13 = arg8;
			for (int var14 = -arg6; var14 < 0; var14++) {
				int var15 = (arg1 >> 16) * arg3;
				for (int var16 = -arg11; var16 < 0; var16++) {
					int var17 = arg4[(arg8 >> 16) + var15];
					if (var17 == 0) {
						arg5++;
					} else {
						arg0[arg5++] = var17;
					}

					arg8 += arg10;
				}

				arg1 += arg7;
				arg8 = var13;
				arg5 += arg9;
			}
		} catch (Exception var18) {
			System.out.println("error in plot_scale");
		}
	}

	@ObfuscatedName("hb.a(IIII)V")
	public void method177(int arg0, int arg1, int arg2) {
		arg2 += field518;
		arg1 += field519;
		int var4 = class32.field483 * arg1 + arg2;
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
			method178(arg0, 0, var9, var5, class32.field482, var4, var6, field515, var8, var7);
		}
	}

	@ObfuscatedName("hb.a(IIII[III[IIII)V")
	public void method178(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg0;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg9; var13 < 0; var13++) {
				int var14 = arg7[arg3++];
				if (var14 == 0) {
					arg5++;
				} else {
					int var15 = arg4[arg5];
					arg4[arg5++] = ((var14 & 0xFF00FF) * arg0 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg0 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg5 += arg8;
			arg3 += arg2;
		}
	}

	@ObfuscatedName("hb.a(III[II[IIIZII)V")
	public void method179(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg1 / 2;
			int var12 = -arg7 / 2;
			int var13 = (int) (Math.sin(arg8 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg8 / 326.11D) * 65536.0D);
			var13 = arg9 * var13 >> 8;
			var14 = arg9 * var14 >> 8;
			int var15 = (arg6 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg2 << 16) + var12 * var14 - var11 * var13;
			int var17 = class32.field483 * arg0 + arg4;
			for (int var18 = 0; var18 < arg7; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg3[var18]; var23 < 0; var23++) {
					class32.field482[var20++] = field515[(var21 >> 16) + (var22 >> 16) * field516];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += class32.field483;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("hb.a(IIILib;)V")
	public void method180(int arg0, int arg1, class35 arg2) {
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
			method181(arg2.field522, var9, class32.field482, var4, var5, 0, field515, var8, var7, var6);
		}
	}

	@ObfuscatedName("hb.a([BI[IIII[IIBII)V")
	public void method181(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg8 >> 2);
		arg8 = -(arg8 & 0x3);
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg6[arg4++];
				if (var14 != 0 && arg0[arg3] == 0) {
					arg2[arg3++] = var14;
				} else {
					arg3++;
				}

				int var15 = arg6[arg4++];
				if (var15 != 0 && arg0[arg3] == 0) {
					arg2[arg3++] = var15;
				} else {
					arg3++;
				}

				int var16 = arg6[arg4++];
				if (var16 != 0 && arg0[arg3] == 0) {
					arg2[arg3++] = var16;
				} else {
					arg3++;
				}

				int var17 = arg6[arg4++];
				if (var17 != 0 && arg0[arg3] == 0) {
					arg2[arg3++] = var17;
				} else {
					arg3++;
				}
			}

			for (int var18 = arg8; var18 < 0; var18++) {
				int var19 = arg6[arg4++];
				if (var19 != 0 && arg0[arg3] == 0) {
					arg2[arg3++] = var19;
				} else {
					arg3++;
				}
			}

			arg3 += arg7;
			arg4 += arg1;
		}
	}
}
