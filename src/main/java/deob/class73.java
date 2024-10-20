package deob;

@ObfuscatedName("bk")
public class class73 extends class180 {

    @ObfuscatedName("bk.m")
    public static int field1305 = 0;

    @ObfuscatedName("bk.s")
    public static int field1304 = 0;

    @ObfuscatedName("bk.t")
    public static int field1302 = 0;

    @ObfuscatedName("bk.j")
    public static int field1300 = 0;

    @ObfuscatedName("bk.ce([III)V")
    public static void method1559(int[] arg0, int arg1, int arg2) {
        Statics.field1303 = arg0;
        Statics.field1301 = arg1;
        Statics.field1306 = arg2;
        method1532(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bk.cf()V")
    public static void method1507() {
        field1302 = 0;
        field1305 = 0;
        field1300 = Statics.field1301;
        field1304 = Statics.field1306;
    }

    @ObfuscatedName("bk.ds(IIII)V")
    public static void method1532(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1301) {
            arg2 = Statics.field1301;
        }
        if (arg3 > Statics.field1306) {
            arg3 = Statics.field1306;
        }
        field1302 = arg0;
        field1305 = arg1;
        field1300 = arg2;
        field1304 = arg3;
    }

    @ObfuscatedName("bk.dd(IIII)V")
    public static void method1509(int arg0, int arg1, int arg2, int arg3) {
        if (field1302 < arg0) {
            field1302 = arg0;
        }
        if (field1305 < arg1) {
            field1305 = arg1;
        }
        if (field1300 > arg2) {
            field1300 = arg2;
        }
        if (field1304 > arg3) {
            field1304 = arg3;
        }
    }

    @ObfuscatedName("bk.do([I)V")
    public static void method1510(int[] arg0) {
        arg0[0] = field1302;
        arg0[1] = field1305;
        arg0[2] = field1300;
        arg0[3] = field1304;
    }

    @ObfuscatedName("bk.dk([I)V")
    public static void method1511(int[] arg0) {
        field1302 = arg0[0];
        field1305 = arg0[1];
        field1300 = arg0[2];
        field1304 = arg0[3];
    }

    @ObfuscatedName("bk.di()V")
    public static void method1512() {
        int var0 = 0;
        int var1 = Statics.field1306 * Statics.field1301 - 7;
        while (var0 < var1) {
            Statics.field1303[var0++] = 0;
            Statics.field1303[var0++] = 0;
            Statics.field1303[var0++] = 0;
            Statics.field1303[var0++] = 0;
            Statics.field1303[var0++] = 0;
            Statics.field1303[var0++] = 0;
            Statics.field1303[var0++] = 0;
            Statics.field1303[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1303[var0++] = 0;
        }
    }

    @ObfuscatedName("bk.dt(IIIIII)V")
    public static void method1508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1302) {
            arg2 -= field1302 - arg0;
            arg0 = field1302;
        }
        if (arg1 < field1305) {
            arg3 -= field1305 - arg1;
            arg1 = field1305;
        }
        if (arg0 + arg2 > field1300) {
            arg2 = field1300 - arg0;
        }
        if (arg1 + arg3 > field1304) {
            arg3 = field1304 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1301 - arg2;
        int var9 = Statics.field1301 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1303[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1303[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bk.da(IIIII)V")
    public static void method1514(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1302) {
            arg2 -= field1302 - arg0;
            arg0 = field1302;
        }
        if (arg1 < field1305) {
            arg3 -= field1305 - arg1;
            arg1 = field1305;
        }
        if (arg0 + arg2 > field1300) {
            arg2 = field1300 - arg0;
        }
        if (arg1 + arg3 > field1304) {
            arg3 = field1304 - arg1;
        }
        int var5 = Statics.field1301 - arg2;
        int var6 = Statics.field1301 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1303[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bk.dn(IIIIII)V")
    public static void method1515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1302) {
            arg2 -= field1302 - arg0;
            arg0 = field1302;
        }
        if (arg1 < field1305) {
            var6 += (field1305 - arg1) * var7;
            arg3 -= field1305 - arg1;
            arg1 = field1305;
        }
        if (arg0 + arg2 > field1300) {
            arg2 = field1300 - arg0;
        }
        if (arg1 + arg3 > field1304) {
            arg3 = field1304 - arg1;
        }
        int var8 = Statics.field1301 - arg2;
        int var9 = Statics.field1301 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1303[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bk.du(IIIII)V")
    public static void method1516(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1518(arg0, arg1, arg2, arg4);
        method1518(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1520(arg0, arg1, arg3, arg4);
        method1520(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bk.dv(IIIIII)V")
    public static void method1557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1541(arg0, arg1, arg2, arg4, arg5);
        method1541(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1560(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1560(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bk.dg(IIII)V")
    public static void method1518(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1305 || arg1 >= field1304) {
            return;
        }
        if (arg0 < field1302) {
            arg2 -= field1302 - arg0;
            arg0 = field1302;
        }
        if (arg0 + arg2 > field1300) {
            arg2 = field1300 - arg0;
        }
        int var4 = Statics.field1301 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1303[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bk.dq(IIIII)V")
    public static void method1541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1305 || arg1 >= field1304) {
            return;
        }
        if (arg0 < field1302) {
            arg2 -= field1302 - arg0;
            arg0 = field1302;
        }
        if (arg0 + arg2 > field1300) {
            arg2 = field1300 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1301 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1303[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1303[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1303[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1303[var9++] = var14;
        }
    }

    @ObfuscatedName("bk.df(IIII)V")
    public static void method1520(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1302 || arg0 >= field1300) {
            return;
        }
        if (arg1 < field1305) {
            arg2 -= field1305 - arg1;
            arg1 = field1305;
        }
        if (arg1 + arg2 > field1304) {
            arg2 = field1304 - arg1;
        }
        int var4 = Statics.field1301 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1303[Statics.field1301 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bk.dw(IIIII)V")
    public static void method1560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1302 || arg0 >= field1300) {
            return;
        }
        if (arg1 < field1305) {
            arg2 -= field1305 - arg1;
            arg1 = field1305;
        }
        if (arg1 + arg2 > field1304) {
            arg2 = field1304 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1301 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1303[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1303[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1303[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1303[var9] = var14;
            var9 += Statics.field1301;
        }
    }

    @ObfuscatedName("bk.dx(IIIII)V")
    public static void method1522(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1518(arg0, arg1, var5 + 1, arg4);
            } else {
                method1518(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1302) {
                    var8 += (field1302 - arg0) * var10;
                    arg0 = field1302;
                }
                if (var11 >= field1300) {
                    var11 = field1300 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1305 && var12 < field1304) {
                        Statics.field1303[Statics.field1301 * var12 + arg0] = arg4;
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
                if (arg1 < field1305) {
                    var14 += (field1305 - arg1) * var16;
                    arg1 = field1305;
                }
                if (var17 >= field1304) {
                    var17 = field1304 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1302 && var18 < field1300) {
                        Statics.field1303[Statics.field1301 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1520(arg0, arg1, var6 + 1, arg4);
        } else {
            method1520(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bk.dz(III[I[I)V")
    public static void method1536(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1301 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1303[var7++] = arg2;
            }
            var5 += Statics.field1301;
        }
    }
}
