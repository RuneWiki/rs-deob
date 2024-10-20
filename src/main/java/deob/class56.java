package deob;

@ObfuscatedName("bp")
public final class class56 {

    @ObfuscatedName("bp.c")
    public static int[][][] field476 = new int[4][105][105];

    @ObfuscatedName("bp.x")
    public static byte[][][] field475 = new byte[4][104][104];

    @ObfuscatedName("bp.t")
    public static int field480 = 99;

    @ObfuscatedName("bp.y")
    public static final int[] field481 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bp.r")
    public static final int[] field482 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bp.k")
    public static final int[] field483 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bp.w")
    public static final int[] field488 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bp.m")
    public static final int[] field485 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bp.o")
    public static final int[] field486 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bp.a")
    public static int field484 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bp.b")
    public static int field487 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.c(B)V")
    public static void method231() {
        field480 = 99;
        Statics.field477 = new byte[4][104][104];
        Statics.field258 = new byte[4][104][104];
        Statics.field478 = new byte[4][104][104];
        Statics.field1090 = new byte[4][104][104];
        Statics.field1962 = new int[4][105][105];
        Statics.field474 = new byte[4][105][105];
        Statics.field1978 = new int[105][105];
        Statics.field1954 = new int[104];
        Statics.field1211 = new int[104];
        Statics.field5 = new int[104];
        Statics.field356 = new int[104];
        Statics.field489 = new int[104];
    }

    @ObfuscatedName("db.x(IIIII)V")
    public static final void method2607(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field474[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field476[0][var5][var4] = field476[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field476[0][var5][var4] = field476[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field476[0][var5][var4] = field476[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field476[0][var5][var4] = field476[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bh.t([BIIII[Lfj;I)V")
    public static final void method1118(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class173[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2062[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class300 var9 = new class300(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method474(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("as.l(Lkz;IIIIIIS)V")
    public static final void method474(class300 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method5103();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method5103();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method5103();
                }
            }
            return;
        }
        field475[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5103();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field476[0][arg2][arg3] = -method3528(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field476[arg1][arg2][arg3] = field476[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method5103();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field476[0][arg2][arg3] = -var8 * 8;
                } else {
                    field476[arg1][arg2][arg3] = field476[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field258[arg1][arg2][arg3] = arg0.method5168();
                Statics.field478[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1090[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field475[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field477[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ic.u([BIII)Z")
    public static final boolean method4260(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class300 var4 = new class300(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method5118();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method5117();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method5103() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class254 var16 = class254.method3035(var5);
                        if (var13 != 22 || !client.field838 || var16.field3341 != 0 || var16.field3364 == 1 || var16.field3337) {
                            if (!var16.method4272()) {
                                client.field677++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method5117();
                if (var9 == 0) {
                    break;
                }
                var4.method5103();
            }
        }
    }

    @ObfuscatedName("gn.j(IIIIIILep;Lfj;I)V")
    public static final void method3341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class173 arg7) {
        if (client.field838 && (field475[0][arg1][arg2] & 0x2) == 0 && (field475[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field480) {
            field480 = arg0;
        }
        class254 var8 = class254.method3035(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3329;
            var10 = var8.field3366;
        } else {
            var9 = var8.field3366;
            var10 = var8.field3329;
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
        int[][] var15 = field476[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class129.method239(arg1, arg2, 2, var8.field3341 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3360 == 1) {
            var21 += 256;
        }
        if (var8.method4301()) {
            class76 var22 = new class76();
            var22.field1045 = arg0;
            var22.field1042 = arg1 * 128;
            var22.field1048 = arg2 * 128;
            int var23 = var8.field3366;
            int var24 = var8.field3329;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3329;
                var24 = var8.field3366;
            }
            var22.field1044 = (arg1 + var23) * 128;
            var22.field1052 = (arg2 + var24) * 128;
            var22.field1047 = var8.field3358;
            var22.field1040 = var8.field3367 * 128;
            var22.field1049 = var8.field3368;
            var22.field1050 = var8.field3369;
            var22.field1051 = var8.field3370;
            if (var8.field3363 != null) {
                var22.field1054 = var8;
                var22.method1743();
            }
            class76.field1046.method4572(var22);
            if (var22.field1051 != null) {
                var22.field1043 = var22.field1049 + (int) (Math.random() * (double) (var22.field1050 - var22.field1049));
            }
        }
        if (arg5 == 22) {
            if (!client.field838 || var8.field3341 != 0 || var8.field3364 == 1 || var8.field3337) {
                class136 var25;
                if (var8.field3327 == -1 && var8.field3363 == null) {
                    var25 = var8.method4268(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class94(arg3, 22, arg4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
                }
                arg6.method2841(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3364 == 1 && arg7 != null) {
                    arg7.method3280(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class136 var51;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var51 = var8.method4268(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class94(arg3, 10, arg4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            if (var51 != null && arg6.method2845(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3353) {
                int var52 = 15;
                if (var51 instanceof class128) {
                    var52 = ((class128) var51).method2643() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field474[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field474[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3364 != 0 && arg7 != null) {
                arg7.method3302(arg1, arg2, var9, var10, var8.field3340);
            }
        } else if (arg5 >= 12) {
            class136 var26;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var26 = var8.method4268(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method2845(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1962[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3364 != 0 && arg7 != null) {
                arg7.method3302(arg1, arg2, var9, var10, var8.field3340);
            }
        } else if (arg5 == 0) {
            class136 var27;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var27 = var8.method4268(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class94(arg3, 0, arg4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var27, (class136) null, field481[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3353) {
                    Statics.field474[arg0][arg1][arg2] = 50;
                    Statics.field474[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3356) {
                    Statics.field1962[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3353) {
                    Statics.field474[arg0][arg1][arg2 + 1] = 50;
                    Statics.field474[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3356) {
                    Statics.field1962[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3353) {
                    Statics.field474[arg0][arg1 + 1][arg2] = 50;
                    Statics.field474[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3356) {
                    Statics.field1962[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3353) {
                    Statics.field474[arg0][arg1][arg2] = 50;
                    Statics.field474[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3356) {
                    Statics.field1962[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3364 != 0 && arg7 != null) {
                arg7.method3277(arg1, arg2, arg5, arg4, var8.field3340);
            }
            if (var8.field3346 != 16) {
                arg6.method2851(arg0, arg1, arg2, var8.field3346);
            }
        } else if (arg5 == 1) {
            class136 var28;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var28 = var8.method4268(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class94(arg3, 1, arg4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var28, (class136) null, field482[arg4], 0, var19, var21);
            if (var8.field3353) {
                if (arg4 == 0) {
                    Statics.field474[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field474[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field474[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field474[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3364 != 0 && arg7 != null) {
                arg7.method3277(arg1, arg2, arg5, arg4, var8.field3340);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class136 var30;
            class136 var31;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var30 = var8.method4268(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4268(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class94(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
                var31 = new class94(arg3, 2, var29, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var30, var31, field481[arg4], field481[var29], var19, var21);
            if (var8.field3356) {
                if (arg4 == 0) {
                    Statics.field1962[arg0][arg1][arg2] |= 0x249;
                    Statics.field1962[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1962[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1962[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1962[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1962[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1962[arg0][arg1][arg2] |= 0x492;
                    Statics.field1962[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3364 != 0 && arg7 != null) {
                arg7.method3277(arg1, arg2, arg5, arg4, var8.field3340);
            }
            if (var8.field3346 != 16) {
                arg6.method2851(arg0, arg1, arg2, var8.field3346);
            }
        } else if (arg5 == 3) {
            class136 var32;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var32 = var8.method4268(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class94(arg3, 3, arg4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var32, (class136) null, field482[arg4], 0, var19, var21);
            if (var8.field3353) {
                if (arg4 == 0) {
                    Statics.field474[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field474[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field474[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field474[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3364 != 0 && arg7 != null) {
                arg7.method3277(arg1, arg2, arg5, arg4, var8.field3340);
            }
        } else if (arg5 == 9) {
            class136 var33;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var33 = var8.method4268(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method2845(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3364 != 0 && arg7 != null) {
                arg7.method3302(arg1, arg2, var9, var10, var8.field3340);
            }
            if (var8.field3346 != 16) {
                arg6.method2851(arg0, arg1, arg2, var8.field3346);
            }
        } else if (arg5 == 4) {
            class136 var34;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var34 = var8.method4268(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method3004(arg0, arg1, arg2, var16, var34, (class136) null, field481[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2861(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class254.method3035(class129.method1950(var36)).field3346;
            }
            class136 var38;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var38 = var8.method4268(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method3004(arg0, arg1, arg2, var16, var38, (class136) null, field481[arg4], 0, field483[arg4] * var35, field488[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2861(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class254.method3035(class129.method1950(var40)).field3346 / 2;
            }
            class136 var42;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var42 = var8.method4268(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method3004(arg0, arg1, arg2, var16, var42, (class136) null, 256, arg4, field485[arg4] * var39, field486[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class136 var44;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var44 = var8.method4268(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class94(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method3004(arg0, arg1, arg2, var16, var44, (class136) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2861(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class254.method3035(class129.method1950(var46)).field3346 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class136 var49;
            class136 var50;
            if (var8.field3327 == -1 && var8.field3363 == null) {
                var49 = var8.method4268(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4268(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
                var50 = new class94(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3327, true, (class136) null);
            }
            arg6.method3004(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field485[arg4] * var45, field486[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("gf.d(IIII)I")
    public static int method3371(int arg0, int arg1, int arg2) {
        if ((field475[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field475[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("gs.z(IIB)I")
    public static final int method3528(int arg0, int arg1) {
        int var2 = method2290(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2290(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2290(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("dy.s(IIII)I")
    public static final int method2290(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method685(var3, var5);
        int var8 = method685(var3 + 1, var5);
        int var9 = method685(var3, var5 + 1);
        int var10 = method685(var3 + 1, var5 + 1);
        int var11 = method1045(var7, var8, var4, arg2);
        int var12 = method1045(var9, var10, var4, arg2);
        return method1045(var11, var12, var6, arg2);
    }

    @ObfuscatedName("bd.p(IIIII)I")
    public static final int method1045(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class131.field1737[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ac.e(IIB)I")
    public static final int method685(int arg0, int arg1) {
        int var2 = method679(arg0 - 1, arg1 - 1) + method679(arg0 + 1, arg1 - 1) + method679(arg0 - 1, arg1 + 1) + method679(arg0 + 1, arg1 + 1);
        int var3 = method679(arg0 - 1, arg1) + method679(arg0 + 1, arg1) + method679(arg0, arg1 - 1) + method679(arg0, arg1 + 1);
        int var4 = method679(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ac.i(IIB)I")
    public static final int method679(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("gs.q(III)I")
    public static final int method3529(int arg0, int arg1) {
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

    @ObfuscatedName("db.r(IIB)I")
    public static final int method2606(int arg0, int arg1) {
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

    @ObfuscatedName("el.k(IIII)I")
    public static final int method3018(int arg0, int arg1, int arg2) {
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
}
