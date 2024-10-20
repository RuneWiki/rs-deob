package deob;

@ObfuscatedName("cp")
public class class89 extends class174 {

    @ObfuscatedName("cp.r")
    public static int field1482 = 0;

    @ObfuscatedName("cp.h")
    public static int field1483 = 0;

    @ObfuscatedName("cp.v")
    public static int field1484 = 0;

    @ObfuscatedName("cp.u")
    public static int field1480 = 0;

    @ObfuscatedName("cp.cx([III)V")
    public static void method1739(int[] arg0, int arg1, int arg2) {
        Statics.field1485 = arg0;
        Statics.field1481 = arg1;
        Statics.field1479 = arg2;
        method1741(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cp.cd()V")
    public static void method1740() {
        field1484 = 0;
        field1482 = 0;
        field1480 = Statics.field1481;
        field1483 = Statics.field1479;
    }

    @ObfuscatedName("cp.cm(IIII)V")
    public static void method1741(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1481) {
            arg2 = Statics.field1481;
        }
        if (arg3 > Statics.field1479) {
            arg3 = Statics.field1479;
        }
        field1484 = arg0;
        field1482 = arg1;
        field1480 = arg2;
        field1483 = arg3;
    }

    @ObfuscatedName("cp.cc(IIII)V")
    public static void method1790(int arg0, int arg1, int arg2, int arg3) {
        if (field1484 < arg0) {
            field1484 = arg0;
        }
        if (field1482 < arg1) {
            field1482 = arg1;
        }
        if (field1480 > arg2) {
            field1480 = arg2;
        }
        if (field1483 > arg3) {
            field1483 = arg3;
        }
    }

    @ObfuscatedName("cp.cg([I)V")
    public static void method1742(int[] arg0) {
        arg0[0] = field1484;
        arg0[1] = field1482;
        arg0[2] = field1480;
        arg0[3] = field1483;
    }

    @ObfuscatedName("cp.cq([I)V")
    public static void method1743(int[] arg0) {
        field1484 = arg0[0];
        field1482 = arg0[1];
        field1480 = arg0[2];
        field1483 = arg0[3];
    }

    @ObfuscatedName("cp.cw()V")
    public static void method1744() {
        int var0 = 0;
        int var1 = Statics.field1481 * Statics.field1479 - 7;
        while (var0 < var1) {
            Statics.field1485[var0++] = 0;
            Statics.field1485[var0++] = 0;
            Statics.field1485[var0++] = 0;
            Statics.field1485[var0++] = 0;
            Statics.field1485[var0++] = 0;
            Statics.field1485[var0++] = 0;
            Statics.field1485[var0++] = 0;
            Statics.field1485[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1485[var0++] = 0;
        }
    }

    @ObfuscatedName("cp.cz(IIIIII)V")
    public static void method1745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1484) {
            arg2 -= field1484 - arg0;
            arg0 = field1484;
        }
        if (arg1 < field1482) {
            arg3 -= field1482 - arg1;
            arg1 = field1482;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        if (arg1 + arg3 > field1483) {
            arg3 = field1483 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1481 - arg2;
        int var9 = Statics.field1481 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1485[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1485[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cp.cn(IIIII)V")
    public static void method1748(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1484) {
            arg2 -= field1484 - arg0;
            arg0 = field1484;
        }
        if (arg1 < field1482) {
            arg3 -= field1482 - arg1;
            arg1 = field1482;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        if (arg1 + arg3 > field1483) {
            arg3 = field1483 - arg1;
        }
        int var5 = Statics.field1481 - arg2;
        int var6 = Statics.field1481 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1485[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cp.ch(IIIIII)V")
    public static void method1755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1484) {
            arg2 -= field1484 - arg0;
            arg0 = field1484;
        }
        if (arg1 < field1482) {
            var6 += (field1482 - arg1) * var7;
            arg3 -= field1482 - arg1;
            arg1 = field1482;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        if (arg1 + arg3 > field1483) {
            arg3 = field1483 - arg1;
        }
        int var8 = Statics.field1481 - arg2;
        int var9 = Statics.field1481 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1485[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cp.ct(IIIII)V")
    public static void method1759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1750(arg0, arg1, arg2, arg4);
        method1750(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1768(arg0, arg1, arg3, arg4);
        method1768(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cp.cr(IIIIII)V")
    public static void method1749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1751(arg0, arg1, arg2, arg4, arg5);
        method1751(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1738(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1738(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cp.ce(IIII)V")
    public static void method1750(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1482 || arg1 >= field1483) {
            return;
        }
        if (arg0 < field1484) {
            arg2 -= field1484 - arg0;
            arg0 = field1484;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        int var4 = Statics.field1481 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1485[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cp.cl(IIIII)V")
    public static void method1751(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1482 || arg1 >= field1483) {
            return;
        }
        if (arg0 < field1484) {
            arg2 -= field1484 - arg0;
            arg0 = field1484;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1481 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1485[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1485[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1485[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1485[var9++] = var14;
        }
    }

    @ObfuscatedName("cp.cu(IIII)V")
    public static void method1768(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1484 || arg0 >= field1480) {
            return;
        }
        if (arg1 < field1482) {
            arg2 -= field1482 - arg1;
            arg1 = field1482;
        }
        if (arg1 + arg2 > field1483) {
            arg2 = field1483 - arg1;
        }
        int var4 = Statics.field1481 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1485[Statics.field1481 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cp.di(IIIII)V")
    public static void method1738(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1484 || arg0 >= field1480) {
            return;
        }
        if (arg1 < field1482) {
            arg2 -= field1482 - arg1;
            arg1 = field1482;
        }
        if (arg1 + arg2 > field1483) {
            arg2 = field1483 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1481 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1485[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1485[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1485[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1485[var9] = var14;
            var9 += Statics.field1481;
        }
    }

    @ObfuscatedName("cp.dy(IIIII)V")
    public static void method1754(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1750(arg0, arg1, var5 + 1, arg4);
            } else {
                method1750(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1484) {
                    var8 += (field1484 - arg0) * var10;
                    arg0 = field1484;
                }
                if (var11 >= field1480) {
                    var11 = field1480 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1482 && var12 < field1483) {
                        Statics.field1485[Statics.field1481 * var12 + arg0] = arg4;
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
                if (arg1 < field1482) {
                    var14 += (field1482 - arg1) * var16;
                    arg1 = field1482;
                }
                if (var17 >= field1483) {
                    var17 = field1483 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1484 && var18 < field1480) {
                        Statics.field1485[Statics.field1481 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1768(arg0, arg1, var6 + 1, arg4);
        } else {
            method1768(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cp.dn(III[I[I)V")
    public static void method1775(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1481 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1485[var7++] = arg2;
            }
            var5 += Statics.field1481;
        }
    }
}
