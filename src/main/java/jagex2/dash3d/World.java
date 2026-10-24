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

@ObfuscatedName("CRRWDRTI")
public final class World {

	@ObfuscatedName("CRRWDRTI.x")
	public int maxTileX;

	@ObfuscatedName("CRRWDRTI.y")
	public int maxTileZ;

	@ObfuscatedName("CRRWDRTI.g")
	public int[][][] levelHeightmap;

	@ObfuscatedName("CRRWDRTI.A")
	public byte[][][] levelTileFlags;

	@ObfuscatedName("CRRWDRTI.t")
	public byte[][][] levelTileUnderlayIds;

	@ObfuscatedName("CRRWDRTI.h")
	public byte[][][] levelTileOverlayIds;

	@ObfuscatedName("CRRWDRTI.n")
	public byte[][][] levelTileOverlayShape;

	@ObfuscatedName("CRRWDRTI.z")
	public byte[][][] levelTileOverlayRotation;

	@ObfuscatedName("CRRWDRTI.m")
	public int[][][] levelOccludemap;

	@ObfuscatedName("CRRWDRTI.l")
	public byte[][][] levelShademap;

	@ObfuscatedName("CRRWDRTI.q")
	public int[][] levelLightmap;

	@ObfuscatedName("CRRWDRTI.b")
	public int[] blendChroma;

	@ObfuscatedName("CRRWDRTI.c")
	public int[] blendSaturation;

	@ObfuscatedName("CRRWDRTI.d")
	public int[] blendLightness;

	@ObfuscatedName("CRRWDRTI.e")
	public int[] blendLuminance;

	@ObfuscatedName("CRRWDRTI.f")
	public int[] blendMagnitude;

	@ObfuscatedName("CRRWDRTI.o")
	public static final int[] WALL_DECORATION_ROTATION_FORWARD_X = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("CRRWDRTI.r")
	public static final int[] ROTATION_WALL_CORNER_TYPE = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("CRRWDRTI.v")
	public static final int[] WALL_DECORATION_ROTATION_FORWARD_Z = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("CRRWDRTI.w")
	public static int currentLevel = 99;

	@ObfuscatedName("CRRWDRTI.C")
	public static boolean lowMemory = true;

	@ObfuscatedName("CRRWDRTI.D")
	public static final int[] ROTATION_WALL_TYPE = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("CRRWDRTI.a")
	public static int randomHueOffset = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("CRRWDRTI.k")
	public static int randomLightnessOffset = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("CRRWDRTI.i")
	public static int levelBuilt;

	public World(byte[][][] arg0, int arg1, int arg2, int[][][] arg3) {
		currentLevel = 99;
		maxTileX = arg2;
		maxTileZ = arg1;
		levelHeightmap = arg3;
		levelTileFlags = arg0;
		levelTileUnderlayIds = new byte[4][maxTileX][maxTileZ];
		levelTileOverlayIds = new byte[4][maxTileX][maxTileZ];
		levelTileOverlayShape = new byte[4][maxTileX][maxTileZ];
		levelTileOverlayRotation = new byte[4][maxTileX][maxTileZ];
		levelOccludemap = new int[4][maxTileX + 1][maxTileZ + 1];
		levelShademap = new byte[4][maxTileX + 1][maxTileZ + 1];
		levelLightmap = new int[maxTileX + 1][maxTileZ + 1];
		blendChroma = new int[maxTileZ];
		blendSaturation = new int[maxTileZ];
		blendLightness = new int[maxTileZ];
		blendLuminance = new int[maxTileZ];
		blendMagnitude = new int[maxTileZ];
	}

	@ObfuscatedName("CRRWDRTI.a(II)I")
	public static final int noise(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("CRRWDRTI.a([LFTPNODIB;LNYFUGYQS;I)V")
	public final void build(CollisionMap[] arg0, World3D arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((levelTileFlags[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((levelTileFlags[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].setBlocked(var5, var4);
						}
					}
				}
			}
		}

		randomHueOffset += (int) (Math.random() * 5.0D) - 2;
		if (randomHueOffset < -8) {
			randomHueOffset = -8;
		}

		if (randomHueOffset > 8) {
			randomHueOffset = 8;
		}

		randomLightnessOffset += (int) (Math.random() * 5.0D) - 2;
		if (randomLightnessOffset < -16) {
			randomLightnessOffset = -16;
		}

		if (randomLightnessOffset > 16) {
			randomLightnessOffset = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = levelShademap[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < maxTileZ - 1; var16++) {
				for (int var17 = 1; var17 < maxTileX - 1; var17++) {
					int var18 = levelHeightmap[var7][var17 + 1][var16] - levelHeightmap[var7][var17 - 1][var16];
					int var19 = levelHeightmap[var7][var17][var16 + 1] - levelHeightmap[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					levelLightmap[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < maxTileZ; var26++) {
				blendChroma[var26] = 0;
				blendSaturation[var26] = 0;
				blendLightness[var26] = 0;
				blendLuminance[var26] = 0;
				blendMagnitude[var26] = 0;
			}

			for (int var27 = -5; var27 < maxTileX + 5; var27++) {
				for (int var28 = 0; var28 < maxTileZ; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < maxTileX) {
						int var30 = levelTileUnderlayIds[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							FloType var31 = FloType.instances[var30 - 1];
							blendChroma[var28] += var31.chroma;
							blendSaturation[var28] += var31.saturation;
							blendLightness[var28] += var31.lightness;
							blendLuminance[var28] += var31.luminance;
							blendMagnitude[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < maxTileX) {
						int var33 = levelTileUnderlayIds[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							FloType var34 = FloType.instances[var33 - 1];
							blendChroma[var28] -= var34.chroma;
							blendSaturation[var28] -= var34.saturation;
							blendLightness[var28] -= var34.lightness;
							blendLuminance[var28] -= var34.luminance;
							blendMagnitude[var28]--;
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
							var35 += blendChroma[var41];
							var36 += blendSaturation[var41];
							var37 += blendLightness[var41];
							var38 += blendLuminance[var41];
							var39 += blendMagnitude[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < maxTileZ) {
							var35 -= blendChroma[var42];
							var36 -= blendSaturation[var42];
							var37 -= blendLightness[var42];
							var38 -= blendLuminance[var42];
							var39 -= blendMagnitude[var42];
						}

						if (var40 >= 1 && var40 < maxTileZ - 1 && (!lowMemory || (levelTileFlags[0][var27][var40] & 0x2) != 0 || (levelTileFlags[var7][var27][var40] & 0x10) == 0 && getDrawLevel(var40, var7, var27) == levelBuilt)) {
							if (var7 < currentLevel) {
								currentLevel = var7;
							}

							int var43 = levelTileUnderlayIds[var7][var27][var40] & 0xFF;
							int var44 = levelTileOverlayIds[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = levelHeightmap[var7][var27][var40];
								int var46 = levelHeightmap[var7][var27 + 1][var40];
								int var47 = levelHeightmap[var7][var27 + 1][var40 + 1];
								int var48 = levelHeightmap[var7][var27][var40 + 1];
								int var49 = levelLightmap[var27][var40];
								int var50 = levelLightmap[var27 + 1][var40];
								int var51 = levelLightmap[var27 + 1][var40 + 1];
								int var52 = levelLightmap[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = hsl24to16(var55, var56, var57);
									var55 = randomHueOffset + var55 & 0xFF;
									var57 += randomLightnessOffset;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = hsl24to16(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && levelTileOverlayShape[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !FloType.instances[var44 - 1].occlude) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										levelOccludemap[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = Pix3D.palette[mulHSL(var54, 96)];
								}

								if (var44 == 0) {
									arg1.setTile(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, mulHSL(var53, var49), mulHSL(var53, var50), mulHSL(var53, var51), mulHSL(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = levelTileOverlayShape[var7][var27][var40] + 1;
									byte var61 = levelTileOverlayRotation[var7][var27][var40];
									FloType var62 = FloType.instances[var44 - 1];
									int var63 = var62.texture;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = Pix3D.getAverageTextureRGB(var63);
										var65 = -1;
									} else if (var62.rgb == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = hsl24to16(var62.hue, var62.saturation, var62.lightness);
										var64 = Pix3D.palette[adjustLightness(var62.hsl, 96)];
									}

									arg1.setTile(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, mulHSL(var53, var49), mulHSL(var53, var50), mulHSL(var53, var51), mulHSL(var53, var52), adjustLightness(var65, var49), adjustLightness(var65, var50), adjustLightness(var65, var51), adjustLightness(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < maxTileZ - 1; var66++) {
				for (int var67 = 1; var67 < maxTileX - 1; var67++) {
					arg1.setDrawLevel(var7, var67, var66, getDrawLevel(var66, var7, var67));
				}
			}
		}

		arg1.buildModels(-10, 64, -50, 768, -50);

		for (int var68 = 0; var68 < maxTileX; var68++) {
			for (int var69 = 0; var69 < maxTileZ; var69++) {
				if ((levelTileFlags[1][var68][var69] & 0x2) == 2) {
					arg1.setBridge(var69, var68);
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
						if ((levelOccludemap[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (levelOccludemap[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < maxTileZ && (levelOccludemap[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((levelOccludemap[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((levelOccludemap[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = levelHeightmap[var80][var76][var77] - var84;
								int var86 = levelHeightmap[var79][var76][var77];
								World3D.addOccluder(var73, var76 * 128, var86, var76 * 128, var78 * 128 + 128, var85, var77 * 128, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										levelOccludemap[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((levelOccludemap[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (levelOccludemap[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < maxTileX && (levelOccludemap[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((levelOccludemap[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((levelOccludemap[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = levelHeightmap[var92][var89][var75] - var96;
								int var98 = levelHeightmap[var91][var89][var75];
								World3D.addOccluder(var73, var89 * 128, var98, var90 * 128 + 128, var75 * 128, var97, var75 * 128, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										levelOccludemap[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((levelOccludemap[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (levelOccludemap[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < maxTileZ && (levelOccludemap[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((levelOccludemap[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < maxTileX) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((levelOccludemap[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = levelHeightmap[var74][var101][var103];
								World3D.addOccluder(var73, var101 * 128, var107, var102 * 128 + 128, var104 * 128 + 128, var107, var103 * 128, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										levelOccludemap[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("CRRWDRTI.b(II)I")
	public static final int perlin(int arg0, int arg1) {
		int var2 = perlin(arg0 + 45365, arg1 + 91923, 4) + (perlin(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (perlin(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("CRRWDRTI.a(BLMBMGIXGO;LGHOWLKWN;)V")
	public static final void prefetchLocs(Packet arg0, OnDemand arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.gsmarts();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			LocType var4 = LocType.get(var2);
			var4.prefetch(arg1);

			while (true) {
				int var5 = arg0.gsmarts();
				if (var5 == 0) {
					break;
				}

				arg0.g1();
			}
		}
	}

	@ObfuscatedName("CRRWDRTI.a(IIIII)V")
	public final void stitchHeightmap(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg1; var5++) {
			for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
				if (var6 >= 0 && var6 < maxTileX && var5 >= 0 && var5 < maxTileZ) {
					levelShademap[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						levelHeightmap[0][var6][var5] = levelHeightmap[0][var6 - 1][var5];
					}

					if (arg2 + arg3 == var6 && var6 < maxTileX - 1) {
						levelHeightmap[0][var6][var5] = levelHeightmap[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						levelHeightmap[0][var6][var5] = levelHeightmap[0][var6][var5 - 1];
					}

					if (arg0 + arg1 == var5 && var5 < maxTileZ - 1) {
						levelHeightmap[0][var6][var5] = levelHeightmap[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("CRRWDRTI.a(ILNYFUGYQS;LFTPNODIB;IIIIZI)V")
	public final void addLoc(int arg0, World3D arg1, CollisionMap arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (lowMemory && (levelTileFlags[0][arg5][arg0] & 0x2) == 0) {
			if ((levelTileFlags[arg4][arg5][arg0] & 0x10) != 0) {
				return;
			}

			if (getDrawLevel(arg0, arg4, arg5) != levelBuilt) {
				return;
			}
		}

		if (arg4 < currentLevel) {
			currentLevel = arg4;
		}

		int var9 = levelHeightmap[arg4][arg5][arg0];
		int var10 = levelHeightmap[arg4][arg5 + 1][arg0];
		int var11 = levelHeightmap[arg4][arg5 + 1][arg0 + 1];
		int var12 = levelHeightmap[arg4][arg5][arg0 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		LocType var14 = LocType.get(arg6);
		int var15 = (arg6 << 14) + (arg0 << 7) + arg5 + 0x40000000;
		if (!var14.active) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg7 << 6) + arg3);
		if (arg3 == 22) {
			if (!lowMemory || var14.active || var14.forcedecor) {
				Entity var17;
				if (var14.anim == -1 && var14.multiloc == null) {
					var17 = var14.getModel(22, arg7, var9, var10, var11, var12, -1);
				} else {
					var17 = new LocEntity(arg6, arg7, 22, var10, var11, var9, var12, var14.anim, true);
				}

				arg1.addGroundDecoration(arg4, var13, arg0, var17, var16, var15, arg5);

				if (var14.blockwalk && var14.active && arg2 != null) {
					arg2.setBlocked(arg0, arg5);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			Entity var18;
			if (var14.anim == -1 && var14.multiloc == null) {
				var18 = var14.getModel(10, arg7, var9, var10, var11, var12, -1);
			} else {
				var18 = new LocEntity(arg6, arg7, 10, var10, var11, var9, var12, var14.anim, true);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg3 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg7 == 1 || arg7 == 3) {
					var20 = var14.length;
					var21 = var14.width;
				} else {
					var20 = var14.width;
					var21 = var14.length;
				}

				if (arg1.add(var15, var16, var13, var21, var18, var20, arg4, var19, arg0, arg5) && var14.shadow) {
					Model var22;
					if (var18 instanceof Model) {
						var22 = (Model) var18;
					} else {
						var22 = var14.getModel(10, arg7, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.radius / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > levelShademap[arg4][arg5 + var23][arg0 + var24]) {
									levelShademap[arg4][arg5 + var23][arg0 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.blockwalk && arg2 != null) {
				arg2.addLoc(var14.blockrange, var14.width, var14.length, arg5, arg0, arg7);
			}
		} else if (arg3 >= 12) {
			Entity var26;
			if (var14.anim == -1 && var14.multiloc == null) {
				var26 = var14.getModel(arg3, arg7, var9, var10, var11, var12, -1);
			} else {
				var26 = new LocEntity(arg6, arg7, arg3, var10, var11, var9, var12, var14.anim, true);
			}

			arg1.add(var15, var16, var13, 1, var26, 1, arg4, 0, arg0, arg5);

			if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
				levelOccludemap[arg4][arg5][arg0] |= 0x924;
			}

			if (var14.blockwalk && arg2 != null) {
				arg2.addLoc(var14.blockrange, var14.width, var14.length, arg5, arg0, arg7);
			}
		} else if (arg3 == 0) {
			Entity var27;
			if (var14.anim == -1 && var14.multiloc == null) {
				var27 = var14.getModel(0, arg7, var9, var10, var11, var12, -1);
			} else {
				var27 = new LocEntity(arg6, arg7, 0, var10, var11, var9, var12, var14.anim, true);
			}

			arg1.setWall(ROTATION_WALL_TYPE[arg7], var27, var15, arg0, var16, arg5, null, var13, 0, arg4);

			if (arg7 == 0) {
				if (var14.shadow) {
					levelShademap[arg4][arg5][arg0] = 50;
					levelShademap[arg4][arg5][arg0 + 1] = 50;
				}

				if (var14.occlude) {
					levelOccludemap[arg4][arg5][arg0] |= 0x249;
				}
			} else if (arg7 == 1) {
				if (var14.shadow) {
					levelShademap[arg4][arg5][arg0 + 1] = 50;
					levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
				}

				if (var14.occlude) {
					levelOccludemap[arg4][arg5][arg0 + 1] |= 0x492;
				}
			} else if (arg7 == 2) {
				if (var14.shadow) {
					levelShademap[arg4][arg5 + 1][arg0] = 50;
					levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
				}

				if (var14.occlude) {
					levelOccludemap[arg4][arg5 + 1][arg0] |= 0x249;
				}
			} else if (arg7 == 3) {
				if (var14.shadow) {
					levelShademap[arg4][arg5][arg0] = 50;
					levelShademap[arg4][arg5 + 1][arg0] = 50;
				}

				if (var14.occlude) {
					levelOccludemap[arg4][arg5][arg0] |= 0x492;
				}
			}

			if (var14.blockwalk && arg2 != null) {
				arg2.addWall(arg0, arg7, arg5, arg3, var14.blockrange);
			}

			if (var14.wallwidth != 16) {
				arg1.setWallDecorationOffset(arg0, var14.wallwidth, arg5, arg4);
			}
		} else if (arg3 == 1) {
			Entity var28;
			if (var14.anim == -1 && var14.multiloc == null) {
				var28 = var14.getModel(1, arg7, var9, var10, var11, var12, -1);
			} else {
				var28 = new LocEntity(arg6, arg7, 1, var10, var11, var9, var12, var14.anim, true);
			}

			arg1.setWall(ROTATION_WALL_CORNER_TYPE[arg7], var28, var15, arg0, var16, arg5, null, var13, 0, arg4);

			if (var14.shadow) {
				if (arg7 == 0) {
					levelShademap[arg4][arg5][arg0 + 1] = 50;
				} else if (arg7 == 1) {
					levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
				} else if (arg7 == 2) {
					levelShademap[arg4][arg5 + 1][arg0] = 50;
				} else if (arg7 == 3) {
					levelShademap[arg4][arg5][arg0] = 50;
				}
			}

			if (var14.blockwalk && arg2 != null) {
				arg2.addWall(arg0, arg7, arg5, arg3, var14.blockrange);
			}
		} else if (arg3 == 2) {
			int var29 = arg7 + 1 & 0x3;
			Entity var30;
			Entity var31;
			if (var14.anim == -1 && var14.multiloc == null) {
				var30 = var14.getModel(2, arg7 + 4, var9, var10, var11, var12, -1);
				var31 = var14.getModel(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new LocEntity(arg6, arg7 + 4, 2, var10, var11, var9, var12, var14.anim, true);
				var31 = new LocEntity(arg6, var29, 2, var10, var11, var9, var12, var14.anim, true);
			}

			arg1.setWall(ROTATION_WALL_TYPE[arg7], var30, var15, arg0, var16, arg5, var31, var13, ROTATION_WALL_TYPE[var29], arg4);

			if (var14.occlude) {
				if (arg7 == 0) {
					levelOccludemap[arg4][arg5][arg0] |= 0x249;
					levelOccludemap[arg4][arg5][arg0 + 1] |= 0x492;
				} else if (arg7 == 1) {
					levelOccludemap[arg4][arg5][arg0 + 1] |= 0x492;
					levelOccludemap[arg4][arg5 + 1][arg0] |= 0x249;
				} else if (arg7 == 2) {
					levelOccludemap[arg4][arg5 + 1][arg0] |= 0x249;
					levelOccludemap[arg4][arg5][arg0] |= 0x492;
				} else if (arg7 == 3) {
					levelOccludemap[arg4][arg5][arg0] |= 0x492;
					levelOccludemap[arg4][arg5][arg0] |= 0x249;
				}
			}

			if (var14.blockwalk && arg2 != null) {
				arg2.addWall(arg0, arg7, arg5, arg3, var14.blockrange);
			}

			if (var14.wallwidth != 16) {
				arg1.setWallDecorationOffset(arg0, var14.wallwidth, arg5, arg4);
			}
		} else if (arg3 == 3) {
			Entity var32;
			if (var14.anim == -1 && var14.multiloc == null) {
				var32 = var14.getModel(3, arg7, var9, var10, var11, var12, -1);
			} else {
				var32 = new LocEntity(arg6, arg7, 3, var10, var11, var9, var12, var14.anim, true);
			}

			arg1.setWall(ROTATION_WALL_CORNER_TYPE[arg7], var32, var15, arg0, var16, arg5, null, var13, 0, arg4);

			if (var14.shadow) {
				if (arg7 == 0) {
					levelShademap[arg4][arg5][arg0 + 1] = 50;
				} else if (arg7 == 1) {
					levelShademap[arg4][arg5 + 1][arg0 + 1] = 50;
				} else if (arg7 == 2) {
					levelShademap[arg4][arg5 + 1][arg0] = 50;
				} else if (arg7 == 3) {
					levelShademap[arg4][arg5][arg0] = 50;
				}
			}

			if (var14.blockwalk && arg2 != null) {
				arg2.addWall(arg0, arg7, arg5, arg3, var14.blockrange);
			}
		} else if (arg3 == 9) {
			Entity var33;
			if (var14.anim == -1 && var14.multiloc == null) {
				var33 = var14.getModel(arg3, arg7, var9, var10, var11, var12, -1);
			} else {
				var33 = new LocEntity(arg6, arg7, arg3, var10, var11, var9, var12, var14.anim, true);
			}

			arg1.add(var15, var16, var13, 1, var33, 1, arg4, 0, arg0, arg5);

			if (var14.blockwalk && arg2 != null) {
				arg2.addLoc(var14.blockrange, var14.width, var14.length, arg5, arg0, arg7);
			}
		} else {
			if (var14.hillskew) {
				if (arg7 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg7 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg7 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg3 == 4) {
				Entity var38;
				if (var14.anim == -1 && var14.multiloc == null) {
					var38 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new LocEntity(arg6, 0, 4, var10, var11, var9, var12, var14.anim, true);
				}

				arg1.setWallDecoration(var15, arg0, arg7 * 512, arg4, 0, var13, var38, arg5, var16, 0, ROTATION_WALL_TYPE[arg7]);
			} else if (arg3 == 5) {
				int var39 = 16;
				int var40 = arg1.getWallBitset(arg4, arg5, arg0);
				if (var40 > 0) {
					var39 = LocType.get(var40 >> 14 & 0x7FFF).wallwidth;
				}

				Entity var41;
				if (var14.anim == -1 && var14.multiloc == null) {
					var41 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new LocEntity(arg6, 0, 4, var10, var11, var9, var12, var14.anim, true);
				}

				arg1.setWallDecoration(var15, arg0, arg7 * 512, arg4, WALL_DECORATION_ROTATION_FORWARD_X[arg7] * var39, var13, var41, arg5, var16, WALL_DECORATION_ROTATION_FORWARD_Z[arg7] * var39, ROTATION_WALL_TYPE[arg7]);
			} else if (arg3 == 6) {
				Entity var42;
				if (var14.anim == -1 && var14.multiloc == null) {
					var42 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new LocEntity(arg6, 0, 4, var10, var11, var9, var12, var14.anim, true);
				}

				arg1.setWallDecoration(var15, arg0, arg7, arg4, 0, var13, var42, arg5, var16, 0, 256);
			} else if (arg3 == 7) {
				Entity var43;
				if (var14.anim == -1 && var14.multiloc == null) {
					var43 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new LocEntity(arg6, 0, 4, var10, var11, var9, var12, var14.anim, true);
				}

				arg1.setWallDecoration(var15, arg0, arg7, arg4, 0, var13, var43, arg5, var16, 0, 512);
			} else if (arg3 == 8) {
				Entity var44;
				if (var14.anim == -1 && var14.multiloc == null) {
					var44 = var14.getModel(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new LocEntity(arg6, 0, 4, var10, var11, var9, var12, var14.anim, true);
				}

				arg1.setWallDecoration(var15, arg0, arg7, arg4, 0, var13, var44, arg5, var16, 0, 768);
			}
		}
	}

	@ObfuscatedName("CRRWDRTI.a(III)I")
	public static final int perlin(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("CRRWDRTI.b(III)I")
	public final int hsl24to16(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("CRRWDRTI.c(III)Z")
	public static final boolean isLocReady(int arg0, int arg1) {
		LocType var2 = LocType.get(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.validate(arg1);
	}

	@ObfuscatedName("CRRWDRTI.a(II[LFTPNODIB;III[BIII)V")
	public final void readLandRegion(int arg0, int arg1, CollisionMap[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg3 + var10 > 0 && arg3 + var10 < 103 && arg8 + var11 > 0 && arg8 + var11 < 103) {
					arg2[arg7].flags[arg3 + var10][arg8 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		Packet var12 = new Packet(arg5);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg0 == var13 && var14 >= arg4 && var14 < arg4 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
						readLandInner(arg8 + WorldRegion.rotateZ(var15 & 0x7, arg1, var14 & 0x7), 0, var12, arg3 + WorldRegion.rotateX(arg1, var15 & 0x7, var14 & 0x7), arg7, arg1, 0);
					} else {
						readLandInner(-1, 0, var12, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("CRRWDRTI.a([BIIIIB[LFTPNODIB;)V")
	public final void readLand(byte[] arg0, int arg1, int arg2, int arg3, int arg4, CollisionMap[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg2 + var8 > 0 && arg2 + var8 < 103 && arg1 + var9 > 0 && arg1 + var9 < 103) {
						arg5[var7].flags[arg2 + var8][arg1 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		Packet var10 = new Packet(arg0);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					readLandInner(arg1 + var13, arg4, var10, arg2 + var12, var11, 0, arg3);
				}
			}
		}
	}

	@ObfuscatedName("CRRWDRTI.a(IILMBMGIXGO;IIIII)V")
	public final void readLandInner(int arg0, int arg1, Packet arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 >= 0 && arg3 < 104 && arg0 >= 0 && arg0 < 104) {
			levelTileFlags[arg4][arg3][arg0] = 0;
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

					if (arg4 == 0) {
						levelHeightmap[0][arg3][arg0] = -var9 * 8;
						return;
					}

					levelHeightmap[arg4][arg3][arg0] = levelHeightmap[arg4 - 1][arg3][arg0] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					levelTileOverlayIds[arg4][arg3][arg0] = arg2.g1b();
					levelTileOverlayShape[arg4][arg3][arg0] = (byte) ((var8 - 2) / 4);
					levelTileOverlayRotation[arg4][arg3][arg0] = (byte) (var8 + arg5 - 2 & 0x3);
				} else if (var8 <= 81) {
					levelTileFlags[arg4][arg3][arg0] = (byte) (var8 - 49);
				} else {
					levelTileUnderlayIds[arg4][arg3][arg0] = (byte) (var8 - 81);
				}
			}

			if (arg4 == 0) {
				levelHeightmap[0][arg3][arg0] = -perlin(arg3 + arg6 + 932731, arg0 + 556238 + arg1) * 8;
			} else {
				levelHeightmap[arg4][arg3][arg0] = levelHeightmap[arg4 - 1][arg3][arg0] - 240;
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

	@ObfuscatedName("CRRWDRTI.a(IIII)I")
	public int getDrawLevel(int arg0, int arg1, int arg2) {
		if ((levelTileFlags[arg1][arg2][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (levelTileFlags[1][arg2][arg0] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("CRRWDRTI.a([LFTPNODIB;LNYFUGYQS;IIIZI[BIII)V")
	public final void readLocRegion(CollisionMap[] arg0, World3D arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
		Packet var11 = new Packet(arg6);
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
				if (arg2 == var18 && var17 >= arg7 && var17 < arg7 + 8 && var16 >= arg4 && var16 < arg4 + 8) {
					LocType var22 = LocType.get(var12);
					int var23 = arg3 + WorldRegion.rotateLocX(arg8, var22.length, var17 & 0x7, var16 & 0x7, var22.width);
					int var24 = arg9 + WorldRegion.rotateLocZ(var16 & 0x7, var22.length, arg8, var22.width, var17 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((levelTileFlags[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						CollisionMap var26 = null;
						if (var25 >= 0) {
							var26 = arg0[var25];
						}

						addLoc(var24, arg1, var26, var20, arg5, var23, var12, arg8 + var21 & 0x3);
					}
				}
			}
		}
	}

	@ObfuscatedName("CRRWDRTI.b(IIII)I")
	public static final int interpolate(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - Pix3D.cos[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("CRRWDRTI.c(II)I")
	public final int adjustLightness(int arg0, int arg1) {
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

	@ObfuscatedName("CRRWDRTI.d(II)I")
	public static final int smoothNoise(int arg0, int arg1) {
		int var2 = noise(arg0 - 1, arg1 - 1) + noise(arg0 + 1, arg1 - 1) + noise(arg0 - 1, arg1 + 1) + noise(arg0 + 1, arg1 + 1);
		int var3 = noise(arg0 - 1, arg1) + noise(arg0 + 1, arg1) + noise(arg0, arg1 - 1) + noise(arg0, arg1 + 1);
		int var4 = noise(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("CRRWDRTI.e(II)I")
	public static final int mulHSL(int arg0, int arg1) {
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

	@ObfuscatedName("CRRWDRTI.a(LNYFUGYQS;IIIILFTPNODIB;[[[IIIIB)V")
	public static final void addLoc(World3D arg0, int arg1, int arg2, int arg3, int arg4, CollisionMap arg5, int[][][] arg6, int arg7, int arg8, int arg9) {
		int var10 = arg6[arg4][arg7][arg2];
		int var11 = arg6[arg4][arg7 + 1][arg2];
		int var12 = arg6[arg4][arg7 + 1][arg2 + 1];
		int var13 = arg6[arg4][arg7][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LocType var15 = LocType.get(arg8);
		int var16 = (arg8 << 14) + (arg2 << 7) + arg7 + 0x40000000;
		if (!var15.active) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg1 << 6) + arg3);
		if (arg3 == 22) {
			Entity var18;
			if (var15.anim == -1 && var15.multiloc == null) {
				var18 = var15.getModel(22, arg1, var10, var11, var12, var13, -1);
			} else {
				var18 = new LocEntity(arg8, arg1, 22, var11, var12, var10, var13, var15.anim, true);
			}

			arg0.addGroundDecoration(arg9, var14, arg2, var18, var17, var16, arg7);

			if (var15.blockwalk && var15.active) {
				arg5.setBlocked(arg2, arg7);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			Entity var19;
			if (var15.anim == -1 && var15.multiloc == null) {
				var19 = var15.getModel(10, arg1, var10, var11, var12, var13, -1);
			} else {
				var19 = new LocEntity(arg8, arg1, 10, var11, var12, var10, var13, var15.anim, true);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg3 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg1 == 1 || arg1 == 3) {
					var21 = var15.length;
					var22 = var15.width;
				} else {
					var21 = var15.width;
					var22 = var15.length;
				}

				arg0.add(var16, var17, var14, var22, var19, var21, arg9, var20, arg2, arg7);
			}

			if (var15.blockwalk) {
				arg5.addLoc(var15.blockrange, var15.width, var15.length, arg7, arg2, arg1);
			}
		} else if (arg3 >= 12) {
			Entity var23;
			if (var15.anim == -1 && var15.multiloc == null) {
				var23 = var15.getModel(arg3, arg1, var10, var11, var12, var13, -1);
			} else {
				var23 = new LocEntity(arg8, arg1, arg3, var11, var12, var10, var13, var15.anim, true);
			}

			arg0.add(var16, var17, var14, 1, var23, 1, arg9, 0, arg2, arg7);

			if (var15.blockwalk) {
				arg5.addLoc(var15.blockrange, var15.width, var15.length, arg7, arg2, arg1);
			}
		} else if (arg3 == 0) {
			Entity var24;
			if (var15.anim == -1 && var15.multiloc == null) {
				var24 = var15.getModel(0, arg1, var10, var11, var12, var13, -1);
			} else {
				var24 = new LocEntity(arg8, arg1, 0, var11, var12, var10, var13, var15.anim, true);
			}

			arg0.setWall(ROTATION_WALL_TYPE[arg1], var24, var16, arg2, var17, arg7, null, var14, 0, arg9);

			if (var15.blockwalk) {
				arg5.addWall(arg2, arg1, arg7, arg3, var15.blockrange);
			}
		} else if (arg3 == 1) {
			Entity var25;
			if (var15.anim == -1 && var15.multiloc == null) {
				var25 = var15.getModel(1, arg1, var10, var11, var12, var13, -1);
			} else {
				var25 = new LocEntity(arg8, arg1, 1, var11, var12, var10, var13, var15.anim, true);
			}

			arg0.setWall(ROTATION_WALL_CORNER_TYPE[arg1], var25, var16, arg2, var17, arg7, null, var14, 0, arg9);

			if (var15.blockwalk) {
				arg5.addWall(arg2, arg1, arg7, arg3, var15.blockrange);
			}
		} else if (arg3 == 2) {
			int var26 = arg1 + 1 & 0x3;
			Entity var27;
			Entity var28;
			if (var15.anim == -1 && var15.multiloc == null) {
				var27 = var15.getModel(2, arg1 + 4, var10, var11, var12, var13, -1);
				var28 = var15.getModel(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new LocEntity(arg8, arg1 + 4, 2, var11, var12, var10, var13, var15.anim, true);
				var28 = new LocEntity(arg8, var26, 2, var11, var12, var10, var13, var15.anim, true);
			}

			arg0.setWall(ROTATION_WALL_TYPE[arg1], var27, var16, arg2, var17, arg7, var28, var14, ROTATION_WALL_TYPE[var26], arg9);

			if (var15.blockwalk) {
				arg5.addWall(arg2, arg1, arg7, arg3, var15.blockrange);
			}
		} else if (arg3 == 3) {
			Entity var29;
			if (var15.anim == -1 && var15.multiloc == null) {
				var29 = var15.getModel(3, arg1, var10, var11, var12, var13, -1);
			} else {
				var29 = new LocEntity(arg8, arg1, 3, var11, var12, var10, var13, var15.anim, true);
			}

			arg0.setWall(ROTATION_WALL_CORNER_TYPE[arg1], var29, var16, arg2, var17, arg7, null, var14, 0, arg9);

			if (var15.blockwalk) {
				arg5.addWall(arg2, arg1, arg7, arg3, var15.blockrange);
			}
		} else if (arg3 == 9) {
			Entity var30;
			if (var15.anim == -1 && var15.multiloc == null) {
				var30 = var15.getModel(arg3, arg1, var10, var11, var12, var13, -1);
			} else {
				var30 = new LocEntity(arg8, arg1, arg3, var11, var12, var10, var13, var15.anim, true);
			}

			arg0.add(var16, var17, var14, 1, var30, 1, arg9, 0, arg2, arg7);

			if (var15.blockwalk) {
				arg5.addLoc(var15.blockrange, var15.width, var15.length, arg7, arg2, arg1);
			}
		} else {
			if (var15.hillskew) {
				if (arg1 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg1 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg1 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg3 == 4) {
				Entity var35;
				if (var15.anim == -1 && var15.multiloc == null) {
					var35 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new LocEntity(arg8, 0, 4, var11, var12, var10, var13, var15.anim, true);
				}

				arg0.setWallDecoration(var16, arg2, arg1 * 512, arg9, 0, var14, var35, arg7, var17, 0, ROTATION_WALL_TYPE[arg1]);
			} else if (arg3 == 5) {
				int var36 = 16;
				int var37 = arg0.getWallBitset(arg9, arg7, arg2);
				if (var37 > 0) {
					var36 = LocType.get(var37 >> 14 & 0x7FFF).wallwidth;
				}

				Entity var38;
				if (var15.anim == -1 && var15.multiloc == null) {
					var38 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new LocEntity(arg8, 0, 4, var11, var12, var10, var13, var15.anim, true);
				}

				arg0.setWallDecoration(var16, arg2, arg1 * 512, arg9, WALL_DECORATION_ROTATION_FORWARD_X[arg1] * var36, var14, var38, arg7, var17, WALL_DECORATION_ROTATION_FORWARD_Z[arg1] * var36, ROTATION_WALL_TYPE[arg1]);
			} else if (arg3 == 6) {
				Entity var39;
				if (var15.anim == -1 && var15.multiloc == null) {
					var39 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new LocEntity(arg8, 0, 4, var11, var12, var10, var13, var15.anim, true);
				}

				arg0.setWallDecoration(var16, arg2, arg1, arg9, 0, var14, var39, arg7, var17, 0, 256);
			} else if (arg3 == 7) {
				Entity var40;
				if (var15.anim == -1 && var15.multiloc == null) {
					var40 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new LocEntity(arg8, 0, 4, var11, var12, var10, var13, var15.anim, true);
				}

				arg0.setWallDecoration(var16, arg2, arg1, arg9, 0, var14, var40, arg7, var17, 0, 512);
			} else if (arg3 == 8) {
				Entity var41;
				if (var15.anim == -1 && var15.multiloc == null) {
					var41 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new LocEntity(arg8, 0, 4, var11, var12, var10, var13, var15.anim, true);
				}

				arg0.setWallDecoration(var16, arg2, arg1, arg9, 0, var14, var41, arg7, var17, 0, 768);
			}
		}
	}

	@ObfuscatedName("CRRWDRTI.a(I[BII)Z")
	public static final boolean validateLocs(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		Packet var4 = new Packet(arg1);
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
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LocType var16 = LocType.get(var5);
						if (var13 != 22 || !lowMemory || var16.active || var16.forcedecor) {
							var3 &= var16.validate();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("CRRWDRTI.a(I[LFTPNODIB;IILNYFUGYQS;[B)V")
	public final void readLoc(int arg0, CollisionMap[] arg1, int arg2, World3D arg3, byte[] arg4) {
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
				int var17 = arg0 + var12;
				int var18 = arg2 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((levelTileFlags[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					CollisionMap var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					addLoc(var18, arg3, var20, var15, var13, var17, var7, var16);
				}
			}
		}
	}
}
