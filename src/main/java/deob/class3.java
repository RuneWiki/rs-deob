package deob;

@ObfuscatedName("c")
public final class class3 {

	@ObfuscatedName("c.b")
	public static boolean field25 = true;

	@ObfuscatedName("c.c")
	public static int field26;

	@ObfuscatedName("c.d")
	public static boolean field27;

	@ObfuscatedName("c.e")
	public int field28;

	@ObfuscatedName("c.f")
	public int field29;

	@ObfuscatedName("c.g")
	public int[][][] field30;

	@ObfuscatedName("c.h")
	public byte[][][] field31;

	@ObfuscatedName("c.i")
	public byte[][][] field32;

	@ObfuscatedName("c.j")
	public byte[][][] field33;

	@ObfuscatedName("c.k")
	public byte[][][] field34;

	@ObfuscatedName("c.l")
	public byte[][][] field35;

	@ObfuscatedName("c.m")
	public byte[][][] field36;

	@ObfuscatedName("c.n")
	public int[][] field37;

	@ObfuscatedName("c.o")
	public int[] field38;

	@ObfuscatedName("c.p")
	public int[] field39;

	@ObfuscatedName("c.q")
	public int[] field40;

	@ObfuscatedName("c.r")
	public int[] field41;

	@ObfuscatedName("c.s")
	public int[] field42;

	@ObfuscatedName("c.t")
	public int[][][] field43;

	@ObfuscatedName("c.u")
	public static final int[] field44 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.v")
	public static final int[] field45 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.w")
	public static final int[] field46 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.x")
	public static final int[] field47 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.y")
	public static int field48 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.z")
	public static int field49 = (int) (Math.random() * 33.0D) - 16;

	public class3(int arg0, byte[][][] arg1, int[][][] arg2, int arg3) {
		field28 = arg0;
		field29 = arg3;
		field30 = arg2;
		field31 = arg1;
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

	@ObfuscatedName("c.a(IIIBI)V")
	public final void method14(int arg0, int arg1, int arg2, int arg3) {
		byte var5 = 0;
		for (int var6 = 0; var6 < class58.field814; var6++) {
			if (class58.field815[var6].field820.equalsIgnoreCase("water")) {
				var5 = (byte) (var6 + 1);
				break;
			}
		}

		for (int var7 = arg3; var7 < arg1 + arg3; var7++) {
			for (int var8 = arg0; var8 < arg0 + arg2; var8++) {
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

	@ObfuscatedName("c.a(III[BII)V")
	public final void method15(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
		class37 var6 = new class37(arg3);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg2 + var8;
					int var11 = arg4 + var9;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						field31[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.method216();
							if (var12 == 0) {
								break;
							}

							if (var12 == 1) {
								break;
							}

							if (var12 <= 49) {
								field33[var7][var10][var11] = var6.method217();
								field34[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								field35[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								field31[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								field32[var7][var10][var11] = (byte) (var12 - 81);
							}
						}

						int var13 = var6.method216();
						if (var13 == 1) {
							var13 = 0;
						}

						if (var7 == 0) {
							field30[0][var10][var11] = -var13 * 8;
						} else {
							field30[var7][var10][var11] = field30[var7 - 1][var10][var11] - var13 * 8;
						}

						if (var7 == 0) {
							field30[0][var10][var11] = -method20(var10 + arg0 + 932731, var11 + 556238 + arg1) * 8;
						} else {
							field30[var7][var10][var11] = field30[var7 - 1][var10][var11] - 240;
						}
					} else {
						while (true) {
							int var14 = var6.method216();
							if (var14 == 0) {
								break;
							}

							if (var14 == 1) {
								break;
							}

							if (var14 <= 49) {
								var6.method216();
							}
						}

						var6.method216();
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(B[Lec;ILr;Lob;[BI)V")
	public final void method16(class57[] arg0, int arg1, class18 arg2, class41 arg3, byte[] arg4, int arg5) {
		class37 var7 = new class37(arg4);
		int var8 = -1;
		while (true) {
			int var9 = var7.method230();
			if (var9 == 0) {
				return;
			}

			var8 += var9;
			int var10 = 0;
			while (true) {
				int var11 = var7.method230();
				if (var11 == 0) {
					break;
				}

				var10 += var11 - 1;
				int var12 = var10 & 0x3F;
				int var13 = var10 >> 6 & 0x3F;
				int var14 = var10 >> 12;
				int var15 = var7.method216();
				int var16 = var15 >> 2;
				int var17 = var15 & 0x3;
				int var18 = arg5 + var13;
				int var19 = arg1 + var12;
				if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
					int var20 = var14;
					if ((field31[1][var18][var19] & 0x2) == 2) {
						var20 = var14 - 1;
					}

					class57 var21 = null;
					if (var20 >= 0) {
						var21 = arg0[var20];
					}

					method17(arg3, var21, var14, var16, var19, arg2, var18, var17, var8);
				}
			}
		}
	}

	@ObfuscatedName("c.a(Lob;Lec;IIZILr;III)V")
	public final void method17(class41 arg0, class57 arg1, int arg2, int arg3, int arg4, class18 arg5, int arg6, int arg7, int arg8) {
		if (field25) {
			if ((field31[arg2][arg6][arg4] & 0x10) != 0) {
				return;
			}

			if (method19(arg2, arg6, arg4) != field26) {
				return;
			}
		}

		int var10 = field30[arg2][arg6][arg4];
		int var11 = field30[arg2][arg6 + 1][arg4];
		int var12 = field30[arg2][arg6 + 1][arg4 + 1];
		int var13 = field30[arg2][arg6][arg4 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		class53 var15 = class53.method282(arg8);
		int var16 = (arg8 << 14) + (arg4 << 7) + arg6 + 0x40000000;
		if (!var15.field713) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg7 << 6) + arg3);
		if (arg3 == 22) {
			if (!field25 || var15.field713 || var15.field734) {
				class31 var18 = var15.method285(22, arg7, var10, var11, var12, var13, -1);
				arg5.method57(arg6, arg4, arg2, var14, var18, var16, var17);

				if (var15.field711 && var15.field713 && arg1 != null) {
					arg1.method305(arg6, arg4);
				}

				if (var15.field717 != -1) {
					arg0.method232(new class40(arg6, arg4, true, 3, arg8, arg2, class62.field901[var15.field717]));
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			class31 var19 = var15.method285(10, arg7, var10, var11, var12, var13, -1);
			if (var19 != null) {
				int var20 = 0;
				if (arg3 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg7 == 1 || arg7 == 3) {
					var21 = var15.field710;
					var22 = var15.field709;
				} else {
					var21 = var15.field709;
					var22 = var15.field710;
				}

				if (arg5.method61(var20, arg4, var22, var14, arg2, var16, arg6, var21, var19, var17, null) && var15.field726) {
					for (int var23 = 0; var23 <= var21; var23++) {
						for (int var24 = 0; var24 <= var22; var24++) {
							int var25 = var19.field426 / 4;
							if (var25 > 30) {
								var25 = 30;
							}

							if (var25 > field36[arg2][arg6 + var23][arg4 + var24]) {
								field36[arg2][arg6 + var23][arg4 + var24] = (byte) var25;
							}
						}
					}
				}
			}

			if (var15.field711 && arg1 != null) {
				arg1.method304(arg4, var15.field710, arg7, var15.field709, arg6, var15.field712);
			}

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 2, arg8, arg2, class62.field901[var15.field717]));
			}
		} else if (arg3 >= 12) {
			class31 var26 = var15.method285(arg3, arg7, var10, var11, var12, var13, -1);
			arg5.method61(0, arg4, 1, var14, arg2, var16, arg6, 1, var26, var17, null);

			if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg2 > 0) {
				field43[arg2][arg6][arg4] |= 0x924;
			}

			if (var15.field711 && arg1 != null) {
				arg1.method304(arg4, var15.field710, arg7, var15.field709, arg6, var15.field712);
			}

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 2, arg8, arg2, class62.field901[var15.field717]));
			}
		} else if (arg3 == 0) {
			class31 var27 = var15.method285(0, arg7, var10, var11, var12, var13, -1);
			arg5.method59(var16, null, var14, 0, arg2, arg6, var27, var17, field44[arg7], arg4);

			if (arg7 == 0) {
				if (var15.field726) {
					field36[arg2][arg6][arg4] = 50;
					field36[arg2][arg6][arg4 + 1] = 50;
				}

				if (var15.field716) {
					field43[arg2][arg6][arg4] |= 0x249;
				}
			} else if (arg7 == 1) {
				if (var15.field726) {
					field36[arg2][arg6][arg4 + 1] = 50;
					field36[arg2][arg6 + 1][arg4 + 1] = 50;
				}

				if (var15.field716) {
					field43[arg2][arg6][arg4 + 1] |= 0x492;
				}
			} else if (arg7 == 2) {
				if (var15.field726) {
					field36[arg2][arg6 + 1][arg4] = 50;
					field36[arg2][arg6 + 1][arg4 + 1] = 50;
				}

				if (var15.field716) {
					field43[arg2][arg6 + 1][arg4] |= 0x249;
				}
			} else if (arg7 == 3) {
				if (var15.field726) {
					field36[arg2][arg6][arg4] = 50;
					field36[arg2][arg6 + 1][arg4] = 50;
				}

				if (var15.field716) {
					field43[arg2][arg6][arg4] |= 0x492;
				}
			}

			if (var15.field711 && arg1 != null) {
				arg1.method303(arg7, arg4, arg6, arg3, var15.field712);
			}

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 0, arg8, arg2, class62.field901[var15.field717]));
			}

			if (var15.field718 != 16) {
				arg5.method68(arg4, var15.field718, arg6, arg2);
			}
		} else if (arg3 == 1) {
			class31 var28 = var15.method285(1, arg7, var10, var11, var12, var13, -1);
			arg5.method59(var16, null, var14, 0, arg2, arg6, var28, var17, field45[arg7], arg4);

			if (var15.field726) {
				if (arg7 == 0) {
					field36[arg2][arg6][arg4 + 1] = 50;
				} else if (arg7 == 1) {
					field36[arg2][arg6 + 1][arg4 + 1] = 50;
				} else if (arg7 == 2) {
					field36[arg2][arg6 + 1][arg4] = 50;
				} else if (arg7 == 3) {
					field36[arg2][arg6][arg4] = 50;
				}
			}

			if (var15.field711 && arg1 != null) {
				arg1.method303(arg7, arg4, arg6, arg3, var15.field712);
			}

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 0, arg8, arg2, class62.field901[var15.field717]));
			}
		} else if (arg3 == 2) {
			int var29 = arg7 + 1 & 0x3;
			class31 var30 = var15.method285(2, arg7 + 4, var10, var11, var12, var13, -1);
			class31 var31 = var15.method285(2, var29, var10, var11, var12, var13, -1);
			arg5.method59(var16, var31, var14, field44[var29], arg2, arg6, var30, var17, field44[arg7], arg4);

			if (var15.field716) {
				if (arg7 == 0) {
					field43[arg2][arg6][arg4] |= 0x249;
					field43[arg2][arg6][arg4 + 1] |= 0x492;
				} else if (arg7 == 1) {
					field43[arg2][arg6][arg4 + 1] |= 0x492;
					field43[arg2][arg6 + 1][arg4] |= 0x249;
				} else if (arg7 == 2) {
					field43[arg2][arg6 + 1][arg4] |= 0x249;
					field43[arg2][arg6][arg4] |= 0x492;
				} else if (arg7 == 3) {
					field43[arg2][arg6][arg4] |= 0x492;
					field43[arg2][arg6][arg4] |= 0x249;
				}
			}

			if (var15.field711 && arg1 != null) {
				arg1.method303(arg7, arg4, arg6, arg3, var15.field712);
			}

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 0, arg8, arg2, class62.field901[var15.field717]));
			}

			if (var15.field718 != 16) {
				arg5.method68(arg4, var15.field718, arg6, arg2);
			}
		} else if (arg3 == 3) {
			class31 var32 = var15.method285(3, arg7, var10, var11, var12, var13, -1);
			arg5.method59(var16, null, var14, 0, arg2, arg6, var32, var17, field45[arg7], arg4);

			if (var15.field726) {
				if (arg7 == 0) {
					field36[arg2][arg6][arg4 + 1] = 50;
				} else if (arg7 == 1) {
					field36[arg2][arg6 + 1][arg4 + 1] = 50;
				} else if (arg7 == 2) {
					field36[arg2][arg6 + 1][arg4] = 50;
				} else if (arg7 == 3) {
					field36[arg2][arg6][arg4] = 50;
				}
			}

			if (var15.field711 && arg1 != null) {
				arg1.method303(arg7, arg4, arg6, arg3, var15.field712);
			}

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 0, arg8, arg2, class62.field901[var15.field717]));
			}
		} else if (arg3 == 9) {
			class31 var33 = var15.method285(arg3, arg7, var10, var11, var12, var13, -1);
			arg5.method61(0, arg4, 1, var14, arg2, var16, arg6, 1, var33, var17, null);

			if (var15.field711 && arg1 != null) {
				arg1.method304(arg4, var15.field710, arg7, var15.field709, arg6, var15.field712);
			}

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 2, arg8, arg2, class62.field901[var15.field717]));
			}
		} else if (arg3 == 4) {
			class31 var34 = var15.method285(4, 0, var10, var11, var12, var13, -1);
			arg5.method60(0, arg6, arg7 * 512, arg2, var34, 0, var16, arg4, var14, field44[arg7], var17);

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 1, arg8, arg2, class62.field901[var15.field717]));
			}
		} else if (arg3 == 5) {
			int var35 = 16;
			int var36 = arg5.method78(arg2, arg6, arg4);
			if (var36 > 0) {
				var35 = class53.method282(var36 >> 14 & 0x7FFF).field718;
			}

			class31 var37 = var15.method285(4, 0, var10, var11, var12, var13, -1);
			arg5.method60(field47[arg7] * var35, arg6, arg7 * 512, arg2, var37, field46[arg7] * var35, var16, arg4, var14, field44[arg7], var17);

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 1, arg8, arg2, class62.field901[var15.field717]));
			}
		} else if (arg3 == 6) {
			class31 var38 = var15.method285(4, 0, var10, var11, var12, var13, -1);
			arg5.method60(0, arg6, arg7, arg2, var38, 0, var16, arg4, var14, 256, var17);

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 1, arg8, arg2, class62.field901[var15.field717]));
			}
		} else if (arg3 == 7) {
			class31 var39 = var15.method285(4, 0, var10, var11, var12, var13, -1);
			arg5.method60(0, arg6, arg7, arg2, var39, 0, var16, arg4, var14, 512, var17);

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 1, arg8, arg2, class62.field901[var15.field717]));
			}
		} else if (arg3 == 8) {
			class31 var40 = var15.method285(4, 0, var10, var11, var12, var13, -1);
			arg5.method60(0, arg6, arg7, arg2, var40, 0, var16, arg4, var14, 768, var17);

			if (var15.field717 != -1) {
				arg0.method232(new class40(arg6, arg4, true, 1, arg8, arg2, class62.field901[var15.field717]));
			}
		}
	}

	@ObfuscatedName("c.a(Lr;[Lec;I)V")
	public final void method18(class18 arg0, class57[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field31[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field31[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method305(var4, var5);
						}
					}
				}
			}
		}

		field48 += (int) (Math.random() * 5.0D) - 2;
		if (field48 < -8) {
			field48 = -8;
		}

		if (field48 > 8) {
			field48 = 8;
		}

		field49 += (int) (Math.random() * 5.0D) - 2;
		if (field49 < -16) {
			field49 = -16;
		}

		if (field49 > 16) {
			field49 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field36[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field29 - 1; var16++) {
				for (int var17 = 1; var17 < field28 - 1; var17++) {
					int var18 = field30[var7][var17 + 1][var16] - field30[var7][var17 - 1][var16];
					int var19 = field30[var7][var17][var16 + 1] - field30[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field37[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field29; var26++) {
				field38[var26] = 0;
				field39[var26] = 0;
				field40[var26] = 0;
				field41[var26] = 0;
				field42[var26] = 0;
			}

			for (int var27 = -5; var27 < field28 + 5; var27++) {
				for (int var28 = 0; var28 < field29; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field28) {
						int var30 = field32[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							class58 var31 = class58.field815[var30 - 1];
							field38[var28] += var31.field824;
							field39[var28] += var31.field822;
							field40[var28] += var31.field823;
							field41[var28] += var31.field825;
							field42[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field28) {
						int var33 = field32[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							class58 var34 = class58.field815[var33 - 1];
							field38[var28] -= var34.field824;
							field39[var28] -= var34.field822;
							field40[var28] -= var34.field823;
							field41[var28] -= var34.field825;
							field42[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field28 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field29 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field29) {
							var35 += field38[var41];
							var36 += field39[var41];
							var37 += field40[var41];
							var38 += field41[var41];
							var39 += field42[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field29) {
							var35 -= field38[var42];
							var36 -= field39[var42];
							var37 -= field40[var42];
							var38 -= field41[var42];
							var39 -= field42[var42];
						}

						if (var40 >= 1 && var40 < field29 - 1 && (!field25 || (field31[var7][var27][var40] & 0x10) == 0 && method19(var7, var27, var40) == field26)) {
							int var43 = field32[var7][var27][var40] & 0xFF;
							int var44 = field33[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field30[var7][var27][var40];
								int var46 = field30[var7][var27 + 1][var40];
								int var47 = field30[var7][var27 + 1][var40 + 1];
								int var48 = field30[var7][var27][var40 + 1];
								int var49 = field37[var27][var40];
								int var50 = field37[var27 + 1][var40];
								int var51 = field37[var27 + 1][var40 + 1];
								int var52 = field37[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method27(var55, var56, var57);
									var55 = field48 + var55 & 0xFF;
									var57 += field49;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method27(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field34[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !class58.field815[var44 - 1].field819) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field43[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = class33.field515[method25(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method56(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method25(var53, var49), method25(var53, var50), method25(var53, var51), method25(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field34[var7][var27][var40] + 1;
									byte var61 = field35[var7][var27][var40];
									class58 var62 = class58.field815[var44 - 1];
									int var63 = var62.field817;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = class33.method160(var63);
										var65 = -1;
									} else if (var62.field816 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method27(var62.field821, var62.field822, var62.field823);
										var64 = class33.field515[method26(var62.field826, 96)];
									}

									arg0.method56(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method25(var53, var49), method25(var53, var50), method25(var53, var51), method25(var53, var52), method26(var65, var49), method26(var65, var50), method26(var65, var51), method26(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field29 - 1; var66++) {
				for (int var67 = 1; var67 < field28 - 1; var67++) {
					arg0.method55(var7, var67, var66, method19(var7, var67, var66));
				}
			}
		}

		if (!field27) {
			arg0.method83(-10, 64, 768, -50, -50);
		}

		for (int var68 = 0; var68 < field28; var68++) {
			for (int var69 = 0; var69 < field29; var69++) {
				if ((field31[1][var68][var69] & 0x2) == 2) {
					arg0.method53(var69, var68);
				}
			}
		}

		if (!field27) {
			int var70 = 1;
			int var71 = 2;
			int var72 = 4;
			for (int var73 = 0; var73 < 4; var73++) {
				if (var73 > 0) {
					var70 <<= 3;
					var71 <<= 3;
					var72 <<= 3;
				}

				for (int var74 = 0; var74 <= var73; var74++) {
					for (int var75 = 0; var75 <= field29; var75++) {
						for (int var76 = 0; var76 <= field28; var76++) {
							if ((field43[var74][var76][var75] & var70) != 0) {
								int var77 = var75;
								int var78 = var75;
								int var79 = var74;
								int var80 = var74;

								while (var77 > 0 && (field43[var74][var76][var77 - 1] & var70) != 0) {
									var77--;
								}

								while (var78 < field29 && (field43[var74][var76][var78 + 1] & var70) != 0) {
									var78++;
								}

								label329: while (var79 > 0) {
									for (int var81 = var77; var81 <= var78; var81++) {
										if ((field43[var79 - 1][var76][var81] & var70) == 0) {
											break label329;
										}
									}

									var79--;
								}

								label318: while (var80 < var73) {
									for (int var82 = var77; var82 <= var78; var82++) {
										if ((field43[var80 + 1][var76][var82] & var70) == 0) {
											break label318;
										}
									}

									var80++;
								}

								int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
								if (var83 >= 8) {
									short var84 = 240;
									int var85 = field30[var80][var76][var77] - var84;
									int var86 = field30[var79][var76][var77];
									class18.method54(var77 * 128, var73, 1, var76 * 128, var76 * 128, var85, var86, var78 * 128 + 128);

									for (int var87 = var79; var87 <= var80; var87++) {
										for (int var88 = var77; var88 <= var78; var88++) {
											field43[var87][var76][var88] &= ~var70;
										}
									}
								}
							}

							if ((field43[var74][var76][var75] & var71) != 0) {
								int var89 = var76;
								int var90 = var76;
								int var91 = var74;
								int var92 = var74;

								while (var89 > 0 && (field43[var74][var89 - 1][var75] & var71) != 0) {
									var89--;
								}

								while (var90 < field28 && (field43[var74][var90 + 1][var75] & var71) != 0) {
									var90++;
								}

								label382: while (var91 > 0) {
									for (int var93 = var89; var93 <= var90; var93++) {
										if ((field43[var91 - 1][var93][var75] & var71) == 0) {
											break label382;
										}
									}

									var91--;
								}

								label371: while (var92 < var73) {
									for (int var94 = var89; var94 <= var90; var94++) {
										if ((field43[var92 + 1][var94][var75] & var71) == 0) {
											break label371;
										}
									}

									var92++;
								}

								int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
								if (var95 >= 8) {
									short var96 = 240;
									int var97 = field30[var92][var89][var75] - var96;
									int var98 = field30[var91][var89][var75];
									class18.method54(var75 * 128, var73, 2, var90 * 128 + 128, var89 * 128, var97, var98, var75 * 128);

									for (int var99 = var91; var99 <= var92; var99++) {
										for (int var100 = var89; var100 <= var90; var100++) {
											field43[var99][var100][var75] &= ~var71;
										}
									}
								}
							}

							if ((field43[var74][var76][var75] & var72) != 0) {
								int var101 = var76;
								int var102 = var76;
								int var103 = var75;
								int var104 = var75;

								while (var103 > 0 && (field43[var74][var76][var103 - 1] & var72) != 0) {
									var103--;
								}

								while (var104 < field29 && (field43[var74][var76][var104 + 1] & var72) != 0) {
									var104++;
								}

								label435: while (var101 > 0) {
									for (int var105 = var103; var105 <= var104; var105++) {
										if ((field43[var74][var101 - 1][var105] & var72) == 0) {
											break label435;
										}
									}

									var101--;
								}

								label424: while (var102 < field28) {
									for (int var106 = var103; var106 <= var104; var106++) {
										if ((field43[var74][var102 + 1][var106] & var72) == 0) {
											break label424;
										}
									}

									var102++;
								}

								if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
									int var107 = field30[var74][var101][var103];
									class18.method54(var103 * 128, var73, 4, var102 * 128 + 128, var101 * 128, var107, var107, var104 * 128 + 128);

									for (int var108 = var101; var108 <= var102; var108++) {
										for (int var109 = var103; var109 <= var104; var109++) {
											field43[var74][var108][var109] &= ~var72;
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

	@ObfuscatedName("c.a(IIII)I")
	public int method19(int arg0, int arg1, int arg2) {
		if ((field31[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field31[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("c.a(II)I")
	public static final int method20(int arg0, int arg1) {
		int var2 = method21(arg0 + 45365, arg1 + 91923, 4) + (method21(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method21(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("c.a(III)I")
	public static final int method21(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method23(var3, var5);
		int var8 = method23(var3 + 1, var5);
		int var9 = method23(var3, var5 + 1);
		int var10 = method23(var3 + 1, var5 + 1);
		int var11 = method22(var7, var8, var4, arg2);
		int var12 = method22(var9, var10, var4, arg2);
		return method22(var11, var12, var6, arg2);
	}

	@ObfuscatedName("c.b(IIII)I")
	public static final int method22(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - class33.field504[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static final int method23(int arg0, int arg1) {
		int var2 = method24(arg0 - 1, arg1 - 1) + method24(arg0 + 1, arg1 - 1) + method24(arg0 - 1, arg1 + 1) + method24(arg0 + 1, arg1 + 1);
		int var3 = method24(arg0 - 1, arg1) + method24(arg0 + 1, arg1) + method24(arg0, arg1 - 1) + method24(arg0, arg1 + 1);
		int var4 = method24(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("c.c(II)I")
	public static final int method24(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static final int method25(int arg0, int arg1) {
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
	public final int method26(int arg0, int arg1) {
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
	public final int method27(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("c.a(IILob;IIZILec;Lr;II[[[I)V")
	public static final void method28(int arg0, int arg1, class41 arg2, int arg3, int arg4, int arg5, class57 arg6, class18 arg7, int arg8, int arg9, int[][][] arg10) {
		int var11 = arg10[arg8][arg4][arg5];
		int var12 = arg10[arg8][arg4 + 1][arg5];
		int var13 = arg10[arg8][arg4 + 1][arg5 + 1];
		int var14 = arg10[arg8][arg4][arg5 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		class53 var16 = class53.method282(arg1);
		int var17 = (arg1 << 14) + (arg5 << 7) + arg4 + 0x40000000;
		if (!var16.field713) {
			var17 += Integer.MIN_VALUE;
		}

		byte var18 = (byte) ((arg9 << 6) + arg0);
		if (arg0 == 22) {
			class31 var19 = var16.method285(22, arg9, var11, var12, var13, var14, -1);
			arg7.method57(arg4, arg5, arg3, var15, var19, var17, var18);

			if (var16.field711 && var16.field713) {
				arg6.method305(arg4, arg5);
			}

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 3, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 10 || arg0 == 11) {
			class31 var20 = var16.method285(10, arg9, var11, var12, var13, var14, -1);
			if (var20 != null) {
				int var21 = 0;
				if (arg0 == 11) {
					var21 += 256;
				}

				int var22;
				int var23;
				if (arg9 == 1 || arg9 == 3) {
					var22 = var16.field710;
					var23 = var16.field709;
				} else {
					var22 = var16.field709;
					var23 = var16.field710;
				}

				arg7.method61(var21, arg5, var23, var15, arg3, var17, arg4, var22, var20, var18, null);
			}

			if (var16.field711) {
				arg6.method304(arg5, var16.field710, arg9, var16.field709, arg4, var16.field712);
			}

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 2, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 >= 12) {
			class31 var24 = var16.method285(arg0, arg9, var11, var12, var13, var14, -1);
			arg7.method61(0, arg5, 1, var15, arg3, var17, arg4, 1, var24, var18, null);

			if (var16.field711) {
				arg6.method304(arg5, var16.field710, arg9, var16.field709, arg4, var16.field712);
			}

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 2, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 0) {
			class31 var25 = var16.method285(0, arg9, var11, var12, var13, var14, -1);
			arg7.method59(var17, null, var15, 0, arg3, arg4, var25, var18, field44[arg9], arg5);

			if (var16.field711) {
				arg6.method303(arg9, arg5, arg4, arg0, var16.field712);
			}

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 0, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 1) {
			class31 var26 = var16.method285(1, arg9, var11, var12, var13, var14, -1);
			arg7.method59(var17, null, var15, 0, arg3, arg4, var26, var18, field45[arg9], arg5);

			if (var16.field711) {
				arg6.method303(arg9, arg5, arg4, arg0, var16.field712);
			}

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 0, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 2) {
			int var27 = arg9 + 1 & 0x3;
			class31 var28 = var16.method285(2, arg9 + 4, var11, var12, var13, var14, -1);
			class31 var29 = var16.method285(2, var27, var11, var12, var13, var14, -1);
			arg7.method59(var17, var29, var15, field44[var27], arg3, arg4, var28, var18, field44[arg9], arg5);

			if (var16.field711) {
				arg6.method303(arg9, arg5, arg4, arg0, var16.field712);
			}

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 0, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 3) {
			class31 var30 = var16.method285(3, arg9, var11, var12, var13, var14, -1);
			arg7.method59(var17, null, var15, 0, arg3, arg4, var30, var18, field45[arg9], arg5);

			if (var16.field711) {
				arg6.method303(arg9, arg5, arg4, arg0, var16.field712);
			}

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 0, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 9) {
			class31 var31 = var16.method285(arg0, arg9, var11, var12, var13, var14, -1);
			arg7.method61(0, arg5, 1, var15, arg3, var17, arg4, 1, var31, var18, null);

			if (var16.field711) {
				arg6.method304(arg5, var16.field710, arg9, var16.field709, arg4, var16.field712);
			}

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 2, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 4) {
			class31 var32 = var16.method285(4, 0, var11, var12, var13, var14, -1);
			arg7.method60(0, arg4, arg9 * 512, arg3, var32, 0, var17, arg5, var15, field44[arg9], var18);

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 1, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 5) {
			int var33 = 16;
			int var34 = arg7.method78(arg3, arg4, arg5);
			if (var34 > 0) {
				var33 = class53.method282(var34 >> 14 & 0x7FFF).field718;
			}

			class31 var35 = var16.method285(4, 0, var11, var12, var13, var14, -1);
			arg7.method60(field47[arg9] * var33, arg4, arg9 * 512, arg3, var35, field46[arg9] * var33, var17, arg5, var15, field44[arg9], var18);

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 1, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 6) {
			class31 var36 = var16.method285(4, 0, var11, var12, var13, var14, -1);
			arg7.method60(0, arg4, arg9, arg3, var36, 0, var17, arg5, var15, 256, var18);

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 1, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 7) {
			class31 var37 = var16.method285(4, 0, var11, var12, var13, var14, -1);
			arg7.method60(0, arg4, arg9, arg3, var37, 0, var17, arg5, var15, 512, var18);

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 1, arg1, arg3, class62.field901[var16.field717]));
			}
		} else if (arg0 == 8) {
			class31 var38 = var16.method285(4, 0, var11, var12, var13, var14, -1);
			arg7.method60(0, arg4, arg9, arg3, var38, 0, var17, arg5, var15, 768, var18);

			if (var16.field717 != -1) {
				arg2.method232(new class40(arg4, arg5, true, 1, arg1, arg3, class62.field901[var16.field717]));
			}
		}
	}
}
