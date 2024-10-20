package deob;

@ObfuscatedName("cu")
public class class80 extends class205 {

    @ObfuscatedName("cu.n")
    public static int field1416 = 0;

    @ObfuscatedName("cu.u")
    public static int field1417 = 0;

    @ObfuscatedName("cu.g")
    public static int field1413 = 0;

    @ObfuscatedName("cu.j")
    public static int field1419 = 0;

    @ObfuscatedName("cu.cw([III)V")
    public static void method1830(int[] arg0, int arg1, int arg2) {
        Statics.field1414 = arg0;
        Statics.field1418 = arg1;
        Statics.field1415 = arg2;
        method1777(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cu.ca()V")
    public static void method1776() {
        field1413 = 0;
        field1416 = 0;
        field1419 = Statics.field1418;
        field1417 = Statics.field1415;
    }

    @ObfuscatedName("cu.cl(IIII)V")
    public static void method1777(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1418) {
            arg2 = Statics.field1418;
        }
        if (arg3 > Statics.field1415) {
            arg3 = Statics.field1415;
        }
        field1413 = arg0;
        field1416 = arg1;
        field1419 = arg2;
        field1417 = arg3;
    }

    @ObfuscatedName("cu.di(IIII)V")
    public static void method1833(int arg0, int arg1, int arg2, int arg3) {
        if (field1413 < arg0) {
            field1413 = arg0;
        }
        if (field1416 < arg1) {
            field1416 = arg1;
        }
        if (field1419 > arg2) {
            field1419 = arg2;
        }
        if (field1417 > arg3) {
            field1417 = arg3;
        }
    }

    @ObfuscatedName("cu.dr([I)V")
    public static void method1819(int[] arg0) {
        arg0[0] = field1413;
        arg0[1] = field1416;
        arg0[2] = field1419;
        arg0[3] = field1417;
    }

    @ObfuscatedName("cu.dg([I)V")
    public static void method1837(int[] arg0) {
        field1413 = arg0[0];
        field1416 = arg0[1];
        field1419 = arg0[2];
        field1417 = arg0[3];
    }

    @ObfuscatedName("cu.dc()V")
    public static void method1781() {
        int var0 = 0;
        int var1 = Statics.field1418 * Statics.field1415 - 7;
        while (var0 < var1) {
            Statics.field1414[var0++] = 0;
            Statics.field1414[var0++] = 0;
            Statics.field1414[var0++] = 0;
            Statics.field1414[var0++] = 0;
            Statics.field1414[var0++] = 0;
            Statics.field1414[var0++] = 0;
            Statics.field1414[var0++] = 0;
            Statics.field1414[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1414[var0++] = 0;
        }
    }

    @ObfuscatedName("cu.de(IIIIII)V")
    public static void method1799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1413) {
            arg2 -= field1413 - arg0;
            arg0 = field1413;
        }
        if (arg1 < field1416) {
            arg3 -= field1416 - arg1;
            arg1 = field1416;
        }
        if (arg0 + arg2 > field1419) {
            arg2 = field1419 - arg0;
        }
        if (arg1 + arg3 > field1417) {
            arg3 = field1417 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1418 - arg2;
        int var9 = Statics.field1418 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1414[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1414[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cu.dm(IIIII)V")
    public static void method1817(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1413) {
            arg2 -= field1413 - arg0;
            arg0 = field1413;
        }
        if (arg1 < field1416) {
            arg3 -= field1416 - arg1;
            arg1 = field1416;
        }
        if (arg0 + arg2 > field1419) {
            arg2 = field1419 - arg0;
        }
        if (arg1 + arg3 > field1417) {
            arg3 = field1417 - arg1;
        }
        int var5 = Statics.field1418 - arg2;
        int var6 = Statics.field1418 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1414[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cu.dj(IIIIIIII)V")
    public static void method1784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg4 == arg5 && arg6 == arg7 ? -1 : 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        int var12 = arg4;
        if (arg0 < field1413) {
            arg2 -= field1413 - arg0;
            arg0 = field1413;
        }
        if (arg1 < field1416) {
            var8 += (field1416 - arg1) * var9;
            arg3 -= field1416 - arg1;
            arg1 = field1416;
        }
        if (arg0 + arg2 > field1419) {
            arg2 = field1419 - arg0;
        }
        if (arg1 + arg3 > field1417) {
            arg3 = field1417 - arg1;
        }
        int var13 = Statics.field1418 - arg2;
        int var14 = Statics.field1418 * arg1 + arg0;
        for (int var15 = -arg3; var15 < 0; var15++) {
            for (int var16 = -arg2; var16 < 0; var16++) {
                int var17 = Statics.field1414[var14];
                int var18 = var12 + var17;
                int var19 = (var12 & 0xFF00FF) + (var17 & 0xFF00FF);
                int var20 = (var18 - var19 & 0x10000) + (var19 & 0x1000100);
                if (var11 == 0) {
                    Statics.field1414[var14++] = var18 - var20 | var20 - (var20 >>> 8);
                } else {
                    int var21 = var18 - var20 | var20 - (var20 >>> 8);
                    Statics.field1414[var14++] = ((var17 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var17 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + ((var21 & 0xFF00FF) * var10 >> 8 & 0xFF00FF) + ((var21 & 0xFF00) * var10 >> 8 & 0xFF00);
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

    @ObfuscatedName("cu.dn(IIIIIIII)V")
    public static void method1846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg4 == arg5 && arg6 == arg7 ? -1 : 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field1413) {
            arg2 -= field1413 - arg0;
            arg0 = field1413;
        }
        if (arg1 < field1416) {
            var8 += (field1416 - arg1) * var9;
            arg3 -= field1416 - arg1;
            arg1 = field1416;
        }
        if (arg0 + arg2 > field1419) {
            arg2 = field1419 - arg0;
        }
        if (arg1 + arg3 > field1417) {
            arg3 = field1417 - arg1;
        }
        int var12 = arg4 >> 16;
        int var13 = (arg4 & 0xFF00) >> 8;
        int var14 = arg4 & 0xFF;
        int var15 = Statics.field1418 - arg2;
        int var16 = Statics.field1418 * arg1 + arg0;
        for (int var17 = 0; var17 < arg3; var17++) {
            for (int var18 = -arg2; var18 < 0; var18++) {
                int var19 = Statics.field1414[var16];
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
                Statics.field1414[var16++] = (var23 << 16) + (var24 << 8) + var25;
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

    @ObfuscatedName("cu.df(IIIIIIII)V")
    public static void method1786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field1413) {
            arg2 -= field1413 - arg0;
            arg0 = field1413;
        }
        if (arg1 < field1416) {
            var8 += (field1416 - arg1) * var9;
            arg3 -= field1416 - arg1;
            arg1 = field1416;
        }
        if (arg0 + arg2 > field1419) {
            arg2 = field1419 - arg0;
        }
        if (arg1 + arg3 > field1417) {
            arg3 = field1417 - arg1;
        }
        int var12 = arg4 & 0xFF0000;
        int var13 = arg4 & 0xFF00;
        int var14 = arg4 & 0xFF;
        int var15 = arg6 * var12 >> 8;
        int var16 = arg6 * var13 >> 8;
        int var17 = arg6 * var14 >> 8;
        int var18 = Statics.field1418 - arg2;
        int var19 = Statics.field1418 * arg1 + arg0;
        for (int var20 = 0; var20 < arg3; var20++) {
            for (int var21 = -arg2; var21 < 0; var21++) {
                int var22 = Statics.field1414[var19];
                int var23 = var22 & 0xFF0000;
                int var24 = var23 <= var12 ? var23 : (var11 == 0 ? var12 : (var11 * var23 >> 8) + var15 & 0xFF0000);
                int var25 = var22 & 0xFF00;
                int var26 = var25 <= var13 ? var25 : (var11 == 0 ? var13 : (var11 * var25 >> 8) + var16 & 0xFF00);
                int var27 = var22 & 0xFF;
                int var28 = var27 <= var14 ? var27 : (var11 == 0 ? var14 : (var11 * var27 >> 8) + var17);
                Statics.field1414[var19++] = var24 + var26 + var28;
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

    @ObfuscatedName("cu.dh(IIIIIIII)V")
    public static void method1787(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 65536 / arg3;
        int var10 = arg6;
        int var11 = 256 - arg6;
        if (arg0 < field1413) {
            arg2 -= field1413 - arg0;
            arg0 = field1413;
        }
        if (arg1 < field1416) {
            var8 += (field1416 - arg1) * var9;
            arg3 -= field1416 - arg1;
            arg1 = field1416;
        }
        if (arg0 + arg2 > field1419) {
            arg2 = field1419 - arg0;
        }
        if (arg1 + arg3 > field1417) {
            arg3 = field1417 - arg1;
        }
        int var12 = arg4 & 0xFF0000;
        int var13 = arg4 & 0xFF00;
        int var14 = arg4 & 0xFF;
        int var15 = arg6 * var12 >> 8;
        int var16 = arg6 * var13 >> 8;
        int var17 = arg6 * var14 >> 8;
        int var18 = Statics.field1418 - arg2;
        int var19 = Statics.field1418 * arg1 + arg0;
        for (int var20 = 0; var20 < arg3; var20++) {
            for (int var21 = -arg2; var21 < 0; var21++) {
                int var22 = Statics.field1414[var19];
                int var23 = var22 & 0xFF0000;
                int var24 = var23 >= var12 ? var23 : (var11 == 0 ? var12 : (var11 * var23 >> 8) + var15 & 0xFF0000);
                int var25 = var22 & 0xFF00;
                int var26 = var25 >= var13 ? var25 : (var11 == 0 ? var13 : (var11 * var25 >> 8) + var16 & 0xFF00);
                int var27 = var22 & 0xFF;
                int var28 = var27 >= var14 ? var27 : (var11 == 0 ? var14 : (var11 * var27 >> 8) + var17);
                Statics.field1414[var19++] = var24 + var26 + var28;
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

    @ObfuscatedName("cu.dk(IIIIII)V")
    public static void method1788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1413) {
            arg2 -= field1413 - arg0;
            arg0 = field1413;
        }
        if (arg1 < field1416) {
            var6 += (field1416 - arg1) * var7;
            arg3 -= field1416 - arg1;
            arg1 = field1416;
        }
        if (arg0 + arg2 > field1419) {
            arg2 = field1419 - arg0;
        }
        if (arg1 + arg3 > field1417) {
            arg3 = field1417 - arg1;
        }
        int var8 = Statics.field1418 - arg2;
        int var9 = Statics.field1418 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1414[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cu.dp(IIIII)V")
    public static void method1829(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1791(arg0, arg1, arg2, arg4);
        method1791(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1793(arg0, arg1, arg3, arg4);
        method1793(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cu.do(IIIIII)V")
    public static void method1790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1798(arg0, arg1, arg2, arg4, arg5);
        method1798(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1794(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1794(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cu.dw(IIII)V")
    public static void method1791(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1416 || arg1 >= field1417) {
            return;
        }
        if (arg0 < field1413) {
            arg2 -= field1413 - arg0;
            arg0 = field1413;
        }
        if (arg0 + arg2 > field1419) {
            arg2 = field1419 - arg0;
        }
        int var4 = Statics.field1418 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1414[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cu.dy(IIIII)V")
    public static void method1798(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1416 || arg1 >= field1417) {
            return;
        }
        if (arg0 < field1413) {
            arg2 -= field1413 - arg0;
            arg0 = field1413;
        }
        if (arg0 + arg2 > field1419) {
            arg2 = field1419 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1418 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1414[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1414[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1414[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1414[var9++] = var14;
        }
    }

    @ObfuscatedName("cu.dx(IIII)V")
    public static void method1793(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1413 || arg0 >= field1419) {
            return;
        }
        if (arg1 < field1416) {
            arg2 -= field1416 - arg1;
            arg1 = field1416;
        }
        if (arg1 + arg2 > field1417) {
            arg2 = field1417 - arg1;
        }
        int var4 = Statics.field1418 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1414[Statics.field1418 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cu.dv(IIIII)V")
    public static void method1794(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1413 || arg0 >= field1419) {
            return;
        }
        if (arg1 < field1416) {
            arg2 -= field1416 - arg1;
            arg1 = field1416;
        }
        if (arg1 + arg2 > field1417) {
            arg2 = field1417 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1418 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1414[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1414[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1414[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1414[var9] = var14;
            var9 += Statics.field1418;
        }
    }

    @ObfuscatedName("cu.ds(IIIII)V")
    public static void method1795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1791(arg0, arg1, var5 + 1, arg4);
            } else {
                method1791(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1413) {
                    var8 += (field1413 - arg0) * var10;
                    arg0 = field1413;
                }
                if (var11 >= field1419) {
                    var11 = field1419 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1416 && var12 < field1417) {
                        Statics.field1414[Statics.field1418 * var12 + arg0] = arg4;
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
                if (arg1 < field1416) {
                    var14 += (field1416 - arg1) * var16;
                    arg1 = field1416;
                }
                if (var17 >= field1417) {
                    var17 = field1417 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1413 && var18 < field1419) {
                        Statics.field1414[Statics.field1418 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1793(arg0, arg1, var6 + 1, arg4);
        } else {
            method1793(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cu.dl(III[I[I)V")
    public static void method1796(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1418 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1414[var7++] = arg2;
            }
            var5 += Statics.field1418;
        }
    }
}
