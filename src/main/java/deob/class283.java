package deob;

@ObfuscatedName("kz")
public class class283 {

	@ObfuscatedName("kz.af")
	public class279[] field3289;

	@ObfuscatedName("kz.af(I)V")
	public void method5896() {
		this.field3289 = new class279[1];
		class277 var1 = class277.field3247;
		this.field3289[0] = new class279(var1.field3254, var1.field3255);
	}

	@ObfuscatedName("kz.aw(IIILkc;Lkb;Z[I[II)I")
	public int method5881(int arg0, int arg1, int arg2, class278 arg3, class276 arg4, boolean arg5, int[] arg6, int[] arg7) {
		return this.method5882(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, this.field3289[0]);
	}

	@ObfuscatedName("kz.at(IIILkc;Lkb;Z[I[ILkp;B)I")
	public int method5882(int arg0, int arg1, int arg2, class278 arg3, class276 arg4, boolean arg5, int[] arg6, int[] arg7, class279 arg8) {
		arg8.method5819();
		int var10 = arg8.method5801();
		int var11 = arg8.method5814();
		int[][] var12 = arg8.method5804();
		int[][] var13 = arg8.method5803();
		int[] var14 = arg8.method5805();
		int[] var15 = arg8.method5806();
		boolean var16;
		if (arg2 == 1) {
			var16 = this.method5883(arg0, arg1, arg3, arg4, arg8);
		} else if (arg2 == 2) {
			var16 = this.method5899(arg0, arg1, arg3, arg4, arg8);
		} else {
			var16 = this.method5886(arg0, arg1, arg2, arg3, arg4, arg8);
		}
		int var17 = arg0 - (var10 >> 1);
		int var18 = arg1 - (var11 >> 1);
		int var19 = arg8.method5796();
		int var20 = arg8.method5800();
		if (!var16) {
			if (!arg5) {
				return -1;
			}
			int var21 = Integer.MAX_VALUE;
			int var22 = Integer.MAX_VALUE;
			byte var23 = 10;
			int var24 = arg3.field3261;
			int var25 = arg3.field3258;
			int var26 = arg3.field3259;
			int var27 = arg3.field3260;
			for (int var28 = var24 - var23; var28 <= var23 + var24; var28++) {
				for (int var29 = var25 - var23; var29 <= var23 + var25; var29++) {
					int var30 = var28 - var17;
					int var31 = var29 - var18;
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
						int var32 = 0;
						if (var28 < var24) {
							var32 = var24 - var28;
						} else if (var28 > var24 + var26 - 1) {
							var32 = var28 - (var24 + var26 - 1);
						}
						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var25 + var27 - 1) {
							var33 = var29 - (var25 + var27 - 1);
						}
						int var34 = var32 * var32 + var33 * var33;
						if (var34 < var21 || var21 == var34 && var12[var30][var31] < var22) {
							var21 = var34;
							var22 = var12[var30][var31];
							var19 = var28;
							var20 = var29;
						}
					}
				}
			}
			if (var21 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg0 == var19 && arg1 == var20) {
			arg6[0] = var19;
			arg7[0] = var20;
			return 0;
		}
		byte var35 = 0;
		var14[var35] = var19;
		int var40 = var35 + 1;
		var15[var35] = var20;
		int var36;
		int var37 = var36 = var13[var19 - var17][var20 - var18];
		while (arg0 != var19 || arg1 != var20) {
			if (var36 != var37) {
				var36 = var37;
				var14[var40] = var19;
				var15[var40++] = var20;
			}
			if ((var37 & 0x2) != 0) {
				var19++;
			} else if ((var37 & 0x8) != 0) {
				var19--;
			}
			if ((var37 & 0x1) != 0) {
				var20++;
			} else if ((var37 & 0x4) != 0) {
				var20--;
			}
			var37 = var13[var19 - var17][var20 - var18];
		}
		int var38 = 0;
		while (var40-- > 0) {
			arg6[var38] = var14[var40];
			arg7[var38++] = var15[var40];
			if (var38 >= arg6.length) {
				break;
			}
		}
		return var38;
	}

	@ObfuscatedName("kz.ac(IILkc;Lkb;Lkp;I)Z")
	public final boolean method5883(int arg0, int arg1, class278 arg2, class276 arg3, class279 arg4) {
		int var6 = arg4.method5801();
		int var7 = arg4.method5814();
		int[][] var8 = arg4.method5804();
		int[][] var9 = arg4.method5803();
		int[] var10 = arg4.method5805();
		int[] var11 = arg4.method5806();
		int var12 = arg4.method5807();
		int var13 = arg0;
		int var14 = arg1;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = arg0 - var15;
		int var18 = arg1 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		byte var19 = 0;
		int var20 = 0;
		var10[var19] = arg0;
		byte var10001 = var19;
		int var26 = var19 + 1;
		var11[var10001] = arg1;
		while (var26 != var20) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			int var21 = var13 - var17;
			int var22 = var14 - var18;
			int var23 = var13 - arg3.method5724();
			int var24 = var14 - arg3.method5767();
			if (arg2.method765(1, var13, var14, arg3)) {
				arg4.method5797(var13, var14);
				return true;
			}
			int var25 = var8[var21][var22] + 1;
			if (var21 > 0 && var9[var21 - 1][var22] == 0 && !arg3.method5784(var23 - 1, var24, 1076101384)) {
				var10[var26] = var13 - 1;
				var11[var26] = var14;
				var26 = var26 + 1 & var12;
				var9[var21 - 1][var22] = 2;
				var8[var21 - 1][var22] = var25;
			}
			if (var21 < var6 - 1 && var9[var21 + 1][var22] == 0 && !arg3.method5784(var23 + 1, var24, 1076101504)) {
				var10[var26] = var13 + 1;
				var11[var26] = var14;
				var26 = var26 + 1 & var12;
				var9[var21 + 1][var22] = 8;
				var8[var21 + 1][var22] = var25;
			}
			if (var22 > 0 && var9[var21][var22 - 1] == 0 && !arg3.method5784(var23, var24 - 1, 1076101378)) {
				var10[var26] = var13;
				var11[var26] = var14 - 1;
				var26 = var26 + 1 & var12;
				var9[var21][var22 - 1] = 1;
				var8[var21][var22 - 1] = var25;
			}
			if (var22 < var7 - 1 && var9[var21][var22 + 1] == 0 && !arg3.method5784(var23, var24 + 1, 1076101408)) {
				var10[var26] = var13;
				var11[var26] = var14 + 1;
				var26 = var26 + 1 & var12;
				var9[var21][var22 + 1] = 4;
				var8[var21][var22 + 1] = var25;
			}
			if (var21 > 0 && var22 > 0 && var9[var21 - 1][var22 - 1] == 0 && !arg3.method5784(var23 - 1, var24 - 1, 1076101390) && !arg3.method5784(var23 - 1, var24, 1076101384) && !arg3.method5784(var23, var24 - 1, 1076101378)) {
				var10[var26] = var13 - 1;
				var11[var26] = var14 - 1;
				var26 = var26 + 1 & var12;
				var9[var21 - 1][var22 - 1] = 3;
				var8[var21 - 1][var22 - 1] = var25;
			}
			if (var21 < var6 - 1 && var22 > 0 && var9[var21 + 1][var22 - 1] == 0 && !arg3.method5784(var23 + 1, var24 - 1, 1076101507) && !arg3.method5784(var23 + 1, var24, 1076101504) && !arg3.method5784(var23, var24 - 1, 1076101378)) {
				var10[var26] = var13 + 1;
				var11[var26] = var14 - 1;
				var26 = var26 + 1 & var12;
				var9[var21 + 1][var22 - 1] = 9;
				var8[var21 + 1][var22 - 1] = var25;
			}
			if (var21 > 0 && var22 < var7 - 1 && var9[var21 - 1][var22 + 1] == 0 && !arg3.method5784(var23 - 1, var24 + 1, 1076101432) && !arg3.method5784(var23 - 1, var24, 1076101384) && !arg3.method5784(var23, var24 + 1, 1076101408)) {
				var10[var26] = var13 - 1;
				var11[var26] = var14 + 1;
				var26 = var26 + 1 & var12;
				var9[var21 - 1][var22 + 1] = 6;
				var8[var21 - 1][var22 + 1] = var25;
			}
			if (var21 < var6 - 1 && var22 < var7 - 1 && var9[var21 + 1][var22 + 1] == 0 && !arg3.method5784(var23 + 1, var24 + 1, 1076101600) && !arg3.method5784(var23 + 1, var24, 1076101504) && !arg3.method5784(var23, var24 + 1, 1076101408)) {
				var10[var26] = var13 + 1;
				var11[var26] = var14 + 1;
				var26 = var26 + 1 & var12;
				var9[var21 + 1][var22 + 1] = 12;
				var8[var21 + 1][var22 + 1] = var25;
			}
		}
		arg4.method5797(var13, var14);
		return false;
	}

	@ObfuscatedName("kz.ap(IILkc;Lkb;Lkp;I)Z")
	public final boolean method5899(int arg0, int arg1, class278 arg2, class276 arg3, class279 arg4) {
		int var6 = arg4.method5801();
		int var7 = arg4.method5814();
		int[][] var8 = arg4.method5804();
		int[][] var9 = arg4.method5803();
		int[] var10 = arg4.method5805();
		int[] var11 = arg4.method5806();
		int var12 = arg4.method5807();
		int var13 = arg0;
		int var14 = arg1;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = arg0 - var15;
		int var18 = arg1 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		byte var19 = 0;
		int var20 = 0;
		var10[var19] = arg0;
		byte var10001 = var19;
		int var26 = var19 + 1;
		var11[var10001] = arg1;
		while (var26 != var20) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			int var21 = var13 - var17;
			int var22 = var14 - var18;
			int var23 = var13 - arg3.method5724();
			int var24 = var14 - arg3.method5767();
			if (arg2.method765(2, var13, var14, arg3)) {
				arg4.method5797(var13, var14);
				return true;
			}
			int var25 = var8[var21][var22] + 1;
			if (var21 > 0 && var9[var21 - 1][var22] == 0 && !arg3.method5784(var23 - 1, var24, 1076101390) && !arg3.method5784(var23 - 1, var24 + 1, 1076101432)) {
				var10[var26] = var13 - 1;
				var11[var26] = var14;
				var26 = var26 + 1 & var12;
				var9[var21 - 1][var22] = 2;
				var8[var21 - 1][var22] = var25;
			}
			if (var21 < var6 - 2 && var9[var21 + 1][var22] == 0 && !arg3.method5784(var23 + 2, var24, 1076101507) && !arg3.method5784(var23 + 2, var24 + 1, 1076101600)) {
				var10[var26] = var13 + 1;
				var11[var26] = var14;
				var26 = var26 + 1 & var12;
				var9[var21 + 1][var22] = 8;
				var8[var21 + 1][var22] = var25;
			}
			if (var22 > 0 && var9[var21][var22 - 1] == 0 && !arg3.method5784(var23, var24 - 1, 1076101390) && !arg3.method5784(var23 + 1, var24 - 1, 1076101507)) {
				var10[var26] = var13;
				var11[var26] = var14 - 1;
				var26 = var26 + 1 & var12;
				var9[var21][var22 - 1] = 1;
				var8[var21][var22 - 1] = var25;
			}
			if (var22 < var7 - 2 && var9[var21][var22 + 1] == 0 && !arg3.method5784(var23, var24 + 2, 1076101432) && !arg3.method5784(var23 + 1, var24 + 2, 1076101600)) {
				var10[var26] = var13;
				var11[var26] = var14 + 1;
				var26 = var26 + 1 & var12;
				var9[var21][var22 + 1] = 4;
				var8[var21][var22 + 1] = var25;
			}
			if (var21 > 0 && var22 > 0 && var9[var21 - 1][var22 - 1] == 0 && !arg3.method5784(var23 - 1, var24, 1076101438) && !arg3.method5784(var23 - 1, var24 - 1, 1076101390) && !arg3.method5784(var23, var24 - 1, 1076101519)) {
				var10[var26] = var13 - 1;
				var11[var26] = var14 - 1;
				var26 = var26 + 1 & var12;
				var9[var21 - 1][var22 - 1] = 3;
				var8[var21 - 1][var22 - 1] = var25;
			}
			if (var21 < var6 - 2 && var22 > 0 && var9[var21 + 1][var22 - 1] == 0 && !arg3.method5784(var23 + 1, var24 - 1, 1076101519) && !arg3.method5784(var23 + 2, var24 - 1, 1076101507) && !arg3.method5784(var23 + 2, var24, 1076101603)) {
				var10[var26] = var13 + 1;
				var11[var26] = var14 - 1;
				var26 = var26 + 1 & var12;
				var9[var21 + 1][var22 - 1] = 9;
				var8[var21 + 1][var22 - 1] = var25;
			}
			if (var21 > 0 && var22 < var7 - 2 && var9[var21 - 1][var22 + 1] == 0 && !arg3.method5784(var23 - 1, var24 + 1, 1076101438) && !arg3.method5784(var23 - 1, var24 + 2, 1076101432) && !arg3.method5784(var23, var24 + 2, 1076101624)) {
				var10[var26] = var13 - 1;
				var11[var26] = var14 + 1;
				var26 = var26 + 1 & var12;
				var9[var21 - 1][var22 + 1] = 6;
				var8[var21 - 1][var22 + 1] = var25;
			}
			if (var21 < var6 - 2 && var22 < var7 - 2 && var9[var21 + 1][var22 + 1] == 0 && !arg3.method5784(var23 + 1, var24 + 2, 1076101624) && !arg3.method5784(var23 + 2, var24 + 2, 1076101600) && !arg3.method5784(var23 + 2, var24 + 1, 1076101603)) {
				var10[var26] = var13 + 1;
				var11[var26] = var14 + 1;
				var26 = var26 + 1 & var12;
				var9[var21 + 1][var22 + 1] = 12;
				var8[var21 + 1][var22 + 1] = var25;
			}
		}
		arg4.method5797(var13, var14);
		return false;
	}

	@ObfuscatedName("kz.aq(IIILkc;Lkb;Lkp;I)Z")
	public final boolean method5886(int arg0, int arg1, int arg2, class278 arg3, class276 arg4, class279 arg5) {
		int var7 = arg5.method5801();
		int var8 = arg5.method5814();
		int[][] var9 = arg5.method5804();
		int[][] var10 = arg5.method5803();
		int[] var11 = arg5.method5805();
		int[] var12 = arg5.method5806();
		int var13 = arg5.method5807();
		int var14 = arg0;
		int var15 = arg1;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = arg0 - var16;
		int var19 = arg1 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		byte var20 = 0;
		int var21 = 0;
		var11[var20] = arg0;
		int var35 = var20 + 1;
		var12[var20] = arg1;
		while (true) {
			label265: while (true) {
				int var22;
				int var23;
				int var24;
				int var25;
				int var26;
				do {
					do {
						do {
							label242: do {
								if (var35 == var21) {
									arg5.method5797(var14, var15);
									return false;
								}
								var14 = var11[var21];
								var15 = var12[var21];
								var21 = var21 + 1 & var13;
								var22 = var14 - var18;
								var23 = var15 - var19;
								var24 = var14 - arg4.method5724();
								var25 = var15 - arg4.method5767();
								if (arg3.method765(arg2, var14, var15, arg4)) {
									arg5.method5797(var14, var15);
									return true;
								}
								var26 = var9[var22][var23] + 1;
								if (var22 > 0 && var10[var22 - 1][var23] == 0 && !arg4.method5784(var24 - 1, var25, 1076101390) && !arg4.method5784(var24 - 1, arg2 + var25 - 1, 1076101432)) {
									int var27 = 1;
									while (true) {
										if (var27 >= arg2 - 1) {
											var11[var35] = var14 - 1;
											var12[var35] = var15;
											var35 = var35 + 1 & var13;
											var10[var22 - 1][var23] = 2;
											var9[var22 - 1][var23] = var26;
											break;
										}
										if (arg4.method5784(var24 - 1, var25 + var27, 1076101438)) {
											break;
										}
										var27++;
									}
								}
								if (var22 < var7 - arg2 && var10[var22 + 1][var23] == 0 && !arg4.method5784(arg2 + var24, var25, 1076101507) && !arg4.method5784(arg2 + var24, arg2 + var25 - 1, 1076101600)) {
									int var28 = 1;
									while (true) {
										if (var28 >= arg2 - 1) {
											var11[var35] = var14 + 1;
											var12[var35] = var15;
											var35 = var35 + 1 & var13;
											var10[var22 + 1][var23] = 8;
											var9[var22 + 1][var23] = var26;
											break;
										}
										if (arg4.method5784(arg2 + var24, var25 + var28, 1076101603)) {
											break;
										}
										var28++;
									}
								}
								if (var23 > 0 && var10[var22][var23 - 1] == 0 && !arg4.method5784(var24, var25 - 1, 1076101390) && !arg4.method5784(arg2 + var24 - 1, var25 - 1, 1076101507)) {
									int var29 = 1;
									while (true) {
										if (var29 >= arg2 - 1) {
											var11[var35] = var14;
											var12[var35] = var15 - 1;
											var35 = var35 + 1 & var13;
											var10[var22][var23 - 1] = 1;
											var9[var22][var23 - 1] = var26;
											break;
										}
										if (arg4.method5784(var24 + var29, var25 - 1, 1076101519)) {
											break;
										}
										var29++;
									}
								}
								if (var23 < var8 - arg2 && var10[var22][var23 + 1] == 0 && !arg4.method5784(var24, arg2 + var25, 1076101432) && !arg4.method5784(arg2 + var24 - 1, arg2 + var25, 1076101600)) {
									int var30 = 1;
									while (true) {
										if (var30 >= arg2 - 1) {
											var11[var35] = var14;
											var12[var35] = var15 + 1;
											var35 = var35 + 1 & var13;
											var10[var22][var23 + 1] = 4;
											var9[var22][var23 + 1] = var26;
											break;
										}
										if (arg4.method5784(var24 + var30, arg2 + var25, 1076101624)) {
											break;
										}
										var30++;
									}
								}
								if (var22 > 0 && var23 > 0 && var10[var22 - 1][var23 - 1] == 0 && !arg4.method5784(var24 - 1, var25 - 1, 1076101390)) {
									int var31 = 1;
									while (true) {
										if (var31 >= arg2) {
											var11[var35] = var14 - 1;
											var12[var35] = var15 - 1;
											var35 = var35 + 1 & var13;
											var10[var22 - 1][var23 - 1] = 3;
											var9[var22 - 1][var23 - 1] = var26;
											break;
										}
										if (arg4.method5784(var24 - 1, var25 - 1 + var31, 1076101438) || arg4.method5784(var24 - 1 + var31, var25 - 1, 1076101519)) {
											break;
										}
										var31++;
									}
								}
								if (var22 < var7 - arg2 && var23 > 0 && var10[var22 + 1][var23 - 1] == 0 && !arg4.method5784(arg2 + var24, var25 - 1, 1076101507)) {
									int var32 = 1;
									while (true) {
										if (var32 >= arg2) {
											var11[var35] = var14 + 1;
											var12[var35] = var15 - 1;
											var35 = var35 + 1 & var13;
											var10[var22 + 1][var23 - 1] = 9;
											var9[var22 + 1][var23 - 1] = var26;
											break;
										}
										if (arg4.method5784(arg2 + var24, var25 - 1 + var32, 1076101603) || arg4.method5784(var24 + var32, var25 - 1, 1076101519)) {
											break;
										}
										var32++;
									}
								}
								if (var22 > 0 && var23 < var8 - arg2 && var10[var22 - 1][var23 + 1] == 0 && !arg4.method5784(var24 - 1, arg2 + var25, 1076101432)) {
									for (int var33 = 1; var33 < arg2; var33++) {
										if (arg4.method5784(var24 - 1, var25 + var33, 1076101438) || arg4.method5784(var24 - 1 + var33, arg2 + var25, 1076101624)) {
											continue label242;
										}
									}
									var11[var35] = var14 - 1;
									var12[var35] = var15 + 1;
									var35 = var35 + 1 & var13;
									var10[var22 - 1][var23 + 1] = 6;
									var9[var22 - 1][var23 + 1] = var26;
								}
							} while (var22 >= var7 - arg2);
						} while (var23 >= var8 - arg2);
					} while (var10[var22 + 1][var23 + 1] != 0);
				} while (arg4.method5784(arg2 + var24, arg2 + var25, 1076101600));
				for (int var34 = 1; var34 < arg2; var34++) {
					if (arg4.method5784(var24 + var34, arg2 + var25, 1076101624) || arg4.method5784(arg2 + var24, var25 + var34, 1076101603)) {
						continue label265;
					}
				}
				var11[var35] = var14 + 1;
				var12[var35] = var15 + 1;
				var35 = var35 + 1 & var13;
				var10[var22 + 1][var23 + 1] = 12;
				var9[var22 + 1][var23 + 1] = var26;
			}
		}
	}
}
