package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.dash3d.entity.Entity;
import jagex2.dash3d.entity.LocEntity;
import jagex2.graphics.Model;
import jagex2.graphics.Pix3D;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("c")
public final class World {

	@ObfuscatedName("c.g")
	public static boolean field32 = true;

	@ObfuscatedName("c.h")
	public static int field33;

	@ObfuscatedName("c.i")
	public static boolean field34;

	@ObfuscatedName("c.j")
	public int field35;

	@ObfuscatedName("c.k")
	public int field36;

	@ObfuscatedName("c.l")
	public int[][][] field37;

	@ObfuscatedName("c.m")
	public byte[][][] field38;

	@ObfuscatedName("c.n")
	public byte[][][] field39;

	@ObfuscatedName("c.o")
	public byte[][][] field40;

	@ObfuscatedName("c.p")
	public byte[][][] field41;

	@ObfuscatedName("c.q")
	public byte[][][] field42;

	@ObfuscatedName("c.r")
	public byte[][][] field43;

	@ObfuscatedName("c.s")
	public int[][] field44;

	@ObfuscatedName("c.t")
	public int[] field45;

	@ObfuscatedName("c.u")
	public int[] field46;

	@ObfuscatedName("c.v")
	public int[] field47;

	@ObfuscatedName("c.w")
	public int[] field48;

	@ObfuscatedName("c.x")
	public int[] field49;

	@ObfuscatedName("c.y")
	public int[][][] field50;

	@ObfuscatedName("c.z")
	public static final int[] field51 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.A")
	public static final int[] field52 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.B")
	public static final int[] field53 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.C")
	public static final int[] field54 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.D")
	public static int field55 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.E")
	public static int field56 = (int) (Math.random() * 33.0D) - 16;

	public World(int[][][] arg0, byte[][][] arg1, int arg2, int arg3) {
		field35 = arg2;
		field36 = arg3;
		field37 = arg0;
		field38 = arg1;
		field39 = new byte[4][field35][field36];
		field40 = new byte[4][field35][field36];
		field41 = new byte[4][field35][field36];
		field42 = new byte[4][field35][field36];
		field50 = new int[4][field35 + 1][field36 + 1];
		field43 = new byte[4][field35 + 1][field36 + 1];
		field44 = new int[field35 + 1][field36 + 1];
		field45 = new int[field36];
		field46 = new int[field36];
		field47 = new int[field36];
		field48 = new int[field36];
		field49 = new int[field36];
	}

	@ObfuscatedName("c.a(IIIZI)V")
	public final void method14(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < field35 && var5 >= 0 && var5 < field36) {
					field43[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						field37[0][var6][var5] = field37[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < field35 - 1) {
						field37[0][var6][var5] = field37[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						field37[0][var6][var5] = field37[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < field36 - 1) {
						field37[0][var6][var5] = field37[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(I[BIIII)V")
	public final void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
		Packet var6 = new Packet(arg0);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg1 + var8;
					int var11 = arg2 + var9;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						field38[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.method238();
							if (var12 == 0) {
								break;
							}

							if (var12 == 1) {
								break;
							}

							if (var12 <= 49) {
								field40[var7][var10][var11] = var6.method239();
								field41[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								field42[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								field38[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								field39[var7][var10][var11] = (byte) (var12 - 81);
							}
						}

						int var13 = var6.method238();
						if (var13 == 1) {
							var13 = 0;
						}

						if (var7 == 0) {
							field37[0][var10][var11] = -var13 * 8;
						} else {
							field37[var7][var10][var11] = field37[var7 - 1][var10][var11] - var13 * 8;
						}

						if (var7 == 0) {
							field37[0][var10][var11] = -method22(var10 + arg3 + 932731, var11 + 556238 + arg4) * 8;
						} else {
							field37[var7][var10][var11] = field37[var7 - 1][var10][var11] - 240;
						}
					} else {
						while (true) {
							int var14 = var6.method238();
							if (var14 == 0) {
								break;
							}

							if (var14 == 1) {
								break;
							}

							if (var14 <= 49) {
								var6.method238();
							}
						}

						var6.method238();
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(II[BZ)Z")
	public static final boolean method16(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		Packet var4 = new Packet(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method252();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method252();
					if (var9 == 0) {
						break;
					}

					var4.method238();
				} else {
					int var10 = var4.method252();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method238() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LocType var16 = LocType.method333(var5);
						if (var13 != 22 || !field32 || var16.field826 || var16.field847) {
							var3 &= var16.method337();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(ILmb;Lvb;)V")
	public static final void method17(Packet arg0, OnDemand arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method252();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			LocType var4 = LocType.method333(var2);
			var4.method338(arg1);

			while (true) {
				int var5 = arg0.method252();
				if (var5 == 0) {
					break;
				}

				arg0.method238();
			}
		}
	}

	@ObfuscatedName("c.a(ILs;[Ljc;IZ[B)V")
	public final void method18(int arg0, World3D arg1, CollisionMap[] arg2, int arg3, byte[] arg4) {
		Packet var6 = new Packet(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method252();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method252();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method238();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg3 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field38[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					CollisionMap var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method19(var7, var18, var16, arg1, var20, var17, var15, var13);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIIZLs;Ljc;III)V")
	public final void method19(int arg0, int arg1, int arg2, World3D arg3, CollisionMap arg4, int arg5, int arg6, int arg7) {
		if (field32) {
			if ((field38[arg7][arg5][arg1] & 0x10) != 0) {
				return;
			}

			if (method21(arg5, arg7, arg1) != field33) {
				return;
			}
		}

		int var9 = field37[arg7][arg5][arg1];
		int var10 = field37[arg7][arg5 + 1][arg1];
		int var11 = field37[arg7][arg5 + 1][arg1 + 1];
		int var12 = field37[arg7][arg5][arg1 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		LocType var14 = LocType.method333(arg0);
		int var15 = (arg0 << 14) + (arg1 << 7) + arg5 + 0x40000000;
		if (!var14.field826) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg2 << 6) + arg6);
		if (arg6 == 22) {
			if (!field32 || var14.field826 || var14.field847) {
				Entity var17;
				if (var14.field830 == -1) {
					var17 = var14.method339(22, arg2, var9, var10, var11, var12, -1);
				} else {
					var17 = new LocEntity(var12, var11, var9, 22, arg2, true, var10, arg0, var14.field830);
				}

				arg3.method69(arg1, arg7, arg5, var15, var13, var17, var16);

				if (var14.field824 && var14.field826 && arg4 != null) {
					arg4.method362(arg1, arg5);
				}
			}
		} else if (arg6 == 10 || arg6 == 11) {
			Entity var18;
			if (var14.field830 == -1) {
				var18 = var14.method339(10, arg2, var9, var10, var11, var12, -1);
			} else {
				var18 = new LocEntity(var12, var11, var9, 10, arg2, true, var10, arg0, var14.field830);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg6 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg2 == 1 || arg2 == 3) {
					var20 = var14.field823;
					var21 = var14.field822;
				} else {
					var20 = var14.field822;
					var21 = var14.field823;
				}

				if (arg3.method73(var16, var15, arg5, arg7, var13, var20, var19, var18, var21, arg1) && var14.field839) {
					Model var22;
					if (var18 instanceof Model) {
						var22 = (Model) var18;
					} else {
						var22 = var14.method339(10, arg2, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field509 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field43[arg7][arg5 + var23][arg1 + var24]) {
									field43[arg7][arg5 + var23][arg1 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field824 && arg4 != null) {
				arg4.method361(var14.field825, arg2, arg5, var14.field823, var14.field822, arg1);
			}
		} else if (arg6 >= 12) {
			Entity var26;
			if (var14.field830 == -1) {
				var26 = var14.method339(arg6, arg2, var9, var10, var11, var12, -1);
			} else {
				var26 = new LocEntity(var12, var11, var9, arg6, arg2, true, var10, arg0, var14.field830);
			}

			arg3.method73(var16, var15, arg5, arg7, var13, 1, 0, var26, 1, arg1);

			if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg7 > 0) {
				field50[arg7][arg5][arg1] |= 0x924;
			}

			if (var14.field824 && arg4 != null) {
				arg4.method361(var14.field825, arg2, arg5, var14.field823, var14.field822, arg1);
			}
		} else if (arg6 == 0) {
			Entity var27;
			if (var14.field830 == -1) {
				var27 = var14.method339(0, arg2, var9, var10, var11, var12, -1);
			} else {
				var27 = new LocEntity(var12, var11, var9, 0, arg2, true, var10, arg0, var14.field830);
			}

			arg3.method71(arg5, var15, arg7, 0, field51[arg2], var13, null, var27, var16, arg1);

			if (arg2 == 0) {
				if (var14.field839) {
					field43[arg7][arg5][arg1] = 50;
					field43[arg7][arg5][arg1 + 1] = 50;
				}

				if (var14.field829) {
					field50[arg7][arg5][arg1] |= 0x249;
				}
			} else if (arg2 == 1) {
				if (var14.field839) {
					field43[arg7][arg5][arg1 + 1] = 50;
					field43[arg7][arg5 + 1][arg1 + 1] = 50;
				}

				if (var14.field829) {
					field50[arg7][arg5][arg1 + 1] |= 0x492;
				}
			} else if (arg2 == 2) {
				if (var14.field839) {
					field43[arg7][arg5 + 1][arg1] = 50;
					field43[arg7][arg5 + 1][arg1 + 1] = 50;
				}

				if (var14.field829) {
					field50[arg7][arg5 + 1][arg1] |= 0x249;
				}
			} else if (arg2 == 3) {
				if (var14.field839) {
					field43[arg7][arg5][arg1] = 50;
					field43[arg7][arg5 + 1][arg1] = 50;
				}

				if (var14.field829) {
					field50[arg7][arg5][arg1] |= 0x492;
				}
			}

			if (var14.field824 && arg4 != null) {
				arg4.method360(arg1, arg6, arg5, var14.field825, arg2);
			}

			if (var14.field831 != 16) {
				arg3.method79(var14.field831, arg5, arg1, arg7);
			}
		} else if (arg6 == 1) {
			Entity var28;
			if (var14.field830 == -1) {
				var28 = var14.method339(1, arg2, var9, var10, var11, var12, -1);
			} else {
				var28 = new LocEntity(var12, var11, var9, 1, arg2, true, var10, arg0, var14.field830);
			}

			arg3.method71(arg5, var15, arg7, 0, field52[arg2], var13, null, var28, var16, arg1);

			if (var14.field839) {
				if (arg2 == 0) {
					field43[arg7][arg5][arg1 + 1] = 50;
				} else if (arg2 == 1) {
					field43[arg7][arg5 + 1][arg1 + 1] = 50;
				} else if (arg2 == 2) {
					field43[arg7][arg5 + 1][arg1] = 50;
				} else if (arg2 == 3) {
					field43[arg7][arg5][arg1] = 50;
				}
			}

			if (var14.field824 && arg4 != null) {
				arg4.method360(arg1, arg6, arg5, var14.field825, arg2);
			}
		} else if (arg6 == 2) {
			int var29 = arg2 + 1 & 0x3;
			Entity var30;
			Entity var31;
			if (var14.field830 == -1) {
				var30 = var14.method339(2, arg2 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method339(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new LocEntity(var12, var11, var9, 2, arg2 + 4, true, var10, arg0, var14.field830);
				var31 = new LocEntity(var12, var11, var9, 2, var29, true, var10, arg0, var14.field830);
			}

			arg3.method71(arg5, var15, arg7, field51[var29], field51[arg2], var13, var31, var30, var16, arg1);

			if (var14.field829) {
				if (arg2 == 0) {
					field50[arg7][arg5][arg1] |= 0x249;
					field50[arg7][arg5][arg1 + 1] |= 0x492;
				} else if (arg2 == 1) {
					field50[arg7][arg5][arg1 + 1] |= 0x492;
					field50[arg7][arg5 + 1][arg1] |= 0x249;
				} else if (arg2 == 2) {
					field50[arg7][arg5 + 1][arg1] |= 0x249;
					field50[arg7][arg5][arg1] |= 0x492;
				} else if (arg2 == 3) {
					field50[arg7][arg5][arg1] |= 0x492;
					field50[arg7][arg5][arg1] |= 0x249;
				}
			}

			if (var14.field824 && arg4 != null) {
				arg4.method360(arg1, arg6, arg5, var14.field825, arg2);
			}

			if (var14.field831 != 16) {
				arg3.method79(var14.field831, arg5, arg1, arg7);
			}
		} else if (arg6 == 3) {
			Entity var32;
			if (var14.field830 == -1) {
				var32 = var14.method339(3, arg2, var9, var10, var11, var12, -1);
			} else {
				var32 = new LocEntity(var12, var11, var9, 3, arg2, true, var10, arg0, var14.field830);
			}

			arg3.method71(arg5, var15, arg7, 0, field52[arg2], var13, null, var32, var16, arg1);

			if (var14.field839) {
				if (arg2 == 0) {
					field43[arg7][arg5][arg1 + 1] = 50;
				} else if (arg2 == 1) {
					field43[arg7][arg5 + 1][arg1 + 1] = 50;
				} else if (arg2 == 2) {
					field43[arg7][arg5 + 1][arg1] = 50;
				} else if (arg2 == 3) {
					field43[arg7][arg5][arg1] = 50;
				}
			}

			if (var14.field824 && arg4 != null) {
				arg4.method360(arg1, arg6, arg5, var14.field825, arg2);
			}
		} else if (arg6 == 9) {
			Entity var33;
			if (var14.field830 == -1) {
				var33 = var14.method339(arg6, arg2, var9, var10, var11, var12, -1);
			} else {
				var33 = new LocEntity(var12, var11, var9, arg6, arg2, true, var10, arg0, var14.field830);
			}

			arg3.method73(var16, var15, arg5, arg7, var13, 1, 0, var33, 1, arg1);

			if (var14.field824 && arg4 != null) {
				arg4.method361(var14.field825, arg2, arg5, var14.field823, var14.field822, arg1);
			}
		} else if (arg6 == 4) {
			Entity var34;
			if (var14.field830 == -1) {
				var34 = var14.method339(4, 0, var9, var10, var11, var12, -1);
			} else {
				var34 = new LocEntity(var12, var11, var9, 4, 0, true, var10, arg0, var14.field830);
			}

			arg3.method72(var16, var34, 0, arg5, arg1, field51[arg2], 0, arg2 * 512, arg7, var13, var15);
		} else if (arg6 == 5) {
			int var35 = 16;
			int var36 = arg3.method89(arg7, arg5, arg1);
			if (var36 > 0) {
				var35 = LocType.method333(var36 >> 14 & 0x7FFF).field831;
			}

			Entity var37;
			if (var14.field830 == -1) {
				var37 = var14.method339(4, 0, var9, var10, var11, var12, -1);
			} else {
				var37 = new LocEntity(var12, var11, var9, 4, 0, true, var10, arg0, var14.field830);
			}

			arg3.method72(var16, var37, field53[arg2] * var35, arg5, arg1, field51[arg2], field54[arg2] * var35, arg2 * 512, arg7, var13, var15);
		} else if (arg6 == 6) {
			Entity var38;
			if (var14.field830 == -1) {
				var38 = var14.method339(4, 0, var9, var10, var11, var12, -1);
			} else {
				var38 = new LocEntity(var12, var11, var9, 4, 0, true, var10, arg0, var14.field830);
			}

			arg3.method72(var16, var38, 0, arg5, arg1, 256, 0, arg2, arg7, var13, var15);
		} else if (arg6 == 7) {
			Entity var39;
			if (var14.field830 == -1) {
				var39 = var14.method339(4, 0, var9, var10, var11, var12, -1);
			} else {
				var39 = new LocEntity(var12, var11, var9, 4, 0, true, var10, arg0, var14.field830);
			}

			arg3.method72(var16, var39, 0, arg5, arg1, 512, 0, arg2, arg7, var13, var15);
		} else if (arg6 == 8) {
			Entity var40;
			if (var14.field830 == -1) {
				var40 = var14.method339(4, 0, var9, var10, var11, var12, -1);
			} else {
				var40 = new LocEntity(var12, var11, var9, 4, 0, true, var10, arg0, var14.field830);
			}

			arg3.method72(var16, var40, 0, arg5, arg1, 768, 0, arg2, arg7, var13, var15);
		}
	}

	@ObfuscatedName("c.a(Ls;[Ljc;Z)V")
	public final void method20(World3D arg0, CollisionMap[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field38[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field38[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method362(var5, var4);
						}
					}
				}
			}
		}

		if (field34) {
			field55 = 0;
			field56 = 0;
		} else {
			field55 += (int) (Math.random() * 5.0D) - 2;
			if (field55 < -8) {
				field55 = -8;
			}

			if (field55 > 8) {
				field55 = 8;
			}

			field56 += (int) (Math.random() * 5.0D) - 2;
			if (field56 < -16) {
				field56 = -16;
			}

			if (field56 > 16) {
				field56 = 16;
			}
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field43[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field36 - 1; var16++) {
				for (int var17 = 1; var17 < field35 - 1; var17++) {
					int var18 = field37[var7][var17 + 1][var16] - field37[var7][var17 - 1][var16];
					int var19 = field37[var7][var17][var16 + 1] - field37[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field44[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field36; var26++) {
				field45[var26] = 0;
				field46[var26] = 0;
				field47[var26] = 0;
				field48[var26] = 0;
				field49[var26] = 0;
			}

			for (int var27 = -5; var27 < field35 + 5; var27++) {
				for (int var28 = 0; var28 < field36; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field35) {
						int var30 = field39[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							FloType var31 = FloType.field943[var30 - 1];
							field45[var28] += var31.field952;
							field46[var28] += var31.field950;
							field47[var28] += var31.field951;
							field48[var28] += var31.field953;
							field49[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field35) {
						int var33 = field39[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							FloType var34 = FloType.field943[var33 - 1];
							field45[var28] -= var34.field952;
							field46[var28] -= var34.field950;
							field47[var28] -= var34.field951;
							field48[var28] -= var34.field953;
							field49[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field35 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field36 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field36) {
							var35 += field45[var41];
							var36 += field46[var41];
							var37 += field47[var41];
							var38 += field48[var41];
							var39 += field49[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field36) {
							var35 -= field45[var42];
							var36 -= field46[var42];
							var37 -= field47[var42];
							var38 -= field48[var42];
							var39 -= field49[var42];
						}

						if (var40 >= 1 && var40 < field36 - 1 && (!field32 || (field38[var7][var27][var40] & 0x10) == 0 && method21(var27, var7, var40) == field33)) {
							int var43 = field39[var7][var27][var40] & 0xFF;
							int var44 = field40[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field37[var7][var27][var40];
								int var46 = field37[var7][var27 + 1][var40];
								int var47 = field37[var7][var27 + 1][var40 + 1];
								int var48 = field37[var7][var27][var40 + 1];
								int var49 = field44[var27][var40];
								int var50 = field44[var27 + 1][var40];
								int var51 = field44[var27 + 1][var40 + 1];
								int var52 = field44[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method29(var55, var56, var57);
									var55 = field55 + var55 & 0xFF;
									var57 += field56;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method29(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field41[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !FloType.field943[var44 - 1].field947) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field50[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = Pix3D.field592[method27(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method68(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method27(var53, var49), method27(var53, var50), method27(var53, var51), method27(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field41[var7][var27][var40] + 1;
									byte var61 = field42[var7][var27][var40];
									FloType var62 = FloType.field943[var44 - 1];
									int var63 = var62.field945;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = Pix3D.method182(var63);
										var65 = -1;
									} else if (var62.field944 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method29(var62.field949, var62.field950, var62.field951);
										var64 = Pix3D.field592[method28(var62.field954, 96)];
									}

									arg0.method68(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method27(var53, var49), method27(var53, var50), method27(var53, var51), method27(var53, var52), method28(var65, var49), method28(var65, var50), method28(var65, var51), method28(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field36 - 1; var66++) {
				for (int var67 = 1; var67 < field35 - 1; var67++) {
					arg0.method67(var7, var67, var66, method21(var67, var7, var66));
				}
			}
		}

		if (!field34) {
			arg0.method94(-10, -50, -50, 64, 768);
		}

		for (int var68 = 0; var68 < field35; var68++) {
			for (int var69 = 0; var69 < field36; var69++) {
				if ((field38[1][var68][var69] & 0x2) == 2) {
					arg0.method65(var69, var68);
				}
			}
		}

		if (!field34) {
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
					for (int var75 = 0; var75 <= field36; var75++) {
						for (int var76 = 0; var76 <= field35; var76++) {
							if ((field50[var74][var76][var75] & var70) != 0) {
								int var77 = var75;
								int var78 = var75;
								int var79 = var74;
								int var80 = var74;

								while (var77 > 0 && (field50[var74][var76][var77 - 1] & var70) != 0) {
									var77--;
								}

								while (var78 < field36 && (field50[var74][var76][var78 + 1] & var70) != 0) {
									var78++;
								}

								label332: while (var79 > 0) {
									for (int var81 = var77; var81 <= var78; var81++) {
										if ((field50[var79 - 1][var76][var81] & var70) == 0) {
											break label332;
										}
									}

									var79--;
								}

								label321: while (var80 < var73) {
									for (int var82 = var77; var82 <= var78; var82++) {
										if ((field50[var80 + 1][var76][var82] & var70) == 0) {
											break label321;
										}
									}

									var80++;
								}

								int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
								if (var83 >= 8) {
									short var84 = 240;
									int var85 = field37[var80][var76][var77] - var84;
									int var86 = field37[var79][var76][var77];
									World3D.method66(var76 * 128, 1, var86, var78 * 128 + 128, var73, var76 * 128, var85, var77 * 128);

									for (int var87 = var79; var87 <= var80; var87++) {
										for (int var88 = var77; var88 <= var78; var88++) {
											field50[var87][var76][var88] &= ~var70;
										}
									}
								}
							}

							if ((field50[var74][var76][var75] & var71) != 0) {
								int var89 = var76;
								int var90 = var76;
								int var91 = var74;
								int var92 = var74;

								while (var89 > 0 && (field50[var74][var89 - 1][var75] & var71) != 0) {
									var89--;
								}

								while (var90 < field35 && (field50[var74][var90 + 1][var75] & var71) != 0) {
									var90++;
								}

								label385: while (var91 > 0) {
									for (int var93 = var89; var93 <= var90; var93++) {
										if ((field50[var91 - 1][var93][var75] & var71) == 0) {
											break label385;
										}
									}

									var91--;
								}

								label374: while (var92 < var73) {
									for (int var94 = var89; var94 <= var90; var94++) {
										if ((field50[var92 + 1][var94][var75] & var71) == 0) {
											break label374;
										}
									}

									var92++;
								}

								int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
								if (var95 >= 8) {
									short var96 = 240;
									int var97 = field37[var92][var89][var75] - var96;
									int var98 = field37[var91][var89][var75];
									World3D.method66(var89 * 128, 2, var98, var75 * 128, var73, var90 * 128 + 128, var97, var75 * 128);

									for (int var99 = var91; var99 <= var92; var99++) {
										for (int var100 = var89; var100 <= var90; var100++) {
											field50[var99][var100][var75] &= ~var71;
										}
									}
								}
							}

							if ((field50[var74][var76][var75] & var72) != 0) {
								int var101 = var76;
								int var102 = var76;
								int var103 = var75;
								int var104 = var75;

								while (var103 > 0 && (field50[var74][var76][var103 - 1] & var72) != 0) {
									var103--;
								}

								while (var104 < field36 && (field50[var74][var76][var104 + 1] & var72) != 0) {
									var104++;
								}

								label438: while (var101 > 0) {
									for (int var105 = var103; var105 <= var104; var105++) {
										if ((field50[var74][var101 - 1][var105] & var72) == 0) {
											break label438;
										}
									}

									var101--;
								}

								label427: while (var102 < field35) {
									for (int var106 = var103; var106 <= var104; var106++) {
										if ((field50[var74][var102 + 1][var106] & var72) == 0) {
											break label427;
										}
									}

									var102++;
								}

								if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
									int var107 = field37[var74][var101][var103];
									World3D.method66(var101 * 128, 4, var107, var104 * 128 + 128, var73, var102 * 128 + 128, var107, var103 * 128);

									for (int var108 = var101; var108 <= var102; var108++) {
										for (int var109 = var103; var109 <= var104; var109++) {
											field50[var74][var108][var109] &= ~var72;
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
		if ((field38[arg1][arg0][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field38[1][arg0][arg2] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
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
		int var4 = 0x10000 - Pix3D.field581[arg2 * 1024 / arg3] >> 1;
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

	@ObfuscatedName("c.c(III)Z")
	public static final boolean method30(int arg0, int arg1) {
		LocType var2 = LocType.method333(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method336(arg1);
	}

	@ObfuscatedName("c.a(IIIILs;BI[[[ILjc;II)V")
	public static final void method31(int arg0, int arg1, int arg2, int arg3, World3D arg4, int arg5, int[][][] arg6, CollisionMap arg7, int arg8, int arg9) {
		int var10 = arg6[arg8][arg0][arg3];
		int var11 = arg6[arg8][arg0 + 1][arg3];
		int var12 = arg6[arg8][arg0 + 1][arg3 + 1];
		int var13 = arg6[arg8][arg0][arg3 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LocType var15 = LocType.method333(arg2);
		int var16 = (arg2 << 14) + (arg3 << 7) + arg0 + 0x40000000;
		if (!var15.field826) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg5 << 6) + arg1);
		if (arg1 == 22) {
			Entity var18;
			if (var15.field830 == -1) {
				var18 = var15.method339(22, arg5, var10, var11, var12, var13, -1);
			} else {
				var18 = new LocEntity(var13, var12, var10, 22, arg5, true, var11, arg2, var15.field830);
			}

			arg4.method69(arg3, arg9, arg0, var16, var14, var18, var17);

			if (var15.field824 && var15.field826) {
				arg7.method362(arg3, arg0);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			Entity var19;
			if (var15.field830 == -1) {
				var19 = var15.method339(10, arg5, var10, var11, var12, var13, -1);
			} else {
				var19 = new LocEntity(var13, var12, var10, 10, arg5, true, var11, arg2, var15.field830);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg1 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg5 == 1 || arg5 == 3) {
					var21 = var15.field823;
					var22 = var15.field822;
				} else {
					var21 = var15.field822;
					var22 = var15.field823;
				}

				arg4.method73(var17, var16, arg0, arg9, var14, var21, var20, var19, var22, arg3);
			}

			if (var15.field824) {
				arg7.method361(var15.field825, arg5, arg0, var15.field823, var15.field822, arg3);
			}
		} else if (arg1 >= 12) {
			Entity var23;
			if (var15.field830 == -1) {
				var23 = var15.method339(arg1, arg5, var10, var11, var12, var13, -1);
			} else {
				var23 = new LocEntity(var13, var12, var10, arg1, arg5, true, var11, arg2, var15.field830);
			}

			arg4.method73(var17, var16, arg0, arg9, var14, 1, 0, var23, 1, arg3);

			if (var15.field824) {
				arg7.method361(var15.field825, arg5, arg0, var15.field823, var15.field822, arg3);
			}
		} else if (arg1 == 0) {
			Entity var24;
			if (var15.field830 == -1) {
				var24 = var15.method339(0, arg5, var10, var11, var12, var13, -1);
			} else {
				var24 = new LocEntity(var13, var12, var10, 0, arg5, true, var11, arg2, var15.field830);
			}

			arg4.method71(arg0, var16, arg9, 0, field51[arg5], var14, null, var24, var17, arg3);

			if (var15.field824) {
				arg7.method360(arg3, arg1, arg0, var15.field825, arg5);
			}
		} else if (arg1 == 1) {
			Entity var25;
			if (var15.field830 == -1) {
				var25 = var15.method339(1, arg5, var10, var11, var12, var13, -1);
			} else {
				var25 = new LocEntity(var13, var12, var10, 1, arg5, true, var11, arg2, var15.field830);
			}

			arg4.method71(arg0, var16, arg9, 0, field52[arg5], var14, null, var25, var17, arg3);

			if (var15.field824) {
				arg7.method360(arg3, arg1, arg0, var15.field825, arg5);
			}
		} else if (arg1 == 2) {
			int var26 = arg5 + 1 & 0x3;
			Entity var27;
			Entity var28;
			if (var15.field830 == -1) {
				var27 = var15.method339(2, arg5 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method339(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new LocEntity(var13, var12, var10, 2, arg5 + 4, true, var11, arg2, var15.field830);
				var28 = new LocEntity(var13, var12, var10, 2, var26, true, var11, arg2, var15.field830);
			}

			arg4.method71(arg0, var16, arg9, field51[var26], field51[arg5], var14, var28, var27, var17, arg3);

			if (var15.field824) {
				arg7.method360(arg3, arg1, arg0, var15.field825, arg5);
			}
		} else if (arg1 == 3) {
			Entity var29;
			if (var15.field830 == -1) {
				var29 = var15.method339(3, arg5, var10, var11, var12, var13, -1);
			} else {
				var29 = new LocEntity(var13, var12, var10, 3, arg5, true, var11, arg2, var15.field830);
			}

			arg4.method71(arg0, var16, arg9, 0, field52[arg5], var14, null, var29, var17, arg3);

			if (var15.field824) {
				arg7.method360(arg3, arg1, arg0, var15.field825, arg5);
			}
		} else if (arg1 == 9) {
			Entity var30;
			if (var15.field830 == -1) {
				var30 = var15.method339(arg1, arg5, var10, var11, var12, var13, -1);
			} else {
				var30 = new LocEntity(var13, var12, var10, arg1, arg5, true, var11, arg2, var15.field830);
			}

			arg4.method73(var17, var16, arg0, arg9, var14, 1, 0, var30, 1, arg3);

			if (var15.field824) {
				arg7.method361(var15.field825, arg5, arg0, var15.field823, var15.field822, arg3);
			}
		} else if (arg1 == 4) {
			Entity var31;
			if (var15.field830 == -1) {
				var31 = var15.method339(4, 0, var10, var11, var12, var13, -1);
			} else {
				var31 = new LocEntity(var13, var12, var10, 4, 0, true, var11, arg2, var15.field830);
			}

			arg4.method72(var17, var31, 0, arg0, arg3, field51[arg5], 0, arg5 * 512, arg9, var14, var16);
		} else if (arg1 == 5) {
			int var32 = 16;
			int var33 = arg4.method89(arg9, arg0, arg3);
			if (var33 > 0) {
				var32 = LocType.method333(var33 >> 14 & 0x7FFF).field831;
			}

			Entity var34;
			if (var15.field830 == -1) {
				var34 = var15.method339(4, 0, var10, var11, var12, var13, -1);
			} else {
				var34 = new LocEntity(var13, var12, var10, 4, 0, true, var11, arg2, var15.field830);
			}

			arg4.method72(var17, var34, field53[arg5] * var32, arg0, arg3, field51[arg5], field54[arg5] * var32, arg5 * 512, arg9, var14, var16);
		} else if (arg1 == 6) {
			Entity var35;
			if (var15.field830 == -1) {
				var35 = var15.method339(4, 0, var10, var11, var12, var13, -1);
			} else {
				var35 = new LocEntity(var13, var12, var10, 4, 0, true, var11, arg2, var15.field830);
			}

			arg4.method72(var17, var35, 0, arg0, arg3, 256, 0, arg5, arg9, var14, var16);
		} else if (arg1 == 7) {
			Entity var36;
			if (var15.field830 == -1) {
				var36 = var15.method339(4, 0, var10, var11, var12, var13, -1);
			} else {
				var36 = new LocEntity(var13, var12, var10, 4, 0, true, var11, arg2, var15.field830);
			}

			arg4.method72(var17, var36, 0, arg0, arg3, 512, 0, arg5, arg9, var14, var16);
		} else if (arg1 == 8) {
			Entity var37;
			if (var15.field830 == -1) {
				var37 = var15.method339(4, 0, var10, var11, var12, var13, -1);
			} else {
				var37 = new LocEntity(var13, var12, var10, 4, 0, true, var11, arg2, var15.field830);
			}

			arg4.method72(var17, var37, 0, arg0, arg3, 768, 0, arg5, arg9, var14, var16);
		}
	}
}
