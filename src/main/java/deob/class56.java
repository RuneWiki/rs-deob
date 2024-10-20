package deob;

@ObfuscatedName("bq")
public final class class56 {

    @ObfuscatedName("bq.m")
    public static int[][][] field494 = new int[4][105][105];

    @ObfuscatedName("bq.f")
    public static byte[][][] field481 = new byte[4][104][104];

    @ObfuscatedName("bq.q")
    public static int field480 = 99;

    @ObfuscatedName("bq.t")
    public static final int[] field487 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bq.y")
    public static final int[] field482 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bq.h")
    public static final int[] field489 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bq.b")
    public static final int[] field490 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bq.c")
    public static final int[] field491 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bq.r")
    public static final int[] field492 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bq.p")
    public static int field484 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bq.v")
    public static int field493 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fr.m(I)V")
    public static void method3255() {
        Statics.field483 = (byte[][][]) null;
        Statics.field3745 = (byte[][][]) null;
        Statics.field261 = (byte[][][]) null;
        Statics.field3791 = (byte[][][]) null;
        Statics.field485 = (int[][][]) null;
        Statics.field495 = (byte[][][]) null;
        Statics.field2374 = (int[][]) null;
        Statics.field73 = null;
        Statics.field1121 = null;
        Statics.field2510 = null;
        Statics.field139 = null;
        Statics.field579 = null;
    }

    @ObfuscatedName("fg.f(IIIII)V")
    public static final void method3108(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field495[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field494[0][var5][var4] = field494[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field494[0][var5][var4] = field494[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field494[0][var5][var4] = field494[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field494[0][var5][var4] = field494[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ch.q([BIIII[Lfy;I)V")
    public static final void method1982(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class178[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2104[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class202 var9 = new class202(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method83(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("gx.w([BIIIIIII[Lfy;B)V")
    public static final void method3662(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class178[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2104[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class202 var11 = new class202(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class228.method3284(var13 & 0x7, var14 & 0x7, arg7);
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
                        method83(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method83(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.o(Lgr;IIIIIIB)V")
    public static final void method83(class202 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3551();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3551();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3551();
                }
            }
            return;
        }
        field481[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3551();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field494[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2020(var10 + 45365, var11 + 91923, 4) - 128 + (method2020(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2020(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field494[arg1][arg2][arg3] = field494[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3551();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field494[0][arg2][arg3] = -var15 * 8;
                } else {
                    field494[arg1][arg2][arg3] = field494[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field3745[arg1][arg2][arg3] = arg0.method3537();
                Statics.field261[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3791[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field481[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field483[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dl.u([BIIB)Z")
    public static final boolean method2523(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class202 var4 = new class202(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3567();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3431();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3551() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class265 var16 = class265.method763(var5);
                        if (var13 != 22 || !client.field626 || var16.field3456 != 0 || var16.field3442 == 1 || var16.field3460) {
                            if (!var16.method4596()) {
                                client.field789++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3431();
                if (var9 == 0) {
                    break;
                }
                var4.method3551();
            }
        }
    }

    @ObfuscatedName("ge.g([BIIIIIIILem;[Lfy;I)V")
    public static final void method3311(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class134 arg8, class178[] arg9) {
        class202 var10 = new class202(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3567();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3431();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3551();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class265 var21 = class265.method763(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3437;
                    int var27 = var21.field3465;
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
                    int var32 = arg3 + class228.method3204(var16 & 0x7, var15 & 0x7, arg7, var21.field3437, var21.field3465, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field481[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class178 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method4052(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hj.l(IIIIIILem;Lfy;B)V")
    public static final void method4052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class178 arg7) {
        if (client.field626 && (field481[0][arg1][arg2] & 0x2) == 0 && (field481[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field480) {
            field480 = arg0;
        }
        class265 var8 = class265.method763(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3465;
            var10 = var8.field3437;
        } else {
            var9 = var8.field3437;
            var10 = var8.field3465;
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
        int[][] var15 = field494[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class129.method5179(arg1, arg2, 2, var8.field3456 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3462 == 1) {
            var21 += 256;
        }
        if (var8.method4604()) {
            class76 var22 = new class76();
            var22.field1042 = arg0;
            var22.field1045 = arg1 * 128;
            var22.field1051 = arg2 * 128;
            int var23 = var8.field3437;
            int var24 = var8.field3465;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3465;
                var24 = var8.field3437;
            }
            var22.field1041 = (arg1 + var23) * 128;
            var22.field1046 = (arg2 + var24) * 128;
            var22.field1048 = var8.field3466;
            var22.field1047 = var8.field3468 * 128;
            var22.field1050 = var8.field3444;
            var22.field1049 = var8.field3469;
            var22.field1054 = var8.field3427;
            if (var8.field3463 != null) {
                var22.field1055 = var8;
                var22.method1705();
            }
            class76.field1053.method4851(var22);
            if (var22.field1054 != null) {
                var22.field1057 = var22.field1050 + (int) (Math.random() * (double) (var22.field1049 - var22.field1050));
            }
        }
        if (arg5 == 22) {
            if (!client.field626 || var8.field3456 != 0 || var8.field3442 == 1 || var8.field3460) {
                class136 var25;
                if (var8.field3445 == -1 && var8.field3463 == null) {
                    var25 = var8.method4597(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class94(arg3, 22, arg4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
                }
                arg6.method2819(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3442 == 1 && arg7 != null) {
                    arg7.method3258(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class136 var51;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var51 = var8.method4597(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class94(arg3, 10, arg4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            if (var51 != null && arg6.method2823(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3429) {
                int var52 = 15;
                if (var51 instanceof class128) {
                    var52 = ((class128) var51).method2625() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field495[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field495[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3442 != 0 && arg7 != null) {
                arg7.method3259(arg1, arg2, var9, var10, var8.field3440);
            }
        } else if (arg5 >= 12) {
            class136 var26;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var26 = var8.method4597(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2823(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field485[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3442 != 0 && arg7 != null) {
                arg7.method3259(arg1, arg2, var9, var10, var8.field3440);
            }
        } else if (arg5 == 0) {
            class136 var27;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var27 = var8.method4597(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class94(arg3, 0, arg4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2821(arg0, arg1, arg2, var16, var27, (class136) null, field487[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3429) {
                    Statics.field495[arg0][arg1][arg2] = 50;
                    Statics.field495[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3436) {
                    Statics.field485[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3429) {
                    Statics.field495[arg0][arg1][arg2 + 1] = 50;
                    Statics.field495[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3436) {
                    Statics.field485[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3429) {
                    Statics.field495[arg0][arg1 + 1][arg2] = 50;
                    Statics.field495[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3436) {
                    Statics.field485[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3429) {
                    Statics.field495[arg0][arg1][arg2] = 50;
                    Statics.field495[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3436) {
                    Statics.field485[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3442 != 0 && arg7 != null) {
                arg7.method3256(arg1, arg2, arg5, arg4, var8.field3440);
            }
            if (var8.field3446 != 16) {
                arg6.method2864(arg0, arg1, arg2, var8.field3446);
            }
        } else if (arg5 == 1) {
            class136 var28;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var28 = var8.method4597(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class94(arg3, 1, arg4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2821(arg0, arg1, arg2, var16, var28, (class136) null, field482[arg4], 0, var19, var21);
            if (var8.field3429) {
                if (arg4 == 0) {
                    Statics.field495[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field495[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field495[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field495[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3442 != 0 && arg7 != null) {
                arg7.method3256(arg1, arg2, arg5, arg4, var8.field3440);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class136 var30;
            class136 var31;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var30 = var8.method4597(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4597(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class94(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
                var31 = new class94(arg3, 2, var29, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2821(arg0, arg1, arg2, var16, var30, var31, field487[arg4], field487[var29], var19, var21);
            if (var8.field3436) {
                if (arg4 == 0) {
                    Statics.field485[arg0][arg1][arg2] |= 0x249;
                    Statics.field485[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field485[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field485[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field485[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field485[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field485[arg0][arg1][arg2] |= 0x492;
                    Statics.field485[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3442 != 0 && arg7 != null) {
                arg7.method3256(arg1, arg2, arg5, arg4, var8.field3440);
            }
            if (var8.field3446 != 16) {
                arg6.method2864(arg0, arg1, arg2, var8.field3446);
            }
        } else if (arg5 == 3) {
            class136 var32;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var32 = var8.method4597(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class94(arg3, 3, arg4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2821(arg0, arg1, arg2, var16, var32, (class136) null, field482[arg4], 0, var19, var21);
            if (var8.field3429) {
                if (arg4 == 0) {
                    Statics.field495[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field495[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field495[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field495[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3442 != 0 && arg7 != null) {
                arg7.method3256(arg1, arg2, arg5, arg4, var8.field3440);
            }
        } else if (arg5 == 9) {
            class136 var33;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var33 = var8.method4597(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2823(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3442 != 0 && arg7 != null) {
                arg7.method3259(arg1, arg2, var9, var10, var8.field3440);
            }
            if (var8.field3446 != 16) {
                arg6.method2864(arg0, arg1, arg2, var8.field3446);
            }
        } else if (arg5 == 4) {
            class136 var34;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var34 = var8.method4597(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2881(arg0, arg1, arg2, var16, var34, (class136) null, field487[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2839(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class265.method763(class129.method4558(var36)).field3446;
            }
            class136 var38;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var38 = var8.method4597(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2881(arg0, arg1, arg2, var16, var38, (class136) null, field487[arg4], 0, field489[arg4] * var35, field490[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2839(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class265.method763(class129.method4558(var40)).field3446 / 2;
            }
            class136 var42;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var42 = var8.method4597(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2881(arg0, arg1, arg2, var16, var42, (class136) null, 256, arg4, field491[arg4] * var39, field492[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class136 var44;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var44 = var8.method4597(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class94(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2881(arg0, arg1, arg2, var16, var44, (class136) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2839(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class265.method763(class129.method4558(var46)).field3446 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class136 var49;
            class136 var50;
            if (var8.field3445 == -1 && var8.field3463 == null) {
                var49 = var8.method4597(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4597(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
                var50 = new class94(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3445, true, (class136) null);
            }
            arg6.method2881(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field491[arg4] * var45, field492[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("cg.e(IIII)I")
    public static final int method2020(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2030(var3, var5);
        int var8 = method2030(var3 + 1, var5);
        int var9 = method2030(var3, var5 + 1);
        int var10 = method2030(var3 + 1, var5 + 1);
        int var11 = method1818(var7, var8, var4, arg2);
        int var12 = method1818(var9, var10, var4, arg2);
        return method1818(var11, var12, var6, arg2);
    }

    @ObfuscatedName("bw.x(IIIII)I")
    public static final int method1818(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class131.field1760[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("cg.d(III)I")
    public static final int method2030(int arg0, int arg1) {
        int var2 = method4140(arg0 - 1, arg1 - 1) + method4140(arg0 + 1, arg1 - 1) + method4140(arg0 - 1, arg1 + 1) + method4140(arg0 + 1, arg1 + 1);
        int var3 = method4140(arg0 - 1, arg1) + method4140(arg0 + 1, arg1) + method4140(arg0, arg1 - 1) + method4140(arg0, arg1 + 1);
        int var4 = method4140(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ie.a(III)I")
    public static final int method4140(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("z.z(IIB)I")
    public static final int method166(int arg0, int arg1) {
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

    @ObfuscatedName("v.j(III)I")
    public static final int method291(int arg0, int arg1) {
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

    @ObfuscatedName("ae.s(IIII)I")
    public static final int method599(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ia.t(III)Z")
    public static final boolean method4496(int arg0, int arg1) {
        class265 var2 = class265.method763(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4636(arg1);
    }
}
