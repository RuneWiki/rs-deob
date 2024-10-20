package deob;

@ObfuscatedName("bc")
public final class class63 {

    @ObfuscatedName("bc.c")
    public static int[][][] field729 = new int[4][105][105];

    @ObfuscatedName("bc.i")
    public static byte[][][] field721 = new byte[4][104][104];

    @ObfuscatedName("bc.o")
    public static int field723 = 99;

    @ObfuscatedName("bc.t")
    public static final int[] field728 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bc.v")
    public static final int[] field732 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bc.n")
    public static final int[] field731 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bc.u")
    public static final int[] field727 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bc.q")
    public static final int[] field724 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bc.g")
    public static final int[] field733 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bc.y")
    public static int field735 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bc.s")
    public static int field736 = (int) (Math.random() * 33.0D) - 16;

    public class63() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.c(I)V")
    public static void method511() {
        field723 = 99;
        Statics.field734 = new byte[4][104][104];
        Statics.field730 = new byte[4][104][104];
        Statics.field725 = new byte[4][104][104];
        Statics.field2184 = new byte[4][104][104];
        Statics.field722 = new int[4][105][105];
        Statics.field726 = new byte[4][105][105];
        Statics.field720 = new int[105][105];
        Statics.field1334 = new int[104];
        Statics.field10 = new int[104];
        Statics.field2614 = new int[104];
        Statics.field649 = new int[104];
        Statics.field1974 = new int[104];
    }

    @ObfuscatedName("ck.i(I)V")
    public static void method1599() {
        Statics.field734 = (byte[][][]) null;
        Statics.field730 = (byte[][][]) null;
        Statics.field725 = (byte[][][]) null;
        Statics.field2184 = (byte[][][]) null;
        Statics.field722 = (int[][][]) null;
        Statics.field726 = (byte[][][]) null;
        Statics.field720 = (int[][]) null;
        Statics.field1334 = null;
        Statics.field10 = null;
        Statics.field2614 = null;
        Statics.field649 = null;
        Statics.field1974 = null;
    }

    @ObfuscatedName("cq.o(IIIIB)V")
    public static final void method1696(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field726[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field729[0][var5][var4] = field729[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field729[0][var5][var4] = field729[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field729[0][var5][var4] = field729[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field729[0][var5][var4] = field729[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dt.j(Lgp;IIIIIII)V")
    public static final void method2369(class195 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3429();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3429();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3429();
                }
            }
            return;
        }
        field721[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3429();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field729[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = Statics.method174(var10 + 45365, var11 + 91923, 4) - 128 + (Statics.method174(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (Statics.method174(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field729[arg1][arg2][arg3] = field729[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3429();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field729[0][arg2][arg3] = -var15 * 8;
                } else {
                    field729[arg1][arg2][arg3] = field729[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field730[arg1][arg2][arg3] = arg0.method3226();
                Statics.field725[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2184[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field721[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field734[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("f.k([BIII)Z")
    public static final boolean method74(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class195 var4 = new class195(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3239();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3239();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3429() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class283 var16 = class283.method4185(var5);
                        if (var13 != 22 || !client.field863 || var16.field3613 != 0 || var16.field3587 == 1 || var16.field3620) {
                            if (!var16.method4630()) {
                                client.field911++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3239();
                if (var9 == 0) {
                    break;
                }
                var4.method3429();
            }
        }
    }

    @ObfuscatedName("bg.x([BIILez;[Lfk;I)V")
    public static final void method1453(byte[] arg0, int arg1, int arg2, class138 arg3, class177[] arg4) {
        class195 var5 = new class195(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3239();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3239();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method3429();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field721[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class177 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method4009(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ik.z(IIIIIILez;Lfk;I)V")
    public static final void method4009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class138 arg6, class177 arg7) {
        if (client.field863 && (field721[0][arg1][arg2] & 0x2) == 0 && (field721[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field723) {
            field723 = arg0;
        }
        class283 var8 = class283.method4185(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3603;
            var10 = var8.field3602;
        } else {
            var9 = var8.field3602;
            var10 = var8.field3603;
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
        int[][] var15 = field729[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3613 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3619 == 1) {
            var20 += 256;
        }
        if (var8.method4638()) {
            class81.method256(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field863 || var8.field3613 != 0 || var8.field3587 == 1 || var8.field3620) {
                class140 var21;
                if (var8.field3593 == -1 && var8.field3628 == null) {
                    var21 = var8.method4658(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class98(arg3, 22, arg4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
                }
                arg6.method2753(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3587 == 1 && arg7 != null) {
                    arg7.method3110(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class140 var44;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var44 = var8.method4658(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class98(arg3, 10, arg4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            if (var44 != null && arg6.method2684(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3632) {
                int var45 = 15;
                if (var44 instanceof class132) {
                    var45 = ((class132) var44).method2477() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field726[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field726[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3587 != 0 && arg7 != null) {
                arg7.method3080(arg1, arg2, var9, var10, var8.field3605);
            }
        } else if (arg5 >= 12) {
            class140 var22;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var22 = var8.method4658(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2684(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field722[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3587 != 0 && arg7 != null) {
                arg7.method3080(arg1, arg2, var9, var10, var8.field3605);
            }
        } else if (arg5 == 0) {
            class140 var23;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var23 = var8.method4658(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class98(arg3, 0, arg4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2672(arg0, arg1, arg2, var16, var23, (class140) null, field728[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3632) {
                    Statics.field726[arg0][arg1][arg2] = 50;
                    Statics.field726[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3595) {
                    Statics.field722[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3632) {
                    Statics.field726[arg0][arg1][arg2 + 1] = 50;
                    Statics.field726[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3595) {
                    Statics.field722[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3632) {
                    Statics.field726[arg0][arg1 + 1][arg2] = 50;
                    Statics.field726[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3595) {
                    Statics.field722[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3632) {
                    Statics.field726[arg0][arg1][arg2] = 50;
                    Statics.field726[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3595) {
                    Statics.field722[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3587 != 0 && arg7 != null) {
                arg7.method3096(arg1, arg2, arg5, arg4, var8.field3605);
            }
            if (var8.field3611 != 16) {
                arg6.method2680(arg0, arg1, arg2, var8.field3611);
            }
        } else if (arg5 == 1) {
            class140 var24;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var24 = var8.method4658(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class98(arg3, 1, arg4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2672(arg0, arg1, arg2, var16, var24, (class140) null, field732[arg4], 0, var19, var20);
            if (var8.field3632) {
                if (arg4 == 0) {
                    Statics.field726[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field726[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field726[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field726[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3587 != 0 && arg7 != null) {
                arg7.method3096(arg1, arg2, arg5, arg4, var8.field3605);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class140 var26;
            class140 var27;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var26 = var8.method4658(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4658(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class98(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
                var27 = new class98(arg3, 2, var25, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2672(arg0, arg1, arg2, var16, var26, var27, field728[arg4], field728[var25], var19, var20);
            if (var8.field3595) {
                if (arg4 == 0) {
                    Statics.field722[arg0][arg1][arg2] |= 0x249;
                    Statics.field722[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field722[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field722[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field722[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field722[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field722[arg0][arg1][arg2] |= 0x492;
                    Statics.field722[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3587 != 0 && arg7 != null) {
                arg7.method3096(arg1, arg2, arg5, arg4, var8.field3605);
            }
            if (var8.field3611 != 16) {
                arg6.method2680(arg0, arg1, arg2, var8.field3611);
            }
        } else if (arg5 == 3) {
            class140 var28;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var28 = var8.method4658(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class98(arg3, 3, arg4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2672(arg0, arg1, arg2, var16, var28, (class140) null, field732[arg4], 0, var19, var20);
            if (var8.field3632) {
                if (arg4 == 0) {
                    Statics.field726[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field726[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field726[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field726[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3587 != 0 && arg7 != null) {
                arg7.method3096(arg1, arg2, arg5, arg4, var8.field3605);
            }
        } else if (arg5 == 9) {
            class140 var29;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var29 = var8.method4658(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2684(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3587 != 0 && arg7 != null) {
                arg7.method3080(arg1, arg2, var9, var10, var8.field3605);
            }
            if (var8.field3611 != 16) {
                arg6.method2680(arg0, arg1, arg2, var8.field3611);
            }
        } else if (arg5 == 4) {
            class140 var30;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var30 = var8.method4658(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2673(arg0, arg1, arg2, var16, var30, (class140) null, field728[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2775(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class283.method4185(var32 >> 14 & 0x7FFF).field3611;
            }
            class140 var33;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var33 = var8.method4658(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2673(arg0, arg1, arg2, var16, var33, (class140) null, field728[arg4], 0, field731[arg4] * var31, field727[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2775(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class283.method4185(var35 >> 14 & 0x7FFF).field3611 / 2;
            }
            class140 var36;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var36 = var8.method4658(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2673(arg0, arg1, arg2, var16, var36, (class140) null, 256, arg4, field724[arg4] * var34, field733[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class140 var38;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var38 = var8.method4658(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class98(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2673(arg0, arg1, arg2, var16, var38, (class140) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2775(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class283.method4185(var40 >> 14 & 0x7FFF).field3611 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class140 var42;
            class140 var43;
            if (var8.field3593 == -1 && var8.field3628 == null) {
                var42 = var8.method4658(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4658(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
                var43 = new class98(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3593, true, (class140) null);
            }
            arg6.method2673(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field724[arg4] * var39, field733[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ad.w(III)I")
    public static final int method567(int arg0, int arg1) {
        int var2 = method2084(arg0 - 1, arg1 - 1) + method2084(arg0 + 1, arg1 - 1) + method2084(arg0 - 1, arg1 + 1) + method2084(arg0 + 1, arg1 + 1);
        int var3 = method2084(arg0 - 1, arg1) + method2084(arg0 + 1, arg1) + method2084(arg0, arg1 - 1) + method2084(arg0, arg1 + 1);
        int var4 = method2084(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dh.r(III)I")
    public static final int method2084(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("k.d(III)I")
    public static final int method13(int arg0, int arg1) {
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

    @ObfuscatedName("eh.a(III)I")
    public static final int method2926(int arg0, int arg1) {
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

    @ObfuscatedName("gb.b(IIII)I")
    public static final int method3188(int arg0, int arg1, int arg2) {
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
}
