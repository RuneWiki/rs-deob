package jagex2.dash3d.type;

import deob.ObfuscatedName;

@ObfuscatedName("VBAXKVMG")
public final class TileOverlay {

	@ObfuscatedName("VBAXKVMG.k")
	public boolean flat = true;

	@ObfuscatedName("VBAXKVMG.l")
	public int shape;

	@ObfuscatedName("VBAXKVMG.m")
	public int rotation;

	@ObfuscatedName("VBAXKVMG.n")
	public int backgroundRgb;

	@ObfuscatedName("VBAXKVMG.o")
	public int foregroundRgb;

	@ObfuscatedName("VBAXKVMG.a")
	public int[] vertexX;

	@ObfuscatedName("VBAXKVMG.b")
	public int[] vertexY;

	@ObfuscatedName("VBAXKVMG.c")
	public int[] vertexZ;

	@ObfuscatedName("VBAXKVMG.g")
	public int[] triangleVertexA;

	@ObfuscatedName("VBAXKVMG.h")
	public int[] triangleVertexB;

	@ObfuscatedName("VBAXKVMG.i")
	public int[] triangleVertexC;

	@ObfuscatedName("VBAXKVMG.d")
	public int[] triangleColorA;

	@ObfuscatedName("VBAXKVMG.e")
	public int[] triangleColorB;

	@ObfuscatedName("VBAXKVMG.f")
	public int[] triangleColorC;

	@ObfuscatedName("VBAXKVMG.j")
	public int[] triangleTextureIds;

	@ObfuscatedName("VBAXKVMG.p")
	public static int[] tmpScreenX = new int[6];

	@ObfuscatedName("VBAXKVMG.q")
	public static int[] tmpScreenY = new int[6];

	@ObfuscatedName("VBAXKVMG.r")
	public static int[] tmpViewspaceX = new int[6];

	@ObfuscatedName("VBAXKVMG.s")
	public static int[] tmpViewspaceY = new int[6];

	@ObfuscatedName("VBAXKVMG.t")
	public static int[] tmpViewspaceZ = new int[6];

	@ObfuscatedName("VBAXKVMG.u")
	public static int[] field1276 = new int[] { 1, 0 };

	@ObfuscatedName("VBAXKVMG.v")
	public static int[] field1277 = new int[] { 2, 1 };

	@ObfuscatedName("VBAXKVMG.w")
	public static int[] field1278 = new int[] { 3, 3 };

	@ObfuscatedName("VBAXKVMG.x")
	public static final int[][] SHAPE_POINTS = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("VBAXKVMG.y")
	public static final int[][] SHAPE_PATHS = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg11 != arg12 || arg3 != arg12 || arg10 != arg12) {
			flat = false;
		}

		shape = arg13;
		rotation = arg6;
		backgroundRgb = arg8;
		foregroundRgb = arg18;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = SHAPE_POINTS[arg13];
		int var25 = var24.length;
		vertexX = new int[var25];
		vertexY = new int[var25];
		vertexZ = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg17 * var20;
		int var29 = arg0 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg6 - arg6 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg6 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg6 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg12;
				var35 = arg7;
				var36 = arg1;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg11 + arg12 >> 1;
				var35 = arg7 + arg16 >> 1;
				var36 = arg1 + arg15 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg11;
				var35 = arg16;
				var36 = arg15;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg3 + arg11 >> 1;
				var35 = arg9 + arg16 >> 1;
				var36 = arg5 + arg15 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg3;
				var35 = arg9;
				var36 = arg5;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg3 + arg10 >> 1;
				var35 = arg2 + arg9 >> 1;
				var36 = arg5 + arg14 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg10;
				var35 = arg2;
				var36 = arg14;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg10 + arg12 >> 1;
				var35 = arg2 + arg7 >> 1;
				var36 = arg1 + arg14 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg11 + arg12 >> 1;
				var35 = arg7 + arg16 >> 1;
				var36 = arg1 + arg15 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg3 + arg11 >> 1;
				var35 = arg9 + arg16 >> 1;
				var36 = arg5 + arg15 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg3 + arg10 >> 1;
				var35 = arg2 + arg9 >> 1;
				var36 = arg5 + arg14 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg10 + arg12 >> 1;
				var35 = arg2 + arg7 >> 1;
				var36 = arg1 + arg14 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg12;
				var35 = arg7;
				var36 = arg1;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg11;
				var35 = arg16;
				var36 = arg15;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg3;
				var35 = arg9;
				var36 = arg5;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg10;
				var35 = arg2;
				var36 = arg14;
			}

			vertexX[var30] = var32;
			vertexY[var30] = var34;
			vertexZ[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = SHAPE_PATHS[arg13];
		int var38 = var37.length / 4;
		triangleVertexA = new int[var38];
		triangleVertexB = new int[var38];
		triangleVertexC = new int[var38];
		triangleColorA = new int[var38];
		triangleColorB = new int[var38];
		triangleColorC = new int[var38];

		if (arg4 != -1) {
			triangleTextureIds = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg6 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg6 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg6 & 0x3;
			}

			triangleVertexA[var40] = var42;
			triangleVertexB[var40] = var43;
			triangleVertexC[var40] = var44;

			if (var41 == 0) {
				triangleColorA[var40] = var26[var42];
				triangleColorB[var40] = var26[var43];
				triangleColorC[var40] = var26[var44];

				if (triangleTextureIds != null) {
					triangleTextureIds[var40] = -1;
				}
			} else {
				triangleColorA[var40] = var27[var42];
				triangleColorB[var40] = var27[var43];
				triangleColorC[var40] = var27[var44];

				if (triangleTextureIds != null) {
					triangleTextureIds[var40] = arg4;
				}
			}
		}

		int var45 = arg12;
		int var46 = arg11;

		if (arg11 < arg12) {
			var45 = arg11;
		}

		if (arg11 > arg11) {
			var46 = arg11;
		}

		if (arg3 < var45) {
			var45 = arg3;
		}

		if (arg3 > var46) {
			var46 = arg3;
		}

		if (arg10 < var45) {
			var45 = arg10;
		}

		if (arg10 > var46) {
			var46 = arg10;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
