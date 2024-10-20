package deob;

@ObfuscatedName("k")
public final class class9 {

    @ObfuscatedName("k.d")
    public static int[][][] field130 = new int[4][105][105];

    @ObfuscatedName("k.g")
    public static byte[][][] field142 = new byte[4][104][104];

    @ObfuscatedName("k.a")
    public static int field126 = 99;

    @ObfuscatedName("k.u")
    public static final int[] field124 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("k.i")
    public static final int[] field132 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("k.e")
    public static final int[] field125 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("k.n")
    public static final int[] field134 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("k.q")
    public static final int[] field135 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("k.w")
    public static final int[] field136 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("k.o")
    public static int field137 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("k.j")
    public static int field138 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.d(I)V")
    public static void method1() {
        field126 = 99;
        Statics.field2006 = new byte[4][104][104];
        Statics.field127 = new byte[4][104][104];
        Statics.field1921 = new byte[4][104][104];
        Statics.field68 = new byte[4][104][104];
        Statics.field297 = new int[4][105][105];
        Statics.field2831 = new byte[4][105][105];
        Statics.field2007 = new int[105][105];
        Statics.field1994 = new int[104];
        Statics.field131 = new int[104];
        Statics.field2023 = new int[104];
        Statics.field129 = new int[104];
        Statics.field1618 = new int[104];
    }

    @ObfuscatedName("ap.g(B)V")
    public static void method552() {
        Statics.field2006 = (byte[][][]) null;
        Statics.field127 = (byte[][][]) null;
        Statics.field1921 = (byte[][][]) null;
        Statics.field68 = (byte[][][]) null;
        Statics.field297 = (int[][][]) null;
        Statics.field2831 = (byte[][][]) null;
        Statics.field2007 = (int[][]) null;
        Statics.field1994 = null;
        Statics.field131 = null;
        Statics.field2023 = null;
        Statics.field129 = null;
        Statics.field1618 = null;
    }

    @ObfuscatedName("ay.a(IIIIB)V")
    public static final void method858(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2831[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field130[0][var5][var4] = field130[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field130[0][var5][var4] = field130[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field130[0][var5][var4] = field130[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field130[0][var5][var4] = field130[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.t(IIIB)V")
    public static final void method866(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field130[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field130[arg0][arg1][arg2 + var5] = field130[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field130[arg0][arg1 + var6][arg2] = field130[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field130[arg0][arg1 - 1][arg2] != 0) {
            field130[arg0][arg1][arg2] = field130[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field130[arg0][arg1][arg2 - 1] != 0) {
            field130[arg0][arg1][arg2] = field130[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field130[arg0][arg1 - 1][arg2 - 1] != 0) {
            field130[arg0][arg1][arg2] = field130[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("l.f(Ldo;IIIIIIS)V")
    public static final void method135(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2509();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2509();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2509();
                }
            }
            return;
        }
        field142[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2509();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field130[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method195(var10 + 45365, var11 + 91923, 4) - 128 + (method195(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method195(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field130[arg1][arg2][arg3] = field130[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2509();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field130[0][arg2][arg3] = -var15 * 8;
                } else {
                    field130[arg1][arg2][arg3] = field130[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field127[arg1][arg2][arg3] = arg0.method2500();
                Statics.field1921[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field68[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field142[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field2006[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dq.c([BIILcq;[Lfd;B)V")
    public static final void method2289(byte[] arg0, int arg1, int arg2, class95 arg3, class164[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2413();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2413();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2509();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field142[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class164 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1501(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("u.p([BIIIIIIILcq;[Lfd;I)V")
    public static final void method165(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, class164[] arg9) {
        class127 var10 = new class127(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2413();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2413();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2509();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class32 var21 = class32.method204(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field818;
                    int var27 = var21.field816;
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
                    int var36 = var21.field818;
                    int var37 = var21.field816;
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
                        if ((field142[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class164 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method1501(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.s(IIIIIILcq;Lfd;I)V")
    public static final void method1501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field563 && (field142[0][arg1][arg2] & 0x2) == 0) {
            if ((field142[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1815(arg0, arg1, arg2) != client.field513) {
                return;
            }
        }
        if (arg0 < field126) {
            field126 = arg0;
        }
        class32 var8 = class32.method204(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field816;
            var10 = var8.field818;
        } else {
            var9 = var8.field818;
            var10 = var8.field816;
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
        int[][] var15 = field130[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field819 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field807 == 1) {
            var20 += 256;
        }
        if (var8.method655()) {
            class7.method126(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field563 || var8.field819 != 0 || var8.field850 == 1 || var8.field839) {
                class94 var21;
                if (var8.field808 == -1 && var8.field801 == null) {
                    var21 = var8.method633(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field808, true, (class94) null);
                }
                arg6.method1893(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field850 == 1 && arg7 != null) {
                    arg7.method3188(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var44;
            if (var8.field808 == -1 && var8.field801 == null) {
                var44 = var8.method633(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            if (var44 != null && arg6.method1827(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field831) {
                int var45 = 15;
                if (var44 instanceof class112) {
                    var45 = ((class112) var44).method2226() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field2831[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field2831[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3174(arg1, arg2, var9, var10, var8.field805);
            }
        } else if (arg5 >= 12) {
            class94 var22;
            if (var8.field808 == -1 && var8.field801 == null) {
                var22 = var8.method633(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1827(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field297[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3174(arg1, arg2, var9, var10, var8.field805);
            }
        } else if (arg5 == 0) {
            class94 var23;
            if (var8.field808 == -1 && var8.field801 == null) {
                var23 = var8.method633(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var16, var23, (class94) null, field124[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field831) {
                    Statics.field2831[arg0][arg1][arg2] = 50;
                    Statics.field2831[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field852) {
                    Statics.field297[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field831) {
                    Statics.field2831[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2831[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field852) {
                    Statics.field297[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field831) {
                    Statics.field2831[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2831[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field852) {
                    Statics.field297[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field831) {
                    Statics.field2831[arg0][arg1][arg2] = 50;
                    Statics.field2831[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field852) {
                    Statics.field297[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3191(arg1, arg2, arg5, arg4, var8.field805);
            }
            if (var8.field824 != 16) {
                arg6.method1870(arg0, arg1, arg2, var8.field824);
            }
        } else if (arg5 == 1) {
            class94 var24;
            if (var8.field808 == -1 && var8.field801 == null) {
                var24 = var8.method633(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var16, var24, (class94) null, field132[arg4], 0, var19, var20);
            if (var8.field831) {
                if (arg4 == 0) {
                    Statics.field2831[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2831[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2831[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2831[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3191(arg1, arg2, arg5, arg4, var8.field805);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class94 var26;
            class94 var27;
            if (var8.field808 == -1 && var8.field801 == null) {
                var26 = var8.method633(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method633(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field808, true, (class94) null);
                var27 = new class14(arg3, 2, var25, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var16, var26, var27, field124[arg4], field124[var25], var19, var20);
            if (var8.field852) {
                if (arg4 == 0) {
                    Statics.field297[arg0][arg1][arg2] |= 0x249;
                    Statics.field297[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field297[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field297[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field297[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field297[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field297[arg0][arg1][arg2] |= 0x492;
                    Statics.field297[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3191(arg1, arg2, arg5, arg4, var8.field805);
            }
            if (var8.field824 != 16) {
                arg6.method1870(arg0, arg1, arg2, var8.field824);
            }
        } else if (arg5 == 3) {
            class94 var28;
            if (var8.field808 == -1 && var8.field801 == null) {
                var28 = var8.method633(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1825(arg0, arg1, arg2, var16, var28, (class94) null, field132[arg4], 0, var19, var20);
            if (var8.field831) {
                if (arg4 == 0) {
                    Statics.field2831[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2831[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2831[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2831[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3191(arg1, arg2, arg5, arg4, var8.field805);
            }
        } else if (arg5 == 9) {
            class94 var29;
            if (var8.field808 == -1 && var8.field801 == null) {
                var29 = var8.method633(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1827(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3174(arg1, arg2, var9, var10, var8.field805);
            }
            if (var8.field824 != 16) {
                arg6.method1870(arg0, arg1, arg2, var8.field824);
            }
        } else if (arg5 == 4) {
            class94 var30;
            if (var8.field808 == -1 && var8.field801 == null) {
                var30 = var8.method633(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1993(arg0, arg1, arg2, var16, var30, (class94) null, field124[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1878(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class32.method204(var32 >> 14 & 0x7FFF).field824;
            }
            class94 var33;
            if (var8.field808 == -1 && var8.field801 == null) {
                var33 = var8.method633(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1993(arg0, arg1, arg2, var16, var33, (class94) null, field124[arg4], 0, field125[arg4] * var31, field134[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1878(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class32.method204(var35 >> 14 & 0x7FFF).field824 / 2;
            }
            class94 var36;
            if (var8.field808 == -1 && var8.field801 == null) {
                var36 = var8.method633(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1993(arg0, arg1, arg2, var16, var36, (class94) null, 256, arg4, field135[arg4] * var34, field136[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class94 var38;
            if (var8.field808 == -1 && var8.field801 == null) {
                var38 = var8.method633(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class14(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1993(arg0, arg1, arg2, var16, var38, (class94) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1878(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class32.method204(var40 >> 14 & 0x7FFF).field824 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            class94 var43;
            if (var8.field808 == -1 && var8.field801 == null) {
                var42 = var8.method633(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method633(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field808, true, (class94) null);
                var43 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field808, true, (class94) null);
            }
            arg6.method1993(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field135[arg4] * var39, field136[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("cg.k(IIII)I")
    public static int method1815(int arg0, int arg1, int arg2) {
        if ((field142[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field142[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("e.m(IIII)I")
    public static final int method195(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2912(var3, var5);
        int var8 = method2912(var3 + 1, var5);
        int var9 = method2912(var3, var5 + 1);
        int var10 = method2912(var3 + 1, var5 + 1);
        int var11 = 65536 - class104.field1771[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class104.field1771[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class104.field1771[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("el.y(III)I")
    public static final int method2912(int arg0, int arg1) {
        int var2 = method1251(arg0 - 1, arg1 - 1) + method1251(arg0 + 1, arg1 - 1) + method1251(arg0 - 1, arg1 + 1) + method1251(arg0 + 1, arg1 + 1);
        int var3 = method1251(arg0 - 1, arg1) + method1251(arg0 + 1, arg1) + method1251(arg0, arg1 - 1) + method1251(arg0, arg1 + 1);
        int var4 = method1251(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bi.b(III)I")
    public static final int method1251(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cb.l(III)I")
    public static final int method1561(int arg0, int arg1) {
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

    @ObfuscatedName("a.x(IIB)I")
    public static final int method26(int arg0, int arg1) {
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

    @ObfuscatedName("di.z(IIIB)I")
    public static final int method2148(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("j.r(IIB)Z")
    public static final boolean method219(int arg0, int arg1) {
        class32 var2 = class32.method204(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method612(arg1);
    }
}
