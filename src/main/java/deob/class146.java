package deob;

@ObfuscatedName("co")
public class class146 extends class6 {

    @ObfuscatedName("co.n")
    public static int field2208 = 0;

    @ObfuscatedName("co.i")
    public static int field2212 = 0;

    @ObfuscatedName("co.r")
    public static int field2214 = 0;

    @ObfuscatedName("co.z")
    public static int field2211 = 0;

    @ObfuscatedName("co.co([I)V")
    public static void method2391(int[] arg0) {
        field2214 = arg0[0];
        field2211 = arg0[1];
        field2208 = arg0[2];
        field2212 = arg0[3];
    }

    @ObfuscatedName("co.ck([III)V")
    public static void method2392(int[] arg0, int arg1, int arg2) {
        Statics.field2213 = arg0;
        Statics.field2209 = arg1;
        Statics.field2210 = arg2;
        method2396(0, 0, arg1, arg2);
    }

    @ObfuscatedName("co.cv()V")
    public static void method2393() {
        field2214 = 0;
        field2211 = 0;
        field2208 = Statics.field2209;
        field2212 = Statics.field2210;
    }

    @ObfuscatedName("co.cm(IIII)V")
    public static void method2395(int arg0, int arg1, int arg2, int arg3) {
        if (field2214 < arg0) {
            field2214 = arg0;
        }
        if (field2211 < arg1) {
            field2211 = arg1;
        }
        if (field2208 > arg2) {
            field2208 = arg2;
        }
        if (field2212 > arg3) {
            field2212 = arg3;
        }
    }

    @ObfuscatedName("co.ce(IIII)V")
    public static void method2396(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > Statics.field2209) {
            arg2 = Statics.field2209;
        }
        if (arg3 > Statics.field2210) {
            arg3 = Statics.field2210;
        }
        field2214 = arg0;
        field2211 = arg1;
        field2208 = arg2;
        field2212 = arg3;
    }

    @ObfuscatedName("co.cd([I)V")
    public static void method2397(int[] arg0) {
        arg0[0] = field2214;
        arg0[1] = field2211;
        arg0[2] = field2208;
        arg0[3] = field2212;
    }

    @ObfuscatedName("co.cl(IIIIII)V")
    public static void method2399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field2214) {
            arg2 -= field2214 - arg0;
            arg0 = field2214;
        }
        if (arg1 < field2211) {
            arg3 -= field2211 - arg1;
            arg1 = field2211;
        }
        if (arg0 + arg2 > field2208) {
            arg2 = field2208 - arg0;
        }
        if (arg1 + arg3 > field2212) {
            arg3 = field2212 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = Statics.field2209 - arg2;
        int var9 = Statics.field2209 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = Statics.field2213[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                Statics.field2213[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @ObfuscatedName("co.cs(IIIII)V")
    public static void method2400(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2214) {
            arg2 -= field2214 - arg0;
            arg0 = field2214;
        }
        if (arg1 < field2211) {
            arg3 -= field2211 - arg1;
            arg1 = field2211;
        }
        if (arg0 + arg2 > field2208) {
            arg2 = field2208 - arg0;
        }
        if (arg1 + arg3 > field2212) {
            arg3 = field2212 - arg1;
        }
        int var5 = Statics.field2209 - arg2;
        int var6 = Statics.field2209 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                Statics.field2213[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @ObfuscatedName("co.cr(IIIII)V")
    public static void method2402(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method2404(arg0, arg1, arg2, arg4);
        method2404(arg0, arg1 + arg3 - 1, arg2, arg4);
        method2453(arg0, arg1, arg3, arg4);
        method2453(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @ObfuscatedName("co.ca(IIIIII)V")
    public static void method2403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method2411(arg0, arg1, arg2, arg4, arg5);
        method2411(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method2407(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method2407(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @ObfuscatedName("co.cq(IIII)V")
    public static void method2404(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field2211 || arg1 >= field2212) {
            return;
        }
        if (arg0 < field2214) {
            arg2 -= field2214 - arg0;
            arg0 = field2214;
        }
        if (arg0 + arg2 > field2208) {
            arg2 = field2208 - arg0;
        }
        int var4 = Statics.field2209 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field2213[var4 + var5] = arg3;
        }
    }

    @ObfuscatedName("co.cg(IIIII)V")
    public static void method2407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field2214 || arg0 >= field2208) {
            return;
        }
        if (arg1 < field2211) {
            arg2 -= field2211 - arg1;
            arg1 = field2211;
        }
        if (arg1 + arg2 > field2212) {
            arg2 = field2212 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field2209 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field2213[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field2213[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field2213[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field2213[var9] = var14;
            var9 += Statics.field2209;
        }
    }

    @ObfuscatedName("co.cx(IIIII)V")
    public static void method2408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method2404(arg0, arg1, var5 + 1, arg4);
            } else {
                method2404(arg0 + var5, arg1, -var5 + 1, arg4);
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
                if (arg0 < field2214) {
                    var8 += (field2214 - arg0) * var10;
                    arg0 = field2214;
                }
                if (var11 >= field2208) {
                    var11 = field2208 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field2211 && var12 < field2212) {
                        Statics.field2213[Statics.field2209 * var12 + arg0] = arg4;
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
                if (arg1 < field2211) {
                    var14 += (field2211 - arg1) * var16;
                    arg1 = field2211;
                }
                if (var17 >= field2212) {
                    var17 = field2212 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field2214 && var18 < field2208) {
                        Statics.field2213[Statics.field2209 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method2453(arg0, arg1, var6 + 1, arg4);
        } else {
            method2453(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @ObfuscatedName("co.cf(III[I[I)V")
    public static void method2409(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = Statics.field2209 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                Statics.field2213[var7++] = arg2;
            }
            var5 += Statics.field2209;
        }
    }

    @ObfuscatedName("co.cu(IIIII)V")
    public static void method2411(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field2211 || arg1 >= field2212) {
            return;
        }
        if (arg0 < field2214) {
            arg2 -= field2214 - arg0;
            arg0 = field2214;
        }
        if (arg0 + arg2 > field2208) {
            arg2 = field2208 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = Statics.field2209 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (Statics.field2213[var9] >> 16 & 0xFF) * var5;
            int var12 = (Statics.field2213[var9] >> 8 & 0xFF) * var5;
            int var13 = (Statics.field2213[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            Statics.field2213[var9++] = var14;
        }
    }

    @ObfuscatedName("co.cp(IIIIII)V")
    public static void method2429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        int var7 = 65536 / arg3;
        if (arg0 < field2214) {
            arg2 -= field2214 - arg0;
            arg0 = field2214;
        }
        if (arg1 < field2211) {
            var6 += (field2211 - arg1) * var7;
            arg3 -= field2211 - arg1;
            arg1 = field2211;
        }
        if (arg0 + arg2 > field2208) {
            arg2 = field2208 - arg0;
        }
        if (arg1 + arg3 > field2212) {
            arg3 = field2212 - arg1;
        }
        int var8 = Statics.field2209 - arg2;
        int var9 = Statics.field2209 * arg1 + arg0;
        for (int var10 = -arg3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((arg4 & 0xFF00FF) * var11 + (arg5 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg4 & 0xFF00) * var11 + (arg5 & 0xFF00) * var12 & 0xFF0000) >>> 8;
            for (int var14 = -arg2; var14 < 0; var14++) {
                Statics.field2213[var9++] = var13;
            }
            var9 += var8;
            var6 += var7;
        }
    }

    @ObfuscatedName("co.cc()V")
    public static void method2441() {
        int var0 = 0;
        int var1 = Statics.field2210 * Statics.field2209 - 7;
        while (var0 < var1) {
            Statics.field2213[var0++] = 0;
            Statics.field2213[var0++] = 0;
            Statics.field2213[var0++] = 0;
            Statics.field2213[var0++] = 0;
            Statics.field2213[var0++] = 0;
            Statics.field2213[var0++] = 0;
            Statics.field2213[var0++] = 0;
            Statics.field2213[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            Statics.field2213[var0++] = 0;
        }
    }

    @ObfuscatedName("co.ct(IIII)V")
    public static void method2453(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field2214 || arg0 >= field2208) {
            return;
        }
        if (arg1 < field2211) {
            arg2 -= field2211 - arg1;
            arg1 = field2211;
        }
        if (arg1 + arg2 > field2212) {
            arg2 = field2212 - arg1;
        }
        int var4 = Statics.field2209 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            Statics.field2213[Statics.field2209 * var5 + var4] = arg3;
        }
    }
}
