package deob;

@ObfuscatedName("jb")
public final class class36 extends class33 {

	@ObfuscatedName("jb.z")
	public byte[] field599;

	@ObfuscatedName("jb.F")
	public int field605;

	@ObfuscatedName("jb.G")
	public int field606;

	@ObfuscatedName("jb.A")
	public int[] field600;

	@ObfuscatedName("jb.D")
	public int field603;

	@ObfuscatedName("jb.E")
	public int field604;

	@ObfuscatedName("jb.B")
	public int field601;

	@ObfuscatedName("jb.C")
	public int field602;

	public class36(class50 arg0, String arg1, int arg2) {
		class38 var4 = new class38(arg0.method295(arg1 + ".dat", null));
		class38 var5 = new class38(arg0.method295("index.dat", null));
		var5.field617 = var4.method227();
		field605 = var5.method227();
		field606 = var5.method227();
		int var6 = var5.method225();
		field600 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field600[var7 + 1] = var5.method229();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field617 += 2;
			var4.field617 += var5.method227() * var5.method227();
			var5.field617++;
		}

		field603 = var5.method225();
		field604 = var5.method225();
		field601 = var5.method227();
		field602 = var5.method227();
		int var9 = var5.method225();
		int var10 = field602 * field601;
		field599 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field599[var11] = var4.method226();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field601; var12++) {
				for (int var13 = 0; var13 < field602; var13++) {
					field599[field601 * var13 + var12] = var4.method226();
				}
			}
		}
	}

	@ObfuscatedName("jb.a(I)V")
	public void method193() {
		field605 /= 2;
		field606 /= 2;
		byte[] var1 = new byte[field606 * field605];
		int var2 = 0;
		for (int var3 = 0; var3 < field602; var3++) {
			for (int var4 = 0; var4 < field601; var4++) {
				var1[(field603 + var4 >> 1) + (field604 + var3 >> 1) * field605] = field599[var2++];
			}
		}

		field599 = var1;
		field601 = field605;
		field602 = field606;
		field603 = 0;
		field604 = 0;
	}

	@ObfuscatedName("jb.a(B)V")
	public void method194() {
		if (field605 != field601 || field606 != field602) {
			byte[] var1 = new byte[field606 * field605];
			int var2 = 0;
			for (int var3 = 0; var3 < field602; var3++) {
				for (int var4 = 0; var4 < field601; var4++) {
					var1[(field604 + var3) * field605 + field603 + var4] = field599[var2++];
				}
			}

			field599 = var1;
			field601 = field605;
			field602 = field606;
			field603 = 0;
			field604 = 0;
		}
	}

	@ObfuscatedName("jb.b(I)V")
	public void method195() {
		byte[] var1 = new byte[field602 * field601];
		int var2 = 0;
		for (int var3 = 0; var3 < field602; var3++) {
			for (int var4 = field601 - 1; var4 >= 0; var4--) {
				var1[var2++] = field599[field601 * var3 + var4];
			}
		}

		field599 = var1;
		field603 = field605 - field601 - field603;
	}

	@ObfuscatedName("jb.c(I)V")
	public void method196() {
		byte[] var1 = new byte[field602 * field601];
		int var2 = 0;
		for (int var3 = field602 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field601; var4++) {
				var1[var2++] = field599[field601 * var3 + var4];
			}
		}

		field599 = var1;
		field604 = field606 - field602 - field604;
	}

	@ObfuscatedName("jb.a(IIZI)V")
	public void method197(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field600.length; var4++) {
			int var5 = field600[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field600[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field600[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field600[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("jb.a(IBI)V")
	public void method198(int arg0, int arg1) {
		arg0 += field603;
		arg1 += field604;
		int var3 = class33.field560 * arg1 + arg0;
		int var4 = 0;
		int var5 = field602;
		int var6 = field601;
		int var7 = class33.field560 - var6;
		int var8 = 0;

		if (arg1 < class33.field562) {
			int var9 = class33.field562 - arg1;
			var5 -= var9;
			arg1 = class33.field562;
			var4 += var6 * var9;
			var3 += class33.field560 * var9;
		}

		if (arg1 + var5 > class33.field563) {
			var5 -= arg1 + var5 - class33.field563;
		}

		if (arg0 < class33.field564) {
			int var10 = class33.field564 - arg0;
			var6 -= var10;
			arg0 = class33.field564;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class33.field565) {
			int var11 = arg0 + var6 - class33.field565;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method199(class33.field559, var3, var5, var7, var8, field600, var6, field599, var4);
		}
	}

	@ObfuscatedName("jb.a([IIIII[III[BI)V")
	public void method199(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, byte[] arg7, int arg8) {
		int var10 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg7[arg8++];
				if (var13 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg5[var13 & 0xFF];
				}

				byte var14 = arg7[arg8++];
				if (var14 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg5[var14 & 0xFF];
				}

				byte var15 = arg7[arg8++];
				if (var15 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg5[var15 & 0xFF];
				}

				byte var16 = arg7[arg8++];
				if (var16 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg5[var16 & 0xFF];
				}
			}

			for (int var17 = arg6; var17 < 0; var17++) {
				byte var18 = arg7[arg8++];
				if (var18 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg5[var18 & 0xFF];
				}
			}

			arg1 += arg3;
			arg8 += arg4;
		}
	}
}
