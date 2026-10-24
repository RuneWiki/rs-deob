package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("CHEOPWNH")
public final class World {

	@ObfuscatedName("CHEOPWNH.n")
	public int field106;

	@ObfuscatedName("CHEOPWNH.o")
	public int field107;

	@ObfuscatedName("CHEOPWNH.l")
	public int[][][] field104;

	@ObfuscatedName("CHEOPWNH.a")
	public byte[][][] field95;

	@ObfuscatedName("CHEOPWNH.v")
	public byte[][][] field111;

	@ObfuscatedName("CHEOPWNH.r")
	public byte[][][] field109;

	@ObfuscatedName("CHEOPWNH.p")
	public byte[][][] field108;

	@ObfuscatedName("CHEOPWNH.e")
	public byte[][][] field97;

	@ObfuscatedName("CHEOPWNH.E")
	public int[][][] field118;

	@ObfuscatedName("CHEOPWNH.A")
	public byte[][][] field115;

	@ObfuscatedName("CHEOPWNH.B")
	public int[][] field116;

	@ObfuscatedName("CHEOPWNH.g")
	public int[] field99;

	@ObfuscatedName("CHEOPWNH.h")
	public int[] field100;

	@ObfuscatedName("CHEOPWNH.i")
	public int[] field101;

	@ObfuscatedName("CHEOPWNH.j")
	public int[] field102;

	@ObfuscatedName("CHEOPWNH.k")
	public int[] field103;

	@ObfuscatedName("CHEOPWNH.f")
	public static final int[] field98 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("CHEOPWNH.m")
	public static int field105 = 99;

	@ObfuscatedName("CHEOPWNH.u")
	public static final int[] field110 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("CHEOPWNH.x")
	public static final int[] field112 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("CHEOPWNH.D")
	public static final int[] field117 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("CHEOPWNH.F")
	public static boolean field119 = true;

	@ObfuscatedName("CHEOPWNH.d")
	public static int field96 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("CHEOPWNH.z")
	public static int field114 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("CHEOPWNH.y")
	public static int field113;

	@ObfuscatedName("CHEOPWNH.a(III)I")
	public static final int method11(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method26(var3, var5);
		int var8 = method26(var3 + 1, var5);
		int var9 = method26(var3, var5 + 1);
		int var10 = method26(var3 + 1, var5 + 1);
		int var11 = method24(var7, var8, var4, arg2);
		int var12 = method24(var9, var10, var4, arg2);
		return method24(var11, var12, var6, arg2);
	}

	@ObfuscatedName("CHEOPWNH.a(IIIB)I")
	public int method12(int arg0, int arg1, int arg2) {
		if ((field95[arg1][arg2][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field95[1][arg2][arg0] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("CHEOPWNH.a(IIIILXRENONSA;IIIILKJCMXHNO;[[[I)V")
	public static final void method13(int arg0, int arg1, int arg2, int arg3, CollisionMap arg4, int arg5, int arg6, int arg7, World3D arg8, int[][][] arg9) {
		int var10 = arg9[arg1][arg6][arg3];
		int var11 = arg9[arg1][arg6 + 1][arg3];
		int var12 = arg9[arg1][arg6 + 1][arg3 + 1];
		int var13 = arg9[arg1][arg6][arg3 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LocType var15 = LocType.method561(arg0);
		int var16 = (arg0 << 14) + (arg3 << 7) + arg6 + 0x40000000;
		if (!var15.field1380) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg5 << 6) + arg2);
		if (arg2 == 22) {
			ModelSource var18;
			if (var15.field1418 == -1 && var15.field1420 == null) {
				var18 = var15.method569(22, arg5, var10, var11, var12, var13, -1);
			} else {
				var18 = new ClientLocAnim(var15.field1418, var12, var13, var11, 22, arg0, true, var10, arg5);
			}

			arg8.method280(arg6, arg3, var17, var16, var14, arg7, var18);

			if (var15.field1425 && var15.field1380) {
				arg4.method535(arg3, arg6);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			ModelSource var19;
			if (var15.field1418 == -1 && var15.field1420 == null) {
				var19 = var15.method569(10, arg5, var10, var11, var12, var13, -1);
			} else {
				var19 = new ClientLocAnim(var15.field1418, var12, var13, var11, 10, arg0, true, var10, arg5);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg2 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg5 == 1 || arg5 == 3) {
					var21 = var15.field1394;
					var22 = var15.field1416;
				} else {
					var21 = var15.field1416;
					var22 = var15.field1394;
				}

				arg8.method284(arg7, var21, arg3, var19, var17, var20, arg6, var22, var14, var16);
			}

			if (var15.field1425) {
				arg4.method534(arg3, arg5, var15.field1394, var15.field1416, var15.field1424, arg6);
			}
		} else if (arg2 >= 12) {
			ModelSource var23;
			if (var15.field1418 == -1 && var15.field1420 == null) {
				var23 = var15.method569(arg2, arg5, var10, var11, var12, var13, -1);
			} else {
				var23 = new ClientLocAnim(var15.field1418, var12, var13, var11, arg2, arg0, true, var10, arg5);
			}

			arg8.method284(arg7, 1, arg3, var23, var17, 0, arg6, 1, var14, var16);

			if (var15.field1425) {
				arg4.method534(arg3, arg5, var15.field1394, var15.field1416, var15.field1424, arg6);
			}
		} else if (arg2 == 0) {
			ModelSource var24;
			if (var15.field1418 == -1 && var15.field1420 == null) {
				var24 = var15.method569(0, arg5, var10, var11, var12, var13, -1);
			} else {
				var24 = new ClientLocAnim(var15.field1418, var12, var13, var11, 0, arg0, true, var10, arg5);
			}

			arg8.method282(var14, 0, field110[arg5], null, arg6, var16, var17, arg3, var24, arg7);

			if (var15.field1425) {
				arg4.method533(arg5, var15.field1424, arg2, arg6, arg3);
			}
		} else if (arg2 == 1) {
			ModelSource var25;
			if (var15.field1418 == -1 && var15.field1420 == null) {
				var25 = var15.method569(1, arg5, var10, var11, var12, var13, -1);
			} else {
				var25 = new ClientLocAnim(var15.field1418, var12, var13, var11, 1, arg0, true, var10, arg5);
			}

			arg8.method282(var14, 0, field117[arg5], null, arg6, var16, var17, arg3, var25, arg7);

			if (var15.field1425) {
				arg4.method533(arg5, var15.field1424, arg2, arg6, arg3);
			}
		} else if (arg2 == 2) {
			int var26 = arg5 + 1 & 0x3;
			ModelSource var27;
			ModelSource var28;
			if (var15.field1418 == -1 && var15.field1420 == null) {
				var27 = var15.method569(2, arg5 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method569(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new ClientLocAnim(var15.field1418, var12, var13, var11, 2, arg0, true, var10, arg5 + 4);
				var28 = new ClientLocAnim(var15.field1418, var12, var13, var11, 2, arg0, true, var10, var26);
			}

			arg8.method282(var14, field110[var26], field110[arg5], var28, arg6, var16, var17, arg3, var27, arg7);

			if (var15.field1425) {
				arg4.method533(arg5, var15.field1424, arg2, arg6, arg3);
			}
		} else if (arg2 == 3) {
			ModelSource var29;
			if (var15.field1418 == -1 && var15.field1420 == null) {
				var29 = var15.method569(3, arg5, var10, var11, var12, var13, -1);
			} else {
				var29 = new ClientLocAnim(var15.field1418, var12, var13, var11, 3, arg0, true, var10, arg5);
			}

			arg8.method282(var14, 0, field117[arg5], null, arg6, var16, var17, arg3, var29, arg7);

			if (var15.field1425) {
				arg4.method533(arg5, var15.field1424, arg2, arg6, arg3);
			}
		} else if (arg2 == 9) {
			ModelSource var30;
			if (var15.field1418 == -1 && var15.field1420 == null) {
				var30 = var15.method569(arg2, arg5, var10, var11, var12, var13, -1);
			} else {
				var30 = new ClientLocAnim(var15.field1418, var12, var13, var11, arg2, arg0, true, var10, arg5);
			}

			arg8.method284(arg7, 1, arg3, var30, var17, 0, arg6, 1, var14, var16);

			if (var15.field1425) {
				arg4.method534(arg3, arg5, var15.field1394, var15.field1416, var15.field1424, arg6);
			}
		} else {
			if (var15.field1389) {
				if (arg5 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg5 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg5 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg2 == 4) {
				ModelSource var35;
				if (var15.field1418 == -1 && var15.field1420 == null) {
					var35 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new ClientLocAnim(var15.field1418, var12, var13, var11, 4, arg0, true, var10, 0);
				}

				arg8.method283(arg7, field110[arg5], arg5 * 512, var16, var17, arg6, 0, arg3, 0, var14, var35);
			} else if (arg2 == 5) {
				int var36 = 16;
				int var37 = arg8.method300(arg7, arg6, arg3);
				if (var37 > 0) {
					var36 = LocType.method561(var37 >> 14 & 0x7FFF).field1417;
				}

				ModelSource var38;
				if (var15.field1418 == -1 && var15.field1420 == null) {
					var38 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new ClientLocAnim(var15.field1418, var12, var13, var11, 4, arg0, true, var10, 0);
				}

				arg8.method283(arg7, field110[arg5], arg5 * 512, var16, var17, arg6, field98[arg5] * var36, arg3, field112[arg5] * var36, var14, var38);
			} else if (arg2 == 6) {
				ModelSource var39;
				if (var15.field1418 == -1 && var15.field1420 == null) {
					var39 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new ClientLocAnim(var15.field1418, var12, var13, var11, 4, arg0, true, var10, 0);
				}

				arg8.method283(arg7, 256, arg5, var16, var17, arg6, 0, arg3, 0, var14, var39);
			} else if (arg2 == 7) {
				ModelSource var40;
				if (var15.field1418 == -1 && var15.field1420 == null) {
					var40 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new ClientLocAnim(var15.field1418, var12, var13, var11, 4, arg0, true, var10, 0);
				}

				arg8.method283(arg7, 512, arg5, var16, var17, arg6, 0, arg3, 0, var14, var40);
			} else if (arg2 == 8) {
				ModelSource var41;
				if (var15.field1418 == -1 && var15.field1420 == null) {
					var41 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new ClientLocAnim(var15.field1418, var12, var13, var11, 4, arg0, true, var10, 0);
				}

				arg8.method283(arg7, 768, arg5, var16, var17, arg6, 0, arg3, 0, var14, var41);
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.a(IIII)V")
	public final void method14(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field104[arg0][arg2 + var4][arg1 + var5] = 0;
			}
		}

		if (arg2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field104[arg0][arg2][arg1 + var6] = field104[arg0][arg2 - 1][arg1 + var6];
			}
		}

		if (arg1 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field104[arg0][arg2 + var7][arg1] = field104[arg0][arg2 + var7][arg1 - 1];
			}
		}

		if (arg2 > 0 && field104[arg0][arg2 - 1][arg1] != 0) {
			field104[arg0][arg2][arg1] = field104[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && field104[arg0][arg2][arg1 - 1] != 0) {
			field104[arg0][arg2][arg1] = field104[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && field104[arg0][arg2 - 1][arg1 - 1] != 0) {
			field104[arg0][arg2][arg1] = field104[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@ObfuscatedName("CHEOPWNH.a([LXRENONSA;ILKJCMXHNO;)V")
	public final void method15(CollisionMap[] arg0, World3D arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field95[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field95[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method535(var5, var4);
						}
					}
				}
			}
		}

		field96 += (int) (Math.random() * 5.0D) - 2;
		if (field96 < -8) {
			field96 = -8;
		}

		if (field96 > 8) {
			field96 = 8;
		}

		field114 += (int) (Math.random() * 5.0D) - 2;
		if (field114 < -16) {
			field114 = -16;
		}

		if (field114 > 16) {
			field114 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field115[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field107 - 1; var16++) {
				for (int var17 = 1; var17 < field106 - 1; var17++) {
					int var18 = field104[var7][var17 + 1][var16] - field104[var7][var17 - 1][var16];
					int var19 = field104[var7][var17][var16 + 1] - field104[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field116[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field107; var26++) {
				field99[var26] = 0;
				field100[var26] = 0;
				field101[var26] = 0;
				field102[var26] = 0;
				field103[var26] = 0;
			}

			for (int var27 = -5; var27 < field106 + 5; var27++) {
				for (int var28 = 0; var28 < field107; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field106) {
						int var30 = field111[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							FloType var31 = FloType.field697[var30 - 1];
							field99[var28] += var31.field706;
							field100[var28] += var31.field704;
							field101[var28] += var31.field705;
							field102[var28] += var31.field707;
							field103[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field106) {
						int var33 = field111[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							FloType var34 = FloType.field697[var33 - 1];
							field99[var28] -= var34.field706;
							field100[var28] -= var34.field704;
							field101[var28] -= var34.field705;
							field102[var28] -= var34.field707;
							field103[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field106 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field107 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field107) {
							var35 += field99[var41];
							var36 += field100[var41];
							var37 += field101[var41];
							var38 += field102[var41];
							var39 += field103[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field107) {
							var35 -= field99[var42];
							var36 -= field100[var42];
							var37 -= field101[var42];
							var38 -= field102[var42];
							var39 -= field103[var42];
						}

						if (var40 >= 1 && var40 < field107 - 1 && (!field119 || (field95[0][var27][var40] & 0x2) != 0 || (field95[var7][var27][var40] & 0x10) == 0 && method12(var40, var7, var27) == field113)) {
							if (var7 < field105) {
								field105 = var7;
							}

							int var43 = field111[var7][var27][var40] & 0xFF;
							int var44 = field109[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field104[var7][var27][var40];
								int var46 = field104[var7][var27 + 1][var40];
								int var47 = field104[var7][var27 + 1][var40 + 1];
								int var48 = field104[var7][var27][var40 + 1];
								int var49 = field116[var27][var40];
								int var50 = field116[var27 + 1][var40];
								int var51 = field116[var27 + 1][var40 + 1];
								int var52 = field116[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method25(var55, var56, var57);
									var55 = field96 + var55 & 0xFF;
									var57 += field114;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method25(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field108[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !FloType.field697[var44 - 1].field702) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field118[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = Pix3D.field1377[method19(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method279(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method19(var53, var49), method19(var53, var50), method19(var53, var51), method19(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field108[var7][var27][var40] + 1;
									byte var61 = field97[var7][var27][var40];
									FloType var62 = FloType.field697[var44 - 1];
									int var63 = var62.field700;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = Pix3D.method550(var63);
										var65 = -1;
									} else if (var62.field699 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = Pix3D.field1377[method30(var62.field708, 96)];
									} else {
										var65 = method25(var62.field703, var62.field704, var62.field705);
										var64 = Pix3D.field1377[method30(var62.field708, 96)];
									}

									arg1.method279(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method19(var53, var49), method19(var53, var50), method19(var53, var51), method19(var53, var52), method30(var65, var49), method30(var65, var50), method30(var65, var51), method30(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field107 - 1; var66++) {
				for (int var67 = 1; var67 < field106 - 1; var67++) {
					arg1.method278(var7, var67, var66, method12(var66, var7, var67));
				}
			}
		}

		arg1.method305(-10, -50, -50);

		for (int var68 = 0; var68 < field106; var68++) {
			for (int var69 = 0; var69 < field107; var69++) {
				if ((field95[1][var68][var69] & 0x2) == 2) {
					arg1.method276(var68, var69);
				}
			}
		}

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
				for (int var75 = 0; var75 <= field107; var75++) {
					for (int var76 = 0; var76 <= field106; var76++) {
						if ((field118[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field118[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field107 && (field118[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field118[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field118[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field104[var80][var76][var77] - var84;
								int var86 = field104[var79][var76][var77];
								World3D.method277(var76 * 128, var86, var76 * 128, var78 * 128 + 128, var73, var77 * 128, var85, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field118[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field118[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field118[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field106 && (field118[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field118[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field118[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field104[var92][var89][var75] - var96;
								int var98 = field104[var91][var89][var75];
								World3D.method277(var89 * 128, var98, var90 * 128 + 128, var75 * 128, var73, var75 * 128, var97, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field118[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field118[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field118[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field107 && (field118[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field118[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field106) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field118[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field104[var74][var101][var103];
								World3D.method277(var101 * 128, var107, var102 * 128 + 128, var104 * 128 + 128, var73, var103 * 128, var107, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field118[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.a(IIZ[BIII[LXRENONSA;II)V")
	public final void method16(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, CollisionMap[] arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg5 + var10 > 0 && arg5 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
					arg6[arg3].field1355[arg5 + var10][arg7 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		Packet var12 = new Packet(arg2);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg4 == var13 && var14 >= arg8 && var14 < arg8 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method31(0, 0, var12, arg0, arg5 + WorldRegion.method461(arg0, var14 & 0x7, var15 & 0x7), arg3, arg7 + WorldRegion.method462(var15 & 0x7, var14 & 0x7, arg0));
					} else {
						method31(0, 0, var12, 0, -1, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.a(LZPGPWCCV;LMFMVIYHT;B)V")
	public static final void method17(OnDemand arg0, Packet arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.gsmarts();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			LocType var4 = LocType.method561(var2);
			var4.method563(arg0);

			while (true) {
				int var5 = arg1.gsmarts();
				if (var5 == 0) {
					break;
				}

				arg1.g1();
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.a(IBI)Z")
	public static final boolean method18(int arg0, int arg1) {
		LocType var2 = LocType.method561(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method570(arg0);
	}

	@ObfuscatedName("CHEOPWNH.a(II)I")
	public static final int method19(int arg0, int arg1) {
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

	@ObfuscatedName("CHEOPWNH.a(I[LXRENONSA;LKJCMXHNO;Z[BIIIIII)V")
	public final void method20(int arg0, CollisionMap[] arg1, World3D arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		Packet var11 = new Packet(arg3);
		int var12 = -1;
		while (true) {
			int var13 = var11.gsmarts();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.gsmarts();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.g1();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg9 == var18 && var17 >= arg6 && var17 < arg6 + 8 && var16 >= arg8 && var16 < arg8 + 8) {
					LocType var22 = LocType.method561(var12);
					int var23 = arg7 + WorldRegion.method463(arg5, var22.field1394, var21, var17 & 0x7, var22.field1416, var16 & 0x7);
					int var24 = arg4 + WorldRegion.method464(var22.field1416, arg5, var17 & 0x7, var16 & 0x7, var22.field1394, var21);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg0;
						if ((field95[1][var23][var24] & 0x2) == 2) {
							var25 = arg0 - 1;
						}

						CollisionMap var26 = null;
						if (var25 >= 0) {
							var26 = arg1[var25];
						}

						method21(arg2, var26, var24, arg0, var23, arg5 + var21 & 0x3, var20, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.a(LKJCMXHNO;LXRENONSA;IIIBIII)V")
	public final void method21(World3D arg0, CollisionMap arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field119 && (field95[0][arg4][arg2] & 0x2) == 0) {
			if ((field95[arg3][arg4][arg2] & 0x10) != 0) {
				return;
			}

			if (method12(arg2, arg3, arg4) != field113) {
				return;
			}
		}

		if (arg3 < field105) {
			field105 = arg3;
		}

		int var9 = field104[arg3][arg4][arg2];
		int var10 = field104[arg3][arg4 + 1][arg2];
		int var11 = field104[arg3][arg4 + 1][arg2 + 1];
		int var12 = field104[arg3][arg4][arg2 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		LocType var14 = LocType.method561(arg7);
		int var15 = (arg7 << 14) + (arg2 << 7) + arg4 + 0x40000000;
		if (!var14.field1380) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg6);
		if (arg6 == 22) {
			if (!field119 || var14.field1380 || var14.field1386) {
				ModelSource var17;
				if (var14.field1418 == -1 && var14.field1420 == null) {
					var17 = var14.method569(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new ClientLocAnim(var14.field1418, var11, var12, var10, 22, arg7, true, var9, arg5);
				}

				arg0.method280(arg4, arg2, var16, var15, var13, arg3, var17);

				if (var14.field1425 && var14.field1380 && arg1 != null) {
					arg1.method535(arg2, arg4);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			ModelSource var18;
			if (var14.field1418 == -1 && var14.field1420 == null) {
				var18 = var14.method569(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new ClientLocAnim(var14.field1418, var11, var12, var10, 10, arg7, true, var9, arg5);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg6 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field1394;
					var21 = var14.field1416;
				} else {
					var20 = var14.field1416;
					var21 = var14.field1394;
				}

				if (arg0.method284(arg3, var20, arg2, var18, var16, var19, arg4, var21, var13, var15) && var14.field1422) {
					Model var22;
					if (var18 instanceof Model) {
						var22 = (Model) var18;
					} else {
						var22 = var14.method569(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field1061 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field115[arg3][arg4 + var23][arg2 + var24]) {
									field115[arg3][arg4 + var23][arg2 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1425 && arg1 != null) {
				arg1.method534(arg2, arg5, var14.field1394, var14.field1416, var14.field1424, arg4);
			}
		} else if (arg6 >= 12) {
			ModelSource var26;
			if (var14.field1418 == -1 && var14.field1420 == null) {
				var26 = var14.method569(arg6, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new ClientLocAnim(var14.field1418, var11, var12, var10, arg6, arg7, true, var9, arg5);
			}

			arg0.method284(arg3, 1, arg2, var26, var16, 0, arg4, 1, var13, var15);

			if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg3 > 0) {
				field118[arg3][arg4][arg2] |= 0x924;
			}

			if (var14.field1425 && arg1 != null) {
				arg1.method534(arg2, arg5, var14.field1394, var14.field1416, var14.field1424, arg4);
			}
		} else if (arg6 == 0) {
			ModelSource var27;
			if (var14.field1418 == -1 && var14.field1420 == null) {
				var27 = var14.method569(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new ClientLocAnim(var14.field1418, var11, var12, var10, 0, arg7, true, var9, arg5);
			}

			arg0.method282(var13, 0, field110[arg5], null, arg4, var15, var16, arg2, var27, arg3);

			if (arg5 == 0) {
				if (var14.field1422) {
					field115[arg3][arg4][arg2] = 50;
					field115[arg3][arg4][arg2 + 1] = 50;
				}

				if (var14.field1413) {
					field118[arg3][arg4][arg2] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field1422) {
					field115[arg3][arg4][arg2 + 1] = 50;
					field115[arg3][arg4 + 1][arg2 + 1] = 50;
				}

				if (var14.field1413) {
					field118[arg3][arg4][arg2 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field1422) {
					field115[arg3][arg4 + 1][arg2] = 50;
					field115[arg3][arg4 + 1][arg2 + 1] = 50;
				}

				if (var14.field1413) {
					field118[arg3][arg4 + 1][arg2] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field1422) {
					field115[arg3][arg4][arg2] = 50;
					field115[arg3][arg4 + 1][arg2] = 50;
				}

				if (var14.field1413) {
					field118[arg3][arg4][arg2] |= 0x492;
				}
			}

			if (var14.field1425 && arg1 != null) {
				arg1.method533(arg5, var14.field1424, arg6, arg4, arg2);
			}

			if (var14.field1417 != 16) {
				arg0.method290(arg2, var14.field1417, arg3, arg4);
			}
		} else if (arg6 == 1) {
			ModelSource var28;
			if (var14.field1418 == -1 && var14.field1420 == null) {
				var28 = var14.method569(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new ClientLocAnim(var14.field1418, var11, var12, var10, 1, arg7, true, var9, arg5);
			}

			arg0.method282(var13, 0, field117[arg5], null, arg4, var15, var16, arg2, var28, arg3);

			if (var14.field1422) {
				if (arg5 == 0) {
					field115[arg3][arg4][arg2 + 1] = 50;
				} else if (arg5 == 1) {
					field115[arg3][arg4 + 1][arg2 + 1] = 50;
				} else if (arg5 == 2) {
					field115[arg3][arg4 + 1][arg2] = 50;
				} else if (arg5 == 3) {
					field115[arg3][arg4][arg2] = 50;
				}
			}

			if (var14.field1425 && arg1 != null) {
				arg1.method533(arg5, var14.field1424, arg6, arg4, arg2);
			}
		} else if (arg6 == 2) {
			int var29 = arg5 + 1 & 0x3;
			ModelSource var30;
			ModelSource var31;
			if (var14.field1418 == -1 && var14.field1420 == null) {
				var30 = var14.method569(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method569(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new ClientLocAnim(var14.field1418, var11, var12, var10, 2, arg7, true, var9, arg5 + 4);
				var31 = new ClientLocAnim(var14.field1418, var11, var12, var10, 2, arg7, true, var9, var29);
			}

			arg0.method282(var13, field110[var29], field110[arg5], var31, arg4, var15, var16, arg2, var30, arg3);

			if (var14.field1413) {
				if (arg5 == 0) {
					field118[arg3][arg4][arg2] |= 0x249;
					field118[arg3][arg4][arg2 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field118[arg3][arg4][arg2 + 1] |= 0x492;
					field118[arg3][arg4 + 1][arg2] |= 0x249;
				} else if (arg5 == 2) {
					field118[arg3][arg4 + 1][arg2] |= 0x249;
					field118[arg3][arg4][arg2] |= 0x492;
				} else if (arg5 == 3) {
					field118[arg3][arg4][arg2] |= 0x492;
					field118[arg3][arg4][arg2] |= 0x249;
				}
			}

			if (var14.field1425 && arg1 != null) {
				arg1.method533(arg5, var14.field1424, arg6, arg4, arg2);
			}

			if (var14.field1417 != 16) {
				arg0.method290(arg2, var14.field1417, arg3, arg4);
			}
		} else if (arg6 == 3) {
			ModelSource var32;
			if (var14.field1418 == -1 && var14.field1420 == null) {
				var32 = var14.method569(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new ClientLocAnim(var14.field1418, var11, var12, var10, 3, arg7, true, var9, arg5);
			}

			arg0.method282(var13, 0, field117[arg5], null, arg4, var15, var16, arg2, var32, arg3);

			if (var14.field1422) {
				if (arg5 == 0) {
					field115[arg3][arg4][arg2 + 1] = 50;
				} else if (arg5 == 1) {
					field115[arg3][arg4 + 1][arg2 + 1] = 50;
				} else if (arg5 == 2) {
					field115[arg3][arg4 + 1][arg2] = 50;
				} else if (arg5 == 3) {
					field115[arg3][arg4][arg2] = 50;
				}
			}

			if (var14.field1425 && arg1 != null) {
				arg1.method533(arg5, var14.field1424, arg6, arg4, arg2);
			}
		} else if (arg6 == 9) {
			ModelSource var33;
			if (var14.field1418 == -1 && var14.field1420 == null) {
				var33 = var14.method569(arg6, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new ClientLocAnim(var14.field1418, var11, var12, var10, arg6, arg7, true, var9, arg5);
			}

			arg0.method284(arg3, 1, arg2, var33, var16, 0, arg4, 1, var13, var15);

			if (var14.field1425 && arg1 != null) {
				arg1.method534(arg2, arg5, var14.field1394, var14.field1416, var14.field1424, arg4);
			}
		} else {
			if (var14.field1389) {
				if (arg5 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg5 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg5 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg6 == 4) {
				ModelSource var38;
				if (var14.field1418 == -1 && var14.field1420 == null) {
					var38 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new ClientLocAnim(var14.field1418, var11, var12, var10, 4, arg7, true, var9, 0);
				}

				arg0.method283(arg3, field110[arg5], arg5 * 512, var15, var16, arg4, 0, arg2, 0, var13, var38);
			} else if (arg6 == 5) {
				int var39 = 16;
				int var40 = arg0.method300(arg3, arg4, arg2);
				if (var40 > 0) {
					var39 = LocType.method561(var40 >> 14 & 0x7FFF).field1417;
				}

				ModelSource var41;
				if (var14.field1418 == -1 && var14.field1420 == null) {
					var41 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new ClientLocAnim(var14.field1418, var11, var12, var10, 4, arg7, true, var9, 0);
				}

				arg0.method283(arg3, field110[arg5], arg5 * 512, var15, var16, arg4, field98[arg5] * var39, arg2, field112[arg5] * var39, var13, var41);
			} else if (arg6 == 6) {
				ModelSource var42;
				if (var14.field1418 == -1 && var14.field1420 == null) {
					var42 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new ClientLocAnim(var14.field1418, var11, var12, var10, 4, arg7, true, var9, 0);
				}

				arg0.method283(arg3, 256, arg5, var15, var16, arg4, 0, arg2, 0, var13, var42);
			} else if (arg6 == 7) {
				ModelSource var43;
				if (var14.field1418 == -1 && var14.field1420 == null) {
					var43 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new ClientLocAnim(var14.field1418, var11, var12, var10, 4, arg7, true, var9, 0);
				}

				arg0.method283(arg3, 512, arg5, var15, var16, arg4, 0, arg2, 0, var13, var43);
			} else if (arg6 == 8) {
				ModelSource var44;
				if (var14.field1418 == -1 && var14.field1420 == null) {
					var44 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new ClientLocAnim(var14.field1418, var11, var12, var10, 4, arg7, true, var9, 0);
				}

				arg0.method283(arg3, 768, arg5, var15, var16, arg4, 0, arg2, 0, var13, var44);
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.a(IZII[BI[LXRENONSA;)V")
	public final void method22(int arg0, int arg1, int arg2, byte[] arg3, int arg4, CollisionMap[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg2 + var8 > 0 && arg2 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg5[var7].field1355[arg2 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		Packet var10 = new Packet(arg3);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method31(arg4, arg1, var10, 0, arg2 + var12, var11, arg0 + var13);
				}
			}
		}
	}

	public World(int[][][] arg0, byte[][][] arg1, int arg2, int arg3) {
		field105 = 99;
		field106 = arg3;
		field107 = arg2;
		field104 = arg0;
		field95 = arg1;
		field111 = new byte[4][field106][field107];
		field109 = new byte[4][field106][field107];
		field108 = new byte[4][field106][field107];
		field97 = new byte[4][field106][field107];
		field118 = new int[4][field106 + 1][field107 + 1];
		field115 = new byte[4][field106 + 1][field107 + 1];
		field116 = new int[field106 + 1][field107 + 1];
		field99 = new int[field107];
		field100 = new int[field107];
		field101 = new int[field107];
		field102 = new int[field107];
		field103 = new int[field107];
	}

	@ObfuscatedName("CHEOPWNH.b(II)I")
	public static final int method23(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("CHEOPWNH.b(IIII)I")
	public static final int method24(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - Pix3D.field1366[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("CHEOPWNH.b(III)I")
	public final int method25(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("CHEOPWNH.c(II)I")
	public static final int method26(int arg0, int arg1) {
		int var2 = method23(arg0 - 1, arg1 - 1) + method23(arg0 + 1, arg1 - 1) + method23(arg0 - 1, arg1 + 1) + method23(arg0 + 1, arg1 + 1);
		int var3 = method23(arg0 - 1, arg1) + method23(arg0 + 1, arg1) + method23(arg0, arg1 - 1) + method23(arg0, arg1 + 1);
		int var4 = method23(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("CHEOPWNH.a(I[LXRENONSA;IILKJCMXHNO;[B)V")
	public final void method27(int arg0, CollisionMap[] arg1, int arg2, World3D arg3, byte[] arg4) {
		Packet var6 = new Packet(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.gsmarts();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.gsmarts();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.g1();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg2 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field95[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					CollisionMap var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method21(arg3, var20, var18, var13, var17, var16, var15, var7);
				}
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.a(IIIII)V")
	public final void method28(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg2; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg3; var6++) {
				if (var6 >= 0 && var6 < field106 && var5 >= 0 && var5 < field107) {
					field115[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field104[0][var6][var5] = field104[0][var6 - 1][var5];
					}

					if (arg0 + arg3 == var6 && var6 < field106 - 1) {
						field104[0][var6][var5] = field104[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field104[0][var6][var5] = field104[0][var6][var5 - 1];
					}

					if (arg1 + arg2 == var5 && var5 < field107 - 1) {
						field104[0][var6][var5] = field104[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.a(II[BI)Z")
	public static final boolean method29(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		Packet var4 = new Packet(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.gsmarts();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.gsmarts();
					if (var9 == 0) {
						break;
					}

					var4.g1();
				} else {
					int var10 = var4.gsmarts();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.g1() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LocType var16 = LocType.method561(var5);
						if (var13 != 22 || !field119 || var16.field1380 || var16.field1386) {
							var3 &= var16.method566();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.d(II)I")
	public final int method30(int arg0, int arg1) {
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

	@ObfuscatedName("CHEOPWNH.a(IBILMFMVIYHT;IIII)V")
	public final void method31(int arg0, int arg1, Packet arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg4 >= 0 && arg4 < 104 && arg6 >= 0 && arg6 < 104) {
			field95[arg5][arg4][arg6] = 0;
			while (true) {
				int var8 = arg2.g1();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg2.g1();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg5 == 0) {
						field104[0][arg4][arg6] = -var9 * 8;
						return;
					}

					field104[arg5][arg4][arg6] = field104[arg5 - 1][arg4][arg6] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field109[arg5][arg4][arg6] = arg2.g1b();
					field108[arg5][arg4][arg6] = (byte) ((var8 - 2) / 4);
					field97[arg5][arg4][arg6] = (byte) (var8 + arg3 - 2 & 0x3);
				} else if (var8 <= 81) {
					field95[arg5][arg4][arg6] = (byte) (var8 - 49);
				} else {
					field111[arg5][arg4][arg6] = (byte) (var8 - 81);
				}
			}

			if (arg5 == 0) {
				field104[0][arg4][arg6] = -method32(arg4 + arg0 + 932731, arg6 + 556238 + arg1) * 8;
			} else {
				field104[arg5][arg4][arg6] = field104[arg5 - 1][arg4][arg6] - 240;
			}
		} else {
			while (true) {
				int var10 = arg2.g1();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg2.g1();
					return;
				}

				if (var10 <= 49) {
					arg2.g1();
				}
			}
		}
	}

	@ObfuscatedName("CHEOPWNH.e(II)I")
	public static final int method32(int arg0, int arg1) {
		int var2 = method11(arg0 + 45365, arg1 + 91923, 4) + (method11(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method11(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
