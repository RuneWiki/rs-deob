package deob;

@ObfuscatedName("by")
public class class74 extends class185 {

    @ObfuscatedName("by.f")
    public static int field1333 = 0;

    @ObfuscatedName("by.c")
    public static int field1334 = 0;

    @ObfuscatedName("by.t")
    public static int field1332 = 0;

    @ObfuscatedName("by.i")
    public static int field1330 = 0;

    @ObfuscatedName("by.cj([III)V")
    public static void method1505(int[] arg0, int arg1, int arg2) {
        Statics.field1335 = arg0;
        Statics.field1331 = arg1;
        Statics.field1336 = arg2;
        method1526(0, 0, arg1, arg2);
    }

    @ObfuscatedName("by.cw()V")
    public static void method1506() {
        field1332 = 0;
        field1333 = 0;
        field1330 = Statics.field1331;
        field1334 = Statics.field1336;
    }

    @ObfuscatedName("by.cp(IIII)V")
    public static void method1526(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1331) {
            arg2 = Statics.field1331;
        }
        if (arg3 > Statics.field1336) {
            arg3 = Statics.field1336;
        }
        field1332 = arg0;
        field1333 = arg1;
        field1330 = arg2;
        field1334 = arg3;
    }

    @ObfuscatedName("by.ca(IIII)V")
    public static void method1511(int arg0, int arg1, int arg2, int arg3) {
        if (field1332 < arg0) {
            field1332 = arg0;
        }
        if (field1333 < arg1) {
            field1333 = arg1;
        }
        if (field1330 > arg2) {
            field1330 = arg2;
        }
        if (field1334 > arg3) {
            field1334 = arg3;
        }
    }

    @ObfuscatedName("by.cq([I)V")
    public static void method1544(int[] arg0) {
        arg0[0] = field1332;
        arg0[1] = field1333;
        arg0[2] = field1330;
        arg0[3] = field1334;
    }

    @ObfuscatedName("by.cb([I)V")
    public static void method1510(int[] arg0) {
        field1332 = arg0[0];
        field1333 = arg0[1];
        field1330 = arg0[2];
        field1334 = arg0[3];
    }

    @ObfuscatedName("by.ce()V")
    public static void method1531() {
        int var0 = 0;
        int var1 = Statics.field1336 * Statics.field1331 - 7;
        while (var0 < var1) {
            Statics.field1335[var0++] = 0;
            Statics.field1335[var0++] = 0;
            Statics.field1335[var0++] = 0;
            Statics.field1335[var0++] = 0;
            Statics.field1335[var0++] = 0;
            Statics.field1335[var0++] = 0;
            Statics.field1335[var0++] = 0;
            Statics.field1335[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1335[var0++] = 0;
        }
    }

    @ObfuscatedName("by.cl(IIIIII)V")
    public static void method1554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg1 < field1333) {
            arg3 -= field1333 - arg1;
            arg1 = field1333;
        }
        if (arg0 + arg2 > field1330) {
            arg2 = field1330 - arg0;
        }
        if (arg1 + arg3 > field1334) {
            arg3 = field1334 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1331 - arg2;
        int var9 = Statics.field1331 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1335[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1335[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("by.ci(IIIII)V")
    public static void method1513(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg1 < field1333) {
            arg3 -= field1333 - arg1;
            arg1 = field1333;
        }
        if (arg0 + arg2 > field1330) {
            arg2 = field1330 - arg0;
        }
        if (arg1 + arg3 > field1334) {
            arg3 = field1334 - arg1;
        }
        int var5 = Statics.field1331 - arg2;
        int var6 = Statics.field1331 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1335[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("by.cy(IIIIII)V")
    public static void method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg1 < field1333) {
            var6 += (field1333 - arg1) * var7;
            arg3 -= field1333 - arg1;
            arg1 = field1333;
        }
        if (arg0 + arg2 > field1330) {
            arg2 = field1330 - arg0;
        }
        if (arg1 + arg3 > field1334) {
            arg3 = field1334 - arg1;
        }
        int var8 = Statics.field1331 - arg2;
        int var9 = Statics.field1331 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1335[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("by.cm(IIIII)V")
    public static void method1515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1509(arg0, arg1, arg2, arg4);
        method1509(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1519(arg0, arg1, arg3, arg4);
        method1519(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("by.cd(IIIIII)V")
    public static void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1518(arg0, arg1, arg2, arg4, arg5);
        method1518(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1520(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1520(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("by.cr(IIII)V")
    public static void method1509(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1333 || arg1 >= field1334) {
            return;
        }
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg0 + arg2 > field1330) {
            arg2 = field1330 - arg0;
        }
        int var4 = Statics.field1331 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1335[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("by.cz(IIIII)V")
    public static void method1518(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1333 || arg1 >= field1334) {
            return;
        }
        if (arg0 < field1332) {
            arg2 -= field1332 - arg0;
            arg0 = field1332;
        }
        if (arg0 + arg2 > field1330) {
            arg2 = field1330 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1331 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1335[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1335[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1335[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1335[var9++] = var14;
        }
    }

    @ObfuscatedName("by.ch(IIII)V")
    public static void method1519(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1332 || arg0 >= field1330) {
            return;
        }
        if (arg1 < field1333) {
            arg2 -= field1333 - arg1;
            arg1 = field1333;
        }
        if (arg1 + arg2 > field1334) {
            arg2 = field1334 - arg1;
        }
        int var4 = Statics.field1331 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1335[Statics.field1331 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("by.cn(IIIII)V")
    public static void method1520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1332 || arg0 >= field1330) {
            return;
        }
        if (arg1 < field1333) {
            arg2 -= field1333 - arg1;
            arg1 = field1333;
        }
        if (arg1 + arg2 > field1334) {
            arg2 = field1334 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1331 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1335[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1335[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1335[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1335[var9] = var14;
            var9 += Statics.field1331;
        }
    }

    @ObfuscatedName("by.cu(IIIII)V")
    public static void method1521(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1509(arg0, arg1, var5 + 1, arg4);
            } else {
                method1509(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1332) {
                    var8 += (field1332 - arg0) * var10;
                    arg0 = field1332;
                }
                if (var11 >= field1330) {
                    var11 = field1330 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1333 && var12 < field1334) {
                        Statics.field1335[Statics.field1331 * var12 + arg0] = arg4;
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
                if (arg1 < field1333) {
                    var14 += (field1333 - arg1) * var16;
                    arg1 = field1333;
                }
                if (var17 >= field1334) {
                    var17 = field1334 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1332 && var18 < field1330) {
                        Statics.field1335[Statics.field1331 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1519(arg0, arg1, var6 + 1, arg4);
        } else {
            method1519(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("by.cx(III[I[I)V")
    public static void method1522(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1331 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1335[var7++] = arg2;
            }
            var5 += Statics.field1331;
        }
    }
}
