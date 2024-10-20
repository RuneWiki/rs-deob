package deob;

@ObfuscatedName("bh")
public final class class62 {

    @ObfuscatedName("bh.a")
    public static int[][][] field756 = new int[4][105][105];

    @ObfuscatedName("bh.j")
    public static byte[][][] field747 = new byte[4][104][104];

    @ObfuscatedName("bh.n")
    public static int field748 = 99;

    @ObfuscatedName("bh.f")
    public static final int[] field750 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bh.h")
    public static final int[] field757 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bh.z")
    public static final int[] field749 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bh.i")
    public static final int[] field753 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bh.d")
    public static final int[] field758 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bh.b")
    public static final int[] field759 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bh.q")
    public static int field746 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bh.y")
    public static int field761 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.a(I)V")
    public static void method21() {
        field748 = 99;
        Statics.field1483 = new byte[4][104][104];
        Statics.field754 = new byte[4][104][104];
        Statics.field279 = new byte[4][104][104];
        Statics.field755 = new byte[4][104][104];
        Statics.field250 = new int[4][105][105];
        Statics.field751 = new byte[4][105][105];
        Statics.field3212 = new int[105][105];
        Statics.field752 = new int[104];
        Statics.field1524 = new int[104];
        Statics.field257 = new int[104];
        Statics.field764 = new int[104];
        Statics.field1509 = new int[104];
    }

    @ObfuscatedName("j.j(I)V")
    public static void method1() {
        Statics.field1483 = (byte[][][]) null;
        Statics.field754 = (byte[][][]) null;
        Statics.field279 = (byte[][][]) null;
        Statics.field755 = (byte[][][]) null;
        Statics.field250 = (int[][][]) null;
        Statics.field751 = (byte[][][]) null;
        Statics.field3212 = (int[][]) null;
        Statics.field752 = null;
        Statics.field1524 = null;
        Statics.field257 = null;
        Statics.field764 = null;
        Statics.field1509 = null;
    }

    @ObfuscatedName("dg.n(IIIII)V")
    public static final void method2128(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field751[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field756[0][var5][var4] = field756[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field756[0][var5][var4] = field756[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field756[0][var5][var4] = field756[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field756[0][var5][var4] = field756[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.r([BIIIIIII[Lfv;I)V")
    public static final void method40(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2295[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class174 var11 = new class174(arg0);
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
                        method1610(var11, arg1, arg2 + var22, arg3 + class216.method3080(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1610(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.v(IIIS)V")
    public static final void method110(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field756[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field756[arg0][arg1][arg2 + var5] = field756[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field756[arg0][arg1 + var6][arg2] = field756[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field756[arg0][arg1 - 1][arg2] != 0) {
            field756[arg0][arg1][arg2] = field756[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field756[arg0][arg1][arg2 - 1] != 0) {
            field756[arg0][arg1][arg2] = field756[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field756[arg0][arg1 - 1][arg2 - 1] != 0) {
            field756[arg0][arg1][arg2] = field756[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cp.e(Lfe;IIIIIIB)V")
    public static final void method1610(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2871();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2871();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2871();
                }
            }
            return;
        }
        field747[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2871();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field756[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1671(var10 + 45365, var11 + 91923, 4) - 128 + (method1671(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1671(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field756[arg1][arg2][arg3] = field756[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2871();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field756[0][arg2][arg3] = -var15 * 8;
                } else {
                    field756[arg1][arg2][arg3] = field756[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field754[arg1][arg2][arg3] = arg0.method2872();
                Statics.field279[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field755[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field747[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1483[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ae.l([BIIIIIIILem;[Lfv;I)V")
    public static final void method207(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class140 arg8, class162[] arg9) {
        class174 var10 = new class174(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2884();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2884();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2871();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class256 var21 = class256.method3652(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3450;
                    int var27 = var21.field3443;
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
                    int var32 = arg3 + class216.method2841(var16 & 0x7, var15 & 0x7, arg7, var21.field3450, var21.field3443, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field747[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class162 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method914(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.s(IIIIIILem;Lfv;I)V")
    public static final void method914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class140 arg6, class162 arg7) {
        if (client.field912 && (field747[0][arg1][arg2] & 0x2) == 0 && (field747[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field748) {
            field748 = arg0;
        }
        class256 var8 = class256.method3652(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3443;
            var10 = var8.field3450;
        } else {
            var9 = var8.field3450;
            var10 = var8.field3443;
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
        int[][] var15 = field756[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3454 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3475 == 1) {
            var20 += 256;
        }
        if (var8.method4146()) {
            class83 var21 = new class83();
            var21.field1313 = arg0;
            var21.field1314 = arg1 * 128;
            var21.field1315 = arg2 * 128;
            int var22 = var8.field3450;
            int var23 = var8.field3443;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3443;
                var23 = var8.field3450;
            }
            var21.field1316 = (arg1 + var22) * 128;
            var21.field1320 = (arg2 + var23) * 128;
            var21.field1319 = var8.field3451;
            var21.field1317 = var8.field3458 * 128;
            var21.field1321 = var8.field3481;
            var21.field1318 = var8.field3482;
            var21.field1326 = var8.field3479;
            if (var8.field3476 != null) {
                var21.field1312 = var8;
                var21.method1432();
            }
            class83.field1323.method3320(var21);
            if (var21.field1326 != null) {
                var21.field1324 = var21.field1321 + (int) (Math.random() * (double) (var21.field1318 - var21.field1321));
            }
        }
        if (arg5 == 22) {
            if (!client.field912 || var8.field3454 != 0 || var8.field3452 == 1 || var8.field3473) {
                class142 var24;
                if (var8.field3457 == -1 && var8.field3476 == null) {
                    var24 = var8.method4164(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class101(arg3, 22, arg4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
                }
                arg6.method2453(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3452 == 1 && arg7 != null) {
                    arg7.method2761(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class142 var47;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var47 = var8.method4164(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class101(arg3, 10, arg4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            if (var47 != null && arg6.method2585(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3466) {
                int var48 = 15;
                if (var47 instanceof class134) {
                    var48 = ((class134) var47).method2299() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field751[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field751[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3452 != 0 && arg7 != null) {
                arg7.method2762(arg1, arg2, var9, var10, var8.field3453);
            }
        } else if (arg5 >= 12) {
            class142 var25;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var25 = var8.method4164(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2585(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field250[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3452 != 0 && arg7 != null) {
                arg7.method2762(arg1, arg2, var9, var10, var8.field3453);
            }
        } else if (arg5 == 0) {
            class142 var26;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var26 = var8.method4164(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class101(arg3, 0, arg4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2600(arg0, arg1, arg2, var16, var26, (class142) null, field750[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3466) {
                    Statics.field751[arg0][arg1][arg2] = 50;
                    Statics.field751[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3480) {
                    Statics.field250[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3466) {
                    Statics.field751[arg0][arg1][arg2 + 1] = 50;
                    Statics.field751[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3480) {
                    Statics.field250[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3466) {
                    Statics.field751[arg0][arg1 + 1][arg2] = 50;
                    Statics.field751[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3480) {
                    Statics.field250[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3466) {
                    Statics.field751[arg0][arg1][arg2] = 50;
                    Statics.field751[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3480) {
                    Statics.field250[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3452 != 0 && arg7 != null) {
                arg7.method2758(arg1, arg2, arg5, arg4, var8.field3453);
            }
            if (var8.field3459 != 16) {
                arg6.method2459(arg0, arg1, arg2, var8.field3459);
            }
        } else if (arg5 == 1) {
            class142 var27;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var27 = var8.method4164(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class101(arg3, 1, arg4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2600(arg0, arg1, arg2, var16, var27, (class142) null, field757[arg4], 0, var19, var20);
            if (var8.field3466) {
                if (arg4 == 0) {
                    Statics.field751[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field751[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field751[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field751[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3452 != 0 && arg7 != null) {
                arg7.method2758(arg1, arg2, arg5, arg4, var8.field3453);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class142 var29;
            class142 var30;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var29 = var8.method4164(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4164(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class101(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
                var30 = new class101(arg3, 2, var28, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2600(arg0, arg1, arg2, var16, var29, var30, field750[arg4], field750[var28], var19, var20);
            if (var8.field3480) {
                if (arg4 == 0) {
                    Statics.field250[arg0][arg1][arg2] |= 0x249;
                    Statics.field250[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field250[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field250[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field250[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field250[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field250[arg0][arg1][arg2] |= 0x492;
                    Statics.field250[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3452 != 0 && arg7 != null) {
                arg7.method2758(arg1, arg2, arg5, arg4, var8.field3453);
            }
            if (var8.field3459 != 16) {
                arg6.method2459(arg0, arg1, arg2, var8.field3459);
            }
        } else if (arg5 == 3) {
            class142 var31;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var31 = var8.method4164(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class101(arg3, 3, arg4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2600(arg0, arg1, arg2, var16, var31, (class142) null, field757[arg4], 0, var19, var20);
            if (var8.field3466) {
                if (arg4 == 0) {
                    Statics.field751[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field751[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field751[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field751[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3452 != 0 && arg7 != null) {
                arg7.method2758(arg1, arg2, arg5, arg4, var8.field3453);
            }
        } else if (arg5 == 9) {
            class142 var32;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var32 = var8.method4164(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2585(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3452 != 0 && arg7 != null) {
                arg7.method2762(arg1, arg2, var9, var10, var8.field3453);
            }
            if (var8.field3459 != 16) {
                arg6.method2459(arg0, arg1, arg2, var8.field3459);
            }
        } else if (arg5 == 4) {
            class142 var33;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var33 = var8.method4164(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2468(arg0, arg1, arg2, var16, var33, (class142) null, field750[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2465(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class256.method3652(var35 >> 14 & 0x7FFF).field3459;
            }
            class142 var36;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var36 = var8.method4164(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2468(arg0, arg1, arg2, var16, var36, (class142) null, field750[arg4], 0, field749[arg4] * var34, field753[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2465(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class256.method3652(var38 >> 14 & 0x7FFF).field3459 / 2;
            }
            class142 var39;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var39 = var8.method4164(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2468(arg0, arg1, arg2, var16, var39, (class142) null, 256, arg4, field758[arg4] * var37, field759[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class142 var41;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var41 = var8.method4164(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class101(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2468(arg0, arg1, arg2, var16, var41, (class142) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2465(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class256.method3652(var43 >> 14 & 0x7FFF).field3459 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class142 var45;
            class142 var46;
            if (var8.field3457 == -1 && var8.field3476 == null) {
                var45 = var8.method4164(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4164(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
                var46 = new class101(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3457, true, (class142) null);
            }
            arg6.method2468(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field758[arg4] * var42, field759[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("bm.w(Lem;[Lfv;S)V")
    public static final void method1336(class140 arg0, class162[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field747[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field747[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2760(var3, var4);
                        }
                    }
                }
            }
        }
        field746 += (int) (Math.random() * 5.0D) - 2;
        if (field746 < -8) {
            field746 = -8;
        }
        if (field746 > 8) {
            field746 = 8;
        }
        field761 += (int) (Math.random() * 5.0D) - 2;
        if (field761 < -16) {
            field761 = -16;
        }
        if (field761 > 16) {
            field761 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field751[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field756[var6][var11 + 1][var10] - field756[var6][var11 - 1][var10];
                    int var13 = field756[var6][var11][var10 + 1] - field756[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field3212[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field752[var20] = 0;
                Statics.field1524[var20] = 0;
                Statics.field257[var20] = 0;
                Statics.field764[var20] = 0;
                Statics.field1509[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field1483[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class247 var25 = class247.method1919(var24 - 1);
                            Statics.field752[var22] += var25.field3344;
                            Statics.field1524[var22] += var25.field3342;
                            Statics.field257[var22] += var25.field3347;
                            Statics.field764[var22] += var25.field3348;
                            var10002 = Statics.field1509[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field1483[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class247 var28 = class247.method1919(var27 - 1);
                            Statics.field752[var22] -= var28.field3344;
                            Statics.field1524[var22] -= var28.field3342;
                            Statics.field257[var22] -= var28.field3347;
                            Statics.field764[var22] -= var28.field3348;
                            var10002 = Statics.field1509[var22]--;
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
                            var29 += Statics.field752[var35];
                            var30 += Statics.field1524[var35];
                            var31 += Statics.field257[var35];
                            var32 += Statics.field764[var35];
                            var33 += Statics.field1509[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field752[var36];
                            var30 -= Statics.field1524[var36];
                            var31 -= Statics.field257[var36];
                            var32 -= Statics.field764[var36];
                            var33 -= Statics.field1509[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field912 || (field747[0][var21][var34] & 0x2) != 0 || (field747[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field748) {
                                field748 = var6;
                            }
                            int var37 = Statics.field1483[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field754[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field756[var6][var21][var34];
                                int var40 = field756[var6][var21 + 1][var34];
                                int var41 = field756[var6][var21 + 1][var34 + 1];
                                int var42 = field756[var6][var21][var34 + 1];
                                int var43 = Statics.field3212[var21][var34];
                                int var44 = Statics.field3212[var21 + 1][var34];
                                int var45 = Statics.field3212[var21 + 1][var34 + 1];
                                int var46 = Statics.field3212[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = Statics.method1021(var49, var50, var51);
                                    int var52 = field746 + var49 & 0xFF;
                                    int var53 = field761 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = Statics.method1021(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field279[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !Statics.method3940(var38 - 1).field3589) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field250[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class137.field2034[method1339(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2543(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method1339(var47, var43), method1339(var47, var44), method1339(var47, var45), method1339(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field279[var6][var21][var34] + 1;
                                    byte var57 = Statics.field755[var6][var21][var34];
                                    class260 var58 = Statics.method3940(var38 - 1);
                                    int var59 = var58.field3602;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field2031.method2149(var59);
                                        var61 = -1;
                                    } else if (var58.field3591 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = Statics.method1021(var58.field3601, var58.field3596, var58.field3597);
                                        int var62 = field746 + var58.field3601 & 0xFF;
                                        int var63 = field761 + var58.field3597;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = Statics.method1021(var62, var58.field3596, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class137.field2034[method1918(var60, 96)];
                                    }
                                    if (var58.field3593 != -1) {
                                        int var65 = field746 + var58.field3598 & 0xFF;
                                        int var66 = field761 + var58.field3600;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = Statics.method1021(var65, var58.field3599, var66);
                                        var64 = class137.field2034[method1918(var67, 96)];
                                    }
                                    arg0.method2543(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method1339(var47, var43), method1339(var47, var44), method1339(var47, var45), method1339(var47, var46), method1918(var61, var43), method1918(var61, var44), method1918(var61, var45), method1918(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method2447(var6, var69, var68, method312(var6, var69, var68));
                }
            }
            Statics.field1483[var6] = (byte[][]) null;
            Statics.field754[var6] = (byte[][]) null;
            Statics.field279[var6] = (byte[][]) null;
            Statics.field755[var6] = (byte[][]) null;
            Statics.field751[var6] = (byte[][]) null;
        }
        arg0.method2627(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field747[1][var70][var71] & 0x2) == 2) {
                    arg0.method2445(var70, var71);
                }
            }
        }
        int var72 = 1;
        int var73 = 2;
        int var74 = 4;
        for (int var75 = 0; var75 < 4; var75++) {
            if (var75 > 0) {
                var72 <<= 0x3;
                var73 <<= 0x3;
                var74 <<= 0x3;
            }
            for (int var76 = 0; var76 <= var75; var76++) {
                for (int var77 = 0; var77 <= 104; var77++) {
                    for (int var78 = 0; var78 <= 104; var78++) {
                        if ((Statics.field250[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field250[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field250[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label337: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field250[var81 - 1][var78][var83] & var72) == 0) {
                                        break label337;
                                    }
                                }
                                var81--;
                            }
                            label326: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field250[var82 + 1][var78][var84] & var72) == 0) {
                                        break label326;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field756[var82][var78][var79] - var86;
                                int var88 = field756[var81][var78][var79];
                                class140.method2518(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field250[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field250[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field250[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field250[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label390: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field250[var93 - 1][var95][var77] & var73) == 0) {
                                        break label390;
                                    }
                                }
                                var93--;
                            }
                            label379: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field250[var94 + 1][var96][var77] & var73) == 0) {
                                        break label379;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field756[var94][var91][var77] - var98;
                                int var100 = field756[var93][var91][var77];
                                class140.method2518(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field250[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field250[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field250[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field250[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label443: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field250[var76][var103 - 1][var107] & var74) == 0) {
                                        break label443;
                                    }
                                }
                                var103--;
                            }
                            label432: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field250[var76][var104 + 1][var108] & var74) == 0) {
                                        break label432;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field756[var76][var103][var105];
                                class140.method2518(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field250[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.p(IIII)I")
    public static int method312(int arg0, int arg1, int arg2) {
        if ((field747[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field747[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cq.m(IIII)I")
    public static final int method1671(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method4012(var3, var5);
        int var8 = method4012(var3 + 1, var5);
        int var9 = method4012(var3, var5 + 1);
        int var10 = method4012(var3 + 1, var5 + 1);
        int var11 = method316(var7, var8, var4, arg2);
        int var12 = method316(var9, var10, var4, arg2);
        return method316(var11, var12, var6, arg2);
    }

    @ObfuscatedName("aw.u(IIIII)I")
    public static final int method316(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class137.field2035[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("iq.g(III)I")
    public static final int method4012(int arg0, int arg1) {
        int var2 = method1646(arg0 - 1, arg1 - 1) + method1646(arg0 + 1, arg1 - 1) + method1646(arg0 - 1, arg1 + 1) + method1646(arg0 + 1, arg1 + 1);
        int var3 = method1646(arg0 - 1, arg1) + method1646(arg0 + 1, arg1) + method1646(arg0, arg1 - 1) + method1646(arg0, arg1 + 1);
        int var4 = method1646(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cw.k(III)I")
    public static final int method1646(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bm.c(IIB)I")
    public static final int method1339(int arg0, int arg1) {
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

    @ObfuscatedName("do.o(III)I")
    public static final int method1918(int arg0, int arg1) {
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

    @ObfuscatedName("cd.h(III)Z")
    public static final boolean method1544(int arg0, int arg1) {
        class256 var2 = class256.method3652(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4155(arg1);
    }
}
