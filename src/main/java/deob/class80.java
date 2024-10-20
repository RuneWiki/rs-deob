package deob;

@ObfuscatedName("cz")
public class class80 extends class204 {

    @ObfuscatedName("cz.r")
    public static int field1369 = 0;

    @ObfuscatedName("cz.h")
    public static int field1370 = 0;

    @ObfuscatedName("cz.n")
    public static int field1367 = 0;

    @ObfuscatedName("cz.b")
    public static int field1372 = 0;

    @ObfuscatedName("cz.cf([III)V")
    public static void method1771(int[] arg0, int arg1, int arg2) {
        Statics.field1371 = arg0;
        Statics.field1368 = arg1;
        Statics.field1366 = arg2;
        method1784(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cz.cj()V")
    public static void method1751() {
        field1367 = 0;
        field1369 = 0;
        field1372 = Statics.field1368;
        field1370 = Statics.field1366;
    }

    @ObfuscatedName("cz.cl(IIII)V")
    public static void method1784(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1368) {
            arg2 = Statics.field1368;
        }
        if (arg3 > Statics.field1366) {
            arg3 = Statics.field1366;
        }
        field1367 = arg0;
        field1369 = arg1;
        field1372 = arg2;
        field1370 = arg3;
    }

    @ObfuscatedName("cz.cq(IIII)V")
    public static void method1730(int arg0, int arg1, int arg2, int arg3) {
        if (field1367 < arg0) {
            field1367 = arg0;
        }
        if (field1369 < arg1) {
            field1369 = arg1;
        }
        if (field1372 > arg2) {
            field1372 = arg2;
        }
        if (field1370 > arg3) {
            field1370 = arg3;
        }
    }

    @ObfuscatedName("cz.co([I)V")
    public static void method1731(int[] arg0) {
        arg0[0] = field1367;
        arg0[1] = field1369;
        arg0[2] = field1372;
        arg0[3] = field1370;
    }

    @ObfuscatedName("cz.ce([I)V")
    public static void method1732(int[] arg0) {
        field1367 = arg0[0];
        field1369 = arg0[1];
        field1372 = arg0[2];
        field1370 = arg0[3];
    }

    @ObfuscatedName("cz.cw()V")
    public static void method1729() {
        int var0 = 0;
        int var1 = Statics.field1368 * Statics.field1366 - 7;
        while (var0 < var1) {
            Statics.field1371[var0++] = 0;
            Statics.field1371[var0++] = 0;
            Statics.field1371[var0++] = 0;
            Statics.field1371[var0++] = 0;
            Statics.field1371[var0++] = 0;
            Statics.field1371[var0++] = 0;
            Statics.field1371[var0++] = 0;
            Statics.field1371[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1371[var0++] = 0;
        }
    }

    @ObfuscatedName("cz.cd(IIIIII)V")
    public static void method1734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1367) {
            arg2 -= field1367 - arg0;
            arg0 = field1367;
        }
        if (arg1 < field1369) {
            arg3 -= field1369 - arg1;
            arg1 = field1369;
        }
        if (arg0 + arg2 > field1372) {
            arg2 = field1372 - arg0;
        }
        if (arg1 + arg3 > field1370) {
            arg3 = field1370 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1368 - arg2;
        int var9 = Statics.field1368 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1371[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1371[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cz.cy(IIIII)V")
    public static void method1735(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1367) {
            arg2 -= field1367 - arg0;
            arg0 = field1367;
        }
        if (arg1 < field1369) {
            arg3 -= field1369 - arg1;
            arg1 = field1369;
        }
        if (arg0 + arg2 > field1372) {
            arg2 = field1372 - arg0;
        }
        if (arg1 + arg3 > field1370) {
            arg3 = field1370 - arg1;
        }
        int var5 = Statics.field1368 - arg2;
        int var6 = Statics.field1368 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1371[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cz.ca(IIIIII)V")
    public static void method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1367) {
            arg2 -= field1367 - arg0;
            arg0 = field1367;
        }
        if (arg1 < field1369) {
            var6 += (field1369 - arg1) * var7;
            arg3 -= field1369 - arg1;
            arg1 = field1369;
        }
        if (arg0 + arg2 > field1372) {
            arg2 = field1372 - arg0;
        }
        if (arg1 + arg3 > field1370) {
            arg3 = field1370 - arg1;
        }
        int var8 = Statics.field1368 - arg2;
        int var9 = Statics.field1368 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1371[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cz.cr(IIIII)V")
    public static void method1737(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1739(arg0, arg1, arg2, arg4);
        method1739(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1741(arg0, arg1, arg3, arg4);
        method1741(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cz.ct(IIIIII)V")
    public static void method1738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1740(arg0, arg1, arg2, arg4, arg5);
        method1740(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1789(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1789(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cz.cn(IIII)V")
    public static void method1739(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1369 || arg1 >= field1370) {
            return;
        }
        if (arg0 < field1367) {
            arg2 -= field1367 - arg0;
            arg0 = field1367;
        }
        if (arg0 + arg2 > field1372) {
            arg2 = field1372 - arg0;
        }
        int var4 = Statics.field1368 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1371[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cz.db(IIIII)V")
    public static void method1740(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1369 || arg1 >= field1370) {
            return;
        }
        if (arg0 < field1367) {
            arg2 -= field1367 - arg0;
            arg0 = field1367;
        }
        if (arg0 + arg2 > field1372) {
            arg2 = field1372 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1368 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1371[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1371[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1371[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1371[var9++] = var14;
        }
    }

    @ObfuscatedName("cz.du(IIII)V")
    public static void method1741(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1367 || arg0 >= field1372) {
            return;
        }
        if (arg1 < field1369) {
            arg2 -= field1369 - arg1;
            arg1 = field1369;
        }
        if (arg1 + arg2 > field1370) {
            arg2 = field1370 - arg1;
        }
        int var4 = Statics.field1368 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1371[Statics.field1368 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cz.dr(IIIII)V")
    public static void method1789(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1367 || arg0 >= field1372) {
            return;
        }
        if (arg1 < field1369) {
            arg2 -= field1369 - arg1;
            arg1 = field1369;
        }
        if (arg1 + arg2 > field1370) {
            arg2 = field1370 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1368 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1371[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1371[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1371[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1371[var9] = var14;
            var9 += Statics.field1368;
        }
    }

    @ObfuscatedName("cz.dl(IIIII)V")
    public static void method1728(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1739(arg0, arg1, var5 + 1, arg4);
            } else {
                method1739(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1367) {
                    var8 += (field1367 - arg0) * var10;
                    arg0 = field1367;
                }
                if (var11 >= field1372) {
                    var11 = field1372 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1369 && var12 < field1370) {
                        Statics.field1371[Statics.field1368 * var12 + arg0] = arg4;
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
                if (arg1 < field1369) {
                    var14 += (field1369 - arg1) * var16;
                    arg1 = field1369;
                }
                if (var17 >= field1370) {
                    var17 = field1370 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1367 && var18 < field1372) {
                        Statics.field1371[Statics.field1368 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1741(arg0, arg1, var6 + 1, arg4);
        } else {
            method1741(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cz.dp(III[I[I)V")
    public static void method1744(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1368 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1371[var7++] = arg2;
            }
            var5 += Statics.field1368;
        }
    }
}
