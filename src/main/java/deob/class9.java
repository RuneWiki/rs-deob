package deob;

@ObfuscatedName("n")
public final class class9 {

    @ObfuscatedName("n.p")
    public static int[][][] field119 = new int[4][105][105];

    @ObfuscatedName("n.e")
    public static byte[][][] field141 = new byte[4][104][104];

    @ObfuscatedName("n.a")
    public static int field120 = 99;

    @ObfuscatedName("n.x")
    public static final int[] field128 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("n.s")
    public static final int[] field118 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("n.o")
    public static final int[] field142 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("n.g")
    public static final int[] field126 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("n.d")
    public static final int[] field132 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("n.t")
    public static final int[] field133 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("n.b")
    public static int field134 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("n.c")
    public static int field131 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.p(B)V")
    public static void method122() {
        Statics.field121 = (byte[][][]) null;
        Statics.field739 = (byte[][][]) null;
        Statics.field277 = (byte[][][]) null;
        Statics.field122 = (byte[][][]) null;
        Statics.field2026 = (int[][][]) null;
        Statics.field123 = (byte[][][]) null;
        Statics.field124 = (int[][]) null;
        Statics.field276 = null;
        Statics.field125 = null;
        Statics.field1178 = null;
        Statics.field139 = null;
        Statics.field130 = null;
    }

    @ObfuscatedName("b.e(IIIII)V")
    public static final void method235(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field123[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field119[0][var5][var4] = field119[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field119[0][var5][var4] = field119[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field119[0][var5][var4] = field119[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field119[0][var5][var4] = field119[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.a([BIIII[Ldr;B)V")
    public static final void method9(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class130[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2057[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class127 var9 = new class127(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method160(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("di.h([BIIIIIII[Ldr;I)V")
    public static final void method2472(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class130[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2057[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class127 var11 = new class127(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class161.method2223(var13 & 0x7, var14 & 0x7, arg7);
                        int var19 = var13 & 0x7;
                        int var20 = var14 & 0x7;
                        int var22 = arg7 & 0x3;
                        int var23;
                        if (var22 == 0) {
                            var23 = var20;
                        } else if (var22 == 1) {
                            var23 = 7 - var19;
                        } else if (var22 == 2) {
                            var23 = 7 - var20;
                        } else {
                            var23 = var19;
                        }
                        method160(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method160(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.y(Ldj;IIIIIII)V")
    public static final void method160(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2494();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2494();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2494();
                }
            }
            return;
        }
        field141[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2494();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field119[0][arg2][arg3] = -method2405(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field119[arg1][arg2][arg3] = field119[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2494();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field119[0][arg2][arg3] = -var8 * 8;
                } else {
                    field119[arg1][arg2][arg3] = field119[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field739[arg1][arg2][arg3] = arg0.method2604();
                Statics.field277[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field122[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field141[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field121[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("de.j([BIILcv;[Ldr;I)V")
    public static final void method2222(byte[] arg0, int arg1, int arg2, class95 arg3, class130[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2507();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2507();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2494();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field141[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class130 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method147(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("f.l([BIIIIIIILcv;[Ldr;I)V")
    public static final void method64(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, class130[] arg9) {
        class127 var10 = new class127(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2507();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2507();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2494();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class32 var21 = class32.method2811(var11);
                    int var22 = arg2 + class161.method2152(var16 & 0x7, var15 & 0x7, arg7, var21.field822, var21.field807, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field822;
                    int var28 = var21.field807;
                    if ((var20 & 0x1) == 1) {
                        int var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var30 = arg7 & 0x3;
                    int var31;
                    if (var30 == 0) {
                        var31 = var25;
                    } else if (var30 == 1) {
                        var31 = 7 - var24 - (var27 - 1);
                    } else if (var30 == 2) {
                        var31 = 7 - var25 - (var28 - 1);
                    } else {
                        var31 = var24;
                    }
                    int var32 = arg3 + var31;
                    if (var22 > 0 && var32 > 0 && var22 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field141[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class130 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method147(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.f(IIIIIILcv;Ldr;I)V")
    public static final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field471 && (field141[0][arg1][arg2] & 0x2) == 0) {
            if ((field141[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field141[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field141[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field521 != var8) {
                return;
            }
        }
        if (arg0 < field120) {
            field120 = arg0;
        }
        class32 var9 = class32.method2811(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field807;
            var11 = var9.field822;
        } else {
            var10 = var9.field822;
            var11 = var9.field807;
        }
        int var12;
        int var13;
        if (arg1 + var10 <= 104) {
            var12 = (var10 >> 1) + arg1;
            var13 = (var10 + 1 >> 1) + arg1;
        } else {
            var12 = arg1;
            var13 = arg1 + 1;
        }
        int var14;
        int var15;
        if (arg2 + var11 <= 104) {
            var14 = (var11 >> 1) + arg2;
            var15 = (var11 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int[][] var16 = field119[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field851 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field847 == 1) {
            var21 += 256;
        }
        if (var9.method667()) {
            class7.method45(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field471 || var9.field851 != 0 || var9.field824 == 1 || var9.field812) {
                class94 var22;
                if (var9.field830 == -1 && var9.field846 == null) {
                    var22 = var9.method650(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field830, true, (class94) null);
                }
                arg6.method1895(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field824 == 1 && arg7 != null) {
                    arg7.method2753(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var45;
            if (var9.field830 == -1 && var9.field846 == null) {
                var45 = var9.method650(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            if (var45 != null && arg6.method1899(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field838) {
                int var46 = 15;
                if (var45 instanceof class112) {
                    var46 = ((class112) var45).method2262() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field123[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field123[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method2723(arg1, arg2, var10, var11, var9.field825);
            }
        } else if (arg5 >= 12) {
            class94 var23;
            if (var9.field830 == -1 && var9.field846 == null) {
                var23 = var9.method650(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1899(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2026[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method2723(arg1, arg2, var10, var11, var9.field825);
            }
        } else if (arg5 == 0) {
            class94 var24;
            if (var9.field830 == -1 && var9.field846 == null) {
                var24 = var9.method650(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1897(arg0, arg1, arg2, var17, var24, (class94) null, field128[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field838) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field829) {
                    Statics.field2026[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field838) {
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field829) {
                    Statics.field2026[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field838) {
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field829) {
                    Statics.field2026[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field838) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field829) {
                    Statics.field2026[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method2722(arg1, arg2, arg5, arg4, var9.field825);
            }
            if (var9.field813 != 16) {
                arg6.method1889(arg0, arg1, arg2, var9.field813);
            }
        } else if (arg5 == 1) {
            class94 var25;
            if (var9.field830 == -1 && var9.field846 == null) {
                var25 = var9.method650(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1897(arg0, arg1, arg2, var17, var25, (class94) null, field118[arg4], 0, var20, var21);
            if (var9.field838) {
                if (arg4 == 0) {
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method2722(arg1, arg2, arg5, arg4, var9.field825);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field830 == -1 && var9.field846 == null) {
                var27 = var9.method650(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method650(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field830, true, (class94) null);
                var28 = new class14(arg3, 2, var26, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1897(arg0, arg1, arg2, var17, var27, var28, field128[arg4], field128[var26], var20, var21);
            if (var9.field829) {
                if (arg4 == 0) {
                    Statics.field2026[arg0][arg1][arg2] |= 0x249;
                    Statics.field2026[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2026[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2026[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2026[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2026[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2026[arg0][arg1][arg2] |= 0x492;
                    Statics.field2026[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method2722(arg1, arg2, arg5, arg4, var9.field825);
            }
            if (var9.field813 != 16) {
                arg6.method1889(arg0, arg1, arg2, var9.field813);
            }
        } else if (arg5 == 3) {
            class94 var29;
            if (var9.field830 == -1 && var9.field846 == null) {
                var29 = var9.method650(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1897(arg0, arg1, arg2, var17, var29, (class94) null, field118[arg4], 0, var20, var21);
            if (var9.field838) {
                if (arg4 == 0) {
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method2722(arg1, arg2, arg5, arg4, var9.field825);
            }
        } else if (arg5 == 9) {
            class94 var30;
            if (var9.field830 == -1 && var9.field846 == null) {
                var30 = var9.method650(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1899(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method2723(arg1, arg2, var10, var11, var9.field825);
            }
            if (var9.field813 != 16) {
                arg6.method1889(arg0, arg1, arg2, var9.field813);
            }
        } else if (arg5 == 4) {
            class94 var31;
            if (var9.field830 == -1 && var9.field846 == null) {
                var31 = var9.method650(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1898(arg0, arg1, arg2, var17, var31, (class94) null, field128[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1978(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class32.method2811(var33 >> 14 & 0x7FFF).field813;
            }
            class94 var34;
            if (var9.field830 == -1 && var9.field846 == null) {
                var34 = var9.method650(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1898(arg0, arg1, arg2, var17, var34, (class94) null, field128[arg4], 0, field142[arg4] * var32, field126[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1978(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method2811(var36 >> 14 & 0x7FFF).field813 / 2;
            }
            class94 var37;
            if (var9.field830 == -1 && var9.field846 == null) {
                var37 = var9.method650(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1898(arg0, arg1, arg2, var17, var37, (class94) null, 256, arg4, field132[arg4] * var35, field133[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class94 var39;
            if (var9.field830 == -1 && var9.field846 == null) {
                var39 = var9.method650(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1898(arg0, arg1, arg2, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1978(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class32.method2811(var41 >> 14 & 0x7FFF).field813 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field830 == -1 && var9.field846 == null) {
                var43 = var9.method650(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method650(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field830, true, (class94) null);
                var44 = new class14(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field830, true, (class94) null);
            }
            arg6.method1898(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field132[arg4] * var40, field133[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("dj.n(Lcv;[Ldr;B)V")
    public static final void method2601(class95 arg0, class130[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field141[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field141[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2728(var3, var4);
                        }
                    }
                }
            }
        }
        field134 += (int) (Math.random() * 5.0D) - 2;
        if (field134 < -8) {
            field134 = -8;
        }
        if (field134 > 8) {
            field134 = 8;
        }
        field131 += (int) (Math.random() * 5.0D) - 2;
        if (field131 < -16) {
            field131 = -16;
        }
        if (field131 > 16) {
            field131 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field123[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field119[var6][var11 + 1][var10] - field119[var6][var11 - 1][var10];
                    int var13 = field119[var6][var11][var10 + 1] - field119[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field124[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field276[var20] = 0;
                Statics.field125[var20] = 0;
                Statics.field1178[var20] = 0;
                Statics.field139[var20] = 0;
                Statics.field130[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field121[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class33 var26 = (class33) class33.field861.method3266((long) var25);
                            class33 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field867.method3048(1, var25);
                                class33 var29 = new class33();
                                if (var28 != null) {
                                    var29.method702(new class127(var28), var25);
                                }
                                var29.method696();
                                class33.field861.method3268(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field276[var22] += var27.field863;
                            Statics.field125[var22] += var27.field864;
                            Statics.field1178[var22] += var27.field865;
                            Statics.field139[var22] += var27.field866;
                            var10002 = Statics.field130[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field121[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class33 var34 = (class33) class33.field861.method3266((long) var33);
                            class33 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field867.method3048(1, var33);
                                class33 var37 = new class33();
                                if (var36 != null) {
                                    var37.method702(new class127(var36), var33);
                                }
                                var37.method696();
                                class33.field861.method3268(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field276[var22] -= var35.field863;
                            Statics.field125[var22] -= var35.field864;
                            Statics.field1178[var22] -= var35.field865;
                            Statics.field139[var22] -= var35.field866;
                            var10002 = Statics.field130[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var39 = 0;
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    for (int var44 = -5; var44 < 109; var44++) {
                        int var45 = var44 + 5;
                        if (var45 >= 0 && var45 < 104) {
                            var39 += Statics.field276[var45];
                            var40 += Statics.field125[var45];
                            var41 += Statics.field1178[var45];
                            var42 += Statics.field139[var45];
                            var43 += Statics.field130[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field276[var46];
                            var40 -= Statics.field125[var46];
                            var41 -= Statics.field1178[var46];
                            var42 -= Statics.field139[var46];
                            var43 -= Statics.field130[var46];
                        }
                        if (var44 >= 1 && var44 < 103) {
                            if (client.field471 && (field141[0][var21][var44] & 0x2) == 0) {
                                if ((field141[var6][var21][var44] & 0x10) != 0) {
                                    continue;
                                }
                                int var47;
                                if ((field141[var6][var21][var44] & 0x8) != 0) {
                                    var47 = 0;
                                } else if (var6 <= 0 || (field141[1][var21][var44] & 0x2) == 0) {
                                    var47 = var6;
                                } else {
                                    var47 = var6 - 1;
                                }
                                if (client.field521 != var47) {
                                    continue;
                                }
                            }
                            if (var6 < field120) {
                                field120 = var6;
                            }
                            int var48 = Statics.field121[var6][var21][var44] & 0xFF;
                            int var49 = Statics.field739[var6][var21][var44] & 0xFF;
                            if (var48 > 0 || var49 > 0) {
                                int var50 = field119[var6][var21][var44];
                                int var51 = field119[var6][var21 + 1][var44];
                                int var52 = field119[var6][var21 + 1][var44 + 1];
                                int var53 = field119[var6][var21][var44 + 1];
                                int var54 = Statics.field124[var21][var44];
                                int var55 = Statics.field124[var21 + 1][var44];
                                int var56 = Statics.field124[var21 + 1][var44 + 1];
                                int var57 = Statics.field124[var21][var44 + 1];
                                int var58 = -1;
                                int var59 = -1;
                                if (var48 > 0) {
                                    int var60 = var39 * 256 / var42;
                                    int var61 = var40 / var43;
                                    int var62 = var41 / var43;
                                    var58 = method2371(var60, var61, var62);
                                    int var63 = field134 + var60 & 0xFF;
                                    int var64 = field131 + var62;
                                    if (var64 < 0) {
                                        var64 = 0;
                                    } else if (var64 > 255) {
                                        var64 = 255;
                                    }
                                    var59 = method2371(var63, var61, var64);
                                }
                                if (var6 > 0) {
                                    boolean var65 = true;
                                    if (var48 == 0 && Statics.field277[var6][var21][var44] != 0) {
                                        var65 = false;
                                    }
                                    if (var49 > 0 && !class37.method754(var49 - 1).field932) {
                                        var65 = false;
                                    }
                                    if (var65 && var50 == var51 && var50 == var52 && var50 == var53) {
                                        Statics.field2026[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var66 = 0;
                                if (var59 != -1) {
                                    var66 = class104.field1783[method2985(var59, 96)];
                                }
                                if (var49 == 0) {
                                    arg0.method1894(var6, var21, var44, 0, 0, -1, var50, var51, var52, var53, method2985(var58, var54), method2985(var58, var55), method2985(var58, var56), method2985(var58, var57), 0, 0, 0, 0, var66, 0);
                                } else {
                                    int var67 = Statics.field277[var6][var21][var44] + 1;
                                    byte var68 = Statics.field122[var6][var21][var44];
                                    class37 var69 = class37.method754(var49 - 1);
                                    int var70 = var69.field937;
                                    int var71;
                                    int var72;
                                    if (var70 >= 0) {
                                        var71 = Statics.field1767.method2225(var70);
                                        var72 = -1;
                                    } else if (var69.field930 == 16711935) {
                                        var72 = -2;
                                        var70 = -1;
                                        var71 = -2;
                                    } else {
                                        var72 = method2371(var69.field935, var69.field936, var69.field929);
                                        int var73 = field134 + var69.field935 & 0xFF;
                                        int var74 = field131 + var69.field929;
                                        if (var74 < 0) {
                                            var74 = 0;
                                        } else if (var74 > 255) {
                                            var74 = 255;
                                        }
                                        var71 = method2371(var73, var69.field936, var74);
                                    }
                                    int var75 = 0;
                                    if (var71 != -2) {
                                        var75 = class104.field1783[method222(var71, 96)];
                                    }
                                    if (var69.field938 != -1) {
                                        int var76 = field134 + var69.field931 & 0xFF;
                                        int var77 = field131 + var69.field940;
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = method2371(var76, var69.field939, var77);
                                        var75 = class104.field1783[method222(var78, 96)];
                                    }
                                    arg0.method1894(var6, var21, var44, var67, var68, var70, var50, var51, var52, var53, method2985(var58, var54), method2985(var58, var55), method2985(var58, var56), method2985(var58, var57), method222(var72, var54), method222(var72, var55), method222(var72, var56), method222(var72, var57), var66, var75);
                                }
                            }
                        }
                    }
                }
            }
            for (int var79 = 1; var79 < 103; var79++) {
                for (int var80 = 1; var80 < 103; var80++) {
                    int var85;
                    if ((field141[var6][var80][var79] & 0x8) != 0) {
                        var85 = 0;
                    } else if (var6 <= 0 || (field141[1][var80][var79] & 0x2) == 0) {
                        var85 = var6;
                    } else {
                        var85 = var6 - 1;
                    }
                    arg0.method1893(var6, var80, var79, var85);
                }
            }
            Statics.field121[var6] = (byte[][]) null;
            Statics.field739[var6] = (byte[][]) null;
            Statics.field277[var6] = (byte[][]) null;
            Statics.field122[var6] = (byte[][]) null;
            Statics.field123[var6] = (byte[][]) null;
        }
        arg0.method1919(-50, -10, -50);
        for (int var86 = 0; var86 < 104; var86++) {
            for (int var87 = 0; var87 < 104; var87++) {
                if ((field141[1][var86][var87] & 0x2) == 2) {
                    arg0.method1891(var86, var87);
                }
            }
        }
        int var88 = 1;
        int var89 = 2;
        int var90 = 4;
        for (int var91 = 0; var91 < 4; var91++) {
            if (var91 > 0) {
                var88 <<= 0x3;
                var89 <<= 0x3;
                var90 <<= 0x3;
            }
            for (int var92 = 0; var92 <= var91; var92++) {
                for (int var93 = 0; var93 <= 104; var93++) {
                    for (int var94 = 0; var94 <= 104; var94++) {
                        if ((Statics.field2026[var92][var94][var93] & var88) != 0) {
                            int var95 = var93;
                            int var96 = var93;
                            int var97 = var92;
                            int var98 = var92;
                            while (var95 > 0 && (Statics.field2026[var92][var94][var95 - 1] & var88) != 0) {
                                var95--;
                            }
                            while (var96 < 104 && (Statics.field2026[var92][var94][var96 + 1] & var88) != 0) {
                                var96++;
                            }
                            label369: while (var97 > 0) {
                                for (int var99 = var95; var99 <= var96; var99++) {
                                    if ((Statics.field2026[var97 - 1][var94][var99] & var88) == 0) {
                                        break label369;
                                    }
                                }
                                var97--;
                            }
                            label358: while (var98 < var91) {
                                for (int var100 = var95; var100 <= var96; var100++) {
                                    if ((Statics.field2026[var98 + 1][var94][var100] & var88) == 0) {
                                        break label358;
                                    }
                                }
                                var98++;
                            }
                            int var101 = (var98 + 1 - var97) * (var96 - var95 + 1);
                            if (var101 >= 8) {
                                short var102 = 240;
                                int var103 = field119[var98][var94][var95] - var102;
                                int var104 = field119[var97][var94][var95];
                                class95.method1892(var91, 1, var94 * 128, var94 * 128, var95 * 128, var96 * 128 + 128, var103, var104);
                                for (int var105 = var97; var105 <= var98; var105++) {
                                    for (int var106 = var95; var106 <= var96; var106++) {
                                        Statics.field2026[var105][var94][var106] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2026[var92][var94][var93] & var89) != 0) {
                            int var107 = var94;
                            int var108 = var94;
                            int var109 = var92;
                            int var110 = var92;
                            while (var107 > 0 && (Statics.field2026[var92][var107 - 1][var93] & var89) != 0) {
                                var107--;
                            }
                            while (var108 < 104 && (Statics.field2026[var92][var108 + 1][var93] & var89) != 0) {
                                var108++;
                            }
                            label422: while (var109 > 0) {
                                for (int var111 = var107; var111 <= var108; var111++) {
                                    if ((Statics.field2026[var109 - 1][var111][var93] & var89) == 0) {
                                        break label422;
                                    }
                                }
                                var109--;
                            }
                            label411: while (var110 < var91) {
                                for (int var112 = var107; var112 <= var108; var112++) {
                                    if ((Statics.field2026[var110 + 1][var112][var93] & var89) == 0) {
                                        break label411;
                                    }
                                }
                                var110++;
                            }
                            int var113 = (var110 + 1 - var109) * (var108 - var107 + 1);
                            if (var113 >= 8) {
                                short var114 = 240;
                                int var115 = field119[var110][var107][var93] - var114;
                                int var116 = field119[var109][var107][var93];
                                class95.method1892(var91, 2, var107 * 128, var108 * 128 + 128, var93 * 128, var93 * 128, var115, var116);
                                for (int var117 = var109; var117 <= var110; var117++) {
                                    for (int var118 = var107; var118 <= var108; var118++) {
                                        Statics.field2026[var117][var118][var93] &= ~var89;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2026[var92][var94][var93] & var90) != 0) {
                            int var119 = var94;
                            int var120 = var94;
                            int var121 = var93;
                            int var122 = var93;
                            while (var121 > 0 && (Statics.field2026[var92][var94][var121 - 1] & var90) != 0) {
                                var121--;
                            }
                            while (var122 < 104 && (Statics.field2026[var92][var94][var122 + 1] & var90) != 0) {
                                var122++;
                            }
                            label475: while (var119 > 0) {
                                for (int var123 = var121; var123 <= var122; var123++) {
                                    if ((Statics.field2026[var92][var119 - 1][var123] & var90) == 0) {
                                        break label475;
                                    }
                                }
                                var119--;
                            }
                            label464: while (var120 < 104) {
                                for (int var124 = var121; var124 <= var122; var124++) {
                                    if ((Statics.field2026[var92][var120 + 1][var124] & var90) == 0) {
                                        break label464;
                                    }
                                }
                                var120++;
                            }
                            if ((var120 - var119 + 1) * (var122 - var121 + 1) >= 4) {
                                int var125 = field119[var92][var119][var121];
                                class95.method1892(var91, 4, var119 * 128, var120 * 128 + 128, var121 * 128, var122 * 128 + 128, var125, var125);
                                for (int var126 = var119; var126 <= var120; var126++) {
                                    for (int var127 = var121; var127 <= var122; var127++) {
                                        Statics.field2026[var92][var126][var127] &= ~var90;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.k(IIB)I")
    public static final int method2405(int arg0, int arg1) {
        int var2 = method2776(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2776(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2776(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ed.q(IIIB)I")
    public static final int method2776(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2146(var3, var5);
        int var8 = method2146(var3 + 1, var5);
        int var9 = method2146(var3, var5 + 1);
        int var10 = method2146(var3 + 1, var5 + 1);
        int var11 = method558(var7, var8, var4, arg2);
        int var12 = method558(var9, var10, var4, arg2);
        return method558(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ap.w(IIIII)I")
    public static final int method558(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1784[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("cq.v(III)I")
    public static final int method2146(int arg0, int arg1) {
        int var2 = method233(arg0 - 1, arg1 - 1) + method233(arg0 + 1, arg1 - 1) + method233(arg0 - 1, arg1 + 1) + method233(arg0 + 1, arg1 + 1);
        int var3 = method233(arg0 - 1, arg1) + method233(arg0 + 1, arg1) + method233(arg0, arg1 - 1) + method233(arg0, arg1 + 1);
        int var4 = method233(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("t.z(IIB)I")
    public static final int method233(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("er.m(IIB)I")
    public static final int method2985(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("o.r(III)I")
    public static final int method222(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var2 = (arg0 & 0x7F) * arg1 / 128;
            if (var2 < 2) {
                var2 = 2;
            } else if (var2 > 126) {
                var2 = 126;
            }
            return (arg0 & 0xFF80) + var2;
        }
    }

    @ObfuscatedName("db.u(IIII)I")
    public static final int method2371(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("dd.i(IIIIIIILcv;Ldr;B)V")
    public static final void method2408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class130 arg8) {
        class32 var9 = class32.method2811(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field807;
            var11 = var9.field822;
        } else {
            var10 = var9.field822;
            var11 = var9.field807;
        }
        int var12;
        int var13;
        if (arg2 + var10 <= 104) {
            var12 = (var10 >> 1) + arg2;
            var13 = (var10 + 1 >> 1) + arg2;
        } else {
            var12 = arg2;
            var13 = arg2 + 1;
        }
        int var14;
        int var15;
        if (arg3 + var11 <= 104) {
            var14 = (var11 >> 1) + arg3;
            var15 = (var11 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int[][] var16 = field119[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field851 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field847 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field830 == -1 && var9.field846 == null) {
                var22 = var9.method677(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1895(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field824 == 1) {
                arg8.method2753(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field830 == -1 && var9.field846 == null) {
                var45 = var9.method677(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1899(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field824 != 0) {
                arg8.method2723(arg2, arg3, var10, var11, var9.field825);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field830 == -1 && var9.field846 == null) {
                var23 = var9.method677(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1899(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field824 != 0) {
                arg8.method2723(arg2, arg3, var10, var11, var9.field825);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field830 == -1 && var9.field846 == null) {
                var24 = var9.method677(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1897(arg0, arg2, arg3, var17, var24, (class94) null, field128[arg5], 0, var20, var21);
            if (var9.field824 != 0) {
                arg8.method2722(arg2, arg3, arg6, arg5, var9.field825);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field830 == -1 && var9.field846 == null) {
                var25 = var9.method677(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1897(arg0, arg2, arg3, var17, var25, (class94) null, field118[arg5], 0, var20, var21);
            if (var9.field824 != 0) {
                arg8.method2722(arg2, arg3, arg6, arg5, var9.field825);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field830 == -1 && var9.field846 == null) {
                var27 = var9.method677(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method677(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field830, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1897(arg0, arg2, arg3, var17, var27, var28, field128[arg5], field128[var26], var20, var21);
            if (var9.field824 != 0) {
                arg8.method2722(arg2, arg3, arg6, arg5, var9.field825);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field830 == -1 && var9.field846 == null) {
                var29 = var9.method677(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1897(arg0, arg2, arg3, var17, var29, (class94) null, field118[arg5], 0, var20, var21);
            if (var9.field824 != 0) {
                arg8.method2722(arg2, arg3, arg6, arg5, var9.field825);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field830 == -1 && var9.field846 == null) {
                var30 = var9.method677(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1899(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field824 != 0) {
                arg8.method2723(arg2, arg3, var10, var11, var9.field825);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field830 == -1 && var9.field846 == null) {
                var31 = var9.method677(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1898(arg0, arg2, arg3, var17, var31, (class94) null, field128[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1978(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method2811(var33 >> 14 & 0x7FFF).field813;
            }
            class94 var34;
            if (var9.field830 == -1 && var9.field846 == null) {
                var34 = var9.method677(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1898(arg0, arg2, arg3, var17, var34, (class94) null, field128[arg5], 0, field142[arg5] * var32, field126[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1978(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method2811(var36 >> 14 & 0x7FFF).field813 / 2;
            }
            class94 var37;
            if (var9.field830 == -1 && var9.field846 == null) {
                var37 = var9.method677(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1898(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field132[arg5] * var35, field133[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field830 == -1 && var9.field846 == null) {
                var39 = var9.method677(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1898(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1978(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method2811(var41 >> 14 & 0x7FFF).field813 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field830 == -1 && var9.field846 == null) {
                var43 = var9.method677(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method677(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field830, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field830, true, (class94) null);
            }
            arg7.method1898(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field132[arg5] * var40, field133[arg5] * var40, var20, var21);
        }
    }
}
