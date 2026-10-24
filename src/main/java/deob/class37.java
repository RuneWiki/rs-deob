package deob;

@ObfuscatedName("kb")
public final class class37 extends class34 {

	@ObfuscatedName("kb.I")
	public int field607;

	@ObfuscatedName("kb.J")
	public int field608;

	@ObfuscatedName("kb.D")
	public int[] field602;

	@ObfuscatedName("kb.G")
	public int field605;

	@ObfuscatedName("kb.H")
	public int field606;

	@ObfuscatedName("kb.E")
	public int field603;

	@ObfuscatedName("kb.F")
	public int field604;

	@ObfuscatedName("kb.C")
	public byte[] field601;

	public class37(class51 arg0, String arg1, int arg2) {
		class39 var4 = new class39(arg0.method308(arg1 + ".dat", null));
		class39 var5 = new class39(arg0.method308("index.dat", null));
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

	@ObfuscatedName("kb.b(Z)V")
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

	@ObfuscatedName("kb.c(Z)V")
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
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field602[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field602[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field602[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("kb.a(IIB)V")
	public void method211(int arg0, int arg1) {
		arg1 += field605;
		arg0 += field606;
		int var3 = class34.field562 * arg0 + arg1;
		int var4 = 0;
		int var5 = field604;
		int var6 = field603;
		int var7 = class34.field562 - var6;
		int var8 = 0;

		if (arg0 < class34.field564) {
			int var9 = class34.field564 - arg0;
			var5 -= var9;
			arg0 = class34.field564;
			var4 += var6 * var9;
			var3 += class34.field562 * var9;
		}

		if (arg0 + var5 > class34.field565) {
			var5 -= arg0 + var5 - class34.field565;
		}

		if (arg1 < class34.field566) {
			int var10 = class34.field566 - arg1;
			var6 -= var10;
			arg1 = class34.field566;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class34.field567) {
			int var11 = arg1 + var6 - class34.field567;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method212(var8, var7, var6, var3, class34.field561, field602, var4, var5, field601);
		}
	}

	@ObfuscatedName("kb.a(IIII[II[III[B)V")
	public void method212(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, byte[] arg8) {
		int var10 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg6++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg4[arg3++] = arg5[var13 & 0xFF];
				}

				byte var14 = arg8[arg6++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg4[arg3++] = arg5[var14 & 0xFF];
				}

				byte var15 = arg8[arg6++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg4[arg3++] = arg5[var15 & 0xFF];
				}

				byte var16 = arg8[arg6++];
				if (var16 == 0) {
					arg3++;
				} else {
					arg4[arg3++] = arg5[var16 & 0xFF];
				}
			}

			for (int var17 = arg2; var17 < 0; var17++) {
				byte var18 = arg8[arg6++];
				if (var18 == 0) {
					arg3++;
				} else {
					arg4[arg3++] = arg5[var18 & 0xFF];
				}
			}

			arg3 += arg1;
			arg6 += arg0;
		}
	}
}
