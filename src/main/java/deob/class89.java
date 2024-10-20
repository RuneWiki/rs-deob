package deob;

@ObfuscatedName("cc")
public class class89 extends class174 {

    @ObfuscatedName("cc.q")
    public static int field1481 = 0;

    @ObfuscatedName("cc.a")
    public static int field1480 = 0;

    @ObfuscatedName("cc.c")
    public static int field1483 = 0;

    @ObfuscatedName("cc.m")
    public static int field1484 = 0;

    @ObfuscatedName("cc.ck([III)V")
    public static void method1856(int[] arg0, int arg1, int arg2) {
        Statics.field1479 = arg0;
        Statics.field1482 = arg1;
        Statics.field1478 = arg2;
        method1825(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cc.cq()V")
    public static void method1799() {
        field1483 = 0;
        field1481 = 0;
        field1484 = Statics.field1482;
        field1480 = Statics.field1478;
    }

    @ObfuscatedName("cc.cd(IIII)V")
    public static void method1825(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1482) {
            arg2 = Statics.field1482;
        }
        if (arg3 > Statics.field1478) {
            arg3 = Statics.field1478;
        }
        field1483 = arg0;
        field1481 = arg1;
        field1484 = arg2;
        field1480 = arg3;
    }

    @ObfuscatedName("cc.cr(IIII)V")
    public static void method1850(int arg0, int arg1, int arg2, int arg3) {
        if (field1483 < arg0) {
            field1483 = arg0;
        }
        if (field1481 < arg1) {
            field1481 = arg1;
        }
        if (field1484 > arg2) {
            field1484 = arg2;
        }
        if (field1480 > arg3) {
            field1480 = arg3;
        }
    }

    @ObfuscatedName("cc.cg([I)V")
    public static void method1802(int[] arg0) {
        arg0[0] = field1483;
        arg0[1] = field1481;
        arg0[2] = field1484;
        arg0[3] = field1480;
    }

    @ObfuscatedName("cc.cw([I)V")
    public static void method1803(int[] arg0) {
        field1483 = arg0[0];
        field1481 = arg0[1];
        field1484 = arg0[2];
        field1480 = arg0[3];
    }

    @ObfuscatedName("cc.cl()V")
    public static void method1800() {
        int var0 = 0;
        int var1 = Statics.field1482 * Statics.field1478 - 7;
        while (var0 < var1) {
            Statics.field1479[var0++] = 0;
            Statics.field1479[var0++] = 0;
            Statics.field1479[var0++] = 0;
            Statics.field1479[var0++] = 0;
            Statics.field1479[var0++] = 0;
            Statics.field1479[var0++] = 0;
            Statics.field1479[var0++] = 0;
            Statics.field1479[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1479[var0++] = 0;
        }
    }

    @ObfuscatedName("cc.ch(IIIIII)V")
    public static void method1837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1483) {
            arg2 -= field1483 - arg0;
            arg0 = field1483;
        }
        if (arg1 < field1481) {
            arg3 -= field1481 - arg1;
            arg1 = field1481;
        }
        if (arg0 + arg2 > field1484) {
            arg2 = field1484 - arg0;
        }
        if (arg1 + arg3 > field1480) {
            arg3 = field1480 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1482 - arg2;
        int var9 = Statics.field1482 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1479[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1479[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cc.cs(IIIII)V")
    public static void method1801(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1483) {
            arg2 -= field1483 - arg0;
            arg0 = field1483;
        }
        if (arg1 < field1481) {
            arg3 -= field1481 - arg1;
            arg1 = field1481;
        }
        if (arg0 + arg2 > field1484) {
            arg2 = field1484 - arg0;
        }
        if (arg1 + arg3 > field1480) {
            arg3 = field1480 - arg1;
        }
        int var5 = Statics.field1482 - arg2;
        int var6 = Statics.field1482 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1479[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cc.cz(IIIIII)V")
    public static void method1807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1483) {
            arg2 -= field1483 - arg0;
            arg0 = field1483;
        }
        if (arg1 < field1481) {
            var6 += (field1481 - arg1) * var7;
            arg3 -= field1481 - arg1;
            arg1 = field1481;
        }
        if (arg0 + arg2 > field1484) {
            arg2 = field1484 - arg0;
        }
        if (arg1 + arg3 > field1480) {
            arg3 = field1480 - arg1;
        }
        int var8 = Statics.field1482 - arg2;
        int var9 = Statics.field1482 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1479[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cc.cb(IIIII)V")
    public static void method1808(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1810(arg0, arg1, arg2, arg4);
        method1810(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1812(arg0, arg1, arg3, arg4);
        method1812(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cc.cm(IIIIII)V")
    public static void method1809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1811(arg0, arg1, arg2, arg4, arg5);
        method1811(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1818(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1818(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cc.ct(IIII)V")
    public static void method1810(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1481 || arg1 >= field1480) {
            return;
        }
        if (arg0 < field1483) {
            arg2 -= field1483 - arg0;
            arg0 = field1483;
        }
        if (arg0 + arg2 > field1484) {
            arg2 = field1484 - arg0;
        }
        int var4 = Statics.field1482 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1479[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cc.dx(IIIII)V")
    public static void method1811(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1481 || arg1 >= field1480) {
            return;
        }
        if (arg0 < field1483) {
            arg2 -= field1483 - arg0;
            arg0 = field1483;
        }
        if (arg0 + arg2 > field1484) {
            arg2 = field1484 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1482 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1479[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1479[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1479[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1479[var9++] = var14;
        }
    }

    @ObfuscatedName("cc.dk(IIII)V")
    public static void method1812(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1483 || arg0 >= field1484) {
            return;
        }
        if (arg1 < field1481) {
            arg2 -= field1481 - arg1;
            arg1 = field1481;
        }
        if (arg1 + arg2 > field1480) {
            arg2 = field1480 - arg1;
        }
        int var4 = Statics.field1482 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1479[Statics.field1482 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cc.dw(IIIII)V")
    public static void method1818(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1483 || arg0 >= field1484) {
            return;
        }
        if (arg1 < field1481) {
            arg2 -= field1481 - arg1;
            arg1 = field1481;
        }
        if (arg1 + arg2 > field1480) {
            arg2 = field1480 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1482 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1479[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1479[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1479[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1479[var9] = var14;
            var9 += Statics.field1482;
        }
    }

    @ObfuscatedName("cc.du(IIIII)V")
    public static void method1814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1810(arg0, arg1, var5 + 1, arg4);
            } else {
                method1810(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1483) {
                    var8 += (field1483 - arg0) * var10;
                    arg0 = field1483;
                }
                if (var11 >= field1484) {
                    var11 = field1484 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1481 && var12 < field1480) {
                        Statics.field1479[Statics.field1482 * var12 + arg0] = arg4;
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
                if (arg1 < field1481) {
                    var14 += (field1481 - arg1) * var16;
                    arg1 = field1481;
                }
                if (var17 >= field1480) {
                    var17 = field1480 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1483 && var18 < field1484) {
                        Statics.field1479[Statics.field1482 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1812(arg0, arg1, var6 + 1, arg4);
        } else {
            method1812(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cc.dc(III[I[I)V")
    public static void method1815(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1482 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1479[var7++] = arg2;
            }
            var5 += Statics.field1482;
        }
    }
}
