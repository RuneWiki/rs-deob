package deob;

@ObfuscatedName("bw")
public class class75 extends class195 {

    @ObfuscatedName("bw.b")
    public static int field1354 = 0;

    @ObfuscatedName("bw.u")
    public static int field1357 = 0;

    @ObfuscatedName("bw.t")
    public static int field1358 = 0;

    @ObfuscatedName("bw.s")
    public static int field1359 = 0;

    @ObfuscatedName("bw.cs([III)V")
    public static void method1597(int[] arg0, int arg1, int arg2) {
        Statics.field1353 = arg0;
        Statics.field1356 = arg1;
        Statics.field1355 = arg2;
        method1658(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bw.cg()V")
    public static void method1598() {
        field1358 = 0;
        field1354 = 0;
        field1359 = Statics.field1356;
        field1357 = Statics.field1355;
    }

    @ObfuscatedName("bw.cv(IIII)V")
    public static void method1658(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1356) {
            arg2 = Statics.field1356;
        }
        if (arg3 > Statics.field1355) {
            arg3 = Statics.field1355;
        }
        field1358 = arg0;
        field1354 = arg1;
        field1359 = arg2;
        field1357 = arg3;
    }

    @ObfuscatedName("bw.ci(IIII)V")
    public static void method1600(int arg0, int arg1, int arg2, int arg3) {
        if (field1358 < arg0) {
            field1358 = arg0;
        }
        if (field1354 < arg1) {
            field1354 = arg1;
        }
        if (field1359 > arg2) {
            field1359 = arg2;
        }
        if (field1357 > arg3) {
            field1357 = arg3;
        }
    }

    @ObfuscatedName("bw.cj([I)V")
    public static void method1602(int[] arg0) {
        arg0[0] = field1358;
        arg0[1] = field1354;
        arg0[2] = field1359;
        arg0[3] = field1357;
    }

    @ObfuscatedName("bw.cq([I)V")
    public static void method1596(int[] arg0) {
        field1358 = arg0[0];
        field1354 = arg0[1];
        field1359 = arg0[2];
        field1357 = arg0[3];
    }

    @ObfuscatedName("bw.ch()V")
    public static void method1603() {
        int var0 = 0;
        int var1 = Statics.field1356 * Statics.field1355 - 7;
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

    @ObfuscatedName("bw.cr(IIIIII)V")
    public static void method1604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1358) {
            arg2 -= field1358 - arg0;
            arg0 = field1358;
        }
        if (arg1 < field1354) {
            arg3 -= field1354 - arg1;
            arg1 = field1354;
        }
        if (arg0 + arg2 > field1359) {
            arg2 = field1359 - arg0;
        }
        if (arg1 + arg3 > field1357) {
            arg3 = field1357 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1356 - arg2;
        int var9 = Statics.field1356 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1353[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1353[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bw.cd(IIIII)V")
    public static void method1605(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1358) {
            arg2 -= field1358 - arg0;
            arg0 = field1358;
        }
        if (arg1 < field1354) {
            arg3 -= field1354 - arg1;
            arg1 = field1354;
        }
        if (arg0 + arg2 > field1359) {
            arg2 = field1359 - arg0;
        }
        if (arg1 + arg3 > field1357) {
            arg3 = field1357 - arg1;
        }
        int var5 = Statics.field1356 - arg2;
        int var6 = Statics.field1356 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1353[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bw.cw(IIIIII)V")
    public static void method1606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1358) {
            arg2 -= field1358 - arg0;
            arg0 = field1358;
        }
        if (arg1 < field1354) {
            var6 += (field1354 - arg1) * var7;
            arg3 -= field1354 - arg1;
            arg1 = field1354;
        }
        if (arg0 + arg2 > field1359) {
            arg2 = field1359 - arg0;
        }
        if (arg1 + arg3 > field1357) {
            arg3 = field1357 - arg1;
        }
        int var8 = Statics.field1356 - arg2;
        int var9 = Statics.field1356 * arg1 + arg0;
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

    @ObfuscatedName("bw.ct(IIIII)V")
    public static void method1607(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1643(arg0, arg1, arg2, arg4);
        method1643(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1626(arg0, arg1, arg3, arg4);
        method1626(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bw.cc(IIIIII)V")
    public static void method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1610(arg0, arg1, arg2, arg4, arg5);
        method1610(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1611(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1611(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bw.ck(IIII)V")
    public static void method1643(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1354 || arg1 >= field1357) {
            return;
        }
        if (arg0 < field1358) {
            arg2 -= field1358 - arg0;
            arg0 = field1358;
        }
        if (arg0 + arg2 > field1359) {
            arg2 = field1359 - arg0;
        }
        int var4 = Statics.field1356 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1353[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bw.ca(IIIII)V")
    public static void method1610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1354 || arg1 >= field1357) {
            return;
        }
        if (arg0 < field1358) {
            arg2 -= field1358 - arg0;
            arg0 = field1358;
        }
        if (arg0 + arg2 > field1359) {
            arg2 = field1359 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1356 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1353[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1353[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1353[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1353[var9++] = var14;
        }
    }

    @ObfuscatedName("bw.cz(IIII)V")
    public static void method1626(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1358 || arg0 >= field1359) {
            return;
        }
        if (arg1 < field1354) {
            arg2 -= field1354 - arg1;
            arg1 = field1354;
        }
        if (arg1 + arg2 > field1357) {
            arg2 = field1357 - arg1;
        }
        int var4 = Statics.field1356 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1353[Statics.field1356 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bw.cu(IIIII)V")
    public static void method1611(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1358 || arg0 >= field1359) {
            return;
        }
        if (arg1 < field1354) {
            arg2 -= field1354 - arg1;
            arg1 = field1354;
        }
        if (arg1 + arg2 > field1357) {
            arg2 = field1357 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1356 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1353[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1353[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1353[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1353[var9] = var14;
            var9 += Statics.field1356;
        }
    }

    @ObfuscatedName("bw.co(IIIII)V")
    public static void method1612(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1643(arg0, arg1, var5 + 1, arg4);
            } else {
                method1643(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1358) {
                    var8 += (field1358 - arg0) * var10;
                    arg0 = field1358;
                }
                if (var11 >= field1359) {
                    var11 = field1359 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1354 && var12 < field1357) {
                        Statics.field1353[Statics.field1356 * var12 + arg0] = arg4;
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
                if (arg1 < field1354) {
                    var14 += (field1354 - arg1) * var16;
                    arg1 = field1354;
                }
                if (var17 >= field1357) {
                    var17 = field1357 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1358 && var18 < field1359) {
                        Statics.field1353[Statics.field1356 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1626(arg0, arg1, var6 + 1, arg4);
        } else {
            method1626(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bw.cb(III[I[I)V")
    public static void method1613(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1356 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1353[var7++] = arg2;
            }
            var5 += Statics.field1356;
        }
    }
}
