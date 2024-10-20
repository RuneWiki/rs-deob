package deob;

@ObfuscatedName("bw")
public final class class65 {

    @ObfuscatedName("bw.f")
    public static int[][][] field531 = new int[4][105][105];

    @ObfuscatedName("bw.b")
    public static byte[][][] field538 = new byte[4][104][104];

    @ObfuscatedName("bw.l")
    public static int field539 = 99;

    @ObfuscatedName("bw.j")
    public static final int[] field534 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bw.w")
    public static final int[] field535 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bw.v")
    public static final int[] field529 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bw.d")
    public static final int[] field537 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bw.a")
    public static final int[] field536 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bw.g")
    public static final int[] field530 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bw.h")
    public static int field540 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bw.i")
    public static int field541 = (int) (Math.random() * 33.0D) - 16;

    public class65() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iw.f(I)V")
    public static void method4004() {
        field539 = 99;
        Statics.field1274 = new byte[4][104][104];
        Statics.field1162 = new byte[4][104][104];
        Statics.field532 = new byte[4][104][104];
        Statics.field3860 = new byte[4][104][104];
        Statics.field2001 = new int[4][105][105];
        Statics.field3680 = new byte[4][105][105];
        Statics.field2000 = new int[105][105];
        Statics.field679 = new int[104];
        Statics.field3116 = new int[104];
        Statics.field1565 = new int[104];
        Statics.field3218 = new int[104];
        Statics.field2 = new int[104];
    }

    @ObfuscatedName("client.b(IIIIB)V")
    public static final void method1659(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3680[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field531[0][var5][var4] = field531[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field531[0][var5][var4] = field531[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field531[0][var5][var4] = field531[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field531[0][var5][var4] = field531[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bt.l([BIIIIIII[Lfh;B)V")
    public static final void method1015(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class182[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2119[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class311 var11 = new class311(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method1689(var11, arg1, arg2 + class226.method3744(var13 & 0x7, var14 & 0x7, arg7), arg3 + class226.method3493(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1689(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iz.m(IIII)V")
    public static final void method3900(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field531[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field531[arg0][arg1][arg2 + var5] = field531[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field531[arg0][arg1 + var6][arg2] = field531[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field531[arg0][arg1 - 1][arg2] != 0) {
            field531[arg0][arg1][arg2] = field531[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field531[arg0][arg1][arg2 - 1] != 0) {
            field531[arg0][arg1][arg2] = field531[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field531[arg0][arg1 - 1][arg2 - 1] != 0) {
            field531[arg0][arg1][arg2] = field531[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ce.z(Lkb;IIIIIII)V")
    public static final void method1689(class311 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method5276();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method5276();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method5276();
                }
            }
            return;
        }
        field538[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5276();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field531[0][arg2][arg3] = -method3128(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field531[arg1][arg2][arg3] = field531[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method5276();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field531[0][arg2][arg3] = -var8 * 8;
                } else {
                    field531[arg1][arg2][arg3] = field531[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1162[arg1][arg2][arg3] = arg0.method5181();
                Statics.field532[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3860[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field538[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1274[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ca.q(IIIIIILef;Lfh;I)V")
    public static final void method1967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class143 arg6, class182 arg7) {
        if (client.field685 && (field538[0][arg1][arg2] & 0x2) == 0 && (field538[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field539) {
            field539 = arg0;
        }
        class265 var8 = class265.method1122(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3390;
            var10 = var8.field3389;
        } else {
            var9 = var8.field3389;
            var10 = var8.field3390;
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
        int[][] var15 = field531[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class138.method1223(arg1, arg2, 2, var8.field3401 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3392 == 1) {
            var21 += 256;
        }
        if (var8.method4367()) {
            class85 var22 = new class85();
            var22.field1101 = arg0;
            var22.field1102 = arg1 * 128;
            var22.field1103 = arg2 * 128;
            int var23 = var8.field3389;
            int var24 = var8.field3390;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3390;
                var24 = var8.field3389;
            }
            var22.field1104 = (arg1 + var23) * 128;
            var22.field1113 = (arg2 + var24) * 128;
            var22.field1112 = var8.field3418;
            var22.field1105 = var8.field3376 * 128;
            var22.field1108 = var8.field3396;
            var22.field1110 = var8.field3400;
            var22.field1111 = var8.field3422;
            if (var8.field3414 != null) {
                var22.field1114 = var8;
                var22.method1838();
            }
            class85.field1106.method4639(var22);
            if (var22.field1111 != null) {
                var22.field1109 = var22.field1108 + (int) (Math.random() * (double) (var22.field1110 - var22.field1108));
            }
        }
        if (arg5 == 22) {
            if (!client.field685 || var8.field3401 != 0 || var8.field3391 == 1 || var8.field3421) {
                class145 var25;
                if (var8.field3397 == -1 && var8.field3414 == null) {
                    var25 = var8.method4357(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class103(arg3, 22, arg4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
                }
                arg6.method3074(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3391 == 1 && arg7 != null) {
                    arg7.method3367(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class145 var51;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var51 = var8.method4357(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class103(arg3, 10, arg4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            if (var51 != null && arg6.method2962(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3405) {
                int var52 = 15;
                if (var51 instanceof class137) {
                    var52 = ((class137) var51).method2748() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field3680[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field3680[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3391 != 0 && arg7 != null) {
                arg7.method3365(arg1, arg2, var9, var10, var8.field3381);
            }
        } else if (arg5 >= 12) {
            class145 var26;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var26 = var8.method4357(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2962(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2001[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3391 != 0 && arg7 != null) {
                arg7.method3365(arg1, arg2, var9, var10, var8.field3381);
            }
        } else if (arg5 == 0) {
            class145 var27;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var27 = var8.method4357(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class103(arg3, 0, arg4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2960(arg0, arg1, arg2, var16, var27, (class145) null, field534[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3405) {
                    Statics.field3680[arg0][arg1][arg2] = 50;
                    Statics.field3680[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3415) {
                    Statics.field2001[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3405) {
                    Statics.field3680[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3680[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3415) {
                    Statics.field2001[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3405) {
                    Statics.field3680[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3680[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3415) {
                    Statics.field2001[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3405) {
                    Statics.field3680[arg0][arg1][arg2] = 50;
                    Statics.field3680[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3415) {
                    Statics.field2001[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3391 != 0 && arg7 != null) {
                arg7.method3364(arg1, arg2, arg5, arg4, var8.field3381);
            }
            if (var8.field3412 != 16) {
                arg6.method2968(arg0, arg1, arg2, var8.field3412);
            }
        } else if (arg5 == 1) {
            class145 var28;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var28 = var8.method4357(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class103(arg3, 1, arg4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2960(arg0, arg1, arg2, var16, var28, (class145) null, field535[arg4], 0, var19, var21);
            if (var8.field3405) {
                if (arg4 == 0) {
                    Statics.field3680[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3680[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3680[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3680[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3391 != 0 && arg7 != null) {
                arg7.method3364(arg1, arg2, arg5, arg4, var8.field3381);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class145 var30;
            class145 var31;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var30 = var8.method4357(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4357(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class103(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
                var31 = new class103(arg3, 2, var29, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2960(arg0, arg1, arg2, var16, var30, var31, field534[arg4], field534[var29], var19, var21);
            if (var8.field3415) {
                if (arg4 == 0) {
                    Statics.field2001[arg0][arg1][arg2] |= 0x249;
                    Statics.field2001[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2001[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2001[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2001[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2001[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2001[arg0][arg1][arg2] |= 0x492;
                    Statics.field2001[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3391 != 0 && arg7 != null) {
                arg7.method3364(arg1, arg2, arg5, arg4, var8.field3381);
            }
            if (var8.field3412 != 16) {
                arg6.method2968(arg0, arg1, arg2, var8.field3412);
            }
        } else if (arg5 == 3) {
            class145 var32;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var32 = var8.method4357(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class103(arg3, 3, arg4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2960(arg0, arg1, arg2, var16, var32, (class145) null, field535[arg4], 0, var19, var21);
            if (var8.field3405) {
                if (arg4 == 0) {
                    Statics.field3680[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3680[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3680[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3680[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3391 != 0 && arg7 != null) {
                arg7.method3364(arg1, arg2, arg5, arg4, var8.field3381);
            }
        } else if (arg5 == 9) {
            class145 var33;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var33 = var8.method4357(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2962(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3391 != 0 && arg7 != null) {
                arg7.method3365(arg1, arg2, var9, var10, var8.field3381);
            }
            if (var8.field3412 != 16) {
                arg6.method2968(arg0, arg1, arg2, var8.field3412);
            }
        } else if (arg5 == 4) {
            class145 var34;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var34 = var8.method4357(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2961(arg0, arg1, arg2, var16, var34, (class145) null, field534[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2978(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class265.method1122(class138.method1840(var36)).field3412;
            }
            class145 var38;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var38 = var8.method4357(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2961(arg0, arg1, arg2, var16, var38, (class145) null, field534[arg4], 0, field529[arg4] * var35, field537[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2978(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class265.method1122(class138.method1840(var40)).field3412 / 2;
            }
            class145 var42;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var42 = var8.method4357(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2961(arg0, arg1, arg2, var16, var42, (class145) null, 256, arg4, field536[arg4] * var39, field530[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class145 var44;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var44 = var8.method4357(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class103(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2961(arg0, arg1, arg2, var16, var44, (class145) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2978(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class265.method1122(class138.method1840(var46)).field3412 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class145 var49;
            class145 var50;
            if (var8.field3397 == -1 && var8.field3414 == null) {
                var49 = var8.method4357(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4357(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
                var50 = new class103(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3397, true, (class145) null);
            }
            arg6.method2961(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field536[arg4] * var45, field530[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("ed.k(III)I")
    public static final int method3128(int arg0, int arg1) {
        int var2 = method2153(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2153(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2153(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ck.c(IIII)I")
    public static final int method2153(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method589(var3, var5);
        int var8 = method589(var3 + 1, var5);
        int var9 = method589(var3, var5 + 1);
        int var10 = method589(var3 + 1, var5 + 1);
        int var11 = method1662(var7, var8, var4, arg2);
        int var12 = method1662(var9, var10, var4, arg2);
        return method1662(var11, var12, var6, arg2);
    }

    @ObfuscatedName("bz.u(IIIII)I")
    public static final int method1662(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class140.field1800[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("aq.t(IIB)I")
    public static final int method589(int arg0, int arg1) {
        int var2 = method2048(arg0 - 1, arg1 - 1) + method2048(arg0 + 1, arg1 - 1) + method2048(arg0 - 1, arg1 + 1) + method2048(arg0 + 1, arg1 + 1);
        int var3 = method2048(arg0 - 1, arg1) + method2048(arg0 + 1, arg1) + method2048(arg0, arg1 - 1) + method2048(arg0, arg1 + 1);
        int var4 = method2048(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ct.e(III)I")
    public static final int method2048(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("if.o(III)I")
    public static final int method4146(int arg0, int arg1) {
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

    @ObfuscatedName("b.n(IIB)I")
    public static final int method15(int arg0, int arg1) {
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

    @ObfuscatedName("ap.x(IIIS)I")
    public static final int method729(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("eg.p(III)Z")
    public static final boolean method3153(int arg0, int arg1) {
        class265 var2 = class265.method1122(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4355(arg1);
    }
}
