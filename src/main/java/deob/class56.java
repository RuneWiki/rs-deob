package deob;

@ObfuscatedName("bd")
public final class class56 {

    @ObfuscatedName("bd.a")
    public static int[][][] field482 = new int[4][105][105];

    @ObfuscatedName("bd.t")
    public static byte[][][] field488 = new byte[4][104][104];

    @ObfuscatedName("bd.n")
    public static int field481 = 99;

    @ObfuscatedName("bd.s")
    public static final int[] field490 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bd.b")
    public static final int[] field491 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bd.z")
    public static final int[] field492 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bd.f")
    public static final int[] field499 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bd.g")
    public static final int[] field494 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bd.w")
    public static final int[] field495 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bd.u")
    public static int field496 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bd.y")
    public static int field497 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gd.a(I)V")
    public static void method3646() {
        field481 = 99;
        Statics.field1415 = new byte[4][104][104];
        Statics.field486 = new byte[4][104][104];
        Statics.field483 = new byte[4][104][104];
        Statics.field484 = new byte[4][104][104];
        Statics.field489 = new int[4][105][105];
        Statics.field1301 = new byte[4][105][105];
        Statics.field1965 = new int[105][105];
        Statics.field485 = new int[104];
        Statics.field487 = new int[104];
        Statics.field480 = new int[104];
        Statics.field479 = new int[104];
        Statics.field3084 = new int[104];
    }

    @ObfuscatedName("ad.t(IIIIB)V")
    public static final void method530(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1301[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field482[0][var5][var4] = field482[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field482[0][var5][var4] = field482[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field482[0][var5][var4] = field482[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field482[0][var5][var4] = field482[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("eg.n([BIIII[Lfm;I)V")
    public static final void method2903(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class173[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2066[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class300 var9 = new class300(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.method5474(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("fp.q(IIII)V")
    public static final void method3246(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field482[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field482[arg0][arg1][arg2 + var5] = field482[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field482[arg0][arg1 + var6][arg2] = field482[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field482[arg0][arg1 - 1][arg2] != 0) {
            field482[arg0][arg1][arg2] = field482[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field482[arg0][arg1][arg2 - 1] != 0) {
            field482[arg0][arg1][arg2] = field482[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field482[arg0][arg1 - 1][arg2 - 1] != 0) {
            field482[arg0][arg1][arg2] = field482[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("hk.l([BIIIIIIILek;[Lfm;I)V")
    public static final void method3846(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class134 arg8, class173[] arg9) {
        class300 var10 = new class300(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method5137();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5309();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method5123();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class254 var21 = class254.method3848(var11);
                    int var22 = arg2 + Statics.method2713(var16 & 0x7, var15 & 0x7, arg7, var21.field3342, var21.field3378, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field3342;
                    int var28 = var21.field3378;
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
                        if ((field488[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class173 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method4192(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ic.c(IIIIIILek;Lfm;B)V")
    public static final void method4192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class173 arg7) {
        if (client.field637 && (field488[0][arg1][arg2] & 0x2) == 0 && (field488[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field481) {
            field481 = arg0;
        }
        class254 var8 = class254.method3848(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3378;
            var10 = var8.field3342;
        } else {
            var9 = var8.field3342;
            var10 = var8.field3378;
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
        int[][] var15 = field482[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class129.method3245(arg1, arg2, 2, var8.field3357 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3346 == 1) {
            var21 += 256;
        }
        if (var8.method4305()) {
            class76.method1100(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field637 || var8.field3357 != 0 || var8.field3377 == 1 || var8.field3376) {
                class136 var22;
                if (var8.field3361 == -1 && var8.field3354 == null) {
                    var22 = var8.method4307(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class94(arg3, 22, arg4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
                }
                arg6.method3004(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3377 == 1 && arg7 != null) {
                    arg7.method3331(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class136 var48;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var48 = var8.method4307(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class94(arg3, 10, arg4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            if (var48 != null && arg6.method2916(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3375) {
                int var49 = 15;
                if (var48 instanceof class128) {
                    var49 = ((class128) var48).method2730() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field1301[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field1301[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3377 != 0 && arg7 != null) {
                arg7.method3329(arg1, arg2, var9, var10, var8.field3356);
            }
        } else if (arg5 >= 12) {
            class136 var23;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var23 = var8.method4307(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2916(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field489[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3377 != 0 && arg7 != null) {
                arg7.method3329(arg1, arg2, var9, var10, var8.field3356);
            }
        } else if (arg5 == 0) {
            class136 var24;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var24 = var8.method4307(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class94(arg3, 0, arg4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2914(arg0, arg1, arg2, var16, var24, (class136) null, field490[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3375) {
                    Statics.field1301[arg0][arg1][arg2] = 50;
                    Statics.field1301[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3360) {
                    Statics.field489[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3375) {
                    Statics.field1301[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1301[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3360) {
                    Statics.field489[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3375) {
                    Statics.field1301[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1301[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3360) {
                    Statics.field489[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3375) {
                    Statics.field1301[arg0][arg1][arg2] = 50;
                    Statics.field1301[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3360) {
                    Statics.field489[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3377 != 0 && arg7 != null) {
                arg7.method3328(arg1, arg2, arg5, arg4, var8.field3356);
            }
            if (var8.field3362 != 16) {
                arg6.method3030(arg0, arg1, arg2, var8.field3362);
            }
        } else if (arg5 == 1) {
            class136 var25;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var25 = var8.method4307(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class94(arg3, 1, arg4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2914(arg0, arg1, arg2, var16, var25, (class136) null, field491[arg4], 0, var19, var21);
            if (var8.field3375) {
                if (arg4 == 0) {
                    Statics.field1301[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1301[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1301[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1301[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3377 != 0 && arg7 != null) {
                arg7.method3328(arg1, arg2, arg5, arg4, var8.field3356);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class136 var27;
            class136 var28;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var27 = var8.method4307(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4307(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class94(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
                var28 = new class94(arg3, 2, var26, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2914(arg0, arg1, arg2, var16, var27, var28, field490[arg4], field490[var26], var19, var21);
            if (var8.field3360) {
                if (arg4 == 0) {
                    Statics.field489[arg0][arg1][arg2] |= 0x249;
                    Statics.field489[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field489[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field489[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field489[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field489[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field489[arg0][arg1][arg2] |= 0x492;
                    Statics.field489[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3377 != 0 && arg7 != null) {
                arg7.method3328(arg1, arg2, arg5, arg4, var8.field3356);
            }
            if (var8.field3362 != 16) {
                arg6.method3030(arg0, arg1, arg2, var8.field3362);
            }
        } else if (arg5 == 3) {
            class136 var29;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var29 = var8.method4307(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class94(arg3, 3, arg4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2914(arg0, arg1, arg2, var16, var29, (class136) null, field491[arg4], 0, var19, var21);
            if (var8.field3375) {
                if (arg4 == 0) {
                    Statics.field1301[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1301[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1301[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1301[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3377 != 0 && arg7 != null) {
                arg7.method3328(arg1, arg2, arg5, arg4, var8.field3356);
            }
        } else if (arg5 == 9) {
            class136 var30;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var30 = var8.method4307(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2916(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3377 != 0 && arg7 != null) {
                arg7.method3329(arg1, arg2, var9, var10, var8.field3356);
            }
            if (var8.field3362 != 16) {
                arg6.method3030(arg0, arg1, arg2, var8.field3362);
            }
        } else if (arg5 == 4) {
            class136 var31;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var31 = var8.method4307(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2915(arg0, arg1, arg2, var16, var31, (class136) null, field490[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2932(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class254.method3848(class129.method3196(var33)).field3362;
            }
            class136 var35;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var35 = var8.method4307(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2915(arg0, arg1, arg2, var16, var35, (class136) null, field490[arg4], 0, field492[arg4] * var32, field499[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2932(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class254.method3848(class129.method3196(var37)).field3362 / 2;
            }
            class136 var39;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var39 = var8.method4307(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2915(arg0, arg1, arg2, var16, var39, (class136) null, 256, arg4, field494[arg4] * var36, field495[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class136 var41;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var41 = var8.method4307(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class94(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2915(arg0, arg1, arg2, var16, var41, (class136) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2932(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class254.method3848(class129.method3196(var43)).field3362 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class136 var46;
            class136 var47;
            if (var8.field3361 == -1 && var8.field3354 == null) {
                var46 = var8.method4307(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4307(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
                var47 = new class94(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3361, true, (class136) null);
            }
            arg6.method2915(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field494[arg4] * var42, field495[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("im.o(IIB)I")
    public static final int method4137(int arg0, int arg1) {
        int var2 = Statics.method696(arg0 + 45365, arg1 + 91923, 4) - 128 + (Statics.method696(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Statics.method696(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("h.d(IIIII)I")
    public static final int method163(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class131.field1752[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("fc.m(III)I")
    public static final int method3375(int arg0, int arg1) {
        int var2 = method744(arg0 - 1, arg1 - 1) + method744(arg0 + 1, arg1 - 1) + method744(arg0 - 1, arg1 + 1) + method744(arg0 + 1, arg1 + 1);
        int var3 = method744(arg0 - 1, arg1) + method744(arg0 + 1, arg1) + method744(arg0, arg1 - 1) + method744(arg0, arg1 + 1);
        int var4 = method744(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("az.p(IIS)I")
    public static final int method744(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ab.h(III)I")
    public static final int method568(int arg0, int arg1) {
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

    @ObfuscatedName("bo.k(III)I")
    public static final int method1672(int arg0, int arg1) {
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

    @ObfuscatedName("ka.j(IIB)Z")
    public static final boolean method5061(int arg0, int arg1) {
        class254 var2 = class254.method3848(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4292(arg1);
    }
}
