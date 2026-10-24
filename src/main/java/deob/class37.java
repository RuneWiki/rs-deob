package deob;

@ObfuscatedName("kb")
public final class class37 extends class34 {

	@ObfuscatedName("kb.z")
	public byte[] field592;

	@ObfuscatedName("kb.F")
	public int field598;

	@ObfuscatedName("kb.G")
	public int field599;

	@ObfuscatedName("kb.A")
	public int[] field593;

	@ObfuscatedName("kb.D")
	public int field596;

	@ObfuscatedName("kb.E")
	public int field597;

	@ObfuscatedName("kb.B")
	public int field594;

	@ObfuscatedName("kb.C")
	public int field595;

	public class37(class51 arg0, String arg1, int arg2) {
		class39 var4 = new class39(arg0.method295(arg1 + ".dat", null));
		class39 var5 = new class39(arg0.method295("index.dat", null));
		var5.field611 = var4.method233();
		field598 = var5.method233();
		field599 = var5.method233();
		int var6 = var5.method231();
		field593 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field593[var7 + 1] = var5.method235();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field611 += 2;
			var4.field611 += var5.method233() * var5.method233();
			var5.field611++;
		}

		field596 = var5.method231();
		field597 = var5.method231();
		field594 = var5.method233();
		field595 = var5.method233();
		int var9 = var5.method231();
		int var10 = field595 * field594;
		field592 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field592[var11] = var4.method232();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field594; var12++) {
				for (int var13 = 0; var13 < field595; var13++) {
					field592[field594 * var13 + var12] = var4.method232();
				}
			}
		}
	}

	@ObfuscatedName("kb.a(Z)V")
	public void method199() {
		field598 /= 2;
		field599 /= 2;
		byte[] var1 = new byte[field599 * field598];
		int var2 = 0;
		for (int var3 = 0; var3 < field595; var3++) {
			for (int var4 = 0; var4 < field594; var4++) {
				var1[(field596 + var4 >> 1) + (field597 + var3 >> 1) * field598] = field592[var2++];
			}
		}

		field592 = var1;
		field594 = field598;
		field595 = field599;
		field596 = 0;
		field597 = 0;
	}

	@ObfuscatedName("kb.c(I)V")
	public void method200() {
		if (field598 != field594 || field599 != field595) {
			byte[] var1 = new byte[field599 * field598];
			int var2 = 0;
			for (int var3 = 0; var3 < field595; var3++) {
				for (int var4 = 0; var4 < field594; var4++) {
					var1[(field597 + var3) * field598 + field596 + var4] = field592[var2++];
				}
			}

			field592 = var1;
			field594 = field598;
			field595 = field599;
			field596 = 0;
			field597 = 0;
		}
	}

	@ObfuscatedName("kb.a(B)V")
	public void method201() {
		byte[] var1 = new byte[field595 * field594];
		int var2 = 0;
		for (int var3 = 0; var3 < field595; var3++) {
			for (int var4 = field594 - 1; var4 >= 0; var4--) {
				var1[var2++] = field592[field594 * var3 + var4];
			}
		}

		field592 = var1;
		field596 = field598 - field594 - field596;
	}

	@ObfuscatedName("kb.d(I)V")
	public void method202() {
		byte[] var1 = new byte[field595 * field594];
		int var2 = 0;
		for (int var3 = field595 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field594; var4++) {
				var1[var2++] = field592[field594 * var3 + var4];
			}
		}

		field592 = var1;
		field597 = field599 - field595 - field597;
	}

	@ObfuscatedName("kb.a(IIII)V")
	public void method203(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field593.length; var4++) {
			int var5 = field593[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field593[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field593[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field593[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("kb.a(III)V")
	public void method204(int arg0, int arg1) {
		arg0 += field596;
		arg1 += field597;
		int var3 = class34.field553 * arg1 + arg0;
		int var4 = 0;
		int var5 = field595;
		int var6 = field594;
		int var7 = class34.field553 - var6;
		int var8 = 0;

		if (arg1 < class34.field555) {
			int var9 = class34.field555 - arg1;
			var5 -= var9;
			arg1 = class34.field555;
			var4 += var6 * var9;
			var3 += class34.field553 * var9;
		}

		if (arg1 + var5 > class34.field556) {
			var5 -= arg1 + var5 - class34.field556;
		}

		if (arg0 < class34.field557) {
			int var10 = class34.field557 - arg0;
			var6 -= var10;
			arg0 = class34.field557;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class34.field558) {
			int var11 = arg0 + var6 - class34.field558;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method205(class34.field552, var5, field592, var3, var4, var6, field593, var7, var8);
		}
	}

	@ObfuscatedName("kb.a(B[II[BIII[III)V")
	public void method205(int[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg4++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg6[var13 & 0xFF];
				}

				byte var14 = arg2[arg4++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg6[var14 & 0xFF];
				}

				byte var15 = arg2[arg4++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg6[var15 & 0xFF];
				}

				byte var16 = arg2[arg4++];
				if (var16 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg6[var16 & 0xFF];
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				byte var18 = arg2[arg4++];
				if (var18 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg6[var18 & 0xFF];
				}
			}

			arg3 += arg7;
			arg4 += arg8;
		}
	}
}
