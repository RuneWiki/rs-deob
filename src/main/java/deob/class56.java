package deob;

@ObfuscatedName("bu")
public final class class56 {

    @ObfuscatedName("bu.n")
    public static int[][][] field511 = new int[4][105][105];

    @ObfuscatedName("bu.h")
    public static byte[][][] field492 = new byte[4][104][104];

    @ObfuscatedName("bu.l")
    public static int field493 = 99;

    @ObfuscatedName("bu.p")
    public static final int[] field500 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bu.k")
    public static final int[] field507 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bu.o")
    public static final int[] field506 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bu.s")
    public static final int[] field508 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bu.u")
    public static final int[] field496 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bu.e")
    public static final int[] field510 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bu.w")
    public static int field491 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bu.q")
    public static int field505 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("js.n(IIIIB)V")
    public static final void method4907(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field498[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field511[0][var5][var4] = field511[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field511[0][var5][var4] = field511[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field511[0][var5][var4] = field511[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field511[0][var5][var4] = field511[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.h([BIIII[Lfw;I)V")
    public static final void method1841(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class172[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2113[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class190 var9 = new class190(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method985(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("i.l([BIIIIIII[Lfw;B)V")
    public static final void method145(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class172[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2113[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class190 var11 = new class190(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method985(var11, arg1, arg2 + class237.method356(var13 & 0x7, var14 & 0x7, arg7), arg3 + class237.method680(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method985(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.g(IIII)V")
    public static final void method702(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field511[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field511[arg0][arg1][arg2 + var5] = field511[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field511[arg0][arg1 + var6][arg2] = field511[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field511[arg0][arg1 - 1][arg2] != 0) {
            field511[arg0][arg1][arg2] = field511[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field511[arg0][arg1][arg2 - 1] != 0) {
            field511[arg0][arg1][arg2] = field511[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field511[arg0][arg1 - 1][arg2 - 1] != 0) {
            field511[arg0][arg1][arg2] = field511[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("bu.b(Lgc;IIIIIII)V")
    public static final void method985(class190 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3511();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3511();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3511();
                }
            }
            return;
        }
        field492[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3511();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field511[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3239(var10 + 45365, var11 + 91923, 4) - 128 + (method3239(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3239(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field511[arg1][arg2][arg3] = field511[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3511();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field511[0][arg2][arg3] = -var15 * 8;
                } else {
                    field511[arg1][arg2][arg3] = field511[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field495[arg1][arg2][arg3] = arg0.method3512();
                Statics.field504[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field497[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field492[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field509[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ju.a([BIIS)Z")
    public static final boolean method5075(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class190 var4 = new class190(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3526();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3566();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3511() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class274 var16 = class274.method4676(var5);
                        if (var13 != 22 || !client.field826 || var16.field3471 != 0 || var16.field3457 == 1 || var16.field3478) {
                            if (!var16.method4867()) {
                                client.field684++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3566();
                if (var9 == 0) {
                    break;
                }
                var4.method3511();
            }
        }
    }

    @ObfuscatedName("cy.c([BIILes;[Lfw;I)V")
    public static final void method1873(byte[] arg0, int arg1, int arg2, class133 arg3, class172[] arg4) {
        class190 var5 = new class190(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3526();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3566();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method3511();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field492[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class172 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method494(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("cs.z([BIIIIIIILes;[Lfw;I)V")
    public static final void method2087(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class133 arg8, class172[] arg9) {
        class190 var10 = new class190(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3526();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3566();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3511();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class274 var21 = class274.method4676(var11);
                    int var22 = arg2 + class237.method1006(var16 & 0x7, var15 & 0x7, arg7, var21.field3455, var21.field3482, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field3455;
                    int var28 = var21.field3482;
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
                        if ((field492[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class172 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method494(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.j(IIIIIILes;Lfw;I)V")
    public static final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class133 arg6, class172 arg7) {
        if (client.field826 && (field492[0][arg1][arg2] & 0x2) == 0 && (field492[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field493) {
            field493 = arg0;
        }
        class274 var8 = class274.method4676(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3482;
            var10 = var8.field3455;
        } else {
            var9 = var8.field3455;
            var10 = var8.field3482;
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
        int[][] var15 = field511[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class128.method1570(arg1, arg2, 2, var8.field3471 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3449 == 1) {
            var21 += 256;
        }
        if (var8.method4872()) {
            class75 var22 = new class75();
            var22.field1033 = arg0;
            var22.field1044 = arg1 * 128;
            var22.field1035 = arg2 * 128;
            int var23 = var8.field3455;
            int var24 = var8.field3482;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3482;
                var24 = var8.field3455;
            }
            var22.field1036 = (arg1 + var23) * 128;
            var22.field1046 = (arg2 + var24) * 128;
            var22.field1047 = var8.field3486;
            var22.field1038 = var8.field3485 * 128;
            var22.field1032 = var8.field3475;
            var22.field1042 = var8.field3487;
            var22.field1043 = var8.field3488;
            if (var8.field3481 != null) {
                var22.field1039 = var8;
                var22.method1721();
            }
            class75.field1034.method3981(var22);
            if (var22.field1043 != null) {
                var22.field1037 = var22.field1032 + (int) (Math.random() * (double) (var22.field1042 - var22.field1032));
            }
        }
        if (arg5 == 22) {
            if (!client.field826 || var8.field3471 != 0 || var8.field3457 == 1 || var8.field3478) {
                class135 var25;
                if (var8.field3463 == -1 && var8.field3481 == null) {
                    var25 = var8.method4868(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class93(arg3, 22, arg4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
                }
                arg6.method2947(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3457 == 1 && arg7 != null) {
                    arg7.method3359(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class135 var51;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var51 = var8.method4868(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class93(arg3, 10, arg4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            if (var51 != null && arg6.method2880(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3469) {
                int var52 = 15;
                if (var51 instanceof class127) {
                    var52 = ((class127) var51).method2678() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field498[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field498[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3345(arg1, arg2, var9, var10, var8.field3458);
            }
        } else if (arg5 >= 12) {
            class135 var26;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var26 = var8.method4868(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class93(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2880(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field503[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3345(arg1, arg2, var9, var10, var8.field3458);
            }
        } else if (arg5 == 0) {
            class135 var27;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var27 = var8.method4868(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class93(arg3, 0, arg4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2919(arg0, arg1, arg2, var16, var27, (class135) null, field500[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3469) {
                    Statics.field498[arg0][arg1][arg2] = 50;
                    Statics.field498[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3462) {
                    Statics.field503[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3469) {
                    Statics.field498[arg0][arg1][arg2 + 1] = 50;
                    Statics.field498[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3462) {
                    Statics.field503[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3469) {
                    Statics.field498[arg0][arg1 + 1][arg2] = 50;
                    Statics.field498[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3462) {
                    Statics.field503[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3469) {
                    Statics.field498[arg0][arg1][arg2] = 50;
                    Statics.field498[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3462) {
                    Statics.field503[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3344(arg1, arg2, arg5, arg4, var8.field3458);
            }
            if (var8.field3451 != 16) {
                arg6.method2886(arg0, arg1, arg2, var8.field3451);
            }
        } else if (arg5 == 1) {
            class135 var28;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var28 = var8.method4868(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class93(arg3, 1, arg4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2919(arg0, arg1, arg2, var16, var28, (class135) null, field507[arg4], 0, var19, var21);
            if (var8.field3469) {
                if (arg4 == 0) {
                    Statics.field498[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field498[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field498[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field498[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3344(arg1, arg2, arg5, arg4, var8.field3458);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class135 var30;
            class135 var31;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var30 = var8.method4868(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4868(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class93(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
                var31 = new class93(arg3, 2, var29, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2919(arg0, arg1, arg2, var16, var30, var31, field500[arg4], field500[var29], var19, var21);
            if (var8.field3462) {
                if (arg4 == 0) {
                    Statics.field503[arg0][arg1][arg2] |= 0x249;
                    Statics.field503[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field503[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field503[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field503[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field503[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field503[arg0][arg1][arg2] |= 0x492;
                    Statics.field503[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3344(arg1, arg2, arg5, arg4, var8.field3458);
            }
            if (var8.field3451 != 16) {
                arg6.method2886(arg0, arg1, arg2, var8.field3451);
            }
        } else if (arg5 == 3) {
            class135 var32;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var32 = var8.method4868(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class93(arg3, 3, arg4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2919(arg0, arg1, arg2, var16, var32, (class135) null, field507[arg4], 0, var19, var21);
            if (var8.field3469) {
                if (arg4 == 0) {
                    Statics.field498[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field498[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field498[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field498[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3344(arg1, arg2, arg5, arg4, var8.field3458);
            }
        } else if (arg5 == 9) {
            class135 var33;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var33 = var8.method4868(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class93(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2880(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3345(arg1, arg2, var9, var10, var8.field3458);
            }
            if (var8.field3451 != 16) {
                arg6.method2886(arg0, arg1, arg2, var8.field3451);
            }
        } else if (arg5 == 4) {
            class135 var34;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var34 = var8.method4868(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class93(arg3, 4, arg4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2879(arg0, arg1, arg2, var16, var34, (class135) null, field500[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2896(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class274.method4676(class128.method1149(var36)).field3451;
            }
            class135 var38;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var38 = var8.method4868(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class93(arg3, 4, arg4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2879(arg0, arg1, arg2, var16, var38, (class135) null, field500[arg4], 0, field506[arg4] * var35, field508[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2896(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class274.method4676(class128.method1149(var40)).field3451 / 2;
            }
            class135 var42;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var42 = var8.method4868(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class93(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2879(arg0, arg1, arg2, var16, var42, (class135) null, 256, arg4, field496[arg4] * var39, field510[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class135 var44;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var44 = var8.method4868(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class93(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2879(arg0, arg1, arg2, var16, var44, (class135) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2896(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class274.method4676(class128.method1149(var46)).field3451 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class135 var49;
            class135 var50;
            if (var8.field3463 == -1 && var8.field3481 == null) {
                var49 = var8.method4868(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4868(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class93(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
                var50 = new class93(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3463, true, (class135) null);
            }
            arg6.method2879(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field496[arg4] * var45, field510[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("bl.d(Les;[Lfw;B)V")
    public static final void method1633(class133 arg0, class172[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field492[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field492[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3380(var3, var4);
                        }
                    }
                }
            }
        }
        field491 += (int) (Math.random() * 5.0D) - 2;
        if (field491 < -8) {
            field491 = -8;
        }
        if (field491 > 8) {
            field491 = 8;
        }
        field505 += (int) (Math.random() * 5.0D) - 2;
        if (field505 < -16) {
            field505 = -16;
        }
        if (field505 > 16) {
            field505 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field498[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field511[var6][var11 + 1][var10] - field511[var6][var11 - 1][var10];
                    int var13 = field511[var6][var11][var10 + 1] - field511[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field499[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field3298[var20] = 0;
                Statics.field494[var20] = 0;
                Statics.field3677[var20] = 0;
                Statics.field501[var20] = 0;
                Statics.field502[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field509[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class265 var26 = (class265) class265.field3352.method3902((long) var25);
                            class265 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field3356.method4494(1, var25);
                                class265 var29 = new class265();
                                if (var28 != null) {
                                    var29.method4704(new class190(var28), var25);
                                }
                                var29.method4703();
                                class265.field3352.method3908(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field3298[var22] += var27.field3355;
                            Statics.field494[var22] += var27.field3353;
                            Statics.field3677[var22] += var27.field3357;
                            Statics.field501[var22] += var27.field3358;
                            var10002 = Statics.field502[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field509[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class265 var34 = (class265) class265.field3352.method3902((long) var33);
                            class265 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field3356.method4494(1, var33);
                                class265 var37 = new class265();
                                if (var36 != null) {
                                    var37.method4704(new class190(var36), var33);
                                }
                                var37.method4703();
                                class265.field3352.method3908(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field3298[var22] -= var35.field3355;
                            Statics.field494[var22] -= var35.field3353;
                            Statics.field3677[var22] -= var35.field3357;
                            Statics.field501[var22] -= var35.field3358;
                            var10002 = Statics.field502[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var39 = 0;
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    for (int var44 = -5; var44 < 109; var44++) {
                        int var45 = var44 + 5;
                        if (var45 >= 0 && var45 < 104) {
                            var39 += Statics.field3298[var45];
                            var40 += Statics.field494[var45];
                            var41 += Statics.field3677[var45];
                            var42 += Statics.field501[var45];
                            var43 += Statics.field502[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field3298[var46];
                            var40 -= Statics.field494[var46];
                            var41 -= Statics.field3677[var46];
                            var42 -= Statics.field501[var46];
                            var43 -= Statics.field502[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field826 || (field492[0][var21][var44] & 0x2) != 0 || (field492[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field493) {
                                field493 = var6;
                            }
                            int var47 = Statics.field509[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field495[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field511[var6][var21][var44];
                                int var50 = field511[var6][var21 + 1][var44];
                                int var51 = field511[var6][var21 + 1][var44 + 1];
                                int var52 = field511[var6][var21][var44 + 1];
                                int var53 = Statics.field499[var21][var44];
                                int var54 = Statics.field499[var21 + 1][var44];
                                int var55 = Statics.field499[var21 + 1][var44 + 1];
                                int var56 = Statics.field499[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method18(var59, var60, var61);
                                    int var62 = field491 + var59 & 0xFF;
                                    int var63 = field505 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method18(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field504[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class278.method3135(var48 - 1).field3586) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field503[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class130.field1761[method160(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method2928(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method160(var57, var53), method160(var57, var54), method160(var57, var55), method160(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field504[var6][var21][var44] + 1;
                                    byte var67 = Statics.field497[var6][var21][var44];
                                    class278 var68 = class278.method3135(var48 - 1);
                                    int var69 = var68.field3589;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1765.method2546(var69);
                                        var71 = -1;
                                    } else if (var68.field3588 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method18(var68.field3592, var68.field3590, var68.field3594);
                                        int var72 = field491 + var68.field3592 & 0xFF;
                                        int var73 = field505 + var68.field3594;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method18(var72, var68.field3590, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class130.field1761[method2541(var70, 96)];
                                    }
                                    if (var68.field3593 != -1) {
                                        int var75 = field491 + var68.field3597 & 0xFF;
                                        int var76 = field505 + var68.field3591;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method18(var75, var68.field3596, var76);
                                        var74 = class130.field1761[method2541(var77, 96)];
                                    }
                                    arg0.method2928(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method160(var57, var53), method160(var57, var54), method160(var57, var55), method160(var57, var56), method2541(var71, var53), method2541(var71, var54), method2541(var71, var55), method2541(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field492[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field492[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method2874(var6, var79, var78, var84);
                }
            }
            Statics.field509[var6] = (byte[][]) null;
            Statics.field495[var6] = (byte[][]) null;
            Statics.field504[var6] = (byte[][]) null;
            Statics.field497[var6] = (byte[][]) null;
            Statics.field498[var6] = (byte[][]) null;
        }
        arg0.method2901(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field492[1][var85][var86] & 0x2) == 2) {
                    arg0.method2872(var85, var86);
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
                        if ((Statics.field503[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field503[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field503[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label361: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field503[var96 - 1][var93][var98] & var87) == 0) {
                                        break label361;
                                    }
                                }
                                var96--;
                            }
                            label350: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field503[var97 + 1][var93][var99] & var87) == 0) {
                                        break label350;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field511[var97][var93][var94] - var101;
                                int var103 = field511[var96][var93][var94];
                                class133.method2873(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field503[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field503[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field503[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field503[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label414: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field503[var108 - 1][var110][var92] & var88) == 0) {
                                        break label414;
                                    }
                                }
                                var108--;
                            }
                            label403: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field503[var109 + 1][var111][var92] & var88) == 0) {
                                        break label403;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field511[var109][var106][var92] - var113;
                                int var115 = field511[var108][var106][var92];
                                class133.method2873(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field503[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field503[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field503[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field503[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label467: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field503[var91][var118 - 1][var122] & var89) == 0) {
                                        break label467;
                                    }
                                }
                                var118--;
                            }
                            label456: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field503[var91][var119 + 1][var123] & var89) == 0) {
                                        break label456;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field511[var91][var118][var120];
                                class133.method2873(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field503[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fu.i(IIIB)I")
    public static final int method3239(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method58(var3, var5);
        int var8 = method58(var3 + 1, var5);
        int var9 = method58(var3, var5 + 1);
        int var10 = method58(var3 + 1, var5 + 1);
        int var11 = 65536 - class130.field1769[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class130.field1769[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class130.field1769[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("z.m(III)I")
    public static final int method58(int arg0, int arg1) {
        int var2 = method8(arg0 - 1, arg1 - 1) + method8(arg0 + 1, arg1 - 1) + method8(arg0 - 1, arg1 + 1) + method8(arg0 + 1, arg1 + 1);
        int var3 = method8(arg0 - 1, arg1) + method8(arg0 + 1, arg1) + method8(arg0, arg1 - 1) + method8(arg0, arg1 + 1);
        int var4 = method8(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("h.v(III)I")
    public static final int method8(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("r.r(III)I")
    public static final int method160(int arg0, int arg1) {
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

    @ObfuscatedName("dn.x(III)I")
    public static final int method2541(int arg0, int arg1) {
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

    @ObfuscatedName("l.y(IIIB)I")
    public static final int method18(int arg0, int arg1, int arg2) {
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
