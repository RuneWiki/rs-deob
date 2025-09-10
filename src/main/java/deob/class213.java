package deob;

@ObfuscatedName("ib")
public class class213 extends class541 {

	@ObfuscatedName("ib.ac")
	public static final class338 field2310 = class338.field3854;

	@ObfuscatedName("ib.ap")
	public static final class338 field2346 = class338.field3854;

	@ObfuscatedName("ib.aq")
	public static final class338 field2314 = class338.field3854;

	@ObfuscatedName("ib.al")
	public static class321 field2315 = new class321(4096);

	@ObfuscatedName("ib.au")
	public static class321 field2316 = new class321(500);

	@ObfuscatedName("ib.ai")
	public static boolean field2317 = false;

	@ObfuscatedName("ib.an")
	public static class321 field2313 = new class321(30);

	@ObfuscatedName("ib.ar")
	public static class321 field2336 = new class321(30);

	@ObfuscatedName("ib.ae")
	public static class220[] field2319 = new class220[4];

	@ObfuscatedName("ib.ay")
	public int field2322;

	@ObfuscatedName("ib.ad")
	public int[] field2312;

	@ObfuscatedName("ib.ag")
	public int[] field2325;

	@ObfuscatedName("ib.av")
	public String field2338 = class394.field4507;

	@ObfuscatedName("ib.ah")
	public short[] field2326;

	@ObfuscatedName("ib.ab")
	public short[] field2361;

	@ObfuscatedName("ib.ax")
	public short[] field2328;

	@ObfuscatedName("ib.ak")
	public short[] field2371;

	@ObfuscatedName("ib.aj")
	public int field2330 = 1;

	@ObfuscatedName("ib.az")
	public int field2331 = 1;

	@ObfuscatedName("ib.bt")
	public int field2332 = 2;

	@ObfuscatedName("ib.bs")
	public boolean field2333 = true;

	@ObfuscatedName("ib.bu")
	public int field2309 = -1;

	@ObfuscatedName("ib.bi")
	public int field2335 = -1;

	@ObfuscatedName("ib.bd")
	public boolean field2366 = false;

	@ObfuscatedName("ib.ba")
	public boolean field2337 = false;

	@ObfuscatedName("ib.bb")
	public int field2321 = -1;

	@ObfuscatedName("ib.bo")
	public int field2339 = 16;

	@ObfuscatedName("ib.bl")
	public int field2340 = 0;

	@ObfuscatedName("ib.by")
	public int field2341 = 0;

	@ObfuscatedName("ib.bg")
	public String[] field2342 = new String[5];

	@ObfuscatedName("ib.bx")
	public int field2343 = -1;

	@ObfuscatedName("ib.bq")
	public int field2344 = -1;

	@ObfuscatedName("ib.bz")
	public boolean field2345 = false;

	@ObfuscatedName("ib.bn")
	public boolean field2370 = true;

	@ObfuscatedName("ib.be")
	public int field2347 = 128;

	@ObfuscatedName("ib.bh")
	public int field2348 = 128;

	@ObfuscatedName("ib.bk")
	public int field2349 = 128;

	@ObfuscatedName("ib.bp")
	public int field2350 = 0;

	@ObfuscatedName("ib.br")
	public int field2351 = 0;

	@ObfuscatedName("ib.bv")
	public int field2352 = 0;

	@ObfuscatedName("ib.bj")
	public boolean field2334 = false;

	@ObfuscatedName("ib.bm")
	public boolean field2354 = false;

	@ObfuscatedName("ib.bf")
	public int field2355 = -1;

	@ObfuscatedName("ib.bw")
	public int[] field2356;

	@ObfuscatedName("ib.bc")
	public int field2357 = -1;

	@ObfuscatedName("ib.cw")
	public int field2358 = -1;

	@ObfuscatedName("ib.cz")
	public int field2359 = -1;

	@ObfuscatedName("ib.cf")
	public int field2360 = 0;

	@ObfuscatedName("ib.cg")
	public int field2353 = 0;

	@ObfuscatedName("ib.ci")
	public class338 field2362 = field2310;

	@ObfuscatedName("ib.cp")
	public int field2363 = 300;

	@ObfuscatedName("ib.cm")
	public int field2364 = 300;

	@ObfuscatedName("ib.cc")
	public class338 field2365 = field2346;

	@ObfuscatedName("ib.cj")
	public class338 field2327 = field2314;

	@ObfuscatedName("ib.ce")
	public int field2367 = 0;

	@ObfuscatedName("ib.cr")
	public int field2368 = 0;

	@ObfuscatedName("ib.cb")
	public int[] field2369;

	@ObfuscatedName("ib.cu")
	public boolean field2320 = true;

	@ObfuscatedName("ib.cq")
	public boolean field2324 = false;

	@ObfuscatedName("ib.cn")
	public class427 field2372;

	@ObfuscatedName("qy.af(IB)Lib;")
	public static class213 method8013(int arg0) {
		class213 var1 = (class213) field2315.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2318.method7692(6, arg0);
		class213 var3 = new class213();
		var3.field2322 = arg0;
		if (var2 != null) {
			var3.method4303(new class591(var2));
		}
		var3.method4302();
		if (var3.field2354) {
			var3.field2332 = 0;
			var3.field2333 = false;
		}
		field2315.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("du.aw(I)V")
	public static void method3062() {
		field2315.method6456();
		field2316.method6456();
		field2313.method6456();
		field2336.method6456();
	}

	@ObfuscatedName("ib.at(I)V")
	public void method4302() {
		if (this.field2309 == -1) {
			this.field2309 = 0;
			if (this.field2312 != null && (this.field2325 == null || this.field2325[0] == 10)) {
				this.field2309 = 1;
			}
			for (int var1 = 0; var1 < 5; var1++) {
				if (this.field2342[var1] != null) {
					this.field2309 = 1;
				}
			}
		}
		if (this.field2355 == -1) {
			this.field2355 = this.field2332 == 0 ? 0 : 1;
		}
	}

	@ObfuscatedName("ib.ac(Lwb;B)V")
	public void method4303(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4304(arg0, var2);
		}
	}

	@ObfuscatedName("ib.ap(Lwb;IB)V")
	public void method4304(class591 arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.method10339();
			if (var3 > 0) {
				if (this.field2312 == null || field2317) {
					this.field2325 = new int[var3];
					this.field2312 = new int[var3];
					for (int var4 = 0; var4 < var3; var4++) {
						this.field2312[var4] = arg0.method10341();
						this.field2325[var4] = arg0.method10339();
					}
				} else {
					arg0.field5920 += var3 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.field2338 = arg0.method10350();
		} else if (arg1 == 5) {
			int var5 = arg0.method10339();
			if (var5 > 0) {
				if (this.field2312 == null || field2317) {
					this.field2325 = null;
					this.field2312 = new int[var5];
					for (int var6 = 0; var6 < var5; var6++) {
						this.field2312[var6] = arg0.method10341();
					}
				} else {
					arg0.field5920 += var5 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.field2330 = arg0.method10339();
		} else if (arg1 == 15) {
			this.field2331 = arg0.method10339();
		} else if (arg1 == 17) {
			this.field2332 = 0;
			this.field2333 = false;
		} else if (arg1 == 18) {
			this.field2333 = false;
		} else if (arg1 == 19) {
			this.field2309 = arg0.method10339();
		} else if (arg1 == 21) {
			this.field2335 = 0;
		} else if (arg1 == 22) {
			this.field2366 = true;
		} else if (arg1 == 23) {
			this.field2337 = true;
		} else if (arg1 == 24) {
			this.field2321 = arg0.method10341();
			if (this.field2321 == 65535) {
				this.field2321 = -1;
			}
		} else if (arg1 == 27) {
			this.field2332 = 1;
		} else if (arg1 == 28) {
			this.field2339 = arg0.method10339();
		} else if (arg1 == 29) {
			this.field2340 = arg0.method10340();
		} else if (arg1 == 39) {
			this.field2341 = arg0.method10340() * 25;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.field2342[arg1 - 30] = arg0.method10350();
			if (this.field2342[arg1 - 30].equalsIgnoreCase(class394.field4757)) {
				this.field2342[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			int var7 = arg0.method10339();
			this.field2326 = new short[var7];
			this.field2361 = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field2326[var8] = (short) arg0.method10341();
				this.field2361[var8] = (short) arg0.method10341();
			}
		} else if (arg1 == 41) {
			int var9 = arg0.method10339();
			this.field2328 = new short[var9];
			this.field2371 = new short[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field2328[var10] = (short) arg0.method10341();
				this.field2371[var10] = (short) arg0.method10341();
			}
		} else if (arg1 == 61) {
			arg0.method10341();
		} else if (arg1 == 62) {
			this.field2345 = true;
		} else if (arg1 == 64) {
			this.field2370 = false;
		} else if (arg1 == 65) {
			this.field2347 = arg0.method10341();
		} else if (arg1 == 66) {
			this.field2348 = arg0.method10341();
		} else if (arg1 == 67) {
			this.field2349 = arg0.method10341();
		} else if (arg1 == 68) {
			this.field2344 = arg0.method10341();
		} else if (arg1 == 69) {
			arg0.method10339();
		} else if (arg1 == 70) {
			this.field2350 = arg0.method10593();
		} else if (arg1 == 71) {
			this.field2351 = arg0.method10593();
		} else if (arg1 == 72) {
			this.field2352 = arg0.method10593();
		} else if (arg1 == 73) {
			this.field2334 = true;
		} else if (arg1 == 74) {
			this.field2354 = true;
		} else if (arg1 == 75) {
			this.field2355 = arg0.method10339();
		} else if (arg1 == 77 || arg1 == 92) {
			this.field2357 = arg0.method10341();
			if (this.field2357 == 65535) {
				this.field2357 = -1;
			}
			this.field2358 = arg0.method10341();
			if (this.field2358 == 65535) {
				this.field2358 = -1;
			}
			int var19 = -1;
			if (arg1 == 92) {
				var19 = arg0.method10341();
				if (var19 == 65535) {
					var19 = -1;
				}
			}
			int var20 = arg0.method10339();
			this.field2356 = new int[var20 + 2];
			for (int var21 = 0; var21 <= var20; var21++) {
				this.field2356[var21] = arg0.method10341();
				if (this.field2356[var21] == 65535) {
					this.field2356[var21] = -1;
				}
			}
			this.field2356[var20 + 1] = var19;
		} else if (arg1 == 78) {
			this.field2359 = arg0.method10341();
			this.field2360 = arg0.method10339();
			this.field2353 = arg0.method10339();
		} else if (arg1 == 79) {
			this.field2367 = arg0.method10341();
			this.field2368 = arg0.method10341();
			this.field2360 = arg0.method10339();
			this.field2353 = arg0.method10339();
			int var11 = arg0.method10339();
			this.field2369 = new int[var11];
			for (int var12 = 0; var12 < var11; var12++) {
				this.field2369[var12] = arg0.method10341();
			}
		} else if (arg1 == 81) {
			this.field2335 = arg0.method10339() * 256;
		} else if (arg1 == 82) {
			this.field2343 = arg0.method10341();
		} else if (arg1 == 89) {
			this.field2320 = false;
		} else if (arg1 == 90) {
			this.field2324 = true;
		} else if (arg1 == 91) {
			int var13 = arg0.method10339();
			class338 var14 = class338.field3861[var13];
			this.field2362 = var14;
		} else if (arg1 == 93) {
			int var15 = arg0.method10339();
			class338 var16 = class338.field3861[var15];
			this.field2365 = var16;
			this.field2363 = arg0.method10341();
			int var17 = arg0.method10339();
			class338 var18 = class338.field3861[var17];
			this.field2327 = var18;
			this.field2364 = arg0.method10341();
		} else if (arg1 == 249) {
			this.field2372 = class189.method3595(arg0, this.field2372);
		}
	}

	@ObfuscatedName("ib.aq(II)Z")
	public final boolean method4329(int arg0) {
		if (this.field2325 != null) {
			for (int var4 = 0; var4 < this.field2325.length; var4++) {
				if (this.field2325[var4] == arg0) {
					return Statics.field3500.method7694(this.field2312[var4] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.field2312 == null) {
			return true;
		} else if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < this.field2312.length; var3++) {
				var2 &= Statics.field3500.method7694(this.field2312[var3] & 0xFFFF, 0);
			}
			return var2;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ib.ao(B)Z")
	public final boolean method4306() {
		if (this.field2312 == null) {
			return true;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field2312.length; var2++) {
			var1 &= Statics.field3500.method7694(this.field2312[var2] & 0xFFFF, 0);
		}
		return var1;
	}

	@ObfuscatedName("ib.as(II[[IIIII)Liz;")
	public final class234 method4307(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
		long var7;
		if (this.field2325 == null) {
			var7 = (this.field2322 << 10) + arg1;
		} else {
			var7 = (this.field2322 << 10) + (arg0 << 3) + arg1;
		}
		class234 var9 = (class234) field2313.method6463(var7);
		if (var9 == null) {
			class220 var10 = this.method4337(arg0, arg1);
			if (var10 == null) {
				return null;
			}
			if (this.field2366) {
				var10.field2555 = (short) (this.field2340 + 64);
				var10.field2556 = (short) (this.field2341 + 768);
				var10.method4550();
				var9 = var10;
			} else {
				var9 = var10.method4553(this.field2340 + 64, this.field2341 + 768, -50, -10, -50);
			}
			field2313.method6454(var9, var7);
		}
		if (this.field2366) {
			var9 = ((class220) var9).method4537();
		}
		if (this.field2335 >= 0) {
			if (var9 instanceof class242) {
				var9 = ((class242) var9).method5122(arg2, arg3, arg4, arg5, true, this.field2335);
			} else if (var9 instanceof class220) {
				var9 = ((class220) var9).method4546(arg2, arg3, arg4, arg5, true, this.field2335);
			}
		}
		return var9;
	}

	@ObfuscatedName("ib.al(II[[IIIIB)Ljn;")
	public final class242 method4351(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
		long var7;
		if (this.field2325 == null) {
			var7 = (this.field2322 << 10) + arg1;
		} else {
			var7 = (this.field2322 << 10) + (arg0 << 3) + arg1;
		}
		class242 var9 = (class242) field2336.method6463(var7);
		if (var9 == null) {
			class220 var10 = this.method4337(arg0, arg1);
			if (var10 == null) {
				return null;
			}
			var9 = var10.method4553(this.field2340 + 64, this.field2341 + 768, -50, -10, -50);
			field2336.method6454(var9, var7);
		}
		if (this.field2335 >= 0) {
			var9 = var9.method5122(arg2, arg3, arg4, arg5, true, this.field2335);
		}
		return var9;
	}

	@ObfuscatedName("ib.au(II[[IIIILij;IB)Ljn;")
	public final class242 method4308(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class216 arg6, int arg7) {
		long var9;
		if (this.field2325 == null) {
			var9 = (this.field2322 << 10) + arg1;
		} else {
			var9 = (this.field2322 << 10) + (arg0 << 3) + arg1;
		}
		class242 var11 = (class242) field2336.method6463(var9);
		if (var11 == null) {
			class220 var12 = this.method4337(arg0, arg1);
			if (var12 == null) {
				return null;
			}
			var11 = var12.method4553(this.field2340 + 64, this.field2341 + 768, -50, -10, -50);
			field2336.method6454(var11, var9);
		}
		if (arg6 == null && this.field2335 == -1) {
			return var11;
		}
		class242 var13;
		if (arg6 == null) {
			var13 = var11.method5123(true);
		} else {
			var13 = arg6.method4462(var11, arg7, arg1);
		}
		if (this.field2335 >= 0) {
			var13 = var13.method5122(arg2, arg3, arg4, arg5, false, this.field2335);
		}
		return var13;
	}

	@ObfuscatedName("ib.ai(III)Liu;")
	public final class220 method4337(int arg0, int arg1) {
		class220 var3 = null;
		if (this.field2325 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.field2312 == null) {
				return null;
			}
			boolean var4 = this.field2345;
			if (arg0 == 2 && arg1 > 3) {
				var4 = !var4;
			}
			int var5 = this.field2312.length;
			for (int var6 = 0; var6 < var5; var6++) {
				int var7 = this.field2312[var6];
				if (var4) {
					var7 += 65536;
				}
				var3 = (class220) field2316.method6463((long) var7);
				if (var3 == null) {
					var3 = class220.method4529(Statics.field3500, var7 & 0xFFFF, 0);
					if (var3 == null) {
						return null;
					}
					if (var4) {
						var3.method4552();
					}
					field2316.method6454(var3, (long) var7);
				}
				if (var5 > 1) {
					field2319[var6] = var3;
				}
			}
			if (var5 > 1) {
				var3 = new class220(field2319, var5);
			}
		} else {
			int var8 = -1;
			for (int var9 = 0; var9 < this.field2325.length; var9++) {
				if (this.field2325[var9] == arg0) {
					var8 = var9;
					break;
				}
			}
			if (var8 == -1) {
				return null;
			}
			int var10 = this.field2312[var8];
			boolean var11 = this.field2345 ^ arg1 > 3;
			if (var11) {
				var10 += 65536;
			}
			var3 = (class220) field2316.method6463((long) var10);
			if (var3 == null) {
				var3 = class220.method4529(Statics.field3500, var10 & 0xFFFF, 0);
				if (var3 == null) {
					return null;
				}
				if (var11) {
					var3.method4552();
				}
				field2316.method6454(var3, (long) var10);
			}
		}
		boolean var12;
		if (this.field2347 == 128 && this.field2348 == 128 && this.field2349 == 128) {
			var12 = false;
		} else {
			var12 = true;
		}
		boolean var13;
		if (this.field2350 == 0 && this.field2351 == 0 && this.field2352 == 0) {
			var13 = false;
		} else {
			var13 = true;
		}
		class220 var14 = new class220(var3, arg1 == 0 && !var12 && !var13, this.field2326 == null, this.field2328 == null, true);
		if (arg0 == 4 && arg1 > 3) {
			var14.method4534(256);
			var14.method4545(45, 0, -45);
		}
		int var15 = arg1 & 0x3;
		if (var15 == 1) {
			var14.method4542();
		} else if (var15 == 2) {
			var14.method4561();
		} else if (var15 == 3) {
			var14.method4600();
		}
		if (this.field2326 != null) {
			for (int var16 = 0; var16 < this.field2326.length; var16++) {
				var14.method4543(this.field2326[var16], this.field2361[var16]);
			}
		}
		if (this.field2328 != null) {
			for (int var17 = 0; var17 < this.field2328.length; var17++) {
				var14.method4548(this.field2328[var17], this.field2371[var17]);
			}
		}
		if (var12) {
			var14.method4547(this.field2347, this.field2348, this.field2349);
		}
		if (var13) {
			var14.method4545(this.field2350, this.field2351, this.field2352);
		}
		return var14;
	}

	@ObfuscatedName("ib.aa(I)Lib;")
	public final class213 method4310() {
		int var1 = -1;
		if (this.field2357 != -1) {
			var1 = class356.method5877(this.field2357);
		} else if (this.field2358 != -1) {
			var1 = Statics.field4023[this.field2358];
		}
		int var2;
		if (var1 >= 0 && var1 < this.field2356.length - 1) {
			var2 = this.field2356[var1];
		} else {
			var2 = this.field2356[this.field2356.length - 1];
		}
		return var2 == -1 ? null : method8013(var2);
	}

	@ObfuscatedName("ib.am(III)I")
	public int method4311(int arg0, int arg1) {
		return class189.method9753(this.field2372, arg0, arg1);
	}

	@ObfuscatedName("ib.an(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4301(int arg0, String arg1) {
		return class189.method7632(this.field2372, arg0, arg1);
	}

	@ObfuscatedName("ib.ar(B)Z")
	public boolean method4313() {
		if (this.field2356 == null) {
			return this.field2359 != -1 || this.field2369 != null;
		}
		for (int var1 = 0; var1 < this.field2356.length; var1++) {
			if (this.field2356[var1] != -1) {
				class213 var2 = method8013(this.field2356[var1]);
				if (var2.field2359 != -1 || var2.field2369 != null) {
					return true;
				}
			}
		}
		return false;
	}
}
