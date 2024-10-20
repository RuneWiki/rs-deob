package deob;

@ObfuscatedName("cu")
public class class89 extends class174 {

    @ObfuscatedName("cu.b")
    public static int field1464 = 0;

    @ObfuscatedName("cu.t")
    public static int field1461 = 0;

    @ObfuscatedName("cu.r")
    public static int field1466 = 0;

    @ObfuscatedName("cu.g")
    public static int field1465 = 0;

    @ObfuscatedName("cu.ch([III)V")
    public static void method1729(int[] arg0, int arg1, int arg2) {
        Statics.field1467 = arg0;
        Statics.field1462 = arg1;
        Statics.field1463 = arg2;
        method1731(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cu.ct()V")
    public static void method1730() {
        field1466 = 0;
        field1464 = 0;
        field1465 = Statics.field1462;
        field1461 = Statics.field1463;
    }

    @ObfuscatedName("cu.cz(IIII)V")
    public static void method1731(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1462) {
            arg2 = Statics.field1462;
        }
        if (arg3 > Statics.field1463) {
            arg3 = Statics.field1463;
        }
        field1466 = arg0;
        field1464 = arg1;
        field1465 = arg2;
        field1461 = arg3;
    }

    @ObfuscatedName("cu.cd(IIII)V")
    public static void method1732(int arg0, int arg1, int arg2, int arg3) {
        if (field1466 < arg0) {
            field1466 = arg0;
        }
        if (field1464 < arg1) {
            field1464 = arg1;
        }
        if (field1465 > arg2) {
            field1465 = arg2;
        }
        if (field1461 > arg3) {
            field1461 = arg3;
        }
    }

    @ObfuscatedName("cu.cf([I)V")
    public static void method1771(int[] arg0) {
        arg0[0] = field1466;
        arg0[1] = field1464;
        arg0[2] = field1465;
        arg0[3] = field1461;
    }

    @ObfuscatedName("cu.cv([I)V")
    public static void method1734(int[] arg0) {
        field1466 = arg0[0];
        field1464 = arg0[1];
        field1465 = arg0[2];
        field1461 = arg0[3];
    }

    @ObfuscatedName("cu.cx()V")
    public static void method1735() {
        int var0 = 0;
        int var1 = Statics.field1463 * Statics.field1462 - 7;
        while (var0 < var1) {
            Statics.field1467[var0++] = 0;
            Statics.field1467[var0++] = 0;
            Statics.field1467[var0++] = 0;
            Statics.field1467[var0++] = 0;
            Statics.field1467[var0++] = 0;
            Statics.field1467[var0++] = 0;
            Statics.field1467[var0++] = 0;
            Statics.field1467[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1467[var0++] = 0;
        }
    }

    @ObfuscatedName("cu.cw(IIIIII)V")
    public static void method1796(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1466) {
            arg2 -= field1466 - arg0;
            arg0 = field1466;
        }
        if (arg1 < field1464) {
            arg3 -= field1464 - arg1;
            arg1 = field1464;
        }
        if (arg0 + arg2 > field1465) {
            arg2 = field1465 - arg0;
        }
        if (arg1 + arg3 > field1461) {
            arg3 = field1461 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1462 - arg2;
        int var9 = Statics.field1462 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1467[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1467[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cu.cy(IIIII)V")
    public static void method1767(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1466) {
            arg2 -= field1466 - arg0;
            arg0 = field1466;
        }
        if (arg1 < field1464) {
            arg3 -= field1464 - arg1;
            arg1 = field1464;
        }
        if (arg0 + arg2 > field1465) {
            arg2 = field1465 - arg0;
        }
        if (arg1 + arg3 > field1461) {
            arg3 = field1461 - arg1;
        }
        int var5 = Statics.field1462 - arg2;
        int var6 = Statics.field1462 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1467[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cu.ce(IIIIII)V")
    public static void method1738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1466) {
            arg2 -= field1466 - arg0;
            arg0 = field1466;
        }
        if (arg1 < field1464) {
            var6 += (field1464 - arg1) * var7;
            arg3 -= field1464 - arg1;
            arg1 = field1464;
        }
        if (arg0 + arg2 > field1465) {
            arg2 = field1465 - arg0;
        }
        if (arg1 + arg3 > field1461) {
            arg3 = field1461 - arg1;
        }
        int var8 = Statics.field1462 - arg2;
        int var9 = Statics.field1462 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1467[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cu.cl(IIIII)V")
    public static void method1739(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1741(arg0, arg1, arg2, arg4);
        method1741(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1743(arg0, arg1, arg3, arg4);
        method1743(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cu.ca(IIIIII)V")
    public static void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1753(arg0, arg1, arg2, arg4, arg5);
        method1753(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1744(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1744(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cu.dk(IIII)V")
    public static void method1741(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1464 || arg1 >= field1461) {
            return;
        }
        if (arg0 < field1466) {
            arg2 -= field1466 - arg0;
            arg0 = field1466;
        }
        if (arg0 + arg2 > field1465) {
            arg2 = field1465 - arg0;
        }
        int var4 = Statics.field1462 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1467[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cu.dx(IIIII)V")
    public static void method1753(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1464 || arg1 >= field1461) {
            return;
        }
        if (arg0 < field1466) {
            arg2 -= field1466 - arg0;
            arg0 = field1466;
        }
        if (arg0 + arg2 > field1465) {
            arg2 = field1465 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1462 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1467[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1467[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1467[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1467[var9++] = var14;
        }
    }

    @ObfuscatedName("cu.db(IIII)V")
    public static void method1743(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1466 || arg0 >= field1465) {
            return;
        }
        if (arg1 < field1464) {
            arg2 -= field1464 - arg1;
            arg1 = field1464;
        }
        if (arg1 + arg2 > field1461) {
            arg2 = field1461 - arg1;
        }
        int var4 = Statics.field1462 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1467[Statics.field1462 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cu.dd(IIIII)V")
    public static void method1744(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1466 || arg0 >= field1465) {
            return;
        }
        if (arg1 < field1464) {
            arg2 -= field1464 - arg1;
            arg1 = field1464;
        }
        if (arg1 + arg2 > field1461) {
            arg2 = field1461 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1462 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1467[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1467[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1467[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1467[var9] = var14;
            var9 += Statics.field1462;
        }
    }

    @ObfuscatedName("cu.dv(IIIII)V")
    public static void method1745(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1741(arg0, arg1, var5 + 1, arg4);
            } else {
                method1741(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1466) {
                    var8 += (field1466 - arg0) * var10;
                    arg0 = field1466;
                }
                if (var11 >= field1465) {
                    var11 = field1465 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1464 && var12 < field1461) {
                        Statics.field1467[Statics.field1462 * var12 + arg0] = arg4;
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
                if (arg1 < field1464) {
                    var14 += (field1464 - arg1) * var16;
                    arg1 = field1464;
                }
                if (var17 >= field1461) {
                    var17 = field1461 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1466 && var18 < field1465) {
                        Statics.field1467[Statics.field1462 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1743(arg0, arg1, var6 + 1, arg4);
        } else {
            method1743(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cu.dn(III[I[I)V")
    public static void method1742(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1462 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1467[var7++] = arg2;
            }
            var5 += Statics.field1462;
        }
    }
}
