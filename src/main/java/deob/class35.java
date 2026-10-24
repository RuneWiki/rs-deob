package deob;

@ObfuscatedName("ib")
public final class class35 extends class32 {

	@ObfuscatedName("ib.H")
	public int field528;

	@ObfuscatedName("ib.I")
	public int field529;

	@ObfuscatedName("ib.C")
	public int[] field523;

	@ObfuscatedName("ib.F")
	public int field526;

	@ObfuscatedName("ib.G")
	public int field527;

	@ObfuscatedName("ib.D")
	public int field524;

	@ObfuscatedName("ib.E")
	public int field525;

	@ObfuscatedName("ib.B")
	public byte[] field522;

	public class35(class47 arg0, String arg1, int arg2) {
		class37 var4 = new class37(arg0.method250(null, arg1 + ".dat"));
		class37 var5 = new class37(arg0.method250(null, "index.dat"));
		var5.field541 = var4.method211();
		field528 = var5.method211();
		field529 = var5.method211();
		int var6 = var5.method209();
		field523 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field523[var7 + 1] = var5.method213();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field541 += 2;
			var4.field541 += var5.method211() * var5.method211();
			var5.field541++;
		}

		field526 = var5.method209();
		field527 = var5.method209();
		field524 = var5.method211();
		field525 = var5.method211();
		int var9 = var5.method209();
		int var10 = field525 * field524;
		field522 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field522[var11] = var4.method210();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field524; var12++) {
				for (int var13 = 0; var13 < field525; var13++) {
					field522[field524 * var13 + var12] = var4.method210();
				}
			}
		}
	}

	@ObfuscatedName("ib.b(I)V")
	public void method182() {
		field528 /= 2;
		field529 /= 2;
		byte[] var1 = new byte[field529 * field528];
		int var2 = 0;
		for (int var3 = 0; var3 < field525; var3++) {
			for (int var4 = 0; var4 < field524; var4++) {
				var1[(field526 + var4 >> 1) + (field527 + var3 >> 1) * field528] = field522[var2++];
			}
		}

		field522 = var1;
		field524 = field528;
		field525 = field529;
		field526 = 0;
		field527 = 0;
	}

	@ObfuscatedName("ib.c(I)V")
	public void method183() {
		if (field528 != field524 || field529 != field525) {
			byte[] var1 = new byte[field529 * field528];
			int var2 = 0;
			for (int var3 = 0; var3 < field525; var3++) {
				for (int var4 = 0; var4 < field524; var4++) {
					var1[(field527 + var3) * field528 + field526 + var4] = field522[var2++];
				}
			}

			field522 = var1;
			field524 = field528;
			field525 = field529;
			field526 = 0;
			field527 = 0;
		}
	}

	@ObfuscatedName("ib.d(I)V")
	public void method184() {
		byte[] var1 = new byte[field525 * field524];
		int var2 = 0;
		for (int var3 = 0; var3 < field525; var3++) {
			for (int var4 = field524 - 1; var4 >= 0; var4--) {
				var1[var2++] = field522[field524 * var3 + var4];
			}
		}

		field522 = var1;
		field526 = field528 - field524 - field526;
	}

	@ObfuscatedName("ib.b(B)V")
	public void method185() {
		byte[] var1 = new byte[field525 * field524];
		int var2 = 0;
		for (int var3 = field525 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field524; var4++) {
				var1[var2++] = field522[field524 * var3 + var4];
			}
		}

		field522 = var1;
		field527 = field529 - field525 - field527;
	}

	@ObfuscatedName("ib.a(III)V")
	public void method186(int arg0, int arg1) {
		arg1 += field526;
		arg0 += field527;
		int var3 = class32.field483 * arg0 + arg1;
		int var4 = 0;
		int var5 = field525;
		int var6 = field524;
		int var7 = class32.field483 - var6;
		int var8 = 0;

		if (arg0 < class32.field485) {
			int var9 = class32.field485 - arg0;
			var5 -= var9;
			arg0 = class32.field485;
			var4 += var6 * var9;
			var3 += class32.field483 * var9;
		}

		if (arg0 + var5 > class32.field486) {
			var5 -= arg0 + var5 - class32.field486;
		}

		if (arg1 < class32.field487) {
			int var10 = class32.field487 - arg1;
			var6 -= var10;
			arg1 = class32.field487;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > class32.field488) {
			int var11 = arg1 + var6 - class32.field488;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method187(field523, var5, var6, class32.field482, var8, var3, var4, field522, var7);
		}
	}

	@ObfuscatedName("ib.a([III[IIII[BZI)V")
	public void method187(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
		int var10 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg7[arg6++];
				if (var13 == 0) {
					arg5++;
				} else {
					arg3[arg5++] = arg0[var13 & 0xFF];
				}

				byte var14 = arg7[arg6++];
				if (var14 == 0) {
					arg5++;
				} else {
					arg3[arg5++] = arg0[var14 & 0xFF];
				}

				byte var15 = arg7[arg6++];
				if (var15 == 0) {
					arg5++;
				} else {
					arg3[arg5++] = arg0[var15 & 0xFF];
				}

				byte var16 = arg7[arg6++];
				if (var16 == 0) {
					arg5++;
				} else {
					arg3[arg5++] = arg0[var16 & 0xFF];
				}
			}

			for (int var17 = arg2; var17 < 0; var17++) {
				byte var18 = arg7[arg6++];
				if (var18 == 0) {
					arg5++;
				} else {
					arg3[arg5++] = arg0[var18 & 0xFF];
				}
			}

			arg5 += arg8;
			arg6 += arg4;
		}
	}
}
