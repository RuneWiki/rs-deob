package deob;

@ObfuscatedName("m")
public final class class6 {

    @ObfuscatedName("m.l")
    public static int[][][] field80 = new int[4][105][105];

    @ObfuscatedName("m.e")
    public static byte[][][] field77 = new byte[4][104][104];

    @ObfuscatedName("m.q")
    public static int field78 = 99;

    @ObfuscatedName("m.r")
    public static final int[] field83 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("m.u")
    public static final int[] field94 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("m.a")
    public static final int[] field86 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("m.h")
    public static final int[] field85 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("m.y")
    public static final int[] field87 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("m.d")
    public static final int[] field88 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("m.n")
    public static int field89 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("m.i")
    public static int field90 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.l(IIIII)V")
    public static final void method2781(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field132[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field80[0][var5][var4] = field80[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field80[0][var5][var4] = field80[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field80[0][var5][var4] = field80[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field80[0][var5][var4] = field80[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.e([BIIIIIII[Ldo;B)V")
    public static final void method184(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1887[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class119 var11 = new class119(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method837(var11, arg1, arg2 + class177.method3041(var13 & 0x7, var14 & 0x7, arg7), arg3 + class177.method940(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method837(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.q(Ldl;IIIIIII)V")
    public static final void method837(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2388();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2388();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2388();
                }
            }
            return;
        }
        field77[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2388();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field80[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3643(var10 + 45365, var11 + 91923, 4) - 128 + (method3643(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3643(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field80[arg1][arg2][arg3] = field80[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2388();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field80[0][arg2][arg3] = -var15 * 8;
                } else {
                    field80[arg1][arg2][arg3] = field80[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field76[arg1][arg2][arg3] = arg0.method2389();
                Statics.field81[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1540[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field77[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field79[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("an.o([BIII)Z")
    public static final boolean method939(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class119 var4 = new class119(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2452();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2452();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2388() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method2705(var5);
                        if (var13 != 22 || !client.field300 || var16.field939 != 0 || var16.field937 == 1 || var16.field935) {
                            if (!var16.method809()) {
                                client.field352++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2452();
                if (var9 == 0) {
                    break;
                }
                var4.method2388();
            }
        }
    }

    @ObfuscatedName("fb.g(IIIIIILcp;Ldo;B)V")
    public static final void method2984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field300 && (field77[0][arg1][arg2] & 0x2) == 0 && (field77[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field78) {
            field78 = arg0;
        }
        class41 var8 = class41.method2705(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field952;
            var10 = var8.field969;
        } else {
            var9 = var8.field969;
            var10 = var8.field952;
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
        int[][] var15 = field80[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field939 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field929 == 1) {
            var20 += 256;
        }
        if (var8.method805()) {
            class24 var21 = new class24();
            var21.field608 = arg0;
            var21.field624 = arg1 * 128;
            var21.field613 = arg2 * 128;
            int var22 = var8.field969;
            int var23 = var8.field952;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field952;
                var23 = var8.field969;
            }
            var21.field611 = (arg1 + var22) * 128;
            var21.field612 = (arg2 + var23) * 128;
            var21.field614 = var8.field964;
            var21.field615 = var8.field958 * 128;
            var21.field607 = var8.field966;
            var21.field617 = var8.field967;
            var21.field618 = var8.field968;
            if (var8.field961 != null) {
                var21.field621 = var8;
                var21.method594();
            }
            class24.field610.method3567(var21);
            if (var21.field618 != null) {
                var21.field619 = var21.field607 + (int) (Math.random() * (double) (var21.field617 - var21.field607));
            }
        }
        if (arg5 == 22) {
            if (!client.field300 || var8.field939 != 0 || var8.field937 == 1 || var8.field935) {
                class85 var24;
                if (var8.field943 == -1 && var8.field961 == null) {
                    var24 = var8.method813(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field943, true, (class85) null);
                }
                arg6.method1798(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field937 == 1 && arg7 != null) {
                    arg7.method2265(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field943 == -1 && var8.field961 == null) {
                var47 = var8.method813(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            if (var47 != null && arg6.method1802(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field928) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2178() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field132[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field132[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2286(arg1, arg2, var9, var10, var8.field938);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field943 == -1 && var8.field961 == null) {
                var25 = var8.method813(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1802(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2912[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2286(arg1, arg2, var9, var10, var8.field938);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field943 == -1 && var8.field961 == null) {
                var26 = var8.method813(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, var26, (class85) null, field83[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field928) {
                    Statics.field132[arg0][arg1][arg2] = 50;
                    Statics.field132[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field942) {
                    Statics.field2912[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field928) {
                    Statics.field132[arg0][arg1][arg2 + 1] = 50;
                    Statics.field132[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field942) {
                    Statics.field2912[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field928) {
                    Statics.field132[arg0][arg1 + 1][arg2] = 50;
                    Statics.field132[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field942) {
                    Statics.field2912[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field928) {
                    Statics.field132[arg0][arg1][arg2] = 50;
                    Statics.field132[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field942) {
                    Statics.field2912[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2262(arg1, arg2, arg5, arg4, var8.field938);
            }
            if (var8.field944 != 16) {
                arg6.method1906(arg0, arg1, arg2, var8.field944);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field943 == -1 && var8.field961 == null) {
                var27 = var8.method813(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, var27, (class85) null, field94[arg4], 0, var19, var20);
            if (var8.field928) {
                if (arg4 == 0) {
                    Statics.field132[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field132[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field132[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field132[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2262(arg1, arg2, arg5, arg4, var8.field938);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field943 == -1 && var8.field961 == null) {
                var29 = var8.method813(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method813(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field943, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, var29, var30, field83[arg4], field83[var28], var19, var20);
            if (var8.field942) {
                if (arg4 == 0) {
                    Statics.field2912[arg0][arg1][arg2] |= 0x249;
                    Statics.field2912[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2912[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2912[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2912[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2912[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2912[arg0][arg1][arg2] |= 0x492;
                    Statics.field2912[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2262(arg1, arg2, arg5, arg4, var8.field938);
            }
            if (var8.field944 != 16) {
                arg6.method1906(arg0, arg1, arg2, var8.field944);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field943 == -1 && var8.field961 == null) {
                var31 = var8.method813(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, var31, (class85) null, field94[arg4], 0, var19, var20);
            if (var8.field928) {
                if (arg4 == 0) {
                    Statics.field132[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field132[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field132[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field132[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2262(arg1, arg2, arg5, arg4, var8.field938);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field943 == -1 && var8.field961 == null) {
                var32 = var8.method813(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1802(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2286(arg1, arg2, var9, var10, var8.field938);
            }
            if (var8.field944 != 16) {
                arg6.method1906(arg0, arg1, arg2, var8.field944);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field943 == -1 && var8.field961 == null) {
                var33 = var8.method813(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var33, (class85) null, field83[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1850(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method2705(var35 >> 14 & 0x7FFF).field944;
            }
            class85 var36;
            if (var8.field943 == -1 && var8.field961 == null) {
                var36 = var8.method813(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var36, (class85) null, field83[arg4], 0, field86[arg4] * var34, field85[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1850(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method2705(var38 >> 14 & 0x7FFF).field944 / 2;
            }
            class85 var39;
            if (var8.field943 == -1 && var8.field961 == null) {
                var39 = var8.method813(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field87[arg4] * var37, field88[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field943 == -1 && var8.field961 == null) {
                var41 = var8.method813(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1850(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method2705(var43 >> 14 & 0x7FFF).field944 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field943 == -1 && var8.field961 == null) {
                var45 = var8.method813(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method813(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field943, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field943, true, (class85) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field87[arg4] * var42, field88[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("dq.m(IIII)I")
    public static int method2678(int arg0, int arg1, int arg2) {
        if ((field77[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field77[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("hq.b(IIIB)I")
    public static final int method3643(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1087(var3, var5);
        int var8 = method1087(var3 + 1, var5);
        int var9 = method1087(var3, var5 + 1);
        int var10 = method1087(var3 + 1, var5 + 1);
        int var11 = method3216(var7, var8, var4, arg2);
        int var12 = method3216(var9, var10, var4, arg2);
        return method3216(var11, var12, var6, arg2);
    }

    @ObfuscatedName("fm.p(IIIII)I")
    public static final int method3216(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class91.field1568[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bz.t(III)I")
    public static final int method1087(int arg0, int arg1) {
        int var2 = method727(arg0 - 1, arg1 - 1) + method727(arg0 + 1, arg1 - 1) + method727(arg0 - 1, arg1 + 1) + method727(arg0 + 1, arg1 + 1);
        int var3 = method727(arg0 - 1, arg1) + method727(arg0 + 1, arg1) + method727(arg0, arg1 - 1) + method727(arg0, arg1 + 1);
        int var4 = method727(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ae.w(III)I")
    public static final int method727(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("k.x(IIB)I")
    public static final int method145(int arg0, int arg1) {
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

    @ObfuscatedName("bk.z(IIII)I")
    public static final int method1260(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("y.v(III)Z")
    public static final boolean method586(int arg0, int arg1) {
        class41 var2 = class41.method2705(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method799(arg1);
    }
}
