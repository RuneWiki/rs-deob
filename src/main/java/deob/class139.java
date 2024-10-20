package deob;

@ObfuscatedName("cw")
public class class139 extends class77 {

    @ObfuscatedName("cw.c")
    public static int field2040 = 0;

    @ObfuscatedName("cw.m")
    public static int field2038 = 0;

    @ObfuscatedName("cw.v")
    public static int field2039 = 0;

    @ObfuscatedName("cw.s")
    public static int field2037 = 0;

    @ObfuscatedName("cw.cm(IIII)V")
    public static void method2299(int arg0, int arg1, int arg2, int arg3) {
        if (field2039 < arg0) {
            field2039 = arg0;
        }
        if (field2037 < arg1) {
            field2037 = arg1;
        }
        if (field2040 > arg2) {
            field2040 = arg2;
        }
        if (field2038 > arg3) {
            field2038 = arg3;
        }
    }

    @ObfuscatedName("cw.cv()V")
    public static void method2300() {
        field2039 = 0;
        field2037 = 0;
        field2040 = Statics.field2034;
        field2038 = Statics.field2035;
    }

    @ObfuscatedName("cw.db(III[I[I)V")
    public static void method2301(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field2034 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field2036[var7++] = arg2;
            }
            var5 += Statics.field2034;
        }
    }

    @ObfuscatedName("cw.cz([I)V")
    public static void method2302(int[] arg0) {
        arg0[0] = field2039;
        arg0[1] = field2037;
        arg0[2] = field2040;
        arg0[3] = field2038;
    }

    @ObfuscatedName("cw.dd(IIII)V")
    public static void method2303(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2039 || arg0 >= field2040) {
            return;
        }
        if (arg1 < field2037) {
            arg2 -= field2037 - arg1;
            arg1 = field2037;
        }
        if (arg1 + arg2 > field2038) {
            arg2 = field2038 - arg1;
        }
        int var4 = Statics.field2034 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field2036[Statics.field2034 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cw.cb([III)V")
    public static void method2304(int[] arg0, int arg1, int arg2) {
        Statics.field2036 = arg0;
        Statics.field2034 = arg1;
        Statics.field2035 = arg2;
        method2344(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cw.dm(IIIIII)V")
    public static void method2306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2039) {
            arg2 -= field2039 - arg0;
            arg0 = field2039;
        }
        if (arg1 < field2037) {
            arg3 -= field2037 - arg1;
            arg1 = field2037;
        }
        if (arg0 + arg2 > field2040) {
            arg2 = field2040 - arg0;
        }
        if (arg1 + arg3 > field2038) {
            arg3 = field2038 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field2034 - arg2;
        int var9 = Statics.field2034 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field2036[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field2036[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cw.do()V")
    public static void method2307() {
        int var0 = 0;
        int var1 = Statics.field2035 * Statics.field2034 - 7;
        while (var0 < var1) {
            Statics.field2036[var0++] = 0;
            Statics.field2036[var0++] = 0;
            Statics.field2036[var0++] = 0;
            Statics.field2036[var0++] = 0;
            Statics.field2036[var0++] = 0;
            Statics.field2036[var0++] = 0;
            Statics.field2036[var0++] = 0;
            Statics.field2036[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field2036[var0++] = 0;
        }
    }

    @ObfuscatedName("cw.dj(IIIII)V")
    public static void method2309(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method2348(arg0, arg1, arg2, arg4);
        method2348(arg0, arg1 + arg3 - 1, arg2, arg4);
        method2303(arg0, arg1, arg3, arg4);
        method2303(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cw.cl([I)V")
    public static void method2310(int[] arg0) {
        field2039 = arg0[0];
        field2037 = arg0[1];
        field2040 = arg0[2];
        field2038 = arg0[3];
    }

    @ObfuscatedName("cw.di(IIIII)V")
    public static void method2312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2037 || arg1 >= field2038) {
            return;
        }
        if (arg0 < field2039) {
            arg2 -= field2039 - arg0;
            arg0 = field2039;
        }
        if (arg0 + arg2 > field2040) {
            arg2 = field2040 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field2034 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field2036[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field2036[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field2036[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field2036[var9++] = var14;
        }
    }

    @ObfuscatedName("cw.df(IIIII)V")
    public static void method2314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method2348(arg0, arg1, var5 + 1, arg4);
            } else {
                method2348(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field2039) {
                    var8 += (field2039 - arg0) * var10;
                    arg0 = field2039;
                }
                if (var11 >= field2040) {
                    var11 = field2040 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2037 && var12 < field2038) {
                        Statics.field2036[Statics.field2034 * var12 + arg0] = arg4;
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
                if (arg1 < field2037) {
                    var14 += (field2037 - arg1) * var16;
                    arg1 = field2037;
                }
                if (var17 >= field2038) {
                    var17 = field2038 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2039 && var18 < field2040) {
                        Statics.field2036[Statics.field2034 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method2303(arg0, arg1, var6 + 1, arg4);
        } else {
            method2303(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cw.dk(IIIII)V")
    public static void method2315(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2039 || arg0 >= field2040) {
            return;
        }
        if (arg1 < field2037) {
            arg2 -= field2037 - arg1;
            arg1 = field2037;
        }
        if (arg1 + arg2 > field2038) {
            arg2 = field2038 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field2034 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field2036[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field2036[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field2036[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field2036[var9] = var14;
            var9 += Statics.field2034;
        }
    }

    @ObfuscatedName("cw.dr(IIIIII)V")
    public static void method2343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method2312(arg0, arg1, arg2, arg4, arg5);
        method2312(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method2315(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method2315(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cw.ct(IIII)V")
    public static void method2344(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field2034) {
            arg2 = Statics.field2034;
        }
        if (arg3 > Statics.field2035) {
            arg3 = Statics.field2035;
        }
        field2039 = arg0;
        field2037 = arg1;
        field2040 = arg2;
        field2038 = arg3;
    }

    @ObfuscatedName("cw.dq(IIII)V")
    public static void method2348(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2037 || arg1 >= field2038) {
            return;
        }
        if (arg0 < field2039) {
            arg2 -= field2039 - arg0;
            arg0 = field2039;
        }
        if (arg0 + arg2 > field2040) {
            arg2 = field2040 - arg0;
        }
        int var4 = Statics.field2034 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field2036[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cw.dl(IIIII)V")
    public static void method2353(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2039) {
            arg2 -= field2039 - arg0;
            arg0 = field2039;
        }
        if (arg1 < field2037) {
            arg3 -= field2037 - arg1;
            arg1 = field2037;
        }
        if (arg0 + arg2 > field2040) {
            arg2 = field2040 - arg0;
        }
        if (arg1 + arg3 > field2038) {
            arg3 = field2038 - arg1;
        }
        int var5 = Statics.field2034 - arg2;
        int var6 = Statics.field2034 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field2036[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cw.dt(IIIIII)V")
    public static void method2355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2039) {
            arg2 -= field2039 - arg0;
            arg0 = field2039;
        }
        if (arg1 < field2037) {
            var6 += (field2037 - arg1) * var7;
            arg3 -= field2037 - arg1;
            arg1 = field2037;
        }
        if (arg0 + arg2 > field2040) {
            arg2 = field2040 - arg0;
        }
        if (arg1 + arg3 > field2038) {
            arg3 = field2038 - arg1;
        }
        int var8 = Statics.field2034 - arg2;
        int var9 = Statics.field2034 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field2036[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }
}
