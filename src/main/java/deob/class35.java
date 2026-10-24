package deob;

@ObfuscatedName("ib")
public final class class35 extends class32 {

	@ObfuscatedName("ib.G")
	public int field525;

	@ObfuscatedName("ib.H")
	public int field526;

	@ObfuscatedName("ib.B")
	public int[] field520;

	@ObfuscatedName("ib.E")
	public int field523;

	@ObfuscatedName("ib.F")
	public int field524;

	@ObfuscatedName("ib.C")
	public int field521;

	@ObfuscatedName("ib.D")
	public int field522;

	@ObfuscatedName("ib.A")
	public byte[] field519;

	public class35(class47 arg0, String arg1, int arg2) {
		class37 var4 = new class37(arg0.method242(null, arg1 + ".dat"));
		class37 var5 = new class37(arg0.method242(null, "index.dat"));
		var5.field537 = var4.method203();
		field525 = var5.method203();
		field526 = var5.method203();
		int var6 = var5.method201();
		field520 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field520[var7 + 1] = var5.method205();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field537 += 2;
			var4.field537 += var5.method203() * var5.method203();
			var5.field537++;
		}

		field523 = var5.method201();
		field524 = var5.method201();
		field521 = var5.method203();
		field522 = var5.method203();
		int var9 = var5.method201();
		int var10 = field522 * field521;
		field519 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field519[var11] = var4.method202();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field521; var12++) {
				for (int var13 = 0; var13 < field522; var13++) {
					field519[field521 * var13 + var12] = var4.method202();
				}
			}
		}
	}

	@ObfuscatedName("ib.c(I)V")
	public void method176() {
		field525 /= 2;
		field526 /= 2;
		byte[] var1 = new byte[field526 * field525];
		int var2 = 0;
		for (int var3 = 0; var3 < field522; var3++) {
			for (int var4 = 0; var4 < field521; var4++) {
				var1[(field523 + var4 >> 1) + (field524 + var3 >> 1) * field525] = field519[var2++];
			}
		}

		field519 = var1;
		field521 = field525;
		field522 = field526;
		field523 = 0;
		field524 = 0;
	}

	@ObfuscatedName("ib.d(I)V")
	public void method177() {
		if (field525 != field521 || field526 != field522) {
			byte[] var1 = new byte[field526 * field525];
			int var2 = 0;
			for (int var3 = 0; var3 < field522; var3++) {
				for (int var4 = 0; var4 < field521; var4++) {
					var1[(field524 + var3) * field525 + field523 + var4] = field519[var2++];
				}
			}

			field519 = var1;
			field521 = field525;
			field522 = field526;
			field523 = 0;
			field524 = 0;
		}
	}

	@ObfuscatedName("ib.e(I)V")
	public void method178() {
		byte[] var1 = new byte[field522 * field521];
		int var2 = 0;
		for (int var3 = 0; var3 < field522; var3++) {
			for (int var4 = field521 - 1; var4 >= 0; var4--) {
				var1[var2++] = field519[field521 * var3 + var4];
			}
		}

		field519 = var1;
		field523 = field525 - field521 - field523;
	}

	@ObfuscatedName("ib.a(Z)V")
	public void method179() {
		byte[] var1 = new byte[field522 * field521];
		int var2 = 0;
		for (int var3 = field522 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field521; var4++) {
				var1[var2++] = field519[field521 * var3 + var4];
			}
		}

		field519 = var1;
		field524 = field526 - field522 - field524;
	}

	@ObfuscatedName("ib.a(III)V")
	public void method180(int arg0, int arg1) {
		arg1 += field523;
		arg0 += field524;
		int var3 = class32.field480 * arg0 + arg1;
		int var4 = 0;
		int var5 = field522;
		int var6 = field521;
		int var7 = class32.field480 - var6;
		int var8 = 0;

		if (arg0 < class32.field482) {
			int var9 = class32.field482 - arg0;
			var5 -= var9;
			arg0 = class32.field482;
			var4 += var6 * var9;
			var3 += class32.field480 * var9;
		}

		if (arg0 + var5 > class32.field483) {
			var5 -= arg0 + var5 - class32.field483;
		}

		if (arg1 < class32.field484) {
			int var10 = class32.field484 - arg1;
			var6 -= var10;
			arg1 = class32.field484;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class32.field485) {
			int var11 = arg1 + var6 - class32.field485;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method181(var5, var4, var8, class32.field479, field520, field519, var7, var3, var6);
		}
	}

	@ObfuscatedName("ib.a(III[I[I[BBIII)V")
	public void method181(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg8 >> 2);
		arg8 = -(arg8 & 0x3);
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg5[arg1++];
				if (var13 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg4[var13 & 0xFF];
				}

				byte var14 = arg5[arg1++];
				if (var14 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg4[var14 & 0xFF];
				}

				byte var15 = arg5[arg1++];
				if (var15 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg4[var15 & 0xFF];
				}

				byte var16 = arg5[arg1++];
				if (var16 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg4[var16 & 0xFF];
				}
			}

			for (int var17 = arg8; var17 < 0; var17++) {
				byte var18 = arg5[arg1++];
				if (var18 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg4[var18 & 0xFF];
				}
			}

			arg7 += arg6;
			arg1 += arg2;
		}
	}
}
