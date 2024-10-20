package deob;

@ObfuscatedName("bl")
public final class class57 {

    @ObfuscatedName("bl.f")
    public static int[][][] field496 = new int[4][105][105];

    @ObfuscatedName("bl.i")
    public static byte[][][] field492 = new byte[4][104][104];

    @ObfuscatedName("bl.y")
    public static int field491 = 99;

    @ObfuscatedName("bl.n")
    public static final int[] field500 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bl.u")
    public static final int[] field501 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bl.z")
    public static final int[] field507 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bl.h")
    public static final int[] field503 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bl.m")
    public static final int[] field504 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bl.g")
    public static final int[] field505 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bl.r")
    public static int field506 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bl.q")
    public static int field493 = (int) (Math.random() * 33.0D) - 16;

    public class57() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.f(I)V")
    public static void method249() {
        field491 = 99;
        Statics.field89 = new byte[4][104][104];
        Statics.field499 = new byte[4][104][104];
        Statics.field495 = new byte[4][104][104];
        Statics.field494 = new byte[4][104][104];
        Statics.field502 = new int[4][105][105];
        Statics.field497 = new byte[4][105][105];
        Statics.field513 = new int[105][105];
        Statics.field1927 = new int[104];
        Statics.field1140 = new int[104];
        Statics.field2312 = new int[104];
        Statics.field498 = new int[104];
        Statics.field1245 = new int[104];
    }

    @ObfuscatedName("gt.i(B)V")
    public static void method3350() {
        Statics.field89 = (byte[][][]) null;
        Statics.field499 = (byte[][][]) null;
        Statics.field495 = (byte[][][]) null;
        Statics.field494 = (byte[][][]) null;
        Statics.field502 = (int[][][]) null;
        Statics.field497 = (byte[][][]) null;
        Statics.field513 = (int[][]) null;
        Statics.field1927 = null;
        Statics.field1140 = null;
        Statics.field2312 = null;
        Statics.field498 = null;
        Statics.field1245 = null;
    }

    @ObfuscatedName("d.y(IIIII)V")
    public static final void method94(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field497[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field496[0][var5][var4] = field496[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field496[0][var5][var4] = field496[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field496[0][var5][var4] = field496[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field496[0][var5][var4] = field496[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.w([BIIIIIII[Lfp;I)V")
    public static final void method717(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class173[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2068[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class300 var11 = new class300(arg0);
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
                        method5447(var11, arg1, arg2 + var22, arg3 + class217.method3573(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method5447(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ku.p(Lkq;IIIIIII)V")
    public static final void method5447(class300 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method5110();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method5110();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method5110();
                }
            }
            return;
        }
        field492[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5110();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field496[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3230(var10 + 45365, var11 + 91923, 4) - 128 + (method3230(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3230(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field496[arg1][arg2][arg3] = field496[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method5110();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field496[0][arg2][arg3] = -var15 * 8;
                } else {
                    field496[arg1][arg2][arg3] = field496[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field499[arg1][arg2][arg3] = arg0.method5297();
                Statics.field495[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field494[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field492[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field89[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("eu.b([BIIIIIIILej;[Lfp;I)V")
    public static final void method3071(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class134 arg8, class173[] arg9) {
        class300 var10 = new class300(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method5125();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5124();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method5110();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class254 var21 = class254.method3616(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3330;
                    int var27 = var21.field3331;
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
                    int var36 = var21.field3330;
                    int var37 = var21.field3331;
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
                        if ((field492[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class173 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method4113(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iq.e(IIIIIILej;Lfp;I)V")
    public static final void method4113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class173 arg7) {
        if (client.field846 && (field492[0][arg1][arg2] & 0x2) == 0 && (field492[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field491) {
            field491 = arg0;
        }
        class254 var8 = class254.method3616(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3331;
            var10 = var8.field3330;
        } else {
            var9 = var8.field3330;
            var10 = var8.field3331;
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
        int[][] var15 = field496[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class129.method673(arg1, arg2, 2, var8.field3334 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3355 == 1) {
            var21 += 256;
        }
        if (var8.method4248()) {
            class76 var22 = new class76();
            var22.field1064 = arg0;
            var22.field1055 = arg1 * 128;
            var22.field1058 = arg2 * 128;
            int var23 = var8.field3330;
            int var24 = var8.field3331;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3331;
                var24 = var8.field3330;
            }
            var22.field1065 = (arg1 + var23) * 128;
            var22.field1053 = (arg2 + var24) * 128;
            var22.field1059 = var8.field3359;
            var22.field1054 = var8.field3348 * 128;
            var22.field1061 = var8.field3351;
            var22.field1062 = var8.field3361;
            var22.field1063 = var8.field3363;
            if (var8.field3321 != null) {
                var22.field1066 = var8;
                var22.method1737();
            }
            class76.field1057.method4554(var22);
            if (var22.field1063 != null) {
                var22.field1056 = var22.field1061 + (int) (Math.random() * (double) (var22.field1062 - var22.field1061));
            }
        }
        if (arg5 == 22) {
            if (!client.field846 || var8.field3334 != 0 || var8.field3332 == 1 || var8.field3353) {
                class136 var25;
                if (var8.field3338 == -1 && var8.field3321 == null) {
                    var25 = var8.method4259(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class94(arg3, 22, arg4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
                }
                arg6.method2898(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3332 == 1 && arg7 != null) {
                    arg7.method3228(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class136 var51;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var51 = var8.method4259(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class94(arg3, 10, arg4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            if (var51 != null && arg6.method2885(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3356) {
                int var52 = 15;
                if (var51 instanceof class128) {
                    var52 = ((class128) var51).method2637() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field497[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field497[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3332 != 0 && arg7 != null) {
                arg7.method3253(arg1, arg2, var9, var10, var8.field3360);
            }
        } else if (arg5 >= 12) {
            class136 var26;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var26 = var8.method4259(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method2885(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field502[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3332 != 0 && arg7 != null) {
                arg7.method3253(arg1, arg2, var9, var10, var8.field3360);
            }
        } else if (arg5 == 0) {
            class136 var27;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var27 = var8.method4259(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class94(arg3, 0, arg4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method3005(arg0, arg1, arg2, var16, var27, (class136) null, field500[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3356) {
                    Statics.field497[arg0][arg1][arg2] = 50;
                    Statics.field497[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3337) {
                    Statics.field502[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3356) {
                    Statics.field497[arg0][arg1][arg2 + 1] = 50;
                    Statics.field497[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3337) {
                    Statics.field502[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3356) {
                    Statics.field497[arg0][arg1 + 1][arg2] = 50;
                    Statics.field497[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3337) {
                    Statics.field502[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3356) {
                    Statics.field497[arg0][arg1][arg2] = 50;
                    Statics.field497[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3337) {
                    Statics.field502[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3332 != 0 && arg7 != null) {
                arg7.method3252(arg1, arg2, arg5, arg4, var8.field3360);
            }
            if (var8.field3339 != 16) {
                arg6.method2853(arg0, arg1, arg2, var8.field3339);
            }
        } else if (arg5 == 1) {
            class136 var28;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var28 = var8.method4259(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class94(arg3, 1, arg4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method3005(arg0, arg1, arg2, var16, var28, (class136) null, field501[arg4], 0, var19, var21);
            if (var8.field3356) {
                if (arg4 == 0) {
                    Statics.field497[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field497[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field497[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field497[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3332 != 0 && arg7 != null) {
                arg7.method3252(arg1, arg2, arg5, arg4, var8.field3360);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class136 var30;
            class136 var31;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var30 = var8.method4259(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4259(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class94(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
                var31 = new class94(arg3, 2, var29, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method3005(arg0, arg1, arg2, var16, var30, var31, field500[arg4], field500[var29], var19, var21);
            if (var8.field3337) {
                if (arg4 == 0) {
                    Statics.field502[arg0][arg1][arg2] |= 0x249;
                    Statics.field502[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field502[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field502[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field502[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field502[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field502[arg0][arg1][arg2] |= 0x492;
                    Statics.field502[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3332 != 0 && arg7 != null) {
                arg7.method3252(arg1, arg2, arg5, arg4, var8.field3360);
            }
            if (var8.field3339 != 16) {
                arg6.method2853(arg0, arg1, arg2, var8.field3339);
            }
        } else if (arg5 == 3) {
            class136 var32;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var32 = var8.method4259(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class94(arg3, 3, arg4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method3005(arg0, arg1, arg2, var16, var32, (class136) null, field501[arg4], 0, var19, var21);
            if (var8.field3356) {
                if (arg4 == 0) {
                    Statics.field497[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field497[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field497[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field497[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3332 != 0 && arg7 != null) {
                arg7.method3252(arg1, arg2, arg5, arg4, var8.field3360);
            }
        } else if (arg5 == 9) {
            class136 var33;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var33 = var8.method4259(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method2885(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3332 != 0 && arg7 != null) {
                arg7.method3253(arg1, arg2, var9, var10, var8.field3360);
            }
            if (var8.field3339 != 16) {
                arg6.method2853(arg0, arg1, arg2, var8.field3339);
            }
        } else if (arg5 == 4) {
            class136 var34;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var34 = var8.method4259(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var34, (class136) null, field500[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2860(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class254.method3616(class129.method12(var36)).field3339;
            }
            class136 var38;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var38 = var8.method4259(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var38, (class136) null, field500[arg4], 0, field507[arg4] * var35, field503[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2860(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class254.method3616(class129.method12(var40)).field3339 / 2;
            }
            class136 var42;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var42 = var8.method4259(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var42, (class136) null, 256, arg4, field504[arg4] * var39, field505[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class136 var44;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var44 = var8.method4259(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class94(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var44, (class136) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2860(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class254.method3616(class129.method12(var46)).field3339 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class136 var49;
            class136 var50;
            if (var8.field3338 == -1 && var8.field3321 == null) {
                var49 = var8.method4259(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4259(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
                var50 = new class94(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3338, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field504[arg4] * var45, field505[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("fp.a(IIII)I")
    public static final int method3230(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method488(var3, var5);
        int var8 = method488(var3 + 1, var5);
        int var9 = method488(var3, var5 + 1);
        int var10 = method488(var3 + 1, var5 + 1);
        int var11 = Statics.method130(var7, var8, var4, arg2);
        int var12 = Statics.method130(var9, var10, var4, arg2);
        return Statics.method130(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ah.c(IIB)I")
    public static final int method488(int arg0, int arg1) {
        int var2 = method473(arg0 - 1, arg1 - 1) + method473(arg0 + 1, arg1 - 1) + method473(arg0 - 1, arg1 + 1) + method473(arg0 + 1, arg1 + 1);
        int var3 = method473(arg0 - 1, arg1) + method473(arg0 + 1, arg1) + method473(arg0, arg1 - 1) + method473(arg0, arg1 + 1);
        int var4 = method473(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("as.o(III)I")
    public static final int method473(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bm.t(III)I")
    public static final int method1043(int arg0, int arg1) {
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

    @ObfuscatedName("bj.j(IIII)I")
    public static final int method823(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("is.n(IIB)Z")
    public static final boolean method4159(int arg0, int arg1) {
        class254 var2 = class254.method3616(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4229(arg1);
    }
}
