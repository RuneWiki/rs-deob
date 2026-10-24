package deob;

@ObfuscatedName("jb")
public final class class36 extends class33 {

	@ObfuscatedName("jb.J")
	public int field610;

	@ObfuscatedName("jb.K")
	public int field611;

	@ObfuscatedName("jb.E")
	public int[] field605;

	@ObfuscatedName("jb.H")
	public int field608;

	@ObfuscatedName("jb.I")
	public int field609;

	@ObfuscatedName("jb.F")
	public int field606;

	@ObfuscatedName("jb.G")
	public int field607;

	@ObfuscatedName("jb.D")
	public byte[] field604;

	public class36(class50 arg0, String arg1, int arg2) {
		class38 var4 = new class38(arg0.method299(arg1 + ".dat", null));
		class38 var5 = new class38(arg0.method299("index.dat", null));
		var5.field622 = var4.method231();
		field610 = var5.method231();
		field611 = var5.method231();
		int var6 = var5.method229();
		field605 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field605[var7 + 1] = var5.method233();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field622 += 2;
			var4.field622 += var5.method231() * var5.method231();
			var5.field622++;
		}

		field608 = var5.method229();
		field609 = var5.method229();
		field606 = var5.method231();
		field607 = var5.method231();
		int var9 = var5.method229();
		int var10 = field607 * field606;
		field604 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field604[var11] = var4.method230();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field606; var12++) {
				for (int var13 = 0; var13 < field607; var13++) {
					field604[field606 * var13 + var12] = var4.method230();
				}
			}
		}
	}

	@ObfuscatedName("jb.c(Z)V")
	public void method194() {
		field610 /= 2;
		field611 /= 2;
		byte[] var1 = new byte[field611 * field610];
		int var2 = 0;
		for (int var3 = 0; var3 < field607; var3++) {
			for (int var4 = 0; var4 < field606; var4++) {
				var1[(field608 + var4 >> 1) + (field609 + var3 >> 1) * field610] = field604[var2++];
			}
		}

		field604 = var1;
		field606 = field610;
		field607 = field611;
		field608 = 0;
		field609 = 0;
	}

	@ObfuscatedName("jb.a(I)V")
	public void method195() {
		if (field610 != field606 || field611 != field607) {
			byte[] var1 = new byte[field611 * field610];
			int var2 = 0;
			for (int var3 = 0; var3 < field607; var3++) {
				for (int var4 = 0; var4 < field606; var4++) {
					var1[(field609 + var3) * field610 + field608 + var4] = field604[var2++];
				}
			}

			field604 = var1;
			field606 = field610;
			field607 = field611;
			field608 = 0;
			field609 = 0;
		}
	}

	@ObfuscatedName("jb.a(B)V")
	public void method196() {
		byte[] var1 = new byte[field607 * field606];
		int var2 = 0;
		for (int var3 = 0; var3 < field607; var3++) {
			for (int var4 = field606 - 1; var4 >= 0; var4--) {
				var1[var2++] = field604[field606 * var3 + var4];
			}
		}

		field604 = var1;
		field608 = field610 - field606 - field608;
	}

	@ObfuscatedName("jb.b(B)V")
	public void method197() {
		byte[] var1 = new byte[field607 * field606];
		int var2 = 0;
		for (int var3 = field607 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field606; var4++) {
				var1[var2++] = field604[field606 * var3 + var4];
			}
		}

		field604 = var1;
		field609 = field611 - field607 - field609;
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void method198(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field605.length; var4++) {
			int var5 = field605[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field605[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field605[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field605[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("jb.a(IZI)V")
	public void method199(int arg0, int arg1) {
		arg0 += field608;
		arg1 += field609;
		int var3 = class33.field565 * arg1 + arg0;
		int var4 = 0;
		int var5 = field607;
		int var6 = field606;
		int var7 = class33.field565 - var6;
		int var8 = 0;

		if (arg1 < class33.field567) {
			int var9 = class33.field567 - arg1;
			var5 -= var9;
			arg1 = class33.field567;
			var4 += var6 * var9;
			var3 += class33.field565 * var9;
		}

		if (arg1 + var5 > class33.field568) {
			var5 -= arg1 + var5 - class33.field568;
		}

		if (arg0 < class33.field569) {
			int var10 = class33.field569 - arg0;
			var6 -= var10;
			arg0 = class33.field569;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class33.field570) {
			int var11 = arg0 + var6 - class33.field570;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method200(var4, var5, field605, var3, field604, var7, var6, class33.field564, var8);
		}
	}

	@ObfuscatedName("jb.a(II[IIB[BII[II)V")
	public void method200(int arg0, int arg1, int[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg4[arg0++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2[var13 & 0xFF];
				}

				byte var14 = arg4[arg0++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2[var14 & 0xFF];
				}

				byte var15 = arg4[arg0++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2[var15 & 0xFF];
				}

				byte var16 = arg4[arg0++];
				if (var16 == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2[var16 & 0xFF];
				}
			}

			for (int var17 = arg6; var17 < 0; var17++) {
				byte var18 = arg4[arg0++];
				if (var18 == 0) {
					arg3++;
				} else {
					arg7[arg3++] = arg2[var18 & 0xFF];
				}
			}

			arg3 += arg5;
			arg0 += arg8;
		}
	}
}
