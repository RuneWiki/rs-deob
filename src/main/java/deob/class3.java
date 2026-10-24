package deob;

@ObfuscatedName("c")
public final class class3 {

	@ObfuscatedName("c.d")
	public static boolean field25 = true;

	@ObfuscatedName("c.e")
	public static int field26;

	@ObfuscatedName("c.f")
	public static boolean field27;

	@ObfuscatedName("c.g")
	public int field28;

	@ObfuscatedName("c.h")
	public int field29;

	@ObfuscatedName("c.i")
	public int[][][] field30;

	@ObfuscatedName("c.j")
	public byte[][][] field31;

	@ObfuscatedName("c.k")
	public byte[][][] field32;

	@ObfuscatedName("c.l")
	public byte[][][] field33;

	@ObfuscatedName("c.m")
	public byte[][][] field34;

	@ObfuscatedName("c.n")
	public byte[][][] field35;

	@ObfuscatedName("c.o")
	public byte[][][] field36;

	@ObfuscatedName("c.p")
	public int[][] field37;

	@ObfuscatedName("c.q")
	public int[] field38;

	@ObfuscatedName("c.r")
	public int[] field39;

	@ObfuscatedName("c.s")
	public int[] field40;

	@ObfuscatedName("c.t")
	public int[] field41;

	@ObfuscatedName("c.u")
	public int[] field42;

	@ObfuscatedName("c.v")
	public int[][][] field43;

	@ObfuscatedName("c.w")
	public static final int[] field44 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.x")
	public static final int[] field45 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.y")
	public static final int[] field46 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.z")
	public static final int[] field47 = new int[] { 0, -1, 0, 1 };

	public class3(byte[][][] arg0, int arg1, int arg2, int[][][] arg3) {
		field28 = arg1;
		field29 = arg2;
		field30 = arg3;
		field31 = arg0;
		field32 = new byte[4][field28][field29];
		field33 = new byte[4][field28][field29];
		field34 = new byte[4][field28][field29];
		field35 = new byte[4][field28][field29];
		field43 = new int[4][field28 + 1][field29 + 1];
		field36 = new byte[4][field28 + 1][field29 + 1];
		field37 = new int[field28 + 1][field29 + 1];
		field38 = new int[field29];
		field39 = new int[field29];
		field40 = new int[field29];
		field41 = new int[field29];
		field42 = new int[field29];
	}

	@ObfuscatedName("c.a(IIIII)V")
	public final void method14(int arg0, int arg1, int arg2, int arg3) {
		byte var5 = 0;
		for (int var6 = 0; var6 < class55.field758; var6++) {
			if (class55.field759[var6].field764.equalsIgnoreCase("water")) {
				var5 = (byte) (var6 + 1);
				break;
			}
		}

		for (int var7 = arg0; var7 < arg0 + arg1; var7++) {
			for (int var8 = arg2; var8 < arg2 + arg3; var8++) {
				if (var8 >= 0 && var8 < field28 && var7 >= 0 && var7 < field29) {
					field33[0][var8][var7] = var5;

					for (int var9 = 0; var9 < 4; var9++) {
						field30[var9][var8][var7] = 0;
						field31[var9][var8][var7] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIII[BI)V")
	public final void method15(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
		class37 var6 = new class37(arg3);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg4 + var8;
					int var11 = arg0 + var9;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						field31[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.method201();
							if (var12 == 0) {
								break;
							}

							if (var12 == 1) {
								break;
							}

							if (var12 <= 49) {
								field33[var7][var10][var11] = var6.method202();
								field34[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								field35[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								field31[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								field32[var7][var10][var11] = (byte) (var12 - 81);
							}
						}

						int var13 = var6.method201();
						if (var13 == 1) {
							var13 = 0;
						}

						if (var7 == 0) {
							field30[0][var10][var11] = -var13 * 8;
						} else {
							field30[var7][var10][var11] = field30[var7 - 1][var10][var11] - var13 * 8;
						}

						if (var7 == 0) {
							field30[0][var10][var11] = -method19(var10 + arg1 + 932731, var11 + 556238 + arg2) * 8;
						} else {
							field30[var7][var10][var11] = field30[var7 - 1][var10][var11] - 240;
						}
					} else {
						while (true) {
							int var14 = var6.method201();
							if (var14 == 0) {
								break;
							}

							if (var14 == 1) {
								break;
							}

							if (var14 <= 49) {
								var6.method201();
							}
						}

						var6.method201();
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a([BBLr;[Lbc;IILob;)V")
	public final void method16(byte[] arg0, class18 arg1, class54[] arg2, int arg3, int arg4, class41 arg5) {
		class37 var7 = new class37(arg0);
		int var8 = -1;
		while (true) {
			int var9 = var7.method215();
			if (var9 == 0) {
				return;
			}

			var8 += var9;
			int var10 = 0;
			while (true) {
				int var11 = var7.method215();
				if (var11 == 0) {
					break;
				}

				var10 += var11 - 1;
				int var12 = var10 & 0x3F;
				int var13 = var10 >> 6 & 0x3F;
				int var14 = var10 >> 12;
				int var15 = var7.method201();
				int var16 = var15 >> 2;
				int var17 = var15 & 0x3;
				int var18 = arg4 + var13;
				int var19 = arg3 + var12;
				if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
					method17(var8, var17, var19, var16, arg2[var14], var18, var14, arg5, arg1);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIIIILbc;IILob;Lr;)V")
	public final void method17(int arg0, int arg1, int arg2, int arg3, class54 arg4, int arg5, int arg6, class41 arg7, class18 arg8) {
		if (field25) {
			int var10 = arg6;
			if (arg6 > 0 && (field31[1][arg5][arg2] & 0x2) != 0) {
				var10 = arg6 - 1;
			}

			if ((field31[arg6][arg5][arg2] & 0x8) != 0) {
				var10 = 0;
			}

			if (field26 != var10) {
				return;
			}

			if ((field31[arg6][arg5][arg2] & 0x10) != 0) {
				return;
			}
		}

		int var11 = field30[arg6][arg5][arg2];
		int var12 = field30[arg6][arg5 + 1][arg2];
		int var13 = field30[arg6][arg5 + 1][arg2 + 1];
		int var14 = field30[arg6][arg5][arg2 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		class50 var16 = class50.method253(arg0);
		int var17 = (arg0 << 14) + (arg2 << 7) + arg5 + 0x40000000;
		if (!var16.field664) {
			var17 += Integer.MIN_VALUE;
		}

		byte var18 = (byte) ((arg1 << 6) + arg3);
		if (arg3 == 22) {
			if (!field25 || var16.field664 || var16.field685) {
				class31 var19 = var16.method256(22, arg1, var11, var12, var13, var14, -1);
				arg8.method56(var17, arg2, var18, var19, arg5, var15, arg6);

				if (var16.field662 && var16.field664) {
					arg4.method275(arg2, arg5);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			class31 var20 = var16.method256(10, arg1, var11, var12, var13, var14, -1);
			if (var20 != null) {
				int var21 = 0;
				if (arg3 == 11) {
					var21 += 256;
				}

				int var22;
				int var23;
				if (arg1 == 1 || arg1 == 3) {
					var22 = var16.field661;
					var23 = var16.field660;
				} else {
					var22 = var16.field660;
					var23 = var16.field661;
				}

				if (arg8.method60(var20, var18, null, var15, arg5, var23, var22, arg6, var17, arg2, var21) && var16.field677) {
					for (int var24 = 0; var24 <= var22; var24++) {
						for (int var25 = 0; var25 <= var23; var25++) {
							int var26 = var20.field421 / 4;
							if (var26 > 30) {
								var26 = 30;
							}

							if (var26 > field36[arg6][arg5 + var24][arg2 + var25]) {
								field36[arg6][arg5 + var24][arg2 + var25] = (byte) var26;
							}
						}
					}
				}
			}

			if (var16.field662) {
				arg4.method274(arg5, var16.field661, var16.field663, var16.field660, arg2, arg1);
			}

			if (var16.field668 != -1) {
				arg7.method217(new class40(2, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 >= 12) {
			class31 var27 = var16.method256(arg3, arg1, var11, var12, var13, var14, -1);
			arg8.method60(var27, var18, null, var15, arg5, 1, 1, arg6, var17, arg2, 0);

			if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg6 > 0) {
				field43[arg6][arg5][arg2] |= 0x924;
			}

			if (var16.field662) {
				arg4.method274(arg5, var16.field661, var16.field663, var16.field660, arg2, arg1);
			}

			if (var16.field668 != -1) {
				arg7.method217(new class40(2, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 == 0) {
			class31 var28 = var16.method256(0, arg1, var11, var12, var13, var14, -1);
			arg8.method58(var17, 0, var15, var28, arg2, arg5, null, var18, field44[arg1], arg6);

			if (arg1 == 0) {
				if (var16.field677) {
					field36[arg6][arg5][arg2] = 50;
					field36[arg6][arg5][arg2 + 1] = 50;
				}

				if (var16.field667) {
					field43[arg6][arg5][arg2] |= 0x249;
				}
			} else if (arg1 == 1) {
				if (var16.field677) {
					field36[arg6][arg5][arg2 + 1] = 50;
					field36[arg6][arg5 + 1][arg2 + 1] = 50;
				}

				if (var16.field667) {
					field43[arg6][arg5][arg2 + 1] |= 0x492;
				}
			} else if (arg1 == 2) {
				if (var16.field677) {
					field36[arg6][arg5 + 1][arg2] = 50;
					field36[arg6][arg5 + 1][arg2 + 1] = 50;
				}

				if (var16.field667) {
					field43[arg6][arg5 + 1][arg2] |= 0x249;
				}
			} else if (arg1 == 3) {
				if (var16.field677) {
					field36[arg6][arg5][arg2] = 50;
					field36[arg6][arg5 + 1][arg2] = 50;
				}

				if (var16.field667) {
					field43[arg6][arg5][arg2] |= 0x492;
				}
			}

			if (var16.field662) {
				arg4.method273(arg3, arg2, arg1, arg5, var16.field663);
			}

			if (var16.field668 != -1) {
				arg7.method217(new class40(0, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 == 1) {
			class31 var29 = var16.method256(1, arg1, var11, var12, var13, var14, -1);
			arg8.method58(var17, 0, var15, var29, arg2, arg5, null, var18, field45[arg1], arg6);

			if (var16.field677) {
				if (arg1 == 0) {
					field36[arg6][arg5][arg2 + 1] = 50;
				} else if (arg1 == 1) {
					field36[arg6][arg5 + 1][arg2 + 1] = 50;
				} else if (arg1 == 2) {
					field36[arg6][arg5 + 1][arg2] = 50;
				} else if (arg1 == 3) {
					field36[arg6][arg5][arg2] = 50;
				}
			}

			if (var16.field662) {
				arg4.method273(arg3, arg2, arg1, arg5, var16.field663);
			}

			if (var16.field668 != -1) {
				arg7.method217(new class40(0, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 == 2) {
			int var30 = arg1 + 1 & 0x3;
			class31 var31 = var16.method256(2, arg1 + 4, var11, var12, var13, var14, -1);
			class31 var32 = var16.method256(2, var30, var11, var12, var13, var14, -1);
			arg8.method58(var17, field44[var30], var15, var31, arg2, arg5, var32, var18, field44[arg1], arg6);

			if (var16.field667) {
				if (arg1 == 0) {
					field43[arg6][arg5][arg2] |= 0x249;
					field43[arg6][arg5][arg2 + 1] |= 0x492;
				} else if (arg1 == 1) {
					field43[arg6][arg5][arg2 + 1] |= 0x492;
					field43[arg6][arg5 + 1][arg2] |= 0x249;
				} else if (arg1 == 2) {
					field43[arg6][arg5 + 1][arg2] |= 0x249;
					field43[arg6][arg5][arg2] |= 0x492;
				} else if (arg1 == 3) {
					field43[arg6][arg5][arg2] |= 0x492;
					field43[arg6][arg5][arg2] |= 0x249;
				}
			}

			if (var16.field662) {
				arg4.method273(arg3, arg2, arg1, arg5, var16.field663);
			}
		} else if (arg3 == 3) {
			class31 var33 = var16.method256(3, arg1, var11, var12, var13, var14, -1);
			arg8.method58(var17, 0, var15, var33, arg2, arg5, null, var18, field45[arg1], arg6);

			if (var16.field677) {
				if (arg1 == 0) {
					field36[arg6][arg5][arg2 + 1] = 50;
				} else if (arg1 == 1) {
					field36[arg6][arg5 + 1][arg2 + 1] = 50;
				} else if (arg1 == 2) {
					field36[arg6][arg5 + 1][arg2] = 50;
				} else if (arg1 == 3) {
					field36[arg6][arg5][arg2] = 50;
				}
			}

			if (var16.field662) {
				arg4.method273(arg3, arg2, arg1, arg5, var16.field663);
			}

			if (var16.field668 != -1) {
				arg7.method217(new class40(0, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 == 9) {
			class31 var34 = var16.method256(arg3, arg1, var11, var12, var13, var14, -1);
			arg8.method60(var34, var18, null, var15, arg5, 1, 1, arg6, var17, arg2, 0);

			if (var16.field662) {
				arg4.method274(arg5, var16.field661, var16.field663, var16.field660, arg2, arg1);
			}

			if (var16.field668 != -1) {
				arg7.method217(new class40(2, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 == 4) {
			class31 var35 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg8.method59(arg5, var18, var15, 0, var17, field44[arg1], arg1 * 512, 0, var35, arg2, arg6);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 == 5) {
			int var36 = 16;
			int var37 = arg8.method74(arg6, arg5, arg2);
			if (var37 > 0) {
				var36 = class50.method253(var37 >> 14 & 0x7FFF).field669;
			}

			class31 var38 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg8.method59(arg5, var18, var15, field47[arg1] * var36, var17, field44[arg1], arg1 * 512, field46[arg1] * var36, var38, arg2, arg6);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 == 6) {
			class31 var39 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg8.method59(arg5, var18, var15, 0, var17, 256, arg1, 0, var39, arg2, arg6);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 == 7) {
			class31 var40 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg8.method59(arg5, var18, var15, 0, var17, 512, arg1, 0, var40, arg2, arg6);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		} else if (arg3 == 8) {
			class31 var41 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg8.method59(arg5, var18, var15, 0, var17, 768, arg1, 0, var41, arg2, arg6);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg6, arg0, true, class59.field843[var16.field668], arg2, arg5));
			}
		}
	}

	@ObfuscatedName("c.a(Lr;Z[Lbc;)V")
	public final void method18(class18 arg0, class54[] arg1) {
		class54 var3 = null;
		for (int var4 = 0; var4 < 4; var4++) {
			class54 var5 = arg1[var4];
			for (int var6 = 0; var6 < 104; var6++) {
				for (int var7 = 0; var7 < 104; var7++) {
					if ((field31[var4][var6][var7] & 0x1) == 1) {
						var5.method275(var7, var6);
					}

					if (var4 > 0 && (field31[1][var6][var7] & 0x2) == 2) {
						var3.field757[var6][var7] = var5.field757[var6][var7];
					}
				}
			}

			var3 = var5;
		}

		for (int var8 = 0; var8 < 4; var8++) {
			byte[][] var9 = field36[var8];
			byte var10 = 96;
			short var11 = 768;
			byte var12 = -50;
			byte var13 = -10;
			byte var14 = -50;
			int var15 = (int) Math.sqrt(var14 * var14 + var12 * var12 + var13 * var13);
			int var16 = var11 * var15 >> 8;
			for (int var17 = 1; var17 < field29 - 1; var17++) {
				for (int var18 = 1; var18 < field28 - 1; var18++) {
					int var19 = field30[var8][var18 + 1][var17] - field30[var8][var18 - 1][var17];
					int var20 = field30[var8][var18][var17 + 1] - field30[var8][var18][var17 - 1];
					int var21 = (int) Math.sqrt(var20 * var20 + var19 * var19 + 0x10000);
					int var22 = (var19 << 8) / var21;
					int var23 = 0x10000 / var21;
					int var24 = (var20 << 8) / var21;
					int var25 = (var14 * var24 + var12 * var22 + var13 * var23) / var16 + var10;
					int var26 = (var9[var18][var17] >> 1) + (var9[var18][var17 + 1] >> 3) + (var9[var18][var17 - 1] >> 2) + (var9[var18 - 1][var17] >> 2) + (var9[var18 + 1][var17] >> 3);
					field37[var18][var17] = var25 - var26;
				}
			}

			for (int var27 = 0; var27 < field29; var27++) {
				field38[var27] = 0;
				field39[var27] = 0;
				field40[var27] = 0;
				field41[var27] = 0;
				field42[var27] = 0;
			}

			for (int var28 = -5; var28 < field28 + 5; var28++) {
				for (int var29 = 0; var29 < field29; var29++) {
					int var30 = var28 + 5;
					if (var30 >= 0 && var30 < field28) {
						int var31 = field32[var8][var30][var29] & 0xFF;
						if (var31 > 0) {
							class55 var32 = class55.field759[var31 - 1];
							field38[var29] += var32.field768;
							field39[var29] += var32.field766;
							field40[var29] += var32.field767;
							field41[var29] += var32.field769;
							field42[var29]++;
						}
					}

					int var33 = var28 - 5;
					if (var33 >= 0 && var33 < field28) {
						int var34 = field32[var8][var33][var29] & 0xFF;
						if (var34 > 0) {
							class55 var35 = class55.field759[var34 - 1];
							field38[var29] -= var35.field768;
							field39[var29] -= var35.field766;
							field40[var29] -= var35.field767;
							field41[var29] -= var35.field769;
							field42[var29]--;
						}
					}
				}

				if (var28 >= 1 && var28 < field28 - 1) {
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					int var40 = 0;
					for (int var41 = -5; var41 < field29 + 5; var41++) {
						int var42 = var41 + 5;
						if (var42 >= 0 && var42 < field29) {
							var36 += field38[var42];
							var37 += field39[var42];
							var38 += field40[var42];
							var39 += field41[var42];
							var40 += field42[var42];
						}

						int var43 = var41 - 5;
						if (var43 >= 0 && var43 < field29) {
							var36 -= field38[var43];
							var37 -= field39[var43];
							var38 -= field40[var43];
							var39 -= field41[var43];
							var40 -= field42[var43];
						}

						if (var41 >= 1 && var41 < field29 - 1) {
							if (field25) {
								int var44 = var8;
								if (var8 > 0 && (field31[1][var28][var41] & 0x2) != 0) {
									var44 = var8 - 1;
								}

								if ((field31[var8][var28][var41] & 0x8) != 0) {
									var44 = 0;
								}

								if (field26 != var44 || (field31[var8][var28][var41] & 0x10) != 0) {
									continue;
								}
							}

							int var45 = field32[var8][var28][var41] & 0xFF;
							int var46 = field33[var8][var28][var41] & 0xFF;
							if (var45 > 0 || var46 > 0) {
								int var47 = field30[var8][var28][var41];
								int var48 = field30[var8][var28 + 1][var41];
								int var49 = field30[var8][var28 + 1][var41 + 1];
								int var50 = field30[var8][var28][var41 + 1];
								int var51 = field37[var28][var41];
								int var52 = field37[var28 + 1][var41];
								int var53 = field37[var28 + 1][var41 + 1];
								int var54 = field37[var28][var41 + 1];
								int var55 = -1;
								if (var45 > 0) {
									var55 = method26(var36 * 256 / var39, var37 / var40, var38 / var40);
								}

								if (var8 > 0) {
									boolean var56 = true;
									if (var45 == 0 && field34[var8][var28][var41] != 0) {
										var56 = false;
									}

									if (var46 > 0 && !class55.field759[var46 - 1].field763) {
										var56 = false;
									}

									if (var56 && var47 == var48 && var47 == var49 && var47 == var50) {
										field43[var8][var28][var41] |= 0x924;
									}
								}

								int var57 = 0;
								if (var55 != -1) {
									var57 = class33.field510[method24(var55, 96)];
								}

								if (var46 == 0) {
									arg0.method55(var8, var28, var41, 0, 0, -1, var47, var48, var49, var50, method24(var55, var51), method24(var55, var52), method24(var55, var53), method24(var55, var54), 0, 0, 0, 0, var57, 0);
								} else {
									int var58 = field34[var8][var28][var41] + 1;
									byte var59 = field35[var8][var28][var41];
									class55 var60 = class55.field759[var46 - 1];
									int var61 = var60.field761;
									int var62;
									int var63;
									if (var61 >= 0) {
										var62 = class33.method155(var61);
										var63 = -1;
									} else if (var60.field760 == 0xFF00FF) {
										var62 = 0;
										var63 = -2;
										var61 = -1;
									} else {
										var63 = method26(var60.field765, var60.field766, var60.field767);
										var62 = class33.field510[method25(var63, 96)];
									}

									arg0.method55(var8, var28, var41, var58, var59, var61, var47, var48, var49, var50, method24(var55, var51), method24(var55, var52), method24(var55, var53), method24(var55, var54), method25(var63, var51), method25(var63, var52), method25(var63, var53), method25(var63, var54), var57, var62);
								}
							}
						}
					}
				}
			}

			for (int var64 = 1; var64 < field29 - 1; var64++) {
				for (int var65 = 1; var65 < field28 - 1; var65++) {
					int var66 = var8;
					if (var8 > 0 && (field31[1][var65][var64] & 0x2) != 0) {
						var66 = var8 - 1;
					}

					if ((field31[var8][var65][var64] & 0x8) != 0) {
						var66 = 0;
					}

					arg0.method54(var8, var65, var64, var66);
				}
			}
		}

		if (!field27) {
			arg0.method79(64, 768, -10, -50, -50);
		}

		for (int var67 = 0; var67 < field28; var67++) {
			for (int var68 = 0; var68 < field29; var68++) {
				if ((field31[1][var67][var68] & 0x2) == 2) {
					arg0.method52(var68, var67);
				}
			}
		}

		if (!field27) {
			int var69 = 1;
			int var70 = 2;
			int var71 = 4;
			for (int var72 = 0; var72 < 4; var72++) {
				if (var72 > 0) {
					var69 <<= 3;
					var70 <<= 3;
					var71 <<= 3;
				}

				for (int var73 = 0; var73 <= var72; var73++) {
					for (int var74 = 0; var74 <= field29; var74++) {
						for (int var75 = 0; var75 <= field28; var75++) {
							if ((field43[var73][var75][var74] & var69) != 0) {
								int var76 = var74;
								int var77 = var74;
								int var78 = var73;
								int var79 = var73;

								while (var76 > 0 && (field43[var73][var75][var76 - 1] & var69) != 0) {
									var76--;
								}

								while (var77 < field29 && (field43[var73][var75][var77 + 1] & var69) != 0) {
									var77++;
								}

								label323: while (var78 > 0) {
									for (int var80 = var76; var80 <= var77; var80++) {
										if ((field43[var78 - 1][var75][var80] & var69) == 0) {
											break label323;
										}
									}

									var78--;
								}

								label312: while (var79 < var72) {
									for (int var81 = var76; var81 <= var77; var81++) {
										if ((field43[var79 + 1][var75][var81] & var69) == 0) {
											break label312;
										}
									}

									var79++;
								}

								int var82 = (var79 + 1 - var78) * (var77 + 1 - var76);
								if (var82 >= 8) {
									short var83 = 240;
									int var84 = field30[var79][var75][var76] - var83;
									int var85 = field30[var78][var75][var76];
									class18.method53(var75 * 128, var84, var75 * 128, var77 * 128 + 128, var76 * 128, 1, var85, var72);

									for (int var86 = var78; var86 <= var79; var86++) {
										for (int var87 = var76; var87 <= var77; var87++) {
											field43[var86][var75][var87] &= ~var69;
										}
									}
								}
							}

							if ((field43[var73][var75][var74] & var70) != 0) {
								int var88 = var75;
								int var89 = var75;
								int var90 = var73;
								int var91 = var73;

								while (var88 > 0 && (field43[var73][var88 - 1][var74] & var70) != 0) {
									var88--;
								}

								while (var89 < field28 && (field43[var73][var89 + 1][var74] & var70) != 0) {
									var89++;
								}

								label376: while (var90 > 0) {
									for (int var92 = var88; var92 <= var89; var92++) {
										if ((field43[var90 - 1][var92][var74] & var70) == 0) {
											break label376;
										}
									}

									var90--;
								}

								label365: while (var91 < var72) {
									for (int var93 = var88; var93 <= var89; var93++) {
										if ((field43[var91 + 1][var93][var74] & var70) == 0) {
											break label365;
										}
									}

									var91++;
								}

								int var94 = (var91 + 1 - var90) * (var89 + 1 - var88);
								if (var94 >= 8) {
									short var95 = 240;
									int var96 = field30[var91][var88][var74] - var95;
									int var97 = field30[var90][var88][var74];
									class18.method53(var88 * 128, var96, var89 * 128 + 128, var74 * 128, var74 * 128, 2, var97, var72);

									for (int var98 = var90; var98 <= var91; var98++) {
										for (int var99 = var88; var99 <= var89; var99++) {
											field43[var98][var99][var74] &= ~var70;
										}
									}
								}
							}

							if ((field43[var73][var75][var74] & var71) != 0) {
								int var100 = var75;
								int var101 = var75;
								int var102 = var74;
								int var103 = var74;

								while (var102 > 0 && (field43[var73][var75][var102 - 1] & var71) != 0) {
									var102--;
								}

								while (var103 < field29 && (field43[var73][var75][var103 + 1] & var71) != 0) {
									var103++;
								}

								label429: while (var100 > 0) {
									for (int var104 = var102; var104 <= var103; var104++) {
										if ((field43[var73][var100 - 1][var104] & var71) == 0) {
											break label429;
										}
									}

									var100--;
								}

								label418: while (var101 < field28) {
									for (int var105 = var102; var105 <= var103; var105++) {
										if ((field43[var73][var101 + 1][var105] & var71) == 0) {
											break label418;
										}
									}

									var101++;
								}

								if ((var101 - var100 + 1) * (var103 + 1 - var102) >= 4) {
									int var106 = field30[var73][var100][var102];
									class18.method53(var100 * 128, var106, var101 * 128 + 128, var103 * 128 + 128, var102 * 128, 4, var106, var72);

									for (int var107 = var100; var107 <= var101; var107++) {
										for (int var108 = var102; var108 <= var103; var108++) {
											field43[var73][var107][var108] &= ~var71;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(II)I")
	public static final int method19(int arg0, int arg1) {
		int var2 = method20(arg0 + 45365, arg1 + 91923, 4) + (method20(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method20(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("c.a(III)I")
	public static final int method20(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method22(var3, var5);
		int var8 = method22(var3 + 1, var5);
		int var9 = method22(var3, var5 + 1);
		int var10 = method22(var3 + 1, var5 + 1);
		int var11 = method21(var7, var8, var4, arg2);
		int var12 = method21(var9, var10, var4, arg2);
		return method21(var11, var12, var6, arg2);
	}

	@ObfuscatedName("c.a(IIII)I")
	public static final int method21(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - class33.field499[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static final int method22(int arg0, int arg1) {
		int var2 = method23(arg0 - 1, arg1 - 1) + method23(arg0 + 1, arg1 - 1) + method23(arg0 - 1, arg1 + 1) + method23(arg0 + 1, arg1 + 1);
		int var3 = method23(arg0 - 1, arg1) + method23(arg0 + 1, arg1) + method23(arg0, arg1 - 1) + method23(arg0, arg1 + 1);
		int var4 = method23(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("c.c(II)I")
	public static final int method23(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static final int method24(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}

		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}

		return (arg0 & 0xFF80) + arg1;
	}

	@ObfuscatedName("c.e(II)I")
	public final int method25(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}

			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}

			return (arg0 & 0xFF80) + arg1;
		}
	}

	@ObfuscatedName("c.b(III)I")
	public final int method26(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("c.a(ILr;IIIILbc;Lob;[[[IIBI)V")
	public static final void method27(int arg0, class18 arg1, int arg2, int arg3, int arg4, int arg5, class54 arg6, class41 arg7, int[][][] arg8, int arg9, int arg10) {
		int var11 = arg8[arg10][arg5][arg9];
		int var12 = arg8[arg10][arg5 + 1][arg9];
		int var13 = arg8[arg10][arg5 + 1][arg9 + 1];
		int var14 = arg8[arg10][arg5][arg9 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		class50 var16 = class50.method253(arg0);
		int var17 = (arg0 << 14) + (arg9 << 7) + arg5 + 0x40000000;
		if (!var16.field664) {
			var17 += Integer.MIN_VALUE;
		}

		byte var18 = (byte) ((arg3 << 6) + arg2);
		if (arg2 == 22) {
			class31 var19 = var16.method256(22, arg3, var11, var12, var13, var14, -1);
			arg1.method56(var17, arg9, var18, var19, arg5, var15, arg4);

			if (var16.field662 && var16.field664) {
				arg6.method275(arg9, arg5);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			class31 var20 = var16.method256(10, arg3, var11, var12, var13, var14, -1);
			if (var20 != null) {
				int var21 = 0;
				if (arg2 == 11) {
					var21 += 256;
				}

				int var22;
				int var23;
				if (arg3 == 1 || arg3 == 3) {
					var22 = var16.field661;
					var23 = var16.field660;
				} else {
					var22 = var16.field660;
					var23 = var16.field661;
				}

				arg1.method60(var20, var18, null, var15, arg5, var23, var22, arg4, var17, arg9, var21);
			}

			if (var16.field662) {
				arg6.method274(arg5, var16.field661, var16.field663, var16.field660, arg9, arg3);
			}

			if (var16.field668 != -1) {
				arg7.method217(new class40(2, arg4, arg0, true, class59.field843[var16.field668], arg9, arg5));
			}
		} else if (arg2 >= 12) {
			class31 var24 = var16.method256(arg2, arg3, var11, var12, var13, var14, -1);
			arg1.method60(var24, var18, null, var15, arg5, 1, 1, arg4, var17, arg9, 0);

			if (var16.field662) {
				arg6.method274(arg5, var16.field661, var16.field663, var16.field660, arg9, arg3);
			}

			if (var16.field668 != -1) {
				arg7.method217(new class40(2, arg4, arg0, true, class59.field843[var16.field668], arg9, arg5));
			}
		} else if (arg2 == 0) {
			class31 var25 = var16.method256(0, arg3, var11, var12, var13, var14, -1);
			arg1.method58(var17, 0, var15, var25, arg9, arg5, null, var18, field44[arg3], arg4);

			if (var16.field662) {
				arg6.method273(arg2, arg9, arg3, arg5, var16.field663);
			}
		} else if (arg2 == 1) {
			class31 var26 = var16.method256(1, arg3, var11, var12, var13, var14, -1);
			arg1.method58(var17, 0, var15, var26, arg9, arg5, null, var18, field45[arg3], arg4);

			if (var16.field662) {
				arg6.method273(arg2, arg9, arg3, arg5, var16.field663);
			}
		} else if (arg2 == 2) {
			int var27 = arg3 + 1 & 0x3;
			class31 var28 = var16.method256(2, arg3 + 4, var11, var12, var13, var14, -1);
			class31 var29 = var16.method256(2, var27, var11, var12, var13, var14, -1);
			arg1.method58(var17, field44[var27], var15, var28, arg9, arg5, var29, var18, field44[arg3], arg4);

			if (var16.field662) {
				arg6.method273(arg2, arg9, arg3, arg5, var16.field663);
			}
		} else if (arg2 == 3) {
			class31 var30 = var16.method256(3, arg3, var11, var12, var13, var14, -1);
			arg1.method58(var17, 0, var15, var30, arg9, arg5, null, var18, field45[arg3], arg4);

			if (var16.field662) {
				arg6.method273(arg2, arg9, arg3, arg5, var16.field663);
			}
		} else if (arg2 == 9) {
			class31 var31 = var16.method256(arg2, arg3, var11, var12, var13, var14, -1);
			arg1.method60(var31, var18, null, var15, arg5, 1, 1, arg4, var17, arg9, 0);

			if (var16.field662) {
				arg6.method274(arg5, var16.field661, var16.field663, var16.field660, arg9, arg3);
			}
		} else if (arg2 == 4) {
			class31 var32 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg1.method59(arg5, var18, var15, 0, var17, field44[arg3], arg3 * 512, 0, var32, arg9, arg4);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg4, arg0, true, class59.field843[var16.field668], arg9, arg5));
			}
		} else if (arg2 == 5) {
			int var33 = 16;
			int var34 = arg1.method74(arg4, arg5, arg9);
			if (var34 > 0) {
				var33 = class50.method253(var34 >> 14 & 0x7FFF).field669;
			}

			class31 var35 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg1.method59(arg5, var18, var15, field47[arg3] * var33, var17, field44[arg3], arg3 * 512, field46[arg3] * var33, var35, arg9, arg4);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg4, arg0, true, class59.field843[var16.field668], arg9, arg5));
			}
		} else if (arg2 == 6) {
			class31 var36 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg1.method59(arg5, var18, var15, 0, var17, 256, arg3, 0, var36, arg9, arg4);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg4, arg0, true, class59.field843[var16.field668], arg9, arg5));
			}
		} else if (arg2 == 7) {
			class31 var37 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg1.method59(arg5, var18, var15, 0, var17, 512, arg3, 0, var37, arg9, arg4);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg4, arg0, true, class59.field843[var16.field668], arg9, arg5));
			}
		} else if (arg2 == 8) {
			class31 var38 = var16.method256(4, 0, var11, var12, var13, var14, -1);
			arg1.method59(arg5, var18, var15, 0, var17, 768, arg3, 0, var38, arg9, arg4);

			if (var16.field668 != -1) {
				arg7.method217(new class40(1, arg4, arg0, true, class59.field843[var16.field668], arg9, arg5));
			}
		}
	}
}
