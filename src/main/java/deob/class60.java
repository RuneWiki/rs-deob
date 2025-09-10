package deob;

@ObfuscatedName("cc")
public class class60 {

	@ObfuscatedName("cc.ac")
	public static final int[] field840 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("cc.ap")
	public static final int[] field841 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("cc.aq")
	public static final int[] field842 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("cc.ao")
	public static final int[] field844 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("cc.as")
	public static final int[] field852 = new int[] { 1, -1, -1, 1 };

	@ObfuscatedName("cc.al")
	public static final int[] field839 = new int[] { -1, -1, 1, 1 };

	@ObfuscatedName("cc.au")
	public static int field843 = 99;

	@ObfuscatedName("cc.ax")
	public static int field853 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("cc.ak")
	public static int field854 = (int) (Math.random() * 33.0D) - 16;

	public class60() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ce.af(S)V")
	public static void method2060() {
		field843 = 99;
		Statics.field271 = new short[4][104][104];
		Statics.field847 = new short[4][104][104];
		Statics.field848 = new byte[4][104][104];
		Statics.field849 = new byte[4][104][104];
		Statics.field4838 = new int[4][105][105];
		Statics.field850 = new byte[4][105][105];
		Statics.field1829 = new int[105][105];
		Statics.field1569 = new int[104];
		Statics.field3084 = new int[104];
		Statics.field845 = new int[104];
		Statics.field851 = new int[104];
		Statics.field2815 = new int[104];
	}

	@ObfuscatedName("hh.aw(I)V")
	public static void method4084() {
		Statics.field271 = null;
		Statics.field847 = null;
		Statics.field848 = null;
		Statics.field849 = null;
		Statics.field4838 = null;
		Statics.field850 = null;
		Statics.field1829 = null;
		Statics.field1569 = null;
		Statics.field3084 = null;
		Statics.field845 = null;
		Statics.field851 = null;
		Statics.field2815 = null;
	}

	@ObfuscatedName("rz.at(Ldr;IIIII)V")
	public static final void method8212(class80 arg0, int arg1, int arg2, int arg3, int arg4) {
		int[][][] var5 = arg0.field1174;
		int var6 = arg0.field1163 - 1;
		int var7 = arg0.field1164 - 1;
		for (int var8 = arg2; var8 <= arg2 + arg4; var8++) {
			for (int var9 = arg1; var9 <= arg1 + arg3; var9++) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					Statics.field850[0][var9][var8] = 127;
					if (arg1 == var9 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}
					if (arg1 + arg3 == var9 && var9 < var6) {
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}
					if (arg2 == var8 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}
					if (arg2 + arg4 == var8 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("ne.ac(Ldr;[BIIIII)V")
	public static final void method6744(class80 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0.field1176 != null) {
			for (int var6 = 0; var6 < 4; var6++) {
				class276 var7 = arg0.field1176[var6];
				for (int var8 = arg2; var8 < arg2 + 64; var8++) {
					for (int var9 = arg3; var9 < arg3 + 64; var9++) {
						if (var7.method5734(var8, var9)) {
							var7.method5733(var8, var9, 1073741824);
						}
					}
				}
			}
		}
		class591 var10 = new class591(arg1);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					int var14 = arg2 + var12;
					int var15 = arg3 + var13;
					method3596(arg0, var10, var11, var14, var15, arg4 + var14, arg5 + var15, 0);
				}
			}
		}
		int var16 = var10.field5920 < var10.field5917.length ? var10.method10339() : 0;
		boolean var17 = (var16 & 0x1) != 0;
		if (!var17) {
			return;
		}
		for (int var18 = 0; var18 < 64; var18++) {
			for (int var19 = 0; var19 < 64; var19++) {
				method4010(var10);
			}
		}
	}

	@ObfuscatedName("ee.ap(Ldr;[BIIIIIIIIII)V")
	public static final void method3408(class80 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		class276[] var11 = arg0.field1176;
		if (var11 != null && arg2 >= 0 && arg2 < var11.length) {
			class276 var12 = var11[arg2];
			for (int var13 = arg3; var13 < arg3 + 8; var13++) {
				for (int var14 = arg4; var14 < arg4 + 8; var14++) {
					if (var12.method5734(var13, var14)) {
						var12.method5733(var13, var14, 1073741824);
					}
				}
			}
		}
		class591 var15 = new class591(arg1);
		for (int var16 = 0; var16 < 4; var16++) {
			for (int var17 = 0; var17 < 64; var17++) {
				for (int var18 = 0; var18 < 64; var18++) {
					if (arg5 == var16 && var17 >= arg6 && var17 < arg6 + 8 && var18 >= arg7 && var18 < arg7 + 8) {
						int var19 = arg3 + class362.method5557(var17 & 0x7, var18 & 0x7, arg8);
						int var21 = var17 & 0x7;
						int var22 = var18 & 0x7;
						int var24 = arg8 & 0x3;
						int var25;
						if (var24 == 0) {
							var25 = var22;
						} else if (var24 == 1) {
							var25 = 7 - var21;
						} else if (var24 == 2) {
							var25 = 7 - var22;
						} else {
							var25 = var21;
						}
						int var26 = arg4 + var25;
						int var27 = (var17 & 0x7) + arg3 + arg9;
						int var28 = (var18 & 0x7) + arg4 + arg10;
						method3596(arg0, var15, arg2, var19, var26, var27, var28, arg8);
					} else {
						method3596(arg0, var15, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}
		int var29 = var15.field5920 < var15.field5917.length ? var15.method10339() : 0;
		boolean var30 = (var29 & 0x1) != 0;
		if (!var30) {
			return;
		}
		for (int var31 = 0; var31 < 64; var31++) {
			for (int var32 = 0; var32 < 64; var32++) {
				method4010(var15);
			}
		}
	}

	@ObfuscatedName("gf.aq([[[IIIIB)V")
	public static final void method3813(int[][][] arg0, int arg1, int arg2, int arg3) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				arg0[arg1][arg2 + var4][arg3 + var5] = 0;
			}
		}
		if (arg2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				arg0[arg1][arg2][arg3 + var6] = arg0[arg1][arg2 - 1][arg3 + var6];
			}
		}
		if (arg3 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				arg0[arg1][arg2 + var7][arg3] = arg0[arg1][arg2 + var7][arg3 - 1];
			}
		}
		if (arg2 > 0 && arg0[arg1][arg2 - 1][arg3] != 0) {
			arg0[arg1][arg2][arg3] = arg0[arg1][arg2 - 1][arg3];
		} else if (arg3 > 0 && arg0[arg1][arg2][arg3 - 1] != 0) {
			arg0[arg1][arg2][arg3] = arg0[arg1][arg2][arg3 - 1];
		} else if (arg2 > 0 && arg3 > 0 && arg0[arg1][arg2 - 1][arg3 - 1] != 0) {
			arg0[arg1][arg2][arg3] = arg0[arg1][arg2 - 1][arg3 - 1];
		}
	}

	@ObfuscatedName("fj.ao(Ldr;Lwb;IIIIIII)V")
	public static final void method3596(class80 arg0, class591 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int[][][] var8 = arg0.field1174;
		byte[][][] var9 = arg0.field1169;
		if (arg2 < 0 || arg2 >= 4 || arg3 < 0 || arg3 >= var8[0].length - 1 || arg4 < 0 || arg4 >= var8[0][0].length - 1) {
			method4010(arg1);
			return;
		}
		var9[arg2][arg3][arg4] = 0;
		while (true) {
			int var10 = arg1.method10341();
			if (var10 == 0) {
				if (arg2 == 0) {
					var8[0][arg3][arg4] = -method8208(arg5 + 932731, arg6 + 556238) * 8;
				} else {
					var8[arg2][arg3][arg4] = var8[arg2 - 1][arg3][arg4] - 240;
				}
				break;
			}
			if (var10 == 1) {
				int var11 = arg1.method10339();
				if (var11 == 1) {
					var11 = 0;
				}
				if (arg2 == 0) {
					var8[0][arg3][arg4] = -var11 * 8;
				} else {
					var8[arg2][arg3][arg4] = var8[arg2 - 1][arg3][arg4] - var11 * 8;
				}
				break;
			}
			if (var10 <= 49) {
				Statics.field847[arg2][arg3][arg4] = (short) arg1.method10593();
				Statics.field848[arg2][arg3][arg4] = (byte) ((var10 - 2) / 4);
				Statics.field849[arg2][arg3][arg4] = (byte) (var10 - 2 + arg7 & 0x3);
			} else if (var10 <= 81) {
				var9[arg2][arg3][arg4] = (byte) (var10 - 49);
			} else {
				Statics.field271[arg2][arg3][arg4] = (short) (var10 - 81);
			}
		}
	}

	@ObfuscatedName("hy.as(Lwb;S)V")
	public static void method4010(class591 arg0) {
		while (true) {
			int var1 = arg0.method10341();
			if (var1 != 0) {
				if (var1 != 1) {
					if (var1 <= 49) {
						arg0.method10593();
					}
					continue;
				}
				arg0.method10339();
			}
			return;
		}
	}

	@ObfuscatedName("hp.al([BIIB)Z")
	public static final boolean method4021(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		class591 var4 = new class591(arg0);
		int var5 = -1;
		label57: while (true) {
			int var6 = var4.method10357();
			if (var6 == 0) {
				return var3;
			}
			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				while (!var8) {
					int var10 = var4.method10355();
					if (var10 == 0) {
						continue label57;
					}
					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method10339() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class213 var16 = class213.method8013(var5);
						if (var13 != 22 || !client.field566 || var16.field2309 != 0 || var16.field2332 == 1 || var16.field2334) {
							if (!var16.method4306()) {
								client.field330++;
								var3 = false;
							}
							var8 = true;
						}
					}
				}
				int var9 = var4.method10355();
				if (var9 == 0) {
					break;
				}
				var4.method10339();
			}
		}
	}

	@ObfuscatedName("kb.au(Ldr;[BIIB)V")
	public static final void method5789(class80 arg0, byte[] arg1, int arg2, int arg3) {
		class591 var4 = new class591(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method10357();
			if (var6 == 0) {
				return;
			}
			var5 += var6;
			int var7 = 0;
			while (true) {
				int var8 = var4.method10355();
				if (var8 == 0) {
					break;
				}
				var7 += var8 - 1;
				int var9 = var7 & 0x3F;
				int var10 = var7 >> 6 & 0x3F;
				int var11 = var7 >> 12;
				int var12 = var4.method10339();
				int var13 = var12 >> 2;
				int var14 = var12 & 0x3;
				int var15 = arg2 + var10;
				int var16 = arg3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < arg0.field1174[0].length - 2 && var16 < arg0.field1174[0][0].length - 2) {
					int var17 = var11;
					if ((arg0.field1169[1][var15][var16] & 0x2) == 2) {
						var17 = var11 - 1;
					}
					class276 var18 = null;
					if (var17 >= 0 && arg0.field1176 != null) {
						var18 = arg0.field1176[var17];
					}
					method3855(arg0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("cc.ai(Ldr;[BIIIIIII)V")
	public static final void method2001(class80 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		class591 var9 = new class591(arg1);
		int var10 = -1;
		while (true) {
			int var11 = var9.method10357();
			if (var11 == 0) {
				return;
			}
			var10 += var11;
			int var12 = 0;
			while (true) {
				int var13 = var9.method10355();
				if (var13 == 0) {
					break;
				}
				var12 += var13 - 1;
				int var14 = var12 & 0x3F;
				int var15 = var12 >> 6 & 0x3F;
				int var16 = var12 >> 12;
				int var17 = var9.method10339();
				int var18 = var17 >> 2;
				int var19 = var17 & 0x3;
				if (arg5 == var16 && var15 >= arg6 && var15 < arg6 + 8 && var14 >= arg7 && var14 < arg7 + 8) {
					class213 var20 = class213.method8013(var10);
					int var22 = var15 & 0x7;
					int var23 = var14 & 0x7;
					int var25 = var20.field2330;
					int var26 = var20.field2331;
					if ((var19 & 0x1) == 1) {
						int var27 = var25;
						var25 = var26;
						var26 = var27;
					}
					int var28 = arg8 & 0x3;
					int var29;
					if (var28 == 0) {
						var29 = var22;
					} else if (var28 == 1) {
						var29 = var23;
					} else if (var28 == 2) {
						var29 = 7 - var22 - (var25 - 1);
					} else {
						var29 = 7 - var23 - (var26 - 1);
					}
					int var30 = arg3 + var29;
					int var32 = var15 & 0x7;
					int var33 = var14 & 0x7;
					int var35 = var20.field2330;
					int var36 = var20.field2331;
					if ((var19 & 0x1) == 1) {
						int var37 = var35;
						var35 = var36;
						var36 = var37;
					}
					int var38 = arg8 & 0x3;
					int var39;
					if (var38 == 0) {
						var39 = var33;
					} else if (var38 == 1) {
						var39 = 7 - var32 - (var35 - 1);
					} else if (var38 == 2) {
						var39 = 7 - var33 - (var36 - 1);
					} else {
						var39 = var32;
					}
					int var40 = arg4 + var39;
					if (var30 > 0 && var40 > 0 && var30 < arg0.field1163 - 1 && var40 < arg0.field1164 - 1) {
						int var41 = arg2;
						if ((arg0.field1169[1][var30][var40] & 0x2) == 2) {
							var41 = arg2 - 1;
						}
						class276 var42 = null;
						if (var41 >= 0 && arg0.field1176 != null) {
							var42 = arg0.field1176[var41];
						}
						method3855(arg0, arg2, var30, var40, var10, arg8 + var19 & 0x3, var18, var42);
					}
				}
			}
		}
	}

	@ObfuscatedName("gt.aa(Ldr;IIIIIILkb;I)V")
	public static final void method3855(class80 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class276 arg7) {
		if (client.field566 && (arg0.field1169[0][arg2][arg3] & 0x2) == 0 && (arg0.field1169[arg1][arg2][arg3] & 0x10) != 0) {
			return;
		}
		if (arg1 < field843) {
			field843 = arg1;
		}
		class213 var8 = class213.method8013(arg4);
		int var9;
		int var10;
		if (arg5 == 1 || arg5 == 3) {
			var9 = var8.field2331;
			var10 = var8.field2330;
		} else {
			var9 = var8.field2330;
			var10 = var8.field2331;
		}
		int var11;
		int var12;
		if (arg2 + var9 <= arg0.field1163) {
			var11 = (var9 >> 1) + arg2;
			var12 = (var9 + 1 >> 1) + arg2;
		} else {
			var11 = arg2;
			var12 = arg2 + 1;
		}
		int var13;
		int var14;
		if (arg3 + var10 <= arg0.field1164) {
			var13 = (var10 >> 1) + arg3;
			var14 = (var10 + 1 >> 1) + arg3;
		} else {
			var13 = arg3;
			var14 = arg3 + 1;
		}
		int[][] var15 = arg0.field1174[arg1];
		int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
		int var17 = (arg2 << 7) + (var9 << 6);
		int var18 = (arg3 << 7) + (var10 << 6);
		long var19 = class243.method3407(arg1, arg2, arg3, 2, var8.field2309 == 0, arg4, arg0.field1173);
		int var21 = (arg5 << 6) + arg6;
		if (var8.field2355 == 1) {
			var21 += 256;
		}
		if (var8.method4313()) {
			arg0.method2636(arg1, arg2, arg3, var8, arg5);
		}
		class231 var22 = arg0.field1160;
		if (arg6 == 22) {
			if (!client.field566 || var8.field2309 != 0 || var8.field2332 == 1 || var8.field2334) {
				class234 var23;
				if (var8.field2321 == -1 && var8.field2356 == null) {
					var23 = var8.method4307(22, arg5, var15, var17, var16, var18);
				} else {
					var23 = new class57(arg0, arg4, 22, arg5, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
				}
				var22.method4806(arg1, arg2, arg3, var16, var23, var19, var21);
				if (var8.field2332 == 1 && arg7 != null) {
					arg7.method5762(arg2, arg3);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			class234 var49;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var49 = var8.method4307(10, arg5, var15, var17, var16, var18);
			} else {
				var49 = new class57(arg0, arg4, 10, arg5, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			if (var49 != null && var22.method4846(arg1, arg2, arg3, var16, var9, var10, var49, arg6 == 11 ? 256 : 0, var19, var21) && var8.field2370) {
				int var50 = 15;
				if (var49 instanceof class242) {
					var50 = ((class242) var49).method5130() / 4;
					if (var50 > 30) {
						var50 = 30;
					}
				}
				for (int var51 = 0; var51 <= var9; var51++) {
					for (int var52 = 0; var52 <= var10; var52++) {
						if (var50 > Statics.field850[arg1][arg2 + var51][arg3 + var52]) {
							Statics.field850[arg1][arg2 + var51][arg3 + var52] = (byte) var50;
						}
					}
				}
			}
			if (var8.field2332 != 0 && arg7 != null) {
				arg7.method5738(arg2, arg3, var9, var10, var8.field2333);
			}
		} else if (arg6 >= 12) {
			class234 var24;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var24 = var8.method4307(arg6, arg5, var15, var17, var16, var18);
			} else {
				var24 = new class57(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4846(arg1, arg2, arg3, var16, 1, 1, var24, 0, var19, var21);
			if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
				Statics.field4838[arg1][arg2][arg3] |= 0x924;
			}
			if (var8.field2332 != 0 && arg7 != null) {
				arg7.method5738(arg2, arg3, var9, var10, var8.field2333);
			}
		} else if (arg6 == 0) {
			class234 var25;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var25 = var8.method4307(0, arg5, var15, var17, var16, var18);
			} else {
				var25 = new class57(arg0, arg4, 0, arg5, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4970(arg1, arg2, arg3, var16, var25, null, field840[arg5], 0, var19, var21);
			if (arg5 == 0) {
				if (var8.field2370) {
					Statics.field850[arg1][arg2][arg3] = 50;
					Statics.field850[arg1][arg2][arg3 + 1] = 50;
				}
				if (var8.field2337) {
					Statics.field4838[arg1][arg2][arg3] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var8.field2370) {
					Statics.field850[arg1][arg2][arg3 + 1] = 50;
					Statics.field850[arg1][arg2 + 1][arg3 + 1] = 50;
				}
				if (var8.field2337) {
					Statics.field4838[arg1][arg2][arg3 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var8.field2370) {
					Statics.field850[arg1][arg2 + 1][arg3] = 50;
					Statics.field850[arg1][arg2 + 1][arg3 + 1] = 50;
				}
				if (var8.field2337) {
					Statics.field4838[arg1][arg2 + 1][arg3] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var8.field2370) {
					Statics.field850[arg1][arg2][arg3] = 50;
					Statics.field850[arg1][arg2 + 1][arg3] = 50;
				}
				if (var8.field2337) {
					Statics.field4838[arg1][arg2][arg3] |= 0x492;
				}
			}
			if (var8.field2332 != 0 && arg7 != null) {
				arg7.method5736(arg2, arg3, arg6, arg5, var8.field2333);
			}
			if (var8.field2339 != 16) {
				var22.method4816(arg1, arg2, arg3, var8.field2339);
			}
		} else if (arg6 == 1) {
			class234 var26;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var26 = var8.method4307(1, arg5, var15, var17, var16, var18);
			} else {
				var26 = new class57(arg0, arg4, 1, arg5, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4970(arg1, arg2, arg3, var16, var26, null, field841[arg5], 0, var19, var21);
			if (var8.field2370) {
				if (arg5 == 0) {
					Statics.field850[arg1][arg2][arg3 + 1] = 50;
				} else if (arg5 == 1) {
					Statics.field850[arg1][arg2 + 1][arg3 + 1] = 50;
				} else if (arg5 == 2) {
					Statics.field850[arg1][arg2 + 1][arg3] = 50;
				} else if (arg5 == 3) {
					Statics.field850[arg1][arg2][arg3] = 50;
				}
			}
			if (var8.field2332 != 0 && arg7 != null) {
				arg7.method5736(arg2, arg3, arg6, arg5, var8.field2333);
			}
		} else if (arg6 == 2) {
			int var27 = arg5 + 1 & 0x3;
			class234 var28;
			class234 var29;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var28 = var8.method4307(2, arg5 + 4, var15, var17, var16, var18);
				var29 = var8.method4307(2, var27, var15, var17, var16, var18);
			} else {
				var28 = new class57(arg0, arg4, 2, arg5 + 4, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
				var29 = new class57(arg0, arg4, 2, var27, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4970(arg1, arg2, arg3, var16, var28, var29, field840[arg5], field840[var27], var19, var21);
			if (var8.field2337) {
				if (arg5 == 0) {
					Statics.field4838[arg1][arg2][arg3] |= 0x249;
					Statics.field4838[arg1][arg2][arg3 + 1] |= 0x492;
				} else if (arg5 == 1) {
					Statics.field4838[arg1][arg2][arg3 + 1] |= 0x492;
					Statics.field4838[arg1][arg2 + 1][arg3] |= 0x249;
				} else if (arg5 == 2) {
					Statics.field4838[arg1][arg2 + 1][arg3] |= 0x249;
					Statics.field4838[arg1][arg2][arg3] |= 0x492;
				} else if (arg5 == 3) {
					Statics.field4838[arg1][arg2][arg3] |= 0x492;
					Statics.field4838[arg1][arg2][arg3] |= 0x249;
				}
			}
			if (var8.field2332 != 0 && arg7 != null) {
				arg7.method5736(arg2, arg3, arg6, arg5, var8.field2333);
			}
			if (var8.field2339 != 16) {
				var22.method4816(arg1, arg2, arg3, var8.field2339);
			}
		} else if (arg6 == 3) {
			class234 var30;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var30 = var8.method4307(3, arg5, var15, var17, var16, var18);
			} else {
				var30 = new class57(arg0, arg4, 3, arg5, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4970(arg1, arg2, arg3, var16, var30, null, field841[arg5], 0, var19, var21);
			if (var8.field2370) {
				if (arg5 == 0) {
					Statics.field850[arg1][arg2][arg3 + 1] = 50;
				} else if (arg5 == 1) {
					Statics.field850[arg1][arg2 + 1][arg3 + 1] = 50;
				} else if (arg5 == 2) {
					Statics.field850[arg1][arg2 + 1][arg3] = 50;
				} else if (arg5 == 3) {
					Statics.field850[arg1][arg2][arg3] = 50;
				}
			}
			if (var8.field2332 != 0 && arg7 != null) {
				arg7.method5736(arg2, arg3, arg6, arg5, var8.field2333);
			}
		} else if (arg6 == 9) {
			class234 var31;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var31 = var8.method4307(arg6, arg5, var15, var17, var16, var18);
			} else {
				var31 = new class57(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4846(arg1, arg2, arg3, var16, 1, 1, var31, 0, var19, var21);
			if (var8.field2332 != 0 && arg7 != null) {
				arg7.method5738(arg2, arg3, var9, var10, var8.field2333);
			}
			if (var8.field2339 != 16) {
				var22.method4816(arg1, arg2, arg3, var8.field2339);
			}
		} else if (arg6 == 4) {
			class234 var32;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var32 = var8.method4307(4, arg5, var15, var17, var16, var18);
			} else {
				var32 = new class57(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4937(arg1, arg2, arg3, var16, var32, null, field840[arg5], 0, 0, 0, var19, var21);
		} else if (arg6 == 5) {
			int var33 = 16;
			long var34 = var22.method4826(arg1, arg2, arg3);
			if (var34 != 0L) {
				var33 = class213.method8013(class243.method9745(var34)).field2339;
			}
			class234 var36;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var36 = var8.method4307(4, arg5, var15, var17, var16, var18);
			} else {
				var36 = new class57(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4937(arg1, arg2, arg3, var16, var36, null, field840[arg5], 0, field842[arg5] * var33, field844[arg5] * var33, var19, var21);
		} else if (arg6 == 6) {
			int var37 = 8;
			long var38 = var22.method4826(arg1, arg2, arg3);
			if (var38 != 0L) {
				var37 = class213.method8013(class243.method9745(var38)).field2339 / 2;
			}
			class234 var40;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var40 = var8.method4307(4, arg5 + 4, var15, var17, var16, var18);
			} else {
				var40 = new class57(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4937(arg1, arg2, arg3, var16, var40, null, 256, arg5, field852[arg5] * var37, field839[arg5] * var37, var19, var21);
		} else if (arg6 == 7) {
			int var41 = arg5 + 2 & 0x3;
			class234 var42;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var42 = var8.method4307(4, var41 + 4, var15, var17, var16, var18);
			} else {
				var42 = new class57(arg0, arg4, 4, var41 + 4, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4937(arg1, arg2, arg3, var16, var42, null, 256, var41, 0, 0, var19, var21);
		} else if (arg6 == 8) {
			int var43 = 8;
			long var44 = var22.method4826(arg1, arg2, arg3);
			if (var44 != 0L) {
				var43 = class213.method8013(class243.method9745(var44)).field2339 / 2;
			}
			int var46 = arg5 + 2 & 0x3;
			class234 var47;
			class234 var48;
			if (var8.field2321 == -1 && var8.field2356 == null) {
				var47 = var8.method4307(4, arg5 + 4, var15, var17, var16, var18);
				var48 = var8.method4307(4, var46 + 4, var15, var17, var16, var18);
			} else {
				var47 = new class57(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
				var48 = new class57(arg0, arg4, 4, var46 + 4, arg1, arg2, arg3, var8.field2321, var8.field2320, null);
			}
			var22.method4937(arg1, arg2, arg3, var16, var47, var48, 256, arg5, field852[arg5] * var43, field839[arg5] * var43, var19, var21);
		}
	}

	@ObfuscatedName("kc.am(Ldr;B)V")
	public static final void method5793(class80 arg0) {
		int var1 = arg0.field1163;
		int var2 = arg0.field1164;
		int[][][] var3 = arg0.field1174;
		byte[][][] var4 = arg0.field1169;
		class231 var5 = arg0.field1160;
		class276[] var6 = arg0.field1176;
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < var1; var8++) {
				for (int var9 = 0; var9 < var2; var9++) {
					if ((arg0.field1169[var7][var8][var9] & 0x1) == 1) {
						int var10 = var7;
						if ((arg0.field1169[1][var8][var9] & 0x2) == 2) {
							var10 = var7 - 1;
						}
						if (var10 >= 0 && var6 != null) {
							var6[var10].method5739(var8, var9);
						}
					}
				}
			}
		}
		field853 += (int) (Math.random() * 5.0D) - 2;
		if (field853 < -8) {
			field853 = -8;
		}
		if (field853 > 8) {
			field853 = 8;
		}
		field854 += (int) (Math.random() * 5.0D) - 2;
		if (field854 < -16) {
			field854 = -16;
		}
		if (field854 > 16) {
			field854 = 16;
		}
		for (int var11 = 0; var11 < 4; var11++) {
			byte[][] var12 = Statics.field850[var11];
			boolean var13 = true;
			boolean var14 = true;
			boolean var15 = true;
			boolean var16 = true;
			boolean var17 = true;
			int var18 = (int) Math.sqrt(5100.0D);
			int var19 = var18 * 768 >> 8;
			for (int var20 = 1; var20 < var2 - 1; var20++) {
				for (int var21 = 1; var21 < var1 - 1; var21++) {
					int var22 = var3[var11][var21 + 1][var20] - var3[var11][var21 - 1][var20];
					int var23 = var3[var11][var21][var20 + 1] - var3[var11][var21][var20 - 1];
					int var24 = (int) Math.sqrt((double) (var23 * var23 + var22 * var22 + 65536));
					int var25 = (var22 << 8) / var24;
					int var26 = 65536 / var24;
					int var27 = (var23 << 8) / var24;
					int var28 = (var27 * -50 + var25 * -50 + var26 * -10) / var19 + 96;
					int var29 = (var12[var21][var20] >> 1) + (var12[var21][var20 + 1] >> 3) + (var12[var21][var20 - 1] >> 2) + (var12[var21 - 1][var20] >> 2) + (var12[var21 + 1][var20] >> 3);
					Statics.field1829[var21][var20] = var28 - var29;
				}
			}
			for (int var30 = 0; var30 < var2; var30++) {
				Statics.field1569[var30] = 0;
				Statics.field3084[var30] = 0;
				Statics.field845[var30] = 0;
				Statics.field851[var30] = 0;
				Statics.field2815[var30] = 0;
			}
			for (int var31 = -5; var31 < var1 + 5; var31++) {
				for (int var32 = 0; var32 < var2; var32++) {
					int var33 = var31 + 5;
					int var10002;
					if (var33 >= 0 && var33 < var1) {
						int var34 = (int) class337.method8978(15);
						int var35 = Statics.field271[var11][var33][var32] & var34;
						if (var35 > 0) {
							class203 var36 = class203.method4140(var35 - 1);
							Statics.field1569[var32] += var36.field2216;
							Statics.field3084[var32] += var36.field2213;
							Statics.field845[var32] += var36.field2215;
							Statics.field851[var32] += var36.field2218;
							var10002 = Statics.field2815[var32]++;
						}
					}
					int var37 = var31 - 5;
					if (var37 >= 0 && var37 < var1) {
						int var38 = (int) class337.method8978(15);
						int var39 = Statics.field271[var11][var37][var32] & var38;
						if (var39 > 0) {
							int var40 = var39 - 1;
							class203 var41 = (class203) class203.field2212.method6463((long) var40);
							class203 var42;
							if (var41 == null) {
								byte[] var43 = Statics.field2217.method7692(1, var40);
								class203 var44 = new class203();
								if (var43 != null) {
									var44.method4127(new class591(var43), var40);
								}
								var44.method4142();
								class203.field2212.method6454(var44, (long) var40);
								var42 = var44;
							} else {
								var42 = var41;
							}
							Statics.field1569[var32] -= var42.field2216;
							Statics.field3084[var32] -= var42.field2213;
							Statics.field845[var32] -= var42.field2215;
							Statics.field851[var32] -= var42.field2218;
							var10002 = Statics.field2815[var32]--;
						}
					}
				}
				if (var31 >= 1 && var31 < var1 - 1) {
					int var46 = 0;
					int var47 = 0;
					int var48 = 0;
					int var49 = 0;
					int var50 = 0;
					for (int var51 = -5; var51 < var2 + 5; var51++) {
						int var52 = var51 + 5;
						if (var52 >= 0 && var52 < var2) {
							var46 += Statics.field1569[var52];
							var47 += Statics.field3084[var52];
							var48 += Statics.field845[var52];
							var49 += Statics.field851[var52];
							var50 += Statics.field2815[var52];
						}
						int var53 = var51 - 5;
						if (var53 >= 0 && var53 < var2) {
							var46 -= Statics.field1569[var53];
							var47 -= Statics.field3084[var53];
							var48 -= Statics.field845[var53];
							var49 -= Statics.field851[var53];
							var50 -= Statics.field2815[var53];
						}
						if (var51 >= 1 && var51 < var2 - 1 && (!client.field566 || (var4[0][var31][var51] & 0x2) != 0 || (var4[var11][var31][var51] & 0x10) == 0)) {
							if (var11 < field843) {
								field843 = var11;
							}
							int var54 = (int) class337.method8978(15);
							int var55 = Statics.field271[var11][var31][var51] & var54;
							int var56 = Statics.field847[var11][var31][var51] & var54;
							if (var55 > 0 || var56 > 0) {
								int var57 = var3[var11][var31][var51];
								int var58 = var3[var11][var31 + 1][var51];
								int var59 = var3[var11][var31 + 1][var51 + 1];
								int var60 = var3[var11][var31][var51 + 1];
								int var61 = Statics.field1829[var31][var51];
								int var62 = Statics.field1829[var31 + 1][var51];
								int var63 = Statics.field1829[var31 + 1][var51 + 1];
								int var64 = Statics.field1829[var31][var51 + 1];
								int var65 = -1;
								int var66 = -1;
								if (var55 > 0) {
									int var67 = var46 * 256 / var49;
									int var68 = var47 / var50;
									int var69 = var48 / var50;
									var65 = method6474(var67, var68, var69);
									int var70 = field853 + var67 & 0xFF;
									int var71 = field854 + var69;
									if (var71 < 0) {
										var71 = 0;
									} else if (var71 > 255) {
										var71 = 255;
									}
									var66 = method6474(var70, var68, var71);
								}
								if (var11 > 0) {
									boolean var72 = true;
									if (var55 == 0 && Statics.field848[var11][var31][var51] != 0) {
										var72 = false;
									}
									if (var56 > 0 && !class215.method1260(var56 - 1).field2440) {
										var72 = false;
									}
									if (var72 && var57 == var58 && var57 == var59 && var57 == var60) {
										Statics.field4838[var11][var31][var51] |= 0x924;
									}
								}
								int var73 = 0;
								if (var66 != -1) {
									var73 = class226.field2640[method4524(var66, 96)];
								}
								if (var56 == 0) {
									var5.method4886(var11, var31, var51, 0, 0, -1, var57, var58, var59, var60, method4524(var65, var61), method4524(var65, var62), method4524(var65, var63), method4524(var65, var64), 0, 0, 0, 0, var73, 0);
								} else {
									int var74 = Statics.field848[var11][var31][var51] + 1;
									byte var75 = Statics.field849[var11][var31][var51];
									class215 var76 = class215.method1260(var56 - 1);
									int var77 = var76.field2446;
									int var78;
									int var79;
									if (var77 >= 0) {
										var78 = class226.field2633.field3011.method5069(var77);
										var79 = -1;
									} else if (var76.field2445 == 16711935) {
										var79 = -2;
										var77 = -1;
										var78 = -2;
									} else {
										var79 = method6474(var76.field2449, var76.field2450, var76.field2451);
										int var80 = field853 + var76.field2449 & 0xFF;
										int var81 = field854 + var76.field2451;
										if (var81 < 0) {
											var81 = 0;
										} else if (var81 > 255) {
											var81 = 255;
										}
										var78 = method6474(var80, var76.field2450, var81);
									}
									int var82 = 0;
									if (var78 != -2) {
										var82 = class226.field2640[method6415(var78, 96)];
									}
									if (var76.field2454 != -1) {
										int var83 = field853 + var76.field2452 & 0xFF;
										int var84 = field854 + var76.field2447;
										if (var84 < 0) {
											var84 = 0;
										} else if (var84 > 255) {
											var84 = 255;
										}
										int var85 = method6474(var83, var76.field2453, var84);
										var82 = class226.field2640[method6415(var85, 96)];
									}
									var5.method4886(var11, var31, var51, var74, var75, var77, var57, var58, var59, var60, method4524(var65, var61), method4524(var65, var62), method4524(var65, var63), method4524(var65, var64), method6415(var79, var61), method6415(var79, var62), method6415(var79, var63), method6415(var79, var64), var73, var82);
								}
							}
						}
					}
				}
			}
			for (int var86 = 1; var86 < var2 - 1; var86++) {
				for (int var87 = 1; var87 < var1 - 1; var87++) {
					int var92;
					if ((arg0.field1169[var11][var87][var86] & 0x8) != 0) {
						var92 = 0;
					} else if (var11 <= 0 || (arg0.field1169[1][var87][var86] & 0x2) == 0) {
						var92 = var11;
					} else {
						var92 = var11 - 1;
					}
					var5.method4922(var11, var87, var86, var92);
				}
			}
			Statics.field271[var11] = null;
			Statics.field847[var11] = null;
			Statics.field848[var11] = null;
			Statics.field849[var11] = null;
			Statics.field850[var11] = null;
		}
		var5.method4831(-50, -10, -50);
		for (int var93 = 0; var93 < var1; var93++) {
			for (int var94 = 0; var94 < var2; var94++) {
				if ((var4[1][var93][var94] & 0x2) == 2) {
					var5.method4802(var93, var94);
				}
			}
		}
		if (arg0.method2642()) {
			method6472(arg0);
		}
	}

	@ObfuscatedName("mn.an(Ldr;I)V")
	public static void method6472(class80 arg0) {
		int var1 = arg0.field1163;
		int var2 = arg0.field1164;
		int[][][] var3 = arg0.field1174;
		class231 var4 = arg0.field1160;
		int var5 = 1;
		int var6 = 2;
		int var7 = 4;
		for (int var8 = 0; var8 < 4; var8++) {
			if (var8 > 0) {
				var5 <<= 0x3;
				var6 <<= 0x3;
				var7 <<= 0x3;
			}
			for (int var9 = 0; var9 <= var8; var9++) {
				for (int var10 = 0; var10 <= var2; var10++) {
					for (int var11 = 0; var11 <= var1; var11++) {
						if ((Statics.field4838[var9][var11][var10] & var5) != 0) {
							int var12 = var10;
							int var13 = var10;
							int var14 = var9;
							int var15 = var9;
							while (var12 > 0 && (Statics.field4838[var9][var11][var12 - 1] & var5) != 0) {
								var12--;
							}
							while (var13 < var2 && (Statics.field4838[var9][var11][var13 + 1] & var5) != 0) {
								var13++;
							}
							label154: while (var14 > 0) {
								for (int var16 = var12; var16 <= var13; var16++) {
									if ((Statics.field4838[var14 - 1][var11][var16] & var5) == 0) {
										break label154;
									}
								}
								var14--;
							}
							label143: while (var15 < var8) {
								for (int var17 = var12; var17 <= var13; var17++) {
									if ((Statics.field4838[var15 + 1][var11][var17] & var5) == 0) {
										break label143;
									}
								}
								var15++;
							}
							int var18 = (var15 + 1 - var14) * (var13 - var12 + 1);
							if (var18 >= 8) {
								short var19 = 240;
								int var20 = var3[var15][var11][var12] - var19;
								int var21 = var3[var14][var11][var12];
								var4.method4890(var8, 1, var11 * 128, var11 * 128, var12 * 128, var13 * 128 + 128, var20, var21);
								for (int var22 = var14; var22 <= var15; var22++) {
									for (int var23 = var12; var23 <= var13; var23++) {
										Statics.field4838[var22][var11][var23] &= ~var5;
									}
								}
							}
						}
						if ((Statics.field4838[var9][var11][var10] & var6) != 0) {
							int var24 = var11;
							int var25 = var11;
							int var26 = var9;
							int var27 = var9;
							while (var24 > 0 && (Statics.field4838[var9][var24 - 1][var10] & var6) != 0) {
								var24--;
							}
							while (var25 < var1 && (Statics.field4838[var9][var25 + 1][var10] & var6) != 0) {
								var25++;
							}
							label207: while (var26 > 0) {
								for (int var28 = var24; var28 <= var25; var28++) {
									if ((Statics.field4838[var26 - 1][var28][var10] & var6) == 0) {
										break label207;
									}
								}
								var26--;
							}
							label196: while (var27 < var8) {
								for (int var29 = var24; var29 <= var25; var29++) {
									if ((Statics.field4838[var27 + 1][var29][var10] & var6) == 0) {
										break label196;
									}
								}
								var27++;
							}
							int var30 = (var27 + 1 - var26) * (var25 - var24 + 1);
							if (var30 >= 8) {
								short var31 = 240;
								int var32 = var3[var27][var24][var10] - var31;
								int var33 = var3[var26][var24][var10];
								var4.method4890(var8, 2, var24 * 128, var25 * 128 + 128, var10 * 128, var10 * 128, var32, var33);
								for (int var34 = var26; var34 <= var27; var34++) {
									for (int var35 = var24; var35 <= var25; var35++) {
										Statics.field4838[var34][var35][var10] &= ~var6;
									}
								}
							}
						}
						if ((Statics.field4838[var9][var11][var10] & var7) != 0) {
							int var36 = var11;
							int var37 = var11;
							int var38 = var10;
							int var39 = var10;
							while (var38 > 0 && (Statics.field4838[var9][var11][var38 - 1] & var7) != 0) {
								var38--;
							}
							while (var39 < var2 && (Statics.field4838[var9][var11][var39 + 1] & var7) != 0) {
								var39++;
							}
							label260: while (var36 > 0) {
								for (int var40 = var38; var40 <= var39; var40++) {
									if ((Statics.field4838[var9][var36 - 1][var40] & var7) == 0) {
										break label260;
									}
								}
								var36--;
							}
							label249: while (var37 < var1) {
								for (int var41 = var38; var41 <= var39; var41++) {
									if ((Statics.field4838[var9][var37 + 1][var41] & var7) == 0) {
										break label249;
									}
								}
								var37++;
							}
							if ((var37 - var36 + 1) * (var39 - var38 + 1) >= 4) {
								int var42 = var3[var9][var36][var38];
								var4.method4890(var8, 4, var36 * 128, var37 * 128 + 128, var38 * 128, var39 * 128 + 128, var42, var42);
								for (int var43 = var36; var43 <= var37; var43++) {
									for (int var44 = var38; var44 <= var39; var44++) {
										Statics.field4838[var9][var43][var44] &= ~var7;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("rd.ar(III)I")
	public static final int method8208(int arg0, int arg1) {
		int var2 = method6466(arg0 + 45365, arg1 + 91923, 4) - 128 + (method6466(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method6466(arg0, arg1, 1) - 128 >> 2);
		int var3 = (int) ((double) var2 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}
		return var3;
	}

	@ObfuscatedName("mz.ae(IIII)I")
	public static final int method6466(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = Statics.method326(var3, var5);
		int var8 = Statics.method326(var3 + 1, var5);
		int var9 = Statics.method326(var3, var5 + 1);
		int var10 = Statics.method326(var3 + 1, var5 + 1);
		int var11 = method4022(var7, var8, var4, arg2);
		int var12 = method4022(var9, var10, var4, arg2);
		return method4022(var11, var12, var6, arg2);
	}

	@ObfuscatedName("hq.ay(IIIIB)I")
	public static final int method4022(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 65536 - class226.field2637[arg2 * 1024 / arg3] >> 1;
		return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("hv.ag(III)I")
	public static final int method4195(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		int var3 = var2 << 13 ^ var2;
		int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 0xFF;
	}

	@ObfuscatedName("iw.av(IIB)I")
	public static final int method4524(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = (arg0 & 0x7F) * arg1 / 128;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("mv.ah(III)I")
	public static final int method6415(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			int var2 = (arg0 & 0x7F) * arg1 / 128;
			if (var2 < 2) {
				var2 = 2;
			} else if (var2 > 126) {
				var2 = 126;
			}
			return (arg0 & 0xFF80) + var2;
		}
	}

	@ObfuscatedName("mn.ab(IIIB)I")
	public static final int method6474(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}
}
