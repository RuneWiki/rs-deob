package deob;

@ObfuscatedName("bt")
public class class75 extends class194 {

    @ObfuscatedName("bt.t")
    public static int field1286 = 0;

    @ObfuscatedName("bt.z")
    public static int field1287 = 0;

    @ObfuscatedName("bt.y")
    public static int field1288 = 0;

    @ObfuscatedName("bt.q")
    public static int field1284 = 0;

    @ObfuscatedName("bt.ck([III)V")
    public static void method1570(int[] arg0, int arg1, int arg2) {
        Statics.field1289 = arg0;
        Statics.field1283 = arg1;
        Statics.field1285 = arg2;
        method1612(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bt.cr()V")
    public static void method1598() {
        field1288 = 0;
        field1286 = 0;
        field1284 = Statics.field1283;
        field1287 = Statics.field1285;
    }

    @ObfuscatedName("bt.cw(IIII)V")
    public static void method1612(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1283) {
            arg2 = Statics.field1283;
        }
        if (arg3 > Statics.field1285) {
            arg3 = Statics.field1285;
        }
        field1288 = arg0;
        field1286 = arg1;
        field1284 = arg2;
        field1287 = arg3;
    }

    @ObfuscatedName("bt.cl(IIII)V")
    public static void method1573(int arg0, int arg1, int arg2, int arg3) {
        if (field1288 < arg0) {
            field1288 = arg0;
        }
        if (field1286 < arg1) {
            field1286 = arg1;
        }
        if (field1284 > arg2) {
            field1284 = arg2;
        }
        if (field1287 > arg3) {
            field1287 = arg3;
        }
    }

    @ObfuscatedName("bt.co([I)V")
    public static void method1574(int[] arg0) {
        arg0[0] = field1288;
        arg0[1] = field1286;
        arg0[2] = field1284;
        arg0[3] = field1287;
    }

    @ObfuscatedName("bt.cn([I)V")
    public static void method1601(int[] arg0) {
        field1288 = arg0[0];
        field1286 = arg0[1];
        field1284 = arg0[2];
        field1287 = arg0[3];
    }

    @ObfuscatedName("bt.cy()V")
    public static void method1588() {
        int var0 = 0;
        int var1 = Statics.field1285 * Statics.field1283 - 7;
        while (var0 < var1) {
            Statics.field1289[var0++] = 0;
            Statics.field1289[var0++] = 0;
            Statics.field1289[var0++] = 0;
            Statics.field1289[var0++] = 0;
            Statics.field1289[var0++] = 0;
            Statics.field1289[var0++] = 0;
            Statics.field1289[var0++] = 0;
            Statics.field1289[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1289[var0++] = 0;
        }
    }

    @ObfuscatedName("bt.cc(IIIIII)V")
    public static void method1577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1288) {
            arg2 -= field1288 - arg0;
            arg0 = field1288;
        }
        if (arg1 < field1286) {
            arg3 -= field1286 - arg1;
            arg1 = field1286;
        }
        if (arg0 + arg2 > field1284) {
            arg2 = field1284 - arg0;
        }
        if (arg1 + arg3 > field1287) {
            arg3 = field1287 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1283 - arg2;
        int var9 = Statics.field1283 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1289[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1289[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bt.cs(IIIII)V")
    public static void method1575(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1288) {
            arg2 -= field1288 - arg0;
            arg0 = field1288;
        }
        if (arg1 < field1286) {
            arg3 -= field1286 - arg1;
            arg1 = field1286;
        }
        if (arg0 + arg2 > field1284) {
            arg2 = field1284 - arg0;
        }
        if (arg1 + arg3 > field1287) {
            arg3 = field1287 - arg1;
        }
        int var5 = Statics.field1283 - arg2;
        int var6 = Statics.field1283 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1289[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bt.cz(IIIIII)V")
    public static void method1579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1288) {
            arg2 -= field1288 - arg0;
            arg0 = field1288;
        }
        if (arg1 < field1286) {
            var6 += (field1286 - arg1) * var7;
            arg3 -= field1286 - arg1;
            arg1 = field1286;
        }
        if (arg0 + arg2 > field1284) {
            arg2 = field1284 - arg0;
        }
        if (arg1 + arg3 > field1287) {
            arg3 = field1287 - arg1;
        }
        int var8 = Statics.field1283 - arg2;
        int var9 = Statics.field1283 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1289[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bt.ca(IIIII)V")
    public static void method1580(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1582(arg0, arg1, arg2, arg4);
        method1582(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1584(arg0, arg1, arg3, arg4);
        method1584(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bt.dd(IIIIII)V")
    public static void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1583(arg0, arg1, arg2, arg4, arg5);
        method1583(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1585(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1585(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bt.dk(IIII)V")
    public static void method1582(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1286 || arg1 >= field1287) {
            return;
        }
        if (arg0 < field1288) {
            arg2 -= field1288 - arg0;
            arg0 = field1288;
        }
        if (arg0 + arg2 > field1284) {
            arg2 = field1284 - arg0;
        }
        int var4 = Statics.field1283 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1289[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bt.df(IIIII)V")
    public static void method1583(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1286 || arg1 >= field1287) {
            return;
        }
        if (arg0 < field1288) {
            arg2 -= field1288 - arg0;
            arg0 = field1288;
        }
        if (arg0 + arg2 > field1284) {
            arg2 = field1284 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1283 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1289[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1289[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1289[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1289[var9++] = var14;
        }
    }

    @ObfuscatedName("bt.dp(IIII)V")
    public static void method1584(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1288 || arg0 >= field1284) {
            return;
        }
        if (arg1 < field1286) {
            arg2 -= field1286 - arg1;
            arg1 = field1286;
        }
        if (arg1 + arg2 > field1287) {
            arg2 = field1287 - arg1;
        }
        int var4 = Statics.field1283 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1289[Statics.field1283 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bt.dc(IIIII)V")
    public static void method1585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1288 || arg0 >= field1284) {
            return;
        }
        if (arg1 < field1286) {
            arg2 -= field1286 - arg1;
            arg1 = field1286;
        }
        if (arg1 + arg2 > field1287) {
            arg2 = field1287 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1283 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1289[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1289[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1289[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1289[var9] = var14;
            var9 += Statics.field1283;
        }
    }

    @ObfuscatedName("bt.dw(IIIII)V")
    public static void method1571(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1582(arg0, arg1, var5 + 1, arg4);
            } else {
                method1582(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1288) {
                    var8 += (field1288 - arg0) * var10;
                    arg0 = field1288;
                }
                if (var11 >= field1284) {
                    var11 = field1284 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1286 && var12 < field1287) {
                        Statics.field1289[Statics.field1283 * var12 + arg0] = arg4;
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
                if (arg1 < field1286) {
                    var14 += (field1286 - arg1) * var16;
                    arg1 = field1286;
                }
                if (var17 >= field1287) {
                    var17 = field1287 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1288 && var18 < field1284) {
                        Statics.field1289[Statics.field1283 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1584(arg0, arg1, var6 + 1, arg4);
        } else {
            method1584(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bt.dh(III[I[I)V")
    public static void method1587(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1283 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1289[var7++] = arg2;
            }
            var5 += Statics.field1283;
        }
    }
}
