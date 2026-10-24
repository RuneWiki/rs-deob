package deob;

@ObfuscatedName("kb")
public final class class37 extends class34 {

	@ObfuscatedName("kb.H")
	public int field610;

	@ObfuscatedName("kb.I")
	public int field611;

	@ObfuscatedName("kb.C")
	public int[] field605;

	@ObfuscatedName("kb.F")
	public int field608;

	@ObfuscatedName("kb.G")
	public int field609;

	@ObfuscatedName("kb.D")
	public int field606;

	@ObfuscatedName("kb.E")
	public int field607;

	@ObfuscatedName("kb.B")
	public byte[] field604;

	public class37(class51 arg0, String arg1, int arg2) {
		class39 var4 = new class39(arg0.method309(arg1 + ".dat", null));
		class39 var5 = new class39(arg0.method309("index.dat", null));
		var5.field624 = var4.method241();
		field610 = var5.method241();
		field611 = var5.method241();
		int var6 = var5.method239();
		field605 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field605[var7 + 1] = var5.method243();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field624 += 2;
			var4.field624 += var5.method241() * var5.method241();
			var5.field624++;
		}

		field608 = var5.method239();
		field609 = var5.method239();
		field606 = var5.method241();
		field607 = var5.method241();
		int var9 = var5.method239();
		int var10 = field607 * field606;
		field604 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field604[var11] = var4.method240();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field606; var12++) {
				for (int var13 = 0; var13 < field607; var13++) {
					field604[field606 * var13 + var12] = var4.method240();
				}
			}
		}
	}

	@ObfuscatedName("kb.b(I)V")
	public void method207() {
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

	@ObfuscatedName("kb.c(I)V")
	public void method208() {
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

	@ObfuscatedName("kb.d(I)V")
	public void method209() {
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

	@ObfuscatedName("kb.e(I)V")
	public void method210() {
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

	@ObfuscatedName("kb.a(IIII)V")
	public void method211(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field605.length; var4++) {
			int var5 = field605[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field605[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field605[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field605[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("kb.a(III)V")
	public void method212(int arg0, int arg1) {
		arg1 += field608;
		arg0 += field609;
		int var3 = class34.field565 * arg0 + arg1;
		int var4 = 0;
		int var5 = field607;
		int var6 = field606;
		int var7 = class34.field565 - var6;
		int var8 = 0;

		if (arg0 < class34.field567) {
			int var9 = class34.field567 - arg0;
			var5 -= var9;
			arg0 = class34.field567;
			var4 += var6 * var9;
			var3 += class34.field565 * var9;
		}

		if (arg0 + var5 > class34.field568) {
			var5 -= arg0 + var5 - class34.field568;
		}

		if (arg1 < class34.field569) {
			int var10 = class34.field569 - arg1;
			var6 -= var10;
			arg1 = class34.field569;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class34.field570) {
			int var11 = arg1 + var6 - class34.field570;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method213(var6, var8, field605, field604, var4, var5, var3, var7, class34.field564);
		}
	}

	@ObfuscatedName("kb.a(IBI[I[BIIII[I)V")
	public void method213(int arg0, int arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
		int var10 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg3[arg4++];
				if (var13 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg2[var13 & 0xFF];
				}

				byte var14 = arg3[arg4++];
				if (var14 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg2[var14 & 0xFF];
				}

				byte var15 = arg3[arg4++];
				if (var15 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg2[var15 & 0xFF];
				}

				byte var16 = arg3[arg4++];
				if (var16 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg2[var16 & 0xFF];
				}
			}

			for (int var17 = arg0; var17 < 0; var17++) {
				byte var18 = arg3[arg4++];
				if (var18 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg2[var18 & 0xFF];
				}
			}

			arg6 += arg7;
			arg4 += arg1;
		}
	}
}
