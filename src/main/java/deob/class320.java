package deob;

@ObfuscatedName("lo")
public class class320 extends class209 {

    @ObfuscatedName("lo.aa")
    public static int field3823 = 0;

    @ObfuscatedName("lo.ag")
    public static int field3822 = 0;

    @ObfuscatedName("lo.av")
    public static int field3825 = 0;

    @ObfuscatedName("lo.am")
    public static int field3824 = 0;

    @ObfuscatedName("lo.cp([III)V")
    public static void method5362(int[] arg0, int arg1, int arg2) {
        Statics.field3826 = arg0;
        Statics.field3821 = arg1;
        Statics.field3820 = arg2;
        method5364(0, 0, arg1, arg2);
    }

    @ObfuscatedName("lo.cs()V")
    public static void method5363() {
        field3825 = 0;
        field3823 = 0;
        field3824 = Statics.field3821;
        field3822 = Statics.field3820;
    }

    @ObfuscatedName("lo.cx(IIII)V")
    public static void method5364(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field3821) {
            arg2 = Statics.field3821;
        }
        if (arg3 > Statics.field3820) {
            arg3 = Statics.field3820;
        }
        field3825 = arg0;
        field3823 = arg1;
        field3824 = arg2;
        field3822 = arg3;
    }

    @ObfuscatedName("lo.cc(IIII)V")
    public static void method5371(int arg0, int arg1, int arg2, int arg3) {
        if (field3825 < arg0) {
            field3825 = arg0;
        }
        if (field3823 < arg1) {
            field3823 = arg1;
        }
        if (field3824 > arg2) {
            field3824 = arg2;
        }
        if (field3822 > arg3) {
            field3822 = arg3;
        }
    }

    @ObfuscatedName("lo.ck([I)V")
    public static void method5366(int[] arg0) {
        arg0[0] = field3825;
        arg0[1] = field3823;
        arg0[2] = field3824;
        arg0[3] = field3822;
    }

    @ObfuscatedName("lo.cn([I)V")
    public static void method5367(int[] arg0) {
        field3825 = arg0[0];
        field3823 = arg0[1];
        field3824 = arg0[2];
        field3822 = arg0[3];
    }

    @ObfuscatedName("lo.ce()V")
    public static void method5361() {
        int var0 = 0;
        int var1 = Statics.field3821 * Statics.field3820 - 7;
        while (var0 < var1) {
            Statics.field3826[var0++] = 0;
            Statics.field3826[var0++] = 0;
            Statics.field3826[var0++] = 0;
            Statics.field3826[var0++] = 0;
            Statics.field3826[var0++] = 0;
            Statics.field3826[var0++] = 0;
            Statics.field3826[var0++] = 0;
            Statics.field3826[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field3826[var0++] = 0;
        }
    }

    @ObfuscatedName("lo.cd(IIII)V")
    public static void method5365(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method5383(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3823) {
            var4 = field3823;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3822) {
            var5 = field3822;
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
            if (var12 < field3825) {
                var12 = field3825;
            }
            int var13 = arg0 + var8;
            if (var13 > field3824) {
                var13 = field3824;
            }
            int var14 = Statics.field3821 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field3826[var14++] = arg3;
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
            if (var21 < field3825) {
                var21 = field3825;
            }
            int var22 = arg0 + var16;
            if (var22 > field3824 - 1) {
                var22 = field3824 - 1;
            }
            int var23 = Statics.field3821 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field3826[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("lo.du(IIIII)V")
    public static void method5370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method5365(arg0, arg1, arg2, arg3);
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
        if (var9 < field3823) {
            var9 = field3823;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3822) {
            var10 = field3822;
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
            if (var17 < field3825) {
                var17 = field3825;
            }
            int var18 = arg0 + var13;
            if (var18 > field3824) {
                var18 = field3824;
            }
            int var19 = Statics.field3821 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field3826[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field3826[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field3826[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field3826[var19++] = var24;
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
            if (var30 < field3825) {
                var30 = field3825;
            }
            int var31 = arg0 + var25;
            if (var31 > field3824 - 1) {
                var31 = field3824 - 1;
            }
            int var32 = Statics.field3821 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field3826[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field3826[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field3826[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field3826[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("lo.dx(IIIIII)V")
    public static void method5412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3825) {
            arg2 -= field3825 - arg0;
            arg0 = field3825;
        }
        if (arg1 < field3823) {
            arg3 -= field3823 - arg1;
            arg1 = field3823;
        }
        if (arg0 + arg2 > field3824) {
            arg2 = field3824 - arg0;
        }
        if (arg1 + arg3 > field3822) {
            arg3 = field3822 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field3821 - arg2;
        int var9 = Statics.field3821 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field3826[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field3826[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("lo.dg(IIIII)V")
    public static void method5372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3825) {
            arg2 -= field3825 - arg0;
            arg0 = field3825;
        }
        if (arg1 < field3823) {
            arg3 -= field3823 - arg1;
            arg1 = field3823;
        }
        if (arg0 + arg2 > field3824) {
            arg2 = field3824 - arg0;
        }
        if (arg1 + arg3 > field3822) {
            arg3 = field3822 - arg1;
        }
        int var5 = Statics.field3821 - arg2;
        int var6 = Statics.field3821 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field3826[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("lo.dt(IIIIII)V")
    public static void method5390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3825) {
            arg2 -= field3825 - arg0;
            arg0 = field3825;
        }
        if (arg1 < field3823) {
            var6 += (field3823 - arg1) * var7;
            arg3 -= field3823 - arg1;
            arg1 = field3823;
        }
        if (arg0 + arg2 > field3824) {
            arg2 = field3824 - arg0;
        }
        if (arg1 + arg3 > field3822) {
            arg3 = field3822 - arg1;
        }
        int var8 = Statics.field3821 - arg2;
        int var9 = Statics.field3821 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field3826[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("lo.do(IIIIIIII)V")
    public static void method5427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var8 = 0;
        int var9 = 65536 / arg3;
        if (arg0 < field3825) {
            arg2 -= field3825 - arg0;
            arg0 = field3825;
        }
        if (arg1 < field3823) {
            var8 += (field3823 - arg1) * var9;
            arg3 -= field3823 - arg1;
            arg1 = field3823;
        }
        if (arg0 + arg2 > field3824) {
            arg2 = field3824 - arg0;
        }
        if (arg1 + arg3 > field3822) {
            arg3 = field3822 - arg1;
        }
        int var10 = Statics.field3821 - arg2;
        int var11 = Statics.field3821 * arg1 + arg0;
        for (int var12 = -arg3; var12 < 0; var12++) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (arg6 * var13 + arg7 * var14 & 0xFF00) >>> 8;
            if (var15 == 0) {
                var11 += Statics.field3821;
                var8 += var9;
            } else {
                int var16 = ((arg4 & 0xFF00FF) * var13 + (arg5 & 0xFF00FF) * var14 & 0xFF00FF00) + ((arg4 & 0xFF00) * var13 + (arg5 & 0xFF00) * var14 & 0xFF0000) >>> 8;
                int var17 = 255 - var15;
                int var18 = ((var16 & 0xFF00FF) * var15 >> 8 & 0xFF00FF) + ((var16 & 0xFF00) * var15 >> 8 & 0xFF00);
                for (int var19 = -arg2; var19 < 0; var19++) {
                    int var20 = Statics.field3826[var11];
                    if (var20 == 0) {
                        Statics.field3826[var11++] = var18;
                    } else {
                        int var21 = ((var20 & 0xFF00FF) * var17 >> 8 & 0xFF00FF) + ((var20 & 0xFF00) * var17 >> 8 & 0xFF00);
                        Statics.field3826[var11++] = var18 + var21;
                    }
                }
                var11 += var10;
                var8 += var9;
            }
        }
    }

    @ObfuscatedName("lo.dw(IIIIII[BIZ)V")
    public static void method5375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field3821 || arg1 >= Statics.field3820) {
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
        if (arg0 + arg2 > Statics.field3821) {
            arg2 = Statics.field3821 - arg0;
        }
        if (arg1 + arg3 > Statics.field3820) {
            arg3 = Statics.field3820 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field3821 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field3821 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field3826[var25++] = arg4;
                    } else {
                        Statics.field3826[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field3821 + arg0 + var9;
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
                int var23 = Statics.field3826[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field3826[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("lo.dh(IIIII)V")
    public static void method5428(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method5378(arg0, arg1, arg2, arg4);
        method5378(arg0, arg1 + arg3 - 1, arg2, arg4);
        method5380(arg0, arg1, arg3, arg4);
        method5380(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("lo.dj(IIIIII)V")
    public static void method5404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method5373(arg0, arg1, arg2, arg4, arg5);
        method5373(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method5377(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method5377(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("lo.dd(IIII)V")
    public static void method5378(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3823 || arg1 >= field3822) {
            return;
        }
        if (arg0 < field3825) {
            arg2 -= field3825 - arg0;
            arg0 = field3825;
        }
        if (arg0 + arg2 > field3824) {
            arg2 = field3824 - arg0;
        }
        int var4 = Statics.field3821 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3826[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("lo.dv(IIIII)V")
    public static void method5373(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3823 || arg1 >= field3822) {
            return;
        }
        if (arg0 < field3825) {
            arg2 -= field3825 - arg0;
            arg0 = field3825;
        }
        if (arg0 + arg2 > field3824) {
            arg2 = field3824 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3821 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3826[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3826[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3826[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3826[var9++] = var14;
        }
    }

    @ObfuscatedName("lo.dq(IIII)V")
    public static void method5380(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3825 || arg0 >= field3824) {
            return;
        }
        if (arg1 < field3823) {
            arg2 -= field3823 - arg1;
            arg1 = field3823;
        }
        if (arg1 + arg2 > field3822) {
            arg2 = field3822 - arg1;
        }
        int var4 = Statics.field3821 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3826[Statics.field3821 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("lo.dz(IIIII)V")
    public static void method5377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3825 || arg0 >= field3824) {
            return;
        }
        if (arg1 < field3823) {
            arg2 -= field3823 - arg1;
            arg1 = field3823;
        }
        if (arg1 + arg2 > field3822) {
            arg2 = field3822 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3821 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3826[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3826[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3826[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3826[var9] = var14;
            var9 += Statics.field3821;
        }
    }

    @ObfuscatedName("lo.dy(IIIII)V")
    public static void method5419(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method5378(arg0, arg1, var5 + 1, arg4);
            } else {
                method5378(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field3825) {
                    var8 += (field3825 - arg0) * var10;
                    arg0 = field3825;
                }
                if (var11 >= field3824) {
                    var11 = field3824 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3823 && var12 < field3822) {
                        Statics.field3826[Statics.field3821 * var12 + arg0] = arg4;
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
                if (arg1 < field3823) {
                    var14 += (field3823 - arg1) * var16;
                    arg1 = field3823;
                }
                if (var17 >= field3822) {
                    var17 = field3822 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3825 && var18 < field3824) {
                        Statics.field3826[Statics.field3821 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method5380(arg0, arg1, var6 + 1, arg4);
        } else {
            method5380(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("lo.di(III)V")
    public static void method5383(int arg0, int arg1, int arg2) {
        if (arg0 >= field3825 && arg1 >= field3823 && arg0 < field3824 && arg1 < field3822) {
            Statics.field3826[Statics.field3821 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("lo.dp(III[I[I)V")
    public static void method5445(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field3821 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field3826[var7++] = arg2;
            }
            var5 += Statics.field3821;
        }
    }
}
