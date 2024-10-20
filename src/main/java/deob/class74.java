package deob;

@ObfuscatedName("bk")
public class class74 extends class185 {

    @ObfuscatedName("bk.b")
    public static int field1327 = 0;

    @ObfuscatedName("bk.u")
    public static int field1328 = 0;

    @ObfuscatedName("bk.j")
    public static int field1330 = 0;

    @ObfuscatedName("bk.d")
    public static int field1331 = 0;

    @ObfuscatedName("bk.cz([III)V")
    public static void method1547(int[] arg0, int arg1, int arg2) {
        Statics.field1325 = arg0;
        Statics.field1326 = arg1;
        Statics.field1329 = arg2;
        method1549(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bk.cp()V")
    public static void method1605() {
        field1330 = 0;
        field1327 = 0;
        field1331 = Statics.field1326;
        field1328 = Statics.field1329;
    }

    @ObfuscatedName("bk.cv(IIII)V")
    public static void method1549(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1326) {
            arg2 = Statics.field1326;
        }
        if (arg3 > Statics.field1329) {
            arg3 = Statics.field1329;
        }
        field1330 = arg0;
        field1327 = arg1;
        field1331 = arg2;
        field1328 = arg3;
    }

    @ObfuscatedName("bk.cx(IIII)V")
    public static void method1550(int arg0, int arg1, int arg2, int arg3) {
        if (field1330 < arg0) {
            field1330 = arg0;
        }
        if (field1327 < arg1) {
            field1327 = arg1;
        }
        if (field1331 > arg2) {
            field1331 = arg2;
        }
        if (field1328 > arg3) {
            field1328 = arg3;
        }
    }

    @ObfuscatedName("bk.cg([I)V")
    public static void method1615(int[] arg0) {
        arg0[0] = field1330;
        arg0[1] = field1327;
        arg0[2] = field1331;
        arg0[3] = field1328;
    }

    @ObfuscatedName("bk.cy([I)V")
    public static void method1552(int[] arg0) {
        field1330 = arg0[0];
        field1327 = arg0[1];
        field1331 = arg0[2];
        field1328 = arg0[3];
    }

    @ObfuscatedName("bk.ce()V")
    public static void method1573() {
        int var0 = 0;
        int var1 = Statics.field1329 * Statics.field1326 - 7;
        while (var0 < var1) {
            Statics.field1325[var0++] = 0;
            Statics.field1325[var0++] = 0;
            Statics.field1325[var0++] = 0;
            Statics.field1325[var0++] = 0;
            Statics.field1325[var0++] = 0;
            Statics.field1325[var0++] = 0;
            Statics.field1325[var0++] = 0;
            Statics.field1325[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1325[var0++] = 0;
        }
    }

    @ObfuscatedName("bk.cu(IIIIII)V")
    public static void method1554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1330) {
            arg2 -= field1330 - arg0;
            arg0 = field1330;
        }
        if (arg1 < field1327) {
            arg3 -= field1327 - arg1;
            arg1 = field1327;
        }
        if (arg0 + arg2 > field1331) {
            arg2 = field1331 - arg0;
        }
        if (arg1 + arg3 > field1328) {
            arg3 = field1328 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1326 - arg2;
        int var9 = Statics.field1326 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1325[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1325[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bk.cc(IIIII)V")
    public static void method1555(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1330) {
            arg2 -= field1330 - arg0;
            arg0 = field1330;
        }
        if (arg1 < field1327) {
            arg3 -= field1327 - arg1;
            arg1 = field1327;
        }
        if (arg0 + arg2 > field1331) {
            arg2 = field1331 - arg0;
        }
        if (arg1 + arg3 > field1328) {
            arg3 = field1328 - arg1;
        }
        int var5 = Statics.field1326 - arg2;
        int var6 = Statics.field1326 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1325[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bk.cw(IIIIII)V")
    public static void method1556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1330) {
            arg2 -= field1330 - arg0;
            arg0 = field1330;
        }
        if (arg1 < field1327) {
            var6 += (field1327 - arg1) * var7;
            arg3 -= field1327 - arg1;
            arg1 = field1327;
        }
        if (arg0 + arg2 > field1331) {
            arg2 = field1331 - arg0;
        }
        if (arg1 + arg3 > field1328) {
            arg3 = field1328 - arg1;
        }
        int var8 = Statics.field1326 - arg2;
        int var9 = Statics.field1326 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1325[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bk.ci(IIIII)V")
    public static void method1607(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1559(arg0, arg1, arg2, arg4);
        method1559(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1561(arg0, arg1, arg3, arg4);
        method1561(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bk.cd(IIIIII)V")
    public static void method1558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1560(arg0, arg1, arg2, arg4, arg5);
        method1560(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1604(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1604(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bk.cl(IIII)V")
    public static void method1559(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1327 || arg1 >= field1328) {
            return;
        }
        if (arg0 < field1330) {
            arg2 -= field1330 - arg0;
            arg0 = field1330;
        }
        if (arg0 + arg2 > field1331) {
            arg2 = field1331 - arg0;
        }
        int var4 = Statics.field1326 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1325[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bk.co(IIIII)V")
    public static void method1560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1327 || arg1 >= field1328) {
            return;
        }
        if (arg0 < field1330) {
            arg2 -= field1330 - arg0;
            arg0 = field1330;
        }
        if (arg0 + arg2 > field1331) {
            arg2 = field1331 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1326 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1325[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1325[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1325[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1325[var9++] = var14;
        }
    }

    @ObfuscatedName("bk.cm(IIII)V")
    public static void method1561(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1330 || arg0 >= field1331) {
            return;
        }
        if (arg1 < field1327) {
            arg2 -= field1327 - arg1;
            arg1 = field1327;
        }
        if (arg1 + arg2 > field1328) {
            arg2 = field1328 - arg1;
        }
        int var4 = Statics.field1326 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1325[Statics.field1326 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bk.cj(IIIII)V")
    public static void method1604(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1330 || arg0 >= field1331) {
            return;
        }
        if (arg1 < field1327) {
            arg2 -= field1327 - arg1;
            arg1 = field1327;
        }
        if (arg1 + arg2 > field1328) {
            arg2 = field1328 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1326 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1325[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1325[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1325[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1325[var9] = var14;
            var9 += Statics.field1326;
        }
    }

    @ObfuscatedName("bk.df(IIIII)V")
    public static void method1563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1559(arg0, arg1, var5 + 1, arg4);
            } else {
                method1559(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1330) {
                    var8 += (field1330 - arg0) * var10;
                    arg0 = field1330;
                }
                if (var11 >= field1331) {
                    var11 = field1331 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1327 && var12 < field1328) {
                        Statics.field1325[Statics.field1326 * var12 + arg0] = arg4;
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
                if (arg1 < field1327) {
                    var14 += (field1327 - arg1) * var16;
                    arg1 = field1327;
                }
                if (var17 >= field1328) {
                    var17 = field1328 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1330 && var18 < field1331) {
                        Statics.field1325[Statics.field1326 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1561(arg0, arg1, var6 + 1, arg4);
        } else {
            method1561(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bk.ds(III[I[I)V")
    public static void method1564(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1326 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1325[var7++] = arg2;
            }
            var5 += Statics.field1326;
        }
    }
}
