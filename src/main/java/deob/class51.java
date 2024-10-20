package deob;

@ObfuscatedName("ay")
public final class class51 {

    @ObfuscatedName("ay.f")
    public static int[][][] field492 = new int[4][105][105];

    @ObfuscatedName("ay.l")
    public static byte[][][] field482 = new byte[4][104][104];

    @ObfuscatedName("ay.w")
    public static int field489 = 99;

    @ObfuscatedName("ay.t")
    public static final int[] field488 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("ay.n")
    public static final int[] field481 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("ay.h")
    public static final int[] field483 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("ay.o")
    public static final int[] field491 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("ay.i")
    public static final int[] field496 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("ay.k")
    public static final int[] field493 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("ay.q")
    public static int field494 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("ay.y")
    public static int field495 = (int) (Math.random() * 33.0D) - 16;

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.f(I)V")
    public static void method282() {
        field489 = 99;
        Statics.field484 = new byte[4][104][104];
        Statics.field336 = new byte[4][104][104];
        Statics.field485 = new byte[4][104][104];
        Statics.field486 = new byte[4][104][104];
        Statics.field27 = new int[4][105][105];
        Statics.field1117 = new byte[4][105][105];
        Statics.field3558 = new int[105][105];
        Statics.field487 = new int[104];
        Statics.field3733 = new int[104];
        Statics.field3884 = new int[104];
        Statics.field3701 = new int[104];
        Statics.field22 = new int[104];
    }

    @ObfuscatedName("di.l(S)V")
    public static void method2636() {
        Statics.field484 = (byte[][][]) null;
        Statics.field336 = (byte[][][]) null;
        Statics.field485 = (byte[][][]) null;
        Statics.field486 = (byte[][][]) null;
        Statics.field27 = (int[][][]) null;
        Statics.field1117 = (byte[][][]) null;
        Statics.field3558 = (int[][]) null;
        Statics.field487 = null;
        Statics.field3733 = null;
        Statics.field3884 = null;
        Statics.field3701 = null;
        Statics.field22 = null;
    }

    @ObfuscatedName("k.w(IIIII)V")
    public static final void method428(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1117[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field492[0][var5][var4] = field492[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field492[0][var5][var4] = field492[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field492[0][var5][var4] = field492[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field492[0][var5][var4] = field492[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.s([BIIIIIII[Lfr;I)V")
    public static final void method2974(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2105[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class185 var11 = new class185(arg0);
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
                        method3636(var11, arg1, arg2 + var22, arg3 + class232.method4191(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method3636(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gy.e(Lgm;IIIIIIB)V")
    public static final void method3636(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3344();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3344();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3344();
                }
            }
            return;
        }
        field482[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3344();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field492[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method88(var10 + 45365, var11 + 91923, 4) - 128 + (method88(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method88(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field492[arg1][arg2][arg3] = field492[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3344();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field492[0][arg2][arg3] = -var15 * 8;
                } else {
                    field492[arg1][arg2][arg3] = field492[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field336[arg1][arg2][arg3] = arg0.method3345();
                Statics.field485[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field486[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field482[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field484[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("gi.c([BIIIIIIILdh;[Lfr;I)V")
    public static final void method3572(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class128 arg8, class167[] arg9) {
        class185 var10 = new class185(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3403();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3358();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3344();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class271 var21 = class271.method1776(var11);
                    int var22 = arg2 + class232.method989(var16 & 0x7, var15 & 0x7, arg7, var21.field3449, var21.field3492, var20);
                    int var23 = arg3 + class232.method508(var16 & 0x7, var15 & 0x7, arg7, var21.field3449, var21.field3492, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field482[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class167 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method4095(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hy.p(IIIIIILdh;Lfr;B)V")
    public static final void method4095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class128 arg6, class167 arg7) {
        if (client.field634 && (field482[0][arg1][arg2] & 0x2) == 0 && (field482[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field489) {
            field489 = arg0;
        }
        class271 var8 = class271.method1776(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3492;
            var10 = var8.field3449;
        } else {
            var9 = var8.field3449;
            var10 = var8.field3492;
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
        int[][] var15 = field492[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class123.method3065(arg1, arg2, 2, var8.field3466 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3487 == 1) {
            var21 += 256;
        }
        if (var8.method4724()) {
            class70 var22 = new class70();
            var22.field1033 = arg0;
            var22.field1034 = arg1 * 128;
            var22.field1035 = arg2 * 128;
            int var23 = var8.field3449;
            int var24 = var8.field3492;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3492;
                var24 = var8.field3449;
            }
            var22.field1043 = (arg1 + var23) * 128;
            var22.field1037 = (arg2 + var24) * 128;
            var22.field1036 = var8.field3491;
            var22.field1038 = var8.field3450 * 128;
            var22.field1041 = var8.field3493;
            var22.field1042 = var8.field3494;
            var22.field1032 = var8.field3459;
            if (var8.field3488 != null) {
                var22.field1046 = var8;
                var22.method1637();
            }
            class70.field1044.method3823(var22);
            if (var22.field1032 != null) {
                var22.field1039 = var22.field1041 + (int) (Math.random() * (double) (var22.field1042 - var22.field1041));
            }
        }
        if (arg5 == 22) {
            if (!client.field634 || var8.field3466 != 0 || var8.field3472 == 1 || var8.field3485) {
                class130 var25;
                if (var8.field3470 == -1 && var8.field3488 == null) {
                    var25 = var8.method4717(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class88(arg3, 22, arg4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
                }
                arg6.method2799(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3472 == 1 && arg7 != null) {
                    arg7.method3197(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class130 var51;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var51 = var8.method4717(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class88(arg3, 10, arg4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            if (var51 != null && arg6.method2733(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3464) {
                int var52 = 15;
                if (var51 instanceof class122) {
                    var52 = ((class122) var51).method2537() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field1117[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field1117[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3472 != 0 && arg7 != null) {
                arg7.method3195(arg1, arg2, var9, var10, var8.field3465);
            }
        } else if (arg5 >= 12) {
            class130 var26;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var26 = var8.method4717(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2733(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field27[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3472 != 0 && arg7 != null) {
                arg7.method3195(arg1, arg2, var9, var10, var8.field3465);
            }
        } else if (arg5 == 0) {
            class130 var27;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var27 = var8.method4717(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class88(arg3, 0, arg4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2731(arg0, arg1, arg2, var16, var27, (class130) null, field488[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3464) {
                    Statics.field1117[arg0][arg1][arg2] = 50;
                    Statics.field1117[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3463) {
                    Statics.field27[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3464) {
                    Statics.field1117[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1117[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3463) {
                    Statics.field27[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3464) {
                    Statics.field1117[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1117[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3463) {
                    Statics.field27[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3464) {
                    Statics.field1117[arg0][arg1][arg2] = 50;
                    Statics.field1117[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3463) {
                    Statics.field27[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3472 != 0 && arg7 != null) {
                arg7.method3194(arg1, arg2, arg5, arg4, var8.field3465);
            }
            if (var8.field3471 != 16) {
                arg6.method2870(arg0, arg1, arg2, var8.field3471);
            }
        } else if (arg5 == 1) {
            class130 var28;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var28 = var8.method4717(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class88(arg3, 1, arg4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2731(arg0, arg1, arg2, var16, var28, (class130) null, field481[arg4], 0, var19, var21);
            if (var8.field3464) {
                if (arg4 == 0) {
                    Statics.field1117[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1117[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1117[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1117[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3472 != 0 && arg7 != null) {
                arg7.method3194(arg1, arg2, arg5, arg4, var8.field3465);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class130 var30;
            class130 var31;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var30 = var8.method4717(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4717(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class88(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
                var31 = new class88(arg3, 2, var29, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2731(arg0, arg1, arg2, var16, var30, var31, field488[arg4], field488[var29], var19, var21);
            if (var8.field3463) {
                if (arg4 == 0) {
                    Statics.field27[arg0][arg1][arg2] |= 0x249;
                    Statics.field27[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field27[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field27[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field27[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field27[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field27[arg0][arg1][arg2] |= 0x492;
                    Statics.field27[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3472 != 0 && arg7 != null) {
                arg7.method3194(arg1, arg2, arg5, arg4, var8.field3465);
            }
            if (var8.field3471 != 16) {
                arg6.method2870(arg0, arg1, arg2, var8.field3471);
            }
        } else if (arg5 == 3) {
            class130 var32;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var32 = var8.method4717(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class88(arg3, 3, arg4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2731(arg0, arg1, arg2, var16, var32, (class130) null, field481[arg4], 0, var19, var21);
            if (var8.field3464) {
                if (arg4 == 0) {
                    Statics.field1117[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1117[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1117[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1117[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3472 != 0 && arg7 != null) {
                arg7.method3194(arg1, arg2, arg5, arg4, var8.field3465);
            }
        } else if (arg5 == 9) {
            class130 var33;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var33 = var8.method4717(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2733(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3472 != 0 && arg7 != null) {
                arg7.method3195(arg1, arg2, var9, var10, var8.field3465);
            }
            if (var8.field3471 != 16) {
                arg6.method2870(arg0, arg1, arg2, var8.field3471);
            }
        } else if (arg5 == 4) {
            class130 var34;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var34 = var8.method4717(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2732(arg0, arg1, arg2, var16, var34, (class130) null, field488[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2749(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class271.method1776(class123.method1777(var36)).field3471;
            }
            class130 var38;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var38 = var8.method4717(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2732(arg0, arg1, arg2, var16, var38, (class130) null, field488[arg4], 0, field483[arg4] * var35, field491[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2749(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class271.method1776(class123.method1777(var40)).field3471 / 2;
            }
            class130 var42;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var42 = var8.method4717(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2732(arg0, arg1, arg2, var16, var42, (class130) null, 256, arg4, field496[arg4] * var39, field493[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class130 var44;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var44 = var8.method4717(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class88(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2732(arg0, arg1, arg2, var16, var44, (class130) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2749(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class271.method1776(class123.method1777(var46)).field3471 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class130 var49;
            class130 var50;
            if (var8.field3470 == -1 && var8.field3488 == null) {
                var49 = var8.method4717(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4717(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
                var50 = new class88(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3470, true, (class130) null);
            }
            arg6.method2732(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field496[arg4] * var45, field493[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("bq.r(Ldh;[Lfr;I)V")
    public static final void method1089(class128 arg0, class167[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field482[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field482[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3199(var3, var4);
                        }
                    }
                }
            }
        }
        field494 += (int) (Math.random() * 5.0D) - 2;
        if (field494 < -8) {
            field494 = -8;
        }
        if (field494 > 8) {
            field494 = 8;
        }
        field495 += (int) (Math.random() * 5.0D) - 2;
        if (field495 < -16) {
            field495 = -16;
        }
        if (field495 > 16) {
            field495 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1117[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field492[var6][var11 + 1][var10] - field492[var6][var11 - 1][var10];
                    int var13 = field492[var6][var11][var10 + 1] - field492[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field3558[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field487[var20] = 0;
                Statics.field3733[var20] = 0;
                Statics.field3884[var20] = 0;
                Statics.field3701[var20] = 0;
                Statics.field22[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field484[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class262 var25 = class262.method3020(var24 - 1);
                            Statics.field487[var22] += var25.field3352;
                            Statics.field3733[var22] += var25.field3351;
                            Statics.field3884[var22] += var25.field3350;
                            Statics.field3701[var22] += var25.field3353;
                            var10002 = Statics.field22[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field484[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class262 var28 = class262.method3020(var27 - 1);
                            Statics.field487[var22] -= var28.field3352;
                            Statics.field3733[var22] -= var28.field3351;
                            Statics.field3884[var22] -= var28.field3350;
                            Statics.field3701[var22] -= var28.field3353;
                            var10002 = Statics.field22[var22]--;
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
                            var29 += Statics.field487[var35];
                            var30 += Statics.field3733[var35];
                            var31 += Statics.field3884[var35];
                            var32 += Statics.field3701[var35];
                            var33 += Statics.field22[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field487[var36];
                            var30 -= Statics.field3733[var36];
                            var31 -= Statics.field3884[var36];
                            var32 -= Statics.field3701[var36];
                            var33 -= Statics.field22[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field634 || (field482[0][var21][var34] & 0x2) != 0 || (field482[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field489) {
                                field489 = var6;
                            }
                            int var37 = Statics.field484[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field336[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field492[var6][var21][var34];
                                int var40 = field492[var6][var21 + 1][var34];
                                int var41 = field492[var6][var21 + 1][var34 + 1];
                                int var42 = field492[var6][var21][var34 + 1];
                                int var43 = Statics.field3558[var21][var34];
                                int var44 = Statics.field3558[var21 + 1][var34];
                                int var45 = Statics.field3558[var21 + 1][var34 + 1];
                                int var46 = Statics.field3558[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method3172(var49, var50, var51);
                                    int var52 = field494 + var49 & 0xFF;
                                    int var53 = field495 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method3172(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field485[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class275 var56 = (class275) class275.field3602.method3737((long) var55);
                                        class275 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field3609.method4289(4, var55);
                                            class275 var59 = new class275();
                                            if (var58 != null) {
                                                var59.method4889(new class185(var58), var55);
                                            }
                                            var59.method4888();
                                            class275.field3602.method3744(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field3597) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field27[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class125.field1745[method2955(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2728(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2955(var47, var43), method2955(var47, var44), method2955(var47, var45), method2955(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field485[var6][var21][var34] + 1;
                                    byte var62 = Statics.field486[var6][var21][var34];
                                    int var63 = var38 - 1;
                                    class275 var64 = (class275) class275.field3602.method3737((long) var63);
                                    class275 var65;
                                    if (var64 == null) {
                                        byte[] var66 = Statics.field3609.method4289(4, var63);
                                        class275 var67 = new class275();
                                        if (var66 != null) {
                                            var67.method4889(new class185(var66), var63);
                                        }
                                        var67.method4888();
                                        class275.field3602.method3744(var67, (long) var63);
                                        var65 = var67;
                                    } else {
                                        var65 = var64;
                                    }
                                    int var69 = var65.field3599;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1724.method2411(var69);
                                        var71 = -1;
                                    } else if (var65.field3598 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method3172(var65.field3603, var65.field3604, var65.field3596);
                                        int var72 = field494 + var65.field3603 & 0xFF;
                                        int var73 = field495 + var65.field3596;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method3172(var72, var65.field3604, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class125.field1745[method3017(var70, 96)];
                                    }
                                    if (var65.field3601 != -1) {
                                        int var75 = field494 + var65.field3605 & 0xFF;
                                        int var76 = field495 + var65.field3607;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method3172(var75, var65.field3606, var76);
                                        var74 = class125.field1745[method3017(var77, 96)];
                                    }
                                    arg0.method2728(var6, var21, var34, var61, var62, var69, var39, var40, var41, var42, method2955(var47, var43), method2955(var47, var44), method2955(var47, var45), method2955(var47, var46), method3017(var71, var43), method3017(var71, var44), method3017(var71, var45), method3017(var71, var46), var60, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field482[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field482[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method2727(var6, var79, var78, var84);
                }
            }
            Statics.field484[var6] = (byte[][]) null;
            Statics.field336[var6] = (byte[][]) null;
            Statics.field485[var6] = (byte[][]) null;
            Statics.field486[var6] = (byte[][]) null;
            Statics.field1117[var6] = (byte[][]) null;
        }
        arg0.method2853(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field482[1][var85][var86] & 0x2) == 2) {
                    arg0.method2837(var85, var86);
                }
            }
        }
        int var87 = 1;
        int var88 = 2;
        int var89 = 4;
        for (int var90 = 0; var90 < 4; var90++) {
            if (var90 > 0) {
                var87 <<= 0x3;
                var88 <<= 0x3;
                var89 <<= 0x3;
            }
            for (int var91 = 0; var91 <= var90; var91++) {
                for (int var92 = 0; var92 <= 104; var92++) {
                    for (int var93 = 0; var93 <= 104; var93++) {
                        if ((Statics.field27[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field27[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field27[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label361: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field27[var96 - 1][var93][var98] & var87) == 0) {
                                        break label361;
                                    }
                                }
                                var96--;
                            }
                            label350: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field27[var97 + 1][var93][var99] & var87) == 0) {
                                        break label350;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field492[var97][var93][var94] - var101;
                                int var103 = field492[var96][var93][var94];
                                class128.method2726(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field27[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field27[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field27[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field27[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label414: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field27[var108 - 1][var110][var92] & var88) == 0) {
                                        break label414;
                                    }
                                }
                                var108--;
                            }
                            label403: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field27[var109 + 1][var111][var92] & var88) == 0) {
                                        break label403;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field492[var109][var106][var92] - var113;
                                int var115 = field492[var108][var106][var92];
                                class128.method2726(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field27[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field27[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field27[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field27[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label467: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field27[var91][var118 - 1][var122] & var89) == 0) {
                                        break label467;
                                    }
                                }
                                var118--;
                            }
                            label456: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field27[var91][var119 + 1][var123] & var89) == 0) {
                                        break label456;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field492[var91][var118][var120];
                                class128.method2726(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field27[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.m(IIII)I")
    public static final int method88(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = Statics.method143(var3, var5);
        int var8 = Statics.method143(var3 + 1, var5);
        int var9 = Statics.method143(var3, var5 + 1);
        int var10 = Statics.method143(var3 + 1, var5 + 1);
        int var11 = 65536 - class125.field1743[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class125.field1743[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class125.field1743[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("eo.z(III)I")
    public static final int method2922(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ea.x(III)I")
    public static final int method2955(int arg0, int arg1) {
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

    @ObfuscatedName("ev.v(III)I")
    public static final int method3017(int arg0, int arg1) {
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

    @ObfuscatedName("fi.g(IIIB)I")
    public static final int method3172(int arg0, int arg1, int arg2) {
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
