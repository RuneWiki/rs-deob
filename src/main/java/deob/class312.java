package deob;

@ObfuscatedName("lt")
public class class312 {

	@ObfuscatedName("lt.af")
	public int field3508;

	@ObfuscatedName("lt.aw")
	public byte[][][] field3509;

	public class312(int arg0) {
		this.field3508 = arg0;
	}

	@ObfuscatedName("lt.af(IIIIIIIIB)V")
	public void method6370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg6 != 0 && this.field3508 != 0 && this.field3509 != null) {
			int var9 = this.method6367(arg7, arg6);
			int var10 = this.method6368(arg6);
			class602.method10730(arg0, arg1, arg4, arg5, arg2, arg3, this.field3509[var10 - 1][var9], this.field3508, true);
		}
	}

	@ObfuscatedName("lt.aw(IIB)I")
	public int method6367(int arg0, int arg1) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@ObfuscatedName("lt.at(II)I")
	public int method6368(int arg0) {
		if (arg0 == 9 || arg0 == 10) {
			return 1;
		} else if (arg0 == 11) {
			return 8;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("lt.ac(B)V")
	public void method6379() {
		if (this.field3509 != null) {
			return;
		}
		this.field3509 = new byte[8][4][];
		this.method6407();
		this.method6371();
		this.method6372();
		this.method6366();
		this.method6402();
		this.method6375();
		this.method6374();
		this.method6377();
	}

	@ObfuscatedName("lt.ap(B)V")
	public void method6407() {
		byte[] var1 = new byte[this.field3508 * this.field3508];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field3508; var3++) {
			for (int var4 = 0; var4 < this.field3508; var4++) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}
				var2++;
			}
		}
		this.field3509[0][0] = var1;
		byte[] var5 = new byte[this.field3508 * this.field3508];
		int var6 = 0;
		for (int var7 = this.field3508 - 1; var7 >= 0; var7--) {
			for (int var8 = 0; var8 < this.field3508; var8++) {
				if (var8 <= var7) {
					var5[var6] = -1;
				}
				var6++;
			}
		}
		this.field3509[0][1] = var5;
		byte[] var9 = new byte[this.field3508 * this.field3508];
		int var10 = 0;
		for (int var11 = 0; var11 < this.field3508; var11++) {
			for (int var12 = 0; var12 < this.field3508; var12++) {
				if (var12 >= var11) {
					var9[var10] = -1;
				}
				var10++;
			}
		}
		this.field3509[0][2] = var9;
		byte[] var13 = new byte[this.field3508 * this.field3508];
		int var14 = 0;
		for (int var15 = this.field3508 - 1; var15 >= 0; var15--) {
			for (int var16 = 0; var16 < this.field3508; var16++) {
				if (var16 >= var15) {
					var13[var14] = -1;
				}
				var14++;
			}
		}
		this.field3509[0][3] = var13;
	}

	@ObfuscatedName("lt.aq(S)V")
	public void method6371() {
		byte[] var1 = new byte[this.field3508 * this.field3508];
		int var2 = 0;
		for (int var3 = this.field3508 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.field3508; var4++) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}
				var2++;
			}
		}
		this.field3509[1][0] = var1;
		byte[] var5 = new byte[this.field3508 * this.field3508];
		int var6 = 0;
		for (int var7 = 0; var7 < this.field3508; var7++) {
			for (int var8 = 0; var8 < this.field3508; var8++) {
				if (var6 >= 0 && var6 < var5.length) {
					if (var8 >= var7 << 1) {
						var5[var6] = -1;
					}
					var6++;
				} else {
					var6++;
				}
			}
		}
		this.field3509[1][1] = var5;
		byte[] var9 = new byte[this.field3508 * this.field3508];
		int var10 = 0;
		for (int var11 = 0; var11 < this.field3508; var11++) {
			for (int var12 = this.field3508 - 1; var12 >= 0; var12--) {
				if (var12 <= var11 >> 1) {
					var9[var10] = -1;
				}
				var10++;
			}
		}
		this.field3509[1][2] = var9;
		byte[] var13 = new byte[this.field3508 * this.field3508];
		int var14 = 0;
		for (int var15 = this.field3508 - 1; var15 >= 0; var15--) {
			for (int var16 = this.field3508 - 1; var16 >= 0; var16--) {
				if (var16 >= var15 << 1) {
					var13[var14] = -1;
				}
				var14++;
			}
		}
		this.field3509[1][3] = var13;
	}

	@ObfuscatedName("lt.ao(I)V")
	public void method6372() {
		byte[] var1 = new byte[this.field3508 * this.field3508];
		int var2 = 0;
		for (int var3 = this.field3508 - 1; var3 >= 0; var3--) {
			for (int var4 = this.field3508 - 1; var4 >= 0; var4--) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}
				var2++;
			}
		}
		this.field3509[2][0] = var1;
		byte[] var5 = new byte[this.field3508 * this.field3508];
		int var6 = 0;
		for (int var7 = this.field3508 - 1; var7 >= 0; var7--) {
			for (int var8 = 0; var8 < this.field3508; var8++) {
				if (var8 >= var7 << 1) {
					var5[var6] = -1;
				}
				var6++;
			}
		}
		this.field3509[2][1] = var5;
		byte[] var9 = new byte[this.field3508 * this.field3508];
		int var10 = 0;
		for (int var11 = 0; var11 < this.field3508; var11++) {
			for (int var12 = 0; var12 < this.field3508; var12++) {
				if (var12 <= var11 >> 1) {
					var9[var10] = -1;
				}
				var10++;
			}
		}
		this.field3509[2][2] = var9;
		byte[] var13 = new byte[this.field3508 * this.field3508];
		int var14 = 0;
		for (int var15 = 0; var15 < this.field3508; var15++) {
			for (int var16 = this.field3508 - 1; var16 >= 0; var16--) {
				if (var16 >= var15 << 1) {
					var13[var14] = -1;
				}
				var14++;
			}
		}
		this.field3509[2][3] = var13;
	}

	@ObfuscatedName("lt.as(I)V")
	public void method6366() {
		byte[] var1 = new byte[this.field3508 * this.field3508];
		int var2 = 0;
		for (int var3 = this.field3508 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < this.field3508; var4++) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}
				var2++;
			}
		}
		this.field3509[3][0] = var1;
		byte[] var5 = new byte[this.field3508 * this.field3508];
		int var6 = 0;
		for (int var7 = 0; var7 < this.field3508; var7++) {
			for (int var8 = 0; var8 < this.field3508; var8++) {
				if (var8 <= var7 << 1) {
					var5[var6] = -1;
				}
				var6++;
			}
		}
		this.field3509[3][1] = var5;
		byte[] var9 = new byte[this.field3508 * this.field3508];
		int var10 = 0;
		for (int var11 = 0; var11 < this.field3508; var11++) {
			for (int var12 = this.field3508 - 1; var12 >= 0; var12--) {
				if (var12 >= var11 >> 1) {
					var9[var10] = -1;
				}
				var10++;
			}
		}
		this.field3509[3][2] = var9;
		byte[] var13 = new byte[this.field3508 * this.field3508];
		int var14 = 0;
		for (int var15 = this.field3508 - 1; var15 >= 0; var15--) {
			for (int var16 = this.field3508 - 1; var16 >= 0; var16--) {
				if (var16 <= var15 << 1) {
					var13[var14] = -1;
				}
				var14++;
			}
		}
		this.field3509[3][3] = var13;
	}

	@ObfuscatedName("lt.al(S)V")
	public void method6402() {
		byte[] var1 = new byte[this.field3508 * this.field3508];
		int var2 = 0;
		for (int var3 = this.field3508 - 1; var3 >= 0; var3--) {
			for (int var4 = this.field3508 - 1; var4 >= 0; var4--) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}
				var2++;
			}
		}
		this.field3509[4][0] = var1;
		byte[] var5 = new byte[this.field3508 * this.field3508];
		int var6 = 0;
		for (int var7 = this.field3508 - 1; var7 >= 0; var7--) {
			for (int var8 = 0; var8 < this.field3508; var8++) {
				if (var8 <= var7 << 1) {
					var5[var6] = -1;
				}
				var6++;
			}
		}
		this.field3509[4][1] = var5;
		byte[] var9 = new byte[this.field3508 * this.field3508];
		int var10 = 0;
		for (int var11 = 0; var11 < this.field3508; var11++) {
			for (int var12 = 0; var12 < this.field3508; var12++) {
				if (var12 >= var11 >> 1) {
					var9[var10] = -1;
				}
				var10++;
			}
		}
		this.field3509[4][2] = var9;
		byte[] var13 = new byte[this.field3508 * this.field3508];
		int var14 = 0;
		for (int var15 = 0; var15 < this.field3508; var15++) {
			for (int var16 = this.field3508 - 1; var16 >= 0; var16--) {
				if (var16 <= var15 << 1) {
					var13[var14] = -1;
				}
				var14++;
			}
		}
		this.field3509[4][3] = var13;
	}

	@ObfuscatedName("lt.au(B)V")
	public void method6375() {
		byte[] var1 = new byte[this.field3508 * this.field3508];
		boolean var2 = false;
		byte[] var3 = new byte[this.field3508 * this.field3508];
		int var4 = 0;
		for (int var5 = 0; var5 < this.field3508; var5++) {
			for (int var6 = 0; var6 < this.field3508; var6++) {
				if (var6 <= this.field3508 / 2) {
					var3[var4] = -1;
				}
				var4++;
			}
		}
		this.field3509[5][0] = var3;
		byte[] var7 = new byte[this.field3508 * this.field3508];
		int var8 = 0;
		for (int var9 = 0; var9 < this.field3508; var9++) {
			for (int var10 = 0; var10 < this.field3508; var10++) {
				if (var9 <= this.field3508 / 2) {
					var7[var8] = -1;
				}
				var8++;
			}
		}
		this.field3509[5][1] = var7;
		byte[] var11 = new byte[this.field3508 * this.field3508];
		int var12 = 0;
		for (int var13 = 0; var13 < this.field3508; var13++) {
			for (int var14 = 0; var14 < this.field3508; var14++) {
				if (var14 >= this.field3508 / 2) {
					var11[var12] = -1;
				}
				var12++;
			}
		}
		this.field3509[5][2] = var11;
		byte[] var15 = new byte[this.field3508 * this.field3508];
		int var16 = 0;
		for (int var17 = 0; var17 < this.field3508; var17++) {
			for (int var18 = 0; var18 < this.field3508; var18++) {
				if (var17 >= this.field3508 / 2) {
					var15[var16] = -1;
				}
				var16++;
			}
		}
		this.field3509[5][3] = var15;
	}

	@ObfuscatedName("lt.ai(B)V")
	public void method6374() {
		byte[] var1 = new byte[this.field3508 * this.field3508];
		boolean var2 = false;
		byte[] var3 = new byte[this.field3508 * this.field3508];
		int var4 = 0;
		for (int var5 = 0; var5 < this.field3508; var5++) {
			for (int var6 = 0; var6 < this.field3508; var6++) {
				if (var6 <= var5 - this.field3508 / 2) {
					var3[var4] = -1;
				}
				var4++;
			}
		}
		this.field3509[6][0] = var3;
		byte[] var7 = new byte[this.field3508 * this.field3508];
		int var8 = 0;
		for (int var9 = this.field3508 - 1; var9 >= 0; var9--) {
			for (int var10 = 0; var10 < this.field3508; var10++) {
				if (var10 <= var9 - this.field3508 / 2) {
					var7[var8] = -1;
				}
				var8++;
			}
		}
		this.field3509[6][1] = var7;
		byte[] var11 = new byte[this.field3508 * this.field3508];
		int var12 = 0;
		for (int var13 = this.field3508 - 1; var13 >= 0; var13--) {
			for (int var14 = this.field3508 - 1; var14 >= 0; var14--) {
				if (var14 <= var13 - this.field3508 / 2) {
					var11[var12] = -1;
				}
				var12++;
			}
		}
		this.field3509[6][2] = var11;
		byte[] var15 = new byte[this.field3508 * this.field3508];
		int var16 = 0;
		for (int var17 = 0; var17 < this.field3508; var17++) {
			for (int var18 = this.field3508 - 1; var18 >= 0; var18--) {
				if (var18 <= var17 - this.field3508 / 2) {
					var15[var16] = -1;
				}
				var16++;
			}
		}
		this.field3509[6][3] = var15;
	}

	@ObfuscatedName("lt.aa(I)V")
	public void method6377() {
		byte[] var1 = new byte[this.field3508 * this.field3508];
		boolean var2 = false;
		byte[] var3 = new byte[this.field3508 * this.field3508];
		int var4 = 0;
		for (int var5 = 0; var5 < this.field3508; var5++) {
			for (int var6 = 0; var6 < this.field3508; var6++) {
				if (var6 >= var5 - this.field3508 / 2) {
					var3[var4] = -1;
				}
				var4++;
			}
		}
		this.field3509[7][0] = var3;
		byte[] var7 = new byte[this.field3508 * this.field3508];
		int var8 = 0;
		for (int var9 = this.field3508 - 1; var9 >= 0; var9--) {
			for (int var10 = 0; var10 < this.field3508; var10++) {
				if (var10 >= var9 - this.field3508 / 2) {
					var7[var8] = -1;
				}
				var8++;
			}
		}
		this.field3509[7][1] = var7;
		byte[] var11 = new byte[this.field3508 * this.field3508];
		int var12 = 0;
		for (int var13 = this.field3508 - 1; var13 >= 0; var13--) {
			for (int var14 = this.field3508 - 1; var14 >= 0; var14--) {
				if (var14 >= var13 - this.field3508 / 2) {
					var11[var12] = -1;
				}
				var12++;
			}
		}
		this.field3509[7][2] = var11;
		byte[] var15 = new byte[this.field3508 * this.field3508];
		int var16 = 0;
		for (int var17 = 0; var17 < this.field3508; var17++) {
			for (int var18 = this.field3508 - 1; var18 >= 0; var18--) {
				if (var18 >= var17 - this.field3508 / 2) {
					var15[var16] = -1;
				}
				var16++;
			}
		}
		this.field3509[7][3] = var15;
	}
}
