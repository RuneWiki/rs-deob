package deob;

@ObfuscatedName("ci")
public class class89 extends class174 {

    @ObfuscatedName("ci.n")
    public static int field1513 = 0;

    @ObfuscatedName("ci.z")
    public static int field1511 = 0;

    @ObfuscatedName("ci.d")
    public static int field1510 = 0;

    @ObfuscatedName("ci.f")
    public static int field1516 = 0;

    @ObfuscatedName("ci.cv([III)V")
    public static void method1703(int[] arg0, int arg1, int arg2) {
        Statics.field1515 = arg0;
        Statics.field1514 = arg1;
        Statics.field1512 = arg2;
        method1705(0, 0, arg1, arg2);
    }

    @ObfuscatedName("ci.cz()V")
    public static void method1764() {
        field1510 = 0;
        field1513 = 0;
        field1516 = Statics.field1514;
        field1511 = Statics.field1512;
    }

    @ObfuscatedName("ci.cu(IIII)V")
    public static void method1705(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1514) {
            arg2 = Statics.field1514;
        }
        if (arg3 > Statics.field1512) {
            arg3 = Statics.field1512;
        }
        field1510 = arg0;
        field1513 = arg1;
        field1516 = arg2;
        field1511 = arg3;
    }

    @ObfuscatedName("ci.cp(IIII)V")
    public static void method1706(int arg0, int arg1, int arg2, int arg3) {
        if (field1510 < arg0) {
            field1510 = arg0;
        }
        if (field1513 < arg1) {
            field1513 = arg1;
        }
        if (field1516 > arg2) {
            field1516 = arg2;
        }
        if (field1511 > arg3) {
            field1511 = arg3;
        }
    }

    @ObfuscatedName("ci.cg([I)V")
    public static void method1707(int[] arg0) {
        arg0[0] = field1510;
        arg0[1] = field1513;
        arg0[2] = field1516;
        arg0[3] = field1511;
    }

    @ObfuscatedName("ci.du([I)V")
    public static void method1708(int[] arg0) {
        field1510 = arg0[0];
        field1513 = arg0[1];
        field1516 = arg0[2];
        field1511 = arg0[3];
    }

    @ObfuscatedName("ci.dh()V")
    public static void method1726() {
        int var0 = 0;
        int var1 = Statics.field1514 * Statics.field1512 - 7;
        while (var0 < var1) {
            Statics.field1515[var0++] = 0;
            Statics.field1515[var0++] = 0;
            Statics.field1515[var0++] = 0;
            Statics.field1515[var0++] = 0;
            Statics.field1515[var0++] = 0;
            Statics.field1515[var0++] = 0;
            Statics.field1515[var0++] = 0;
            Statics.field1515[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1515[var0++] = 0;
        }
    }

    @ObfuscatedName("ci.dv(IIIIII)V")
    public static void method1718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1510) {
            arg2 -= field1510 - arg0;
            arg0 = field1510;
        }
        if (arg1 < field1513) {
            arg3 -= field1513 - arg1;
            arg1 = field1513;
        }
        if (arg0 + arg2 > field1516) {
            arg2 = field1516 - arg0;
        }
        if (arg1 + arg3 > field1511) {
            arg3 = field1511 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1514 - arg2;
        int var9 = Statics.field1514 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1515[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1515[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("ci.dt(IIIII)V")
    public static void method1711(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1510) {
            arg2 -= field1510 - arg0;
            arg0 = field1510;
        }
        if (arg1 < field1513) {
            arg3 -= field1513 - arg1;
            arg1 = field1513;
        }
        if (arg0 + arg2 > field1516) {
            arg2 = field1516 - arg0;
        }
        if (arg1 + arg3 > field1511) {
            arg3 = field1511 - arg1;
        }
        int var5 = Statics.field1514 - arg2;
        int var6 = Statics.field1514 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1515[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("ci.da(IIIIII)V")
    public static void method1712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1510) {
            arg2 -= field1510 - arg0;
            arg0 = field1510;
        }
        if (arg1 < field1513) {
            var6 += (field1513 - arg1) * var7;
            arg3 -= field1513 - arg1;
            arg1 = field1513;
        }
        if (arg0 + arg2 > field1516) {
            arg2 = field1516 - arg0;
        }
        if (arg1 + arg3 > field1511) {
            arg3 = field1511 - arg1;
        }
        int var8 = Statics.field1514 - arg2;
        int var9 = Statics.field1514 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1515[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("ci.do(IIIII)V")
    public static void method1713(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1753(arg0, arg1, arg2, arg4);
        method1753(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1748(arg0, arg1, arg3, arg4);
        method1748(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("ci.di(IIIIII)V")
    public static void method1702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1716(arg0, arg1, arg2, arg4, arg5);
        method1716(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1717(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1717(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("ci.dl(IIII)V")
    public static void method1753(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1513 || arg1 >= field1511) {
            return;
        }
        if (arg0 < field1510) {
            arg2 -= field1510 - arg0;
            arg0 = field1510;
        }
        if (arg0 + arg2 > field1516) {
            arg2 = field1516 - arg0;
        }
        int var4 = Statics.field1514 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1515[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("ci.dc(IIIII)V")
    public static void method1716(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1513 || arg1 >= field1511) {
            return;
        }
        if (arg0 < field1510) {
            arg2 -= field1510 - arg0;
            arg0 = field1510;
        }
        if (arg0 + arg2 > field1516) {
            arg2 = field1516 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1514 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1515[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1515[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1515[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1515[var9++] = var14;
        }
    }

    @ObfuscatedName("ci.dr(IIII)V")
    public static void method1748(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1510 || arg0 >= field1516) {
            return;
        }
        if (arg1 < field1513) {
            arg2 -= field1513 - arg1;
            arg1 = field1513;
        }
        if (arg1 + arg2 > field1511) {
            arg2 = field1511 - arg1;
        }
        int var4 = Statics.field1514 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1515[Statics.field1514 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("ci.ds(IIIII)V")
    public static void method1717(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1510 || arg0 >= field1516) {
            return;
        }
        if (arg1 < field1513) {
            arg2 -= field1513 - arg1;
            arg1 = field1513;
        }
        if (arg1 + arg2 > field1511) {
            arg2 = field1511 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1514 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1515[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1515[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1515[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1515[var9] = var14;
            var9 += Statics.field1514;
        }
    }

    @ObfuscatedName("ci.dm(IIIII)V")
    public static void method1719(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1753(arg0, arg1, var5 + 1, arg4);
            } else {
                method1753(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1510) {
                    var8 += (field1510 - arg0) * var10;
                    arg0 = field1510;
                }
                if (var11 >= field1516) {
                    var11 = field1516 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1513 && var12 < field1511) {
                        Statics.field1515[Statics.field1514 * var12 + arg0] = arg4;
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
                if (arg1 < field1513) {
                    var14 += (field1513 - arg1) * var16;
                    arg1 = field1513;
                }
                if (var17 >= field1511) {
                    var17 = field1511 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1510 && var18 < field1516) {
                        Statics.field1515[Statics.field1514 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1748(arg0, arg1, var6 + 1, arg4);
        } else {
            method1748(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("ci.dq(III[I[I)V")
    public static void method1720(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1514 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1515[var7++] = arg2;
            }
            var5 += Statics.field1514;
        }
    }
}
