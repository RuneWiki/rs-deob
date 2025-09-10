package deob;

import java.util.Arrays;

@ObfuscatedName("oz")
public class class366 {

	@ObfuscatedName("oz.ao")
	public static class321 field4078 = new class321(260);

	@ObfuscatedName("oz.as")
	public static class491 field4079 = new class491(16, class489.field5352);

	@ObfuscatedName("oz.al")
	public static int field4073 = 0;

	@ObfuscatedName("oz.au")
	public int[] field4081;

	@ObfuscatedName("oz.ai")
	public int[] field4082;

	@ObfuscatedName("oz.aa")
	public int[] field4083;

	@ObfuscatedName("oz.am")
	public int field4084 = -1;

	@ObfuscatedName("oz.an")
	public int field4085 = 0;

	@ObfuscatedName("oz.ar")
	public int field4090;

	@ObfuscatedName("oz.ae")
	public long field4089;

	@ObfuscatedName("oz.ay")
	public long field4088;

	@ObfuscatedName("oz.ad")
	public class177[] field4080;

	@ObfuscatedName("oz.ag")
	public boolean field4086 = false;

	public class366() {
	}

	public class366(class366 arg0) {
		if (arg0 != null) {
			int[] var2 = Arrays.copyOf(arg0.field4082, arg0.field4082.length);
			int[] var3 = Arrays.copyOf(arg0.field4081, arg0.field4081.length);
			class177[] var4 = (class177[]) (arg0.field4080 == null ? null : (class177[]) Arrays.copyOf(arg0.field4080, arg0.field4080.length));
			int[] var5 = Arrays.copyOf(arg0.field4083, arg0.field4083.length);
			this.method6913(var3, var2, var4, false, var5, arg0.field4085, arg0.field4090, arg0.field4084);
		}
	}

	@ObfuscatedName("kk.af(I[IIS)V")
	public static void method5655(int arg0, int[] arg1, int arg2) {
		for (int var3 = 0; var3 < Statics.field2023; var3++) {
			class187 var4 = class187.method9659(var3);
			if (var4 != null && !var4.field2033 && var4.method3925(arg2, arg0)) {
				if (class201.field2183 == null) {
					class201.field2183 = new int[7];
					class201.field2183[class201.field2187.field2190] = class217.field2507.field2510;
					class201.field2183[class201.field2180.field2190] = class217.field2501.field2510;
					class201.field2183[class201.field2181.field2190] = class217.field2500.field2510;
					class201.field2183[class201.field2182.field2190] = class217.field2502.field2510;
					class201.field2183[class201.field2188.field2190] = class217.field2505.field2510;
					class201.field2183[class201.field2184.field2190] = class217.field2496.field2510;
					class201.field2183[class201.field2185.field2190] = class217.field2506.field2510;
				}
				int var7 = class201.field2183[arg2];
				arg1[var7] = var3 + 256;
				break;
			}
		}
	}

	@ObfuscatedName("gu.aw(I)V")
	public static void method3820() {
		field4078.method6456();
		field4079.method9137();
		field4073 = 0;
	}

	@ObfuscatedName("oz.at([I[I[Lgq;Z[IIIIB)V")
	public void method6913(int[] arg0, int[] arg1, class177[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
		this.field4080 = arg2;
		this.field4086 = arg3;
		this.field4084 = arg7;
		this.method6914(arg0, arg1, arg4, arg5, arg6);
	}

	@ObfuscatedName("oz.ac([I[I[IIIB)V")
	public void method6914(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
		if (arg0 == null) {
			arg0 = this.method6915(arg3);
		}
		if (arg1 == null) {
			arg1 = this.method6915(arg3);
		}
		this.field4081 = arg0;
		this.field4082 = arg1;
		this.field4083 = arg2;
		this.field4085 = arg3;
		this.field4090 = arg4;
		this.method6982();
	}

	@ObfuscatedName("oz.ap(II)[I")
	public int[] method6915(int arg0) {
		int[] var2 = new int[12];
		for (int var3 = 0; var3 < 7; var3++) {
			method5655(arg0, var2, var3);
		}
		return var2;
	}

	@ObfuscatedName("oz.aq(IZI)V")
	public void method6972(int arg0, boolean arg1) {
		int[] var3 = this.field4082;
		if (class201.field2183 == null) {
			class201.field2183 = new int[7];
			class201.field2183[class201.field2187.field2190] = class217.field2507.field2510;
			class201.field2183[class201.field2180.field2190] = class217.field2501.field2510;
			class201.field2183[class201.field2181.field2190] = class217.field2500.field2510;
			class201.field2183[class201.field2182.field2190] = class217.field2502.field2510;
			class201.field2183[class201.field2188.field2190] = class217.field2505.field2510;
			class201.field2183[class201.field2184.field2190] = class217.field2496.field2510;
			class201.field2183[class201.field2185.field2190] = class217.field2506.field2510;
		}
		int var5 = class201.field2183[arg0];
		int var6 = var3[var5];
		if (var6 == 0) {
			return;
		}
		var6 -= 256;
		class187 var7;
		do {
			if (arg1) {
				var6++;
				if (var6 >= Statics.field2023) {
					var6 = 0;
				}
			} else {
				var6--;
				if (var6 < 0) {
					var6 = Statics.field2023 - 1;
				}
			}
			var7 = class187.method9659(var6);
		} while (var7 == null || var7.field2033 || !var7.method3925(arg0, this.field4085));
		int[] var8 = this.field4082;
		if (class201.field2183 == null) {
			class201.field2183 = new int[7];
			class201.field2183[class201.field2187.field2190] = class217.field2507.field2510;
			class201.field2183[class201.field2180.field2190] = class217.field2501.field2510;
			class201.field2183[class201.field2181.field2190] = class217.field2500.field2510;
			class201.field2183[class201.field2182.field2190] = class217.field2502.field2510;
			class201.field2183[class201.field2188.field2190] = class217.field2505.field2510;
			class201.field2183[class201.field2184.field2190] = class217.field2496.field2510;
			class201.field2183[class201.field2185.field2190] = class217.field2506.field2510;
		}
		int var10 = class201.field2183[arg0];
		var8[var10] = var6 + 256;
		this.method6982();
	}

	@ObfuscatedName("oz.ao(IZI)V")
	public void method6930(int arg0, boolean arg1) {
		int var3 = this.field4083[arg0];
		if (arg1) {
			do {
				var3++;
				if (var3 >= Statics.field4075[arg0].length) {
					var3 = 0;
				}
			} while (!class368.method4023(arg0, var3));
		} else {
			do {
				var3--;
				if (var3 < 0) {
					var3 = Statics.field4075[arg0].length - 1;
				}
			} while (!class368.method4023(arg0, var3));
		}
		this.field4083[arg0] = var3;
		this.method6982();
	}

	@ObfuscatedName("oz.as(II)V")
	public void method6918(int arg0) {
		if (this.field4085 != arg0) {
			this.method6914(null, null, this.field4083, arg0, -1);
		}
	}

	@ObfuscatedName("oz.al(Lwb;B)V")
	public void method6965(class591 arg0) {
		arg0.method10320(this.field4085);
		for (int var2 = 0; var2 < 7; var2++) {
			int[] var3 = this.field4082;
			if (class201.field2183 == null) {
				class201.field2183 = new int[7];
				class201.field2183[class201.field2187.field2190] = class217.field2507.field2510;
				class201.field2183[class201.field2180.field2190] = class217.field2501.field2510;
				class201.field2183[class201.field2181.field2190] = class217.field2500.field2510;
				class201.field2183[class201.field2182.field2190] = class217.field2502.field2510;
				class201.field2183[class201.field2188.field2190] = class217.field2505.field2510;
				class201.field2183[class201.field2184.field2190] = class217.field2496.field2510;
				class201.field2183[class201.field2185.field2190] = class217.field2506.field2510;
			}
			int var5 = class201.field2183[var2];
			int var6 = var3[var5];
			if (var6 == 0) {
				arg0.method10321(-1);
			} else {
				arg0.method10321(var6 - 256);
			}
		}
		for (int var7 = 0; var7 < 5; var7++) {
			arg0.method10320(this.field4083[var7]);
		}
	}

	@ObfuscatedName("oz.au(I)V")
	public void method6982() {
		long var1 = this.field4089;
		long[] var3 = class591.field5918;
		this.field4089 = -1L;
		for (int var4 = 0; var4 < 12; var4++) {
			this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) (this.field4082[var4] >> 24)) & 0xFFL)];
			this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) (this.field4082[var4] >> 16)) & 0xFFL)];
			this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) (this.field4082[var4] >> 8)) & 0xFFL)];
			this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) this.field4082[var4]) & 0xFFL)];
		}
		if (this.field4080 != null) {
			for (int var5 = 0; var5 < this.field4080.length; var5++) {
				if (this.field4080[var5] != null) {
					if (this.field4080[var5].field1948 != null) {
						for (int var6 = 0; var6 < this.field4080[var5].field1948.length; var6++) {
							this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) (this.field4080[var5].field1948[var6] >> 8)) & 0xFFL)];
							this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) this.field4080[var5].field1948[var6]) & 0xFFL)];
						}
					}
					if (this.field4080[var5].field1950 != null) {
						for (int var7 = 0; var7 < this.field4080[var5].field1950.length; var7++) {
							this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) (this.field4080[var5].field1950[var7] >> 8)) & 0xFFL)];
							this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) this.field4080[var5].field1950[var7]) & 0xFFL)];
						}
					}
				}
			}
		}
		for (int var8 = 0; var8 < 5; var8++) {
			this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) this.field4083[var8]) & 0xFFL)];
		}
		this.field4089 = this.field4089 >>> 8 ^ var3[(int) ((this.field4089 ^ (long) this.field4085) & 0xFFL)];
		if (var1 != 0L && this.field4089 != var1 || this.field4086) {
			field4078.method6455(var1);
		}
	}

	@ObfuscatedName("oz.ai(Lij;ILij;II)Ljn;")
	public class242 method6986(class216 arg0, int arg1, class216 arg2, int arg3) {
		if (this.field4090 != -1) {
			return class196.method2096(this.field4090).method4028(arg0, arg1, arg2, arg3, null);
		}
		long var5 = this.field4089;
		int[] var7 = this.field4082;
		if (arg0 != null && (arg0.field2485 >= 0 || arg0.field2491 >= 0)) {
			var7 = new int[12];
			System.arraycopy(this.field4082, 0, var7, 0, var7.length);
			if (arg0.field2485 >= 0) {
				var5 ^= (long) (arg0.field2485 - this.field4082[class217.field2503.field2510]) << 40;
				var7[class217.field2503.field2510] = this.method6989(arg0.field2485);
			}
			if (arg0.field2491 >= 0) {
				var5 ^= (long) (arg0.field2491 - this.field4082[class217.field2499.field2510]) << 48;
				var7[class217.field2499.field2510] = this.method6989(arg0.field2491);
			}
		}
		class242 var8 = (class242) field4078.method6463(var5);
		if (var8 == null) {
			boolean var9 = false;
			for (int var10 = 0; var10 < 12; var10++) {
				int var11 = var7[var10];
				if (this.method6929(var11)) {
					class187 var12 = this.method6925(var11);
					if (var12 != null && !var12.method3926()) {
						var9 = true;
					}
				}
				if (this.method6931(var11)) {
					class177 var13 = this.field4080 == null ? null : this.field4080[var10];
					if (!this.method6932(var11).method4363(this.field4085, var13)) {
						var9 = true;
					}
				}
			}
			if (var9) {
				if (this.field4088 != -1L) {
					var8 = (class242) field4078.method6463(this.field4088);
				}
				if (var8 == null) {
					return null;
				}
			}
			if (var8 == null) {
				class220[] var14 = new class220[12];
				int var15 = 0;
				for (int var16 = 0; var16 < 12; var16++) {
					int var17 = var7[var16];
					if (this.method6929(var17)) {
						class187 var18 = this.method6925(var17);
						class220 var19 = null;
						if (var18 != null) {
							var19 = var18.method3930();
						}
						if (var19 != null) {
							var14[var15++] = var19;
						}
					}
					if (this.method6931(var17)) {
						class214 var20 = this.method6932(var17);
						class177 var21 = this.field4080 == null ? null : this.field4080[var16];
						class220 var22 = var20.method4364(this.field4085, var21);
						if (var22 != null) {
							var14[var15++] = var22;
						}
					}
				}
				class220 var23 = new class220(var14, var15);
				for (int var24 = 0; var24 < 5; var24++) {
					if (this.field4083[var24] < Statics.field4075[var24].length) {
						var23.method4543(Statics.field150[var24], Statics.field4075[var24][this.field4083[var24]]);
					}
					if (this.field4083[var24] < Statics.field4077[var24].length) {
						var23.method4543(Statics.field4076[var24], Statics.field4077[var24][this.field4083[var24]]);
					}
				}
				var8 = var23.method4553(64, 850, -30, -50, -30);
				field4078.method6454(var8, var5);
				this.field4088 = var5;
			}
		}
		class242 var25;
		if (arg0 == null && arg2 == null) {
			var25 = var8.method5123(true);
		} else if (arg0 != null && arg2 != null) {
			var25 = arg0.method4464(var8, arg1, arg2, arg3);
		} else if (arg0 == null) {
			var25 = arg2.method4461(var8, arg3);
		} else {
			var25 = arg0.method4461(var8, arg1);
		}
		return var25;
	}

	@ObfuscatedName("oz.aa(B)Liu;")
	public class220 method6927() {
		if (this.field4090 != -1) {
			return class196.method2096(this.field4090).method4078(null);
		}
		boolean var1 = false;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = this.field4082[var2];
			if (this.method6929(var3)) {
				class187 var4 = this.method6925(var3);
				if (var4 != null && !var4.method3928()) {
					var1 = true;
				}
			}
			if (this.method6931(var3)) {
				class177 var5 = this.field4080 == null ? null : this.field4080[var2];
				if (!this.method6932(var3).method4365(this.field4085, var5)) {
					var1 = true;
				}
			}
		}
		if (var1) {
			return null;
		}
		class220[] var6 = new class220[12];
		int var7 = 0;
		for (int var8 = 0; var8 < 12; var8++) {
			int var9 = this.field4082[var8];
			if (this.method6929(var9)) {
				class187 var10 = this.method6925(var9);
				class220 var11 = null;
				if (var10 != null) {
					var11 = var10.method3931();
				}
				if (var11 != null) {
					var6[var7++] = var11;
				}
			}
			if (this.method6931(var9)) {
				class177 var12 = this.field4080 == null ? null : this.field4080[var8];
				class220 var13 = this.method6932(var9).method4428(this.field4085, var12);
				if (var13 != null) {
					var6[var7++] = var13;
				}
			}
		}
		class220 var14 = new class220(var6, var7);
		for (int var15 = 0; var15 < 5; var15++) {
			if (this.field4083[var15] < Statics.field4075[var15].length) {
				var14.method4543(Statics.field150[var15], Statics.field4075[var15][this.field4083[var15]]);
			}
			if (this.field4083[var15] < Statics.field4077[var15].length) {
				var14.method4543(Statics.field4076[var15], Statics.field4077[var15][this.field4083[var15]]);
			}
		}
		return var14;
	}

	@ObfuscatedName("oz.am(I)I")
	public int method6923() {
		long var1 = this.field4089;
		if (this.field4090 != -1) {
			var1 = (long) this.field4090 | 0xFFFFFFFFFFFF0000L;
		}
		Integer var3 = (Integer) field4079.method9136(var1);
		if (var3 == null) {
			var3 = ++field4073 - 1;
			field4079.method9151(var1, var3);
			field4073 %= 65535;
		}
		return var3;
	}

	@ObfuscatedName("oz.an(I)V")
	public void method6912() {
		this.method6914(this.field4081, this.field4082, this.field4083, this.field4085, this.field4090);
	}

	@ObfuscatedName("oz.ar(IIB)V")
	public void method6949(int arg0, int arg1) {
		boolean var3 = this.field4085 != arg1;
		this.field4085 = arg1;
		if (var3) {
			if (this.field4085 == arg0) {
				for (int var4 = 0; var4 < 7; var4++) {
					if (class201.field2183 == null) {
						class201.field2183 = new int[7];
						class201.field2183[class201.field2187.field2190] = class217.field2507.field2510;
						class201.field2183[class201.field2180.field2190] = class217.field2501.field2510;
						class201.field2183[class201.field2181.field2190] = class217.field2500.field2510;
						class201.field2183[class201.field2182.field2190] = class217.field2502.field2510;
						class201.field2183[class201.field2188.field2190] = class217.field2505.field2510;
						class201.field2183[class201.field2184.field2190] = class217.field2496.field2510;
						class201.field2183[class201.field2185.field2190] = class217.field2506.field2510;
					}
					int var6 = class201.field2183[var4];
					if (this.field4082[var6] > 0 && this.field4082[var6] < 2048) {
						this.field4082[var6] = this.field4081[var6];
					}
				}
			} else {
				if (this.field4082[0] < 2048 || this.method6957()) {
					this.field4082[class217.field2501.field2510] = 1;
				}
				for (int var8 = 0; var8 < 7; var8++) {
					if (class201.field2183 == null) {
						class201.field2183 = new int[7];
						class201.field2183[class201.field2187.field2190] = class217.field2507.field2510;
						class201.field2183[class201.field2180.field2190] = class217.field2501.field2510;
						class201.field2183[class201.field2181.field2190] = class217.field2500.field2510;
						class201.field2183[class201.field2182.field2190] = class217.field2502.field2510;
						class201.field2183[class201.field2188.field2190] = class217.field2505.field2510;
						class201.field2183[class201.field2184.field2190] = class217.field2496.field2510;
						class201.field2183[class201.field2185.field2190] = class217.field2506.field2510;
					}
					int var10 = class201.field2183[var8];
					if (this.field4082[var10] > 0 && this.field4082[var10] < 2048) {
						method5655(arg1, this.field4082, var8);
					}
				}
			}
		}
		this.method6912();
	}

	@ObfuscatedName("oz.ae(I)Z")
	public boolean method6957() {
		if (this.method6931(this.field4082[0])) {
			class214 var1 = this.method6932(this.field4082[0]);
			return class217.field2501.field2510 != var1.field2401 && class217.field2501.field2510 != var1.field2402;
		} else {
			return false;
		}
	}

	@ObfuscatedName("oz.ay(III)V")
	public void method6920(int arg0, int arg1) {
		this.field4083[arg0] = arg1;
		this.method6912();
	}

	@ObfuscatedName("oz.ad(IB)V")
	public void method6928(int arg0) {
		class214 var2 = class214.method2737(arg0);
		this.field4082[var2.field2438] = arg0 + 2048;
		if (var2.field2401 != -1) {
			this.field4082[var2.field2401] = 0;
		}
		if (var2.field2402 != -1) {
			this.field4082[var2.field2402] = 0;
		}
		this.method6912();
	}

	@ObfuscatedName("oz.ag(II)Z")
	public boolean method6929(int arg0) {
		return arg0 >= 256 && arg0 < 2048;
	}

	@ObfuscatedName("oz.av(II)Lhs;")
	public class187 method6925(int arg0) {
		return class187.method9659(arg0 - 256);
	}

	@ObfuscatedName("oz.ah(II)Z")
	public boolean method6931(int arg0) {
		return arg0 >= 2048;
	}

	@ObfuscatedName("oz.ab(II)Lis;")
	public class214 method6932(int arg0) {
		return class214.method2737(arg0 - 2048);
	}

	@ObfuscatedName("oz.ax(II)I")
	public int method6989(int arg0) {
		return arg0 - 512 + 2048;
	}
}
