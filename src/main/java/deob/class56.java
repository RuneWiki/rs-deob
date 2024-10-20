package deob;

@ObfuscatedName("bm")
public final class class56 {

    @ObfuscatedName("bm.z")
    public static int[][][] field491 = new int[4][105][105];

    @ObfuscatedName("bm.n")
    public static byte[][][] field498 = new byte[4][104][104];

    @ObfuscatedName("bm.v")
    public static int field482 = 99;

    @ObfuscatedName("bm.x")
    public static final int[] field490 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bm.h")
    public static final int[] field494 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bm.s")
    public static final int[] field492 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bm.f")
    public static final int[] field493 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bm.j")
    public static final int[] field485 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bm.d")
    public static final int[] field495 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bm.l")
    public static int field483 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bm.k")
    public static int field497 = (int) (Math.random() * 33.0D) - 16;

    public class56() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.z(I)V")
    public static void method2492() {
        field482 = 99;
        Statics.field502 = new byte[4][104][104];
        Statics.field484 = new byte[4][104][104];
        Statics.field394 = new byte[4][104][104];
        Statics.field3635 = new byte[4][104][104];
        Statics.field489 = new int[4][105][105];
        Statics.field487 = new byte[4][105][105];
        Statics.field387 = new int[105][105];
        Statics.field486 = new int[104];
        Statics.field526 = new int[104];
        Statics.field480 = new int[104];
        Statics.field3648 = new int[104];
        Statics.field488 = new int[104];
    }

    @ObfuscatedName("jy.n(I)V")
    public static void method4717() {
        Statics.field502 = (byte[][][]) null;
        Statics.field484 = (byte[][][]) null;
        Statics.field394 = (byte[][][]) null;
        Statics.field3635 = (byte[][][]) null;
        Statics.field489 = (int[][][]) null;
        Statics.field487 = (byte[][][]) null;
        Statics.field387 = (int[][]) null;
        Statics.field486 = null;
        Statics.field526 = null;
        Statics.field480 = null;
        Statics.field3648 = null;
        Statics.field488 = null;
    }

    @ObfuscatedName("ap.v(IIIIB)V")
    public static final void method497(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field487[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field491[0][var5][var4] = field491[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field491[0][var5][var4] = field491[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field491[0][var5][var4] = field491[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field491[0][var5][var4] = field491[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.u([BIIII[Lfa;I)V")
    public static final void method654(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class173[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2065[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class300 var9 = new class300(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.method59(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ar.r(IIII)V")
    public static final void method505(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field491[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field491[arg0][arg1][arg2 + var5] = field491[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field491[arg0][arg1 + var6][arg2] = field491[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field491[arg0][arg1 - 1][arg2] != 0) {
            field491[arg0][arg1][arg2] = field491[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field491[arg0][arg1][arg2 - 1] != 0) {
            field491[arg0][arg1][arg2] = field491[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field491[arg0][arg1 - 1][arg2 - 1] != 0) {
            field491[arg0][arg1][arg2] = field491[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cv.q([BIIIIIIILex;[Lfa;I)V")
    public static final void method1858(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class134 arg8, class173[] arg9) {
        class300 var10 = new class300(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method5005();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5004();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method4990();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class254 var21 = class254.method1148(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3383;
                    int var27 = var21.field3353;
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
                    int var36 = var21.field3383;
                    int var37 = var21.field3353;
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
                        class173 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method151(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.m(IIIIIILex;Lfa;I)V")
    public static final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class173 arg7) {
        if (client.field870 && (field498[0][arg1][arg2] & 0x2) == 0 && (field498[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field482) {
            field482 = arg0;
        }
        class254 var8 = class254.method1148(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3353;
            var10 = var8.field3383;
        } else {
            var9 = var8.field3383;
            var10 = var8.field3353;
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
        int[][] var15 = field491[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class129.method4525(arg1, arg2, 2, var8.field3356 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3360 == 1) {
            var21 += 256;
        }
        if (var8.method4152()) {
            class76 var22 = new class76();
            var22.field1073 = arg0;
            var22.field1058 = arg1 * 128;
            var22.field1059 = arg2 * 128;
            int var23 = var8.field3383;
            int var24 = var8.field3353;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3353;
                var24 = var8.field3383;
            }
            var22.field1060 = (arg1 + var23) * 128;
            var22.field1061 = (arg2 + var24) * 128;
            var22.field1056 = var8.field3381;
            var22.field1062 = var8.field3382 * 128;
            var22.field1065 = var8.field3373;
            var22.field1071 = var8.field3384;
            var22.field1067 = var8.field3385;
            if (var8.field3378 != null) {
                var22.field1070 = var8;
                var22.method1736();
            }
            class76.field1066.method4433(var22);
            if (var22.field1067 != null) {
                var22.field1068 = var22.field1065 + (int) (Math.random() * (double) (var22.field1071 - var22.field1065));
            }
        }
        if (arg5 == 22) {
            if (!client.field870 || var8.field3356 != 0 || var8.field3368 == 1 || var8.field3375) {
                class136 var25;
                if (var8.field3347 == -1 && var8.field3378 == null) {
                    var25 = var8.method4180(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class94(arg3, 22, arg4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
                }
                arg6.method2902(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3368 == 1 && arg7 != null) {
                    arg7.method3203(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class136 var51;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var51 = var8.method4180(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class94(arg3, 10, arg4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            if (var51 != null && arg6.method2791(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3369) {
                int var52 = 15;
                if (var51 instanceof class128) {
                    var52 = ((class128) var51).method2594() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field487[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field487[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3368 != 0 && arg7 != null) {
                arg7.method3191(arg1, arg2, var9, var10, var8.field3355);
            }
        } else if (arg5 >= 12) {
            class136 var26;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var26 = var8.method4180(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2791(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field489[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3368 != 0 && arg7 != null) {
                arg7.method3191(arg1, arg2, var9, var10, var8.field3355);
            }
        } else if (arg5 == 0) {
            class136 var27;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var27 = var8.method4180(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class94(arg3, 0, arg4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2783(arg0, arg1, arg2, var16, var27, (class136) null, field490[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3369) {
                    Statics.field487[arg0][arg1][arg2] = 50;
                    Statics.field487[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3359) {
                    Statics.field489[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3369) {
                    Statics.field487[arg0][arg1][arg2 + 1] = 50;
                    Statics.field487[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3359) {
                    Statics.field489[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3369) {
                    Statics.field487[arg0][arg1 + 1][arg2] = 50;
                    Statics.field487[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3359) {
                    Statics.field489[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3369) {
                    Statics.field487[arg0][arg1][arg2] = 50;
                    Statics.field487[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3359) {
                    Statics.field489[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3368 != 0 && arg7 != null) {
                arg7.method3189(arg1, arg2, arg5, arg4, var8.field3355);
            }
            if (var8.field3361 != 16) {
                arg6.method2862(arg0, arg1, arg2, var8.field3361);
            }
        } else if (arg5 == 1) {
            class136 var28;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var28 = var8.method4180(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class94(arg3, 1, arg4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2783(arg0, arg1, arg2, var16, var28, (class136) null, field494[arg4], 0, var19, var21);
            if (var8.field3369) {
                if (arg4 == 0) {
                    Statics.field487[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field487[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field487[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field487[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3368 != 0 && arg7 != null) {
                arg7.method3189(arg1, arg2, arg5, arg4, var8.field3355);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class136 var30;
            class136 var31;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var30 = var8.method4180(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4180(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class94(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
                var31 = new class94(arg3, 2, var29, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2783(arg0, arg1, arg2, var16, var30, var31, field490[arg4], field490[var29], var19, var21);
            if (var8.field3359) {
                if (arg4 == 0) {
                    Statics.field489[arg0][arg1][arg2] |= 0x249;
                    Statics.field489[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field489[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field489[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field489[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field489[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field489[arg0][arg1][arg2] |= 0x492;
                    Statics.field489[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3368 != 0 && arg7 != null) {
                arg7.method3189(arg1, arg2, arg5, arg4, var8.field3355);
            }
            if (var8.field3361 != 16) {
                arg6.method2862(arg0, arg1, arg2, var8.field3361);
            }
        } else if (arg5 == 3) {
            class136 var32;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var32 = var8.method4180(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class94(arg3, 3, arg4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2783(arg0, arg1, arg2, var16, var32, (class136) null, field494[arg4], 0, var19, var21);
            if (var8.field3369) {
                if (arg4 == 0) {
                    Statics.field487[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field487[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field487[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field487[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3368 != 0 && arg7 != null) {
                arg7.method3189(arg1, arg2, arg5, arg4, var8.field3355);
            }
        } else if (arg5 == 9) {
            class136 var33;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var33 = var8.method4180(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2791(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3368 != 0 && arg7 != null) {
                arg7.method3191(arg1, arg2, var9, var10, var8.field3355);
            }
            if (var8.field3361 != 16) {
                arg6.method2862(arg0, arg1, arg2, var8.field3361);
            }
        } else if (arg5 == 4) {
            class136 var34;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var34 = var8.method4180(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2798(arg0, arg1, arg2, var16, var34, (class136) null, field490[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2807(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class254.method1148(class129.method1871(var36)).field3361;
            }
            class136 var38;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var38 = var8.method4180(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2798(arg0, arg1, arg2, var16, var38, (class136) null, field490[arg4], 0, field492[arg4] * var35, field493[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2807(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class254.method1148(class129.method1871(var40)).field3361 / 2;
            }
            class136 var42;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var42 = var8.method4180(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2798(arg0, arg1, arg2, var16, var42, (class136) null, 256, arg4, field485[arg4] * var39, field495[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class136 var44;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var44 = var8.method4180(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class94(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2798(arg0, arg1, arg2, var16, var44, (class136) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2807(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class254.method1148(class129.method1871(var46)).field3361 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class136 var49;
            class136 var50;
            if (var8.field3347 == -1 && var8.field3378 == null) {
                var49 = var8.method4180(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4180(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
                var50 = new class94(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3347, true, (class136) null);
            }
            arg6.method2798(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field485[arg4] * var45, field495[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("gi.y(IIIS)I")
    public static int method3289(int arg0, int arg1, int arg2) {
        if ((field498[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field498[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("k.i(III)I")
    public static final int method283(int arg0, int arg1) {
        int var2 = method188(arg0 + 45365, arg1 + 91923, 4) - 128 + (method188(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method188(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("g.c(IIII)I")
    public static final int method188(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1903(var3, var5);
        int var8 = method1903(var3 + 1, var5);
        int var9 = method1903(var3, var5 + 1);
        int var10 = method1903(var3 + 1, var5 + 1);
        int var11 = 65536 - class131.field1730[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class131.field1730[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class131.field1730[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("cd.b(III)I")
    public static final int method1903(int arg0, int arg1) {
        int var2 = method3111(arg0 - 1, arg1 - 1) + method3111(arg0 + 1, arg1 - 1) + method3111(arg0 - 1, arg1 + 1) + method3111(arg0 + 1, arg1 + 1);
        int var3 = method3111(arg0 - 1, arg1) + method3111(arg0 + 1, arg1) + method3111(arg0, arg1 - 1) + method3111(arg0, arg1 + 1);
        int var4 = method3111(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ff.o(IIB)I")
    public static final int method3111(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("gs.a(IIS)I")
    public static final int method3317(int arg0, int arg1) {
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

    @ObfuscatedName("aq.e(III)I")
    public static final int method667(int arg0, int arg1) {
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

    @ObfuscatedName("u.h(IIIIIIILex;Lfa;S)V")
    public static final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class134 arg7, class173 arg8) {
        class254 var9 = class254.method1148(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3353;
            var11 = var9.field3383;
        } else {
            var10 = var9.field3383;
            var11 = var9.field3353;
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
        int[][] var16 = field491[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class129.method4525(arg2, arg3, 2, var9.field3356 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3360 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class136 var23;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var23 = var9.method4147(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class94(arg4, 22, arg5, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2902(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3368 == 1) {
                arg8.method3203(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class136 var49;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var49 = var9.method4147(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class94(arg4, 10, arg5, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            if (var49 != null) {
                arg7.method2791(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3368 != 0) {
                arg8.method3191(arg2, arg3, var10, var11, var9.field3355);
            }
        } else if (arg6 >= 12) {
            class136 var24;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var24 = var9.method4147(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2791(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3368 != 0) {
                arg8.method3191(arg2, arg3, var10, var11, var9.field3355);
            }
        } else if (arg6 == 0) {
            class136 var25;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var25 = var9.method4147(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class94(arg4, 0, arg5, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2783(arg0, arg2, arg3, var17, var25, (class136) null, field490[arg5], 0, var20, var22);
            if (var9.field3368 != 0) {
                arg8.method3189(arg2, arg3, arg6, arg5, var9.field3355);
            }
        } else if (arg6 == 1) {
            class136 var26;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var26 = var9.method4147(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class94(arg4, 1, arg5, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2783(arg0, arg2, arg3, var17, var26, (class136) null, field494[arg5], 0, var20, var22);
            if (var9.field3368 != 0) {
                arg8.method3189(arg2, arg3, arg6, arg5, var9.field3355);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class136 var28;
            class136 var29;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var28 = var9.method4147(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4147(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class94(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3347, true, (class136) null);
                var29 = new class94(arg4, 2, var27, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2783(arg0, arg2, arg3, var17, var28, var29, field490[arg5], field490[var27], var20, var22);
            if (var9.field3368 != 0) {
                arg8.method3189(arg2, arg3, arg6, arg5, var9.field3355);
            }
        } else if (arg6 == 3) {
            class136 var30;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var30 = var9.method4147(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class94(arg4, 3, arg5, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2783(arg0, arg2, arg3, var17, var30, (class136) null, field494[arg5], 0, var20, var22);
            if (var9.field3368 != 0) {
                arg8.method3189(arg2, arg3, arg6, arg5, var9.field3355);
            }
        } else if (arg6 == 9) {
            class136 var31;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var31 = var9.method4147(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class94(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2791(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3368 != 0) {
                arg8.method3191(arg2, arg3, var10, var11, var9.field3355);
            }
        } else if (arg6 == 4) {
            class136 var32;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var32 = var9.method4147(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2798(arg0, arg2, arg3, var17, var32, (class136) null, field490[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2807(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class254.method1148(class129.method1871(var34)).field3361;
            }
            class136 var36;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var36 = var9.method4147(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class94(arg4, 4, arg5, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2798(arg0, arg2, arg3, var17, var36, (class136) null, field490[arg5], 0, field492[arg5] * var33, field493[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2807(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class254.method1148(class129.method1871(var38)).field3361 / 2;
            }
            class136 var40;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var40 = var9.method4147(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2798(arg0, arg2, arg3, var17, var40, (class136) null, 256, arg5, field485[arg5] * var37, field495[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class136 var42;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var42 = var9.method4147(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class94(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2798(arg0, arg2, arg3, var17, var42, (class136) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2807(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class254.method1148(class129.method1871(var44)).field3361 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class136 var47;
            class136 var48;
            if (var9.field3347 == -1 && var9.field3378 == null) {
                var47 = var9.method4147(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4147(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class94(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3347, true, (class136) null);
                var48 = new class94(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3347, true, (class136) null);
            }
            arg7.method2798(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field485[arg5] * var43, field495[arg5] * var43, var20, var22);
        }
    }
}
