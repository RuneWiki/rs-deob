package deob;

@ObfuscatedName("bw")
public class class73 extends class183 {

    @ObfuscatedName("bw.b")
    public static int field1316 = 0;

    @ObfuscatedName("bw.z")
    public static int field1320 = 0;

    @ObfuscatedName("bw.l")
    public static int field1321 = 0;

    @ObfuscatedName("bw.t")
    public static int field1317 = 0;

    @ObfuscatedName("bw.cc([III)V")
    public static void method1592(int[] arg0, int arg1, int arg2) {
        Statics.field1322 = arg0;
        Statics.field1319 = arg1;
        Statics.field1318 = arg2;
        method1554(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bw.cj()V")
    public static void method1556() {
        field1321 = 0;
        field1316 = 0;
        field1317 = Statics.field1319;
        field1320 = Statics.field1318;
    }

    @ObfuscatedName("bw.cx(IIII)V")
    public static void method1554(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1319) {
            arg2 = Statics.field1319;
        }
        if (arg3 > Statics.field1318) {
            arg3 = Statics.field1318;
        }
        field1321 = arg0;
        field1316 = arg1;
        field1317 = arg2;
        field1320 = arg3;
    }

    @ObfuscatedName("bw.cq(IIII)V")
    public static void method1585(int arg0, int arg1, int arg2, int arg3) {
        if (field1321 < arg0) {
            field1321 = arg0;
        }
        if (field1316 < arg1) {
            field1316 = arg1;
        }
        if (field1317 > arg2) {
            field1317 = arg2;
        }
        if (field1320 > arg3) {
            field1320 = arg3;
        }
    }

    @ObfuscatedName("bw.co([I)V")
    public static void method1558(int[] arg0) {
        arg0[0] = field1321;
        arg0[1] = field1316;
        arg0[2] = field1317;
        arg0[3] = field1320;
    }

    @ObfuscatedName("bw.ca([I)V")
    public static void method1557(int[] arg0) {
        field1321 = arg0[0];
        field1316 = arg0[1];
        field1317 = arg0[2];
        field1320 = arg0[3];
    }

    @ObfuscatedName("bw.cz()V")
    public static void method1574() {
        int var0 = 0;
        int var1 = Statics.field1319 * Statics.field1318 - 7;
        while (var0 < var1) {
            Statics.field1322[var0++] = 0;
            Statics.field1322[var0++] = 0;
            Statics.field1322[var0++] = 0;
            Statics.field1322[var0++] = 0;
            Statics.field1322[var0++] = 0;
            Statics.field1322[var0++] = 0;
            Statics.field1322[var0++] = 0;
            Statics.field1322[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1322[var0++] = 0;
        }
    }

    @ObfuscatedName("bw.ce(IIIIII)V")
    public static void method1561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1321) {
            arg2 -= field1321 - arg0;
            arg0 = field1321;
        }
        if (arg1 < field1316) {
            arg3 -= field1316 - arg1;
            arg1 = field1316;
        }
        if (arg0 + arg2 > field1317) {
            arg2 = field1317 - arg0;
        }
        if (arg1 + arg3 > field1320) {
            arg3 = field1320 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1319 - arg2;
        int var9 = Statics.field1319 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1322[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1322[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bw.cn(IIIII)V")
    public static void method1605(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1321) {
            arg2 -= field1321 - arg0;
            arg0 = field1321;
        }
        if (arg1 < field1316) {
            arg3 -= field1316 - arg1;
            arg1 = field1316;
        }
        if (arg0 + arg2 > field1317) {
            arg2 = field1317 - arg0;
        }
        if (arg1 + arg3 > field1320) {
            arg3 = field1320 - arg1;
        }
        int var5 = Statics.field1319 - arg2;
        int var6 = Statics.field1319 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1322[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bw.cy(IIIIII)V")
    public static void method1563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1321) {
            arg2 -= field1321 - arg0;
            arg0 = field1321;
        }
        if (arg1 < field1316) {
            var6 += (field1316 - arg1) * var7;
            arg3 -= field1316 - arg1;
            arg1 = field1316;
        }
        if (arg0 + arg2 > field1317) {
            arg2 = field1317 - arg0;
        }
        if (arg1 + arg3 > field1320) {
            arg3 = field1320 - arg1;
        }
        int var8 = Statics.field1319 - arg2;
        int var9 = Statics.field1319 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1322[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bw.cv(IIIII)V")
    public static void method1564(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1571(arg0, arg1, arg2, arg4);
        method1571(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1597(arg0, arg1, arg3, arg4);
        method1597(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bw.cw(IIIIII)V")
    public static void method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1567(arg0, arg1, arg2, arg4, arg5);
        method1567(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1569(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1569(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bw.ck(IIII)V")
    public static void method1571(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1316 || arg1 >= field1320) {
            return;
        }
        if (arg0 < field1321) {
            arg2 -= field1321 - arg0;
            arg0 = field1321;
        }
        if (arg0 + arg2 > field1317) {
            arg2 = field1317 - arg0;
        }
        int var4 = Statics.field1319 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1322[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bw.cp(IIIII)V")
    public static void method1567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1316 || arg1 >= field1320) {
            return;
        }
        if (arg0 < field1321) {
            arg2 -= field1321 - arg0;
            arg0 = field1321;
        }
        if (arg0 + arg2 > field1317) {
            arg2 = field1317 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1319 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1322[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1322[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1322[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1322[var9++] = var14;
        }
    }

    @ObfuscatedName("bw.cr(IIII)V")
    public static void method1597(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1321 || arg0 >= field1317) {
            return;
        }
        if (arg1 < field1316) {
            arg2 -= field1316 - arg1;
            arg1 = field1316;
        }
        if (arg1 + arg2 > field1320) {
            arg2 = field1320 - arg1;
        }
        int var4 = Statics.field1319 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1322[Statics.field1319 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bw.dh(IIIII)V")
    public static void method1569(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1321 || arg0 >= field1317) {
            return;
        }
        if (arg1 < field1316) {
            arg2 -= field1316 - arg1;
            arg1 = field1316;
        }
        if (arg1 + arg2 > field1320) {
            arg2 = field1320 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1319 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1322[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1322[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1322[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1322[var9] = var14;
            var9 += Statics.field1319;
        }
    }

    @ObfuscatedName("bw.de(IIIII)V")
    public static void method1570(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1571(arg0, arg1, var5 + 1, arg4);
            } else {
                method1571(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1321) {
                    var8 += (field1321 - arg0) * var10;
                    arg0 = field1321;
                }
                if (var11 >= field1317) {
                    var11 = field1317 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1316 && var12 < field1320) {
                        Statics.field1322[Statics.field1319 * var12 + arg0] = arg4;
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
                if (arg1 < field1316) {
                    var14 += (field1316 - arg1) * var16;
                    arg1 = field1316;
                }
                if (var17 >= field1320) {
                    var17 = field1320 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1321 && var18 < field1317) {
                        Statics.field1322[Statics.field1319 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1597(arg0, arg1, var6 + 1, arg4);
        } else {
            method1597(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bw.dp(III[I[I)V")
    public static void method1607(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1319 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1322[var7++] = arg2;
            }
            var5 += Statics.field1319;
        }
    }
}
