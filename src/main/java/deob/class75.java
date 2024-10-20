package deob;

@ObfuscatedName("bj")
public final class class75 {

    @ObfuscatedName("bj.s")
    public static int[][][] field985 = new int[4][105][105];

    @ObfuscatedName("bj.h")
    public static byte[][][] field972 = new byte[4][104][104];

    @ObfuscatedName("bj.w")
    public static int field981 = 99;

    @ObfuscatedName("bj.p")
    public static final int[] field978 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bj.e")
    public static final int[] field979 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bj.b")
    public static final int[] field980 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bj.x")
    public static final int[] field983 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bj.f")
    public static final int[] field982 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bj.t")
    public static final int[] field971 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bj.j")
    public static int field984 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bj.g")
    public static int field977 = (int) (Math.random() * 33.0D) - 16;

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("e.s(I)V")
    public static void method279() {
        field981 = 99;
        Statics.field974 = new byte[4][104][104];
        Statics.field986 = new byte[4][104][104];
        Statics.field4310 = new byte[4][104][104];
        Statics.field474 = new byte[4][104][104];
        Statics.field93 = new int[4][105][105];
        Statics.field976 = new byte[4][105][105];
        Statics.field1588 = new int[105][105];
        Statics.field1497 = new int[104];
        Statics.field908 = new int[104];
        Statics.field4041 = new int[104];
        Statics.field298 = new int[104];
        Statics.field2454 = new int[104];
    }

    @ObfuscatedName("eg.h(I)V")
    public static void method2750() {
        Statics.field974 = (byte[][][]) null;
        Statics.field986 = (byte[][][]) null;
        Statics.field4310 = (byte[][][]) null;
        Statics.field474 = (byte[][][]) null;
        Statics.field93 = (int[][][]) null;
        Statics.field976 = (byte[][][]) null;
        Statics.field1588 = (int[][]) null;
        Statics.field1497 = null;
        Statics.field908 = null;
        Statics.field4041 = null;
        Statics.field298 = null;
        Statics.field2454 = null;
    }

    @ObfuscatedName("de.w(IIIIB)V")
    public static final void method2626(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field976[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field985[0][var5][var4] = field985[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field985[0][var5][var4] = field985[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field985[0][var5][var4] = field985[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field985[0][var5][var4] = field985[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.v([BIIII[Lgl;I)V")
    public static final void method1846(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class191[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2189[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class444 var9 = new class444(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2218(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("gb.c([BIIIIIII[Lgl;I)V")
    public static final void method3320(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class191[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2189[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class444 var11 = new class444(arg0);
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
                        int var25 = arg2 + var22;
                        int var27 = var13 & 0x7;
                        int var28 = var14 & 0x7;
                        int var30 = arg7 & 0x3;
                        int var31;
                        if (var30 == 0) {
                            var31 = var28;
                        } else if (var30 == 1) {
                            var31 = 7 - var27;
                        } else if (var30 == 2) {
                            var31 = 7 - var28;
                        } else {
                            var31 = var27;
                        }
                        method2218(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method2218(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cp.i(Lqr;IIIIIII)V")
    public static final void method2218(class444 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method6929();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method6929();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method6929();
                }
            }
            return;
        }
        field972[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method6929();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field985[0][arg2][arg3] = -method6795(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field985[arg1][arg2][arg3] = field985[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method6929();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field985[0][arg2][arg3] = -var8 * 8;
                } else {
                    field985[arg1][arg2][arg3] = field985[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field986[arg1][arg2][arg3] = arg0.method6930();
                Statics.field4310[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field474[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field972[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field974[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ep.k([BIII)Z")
    public static final boolean method2739(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class444 var4 = new class444(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method7174();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method6944();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method6929() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class187 var16 = class187.method2907(var5);
                        if (var13 != 22 || !client.field480 || var16.field2075 != 0 || var16.field2053 == 1 || var16.field2036) {
                            if (!var16.method3244()) {
                                client.field645++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method6944();
                if (var9 == 0) {
                    break;
                }
                var4.method6929();
            }
        }
    }

    @ObfuscatedName("m.o([BIILgy;[Lgl;B)V")
    public static final void method152(byte[] arg0, int arg1, int arg2, class204 arg3, class191[] arg4) {
        class444 var5 = new class444(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method7174();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method6944();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method6929();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field972[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class191 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method5666(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bj.n([BIIIIIIILgy;[Lgl;)V")
    public static final void method1905(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class204 arg8, class191[] arg9) {
        class444 var10 = new class444(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method7174();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method6944();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method6929();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class187 var21 = class187.method2907(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2051;
                    int var27 = var21.field2052;
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
                    int var36 = var21.field2051;
                    int var37 = var21.field2052;
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
                        if ((field972[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class191 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method5666(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("mb.d(IIIIIILgy;Lgl;B)V")
    public static final void method5666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class204 arg6, class191 arg7) {
        if (client.field480 && (field972[0][arg1][arg2] & 0x2) == 0 && (field972[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field981) {
            field981 = arg0;
        }
        class187 var8 = class187.method2907(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2052;
            var10 = var8.field2051;
        } else {
            var9 = var8.field2051;
            var10 = var8.field2052;
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
        int[][] var15 = field985[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = Statics.method3578(arg1, arg2, 2, var8.field2075 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2076 == 1) {
            var21 += 256;
        }
        if (var8.method3249()) {
            class63.method2031(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field480 || var8.field2075 != 0 || var8.field2053 == 1 || var8.field2036) {
                class205 var22;
                if (var8.field2066 == -1 && var8.field2077 == null) {
                    var22 = var8.method3242(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class73(arg3, 22, arg4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
                }
                arg6.method3767(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2053 == 1 && arg7 != null) {
                    arg7.method3436(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class205 var48;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var48 = var8.method3242(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class73(arg3, 10, arg4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            if (var48 != null && arg6.method3719(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2067) {
                int var49 = 15;
                if (var48 instanceof class211) {
                    var49 = ((class211) var48).method3958() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field976[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field976[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2053 != 0 && arg7 != null) {
                arg7.method3437(arg1, arg2, var9, var10, var8.field2048);
            }
        } else if (arg5 >= 12) {
            class205 var23;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var23 = var8.method3242(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3719(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field93[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2053 != 0 && arg7 != null) {
                arg7.method3437(arg1, arg2, var9, var10, var8.field2048);
            }
        } else if (arg5 == 0) {
            class205 var24;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var24 = var8.method3242(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class73(arg3, 0, arg4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3717(arg0, arg1, arg2, var16, var24, (class205) null, field978[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2067) {
                    Statics.field976[arg0][arg1][arg2] = 50;
                    Statics.field976[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2035) {
                    Statics.field93[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2067) {
                    Statics.field976[arg0][arg1][arg2 + 1] = 50;
                    Statics.field976[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2035) {
                    Statics.field93[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2067) {
                    Statics.field976[arg0][arg1 + 1][arg2] = 50;
                    Statics.field976[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2035) {
                    Statics.field93[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2067) {
                    Statics.field976[arg0][arg1][arg2] = 50;
                    Statics.field976[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2035) {
                    Statics.field93[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2053 != 0 && arg7 != null) {
                arg7.method3458(arg1, arg2, arg5, arg4, var8.field2048);
            }
            if (var8.field2060 != 16) {
                arg6.method3725(arg0, arg1, arg2, var8.field2060);
            }
        } else if (arg5 == 1) {
            class205 var25;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var25 = var8.method3242(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class73(arg3, 1, arg4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3717(arg0, arg1, arg2, var16, var25, (class205) null, field979[arg4], 0, var19, var21);
            if (var8.field2067) {
                if (arg4 == 0) {
                    Statics.field976[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field976[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field976[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field976[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2053 != 0 && arg7 != null) {
                arg7.method3458(arg1, arg2, arg5, arg4, var8.field2048);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class205 var27;
            class205 var28;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var27 = var8.method3242(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3242(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class73(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
                var28 = new class73(arg3, 2, var26, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3717(arg0, arg1, arg2, var16, var27, var28, field978[arg4], field978[var26], var19, var21);
            if (var8.field2035) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2] |= 0x249;
                    Statics.field93[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field93[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field93[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] |= 0x492;
                    Statics.field93[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2053 != 0 && arg7 != null) {
                arg7.method3458(arg1, arg2, arg5, arg4, var8.field2048);
            }
            if (var8.field2060 != 16) {
                arg6.method3725(arg0, arg1, arg2, var8.field2060);
            }
        } else if (arg5 == 3) {
            class205 var29;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var29 = var8.method3242(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class73(arg3, 3, arg4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3717(arg0, arg1, arg2, var16, var29, (class205) null, field979[arg4], 0, var19, var21);
            if (var8.field2067) {
                if (arg4 == 0) {
                    Statics.field976[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field976[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field976[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field976[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2053 != 0 && arg7 != null) {
                arg7.method3458(arg1, arg2, arg5, arg4, var8.field2048);
            }
        } else if (arg5 == 9) {
            class205 var30;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var30 = var8.method3242(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3719(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2053 != 0 && arg7 != null) {
                arg7.method3437(arg1, arg2, var9, var10, var8.field2048);
            }
            if (var8.field2060 != 16) {
                arg6.method3725(arg0, arg1, arg2, var8.field2060);
            }
        } else if (arg5 == 4) {
            class205 var31;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var31 = var8.method3242(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3742(arg0, arg1, arg2, var16, var31, (class205) null, field978[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3836(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class187.method2907(class212.method4145(var33)).field2060;
            }
            class205 var35;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var35 = var8.method3242(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3742(arg0, arg1, arg2, var16, var35, (class205) null, field978[arg4], 0, field980[arg4] * var32, field983[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3836(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class187.method2907(class212.method4145(var37)).field2060 / 2;
            }
            class205 var39;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var39 = var8.method3242(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3742(arg0, arg1, arg2, var16, var39, (class205) null, 256, arg4, field982[arg4] * var36, field971[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class205 var41;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var41 = var8.method3242(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class73(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3742(arg0, arg1, arg2, var16, var41, (class205) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3836(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class187.method2907(class212.method4145(var43)).field2060 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class205 var46;
            class205 var47;
            if (var8.field2066 == -1 && var8.field2077 == null) {
                var46 = var8.method3242(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3242(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
                var47 = new class73(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2066, var8.field2086, (class205) null);
            }
            arg6.method3742(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field982[arg4] * var42, field971[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("nb.a(Lgy;[Lgl;B)V")
    public static final void method6007(class204 arg0, class191[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field972[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field972[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3438(var3, var4);
                        }
                    }
                }
            }
        }
        field984 += (int) (Math.random() * 5.0D) - 2;
        if (field984 < -8) {
            field984 = -8;
        }
        if (field984 > 8) {
            field984 = 8;
        }
        field977 += (int) (Math.random() * 5.0D) - 2;
        if (field977 < -16) {
            field977 = -16;
        }
        if (field977 > 16) {
            field977 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field976[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field985[var6][var16 + 1][var15] - field985[var6][var16 - 1][var15];
                    int var18 = field985[var6][var16][var15 + 1] - field985[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field1588[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field1497[var25] = 0;
                Statics.field908[var25] = 0;
                Statics.field4041[var25] = 0;
                Statics.field298[var25] = 0;
                Statics.field2454[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = Statics.field974[var6][var28][var27] & 0xFF;
                        if (var29 > 0) {
                            class181 var30 = class181.method323(var29 - 1);
                            Statics.field1497[var27] += var30.field1979;
                            Statics.field908[var27] += var30.field1975;
                            Statics.field4041[var27] += var30.field1976;
                            Statics.field298[var27] += var30.field1977;
                            var10002 = Statics.field2454[var27]++;
                        }
                    }
                    int var31 = var26 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field974[var6][var31][var27] & 0xFF;
                        if (var32 > 0) {
                            class181 var33 = class181.method323(var32 - 1);
                            Statics.field1497[var27] -= var33.field1979;
                            Statics.field908[var27] -= var33.field1975;
                            Statics.field4041[var27] -= var33.field1976;
                            Statics.field298[var27] -= var33.field1977;
                            var10002 = Statics.field2454[var27]--;
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
                            var34 += Statics.field1497[var40];
                            var35 += Statics.field908[var40];
                            var36 += Statics.field4041[var40];
                            var37 += Statics.field298[var40];
                            var38 += Statics.field2454[var40];
                        }
                        int var41 = var39 - 5;
                        if (var41 >= 0 && var41 < 104) {
                            var34 -= Statics.field1497[var41];
                            var35 -= Statics.field908[var41];
                            var36 -= Statics.field4041[var41];
                            var37 -= Statics.field298[var41];
                            var38 -= Statics.field2454[var41];
                        }
                        if (var39 >= 1 && var39 < 103 && (!client.field480 || (field972[0][var26][var39] & 0x2) != 0 || (field972[var6][var26][var39] & 0x10) == 0)) {
                            if (var6 < field981) {
                                field981 = var6;
                            }
                            int var42 = Statics.field974[var6][var26][var39] & 0xFF;
                            int var43 = Statics.field986[var6][var26][var39] & 0xFF;
                            if (var42 > 0 || var43 > 0) {
                                int var44 = field985[var6][var26][var39];
                                int var45 = field985[var6][var26 + 1][var39];
                                int var46 = field985[var6][var26 + 1][var39 + 1];
                                int var47 = field985[var6][var26][var39 + 1];
                                int var48 = Statics.field1588[var26][var39];
                                int var49 = Statics.field1588[var26 + 1][var39];
                                int var50 = Statics.field1588[var26 + 1][var39 + 1];
                                int var51 = Statics.field1588[var26][var39 + 1];
                                int var52 = -1;
                                int var53 = -1;
                                if (var42 > 0) {
                                    int var54 = var34 * 256 / var37;
                                    int var55 = var35 / var38;
                                    int var56 = var36 / var38;
                                    var52 = method227(var54, var55, var56);
                                    int var57 = field984 + var54 & 0xFF;
                                    int var58 = field977 + var56;
                                    if (var58 < 0) {
                                        var58 = 0;
                                    } else if (var58 > 255) {
                                        var58 = 255;
                                    }
                                    var53 = method227(var57, var55, var58);
                                }
                                if (var6 > 0) {
                                    boolean var59 = true;
                                    if (var42 == 0 && Statics.field4310[var6][var26][var39] != 0) {
                                        var59 = false;
                                    }
                                    if (var43 > 0) {
                                        int var60 = var43 - 1;
                                        class189 var61 = (class189) class189.field2154.method4599((long) var60);
                                        class189 var62;
                                        if (var61 == null) {
                                            byte[] var63 = Statics.field2155.method5179(4, var60);
                                            class189 var64 = new class189();
                                            if (var63 != null) {
                                                var64.method3366(new class444(var63), var60);
                                            }
                                            var64.method3369();
                                            class189.field2154.method4600(var64, (long) var60);
                                            var62 = var64;
                                        } else {
                                            var62 = var61;
                                        }
                                        if (!var62.field2148) {
                                            var59 = false;
                                        }
                                    }
                                    if (var59 && var44 == var45 && var44 == var46 && var44 == var47) {
                                        Statics.field93[var6][var26][var39] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var53 != -1) {
                                    var65 = class201.field2358[method3194(var53, 96)];
                                }
                                if (var43 == 0) {
                                    arg0.method3714(var6, var26, var39, 0, 0, -1, var44, var45, var46, var47, method3194(var52, var48), method3194(var52, var49), method3194(var52, var50), method3194(var52, var51), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field4310[var6][var26][var39] + 1;
                                    byte var67 = Statics.field474[var6][var26][var39];
                                    int var68 = var43 - 1;
                                    class189 var69 = (class189) class189.field2154.method4599((long) var68);
                                    class189 var70;
                                    if (var69 == null) {
                                        byte[] var71 = Statics.field2155.method5179(4, var68);
                                        class189 var72 = new class189();
                                        if (var71 != null) {
                                            var72.method3366(new class444(var71), var68);
                                        }
                                        var72.method3369();
                                        class189.field2154.method4600(var72, (long) var68);
                                        var70 = var72;
                                    } else {
                                        var70 = var69;
                                    }
                                    int var74 = var70.field2153;
                                    int var75;
                                    int var76;
                                    if (var74 >= 0) {
                                        var75 = Statics.field2348.method3896(var74);
                                        var76 = -1;
                                    } else if (var70.field2146 == 16711935) {
                                        var76 = -2;
                                        var74 = -1;
                                        var75 = -2;
                                    } else {
                                        var76 = method227(var70.field2150, var70.field2144, var70.field2152);
                                        int var77 = field984 + var70.field2150 & 0xFF;
                                        int var78 = field977 + var70.field2152;
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        var75 = method227(var77, var70.field2144, var78);
                                    }
                                    int var79 = 0;
                                    if (var75 != -2) {
                                        var79 = class201.field2358[method425(var75, 96)];
                                    }
                                    if (var70.field2147 != -1) {
                                        int var80 = field984 + var70.field2149 & 0xFF;
                                        int var81 = field977 + var70.field2145;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        int var82 = method227(var80, var70.field2151, var81);
                                        var79 = class201.field2358[method425(var82, 96)];
                                    }
                                    arg0.method3714(var6, var26, var39, var66, var67, var74, var44, var45, var46, var47, method3194(var52, var48), method3194(var52, var49), method3194(var52, var50), method3194(var52, var51), method425(var76, var48), method425(var76, var49), method425(var76, var50), method425(var76, var51), var65, var79);
                                }
                            }
                        }
                    }
                }
            }
            for (int var83 = 1; var83 < 103; var83++) {
                for (int var84 = 1; var84 < 103; var84++) {
                    arg0.method3713(var6, var84, var83, method4491(var6, var84, var83));
                }
            }
            Statics.field974[var6] = (byte[][]) null;
            Statics.field986[var6] = (byte[][]) null;
            Statics.field4310[var6] = (byte[][]) null;
            Statics.field474[var6] = (byte[][]) null;
            Statics.field976[var6] = (byte[][]) null;
        }
        arg0.method3740(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field972[1][var85][var86] & 0x2) == 2) {
                    arg0.method3777(var85, var86);
                }
            }
        }
        int var87 = 1;
        int var88 = 2;
        int var89 = 4;
        for (int var90 = 0; var90 < 4; var90++) {
            if (var90 > 0) {
                var87 <<= 0x3;
                var88 <<= 0x3;
                var89 <<= 0x3;
            }
            for (int var91 = 0; var91 <= var90; var91++) {
                for (int var92 = 0; var92 <= 104; var92++) {
                    for (int var93 = 0; var93 <= 104; var93++) {
                        if ((Statics.field93[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field93[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field93[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label355: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field93[var96 - 1][var93][var98] & var87) == 0) {
                                        break label355;
                                    }
                                }
                                var96--;
                            }
                            label344: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field93[var97 + 1][var93][var99] & var87) == 0) {
                                        break label344;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field985[var97][var93][var94] - var101;
                                int var103 = field985[var96][var93][var94];
                                class204.method3712(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field93[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field93[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field93[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field93[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label408: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field93[var108 - 1][var110][var92] & var88) == 0) {
                                        break label408;
                                    }
                                }
                                var108--;
                            }
                            label397: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field93[var109 + 1][var111][var92] & var88) == 0) {
                                        break label397;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field985[var109][var106][var92] - var113;
                                int var115 = field985[var108][var106][var92];
                                class204.method3712(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field93[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field93[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field93[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field93[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label461: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field93[var91][var118 - 1][var122] & var89) == 0) {
                                        break label461;
                                    }
                                }
                                var118--;
                            }
                            label450: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field93[var91][var119 + 1][var123] & var89) == 0) {
                                        break label450;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field985[var91][var118][var120];
                                class204.method3712(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field93[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ix.m(IIII)I")
    public static int method4491(int arg0, int arg1, int arg2) {
        if ((field972[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field972[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("pk.u(IIB)I")
    public static final int method6795(int arg0, int arg1) {
        int var2 = method4046(arg0 + 45365, arg1 + 91923, 4) - 128 + (method4046(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method4046(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("hg.l(IIII)I")
    public static final int method4046(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1525(var3, var5);
        int var8 = method1525(var3 + 1, var5);
        int var9 = method1525(var3, var5 + 1);
        int var10 = method1525(var3 + 1, var5 + 1);
        int var11 = 65536 - class201.field2363[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class201.field2363[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class201.field2363[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("bd.z(III)I")
    public static final int method1525(int arg0, int arg1) {
        int var2 = method4419(arg0 - 1, arg1 - 1) + method4419(arg0 + 1, arg1 - 1) + method4419(arg0 - 1, arg1 + 1) + method4419(arg0 + 1, arg1 + 1);
        int var3 = method4419(arg0 - 1, arg1) + method4419(arg0 + 1, arg1) + method4419(arg0, arg1 - 1) + method4419(arg0, arg1 + 1);
        int var4 = method4419(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("hb.r(IIB)I")
    public static final int method4419(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("gm.y(IIB)I")
    public static final int method3194(int arg0, int arg1) {
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

    @ObfuscatedName("ab.p(III)I")
    public static final int method425(int arg0, int arg1) {
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

    @ObfuscatedName("y.e(IIIB)I")
    public static final int method227(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("client.b(III)Z")
    public static final boolean method1478(int arg0, int arg1) {
        class187 var2 = class187.method2907(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3243(arg1);
    }

    @ObfuscatedName("l.x(IIIIIIILgy;Lgl;B)V")
    public static final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class204 arg7, class191 arg8) {
        class187 var9 = class187.method2907(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2052;
            var11 = var9.field2051;
        } else {
            var10 = var9.field2051;
            var11 = var9.field2052;
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
        int[][] var16 = field985[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = Statics.method3578(arg2, arg3, 2, var9.field2075 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field2076 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class205 var23;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var23 = var9.method3246(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class73(arg4, 22, arg5, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3767(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field2053 == 1) {
                arg8.method3436(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class205 var49;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var49 = var9.method3246(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class73(arg4, 10, arg5, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            if (var49 != null) {
                arg7.method3719(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field2053 != 0) {
                arg8.method3437(arg2, arg3, var10, var11, var9.field2048);
            }
        } else if (arg6 >= 12) {
            class205 var24;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var24 = var9.method3246(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3719(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field2053 != 0) {
                arg8.method3437(arg2, arg3, var10, var11, var9.field2048);
            }
        } else if (arg6 == 0) {
            class205 var25;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var25 = var9.method3246(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class73(arg4, 0, arg5, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3717(arg0, arg2, arg3, var17, var25, (class205) null, field978[arg5], 0, var20, var22);
            if (var9.field2053 != 0) {
                arg8.method3458(arg2, arg3, arg6, arg5, var9.field2048);
            }
        } else if (arg6 == 1) {
            class205 var26;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var26 = var9.method3246(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class73(arg4, 1, arg5, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3717(arg0, arg2, arg3, var17, var26, (class205) null, field979[arg5], 0, var20, var22);
            if (var9.field2053 != 0) {
                arg8.method3458(arg2, arg3, arg6, arg5, var9.field2048);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class205 var28;
            class205 var29;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var28 = var9.method3246(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method3246(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class73(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
                var29 = new class73(arg4, 2, var27, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3717(arg0, arg2, arg3, var17, var28, var29, field978[arg5], field978[var27], var20, var22);
            if (var9.field2053 != 0) {
                arg8.method3458(arg2, arg3, arg6, arg5, var9.field2048);
            }
        } else if (arg6 == 3) {
            class205 var30;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var30 = var9.method3246(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class73(arg4, 3, arg5, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3717(arg0, arg2, arg3, var17, var30, (class205) null, field979[arg5], 0, var20, var22);
            if (var9.field2053 != 0) {
                arg8.method3458(arg2, arg3, arg6, arg5, var9.field2048);
            }
        } else if (arg6 == 9) {
            class205 var31;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var31 = var9.method3246(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3719(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field2053 != 0) {
                arg8.method3437(arg2, arg3, var10, var11, var9.field2048);
            }
        } else if (arg6 == 4) {
            class205 var32;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var32 = var9.method3246(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3742(arg0, arg2, arg3, var17, var32, (class205) null, field978[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method3836(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class187.method2907(class212.method4145(var34)).field2060;
            }
            class205 var36;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var36 = var9.method3246(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3742(arg0, arg2, arg3, var17, var36, (class205) null, field978[arg5], 0, field980[arg5] * var33, field983[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method3836(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class187.method2907(class212.method4145(var38)).field2060 / 2;
            }
            class205 var40;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var40 = var9.method3246(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3742(arg0, arg2, arg3, var17, var40, (class205) null, 256, arg5, field982[arg5] * var37, field971[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class205 var42;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var42 = var9.method3246(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class73(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3742(arg0, arg2, arg3, var17, var42, (class205) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method3836(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class187.method2907(class212.method4145(var44)).field2060 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class205 var47;
            class205 var48;
            if (var9.field2066 == -1 && var9.field2077 == null) {
                var47 = var9.method3246(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method3246(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
                var48 = new class73(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field2066, var9.field2086, (class205) null);
            }
            arg7.method3742(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field982[arg5] * var43, field971[arg5] * var43, var20, var22);
        }
    }
}
