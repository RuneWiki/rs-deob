package jagex2.graphics;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("WRRBQEHV")
public final class Pix8 extends Pix2D {

	@ObfuscatedName("WRRBQEHV.J")
	public int field1342;

	@ObfuscatedName("WRRBQEHV.K")
	public int field1343;

	@ObfuscatedName("WRRBQEHV.E")
	public int[] field1337;

	@ObfuscatedName("WRRBQEHV.H")
	public int field1340;

	@ObfuscatedName("WRRBQEHV.I")
	public int field1341;

	@ObfuscatedName("WRRBQEHV.F")
	public int field1338;

	@ObfuscatedName("WRRBQEHV.G")
	public int field1339;

	@ObfuscatedName("WRRBQEHV.D")
	public byte[] field1336;

	public Pix8(Jagfile arg0, String arg1, int arg2) {
		Packet var4 = new Packet(arg0.method2(arg1 + ".dat", null));
		Packet var5 = new Packet(arg0.method2("index.dat", null));
		var5.pos = var4.g2();
		field1342 = var5.g2();
		field1343 = var5.g2();
		int var6 = var5.g1();
		field1337 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1337[var7 + 1] = var5.g3();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.pos += 2;
			var4.pos += var5.g2() * var5.g2();
			var5.pos++;
		}

		field1340 = var5.g1();
		field1341 = var5.g1();
		field1338 = var5.g2();
		field1339 = var5.g2();
		int var9 = var5.g1();
		int var10 = field1339 * field1338;
		field1336 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1336[var11] = var4.g1b();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1338; var12++) {
				for (int var13 = 0; var13 < field1339; var13++) {
					field1336[field1338 * var13 + var12] = var4.g1b();
				}
			}
		}
	}

	@ObfuscatedName("WRRBQEHV.b(I)V")
	public void method487() {
		field1342 /= 2;
		field1343 /= 2;
		byte[] var1 = new byte[field1343 * field1342];
		int var2 = 0;
		for (int var3 = 0; var3 < field1339; var3++) {
			for (int var4 = 0; var4 < field1338; var4++) {
				var1[(field1340 + var4 >> 1) + (field1341 + var3 >> 1) * field1342] = field1336[var2++];
			}
		}

		field1336 = var1;
		field1338 = field1342;
		field1339 = field1343;
		field1340 = 0;
		field1341 = 0;
	}

	@ObfuscatedName("WRRBQEHV.a(Z)V")
	public void method488() {
		if (field1342 != field1338 || field1343 != field1339) {
			byte[] var1 = new byte[field1343 * field1342];
			int var2 = 0;
			for (int var3 = 0; var3 < field1339; var3++) {
				for (int var4 = 0; var4 < field1338; var4++) {
					var1[(field1341 + var3) * field1342 + field1340 + var4] = field1336[var2++];
				}
			}

			field1336 = var1;
			field1338 = field1342;
			field1339 = field1343;
			field1340 = 0;
			field1341 = 0;
		}
	}

	@ObfuscatedName("WRRBQEHV.c(I)V")
	public void method489() {
		byte[] var1 = new byte[field1339 * field1338];
		int var2 = 0;
		for (int var3 = 0; var3 < field1339; var3++) {
			for (int var4 = field1338 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1336[field1338 * var3 + var4];
			}
		}

		field1336 = var1;
		field1340 = field1342 - field1338 - field1340;
	}

	@ObfuscatedName("WRRBQEHV.b(B)V")
	public void method490() {
		byte[] var1 = new byte[field1339 * field1338];
		int var2 = 0;
		for (int var3 = field1339 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1338; var4++) {
				var1[var2++] = field1336[field1338 * var3 + var4];
			}
		}

		field1336 = var1;
		field1341 = field1343 - field1339 - field1341;
	}

	@ObfuscatedName("WRRBQEHV.a(IIII)V")
	public void method491(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1337.length; var4++) {
			int var5 = field1337[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1337[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1337[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1337[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("WRRBQEHV.a(III)V")
	public void method492(int arg0, int arg1) {
		arg1 += field1340;
		arg0 += field1341;
		int var3 = Pix2D.field950 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1339;
		int var6 = field1338;
		int var7 = Pix2D.field950 - var6;
		int var8 = 0;

		if (arg0 < Pix2D.field952) {
			int var9 = Pix2D.field952 - arg0;
			var5 -= var9;
			arg0 = Pix2D.field952;
			var4 += var6 * var9;
			var3 += Pix2D.field950 * var9;
		}

		if (arg0 + var5 > Pix2D.field953) {
			var5 -= arg0 + var5 - Pix2D.field953;
		}

		if (arg1 < Pix2D.field954) {
			int var10 = Pix2D.field954 - arg1;
			var6 -= var10;
			arg1 = Pix2D.field954;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > Pix2D.field955) {
			int var11 = arg1 + var6 - Pix2D.field955;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method493(var4, Pix2D.field949, field1336, var8, field1337, var5, var6, var3, var7);
		}
	}

	@ObfuscatedName("WRRBQEHV.a(I[I[BI[IIIIZI)V")
	public void method493(int arg0, int[] arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg0++];
				if (var13 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var13 & 0xFF];
				}

				byte var14 = arg2[arg0++];
				if (var14 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var14 & 0xFF];
				}

				byte var15 = arg2[arg0++];
				if (var15 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var15 & 0xFF];
				}

				byte var16 = arg2[arg0++];
				if (var16 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var16 & 0xFF];
				}
			}

			for (int var17 = arg6; var17 < 0; var17++) {
				byte var18 = arg2[arg0++];
				if (var18 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var18 & 0xFF];
				}
			}

			arg7 += arg8;
			arg0 += arg3;
		}
	}
}
