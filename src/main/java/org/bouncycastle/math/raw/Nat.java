package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

public abstract class Nat {

    public static final long M = 4294967295L;

    public static int addDWordTo(int arg0, long arg1, int[] arg2, int arg3) {
        long var5 = ((long) arg2[arg3] & 0xFFFFFFFFL) + (arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var5;
        long var7 = var5 >>> 32;
        long var9 = (arg1 >>> 32) + ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var7;
        arg2[arg3 + 1] = (int) var9;
        long var11 = var9 >>> 32;
        return var11 == 0L ? 0 : incAt(arg0, arg2, arg3, 2);
    }

    public static int add(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        long var4 = 0L;
        for (int var6 = 0; var6 < arg0; var6++) {
            long var7 = ((long) arg1[var6] & 0xFFFFFFFFL) + ((long) arg2[var6] & 0xFFFFFFFFL) + var4;
            arg3[var6] = (int) var7;
            var4 = var7 >>> 32;
        }
        return (int) var4;
    }

    public static int add33At(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = ((long) arg2[arg3] & 0xFFFFFFFFL) + ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var4;
        long var6 = var4 >>> 32;
        long var8 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + 1L + var6;
        arg2[arg3 + 1] = (int) var8;
        long var10 = var8 >>> 32;
        return var10 == 0L ? 0 : incAt(arg0, arg2, arg3 + 2);
    }

    public static int add33At(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        long var5 = ((long) arg2[arg3 + arg4] & 0xFFFFFFFFL) + ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3 + arg4] = (int) var5;
        long var7 = var5 >>> 32;
        long var9 = ((long) arg2[arg3 + arg4 + 1] & 0xFFFFFFFFL) + 1L + var7;
        arg2[arg3 + arg4 + 1] = (int) var9;
        long var11 = var9 >>> 32;
        return var11 == 0L ? 0 : incAt(arg0, arg2, arg3, arg4 + 2);
    }

    public static int add33To(int arg0, int arg1, int[] arg2) {
        long var3 = ((long) arg2[0] & 0xFFFFFFFFL) + ((long) arg1 & 0xFFFFFFFFL);
        arg2[0] = (int) var3;
        long var5 = var3 >>> 32;
        long var7 = ((long) arg2[1] & 0xFFFFFFFFL) + 1L + var5;
        arg2[1] = (int) var7;
        long var9 = var7 >>> 32;
        return var9 == 0L ? 0 : incAt(arg0, arg2, 2);
    }

    public static int add33To(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = ((long) arg2[arg3] & 0xFFFFFFFFL) + ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var4;
        long var6 = var4 >>> 32;
        long var8 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + 1L + var6;
        arg2[arg3 + 1] = (int) var8;
        long var10 = var8 >>> 32;
        return var10 == 0L ? 0 : incAt(arg0, arg2, arg3, 2);
    }

    public static int addBothTo(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        long var4 = 0L;
        for (int var6 = 0; var6 < arg0; var6++) {
            long var7 = ((long) arg3[var6] & 0xFFFFFFFFL) + ((long) arg1[var6] & 0xFFFFFFFFL) + ((long) arg2[var6] & 0xFFFFFFFFL) + var4;
            arg3[var6] = (int) var7;
            var4 = var7 >>> 32;
        }
        return (int) var4;
    }

    public static int subWordFrom(int arg0, int arg1, int[] arg2) {
        long var3 = ((long) arg2[0] & 0xFFFFFFFFL) - ((long) arg1 & 0xFFFFFFFFL);
        arg2[0] = (int) var3;
        long var5 = var3 >> 32;
        return var5 == 0L ? 0 : decAt(arg0, arg2, 1);
    }

    public static int addDWordAt(int arg0, long arg1, int[] arg2, int arg3) {
        long var5 = ((long) arg2[arg3] & 0xFFFFFFFFL) + (arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var5;
        long var7 = var5 >>> 32;
        long var9 = (arg1 >>> 32) + ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var7;
        arg2[arg3 + 1] = (int) var9;
        long var11 = var9 >>> 32;
        return var11 == 0L ? 0 : incAt(arg0, arg2, arg3 + 2);
    }

    public static int addDWordAt(int arg0, long arg1, int[] arg2, int arg3, int arg4) {
        long var6 = ((long) arg2[arg3 + arg4] & 0xFFFFFFFFL) + (arg1 & 0xFFFFFFFFL);
        arg2[arg3 + arg4] = (int) var6;
        long var8 = var6 >>> 32;
        long var10 = (arg1 >>> 32) + ((long) arg2[arg3 + arg4 + 1] & 0xFFFFFFFFL) + var8;
        arg2[arg3 + arg4 + 1] = (int) var10;
        long var12 = var10 >>> 32;
        return var12 == 0L ? 0 : incAt(arg0, arg2, arg3, arg4 + 2);
    }

    public static int addDWordTo(int arg0, long arg1, int[] arg2) {
        long var4 = ((long) arg2[0] & 0xFFFFFFFFL) + (arg1 & 0xFFFFFFFFL);
        arg2[0] = (int) var4;
        long var6 = var4 >>> 32;
        long var8 = (arg1 >>> 32) + ((long) arg2[1] & 0xFFFFFFFFL) + var6;
        arg2[1] = (int) var8;
        long var10 = var8 >>> 32;
        return var10 == 0L ? 0 : incAt(arg0, arg2, 2);
    }

    public static BigInteger toBigInteger(int arg0, int[] arg1) {
        byte[] var2 = new byte[arg0 << 2];
        for (int var3 = 0; var3 < arg0; var3++) {
            int var4 = arg1[var3];
            if (var4 != 0) {
                Pack.intToBigEndian(var4, var2, arg0 - 1 - var3 << 2);
            }
        }
        return new BigInteger(1, var2);
    }

    public static int addTo(int arg0, int[] arg1, int[] arg2) {
        long var3 = 0L;
        for (int var5 = 0; var5 < arg0; var5++) {
            long var6 = ((long) arg1[var5] & 0xFFFFFFFFL) + ((long) arg2[var5] & 0xFFFFFFFFL) + var3;
            arg2[var5] = (int) var6;
            var3 = var6 >>> 32;
        }
        return (int) var3;
    }

    public static int squareWordAdd(int[] arg0, int arg1, int[] arg2) {
        long var3 = 0L;
        long var5 = (long) arg0[arg1] & 0xFFFFFFFFL;
        int var7 = 0;
        do {
            long var8 = ((long) arg2[arg1 + var7] & 0xFFFFFFFFL) + ((long) arg0[var7] & 0xFFFFFFFFL) * var5 + var3;
            arg2[arg1 + var7] = (int) var8;
            var3 = var8 >>> 32;
            var7++;
        } while (var7 < arg1);
        return (int) var3;
    }

    public static int addWordAt(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = ((long) arg2[arg3] & 0xFFFFFFFFL) + ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var4;
        long var6 = var4 >>> 32;
        return var6 == 0L ? 0 : incAt(arg0, arg2, arg3 + 1);
    }

    public static int addWordAt(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        long var5 = ((long) arg2[arg3 + arg4] & 0xFFFFFFFFL) + ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3 + arg4] = (int) var5;
        long var7 = var5 >>> 32;
        return var7 == 0L ? 0 : incAt(arg0, arg2, arg3, arg4 + 1);
    }

    public static long shiftUpBit64(int arg0, long[] arg1, int arg2, long arg3, long[] arg4, int arg5) {
        for (int var7 = 0; var7 < arg0; var7++) {
            long var8 = arg1[arg2 + var7];
            arg4[arg5 + var7] = var8 << 1 | arg3 >>> 63;
            arg3 = var8;
        }
        return arg3 >>> 63;
    }

    public static int addWordTo(int arg0, int arg1, int[] arg2) {
        long var3 = ((long) arg2[0] & 0xFFFFFFFFL) + ((long) arg1 & 0xFFFFFFFFL);
        arg2[0] = (int) var3;
        long var5 = var3 >>> 32;
        return var5 == 0L ? 0 : incAt(arg0, arg2, 1);
    }

    public static int[] copy(int arg0, int[] arg1) {
        int[] var2 = new int[arg0];
        System.arraycopy(arg1, 0, var2, 0, arg0);
        return var2;
    }

    public static void copy(int arg0, int[] arg1, int[] arg2) {
        System.arraycopy(arg1, 0, arg2, 0, arg0);
    }

    public static void square(int arg0, int[] arg1, int[] arg2) {
        int var3 = arg0 << 1;
        int var4 = 0;
        int var5 = arg0;
        int var6 = var3;
        do {
            var5--;
            long var7 = (long) arg1[var5] & 0xFFFFFFFFL;
            long var9 = var7 * var7;
            var6--;
            arg2[var6] = var4 << 31 | (int) (var9 >>> 33);
            var6--;
            arg2[var6] = (int) (var9 >>> 1);
            var4 = (int) var9;
        } while (var5 > 0);
        for (int var11 = 1; var11 < arg0; var11++) {
            int var12 = squareWordAdd(arg1, var11, arg2);
            addWordAt(var3, var12, arg2, var11 << 1);
        }
        shiftUpBit(var3, arg2, arg1[0] << 31);
    }

    public static long[] create64(int arg0) {
        return new long[arg0];
    }

    public static int dec(int arg0, int[] arg1) {
        for (int var2 = 0; var2 < arg0; var2++) {
            if (--arg1[var2] != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int dec(int arg0, int[] arg1, int[] arg2) {
        int var3 = 0;
        int var4;
        do {
            if (var3 >= arg0) {
                return -1;
            }
            var4 = arg1[var3] - 1;
            arg2[var3] = var4;
            var3++;
        } while (var4 == -1);
        while (var3 < arg0) {
            arg2[var3] = arg1[var3];
            var3++;
        }
        return 0;
    }

    public static int decAt(int arg0, int[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0; var3++) {
            if (--arg1[var3] != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int addTo(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        long var5 = 0L;
        for (int var7 = 0; var7 < arg0; var7++) {
            long var8 = ((long) arg1[arg2 + var7] & 0xFFFFFFFFL) + ((long) arg3[arg4 + var7] & 0xFFFFFFFFL) + var5;
            arg3[arg4 + var7] = (int) var8;
            var5 = var8 >>> 32;
        }
        return (int) var5;
    }

    public static boolean eq(int arg0, int[] arg1, int[] arg2) {
        for (int var3 = arg0 - 1; var3 >= 0; var3--) {
            if (arg1[var3] != arg2[var3]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne(int arg0, int[] arg1) {
        if (arg1[0] != 1) {
            return false;
        }
        for (int var2 = 1; var2 < arg0; var2++) {
            if (arg1[var2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int subFrom(int arg0, int[] arg1, int[] arg2) {
        long var3 = 0L;
        for (int var5 = 0; var5 < arg0; var5++) {
            long var6 = ((long) arg2[var5] & 0xFFFFFFFFL) - ((long) arg1[var5] & 0xFFFFFFFFL) + var3;
            arg2[var5] = (int) var6;
            var3 = var6 >> 32;
        }
        return (int) var3;
    }

    public static int subBothFrom(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        long var7 = 0L;
        for (int var9 = 0; var9 < arg0; var9++) {
            long var10 = ((long) arg5[arg6 + var9] & 0xFFFFFFFFL) - ((long) arg1[arg2 + var9] & 0xFFFFFFFFL) - ((long) arg3[arg4 + var9] & 0xFFFFFFFFL) + var7;
            arg5[arg6 + var9] = (int) var10;
            var7 = var10 >> 32;
        }
        return (int) var7;
    }

    public static boolean gte(int arg0, int[] arg1, int[] arg2) {
        for (int var3 = arg0 - 1; var3 >= 0; var3--) {
            int var4 = arg1[var3] ^ Integer.MIN_VALUE;
            int var5 = arg2[var3] ^ Integer.MIN_VALUE;
            if (var4 < var5) {
                return false;
            }
            if (var4 > var5) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int arg0, int[] arg1, int[] arg2) {
        int var3 = 0;
        int var4;
        do {
            if (var3 >= arg0) {
                return 1;
            }
            var4 = arg1[var3] + 1;
            arg2[var3] = var4;
            var3++;
        } while (var4 == 0);
        while (var3 < arg0) {
            arg2[var3] = arg1[var3];
            var3++;
        }
        return 0;
    }

    public static int incAt(int arg0, int[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg0; var3++) {
            if (++arg1[var3] != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean isZero(int arg0, int[] arg1) {
        for (int var2 = 0; var2 < arg0; var2++) {
            if (arg1[var2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int subFrom(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        long var5 = 0L;
        for (int var7 = 0; var7 < arg0; var7++) {
            long var8 = ((long) arg3[arg4 + var7] & 0xFFFFFFFFL) - ((long) arg1[arg2 + var7] & 0xFFFFFFFFL) + var5;
            arg3[arg4 + var7] = (int) var8;
            var5 = var8 >> 32;
        }
        return (int) var5;
    }

    public static void mul(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        arg3[arg0] = mulWord(arg0, arg1[0], arg2, arg3);
        for (int var4 = 1; var4 < arg0; var4++) {
            arg3[arg0 + var4] = mulWordAddTo(arg0, arg1[var4], arg2, 0, arg3, var4);
        }
    }

    public static void mul(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        arg5[arg0 + arg6] = mulWord(arg0, arg1[arg2], arg3, arg4, arg5, arg6);
        for (int var7 = 1; var7 < arg0; var7++) {
            arg5[arg6 + var7 + arg0] = mulWordAddTo(arg0, arg1[arg2 + var7], arg3, arg4, arg5, arg6 + var7);
        }
    }

    public static int mulAddTo(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        long var4 = 0L;
        for (int var6 = 0; var6 < arg0; var6++) {
            long var7 = (long) mulWordAddTo(arg0, arg1[var6], arg2, 0, arg3, var6) & 0xFFFFFFFFL;
            long var9 = ((long) arg3[arg0 + var6] & 0xFFFFFFFFL) + var4 + var7;
            arg3[arg0 + var6] = (int) var9;
            var4 = var9 >>> 32;
        }
        return (int) var4;
    }

    public static int decAt(int arg0, int[] arg1, int arg2, int arg3) {
        for (int var4 = arg3; var4 < arg0; var4++) {
            if (--arg1[arg2 + var4] != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int mul31BothAdd(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int[] arg5, int arg6) {
        long var7 = 0L;
        long var9 = (long) arg1 & 0xFFFFFFFFL;
        long var11 = (long) arg3 & 0xFFFFFFFFL;
        int var13 = 0;
        do {
            long var14 = ((long) arg5[arg6 + var13] & 0xFFFFFFFFL) + ((long) arg2[var13] & 0xFFFFFFFFL) * var9 + ((long) arg4[var13] & 0xFFFFFFFFL) * var11 + var7;
            arg5[arg6 + var13] = (int) var14;
            var7 = var14 >>> 32;
            var13++;
        } while (var13 < arg0);
        return (int) var7;
    }

    public static int mulWord(int arg0, int arg1, int[] arg2, int[] arg3) {
        long var4 = 0L;
        long var6 = (long) arg1 & 0xFFFFFFFFL;
        int var8 = 0;
        do {
            long var9 = ((long) arg2[var8] & 0xFFFFFFFFL) * var6 + var4;
            arg3[var8] = (int) var9;
            var4 = var9 >>> 32;
            var8++;
        } while (var8 < arg0);
        return (int) var4;
    }

    public static int sub33At(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = ((long) arg2[arg3] & 0xFFFFFFFFL) - ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var4;
        long var6 = var4 >> 32;
        long var8 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) - 1L + var6;
        arg2[arg3 + 1] = (int) var8;
        long var10 = var8 >> 32;
        return var10 == 0L ? 0 : decAt(arg0, arg2, arg3 + 2);
    }

    public static int mulWordAddTo(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = 0L;
        long var8 = (long) arg1 & 0xFFFFFFFFL;
        int var10 = 0;
        do {
            long var11 = ((long) arg4[arg5 + var10] & 0xFFFFFFFFL) + ((long) arg2[arg3 + var10] & 0xFFFFFFFFL) * var8 + var6;
            arg4[arg5 + var10] = (int) var11;
            var6 = var11 >>> 32;
            var10++;
        } while (var10 < arg0);
        return (int) var6;
    }

    public static int mulWordDwordAddAt(int arg0, int arg1, long arg2, int[] arg3, int arg4) {
        long var6 = 0L;
        long var8 = (long) arg1 & 0xFFFFFFFFL;
        long var10 = ((long) arg3[arg4] & 0xFFFFFFFFL) + (arg2 & 0xFFFFFFFFL) * var8 + var6;
        arg3[arg4] = (int) var10;
        long var12 = var10 >>> 32;
        long var14 = ((long) arg3[arg4 + 1] & 0xFFFFFFFFL) + (arg2 >>> 32) * var8 + var12;
        arg3[arg4 + 1] = (int) var14;
        long var16 = var14 >>> 32;
        long var18 = ((long) arg3[arg4 + 2] & 0xFFFFFFFFL) + var16;
        arg3[arg4 + 2] = (int) var18;
        long var20 = var18 >>> 32;
        return var20 == 0L ? 0 : incAt(arg0, arg3, arg4 + 3);
    }

    public static int inc(int arg0, int[] arg1) {
        for (int var2 = 0; var2 < arg0; var2++) {
            if (++arg1[var2] != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int shiftDownBit(int arg0, int[] arg1, int arg2, int arg3) {
        int var4 = arg0;
        while (true) {
            var4--;
            if (var4 < 0) {
                return arg3 << 31;
            }
            int var5 = arg1[arg2 + var4];
            arg1[arg2 + var4] = var5 >>> 1 | arg3 << 31;
            arg3 = var5;
        }
    }

    public static int shiftDownBit(int arg0, int[] arg1, int arg2, int[] arg3) {
        int var4 = arg0;
        while (true) {
            var4--;
            if (var4 < 0) {
                return arg2 << 31;
            }
            int var5 = arg1[var4];
            arg3[var4] = var5 >>> 1 | arg2 << 31;
            arg2 = var5;
        }
    }

    public static int[] create(int arg0) {
        return new int[arg0];
    }

    public static int shiftDownBits(int arg0, int[] arg1, int arg2, int arg3) {
        int var4 = arg0;
        while (true) {
            var4--;
            if (var4 < 0) {
                return arg3 << -arg2;
            }
            int var5 = arg1[var4];
            arg1[var4] = var5 >>> arg2 | arg3 << -arg2;
            arg3 = var5;
        }
    }

    public static int shiftDownBits(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0;
        while (true) {
            var5--;
            if (var5 < 0) {
                return arg4 << -arg3;
            }
            int var6 = arg1[arg2 + var5];
            arg1[arg2 + var5] = var6 >>> arg3 | arg4 << -arg3;
            arg4 = var6;
        }
    }

    public static int shiftDownBits(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        int var5 = arg0;
        while (true) {
            var5--;
            if (var5 < 0) {
                return arg3 << -arg2;
            }
            int var6 = arg1[var5];
            arg4[var5] = var6 >>> arg2 | arg3 << -arg2;
            arg3 = var6;
        }
    }

    public static int shiftDownBits(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6) {
        int var7 = arg0;
        while (true) {
            var7--;
            if (var7 < 0) {
                return arg4 << -arg3;
            }
            int var8 = arg1[arg2 + var7];
            arg5[arg6 + var7] = var8 >>> arg3 | arg4 << -arg3;
            arg4 = var8;
        }
    }

    public static int shiftDownWord(int arg0, int[] arg1, int arg2) {
        int var3 = arg0;
        while (true) {
            var3--;
            if (var3 < 0) {
                return arg2;
            }
            int var4 = arg1[var3];
            arg1[var3] = arg2;
            arg2 = var4;
        }
    }

    public static int shiftUpBit(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg1[arg2 + var6];
            arg4[arg5 + var6] = var7 << 1 | arg3 >>> 31;
            arg3 = var7;
        }
        return arg3 >>> 31;
    }

    public static int shiftUpBit(int arg0, int[] arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < arg0; var4++) {
            int var5 = arg1[arg2 + var4];
            arg1[arg2 + var4] = var5 << 1 | arg3 >>> 31;
            arg3 = var5;
        }
        return arg3 >>> 31;
    }

    public static int shiftUpBit(int arg0, int[] arg1, int arg2, int[] arg3) {
        for (int var4 = 0; var4 < arg0; var4++) {
            int var5 = arg1[var4];
            arg3[var4] = var5 << 1 | arg2 >>> 31;
            arg2 = var5;
        }
        return arg2 >>> 31;
    }

    public static int addBothTo(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        long var7 = 0L;
        for (int var9 = 0; var9 < arg0; var9++) {
            long var10 = ((long) arg5[arg6 + var9] & 0xFFFFFFFFL) + ((long) arg1[arg2 + var9] & 0xFFFFFFFFL) + ((long) arg3[arg4 + var9] & 0xFFFFFFFFL) + var7;
            arg5[arg6 + var9] = (int) var10;
            var7 = var10 >>> 32;
        }
        return (int) var7;
    }

    public static int incAt(int arg0, int[] arg1, int arg2, int arg3) {
        for (int var4 = arg3; var4 < arg0; var4++) {
            if (++arg1[arg2 + var4] != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int shiftUpBits(int arg0, int[] arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < arg0; var4++) {
            int var5 = arg1[var4];
            arg1[var4] = var5 << arg2 | arg3 >>> -arg2;
            arg3 = var5;
        }
        return arg3 >>> -arg2;
    }

    public static int shiftUpBits(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < arg0; var5++) {
            int var6 = arg1[arg2 + var5];
            arg1[arg2 + var5] = var6 << arg3 | arg4 >>> -arg3;
            arg4 = var6;
        }
        return arg4 >>> -arg3;
    }

    public static long shiftUpBits64(int arg0, long[] arg1, int arg2, int arg3, long arg4) {
        for (int var6 = 0; var6 < arg0; var6++) {
            long var7 = arg1[arg2 + var6];
            arg1[arg2 + var6] = var7 << arg3 | arg4 >>> -arg3;
            arg4 = var7;
        }
        return arg4 >>> -arg3;
    }

    public static int shiftUpBits(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg0; var5++) {
            int var6 = arg1[var5];
            arg4[var5] = var6 << arg2 | arg3 >>> -arg2;
            arg3 = var6;
        }
        return arg3 >>> -arg2;
    }

    public static int shiftUpBits(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6) {
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg1[arg2 + var7];
            arg5[arg6 + var7] = var8 << arg3 | arg4 >>> -arg3;
            arg4 = var8;
        }
        return arg4 >>> -arg3;
    }

    public static long shiftUpBits64(int arg0, long[] arg1, int arg2, int arg3, long arg4, long[] arg5, int arg6) {
        for (int var8 = 0; var8 < arg0; var8++) {
            long var9 = arg1[arg2 + var8];
            arg5[arg6 + var8] = var9 << arg3 | arg4 >>> -arg3;
            arg4 = var9;
        }
        return arg4 >>> -arg3;
    }

    public static int subDWordFrom(int arg0, long arg1, int[] arg2) {
        long var4 = ((long) arg2[0] & 0xFFFFFFFFL) - (arg1 & 0xFFFFFFFFL);
        arg2[0] = (int) var4;
        long var6 = var4 >> 32;
        long var8 = ((long) arg2[1] & 0xFFFFFFFFL) - (arg1 >>> 32) + var6;
        arg2[1] = (int) var8;
        long var10 = var8 >> 32;
        return var10 == 0L ? 0 : decAt(arg0, arg2, 2);
    }

    public static void square(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        int var5 = arg0 << 1;
        int var6 = 0;
        int var7 = arg0;
        int var8 = var5;
        do {
            var7--;
            long var9 = (long) arg1[arg2 + var7] & 0xFFFFFFFFL;
            long var11 = var9 * var9;
            var8--;
            arg3[arg4 + var8] = var6 << 31 | (int) (var11 >>> 33);
            var8--;
            arg3[arg4 + var8] = (int) (var11 >>> 1);
            var6 = (int) var11;
        } while (var7 > 0);
        for (int var13 = 1; var13 < arg0; var13++) {
            int var14 = squareWordAdd(arg1, arg2, var13, arg3, arg4);
            addWordAt(var5, var14, arg3, arg4, var13 << 1);
        }
        shiftUpBit(var5, arg3, arg4, arg1[arg2] << 31);
    }

    public static int sub(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        long var7 = 0L;
        for (int var9 = 0; var9 < arg0; var9++) {
            long var10 = ((long) arg1[arg2 + var9] & 0xFFFFFFFFL) - ((long) arg3[arg4 + var9] & 0xFFFFFFFFL) + var7;
            arg5[arg6 + var9] = (int) var10;
            var7 = var10 >> 32;
        }
        return (int) var7;
    }

    public static int squareWordAdd(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        long var5 = 0L;
        long var7 = (long) arg0[arg1 + arg2] & 0xFFFFFFFFL;
        int var9 = 0;
        do {
            long var10 = ((long) arg3[arg2 + arg4] & 0xFFFFFFFFL) + ((long) arg0[arg1 + var9] & 0xFFFFFFFFL) * var7 + var5;
            arg3[arg2 + arg4] = (int) var10;
            var5 = var10 >>> 32;
            arg4++;
            var9++;
        } while (var9 < arg2);
        return (int) var5;
    }

    public static int sub(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        long var4 = 0L;
        for (int var6 = 0; var6 < arg0; var6++) {
            long var7 = ((long) arg1[var6] & 0xFFFFFFFFL) - ((long) arg2[var6] & 0xFFFFFFFFL) + var4;
            arg3[var6] = (int) var7;
            var4 = var7 >> 32;
        }
        return (int) var4;
    }

    public static int mulWord(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = 0L;
        long var8 = (long) arg1 & 0xFFFFFFFFL;
        int var10 = 0;
        do {
            long var11 = ((long) arg2[arg3 + var10] & 0xFFFFFFFFL) * var8 + var6;
            arg4[arg5 + var10] = (int) var11;
            var6 = var11 >>> 32;
            var10++;
        } while (var10 < arg0);
        return (int) var6;
    }

    public static int shiftUpBit(int arg0, int[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0; var3++) {
            int var4 = arg1[var3];
            arg1[var3] = var4 << 1 | arg2 >>> 31;
            arg2 = var4;
        }
        return arg2 >>> 31;
    }

    public static int sub33At(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        long var5 = ((long) arg2[arg3 + arg4] & 0xFFFFFFFFL) - ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3 + arg4] = (int) var5;
        long var7 = var5 >> 32;
        long var9 = ((long) arg2[arg3 + arg4 + 1] & 0xFFFFFFFFL) - 1L + var7;
        arg2[arg3 + arg4 + 1] = (int) var9;
        long var11 = var9 >> 32;
        return var11 == 0L ? 0 : decAt(arg0, arg2, arg3, arg4 + 2);
    }

    public static int shiftDownBit(int arg0, int[] arg1, int arg2) {
        int var3 = arg0;
        while (true) {
            var3--;
            if (var3 < 0) {
                return arg2 << 31;
            }
            int var4 = arg1[var3];
            arg1[var3] = var4 >>> 1 | arg2 << 31;
            arg2 = var4;
        }
    }

    public static int sub33From(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = ((long) arg2[arg3] & 0xFFFFFFFFL) - ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var4;
        long var6 = var4 >> 32;
        long var8 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) - 1L + var6;
        arg2[arg3 + 1] = (int) var8;
        long var10 = var8 >> 32;
        return var10 == 0L ? 0 : decAt(arg0, arg2, arg3, 2);
    }

    public static int subBothFrom(int arg0, int[] arg1, int[] arg2, int[] arg3) {
        long var4 = 0L;
        for (int var6 = 0; var6 < arg0; var6++) {
            long var7 = ((long) arg3[var6] & 0xFFFFFFFFL) - ((long) arg1[var6] & 0xFFFFFFFFL) - ((long) arg2[var6] & 0xFFFFFFFFL) + var4;
            arg3[var6] = (int) var7;
            var4 = var7 >> 32;
        }
        return (int) var4;
    }

    public static int subDWordFrom(int arg0, long arg1, int[] arg2, int arg3) {
        long var5 = ((long) arg2[arg3] & 0xFFFFFFFFL) - (arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var5;
        long var7 = var5 >> 32;
        long var9 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) - (arg1 >>> 32) + var7;
        arg2[arg3 + 1] = (int) var9;
        long var11 = var9 >> 32;
        return var11 == 0L ? 0 : decAt(arg0, arg2, arg3, 2);
    }

    public static int subDWordAt(int arg0, long arg1, int[] arg2, int arg3) {
        long var5 = ((long) arg2[arg3] & 0xFFFFFFFFL) - (arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var5;
        long var7 = var5 >> 32;
        long var9 = ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) - (arg1 >>> 32) + var7;
        arg2[arg3 + 1] = (int) var9;
        long var11 = var9 >> 32;
        return var11 == 0L ? 0 : decAt(arg0, arg2, arg3 + 2);
    }

    public static int subDWordAt(int arg0, long arg1, int[] arg2, int arg3, int arg4) {
        long var6 = ((long) arg2[arg3 + arg4] & 0xFFFFFFFFL) - (arg1 & 0xFFFFFFFFL);
        arg2[arg3 + arg4] = (int) var6;
        long var8 = var6 >> 32;
        long var10 = ((long) arg2[arg3 + arg4 + 1] & 0xFFFFFFFFL) - (arg1 >>> 32) + var8;
        arg2[arg3 + arg4 + 1] = (int) var10;
        long var12 = var10 >> 32;
        return var12 == 0L ? 0 : decAt(arg0, arg2, arg3, arg4 + 2);
    }

    public static int mulAddTo(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        long var7 = 0L;
        for (int var9 = 0; var9 < arg0; var9++) {
            long var10 = (long) mulWordAddTo(arg0, arg1[arg2 + var9], arg3, arg4, arg5, arg6) & 0xFFFFFFFFL;
            long var12 = ((long) arg5[arg0 + arg6] & 0xFFFFFFFFL) + var7 + var10;
            arg5[arg0 + arg6] = (int) var12;
            var7 = var12 >>> 32;
            arg6++;
        }
        return (int) var7;
    }

    public static int[] fromBigInteger(int arg0, BigInteger arg1) {
        if (arg1.signum() < 0 || arg1.bitLength() > arg0) {
            throw new IllegalArgumentException();
        }
        int var2 = arg0 + 31 >> 5;
        int[] var3 = create(var2);
        int var4 = 0;
        while (arg1.signum() != 0) {
            var3[var4++] = arg1.intValue();
            arg1 = arg1.shiftRight(32);
        }
        return var3;
    }

    public static int addWordTo(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = ((long) arg2[arg3] & 0xFFFFFFFFL) + ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var4;
        long var6 = var4 >>> 32;
        return var6 == 0L ? 0 : incAt(arg0, arg2, arg3, 1);
    }

    public static int getBit(int[] arg0, int arg1) {
        if (arg1 == 0) {
            return arg0[0] & 0x1;
        }
        int var2 = arg1 >> 5;
        if (var2 >= 0 && var2 < arg0.length) {
            int var3 = arg1 & 0x1F;
            return arg0[var2] >>> var3 & 0x1;
        } else {
            return 0;
        }
    }

    public static int subWordAt(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = ((long) arg2[arg3] & 0xFFFFFFFFL) - ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var4;
        long var6 = var4 >> 32;
        return var6 == 0L ? 0 : decAt(arg0, arg2, arg3 + 1);
    }

    public static int subWordAt(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        long var5 = ((long) arg2[arg3 + arg4] & 0xFFFFFFFFL) - ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3 + arg4] = (int) var5;
        long var7 = var5 >> 32;
        return var7 == 0L ? 0 : decAt(arg0, arg2, arg3, arg4 + 1);
    }

    public static int sub33From(int arg0, int arg1, int[] arg2) {
        long var3 = ((long) arg2[0] & 0xFFFFFFFFL) - ((long) arg1 & 0xFFFFFFFFL);
        arg2[0] = (int) var3;
        long var5 = var3 >> 32;
        long var7 = ((long) arg2[1] & 0xFFFFFFFFL) - 1L + var5;
        arg2[1] = (int) var7;
        long var9 = var7 >> 32;
        return var9 == 0L ? 0 : decAt(arg0, arg2, 2);
    }

    public static int subWordFrom(int arg0, int arg1, int[] arg2, int arg3) {
        long var4 = ((long) arg2[arg3] & 0xFFFFFFFFL) - ((long) arg1 & 0xFFFFFFFFL);
        arg2[arg3] = (int) var4;
        long var6 = var4 >> 32;
        return var6 == 0L ? 0 : decAt(arg0, arg2, arg3, 1);
    }

    public static int shiftDownBit(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        int var6 = arg0;
        while (true) {
            var6--;
            if (var6 < 0) {
                return arg3 << 31;
            }
            int var7 = arg1[arg2 + var6];
            arg4[arg5 + var6] = var7 >>> 1 | arg3 << 31;
            arg3 = var7;
        }
    }

    public static void zero(int arg0, int[] arg1) {
        for (int var2 = 0; var2 < arg0; var2++) {
            arg1[var2] = 0;
        }
    }
}
