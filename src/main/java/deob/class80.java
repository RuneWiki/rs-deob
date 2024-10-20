package deob;

@ObfuscatedName("cm")
public class class80 extends class204 {

    @ObfuscatedName("cm.g")
    public static int field1427 = 0;

    @ObfuscatedName("cm.x")
    public static int field1426 = 0;

    @ObfuscatedName("cm.a")
    public static int field1428 = 0;

    @ObfuscatedName("cm.t")
    public static int field1422 = 0;

    @ObfuscatedName("cm.cs([III)V")
    public static void method1655(int[] arg0, int arg1, int arg2) {
        Statics.field1425 = arg0;
        Statics.field1423 = arg1;
        Statics.field1424 = arg2;
        method1679(0, 0, arg1, arg2);
    }

    @ObfuscatedName("cm.cw()V")
    public static void method1656() {
        field1428 = 0;
        field1427 = 0;
        field1422 = Statics.field1423;
        field1426 = Statics.field1424;
    }

    @ObfuscatedName("cm.cu(IIII)V")
    public static void method1679(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field1423) {
            arg2 = Statics.field1423;
        }
        if (arg3 > Statics.field1424) {
            arg3 = Statics.field1424;
        }
        field1428 = arg0;
        field1427 = arg1;
        field1422 = arg2;
        field1426 = arg3;
    }

    @ObfuscatedName("cm.cv(IIII)V")
    public static void method1658(int arg0, int arg1, int arg2, int arg3) {
        if (field1428 < arg0) {
            field1428 = arg0;
        }
        if (field1427 < arg1) {
            field1427 = arg1;
        }
        if (field1422 > arg2) {
            field1422 = arg2;
        }
        if (field1426 > arg3) {
            field1426 = arg3;
        }
    }

    @ObfuscatedName("cm.cr([I)V")
    public static void method1659(int[] arg0) {
        arg0[0] = field1428;
        arg0[1] = field1427;
        arg0[2] = field1422;
        arg0[3] = field1426;
    }

    @ObfuscatedName("cm.cx([I)V")
    public static void method1713(int[] arg0) {
        field1428 = arg0[0];
        field1427 = arg0[1];
        field1422 = arg0[2];
        field1426 = arg0[3];
    }

    @ObfuscatedName("cm.cy()V")
    public static void method1697() {
        int var0 = 0;
        int var1 = Statics.field1424 * Statics.field1423 - 7;
        while (var0 < var1) {
            Statics.field1425[var0++] = 0;
            Statics.field1425[var0++] = 0;
            Statics.field1425[var0++] = 0;
            Statics.field1425[var0++] = 0;
            Statics.field1425[var0++] = 0;
            Statics.field1425[var0++] = 0;
            Statics.field1425[var0++] = 0;
            Statics.field1425[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field1425[var0++] = 0;
        }
    }

    @ObfuscatedName("cm.cf(IIIIII)V")
    public static void method1662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field1428) {
            arg2 -= field1428 - arg0;
            arg0 = field1428;
        }
        if (arg1 < field1427) {
            arg3 -= field1427 - arg1;
            arg1 = field1427;
        }
        if (arg0 + arg2 > field1422) {
            arg2 = field1422 - arg0;
        }
        if (arg1 + arg3 > field1426) {
            arg3 = field1426 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field1423 - arg2;
        int var9 = Statics.field1423 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field1425[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field1425[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("cm.cj(IIIII)V")
    public static void method1663(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1428) {
            arg2 -= field1428 - arg0;
            arg0 = field1428;
        }
        if (arg1 < field1427) {
            arg3 -= field1427 - arg1;
            arg1 = field1427;
        }
        if (arg0 + arg2 > field1422) {
            arg2 = field1422 - arg0;
        }
        if (arg1 + arg3 > field1426) {
            arg3 = field1426 - arg1;
        }
        int var5 = Statics.field1423 - arg2;
        int var6 = Statics.field1423 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field1425[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("cm.cc(IIIIII)V")
    public static void method1664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field1428) {
            arg2 -= field1428 - arg0;
            arg0 = field1428;
        }
        if (arg1 < field1427) {
            var6 += (field1427 - arg1) * var7;
            arg3 -= field1427 - arg1;
            arg1 = field1427;
        }
        if (arg0 + arg2 > field1422) {
            arg2 = field1422 - arg0;
        }
        if (arg1 + arg3 > field1426) {
            arg3 = field1426 - arg1;
        }
        int var8 = Statics.field1423 - arg2;
        int var9 = Statics.field1423 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field1425[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("cm.cl(IIIII)V")
    public static void method1689(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method1671(arg0, arg1, arg2, arg4);
        method1671(arg0, arg1 + arg3 - 1, arg2, arg4);
        method1654(arg0, arg1, arg3, arg4);
        method1654(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("cm.ch(IIIIII)V")
    public static void method1705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method1668(arg0, arg1, arg2, arg4, arg5);
        method1668(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method1670(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method1670(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("cm.ca(IIII)V")
    public static void method1671(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field1427 || arg1 >= field1426) {
            return;
        }
        if (arg0 < field1428) {
            arg2 -= field1428 - arg0;
            arg0 = field1428;
        }
        if (arg0 + arg2 > field1422) {
            arg2 = field1422 - arg0;
        }
        int var4 = Statics.field1423 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1425[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("cm.cp(IIIII)V")
    public static void method1668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field1427 || arg1 >= field1426) {
            return;
        }
        if (arg0 < field1428) {
            arg2 -= field1428 - arg0;
            arg0 = field1428;
        }
        if (arg0 + arg2 > field1422) {
            arg2 = field1422 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1423 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1425[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1425[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1425[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1425[var9++] = var14;
        }
    }

    @ObfuscatedName("cm.cq(IIII)V")
    public static void method1654(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field1428 || arg0 >= field1422) {
            return;
        }
        if (arg1 < field1427) {
            arg2 -= field1427 - arg1;
            arg1 = field1427;
        }
        if (arg1 + arg2 > field1426) {
            arg2 = field1426 - arg1;
        }
        int var4 = Statics.field1423 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field1425[Statics.field1423 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("cm.db(IIIII)V")
    public static void method1670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field1428 || arg0 >= field1422) {
            return;
        }
        if (arg1 < field1427) {
            arg2 -= field1427 - arg1;
            arg1 = field1427;
        }
        if (arg1 + arg2 > field1426) {
            arg2 = field1426 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field1423 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field1425[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field1425[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field1425[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field1425[var9] = var14;
            var9 += Statics.field1423;
        }
    }

    @ObfuscatedName("cm.de(IIIII)V")
    public static void method1701(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method1671(arg0, arg1, var5 + 1, arg4);
            } else {
                method1671(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field1428) {
                    var8 += (field1428 - arg0) * var10;
                    arg0 = field1428;
                }
                if (var11 >= field1422) {
                    var11 = field1422 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field1427 && var12 < field1426) {
                        Statics.field1425[Statics.field1423 * var12 + arg0] = arg4;
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
                if (arg1 < field1427) {
                    var14 += (field1427 - arg1) * var16;
                    arg1 = field1427;
                }
                if (var17 >= field1426) {
                    var17 = field1426 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field1428 && var18 < field1422) {
                        Statics.field1425[Statics.field1423 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method1654(arg0, arg1, var6 + 1, arg4);
        } else {
            method1654(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("cm.dt(III[I[I)V")
    public static void method1672(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field1423 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field1425[var7++] = arg2;
            }
            var5 += Statics.field1423;
        }
    }
}
