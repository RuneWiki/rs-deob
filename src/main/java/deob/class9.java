package deob;

@ObfuscatedName("i")
public final class class9 {

	@ObfuscatedName("i.a")
	public int[] field150;

	@ObfuscatedName("i.b")
	public int[] field151;

	@ObfuscatedName("i.c")
	public int[] field152;

	@ObfuscatedName("i.d")
	public int[] field153;

	@ObfuscatedName("i.e")
	public int[] field154;

	@ObfuscatedName("i.f")
	public int[] field155;

	@ObfuscatedName("i.g")
	public int[] field156;

	@ObfuscatedName("i.h")
	public int[] field157;

	@ObfuscatedName("i.i")
	public int[] field158;

	@ObfuscatedName("i.j")
	public int[] field159;

	@ObfuscatedName("i.k")
	public boolean field160 = true;

	@ObfuscatedName("i.l")
	public int field161;

	@ObfuscatedName("i.m")
	public int field162;

	@ObfuscatedName("i.n")
	public int field163;

	@ObfuscatedName("i.o")
	public int field164;

	@ObfuscatedName("i.p")
	public static int[] field165 = new int[6];

	@ObfuscatedName("i.q")
	public static int[] field166 = new int[6];

	@ObfuscatedName("i.r")
	public static int[] field167 = new int[6];

	@ObfuscatedName("i.s")
	public static int[] field168 = new int[6];

	@ObfuscatedName("i.t")
	public static int[] field169 = new int[6];

	@ObfuscatedName("i.u")
	public static int[] field170 = new int[] { 1, 0 };

	@ObfuscatedName("i.v")
	public static int[] field171 = new int[] { 2, 1 };

	@ObfuscatedName("i.w")
	public static int[] field172 = new int[] { 3, 3 };

	@ObfuscatedName("i.x")
	public static final int[][] field173 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("i.y")
	public static final int[][] field174 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public class9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg7 != arg15 || arg14 != arg15 || arg4 != arg15) {
			field160 = false;
		}

		field161 = arg13;
		field162 = arg3;
		field163 = arg16;
		field164 = arg5;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field173[arg13];
		int var25 = var24.length;
		field150 = new int[var25];
		field151 = new int[var25];
		field152 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg0 * var20;
		int var29 = arg11 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg3 - arg3 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg3 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg3 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg15;
				var35 = arg9;
				var36 = arg10;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg7 + arg15 >> 1;
				var35 = arg9 + arg17 >> 1;
				var36 = arg6 + arg10 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg7;
				var35 = arg17;
				var36 = arg6;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg14 >> 1;
				var35 = arg17 + arg18 >> 1;
				var36 = arg1 + arg6 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg14;
				var35 = arg18;
				var36 = arg1;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg4 + arg14 >> 1;
				var35 = arg12 + arg18 >> 1;
				var36 = arg1 + arg2 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg4;
				var35 = arg12;
				var36 = arg2;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg4 + arg15 >> 1;
				var35 = arg9 + arg12 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg7 + arg15 >> 1;
				var35 = arg9 + arg17 >> 1;
				var36 = arg6 + arg10 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg14 >> 1;
				var35 = arg17 + arg18 >> 1;
				var36 = arg1 + arg6 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg4 + arg14 >> 1;
				var35 = arg12 + arg18 >> 1;
				var36 = arg1 + arg2 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg4 + arg15 >> 1;
				var35 = arg9 + arg12 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg15;
				var35 = arg9;
				var36 = arg10;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg7;
				var35 = arg17;
				var36 = arg6;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg14;
				var35 = arg18;
				var36 = arg1;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg4;
				var35 = arg12;
				var36 = arg2;
			}

			field150[var30] = var32;
			field151[var30] = var34;
			field152[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field174[arg13];
		int var38 = var37.length / 4;
		field156 = new int[var38];
		field157 = new int[var38];
		field158 = new int[var38];
		field153 = new int[var38];
		field154 = new int[var38];
		field155 = new int[var38];

		if (arg8 != -1) {
			field159 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg3 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg3 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg3 & 0x3;
			}

			field156[var40] = var42;
			field157[var40] = var43;
			field158[var40] = var44;

			if (var41 == 0) {
				field153[var40] = var26[var42];
				field154[var40] = var26[var43];
				field155[var40] = var26[var44];

				if (field159 != null) {
					field159[var40] = -1;
				}
			} else {
				field153[var40] = var27[var42];
				field154[var40] = var27[var43];
				field155[var40] = var27[var44];

				if (field159 != null) {
					field159[var40] = arg8;
				}
			}
		}

		int var45 = arg15;
		int var46 = arg7;

		if (arg7 < arg15) {
			var45 = arg7;
		}

		if (arg7 > arg7) {
			var46 = arg7;
		}

		if (arg14 < var45) {
			var45 = arg14;
		}

		if (arg14 > var46) {
			var46 = arg14;
		}

		if (arg4 < var45) {
			var45 = arg4;
		}

		if (arg4 > var46) {
			var46 = arg4;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
