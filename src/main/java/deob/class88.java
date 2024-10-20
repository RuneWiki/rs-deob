package deob;

@ObfuscatedName("cn")
public class class88 extends class172 {

    @ObfuscatedName("cn.q")
    public static int field1462 = 0;

    @ObfuscatedName("cn.l")
    public static int field1460 = 0;

    @ObfuscatedName("cn.t")
    public static int field1459 = 0;

    @ObfuscatedName("cn.g")
    public static int field1463 = 0;

    @ObfuscatedName("cn.cq([III)V")
    public static void method1710(int[] arg0, int arg1, int arg2) {
        Statics.field1465 = arg0;
        Statics.field1464 = arg1;
        Statics.field1461 = arg2;
        method1693(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cn.cb()V")
    public static void method1692() {
        field1459 = 0;
        field1462 = 0;
        field1463 = Statics.field1464;
        field1460 = Statics.field1461;
    }

    @ObfuscatedName("cn.cn(IIII)V")
    public static void method1693(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1464) {
            arg2 = Statics.field1464;
        }
        if (arg3 > Statics.field1461) {
            arg3 = Statics.field1461;
        }
        field1459 = arg0;
        field1462 = arg1;
        field1463 = arg2;
        field1460 = arg3;
    }

    @ObfuscatedName("cn.cp(IIII)V")
    public static void method1694(int arg0, int arg1, int arg2, int arg3) {
        if (field1459 < arg0) {
            field1459 = arg0;
        }
        if (field1462 < arg1) {
            field1462 = arg1;
        }
        if (field1463 > arg2) {
            field1463 = arg2;
        }
        if (field1460 > arg3) {
            field1460 = arg3;
        }
    }

    @ObfuscatedName("cn.ct([I)V")
    public static void method1695(int[] arg0) {
        arg0[0] = field1459;
        arg0[1] = field1462;
        arg0[2] = field1463;
        arg0[3] = field1460;
    }

    @ObfuscatedName("cn.ce([I)V")
    public static void method1696(int[] arg0) {
        field1459 = arg0[0];
        field1462 = arg0[1];
        field1463 = arg0[2];
        field1460 = arg0[3];
    }

    @ObfuscatedName("cn.cm()V")
    public static void method1697() {
        int var0 = 0;
        int var1 = Statics.field1464 * Statics.field1461 - 7;
        while (var0 < var1) {
            Statics.field1465[var0++] = 0;
            Statics.field1465[var0++] = 0;
            Statics.field1465[var0++] = 0;
            Statics.field1465[var0++] = 0;
            Statics.field1465[var0++] = 0;
            Statics.field1465[var0++] = 0;
            Statics.field1465[var0++] = 0;
            Statics.field1465[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1465[var0++] = 0;
        }
    }

    @ObfuscatedName("cn.ca(IIIIII)V")
    public static void method1727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1459) {
            arg2 -= field1459 - arg0;
            arg0 = field1459;
        }
        if (arg1 < field1462) {
            arg3 -= field1462 - arg1;
            arg1 = field1462;
        }
        if (arg0 + arg2 > field1463) {
            arg2 = field1463 - arg0;
        }
        if (arg1 + arg3 > field1460) {
            arg3 = field1460 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1464 - arg2;
        int var9 = Statics.field1464 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1465[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1465[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cn.cg(IIIII)V")
    public static void method1699(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1459) {
            arg2 -= field1459 - arg0;
            arg0 = field1459;
        }
        if (arg1 < field1462) {
            arg3 -= field1462 - arg1;
            arg1 = field1462;
        }
        if (arg0 + arg2 > field1463) {
            arg2 = field1463 - arg0;
        }
        if (arg1 + arg3 > field1460) {
            arg3 = field1460 - arg1;
        }
        int var5 = Statics.field1464 - arg2;
        int var6 = Statics.field1464 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1465[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cn.ch(IIIIII)V")
    public static void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1459) {
            arg2 -= field1459 - arg0;
            arg0 = field1459;
        }
        if (arg1 < field1462) {
            var6 += (field1462 - arg1) * var7;
            arg3 -= field1462 - arg1;
            arg1 = field1462;
        }
        if (arg0 + arg2 > field1463) {
            arg2 = field1463 - arg0;
        }
        if (arg1 + arg3 > field1460) {
            arg3 = field1460 - arg1;
        }
        int var8 = Statics.field1464 - arg2;
        int var9 = Statics.field1464 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1465[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cn.cj(IIIII)V")
    public static void method1701(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1703(arg0, arg1, arg2, arg4);
        method1703(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1722(arg0, arg1, arg3, arg4);
        method1722(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cn.cw(IIIIII)V")
    public static void method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1728(arg0, arg1, arg2, arg4, arg5);
        method1728(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1706(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1706(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cn.cx(IIII)V")
    public static void method1703(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1462 || arg1 >= field1460) {
            return;
        }
        if (arg0 < field1459) {
            arg2 -= field1459 - arg0;
            arg0 = field1459;
        }
        if (arg0 + arg2 > field1463) {
            arg2 = field1463 - arg0;
        }
        int var4 = Statics.field1464 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1465[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cn.co(IIIII)V")
    public static void method1728(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1462 || arg1 >= field1460) {
            return;
        }
        if (arg0 < field1459) {
            arg2 -= field1459 - arg0;
            arg0 = field1459;
        }
        if (arg0 + arg2 > field1463) {
            arg2 = field1463 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1464 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1465[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1465[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1465[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1465[var9++] = var14;
        }
    }

    @ObfuscatedName("cn.cl(IIII)V")
    public static void method1722(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1459 || arg0 >= field1463) {
            return;
        }
        if (arg1 < field1462) {
            arg2 -= field1462 - arg1;
            arg1 = field1462;
        }
        if (arg1 + arg2 > field1460) {
            arg2 = field1460 - arg1;
        }
        int var4 = Statics.field1464 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1465[Statics.field1464 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cn.ck(IIIII)V")
    public static void method1706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1459 || arg0 >= field1463) {
            return;
        }
        if (arg1 < field1462) {
            arg2 -= field1462 - arg1;
            arg1 = field1462;
        }
        if (arg1 + arg2 > field1460) {
            arg2 = field1460 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1464 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1465[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1465[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1465[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1465[var9] = var14;
            var9 += Statics.field1464;
        }
    }

    @ObfuscatedName("cn.cf(IIIII)V")
    public static void method1707(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1703(arg0, arg1, var5 + 1, arg4);
            } else {
                method1703(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1459) {
                    var8 += (field1459 - arg0) * var10;
                    arg0 = field1459;
                }
                if (var11 >= field1463) {
                    var11 = field1463 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1462 && var12 < field1460) {
                        Statics.field1465[Statics.field1464 * var12 + arg0] = arg4;
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
                if (arg1 < field1462) {
                    var14 += (field1462 - arg1) * var16;
                    arg1 = field1462;
                }
                if (var17 >= field1460) {
                    var17 = field1460 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1459 && var18 < field1463) {
                        Statics.field1465[Statics.field1464 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1722(arg0, arg1, var6 + 1, arg4);
        } else {
            method1722(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cn.cc(III[I[I)V")
    public static void method1708(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1464 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1465[var7++] = arg2;
            }
            var5 += Statics.field1464;
        }
    }
}
