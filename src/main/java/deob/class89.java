package deob;

@ObfuscatedName("cz")
public class class89 extends class174 {

    @ObfuscatedName("cz.r")
    public static int field1470 = 0;

    @ObfuscatedName("cz.x")
    public static int field1476 = 0;

    @ObfuscatedName("cz.v")
    public static int field1475 = 0;

    @ObfuscatedName("cz.y")
    public static int field1474 = 0;

    @ObfuscatedName("cz.cj([III)V")
    public static void method1768(int[] arg0, int arg1, int arg2) {
        Statics.field1473 = arg0;
        Statics.field1471 = arg1;
        Statics.field1472 = arg2;
        method1793(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cz.cf()V")
    public static void method1781() {
        field1475 = 0;
        field1470 = 0;
        field1474 = Statics.field1471;
        field1476 = Statics.field1472;
    }

    @ObfuscatedName("cz.cq(IIII)V")
    public static void method1793(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1471) {
            arg2 = Statics.field1471;
        }
        if (arg3 > Statics.field1472) {
            arg3 = Statics.field1472;
        }
        field1475 = arg0;
        field1470 = arg1;
        field1474 = arg2;
        field1476 = arg3;
    }

    @ObfuscatedName("cz.cc(IIII)V")
    public static void method1771(int arg0, int arg1, int arg2, int arg3) {
        if (field1475 < arg0) {
            field1475 = arg0;
        }
        if (field1470 < arg1) {
            field1470 = arg1;
        }
        if (field1474 > arg2) {
            field1474 = arg2;
        }
        if (field1476 > arg3) {
            field1476 = arg3;
        }
    }

    @ObfuscatedName("cz.ci([I)V")
    public static void method1769(int[] arg0) {
        arg0[0] = field1475;
        arg0[1] = field1470;
        arg0[2] = field1474;
        arg0[3] = field1476;
    }

    @ObfuscatedName("cz.co([I)V")
    public static void method1826(int[] arg0) {
        field1475 = arg0[0];
        field1470 = arg0[1];
        field1474 = arg0[2];
        field1476 = arg0[3];
    }

    @ObfuscatedName("cz.cd()V")
    public static void method1811() {
        int var0 = 0;
        int var1 = Statics.field1472 * Statics.field1471 - 7;
        while (var0 < var1) {
            Statics.field1473[var0++] = 0;
            Statics.field1473[var0++] = 0;
            Statics.field1473[var0++] = 0;
            Statics.field1473[var0++] = 0;
            Statics.field1473[var0++] = 0;
            Statics.field1473[var0++] = 0;
            Statics.field1473[var0++] = 0;
            Statics.field1473[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1473[var0++] = 0;
        }
    }

    @ObfuscatedName("cz.cm(IIIIII)V")
    public static void method1797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1475) {
            arg2 -= field1475 - arg0;
            arg0 = field1475;
        }
        if (arg1 < field1470) {
            arg3 -= field1470 - arg1;
            arg1 = field1470;
        }
        if (arg0 + arg2 > field1474) {
            arg2 = field1474 - arg0;
        }
        if (arg1 + arg3 > field1476) {
            arg3 = field1476 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1471 - arg2;
        int var9 = Statics.field1471 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1473[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1473[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cz.cu(IIIII)V")
    public static void method1807(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1475) {
            arg2 -= field1475 - arg0;
            arg0 = field1475;
        }
        if (arg1 < field1470) {
            arg3 -= field1470 - arg1;
            arg1 = field1470;
        }
        if (arg0 + arg2 > field1474) {
            arg2 = field1474 - arg0;
        }
        if (arg1 + arg3 > field1476) {
            arg3 = field1476 - arg1;
        }
        int var5 = Statics.field1471 - arg2;
        int var6 = Statics.field1471 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1473[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cz.ce(IIIIII)V")
    public static void method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1475) {
            arg2 -= field1475 - arg0;
            arg0 = field1475;
        }
        if (arg1 < field1470) {
            var6 += (field1470 - arg1) * var7;
            arg3 -= field1470 - arg1;
            arg1 = field1470;
        }
        if (arg0 + arg2 > field1474) {
            arg2 = field1474 - arg0;
        }
        if (arg1 + arg3 > field1476) {
            arg3 = field1476 - arg1;
        }
        int var8 = Statics.field1471 - arg2;
        int var9 = Statics.field1471 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1473[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cz.ck(IIIII)V")
    public static void method1784(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1779(arg0, arg1, arg2, arg4);
        method1779(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1778(arg0, arg1, arg3, arg4);
        method1778(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cz.cw(IIIIII)V")
    public static void method1772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1780(arg0, arg1, arg2, arg4, arg5);
        method1780(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1775(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1775(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cz.dd(IIII)V")
    public static void method1779(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1470 || arg1 >= field1476) {
            return;
        }
        if (arg0 < field1475) {
            arg2 -= field1475 - arg0;
            arg0 = field1475;
        }
        if (arg0 + arg2 > field1474) {
            arg2 = field1474 - arg0;
        }
        int var4 = Statics.field1471 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1473[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cz.dn(IIIII)V")
    public static void method1780(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1470 || arg1 >= field1476) {
            return;
        }
        if (arg0 < field1475) {
            arg2 -= field1475 - arg0;
            arg0 = field1475;
        }
        if (arg0 + arg2 > field1474) {
            arg2 = field1474 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1471 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1473[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1473[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1473[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1473[var9++] = var14;
        }
    }

    @ObfuscatedName("cz.dr(IIII)V")
    public static void method1778(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1475 || arg0 >= field1474) {
            return;
        }
        if (arg1 < field1470) {
            arg2 -= field1470 - arg1;
            arg1 = field1470;
        }
        if (arg1 + arg2 > field1476) {
            arg2 = field1476 - arg1;
        }
        int var4 = Statics.field1471 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1473[Statics.field1471 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cz.di(IIIII)V")
    public static void method1775(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1475 || arg0 >= field1474) {
            return;
        }
        if (arg1 < field1470) {
            arg2 -= field1470 - arg1;
            arg1 = field1470;
        }
        if (arg1 + arg2 > field1476) {
            arg2 = field1476 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1471 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1473[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1473[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1473[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1473[var9] = var14;
            var9 += Statics.field1471;
        }
    }

    @ObfuscatedName("cz.do(IIIII)V")
    public static void method1783(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1779(arg0, arg1, var5 + 1, arg4);
            } else {
                method1779(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1475) {
                    var8 += (field1475 - arg0) * var10;
                    arg0 = field1475;
                }
                if (var11 >= field1474) {
                    var11 = field1474 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1470 && var12 < field1476) {
                        Statics.field1473[Statics.field1471 * var12 + arg0] = arg4;
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
                if (arg1 < field1470) {
                    var14 += (field1470 - arg1) * var16;
                    arg1 = field1470;
                }
                if (var17 >= field1476) {
                    var17 = field1476 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1475 && var18 < field1474) {
                        Statics.field1473[Statics.field1471 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1778(arg0, arg1, var6 + 1, arg4);
        } else {
            method1778(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cz.dj(III[I[I)V")
    public static void method1805(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1471 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1473[var7++] = arg2;
            }
            var5 += Statics.field1471;
        }
    }
}
