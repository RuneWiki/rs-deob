package jagex2.client;

import deob.ObfuscatedName;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.dash3d.ClientLocAnim;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.Model;
import jagex2.dash3d.ModelSource;
import jagex2.dash3d.Pix3D;
import jagex2.dash3d.World;
import jagex2.io.OnDemand;
import jagex2.io.Packet;

@ObfuscatedName("c")
public final class ClientBuild {

	@ObfuscatedName("c.e")
	public static boolean lowMem = true;

	@ObfuscatedName("c.f")
	public static int minusedlevel;

	@ObfuscatedName("c.g")
	public int maxTileX;

	@ObfuscatedName("c.h")
	public int maxTileZ;

	@ObfuscatedName("c.i")
	public int[][][] groundh;

	@ObfuscatedName("c.j")
	public byte[][][] mapl;

	@ObfuscatedName("c.k")
	public byte[][][] floort1;

	@ObfuscatedName("c.l")
	public byte[][][] floort2;

	@ObfuscatedName("c.m")
	public byte[][][] floors;

	@ObfuscatedName("c.n")
	public byte[][][] floorr;

	@ObfuscatedName("c.o")
	public byte[][][] shadow;

	@ObfuscatedName("c.p")
	public int[][] lightmap;

	@ObfuscatedName("c.q")
	public int[] huetot;

	@ObfuscatedName("c.r")
	public int[] sattot;

	@ObfuscatedName("c.s")
	public int[] ligtot;

	@ObfuscatedName("c.t")
	public int[] comtot;

	@ObfuscatedName("c.u")
	public int[] tot;

	@ObfuscatedName("c.v")
	public int[][][] mapo;

	@ObfuscatedName("c.w")
	public static final int[] WSHAPE0 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("c.x")
	public static final int[] WSHAPE1 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("c.y")
	public static final int[] DECORXOF = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("c.z")
	public static final int[] DECORZOF = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("c.A")
	public static int hueOff = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("c.B")
	public static int ligOff = (int) (Math.random() * 33.0D) - 16;

	public ClientBuild(int[][][] arg0, int arg1, byte[][][] arg2, int arg3) {
		maxTileX = arg3;
		maxTileZ = arg1;
		groundh = arg0;
		mapl = arg2;
		floort1 = new byte[4][maxTileX][maxTileZ];
		floort2 = new byte[4][maxTileX][maxTileZ];
		floors = new byte[4][maxTileX][maxTileZ];
		floorr = new byte[4][maxTileX][maxTileZ];
		mapo = new int[4][maxTileX + 1][maxTileZ + 1];
		shadow = new byte[4][maxTileX + 1][maxTileZ + 1];
		lightmap = new int[maxTileX + 1][maxTileZ + 1];
		huetot = new int[maxTileZ];
		sattot = new int[maxTileZ];
		ligtot = new int[maxTileZ];
		comtot = new int[maxTileZ];
		tot = new int[maxTileZ];
	}

	@ObfuscatedName("c.a(IIIZI)V")
	public final void fadeAdjacent(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg1; var5 <= arg1 + arg3; var5++) {
			for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
				if (var6 >= 0 && var6 < maxTileX && var5 >= 0 && var5 < maxTileZ) {
					shadow[0][var6][var5] = 127;

					if (arg0 == var6 && var6 > 0) {
						groundh[0][var6][var5] = groundh[0][var6 - 1][var5];
					}

					if (arg0 + arg2 == var6 && var6 < maxTileX - 1) {
						groundh[0][var6][var5] = groundh[0][var6 + 1][var5];
					}

					if (arg1 == var5 && var5 > 0) {
						groundh[0][var6][var5] = groundh[0][var6][var5 - 1];
					}

					if (arg1 + arg3 == var5 && var5 < maxTileZ - 1) {
						groundh[0][var6][var5] = groundh[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(IIB[BII)V")
	public final void loadGround(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		Packet var6 = new Packet(arg2);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg4 + var8;
					int var11 = arg3 + var9;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						mapl[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.g1();
							if (var12 == 0) {
								break;
							}

							if (var12 == 1) {
								break;
							}

							if (var12 <= 49) {
								floort2[var7][var10][var11] = var6.g1b();
								floors[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								floorr[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								mapl[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								floort1[var7][var10][var11] = (byte) (var12 - 81);
							}
						}

						int var13 = var6.g1();
						if (var13 == 1) {
							var13 = 0;
						}

						if (var7 == 0) {
							groundh[0][var10][var11] = -var13 * 8;
						} else {
							groundh[var7][var10][var11] = groundh[var7 - 1][var10][var11] - var13 * 8;
						}

						if (var7 == 0) {
							groundh[0][var10][var11] = -perlinNoise(var10 + arg1 + 932731, var11 + 556238 + arg0) * 8;
						} else {
							groundh[var7][var10][var11] = groundh[var7 - 1][var10][var11] - 240;
						}
					} else {
						while (true) {
							int var14 = var6.g1();
							if (var14 == 0) {
								break;
							}

							if (var14 == 1) {
								break;
							}

							if (var14 <= 49) {
								var6.g1();
							}
						}

						var6.g1();
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(III[B)Z")
	public static final boolean checkLocations(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		Packet var4 = new Packet(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.gsmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.gsmart();
					if (var9 == 0) {
						break;
					}

					var4.g1();
				} else {
					int var10 = var4.gsmart();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.g1() >> 2;
					int var14 = arg1 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LocType var16 = LocType.list(var5);
						if (var13 != 22 || !lowMem || var16.active || var16.forcedecor) {
							var3 &= var16.checkModelAll();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a(Lub;Llb;I)V")
	public static final void prefetchLocations(OnDemand arg0, Packet arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.gsmart();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			LocType var4 = LocType.list(var2);
			var4.prefetchModelAll(arg0);

			while (true) {
				int var5 = arg1.gsmart();
				if (var5 == 0) {
					break;
				}

				arg1.g1();
			}
		}
	}

	@ObfuscatedName("c.a(II[BLr;B[Ljc;)V")
	public final void loadLocations(int arg0, int arg1, byte[] arg2, World arg3, CollisionMap[] arg4) {
		Packet var6 = new Packet(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.gsmart();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.gsmart();
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
				int var17 = arg1 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((mapl[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					CollisionMap var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					addLoc(var15, var17, arg3, var16, var13, var18, var20, var7);
				}
			}
		}
	}

	@ObfuscatedName("c.a(IILr;IIIILjc;I)V")
	public final void addLoc(int arg0, int arg1, World arg2, int arg3, int arg4, int arg5, CollisionMap arg6, int arg7) {
		if (lowMem) {
			if ((mapl[arg4][arg1][arg5] & 0x10) != 0) {
				return;
			}

			if (getVisBelowLevel(arg5, arg1, arg4) != minusedlevel) {
				return;
			}
		}

		int var9 = groundh[arg4][arg1][arg5];
		int var10 = groundh[arg4][arg1 + 1][arg5];
		int var11 = groundh[arg4][arg1 + 1][arg5 + 1];
		int var12 = groundh[arg4][arg1][arg5 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		LocType var14 = LocType.list(arg7);
		int var15 = (arg7 << 14) + (arg5 << 7) + arg1 + 0x40000000;
		if (!var14.active) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg3 << 6) + arg0);
		if (arg0 == 22) {
			if (!lowMem || var14.active || var14.forcedecor) {
				ModelSource var17;
				if (var14.anim == -1 && var14.multiloc == null) {
					var17 = var14.getModel(22, arg3, var9, var10, var11, var12, -1);
				} else {
					var17 = new ClientLocAnim(arg3, arg7, 22, var12, var11, var9, var14.anim, true, var10);
				}

				arg2.setGroundDecor(var16, var15, arg4, arg5, var13, var17, arg1);

				if (var14.blockwalk && var14.active && arg6 != null) {
					arg6.blockGround(arg1, arg5);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			ModelSource var18;
			if (var14.anim == -1 && var14.multiloc == null) {
				var18 = var14.getModel(10, arg3, var9, var10, var11, var12, -1);
			} else {
				var18 = new ClientLocAnim(arg3, arg7, 10, var12, var11, var9, var14.anim, true, var10);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg0 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg3 == 1 || arg3 == 3) {
					var20 = var14.length;
					var21 = var14.width;
				} else {
					var20 = var14.width;
					var21 = var14.length;
				}

				if (arg2.addScenery(arg5, arg1, var13, var16, var15, var19, var20, arg4, var18, var21) && var14.shadow) {
					Model var22;
					if (var18 instanceof Model) {
						var22 = (Model) var18;
					} else {
						var22 = var14.getModel(10, arg3, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.radius / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > shadow[arg4][arg1 + var23][arg5 + var24]) {
									shadow[arg4][arg1 + var23][arg5 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.blockwalk && arg6 != null) {
				arg6.addLoc(arg5, var14.width, var14.blockrange, arg1, var14.length, arg3);
			}
		} else if (arg0 >= 12) {
			ModelSource var26;
			if (var14.anim == -1 && var14.multiloc == null) {
				var26 = var14.getModel(arg0, arg3, var9, var10, var11, var12, -1);
			} else {
				var26 = new ClientLocAnim(arg3, arg7, arg0, var12, var11, var9, var14.anim, true, var10);
			}

			arg2.addScenery(arg5, arg1, var13, var16, var15, 0, 1, arg4, var26, 1);

			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
				mapo[arg4][arg1][arg5] |= 0x924;
			}

			if (var14.blockwalk && arg6 != null) {
				arg6.addLoc(arg5, var14.width, var14.blockrange, arg1, var14.length, arg3);
			}
		} else if (arg0 == 0) {
			ModelSource var27;
			if (var14.anim == -1 && var14.multiloc == null) {
				var27 = var14.getModel(0, arg3, var9, var10, var11, var12, -1);
			} else {
				var27 = new ClientLocAnim(arg3, arg7, 0, var12, var11, var9, var14.anim, true, var10);
			}

			arg2.setWall(var16, WSHAPE0[arg3], var13, var15, arg1, var27, 0, null, arg4, arg5);

			if (arg3 == 0) {
				if (var14.shadow) {
					shadow[arg4][arg1][arg5] = 50;
					shadow[arg4][arg1][arg5 + 1] = 50;
				}

				if (var14.occlude) {
					mapo[arg4][arg1][arg5] |= 0x249;
				}
			} else if (arg3 == 1) {
				if (var14.shadow) {
					shadow[arg4][arg1][arg5 + 1] = 50;
					shadow[arg4][arg1 + 1][arg5 + 1] = 50;
				}

				if (var14.occlude) {
					mapo[arg4][arg1][arg5 + 1] |= 0x492;
				}
			} else if (arg3 == 2) {
				if (var14.shadow) {
					shadow[arg4][arg1 + 1][arg5] = 50;
					shadow[arg4][arg1 + 1][arg5 + 1] = 50;
				}

				if (var14.occlude) {
					mapo[arg4][arg1 + 1][arg5] |= 0x249;
				}
			} else if (arg3 == 3) {
				if (var14.shadow) {
					shadow[arg4][arg1][arg5] = 50;
					shadow[arg4][arg1 + 1][arg5] = 50;
				}

				if (var14.occlude) {
					mapo[arg4][arg1][arg5] |= 0x492;
				}
			}

			if (var14.blockwalk && arg6 != null) {
				arg6.addWall(arg3, var14.blockrange, arg0, arg1, arg5);
			}

			if (var14.wallwidth != 16) {
				arg2.moveDecor(arg5, var14.wallwidth, arg1, arg4);
			}
		} else if (arg0 == 1) {
			ModelSource var28;
			if (var14.anim == -1 && var14.multiloc == null) {
				var28 = var14.getModel(1, arg3, var9, var10, var11, var12, -1);
			} else {
				var28 = new ClientLocAnim(arg3, arg7, 1, var12, var11, var9, var14.anim, true, var10);
			}

			arg2.setWall(var16, WSHAPE1[arg3], var13, var15, arg1, var28, 0, null, arg4, arg5);

			if (var14.shadow) {
				if (arg3 == 0) {
					shadow[arg4][arg1][arg5 + 1] = 50;
				} else if (arg3 == 1) {
					shadow[arg4][arg1 + 1][arg5 + 1] = 50;
				} else if (arg3 == 2) {
					shadow[arg4][arg1 + 1][arg5] = 50;
				} else if (arg3 == 3) {
					shadow[arg4][arg1][arg5] = 50;
				}
			}

			if (var14.blockwalk && arg6 != null) {
				arg6.addWall(arg3, var14.blockrange, arg0, arg1, arg5);
			}
		} else if (arg0 == 2) {
			int var29 = arg3 + 1 & 0x3;
			ModelSource var30;
			ModelSource var31;
			if (var14.anim == -1 && var14.multiloc == null) {
				var30 = var14.getModel(2, arg3 + 4, var9, var10, var11, var12, -1);
				var31 = var14.getModel(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new ClientLocAnim(arg3 + 4, arg7, 2, var12, var11, var9, var14.anim, true, var10);
				var31 = new ClientLocAnim(var29, arg7, 2, var12, var11, var9, var14.anim, true, var10);
			}

			arg2.setWall(var16, WSHAPE0[arg3], var13, var15, arg1, var30, WSHAPE0[var29], var31, arg4, arg5);

			if (var14.occlude) {
				if (arg3 == 0) {
					mapo[arg4][arg1][arg5] |= 0x249;
					mapo[arg4][arg1][arg5 + 1] |= 0x492;
				} else if (arg3 == 1) {
					mapo[arg4][arg1][arg5 + 1] |= 0x492;
					mapo[arg4][arg1 + 1][arg5] |= 0x249;
				} else if (arg3 == 2) {
					mapo[arg4][arg1 + 1][arg5] |= 0x249;
					mapo[arg4][arg1][arg5] |= 0x492;
				} else if (arg3 == 3) {
					mapo[arg4][arg1][arg5] |= 0x492;
					mapo[arg4][arg1][arg5] |= 0x249;
				}
			}

			if (var14.blockwalk && arg6 != null) {
				arg6.addWall(arg3, var14.blockrange, arg0, arg1, arg5);
			}

			if (var14.wallwidth != 16) {
				arg2.moveDecor(arg5, var14.wallwidth, arg1, arg4);
			}
		} else if (arg0 == 3) {
			ModelSource var32;
			if (var14.anim == -1 && var14.multiloc == null) {
				var32 = var14.getModel(3, arg3, var9, var10, var11, var12, -1);
			} else {
				var32 = new ClientLocAnim(arg3, arg7, 3, var12, var11, var9, var14.anim, true, var10);
			}

			arg2.setWall(var16, WSHAPE1[arg3], var13, var15, arg1, var32, 0, null, arg4, arg5);

			if (var14.shadow) {
				if (arg3 == 0) {
					shadow[arg4][arg1][arg5 + 1] = 50;
				} else if (arg3 == 1) {
					shadow[arg4][arg1 + 1][arg5 + 1] = 50;
				} else if (arg3 == 2) {
					shadow[arg4][arg1 + 1][arg5] = 50;
				} else if (arg3 == 3) {
					shadow[arg4][arg1][arg5] = 50;
				}
			}

			if (var14.blockwalk && arg6 != null) {
				arg6.addWall(arg3, var14.blockrange, arg0, arg1, arg5);
			}
		} else if (arg0 == 9) {
			ModelSource var33;
			if (var14.anim == -1 && var14.multiloc == null) {
				var33 = var14.getModel(arg0, arg3, var9, var10, var11, var12, -1);
			} else {
				var33 = new ClientLocAnim(arg3, arg7, arg0, var12, var11, var9, var14.anim, true, var10);
			}

			arg2.addScenery(arg5, arg1, var13, var16, var15, 0, 1, arg4, var33, 1);

			if (var14.blockwalk && arg6 != null) {
				arg6.addLoc(arg5, var14.width, var14.blockrange, arg1, var14.length, arg3);
			}
		} else {
			if (var14.hillskew) {
				if (arg3 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg3 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg3 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg0 == 4) {
				ModelSource var38;
				if (var14.anim == -1 && var14.multiloc == null) {
					var38 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new ClientLocAnim(0, arg7, 4, var12, var11, var9, var14.anim, true, var10);
				}

				arg2.setDecor(arg5, arg4, var13, var38, var16, WSHAPE0[arg3], arg3 * 512, var15, 0, arg1, 0);
			} else if (arg0 == 5) {
				int var39 = 16;
				int var40 = arg2.wallType(arg4, arg1, arg5);
				if (var40 > 0) {
					var39 = LocType.list(var40 >> 14 & 0x7FFF).wallwidth;
				}

				ModelSource var41;
				if (var14.anim == -1 && var14.multiloc == null) {
					var41 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new ClientLocAnim(0, arg7, 4, var12, var11, var9, var14.anim, true, var10);
				}

				arg2.setDecor(arg5, arg4, var13, var41, var16, WSHAPE0[arg3], arg3 * 512, var15, DECORXOF[arg3] * var39, arg1, DECORZOF[arg3] * var39);
			} else if (arg0 == 6) {
				ModelSource var42;
				if (var14.anim == -1 && var14.multiloc == null) {
					var42 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new ClientLocAnim(0, arg7, 4, var12, var11, var9, var14.anim, true, var10);
				}

				arg2.setDecor(arg5, arg4, var13, var42, var16, 256, arg3, var15, 0, arg1, 0);
			} else if (arg0 == 7) {
				ModelSource var43;
				if (var14.anim == -1 && var14.multiloc == null) {
					var43 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new ClientLocAnim(0, arg7, 4, var12, var11, var9, var14.anim, true, var10);
				}

				arg2.setDecor(arg5, arg4, var13, var43, var16, 512, arg3, var15, 0, arg1, 0);
			} else if (arg0 == 8) {
				ModelSource var44;
				if (var14.anim == -1 && var14.multiloc == null) {
					var44 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new ClientLocAnim(0, arg7, 4, var12, var11, var9, var14.anim, true, var10);
				}

				arg2.setDecor(arg5, arg4, var13, var44, var16, 768, arg3, var15, 0, arg1, 0);
			}
		}
	}

	@ObfuscatedName("c.a(B[Ljc;Lr;)V")
	public final void finishBuild(CollisionMap[] arg0, World arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((mapl[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((mapl[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].blockGround(var4, var5);
						}
					}
				}
			}
		}

		hueOff += (int) (Math.random() * 5.0D) - 2;
		if (hueOff < -8) {
			hueOff = -8;
		}

		if (hueOff > 8) {
			hueOff = 8;
		}

		ligOff += (int) (Math.random() * 5.0D) - 2;
		if (ligOff < -16) {
			ligOff = -16;
		}

		if (ligOff > 16) {
			ligOff = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = shadow[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < maxTileZ - 1; var16++) {
				for (int var17 = 1; var17 < maxTileX - 1; var17++) {
					int var18 = groundh[var7][var17 + 1][var16] - groundh[var7][var17 - 1][var16];
					int var19 = groundh[var7][var17][var16 + 1] - groundh[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					lightmap[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < maxTileZ; var26++) {
				huetot[var26] = 0;
				sattot[var26] = 0;
				ligtot[var26] = 0;
				comtot[var26] = 0;
				tot[var26] = 0;
			}

			for (int var27 = -5; var27 < maxTileX + 5; var27++) {
				for (int var28 = 0; var28 < maxTileZ; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < maxTileX) {
						int var30 = floort1[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							FloType var31 = FloType.list[var30 - 1];
							huetot[var28] += var31.underlayHue;
							sattot[var28] += var31.saturation;
							ligtot[var28] += var31.lightness;
							comtot[var28] += var31.chroma;
							tot[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < maxTileX) {
						int var33 = floort1[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							FloType var34 = FloType.list[var33 - 1];
							huetot[var28] -= var34.underlayHue;
							sattot[var28] -= var34.saturation;
							ligtot[var28] -= var34.lightness;
							comtot[var28] -= var34.chroma;
							tot[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < maxTileX - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < maxTileZ + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < maxTileZ) {
							var35 += huetot[var41];
							var36 += sattot[var41];
							var37 += ligtot[var41];
							var38 += comtot[var41];
							var39 += tot[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < maxTileZ) {
							var35 -= huetot[var42];
							var36 -= sattot[var42];
							var37 -= ligtot[var42];
							var38 -= comtot[var42];
							var39 -= tot[var42];
						}

						if (var40 >= 1 && var40 < maxTileZ - 1 && (!lowMem || (mapl[var7][var27][var40] & 0x10) == 0 && getVisBelowLevel(var40, var27, var7) == minusedlevel)) {
							int var43 = floort1[var7][var27][var40] & 0xFF;
							int var44 = floort2[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = groundh[var7][var27][var40];
								int var46 = groundh[var7][var27 + 1][var40];
								int var47 = groundh[var7][var27 + 1][var40 + 1];
								int var48 = groundh[var7][var27][var40 + 1];
								int var49 = lightmap[var27][var40];
								int var50 = lightmap[var27 + 1][var40];
								int var51 = lightmap[var27 + 1][var40 + 1];
								int var52 = lightmap[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = getTable(var55, var56, var57);
									var55 = hueOff + var55 & 0xFF;
									var57 += ligOff;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = getTable(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && floors[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !FloType.list[var44 - 1].occlude) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										mapo[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = Pix3D.colourTable[getUCol(var54, 96)];
								}

								if (var44 == 0) {
									arg1.setGround(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, getUCol(var53, var49), getUCol(var53, var50), getUCol(var53, var51), getUCol(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = floors[var7][var27][var40] + 1;
									byte var61 = floorr[var7][var27][var40];
									FloType var62 = FloType.list[var44 - 1];
									int var63 = var62.texture;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = Pix3D.getTextureAverage(var63);
										var65 = -1;
									} else if (var62.colour == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = getTable(var62.hue, var62.saturation, var62.lightness);
										var64 = Pix3D.colourTable[getOCol(var62.overlayHsl, 96)];
									}

									arg1.setGround(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, getUCol(var53, var49), getUCol(var53, var50), getUCol(var53, var51), getUCol(var53, var52), getOCol(var65, var49), getOCol(var65, var50), getOCol(var65, var51), getOCol(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < maxTileZ - 1; var66++) {
				for (int var67 = 1; var67 < maxTileX - 1; var67++) {
					arg1.setLayer(var7, var67, var66, getVisBelowLevel(var66, var67, var7));
				}
			}
		}

		arg1.shareLight(64, -50, 768, -50, -10);

		for (int var68 = 0; var68 < maxTileX; var68++) {
			for (int var69 = 0; var69 < maxTileZ; var69++) {
				if ((mapl[1][var68][var69] & 0x2) == 2) {
					arg1.pushDown(var69, var68);
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
				for (int var75 = 0; var75 <= maxTileZ; var75++) {
					for (int var76 = 0; var76 <= maxTileX; var76++) {
						if ((mapo[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (mapo[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < maxTileZ && (mapo[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label321: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((mapo[var79 - 1][var76][var81] & var70) == 0) {
										break label321;
									}
								}

								var79--;
							}

							label310: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((mapo[var80 + 1][var76][var82] & var70) == 0) {
										break label310;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = groundh[var80][var76][var77] - var84;
								int var86 = groundh[var79][var76][var77];
								World.setOcclude(var77 * 128, var73, var85, var76 * 128, var76 * 128, var86, var78 * 128 + 128, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										mapo[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((mapo[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (mapo[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < maxTileX && (mapo[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label374: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((mapo[var91 - 1][var93][var75] & var71) == 0) {
										break label374;
									}
								}

								var91--;
							}

							label363: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((mapo[var92 + 1][var94][var75] & var71) == 0) {
										break label363;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = groundh[var92][var89][var75] - var96;
								int var98 = groundh[var91][var89][var75];
								World.setOcclude(var75 * 128, var73, var97, var90 * 128 + 128, var89 * 128, var98, var75 * 128, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										mapo[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((mapo[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (mapo[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < maxTileZ && (mapo[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label427: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((mapo[var74][var101 - 1][var105] & var72) == 0) {
										break label427;
									}
								}

								var101--;
							}

							label416: while (var102 < maxTileX) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((mapo[var74][var102 + 1][var106] & var72) == 0) {
										break label416;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = groundh[var74][var101][var103];
								World.setOcclude(var103 * 128, var73, var107, var102 * 128 + 128, var101 * 128, var107, var104 * 128 + 128, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										mapo[var74][var108][var109] &= ~var72;
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
	public int getVisBelowLevel(int arg0, int arg1, int arg2) {
		if ((mapl[arg2][arg1][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (mapl[1][arg1][arg0] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("c.a(II)I")
	public static final int perlinNoise(int arg0, int arg1) {
		int var2 = interpolatedNoise(arg0 + 45365, arg1 + 91923, 4) + (interpolatedNoise(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (interpolatedNoise(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("c.a(III)I")
	public static final int interpolatedNoise(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = smoothNoise(var3, var5);
		int var8 = smoothNoise(var3 + 1, var5);
		int var9 = smoothNoise(var3, var5 + 1);
		int var10 = smoothNoise(var3 + 1, var5 + 1);
		int var11 = interpolate(var7, var8, var4, arg2);
		int var12 = interpolate(var9, var10, var4, arg2);
		return interpolate(var11, var12, var6, arg2);
	}

	@ObfuscatedName("c.b(IIII)I")
	public static final int interpolate(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - Pix3D.cosTable[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("c.b(II)I")
	public static final int smoothNoise(int arg0, int arg1) {
		int var2 = noise(arg0 - 1, arg1 - 1) + noise(arg0 + 1, arg1 - 1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + 1);
		int var3 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1);
		int var4 = noise(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("c.c(II)I")
	public static final int noise(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("c.d(II)I")
	public static final int getUCol(int arg0, int arg1) {
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
	public final int getOCol(int arg0, int arg1) {
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
	public final int getTable(int arg0, int arg1, int arg2) {
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
	public static final boolean changeLocAvailable(int arg0, int arg1) {
		LocType var2 = LocType.list(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.checkModel(arg1);
	}

	@ObfuscatedName("c.a(IIII[[[IIILjc;Lr;II)V")
	public static final void changeLocUnchecked(int arg0, int arg1, int arg2, int arg3, int[][][] arg4, int arg5, int arg6, CollisionMap arg7, World arg8, int arg9) {
		int var10 = arg4[arg5][arg6][arg2];
		int var11 = arg4[arg5][arg6 + 1][arg2];
		int var12 = arg4[arg5][arg6 + 1][arg2 + 1];
		int var13 = arg4[arg5][arg6][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LocType var15 = LocType.list(arg9);
		int var16 = (arg9 << 14) + (arg2 << 7) + arg6 + 0x40000000;
		if (!var15.active) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg0 << 6) + arg3);
		if (arg3 == 22) {
			ModelSource var18;
			if (var15.anim == -1 && var15.multiloc == null) {
				var18 = var15.getModel(22, arg0, var10, var11, var12, var13, -1);
			} else {
				var18 = new ClientLocAnim(arg0, arg9, 22, var13, var12, var10, var15.anim, true, var11);
			}

			arg8.setGroundDecor(var17, var16, arg1, arg2, var14, var18, arg6);

			if (var15.blockwalk && var15.active) {
				arg7.blockGround(arg6, arg2);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			ModelSource var19;
			if (var15.anim == -1 && var15.multiloc == null) {
				var19 = var15.getModel(10, arg0, var10, var11, var12, var13, -1);
			} else {
				var19 = new ClientLocAnim(arg0, arg9, 10, var13, var12, var10, var15.anim, true, var11);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg3 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg0 == 1 || arg0 == 3) {
					var21 = var15.length;
					var22 = var15.width;
				} else {
					var21 = var15.width;
					var22 = var15.length;
				}

				arg8.addScenery(arg2, arg6, var14, var17, var16, var20, var21, arg1, var19, var22);
			}

			if (var15.blockwalk) {
				arg7.addLoc(arg2, var15.width, var15.blockrange, arg6, var15.length, arg0);
			}
		} else if (arg3 >= 12) {
			ModelSource var23;
			if (var15.anim == -1 && var15.multiloc == null) {
				var23 = var15.getModel(arg3, arg0, var10, var11, var12, var13, -1);
			} else {
				var23 = new ClientLocAnim(arg0, arg9, arg3, var13, var12, var10, var15.anim, true, var11);
			}

			arg8.addScenery(arg2, arg6, var14, var17, var16, 0, 1, arg1, var23, 1);

			if (var15.blockwalk) {
				arg7.addLoc(arg2, var15.width, var15.blockrange, arg6, var15.length, arg0);
			}
		} else if (arg3 == 0) {
			ModelSource var24;
			if (var15.anim == -1 && var15.multiloc == null) {
				var24 = var15.getModel(0, arg0, var10, var11, var12, var13, -1);
			} else {
				var24 = new ClientLocAnim(arg0, arg9, 0, var13, var12, var10, var15.anim, true, var11);
			}

			arg8.setWall(var17, WSHAPE0[arg0], var14, var16, arg6, var24, 0, null, arg1, arg2);

			if (var15.blockwalk) {
				arg7.addWall(arg0, var15.blockrange, arg3, arg6, arg2);
			}
		} else if (arg3 == 1) {
			ModelSource var25;
			if (var15.anim == -1 && var15.multiloc == null) {
				var25 = var15.getModel(1, arg0, var10, var11, var12, var13, -1);
			} else {
				var25 = new ClientLocAnim(arg0, arg9, 1, var13, var12, var10, var15.anim, true, var11);
			}

			arg8.setWall(var17, WSHAPE1[arg0], var14, var16, arg6, var25, 0, null, arg1, arg2);

			if (var15.blockwalk) {
				arg7.addWall(arg0, var15.blockrange, arg3, arg6, arg2);
			}
		} else if (arg3 == 2) {
			int var26 = arg0 + 1 & 0x3;
			ModelSource var27;
			ModelSource var28;
			if (var15.anim == -1 && var15.multiloc == null) {
				var27 = var15.getModel(2, arg0 + 4, var10, var11, var12, var13, -1);
				var28 = var15.getModel(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new ClientLocAnim(arg0 + 4, arg9, 2, var13, var12, var10, var15.anim, true, var11);
				var28 = new ClientLocAnim(var26, arg9, 2, var13, var12, var10, var15.anim, true, var11);
			}

			arg8.setWall(var17, WSHAPE0[arg0], var14, var16, arg6, var27, WSHAPE0[var26], var28, arg1, arg2);

			if (var15.blockwalk) {
				arg7.addWall(arg0, var15.blockrange, arg3, arg6, arg2);
			}
		} else if (arg3 == 3) {
			ModelSource var29;
			if (var15.anim == -1 && var15.multiloc == null) {
				var29 = var15.getModel(3, arg0, var10, var11, var12, var13, -1);
			} else {
				var29 = new ClientLocAnim(arg0, arg9, 3, var13, var12, var10, var15.anim, true, var11);
			}

			arg8.setWall(var17, WSHAPE1[arg0], var14, var16, arg6, var29, 0, null, arg1, arg2);

			if (var15.blockwalk) {
				arg7.addWall(arg0, var15.blockrange, arg3, arg6, arg2);
			}
		} else if (arg3 == 9) {
			ModelSource var30;
			if (var15.anim == -1 && var15.multiloc == null) {
				var30 = var15.getModel(arg3, arg0, var10, var11, var12, var13, -1);
			} else {
				var30 = new ClientLocAnim(arg0, arg9, arg3, var13, var12, var10, var15.anim, true, var11);
			}

			arg8.addScenery(arg2, arg6, var14, var17, var16, 0, 1, arg1, var30, 1);

			if (var15.blockwalk) {
				arg7.addLoc(arg2, var15.width, var15.blockrange, arg6, var15.length, arg0);
			}
		} else {
			if (var15.hillskew) {
				if (arg0 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg0 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg0 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg3 == 4) {
				ModelSource var35;
				if (var15.anim == -1 && var15.multiloc == null) {
					var35 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new ClientLocAnim(0, arg9, 4, var13, var12, var10, var15.anim, true, var11);
				}

				arg8.setDecor(arg2, arg1, var14, var35, var17, WSHAPE0[arg0], arg0 * 512, var16, 0, arg6, 0);
			} else if (arg3 == 5) {
				int var36 = 16;
				int var37 = arg8.wallType(arg1, arg6, arg2);
				if (var37 > 0) {
					var36 = LocType.list(var37 >> 14 & 0x7FFF).wallwidth;
				}

				ModelSource var38;
				if (var15.anim == -1 && var15.multiloc == null) {
					var38 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new ClientLocAnim(0, arg9, 4, var13, var12, var10, var15.anim, true, var11);
				}

				arg8.setDecor(arg2, arg1, var14, var38, var17, WSHAPE0[arg0], arg0 * 512, var16, DECORXOF[arg0] * var36, arg6, DECORZOF[arg0] * var36);
			} else if (arg3 == 6) {
				ModelSource var39;
				if (var15.anim == -1 && var15.multiloc == null) {
					var39 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new ClientLocAnim(0, arg9, 4, var13, var12, var10, var15.anim, true, var11);
				}

				arg8.setDecor(arg2, arg1, var14, var39, var17, 256, arg0, var16, 0, arg6, 0);
			} else if (arg3 == 7) {
				ModelSource var40;
				if (var15.anim == -1 && var15.multiloc == null) {
					var40 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new ClientLocAnim(0, arg9, 4, var13, var12, var10, var15.anim, true, var11);
				}

				arg8.setDecor(arg2, arg1, var14, var40, var17, 512, arg0, var16, 0, arg6, 0);
			} else if (arg3 == 8) {
				ModelSource var41;
				if (var15.anim == -1 && var15.multiloc == null) {
					var41 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new ClientLocAnim(0, arg9, 4, var13, var12, var10, var15.anim, true, var11);
				}

				arg8.setDecor(arg2, arg1, var14, var41, var17, 768, arg0, var16, 0, arg6, 0);
			}
		}
	}
}
