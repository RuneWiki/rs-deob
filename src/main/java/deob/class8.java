package deob;

@ObfuscatedName("h")
public final class class8 {

	@ObfuscatedName("h.b")
	public int[] field77;

	@ObfuscatedName("h.c")
	public int[] field78;

	@ObfuscatedName("h.d")
	public int[] field79;

	@ObfuscatedName("h.e")
	public int[] field80;

	@ObfuscatedName("h.f")
	public int[] field81;

	@ObfuscatedName("h.g")
	public int[] field82;

	@ObfuscatedName("h.h")
	public int[] field83;

	@ObfuscatedName("h.i")
	public int[] field84;

	@ObfuscatedName("h.j")
	public int[] field85;

	@ObfuscatedName("h.k")
	public int[] field86;

	@ObfuscatedName("h.l")
	public boolean field87 = true;

	@ObfuscatedName("h.m")
	public int field88;

	@ObfuscatedName("h.n")
	public int field89;

	@ObfuscatedName("h.o")
	public int field90;

	@ObfuscatedName("h.p")
	public int field91;

	@ObfuscatedName("h.q")
	public static int[] field92 = new int[6];

	@ObfuscatedName("h.r")
	public static int[] field93 = new int[6];

	@ObfuscatedName("h.s")
	public static int[] field94 = new int[6];

	@ObfuscatedName("h.t")
	public static int[] field95 = new int[6];

	@ObfuscatedName("h.u")
	public static int[] field96 = new int[6];

	@ObfuscatedName("h.v")
	public static int[] field97 = new int[] { 1, 0 };

	@ObfuscatedName("h.w")
	public static int[] field98 = new int[] { 2, 1 };

	@ObfuscatedName("h.x")
	public static int[] field99 = new int[] { 3, 3 };

	@ObfuscatedName("h.y")
	public static final int[][] field100 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("h.z")
	public static final int[][] field101 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg3 != arg13 || arg2 != arg3 || arg0 != arg3) {
			field87 = false;
		}

		field88 = arg15;
		field89 = arg8;
		field90 = arg17;
		field91 = arg18;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field100[arg15];
		int var25 = var24.length;
		field77 = new int[var25];
		field78 = new int[var25];
		field79 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg4 * var20;
		int var29 = arg1 * var20;
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
				var34 = arg3;
				var35 = arg6;
				var36 = arg11;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg3 + arg13 >> 1;
				var35 = arg6 + arg14 >> 1;
				var36 = arg7 + arg11 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg13;
				var35 = arg14;
				var36 = arg7;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg2 + arg13 >> 1;
				var35 = arg9 + arg14 >> 1;
				var36 = arg7 + arg10 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg2;
				var35 = arg9;
				var36 = arg10;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg0 + arg2 >> 1;
				var35 = arg9 + arg12 >> 1;
				var36 = arg10 + arg16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg0;
				var35 = arg12;
				var36 = arg16;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg0 + arg3 >> 1;
				var35 = arg6 + arg12 >> 1;
				var36 = arg11 + arg16 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg3 + arg13 >> 1;
				var35 = arg6 + arg14 >> 1;
				var36 = arg7 + arg11 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg2 + arg13 >> 1;
				var35 = arg9 + arg14 >> 1;
				var36 = arg7 + arg10 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg0 + arg2 >> 1;
				var35 = arg9 + arg12 >> 1;
				var36 = arg10 + arg16 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg3 >> 1;
				var35 = arg6 + arg12 >> 1;
				var36 = arg11 + arg16 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg3;
				var35 = arg6;
				var36 = arg11;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg13;
				var35 = arg14;
				var36 = arg7;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg2;
				var35 = arg9;
				var36 = arg10;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg0;
				var35 = arg12;
				var36 = arg16;
			}

			field77[var30] = var32;
			field78[var30] = var34;
			field79[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field101[arg15];
		int var38 = var37.length / 4;
		field83 = new int[var38];
		field84 = new int[var38];
		field85 = new int[var38];
		field80 = new int[var38];
		field81 = new int[var38];
		field82 = new int[var38];

		if (arg5 != -1) {
			field86 = new int[var38];
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

			field83[var40] = var42;
			field84[var40] = var43;
			field85[var40] = var44;

			if (var41 == 0) {
				field80[var40] = var26[var42];
				field81[var40] = var26[var43];
				field82[var40] = var26[var44];

				if (field86 != null) {
					field86[var40] = -1;
				}
			} else {
				field80[var40] = var27[var42];
				field81[var40] = var27[var43];
				field82[var40] = var27[var44];

				if (field86 != null) {
					field86[var40] = arg5;
				}
			}
		}

		int var45 = arg3;
		int var46 = arg13;

		if (arg13 < arg3) {
			var45 = arg13;
		}

		if (arg13 > arg13) {
			var46 = arg13;
		}

		if (arg2 < var45) {
			var45 = arg2;
		}

		if (arg2 > var46) {
			var46 = arg2;
		}

		if (arg0 < var45) {
			var45 = arg0;
		}

		if (arg0 > var46) {
			var46 = arg0;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
