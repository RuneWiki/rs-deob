package deob;

@ObfuscatedName("cp")
public class class89 extends class174 {

    @ObfuscatedName("cp.k")
    public static int field1499 = 0;

    @ObfuscatedName("cp.y")
    public static int field1500 = 0;

    @ObfuscatedName("cp.g")
    public static int field1497 = 0;

    @ObfuscatedName("cp.e")
    public static int field1502 = 0;

    @ObfuscatedName("cp.cf([III)V")
    public static void method1720(int[] arg0, int arg1, int arg2) {
        Statics.field1496 = arg0;
        Statics.field1501 = arg1;
        Statics.field1498 = arg2;
        method1714(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cp.cp()V")
    public static void method1752() {
        field1497 = 0;
        field1499 = 0;
        field1502 = Statics.field1501;
        field1500 = Statics.field1498;
    }

    @ObfuscatedName("cp.cc(IIII)V")
    public static void method1714(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1501) {
            arg2 = Statics.field1501;
        }
        if (arg3 > Statics.field1498) {
            arg3 = Statics.field1498;
        }
        field1497 = arg0;
        field1499 = arg1;
        field1502 = arg2;
        field1500 = arg3;
    }

    @ObfuscatedName("cp.cd(IIII)V")
    public static void method1718(int arg0, int arg1, int arg2, int arg3) {
        if (field1497 < arg0) {
            field1497 = arg0;
        }
        if (field1499 < arg1) {
            field1499 = arg1;
        }
        if (field1502 > arg2) {
            field1502 = arg2;
        }
        if (field1500 > arg3) {
            field1500 = arg3;
        }
    }

    @ObfuscatedName("cp.cz([I)V")
    public static void method1716(int[] arg0) {
        arg0[0] = field1497;
        arg0[1] = field1499;
        arg0[2] = field1502;
        arg0[3] = field1500;
    }

    @ObfuscatedName("cp.ct([I)V")
    public static void method1715(int[] arg0) {
        field1497 = arg0[0];
        field1499 = arg0[1];
        field1502 = arg0[2];
        field1500 = arg0[3];
    }

    @ObfuscatedName("cp.cv()V")
    public static void method1711() {
        int var0 = 0;
        int var1 = Statics.field1501 * Statics.field1498 - 7;
        while (var0 < var1) {
            Statics.field1496[var0++] = 0;
            Statics.field1496[var0++] = 0;
            Statics.field1496[var0++] = 0;
            Statics.field1496[var0++] = 0;
            Statics.field1496[var0++] = 0;
            Statics.field1496[var0++] = 0;
            Statics.field1496[var0++] = 0;
            Statics.field1496[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1496[var0++] = 0;
        }
    }

    @ObfuscatedName("cp.cl(IIIIII)V")
    public static void method1750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1497) {
            arg2 -= field1497 - arg0;
            arg0 = field1497;
        }
        if (arg1 < field1499) {
            arg3 -= field1499 - arg1;
            arg1 = field1499;
        }
        if (arg0 + arg2 > field1502) {
            arg2 = field1502 - arg0;
        }
        if (arg1 + arg3 > field1500) {
            arg3 = field1500 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1501 - arg2;
        int var9 = Statics.field1501 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1496[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1496[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cp.cx(IIIII)V")
    public static void method1772(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1497) {
            arg2 -= field1497 - arg0;
            arg0 = field1497;
        }
        if (arg1 < field1499) {
            arg3 -= field1499 - arg1;
            arg1 = field1499;
        }
        if (arg0 + arg2 > field1502) {
            arg2 = field1502 - arg0;
        }
        if (arg1 + arg3 > field1500) {
            arg3 = field1500 - arg1;
        }
        int var5 = Statics.field1501 - arg2;
        int var6 = Statics.field1501 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1496[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cp.cu(IIIIII)V")
    public static void method1721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1497) {
            arg2 -= field1497 - arg0;
            arg0 = field1497;
        }
        if (arg1 < field1499) {
            var6 += (field1499 - arg1) * var7;
            arg3 -= field1499 - arg1;
            arg1 = field1499;
        }
        if (arg0 + arg2 > field1502) {
            arg2 = field1502 - arg0;
        }
        if (arg1 + arg3 > field1500) {
            arg3 = field1500 - arg1;
        }
        int var8 = Statics.field1501 - arg2;
        int var9 = Statics.field1501 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1496[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cp.ck(IIIII)V")
    public static void method1722(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1724(arg0, arg1, arg2, arg4);
        method1724(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1765(arg0, arg1, arg3, arg4);
        method1765(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cp.cg(IIIIII)V")
    public static void method1723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1725(arg0, arg1, arg2, arg4, arg5);
        method1725(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1727(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1727(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cp.cb(IIII)V")
    public static void method1724(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1499 || arg1 >= field1500) {
            return;
        }
        if (arg0 < field1497) {
            arg2 -= field1497 - arg0;
            arg0 = field1497;
        }
        if (arg0 + arg2 > field1502) {
            arg2 = field1502 - arg0;
        }
        int var4 = Statics.field1501 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1496[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cp.cm(IIIII)V")
    public static void method1725(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1499 || arg1 >= field1500) {
            return;
        }
        if (arg0 < field1497) {
            arg2 -= field1497 - arg0;
            arg0 = field1497;
        }
        if (arg0 + arg2 > field1502) {
            arg2 = field1502 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1501 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1496[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1496[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1496[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1496[var9++] = var14;
        }
    }

    @ObfuscatedName("cp.cw(IIII)V")
    public static void method1765(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1497 || arg0 >= field1502) {
            return;
        }
        if (arg1 < field1499) {
            arg2 -= field1499 - arg1;
            arg1 = field1499;
        }
        if (arg1 + arg2 > field1500) {
            arg2 = field1500 - arg1;
        }
        int var4 = Statics.field1501 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1496[Statics.field1501 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cp.ce(IIIII)V")
    public static void method1727(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1497 || arg0 >= field1502) {
            return;
        }
        if (arg1 < field1499) {
            arg2 -= field1499 - arg1;
            arg1 = field1499;
        }
        if (arg1 + arg2 > field1500) {
            arg2 = field1500 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1501 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1496[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1496[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1496[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1496[var9] = var14;
            var9 += Statics.field1501;
        }
    }

    @ObfuscatedName("cp.co(IIIII)V")
    public static void method1728(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1724(arg0, arg1, var5 + 1, arg4);
            } else {
                method1724(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1497) {
                    var8 += (field1497 - arg0) * var10;
                    arg0 = field1497;
                }
                if (var11 >= field1502) {
                    var11 = field1502 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1499 && var12 < field1500) {
                        Statics.field1496[Statics.field1501 * var12 + arg0] = arg4;
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
                if (arg1 < field1499) {
                    var14 += (field1499 - arg1) * var16;
                    arg1 = field1499;
                }
                if (var17 >= field1500) {
                    var17 = field1500 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1497 && var18 < field1502) {
                        Statics.field1496[Statics.field1501 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1765(arg0, arg1, var6 + 1, arg4);
        } else {
            method1765(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cp.dw(III[I[I)V")
    public static void method1729(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1501 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1496[var7++] = arg2;
            }
            var5 += Statics.field1501;
        }
    }
}
