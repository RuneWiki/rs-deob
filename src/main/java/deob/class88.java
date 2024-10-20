package deob;

@ObfuscatedName("cl")
public class class88 extends class172 {

    @ObfuscatedName("cl.x")
    public static int field1478 = 0;

    @ObfuscatedName("cl.s")
    public static int field1479 = 0;

    @ObfuscatedName("cl.m")
    public static int field1476 = 0;

    @ObfuscatedName("cl.y")
    public static int field1480 = 0;

    @ObfuscatedName("cl.cw([III)V")
    public static void method1848(int[] arg0, int arg1, int arg2) {
        Statics.field1481 = arg0;
        Statics.field1475 = arg1;
        Statics.field1477 = arg2;
        method1792(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cl.cf()V")
    public static void method1816() {
        field1476 = 0;
        field1478 = 0;
        field1480 = Statics.field1475;
        field1479 = Statics.field1477;
    }

    @ObfuscatedName("cl.ce(IIII)V")
    public static void method1792(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1475) {
            arg2 = Statics.field1475;
        }
        if (arg3 > Statics.field1477) {
            arg3 = Statics.field1477;
        }
        field1476 = arg0;
        field1478 = arg1;
        field1480 = arg2;
        field1479 = arg3;
    }

    @ObfuscatedName("cl.cg(IIII)V")
    public static void method1793(int arg0, int arg1, int arg2, int arg3) {
        if (field1476 < arg0) {
            field1476 = arg0;
        }
        if (field1478 < arg1) {
            field1478 = arg1;
        }
        if (field1480 > arg2) {
            field1480 = arg2;
        }
        if (field1479 > arg3) {
            field1479 = arg3;
        }
    }

    @ObfuscatedName("cl.cl([I)V")
    public static void method1794(int[] arg0) {
        arg0[0] = field1476;
        arg0[1] = field1478;
        arg0[2] = field1480;
        arg0[3] = field1479;
    }

    @ObfuscatedName("cl.cq([I)V")
    public static void method1795(int[] arg0) {
        field1476 = arg0[0];
        field1478 = arg0[1];
        field1480 = arg0[2];
        field1479 = arg0[3];
    }

    @ObfuscatedName("cl.cv()V")
    public static void method1796() {
        int var0 = 0;
        int var1 = Statics.field1477 * Statics.field1475 - 7;
        while (var0 < var1) {
            Statics.field1481[var0++] = 0;
            Statics.field1481[var0++] = 0;
            Statics.field1481[var0++] = 0;
            Statics.field1481[var0++] = 0;
            Statics.field1481[var0++] = 0;
            Statics.field1481[var0++] = 0;
            Statics.field1481[var0++] = 0;
            Statics.field1481[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1481[var0++] = 0;
        }
    }

    @ObfuscatedName("cl.cn(IIIIII)V")
    public static void method1797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1476) {
            arg2 -= field1476 - arg0;
            arg0 = field1476;
        }
        if (arg1 < field1478) {
            arg3 -= field1478 - arg1;
            arg1 = field1478;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        if (arg1 + arg3 > field1479) {
            arg3 = field1479 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1475 - arg2;
        int var9 = Statics.field1475 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1481[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1481[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cl.cc(IIIII)V")
    public static void method1842(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1476) {
            arg2 -= field1476 - arg0;
            arg0 = field1476;
        }
        if (arg1 < field1478) {
            arg3 -= field1478 - arg1;
            arg1 = field1478;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        if (arg1 + arg3 > field1479) {
            arg3 = field1479 - arg1;
        }
        int var5 = Statics.field1475 - arg2;
        int var6 = Statics.field1475 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1481[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cl.co(IIIIII)V")
    public static void method1820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1476) {
            arg2 -= field1476 - arg0;
            arg0 = field1476;
        }
        if (arg1 < field1478) {
            var6 += (field1478 - arg1) * var7;
            arg3 -= field1478 - arg1;
            arg1 = field1478;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        if (arg1 + arg3 > field1479) {
            arg3 = field1479 - arg1;
        }
        int var8 = Statics.field1475 - arg2;
        int var9 = Statics.field1475 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1481[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cl.cs(IIIII)V")
    public static void method1800(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1826(arg0, arg1, arg2, arg4);
        method1826(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1804(arg0, arg1, arg3, arg4);
        method1804(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cl.ca(IIIIII)V")
    public static void method1799(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1803(arg0, arg1, arg2, arg4, arg5);
        method1803(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1805(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1805(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cl.cu(IIII)V")
    public static void method1826(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1478 || arg1 >= field1479) {
            return;
        }
        if (arg0 < field1476) {
            arg2 -= field1476 - arg0;
            arg0 = field1476;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        int var4 = Statics.field1475 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1481[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cl.cp(IIIII)V")
    public static void method1803(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1478 || arg1 >= field1479) {
            return;
        }
        if (arg0 < field1476) {
            arg2 -= field1476 - arg0;
            arg0 = field1476;
        }
        if (arg0 + arg2 > field1480) {
            arg2 = field1480 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1475 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1481[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1481[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1481[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1481[var9++] = var14;
        }
    }

    @ObfuscatedName("cl.cr(IIII)V")
    public static void method1804(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1476 || arg0 >= field1480) {
            return;
        }
        if (arg1 < field1478) {
            arg2 -= field1478 - arg1;
            arg1 = field1478;
        }
        if (arg1 + arg2 > field1479) {
            arg2 = field1479 - arg1;
        }
        int var4 = Statics.field1475 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1481[Statics.field1475 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cl.ch(IIIII)V")
    public static void method1805(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1476 || arg0 >= field1480) {
            return;
        }
        if (arg1 < field1478) {
            arg2 -= field1478 - arg1;
            arg1 = field1478;
        }
        if (arg1 + arg2 > field1479) {
            arg2 = field1479 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1475 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1481[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1481[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1481[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1481[var9] = var14;
            var9 += Statics.field1475;
        }
    }

    @ObfuscatedName("cl.cm(IIIII)V")
    public static void method1806(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1826(arg0, arg1, var5 + 1, arg4);
            } else {
                method1826(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1476) {
                    var8 += (field1476 - arg0) * var10;
                    arg0 = field1476;
                }
                if (var11 >= field1480) {
                    var11 = field1480 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1478 && var12 < field1479) {
                        Statics.field1481[Statics.field1475 * var12 + arg0] = arg4;
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
                if (arg1 < field1478) {
                    var14 += (field1478 - arg1) * var16;
                    arg1 = field1478;
                }
                if (var17 >= field1479) {
                    var17 = field1479 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1476 && var18 < field1480) {
                        Statics.field1481[Statics.field1475 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1804(arg0, arg1, var6 + 1, arg4);
        } else {
            method1804(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cl.cd(III[I[I)V")
    public static void method1807(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1475 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1481[var7++] = arg2;
            }
            var5 += Statics.field1475;
        }
    }
}
