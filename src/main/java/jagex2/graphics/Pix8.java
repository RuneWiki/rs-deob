package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("kb")
public final class Pix8 extends Pix2D {

	@ObfuscatedName("kb.M")
	public int field607;

	@ObfuscatedName("kb.N")
	public int field608;

	@ObfuscatedName("kb.H")
	public int[] field602;

	@ObfuscatedName("kb.K")
	public int field605;

	@ObfuscatedName("kb.L")
	public int field606;

	@ObfuscatedName("kb.I")
	public int field603;

	@ObfuscatedName("kb.J")
	public int field604;

	@ObfuscatedName("kb.G")
	public byte[] field601;

	public Pix8(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.method308(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.method308("index.dat", null));
		var5.field621 = var4.method240();
		field607 = var5.method240();
		field608 = var5.method240();
		int var6 = var5.method238();
		field602 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field602[var7 + 1] = var5.method242();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field621 += 2;
			var4.field621 += var5.method240() * var5.method240();
			var5.field621++;
		}

		field605 = var5.method238();
		field606 = var5.method238();
		field603 = var5.method240();
		field604 = var5.method240();
		int var9 = var5.method238();
		int var10 = field604 * field603;
		field601 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field601[var11] = var4.method239();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field603; var12++) {
				for (int var13 = 0; var13 < field604; var13++) {
					field601[field603 * var13 + var12] = var4.method239();
				}
			}
		}
	}

	@ObfuscatedName("kb.a(I)V")
	public void method206() {
		field607 /= 2;
		field608 /= 2;
		byte[] var1 = new byte[field608 * field607];
		int var2 = 0;
		for (int var3 = 0; var3 < field604; var3++) {
			for (int var4 = 0; var4 < field603; var4++) {
				var1[(field605 + var4 >> 1) + (field606 + var3 >> 1) * field607] = field601[var2++];
			}
		}

		field601 = var1;
		field603 = field607;
		field604 = field608;
		field605 = 0;
		field606 = 0;
	}

	@ObfuscatedName("kb.b(Z)V")
	public void method207() {
		if (field607 != field603 || field608 != field604) {
			byte[] var1 = new byte[field608 * field607];
			int var2 = 0;
			for (int var3 = 0; var3 < field604; var3++) {
				for (int var4 = 0; var4 < field603; var4++) {
					var1[(field606 + var3) * field607 + field605 + var4] = field601[var2++];
				}
			}

			field601 = var1;
			field603 = field607;
			field604 = field608;
			field605 = 0;
			field606 = 0;
		}
	}

	@ObfuscatedName("kb.b(I)V")
	public void method208() {
		byte[] var1 = new byte[field604 * field603];
		int var2 = 0;
		for (int var3 = 0; var3 < field604; var3++) {
			for (int var4 = field603 - 1; var4 >= 0; var4--) {
				var1[var2++] = field601[field603 * var3 + var4];
			}
		}

		field601 = var1;
		field605 = field607 - field603 - field605;
	}

	@ObfuscatedName("kb.c(I)V")
	public void method209() {
		byte[] var1 = new byte[field604 * field603];
		int var2 = 0;
		for (int var3 = field604 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field603; var4++) {
				var1[var2++] = field601[field603 * var3 + var4];
			}
		}

		field601 = var1;
		field606 = field608 - field604 - field606;
	}

	@ObfuscatedName("kb.a(IIII)V")
	public void method210(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field602.length; var4++) {
			int var5 = field602[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field602[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field602[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field602[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("kb.a(BII)V")
	public void method211(int arg0, int arg1) {
		arg0 += field605;
		arg1 += field606;
		int var3 = Pix2D.field562 * arg1 + arg0;
		int var4 = 0;
		int var5 = field604;
		int var6 = field603;
		int var7 = Pix2D.field562 - var6;
		int var8 = 0;

		if (arg1 < Pix2D.field564) {
			int var9 = Pix2D.field564 - arg1;
			var5 -= var9;
			arg1 = Pix2D.field564;
			var4 += var6 * var9;
			var3 += Pix2D.field562 * var9;
		}

		if (arg1 + var5 > Pix2D.field565) {
			var5 -= arg1 + var5 - Pix2D.field565;
		}

		if (arg0 < Pix2D.field566) {
			int var10 = Pix2D.field566 - arg0;
			var6 -= var10;
			arg0 = Pix2D.field566;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > Pix2D.field567) {
			int var11 = arg0 + var6 - Pix2D.field567;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method212(var8, var5, var7, Pix2D.field561, var3, field601, field602, var6, var4);
		}
	}

	@ObfuscatedName("kb.a(IIII[II[B[III)V")
	public void method212(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8) {
		int var10 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg5[arg8++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg3[arg4++] = arg6[var13 & 0xFF];
				}

				byte var14 = arg5[arg8++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg3[arg4++] = arg6[var14 & 0xFF];
				}

				byte var15 = arg5[arg8++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg3[arg4++] = arg6[var15 & 0xFF];
				}

				byte var16 = arg5[arg8++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg3[arg4++] = arg6[var16 & 0xFF];
				}
			}

			for (int var17 = arg7; var17 < 0; var17++) {
				byte var18 = arg5[arg8++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg3[arg4++] = arg6[var18 & 0xFF];
				}
			}

			arg4 += arg2;
			arg8 += arg0;
		}
	}
}
