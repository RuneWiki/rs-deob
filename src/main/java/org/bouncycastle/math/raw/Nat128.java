package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

public abstract class Nat128 {

    public static final long M = 4294967295L;

    public static void mul(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = (long) arg2[arg3] & 0xFFFFFFFFL;
        long var8 = (long) arg2[arg3 + 1] & 0xFFFFFFFFL;
        long var10 = (long) arg2[arg3 + 2] & 0xFFFFFFFFL;
        long var12 = (long) arg2[arg3 + 3] & 0xFFFFFFFFL;
        long var14 = 0L;
        long var16 = (long) arg0[arg1] & 0xFFFFFFFFL;
        long var18 = var6 * var16 + var14;
        arg4[arg5] = (int) var18;
        long var20 = var18 >>> 32;
        long var22 = var8 * var16 + var20;
        arg4[arg5 + 1] = (int) var22;
        long var24 = var22 >>> 32;
        long var26 = var10 * var16 + var24;
        arg4[arg5 + 2] = (int) var26;
        long var28 = var26 >>> 32;
        long var30 = var12 * var16 + var28;
        arg4[arg5 + 3] = (int) var30;
        long var32 = var30 >>> 32;
        arg4[arg5 + 4] = (int) var32;
        for (int var34 = 1; var34 < 4; var34++) {
            arg5++;
            long var35 = 0L;
            long var37 = (long) arg0[arg1 + var34] & 0xFFFFFFFFL;
            long var39 = ((long) arg4[arg5] & 0xFFFFFFFFL) + var6 * var37 + var35;
            arg4[arg5] = (int) var39;
            long var41 = var39 >>> 32;
            long var43 = ((long) arg4[arg5 + 1] & 0xFFFFFFFFL) + var8 * var37 + var41;
            arg4[arg5 + 1] = (int) var43;
            long var45 = var43 >>> 32;
            long var47 = ((long) arg4[arg5 + 2] & 0xFFFFFFFFL) + var10 * var37 + var45;
            arg4[arg5 + 2] = (int) var47;
            long var49 = var47 >>> 32;
            long var51 = ((long) arg4[arg5 + 3] & 0xFFFFFFFFL) + var12 * var37 + var49;
            arg4[arg5 + 3] = (int) var51;
            long var53 = var51 >>> 32;
            arg4[arg5 + 4] = (int) var53;
        }
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
        return (int) var19;
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
        return (int) var19;
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        if (arg0.signum() < 0 || arg0.bitLength() > 128) {
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
        return (int) var21;
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
        return (int) var20;
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
        return (int) var18;
    }

    public static void copy64(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0];
        arg1[1] = arg0[1];
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
        return (int) var19;
    }

    public static long[] create64() {
        return new long[2];
    }

    public static int[] createExt() {
        return new int[8];
    }

    public static int[] create() {
        return new int[4];
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

    public static boolean eq(int[] arg0, int[] arg1) {
        for (int var2 = 3; var2 >= 0; var2--) {
            if (arg0[var2] != arg1[var2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] arg0, long[] arg1) {
        for (int var2 = 1; var2 >= 0; var2--) {
            if (arg0[var2] != arg1[var2]) {
                return false;
            }
        }
        return true;
    }

    public static long[] createExt64() {
        return new long[4];
    }

    public static long[] fromBigInteger64(BigInteger arg0) {
        if (arg0.signum() < 0 || arg0.bitLength() > 128) {
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
        if (var2 >= 0 && var2 < 4) {
            int var3 = arg1 & 0x1F;
            return arg0[var2] >>> var3 & 0x1;
        } else {
            return 0;
        }
    }

    public static boolean gte(int[] arg0, int[] arg1) {
        for (int var2 = 3; var2 >= 0; var2--) {
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

    public static boolean gte(int[] arg0, int arg1, int[] arg2, int arg3) {
        for (int var4 = 3; var4 >= 0; var4--) {
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
        long var11 = 0L;
        long var13 = (long) arg0[0] & 0xFFFFFFFFL;
        long var15 = var3 * var13 + var11;
        arg2[0] = (int) var15;
        long var17 = var15 >>> 32;
        long var19 = var5 * var13 + var17;
        arg2[1] = (int) var19;
        long var21 = var19 >>> 32;
        long var23 = var7 * var13 + var21;
        arg2[2] = (int) var23;
        long var25 = var23 >>> 32;
        long var27 = var9 * var13 + var25;
        arg2[3] = (int) var27;
        long var29 = var27 >>> 32;
        arg2[4] = (int) var29;
        for (int var31 = 1; var31 < 4; var31++) {
            long var32 = 0L;
            long var34 = (long) arg0[var31] & 0xFFFFFFFFL;
            long var36 = ((long) arg2[var31] & 0xFFFFFFFFL) + var3 * var34 + var32;
            arg2[var31] = (int) var36;
            long var38 = var36 >>> 32;
            long var40 = ((long) arg2[var31 + 1] & 0xFFFFFFFFL) + var5 * var34 + var38;
            arg2[var31 + 1] = (int) var40;
            long var42 = var40 >>> 32;
            long var44 = ((long) arg2[var31 + 2] & 0xFFFFFFFFL) + var7 * var34 + var42;
            arg2[var31 + 2] = (int) var44;
            long var46 = var44 >>> 32;
            long var48 = ((long) arg2[var31 + 3] & 0xFFFFFFFFL) + var9 * var34 + var46;
            arg2[var31 + 3] = (int) var48;
            long var50 = var48 >>> 32;
            arg2[var31 + 4] = (int) var50;
        }
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
        return (int) var19;
    }

    public static boolean isZero(int[] arg0) {
        for (int var1 = 0; var1 < 4; var1++) {
            if (arg0[var1] != 0) {
                return false;
            }
        }
        return true;
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
        return var29 + var33;
    }

    public static void copy(int[] arg0, int[] arg1) {
        arg1[0] = arg0[0];
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
        arg1[3] = arg0[3];
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
        } while (var8 < 4);
        return (int) var4;
    }

    public static int mulAddTo(int[] arg0, int[] arg1, int[] arg2) {
        long var3 = (long) arg1[0] & 0xFFFFFFFFL;
        long var5 = (long) arg1[1] & 0xFFFFFFFFL;
        long var7 = (long) arg1[2] & 0xFFFFFFFFL;
        long var9 = (long) arg1[3] & 0xFFFFFFFFL;
        long var11 = 0L;
        for (int var13 = 0; var13 < 4; var13++) {
            long var14 = 0L;
            long var16 = (long) arg0[var13] & 0xFFFFFFFFL;
            long var18 = ((long) arg2[var13] & 0xFFFFFFFFL) + var3 * var16 + var14;
            arg2[var13] = (int) var18;
            long var20 = var18 >>> 32;
            long var22 = ((long) arg2[var13 + 1] & 0xFFFFFFFFL) + var5 * var16 + var20;
            arg2[var13 + 1] = (int) var22;
            long var24 = var22 >>> 32;
            long var26 = ((long) arg2[var13 + 2] & 0xFFFFFFFFL) + var7 * var16 + var24;
            arg2[var13 + 2] = (int) var26;
            long var28 = var26 >>> 32;
            long var30 = ((long) arg2[var13 + 3] & 0xFFFFFFFFL) + var9 * var16 + var28;
            arg2[var13 + 3] = (int) var30;
            long var32 = var30 >>> 32;
            long var34 = ((long) arg2[var13 + 4] & 0xFFFFFFFFL) + var11 + var32;
            arg2[var13 + 4] = (int) var34;
            var11 = var34 >>> 32;
        }
        return (int) var11;
    }

    public static int mulAddTo(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = (long) arg2[arg3] & 0xFFFFFFFFL;
        long var8 = (long) arg2[arg3 + 1] & 0xFFFFFFFFL;
        long var10 = (long) arg2[arg3 + 2] & 0xFFFFFFFFL;
        long var12 = (long) arg2[arg3 + 3] & 0xFFFFFFFFL;
        long var14 = 0L;
        for (int var16 = 0; var16 < 4; var16++) {
            long var17 = 0L;
            long var19 = (long) arg0[arg1 + var16] & 0xFFFFFFFFL;
            long var21 = ((long) arg4[arg5] & 0xFFFFFFFFL) + var6 * var19 + var17;
            arg4[arg5] = (int) var21;
            long var23 = var21 >>> 32;
            long var25 = ((long) arg4[arg5 + 1] & 0xFFFFFFFFL) + var8 * var19 + var23;
            arg4[arg5 + 1] = (int) var25;
            long var27 = var25 >>> 32;
            long var29 = ((long) arg4[arg5 + 2] & 0xFFFFFFFFL) + var10 * var19 + var27;
            arg4[arg5 + 2] = (int) var29;
            long var31 = var29 >>> 32;
            long var33 = ((long) arg4[arg5 + 3] & 0xFFFFFFFFL) + var12 * var19 + var31;
            arg4[arg5 + 3] = (int) var33;
            long var35 = var33 >>> 32;
            long var37 = ((long) arg4[arg5 + 4] & 0xFFFFFFFFL) + var14 + var35;
            arg4[arg5 + 4] = (int) var37;
            var14 = var37 >>> 32;
            arg5++;
        }
        return (int) var14;
    }

    public static boolean isOne64(long[] arg0) {
        if (arg0[0] != 1L) {
            return false;
        }
        for (int var1 = 1; var1 < 2; var1++) {
            if (arg0[var1] != 0L) {
                return false;
            }
        }
        return true;
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
        return (int) var23;
    }

    public static void square(int[] arg0, int[] arg1) {
        long var2 = (long) arg0[0] & 0xFFFFFFFFL;
        int var4 = 0;
        int var5 = 3;
        int var6 = 8;
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
        long var60 = (var58 >>> 32) + var48;
        long var62 = var58 & 0xFFFFFFFFL;
        int var64 = (int) var56;
        arg1[4] = var64 << 1 | var55;
        int var65 = var64 >>> 31;
        int var66 = (int) var62;
        arg1[5] = var66 << 1 | var65;
        int var67 = var66 >>> 31;
        int var68 = (int) var60;
        arg1[6] = var68 << 1 | var67;
        int var69 = var68 >>> 31;
        int var70 = arg1[7] + (int) (var60 >>> 32);
        arg1[7] = var70 << 1 | var69;
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
        return var20 == 0L ? 0 : Nat.incAt(4, arg2, arg3, 3);
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
        return var19 == 0L ? 0 : Nat.incAt(4, arg2, arg3, 3);
    }

    public static int mulWordsAdd(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = 0L;
        long var6 = (long) arg0 & 0xFFFFFFFFL;
        long var8 = (long) arg1 & 0xFFFFFFFFL;
        long var10 = ((long) arg2[arg3] & 0xFFFFFFFFL) + var6 * var8 + var4;
        arg2[arg3] = (int) var10;
        long var12 = var10 >>> 32;
        long var14 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var12;
        arg2[arg3 + 1] = (int) var14;
        long var16 = var14 >>> 32;
        return var16 == 0L ? 0 : Nat.incAt(4, arg2, arg3, 2);
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
        return (int) var27;
    }

    public static boolean isZero64(long[] arg0) {
        for (int var1 = 0; var1 < 2; var1++) {
            if (arg0[var1] != 0L) {
                return false;
            }
        }
        return true;
    }

    public static void square(int[] arg0, int arg1, int[] arg2, int arg3) {
        long var4 = (long) arg0[arg1] & 0xFFFFFFFFL;
        int var6 = 0;
        int var7 = 3;
        int var8 = 8;
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
        long var62 = (var60 >>> 32) + var50;
        int var64 = (int) var58;
        arg2[arg3 + 4] = var64 << 1 | var57;
        int var65 = var64 >>> 31;
        int var66 = (int) var60;
        arg2[arg3 + 5] = var66 << 1 | var65;
        int var67 = var66 >>> 31;
        int var68 = (int) var62;
        arg2[arg3 + 6] = var68 << 1 | var67;
        int var69 = var68 >>> 31;
        int var70 = arg2[arg3 + 7] + (int) (var62 >>> 32);
        arg2[arg3 + 7] = var70 << 1 | var69;
    }

    public static boolean isOne(int[] arg0) {
        if (arg0[0] != 1) {
            return false;
        }
        for (int var1 = 1; var1 < 4; var1++) {
            if (arg0[var1] != 0) {
                return false;
            }
        }
        return true;
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
        return (int) var22;
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
        return (int) var20;
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
        return (int) var18;
    }

    public static BigInteger toBigInteger(int[] arg0) {
        byte[] var1 = new byte[16];
        for (int var2 = 0; var2 < 4; var2++) {
            int var3 = arg0[var2];
            if (var3 != 0) {
                Pack.intToBigEndian(var3, var1, 3 - var2 << 2);
            }
        }
        return new BigInteger(1, var1);
    }

    public static BigInteger toBigInteger64(long[] arg0) {
        byte[] var1 = new byte[16];
        for (int var2 = 0; var2 < 2; var2++) {
            long var3 = arg0[var2];
            if (var3 != 0L) {
                Pack.longToBigEndian(var3, var1, 1 - var2 << 3);
            }
        }
        return new BigInteger(1, var1);
    }

    public static void zero(int[] arg0) {
        arg0[0] = 0;
        arg0[1] = 0;
        arg0[2] = 0;
        arg0[3] = 0;
    }
}
