package deob;

@ObfuscatedName("n")
public final class class6 {

    @ObfuscatedName("n.t")
    public static int[][][] field94 = new int[4][105][105];

    @ObfuscatedName("n.s")
    public static byte[][][] field80 = new byte[4][104][104];

    @ObfuscatedName("n.f")
    public static int field81 = 99;

    @ObfuscatedName("n.y")
    public static final int[] field86 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("n.r")
    public static final int[] field87 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("n.k")
    public static final int[] field88 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("n.b")
    public static final int[] field84 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("n.h")
    public static final int[] field90 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("n.i")
    public static final int[] field91 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("n.o")
    public static int field92 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("n.m")
    public static int field82 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.t(I)V")
    public static void method2903() {
        field81 = 99;
        Statics.field2966 = new byte[4][104][104];
        Statics.field93 = new byte[4][104][104];
        Statics.field83 = new byte[4][104][104];
        Statics.field608 = new byte[4][104][104];
        Statics.field2479 = new int[4][105][105];
        Statics.field2398 = new byte[4][105][105];
        Statics.field89 = new int[105][105];
        Statics.field1813 = new int[104];
        Statics.field1863 = new int[104];
        Statics.field1901 = new int[104];
        Statics.field85 = new int[104];
        Statics.field129 = new int[104];
    }

    @ObfuscatedName("au.s(S)V")
    public static void method825() {
        Statics.field2966 = (byte[][][]) null;
        Statics.field93 = (byte[][][]) null;
        Statics.field83 = (byte[][][]) null;
        Statics.field608 = (byte[][][]) null;
        Statics.field2479 = (int[][][]) null;
        Statics.field2398 = (byte[][][]) null;
        Statics.field89 = (int[][]) null;
        Statics.field1813 = null;
        Statics.field1863 = null;
        Statics.field1901 = null;
        Statics.field85 = null;
        Statics.field129 = null;
    }

    @ObfuscatedName("dp.f(IIIII)V")
    public static final void method2452(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2398[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field94[0][var5][var4] = field94[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field94[0][var5][var4] = field94[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field94[0][var5][var4] = field94[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field94[0][var5][var4] = field94[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.e([BIIIIIII[Lgo;I)V")
    public static final void method162(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class197[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2952[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class107 var11 = new class107(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class155.method488(var13 & 0x7, var14 & 0x7, arg7);
                        int var19 = var13 & 0x7;
                        int var20 = var14 & 0x7;
                        int var22 = arg7 & 0x3;
                        int var23;
                        if (var22 == 0) {
                            var23 = var20;
                        } else if (var22 == 1) {
                            var23 = 7 - var19;
                        } else if (var22 == 2) {
                            var23 = 7 - var20;
                        } else {
                            var23 = var19;
                        }
                        method2826(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method2826(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.d(IIII)V")
    public static final void method2308(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field94[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field94[arg0][arg1][arg2 + var5] = field94[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field94[arg0][arg1 + var6][arg2] = field94[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field94[arg0][arg1 - 1][arg2] != 0) {
            field94[arg0][arg1][arg2] = field94[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field94[arg0][arg1][arg2 - 1] != 0) {
            field94[arg0][arg1][arg2] = field94[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field94[arg0][arg1 - 1][arg2 - 1] != 0) {
            field94[arg0][arg1][arg2] = field94[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("eb.n(Ldb;IIIIIIS)V")
    public static final void method2826(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2101();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2101();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2101();
                }
            }
            return;
        }
        field80[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2101();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field94[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1827(var10 + 45365, var11 + 91923, 4) - 128 + (method1827(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1827(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2101();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field94[0][arg2][arg3] = -var15 * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field93[arg1][arg2][arg3] = arg0.method2102();
                Statics.field83[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field608[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field80[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field2966[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ao.v([BIILcb;[Lgo;I)V")
    public static final void method557(byte[] arg0, int arg1, int arg2, class79 arg3, class197[] arg4) {
        class107 var5 = new class107(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2114();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2114();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2101();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field80[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class197 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method25(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("f.z(IIIIIILcb;Lgo;I)V")
    public static final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class197 arg7) {
        if (client.field246 && (field80[0][arg1][arg2] & 0x2) == 0) {
            if ((field80[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method139(arg0, arg1, arg2) != client.field489) {
                return;
            }
        }
        if (arg0 < field81) {
            field81 = arg0;
        }
        class36 var8 = class36.method83(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field833;
            var10 = var8.field839;
        } else {
            var9 = var8.field839;
            var10 = var8.field833;
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
        int[][] var15 = field94[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field843 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field831 == 1) {
            var20 += 256;
        }
        if (var8.method633()) {
            class20 var21 = new class20();
            var21.field530 = arg0;
            var21.field532 = arg1 * 128;
            var21.field533 = arg2 * 128;
            int var22 = var8.field839;
            int var23 = var8.field833;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field833;
                var23 = var8.field839;
            }
            var21.field534 = (arg1 + var22) * 128;
            var21.field535 = (arg2 + var23) * 128;
            var21.field539 = var8.field868;
            var21.field537 = var8.field848 * 128;
            var21.field546 = var8.field870;
            var21.field540 = var8.field847;
            var21.field543 = var8.field872;
            if (var8.field865 != null) {
                var21.field544 = var8;
                var21.method466();
            }
            class20.field545.method3260(var21);
            if (var21.field543 != null) {
                var21.field542 = var21.field546 + (int) (Math.random() * (double) (var21.field540 - var21.field546));
            }
        }
        if (arg5 == 22) {
            if (!client.field246 || var8.field843 != 0 || var8.field841 == 1 || var8.field873) {
                class78 var24;
                if (var8.field837 == -1 && var8.field865 == null) {
                    var24 = var8.method628(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field837, true, (class78) null);
                }
                arg6.method1586(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field841 == 1 && arg7 != null) {
                    arg7.method3495(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var47;
            if (var8.field837 == -1 && var8.field865 == null) {
                var47 = var8.method628(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            if (var47 != null && arg6.method1590(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field855) {
                int var48 = 15;
                if (var47 instanceof class98) {
                    var48 = ((class98) var47).method1962() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2398[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2398[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field841 != 0 && arg7 != null) {
                arg7.method3491(arg1, arg2, var9, var10, var8.field826);
            }
        } else if (arg5 >= 12) {
            class78 var25;
            if (var8.field837 == -1 && var8.field865 == null) {
                var25 = var8.method628(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1590(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2479[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field841 != 0 && arg7 != null) {
                arg7.method3491(arg1, arg2, var9, var10, var8.field826);
            }
        } else if (arg5 == 0) {
            class78 var26;
            if (var8.field837 == -1 && var8.field865 == null) {
                var26 = var8.method628(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1588(arg0, arg1, arg2, var16, var26, (class78) null, field86[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field855) {
                    Statics.field2398[arg0][arg1][arg2] = 50;
                    Statics.field2398[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field846) {
                    Statics.field2479[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field855) {
                    Statics.field2398[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2398[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field846) {
                    Statics.field2479[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field855) {
                    Statics.field2398[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2398[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field846) {
                    Statics.field2479[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field855) {
                    Statics.field2398[arg0][arg1][arg2] = 50;
                    Statics.field2398[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field846) {
                    Statics.field2479[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field841 != 0 && arg7 != null) {
                arg7.method3493(arg1, arg2, arg5, arg4, var8.field826);
            }
            if (var8.field854 != 16) {
                arg6.method1596(arg0, arg1, arg2, var8.field854);
            }
        } else if (arg5 == 1) {
            class78 var27;
            if (var8.field837 == -1 && var8.field865 == null) {
                var27 = var8.method628(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1588(arg0, arg1, arg2, var16, var27, (class78) null, field87[arg4], 0, var19, var20);
            if (var8.field855) {
                if (arg4 == 0) {
                    Statics.field2398[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2398[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2398[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2398[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field841 != 0 && arg7 != null) {
                arg7.method3493(arg1, arg2, arg5, arg4, var8.field826);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class78 var29;
            class78 var30;
            if (var8.field837 == -1 && var8.field865 == null) {
                var29 = var8.method628(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method628(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field837, true, (class78) null);
                var30 = new class11(arg3, 2, var28, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1588(arg0, arg1, arg2, var16, var29, var30, field86[arg4], field86[var28], var19, var20);
            if (var8.field846) {
                if (arg4 == 0) {
                    Statics.field2479[arg0][arg1][arg2] |= 0x249;
                    Statics.field2479[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2479[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2479[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2479[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2479[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2479[arg0][arg1][arg2] |= 0x492;
                    Statics.field2479[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field841 != 0 && arg7 != null) {
                arg7.method3493(arg1, arg2, arg5, arg4, var8.field826);
            }
            if (var8.field854 != 16) {
                arg6.method1596(arg0, arg1, arg2, var8.field854);
            }
        } else if (arg5 == 3) {
            class78 var31;
            if (var8.field837 == -1 && var8.field865 == null) {
                var31 = var8.method628(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1588(arg0, arg1, arg2, var16, var31, (class78) null, field87[arg4], 0, var19, var20);
            if (var8.field855) {
                if (arg4 == 0) {
                    Statics.field2398[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2398[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2398[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2398[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field841 != 0 && arg7 != null) {
                arg7.method3493(arg1, arg2, arg5, arg4, var8.field826);
            }
        } else if (arg5 == 9) {
            class78 var32;
            if (var8.field837 == -1 && var8.field865 == null) {
                var32 = var8.method628(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1590(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field841 != 0 && arg7 != null) {
                arg7.method3491(arg1, arg2, var9, var10, var8.field826);
            }
            if (var8.field854 != 16) {
                arg6.method1596(arg0, arg1, arg2, var8.field854);
            }
        } else if (arg5 == 4) {
            class78 var33;
            if (var8.field837 == -1 && var8.field865 == null) {
                var33 = var8.method628(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1698(arg0, arg1, arg2, var16, var33, (class78) null, field86[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1740(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class36.method83(var35 >> 14 & 0x7FFF).field854;
            }
            class78 var36;
            if (var8.field837 == -1 && var8.field865 == null) {
                var36 = var8.method628(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1698(arg0, arg1, arg2, var16, var36, (class78) null, field86[arg4], 0, field88[arg4] * var34, field84[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1740(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class36.method83(var38 >> 14 & 0x7FFF).field854 / 2;
            }
            class78 var39;
            if (var8.field837 == -1 && var8.field865 == null) {
                var39 = var8.method628(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1698(arg0, arg1, arg2, var16, var39, (class78) null, 256, arg4, field90[arg4] * var37, field91[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class78 var41;
            if (var8.field837 == -1 && var8.field865 == null) {
                var41 = var8.method628(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class11(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1698(arg0, arg1, arg2, var16, var41, (class78) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1740(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class36.method83(var43 >> 14 & 0x7FFF).field854 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class78 var45;
            class78 var46;
            if (var8.field837 == -1 && var8.field865 == null) {
                var45 = var8.method628(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method628(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field837, true, (class78) null);
                var46 = new class11(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field837, true, (class78) null);
            }
            arg6.method1698(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field90[arg4] * var42, field91[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("c.j(IIII)I")
    public static int method139(int arg0, int arg1, int arg2) {
        if ((field80[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field80[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cn.u(IIII)I")
    public static final int method1827(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1(var3, var5);
        int var8 = method1(var3 + 1, var5);
        int var9 = method1(var3, var5 + 1);
        int var10 = method1(var3 + 1, var5 + 1);
        int var11 = 65536 - class84.field1471[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class84.field1471[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class84.field1471[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("t.g(III)I")
    public static final int method1(int arg0, int arg1) {
        int var2 = method1747(arg0 - 1, arg1 - 1) + method1747(arg0 + 1, arg1 - 1) + method1747(arg0 - 1, arg1 + 1) + method1747(arg0 + 1, arg1 + 1);
        int var3 = method1747(arg0 - 1, arg1) + method1747(arg0 + 1, arg1) + method1747(arg0, arg1 - 1) + method1747(arg0, arg1 + 1);
        int var4 = method1747(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cr.a(IIB)I")
    public static final int method1747(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("df.c(III)I")
    public static final int method2603(int arg0, int arg1) {
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

    @ObfuscatedName("ao.w(III)I")
    public static final int method553(int arg0, int arg1) {
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

    @ObfuscatedName("c.l(IIII)I")
    public static final int method138(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ds.q(III)Z")
    public static final boolean method2536(int arg0, int arg1) {
        class36 var2 = class36.method83(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method626(arg1);
    }
}
