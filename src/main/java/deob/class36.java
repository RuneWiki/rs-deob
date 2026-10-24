package deob;

@ObfuscatedName("jb")
public final class class36 extends class33 {

	@ObfuscatedName("jb.I")
	public int field604;

	@ObfuscatedName("jb.J")
	public int field605;

	@ObfuscatedName("jb.D")
	public int[] field599;

	@ObfuscatedName("jb.G")
	public int field602;

	@ObfuscatedName("jb.H")
	public int field603;

	@ObfuscatedName("jb.E")
	public int field600;

	@ObfuscatedName("jb.F")
	public int field601;

	@ObfuscatedName("jb.C")
	public byte[] field598;

	public class36(class50 arg0, String arg1, int arg2) {
		class38 var4 = new class38(arg0.method294(arg1 + ".dat", null));
		class38 var5 = new class38(arg0.method294("index.dat", null));
		var5.field616 = var4.method226();
		field604 = var5.method226();
		field605 = var5.method226();
		int var6 = var5.method224();
		field599 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field599[var7 + 1] = var5.method228();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field616 += 2;
			var4.field616 += var5.method226() * var5.method226();
			var5.field616++;
		}

		field602 = var5.method224();
		field603 = var5.method224();
		field600 = var5.method226();
		field601 = var5.method226();
		int var9 = var5.method224();
		int var10 = field601 * field600;
		field598 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field598[var11] = var4.method225();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field600; var12++) {
				for (int var13 = 0; var13 < field601; var13++) {
					field598[field600 * var13 + var12] = var4.method225();
				}
			}
		}
	}

	@ObfuscatedName("jb.b(Z)V")
	public void method193() {
		field604 /= 2;
		field605 /= 2;
		byte[] var1 = new byte[field605 * field604];
		int var2 = 0;
		for (int var3 = 0; var3 < field601; var3++) {
			for (int var4 = 0; var4 < field600; var4++) {
				var1[(field602 + var4 >> 1) + (field603 + var3 >> 1) * field604] = field598[var2++];
			}
		}

		field598 = var1;
		field600 = field604;
		field601 = field605;
		field602 = 0;
		field603 = 0;
	}

	@ObfuscatedName("jb.a(B)V")
	public void method194() {
		if (field604 != field600 || field605 != field601) {
			byte[] var1 = new byte[field605 * field604];
			int var2 = 0;
			for (int var3 = 0; var3 < field601; var3++) {
				for (int var4 = 0; var4 < field600; var4++) {
					var1[(field603 + var3) * field604 + field602 + var4] = field598[var2++];
				}
			}

			field598 = var1;
			field600 = field604;
			field601 = field605;
			field602 = 0;
			field603 = 0;
		}
	}

	@ObfuscatedName("jb.b(I)V")
	public void method195() {
		byte[] var1 = new byte[field601 * field600];
		int var2 = 0;
		for (int var3 = 0; var3 < field601; var3++) {
			for (int var4 = field600 - 1; var4 >= 0; var4--) {
				var1[var2++] = field598[field600 * var3 + var4];
			}
		}

		field598 = var1;
		field602 = field604 - field600 - field602;
	}

	@ObfuscatedName("jb.c(I)V")
	public void method196() {
		byte[] var1 = new byte[field601 * field600];
		int var2 = 0;
		for (int var3 = field601 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field600; var4++) {
				var1[var2++] = field598[field600 * var3 + var4];
			}
		}

		field598 = var1;
		field603 = field605 - field601 - field603;
	}

	@ObfuscatedName("jb.a(IIZI)V")
	public void method197(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field599.length; var4++) {
			int var5 = field599[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field599[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field599[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field599[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("jb.a(III)V")
	public void method198(int arg0, int arg1) {
		arg1 += field602;
		arg0 += field603;
		int var3 = class33.field559 * arg0 + arg1;
		int var4 = 0;
		int var5 = field601;
		int var6 = field600;
		int var7 = class33.field559 - var6;
		int var8 = 0;

		if (arg0 < class33.field561) {
			int var9 = class33.field561 - arg0;
			var5 -= var9;
			arg0 = class33.field561;
			var4 += var6 * var9;
			var3 += class33.field559 * var9;
		}

		if (arg0 + var5 > class33.field562) {
			var5 -= arg0 + var5 - class33.field562;
		}

		if (arg1 < class33.field563) {
			int var10 = class33.field563 - arg1;
			var6 -= var10;
			arg1 = class33.field563;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class33.field564) {
			int var11 = arg1 + var6 - class33.field564;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method199(field598, class33.field558, var6, field599, var7, var4, var3, var5, var8);
		}
	}

	@ObfuscatedName("jb.a([BB[II[IIIIII)V")
	public void method199(byte[] arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg0[arg5++];
				if (var13 == 0) {
					arg6++;
				} else {
					arg1[arg6++] = arg3[var13 & 0xFF];
				}

				byte var14 = arg0[arg5++];
				if (var14 == 0) {
					arg6++;
				} else {
					arg1[arg6++] = arg3[var14 & 0xFF];
				}

				byte var15 = arg0[arg5++];
				if (var15 == 0) {
					arg6++;
				} else {
					arg1[arg6++] = arg3[var15 & 0xFF];
				}

				byte var16 = arg0[arg5++];
				if (var16 == 0) {
					arg6++;
				} else {
					arg1[arg6++] = arg3[var16 & 0xFF];
				}
			}

			for (int var17 = arg2; var17 < 0; var17++) {
				byte var18 = arg0[arg5++];
				if (var18 == 0) {
					arg6++;
				} else {
					arg1[arg6++] = arg3[var18 & 0xFF];
				}
			}

			arg6 += arg4;
			arg5 += arg8;
		}
	}
}
