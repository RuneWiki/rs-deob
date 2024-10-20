package deob;

@ObfuscatedName("t")
public final class class6 {

    @ObfuscatedName("t.a")
    public static int[][][] field90 = new int[4][105][105];

    @ObfuscatedName("t.d")
    public static byte[][][] field88 = new byte[4][104][104];

    @ObfuscatedName("t.v")
    public static int field84 = 99;

    @ObfuscatedName("t.o")
    public static final int[] field83 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("t.y")
    public static final int[] field92 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("t.s")
    public static final int[] field79 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("t.e")
    public static final int[] field86 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("t.h")
    public static final int[] field87 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("t.l")
    public static final int[] field77 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("t.c")
    public static int field89 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("t.f")
    public static int field91 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eo.a(I)V")
    public static void method2773() {
        field84 = 99;
        Statics.field80 = new byte[4][104][104];
        Statics.field654 = new byte[4][104][104];
        Statics.field1650 = new byte[4][104][104];
        Statics.field81 = new byte[4][104][104];
        Statics.field591 = new int[4][105][105];
        Statics.field2150 = new byte[4][105][105];
        Statics.field82 = new int[105][105];
        Statics.field3173 = new int[104];
        Statics.field73 = new int[104];
        Statics.field3177 = new int[104];
        Statics.field2212 = new int[104];
        Statics.field3229 = new int[104];
    }

    @ObfuscatedName("a.d(IIIIB)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2150[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field90[0][var5][var4] = field90[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field90[0][var5][var4] = field90[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field90[0][var5][var4] = field90[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field90[0][var5][var4] = field90[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.v(IIIB)V")
    public static final void method43(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field90[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field90[arg0][arg1][arg2 + var5] = field90[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field90[arg0][arg1 + var6][arg2] = field90[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field90[arg0][arg1 - 1][arg2] != 0) {
            field90[arg0][arg1][arg2] = field90[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field90[arg0][arg1][arg2 - 1] != 0) {
            field90[arg0][arg1][arg2] = field90[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field90[arg0][arg1 - 1][arg2 - 1] != 0) {
            field90[arg0][arg1][arg2] = field90[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("au.r(Ldb;IIIIIII)V")
    public static final void method956(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2395();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2395();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2395();
                }
            }
            return;
        }
        field88[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2395();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field90[0][arg2][arg3] = -method38(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field90[arg1][arg2][arg3] = field90[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2395();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field90[0][arg2][arg3] = -var8 * 8;
                } else {
                    field90[arg1][arg2][arg3] = field90[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field654[arg1][arg2][arg3] = arg0.method2396();
                Statics.field1650[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field81[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field88[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field80[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("q.z(IIIIIILct;Ldk;B)V")
    public static final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, class112 arg7) {
        if (client.field286 && (field88[0][arg1][arg2] & 0x2) == 0 && (field88[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field84) {
            field84 = arg0;
        }
        class43 var8 = class43.method3046(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field965;
            var10 = var8.field964;
        } else {
            var9 = var8.field964;
            var10 = var8.field965;
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
        int[][] var15 = field90[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field968 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field989 == 1) {
            var20 += 256;
        }
        if (var8.method825()) {
            class25 var21 = new class25();
            var21.field611 = arg0;
            var21.field621 = arg1 * 128;
            var21.field613 = arg2 * 128;
            int var22 = var8.field964;
            int var23 = var8.field965;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field965;
                var23 = var8.field964;
            }
            var21.field614 = (arg1 + var22) * 128;
            var21.field615 = (arg2 + var23) * 128;
            var21.field617 = var8.field961;
            var21.field626 = var8.field969 * 128;
            var21.field619 = var8.field993;
            var21.field612 = var8.field948;
            var21.field623 = var8.field977;
            if (var8.field952 != null) {
                var21.field624 = var8;
                var21.method591();
            }
            class25.field630.method3612(var21);
            if (var21.field623 != null) {
                var21.field622 = var21.field619 + (int) (Math.random() * (double) (var21.field612 - var21.field619));
            }
        }
        if (arg5 == 22) {
            if (!client.field286 || var8.field968 != 0 || var8.field966 == 1 || var8.field987) {
                class89 var24;
                if (var8.field990 == -1 && var8.field952 == null) {
                    var24 = var8.method820(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field990, true, (class89) null);
                }
                arg6.method1906(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field966 == 1 && arg7 != null) {
                    arg7.method2284(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class89 var47;
            if (var8.field990 == -1 && var8.field952 == null) {
                var47 = var8.method820(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            if (var47 != null && arg6.method1845(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field980) {
                int var48 = 15;
                if (var47 instanceof class109) {
                    var48 = ((class109) var47).method2202() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2150[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2150[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field966 != 0 && arg7 != null) {
                arg7.method2282(arg1, arg2, var9, var10, var8.field967);
            }
        } else if (arg5 >= 12) {
            class89 var25;
            if (var8.field990 == -1 && var8.field952 == null) {
                var25 = var8.method820(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1845(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field591[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field966 != 0 && arg7 != null) {
                arg7.method2282(arg1, arg2, var9, var10, var8.field967);
            }
        } else if (arg5 == 0) {
            class89 var26;
            if (var8.field990 == -1 && var8.field952 == null) {
                var26 = var8.method820(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1843(arg0, arg1, arg2, var16, var26, (class89) null, field83[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field980) {
                    Statics.field2150[arg0][arg1][arg2] = 50;
                    Statics.field2150[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field963) {
                    Statics.field591[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field980) {
                    Statics.field2150[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2150[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field963) {
                    Statics.field591[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field980) {
                    Statics.field2150[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2150[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field963) {
                    Statics.field591[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field980) {
                    Statics.field2150[arg0][arg1][arg2] = 50;
                    Statics.field2150[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field963) {
                    Statics.field591[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field966 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, arg5, arg4, var8.field967);
            }
            if (var8.field973 != 16) {
                arg6.method1982(arg0, arg1, arg2, var8.field973);
            }
        } else if (arg5 == 1) {
            class89 var27;
            if (var8.field990 == -1 && var8.field952 == null) {
                var27 = var8.method820(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1843(arg0, arg1, arg2, var16, var27, (class89) null, field92[arg4], 0, var19, var20);
            if (var8.field980) {
                if (arg4 == 0) {
                    Statics.field2150[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2150[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2150[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2150[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field966 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, arg5, arg4, var8.field967);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class89 var29;
            class89 var30;
            if (var8.field990 == -1 && var8.field952 == null) {
                var29 = var8.method820(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method820(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field990, true, (class89) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1843(arg0, arg1, arg2, var16, var29, var30, field83[arg4], field83[var28], var19, var20);
            if (var8.field963) {
                if (arg4 == 0) {
                    Statics.field591[arg0][arg1][arg2] |= 0x249;
                    Statics.field591[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field591[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field591[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field591[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field591[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field591[arg0][arg1][arg2] |= 0x492;
                    Statics.field591[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field966 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, arg5, arg4, var8.field967);
            }
            if (var8.field973 != 16) {
                arg6.method1982(arg0, arg1, arg2, var8.field973);
            }
        } else if (arg5 == 3) {
            class89 var31;
            if (var8.field990 == -1 && var8.field952 == null) {
                var31 = var8.method820(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1843(arg0, arg1, arg2, var16, var31, (class89) null, field92[arg4], 0, var19, var20);
            if (var8.field980) {
                if (arg4 == 0) {
                    Statics.field2150[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2150[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2150[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2150[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field966 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, arg5, arg4, var8.field967);
            }
        } else if (arg5 == 9) {
            class89 var32;
            if (var8.field990 == -1 && var8.field952 == null) {
                var32 = var8.method820(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1845(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field966 != 0 && arg7 != null) {
                arg7.method2282(arg1, arg2, var9, var10, var8.field967);
            }
            if (var8.field973 != 16) {
                arg6.method1982(arg0, arg1, arg2, var8.field973);
            }
        } else if (arg5 == 4) {
            class89 var33;
            if (var8.field990 == -1 && var8.field952 == null) {
                var33 = var8.method820(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1964(arg0, arg1, arg2, var16, var33, (class89) null, field83[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1909(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class43.method3046(var35 >> 14 & 0x7FFF).field973;
            }
            class89 var36;
            if (var8.field990 == -1 && var8.field952 == null) {
                var36 = var8.method820(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1964(arg0, arg1, arg2, var16, var36, (class89) null, field83[arg4], 0, field79[arg4] * var34, field86[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1909(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class43.method3046(var38 >> 14 & 0x7FFF).field973 / 2;
            }
            class89 var39;
            if (var8.field990 == -1 && var8.field952 == null) {
                var39 = var8.method820(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1964(arg0, arg1, arg2, var16, var39, (class89) null, 256, arg4, field87[arg4] * var37, field77[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class89 var41;
            if (var8.field990 == -1 && var8.field952 == null) {
                var41 = var8.method820(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1964(arg0, arg1, arg2, var16, var41, (class89) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1909(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class43.method3046(var43 >> 14 & 0x7FFF).field973 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class89 var45;
            class89 var46;
            if (var8.field990 == -1 && var8.field952 == null) {
                var45 = var8.method820(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method820(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field990, true, (class89) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field990, true, (class89) null);
            }
            arg6.method1964(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field87[arg4] * var42, field77[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("v.t(IIB)I")
    public static final int method38(int arg0, int arg1) {
        int var2 = method861(arg0 + 45365, arg1 + 91923, 4) - 128 + (method861(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method861(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ah.n(IIII)I")
    public static final int method861(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method154(var3, var5);
        int var8 = method154(var3 + 1, var5);
        int var9 = method154(var3, var5 + 1);
        int var10 = method154(var3 + 1, var5 + 1);
        int var11 = method23(var7, var8, var4, arg2);
        int var12 = method23(var9, var10, var4, arg2);
        return method23(var11, var12, var6, arg2);
    }

    @ObfuscatedName("v.i(IIIIB)I")
    public static final int method23(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class95.field1677[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("x.g(IIB)I")
    public static final int method154(int arg0, int arg1) {
        int var2 = method2333(arg0 - 1, arg1 - 1) + method2333(arg0 + 1, arg1 - 1) + method2333(arg0 - 1, arg1 + 1) + method2333(arg0 + 1, arg1 + 1);
        int var3 = method2333(arg0 - 1, arg1) + method2333(arg0 + 1, arg1) + method2333(arg0, arg1 - 1) + method2333(arg0, arg1 + 1);
        int var4 = method2333(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dr.m(IIB)I")
    public static final int method2333(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cc.k(IIB)I")
    public static final int method2002(int arg0, int arg1) {
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

    @ObfuscatedName("l.x(IIB)I")
    public static final int method579(int arg0, int arg1) {
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

    @ObfuscatedName("cb.j(IIIIIIILct;Ldk;I)V")
    public static final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class90 arg7, class112 arg8) {
        class43 var9 = class43.method3046(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field965;
            var11 = var9.field964;
        } else {
            var10 = var9.field964;
            var11 = var9.field965;
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
        int[][] var16 = field90[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field968 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field989 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class89 var22;
            if (var9.field990 == -1 && var9.field952 == null) {
                var22 = var9.method821(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1906(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field966 == 1) {
                arg8.method2284(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class89 var45;
            if (var9.field990 == -1 && var9.field952 == null) {
                var45 = var9.method821(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            if (var45 != null) {
                arg7.method1845(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field966 != 0) {
                arg8.method2282(arg2, arg3, var10, var11, var9.field967);
            }
        } else if (arg6 >= 12) {
            class89 var23;
            if (var9.field990 == -1 && var9.field952 == null) {
                var23 = var9.method821(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1845(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field966 != 0) {
                arg8.method2282(arg2, arg3, var10, var11, var9.field967);
            }
        } else if (arg6 == 0) {
            class89 var24;
            if (var9.field990 == -1 && var9.field952 == null) {
                var24 = var9.method821(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1843(arg0, arg2, arg3, var17, var24, (class89) null, field83[arg5], 0, var20, var21);
            if (var9.field966 != 0) {
                arg8.method2281(arg2, arg3, arg6, arg5, var9.field967);
            }
        } else if (arg6 == 1) {
            class89 var25;
            if (var9.field990 == -1 && var9.field952 == null) {
                var25 = var9.method821(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1843(arg0, arg2, arg3, var17, var25, (class89) null, field92[arg5], 0, var20, var21);
            if (var9.field966 != 0) {
                arg8.method2281(arg2, arg3, arg6, arg5, var9.field967);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class89 var27;
            class89 var28;
            if (var9.field990 == -1 && var9.field952 == null) {
                var27 = var9.method821(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method821(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field990, true, (class89) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1843(arg0, arg2, arg3, var17, var27, var28, field83[arg5], field83[var26], var20, var21);
            if (var9.field966 != 0) {
                arg8.method2281(arg2, arg3, arg6, arg5, var9.field967);
            }
        } else if (arg6 == 3) {
            class89 var29;
            if (var9.field990 == -1 && var9.field952 == null) {
                var29 = var9.method821(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1843(arg0, arg2, arg3, var17, var29, (class89) null, field92[arg5], 0, var20, var21);
            if (var9.field966 != 0) {
                arg8.method2281(arg2, arg3, arg6, arg5, var9.field967);
            }
        } else if (arg6 == 9) {
            class89 var30;
            if (var9.field990 == -1 && var9.field952 == null) {
                var30 = var9.method821(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1845(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field966 != 0) {
                arg8.method2282(arg2, arg3, var10, var11, var9.field967);
            }
        } else if (arg6 == 4) {
            class89 var31;
            if (var9.field990 == -1 && var9.field952 == null) {
                var31 = var9.method821(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1964(arg0, arg2, arg3, var17, var31, (class89) null, field83[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1909(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class43.method3046(var33 >> 14 & 0x7FFF).field973;
            }
            class89 var34;
            if (var9.field990 == -1 && var9.field952 == null) {
                var34 = var9.method821(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1964(arg0, arg2, arg3, var17, var34, (class89) null, field83[arg5], 0, field79[arg5] * var32, field86[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1909(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class43.method3046(var36 >> 14 & 0x7FFF).field973 / 2;
            }
            class89 var37;
            if (var9.field990 == -1 && var9.field952 == null) {
                var37 = var9.method821(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1964(arg0, arg2, arg3, var17, var37, (class89) null, 256, arg5, field87[arg5] * var35, field77[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class89 var39;
            if (var9.field990 == -1 && var9.field952 == null) {
                var39 = var9.method821(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1964(arg0, arg2, arg3, var17, var39, (class89) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1909(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class43.method3046(var41 >> 14 & 0x7FFF).field973 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class89 var43;
            class89 var44;
            if (var9.field990 == -1 && var9.field952 == null) {
                var43 = var9.method821(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method821(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field990, true, (class89) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field990, true, (class89) null);
            }
            arg7.method1964(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field87[arg5] * var40, field77[arg5] * var40, var20, var21);
        }
    }
}
