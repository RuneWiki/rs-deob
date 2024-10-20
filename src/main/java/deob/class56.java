package deob;

@ObfuscatedName("bn")
public final class class56 {

    @ObfuscatedName("bn.s")
    public static int[][][] field472 = new int[4][105][105];

    @ObfuscatedName("bn.j")
    public static byte[][][] field473 = new byte[4][104][104];

    @ObfuscatedName("bn.i")
    public static int field474 = 99;

    @ObfuscatedName("bn.z")
    public static final int[] field480 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bn.a")
    public static final int[] field481 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bn.w")
    public static final int[] field482 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bn.l")
    public static final int[] field483 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bn.h")
    public static final int[] field479 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bn.v")
    public static final int[] field485 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bn.m")
    public static int field478 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bn.o")
    public static int field487 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.s(IIIII)V")
    public static final void method3378(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2322[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field472[0][var5][var4] = field472[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field472[0][var5][var4] = field472[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field472[0][var5][var4] = field472[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field472[0][var5][var4] = field472[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("jg.j([BIIIIIII[Lfm;I)V")
    public static final void method4577(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class173[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2065[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class300 var11 = new class300(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class217.method2085(var13 & 0x7, var14 & 0x7, arg7);
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
                        method475(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method475(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("lz.i(IIII)V")
    public static final void method5387(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field472[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field472[arg0][arg1][arg2 + var5] = field472[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field472[arg0][arg1 + var6][arg2] = field472[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field472[arg0][arg1 - 1][arg2] != 0) {
            field472[arg0][arg1][arg2] = field472[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field472[arg0][arg1][arg2 - 1] != 0) {
            field472[arg0][arg1][arg2] = field472[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field472[arg0][arg1 - 1][arg2 - 1] != 0) {
            field472[arg0][arg1][arg2] = field472[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("az.k(Lky;IIIIIII)V")
    public static final void method475(class300 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method5179();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method5179();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method5179();
                }
            }
            return;
        }
        field473[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5179();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field472[0][arg2][arg3] = -method78(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field472[arg1][arg2][arg3] = field472[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method5179();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field472[0][arg2][arg3] = -var8 * 8;
                } else {
                    field472[arg1][arg2][arg3] = field472[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field4062[arg1][arg2][arg3] = arg0.method5034();
                Statics.field2493[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field476[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field473[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field486[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("m.u([BIII)Z")
    public static final boolean method267(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class300 var4 = new class300(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method5209();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method5113();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method5179() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class254 var16 = class254.method3676(var5);
                        if (var13 != 22 || !client.field829 || var16.field3350 != 0 || var16.field3348 == 1 || var16.field3330) {
                            if (!var16.method4189()) {
                                client.field679++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method5113();
                if (var9 == 0) {
                    break;
                }
                var4.method5179();
            }
        }
    }

    @ObfuscatedName("z.n([BIILea;[Lfm;I)V")
    public static final void method180(byte[] arg0, int arg1, int arg2, class134 arg3, class173[] arg4) {
        class300 var5 = new class300(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method5209();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method5113();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method5179();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field473[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class173 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method486(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("an.t(IIIIIILea;Lfm;I)V")
    public static final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class173 arg7) {
        if (client.field829 && (field473[0][arg1][arg2] & 0x2) == 0 && (field473[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field474) {
            field474 = arg0;
        }
        class254 var8 = class254.method3676(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3347;
            var10 = var8.field3372;
        } else {
            var9 = var8.field3372;
            var10 = var8.field3347;
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
        int[][] var15 = field472[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class129.method349(arg1, arg2, 2, var8.field3350 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3364 == 1) {
            var21 += 256;
        }
        if (var8.method4229()) {
            class76 var22 = new class76();
            var22.field1050 = arg0;
            var22.field1051 = arg1 * 128;
            var22.field1049 = arg2 * 128;
            int var23 = var8.field3372;
            int var24 = var8.field3347;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3347;
                var24 = var8.field3372;
            }
            var22.field1053 = (arg1 + var23) * 128;
            var22.field1054 = (arg2 + var24) * 128;
            var22.field1056 = var8.field3346;
            var22.field1055 = var8.field3376 * 128;
            var22.field1058 = var8.field3353;
            var22.field1059 = var8.field3378;
            var22.field1061 = var8.field3379;
            if (var8.field3354 != null) {
                var22.field1063 = var8;
                var22.method1733();
            }
            class76.field1060.method4475(var22);
            if (var22.field1061 != null) {
                var22.field1057 = var22.field1058 + (int) (Math.random() * (double) (var22.field1059 - var22.field1058));
            }
        }
        if (arg5 == 22) {
            if (!client.field829 || var8.field3350 != 0 || var8.field3348 == 1 || var8.field3330) {
                class136 var25;
                if (var8.field3339 == -1 && var8.field3354 == null) {
                    var25 = var8.method4191(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class94(arg3, 22, arg4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
                }
                arg6.method2834(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3348 == 1 && arg7 != null) {
                    arg7.method3253(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class136 var51;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var51 = var8.method4191(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class94(arg3, 10, arg4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            if (var51 != null && arg6.method2831(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3362) {
                int var52 = 15;
                if (var51 instanceof class128) {
                    var52 = ((class128) var51).method2657() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field2322[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field2322[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3348 != 0 && arg7 != null) {
                arg7.method3256(arg1, arg2, var9, var10, var8.field3334);
            }
        } else if (arg5 >= 12) {
            class136 var26;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var26 = var8.method4191(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method2831(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field484[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3348 != 0 && arg7 != null) {
                arg7.method3256(arg1, arg2, var9, var10, var8.field3334);
            }
        } else if (arg5 == 0) {
            class136 var27;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var27 = var8.method4191(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class94(arg3, 0, arg4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method3014(arg0, arg1, arg2, var16, var27, (class136) null, field480[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3362) {
                    Statics.field2322[arg0][arg1][arg2] = 50;
                    Statics.field2322[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3381) {
                    Statics.field484[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3362) {
                    Statics.field2322[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2322[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3381) {
                    Statics.field484[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3362) {
                    Statics.field2322[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2322[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3381) {
                    Statics.field484[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3362) {
                    Statics.field2322[arg0][arg1][arg2] = 50;
                    Statics.field2322[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3381) {
                    Statics.field484[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3348 != 0 && arg7 != null) {
                arg7.method3258(arg1, arg2, arg5, arg4, var8.field3334);
            }
            if (var8.field3355 != 16) {
                arg6.method2844(arg0, arg1, arg2, var8.field3355);
            }
        } else if (arg5 == 1) {
            class136 var28;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var28 = var8.method4191(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class94(arg3, 1, arg4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method3014(arg0, arg1, arg2, var16, var28, (class136) null, field481[arg4], 0, var19, var21);
            if (var8.field3362) {
                if (arg4 == 0) {
                    Statics.field2322[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2322[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2322[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2322[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3348 != 0 && arg7 != null) {
                arg7.method3258(arg1, arg2, arg5, arg4, var8.field3334);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class136 var30;
            class136 var31;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var30 = var8.method4191(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4191(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class94(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
                var31 = new class94(arg3, 2, var29, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method3014(arg0, arg1, arg2, var16, var30, var31, field480[arg4], field480[var29], var19, var21);
            if (var8.field3381) {
                if (arg4 == 0) {
                    Statics.field484[arg0][arg1][arg2] |= 0x249;
                    Statics.field484[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field484[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field484[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field484[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field484[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field484[arg0][arg1][arg2] |= 0x492;
                    Statics.field484[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3348 != 0 && arg7 != null) {
                arg7.method3258(arg1, arg2, arg5, arg4, var8.field3334);
            }
            if (var8.field3355 != 16) {
                arg6.method2844(arg0, arg1, arg2, var8.field3355);
            }
        } else if (arg5 == 3) {
            class136 var32;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var32 = var8.method4191(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class94(arg3, 3, arg4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method3014(arg0, arg1, arg2, var16, var32, (class136) null, field481[arg4], 0, var19, var21);
            if (var8.field3362) {
                if (arg4 == 0) {
                    Statics.field2322[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2322[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2322[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2322[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3348 != 0 && arg7 != null) {
                arg7.method3258(arg1, arg2, arg5, arg4, var8.field3334);
            }
        } else if (arg5 == 9) {
            class136 var33;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var33 = var8.method4191(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method2831(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3348 != 0 && arg7 != null) {
                arg7.method3256(arg1, arg2, var9, var10, var8.field3334);
            }
            if (var8.field3355 != 16) {
                arg6.method2844(arg0, arg1, arg2, var8.field3355);
            }
        } else if (arg5 == 4) {
            class136 var34;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var34 = var8.method4191(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method2837(arg0, arg1, arg2, var16, var34, (class136) null, field480[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2854(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class254.method3676(class129.method3026(var36)).field3355;
            }
            class136 var38;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var38 = var8.method4191(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method2837(arg0, arg1, arg2, var16, var38, (class136) null, field480[arg4], 0, field482[arg4] * var35, field483[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2854(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class254.method3676(class129.method3026(var40)).field3355 / 2;
            }
            class136 var42;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var42 = var8.method4191(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method2837(arg0, arg1, arg2, var16, var42, (class136) null, 256, arg4, field479[arg4] * var39, field485[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class136 var44;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var44 = var8.method4191(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class94(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method2837(arg0, arg1, arg2, var16, var44, (class136) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2854(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class254.method3676(class129.method3026(var46)).field3355 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class136 var49;
            class136 var50;
            if (var8.field3339 == -1 && var8.field3354 == null) {
                var49 = var8.method4191(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4191(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
                var50 = new class94(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3339, true, (class136) null);
            }
            arg6.method2837(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field479[arg4] * var45, field485[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("x.q(Lea;[Lfm;I)V")
    public static final void method75(class134 arg0, class173[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field473[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field473[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3257(var3, var4);
                        }
                    }
                }
            }
        }
        field478 += (int) (Math.random() * 5.0D) - 2;
        if (field478 < -8) {
            field478 = -8;
        }
        if (field478 > 8) {
            field478 = 8;
        }
        field487 += (int) (Math.random() * 5.0D) - 2;
        if (field487 < -16) {
            field487 = -16;
        }
        if (field487 > 16) {
            field487 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2322[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field472[var6][var11 + 1][var10] - field472[var6][var11 - 1][var10];
                    int var13 = field472[var6][var11][var10 + 1] - field472[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field32[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field477[var20] = 0;
                Statics.field27[var20] = 0;
                Statics.field3591[var20] = 0;
                Statics.field395[var20] = 0;
                Statics.field1130[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field486[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class245 var25 = class245.method3759(var24 - 1);
                            Statics.field477[var22] += var25.field3239;
                            Statics.field27[var22] += var25.field3243;
                            Statics.field3591[var22] += var25.field3236;
                            Statics.field395[var22] += var25.field3242;
                            var10002 = Statics.field1130[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field486[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class245 var28 = class245.method3759(var27 - 1);
                            Statics.field477[var22] -= var28.field3239;
                            Statics.field27[var22] -= var28.field3243;
                            Statics.field3591[var22] -= var28.field3236;
                            Statics.field395[var22] -= var28.field3242;
                            var10002 = Statics.field1130[var22]--;
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
                            var29 += Statics.field477[var35];
                            var30 += Statics.field27[var35];
                            var31 += Statics.field3591[var35];
                            var32 += Statics.field395[var35];
                            var33 += Statics.field1130[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field477[var36];
                            var30 -= Statics.field27[var36];
                            var31 -= Statics.field3591[var36];
                            var32 -= Statics.field395[var36];
                            var33 -= Statics.field1130[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field829 || (field473[0][var21][var34] & 0x2) != 0 || (field473[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field474) {
                                field474 = var6;
                            }
                            int var37 = Statics.field486[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field4062[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field472[var6][var21][var34];
                                int var40 = field472[var6][var21 + 1][var34];
                                int var41 = field472[var6][var21 + 1][var34 + 1];
                                int var42 = field472[var6][var21][var34 + 1];
                                int var43 = Statics.field32[var21][var34];
                                int var44 = Statics.field32[var21 + 1][var34];
                                int var45 = Statics.field32[var21 + 1][var34 + 1];
                                int var46 = Statics.field32[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method3029(var49, var50, var51);
                                    int var52 = field478 + var49 & 0xFF;
                                    int var53 = field487 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method3029(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field2493[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class258 var56 = (class258) class258.field3481.method3065((long) var55);
                                        class258 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field3489.method3790(4, var55);
                                            class258 var59 = new class258();
                                            if (var58 != null) {
                                                var59.method4348(new class300(var58), var55);
                                            }
                                            var59.method4349();
                                            class258.field3481.method3067(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field3479) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field484[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class131.field1763[method3396(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2841(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method3396(var47, var43), method3396(var47, var44), method3396(var47, var45), method3396(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field2493[var6][var21][var34] + 1;
                                    byte var62 = Statics.field476[var6][var21][var34];
                                    int var63 = var38 - 1;
                                    class258 var64 = (class258) class258.field3481.method3065((long) var63);
                                    class258 var65;
                                    if (var64 == null) {
                                        byte[] var66 = Statics.field3489.method3790(4, var63);
                                        class258 var67 = new class258();
                                        if (var66 != null) {
                                            var67.method4348(new class300(var66), var63);
                                        }
                                        var67.method4349();
                                        class258.field3481.method3067(var67, (long) var63);
                                        var65 = var67;
                                    } else {
                                        var65 = var64;
                                    }
                                    int var69 = var65.field3482;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1764.method2501(var69);
                                        var71 = -1;
                                    } else if (var65.field3488 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method3029(var65.field3485, var65.field3486, var65.field3480);
                                        int var72 = field478 + var65.field3485 & 0xFF;
                                        int var73 = field487 + var65.field3480;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method3029(var72, var65.field3486, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class131.field1763[method3294(var70, 96)];
                                    }
                                    if (var65.field3484 != -1) {
                                        int var75 = field478 + var65.field3487 & 0xFF;
                                        int var76 = field487 + var65.field3490;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method3029(var75, var65.field3483, var76);
                                        var74 = class131.field1763[method3294(var77, 96)];
                                    }
                                    arg0.method2841(var6, var21, var34, var61, var62, var69, var39, var40, var41, var42, method3396(var47, var43), method3396(var47, var44), method3396(var47, var45), method3396(var47, var46), method3294(var71, var43), method3294(var71, var44), method3294(var71, var45), method3294(var71, var46), var60, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method2934(var6, var79, var78, method4232(var6, var79, var78));
                }
            }
            Statics.field486[var6] = (byte[][]) null;
            Statics.field4062[var6] = (byte[][]) null;
            Statics.field2493[var6] = (byte[][]) null;
            Statics.field476[var6] = (byte[][]) null;
            Statics.field2322[var6] = (byte[][]) null;
        }
        arg0.method2918(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field473[1][var80][var81] & 0x2) == 2) {
                    arg0.method2905(var80, var81);
                }
            }
        }
        int var82 = 1;
        int var83 = 2;
        int var84 = 4;
        for (int var85 = 0; var85 < 4; var85++) {
            if (var85 > 0) {
                var82 <<= 0x3;
                var83 <<= 0x3;
                var84 <<= 0x3;
            }
            for (int var86 = 0; var86 <= var85; var86++) {
                for (int var87 = 0; var87 <= 104; var87++) {
                    for (int var88 = 0; var88 <= 104; var88++) {
                        if ((Statics.field484[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field484[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field484[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label355: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field484[var91 - 1][var88][var93] & var82) == 0) {
                                        break label355;
                                    }
                                }
                                var91--;
                            }
                            label344: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field484[var92 + 1][var88][var94] & var82) == 0) {
                                        break label344;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field472[var92][var88][var89] - var96;
                                int var98 = field472[var91][var88][var89];
                                class134.method2946(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field484[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field484[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field484[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field484[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label408: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field484[var103 - 1][var105][var87] & var83) == 0) {
                                        break label408;
                                    }
                                }
                                var103--;
                            }
                            label397: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field484[var104 + 1][var106][var87] & var83) == 0) {
                                        break label397;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field472[var104][var101][var87] - var108;
                                int var110 = field472[var103][var101][var87];
                                class134.method2946(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field484[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field484[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field484[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field484[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label461: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field484[var86][var113 - 1][var117] & var84) == 0) {
                                        break label461;
                                    }
                                }
                                var113--;
                            }
                            label450: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field484[var86][var114 + 1][var118] & var84) == 0) {
                                        break label450;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field472[var86][var113][var115];
                                class134.method2946(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field484[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ik.x(IIII)I")
    public static int method4232(int arg0, int arg1, int arg2) {
        if ((field473[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field473[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("x.d(III)I")
    public static final int method78(int arg0, int arg1) {
        int var2 = method4652(arg0 + 45365, arg1 + 91923, 4) - 128 + (method4652(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method4652(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ju.f(IIII)I")
    public static final int method4652(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method139(var3, var5);
        int var8 = method139(var3 + 1, var5);
        int var9 = method139(var3, var5 + 1);
        int var10 = method139(var3 + 1, var5 + 1);
        int var11 = 65536 - class131.field1768[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class131.field1768[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class131.field1768[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("y.c(III)I")
    public static final int method139(int arg0, int arg1) {
        int var2 = Statics.method547(arg0 - 1, arg1 - 1) + Statics.method547(arg0 + 1, arg1 - 1) + Statics.method547(arg0 - 1, arg1 + 1) + Statics.method547(arg0 + 1, arg1 + 1);
        int var3 = Statics.method547(arg0 - 1, arg1) + Statics.method547(arg0 + 1, arg1) + Statics.method547(arg0, arg1 - 1) + Statics.method547(arg0, arg1 + 1);
        int var4 = Statics.method547(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("gi.y(III)I")
    public static final int method3396(int arg0, int arg1) {
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

    @ObfuscatedName("fq.p(III)I")
    public static final int method3294(int arg0, int arg1) {
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

    @ObfuscatedName("ey.g(IIIB)I")
    public static final int method3029(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("am.e(III)Z")
    public static final boolean method346(int arg0, int arg1) {
        class254 var2 = class254.method3676(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4192(arg1);
    }

    @ObfuscatedName("client.z(IIIIIIILea;Lfm;I)V")
    public static final void method1558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class134 arg7, class173 arg8) {
        class254 var9 = class254.method3676(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3347;
            var11 = var9.field3372;
        } else {
            var10 = var9.field3372;
            var11 = var9.field3347;
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
        int[][] var16 = field472[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class129.method349(arg2, arg3, 2, var9.field3350 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3364 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class136 var23;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var23 = var9.method4230(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class94(arg4, 22, arg5, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method2834(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3348 == 1) {
                arg8.method3253(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class136 var49;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var49 = var9.method4230(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class94(arg4, 10, arg5, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            if (var49 != null) {
                arg7.method2831(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3348 != 0) {
                arg8.method3256(arg2, arg3, var10, var11, var9.field3334);
            }
        } else if (arg6 >= 12) {
            class136 var24;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var24 = var9.method4230(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method2831(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3348 != 0) {
                arg8.method3256(arg2, arg3, var10, var11, var9.field3334);
            }
        } else if (arg6 == 0) {
            class136 var25;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var25 = var9.method4230(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class94(arg4, 0, arg5, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method3014(arg0, arg2, arg3, var17, var25, (class136) null, field480[arg5], 0, var20, var22);
            if (var9.field3348 != 0) {
                arg8.method3258(arg2, arg3, arg6, arg5, var9.field3334);
            }
        } else if (arg6 == 1) {
            class136 var26;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var26 = var9.method4230(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class94(arg4, 1, arg5, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method3014(arg0, arg2, arg3, var17, var26, (class136) null, field481[arg5], 0, var20, var22);
            if (var9.field3348 != 0) {
                arg8.method3258(arg2, arg3, arg6, arg5, var9.field3334);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class136 var28;
            class136 var29;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var28 = var9.method4230(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4230(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class94(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3339, true, (class136) null);
                var29 = new class94(arg4, 2, var27, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method3014(arg0, arg2, arg3, var17, var28, var29, field480[arg5], field480[var27], var20, var22);
            if (var9.field3348 != 0) {
                arg8.method3258(arg2, arg3, arg6, arg5, var9.field3334);
            }
        } else if (arg6 == 3) {
            class136 var30;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var30 = var9.method4230(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class94(arg4, 3, arg5, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method3014(arg0, arg2, arg3, var17, var30, (class136) null, field481[arg5], 0, var20, var22);
            if (var9.field3348 != 0) {
                arg8.method3258(arg2, arg3, arg6, arg5, var9.field3334);
            }
        } else if (arg6 == 9) {
            class136 var31;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var31 = var9.method4230(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method2831(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3348 != 0) {
                arg8.method3256(arg2, arg3, var10, var11, var9.field3334);
            }
        } else if (arg6 == 4) {
            class136 var32;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var32 = var9.method4230(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method2837(arg0, arg2, arg3, var17, var32, (class136) null, field480[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2854(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class254.method3676(class129.method3026(var34)).field3355;
            }
            class136 var36;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var36 = var9.method4230(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method2837(arg0, arg2, arg3, var17, var36, (class136) null, field480[arg5], 0, field482[arg5] * var33, field483[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2854(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class254.method3676(class129.method3026(var38)).field3355 / 2;
            }
            class136 var40;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var40 = var9.method4230(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method2837(arg0, arg2, arg3, var17, var40, (class136) null, 256, arg5, field479[arg5] * var37, field485[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class136 var42;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var42 = var9.method4230(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class94(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method2837(arg0, arg2, arg3, var17, var42, (class136) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2854(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class254.method3676(class129.method3026(var44)).field3355 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class136 var47;
            class136 var48;
            if (var9.field3339 == -1 && var9.field3354 == null) {
                var47 = var9.method4230(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4230(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3339, true, (class136) null);
                var48 = new class94(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3339, true, (class136) null);
            }
            arg7.method2837(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field479[arg5] * var43, field485[arg5] * var43, var20, var22);
        }
    }
}
