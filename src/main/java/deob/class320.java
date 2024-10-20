package deob;

@ObfuscatedName("lu")
public class class320 extends class209 {

    @ObfuscatedName("lu.aj")
    public static int field3826 = 0;

    @ObfuscatedName("lu.af")
    public static int field3828 = 0;

    @ObfuscatedName("lu.ah")
    public static int field3829 = 0;

    @ObfuscatedName("lu.ab")
    public static int field3830 = 0;

    @ObfuscatedName("lu.cu([III)V")
    public static void method5369(int[] arg0, int arg1, int arg2) {
        Statics.field3827 = arg0;
        Statics.field3825 = arg1;
        Statics.field3824 = arg2;
        method5371(0, 0, arg1, arg2);
    }

    @ObfuscatedName("lu.cl()V")
    public static void method5370() {
        field3829 = 0;
        field3826 = 0;
        field3830 = Statics.field3825;
        field3828 = Statics.field3824;
    }

    @ObfuscatedName("lu.cc(IIII)V")
    public static void method5371(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field3825) {
            arg2 = Statics.field3825;
        }
        if (arg3 > Statics.field3824) {
            arg3 = Statics.field3824;
        }
        field3829 = arg0;
        field3826 = arg1;
        field3830 = arg2;
        field3828 = arg3;
    }

    @ObfuscatedName("lu.di(IIII)V")
    public static void method5441(int arg0, int arg1, int arg2, int arg3) {
        if (field3829 < arg0) {
            field3829 = arg0;
        }
        if (field3826 < arg1) {
            field3826 = arg1;
        }
        if (field3830 > arg2) {
            field3830 = arg2;
        }
        if (field3828 > arg3) {
            field3828 = arg3;
        }
    }

    @ObfuscatedName("lu.da([I)V")
    public static void method5373(int[] arg0) {
        arg0[0] = field3829;
        arg0[1] = field3826;
        arg0[2] = field3830;
        arg0[3] = field3828;
    }

    @ObfuscatedName("lu.dr([I)V")
    public static void method5374(int[] arg0) {
        field3829 = arg0[0];
        field3826 = arg0[1];
        field3830 = arg0[2];
        field3828 = arg0[3];
    }

    @ObfuscatedName("lu.dd()V")
    public static void method5375() {
        int var0 = 0;
        int var1 = Statics.field3825 * Statics.field3824 - 7;
        while (var0 < var1) {
            Statics.field3827[var0++] = 0;
            Statics.field3827[var0++] = 0;
            Statics.field3827[var0++] = 0;
            Statics.field3827[var0++] = 0;
            Statics.field3827[var0++] = 0;
            Statics.field3827[var0++] = 0;
            Statics.field3827[var0++] = 0;
            Statics.field3827[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field3827[var0++] = 0;
        }
    }

    @ObfuscatedName("lu.dh(IIII)V")
    public static void method5376(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method5411(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3826) {
            var4 = field3826;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3828) {
            var5 = field3828;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var12 = arg0 - var8 + 1;
            if (var12 < field3829) {
                var12 = field3829;
            }
            int var13 = arg0 + var8;
            if (var13 > field3830) {
                var13 = field3830;
            }
            int var14 = Statics.field3825 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field3827[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field3829) {
                var21 = field3829;
            }
            int var22 = arg0 + var16;
            if (var22 > field3830 - 1) {
                var22 = field3830 - 1;
            }
            int var23 = Statics.field3825 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field3827[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("lu.dl(IIIII)V")
    public static void method5377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method5376(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field3826) {
            var9 = field3826;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3828) {
            var10 = field3828;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var17 = arg0 - var13 + 1;
            if (var17 < field3829) {
                var17 = field3829;
            }
            int var18 = arg0 + var13;
            if (var18 > field3830) {
                var18 = field3830;
            }
            int var19 = Statics.field3825 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field3827[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field3827[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field3827[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field3827[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field3829) {
                var30 = field3829;
            }
            int var31 = arg0 + var25;
            if (var31 > field3830 - 1) {
                var31 = field3830 - 1;
            }
            int var32 = Statics.field3825 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field3827[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field3827[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field3827[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field3827[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("lu.du(IIIIII)V")
    public static void method5384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3829) {
            arg2 -= field3829 - arg0;
            arg0 = field3829;
        }
        if (arg1 < field3826) {
            arg3 -= field3826 - arg1;
            arg1 = field3826;
        }
        if (arg0 + arg2 > field3830) {
            arg2 = field3830 - arg0;
        }
        if (arg1 + arg3 > field3828) {
            arg3 = field3828 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field3825 - arg2;
        int var9 = Statics.field3825 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field3827[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field3827[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("lu.dp(IIIII)V")
    public static void method5379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3829) {
            arg2 -= field3829 - arg0;
            arg0 = field3829;
        }
        if (arg1 < field3826) {
            arg3 -= field3826 - arg1;
            arg1 = field3826;
        }
        if (arg0 + arg2 > field3830) {
            arg2 = field3830 - arg0;
        }
        if (arg1 + arg3 > field3828) {
            arg3 = field3828 - arg1;
        }
        int var5 = Statics.field3825 - arg2;
        int var6 = Statics.field3825 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field3827[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("lu.dw(IIIIII)V")
    public static void method5380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3829) {
            arg2 -= field3829 - arg0;
            arg0 = field3829;
        }
        if (arg1 < field3826) {
            var6 += (field3826 - arg1) * var7;
            arg3 -= field3826 - arg1;
            arg1 = field3826;
        }
        if (arg0 + arg2 > field3830) {
            arg2 = field3830 - arg0;
        }
        if (arg1 + arg3 > field3828) {
            arg3 = field3828 - arg1;
        }
        int var8 = Statics.field3825 - arg2;
        int var9 = Statics.field3825 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field3827[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("lu.dg(IIIIIIII)V")
    public static void method5381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var8 = 0;
        int var9 = 65536 / arg3;
        if (arg0 < field3829) {
            arg2 -= field3829 - arg0;
            arg0 = field3829;
        }
        if (arg1 < field3826) {
            var8 += (field3826 - arg1) * var9;
            arg3 -= field3826 - arg1;
            arg1 = field3826;
        }
        if (arg0 + arg2 > field3830) {
            arg2 = field3830 - arg0;
        }
        if (arg1 + arg3 > field3828) {
            arg3 = field3828 - arg1;
        }
        int var10 = Statics.field3825 - arg2;
        int var11 = Statics.field3825 * arg1 + arg0;
        for (int var12 = -arg3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (arg6 * var13 + arg7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
                var11 += Statics.field3825;
                var8 += var9;
            } else {
                int var16 = ((arg4 & 0xFF00FF) * var13 + (arg5 & 0xFF00FF) * var14 & 0xFF00FF00) + ((arg4 & 0xFF00) * var13 + (arg5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
                int var17 = 255 - var15;
                int var18 = ((var16 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);
                for (int var19 = -arg2; var19 < 0; var19++) {
                    int var20 = Statics.field3827[var11];
                    if (var20 == 0) {
                        Statics.field3827[var11++] = var18;
                    } else {
                        int var21 = ((var20 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                        Statics.field3827[var11++] = var18 + var21;
                    }
                }
                var11 += var10;
                var8 += var9;
            }
        }
    }

    @ObfuscatedName("lu.db(IIIIII[BIZ)V")
    public static void method5382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field3825 || arg1 >= Statics.field3824) {
            return;
        }
        int var9 = 0;
        int var10 = 0;
        if (arg0 < 0) {
            var9 -= arg0;
            arg2 += arg0;
        }
        if (arg1 < 0) {
            var10 -= arg1;
            arg3 += arg1;
        }
        if (arg0 + arg2 > Statics.field3825) {
            arg2 = Statics.field3825 - arg0;
        }
        if (arg1 + arg3 > Statics.field3824) {
            arg3 = Statics.field3824 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field3825 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field3825 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field3827[var25++] = arg4;
                    } else {
                        Statics.field3827[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field3825 + arg0 + var9;
        for (int var16 = arg1 + var10; var16 < arg1 + var10 + arg3; var16++) {
            for (int var17 = arg0 + var9; var17 < arg0 + var9 + arg2; var17++) {
                int var18 = (var16 - arg1) % var11;
                int var19 = (var17 - arg0) % arg7;
                int var20 = arg4;
                if (arg6[arg7 * var18 + var19] != 0) {
                    var20 = arg5;
                }
                int var21 = var20 >>> 24;
                int var22 = 255 - var21;
                int var23 = Statics.field3827[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field3827[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("lu.df(IIIII)V")
    public static void method5383(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method5385(arg0, arg1, arg2, arg4);
        method5385(arg0, arg1 + arg3 - 1, arg2, arg4);
        method5414(arg0, arg1, arg3, arg4);
        method5414(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("lu.do(IIIIII)V")
    public static void method5397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method5368(arg0, arg1, arg2, arg4, arg5);
        method5368(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method5388(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method5388(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("lu.dj(IIII)V")
    public static void method5385(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3826 || arg1 >= field3828) {
            return;
        }
        if (arg0 < field3829) {
            arg2 -= field3829 - arg0;
            arg0 = field3829;
        }
        if (arg0 + arg2 > field3830) {
            arg2 = field3830 - arg0;
        }
        int var4 = Statics.field3825 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3827[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("lu.de(IIIII)V")
    public static void method5368(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3826 || arg1 >= field3828) {
            return;
        }
        if (arg0 < field3829) {
            arg2 -= field3829 - arg0;
            arg0 = field3829;
        }
        if (arg0 + arg2 > field3830) {
            arg2 = field3830 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3825 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3827[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3827[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3827[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3827[var9++] = var14;
        }
    }

    @ObfuscatedName("lu.dn(IIII)V")
    public static void method5414(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3829 || arg0 >= field3830) {
            return;
        }
        if (arg1 < field3826) {
            arg2 -= field3826 - arg1;
            arg1 = field3826;
        }
        if (arg1 + arg2 > field3828) {
            arg2 = field3828 - arg1;
        }
        int var4 = Statics.field3825 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3827[Statics.field3825 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("lu.dt(IIIII)V")
    public static void method5388(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3829 || arg0 >= field3830) {
            return;
        }
        if (arg1 < field3826) {
            arg2 -= field3826 - arg1;
            arg1 = field3826;
        }
        if (arg1 + arg2 > field3828) {
            arg2 = field3828 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3825 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3827[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3827[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3827[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3827[var9] = var14;
            var9 += Statics.field3825;
        }
    }

    @ObfuscatedName("lu.dx(IIIII)V")
    public static void method5389(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method5385(arg0, arg1, var5 + 1, arg4);
            } else {
                method5385(arg0 + var5, arg1, -var5 + 1, arg4);
            }
        } else if (var5 != 0) {
            if (var5 + var6 < 0) {
                arg0 += var5;
                var5 = -var5;
                arg1 += var6;
                var6 = -var6;
            }
            if (var5 > var6) {
                int var7 = arg1 << 16;
                int var8 = var7 + 32768;
                int var9 = var6 << 16;
                int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
                int var11 = arg0 + var5;
                if (arg0 < field3829) {
                    var8 += (field3829 - arg0) * var10;
                    arg0 = field3829;
                }
                if (var11 >= field3830) {
                    var11 = field3830 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3826 && var12 < field3828) {
                        Statics.field3827[Statics.field3825 * var12 + arg0] = arg4;
                    }
                    var8 += var10;
                    arg0++;
                }
            } else {
                int var13 = arg0 << 16;
                int var14 = var13 + 32768;
                int var15 = var5 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg1 + var6;
                if (arg1 < field3826) {
                    var14 += (field3826 - arg1) * var16;
                    arg1 = field3826;
                }
                if (var17 >= field3828) {
                    var17 = field3828 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3829 && var18 < field3830) {
                        Statics.field3827[Statics.field3825 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method5414(arg0, arg1, var6 + 1, arg4);
        } else {
            method5414(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("lu.dv(III)V")
    public static void method5411(int arg0, int arg1, int arg2) {
        if (arg0 >= field3829 && arg1 >= field3826 && arg0 < field3830 && arg1 < field3828) {
            Statics.field3827[Statics.field3825 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("lu.dz(III[I[I)V")
    public static void method5372(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field3825 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field3827[var7++] = arg2;
            }
            var5 += Statics.field3825;
        }
    }
}
