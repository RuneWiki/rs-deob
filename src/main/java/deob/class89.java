package deob;

@ObfuscatedName("ct")
public class class89 extends class174 {

    @ObfuscatedName("ct.k")
    public static int field1527 = 0;

    @ObfuscatedName("ct.o")
    public static int field1528 = 0;

    @ObfuscatedName("ct.f")
    public static int field1529 = 0;

    @ObfuscatedName("ct.r")
    public static int field1525 = 0;

    @ObfuscatedName("ct.ca([III)V")
    public static void method1860(int[] arg0, int arg1, int arg2) {
        Statics.field1530 = arg0;
        Statics.field1524 = arg1;
        Statics.field1526 = arg2;
        method1794(0, 0, arg1, arg2);
    }

    @ObfuscatedName("ct.cf()V")
    public static void method1838() {
        field1529 = 0;
        field1527 = 0;
        field1525 = Statics.field1524;
        field1528 = Statics.field1526;
    }

    @ObfuscatedName("ct.cr(IIII)V")
    public static void method1794(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1524) {
            arg2 = Statics.field1524;
        }
        if (arg3 > Statics.field1526) {
            arg3 = Statics.field1526;
        }
        field1529 = arg0;
        field1527 = arg1;
        field1525 = arg2;
        field1528 = arg3;
    }

    @ObfuscatedName("ct.ch(IIII)V")
    public static void method1795(int arg0, int arg1, int arg2, int arg3) {
        if (field1529 < arg0) {
            field1529 = arg0;
        }
        if (field1527 < arg1) {
            field1527 = arg1;
        }
        if (field1525 > arg2) {
            field1525 = arg2;
        }
        if (field1528 > arg3) {
            field1528 = arg3;
        }
    }

    @ObfuscatedName("ct.cg([I)V")
    public static void method1796(int[] arg0) {
        arg0[0] = field1529;
        arg0[1] = field1527;
        arg0[2] = field1525;
        arg0[3] = field1528;
    }

    @ObfuscatedName("ct.cl([I)V")
    public static void method1797(int[] arg0) {
        field1529 = arg0[0];
        field1527 = arg0[1];
        field1525 = arg0[2];
        field1528 = arg0[3];
    }

    @ObfuscatedName("ct.cx()V")
    public static void method1798() {
        int var0 = 0;
        int var1 = Statics.field1526 * Statics.field1524 - 7;
        while (var0 < var1) {
            Statics.field1530[var0++] = 0;
            Statics.field1530[var0++] = 0;
            Statics.field1530[var0++] = 0;
            Statics.field1530[var0++] = 0;
            Statics.field1530[var0++] = 0;
            Statics.field1530[var0++] = 0;
            Statics.field1530[var0++] = 0;
            Statics.field1530[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1530[var0++] = 0;
        }
    }

    @ObfuscatedName("ct.cc(IIIIII)V")
    public static void method1840(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1529) {
            arg2 -= field1529 - arg0;
            arg0 = field1529;
        }
        if (arg1 < field1527) {
            arg3 -= field1527 - arg1;
            arg1 = field1527;
        }
        if (arg0 + arg2 > field1525) {
            arg2 = field1525 - arg0;
        }
        if (arg1 + arg3 > field1528) {
            arg3 = field1528 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1524 - arg2;
        int var9 = Statics.field1524 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1530[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1530[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("ct.cb(IIIII)V")
    public static void method1800(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1529) {
            arg2 -= field1529 - arg0;
            arg0 = field1529;
        }
        if (arg1 < field1527) {
            arg3 -= field1527 - arg1;
            arg1 = field1527;
        }
        if (arg0 + arg2 > field1525) {
            arg2 = field1525 - arg0;
        }
        if (arg1 + arg3 > field1528) {
            arg3 = field1528 - arg1;
        }
        int var5 = Statics.field1524 - arg2;
        int var6 = Statics.field1524 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1530[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("ct.cd(IIIIII)V")
    public static void method1801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1529) {
            arg2 -= field1529 - arg0;
            arg0 = field1529;
        }
        if (arg1 < field1527) {
            var6 += (field1527 - arg1) * var7;
            arg3 -= field1527 - arg1;
            arg1 = field1527;
        }
        if (arg0 + arg2 > field1525) {
            arg2 = field1525 - arg0;
        }
        if (arg1 + arg3 > field1528) {
            arg3 = field1528 - arg1;
        }
        int var8 = Statics.field1524 - arg2;
        int var9 = Statics.field1524 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1530[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("ct.co(IIIII)V")
    public static void method1802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1804(arg0, arg1, arg2, arg4);
        method1804(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1806(arg0, arg1, arg3, arg4);
        method1806(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("ct.dg(IIIIII)V")
    public static void method1803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1805(arg0, arg1, arg2, arg4, arg5);
        method1805(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1807(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1807(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("ct.dc(IIII)V")
    public static void method1804(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1527 || arg1 >= field1528) {
            return;
        }
        if (arg0 < field1529) {
            arg2 -= field1529 - arg0;
            arg0 = field1529;
        }
        if (arg0 + arg2 > field1525) {
            arg2 = field1525 - arg0;
        }
        int var4 = Statics.field1524 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1530[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("ct.dt(IIIII)V")
    public static void method1805(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1527 || arg1 >= field1528) {
            return;
        }
        if (arg0 < field1529) {
            arg2 -= field1529 - arg0;
            arg0 = field1529;
        }
        if (arg0 + arg2 > field1525) {
            arg2 = field1525 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1524 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1530[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1530[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1530[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1530[var9++] = var14;
        }
    }

    @ObfuscatedName("ct.df(IIII)V")
    public static void method1806(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1529 || arg0 >= field1525) {
            return;
        }
        if (arg1 < field1527) {
            arg2 -= field1527 - arg1;
            arg1 = field1527;
        }
        if (arg1 + arg2 > field1528) {
            arg2 = field1528 - arg1;
        }
        int var4 = Statics.field1524 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1530[Statics.field1524 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("ct.dw(IIIII)V")
    public static void method1807(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1529 || arg0 >= field1525) {
            return;
        }
        if (arg1 < field1527) {
            arg2 -= field1527 - arg1;
            arg1 = field1527;
        }
        if (arg1 + arg2 > field1528) {
            arg2 = field1528 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1524 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1530[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1530[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1530[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1530[var9] = var14;
            var9 += Statics.field1524;
        }
    }

    @ObfuscatedName("ct.db(IIIII)V")
    public static void method1821(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1804(arg0, arg1, var5 + 1, arg4);
            } else {
                method1804(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1529) {
                    var8 += (field1529 - arg0) * var10;
                    arg0 = field1529;
                }
                if (var11 >= field1525) {
                    var11 = field1525 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1527 && var12 < field1528) {
                        Statics.field1530[Statics.field1524 * var12 + arg0] = arg4;
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
                if (arg1 < field1527) {
                    var14 += (field1527 - arg1) * var16;
                    arg1 = field1527;
                }
                if (var17 >= field1528) {
                    var17 = field1528 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1529 && var18 < field1525) {
                        Statics.field1530[Statics.field1524 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1806(arg0, arg1, var6 + 1, arg4);
        } else {
            method1806(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("ct.da(III[I[I)V")
    public static void method1809(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1524 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1530[var7++] = arg2;
            }
            var5 += Statics.field1524;
        }
    }
}
