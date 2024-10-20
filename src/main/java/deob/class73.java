package deob;

@ObfuscatedName("bv")
public class class73 extends class181 {

    @ObfuscatedName("bv.l")
    public static int field1293 = 0;

    @ObfuscatedName("bv.w")
    public static int field1289 = 0;

    @ObfuscatedName("bv.x")
    public static int field1294 = 0;

    @ObfuscatedName("bv.t")
    public static int field1295 = 0;

    @ObfuscatedName("bv.cv([III)V")
    public static void method1500(int[] arg0, int arg1, int arg2) {
        Statics.field1292 = arg0;
        Statics.field1290 = arg1;
        Statics.field1291 = arg2;
        method1502(0, 0, arg1, arg2);
    }

    @ObfuscatedName("bv.cx()V")
    public static void method1535() {
        field1294 = 0;
        field1293 = 0;
        field1295 = Statics.field1290;
        field1289 = Statics.field1291;
    }

    @ObfuscatedName("bv.cd(IIII)V")
    public static void method1502(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1290) {
            arg2 = Statics.field1290;
        }
        if (arg3 > Statics.field1291) {
            arg3 = Statics.field1291;
        }
        field1294 = arg0;
        field1293 = arg1;
        field1295 = arg2;
        field1289 = arg3;
    }

    @ObfuscatedName("bv.cy(IIII)V")
    public static void method1505(int arg0, int arg1, int arg2, int arg3) {
        if (field1294 < arg0) {
            field1294 = arg0;
        }
        if (field1293 < arg1) {
            field1293 = arg1;
        }
        if (field1295 > arg2) {
            field1295 = arg2;
        }
        if (field1289 > arg3) {
            field1289 = arg3;
        }
    }

    @ObfuscatedName("bv.cf([I)V")
    public static void method1525(int[] arg0) {
        arg0[0] = field1294;
        arg0[1] = field1293;
        arg0[2] = field1295;
        arg0[3] = field1289;
    }

    @ObfuscatedName("bv.cl([I)V")
    public static void method1519(int[] arg0) {
        field1294 = arg0[0];
        field1293 = arg0[1];
        field1295 = arg0[2];
        field1289 = arg0[3];
    }

    @ObfuscatedName("bv.ch()V")
    public static void method1506() {
        int var0 = 0;
        int var1 = Statics.field1291 * Statics.field1290 - 7;
        while (var0 < var1) {
            Statics.field1292[var0++] = 0;
            Statics.field1292[var0++] = 0;
            Statics.field1292[var0++] = 0;
            Statics.field1292[var0++] = 0;
            Statics.field1292[var0++] = 0;
            Statics.field1292[var0++] = 0;
            Statics.field1292[var0++] = 0;
            Statics.field1292[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1292[var0++] = 0;
        }
    }

    @ObfuscatedName("bv.cr(IIIIII)V")
    public static void method1507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1294) {
            arg2 -= field1294 - arg0;
            arg0 = field1294;
        }
        if (arg1 < field1293) {
            arg3 -= field1293 - arg1;
            arg1 = field1293;
        }
        if (arg0 + arg2 > field1295) {
            arg2 = field1295 - arg0;
        }
        if (arg1 + arg3 > field1289) {
            arg3 = field1289 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1290 - arg2;
        int var9 = Statics.field1290 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1292[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1292[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("bv.cu(IIIII)V")
    public static void method1508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1294) {
            arg2 -= field1294 - arg0;
            arg0 = field1294;
        }
        if (arg1 < field1293) {
            arg3 -= field1293 - arg1;
            arg1 = field1293;
        }
        if (arg0 + arg2 > field1295) {
            arg2 = field1295 - arg0;
        }
        if (arg1 + arg3 > field1289) {
            arg3 = field1289 - arg1;
        }
        int var5 = Statics.field1290 - arg2;
        int var6 = Statics.field1290 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1292[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("bv.cg(IIIIII)V")
    public static void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1294) {
            arg2 -= field1294 - arg0;
            arg0 = field1294;
        }
        if (arg1 < field1293) {
            var6 += (field1293 - arg1) * var7;
            arg3 -= field1293 - arg1;
            arg1 = field1293;
        }
        if (arg0 + arg2 > field1295) {
            arg2 = field1295 - arg0;
        }
        if (arg1 + arg3 > field1289) {
            arg3 = field1289 - arg1;
        }
        int var8 = Statics.field1290 - arg2;
        int var9 = Statics.field1290 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1292[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("bv.ct(IIIII)V")
    public static void method1510(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1504(arg0, arg1, arg2, arg4);
        method1504(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1514(arg0, arg1, arg3, arg4);
        method1514(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("bv.cb(IIIIII)V")
    public static void method1557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1527(arg0, arg1, arg2, arg4, arg5);
        method1527(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1524(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1524(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("bv.cp(IIII)V")
    public static void method1504(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1293 || arg1 >= field1289) {
            return;
        }
        if (arg0 < field1294) {
            arg2 -= field1294 - arg0;
            arg0 = field1294;
        }
        if (arg0 + arg2 > field1295) {
            arg2 = field1295 - arg0;
        }
        int var4 = Statics.field1290 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1292[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("bv.ce(IIIII)V")
    public static void method1527(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1293 || arg1 >= field1289) {
            return;
        }
        if (arg0 < field1294) {
            arg2 -= field1294 - arg0;
            arg0 = field1294;
        }
        if (arg0 + arg2 > field1295) {
            arg2 = field1295 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1290 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1292[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1292[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1292[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1292[var9++] = var14;
        }
    }

    @ObfuscatedName("bv.ca(IIII)V")
    public static void method1514(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1294 || arg0 >= field1295) {
            return;
        }
        if (arg1 < field1293) {
            arg2 -= field1293 - arg1;
            arg1 = field1293;
        }
        if (arg1 + arg2 > field1289) {
            arg2 = field1289 - arg1;
        }
        int var4 = Statics.field1290 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1292[Statics.field1290 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("bv.dv(IIIII)V")
    public static void method1524(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1294 || arg0 >= field1295) {
            return;
        }
        if (arg1 < field1293) {
            arg2 -= field1293 - arg1;
            arg1 = field1293;
        }
        if (arg1 + arg2 > field1289) {
            arg2 = field1289 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1290 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1292[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1292[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1292[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1292[var9] = var14;
            var9 += Statics.field1290;
        }
    }

    @ObfuscatedName("bv.dc(IIIII)V")
    public static void method1515(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1504(arg0, arg1, var5 + 1, arg4);
            } else {
                method1504(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1294) {
                    var8 += (field1294 - arg0) * var10;
                    arg0 = field1294;
                }
                if (var11 >= field1295) {
                    var11 = field1295 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1293 && var12 < field1289) {
                        Statics.field1292[Statics.field1290 * var12 + arg0] = arg4;
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
                if (arg1 < field1293) {
                    var14 += (field1293 - arg1) * var16;
                    arg1 = field1293;
                }
                if (var17 >= field1289) {
                    var17 = field1289 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1294 && var18 < field1295) {
                        Statics.field1292[Statics.field1290 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1514(arg0, arg1, var6 + 1, arg4);
        } else {
            method1514(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("bv.dq(III[I[I)V")
    public static void method1516(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1290 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1292[var7++] = arg2;
            }
            var5 += Statics.field1290;
        }
    }
}
