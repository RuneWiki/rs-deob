package deob;

@ObfuscatedName("c")
public final class class3 {

	@ObfuscatedName("c.e")
	public static boolean field25 = true;

	@ObfuscatedName("c.f")
	public static int field26;

	@ObfuscatedName("c.g")
	public int field27;

	@ObfuscatedName("c.h")
	public int field28;

	@ObfuscatedName("c.i")
	public int[][][] field29;

	@ObfuscatedName("c.j")
	public byte[][][] field30;

	@ObfuscatedName("c.k")
	public byte[][][] field31;

	@ObfuscatedName("c.l")
	public byte[][][] field32;

	@ObfuscatedName("c.m")
	public byte[][][] field33;

	@ObfuscatedName("c.n")
	public byte[][][] field34;

	@ObfuscatedName("c.o")
	public byte[][][] field35;

	@ObfuscatedName("c.p")
	public int[][] field36;

	@ObfuscatedName("c.q")
	public int[] field37;

	@ObfuscatedName("c.r")
	public int[] field38;

	@ObfuscatedName("c.s")
	public int[] field39;

	@ObfuscatedName("c.t")
	public int[] field40;

	@ObfuscatedName("c.u")
	public int[] field41;

	@ObfuscatedName("c.v")
	public int[][][] field42;

	@ObfuscatedName("c.w")
	public static final int[] field43 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.x")
	public static final int[] field44 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.y")
	public static final int[] field45 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.z")
	public static final int[] field46 = new int[] { 0, -1, 0, 1 };

	public class3(byte[][][] arg0, int[][][] arg1, int arg2, int arg3) {
		field27 = arg2;
		field28 = arg3;
		field29 = arg1;
		field30 = arg0;
		field31 = new byte[4][field27][field28];
		field32 = new byte[4][field27][field28];
		field33 = new byte[4][field27][field28];
		field34 = new byte[4][field27][field28];
		field42 = new int[4][field27 + 1][field28 + 1];
		field35 = new byte[4][field27 + 1][field28 + 1];
		field36 = new int[field27 + 1][field28 + 1];
		field37 = new int[field28];
		field38 = new int[field28];
		field39 = new int[field28];
		field40 = new int[field28];
		field41 = new int[field28];
	}

	@ObfuscatedName("c.a(IIIIB)V")
	public final void method14(int arg0, int arg1, int arg2, int arg3) {
		byte var5 = 0;
		for (int var6 = 0; var6 < class54.field741; var6++) {
			if (class54.field742[var6].field747.equalsIgnoreCase("water")) {
				var5 = (byte) (var6 + 1);
				break;
			}
		}

		for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
			for (int var8 = arg3; var8 < arg1 + arg3; var8++) {
				if (var8 >= 0 && var8 < field27 && var7 >= 0 && var7 < field28) {
					field32[0][var8][var7] = var5;

					for (int var9 = 0; var9 < 4; var9++) {
						field29[var9][var8][var7] = 0;
						field30[var9][var8][var7] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(I[BIIII)V")
	public final void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
		class36 var6 = new class36(arg0);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg3 + var8;
					int var11 = arg2 + var9;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						field30[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.method185();
							if (var12 == 0) {
								break;
							}

							if (var12 == 1) {
								break;
							}

							if (var12 <= 49) {
								field32[var7][var10][var11] = var6.method186();
								field33[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								field34[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								field30[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								field31[var7][var10][var11] = (byte) (var12 - 81);
							}
						}

						int var13 = var6.method185();
						if (var13 == 1) {
							var13 = 0;
						}

						if (var7 == 0) {
							field29[0][var10][var11] = -var13 * 8;
						} else {
							field29[var7][var10][var11] = field29[var7 - 1][var10][var11] - var13 * 8;
						}

						if (var7 == 0) {
							field29[0][var10][var11] = -method19(var10 + arg1 + 932731, var11 + 556238 + arg4) * 8;
						} else {
							field29[var7][var10][var11] = field29[var7 - 1][var10][var11] - 240;
						}
					} else {
						while (true) {
							int var14 = var6.method185();
							if (var14 == 0) {
								break;
							}

							if (var14 == 1) {
								break;
							}

							if (var14 <= 49) {
								var6.method185();
							}
						}

						var6.method185();
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a([BLnb;[Lac;Lq;III)V")
	public final void method16(byte[] arg0, class40 arg1, class53[] arg2, class17 arg3, int arg4, int arg5) {
		class36 var7 = new class36(arg0);
		int var8 = -1;
		while (true) {
			int var9 = var7.method199();
			if (var9 == 0) {
				return;
			}

			var8 += var9;
			int var10 = 0;
			while (true) {
				int var11 = var7.method199();
				if (var11 == 0) {
					break;
				}

				var10 += var11 - 1;
				int var12 = var10 & 0x3F;
				int var13 = var10 >> 6 & 0x3F;
				int var14 = var10 >> 12;
				int var15 = var7.method185();
				int var16 = var15 >> 2;
				int var17 = var15 & 0x3;
				int var18 = arg5 + var13;
				int var19 = arg4 + var12;
				if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
					method17(arg3, arg1, var8, var14, var16, var17, var19, arg2[var14], var18);
				}
			}
		}
	}

	@ObfuscatedName("c.a(Lq;Lnb;IIIIIILac;I)V")
	public final void method17(class17 arg0, class40 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class53 arg7, int arg8) {
		if (field25) {
			int var10 = arg3;
			if (arg3 > 0 && (field30[1][arg8][arg6] & 0x2) != 0) {
				var10 = arg3 - 1;
			}

			if ((field30[arg3][arg8][arg6] & 0x8) != 0) {
				var10 = 0;
			}

			if (field26 != var10) {
				return;
			}

			if ((field30[arg3][arg8][arg6] & 0x10) != 0) {
				return;
			}
		}

		int var11 = field29[arg3][arg8][arg6];
		int var12 = field29[arg3][arg8 + 1][arg6];
		int var13 = field29[arg3][arg8 + 1][arg6 + 1];
		int var14 = field29[arg3][arg8][arg6 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		class49 var16 = class49.method237(arg2);
		int var17 = (arg2 << 14) + (arg6 << 7) + arg8 + 0x40000000;
		if (!var16.field651) {
			var17 += Integer.MIN_VALUE;
		}

		byte var18 = (byte) ((arg5 << 6) + arg4);
		if (arg4 == 22) {
			if (!field25 || var16.field651) {
				class30 var19 = var16.method240(22, arg5, var11, var12, var13, var14, -1);
				arg0.method42(var19, arg8, var18, var15, arg3, arg6, var17);

				if (var16.field649 && var16.field651) {
					arg7.method259(arg6, arg8);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			class30 var20 = var16.method240(10, arg5, var11, var12, var13, var14, -1);
			if (var20 != null) {
				int var21 = 0;
				if (arg4 == 11) {
					var21 += 256;
				}

				int var22;
				int var23;
				if (arg5 == 1 || arg5 == 3) {
					var22 = var16.field648;
					var23 = var16.field647;
				} else {
					var22 = var16.field647;
					var23 = var16.field648;
				}

				if (arg0.method46(var17, arg6, var20, var23, var21, arg3, arg8, var15, var18, null, var22) && var16.field664) {
					for (int var24 = 0; var24 <= var22; var24++) {
						for (int var25 = 0; var25 <= var23; var25++) {
							int var26 = var20.field410 / 4;
							if (var26 > 30) {
								var26 = 30;
							}

							if (var26 > field35[arg3][arg8 + var24][arg6 + var25]) {
								field35[arg3][arg8 + var24][arg6 + var25] = (byte) var26;
							}
						}
					}
				}
			}

			if (var16.field649) {
				arg7.method258(var16.field647, arg8, arg6, var16.field650, arg5, var16.field648);
			}

			if (var16.field655 != -1) {
				arg1.method201(new class39(2, arg3, arg2, class58.field823[var16.field655], arg8, arg6));
			}
		} else if (arg4 >= 12) {
			class30 var27 = var16.method240(arg4, arg5, var11, var12, var13, var14, -1);
			arg0.method46(var17, arg6, var27, 1, 0, arg3, arg8, var15, var18, null, 1);

			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg3 > 0) {
				field42[arg3][arg8][arg6] |= 0x924;
			}

			if (var16.field649) {
				arg7.method258(var16.field647, arg8, arg6, var16.field650, arg5, var16.field648);
			}

			if (var16.field655 != -1) {
				arg1.method201(new class39(2, arg3, arg2, class58.field823[var16.field655], arg8, arg6));
			}
		} else if (arg4 == 0) {
			class30 var28 = var16.method240(0, arg5, var11, var12, var13, var14, -1);
			arg0.method44(var15, field43[arg5], var18, 0, var17, arg6, arg8, null, arg3, var28);

			if (arg5 == 0) {
				if (var16.field664) {
					field35[arg3][arg8][arg6] = 50;
					field35[arg3][arg8][arg6 + 1] = 50;
				}

				if (var16.field654) {
					field42[arg3][arg8][arg6] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var16.field664) {
					field35[arg3][arg8][arg6 + 1] = 50;
					field35[arg3][arg8 + 1][arg6 + 1] = 50;
				}

				if (var16.field654) {
					field42[arg3][arg8][arg6 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var16.field664) {
					field35[arg3][arg8 + 1][arg6] = 50;
					field35[arg3][arg8 + 1][arg6 + 1] = 50;
				}

				if (var16.field654) {
					field42[arg3][arg8 + 1][arg6] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var16.field664) {
					field35[arg3][arg8][arg6] = 50;
					field35[arg3][arg8 + 1][arg6] = 50;
				}

				if (var16.field654) {
					field42[arg3][arg8][arg6] |= 0x492;
				}
			}

			if (var16.field649) {
				arg7.method257(arg8, var16.field650, arg4, arg6, arg5);
			}
		} else if (arg4 == 1) {
			class30 var29 = var16.method240(1, arg5, var11, var12, var13, var14, -1);
			arg0.method44(var15, field44[arg5], var18, 0, var17, arg6, arg8, null, arg3, var29);

			if (var16.field664) {
				if (arg5 == 0) {
					field35[arg3][arg8][arg6 + 1] = 50;
				} else if (arg5 == 1) {
					field35[arg3][arg8 + 1][arg6 + 1] = 50;
				} else if (arg5 == 2) {
					field35[arg3][arg8 + 1][arg6] = 50;
				} else if (arg5 == 3) {
					field35[arg3][arg8][arg6] = 50;
				}
			}

			if (var16.field649) {
				arg7.method257(arg8, var16.field650, arg4, arg6, arg5);
			}
		} else if (arg4 == 2) {
			int var30 = arg5 + 1 & 0x3;
			class30 var31 = var16.method240(2, arg5 + 4, var11, var12, var13, var14, -1);
			class30 var32 = var16.method240(2, var30, var11, var12, var13, var14, -1);
			arg0.method44(var15, field43[arg5], var18, field43[var30], var17, arg6, arg8, var32, arg3, var31);

			if (var16.field654) {
				if (arg5 == 0) {
					field42[arg3][arg8][arg6] |= 0x249;
					field42[arg3][arg8][arg6 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field42[arg3][arg8][arg6 + 1] |= 0x492;
					field42[arg3][arg8 + 1][arg6] |= 0x249;
				} else if (arg5 == 2) {
					field42[arg3][arg8 + 1][arg6] |= 0x249;
					field42[arg3][arg8][arg6] |= 0x492;
				} else if (arg5 == 3) {
					field42[arg3][arg8][arg6] |= 0x492;
					field42[arg3][arg8][arg6] |= 0x249;
				}
			}

			if (var16.field649) {
				arg7.method257(arg8, var16.field650, arg4, arg6, arg5);
			}
		} else if (arg4 == 3) {
			class30 var33 = var16.method240(3, arg5, var11, var12, var13, var14, -1);
			arg0.method44(var15, field44[arg5], var18, 0, var17, arg6, arg8, null, arg3, var33);

			if (var16.field664) {
				if (arg5 == 0) {
					field35[arg3][arg8][arg6 + 1] = 50;
				} else if (arg5 == 1) {
					field35[arg3][arg8 + 1][arg6 + 1] = 50;
				} else if (arg5 == 2) {
					field35[arg3][arg8 + 1][arg6] = 50;
				} else if (arg5 == 3) {
					field35[arg3][arg8][arg6] = 50;
				}
			}

			if (var16.field649) {
				arg7.method257(arg8, var16.field650, arg4, arg6, arg5);
			}
		} else if (arg4 == 9) {
			class30 var34 = var16.method240(arg4, arg5, var11, var12, var13, var14, -1);
			arg0.method46(var17, arg6, var34, 1, 0, arg3, arg8, var15, var18, null, 1);

			if (var16.field649) {
				arg7.method258(var16.field647, arg8, arg6, var16.field650, arg5, var16.field648);
			}
		} else if (arg4 == 4) {
			class30 var35 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg0.method45(var18, var17, var35, 0, arg8, field43[arg5], arg3, var15, arg6, arg5 * 512, 0);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg2, class58.field823[var16.field655], arg8, arg6));
			}
		} else if (arg4 == 5) {
			int var36 = 16;
			int var37 = arg0.method59(arg3, arg8, arg6);
			if (var37 > 0) {
				var36 = class49.method237(var37 >> 14 & 0x7FFF).field656;
			}

			class30 var38 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg0.method45(var18, var17, var38, field46[arg5] * var36, arg8, field43[arg5], arg3, var15, arg6, arg5 * 512, field45[arg5] * var36);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg2, class58.field823[var16.field655], arg8, arg6));
			}
		} else if (arg4 == 6) {
			class30 var39 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg0.method45(var18, var17, var39, 0, arg8, 256, arg3, var15, arg6, arg5, 0);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg2, class58.field823[var16.field655], arg8, arg6));
			}
		} else if (arg4 == 7) {
			class30 var40 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg0.method45(var18, var17, var40, 0, arg8, 512, arg3, var15, arg6, arg5, 0);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg2, class58.field823[var16.field655], arg8, arg6));
			}
		} else if (arg4 == 8) {
			class30 var41 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg0.method45(var18, var17, var41, 0, arg8, 768, arg3, var15, arg6, arg5, 0);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg2, class58.field823[var16.field655], arg8, arg6));
			}
		}
	}

	@ObfuscatedName("c.a([Lac;Lq;I)V")
	public final void method18(class53[] arg0, class17 arg1) {
		class53 var3 = null;
		for (int var4 = 0; var4 < 4; var4++) {
			class53 var5 = arg0[var4];
			for (int var6 = 0; var6 < 104; var6++) {
				for (int var7 = 0; var7 < 104; var7++) {
					if ((field30[var4][var6][var7] & 0x1) == 1) {
						var5.method259(var7, var6);
					}

					if (var4 > 0 && (field30[1][var6][var7] & 0x2) == 2) {
						var3.field740[var6][var7] = var5.field740[var6][var7];
					}
				}
			}

			var3 = var5;
		}

		for (int var8 = 0; var8 < 4; var8++) {
			byte[][] var9 = field35[var8];
			byte var10 = 96;
			short var11 = 768;
			byte var12 = -50;
			byte var13 = -10;
			byte var14 = -50;
			int var15 = (int) Math.sqrt(var14 * var14 + var12 * var12 + var13 * var13);
			int var16 = var11 * var15 >> 8;
			for (int var17 = 1; var17 < field28 - 1; var17++) {
				for (int var18 = 1; var18 < field27 - 1; var18++) {
					int var19 = field29[var8][var18 + 1][var17] - field29[var8][var18 - 1][var17];
					int var20 = field29[var8][var18][var17 + 1] - field29[var8][var18][var17 - 1];
					int var21 = (int) Math.sqrt(var20 * var20 + var19 * var19 + 0x10000);
					int var22 = (var19 << 8) / var21;
					int var23 = 0x10000 / var21;
					int var24 = (var20 << 8) / var21;
					int var25 = (var14 * var24 + var12 * var22 + var13 * var23) / var16 + var10;
					int var26 = (var9[var18][var17] >> 1) + (var9[var18][var17 + 1] >> 3) + (var9[var18][var17 - 1] >> 2) + (var9[var18 - 1][var17] >> 2) + (var9[var18 + 1][var17] >> 3);
					field36[var18][var17] = var25 - var26;
				}
			}

			for (int var27 = 0; var27 < field28; var27++) {
				field37[var27] = 0;
				field38[var27] = 0;
				field39[var27] = 0;
				field40[var27] = 0;
				field41[var27] = 0;
			}

			for (int var28 = -5; var28 < field27 + 5; var28++) {
				for (int var29 = 0; var29 < field28; var29++) {
					int var30 = var28 + 5;
					if (var30 >= 0 && var30 < field27) {
						int var31 = field31[var8][var30][var29] & 0xFF;
						if (var31 > 0) {
							class54 var32 = class54.field742[var31 - 1];
							field37[var29] += var32.field751;
							field38[var29] += var32.field749;
							field39[var29] += var32.field750;
							field40[var29] += var32.field752;
							field41[var29]++;
						}
					}

					int var33 = var28 - 5;
					if (var33 >= 0 && var33 < field27) {
						int var34 = field31[var8][var33][var29] & 0xFF;
						if (var34 > 0) {
							class54 var35 = class54.field742[var34 - 1];
							field37[var29] -= var35.field751;
							field38[var29] -= var35.field749;
							field39[var29] -= var35.field750;
							field40[var29] -= var35.field752;
							field41[var29]--;
						}
					}
				}

				if (var28 >= 1 && var28 < field27 - 1) {
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					int var40 = 0;
					for (int var41 = -5; var41 < field28 + 5; var41++) {
						int var42 = var41 + 5;
						if (var42 >= 0 && var42 < field28) {
							var36 += field37[var42];
							var37 += field38[var42];
							var38 += field39[var42];
							var39 += field40[var42];
							var40 += field41[var42];
						}

						int var43 = var41 - 5;
						if (var43 >= 0 && var43 < field28) {
							var36 -= field37[var43];
							var37 -= field38[var43];
							var38 -= field39[var43];
							var39 -= field40[var43];
							var40 -= field41[var43];
						}

						if (var41 >= 1 && var41 < field28 - 1) {
							if (field25) {
								int var44 = var8;
								if (var8 > 0 && (field30[1][var28][var41] & 0x2) != 0) {
									var44 = var8 - 1;
								}

								if ((field30[var8][var28][var41] & 0x8) != 0) {
									var44 = 0;
								}

								if (field26 != var44 || (field30[var8][var28][var41] & 0x10) != 0) {
									continue;
								}
							}

							int var45 = field31[var8][var28][var41] & 0xFF;
							int var46 = field32[var8][var28][var41] & 0xFF;
							if (var45 > 0 || var46 > 0) {
								int var47 = field29[var8][var28][var41];
								int var48 = field29[var8][var28 + 1][var41];
								int var49 = field29[var8][var28 + 1][var41 + 1];
								int var50 = field29[var8][var28][var41 + 1];
								int var51 = field36[var28][var41];
								int var52 = field36[var28 + 1][var41];
								int var53 = field36[var28 + 1][var41 + 1];
								int var54 = field36[var28][var41 + 1];
								int var55 = -1;
								if (var45 > 0) {
									var55 = method26(var36 * 256 / var39, var37 / var40, var38 / var40);
								}

								if (var8 > 0 && !field25) {
									boolean var56 = true;
									if (var45 == 0 && field33[var8][var28][var41] != 0) {
										var56 = false;
									}

									if (var46 > 0 && !class54.field742[var46 - 1].field746) {
										var56 = false;
									}

									if (var56 && var47 == var48 && var47 == var49 && var47 == var50) {
										field42[var8][var28][var41] |= 0x924;
									}
								}

								int var57 = 0;
								if (var55 != -1) {
									var57 = class32.field498[method24(var55, 96)];
								}

								if (var46 == 0) {
									arg1.method41(var8, var28, var41, 0, 0, -1, var47, var48, var49, var50, method24(var55, var51), method24(var55, var52), method24(var55, var53), method24(var55, var54), 0, 0, 0, 0, var57, 0);
								} else {
									int var58 = field33[var8][var28][var41] + 1;
									byte var59 = field34[var8][var28][var41];
									class54 var60 = class54.field742[var46 - 1];
									int var61 = var60.field744;
									int var62;
									int var63;
									if (var61 >= 0) {
										var62 = class32.method141(var61);
										var63 = -1;
									} else if (var60.field743 == 0xFF00FF) {
										var62 = 0;
										var63 = -2;
										var61 = -1;
									} else {
										var63 = method26(var60.field748, var60.field749, var60.field750);
										var62 = class32.field498[method25(var63, 96)];
									}

									arg1.method41(var8, var28, var41, var58, var59, var61, var47, var48, var49, var50, method24(var55, var51), method24(var55, var52), method24(var55, var53), method24(var55, var54), method25(var63, var51), method25(var63, var52), method25(var63, var53), method25(var63, var54), var57, var62);
								}
							}
						}
					}
				}
			}

			for (int var64 = 1; var64 < field28 - 1; var64++) {
				for (int var65 = 1; var65 < field27 - 1; var65++) {
					int var66 = var8;
					if (var8 > 0 && (field30[1][var65][var64] & 0x2) != 0) {
						var66 = var8 - 1;
					}

					if ((field30[var8][var65][var64] & 0x8) != 0) {
						var66 = 0;
					}

					arg1.method40(var8, var65, var64, var66);
				}
			}
		}

		arg1.method64(-50, 64, 768, -10, -50);

		for (int var67 = 0; var67 < field27; var67++) {
			for (int var68 = 0; var68 < field28; var68++) {
				if ((field30[1][var67][var68] & 0x2) == 2) {
					arg1.method38(var67, var68);
				}
			}
		}

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
				for (int var74 = 0; var74 <= field28; var74++) {
					for (int var75 = 0; var75 <= field27; var75++) {
						if ((field42[var73][var75][var74] & var69) != 0) {
							int var76 = var74;
							int var77 = var74;
							int var78 = var73;
							int var79 = var73;

							while (var76 > 0 && (field42[var73][var75][var76 - 1] & var69) != 0) {
								var76--;
							}

							while (var77 < field28 && (field42[var73][var75][var77 + 1] & var69) != 0) {
								var77++;
							}

							label318: while (var78 > 0) {
								for (int var80 = var76; var80 <= var77; var80++) {
									if ((field42[var78 - 1][var75][var80] & var69) == 0) {
										break label318;
									}
								}

								var78--;
							}

							label307: while (var79 < var72) {
								for (int var81 = var76; var81 <= var77; var81++) {
									if ((field42[var79 + 1][var75][var81] & var69) == 0) {
										break label307;
									}
								}

								var79++;
							}

							int var82 = (var79 + 1 - var78) * (var77 + 1 - var76);
							if (var82 >= 8) {
								short var83 = 240;
								int var84 = field29[var79][var75][var76] - var83;
								int var85 = field29[var78][var75][var76];
								class17.method39(var75 * 128, var77 * 128 + 128, var84, var76 * 128, 1, var75 * 128, var85, var72);

								for (int var86 = var78; var86 <= var79; var86++) {
									for (int var87 = var76; var87 <= var77; var87++) {
										field42[var86][var75][var87] &= ~var69;
									}
								}
							}
						}

						if ((field42[var73][var75][var74] & var70) != 0) {
							int var88 = var75;
							int var89 = var75;
							int var90 = var73;
							int var91 = var73;

							while (var88 > 0 && (field42[var73][var88 - 1][var74] & var70) != 0) {
								var88--;
							}

							while (var89 < field27 && (field42[var73][var89 + 1][var74] & var70) != 0) {
								var89++;
							}

							label371: while (var90 > 0) {
								for (int var92 = var88; var92 <= var89; var92++) {
									if ((field42[var90 - 1][var92][var74] & var70) == 0) {
										break label371;
									}
								}

								var90--;
							}

							label360: while (var91 < var72) {
								for (int var93 = var88; var93 <= var89; var93++) {
									if ((field42[var91 + 1][var93][var74] & var70) == 0) {
										break label360;
									}
								}

								var91++;
							}

							int var94 = (var91 + 1 - var90) * (var89 + 1 - var88);
							if (var94 >= 8) {
								short var95 = 240;
								int var96 = field29[var91][var88][var74] - var95;
								int var97 = field29[var90][var88][var74];
								class17.method39(var88 * 128, var74 * 128, var96, var74 * 128, 2, var89 * 128 + 128, var97, var72);

								for (int var98 = var90; var98 <= var91; var98++) {
									for (int var99 = var88; var99 <= var89; var99++) {
										field42[var98][var99][var74] &= ~var70;
									}
								}
							}
						}

						if (!field25 && (field42[var73][var75][var74] & var71) != 0) {
							int var100 = var75;
							int var101 = var75;
							int var102 = var74;
							int var103 = var74;

							while (var102 > 0 && (field42[var73][var75][var102 - 1] & var71) != 0) {
								var102--;
							}

							while (var103 < field28 && (field42[var73][var75][var103 + 1] & var71) != 0) {
								var103++;
							}

							label426: while (var100 > 0) {
								for (int var104 = var102; var104 <= var103; var104++) {
									if ((field42[var73][var100 - 1][var104] & var71) == 0) {
										break label426;
									}
								}

								var100--;
							}

							label415: while (var101 < field27) {
								for (int var105 = var102; var105 <= var103; var105++) {
									if ((field42[var73][var101 + 1][var105] & var71) == 0) {
										break label415;
									}
								}

								var101++;
							}

							if ((var101 - var100 + 1) * (var103 + 1 - var102) >= 4) {
								int var106 = field29[var73][var100][var102];
								class17.method39(var100 * 128, var103 * 128 + 128, var106, var102 * 128, 4, var101 * 128 + 128, var106, var72);

								for (int var107 = var100; var107 <= var101; var107++) {
									for (int var108 = var102; var108 <= var103; var108++) {
										field42[var73][var107][var108] &= ~var71;
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
		int var4 = 0x10000 - class32.field487[arg2 * 1024 / arg3] >> 1;
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

	@ObfuscatedName("c.a(ILnb;IIILac;[[[IILq;III)V")
	public static final void method27(int arg0, class40 arg1, int arg2, int arg3, int arg4, class53 arg5, int[][][] arg6, int arg7, class17 arg8, int arg9, int arg10) {
		int var11 = arg6[arg0][arg9][arg2];
		int var12 = arg6[arg0][arg9 + 1][arg2];
		int var13 = arg6[arg0][arg9 + 1][arg2 + 1];
		int var14 = arg6[arg0][arg9][arg2 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		class49 var16 = class49.method237(arg7);
		int var17 = (arg7 << 14) + (arg2 << 7) + arg9 + 0x40000000;
		if (!var16.field651) {
			var17 += Integer.MIN_VALUE;
		}

		byte var18 = (byte) ((arg4 << 6) + arg10);
		if (arg10 == 22) {
			class30 var19 = var16.method240(22, arg4, var11, var12, var13, var14, -1);
			arg8.method42(var19, arg9, var18, var15, arg3, arg2, var17);

			if (var16.field649 && var16.field651) {
				arg5.method259(arg2, arg9);
			}
		} else if (arg10 == 10 || arg10 == 11) {
			class30 var20 = var16.method240(10, arg4, var11, var12, var13, var14, -1);
			if (var20 != null) {
				int var21 = 0;
				if (arg10 == 11) {
					var21 += 256;
				}

				int var22;
				int var23;
				if (arg4 == 1 || arg4 == 3) {
					var22 = var16.field648;
					var23 = var16.field647;
				} else {
					var22 = var16.field647;
					var23 = var16.field648;
				}

				arg8.method46(var17, arg2, var20, var23, var21, arg3, arg9, var15, var18, null, var22);
			}

			if (var16.field649) {
				arg5.method258(var16.field647, arg9, arg2, var16.field650, arg4, var16.field648);
			}

			if (var16.field655 != -1) {
				arg1.method201(new class39(2, arg3, arg7, class58.field823[var16.field655], arg9, arg2));
			}
		} else if (arg10 >= 12) {
			class30 var24 = var16.method240(arg10, arg4, var11, var12, var13, var14, -1);
			arg8.method46(var17, arg2, var24, 1, 0, arg3, arg9, var15, var18, null, 1);

			if (var16.field649) {
				arg5.method258(var16.field647, arg9, arg2, var16.field650, arg4, var16.field648);
			}

			if (var16.field655 != -1) {
				arg1.method201(new class39(2, arg3, arg7, class58.field823[var16.field655], arg9, arg2));
			}
		} else if (arg10 == 0) {
			class30 var25 = var16.method240(0, arg4, var11, var12, var13, var14, -1);
			arg8.method44(var15, field43[arg4], var18, 0, var17, arg2, arg9, null, arg3, var25);

			if (var16.field649) {
				arg5.method257(arg9, var16.field650, arg10, arg2, arg4);
			}
		} else if (arg10 == 1) {
			class30 var26 = var16.method240(1, arg4, var11, var12, var13, var14, -1);
			arg8.method44(var15, field44[arg4], var18, 0, var17, arg2, arg9, null, arg3, var26);

			if (var16.field649) {
				arg5.method257(arg9, var16.field650, arg10, arg2, arg4);
			}
		} else if (arg10 == 2) {
			int var27 = arg4 + 1 & 0x3;
			class30 var28 = var16.method240(2, arg4 + 4, var11, var12, var13, var14, -1);
			class30 var29 = var16.method240(2, var27, var11, var12, var13, var14, -1);
			arg8.method44(var15, field43[arg4], var18, field43[var27], var17, arg2, arg9, var29, arg3, var28);

			if (var16.field649) {
				arg5.method257(arg9, var16.field650, arg10, arg2, arg4);
			}
		} else if (arg10 == 3) {
			class30 var30 = var16.method240(3, arg4, var11, var12, var13, var14, -1);
			arg8.method44(var15, field44[arg4], var18, 0, var17, arg2, arg9, null, arg3, var30);

			if (var16.field649) {
				arg5.method257(arg9, var16.field650, arg10, arg2, arg4);
			}
		} else if (arg10 == 9) {
			class30 var31 = var16.method240(arg10, arg4, var11, var12, var13, var14, -1);
			arg8.method46(var17, arg2, var31, 1, 0, arg3, arg9, var15, var18, null, 1);

			if (var16.field649) {
				arg5.method258(var16.field647, arg9, arg2, var16.field650, arg4, var16.field648);
			}
		} else if (arg10 == 4) {
			class30 var32 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg8.method45(var18, var17, var32, 0, arg9, field43[arg4], arg3, var15, arg2, arg4 * 512, 0);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg7, class58.field823[var16.field655], arg9, arg2));
			}
		} else if (arg10 == 5) {
			int var33 = 16;
			int var34 = arg8.method59(arg3, arg9, arg2);
			if (var34 > 0) {
				var33 = class49.method237(var34 >> 14 & 0x7FFF).field656;
			}

			class30 var35 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg8.method45(var18, var17, var35, field46[arg4] * var33, arg9, field43[arg4], arg3, var15, arg2, arg4 * 512, field45[arg4] * var33);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg7, class58.field823[var16.field655], arg9, arg2));
			}
		} else if (arg10 == 6) {
			class30 var36 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg8.method45(var18, var17, var36, 0, arg9, 256, arg3, var15, arg2, arg4, 0);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg7, class58.field823[var16.field655], arg9, arg2));
			}
		} else if (arg10 == 7) {
			class30 var37 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg8.method45(var18, var17, var37, 0, arg9, 512, arg3, var15, arg2, arg4, 0);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg7, class58.field823[var16.field655], arg9, arg2));
			}
		} else if (arg10 == 8) {
			class30 var38 = var16.method240(4, 0, var11, var12, var13, var14, -1);
			arg8.method45(var18, var17, var38, 0, arg9, 768, arg3, var15, arg2, arg4, 0);

			if (var16.field655 != -1) {
				arg1.method201(new class39(1, arg3, arg7, class58.field823[var16.field655], arg9, arg2));
			}
		}
	}
}
