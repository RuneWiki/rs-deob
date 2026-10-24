package jagex2.client;

import deob.ObfuscatedName;
import jagex2.config.FloType;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.dash3d.ClientLocAnim;
import jagex2.dash3d.CollisionMap;
import jagex2.dash3d.Model;
import jagex2.dash3d.ModelSource;
import jagex2.dash3d.Pix3D;
import jagex2.dash3d.World;
import jagex2.datastruct.LinkList;
import jagex2.io.Packet;

@ObfuscatedName("c")
public final class ClientBuild {

	@ObfuscatedName("c.d")
	public static boolean lowMem = true;

	@ObfuscatedName("c.e")
	public static int minusedlevel;

	@ObfuscatedName("c.f")
	public static boolean fullbright;

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

	public ClientBuild(int arg0, byte[][][] arg1, int arg2, int[][][] arg3) {
		maxTileX = arg2;
		maxTileZ = arg0;
		groundh = arg3;
		mapl = arg1;
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

	@ObfuscatedName("c.a(IIIII)V")
	public final void fadeAdjacent(int arg0, int arg1, int arg2, int arg3) {
		byte var5 = 0;
		for (int var6 = 0; var6 < FloType.numDefinitions; var6++) {
			if (FloType.list[var6].debugname.equalsIgnoreCase("water")) {
				var5 = (byte) (var6 + 1);
				break;
			}
		}

		for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
			for (int var8 = arg0; var8 < arg0 + arg2; var8++) {
				if (var8 >= 0 && var8 < maxTileX && var7 >= 0 && var7 < maxTileZ) {
					floort2[0][var8][var7] = var5;

					for (int var9 = 0; var9 < 4; var9++) {
						groundh[var9][var8][var7] = 0;
						mapl[var9][var8][var7] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("c.a([BIIIII)V")
	public final void loadGround(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
		Packet var6 = new Packet(arg0);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg3 + var8;
					int var11 = arg2 + var9;
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
							groundh[0][var10][var11] = -perlinNoise(var10 + arg1 + 932731, var11 + 556238 + arg4) * 8;
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

	@ObfuscatedName("c.a([BLr;[Lec;Lob;ZII)V")
	public final void loadLocations(byte[] arg0, World arg1, CollisionMap[] arg2, LinkList arg3, int arg4, int arg5) {
		Packet var7 = new Packet(arg0);
		int var8 = -1;
		while (true) {
			int var9 = var7.gsmart();
			if (var9 == 0) {
				return;
			}

			var8 += var9;
			int var10 = 0;
			while (true) {
				int var11 = var7.gsmart();
				if (var11 == 0) {
					break;
				}

				var10 += var11 - 1;
				int var12 = var10 & 0x3F;
				int var13 = var10 >> 6 & 0x3F;
				int var14 = var10 >> 12;
				int var15 = var7.g1();
				int var16 = var15 >> 2;
				int var17 = var15 & 0x3;
				int var18 = arg5 + var13;
				int var19 = arg4 + var12;
				if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
					int var20 = var14;
					if ((mapl[1][var18][var19] & 0x2) == 2) {
						var20 = var14 - 1;
					}

					CollisionMap var21 = null;
					if (var20 >= 0) {
						var21 = arg2[var20];
					}

					addLoc(var21, var14, var19, var17, var16, arg1, arg3, var8, var18);
				}
			}
		}
	}

	@ObfuscatedName("c.a(Lec;ZIIIILr;Lob;II)V")
	public final void addLoc(CollisionMap arg0, int arg1, int arg2, int arg3, int arg4, World arg5, LinkList arg6, int arg7, int arg8) {
		if (lowMem) {
			if ((mapl[arg1][arg8][arg2] & 0x10) != 0) {
				return;
			}

			if (getVisBelowLevel(arg1, arg8, arg2) != minusedlevel) {
				return;
			}
		}

		int var10 = groundh[arg1][arg8][arg2];
		int var11 = groundh[arg1][arg8 + 1][arg2];
		int var12 = groundh[arg1][arg8 + 1][arg2 + 1];
		int var13 = groundh[arg1][arg8][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LocType var15 = LocType.list(arg7);
		int var16 = (arg7 << 14) + (arg2 << 7) + arg8 + 0x40000000;
		if (!var15.active) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg3 << 6) + arg4);
		if (arg4 == 22) {
			if (!lowMem || var15.active || var15.forcedecor) {
				Model var18 = var15.buildModel(22, arg3, var10, var11, var12, var13, -1);
				arg5.setGroundDecor(var18, arg8, var16, arg2, arg1, var17, var14);

				if (var15.blockwalk && var15.active && arg0 != null) {
					arg0.blockGround(arg2, arg8);
				}

				if (var15.anim != -1) {
					arg6.push(new ClientLocAnim(true, arg7, arg1, 3, SeqType.list[var15.anim], arg2, arg8));
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			Model var19 = var15.buildModel(10, arg3, var10, var11, var12, var13, -1);
			if (var19 != null) {
				int var20 = 0;
				if (arg4 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg3 == 1 || arg3 == 3) {
					var21 = var15.length;
					var22 = var15.width;
				} else {
					var21 = var15.width;
					var22 = var15.length;
				}

				if (arg5.addScenery(var14, arg1, null, var16, arg2, arg8, var21, var17, var19, var20, var22) && var15.shadow) {
					for (int var23 = 0; var23 <= var21; var23++) {
						for (int var24 = 0; var24 <= var22; var24++) {
							int var25 = var19.radius / 4;
							if (var25 > 30) {
								var25 = 30;
							}

							if (var25 > shadow[arg1][arg8 + var23][arg2 + var24]) {
								shadow[arg1][arg8 + var23][arg2 + var24] = (byte) var25;
							}
						}
					}
				}
			}

			if (var15.blockwalk && arg0 != null) {
				arg0.addLoc(arg3, var15.length, var15.width, arg8, arg2, var15.blockrange);
			}

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 2, SeqType.list[var15.anim], arg2, arg8));
			}
		} else if (arg4 >= 12) {
			Model var26 = var15.buildModel(arg4, arg3, var10, var11, var12, var13, -1);
			arg5.addScenery(var14, arg1, null, var16, arg2, arg8, 1, var17, var26, 0, 1);

			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg1 > 0) {
				mapo[arg1][arg8][arg2] |= 0x924;
			}

			if (var15.blockwalk && arg0 != null) {
				arg0.addLoc(arg3, var15.length, var15.width, arg8, arg2, var15.blockrange);
			}

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 2, SeqType.list[var15.anim], arg2, arg8));
			}
		} else if (arg4 == 0) {
			Model var27 = var15.buildModel(0, arg3, var10, var11, var12, var13, -1);
			arg5.setWall(0, var14, arg1, WSHAPE0[arg3], var27, null, arg8, var16, arg2, var17);

			if (arg3 == 0) {
				if (var15.shadow) {
					shadow[arg1][arg8][arg2] = 50;
					shadow[arg1][arg8][arg2 + 1] = 50;
				}

				if (var15.occlude) {
					mapo[arg1][arg8][arg2] |= 0x249;
				}
			} else if (arg3 == 1) {
				if (var15.shadow) {
					shadow[arg1][arg8][arg2 + 1] = 50;
					shadow[arg1][arg8 + 1][arg2 + 1] = 50;
				}

				if (var15.occlude) {
					mapo[arg1][arg8][arg2 + 1] |= 0x492;
				}
			} else if (arg3 == 2) {
				if (var15.shadow) {
					shadow[arg1][arg8 + 1][arg2] = 50;
					shadow[arg1][arg8 + 1][arg2 + 1] = 50;
				}

				if (var15.occlude) {
					mapo[arg1][arg8 + 1][arg2] |= 0x249;
				}
			} else if (arg3 == 3) {
				if (var15.shadow) {
					shadow[arg1][arg8][arg2] = 50;
					shadow[arg1][arg8 + 1][arg2] = 50;
				}

				if (var15.occlude) {
					mapo[arg1][arg8][arg2] |= 0x492;
				}
			}

			if (var15.blockwalk && arg0 != null) {
				arg0.addWall(arg3, arg2, arg8, var15.blockrange, arg4);
			}

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 0, SeqType.list[var15.anim], arg2, arg8));
			}

			if (var15.wallwidth != 16) {
				arg5.moveDecor(arg1, arg2, arg8, var15.wallwidth);
			}
		} else if (arg4 == 1) {
			Model var28 = var15.buildModel(1, arg3, var10, var11, var12, var13, -1);
			arg5.setWall(0, var14, arg1, WSHAPE1[arg3], var28, null, arg8, var16, arg2, var17);

			if (var15.shadow) {
				if (arg3 == 0) {
					shadow[arg1][arg8][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					shadow[arg1][arg8 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					shadow[arg1][arg8 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					shadow[arg1][arg8][arg2] = 50;
				}
			}

			if (var15.blockwalk && arg0 != null) {
				arg0.addWall(arg3, arg2, arg8, var15.blockrange, arg4);
			}

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 0, SeqType.list[var15.anim], arg2, arg8));
			}
		} else if (arg4 == 2) {
			int var29 = arg3 + 1 & 0x3;
			Model var30 = var15.buildModel(2, arg3 + 4, var10, var11, var12, var13, -1);
			Model var31 = var15.buildModel(2, var29, var10, var11, var12, var13, -1);
			arg5.setWall(WSHAPE0[var29], var14, arg1, WSHAPE0[arg3], var30, var31, arg8, var16, arg2, var17);

			if (var15.occlude) {
				if (arg3 == 0) {
					mapo[arg1][arg8][arg2] |= 0x249;
					mapo[arg1][arg8][arg2 + 1] |= 0x492;
				} else if (arg3 == 1) {
					mapo[arg1][arg8][arg2 + 1] |= 0x492;
					mapo[arg1][arg8 + 1][arg2] |= 0x249;
				} else if (arg3 == 2) {
					mapo[arg1][arg8 + 1][arg2] |= 0x249;
					mapo[arg1][arg8][arg2] |= 0x492;
				} else if (arg3 == 3) {
					mapo[arg1][arg8][arg2] |= 0x492;
					mapo[arg1][arg8][arg2] |= 0x249;
				}
			}

			if (var15.blockwalk && arg0 != null) {
				arg0.addWall(arg3, arg2, arg8, var15.blockrange, arg4);
			}

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 0, SeqType.list[var15.anim], arg2, arg8));
			}

			if (var15.wallwidth != 16) {
				arg5.moveDecor(arg1, arg2, arg8, var15.wallwidth);
			}
		} else if (arg4 == 3) {
			Model var32 = var15.buildModel(3, arg3, var10, var11, var12, var13, -1);
			arg5.setWall(0, var14, arg1, WSHAPE1[arg3], var32, null, arg8, var16, arg2, var17);

			if (var15.shadow) {
				if (arg3 == 0) {
					shadow[arg1][arg8][arg2 + 1] = 50;
				} else if (arg3 == 1) {
					shadow[arg1][arg8 + 1][arg2 + 1] = 50;
				} else if (arg3 == 2) {
					shadow[arg1][arg8 + 1][arg2] = 50;
				} else if (arg3 == 3) {
					shadow[arg1][arg8][arg2] = 50;
				}
			}

			if (var15.blockwalk && arg0 != null) {
				arg0.addWall(arg3, arg2, arg8, var15.blockrange, arg4);
			}

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 0, SeqType.list[var15.anim], arg2, arg8));
			}
		} else if (arg4 == 9) {
			Model var33 = var15.buildModel(arg4, arg3, var10, var11, var12, var13, -1);
			arg5.addScenery(var14, arg1, null, var16, arg2, arg8, 1, var17, var33, 0, 1);

			if (var15.blockwalk && arg0 != null) {
				arg0.addLoc(arg3, var15.length, var15.width, arg8, arg2, var15.blockrange);
			}

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 2, SeqType.list[var15.anim], arg2, arg8));
			}
		} else if (arg4 == 4) {
			Model var34 = var15.buildModel(4, 0, var10, var11, var12, var13, -1);
			arg5.setDecor(var14, arg2, 0, var16, arg3 * 512, WSHAPE0[arg3], 0, arg8, var34, var17, arg1);

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 1, SeqType.list[var15.anim], arg2, arg8));
			}
		} else if (arg4 == 5) {
			int var35 = 16;
			int var36 = arg5.wallType(arg1, arg8, arg2);
			if (var36 > 0) {
				var35 = LocType.list(var36 >> 14 & 0x7FFF).wallwidth;
			}

			Model var37 = var15.buildModel(4, 0, var10, var11, var12, var13, -1);
			arg5.setDecor(var14, arg2, DECORZOF[arg3] * var35, var16, arg3 * 512, WSHAPE0[arg3], DECORXOF[arg3] * var35, arg8, var37, var17, arg1);

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 1, SeqType.list[var15.anim], arg2, arg8));
			}
		} else if (arg4 == 6) {
			Model var38 = var15.buildModel(4, 0, var10, var11, var12, var13, -1);
			arg5.setDecor(var14, arg2, 0, var16, arg3, 256, 0, arg8, var38, var17, arg1);

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 1, SeqType.list[var15.anim], arg2, arg8));
			}
		} else if (arg4 == 7) {
			Model var39 = var15.buildModel(4, 0, var10, var11, var12, var13, -1);
			arg5.setDecor(var14, arg2, 0, var16, arg3, 512, 0, arg8, var39, var17, arg1);

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 1, SeqType.list[var15.anim], arg2, arg8));
			}
		} else if (arg4 == 8) {
			Model var40 = var15.buildModel(4, 0, var10, var11, var12, var13, -1);
			arg5.setDecor(var14, arg2, 0, var16, arg3, 768, 0, arg8, var40, var17, arg1);

			if (var15.anim != -1) {
				arg6.push(new ClientLocAnim(true, arg7, arg1, 1, SeqType.list[var15.anim], arg2, arg8));
			}
		}
	}

	@ObfuscatedName("c.a(Lr;I[Lec;)V")
	public final void finishBuild(World arg0, CollisionMap[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((mapl[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((mapl[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].blockGround(var5, var4);
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

						if (var40 >= 1 && var40 < maxTileZ - 1 && (!lowMem || (mapl[var7][var27][var40] & 0x10) == 0 && getVisBelowLevel(var7, var27, var40) == minusedlevel)) {
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
									arg0.setGround(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, getUCol(var53, var49), getUCol(var53, var50), getUCol(var53, var51), getUCol(var53, var52), 0, 0, 0, 0, var59, 0);
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

									arg0.setGround(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, getUCol(var53, var49), getUCol(var53, var50), getUCol(var53, var51), getUCol(var53, var52), getOCol(var65, var49), getOCol(var65, var50), getOCol(var65, var51), getOCol(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < maxTileZ - 1; var66++) {
				for (int var67 = 1; var67 < maxTileX - 1; var67++) {
					arg0.setLayer(var7, var67, var66, getVisBelowLevel(var7, var67, var66));
				}
			}
		}

		if (!fullbright) {
			arg0.shareLight(-10, 64, -50, 768, -50);
		}

		for (int var68 = 0; var68 < maxTileX; var68++) {
			for (int var69 = 0; var69 < maxTileZ; var69++) {
				if ((mapl[1][var68][var69] & 0x2) == 2) {
					arg0.pushDown(var69, var68);
				}
			}
		}

		if (!fullbright) {
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

								label329: while (var79 > 0) {
									for (int var81 = var77; var81 <= var78; var81++) {
										if ((mapo[var79 - 1][var76][var81] & var70) == 0) {
											break label329;
										}
									}

									var79--;
								}

								label318: while (var80 < var73) {
									for (int var82 = var77; var82 <= var78; var82++) {
										if ((mapo[var80 + 1][var76][var82] & var70) == 0) {
											break label318;
										}
									}

									var80++;
								}

								int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
								if (var83 >= 8) {
									short var84 = 240;
									int var85 = groundh[var80][var76][var77] - var84;
									int var86 = groundh[var79][var76][var77];
									World.setOcclude(var78 * 128 + 128, var76 * 128, var86, 1, var76 * 128, var73, var85, var77 * 128);

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

								label382: while (var91 > 0) {
									for (int var93 = var89; var93 <= var90; var93++) {
										if ((mapo[var91 - 1][var93][var75] & var71) == 0) {
											break label382;
										}
									}

									var91--;
								}

								label371: while (var92 < var73) {
									for (int var94 = var89; var94 <= var90; var94++) {
										if ((mapo[var92 + 1][var94][var75] & var71) == 0) {
											break label371;
										}
									}

									var92++;
								}

								int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
								if (var95 >= 8) {
									short var96 = 240;
									int var97 = groundh[var92][var89][var75] - var96;
									int var98 = groundh[var91][var89][var75];
									World.setOcclude(var75 * 128, var89 * 128, var98, 2, var90 * 128 + 128, var73, var97, var75 * 128);

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

								label435: while (var101 > 0) {
									for (int var105 = var103; var105 <= var104; var105++) {
										if ((mapo[var74][var101 - 1][var105] & var72) == 0) {
											break label435;
										}
									}

									var101--;
								}

								label424: while (var102 < maxTileX) {
									for (int var106 = var103; var106 <= var104; var106++) {
										if ((mapo[var74][var102 + 1][var106] & var72) == 0) {
											break label424;
										}
									}

									var102++;
								}

								if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
									int var107 = groundh[var74][var101][var103];
									World.setOcclude(var104 * 128 + 128, var101 * 128, var107, 4, var102 * 128 + 128, var73, var107, var103 * 128);

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
	}

	@ObfuscatedName("c.a(IBII)I")
	public int getVisBelowLevel(int arg0, int arg1, int arg2) {
		if ((mapl[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (mapl[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
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

	@ObfuscatedName("c.a(IIII)I")
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

	@ObfuscatedName("c.a(ILob;Lec;II[[[IIIIILr;I)V")
	public static final void changeLocUnchecked(int arg0, LinkList arg1, CollisionMap arg2, int arg3, int arg4, int[][][] arg5, int arg6, int arg7, int arg8, World arg9, int arg10) {
		int var11 = arg5[arg10][arg0][arg3];
		int var12 = arg5[arg10][arg0 + 1][arg3];
		int var13 = arg5[arg10][arg0 + 1][arg3 + 1];
		int var14 = arg5[arg10][arg0][arg3 + 1];
		int var15 = var11 + var12 + var13 + var14 >> 2;
		LocType var16 = LocType.list(arg7);
		int var17 = (arg7 << 14) + (arg3 << 7) + arg0 + 0x40000000;
		if (!var16.active) {
			var17 += Integer.MIN_VALUE;
		}

		byte var18 = (byte) ((arg4 << 6) + arg8);
		if (arg8 == 22) {
			Model var19 = var16.buildModel(22, arg4, var11, var12, var13, var14, -1);
			arg9.setGroundDecor(var19, arg0, var17, arg3, arg6, var18, var15);

			if (var16.blockwalk && var16.active) {
				arg2.blockGround(arg3, arg0);
			}

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 3, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 10 || arg8 == 11) {
			Model var20 = var16.buildModel(10, arg4, var11, var12, var13, var14, -1);
			if (var20 != null) {
				int var21 = 0;
				if (arg8 == 11) {
					var21 += 256;
				}

				int var22;
				int var23;
				if (arg4 == 1 || arg4 == 3) {
					var22 = var16.length;
					var23 = var16.width;
				} else {
					var22 = var16.width;
					var23 = var16.length;
				}

				arg9.addScenery(var15, arg6, null, var17, arg3, arg0, var22, var18, var20, var21, var23);
			}

			if (var16.blockwalk) {
				arg2.addLoc(arg4, var16.length, var16.width, arg0, arg3, var16.blockrange);
			}

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 2, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 >= 12) {
			Model var24 = var16.buildModel(arg8, arg4, var11, var12, var13, var14, -1);
			arg9.addScenery(var15, arg6, null, var17, arg3, arg0, 1, var18, var24, 0, 1);

			if (var16.blockwalk) {
				arg2.addLoc(arg4, var16.length, var16.width, arg0, arg3, var16.blockrange);
			}

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 2, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 0) {
			Model var25 = var16.buildModel(0, arg4, var11, var12, var13, var14, -1);
			arg9.setWall(0, var15, arg6, WSHAPE0[arg4], var25, null, arg0, var17, arg3, var18);

			if (var16.blockwalk) {
				arg2.addWall(arg4, arg3, arg0, var16.blockrange, arg8);
			}

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 0, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 1) {
			Model var26 = var16.buildModel(1, arg4, var11, var12, var13, var14, -1);
			arg9.setWall(0, var15, arg6, WSHAPE1[arg4], var26, null, arg0, var17, arg3, var18);

			if (var16.blockwalk) {
				arg2.addWall(arg4, arg3, arg0, var16.blockrange, arg8);
			}

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 0, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 2) {
			int var27 = arg4 + 1 & 0x3;
			Model var28 = var16.buildModel(2, arg4 + 4, var11, var12, var13, var14, -1);
			Model var29 = var16.buildModel(2, var27, var11, var12, var13, var14, -1);
			arg9.setWall(WSHAPE0[var27], var15, arg6, WSHAPE0[arg4], var28, var29, arg0, var17, arg3, var18);

			if (var16.blockwalk) {
				arg2.addWall(arg4, arg3, arg0, var16.blockrange, arg8);
			}

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 0, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 3) {
			Model var30 = var16.buildModel(3, arg4, var11, var12, var13, var14, -1);
			arg9.setWall(0, var15, arg6, WSHAPE1[arg4], var30, null, arg0, var17, arg3, var18);

			if (var16.blockwalk) {
				arg2.addWall(arg4, arg3, arg0, var16.blockrange, arg8);
			}

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 0, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 9) {
			Model var31 = var16.buildModel(arg8, arg4, var11, var12, var13, var14, -1);
			arg9.addScenery(var15, arg6, null, var17, arg3, arg0, 1, var18, var31, 0, 1);

			if (var16.blockwalk) {
				arg2.addLoc(arg4, var16.length, var16.width, arg0, arg3, var16.blockrange);
			}

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 2, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 4) {
			Model var32 = var16.buildModel(4, 0, var11, var12, var13, var14, -1);
			arg9.setDecor(var15, arg3, 0, var17, arg4 * 512, WSHAPE0[arg4], 0, arg0, var32, var18, arg6);

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 1, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 5) {
			int var33 = 16;
			int var34 = arg9.wallType(arg6, arg0, arg3);
			if (var34 > 0) {
				var33 = LocType.list(var34 >> 14 & 0x7FFF).wallwidth;
			}

			Model var35 = var16.buildModel(4, 0, var11, var12, var13, var14, -1);
			arg9.setDecor(var15, arg3, DECORZOF[arg4] * var33, var17, arg4 * 512, WSHAPE0[arg4], DECORXOF[arg4] * var33, arg0, var35, var18, arg6);

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 1, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 6) {
			Model var36 = var16.buildModel(4, 0, var11, var12, var13, var14, -1);
			arg9.setDecor(var15, arg3, 0, var17, arg4, 256, 0, arg0, var36, var18, arg6);

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 1, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 7) {
			Model var37 = var16.buildModel(4, 0, var11, var12, var13, var14, -1);
			arg9.setDecor(var15, arg3, 0, var17, arg4, 512, 0, arg0, var37, var18, arg6);

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 1, SeqType.list[var16.anim], arg3, arg0));
			}
		} else if (arg8 == 8) {
			Model var38 = var16.buildModel(4, 0, var11, var12, var13, var14, -1);
			arg9.setDecor(var15, arg3, 0, var17, arg4, 768, 0, arg0, var38, var18, arg6);

			if (var16.anim != -1) {
				arg1.push(new ClientLocAnim(true, arg7, arg6, 1, SeqType.list[var16.anim], arg3, arg0));
			}
		}
	}
}
