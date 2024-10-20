package deob;

@ObfuscatedName("bt")
public final class class63 {

    @ObfuscatedName("bt.t")
    public static int[][][] field707 = new int[4][105][105];

    @ObfuscatedName("bt.q")
    public static byte[][][] field704 = new byte[4][104][104];

    @ObfuscatedName("bt.i")
    public static int field706 = 99;

    @ObfuscatedName("bt.w")
    public static final int[] field714 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bt.s")
    public static final int[] field716 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bt.d")
    public static final int[] field723 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bt.f")
    public static final int[] field717 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bt.r")
    public static final int[] field718 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bt.y")
    public static final int[] field719 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bt.h")
    public static int field720 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bt.m")
    public static int field721 = (int) (Math.random() * 33.0D) - 16;

    public class63() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.t(B)V")
    public static void method216() {
        Statics.field712 = (byte[][][]) null;
        Statics.field708 = (byte[][][]) null;
        Statics.field709 = (byte[][][]) null;
        Statics.field1953 = (byte[][][]) null;
        Statics.field710 = (int[][][]) null;
        Statics.field705 = (byte[][][]) null;
        Statics.field715 = (int[][]) null;
        Statics.field240 = null;
        Statics.field476 = null;
        Statics.field320 = null;
        Statics.field2585 = null;
        Statics.field477 = null;
    }

    @ObfuscatedName("az.q(IIIII)V")
    public static final void method278(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field705[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field707[0][var5][var4] = field707[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field707[0][var5][var4] = field707[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field707[0][var5][var4] = field707[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field707[0][var5][var4] = field707[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.i([BIIIIIII[Lfa;I)V")
    public static final void method29(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class177[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2231[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class195 var11 = new class195(arg0);
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
                        method1661(var11, arg1, arg2 + var22, arg3 + class242.method3480(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1661(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cc.a(IIIB)V")
    public static final void method1815(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field707[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field707[arg0][arg1][arg2 + var5] = field707[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field707[arg0][arg1 + var6][arg2] = field707[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field707[arg0][arg1 - 1][arg2] != 0) {
            field707[arg0][arg1][arg2] = field707[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field707[arg0][arg1][arg2 - 1] != 0) {
            field707[arg0][arg1][arg2] = field707[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field707[arg0][arg1 - 1][arg2 - 1] != 0) {
            field707[arg0][arg1][arg2] = field707[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cu.l(Lgb;IIIIIII)V")
    public static final void method1661(class195 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3236();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3236();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3236();
                }
            }
            return;
        }
        field704[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3236();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field707[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method629(var10 + 45365, var11 + 91923, 4) - 128 + (method629(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method629(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field707[arg1][arg2][arg3] = field707[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3236();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field707[0][arg2][arg3] = -var15 * 8;
                } else {
                    field707[arg1][arg2][arg3] = field707[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field708[arg1][arg2][arg3] = arg0.method3237();
                Statics.field709[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1953[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field704[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field712[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("by.b(IIIIIILew;Lfa;B)V")
    public static final void method1016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class138 arg6, class177 arg7) {
        if (client.field855 && (field704[0][arg1][arg2] & 0x2) == 0 && (field704[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field706) {
            field706 = arg0;
        }
        class283 var8 = class283.method4427(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3608;
            var10 = var8.field3610;
        } else {
            var9 = var8.field3610;
            var10 = var8.field3608;
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
        int[][] var15 = field707[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3614 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3635 == 1) {
            var20 += 256;
        }
        if (var8.method4621()) {
            class81 var21 = new class81();
            var21.field1238 = arg0;
            var21.field1244 = arg1 * 128;
            var21.field1240 = arg2 * 128;
            int var22 = var8.field3610;
            int var23 = var8.field3608;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3608;
                var23 = var8.field3610;
            }
            var21.field1250 = (arg1 + var22) * 128;
            var21.field1246 = (arg2 + var23) * 128;
            var21.field1242 = var8.field3639;
            var21.field1243 = var8.field3640 * 128;
            var21.field1247 = var8.field3626;
            var21.field1248 = var8.field3636;
            var21.field1237 = var8.field3643;
            if (var8.field3606 != null) {
                var21.field1251 = var8;
                var21.method1653();
            }
            class81.field1241.method3759(var21);
            if (var21.field1237 != null) {
                var21.field1249 = var21.field1247 + (int) (Math.random() * (double) (var21.field1248 - var21.field1247));
            }
        }
        if (arg5 == 22) {
            if (!client.field855 || var8.field3614 != 0 || var8.field3612 == 1 || var8.field3621) {
                class140 var24;
                if (var8.field3630 == -1 && var8.field3606 == null) {
                    var24 = var8.method4606(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class98(arg3, 22, arg4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
                }
                arg6.method2675(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3612 == 1 && arg7 != null) {
                    arg7.method3089(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class140 var47;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var47 = var8.method4606(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class98(arg3, 10, arg4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            if (var47 != null && arg6.method2656(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3633) {
                int var48 = 15;
                if (var47 instanceof class132) {
                    var48 = ((class132) var47).method2472() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field705[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field705[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3612 != 0 && arg7 != null) {
                arg7.method3086(arg1, arg2, var9, var10, var8.field3595);
            }
        } else if (arg5 >= 12) {
            class140 var25;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var25 = var8.method4606(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2656(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field710[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3612 != 0 && arg7 != null) {
                arg7.method3086(arg1, arg2, var9, var10, var8.field3595);
            }
        } else if (arg5 == 0) {
            class140 var26;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var26 = var8.method4606(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class98(arg3, 0, arg4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2654(arg0, arg1, arg2, var16, var26, (class140) null, field714[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3633) {
                    Statics.field705[arg0][arg1][arg2] = 50;
                    Statics.field705[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3617) {
                    Statics.field710[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3633) {
                    Statics.field705[arg0][arg1][arg2 + 1] = 50;
                    Statics.field705[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3617) {
                    Statics.field710[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3633) {
                    Statics.field705[arg0][arg1 + 1][arg2] = 50;
                    Statics.field705[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3617) {
                    Statics.field710[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3633) {
                    Statics.field705[arg0][arg1][arg2] = 50;
                    Statics.field705[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3617) {
                    Statics.field710[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3612 != 0 && arg7 != null) {
                arg7.method3117(arg1, arg2, arg5, arg4, var8.field3595);
            }
            if (var8.field3619 != 16) {
                arg6.method2719(arg0, arg1, arg2, var8.field3619);
            }
        } else if (arg5 == 1) {
            class140 var27;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var27 = var8.method4606(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class98(arg3, 1, arg4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2654(arg0, arg1, arg2, var16, var27, (class140) null, field716[arg4], 0, var19, var20);
            if (var8.field3633) {
                if (arg4 == 0) {
                    Statics.field705[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field705[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field705[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field705[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3612 != 0 && arg7 != null) {
                arg7.method3117(arg1, arg2, arg5, arg4, var8.field3595);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class140 var29;
            class140 var30;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var29 = var8.method4606(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4606(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class98(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
                var30 = new class98(arg3, 2, var28, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2654(arg0, arg1, arg2, var16, var29, var30, field714[arg4], field714[var28], var19, var20);
            if (var8.field3617) {
                if (arg4 == 0) {
                    Statics.field710[arg0][arg1][arg2] |= 0x249;
                    Statics.field710[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field710[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field710[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field710[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field710[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field710[arg0][arg1][arg2] |= 0x492;
                    Statics.field710[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3612 != 0 && arg7 != null) {
                arg7.method3117(arg1, arg2, arg5, arg4, var8.field3595);
            }
            if (var8.field3619 != 16) {
                arg6.method2719(arg0, arg1, arg2, var8.field3619);
            }
        } else if (arg5 == 3) {
            class140 var31;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var31 = var8.method4606(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class98(arg3, 3, arg4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2654(arg0, arg1, arg2, var16, var31, (class140) null, field716[arg4], 0, var19, var20);
            if (var8.field3633) {
                if (arg4 == 0) {
                    Statics.field705[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field705[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field705[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field705[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3612 != 0 && arg7 != null) {
                arg7.method3117(arg1, arg2, arg5, arg4, var8.field3595);
            }
        } else if (arg5 == 9) {
            class140 var32;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var32 = var8.method4606(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2656(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3612 != 0 && arg7 != null) {
                arg7.method3086(arg1, arg2, var9, var10, var8.field3595);
            }
            if (var8.field3619 != 16) {
                arg6.method2719(arg0, arg1, arg2, var8.field3619);
            }
        } else if (arg5 == 4) {
            class140 var33;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var33 = var8.method4606(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var33, (class140) null, field714[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2767(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class283.method4427(var35 >> 14 & 0x7FFF).field3619;
            }
            class140 var36;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var36 = var8.method4606(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var36, (class140) null, field714[arg4], 0, field723[arg4] * var34, field717[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2767(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class283.method4427(var38 >> 14 & 0x7FFF).field3619 / 2;
            }
            class140 var39;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var39 = var8.method4606(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var39, (class140) null, 256, arg4, field718[arg4] * var37, field719[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class140 var41;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var41 = var8.method4606(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class98(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var41, (class140) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2767(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class283.method4427(var43 >> 14 & 0x7FFF).field3619 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class140 var45;
            class140 var46;
            if (var8.field3630 == -1 && var8.field3606 == null) {
                var45 = var8.method4606(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4606(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
                var46 = new class98(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3630, true, (class140) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field718[arg4] * var42, field719[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("aa.e(IIIS)I")
    public static final int method629(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method125(var3, var5);
        int var8 = method125(var3 + 1, var5);
        int var9 = method125(var3, var5 + 1);
        int var10 = method125(var3 + 1, var5 + 1);
        int var11 = method149(var7, var8, var4, arg2);
        int var12 = method149(var9, var10, var4, arg2);
        return method149(var11, var12, var6, arg2);
    }

    @ObfuscatedName("s.x(IIIII)I")
    public static final int method149(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class135.field1936[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("z.p(IIB)I")
    public static final int method125(int arg0, int arg1) {
        int var2 = method1048(arg0 - 1, arg1 - 1) + method1048(arg0 + 1, arg1 - 1) + method1048(arg0 - 1, arg1 + 1) + method1048(arg0 + 1, arg1 + 1);
        int var3 = method1048(arg0 - 1, arg1) + method1048(arg0 + 1, arg1) + method1048(arg0, arg1 - 1) + method1048(arg0, arg1 + 1);
        int var4 = method1048(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bf.o(III)I")
    public static final int method1048(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cm.c(IIB)I")
    public static final int method1651(int arg0, int arg1) {
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

    @ObfuscatedName("k.u(III)I")
    public static final int method111(int arg0, int arg1) {
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

    @ObfuscatedName("ee.k(IIII)I")
    public static final int method2555(int arg0, int arg1, int arg2) {
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
