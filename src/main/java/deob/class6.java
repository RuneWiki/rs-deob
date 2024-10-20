package deob;

@ObfuscatedName("t")
public final class class6 {

    @ObfuscatedName("t.f")
    public static int[][][] field81 = new int[4][105][105];

    @ObfuscatedName("t.s")
    public static byte[][][] field91 = new byte[4][104][104];

    @ObfuscatedName("t.q")
    public static int field92 = 99;

    @ObfuscatedName("t.d")
    public static final int[] field88 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("t.u")
    public static final int[] field89 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("t.a")
    public static final int[] field90 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("t.x")
    public static final int[] field86 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("t.y")
    public static final int[] field98 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("t.c")
    public static final int[] field93 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("t.h")
    public static int field94 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("t.e")
    public static int field95 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.f(I)V")
    public static void method228() {
        field92 = 99;
        Statics.field3196 = new byte[4][104][104];
        Statics.field2650 = new byte[4][104][104];
        Statics.field2688 = new byte[4][104][104];
        Statics.field84 = new byte[4][104][104];
        Statics.field2070 = new int[4][105][105];
        Statics.field85 = new byte[4][105][105];
        Statics.field3161 = new int[105][105];
        Statics.field1879 = new int[104];
        Statics.field87 = new int[104];
        Statics.field3197 = new int[104];
        Statics.field984 = new int[104];
        Statics.field696 = new int[104];
    }

    @ObfuscatedName("f.s(I)V")
    public static void method6() {
        Statics.field3196 = (byte[][][]) null;
        Statics.field2650 = (byte[][][]) null;
        Statics.field2688 = (byte[][][]) null;
        Statics.field84 = (byte[][][]) null;
        Statics.field2070 = (int[][][]) null;
        Statics.field85 = (byte[][][]) null;
        Statics.field3161 = (int[][]) null;
        Statics.field1879 = null;
        Statics.field87 = null;
        Statics.field3197 = null;
        Statics.field984 = null;
        Statics.field696 = null;
    }

    @ObfuscatedName("bi.g([BIIIIIII[Ldz;B)V")
    public static final void method1074(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1899[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class119 var11 = new class119(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class177.method129(var13 & 0x7, var14 & 0x7, arg7);
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
                        Statics.method642(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        Statics.method642(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.m(IIII)V")
    public static final void method104(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field81[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field81[arg0][arg1][arg2 + var5] = field81[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field81[arg0][arg1 + var6][arg2] = field81[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field81[arg0][arg1 - 1][arg2] != 0) {
            field81[arg0][arg1][arg2] = field81[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field81[arg0][arg1][arg2 - 1] != 0) {
            field81[arg0][arg1][arg2] = field81[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field81[arg0][arg1 - 1][arg2 - 1] != 0) {
            field81[arg0][arg1][arg2] = field81[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("q.n([BIILcl;[Ldz;B)V")
    public static final void method43(byte[] arg0, int arg1, int arg2, class86 arg3, class108[] arg4) {
        class119 var5 = new class119(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2376();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2376();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2363();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field91[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class108 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("hx.l([BIIIIIIILcl;[Ldz;I)V")
    public static final void method3677(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class86 arg8, class108[] arg9) {
        class119 var10 = new class119(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2376();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2376();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2363();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class41 var21 = class41.method1009(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field968;
                    int var27 = var21.field926;
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
                    int var36 = var21.field968;
                    int var37 = var21.field926;
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
                        if ((field91[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class108 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method1(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.i(IIIIIILcl;Ldz;I)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field303 && (field91[0][arg1][arg2] & 0x2) == 0 && (field91[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field92) {
            field92 = arg0;
        }
        class41 var8 = class41.method1009(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field926;
            var10 = var8.field968;
        } else {
            var9 = var8.field968;
            var10 = var8.field926;
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
        int[][] var15 = field81[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field944 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field924 == 1) {
            var20 += 256;
        }
        if (var8.method792()) {
            class24 var21 = new class24();
            var21.field611 = arg0;
            var21.field613 = arg1 * 128;
            var21.field614 = arg2 * 128;
            int var22 = var8.field968;
            int var23 = var8.field926;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field926;
                var23 = var8.field968;
            }
            var21.field615 = (arg1 + var22) * 128;
            var21.field616 = (arg2 + var23) * 128;
            var21.field624 = var8.field969;
            var21.field627 = var8.field940 * 128;
            var21.field629 = var8.field971;
            var21.field621 = var8.field972;
            var21.field612 = var8.field941;
            if (var8.field966 != null) {
                var21.field625 = var8;
                var21.method577();
            }
            class24.field618.method3559(var21);
            if (var21.field612 != null) {
                var21.field623 = var21.field629 + (int) (Math.random() * (double) (var21.field621 - var21.field629));
            }
        }
        if (arg5 == 22) {
            if (!client.field303 || var8.field944 != 0 || var8.field973 == 1 || var8.field963) {
                class85 var24;
                if (var8.field960 == -1 && var8.field966 == null) {
                    var24 = var8.method776(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field960, true, (class85) null);
                }
                arg6.method1794(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field973 == 1 && arg7 != null) {
                    arg7.method2267(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field960 == -1 && var8.field966 == null) {
                var47 = var8.method776(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            if (var47 != null && arg6.method1800(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field956) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2169() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field85[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field85[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field973 != 0 && arg7 != null) {
                arg7.method2265(arg1, arg2, var9, var10, var8.field959);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field960 == -1 && var8.field966 == null) {
                var25 = var8.method776(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2070[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field973 != 0 && arg7 != null) {
                arg7.method2265(arg1, arg2, var9, var10, var8.field959);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field960 == -1 && var8.field966 == null) {
                var26 = var8.method776(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var26, (class85) null, field88[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field956) {
                    Statics.field85[arg0][arg1][arg2] = 50;
                    Statics.field85[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field947) {
                    Statics.field2070[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field956) {
                    Statics.field85[arg0][arg1][arg2 + 1] = 50;
                    Statics.field85[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field947) {
                    Statics.field2070[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field956) {
                    Statics.field85[arg0][arg1 + 1][arg2] = 50;
                    Statics.field85[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field947) {
                    Statics.field2070[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field956) {
                    Statics.field85[arg0][arg1][arg2] = 50;
                    Statics.field85[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field947) {
                    Statics.field2070[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field973 != 0 && arg7 != null) {
                arg7.method2269(arg1, arg2, arg5, arg4, var8.field959);
            }
            if (var8.field949 != 16) {
                arg6.method1887(arg0, arg1, arg2, var8.field949);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field960 == -1 && var8.field966 == null) {
                var27 = var8.method776(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var27, (class85) null, field89[arg4], 0, var19, var20);
            if (var8.field956) {
                if (arg4 == 0) {
                    Statics.field85[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field85[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field85[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field85[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field973 != 0 && arg7 != null) {
                arg7.method2269(arg1, arg2, arg5, arg4, var8.field959);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field960 == -1 && var8.field966 == null) {
                var29 = var8.method776(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method776(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field960, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var29, var30, field88[arg4], field88[var28], var19, var20);
            if (var8.field947) {
                if (arg4 == 0) {
                    Statics.field2070[arg0][arg1][arg2] |= 0x249;
                    Statics.field2070[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2070[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2070[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2070[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2070[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2070[arg0][arg1][arg2] |= 0x492;
                    Statics.field2070[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field973 != 0 && arg7 != null) {
                arg7.method2269(arg1, arg2, arg5, arg4, var8.field959);
            }
            if (var8.field949 != 16) {
                arg6.method1887(arg0, arg1, arg2, var8.field949);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field960 == -1 && var8.field966 == null) {
                var31 = var8.method776(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var31, (class85) null, field89[arg4], 0, var19, var20);
            if (var8.field956) {
                if (arg4 == 0) {
                    Statics.field85[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field85[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field85[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field85[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field973 != 0 && arg7 != null) {
                arg7.method2269(arg1, arg2, arg5, arg4, var8.field959);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field960 == -1 && var8.field966 == null) {
                var32 = var8.method776(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field973 != 0 && arg7 != null) {
                arg7.method2265(arg1, arg2, var9, var10, var8.field959);
            }
            if (var8.field949 != 16) {
                arg6.method1887(arg0, arg1, arg2, var8.field949);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field960 == -1 && var8.field966 == null) {
                var33 = var8.method776(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1797(arg0, arg1, arg2, var16, var33, (class85) null, field88[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1814(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method1009(var35 >> 14 & 0x7FFF).field949;
            }
            class85 var36;
            if (var8.field960 == -1 && var8.field966 == null) {
                var36 = var8.method776(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1797(arg0, arg1, arg2, var16, var36, (class85) null, field88[arg4], 0, field90[arg4] * var34, field86[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1814(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method1009(var38 >> 14 & 0x7FFF).field949 / 2;
            }
            class85 var39;
            if (var8.field960 == -1 && var8.field966 == null) {
                var39 = var8.method776(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1797(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field98[arg4] * var37, field93[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field960 == -1 && var8.field966 == null) {
                var41 = var8.method776(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1797(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1814(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method1009(var43 >> 14 & 0x7FFF).field949 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field960 == -1 && var8.field966 == null) {
                var45 = var8.method776(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method776(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field960, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field960, true, (class85) null);
            }
            arg6.method1797(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field98[arg4] * var42, field93[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("fs.w(IIII)I")
    public static int method3176(int arg0, int arg1, int arg2) {
        if ((field91[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field91[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("di.v(III)I")
    public static final int method2653(int arg0, int arg1) {
        int var2 = method655(arg0 + 45365, arg1 + 91923, 4) - 128 + (method655(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method655(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ax.o(IIII)I")
    public static final int method655(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1073(var3, var5);
        int var8 = method1073(var3 + 1, var5);
        int var9 = method1073(var3, var5 + 1);
        int var10 = method1073(var3 + 1, var5 + 1);
        int var11 = method1537(var7, var8, var4, arg2);
        int var12 = method1537(var9, var10, var4, arg2);
        return method1537(var11, var12, var6, arg2);
    }

    @ObfuscatedName("bv.p(IIIII)I")
    public static final int method1537(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class91.field1591[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bi.b(IIS)I")
    public static final int method1073(int arg0, int arg1) {
        int var2 = method2933(arg0 - 1, arg1 - 1) + method2933(arg0 + 1, arg1 - 1) + method2933(arg0 - 1, arg1 + 1) + method2933(arg0 + 1, arg1 + 1);
        int var3 = method2933(arg0 - 1, arg1) + method2933(arg0 + 1, arg1) + method2933(arg0, arg1 - 1) + method2933(arg0, arg1 + 1);
        int var4 = method2933(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("es.z(III)I")
    public static final int method2933(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dq.k(III)I")
    public static final int method2296(int arg0, int arg1) {
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

    @ObfuscatedName("cq.r(III)I")
    public static final int method2043(int arg0, int arg1) {
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

    @ObfuscatedName("di.d(IIII)I")
    public static final int method2651(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dh.u(IIB)Z")
    public static final boolean method2657(int arg0, int arg1) {
        class41 var2 = class41.method1009(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method773(arg1);
    }
}
