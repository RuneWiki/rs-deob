package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("gb")
public final class class33 extends class31 {

	@ObfuscatedName("gb.y")
	public int[] field500;

	@ObfuscatedName("gb.z")
	public int field501;

	@ObfuscatedName("gb.D")
	public int field505;

	@ObfuscatedName("gb.E")
	public int field506;

	@ObfuscatedName("gb.A")
	public int field502;

	@ObfuscatedName("gb.C")
	public int field504;

	@ObfuscatedName("gb.B")
	public int field503;

	public class33(int arg0, int arg1) {
		field500 = new int[arg0 * arg1];
		field501 = field505 = arg0;
		field502 = field506 = arg1;
		field503 = field504 = 0;
	}

	public class33(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field501 = var3.getWidth(arg1);
			field502 = var3.getHeight(arg1);
			field505 = field501;
			field506 = field502;
			field503 = 0;
			field504 = 0;
			field500 = new int[field502 * field501];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field501, field502, field500, 0, field501);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public class33(String arg0, int arg1, class46 arg2) {
		class36 var4 = new class36(arg2.method225(null, arg0 + ".dat"));
		class36 var5 = new class36(arg2.method225(null, "index.dat"));
		var5.field525 = var4.method187();
		field505 = var5.method187();
		field506 = var5.method187();
		int var6 = var5.method185();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method189();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg1; var9++) {
			var5.field525 += 2;
			var4.field525 += var5.method187() * var5.method187();
			var5.field525++;
		}

		field503 = var5.method185();
		field504 = var5.method185();
		field501 = var5.method187();
		field502 = var5.method187();
		int var10 = var5.method185();
		int var11 = field502 * field501;
		field500 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field500[var12] = var7[var4.method185()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field501; var13++) {
				for (int var14 = 0; var14 < field502; var14++) {
					field500[field501 * var14 + var13] = var7[var4.method185()];
				}
			}
		}
	}

	@ObfuscatedName("gb.b(I)V")
	public void method152() {
		class31.method127(field501, field500, field502);
	}

	@ObfuscatedName("gb.a(ZII)V")
	public void method153(int arg0, int arg1) {
		arg1 += field503;
		arg0 += field504;
		int var3 = class31.field468 * arg0 + arg1;
		int var4 = 0;
		int var5 = field502;
		int var6 = field501;
		int var7 = class31.field468 - var6;
		int var8 = 0;

		if (arg0 < class31.field470) {
			int var9 = class31.field470 - arg0;
			var5 -= var9;
			arg0 = class31.field470;
			var4 += var6 * var9;
			var3 += class31.field468 * var9;
		}

		if (arg0 + var5 > class31.field471) {
			var5 -= arg0 + var5 - class31.field471;
		}

		if (arg1 < class31.field472) {
			int var10 = class31.field472 - arg1;
			var6 -= var10;
			arg1 = class31.field472;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class31.field473) {
			int var11 = arg1 + var6 - class31.field473;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method154(var6, var8, class31.field467, var3, var7, field500, var4, var5);
		}
	}

	@ObfuscatedName("gb.a(III[III[III)V")
	public void method154(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg7; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg2[arg3++] = arg5[arg6++];
				arg2[arg3++] = arg5[arg6++];
				arg2[arg3++] = arg5[arg6++];
				arg2[arg3++] = arg5[arg6++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg2[arg3++] = arg5[arg6++];
			}

			arg3 += arg4;
			arg6 += arg1;
		}
	}

	@ObfuscatedName("gb.a(IZI)V")
	public void method155(int arg0, int arg1) {
		arg0 += field503;
		arg1 += field504;
		int var3 = class31.field468 * arg1 + arg0;
		int var4 = 0;
		int var5 = field502;
		int var6 = field501;
		int var7 = class31.field468 - var6;
		int var8 = 0;

		if (arg1 < class31.field470) {
			int var9 = class31.field470 - arg1;
			var5 -= var9;
			arg1 = class31.field470;
			var4 += var6 * var9;
			var3 += class31.field468 * var9;
		}

		if (arg1 + var5 > class31.field471) {
			var5 -= arg1 + var5 - class31.field471;
		}

		if (arg0 < class31.field472) {
			int var10 = class31.field472 - arg0;
			var6 -= var10;
			arg0 = class31.field472;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class31.field473) {
			int var11 = arg0 + var6 - class31.field473;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method156(class31.field467, field500, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("gb.a([I[IIIIIIII)V")
	public void method156(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("gb.a(IIII)V")
	public void method157(int arg0, int arg1, int arg2) {
		arg0 += field503;
		arg1 += field504;
		int var4 = class31.field468 * arg1 + arg0;
		int var5 = 0;
		int var6 = field502;
		int var7 = field501;
		int var8 = class31.field468 - var7;
		int var9 = 0;

		if (arg1 < class31.field470) {
			int var10 = class31.field470 - arg1;
			var6 -= var10;
			arg1 = class31.field470;
			var5 += var7 * var10;
			var4 += class31.field468 * var10;
		}

		if (arg1 + var6 > class31.field471) {
			var6 -= arg1 + var6 - class31.field471;
		}

		if (arg0 < class31.field472) {
			int var11 = class31.field472 - arg0;
			var7 -= var11;
			arg0 = class31.field472;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > class31.field473) {
			int var12 = arg0 + var7 - class31.field473;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method158(field500, var4, var9, 0, arg2, var5, var8, class31.field467, var6, var7);
		}
	}

	@ObfuscatedName("gb.a([IIIIIII[IIIB)V")
	public void method158(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg4;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg9; var13 < 0; var13++) {
				int var14 = arg0[arg5++];
				if (var14 == 0) {
					arg1++;
				} else {
					int var15 = arg7[arg1];
					arg7[arg1++] = ((var14 & 0xFF00FF) * arg4 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg4 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg1 += arg6;
			arg5 += arg2;
		}
	}

	@ObfuscatedName("gb.a(IIIIII[II[II)V")
	public void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg4 / 2;
			int var12 = (int) (Math.sin(arg3 / 326.11D) * 65536.0D);
			int var13 = (int) (Math.cos(arg3 / 326.11D) * 65536.0D);
			int var14 = (arg1 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg2 << 16) + var11 * var13 - var10 * var12;
			int var16 = class31.field468 * arg8 + arg0;
			for (int var17 = 0; var17 < arg4; var17++) {
				int var18 = arg7[var17];
				int var19 = var16 + var18;
				int var20 = var13 * var18 + var14;
				int var21 = var15 - var12 * var18;
				for (int var22 = -arg5[var17]; var22 < 0; var22++) {
					class31.field467[var19++] = field500[(var20 >> 16) + (var21 >> 16) * field501];
					var20 += var13;
					var21 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += class31.field468;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("gb.a(Lhb;III)V")
	public void method160(class34 arg0, int arg1, int arg2) {
		arg1 += field503;
		arg2 += field504;
		int var4 = class31.field468 * arg2 + arg1;
		int var5 = 0;
		int var6 = field502;
		int var7 = field501;
		int var8 = class31.field468 - var7;
		int var9 = 0;

		if (arg2 < class31.field470) {
			int var10 = class31.field470 - arg2;
			var6 -= var10;
			arg2 = class31.field470;
			var5 += var7 * var10;
			var4 += class31.field468 * var10;
		}

		if (arg2 + var6 > class31.field471) {
			var6 -= arg2 + var6 - class31.field471;
		}

		if (arg1 < class31.field472) {
			int var11 = class31.field472 - arg1;
			var7 -= var11;
			arg1 = class31.field472;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > class31.field473) {
			int var12 = arg1 + var7 - class31.field473;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method161(class31.field467, var5, 0, var6, var9, var4, var8, field500, arg0.field507, var7);
		}
	}

	@ObfuscatedName("gb.a([IIIIZIII[I[BI)V")
	public void method161(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, byte[] arg8, int arg9) {
		int var11 = -(arg9 >> 2);
		arg9 = -(arg9 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg7[arg1++];
				if (var14 != 0 && arg8[arg5] == 0) {
					arg0[arg5++] = var14;
				} else {
					arg5++;
				}

				int var15 = arg7[arg1++];
				if (var15 != 0 && arg8[arg5] == 0) {
					arg0[arg5++] = var15;
				} else {
					arg5++;
				}

				int var16 = arg7[arg1++];
				if (var16 != 0 && arg8[arg5] == 0) {
					arg0[arg5++] = var16;
				} else {
					arg5++;
				}

				int var17 = arg7[arg1++];
				if (var17 != 0 && arg8[arg5] == 0) {
					arg0[arg5++] = var17;
				} else {
					arg5++;
				}
			}

			for (int var18 = arg9; var18 < 0; var18++) {
				int var19 = arg7[arg1++];
				if (var19 != 0 && arg8[arg5] == 0) {
					arg0[arg5++] = var19;
				} else {
					arg5++;
				}
			}

			arg5 += arg6;
			arg1 += arg4;
		}
	}
}
