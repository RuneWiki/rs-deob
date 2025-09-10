package deob;

@ObfuscatedName("iu")
public class class220 extends class234 {

	@ObfuscatedName("iu.ac")
	public static int[] field2527 = new int[10000];

	@ObfuscatedName("iu.ap")
	public static int[] field2537 = new int[10000];

	@ObfuscatedName("iu.aq")
	public static int field2529 = 0;

	@ObfuscatedName("iu.ao")
	public static int[] field2530 = class226.field2638;

	@ObfuscatedName("iu.as")
	public static int[] field2531 = class226.field2637;

	@ObfuscatedName("iu.al")
	public int field2532 = 0;

	@ObfuscatedName("iu.au")
	public int[] field2533;

	@ObfuscatedName("iu.ai")
	public int[] field2561;

	@ObfuscatedName("iu.aa")
	public int[] field2535;

	@ObfuscatedName("iu.am")
	public int field2536 = 0;

	@ObfuscatedName("iu.an")
	public int[] field2524;

	@ObfuscatedName("iu.ar")
	public int[] field2525;

	@ObfuscatedName("iu.ae")
	public int[] field2564;

	@ObfuscatedName("iu.ay")
	public byte[] field2560;

	@ObfuscatedName("iu.ad")
	public byte[] field2541;

	@ObfuscatedName("iu.ag")
	public byte[] field2542;

	@ObfuscatedName("iu.av")
	public byte[] field2550;

	@ObfuscatedName("iu.ah")
	public short[] field2544;

	@ObfuscatedName("iu.ab")
	public short[] field2545;

	@ObfuscatedName("iu.ax")
	public byte[] field2546;

	@ObfuscatedName("iu.ak")
	public byte field2551 = 0;

	@ObfuscatedName("iu.aj")
	public int field2548;

	@ObfuscatedName("iu.az")
	public byte[] field2549;

	@ObfuscatedName("iu.bt")
	public short[] field2557;

	@ObfuscatedName("iu.bs")
	public short[] field2566;

	@ObfuscatedName("iu.bu")
	public short[] field2552;

	@ObfuscatedName("iu.bi")
	public class235[] field2553;

	@ObfuscatedName("iu.bd")
	public class244[] field2554;

	@ObfuscatedName("iu.ba")
	public short field2555;

	@ObfuscatedName("iu.bb")
	public short field2556;

	@ObfuscatedName("iu.bo")
	public int[][] field2543;

	@ObfuscatedName("iu.bl")
	public int[][] field2558;

	@ObfuscatedName("iu.by")
	public int[] field2559;

	@ObfuscatedName("iu.bg")
	public int[] field2534;

	@ObfuscatedName("iu.bx")
	public int[][] field2565;

	@ObfuscatedName("iu.bq")
	public int[][] field2562;

	@ObfuscatedName("iu.bz")
	public class244[] field2563;

	@ObfuscatedName("iu.bn")
	public boolean field2547 = false;

	@ObfuscatedName("iu.be")
	public int field2538;

	@ObfuscatedName("iu.bh")
	public int field2540;

	@ObfuscatedName("iu.bk")
	public int field2567;

	@ObfuscatedName("iu.bp")
	public int field2568;

	@ObfuscatedName("iu.br")
	public int field2569;

	public class220() {
	}

	public class220(byte[] arg0) {
		if (arg0[arg0.length - 1] == -3 && arg0[arg0.length - 2] == -1) {
			this.method4538(arg0);
		} else if (arg0[arg0.length - 1] == -2 && arg0[arg0.length - 2] == -1) {
			this.method4533(arg0);
		} else if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4535(arg0);
		} else {
			this.method4558(arg0);
		}
	}

	public class220(int arg0, int arg1, int arg2) {
		this.field2533 = new int[arg0];
		this.field2561 = new int[arg0];
		this.field2535 = new int[arg0];
		this.field2559 = new int[arg0];
		this.field2524 = new int[arg1];
		this.field2525 = new int[arg1];
		this.field2564 = new int[arg1];
		this.field2560 = new byte[arg1];
		this.field2541 = new byte[arg1];
		this.field2542 = new byte[arg1];
		this.field2544 = new short[arg1];
		this.field2545 = new short[arg1];
		this.field2550 = new byte[arg1];
		this.field2534 = new int[arg1];
		if (arg2 > 0) {
			this.field2549 = new byte[arg2];
			this.field2557 = new short[arg2];
			this.field2566 = new short[arg2];
			this.field2552 = new short[arg2];
		}
	}

	public class220(class220[] arg0, int arg1) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		this.field2532 = 0;
		this.field2536 = 0;
		this.field2548 = 0;
		this.field2551 = -1;
		for (int var11 = 0; var11 < arg1; var11++) {
			class220 var12 = arg0[var11];
			if (var12 != null) {
				this.field2532 += var12.field2532;
				this.field2536 += var12.field2536;
				this.field2548 += var12.field2548;
				if (var12.field2541 == null) {
					if (this.field2551 == -1) {
						this.field2551 = var12.field2551;
					}
					if (this.field2551 != var12.field2551) {
						var4 = true;
					}
				} else {
					var4 = true;
				}
				var3 |= var12.field2560 != null;
				var5 |= var12.field2542 != null;
				var6 |= var12.field2534 != null;
				var7 |= var12.field2545 != null;
				var8 |= var12.field2550 != null;
				var9 |= var12.field2543 != null;
				var10 |= var12.field2546 != null;
			}
		}
		this.field2533 = new int[this.field2532];
		this.field2561 = new int[this.field2532];
		this.field2535 = new int[this.field2532];
		this.field2559 = new int[this.field2532];
		this.field2524 = new int[this.field2536];
		this.field2525 = new int[this.field2536];
		this.field2564 = new int[this.field2536];
		if (var3) {
			this.field2560 = new byte[this.field2536];
		}
		if (var4) {
			this.field2541 = new byte[this.field2536];
		}
		if (var5) {
			this.field2542 = new byte[this.field2536];
		}
		if (var6) {
			this.field2534 = new int[this.field2536];
		}
		if (var7) {
			this.field2545 = new short[this.field2536];
		}
		if (var8) {
			this.field2550 = new byte[this.field2536];
		}
		if (var9) {
			this.field2543 = new int[this.field2532][];
			this.field2558 = new int[this.field2532][];
		}
		if (var10) {
			this.field2546 = new byte[this.field2536];
		}
		this.field2544 = new short[this.field2536];
		if (this.field2548 > 0) {
			this.field2549 = new byte[this.field2548];
			this.field2557 = new short[this.field2548];
			this.field2566 = new short[this.field2548];
			this.field2552 = new short[this.field2548];
		}
		this.field2532 = 0;
		this.field2536 = 0;
		this.field2548 = 0;
		for (int var13 = 0; var13 < arg1; var13++) {
			class220 var14 = arg0[var13];
			if (var14 != null) {
				for (int var15 = 0; var15 < var14.field2536; var15++) {
					if (var3 && var14.field2560 != null) {
						this.field2560[this.field2536] = var14.field2560[var15];
					}
					if (var4) {
						if (var14.field2541 == null) {
							this.field2541[this.field2536] = var14.field2551;
						} else {
							this.field2541[this.field2536] = var14.field2541[var15];
						}
					}
					if (var5 && var14.field2542 != null) {
						this.field2542[this.field2536] = var14.field2542[var15];
					}
					if (var6 && var14.field2534 != null) {
						this.field2534[this.field2536] = var14.field2534[var15];
					}
					if (var7) {
						if (var14.field2545 == null) {
							this.field2545[this.field2536] = -1;
						} else {
							this.field2545[this.field2536] = var14.field2545[var15];
						}
					}
					if (var8) {
						if (var14.field2550 == null || var14.field2550[var15] == -1) {
							this.field2550[this.field2536] = -1;
						} else {
							this.field2550[this.field2536] = (byte) (var14.field2550[var15] + this.field2548);
						}
					}
					if (var10 && var14.field2546 != null) {
						this.field2546[this.field2536] = var14.field2546[var15];
					}
					this.field2544[this.field2536] = var14.field2544[var15];
					this.field2524[this.field2536] = this.method4602(var14, var14.field2524[var15]);
					this.field2525[this.field2536] = this.method4602(var14, var14.field2525[var15]);
					this.field2564[this.field2536] = this.method4602(var14, var14.field2564[var15]);
					this.field2536++;
				}
				for (int var16 = 0; var16 < var14.field2548; var16++) {
					byte var17 = this.field2549[this.field2548] = var14.field2549[var16];
					if (var17 == 0) {
						this.field2557[this.field2548] = (short) this.method4602(var14, var14.field2557[var16]);
						this.field2566[this.field2548] = (short) this.method4602(var14, var14.field2566[var16]);
						this.field2552[this.field2548] = (short) this.method4602(var14, var14.field2552[var16]);
					}
					this.field2548++;
				}
			}
		}
	}

	public class220(class220 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
		this.field2532 = arg0.field2532;
		this.field2536 = arg0.field2536;
		this.field2548 = arg0.field2548;
		if (arg1) {
			this.field2533 = arg0.field2533;
			this.field2561 = arg0.field2561;
			this.field2535 = arg0.field2535;
		} else {
			this.field2533 = new int[this.field2532];
			this.field2561 = new int[this.field2532];
			this.field2535 = new int[this.field2532];
			for (int var6 = 0; var6 < this.field2532; var6++) {
				this.field2533[var6] = arg0.field2533[var6];
				this.field2561[var6] = arg0.field2561[var6];
				this.field2535[var6] = arg0.field2535[var6];
			}
		}
		if (arg2) {
			this.field2544 = arg0.field2544;
		} else {
			this.field2544 = new short[this.field2536];
			for (int var7 = 0; var7 < this.field2536; var7++) {
				this.field2544[var7] = arg0.field2544[var7];
			}
		}
		if (arg3 || arg0.field2545 == null) {
			this.field2545 = arg0.field2545;
		} else {
			this.field2545 = new short[this.field2536];
			for (int var8 = 0; var8 < this.field2536; var8++) {
				this.field2545[var8] = arg0.field2545[var8];
			}
		}
		if (arg4) {
			this.field2542 = arg0.field2542;
		} else {
			this.field2542 = new byte[this.field2536];
			if (arg0.field2542 == null) {
				for (int var9 = 0; var9 < this.field2536; var9++) {
					this.field2542[var9] = 0;
				}
			} else {
				for (int var10 = 0; var10 < this.field2536; var10++) {
					this.field2542[var10] = arg0.field2542[var10];
				}
			}
		}
		this.field2524 = arg0.field2524;
		this.field2525 = arg0.field2525;
		this.field2564 = arg0.field2564;
		this.field2560 = arg0.field2560;
		this.field2541 = arg0.field2541;
		this.field2550 = arg0.field2550;
		this.field2551 = arg0.field2551;
		this.field2549 = arg0.field2549;
		this.field2557 = arg0.field2557;
		this.field2566 = arg0.field2566;
		this.field2552 = arg0.field2552;
		this.field2559 = arg0.field2559;
		this.field2534 = arg0.field2534;
		this.field2565 = arg0.field2565;
		this.field2562 = arg0.field2562;
		this.field2554 = arg0.field2554;
		this.field2553 = arg0.field2553;
		this.field2563 = arg0.field2563;
		this.field2543 = arg0.field2543;
		this.field2558 = arg0.field2558;
		this.field2555 = arg0.field2555;
		this.field2556 = arg0.field2556;
		this.field2546 = arg0.field2546;
	}

	@ObfuscatedName("iu.af(Lpx;II)Liu;")
	public static class220 method4529(class413 arg0, int arg1, int arg2) {
		byte[] var3 = arg0.method7692(arg1, arg2);
		return var3 == null ? null : new class220(var3);
	}

	@ObfuscatedName("iu.aw(Liu;Liu;IIIZ)V")
	public static void method4530(class220 arg0, class220 arg1, int arg2, int arg3, int arg4, boolean arg5) {
		arg0.method4554();
		arg0.method4550();
		arg1.method4554();
		arg1.method4550();
		field2529++;
		int var6 = 0;
		int[] var7 = arg1.field2533;
		int var8 = arg1.field2532;
		for (int var9 = 0; var9 < arg0.field2532; var9++) {
			class244 var10 = arg0.field2554[var9];
			if (var10.field2975 != 0) {
				int var11 = arg0.field2561[var9] - arg3;
				if (var11 <= arg1.field2538) {
					int var12 = arg0.field2533[var9] - arg2;
					if (var12 >= arg1.field2540 && var12 <= arg1.field2567) {
						int var13 = arg0.field2535[var9] - arg4;
						if (var13 >= arg1.field2569 && var13 <= arg1.field2568) {
							for (int var14 = 0; var14 < var8; var14++) {
								class244 var15 = arg1.field2554[var14];
								if (var7[var14] == var12 && arg1.field2535[var14] == var13 && arg1.field2561[var14] == var11 && var15.field2975 != 0) {
									if (arg0.field2563 == null) {
										arg0.field2563 = new class244[arg0.field2532];
									}
									if (arg1.field2563 == null) {
										arg1.field2563 = new class244[var8];
									}
									class244 var16 = arg0.field2563[var9];
									if (var16 == null) {
										var16 = arg0.field2563[var9] = new class244(var10);
									}
									class244 var17 = arg1.field2563[var14];
									if (var17 == null) {
										var17 = arg1.field2563[var14] = new class244(var15);
									}
									var16.field2976 += var15.field2976;
									var16.field2974 += var15.field2974;
									var16.field2973 += var15.field2973;
									var16.field2975 += var15.field2975;
									var17.field2976 += var10.field2976;
									var17.field2974 += var10.field2974;
									var17.field2973 += var10.field2973;
									var17.field2975 += var10.field2975;
									var6++;
									field2527[var9] = field2529;
									field2537[var14] = field2529;
								}
							}
						}
					}
				}
			}
		}
		if (var6 < 3 || !arg5) {
			return;
		}
		for (int var18 = 0; var18 < arg0.field2536; var18++) {
			if (field2527[arg0.field2524[var18]] == field2529 && field2527[arg0.field2525[var18]] == field2529 && field2527[arg0.field2564[var18]] == field2529) {
				if (arg0.field2560 == null) {
					arg0.field2560 = new byte[arg0.field2536];
				}
				arg0.field2560[var18] = 2;
			}
		}
		for (int var19 = 0; var19 < arg1.field2536; var19++) {
			if (field2537[arg1.field2524[var19]] == field2529 && field2537[arg1.field2525[var19]] == field2529 && field2537[arg1.field2564[var19]] == field2529) {
				if (arg1.field2560 == null) {
					arg1.field2560 = new byte[arg1.field2536];
				}
				arg1.field2560[var19] = 2;
			}
		}
	}

	@ObfuscatedName("iu.ac(II)I")
	public static final int method4531(int arg0, int arg1) {
		int var2 = (arg0 & 0x7F) * arg1 >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("iu.ap(I)I")
	public static final int method4586(int arg0) {
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0;
	}

	@ObfuscatedName("iu.aq([B)V")
	public void method4538(byte[] arg0) {
		class591 var2 = new class591(arg0);
		class591 var3 = new class591(arg0);
		class591 var4 = new class591(arg0);
		class591 var5 = new class591(arg0);
		class591 var6 = new class591(arg0);
		class591 var7 = new class591(arg0);
		class591 var8 = new class591(arg0);
		var2.field5920 = arg0.length - 26;
		int var9 = var2.method10341();
		int var10 = var2.method10341();
		int var11 = var2.method10339();
		int var12 = var2.method10339();
		int var13 = var2.method10339();
		int var14 = var2.method10339();
		int var15 = var2.method10339();
		int var16 = var2.method10339();
		int var17 = var2.method10339();
		int var18 = var2.method10339();
		int var19 = var2.method10341();
		int var20 = var2.method10341();
		int var21 = var2.method10341();
		int var22 = var2.method10341();
		int var23 = var2.method10341();
		int var24 = var2.method10341();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		if (var11 > 0) {
			this.field2549 = new byte[var11];
			var2.field5920 = 0;
			for (int var28 = 0; var28 < var11; var28++) {
				byte var29 = this.field2549[var28] = var2.method10340();
				if (var29 == 0) {
					var25++;
				}
				if (var29 >= 1 && var29 <= 3) {
					var26++;
				}
				if (var29 == 2) {
					var27++;
				}
			}
		}
		int var32 = var9 + var11;
		int var33 = var32;
		if (var12 == 1) {
			var32 += var10;
		}
		int var35 = var10 + var32;
		int var36 = var35;
		if (var13 == 255) {
			var35 += var10;
		}
		int var37 = var35;
		if (var15 == 1) {
			var35 += var10;
		}
		int var39 = var24 + var35;
		int var40 = var39;
		if (var14 == 1) {
			var39 += var10;
		}
		int var42 = var22 + var39;
		int var43 = var42;
		if (var16 == 1) {
			var42 += var10 * 2;
		}
		int var45 = var23 + var42;
		int var47 = var10 * 2 + var45;
		int var49 = var19 + var47;
		int var51 = var20 + var49;
		int var53 = var21 + var51;
		int var55 = var25 * 6 + var53;
		int var57 = var26 * 6 + var55;
		int var59 = var26 * 6 + var57;
		int var61 = var26 * 2 + var59;
		int var63 = var26 + var61;
		int var65 = var26 * 2 + var27 * 2 + var63;
		this.field2532 = var9;
		this.field2536 = var10;
		this.field2548 = var11;
		this.field2533 = new int[var9];
		this.field2561 = new int[var9];
		this.field2535 = new int[var9];
		this.field2524 = new int[var10];
		this.field2525 = new int[var10];
		this.field2564 = new int[var10];
		if (var17 == 1) {
			this.field2559 = new int[var9];
		}
		if (var12 == 1) {
			this.field2560 = new byte[var10];
		}
		if (var13 == 255) {
			this.field2541 = new byte[var10];
		} else {
			this.field2551 = (byte) var13;
		}
		if (var14 == 1) {
			this.field2542 = new byte[var10];
		}
		if (var15 == 1) {
			this.field2534 = new int[var10];
		}
		if (var16 == 1) {
			this.field2545 = new short[var10];
		}
		if (var16 == 1 && var11 > 0) {
			this.field2550 = new byte[var10];
		}
		if (var18 == 1) {
			this.field2543 = new int[var9][];
			this.field2558 = new int[var9][];
		}
		this.field2544 = new short[var10];
		if (var11 > 0) {
			this.field2557 = new short[var11];
			this.field2566 = new short[var11];
			this.field2552 = new short[var11];
		}
		var2.field5920 = var11;
		var3.field5920 = var47;
		var4.field5920 = var49;
		var5.field5920 = var51;
		var6.field5920 = var35;
		int var67 = 0;
		int var68 = 0;
		int var69 = 0;
		for (int var70 = 0; var70 < var9; var70++) {
			int var71 = var2.method10339();
			int var72 = 0;
			if ((var71 & 0x1) != 0) {
				var72 = var3.method10354();
			}
			int var73 = 0;
			if ((var71 & 0x2) != 0) {
				var73 = var4.method10354();
			}
			int var74 = 0;
			if ((var71 & 0x4) != 0) {
				var74 = var5.method10354();
			}
			this.field2533[var70] = var67 + var72;
			this.field2561[var70] = var68 + var73;
			this.field2535[var70] = var69 + var74;
			var67 = this.field2533[var70];
			var68 = this.field2561[var70];
			var69 = this.field2535[var70];
			if (var17 == 1) {
				this.field2559[var70] = var6.method10339();
			}
		}
		if (var18 == 1) {
			for (int var75 = 0; var75 < var9; var75++) {
				int var76 = var6.method10339();
				this.field2543[var75] = new int[var76];
				this.field2558[var75] = new int[var76];
				for (int var77 = 0; var77 < var76; var77++) {
					this.field2543[var75][var77] = var6.method10339();
					this.field2558[var75][var77] = var6.method10339();
				}
			}
		}
		var2.field5920 = var45;
		var3.field5920 = var33;
		var4.field5920 = var36;
		var5.field5920 = var40;
		var6.field5920 = var37;
		var7.field5920 = var43;
		var8.field5920 = var42;
		for (int var78 = 0; var78 < var10; var78++) {
			this.field2544[var78] = (short) var2.method10341();
			if (var12 == 1) {
				this.field2560[var78] = var3.method10340();
			}
			if (var13 == 255) {
				this.field2541[var78] = var4.method10340();
			}
			if (var14 == 1) {
				this.field2542[var78] = var5.method10340();
			}
			if (var15 == 1) {
				this.field2534[var78] = var6.method10339();
			}
			if (var16 == 1) {
				this.field2545[var78] = (short) (var7.method10341() - 1);
			}
			if (this.field2550 != null && this.field2545[var78] != -1) {
				this.field2550[var78] = (byte) (var8.method10339() - 1);
			}
		}
		var2.field5920 = var39;
		var3.field5920 = var32;
		int var79 = 0;
		int var80 = 0;
		int var81 = 0;
		int var82 = 0;
		for (int var83 = 0; var83 < var10; var83++) {
			int var84 = var3.method10339();
			if (var84 == 1) {
				var79 = var2.method10354() + var82;
				var80 = var2.method10354() + var79;
				var81 = var2.method10354() + var80;
				var82 = var81;
				this.field2524[var83] = var79;
				this.field2525[var83] = var80;
				this.field2564[var83] = var81;
			}
			if (var84 == 2) {
				var80 = var81;
				var81 = var2.method10354() + var82;
				var82 = var81;
				this.field2524[var83] = var79;
				this.field2525[var83] = var80;
				this.field2564[var83] = var81;
			}
			if (var84 == 3) {
				var79 = var81;
				var81 = var2.method10354() + var82;
				var82 = var81;
				this.field2524[var83] = var79;
				this.field2525[var83] = var80;
				this.field2564[var83] = var81;
			}
			if (var84 == 4) {
				int var87 = var79;
				var79 = var80;
				var80 = var87;
				var81 = var2.method10354() + var82;
				var82 = var81;
				this.field2524[var83] = var79;
				this.field2525[var83] = var87;
				this.field2564[var83] = var81;
			}
		}
		var2.field5920 = var53;
		var3.field5920 = var55;
		var4.field5920 = var57;
		var5.field5920 = var59;
		var6.field5920 = var61;
		var7.field5920 = var63;
		for (int var88 = 0; var88 < var11; var88++) {
			int var89 = this.field2549[var88] & 0xFF;
			if (var89 == 0) {
				this.field2557[var88] = (short) var2.method10341();
				this.field2566[var88] = (short) var2.method10341();
				this.field2552[var88] = (short) var2.method10341();
			}
		}
		var2.field5920 = var65;
		int var90 = var2.method10339();
		if (var90 != 0) {
			new class250();
			var2.method10341();
			var2.method10341();
			var2.method10341();
			var2.method10345();
		}
		boolean var91 = var2.method10339() == 1;
		if (var91) {
			this.field2546 = new byte[var10];
			for (int var92 = 0; var92 < var10; var92++) {
				this.field2546[var92] = var2.method10340();
			}
		}
	}

	@ObfuscatedName("iu.ao([B)V")
	public void method4533(byte[] arg0) {
		boolean var2 = false;
		boolean var3 = false;
		class591 var4 = new class591(arg0);
		class591 var5 = new class591(arg0);
		class591 var6 = new class591(arg0);
		class591 var7 = new class591(arg0);
		class591 var8 = new class591(arg0);
		var4.field5920 = arg0.length - 23;
		int var9 = var4.method10341();
		int var10 = var4.method10341();
		int var11 = var4.method10339();
		int var12 = var4.method10339();
		int var13 = var4.method10339();
		int var14 = var4.method10339();
		int var15 = var4.method10339();
		int var16 = var4.method10339();
		int var17 = var4.method10339();
		int var18 = var4.method10341();
		int var19 = var4.method10341();
		int var20 = var4.method10341();
		int var21 = var4.method10341();
		int var22 = var4.method10341();
		byte var23 = 0;
		int var25 = var9 + var23;
		int var27 = var10 + var25;
		int var28 = var27;
		if (var13 == 255) {
			var27 += var10;
		}
		int var29 = var27;
		if (var15 == 1) {
			var27 += var10;
		}
		int var30 = var27;
		if (var12 == 1) {
			var27 += var10;
		}
		int var32 = var22 + var27;
		int var33 = var32;
		if (var14 == 1) {
			var32 += var10;
		}
		int var35 = var21 + var32;
		int var37 = var10 * 2 + var35;
		int var39 = var11 * 6 + var37;
		int var41 = var18 + var39;
		int var43 = var19 + var41;
		int var45 = var20 + var43;
		this.field2532 = var9;
		this.field2536 = var10;
		this.field2548 = var11;
		this.field2533 = new int[var9];
		this.field2561 = new int[var9];
		this.field2535 = new int[var9];
		this.field2524 = new int[var10];
		this.field2525 = new int[var10];
		this.field2564 = new int[var10];
		if (var11 > 0) {
			this.field2549 = new byte[var11];
			this.field2557 = new short[var11];
			this.field2566 = new short[var11];
			this.field2552 = new short[var11];
		}
		if (var16 == 1) {
			this.field2559 = new int[var9];
		}
		if (var12 == 1) {
			this.field2560 = new byte[var10];
			this.field2550 = new byte[var10];
			this.field2545 = new short[var10];
		}
		if (var13 == 255) {
			this.field2541 = new byte[var10];
		} else {
			this.field2551 = (byte) var13;
		}
		if (var14 == 1) {
			this.field2542 = new byte[var10];
		}
		if (var15 == 1) {
			this.field2534 = new int[var10];
		}
		if (var17 == 1) {
			this.field2543 = new int[var9][];
			this.field2558 = new int[var9][];
		}
		this.field2544 = new short[var10];
		var4.field5920 = var23;
		var5.field5920 = var39;
		var6.field5920 = var41;
		var7.field5920 = var43;
		var8.field5920 = var27;
		int var47 = 0;
		int var48 = 0;
		int var49 = 0;
		for (int var50 = 0; var50 < var9; var50++) {
			int var51 = var4.method10339();
			int var52 = 0;
			if ((var51 & 0x1) != 0) {
				var52 = var5.method10354();
			}
			int var53 = 0;
			if ((var51 & 0x2) != 0) {
				var53 = var6.method10354();
			}
			int var54 = 0;
			if ((var51 & 0x4) != 0) {
				var54 = var7.method10354();
			}
			this.field2533[var50] = var47 + var52;
			this.field2561[var50] = var48 + var53;
			this.field2535[var50] = var49 + var54;
			var47 = this.field2533[var50];
			var48 = this.field2561[var50];
			var49 = this.field2535[var50];
			if (var16 == 1) {
				this.field2559[var50] = var8.method10339();
			}
		}
		if (var17 == 1) {
			for (int var55 = 0; var55 < var9; var55++) {
				int var56 = var8.method10339();
				this.field2543[var55] = new int[var56];
				this.field2558[var55] = new int[var56];
				for (int var57 = 0; var57 < var56; var57++) {
					this.field2543[var55][var57] = var8.method10339();
					this.field2558[var55][var57] = var8.method10339();
				}
			}
		}
		var4.field5920 = var35;
		var5.field5920 = var30;
		var6.field5920 = var28;
		var7.field5920 = var33;
		var8.field5920 = var29;
		for (int var58 = 0; var58 < var10; var58++) {
			this.field2544[var58] = (short) var4.method10341();
			if (var12 == 1) {
				int var59 = var5.method10339();
				if ((var59 & 0x1) == 1) {
					this.field2560[var58] = 1;
					var2 = true;
				} else {
					this.field2560[var58] = 0;
				}
				if ((var59 & 0x2) == 2) {
					this.field2550[var58] = (byte) (var59 >> 2);
					this.field2545[var58] = this.field2544[var58];
					this.field2544[var58] = 127;
					if (this.field2545[var58] != -1) {
						var3 = true;
					}
				} else {
					this.field2550[var58] = -1;
					this.field2545[var58] = -1;
				}
			}
			if (var13 == 255) {
				this.field2541[var58] = var6.method10340();
			}
			if (var14 == 1) {
				this.field2542[var58] = var7.method10340();
			}
			if (var15 == 1) {
				this.field2534[var58] = var8.method10339();
			}
		}
		var4.field5920 = var32;
		var5.field5920 = var25;
		int var60 = 0;
		int var61 = 0;
		int var62 = 0;
		int var63 = 0;
		for (int var64 = 0; var64 < var10; var64++) {
			int var65 = var5.method10339();
			if (var65 == 1) {
				var60 = var4.method10354() + var63;
				var61 = var4.method10354() + var60;
				var62 = var4.method10354() + var61;
				var63 = var62;
				this.field2524[var64] = var60;
				this.field2525[var64] = var61;
				this.field2564[var64] = var62;
			}
			if (var65 == 2) {
				var61 = var62;
				var62 = var4.method10354() + var63;
				var63 = var62;
				this.field2524[var64] = var60;
				this.field2525[var64] = var61;
				this.field2564[var64] = var62;
			}
			if (var65 == 3) {
				var60 = var62;
				var62 = var4.method10354() + var63;
				var63 = var62;
				this.field2524[var64] = var60;
				this.field2525[var64] = var61;
				this.field2564[var64] = var62;
			}
			if (var65 == 4) {
				int var68 = var60;
				var60 = var61;
				var61 = var68;
				var62 = var4.method10354() + var63;
				var63 = var62;
				this.field2524[var64] = var60;
				this.field2525[var64] = var68;
				this.field2564[var64] = var62;
			}
		}
		var4.field5920 = var37;
		for (int var69 = 0; var69 < var11; var69++) {
			this.field2549[var69] = 0;
			this.field2557[var69] = (short) var4.method10341();
			this.field2566[var69] = (short) var4.method10341();
			this.field2552[var69] = (short) var4.method10341();
		}
		var4.field5920 = var45;
		boolean var70 = var4.method10339() == 1;
		if (var70) {
			this.field2546 = new byte[var10];
			for (int var71 = 0; var71 < var10; var71++) {
				this.field2546[var71] = var4.method10340();
			}
		}
		if (this.field2550 != null) {
			boolean var72 = false;
			for (int var73 = 0; var73 < var10; var73++) {
				int var74 = this.field2550[var73] & 0xFF;
				if (var74 != 255) {
					if ((this.field2557[var74] & 0xFFFF) == this.field2524[var73] && (this.field2566[var74] & 0xFFFF) == this.field2525[var73] && (this.field2552[var74] & 0xFFFF) == this.field2564[var73]) {
						this.field2550[var73] = -1;
					} else {
						var72 = true;
					}
				}
			}
			if (!var72) {
				this.field2550 = null;
			}
		}
		if (!var3) {
			this.field2545 = null;
		}
		if (!var2) {
			this.field2560 = null;
		}
	}

	@ObfuscatedName("iu.as([B)V")
	public void method4535(byte[] arg0) {
		class591 var2 = new class591(arg0);
		class591 var3 = new class591(arg0);
		class591 var4 = new class591(arg0);
		class591 var5 = new class591(arg0);
		class591 var6 = new class591(arg0);
		class591 var7 = new class591(arg0);
		class591 var8 = new class591(arg0);
		var2.field5920 = arg0.length - 23;
		int var9 = var2.method10341();
		int var10 = var2.method10341();
		int var11 = var2.method10339();
		int var12 = var2.method10339();
		int var13 = var2.method10339();
		int var14 = var2.method10339();
		int var15 = var2.method10339();
		int var16 = var2.method10339();
		int var17 = var2.method10339();
		int var18 = var2.method10341();
		int var19 = var2.method10341();
		int var20 = var2.method10341();
		int var21 = var2.method10341();
		int var22 = var2.method10341();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		if (var11 > 0) {
			this.field2549 = new byte[var11];
			var2.field5920 = 0;
			for (int var26 = 0; var26 < var11; var26++) {
				byte var27 = this.field2549[var26] = var2.method10340();
				if (var27 == 0) {
					var23++;
				}
				if (var27 >= 1 && var27 <= 3) {
					var24++;
				}
				if (var27 == 2) {
					var25++;
				}
			}
		}
		int var30 = var9 + var11;
		int var31 = var30;
		if (var12 == 1) {
			var30 += var10;
		}
		int var33 = var10 + var30;
		int var34 = var33;
		if (var13 == 255) {
			var33 += var10;
		}
		int var35 = var33;
		if (var15 == 1) {
			var33 += var10;
		}
		int var36 = var33;
		if (var17 == 1) {
			var33 += var9;
		}
		int var37 = var33;
		if (var14 == 1) {
			var33 += var10;
		}
		int var39 = var21 + var33;
		int var40 = var39;
		if (var16 == 1) {
			var39 += var10 * 2;
		}
		int var42 = var22 + var39;
		int var44 = var10 * 2 + var42;
		int var46 = var18 + var44;
		int var48 = var19 + var46;
		int var50 = var20 + var48;
		int var52 = var23 * 6 + var50;
		int var54 = var24 * 6 + var52;
		int var56 = var24 * 6 + var54;
		int var58 = var24 * 2 + var56;
		int var60 = var24 + var58;
		int var62 = var24 * 2 + var25 * 2 + var60;
		this.field2532 = var9;
		this.field2536 = var10;
		this.field2548 = var11;
		this.field2533 = new int[var9];
		this.field2561 = new int[var9];
		this.field2535 = new int[var9];
		this.field2524 = new int[var10];
		this.field2525 = new int[var10];
		this.field2564 = new int[var10];
		if (var17 == 1) {
			this.field2559 = new int[var9];
		}
		if (var12 == 1) {
			this.field2560 = new byte[var10];
		}
		if (var13 == 255) {
			this.field2541 = new byte[var10];
		} else {
			this.field2551 = (byte) var13;
		}
		if (var14 == 1) {
			this.field2542 = new byte[var10];
		}
		if (var15 == 1) {
			this.field2534 = new int[var10];
		}
		if (var16 == 1) {
			this.field2545 = new short[var10];
		}
		if (var16 == 1 && var11 > 0) {
			this.field2550 = new byte[var10];
		}
		this.field2544 = new short[var10];
		if (var11 > 0) {
			this.field2557 = new short[var11];
			this.field2566 = new short[var11];
			this.field2552 = new short[var11];
		}
		var2.field5920 = var11;
		var3.field5920 = var44;
		var4.field5920 = var46;
		var5.field5920 = var48;
		var6.field5920 = var36;
		int var64 = 0;
		int var65 = 0;
		int var66 = 0;
		for (int var67 = 0; var67 < var9; var67++) {
			int var68 = var2.method10339();
			int var69 = 0;
			if ((var68 & 0x1) != 0) {
				var69 = var3.method10354();
			}
			int var70 = 0;
			if ((var68 & 0x2) != 0) {
				var70 = var4.method10354();
			}
			int var71 = 0;
			if ((var68 & 0x4) != 0) {
				var71 = var5.method10354();
			}
			this.field2533[var67] = var64 + var69;
			this.field2561[var67] = var65 + var70;
			this.field2535[var67] = var66 + var71;
			var64 = this.field2533[var67];
			var65 = this.field2561[var67];
			var66 = this.field2535[var67];
			if (var17 == 1) {
				this.field2559[var67] = var6.method10339();
			}
		}
		var2.field5920 = var42;
		var3.field5920 = var31;
		var4.field5920 = var34;
		var5.field5920 = var37;
		var6.field5920 = var35;
		var7.field5920 = var40;
		var8.field5920 = var39;
		for (int var72 = 0; var72 < var10; var72++) {
			this.field2544[var72] = (short) var2.method10341();
			if (var12 == 1) {
				this.field2560[var72] = var3.method10340();
			}
			if (var13 == 255) {
				this.field2541[var72] = var4.method10340();
			}
			if (var14 == 1) {
				this.field2542[var72] = var5.method10340();
			}
			if (var15 == 1) {
				this.field2534[var72] = var6.method10339();
			}
			if (var16 == 1) {
				this.field2545[var72] = (short) (var7.method10341() - 1);
			}
			if (this.field2550 != null && this.field2545[var72] != -1) {
				this.field2550[var72] = (byte) (var8.method10339() - 1);
			}
		}
		var2.field5920 = var33;
		var3.field5920 = var30;
		int var73 = 0;
		int var74 = 0;
		int var75 = 0;
		int var76 = 0;
		for (int var77 = 0; var77 < var10; var77++) {
			int var78 = var3.method10339();
			if (var78 == 1) {
				var73 = var2.method10354() + var76;
				var74 = var2.method10354() + var73;
				var75 = var2.method10354() + var74;
				var76 = var75;
				this.field2524[var77] = var73;
				this.field2525[var77] = var74;
				this.field2564[var77] = var75;
			}
			if (var78 == 2) {
				var74 = var75;
				var75 = var2.method10354() + var76;
				var76 = var75;
				this.field2524[var77] = var73;
				this.field2525[var77] = var74;
				this.field2564[var77] = var75;
			}
			if (var78 == 3) {
				var73 = var75;
				var75 = var2.method10354() + var76;
				var76 = var75;
				this.field2524[var77] = var73;
				this.field2525[var77] = var74;
				this.field2564[var77] = var75;
			}
			if (var78 == 4) {
				int var81 = var73;
				var73 = var74;
				var74 = var81;
				var75 = var2.method10354() + var76;
				var76 = var75;
				this.field2524[var77] = var73;
				this.field2525[var77] = var81;
				this.field2564[var77] = var75;
			}
		}
		var2.field5920 = var50;
		var3.field5920 = var52;
		var4.field5920 = var54;
		var5.field5920 = var56;
		var6.field5920 = var58;
		var7.field5920 = var60;
		for (int var82 = 0; var82 < var11; var82++) {
			int var83 = this.field2549[var82] & 0xFF;
			if (var83 == 0) {
				this.field2557[var82] = (short) var2.method10341();
				this.field2566[var82] = (short) var2.method10341();
				this.field2552[var82] = (short) var2.method10341();
			}
		}
		var2.field5920 = var62;
		int var84 = var2.method10339();
		if (var84 == 0) {
			return;
		}
		new class250();
		var2.method10341();
		var2.method10341();
		var2.method10341();
		var2.method10345();
	}

	@ObfuscatedName("iu.al([B)V")
	public void method4558(byte[] arg0) {
		boolean var2 = false;
		boolean var3 = false;
		class591 var4 = new class591(arg0);
		class591 var5 = new class591(arg0);
		class591 var6 = new class591(arg0);
		class591 var7 = new class591(arg0);
		class591 var8 = new class591(arg0);
		var4.field5920 = arg0.length - 18;
		int var9 = var4.method10341();
		int var10 = var4.method10341();
		int var11 = var4.method10339();
		int var12 = var4.method10339();
		int var13 = var4.method10339();
		int var14 = var4.method10339();
		int var15 = var4.method10339();
		int var16 = var4.method10339();
		int var17 = var4.method10341();
		int var18 = var4.method10341();
		int var19 = var4.method10341();
		int var20 = var4.method10341();
		byte var21 = 0;
		int var23 = var9 + var21;
		int var25 = var10 + var23;
		int var26 = var25;
		if (var13 == 255) {
			var25 += var10;
		}
		int var27 = var25;
		if (var15 == 1) {
			var25 += var10;
		}
		int var28 = var25;
		if (var12 == 1) {
			var25 += var10;
		}
		int var29 = var25;
		if (var16 == 1) {
			var25 += var9;
		}
		int var30 = var25;
		if (var14 == 1) {
			var25 += var10;
		}
		int var32 = var20 + var25;
		int var34 = var10 * 2 + var32;
		int var36 = var11 * 6 + var34;
		int var38 = var17 + var36;
		int var40 = var18 + var38;
		int var10000 = var19 + var40;
		this.field2532 = var9;
		this.field2536 = var10;
		this.field2548 = var11;
		this.field2533 = new int[var9];
		this.field2561 = new int[var9];
		this.field2535 = new int[var9];
		this.field2524 = new int[var10];
		this.field2525 = new int[var10];
		this.field2564 = new int[var10];
		if (var11 > 0) {
			this.field2549 = new byte[var11];
			this.field2557 = new short[var11];
			this.field2566 = new short[var11];
			this.field2552 = new short[var11];
		}
		if (var16 == 1) {
			this.field2559 = new int[var9];
		}
		if (var12 == 1) {
			this.field2560 = new byte[var10];
			this.field2550 = new byte[var10];
			this.field2545 = new short[var10];
		}
		if (var13 == 255) {
			this.field2541 = new byte[var10];
		} else {
			this.field2551 = (byte) var13;
		}
		if (var14 == 1) {
			this.field2542 = new byte[var10];
		}
		if (var15 == 1) {
			this.field2534 = new int[var10];
		}
		this.field2544 = new short[var10];
		var4.field5920 = var21;
		var5.field5920 = var36;
		var6.field5920 = var38;
		var7.field5920 = var40;
		var8.field5920 = var29;
		int var43 = 0;
		int var44 = 0;
		int var45 = 0;
		for (int var46 = 0; var46 < var9; var46++) {
			int var47 = var4.method10339();
			int var48 = 0;
			if ((var47 & 0x1) != 0) {
				var48 = var5.method10354();
			}
			int var49 = 0;
			if ((var47 & 0x2) != 0) {
				var49 = var6.method10354();
			}
			int var50 = 0;
			if ((var47 & 0x4) != 0) {
				var50 = var7.method10354();
			}
			this.field2533[var46] = var43 + var48;
			this.field2561[var46] = var44 + var49;
			this.field2535[var46] = var45 + var50;
			var43 = this.field2533[var46];
			var44 = this.field2561[var46];
			var45 = this.field2535[var46];
			if (var16 == 1) {
				this.field2559[var46] = var8.method10339();
			}
		}
		var4.field5920 = var32;
		var5.field5920 = var28;
		var6.field5920 = var26;
		var7.field5920 = var30;
		var8.field5920 = var27;
		for (int var51 = 0; var51 < var10; var51++) {
			this.field2544[var51] = (short) var4.method10341();
			if (var12 == 1) {
				int var52 = var5.method10339();
				if ((var52 & 0x1) == 1) {
					this.field2560[var51] = 1;
					var2 = true;
				} else {
					this.field2560[var51] = 0;
				}
				if ((var52 & 0x2) == 2) {
					this.field2550[var51] = (byte) (var52 >> 2);
					this.field2545[var51] = this.field2544[var51];
					this.field2544[var51] = 127;
					if (this.field2545[var51] != -1) {
						var3 = true;
					}
				} else {
					this.field2550[var51] = -1;
					this.field2545[var51] = -1;
				}
			}
			if (var13 == 255) {
				this.field2541[var51] = var6.method10340();
			}
			if (var14 == 1) {
				this.field2542[var51] = var7.method10340();
			}
			if (var15 == 1) {
				this.field2534[var51] = var8.method10339();
			}
		}
		var4.field5920 = var25;
		var5.field5920 = var23;
		int var53 = 0;
		int var54 = 0;
		int var55 = 0;
		int var56 = 0;
		for (int var57 = 0; var57 < var10; var57++) {
			int var58 = var5.method10339();
			if (var58 == 1) {
				var53 = var4.method10354() + var56;
				var54 = var4.method10354() + var53;
				var55 = var4.method10354() + var54;
				var56 = var55;
				this.field2524[var57] = var53;
				this.field2525[var57] = var54;
				this.field2564[var57] = var55;
			}
			if (var58 == 2) {
				var54 = var55;
				var55 = var4.method10354() + var56;
				var56 = var55;
				this.field2524[var57] = var53;
				this.field2525[var57] = var54;
				this.field2564[var57] = var55;
			}
			if (var58 == 3) {
				var53 = var55;
				var55 = var4.method10354() + var56;
				var56 = var55;
				this.field2524[var57] = var53;
				this.field2525[var57] = var54;
				this.field2564[var57] = var55;
			}
			if (var58 == 4) {
				int var61 = var53;
				var53 = var54;
				var54 = var61;
				var55 = var4.method10354() + var56;
				var56 = var55;
				this.field2524[var57] = var53;
				this.field2525[var57] = var61;
				this.field2564[var57] = var55;
			}
		}
		var4.field5920 = var34;
		for (int var62 = 0; var62 < var11; var62++) {
			this.field2549[var62] = 0;
			this.field2557[var62] = (short) var4.method10341();
			this.field2566[var62] = (short) var4.method10341();
			this.field2552[var62] = (short) var4.method10341();
		}
		if (this.field2550 != null) {
			boolean var63 = false;
			for (int var64 = 0; var64 < var10; var64++) {
				int var65 = this.field2550[var64] & 0xFF;
				if (var65 != 255) {
					if ((this.field2557[var65] & 0xFFFF) == this.field2524[var64] && (this.field2566[var65] & 0xFFFF) == this.field2525[var64] && (this.field2552[var65] & 0xFFFF) == this.field2564[var64]) {
						this.field2550[var64] = -1;
					} else {
						var63 = true;
					}
				}
			}
			if (!var63) {
				this.field2550 = null;
			}
		}
		if (!var3) {
			this.field2545 = null;
		}
		if (!var2) {
			this.field2560 = null;
		}
	}

	@ObfuscatedName("iu.ai(Liu;I)I")
	public final int method4602(class220 arg0, int arg1) {
		int var3 = -1;
		int var4 = arg0.field2533[arg1];
		int var5 = arg0.field2561[arg1];
		int var6 = arg0.field2535[arg1];
		for (int var7 = 0; var7 < this.field2532; var7++) {
			if (this.field2533[var7] == var4 && this.field2561[var7] == var5 && this.field2535[var7] == var6) {
				var3 = var7;
				break;
			}
		}
		if (var3 == -1) {
			this.field2533[this.field2532] = var4;
			this.field2561[this.field2532] = var5;
			this.field2535[this.field2532] = var6;
			if (arg0.field2559 != null) {
				this.field2559[this.field2532] = arg0.field2559[arg1];
			}
			if (arg0.field2543 != null) {
				this.field2543[this.field2532] = arg0.field2543[arg1];
				this.field2558[this.field2532] = arg0.field2558[arg1];
			}
			var3 = this.field2532++;
		}
		return var3;
	}

	@ObfuscatedName("iu.aa()Liu;")
	public class220 method4537() {
		class220 var1 = new class220();
		if (this.field2560 != null) {
			var1.field2560 = new byte[this.field2536];
			for (int var2 = 0; var2 < this.field2536; var2++) {
				var1.field2560[var2] = this.field2560[var2];
			}
		}
		var1.field2532 = this.field2532;
		var1.field2536 = this.field2536;
		var1.field2548 = this.field2548;
		var1.field2533 = this.field2533;
		var1.field2561 = this.field2561;
		var1.field2535 = this.field2535;
		var1.field2524 = this.field2524;
		var1.field2525 = this.field2525;
		var1.field2564 = this.field2564;
		var1.field2541 = this.field2541;
		var1.field2542 = this.field2542;
		var1.field2550 = this.field2550;
		var1.field2544 = this.field2544;
		var1.field2545 = this.field2545;
		var1.field2551 = this.field2551;
		var1.field2549 = this.field2549;
		var1.field2557 = this.field2557;
		var1.field2566 = this.field2566;
		var1.field2552 = this.field2552;
		var1.field2559 = this.field2559;
		var1.field2534 = this.field2534;
		var1.field2565 = this.field2565;
		var1.field2562 = this.field2562;
		var1.field2554 = this.field2554;
		var1.field2553 = this.field2553;
		var1.field2555 = this.field2555;
		var1.field2556 = this.field2556;
		var1.field2546 = this.field2546;
		return var1;
	}

	@ObfuscatedName("iu.am([[IIIIZI)Liu;")
	public class220 method4546(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		this.method4554();
		int var7 = this.field2540 + arg1;
		int var8 = this.field2567 + arg1;
		int var9 = this.field2569 + arg3;
		int var10 = this.field2568 + arg3;
		if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		int var11 = var7 >> 7;
		int var12 = var8 + 127 >> 7;
		int var13 = var9 >> 7;
		int var14 = var10 + 127 >> 7;
		if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
			return this;
		}
		class220 var15;
		if (arg4) {
			var15 = new class220(this, true, true, true, true);
			var15.field2561 = new int[var15.field2532];
		} else {
			var15 = this;
		}
		if (arg5 == 0) {
			for (int var16 = 0; var16 < var15.field2532; var16++) {
				int var17 = this.field2533[var16] + arg1;
				int var18 = this.field2535[var16] + arg3;
				int var19 = var17 & 0x7F;
				int var20 = var18 & 0x7F;
				int var21 = var17 >> 7;
				int var22 = var18 >> 7;
				int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
				int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
				int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
				var15.field2561[var16] = this.field2561[var16] + var25 - arg2;
			}
		} else {
			for (int var26 = 0; var26 < var15.field2532; var26++) {
				int var27 = (-this.field2561[var26] << 16) / this.field2802;
				if (var27 < arg5) {
					int var28 = this.field2533[var26] + arg1;
					int var29 = this.field2535[var26] + arg3;
					int var30 = var28 & 0x7F;
					int var31 = var29 & 0x7F;
					int var32 = var28 >> 7;
					int var33 = var29 >> 7;
					int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
					int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
					int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
					var15.field2561[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2561[var26];
				} else {
					var15.field2561[var26] = this.field2561[var26];
				}
			}
		}
		var15.method4551();
		return var15;
	}

	@ObfuscatedName("iu.an(III)I")
	public int method4539(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field2532; var4++) {
			if (this.field2533[var4] == arg0 && this.field2561[var4] == arg1 && this.field2535[var4] == arg2) {
				return var4;
			}
		}
		this.field2533[this.field2532] = arg0;
		this.field2561[this.field2532] = arg1;
		this.field2535[this.field2532] = arg2;
		return this.field2532++;
	}

	@ObfuscatedName("iu.ar(IIIBBSS)I")
	public int method4540(int arg0, int arg1, int arg2, byte arg3, byte arg4, short arg5, short arg6) {
		this.field2524[this.field2536] = arg0;
		this.field2525[this.field2536] = arg1;
		this.field2564[this.field2536] = arg2;
		this.field2560[this.field2536] = arg3;
		this.field2550[this.field2536] = arg4;
		this.field2544[this.field2536] = arg5;
		this.field2545[this.field2536] = arg6;
		return this.field2536++;
	}

	@ObfuscatedName("iu.ae()V")
	public void method4541() {
		int var10002;
		if (this.field2559 != null) {
			int[] var1 = new int[256];
			int var2 = 0;
			for (int var3 = 0; var3 < this.field2532; var3++) {
				int var4 = this.field2559[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}
			this.field2565 = new int[var2 + 1][];
			for (int var5 = 0; var5 <= var2; var5++) {
				this.field2565[var5] = new int[var1[var5]];
				var1[var5] = 0;
			}
			int var6 = 0;
			while (var6 < this.field2532) {
				int var7 = this.field2559[var6];
				this.field2565[var7][var1[var7]++] = var6++;
			}
			this.field2559 = null;
		}
		if (this.field2534 == null) {
			return;
		}
		int[] var8 = new int[256];
		int var9 = 0;
		for (int var10 = 0; var10 < this.field2536; var10++) {
			int var11 = this.field2534[var10];
			var10002 = var8[var11]++;
			if (var11 > var9) {
				var9 = var11;
			}
		}
		this.field2562 = new int[var9 + 1][];
		for (int var12 = 0; var12 <= var9; var12++) {
			this.field2562[var12] = new int[var8[var12]];
			var8[var12] = 0;
		}
		int var13 = 0;
		while (var13 < this.field2536) {
			int var14 = this.field2534[var13];
			this.field2562[var14][var8[var14]++] = var13++;
		}
		this.field2534 = null;
	}

	@ObfuscatedName("iu.ad()V")
	public void method4542() {
		for (int var1 = 0; var1 < this.field2532; var1++) {
			int var2 = this.field2533[var1];
			this.field2533[var1] = this.field2535[var1];
			this.field2535[var1] = -var2;
		}
		this.method4551();
	}

	@ObfuscatedName("iu.ag()V")
	public void method4561() {
		for (int var1 = 0; var1 < this.field2532; var1++) {
			this.field2533[var1] = -this.field2533[var1];
			this.field2535[var1] = -this.field2535[var1];
		}
		this.method4551();
	}

	@ObfuscatedName("iu.av()V")
	public void method4600() {
		for (int var1 = 0; var1 < this.field2532; var1++) {
			int var2 = this.field2535[var1];
			this.field2535[var1] = this.field2533[var1];
			this.field2533[var1] = -var2;
		}
		this.method4551();
	}

	@ObfuscatedName("iu.ah(I)V")
	public void method4534(int arg0) {
		int var2 = field2530[arg0];
		int var3 = field2531[arg0];
		for (int var4 = 0; var4 < this.field2532; var4++) {
			int var5 = this.field2535[var4] * var2 + this.field2533[var4] * var3 >> 16;
			this.field2535[var4] = this.field2535[var4] * var3 - this.field2533[var4] * var2 >> 16;
			this.field2533[var4] = var5;
		}
		this.method4551();
	}

	@ObfuscatedName("iu.ab(III)V")
	public void method4545(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field2532; var4++) {
			this.field2533[var4] += arg0;
			this.field2561[var4] += arg1;
			this.field2535[var4] += arg2;
		}
		this.method4551();
	}

	@ObfuscatedName("iu.ax(SS)V")
	public void method4543(short arg0, short arg1) {
		for (int var3 = 0; var3 < this.field2536; var3++) {
			if (this.field2544[var3] == arg0) {
				this.field2544[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("iu.ak(SS)V")
	public void method4548(short arg0, short arg1) {
		if (this.field2545 == null) {
			return;
		}
		for (int var3 = 0; var3 < this.field2536; var3++) {
			if (this.field2545[var3] == arg0) {
				this.field2545[var3] = arg1;
			}
		}
	}

	@ObfuscatedName("iu.aj()V")
	public void method4552() {
		for (int var1 = 0; var1 < this.field2532; var1++) {
			this.field2535[var1] = -this.field2535[var1];
		}
		for (int var2 = 0; var2 < this.field2536; var2++) {
			int var3 = this.field2524[var2];
			this.field2524[var2] = this.field2564[var2];
			this.field2564[var2] = var3;
		}
		this.method4551();
	}

	@ObfuscatedName("iu.az(III)V")
	public void method4547(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < this.field2532; var4++) {
			this.field2533[var4] = this.field2533[var4] * arg0 / 128;
			this.field2561[var4] = this.field2561[var4] * arg1 / 128;
			this.field2535[var4] = this.field2535[var4] * arg2 / 128;
		}
		this.method4551();
	}

	@ObfuscatedName("iu.bt()V")
	public void method4550() {
		if (this.field2554 != null) {
			return;
		}
		this.field2554 = new class244[this.field2532];
		for (int var1 = 0; var1 < this.field2532; var1++) {
			this.field2554[var1] = new class244();
		}
		for (int var2 = 0; var2 < this.field2536; var2++) {
			int var3 = this.field2524[var2];
			int var4 = this.field2525[var2];
			int var5 = this.field2564[var2];
			int var6 = this.field2533[var4] - this.field2533[var3];
			int var7 = this.field2561[var4] - this.field2561[var3];
			int var8 = this.field2535[var4] - this.field2535[var3];
			int var9 = this.field2533[var5] - this.field2533[var3];
			int var10 = this.field2561[var5] - this.field2561[var3];
			int var11 = this.field2535[var5] - this.field2535[var3];
			int var12 = var7 * var11 - var8 * var10;
			int var13 = var8 * var9 - var6 * var11;
			int var14;
			for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
				var12 >>= 0x1;
				var13 >>= 0x1;
			}
			int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
			if (var15 <= 0) {
				var15 = 1;
			}
			int var16 = var12 * 256 / var15;
			int var17 = var13 * 256 / var15;
			int var18 = var14 * 256 / var15;
			byte var19;
			if (this.field2560 == null) {
				var19 = 0;
			} else {
				var19 = this.field2560[var2];
			}
			if (var19 == 0) {
				class244 var20 = this.field2554[var3];
				var20.field2976 += var16;
				var20.field2974 += var17;
				var20.field2973 += var18;
				var20.field2975++;
				class244 var21 = this.field2554[var4];
				var21.field2976 += var16;
				var21.field2974 += var17;
				var21.field2973 += var18;
				var21.field2975++;
				class244 var22 = this.field2554[var5];
				var22.field2976 += var16;
				var22.field2974 += var17;
				var22.field2973 += var18;
				var22.field2975++;
			} else if (var19 == 1) {
				if (this.field2553 == null) {
					this.field2553 = new class235[this.field2536];
				}
				class235 var23 = this.field2553[var2] = new class235();
				var23.field2804 = var16;
				var23.field2807 = var17;
				var23.field2805 = var18;
			}
		}
	}

	@ObfuscatedName("iu.bs()V")
	public void method4551() {
		this.field2554 = null;
		this.field2563 = null;
		this.field2553 = null;
		this.field2547 = false;
	}

	@ObfuscatedName("iu.bu()V")
	public void method4554() {
		if (this.field2547) {
			return;
		}
		this.field2802 = 0;
		this.field2538 = 0;
		this.field2540 = 999999;
		this.field2567 = -999999;
		this.field2568 = -99999;
		this.field2569 = 99999;
		for (int var1 = 0; var1 < this.field2532; var1++) {
			int var2 = this.field2533[var1];
			int var3 = this.field2561[var1];
			int var4 = this.field2535[var1];
			if (var2 < this.field2540) {
				this.field2540 = var2;
			}
			if (var2 > this.field2567) {
				this.field2567 = var2;
			}
			if (var4 < this.field2569) {
				this.field2569 = var4;
			}
			if (var4 > this.field2568) {
				this.field2568 = var4;
			}
			if (-var3 > this.field2802) {
				this.field2802 = -var3;
			}
			if (var3 > this.field2538) {
				this.field2538 = var3;
			}
		}
		this.field2547 = true;
	}

	@ObfuscatedName("iu.bi(IIIII)Ljn;")
	public final class242 method4553(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.method4550();
		int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
		int var7 = arg1 * var6 >> 8;
		class242 var8 = new class242();
		var8.field2927 = new int[this.field2536];
		var8.field2906 = new int[this.field2536];
		var8.field2929 = new int[this.field2536];
		if (this.field2548 > 0 && this.field2550 != null) {
			int[] var9 = new int[this.field2548];
			for (int var10 = 0; var10 < this.field2536; var10++) {
				if (this.field2550[var10] != -1) {
					var9[this.field2550[var10] & 0xFF]++;
				}
			}
			var8.field2905 = 0;
			for (int var11 = 0; var11 < this.field2548; var11++) {
				if (var9[var11] > 0 && this.field2549[var11] == 0) {
					var8.field2905++;
				}
			}
			var8.field2910 = new int[var8.field2905];
			var8.field2936 = new int[var8.field2905];
			var8.field2908 = new int[var8.field2905];
			int var12 = 0;
			for (int var13 = 0; var13 < this.field2548; var13++) {
				if (var9[var13] > 0 && this.field2549[var13] == 0) {
					var8.field2910[var12] = this.field2557[var13] & 0xFFFF;
					var8.field2936[var12] = this.field2566[var13] & 0xFFFF;
					var8.field2908[var12] = this.field2552[var13] & 0xFFFF;
					var9[var13] = var12++;
				} else {
					var9[var13] = -1;
				}
			}
			var8.field2876 = new byte[this.field2536];
			for (int var14 = 0; var14 < this.field2536; var14++) {
				if (this.field2550[var14] == -1) {
					var8.field2876[var14] = -1;
				} else {
					var8.field2876[var14] = (byte) var9[this.field2550[var14] & 0xFF];
				}
			}
		}
		for (int var15 = 0; var15 < this.field2536; var15++) {
			byte var16;
			if (this.field2560 == null) {
				var16 = 0;
			} else {
				var16 = this.field2560[var15];
			}
			byte var17;
			if (this.field2542 == null) {
				var17 = 0;
			} else {
				var17 = this.field2542[var15];
			}
			short var18;
			if (this.field2545 == null) {
				var18 = -1;
			} else {
				var18 = this.field2545[var15];
			}
			if (var17 == -2) {
				var16 = 3;
			}
			if (var17 == -1) {
				var16 = 2;
			}
			if (var18 == -1) {
				if (var16 == 0) {
					int var19 = this.field2544[var15] & 0xFFFF;
					class244 var20;
					if (this.field2563 == null || this.field2563[this.field2524[var15]] == null) {
						var20 = this.field2554[this.field2524[var15]];
					} else {
						var20 = this.field2563[this.field2524[var15]];
					}
					int var21 = (var20.field2973 * arg4 + var20.field2976 * arg2 + var20.field2974 * arg3) / (var20.field2975 * var7) + arg0;
					var8.field2927[var15] = method4531(var19, var21);
					class244 var22;
					if (this.field2563 == null || this.field2563[this.field2525[var15]] == null) {
						var22 = this.field2554[this.field2525[var15]];
					} else {
						var22 = this.field2563[this.field2525[var15]];
					}
					int var23 = (var22.field2973 * arg4 + var22.field2976 * arg2 + var22.field2974 * arg3) / (var22.field2975 * var7) + arg0;
					var8.field2906[var15] = method4531(var19, var23);
					class244 var24;
					if (this.field2563 == null || this.field2563[this.field2564[var15]] == null) {
						var24 = this.field2554[this.field2564[var15]];
					} else {
						var24 = this.field2563[this.field2564[var15]];
					}
					int var25 = (var24.field2973 * arg4 + var24.field2976 * arg2 + var24.field2974 * arg3) / (var24.field2975 * var7) + arg0;
					var8.field2929[var15] = method4531(var19, var25);
				} else if (var16 == 1) {
					class235 var26 = this.field2553[var15];
					int var27 = (var26.field2805 * arg4 + var26.field2807 * arg3 + var26.field2804 * arg2) / (var7 / 2 + var7) + arg0;
					var8.field2927[var15] = method4531(this.field2544[var15] & 0xFFFF, var27);
					var8.field2929[var15] = -1;
				} else if (var16 == 3) {
					var8.field2927[var15] = 128;
					var8.field2929[var15] = -1;
				} else {
					var8.field2929[var15] = -2;
				}
			} else if (var16 == 0) {
				class244 var28;
				if (this.field2563 == null || this.field2563[this.field2524[var15]] == null) {
					var28 = this.field2554[this.field2524[var15]];
				} else {
					var28 = this.field2563[this.field2524[var15]];
				}
				int var29 = (var28.field2973 * arg4 + var28.field2976 * arg2 + var28.field2974 * arg3) / (var28.field2975 * var7) + arg0;
				var8.field2927[var15] = method4586(var29);
				class244 var30;
				if (this.field2563 == null || this.field2563[this.field2525[var15]] == null) {
					var30 = this.field2554[this.field2525[var15]];
				} else {
					var30 = this.field2563[this.field2525[var15]];
				}
				int var31 = (var30.field2973 * arg4 + var30.field2976 * arg2 + var30.field2974 * arg3) / (var30.field2975 * var7) + arg0;
				var8.field2906[var15] = method4586(var31);
				class244 var32;
				if (this.field2563 == null || this.field2563[this.field2564[var15]] == null) {
					var32 = this.field2554[this.field2564[var15]];
				} else {
					var32 = this.field2563[this.field2564[var15]];
				}
				int var33 = (var32.field2973 * arg4 + var32.field2976 * arg2 + var32.field2974 * arg3) / (var32.field2975 * var7) + arg0;
				var8.field2929[var15] = method4586(var33);
			} else if (var16 == 1) {
				class235 var34 = this.field2553[var15];
				int var35 = (var34.field2805 * arg4 + var34.field2807 * arg3 + var34.field2804 * arg2) / (var7 / 2 + var7) + arg0;
				var8.field2927[var15] = method4586(var35);
				var8.field2929[var15] = -1;
			} else {
				var8.field2929[var15] = -2;
			}
		}
		this.method4541();
		var8.field2919 = this.field2532;
		var8.field2920 = this.field2533;
		var8.field2888 = this.field2561;
		var8.field2922 = this.field2535;
		var8.field2909 = this.field2536;
		var8.field2937 = this.field2524;
		var8.field2925 = this.field2525;
		var8.field2934 = this.field2564;
		var8.field2930 = this.field2541;
		var8.field2924 = this.field2542;
		var8.field2935 = this.field2551;
		var8.field2947 = this.field2565;
		var8.field2949 = this.field2562;
		var8.field2933 = this.field2545;
		var8.field2940 = this.field2543;
		var8.field2939 = this.field2558;
		var8.field2945 = this.field2546;
		return var8;
	}
}
