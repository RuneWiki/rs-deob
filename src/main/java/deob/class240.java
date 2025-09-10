package deob;

@ObfuscatedName("jp")
public class class240 {

	@ObfuscatedName("jp.af")
	public static final int[][] field2864 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("jp.aw")
	public static final int[][] field2852 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	@ObfuscatedName("jp.at")
	public static float[] field2851 = new float[6];

	@ObfuscatedName("jp.ac")
	public static float[] field2858 = new float[6];

	@ObfuscatedName("jp.ap")
	public static float[] field2867 = new float[6];

	@ObfuscatedName("jp.aq")
	public static int[] field2856 = new int[6];

	@ObfuscatedName("jp.ao")
	public static int[] field2857 = new int[6];

	@ObfuscatedName("jp.as")
	public static int[] field2855 = new int[6];

	@ObfuscatedName("jp.al")
	public int[] field2859;

	@ObfuscatedName("jp.au")
	public int[] field2869;

	@ObfuscatedName("jp.ai")
	public int[] field2861;

	@ObfuscatedName("jp.aa")
	public int[] field2862;

	@ObfuscatedName("jp.am")
	public int[] field2863;

	@ObfuscatedName("jp.an")
	public int[] field2854;

	@ObfuscatedName("jp.ar")
	public int[] field2865;

	@ObfuscatedName("jp.ae")
	public int[] field2866;

	@ObfuscatedName("jp.ay")
	public int[] field2853;

	@ObfuscatedName("jp.ad")
	public int[] field2868;

	@ObfuscatedName("jp.ag")
	public boolean field2860 = true;

	@ObfuscatedName("jp.av")
	public int field2870;

	@ObfuscatedName("jp.ah")
	public int field2871;

	@ObfuscatedName("jp.ab")
	public int field2872;

	@ObfuscatedName("jp.ax")
	public int field2873;

	public class240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg5 != arg6 || arg5 != arg7 || arg5 != arg8) {
			this.field2860 = false;
		}
		this.field2870 = arg0;
		this.field2871 = arg1;
		this.field2872 = arg17;
		this.field2873 = arg18;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field2864[arg0];
		int var25 = var24.length;
		this.field2859 = new int[var25];
		this.field2869 = new int[var25];
		this.field2861 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg3 * var20;
		int var29 = arg4 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg1 - arg1 - 1 & 0x7) + 1;
			}
			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - 9 - arg1 & 0x3) + 9;
			}
			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - 13 - arg1 & 0x3) + 13;
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
				var35 = arg9;
				var36 = arg13;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg5 + arg6 >> 1;
				var35 = arg9 + arg10 >> 1;
				var36 = arg13 + arg14 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg6;
				var35 = arg10;
				var36 = arg14;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg6 + arg7 >> 1;
				var35 = arg10 + arg11 >> 1;
				var36 = arg14 + arg15 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg7;
				var35 = arg11;
				var36 = arg15;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg7 + arg8 >> 1;
				var35 = arg11 + arg12 >> 1;
				var36 = arg15 + arg16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg8;
				var35 = arg12;
				var36 = arg16;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg5 + arg8 >> 1;
				var35 = arg9 + arg12 >> 1;
				var36 = arg13 + arg16 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg5 + arg6 >> 1;
				var35 = arg9 + arg10 >> 1;
				var36 = arg13 + arg14 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg6 + arg7 >> 1;
				var35 = arg10 + arg11 >> 1;
				var36 = arg14 + arg15 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg7 + arg8 >> 1;
				var35 = arg11 + arg12 >> 1;
				var36 = arg15 + arg16 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg5 + arg8 >> 1;
				var35 = arg9 + arg12 >> 1;
				var36 = arg13 + arg16 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg5;
				var35 = arg9;
				var36 = arg13;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg6;
				var35 = arg10;
				var36 = arg14;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg7;
				var35 = arg11;
				var36 = arg15;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg8;
				var35 = arg12;
				var36 = arg16;
			}
			this.field2859[var30] = var32;
			this.field2869[var30] = var34;
			this.field2861[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}
		int[] var37 = field2852[arg0];
		int var38 = var37.length / 4;
		this.field2865 = new int[var38];
		this.field2866 = new int[var38];
		this.field2853 = new int[var38];
		this.field2862 = new int[var38];
		this.field2863 = new int[var38];
		this.field2854 = new int[var38];
		if (arg2 != -1) {
			this.field2868 = new int[var38];
		}
		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;
			if (var42 < 4) {
				var42 = var42 - arg1 & 0x3;
			}
			if (var43 < 4) {
				var43 = var43 - arg1 & 0x3;
			}
			if (var44 < 4) {
				var44 = var44 - arg1 & 0x3;
			}
			this.field2865[var40] = var42;
			this.field2866[var40] = var43;
			this.field2853[var40] = var44;
			if (var41 == 0) {
				this.field2862[var40] = var26[var42];
				this.field2863[var40] = var26[var43];
				this.field2854[var40] = var26[var44];
				if (this.field2868 != null) {
					this.field2868[var40] = -1;
				}
			} else {
				this.field2862[var40] = var27[var42];
				this.field2863[var40] = var27[var43];
				this.field2854[var40] = var27[var44];
				if (this.field2868 != null) {
					this.field2868[var40] = arg2;
				}
			}
		}
		int var45 = arg5;
		int var46 = arg6;
		if (arg6 < arg5) {
			var45 = arg6;
		}
		if (arg6 > arg6) {
			var46 = arg6;
		}
		if (arg7 < var45) {
			var45 = arg7;
		}
		if (arg7 > var46) {
			var46 = arg7;
		}
		if (arg8 < var45) {
			var45 = arg8;
		}
		if (arg8 > var46) {
			var46 = arg8;
		}
		int var47 = var45 / 14;
		int var48 = var46 / 14;
	}
}
