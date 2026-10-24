package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.graphics.Pix2D;

@ObfuscatedName("r")
public class World {

	@ObfuscatedName("r.h")
	public static boolean lowMem = true;

	@ObfuscatedName("r.i")
	public int maxTileLevel;

	@ObfuscatedName("r.j")
	public int maxTileX;

	@ObfuscatedName("r.k")
	public int maxTileZ;

	@ObfuscatedName("r.l")
	public int[][][] groundh;

	@ObfuscatedName("r.m")
	public Square[][][] squares;

	@ObfuscatedName("r.n")
	public int minLevel;

	@ObfuscatedName("r.o")
	public int dynamicCount;

	@ObfuscatedName("r.p")
	public Sprite[] dynamicSprites = new Sprite[5000];

	@ObfuscatedName("r.q")
	public int[][][] occlusionCycle;

	@ObfuscatedName("r.r")
	public static int fillLeft;

	@ObfuscatedName("r.s")
	public static int maxLevel;

	@ObfuscatedName("r.t")
	public static int cycleNo;

	@ObfuscatedName("r.u")
	public static int minX;

	@ObfuscatedName("r.v")
	public static int maxX;

	@ObfuscatedName("r.w")
	public static int minZ;

	@ObfuscatedName("r.x")
	public static int maxZ;

	@ObfuscatedName("r.y")
	public static int gx;

	@ObfuscatedName("r.z")
	public static int gz;

	@ObfuscatedName("r.ab")
	public static final int[] MIDDEP_16 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@ObfuscatedName("r.bb")
	public static final int[] MIDDEP_32 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@ObfuscatedName("r.cb")
	public static final int[] MIDDEP_64 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@ObfuscatedName("r.db")
	public static final int[] MIDDEP_128 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@ObfuscatedName("r.eb")
	public static final int[] TEXTURE_AVERAGE = new int[] { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 3131, 41, 41, 41 };

	@ObfuscatedName("r.fb")
	public int[] shareMap = new int[10000];

	@ObfuscatedName("r.gb")
	public int[] shareMap2 = new int[10000];

	@ObfuscatedName("r.hb")
	public int shareTic;

	@ObfuscatedName("r.ib")
	public int[][] MINIMAP_SHAPE = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@ObfuscatedName("r.jb")
	public int[][] MINIMAP_ROTATE = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@ObfuscatedName("r.kb")
	public static boolean[][][][] visBacking = new boolean[8][32][51][51];

	@ObfuscatedName("r.lb")
	public static boolean[][] visBackingDirty;

	@ObfuscatedName("r.mb")
	public static int xOrig;

	@ObfuscatedName("r.nb")
	public static int yOrig;

	@ObfuscatedName("r.ob")
	public static int xClip;

	@ObfuscatedName("r.pb")
	public static int yClip;

	@ObfuscatedName("r.qb")
	public static int xClip2;

	@ObfuscatedName("r.rb")
	public static int yClip2;

	@ObfuscatedName("r.H")
	public static Sprite[] spriteBuffer = new Sprite[100];

	@ObfuscatedName("r.I")
	public static final int[] DECORXOF = new int[] { 53, -53, -53, 53 };

	@ObfuscatedName("r.J")
	public static final int[] DECORZOF = new int[] { -53, -53, 53, 53 };

	@ObfuscatedName("r.K")
	public static final int[] DECORXOF2 = new int[] { -45, 45, 45, -45 };

	@ObfuscatedName("r.L")
	public static final int[] DECORZOF2 = new int[] { 45, 45, -45, -45 };

	@ObfuscatedName("r.P")
	public static int groundX = -1;

	@ObfuscatedName("r.Q")
	public static int groundZ = -1;

	@ObfuscatedName("r.R")
	public static int OCCLUDER_LEVELS = 4;

	@ObfuscatedName("r.V")
	public static Occlude[] activeOccluders = new Occlude[500];

	@ObfuscatedName("r.W")
	public static LinkList fillQueue = new LinkList();

	@ObfuscatedName("r.X")
	public static final int[] PRETAB = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@ObfuscatedName("r.Y")
	public static final int[] MIDTAB = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@ObfuscatedName("r.Z")
	public static final int[] POSTTAB = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@ObfuscatedName("r.S")
	public static int[] numOccluders = new int[OCCLUDER_LEVELS];

	@ObfuscatedName("r.T")
	public static Occlude[][] occluders = new Occlude[OCCLUDER_LEVELS][500];

	@ObfuscatedName("r.A")
	public static int cx;

	@ObfuscatedName("r.B")
	public static int cy;

	@ObfuscatedName("r.C")
	public static int cz;

	@ObfuscatedName("r.D")
	public static int cameraSinX;

	@ObfuscatedName("r.E")
	public static int cameraCosX;

	@ObfuscatedName("r.F")
	public static int cameraSinY;

	@ObfuscatedName("r.G")
	public static int cameraCosY;

	@ObfuscatedName("r.N")
	public static int clickX;

	@ObfuscatedName("r.O")
	public static int clickY;

	@ObfuscatedName("r.U")
	public static int numActiveOccluders;

	@ObfuscatedName("r.M")
	public static boolean click;

	public World(int[][][] arg0, int arg1, int arg2, int arg3) {
		maxTileLevel = arg2;
		maxTileX = arg3;
		maxTileZ = arg1;
		squares = new Square[arg2][arg3][arg1];
		occlusionCycle = new int[arg2][arg3 + 1][arg1 + 1];
		groundh = arg0;
		resetMap();
	}

	@ObfuscatedName("r.a(Z)V")
	public static void unload() {
		spriteBuffer = null;
		numOccluders = null;
		occluders = null;
		fillQueue = null;
		visBacking = null;
		visBackingDirty = null;
	}

	@ObfuscatedName("r.a(I)V")
	public void resetMap() {
		for (int var1 = 0; var1 < maxTileLevel; var1++) {
			for (int var2 = 0; var2 < maxTileX; var2++) {
				for (int var3 = 0; var3 < maxTileZ; var3++) {
					squares[var1][var2][var3] = null;
				}
			}
		}

		for (int var4 = 0; var4 < OCCLUDER_LEVELS; var4++) {
			for (int var5 = 0; var5 < numOccluders[var4]; var5++) {
				occluders[var4][var5] = null;
			}

			numOccluders[var4] = 0;
		}

		for (int var6 = 0; var6 < dynamicCount; var6++) {
			dynamicSprites[var6] = null;
		}

		dynamicCount = 0;

		for (int var7 = 0; var7 < spriteBuffer.length; var7++) {
			spriteBuffer[var7] = null;
		}
	}

	@ObfuscatedName("r.a(II)V")
	public void fillBaseLevel(int arg0) {
		minLevel = arg0;

		for (int var2 = 0; var2 < maxTileX; var2++) {
			for (int var3 = 0; var3 < maxTileZ; var3++) {
				squares[arg0][var2][var3] = new Square(arg0, var2, var3);
			}
		}
	}

	@ObfuscatedName("r.a(IIB)V")
	public void pushDown(int arg0, int arg1) {
		Square var3 = squares[0][arg1][arg0];

		for (int var4 = 0; var4 < 3; var4++) {
			squares[var4][arg1][arg0] = squares[var4 + 1][arg1][arg0];
			if (squares[var4][arg1][arg0] != null) {
				squares[var4][arg1][arg0].level--;
			}
		}

		if (squares[0][arg1][arg0] == null) {
			squares[0][arg1][arg0] = new Square(0, arg1, arg0);
		}

		squares[0][arg1][arg0].linkedSquare = var3;
		squares[3][arg1][arg0] = null;
	}

	@ObfuscatedName("r.a(IIIIIIIII)V")
	public static void setOcclude(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Occlude var8 = new Occlude();
		var8.minTileX = arg1 / 128;
		var8.maxTileX = arg4 / 128;
		var8.minTileZ = arg7 / 128;
		var8.maxTileZ = arg0 / 128;
		var8.type = arg3;
		var8.minX = arg1;
		var8.maxX = arg4;
		var8.minZ = arg7;
		var8.maxZ = arg0;
		var8.minY = arg6;
		var8.maxY = arg2;
		occluders[arg5][numOccluders[arg5]++] = var8;
	}

	@ObfuscatedName("r.a(IIII)V")
	public void setLayer(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = squares[arg0][arg1][arg2];
		if (var5 != null) {
			squares[arg0][arg1][arg2].drawLevel = arg3;
		}
	}

	@ObfuscatedName("r.a(IIIIIIIIIIIIIIIIIIII)V")
	public void setGround(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
		if (arg3 == 0) {
			QuickGround var21 = new QuickGround(arg10, arg11, arg12, arg13, -1, arg18, false);

			for (int var22 = arg0; var22 >= 0; var22--) {
				if (squares[var22][arg1][arg2] == null) {
					squares[var22][arg1][arg2] = new Square(var22, arg1, arg2);
				}
			}

			squares[arg0][arg1][arg2].quickGround = var21;
		} else if (arg3 == 1) {
			QuickGround var23 = new QuickGround(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);

			for (int var24 = arg0; var24 >= 0; var24--) {
				if (squares[var24][arg1][arg2] == null) {
					squares[var24][arg1][arg2] = new Square(var24, arg1, arg2);
				}
			}

			squares[arg0][arg1][arg2].quickGround = var23;
		} else {
			Ground var25 = new Ground(arg1, arg3, arg15, arg7, arg12, arg4, arg10, arg9, arg19, arg14, arg5, arg17, arg18, arg8, arg16, arg13, arg6, arg2, arg11);

			for (int var26 = arg0; var26 >= 0; var26--) {
				if (squares[var26][arg1][arg2] == null) {
					squares[var26][arg1][arg2] = new Square(var26, arg1, arg2);
				}
			}

			squares[arg0][arg1][arg2].ground = var25;
		}
	}

	@ObfuscatedName("r.a(Leb;BIIIIBI)V")
	public void setGroundDecor(Model arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
		GroundDecor var8 = new GroundDecor();
		var8.model = arg0;
		var8.x = arg1 * 128 + 64;
		var8.z = arg3 * 128 + 64;
		var8.y = arg6;
		var8.typecode = arg2;
		var8.typecode2 = arg5;

		if (squares[arg4][arg1][arg3] == null) {
			squares[arg4][arg1][arg3] = new Square(arg4, arg1, arg3);
		}

		squares[arg4][arg1][arg3].groundDecor = var8;
	}

	@ObfuscatedName("r.a(Leb;Leb;IIIIILeb;I)V")
	public void setObj(Model arg0, Model arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Model arg7) {
		GroundObject var9 = new GroundObject();
		var9.topObj = arg0;
		var9.x = arg6 * 128 + 64;
		var9.z = arg5 * 128 + 64;
		var9.y = arg2;
		var9.typecode = arg4;
		var9.bottomObj = arg1;
		var9.middleObj = arg7;
		int var10 = 0;
		Square var11 = squares[arg3][arg6][arg5];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.spriteCount; var12++) {
				int var13 = var11.sprites[var12].model.objRaise;
				if (var13 > var10) {
					var10 = var13;
				}
			}
		}

		var9.height = var10;

		if (squares[arg3][arg6][arg5] == null) {
			squares[arg3][arg6][arg5] = new Square(arg3, arg6, arg5);
		}

		squares[arg3][arg6][arg5].groundObject = var9;
	}

	@ObfuscatedName("r.a(IIIIILeb;Leb;IIIB)V")
	public void setWall(int arg0, int arg1, int arg2, int arg3, Model arg4, Model arg5, int arg6, int arg7, int arg8, byte arg9) {
		if (arg4 != null || arg5 != null) {
			Wall var11 = new Wall();
			var11.typecode = arg7;
			var11.typecode2 = arg9;
			var11.x = arg6 * 128 + 64;
			var11.z = arg8 * 128 + 64;
			var11.y = arg1;
			var11.model1 = arg4;
			var11.model2 = arg5;
			var11.angle1 = arg3;
			var11.angle2 = arg0;

			for (int var12 = arg2; var12 >= 0; var12--) {
				if (squares[var12][arg6][arg8] == null) {
					squares[var12][arg6][arg8] = new Square(var12, arg6, arg8);
				}
			}

			squares[arg2][arg6][arg8].wall = var11;
		}
	}

	@ObfuscatedName("r.a(IIIIIIIIILeb;BI)V")
	public void setDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Model arg8, byte arg9, int arg10) {
		if (arg8 != null) {
			Decor var12 = new Decor();
			var12.typecode = arg3;
			var12.typecode2 = arg9;
			var12.x = arg7 * 128 + arg6 + 64;
			var12.z = arg1 * 128 + arg2 + 64;
			var12.y = arg0;
			var12.model = arg8;
			var12.wshape = arg5;
			var12.angle = arg4;

			for (int var13 = arg10; var13 >= 0; var13--) {
				if (squares[var13][arg7][arg1] == null) {
					squares[var13][arg7][arg1] = new Square(var13, arg7, arg1);
				}
			}

			squares[arg10][arg7][arg1].decor = var12;
		}
	}

	@ObfuscatedName("r.a(IIILw;IIIIBLeb;II)Z")
	public boolean addScenery(int arg0, int arg1, ModelSource arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, Model arg8, int arg9, int arg10) {
		if (arg8 == null && arg2 == null) {
			return true;
		} else {
			int var12 = arg5 * 128 + arg6 * 64;
			int var13 = arg4 * 128 + arg10 * 64;
			return setSprite(arg1, arg5, arg4, arg6, arg10, var12, var13, arg0, arg8, arg2, arg9, false, arg3, arg7);
		}
	}

	@ObfuscatedName("r.a(IIIIIIZLeb;Lw;II)Z")
	public boolean addDynamic(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, Model arg6, ModelSource arg7, int arg8, int arg9) {
		if (arg6 == null && arg7 == null) {
			return true;
		}

		int var11 = arg3 - arg1;
		int var12 = arg0 - arg1;
		int var13 = arg1 + arg3;
		int var14 = arg0 + arg1;
		if (arg5) {
			if (arg2 > 640 && arg2 < 1408) {
				var14 += 128;
			}

			if (arg2 > 1152 && arg2 < 1920) {
				var13 += 128;
			}

			if (arg2 > 1664 || arg2 < 384) {
				var12 -= 128;
			}

			if (arg2 > 128 && arg2 < 896) {
				var11 -= 128;
			}
		}

		var11 /= 128;
		var12 /= 128;
		var13 /= 128;
		var14 /= 128;
		return setSprite(arg9, var11, var12, var13 + 1 - var11, var14 - var12 + 1, arg3, arg0, arg8, arg6, arg7, arg2, true, arg4, (byte) 0);
	}

	@ObfuscatedName("r.a(IILeb;IIIIIILw;ZIII)Z")
	public boolean addDynamic2(int arg0, int arg1, Model arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, ModelSource arg9, int arg10, int arg11, int arg12) {
		if (arg2 == null && arg9 == null) {
			return true;
		}

		return setSprite(arg10, arg8, arg7, arg0 + 1 - arg8, arg11 - arg7 + 1, arg12, arg3, arg4, arg2, arg9, arg6, true, arg5, (byte) 0);
	}

	@ObfuscatedName("r.a(IIIIIIIILeb;Lw;IZIB)Z")
	public boolean setSprite(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, Model arg8, ModelSource arg9, int arg10, boolean arg11, int arg12, byte arg13) {
		if (arg8 == null && arg9 == null) {
			return false;
		}

		for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
			for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
				if (var15 < 0 || var16 < 0 || var15 >= maxTileX || var16 >= maxTileZ) {
					return false;
				}

				Square var17 = squares[arg0][var15][var16];
				if (var17 != null && var17.spriteCount >= 5) {
					return false;
				}
			}
		}

		Sprite var18 = new Sprite();
		var18.typecode = arg12;
		var18.typecode2 = arg13;
		var18.level = arg0;
		var18.x = arg5;
		var18.z = arg6;
		var18.y = arg7;
		var18.model = arg8;
		var18.modelSource = arg9;
		var18.yaw = arg10;
		var18.minTileX = arg1;
		var18.minTileZ = arg2;
		var18.maxTileX = arg1 + arg3 - 1;
		var18.maxTileZ = arg2 + arg4 - 1;

		for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
			for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
				int var21 = 0;
				if (var19 > arg1) {
					var21++;
				}

				if (var19 < arg1 + arg3 - 1) {
					var21 += 4;
				}

				if (var20 > arg2) {
					var21 += 8;
				}

				if (var20 < arg2 + arg4 - 1) {
					var21 += 2;
				}

				for (int var22 = arg0; var22 >= 0; var22--) {
					if (squares[var22][var19][var20] == null) {
						squares[var22][var19][var20] = new Square(var22, var19, var20);
					}
				}

				Square var23 = squares[arg0][var19][var20];
				var23.sprites[var23.spriteCount] = var18;
				var23.spriteSpan[var23.spriteCount] = var21;
				var23.spriteSpans |= var21;
				var23.spriteCount++;
			}
		}

		if (arg11) {
			dynamicSprites[dynamicCount++] = var18;
		}

		return true;
	}

	@ObfuscatedName("r.b(I)V")
	public void removeSprites() {
		for (int var1 = 0; var1 < dynamicCount; var1++) {
			Sprite var2 = dynamicSprites[var1];
			delSprite(var2);
			dynamicSprites[var1] = null;
		}

		dynamicCount = 0;
	}

	@ObfuscatedName("r.a(Lp;B)V")
	public void delSprite(Sprite arg0) {
		for (int var2 = arg0.minTileX; var2 <= arg0.maxTileX; var2++) {
			for (int var3 = arg0.minTileZ; var3 <= arg0.maxTileZ; var3++) {
				Square var4 = squares[arg0.level][var2][var3];
				if (var4 != null) {
					for (int var5 = 0; var5 < var4.spriteCount; var5++) {
						if (var4.sprites[var5] == arg0) {
							var4.spriteCount--;
							for (int var6 = var5; var6 < var4.spriteCount; var6++) {
								var4.sprites[var6] = var4.sprites[var6 + 1];
								var4.spriteSpan[var6] = var4.spriteSpan[var6 + 1];
							}

							var4.sprites[var4.spriteCount] = null;
							break;
						}
					}

					var4.spriteSpans = 0;
					for (int var7 = 0; var7 < var4.spriteCount; var7++) {
						var4.spriteSpans |= var4.spriteSpan[var7];
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(ILeb;III)V")
	public void setSpriteModel(int arg0, Model arg1, int arg2, int arg3) {
		if (arg1 != null) {
			Square var5 = squares[arg2][arg0][arg3];
			if (var5 != null) {
				for (int var6 = 0; var6 < var5.spriteCount; var6++) {
					Sprite var7 = var5.sprites[var6];
					if ((var7.typecode >> 29 & 0x3) == 2) {
						var7.model = arg1;
						return;
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(IIIIB)V")
	public void moveDecor(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = squares[arg0][arg2][arg1];
		if (var5 != null) {
			Decor var6 = var5.decor;
			if (var6 != null) {
				int var7 = arg2 * 128 + 64;
				int var8 = arg1 * 128 + 64;
				var6.x = (var6.x - var7) * arg3 / 16 + var7;
				var6.z = (var6.z - var8) * arg3 / 16 + var8;
			}
		}
	}

	@ObfuscatedName("r.a(IIILeb;I)V")
	public void setDecorModel(int arg0, int arg1, Model arg2, int arg3) {
		if (arg2 != null) {
			Square var5 = squares[arg3][arg1][arg0];
			if (var5 != null) {
				Decor var6 = var5.decor;
				if (var6 != null) {
					var6.model = arg2;
				}
			}
		}
	}

	@ObfuscatedName("r.a(Leb;IIII)V")
	public void setGroundDecorModel(Model arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			Square var5 = squares[arg3][arg2][arg1];
			if (var5 != null) {
				GroundDecor var6 = var5.groundDecor;
				if (var6 != null) {
					var6.model = arg0;
				}
			}
		}
	}

	@ObfuscatedName("r.b(ILeb;III)V")
	public void setWallModel(Model arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			Square var5 = squares[arg3][arg2][arg1];
			if (var5 != null) {
				Wall var6 = var5.wall;
				if (var6 != null) {
					var6.model1 = arg0;
				}
			}
		}
	}

	@ObfuscatedName("r.a(Leb;Leb;IZII)V")
	public void setWallModels(Model arg0, Model arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			Square var6 = squares[arg4][arg3][arg2];
			if (var6 != null) {
				Wall var7 = var6.wall;
				if (var7 != null) {
					var7.model1 = arg0;
					var7.model2 = arg1;
				}
			}
		}
	}

	@ObfuscatedName("r.b(IIII)V")
	public void delWall(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg1][arg0][arg2];
		if (var4 != null) {
			var4.wall = null;
		}
	}

	@ObfuscatedName("r.c(IIII)V")
	public void delDecor(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg2][arg1];
		if (var4 != null) {
			var4.decor = null;
		}
	}

	@ObfuscatedName("r.d(IIII)V")
	public void delLoc(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg2][arg0][arg1];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.spriteCount; var5++) {
				Sprite var6 = var4.sprites[var5];
				if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg0 && var6.minTileZ == arg1) {
					delSprite(var6);
					return;
				}
			}
		}
	}

	@ObfuscatedName("r.e(IIII)V")
	public void delGroundDecor(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundDecor = null;
		}
	}

	@ObfuscatedName("r.a(III)V")
	public void delObj(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 != null) {
			var4.groundObject = null;
		}
	}

	@ObfuscatedName("r.b(III)I")
	public int wallType(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 != null && var4.wall != null) {
			return var4.wall.typecode;
		}

		return 0;
	}

	@ObfuscatedName("r.f(IIII)I")
	public int decorType(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg2][arg1];
		if (var4 != null && var4.decor != null) {
			return var4.decor.typecode;
		}

		return 0;
	}

	@ObfuscatedName("r.c(III)I")
	public int sceneType(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 == null) {
			return 0;
		}

		for (int var5 = 0; var5 < var4.spriteCount; var5++) {
			Sprite var6 = var4.sprites[var5];
			if ((var6.typecode >> 29 & 0x3) == 2 && var6.minTileX == arg1 && var6.minTileZ == arg2) {
				return var6.typecode;
			}
		}

		return 0;
	}

	@ObfuscatedName("r.d(III)I")
	public int gdType(int arg0, int arg1, int arg2) {
		Square var4 = squares[arg0][arg1][arg2];
		if (var4 != null && var4.groundDecor != null) {
			return var4.groundDecor.typecode;
		}

		return 0;
	}

	@ObfuscatedName("r.g(IIII)I")
	public int typeCode2(int arg0, int arg1, int arg2, int arg3) {
		Square var5 = squares[arg0][arg1][arg2];
		if (var5 == null) {
			return -1;
		} else if (var5.wall != null && var5.wall.typecode == arg3) {
			return var5.wall.typecode2 & 0xFF;
		} else if (var5.decor != null && var5.decor.typecode == arg3) {
			return var5.decor.typecode2 & 0xFF;
		} else if (var5.groundDecor != null && var5.groundDecor.typecode == arg3) {
			return var5.groundDecor.typecode2 & 0xFF;
		} else {
			for (int var6 = 0; var6 < var5.spriteCount; var6++) {
				if (var5.sprites[var6].typecode == arg3) {
					return var5.sprites[var6].typecode2 & 0xFF;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("r.a(IIIIIZ)V")
	public void shareLight(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = (int) Math.sqrt(arg4 * arg4 + arg0 * arg0 + arg2 * arg2);
		int var7 = arg3 * var6 >> 8;
		for (int var8 = 0; var8 < maxTileLevel; var8++) {
			for (int var9 = 0; var9 < maxTileX; var9++) {
				for (int var10 = 0; var10 < maxTileZ; var10++) {
					Square var11 = squares[var8][var9][var10];
					if (var11 != null) {
						Wall var12 = var11.wall;
						if (var12 != null && var12.model1 != null && var12.model1.pointNormal != null) {
							shareLightLoc(var9, 1, 1, var8, var12.model1, var10);

							if (var12.model2 != null && var12.model2.pointNormal != null) {
								shareLightLoc(var9, 1, 1, var8, var12.model2, var10);
								modelShareLight(var12.model1, var12.model2, 0, 0, 0, false);
								var12.model2.light(arg1, var7, arg2, arg0, arg4);
							}

							var12.model1.light(arg1, var7, arg2, arg0, arg4);
						}

						for (int var13 = 0; var13 < var11.spriteCount; var13++) {
							Sprite var14 = var11.sprites[var13];
							if (var14 != null && var14.model != null && var14.model.pointNormal != null) {
								shareLightLoc(var9, var14.maxTileX + 1 - var14.minTileX, var14.maxTileZ - var14.minTileZ + 1, var8, var14.model, var10);
								var14.model.light(arg1, var7, arg2, arg0, arg4);
							}
						}

						GroundDecor var15 = var11.groundDecor;
						if (var15 != null && var15.model.pointNormal != null) {
							shareLightGd(var8, var10, var15.model, var9);
							var15.model.light(arg1, var7, arg2, arg0, arg4);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(BIILeb;I)V")
	public void shareLightGd(int arg0, int arg1, Model arg2, int arg3) {
		if (arg3 < maxTileX) {
			Square var5 = squares[arg0][arg3 + 1][arg1];
			if (var5 != null && var5.groundDecor != null && var5.groundDecor.model.pointNormal != null) {
				modelShareLight(arg2, var5.groundDecor.model, 128, 0, 0, true);
			}
		}

		if (arg1 < maxTileX) {
			Square var6 = squares[arg0][arg3][arg1 + 1];
			if (var6 != null && var6.groundDecor != null && var6.groundDecor.model.pointNormal != null) {
				modelShareLight(arg2, var6.groundDecor.model, 0, 0, 128, true);
			}
		}

		if (arg3 < maxTileX && arg1 < maxTileZ) {
			Square var7 = squares[arg0][arg3 + 1][arg1 + 1];
			if (var7 != null && var7.groundDecor != null && var7.groundDecor.model.pointNormal != null) {
				modelShareLight(arg2, var7.groundDecor.model, 128, 0, 128, true);
			}
		}

		if (arg3 < maxTileX && arg1 > 0) {
			Square var8 = squares[arg0][arg3 + 1][arg1 - 1];
			if (var8 != null && var8.groundDecor != null && var8.groundDecor.model.pointNormal != null) {
				modelShareLight(arg2, var8.groundDecor.model, 128, 0, -128, true);
				return;
			}
		}
	}

	@ObfuscatedName("r.a(IIIIILeb;I)V")
	public void shareLightLoc(int arg0, int arg1, int arg2, int arg3, Model arg4, int arg5) {
		boolean var7 = true;
		int var8 = arg0;
		int var9 = arg0 + arg1;
		int var10 = arg5 - 1;
		int var11 = arg2 + arg5;
		for (int var12 = arg3; var12 <= arg3 + 1; var12++) {
			if (maxTileLevel != var12) {
				for (int var13 = var8; var13 <= var9; var13++) {
					if (var13 >= 0 && var13 < maxTileX) {
						for (int var14 = var10; var14 <= var11; var14++) {
							if (var14 >= 0 && var14 < maxTileZ && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg5 && arg0 != var13)) {
								Square var15 = squares[var12][var13][var14];
								if (var15 != null) {
									int var16 = (groundh[var12][var13 + 1][var14] + groundh[var12][var13][var14] + groundh[var12][var13][var14 + 1] + groundh[var12][var13 + 1][var14 + 1]) / 4 - (groundh[arg3][arg0 + 1][arg5] + groundh[arg3][arg0][arg5] + groundh[arg3][arg0][arg5 + 1] + groundh[arg3][arg0 + 1][arg5 + 1]) / 4;
									Wall var17 = var15.wall;
									if (var17 != null && var17.model1 != null && var17.model1.pointNormal != null) {
										modelShareLight(arg4, var17.model1, (var13 - arg0) * 128 + (1 - arg1) * 64, var16, (1 - arg2) * 64 + (var14 - arg5) * 128, var7);
									}

									if (var17 != null && var17.model2 != null && var17.model2.pointNormal != null) {
										modelShareLight(arg4, var17.model2, (var13 - arg0) * 128 + (1 - arg1) * 64, var16, (1 - arg2) * 64 + (var14 - arg5) * 128, var7);
									}

									for (int var18 = 0; var18 < var15.spriteCount; var18++) {
										Sprite var19 = var15.sprites[var18];
										if (var19 != null && var19.model != null && var19.model.pointNormal != null) {
											int var20 = var19.maxTileX + 1 - var19.minTileX;
											int var21 = var19.maxTileZ + 1 - var19.minTileZ;
											modelShareLight(arg4, var19.model, (var19.minTileX - arg0) * 128 + (var20 - arg1) * 64, var16, (var19.minTileZ - arg5) * 128 + (var21 - arg2) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				var8--;
				var7 = false;
			}
		}
	}

	@ObfuscatedName("r.a(Leb;Leb;IIIZ)V")
	public void modelShareLight(Model arg0, Model arg1, int arg2, int arg3, int arg4, boolean arg5) {
		shareTic++;
		int var7 = 0;
		int[] var8 = arg1.pointX;
		int var9 = arg1.numPoints;
		for (int var10 = 0; var10 < arg0.numPoints; var10++) {
			PointNormal var11 = arg0.pointNormal[var10];
			PointNormal var12 = arg0.sharedPointNormal[var10];
			if (var12.w != 0) {
				int var13 = arg0.pointY[var10] - arg3;
				if (var13 <= arg1.maxY) {
					int var14 = arg0.pointX[var10] - arg2;
					if (var14 >= arg1.minX && var14 <= arg1.maxX) {
						int var15 = arg0.pointZ[var10] - arg4;
						if (var15 >= arg1.minZ && var15 <= arg1.maxZ) {
							for (int var16 = 0; var16 < var9; var16++) {
								PointNormal var17 = arg1.pointNormal[var16];
								PointNormal var18 = arg1.sharedPointNormal[var16];
								if (var8[var16] == var14 && arg1.pointZ[var16] == var15 && arg1.pointY[var16] == var13 && var18.w != 0) {
									var11.x += var18.x;
									var11.y += var18.y;
									var11.z += var18.z;
									var11.w += var18.w;
									var17.x += var12.x;
									var17.y += var12.y;
									var17.z += var12.z;
									var17.w += var12.w;
									var7++;
									shareMap[var10] = shareTic;
									shareMap2[var16] = shareTic;
								}
							}
						}
					}
				}
			}
		}

		if (var7 >= 3 && arg5) {
			for (int var19 = 0; var19 < arg0.numFaces; var19++) {
				if (shareMap[arg0.faceVertexA[var19]] == shareTic && shareMap[arg0.faceVertexB[var19]] == shareTic && shareMap[arg0.faceVertexC[var19]] == shareTic) {
					arg0.faceRenderType[var19] = -1;
				}
			}

			for (int var20 = 0; var20 < arg1.numFaces; var20++) {
				if (shareMap2[arg1.faceVertexA[var20]] == shareTic && shareMap2[arg1.faceVertexB[var20]] == shareTic && shareMap2[arg1.faceVertexC[var20]] == shareTic) {
					arg1.faceRenderType[var20] = -1;
				}
			}
		}
	}

	@ObfuscatedName("r.a([IIIIII)V")
	public void render2DGround(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Square var7 = squares[arg3][arg4][arg5];
		if (var7 != null) {
			QuickGround var8 = var7.quickGround;
			if (var8 == null) {
				Ground var11 = var7.ground;
				if (var11 != null) {
					int var12 = var11.overlayShape;
					int var13 = var11.overlayRotation;
					int var14 = var11.minimapUnderlay;
					int var15 = var11.minimapOverlay;
					int[] var16 = MINIMAP_SHAPE[var12];
					int[] var17 = MINIMAP_ROTATE[var13];
					int var18 = 0;
					if (var14 == 0) {
						for (int var20 = 0; var20 < 4; var20++) {
							if (var16[var17[var18++]] != 0) {
								arg0[arg1] = var15;
							}

							if (var16[var17[var18++]] != 0) {
								arg0[arg1 + 1] = var15;
							}

							if (var16[var17[var18++]] != 0) {
								arg0[arg1 + 2] = var15;
							}

							if (var16[var17[var18++]] != 0) {
								arg0[arg1 + 3] = var15;
							}

							arg1 += arg2;
						}
					} else {
						for (int var19 = 0; var19 < 4; var19++) {
							arg0[arg1] = var16[var17[var18++]] == 0 ? var14 : var15;
							arg0[arg1 + 1] = var16[var17[var18++]] == 0 ? var14 : var15;
							arg0[arg1 + 2] = var16[var17[var18++]] == 0 ? var14 : var15;
							arg0[arg1 + 3] = var16[var17[var18++]] == 0 ? var14 : var15;
							arg1 += arg2;
						}
					}
				}
			} else {
				int var9 = var8.minimapRgb;
				if (var9 != 0) {
					for (int var10 = 0; var10 < 4; var10++) {
						arg0[arg1] = var9;
						arg0[arg1 + 1] = var9;
						arg0[arg1 + 2] = var9;
						arg0[arg1 + 3] = var9;
						arg1 += arg2;
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a([IIIBII)V")
	public static void resetVisCalc(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
		xClip = 0;
		yClip = 0;
		xClip2 = arg2;
		yClip2 = arg3;
		xOrig = arg2 / 2;
		yOrig = arg3 / 2;
		boolean[][][][] var5 = new boolean[9][32][53][53];
		for (int var6 = 128; var6 <= 384; var6 += 32) {
			for (int var7 = 0; var7 < 2048; var7 += 64) {
				cameraSinX = Model.sinTable[var6];
				cameraCosX = Model.cosTable[var6];
				cameraSinY = Model.sinTable[var7];
				cameraCosY = Model.cosTable[var7];
				int var8 = (var6 - 128) / 32;
				int var9 = var7 / 64;
				for (int var10 = -26; var10 <= 26; var10++) {
					for (int var11 = -26; var11 <= 26; var11++) {
						int var12 = var10 * 128;
						int var13 = var11 * 128;
						boolean var14 = false;
						for (int var15 = -arg4; var15 <= arg1; var15 += 128) {
							if (testPoint(var12, var13, arg0[var8] + var15)) {
								var14 = true;
								break;
							}
						}

						var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
					}
				}
			}
		}

		for (int var16 = 0; var16 < 8; var16++) {
			for (int var17 = 0; var17 < 32; var17++) {
				for (int var18 = -25; var18 < 25; var18++) {
					for (int var19 = -25; var19 < 25; var19++) {
						boolean var20 = false;
						label76: for (int var21 = -1; var21 <= 1; var21++) {
							for (int var22 = -1; var22 <= 1; var22++) {
								if (var5[var16][var17][var18 + var21 + 25 + 1][var19 + var22 + 25 + 1]) {
									var20 = true;
									break label76;
								}

								if (var5[var16][(var17 + 1) % 31][var18 + var21 + 25 + 1][var19 + var22 + 25 + 1]) {
									var20 = true;
									break label76;
								}

								if (var5[var16 + 1][var17][var18 + var21 + 25 + 1][var19 + var22 + 25 + 1]) {
									var20 = true;
									break label76;
								}

								if (var5[var16 + 1][(var17 + 1) % 31][var18 + var21 + 25 + 1][var19 + var22 + 25 + 1]) {
									var20 = true;
									break label76;
								}
							}
						}

						visBacking[var16][var17][var18 + 25][var19 + 25] = var20;
					}
				}
			}
		}
	}

	@ObfuscatedName("r.h(IIII)Z")
	public static boolean testPoint(int arg0, int arg1, int arg2) {
		int var3 = cameraCosY * arg0 + cameraSinY * arg1 >> 16;
		int var4 = cameraCosY * arg1 - cameraSinY * arg0 >> 16;
		int var5 = cameraCosX * var4 + cameraSinX * arg2 >> 16;
		int var6 = cameraCosX * arg2 - cameraSinX * var4 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = (var3 << 9) / var5 + xOrig;
			int var8 = (var6 << 9) / var5 + yOrig;
			if (var7 >= xClip && var7 <= xClip2 && var8 >= yClip && var8 <= yClip2) {
				return true;
			}

			return false;
		}

		return false;
	}

	@ObfuscatedName("r.e(III)V")
	public void updateMousePicking(int arg0, int arg1) {
		click = true;
		clickX = arg1;
		clickY = arg0;
		groundX = -1;
		groundZ = -1;
	}

	@ObfuscatedName("r.a(IIIIIII)V")
	public void renderAll(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < 0) {
			arg1 = 0;
		} else if (arg1 >= maxTileX * 128) {
			arg1 = maxTileX * 128 - 1;
		}

		if (arg5 < 0) {
			arg5 = 0;
		} else if (arg5 >= maxTileZ * 128) {
			arg5 = maxTileZ * 128 - 1;
		}

		cycleNo++;
		cameraSinX = Model.sinTable[arg3];
		cameraCosX = Model.cosTable[arg3];
		cameraSinY = Model.sinTable[arg0];
		cameraCosY = Model.cosTable[arg0];
		visBackingDirty = visBacking[(arg3 - 128) / 32][arg0 / 64];
		cx = arg1;
		cy = arg4;
		cz = arg5;
		gx = arg1 / 128;
		gz = arg5 / 128;
		maxLevel = arg2;
		minX = gx - 25;
		if (minX < 0) {
			minX = 0;
		}

		minZ = gz - 25;
		if (minZ < 0) {
			minZ = 0;
		}

		maxX = gx + 25;
		if (maxX > maxTileX) {
			maxX = maxTileX;
		}

		maxZ = gz + 25;
		if (maxZ > maxTileZ) {
			maxZ = maxTileZ;
		}

		calcOcclude();
		fillLeft = 0;
		for (int var7 = minLevel; var7 < maxTileLevel; var7++) {
			Square[][] var8 = squares[var7];
			for (int var9 = minX; var9 < maxX; var9++) {
				for (int var10 = minZ; var10 < maxZ; var10++) {
					Square var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.drawLevel <= arg2 && (visBackingDirty[var9 + 25 - gx][var10 + 25 - gz] || groundh[var7][var9][var10] - arg4 >= 2000)) {
							var11.drawFront = true;
							var11.drawBack = true;

							if (var11.spriteCount > 0) {
								var11.drawSprites = true;
							} else {
								var11.drawSprites = false;
							}

							fillLeft++;
						} else {
							var11.drawFront = false;
							var11.drawBack = false;
							var11.cornerSides = 0;
						}
					}
				}
			}
		}

		for (int var12 = minLevel; var12 < maxTileLevel; var12++) {
			Square[][] var13 = squares[var12];
			for (int var14 = -25; var14 <= 0; var14++) {
				int var15 = gx + var14;
				int var16 = gx - var14;
				if (var15 >= minX || var16 < maxX) {
					for (int var17 = -25; var17 <= 0; var17++) {
						int var18 = gz + var17;
						int var19 = gz - var17;
						if (var15 >= minX) {
							if (var18 >= minZ) {
								Square var20 = var13[var15][var18];
								if (var20 != null && var20.drawFront) {
									fill(var20, true);
								}
							}

							if (var19 < maxZ) {
								Square var21 = var13[var15][var19];
								if (var21 != null && var21.drawFront) {
									fill(var21, true);
								}
							}
						}

						if (var16 < maxX) {
							if (var18 >= minZ) {
								Square var22 = var13[var16][var18];
								if (var22 != null && var22.drawFront) {
									fill(var22, true);
								}
							}

							if (var19 < maxZ) {
								Square var23 = var13[var16][var19];
								if (var23 != null && var23.drawFront) {
									fill(var23, true);
								}
							}
						}

						if (fillLeft == 0) {
							click = false;
							return;
						}
					}
				}
			}
		}

		for (int var24 = minLevel; var24 < maxTileLevel; var24++) {
			Square[][] var25 = squares[var24];
			for (int var26 = -25; var26 <= 0; var26++) {
				int var27 = gx + var26;
				int var28 = gx - var26;
				if (var27 >= minX || var28 < maxX) {
					for (int var29 = -25; var29 <= 0; var29++) {
						int var30 = gz + var29;
						int var31 = gz - var29;
						if (var27 >= minX) {
							if (var30 >= minZ) {
								Square var32 = var25[var27][var30];
								if (var32 != null && var32.drawFront) {
									fill(var32, false);
								}
							}

							if (var31 < maxZ) {
								Square var33 = var25[var27][var31];
								if (var33 != null && var33.drawFront) {
									fill(var33, false);
								}
							}
						}

						if (var28 < maxX) {
							if (var30 >= minZ) {
								Square var34 = var25[var28][var30];
								if (var34 != null && var34.drawFront) {
									fill(var34, false);
								}
							}

							if (var31 < maxZ) {
								Square var35 = var25[var28][var31];
								if (var35 != null && var35.drawFront) {
									fill(var35, false);
								}
							}
						}

						if (fillLeft == 0) {
							click = false;
							return;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(Lcb;Z)V")
	public void fill(Square arg0, boolean arg1) {
		fillQueue.push(arg0);

		while (true) {
			Square var3 = (Square) fillQueue.popFront();
			if (var3 == null) {
				return;
			}

			if (var3.drawBack) {
				int var4 = var3.x;
				int var5 = var3.z;
				int var6 = var3.level;
				int var7 = var3.originalLevel;
				Square[][] var8 = squares[var6];
				if (var3.drawFront) {
					if (arg1) {
						if (var6 > 0) {
							Square var9 = squares[var6 - 1][var4][var5];
							if (var9 != null && var9.drawBack) {
								continue;
							}
						}

						if (var4 <= gx && var4 > minX) {
							Square var10 = var8[var4 - 1][var5];
							if (var10 != null && var10.drawBack && (var10.drawFront || (var3.spriteSpans & 0x1) == 0)) {
								continue;
							}
						}

						if (var4 >= gx && var4 < maxX - 1) {
							Square var11 = var8[var4 + 1][var5];
							if (var11 != null && var11.drawBack && (var11.drawFront || (var3.spriteSpans & 0x4) == 0)) {
								continue;
							}
						}

						if (var5 <= gz && var5 > minZ) {
							Square var12 = var8[var4][var5 - 1];
							if (var12 != null && var12.drawBack && (var12.drawFront || (var3.spriteSpans & 0x8) == 0)) {
								continue;
							}
						}

						if (var5 >= gz && var5 < maxZ - 1) {
							Square var13 = var8[var4][var5 + 1];
							if (var13 != null && var13.drawBack && (var13.drawFront || (var3.spriteSpans & 0x2) == 0)) {
								continue;
							}
						}
					} else {
						arg1 = true;
					}

					var3.drawFront = false;

					if (var3.linkedSquare != null) {
						Square var14 = var3.linkedSquare;
						if (var14.quickGround == null) {
							if (var14.ground != null && !groundOccluded(0, var4, var5)) {
								renderGround(cameraSinY, var5, var14.ground, var4, cameraCosX, cameraSinX, cameraCosY);
							}
						} else if (!groundOccluded(0, var4, var5)) {
							renderQuickGround(var14.quickGround, 0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
						}

						Wall var15 = var14.wall;
						if (var15 != null) {
							var15.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var15.x - cx, var15.y - cy, var15.z - cz, var15.typecode);
						}

						for (int var16 = 0; var16 < var14.spriteCount; var16++) {
							Sprite var17 = var14.sprites[var16];
							if (var17 != null) {
								Model var18 = var17.model;
								if (var18 == null) {
									var18 = var17.modelSource.getTempModel();
								}

								var18.worldRender(var17.yaw, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var17.x - cx, var17.y - cy, var17.z - cz, var17.typecode);
							}
						}
					}

					boolean var19 = false;
					if (var3.quickGround == null) {
						if (var3.ground != null && !groundOccluded(var7, var4, var5)) {
							var19 = true;
							renderGround(cameraSinY, var5, var3.ground, var4, cameraCosX, cameraSinX, cameraCosY);
						}
					} else if (!groundOccluded(var7, var4, var5)) {
						var19 = true;
						renderQuickGround(var3.quickGround, var7, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var4, var5);
					}

					int var20 = 0;
					int var21 = 0;
					Wall var22 = var3.wall;
					Decor var23 = var3.decor;
					if (var22 != null || var23 != null) {
						if (gx == var4) {
							var20++;
						} else if (gx < var4) {
							var20 += 2;
						}

						if (gz == var5) {
							var20 += 3;
						} else if (gz > var5) {
							var20 += 6;
						}

						var21 = PRETAB[var20];
						var3.backWallTypes = POSTTAB[var20];
					}

					if (var22 != null) {
						if ((var22.angle1 & MIDTAB[var20]) == 0) {
							var3.cornerSides = 0;
						} else if (var22.angle1 == 16) {
							var3.cornerSides = 3;
							var3.sidesBeforeCorner = MIDDEP_16[var20];
							var3.sidesAfterCorner = 3 - var3.sidesBeforeCorner;
						} else if (var22.angle1 == 32) {
							var3.cornerSides = 6;
							var3.sidesBeforeCorner = MIDDEP_32[var20];
							var3.sidesAfterCorner = 6 - var3.sidesBeforeCorner;
						} else if (var22.angle1 == 64) {
							var3.cornerSides = 12;
							var3.sidesBeforeCorner = MIDDEP_64[var20];
							var3.sidesAfterCorner = 12 - var3.sidesBeforeCorner;
						} else {
							var3.cornerSides = 9;
							var3.sidesBeforeCorner = MIDDEP_128[var20];
							var3.sidesAfterCorner = 9 - var3.sidesBeforeCorner;
						}

						if ((var22.angle1 & var21) != 0 && !wallOccluded(var7, var4, var5, var22.angle1)) {
							var22.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var22.x - cx, var22.y - cy, var22.z - cz, var22.typecode);
						}

						if ((var22.angle2 & var21) != 0 && !wallOccluded(var7, var4, var5, var22.angle2)) {
							var22.model2.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var22.x - cx, var22.y - cy, var22.z - cz, var22.typecode);
						}
					}

					if (var23 != null && !spriteOccluded(var7, var4, var5, var23.model.minY)) {
						if ((var23.wshape & var21) != 0) {
							var23.model.worldRender(var23.angle, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var23.x - cx, var23.y - cy, var23.z - cz, var23.typecode);
						} else if ((var23.wshape & 0x300) != 0) {
							int var24 = var23.x - cx;
							int var25 = var23.y - cy;
							int var26 = var23.z - cz;
							int var27 = var23.angle;
							int var28;
							if (var27 == 1 || var27 == 2) {
								var28 = -var24;
							} else {
								var28 = var24;
							}

							int var29;
							if (var27 == 2 || var27 == 3) {
								var29 = -var26;
							} else {
								var29 = var26;
							}

							if ((var23.wshape & 0x100) != 0 && var29 < var28) {
								int var30 = DECORXOF[var27] + var24;
								int var31 = DECORZOF[var27] + var26;
								var23.model.worldRender(var27 * 512 + 256, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var30, var25, var31, var23.typecode);
							}

							if ((var23.wshape & 0x200) != 0 && var29 > var28) {
								int var32 = DECORXOF2[var27] + var24;
								int var33 = DECORZOF2[var27] + var26;
								var23.model.worldRender(var27 * 512 + 1280 & 0x7FF, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var32, var25, var33, var23.typecode);
							}
						}
					}

					if (var19) {
						GroundDecor var34 = var3.groundDecor;
						if (var34 != null) {
							var34.model.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var34.x - cx, var34.y - cy, var34.z - cz, var34.typecode);
						}

						GroundObject var35 = var3.groundObject;
						if (var35 != null && var35.height == 0) {
							if (var35.bottomObj != null) {
								var35.bottomObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var35.x - cx, var35.y - cy, var35.z - cz, var35.typecode);
							}

							if (var35.middleObj != null) {
								var35.middleObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var35.x - cx, var35.y - cy, var35.z - cz, var35.typecode);
							}

							if (var35.topObj != null) {
								var35.topObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var35.x - cx, var35.y - cy, var35.z - cz, var35.typecode);
							}
						}
					}

					int var36 = var3.spriteSpans;
					if (var36 != 0) {
						if (var4 < gx && (var36 & 0x4) != 0) {
							Square var37 = var8[var4 + 1][var5];
							if (var37 != null && var37.drawBack) {
								fillQueue.push(var37);
							}
						}

						if (var5 < gz && (var36 & 0x2) != 0) {
							Square var38 = var8[var4][var5 + 1];
							if (var38 != null && var38.drawBack) {
								fillQueue.push(var38);
							}
						}

						if (var4 > gx && (var36 & 0x1) != 0) {
							Square var39 = var8[var4 - 1][var5];
							if (var39 != null && var39.drawBack) {
								fillQueue.push(var39);
							}
						}

						if (var5 > gz && (var36 & 0x8) != 0) {
							Square var40 = var8[var4][var5 - 1];
							if (var40 != null && var40.drawBack) {
								fillQueue.push(var40);
							}
						}
					}
				}

				if (var3.cornerSides != 0) {
					boolean var41 = true;
					for (int var42 = 0; var42 < var3.spriteCount; var42++) {
						if (cycleNo != var3.sprites[var42].cycle && (var3.spriteSpan[var42] & var3.cornerSides) == var3.sidesBeforeCorner) {
							var41 = false;
							break;
						}
					}

					if (var41) {
						Wall var43 = var3.wall;
						if (!wallOccluded(var7, var4, var5, var43.angle1)) {
							var43.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var43.x - cx, var43.y - cy, var43.z - cz, var43.typecode);
						}

						var3.cornerSides = 0;
					}
				}

				if (var3.drawSprites) {
					int var44 = var3.spriteCount;
					var3.drawSprites = false;
					int var45 = 0;
					label525: for (int var46 = 0; var46 < var44; var46++) {
						Sprite var47 = var3.sprites[var46];
						if (cycleNo != var47.cycle) {
							for (int var48 = var47.minTileX; var48 <= var47.maxTileX; var48++) {
								for (int var49 = var47.minTileZ; var49 <= var47.maxTileZ; var49++) {
									Square var50 = var8[var48][var49];
									if (var50.drawFront) {
										var3.drawSprites = true;
										continue label525;
									}

									if (var50.cornerSides != 0) {
										int var51 = 0;
										if (var48 > var47.minTileX) {
											var51++;
										}

										if (var48 < var47.maxTileX) {
											var51 += 4;
										}

										if (var49 > var47.minTileZ) {
											var51 += 8;
										}

										if (var49 < var47.maxTileZ) {
											var51 += 2;
										}

										if ((var51 & var50.cornerSides) == var3.sidesAfterCorner) {
											var3.drawSprites = true;
											continue label525;
										}
									}
								}
							}

							spriteBuffer[var45++] = var47;
							int var52 = gx - var47.minTileX;
							int var53 = var47.maxTileX - gx;
							if (var53 > var52) {
								var52 = var53;
							}

							int var54 = gz - var47.minTileZ;
							int var55 = var47.maxTileZ - gz;
							if (var55 > var54) {
								var47.distance = var52 + var55;
							} else {
								var47.distance = var52 + var54;
							}
						}
					}

					while (var45 > 0) {
						int var56 = -50;
						int var57 = -1;
						for (int var58 = 0; var58 < var45; var58++) {
							Sprite var59 = spriteBuffer[var58];
							if (var59.distance > var56 && cycleNo != var59.cycle) {
								var56 = var59.distance;
								var57 = var58;
							}
						}

						if (var57 == -1) {
							break;
						}

						Sprite var60 = spriteBuffer[var57];
						var60.cycle = cycleNo;
						Model var61 = var60.model;
						if (var61 == null) {
							var61 = var60.modelSource.getTempModel();
						}

						if (!spriteOccluded2(var7, var60.minTileX, var60.maxTileX, var60.minTileZ, var60.maxTileZ, var61.minY)) {
							var61.worldRender(var60.yaw, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var60.x - cx, var60.y - cy, var60.z - cz, var60.typecode);
						}

						for (int var62 = var60.minTileX; var62 <= var60.maxTileX; var62++) {
							for (int var63 = var60.minTileZ; var63 <= var60.maxTileZ; var63++) {
								Square var64 = var8[var62][var63];
								if (var64.cornerSides != 0) {
									fillQueue.push(var64);
								} else if ((var4 != var62 || var5 != var63) && var64.drawBack) {
									fillQueue.push(var64);
								}
							}
						}
					}

					if (var3.drawSprites) {
						continue;
					}
				}

				if (var3.drawBack && var3.cornerSides == 0) {
					if (var4 <= gx && var4 > minX) {
						Square var65 = var8[var4 - 1][var5];
						if (var65 != null && var65.drawBack) {
							continue;
						}
					}

					if (var4 >= gx && var4 < maxX - 1) {
						Square var66 = var8[var4 + 1][var5];
						if (var66 != null && var66.drawBack) {
							continue;
						}
					}

					if (var5 <= gz && var5 > minZ) {
						Square var67 = var8[var4][var5 - 1];
						if (var67 != null && var67.drawBack) {
							continue;
						}
					}

					if (var5 >= gz && var5 < maxZ - 1) {
						Square var68 = var8[var4][var5 + 1];
						if (var68 != null && var68.drawBack) {
							continue;
						}
					}

					var3.drawBack = false;
					fillLeft--;
					GroundObject var69 = var3.groundObject;
					if (var69 != null && var69.height != 0) {
						if (var69.bottomObj != null) {
							var69.bottomObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var69.x - cx, var69.y - cy - var69.height, var69.z - cz, var69.typecode);
						}

						if (var69.middleObj != null) {
							var69.middleObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var69.x - cx, var69.y - cy - var69.height, var69.z - cz, var69.typecode);
						}

						if (var69.topObj != null) {
							var69.topObj.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var69.x - cx, var69.y - cy - var69.height, var69.z - cz, var69.typecode);
						}
					}

					if (var3.backWallTypes != 0) {
						Decor var70 = var3.decor;
						if (var70 != null && !spriteOccluded(var7, var4, var5, var70.model.minY)) {
							if ((var70.wshape & var3.backWallTypes) != 0) {
								var70.model.worldRender(var70.angle, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var70.x - cx, var70.y - cy, var70.z - cz, var70.typecode);
							} else if ((var70.wshape & 0x300) != 0) {
								int var71 = var70.x - cx;
								int var72 = var70.y - cy;
								int var73 = var70.z - cz;
								int var74 = var70.angle;
								int var75;
								if (var74 == 1 || var74 == 2) {
									var75 = -var71;
								} else {
									var75 = var71;
								}

								int var76;
								if (var74 == 2 || var74 == 3) {
									var76 = -var73;
								} else {
									var76 = var73;
								}

								if ((var70.wshape & 0x100) != 0 && var76 >= var75) {
									int var77 = DECORXOF[var74] + var71;
									int var78 = DECORZOF[var74] + var73;
									var70.model.worldRender(var74 * 512 + 256, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var77, var72, var78, var70.typecode);
								}

								if ((var70.wshape & 0x200) != 0 && var76 <= var75) {
									int var79 = DECORXOF2[var74] + var71;
									int var80 = DECORZOF2[var74] + var73;
									var70.model.worldRender(var74 * 512 + 1280 & 0x7FF, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var79, var72, var80, var70.typecode);
								}
							}
						}

						Wall var81 = var3.wall;
						if (var81 != null) {
							if ((var81.angle2 & var3.backWallTypes) != 0 && !wallOccluded(var7, var4, var5, var81.angle2)) {
								var81.model2.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var81.x - cx, var81.y - cy, var81.z - cz, var81.typecode);
							}

							if ((var81.angle1 & var3.backWallTypes) != 0 && !wallOccluded(var7, var4, var5, var81.angle1)) {
								var81.model1.worldRender(0, cameraSinX, cameraCosX, cameraSinY, cameraCosY, var81.x - cx, var81.y - cy, var81.z - cz, var81.typecode);
							}
						}
					}

					if (var6 < maxTileLevel - 1) {
						Square var82 = squares[var6 + 1][var4][var5];
						if (var82 != null && var82.drawBack) {
							fillQueue.push(var82);
						}
					}

					if (var4 < gx) {
						Square var83 = var8[var4 + 1][var5];
						if (var83 != null && var83.drawBack) {
							fillQueue.push(var83);
						}
					}

					if (var5 < gz) {
						Square var84 = var8[var4][var5 + 1];
						if (var84 != null && var84.drawBack) {
							fillQueue.push(var84);
						}
					}

					if (var4 > gx) {
						Square var85 = var8[var4 - 1][var5];
						if (var85 != null && var85.drawBack) {
							fillQueue.push(var85);
						}
					}

					if (var5 > gz) {
						Square var86 = var8[var4][var5 - 1];
						if (var86 != null && var86.drawBack) {
							fillQueue.push(var86);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(Lo;IIIIIII)V")
	public void renderQuickGround(QuickGround arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9;
		int var10 = var9 = (arg6 << 7) - cx;
		int var11;
		int var12 = var11 = (arg7 << 7) - cz;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = groundh[arg1][arg6][arg7] - cy;
		int var18 = groundh[arg1][arg6 + 1][arg7] - cy;
		int var19 = groundh[arg1][arg6 + 1][arg7 + 1] - cy;
		int var20 = groundh[arg1][arg6][arg7 + 1] - cy;
		int var21 = arg4 * var12 + arg5 * var10 >> 16;
		var12 = arg5 * var12 - arg4 * var10 >> 16;
		int var23 = arg3 * var17 - arg2 * var12 >> 16;
		var12 = arg2 * var17 + arg3 * var12 >> 16;
		if (var12 >= 50) {
			int var25 = arg4 * var11 + arg5 * var14 >> 16;
			var11 = arg5 * var11 - arg4 * var14 >> 16;
			int var27 = arg3 * var18 - arg2 * var11 >> 16;
			var11 = arg2 * var18 + arg3 * var11 >> 16;
			if (var11 >= 50) {
				int var29 = arg4 * var16 + arg5 * var13 >> 16;
				var16 = arg5 * var16 - arg4 * var13 >> 16;
				int var31 = arg3 * var19 - arg2 * var16 >> 16;
				var16 = arg2 * var19 + arg3 * var16 >> 16;
				if (var16 >= 50) {
					int var33 = arg4 * var15 + arg5 * var9 >> 16;
					var15 = arg5 * var15 - arg4 * var9 >> 16;
					int var35 = arg3 * var20 - arg2 * var15 >> 16;
					var15 = arg2 * var20 + arg3 * var15 >> 16;
					if (var15 >= 50) {
						int var37 = (var21 << 9) / var12 + Pix3D.originX;
						int var38 = (var23 << 9) / var12 + Pix3D.originY;
						int var39 = (var25 << 9) / var11 + Pix3D.originX;
						int var40 = (var27 << 9) / var11 + Pix3D.originY;
						int var41 = (var29 << 9) / var16 + Pix3D.originX;
						int var42 = (var31 << 9) / var16 + Pix3D.originY;
						int var43 = (var33 << 9) / var15 + Pix3D.originX;
						int var44 = (var35 << 9) / var15 + Pix3D.originY;
						Pix3D.trans = 0;

						if ((var40 - var44) * (var41 - var43) - (var39 - var43) * (var42 - var44) > 0) {
							Pix3D.hclip = false;
							if (var41 < 0 || var43 < 0 || var39 < 0 || var41 > Pix2D.sizeX || var43 > Pix2D.sizeX || var39 > Pix2D.sizeX) {
								Pix3D.hclip = true;
							}

							if (click && insideTriangle(clickX, clickY, var42, var44, var40, var41, var43, var39)) {
								groundX = arg6;
								groundZ = arg7;
							}

							if (arg0.texture == -1) {
								if (arg0.colourNE != 12345678) {
									Pix3D.gouraudTriangle(var42, var44, var40, var41, var43, var39, arg0.colourNE, arg0.colourNW, arg0.colourSE);
								}
							} else if (lowMem) {
								int var45 = TEXTURE_AVERAGE[arg0.texture];
								Pix3D.gouraudTriangle(var42, var44, var40, var41, var43, var39, getTable(arg0.colourNE, var45), getTable(arg0.colourNW, var45), getTable(arg0.colourSE, var45));
							} else if (arg0.flat) {
								Pix3D.textureTriangle(var42, var44, var40, var41, var43, var39, arg0.colourNE, arg0.colourNW, arg0.colourSE, var21, var25, var33, var23, var27, var35, var12, var11, var15, arg0.texture);
							} else {
								Pix3D.textureTriangle(var42, var44, var40, var41, var43, var39, arg0.colourNE, arg0.colourNW, arg0.colourSE, var29, var33, var25, var31, var35, var27, var16, var15, var11, arg0.texture);
							}
						}

						if ((var37 - var39) * (var44 - var40) - (var38 - var40) * (var43 - var39) > 0) {
							Pix3D.hclip = false;
							if (var37 < 0 || var39 < 0 || var43 < 0 || var37 > Pix2D.sizeX || var39 > Pix2D.sizeX || var43 > Pix2D.sizeX) {
								Pix3D.hclip = true;
							}

							if (click && insideTriangle(clickX, clickY, var38, var40, var44, var37, var39, var43)) {
								groundX = arg6;
								groundZ = arg7;
							}

							if (arg0.texture != -1) {
								if (!lowMem) {
									Pix3D.textureTriangle(var38, var40, var44, var37, var39, var43, arg0.colourSW, arg0.colourSE, arg0.colourNW, var21, var25, var33, var23, var27, var35, var12, var11, var15, arg0.texture);
									return;
								}

								int var46 = TEXTURE_AVERAGE[arg0.texture];
								Pix3D.gouraudTriangle(var38, var40, var44, var37, var39, var43, getTable(arg0.colourSW, var46), getTable(arg0.colourSE, var46), getTable(arg0.colourNW, var46));
							} else if (arg0.colourSW != 12345678) {
								Pix3D.gouraudTriangle(var38, var40, var44, var37, var39, var43, arg0.colourSW, arg0.colourSE, arg0.colourNW);
								return;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.a(IILi;IIIIZ)V")
	public void renderGround(int arg0, int arg1, Ground arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2.vertexX.length;
		for (int var9 = 0; var9 < var8; var9++) {
			int var10 = arg2.vertexX[var9] - cx;
			int var11 = arg2.vertexY[var9] - cy;
			int var12 = arg2.vertexZ[var9] - cz;
			int var13 = arg0 * var12 + arg6 * var10 >> 16;
			var12 = arg6 * var12 - arg0 * var10 >> 16;
			int var15 = arg4 * var11 - arg5 * var12 >> 16;
			var12 = arg4 * var12 + arg5 * var11 >> 16;
			if (var12 < 50) {
				return;
			}

			if (arg2.faceTexture != null) {
				Ground.drawTextureVertexX[var9] = var13;
				Ground.drawTextureVertexY[var9] = var15;
				Ground.drawTextureVertexZ[var9] = var12;
			}

			Ground.drawVertexX[var9] = (var13 << 9) / var12 + Pix3D.originX;
			Ground.drawVertexY[var9] = (var15 << 9) / var12 + Pix3D.originY;
		}

		Pix3D.trans = 0;
		int var17 = arg2.faceVertexA.length;
		for (int var18 = 0; var18 < var17; var18++) {
			int var19 = arg2.faceVertexA[var18];
			int var20 = arg2.faceVertexB[var18];
			int var21 = arg2.faceVertexC[var18];
			int var22 = Ground.drawVertexX[var19];
			int var23 = Ground.drawVertexX[var20];
			int var24 = Ground.drawVertexX[var21];
			int var25 = Ground.drawVertexY[var19];
			int var26 = Ground.drawVertexY[var20];
			int var27 = Ground.drawVertexY[var21];
			if ((var22 - var23) * (var27 - var26) - (var24 - var23) * (var25 - var26) > 0) {
				Pix3D.hclip = false;
				if (var22 < 0 || var23 < 0 || var24 < 0 || var22 > Pix2D.sizeX || var23 > Pix2D.sizeX || var24 > Pix2D.sizeX) {
					Pix3D.hclip = true;
				}

				if (click && insideTriangle(clickX, clickY, var25, var26, var27, var22, var23, var24)) {
					groundX = arg3;
					groundZ = arg1;
				}

				if (arg2.faceTexture == null || arg2.faceTexture[var18] == -1) {
					if (arg2.faceColourA[var18] != 12345678) {
						Pix3D.gouraudTriangle(var25, var26, var27, var22, var23, var24, arg2.faceColourA[var18], arg2.faceColourB[var18], arg2.faceColourC[var18]);
					}
				} else if (lowMem) {
					int var28 = TEXTURE_AVERAGE[arg2.faceTexture[var18]];
					Pix3D.gouraudTriangle(var25, var26, var27, var22, var23, var24, getTable(arg2.faceColourA[var18], var28), getTable(arg2.faceColourB[var18], var28), getTable(arg2.faceColourC[var18], var28));
				} else if (arg2.flat) {
					Pix3D.textureTriangle(var25, var26, var27, var22, var23, var24, arg2.faceColourA[var18], arg2.faceColourB[var18], arg2.faceColourC[var18], Ground.drawTextureVertexX[0], Ground.drawTextureVertexX[1], Ground.drawTextureVertexX[3], Ground.drawTextureVertexY[0], Ground.drawTextureVertexY[1], Ground.drawTextureVertexY[3], Ground.drawTextureVertexZ[0], Ground.drawTextureVertexZ[1], Ground.drawTextureVertexZ[3], arg2.faceTexture[var18]);
				} else {
					Pix3D.textureTriangle(var25, var26, var27, var22, var23, var24, arg2.faceColourA[var18], arg2.faceColourB[var18], arg2.faceColourC[var18], Ground.drawTextureVertexX[var19], Ground.drawTextureVertexX[var20], Ground.drawTextureVertexX[var21], Ground.drawTextureVertexY[var19], Ground.drawTextureVertexY[var20], Ground.drawTextureVertexY[var21], Ground.drawTextureVertexZ[var19], Ground.drawTextureVertexZ[var20], Ground.drawTextureVertexZ[var21], arg2.faceTexture[var18]);
				}
			}
		}
	}

	@ObfuscatedName("r.f(III)I")
	public int getTable(int arg0, int arg1) {
		arg0 = 127 - arg0;
		arg0 = (arg1 & 0x7F) * arg0 / 160;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}

		return (arg1 & 0xFF80) + arg0;
	}

	@ObfuscatedName("r.a(IIIIIIII)Z")
	public boolean insideTriangle(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			int var9 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			int var10 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			int var11 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			if (var9 * var11 > 0 && var10 * var11 > 0) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("r.b(Z)V")
	public void calcOcclude() {
		int var1 = numOccluders[maxLevel];
		Occlude[] var2 = occluders[maxLevel];
		numActiveOccluders = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			Occlude var4 = var2[var3];
			if (var4.type == 1) {
				int var5 = var4.minTileX + 25 - gx;
				if (var5 >= 0 && var5 <= 50) {
					int var6 = var4.minTileZ + 25 - gz;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = var4.maxTileZ + 25 - gz;
					if (var7 > 50) {
						var7 = 50;
					}

					boolean var8 = false;
					while (var6 <= var7) {
						if (visBackingDirty[var5][var6++]) {
							var8 = true;
							break;
						}
					}

					if (var8) {
						int var9 = cx - var4.minX;
						if (var9 > 32) {
							var4.mode = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.mode = 2;
							var9 = -var9;
						}

						var4.minDeltaZ = (var4.minZ - cz << 8) / var9;
						var4.maxDeltaZ = (var4.maxZ - cz << 8) / var9;
						var4.minDeltaY = (var4.minY - cy << 8) / var9;
						var4.maxDeltaY = (var4.maxY - cy << 8) / var9;
						activeOccluders[numActiveOccluders++] = var4;
					}
				}
			} else if (var4.type == 2) {
				int var10 = var4.minTileZ + 25 - gz;
				if (var10 >= 0 && var10 <= 50) {
					int var11 = var4.minTileX + 25 - gx;
					if (var11 < 0) {
						var11 = 0;
					}

					int var12 = var4.maxTileX + 25 - gx;
					if (var12 > 50) {
						var12 = 50;
					}

					boolean var13 = false;
					while (var11 <= var12) {
						if (visBackingDirty[var11++][var10]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						int var14 = cz - var4.minZ;
						if (var14 > 32) {
							var4.mode = 3;
						} else {
							if (var14 >= -32) {
								continue;
							}

							var4.mode = 4;
							var14 = -var14;
						}

						var4.minDeltaX = (var4.minX - cx << 8) / var14;
						var4.maxDeltaX = (var4.maxX - cx << 8) / var14;
						var4.minDeltaY = (var4.minY - cy << 8) / var14;
						var4.maxDeltaY = (var4.maxY - cy << 8) / var14;
						activeOccluders[numActiveOccluders++] = var4;
					}
				}
			} else if (var4.type == 4) {
				int var15 = var4.minY - cy;
				if (var15 > 128) {
					int var16 = var4.minTileZ + 25 - gz;
					if (var16 < 0) {
						var16 = 0;
					}

					int var17 = var4.maxTileZ + 25 - gz;
					if (var17 > 50) {
						var17 = 50;
					}

					if (var16 <= var17) {
						int var18 = var4.minTileX + 25 - gx;
						if (var18 < 0) {
							var18 = 0;
						}

						int var19 = var4.maxTileX + 25 - gx;
						if (var19 > 50) {
							var19 = 50;
						}

						boolean var20 = false;
						label142: for (int var21 = var18; var21 <= var19; var21++) {
							for (int var22 = var16; var22 <= var17; var22++) {
								if (visBackingDirty[var21][var22]) {
									var20 = true;
									break label142;
								}
							}
						}

						if (var20) {
							var4.mode = 5;
							var4.minDeltaX = (var4.minX - cx << 8) / var15;
							var4.maxDeltaX = (var4.maxX - cx << 8) / var15;
							var4.minDeltaZ = (var4.minZ - cz << 8) / var15;
							var4.maxDeltaZ = (var4.maxZ - cz << 8) / var15;
							activeOccluders[numActiveOccluders++] = var4;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("r.g(III)Z")
	public boolean groundOccluded(int arg0, int arg1, int arg2) {
		int var4 = occlusionCycle[arg0][arg1][arg2];
		if (-cycleNo == var4) {
			return false;
		} else if (cycleNo == var4) {
			return true;
		} else {
			int var5 = arg1 << 7;
			int var6 = arg2 << 7;
			if (occluded(var5 + 1, groundh[arg0][arg1][arg2], var6 + 1) && occluded(var5 + 128 - 1, groundh[arg0][arg1 + 1][arg2], var6 + 1) && occluded(var5 + 128 - 1, groundh[arg0][arg1 + 1][arg2 + 1], var6 + 128 - 1) && occluded(var5 + 1, groundh[arg0][arg1][arg2 + 1], var6 + 128 - 1)) {
				occlusionCycle[arg0][arg1][arg2] = cycleNo;
				return true;
			} else {
				occlusionCycle[arg0][arg1][arg2] = -cycleNo;
				return false;
			}
		}
	}

	@ObfuscatedName("r.i(IIII)Z")
	public boolean wallOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (!groundOccluded(arg0, arg1, arg2)) {
			return false;
		}

		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		int var7 = groundh[arg0][arg1][arg2] - 1;
		int var8 = var7 - 120;
		int var9 = var7 - 230;
		int var10 = var7 - 238;

		if (arg3 < 16) {
			if (arg3 == 1) {
				if (var5 > cx) {
					if (!occluded(var5, var7, var6)) {
						return false;
					}

					if (!occluded(var5, var7, var6 + 128)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!occluded(var5, var8, var6)) {
						return false;
					}

					if (!occluded(var5, var8, var6 + 128)) {
						return false;
					}
				}

				if (!occluded(var5, var9, var6)) {
					return false;
				}

				if (!occluded(var5, var9, var6 + 128)) {
					return false;
				}

				return true;
			}

			if (arg3 == 2) {
				if (var6 < cz) {
					if (!occluded(var5, var7, var6 + 128)) {
						return false;
					}

					if (!occluded(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!occluded(var5, var8, var6 + 128)) {
						return false;
					}

					if (!occluded(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}

				if (!occluded(var5, var9, var6 + 128)) {
					return false;
				}

				if (!occluded(var5 + 128, var9, var6 + 128)) {
					return false;
				}

				return true;
			}

			if (arg3 == 4) {
				if (var5 < cx) {
					if (!occluded(var5 + 128, var7, var6)) {
						return false;
					}

					if (!occluded(var5 + 128, var7, var6 + 128)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!occluded(var5 + 128, var8, var6)) {
						return false;
					}

					if (!occluded(var5 + 128, var8, var6 + 128)) {
						return false;
					}
				}

				if (!occluded(var5 + 128, var9, var6)) {
					return false;
				}

				if (!occluded(var5 + 128, var9, var6 + 128)) {
					return false;
				}

				return true;
			}

			if (arg3 == 8) {
				if (var6 > cz) {
					if (!occluded(var5, var7, var6)) {
						return false;
					}

					if (!occluded(var5 + 128, var7, var6)) {
						return false;
					}
				}

				if (arg0 > 0) {
					if (!occluded(var5, var8, var6)) {
						return false;
					}

					if (!occluded(var5 + 128, var8, var6)) {
						return false;
					}
				}

				if (!occluded(var5, var9, var6)) {
					return false;
				}

				if (!occluded(var5 + 128, var9, var6)) {
					return false;
				}

				return true;
			}
		}

		if (!occluded(var5 + 64, var10, var6 + 64)) {
			return false;
		} else if (arg3 == 16) {
			if (!occluded(var5, var9, var6 + 128)) {
				return false;
			}

			return true;
		} else if (arg3 == 32) {
			if (!occluded(var5 + 128, var9, var6 + 128)) {
				return false;
			}

			return true;
		} else if (arg3 == 64) {
			if (!occluded(var5 + 128, var9, var6)) {
				return false;
			}

			return true;
		} else if (arg3 == 128) {
			if (!occluded(var5, var9, var6)) {
				return false;
			}

			return true;
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	@ObfuscatedName("r.j(IIII)Z")
	public boolean spriteOccluded(int arg0, int arg1, int arg2, int arg3) {
		if (!groundOccluded(arg0, arg1, arg2)) {
			return false;
		}

		int var5 = arg1 << 7;
		int var6 = arg2 << 7;
		if (occluded(var5 + 1, groundh[arg0][arg1][arg2] - arg3, var6 + 1) && occluded(var5 + 128 - 1, groundh[arg0][arg1 + 1][arg2] - arg3, var6 + 1) && occluded(var5 + 128 - 1, groundh[arg0][arg1 + 1][arg2 + 1] - arg3, var6 + 128 - 1) && occluded(var5 + 1, groundh[arg0][arg1][arg2 + 1] - arg3, var6 + 128 - 1)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("r.a(IIIIII)Z")
	public boolean spriteOccluded2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != arg2 || arg3 != arg4) {
			for (int var9 = arg1; var9 <= arg2; var9++) {
				for (int var10 = arg3; var10 <= arg4; var10++) {
					if (occlusionCycle[arg0][var9][var10] == -cycleNo) {
						return false;
					}
				}
			}

			int var11 = (arg1 << 7) + 1;
			int var12 = (arg3 << 7) + 2;
			int var13 = groundh[arg0][arg1][arg3] - arg5;
			if (!occluded(var11, var13, var12)) {
				return false;
			}

			int var14 = (arg2 << 7) - 1;
			if (!occluded(var14, var13, var12)) {
				return false;
			}

			int var15 = (arg4 << 7) - 1;
			if (!occluded(var11, var13, var15)) {
				return false;
			}

			if (!occluded(var14, var13, var15)) {
				return false;
			}

			return true;
		}

		if (groundOccluded(arg0, arg1, arg3)) {
			int var7 = arg1 << 7;
			int var8 = arg3 << 7;
			if (occluded(var7 + 1, groundh[arg0][arg1][arg3] - arg5, var8 + 1) && occluded(var7 + 128 - 1, groundh[arg0][arg1 + 1][arg3] - arg5, var8 + 1) && occluded(var7 + 128 - 1, groundh[arg0][arg1 + 1][arg3 + 1] - arg5, var8 + 128 - 1) && occluded(var7 + 1, groundh[arg0][arg1][arg3 + 1] - arg5, var8 + 128 - 1)) {
				return true;
			}

			return false;
		}

		return false;
	}

	@ObfuscatedName("r.h(III)Z")
	public boolean occluded(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < numActiveOccluders; var4++) {
			Occlude var5 = activeOccluders[var4];
			if (var5.mode == 1) {
				int var6 = var5.minX - arg0;
				if (var6 > 0) {
					int var7 = (var5.minDeltaZ * var6 >> 8) + var5.minZ;
					int var8 = (var5.maxDeltaZ * var6 >> 8) + var5.maxZ;
					int var9 = (var5.minDeltaY * var6 >> 8) + var5.minY;
					int var10 = (var5.maxDeltaY * var6 >> 8) + var5.maxY;
					if (arg2 >= var7 && arg2 <= var8 && arg1 >= var9 && arg1 <= var10) {
						return true;
					}
				}
			} else if (var5.mode == 2) {
				int var11 = arg0 - var5.minX;
				if (var11 > 0) {
					int var12 = (var5.minDeltaZ * var11 >> 8) + var5.minZ;
					int var13 = (var5.maxDeltaZ * var11 >> 8) + var5.maxZ;
					int var14 = (var5.minDeltaY * var11 >> 8) + var5.minY;
					int var15 = (var5.maxDeltaY * var11 >> 8) + var5.maxY;
					if (arg2 >= var12 && arg2 <= var13 && arg1 >= var14 && arg1 <= var15) {
						return true;
					}
				}
			} else if (var5.mode == 3) {
				int var16 = var5.minZ - arg2;
				if (var16 > 0) {
					int var17 = (var5.minDeltaX * var16 >> 8) + var5.minX;
					int var18 = (var5.maxDeltaX * var16 >> 8) + var5.maxX;
					int var19 = (var5.minDeltaY * var16 >> 8) + var5.minY;
					int var20 = (var5.maxDeltaY * var16 >> 8) + var5.maxY;
					if (arg0 >= var17 && arg0 <= var18 && arg1 >= var19 && arg1 <= var20) {
						return true;
					}
				}
			} else if (var5.mode == 4) {
				int var21 = arg2 - var5.minZ;
				if (var21 > 0) {
					int var22 = (var5.minDeltaX * var21 >> 8) + var5.minX;
					int var23 = (var5.maxDeltaX * var21 >> 8) + var5.maxX;
					int var24 = (var5.minDeltaY * var21 >> 8) + var5.minY;
					int var25 = (var5.maxDeltaY * var21 >> 8) + var5.maxY;
					if (arg0 >= var22 && arg0 <= var23 && arg1 >= var24 && arg1 <= var25) {
						return true;
					}
				}
			} else if (var5.mode == 5) {
				int var26 = arg1 - var5.minY;
				if (var26 > 0) {
					int var27 = (var5.minDeltaX * var26 >> 8) + var5.minX;
					int var28 = (var5.maxDeltaX * var26 >> 8) + var5.maxX;
					int var29 = (var5.minDeltaZ * var26 >> 8) + var5.minZ;
					int var30 = (var5.maxDeltaZ * var26 >> 8) + var5.maxZ;
					if (arg0 >= var27 && arg0 <= var28 && arg2 >= var29 && arg2 <= var30) {
						return true;
					}
				}
			}
		}

		return false;
	}
}
