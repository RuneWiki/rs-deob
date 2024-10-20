package deob;

@ObfuscatedName("az")
public final class class51 {

    @ObfuscatedName("az.f")
    public static int[][][] field460 = new int[4][105][105];

    @ObfuscatedName("az.h")
    public static byte[][][] field457 = new byte[4][104][104];

    @ObfuscatedName("az.e")
    public static int field458 = 99;

    @ObfuscatedName("az.t")
    public static final int[] field467 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("az.v")
    public static final int[] field471 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("az.p")
    public static final int[] field469 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("az.z")
    public static final int[] field470 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("az.j")
    public static final int[] field468 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("az.i")
    public static final int[] field463 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("az.c")
    public static int field473 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("az.y")
    public static int field474 = (int) (Math.random() * 33.0D) - 16;

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.f(I)V")
    public static void method3235() {
        field458 = 99;
        Statics.field476 = new byte[4][104][104];
        Statics.field472 = new byte[4][104][104];
        Statics.field461 = new byte[4][104][104];
        Statics.field40 = new byte[4][104][104];
        Statics.field1005 = new int[4][105][105];
        Statics.field462 = new byte[4][105][105];
        Statics.field456 = new int[105][105];
        Statics.field464 = new int[104];
        Statics.field558 = new int[104];
        Statics.field3403 = new int[104];
        Statics.field465 = new int[104];
        Statics.field62 = new int[104];
    }

    @ObfuscatedName("fj.h(IIIII)V")
    public static final void method3223(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field462[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field460[0][var5][var4] = field460[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field460[0][var5][var4] = field460[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field460[0][var5][var4] = field460[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field460[0][var5][var4] = field460[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.e([BIIII[Lfw;I)V")
    public static final void method636(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class167[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2073[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class185 var9 = new class185(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method472(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("jb.b([BIIIIIII[Lfw;B)V")
    public static final void method4577(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2073[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class185 var11 = new class185(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method472(var11, arg1, arg2 + class232.method142(var13 & 0x7, var14 & 0x7, arg7), arg3 + class232.method3214(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method472(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.l(IIIB)V")
    public static final void method183(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field460[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field460[arg0][arg1][arg2 + var5] = field460[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field460[arg0][arg1 + var6][arg2] = field460[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field460[arg0][arg1 - 1][arg2] != 0) {
            field460[arg0][arg1][arg2] = field460[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field460[arg0][arg1][arg2 - 1] != 0) {
            field460[arg0][arg1][arg2] = field460[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field460[arg0][arg1 - 1][arg2 - 1] != 0) {
            field460[arg0][arg1][arg2] = field460[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("al.w(Lgx;IIIIIIB)V")
    public static final void method472(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3323();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3323();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3323();
                }
            }
            return;
        }
        field457[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3323();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field460[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method954(var10 + 45365, var11 + 91923, 4) - 128 + (method954(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method954(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field460[arg1][arg2][arg3] = field460[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3323();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field460[0][arg2][arg3] = -var15 * 8;
                } else {
                    field460[arg1][arg2][arg3] = field460[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field472[arg1][arg2][arg3] = arg0.method3324();
                Statics.field461[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field40[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field457[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field476[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ek.d([BIILdy;[Lfw;I)V")
    public static final void method3011(byte[] arg0, int arg1, int arg2, class128 arg3, class167[] arg4) {
        class185 var5 = new class185(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3338();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3498();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method3323();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field457[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class167 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method517(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ae.n([BIIIIIIILdy;[Lfw;B)V")
    public static final void method606(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class128 arg8, class167[] arg9) {
        class185 var10 = new class185(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3338();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3498();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3323();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class271 var21 = class271.method1706(var11);
                    int var22 = arg2 + class232.method116(var16 & 0x7, var15 & 0x7, arg7, var21.field3446, var21.field3447, var20);
                    int var23 = arg3 + class232.method1719(var16 & 0x7, var15 & 0x7, arg7, var21.field3446, var21.field3447, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field457[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class167 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method517(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.s(IIIIIILdy;Lfw;B)V")
    public static final void method517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class128 arg6, class167 arg7) {
        if (client.field614 && (field457[0][arg1][arg2] & 0x2) == 0 && (field457[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field458) {
            field458 = arg0;
        }
        class271 var8 = class271.method1706(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3447;
            var10 = var8.field3446;
        } else {
            var9 = var8.field3446;
            var10 = var8.field3447;
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
        int[][] var15 = field460[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class123.method649(arg1, arg2, 2, var8.field3456 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3461 == 1) {
            var21 += 256;
        }
        if (var8.method4685()) {
            class70.method3010(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field614 || var8.field3456 != 0 || var8.field3448 == 1 || var8.field3469) {
                class130 var22;
                if (var8.field3454 == -1 && var8.field3472 == null) {
                    var22 = var8.method4679(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class88(arg3, 22, arg4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
                }
                arg6.method2845(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3448 == 1 && arg7 != null) {
                    arg7.method3171(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class130 var48;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var48 = var8.method4679(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class88(arg3, 10, arg4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            if (var48 != null && arg6.method2742(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3462) {
                int var49 = 15;
                if (var48 instanceof class122) {
                    var49 = ((class122) var48).method2493() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field462[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field462[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3448 != 0 && arg7 != null) {
                arg7.method3169(arg1, arg2, var9, var10, var8.field3457);
            }
        } else if (arg5 >= 12) {
            class130 var23;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var23 = var8.method4679(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2742(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1005[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3448 != 0 && arg7 != null) {
                arg7.method3169(arg1, arg2, var9, var10, var8.field3457);
            }
        } else if (arg5 == 0) {
            class130 var24;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var24 = var8.method4679(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class88(arg3, 0, arg4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2689(arg0, arg1, arg2, var16, var24, (class130) null, field467[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3462) {
                    Statics.field462[arg0][arg1][arg2] = 50;
                    Statics.field462[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3437) {
                    Statics.field1005[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3462) {
                    Statics.field462[arg0][arg1][arg2 + 1] = 50;
                    Statics.field462[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3437) {
                    Statics.field1005[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3462) {
                    Statics.field462[arg0][arg1 + 1][arg2] = 50;
                    Statics.field462[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3437) {
                    Statics.field1005[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3462) {
                    Statics.field462[arg0][arg1][arg2] = 50;
                    Statics.field462[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3437) {
                    Statics.field1005[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3448 != 0 && arg7 != null) {
                arg7.method3204(arg1, arg2, arg5, arg4, var8.field3457);
            }
            if (var8.field3455 != 16) {
                arg6.method2741(arg0, arg1, arg2, var8.field3455);
            }
        } else if (arg5 == 1) {
            class130 var25;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var25 = var8.method4679(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class88(arg3, 1, arg4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2689(arg0, arg1, arg2, var16, var25, (class130) null, field471[arg4], 0, var19, var21);
            if (var8.field3462) {
                if (arg4 == 0) {
                    Statics.field462[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field462[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field462[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field462[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3448 != 0 && arg7 != null) {
                arg7.method3204(arg1, arg2, arg5, arg4, var8.field3457);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class130 var27;
            class130 var28;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var27 = var8.method4679(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4679(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class88(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
                var28 = new class88(arg3, 2, var26, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2689(arg0, arg1, arg2, var16, var27, var28, field467[arg4], field467[var26], var19, var21);
            if (var8.field3437) {
                if (arg4 == 0) {
                    Statics.field1005[arg0][arg1][arg2] |= 0x249;
                    Statics.field1005[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1005[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1005[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1005[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1005[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1005[arg0][arg1][arg2] |= 0x492;
                    Statics.field1005[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3448 != 0 && arg7 != null) {
                arg7.method3204(arg1, arg2, arg5, arg4, var8.field3457);
            }
            if (var8.field3455 != 16) {
                arg6.method2741(arg0, arg1, arg2, var8.field3455);
            }
        } else if (arg5 == 3) {
            class130 var29;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var29 = var8.method4679(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class88(arg3, 3, arg4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2689(arg0, arg1, arg2, var16, var29, (class130) null, field471[arg4], 0, var19, var21);
            if (var8.field3462) {
                if (arg4 == 0) {
                    Statics.field462[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field462[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field462[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field462[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3448 != 0 && arg7 != null) {
                arg7.method3204(arg1, arg2, arg5, arg4, var8.field3457);
            }
        } else if (arg5 == 9) {
            class130 var30;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var30 = var8.method4679(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2742(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3448 != 0 && arg7 != null) {
                arg7.method3169(arg1, arg2, var9, var10, var8.field3457);
            }
            if (var8.field3455 != 16) {
                arg6.method2741(arg0, arg1, arg2, var8.field3455);
            }
        } else if (arg5 == 4) {
            class130 var31;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var31 = var8.method4679(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2817(arg0, arg1, arg2, var16, var31, (class130) null, field467[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2707(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class271.method1706(class123.method4074(var33)).field3455;
            }
            class130 var35;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var35 = var8.method4679(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2817(arg0, arg1, arg2, var16, var35, (class130) null, field467[arg4], 0, field469[arg4] * var32, field470[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2707(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class271.method1706(class123.method4074(var37)).field3455 / 2;
            }
            class130 var39;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var39 = var8.method4679(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2817(arg0, arg1, arg2, var16, var39, (class130) null, 256, arg4, field468[arg4] * var36, field463[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class130 var41;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var41 = var8.method4679(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class88(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2817(arg0, arg1, arg2, var16, var41, (class130) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2707(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class271.method1706(class123.method4074(var43)).field3455 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class130 var46;
            class130 var47;
            if (var8.field3454 == -1 && var8.field3472 == null) {
                var46 = var8.method4679(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4679(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
                var47 = new class88(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3454, true, (class130) null);
            }
            arg6.method2817(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field468[arg4] * var42, field463[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("fm.g(Ldy;[Lfw;I)V")
    public static final void method3237(class128 arg0, class167[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field457[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field457[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3170(var3, var4);
                        }
                    }
                }
            }
        }
        field473 += (int) (Math.random() * 5.0D) - 2;
        if (field473 < -8) {
            field473 = -8;
        }
        if (field473 > 8) {
            field473 = 8;
        }
        field474 += (int) (Math.random() * 5.0D) - 2;
        if (field474 < -16) {
            field474 = -16;
        }
        if (field474 > 16) {
            field474 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field462[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field460[var6][var11 + 1][var10] - field460[var6][var11 - 1][var10];
                    int var13 = field460[var6][var11][var10 + 1] - field460[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field456[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field464[var20] = 0;
                Statics.field558[var20] = 0;
                Statics.field3403[var20] = 0;
                Statics.field465[var20] = 0;
                Statics.field62[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field476[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class262 var25 = class262.method4474(var24 - 1);
                            Statics.field464[var22] += var25.field3340;
                            Statics.field558[var22] += var25.field3341;
                            Statics.field3403[var22] += var25.field3342;
                            Statics.field465[var22] += var25.field3338;
                            var10002 = Statics.field62[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field476[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class262 var28 = class262.method4474(var27 - 1);
                            Statics.field464[var22] -= var28.field3340;
                            Statics.field558[var22] -= var28.field3341;
                            Statics.field3403[var22] -= var28.field3342;
                            Statics.field465[var22] -= var28.field3338;
                            var10002 = Statics.field62[var22]--;
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
                            var29 += Statics.field464[var35];
                            var30 += Statics.field558[var35];
                            var31 += Statics.field3403[var35];
                            var32 += Statics.field465[var35];
                            var33 += Statics.field62[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field464[var36];
                            var30 -= Statics.field558[var36];
                            var31 -= Statics.field3403[var36];
                            var32 -= Statics.field465[var36];
                            var33 -= Statics.field62[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field614 || (field457[0][var21][var34] & 0x2) != 0 || (field457[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field458) {
                                field458 = var6;
                            }
                            int var37 = Statics.field476[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field472[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field460[var6][var21][var34];
                                int var40 = field460[var6][var21 + 1][var34];
                                int var41 = field460[var6][var21 + 1][var34 + 1];
                                int var42 = field460[var6][var21][var34 + 1];
                                int var43 = Statics.field456[var21][var34];
                                int var44 = Statics.field456[var21 + 1][var34];
                                int var45 = Statics.field456[var21 + 1][var34 + 1];
                                int var46 = Statics.field456[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method125(var49, var50, var51);
                                    int var52 = field473 + var49 & 0xFF;
                                    int var53 = field474 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method125(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field461[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class275.method1734(var38 - 1).field3583) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field1005[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class125.field1741[method4108(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2686(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method4108(var47, var43), method4108(var47, var44), method4108(var47, var45), method4108(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field461[var6][var21][var34] + 1;
                                    byte var57 = Statics.field40[var6][var21][var34];
                                    class275 var58 = class275.method1734(var38 - 1);
                                    int var59 = var58.field3582;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1739.method2357(var59);
                                        var61 = -1;
                                    } else if (var58.field3581 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method125(var58.field3585, var58.field3591, var58.field3587);
                                        int var62 = field473 + var58.field3585 & 0xFF;
                                        int var63 = field474 + var58.field3587;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method125(var62, var58.field3591, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class125.field1741[method2381(var60, 96)];
                                    }
                                    if (var58.field3588 != -1) {
                                        int var65 = field473 + var58.field3586 & 0xFF;
                                        int var66 = field474 + var58.field3590;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method125(var65, var58.field3579, var66);
                                        var64 = class125.field1741[method2381(var67, 96)];
                                    }
                                    arg0.method2686(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method4108(var47, var43), method4108(var47, var44), method4108(var47, var45), method4108(var47, var46), method2381(var61, var43), method2381(var61, var44), method2381(var61, var45), method2381(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field457[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field457[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2685(var6, var69, var68, var74);
                }
            }
            Statics.field476[var6] = (byte[][]) null;
            Statics.field472[var6] = (byte[][]) null;
            Statics.field461[var6] = (byte[][]) null;
            Statics.field40[var6] = (byte[][]) null;
            Statics.field462[var6] = (byte[][]) null;
        }
        arg0.method2718(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field457[1][var75][var76] & 0x2) == 2) {
                    arg0.method2727(var75, var76);
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
                        if ((Statics.field1005[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field1005[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field1005[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field1005[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field1005[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field460[var87][var83][var84] - var91;
                                int var93 = field460[var86][var83][var84];
                                class128.method2684(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field1005[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1005[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field1005[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field1005[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field1005[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field1005[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field460[var99][var96][var82] - var103;
                                int var105 = field460[var98][var96][var82];
                                class128.method2684(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field1005[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1005[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field1005[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field1005[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field1005[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field1005[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field460[var81][var108][var110];
                                class128.method2684(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field1005[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bm.k(IIII)I")
    public static final int method954(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = Statics.method2985(var3, var5);
        int var8 = Statics.method2985(var3 + 1, var5);
        int var9 = Statics.method2985(var3, var5 + 1);
        int var10 = Statics.method2985(var3 + 1, var5 + 1);
        int var11 = method3009(var7, var8, var4, arg2);
        int var12 = method3009(var9, var10, var4, arg2);
        return method3009(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ek.m(IIIII)I")
    public static final int method3009(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class125.field1743[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bs.x(III)I")
    public static final int method1526(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("hz.u(IIB)I")
    public static final int method4108(int arg0, int arg1) {
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

    @ObfuscatedName("do.o(III)I")
    public static final int method2381(int arg0, int arg1) {
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

    @ObfuscatedName("a.t(IIII)I")
    public static final int method125(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("iz.v(III)Z")
    public static final boolean method4433(int arg0, int arg1) {
        class271 var2 = class271.method1706(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4677(arg1);
    }
}
