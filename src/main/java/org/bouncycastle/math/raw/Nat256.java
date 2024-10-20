package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

public abstract class Nat256 {

    public static final long M = 4294967295L;

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
        long var29 = ((long) arg0[6] & 0xFFFFFFFFL) - ((long) arg1[6] & 0xFFFFFFFFL) + var27;
        arg2[6] = (int) var29;
        long var31 = var29 >> 32;
        long var33 = ((long) arg0[7] & 0xFFFFFFFFL) - ((long) arg1[7] & 0xFFFFFFFFL) + var31;
        arg2[7] = (int) var33;
        long var35 = var33 >> 32;
        return (int) var35;
    }

    public static void square(int[] arg0, int arg1, int[] arg2, int arg3) {
        long var4 = (long) arg0[arg1] & 0xFFFFFFFFL;
        int var6 = 0;
        int var7 = 7;
        int var8 = 16;
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
        long var114 = var110 & 0xFFFFFFFFL;
        long var116 = (var112 >>> 32) + var44 * var96 + var100;
        long var118 = var112 & 0xFFFFFFFFL;
        long var120 = (var116 >>> 32) + var68 * var96 + var104;
        long var122 = var116 & 0xFFFFFFFFL;
        long var124 = (var120 >>> 32) + var102;
        long var126 = var120 & 0xFFFFFFFFL;
        long var128 = (long) arg0[arg1 + 6] & 0xFFFFFFFFL;
        long var130 = (var124 >>> 32) + ((long) arg2[arg3 + 11] & 0xFFFFFFFFL);
        long var132 = var124 & 0xFFFFFFFFL;
        long var134 = (var130 >>> 32) + ((long) arg2[arg3 + 12] & 0xFFFFFFFFL);
        long var136 = var130 & 0xFFFFFFFFL;
        long var138 = var4 * var128 + var114;
        int var140 = (int) var138;
        arg2[arg3 + 6] = var140 << 1 | var109;
        int var141 = var140 >>> 31;
        long var142 = (var138 >>> 32) + var18 * var128 + var118;
        long var144 = (var142 >>> 32) + var28 * var128 + var122;
        long var146 = var142 & 0xFFFFFFFFL;
        long var148 = (var144 >>> 32) + var44 * var128 + var126;
        long var150 = var144 & 0xFFFFFFFFL;
        long var152 = (var148 >>> 32) + var68 * var128 + var132;
        long var154 = var148 & 0xFFFFFFFFL;
        long var156 = (var152 >>> 32) + var96 * var128 + var136;
        long var158 = var152 & 0xFFFFFFFFL;
        long var160 = (var156 >>> 32) + var134;
        long var162 = var156 & 0xFFFFFFFFL;
        long var164 = (long) arg0[arg1 + 7] & 0xFFFFFFFFL;
        long var166 = (var160 >>> 32) + ((long) arg2[arg3 + 13] & 0xFFFFFFFFL);
        long var168 = var160 & 0xFFFFFFFFL;
        long var170 = (var166 >>> 32) + ((long) arg2[arg3 + 14] & 0xFFFFFFFFL);
        long var172 = var166 & 0xFFFFFFFFL;
        long var174 = var4 * var164 + var146;
        int var176 = (int) var174;
        arg2[arg3 + 7] = var176 << 1 | var141;
        int var177 = var176 >>> 31;
        long var178 = (var174 >>> 32) + var18 * var164 + var150;
        long var180 = (var178 >>> 32) + var28 * var164 + var154;
        long var182 = (var180 >>> 32) + var44 * var164 + var158;
        long var184 = (var182 >>> 32) + var68 * var164 + var162;
        long var186 = (var184 >>> 32) + var96 * var164 + var168;
        long var188 = (var186 >>> 32) + var128 * var164 + var172;
        long var190 = (var188 >>> 32) + var170;
        int var192 = (int) var178;
        arg2[arg3 + 8] = var192 << 1 | var177;
        int var193 = var192 >>> 31;
        int var194 = (int) var180;
        arg2[arg3 + 9] = var194 << 1 | var193;
        int var195 = var194 >>> 31;
        int var196 = (int) var182;
        arg2[arg3 + 10] = var196 << 1 | var195;
        int var197 = var196 >>> 31;
        int var198 = (int) var184;
        arg2[arg3 + 11] = var198 << 1 | var197;
        int var199 = var198 >>> 31;
        int var200 = (int) var186;
        arg2[arg3 + 12] = var200 << 1 | var199;
        int var201 = var200 >>> 31;
        int var202 = (int) var188;
        arg2[arg3 + 13] = var202 << 1 | var201;
        int var203 = var202 >>> 31;
        int var204 = (int) var190;
        arg2[arg3 + 14] = var204 << 1 | var203;
        int var205 = var204 >>> 31;
        int var206 = arg2[arg3 + 15] + (int) (var190 >>> 32);
        arg2[arg3 + 15] = var206 << 1 | var205;
    }

    public static long[] createExt64() {
        return new long[8];
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
        long var29 = ((long) arg2[6] & 0xFFFFFFFFL) + ((long) arg0[6] & 0xFFFFFFFFL) + ((long) arg1[6] & 0xFFFFFFFFL) + var27;
        arg2[6] = (int) var29;
        long var31 = var29 >>> 32;
        long var33 = ((long) arg2[7] & 0xFFFFFFFFL) + ((long) arg0[7] & 0xFFFFFFFFL) + ((long) arg1[7] & 0xFFFFFFFFL) + var31;
        arg2[7] = (int) var33;
        long var35 = var33 >>> 32;
        return (int) var35;
    }

    public static int addBothTo(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = 0L;
        long var8 = ((long) arg4[arg5] & 0xFFFFFFFFL) + ((long) arg0[arg1] & 0xFFFFFFFFL) + ((long) arg2[arg3] & 0xFFFFFFFFL) + var6;
        arg4[arg5] = (int) var8;
        long var10 = var8 >>> 32;
        long var12 = ((long) arg4[arg5 + 1] & 0xFFFFFFFFL) + ((long) arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var10;
        arg4[arg5 + 1] = (int) var12;
        long var14 = var12 >>> 32;
        long var16 = ((long) arg4[arg5 + 2] & 0xFFFFFFFFL) + ((long) arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 2] & 0xFFFFFFFFL) + var14;
        arg4[arg5 + 2] = (int) var16;
        long var18 = var16 >>> 32;
        long var20 = ((long) arg4[arg5 + 3] & 0xFFFFFFFFL) + ((long) arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 3] & 0xFFFFFFFFL) + var18;
        arg4[arg5 + 3] = (int) var20;
        long var22 = var20 >>> 32;
        long var24 = ((long) arg4[arg5 + 4] & 0xFFFFFFFFL) + ((long) arg0[arg1 + 4] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 4] & 0xFFFFFFFFL) + var22;
        arg4[arg5 + 4] = (int) var24;
        long var26 = var24 >>> 32;
        long var28 = ((long) arg4[arg5 + 5] & 0xFFFFFFFFL) + ((long) arg0[arg1 + 5] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 5] & 0xFFFFFFFFL) + var26;
        arg4[arg5 + 5] = (int) var28;
        long var30 = var28 >>> 32;
        long var32 = ((long) arg4[arg5 + 6] & 0xFFFFFFFFL) + ((long) arg0[arg1 + 6] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 6] & 0xFFFFFFFFL) + var30;
        arg4[arg5 + 6] = (int) var32;
        long var34 = var32 >>> 32;
        long var36 = ((long) arg4[arg5 + 7] & 0xFFFFFFFFL) + ((long) arg0[arg1 + 7] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 7] & 0xFFFFFFFFL) + var34;
        arg4[arg5 + 7] = (int) var36;
        long var38 = var36 >>> 32;
        return (int) var38;
    }

    public static boolean isOne(int[] arg0) {
        if (arg0[0] != 1) {
            return false;
        }
        for (int var1 = 1; var1 < 8; var1++) {
            if (arg0[var1] != 0) {
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
        long var31 = ((long) arg0[arg1 + 6] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 6] & 0xFFFFFFFFL) + var29;
        arg2[arg3 + 6] = (int) var31;
        long var33 = var31 >>> 32;
        long var35 = ((long) arg0[arg1 + 7] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 7] & 0xFFFFFFFFL) + var33;
        arg2[arg3 + 7] = (int) var35;
        long var37 = var35 >>> 32;
        return (int) var37;
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
        long var30 = ((long) arg0[arg1 + 6] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 6] & 0xFFFFFFFFL) + var28;
        arg0[arg1 + 6] = (int) var30;
        arg2[arg3 + 6] = (int) var30;
        long var32 = var30 >>> 32;
        long var34 = ((long) arg0[arg1 + 7] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 7] & 0xFFFFFFFFL) + var32;
        arg0[arg1 + 7] = (int) var34;
        arg2[arg3 + 7] = (int) var34;
        long var36 = var34 >>> 32;
        return (int) var36;
    }

    public static void copy(int[] arg0, int[] arg1) {
        arg1[0] = arg0[0];
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
        arg1[3] = arg0[3];
        arg1[4] = arg0[4];
        arg1[5] = arg0[5];
        arg1[6] = arg0[6];
        arg1[7] = arg0[7];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static boolean eq64(long[] arg0, long[] arg1) {
        for (int var2 = 3; var2 >= 0; var2--) {
            if (arg0[var2] != arg1[var2]) {
                return false;
            }
        }
        return true;
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
        for (int var2 = 7; var2 >= 0; var2--) {
            if (arg0[var2] != arg1[var2]) {
                return false;
            }
        }
        return true;
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
        long var29 = ((long) arg0[6] & 0xFFFFFFFFL) + ((long) arg1[6] & 0xFFFFFFFFL) + var27;
        arg2[6] = (int) var29;
        long var31 = var29 >>> 32;
        long var33 = ((long) arg0[7] & 0xFFFFFFFFL) + ((long) arg1[7] & 0xFFFFFFFFL) + var31;
        arg2[7] = (int) var33;
        long var35 = var33 >>> 32;
        return (int) var35;
    }

    public static int[] fromBigInteger(BigInteger arg0) {
        if (arg0.signum() < 0 || arg0.bitLength() > 256) {
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
        if (arg0.signum() < 0 || arg0.bitLength() > 256) {
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
        return var19 == 0L ? 0 : Nat.incAt(8, arg2, arg3, 3);
    }

    public static int getBit(int[] arg0, int arg1) {
        if (arg1 == 0) {
            return arg0[0] & 0x1;
        } else if ((arg1 & 0xFF) == arg1) {
            int var2 = arg1 >>> 5;
            int var3 = arg1 & 0x1F;
            return arg0[var2] >>> var3 & 0x1;
        } else {
            return 0;
        }
    }

    public static boolean gte(int[] arg0, int arg1, int[] arg2, int arg3) {
        for (int var4 = 7; var4 >= 0; var4--) {
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

    public static int mulAddTo(int[] arg0, int[] arg1, int[] arg2) {
        long var3 = (long) arg1[0] & 0xFFFFFFFFL;
        long var5 = (long) arg1[1] & 0xFFFFFFFFL;
        long var7 = (long) arg1[2] & 0xFFFFFFFFL;
        long var9 = (long) arg1[3] & 0xFFFFFFFFL;
        long var11 = (long) arg1[4] & 0xFFFFFFFFL;
        long var13 = (long) arg1[5] & 0xFFFFFFFFL;
        long var15 = (long) arg1[6] & 0xFFFFFFFFL;
        long var17 = (long) arg1[7] & 0xFFFFFFFFL;
        long var19 = 0L;
        for (int var21 = 0; var21 < 8; var21++) {
            long var22 = 0L;
            long var24 = (long) arg0[var21] & 0xFFFFFFFFL;
            long var26 = ((long) arg2[var21] & 0xFFFFFFFFL) + var3 * var24 + var22;
            arg2[var21] = (int) var26;
            long var28 = var26 >>> 32;
            long var30 = ((long) arg2[var21 + 1] & 0xFFFFFFFFL) + var5 * var24 + var28;
            arg2[var21 + 1] = (int) var30;
            long var32 = var30 >>> 32;
            long var34 = ((long) arg2[var21 + 2] & 0xFFFFFFFFL) + var7 * var24 + var32;
            arg2[var21 + 2] = (int) var34;
            long var36 = var34 >>> 32;
            long var38 = ((long) arg2[var21 + 3] & 0xFFFFFFFFL) + var9 * var24 + var36;
            arg2[var21 + 3] = (int) var38;
            long var40 = var38 >>> 32;
            long var42 = ((long) arg2[var21 + 4] & 0xFFFFFFFFL) + var11 * var24 + var40;
            arg2[var21 + 4] = (int) var42;
            long var44 = var42 >>> 32;
            long var46 = ((long) arg2[var21 + 5] & 0xFFFFFFFFL) + var13 * var24 + var44;
            arg2[var21 + 5] = (int) var46;
            long var48 = var46 >>> 32;
            long var50 = ((long) arg2[var21 + 6] & 0xFFFFFFFFL) + var15 * var24 + var48;
            arg2[var21 + 6] = (int) var50;
            long var52 = var50 >>> 32;
            long var54 = ((long) arg2[var21 + 7] & 0xFFFFFFFFL) + var17 * var24 + var52;
            arg2[var21 + 7] = (int) var54;
            long var56 = var54 >>> 32;
            long var58 = ((long) arg2[var21 + 8] & 0xFFFFFFFFL) + var19 + var56;
            arg2[var21 + 8] = (int) var58;
            var19 = var58 >>> 32;
        }
        return (int) var19;
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
        long var32 = ((long) arg0[arg1 + 6] & 0xFFFFFFFFL) - ((long) arg2[arg3 + 6] & 0xFFFFFFFFL) + var30;
        arg4[arg5 + 6] = (int) var32;
        long var34 = var32 >> 32;
        long var36 = ((long) arg0[arg1 + 7] & 0xFFFFFFFFL) - ((long) arg2[arg3 + 7] & 0xFFFFFFFFL) + var34;
        arg4[arg5 + 7] = (int) var36;
        long var38 = var36 >> 32;
        return (int) var38;
    }

    public static boolean isZero(int[] arg0) {
        for (int var1 = 0; var1 < 8; var1++) {
            if (arg0[var1] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] arg0) {
        for (int var1 = 0; var1 < 4; var1++) {
            if (arg0[var1] != 0L) {
                return false;
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
        long var15 = (long) arg1[6] & 0xFFFFFFFFL;
        long var17 = (long) arg1[7] & 0xFFFFFFFFL;
        long var19 = 0L;
        long var21 = (long) arg0[0] & 0xFFFFFFFFL;
        long var23 = var3 * var21 + var19;
        arg2[0] = (int) var23;
        long var25 = var23 >>> 32;
        long var27 = var5 * var21 + var25;
        arg2[1] = (int) var27;
        long var29 = var27 >>> 32;
        long var31 = var7 * var21 + var29;
        arg2[2] = (int) var31;
        long var33 = var31 >>> 32;
        long var35 = var9 * var21 + var33;
        arg2[3] = (int) var35;
        long var37 = var35 >>> 32;
        long var39 = var11 * var21 + var37;
        arg2[4] = (int) var39;
        long var41 = var39 >>> 32;
        long var43 = var13 * var21 + var41;
        arg2[5] = (int) var43;
        long var45 = var43 >>> 32;
        long var47 = var15 * var21 + var45;
        arg2[6] = (int) var47;
        long var49 = var47 >>> 32;
        long var51 = var17 * var21 + var49;
        arg2[7] = (int) var51;
        long var53 = var51 >>> 32;
        arg2[8] = (int) var53;
        for (int var55 = 1; var55 < 8; var55++) {
            long var56 = 0L;
            long var58 = (long) arg0[var55] & 0xFFFFFFFFL;
            long var60 = ((long) arg2[var55] & 0xFFFFFFFFL) + var3 * var58 + var56;
            arg2[var55] = (int) var60;
            long var62 = var60 >>> 32;
            long var64 = ((long) arg2[var55 + 1] & 0xFFFFFFFFL) + var5 * var58 + var62;
            arg2[var55 + 1] = (int) var64;
            long var66 = var64 >>> 32;
            long var68 = ((long) arg2[var55 + 2] & 0xFFFFFFFFL) + var7 * var58 + var66;
            arg2[var55 + 2] = (int) var68;
            long var70 = var68 >>> 32;
            long var72 = ((long) arg2[var55 + 3] & 0xFFFFFFFFL) + var9 * var58 + var70;
            arg2[var55 + 3] = (int) var72;
            long var74 = var72 >>> 32;
            long var76 = ((long) arg2[var55 + 4] & 0xFFFFFFFFL) + var11 * var58 + var74;
            arg2[var55 + 4] = (int) var76;
            long var78 = var76 >>> 32;
            long var80 = ((long) arg2[var55 + 5] & 0xFFFFFFFFL) + var13 * var58 + var78;
            arg2[var55 + 5] = (int) var80;
            long var82 = var80 >>> 32;
            long var84 = ((long) arg2[var55 + 6] & 0xFFFFFFFFL) + var15 * var58 + var82;
            arg2[var55 + 6] = (int) var84;
            long var86 = var84 >>> 32;
            long var88 = ((long) arg2[var55 + 7] & 0xFFFFFFFFL) + var17 * var58 + var86;
            arg2[var55 + 7] = (int) var88;
            long var90 = var88 >>> 32;
            arg2[var55 + 8] = (int) var90;
        }
    }

    public static void mul(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = (long) arg2[arg3] & 0xFFFFFFFFL;
        long var8 = (long) arg2[arg3 + 1] & 0xFFFFFFFFL;
        long var10 = (long) arg2[arg3 + 2] & 0xFFFFFFFFL;
        long var12 = (long) arg2[arg3 + 3] & 0xFFFFFFFFL;
        long var14 = (long) arg2[arg3 + 4] & 0xFFFFFFFFL;
        long var16 = (long) arg2[arg3 + 5] & 0xFFFFFFFFL;
        long var18 = (long) arg2[arg3 + 6] & 0xFFFFFFFFL;
        long var20 = (long) arg2[arg3 + 7] & 0xFFFFFFFFL;
        long var22 = 0L;
        long var24 = (long) arg0[arg1] & 0xFFFFFFFFL;
        long var26 = var6 * var24 + var22;
        arg4[arg5] = (int) var26;
        long var28 = var26 >>> 32;
        long var30 = var8 * var24 + var28;
        arg4[arg5 + 1] = (int) var30;
        long var32 = var30 >>> 32;
        long var34 = var10 * var24 + var32;
        arg4[arg5 + 2] = (int) var34;
        long var36 = var34 >>> 32;
        long var38 = var12 * var24 + var36;
        arg4[arg5 + 3] = (int) var38;
        long var40 = var38 >>> 32;
        long var42 = var14 * var24 + var40;
        arg4[arg5 + 4] = (int) var42;
        long var44 = var42 >>> 32;
        long var46 = var16 * var24 + var44;
        arg4[arg5 + 5] = (int) var46;
        long var48 = var46 >>> 32;
        long var50 = var18 * var24 + var48;
        arg4[arg5 + 6] = (int) var50;
        long var52 = var50 >>> 32;
        long var54 = var20 * var24 + var52;
        arg4[arg5 + 7] = (int) var54;
        long var56 = var54 >>> 32;
        arg4[arg5 + 8] = (int) var56;
        for (int var58 = 1; var58 < 8; var58++) {
            arg5++;
            long var59 = 0L;
            long var61 = (long) arg0[arg1 + var58] & 0xFFFFFFFFL;
            long var63 = ((long) arg4[arg5] & 0xFFFFFFFFL) + var6 * var61 + var59;
            arg4[arg5] = (int) var63;
            long var65 = var63 >>> 32;
            long var67 = ((long) arg4[arg5 + 1] & 0xFFFFFFFFL) + var8 * var61 + var65;
            arg4[arg5 + 1] = (int) var67;
            long var69 = var67 >>> 32;
            long var71 = ((long) arg4[arg5 + 2] & 0xFFFFFFFFL) + var10 * var61 + var69;
            arg4[arg5 + 2] = (int) var71;
            long var73 = var71 >>> 32;
            long var75 = ((long) arg4[arg5 + 3] & 0xFFFFFFFFL) + var12 * var61 + var73;
            arg4[arg5 + 3] = (int) var75;
            long var77 = var75 >>> 32;
            long var79 = ((long) arg4[arg5 + 4] & 0xFFFFFFFFL) + var14 * var61 + var77;
            arg4[arg5 + 4] = (int) var79;
            long var81 = var79 >>> 32;
            long var83 = ((long) arg4[arg5 + 5] & 0xFFFFFFFFL) + var16 * var61 + var81;
            arg4[arg5 + 5] = (int) var83;
            long var85 = var83 >>> 32;
            long var87 = ((long) arg4[arg5 + 6] & 0xFFFFFFFFL) + var18 * var61 + var85;
            arg4[arg5 + 6] = (int) var87;
            long var89 = var87 >>> 32;
            long var91 = ((long) arg4[arg5 + 7] & 0xFFFFFFFFL) + var20 * var61 + var89;
            arg4[arg5 + 7] = (int) var91;
            long var93 = var91 >>> 32;
            arg4[arg5 + 8] = (int) var93;
        }
    }

    public static boolean gte(int[] arg0, int[] arg1) {
        for (int var2 = 7; var2 >= 0; var2--) {
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

    public static BigInteger toBigInteger64(long[] arg0) {
        byte[] var1 = new byte[32];
        for (int var2 = 0; var2 < 4; var2++) {
            long var3 = arg0[var2];
            if (var3 != 0L) {
                Pack.longToBigEndian(var3, var1, 3 - var2 << 3);
            }
        }
        return new BigInteger(1, var1);
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
        long var47 = (long) arg1[arg2 + 6] & 0xFFFFFFFFL;
        long var49 = ((long) arg3[arg4 + 6] & 0xFFFFFFFFL) + var9 * var47 + var41 + var45;
        arg5[arg6 + 6] = (int) var49;
        long var51 = var49 >>> 32;
        long var53 = (long) arg1[arg2 + 7] & 0xFFFFFFFFL;
        long var55 = ((long) arg3[arg4 + 7] & 0xFFFFFFFFL) + var9 * var53 + var47 + var51;
        arg5[arg6 + 7] = (int) var55;
        long var57 = var55 >>> 32;
        return var53 + var57;
    }

    public static int mulByWord(int arg0, int[] arg1) {
        long var2 = 0L;
        long var4 = (long) arg0 & 0xFFFFFFFFL;
        long var6 = ((long) arg1[0] & 0xFFFFFFFFL) * var4 + var2;
        arg1[0] = (int) var6;
        long var8 = var6 >>> 32;
        long var10 = ((long) arg1[1] & 0xFFFFFFFFL) * var4 + var8;
        arg1[1] = (int) var10;
        long var12 = var10 >>> 32;
        long var14 = ((long) arg1[2] & 0xFFFFFFFFL) * var4 + var12;
        arg1[2] = (int) var14;
        long var16 = var14 >>> 32;
        long var18 = ((long) arg1[3] & 0xFFFFFFFFL) * var4 + var16;
        arg1[3] = (int) var18;
        long var20 = var18 >>> 32;
        long var22 = ((long) arg1[4] & 0xFFFFFFFFL) * var4 + var20;
        arg1[4] = (int) var22;
        long var24 = var22 >>> 32;
        long var26 = ((long) arg1[5] & 0xFFFFFFFFL) * var4 + var24;
        arg1[5] = (int) var26;
        long var28 = var26 >>> 32;
        long var30 = ((long) arg1[6] & 0xFFFFFFFFL) * var4 + var28;
        arg1[6] = (int) var30;
        long var32 = var30 >>> 32;
        long var34 = ((long) arg1[7] & 0xFFFFFFFFL) * var4 + var32;
        arg1[7] = (int) var34;
        long var36 = var34 >>> 32;
        return (int) var36;
    }

    public static int mulByWordAddTo(int arg0, int[] arg1, int[] arg2) {
        long var3 = 0L;
        long var5 = (long) arg0 & 0xFFFFFFFFL;
        long var7 = ((long) arg1[0] & 0xFFFFFFFFL) + ((long) arg2[0] & 0xFFFFFFFFL) * var5 + var3;
        arg2[0] = (int) var7;
        long var9 = var7 >>> 32;
        long var11 = ((long) arg1[1] & 0xFFFFFFFFL) + ((long) arg2[1] & 0xFFFFFFFFL) * var5 + var9;
        arg2[1] = (int) var11;
        long var13 = var11 >>> 32;
        long var15 = ((long) arg1[2] & 0xFFFFFFFFL) + ((long) arg2[2] & 0xFFFFFFFFL) * var5 + var13;
        arg2[2] = (int) var15;
        long var17 = var15 >>> 32;
        long var19 = ((long) arg1[3] & 0xFFFFFFFFL) + ((long) arg2[3] & 0xFFFFFFFFL) * var5 + var17;
        arg2[3] = (int) var19;
        long var21 = var19 >>> 32;
        long var23 = ((long) arg1[4] & 0xFFFFFFFFL) + ((long) arg2[4] & 0xFFFFFFFFL) * var5 + var21;
        arg2[4] = (int) var23;
        long var25 = var23 >>> 32;
        long var27 = ((long) arg1[5] & 0xFFFFFFFFL) + ((long) arg2[5] & 0xFFFFFFFFL) * var5 + var25;
        arg2[5] = (int) var27;
        long var29 = var27 >>> 32;
        long var31 = ((long) arg1[6] & 0xFFFFFFFFL) + ((long) arg2[6] & 0xFFFFFFFFL) * var5 + var29;
        arg2[6] = (int) var31;
        long var33 = var31 >>> 32;
        long var35 = ((long) arg1[7] & 0xFFFFFFFFL) + ((long) arg2[7] & 0xFFFFFFFFL) * var5 + var33;
        arg2[7] = (int) var35;
        long var37 = var35 >>> 32;
        return (int) var37;
    }

    public static int mulWordAddTo(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
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
        long var33 = ((long) arg3[arg4 + 6] & 0xFFFFFFFFL) + ((long) arg1[arg2 + 6] & 0xFFFFFFFFL) * var7 + var31;
        arg3[arg4 + 6] = (int) var33;
        long var35 = var33 >>> 32;
        long var37 = ((long) arg3[arg4 + 7] & 0xFFFFFFFFL) + ((long) arg1[arg2 + 7] & 0xFFFFFFFFL) * var7 + var35;
        arg3[arg4 + 7] = (int) var37;
        long var39 = var37 >>> 32;
        return (int) var39;
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
        return var27 == 0L ? 0 : Nat.incAt(8, arg2, arg3, 4);
    }

    public static int add(int[] arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        long var6 = 0L;
        long var8 = ((long) arg0[arg1] & 0xFFFFFFFFL) + ((long) arg2[arg3] & 0xFFFFFFFFL) + var6;
        arg4[arg5] = (int) var8;
        long var10 = var8 >>> 32;
        long var12 = ((long) arg0[arg1 + 1] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 1] & 0xFFFFFFFFL) + var10;
        arg4[arg5 + 1] = (int) var12;
        long var14 = var12 >>> 32;
        long var16 = ((long) arg0[arg1 + 2] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 2] & 0xFFFFFFFFL) + var14;
        arg4[arg5 + 2] = (int) var16;
        long var18 = var16 >>> 32;
        long var20 = ((long) arg0[arg1 + 3] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 3] & 0xFFFFFFFFL) + var18;
        arg4[arg5 + 3] = (int) var20;
        long var22 = var20 >>> 32;
        long var24 = ((long) arg0[arg1 + 4] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 4] & 0xFFFFFFFFL) + var22;
        arg4[arg5 + 4] = (int) var24;
        long var26 = var24 >>> 32;
        long var28 = ((long) arg0[arg1 + 5] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 5] & 0xFFFFFFFFL) + var26;
        arg4[arg5 + 5] = (int) var28;
        long var30 = var28 >>> 32;
        long var32 = ((long) arg0[arg1 + 6] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 6] & 0xFFFFFFFFL) + var30;
        arg4[arg5 + 6] = (int) var32;
        long var34 = var32 >>> 32;
        long var36 = ((long) arg0[arg1 + 7] & 0xFFFFFFFFL) + ((long) arg2[arg3 + 7] & 0xFFFFFFFFL) + var34;
        arg4[arg5 + 7] = (int) var36;
        long var38 = var36 >>> 32;
        return (int) var38;
    }

    public static boolean isOne64(long[] arg0) {
        if (arg0[0] != 1L) {
            return false;
        }
        for (int var1 = 1; var1 < 4; var1++) {
            if (arg0[var1] != 0L) {
                return false;
            }
        }
        return true;
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
        } while (var8 < 8);
        return (int) var4;
    }

    public static void square(int[] arg0, int[] arg1) {
        long var2 = (long) arg0[0] & 0xFFFFFFFFL;
        int var4 = 0;
        int var5 = 7;
        int var6 = 16;
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
        long var112 = var108 & 0xFFFFFFFFL;
        long var114 = (var110 >>> 32) + var42 * var94 + var98;
        long var116 = var110 & 0xFFFFFFFFL;
        long var118 = (var114 >>> 32) + var66 * var94 + var102;
        long var120 = var114 & 0xFFFFFFFFL;
        long var122 = (var118 >>> 32) + var100;
        long var124 = var118 & 0xFFFFFFFFL;
        long var126 = (long) arg0[6] & 0xFFFFFFFFL;
        long var128 = (var122 >>> 32) + ((long) arg1[11] & 0xFFFFFFFFL);
        long var130 = var122 & 0xFFFFFFFFL;
        long var132 = (var128 >>> 32) + ((long) arg1[12] & 0xFFFFFFFFL);
        long var134 = var128 & 0xFFFFFFFFL;
        long var136 = var2 * var126 + var112;
        int var138 = (int) var136;
        arg1[6] = var138 << 1 | var107;
        int var139 = var138 >>> 31;
        long var140 = (var136 >>> 32) + var16 * var126 + var116;
        long var142 = (var140 >>> 32) + var26 * var126 + var120;
        long var144 = var140 & 0xFFFFFFFFL;
        long var146 = (var142 >>> 32) + var42 * var126 + var124;
        long var148 = var142 & 0xFFFFFFFFL;
        long var150 = (var146 >>> 32) + var66 * var126 + var130;
        long var152 = var146 & 0xFFFFFFFFL;
        long var154 = (var150 >>> 32) + var94 * var126 + var134;
        long var156 = var150 & 0xFFFFFFFFL;
        long var158 = (var154 >>> 32) + var132;
        long var160 = var154 & 0xFFFFFFFFL;
        long var162 = (long) arg0[7] & 0xFFFFFFFFL;
        long var164 = (var158 >>> 32) + ((long) arg1[13] & 0xFFFFFFFFL);
        long var166 = var158 & 0xFFFFFFFFL;
        long var168 = (var164 >>> 32) + ((long) arg1[14] & 0xFFFFFFFFL);
        long var170 = var164 & 0xFFFFFFFFL;
        long var172 = var2 * var162 + var144;
        int var174 = (int) var172;
        arg1[7] = var174 << 1 | var139;
        int var175 = var174 >>> 31;
        long var176 = (var172 >>> 32) + var16 * var162 + var148;
        long var178 = (var176 >>> 32) + var26 * var162 + var152;
        long var180 = (var178 >>> 32) + var42 * var162 + var156;
        long var182 = (var180 >>> 32) + var66 * var162 + var160;
        long var184 = (var182 >>> 32) + var94 * var162 + var166;
        long var186 = (var184 >>> 32) + var126 * var162 + var170;
        long var188 = (var186 >>> 32) + var168;
        int var190 = (int) var176;
        arg1[8] = var190 << 1 | var175;
        int var191 = var190 >>> 31;
        int var192 = (int) var178;
        arg1[9] = var192 << 1 | var191;
        int var193 = var192 >>> 31;
        int var194 = (int) var180;
        arg1[10] = var194 << 1 | var193;
        int var195 = var194 >>> 31;
        int var196 = (int) var182;
        arg1[11] = var196 << 1 | var195;
        int var197 = var196 >>> 31;
        int var198 = (int) var184;
        arg1[12] = var198 << 1 | var197;
        int var199 = var198 >>> 31;
        int var200 = (int) var186;
        arg1[13] = var200 << 1 | var199;
        int var201 = var200 >>> 31;
        int var202 = (int) var188;
        arg1[14] = var202 << 1 | var201;
        int var203 = var202 >>> 31;
        int var204 = arg1[15] + (int) (var188 >>> 32);
        arg1[15] = var204 << 1 | var203;
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
        long var28 = ((long) arg0[6] & 0xFFFFFFFFL) + ((long) arg1[6] & 0xFFFFFFFFL) + var26;
        arg1[6] = (int) var28;
        long var30 = var28 >>> 32;
        long var32 = ((long) arg0[7] & 0xFFFFFFFFL) + ((long) arg1[7] & 0xFFFFFFFFL) + var30;
        arg1[7] = (int) var32;
        long var34 = var32 >>> 32;
        return (int) var34;
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
        return var20 == 0L ? 0 : Nat.incAt(8, arg2, arg3, 3);
    }

    public static void copy64(long[] arg0, long[] arg1) {
        arg1[0] = arg0[0];
        arg1[1] = arg0[1];
        arg1[2] = arg0[2];
        arg1[3] = arg0[3];
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
        long var29 = ((long) arg2[6] & 0xFFFFFFFFL) - ((long) arg0[6] & 0xFFFFFFFFL) - ((long) arg1[6] & 0xFFFFFFFFL) + var27;
        arg2[6] = (int) var29;
        long var31 = var29 >> 32;
        long var33 = ((long) arg2[7] & 0xFFFFFFFFL) - ((long) arg0[7] & 0xFFFFFFFFL) - ((long) arg1[7] & 0xFFFFFFFFL) + var31;
        arg2[7] = (int) var33;
        long var35 = var33 >> 32;
        return (int) var35;
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
        long var28 = ((long) arg1[6] & 0xFFFFFFFFL) - ((long) arg0[6] & 0xFFFFFFFFL) + var26;
        arg1[6] = (int) var28;
        long var30 = var28 >> 32;
        long var32 = ((long) arg1[7] & 0xFFFFFFFFL) - ((long) arg0[7] & 0xFFFFFFFFL) + var30;
        arg1[7] = (int) var32;
        long var34 = var32 >> 32;
        return (int) var34;
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
        long var30 = ((long) arg2[arg3 + 6] & 0xFFFFFFFFL) - ((long) arg0[arg1 + 6] & 0xFFFFFFFFL) + var28;
        arg2[arg3 + 6] = (int) var30;
        long var32 = var30 >> 32;
        long var34 = ((long) arg2[arg3 + 7] & 0xFFFFFFFFL) - ((long) arg0[arg1 + 7] & 0xFFFFFFFFL) + var32;
        arg2[arg3 + 7] = (int) var34;
        long var36 = var34 >> 32;
        return (int) var36;
    }

    public static BigInteger toBigInteger(int[] arg0) {
        byte[] var1 = new byte[32];
        for (int var2 = 0; var2 < 8; var2++) {
            int var3 = arg0[var2];
            if (var3 != 0) {
                Pack.intToBigEndian(var3, var1, 7 - var2 << 2);
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
        long var18 = (long) arg2[arg3 + 6] & 0xFFFFFFFFL;
        long var20 = (long) arg2[arg3 + 7] & 0xFFFFFFFFL;
        long var22 = 0L;
        for (int var24 = 0; var24 < 8; var24++) {
            long var25 = 0L;
            long var27 = (long) arg0[arg1 + var24] & 0xFFFFFFFFL;
            long var29 = ((long) arg4[arg5] & 0xFFFFFFFFL) + var6 * var27 + var25;
            arg4[arg5] = (int) var29;
            long var31 = var29 >>> 32;
            long var33 = ((long) arg4[arg5 + 1] & 0xFFFFFFFFL) + var8 * var27 + var31;
            arg4[arg5 + 1] = (int) var33;
            long var35 = var33 >>> 32;
            long var37 = ((long) arg4[arg5 + 2] & 0xFFFFFFFFL) + var10 * var27 + var35;
            arg4[arg5 + 2] = (int) var37;
            long var39 = var37 >>> 32;
            long var41 = ((long) arg4[arg5 + 3] & 0xFFFFFFFFL) + var12 * var27 + var39;
            arg4[arg5 + 3] = (int) var41;
            long var43 = var41 >>> 32;
            long var45 = ((long) arg4[arg5 + 4] & 0xFFFFFFFFL) + var14 * var27 + var43;
            arg4[arg5 + 4] = (int) var45;
            long var47 = var45 >>> 32;
            long var49 = ((long) arg4[arg5 + 5] & 0xFFFFFFFFL) + var16 * var27 + var47;
            arg4[arg5 + 5] = (int) var49;
            long var51 = var49 >>> 32;
            long var53 = ((long) arg4[arg5 + 6] & 0xFFFFFFFFL) + var18 * var27 + var51;
            arg4[arg5 + 6] = (int) var53;
            long var55 = var53 >>> 32;
            long var57 = ((long) arg4[arg5 + 7] & 0xFFFFFFFFL) + var20 * var27 + var55;
            arg4[arg5 + 7] = (int) var57;
            long var59 = var57 >>> 32;
            long var61 = ((long) arg4[arg5 + 8] & 0xFFFFFFFFL) + var22 + var59;
            arg4[arg5 + 8] = (int) var61;
            var22 = var61 >>> 32;
            arg5++;
        }
        return (int) var22;
    }

    public static void zero(int[] arg0) {
        arg0[0] = 0;
        arg0[1] = 0;
        arg0[2] = 0;
        arg0[3] = 0;
        arg0[4] = 0;
        arg0[5] = 0;
        arg0[6] = 0;
        arg0[7] = 0;
    }
}
