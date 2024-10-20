package deob;

@ObfuscatedName("bi")
public final class class62 {

    @ObfuscatedName("bi.d")
    public static int[][][] field781 = new int[4][105][105];

    @ObfuscatedName("bi.k")
    public static byte[][][] field765 = new byte[4][104][104];

    @ObfuscatedName("bi.e")
    public static int field774 = 99;

    @ObfuscatedName("bi.c")
    public static final int[] field784 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bi.h")
    public static final int[] field772 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bi.a")
    public static final int[] field783 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bi.z")
    public static final int[] field771 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bi.l")
    public static final int[] field775 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bi.w")
    public static final int[] field776 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bi.n")
    public static int field777 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bi.m")
    public static int field778 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.d(IIIIB)V")
    public static final void method711(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2412[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field781[0][var5][var4] = field781[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field781[0][var5][var4] = field781[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field781[0][var5][var4] = field781[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field781[0][var5][var4] = field781[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.k([BIIII[Lfq;B)V")
    public static final void method748(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class162[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2298[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class174 var9 = new class174(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2739(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("fn.e([BIIIIIII[Lfq;I)V")
    public static final void method3249(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2298[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class174 var11 = new class174(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var18 = var13 & 0x7;
                        int var19 = var14 & 0x7;
                        int var21 = arg7 & 0x3;
                        int var22;
                        if (var21 == 0) {
                            var22 = var18;
                        } else if (var21 == 1) {
                            var22 = var19;
                        } else if (var21 == 2) {
                            var22 = 7 - var18;
                        } else {
                            var22 = 7 - var19;
                        }
                        int var25 = arg2 + var22;
                        int var27 = var13 & 0x7;
                        int var28 = var14 & 0x7;
                        int var30 = arg7 & 0x3;
                        int var31;
                        if (var30 == 0) {
                            var31 = var28;
                        } else if (var30 == 1) {
                            var31 = 7 - var27;
                        } else if (var30 == 2) {
                            var31 = 7 - var28;
                        } else {
                            var31 = var27;
                        }
                        method2739(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method2739(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.p(IIII)V")
    public static final void method17(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field781[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field781[arg0][arg1][arg2 + var5] = field781[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field781[arg0][arg1 + var6][arg2] = field781[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field781[arg0][arg1 - 1][arg2] != 0) {
            field781[arg0][arg1][arg2] = field781[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field781[arg0][arg1][arg2 - 1] != 0) {
            field781[arg0][arg1][arg2] = field781[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field781[arg0][arg1 - 1][arg2 - 1] != 0) {
            field781[arg0][arg1][arg2] = field781[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("en.q(Lfg;IIIIIII)V")
    public static final void method2739(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2955();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2955();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2955();
                }
            }
            return;
        }
        field765[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2955();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field781[0][arg2][arg3] = -method1088(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field781[arg1][arg2][arg3] = field781[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2955();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field781[0][arg2][arg3] = -var8 * 8;
                } else {
                    field781[arg1][arg2][arg3] = field781[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field768[arg1][arg2][arg3] = arg0.method2956();
                Statics.field3751[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field769[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field765[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field767[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fr.s([BIII)Z")
    public static final boolean method2832(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class174 var4 = new class174(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2969();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2969();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2955() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class256 var16 = class256.method2710(var5);
                        if (var13 != 22 || !client.field926 || var16.field3440 != 0 || var16.field3456 == 1 || var16.field3477) {
                            if (!var16.method4261()) {
                                client.field981++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2969();
                if (var9 == 0) {
                    break;
                }
                var4.method2955();
            }
        }
    }

    @ObfuscatedName("dw.r([BIILem;[Lfq;I)V")
    public static final void method2236(byte[] arg0, int arg1, int arg2, class138 arg3, class162[] arg4) {
        class174 var5 = new class174(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2969();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2969();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2955();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field765[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class162 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1510(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("cg.g(IIIIIILem;Lfq;I)V")
    public static final void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class138 arg6, class162 arg7) {
        if (client.field926 && (field765[0][arg1][arg2] & 0x2) == 0 && (field765[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field774) {
            field774 = arg0;
        }
        class256 var8 = class256.method2710(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3455;
            var10 = var8.field3454;
        } else {
            var9 = var8.field3454;
            var10 = var8.field3455;
        }
        int var11;
        int var12;
        if (arg1 + var9 <= 104) {
            var11 = (var9 >> 1) + arg1;
            var12 = (var9 + 1 >> 1) + arg1;
        } else {
            var11 = arg1;
            var12 = arg1 + 1;
        }
        int var13;
        int var14;
        if (arg2 + var10 <= 104) {
            var13 = (var10 >> 1) + arg2;
            var14 = (var10 + 1 >> 1) + arg2;
        } else {
            var13 = arg2;
            var14 = arg2 + 1;
        }
        int[][] var15 = field781[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3440 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3479 == 1) {
            var20 += 256;
        }
        if (var8.method4275()) {
            class81 var21 = new class81();
            var21.field1313 = arg0;
            var21.field1312 = arg1 * 128;
            var21.field1327 = arg2 * 128;
            int var22 = var8.field3454;
            int var23 = var8.field3455;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3455;
                var23 = var8.field3454;
            }
            var21.field1320 = (arg1 + var22) * 128;
            var21.field1317 = (arg2 + var23) * 128;
            var21.field1319 = var8.field3483;
            var21.field1318 = var8.field3484 * 128;
            var21.field1321 = var8.field3446;
            var21.field1322 = var8.field3471;
            var21.field1323 = var8.field3487;
            if (var8.field3486 != null) {
                var21.field1326 = var8;
                var21.method1523();
            }
            class81.field1325.method3411(var21);
            if (var21.field1323 != null) {
                var21.field1324 = var21.field1321 + (int) (Math.random() * (double) (var21.field1322 - var21.field1321));
            }
        }
        if (arg5 == 22) {
            if (!client.field926 || var8.field3440 != 0 || var8.field3456 == 1 || var8.field3477) {
                class140 var24;
                if (var8.field3480 == -1 && var8.field3486 == null) {
                    var24 = var8.method4255(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class99(arg3, 22, arg4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
                }
                arg6.method2533(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3456 == 1 && arg7 != null) {
                    arg7.method2864(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class140 var47;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var47 = var8.method4255(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class99(arg3, 10, arg4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            if (var47 != null && arg6.method2537(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3470) {
                int var48 = 15;
                if (var47 instanceof class132) {
                    var48 = ((class132) var47).method2366() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2412[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2412[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3456 != 0 && arg7 != null) {
                arg7.method2836(arg1, arg2, var9, var10, var8.field3457);
            }
        } else if (arg5 >= 12) {
            class140 var25;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var25 = var8.method4255(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2537(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2351[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3456 != 0 && arg7 != null) {
                arg7.method2836(arg1, arg2, var9, var10, var8.field3457);
            }
        } else if (arg5 == 0) {
            class140 var26;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var26 = var8.method4255(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class99(arg3, 0, arg4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2548(arg0, arg1, arg2, var16, var26, (class140) null, field784[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3470) {
                    Statics.field2412[arg0][arg1][arg2] = 50;
                    Statics.field2412[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3461) {
                    Statics.field2351[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3470) {
                    Statics.field2412[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2412[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3461) {
                    Statics.field2351[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3470) {
                    Statics.field2412[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2412[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3461) {
                    Statics.field2351[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3470) {
                    Statics.field2412[arg0][arg1][arg2] = 50;
                    Statics.field2412[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3461) {
                    Statics.field2351[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3456 != 0 && arg7 != null) {
                arg7.method2835(arg1, arg2, arg5, arg4, var8.field3457);
            }
            if (var8.field3463 != 16) {
                arg6.method2604(arg0, arg1, arg2, var8.field3463);
            }
        } else if (arg5 == 1) {
            class140 var27;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var27 = var8.method4255(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class99(arg3, 1, arg4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2548(arg0, arg1, arg2, var16, var27, (class140) null, field772[arg4], 0, var19, var20);
            if (var8.field3470) {
                if (arg4 == 0) {
                    Statics.field2412[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2412[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2412[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2412[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3456 != 0 && arg7 != null) {
                arg7.method2835(arg1, arg2, arg5, arg4, var8.field3457);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class140 var29;
            class140 var30;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var29 = var8.method4255(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4255(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class99(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
                var30 = new class99(arg3, 2, var28, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2548(arg0, arg1, arg2, var16, var29, var30, field784[arg4], field784[var28], var19, var20);
            if (var8.field3461) {
                if (arg4 == 0) {
                    Statics.field2351[arg0][arg1][arg2] |= 0x249;
                    Statics.field2351[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2351[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2351[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2351[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2351[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2351[arg0][arg1][arg2] |= 0x492;
                    Statics.field2351[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3456 != 0 && arg7 != null) {
                arg7.method2835(arg1, arg2, arg5, arg4, var8.field3457);
            }
            if (var8.field3463 != 16) {
                arg6.method2604(arg0, arg1, arg2, var8.field3463);
            }
        } else if (arg5 == 3) {
            class140 var31;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var31 = var8.method4255(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class99(arg3, 3, arg4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2548(arg0, arg1, arg2, var16, var31, (class140) null, field772[arg4], 0, var19, var20);
            if (var8.field3470) {
                if (arg4 == 0) {
                    Statics.field2412[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2412[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2412[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2412[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3456 != 0 && arg7 != null) {
                arg7.method2835(arg1, arg2, arg5, arg4, var8.field3457);
            }
        } else if (arg5 == 9) {
            class140 var32;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var32 = var8.method4255(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2537(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3456 != 0 && arg7 != null) {
                arg7.method2836(arg1, arg2, var9, var10, var8.field3457);
            }
            if (var8.field3463 != 16) {
                arg6.method2604(arg0, arg1, arg2, var8.field3463);
            }
        } else if (arg5 == 4) {
            class140 var33;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var33 = var8.method4255(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2536(arg0, arg1, arg2, var16, var33, (class140) null, field784[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2618(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class256.method2710(var35 >> 14 & 0x7FFF).field3463;
            }
            class140 var36;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var36 = var8.method4255(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2536(arg0, arg1, arg2, var16, var36, (class140) null, field784[arg4], 0, field783[arg4] * var34, field771[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2618(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class256.method2710(var38 >> 14 & 0x7FFF).field3463 / 2;
            }
            class140 var39;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var39 = var8.method4255(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2536(arg0, arg1, arg2, var16, var39, (class140) null, 256, arg4, field775[arg4] * var37, field776[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class140 var41;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var41 = var8.method4255(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class99(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2536(arg0, arg1, arg2, var16, var41, (class140) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2618(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class256.method2710(var43 >> 14 & 0x7FFF).field3463 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class140 var45;
            class140 var46;
            if (var8.field3480 == -1 && var8.field3486 == null) {
                var45 = var8.method4255(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4255(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
                var46 = new class99(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3480, true, (class140) null);
            }
            arg6.method2536(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field775[arg4] * var42, field776[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("az.v(Lem;[Lfq;I)V")
    public static final void method458(class138 arg0, class162[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field765[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field765[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2837(var3, var4);
                        }
                    }
                }
            }
        }
        field777 += (int) (Math.random() * 5.0D) - 2;
        if (field777 < -8) {
            field777 = -8;
        }
        if (field777 > 8) {
            field777 = 8;
        }
        field778 += (int) (Math.random() * 5.0D) - 2;
        if (field778 < -16) {
            field778 = -16;
        }
        if (field778 > 16) {
            field778 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2412[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field781[var6][var11 + 1][var10] - field781[var6][var11 - 1][var10];
                    int var13 = field781[var6][var11][var10 + 1] - field781[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field763[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field2362[var20] = 0;
                Statics.field520[var20] = 0;
                Statics.field263[var20] = 0;
                Statics.field770[var20] = 0;
                Statics.field2333[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field767[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class247 var25 = Statics.method1065(var24 - 1);
                            Statics.field2362[var22] += var25.field3339;
                            Statics.field520[var22] += var25.field3343;
                            Statics.field263[var22] += var25.field3344;
                            Statics.field770[var22] += var25.field3345;
                            var10002 = Statics.field2333[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field767[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class247 var28 = Statics.method1065(var27 - 1);
                            Statics.field2362[var22] -= var28.field3339;
                            Statics.field520[var22] -= var28.field3343;
                            Statics.field263[var22] -= var28.field3344;
                            Statics.field770[var22] -= var28.field3345;
                            var10002 = Statics.field2333[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var29 = 0;
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = 0;
                    for (int var34 = -5; var34 < 109; var34++) {
                        int var35 = var34 + 5;
                        if (var35 >= 0 && var35 < 104) {
                            var29 += Statics.field2362[var35];
                            var30 += Statics.field520[var35];
                            var31 += Statics.field263[var35];
                            var32 += Statics.field770[var35];
                            var33 += Statics.field2333[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field2362[var36];
                            var30 -= Statics.field520[var36];
                            var31 -= Statics.field263[var36];
                            var32 -= Statics.field770[var36];
                            var33 -= Statics.field2333[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field926 || (field765[0][var21][var34] & 0x2) != 0 || (field765[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field774) {
                                field774 = var6;
                            }
                            int var37 = Statics.field767[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field768[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field781[var6][var21][var34];
                                int var40 = field781[var6][var21 + 1][var34];
                                int var41 = field781[var6][var21 + 1][var34 + 1];
                                int var42 = field781[var6][var21][var34 + 1];
                                int var43 = Statics.field763[var21][var34];
                                int var44 = Statics.field763[var21 + 1][var34];
                                int var45 = Statics.field763[var21 + 1][var34 + 1];
                                int var46 = Statics.field763[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method2523(var49, var50, var51);
                                    int var52 = field777 + var49 & 0xFF;
                                    int var53 = field778 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method2523(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field3751[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class260.method548(var38 - 1).field3595) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field2351[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class135.field2003[method2726(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2532(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2726(var47, var43), method2726(var47, var44), method2726(var47, var45), method2726(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field3751[var6][var21][var34] + 1;
                                    byte var57 = Statics.field769[var6][var21][var34];
                                    class260 var58 = class260.method548(var38 - 1);
                                    int var59 = var58.field3594;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field2019.method2241(var59);
                                        var61 = -1;
                                    } else if (var58.field3593 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method2523(var58.field3603, var58.field3597, var58.field3599);
                                        int var62 = field777 + var58.field3603 & 0xFF;
                                        int var63 = field778 + var58.field3599;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method2523(var62, var58.field3597, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class135.field2003[method1788(var60, 96)];
                                    }
                                    if (var58.field3596 != -1) {
                                        int var65 = field777 + var58.field3600 & 0xFF;
                                        int var66 = field778 + var58.field3602;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method2523(var65, var58.field3592, var66);
                                        var64 = class135.field2003[method1788(var67, 96)];
                                    }
                                    arg0.method2532(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method2726(var47, var43), method2726(var47, var44), method2726(var47, var45), method2726(var47, var46), method1788(var61, var43), method1788(var61, var44), method1788(var61, var45), method1788(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field765[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field765[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2531(var6, var69, var68, var74);
                }
            }
            Statics.field767[var6] = (byte[][]) null;
            Statics.field768[var6] = (byte[][]) null;
            Statics.field3751[var6] = (byte[][]) null;
            Statics.field769[var6] = (byte[][]) null;
            Statics.field2412[var6] = (byte[][]) null;
        }
        arg0.method2567(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field765[1][var75][var76] & 0x2) == 2) {
                    arg0.method2587(var75, var76);
                }
            }
        }
        int var77 = 1;
        int var78 = 2;
        int var79 = 4;
        for (int var80 = 0; var80 < 4; var80++) {
            if (var80 > 0) {
                var77 <<= 0x3;
                var78 <<= 0x3;
                var79 <<= 0x3;
            }
            for (int var81 = 0; var81 <= var80; var81++) {
                for (int var82 = 0; var82 <= 104; var82++) {
                    for (int var83 = 0; var83 <= 104; var83++) {
                        if ((Statics.field2351[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field2351[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field2351[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field2351[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field2351[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field781[var87][var83][var84] - var91;
                                int var93 = field781[var86][var83][var84];
                                class138.method2573(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field2351[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2351[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field2351[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field2351[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field2351[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field2351[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field781[var99][var96][var82] - var103;
                                int var105 = field781[var98][var96][var82];
                                class138.method2573(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field2351[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2351[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field2351[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field2351[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field2351[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field2351[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field781[var81][var108][var110];
                                class138.method2573(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field2351[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bw.t(III)I")
    public static final int method1088(int arg0, int arg1) {
        int var2 = method1742(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1742(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1742(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("cj.y(IIII)I")
    public static final int method1742(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method560(var3, var5);
        int var8 = method560(var3 + 1, var5);
        int var9 = method560(var3, var5 + 1);
        int var10 = method560(var3 + 1, var5 + 1);
        int var11 = 65536 - class135.field2023[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class135.field2023[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class135.field2023[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("at.o(IIB)I")
    public static final int method560(int arg0, int arg1) {
        int var2 = method1511(arg0 - 1, arg1 - 1) + method1511(arg0 + 1, arg1 - 1) + method1511(arg0 - 1, arg1 + 1) + method1511(arg0 + 1, arg1 + 1);
        int var3 = method1511(arg0 - 1, arg1) + method1511(arg0 + 1, arg1) + method1511(arg0, arg1 - 1) + method1511(arg0, arg1 + 1);
        int var4 = method1511(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("co.i(IIB)I")
    public static final int method1511(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ex.u(IIB)I")
    public static final int method2726(int arg0, int arg1) {
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

    @ObfuscatedName("cw.x(III)I")
    public static final int method1788(int arg0, int arg1) {
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

    @ObfuscatedName("ep.c(IIIB)I")
    public static final int method2523(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("x.h(IIIIIIILem;Lfq;I)V")
    public static final void method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class138 arg7, class162 arg8) {
        class256 var9 = class256.method2710(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3455;
            var11 = var9.field3454;
        } else {
            var10 = var9.field3454;
            var11 = var9.field3455;
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
        int[][] var16 = field781[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field3440 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field3479 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class140 var22;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var22 = var9.method4256(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class99(arg4, 22, arg5, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2533(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field3456 == 1) {
                arg8.method2864(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class140 var45;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var45 = var9.method4256(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class99(arg4, 10, arg5, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            if (var45 != null) {
                arg7.method2537(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field3456 != 0) {
                arg8.method2836(arg2, arg3, var10, var11, var9.field3457);
            }
        } else if (arg6 >= 12) {
            class140 var23;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var23 = var9.method4256(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class99(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2537(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field3456 != 0) {
                arg8.method2836(arg2, arg3, var10, var11, var9.field3457);
            }
        } else if (arg6 == 0) {
            class140 var24;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var24 = var9.method4256(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class99(arg4, 0, arg5, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2548(arg0, arg2, arg3, var17, var24, (class140) null, field784[arg5], 0, var20, var21);
            if (var9.field3456 != 0) {
                arg8.method2835(arg2, arg3, arg6, arg5, var9.field3457);
            }
        } else if (arg6 == 1) {
            class140 var25;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var25 = var9.method4256(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class99(arg4, 1, arg5, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2548(arg0, arg2, arg3, var17, var25, (class140) null, field772[arg5], 0, var20, var21);
            if (var9.field3456 != 0) {
                arg8.method2835(arg2, arg3, arg6, arg5, var9.field3457);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class140 var27;
            class140 var28;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var27 = var9.method4256(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method4256(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class99(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3480, true, (class140) null);
                var28 = new class99(arg4, 2, var26, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2548(arg0, arg2, arg3, var17, var27, var28, field784[arg5], field784[var26], var20, var21);
            if (var9.field3456 != 0) {
                arg8.method2835(arg2, arg3, arg6, arg5, var9.field3457);
            }
        } else if (arg6 == 3) {
            class140 var29;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var29 = var9.method4256(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class99(arg4, 3, arg5, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2548(arg0, arg2, arg3, var17, var29, (class140) null, field772[arg5], 0, var20, var21);
            if (var9.field3456 != 0) {
                arg8.method2835(arg2, arg3, arg6, arg5, var9.field3457);
            }
        } else if (arg6 == 9) {
            class140 var30;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var30 = var9.method4256(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class99(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2537(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field3456 != 0) {
                arg8.method2836(arg2, arg3, var10, var11, var9.field3457);
            }
        } else if (arg6 == 4) {
            class140 var31;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var31 = var9.method4256(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class99(arg4, 4, arg5, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2536(arg0, arg2, arg3, var17, var31, (class140) null, field784[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2618(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class256.method2710(var33 >> 14 & 0x7FFF).field3463;
            }
            class140 var34;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var34 = var9.method4256(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class99(arg4, 4, arg5, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2536(arg0, arg2, arg3, var17, var34, (class140) null, field784[arg5], 0, field783[arg5] * var32, field771[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2618(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class256.method2710(var36 >> 14 & 0x7FFF).field3463 / 2;
            }
            class140 var37;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var37 = var9.method4256(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class99(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2536(arg0, arg2, arg3, var17, var37, (class140) null, 256, arg5, field775[arg5] * var35, field776[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class140 var39;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var39 = var9.method4256(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class99(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2536(arg0, arg2, arg3, var17, var39, (class140) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2618(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class256.method2710(var41 >> 14 & 0x7FFF).field3463 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class140 var43;
            class140 var44;
            if (var9.field3480 == -1 && var9.field3486 == null) {
                var43 = var9.method4256(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method4256(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class99(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3480, true, (class140) null);
                var44 = new class99(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field3480, true, (class140) null);
            }
            arg7.method2536(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field775[arg5] * var40, field776[arg5] * var40, var20, var21);
        }
    }
}
