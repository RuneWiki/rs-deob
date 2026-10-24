package deob;

@ObfuscatedName("hb")
public final class class34 extends class31 {

	@ObfuscatedName("hb.x")
	public byte[] field507;

	@ObfuscatedName("hb.y")
	public int[] field508;

	@ObfuscatedName("hb.z")
	public int field509;

	@ObfuscatedName("hb.D")
	public int field513;

	@ObfuscatedName("hb.E")
	public int field514;

	@ObfuscatedName("hb.B")
	public int field511;

	@ObfuscatedName("hb.C")
	public int field512;

	@ObfuscatedName("hb.A")
	public int field510;

	public class34(class46 arg0, String arg1, int arg2) {
		class36 var4 = new class36(arg0.method225(null, arg1 + ".dat"));
		class36 var5 = new class36(arg0.method225(null, "index.dat"));
		var5.field525 = var4.method187();
		field513 = var5.method187();
		field514 = var5.method187();
		int var6 = var5.method185();
		field508 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field508[var7 + 1] = var5.method189();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field525 += 2;
			var4.field525 += var5.method187() * var5.method187();
			var5.field525++;
		}

		field511 = var5.method185();
		field512 = var5.method185();
		field509 = var5.method187();
		field510 = var5.method187();
		int var9 = var5.method185();
		int var10 = field510 * field509;
		field507 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field507[var11] = var4.method186();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field509; var12++) {
				for (int var13 = 0; var13 < field510; var13++) {
					field507[field509 * var13 + var12] = var4.method186();
				}
			}
		}
	}

	@ObfuscatedName("hb.b(I)V")
	public void method162() {
		field513 /= 2;
		field514 /= 2;
		byte[] var1 = new byte[field514 * field513];
		int var2 = 0;
		for (int var3 = 0; var3 < field510; var3++) {
			for (int var4 = 0; var4 < field509; var4++) {
				var1[(field511 + var4 >> 1) + (field512 + var3 >> 1) * field513] = field507[var2++];
			}
		}

		field507 = var1;
		field509 = field513;
		field510 = field514;
		field511 = 0;
		field512 = 0;
	}

	@ObfuscatedName("hb.c(I)V")
	public void method163() {
		if (field513 != field509 || field514 != field510) {
			byte[] var1 = new byte[field514 * field513];
			int var2 = 0;
			for (int var3 = 0; var3 < field510; var3++) {
				for (int var4 = 0; var4 < field509; var4++) {
					var1[(field512 + var3) * field513 + field511 + var4] = field507[var2++];
				}
			}

			field507 = var1;
			field509 = field513;
			field510 = field514;
			field511 = 0;
			field512 = 0;
		}
	}

	@ObfuscatedName("hb.d(I)V")
	public void method164() {
		byte[] var1 = new byte[field510 * field509];
		int var2 = 0;
		for (int var3 = 0; var3 < field510; var3++) {
			for (int var4 = field509 - 1; var4 >= 0; var4--) {
				var1[var2++] = field507[field509 * var3 + var4];
			}
		}

		field507 = var1;
		field511 = field513 - field509 - field511;
	}

	@ObfuscatedName("hb.e(I)V")
	public void method165() {
		byte[] var1 = new byte[field510 * field509];
		int var2 = 0;
		for (int var3 = field510 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field509; var4++) {
				var1[var2++] = field507[field509 * var3 + var4];
			}
		}

		field507 = var1;
		field512 = field514 - field510 - field512;
	}

	@ObfuscatedName("hb.a(IZI)V")
	public void method166(int arg0, int arg1) {
		arg0 += field511;
		arg1 += field512;
		int var3 = class31.field468 * arg1 + arg0;
		int var4 = 0;
		int var5 = field510;
		int var6 = field509;
		int var7 = class31.field468 - var6;
		int var8 = 0;

		if (arg1 < class31.field470) {
			int var9 = class31.field470 - arg1;
			var5 -= var9;
			arg1 = class31.field470;
			var4 += var6 * var9;
			var3 += class31.field468 * var9;
		}

		if (arg1 + var5 > class31.field471) {
			var5 -= arg1 + var5 - class31.field471;
		}

		if (arg0 < class31.field472) {
			int var10 = class31.field472 - arg0;
			var6 -= var10;
			arg0 = class31.field472;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > class31.field473) {
			int var11 = arg0 + var6 - class31.field473;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method167(var5, field507, field508, var6, var3, var4, class31.field467, var7, var8);
		}
	}

	@ObfuscatedName("hb.a(I[B[IIII[IIII)V")
	public void method167(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
		int var10 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg1[arg5++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var13 & 0xFF];
				}

				byte var14 = arg1[arg5++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var14 & 0xFF];
				}

				byte var15 = arg1[arg5++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var15 & 0xFF];
				}

				byte var16 = arg1[arg5++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var16 & 0xFF];
				}
			}

			for (int var17 = arg3; var17 < 0; var17++) {
				byte var18 = arg1[arg5++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var18 & 0xFF];
				}
			}

			arg4 += arg7;
			arg5 += arg8;
		}
	}
}
