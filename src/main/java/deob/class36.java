package deob;

@ObfuscatedName("jb")
public final class class36 extends class33 {

	@ObfuscatedName("jb.G")
	public int field603;

	@ObfuscatedName("jb.H")
	public int field604;

	@ObfuscatedName("jb.B")
	public int[] field598;

	@ObfuscatedName("jb.E")
	public int field601;

	@ObfuscatedName("jb.F")
	public int field602;

	@ObfuscatedName("jb.C")
	public int field599;

	@ObfuscatedName("jb.D")
	public int field600;

	@ObfuscatedName("jb.A")
	public byte[] field597;

	public class36(class51 arg0, String arg1, int arg2) {
		class39 var4 = new class39(arg0.method298(arg1 + ".dat", null));
		class39 var5 = new class39(arg0.method298("index.dat", null));
		var5.field625 = var4.method230();
		field603 = var5.method230();
		field604 = var5.method230();
		int var6 = var5.method228();
		field598 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field598[var7 + 1] = var5.method232();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field625 += 2;
			var4.field625 += var5.method230() * var5.method230();
			var5.field625++;
		}

		field601 = var5.method228();
		field602 = var5.method228();
		field599 = var5.method230();
		field600 = var5.method230();
		int var9 = var5.method228();
		int var10 = field600 * field599;
		field597 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field597[var11] = var4.method229();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field599; var12++) {
				for (int var13 = 0; var13 < field600; var13++) {
					field597[field599 * var13 + var12] = var4.method229();
				}
			}
		}
	}

	@ObfuscatedName("jb.a(Z)V")
	public void method193() {
		field603 /= 2;
		field604 /= 2;
		byte[] var1 = new byte[field604 * field603];
		int var2 = 0;
		for (int var3 = 0; var3 < field600; var3++) {
			for (int var4 = 0; var4 < field599; var4++) {
				var1[(field601 + var4 >> 1) + (field602 + var3 >> 1) * field603] = field597[var2++];
			}
		}

		field597 = var1;
		field599 = field603;
		field600 = field604;
		field601 = 0;
		field602 = 0;
	}

	@ObfuscatedName("jb.c(I)V")
	public void method194() {
		if (field603 != field599 || field604 != field600) {
			byte[] var1 = new byte[field604 * field603];
			int var2 = 0;
			for (int var3 = 0; var3 < field600; var3++) {
				for (int var4 = 0; var4 < field599; var4++) {
					var1[(field602 + var3) * field603 + field601 + var4] = field597[var2++];
				}
			}

			field597 = var1;
			field599 = field603;
			field600 = field604;
			field601 = 0;
			field602 = 0;
		}
	}

	@ObfuscatedName("jb.b(Z)V")
	public void method195() {
		byte[] var1 = new byte[field600 * field599];
		int var2 = 0;
		for (int var3 = 0; var3 < field600; var3++) {
			for (int var4 = field599 - 1; var4 >= 0; var4--) {
				var1[var2++] = field597[field599 * var3 + var4];
			}
		}

		field597 = var1;
		field601 = field603 - field599 - field601;
	}

	@ObfuscatedName("jb.d(I)V")
	public void method196() {
		byte[] var1 = new byte[field600 * field599];
		int var2 = 0;
		for (int var3 = field600 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field599; var4++) {
				var1[var2++] = field597[field599 * var3 + var4];
			}
		}

		field597 = var1;
		field602 = field604 - field600 - field602;
	}

	@ObfuscatedName("jb.a(IIIB)V")
	public void method197(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field598.length; var4++) {
			int var5 = field598[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field598[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field598[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field598[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("jb.a(BII)V")
	public void method198(int arg0, int arg1) {
		arg0 += field601;
		arg1 += field602;
		int var3 = class33.field558 * arg1 + arg0;
		int var4 = 0;
		int var5 = field600;
		int var6 = field599;
		int var7 = class33.field558 - var6;
		int var8 = 0;

		if (arg1 < class33.field560) {
			int var9 = class33.field560 - arg1;
			var5 -= var9;
			arg1 = class33.field560;
			var4 += var6 * var9;
			var3 += class33.field558 * var9;
		}

		if (arg1 + var5 > class33.field561) {
			var5 -= arg1 + var5 - class33.field561;
		}

		if (arg0 < class33.field562) {
			int var10 = class33.field562 - arg0;
			var6 -= var10;
			arg0 = class33.field562;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class33.field563) {
			int var11 = arg0 + var6 - class33.field563;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method199(field598, var6, field597, var3, var7, var5, class33.field557, var4, var8);
		}
	}

	@ObfuscatedName("jb.a([II[BIZII[III)V")
	public void method199(int[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
		int var10 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg7++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg0[var13 & 0xFF];
				}

				byte var14 = arg2[arg7++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg0[var14 & 0xFF];
				}

				byte var15 = arg2[arg7++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg0[var15 & 0xFF];
				}

				byte var16 = arg2[arg7++];
				if (var16 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg0[var16 & 0xFF];
				}
			}

			for (int var17 = arg1; var17 < 0; var17++) {
				byte var18 = arg2[arg7++];
				if (var18 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg0[var18 & 0xFF];
				}
			}

			arg3 += arg4;
			arg7 += arg8;
		}
	}
}
