package deob;

@ObfuscatedName("ho")
public class class220 extends class130 {

    @ObfuscatedName("ho.ae")
    public static int field3189 = 0;

    @ObfuscatedName("ho.au")
    public static int field3190 = 0;

    @ObfuscatedName("ho.aa")
    public static int field3188 = 0;

    @ObfuscatedName("ho.af")
    public static int field3191 = 0;

    @ObfuscatedName("ho.cy([III)V")
    public static void method3807(int[] arg0, int arg1, int arg2) {
        Statics.field3186 = arg0;
        Statics.field3187 = arg1;
        Statics.field3192 = arg2;
        method3809(0, 0, arg1, arg2);
    }

    @ObfuscatedName("ho.cg()V")
    public static void method3850() {
        field3188 = 0;
        field3189 = 0;
        field3191 = Statics.field3187;
        field3190 = Statics.field3192;
    }

    @ObfuscatedName("ho.cc(IIII)V")
    public static void method3809(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field3187) {
            arg2 = Statics.field3187;
        }
        if (arg3 > Statics.field3192) {
            arg3 = Statics.field3192;
        }
        field3188 = arg0;
        field3189 = arg1;
        field3191 = arg2;
        field3190 = arg3;
    }

    @ObfuscatedName("ho.cj(IIII)V")
    public static void method3839(int arg0, int arg1, int arg2, int arg3) {
        if (field3188 < arg0) {
            field3188 = arg0;
        }
        if (field3189 < arg1) {
            field3189 = arg1;
        }
        if (field3191 > arg2) {
            field3191 = arg2;
        }
        if (field3190 > arg3) {
            field3190 = arg3;
        }
    }

    @ObfuscatedName("ho.de([I)V")
    public static void method3811(int[] arg0) {
        arg0[0] = field3188;
        arg0[1] = field3189;
        arg0[2] = field3191;
        arg0[3] = field3190;
    }

    @ObfuscatedName("ho.dn([I)V")
    public static void method3819(int[] arg0) {
        field3188 = arg0[0];
        field3189 = arg0[1];
        field3191 = arg0[2];
        field3190 = arg0[3];
    }

    @ObfuscatedName("ho.dd()V")
    public static void method3813() {
        int var0 = 0;
        int var1 = Statics.field3192 * Statics.field3187 - 7;
        while (var0 < var1) {
            Statics.field3186[var0++] = 0;
            Statics.field3186[var0++] = 0;
            Statics.field3186[var0++] = 0;
            Statics.field3186[var0++] = 0;
            Statics.field3186[var0++] = 0;
            Statics.field3186[var0++] = 0;
            Statics.field3186[var0++] = 0;
            Statics.field3186[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field3186[var0++] = 0;
        }
    }

    @ObfuscatedName("ho.dy(IIIIII)V")
    public static void method3814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3188) {
            arg2 -= field3188 - arg0;
            arg0 = field3188;
        }
        if (arg1 < field3189) {
            arg3 -= field3189 - arg1;
            arg1 = field3189;
        }
        if (arg0 + arg2 > field3191) {
            arg2 = field3191 - arg0;
        }
        if (arg1 + arg3 > field3190) {
            arg3 = field3190 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field3187 - arg2;
        int var9 = Statics.field3187 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field3186[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field3186[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("ho.db(IIIII)V")
    public static void method3815(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3188) {
            arg2 -= field3188 - arg0;
            arg0 = field3188;
        }
        if (arg1 < field3189) {
            arg3 -= field3189 - arg1;
            arg1 = field3189;
        }
        if (arg0 + arg2 > field3191) {
            arg2 = field3191 - arg0;
        }
        if (arg1 + arg3 > field3190) {
            arg3 = field3190 - arg1;
        }
        int var5 = Statics.field3187 - arg2;
        int var6 = Statics.field3187 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field3186[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("ho.dl(IIIIIIII)V")
    public static void method3816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg4 == arg5 && arg6 == arg7 ? -1 : 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        int var12 = arg4;
        if (arg0 < field3188) {
            arg2 -= field3188 - arg0;
            arg0 = field3188;
        }
        if (arg1 < field3189) {
            var8 += (field3189 - arg1) * var9;
            arg3 -= field3189 - arg1;
            arg1 = field3189;
        }
        if (arg0 + arg2 > field3191) {
            arg2 = field3191 - arg0;
        }
        if (arg1 + arg3 > field3190) {
            arg3 = field3190 - arg1;
        }
        int var13 = Statics.field3187 - arg2;
        int var14 = Statics.field3187 * arg1 + arg0;
        for (int var15 = -arg3; var15 < 0; var15++) {
            for (int var16 = -arg2; var16 < 0; var16++) {
                int var17 = Statics.field3186[var14];
                int var18 = var12 + var17;
                int var19 = (var12 & 0xFF00FF) + (var17 & 0xFF00FF);
                int var20 = (var18 - var19 & 0x10000) + (var19 & 0x1000100);
                if (var11 == 0) {
                    Statics.field3186[var14++] = var18 - var20 | var20 - (var20 >>> 8);
                } else {
                    int var21 = var18 - var20 | var20 - (var20 >>> 8);
                    Statics.field3186[var14++] = ((var17 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var17 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + ((var21 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + ((var21 & 0xFF00) * var10 >> 8 & 0xFF00);
                }
            }
            if (var9 > 0) {
                var8 += var9;
                int var22 = 65536 - var8 >> 8;
                int var23 = var8 >> 8;
                if (arg6 != arg7) {
                    var10 = (65536 - var8) * arg6 + arg7 * var8 >> 16;
                    var11 = 256 - var10;
                }
                if (arg4 != arg5) {
                    var12 = ((arg4 & 0xFF00FF) * var22 + (arg5 & 0xFF00FF) * var23 & 0xFF00FF00) + ((arg4 & 0xFF00) * var22 + (arg5 & 0xFF00) * var23 & 0xFF0000) >>> 8;
                }
            }
            var14 += var13;
        }
    }

    @ObfuscatedName("ho.dx(IIIIIIII)V")
    public static void method3817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg4 == arg5 && arg6 == arg7 ? -1 : 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field3188) {
            arg2 -= field3188 - arg0;
            arg0 = field3188;
        }
        if (arg1 < field3189) {
            var8 += (field3189 - arg1) * var9;
            arg3 -= field3189 - arg1;
            arg1 = field3189;
        }
        if (arg0 + arg2 > field3191) {
            arg2 = field3191 - arg0;
        }
        if (arg1 + arg3 > field3190) {
            arg3 = field3190 - arg1;
        }
        int var12 = arg4 >> 16;
        int var13 = (arg4 & 0xFF00) >> 8;
        int var14 = arg4 & 0xFF;
        int var15 = Statics.field3187 - arg2;
        int var16 = Statics.field3187 * arg1 + arg0;
        for (int var17 = 0; var17 < arg3; var17++) {
            for (int var18 = -arg2; var18 < 0; var18++) {
                int var19 = Statics.field3186[var16];
                int var20 = var19 >> 16;
                int var21 = (var19 & 0xFF00) >> 8;
                int var22 = var19 & 0xFF;
                int var23;
                int var24;
                int var25;
                if (var11 == 0) {
                    var23 = var20 < 127 ? var12 * var20 >> 7 : 255 - ((255 - var12) * (255 - var20) >> 7);
                    var24 = var21 < 127 ? var13 * var21 >> 7 : 255 - ((255 - var13) * (255 - var21) >> 7);
                    var25 = var22 < 127 ? var14 * var22 >> 7 : 255 - ((255 - var14) * (255 - var22) >> 7);
                } else {
                    var23 = var20 < 127 ? (var12 * var20 * var10 >> 7) + var11 * var20 >> 8 : (255 - ((255 - var12) * (255 - var20) >> 7)) * var10 + var11 * var20 >> 8;
                    var24 = var21 < 127 ? (var13 * var21 * var10 >> 7) + var11 * var21 >> 8 : (255 - ((255 - var13) * (255 - var21) >> 7)) * var10 + var11 * var21 >> 8;
                    var25 = var22 < 127 ? (var14 * var22 * var10 >> 7) + var11 * var22 >> 8 : (255 - ((255 - var14) * (255 - var22) >> 7)) * var10 + var11 * var22 >> 8;
                }
                Statics.field3186[var16++] = (var23 << 16) + (var24 << 8) + var25;
            }
            if (var9 > 0) {
                var8 += var9;
                int var26 = 65536 - var8 >> 8;
                int var27 = var8 >> 8;
                if (arg6 != arg7) {
                    var10 = (65536 - var8) * arg6 + arg7 * var8 >> 16;
                    var11 = 256 - var10;
                }
                if (arg4 != arg5) {
                    int var28 = ((arg4 & 0xFF00FF) * var26 + (arg5 & 0xFF00FF) * var27 & 0xFF00FF00) + ((arg4 & 0xFF00) * var26 + (arg5 & 0xFF00) * var27 & 0xFF0000) >>> 8;
                    var12 = var28 >> 16;
                    var13 = (var28 & 0xFF00) >> 8;
                    var14 = var28 & 0xFF;
                }
            }
            var16 += var15;
        }
    }

    @ObfuscatedName("ho.dm(IIIIIIII)V")
    public static void method3818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field3188) {
            arg2 -= field3188 - arg0;
            arg0 = field3188;
        }
        if (arg1 < field3189) {
            var8 += (field3189 - arg1) * var9;
            arg3 -= field3189 - arg1;
            arg1 = field3189;
        }
        if (arg0 + arg2 > field3191) {
            arg2 = field3191 - arg0;
        }
        if (arg1 + arg3 > field3190) {
            arg3 = field3190 - arg1;
        }
        int var12 = arg4 & 0xFF0000;
        int var13 = arg4 & 0xFF00;
        int var14 = arg4 & 0xFF;
        int var15 = arg6 * var12 >> 8;
        int var16 = arg6 * var13 >> 8;
        int var17 = arg6 * var14 >> 8;
        int var18 = Statics.field3187 - arg2;
        int var19 = Statics.field3187 * arg1 + arg0;
        for (int var20 = 0; var20 < arg3; var20++) {
            for (int var21 = -arg2; var21 < 0; var21++) {
                int var22 = Statics.field3186[var19];
                int var23 = var22 & 0xFF0000;
                int var24 = var23 <= var12 ? var23 : (var11 == 0 ? var12 : (var11 * var23 >> 8) + var15 & 0xFF0000);
                int var25 = var22 & 0xFF00;
                int var26 = var25 <= var13 ? var25 : (var11 == 0 ? var13 : (var11 * var25 >> 8) + var16 & 0xFF00);
                int var27 = var22 & 0xFF;
                int var28 = var27 <= var14 ? var27 : (var11 == 0 ? var14 : (var11 * var27 >> 8) + var17);
                Statics.field3186[var19++] = var24 + var26 + var28;
            }
            if (var9 > 0) {
                var8 += var9;
                int var29 = 65536 - var8 >> 8;
                int var30 = var8 >> 8;
                if (arg6 != arg7) {
                    var10 = (65536 - var8) * arg6 + arg7 * var8 >> 16;
                    var11 = 256 - var10;
                }
                if (arg4 != arg5) {
                    int var31 = ((arg4 & 0xFF00FF) * var29 + (arg5 & 0xFF00FF) * var30 & 0xFF00FF00) + ((arg4 & 0xFF00) * var29 + (arg5 & 0xFF00) * var30 & 0xFF0000) >>> 8;
                    var12 = var31 & 0xFF0000;
                    var13 = var31 & 0xFF00;
                    var14 = var31 & 0xFF;
                    var15 = var10 * var12 >> 8;
                    var16 = var10 * var13 >> 8;
                    var17 = var10 * var14 >> 8;
                }
            }
            var19 += var18;
        }
    }

    @ObfuscatedName("ho.dt(IIIIIIII)V")
    public static void method3842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field3188) {
            arg2 -= field3188 - arg0;
            arg0 = field3188;
        }
        if (arg1 < field3189) {
            var8 += (field3189 - arg1) * var9;
            arg3 -= field3189 - arg1;
            arg1 = field3189;
        }
        if (arg0 + arg2 > field3191) {
            arg2 = field3191 - arg0;
        }
        if (arg1 + arg3 > field3190) {
            arg3 = field3190 - arg1;
        }
        int var12 = arg4 & 0xFF0000;
        int var13 = arg4 & 0xFF00;
        int var14 = arg4 & 0xFF;
        int var15 = arg6 * var12 >> 8;
        int var16 = arg6 * var13 >> 8;
        int var17 = arg6 * var14 >> 8;
        int var18 = Statics.field3187 - arg2;
        int var19 = Statics.field3187 * arg1 + arg0;
        for (int var20 = 0; var20 < arg3; var20++) {
            for (int var21 = -arg2; var21 < 0; var21++) {
                int var22 = Statics.field3186[var19];
                int var23 = var22 & 0xFF0000;
                int var24 = var23 >= var12 ? var23 : (var11 == 0 ? var12 : (var11 * var23 >> 8) + var15 & 0xFF0000);
                int var25 = var22 & 0xFF00;
                int var26 = var25 >= var13 ? var25 : (var11 == 0 ? var13 : (var11 * var25 >> 8) + var16 & 0xFF00);
                int var27 = var22 & 0xFF;
                int var28 = var27 >= var14 ? var27 : (var11 == 0 ? var14 : (var11 * var27 >> 8) + var17);
                Statics.field3186[var19++] = var24 + var26 + var28;
            }
            if (var9 > 0) {
                var8 += var9;
                int var29 = 65536 - var8 >> 8;
                int var30 = var8 >> 8;
                if (arg6 != arg7) {
                    var10 = (65536 - var8) * arg6 + arg7 * var8 >> 16;
                    var11 = 256 - var10;
                }
                if (arg4 != arg5) {
                    int var31 = ((arg4 & 0xFF00FF) * var29 + (arg5 & 0xFF00FF) * var30 & 0xFF00FF00) + ((arg4 & 0xFF00) * var29 + (arg5 & 0xFF00) * var30 & 0xFF0000) >>> 8;
                    var12 = var31 & 0xFF0000;
                    var13 = var31 & 0xFF00;
                    var14 = var31 & 0xFF;
                    var15 = var10 * var12 >> 8;
                    var16 = var10 * var13 >> 8;
                    var17 = var10 * var14 >> 8;
                }
            }
            var19 += var18;
        }
    }

    @ObfuscatedName("ho.du(IIIIII)V")
    public static void method3827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3188) {
            arg2 -= field3188 - arg0;
            arg0 = field3188;
        }
        if (arg1 < field3189) {
            var6 += (field3189 - arg1) * var7;
            arg3 -= field3189 - arg1;
            arg1 = field3189;
        }
        if (arg0 + arg2 > field3191) {
            arg2 = field3191 - arg0;
        }
        if (arg1 + arg3 > field3190) {
            arg3 = field3190 - arg1;
        }
        int var8 = Statics.field3187 - arg2;
        int var9 = Statics.field3187 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field3186[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("ho.ds(IIIII)V")
    public static void method3821(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method3823(arg0, arg1, arg2, arg4);
        method3823(arg0, arg1 + arg3 - 1, arg2, arg4);
        method3825(arg0, arg1, arg3, arg4);
        method3825(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("ho.dk(IIIIII)V")
    public static void method3822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method3824(arg0, arg1, arg2, arg4, arg5);
        method3824(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method3826(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method3826(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("ho.dg(IIII)V")
    public static void method3823(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3189 || arg1 >= field3190) {
            return;
        }
        if (arg0 < field3188) {
            arg2 -= field3188 - arg0;
            arg0 = field3188;
        }
        if (arg0 + arg2 > field3191) {
            arg2 = field3191 - arg0;
        }
        int var4 = Statics.field3187 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3186[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("ho.dj(IIIII)V")
    public static void method3824(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3189 || arg1 >= field3190) {
            return;
        }
        if (arg0 < field3188) {
            arg2 -= field3188 - arg0;
            arg0 = field3188;
        }
        if (arg0 + arg2 > field3191) {
            arg2 = field3191 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3187 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3186[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3186[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3186[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3186[var9++] = var14;
        }
    }

    @ObfuscatedName("ho.dw(IIII)V")
    public static void method3825(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3188 || arg0 >= field3191) {
            return;
        }
        if (arg1 < field3189) {
            arg2 -= field3189 - arg1;
            arg1 = field3189;
        }
        if (arg1 + arg2 > field3190) {
            arg2 = field3190 - arg1;
        }
        int var4 = Statics.field3187 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3186[Statics.field3187 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("ho.do(IIIII)V")
    public static void method3826(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3188 || arg0 >= field3191) {
            return;
        }
        if (arg1 < field3189) {
            arg2 -= field3189 - arg1;
            arg1 = field3189;
        }
        if (arg1 + arg2 > field3190) {
            arg2 = field3190 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3187 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3186[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3186[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3186[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3186[var9] = var14;
            var9 += Statics.field3187;
        }
    }

    @ObfuscatedName("ho.di(IIIII)V")
    public static void method3862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method3823(arg0, arg1, var5 + 1, arg4);
            } else {
                method3823(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field3188) {
                    var8 += (field3188 - arg0) * var10;
                    arg0 = field3188;
                }
                if (var11 >= field3191) {
                    var11 = field3191 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3189 && var12 < field3190) {
                        Statics.field3186[Statics.field3187 * var12 + arg0] = arg4;
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
                if (arg1 < field3189) {
                    var14 += (field3189 - arg1) * var16;
                    arg1 = field3189;
                }
                if (var17 >= field3190) {
                    var17 = field3190 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3188 && var18 < field3191) {
                        Statics.field3186[Statics.field3187 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method3825(arg0, arg1, var6 + 1, arg4);
        } else {
            method3825(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("ho.dv(III[I[I)V")
    public static void method3828(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field3187 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field3186[var7++] = arg2;
            }
            var5 += Statics.field3187;
        }
    }
}
