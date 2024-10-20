package deob;

@ObfuscatedName("br")
public class class73 extends class182 {

    @ObfuscatedName("br.u")
    public static int field1318 = 0;

    @ObfuscatedName("br.n")
    public static int field1320 = 0;

    @ObfuscatedName("br.x")
    public static int field1322 = 0;

    @ObfuscatedName("br.f")
    public static int field1324 = 0;

    @ObfuscatedName("br.cy([III)V")
    public static void method1558(int[] arg0, int arg1, int arg2) {
        Statics.field1323 = arg0;
        Statics.field1319 = arg1;
        Statics.field1321 = arg2;
        method1511(0, 0, arg1, arg2);
    }

    @ObfuscatedName("br.cj()V")
    public static void method1510() {
        field1322 = 0;
        field1318 = 0;
        field1324 = Statics.field1319;
        field1320 = Statics.field1321;
    }

    @ObfuscatedName("br.cx(IIII)V")
    public static void method1511(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1319) {
            arg2 = Statics.field1319;
        }
        if (arg3 > Statics.field1321) {
            arg3 = Statics.field1321;
        }
        field1322 = arg0;
        field1318 = arg1;
        field1324 = arg2;
        field1320 = arg3;
    }

    @ObfuscatedName("br.cc(IIII)V")
    public static void method1512(int arg0, int arg1, int arg2, int arg3) {
        if (field1322 < arg0) {
            field1322 = arg0;
        }
        if (field1318 < arg1) {
            field1318 = arg1;
        }
        if (field1324 > arg2) {
            field1324 = arg2;
        }
        if (field1320 > arg3) {
            field1320 = arg3;
        }
    }

    @ObfuscatedName("br.cq([I)V")
    public static void method1513(int[] arg0) {
        arg0[0] = field1322;
        arg0[1] = field1318;
        arg0[2] = field1324;
        arg0[3] = field1320;
    }

    @ObfuscatedName("br.cv([I)V")
    public static void method1514(int[] arg0) {
        field1322 = arg0[0];
        field1318 = arg0[1];
        field1324 = arg0[2];
        field1320 = arg0[3];
    }

    @ObfuscatedName("br.cf()V")
    public static void method1553() {
        int var0 = 0;
        int var1 = Statics.field1321 * Statics.field1319 - 7;
        while (var0 < var1) {
            Statics.field1323[var0++] = 0;
            Statics.field1323[var0++] = 0;
            Statics.field1323[var0++] = 0;
            Statics.field1323[var0++] = 0;
            Statics.field1323[var0++] = 0;
            Statics.field1323[var0++] = 0;
            Statics.field1323[var0++] = 0;
            Statics.field1323[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1323[var0++] = 0;
        }
    }

    @ObfuscatedName("br.ce(IIIIII)V")
    public static void method1516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1322) {
            arg2 -= field1322 - arg0;
            arg0 = field1322;
        }
        if (arg1 < field1318) {
            arg3 -= field1318 - arg1;
            arg1 = field1318;
        }
        if (arg0 + arg2 > field1324) {
            arg2 = field1324 - arg0;
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
                int var12 = Statics.field1323[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1323[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("br.cm(IIIII)V")
    public static void method1517(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1322) {
            arg2 -= field1322 - arg0;
            arg0 = field1322;
        }
        if (arg1 < field1318) {
            arg3 -= field1318 - arg1;
            arg1 = field1318;
        }
        if (arg0 + arg2 > field1324) {
            arg2 = field1324 - arg0;
        }
        if (arg1 + arg3 > field1320) {
            arg3 = field1320 - arg1;
        }
        int var5 = Statics.field1319 - arg2;
        int var6 = Statics.field1319 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1323[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("br.cr(IIIIII)V")
    public static void method1518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1322) {
            arg2 -= field1322 - arg0;
            arg0 = field1322;
        }
        if (arg1 < field1318) {
            var6 += (field1318 - arg1) * var7;
            arg3 -= field1318 - arg1;
            arg1 = field1318;
        }
        if (arg0 + arg2 > field1324) {
            arg2 = field1324 - arg0;
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
                Statics.field1323[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("br.ck(IIIII)V")
    public static void method1520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1521(arg0, arg1, arg2, arg4);
        method1521(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1523(arg0, arg1, arg3, arg4);
        method1523(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("br.ca(IIIIII)V")
    public static void method1515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1522(arg0, arg1, arg2, arg4, arg5);
        method1522(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1524(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1524(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("br.cp(IIII)V")
    public static void method1521(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1318 || arg1 >= field1320) {
            return;
        }
        if (arg0 < field1322) {
            arg2 -= field1322 - arg0;
            arg0 = field1322;
        }
        if (arg0 + arg2 > field1324) {
            arg2 = field1324 - arg0;
        }
        int var4 = Statics.field1319 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1323[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("br.cw(IIIII)V")
    public static void method1522(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1318 || arg1 >= field1320) {
            return;
        }
        if (arg0 < field1322) {
            arg2 -= field1322 - arg0;
            arg0 = field1322;
        }
        if (arg0 + arg2 > field1324) {
            arg2 = field1324 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1319 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1323[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1323[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1323[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1323[var9++] = var14;
        }
    }

    @ObfuscatedName("br.cl(IIII)V")
    public static void method1523(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1322 || arg0 >= field1324) {
            return;
        }
        if (arg1 < field1318) {
            arg2 -= field1318 - arg1;
            arg1 = field1318;
        }
        if (arg1 + arg2 > field1320) {
            arg2 = field1320 - arg1;
        }
        int var4 = Statics.field1319 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1323[Statics.field1319 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("br.cz(IIIII)V")
    public static void method1524(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1322 || arg0 >= field1324) {
            return;
        }
        if (arg1 < field1318) {
            arg2 -= field1318 - arg1;
            arg1 = field1318;
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
            int var11 = (Statics.field1323[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1323[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1323[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1323[var9] = var14;
            var9 += Statics.field1319;
        }
    }

    @ObfuscatedName("br.ci(IIIII)V")
    public static void method1525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1521(arg0, arg1, var5 + 1, arg4);
            } else {
                method1521(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1322) {
                    var8 += (field1322 - arg0) * var10;
                    arg0 = field1322;
                }
                if (var11 >= field1324) {
                    var11 = field1324 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1318 && var12 < field1320) {
                        Statics.field1323[Statics.field1319 * var12 + arg0] = arg4;
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
                if (arg1 < field1318) {
                    var14 += (field1318 - arg1) * var16;
                    arg1 = field1318;
                }
                if (var17 >= field1320) {
                    var17 = field1320 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1322 && var18 < field1324) {
                        Statics.field1323[Statics.field1319 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1523(arg0, arg1, var6 + 1, arg4);
        } else {
            method1523(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("br.df(III[I[I)V")
    public static void method1526(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1319 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1323[var7++] = arg2;
            }
            var5 += Statics.field1319;
        }
    }
}
