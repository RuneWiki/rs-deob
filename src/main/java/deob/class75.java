package deob;

@ObfuscatedName("be")
public class class75 extends class195 {

    @ObfuscatedName("be.n")
    public static int field1339 = 0;

    @ObfuscatedName("be.x")
    public static int field1336 = 0;

    @ObfuscatedName("be.h")
    public static int field1340 = 0;

    @ObfuscatedName("be.t")
    public static int field1342 = 0;

    @ObfuscatedName("be.cb([III)V")
    public static void method1584(int[] arg0, int arg1, int arg2) {
        Statics.field1341 = arg0;
        Statics.field1337 = arg1;
        Statics.field1338 = arg2;
        method1586(0, 0, arg1, arg2);
    }

    @ObfuscatedName("be.cs()V")
    public static void method1601() {
        field1340 = 0;
        field1339 = 0;
        field1342 = Statics.field1337;
        field1336 = Statics.field1338;
    }

    @ObfuscatedName("be.cv(IIII)V")
    public static void method1586(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1337) {
            arg2 = Statics.field1337;
        }
        if (arg3 > Statics.field1338) {
            arg3 = Statics.field1338;
        }
        field1340 = arg0;
        field1339 = arg1;
        field1342 = arg2;
        field1336 = arg3;
    }

    @ObfuscatedName("be.cu(IIII)V")
    public static void method1617(int arg0, int arg1, int arg2, int arg3) {
        if (field1340 < arg0) {
            field1340 = arg0;
        }
        if (field1339 < arg1) {
            field1339 = arg1;
        }
        if (field1342 > arg2) {
            field1342 = arg2;
        }
        if (field1336 > arg3) {
            field1336 = arg3;
        }
    }

    @ObfuscatedName("be.dl([I)V")
    public static void method1588(int[] arg0) {
        arg0[0] = field1340;
        arg0[1] = field1339;
        arg0[2] = field1342;
        arg0[3] = field1336;
    }

    @ObfuscatedName("be.dp([I)V")
    public static void method1589(int[] arg0) {
        field1340 = arg0[0];
        field1339 = arg0[1];
        field1342 = arg0[2];
        field1336 = arg0[3];
    }

    @ObfuscatedName("be.dm()V")
    public static void method1590() {
        int var0 = 0;
        int var1 = Statics.field1338 * Statics.field1337 - 7;
        while (var0 < var1) {
            Statics.field1341[var0++] = 0;
            Statics.field1341[var0++] = 0;
            Statics.field1341[var0++] = 0;
            Statics.field1341[var0++] = 0;
            Statics.field1341[var0++] = 0;
            Statics.field1341[var0++] = 0;
            Statics.field1341[var0++] = 0;
            Statics.field1341[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1341[var0++] = 0;
        }
    }

    @ObfuscatedName("be.do(IIIIII)V")
    public static void method1591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1340) {
            arg2 -= field1340 - arg0;
            arg0 = field1340;
        }
        if (arg1 < field1339) {
            arg3 -= field1339 - arg1;
            arg1 = field1339;
        }
        if (arg0 + arg2 > field1342) {
            arg2 = field1342 - arg0;
        }
        if (arg1 + arg3 > field1336) {
            arg3 = field1336 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1337 - arg2;
        int var9 = Statics.field1337 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1341[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1341[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("be.ds(IIIII)V")
    public static void method1592(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1340) {
            arg2 -= field1340 - arg0;
            arg0 = field1340;
        }
        if (arg1 < field1339) {
            arg3 -= field1339 - arg1;
            arg1 = field1339;
        }
        if (arg0 + arg2 > field1342) {
            arg2 = field1342 - arg0;
        }
        if (arg1 + arg3 > field1336) {
            arg3 = field1336 - arg1;
        }
        int var5 = Statics.field1337 - arg2;
        int var6 = Statics.field1337 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1341[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("be.db(IIIIII)V")
    public static void method1593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1340) {
            arg2 -= field1340 - arg0;
            arg0 = field1340;
        }
        if (arg1 < field1339) {
            var6 += (field1339 - arg1) * var7;
            arg3 -= field1339 - arg1;
            arg1 = field1339;
        }
        if (arg0 + arg2 > field1342) {
            arg2 = field1342 - arg0;
        }
        if (arg1 + arg3 > field1336) {
            arg3 = field1336 - arg1;
        }
        int var8 = Statics.field1337 - arg2;
        int var9 = Statics.field1337 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1341[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("be.dk(IIIII)V")
    public static void method1640(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1596(arg0, arg1, arg2, arg4);
        method1596(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1594(arg0, arg1, arg3, arg4);
        method1594(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("be.di(IIIIII)V")
    public static void method1610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1597(arg0, arg1, arg2, arg4, arg5);
        method1597(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1633(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1633(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("be.dq(IIII)V")
    public static void method1596(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1339 || arg1 >= field1336) {
            return;
        }
        if (arg0 < field1340) {
            arg2 -= field1340 - arg0;
            arg0 = field1340;
        }
        if (arg0 + arg2 > field1342) {
            arg2 = field1342 - arg0;
        }
        int var4 = Statics.field1337 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1341[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("be.da(IIIII)V")
    public static void method1597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1339 || arg1 >= field1336) {
            return;
        }
        if (arg0 < field1340) {
            arg2 -= field1340 - arg0;
            arg0 = field1340;
        }
        if (arg0 + arg2 > field1342) {
            arg2 = field1342 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1337 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1341[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1341[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1341[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1341[var9++] = var14;
        }
    }

    @ObfuscatedName("be.dz(IIII)V")
    public static void method1594(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1340 || arg0 >= field1342) {
            return;
        }
        if (arg1 < field1339) {
            arg2 -= field1339 - arg1;
            arg1 = field1339;
        }
        if (arg1 + arg2 > field1336) {
            arg2 = field1336 - arg1;
        }
        int var4 = Statics.field1337 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1341[Statics.field1337 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("be.dr(IIIII)V")
    public static void method1633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1340 || arg0 >= field1342) {
            return;
        }
        if (arg1 < field1339) {
            arg2 -= field1339 - arg1;
            arg1 = field1339;
        }
        if (arg1 + arg2 > field1336) {
            arg2 = field1336 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1337 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1341[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1341[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1341[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1341[var9] = var14;
            var9 += Statics.field1337;
        }
    }

    @ObfuscatedName("be.df(IIIII)V")
    public static void method1638(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1596(arg0, arg1, var5 + 1, arg4);
            } else {
                method1596(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1340) {
                    var8 += (field1340 - arg0) * var10;
                    arg0 = field1340;
                }
                if (var11 >= field1342) {
                    var11 = field1342 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1339 && var12 < field1336) {
                        Statics.field1341[Statics.field1337 * var12 + arg0] = arg4;
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
                if (arg1 < field1339) {
                    var14 += (field1339 - arg1) * var16;
                    arg1 = field1339;
                }
                if (var17 >= field1336) {
                    var17 = field1336 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1340 && var18 < field1342) {
                        Statics.field1341[Statics.field1337 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1594(arg0, arg1, var6 + 1, arg4);
        } else {
            method1594(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("be.dx(III[I[I)V")
    public static void method1587(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1337 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1341[var7++] = arg2;
            }
            var5 += Statics.field1337;
        }
    }
}
