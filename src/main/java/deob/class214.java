package deob;

@ObfuscatedName("is")
public class class214 extends class541 {

	@ObfuscatedName("is.ae")
	public static class321 field2380 = new class321(64);

	@ObfuscatedName("is.ay")
	public static class321 field2381 = new class321(50);

	@ObfuscatedName("is.ad")
	public static class321 field2382 = new class321(200);

	@ObfuscatedName("is.av")
	public int field2384;

	@ObfuscatedName("is.ah")
	public int field2385;

	@ObfuscatedName("is.ab")
	public String field2429 = class394.field4507;

	@ObfuscatedName("is.ax")
	public String field2387 = class394.field4507;

	@ObfuscatedName("is.ak")
	public short[] field2388;

	@ObfuscatedName("is.aj")
	public short[] field2389;

	@ObfuscatedName("is.az")
	public short[] field2390;

	@ObfuscatedName("is.bt")
	public short[] field2374;

	@ObfuscatedName("is.bs")
	public int field2431 = 2000;

	@ObfuscatedName("is.bu")
	public int field2425 = 0;

	@ObfuscatedName("is.bi")
	public int field2394 = 0;

	@ObfuscatedName("is.bd")
	public int field2393 = 0;

	@ObfuscatedName("is.ba")
	public int field2379 = 0;

	@ObfuscatedName("is.bb")
	public int field2399 = 0;

	@ObfuscatedName("is.bo")
	public int field2398 = 0;

	@ObfuscatedName("is.bl")
	public int field2411 = 1;

	@ObfuscatedName("is.by")
	public int field2438 = -1;

	@ObfuscatedName("is.bg")
	public int field2401 = -1;

	@ObfuscatedName("is.bx")
	public int field2402 = -1;

	@ObfuscatedName("is.bq")
	public boolean field2403 = false;

	@ObfuscatedName("is.bz")
	public String[] field2404 = new String[] { null, null, class394.field4480, null, null };

	@ObfuscatedName("is.bn")
	public String[] field2397 = new String[] { null, null, null, null, class394.field4481 };

	@ObfuscatedName("is.be")
	public String[][] field2421 = (String[][]) null;

	@ObfuscatedName("is.bh")
	public int[] field2407;

	@ObfuscatedName("is.bk")
	public int[] field2408;

	@ObfuscatedName("is.bp")
	public int field2409 = -1;

	@ObfuscatedName("is.br")
	public int field2410 = -1;

	@ObfuscatedName("is.bv")
	public int field2391 = 128;

	@ObfuscatedName("is.bj")
	public int field2412 = 128;

	@ObfuscatedName("is.bm")
	public int field2406 = 128;

	@ObfuscatedName("is.bf")
	public int field2414 = 0;

	@ObfuscatedName("is.bw")
	public int field2383 = 0;

	@ObfuscatedName("is.bc")
	public int field2416 = 0;

	@ObfuscatedName("is.cw")
	public int field2417 = 0;

	@ObfuscatedName("is.cz")
	public class427 field2418;

	@ObfuscatedName("is.cf")
	public boolean field2419 = false;

	@ObfuscatedName("is.cg")
	public int field2420 = -1;

	@ObfuscatedName("is.ci")
	public int field2430 = -1;

	@ObfuscatedName("is.cp")
	public int field2396 = -1;

	@ObfuscatedName("is.cm")
	public int field2423 = -1;

	@ObfuscatedName("is.cc")
	public int field2392 = -2;

	@ObfuscatedName("is.cj")
	public int field2405 = -1;

	@ObfuscatedName("is.ce")
	public int field2426 = -1;

	@ObfuscatedName("is.cr")
	public int field2422 = 0;

	@ObfuscatedName("is.cb")
	public int field2428 = -1;

	@ObfuscatedName("is.cu")
	public int field2435 = -1;

	@ObfuscatedName("is.cq")
	public int field2373 = 0;

	@ObfuscatedName("is.cn")
	public int field2400 = -1;

	@ObfuscatedName("is.cl")
	public int field2432 = -1;

	@ObfuscatedName("is.cx")
	public int field2433 = -1;

	@ObfuscatedName("is.cv")
	public int field2434 = -1;

	@ObfuscatedName("is.ca")
	public int field2413 = -1;

	@ObfuscatedName("is.cy")
	public int field2436 = -1;

	@ObfuscatedName("hj.af(Lpx;Lpx;ZLrv;I)V")
	public static void method3880(class413 arg0, class413 arg1, boolean arg2, class462 arg3) {
		Statics.field1721 = arg0;
		Statics.field1915 = arg1;
		Statics.field3466 = arg2;
		Statics.field2437 = Statics.field1721.method7702(10);
		Statics.field2395 = arg3;
	}

	@ObfuscatedName("dp.aw(II)Lis;")
	public static class214 method2737(int arg0) {
		class214 var1 = (class214) field2380.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field1721.method7692(10, arg0);
		class214 var3 = new class214();
		var3.field2384 = arg0;
		if (var2 != null) {
			var3.method4354(new class591(var2));
		}
		var3.method4353();
		if (var3.field2410 != -1) {
			var3.method4356(method2737(var3.field2410), method2737(var3.field2409));
		}
		if (var3.field2430 != -1) {
			var3.method4357(method2737(var3.field2430), method2737(var3.field2420));
		}
		if (var3.field2423 != -1) {
			var3.method4360(method2737(var3.field2423), method2737(var3.field2396));
		}
		if (!Statics.field3466 && var3.field2403) {
			if (var3.field2410 == -1 && var3.field2430 == -1 && var3.field2423 == -1) {
				var3.field2429 = var3.field2429 + class394.field4477;
			}
			var3.field2387 = class394.field4478;
			var3.field2419 = false;
			for (int var4 = 0; var4 < var3.field2404.length; var4++) {
				var3.field2404[var4] = null;
			}
			for (int var5 = 0; var5 < var3.field2397.length; var5++) {
				if (var5 != 4) {
					if (var3.field2421 != null) {
						var3.field2421[var5] = null;
					}
					var3.field2397[var5] = null;
				}
			}
			var3.field2392 = -2;
			var3.field2416 = 0;
			if (var3.field2418 != null) {
				boolean var6 = false;
				for (class545 var7 = var3.field2418.method7951(); var7 != null; var7 = var3.field2418.method7942()) {
					class209 var8 = class209.method2995((int) var7.field5601);
					if (var8.field2275) {
						var7.method2234();
					} else {
						var6 = true;
					}
				}
				if (!var6) {
					var3.field2418 = null;
				}
			}
		}
		field2380.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("hi.at(IIIIIZIII)Lxt;")
	public static final class606 method3976(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
		if (arg6 != 36 || arg7 != 32) {
			arg4 = 0;
		} else if (arg1 == -1) {
			arg4 = 0;
		} else if (arg4 == 2 && arg1 != 1) {
			arg4 = 1;
		}
		long var8 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
		if (!arg5 && arg6 == 36 && arg7 == 32) {
			class606 var10 = (class606) field2382.method6463(var8);
			if (var10 != null) {
				return var10;
			}
		}
		class214 var11 = method2737(arg0);
		if (arg1 > 1 && var11.field2407 != null) {
			int var12 = -1;
			for (int var13 = 0; var13 < 10; var13++) {
				if (arg1 >= var11.field2408[var13] && var11.field2408[var13] != 0) {
					var12 = var11.field2407[var13];
				}
			}
			if (var12 != -1) {
				var11 = method2737(var12);
			}
		}
		class242 var14 = var11.method4418(1);
		if (var14 == null) {
			return null;
		}
		class606 var15 = null;
		if (var11.field2410 != -1) {
			var15 = method3976(var11.field2409, 10, 1, 0, 0, true, arg6, arg7);
			if (var15 == null) {
				return null;
			}
		} else if (var11.field2430 != -1) {
			var15 = method3976(var11.field2420, arg1, arg2, arg3, 0, false, arg6, arg7);
			if (var15 == null) {
				return null;
			}
		} else if (var11.field2423 != -1) {
			var15 = method3976(var11.field2396, arg1, 0, 0, 0, false, arg6, arg7);
			if (var15 == null) {
				return null;
			}
		}
		int[] var16 = Statics.field5989;
		int var17 = Statics.field5990;
		int var18 = Statics.field5991;
		float[] var19 = Statics.field5988;
		int[] var20 = new int[4];
		class602.method10676(var20);
		class606 var21 = new class606(arg6, arg7);
		class226.method4640(var21.field6019, arg6, arg7, null);
		class602.method10678();
		class226.method4633();
		int var22 = arg7 >> 1;
		class226.method4680(var22, var22);
		class226.field2633.field3000 = false;
		if (var11.field2423 != -1) {
			var15.method10818(0, 0);
		}
		int var23 = var11.field2431;
		if (arg6 != 36) {
			var23 = var23 * 32 / arg6;
		}
		if (arg5) {
			var23 = (int) ((double) var23 * 1.5D);
		} else if (arg2 == 2) {
			var23 = (int) ((double) var23 * 1.04D);
		}
		int var24 = class226.field2638[var11.field2425] * var23 >> 16;
		int var25 = class226.field2637[var11.field2425] * var23 >> 16;
		var14.method5128();
		var14.method5228(0, var11.field2394, var11.field2393, var11.field2425, var11.field2379, var11.field2399 + var14.field2802 / 2 + var24, var11.field2399 + var25);
		if (var11.field2430 != -1) {
			var15.method10818(0, 0);
		}
		if (arg2 >= 1) {
			var21.method10827(1);
		}
		if (arg2 >= 2) {
			var21.method10827(16777215);
		}
		if (arg3 != 0) {
			var21.method10893(arg3);
		}
		class226.method4640(var21.field6019, arg6, arg7, null);
		if (var11.field2410 != -1) {
			var15.method10818(0, 0);
		}
		if (arg4 == 1 || arg4 == 2 && var11.field2398 == 1) {
			class462 var26 = Statics.field2395;
			String var27;
			if (arg1 < 100000) {
				var27 = "<col=ffff00>" + arg1 + "</col>";
			} else if (arg1 < 10000000) {
				var27 = "<col=ffffff>" + arg1 / 1000 + class394.field4660 + "</col>";
			} else {
				var27 = "<col=00ff80>" + arg1 / 1000000 + class394.field4679 + "</col>";
			}
			var26.method8763(var27, 0, 9, 16776960, 1);
		}
		if (!arg5 && arg6 == 36 && arg7 == 32) {
			field2382.method6454(var21, var8);
		}
		class226.method4640(var16, var17, var18, var19);
		class602.method10742(var20);
		class226.method4633();
		class226.field2633.field3000 = true;
		return var21;
	}

	@ObfuscatedName("gh.ac(I)V")
	public static void method3778() {
		field2380.method6456();
		field2381.method6456();
		field2382.method6456();
	}

	@ObfuscatedName("is.ap(I)V")
	public void method4353() {
		if (this.field2398 == 1) {
			this.field2417 = 0;
		}
	}

	@ObfuscatedName("is.aq(Lwb;I)V")
	public void method4354(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4401(arg0, var2);
		}
	}

	@ObfuscatedName("is.ao(Lwb;II)V")
	public void method4401(class591 arg0, int arg1) {
		if (arg1 == 1) {
			this.field2385 = arg0.method10341();
		} else if (arg1 == 2) {
			this.field2429 = arg0.method10350();
		} else if (arg1 == 3) {
			this.field2387 = arg0.method10350();
		} else if (arg1 == 4) {
			this.field2431 = arg0.method10341();
		} else if (arg1 == 5) {
			this.field2425 = arg0.method10341();
		} else if (arg1 == 6) {
			this.field2394 = arg0.method10341();
		} else if (arg1 == 7) {
			this.field2379 = arg0.method10341();
			if (this.field2379 > 32767) {
				this.field2379 -= 65536;
			}
		} else if (arg1 == 8) {
			this.field2399 = arg0.method10341();
			if (this.field2399 > 32767) {
				this.field2399 -= 65536;
			}
		} else if (arg1 == 9) {
			arg0.method10350();
		} else if (arg1 == 11) {
			this.field2398 = 1;
		} else if (arg1 == 12) {
			this.field2411 = arg0.method10345();
		} else if (arg1 == 13) {
			this.field2438 = arg0.method10339();
		} else if (arg1 == 14) {
			this.field2401 = arg0.method10339();
		} else if (arg1 == 16) {
			this.field2403 = true;
		} else if (arg1 == 23) {
			this.field2405 = arg0.method10341();
			this.field2422 = arg0.method10339();
		} else if (arg1 == 24) {
			this.field2426 = arg0.method10341();
		} else if (arg1 == 25) {
			this.field2428 = arg0.method10341();
			this.field2373 = arg0.method10339();
		} else if (arg1 == 26) {
			this.field2435 = arg0.method10341();
		} else if (arg1 == 27) {
			this.field2402 = arg0.method10339();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.field2404[arg1 - 30] = arg0.method10350();
			if (this.field2404[arg1 - 30].equalsIgnoreCase(class394.field4757)) {
				this.field2404[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.field2397[arg1 - 35] = arg0.method10350();
		} else if (arg1 == 40) {
			int var3 = arg0.method10339();
			this.field2388 = new short[var3];
			this.field2389 = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2388[var4] = (short) arg0.method10341();
				this.field2389[var4] = (short) arg0.method10341();
			}
		} else if (arg1 == 41) {
			int var5 = arg0.method10339();
			this.field2390 = new short[var5];
			this.field2374 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field2390[var6] = (short) arg0.method10341();
				this.field2374[var6] = (short) arg0.method10341();
			}
		} else if (arg1 == 42) {
			this.field2392 = arg0.method10340();
		} else if (arg1 == 43) {
			int var7 = arg0.method10339();
			if (this.field2421 == null) {
				this.field2421 = new String[5][];
			}
			boolean var8 = var7 >= 0 && var7 < 5;
			if (var8 && this.field2421[var7] == null) {
				this.field2421[var7] = new String[20];
			}
			while (true) {
				int var9 = arg0.method10339() - 1;
				if (var9 == -1) {
					break;
				}
				String var10 = arg0.method10350();
				if (var8 && var9 >= 0 && var9 < 20) {
					this.field2421[var7][var9] = var10;
				}
			}
		} else if (arg1 == 65) {
			this.field2419 = true;
		} else if (arg1 == 75) {
			this.field2417 = arg0.method10593();
		} else if (arg1 == 78) {
			this.field2400 = arg0.method10341();
		} else if (arg1 == 79) {
			this.field2432 = arg0.method10341();
		} else if (arg1 == 90) {
			this.field2433 = arg0.method10341();
		} else if (arg1 == 91) {
			this.field2413 = arg0.method10341();
		} else if (arg1 == 92) {
			this.field2434 = arg0.method10341();
		} else if (arg1 == 93) {
			this.field2436 = arg0.method10341();
		} else if (arg1 == 94) {
			arg0.method10341();
		} else if (arg1 == 95) {
			this.field2393 = arg0.method10341();
		} else if (arg1 == 97) {
			this.field2409 = arg0.method10341();
		} else if (arg1 == 98) {
			this.field2410 = arg0.method10341();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.field2407 == null) {
				this.field2407 = new int[10];
				this.field2408 = new int[10];
			}
			this.field2407[arg1 - 100] = arg0.method10341();
			this.field2408[arg1 - 100] = arg0.method10341();
		} else if (arg1 == 110) {
			this.field2391 = arg0.method10341();
		} else if (arg1 == 111) {
			this.field2412 = arg0.method10341();
		} else if (arg1 == 112) {
			this.field2406 = arg0.method10341();
		} else if (arg1 == 113) {
			this.field2414 = arg0.method10340();
		} else if (arg1 == 114) {
			this.field2383 = arg0.method10340() * 5;
		} else if (arg1 == 115) {
			this.field2416 = arg0.method10339();
		} else if (arg1 == 139) {
			this.field2420 = arg0.method10341();
		} else if (arg1 == 140) {
			this.field2430 = arg0.method10341();
		} else if (arg1 == 148) {
			this.field2396 = arg0.method10341();
		} else if (arg1 == 149) {
			this.field2423 = arg0.method10341();
		} else if (arg1 == 249) {
			this.field2418 = class189.method3595(arg0, this.field2418);
		}
	}

	@ObfuscatedName("is.as(Lis;Lis;B)V")
	public void method4356(class214 arg0, class214 arg1) {
		this.field2385 = arg0.field2385;
		this.field2431 = arg0.field2431;
		this.field2425 = arg0.field2425;
		this.field2394 = arg0.field2394;
		this.field2393 = arg0.field2393;
		this.field2379 = arg0.field2379;
		this.field2399 = arg0.field2399;
		this.field2388 = arg0.field2388;
		this.field2389 = arg0.field2389;
		this.field2390 = arg0.field2390;
		this.field2374 = arg0.field2374;
		this.field2429 = arg1.field2429;
		this.field2387 = class394.field4518;
		this.field2403 = arg1.field2403;
		this.field2411 = arg1.field2411;
		this.field2398 = 1;
	}

	@ObfuscatedName("is.al(Lis;Lis;I)V")
	public void method4357(class214 arg0, class214 arg1) {
		this.field2385 = arg0.field2385;
		this.field2431 = arg0.field2431;
		this.field2425 = arg0.field2425;
		this.field2394 = arg0.field2394;
		this.field2393 = arg0.field2393;
		this.field2379 = arg0.field2379;
		this.field2399 = arg0.field2399;
		this.field2388 = arg1.field2388;
		this.field2389 = arg1.field2389;
		this.field2390 = arg1.field2390;
		this.field2374 = arg1.field2374;
		this.field2429 = arg1.field2429;
		this.field2387 = arg1.field2387;
		this.field2403 = arg1.field2403;
		this.field2398 = arg1.field2398;
		this.field2438 = arg1.field2438;
		this.field2401 = arg1.field2401;
		this.field2402 = arg1.field2402;
		this.field2405 = arg1.field2405;
		this.field2426 = arg1.field2426;
		this.field2400 = arg1.field2400;
		this.field2428 = arg1.field2428;
		this.field2435 = arg1.field2435;
		this.field2432 = arg1.field2432;
		this.field2433 = arg1.field2433;
		this.field2434 = arg1.field2434;
		this.field2413 = arg1.field2413;
		this.field2436 = arg1.field2436;
		this.field2416 = arg1.field2416;
		this.field2404 = arg1.field2404;
		this.field2417 = arg1.field2417;
		this.field2397 = new String[5];
		if (arg1.field2397 != null) {
			for (int var3 = 0; var3 < 4; var3++) {
				this.field2397[var3] = arg1.field2397[var3];
			}
		}
		this.field2397[4] = class394.field4606;
		if (arg1.field2421 == null) {
			this.field2421 = null;
		} else {
			this.field2421 = new String[5][];
			System.arraycopy(arg1.field2421, 0, this.field2421, 0, 4);
		}
		this.field2411 = 0;
	}

	@ObfuscatedName("is.au(Lis;Lis;I)V")
	public void method4360(class214 arg0, class214 arg1) {
		this.field2385 = arg0.field2385;
		this.field2431 = arg0.field2431;
		this.field2425 = arg0.field2425;
		this.field2394 = arg0.field2394;
		this.field2393 = arg0.field2393;
		this.field2379 = arg0.field2379;
		this.field2399 = arg0.field2399;
		this.field2388 = arg0.field2388;
		this.field2389 = arg0.field2389;
		this.field2390 = arg0.field2390;
		this.field2374 = arg0.field2374;
		this.field2398 = arg0.field2398;
		this.field2429 = arg1.field2429;
		this.field2387 = arg1.field2387;
		this.field2411 = 0;
		this.field2403 = false;
		this.field2419 = false;
	}

	@ObfuscatedName("is.ai(IB)Liu;")
	public final class220 method4359(int arg0) {
		if (this.field2407 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field2408[var3] && this.field2408[var3] != 0) {
					var2 = this.field2407[var3];
				}
			}
			if (var2 != -1) {
				return method2737(var2).method4359(1);
			}
		}
		class220 var4 = class220.method4529(Statics.field1915, this.field2385, 0);
		if (var4 == null) {
			return null;
		}
		if (this.field2391 != 128 || this.field2412 != 128 || this.field2406 != 128) {
			var4.method4547(this.field2391, this.field2412, this.field2406);
		}
		this.method4411(var4, null);
		return var4;
	}

	@ObfuscatedName("is.aa(IB)Ljn;")
	public final class242 method4418(int arg0) {
		if (this.field2407 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field2408[var3] && this.field2408[var3] != 0) {
					var2 = this.field2407[var3];
				}
			}
			if (var2 != -1) {
				return method2737(var2).method4418(1);
			}
		}
		class242 var4 = (class242) field2381.method6463((long) this.field2384);
		if (var4 != null) {
			return var4;
		}
		class220 var5 = class220.method4529(Statics.field1915, this.field2385, 0);
		if (var5 == null) {
			return null;
		}
		if (this.field2391 != 128 || this.field2412 != 128 || this.field2406 != 128) {
			var5.method4547(this.field2391, this.field2412, this.field2406);
		}
		this.method4411(var5, null);
		class242 var6 = var5.method4553(this.field2414 + 64, this.field2383 + 768, -50, -10, -50);
		var6.field2942 = true;
		field2381.method6454(var6, (long) this.field2384);
		return var6;
	}

	@ObfuscatedName("is.am(Lgq;I)Ljn;")
	public final class242 method4361(class177 arg0) {
		class242 var2 = arg0.field1956;
		if (var2 != null) {
			return var2;
		}
		class220 var3 = class220.method4529(Statics.field1915, arg0.field1954, 0);
		if (var3 == null) {
			return null;
		}
		if (this.field2391 != 128 || this.field2412 != 128 || this.field2406 != 128) {
			var3.method4547(this.field2391, this.field2412, this.field2406);
		}
		this.method4411(var3, arg0);
		class242 var4 = var3.method4553(this.field2414 + 64, this.field2383 + 768, -50, -10, -50);
		var4.field2942 = true;
		arg0.field1956 = var4;
		return var4;
	}

	@ObfuscatedName("is.an(II)Lis;")
	public class214 method4362(int arg0) {
		if (this.field2407 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.field2408[var3] && this.field2408[var3] != 0) {
					var2 = this.field2407[var3];
				}
			}
			if (var2 != -1) {
				return method2737(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("is.ar(ILgq;I)Z")
	public final boolean method4363(int arg0, class177 arg1) {
		int var3 = this.field2405;
		int var4 = this.field2426;
		int var5 = this.field2400;
		if (arg0 == 1) {
			var3 = this.field2428;
			var4 = this.field2435;
			var5 = this.field2432;
		}
		if (arg1 != null && arg1.method3826(arg0)) {
			var3 = arg1.method3844(arg0);
		}
		if (var3 == -1) {
			return true;
		}
		boolean var6 = true;
		if (!Statics.field1915.method7694(var3, 0)) {
			var6 = false;
		}
		if (var4 != -1 && !Statics.field1915.method7694(var4, 0)) {
			var6 = false;
		}
		if (var5 != -1 && !Statics.field1915.method7694(var5, 0)) {
			var6 = false;
		}
		return var6;
	}

	@ObfuscatedName("is.ae(ILgq;I)Liu;")
	public final class220 method4364(int arg0, class177 arg1) {
		int var3 = this.field2405;
		int var4 = this.field2426;
		int var5 = this.field2400;
		if (arg0 == 1) {
			var3 = this.field2428;
			var4 = this.field2435;
			var5 = this.field2432;
		}
		if (arg1 != null && arg1.method3826(arg0)) {
			var3 = arg1.method3844(arg0);
		}
		if (var3 == -1) {
			return null;
		}
		class220 var6 = class220.method4529(Statics.field1915, var3, 0);
		if (var4 != -1) {
			class220 var7 = class220.method4529(Statics.field1915, var4, 0);
			if (var5 == -1) {
				class220[] var10 = new class220[] { var6, var7 };
				var6 = new class220(var10, 2);
			} else {
				class220 var8 = class220.method4529(Statics.field1915, var5, 0);
				class220[] var9 = new class220[] { var6, var7, var8 };
				var6 = new class220(var9, 3);
			}
		}
		if (arg0 == 0 && this.field2422 != 0) {
			var6.method4545(0, this.field2422, 0);
		}
		if (arg0 == 1 && this.field2373 != 0) {
			var6.method4545(0, this.field2373, 0);
		}
		this.method4411(var6, arg1);
		return var6;
	}

	@ObfuscatedName("is.ay(ILgq;I)Z")
	public final boolean method4365(int arg0, class177 arg1) {
		int var3 = this.field2433;
		int var4 = this.field2434;
		if (arg0 == 1) {
			var3 = this.field2413;
			var4 = this.field2436;
		}
		if (arg1 != null && arg1.method3842(arg0)) {
			var3 = arg1.method3845(arg0);
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!Statics.field1915.method7694(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !Statics.field1915.method7694(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("is.ad(ILgq;I)Liu;")
	public final class220 method4428(int arg0, class177 arg1) {
		int var3 = this.field2433;
		int var4 = this.field2434;
		if (arg0 == 1) {
			var3 = this.field2413;
			var4 = this.field2436;
		}
		if (arg1 != null && arg1.method3842(arg0)) {
			var3 = arg1.method3845(arg0);
		}
		if (var3 == -1) {
			return null;
		}
		class220 var5 = class220.method4529(Statics.field1915, var3, 0);
		if (var4 != -1) {
			class220 var6 = class220.method4529(Statics.field1915, var4, 0);
			class220[] var7 = new class220[] { var5, var6 };
			var5 = new class220(var7, 2);
		}
		this.method4411(var5, arg1);
		return var5;
	}

	@ObfuscatedName("is.ag(Liu;Lgq;B)V")
	public void method4411(class220 arg0, class177 arg1) {
		if (this.field2388 != null) {
			short[] var3 = this.field2388;
			short[] var4 = this.field2389;
			if (arg1 != null && arg1.field1948 != null && this.field2389.length == arg1.field1948.length) {
				var4 = arg1.field1948;
			}
			for (int var5 = 0; var5 < this.field2388.length; var5++) {
				arg0.method4543(var3[var5], var4[var5]);
			}
		}
		if (this.field2390 == null) {
			return;
		}
		short[] var6 = this.field2390;
		short[] var7 = this.field2374;
		if (arg1 != null && arg1.field1950 != null && this.field2374.length == arg1.field1950.length) {
			var7 = arg1.field1950;
		}
		for (int var8 = 0; var8 < this.field2390.length; var8++) {
			arg0.method4548(var6[var8], var7[var8]);
		}
	}

	@ObfuscatedName("is.av(IIB)I")
	public int method4394(int arg0, int arg1) {
		return class189.method9753(this.field2418, arg0, arg1);
	}

	@ObfuscatedName("is.ah(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4369(int arg0, String arg1) {
		return class189.method7632(this.field2418, arg0, arg1);
	}

	@ObfuscatedName("is.ab(I)I")
	public int method4370() {
		if (this.field2392 == -1 || this.field2397 == null) {
			return -1;
		} else if (this.field2392 >= 0) {
			return this.field2397[this.field2392] == null ? -1 : this.field2392;
		} else if (class394.field4481.equalsIgnoreCase(this.field2397[4])) {
			return 4;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("is.ax(B)Z")
	public boolean method4371() {
		return this.field2389 != null;
	}

	@ObfuscatedName("is.ak(I)Z")
	public boolean method4372() {
		return this.field2374 != null;
	}
}
