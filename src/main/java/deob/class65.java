package deob;

@ObfuscatedName("bh")
public final class class65 {

    @ObfuscatedName("bh.n")
    public static int[][][] field525 = new int[4][105][105];

    @ObfuscatedName("bh.v")
    public static byte[][][] field516 = new byte[4][104][104];

    @ObfuscatedName("bh.d")
    public static int field517 = 99;

    @ObfuscatedName("bh.g")
    public static final int[] field522 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bh.u")
    public static final int[] field515 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bh.t")
    public static final int[] field524 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bh.p")
    public static final int[] field528 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bh.m")
    public static final int[] field526 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bh.r")
    public static final int[] field527 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bh.o")
    public static int field519 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bh.j")
    public static int field529 = (int) (Math.random() * 33.0D) - 16;

    public class65() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.n(I)V")
    public static void method801() {
        field517 = 99;
        Statics.field518 = new byte[4][104][104];
        Statics.field2400 = new byte[4][104][104];
        Statics.field531 = new byte[4][104][104];
        Statics.field2 = new byte[4][104][104];
        Statics.field13 = new int[4][105][105];
        Statics.field2046 = new byte[4][105][105];
        Statics.field258 = new int[105][105];
        Statics.field119 = new int[104];
        Statics.field523 = new int[104];
        Statics.field268 = new int[104];
        Statics.field2053 = new int[104];
        Statics.field293 = new int[104];
    }

    @ObfuscatedName("r.v(I)V")
    public static void method209() {
        Statics.field518 = (byte[][][]) null;
        Statics.field2400 = (byte[][][]) null;
        Statics.field531 = (byte[][][]) null;
        Statics.field2 = (byte[][][]) null;
        Statics.field13 = (int[][][]) null;
        Statics.field2046 = (byte[][][]) null;
        Statics.field258 = (int[][]) null;
        Statics.field119 = null;
        Statics.field523 = null;
        Statics.field268 = null;
        Statics.field2053 = null;
        Statics.field293 = null;
    }

    @ObfuscatedName("y.d(IIIIB)V")
    public static final void method41(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2046[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field525[0][var5][var4] = field525[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field525[0][var5][var4] = field525[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field525[0][var5][var4] = field525[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field525[0][var5][var4] = field525[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.y([BIIIIIII[Lfe;B)V")
    public static final void method654(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class182[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2104[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class311 var11 = new class311(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method776(var11, arg1, arg2 + class226.method3962(var13 & 0x7, var14 & 0x7, arg7), arg3 + class226.method2674(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method776(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bi.h(Lkx;IIIIIII)V")
    public static final void method776(class311 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method5310();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method5310();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method5310();
                }
            }
            return;
        }
        field516[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5310();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field525[0][arg2][arg3] = -method1099(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field525[arg1][arg2][arg3] = field525[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method5310();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field525[0][arg2][arg3] = -var8 * 8;
                } else {
                    field525[arg1][arg2][arg3] = field525[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2400[arg1][arg2][arg3] = arg0.method5293();
                Statics.field531[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field516[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field518[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ag.z([BIIIIIIILeq;[Lfe;I)V")
    public static final void method287(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class143 arg8, class182[] arg9) {
        class311 var10 = new class311(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method5260();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5259();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method5310();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class265 var21 = class265.method668(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3396;
                    int var27 = var21.field3397;
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
                    int var32 = arg3 + class226.method783(var16 & 0x7, var15 & 0x7, arg7, var21.field3396, var21.field3397, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field516[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class182 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method996(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bt.e(IIIIIILeq;Lfe;I)V")
    public static final void method996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class143 arg6, class182 arg7) {
        if (client.field666 && (field516[0][arg1][arg2] & 0x2) == 0 && (field516[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field517) {
            field517 = arg0;
        }
        class265 var8 = class265.method668(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3397;
            var10 = var8.field3396;
        } else {
            var9 = var8.field3396;
            var10 = var8.field3397;
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
        int[][] var15 = field525[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class138.method2665(arg1, arg2, 2, var8.field3400 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3417 == 1) {
            var21 += 256;
        }
        if (var8.method4416()) {
            class85 var22 = new class85();
            var22.field1088 = arg0;
            var22.field1089 = arg1 * 128;
            var22.field1090 = arg2 * 128;
            int var23 = var8.field3396;
            int var24 = var8.field3397;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3397;
                var24 = var8.field3396;
            }
            var22.field1091 = (arg1 + var23) * 128;
            var22.field1095 = (arg2 + var24) * 128;
            var22.field1092 = var8.field3425;
            var22.field1093 = var8.field3426 * 128;
            var22.field1096 = var8.field3427;
            var22.field1097 = var8.field3428;
            var22.field1094 = var8.field3429;
            if (var8.field3422 != null) {
                var22.field1103 = var8;
                var22.method1875();
            }
            class85.field1101.method4699(var22);
            if (var22.field1094 != null) {
                var22.field1098 = var22.field1096 + (int) (Math.random() * (double) (var22.field1097 - var22.field1096));
            }
        }
        if (arg5 == 22) {
            if (!client.field666 || var8.field3400 != 0 || var8.field3398 == 1 || var8.field3419) {
                class145 var25;
                if (var8.field3403 == -1 && var8.field3422 == null) {
                    var25 = var8.method4407(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class103(arg3, 22, arg4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
                }
                arg6.method3136(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3398 == 1 && arg7 != null) {
                    arg7.method3443(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class145 var51;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var51 = var8.method4407(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class103(arg3, 10, arg4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            if (var51 != null && arg6.method3160(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3412) {
                int var52 = 15;
                if (var51 instanceof class137) {
                    var52 = ((class137) var51).method2839() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field2046[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field2046[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3469(arg1, arg2, var9, var10, var8.field3399);
            }
        } else if (arg5 >= 12) {
            class145 var26;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var26 = var8.method4407(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3160(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field13[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3469(arg1, arg2, var9, var10, var8.field3399);
            }
        } else if (arg5 == 0) {
            class145 var27;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var27 = var8.method4407(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class103(arg3, 0, arg4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3086(arg0, arg1, arg2, var16, var27, (class145) null, field522[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3412) {
                    Statics.field2046[arg0][arg1][arg2] = 50;
                    Statics.field2046[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3385) {
                    Statics.field13[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3412) {
                    Statics.field2046[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2046[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3385) {
                    Statics.field13[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3412) {
                    Statics.field2046[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2046[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3385) {
                    Statics.field13[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3412) {
                    Statics.field2046[arg0][arg1][arg2] = 50;
                    Statics.field2046[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3385) {
                    Statics.field13[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3439(arg1, arg2, arg5, arg4, var8.field3399);
            }
            if (var8.field3405 != 16) {
                arg6.method3018(arg0, arg1, arg2, var8.field3405);
            }
        } else if (arg5 == 1) {
            class145 var28;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var28 = var8.method4407(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class103(arg3, 1, arg4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3086(arg0, arg1, arg2, var16, var28, (class145) null, field515[arg4], 0, var19, var21);
            if (var8.field3412) {
                if (arg4 == 0) {
                    Statics.field2046[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2046[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2046[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2046[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3439(arg1, arg2, arg5, arg4, var8.field3399);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class145 var30;
            class145 var31;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var30 = var8.method4407(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4407(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class103(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
                var31 = new class103(arg3, 2, var29, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3086(arg0, arg1, arg2, var16, var30, var31, field522[arg4], field522[var29], var19, var21);
            if (var8.field3385) {
                if (arg4 == 0) {
                    Statics.field13[arg0][arg1][arg2] |= 0x249;
                    Statics.field13[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field13[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field13[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field13[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field13[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field13[arg0][arg1][arg2] |= 0x492;
                    Statics.field13[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3439(arg1, arg2, arg5, arg4, var8.field3399);
            }
            if (var8.field3405 != 16) {
                arg6.method3018(arg0, arg1, arg2, var8.field3405);
            }
        } else if (arg5 == 3) {
            class145 var32;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var32 = var8.method4407(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class103(arg3, 3, arg4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3086(arg0, arg1, arg2, var16, var32, (class145) null, field515[arg4], 0, var19, var21);
            if (var8.field3412) {
                if (arg4 == 0) {
                    Statics.field2046[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2046[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2046[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2046[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3439(arg1, arg2, arg5, arg4, var8.field3399);
            }
        } else if (arg5 == 9) {
            class145 var33;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var33 = var8.method4407(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3160(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3398 != 0 && arg7 != null) {
                arg7.method3469(arg1, arg2, var9, var10, var8.field3399);
            }
            if (var8.field3405 != 16) {
                arg6.method3018(arg0, arg1, arg2, var8.field3405);
            }
        } else if (arg5 == 4) {
            class145 var34;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var34 = var8.method4407(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3011(arg0, arg1, arg2, var16, var34, (class145) null, field522[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method3015(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class265.method668(class138.method229(var36)).field3405;
            }
            class145 var38;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var38 = var8.method4407(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3011(arg0, arg1, arg2, var16, var38, (class145) null, field522[arg4], 0, field524[arg4] * var35, field528[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method3015(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class265.method668(class138.method229(var40)).field3405 / 2;
            }
            class145 var42;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var42 = var8.method4407(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3011(arg0, arg1, arg2, var16, var42, (class145) null, 256, arg4, field526[arg4] * var39, field527[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class145 var44;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var44 = var8.method4407(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class103(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3011(arg0, arg1, arg2, var16, var44, (class145) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method3015(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class265.method668(class138.method229(var46)).field3405 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class145 var49;
            class145 var50;
            if (var8.field3403 == -1 && var8.field3422 == null) {
                var49 = var8.method4407(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4407(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
                var50 = new class103(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3403, var8.field3430, (class145) null);
            }
            arg6.method3011(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field526[arg4] * var45, field527[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("o.q(IIII)I")
    public static int method227(int arg0, int arg1, int arg2) {
        if ((field516[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field516[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bm.l(III)I")
    public static final int method1099(int arg0, int arg1) {
        int var2 = method834(arg0 + 45365, arg1 + 91923, 4) - 128 + (method834(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method834(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("bw.s(IIII)I")
    public static final int method834(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1121(var3, var5);
        int var8 = method1121(var3 + 1, var5);
        int var9 = method1121(var3, var5 + 1);
        int var10 = method1121(var3 + 1, var5 + 1);
        int var11 = 65536 - class140.field1801[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class140.field1801[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class140.field1801[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("be.b(IIB)I")
    public static final int method1121(int arg0, int arg1) {
        int var2 = method292(arg0 - 1, arg1 - 1) + method292(arg0 + 1, arg1 - 1) + method292(arg0 - 1, arg1 + 1) + method292(arg0 + 1, arg1 + 1);
        int var3 = method292(arg0 - 1, arg1) + method292(arg0 + 1, arg1) + method292(arg0, arg1 - 1) + method292(arg0, arg1 + 1);
        int var4 = method292(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ae.a(III)I")
    public static final int method292(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ej.w(III)I")
    public static final int method3189(int arg0, int arg1) {
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

    @ObfuscatedName("bg.k(III)I")
    public static final int method1088(int arg0, int arg1) {
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

    @ObfuscatedName("fu.x(III)Z")
    public static final boolean method3378(int arg0, int arg1) {
        class265 var2 = class265.method668(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4411(arg1);
    }
}
