package deob;

@ObfuscatedName("ba")
public final class class63 {

    @ObfuscatedName("ba.g")
    public static int[][][] field731 = new int[4][105][105];

    @ObfuscatedName("ba.e")
    public static byte[][][] field721 = new byte[4][104][104];

    @ObfuscatedName("ba.b")
    public static int field723 = 99;

    @ObfuscatedName("ba.v")
    public static final int[] field728 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("ba.u")
    public static final int[] field729 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("ba.k")
    public static final int[] field732 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("ba.w")
    public static final int[] field722 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("ba.m")
    public static final int[] field727 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("ba.a")
    public static final int[] field730 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("ba.x")
    public static int field734 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("ba.t")
    public static int field735 = (int) (Math.random() * 33.0D) - 16;

    public class63() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bp.g(I)V")
    public static void method788() {
        field723 = 99;
        Statics.field724 = new byte[4][104][104];
        Statics.field341 = new byte[4][104][104];
        Statics.field725 = new byte[4][104][104];
        Statics.field726 = new byte[4][104][104];
        Statics.field272 = new int[4][105][105];
        Statics.field520 = new byte[4][105][105];
        Statics.field3835 = new int[105][105];
        Statics.field733 = new int[104];
        Statics.field757 = new int[104];
        Statics.field2502 = new int[104];
        Statics.field278 = new int[104];
        Statics.field589 = new int[104];
    }

    @ObfuscatedName("bz.e(IIIIB)V")
    public static final void method821(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field520[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field731[0][var5][var4] = field731[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field731[0][var5][var4] = field731[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field731[0][var5][var4] = field731[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field731[0][var5][var4] = field731[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.b(IIIB)V")
    public static final void method1723(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field731[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field731[arg0][arg1][arg2 + var5] = field731[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field731[arg0][arg1 + var6][arg2] = field731[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field731[arg0][arg1 - 1][arg2] != 0) {
            field731[arg0][arg1][arg2] = field731[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field731[arg0][arg1][arg2 - 1] != 0) {
            field731[arg0][arg1][arg2] = field731[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field731[arg0][arg1 - 1][arg2 - 1] != 0) {
            field731[arg0][arg1][arg2] = field731[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("fs.n([BIILeb;[Lff;I)V")
    public static final void method3126(byte[] arg0, int arg1, int arg2, class138 arg3, class177[] arg4) {
        class195 var5 = new class195(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3339();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3339();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method3332();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field721[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class177 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method203(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ax.l(IIIIIILeb;Lff;B)V")
    public static final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class138 arg6, class177 arg7) {
        if (client.field853 && (field721[0][arg1][arg2] & 0x2) == 0 && (field721[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field723) {
            field723 = arg0;
        }
        class283 var8 = class283.method1732(arg3);
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
        int[][] var15 = field731[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3627 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3603 == 1) {
            var20 += 256;
        }
        if (var8.method4714()) {
            class81.method3207(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field853 || var8.field3627 != 0 || var8.field3609 == 1 || var8.field3630) {
                class140 var21;
                if (var8.field3632 == -1 && var8.field3633 == null) {
                    var21 = var8.method4717(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class98(arg3, 22, arg4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
                }
                arg6.method2813(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3609 == 1 && arg7 != null) {
                    arg7.method3185(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class140 var44;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var44 = var8.method4717(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class98(arg3, 10, arg4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            if (var44 != null && arg6.method2751(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3616) {
                int var45 = 15;
                if (var44 instanceof class132) {
                    var45 = ((class132) var44).method2583() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field520[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field520[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3609 != 0 && arg7 != null) {
                arg7.method3202(arg1, arg2, var9, var10, var8.field3614);
            }
        } else if (arg5 >= 12) {
            class140 var22;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var22 = var8.method4717(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2751(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field272[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3609 != 0 && arg7 != null) {
                arg7.method3202(arg1, arg2, var9, var10, var8.field3614);
            }
        } else if (arg5 == 0) {
            class140 var23;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var23 = var8.method4717(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class98(arg3, 0, arg4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2749(arg0, arg1, arg2, var16, var23, (class140) null, field728[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3616) {
                    Statics.field520[arg0][arg1][arg2] = 50;
                    Statics.field520[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3612) {
                    Statics.field272[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3616) {
                    Statics.field520[arg0][arg1][arg2 + 1] = 50;
                    Statics.field520[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3612) {
                    Statics.field272[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3616) {
                    Statics.field520[arg0][arg1 + 1][arg2] = 50;
                    Statics.field520[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3612) {
                    Statics.field272[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3616) {
                    Statics.field520[arg0][arg1][arg2] = 50;
                    Statics.field520[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3612) {
                    Statics.field272[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3609 != 0 && arg7 != null) {
                arg7.method3175(arg1, arg2, arg5, arg4, var8.field3614);
            }
            if (var8.field3622 != 16) {
                arg6.method2903(arg0, arg1, arg2, var8.field3622);
            }
        } else if (arg5 == 1) {
            class140 var24;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var24 = var8.method4717(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class98(arg3, 1, arg4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2749(arg0, arg1, arg2, var16, var24, (class140) null, field729[arg4], 0, var19, var20);
            if (var8.field3616) {
                if (arg4 == 0) {
                    Statics.field520[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field520[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field520[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field520[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3609 != 0 && arg7 != null) {
                arg7.method3175(arg1, arg2, arg5, arg4, var8.field3614);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class140 var26;
            class140 var27;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var26 = var8.method4717(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4717(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class98(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
                var27 = new class98(arg3, 2, var25, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2749(arg0, arg1, arg2, var16, var26, var27, field728[arg4], field728[var25], var19, var20);
            if (var8.field3612) {
                if (arg4 == 0) {
                    Statics.field272[arg0][arg1][arg2] |= 0x249;
                    Statics.field272[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field272[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field272[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field272[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field272[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field272[arg0][arg1][arg2] |= 0x492;
                    Statics.field272[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3609 != 0 && arg7 != null) {
                arg7.method3175(arg1, arg2, arg5, arg4, var8.field3614);
            }
            if (var8.field3622 != 16) {
                arg6.method2903(arg0, arg1, arg2, var8.field3622);
            }
        } else if (arg5 == 3) {
            class140 var28;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var28 = var8.method4717(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class98(arg3, 3, arg4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2749(arg0, arg1, arg2, var16, var28, (class140) null, field729[arg4], 0, var19, var20);
            if (var8.field3616) {
                if (arg4 == 0) {
                    Statics.field520[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field520[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field520[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field520[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3609 != 0 && arg7 != null) {
                arg7.method3175(arg1, arg2, arg5, arg4, var8.field3614);
            }
        } else if (arg5 == 9) {
            class140 var29;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var29 = var8.method4717(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2751(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3609 != 0 && arg7 != null) {
                arg7.method3202(arg1, arg2, var9, var10, var8.field3614);
            }
            if (var8.field3622 != 16) {
                arg6.method2903(arg0, arg1, arg2, var8.field3622);
            }
        } else if (arg5 == 4) {
            class140 var30;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var30 = var8.method4717(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2750(arg0, arg1, arg2, var16, var30, (class140) null, field728[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2767(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class283.method1732(var32 >> 14 & 0x7FFF).field3622;
            }
            class140 var33;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var33 = var8.method4717(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2750(arg0, arg1, arg2, var16, var33, (class140) null, field728[arg4], 0, field732[arg4] * var31, field722[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2767(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class283.method1732(var35 >> 14 & 0x7FFF).field3622 / 2;
            }
            class140 var36;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var36 = var8.method4717(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2750(arg0, arg1, arg2, var16, var36, (class140) null, 256, arg4, field727[arg4] * var34, field730[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class140 var38;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var38 = var8.method4717(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class98(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2750(arg0, arg1, arg2, var16, var38, (class140) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2767(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class283.method1732(var40 >> 14 & 0x7FFF).field3622 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class140 var42;
            class140 var43;
            if (var8.field3632 == -1 && var8.field3633 == null) {
                var42 = var8.method4717(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4717(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
                var43 = new class98(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3632, true, (class140) null);
            }
            arg6.method2750(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field727[arg4] * var39, field730[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ad.s(IIB)I")
    public static final int method505(int arg0, int arg1) {
        int var2 = method1877(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1877(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1877(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("cc.y(IIII)I")
    public static final int method1877(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method327(var3, var5);
        int var8 = method327(var3 + 1, var5);
        int var9 = method327(var3, var5 + 1);
        int var10 = method327(var3 + 1, var5 + 1);
        int var11 = 65536 - class135.field1921[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class135.field1921[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class135.field1921[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("as.c(III)I")
    public static final int method327(int arg0, int arg1) {
        int var2 = method1942(arg0 - 1, arg1 - 1) + method1942(arg0 + 1, arg1 - 1) + method1942(arg0 - 1, arg1 + 1) + method1942(arg0 + 1, arg1 + 1);
        int var3 = method1942(arg0 - 1, arg1) + method1942(arg0 + 1, arg1) + method1942(arg0, arg1 - 1) + method1942(arg0, arg1 + 1);
        int var4 = method1942(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cs.o(III)I")
    public static final int method1942(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cw.d(IIB)I")
    public static final int method1979(int arg0, int arg1) {
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

    @ObfuscatedName("an.r(IIB)I")
    public static final int method636(int arg0, int arg1) {
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

    @ObfuscatedName("kr.p(IIII)I")
    public static final int method5112(int arg0, int arg1, int arg2) {
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
