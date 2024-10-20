package deob;

@ObfuscatedName("cr")
public class class89 extends class174 {

    @ObfuscatedName("cr.l")
    public static int field1515 = 0;

    @ObfuscatedName("cr.u")
    public static int field1516 = 0;

    @ObfuscatedName("cr.z")
    public static int field1517 = 0;

    @ObfuscatedName("cr.d")
    public static int field1512 = 0;

    @ObfuscatedName("cr.cb([III)V")
    public static void method1741(int[] arg0, int arg1, int arg2) {
        Statics.field1518 = arg0;
        Statics.field1513 = arg1;
        Statics.field1514 = arg2;
        method1743(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cr.cy()V")
    public static void method1742() {
        field1517 = 0;
        field1515 = 0;
        field1512 = Statics.field1513;
        field1516 = Statics.field1514;
    }

    @ObfuscatedName("cr.ca(IIII)V")
    public static void method1743(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1513) {
            arg2 = Statics.field1513;
        }
        if (arg3 > Statics.field1514) {
            arg3 = Statics.field1514;
        }
        field1517 = arg0;
        field1515 = arg1;
        field1512 = arg2;
        field1516 = arg3;
    }

    @ObfuscatedName("cr.ce(IIII)V")
    public static void method1754(int arg0, int arg1, int arg2, int arg3) {
        if (field1517 < arg0) {
            field1517 = arg0;
        }
        if (field1515 < arg1) {
            field1515 = arg1;
        }
        if (field1512 > arg2) {
            field1512 = arg2;
        }
        if (field1516 > arg3) {
            field1516 = arg3;
        }
    }

    @ObfuscatedName("cr.cs([I)V")
    public static void method1745(int[] arg0) {
        arg0[0] = field1517;
        arg0[1] = field1515;
        arg0[2] = field1512;
        arg0[3] = field1516;
    }

    @ObfuscatedName("cr.cq([I)V")
    public static void method1746(int[] arg0) {
        field1517 = arg0[0];
        field1515 = arg0[1];
        field1512 = arg0[2];
        field1516 = arg0[3];
    }

    @ObfuscatedName("cr.cl()V")
    public static void method1747() {
        int var0 = 0;
        int var1 = Statics.field1514 * Statics.field1513 - 7;
        while (var0 < var1) {
            Statics.field1518[var0++] = 0;
            Statics.field1518[var0++] = 0;
            Statics.field1518[var0++] = 0;
            Statics.field1518[var0++] = 0;
            Statics.field1518[var0++] = 0;
            Statics.field1518[var0++] = 0;
            Statics.field1518[var0++] = 0;
            Statics.field1518[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1518[var0++] = 0;
        }
    }

    @ObfuscatedName("cr.cr(IIIIII)V")
    public static void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1517) {
            arg2 -= field1517 - arg0;
            arg0 = field1517;
        }
        if (arg1 < field1515) {
            arg3 -= field1515 - arg1;
            arg1 = field1515;
        }
        if (arg0 + arg2 > field1512) {
            arg2 = field1512 - arg0;
        }
        if (arg1 + arg3 > field1516) {
            arg3 = field1516 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1513 - arg2;
        int var9 = Statics.field1513 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1518[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1518[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cr.cw(IIIII)V")
    public static void method1770(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1517) {
            arg2 -= field1517 - arg0;
            arg0 = field1517;
        }
        if (arg1 < field1515) {
            arg3 -= field1515 - arg1;
            arg1 = field1515;
        }
        if (arg0 + arg2 > field1512) {
            arg2 = field1512 - arg0;
        }
        if (arg1 + arg3 > field1516) {
            arg3 = field1516 - arg1;
        }
        int var5 = Statics.field1513 - arg2;
        int var6 = Statics.field1513 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1518[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cr.cz(IIIIII)V")
    public static void method1784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1517) {
            arg2 -= field1517 - arg0;
            arg0 = field1517;
        }
        if (arg1 < field1515) {
            var6 += (field1515 - arg1) * var7;
            arg3 -= field1515 - arg1;
            arg1 = field1515;
        }
        if (arg0 + arg2 > field1512) {
            arg2 = field1512 - arg0;
        }
        if (arg1 + arg3 > field1516) {
            arg3 = field1516 - arg1;
        }
        int var8 = Statics.field1513 - arg2;
        int var9 = Statics.field1513 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1518[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cr.ch(IIIII)V")
    public static void method1759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1791(arg0, arg1, arg2, arg4);
        method1791(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1755(arg0, arg1, arg3, arg4);
        method1755(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cr.cv(IIIIII)V")
    public static void method1752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1782(arg0, arg1, arg2, arg4, arg5);
        method1782(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1756(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1756(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cr.cm(IIII)V")
    public static void method1791(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1515 || arg1 >= field1516) {
            return;
        }
        if (arg0 < field1517) {
            arg2 -= field1517 - arg0;
            arg0 = field1517;
        }
        if (arg0 + arg2 > field1512) {
            arg2 = field1512 - arg0;
        }
        int var4 = Statics.field1513 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1518[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cr.ck(IIIII)V")
    public static void method1782(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1515 || arg1 >= field1516) {
            return;
        }
        if (arg0 < field1517) {
            arg2 -= field1517 - arg0;
            arg0 = field1517;
        }
        if (arg0 + arg2 > field1512) {
            arg2 = field1512 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1513 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1518[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1518[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1518[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1518[var9++] = var14;
        }
    }

    @ObfuscatedName("cr.cd(IIII)V")
    public static void method1755(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1517 || arg0 >= field1512) {
            return;
        }
        if (arg1 < field1515) {
            arg2 -= field1515 - arg1;
            arg1 = field1515;
        }
        if (arg1 + arg2 > field1516) {
            arg2 = field1516 - arg1;
        }
        int var4 = Statics.field1513 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1518[Statics.field1513 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cr.cn(IIIII)V")
    public static void method1756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1517 || arg0 >= field1512) {
            return;
        }
        if (arg1 < field1515) {
            arg2 -= field1515 - arg1;
            arg1 = field1515;
        }
        if (arg1 + arg2 > field1516) {
            arg2 = field1516 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1513 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1518[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1518[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1518[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1518[var9] = var14;
            var9 += Statics.field1513;
        }
    }

    @ObfuscatedName("cr.cf(IIIII)V")
    public static void method1757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1791(arg0, arg1, var5 + 1, arg4);
            } else {
                method1791(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1517) {
                    var8 += (field1517 - arg0) * var10;
                    arg0 = field1517;
                }
                if (var11 >= field1512) {
                    var11 = field1512 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1515 && var12 < field1516) {
                        Statics.field1518[Statics.field1513 * var12 + arg0] = arg4;
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
                if (arg1 < field1515) {
                    var14 += (field1515 - arg1) * var16;
                    arg1 = field1515;
                }
                if (var17 >= field1516) {
                    var17 = field1516 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1517 && var18 < field1512) {
                        Statics.field1518[Statics.field1513 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1755(arg0, arg1, var6 + 1, arg4);
        } else {
            method1755(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cr.co(III[I[I)V")
    public static void method1753(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1513 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1518[var7++] = arg2;
            }
            var5 += Statics.field1513;
        }
    }
}
