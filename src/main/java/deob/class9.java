package deob;

@ObfuscatedName("i")
public final class class9 {

	@ObfuscatedName("i.b")
	public int[] field88;

	@ObfuscatedName("i.c")
	public int[] field89;

	@ObfuscatedName("i.d")
	public int[] field90;

	@ObfuscatedName("i.e")
	public int[] field91;

	@ObfuscatedName("i.f")
	public int[] field92;

	@ObfuscatedName("i.g")
	public int[] field93;

	@ObfuscatedName("i.h")
	public int[] field94;

	@ObfuscatedName("i.i")
	public int[] field95;

	@ObfuscatedName("i.j")
	public int[] field96;

	@ObfuscatedName("i.k")
	public int[] field97;

	@ObfuscatedName("i.l")
	public boolean field98 = true;

	@ObfuscatedName("i.m")
	public int field99;

	@ObfuscatedName("i.n")
	public int field100;

	@ObfuscatedName("i.o")
	public int field101;

	@ObfuscatedName("i.p")
	public int field102;

	@ObfuscatedName("i.q")
	public static int[] field103 = new int[6];

	@ObfuscatedName("i.r")
	public static int[] field104 = new int[6];

	@ObfuscatedName("i.s")
	public static int[] field105 = new int[6];

	@ObfuscatedName("i.t")
	public static int[] field106 = new int[6];

	@ObfuscatedName("i.u")
	public static int[] field107 = new int[6];

	@ObfuscatedName("i.v")
	public static int[] field108 = new int[] { 1, 0 };

	@ObfuscatedName("i.w")
	public static int[] field109 = new int[] { 2, 1 };

	@ObfuscatedName("i.x")
	public static int[] field110 = new int[] { 3, 3 };

	@ObfuscatedName("i.y")
	public static final int[][] field111 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("i.z")
	public static final int[][] field112 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public class9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg1 != arg15 || arg1 != arg17 || arg1 != arg10) {
			field98 = false;
		}

		field99 = arg8;
		field100 = arg16;
		field101 = arg13;
		field102 = arg14;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field111[arg8];
		int var25 = var24.length;
		field88 = new int[var25];
		field89 = new int[var25];
		field90 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg0 * var20;
		int var29 = arg7 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg16 - arg16 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg16 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg16 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg1;
				var35 = arg9;
				var36 = arg11;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg1 + arg15 >> 1;
				var35 = arg3 + arg9 >> 1;
				var36 = arg11 + arg12 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg15;
				var35 = arg3;
				var36 = arg12;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg15 + arg17 >> 1;
				var35 = arg3 + arg6 >> 1;
				var36 = arg5 + arg12 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg17;
				var35 = arg6;
				var36 = arg5;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg10 + arg17 >> 1;
				var35 = arg4 + arg6 >> 1;
				var36 = arg5 + arg18 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg10;
				var35 = arg4;
				var36 = arg18;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg1 + arg10 >> 1;
				var35 = arg4 + arg9 >> 1;
				var36 = arg11 + arg18 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg1 + arg15 >> 1;
				var35 = arg3 + arg9 >> 1;
				var36 = arg11 + arg12 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg15 + arg17 >> 1;
				var35 = arg3 + arg6 >> 1;
				var36 = arg5 + arg12 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg10 + arg17 >> 1;
				var35 = arg4 + arg6 >> 1;
				var36 = arg5 + arg18 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg10 >> 1;
				var35 = arg4 + arg9 >> 1;
				var36 = arg11 + arg18 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg1;
				var35 = arg9;
				var36 = arg11;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg15;
				var35 = arg3;
				var36 = arg12;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg17;
				var35 = arg6;
				var36 = arg5;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg10;
				var35 = arg4;
				var36 = arg18;
			}

			field88[var30] = var32;
			field89[var30] = var34;
			field90[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field112[arg8];
		int var38 = var37.length / 4;
		field94 = new int[var38];
		field95 = new int[var38];
		field96 = new int[var38];
		field91 = new int[var38];
		field92 = new int[var38];
		field93 = new int[var38];

		if (arg2 != -1) {
			field97 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg16 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg16 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg16 & 0x3;
			}

			field94[var40] = var42;
			field95[var40] = var43;
			field96[var40] = var44;

			if (var41 == 0) {
				field91[var40] = var26[var42];
				field92[var40] = var26[var43];
				field93[var40] = var26[var44];

				if (field97 != null) {
					field97[var40] = -1;
				}
			} else {
				field91[var40] = var27[var42];
				field92[var40] = var27[var43];
				field93[var40] = var27[var44];

				if (field97 != null) {
					field97[var40] = arg2;
				}
			}
		}

		int var45 = arg1;
		int var46 = arg15;

		if (arg15 < arg1) {
			var45 = arg15;
		}

		if (arg15 > arg15) {
			var46 = arg15;
		}

		if (arg17 < var45) {
			var45 = arg17;
		}

		if (arg17 > var46) {
			var46 = arg17;
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
