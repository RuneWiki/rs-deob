package deob;

@ObfuscatedName("cs")
public class class78 {

	@ObfuscatedName("cs.aq")
	public final int[][] field1120;

	@ObfuscatedName("cs.ao")
	public class605[] field1121;

	@ObfuscatedName("cs.as")
	public int[] field1123 = new int[256];

	@ObfuscatedName("cs.al")
	public int field1124 = 0;

	@ObfuscatedName("cs.au")
	public int[] field1125;

	@ObfuscatedName("cs.ai")
	public int[] field1127;

	@ObfuscatedName("cs.aa")
	public int[] field1122;

	@ObfuscatedName("cs.am")
	public int[] field1128;

	@ObfuscatedName("cs.an")
	public int field1129 = 0;

	@ObfuscatedName("cs.ar")
	public int field1130 = 0;

	@ObfuscatedName("cs.ae")
	public int[] field1131;

	@ObfuscatedName("cs.ay")
	public int[] field1119;

	@ObfuscatedName("cs.ad")
	public int[] field1133;

	@ObfuscatedName("cs.ag")
	public int[] field1134;

	@ObfuscatedName("cs.av")
	public int field1135 = 0;

	@ObfuscatedName("cs.ah")
	public int field1136 = 0;

	@ObfuscatedName("cs.ab")
	public int field1137 = 0;

	public class78(class605[] arg0, int[][] arg1) {
		this.field1121 = arg0;
		this.field1120 = arg1;
		this.method2467();
	}

	@ObfuscatedName("ca.af(IIIIII)[I")
	public static int[] method2197(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int[] var5 = new int[256];
		for (int var6 = 0; var6 < 64; var6++) {
			var5[var6] = method776(arg0, arg1, var6);
		}
		for (int var7 = 0; var7 < 64; var7++) {
			var5[var7 + 64] = method776(arg1, arg2, var7);
		}
		for (int var8 = 0; var8 < 64; var8++) {
			var5[var8 + 128] = method776(arg2, arg3, var8);
		}
		for (int var9 = 0; var9 < 64; var9++) {
			var5[var9 + 192] = method776(arg3, arg4, var9);
		}
		return var5;
	}

	@ObfuscatedName("be.aw(IIII)I")
	public static int method776(int arg0, int arg1, int arg2) {
		int var3 = arg0 >> 16 & 0xFF;
		int var4 = arg0 >> 8 & 0xFF;
		int var5 = arg0 & 0xFF;
		int var6 = arg1 >> 16 & 0xFF;
		int var7 = arg1 >> 8 & 0xFF;
		int var8 = arg1 & 0xFF;
		int var9 = (var6 - var3 + 1) * arg2 / 64 + var3 & 0xFF;
		int var10 = (var7 - var4 + 1) * arg2 / 64 + var4 & 0xFF;
		int var11 = (var8 - var5 + 1) * arg2 / 64 + var5 & 0xFF;
		return var9 << 16 | var10 << 8 | var11;
	}

	@ObfuscatedName("cs.at(B)V")
	public void method2467() {
		this.field1127 = method2197(this.field1120[0][0], this.field1120[0][1], this.field1120[0][2], this.field1120[0][3], this.field1120[0][4]);
		this.field1122 = method2197(this.field1120[1][0], this.field1120[1][1], this.field1120[1][2], this.field1120[1][3], this.field1120[1][4]);
		this.field1128 = method2197(this.field1120[2][0], this.field1120[2][1], this.field1120[2][2], this.field1120[2][3], this.field1120[2][4]);
		this.field1125 = new int[256];
		this.field1135 = 0;
		this.field1133 = new int[32768];
		this.field1134 = new int[32768];
		this.method2486(null);
		this.field1131 = new int[32768];
		this.field1119 = new int[32768];
	}

	@ObfuscatedName("cs.ac(I)V")
	public void method2468() {
		this.field1127 = null;
		this.field1122 = null;
		this.field1128 = null;
		this.field1125 = null;
		this.field1133 = null;
		this.field1134 = null;
		this.field1131 = null;
		this.field1119 = null;
		this.field1135 = 0;
		this.field1136 = 0;
	}

	@ObfuscatedName("cs.ap(III)V")
	public void method2469(int arg0, int arg1) {
		if (this.field1131 == null) {
			this.method2467();
		}
		if (this.field1137 == 0) {
			this.field1137 = arg1;
		}
		int var3 = arg1 - this.field1137;
		if (var3 >= 256) {
			var3 = 0;
		}
		this.field1137 = arg1;
		if (var3 > 0) {
			this.method2470(var3);
		}
		this.method2466(arg0);
	}

	@ObfuscatedName("cs.aq(II)V")
	public final void method2470(int arg0) {
		this.field1135 += arg0 * 128;
		if (this.field1135 > this.field1133.length) {
			this.field1135 -= this.field1133.length;
			int var2 = (int) (Math.random() * 12.0D);
			this.method2486(this.field1121[var2]);
		}
		int var3 = 0;
		int var4 = arg0 * 128;
		int var5 = (256 - arg0) * 128;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.field1131[var3 + var4] - this.field1133[this.field1135 + var3 & this.field1133.length - 1] * arg0 / 6;
			if (var7 < 0) {
				var7 = 0;
			}
			this.field1131[var3++] = var7;
		}
		byte var8 = 10;
		int var9 = 128 - var8;
		for (int var10 = 256 - arg0; var10 < 256; var10++) {
			int var11 = var10 * 128;
			for (int var12 = 0; var12 < 128; var12++) {
				int var13 = (int) (Math.random() * 100.0D);
				if (var13 < 50 && var12 > var8 && var12 < var9) {
					this.field1131[var11 + var12] = 255;
				} else {
					this.field1131[var11 + var12] = 0;
				}
			}
		}
		if (this.field1129 > 0) {
			this.field1129 -= arg0 * 4;
		}
		if (this.field1130 > 0) {
			this.field1130 -= arg0 * 4;
		}
		if (this.field1129 == 0 && this.field1130 == 0) {
			int var14 = (int) (Math.random() * (double) (2000 / arg0));
			if (var14 == 0) {
				this.field1129 = 1024;
			}
			if (var14 == 1) {
				this.field1130 = 1024;
			}
		}
		for (int var15 = 0; var15 < 256 - arg0; var15++) {
			this.field1123[var15] = this.field1123[arg0 + var15];
		}
		for (int var16 = 256 - arg0; var16 < 256; var16++) {
			this.field1123[var16] = (int) (Math.sin((double) this.field1124 / 14.0D) * 16.0D + Math.sin((double) this.field1124 / 15.0D) * 14.0D + Math.sin((double) this.field1124 / 16.0D) * 12.0D);
			this.field1124++;
		}
		this.field1136 += arg0;
		int var17 = ((client.field413 & 0x1) + arg0) / 2;
		if (var17 <= 0) {
			return;
		}
		short var18 = 128;
		byte var19 = 2;
		int var20 = 128 - var19 - var19;
		for (int var21 = 0; var21 < this.field1136 * 100; var21++) {
			int var22 = (int) (Math.random() * (double) var20) + var19;
			int var23 = (int) (Math.random() * (double) var18) + var18;
			this.field1131[(var23 << 7) + var22] = 192;
		}
		this.field1136 = 0;
		for (int var24 = 0; var24 < 256; var24++) {
			int var25 = 0;
			int var26 = var24 * 128;
			for (int var27 = -var17; var27 < 128; var27++) {
				if (var17 + var27 < 128) {
					var25 += this.field1131[var26 + var27 + var17];
				}
				if (var27 - (var17 + 1) >= 0) {
					var25 -= this.field1131[var26 + var27 - (var17 + 1)];
				}
				if (var27 >= 0) {
					this.field1119[var26 + var27] = var25 / (var17 * 2 + 1);
				}
			}
		}
		for (int var28 = 0; var28 < 128; var28++) {
			int var29 = 0;
			for (int var30 = -var17; var30 < 256; var30++) {
				int var31 = var30 * 128;
				if (var17 + var30 < 256) {
					var29 += this.field1119[var17 * 128 + var28 + var31];
				}
				if (var30 - (var17 + 1) >= 0) {
					var29 -= this.field1119[var28 + var31 - (var17 + 1) * 128];
				}
				if (var30 >= 0) {
					this.field1131[var28 + var31] = var29 / (var17 * 2 + 1);
				}
			}
		}
	}

	@ObfuscatedName("cs.ao(IIII)I")
	public final int method2471(int arg0, int arg1, int arg2) {
		int var4 = 256 - arg2;
		return ((arg0 & 0xFF00FF) * var4 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
	}

	@ObfuscatedName("cs.as(IB)V")
	public final void method2466(int arg0) {
		int var2 = this.field1125.length;
		if (this.field1129 > 0) {
			this.method2473(this.field1129, this.field1122);
		} else if (this.field1130 > 0) {
			this.method2473(this.field1130, this.field1128);
		} else {
			System.arraycopy(this.field1127, 0, this.field1125, 0, var2);
		}
		this.method2474(arg0);
	}

	@ObfuscatedName("cs.al(I[II)V")
	public final void method2473(int arg0, int[] arg1) {
		int var3 = this.field1125.length;
		for (int var4 = 0; var4 < var3; var4++) {
			if (arg0 > 768) {
				this.field1125[var4] = this.method2471(this.field1127[var4], arg1[var4], 1024 - arg0);
			} else if (arg0 > 256) {
				this.field1125[var4] = arg1[var4];
			} else {
				this.field1125[var4] = this.method2471(arg1[var4], this.field1127[var4], 256 - arg0);
			}
		}
	}

	@ObfuscatedName("cs.au(II)V")
	public final void method2474(int arg0) {
		int var2 = 0;
		for (int var3 = 1; var3 < 255; var3++) {
			int var4 = (256 - var3) * this.field1123[var3] / 256;
			int var5 = arg0 + var4;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}
			if (var5 + 128 >= Statics.field182.field5998) {
				var7 = Statics.field182.field5998 - var5;
			}
			int var8 = Statics.field182.field5998 * (var3 + 8) + var5;
			int var9 = var2 + var6;
			for (int var10 = var6; var10 < var7; var10++) {
				int var11 = this.field1131[var9++];
				int var12 = var8 % Statics.field5990;
				if (var11 == 0 || var12 < class602.field5995 || var12 >= class602.field5996) {
					var8++;
				} else {
					int var14 = 256 - var11;
					int var15 = this.field1125[var11];
					int var16 = Statics.field182.field5997[var8];
					Statics.field182.field5997[var8++] = ((var15 & 0xFF00) * var11 + (var16 & 0xFF00) * var14 & 0xFF0000) + ((var15 & 0xFF00FF) * var11 + (var16 & 0xFF00FF) * var14 & -16711936) >> 8 | 0xFF000000;
				}
			}
			var2 = 128 - var7 + var9;
		}
	}

	@ObfuscatedName("cs.ai(Lxc;I)V")
	public final void method2486(class605 arg0) {
		for (int var2 = 0; var2 < this.field1133.length; var2++) {
			this.field1133[var2] = 0;
		}
		for (int var3 = 0; var3 < 5000; var3++) {
			int var4 = (int) (Math.random() * 128.0D * 256.0D);
			this.field1133[var4] = (int) (Math.random() * 256.0D);
		}
		for (int var5 = 0; var5 < 20; var5++) {
			for (int var6 = 1; var6 < 255; var6++) {
				for (int var7 = 1; var7 < 127; var7++) {
					int var8 = (var6 << 7) + var7;
					this.field1134[var8] = (this.field1133[var8 - 1] + this.field1133[var8 + 1] + this.field1133[var8 - 128] + this.field1133[var8 + 128]) / 4;
				}
			}
			int[] var9 = this.field1133;
			this.field1133 = this.field1134;
			this.field1134 = var9;
		}
		if (arg0 == null) {
			return;
		}
		int var10 = 0;
		for (int var11 = 0; var11 < arg0.field6011; var11++) {
			for (int var12 = 0; var12 < arg0.field6008; var12++) {
				if (arg0.field6013[var10++] != 0) {
					int var13 = var12 + 16 + arg0.field6010;
					int var14 = var11 + 16 + arg0.field6012;
					int var15 = (var14 << 7) + var13;
					this.field1133[var15] = 0;
				}
			}
		}
	}
}
