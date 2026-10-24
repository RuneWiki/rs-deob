package jagex2.dash3d.type;

import deob.ObfuscatedName;

@ObfuscatedName("j")
public final class TileOverlay {

	@ObfuscatedName("j.c")
	public int[] field156;

	@ObfuscatedName("j.d")
	public int[] field157;

	@ObfuscatedName("j.e")
	public int[] field158;

	@ObfuscatedName("j.f")
	public int[] field159;

	@ObfuscatedName("j.g")
	public int[] field160;

	@ObfuscatedName("j.h")
	public int[] field161;

	@ObfuscatedName("j.i")
	public int[] field162;

	@ObfuscatedName("j.j")
	public int[] field163;

	@ObfuscatedName("j.k")
	public int[] field164;

	@ObfuscatedName("j.l")
	public int[] field165;

	@ObfuscatedName("j.m")
	public boolean field166 = true;

	@ObfuscatedName("j.n")
	public int field167;

	@ObfuscatedName("j.o")
	public int field168;

	@ObfuscatedName("j.p")
	public int field169;

	@ObfuscatedName("j.q")
	public int field170;

	@ObfuscatedName("j.r")
	public static int[] field171 = new int[6];

	@ObfuscatedName("j.s")
	public static int[] field172 = new int[6];

	@ObfuscatedName("j.t")
	public static int[] field173 = new int[6];

	@ObfuscatedName("j.u")
	public static int[] field174 = new int[6];

	@ObfuscatedName("j.v")
	public static int[] field175 = new int[6];

	@ObfuscatedName("j.w")
	public static int[] field176 = new int[] { 1, 0 };

	@ObfuscatedName("j.x")
	public static int[] field177 = new int[] { 2, 1 };

	@ObfuscatedName("j.y")
	public static int[] field178 = new int[] { 3, 3 };

	@ObfuscatedName("j.z")
	public static final int[][] field179 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("j.A")
	public static final int[][] field180 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public TileOverlay(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg5 != arg18 || arg1 != arg5 || arg5 != arg12) {
			field166 = false;
		}

		field167 = arg4;
		field168 = arg8;
		field169 = arg3;
		field170 = arg2;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field179[arg4];
		int var25 = var24.length;
		field156 = new int[var25];
		field157 = new int[var25];
		field158 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg11 * var20;
		int var29 = arg14 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg8 - arg8 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg8 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg8 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg5;
				var35 = arg17;
				var36 = arg9;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg5 + arg18 >> 1;
				var35 = arg7 + arg17 >> 1;
				var36 = arg9 + arg16 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg18;
				var35 = arg7;
				var36 = arg16;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg18 >> 1;
				var35 = arg7 + arg15 >> 1;
				var36 = arg10 + arg16 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg1;
				var35 = arg15;
				var36 = arg10;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg1 + arg12 >> 1;
				var35 = arg0 + arg15 >> 1;
				var36 = arg10 + arg13 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg12;
				var35 = arg0;
				var36 = arg13;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg5 + arg12 >> 1;
				var35 = arg0 + arg17 >> 1;
				var36 = arg9 + arg13 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg5 + arg18 >> 1;
				var35 = arg7 + arg17 >> 1;
				var36 = arg9 + arg16 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg18 >> 1;
				var35 = arg7 + arg15 >> 1;
				var36 = arg10 + arg16 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg1 + arg12 >> 1;
				var35 = arg0 + arg15 >> 1;
				var36 = arg10 + arg13 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg12 >> 1;
				var35 = arg0 + arg17 >> 1;
				var36 = arg9 + arg13 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg5;
				var35 = arg17;
				var36 = arg9;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg18;
				var35 = arg7;
				var36 = arg16;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg1;
				var35 = arg15;
				var36 = arg10;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg12;
				var35 = arg0;
				var36 = arg13;
			}

			field156[var30] = var32;
			field157[var30] = var34;
			field158[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field180[arg4];
		int var38 = var37.length / 4;
		field162 = new int[var38];
		field163 = new int[var38];
		field164 = new int[var38];
		field159 = new int[var38];
		field160 = new int[var38];
		field161 = new int[var38];

		if (arg6 != -1) {
			field165 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg8 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg8 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg8 & 0x3;
			}

			field162[var40] = var42;
			field163[var40] = var43;
			field164[var40] = var44;

			if (var41 == 0) {
				field159[var40] = var26[var42];
				field160[var40] = var26[var43];
				field161[var40] = var26[var44];

				if (field165 != null) {
					field165[var40] = -1;
				}
			} else {
				field159[var40] = var27[var42];
				field160[var40] = var27[var43];
				field161[var40] = var27[var44];

				if (field165 != null) {
					field165[var40] = arg6;
				}
			}
		}

		int var45 = arg5;
		int var46 = arg18;

		if (arg18 < arg5) {
			var45 = arg18;
		}

		if (arg18 > arg18) {
			var46 = arg18;
		}

		if (arg1 < var45) {
			var45 = arg1;
		}

		if (arg1 > var46) {
			var46 = arg1;
		}

		if (arg12 < var45) {
			var45 = arg12;
		}

		if (arg12 > var46) {
			var46 = arg12;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
