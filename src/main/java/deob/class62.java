package deob;

@ObfuscatedName("bx")
public final class class62 {

    @ObfuscatedName("bx.n")
    public static int[][][] field742 = new int[4][105][105];

    @ObfuscatedName("bx.v")
    public static byte[][][] field729 = new byte[4][104][104];

    @ObfuscatedName("bx.y")
    public static int field730 = 99;

    @ObfuscatedName("bx.m")
    public static final int[] field728 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bx.x")
    public static final int[] field736 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bx.l")
    public static final int[] field737 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bx.j")
    public static final int[] field738 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bx.g")
    public static final int[] field745 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bx.c")
    public static final int[] field740 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bx.k")
    public static int field741 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bx.q")
    public static int field733 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fa.n(B)V")
    public static void method2961() {
        field730 = 99;
        Statics.field735 = new byte[4][104][104];
        Statics.field732 = new byte[4][104][104];
        Statics.field734 = new byte[4][104][104];
        Statics.field488 = new byte[4][104][104];
        Statics.field2184 = new int[4][105][105];
        Statics.field1596 = new byte[4][105][105];
        Statics.field731 = new int[105][105];
        Statics.field722 = new int[104];
        Statics.field2190 = new int[104];
        Statics.field3484 = new int[104];
        Statics.field789 = new int[104];
        Statics.field640 = new int[104];
    }

    @ObfuscatedName("it.v(I)V")
    public static void method3911() {
        Statics.field735 = (byte[][][]) null;
        Statics.field732 = (byte[][][]) null;
        Statics.field734 = (byte[][][]) null;
        Statics.field488 = (byte[][][]) null;
        Statics.field2184 = (int[][][]) null;
        Statics.field1596 = (byte[][][]) null;
        Statics.field731 = (int[][]) null;
        Statics.field722 = null;
        Statics.field2190 = null;
        Statics.field3484 = null;
        Statics.field789 = null;
        Statics.field640 = null;
    }

    @ObfuscatedName("dc.y(IIIII)V")
    public static final void method1993(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1596[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field742[0][var5][var4] = field742[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field742[0][var5][var4] = field742[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field742[0][var5][var4] = field742[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field742[0][var5][var4] = field742[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fi.r([BIIII[Lfi;I)V")
    public static final void method2916(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class167[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2230[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class185 var9 = new class185(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3311(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ap.h(IIIB)V")
    public static final void method656(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field742[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field742[arg0][arg1][arg2 + var5] = field742[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field742[arg0][arg1 + var6][arg2] = field742[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field742[arg0][arg1 - 1][arg2] != 0) {
            field742[arg0][arg1][arg2] = field742[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field742[arg0][arg1][arg2 - 1] != 0) {
            field742[arg0][arg1][arg2] = field742[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field742[arg0][arg1 - 1][arg2 - 1] != 0) {
            field742[arg0][arg1][arg2] = field742[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("gr.d(Lgv;IIIIIII)V")
    public static final void method3311(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3021();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3021();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3021();
                }
            }
            return;
        }
        field729[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3021();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field742[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1033(var10 + 45365, var11 + 91923, 4) - 128 + (method1033(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1033(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field742[arg1][arg2][arg3] = field742[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3021();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field742[0][arg2][arg3] = -var15 * 8;
                } else {
                    field742[arg1][arg2][arg3] = field742[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field732[arg1][arg2][arg3] = arg0.method3022();
                Statics.field734[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field488[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field729[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field735[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bc.s([BIILeh;[Lfi;B)V")
    public static final void method1429(byte[] arg0, int arg1, int arg2, class139 arg3, class167[] arg4) {
        class185 var5 = new class185(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3232();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3232();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method3021();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field729[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class167 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1016(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bl.b(IIIIIILeh;Lfi;I)V")
    public static final void method1016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class139 arg6, class167 arg7) {
        if (client.field879 && (field729[0][arg1][arg2] & 0x2) == 0 && (field729[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field730) {
            field730 = arg0;
        }
        class267 var8 = class267.method1587(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3538;
            var10 = var8.field3537;
        } else {
            var9 = var8.field3537;
            var10 = var8.field3538;
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
        int[][] var15 = field742[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3524 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3562 == 1) {
            var20 += 256;
        }
        if (var8.method4341()) {
            class82 var21 = new class82();
            var21.field1243 = arg0;
            var21.field1253 = arg1 * 128;
            var21.field1244 = arg2 * 128;
            int var22 = var8.field3537;
            int var23 = var8.field3538;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3538;
                var23 = var8.field3537;
            }
            var21.field1242 = (arg1 + var22) * 128;
            var21.field1247 = (arg2 + var23) * 128;
            var21.field1249 = var8.field3566;
            var21.field1245 = var8.field3567 * 128;
            var21.field1255 = var8.field3568;
            var21.field1252 = var8.field3569;
            var21.field1246 = var8.field3570;
            if (var8.field3549 != null) {
                var21.field1256 = var8;
                var21.method1513();
            }
            class82.field1248.method3482(var21);
            if (var21.field1246 != null) {
                var21.field1254 = var21.field1255 + (int) (Math.random() * (double) (var21.field1252 - var21.field1255));
            }
        }
        if (arg5 == 22) {
            if (!client.field879 || var8.field3524 != 0 || var8.field3551 == 1 || var8.field3560) {
                class141 var24;
                if (var8.field3545 == -1 && var8.field3549 == null) {
                    var24 = var8.method4316(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class99(arg3, 22, arg4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
                }
                arg6.method2526(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3551 == 1 && arg7 != null) {
                    arg7.method2890(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class141 var47;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var47 = var8.method4316(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class99(arg3, 10, arg4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            if (var47 != null && arg6.method2530(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3539) {
                int var48 = 15;
                if (var47 instanceof class133) {
                    var48 = ((class133) var47).method2354() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field1596[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field1596[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3551 != 0 && arg7 != null) {
                arg7.method2888(arg1, arg2, var9, var10, var8.field3541);
            }
        } else if (arg5 >= 12) {
            class141 var25;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var25 = var8.method4316(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2530(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2184[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3551 != 0 && arg7 != null) {
                arg7.method2888(arg1, arg2, var9, var10, var8.field3541);
            }
        } else if (arg5 == 0) {
            class141 var26;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var26 = var8.method4316(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class99(arg3, 0, arg4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2535(arg0, arg1, arg2, var16, var26, (class141) null, field728[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3539) {
                    Statics.field1596[arg0][arg1][arg2] = 50;
                    Statics.field1596[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3544) {
                    Statics.field2184[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3539) {
                    Statics.field1596[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1596[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3544) {
                    Statics.field2184[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3539) {
                    Statics.field1596[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1596[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3544) {
                    Statics.field2184[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3539) {
                    Statics.field1596[arg0][arg1][arg2] = 50;
                    Statics.field1596[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3544) {
                    Statics.field2184[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3551 != 0 && arg7 != null) {
                arg7.method2897(arg1, arg2, arg5, arg4, var8.field3541);
            }
            if (var8.field3546 != 16) {
                arg6.method2575(arg0, arg1, arg2, var8.field3546);
            }
        } else if (arg5 == 1) {
            class141 var27;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var27 = var8.method4316(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class99(arg3, 1, arg4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2535(arg0, arg1, arg2, var16, var27, (class141) null, field736[arg4], 0, var19, var20);
            if (var8.field3539) {
                if (arg4 == 0) {
                    Statics.field1596[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1596[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1596[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1596[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3551 != 0 && arg7 != null) {
                arg7.method2897(arg1, arg2, arg5, arg4, var8.field3541);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class141 var29;
            class141 var30;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var29 = var8.method4316(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4316(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class99(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
                var30 = new class99(arg3, 2, var28, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2535(arg0, arg1, arg2, var16, var29, var30, field728[arg4], field728[var28], var19, var20);
            if (var8.field3544) {
                if (arg4 == 0) {
                    Statics.field2184[arg0][arg1][arg2] |= 0x249;
                    Statics.field2184[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2184[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2184[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2184[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2184[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2184[arg0][arg1][arg2] |= 0x492;
                    Statics.field2184[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3551 != 0 && arg7 != null) {
                arg7.method2897(arg1, arg2, arg5, arg4, var8.field3541);
            }
            if (var8.field3546 != 16) {
                arg6.method2575(arg0, arg1, arg2, var8.field3546);
            }
        } else if (arg5 == 3) {
            class141 var31;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var31 = var8.method4316(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class99(arg3, 3, arg4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2535(arg0, arg1, arg2, var16, var31, (class141) null, field736[arg4], 0, var19, var20);
            if (var8.field3539) {
                if (arg4 == 0) {
                    Statics.field1596[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1596[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1596[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1596[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3551 != 0 && arg7 != null) {
                arg7.method2897(arg1, arg2, arg5, arg4, var8.field3541);
            }
        } else if (arg5 == 9) {
            class141 var32;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var32 = var8.method4316(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2530(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3551 != 0 && arg7 != null) {
                arg7.method2888(arg1, arg2, var9, var10, var8.field3541);
            }
            if (var8.field3546 != 16) {
                arg6.method2575(arg0, arg1, arg2, var8.field3546);
            }
        } else if (arg5 == 4) {
            class141 var33;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var33 = var8.method4316(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var33, (class141) null, field728[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2536(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class267.method1587(var35 >> 14 & 0x7FFF).field3546;
            }
            class141 var36;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var36 = var8.method4316(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var36, (class141) null, field728[arg4], 0, field737[arg4] * var34, field738[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2536(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class267.method1587(var38 >> 14 & 0x7FFF).field3546 / 2;
            }
            class141 var39;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var39 = var8.method4316(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var39, (class141) null, 256, arg4, field745[arg4] * var37, field740[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class141 var41;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var41 = var8.method4316(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class99(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var41, (class141) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2536(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class267.method1587(var43 >> 14 & 0x7FFF).field3546 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class141 var45;
            class141 var46;
            if (var8.field3545 == -1 && var8.field3549 == null) {
                var45 = var8.method4316(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4316(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
                var46 = new class99(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3545, true, (class141) null);
            }
            arg6.method2655(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field745[arg4] * var42, field740[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("fo.e(Leh;[Lfi;I)V")
    public static final void method2928(class139 arg0, class167[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field729[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field729[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2889(var3, var4);
                        }
                    }
                }
            }
        }
        field741 += (int) (Math.random() * 5.0D) - 2;
        if (field741 < -8) {
            field741 = -8;
        }
        if (field741 > 8) {
            field741 = 8;
        }
        field733 += (int) (Math.random() * 5.0D) - 2;
        if (field733 < -16) {
            field733 = -16;
        }
        if (field733 > 16) {
            field733 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1596[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field742[var6][var11 + 1][var10] - field742[var6][var11 - 1][var10];
                    int var13 = field742[var6][var11][var10 + 1] - field742[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field731[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field722[var20] = 0;
                Statics.field2190[var20] = 0;
                Statics.field3484[var20] = 0;
                Statics.field789[var20] = 0;
                Statics.field640[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field735[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class258 var25 = class258.method1036(var24 - 1);
                            Statics.field722[var22] += var25.field3434;
                            Statics.field2190[var22] += var25.field3433;
                            Statics.field3484[var22] += var25.field3436;
                            Statics.field789[var22] += var25.field3432;
                            var10002 = Statics.field640[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field735[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class258 var28 = class258.method1036(var27 - 1);
                            Statics.field722[var22] -= var28.field3434;
                            Statics.field2190[var22] -= var28.field3433;
                            Statics.field3484[var22] -= var28.field3436;
                            Statics.field789[var22] -= var28.field3432;
                            var10002 = Statics.field640[var22]--;
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
                            var29 += Statics.field722[var35];
                            var30 += Statics.field2190[var35];
                            var31 += Statics.field3484[var35];
                            var32 += Statics.field789[var35];
                            var33 += Statics.field640[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field722[var36];
                            var30 -= Statics.field2190[var36];
                            var31 -= Statics.field3484[var36];
                            var32 -= Statics.field789[var36];
                            var33 -= Statics.field640[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field879 || (field729[0][var21][var34] & 0x2) != 0 || (field729[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field730) {
                                field730 = var6;
                            }
                            int var37 = Statics.field735[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field732[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field742[var6][var21][var34];
                                int var40 = field742[var6][var21 + 1][var34];
                                int var41 = field742[var6][var21 + 1][var34 + 1];
                                int var42 = field742[var6][var21][var34 + 1];
                                int var43 = Statics.field731[var21][var34];
                                int var44 = Statics.field731[var21 + 1][var34];
                                int var45 = Statics.field731[var21 + 1][var34 + 1];
                                int var46 = Statics.field731[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method3277(var49, var50, var51);
                                    int var52 = field741 + var49 & 0xFF;
                                    int var53 = field733 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method3277(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field734[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class271.method2740(var38 - 1).field3675) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field2184[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class136.field1918[method2736(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2594(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2736(var47, var43), method2736(var47, var44), method2736(var47, var45), method2736(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field734[var6][var21][var34] + 1;
                                    byte var57 = Statics.field488[var6][var21][var34];
                                    class271 var58 = class271.method2740(var38 - 1);
                                    int var59 = var58.field3676;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1925.method2217(var59);
                                        var61 = -1;
                                    } else if (var58.field3672 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method3277(var58.field3680, var58.field3678, var58.field3673);
                                        int var62 = field741 + var58.field3680 & 0xFF;
                                        int var63 = field733 + var58.field3673;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method3277(var62, var58.field3678, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class136.field1918[method3253(var60, 96)];
                                    }
                                    if (var58.field3671 != -1) {
                                        int var65 = field741 + var58.field3674 & 0xFF;
                                        int var66 = field733 + var58.field3682;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method3277(var65, var58.field3681, var66);
                                        var64 = class136.field1918[method3253(var67, 96)];
                                    }
                                    arg0.method2594(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method2736(var47, var43), method2736(var47, var44), method2736(var47, var45), method2736(var47, var46), method3253(var61, var43), method3253(var61, var44), method3253(var61, var45), method3253(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field729[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field729[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2639(var6, var69, var68, var74);
                }
            }
            Statics.field735[var6] = (byte[][]) null;
            Statics.field732[var6] = (byte[][]) null;
            Statics.field734[var6] = (byte[][]) null;
            Statics.field488[var6] = (byte[][]) null;
            Statics.field1596[var6] = (byte[][]) null;
        }
        arg0.method2551(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field729[1][var75][var76] & 0x2) == 2) {
                    arg0.method2540(var75, var76);
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
                        if ((Statics.field2184[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field2184[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field2184[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field2184[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field2184[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field742[var87][var83][var84] - var91;
                                int var93 = field742[var86][var83][var84];
                                class139.method2523(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field2184[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2184[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field2184[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field2184[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field2184[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field2184[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field742[var99][var96][var82] - var103;
                                int var105 = field742[var98][var96][var82];
                                class139.method2523(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field2184[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2184[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field2184[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field2184[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field2184[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field2184[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field742[var81][var108][var110];
                                class139.method2523(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field2184[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bh.f(IIIB)I")
    public static final int method1033(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3883(var3, var5);
        int var8 = method3883(var3 + 1, var5);
        int var9 = method3883(var3, var5 + 1);
        int var10 = method3883(var3 + 1, var5 + 1);
        int var11 = 65536 - class136.field1922[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class136.field1922[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class136.field1922[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("hg.u(III)I")
    public static final int method3883(int arg0, int arg1) {
        int var2 = method195(arg0 - 1, arg1 - 1) + method195(arg0 + 1, arg1 - 1) + method195(arg0 - 1, arg1 + 1) + method195(arg0 + 1, arg1 + 1);
        int var3 = method195(arg0 - 1, arg1) + method195(arg0 + 1, arg1) + method195(arg0, arg1 - 1) + method195(arg0, arg1 + 1);
        int var4 = method195(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("aw.t(III)I")
    public static final int method195(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("en.o(III)I")
    public static final int method2736(int arg0, int arg1) {
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

    @ObfuscatedName("gj.a(III)I")
    public static final int method3253(int arg0, int arg1) {
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

    @ObfuscatedName("gn.i(IIII)I")
    public static final int method3277(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ix.m(III)Z")
    public static final boolean method4106(int arg0, int arg1) {
        class267 var2 = class267.method1587(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4307(arg1);
    }

    @ObfuscatedName("ew.x(IIIIIIILeh;Lfi;B)V")
    public static final void method2713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class139 arg7, class167 arg8) {
        class267 var9 = class267.method1587(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3538;
            var11 = var9.field3537;
        } else {
            var10 = var9.field3537;
            var11 = var9.field3538;
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
        int[][] var16 = field742[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field3524 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field3562 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class141 var22;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var22 = var9.method4310(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class99(arg4, 22, arg5, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2526(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field3551 == 1) {
                arg8.method2890(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class141 var45;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var45 = var9.method4310(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class99(arg4, 10, arg5, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            if (var45 != null) {
                arg7.method2530(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field3551 != 0) {
                arg8.method2888(arg2, arg3, var10, var11, var9.field3541);
            }
        } else if (arg6 >= 12) {
            class141 var23;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var23 = var9.method4310(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class99(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2530(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field3551 != 0) {
                arg8.method2888(arg2, arg3, var10, var11, var9.field3541);
            }
        } else if (arg6 == 0) {
            class141 var24;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var24 = var9.method4310(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class99(arg4, 0, arg5, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2535(arg0, arg2, arg3, var17, var24, (class141) null, field728[arg5], 0, var20, var21);
            if (var9.field3551 != 0) {
                arg8.method2897(arg2, arg3, arg6, arg5, var9.field3541);
            }
        } else if (arg6 == 1) {
            class141 var25;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var25 = var9.method4310(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class99(arg4, 1, arg5, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2535(arg0, arg2, arg3, var17, var25, (class141) null, field736[arg5], 0, var20, var21);
            if (var9.field3551 != 0) {
                arg8.method2897(arg2, arg3, arg6, arg5, var9.field3541);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class141 var27;
            class141 var28;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var27 = var9.method4310(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method4310(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class99(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3545, true, (class141) null);
                var28 = new class99(arg4, 2, var26, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2535(arg0, arg2, arg3, var17, var27, var28, field728[arg5], field728[var26], var20, var21);
            if (var9.field3551 != 0) {
                arg8.method2897(arg2, arg3, arg6, arg5, var9.field3541);
            }
        } else if (arg6 == 3) {
            class141 var29;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var29 = var9.method4310(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class99(arg4, 3, arg5, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2535(arg0, arg2, arg3, var17, var29, (class141) null, field736[arg5], 0, var20, var21);
            if (var9.field3551 != 0) {
                arg8.method2897(arg2, arg3, arg6, arg5, var9.field3541);
            }
        } else if (arg6 == 9) {
            class141 var30;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var30 = var9.method4310(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class99(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2530(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field3551 != 0) {
                arg8.method2888(arg2, arg3, var10, var11, var9.field3541);
            }
        } else if (arg6 == 4) {
            class141 var31;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var31 = var9.method4310(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class99(arg4, 4, arg5, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2655(arg0, arg2, arg3, var17, var31, (class141) null, field728[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2536(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class267.method1587(var33 >> 14 & 0x7FFF).field3546;
            }
            class141 var34;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var34 = var9.method4310(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class99(arg4, 4, arg5, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2655(arg0, arg2, arg3, var17, var34, (class141) null, field728[arg5], 0, field737[arg5] * var32, field738[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2536(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class267.method1587(var36 >> 14 & 0x7FFF).field3546 / 2;
            }
            class141 var37;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var37 = var9.method4310(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class99(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2655(arg0, arg2, arg3, var17, var37, (class141) null, 256, arg5, field745[arg5] * var35, field740[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class141 var39;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var39 = var9.method4310(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class99(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2655(arg0, arg2, arg3, var17, var39, (class141) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2536(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class267.method1587(var41 >> 14 & 0x7FFF).field3546 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class141 var43;
            class141 var44;
            if (var9.field3545 == -1 && var9.field3549 == null) {
                var43 = var9.method4310(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method4310(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class99(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3545, true, (class141) null);
                var44 = new class99(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field3545, true, (class141) null);
            }
            arg7.method2655(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field745[arg5] * var40, field740[arg5] * var40, var20, var21);
        }
    }
}
