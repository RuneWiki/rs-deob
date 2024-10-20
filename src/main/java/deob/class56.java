package deob;

@ObfuscatedName("bk")
public final class class56 {

    @ObfuscatedName("bk.c")
    public static int[][][] field516 = new int[4][105][105];

    @ObfuscatedName("bk.t")
    public static byte[][][] field506 = new byte[4][104][104];

    @ObfuscatedName("bk.o")
    public static int field505 = 99;

    @ObfuscatedName("bk.z")
    public static final int[] field509 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bk.y")
    public static final int[] field514 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bk.f")
    public static final int[] field507 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bk.b")
    public static final int[] field517 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bk.r")
    public static final int[] field504 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bk.s")
    public static final int[] field518 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bk.a")
    public static int field513 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bk.u")
    public static int field520 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.c(B)V")
    public static void method1987() {
        Statics.field503 = (byte[][][]) null;
        Statics.field515 = (byte[][][]) null;
        Statics.field508 = (byte[][][]) null;
        Statics.field519 = (byte[][][]) null;
        Statics.field1941 = (int[][][]) null;
        Statics.field566 = (byte[][][]) null;
        Statics.field510 = (int[][]) null;
        Statics.field3549 = null;
        Statics.field3458 = null;
        Statics.field273 = null;
        Statics.field353 = null;
        Statics.field1530 = null;
    }

    @ObfuscatedName("io.t(IIIIB)V")
    public static final void method4133(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field566[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field516[0][var5][var4] = field516[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field516[0][var5][var4] = field516[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field516[0][var5][var4] = field516[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field516[0][var5][var4] = field516[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bj.o([BIIIIIII[Lfv;I)V")
    public static final void method1683(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class173[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2087[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class301 var11 = new class301(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method362(var11, arg1, arg2 + class217.method3058(var13 & 0x7, var14 & 0x7, arg7), arg3 + class217.method2795(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method362(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.e(Lkp;IIIIIIS)V")
    public static final void method362(class301 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method5129();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method5129();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method5129();
                }
            }
            return;
        }
        field506[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5129();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field516[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method36(var10 + 45365, var11 + 91923, 4) - 128 + (method36(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method36(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field516[arg1][arg2][arg3] = field516[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method5129();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field516[0][arg2][arg3] = -var15 * 8;
                } else {
                    field516[arg1][arg2][arg3] = field516[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field515[arg1][arg2][arg3] = arg0.method5130();
                Statics.field508[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field519[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field506[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field503[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("kv.i([BIIB)Z")
    public static final boolean method5430(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class301 var4 = new class301(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method5142();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method5143();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method5129() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class255 var16 = class255.method3070(var5);
                        if (var13 != 22 || !client.field844 || var16.field3364 != 0 || var16.field3362 == 1 || var16.field3383) {
                            if (!var16.method4317()) {
                                client.field701++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method5143();
                if (var9 == 0) {
                    break;
                }
                var4.method5129();
            }
        }
    }

    @ObfuscatedName("fn.g([BIILem;[Lfv;I)V")
    public static final void method3219(byte[] arg0, int arg1, int arg2, class134 arg3, class173[] arg4) {
        class301 var5 = new class301(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method5142();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method5143();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method5129();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field506[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class173 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method3951(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ik.d(IIIIIILem;Lfv;I)V")
    public static final void method3951(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class173 arg7) {
        if (client.field844 && (field506[0][arg1][arg2] & 0x2) == 0 && (field506[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field505) {
            field505 = arg0;
        }
        class255 var8 = class255.method3070(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3361;
            var10 = var8.field3360;
        } else {
            var9 = var8.field3360;
            var10 = var8.field3361;
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
        int[][] var15 = field516[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class129.method855(arg1, arg2, 2, var8.field3364 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3385 == 1) {
            var21 += 256;
        }
        if (var8.method4285()) {
            class76.method1761(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field844 || var8.field3364 != 0 || var8.field3362 == 1 || var8.field3383) {
                class136 var22;
                if (var8.field3368 == -1 && var8.field3386 == null) {
                    var22 = var8.method4314(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class94(arg3, 22, arg4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
                }
                arg6.method2897(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3362 == 1 && arg7 != null) {
                    arg7.method3303(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class136 var48;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var48 = var8.method4314(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class94(arg3, 10, arg4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            if (var48 != null && arg6.method2901(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3376) {
                int var49 = 15;
                if (var48 instanceof class128) {
                    var49 = ((class128) var48).method2688() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field566[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field566[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3302(arg1, arg2, var9, var10, var8.field3363);
            }
        } else if (arg5 >= 12) {
            class136 var23;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var23 = var8.method4314(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2901(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1941[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3302(arg1, arg2, var9, var10, var8.field3363);
            }
        } else if (arg5 == 0) {
            class136 var24;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var24 = var8.method4314(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class94(arg3, 0, arg4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2915(arg0, arg1, arg2, var16, var24, (class136) null, field509[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3376) {
                    Statics.field566[arg0][arg1][arg2] = 50;
                    Statics.field566[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3358) {
                    Statics.field1941[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3376) {
                    Statics.field566[arg0][arg1][arg2 + 1] = 50;
                    Statics.field566[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3358) {
                    Statics.field1941[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3376) {
                    Statics.field566[arg0][arg1 + 1][arg2] = 50;
                    Statics.field566[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3358) {
                    Statics.field1941[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3376) {
                    Statics.field566[arg0][arg1][arg2] = 50;
                    Statics.field566[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3358) {
                    Statics.field1941[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3311(arg1, arg2, arg5, arg4, var8.field3363);
            }
            if (var8.field3391 != 16) {
                arg6.method2907(arg0, arg1, arg2, var8.field3391);
            }
        } else if (arg5 == 1) {
            class136 var25;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var25 = var8.method4314(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class94(arg3, 1, arg4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2915(arg0, arg1, arg2, var16, var25, (class136) null, field514[arg4], 0, var19, var21);
            if (var8.field3376) {
                if (arg4 == 0) {
                    Statics.field566[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field566[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field566[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field566[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3311(arg1, arg2, arg5, arg4, var8.field3363);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class136 var27;
            class136 var28;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var27 = var8.method4314(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4314(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class94(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
                var28 = new class94(arg3, 2, var26, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2915(arg0, arg1, arg2, var16, var27, var28, field509[arg4], field509[var26], var19, var21);
            if (var8.field3358) {
                if (arg4 == 0) {
                    Statics.field1941[arg0][arg1][arg2] |= 0x249;
                    Statics.field1941[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1941[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1941[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1941[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1941[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1941[arg0][arg1][arg2] |= 0x492;
                    Statics.field1941[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3311(arg1, arg2, arg5, arg4, var8.field3363);
            }
            if (var8.field3391 != 16) {
                arg6.method2907(arg0, arg1, arg2, var8.field3391);
            }
        } else if (arg5 == 3) {
            class136 var29;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var29 = var8.method4314(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class94(arg3, 3, arg4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2915(arg0, arg1, arg2, var16, var29, (class136) null, field514[arg4], 0, var19, var21);
            if (var8.field3376) {
                if (arg4 == 0) {
                    Statics.field566[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field566[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field566[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field566[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3311(arg1, arg2, arg5, arg4, var8.field3363);
            }
        } else if (arg5 == 9) {
            class136 var30;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var30 = var8.method4314(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2901(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3362 != 0 && arg7 != null) {
                arg7.method3302(arg1, arg2, var9, var10, var8.field3363);
            }
            if (var8.field3391 != 16) {
                arg6.method2907(arg0, arg1, arg2, var8.field3391);
            }
        } else if (arg5 == 4) {
            class136 var31;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var31 = var8.method4314(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2999(arg0, arg1, arg2, var16, var31, (class136) null, field509[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2935(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class255.method3070(class129.method65(var33)).field3391;
            }
            class136 var35;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var35 = var8.method4314(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2999(arg0, arg1, arg2, var16, var35, (class136) null, field509[arg4], 0, field507[arg4] * var32, field517[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2935(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class255.method3070(class129.method65(var37)).field3391 / 2;
            }
            class136 var39;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var39 = var8.method4314(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2999(arg0, arg1, arg2, var16, var39, (class136) null, 256, arg4, field504[arg4] * var36, field518[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class136 var41;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var41 = var8.method4314(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class94(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2999(arg0, arg1, arg2, var16, var41, (class136) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2935(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class255.method3070(class129.method65(var43)).field3391 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class136 var46;
            class136 var47;
            if (var8.field3368 == -1 && var8.field3386 == null) {
                var46 = var8.method4314(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4314(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
                var47 = new class94(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3368, true, (class136) null);
            }
            arg6.method2999(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field504[arg4] * var42, field518[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("h.l(Lem;[Lfv;I)V")
    public static final void method132(class134 arg0, class173[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field506[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field506[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3326(var3, var4);
                        }
                    }
                }
            }
        }
        field513 += (int) (Math.random() * 5.0D) - 2;
        if (field513 < -8) {
            field513 = -8;
        }
        if (field513 > 8) {
            field513 = 8;
        }
        field520 += (int) (Math.random() * 5.0D) - 2;
        if (field520 < -16) {
            field520 = -16;
        }
        if (field520 > 16) {
            field520 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field566[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field516[var6][var11 + 1][var10] - field516[var6][var11 - 1][var10];
                    int var13 = field516[var6][var11][var10 + 1] - field516[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field510[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field3549[var20] = 0;
                Statics.field3458[var20] = 0;
                Statics.field273[var20] = 0;
                Statics.field353[var20] = 0;
                Statics.field1530[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field503[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class246 var25 = class246.method1883(var24 - 1);
                            Statics.field3549[var22] += var25.field3257;
                            Statics.field3458[var22] += var25.field3258;
                            Statics.field273[var22] += var25.field3256;
                            Statics.field353[var22] += var25.field3260;
                            var10002 = Statics.field1530[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field503[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class246 var28 = class246.method1883(var27 - 1);
                            Statics.field3549[var22] -= var28.field3257;
                            Statics.field3458[var22] -= var28.field3258;
                            Statics.field273[var22] -= var28.field3256;
                            Statics.field353[var22] -= var28.field3260;
                            var10002 = Statics.field1530[var22]--;
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
                            var29 += Statics.field3549[var35];
                            var30 += Statics.field3458[var35];
                            var31 += Statics.field273[var35];
                            var32 += Statics.field353[var35];
                            var33 += Statics.field1530[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field3549[var36];
                            var30 -= Statics.field3458[var36];
                            var31 -= Statics.field273[var36];
                            var32 -= Statics.field353[var36];
                            var33 -= Statics.field1530[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field844 || (field506[0][var21][var34] & 0x2) != 0 || (field506[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field505) {
                                field505 = var6;
                            }
                            int var37 = Statics.field503[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field515[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field516[var6][var21][var34];
                                int var40 = field516[var6][var21 + 1][var34];
                                int var41 = field516[var6][var21 + 1][var34 + 1];
                                int var42 = field516[var6][var21][var34 + 1];
                                int var43 = Statics.field510[var21][var34];
                                int var44 = Statics.field510[var21 + 1][var34];
                                int var45 = Statics.field510[var21 + 1][var34 + 1];
                                int var46 = Statics.field510[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method3409(var49, var50, var51);
                                    int var52 = field513 + var49 & 0xFF;
                                    int var53 = field520 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method3409(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field508[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class259.method1023(var38 - 1).field3501) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field1941[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class131.field1776[method2094(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method3038(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2094(var47, var43), method2094(var47, var44), method2094(var47, var45), method2094(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field508[var6][var21][var34] + 1;
                                    byte var57 = Statics.field519[var6][var21][var34];
                                    class259 var58 = class259.method1023(var38 - 1);
                                    int var59 = var58.field3507;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1777.method2544(var59);
                                        var61 = -1;
                                    } else if (var58.field3498 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method3409(var58.field3503, var58.field3504, var58.field3505);
                                        int var62 = field513 + var58.field3503 & 0xFF;
                                        int var63 = field520 + var58.field3505;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method3409(var62, var58.field3504, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class131.field1776[method502(var60, 96)];
                                    }
                                    if (var58.field3500 != -1) {
                                        int var65 = field513 + var58.field3499 & 0xFF;
                                        int var66 = field520 + var58.field3508;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method3409(var65, var58.field3506, var66);
                                        var64 = class131.field1776[method502(var67, 96)];
                                    }
                                    arg0.method3038(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method2094(var47, var43), method2094(var47, var44), method2094(var47, var45), method2094(var47, var46), method502(var61, var43), method502(var61, var44), method502(var61, var45), method502(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field506[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field506[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2895(var6, var69, var68, var74);
                }
            }
            Statics.field503[var6] = (byte[][]) null;
            Statics.field515[var6] = (byte[][]) null;
            Statics.field508[var6] = (byte[][]) null;
            Statics.field519[var6] = (byte[][]) null;
            Statics.field566[var6] = (byte[][]) null;
        }
        arg0.method2922(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field506[1][var75][var76] & 0x2) == 2) {
                    arg0.method2893(var75, var76);
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
                        if ((Statics.field1941[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field1941[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field1941[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field1941[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field1941[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field516[var87][var83][var84] - var91;
                                int var93 = field516[var86][var83][var84];
                                class134.method2894(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field1941[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1941[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field1941[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field1941[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field1941[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field1941[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field516[var99][var96][var82] - var103;
                                int var105 = field516[var98][var96][var82];
                                class134.method2894(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field1941[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1941[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field1941[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field1941[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field1941[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field1941[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field516[var81][var108][var110];
                                class134.method2894(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field1941[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.j(IIII)I")
    public static final int method36(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3151(var3, var5);
        int var8 = method3151(var3 + 1, var5);
        int var9 = method3151(var3, var5 + 1);
        int var10 = method3151(var3 + 1, var5 + 1);
        int var11 = 65536 - class131.field1781[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class131.field1781[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class131.field1781[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ez.m(IIB)I")
    public static final int method3151(int arg0, int arg1) {
        int var2 = method4917(arg0 - 1, arg1 - 1) + method4917(arg0 + 1, arg1 - 1) + method4917(arg0 - 1, arg1 + 1) + method4917(arg0 + 1, arg1 + 1);
        int var3 = method4917(arg0 - 1, arg1) + method4917(arg0 + 1, arg1) + method4917(arg0, arg1 - 1) + method4917(arg0, arg1 + 1);
        int var4 = method4917(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("kl.p(III)I")
    public static final int method4917(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cw.h(IIB)I")
    public static final int method2094(int arg0, int arg1) {
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

    @ObfuscatedName("ax.v(III)I")
    public static final int method502(int arg0, int arg1) {
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

    @ObfuscatedName("gp.n(IIII)I")
    public static final int method3409(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("w.x(III)Z")
    public static final boolean method167(int arg0, int arg1) {
        class255 var2 = class255.method3070(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4276(arg1);
    }

    @ObfuscatedName("bp.w(IIIIIIILem;Lfv;I)V")
    public static final void method1021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class134 arg7, class173 arg8) {
        class255 var9 = class255.method3070(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3361;
            var11 = var9.field3360;
        } else {
            var10 = var9.field3360;
            var11 = var9.field3361;
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
        int[][] var16 = field516[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class129.method855(arg2, arg3, 2, var9.field3364 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3385 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class136 var23;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var23 = var9.method4291(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class94(arg4, 22, arg5, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2897(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3362 == 1) {
                arg8.method3303(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class136 var49;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var49 = var9.method4291(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class94(arg4, 10, arg5, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            if (var49 != null) {
                arg7.method2901(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3362 != 0) {
                arg8.method3302(arg2, arg3, var10, var11, var9.field3363);
            }
        } else if (arg6 >= 12) {
            class136 var24;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var24 = var9.method4291(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2901(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3362 != 0) {
                arg8.method3302(arg2, arg3, var10, var11, var9.field3363);
            }
        } else if (arg6 == 0) {
            class136 var25;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var25 = var9.method4291(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class94(arg4, 0, arg5, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2915(arg0, arg2, arg3, var17, var25, (class136) null, field509[arg5], 0, var20, var22);
            if (var9.field3362 != 0) {
                arg8.method3311(arg2, arg3, arg6, arg5, var9.field3363);
            }
        } else if (arg6 == 1) {
            class136 var26;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var26 = var9.method4291(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class94(arg4, 1, arg5, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2915(arg0, arg2, arg3, var17, var26, (class136) null, field514[arg5], 0, var20, var22);
            if (var9.field3362 != 0) {
                arg8.method3311(arg2, arg3, arg6, arg5, var9.field3363);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class136 var28;
            class136 var29;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var28 = var9.method4291(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4291(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class94(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3368, true, (class136) null);
                var29 = new class94(arg4, 2, var27, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2915(arg0, arg2, arg3, var17, var28, var29, field509[arg5], field509[var27], var20, var22);
            if (var9.field3362 != 0) {
                arg8.method3311(arg2, arg3, arg6, arg5, var9.field3363);
            }
        } else if (arg6 == 3) {
            class136 var30;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var30 = var9.method4291(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class94(arg4, 3, arg5, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2915(arg0, arg2, arg3, var17, var30, (class136) null, field514[arg5], 0, var20, var22);
            if (var9.field3362 != 0) {
                arg8.method3311(arg2, arg3, arg6, arg5, var9.field3363);
            }
        } else if (arg6 == 9) {
            class136 var31;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var31 = var9.method4291(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2901(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3362 != 0) {
                arg8.method3302(arg2, arg3, var10, var11, var9.field3363);
            }
        } else if (arg6 == 4) {
            class136 var32;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var32 = var9.method4291(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2999(arg0, arg2, arg3, var17, var32, (class136) null, field509[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2935(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class255.method3070(class129.method65(var34)).field3391;
            }
            class136 var36;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var36 = var9.method4291(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2999(arg0, arg2, arg3, var17, var36, (class136) null, field509[arg5], 0, field507[arg5] * var33, field517[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2935(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class255.method3070(class129.method65(var38)).field3391 / 2;
            }
            class136 var40;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var40 = var9.method4291(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2999(arg0, arg2, arg3, var17, var40, (class136) null, 256, arg5, field504[arg5] * var37, field518[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class136 var42;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var42 = var9.method4291(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class94(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2999(arg0, arg2, arg3, var17, var42, (class136) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2935(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class255.method3070(class129.method65(var44)).field3391 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class136 var47;
            class136 var48;
            if (var9.field3368 == -1 && var9.field3386 == null) {
                var47 = var9.method4291(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4291(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3368, true, (class136) null);
                var48 = new class94(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3368, true, (class136) null);
            }
            arg7.method2999(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field504[arg5] * var43, field518[arg5] * var43, var20, var22);
        }
    }
}
