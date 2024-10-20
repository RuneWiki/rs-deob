package deob;

@ObfuscatedName("bc")
public class class70 extends class174 {

    @ObfuscatedName("bc.v")
    public static int field1279 = 0;

    @ObfuscatedName("bc.n")
    public static int field1280 = 0;

    @ObfuscatedName("bc.l")
    public static int field1281 = 0;

    @ObfuscatedName("bc.c")
    public static int field1282 = 0;

    @ObfuscatedName("bc.cv([III)V")
    public static void method1518(int[] arg0, int arg1, int arg2) {
        Statics.field1278 = arg0;
        Statics.field1277 = arg1;
        Statics.field1276 = arg2;
        method1488(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bc.cl()V")
    public static void method1536() {
        field1281 = 0;
        field1279 = 0;
        field1282 = Statics.field1277;
        field1280 = Statics.field1276;
    }

    @ObfuscatedName("bc.cw(IIII)V")
    public static void method1488(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1277) {
            arg2 = Statics.field1277;
        }
        if (arg3 > Statics.field1276) {
            arg3 = Statics.field1276;
        }
        field1281 = arg0;
        field1279 = arg1;
        field1282 = arg2;
        field1280 = arg3;
    }

    @ObfuscatedName("bc.cx(IIII)V")
    public static void method1514(int arg0, int arg1, int arg2, int arg3) {
        if (field1281 < arg0) {
            field1281 = arg0;
        }
        if (field1279 < arg1) {
            field1279 = arg1;
        }
        if (field1282 > arg2) {
            field1282 = arg2;
        }
        if (field1280 > arg3) {
            field1280 = arg3;
        }
    }

    @ObfuscatedName("bc.ci([I)V")
    public static void method1491(int[] arg0) {
        arg0[0] = field1281;
        arg0[1] = field1279;
        arg0[2] = field1282;
        arg0[3] = field1280;
    }

    @ObfuscatedName("bc.cf([I)V")
    public static void method1492(int[] arg0) {
        field1281 = arg0[0];
        field1279 = arg0[1];
        field1282 = arg0[2];
        field1280 = arg0[3];
    }

    @ObfuscatedName("bc.cn()V")
    public static void method1493() {
        int var0 = 0;
        int var1 = Statics.field1277 * Statics.field1276 - 7;
        while (var0 < var1) {
            Statics.field1278[var0++] = 0;
            Statics.field1278[var0++] = 0;
            Statics.field1278[var0++] = 0;
            Statics.field1278[var0++] = 0;
            Statics.field1278[var0++] = 0;
            Statics.field1278[var0++] = 0;
            Statics.field1278[var0++] = 0;
            Statics.field1278[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1278[var0++] = 0;
        }
    }

    @ObfuscatedName("bc.cy(IIIIII)V")
    public static void method1494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1281) {
            arg2 -= field1281 - arg0;
            arg0 = field1281;
        }
        if (arg1 < field1279) {
            arg3 -= field1279 - arg1;
            arg1 = field1279;
        }
        if (arg0 + arg2 > field1282) {
            arg2 = field1282 - arg0;
        }
        if (arg1 + arg3 > field1280) {
            arg3 = field1280 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1277 - arg2;
        int var9 = Statics.field1277 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1278[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1278[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bc.cz(IIIII)V")
    public static void method1495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1281) {
            arg2 -= field1281 - arg0;
            arg0 = field1281;
        }
        if (arg1 < field1279) {
            arg3 -= field1279 - arg1;
            arg1 = field1279;
        }
        if (arg0 + arg2 > field1282) {
            arg2 = field1282 - arg0;
        }
        if (arg1 + arg3 > field1280) {
            arg3 = field1280 - arg1;
        }
        int var5 = Statics.field1277 - arg2;
        int var6 = Statics.field1277 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1278[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bc.cu(IIIIII)V")
    public static void method1506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1281) {
            arg2 -= field1281 - arg0;
            arg0 = field1281;
        }
        if (arg1 < field1279) {
            var6 += (field1279 - arg1) * var7;
            arg3 -= field1279 - arg1;
            arg1 = field1279;
        }
        if (arg0 + arg2 > field1282) {
            arg2 = field1282 - arg0;
        }
        if (arg1 + arg3 > field1280) {
            arg3 = field1280 - arg1;
        }
        int var8 = Statics.field1277 - arg2;
        int var9 = Statics.field1277 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1278[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bc.cb(IIIII)V")
    public static void method1549(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1501(arg0, arg1, arg2, arg4);
        method1501(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1509(arg0, arg1, arg3, arg4);
        method1509(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bc.da(IIIIII)V")
    public static void method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1500(arg0, arg1, arg2, arg4, arg5);
        method1500(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1502(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1502(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bc.di(IIII)V")
    public static void method1501(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1279 || arg1 >= field1280) {
            return;
        }
        if (arg0 < field1281) {
            arg2 -= field1281 - arg0;
            arg0 = field1281;
        }
        if (arg0 + arg2 > field1282) {
            arg2 = field1282 - arg0;
        }
        int var4 = Statics.field1277 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1278[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bc.dj(IIIII)V")
    public static void method1500(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1279 || arg1 >= field1280) {
            return;
        }
        if (arg0 < field1281) {
            arg2 -= field1281 - arg0;
            arg0 = field1281;
        }
        if (arg0 + arg2 > field1282) {
            arg2 = field1282 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1277 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1278[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1278[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1278[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1278[var9++] = var14;
        }
    }

    @ObfuscatedName("bc.db(IIII)V")
    public static void method1509(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1281 || arg0 >= field1282) {
            return;
        }
        if (arg1 < field1279) {
            arg2 -= field1279 - arg1;
            arg1 = field1279;
        }
        if (arg1 + arg2 > field1280) {
            arg2 = field1280 - arg1;
        }
        int var4 = Statics.field1277 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1278[Statics.field1277 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bc.df(IIIII)V")
    public static void method1502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1281 || arg0 >= field1282) {
            return;
        }
        if (arg1 < field1279) {
            arg2 -= field1279 - arg1;
            arg1 = field1279;
        }
        if (arg1 + arg2 > field1280) {
            arg2 = field1280 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1277 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1278[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1278[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1278[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1278[var9] = var14;
            var9 += Statics.field1277;
        }
    }

    @ObfuscatedName("bc.ds(IIIII)V")
    public static void method1503(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1501(arg0, arg1, var5 + 1, arg4);
            } else {
                method1501(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1281) {
                    var8 += (field1281 - arg0) * var10;
                    arg0 = field1281;
                }
                if (var11 >= field1282) {
                    var11 = field1282 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1279 && var12 < field1280) {
                        Statics.field1278[Statics.field1277 * var12 + arg0] = arg4;
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
                if (arg1 < field1279) {
                    var14 += (field1279 - arg1) * var16;
                    arg1 = field1279;
                }
                if (var17 >= field1280) {
                    var17 = field1280 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1281 && var18 < field1282) {
                        Statics.field1278[Statics.field1277 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1509(arg0, arg1, var6 + 1, arg4);
        } else {
            method1509(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bc.dk(III[I[I)V")
    public static void method1507(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1277 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1278[var7++] = arg2;
            }
            var5 += Statics.field1277;
        }
    }
}
