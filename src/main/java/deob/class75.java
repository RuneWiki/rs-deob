package deob;

@ObfuscatedName("bq")
public class class75 extends class195 {

    @ObfuscatedName("bq.u")
    public static int field1332 = 0;

    @ObfuscatedName("bq.r")
    public static int field1330 = 0;

    @ObfuscatedName("bq.k")
    public static int field1331 = 0;

    @ObfuscatedName("bq.w")
    public static int field1326 = 0;

    @ObfuscatedName("bq.cw([III)V")
    public static void method1583(int[] arg0, int arg1, int arg2) {
        Statics.field1329 = arg0;
        Statics.field1327 = arg1;
        Statics.field1328 = arg2;
        method1572(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bq.cd()V")
    public static void method1573() {
        field1331 = 0;
        field1332 = 0;
        field1326 = Statics.field1327;
        field1330 = Statics.field1328;
    }

    @ObfuscatedName("bq.cs(IIII)V")
    public static void method1572(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1327) {
            arg2 = Statics.field1327;
        }
        if (arg3 > Statics.field1328) {
            arg3 = Statics.field1328;
        }
        field1331 = arg0;
        field1332 = arg1;
        field1326 = arg2;
        field1330 = arg3;
    }

    @ObfuscatedName("bq.cy(IIII)V")
    public static void method1575(int arg0, int arg1, int arg2, int arg3) {
        if (field1331 < arg0) {
            field1331 = arg0;
        }
        if (field1332 < arg1) {
            field1332 = arg1;
        }
        if (field1326 > arg2) {
            field1326 = arg2;
        }
        if (field1330 > arg3) {
            field1330 = arg3;
        }
    }

    @ObfuscatedName("bq.cu([I)V")
    public static void method1576(int[] arg0) {
        arg0[0] = field1331;
        arg0[1] = field1332;
        arg0[2] = field1326;
        arg0[3] = field1330;
    }

    @ObfuscatedName("bq.co([I)V")
    public static void method1580(int[] arg0) {
        field1331 = arg0[0];
        field1332 = arg0[1];
        field1326 = arg0[2];
        field1330 = arg0[3];
    }

    @ObfuscatedName("bq.cr()V")
    public static void method1619() {
        int var0 = 0;
        int var1 = Statics.field1328 * Statics.field1327 - 7;
        while (var0 < var1) {
            Statics.field1329[var0++] = 0;
            Statics.field1329[var0++] = 0;
            Statics.field1329[var0++] = 0;
            Statics.field1329[var0++] = 0;
            Statics.field1329[var0++] = 0;
            Statics.field1329[var0++] = 0;
            Statics.field1329[var0++] = 0;
            Statics.field1329[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1329[var0++] = 0;
        }
    }

    @ObfuscatedName("bq.df(IIIIII)V")
    public static void method1579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1331) {
            arg2 -= field1331 - arg0;
            arg0 = field1331;
        }
        if (arg1 < field1332) {
            arg3 -= field1332 - arg1;
            arg1 = field1332;
        }
        if (arg0 + arg2 > field1326) {
            arg2 = field1326 - arg0;
        }
        if (arg1 + arg3 > field1330) {
            arg3 = field1330 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1327 - arg2;
        int var9 = Statics.field1327 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1329[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1329[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bq.dj(IIIII)V")
    public static void method1578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1331) {
            arg2 -= field1331 - arg0;
            arg0 = field1331;
        }
        if (arg1 < field1332) {
            arg3 -= field1332 - arg1;
            arg1 = field1332;
        }
        if (arg0 + arg2 > field1326) {
            arg2 = field1326 - arg0;
        }
        if (arg1 + arg3 > field1330) {
            arg3 = field1330 - arg1;
        }
        int var5 = Statics.field1327 - arg2;
        int var6 = Statics.field1327 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1329[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bq.dv(IIIIII)V")
    public static void method1611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1331) {
            arg2 -= field1331 - arg0;
            arg0 = field1331;
        }
        if (arg1 < field1332) {
            var6 += (field1332 - arg1) * var7;
            arg3 -= field1332 - arg1;
            arg1 = field1332;
        }
        if (arg0 + arg2 > field1326) {
            arg2 = field1326 - arg0;
        }
        if (arg1 + arg3 > field1330) {
            arg3 = field1330 - arg1;
        }
        int var8 = Statics.field1327 - arg2;
        int var9 = Statics.field1327 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1329[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bq.dk(IIIII)V")
    public static void method1582(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1584(arg0, arg1, arg2, arg4);
        method1584(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1589(arg0, arg1, arg3, arg4);
        method1589(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bq.db(IIIIII)V")
    public static void method1593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1585(arg0, arg1, arg2, arg4, arg5);
        method1585(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1598(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1598(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bq.dl(IIII)V")
    public static void method1584(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1332 || arg1 >= field1330) {
            return;
        }
        if (arg0 < field1331) {
            arg2 -= field1331 - arg0;
            arg0 = field1331;
        }
        if (arg0 + arg2 > field1326) {
            arg2 = field1326 - arg0;
        }
        int var4 = Statics.field1327 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1329[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bq.dc(IIIII)V")
    public static void method1585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1332 || arg1 >= field1330) {
            return;
        }
        if (arg0 < field1331) {
            arg2 -= field1331 - arg0;
            arg0 = field1331;
        }
        if (arg0 + arg2 > field1326) {
            arg2 = field1326 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1327 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1329[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1329[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1329[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1329[var9++] = var14;
        }
    }

    @ObfuscatedName("bq.da(IIII)V")
    public static void method1589(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1331 || arg0 >= field1326) {
            return;
        }
        if (arg1 < field1332) {
            arg2 -= field1332 - arg1;
            arg1 = field1332;
        }
        if (arg1 + arg2 > field1330) {
            arg2 = field1330 - arg1;
        }
        int var4 = Statics.field1327 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1329[Statics.field1327 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bq.du(IIIII)V")
    public static void method1598(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1331 || arg0 >= field1326) {
            return;
        }
        if (arg1 < field1332) {
            arg2 -= field1332 - arg1;
            arg1 = field1332;
        }
        if (arg1 + arg2 > field1330) {
            arg2 = field1330 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1327 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1329[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1329[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1329[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1329[var9] = var14;
            var9 += Statics.field1327;
        }
    }

    @ObfuscatedName("bq.do(IIIII)V")
    public static void method1588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1584(arg0, arg1, var5 + 1, arg4);
            } else {
                method1584(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1331) {
                    var8 += (field1331 - arg0) * var10;
                    arg0 = field1331;
                }
                if (var11 >= field1326) {
                    var11 = field1326 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1332 && var12 < field1330) {
                        Statics.field1329[Statics.field1327 * var12 + arg0] = arg4;
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
                if (arg1 < field1332) {
                    var14 += (field1332 - arg1) * var16;
                    arg1 = field1332;
                }
                if (var17 >= field1330) {
                    var17 = field1330 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1331 && var18 < field1326) {
                        Statics.field1329[Statics.field1327 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1589(arg0, arg1, var6 + 1, arg4);
        } else {
            method1589(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bq.dn(III[I[I)V")
    public static void method1574(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1327 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1329[var7++] = arg2;
            }
            var5 += Statics.field1327;
        }
    }
}
