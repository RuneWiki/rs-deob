package deob;

@ObfuscatedName("i")
public final class class9 {

	@ObfuscatedName("i.a")
	public int[] field86;

	@ObfuscatedName("i.b")
	public int[] field87;

	@ObfuscatedName("i.c")
	public int[] field88;

	@ObfuscatedName("i.d")
	public int[] field89;

	@ObfuscatedName("i.e")
	public int[] field90;

	@ObfuscatedName("i.f")
	public int[] field91;

	@ObfuscatedName("i.g")
	public int[] field92;

	@ObfuscatedName("i.h")
	public int[] field93;

	@ObfuscatedName("i.i")
	public int[] field94;

	@ObfuscatedName("i.j")
	public int[] field95;

	@ObfuscatedName("i.k")
	public boolean field96 = true;

	@ObfuscatedName("i.l")
	public int field97;

	@ObfuscatedName("i.m")
	public int field98;

	@ObfuscatedName("i.n")
	public int field99;

	@ObfuscatedName("i.o")
	public int field100;

	@ObfuscatedName("i.p")
	public static int[] field101 = new int[6];

	@ObfuscatedName("i.q")
	public static int[] field102 = new int[6];

	@ObfuscatedName("i.r")
	public static int[] field103 = new int[6];

	@ObfuscatedName("i.s")
	public static int[] field104 = new int[6];

	@ObfuscatedName("i.t")
	public static int[] field105 = new int[6];

	@ObfuscatedName("i.u")
	public static int[] field106 = new int[] { 1, 0 };

	@ObfuscatedName("i.v")
	public static int[] field107 = new int[] { 2, 1 };

	@ObfuscatedName("i.w")
	public static int[] field108 = new int[] { 3, 3 };

	@ObfuscatedName("i.x")
	public static final int[][] field109 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("i.y")
	public static final int[][] field110 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public class9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg9 != arg16 || arg5 != arg9 || arg9 != arg13) {
			field96 = false;
		}

		field97 = arg11;
		field98 = arg0;
		field99 = arg7;
		field100 = arg18;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field109[arg11];
		int var25 = var24.length;
		field86 = new int[var25];
		field87 = new int[var25];
		field88 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg2 * var20;
		int var29 = arg4 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg0 - arg0 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg0 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg0 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg9;
				var35 = arg17;
				var36 = arg14;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg9 + arg16 >> 1;
				var35 = arg3 + arg17 >> 1;
				var36 = arg1 + arg14 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg16;
				var35 = arg3;
				var36 = arg1;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg16 >> 1;
				var35 = arg3 + arg6 >> 1;
				var36 = arg1 + arg8 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg5;
				var35 = arg6;
				var36 = arg8;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg5 + arg13 >> 1;
				var35 = arg6 + arg15 >> 1;
				var36 = arg8 + arg10 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg13;
				var35 = arg15;
				var36 = arg10;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg9 + arg13 >> 1;
				var35 = arg15 + arg17 >> 1;
				var36 = arg10 + arg14 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg9 + arg16 >> 1;
				var35 = arg3 + arg17 >> 1;
				var36 = arg1 + arg14 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg16 >> 1;
				var35 = arg3 + arg6 >> 1;
				var36 = arg1 + arg8 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg5 + arg13 >> 1;
				var35 = arg6 + arg15 >> 1;
				var36 = arg8 + arg10 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg9 + arg13 >> 1;
				var35 = arg15 + arg17 >> 1;
				var36 = arg10 + arg14 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg9;
				var35 = arg17;
				var36 = arg14;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg16;
				var35 = arg3;
				var36 = arg1;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg5;
				var35 = arg6;
				var36 = arg8;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg13;
				var35 = arg15;
				var36 = arg10;
			}

			field86[var30] = var32;
			field87[var30] = var34;
			field88[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field110[arg11];
		int var38 = var37.length / 4;
		field92 = new int[var38];
		field93 = new int[var38];
		field94 = new int[var38];
		field89 = new int[var38];
		field90 = new int[var38];
		field91 = new int[var38];

		if (arg12 != -1) {
			field95 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg0 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg0 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg0 & 0x3;
			}

			field92[var40] = var42;
			field93[var40] = var43;
			field94[var40] = var44;

			if (var41 == 0) {
				field89[var40] = var26[var42];
				field90[var40] = var26[var43];
				field91[var40] = var26[var44];

				if (field95 != null) {
					field95[var40] = -1;
				}
			} else {
				field89[var40] = var27[var42];
				field90[var40] = var27[var43];
				field91[var40] = var27[var44];

				if (field95 != null) {
					field95[var40] = arg12;
				}
			}
		}

		int var45 = arg9;
		int var46 = arg16;

		if (arg16 < arg9) {
			var45 = arg16;
		}

		if (arg16 > arg16) {
			var46 = arg16;
		}

		if (arg5 < var45) {
			var45 = arg5;
		}

		if (arg5 > var46) {
			var46 = arg5;
		}

		if (arg13 < var45) {
			var45 = arg13;
		}

		if (arg13 > var46) {
			var46 = arg13;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
