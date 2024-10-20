package deob;

@ObfuscatedName("ct")
public class class89 extends class174 {

    @ObfuscatedName("ct.q")
    public static int field1469 = 0;

    @ObfuscatedName("ct.a")
    public static int field1466 = 0;

    @ObfuscatedName("ct.w")
    public static int field1470 = 0;

    @ObfuscatedName("ct.g")
    public static int field1472 = 0;

    @ObfuscatedName("ct.cs([III)V")
    public static void method1779(int[] arg0, int arg1, int arg2) {
        Statics.field1471 = arg0;
        Statics.field1467 = arg1;
        Statics.field1468 = arg2;
        method1781(0, 0, arg1, arg2);
    }

    @ObfuscatedName("ct.cp()V")
    public static void method1813() {
        field1470 = 0;
        field1469 = 0;
        field1472 = Statics.field1467;
        field1466 = Statics.field1468;
    }

    @ObfuscatedName("ct.cj(IIII)V")
    public static void method1781(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1467) {
            arg2 = Statics.field1467;
        }
        if (arg3 > Statics.field1468) {
            arg3 = Statics.field1468;
        }
        field1470 = arg0;
        field1469 = arg1;
        field1472 = arg2;
        field1466 = arg3;
    }

    @ObfuscatedName("ct.cx(IIII)V")
    public static void method1782(int arg0, int arg1, int arg2, int arg3) {
        if (field1470 < arg0) {
            field1470 = arg0;
        }
        if (field1469 < arg1) {
            field1469 = arg1;
        }
        if (field1472 > arg2) {
            field1472 = arg2;
        }
        if (field1466 > arg3) {
            field1466 = arg3;
        }
    }

    @ObfuscatedName("ct.cr([I)V")
    public static void method1783(int[] arg0) {
        arg0[0] = field1470;
        arg0[1] = field1469;
        arg0[2] = field1472;
        arg0[3] = field1466;
    }

    @ObfuscatedName("ct.ck([I)V")
    public static void method1784(int[] arg0) {
        field1470 = arg0[0];
        field1469 = arg0[1];
        field1472 = arg0[2];
        field1466 = arg0[3];
    }

    @ObfuscatedName("ct.ch()V")
    public static void method1835() {
        int var0 = 0;
        int var1 = Statics.field1468 * Statics.field1467 - 7;
        while (var0 < var1) {
            Statics.field1471[var0++] = 0;
            Statics.field1471[var0++] = 0;
            Statics.field1471[var0++] = 0;
            Statics.field1471[var0++] = 0;
            Statics.field1471[var0++] = 0;
            Statics.field1471[var0++] = 0;
            Statics.field1471[var0++] = 0;
            Statics.field1471[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1471[var0++] = 0;
        }
    }

    @ObfuscatedName("ct.cu(IIIIII)V")
    public static void method1786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1470) {
            arg2 -= field1470 - arg0;
            arg0 = field1470;
        }
        if (arg1 < field1469) {
            arg3 -= field1469 - arg1;
            arg1 = field1469;
        }
        if (arg0 + arg2 > field1472) {
            arg2 = field1472 - arg0;
        }
        if (arg1 + arg3 > field1466) {
            arg3 = field1466 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1467 - arg2;
        int var9 = Statics.field1467 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1471[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1471[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("ct.cq(IIIII)V")
    public static void method1787(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1470) {
            arg2 -= field1470 - arg0;
            arg0 = field1470;
        }
        if (arg1 < field1469) {
            arg3 -= field1469 - arg1;
            arg1 = field1469;
        }
        if (arg0 + arg2 > field1472) {
            arg2 = field1472 - arg0;
        }
        if (arg1 + arg3 > field1466) {
            arg3 = field1466 - arg1;
        }
        int var5 = Statics.field1467 - arg2;
        int var6 = Statics.field1467 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1471[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("ct.co(IIIIII)V")
    public static void method1788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1470) {
            arg2 -= field1470 - arg0;
            arg0 = field1470;
        }
        if (arg1 < field1469) {
            var6 += (field1469 - arg1) * var7;
            arg3 -= field1469 - arg1;
            arg1 = field1469;
        }
        if (arg0 + arg2 > field1472) {
            arg2 = field1472 - arg0;
        }
        if (arg1 + arg3 > field1466) {
            arg3 = field1466 - arg1;
        }
        int var8 = Statics.field1467 - arg2;
        int var9 = Statics.field1467 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1471[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("ct.cm(IIIII)V")
    public static void method1831(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1795(arg0, arg1, arg2, arg4);
        method1795(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1793(arg0, arg1, arg3, arg4);
        method1793(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("ct.cv(IIIIII)V")
    public static void method1823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1832(arg0, arg1, arg2, arg4, arg5);
        method1832(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1789(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1789(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("ct.cz(IIII)V")
    public static void method1795(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1469 || arg1 >= field1466) {
            return;
        }
        if (arg0 < field1470) {
            arg2 -= field1470 - arg0;
            arg0 = field1470;
        }
        if (arg0 + arg2 > field1472) {
            arg2 = field1472 - arg0;
        }
        int var4 = Statics.field1467 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1471[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("ct.df(IIIII)V")
    public static void method1832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1469 || arg1 >= field1466) {
            return;
        }
        if (arg0 < field1470) {
            arg2 -= field1470 - arg0;
            arg0 = field1470;
        }
        if (arg0 + arg2 > field1472) {
            arg2 = field1472 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1467 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1471[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1471[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1471[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1471[var9++] = var14;
        }
    }

    @ObfuscatedName("ct.di(IIII)V")
    public static void method1793(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1470 || arg0 >= field1472) {
            return;
        }
        if (arg1 < field1469) {
            arg2 -= field1469 - arg1;
            arg1 = field1469;
        }
        if (arg1 + arg2 > field1466) {
            arg2 = field1466 - arg1;
        }
        int var4 = Statics.field1467 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1471[Statics.field1467 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("ct.dq(IIIII)V")
    public static void method1789(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1470 || arg0 >= field1472) {
            return;
        }
        if (arg1 < field1469) {
            arg2 -= field1469 - arg1;
            arg1 = field1469;
        }
        if (arg1 + arg2 > field1466) {
            arg2 = field1466 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1467 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1471[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1471[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1471[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1471[var9] = var14;
            var9 += Statics.field1467;
        }
    }

    @ObfuscatedName("ct.dd(IIIII)V")
    public static void method1794(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1795(arg0, arg1, var5 + 1, arg4);
            } else {
                method1795(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1470) {
                    var8 += (field1470 - arg0) * var10;
                    arg0 = field1470;
                }
                if (var11 >= field1472) {
                    var11 = field1472 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1469 && var12 < field1466) {
                        Statics.field1471[Statics.field1467 * var12 + arg0] = arg4;
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
                if (arg1 < field1469) {
                    var14 += (field1469 - arg1) * var16;
                    arg1 = field1469;
                }
                if (var17 >= field1466) {
                    var17 = field1466 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1470 && var18 < field1472) {
                        Statics.field1471[Statics.field1467 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1793(arg0, arg1, var6 + 1, arg4);
        } else {
            method1793(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("ct.dm(III[I[I)V")
    public static void method1809(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1467 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1471[var7++] = arg2;
            }
            var5 += Statics.field1467;
        }
    }
}
