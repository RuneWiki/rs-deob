package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("i")
public final class Ground {

	@ObfuscatedName("i.b")
	public int[] vertexX;

	@ObfuscatedName("i.c")
	public int[] vertexY;

	@ObfuscatedName("i.d")
	public int[] vertexZ;

	@ObfuscatedName("i.e")
	public int[] faceColourA;

	@ObfuscatedName("i.f")
	public int[] faceColourB;

	@ObfuscatedName("i.g")
	public int[] faceColourC;

	@ObfuscatedName("i.h")
	public int[] faceVertexA;

	@ObfuscatedName("i.i")
	public int[] faceVertexB;

	@ObfuscatedName("i.j")
	public int[] faceVertexC;

	@ObfuscatedName("i.k")
	public int[] faceTexture;

	@ObfuscatedName("i.l")
	public boolean flat = true;

	@ObfuscatedName("i.m")
	public int overlayShape;

	@ObfuscatedName("i.n")
	public int overlayRotation;

	@ObfuscatedName("i.o")
	public int minimapUnderlay;

	@ObfuscatedName("i.p")
	public int minimapOverlay;

	@ObfuscatedName("i.q")
	public static int[] drawVertexX = new int[6];

	@ObfuscatedName("i.r")
	public static int[] drawVertexY = new int[6];

	@ObfuscatedName("i.s")
	public static int[] drawTextureVertexX = new int[6];

	@ObfuscatedName("i.t")
	public static int[] drawTextureVertexY = new int[6];

	@ObfuscatedName("i.u")
	public static int[] drawTextureVertexZ = new int[6];

	@ObfuscatedName("i.v")
	public static int[] shape0P1 = new int[] { 1, 0 };

	@ObfuscatedName("i.w")
	public static int[] shape0P2 = new int[] { 2, 1 };

	@ObfuscatedName("i.x")
	public static int[] shape0P3 = new int[] { 3, 3 };

	@ObfuscatedName("i.y")
	public static final int[][] defShapeP = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("i.z")
	public static final int[][] defShapeF = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public Ground(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg1 != arg8 || arg8 != arg18 || arg8 != arg10) {
			flat = false;
		}

		overlayShape = arg16;
		overlayRotation = arg13;
		minimapUnderlay = arg7;
		minimapOverlay = arg5;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = defShapeP[arg16];
		int var25 = var24.length;
		vertexX = new int[var25];
		vertexY = new int[var25];
		vertexZ = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg2 * var20;
		int var29 = arg15 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg13 - arg13 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg13 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg13 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg8;
				var35 = arg3;
				var36 = arg0;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg1 + arg8 >> 1;
				var35 = arg3 + arg17 >> 1;
				var36 = arg0 + arg11 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg1;
				var35 = arg17;
				var36 = arg11;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg18 >> 1;
				var35 = arg6 + arg17 >> 1;
				var36 = arg11 + arg14 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg18;
				var35 = arg6;
				var36 = arg14;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg10 + arg18 >> 1;
				var35 = arg4 + arg6 >> 1;
				var36 = arg12 + arg14 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg10;
				var35 = arg4;
				var36 = arg12;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg8 + arg10 >> 1;
				var35 = arg3 + arg4 >> 1;
				var36 = arg0 + arg12 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg1 + arg8 >> 1;
				var35 = arg3 + arg17 >> 1;
				var36 = arg0 + arg11 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg18 >> 1;
				var35 = arg6 + arg17 >> 1;
				var36 = arg11 + arg14 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg10 + arg18 >> 1;
				var35 = arg4 + arg6 >> 1;
				var36 = arg12 + arg14 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg10 >> 1;
				var35 = arg3 + arg4 >> 1;
				var36 = arg0 + arg12 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg8;
				var35 = arg3;
				var36 = arg0;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg1;
				var35 = arg17;
				var36 = arg11;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg18;
				var35 = arg6;
				var36 = arg14;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg10;
				var35 = arg4;
				var36 = arg12;
			}

			vertexX[var30] = var32;
			vertexY[var30] = var34;
			vertexZ[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = defShapeF[arg16];
		int var38 = var37.length / 4;
		faceVertexA = new int[var38];
		faceVertexB = new int[var38];
		faceVertexC = new int[var38];
		faceColourA = new int[var38];
		faceColourB = new int[var38];
		faceColourC = new int[var38];

		if (arg9 != -1) {
			faceTexture = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg13 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg13 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg13 & 0x3;
			}

			faceVertexA[var40] = var42;
			faceVertexB[var40] = var43;
			faceVertexC[var40] = var44;

			if (var41 == 0) {
				faceColourA[var40] = var26[var42];
				faceColourB[var40] = var26[var43];
				faceColourC[var40] = var26[var44];

				if (faceTexture != null) {
					faceTexture[var40] = -1;
				}
			} else {
				faceColourA[var40] = var27[var42];
				faceColourB[var40] = var27[var43];
				faceColourC[var40] = var27[var44];

				if (faceTexture != null) {
					faceTexture[var40] = arg9;
				}
			}
		}

		int var45 = arg8;
		int var46 = arg1;

		if (arg1 < arg8) {
			var45 = arg1;
		}

		if (arg1 > arg1) {
			var46 = arg1;
		}

		if (arg18 < var45) {
			var45 = arg18;
		}

		if (arg18 > var46) {
			var46 = arg18;
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
