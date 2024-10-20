package deob;

@ObfuscatedName("bh")
public class class73 extends class182 {

    @ObfuscatedName("bh.q")
    public static int field1301 = 0;

    @ObfuscatedName("bh.x")
    public static int field1303 = 0;

    @ObfuscatedName("bh.p")
    public static int field1304 = 0;

    @ObfuscatedName("bh.y")
    public static int field1305 = 0;

    @ObfuscatedName("bh.cs([III)V")
    public static void method1489(int[] arg0, int arg1, int arg2) {
        Statics.field1299 = arg0;
        Statics.field1300 = arg1;
        Statics.field1302 = arg2;
        method1531(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bh.ca()V")
    public static void method1490() {
        field1304 = 0;
        field1301 = 0;
        field1305 = Statics.field1300;
        field1303 = Statics.field1302;
    }

    @ObfuscatedName("bh.cw(IIII)V")
    public static void method1531(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1300) {
            arg2 = Statics.field1300;
        }
        if (arg3 > Statics.field1302) {
            arg3 = Statics.field1302;
        }
        field1304 = arg0;
        field1301 = arg1;
        field1305 = arg2;
        field1303 = arg3;
    }

    @ObfuscatedName("bh.ct(IIII)V")
    public static void method1539(int arg0, int arg1, int arg2, int arg3) {
        if (field1304 < arg0) {
            field1304 = arg0;
        }
        if (field1301 < arg1) {
            field1301 = arg1;
        }
        if (field1305 > arg2) {
            field1305 = arg2;
        }
        if (field1303 > arg3) {
            field1303 = arg3;
        }
    }

    @ObfuscatedName("bh.cf([I)V")
    public static void method1493(int[] arg0) {
        arg0[0] = field1304;
        arg0[1] = field1301;
        arg0[2] = field1305;
        arg0[3] = field1303;
    }

    @ObfuscatedName("bh.cg([I)V")
    public static void method1500(int[] arg0) {
        field1304 = arg0[0];
        field1301 = arg0[1];
        field1305 = arg0[2];
        field1303 = arg0[3];
    }

    @ObfuscatedName("bh.cc()V")
    public static void method1504() {
        int var0 = 0;
        int var1 = Statics.field1302 * Statics.field1300 - 7;
        while (var0 < var1) {
            Statics.field1299[var0++] = 0;
            Statics.field1299[var0++] = 0;
            Statics.field1299[var0++] = 0;
            Statics.field1299[var0++] = 0;
            Statics.field1299[var0++] = 0;
            Statics.field1299[var0++] = 0;
            Statics.field1299[var0++] = 0;
            Statics.field1299[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1299[var0++] = 0;
        }
    }

    @ObfuscatedName("bh.cd(IIIIII)V")
    public static void method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1304) {
            arg2 -= field1304 - arg0;
            arg0 = field1304;
        }
        if (arg1 < field1301) {
            arg3 -= field1301 - arg1;
            arg1 = field1301;
        }
        if (arg0 + arg2 > field1305) {
            arg2 = field1305 - arg0;
        }
        if (arg1 + arg3 > field1303) {
            arg3 = field1303 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1300 - arg2;
        int var9 = Statics.field1300 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1299[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1299[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bh.cy(IIIII)V")
    public static void method1497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1304) {
            arg2 -= field1304 - arg0;
            arg0 = field1304;
        }
        if (arg1 < field1301) {
            arg3 -= field1301 - arg1;
            arg1 = field1301;
        }
        if (arg0 + arg2 > field1305) {
            arg2 = field1305 - arg0;
        }
        if (arg1 + arg3 > field1303) {
            arg3 = field1303 - arg1;
        }
        int var5 = Statics.field1300 - arg2;
        int var6 = Statics.field1300 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1299[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bh.ce(IIIIII)V")
    public static void method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1304) {
            arg2 -= field1304 - arg0;
            arg0 = field1304;
        }
        if (arg1 < field1301) {
            var6 += (field1301 - arg1) * var7;
            arg3 -= field1301 - arg1;
            arg1 = field1301;
        }
        if (arg0 + arg2 > field1305) {
            arg2 = field1305 - arg0;
        }
        if (arg1 + arg3 > field1303) {
            arg3 = field1303 - arg1;
        }
        int var8 = Statics.field1300 - arg2;
        int var9 = Statics.field1300 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1299[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bh.ch(IIIII)V")
    public static void method1526(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1501(arg0, arg1, arg2, arg4);
        method1501(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1505(arg0, arg1, arg3, arg4);
        method1505(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bh.ck(IIIIII)V")
    public static void method1537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1502(arg0, arg1, arg2, arg4, arg5);
        method1502(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1542(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1542(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bh.cu(IIII)V")
    public static void method1501(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1301 || arg1 >= field1303) {
            return;
        }
        if (arg0 < field1304) {
            arg2 -= field1304 - arg0;
            arg0 = field1304;
        }
        if (arg0 + arg2 > field1305) {
            arg2 = field1305 - arg0;
        }
        int var4 = Statics.field1300 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1299[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bh.dd(IIIII)V")
    public static void method1502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1301 || arg1 >= field1303) {
            return;
        }
        if (arg0 < field1304) {
            arg2 -= field1304 - arg0;
            arg0 = field1304;
        }
        if (arg0 + arg2 > field1305) {
            arg2 = field1305 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1300 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1299[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1299[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1299[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1299[var9++] = var14;
        }
    }

    @ObfuscatedName("bh.dn(IIII)V")
    public static void method1505(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1304 || arg0 >= field1305) {
            return;
        }
        if (arg1 < field1301) {
            arg2 -= field1301 - arg1;
            arg1 = field1301;
        }
        if (arg1 + arg2 > field1303) {
            arg2 = field1303 - arg1;
        }
        int var4 = Statics.field1300 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1299[Statics.field1300 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bh.db(IIIII)V")
    public static void method1542(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1304 || arg0 >= field1305) {
            return;
        }
        if (arg1 < field1301) {
            arg2 -= field1301 - arg1;
            arg1 = field1301;
        }
        if (arg1 + arg2 > field1303) {
            arg2 = field1303 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1300 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1299[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1299[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1299[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1299[var9] = var14;
            var9 += Statics.field1300;
        }
    }

    @ObfuscatedName("bh.dj(IIIII)V")
    public static void method1521(int arg0, int arg1, int arg2, int arg3, int arg4) {
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
                if (arg0 < field1304) {
                    var8 += (field1304 - arg0) * var10;
                    arg0 = field1304;
                }
                if (var11 >= field1305) {
                    var11 = field1305 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1301 && var12 < field1303) {
                        Statics.field1299[Statics.field1300 * var12 + arg0] = arg4;
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
                if (arg1 < field1301) {
                    var14 += (field1301 - arg1) * var16;
                    arg1 = field1301;
                }
                if (var17 >= field1303) {
                    var17 = field1303 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1304 && var18 < field1305) {
                        Statics.field1299[Statics.field1300 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1505(arg0, arg1, var6 + 1, arg4);
        } else {
            method1505(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bh.da(III[I[I)V")
    public static void method1530(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1300 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1299[var7++] = arg2;
            }
            var5 += Statics.field1300;
        }
    }
}
