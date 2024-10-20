package deob;

@ObfuscatedName("bn")
public final class class62 {

    @ObfuscatedName("bn.w")
    public static int[][][] field774 = new int[4][105][105];

    @ObfuscatedName("bn.s")
    public static byte[][][] field770 = new byte[4][104][104];

    @ObfuscatedName("bn.q")
    public static int field771 = 99;

    @ObfuscatedName("bn.j")
    public static final int[] field775 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bn.y")
    public static final int[] field786 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bn.k")
    public static final int[] field777 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bn.c")
    public static final int[] field781 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bn.r")
    public static final int[] field769 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bn.m")
    public static final int[] field776 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bn.l")
    public static int field780 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bn.f")
    public static int field782 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.w(IIIII)V")
    public static final void method1426(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field249[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field774[0][var5][var4] = field774[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field774[0][var5][var4] = field774[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field774[0][var5][var4] = field774[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field774[0][var5][var4] = field774[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bt.q(Lfz;IIIIIII)V")
    public static final void method994(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2971();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2971();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2971();
                }
            }
            return;
        }
        field770[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2971();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field774[0][arg2][arg3] = -method2892(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field774[arg1][arg2][arg3] = field774[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2971();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field774[0][arg2][arg3] = -var8 * 8;
                } else {
                    field774[arg1][arg2][arg3] = field774[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field772[arg1][arg2][arg3] = arg0.method2972();
                Statics.field2319[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field773[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field770[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field18[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("r.o([BIII)Z")
    public static final boolean method162(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class174 var4 = new class174(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2985();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2985();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2971() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class256 var16 = class256.method2861(var5);
                        if (var13 != 22 || !client.field928 || var16.field3455 != 0 || var16.field3453 == 1 || var16.field3474) {
                            if (!var16.method4274()) {
                                client.field984++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2985();
                if (var9 == 0) {
                    break;
                }
                var4.method2971();
            }
        }
    }

    @ObfuscatedName("f.g([BIIIIIIILeu;[Lfw;I)V")
    public static final void method176(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class138 arg8, class162[] arg9) {
        class174 var10 = new class174(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2985();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2985();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2971();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class256 var21 = class256.method2861(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3445;
                    int var27 = var21.field3452;
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
                    int var32 = arg3 + class216.method48(var16 & 0x7, var15 & 0x7, arg7, var21.field3445, var21.field3452, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field770[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class162 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method143(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.v(IIIIIILeu;Lfw;I)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class138 arg6, class162 arg7) {
        if (client.field928 && (field770[0][arg1][arg2] & 0x2) == 0 && (field770[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field771) {
            field771 = arg0;
        }
        class256 var8 = class256.method2861(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3452;
            var10 = var8.field3445;
        } else {
            var9 = var8.field3445;
            var10 = var8.field3452;
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
        int[][] var15 = field774[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3455 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3476 == 1) {
            var20 += 256;
        }
        if (var8.method4280()) {
            class81 var21 = new class81();
            var21.field1313 = arg0;
            var21.field1314 = arg1 * 128;
            var21.field1315 = arg2 * 128;
            int var22 = var8.field3445;
            int var23 = var8.field3452;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3452;
                var23 = var8.field3445;
            }
            var21.field1316 = (arg1 + var22) * 128;
            var21.field1317 = (arg2 + var23) * 128;
            var21.field1319 = var8.field3480;
            var21.field1312 = var8.field3481 * 128;
            var21.field1321 = var8.field3444;
            var21.field1322 = var8.field3459;
            var21.field1320 = var8.field3484;
            if (var8.field3477 != null) {
                var21.field1326 = var8;
                var21.method1487();
            }
            class81.field1324.method3429(var21);
            if (var21.field1320 != null) {
                var21.field1323 = var21.field1321 + (int) (Math.random() * (double) (var21.field1322 - var21.field1321));
            }
        }
        if (arg5 == 22) {
            if (!client.field928 || var8.field3455 != 0 || var8.field3453 == 1 || var8.field3474) {
                class140 var24;
                if (var8.field3440 == -1 && var8.field3477 == null) {
                    var24 = var8.method4275(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class99(arg3, 22, arg4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
                }
                arg6.method2523(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3453 == 1 && arg7 != null) {
                    arg7.method2830(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class140 var47;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var47 = var8.method4275(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class99(arg3, 10, arg4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            if (var47 != null && arg6.method2527(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3450) {
                int var48 = 15;
                if (var47 instanceof class132) {
                    var48 = ((class132) var47).method2395() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field249[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field249[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3453 != 0 && arg7 != null) {
                arg7.method2828(arg1, arg2, var9, var10, var8.field3454);
            }
        } else if (arg5 >= 12) {
            class140 var25;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var25 = var8.method4275(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2527(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3674[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3453 != 0 && arg7 != null) {
                arg7.method2828(arg1, arg2, var9, var10, var8.field3454);
            }
        } else if (arg5 == 0) {
            class140 var26;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var26 = var8.method4275(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class99(arg3, 0, arg4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2525(arg0, arg1, arg2, var16, var26, (class140) null, field775[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3450) {
                    Statics.field249[arg0][arg1][arg2] = 50;
                    Statics.field249[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3458) {
                    Statics.field3674[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3450) {
                    Statics.field249[arg0][arg1][arg2 + 1] = 50;
                    Statics.field249[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3458) {
                    Statics.field3674[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3450) {
                    Statics.field249[arg0][arg1 + 1][arg2] = 50;
                    Statics.field249[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3458) {
                    Statics.field3674[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3450) {
                    Statics.field249[arg0][arg1][arg2] = 50;
                    Statics.field249[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3458) {
                    Statics.field3674[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3453 != 0 && arg7 != null) {
                arg7.method2833(arg1, arg2, arg5, arg4, var8.field3454);
            }
            if (var8.field3475 != 16) {
                arg6.method2533(arg0, arg1, arg2, var8.field3475);
            }
        } else if (arg5 == 1) {
            class140 var27;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var27 = var8.method4275(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class99(arg3, 1, arg4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2525(arg0, arg1, arg2, var16, var27, (class140) null, field786[arg4], 0, var19, var20);
            if (var8.field3450) {
                if (arg4 == 0) {
                    Statics.field249[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field249[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field249[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field249[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3453 != 0 && arg7 != null) {
                arg7.method2833(arg1, arg2, arg5, arg4, var8.field3454);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class140 var29;
            class140 var30;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var29 = var8.method4275(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4275(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class99(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
                var30 = new class99(arg3, 2, var28, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2525(arg0, arg1, arg2, var16, var29, var30, field775[arg4], field775[var28], var19, var20);
            if (var8.field3458) {
                if (arg4 == 0) {
                    Statics.field3674[arg0][arg1][arg2] |= 0x249;
                    Statics.field3674[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3674[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3674[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3674[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3674[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3674[arg0][arg1][arg2] |= 0x492;
                    Statics.field3674[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3453 != 0 && arg7 != null) {
                arg7.method2833(arg1, arg2, arg5, arg4, var8.field3454);
            }
            if (var8.field3475 != 16) {
                arg6.method2533(arg0, arg1, arg2, var8.field3475);
            }
        } else if (arg5 == 3) {
            class140 var31;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var31 = var8.method4275(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class99(arg3, 3, arg4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2525(arg0, arg1, arg2, var16, var31, (class140) null, field786[arg4], 0, var19, var20);
            if (var8.field3450) {
                if (arg4 == 0) {
                    Statics.field249[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field249[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field249[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field249[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3453 != 0 && arg7 != null) {
                arg7.method2833(arg1, arg2, arg5, arg4, var8.field3454);
            }
        } else if (arg5 == 9) {
            class140 var32;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var32 = var8.method4275(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2527(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3453 != 0 && arg7 != null) {
                arg7.method2828(arg1, arg2, var9, var10, var8.field3454);
            }
            if (var8.field3475 != 16) {
                arg6.method2533(arg0, arg1, arg2, var8.field3475);
            }
        } else if (arg5 == 4) {
            class140 var33;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var33 = var8.method4275(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2639(arg0, arg1, arg2, var16, var33, (class140) null, field775[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2575(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class256.method2861(var35 >> 14 & 0x7FFF).field3475;
            }
            class140 var36;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var36 = var8.method4275(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2639(arg0, arg1, arg2, var16, var36, (class140) null, field775[arg4], 0, field777[arg4] * var34, field781[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2575(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class256.method2861(var38 >> 14 & 0x7FFF).field3475 / 2;
            }
            class140 var39;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var39 = var8.method4275(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2639(arg0, arg1, arg2, var16, var39, (class140) null, 256, arg4, field769[arg4] * var37, field776[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class140 var41;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var41 = var8.method4275(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class99(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2639(arg0, arg1, arg2, var16, var41, (class140) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2575(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class256.method2861(var43 >> 14 & 0x7FFF).field3475 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class140 var45;
            class140 var46;
            if (var8.field3440 == -1 && var8.field3477 == null) {
                var45 = var8.method4275(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4275(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
                var46 = new class99(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3440, true, (class140) null);
            }
            arg6.method2639(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field769[arg4] * var42, field776[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("fk.p(IIB)I")
    public static final int method2892(int arg0, int arg1) {
        int var2 = method835(arg0 + 45365, arg1 + 91923, 4) - 128 + (method835(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method835(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("bv.e(IIII)I")
    public static final int method835(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1559(var3, var5);
        int var8 = method1559(var3 + 1, var5);
        int var9 = method1559(var3, var5 + 1);
        int var10 = method1559(var3 + 1, var5 + 1);
        int var11 = method2700(var7, var8, var4, arg2);
        int var12 = method2700(var9, var10, var4, arg2);
        return method2700(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ec.d(IIIIB)I")
    public static final int method2700(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class135.field2025[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("cj.x(III)I")
    public static final int method1559(int arg0, int arg1) {
        int var2 = method229(arg0 - 1, arg1 - 1) + method229(arg0 + 1, arg1 - 1) + method229(arg0 - 1, arg1 + 1) + method229(arg0 + 1, arg1 + 1);
        int var3 = method229(arg0 - 1, arg1) + method229(arg0 + 1, arg1) + method229(arg0, arg1 - 1) + method229(arg0, arg1 + 1);
        int var4 = method229(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("aa.u(III)I")
    public static final int method229(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ew.i(III)I")
    public static final int method2688(int arg0, int arg1) {
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

    @ObfuscatedName("hi.h(III)I")
    public static final int method3763(int arg0, int arg1) {
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

    @ObfuscatedName("fc.b(IIII)I")
    public static final int method2879(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ao.j(III)Z")
    public static final boolean method314(int arg0, int arg1) {
        class256 var2 = class256.method2861(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4300(arg1);
    }
}
