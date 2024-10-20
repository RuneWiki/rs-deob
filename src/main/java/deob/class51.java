package deob;

@ObfuscatedName("az")
public final class class51 {

    @ObfuscatedName("az.v")
    public static int[][][] field487 = new int[4][105][105];

    @ObfuscatedName("az.s")
    public static byte[][][] field498 = new byte[4][104][104];

    @ObfuscatedName("az.o")
    public static int field478 = 99;

    @ObfuscatedName("az.y")
    public static final int[] field489 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("az.m")
    public static final int[] field490 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("az.h")
    public static final int[] field491 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("az.x")
    public static final int[] field479 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("az.f")
    public static final int[] field480 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("az.r")
    public static final int[] field494 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("az.n")
    public static int field495 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("az.g")
    public static int field485 = (int) (Math.random() * 33.0D) - 16;

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ee.v(IIIII)V")
    public static final void method2916(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field483[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field487[0][var5][var4] = field487[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field487[0][var5][var4] = field487[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field487[0][var5][var4] = field487[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field487[0][var5][var4] = field487[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("iz.s([BIIII[Lfn;I)V")
    public static final void method4258(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class167[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2079[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class185 var9 = new class185(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2860(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("fs.o([BIIIIIII[Lfn;B)V")
    public static final void method3104(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2079[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class185 var11 = new class185(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var18 = var13 & 0x7;
                        int var19 = var14 & 0x7;
                        int var21 = arg7 & 0x3;
                        int var22;
                        if (var21 == 0) {
                            var22 = var18;
                        } else if (var21 == 1) {
                            var22 = var19;
                        } else if (var21 == 2) {
                            var22 = 7 - var18;
                        } else {
                            var22 = 7 - var19;
                        }
                        int var25 = arg2 + var22;
                        int var27 = var13 & 0x7;
                        int var28 = var14 & 0x7;
                        int var30 = arg7 & 0x3;
                        int var31;
                        if (var30 == 0) {
                            var31 = var28;
                        } else if (var30 == 1) {
                            var31 = 7 - var27;
                        } else if (var30 == 2) {
                            var31 = 7 - var28;
                        } else {
                            var31 = var27;
                        }
                        method2860(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method2860(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ei.k(Lgx;IIIIIIB)V")
    public static final void method2860(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3274();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3274();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3274();
                }
            }
            return;
        }
        field498[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3274();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field487[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1519(var10 + 45365, var11 + 91923, 4) - 128 + (method1519(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1519(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field487[arg1][arg2][arg3] = field487[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3274();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field487[0][arg2][arg3] = -var15 * 8;
                } else {
                    field487[arg1][arg2][arg3] = field487[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field492[arg1][arg2][arg3] = arg0.method3275();
                Statics.field481[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field496[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field498[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field477[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("aj.u([BIIIIIIILdz;[Lfn;S)V")
    public static final void method612(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class128 arg8, class167[] arg9) {
        class185 var10 = new class185(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3289();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3288();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3274();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class271 var21 = class271.method4255(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3417;
                    int var27 = var21.field3418;
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
                    int var36 = var21.field3417;
                    int var37 = var21.field3418;
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
                        if ((field498[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class167 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method1714(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bc.i(IIIIIILdz;Lfn;B)V")
    public static final void method1714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class128 arg6, class167 arg7) {
        if (client.field624 && (field498[0][arg1][arg2] & 0x2) == 0 && (field498[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field478) {
            field478 = arg0;
        }
        class271 var8 = class271.method4255(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3418;
            var10 = var8.field3417;
        } else {
            var9 = var8.field3417;
            var10 = var8.field3418;
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
        int[][] var15 = field487[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class123.method3900(arg1, arg2, 2, var8.field3421 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3401 == 1) {
            var21 += 256;
        }
        if (var8.method4721()) {
            class70.method699(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field624 || var8.field3421 != 0 || var8.field3403 == 1 || var8.field3425) {
                class130 var22;
                if (var8.field3440 == -1 && var8.field3412 == null) {
                    var22 = var8.method4703(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class88(arg3, 22, arg4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
                }
                arg6.method2803(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3403 == 1 && arg7 != null) {
                    arg7.method3146(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class130 var48;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var48 = var8.method4703(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class88(arg3, 10, arg4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            if (var48 != null && arg6.method2666(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3433) {
                int var49 = 15;
                if (var48 instanceof class122) {
                    var49 = ((class122) var48).method2467() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field483[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field483[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3403 != 0 && arg7 != null) {
                arg7.method3108(arg1, arg2, var9, var10, var8.field3428);
            }
        } else if (arg5 >= 12) {
            class130 var23;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var23 = var8.method4703(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2666(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field476[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3403 != 0 && arg7 != null) {
                arg7.method3108(arg1, arg2, var9, var10, var8.field3428);
            }
        } else if (arg5 == 0) {
            class130 var24;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var24 = var8.method4703(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class88(arg3, 0, arg4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2689(arg0, arg1, arg2, var16, var24, (class130) null, field489[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3433) {
                    Statics.field483[arg0][arg1][arg2] = 50;
                    Statics.field483[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3424) {
                    Statics.field476[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3433) {
                    Statics.field483[arg0][arg1][arg2 + 1] = 50;
                    Statics.field483[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3424) {
                    Statics.field476[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3433) {
                    Statics.field483[arg0][arg1 + 1][arg2] = 50;
                    Statics.field483[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3424) {
                    Statics.field476[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3433) {
                    Statics.field483[arg0][arg1][arg2] = 50;
                    Statics.field483[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3424) {
                    Statics.field476[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3403 != 0 && arg7 != null) {
                arg7.method3110(arg1, arg2, arg5, arg4, var8.field3428);
            }
            if (var8.field3443 != 16) {
                arg6.method2702(arg0, arg1, arg2, var8.field3443);
            }
        } else if (arg5 == 1) {
            class130 var25;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var25 = var8.method4703(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class88(arg3, 1, arg4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2689(arg0, arg1, arg2, var16, var25, (class130) null, field490[arg4], 0, var19, var21);
            if (var8.field3433) {
                if (arg4 == 0) {
                    Statics.field483[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field483[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field483[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field483[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3403 != 0 && arg7 != null) {
                arg7.method3110(arg1, arg2, arg5, arg4, var8.field3428);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class130 var27;
            class130 var28;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var27 = var8.method4703(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4703(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class88(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
                var28 = new class88(arg3, 2, var26, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2689(arg0, arg1, arg2, var16, var27, var28, field489[arg4], field489[var26], var19, var21);
            if (var8.field3424) {
                if (arg4 == 0) {
                    Statics.field476[arg0][arg1][arg2] |= 0x249;
                    Statics.field476[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field476[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field476[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field476[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field476[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field476[arg0][arg1][arg2] |= 0x492;
                    Statics.field476[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3403 != 0 && arg7 != null) {
                arg7.method3110(arg1, arg2, arg5, arg4, var8.field3428);
            }
            if (var8.field3443 != 16) {
                arg6.method2702(arg0, arg1, arg2, var8.field3443);
            }
        } else if (arg5 == 3) {
            class130 var29;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var29 = var8.method4703(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class88(arg3, 3, arg4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2689(arg0, arg1, arg2, var16, var29, (class130) null, field490[arg4], 0, var19, var21);
            if (var8.field3433) {
                if (arg4 == 0) {
                    Statics.field483[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field483[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field483[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field483[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3403 != 0 && arg7 != null) {
                arg7.method3110(arg1, arg2, arg5, arg4, var8.field3428);
            }
        } else if (arg5 == 9) {
            class130 var30;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var30 = var8.method4703(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2666(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3403 != 0 && arg7 != null) {
                arg7.method3108(arg1, arg2, var9, var10, var8.field3428);
            }
            if (var8.field3443 != 16) {
                arg6.method2702(arg0, arg1, arg2, var8.field3443);
            }
        } else if (arg5 == 4) {
            class130 var31;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var31 = var8.method4703(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2665(arg0, arg1, arg2, var16, var31, (class130) null, field489[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2682(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class271.method4255(class123.method936(var33)).field3443;
            }
            class130 var35;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var35 = var8.method4703(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2665(arg0, arg1, arg2, var16, var35, (class130) null, field489[arg4], 0, field491[arg4] * var32, field479[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2682(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class271.method4255(class123.method936(var37)).field3443 / 2;
            }
            class130 var39;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var39 = var8.method4703(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2665(arg0, arg1, arg2, var16, var39, (class130) null, 256, arg4, field480[arg4] * var36, field494[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class130 var41;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var41 = var8.method4703(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class88(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2665(arg0, arg1, arg2, var16, var41, (class130) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2682(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class271.method4255(class123.method936(var43)).field3443 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class130 var46;
            class130 var47;
            if (var8.field3440 == -1 && var8.field3412 == null) {
                var46 = var8.method4703(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4703(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
                var47 = new class88(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3440, true, (class130) null);
            }
            arg6.method2665(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field480[arg4] * var42, field494[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("bn.t(IIII)I")
    public static final int method1519(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = Statics.method664(var3, var5);
        int var8 = Statics.method664(var3 + 1, var5);
        int var9 = Statics.method664(var3, var5 + 1);
        int var10 = Statics.method664(var3 + 1, var5 + 1);
        int var11 = method2998(var7, var8, var4, arg2);
        int var12 = method2998(var9, var10, var4, arg2);
        return method2998(var11, var12, var6, arg2);
    }

    @ObfuscatedName("eh.c(IIIII)I")
    public static final int method2998(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class125.field1745[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("i.a(III)I")
    public static final int method75(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("aq.z(IIS)I")
    public static final int method616(int arg0, int arg1) {
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

    @ObfuscatedName("ep.e(III)I")
    public static final int method2849(int arg0, int arg1) {
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

    @ObfuscatedName("fv.q(IIIS)I")
    public static final int method3165(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("c.j(III)Z")
    public static final boolean method128(int arg0, int arg1) {
        class271 var2 = class271.method4255(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4722(arg1);
    }
}
