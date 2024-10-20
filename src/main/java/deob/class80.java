package deob;

@ObfuscatedName("co")
public class class80 extends class204 {

    @ObfuscatedName("co.e")
    public static int field1396 = 0;

    @ObfuscatedName("co.l")
    public static int field1400 = 0;

    @ObfuscatedName("co.u")
    public static int field1401 = 0;

    @ObfuscatedName("co.a")
    public static int field1402 = 0;

    @ObfuscatedName("co.ci([III)V")
    public static void method1653(int[] arg0, int arg1, int arg2) {
        Statics.field1399 = arg0;
        Statics.field1397 = arg1;
        Statics.field1398 = arg2;
        method1655(0, 0, arg1, arg2);
    }

    @ObfuscatedName("co.cu()V")
    public static void method1654() {
        field1401 = 0;
        field1396 = 0;
        field1402 = Statics.field1397;
        field1400 = Statics.field1398;
    }

    @ObfuscatedName("co.cb(IIII)V")
    public static void method1655(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1397) {
            arg2 = Statics.field1397;
        }
        if (arg3 > Statics.field1398) {
            arg3 = Statics.field1398;
        }
        field1401 = arg0;
        field1396 = arg1;
        field1402 = arg2;
        field1400 = arg3;
    }

    @ObfuscatedName("co.cz(IIII)V")
    public static void method1656(int arg0, int arg1, int arg2, int arg3) {
        if (field1401 < arg0) {
            field1401 = arg0;
        }
        if (field1396 < arg1) {
            field1396 = arg1;
        }
        if (field1402 > arg2) {
            field1402 = arg2;
        }
        if (field1400 > arg3) {
            field1400 = arg3;
        }
    }

    @ObfuscatedName("co.cc([I)V")
    public static void method1685(int[] arg0) {
        arg0[0] = field1401;
        arg0[1] = field1396;
        arg0[2] = field1402;
        arg0[3] = field1400;
    }

    @ObfuscatedName("co.cx([I)V")
    public static void method1658(int[] arg0) {
        field1401 = arg0[0];
        field1396 = arg0[1];
        field1402 = arg0[2];
        field1400 = arg0[3];
    }

    @ObfuscatedName("co.cv()V")
    public static void method1659() {
        int var0 = 0;
        int var1 = Statics.field1398 * Statics.field1397 - 7;
        while (var0 < var1) {
            Statics.field1399[var0++] = 0;
            Statics.field1399[var0++] = 0;
            Statics.field1399[var0++] = 0;
            Statics.field1399[var0++] = 0;
            Statics.field1399[var0++] = 0;
            Statics.field1399[var0++] = 0;
            Statics.field1399[var0++] = 0;
            Statics.field1399[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1399[var0++] = 0;
        }
    }

    @ObfuscatedName("co.cw(IIIIII)V")
    public static void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1401) {
            arg2 -= field1401 - arg0;
            arg0 = field1401;
        }
        if (arg1 < field1396) {
            arg3 -= field1396 - arg1;
            arg1 = field1396;
        }
        if (arg0 + arg2 > field1402) {
            arg2 = field1402 - arg0;
        }
        if (arg1 + arg3 > field1400) {
            arg3 = field1400 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1397 - arg2;
        int var9 = Statics.field1397 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1399[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1399[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("co.ch(IIIII)V")
    public static void method1661(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1401) {
            arg2 -= field1401 - arg0;
            arg0 = field1401;
        }
        if (arg1 < field1396) {
            arg3 -= field1396 - arg1;
            arg1 = field1396;
        }
        if (arg0 + arg2 > field1402) {
            arg2 = field1402 - arg0;
        }
        if (arg1 + arg3 > field1400) {
            arg3 = field1400 - arg1;
        }
        int var5 = Statics.field1397 - arg2;
        int var6 = Statics.field1397 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1399[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("co.ct(IIIIII)V")
    public static void method1700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1401) {
            arg2 -= field1401 - arg0;
            arg0 = field1401;
        }
        if (arg1 < field1396) {
            var6 += (field1396 - arg1) * var7;
            arg3 -= field1396 - arg1;
            arg1 = field1396;
        }
        if (arg0 + arg2 > field1402) {
            arg2 = field1402 - arg0;
        }
        if (arg1 + arg3 > field1400) {
            arg3 = field1400 - arg1;
        }
        int var8 = Statics.field1397 - arg2;
        int var9 = Statics.field1397 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1399[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("co.cf(IIIII)V")
    public static void method1683(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1664(arg0, arg1, arg2, arg4);
        method1664(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1674(arg0, arg1, arg3, arg4);
        method1674(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("co.ca(IIIIII)V")
    public static void method1666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1701(arg0, arg1, arg2, arg4, arg5);
        method1701(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1657(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1657(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("co.cy(IIII)V")
    public static void method1664(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1396 || arg1 >= field1400) {
            return;
        }
        if (arg0 < field1401) {
            arg2 -= field1401 - arg0;
            arg0 = field1401;
        }
        if (arg0 + arg2 > field1402) {
            arg2 = field1402 - arg0;
        }
        int var4 = Statics.field1397 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1399[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("co.dt(IIIII)V")
    public static void method1701(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1396 || arg1 >= field1400) {
            return;
        }
        if (arg0 < field1401) {
            arg2 -= field1401 - arg0;
            arg0 = field1401;
        }
        if (arg0 + arg2 > field1402) {
            arg2 = field1402 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1397 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1399[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1399[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1399[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1399[var9++] = var14;
        }
    }

    @ObfuscatedName("co.du(IIII)V")
    public static void method1674(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1401 || arg0 >= field1402) {
            return;
        }
        if (arg1 < field1396) {
            arg2 -= field1396 - arg1;
            arg1 = field1396;
        }
        if (arg1 + arg2 > field1400) {
            arg2 = field1400 - arg1;
        }
        int var4 = Statics.field1397 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1399[Statics.field1397 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("co.ds(IIIII)V")
    public static void method1657(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1401 || arg0 >= field1402) {
            return;
        }
        if (arg1 < field1396) {
            arg2 -= field1396 - arg1;
            arg1 = field1396;
        }
        if (arg1 + arg2 > field1400) {
            arg2 = field1400 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1397 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1399[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1399[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1399[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1399[var9] = var14;
            var9 += Statics.field1397;
        }
    }

    @ObfuscatedName("co.dj(IIIII)V")
    public static void method1667(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1664(arg0, arg1, var5 + 1, arg4);
            } else {
                method1664(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1401) {
                    var8 += (field1401 - arg0) * var10;
                    arg0 = field1401;
                }
                if (var11 >= field1402) {
                    var11 = field1402 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1396 && var12 < field1400) {
                        Statics.field1399[Statics.field1397 * var12 + arg0] = arg4;
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
                if (arg1 < field1396) {
                    var14 += (field1396 - arg1) * var16;
                    arg1 = field1396;
                }
                if (var17 >= field1400) {
                    var17 = field1400 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1401 && var18 < field1402) {
                        Statics.field1399[Statics.field1397 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1674(arg0, arg1, var6 + 1, arg4);
        } else {
            method1674(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("co.dw(III[I[I)V")
    public static void method1689(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1397 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1399[var7++] = arg2;
            }
            var5 += Statics.field1397;
        }
    }
}
