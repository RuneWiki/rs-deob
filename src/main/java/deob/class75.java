package deob;

@ObfuscatedName("bm")
public final class class75 {

    @ObfuscatedName("bm.c")
    public static int[][][] field998 = new int[4][105][105];

    @ObfuscatedName("bm.p")
    public static byte[][][] field999 = new byte[4][104][104];

    @ObfuscatedName("bm.f")
    public static int field1000 = 99;

    @ObfuscatedName("bm.l")
    public static final int[] field1014 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bm.e")
    public static final int[] field1006 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bm.g")
    public static final int[] field1007 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bm.y")
    public static final int[] field1001 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bm.i")
    public static final int[] field1004 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bm.r")
    public static final int[] field1010 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bm.z")
    public static int field1011 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bm.o")
    public static int field1012 = (int) (Math.random() * 33.0D) - 16;

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("et.c(B)V")
    public static void method2964() {
        field1000 = 99;
        Statics.field1724 = new byte[4][104][104];
        Statics.field3375 = new byte[4][104][104];
        Statics.field1005 = new byte[4][104][104];
        Statics.field1002 = new byte[4][104][104];
        Statics.field997 = new int[4][105][105];
        Statics.field329 = new byte[4][105][105];
        Statics.field1003 = new int[105][105];
        Statics.field2514 = new int[104];
        Statics.field4623 = new int[104];
        Statics.field4705 = new int[104];
        Statics.field4703 = new int[104];
        Statics.field1009 = new int[104];
    }

    @ObfuscatedName("h.p(I)V")
    public static void method170() {
        Statics.field1724 = (byte[][][]) null;
        Statics.field3375 = (byte[][][]) null;
        Statics.field1005 = (byte[][][]) null;
        Statics.field1002 = (byte[][][]) null;
        Statics.field997 = (int[][][]) null;
        Statics.field329 = (byte[][][]) null;
        Statics.field1003 = (int[][]) null;
        Statics.field2514 = null;
        Statics.field4623 = null;
        Statics.field4705 = null;
        Statics.field4703 = null;
        Statics.field1009 = null;
    }

    @ObfuscatedName("bg.f(IIIIB)V")
    public static final void method1037(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field329[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field998[0][var5][var4] = field998[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field998[0][var5][var4] = field998[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field998[0][var5][var4] = field998[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field998[0][var5][var4] = field998[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("jm.n([BIIII[Lgj;B)V")
    public static final void method4815(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class192[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2235[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class445 var9 = new class445(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3341(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("y.k([BIIIIIII[Lgj;B)V")
    public static final void method309(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class192[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2235[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class445 var11 = new class445(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class292.method14(var13 & 0x7, var14 & 0x7, arg7);
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
                        method3341(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method3341(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ns.w(IIII)V")
    public static final void method6153(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field998[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field998[arg0][arg1][arg2 + var5] = field998[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field998[arg0][arg1 + var6][arg2] = field998[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field998[arg0][arg1 - 1][arg2] != 0) {
            field998[arg0][arg1][arg2] = field998[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field998[arg0][arg1][arg2 - 1] != 0) {
            field998[arg0][arg1][arg2] = field998[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field998[arg0][arg1 - 1][arg2 - 1] != 0) {
            field998[arg0][arg1][arg2] = field998[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("gv.s(Lqq;IIIIIII)V")
    public static final void method3341(class445 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method7196();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method7196();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method7196();
                }
            }
            return;
        }
        field999[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method7196();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field998[0][arg2][arg3] = -method2157(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field998[arg1][arg2][arg3] = field998[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method7196();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field998[0][arg2][arg3] = -var8 * 8;
                } else {
                    field998[arg1][arg2][arg3] = field998[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field3375[arg1][arg2][arg3] = arg0.method7197();
                Statics.field1005[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1002[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field999[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1724[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("lj.m([BIILgp;[Lgj;I)V")
    public static final void method5623(byte[] arg0, int arg1, int arg2, class205 arg3, class192[] arg4) {
        class445 var5 = new class445(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method7276();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method7211();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method7196();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field999[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class192 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method4693(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bm.x([BIIIIIIILgp;[Lgj;)V")
    public static final void method2053(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class205 arg8, class192[] arg9) {
        class445 var10 = new class445(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method7276();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method7211();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method7196();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class188 var21 = Statics.method5147(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2073;
                    int var27 = var21.field2086;
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
                    int var32 = arg3 + class292.method4658(var16 & 0x7, var15 & 0x7, arg7, var21.field2073, var21.field2086, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field999[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class192 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method4693(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iy.j(IIIIIILgp;Lgj;B)V")
    public static final void method4693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class205 arg6, class192 arg7) {
        if (client.field497 && (field999[0][arg1][arg2] & 0x2) == 0 && (field999[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1000) {
            field1000 = arg0;
        }
        class188 var8 = Statics.method5147(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2086;
            var10 = var8.field2073;
        } else {
            var9 = var8.field2073;
            var10 = var8.field2086;
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
        int[][] var15 = field998[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class213.method4796(arg1, arg2, 2, var8.field2089 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2104 == 1) {
            var21 += 256;
        }
        if (var8.method3427()) {
            class63.method5144(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field497 || var8.field2089 != 0 || var8.field2087 == 1 || var8.field2108) {
                class206 var22;
                if (var8.field2110 == -1 && var8.field2111 == null) {
                    var22 = var8.method3439(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class73(arg3, 22, arg4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
                }
                arg6.method3893(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2087 == 1 && arg7 != null) {
                    arg7.method3626(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class206 var48;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var48 = var8.method3439(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class73(arg3, 10, arg4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            if (var48 != null && arg6.method4041(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2101) {
                int var49 = 15;
                if (var48 instanceof class212) {
                    var49 = ((class212) var48).method4138() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field329[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field329[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2087 != 0 && arg7 != null) {
                arg7.method3624(arg1, arg2, var9, var10, var8.field2088);
            }
        } else if (arg5 >= 12) {
            class206 var23;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var23 = var8.method3439(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method4041(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field997[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2087 != 0 && arg7 != null) {
                arg7.method3624(arg1, arg2, var9, var10, var8.field2088);
            }
        } else if (arg5 == 0) {
            class206 var24;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var24 = var8.method3439(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class73(arg3, 0, arg4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method3901(arg0, arg1, arg2, var16, var24, (class206) null, field1014[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2101) {
                    Statics.field329[arg0][arg1][arg2] = 50;
                    Statics.field329[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2109) {
                    Statics.field997[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2101) {
                    Statics.field329[arg0][arg1][arg2 + 1] = 50;
                    Statics.field329[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2109) {
                    Statics.field997[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2101) {
                    Statics.field329[arg0][arg1 + 1][arg2] = 50;
                    Statics.field329[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2109) {
                    Statics.field997[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2101) {
                    Statics.field329[arg0][arg1][arg2] = 50;
                    Statics.field329[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2109) {
                    Statics.field997[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2087 != 0 && arg7 != null) {
                arg7.method3621(arg1, arg2, arg5, arg4, var8.field2088);
            }
            if (var8.field2094 != 16) {
                arg6.method4064(arg0, arg1, arg2, var8.field2094);
            }
        } else if (arg5 == 1) {
            class206 var25;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var25 = var8.method3439(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class73(arg3, 1, arg4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method3901(arg0, arg1, arg2, var16, var25, (class206) null, field1006[arg4], 0, var19, var21);
            if (var8.field2101) {
                if (arg4 == 0) {
                    Statics.field329[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field329[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field329[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field329[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2087 != 0 && arg7 != null) {
                arg7.method3621(arg1, arg2, arg5, arg4, var8.field2088);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class206 var27;
            class206 var28;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var27 = var8.method3439(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3439(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class73(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
                var28 = new class73(arg3, 2, var26, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method3901(arg0, arg1, arg2, var16, var27, var28, field1014[arg4], field1014[var26], var19, var21);
            if (var8.field2109) {
                if (arg4 == 0) {
                    Statics.field997[arg0][arg1][arg2] |= 0x249;
                    Statics.field997[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field997[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field997[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field997[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field997[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field997[arg0][arg1][arg2] |= 0x492;
                    Statics.field997[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2087 != 0 && arg7 != null) {
                arg7.method3621(arg1, arg2, arg5, arg4, var8.field2088);
            }
            if (var8.field2094 != 16) {
                arg6.method4064(arg0, arg1, arg2, var8.field2094);
            }
        } else if (arg5 == 3) {
            class206 var29;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var29 = var8.method3439(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class73(arg3, 3, arg4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method3901(arg0, arg1, arg2, var16, var29, (class206) null, field1006[arg4], 0, var19, var21);
            if (var8.field2101) {
                if (arg4 == 0) {
                    Statics.field329[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field329[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field329[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field329[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2087 != 0 && arg7 != null) {
                arg7.method3621(arg1, arg2, arg5, arg4, var8.field2088);
            }
        } else if (arg5 == 9) {
            class206 var30;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var30 = var8.method3439(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method4041(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2087 != 0 && arg7 != null) {
                arg7.method3624(arg1, arg2, var9, var10, var8.field2088);
            }
            if (var8.field2094 != 16) {
                arg6.method4064(arg0, arg1, arg2, var8.field2094);
            }
        } else if (arg5 == 4) {
            class206 var31;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var31 = var8.method3439(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method3896(arg0, arg1, arg2, var16, var31, (class206) null, field1014[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3913(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = Statics.method5147(class213.method3085(var33)).field2094;
            }
            class206 var35;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var35 = var8.method3439(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method3896(arg0, arg1, arg2, var16, var35, (class206) null, field1014[arg4], 0, field1007[arg4] * var32, field1001[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3913(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = Statics.method5147(class213.method3085(var37)).field2094 / 2;
            }
            class206 var39;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var39 = var8.method3439(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method3896(arg0, arg1, arg2, var16, var39, (class206) null, 256, arg4, field1004[arg4] * var36, field1010[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class206 var41;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var41 = var8.method3439(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class73(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method3896(arg0, arg1, arg2, var16, var41, (class206) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3913(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = Statics.method5147(class213.method3085(var43)).field2094 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class206 var46;
            class206 var47;
            if (var8.field2110 == -1 && var8.field2111 == null) {
                var46 = var8.method3439(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3439(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
                var47 = new class73(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2110, var8.field2092, (class206) null);
            }
            arg6.method3896(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1004[arg4] * var42, field1010[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("ht.v(Lgp;[Lgj;I)V")
    public static final void method4415(class205 arg0, class192[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field999[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field999[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3649(var3, var4);
                        }
                    }
                }
            }
        }
        field1011 += (int) (Math.random() * 5.0D) - 2;
        if (field1011 < -8) {
            field1011 = -8;
        }
        if (field1011 > 8) {
            field1011 = 8;
        }
        field1012 += (int) (Math.random() * 5.0D) - 2;
        if (field1012 < -16) {
            field1012 = -16;
        }
        if (field1012 > 16) {
            field1012 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field329[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field998[var6][var16 + 1][var15] - field998[var6][var16 - 1][var15];
                    int var18 = field998[var6][var16][var15 + 1] - field998[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field1003[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field2514[var25] = 0;
                Statics.field4623[var25] = 0;
                Statics.field4705[var25] = 0;
                Statics.field4703[var25] = 0;
                Statics.field1009[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = Statics.field1724[var6][var28][var27] & 0xFF;
                        if (var29 > 0) {
                            class182 var30 = class182.method4616(var29 - 1);
                            Statics.field2514[var27] += var30.field2009;
                            Statics.field4623[var27] += var30.field2006;
                            Statics.field4705[var27] += var30.field2007;
                            Statics.field4703[var27] += var30.field2010;
                            var10002 = Statics.field1009[var27]++;
                        }
                    }
                    int var31 = var26 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field1724[var6][var31][var27] & 0xFF;
                        if (var32 > 0) {
                            class182 var33 = class182.method4616(var32 - 1);
                            Statics.field2514[var27] -= var33.field2009;
                            Statics.field4623[var27] -= var33.field2006;
                            Statics.field4705[var27] -= var33.field2007;
                            Statics.field4703[var27] -= var33.field2010;
                            var10002 = Statics.field1009[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var34 = 0;
                    int var35 = 0;
                    int var36 = 0;
                    int var37 = 0;
                    int var38 = 0;
                    for (int var39 = -5; var39 < 109; var39++) {
                        int var40 = var39 + 5;
                        if (var40 >= 0 && var40 < 104) {
                            var34 += Statics.field2514[var40];
                            var35 += Statics.field4623[var40];
                            var36 += Statics.field4705[var40];
                            var37 += Statics.field4703[var40];
                            var38 += Statics.field1009[var40];
                        }
                        int var41 = var39 - 5;
                        if (var41 >= 0 && var41 < 104) {
                            var34 -= Statics.field2514[var41];
                            var35 -= Statics.field4623[var41];
                            var36 -= Statics.field4705[var41];
                            var37 -= Statics.field4703[var41];
                            var38 -= Statics.field1009[var41];
                        }
                        if (var39 >= 1 && var39 < 103 && (!client.field497 || (field999[0][var26][var39] & 0x2) != 0 || (field999[var6][var26][var39] & 0x10) == 0)) {
                            if (var6 < field1000) {
                                field1000 = var6;
                            }
                            int var42 = Statics.field1724[var6][var26][var39] & 0xFF;
                            int var43 = Statics.field3375[var6][var26][var39] & 0xFF;
                            if (var42 > 0 || var43 > 0) {
                                int var44 = field998[var6][var26][var39];
                                int var45 = field998[var6][var26 + 1][var39];
                                int var46 = field998[var6][var26 + 1][var39 + 1];
                                int var47 = field998[var6][var26][var39 + 1];
                                int var48 = Statics.field1003[var26][var39];
                                int var49 = Statics.field1003[var26 + 1][var39];
                                int var50 = Statics.field1003[var26 + 1][var39 + 1];
                                int var51 = Statics.field1003[var26][var39 + 1];
                                int var52 = -1;
                                int var53 = -1;
                                if (var42 > 0) {
                                    int var54 = var34 * 256 / var37;
                                    int var55 = var35 / var38;
                                    int var56 = var36 / var38;
                                    var52 = method5628(var54, var55, var56);
                                    int var57 = field1011 + var54 & 0xFF;
                                    int var58 = field1012 + var56;
                                    if (var58 < 0) {
                                        var58 = 0;
                                    } else if (var58 > 255) {
                                        var58 = 255;
                                    }
                                    var53 = method5628(var57, var55, var58);
                                }
                                if (var6 > 0) {
                                    boolean var59 = true;
                                    if (var42 == 0 && Statics.field1005[var6][var26][var39] != 0) {
                                        var59 = false;
                                    }
                                    if (var43 > 0) {
                                        int var60 = var43 - 1;
                                        class190 var61 = (class190) class190.field2187.method4789((long) var60);
                                        class190 var62;
                                        if (var61 == null) {
                                            byte[] var63 = Statics.field2184.method5499(4, var60);
                                            class190 var64 = new class190();
                                            if (var63 != null) {
                                                var64.method3562(new class445(var63), var60);
                                            }
                                            var64.method3549();
                                            class190.field2187.method4781(var64, (long) var60);
                                            var62 = var64;
                                        } else {
                                            var62 = var61;
                                        }
                                        if (!var62.field2192) {
                                            var59 = false;
                                        }
                                    }
                                    if (var59 && var44 == var45 && var44 == var46 && var44 == var47) {
                                        Statics.field997[var6][var26][var39] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var53 != -1) {
                                    var65 = class202.field2377[method77(var53, 96)];
                                }
                                if (var43 == 0) {
                                    arg0.method3892(var6, var26, var39, 0, 0, -1, var44, var45, var46, var47, method77(var52, var48), method77(var52, var49), method77(var52, var50), method77(var52, var51), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field1005[var6][var26][var39] + 1;
                                    byte var67 = Statics.field1002[var6][var26][var39];
                                    int var68 = var43 - 1;
                                    class190 var69 = (class190) class190.field2187.method4789((long) var68);
                                    class190 var70;
                                    if (var69 == null) {
                                        byte[] var71 = Statics.field2184.method5499(4, var68);
                                        class190 var72 = new class190();
                                        if (var71 != null) {
                                            var72.method3562(new class445(var71), var68);
                                        }
                                        var72.method3549();
                                        class190.field2187.method4781(var72, (long) var68);
                                        var70 = var72;
                                    } else {
                                        var70 = var69;
                                    }
                                    int var74 = var70.field2183;
                                    int var75;
                                    int var76;
                                    if (var74 >= 0) {
                                        var75 = Statics.field2393.method4113(var74);
                                        var76 = -1;
                                    } else if (var70.field2182 == 16711935) {
                                        var76 = -2;
                                        var74 = -1;
                                        var75 = -2;
                                    } else {
                                        var76 = method5628(var70.field2186, var70.field2181, var70.field2188);
                                        int var77 = field1011 + var70.field2186 & 0xFF;
                                        int var78 = field1012 + var70.field2188;
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        var75 = method5628(var77, var70.field2181, var78);
                                    }
                                    int var79 = 0;
                                    if (var75 != -2) {
                                        var79 = class202.field2377[method210(var75, 96)];
                                    }
                                    if (var70.field2185 != -1) {
                                        int var80 = field1011 + var70.field2180 & 0xFF;
                                        int var81 = field1012 + var70.field2193;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        int var82 = method5628(var80, var70.field2190, var81);
                                        var79 = class202.field2377[method210(var82, 96)];
                                    }
                                    arg0.method3892(var6, var26, var39, var66, var67, var74, var44, var45, var46, var47, method77(var52, var48), method77(var52, var49), method77(var52, var50), method77(var52, var51), method210(var76, var48), method210(var76, var49), method210(var76, var50), method210(var76, var51), var65, var79);
                                }
                            }
                        }
                    }
                }
            }
            for (int var83 = 1; var83 < 103; var83++) {
                for (int var84 = 1; var84 < 103; var84++) {
                    int var89;
                    if ((field999[var6][var84][var83] & 0x8) != 0) {
                        var89 = 0;
                    } else if (var6 <= 0 || (field999[1][var84][var83] & 0x2) == 0) {
                        var89 = var6;
                    } else {
                        var89 = var6 - 1;
                    }
                    arg0.method3891(var6, var84, var83, var89);
                }
            }
            Statics.field1724[var6] = (byte[][]) null;
            Statics.field3375[var6] = (byte[][]) null;
            Statics.field1005[var6] = (byte[][]) null;
            Statics.field1002[var6] = (byte[][]) null;
            Statics.field329[var6] = (byte[][]) null;
        }
        arg0.method3918(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field999[1][var90][var91] & 0x2) == 2) {
                    arg0.method3889(var90, var91);
                }
            }
        }
        int var92 = 1;
        int var93 = 2;
        int var94 = 4;
        for (int var95 = 0; var95 < 4; var95++) {
            if (var95 > 0) {
                var92 <<= 0x3;
                var93 <<= 0x3;
                var94 <<= 0x3;
            }
            for (int var96 = 0; var96 <= var95; var96++) {
                for (int var97 = 0; var97 <= 104; var97++) {
                    for (int var98 = 0; var98 <= 104; var98++) {
                        if ((Statics.field997[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field997[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field997[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label361: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field997[var101 - 1][var98][var103] & var92) == 0) {
                                        break label361;
                                    }
                                }
                                var101--;
                            }
                            label350: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field997[var102 + 1][var98][var104] & var92) == 0) {
                                        break label350;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field998[var102][var98][var99] - var106;
                                int var108 = field998[var101][var98][var99];
                                class205.method3890(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field997[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field997[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field997[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field997[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label414: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field997[var113 - 1][var115][var97] & var93) == 0) {
                                        break label414;
                                    }
                                }
                                var113--;
                            }
                            label403: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field997[var114 + 1][var116][var97] & var93) == 0) {
                                        break label403;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field998[var114][var111][var97] - var118;
                                int var120 = field998[var113][var111][var97];
                                class205.method3890(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field997[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field997[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field997[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field997[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label467: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field997[var96][var123 - 1][var127] & var94) == 0) {
                                        break label467;
                                    }
                                }
                                var123--;
                            }
                            label456: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field997[var96][var124 + 1][var128] & var94) == 0) {
                                        break label456;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field998[var96][var123][var125];
                                class205.method3890(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field997[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.h(III)I")
    public static final int method2157(int arg0, int arg1) {
        int var2 = method3195(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3195(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3195(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("fh.t(IIIB)I")
    public static final int method3195(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2037(var3, var5);
        int var8 = method2037(var3 + 1, var5);
        int var9 = method2037(var3, var5 + 1);
        int var10 = method2037(var3 + 1, var5 + 1);
        int var11 = method6423(var7, var8, var4, arg2);
        int var12 = method6423(var9, var10, var4, arg2);
        return method6423(var11, var12, var6, arg2);
    }

    @ObfuscatedName("nk.u(IIIII)I")
    public static final int method6423(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class202.field2381[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bt.d(III)I")
    public static final int method2037(int arg0, int arg1) {
        int var2 = method6381(arg0 - 1, arg1 - 1) + method6381(arg0 + 1, arg1 - 1) + method6381(arg0 - 1, arg1 + 1) + method6381(arg0 + 1, arg1 + 1);
        int var3 = method6381(arg0 - 1, arg1) + method6381(arg0 + 1, arg1) + method6381(arg0, arg1 - 1) + method6381(arg0, arg1 + 1);
        int var4 = method6381(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("nm.b(III)I")
    public static final int method6381(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("x.a(IIB)I")
    public static final int method77(int arg0, int arg1) {
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

    @ObfuscatedName("b.l(III)I")
    public static final int method210(int arg0, int arg1) {
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

    @ObfuscatedName("lj.e(IIII)I")
    public static final int method5628(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("id.y(IIIIIIILgp;Lgj;B)V")
    public static final void method4798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class205 arg7, class192 arg8) {
        class188 var9 = Statics.method5147(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2086;
            var11 = var9.field2073;
        } else {
            var10 = var9.field2073;
            var11 = var9.field2086;
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
        int[][] var16 = field998[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class213.method4796(arg2, arg3, 2, var9.field2089 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field2104 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class206 var23;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var23 = var9.method3422(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class73(arg4, 22, arg5, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3893(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field2087 == 1) {
                arg8.method3626(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class206 var49;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var49 = var9.method3422(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class73(arg4, 10, arg5, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            if (var49 != null) {
                arg7.method4041(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field2087 != 0) {
                arg8.method3624(arg2, arg3, var10, var11, var9.field2088);
            }
        } else if (arg6 >= 12) {
            class206 var24;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var24 = var9.method3422(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method4041(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field2087 != 0) {
                arg8.method3624(arg2, arg3, var10, var11, var9.field2088);
            }
        } else if (arg6 == 0) {
            class206 var25;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var25 = var9.method3422(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class73(arg4, 0, arg5, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3901(arg0, arg2, arg3, var17, var25, (class206) null, field1014[arg5], 0, var20, var22);
            if (var9.field2087 != 0) {
                arg8.method3621(arg2, arg3, arg6, arg5, var9.field2088);
            }
        } else if (arg6 == 1) {
            class206 var26;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var26 = var9.method3422(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class73(arg4, 1, arg5, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3901(arg0, arg2, arg3, var17, var26, (class206) null, field1006[arg5], 0, var20, var22);
            if (var9.field2087 != 0) {
                arg8.method3621(arg2, arg3, arg6, arg5, var9.field2088);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class206 var28;
            class206 var29;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var28 = var9.method3422(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method3422(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class73(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
                var29 = new class73(arg4, 2, var27, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3901(arg0, arg2, arg3, var17, var28, var29, field1014[arg5], field1014[var27], var20, var22);
            if (var9.field2087 != 0) {
                arg8.method3621(arg2, arg3, arg6, arg5, var9.field2088);
            }
        } else if (arg6 == 3) {
            class206 var30;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var30 = var9.method3422(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class73(arg4, 3, arg5, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3901(arg0, arg2, arg3, var17, var30, (class206) null, field1006[arg5], 0, var20, var22);
            if (var9.field2087 != 0) {
                arg8.method3621(arg2, arg3, arg6, arg5, var9.field2088);
            }
        } else if (arg6 == 9) {
            class206 var31;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var31 = var9.method3422(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method4041(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field2087 != 0) {
                arg8.method3624(arg2, arg3, var10, var11, var9.field2088);
            }
        } else if (arg6 == 4) {
            class206 var32;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var32 = var9.method3422(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3896(arg0, arg2, arg3, var17, var32, (class206) null, field1014[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method3913(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = Statics.method5147(class213.method3085(var34)).field2094;
            }
            class206 var36;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var36 = var9.method3422(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3896(arg0, arg2, arg3, var17, var36, (class206) null, field1014[arg5], 0, field1007[arg5] * var33, field1001[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method3913(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = Statics.method5147(class213.method3085(var38)).field2094 / 2;
            }
            class206 var40;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var40 = var9.method3422(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3896(arg0, arg2, arg3, var17, var40, (class206) null, 256, arg5, field1004[arg5] * var37, field1010[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class206 var42;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var42 = var9.method3422(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class73(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3896(arg0, arg2, arg3, var17, var42, (class206) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method3913(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = Statics.method5147(class213.method3085(var44)).field2094 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class206 var47;
            class206 var48;
            if (var9.field2110 == -1 && var9.field2111 == null) {
                var47 = var9.method3422(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method3422(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
                var48 = new class73(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field2110, var9.field2092, (class206) null);
            }
            arg7.method3896(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field1004[arg5] * var43, field1010[arg5] * var43, var20, var22);
        }
    }
}
