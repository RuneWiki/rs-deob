package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("JQCVNYYR")
public final class Ground {

	@ObfuscatedName("JQCVNYYR.l")
	public boolean field797 = true;

	@ObfuscatedName("JQCVNYYR.m")
	public int field798;

	@ObfuscatedName("JQCVNYYR.n")
	public int field799;

	@ObfuscatedName("JQCVNYYR.o")
	public int field800;

	@ObfuscatedName("JQCVNYYR.p")
	public int field801;

	@ObfuscatedName("JQCVNYYR.b")
	public int[] field787;

	@ObfuscatedName("JQCVNYYR.c")
	public int[] field788;

	@ObfuscatedName("JQCVNYYR.d")
	public int[] field789;

	@ObfuscatedName("JQCVNYYR.h")
	public int[] field793;

	@ObfuscatedName("JQCVNYYR.i")
	public int[] field794;

	@ObfuscatedName("JQCVNYYR.j")
	public int[] field795;

	@ObfuscatedName("JQCVNYYR.e")
	public int[] field790;

	@ObfuscatedName("JQCVNYYR.f")
	public int[] field791;

	@ObfuscatedName("JQCVNYYR.g")
	public int[] field792;

	@ObfuscatedName("JQCVNYYR.k")
	public int[] field796;

	@ObfuscatedName("JQCVNYYR.q")
	public static int[] field802 = new int[6];

	@ObfuscatedName("JQCVNYYR.r")
	public static int[] field803 = new int[6];

	@ObfuscatedName("JQCVNYYR.s")
	public static int[] field804 = new int[6];

	@ObfuscatedName("JQCVNYYR.t")
	public static int[] field805 = new int[6];

	@ObfuscatedName("JQCVNYYR.u")
	public static int[] field806 = new int[6];

	@ObfuscatedName("JQCVNYYR.v")
	public static int[] field807 = new int[] { 1, 0 };

	@ObfuscatedName("JQCVNYYR.w")
	public static int[] field808 = new int[] { 2, 1 };

	@ObfuscatedName("JQCVNYYR.x")
	public static int[] field809 = new int[] { 3, 3 };

	@ObfuscatedName("JQCVNYYR.y")
	public static final int[][] field810 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("JQCVNYYR.z")
	public static final int[][] field811 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public Ground(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg3 != arg12 || arg2 != arg3 || arg0 != arg3) {
			field797 = false;
		}

		field798 = arg11;
		field799 = arg18;
		field800 = arg15;
		field801 = arg7;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field810[arg11];
		int var25 = var24.length;
		field787 = new int[var25];
		field788 = new int[var25];
		field789 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg4 * var20;
		int var29 = arg17 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg18 - arg18 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg18 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg18 - 13 & 0x3) + 13;
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
				var35 = arg10;
				var36 = arg1;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg3 + arg12 >> 1;
				var35 = arg8 + arg10 >> 1;
				var36 = arg1 + arg16 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg12;
				var35 = arg8;
				var36 = arg16;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg2 + arg12 >> 1;
				var35 = arg5 + arg8 >> 1;
				var36 = arg9 + arg16 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg2;
				var35 = arg5;
				var36 = arg9;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg0 + arg2 >> 1;
				var35 = arg5 + arg6 >> 1;
				var36 = arg9 + arg13 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg0;
				var35 = arg6;
				var36 = arg13;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg0 + arg3 >> 1;
				var35 = arg6 + arg10 >> 1;
				var36 = arg1 + arg13 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg3 + arg12 >> 1;
				var35 = arg8 + arg10 >> 1;
				var36 = arg1 + arg16 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg2 + arg12 >> 1;
				var35 = arg5 + arg8 >> 1;
				var36 = arg9 + arg16 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg0 + arg2 >> 1;
				var35 = arg5 + arg6 >> 1;
				var36 = arg9 + arg13 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg3 >> 1;
				var35 = arg6 + arg10 >> 1;
				var36 = arg1 + arg13 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg3;
				var35 = arg10;
				var36 = arg1;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg12;
				var35 = arg8;
				var36 = arg16;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg2;
				var35 = arg5;
				var36 = arg9;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg0;
				var35 = arg6;
				var36 = arg13;
			}

			field787[var30] = var32;
			field788[var30] = var34;
			field789[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field811[arg11];
		int var38 = var37.length / 4;
		field793 = new int[var38];
		field794 = new int[var38];
		field795 = new int[var38];
		field790 = new int[var38];
		field791 = new int[var38];
		field792 = new int[var38];

		if (arg14 != -1) {
			field796 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg18 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg18 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg18 & 0x3;
			}

			field793[var40] = var42;
			field794[var40] = var43;
			field795[var40] = var44;

			if (var41 == 0) {
				field790[var40] = var26[var42];
				field791[var40] = var26[var43];
				field792[var40] = var26[var44];

				if (field796 != null) {
					field796[var40] = -1;
				}
			} else {
				field790[var40] = var27[var42];
				field791[var40] = var27[var43];
				field792[var40] = var27[var44];

				if (field796 != null) {
					field796[var40] = arg14;
				}
			}
		}

		int var45 = arg3;
		int var46 = arg12;

		if (arg12 < arg3) {
			var45 = arg12;
		}

		if (arg12 > arg12) {
			var46 = arg12;
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
