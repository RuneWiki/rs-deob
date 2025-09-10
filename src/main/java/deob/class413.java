package deob;

import java.util.Arrays;

@ObfuscatedName("px")
public abstract class class413 {

	@ObfuscatedName("px.bs")
	public static int field4962 = 0;

	@ObfuscatedName("px.bu")
	public static class613 field4969 = new class613();

	@ObfuscatedName("px.bi")
	public int field4960;

	@ObfuscatedName("px.bd")
	public boolean field4976;

	@ObfuscatedName("px.ba")
	public boolean field4974;

	@ObfuscatedName("px.bb")
	public int field4967;

	@ObfuscatedName("px.bo")
	public int[] field4968;

	@ObfuscatedName("px.bl")
	public int[] field4975;

	@ObfuscatedName("px.by")
	public class488 field4970;

	@ObfuscatedName("px.bg")
	public int[] field4971;

	@ObfuscatedName("px.bx")
	public int[] field4972;

	@ObfuscatedName("px.bq")
	public int field4973;

	@ObfuscatedName("px.bz")
	public int[] field4964;

	@ObfuscatedName("px.bn")
	public int[] field4982;

	@ObfuscatedName("px.be")
	public int[] field4963;

	@ObfuscatedName("px.bh")
	public int[][] field4977;

	@ObfuscatedName("px.bk")
	public int[][] field4965;

	@ObfuscatedName("px.bp")
	public class488[] field4979;

	@ObfuscatedName("px.br")
	public Object[] field4978;

	@ObfuscatedName("px.bv")
	public Object[][] field4981;

	public class413(boolean arg0, boolean arg1) {
		this.field4976 = arg0;
		this.field4974 = arg1;
	}

	@ObfuscatedName("vg.be([BI)[B")
	public static final byte[] method9799(byte[] arg0) {
		class591 var1 = new class591(arg0);
		int var2 = var1.method10339();
		int var3 = var1.method10345();
		if (var3 < 0 || field4962 != 0 && var3 > field4962) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var4 = new byte[var3];
			var1.method10407(var4, 0, var3);
			return var4;
		} else {
			int var5 = var1.method10345();
			if (var5 < 0 || field4962 != 0 && var5 > field4962) {
				throw new RuntimeException();
			}
			byte[] var6 = new byte[var5];
			if (var2 == 1) {
				class594.method10618(var6, var5, arg0, var3, 9);
			} else {
				field4969.method11018(var1, var6);
			}
			return var6;
		}
	}

	@ObfuscatedName("px.bh([BI)V")
	public void method7691(byte[] arg0) {
		this.field4960 = class591.method9122(arg0, arg0.length);
		class591 var2 = new class591(method9799(arg0));
		int var3 = var2.method10339();
		if (var3 < 5 || var3 > 7) {
			throw new RuntimeException("");
		}
		if (var3 >= 6) {
			var2.method10345();
		}
		int var4 = var2.method10339();
		boolean var5 = (var4 & 0x1) != 0;
		boolean var6 = (var4 & 0x2) != 0;
		boolean var7 = (var4 & 0x4) != 0;
		boolean var8 = (var4 & 0x8) != 0;
		if (var6) {
			throw new UnsupportedOperationException("");
		} else if (var8) {
			throw new UnsupportedOperationException("");
		} else {
			if (var3 >= 7) {
				this.field4967 = var2.method10358();
			} else {
				this.field4967 = var2.method10341();
			}
			int var9 = 0;
			int var10 = -1;
			this.field4968 = new int[this.field4967];
			if (var3 >= 7) {
				for (int var11 = 0; var11 < this.field4967; var11++) {
					this.field4968[var11] = var9 += var2.method10358();
					if (this.field4968[var11] > var10) {
						var10 = this.field4968[var11];
					}
				}
			} else {
				for (int var12 = 0; var12 < this.field4967; var12++) {
					this.field4968[var12] = var9 += var2.method10341();
					if (this.field4968[var12] > var10) {
						var10 = this.field4968[var12];
					}
				}
			}
			this.field4973 = var10 + 1;
			this.field4964 = new int[this.field4973];
			this.field4982 = new int[this.field4973];
			this.field4963 = new int[this.field4973];
			this.field4977 = new int[this.field4973][];
			this.field4978 = new Object[this.field4973];
			this.field4981 = new Object[this.field4973][];
			if (var5) {
				this.field4975 = new int[this.field4973];
				Arrays.fill(this.field4975, -1);
				for (int var13 = 0; var13 < this.field4967; var13++) {
					this.field4975[this.field4968[var13]] = var2.method10345();
				}
				this.field4970 = new class488(this.field4975);
			}
			for (int var14 = 0; var14 < this.field4967; var14++) {
				this.field4964[this.field4968[var14]] = var2.method10345();
			}
			if (var7) {
				this.field4971 = new int[this.field4973];
				this.field4972 = new int[this.field4973];
				for (int var15 = 0; var15 < this.field4967; var15++) {
					this.field4971[this.field4968[var15]] = var2.method10345();
					this.field4972[this.field4968[var15]] = var2.method10345();
				}
			}
			for (int var16 = 0; var16 < this.field4967; var16++) {
				this.field4982[this.field4968[var16]] = var2.method10345();
			}
			if (var3 >= 7) {
				for (int var17 = 0; var17 < this.field4967; var17++) {
					this.field4963[this.field4968[var17]] = var2.method10358();
				}
				for (int var18 = 0; var18 < this.field4967; var18++) {
					int var19 = this.field4968[var18];
					int var20 = this.field4963[var19];
					int var21 = 0;
					int var22 = -1;
					this.field4977[var19] = new int[var20];
					for (int var23 = 0; var23 < var20; var23++) {
						int var24 = this.field4977[var19][var23] = var21 += var2.method10358();
						if (var24 > var22) {
							var22 = var24;
						}
					}
					this.field4981[var19] = new Object[var22 + 1];
				}
			} else {
				for (int var25 = 0; var25 < this.field4967; var25++) {
					this.field4963[this.field4968[var25]] = var2.method10341();
				}
				for (int var26 = 0; var26 < this.field4967; var26++) {
					int var27 = this.field4968[var26];
					int var28 = this.field4963[var27];
					int var29 = 0;
					int var30 = -1;
					this.field4977[var27] = new int[var28];
					for (int var31 = 0; var31 < var28; var31++) {
						int var32 = this.field4977[var27][var31] = var29 += var2.method10341();
						if (var32 > var30) {
							var30 = var32;
						}
					}
					this.field4981[var27] = new Object[var30 + 1];
				}
			}
			if (var5) {
				this.field4965 = new int[var10 + 1][];
				this.field4979 = new class488[var10 + 1];
				for (int var33 = 0; var33 < this.field4967; var33++) {
					int var34 = this.field4968[var33];
					int var35 = this.field4963[var34];
					this.field4965[var34] = new int[this.field4981[var34].length];
					Arrays.fill(this.field4965[var34], -1);
					for (int var36 = 0; var36 < var35; var36++) {
						int var37 = this.field4977[var34] == null ? var36 : this.field4977[var34][var36];
						this.field4965[var34][var37] = var2.method10345();
					}
					this.field4979[var34] = new class488(this.field4965[var34]);
				}
			}
		}
	}

	@ObfuscatedName("px.at(II)V")
	public void method7678(int arg0) {
	}

	@ObfuscatedName("px.bk(IIB)[B")
	public byte[] method7692(int arg0, int arg1) {
		return this.method7693(arg0, arg1, null);
	}

	@ObfuscatedName("px.bp(II[IB)[B")
	public byte[] method7693(int arg0, int arg1, int[] arg2) {
		if (arg0 < 0 || arg0 >= this.field4981.length || this.field4981[arg0] == null || arg1 < 0 || arg1 >= this.field4981[arg0].length) {
			return null;
		}
		if (this.field4981[arg0][arg1] == null) {
			boolean var4 = this.method7707(arg0, arg2);
			if (!var4) {
				this.method7649(arg0);
				boolean var5 = this.method7707(arg0, arg2);
				if (!var5) {
					return null;
				}
			}
		}
		byte[] var6 = class372.method4102(this.field4981[arg0][arg1], false);
		if (this.field4974) {
			this.field4981[arg0][arg1] = null;
		}
		return var6;
	}

	@ObfuscatedName("px.br(III)Z")
	public boolean method7694(int arg0, int arg1) {
		if (arg0 < 0 || arg0 >= this.field4981.length || this.field4981[arg0] == null || arg1 < 0 || arg1 >= this.field4981[arg0].length) {
			return false;
		} else if (this.field4981[arg0][arg1] != null) {
			return true;
		} else if (this.field4978[arg0] == null) {
			this.method7649(arg0);
			return this.field4978[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("px.bv(II)Z")
	public boolean method7732(int arg0) {
		if (this.field4981.length == 1) {
			return this.method7694(0, arg0);
		} else if (this.field4981[arg0].length == 1) {
			return this.method7694(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("px.bj(IB)Z")
	public boolean method7761(int arg0) {
		if (this.field4978[arg0] == null) {
			this.method7649(arg0);
			return this.field4978[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("px.bm(I)Z")
	public boolean method7697() {
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field4968.length; var2++) {
			int var3 = this.field4968[var2];
			if (this.field4978[var3] == null) {
				this.method7649(var3);
				if (this.field4978[var3] == null) {
					var1 = false;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("px.au(II)I")
	public int method7671(int arg0) {
		return this.field4978[arg0] == null ? 0 : 100;
	}

	@ObfuscatedName("px.bf(II)[B")
	public byte[] method7775(int arg0) {
		if (this.field4981.length == 1) {
			return this.method7692(0, arg0);
		} else if (this.field4981[arg0].length == 1) {
			return this.method7692(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("px.bw(III)[B")
	public byte[] method7699(int arg0, int arg1) {
		if (arg0 < 0 || arg0 >= this.field4981.length || this.field4981[arg0] == null || arg1 < 0 || arg1 >= this.field4981[arg0].length) {
			return null;
		}
		if (this.field4981[arg0][arg1] == null) {
			boolean var3 = this.method7707(arg0, null);
			if (!var3) {
				this.method7649(arg0);
				boolean var4 = this.method7707(arg0, null);
				if (!var4) {
					return null;
				}
			}
		}
		return class372.method4102(this.field4981[arg0][arg1], false);
	}

	@ObfuscatedName("px.bc(II)[B")
	public byte[] method7754(int arg0) {
		if (this.field4981.length == 1) {
			return this.method7699(0, arg0);
		} else if (this.field4981[arg0].length == 1) {
			return this.method7699(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("px.ac(II)V")
	public void method7649(int arg0) {
	}

	@ObfuscatedName("px.cw(II)[I")
	public int[] method7708(int arg0) {
		return arg0 >= 0 && arg0 < this.field4977.length ? this.field4977[arg0] : null;
	}

	@ObfuscatedName("px.cz(II)I")
	public int method7702(int arg0) {
		return this.field4981 == null || arg0 >= this.field4981.length || this.field4981[arg0] == null ? 0 : this.field4981[arg0].length;
	}

	@ObfuscatedName("px.cf(I)I")
	public int method7700() {
		return this.field4973;
	}

	@ObfuscatedName("px.cg(I)V")
	public void method7704() {
		for (int var1 = 0; var1 < this.field4978.length; var1++) {
			this.field4978[var1] = null;
		}
	}

	@ObfuscatedName("px.ci(IB)V")
	public void method7705(int arg0) {
		for (int var2 = 0; var2 < this.field4981[arg0].length; var2++) {
			this.field4981[arg0][var2] = null;
		}
	}

	@ObfuscatedName("px.cp(I)V")
	public void method7779() {
		for (int var1 = 0; var1 < this.field4981.length; var1++) {
			if (this.field4981[var1] != null) {
				for (int var2 = 0; var2 < this.field4981[var1].length; var2++) {
					this.field4981[var1][var2] = null;
				}
			}
		}
	}

	@ObfuscatedName("px.cm(I[IB)Z")
	public boolean method7707(int arg0, int[] arg1) {
		if (this.field4978[arg0] == null) {
			return false;
		}
		int var3 = this.field4963[arg0];
		int[] var4 = this.field4977[arg0];
		Object[] var5 = this.field4981[arg0];
		boolean var6 = true;
		for (int var7 = 0; var7 < var3; var7++) {
			if (var5[var4[var7]] == null) {
				var6 = false;
				break;
			}
		}
		if (var6) {
			return true;
		}
		byte[] var8;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			var8 = class372.method4102(this.field4978[arg0], false);
		} else {
			var8 = class372.method4102(this.field4978[arg0], true);
			class591 var9 = new class591(var8);
			var9.method10366(arg1, 5, var9.field5917.length);
		}
		byte[] var10;
		try {
			var10 = method9799(var8);
		} catch (RuntimeException var27) {
			throw class617.method214(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class591.method9122(var8, var8.length) + "," + class591.method9122(var8, var8.length - 2) + "," + this.field4964[arg0] + "," + this.field4960);
		}
		if (this.field4976) {
			this.field4978[arg0] = null;
		}
		if (var3 > 1) {
			int var12 = var10.length;
			int var28 = var12 - 1;
			int var13 = var10[var28] & 0xFF;
			int var14 = var28 - var3 * var13 * 4;
			class591 var15 = new class591(var10);
			int[] var16 = new int[var3];
			var15.field5920 = var14;
			for (int var17 = 0; var17 < var13; var17++) {
				int var18 = 0;
				for (int var19 = 0; var19 < var3; var19++) {
					var18 += var15.method10345();
					var16[var19] += var18;
				}
			}
			byte[][] var20 = new byte[var3][];
			for (int var21 = 0; var21 < var3; var21++) {
				var20[var21] = new byte[var16[var21]];
				var16[var21] = 0;
			}
			var15.field5920 = var14;
			int var22 = 0;
			for (int var23 = 0; var23 < var13; var23++) {
				int var24 = 0;
				for (int var25 = 0; var25 < var3; var25++) {
					var24 += var15.method10345();
					System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
					var16[var25] += var24;
					var22 += var24;
				}
			}
			for (int var26 = 0; var26 < var3; var26++) {
				if (this.field4974) {
					var5[var4[var26]] = var20[var26];
				} else {
					var5[var4[var26]] = class372.method7554(var20[var26], false);
				}
			}
		} else if (this.field4974) {
			var5[var4[0]] = var10;
		} else {
			var5[var4[0]] = class372.method7554(var10, false);
		}
		return true;
	}

	@ObfuscatedName("px.cc(Ljava/lang/String;I)I")
	public int method7715(String arg0) {
		String var2 = arg0.toLowerCase();
		return this.field4970.method9117(class446.method3583(var2));
	}

	@ObfuscatedName("px.cj(ILjava/lang/String;S)I")
	public int method7709(int arg0, String arg1) {
		String var3 = arg1.toLowerCase();
		return this.field4979[arg0].method9117(class446.method3583(var3));
	}

	@ObfuscatedName("px.ce(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method7710(String arg0, String arg1) {
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.field4970.method9117(class446.method3583(var3));
		if (var5 < 0) {
			return false;
		} else {
			int var6 = this.field4979[var5].method9117(class446.method3583(var4));
			return var6 >= 0;
		}
	}

	@ObfuscatedName("px.cr(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method7723(String arg0, String arg1) {
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.field4970.method9117(class446.method3583(var3));
		int var6 = this.field4979[var5].method9117(class446.method3583(var4));
		return this.method7692(var5, var6);
	}

	@ObfuscatedName("px.cb(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method7711(String arg0, String arg1) {
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.field4970.method9117(class446.method3583(var3));
		int var6 = this.field4979[var5].method9117(class446.method3583(var4));
		return this.method7694(var5, var6);
	}

	@ObfuscatedName("px.cu(Ljava/lang/String;B)Z")
	public boolean method7712(String arg0) {
		String var2 = arg0.toLowerCase();
		int var3 = this.field4970.method9117(class446.method3583(var2));
		return this.method7761(var3);
	}

	@ObfuscatedName("px.cq(Ljava/lang/String;I)V")
	public void method7741(String arg0) {
		String var2 = arg0.toLowerCase();
		int var3 = this.field4970.method9117(class446.method3583(var2));
		if (var3 >= 0) {
			this.method7678(var3);
		}
	}

	@ObfuscatedName("px.cn(Ljava/lang/String;B)I")
	public int method7714(String arg0) {
		String var2 = arg0.toLowerCase();
		int var3 = this.field4970.method9117(class446.method3583(var2));
		return this.method7671(var3);
	}
}
