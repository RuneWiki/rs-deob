package deob;

@ObfuscatedName("bu")
public class class73 extends class181 {

    @ObfuscatedName("bu.c")
    public static int field1315 = 0;

    @ObfuscatedName("bu.d")
    public static int field1319 = 0;

    @ObfuscatedName("bu.g")
    public static int field1320 = 0;

    @ObfuscatedName("bu.s")
    public static int field1316 = 0;

    @ObfuscatedName("bu.cx([III)V")
    public static void method1516(int[] arg0, int arg1, int arg2) {
        Statics.field1318 = arg0;
        Statics.field1321 = arg1;
        Statics.field1317 = arg2;
        method1518(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bu.ca()V")
    public static void method1544() {
        field1320 = 0;
        field1315 = 0;
        field1316 = Statics.field1321;
        field1319 = Statics.field1317;
    }

    @ObfuscatedName("bu.ci(IIII)V")
    public static void method1518(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1321) {
            arg2 = Statics.field1321;
        }
        if (arg3 > Statics.field1317) {
            arg3 = Statics.field1317;
        }
        field1320 = arg0;
        field1315 = arg1;
        field1316 = arg2;
        field1319 = arg3;
    }

    @ObfuscatedName("bu.ck(IIII)V")
    public static void method1519(int arg0, int arg1, int arg2, int arg3) {
        if (field1320 < arg0) {
            field1320 = arg0;
        }
        if (field1315 < arg1) {
            field1315 = arg1;
        }
        if (field1316 > arg2) {
            field1316 = arg2;
        }
        if (field1319 > arg3) {
            field1319 = arg3;
        }
    }

    @ObfuscatedName("bu.cw([I)V")
    public static void method1520(int[] arg0) {
        arg0[0] = field1320;
        arg0[1] = field1315;
        arg0[2] = field1316;
        arg0[3] = field1319;
    }

    @ObfuscatedName("bu.cl([I)V")
    public static void method1551(int[] arg0) {
        field1320 = arg0[0];
        field1315 = arg0[1];
        field1316 = arg0[2];
        field1319 = arg0[3];
    }

    @ObfuscatedName("bu.ce()V")
    public static void method1522() {
        int var0 = 0;
        int var1 = Statics.field1321 * Statics.field1317 - 7;
        while (var0 < var1) {
            Statics.field1318[var0++] = 0;
            Statics.field1318[var0++] = 0;
            Statics.field1318[var0++] = 0;
            Statics.field1318[var0++] = 0;
            Statics.field1318[var0++] = 0;
            Statics.field1318[var0++] = 0;
            Statics.field1318[var0++] = 0;
            Statics.field1318[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1318[var0++] = 0;
        }
    }

    @ObfuscatedName("bu.cu(IIIIII)V")
    public static void method1523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1320) {
            arg2 -= field1320 - arg0;
            arg0 = field1320;
        }
        if (arg1 < field1315) {
            arg3 -= field1315 - arg1;
            arg1 = field1315;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        if (arg1 + arg3 > field1319) {
            arg3 = field1319 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1321 - arg2;
        int var9 = Statics.field1321 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1318[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1318[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bu.cf(IIIII)V")
    public static void method1524(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1320) {
            arg2 -= field1320 - arg0;
            arg0 = field1320;
        }
        if (arg1 < field1315) {
            arg3 -= field1315 - arg1;
            arg1 = field1315;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        if (arg1 + arg3 > field1319) {
            arg3 = field1319 - arg1;
        }
        int var5 = Statics.field1321 - arg2;
        int var6 = Statics.field1321 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1318[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bu.cv(IIIIII)V")
    public static void method1552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1320) {
            arg2 -= field1320 - arg0;
            arg0 = field1320;
        }
        if (arg1 < field1315) {
            var6 += (field1315 - arg1) * var7;
            arg3 -= field1315 - arg1;
            arg1 = field1315;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        if (arg1 + arg3 > field1319) {
            arg3 = field1319 - arg1;
        }
        int var8 = Statics.field1321 - arg2;
        int var9 = Statics.field1321 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1318[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bu.cn(IIIII)V")
    public static void method1539(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1528(arg0, arg1, arg2, arg4);
        method1528(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1526(arg0, arg1, arg3, arg4);
        method1526(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bu.cs(IIIIII)V")
    public static void method1527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1529(arg0, arg1, arg2, arg4, arg5);
        method1529(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1560(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1560(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bu.dh(IIII)V")
    public static void method1528(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1315 || arg1 >= field1319) {
            return;
        }
        if (arg0 < field1320) {
            arg2 -= field1320 - arg0;
            arg0 = field1320;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        int var4 = Statics.field1321 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1318[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bu.dt(IIIII)V")
    public static void method1529(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1315 || arg1 >= field1319) {
            return;
        }
        if (arg0 < field1320) {
            arg2 -= field1320 - arg0;
            arg0 = field1320;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1321 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1318[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1318[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1318[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1318[var9++] = var14;
        }
    }

    @ObfuscatedName("bu.de(IIII)V")
    public static void method1526(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1320 || arg0 >= field1316) {
            return;
        }
        if (arg1 < field1315) {
            arg2 -= field1315 - arg1;
            arg1 = field1315;
        }
        if (arg1 + arg2 > field1319) {
            arg2 = field1319 - arg1;
        }
        int var4 = Statics.field1321 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1318[Statics.field1321 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bu.dk(IIIII)V")
    public static void method1560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1320 || arg0 >= field1316) {
            return;
        }
        if (arg1 < field1315) {
            arg2 -= field1315 - arg1;
            arg1 = field1315;
        }
        if (arg1 + arg2 > field1319) {
            arg2 = field1319 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1321 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1318[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1318[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1318[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1318[var9] = var14;
            var9 += Statics.field1321;
        }
    }

    @ObfuscatedName("bu.dw(IIIII)V")
    public static void method1532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1528(arg0, arg1, var5 + 1, arg4);
            } else {
                method1528(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1320) {
                    var8 += (field1320 - arg0) * var10;
                    arg0 = field1320;
                }
                if (var11 >= field1316) {
                    var11 = field1316 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1315 && var12 < field1319) {
                        Statics.field1318[Statics.field1321 * var12 + arg0] = arg4;
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
                if (arg1 < field1315) {
                    var14 += (field1315 - arg1) * var16;
                    arg1 = field1315;
                }
                if (var17 >= field1319) {
                    var17 = field1319 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1320 && var18 < field1316) {
                        Statics.field1318[Statics.field1321 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1526(arg0, arg1, var6 + 1, arg4);
        } else {
            method1526(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bu.dn(III[I[I)V")
    public static void method1533(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1321 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1318[var7++] = arg2;
            }
            var5 += Statics.field1321;
        }
    }
}
