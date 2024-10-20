package deob;

@ObfuscatedName("bi")
public class class73 extends class182 {

    @ObfuscatedName("bi.h")
    public static int field1312 = 0;

    @ObfuscatedName("bi.j")
    public static int field1314 = 0;

    @ObfuscatedName("bi.c")
    public static int field1315 = 0;

    @ObfuscatedName("bi.d")
    public static int field1316 = 0;

    @ObfuscatedName("bi.ci([III)V")
    public static void method1516(int[] arg0, int arg1, int arg2) {
        Statics.field1313 = arg0;
        Statics.field1311 = arg1;
        Statics.field1310 = arg2;
        method1535(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bi.cm()V")
    public static void method1514() {
        field1315 = 0;
        field1312 = 0;
        field1316 = Statics.field1311;
        field1314 = Statics.field1310;
    }

    @ObfuscatedName("bi.cg(IIII)V")
    public static void method1535(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1311) {
            arg2 = Statics.field1311;
        }
        if (arg3 > Statics.field1310) {
            arg3 = Statics.field1310;
        }
        field1315 = arg0;
        field1312 = arg1;
        field1316 = arg2;
        field1314 = arg3;
    }

    @ObfuscatedName("bi.cl(IIII)V")
    public static void method1568(int arg0, int arg1, int arg2, int arg3) {
        if (field1315 < arg0) {
            field1315 = arg0;
        }
        if (field1312 < arg1) {
            field1312 = arg1;
        }
        if (field1316 > arg2) {
            field1316 = arg2;
        }
        if (field1314 > arg3) {
            field1314 = arg3;
        }
    }

    @ObfuscatedName("bi.co([I)V")
    public static void method1511(int[] arg0) {
        arg0[0] = field1315;
        arg0[1] = field1312;
        arg0[2] = field1316;
        arg0[3] = field1314;
    }

    @ObfuscatedName("bi.cc([I)V")
    public static void method1512(int[] arg0) {
        field1315 = arg0[0];
        field1312 = arg0[1];
        field1316 = arg0[2];
        field1314 = arg0[3];
    }

    @ObfuscatedName("bi.dd()V")
    public static void method1513() {
        int var0 = 0;
        int var1 = Statics.field1311 * Statics.field1310 - 7;
        while (var0 < var1) {
            Statics.field1313[var0++] = 0;
            Statics.field1313[var0++] = 0;
            Statics.field1313[var0++] = 0;
            Statics.field1313[var0++] = 0;
            Statics.field1313[var0++] = 0;
            Statics.field1313[var0++] = 0;
            Statics.field1313[var0++] = 0;
            Statics.field1313[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1313[var0++] = 0;
        }
    }

    @ObfuscatedName("bi.ds(IIIIII)V")
    public static void method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg1 < field1312) {
            arg3 -= field1312 - arg1;
            arg1 = field1312;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        if (arg1 + arg3 > field1314) {
            arg3 = field1314 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1311 - arg2;
        int var9 = Statics.field1311 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1313[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1313[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bi.dk(IIIII)V")
    public static void method1515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg1 < field1312) {
            arg3 -= field1312 - arg1;
            arg1 = field1312;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        if (arg1 + arg3 > field1314) {
            arg3 = field1314 - arg1;
        }
        int var5 = Statics.field1311 - arg2;
        int var6 = Statics.field1311 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1313[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bi.dw(IIIIII)V")
    public static void method1567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg1 < field1312) {
            var6 += (field1312 - arg1) * var7;
            arg3 -= field1312 - arg1;
            arg1 = field1312;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        if (arg1 + arg3 > field1314) {
            arg3 = field1314 - arg1;
        }
        int var8 = Statics.field1311 - arg2;
        int var9 = Statics.field1311 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1313[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bi.dz(IIIII)V")
    public static void method1517(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1525(arg0, arg1, arg2, arg4);
        method1525(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1521(arg0, arg1, arg3, arg4);
        method1521(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bi.dc(IIIIII)V")
    public static void method1518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1520(arg0, arg1, arg2, arg4, arg5);
        method1520(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1522(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1522(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bi.dg(IIII)V")
    public static void method1525(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1312 || arg1 >= field1314) {
            return;
        }
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        int var4 = Statics.field1311 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1313[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bi.da(IIIII)V")
    public static void method1520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1312 || arg1 >= field1314) {
            return;
        }
        if (arg0 < field1315) {
            arg2 -= field1315 - arg0;
            arg0 = field1315;
        }
        if (arg0 + arg2 > field1316) {
            arg2 = field1316 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1311 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1313[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1313[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1313[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1313[var9++] = var14;
        }
    }

    @ObfuscatedName("bi.do(IIII)V")
    public static void method1521(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1315 || arg0 >= field1316) {
            return;
        }
        if (arg1 < field1312) {
            arg2 -= field1312 - arg1;
            arg1 = field1312;
        }
        if (arg1 + arg2 > field1314) {
            arg2 = field1314 - arg1;
        }
        int var4 = Statics.field1311 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1313[Statics.field1311 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bi.dh(IIIII)V")
    public static void method1522(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1315 || arg0 >= field1316) {
            return;
        }
        if (arg1 < field1312) {
            arg2 -= field1312 - arg1;
            arg1 = field1312;
        }
        if (arg1 + arg2 > field1314) {
            arg2 = field1314 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1311 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1313[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1313[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1313[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1313[var9] = var14;
            var9 += Statics.field1311;
        }
    }

    @ObfuscatedName("bi.df(IIIII)V")
    public static void method1523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1525(arg0, arg1, var5 + 1, arg4);
            } else {
                method1525(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1315) {
                    var8 += (field1315 - arg0) * var10;
                    arg0 = field1315;
                }
                if (var11 >= field1316) {
                    var11 = field1316 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1312 && var12 < field1314) {
                        Statics.field1313[Statics.field1311 * var12 + arg0] = arg4;
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
                if (arg1 < field1312) {
                    var14 += (field1312 - arg1) * var16;
                    arg1 = field1312;
                }
                if (var17 >= field1314) {
                    var17 = field1314 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1315 && var18 < field1316) {
                        Statics.field1313[Statics.field1311 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1521(arg0, arg1, var6 + 1, arg4);
        } else {
            method1521(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bi.db(III[I[I)V")
    public static void method1524(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1311 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1313[var7++] = arg2;
            }
            var5 += Statics.field1311;
        }
    }
}
