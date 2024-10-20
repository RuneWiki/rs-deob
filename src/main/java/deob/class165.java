package deob;

@ObfuscatedName("fk")
public class class165 extends class143 {

    @ObfuscatedName("fk.k")
    public static int field2485 = 0;

    @ObfuscatedName("fk.u")
    public static int field2487 = 0;

    @ObfuscatedName("fk.v")
    public static int field2486 = 0;

    @ObfuscatedName("fk.f")
    public static int field2488 = 0;

    @ObfuscatedName("fk.k([III)V")
    public static void method2584(int[] arg0, int arg1, int arg2) {
        Statics.field2482 = arg0;
        Statics.field2483 = arg1;
        Statics.field2484 = arg2;
        method2586(0, 0, arg1, arg2);
    }

    @ObfuscatedName("fk.u()V")
    public static void method2585() {
        field2486 = 0;
        field2485 = 0;
        field2488 = Statics.field2483;
        field2487 = Statics.field2484;
    }

    @ObfuscatedName("fk.v(IIII)V")
    public static void method2586(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field2483) {
            arg2 = Statics.field2483;
        }
        if (arg3 > Statics.field2484) {
            arg3 = Statics.field2484;
        }
        field2486 = arg0;
        field2485 = arg1;
        field2488 = arg2;
        field2487 = arg3;
    }

    @ObfuscatedName("fk.f(IIII)V")
    public static void method2583(int arg0, int arg1, int arg2, int arg3) {
        if (field2486 < arg0) {
            field2486 = arg0;
        }
        if (field2485 < arg1) {
            field2485 = arg1;
        }
        if (field2488 > arg2) {
            field2488 = arg2;
        }
        if (field2487 > arg3) {
            field2487 = arg3;
        }
    }

    @ObfuscatedName("fk.s([I)V")
    public static void method2598(int[] arg0) {
        arg0[0] = field2486;
        arg0[1] = field2485;
        arg0[2] = field2488;
        arg0[3] = field2487;
    }

    @ObfuscatedName("fk.j([I)V")
    public static void method2615(int[] arg0) {
        field2486 = arg0[0];
        field2485 = arg0[1];
        field2488 = arg0[2];
        field2487 = arg0[3];
    }

    @ObfuscatedName("fk.e()V")
    public static void method2590() {
        int var0 = 0;
        int var1 = Statics.field2484 * Statics.field2483 - 7;
        while (var0 < var1) {
            Statics.field2482[var0++] = 0;
            Statics.field2482[var0++] = 0;
            Statics.field2482[var0++] = 0;
            Statics.field2482[var0++] = 0;
            Statics.field2482[var0++] = 0;
            Statics.field2482[var0++] = 0;
            Statics.field2482[var0++] = 0;
            Statics.field2482[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field2482[var0++] = 0;
        }
    }

    @ObfuscatedName("fk.t(IIIIII)V")
    public static void method2591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2486) {
            arg2 -= field2486 - arg0;
            arg0 = field2486;
        }
        if (arg1 < field2485) {
            arg3 -= field2485 - arg1;
            arg1 = field2485;
        }
        if (arg0 + arg2 > field2488) {
            arg2 = field2488 - arg0;
        }
        if (arg1 + arg3 > field2487) {
            arg3 = field2487 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field2483 - arg2;
        int var9 = Statics.field2483 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field2482[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field2482[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("fk.y(IIIII)V")
    public static void method2588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2486) {
            arg2 -= field2486 - arg0;
            arg0 = field2486;
        }
        if (arg1 < field2485) {
            arg3 -= field2485 - arg1;
            arg1 = field2485;
        }
        if (arg0 + arg2 > field2488) {
            arg2 = field2488 - arg0;
        }
        if (arg1 + arg3 > field2487) {
            arg3 = field2487 - arg1;
        }
        int var5 = Statics.field2483 - arg2;
        int var6 = Statics.field2483 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field2482[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("fk.b(IIIIII)V")
    public static void method2593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2486) {
            arg2 -= field2486 - arg0;
            arg0 = field2486;
        }
        if (arg1 < field2485) {
            var6 += (field2485 - arg1) * var7;
            arg3 -= field2485 - arg1;
            arg1 = field2485;
        }
        if (arg0 + arg2 > field2488) {
            arg2 = field2488 - arg0;
        }
        if (arg1 + arg3 > field2487) {
            arg3 = field2487 - arg1;
        }
        int var8 = Statics.field2483 - arg2;
        int var9 = Statics.field2483 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field2482[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("fk.w(IIIII)V")
    public static void method2594(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method2627(arg0, arg1, arg2, arg4);
        method2627(arg0, arg1 + arg3 - 1, arg2, arg4);
        method2604(arg0, arg1, arg3, arg4);
        method2604(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("fk.g(IIIIII)V")
    public static void method2628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method2597(arg0, arg1, arg2, arg4, arg5);
        method2597(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method2599(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method2599(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("fk.p(IIII)V")
    public static void method2627(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2485 || arg1 >= field2487) {
            return;
        }
        if (arg0 < field2486) {
            arg2 -= field2486 - arg0;
            arg0 = field2486;
        }
        if (arg0 + arg2 > field2488) {
            arg2 = field2488 - arg0;
        }
        int var4 = Statics.field2483 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field2482[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("fk.z(IIIII)V")
    public static void method2597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2485 || arg1 >= field2487) {
            return;
        }
        if (arg0 < field2486) {
            arg2 -= field2486 - arg0;
            arg0 = field2486;
        }
        if (arg0 + arg2 > field2488) {
            arg2 = field2488 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field2483 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field2482[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field2482[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field2482[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field2482[var9++] = var14;
        }
    }

    @ObfuscatedName("fk.n(IIII)V")
    public static void method2604(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2486 || arg0 >= field2488) {
            return;
        }
        if (arg1 < field2485) {
            arg2 -= field2485 - arg1;
            arg1 = field2485;
        }
        if (arg1 + arg2 > field2487) {
            arg2 = field2487 - arg1;
        }
        int var4 = Statics.field2483 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field2482[Statics.field2483 * var5 + var4] = arg3;
        }
    }

    @ObfuscatedName("fk.x(IIIII)V")
    public static void method2599(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2486 || arg0 >= field2488) {
            return;
        }
        if (arg1 < field2485) {
            arg2 -= field2485 - arg1;
            arg1 = field2485;
        }
        if (arg1 + arg2 > field2487) {
            arg2 = field2487 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field2483 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field2482[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field2482[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field2482[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field2482[var9] = var14;
            var9 += Statics.field2483;
        }
    }

    @ObfuscatedName("fk.i(IIIII)V")
    public static void method2600(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method2627(arg0, arg1, var5 + 1, arg4);
            } else {
                method2627(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field2486) {
                    var8 += (field2486 - arg0) * var10;
                    arg0 = field2486;
                }
                if (var11 >= field2488) {
                    var11 = field2488 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2485 && var12 < field2487) {
                        Statics.field2482[Statics.field2483 * var12 + arg0] = arg4;
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
                if (arg1 < field2485) {
                    var14 += (field2485 - arg1) * var16;
                    arg1 = field2485;
                }
                if (var17 >= field2487) {
                    var17 = field2487 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2486 && var18 < field2488) {
                        Statics.field2482[Statics.field2483 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method2604(arg0, arg1, var6 + 1, arg4);
        } else {
            method2604(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("fk.m(III[I[I)V")
    public static void method2601(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field2483 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field2482[var7++] = arg2;
            }
            var5 += Statics.field2483;
        }
    }
}
