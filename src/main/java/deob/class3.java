package deob;

@ObfuscatedName("c")
public final class class3 {

	@ObfuscatedName("c.f")
	public static boolean field26 = true;

	@ObfuscatedName("c.g")
	public static int field27;

	@ObfuscatedName("c.h")
	public static boolean field28;

	@ObfuscatedName("c.i")
	public int field29;

	@ObfuscatedName("c.j")
	public int field30;

	@ObfuscatedName("c.k")
	public int[][][] field31;

	@ObfuscatedName("c.l")
	public byte[][][] field32;

	@ObfuscatedName("c.m")
	public byte[][][] field33;

	@ObfuscatedName("c.n")
	public byte[][][] field34;

	@ObfuscatedName("c.o")
	public byte[][][] field35;

	@ObfuscatedName("c.p")
	public byte[][][] field36;

	@ObfuscatedName("c.q")
	public byte[][][] field37;

	@ObfuscatedName("c.r")
	public int[][] field38;

	@ObfuscatedName("c.s")
	public int[] field39;

	@ObfuscatedName("c.t")
	public int[] field40;

	@ObfuscatedName("c.u")
	public int[] field41;

	@ObfuscatedName("c.v")
	public int[] field42;

	@ObfuscatedName("c.w")
	public int[] field43;

	@ObfuscatedName("c.x")
	public int[][][] field44;

	@ObfuscatedName("c.y")
	public static final int[] field45 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.z")
	public static final int[] field46 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.A")
	public static final int[] field47 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.B")
	public static final int[] field48 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.C")
	public static int field49 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.D")
	public static int field50 = (int) (Math.random() * 33.0D) - 16;

	public class3(int arg0, int arg1, int[][][] arg2, byte[][][] arg3) {
		field29 = arg1;
		field30 = arg0;
		field31 = arg2;
		field32 = arg3;
		field33 = new byte[4][field29][field30];
		field34 = new byte[4][field29][field30];
		field35 = new byte[4][field29][field30];
		field36 = new byte[4][field29][field30];
		field44 = new int[4][field29 + 1][field30 + 1];
		field37 = new byte[4][field29 + 1][field30 + 1];
		field38 = new int[field29 + 1][field30 + 1];
		field39 = new int[field30];
		field40 = new int[field30];
		field41 = new int[field30];
		field42 = new int[field30];
		field43 = new int[field30];
	}

	@ObfuscatedName("c.a(IIIII)V")
	public final void method14(int arg0, int arg1, int arg2, int arg3) {
		byte var5 = 0;
		for (int var6 = 0; var6 < class62.field915; var6++) {
			if (class62.field916[var6].field921.equalsIgnoreCase("water")) {
				var5 = (byte) (var6 + 1);
				break;
			}
		}

		for (int var7 = arg3; var7 < arg1 + arg3; var7++) {
			for (int var8 = arg0; var8 < arg0 + arg2; var8++) {
				if (var8 >= 0 && var8 < field29 && var7 >= 0 && var7 < field30) {
					field34[0][var8][var7] = var5;

					for (int var9 = 0; var9 < 4; var9++) {
						field31[var9][var8][var7] = 0;
						field32[var9][var8][var7] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a([BIIIZI)V")
	public final void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
		class39 var6 = new class39(arg0);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg2 + var8;
					int var11 = arg4 + var9;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						field32[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.method231();
							if (var12 == 0) {
								break;
							}

							if (var12 == 1) {
								break;
							}

							if (var12 <= 49) {
								field34[var7][var10][var11] = var6.method232();
								field35[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								field36[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								field32[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								field33[var7][var10][var11] = (byte) (var12 - 81);
							}
						}

						int var13 = var6.method231();
						if (var13 == 1) {
							var13 = 0;
						}

						if (var7 == 0) {
							field31[0][var10][var11] = -var13 * 8;
						} else {
							field31[var7][var10][var11] = field31[var7 - 1][var10][var11] - var13 * 8;
						}

						if (var7 == 0) {
							field31[0][var10][var11] = -method22(var10 + arg3 + 932731, var11 + 556238 + arg1) * 8;
						} else {
							field31[var7][var10][var11] = field31[var7 - 1][var10][var11] - 240;
						}
					} else {
						while (true) {
							int var14 = var6.method231();
							if (var14 == 0) {
								break;
							}

							if (var14 == 1) {
								break;
							}

							if (var14 <= 49) {
								var6.method231();
							}
						}

						var6.method231();
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(II[BI)Z")
	public static final boolean method16(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		class39 var4 = new class39(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method245();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method245();
					if (var9 == 0) {
						break;
					}

					var4.method231();
				} else {
					int var10 = var4.method245();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method231() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class57 var16 = class57.method324(var5);
						if (var13 != 22 || !field26 || var16.field814 || var16.field835) {
							var3 &= var16.method328();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(Lmb;Lvb;Z)V")
	public static final void method17(class39 arg0, class48 arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method245();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			class57 var4 = class57.method324(var2);
			var4.method329(arg1);

			while (true) {
				int var5 = arg0.method245();
				if (var5 == 0) {
					break;
				}

				arg0.method231();
			}
		}
	}

	@ObfuscatedName("c.a(I[Lic;I[BILs;)V")
	public final void method18(int arg0, class61[] arg1, byte[] arg2, int arg3, class19 arg4) {
		class39 var6 = new class39(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method245();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method245();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method231();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg3 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field32[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					class61 var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method19(var7, var18, var16, arg4, var15, var13, var20, var17);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIILs;IILic;II)V")
	public final void method19(int arg0, int arg1, int arg2, class19 arg3, int arg4, int arg5, class61 arg6, int arg7) {
		if (field26) {
			if ((field32[arg5][arg7][arg1] & 0x10) != 0) {
				return;
			}

			if (method21(arg1, arg7, arg5) != field27) {
				return;
			}
		}

		int var9 = field31[arg5][arg7][arg1];
		int var10 = field31[arg5][arg7 + 1][arg1];
		int var11 = field31[arg5][arg7 + 1][arg1 + 1];
		int var12 = field31[arg5][arg7][arg1 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		class57 var14 = class57.method324(arg0);
		int var15 = (arg0 << 14) + (arg1 << 7) + arg7 + 0x40000000;
		if (!var14.field814) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg2 << 6) + arg4);
		if (arg4 == 22) {
			if (!field26 || var14.field814 || var14.field835) {
				class25 var17;
				if (var14.field818 == -1) {
					var17 = var14.method330(22, arg2, var9, var10, var11, var12, -1);
				} else {
					var17 = new class29(22, arg0, var11, var14.field818, arg2, true, var10, var12, var9);
				}

				arg3.method68(var17, arg7, var15, var13, arg1, arg5, var16);

				if (var14.field812 && var14.field814 && arg6 != null) {
					arg6.method353(arg7, arg1);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			class25 var18;
			if (var14.field818 == -1) {
				var18 = var14.method330(10, arg2, var9, var10, var11, var12, -1);
			} else {
				var18 = new class29(10, arg0, var11, var14.field818, arg2, true, var10, var12, var9);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg4 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg2 == 1 || arg2 == 3) {
					var20 = var14.field811;
					var21 = var14.field810;
				} else {
					var20 = var14.field810;
					var21 = var14.field811;
				}

				if (arg3.method72(var13, arg7, var19, var15, var18, arg1, var21, arg5, var20, var16) && var14.field827) {
					class32 var22;
					if (var18 instanceof class32) {
						var22 = (class32) var18;
					} else {
						var22 = var14.method330(10, arg2, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field500 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field37[arg5][arg7 + var23][arg1 + var24]) {
									field37[arg5][arg7 + var23][arg1 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field812 && arg6 != null) {
				arg6.method352(arg7, var14.field810, var14.field813, arg2, var14.field811, arg1);
			}
		} else if (arg4 >= 12) {
			class25 var26;
			if (var14.field818 == -1) {
				var26 = var14.method330(arg4, arg2, var9, var10, var11, var12, -1);
			} else {
				var26 = new class29(arg4, arg0, var11, var14.field818, arg2, true, var10, var12, var9);
			}

			arg3.method72(var13, arg7, 0, var15, var26, arg1, 1, arg5, 1, var16);

			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg5 > 0) {
				field44[arg5][arg7][arg1] |= 0x924;
			}

			if (var14.field812 && arg6 != null) {
				arg6.method352(arg7, var14.field810, var14.field813, arg2, var14.field811, arg1);
			}
		} else if (arg4 == 0) {
			class25 var27;
			if (var14.field818 == -1) {
				var27 = var14.method330(0, arg2, var9, var10, var11, var12, -1);
			} else {
				var27 = new class29(0, arg0, var11, var14.field818, arg2, true, var10, var12, var9);
			}

			arg3.method70(arg7, var27, 0, field45[arg2], var16, arg5, null, var13, var15, arg1);

			if (arg2 == 0) {
				if (var14.field827) {
					field37[arg5][arg7][arg1] = 50;
					field37[arg5][arg7][arg1 + 1] = 50;
				}

				if (var14.field817) {
					field44[arg5][arg7][arg1] |= 0x249;
				}
			} else if (arg2 == 1) {
				if (var14.field827) {
					field37[arg5][arg7][arg1 + 1] = 50;
					field37[arg5][arg7 + 1][arg1 + 1] = 50;
				}

				if (var14.field817) {
					field44[arg5][arg7][arg1 + 1] |= 0x492;
				}
			} else if (arg2 == 2) {
				if (var14.field827) {
					field37[arg5][arg7 + 1][arg1] = 50;
					field37[arg5][arg7 + 1][arg1 + 1] = 50;
				}

				if (var14.field817) {
					field44[arg5][arg7 + 1][arg1] |= 0x249;
				}
			} else if (arg2 == 3) {
				if (var14.field827) {
					field37[arg5][arg7][arg1] = 50;
					field37[arg5][arg7 + 1][arg1] = 50;
				}

				if (var14.field817) {
					field44[arg5][arg7][arg1] |= 0x492;
				}
			}

			if (var14.field812 && arg6 != null) {
				arg6.method351(arg2, arg4, arg1, arg7, var14.field813);
			}

			if (var14.field819 != 16) {
				arg3.method78(arg5, arg1, arg7, var14.field819);
			}
		} else if (arg4 == 1) {
			class25 var28;
			if (var14.field818 == -1) {
				var28 = var14.method330(1, arg2, var9, var10, var11, var12, -1);
			} else {
				var28 = new class29(1, arg0, var11, var14.field818, arg2, true, var10, var12, var9);
			}

			arg3.method70(arg7, var28, 0, field46[arg2], var16, arg5, null, var13, var15, arg1);

			if (var14.field827) {
				if (arg2 == 0) {
					field37[arg5][arg7][arg1 + 1] = 50;
				} else if (arg2 == 1) {
					field37[arg5][arg7 + 1][arg1 + 1] = 50;
				} else if (arg2 == 2) {
					field37[arg5][arg7 + 1][arg1] = 50;
				} else if (arg2 == 3) {
					field37[arg5][arg7][arg1] = 50;
				}
			}

			if (var14.field812 && arg6 != null) {
				arg6.method351(arg2, arg4, arg1, arg7, var14.field813);
			}
		} else if (arg4 == 2) {
			int var29 = arg2 + 1 & 0x3;
			class25 var30;
			class25 var31;
			if (var14.field818 == -1) {
				var30 = var14.method330(2, arg2 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method330(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new class29(2, arg0, var11, var14.field818, arg2 + 4, true, var10, var12, var9);
				var31 = new class29(2, arg0, var11, var14.field818, var29, true, var10, var12, var9);
			}

			arg3.method70(arg7, var30, field45[var29], field45[arg2], var16, arg5, var31, var13, var15, arg1);

			if (var14.field817) {
				if (arg2 == 0) {
					field44[arg5][arg7][arg1] |= 0x249;
					field44[arg5][arg7][arg1 + 1] |= 0x492;
				} else if (arg2 == 1) {
					field44[arg5][arg7][arg1 + 1] |= 0x492;
					field44[arg5][arg7 + 1][arg1] |= 0x249;
				} else if (arg2 == 2) {
					field44[arg5][arg7 + 1][arg1] |= 0x249;
					field44[arg5][arg7][arg1] |= 0x492;
				} else if (arg2 == 3) {
					field44[arg5][arg7][arg1] |= 0x492;
					field44[arg5][arg7][arg1] |= 0x249;
				}
			}

			if (var14.field812 && arg6 != null) {
				arg6.method351(arg2, arg4, arg1, arg7, var14.field813);
			}

			if (var14.field819 != 16) {
				arg3.method78(arg5, arg1, arg7, var14.field819);
			}
		} else if (arg4 == 3) {
			class25 var32;
			if (var14.field818 == -1) {
				var32 = var14.method330(3, arg2, var9, var10, var11, var12, -1);
			} else {
				var32 = new class29(3, arg0, var11, var14.field818, arg2, true, var10, var12, var9);
			}

			arg3.method70(arg7, var32, 0, field46[arg2], var16, arg5, null, var13, var15, arg1);

			if (var14.field827) {
				if (arg2 == 0) {
					field37[arg5][arg7][arg1 + 1] = 50;
				} else if (arg2 == 1) {
					field37[arg5][arg7 + 1][arg1 + 1] = 50;
				} else if (arg2 == 2) {
					field37[arg5][arg7 + 1][arg1] = 50;
				} else if (arg2 == 3) {
					field37[arg5][arg7][arg1] = 50;
				}
			}

			if (var14.field812 && arg6 != null) {
				arg6.method351(arg2, arg4, arg1, arg7, var14.field813);
			}
		} else if (arg4 == 9) {
			class25 var33;
			if (var14.field818 == -1) {
				var33 = var14.method330(arg4, arg2, var9, var10, var11, var12, -1);
			} else {
				var33 = new class29(arg4, arg0, var11, var14.field818, arg2, true, var10, var12, var9);
			}

			arg3.method72(var13, arg7, 0, var15, var33, arg1, 1, arg5, 1, var16);

			if (var14.field812 && arg6 != null) {
				arg6.method352(arg7, var14.field810, var14.field813, arg2, var14.field811, arg1);
			}
		} else if (arg4 == 4) {
			class25 var34;
			if (var14.field818 == -1) {
				var34 = var14.method330(4, 0, var9, var10, var11, var12, -1);
			} else {
				var34 = new class29(4, arg0, var11, var14.field818, 0, true, var10, var12, var9);
			}

			arg3.method71(arg2 * 512, field45[arg2], 0, arg1, arg7, var13, var16, var15, arg5, 0, var34);
		} else if (arg4 == 5) {
			int var35 = 16;
			int var36 = arg3.method88(arg5, arg7, arg1);
			if (var36 > 0) {
				var35 = class57.method324(var36 >> 14 & 0x7FFF).field819;
			}

			class25 var37;
			if (var14.field818 == -1) {
				var37 = var14.method330(4, 0, var9, var10, var11, var12, -1);
			} else {
				var37 = new class29(4, arg0, var11, var14.field818, 0, true, var10, var12, var9);
			}

			arg3.method71(arg2 * 512, field45[arg2], field47[arg2] * var35, arg1, arg7, var13, var16, var15, arg5, field48[arg2] * var35, var37);
		} else if (arg4 == 6) {
			class25 var38;
			if (var14.field818 == -1) {
				var38 = var14.method330(4, 0, var9, var10, var11, var12, -1);
			} else {
				var38 = new class29(4, arg0, var11, var14.field818, 0, true, var10, var12, var9);
			}

			arg3.method71(arg2, 256, 0, arg1, arg7, var13, var16, var15, arg5, 0, var38);
		} else if (arg4 == 7) {
			class25 var39;
			if (var14.field818 == -1) {
				var39 = var14.method330(4, 0, var9, var10, var11, var12, -1);
			} else {
				var39 = new class29(4, arg0, var11, var14.field818, 0, true, var10, var12, var9);
			}

			arg3.method71(arg2, 512, 0, arg1, arg7, var13, var16, var15, arg5, 0, var39);
		} else if (arg4 == 8) {
			class25 var40;
			if (var14.field818 == -1) {
				var40 = var14.method330(4, 0, var9, var10, var11, var12, -1);
			} else {
				var40 = new class29(4, arg0, var11, var14.field818, 0, true, var10, var12, var9);
			}

			arg3.method71(arg2, 768, 0, arg1, arg7, var13, var16, var15, arg5, 0, var40);
		}
	}

	@ObfuscatedName("c.a(Ls;[Lic;Z)V")
	public final void method20(class19 arg0, class61[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field32[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field32[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method353(var4, var5);
						}
					}
				}
			}
		}

		if (field28) {
			field49 = 0;
			field50 = 0;
		} else {
			field49 += (int) (Math.random() * 5.0D) - 2;
			if (field49 < -8) {
				field49 = -8;
			}

			if (field49 > 8) {
				field49 = 8;
			}

			field50 += (int) (Math.random() * 5.0D) - 2;
			if (field50 < -16) {
				field50 = -16;
			}

			if (field50 > 16) {
				field50 = 16;
			}
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field37[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field30 - 1; var16++) {
				for (int var17 = 1; var17 < field29 - 1; var17++) {
					int var18 = field31[var7][var17 + 1][var16] - field31[var7][var17 - 1][var16];
					int var19 = field31[var7][var17][var16 + 1] - field31[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field38[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field30; var26++) {
				field39[var26] = 0;
				field40[var26] = 0;
				field41[var26] = 0;
				field42[var26] = 0;
				field43[var26] = 0;
			}

			for (int var27 = -5; var27 < field29 + 5; var27++) {
				for (int var28 = 0; var28 < field30; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field29) {
						int var30 = field33[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							class62 var31 = class62.field916[var30 - 1];
							field39[var28] += var31.field925;
							field40[var28] += var31.field923;
							field41[var28] += var31.field924;
							field42[var28] += var31.field926;
							field43[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field29) {
						int var33 = field33[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							class62 var34 = class62.field916[var33 - 1];
							field39[var28] -= var34.field925;
							field40[var28] -= var34.field923;
							field41[var28] -= var34.field924;
							field42[var28] -= var34.field926;
							field43[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field29 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field30 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field30) {
							var35 += field39[var41];
							var36 += field40[var41];
							var37 += field41[var41];
							var38 += field42[var41];
							var39 += field43[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field30) {
							var35 -= field39[var42];
							var36 -= field40[var42];
							var37 -= field41[var42];
							var38 -= field42[var42];
							var39 -= field43[var42];
						}

						if (var40 >= 1 && var40 < field30 - 1 && (!field26 || (field32[var7][var27][var40] & 0x10) == 0 && method21(var40, var27, var7) == field27)) {
							int var43 = field33[var7][var27][var40] & 0xFF;
							int var44 = field34[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field31[var7][var27][var40];
								int var46 = field31[var7][var27 + 1][var40];
								int var47 = field31[var7][var27 + 1][var40 + 1];
								int var48 = field31[var7][var27][var40 + 1];
								int var49 = field38[var27][var40];
								int var50 = field38[var27 + 1][var40];
								int var51 = field38[var27 + 1][var40 + 1];
								int var52 = field38[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method29(var55, var56, var57);
									var55 = field49 + var55 & 0xFF;
									var57 += field50;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method29(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field35[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !class62.field916[var44 - 1].field920) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field44[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = class35.field583[method27(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method67(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method27(var53, var49), method27(var53, var50), method27(var53, var51), method27(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field35[var7][var27][var40] + 1;
									byte var61 = field36[var7][var27][var40];
									class62 var62 = class62.field916[var44 - 1];
									int var63 = var62.field918;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = class35.method175(var63);
										var65 = -1;
									} else if (var62.field917 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method29(var62.field922, var62.field923, var62.field924);
										var64 = class35.field583[method28(var62.field927, 96)];
									}

									arg0.method67(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method27(var53, var49), method27(var53, var50), method27(var53, var51), method27(var53, var52), method28(var65, var49), method28(var65, var50), method28(var65, var51), method28(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field30 - 1; var66++) {
				for (int var67 = 1; var67 < field29 - 1; var67++) {
					arg0.method66(var7, var67, var66, method21(var66, var67, var7));
				}
			}
		}

		if (!field28) {
			arg0.method93(64, -50, 768, -10, -50);
		}

		for (int var68 = 0; var68 < field29; var68++) {
			for (int var69 = 0; var69 < field30; var69++) {
				if ((field32[1][var68][var69] & 0x2) == 2) {
					arg0.method64(var69, var68);
				}
			}
		}

		if (!field28) {
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
					for (int var75 = 0; var75 <= field30; var75++) {
						for (int var76 = 0; var76 <= field29; var76++) {
							if ((field44[var74][var76][var75] & var70) != 0) {
								int var77 = var75;
								int var78 = var75;
								int var79 = var74;
								int var80 = var74;

								while (var77 > 0 && (field44[var74][var76][var77 - 1] & var70) != 0) {
									var77--;
								}

								while (var78 < field30 && (field44[var74][var76][var78 + 1] & var70) != 0) {
									var78++;
								}

								label332: while (var79 > 0) {
									for (int var81 = var77; var81 <= var78; var81++) {
										if ((field44[var79 - 1][var76][var81] & var70) == 0) {
											break label332;
										}
									}

									var79--;
								}

								label321: while (var80 < var73) {
									for (int var82 = var77; var82 <= var78; var82++) {
										if ((field44[var80 + 1][var76][var82] & var70) == 0) {
											break label321;
										}
									}

									var80++;
								}

								int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
								if (var83 >= 8) {
									short var84 = 240;
									int var85 = field31[var80][var76][var77] - var84;
									int var86 = field31[var79][var76][var77];
									class19.method65(var76 * 128, var86, var77 * 128, var78 * 128 + 128, var73, var76 * 128, 1, var85);

									for (int var87 = var79; var87 <= var80; var87++) {
										for (int var88 = var77; var88 <= var78; var88++) {
											field44[var87][var76][var88] &= ~var70;
										}
									}
								}
							}

							if ((field44[var74][var76][var75] & var71) != 0) {
								int var89 = var76;
								int var90 = var76;
								int var91 = var74;
								int var92 = var74;

								while (var89 > 0 && (field44[var74][var89 - 1][var75] & var71) != 0) {
									var89--;
								}

								while (var90 < field29 && (field44[var74][var90 + 1][var75] & var71) != 0) {
									var90++;
								}

								label385: while (var91 > 0) {
									for (int var93 = var89; var93 <= var90; var93++) {
										if ((field44[var91 - 1][var93][var75] & var71) == 0) {
											break label385;
										}
									}

									var91--;
								}

								label374: while (var92 < var73) {
									for (int var94 = var89; var94 <= var90; var94++) {
										if ((field44[var92 + 1][var94][var75] & var71) == 0) {
											break label374;
										}
									}

									var92++;
								}

								int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
								if (var95 >= 8) {
									short var96 = 240;
									int var97 = field31[var92][var89][var75] - var96;
									int var98 = field31[var91][var89][var75];
									class19.method65(var90 * 128 + 128, var98, var75 * 128, var75 * 128, var73, var89 * 128, 2, var97);

									for (int var99 = var91; var99 <= var92; var99++) {
										for (int var100 = var89; var100 <= var90; var100++) {
											field44[var99][var100][var75] &= ~var71;
										}
									}
								}
							}

							if ((field44[var74][var76][var75] & var72) != 0) {
								int var101 = var76;
								int var102 = var76;
								int var103 = var75;
								int var104 = var75;

								while (var103 > 0 && (field44[var74][var76][var103 - 1] & var72) != 0) {
									var103--;
								}

								while (var104 < field30 && (field44[var74][var76][var104 + 1] & var72) != 0) {
									var104++;
								}

								label438: while (var101 > 0) {
									for (int var105 = var103; var105 <= var104; var105++) {
										if ((field44[var74][var101 - 1][var105] & var72) == 0) {
											break label438;
										}
									}

									var101--;
								}

								label427: while (var102 < field29) {
									for (int var106 = var103; var106 <= var104; var106++) {
										if ((field44[var74][var102 + 1][var106] & var72) == 0) {
											break label427;
										}
									}

									var102++;
								}

								if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
									int var107 = field31[var74][var101][var103];
									class19.method65(var102 * 128 + 128, var107, var103 * 128, var104 * 128 + 128, var73, var101 * 128, 4, var107);

									for (int var108 = var101; var108 <= var102; var108++) {
										for (int var109 = var103; var109 <= var104; var109++) {
											field44[var74][var108][var109] &= ~var72;
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
	public int method21(int arg0, int arg1, int arg2) {
		if ((field32[arg2][arg1][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field32[1][arg1][arg0] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
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
		int var4 = 0x10000 - class35.field572[arg2 * 1024 / arg3] >> 1;
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

	@ObfuscatedName("c.a(IIB)Z")
	public static final boolean method30(int arg0, int arg1) {
		class57 var2 = class57.method324(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method327(arg1);
	}

	@ObfuscatedName("c.a(IIIII[[[IILic;ILs;I)V")
	public static final void method31(int arg0, int arg1, int arg2, int arg3, int[][][] arg4, int arg5, class61 arg6, int arg7, class19 arg8, int arg9) {
		int var10 = arg4[arg5][arg9][arg2];
		int var11 = arg4[arg5][arg9 + 1][arg2];
		int var12 = arg4[arg5][arg9 + 1][arg2 + 1];
		int var13 = arg4[arg5][arg9][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		class57 var15 = class57.method324(arg0);
		int var16 = (arg0 << 14) + (arg2 << 7) + arg9 + 0x40000000;
		if (!var15.field814) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg7 << 6) + arg1);
		if (arg1 == 22) {
			class25 var18;
			if (var15.field818 == -1) {
				var18 = var15.method330(22, arg7, var10, var11, var12, var13, -1);
			} else {
				var18 = new class29(22, arg0, var12, var15.field818, arg7, true, var11, var13, var10);
			}

			arg8.method68(var18, arg9, var16, var14, arg2, arg3, var17);

			if (var15.field812 && var15.field814) {
				arg6.method353(arg9, arg2);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			class25 var19;
			if (var15.field818 == -1) {
				var19 = var15.method330(10, arg7, var10, var11, var12, var13, -1);
			} else {
				var19 = new class29(10, arg0, var12, var15.field818, arg7, true, var11, var13, var10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg1 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg7 == 1 || arg7 == 3) {
					var21 = var15.field811;
					var22 = var15.field810;
				} else {
					var21 = var15.field810;
					var22 = var15.field811;
				}

				arg8.method72(var14, arg9, var20, var16, var19, arg2, var22, arg3, var21, var17);
			}

			if (var15.field812) {
				arg6.method352(arg9, var15.field810, var15.field813, arg7, var15.field811, arg2);
			}
		} else if (arg1 >= 12) {
			class25 var23;
			if (var15.field818 == -1) {
				var23 = var15.method330(arg1, arg7, var10, var11, var12, var13, -1);
			} else {
				var23 = new class29(arg1, arg0, var12, var15.field818, arg7, true, var11, var13, var10);
			}

			arg8.method72(var14, arg9, 0, var16, var23, arg2, 1, arg3, 1, var17);

			if (var15.field812) {
				arg6.method352(arg9, var15.field810, var15.field813, arg7, var15.field811, arg2);
			}
		} else if (arg1 == 0) {
			class25 var24;
			if (var15.field818 == -1) {
				var24 = var15.method330(0, arg7, var10, var11, var12, var13, -1);
			} else {
				var24 = new class29(0, arg0, var12, var15.field818, arg7, true, var11, var13, var10);
			}

			arg8.method70(arg9, var24, 0, field45[arg7], var17, arg3, null, var14, var16, arg2);

			if (var15.field812) {
				arg6.method351(arg7, arg1, arg2, arg9, var15.field813);
			}
		} else if (arg1 == 1) {
			class25 var25;
			if (var15.field818 == -1) {
				var25 = var15.method330(1, arg7, var10, var11, var12, var13, -1);
			} else {
				var25 = new class29(1, arg0, var12, var15.field818, arg7, true, var11, var13, var10);
			}

			arg8.method70(arg9, var25, 0, field46[arg7], var17, arg3, null, var14, var16, arg2);

			if (var15.field812) {
				arg6.method351(arg7, arg1, arg2, arg9, var15.field813);
			}
		} else if (arg1 == 2) {
			int var26 = arg7 + 1 & 0x3;
			class25 var27;
			class25 var28;
			if (var15.field818 == -1) {
				var27 = var15.method330(2, arg7 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method330(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new class29(2, arg0, var12, var15.field818, arg7 + 4, true, var11, var13, var10);
				var28 = new class29(2, arg0, var12, var15.field818, var26, true, var11, var13, var10);
			}

			arg8.method70(arg9, var27, field45[var26], field45[arg7], var17, arg3, var28, var14, var16, arg2);

			if (var15.field812) {
				arg6.method351(arg7, arg1, arg2, arg9, var15.field813);
			}
		} else if (arg1 == 3) {
			class25 var29;
			if (var15.field818 == -1) {
				var29 = var15.method330(3, arg7, var10, var11, var12, var13, -1);
			} else {
				var29 = new class29(3, arg0, var12, var15.field818, arg7, true, var11, var13, var10);
			}

			arg8.method70(arg9, var29, 0, field46[arg7], var17, arg3, null, var14, var16, arg2);

			if (var15.field812) {
				arg6.method351(arg7, arg1, arg2, arg9, var15.field813);
			}
		} else if (arg1 == 9) {
			class25 var30;
			if (var15.field818 == -1) {
				var30 = var15.method330(arg1, arg7, var10, var11, var12, var13, -1);
			} else {
				var30 = new class29(arg1, arg0, var12, var15.field818, arg7, true, var11, var13, var10);
			}

			arg8.method72(var14, arg9, 0, var16, var30, arg2, 1, arg3, 1, var17);

			if (var15.field812) {
				arg6.method352(arg9, var15.field810, var15.field813, arg7, var15.field811, arg2);
			}
		} else if (arg1 == 4) {
			class25 var31;
			if (var15.field818 == -1) {
				var31 = var15.method330(4, 0, var10, var11, var12, var13, -1);
			} else {
				var31 = new class29(4, arg0, var12, var15.field818, 0, true, var11, var13, var10);
			}

			arg8.method71(arg7 * 512, field45[arg7], 0, arg2, arg9, var14, var17, var16, arg3, 0, var31);
		} else if (arg1 == 5) {
			int var32 = 16;
			int var33 = arg8.method88(arg3, arg9, arg2);
			if (var33 > 0) {
				var32 = class57.method324(var33 >> 14 & 0x7FFF).field819;
			}

			class25 var34;
			if (var15.field818 == -1) {
				var34 = var15.method330(4, 0, var10, var11, var12, var13, -1);
			} else {
				var34 = new class29(4, arg0, var12, var15.field818, 0, true, var11, var13, var10);
			}

			arg8.method71(arg7 * 512, field45[arg7], field47[arg7] * var32, arg2, arg9, var14, var17, var16, arg3, field48[arg7] * var32, var34);
		} else if (arg1 == 6) {
			class25 var35;
			if (var15.field818 == -1) {
				var35 = var15.method330(4, 0, var10, var11, var12, var13, -1);
			} else {
				var35 = new class29(4, arg0, var12, var15.field818, 0, true, var11, var13, var10);
			}

			arg8.method71(arg7, 256, 0, arg2, arg9, var14, var17, var16, arg3, 0, var35);
		} else if (arg1 == 7) {
			class25 var36;
			if (var15.field818 == -1) {
				var36 = var15.method330(4, 0, var10, var11, var12, var13, -1);
			} else {
				var36 = new class29(4, arg0, var12, var15.field818, 0, true, var11, var13, var10);
			}

			arg8.method71(arg7, 512, 0, arg2, arg9, var14, var17, var16, arg3, 0, var36);
		} else if (arg1 == 8) {
			class25 var37;
			if (var15.field818 == -1) {
				var37 = var15.method330(4, 0, var10, var11, var12, var13, -1);
			} else {
				var37 = new class29(4, arg0, var12, var15.field818, 0, true, var11, var13, var10);
			}

			arg8.method71(arg7, 768, 0, arg2, arg9, var14, var17, var16, arg3, 0, var37);
		}
	}
}
