package deob;

@ObfuscatedName("c")
public final class class3 {

	@ObfuscatedName("c.f")
	public static boolean field25 = true;

	@ObfuscatedName("c.g")
	public static int field26;

	@ObfuscatedName("c.h")
	public static boolean field27;

	@ObfuscatedName("c.i")
	public int field28;

	@ObfuscatedName("c.j")
	public int field29;

	@ObfuscatedName("c.k")
	public int[][][] field30;

	@ObfuscatedName("c.l")
	public byte[][][] field31;

	@ObfuscatedName("c.m")
	public byte[][][] field32;

	@ObfuscatedName("c.n")
	public byte[][][] field33;

	@ObfuscatedName("c.o")
	public byte[][][] field34;

	@ObfuscatedName("c.p")
	public byte[][][] field35;

	@ObfuscatedName("c.q")
	public byte[][][] field36;

	@ObfuscatedName("c.r")
	public int[][] field37;

	@ObfuscatedName("c.s")
	public int[] field38;

	@ObfuscatedName("c.t")
	public int[] field39;

	@ObfuscatedName("c.u")
	public int[] field40;

	@ObfuscatedName("c.v")
	public int[] field41;

	@ObfuscatedName("c.w")
	public int[] field42;

	@ObfuscatedName("c.x")
	public int[][][] field43;

	@ObfuscatedName("c.y")
	public static final int[] field44 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.z")
	public static final int[] field45 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.A")
	public static final int[] field46 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.B")
	public static final int[] field47 = new int[] { 0, -1, 0, 1 };

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

	@ObfuscatedName("c.a(IIIII)V")
	public final void method14(int arg0, int arg1, int arg2, int arg3) {
		byte var5 = 0;
		for (int var6 = 0; var6 < class58.field808; var6++) {
			if (class58.field809[var6].field814.equalsIgnoreCase("water")) {
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

	@ObfuscatedName("c.a(B[BIIII)V")
	public final void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
		class37 var6 = new class37(arg0);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg4 + var8;
					int var11 = arg1 + var9;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						field31[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.method208();
							if (var12 == 0) {
								break;
							}

							if (var12 == 1) {
								break;
							}

							if (var12 <= 49) {
								field33[var7][var10][var11] = var6.method209();
								field34[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								field35[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								field31[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								field32[var7][var10][var11] = (byte) (var12 - 81);
							}
						}

						int var13 = var6.method208();
						if (var13 == 1) {
							var13 = 0;
						}

						if (var7 == 0) {
							field30[0][var10][var11] = -var13 * 8;
						} else {
							field30[var7][var10][var11] = field30[var7 - 1][var10][var11] - var13 * 8;
						}

						if (var7 == 0) {
							field30[0][var10][var11] = -method20(var10 + arg3 + 932731, var11 + 556238 + arg2) * 8;
						} else {
							field30[var7][var10][var11] = field30[var7 - 1][var10][var11] - 240;
						}
					} else {
						while (true) {
							int var14 = var6.method208();
							if (var14 == 0) {
								break;
							}

							if (var14 == 1) {
								break;
							}

							if (var14 <= 49) {
								var6.method208();
							}
						}

						var6.method208();
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(IB[Lec;[BLob;Lr;I)V")
	public final void method16(int arg0, class57[] arg1, byte[] arg2, class41 arg3, class18 arg4, int arg5) {
		class37 var7 = new class37(arg2);
		int var8 = -1;
		while (true) {
			int var9 = var7.method222();
			if (var9 == 0) {
				return;
			}

			var8 += var9;
			int var10 = 0;
			while (true) {
				int var11 = var7.method222();
				if (var11 == 0) {
					break;
				}

				var10 += var11 - 1;
				int var12 = var10 & 0x3F;
				int var13 = var10 >> 6 & 0x3F;
				int var14 = var10 >> 12;
				int var15 = var7.method208();
				int var16 = var15 >> 2;
				int var17 = var15 & 0x3;
				int var18 = arg0 + var13;
				int var19 = arg5 + var12;
				if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
					int var20 = var14;
					if ((field31[1][var18][var19] & 0x2) == 2) {
						var20 = var14 - 1;
					}

					class57 var21 = null;
					if (var20 >= 0) {
						var21 = arg1[var20];
					}

					method17(var16, var8, arg3, var18, var19, arg4, var17, var14, var21);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IILob;IILr;IIILec;)V")
	public final void method17(int arg0, int arg1, class41 arg2, int arg3, int arg4, class18 arg5, int arg6, int arg7, class57 arg8) {
		if (field25) {
			if ((field31[arg7][arg3][arg4] & 0x10) != 0) {
				return;
			}

			if (method19(arg7, arg3, arg4) != field26) {
				return;
			}
		}

		int var10 = field30[arg7][arg3][arg4];
		int var11 = field30[arg7][arg3 + 1][arg4];
		int var12 = field30[arg7][arg3 + 1][arg4 + 1];
		int var13 = field30[arg7][arg3][arg4 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		class53 var15 = class53.method274(arg1);
		int var16 = (arg1 << 14) + (arg4 << 7) + arg3 + 0x40000000;
		if (!var15.field709) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg6 << 6) + arg0);
		if (arg0 == 22) {
			if (!field25 || var15.field709 || var15.field730) {
				class31 var18 = var15.method277(22, arg6, var10, var11, var12, var13, -1);
				arg5.method56(var14, var16, arg4, var17, arg3, var18, arg7);

				if (var15.field707 && var15.field709 && arg8 != null) {
					arg8.method297(arg4, arg3);
				}

				if (var15.field713 != -1) {
					arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 3, true));
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			class31 var19 = var15.method277(10, arg6, var10, var11, var12, var13, -1);
			if (var19 != null) {
				int var20 = 0;
				if (arg0 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg6 == 1 || arg6 == 3) {
					var21 = var15.field706;
					var22 = var15.field705;
				} else {
					var21 = var15.field705;
					var22 = var15.field706;
				}

				if (arg5.method60(var17, arg4, var20, var21, var14, var22, arg3, var16, var19, null, arg7) && var15.field722) {
					for (int var23 = 0; var23 <= var21; var23++) {
						for (int var24 = 0; var24 <= var22; var24++) {
							int var25 = var19.field424 / 4;
							if (var25 > 30) {
								var25 = 30;
							}

							if (var25 > field36[arg7][arg3 + var23][arg4 + var24]) {
								field36[arg7][arg3 + var23][arg4 + var24] = (byte) var25;
							}
						}
					}
				}
			}

			if (var15.field707 && arg8 != null) {
				arg8.method296(arg4, var15.field705, var15.field708, arg3, var15.field706, arg6);
			}

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 2, true));
			}
		} else if (arg0 >= 12) {
			class31 var26 = var15.method277(arg0, arg6, var10, var11, var12, var13, -1);
			arg5.method60(var17, arg4, 0, 1, var14, 1, arg3, var16, var26, null, arg7);

			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg7 > 0) {
				field43[arg7][arg3][arg4] |= 0x924;
			}

			if (var15.field707 && arg8 != null) {
				arg8.method296(arg4, var15.field705, var15.field708, arg3, var15.field706, arg6);
			}

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 2, true));
			}
		} else if (arg0 == 0) {
			class31 var27 = var15.method277(0, arg6, var10, var11, var12, var13, -1);
			arg5.method58(var16, 0, null, var17, field44[arg6], arg4, var27, var14, arg7, arg3);

			if (arg6 == 0) {
				if (var15.field722) {
					field36[arg7][arg3][arg4] = 50;
					field36[arg7][arg3][arg4 + 1] = 50;
				}

				if (var15.field712) {
					field43[arg7][arg3][arg4] |= 0x249;
				}
			} else if (arg6 == 1) {
				if (var15.field722) {
					field36[arg7][arg3][arg4 + 1] = 50;
					field36[arg7][arg3 + 1][arg4 + 1] = 50;
				}

				if (var15.field712) {
					field43[arg7][arg3][arg4 + 1] |= 0x492;
				}
			} else if (arg6 == 2) {
				if (var15.field722) {
					field36[arg7][arg3 + 1][arg4] = 50;
					field36[arg7][arg3 + 1][arg4 + 1] = 50;
				}

				if (var15.field712) {
					field43[arg7][arg3 + 1][arg4] |= 0x249;
				}
			} else if (arg6 == 3) {
				if (var15.field722) {
					field36[arg7][arg3][arg4] = 50;
					field36[arg7][arg3 + 1][arg4] = 50;
				}

				if (var15.field712) {
					field43[arg7][arg3][arg4] |= 0x492;
				}
			}

			if (var15.field707 && arg8 != null) {
				arg8.method295(arg6, arg4, arg3, var15.field708, arg0);
			}

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 0, true));
			}
		} else if (arg0 == 1) {
			class31 var28 = var15.method277(1, arg6, var10, var11, var12, var13, -1);
			arg5.method58(var16, 0, null, var17, field45[arg6], arg4, var28, var14, arg7, arg3);

			if (var15.field722) {
				if (arg6 == 0) {
					field36[arg7][arg3][arg4 + 1] = 50;
				} else if (arg6 == 1) {
					field36[arg7][arg3 + 1][arg4 + 1] = 50;
				} else if (arg6 == 2) {
					field36[arg7][arg3 + 1][arg4] = 50;
				} else if (arg6 == 3) {
					field36[arg7][arg3][arg4] = 50;
				}
			}

			if (var15.field707 && arg8 != null) {
				arg8.method295(arg6, arg4, arg3, var15.field708, arg0);
			}

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 0, true));
			}
		} else if (arg0 == 2) {
			int var29 = arg6 + 1 & 0x3;
			class31 var30 = var15.method277(2, arg6 + 4, var10, var11, var12, var13, -1);
			class31 var31 = var15.method277(2, var29, var10, var11, var12, var13, -1);
			arg5.method58(var16, field44[var29], var31, var17, field44[arg6], arg4, var30, var14, arg7, arg3);

			if (var15.field712) {
				if (arg6 == 0) {
					field43[arg7][arg3][arg4] |= 0x249;
					field43[arg7][arg3][arg4 + 1] |= 0x492;
				} else if (arg6 == 1) {
					field43[arg7][arg3][arg4 + 1] |= 0x492;
					field43[arg7][arg3 + 1][arg4] |= 0x249;
				} else if (arg6 == 2) {
					field43[arg7][arg3 + 1][arg4] |= 0x249;
					field43[arg7][arg3][arg4] |= 0x492;
				} else if (arg6 == 3) {
					field43[arg7][arg3][arg4] |= 0x492;
					field43[arg7][arg3][arg4] |= 0x249;
				}
			}

			if (var15.field707 && arg8 != null) {
				arg8.method295(arg6, arg4, arg3, var15.field708, arg0);
			}

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 0, true));
			}
		} else if (arg0 == 3) {
			class31 var32 = var15.method277(3, arg6, var10, var11, var12, var13, -1);
			arg5.method58(var16, 0, null, var17, field45[arg6], arg4, var32, var14, arg7, arg3);

			if (var15.field722) {
				if (arg6 == 0) {
					field36[arg7][arg3][arg4 + 1] = 50;
				} else if (arg6 == 1) {
					field36[arg7][arg3 + 1][arg4 + 1] = 50;
				} else if (arg6 == 2) {
					field36[arg7][arg3 + 1][arg4] = 50;
				} else if (arg6 == 3) {
					field36[arg7][arg3][arg4] = 50;
				}
			}

			if (var15.field707 && arg8 != null) {
				arg8.method295(arg6, arg4, arg3, var15.field708, arg0);
			}

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 0, true));
			}
		} else if (arg0 == 9) {
			class31 var33 = var15.method277(arg0, arg6, var10, var11, var12, var13, -1);
			arg5.method60(var17, arg4, 0, 1, var14, 1, arg3, var16, var33, null, arg7);

			if (var15.field707 && arg8 != null) {
				arg8.method296(arg4, var15.field705, var15.field708, arg3, var15.field706, arg6);
			}

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 2, true));
			}
		} else if (arg0 == 4) {
			class31 var34 = var15.method277(4, 0, var10, var11, var12, var13, -1);
			arg5.method59(0, var17, field44[arg6], arg6 * 512, var34, var14, arg4, arg3, 0, arg7, var16);

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 1, true));
			}
		} else if (arg0 == 5) {
			int var35 = 16;
			int var36 = arg5.method76(arg7, arg3, arg4);
			if (var36 > 0) {
				var35 = class53.method274(var36 >> 14 & 0x7FFF).field714;
			}

			class31 var37 = var15.method277(4, 0, var10, var11, var12, var13, -1);
			arg5.method59(field46[arg6] * var35, var17, field44[arg6], arg6 * 512, var37, var14, arg4, arg3, field47[arg6] * var35, arg7, var16);

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 1, true));
			}
		} else if (arg0 == 6) {
			class31 var38 = var15.method277(4, 0, var10, var11, var12, var13, -1);
			arg5.method59(0, var17, 256, arg6, var38, var14, arg4, arg3, 0, arg7, var16);

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 1, true));
			}
		} else if (arg0 == 7) {
			class31 var39 = var15.method277(4, 0, var10, var11, var12, var13, -1);
			arg5.method59(0, var17, 512, arg6, var39, var14, arg4, arg3, 0, arg7, var16);

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 1, true));
			}
		} else if (arg0 == 8) {
			class31 var40 = var15.method277(4, 0, var10, var11, var12, var13, -1);
			arg5.method59(0, var17, 768, arg6, var40, var14, arg4, arg3, 0, arg7, var16);

			if (var15.field713 != -1) {
				arg2.method224(new class40(arg1, arg4, arg7, class62.field893[var15.field713], arg3, 1, true));
			}
		}
	}

	@ObfuscatedName("c.a(Lr;[Lec;Z)V")
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
							arg1[var6].method297(var5, var4);
						}
					}
				}
			}
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
							class58 var31 = class58.field809[var30 - 1];
							field38[var28] += var31.field818;
							field39[var28] += var31.field816;
							field40[var28] += var31.field817;
							field41[var28] += var31.field819;
							field42[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field28) {
						int var33 = field32[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							class58 var34 = class58.field809[var33 - 1];
							field38[var28] -= var34.field818;
							field39[var28] -= var34.field816;
							field40[var28] -= var34.field817;
							field41[var28] -= var34.field819;
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
								if (var43 > 0) {
									var53 = method27(var35 * 256 / var38, var36 / var39, var37 / var39);
								}

								if (var7 > 0) {
									boolean var54 = true;
									if (var43 == 0 && field34[var7][var27][var40] != 0) {
										var54 = false;
									}

									if (var44 > 0 && !class58.field809[var44 - 1].field813) {
										var54 = false;
									}

									if (var54 && var45 == var46 && var45 == var47 && var45 == var48) {
										field43[var7][var27][var40] |= 0x924;
									}
								}

								int var55 = 0;
								if (var53 != -1) {
									var55 = class33.field513[method25(var53, 96)];
								}

								if (var44 == 0) {
									arg0.method55(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method25(var53, var49), method25(var53, var50), method25(var53, var51), method25(var53, var52), 0, 0, 0, 0, var55, 0);
								} else {
									int var56 = field34[var7][var27][var40] + 1;
									byte var57 = field35[var7][var27][var40];
									class58 var58 = class58.field809[var44 - 1];
									int var59 = var58.field811;
									int var60;
									int var61;
									if (var59 >= 0) {
										var60 = class33.method158(var59);
										var61 = -1;
									} else if (var58.field810 == 0xFF00FF) {
										var60 = 0;
										var61 = -2;
										var59 = -1;
									} else {
										var61 = method27(var58.field815, var58.field816, var58.field817);
										var60 = class33.field513[method26(var61, 96)];
									}

									arg0.method55(var7, var27, var40, var56, var57, var59, var45, var46, var47, var48, method25(var53, var49), method25(var53, var50), method25(var53, var51), method25(var53, var52), method26(var61, var49), method26(var61, var50), method26(var61, var51), method26(var61, var52), var55, var60);
								}
							}
						}
					}
				}
			}

			for (int var62 = 1; var62 < field29 - 1; var62++) {
				for (int var63 = 1; var63 < field28 - 1; var63++) {
					arg0.method54(var7, var63, var62, method19(var7, var63, var62));
				}
			}
		}

		if (!field27) {
			arg0.method81(768, 64, -10, -50, -50);
		}

		for (int var64 = 0; var64 < field28; var64++) {
			for (int var65 = 0; var65 < field29; var65++) {
				if ((field31[1][var64][var65] & 0x2) == 2) {
					arg0.method52(var64, var65);
				}
			}
		}

		if (!field27) {
			int var66 = 1;
			int var67 = 2;
			int var68 = 4;
			for (int var69 = 0; var69 < 4; var69++) {
				if (var69 > 0) {
					var66 <<= 3;
					var67 <<= 3;
					var68 <<= 3;
				}

				for (int var70 = 0; var70 <= var69; var70++) {
					for (int var71 = 0; var71 <= field29; var71++) {
						for (int var72 = 0; var72 <= field28; var72++) {
							if ((field43[var70][var72][var71] & var66) != 0) {
								int var73 = var71;
								int var74 = var71;
								int var75 = var70;
								int var76 = var70;

								while (var73 > 0 && (field43[var70][var72][var73 - 1] & var66) != 0) {
									var73--;
								}

								while (var74 < field29 && (field43[var70][var72][var74 + 1] & var66) != 0) {
									var74++;
								}

								label306: while (var75 > 0) {
									for (int var77 = var73; var77 <= var74; var77++) {
										if ((field43[var75 - 1][var72][var77] & var66) == 0) {
											break label306;
										}
									}

									var75--;
								}

								label295: while (var76 < var69) {
									for (int var78 = var73; var78 <= var74; var78++) {
										if ((field43[var76 + 1][var72][var78] & var66) == 0) {
											break label295;
										}
									}

									var76++;
								}

								int var79 = (var76 + 1 - var75) * (var74 + 1 - var73);
								if (var79 >= 8) {
									short var80 = 240;
									int var81 = field30[var76][var72][var73] - var80;
									int var82 = field30[var75][var72][var73];
									class18.method53(var74 * 128 + 128, var69, var72 * 128, var81, var73 * 128, 1, var82, var72 * 128);

									for (int var83 = var75; var83 <= var76; var83++) {
										for (int var84 = var73; var84 <= var74; var84++) {
											field43[var83][var72][var84] &= ~var66;
										}
									}
								}
							}

							if ((field43[var70][var72][var71] & var67) != 0) {
								int var85 = var72;
								int var86 = var72;
								int var87 = var70;
								int var88 = var70;

								while (var85 > 0 && (field43[var70][var85 - 1][var71] & var67) != 0) {
									var85--;
								}

								while (var86 < field28 && (field43[var70][var86 + 1][var71] & var67) != 0) {
									var86++;
								}

								label359: while (var87 > 0) {
									for (int var89 = var85; var89 <= var86; var89++) {
										if ((field43[var87 - 1][var89][var71] & var67) == 0) {
											break label359;
										}
									}

									var87--;
								}

								label348: while (var88 < var69) {
									for (int var90 = var85; var90 <= var86; var90++) {
										if ((field43[var88 + 1][var90][var71] & var67) == 0) {
											break label348;
										}
									}

									var88++;
								}

								int var91 = (var88 + 1 - var87) * (var86 + 1 - var85);
								if (var91 >= 8) {
									short var92 = 240;
									int var93 = field30[var88][var85][var71] - var92;
									int var94 = field30[var87][var85][var71];
									class18.method53(var71 * 128, var69, var85 * 128, var93, var71 * 128, 2, var94, var86 * 128 + 128);

									for (int var95 = var87; var95 <= var88; var95++) {
										for (int var96 = var85; var96 <= var86; var96++) {
											field43[var95][var96][var71] &= ~var67;
										}
									}
								}
							}

							if ((field43[var70][var72][var71] & var68) != 0) {
								int var97 = var72;
								int var98 = var72;
								int var99 = var71;
								int var100 = var71;

								while (var99 > 0 && (field43[var70][var72][var99 - 1] & var68) != 0) {
									var99--;
								}

								while (var100 < field29 && (field43[var70][var72][var100 + 1] & var68) != 0) {
									var100++;
								}

								label412: while (var97 > 0) {
									for (int var101 = var99; var101 <= var100; var101++) {
										if ((field43[var70][var97 - 1][var101] & var68) == 0) {
											break label412;
										}
									}

									var97--;
								}

								label401: while (var98 < field28) {
									for (int var102 = var99; var102 <= var100; var102++) {
										if ((field43[var70][var98 + 1][var102] & var68) == 0) {
											break label401;
										}
									}

									var98++;
								}

								if ((var98 - var97 + 1) * (var100 + 1 - var99) >= 4) {
									int var103 = field30[var70][var97][var99];
									class18.method53(var100 * 128 + 128, var69, var97 * 128, var103, var99 * 128, 4, var103, var98 * 128 + 128);

									for (int var104 = var97; var104 <= var98; var104++) {
										for (int var105 = var99; var105 <= var100; var105++) {
											field43[var70][var104][var105] &= ~var68;
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
		int var4 = 0x10000 - class33.field502[arg2 * 1024 / arg3] >> 1;
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

	@ObfuscatedName("c.a(Lr;ILec;I[[[IIILob;BIII)V")
	public static final void method28(class18 arg0, int arg1, class57 arg2, int arg3, int[][][] arg4, int arg5, int arg6, class41 arg7, int arg8, int arg9, int arg10) {
		int var11 = arg4[arg8][arg3][arg5];
		int var12 = arg4[arg8][arg3 + 1][arg5];
		int var13 = arg4[arg8][arg3 + 1][arg5 + 1];
		int var14 = arg4[arg8][arg3][arg5 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		class53 var16 = class53.method274(arg1);
		int var17 = (arg1 << 14) + (arg5 << 7) + arg3 + 0x40000000;
		if (!var16.field709) {
			var17 += Integer.MIN_VALUE;
		}

		byte var18 = (byte) ((arg10 << 6) + arg9);
		if (arg9 == 22) {
			class31 var19 = var16.method277(22, arg10, var11, var12, var13, var14, -1);
			arg0.method56(var15, var17, arg5, var18, arg3, var19, arg6);

			if (var16.field707 && var16.field709) {
				arg2.method297(arg5, arg3);
			}

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 3, true));
			}
		} else if (arg9 == 10 || arg9 == 11) {
			class31 var20 = var16.method277(10, arg10, var11, var12, var13, var14, -1);
			if (var20 != null) {
				int var21 = 0;
				if (arg9 == 11) {
					var21 += 256;
				}

				int var22;
				int var23;
				if (arg10 == 1 || arg10 == 3) {
					var22 = var16.field706;
					var23 = var16.field705;
				} else {
					var22 = var16.field705;
					var23 = var16.field706;
				}

				arg0.method60(var18, arg5, var21, var22, var15, var23, arg3, var17, var20, null, arg6);
			}

			if (var16.field707) {
				arg2.method296(arg5, var16.field705, var16.field708, arg3, var16.field706, arg10);
			}

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 2, true));
			}
		} else if (arg9 >= 12) {
			class31 var24 = var16.method277(arg9, arg10, var11, var12, var13, var14, -1);
			arg0.method60(var18, arg5, 0, 1, var15, 1, arg3, var17, var24, null, arg6);

			if (var16.field707) {
				arg2.method296(arg5, var16.field705, var16.field708, arg3, var16.field706, arg10);
			}

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 2, true));
			}
		} else if (arg9 == 0) {
			class31 var25 = var16.method277(0, arg10, var11, var12, var13, var14, -1);
			arg0.method58(var17, 0, null, var18, field44[arg10], arg5, var25, var15, arg6, arg3);

			if (var16.field707) {
				arg2.method295(arg10, arg5, arg3, var16.field708, arg9);
			}

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 0, true));
			}
		} else if (arg9 == 1) {
			class31 var26 = var16.method277(1, arg10, var11, var12, var13, var14, -1);
			arg0.method58(var17, 0, null, var18, field45[arg10], arg5, var26, var15, arg6, arg3);

			if (var16.field707) {
				arg2.method295(arg10, arg5, arg3, var16.field708, arg9);
			}

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 0, true));
			}
		} else if (arg9 == 2) {
			int var27 = arg10 + 1 & 0x3;
			class31 var28 = var16.method277(2, arg10 + 4, var11, var12, var13, var14, -1);
			class31 var29 = var16.method277(2, var27, var11, var12, var13, var14, -1);
			arg0.method58(var17, field44[var27], var29, var18, field44[arg10], arg5, var28, var15, arg6, arg3);

			if (var16.field707) {
				arg2.method295(arg10, arg5, arg3, var16.field708, arg9);
			}

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 0, true));
			}
		} else if (arg9 == 3) {
			class31 var30 = var16.method277(3, arg10, var11, var12, var13, var14, -1);
			arg0.method58(var17, 0, null, var18, field45[arg10], arg5, var30, var15, arg6, arg3);

			if (var16.field707) {
				arg2.method295(arg10, arg5, arg3, var16.field708, arg9);
			}

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 0, true));
			}
		} else if (arg9 == 9) {
			class31 var31 = var16.method277(arg9, arg10, var11, var12, var13, var14, -1);
			arg0.method60(var18, arg5, 0, 1, var15, 1, arg3, var17, var31, null, arg6);

			if (var16.field707) {
				arg2.method296(arg5, var16.field705, var16.field708, arg3, var16.field706, arg10);
			}

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 2, true));
			}
		} else if (arg9 == 4) {
			class31 var32 = var16.method277(4, 0, var11, var12, var13, var14, -1);
			arg0.method59(0, var18, field44[arg10], arg10 * 512, var32, var15, arg5, arg3, 0, arg6, var17);

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 1, true));
			}
		} else if (arg9 == 5) {
			int var33 = 16;
			int var34 = arg0.method76(arg6, arg3, arg5);
			if (var34 > 0) {
				var33 = class53.method274(var34 >> 14 & 0x7FFF).field714;
			}

			class31 var35 = var16.method277(4, 0, var11, var12, var13, var14, -1);
			arg0.method59(field46[arg10] * var33, var18, field44[arg10], arg10 * 512, var35, var15, arg5, arg3, field47[arg10] * var33, arg6, var17);

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 1, true));
			}
		} else if (arg9 == 6) {
			class31 var36 = var16.method277(4, 0, var11, var12, var13, var14, -1);
			arg0.method59(0, var18, 256, arg10, var36, var15, arg5, arg3, 0, arg6, var17);

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 1, true));
			}
		} else if (arg9 == 7) {
			class31 var37 = var16.method277(4, 0, var11, var12, var13, var14, -1);
			arg0.method59(0, var18, 512, arg10, var37, var15, arg5, arg3, 0, arg6, var17);

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 1, true));
			}
		} else if (arg9 == 8) {
			class31 var38 = var16.method277(4, 0, var11, var12, var13, var14, -1);
			arg0.method59(0, var18, 768, arg10, var38, var15, arg5, arg3, 0, arg6, var17);

			if (var16.field713 != -1) {
				arg7.method224(new class40(arg1, arg5, arg6, class62.field893[var16.field713], arg3, 1, true));
			}
		}
	}
}
