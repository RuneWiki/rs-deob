package deob;

@ObfuscatedName("fe")
public final class class175 {

    @ObfuscatedName("fe.k")
    public static class180 field2437 = new class180();

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.b([BI[BII)I")
    public static int method2891(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class180 var5 = field2437;
        synchronized (field2437) {
            field2437.field2455 = arg2;
            field2437.field2456 = arg4;
            field2437.field2458 = arg0;
            field2437.field2459 = 0;
            field2437.field2474 = arg1;
            field2437.field2465 = 0;
            field2437.field2461 = 0;
            field2437.field2457 = 0;
            field2437.field2484 = 0;
            method2893(field2437);
            int var6 = arg1 - field2437.field2474;
            field2437.field2455 = null;
            field2437.field2458 = null;
            return var6;
        }
    }

    @ObfuscatedName("fe.s(Lff;)V")
    public static void method2898(class180 arg0) {
        byte var1 = arg0.field2462;
        int var2 = arg0.field2463;
        int var3 = arg0.field2471;
        int var4 = arg0.field2460;
        int[] var5 = Statics.field17;
        int var6 = arg0.field2468;
        byte[] var7 = arg0.field2458;
        int var8 = arg0.field2459;
        int var9 = arg0.field2474;
        int var10 = var9;
        int var11 = arg0.field2454 + 1;
        label66: while (true) {
            if (var2 > 0) {
                while (true) {
                    if (var9 == 0) {
                        break label66;
                    }
                    if (var2 == 1) {
                        if (var9 == 0) {
                            var2 = 1;
                            break label66;
                        }
                        var7[var8] = var1;
                        var8++;
                        var9--;
                        break;
                    }
                    var7[var8] = var1;
                    var2--;
                    var8++;
                    var9--;
                }
            }
            boolean var12 = true;
            while (var12) {
                var12 = false;
                if (var3 == var11) {
                    var2 = 0;
                    break label66;
                }
                var1 = (byte) var4;
                int var13 = var5[var6];
                byte var14 = (byte) (var13 & 0xFF);
                var6 = var13 >> 8;
                var3++;
                if (var4 != var14) {
                    var4 = var14;
                    if (var9 == 0) {
                        var2 = 1;
                        break label66;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                } else if (var3 == var11) {
                    if (var9 == 0) {
                        var2 = 1;
                        break label66;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                }
            }
            var2 = 2;
            int var16 = var5[var6];
            byte var17 = (byte) (var16 & 0xFF);
            var6 = var16 >> 8;
            var3++;
            if (var3 != var11) {
                if (var4 == var17) {
                    var2 = 3;
                    int var18 = var5[var6];
                    byte var19 = (byte) (var18 & 0xFF);
                    var6 = var18 >> 8;
                    var3++;
                    if (var3 != var11) {
                        if (var4 == var19) {
                            int var20 = var5[var6];
                            byte var21 = (byte) (var20 & 0xFF);
                            int var22 = var20 >> 8;
                            var3++;
                            var2 = (var21 & 0xFF) + 4;
                            int var23 = var5[var22];
                            var4 = (byte) (var23 & 0xFF);
                            var6 = var23 >> 8;
                            var3++;
                        } else {
                            var4 = var19;
                        }
                    }
                } else {
                    var4 = var17;
                }
            }
        }
        int var15 = arg0.field2484;
        arg0.field2484 += var10 - var9;
        if (arg0.field2484 < var15) {
        }
        arg0.field2462 = var1;
        arg0.field2463 = var2;
        arg0.field2471 = var3;
        arg0.field2460 = var4;
        Statics.field17 = var5;
        arg0.field2468 = var6;
        arg0.field2458 = var7;
        arg0.field2459 = var8;
        arg0.field2474 = var9;
    }

    @ObfuscatedName("fe.r(Lff;)V")
    public static void method2893(class180 arg0) {
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        boolean var13 = false;
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;
        boolean var17 = false;
        boolean var18 = false;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        arg0.field2466 = 1;
        if (Statics.field17 == null) {
            Statics.field17 = new int[arg0.field2466 * 100000];
        }
        boolean var23 = true;
        while (true) {
            while (var23) {
                byte var24 = method2900(arg0);
                if (var24 == 23) {
                    return;
                }
                byte var25 = method2900(arg0);
                byte var26 = method2900(arg0);
                byte var27 = method2900(arg0);
                byte var28 = method2900(arg0);
                byte var29 = method2900(arg0);
                byte var30 = method2900(arg0);
                byte var31 = method2900(arg0);
                byte var32 = method2900(arg0);
                byte var33 = method2900(arg0);
                byte var34 = method2895(arg0);
                if (var34 != 0) {
                }
                arg0.field2467 = 0;
                byte var35 = method2900(arg0);
                arg0.field2467 = arg0.field2467 << 8 | var35 & 0xFF;
                byte var36 = method2900(arg0);
                arg0.field2467 = arg0.field2467 << 8 | var36 & 0xFF;
                byte var37 = method2900(arg0);
                arg0.field2467 = arg0.field2467 << 8 | var37 & 0xFF;
                for (int var38 = 0; var38 < 16; var38++) {
                    byte var39 = method2895(arg0);
                    if (var39 == 1) {
                        arg0.field2475[var38] = true;
                    } else {
                        arg0.field2475[var38] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field2464[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field2475[var41]) {
                        for (int var42 = 0; var42 < 16; var42++) {
                            byte var43 = method2895(arg0);
                            if (var43 == 1) {
                                arg0.field2464[var41 * 16 + var42] = true;
                            }
                        }
                    }
                }
                method2897(arg0);
                int var44 = arg0.field2473 + 2;
                int var45 = method2896(3, arg0);
                int var46 = method2896(15, arg0);
                for (int var47 = 0; var47 < var46; var47++) {
                    int var48 = 0;
                    while (true) {
                        byte var49 = method2895(arg0);
                        if (var49 == 0) {
                            arg0.field2480[var47] = (byte) var48;
                            break;
                        }
                        var48++;
                    }
                }
                byte[] var50 = new byte[6];
                byte var51 = 0;
                while (var51 < var45) {
                    var50[var51] = var51++;
                }
                for (int var52 = 0; var52 < var46; var52++) {
                    byte var53 = arg0.field2480[var52];
                    byte var54 = var50[var53];
                    while (var53 > 0) {
                        var50[var53] = var50[var53 - 1];
                        var53--;
                    }
                    var50[0] = var54;
                    arg0.field2479[var52] = var54;
                }
                for (int var55 = 0; var55 < var45; var55++) {
                    int var56 = method2896(5, arg0);
                    for (int var57 = 0; var57 < var44; var57++) {
                        while (true) {
                            byte var58 = method2895(arg0);
                            if (var58 == 0) {
                                arg0.field2486[var55][var57] = (byte) var56;
                                break;
                            }
                            byte var59 = method2895(arg0);
                            if (var59 == 0) {
                                var56++;
                            } else {
                                var56--;
                            }
                        }
                    }
                }
                for (int var60 = 0; var60 < var45; var60++) {
                    byte var61 = 32;
                    byte var62 = 0;
                    for (int var63 = 0; var63 < var44; var63++) {
                        if (arg0.field2486[var60][var63] > var62) {
                            var62 = arg0.field2486[var60][var63];
                        }
                        if (arg0.field2486[var60][var63] < var61) {
                            var61 = arg0.field2486[var60][var63];
                        }
                    }
                    method2899(arg0.field2482[var60], arg0.field2483[var60], arg0.field2485[var60], arg0.field2486[var60], var61, var62, var44);
                    arg0.field2481[var60] = var61;
                }
                int var64 = arg0.field2473 + 1;
                int var65 = -1;
                byte var66 = 0;
                for (int var67 = 0; var67 <= 255; var67++) {
                    arg0.field2470[var67] = 0;
                }
                int var68 = 4095;
                for (int var69 = 15; var69 >= 0; var69--) {
                    for (int var70 = 15; var70 >= 0; var70--) {
                        arg0.field2450[var68] = (byte) (var69 * 16 + var70);
                        var68--;
                    }
                    arg0.field2478[var69] = var68 + 1;
                }
                int var71 = 0;
                if (var66 == 0) {
                    var65++;
                    var66 = 50;
                    byte var72 = arg0.field2479[var65];
                    var19 = arg0.field2481[var72];
                    var20 = arg0.field2482[var72];
                    var22 = arg0.field2485[var72];
                    var21 = arg0.field2483[var72];
                }
                int var103 = var66 - 1;
                int var73 = var19;
                int var74;
                byte var102;
                for (var74 = method2896(var19, arg0); var74 > var20[var73]; var74 = var74 << 1 | var102) {
                    var73++;
                    var102 = method2895(arg0);
                }
                int var75 = var22[var74 - var21[var73]];
                while (true) {
                    while (var64 != var75) {
                        if (var75 == 0 || var75 == 1) {
                            int var95 = -1;
                            int var96 = 1;
                            do {
                                if (var75 == 0) {
                                    var95 += var96;
                                } else if (var75 == 1) {
                                    var95 += var96 * 2;
                                }
                                var96 *= 2;
                                if (var103 == 0) {
                                    var65++;
                                    var103 = 50;
                                    byte var97 = arg0.field2479[var65];
                                    var19 = arg0.field2481[var97];
                                    var20 = arg0.field2482[var97];
                                    var22 = arg0.field2485[var97];
                                    var21 = arg0.field2483[var97];
                                }
                                var103--;
                                int var98 = var19;
                                int var99;
                                byte var101;
                                for (var99 = method2896(var19, arg0); var99 > var20[var98]; var99 = var99 << 1 | var101) {
                                    var98++;
                                    var101 = method2895(arg0);
                                }
                                var75 = var22[var99 - var21[var98]];
                            } while (var75 == 0 || var75 == 1);
                            var95++;
                            byte var100 = arg0.field2476[arg0.field2450[arg0.field2478[0]] & 0xFF];
                            arg0.field2470[var100 & 0xFF] += var95;
                            while (var95 > 0) {
                                Statics.field17[var71] = var100 & 0xFF;
                                var71++;
                                var95--;
                            }
                        } else {
                            int var81 = var75 - 1;
                            byte var83;
                            if (var81 < 16) {
                                int var82 = arg0.field2478[0];
                                var83 = arg0.field2450[var81 + var82];
                                while (var81 > 3) {
                                    int var84 = var81 + var82;
                                    arg0.field2450[var84] = arg0.field2450[var84 - 1];
                                    arg0.field2450[var84 - 1] = arg0.field2450[var84 - 2];
                                    arg0.field2450[var84 - 2] = arg0.field2450[var84 - 3];
                                    arg0.field2450[var84 - 3] = arg0.field2450[var84 - 4];
                                    var81 -= 4;
                                }
                                while (var81 > 0) {
                                    arg0.field2450[var81 + var82] = arg0.field2450[var81 + var82 - 1];
                                    var81--;
                                }
                                arg0.field2450[var82] = var83;
                            } else {
                                int var85 = var81 / 16;
                                int var86 = var81 % 16;
                                int var87 = arg0.field2478[var85] + var86;
                                var83 = arg0.field2450[var87];
                                while (var87 > arg0.field2478[var85]) {
                                    arg0.field2450[var87] = arg0.field2450[var87 - 1];
                                    var87--;
                                }
                                int var10002 = arg0.field2478[var85]++;
                                while (var85 > 0) {
                                    var10002 = arg0.field2478[var85]--;
                                    arg0.field2450[arg0.field2478[var85]] = arg0.field2450[arg0.field2478[var85 - 1] + 16 - 1];
                                    var85--;
                                }
                                var10002 = arg0.field2478[0]--;
                                arg0.field2450[arg0.field2478[0]] = var83;
                                if (arg0.field2478[0] == 0) {
                                    int var88 = 4095;
                                    for (int var89 = 15; var89 >= 0; var89--) {
                                        for (int var90 = 15; var90 >= 0; var90--) {
                                            arg0.field2450[var88] = arg0.field2450[arg0.field2478[var89] + var90];
                                            var88--;
                                        }
                                        arg0.field2478[var89] = var88 + 1;
                                    }
                                }
                            }
                            arg0.field2470[arg0.field2476[var83 & 0xFF] & 0xFF]++;
                            Statics.field17[var71] = arg0.field2476[var83 & 0xFF] & 0xFF;
                            var71++;
                            if (var103 == 0) {
                                var65++;
                                var103 = 50;
                                byte var91 = arg0.field2479[var65];
                                var19 = arg0.field2481[var91];
                                var20 = arg0.field2482[var91];
                                var22 = arg0.field2485[var91];
                                var21 = arg0.field2483[var91];
                            }
                            var103--;
                            int var92 = var19;
                            int var93;
                            byte var94;
                            for (var93 = method2896(var19, arg0); var93 > var20[var92]; var93 = var93 << 1 | var94) {
                                var92++;
                                var94 = method2895(arg0);
                            }
                            var75 = var22[var93 - var21[var92]];
                        }
                    }
                    arg0.field2463 = 0;
                    arg0.field2462 = 0;
                    arg0.field2472[0] = 0;
                    for (int var76 = 1; var76 <= 256; var76++) {
                        arg0.field2472[var76] = arg0.field2470[var76 - 1];
                    }
                    for (int var77 = 1; var77 <= 256; var77++) {
                        arg0.field2472[var77] += arg0.field2472[var77 - 1];
                    }
                    for (int var78 = 0; var78 < var71; var78++) {
                        byte var79 = (byte) (Statics.field17[var78] & 0xFF);
                        Statics.field17[arg0.field2472[var79 & 0xFF]] |= var78 << 8;
                        arg0.field2472[var79 & 0xFF]++;
                    }
                    arg0.field2468 = Statics.field17[arg0.field2467] >> 8;
                    arg0.field2471 = 0;
                    arg0.field2468 = Statics.field17[arg0.field2468];
                    arg0.field2460 = (byte) (arg0.field2468 & 0xFF);
                    arg0.field2468 >>= 0x8;
                    arg0.field2471++;
                    arg0.field2454 = var71;
                    method2898(arg0);
                    if (arg0.field2471 == arg0.field2454 + 1 && arg0.field2463 == 0) {
                        var23 = true;
                        break;
                    }
                    var23 = false;
                    break;
                }
            }
            return;
        }
    }

    @ObfuscatedName("fe.g(Lff;)B")
    public static byte method2900(class180 arg0) {
        return (byte) method2896(8, arg0);
    }

    @ObfuscatedName("fe.x(Lff;)B")
    public static byte method2895(class180 arg0) {
        return (byte) method2896(1, arg0);
    }

    @ObfuscatedName("fe.f(ILff;)I")
    public static int method2896(int arg0, class180 arg1) {
        while (arg1.field2465 < arg0) {
            arg1.field2461 = arg1.field2461 << 8 | arg1.field2455[arg1.field2456] & 0xFF;
            arg1.field2465 += 8;
            arg1.field2456++;
            arg1.field2457++;
            if (arg1.field2457 == 0) {
            }
        }
        int var2 = arg1.field2461 >> arg1.field2465 - arg0 & (0x1 << arg0) - 1;
        arg1.field2465 -= arg0;
        return var2;
    }

    @ObfuscatedName("fe.u(Lff;)V")
    public static void method2897(class180 arg0) {
        arg0.field2473 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field2464[var1]) {
                arg0.field2476[arg0.field2473] = (byte) var1;
                arg0.field2473++;
            }
        }
    }

    @ObfuscatedName("fe.t([I[I[I[BIII)V")
    public static void method2899(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        for (int var8 = arg4; var8 <= arg5; var8++) {
            for (int var9 = 0; var9 < arg6; var9++) {
                if (arg3[var9] == var8) {
                    arg2[var7] = var9;
                    var7++;
                }
            }
        }
        for (int var10 = 0; var10 < 23; var10++) {
            arg1[var10] = 0;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            arg1[arg3[var11] + 1]++;
        }
        for (int var12 = 1; var12 < 23; var12++) {
            arg1[var12] += arg1[var12 - 1];
        }
        for (int var13 = 0; var13 < 23; var13++) {
            arg0[var13] = 0;
        }
        int var14 = 0;
        for (int var15 = arg4; var15 <= arg5; var15++) {
            int var16 = arg1[var15 + 1] - arg1[var15] + var14;
            arg0[var15] = var16 - 1;
            var14 = var16 << 1;
        }
        for (int var17 = arg4 + 1; var17 <= arg5; var17++) {
            arg1[var17] = (arg0[var17 - 1] + 1 << 1) - arg1[var17];
        }
    }
}
