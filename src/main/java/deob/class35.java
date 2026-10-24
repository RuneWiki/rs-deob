package deob;

@ObfuscatedName("ib")
public final class class35 extends class32 {

	@ObfuscatedName("ib.I")
	public int field530;

	@ObfuscatedName("ib.J")
	public int field531;

	@ObfuscatedName("ib.D")
	public int[] field525;

	@ObfuscatedName("ib.G")
	public int field528;

	@ObfuscatedName("ib.H")
	public int field529;

	@ObfuscatedName("ib.E")
	public int field526;

	@ObfuscatedName("ib.F")
	public int field527;

	@ObfuscatedName("ib.C")
	public byte[] field524;

	public class35(class47 arg0, String arg1, int arg2) {
		class37 var4 = new class37(arg0.method250(arg1 + ".dat", null));
		class37 var5 = new class37(arg0.method250("index.dat", null));
		var5.field542 = var4.method211();
		field530 = var5.method211();
		field531 = var5.method211();
		int var6 = var5.method209();
		field525 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field525[var7 + 1] = var5.method213();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field542 += 2;
			var4.field542 += var5.method211() * var5.method211();
			var5.field542++;
		}

		field528 = var5.method209();
		field529 = var5.method209();
		field526 = var5.method211();
		field527 = var5.method211();
		int var9 = var5.method209();
		int var10 = field527 * field526;
		field524 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field524[var11] = var4.method210();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field526; var12++) {
				for (int var13 = 0; var13 < field527; var13++) {
					field524[field526 * var13 + var12] = var4.method210();
				}
			}
		}
	}

	@ObfuscatedName("ib.c(I)V")
	public void method182() {
		field530 /= 2;
		field531 /= 2;
		byte[] var1 = new byte[field531 * field530];
		int var2 = 0;
		for (int var3 = 0; var3 < field527; var3++) {
			for (int var4 = 0; var4 < field526; var4++) {
				var1[(field528 + var4 >> 1) + (field529 + var3 >> 1) * field530] = field524[var2++];
			}
		}

		field524 = var1;
		field526 = field530;
		field527 = field531;
		field528 = 0;
		field529 = 0;
	}

	@ObfuscatedName("ib.a(Z)V")
	public void method183() {
		if (field530 != field526 || field531 != field527) {
			byte[] var1 = new byte[field531 * field530];
			int var2 = 0;
			for (int var3 = 0; var3 < field527; var3++) {
				for (int var4 = 0; var4 < field526; var4++) {
					var1[(field529 + var3) * field530 + field528 + var4] = field524[var2++];
				}
			}

			field524 = var1;
			field526 = field530;
			field527 = field531;
			field528 = 0;
			field529 = 0;
		}
	}

	@ObfuscatedName("ib.b(Z)V")
	public void method184() {
		byte[] var1 = new byte[field527 * field526];
		int var2 = 0;
		for (int var3 = 0; var3 < field527; var3++) {
			for (int var4 = field526 - 1; var4 >= 0; var4--) {
				var1[var2++] = field524[field526 * var3 + var4];
			}
		}

		field524 = var1;
		field528 = field530 - field526 - field528;
	}

	@ObfuscatedName("ib.a(B)V")
	public void method185() {
		byte[] var1 = new byte[field527 * field526];
		int var2 = 0;
		for (int var3 = field527 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field526; var4++) {
				var1[var2++] = field524[field526 * var3 + var4];
			}
		}

		field524 = var1;
		field529 = field531 - field527 - field529;
	}

	@ObfuscatedName("ib.a(III)V")
	public void method186(int arg0, int arg1) {
		arg0 += field528;
		arg1 += field529;
		int var3 = class32.field485 * arg1 + arg0;
		int var4 = 0;
		int var5 = field527;
		int var6 = field526;
		int var7 = class32.field485 - var6;
		int var8 = 0;

		if (arg1 < class32.field487) {
			int var9 = class32.field487 - arg1;
			var5 -= var9;
			arg1 = class32.field487;
			var4 += var6 * var9;
			var3 += class32.field485 * var9;
		}

		if (arg1 + var5 > class32.field488) {
			var5 -= arg1 + var5 - class32.field488;
		}

		if (arg0 < class32.field489) {
			int var10 = class32.field489 - arg0;
			var6 -= var10;
			arg0 = class32.field489;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class32.field490) {
			int var11 = arg0 + var6 - class32.field490;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method187(field525, var3, var5, var4, var8, var6, var7, class32.field484, field524);
		}
	}

	@ObfuscatedName("ib.a(I[IIIIIII[I[B)V")
	public void method187(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, byte[] arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg3++];
				if (var13 == 0) {
					arg1++;
				} else {
					arg7[arg1++] = arg0[var13 & 0xFF];
				}

				byte var14 = arg8[arg3++];
				if (var14 == 0) {
					arg1++;
				} else {
					arg7[arg1++] = arg0[var14 & 0xFF];
				}

				byte var15 = arg8[arg3++];
				if (var15 == 0) {
					arg1++;
				} else {
					arg7[arg1++] = arg0[var15 & 0xFF];
				}

				byte var16 = arg8[arg3++];
				if (var16 == 0) {
					arg1++;
				} else {
					arg7[arg1++] = arg0[var16 & 0xFF];
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				byte var18 = arg8[arg3++];
				if (var18 == 0) {
					arg1++;
				} else {
					arg7[arg1++] = arg0[var18 & 0xFF];
				}
			}

			arg1 += arg6;
			arg3 += arg4;
		}
	}
}
