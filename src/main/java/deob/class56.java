package deob;

@ObfuscatedName("bd")
public final class class56 {

    @ObfuscatedName("bd.a")
    public static int[][][] field508 = new int[4][105][105];

    @ObfuscatedName("bd.s")
    public static byte[][][] field506 = new byte[4][104][104];

    @ObfuscatedName("bd.g")
    public static int field507 = 99;

    @ObfuscatedName("bd.k")
    public static final int[] field516 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bd.v")
    public static final int[] field519 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bd.d")
    public static final int[] field517 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bd.w")
    public static final int[] field520 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bd.i")
    public static final int[] field521 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bd.c")
    public static final int[] field511 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bd.j")
    public static int field515 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bd.z")
    public static int field522 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jr.a(I)V")
    public static void method4725() {
        field507 = 99;
        Statics.field518 = new byte[4][104][104];
        Statics.field509 = new byte[4][104][104];
        Statics.field510 = new byte[4][104][104];
        Statics.field505 = new byte[4][104][104];
        Statics.field3315 = new int[4][105][105];
        Statics.field512 = new byte[4][105][105];
        Statics.field1964 = new int[105][105];
        Statics.field101 = new int[104];
        Statics.field513 = new int[104];
        Statics.field3210 = new int[104];
        Statics.field1303 = new int[104];
        Statics.field514 = new int[104];
    }

    @ObfuscatedName("ba.s(IIIIB)V")
    public static final void method1891(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field512[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field508[0][var5][var4] = field508[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field508[0][var5][var4] = field508[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field508[0][var5][var4] = field508[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field508[0][var5][var4] = field508[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fo.g([BIIII[Lfk;I)V")
    public static final void method3234(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class172[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2108[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class190 var9 = new class190(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method196(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("m.x([BIIIIIII[Lfk;S)V")
    public static final void method84(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class172[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2108[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class190 var11 = new class190(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method196(var11, arg1, arg2 + class238.method3781(var13 & 0x7, var14 & 0x7, arg7), arg3 + class238.method1662(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method196(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.h(Lgx;IIIIIIB)V")
    public static final void method196(class190 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3443();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3443();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3443();
                }
            }
            return;
        }
        field506[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3443();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field508[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method4069(var10 + 45365, var11 + 91923, 4) - 128 + (method4069(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method4069(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field508[arg1][arg2][arg3] = field508[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3443();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field508[0][arg2][arg3] = -var15 * 8;
                } else {
                    field508[arg1][arg2][arg3] = field508[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field509[arg1][arg2][arg3] = arg0.method3599();
                Statics.field510[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field505[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field506[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field518[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("lr.f([BIIB)Z")
    public static final boolean method5628(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class190 var4 = new class190(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3457();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3638();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3443() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class275 var16 = class275.method117(var5);
                        if (var13 != 22 || !client.field654 || var16.field3472 != 0 || var16.field3457 == 1 || var16.field3471) {
                            if (!var16.method4843()) {
                                client.field704++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3638();
                if (var9 == 0) {
                    break;
                }
                var4.method3443();
            }
        }
    }

    @ObfuscatedName("cz.p([BIILen;[Lfk;I)V")
    public static final void method2287(byte[] arg0, int arg1, int arg2, class133 arg3, class172[] arg4) {
        class190 var5 = new class190(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3457();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3638();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method3443();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field506[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class172 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method5288(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ba.m([BIIIIIIILen;[Lfk;S)V")
    public static final void method1889(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class133 arg8, class172[] arg9) {
        class190 var10 = new class190(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3457();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3638();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3443();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class275 var21 = class275.method117(var11);
                    int var22 = arg2 + class238.method3205(var16 & 0x7, var15 & 0x7, arg7, var21.field3491, var21.field3469, var20);
                    int var23 = arg3 + class238.method3288(var16 & 0x7, var15 & 0x7, arg7, var21.field3491, var21.field3469, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field506[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class172 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method5288(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("kg.q(IIIIIILen;Lfk;I)V")
    public static final void method5288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class133 arg6, class172 arg7) {
        if (client.field654 && (field506[0][arg1][arg2] & 0x2) == 0 && (field506[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field507) {
            field507 = arg0;
        }
        class275 var8 = class275.method117(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3469;
            var10 = var8.field3491;
        } else {
            var9 = var8.field3491;
            var10 = var8.field3469;
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
        int[][] var15 = field508[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class128.method2069(arg1, arg2, 2, var8.field3472 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3493 == 1) {
            var21 += 256;
        }
        if (var8.method4867()) {
            class75.method3058(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field654 || var8.field3472 != 0 || var8.field3457 == 1 || var8.field3471) {
                class135 var22;
                if (var8.field3476 == -1 && var8.field3494 == null) {
                    var22 = var8.method4844(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class93(arg3, 22, arg4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
                }
                arg6.method2884(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3457 == 1 && arg7 != null) {
                    arg7.method3332(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class135 var48;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var48 = var8.method4844(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class93(arg3, 10, arg4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            if (var48 != null && arg6.method2888(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3484) {
                int var49 = 15;
                if (var48 instanceof class127) {
                    var49 = ((class127) var48).method2717() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field512[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field512[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3321(arg1, arg2, var9, var10, var8.field3462);
            }
        } else if (arg5 >= 12) {
            class135 var23;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var23 = var8.method4844(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class93(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2888(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3315[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3321(arg1, arg2, var9, var10, var8.field3462);
            }
        } else if (arg5 == 0) {
            class135 var24;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var24 = var8.method4844(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class93(arg3, 0, arg4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2886(arg0, arg1, arg2, var16, var24, (class135) null, field516[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3484) {
                    Statics.field512[arg0][arg1][arg2] = 50;
                    Statics.field512[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3475) {
                    Statics.field3315[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3484) {
                    Statics.field512[arg0][arg1][arg2 + 1] = 50;
                    Statics.field512[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3475) {
                    Statics.field3315[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3484) {
                    Statics.field512[arg0][arg1 + 1][arg2] = 50;
                    Statics.field512[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3475) {
                    Statics.field3315[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3484) {
                    Statics.field512[arg0][arg1][arg2] = 50;
                    Statics.field512[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3475) {
                    Statics.field3315[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3333(arg1, arg2, arg5, arg4, var8.field3462);
            }
            if (var8.field3483 != 16) {
                arg6.method3054(arg0, arg1, arg2, var8.field3483);
            }
        } else if (arg5 == 1) {
            class135 var25;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var25 = var8.method4844(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class93(arg3, 1, arg4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2886(arg0, arg1, arg2, var16, var25, (class135) null, field519[arg4], 0, var19, var21);
            if (var8.field3484) {
                if (arg4 == 0) {
                    Statics.field512[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field512[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field512[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field512[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3333(arg1, arg2, arg5, arg4, var8.field3462);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class135 var27;
            class135 var28;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var27 = var8.method4844(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4844(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class93(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
                var28 = new class93(arg3, 2, var26, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2886(arg0, arg1, arg2, var16, var27, var28, field516[arg4], field516[var26], var19, var21);
            if (var8.field3475) {
                if (arg4 == 0) {
                    Statics.field3315[arg0][arg1][arg2] |= 0x249;
                    Statics.field3315[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3315[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3315[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3315[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3315[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3315[arg0][arg1][arg2] |= 0x492;
                    Statics.field3315[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3333(arg1, arg2, arg5, arg4, var8.field3462);
            }
            if (var8.field3483 != 16) {
                arg6.method3054(arg0, arg1, arg2, var8.field3483);
            }
        } else if (arg5 == 3) {
            class135 var29;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var29 = var8.method4844(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class93(arg3, 3, arg4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2886(arg0, arg1, arg2, var16, var29, (class135) null, field519[arg4], 0, var19, var21);
            if (var8.field3484) {
                if (arg4 == 0) {
                    Statics.field512[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field512[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field512[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field512[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3333(arg1, arg2, arg5, arg4, var8.field3462);
            }
        } else if (arg5 == 9) {
            class135 var30;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var30 = var8.method4844(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class93(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2888(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3457 != 0 && arg7 != null) {
                arg7.method3321(arg1, arg2, var9, var10, var8.field3462);
            }
            if (var8.field3483 != 16) {
                arg6.method3054(arg0, arg1, arg2, var8.field3483);
            }
        } else if (arg5 == 4) {
            class135 var31;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var31 = var8.method4844(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class93(arg3, 4, arg4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2887(arg0, arg1, arg2, var16, var31, (class135) null, field516[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2977(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class275.method117(class128.method2337(var33)).field3483;
            }
            class135 var35;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var35 = var8.method4844(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class93(arg3, 4, arg4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2887(arg0, arg1, arg2, var16, var35, (class135) null, field516[arg4], 0, field517[arg4] * var32, field520[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2977(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class275.method117(class128.method2337(var37)).field3483 / 2;
            }
            class135 var39;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var39 = var8.method4844(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class93(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2887(arg0, arg1, arg2, var16, var39, (class135) null, 256, arg4, field521[arg4] * var36, field511[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class135 var41;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var41 = var8.method4844(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class93(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2887(arg0, arg1, arg2, var16, var41, (class135) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2977(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class275.method117(class128.method2337(var43)).field3483 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class135 var46;
            class135 var47;
            if (var8.field3476 == -1 && var8.field3494 == null) {
                var46 = var8.method4844(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4844(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class93(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
                var47 = new class93(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3476, true, (class135) null);
            }
            arg6.method2887(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field521[arg4] * var42, field511[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("dw.b(Len;[Lfk;I)V")
    public static final void method2661(class133 arg0, class172[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field506[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field506[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3322(var3, var4);
                        }
                    }
                }
            }
        }
        field515 += (int) (Math.random() * 5.0D) - 2;
        if (field515 < -8) {
            field515 = -8;
        }
        if (field515 > 8) {
            field515 = 8;
        }
        field522 += (int) (Math.random() * 5.0D) - 2;
        if (field522 < -16) {
            field522 = -16;
        }
        if (field522 > 16) {
            field522 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field512[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field508[var6][var11 + 1][var10] - field508[var6][var11 - 1][var10];
                    int var13 = field508[var6][var11][var10 + 1] - field508[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1964[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field101[var20] = 0;
                Statics.field513[var20] = 0;
                Statics.field3210[var20] = 0;
                Statics.field1303[var20] = 0;
                Statics.field514[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field518[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class266 var26 = (class266) class266.field3370.method3885((long) var25);
                            class266 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field3366.method4422(1, var25);
                                class266 var29 = new class266();
                                if (var28 != null) {
                                    var29.method4669(new class190(var28), var25);
                                }
                                var29.method4659();
                                class266.field3370.method3878(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field101[var22] += var27.field3368;
                            Statics.field513[var22] += var27.field3369;
                            Statics.field3210[var22] += var27.field3371;
                            Statics.field1303[var22] += var27.field3365;
                            var10002 = Statics.field514[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field518[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class266 var34 = (class266) class266.field3370.method3885((long) var33);
                            class266 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field3366.method4422(1, var33);
                                class266 var37 = new class266();
                                if (var36 != null) {
                                    var37.method4669(new class190(var36), var33);
                                }
                                var37.method4659();
                                class266.field3370.method3878(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field101[var22] -= var35.field3368;
                            Statics.field513[var22] -= var35.field3369;
                            Statics.field3210[var22] -= var35.field3371;
                            Statics.field1303[var22] -= var35.field3365;
                            var10002 = Statics.field514[var22]--;
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
                            var39 += Statics.field101[var45];
                            var40 += Statics.field513[var45];
                            var41 += Statics.field3210[var45];
                            var42 += Statics.field1303[var45];
                            var43 += Statics.field514[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field101[var46];
                            var40 -= Statics.field513[var46];
                            var41 -= Statics.field3210[var46];
                            var42 -= Statics.field1303[var46];
                            var43 -= Statics.field514[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field654 || (field506[0][var21][var44] & 0x2) != 0 || (field506[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field507) {
                                field507 = var6;
                            }
                            int var47 = Statics.field518[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field509[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field508[var6][var21][var44];
                                int var50 = field508[var6][var21 + 1][var44];
                                int var51 = field508[var6][var21 + 1][var44 + 1];
                                int var52 = field508[var6][var21][var44 + 1];
                                int var53 = Statics.field1964[var21][var44];
                                int var54 = Statics.field1964[var21 + 1][var44];
                                int var55 = Statics.field1964[var21 + 1][var44 + 1];
                                int var56 = Statics.field1964[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method82(var59, var60, var61);
                                    int var62 = field515 + var59 & 0xFF;
                                    int var63 = field522 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method82(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field510[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class279 var66 = (class279) class279.field3604.method3885((long) var65);
                                        class279 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field3607.method4422(4, var65);
                                            class279 var69 = new class279();
                                            if (var68 != null) {
                                                var69.method4993(new class190(var68), var65);
                                            }
                                            var69.method4999();
                                            class279.field3604.method3878(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field3603) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field3315[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class130.field1775[method277(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method2894(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method277(var57, var53), method277(var57, var54), method277(var57, var55), method277(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field510[var6][var21][var44] + 1;
                                    byte var72 = Statics.field505[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class279 var74 = (class279) class279.field3604.method3885((long) var73);
                                    class279 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field3607.method4422(4, var73);
                                        class279 var77 = new class279();
                                        if (var76 != null) {
                                            var77.method4993(new class190(var76), var73);
                                        }
                                        var77.method4999();
                                        class279.field3604.method3878(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field3605;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1756.method2564(var79);
                                        var81 = -1;
                                    } else if (var75.field3609 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method82(var75.field3614, var75.field3610, var75.field3611);
                                        int var82 = field515 + var75.field3614 & 0xFF;
                                        int var83 = field522 + var75.field3611;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method82(var82, var75.field3610, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class130.field1775[method3784(var80, 96)];
                                    }
                                    if (var75.field3608 != -1) {
                                        int var85 = field515 + var75.field3612 & 0xFF;
                                        int var86 = field522 + var75.field3606;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method82(var85, var75.field3613, var86);
                                        var84 = class130.field1775[method3784(var87, 96)];
                                    }
                                    arg0.method2894(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method277(var57, var53), method277(var57, var54), method277(var57, var55), method277(var57, var56), method3784(var81, var53), method3784(var81, var54), method3784(var81, var55), method3784(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method3039(var6, var89, var88, method1925(var6, var89, var88));
                }
            }
            Statics.field518[var6] = (byte[][]) null;
            Statics.field509[var6] = (byte[][]) null;
            Statics.field510[var6] = (byte[][]) null;
            Statics.field505[var6] = (byte[][]) null;
            Statics.field512[var6] = (byte[][]) null;
        }
        arg0.method2909(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field506[1][var90][var91] & 0x2) == 2) {
                    arg0.method3021(var90, var91);
                }
            }
        }
        int var92 = 1;
        int var93 = 2;
        int var94 = 4;
        for (int var95 = 0; var95 < 4; var95++) {
            if (var95 > 0) {
                var92 <<= 0x3;
                var93 <<= 0x3;
                var94 <<= 0x3;
            }
            for (int var96 = 0; var96 <= var95; var96++) {
                for (int var97 = 0; var97 <= 104; var97++) {
                    for (int var98 = 0; var98 <= 104; var98++) {
                        if ((Statics.field3315[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field3315[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field3315[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label373: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field3315[var101 - 1][var98][var103] & var92) == 0) {
                                        break label373;
                                    }
                                }
                                var101--;
                            }
                            label362: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field3315[var102 + 1][var98][var104] & var92) == 0) {
                                        break label362;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field508[var102][var98][var99] - var106;
                                int var108 = field508[var101][var98][var99];
                                class133.method2881(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field3315[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3315[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field3315[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field3315[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label426: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field3315[var113 - 1][var115][var97] & var93) == 0) {
                                        break label426;
                                    }
                                }
                                var113--;
                            }
                            label415: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field3315[var114 + 1][var116][var97] & var93) == 0) {
                                        break label415;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field508[var114][var111][var97] - var118;
                                int var120 = field508[var113][var111][var97];
                                class133.method2881(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field3315[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3315[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field3315[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field3315[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label479: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field3315[var96][var123 - 1][var127] & var94) == 0) {
                                        break label479;
                                    }
                                }
                                var123--;
                            }
                            label468: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field3315[var96][var124 + 1][var128] & var94) == 0) {
                                        break label468;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field508[var96][var123][var125];
                                class133.method2881(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field3315[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.n(IIIB)I")
    public static int method1925(int arg0, int arg1, int arg2) {
        if ((field506[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field506[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("hd.e(IIII)I")
    public static final int method4069(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method507(var3, var5);
        int var8 = method507(var3 + 1, var5);
        int var9 = method507(var3, var5 + 1);
        int var10 = method507(var3 + 1, var5 + 1);
        int var11 = method4552(var7, var8, var4, arg2);
        int var12 = method4552(var9, var10, var4, arg2);
        return method4552(var11, var12, var6, arg2);
    }

    @ObfuscatedName("io.r(IIIII)I")
    public static final int method4552(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class130.field1768[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("aa.t(III)I")
    public static final int method507(int arg0, int arg1) {
        int var2 = method165(arg0 - 1, arg1 - 1) + method165(arg0 + 1, arg1 - 1) + method165(arg0 - 1, arg1 + 1) + method165(arg0 + 1, arg1 + 1);
        int var3 = method165(arg0 - 1, arg1) + method165(arg0 + 1, arg1) + method165(arg0, arg1 - 1) + method165(arg0, arg1 + 1);
        int var4 = method165(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("l.l(III)I")
    public static final int method165(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("w.o(III)I")
    public static final int method277(int arg0, int arg1) {
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

    @ObfuscatedName("gc.u(III)I")
    public static final int method3784(int arg0, int arg1) {
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

    @ObfuscatedName("m.y(IIIB)I")
    public static final int method82(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("az.k(IIB)Z")
    public static final boolean method697(int arg0, int arg1) {
        class275 var2 = class275.method117(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4863(arg1);
    }
}
