package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("EPQDEJTO")
public final class Pix32 extends Pix2D {

	@ObfuscatedName("EPQDEJTO.I")
	public int[] field599;

	@ObfuscatedName("EPQDEJTO.N")
	public int field604;

	@ObfuscatedName("EPQDEJTO.J")
	public int field600;

	@ObfuscatedName("EPQDEJTO.O")
	public int field605;

	@ObfuscatedName("EPQDEJTO.K")
	public int field601;

	@ObfuscatedName("EPQDEJTO.M")
	public int field603;

	@ObfuscatedName("EPQDEJTO.L")
	public int field602;

	public Pix32(int arg0, int arg1) {
		field599 = new int[arg0 * arg1];
		field600 = field604 = arg0;
		field601 = field605 = arg1;
		field602 = field603 = 0;
	}

	public Pix32(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field600 = var3.getWidth(arg1);
			field601 = var3.getHeight(arg1);
			field604 = field600;
			field605 = field601;
			field602 = 0;
			field603 = 0;
			field599 = new int[field601 * field600];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field600, field601, field599, 0, field600);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public Pix32(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.method2(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.method2("index.dat", null));
		var5.pos = var4.g2();
		field604 = var5.g2();
		field605 = var5.g2();
		int var6 = var5.g1();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.g3();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}

		field602 = var5.g1();
		field603 = var5.g1();
		field600 = var5.g2();
		field601 = var5.g2();
		int var10 = var5.g1();
		int var11 = field601 * field600;
		field599 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field599[var12] = var7[var4.g1()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field600; var13++) {
				for (int var14 = 0; var14 < field601; var14++) {
					field599[field600 * var14 + var13] = var7[var4.g1()];
				}
			}
		}
	}

	@ObfuscatedName("EPQDEJTO.a(Z)V")
	public void method190() {
		Pix2D.method332(field600, field601, field599);
	}

	@ObfuscatedName("EPQDEJTO.a(IIII)V")
	public void method191(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field599.length; var4++) {
			int var5 = field599[var4];
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

				field599[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("EPQDEJTO.b(I)V")
	public void method192() {
		int[] var1 = new int[field605 * field604];
		for (int var2 = 0; var2 < field601; var2++) {
			for (int var3 = 0; var3 < field600; var3++) {
				var1[(field603 + var2) * field604 + field602 + var3] = field599[field600 * var2 + var3];
			}
		}

		field599 = var1;
		field600 = field604;
		field601 = field605;
		field602 = 0;
		field603 = 0;
	}

	@ObfuscatedName("EPQDEJTO.a(III)V")
	public void method193(int arg0, int arg1) {
		arg1 += field602;
		arg0 += field603;
		int var3 = Pix2D.field950 * arg0 + arg1;
		int var4 = 0;
		int var5 = field601;
		int var6 = field600;
		int var7 = Pix2D.field950 - var6;
		int var8 = 0;

		if (arg0 < Pix2D.field952) {
			int var9 = Pix2D.field952 - arg0;
			var5 -= var9;
			arg0 = Pix2D.field952;
			var4 += var6 * var9;
			var3 += Pix2D.field950 * var9;
		}

		if (arg0 + var5 > Pix2D.field953) {
			var5 -= arg0 + var5 - Pix2D.field953;
		}

		if (arg1 < Pix2D.field954) {
			int var10 = Pix2D.field954 - arg1;
			var6 -= var10;
			arg1 = Pix2D.field954;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > Pix2D.field955) {
			int var11 = arg1 + var6 - Pix2D.field955;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method194(var6, var7, var5, field599, var4, var8, var3, Pix2D.field949);
		}
	}

	@ObfuscatedName("EPQDEJTO.a(III[IIIIB[I)V")
	public void method194(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg2; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg7[arg6++] = arg3[arg4++];
				arg7[arg6++] = arg3[arg4++];
				arg7[arg6++] = arg3[arg4++];
				arg7[arg6++] = arg3[arg4++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg7[arg6++] = arg3[arg4++];
			}

			arg6 += arg1;
			arg4 += arg5;
		}
	}

	@ObfuscatedName("EPQDEJTO.b(III)V")
	public void method195(int arg0, int arg1) {
		arg1 += field602;
		arg0 += field603;
		int var3 = Pix2D.field950 * arg0 + arg1;
		int var4 = 0;
		int var5 = field601;
		int var6 = field600;
		int var7 = Pix2D.field950 - var6;
		int var8 = 0;

		if (arg0 < Pix2D.field952) {
			int var9 = Pix2D.field952 - arg0;
			var5 -= var9;
			arg0 = Pix2D.field952;
			var4 += var6 * var9;
			var3 += Pix2D.field950 * var9;
		}

		if (arg0 + var5 > Pix2D.field953) {
			var5 -= arg0 + var5 - Pix2D.field953;
		}

		if (arg1 < Pix2D.field954) {
			int var10 = Pix2D.field954 - arg1;
			var6 -= var10;
			arg1 = Pix2D.field954;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > Pix2D.field955) {
			int var11 = arg1 + var6 - Pix2D.field955;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method196(Pix2D.field949, field599, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("EPQDEJTO.a([I[IIIIIIII)V")
	public void method196(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("EPQDEJTO.b(IIII)V")
	public void method197(int arg0, int arg1, int arg2) {
		arg0 += field602;
		arg1 += field603;
		int var4 = Pix2D.field950 * arg1 + arg0;
		int var5 = 0;
		int var6 = field601;
		int var7 = field600;
		int var8 = Pix2D.field950 - var7;
		int var9 = 0;

		if (arg1 < Pix2D.field952) {
			int var10 = Pix2D.field952 - arg1;
			var6 -= var10;
			arg1 = Pix2D.field952;
			var5 += var7 * var10;
			var4 += Pix2D.field950 * var10;
		}

		if (arg1 + var6 > Pix2D.field953) {
			var6 -= arg1 + var6 - Pix2D.field953;
		}

		if (arg0 < Pix2D.field954) {
			int var11 = Pix2D.field954 - arg0;
			var7 -= var11;
			arg0 = Pix2D.field954;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > Pix2D.field955) {
			int var12 = arg0 + var7 - Pix2D.field955;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method198(var7, var9, 0, var8, var5, arg2, var4, var6, Pix2D.field949, field599);
		}
	}

	@ObfuscatedName("EPQDEJTO.a(IIIIIIIII[I[I)V")
	public void method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		int var11 = 256 - arg5;
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = arg9[arg4++];
				if (var14 == 0) {
					arg6++;
				} else {
					int var15 = arg8[arg6];
					arg8[arg6++] = ((var14 & 0xFF00FF) * arg5 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg5 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg6 += arg3;
			arg4 += arg1;
		}
	}

	@ObfuscatedName("EPQDEJTO.a(IIIII[IIII[II)V")
	public void method199(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		try {
			int var11 = -arg3 / 2;
			int var12 = -arg1 / 2;
			int var13 = (int) (Math.sin(arg6 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg6 / 326.11D) * 65536.0D);
			var13 = arg7 * var13 >> 8;
			var14 = arg7 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg9 << 16) + var12 * var14 - var11 * var13;
			int var17 = Pix2D.field950 * arg0 + arg5;
			for (int var18 = 0; var18 < arg1; var18++) {
				int var19 = arg8[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg4[var18]; var23 < 0; var23++) {
					Pix2D.field949[var20++] = field599[(var21 >> 16) + (var22 >> 16) * field600];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += Pix2D.field950;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("EPQDEJTO.a(IIIIIIIDI)V")
	public void method200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
		try {
			int var10 = -arg5 / 2;
			int var11 = -arg4 / 2;
			int var12 = (int) (Math.sin(arg6) * 65536.0D);
			int var13 = (int) (Math.cos(arg6) * 65536.0D);
			var12 = arg0 * var12 >> 8;
			var13 = arg0 * var13 >> 8;
			int var14 = (arg1 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg3 << 16) + var11 * var13 - var10 * var12;
			int var16 = Pix2D.field950 * arg7 + arg2;
			for (int var17 = 0; var17 < arg4; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg5; var21 < 0; var21++) {
					int var22 = field599[(var19 >> 16) + (var20 >> 16) * field600];
					if (var22 == 0) {
						var18++;
					} else {
						Pix2D.field949[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += Pix2D.field950;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("EPQDEJTO.a(LWRRBQEHV;III)V")
	public void method201(Pix8 arg0, int arg1, int arg2) {
		arg2 += field602;
		arg1 += field603;
		int var4 = Pix2D.field950 * arg1 + arg2;
		int var5 = 0;
		int var6 = field601;
		int var7 = field600;
		int var8 = Pix2D.field950 - var7;
		int var9 = 0;

		if (arg1 < Pix2D.field952) {
			int var10 = Pix2D.field952 - arg1;
			var6 -= var10;
			arg1 = Pix2D.field952;
			var5 += var7 * var10;
			var4 += Pix2D.field950 * var10;
		}

		if (arg1 + var6 > Pix2D.field953) {
			var6 -= arg1 + var6 - Pix2D.field953;
		}

		if (arg2 < Pix2D.field954) {
			int var11 = Pix2D.field954 - arg2;
			var7 -= var11;
			arg2 = Pix2D.field954;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > Pix2D.field955) {
			int var12 = arg2 + var7 - Pix2D.field955;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method202(var4, var8, field599, var7, Pix2D.field949, arg0.field1336, var6, var5, 0, var9);
		}
	}

	@ObfuscatedName("EPQDEJTO.a(II[II[I[BIIIII)V")
	public void method202(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg2[arg7++];
				if (var14 != 0 && arg5[arg0] == 0) {
					arg4[arg0++] = var14;
				} else {
					arg0++;
				}

				int var15 = arg2[arg7++];
				if (var15 != 0 && arg5[arg0] == 0) {
					arg4[arg0++] = var15;
				} else {
					arg0++;
				}

				int var16 = arg2[arg7++];
				if (var16 != 0 && arg5[arg0] == 0) {
					arg4[arg0++] = var16;
				} else {
					arg0++;
				}

				int var17 = arg2[arg7++];
				if (var17 != 0 && arg5[arg0] == 0) {
					arg4[arg0++] = var17;
				} else {
					arg0++;
				}
			}

			for (int var18 = arg3; var18 < 0; var18++) {
				int var19 = arg2[arg7++];
				if (var19 != 0 && arg5[arg0] == 0) {
					arg4[arg0++] = var19;
				} else {
					arg0++;
				}
			}

			arg0 += arg1;
			arg7 += arg9;
		}
	}
}
