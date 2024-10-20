package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

public abstract class Nat192 {

    public static final long M = 4294967295L;

    public static int[] create() {
        return new int[6];
    }

    public static int add(int[] arg0, int[] arg1, int[] arg2) {
        long var3 = 0L;
        long var5 = ((long) arg0[0] & 0xFFFFFFFFL) + ((long) arg1[0] & 0xFFFFFFFFL) + var3;
        arg2[0] = (int) var5;
        long var7 = var5 >>> 32;
        long var9 = ((long) arg0[1] & 0xFFFFFFFFL) + ((long) arg1[1] & 0xFFFFFFFFL) + var7;
        arg2[1] = (int) var9;
        long var11 = var9 >>> 32;
        long var13 = ((long) arg0[2] & 0xFFFFFFFFL) + ((long) arg1[2] & 0xFFFFFFFFL) + var11;
        arg2[2] = (int) var13;
        long var15 = var13 >>> 32;
        long var17 = ((long) arg0[3] & 0xFFFFFFFFL) + ((long) arg1[3] & 0xFFFFFFFFL) + var15;
        arg2[3] = (int) var17;
        long var19 = var17 >>> 32;
        long var21 = ((long) arg0[4] & 0xFFFFFFFFL) + ((long) arg1[4] & 0xFFFFFFFFL) + var19;
        arg2[4] = (int) var21;
        long var23 = var21 >>> 32;
        long var25 = ((long) arg0[5] & 0xFFFFFFFFL) + ((long) arg1[5] & 0xFFFFFFFFL) + var23;
        arg2[5] = (int) var25;
        long var27 = var25 >>> 32;
        return (int) var27;
    }

    public static void square(int[] arg0, int[] arg1) {
        long var2 = (long) arg0[0] & 0xFFFFFFFFL;
        int var4 = 0;
        int var5 = 5;
        int var6 = 12;
        do {
            long var7 = (long) arg0[var5--] & 0xFFFFFFFFL;
            long var9 = var7 * var7;
            var6--;
            arg1[var6] = var4 << 31 | (int) (var9 >>> 33);
            var6--;
            arg1[var6] = (int) (var9 >>> 1);
            var4 = (int) var9;
        } while (var5 > 0);
        long var11 = var2 * var2;
        long var13 = (long) (var4 << 31) & 0xFFFFFFFFL | var11 >>> 33;
        arg1[0] = (int) var11;
        int var15 = (int) (var11 >>> 32) & 0x1;
        long var16 = (long) arg0[1] & 0xFFFFFFFFL;
        long var18 = (long) arg1[2] & 0xFFFFFFFFL;
        long var20 = var2 * var16 + var13;
        int var22 = (int) var20;
        arg1[1] = var22 << 1 | var15;
        int var23 = var22 >>> 31;
        long var24 = (var20 >>> 32) + var18;
        long var26 = (long) arg0[2] & 0xFFFFFFFFL;
        long var28 = (long) arg1[3] & 0xFFFFFFFFL;
        long var30 = (long) arg1[4] & 0xFFFFFFFFL;
        long var32 = var2 * var26 + var24;
        int var34 = (int) var32;
        arg1[2] = var34 << 1 | var23;
        int var35 = var34 >>> 31;
        long var36 = (var32 >>> 32) + var16 * var26 + var28;
        long var38 = (var36 >>> 32) + var30;
        long var40 = var36 & 0xFFFFFFFFL;
        long var42 = (long) arg0[3] & 0xFFFFFFFFL;
        long var44 = (var38 >>> 32) + ((long) arg1[5] & 0xFFFFFFFFL);
        long var46 = var38 & 0xFFFFFFFFL;
        long var48 = (var44 >>> 32) + ((long) arg1[6] & 0xFFFFFFFFL);
        long var50 = var44 & 0xFFFFFFFFL;
        long var52 = var2 * var42 + var40;
        int var54 = (int) var52;
        arg1[3] = var54 << 1 | var35;
        int var55 = var54 >>> 31;
        long var56 = (var52 >>> 32) + var16 * var42 + var46;
        long var58 = (var56 >>> 32) + var26 * var42 + var50;
        long var60 = var56 & 0xFFFFFFFFL;
        long var62 = (var58 >>> 32) + var48;
        long var64 = var58 & 0xFFFFFFFFL;
        long var66 = (long) arg0[4] & 0xFFFFFFFFL;
        long var68 = (var62 >>> 32) + ((long) arg1[7] & 0xFFFFFFFFL);
        long var70 = var62 & 0xFFFFFFFFL;
        long var72 = (var68 >>> 32) + ((long) arg1[8] & 0xFFFFFFFFL);
        long var74 = var68 & 0xFFFFFFFFL;
        long var76 = var2 * var66 + var60;
        int var78 = (int) var76;
        arg1[4] = var78 << 1 | var55;
        int var79 = var78 >>> 31;
        long var80 = (var76 >>> 32) + var16 * var66 + var64;
        long var82 = (var80 >>> 32) + var26 * var66 + var70;
        long var84 = var80 & 0xFFFFFFFFL;
        long var86 = (var82 >>> 32) + var42 * var66 + var74;
        long var88 = var82 & 0xFFFFFFFFL;
        long var90 = (var86 >>> 32) + var72;
        long var92 = var86 & 0xFFFFFFFFL;
        long var94 = (long) arg0[5] & 0xFFFFFFFFL;
        long var96 = (var90 >>> 32) + ((long) arg1[9] & 0xFFFFFFFFL);
        long var98 = var90 & 0xFFFFFFFFL;
        long var100 = (var96 >>> 32) + ((long) arg1[10] & 0xFFFFFFFFL);
        long var102 = var96 & 0xFFFFFFFFL;
        long var104 = var2 * var94 + var84;
        int var106 = (int) var104;
        arg1[5] = var106 << 1 | var79;
        int var107 = var106 >>> 31;
        long var108 = (var104 >>> 32) + var16 * var94 + var88;
        long var110 = (var108 >>> 32) + var26 * var94 + var92;
        long var112 = (var110 >>> 32) + var42 * var94 + var98;
        long var114 = (var112 >>> 32) + var66 * var94 + var102;
        long var116 = (var114 >>> 32) + var100;
        int var118 = (int) var108;
        arg1[6] = var118 << 1 | var107;
        int var119 = var118 >>> 31;
        int var120 = (int) var110;
        arg1[7] = var120 << 1 | var119;
        int var121 = var120 >>> 31;
        int var122 = (int) var112;
        arg1[8] = var122 << 1 | var121;
        int var123 = var122 >>> 31;
        int var124 = (int) var114;
        arg1[9] = var124 << 1 | var123;
        int var125 = var124 >>> 31;
        int var126 = (int) var116;
        arg1[10] = var126 << 1 | var125;
        int var127 = var126 >>> 31;
        int var128 = arg1[11] + (int) (var116 >>> 32);
        arg1[11] = var128 << 1 | var127;
    }

    public static int addTo(int[] arg0, int[] arg1) {
        long var2 = 0L;
        long var4 = ((long) arg0[0] & 0xFFFFFFFFL) + ((long) arg1[0] & 0xFFFFFFFFL) + var2;
        arg1[0] = (int) var4;
        long var6 = var4 >>> 32;
        long var8 = ((long) arg0[1] & 0xFFFFFFFFL) + ((long) arg1[1] & 0xFFFFFFFFL) + var6;
        arg1[1] = (int) var8;
        long var10 = var8 >>> 32;
        long var12 = ((long) arg0[2] & 0xFFFFFFFFL) + ((long) arg1[2] & 0xFFFFFFFFL) + var10;
        arg1[2] = (int) var12;
        long var14 = var12 >>> 32;
        long var16 = ((long) arg0[3] & 0xFFFFFFFFL) + ((long) arg1[3] & 0xFFFFFFFFL) + var14;
        arg1[3] = (int) var16;
        long var18 = var16 >>> 32;
        long var20 = ((long) arg0[4] & 0xFFFFFFFFL) + ((long) arg1[4] & 0xFFFFFFFFL) + var18;
        arg1[4] = (int) var20;
        long var22 = var20 >>> 32;
        long var24 = ((long) arg0[5] & 0xFFFFFFFFL) + ((long) arg1[5] & 0xFFFFFFFFL) + var22;
        arg1[5] = (int) var24;
        long var26 = var24 >>> 32;
        return (int) var26;
    }

    public static int mulWord(int arg0, int[] arg1, int[] arg2, int arg3) {
        long var4 = 0L;
        long var6 = (long) arg0 & 0xFFFFFFFFL;
        int var8 = 0;
        do {
            long var9 = ((long) arg1[var8] & 0xFFFFFFFFL) * var6 + var4;
            arg2[arg3 + var8] = (int) var9;
            var4 = var9 >>> 32;
            var8++;
        } while (var8 < 6);
        return (int) var4;
    }

    public static int addToEachOther(int[] arg0, int arg1, int[] arg2, int arg3) {
        long var4 = 0L;
        long var6 = ((long) arg0[arg1] & 0xFFFFFFFFL) + ((long) arg2[arg3] & 0xFFFFFFFFL) + var4;
        arg0[arg1] = (int) var6;
        arg2[arg3] = (int) var6;
        long var8 = var6 >>> 32;
        long var10 = ((long) arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var8;
        arg0[arg1 + 1] = (int) var10;
        arg2[arg3 + 1] = (int) var10;
        long var12 = var10 >>> 32;
        long var14 = ((long) arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 2] & 0xFFFFFFFFL) + var12;
        arg0[arg1 + 2] = (int) var14;
        arg2[arg3 + 2] = (int) var14;
        long var16 = var14 >>> 32;
        long var18 = ((long) arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 3] & 0xFFFFFFFFL) + var16;
        arg0[arg1 + 3] = (int) var18;
        arg2[arg3 + 3] = (int) var18;
        long var20 = var18 >>> 32;
        long var22 = ((long) arg0[arg1 + 4] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 4] & 0xFFFFFFFFL) + var20;
        arg0[arg1 + 4] = (int) var22;
        arg2[arg3 + 4] = (int) var22;
        long var24 = var22 >>> 32;
        long var26 = ((long) arg0[arg1 + 5] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 5] & 0xFFFFFFFFL) + var24;
        arg0[arg1 + 5] = (int) var26;
        arg2[arg3 + 5] = (int) var26;
        long var28 = var26 >>> 32;
        return (int) var28;
    }

    public static boolean eq64(long[] arg0, long[] arg1) {
        for (int var2 = 2; var2 >= 0; var2--) {
            if (arg0[var2] != arg1[var2]) {
                return false;
            }
        }
        return true;
    }

    public static int addTo(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        long var5 = (long) arg4 & 0xFFFFFFFFL;
        long var7 = ((long) arg0[arg1] & 0xFFFFFFFFL) + ((long) arg2[arg3] & 0xFFFFFFFFL) + var5;
        arg2[arg3] = (int) var7;
        long var9 = var7 >>> 32;
        long var11 = ((long) arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var9;
        arg2[arg3 + 1] = (int) var11;
        long var13 = var11 >>> 32;
        long var15 = ((long) arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 2] & 0xFFFFFFFFL) + var13;
        arg2[arg3 + 2] = (int) var15;
        long var17 = var15 >>> 32;
        long var19 = ((long) arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 3] & 0xFFFFFFFFL) + var17;
        arg2[arg3 + 3] = (int) var19;
        long var21 = var19 >>> 32;
        long var23 = ((long) arg0[arg1 + 4] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 4] & 0xFFFFFFFFL) + var21;
        arg2[arg3 + 4] = (int) var23;
        long var25 = var23 >>> 32;
        long var27 = ((long) arg0[arg1 + 5] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 5] & 0xFFFFFFFFL) + var25;
        arg2[arg3 + 5] = (int) var27;
        long var29 = var27 >>> 32;
        return (int) var29;
    }

    public static int subFrom(int[] arg0, int[] arg1) {
        long var2 = 0L;
        long var4 = ((long) arg1[0] & 0xFFFFFFFFL) - ((long) arg0[0] & 0xFFFFFFFFL) + var2;
        arg1[0] = (int) var4;
        long var6 = var4 >> 32;
        long var8 = ((long) arg1[1] & 0xFFFFFFFFL) - ((long) arg0[1] & 0xFFFFFFFFL) + var6;
        arg1[1] = (int) var8;
        long var10 = var8 >> 32;
        long var12 = ((long) arg1[2] & 0xFFFFFFFFL) - ((long) arg0[2] & 0xFFFFFFFFL) + var10;
        arg1[2] = (int) var12;
        long var14 = var12 >> 32;
        long var16 = ((long) arg1[3] & 0xFFFFFFFFL) - ((long) arg0[3] & 0xFFFFFFFFL) + var14;
        arg1[3] = (int) var16;
        long var18 = var16 >> 32;
        long var20 = ((long) arg1[4] & 0xFFFFFFFFL) - ((long) arg0[4] & 0xFFFFFFFFL) + var18;
        arg1[4] = (int) var20;
        long var22 = var20 >> 32;
        long var24 = ((long) arg1[5] & 0xFFFFFFFFL) - ((long) arg0[5] & 0xFFFFFFFFL) + var22;
        arg1[5] = (int) var24;
        long var26 = var24 >> 32;
        return (int) var26;
    }

    public static long[] create64() {
        return new long[3];
    }

    public static boolean diff(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        boolean var6 = gte(arg0, arg1, arg2, arg3);
        if (var6) {
            sub(arg0, arg1, arg2, arg3, arg4, arg5);
        } else {
            sub(arg2, arg3, arg0, arg1, arg4, arg5);
        }
        return var6;
    }

    public static int mulAddTo(int[] arg0, int[] arg1, int[] arg2) {
        long var3 = (long) arg1[0] & 0xFFFFFFFFL;
        long var5 = (long) arg1[1] & 0xFFFFFFFFL;
        long var7 = (long) arg1[2] & 0xFFFFFFFFL;
        long var9 = (long) arg1[3] & 0xFFFFFFFFL;
        long var11 = (long) arg1[4] & 0xFFFFFFFFL;
        long var13 = (long) arg1[5] & 0xFFFFFFFFL;
        long var15 = 0L;
        for (int var17 = 0; var17 < 6; var17++) {
            long var18 = 0L;
            long var20 = (long) arg0[var17] & 0xFFFFFFFFL;
            long var22 = ((long) arg2[var17] & 0xFFFFFFFFL) + var3 * var20 + var18;
            arg2[var17] = (int) var22;
            long var24 = var22 >>> 32;
            long var26 = ((long) arg2[var17 + 1] & 0xFFFFFFFFL) + var5 * var20 + var24;
            arg2[var17 + 1] = (int) var26;
            long var28 = var26 >>> 32;
            long var30 = ((long) arg2[var17 + 2] & 0xFFFFFFFFL) + var7 * var20 + var28;
            arg2[var17 + 2] = (int) var30;
            long var32 = var30 >>> 32;
            long var34 = ((long) arg2[var17 + 3] & 0xFFFFFFFFL) + var9 * var20 + var32;
            arg2[var17 + 3] = (int) var34;
            long var36 = var34 >>> 32;
            long var38 = ((long) arg2[var17 + 4] & 0xFFFFFFFFL) + var11 * var20 + var36;
            arg2[var17 + 4] = (int) var38;
            long var40 = var38 >>> 32;
            long var42 = ((long) arg2[var17 + 5] & 0xFFFFFFFFL) + var13 * var20 + var40;
            arg2[var17 + 5] = (int) var42;
            long var44 = var42 >>> 32;
            long var46 = ((long) arg2[var17 + 6] & 0xFFFFFFFFL) + var15 + var44;
            arg2[var17 + 6] = (int) var46;
            var15 = var46 >>> 32;
        }
        return (int) var15;
    }

    public static void copy64(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0];
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
    }

    public static boolean eq(int[] arg0, int[] arg1) {
        for (int var2 = 5; var2 >= 0; var2--) {
            if (arg0[var2] != arg1[var2]) {
                return false;
            }
        }
        return true;
    }

    public static int subFrom(int[] arg0, int arg1, int[] arg2, int arg3) {
        long var4 = 0L;
        long var6 = ((long) arg2[arg3] & 0xFFFFFFFFL) - ((long) arg0[arg1] & 0xFFFFFFFFL) + var4;
        arg2[arg3] = (int) var6;
        long var8 = var6 >> 32;
        long var10 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) - ((long) arg0[arg1 + 1] & 0xFFFFFFFFL) + var8;
        arg2[arg3 + 1] = (int) var10;
        long var12 = var10 >> 32;
        long var14 = ((long) arg2[arg3 + 2] & 0xFFFFFFFFL) - ((long) arg0[arg1 + 2] & 0xFFFFFFFFL) + var12;
        arg2[arg3 + 2] = (int) var14;
        long var16 = var14 >> 32;
        long var18 = ((long) arg2[arg3 + 3] & 0xFFFFFFFFL) - ((long) arg0[arg1 + 3] & 0xFFFFFFFFL) + var16;
        arg2[arg3 + 3] = (int) var18;
        long var20 = var18 >> 32;
        long var22 = ((long) arg2[arg3 + 4] & 0xFFFFFFFFL) - ((long) arg0[arg1 + 4] & 0xFFFFFFFFL) + var20;
        arg2[arg3 + 4] = (int) var22;
        long var24 = var22 >> 32;
        long var26 = ((long) arg2[arg3 + 5] & 0xFFFFFFFFL) - ((long) arg0[arg1 + 5] & 0xFFFFFFFFL) + var24;
        arg2[arg3 + 5] = (int) var26;
        long var28 = var26 >> 32;
        return (int) var28;
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        if (arg0.signum() < 0 || arg0.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] var1 = create();
        int var2 = 0;
        while (arg0.signum() != 0) {
            var1[var2++] = arg0.intValue();
            arg0 = arg0.shiftRight(32);
        }
        return var1;
    }

    public static long[] fromBigInteger64(BigInteger arg0) {
        if (arg0.signum() < 0 || arg0.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] var1 = create64();
        int var2 = 0;
        while (arg0.signum() != 0) {
            var1[var2++] = arg0.longValue();
            arg0 = arg0.shiftRight(64);
        }
        return var1;
    }

    public static int getBit(int[] arg0, int arg1) {
        if (arg1 == 0) {
            return arg0[0] & 0x1;
        }
        int var2 = arg1 >> 5;
        if (var2 >= 0 && var2 < 6) {
            int var3 = arg1 & 0x1F;
            return arg0[var2] >>> var3 & 0x1;
        } else {
            return 0;
        }
    }

    public static boolean isZero64(long[] arg0) {
        for (int var1 = 0; var1 < 3; var1++) {
            if (arg0[var1] != 0L) {
                return false;
            }
        }
        return true;
    }

    public static boolean gte(int[] arg0, int[] arg1) {
        for (int var2 = 5; var2 >= 0; var2--) {
            int var3 = arg0[var2] ^ Integer.MIN_VALUE;
            int var4 = arg1[var2] ^ Integer.MIN_VALUE;
            if (var3 < var4) {
                return false;
            }
            if (var3 > var4) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] arg0) {
        if (arg0[0] != 1) {
            return false;
        }
        for (int var1 = 1; var1 < 6; var1++) {
            if (arg0[var1] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] arg0) {
        if (arg0[0] != 1L) {
            return false;
        }
        for (int var1 = 1; var1 < 3; var1++) {
            if (arg0[var1] != 0L) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] arg0) {
        for (int var1 = 0; var1 < 6; var1++) {
            if (arg0[var1] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean gte(int[] arg0, int arg1, int[] arg2, int arg3) {
        for (int var4 = 5; var4 >= 0; var4--) {
            int var5 = arg0[arg1 + var4] ^ Integer.MIN_VALUE;
            int var6 = arg2[arg3 + var4] ^ Integer.MIN_VALUE;
            if (var5 < var6) {
                return false;
            }
            if (var5 > var6) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] arg0, int[] arg1, int[] arg2) {
        long var3 = (long) arg1[0] & 0xFFFFFFFFL;
        long var5 = (long) arg1[1] & 0xFFFFFFFFL;
        long var7 = (long) arg1[2] & 0xFFFFFFFFL;
        long var9 = (long) arg1[3] & 0xFFFFFFFFL;
        long var11 = (long) arg1[4] & 0xFFFFFFFFL;
        long var13 = (long) arg1[5] & 0xFFFFFFFFL;
        long var15 = 0L;
        long var17 = (long) arg0[0] & 0xFFFFFFFFL;
        long var19 = var3 * var17 + var15;
        arg2[0] = (int) var19;
        long var21 = var19 >>> 32;
        long var23 = var5 * var17 + var21;
        arg2[1] = (int) var23;
        long var25 = var23 >>> 32;
        long var27 = var7 * var17 + var25;
        arg2[2] = (int) var27;
        long var29 = var27 >>> 32;
        long var31 = var9 * var17 + var29;
        arg2[3] = (int) var31;
        long var33 = var31 >>> 32;
        long var35 = var11 * var17 + var33;
        arg2[4] = (int) var35;
        long var37 = var35 >>> 32;
        long var39 = var13 * var17 + var37;
        arg2[5] = (int) var39;
        long var41 = var39 >>> 32;
        arg2[6] = (int) var41;
        for (int var43 = 1; var43 < 6; var43++) {
            long var44 = 0L;
            long var46 = (long) arg0[var43] & 0xFFFFFFFFL;
            long var48 = ((long) arg2[var43] & 0xFFFFFFFFL) + var3 * var46 + var44;
            arg2[var43] = (int) var48;
            long var50 = var48 >>> 32;
            long var52 = ((long) arg2[var43 + 1] & 0xFFFFFFFFL) + var5 * var46 + var50;
            arg2[var43 + 1] = (int) var52;
            long var54 = var52 >>> 32;
            long var56 = ((long) arg2[var43 + 2] & 0xFFFFFFFFL) + var7 * var46 + var54;
            arg2[var43 + 2] = (int) var56;
            long var58 = var56 >>> 32;
            long var60 = ((long) arg2[var43 + 3] & 0xFFFFFFFFL) + var9 * var46 + var58;
            arg2[var43 + 3] = (int) var60;
            long var62 = var60 >>> 32;
            long var64 = ((long) arg2[var43 + 4] & 0xFFFFFFFFL) + var11 * var46 + var62;
            arg2[var43 + 4] = (int) var64;
            long var66 = var64 >>> 32;
            long var68 = ((long) arg2[var43 + 5] & 0xFFFFFFFFL) + var13 * var46 + var66;
            arg2[var43 + 5] = (int) var68;
            long var70 = var68 >>> 32;
            arg2[var43 + 6] = (int) var70;
        }
    }

    public static void mul(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = (long) arg2[arg3] & 0xFFFFFFFFL;
        long var8 = (long) arg2[arg3 + 1] & 0xFFFFFFFFL;
        long var10 = (long) arg2[arg3 + 2] & 0xFFFFFFFFL;
        long var12 = (long) arg2[arg3 + 3] & 0xFFFFFFFFL;
        long var14 = (long) arg2[arg3 + 4] & 0xFFFFFFFFL;
        long var16 = (long) arg2[arg3 + 5] & 0xFFFFFFFFL;
        long var18 = 0L;
        long var20 = (long) arg0[arg1] & 0xFFFFFFFFL;
        long var22 = var6 * var20 + var18;
        arg4[arg5] = (int) var22;
        long var24 = var22 >>> 32;
        long var26 = var8 * var20 + var24;
        arg4[arg5 + 1] = (int) var26;
        long var28 = var26 >>> 32;
        long var30 = var10 * var20 + var28;
        arg4[arg5 + 2] = (int) var30;
        long var32 = var30 >>> 32;
        long var34 = var12 * var20 + var32;
        arg4[arg5 + 3] = (int) var34;
        long var36 = var34 >>> 32;
        long var38 = var14 * var20 + var36;
        arg4[arg5 + 4] = (int) var38;
        long var40 = var38 >>> 32;
        long var42 = var16 * var20 + var40;
        arg4[arg5 + 5] = (int) var42;
        long var44 = var42 >>> 32;
        arg4[arg5 + 6] = (int) var44;
        for (int var46 = 1; var46 < 6; var46++) {
            arg5++;
            long var47 = 0L;
            long var49 = (long) arg0[arg1 + var46] & 0xFFFFFFFFL;
            long var51 = ((long) arg4[arg5] & 0xFFFFFFFFL) + var6 * var49 + var47;
            arg4[arg5] = (int) var51;
            long var53 = var51 >>> 32;
            long var55 = ((long) arg4[arg5 + 1] & 0xFFFFFFFFL) + var8 * var49 + var53;
            arg4[arg5 + 1] = (int) var55;
            long var57 = var55 >>> 32;
            long var59 = ((long) arg4[arg5 + 2] & 0xFFFFFFFFL) + var10 * var49 + var57;
            arg4[arg5 + 2] = (int) var59;
            long var61 = var59 >>> 32;
            long var63 = ((long) arg4[arg5 + 3] & 0xFFFFFFFFL) + var12 * var49 + var61;
            arg4[arg5 + 3] = (int) var63;
            long var65 = var63 >>> 32;
            long var67 = ((long) arg4[arg5 + 4] & 0xFFFFFFFFL) + var14 * var49 + var65;
            arg4[arg5 + 4] = (int) var67;
            long var69 = var67 >>> 32;
            long var71 = ((long) arg4[arg5 + 5] & 0xFFFFFFFFL) + var16 * var49 + var69;
            arg4[arg5 + 5] = (int) var71;
            long var73 = var71 >>> 32;
            arg4[arg5 + 6] = (int) var73;
        }
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
    }

    public static long mul33Add(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        long var7 = 0L;
        long var9 = (long) arg0 & 0xFFFFFFFFL;
        long var11 = (long) arg1[arg2] & 0xFFFFFFFFL;
        long var13 = ((long) arg3[arg4] & 0xFFFFFFFFL) + var9 * var11 + var7;
        arg5[arg6] = (int) var13;
        long var15 = var13 >>> 32;
        long var17 = (long) arg1[arg2 + 1] & 0xFFFFFFFFL;
        long var19 = ((long) arg3[arg4 + 1] & 0xFFFFFFFFL) + var9 * var17 + var11 + var15;
        arg5[arg6 + 1] = (int) var19;
        long var21 = var19 >>> 32;
        long var23 = (long) arg1[arg2 + 2] & 0xFFFFFFFFL;
        long var25 = ((long) arg3[arg4 + 2] & 0xFFFFFFFFL) + var9 * var23 + var17 + var21;
        arg5[arg6 + 2] = (int) var25;
        long var27 = var25 >>> 32;
        long var29 = (long) arg1[arg2 + 3] & 0xFFFFFFFFL;
        long var31 = ((long) arg3[arg4 + 3] & 0xFFFFFFFFL) + var9 * var29 + var23 + var27;
        arg5[arg6 + 3] = (int) var31;
        long var33 = var31 >>> 32;
        long var35 = (long) arg1[arg2 + 4] & 0xFFFFFFFFL;
        long var37 = ((long) arg3[arg4 + 4] & 0xFFFFFFFFL) + var9 * var35 + var29 + var33;
        arg5[arg6 + 4] = (int) var37;
        long var39 = var37 >>> 32;
        long var41 = (long) arg1[arg2 + 5] & 0xFFFFFFFFL;
        long var43 = ((long) arg3[arg4 + 5] & 0xFFFFFFFFL) + var9 * var41 + var35 + var39;
        arg5[arg6 + 5] = (int) var43;
        long var45 = var43 >>> 32;
        return var41 + var45;
    }

    public static int mulWordAddExt(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        long var5 = 0L;
        long var7 = (long) arg0 & 0xFFFFFFFFL;
        long var9 = ((long) arg3[arg4] & 0xFFFFFFFFL) + ((long) arg1[arg2] & 0xFFFFFFFFL) * var7 + var5;
        arg3[arg4] = (int) var9;
        long var11 = var9 >>> 32;
        long var13 = ((long) arg3[arg4 + 1] & 0xFFFFFFFFL) + ((long) arg1[arg2 + 1] & 0xFFFFFFFFL) * var7 + var11;
        arg3[arg4 + 1] = (int) var13;
        long var15 = var13 >>> 32;
        long var17 = ((long) arg3[arg4 + 2] & 0xFFFFFFFFL) + ((long) arg1[arg2 + 2] & 0xFFFFFFFFL) * var7 + var15;
        arg3[arg4 + 2] = (int) var17;
        long var19 = var17 >>> 32;
        long var21 = ((long) arg3[arg4 + 3] & 0xFFFFFFFFL) + ((long) arg1[arg2 + 3] & 0xFFFFFFFFL) * var7 + var19;
        arg3[arg4 + 3] = (int) var21;
        long var23 = var21 >>> 32;
        long var25 = ((long) arg3[arg4 + 4] & 0xFFFFFFFFL) + ((long) arg1[arg2 + 4] & 0xFFFFFFFFL) * var7 + var23;
        arg3[arg4 + 4] = (int) var25;
        long var27 = var25 >>> 32;
        long var29 = ((long) arg3[arg4 + 5] & 0xFFFFFFFFL) + ((long) arg1[arg2 + 5] & 0xFFFFFFFFL) * var7 + var27;
        arg3[arg4 + 5] = (int) var29;
        long var31 = var29 >>> 32;
        return (int) var31;
    }

    public static int mul33DWordAdd(int arg0, long arg1, int[] arg2, int arg3) {
        long var5 = 0L;
        long var7 = (long) arg0 & 0xFFFFFFFFL;
        long var9 = arg1 & 0xFFFFFFFFL;
        long var11 = ((long) arg2[arg3] & 0xFFFFFFFFL) + var7 * var9 + var5;
        arg2[arg3] = (int) var11;
        long var13 = var11 >>> 32;
        long var15 = arg1 >>> 32;
        long var17 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var7 * var15 + var9 + var13;
        arg2[arg3 + 1] = (int) var17;
        long var19 = var17 >>> 32;
        long var21 = ((long) arg2[arg3 + 2] & 0xFFFFFFFFL) + var15 + var19;
        arg2[arg3 + 2] = (int) var21;
        long var23 = var21 >>> 32;
        long var25 = ((long) arg2[arg3 + 3] & 0xFFFFFFFFL) + var23;
        arg2[arg3 + 3] = (int) var25;
        long var27 = var25 >>> 32;
        return var27 == 0L ? 0 : Nat.incAt(6, arg2, arg3, 4);
    }

    public static int mul33WordAdd(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = 0L;
        long var6 = (long) arg0 & 0xFFFFFFFFL;
        long var8 = (long) arg1 & 0xFFFFFFFFL;
        long var10 = ((long) arg2[arg3] & 0xFFFFFFFFL) + var6 * var8 + var4;
        arg2[arg3] = (int) var10;
        long var12 = var10 >>> 32;
        long var14 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var8 + var12;
        arg2[arg3 + 1] = (int) var14;
        long var16 = var14 >>> 32;
        long var18 = ((long) arg2[arg3 + 2] & 0xFFFFFFFFL) + var16;
        arg2[arg3 + 2] = (int) var18;
        long var20 = var18 >>> 32;
        return var20 == 0L ? 0 : Nat.incAt(6, arg2, arg3, 3);
    }

    public static int mulWordDwordAdd(int arg0, long arg1, int[] arg2, int arg3) {
        long var5 = 0L;
        long var7 = (long) arg0 & 0xFFFFFFFFL;
        long var9 = ((long) arg2[arg3] & 0xFFFFFFFFL) + (arg1 & 0xFFFFFFFFL) * var7 + var5;
        arg2[arg3] = (int) var9;
        long var11 = var9 >>> 32;
        long var13 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + (arg1 >>> 32) * var7 + var11;
        arg2[arg3 + 1] = (int) var13;
        long var15 = var13 >>> 32;
        long var17 = ((long) arg2[arg3 + 2] & 0xFFFFFFFFL) + var15;
        arg2[arg3 + 2] = (int) var17;
        long var19 = var17 >>> 32;
        return var19 == 0L ? 0 : Nat.incAt(6, arg2, arg3, 3);
    }

    public static BigInteger toBigInteger64(long[] arg0) {
        byte[] var1 = new byte[24];
        for (int var2 = 0; var2 < 3; var2++) {
            long var3 = arg0[var2];
            if (var3 != 0L) {
                Pack.longToBigEndian(var3, var1, 2 - var2 << 3);
            }
        }
        return new BigInteger(1, var1);
    }

    public static void square(int[] arg0, int arg1, int[] arg2, int arg3) {
        long var4 = (long) arg0[arg1] & 0xFFFFFFFFL;
        int var6 = 0;
        int var7 = 5;
        int var8 = 12;
        do {
            long var9 = (long) arg0[arg1 + var7--] & 0xFFFFFFFFL;
            long var11 = var9 * var9;
            var8--;
            arg2[arg3 + var8] = var6 << 31 | (int) (var11 >>> 33);
            var8--;
            arg2[arg3 + var8] = (int) (var11 >>> 1);
            var6 = (int) var11;
        } while (var7 > 0);
        long var13 = var4 * var4;
        long var15 = (long) (var6 << 31) & 0xFFFFFFFFL | var13 >>> 33;
        arg2[arg3] = (int) var13;
        int var17 = (int) (var13 >>> 32) & 0x1;
        long var18 = (long) arg0[arg1 + 1] & 0xFFFFFFFFL;
        long var20 = (long) arg2[arg3 + 2] & 0xFFFFFFFFL;
        long var22 = var4 * var18 + var15;
        int var24 = (int) var22;
        arg2[arg3 + 1] = var24 << 1 | var17;
        int var25 = var24 >>> 31;
        long var26 = (var22 >>> 32) + var20;
        long var28 = (long) arg0[arg1 + 2] & 0xFFFFFFFFL;
        long var30 = (long) arg2[arg3 + 3] & 0xFFFFFFFFL;
        long var32 = (long) arg2[arg3 + 4] & 0xFFFFFFFFL;
        long var34 = var4 * var28 + var26;
        int var36 = (int) var34;
        arg2[arg3 + 2] = var36 << 1 | var25;
        int var37 = var36 >>> 31;
        long var38 = (var34 >>> 32) + var18 * var28 + var30;
        long var40 = (var38 >>> 32) + var32;
        long var42 = var38 & 0xFFFFFFFFL;
        long var44 = (long) arg0[arg1 + 3] & 0xFFFFFFFFL;
        long var46 = (var40 >>> 32) + ((long) arg2[arg3 + 5] & 0xFFFFFFFFL);
        long var48 = var40 & 0xFFFFFFFFL;
        long var50 = (var46 >>> 32) + ((long) arg2[arg3 + 6] & 0xFFFFFFFFL);
        long var52 = var46 & 0xFFFFFFFFL;
        long var54 = var4 * var44 + var42;
        int var56 = (int) var54;
        arg2[arg3 + 3] = var56 << 1 | var37;
        int var57 = var56 >>> 31;
        long var58 = (var54 >>> 32) + var18 * var44 + var48;
        long var60 = (var58 >>> 32) + var28 * var44 + var52;
        long var62 = var58 & 0xFFFFFFFFL;
        long var64 = (var60 >>> 32) + var50;
        long var66 = var60 & 0xFFFFFFFFL;
        long var68 = (long) arg0[arg1 + 4] & 0xFFFFFFFFL;
        long var70 = (var64 >>> 32) + ((long) arg2[arg3 + 7] & 0xFFFFFFFFL);
        long var72 = var64 & 0xFFFFFFFFL;
        long var74 = (var70 >>> 32) + ((long) arg2[arg3 + 8] & 0xFFFFFFFFL);
        long var76 = var70 & 0xFFFFFFFFL;
        long var78 = var4 * var68 + var62;
        int var80 = (int) var78;
        arg2[arg3 + 4] = var80 << 1 | var57;
        int var81 = var80 >>> 31;
        long var82 = (var78 >>> 32) + var18 * var68 + var66;
        long var84 = (var82 >>> 32) + var28 * var68 + var72;
        long var86 = var82 & 0xFFFFFFFFL;
        long var88 = (var84 >>> 32) + var44 * var68 + var76;
        long var90 = var84 & 0xFFFFFFFFL;
        long var92 = (var88 >>> 32) + var74;
        long var94 = var88 & 0xFFFFFFFFL;
        long var96 = (long) arg0[arg1 + 5] & 0xFFFFFFFFL;
        long var98 = (var92 >>> 32) + ((long) arg2[arg3 + 9] & 0xFFFFFFFFL);
        long var100 = var92 & 0xFFFFFFFFL;
        long var102 = (var98 >>> 32) + ((long) arg2[arg3 + 10] & 0xFFFFFFFFL);
        long var104 = var98 & 0xFFFFFFFFL;
        long var106 = var4 * var96 + var86;
        int var108 = (int) var106;
        arg2[arg3 + 5] = var108 << 1 | var81;
        int var109 = var108 >>> 31;
        long var110 = (var106 >>> 32) + var18 * var96 + var90;
        long var112 = (var110 >>> 32) + var28 * var96 + var94;
        long var114 = (var112 >>> 32) + var44 * var96 + var100;
        long var116 = (var114 >>> 32) + var68 * var96 + var104;
        long var118 = (var116 >>> 32) + var102;
        int var120 = (int) var110;
        arg2[arg3 + 6] = var120 << 1 | var109;
        int var121 = var120 >>> 31;
        int var122 = (int) var112;
        arg2[arg3 + 7] = var122 << 1 | var121;
        int var123 = var122 >>> 31;
        int var124 = (int) var114;
        arg2[arg3 + 8] = var124 << 1 | var123;
        int var125 = var124 >>> 31;
        int var126 = (int) var116;
        arg2[arg3 + 9] = var126 << 1 | var125;
        int var127 = var126 >>> 31;
        int var128 = (int) var118;
        arg2[arg3 + 10] = var128 << 1 | var127;
        int var129 = var128 >>> 31;
        int var130 = arg2[arg3 + 11] + (int) (var118 >>> 32);
        arg2[arg3 + 11] = var130 << 1 | var129;
    }

    public static int sub(int[] arg0, int[] arg1, int[] arg2) {
        long var3 = 0L;
        long var5 = ((long) arg0[0] & 0xFFFFFFFFL) - ((long) arg1[0] & 0xFFFFFFFFL) + var3;
        arg2[0] = (int) var5;
        long var7 = var5 >> 32;
        long var9 = ((long) arg0[1] & 0xFFFFFFFFL) - ((long) arg1[1] & 0xFFFFFFFFL) + var7;
        arg2[1] = (int) var9;
        long var11 = var9 >> 32;
        long var13 = ((long) arg0[2] & 0xFFFFFFFFL) - ((long) arg1[2] & 0xFFFFFFFFL) + var11;
        arg2[2] = (int) var13;
        long var15 = var13 >> 32;
        long var17 = ((long) arg0[3] & 0xFFFFFFFFL) - ((long) arg1[3] & 0xFFFFFFFFL) + var15;
        arg2[3] = (int) var17;
        long var19 = var17 >> 32;
        long var21 = ((long) arg0[4] & 0xFFFFFFFFL) - ((long) arg1[4] & 0xFFFFFFFFL) + var19;
        arg2[4] = (int) var21;
        long var23 = var21 >> 32;
        long var25 = ((long) arg0[5] & 0xFFFFFFFFL) - ((long) arg1[5] & 0xFFFFFFFFL) + var23;
        arg2[5] = (int) var25;
        long var27 = var25 >> 32;
        return (int) var27;
    }

    public static int sub(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = 0L;
        long var8 = ((long) arg0[arg1] & 0xFFFFFFFFL) - ((long) arg2[arg3] & 0xFFFFFFFFL) + var6;
        arg4[arg5] = (int) var8;
        long var10 = var8 >> 32;
        long var12 = ((long) arg0[arg1 + 1] & 0xFFFFFFFFL) - ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var10;
        arg4[arg5 + 1] = (int) var12;
        long var14 = var12 >> 32;
        long var16 = ((long) arg0[arg1 + 2] & 0xFFFFFFFFL) - ((long) arg2[arg3 + 2] & 0xFFFFFFFFL) + var14;
        arg4[arg5 + 2] = (int) var16;
        long var18 = var16 >> 32;
        long var20 = ((long) arg0[arg1 + 3] & 0xFFFFFFFFL) - ((long) arg2[arg3 + 3] & 0xFFFFFFFFL) + var18;
        arg4[arg5 + 3] = (int) var20;
        long var22 = var20 >> 32;
        long var24 = ((long) arg0[arg1 + 4] & 0xFFFFFFFFL) - ((long) arg2[arg3 + 4] & 0xFFFFFFFFL) + var22;
        arg4[arg5 + 4] = (int) var24;
        long var26 = var24 >> 32;
        long var28 = ((long) arg0[arg1 + 5] & 0xFFFFFFFFL) - ((long) arg2[arg3 + 5] & 0xFFFFFFFFL) + var26;
        arg4[arg5 + 5] = (int) var28;
        long var30 = var28 >> 32;
        return (int) var30;
    }

    public static int subBothFrom(int[] arg0, int[] arg1, int[] arg2) {
        long var3 = 0L;
        long var5 = ((long) arg2[0] & 0xFFFFFFFFL) - ((long) arg0[0] & 0xFFFFFFFFL) - ((long) arg1[0] & 0xFFFFFFFFL) + var3;
        arg2[0] = (int) var5;
        long var7 = var5 >> 32;
        long var9 = ((long) arg2[1] & 0xFFFFFFFFL) - ((long) arg0[1] & 0xFFFFFFFFL) - ((long) arg1[1] & 0xFFFFFFFFL) + var7;
        arg2[1] = (int) var9;
        long var11 = var9 >> 32;
        long var13 = ((long) arg2[2] & 0xFFFFFFFFL) - ((long) arg0[2] & 0xFFFFFFFFL) - ((long) arg1[2] & 0xFFFFFFFFL) + var11;
        arg2[2] = (int) var13;
        long var15 = var13 >> 32;
        long var17 = ((long) arg2[3] & 0xFFFFFFFFL) - ((long) arg0[3] & 0xFFFFFFFFL) - ((long) arg1[3] & 0xFFFFFFFFL) + var15;
        arg2[3] = (int) var17;
        long var19 = var17 >> 32;
        long var21 = ((long) arg2[4] & 0xFFFFFFFFL) - ((long) arg0[4] & 0xFFFFFFFFL) - ((long) arg1[4] & 0xFFFFFFFFL) + var19;
        arg2[4] = (int) var21;
        long var23 = var21 >> 32;
        long var25 = ((long) arg2[5] & 0xFFFFFFFFL) - ((long) arg0[5] & 0xFFFFFFFFL) - ((long) arg1[5] & 0xFFFFFFFFL) + var23;
        arg2[5] = (int) var25;
        long var27 = var25 >> 32;
        return (int) var27;
    }

    public static int addBothTo(int[] arg0, int[] arg1, int[] arg2) {
        long var3 = 0L;
        long var5 = ((long) arg2[0] & 0xFFFFFFFFL) + ((long) arg0[0] & 0xFFFFFFFFL) + ((long) arg1[0] & 0xFFFFFFFFL) + var3;
        arg2[0] = (int) var5;
        long var7 = var5 >>> 32;
        long var9 = ((long) arg2[1] & 0xFFFFFFFFL) + ((long) arg0[1] & 0xFFFFFFFFL) + ((long) arg1[1] & 0xFFFFFFFFL) + var7;
        arg2[1] = (int) var9;
        long var11 = var9 >>> 32;
        long var13 = ((long) arg2[2] & 0xFFFFFFFFL) + ((long) arg0[2] & 0xFFFFFFFFL) + ((long) arg1[2] & 0xFFFFFFFFL) + var11;
        arg2[2] = (int) var13;
        long var15 = var13 >>> 32;
        long var17 = ((long) arg2[3] & 0xFFFFFFFFL) + ((long) arg0[3] & 0xFFFFFFFFL) + ((long) arg1[3] & 0xFFFFFFFFL) + var15;
        arg2[3] = (int) var17;
        long var19 = var17 >>> 32;
        long var21 = ((long) arg2[4] & 0xFFFFFFFFL) + ((long) arg0[4] & 0xFFFFFFFFL) + ((long) arg1[4] & 0xFFFFFFFFL) + var19;
        arg2[4] = (int) var21;
        long var23 = var21 >>> 32;
        long var25 = ((long) arg2[5] & 0xFFFFFFFFL) + ((long) arg0[5] & 0xFFFFFFFFL) + ((long) arg1[5] & 0xFFFFFFFFL) + var23;
        arg2[5] = (int) var25;
        long var27 = var25 >>> 32;
        return (int) var27;
    }

    public static void copy(int[] arg0, int[] arg1) {
        arg1[0] = arg0[0];
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
        arg1[3] = arg0[3];
        arg1[4] = arg0[4];
        arg1[5] = arg0[5];
    }

    public static BigInteger toBigInteger(int[] arg0) {
        byte[] var1 = new byte[24];
        for (int var2 = 0; var2 < 6; var2++) {
            int var3 = arg0[var2];
            if (var3 != 0) {
                Pack.intToBigEndian(var3, var1, 5 - var2 << 2);
            }
        }
        return new BigInteger(1, var1);
    }

    public static int mulAddTo(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = (long) arg2[arg3] & 0xFFFFFFFFL;
        long var8 = (long) arg2[arg3 + 1] & 0xFFFFFFFFL;
        long var10 = (long) arg2[arg3 + 2] & 0xFFFFFFFFL;
        long var12 = (long) arg2[arg3 + 3] & 0xFFFFFFFFL;
        long var14 = (long) arg2[arg3 + 4] & 0xFFFFFFFFL;
        long var16 = (long) arg2[arg3 + 5] & 0xFFFFFFFFL;
        long var18 = 0L;
        for (int var20 = 0; var20 < 6; var20++) {
            long var21 = 0L;
            long var23 = (long) arg0[arg1 + var20] & 0xFFFFFFFFL;
            long var25 = ((long) arg4[arg5] & 0xFFFFFFFFL) + var6 * var23 + var21;
            arg4[arg5] = (int) var25;
            long var27 = var25 >>> 32;
            long var29 = ((long) arg4[arg5 + 1] & 0xFFFFFFFFL) + var8 * var23 + var27;
            arg4[arg5 + 1] = (int) var29;
            long var31 = var29 >>> 32;
            long var33 = ((long) arg4[arg5 + 2] & 0xFFFFFFFFL) + var10 * var23 + var31;
            arg4[arg5 + 2] = (int) var33;
            long var35 = var33 >>> 32;
            long var37 = ((long) arg4[arg5 + 3] & 0xFFFFFFFFL) + var12 * var23 + var35;
            arg4[arg5 + 3] = (int) var37;
            long var39 = var37 >>> 32;
            long var41 = ((long) arg4[arg5 + 4] & 0xFFFFFFFFL) + var14 * var23 + var39;
            arg4[arg5 + 4] = (int) var41;
            long var43 = var41 >>> 32;
            long var45 = ((long) arg4[arg5 + 5] & 0xFFFFFFFFL) + var16 * var23 + var43;
            arg4[arg5 + 5] = (int) var45;
            long var47 = var45 >>> 32;
            long var49 = ((long) arg4[arg5 + 6] & 0xFFFFFFFFL) + var18 + var47;
            arg4[arg5 + 6] = (int) var49;
            var18 = var49 >>> 32;
            arg5++;
        }
        return (int) var18;
    }

    public static void zero(int[] arg0) {
        arg0[0] = 0;
        arg0[1] = 0;
        arg0[2] = 0;
        arg0[3] = 0;
        arg0[4] = 0;
        arg0[5] = 0;
    }
}
