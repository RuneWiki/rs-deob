package deob;

@ObfuscatedName("i")
public final class class9 {

	@ObfuscatedName("i.a")
	public int[] field84;

	@ObfuscatedName("i.b")
	public int[] field85;

	@ObfuscatedName("i.c")
	public int[] field86;

	@ObfuscatedName("i.d")
	public int[] field87;

	@ObfuscatedName("i.e")
	public int[] field88;

	@ObfuscatedName("i.f")
	public int[] field89;

	@ObfuscatedName("i.g")
	public int[] field90;

	@ObfuscatedName("i.h")
	public int[] field91;

	@ObfuscatedName("i.i")
	public int[] field92;

	@ObfuscatedName("i.j")
	public int[] field93;

	@ObfuscatedName("i.k")
	public boolean field94 = true;

	@ObfuscatedName("i.l")
	public int field95;

	@ObfuscatedName("i.m")
	public int field96;

	@ObfuscatedName("i.n")
	public int field97;

	@ObfuscatedName("i.o")
	public int field98;

	@ObfuscatedName("i.p")
	public static int[] field99 = new int[6];

	@ObfuscatedName("i.q")
	public static int[] field100 = new int[6];

	@ObfuscatedName("i.r")
	public static int[] field101 = new int[6];

	@ObfuscatedName("i.s")
	public static int[] field102 = new int[6];

	@ObfuscatedName("i.t")
	public static int[] field103 = new int[6];

	@ObfuscatedName("i.u")
	public static int[] field104 = new int[] { 1, 0 };

	@ObfuscatedName("i.v")
	public static int[] field105 = new int[] { 2, 1 };

	@ObfuscatedName("i.w")
	public static int[] field106 = new int[] { 3, 3 };

	@ObfuscatedName("i.x")
	public static final int[][] field107 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("i.y")
	public static final int[][] field108 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public class9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg7 != arg10 || arg7 != arg18 || arg7 != arg13) {
			field94 = false;
		}

		field95 = arg2;
		field96 = arg5;
		field97 = arg12;
		field98 = arg4;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field107[arg2];
		int var25 = var24.length;
		field84 = new int[var25];
		field85 = new int[var25];
		field86 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg8 * var20;
		int var29 = arg3 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg5 - arg5 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg5 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg5 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg7;
				var35 = arg0;
				var36 = arg14;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg7 + arg10 >> 1;
				var35 = arg0 + arg6 >> 1;
				var36 = arg9 + arg14 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg10;
				var35 = arg6;
				var36 = arg9;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg10 + arg18 >> 1;
				var35 = arg6 + arg15 >> 1;
				var36 = arg1 + arg9 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg18;
				var35 = arg15;
				var36 = arg1;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg13 + arg18 >> 1;
				var35 = arg11 + arg15 >> 1;
				var36 = arg1 + arg16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg13;
				var35 = arg11;
				var36 = arg16;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg7 + arg13 >> 1;
				var35 = arg0 + arg11 >> 1;
				var36 = arg14 + arg16 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg7 + arg10 >> 1;
				var35 = arg0 + arg6 >> 1;
				var36 = arg9 + arg14 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg10 + arg18 >> 1;
				var35 = arg6 + arg15 >> 1;
				var36 = arg1 + arg9 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg13 + arg18 >> 1;
				var35 = arg11 + arg15 >> 1;
				var36 = arg1 + arg16 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg13 >> 1;
				var35 = arg0 + arg11 >> 1;
				var36 = arg14 + arg16 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg7;
				var35 = arg0;
				var36 = arg14;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg10;
				var35 = arg6;
				var36 = arg9;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg18;
				var35 = arg15;
				var36 = arg1;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg13;
				var35 = arg11;
				var36 = arg16;
			}

			field84[var30] = var32;
			field85[var30] = var34;
			field86[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field108[arg2];
		int var38 = var37.length / 4;
		field90 = new int[var38];
		field91 = new int[var38];
		field92 = new int[var38];
		field87 = new int[var38];
		field88 = new int[var38];
		field89 = new int[var38];

		if (arg17 != -1) {
			field93 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg5 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg5 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg5 & 0x3;
			}

			field90[var40] = var42;
			field91[var40] = var43;
			field92[var40] = var44;

			if (var41 == 0) {
				field87[var40] = var26[var42];
				field88[var40] = var26[var43];
				field89[var40] = var26[var44];

				if (field93 != null) {
					field93[var40] = -1;
				}
			} else {
				field87[var40] = var27[var42];
				field88[var40] = var27[var43];
				field89[var40] = var27[var44];

				if (field93 != null) {
					field93[var40] = arg17;
				}
			}
		}

		int var45 = arg7;
		int var46 = arg10;

		if (arg10 < arg7) {
			var45 = arg10;
		}

		if (arg10 > arg10) {
			var46 = arg10;
		}

		if (arg18 < var45) {
			var45 = arg18;
		}

		if (arg18 > var46) {
			var46 = arg18;
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
