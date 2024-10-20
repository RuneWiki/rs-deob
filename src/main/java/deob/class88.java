package deob;

@ObfuscatedName("ck")
public class class88 extends class173 {

    @ObfuscatedName("ck.d")
    public static int field1463 = 0;

    @ObfuscatedName("ck.h")
    public static int field1465 = 0;

    @ObfuscatedName("ck.i")
    public static int field1468 = 0;

    @ObfuscatedName("ck.v")
    public static int field1469 = 0;

    @ObfuscatedName("ck.cm([III)V")
    public static void method1796(int[] arg0, int arg1, int arg2) {
        Statics.field1466 = arg0;
        Statics.field1464 = arg1;
        Statics.field1467 = arg2;
        method1791(0, 0, arg1, arg2);
    }

    @ObfuscatedName("ck.cz()V")
    public static void method1790() {
        field1468 = 0;
        field1463 = 0;
        field1469 = Statics.field1464;
        field1465 = Statics.field1467;
    }

    @ObfuscatedName("ck.cu(IIII)V")
    public static void method1791(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1464) {
            arg2 = Statics.field1464;
        }
        if (arg3 > Statics.field1467) {
            arg3 = Statics.field1467;
        }
        field1468 = arg0;
        field1463 = arg1;
        field1469 = arg2;
        field1465 = arg3;
    }

    @ObfuscatedName("ck.cl(IIII)V")
    public static void method1792(int arg0, int arg1, int arg2, int arg3) {
        if (field1468 < arg0) {
            field1468 = arg0;
        }
        if (field1463 < arg1) {
            field1463 = arg1;
        }
        if (field1469 > arg2) {
            field1469 = arg2;
        }
        if (field1465 > arg3) {
            field1465 = arg3;
        }
    }

    @ObfuscatedName("ck.dq([I)V")
    public static void method1793(int[] arg0) {
        arg0[0] = field1468;
        arg0[1] = field1463;
        arg0[2] = field1469;
        arg0[3] = field1465;
    }

    @ObfuscatedName("ck.dt([I)V")
    public static void method1794(int[] arg0) {
        field1468 = arg0[0];
        field1463 = arg0[1];
        field1469 = arg0[2];
        field1465 = arg0[3];
    }

    @ObfuscatedName("ck.da()V")
    public static void method1788() {
        int var0 = 0;
        int var1 = Statics.field1467 * Statics.field1464 - 7;
        while (var0 < var1) {
            Statics.field1466[var0++] = 0;
            Statics.field1466[var0++] = 0;
            Statics.field1466[var0++] = 0;
            Statics.field1466[var0++] = 0;
            Statics.field1466[var0++] = 0;
            Statics.field1466[var0++] = 0;
            Statics.field1466[var0++] = 0;
            Statics.field1466[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1466[var0++] = 0;
        }
    }

    @ObfuscatedName("ck.dw(IIIIII)V")
    public static void method1801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1468) {
            arg2 -= field1468 - arg0;
            arg0 = field1468;
        }
        if (arg1 < field1463) {
            arg3 -= field1463 - arg1;
            arg1 = field1463;
        }
        if (arg0 + arg2 > field1469) {
            arg2 = field1469 - arg0;
        }
        if (arg1 + arg3 > field1465) {
            arg3 = field1465 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1464 - arg2;
        int var9 = Statics.field1464 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1466[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1466[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("ck.dx(IIIII)V")
    public static void method1797(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1468) {
            arg2 -= field1468 - arg0;
            arg0 = field1468;
        }
        if (arg1 < field1463) {
            arg3 -= field1463 - arg1;
            arg1 = field1463;
        }
        if (arg0 + arg2 > field1469) {
            arg2 = field1469 - arg0;
        }
        if (arg1 + arg3 > field1465) {
            arg3 = field1465 - arg1;
        }
        int var5 = Statics.field1464 - arg2;
        int var6 = Statics.field1464 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1466[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("ck.dr(IIIIII)V")
    public static void method1814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1468) {
            arg2 -= field1468 - arg0;
            arg0 = field1468;
        }
        if (arg1 < field1463) {
            var6 += (field1463 - arg1) * var7;
            arg3 -= field1463 - arg1;
            arg1 = field1463;
        }
        if (arg0 + arg2 > field1469) {
            arg2 = field1469 - arg0;
        }
        if (arg1 + arg3 > field1465) {
            arg3 = field1465 - arg1;
        }
        int var8 = Statics.field1464 - arg2;
        int var9 = Statics.field1464 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1466[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("ck.dd(IIIII)V")
    public static void method1807(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1834(arg0, arg1, arg2, arg4);
        method1834(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1789(arg0, arg1, arg3, arg4);
        method1789(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("ck.du(IIIIII)V")
    public static void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1802(arg0, arg1, arg2, arg4, arg5);
        method1802(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1804(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1804(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("ck.dg(IIII)V")
    public static void method1834(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1463 || arg1 >= field1465) {
            return;
        }
        if (arg0 < field1468) {
            arg2 -= field1468 - arg0;
            arg0 = field1468;
        }
        if (arg0 + arg2 > field1469) {
            arg2 = field1469 - arg0;
        }
        int var4 = Statics.field1464 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1466[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("ck.do(IIIII)V")
    public static void method1802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1463 || arg1 >= field1465) {
            return;
        }
        if (arg0 < field1468) {
            arg2 -= field1468 - arg0;
            arg0 = field1468;
        }
        if (arg0 + arg2 > field1469) {
            arg2 = field1469 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1464 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1466[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1466[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1466[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1466[var9++] = var14;
        }
    }

    @ObfuscatedName("ck.dm(IIII)V")
    public static void method1789(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1468 || arg0 >= field1469) {
            return;
        }
        if (arg1 < field1463) {
            arg2 -= field1463 - arg1;
            arg1 = field1463;
        }
        if (arg1 + arg2 > field1465) {
            arg2 = field1465 - arg1;
        }
        int var4 = Statics.field1464 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1466[Statics.field1464 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("ck.dj(IIIII)V")
    public static void method1804(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1468 || arg0 >= field1469) {
            return;
        }
        if (arg1 < field1463) {
            arg2 -= field1463 - arg1;
            arg1 = field1463;
        }
        if (arg1 + arg2 > field1465) {
            arg2 = field1465 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1464 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1466[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1466[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1466[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1466[var9] = var14;
            var9 += Statics.field1464;
        }
    }

    @ObfuscatedName("ck.dz(IIIII)V")
    public static void method1813(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1834(arg0, arg1, var5 + 1, arg4);
            } else {
                method1834(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1468) {
                    var8 += (field1468 - arg0) * var10;
                    arg0 = field1468;
                }
                if (var11 >= field1469) {
                    var11 = field1469 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1463 && var12 < field1465) {
                        Statics.field1466[Statics.field1464 * var12 + arg0] = arg4;
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
                if (arg1 < field1463) {
                    var14 += (field1463 - arg1) * var16;
                    arg1 = field1463;
                }
                if (var17 >= field1465) {
                    var17 = field1465 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1468 && var18 < field1469) {
                        Statics.field1466[Statics.field1464 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1789(arg0, arg1, var6 + 1, arg4);
        } else {
            method1789(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("ck.ds(III[I[I)V")
    public static void method1806(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1464 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1466[var7++] = arg2;
            }
            var5 += Statics.field1464;
        }
    }
}
