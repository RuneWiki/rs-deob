package deob;

@ObfuscatedName("ba")
public class class74 extends class185 {

    @ObfuscatedName("ba.f")
    public static int field1317 = 0;

    @ObfuscatedName("ba.u")
    public static int field1318 = 0;

    @ObfuscatedName("ba.v")
    public static int field1315 = 0;

    @ObfuscatedName("ba.r")
    public static int field1319 = 0;

    @ObfuscatedName("ba.cx([III)V")
    public static void method1458(int[] arg0, int arg1, int arg2) {
        Statics.field1320 = arg0;
        Statics.field1314 = arg1;
        Statics.field1316 = arg2;
        method1460(0, 0, arg1, arg2);
    }

    @ObfuscatedName("ba.cr()V")
    public static void method1459() {
        field1315 = 0;
        field1317 = 0;
        field1319 = Statics.field1314;
        field1318 = Statics.field1316;
    }

    @ObfuscatedName("ba.cl(IIII)V")
    public static void method1460(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1314) {
            arg2 = Statics.field1314;
        }
        if (arg3 > Statics.field1316) {
            arg3 = Statics.field1316;
        }
        field1315 = arg0;
        field1317 = arg1;
        field1319 = arg2;
        field1318 = arg3;
    }

    @ObfuscatedName("ba.cb(IIII)V")
    public static void method1484(int arg0, int arg1, int arg2, int arg3) {
        if (field1315 < arg0) {
            field1315 = arg0;
        }
        if (field1317 < arg1) {
            field1317 = arg1;
        }
        if (field1319 > arg2) {
            field1319 = arg2;
        }
        if (field1318 > arg3) {
            field1318 = arg3;
        }
    }

    @ObfuscatedName("ba.cu([I)V")
    public static void method1461(int[] arg0) {
        arg0[0] = field1315;
        arg0[1] = field1317;
        arg0[2] = field1319;
        arg0[3] = field1318;
    }

    @ObfuscatedName("ba.cq([I)V")
    public static void method1463(int[] arg0) {
        field1315 = arg0[0];
        field1317 = arg0[1];
        field1319 = arg0[2];
        field1318 = arg0[3];
    }

    @ObfuscatedName("ba.di()V")
    public static void method1464() {
        int var0 = 0;
        int var1 = Statics.field1316 * Statics.field1314 - 7;
        while (var0 < var1) {
            Statics.field1320[var0++] = 0;
            Statics.field1320[var0++] = 0;
            Statics.field1320[var0++] = 0;
            Statics.field1320[var0++] = 0;
            Statics.field1320[var0++] = 0;
            Statics.field1320[var0++] = 0;
            Statics.field1320[var0++] = 0;
            Statics.field1320[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1320[var0++] = 0;
        }
    }

    @ObfuscatedName("ba.dv(IIIIII)V")
    public static void method1481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg1 < field1317) {
            arg3 -= field1317 - arg1;
            arg1 = field1317;
        }
        if (arg0 + arg2 > field1319) {
            arg2 = field1319 - arg0;
        }
        if (arg1 + arg3 > field1318) {
            arg3 = field1318 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1314 - arg2;
        int var9 = Statics.field1314 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1320[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1320[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("ba.dg(IIIII)V")
    public static void method1466(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg1 < field1317) {
            arg3 -= field1317 - arg1;
            arg1 = field1317;
        }
        if (arg0 + arg2 > field1319) {
            arg2 = field1319 - arg0;
        }
        if (arg1 + arg3 > field1318) {
            arg3 = field1318 - arg1;
        }
        int var5 = Statics.field1314 - arg2;
        int var6 = Statics.field1314 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1320[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("ba.df(IIIIII)V")
    public static void method1467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg1 < field1317) {
            var6 += (field1317 - arg1) * var7;
            arg3 -= field1317 - arg1;
            arg1 = field1317;
        }
        if (arg0 + arg2 > field1319) {
            arg2 = field1319 - arg0;
        }
        if (arg1 + arg3 > field1318) {
            arg3 = field1318 - arg1;
        }
        int var8 = Statics.field1314 - arg2;
        int var9 = Statics.field1314 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1320[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("ba.dq(IIIII)V")
    public static void method1510(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1505(arg0, arg1, arg2, arg4);
        method1505(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1472(arg0, arg1, arg3, arg4);
        method1472(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("ba.dn(IIIIII)V")
    public static void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1471(arg0, arg1, arg2, arg4, arg5);
        method1471(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1470(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1470(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("ba.de(IIII)V")
    public static void method1505(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1317 || arg1 >= field1318) {
            return;
        }
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg0 + arg2 > field1319) {
            arg2 = field1319 - arg0;
        }
        int var4 = Statics.field1314 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1320[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("ba.do(IIIII)V")
    public static void method1471(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1317 || arg1 >= field1318) {
            return;
        }
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg0 + arg2 > field1319) {
            arg2 = field1319 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1314 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1320[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1320[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1320[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1320[var9++] = var14;
        }
    }

    @ObfuscatedName("ba.da(IIII)V")
    public static void method1472(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1315 || arg0 >= field1319) {
            return;
        }
        if (arg1 < field1317) {
            arg2 -= field1317 - arg1;
            arg1 = field1317;
        }
        if (arg1 + arg2 > field1318) {
            arg2 = field1318 - arg1;
        }
        int var4 = Statics.field1314 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1320[Statics.field1314 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("ba.dh(IIIII)V")
    public static void method1470(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1315 || arg0 >= field1319) {
            return;
        }
        if (arg1 < field1317) {
            arg2 -= field1317 - arg1;
            arg1 = field1317;
        }
        if (arg1 + arg2 > field1318) {
            arg2 = field1318 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1314 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1320[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1320[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1320[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1320[var9] = var14;
            var9 += Statics.field1314;
        }
    }

    @ObfuscatedName("ba.dd(IIIII)V")
    public static void method1501(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1505(arg0, arg1, var5 + 1, arg4);
            } else {
                method1505(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1315) {
                    var8 += (field1315 - arg0) * var10;
                    arg0 = field1315;
                }
                if (var11 >= field1319) {
                    var11 = field1319 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1317 && var12 < field1318) {
                        Statics.field1320[Statics.field1314 * var12 + arg0] = arg4;
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
                if (arg1 < field1317) {
                    var14 += (field1317 - arg1) * var16;
                    arg1 = field1317;
                }
                if (var17 >= field1318) {
                    var17 = field1318 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1315 && var18 < field1319) {
                        Statics.field1320[Statics.field1314 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1472(arg0, arg1, var6 + 1, arg4);
        } else {
            method1472(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("ba.du(III[I[I)V")
    public static void method1499(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1314 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1320[var7++] = arg2;
            }
            var5 += Statics.field1314;
        }
    }
}
