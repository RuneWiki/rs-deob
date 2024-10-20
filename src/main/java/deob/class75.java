package deob;

@ObfuscatedName("bc")
public class class75 extends class195 {

    @ObfuscatedName("bc.r")
    public static int field1350 = 0;

    @ObfuscatedName("bc.j")
    public static int field1351 = 0;

    @ObfuscatedName("bc.s")
    public static int field1352 = 0;

    @ObfuscatedName("bc.v")
    public static int field1347 = 0;

    @ObfuscatedName("bc.cn([III)V")
    public static void method1597(int[] arg0, int arg1, int arg2) {
        Statics.field1353 = arg0;
        Statics.field1348 = arg1;
        Statics.field1349 = arg2;
        method1620(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bc.cf()V")
    public static void method1643() {
        field1352 = 0;
        field1350 = 0;
        field1347 = Statics.field1348;
        field1351 = Statics.field1349;
    }

    @ObfuscatedName("bc.ce(IIII)V")
    public static void method1620(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1348) {
            arg2 = Statics.field1348;
        }
        if (arg3 > Statics.field1349) {
            arg3 = Statics.field1349;
        }
        field1352 = arg0;
        field1350 = arg1;
        field1347 = arg2;
        field1351 = arg3;
    }

    @ObfuscatedName("bc.cc(IIII)V")
    public static void method1585(int arg0, int arg1, int arg2, int arg3) {
        if (field1352 < arg0) {
            field1352 = arg0;
        }
        if (field1350 < arg1) {
            field1350 = arg1;
        }
        if (field1347 > arg2) {
            field1347 = arg2;
        }
        if (field1351 > arg3) {
            field1351 = arg3;
        }
    }

    @ObfuscatedName("bc.ca([I)V")
    public static void method1589(int[] arg0) {
        arg0[0] = field1352;
        arg0[1] = field1350;
        arg0[2] = field1347;
        arg0[3] = field1351;
    }

    @ObfuscatedName("bc.cv([I)V")
    public static void method1590(int[] arg0) {
        field1352 = arg0[0];
        field1350 = arg0[1];
        field1347 = arg0[2];
        field1351 = arg0[3];
    }

    @ObfuscatedName("bc.ch()V")
    public static void method1616() {
        int var0 = 0;
        int var1 = Statics.field1349 * Statics.field1348 - 7;
        while (var0 < var1) {
            Statics.field1353[var0++] = 0;
            Statics.field1353[var0++] = 0;
            Statics.field1353[var0++] = 0;
            Statics.field1353[var0++] = 0;
            Statics.field1353[var0++] = 0;
            Statics.field1353[var0++] = 0;
            Statics.field1353[var0++] = 0;
            Statics.field1353[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1353[var0++] = 0;
        }
    }

    @ObfuscatedName("bc.cx(IIIIII)V")
    public static void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1352) {
            arg2 -= field1352 - arg0;
            arg0 = field1352;
        }
        if (arg1 < field1350) {
            arg3 -= field1350 - arg1;
            arg1 = field1350;
        }
        if (arg0 + arg2 > field1347) {
            arg2 = field1347 - arg0;
        }
        if (arg1 + arg3 > field1351) {
            arg3 = field1351 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1348 - arg2;
        int var9 = Statics.field1348 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1353[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1353[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bc.cy(IIIII)V")
    public static void method1593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1352) {
            arg2 -= field1352 - arg0;
            arg0 = field1352;
        }
        if (arg1 < field1350) {
            arg3 -= field1350 - arg1;
            arg1 = field1350;
        }
        if (arg0 + arg2 > field1347) {
            arg2 = field1347 - arg0;
        }
        if (arg1 + arg3 > field1351) {
            arg3 = field1351 - arg1;
        }
        int var5 = Statics.field1348 - arg2;
        int var6 = Statics.field1348 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1353[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bc.cm(IIIIII)V")
    public static void method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1352) {
            arg2 -= field1352 - arg0;
            arg0 = field1352;
        }
        if (arg1 < field1350) {
            var6 += (field1350 - arg1) * var7;
            arg3 -= field1350 - arg1;
            arg1 = field1350;
        }
        if (arg0 + arg2 > field1347) {
            arg2 = field1347 - arg0;
        }
        if (arg1 + arg3 > field1351) {
            arg3 = field1351 - arg1;
        }
        int var8 = Statics.field1348 - arg2;
        int var9 = Statics.field1348 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1353[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bc.cd(IIIII)V")
    public static void method1595(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1617(arg0, arg1, arg2, arg4);
        method1617(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1606(arg0, arg1, arg3, arg4);
        method1606(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bc.ci(IIIIII)V")
    public static void method1596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1598(arg0, arg1, arg2, arg4, arg5);
        method1598(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1600(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1600(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bc.cp(IIII)V")
    public static void method1617(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1350 || arg1 >= field1351) {
            return;
        }
        if (arg0 < field1352) {
            arg2 -= field1352 - arg0;
            arg0 = field1352;
        }
        if (arg0 + arg2 > field1347) {
            arg2 = field1347 - arg0;
        }
        int var4 = Statics.field1348 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1353[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bc.cg(IIIII)V")
    public static void method1598(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1350 || arg1 >= field1351) {
            return;
        }
        if (arg0 < field1352) {
            arg2 -= field1352 - arg0;
            arg0 = field1352;
        }
        if (arg0 + arg2 > field1347) {
            arg2 = field1347 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1348 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1353[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1353[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1353[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1353[var9++] = var14;
        }
    }

    @ObfuscatedName("bc.cr(IIII)V")
    public static void method1606(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1352 || arg0 >= field1347) {
            return;
        }
        if (arg1 < field1350) {
            arg2 -= field1350 - arg1;
            arg1 = field1350;
        }
        if (arg1 + arg2 > field1351) {
            arg2 = field1351 - arg1;
        }
        int var4 = Statics.field1348 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1353[Statics.field1348 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bc.ck(IIIII)V")
    public static void method1600(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1352 || arg0 >= field1347) {
            return;
        }
        if (arg1 < field1350) {
            arg2 -= field1350 - arg1;
            arg1 = field1350;
        }
        if (arg1 + arg2 > field1351) {
            arg2 = field1351 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1348 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1353[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1353[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1353[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1353[var9] = var14;
            var9 += Statics.field1348;
        }
    }

    @ObfuscatedName("bc.cl(IIIII)V")
    public static void method1601(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1617(arg0, arg1, var5 + 1, arg4);
            } else {
                method1617(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1352) {
                    var8 += (field1352 - arg0) * var10;
                    arg0 = field1352;
                }
                if (var11 >= field1347) {
                    var11 = field1347 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1350 && var12 < field1351) {
                        Statics.field1353[Statics.field1348 * var12 + arg0] = arg4;
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
                if (arg1 < field1350) {
                    var14 += (field1350 - arg1) * var16;
                    arg1 = field1350;
                }
                if (var17 >= field1351) {
                    var17 = field1351 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1352 && var18 < field1347) {
                        Statics.field1353[Statics.field1348 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1606(arg0, arg1, var6 + 1, arg4);
        } else {
            method1606(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bc.cs(III[I[I)V")
    public static void method1602(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1348 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1353[var7++] = arg2;
            }
            var5 += Statics.field1348;
        }
    }
}
