package deob;

@ObfuscatedName("c")
public final class class3 {

	@ObfuscatedName("c.e")
	public static boolean field32 = true;

	@ObfuscatedName("c.f")
	public static int field33;

	@ObfuscatedName("c.g")
	public int field34;

	@ObfuscatedName("c.h")
	public int field35;

	@ObfuscatedName("c.i")
	public int[][][] field36;

	@ObfuscatedName("c.j")
	public byte[][][] field37;

	@ObfuscatedName("c.k")
	public byte[][][] field38;

	@ObfuscatedName("c.l")
	public byte[][][] field39;

	@ObfuscatedName("c.m")
	public byte[][][] field40;

	@ObfuscatedName("c.n")
	public byte[][][] field41;

	@ObfuscatedName("c.o")
	public byte[][][] field42;

	@ObfuscatedName("c.p")
	public int[][] field43;

	@ObfuscatedName("c.q")
	public int[] field44;

	@ObfuscatedName("c.r")
	public int[] field45;

	@ObfuscatedName("c.s")
	public int[] field46;

	@ObfuscatedName("c.t")
	public int[] field47;

	@ObfuscatedName("c.u")
	public int[] field48;

	@ObfuscatedName("c.v")
	public int[][][] field49;

	@ObfuscatedName("c.w")
	public static final int[] field50 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.x")
	public static final int[] field51 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.y")
	public static final int[] field52 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.z")
	public static final int[] field53 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.A")
	public static int field54 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.B")
	public static int field55 = (int) (Math.random() * 33.0D) - 16;

	public class3(int[][][] arg0, byte[][][] arg1, int arg2, int arg3) {
		field34 = arg3;
		field35 = arg2;
		field36 = arg0;
		field37 = arg1;
		field38 = new byte[4][field34][field35];
		field39 = new byte[4][field34][field35];
		field40 = new byte[4][field34][field35];
		field41 = new byte[4][field34][field35];
		field49 = new int[4][field34 + 1][field35 + 1];
		field42 = new byte[4][field34 + 1][field35 + 1];
		field43 = new int[field34 + 1][field35 + 1];
		field44 = new int[field35];
		field45 = new int[field35];
		field46 = new int[field35];
		field47 = new int[field35];
		field48 = new int[field35];
	}

	@ObfuscatedName("c.a(IIIII)V")
	public final void method14(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field34 && var5 >= 0 && var5 < field35) {
					field42[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field36[0][var6][var5] = field36[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field34 - 1) {
						field36[0][var6][var5] = field36[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field36[0][var6][var5] = field36[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field35 - 1) {
						field36[0][var6][var5] = field36[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(I[BIIII)V")
	public final void method15(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
		class38 var6 = new class38(arg1);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg2 + var8;
					int var11 = arg4 + var9;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						field37[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.method225();
							if (var12 == 0) {
								break;
							}

							if (var12 == 1) {
								break;
							}

							if (var12 <= 49) {
								field39[var7][var10][var11] = var6.method226();
								field40[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								field41[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								field37[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								field38[var7][var10][var11] = (byte) (var12 - 81);
							}
						}

						int var13 = var6.method225();
						if (var13 == 1) {
							var13 = 0;
						}

						if (var7 == 0) {
							field36[0][var10][var11] = -var13 * 8;
						} else {
							field36[var7][var10][var11] = field36[var7 - 1][var10][var11] - var13 * 8;
						}

						if (var7 == 0) {
							field36[0][var10][var11] = -method22(var10 + arg0 + 932731, var11 + 556238 + arg3) * 8;
						} else {
							field36[var7][var10][var11] = field36[var7 - 1][var10][var11] - 240;
						}
					} else {
						while (true) {
							int var14 = var6.method225();
							if (var14 == 0) {
								break;
							}

							if (var14 == 1) {
								break;
							}

							if (var14 <= 49) {
								var6.method225();
							}
						}

						var6.method225();
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(I[BIZ)Z")
	public static final boolean method16(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		class38 var4 = new class38(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method239();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method239();
					if (var9 == 0) {
						break;
					}

					var4.method225();
				} else {
					int var10 = var4.method239();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method225() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class57 var16 = class57.method326(var5);
						if (var13 != 22 || !field32 || var16.field833 || var16.field853) {
							var3 &= var16.method330();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(Llb;ILub;)V")
	public static final void method17(class38 arg0, class47 arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method239();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			class57 var4 = class57.method326(var2);
			var4.method331(arg1);

			while (true) {
				int var5 = arg0.method239();
				if (var5 == 0) {
					break;
				}

				arg0.method225();
			}
		}
	}

	@ObfuscatedName("c.a(IIB[Ljc;Lr;[B)V")
	public final void method18(int arg0, int arg1, class62[] arg2, class18 arg3, byte[] arg4) {
		class38 var6 = new class38(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method239();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method239();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method225();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg1 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field37[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					class62 var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method19(var15, arg3, var13, var7, var20, var16, var17, var18);
				}
			}
		}
	}

	@ObfuscatedName("c.a(ILr;IBILjc;III)V")
	public final void method19(int arg0, class18 arg1, int arg2, int arg3, class62 arg4, int arg5, int arg6, int arg7) {
		if (field32) {
			if ((field37[arg2][arg6][arg7] & 0x10) != 0) {
				return;
			}

			if (method21(arg2, arg7, arg6) != field33) {
				return;
			}
		}

		int var9 = field36[arg2][arg6][arg7];
		int var10 = field36[arg2][arg6 + 1][arg7];
		int var11 = field36[arg2][arg6 + 1][arg7 + 1];
		int var12 = field36[arg2][arg6][arg7 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		class57 var14 = class57.method326(arg3);
		int var15 = (arg3 << 14) + (arg7 << 7) + arg6 + 0x40000000;
		if (!var14.field833) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg0);
		if (arg0 == 22) {
			if (!field32 || var14.field833 || var14.field853) {
				class24 var17;
				if (var14.field837 == -1) {
					var17 = var14.method332(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new class28(22, var9, var12, var11, var10, var14.field837, true, arg5, arg3);
				}

				arg1.method56(var13, arg7, var16, arg2, var17, arg6, var15);

				if (var14.field831 && var14.field833 && arg4 != null) {
					arg4.method356(arg6, arg7);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			class24 var18;
			if (var14.field837 == -1) {
				var18 = var14.method332(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new class28(10, var9, var12, var11, var10, var14.field837, true, arg5, arg3);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg0 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field830;
					var21 = var14.field829;
				} else {
					var20 = var14.field829;
					var21 = var14.field830;
				}

				if (arg1.method60(var20, var18, arg6, var21, var19, arg2, arg7, var16, var15, var13) && var14.field845) {
					class31 var22;
					if (var18 instanceof class31) {
						var22 = (class31) var18;
					} else {
						var22 = var14.method332(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field507 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field42[arg2][arg6 + var23][arg7 + var24]) {
									field42[arg2][arg6 + var23][arg7 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field831 && arg4 != null) {
				arg4.method355(arg7, var14.field830, var14.field829, arg6, var14.field832, arg5);
			}
		} else if (arg0 >= 12) {
			class24 var26;
			if (var14.field837 == -1) {
				var26 = var14.method332(arg0, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new class28(arg0, var9, var12, var11, var10, var14.field837, true, arg5, arg3);
			}

			arg1.method60(1, var26, arg6, 1, 0, arg2, arg7, var16, var15, var13);

			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0) {
				field49[arg2][arg6][arg7] |= 0x924;
			}

			if (var14.field831 && arg4 != null) {
				arg4.method355(arg7, var14.field830, var14.field829, arg6, var14.field832, arg5);
			}
		} else if (arg0 == 0) {
			class24 var27;
			if (var14.field837 == -1) {
				var27 = var14.method332(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new class28(0, var9, var12, var11, var10, var14.field837, true, arg5, arg3);
			}

			arg1.method58(arg2, arg6, 0, var16, arg7, var27, var15, field50[arg5], var13, null);

			if (arg5 == 0) {
				if (var14.field845) {
					field42[arg2][arg6][arg7] = 50;
					field42[arg2][arg6][arg7 + 1] = 50;
				}

				if (var14.field836) {
					field49[arg2][arg6][arg7] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field845) {
					field42[arg2][arg6][arg7 + 1] = 50;
					field42[arg2][arg6 + 1][arg7 + 1] = 50;
				}

				if (var14.field836) {
					field49[arg2][arg6][arg7 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field845) {
					field42[arg2][arg6 + 1][arg7] = 50;
					field42[arg2][arg6 + 1][arg7 + 1] = 50;
				}

				if (var14.field836) {
					field49[arg2][arg6 + 1][arg7] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field845) {
					field42[arg2][arg6][arg7] = 50;
					field42[arg2][arg6 + 1][arg7] = 50;
				}

				if (var14.field836) {
					field49[arg2][arg6][arg7] |= 0x492;
				}
			}

			if (var14.field831 && arg4 != null) {
				arg4.method354(arg7, arg5, arg6, arg0, var14.field832);
			}

			if (var14.field838 != 16) {
				arg1.method66(arg7, arg6, var14.field838, arg2);
			}
		} else if (arg0 == 1) {
			class24 var28;
			if (var14.field837 == -1) {
				var28 = var14.method332(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new class28(1, var9, var12, var11, var10, var14.field837, true, arg5, arg3);
			}

			arg1.method58(arg2, arg6, 0, var16, arg7, var28, var15, field51[arg5], var13, null);

			if (var14.field845) {
				if (arg5 == 0) {
					field42[arg2][arg6][arg7 + 1] = 50;
				} else if (arg5 == 1) {
					field42[arg2][arg6 + 1][arg7 + 1] = 50;
				} else if (arg5 == 2) {
					field42[arg2][arg6 + 1][arg7] = 50;
				} else if (arg5 == 3) {
					field42[arg2][arg6][arg7] = 50;
				}
			}

			if (var14.field831 && arg4 != null) {
				arg4.method354(arg7, arg5, arg6, arg0, var14.field832);
			}
		} else if (arg0 == 2) {
			int var29 = arg5 + 1 & 0x3;
			class24 var30;
			class24 var31;
			if (var14.field837 == -1) {
				var30 = var14.method332(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method332(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new class28(2, var9, var12, var11, var10, var14.field837, true, arg5 + 4, arg3);
				var31 = new class28(2, var9, var12, var11, var10, var14.field837, true, var29, arg3);
			}

			arg1.method58(arg2, arg6, field50[var29], var16, arg7, var30, var15, field50[arg5], var13, var31);

			if (var14.field836) {
				if (arg5 == 0) {
					field49[arg2][arg6][arg7] |= 0x249;
					field49[arg2][arg6][arg7 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field49[arg2][arg6][arg7 + 1] |= 0x492;
					field49[arg2][arg6 + 1][arg7] |= 0x249;
				} else if (arg5 == 2) {
					field49[arg2][arg6 + 1][arg7] |= 0x249;
					field49[arg2][arg6][arg7] |= 0x492;
				} else if (arg5 == 3) {
					field49[arg2][arg6][arg7] |= 0x492;
					field49[arg2][arg6][arg7] |= 0x249;
				}
			}

			if (var14.field831 && arg4 != null) {
				arg4.method354(arg7, arg5, arg6, arg0, var14.field832);
			}

			if (var14.field838 != 16) {
				arg1.method66(arg7, arg6, var14.field838, arg2);
			}
		} else if (arg0 == 3) {
			class24 var32;
			if (var14.field837 == -1) {
				var32 = var14.method332(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new class28(3, var9, var12, var11, var10, var14.field837, true, arg5, arg3);
			}

			arg1.method58(arg2, arg6, 0, var16, arg7, var32, var15, field51[arg5], var13, null);

			if (var14.field845) {
				if (arg5 == 0) {
					field42[arg2][arg6][arg7 + 1] = 50;
				} else if (arg5 == 1) {
					field42[arg2][arg6 + 1][arg7 + 1] = 50;
				} else if (arg5 == 2) {
					field42[arg2][arg6 + 1][arg7] = 50;
				} else if (arg5 == 3) {
					field42[arg2][arg6][arg7] = 50;
				}
			}

			if (var14.field831 && arg4 != null) {
				arg4.method354(arg7, arg5, arg6, arg0, var14.field832);
			}
		} else if (arg0 == 9) {
			class24 var33;
			if (var14.field837 == -1) {
				var33 = var14.method332(arg0, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new class28(arg0, var9, var12, var11, var10, var14.field837, true, arg5, arg3);
			}

			arg1.method60(1, var33, arg6, 1, 0, arg2, arg7, var16, var15, var13);

			if (var14.field831 && arg4 != null) {
				arg4.method355(arg7, var14.field830, var14.field829, arg6, var14.field832, arg5);
			}
		} else {
			if (var14.field834) {
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

			if (arg0 == 4) {
				class24 var38;
				if (var14.field837 == -1) {
					var38 = var14.method332(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new class28(4, var9, var12, var11, var10, var14.field837, true, 0, arg3);
				}

				arg1.method59(var15, var38, 0, arg2, arg5 * 512, field50[arg5], 0, arg6, var16, var13, arg7);
			} else if (arg0 == 5) {
				int var39 = 16;
				int var40 = arg1.method76(arg2, arg6, arg7);
				if (var40 > 0) {
					var39 = class57.method326(var40 >> 14 & 0x7FFF).field838;
				}

				class24 var41;
				if (var14.field837 == -1) {
					var41 = var14.method332(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new class28(4, var9, var12, var11, var10, var14.field837, true, 0, arg3);
				}

				arg1.method59(var15, var41, field52[arg5] * var39, arg2, arg5 * 512, field50[arg5], field53[arg5] * var39, arg6, var16, var13, arg7);
			} else if (arg0 == 6) {
				class24 var42;
				if (var14.field837 == -1) {
					var42 = var14.method332(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new class28(4, var9, var12, var11, var10, var14.field837, true, 0, arg3);
				}

				arg1.method59(var15, var42, 0, arg2, arg5, 256, 0, arg6, var16, var13, arg7);
			} else if (arg0 == 7) {
				class24 var43;
				if (var14.field837 == -1) {
					var43 = var14.method332(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new class28(4, var9, var12, var11, var10, var14.field837, true, 0, arg3);
				}

				arg1.method59(var15, var43, 0, arg2, arg5, 512, 0, arg6, var16, var13, arg7);
			} else if (arg0 == 8) {
				class24 var44;
				if (var14.field837 == -1) {
					var44 = var14.method332(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new class28(4, var9, var12, var11, var10, var14.field837, true, 0, arg3);
				}

				arg1.method59(var15, var44, 0, arg2, arg5, 768, 0, arg6, var16, var13, arg7);
			}
		}
	}

	@ObfuscatedName("c.a(BLr;[Ljc;)V")
	public final void method20(class18 arg0, class62[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field37[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field37[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method356(var4, var5);
						}
					}
				}
			}
		}

		field54 += (int) (Math.random() * 5.0D) - 2;
		if (field54 < -8) {
			field54 = -8;
		}

		if (field54 > 8) {
			field54 = 8;
		}

		field55 += (int) (Math.random() * 5.0D) - 2;
		if (field55 < -16) {
			field55 = -16;
		}

		if (field55 > 16) {
			field55 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field42[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field35 - 1; var16++) {
				for (int var17 = 1; var17 < field34 - 1; var17++) {
					int var18 = field36[var7][var17 + 1][var16] - field36[var7][var17 - 1][var16];
					int var19 = field36[var7][var17][var16 + 1] - field36[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field43[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field35; var26++) {
				field44[var26] = 0;
				field45[var26] = 0;
				field46[var26] = 0;
				field47[var26] = 0;
				field48[var26] = 0;
			}

			for (int var27 = -5; var27 < field34 + 5; var27++) {
				for (int var28 = 0; var28 < field35; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field34) {
						int var30 = field38[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							class63 var31 = class63.field952[var30 - 1];
							field44[var28] += var31.field961;
							field45[var28] += var31.field959;
							field46[var28] += var31.field960;
							field47[var28] += var31.field962;
							field48[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field34) {
						int var33 = field38[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							class63 var34 = class63.field952[var33 - 1];
							field44[var28] -= var34.field961;
							field45[var28] -= var34.field959;
							field46[var28] -= var34.field960;
							field47[var28] -= var34.field962;
							field48[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field34 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field35 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field35) {
							var35 += field44[var41];
							var36 += field45[var41];
							var37 += field46[var41];
							var38 += field47[var41];
							var39 += field48[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field35) {
							var35 -= field44[var42];
							var36 -= field45[var42];
							var37 -= field46[var42];
							var38 -= field47[var42];
							var39 -= field48[var42];
						}

						if (var40 >= 1 && var40 < field35 - 1 && (!field32 || (field37[var7][var27][var40] & 0x10) == 0 && method21(var7, var40, var27) == field33)) {
							int var43 = field38[var7][var27][var40] & 0xFF;
							int var44 = field39[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field36[var7][var27][var40];
								int var46 = field36[var7][var27 + 1][var40];
								int var47 = field36[var7][var27 + 1][var40 + 1];
								int var48 = field36[var7][var27][var40 + 1];
								int var49 = field43[var27][var40];
								int var50 = field43[var27 + 1][var40];
								int var51 = field43[var27 + 1][var40 + 1];
								int var52 = field43[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method29(var55, var56, var57);
									var55 = field54 + var55 & 0xFF;
									var57 += field55;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method29(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field40[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !class63.field952[var44 - 1].field957) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field49[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = class34.field590[method27(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method55(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method27(var53, var49), method27(var53, var50), method27(var53, var51), method27(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field40[var7][var27][var40] + 1;
									byte var61 = field41[var7][var27][var40];
									class63 var62 = class63.field952[var44 - 1];
									int var63 = var62.field955;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = class34.method169(var63);
										var65 = -1;
									} else if (var62.field954 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method29(var62.field958, var62.field959, var62.field960);
										var64 = class34.field590[method28(var62.field963, 96)];
									}

									arg0.method55(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method27(var53, var49), method27(var53, var50), method27(var53, var51), method27(var53, var52), method28(var65, var49), method28(var65, var50), method28(var65, var51), method28(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field35 - 1; var66++) {
				for (int var67 = 1; var67 < field34 - 1; var67++) {
					arg0.method54(var7, var67, var66, method21(var7, var66, var67));
				}
			}
		}

		arg0.method81(64, 768, -50, -10, -50);

		for (int var68 = 0; var68 < field34; var68++) {
			for (int var69 = 0; var69 < field35; var69++) {
				if ((field37[1][var68][var69] & 0x2) == 2) {
					arg0.method52(var69, var68);
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
				for (int var75 = 0; var75 <= field35; var75++) {
					for (int var76 = 0; var76 <= field34; var76++) {
						if ((field49[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field49[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field35 && (field49[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label321: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field49[var79 - 1][var76][var81] & var70) == 0) {
										break label321;
									}
								}

								var79--;
							}

							label310: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field49[var80 + 1][var76][var82] & var70) == 0) {
										break label310;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field36[var80][var76][var77] - var84;
								int var86 = field36[var79][var76][var77];
								class18.method53(var78 * 128 + 128, var86, var77 * 128, var73, var76 * 128, var76 * 128, var85, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field49[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field49[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field49[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field34 && (field49[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label374: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field49[var91 - 1][var93][var75] & var71) == 0) {
										break label374;
									}
								}

								var91--;
							}

							label363: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field49[var92 + 1][var94][var75] & var71) == 0) {
										break label363;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field36[var92][var89][var75] - var96;
								int var98 = field36[var91][var89][var75];
								class18.method53(var75 * 128, var98, var75 * 128, var73, var89 * 128, var90 * 128 + 128, var97, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field49[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field49[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field49[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field35 && (field49[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label427: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field49[var74][var101 - 1][var105] & var72) == 0) {
										break label427;
									}
								}

								var101--;
							}

							label416: while (var102 < field34) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field49[var74][var102 + 1][var106] & var72) == 0) {
										break label416;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field36[var74][var101][var103];
								class18.method53(var104 * 128 + 128, var107, var103 * 128, var73, var101 * 128, var102 * 128 + 128, var107, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field49[var74][var108][var109] &= ~var72;
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
	public int method21(int arg0, int arg1, int arg2) {
		if ((field37[arg0][arg2][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field37[1][arg2][arg1] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("c.a(II)I")
	public static final int method22(int arg0, int arg1) {
		int var2 = method23(arg0 + 45365, arg1 + 91923, 4) + (method23(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method23(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("c.a(III)I")
	public static final int method23(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method25(var3, var5);
		int var8 = method25(var3 + 1, var5);
		int var9 = method25(var3, var5 + 1);
		int var10 = method25(var3 + 1, var5 + 1);
		int var11 = method24(var7, var8, var4, arg2);
		int var12 = method24(var9, var10, var4, arg2);
		return method24(var11, var12, var6, arg2);
	}

	@ObfuscatedName("c.b(IIII)I")
	public static final int method24(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - class34.field579[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static final int method25(int arg0, int arg1) {
		int var2 = method26(arg0 - 1, arg1 - 1) + method26(arg0 + 1, arg1 - 1) + method26(arg0 - 1, arg1 + 1) + method26(arg0 + 1, arg1 + 1);
		int var3 = method26(arg0 - 1, arg1) + method26(arg0 + 1, arg1) + method26(arg0, arg1 - 1) + method26(arg0, arg1 + 1);
		int var4 = method26(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("c.c(II)I")
	public static final int method26(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static final int method27(int arg0, int arg1) {
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
	public final int method28(int arg0, int arg1) {
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
	public final int method29(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("c.a(IBI)Z")
	public static final boolean method30(int arg0, int arg1) {
		class57 var2 = class57.method326(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method329(arg1);
	}

	@ObfuscatedName("c.a(II[[[IIILr;ILjc;III)V")
	public static final void method31(int arg0, int arg1, int[][][] arg2, int arg3, int arg4, class18 arg5, int arg6, class62 arg7, int arg8, int arg9) {
		int var10 = arg2[arg1][arg0][arg3];
		int var11 = arg2[arg1][arg0 + 1][arg3];
		int var12 = arg2[arg1][arg0 + 1][arg3 + 1];
		int var13 = arg2[arg1][arg0][arg3 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		class57 var15 = class57.method326(arg4);
		int var16 = (arg4 << 14) + (arg3 << 7) + arg0 + 0x40000000;
		if (!var15.field833) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg9 << 6) + arg6);
		if (arg6 == 22) {
			class24 var18;
			if (var15.field837 == -1) {
				var18 = var15.method332(22, arg9, var10, var11, var12, var13, -1);
			} else {
				var18 = new class28(22, var10, var13, var12, var11, var15.field837, true, arg9, arg4);
			}

			arg5.method56(var14, arg3, var17, arg8, var18, arg0, var16);

			if (var15.field831 && var15.field833) {
				arg7.method356(arg0, arg3);
			}
		} else if (arg6 == 10 || arg6 == 11) {
			class24 var19;
			if (var15.field837 == -1) {
				var19 = var15.method332(10, arg9, var10, var11, var12, var13, -1);
			} else {
				var19 = new class28(10, var10, var13, var12, var11, var15.field837, true, arg9, arg4);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg6 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg9 == 1 || arg9 == 3) {
					var21 = var15.field830;
					var22 = var15.field829;
				} else {
					var21 = var15.field829;
					var22 = var15.field830;
				}

				arg5.method60(var21, var19, arg0, var22, var20, arg8, arg3, var17, var16, var14);
			}

			if (var15.field831) {
				arg7.method355(arg3, var15.field830, var15.field829, arg0, var15.field832, arg9);
			}
		} else if (arg6 >= 12) {
			class24 var23;
			if (var15.field837 == -1) {
				var23 = var15.method332(arg6, arg9, var10, var11, var12, var13, -1);
			} else {
				var23 = new class28(arg6, var10, var13, var12, var11, var15.field837, true, arg9, arg4);
			}

			arg5.method60(1, var23, arg0, 1, 0, arg8, arg3, var17, var16, var14);

			if (var15.field831) {
				arg7.method355(arg3, var15.field830, var15.field829, arg0, var15.field832, arg9);
			}
		} else if (arg6 == 0) {
			class24 var24;
			if (var15.field837 == -1) {
				var24 = var15.method332(0, arg9, var10, var11, var12, var13, -1);
			} else {
				var24 = new class28(0, var10, var13, var12, var11, var15.field837, true, arg9, arg4);
			}

			arg5.method58(arg8, arg0, 0, var17, arg3, var24, var16, field50[arg9], var14, null);

			if (var15.field831) {
				arg7.method354(arg3, arg9, arg0, arg6, var15.field832);
			}
		} else if (arg6 == 1) {
			class24 var25;
			if (var15.field837 == -1) {
				var25 = var15.method332(1, arg9, var10, var11, var12, var13, -1);
			} else {
				var25 = new class28(1, var10, var13, var12, var11, var15.field837, true, arg9, arg4);
			}

			arg5.method58(arg8, arg0, 0, var17, arg3, var25, var16, field51[arg9], var14, null);

			if (var15.field831) {
				arg7.method354(arg3, arg9, arg0, arg6, var15.field832);
			}
		} else if (arg6 == 2) {
			int var26 = arg9 + 1 & 0x3;
			class24 var27;
			class24 var28;
			if (var15.field837 == -1) {
				var27 = var15.method332(2, arg9 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method332(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new class28(2, var10, var13, var12, var11, var15.field837, true, arg9 + 4, arg4);
				var28 = new class28(2, var10, var13, var12, var11, var15.field837, true, var26, arg4);
			}

			arg5.method58(arg8, arg0, field50[var26], var17, arg3, var27, var16, field50[arg9], var14, var28);

			if (var15.field831) {
				arg7.method354(arg3, arg9, arg0, arg6, var15.field832);
			}
		} else if (arg6 == 3) {
			class24 var29;
			if (var15.field837 == -1) {
				var29 = var15.method332(3, arg9, var10, var11, var12, var13, -1);
			} else {
				var29 = new class28(3, var10, var13, var12, var11, var15.field837, true, arg9, arg4);
			}

			arg5.method58(arg8, arg0, 0, var17, arg3, var29, var16, field51[arg9], var14, null);

			if (var15.field831) {
				arg7.method354(arg3, arg9, arg0, arg6, var15.field832);
			}
		} else if (arg6 == 9) {
			class24 var30;
			if (var15.field837 == -1) {
				var30 = var15.method332(arg6, arg9, var10, var11, var12, var13, -1);
			} else {
				var30 = new class28(arg6, var10, var13, var12, var11, var15.field837, true, arg9, arg4);
			}

			arg5.method60(1, var30, arg0, 1, 0, arg8, arg3, var17, var16, var14);

			if (var15.field831) {
				arg7.method355(arg3, var15.field830, var15.field829, arg0, var15.field832, arg9);
			}
		} else {
			if (var15.field834) {
				if (arg9 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg9 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg9 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg6 == 4) {
				class24 var35;
				if (var15.field837 == -1) {
					var35 = var15.method332(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new class28(4, var10, var13, var12, var11, var15.field837, true, 0, arg4);
				}

				arg5.method59(var16, var35, 0, arg8, arg9 * 512, field50[arg9], 0, arg0, var17, var14, arg3);
			} else if (arg6 == 5) {
				int var36 = 16;
				int var37 = arg5.method76(arg8, arg0, arg3);
				if (var37 > 0) {
					var36 = class57.method326(var37 >> 14 & 0x7FFF).field838;
				}

				class24 var38;
				if (var15.field837 == -1) {
					var38 = var15.method332(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new class28(4, var10, var13, var12, var11, var15.field837, true, 0, arg4);
				}

				arg5.method59(var16, var38, field52[arg9] * var36, arg8, arg9 * 512, field50[arg9], field53[arg9] * var36, arg0, var17, var14, arg3);
			} else if (arg6 == 6) {
				class24 var39;
				if (var15.field837 == -1) {
					var39 = var15.method332(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new class28(4, var10, var13, var12, var11, var15.field837, true, 0, arg4);
				}

				arg5.method59(var16, var39, 0, arg8, arg9, 256, 0, arg0, var17, var14, arg3);
			} else if (arg6 == 7) {
				class24 var40;
				if (var15.field837 == -1) {
					var40 = var15.method332(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new class28(4, var10, var13, var12, var11, var15.field837, true, 0, arg4);
				}

				arg5.method59(var16, var40, 0, arg8, arg9, 512, 0, arg0, var17, var14, arg3);
			} else if (arg6 == 8) {
				class24 var41;
				if (var15.field837 == -1) {
					var41 = var15.method332(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new class28(4, var10, var13, var12, var11, var15.field837, true, 0, arg4);
				}

				arg5.method59(var16, var41, 0, arg8, arg9, 768, 0, arg0, var17, var14, arg3);
			}
		}
	}
}
