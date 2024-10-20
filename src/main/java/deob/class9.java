package deob;

@ObfuscatedName("d")
public final class class9 {

    @ObfuscatedName("d.q")
    public static int[][][] field134 = new int[4][105][105];

    @ObfuscatedName("d.c")
    public static byte[][][] field120 = new byte[4][104][104];

    @ObfuscatedName("d.p")
    public static int field132 = 99;

    @ObfuscatedName("d.o")
    public static final int[] field125 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("d.a")
    public static final int[] field126 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("d.f")
    public static final int[] field138 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("d.s")
    public static final int[] field128 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("d.w")
    public static final int[] field129 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("d.x")
    public static final int[] field130 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("d.j")
    public static int field131 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("d.i")
    public static int field141 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ar.q(IIIIS)V")
    public static final void method897(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field55[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field134[0][var5][var4] = field134[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field134[0][var5][var4] = field134[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field134[0][var5][var4] = field134[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field134[0][var5][var4] = field134[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.c(Ldo;IIIIIIB)V")
    public static final void method794(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2534();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2534();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2534();
                }
            }
            return;
        }
        field120[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2534();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field134[0][arg2][arg3] = -method1856(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field134[arg1][arg2][arg3] = field134[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2534();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field134[0][arg2][arg3] = -var8 * 8;
                } else {
                    field134[arg1][arg2][arg3] = field134[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field284[arg1][arg2][arg3] = arg0.method2426();
                Statics.field737[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field123[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field120[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field139[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("g.p([BIIIIIIILcn;[Lda;I)V")
    public static final void method141(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, class130[] arg9) {
        class127 var10 = new class127(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2596();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2596();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2534();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class32 var21 = class32.method14(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field855;
                    int var27 = var21.field830;
                    if ((var20 & 0x1) == 1) {
                        int var28 = var26;
                        var26 = var27;
                        var27 = var28;
                    }
                    int var29 = arg7 & 0x3;
                    int var30;
                    if (var29 == 0) {
                        var30 = var23;
                    } else if (var29 == 1) {
                        var30 = var24;
                    } else if (var29 == 2) {
                        var30 = 7 - var23 - (var26 - 1);
                    } else {
                        var30 = 7 - var24 - (var27 - 1);
                    }
                    int var31 = arg2 + var30;
                    int var33 = var16 & 0x7;
                    int var34 = var15 & 0x7;
                    int var36 = var21.field855;
                    int var37 = var21.field830;
                    if ((var20 & 0x1) == 1) {
                        int var38 = var36;
                        var36 = var37;
                        var37 = var38;
                    }
                    int var39 = arg7 & 0x3;
                    int var40;
                    if (var39 == 0) {
                        var40 = var34;
                    } else if (var39 == 1) {
                        var40 = 7 - var33 - (var36 - 1);
                    } else if (var39 == 2) {
                        var40 = 7 - var34 - (var37 - 1);
                    } else {
                        var40 = var33;
                    }
                    int var41 = arg3 + var40;
                    if (var31 > 0 && var41 > 0 && var31 < 103 && var41 < 103) {
                        int var42 = arg1;
                        if ((field120[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class130 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method45(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.z(IIIIIILcn;Lda;B)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field475 && (field120[0][arg1][arg2] & 0x2) == 0) {
            if ((field120[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field120[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field120[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field610 != var8) {
                return;
            }
        }
        if (arg0 < field132) {
            field132 = arg0;
        }
        class32 var9 = class32.method14(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field830;
            var11 = var9.field855;
        } else {
            var10 = var9.field855;
            var11 = var9.field830;
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
        int[][] var16 = field134[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field833 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field854 == 1) {
            var21 += 256;
        }
        if (var9.method649()) {
            class7 var22 = new class7();
            var22.field89 = arg0;
            var22.field90 = arg1 * 128;
            var22.field91 = arg2 * 128;
            int var23 = var9.field855;
            int var24 = var9.field830;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field830;
                var24 = var9.field855;
            }
            var22.field92 = (arg1 + var23) * 128;
            var22.field93 = (arg2 + var24) * 128;
            var22.field95 = var9.field858;
            var22.field104 = var9.field859 * 128;
            var22.field102 = var9.field860;
            var22.field98 = var9.field861;
            var22.field99 = var9.field862;
            if (var9.field851 != null) {
                var22.field97 = var9;
                var22.method41();
            }
            class7.field96.method3288(var22);
            if (var22.field99 != null) {
                var22.field100 = var22.field102 + (int) (Math.random() * (double) (var22.field98 - var22.field102));
            }
        }
        if (arg5 == 22) {
            if (!client.field475 || var9.field833 != 0 || var9.field831 == 1 || var9.field852) {
                class94 var25;
                if (var9.field843 == -1 && var9.field851 == null) {
                    var25 = var9.method644(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field843, true, (class94) null);
                }
                arg6.method1866(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field831 == 1 && arg7 != null) {
                    arg7.method2633(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var48;
            if (var9.field843 == -1 && var9.field851 == null) {
                var48 = var9.method644(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            if (var48 != null && arg6.method1870(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field837) {
                int var49 = 15;
                if (var48 instanceof class112) {
                    var49 = ((class112) var48).method2215() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field55[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field55[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field831 != 0 && arg7 != null) {
                arg7.method2636(arg1, arg2, var10, var11, var9.field832);
            }
        } else if (arg5 >= 12) {
            class94 var26;
            if (var9.field843 == -1 && var9.field851 == null) {
                var26 = var9.method644(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1870(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2072[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field831 != 0 && arg7 != null) {
                arg7.method2636(arg1, arg2, var10, var11, var9.field832);
            }
        } else if (arg5 == 0) {
            class94 var27;
            if (var9.field843 == -1 && var9.field851 == null) {
                var27 = var9.method644(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1957(arg0, arg1, arg2, var17, var27, (class94) null, field125[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field837) {
                    Statics.field55[arg0][arg1][arg2] = 50;
                    Statics.field55[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field836) {
                    Statics.field2072[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field837) {
                    Statics.field55[arg0][arg1][arg2 + 1] = 50;
                    Statics.field55[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field836) {
                    Statics.field2072[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field837) {
                    Statics.field55[arg0][arg1 + 1][arg2] = 50;
                    Statics.field55[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field836) {
                    Statics.field2072[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field837) {
                    Statics.field55[arg0][arg1][arg2] = 50;
                    Statics.field55[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field836) {
                    Statics.field2072[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field831 != 0 && arg7 != null) {
                arg7.method2635(arg1, arg2, arg5, arg4, var9.field832);
            }
            if (var9.field838 != 16) {
                arg6.method1921(arg0, arg1, arg2, var9.field838);
            }
        } else if (arg5 == 1) {
            class94 var28;
            if (var9.field843 == -1 && var9.field851 == null) {
                var28 = var9.method644(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1957(arg0, arg1, arg2, var17, var28, (class94) null, field126[arg4], 0, var20, var21);
            if (var9.field837) {
                if (arg4 == 0) {
                    Statics.field55[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field55[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field55[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field55[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field831 != 0 && arg7 != null) {
                arg7.method2635(arg1, arg2, arg5, arg4, var9.field832);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class94 var30;
            class94 var31;
            if (var9.field843 == -1 && var9.field851 == null) {
                var30 = var9.method644(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method644(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field843, true, (class94) null);
                var31 = new class14(arg3, 2, var29, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1957(arg0, arg1, arg2, var17, var30, var31, field125[arg4], field125[var29], var20, var21);
            if (var9.field836) {
                if (arg4 == 0) {
                    Statics.field2072[arg0][arg1][arg2] |= 0x249;
                    Statics.field2072[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2072[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2072[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2072[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2072[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2072[arg0][arg1][arg2] |= 0x492;
                    Statics.field2072[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field831 != 0 && arg7 != null) {
                arg7.method2635(arg1, arg2, arg5, arg4, var9.field832);
            }
            if (var9.field838 != 16) {
                arg6.method1921(arg0, arg1, arg2, var9.field838);
            }
        } else if (arg5 == 3) {
            class94 var32;
            if (var9.field843 == -1 && var9.field851 == null) {
                var32 = var9.method644(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1957(arg0, arg1, arg2, var17, var32, (class94) null, field126[arg4], 0, var20, var21);
            if (var9.field837) {
                if (arg4 == 0) {
                    Statics.field55[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field55[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field55[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field55[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field831 != 0 && arg7 != null) {
                arg7.method2635(arg1, arg2, arg5, arg4, var9.field832);
            }
        } else if (arg5 == 9) {
            class94 var33;
            if (var9.field843 == -1 && var9.field851 == null) {
                var33 = var9.method644(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1870(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field831 != 0 && arg7 != null) {
                arg7.method2636(arg1, arg2, var10, var11, var9.field832);
            }
            if (var9.field838 != 16) {
                arg6.method1921(arg0, arg1, arg2, var9.field838);
            }
        } else if (arg5 == 4) {
            class94 var34;
            if (var9.field843 == -1 && var9.field851 == null) {
                var34 = var9.method644(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1930(arg0, arg1, arg2, var17, var34, (class94) null, field125[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method2016(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method14(var36 >> 14 & 0x7FFF).field838;
            }
            class94 var37;
            if (var9.field843 == -1 && var9.field851 == null) {
                var37 = var9.method644(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1930(arg0, arg1, arg2, var17, var37, (class94) null, field125[arg4], 0, field138[arg4] * var35, field128[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method2016(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class32.method14(var39 >> 14 & 0x7FFF).field838 / 2;
            }
            class94 var40;
            if (var9.field843 == -1 && var9.field851 == null) {
                var40 = var9.method644(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1930(arg0, arg1, arg2, var17, var40, (class94) null, 256, arg4, field129[arg4] * var38, field130[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            if (var9.field843 == -1 && var9.field851 == null) {
                var42 = var9.method644(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1930(arg0, arg1, arg2, var17, var42, (class94) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method2016(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class32.method14(var44 >> 14 & 0x7FFF).field838 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class94 var46;
            class94 var47;
            if (var9.field843 == -1 && var9.field851 == null) {
                var46 = var9.method644(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method644(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field843, true, (class94) null);
                var47 = new class14(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field843, true, (class94) null);
            }
            arg6.method1930(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field129[arg4] * var43, field130[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("cx.m(III)I")
    public static final int method1856(int arg0, int arg1) {
        int var2 = method814(arg0 + 45365, arg1 + 91923, 4) - 128 + (method814(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method814(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ab.k(IIII)I")
    public static final int method814(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method603(var3, var5);
        int var8 = method603(var3 + 1, var5);
        int var9 = method603(var3, var5 + 1);
        int var10 = method603(var3 + 1, var5 + 1);
        int var11 = method2356(var7, var8, var4, arg2);
        int var12 = method2356(var9, var10, var4, arg2);
        return method2356(var11, var12, var6, arg2);
    }

    @ObfuscatedName("dq.v(IIIIS)I")
    public static final int method2356(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1766[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("af.y(III)I")
    public static final int method603(int arg0, int arg1) {
        int var2 = method51(arg0 - 1, arg1 - 1) + method51(arg0 + 1, arg1 - 1) + method51(arg0 - 1, arg1 + 1) + method51(arg0 + 1, arg1 + 1);
        int var3 = method51(arg0 - 1, arg1) + method51(arg0 + 1, arg1) + method51(arg0, arg1 - 1) + method51(arg0, arg1 + 1);
        int var4 = method51(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("y.d(III)I")
    public static final int method51(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("eu.l(III)I")
    public static final int method2936(int arg0, int arg1) {
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

    @ObfuscatedName("client.b(IIII)I")
    public static final int method356(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("u.r(III)Z")
    public static final boolean method133(int arg0, int arg1) {
        class32 var2 = class32.method14(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method652(arg1);
    }
}
