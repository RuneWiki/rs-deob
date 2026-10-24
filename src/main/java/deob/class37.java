package deob;

@ObfuscatedName("kb")
public final class class37 extends class34 {

	@ObfuscatedName("kb.H")
	public int field609;

	@ObfuscatedName("kb.I")
	public int field610;

	@ObfuscatedName("kb.C")
	public int[] field604;

	@ObfuscatedName("kb.F")
	public int field607;

	@ObfuscatedName("kb.G")
	public int field608;

	@ObfuscatedName("kb.D")
	public int field605;

	@ObfuscatedName("kb.E")
	public int field606;

	@ObfuscatedName("kb.B")
	public byte[] field603;

	public class37(class51 arg0, String arg1, int arg2) {
		class39 var4 = new class39(arg0.method309(arg1 + ".dat", null));
		class39 var5 = new class39(arg0.method309("index.dat", null));
		var5.field623 = var4.method241();
		field609 = var5.method241();
		field610 = var5.method241();
		int var6 = var5.method239();
		field604 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field604[var7 + 1] = var5.method243();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field623 += 2;
			var4.field623 += var5.method241() * var5.method241();
			var5.field623++;
		}

		field607 = var5.method239();
		field608 = var5.method239();
		field605 = var5.method241();
		field606 = var5.method241();
		int var9 = var5.method239();
		int var10 = field606 * field605;
		field603 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field603[var11] = var4.method240();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field605; var12++) {
				for (int var13 = 0; var13 < field606; var13++) {
					field603[field605 * var13 + var12] = var4.method240();
				}
			}
		}
	}

	@ObfuscatedName("kb.a(B)V")
	public void method207() {
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

	@ObfuscatedName("kb.c(I)V")
	public void method208() {
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

	@ObfuscatedName("kb.d(I)V")
	public void method209() {
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

	@ObfuscatedName("kb.b(B)V")
	public void method210() {
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

	@ObfuscatedName("kb.a(IIII)V")
	public void method211(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field604.length; var4++) {
			int var5 = field604[var4] >> 16 & 0xFF;
			var5 += arg2;
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
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field604[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("kb.a(III)V")
	public void method212(int arg0, int arg1) {
		arg1 += field607;
		arg0 += field608;
		int var3 = class34.field564 * arg0 + arg1;
		int var4 = 0;
		int var5 = field606;
		int var6 = field605;
		int var7 = class34.field564 - var6;
		int var8 = 0;

		if (arg0 < class34.field566) {
			int var9 = class34.field566 - arg0;
			var5 -= var9;
			arg0 = class34.field566;
			var4 += var6 * var9;
			var3 += class34.field564 * var9;
		}

		if (arg0 + var5 > class34.field567) {
			var5 -= arg0 + var5 - class34.field567;
		}

		if (arg1 < class34.field568) {
			int var10 = class34.field568 - arg1;
			var6 -= var10;
			arg1 = class34.field568;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class34.field569) {
			int var11 = arg1 + var6 - class34.field569;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method213(class34.field563, var6, var4, var5, field603, var7, var8, field604, var3);
		}
	}

	@ObfuscatedName("kb.a([IIII[BZII[II)V")
	public void method213(int[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var11 = -arg3; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg4[arg2++];
				if (var13 == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg7[var13 & 0xFF];
				}

				byte var14 = arg4[arg2++];
				if (var14 == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg7[var14 & 0xFF];
				}

				byte var15 = arg4[arg2++];
				if (var15 == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg7[var15 & 0xFF];
				}

				byte var16 = arg4[arg2++];
				if (var16 == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg7[var16 & 0xFF];
				}
			}

			for (int var17 = arg1; var17 < 0; var17++) {
				byte var18 = arg4[arg2++];
				if (var18 == 0) {
					arg8++;
				} else {
					arg0[arg8++] = arg7[var18 & 0xFF];
				}
			}

			arg8 += arg5;
			arg2 += arg6;
		}
	}
}
