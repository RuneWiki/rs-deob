package deob;

@ObfuscatedName("js")
public class class285 extends class198 {

    @ObfuscatedName("js.af")
    public static int field3765 = 0;

    @ObfuscatedName("js.aa")
    public static int field3769 = 0;

    @ObfuscatedName("js.aq")
    public static int field3770 = 0;

    @ObfuscatedName("js.aj")
    public static int field3768 = 0;

    @ObfuscatedName("js.cs([III)V")
    public static void method4721(int[] arg0, int arg1, int arg2) {
        Statics.field3766 = arg0;
        Statics.field3767 = arg1;
        Statics.field3771 = arg2;
        method4655(0, 0, arg1, arg2);
    }

    @ObfuscatedName("js.cb()V")
    public static void method4707() {
        field3770 = 0;
        field3765 = 0;
        field3768 = Statics.field3767;
        field3769 = Statics.field3771;
    }

    @ObfuscatedName("js.ck(IIII)V")
    public static void method4655(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field3767) {
            arg2 = Statics.field3767;
        }
        if (arg3 > Statics.field3771) {
            arg3 = Statics.field3771;
        }
        field3770 = arg0;
        field3765 = arg1;
        field3768 = arg2;
        field3769 = arg3;
    }

    @ObfuscatedName("js.cx(IIII)V")
    public static void method4656(int arg0, int arg1, int arg2, int arg3) {
        if (field3770 < arg0) {
            field3770 = arg0;
        }
        if (field3765 < arg1) {
            field3765 = arg1;
        }
        if (field3768 > arg2) {
            field3768 = arg2;
        }
        if (field3769 > arg3) {
            field3769 = arg3;
        }
    }

    @ObfuscatedName("js.ce([I)V")
    public static void method4657(int[] arg0) {
        arg0[0] = field3770;
        arg0[1] = field3765;
        arg0[2] = field3768;
        arg0[3] = field3769;
    }

    @ObfuscatedName("js.ca([I)V")
    public static void method4661(int[] arg0) {
        field3770 = arg0[0];
        field3765 = arg0[1];
        field3768 = arg0[2];
        field3769 = arg0[3];
    }

    @ObfuscatedName("js.cj()V")
    public static void method4659() {
        int var0 = 0;
        int var1 = Statics.field3771 * Statics.field3767 - 7;
        while (var0 < var1) {
            Statics.field3766[var0++] = 0;
            Statics.field3766[var0++] = 0;
            Statics.field3766[var0++] = 0;
            Statics.field3766[var0++] = 0;
            Statics.field3766[var0++] = 0;
            Statics.field3766[var0++] = 0;
            Statics.field3766[var0++] = 0;
            Statics.field3766[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field3766[var0++] = 0;
        }
    }

    @ObfuscatedName("js.cv(IIII)V")
    public static void method4660(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method4677(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field3765) {
            var4 = field3765;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field3769) {
            var5 = field3769;
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
            if (var12 < field3770) {
                var12 = field3770;
            }
            int var13 = arg0 + var8;
            if (var13 > field3768) {
                var13 = field3768;
            }
            int var14 = Statics.field3767 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                Statics.field3766[var14++] = arg3;
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
            if (var21 < field3770) {
                var21 = field3770;
            }
            int var22 = arg0 + var16;
            if (var22 > field3768 - 1) {
                var22 = field3768 - 1;
            }
            int var23 = Statics.field3767 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                Statics.field3766[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @ObfuscatedName("js.dk(IIIII)V")
    public static void method4680(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method4660(arg0, arg1, arg2, arg3);
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
        if (var9 < field3765) {
            var9 = field3765;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field3769) {
            var10 = field3769;
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
            if (var17 < field3770) {
                var17 = field3770;
            }
            int var18 = arg0 + var13;
            if (var18 > field3768) {
                var18 = field3768;
            }
            int var19 = Statics.field3767 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (Statics.field3766[var19] >> 16 & 0xFF) * var5;
                int var22 = (Statics.field3766[var19] >> 8 & 0xFF) * var5;
                int var23 = (Statics.field3766[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                Statics.field3766[var19++] = var24;
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
            if (var30 < field3770) {
                var30 = field3770;
            }
            int var31 = arg0 + var25;
            if (var31 > field3768 - 1) {
                var31 = field3768 - 1;
            }
            int var32 = Statics.field3767 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (Statics.field3766[var32] >> 16 & 0xFF) * var5;
                int var35 = (Statics.field3766[var32] >> 8 & 0xFF) * var5;
                int var36 = (Statics.field3766[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                Statics.field3766[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @ObfuscatedName("js.do(IIIIII)V")
    public static void method4662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field3770) {
            arg2 -= field3770 - arg0;
            arg0 = field3770;
        }
        if (arg1 < field3765) {
            arg3 -= field3765 - arg1;
            arg1 = field3765;
        }
        if (arg0 + arg2 > field3768) {
            arg2 = field3768 - arg0;
        }
        if (arg1 + arg3 > field3769) {
            arg3 = field3769 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field3767 - arg2;
        int var9 = Statics.field3767 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field3766[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field3766[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("js.du(IIIII)V")
    public static void method4701(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3770) {
            arg2 -= field3770 - arg0;
            arg0 = field3770;
        }
        if (arg1 < field3765) {
            arg3 -= field3765 - arg1;
            arg1 = field3765;
        }
        if (arg0 + arg2 > field3768) {
            arg2 = field3768 - arg0;
        }
        if (arg1 + arg3 > field3769) {
            arg3 = field3769 - arg1;
        }
        int var5 = Statics.field3767 - arg2;
        int var6 = Statics.field3767 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field3766[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("js.dl(IIIIIIII)V")
    public static void method4653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg4 == arg5 && arg6 == arg7 ? -1 : 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        int var12 = arg4;
        if (arg0 < field3770) {
            arg2 -= field3770 - arg0;
            arg0 = field3770;
        }
        if (arg1 < field3765) {
            var8 += (field3765 - arg1) * var9;
            arg3 -= field3765 - arg1;
            arg1 = field3765;
        }
        if (arg0 + arg2 > field3768) {
            arg2 = field3768 - arg0;
        }
        if (arg1 + arg3 > field3769) {
            arg3 = field3769 - arg1;
        }
        int var13 = Statics.field3767 - arg2;
        int var14 = Statics.field3767 * arg1 + arg0;
        for (int var15 = -arg3; var15 < 0; var15++) {
            for (int var16 = -arg2; var16 < 0; var16++) {
                int var17 = Statics.field3766[var14];
                int var18 = var12 + var17;
                int var19 = (var12 & 0xFF00FF) + (var17 & 0xFF00FF);
                int var20 = (var18 - var19 & 0x10000) + (var19 & 0x1000100);
                if (var11 == 0) {
                    Statics.field3766[var14++] = var18 - var20 | var20 - (var20 >>> 8);
                } else {
                    int var21 = var18 - var20 | var20 - (var20 >>> 8);
                    Statics.field3766[var14++] = ((var17 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var17 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + ((var21 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + ((var21 & 0xFF00) * var10 >> 8 & 0xFF00);
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

    @ObfuscatedName("js.da(IIIIIIII)V")
    public static void method4665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg4 == arg5 && arg6 == arg7 ? -1 : 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field3770) {
            arg2 -= field3770 - arg0;
            arg0 = field3770;
        }
        if (arg1 < field3765) {
            var8 += (field3765 - arg1) * var9;
            arg3 -= field3765 - arg1;
            arg1 = field3765;
        }
        if (arg0 + arg2 > field3768) {
            arg2 = field3768 - arg0;
        }
        if (arg1 + arg3 > field3769) {
            arg3 = field3769 - arg1;
        }
        int var12 = arg4 >> 16;
        int var13 = (arg4 & 0xFF00) >> 8;
        int var14 = arg4 & 0xFF;
        int var15 = Statics.field3767 - arg2;
        int var16 = Statics.field3767 * arg1 + arg0;
        for (int var17 = 0; var17 < arg3; var17++) {
            for (int var18 = -arg2; var18 < 0; var18++) {
                int var19 = Statics.field3766[var16];
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
                Statics.field3766[var16++] = (var23 << 16) + (var24 << 8) + var25;
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

    @ObfuscatedName("js.dx(IIIIIIII)V")
    public static void method4666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field3770) {
            arg2 -= field3770 - arg0;
            arg0 = field3770;
        }
        if (arg1 < field3765) {
            var8 += (field3765 - arg1) * var9;
            arg3 -= field3765 - arg1;
            arg1 = field3765;
        }
        if (arg0 + arg2 > field3768) {
            arg2 = field3768 - arg0;
        }
        if (arg1 + arg3 > field3769) {
            arg3 = field3769 - arg1;
        }
        int var12 = arg4 & 0xFF0000;
        int var13 = arg4 & 0xFF00;
        int var14 = arg4 & 0xFF;
        int var15 = arg6 * var12 >> 8;
        int var16 = arg6 * var13 >> 8;
        int var17 = arg6 * var14 >> 8;
        int var18 = Statics.field3767 - arg2;
        int var19 = Statics.field3767 * arg1 + arg0;
        for (int var20 = 0; var20 < arg3; var20++) {
            for (int var21 = -arg2; var21 < 0; var21++) {
                int var22 = Statics.field3766[var19];
                int var23 = var22 & 0xFF0000;
                int var24 = var23 <= var12 ? var23 : (var11 == 0 ? var12 : (var11 * var23 >> 8) + var15 & 0xFF0000);
                int var25 = var22 & 0xFF00;
                int var26 = var25 <= var13 ? var25 : (var11 == 0 ? var13 : (var11 * var25 >> 8) + var16 & 0xFF00);
                int var27 = var22 & 0xFF;
                int var28 = var27 <= var14 ? var27 : (var11 == 0 ? var14 : (var11 * var27 >> 8) + var17);
                Statics.field3766[var19++] = var24 + var26 + var28;
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

    @ObfuscatedName("js.dd(IIIIIIII)V")
    public static void method4667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field3770) {
            arg2 -= field3770 - arg0;
            arg0 = field3770;
        }
        if (arg1 < field3765) {
            var8 += (field3765 - arg1) * var9;
            arg3 -= field3765 - arg1;
            arg1 = field3765;
        }
        if (arg0 + arg2 > field3768) {
            arg2 = field3768 - arg0;
        }
        if (arg1 + arg3 > field3769) {
            arg3 = field3769 - arg1;
        }
        int var12 = arg4 & 0xFF0000;
        int var13 = arg4 & 0xFF00;
        int var14 = arg4 & 0xFF;
        int var15 = arg6 * var12 >> 8;
        int var16 = arg6 * var13 >> 8;
        int var17 = arg6 * var14 >> 8;
        int var18 = Statics.field3767 - arg2;
        int var19 = Statics.field3767 * arg1 + arg0;
        for (int var20 = 0; var20 < arg3; var20++) {
            for (int var21 = -arg2; var21 < 0; var21++) {
                int var22 = Statics.field3766[var19];
                int var23 = var22 & 0xFF0000;
                int var24 = var23 >= var12 ? var23 : (var11 == 0 ? var12 : (var11 * var23 >> 8) + var15 & 0xFF0000);
                int var25 = var22 & 0xFF00;
                int var26 = var25 >= var13 ? var25 : (var11 == 0 ? var13 : (var11 * var25 >> 8) + var16 & 0xFF00);
                int var27 = var22 & 0xFF;
                int var28 = var27 >= var14 ? var27 : (var11 == 0 ? var14 : (var11 * var27 >> 8) + var17);
                Statics.field3766[var19++] = var24 + var26 + var28;
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

    @ObfuscatedName("js.di(IIIIII)V")
    public static void method4668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field3770) {
            arg2 -= field3770 - arg0;
            arg0 = field3770;
        }
        if (arg1 < field3765) {
            var6 += (field3765 - arg1) * var7;
            arg3 -= field3765 - arg1;
            arg1 = field3765;
        }
        if (arg0 + arg2 > field3768) {
            arg2 = field3768 - arg0;
        }
        if (arg1 + arg3 > field3769) {
            arg3 = field3769 - arg1;
        }
        int var8 = Statics.field3767 - arg2;
        int var9 = Statics.field3767 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field3766[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("js.dz(IIIIII[BIZ)V")
    public static void method4658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        if (arg0 + arg2 < 0 || arg1 + arg3 < 0 || arg0 >= Statics.field3767 || arg1 >= Statics.field3771) {
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
        if (arg0 + arg2 > Statics.field3767) {
            arg2 = Statics.field3767 - arg0;
        }
        if (arg1 + arg3 > Statics.field3771) {
            arg3 = Statics.field3771 - arg1;
        }
        int var11 = arg6.length / arg7;
        int var12 = Statics.field3767 - arg2;
        int var13 = arg4 >>> 24;
        int var14 = arg5 >>> 24;
        if (!arg8 || var13 == 255 && var14 == 255) {
            int var25 = (arg1 + var10) * Statics.field3767 + arg0 + var9;
            for (int var26 = arg1 + var10; var26 < arg1 + var10 + arg3; var26++) {
                for (int var27 = arg0 + var9; var27 < arg0 + var9 + arg2; var27++) {
                    int var28 = (var26 - arg1) % var11;
                    int var29 = (var27 - arg0) % arg7;
                    if (arg6[arg7 * var28 + var29] == 0) {
                        Statics.field3766[var25++] = arg4;
                    } else {
                        Statics.field3766[var25++] = arg5;
                    }
                }
                var25 += var12;
            }
            return;
        }
        int var15 = (arg1 + var10) * Statics.field3767 + arg0 + var9;
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
                int var23 = Statics.field3766[var15];
                int var24 = ((var20 & 0xFF00FF) * var21 + (var23 & 0xFF00FF) * var22 & 0xFF00FF00) + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000) >> 8;
                Statics.field3766[var15++] = var24;
            }
            var15 += var12;
        }
    }

    @ObfuscatedName("js.dw(IIIII)V")
    public static void method4734(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method4672(arg0, arg1, arg2, arg4);
        method4672(arg0, arg1 + arg3 - 1, arg2, arg4);
        method4674(arg0, arg1, arg3, arg4);
        method4674(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("js.db(IIIIII)V")
    public static void method4671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method4673(arg0, arg1, arg2, arg4, arg5);
        method4673(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method4724(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method4724(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("js.dg(IIII)V")
    public static void method4672(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field3765 || arg1 >= field3769) {
            return;
        }
        if (arg0 < field3770) {
            arg2 -= field3770 - arg0;
            arg0 = field3770;
        }
        if (arg0 + arg2 > field3768) {
            arg2 = field3768 - arg0;
        }
        int var4 = Statics.field3767 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3766[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("js.dp(IIIII)V")
    public static void method4673(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field3765 || arg1 >= field3769) {
            return;
        }
        if (arg0 < field3770) {
            arg2 -= field3770 - arg0;
            arg0 = field3770;
        }
        if (arg0 + arg2 > field3768) {
            arg2 = field3768 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3767 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3766[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3766[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3766[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3766[var9++] = var14;
        }
    }

    @ObfuscatedName("js.dt(IIII)V")
    public static void method4674(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field3770 || arg0 >= field3768) {
            return;
        }
        if (arg1 < field3765) {
            arg2 -= field3765 - arg1;
            arg1 = field3765;
        }
        if (arg1 + arg2 > field3769) {
            arg2 = field3769 - arg1;
        }
        int var4 = Statics.field3767 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field3766[Statics.field3767 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("js.dm(IIIII)V")
    public static void method4724(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field3770 || arg0 >= field3768) {
            return;
        }
        if (arg1 < field3765) {
            arg2 -= field3765 - arg1;
            arg1 = field3765;
        }
        if (arg1 + arg2 > field3769) {
            arg2 = field3769 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field3767 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field3766[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field3766[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field3766[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field3766[var9] = var14;
            var9 += Statics.field3767;
        }
    }

    @ObfuscatedName("js.ds(IIIII)V")
    public static void method4676(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method4672(arg0, arg1, var5 + 1, arg4);
            } else {
                method4672(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field3770) {
                    var8 += (field3770 - arg0) * var10;
                    arg0 = field3770;
                }
                if (var11 >= field3768) {
                    var11 = field3768 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field3765 && var12 < field3769) {
                        Statics.field3766[Statics.field3767 * var12 + arg0] = arg4;
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
                if (arg1 < field3765) {
                    var14 += (field3765 - arg1) * var16;
                    arg1 = field3765;
                }
                if (var17 >= field3769) {
                    var17 = field3769 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field3770 && var18 < field3768) {
                        Statics.field3766[Statics.field3767 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method4674(arg0, arg1, var6 + 1, arg4);
        } else {
            method4674(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("js.de(III)V")
    public static void method4677(int arg0, int arg1, int arg2) {
        if (arg0 >= field3770 && arg1 >= field3765 && arg0 < field3768 && arg1 < field3769) {
            Statics.field3766[Statics.field3767 * arg1 + arg0] = arg2;
        }
    }

    @ObfuscatedName("js.df(III[I[I)V")
    public static void method4678(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field3767 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field3766[var7++] = arg2;
            }
            var5 += Statics.field3767;
        }
    }
}
