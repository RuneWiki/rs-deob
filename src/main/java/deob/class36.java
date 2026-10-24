package deob;

@ObfuscatedName("jb")
public final class class36 extends class33 {

	@ObfuscatedName("jb.I")
	public int field609;

	@ObfuscatedName("jb.J")
	public int field610;

	@ObfuscatedName("jb.D")
	public int[] field604;

	@ObfuscatedName("jb.G")
	public int field607;

	@ObfuscatedName("jb.H")
	public int field608;

	@ObfuscatedName("jb.E")
	public int field605;

	@ObfuscatedName("jb.F")
	public int field606;

	@ObfuscatedName("jb.C")
	public byte[] field603;

	public class36(class50 arg0, String arg1, int arg2) {
		class38 var4 = new class38(arg0.method299(arg1 + ".dat", null));
		class38 var5 = new class38(arg0.method299("index.dat", null));
		var5.field621 = var4.method231();
		field609 = var5.method231();
		field610 = var5.method231();
		int var6 = var5.method229();
		field604 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field604[var7 + 1] = var5.method233();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field621 += 2;
			var4.field621 += var5.method231() * var5.method231();
			var5.field621++;
		}

		field607 = var5.method229();
		field608 = var5.method229();
		field605 = var5.method231();
		field606 = var5.method231();
		int var9 = var5.method229();
		int var10 = field606 * field605;
		field603 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field603[var11] = var4.method230();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field605; var12++) {
				for (int var13 = 0; var13 < field606; var13++) {
					field603[field605 * var13 + var12] = var4.method230();
				}
			}
		}
	}

	@ObfuscatedName("jb.c(I)V")
	public void method194() {
		field609 /= 2;
		field610 /= 2;
		byte[] var1 = new byte[field610 * field609];
		int var2 = 0;
		for (int var3 = 0; var3 < field606; var3++) {
			for (int var4 = 0; var4 < field605; var4++) {
				var1[(field607 + var4 >> 1) + (field608 + var3 >> 1) * field609] = field603[var2++];
			}
		}

		field603 = var1;
		field605 = field609;
		field606 = field610;
		field607 = 0;
		field608 = 0;
	}

	@ObfuscatedName("jb.d(I)V")
	public void method195() {
		if (field609 != field605 || field610 != field606) {
			byte[] var1 = new byte[field610 * field609];
			int var2 = 0;
			for (int var3 = 0; var3 < field606; var3++) {
				for (int var4 = 0; var4 < field605; var4++) {
					var1[(field608 + var3) * field609 + field607 + var4] = field603[var2++];
				}
			}

			field603 = var1;
			field605 = field609;
			field606 = field610;
			field607 = 0;
			field608 = 0;
		}
	}

	@ObfuscatedName("jb.e(I)V")
	public void method196() {
		byte[] var1 = new byte[field606 * field605];
		int var2 = 0;
		for (int var3 = 0; var3 < field606; var3++) {
			for (int var4 = field605 - 1; var4 >= 0; var4--) {
				var1[var2++] = field603[field605 * var3 + var4];
			}
		}

		field603 = var1;
		field607 = field609 - field605 - field607;
	}

	@ObfuscatedName("jb.a(Z)V")
	public void method197() {
		byte[] var1 = new byte[field606 * field605];
		int var2 = 0;
		for (int var3 = field606 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field605; var4++) {
				var1[var2++] = field603[field605 * var3 + var4];
			}
		}

		field603 = var1;
		field608 = field610 - field606 - field608;
	}

	@ObfuscatedName("jb.a(IIII)V")
	public void method198(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field604.length; var4++) {
			int var5 = field604[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field604[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field604[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field604[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("jb.a(IIZ)V")
	public void method199(int arg0, int arg1) {
		arg0 += field607;
		arg1 += field608;
		int var3 = class33.field564 * arg1 + arg0;
		int var4 = 0;
		int var5 = field606;
		int var6 = field605;
		int var7 = class33.field564 - var6;
		int var8 = 0;

		if (arg1 < class33.field566) {
			int var9 = class33.field566 - arg1;
			var5 -= var9;
			arg1 = class33.field566;
			var4 += var6 * var9;
			var3 += class33.field564 * var9;
		}

		if (arg1 + var5 > class33.field567) {
			var5 -= arg1 + var5 - class33.field567;
		}

		if (arg0 < class33.field568) {
			int var10 = class33.field568 - arg0;
			var6 -= var10;
			arg0 = class33.field568;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class33.field569) {
			int var11 = arg0 + var6 - class33.field569;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method200(var6, class33.field563, var3, var7, field603, var5, var8, var4, field604);
		}
	}

	@ObfuscatedName("jb.a(I[III[BIIII[I)V")
	public void method200(int arg0, int[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int[] arg8) {
		int var10 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg4[arg7++];
				if (var13 == 0) {
					arg2++;
				} else {
					arg1[arg2++] = arg8[var13 & 0xFF];
				}

				byte var14 = arg4[arg7++];
				if (var14 == 0) {
					arg2++;
				} else {
					arg1[arg2++] = arg8[var14 & 0xFF];
				}

				byte var15 = arg4[arg7++];
				if (var15 == 0) {
					arg2++;
				} else {
					arg1[arg2++] = arg8[var15 & 0xFF];
				}

				byte var16 = arg4[arg7++];
				if (var16 == 0) {
					arg2++;
				} else {
					arg1[arg2++] = arg8[var16 & 0xFF];
				}
			}

			for (int var17 = arg0; var17 < 0; var17++) {
				byte var18 = arg4[arg7++];
				if (var18 == 0) {
					arg2++;
				} else {
					arg1[arg2++] = arg8[var18 & 0xFF];
				}
			}

			arg2 += arg3;
			arg7 += arg6;
		}
	}
}
