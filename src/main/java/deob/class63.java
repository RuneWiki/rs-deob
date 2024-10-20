package deob;

@ObfuscatedName("bv")
public final class class63 {

    @ObfuscatedName("bv.s")
    public static int[][][] field731 = new int[4][105][105];

    @ObfuscatedName("bv.g")
    public static byte[][][] field723 = new byte[4][104][104];

    @ObfuscatedName("bv.m")
    public static int field737 = 99;

    @ObfuscatedName("bv.b")
    public static final int[] field730 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bv.p")
    public static final int[] field729 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bv.y")
    public static final int[] field732 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bv.n")
    public static final int[] field733 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bv.j")
    public static final int[] field739 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bv.e")
    public static final int[] field734 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bv.v")
    public static int field736 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bv.a")
    public static int field724 = (int) (Math.random() * 33.0D) - 16;

    public class63() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jk.s(I)V")
    public static void method4538() {
        field737 = 99;
        Statics.field725 = new byte[4][104][104];
        Statics.field404 = new byte[4][104][104];
        Statics.field289 = new byte[4][104][104];
        Statics.field726 = new byte[4][104][104];
        Statics.field332 = new int[4][105][105];
        Statics.field2157 = new byte[4][105][105];
        Statics.field727 = new int[105][105];
        Statics.field230 = new int[104];
        Statics.field293 = new int[104];
        Statics.field728 = new int[104];
        Statics.field1418 = new int[104];
        Statics.field248 = new int[104];
    }

    @ObfuscatedName("ao.m(IIIII)V")
    public static final void method522(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2157[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field731[0][var5][var4] = field731[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field731[0][var5][var4] = field731[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field731[0][var5][var4] = field731[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field731[0][var5][var4] = field731[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.h([BIIII[Lfb;I)V")
    public static final void method2618(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class167[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2210[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class185 var9 = new class185(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2707(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ak.i(IIIB)V")
    public static final void method455(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field731[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field731[arg0][arg1][arg2 + var5] = field731[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field731[arg0][arg1 + var6][arg2] = field731[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field731[arg0][arg1 - 1][arg2] != 0) {
            field731[arg0][arg1][arg2] = field731[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field731[arg0][arg1][arg2 - 1] != 0) {
            field731[arg0][arg1][arg2] = field731[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field731[arg0][arg1 - 1][arg2 - 1] != 0) {
            field731[arg0][arg1][arg2] = field731[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ev.w(Lgy;IIIIIII)V")
    public static final void method2707(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3239();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3239();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3239();
                }
            }
            return;
        }
        field723[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3239();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field731[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3492(var10 + 45365, var11 + 91923, 4) - 128 + (method3492(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3492(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field731[arg1][arg2][arg3] = field731[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3239();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field731[0][arg2][arg3] = -var15 * 8;
                } else {
                    field731[arg1][arg2][arg3] = field731[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field404[arg1][arg2][arg3] = arg0.method3240();
                Statics.field289[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field726[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field723[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field725[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ga.t([BIIIIIIILec;[Lfb;I)V")
    public static final void method3588(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8, class167[] arg9) {
        class185 var10 = new class185(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3253();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3253();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3239();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class267 var21 = class267.method4025(var11);
                    int var22 = arg2 + class227.method2189(var16 & 0x7, var15 & 0x7, arg7, var21.field3537, var21.field3534, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field3537;
                    int var28 = var21.field3534;
                    if ((var20 & 0x1) == 1) {
                        int var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var30 = arg7 & 0x3;
                    int var31;
                    if (var30 == 0) {
                        var31 = var25;
                    } else if (var30 == 1) {
                        var31 = 7 - var24 - (var27 - 1);
                    } else if (var30 == 2) {
                        var31 = 7 - var25 - (var28 - 1);
                    } else {
                        var31 = var24;
                    }
                    int var32 = arg3 + var31;
                    if (var22 > 0 && var32 > 0 && var22 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field723[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class167 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method1047(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.d(IIIIIILec;Lfb;I)V")
    public static final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class137 arg6, class167 arg7) {
        if (client.field991 && (field723[0][arg1][arg2] & 0x2) == 0 && (field723[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field737) {
            field737 = arg0;
        }
        class267 var8 = class267.method4025(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3534;
            var10 = var8.field3537;
        } else {
            var9 = var8.field3537;
            var10 = var8.field3534;
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
        int[][] var15 = field731[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3548 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3558 == 1) {
            var20 += 256;
        }
        if (var8.method4599()) {
            class80 var21 = new class80();
            var21.field1222 = arg0;
            var21.field1223 = arg1 * 128;
            var21.field1236 = arg2 * 128;
            int var22 = var8.field3537;
            int var23 = var8.field3534;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3534;
                var23 = var8.field3537;
            }
            var21.field1225 = (arg1 + var22) * 128;
            var21.field1226 = (arg2 + var23) * 128;
            var21.field1228 = var8.field3518;
            var21.field1227 = var8.field3563 * 128;
            var21.field1230 = var8.field3564;
            var21.field1231 = var8.field3565;
            var21.field1229 = var8.field3566;
            if (var8.field3559 != null) {
                var21.field1235 = var8;
                var21.method1644();
            }
            class80.field1234.method3747(var21);
            if (var21.field1229 != null) {
                var21.field1233 = var21.field1230 + (int) (Math.random() * (double) (var21.field1231 - var21.field1230));
            }
        }
        if (arg5 == 22) {
            if (!client.field991 || var8.field3548 != 0 || var8.field3535 == 1 || var8.field3556) {
                class139 var24;
                if (var8.field3541 == -1 && var8.field3559 == null) {
                    var24 = var8.method4592(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class97(arg3, 22, arg4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
                }
                arg6.method2718(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3535 == 1 && arg7 != null) {
                    arg7.method3087(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class139 var47;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var47 = var8.method4592(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class97(arg3, 10, arg4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            if (var47 != null && arg6.method2722(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3549) {
                int var48 = 15;
                if (var47 instanceof class131) {
                    var48 = ((class131) var47).method2529() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2157[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2157[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3535 != 0 && arg7 != null) {
                arg7.method3109(arg1, arg2, var9, var10, var8.field3536);
            }
        } else if (arg5 >= 12) {
            class139 var25;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var25 = var8.method4592(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class97(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2722(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field332[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3535 != 0 && arg7 != null) {
                arg7.method3109(arg1, arg2, var9, var10, var8.field3536);
            }
        } else if (arg5 == 0) {
            class139 var26;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var26 = var8.method4592(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class97(arg3, 0, arg4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2720(arg0, arg1, arg2, var16, var26, (class139) null, field730[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3549) {
                    Statics.field2157[arg0][arg1][arg2] = 50;
                    Statics.field2157[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3544) {
                    Statics.field332[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3549) {
                    Statics.field2157[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2157[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3544) {
                    Statics.field332[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3549) {
                    Statics.field2157[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2157[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3544) {
                    Statics.field332[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3549) {
                    Statics.field2157[arg0][arg1][arg2] = 50;
                    Statics.field2157[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3544) {
                    Statics.field332[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3535 != 0 && arg7 != null) {
                arg7.method3115(arg1, arg2, arg5, arg4, var8.field3536);
            }
            if (var8.field3542 != 16) {
                arg6.method2727(arg0, arg1, arg2, var8.field3542);
            }
        } else if (arg5 == 1) {
            class139 var27;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var27 = var8.method4592(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class97(arg3, 1, arg4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2720(arg0, arg1, arg2, var16, var27, (class139) null, field729[arg4], 0, var19, var20);
            if (var8.field3549) {
                if (arg4 == 0) {
                    Statics.field2157[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2157[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2157[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2157[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3535 != 0 && arg7 != null) {
                arg7.method3115(arg1, arg2, arg5, arg4, var8.field3536);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class139 var29;
            class139 var30;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var29 = var8.method4592(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4592(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class97(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
                var30 = new class97(arg3, 2, var28, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2720(arg0, arg1, arg2, var16, var29, var30, field730[arg4], field730[var28], var19, var20);
            if (var8.field3544) {
                if (arg4 == 0) {
                    Statics.field332[arg0][arg1][arg2] |= 0x249;
                    Statics.field332[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field332[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field332[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field332[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field332[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field332[arg0][arg1][arg2] |= 0x492;
                    Statics.field332[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3535 != 0 && arg7 != null) {
                arg7.method3115(arg1, arg2, arg5, arg4, var8.field3536);
            }
            if (var8.field3542 != 16) {
                arg6.method2727(arg0, arg1, arg2, var8.field3542);
            }
        } else if (arg5 == 3) {
            class139 var31;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var31 = var8.method4592(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class97(arg3, 3, arg4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2720(arg0, arg1, arg2, var16, var31, (class139) null, field729[arg4], 0, var19, var20);
            if (var8.field3549) {
                if (arg4 == 0) {
                    Statics.field2157[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2157[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2157[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2157[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3535 != 0 && arg7 != null) {
                arg7.method3115(arg1, arg2, arg5, arg4, var8.field3536);
            }
        } else if (arg5 == 9) {
            class139 var32;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var32 = var8.method4592(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class97(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2722(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3535 != 0 && arg7 != null) {
                arg7.method3109(arg1, arg2, var9, var10, var8.field3536);
            }
            if (var8.field3542 != 16) {
                arg6.method2727(arg0, arg1, arg2, var8.field3542);
            }
        } else if (arg5 == 4) {
            class139 var33;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var33 = var8.method4592(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class97(arg3, 4, arg4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2893(arg0, arg1, arg2, var16, var33, (class139) null, field730[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2738(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class267.method4025(var35 >> 14 & 0x7FFF).field3542;
            }
            class139 var36;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var36 = var8.method4592(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class97(arg3, 4, arg4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2893(arg0, arg1, arg2, var16, var36, (class139) null, field730[arg4], 0, field732[arg4] * var34, field733[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2738(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class267.method4025(var38 >> 14 & 0x7FFF).field3542 / 2;
            }
            class139 var39;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var39 = var8.method4592(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class97(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2893(arg0, arg1, arg2, var16, var39, (class139) null, 256, arg4, field739[arg4] * var37, field734[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class139 var41;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var41 = var8.method4592(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class97(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2893(arg0, arg1, arg2, var16, var41, (class139) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2738(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class267.method4025(var43 >> 14 & 0x7FFF).field3542 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class139 var45;
            class139 var46;
            if (var8.field3541 == -1 && var8.field3559 == null) {
                var45 = var8.method4592(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4592(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class97(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
                var46 = new class97(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3541, true, (class139) null);
            }
            arg6.method2893(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field739[arg4] * var42, field734[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("x.z(Lec;[Lfb;I)V")
    public static final void method114(class137 arg0, class167[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field723[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field723[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3111(var3, var4);
                        }
                    }
                }
            }
        }
        field736 += (int) (Math.random() * 5.0D) - 2;
        if (field736 < -8) {
            field736 = -8;
        }
        if (field736 > 8) {
            field736 = 8;
        }
        field724 += (int) (Math.random() * 5.0D) - 2;
        if (field724 < -16) {
            field724 = -16;
        }
        if (field724 > 16) {
            field724 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2157[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field731[var6][var11 + 1][var10] - field731[var6][var11 - 1][var10];
                    int var13 = field731[var6][var11][var10 + 1] - field731[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field727[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field230[var20] = 0;
                Statics.field293[var20] = 0;
                Statics.field728[var20] = 0;
                Statics.field1418[var20] = 0;
                Statics.field248[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field725[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class258 var25 = class258.method1084(var24 - 1);
                            Statics.field230[var22] += var25.field3423;
                            Statics.field293[var22] += var25.field3422;
                            Statics.field728[var22] += var25.field3427;
                            Statics.field1418[var22] += var25.field3428;
                            var10002 = Statics.field248[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field725[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class258 var28 = class258.method1084(var27 - 1);
                            Statics.field230[var22] -= var28.field3423;
                            Statics.field293[var22] -= var28.field3422;
                            Statics.field728[var22] -= var28.field3427;
                            Statics.field1418[var22] -= var28.field3428;
                            var10002 = Statics.field248[var22]--;
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
                            var29 += Statics.field230[var35];
                            var30 += Statics.field293[var35];
                            var31 += Statics.field728[var35];
                            var32 += Statics.field1418[var35];
                            var33 += Statics.field248[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field230[var36];
                            var30 -= Statics.field293[var36];
                            var31 -= Statics.field728[var36];
                            var32 -= Statics.field1418[var36];
                            var33 -= Statics.field248[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field991 || (field723[0][var21][var34] & 0x2) != 0 || (field723[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field737) {
                                field737 = var6;
                            }
                            int var37 = Statics.field725[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field404[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field731[var6][var21][var34];
                                int var40 = field731[var6][var21 + 1][var34];
                                int var41 = field731[var6][var21 + 1][var34 + 1];
                                int var42 = field731[var6][var21][var34 + 1];
                                int var43 = Statics.field727[var21][var34];
                                int var44 = Statics.field727[var21 + 1][var34];
                                int var45 = Statics.field727[var21 + 1][var34 + 1];
                                int var46 = Statics.field727[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method4981(var49, var50, var51);
                                    int var52 = field736 + var49 & 0xFF;
                                    int var53 = field724 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method4981(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field289[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class271.method2983(var38 - 1).field3669) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field332[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class134.field1914[method891(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2717(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method891(var47, var43), method891(var47, var44), method891(var47, var45), method891(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field289[var6][var21][var34] + 1;
                                    byte var57 = Statics.field726[var6][var21][var34];
                                    class271 var58 = class271.method2983(var38 - 1);
                                    int var59 = var58.field3668;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1915.method2401(var59);
                                        var61 = -1;
                                    } else if (var58.field3673 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method4981(var58.field3665, var58.field3671, var58.field3672);
                                        int var62 = field736 + var58.field3665 & 0xFF;
                                        int var63 = field724 + var58.field3672;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method4981(var62, var58.field3671, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class134.field1914[method4536(var60, 96)];
                                    }
                                    if (var58.field3670 != -1) {
                                        int var65 = field736 + var58.field3674 & 0xFF;
                                        int var66 = field724 + var58.field3676;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method4981(var65, var58.field3675, var66);
                                        var64 = class134.field1914[method4536(var67, 96)];
                                    }
                                    arg0.method2717(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method891(var47, var43), method891(var47, var44), method891(var47, var45), method891(var47, var46), method4536(var61, var43), method4536(var61, var44), method4536(var61, var45), method4536(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field723[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field723[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2716(var6, var69, var68, var74);
                }
            }
            Statics.field725[var6] = (byte[][]) null;
            Statics.field404[var6] = (byte[][]) null;
            Statics.field289[var6] = (byte[][]) null;
            Statics.field726[var6] = (byte[][]) null;
            Statics.field2157[var6] = (byte[][]) null;
        }
        arg0.method2876(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field723[1][var75][var76] & 0x2) == 2) {
                    arg0.method2714(var75, var76);
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
                        if ((Statics.field332[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field332[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field332[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field332[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field332[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field731[var87][var83][var84] - var91;
                                int var93 = field731[var86][var83][var84];
                                class137.method2715(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field332[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field332[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field332[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field332[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field332[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field332[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field731[var99][var96][var82] - var103;
                                int var105 = field731[var98][var96][var82];
                                class137.method2715(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field332[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field332[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field332[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field332[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field332[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field332[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field731[var81][var108][var110];
                                class137.method2715(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field332[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gd.k(IIII)I")
    public static final int method3492(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3137(var3, var5);
        int var8 = method3137(var3 + 1, var5);
        int var9 = method3137(var3, var5 + 1);
        int var10 = method3137(var3 + 1, var5 + 1);
        int var11 = 65536 - class134.field1903[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class134.field1903[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class134.field1903[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("fm.c(III)I")
    public static final int method3137(int arg0, int arg1) {
        int var2 = method4067(arg0 - 1, arg1 - 1) + method4067(arg0 + 1, arg1 - 1) + method4067(arg0 - 1, arg1 + 1) + method4067(arg0 + 1, arg1 + 1);
        int var3 = method4067(arg0 - 1, arg1) + method4067(arg0 + 1, arg1) + method4067(arg0, arg1 - 1) + method4067(arg0, arg1 + 1);
        int var4 = method4067(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("hv.o(IIB)I")
    public static final int method4067(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bq.l(III)I")
    public static final int method891(int arg0, int arg1) {
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

    @ObfuscatedName("jk.f(III)I")
    public static final int method4536(int arg0, int arg1) {
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

    @ObfuscatedName("jx.q(IIIB)I")
    public static final int method4981(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ah.r(IIIIIIILec;Lfb;I)V")
    public static final void method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class137 arg7, class167 arg8) {
        class267 var9 = class267.method4025(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3534;
            var11 = var9.field3537;
        } else {
            var10 = var9.field3537;
            var11 = var9.field3534;
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
        int[][] var16 = field731[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field3548 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field3558 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class139 var22;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var22 = var9.method4593(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class97(arg4, 22, arg5, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2718(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field3535 == 1) {
                arg8.method3087(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class139 var45;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var45 = var9.method4593(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class97(arg4, 10, arg5, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            if (var45 != null) {
                arg7.method2722(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field3535 != 0) {
                arg8.method3109(arg2, arg3, var10, var11, var9.field3536);
            }
        } else if (arg6 >= 12) {
            class139 var23;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var23 = var9.method4593(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class97(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2722(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field3535 != 0) {
                arg8.method3109(arg2, arg3, var10, var11, var9.field3536);
            }
        } else if (arg6 == 0) {
            class139 var24;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var24 = var9.method4593(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class97(arg4, 0, arg5, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2720(arg0, arg2, arg3, var17, var24, (class139) null, field730[arg5], 0, var20, var21);
            if (var9.field3535 != 0) {
                arg8.method3115(arg2, arg3, arg6, arg5, var9.field3536);
            }
        } else if (arg6 == 1) {
            class139 var25;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var25 = var9.method4593(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class97(arg4, 1, arg5, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2720(arg0, arg2, arg3, var17, var25, (class139) null, field729[arg5], 0, var20, var21);
            if (var9.field3535 != 0) {
                arg8.method3115(arg2, arg3, arg6, arg5, var9.field3536);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class139 var27;
            class139 var28;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var27 = var9.method4593(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method4593(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class97(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3541, true, (class139) null);
                var28 = new class97(arg4, 2, var26, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2720(arg0, arg2, arg3, var17, var27, var28, field730[arg5], field730[var26], var20, var21);
            if (var9.field3535 != 0) {
                arg8.method3115(arg2, arg3, arg6, arg5, var9.field3536);
            }
        } else if (arg6 == 3) {
            class139 var29;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var29 = var9.method4593(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class97(arg4, 3, arg5, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2720(arg0, arg2, arg3, var17, var29, (class139) null, field729[arg5], 0, var20, var21);
            if (var9.field3535 != 0) {
                arg8.method3115(arg2, arg3, arg6, arg5, var9.field3536);
            }
        } else if (arg6 == 9) {
            class139 var30;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var30 = var9.method4593(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class97(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2722(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field3535 != 0) {
                arg8.method3109(arg2, arg3, var10, var11, var9.field3536);
            }
        } else if (arg6 == 4) {
            class139 var31;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var31 = var9.method4593(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class97(arg4, 4, arg5, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2893(arg0, arg2, arg3, var17, var31, (class139) null, field730[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2738(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class267.method4025(var33 >> 14 & 0x7FFF).field3542;
            }
            class139 var34;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var34 = var9.method4593(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class97(arg4, 4, arg5, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2893(arg0, arg2, arg3, var17, var34, (class139) null, field730[arg5], 0, field732[arg5] * var32, field733[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2738(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class267.method4025(var36 >> 14 & 0x7FFF).field3542 / 2;
            }
            class139 var37;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var37 = var9.method4593(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class97(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2893(arg0, arg2, arg3, var17, var37, (class139) null, 256, arg5, field739[arg5] * var35, field734[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class139 var39;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var39 = var9.method4593(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class97(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2893(arg0, arg2, arg3, var17, var39, (class139) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2738(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class267.method4025(var41 >> 14 & 0x7FFF).field3542 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class139 var43;
            class139 var44;
            if (var9.field3541 == -1 && var9.field3559 == null) {
                var43 = var9.method4593(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method4593(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class97(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3541, true, (class139) null);
                var44 = new class97(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field3541, true, (class139) null);
            }
            arg7.method2893(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field739[arg5] * var40, field734[arg5] * var40, var20, var21);
        }
    }
}
