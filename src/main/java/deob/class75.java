package deob;

@ObfuscatedName("bn")
public final class class75 {

    @ObfuscatedName("bn.o")
    public static int[][][] field985 = new int[4][105][105];

    @ObfuscatedName("bn.q")
    public static byte[][][] field993 = new byte[4][104][104];

    @ObfuscatedName("bn.l")
    public static int field984 = 99;

    @ObfuscatedName("bn.e")
    public static final int[] field989 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bn.h")
    public static final int[] field990 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bn.f")
    public static final int[] field991 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bn.d")
    public static final int[] field992 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bn.j")
    public static final int[] field996 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bn.z")
    public static final int[] field994 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bn.i")
    public static int field1000 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bn.u")
    public static int field987 = (int) (Math.random() * 33.0D) - 16;

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.o(I)V")
    public static void method2782() {
        field984 = 99;
        Statics.field995 = new byte[4][104][104];
        Statics.field982 = new byte[4][104][104];
        Statics.field983 = new byte[4][104][104];
        Statics.field4813 = new byte[4][104][104];
        Statics.field1994 = new int[4][105][105];
        Statics.field1260 = new byte[4][105][105];
        Statics.field840 = new int[105][105];
        Statics.field1738 = new int[104];
        Statics.field3295 = new int[104];
        Statics.field2685 = new int[104];
        Statics.field988 = new int[104];
        Statics.field867 = new int[104];
    }

    @ObfuscatedName("al.q(I)V")
    public static void method727() {
        Statics.field995 = (byte[][][]) null;
        Statics.field982 = (byte[][][]) null;
        Statics.field983 = (byte[][][]) null;
        Statics.field4813 = (byte[][][]) null;
        Statics.field1994 = (int[][][]) null;
        Statics.field1260 = (byte[][][]) null;
        Statics.field840 = (int[][]) null;
        Statics.field1738 = null;
        Statics.field3295 = null;
        Statics.field2685 = null;
        Statics.field988 = null;
        Statics.field867 = null;
    }

    @ObfuscatedName("kp.l(IIIIB)V")
    public static final void method4949(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1260[0][var5][var4] = 127;
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

    @ObfuscatedName("jm.k([BIIII[Lgh;I)V")
    public static final void method4587(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class192[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2230[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class440 var9 = new class440(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1787(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("dm.a([BIIIIIII[Lgh;I)V")
    public static final void method2640(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class192[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2230[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class440 var11 = new class440(arg0);
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
                        method1787(var11, arg1, arg2 + var22, arg3 + class291.method2984(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1787(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.m(IIIB)V")
    public static final void method1566(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field985[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field985[arg0][arg1][arg2 + var5] = field985[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field985[arg0][arg1 + var6][arg2] = field985[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field985[arg0][arg1 - 1][arg2] != 0) {
            field985[arg0][arg1][arg2] = field985[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field985[arg0][arg1][arg2 - 1] != 0) {
            field985[arg0][arg1][arg2] = field985[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field985[arg0][arg1 - 1][arg2 - 1] != 0) {
            field985[arg0][arg1][arg2] = field985[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("bt.p(Lpx;IIIIIIB)V")
    public static final void method1787(class440 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method7071();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method7071();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method7071();
                }
            }
            return;
        }
        field993[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method7071();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field985[0][arg2][arg3] = -method5364(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field985[arg1][arg2][arg3] = field985[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method7071();
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
                Statics.field982[arg1][arg2][arg3] = arg0.method7034();
                Statics.field983[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field4813[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field993[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field995[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ej.s([BIIB)Z")
    public static final boolean method2661(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class440 var4 = new class440(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method6909();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method7134();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method7071() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class188 var16 = class188.method1989(var5);
                        if (var13 != 22 || !client.field514 || var16.field2099 != 0 || var16.field2097 == 1 || var16.field2118) {
                            if (!var16.method3270()) {
                                client.field571++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method7134();
                if (var9 == 0) {
                    break;
                }
                var4.method7071();
            }
        }
    }

    @ObfuscatedName("hq.r([BIILgm;[Lgh;I)V")
    public static final void method4065(byte[] arg0, int arg1, int arg2, class205 arg3, class192[] arg4) {
        class440 var5 = new class440(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method6909();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method7134();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method7071();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field993[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class192 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method255(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bn.v([BIIIIIIILgm;[Lgh;)V")
    public static final void method1928(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class205 arg8, class192[] arg9) {
        class440 var10 = new class440(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method6909();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method7134();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method7071();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class188 var21 = class188.method1989(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2095;
                    int var27 = var21.field2096;
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
                    int var32 = arg3 + class291.method2575(var16 & 0x7, var15 & 0x7, arg7, var21.field2095, var21.field2096, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field993[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class192 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method255(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.y(IIIIIILgm;Lgh;B)V")
    public static final void method255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class205 arg6, class192 arg7) {
        if (client.field514 && (field993[0][arg1][arg2] & 0x2) == 0 && (field993[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field984) {
            field984 = arg0;
        }
        class188 var8 = class188.method1989(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2096;
            var10 = var8.field2095;
        } else {
            var9 = var8.field2095;
            var10 = var8.field2096;
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
        long var19 = class213.method3193(arg1, arg2, 2, var8.field2099 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2101 == 1) {
            var21 += 256;
        }
        if (var8.method3322()) {
            class63 var22 = new class63();
            var22.field806 = arg0;
            var22.field807 = arg1 * 128;
            var22.field808 = arg2 * 128;
            int var23 = var8.field2095;
            int var24 = var8.field2096;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field2096;
                var24 = var8.field2095;
            }
            var22.field817 = (arg1 + var23) * 128;
            var22.field810 = (arg2 + var24) * 128;
            var22.field812 = var8.field2124;
            var22.field818 = var8.field2125 * 128;
            var22.field814 = var8.field2126;
            var22.field809 = var8.field2105;
            var22.field816 = var8.field2128;
            if (var8.field2092 != null) {
                var22.field819 = var8;
                var22.method1633();
            }
            class63.field815.method5413(var22);
            if (var22.field816 != null) {
                var22.field811 = var22.field814 + (int) (Math.random() * (double) (var22.field809 - var22.field814));
            }
        }
        if (arg5 == 22) {
            if (!client.field514 || var8.field2099 != 0 || var8.field2097 == 1 || var8.field2118) {
                class206 var25;
                if (var8.field2103 == -1 && var8.field2092 == null) {
                    var25 = var8.method3271(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class73(arg3, 22, arg4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
                }
                arg6.method3729(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field2097 == 1 && arg7 != null) {
                    arg7.method3459(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class206 var51;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var51 = var8.method3271(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class73(arg3, 10, arg4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            if (var51 != null && arg6.method3873(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2111) {
                int var52 = 15;
                if (var51 instanceof class212) {
                    var52 = ((class212) var51).method3968() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field1260[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field1260[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field2097 != 0 && arg7 != null) {
                arg7.method3457(arg1, arg2, var9, var10, var8.field2098);
            }
        } else if (arg5 >= 12) {
            class206 var26;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var26 = var8.method3271(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3873(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1994[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2097 != 0 && arg7 != null) {
                arg7.method3457(arg1, arg2, var9, var10, var8.field2098);
            }
        } else if (arg5 == 0) {
            class206 var27;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var27 = var8.method3271(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class73(arg3, 0, arg4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3731(arg0, arg1, arg2, var16, var27, (class206) null, field989[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2111) {
                    Statics.field1260[arg0][arg1][arg2] = 50;
                    Statics.field1260[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2102) {
                    Statics.field1994[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2111) {
                    Statics.field1260[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1260[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2102) {
                    Statics.field1994[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2111) {
                    Statics.field1260[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1260[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2102) {
                    Statics.field1994[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2111) {
                    Statics.field1260[arg0][arg1][arg2] = 50;
                    Statics.field1260[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2102) {
                    Statics.field1994[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2097 != 0 && arg7 != null) {
                arg7.method3454(arg1, arg2, arg5, arg4, var8.field2098);
            }
            if (var8.field2104 != 16) {
                arg6.method3877(arg0, arg1, arg2, var8.field2104);
            }
        } else if (arg5 == 1) {
            class206 var28;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var28 = var8.method3271(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class73(arg3, 1, arg4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3731(arg0, arg1, arg2, var16, var28, (class206) null, field990[arg4], 0, var19, var21);
            if (var8.field2111) {
                if (arg4 == 0) {
                    Statics.field1260[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1260[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1260[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1260[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2097 != 0 && arg7 != null) {
                arg7.method3454(arg1, arg2, arg5, arg4, var8.field2098);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class206 var30;
            class206 var31;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var30 = var8.method3271(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method3271(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class73(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
                var31 = new class73(arg3, 2, var29, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3731(arg0, arg1, arg2, var16, var30, var31, field989[arg4], field989[var29], var19, var21);
            if (var8.field2102) {
                if (arg4 == 0) {
                    Statics.field1994[arg0][arg1][arg2] |= 0x249;
                    Statics.field1994[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1994[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1994[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1994[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1994[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1994[arg0][arg1][arg2] |= 0x492;
                    Statics.field1994[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2097 != 0 && arg7 != null) {
                arg7.method3454(arg1, arg2, arg5, arg4, var8.field2098);
            }
            if (var8.field2104 != 16) {
                arg6.method3877(arg0, arg1, arg2, var8.field2104);
            }
        } else if (arg5 == 3) {
            class206 var32;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var32 = var8.method3271(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class73(arg3, 3, arg4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3731(arg0, arg1, arg2, var16, var32, (class206) null, field990[arg4], 0, var19, var21);
            if (var8.field2111) {
                if (arg4 == 0) {
                    Statics.field1260[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1260[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1260[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1260[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2097 != 0 && arg7 != null) {
                arg7.method3454(arg1, arg2, arg5, arg4, var8.field2098);
            }
        } else if (arg5 == 9) {
            class206 var33;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var33 = var8.method3271(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3873(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field2097 != 0 && arg7 != null) {
                arg7.method3457(arg1, arg2, var9, var10, var8.field2098);
            }
            if (var8.field2104 != 16) {
                arg6.method3877(arg0, arg1, arg2, var8.field2104);
            }
        } else if (arg5 == 4) {
            class206 var34;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var34 = var8.method3271(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3807(arg0, arg1, arg2, var16, var34, (class206) null, field989[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method3752(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class188.method1989(class213.method2942(var36)).field2104;
            }
            class206 var38;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var38 = var8.method3271(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3807(arg0, arg1, arg2, var16, var38, (class206) null, field989[arg4], 0, field991[arg4] * var35, field992[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method3752(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class188.method1989(class213.method2942(var40)).field2104 / 2;
            }
            class206 var42;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var42 = var8.method3271(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3807(arg0, arg1, arg2, var16, var42, (class206) null, 256, arg4, field996[arg4] * var39, field994[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class206 var44;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var44 = var8.method3271(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class73(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3807(arg0, arg1, arg2, var16, var44, (class206) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method3752(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class188.method1989(class213.method2942(var46)).field2104 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class206 var49;
            class206 var50;
            if (var8.field2103 == -1 && var8.field2092 == null) {
                var49 = var8.method3271(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method3271(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
                var50 = new class73(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field2103, var8.field2114, (class206) null);
            }
            arg6.method3807(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field996[arg4] * var45, field994[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("ju.c(Lgm;[Lgh;B)V")
    public static final void method4607(class205 arg0, class192[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field993[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field993[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3458(var3, var4);
                        }
                    }
                }
            }
        }
        field1000 += (int) (Math.random() * 5.0D) - 2;
        if (field1000 < -8) {
            field1000 = -8;
        }
        if (field1000 > 8) {
            field1000 = 8;
        }
        field987 += (int) (Math.random() * 5.0D) - 2;
        if (field987 < -16) {
            field987 = -16;
        }
        if (field987 > 16) {
            field987 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1260[var6];
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
                    Statics.field840[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field1738[var25] = 0;
                Statics.field3295[var25] = 0;
                Statics.field2685[var25] = 0;
                Statics.field988[var25] = 0;
                Statics.field867[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = Statics.field995[var6][var28][var27] & 0xFF;
                        if (var29 > 0) {
                            class182 var30 = class182.method2908(var29 - 1);
                            Statics.field1738[var27] += var30.field2022;
                            Statics.field3295[var27] += var30.field2021;
                            Statics.field2685[var27] += var30.field2024;
                            Statics.field988[var27] += var30.field2019;
                            var10002 = Statics.field867[var27]++;
                        }
                    }
                    int var31 = var26 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field995[var6][var31][var27] & 0xFF;
                        if (var32 > 0) {
                            class182 var33 = class182.method2908(var32 - 1);
                            Statics.field1738[var27] -= var33.field2022;
                            Statics.field3295[var27] -= var33.field2021;
                            Statics.field2685[var27] -= var33.field2024;
                            Statics.field988[var27] -= var33.field2019;
                            var10002 = Statics.field867[var27]--;
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
                            var34 += Statics.field1738[var40];
                            var35 += Statics.field3295[var40];
                            var36 += Statics.field2685[var40];
                            var37 += Statics.field988[var40];
                            var38 += Statics.field867[var40];
                        }
                        int var41 = var39 - 5;
                        if (var41 >= 0 && var41 < 104) {
                            var34 -= Statics.field1738[var41];
                            var35 -= Statics.field3295[var41];
                            var36 -= Statics.field2685[var41];
                            var37 -= Statics.field988[var41];
                            var38 -= Statics.field867[var41];
                        }
                        if (var39 >= 1 && var39 < 103 && (!client.field514 || (field993[0][var26][var39] & 0x2) != 0 || (field993[var6][var26][var39] & 0x10) == 0)) {
                            if (var6 < field984) {
                                field984 = var6;
                            }
                            int var42 = Statics.field995[var6][var26][var39] & 0xFF;
                            int var43 = Statics.field982[var6][var26][var39] & 0xFF;
                            if (var42 > 0 || var43 > 0) {
                                int var44 = field985[var6][var26][var39];
                                int var45 = field985[var6][var26 + 1][var39];
                                int var46 = field985[var6][var26 + 1][var39 + 1];
                                int var47 = field985[var6][var26][var39 + 1];
                                int var48 = Statics.field840[var26][var39];
                                int var49 = Statics.field840[var26 + 1][var39];
                                int var50 = Statics.field840[var26 + 1][var39 + 1];
                                int var51 = Statics.field840[var26][var39 + 1];
                                int var52 = -1;
                                int var53 = -1;
                                if (var42 > 0) {
                                    int var54 = var34 * 256 / var37;
                                    int var55 = var35 / var38;
                                    int var56 = var36 / var38;
                                    var52 = method1939(var54, var55, var56);
                                    int var57 = field1000 + var54 & 0xFF;
                                    int var58 = field987 + var56;
                                    if (var58 < 0) {
                                        var58 = 0;
                                    } else if (var58 > 255) {
                                        var58 = 255;
                                    }
                                    var53 = method1939(var57, var55, var58);
                                }
                                if (var6 > 0) {
                                    boolean var59 = true;
                                    if (var42 == 0 && Statics.field983[var6][var26][var39] != 0) {
                                        var59 = false;
                                    }
                                    if (var43 > 0 && !class190.method1029(var43 - 1).field2199) {
                                        var59 = false;
                                    }
                                    if (var59 && var44 == var45 && var44 == var46 && var44 == var47) {
                                        Statics.field1994[var6][var26][var39] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var53 != -1) {
                                    var60 = class202.field2398[method333(var53, 96)];
                                }
                                if (var43 == 0) {
                                    arg0.method3728(var6, var26, var39, 0, 0, -1, var44, var45, var46, var47, method333(var52, var48), method333(var52, var49), method333(var52, var50), method333(var52, var51), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field983[var6][var26][var39] + 1;
                                    byte var62 = Statics.field4813[var6][var26][var39];
                                    class190 var63 = class190.method1029(var43 - 1);
                                    int var64 = var63.field2193;
                                    int var65;
                                    int var66;
                                    if (var64 >= 0) {
                                        var65 = Statics.field2382.method3919(var64);
                                        var66 = -1;
                                    } else if (var63.field2192 == 16711935) {
                                        var66 = -2;
                                        var64 = -1;
                                        var65 = -2;
                                    } else {
                                        var66 = method1939(var63.field2196, var63.field2197, var63.field2198);
                                        int var67 = field1000 + var63.field2196 & 0xFF;
                                        int var68 = field987 + var63.field2198;
                                        if (var68 < 0) {
                                            var68 = 0;
                                        } else if (var68 > 255) {
                                            var68 = 255;
                                        }
                                        var65 = method1939(var67, var63.field2197, var68);
                                    }
                                    int var69 = 0;
                                    if (var65 != -2) {
                                        var69 = class202.field2398[method3210(var65, 96)];
                                    }
                                    if (var63.field2195 != -1) {
                                        int var70 = field1000 + var63.field2191 & 0xFF;
                                        int var71 = field987 + var63.field2201;
                                        if (var71 < 0) {
                                            var71 = 0;
                                        } else if (var71 > 255) {
                                            var71 = 255;
                                        }
                                        int var72 = method1939(var70, var63.field2200, var71);
                                        var69 = class202.field2398[method3210(var72, 96)];
                                    }
                                    arg0.method3728(var6, var26, var39, var61, var62, var64, var44, var45, var46, var47, method333(var52, var48), method333(var52, var49), method333(var52, var50), method333(var52, var51), method3210(var66, var48), method3210(var66, var49), method3210(var66, var50), method3210(var66, var51), var60, var69);
                                }
                            }
                        }
                    }
                }
            }
            for (int var73 = 1; var73 < 103; var73++) {
                for (int var74 = 1; var74 < 103; var74++) {
                    arg0.method3739(var6, var74, var73, method3194(var6, var74, var73));
                }
            }
            Statics.field995[var6] = (byte[][]) null;
            Statics.field982[var6] = (byte[][]) null;
            Statics.field983[var6] = (byte[][]) null;
            Statics.field4813[var6] = (byte[][]) null;
            Statics.field1260[var6] = (byte[][]) null;
        }
        arg0.method3754(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field993[1][var75][var76] & 0x2) == 2) {
                    arg0.method3884(var75, var76);
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
                        if ((Statics.field1994[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field1994[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field1994[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label337: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field1994[var86 - 1][var83][var88] & var77) == 0) {
                                        break label337;
                                    }
                                }
                                var86--;
                            }
                            label326: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field1994[var87 + 1][var83][var89] & var77) == 0) {
                                        break label326;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field985[var87][var83][var84] - var91;
                                int var93 = field985[var86][var83][var84];
                                class205.method3726(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field1994[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1994[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field1994[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field1994[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label390: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field1994[var98 - 1][var100][var82] & var78) == 0) {
                                        break label390;
                                    }
                                }
                                var98--;
                            }
                            label379: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field1994[var99 + 1][var101][var82] & var78) == 0) {
                                        break label379;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field985[var99][var96][var82] - var103;
                                int var105 = field985[var98][var96][var82];
                                class205.method3726(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field1994[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1994[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field1994[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field1994[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label443: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field1994[var81][var108 - 1][var112] & var79) == 0) {
                                        break label443;
                                    }
                                }
                                var108--;
                            }
                            label432: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field1994[var81][var109 + 1][var113] & var79) == 0) {
                                        break label432;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field985[var81][var108][var110];
                                class205.method3726(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field1994[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ge.w(IIIB)I")
    public static int method3194(int arg0, int arg1, int arg2) {
        if ((field993[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field993[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("lt.b(III)I")
    public static final int method5364(int arg0, int arg1) {
        int var2 = method1965(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1965(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1965(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ck.t(IIIB)I")
    public static final int method1965(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1963(var3, var5);
        int var8 = method1963(var3 + 1, var5);
        int var9 = method1963(var3, var5 + 1);
        int var10 = method1963(var3 + 1, var5 + 1);
        int var11 = 65536 - class202.field2377[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class202.field2377[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class202.field2377[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ck.g(IIS)I")
    public static final int method1963(int arg0, int arg1) {
        int var2 = method5387(arg0 - 1, arg1 - 1) + method5387(arg0 + 1, arg1 - 1) + method5387(arg0 - 1, arg1 + 1) + method5387(arg0 + 1, arg1 + 1);
        int var3 = method5387(arg0 - 1, arg1) + method5387(arg0 + 1, arg1) + method5387(arg0, arg1 - 1) + method5387(arg0, arg1 + 1);
        int var4 = method5387(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ls.x(III)I")
    public static final int method5387(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("i.n(IIB)I")
    public static final int method333(int arg0, int arg1) {
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

    @ObfuscatedName("gv.e(III)I")
    public static final int method3210(int arg0, int arg1) {
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

    @ObfuscatedName("bp.h(IIII)I")
    public static final int method1939(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("po.f(IIIIIIILgm;Lgh;I)V")
    public static final void method6640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class205 arg7, class192 arg8) {
        class188 var9 = class188.method1989(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2096;
            var11 = var9.field2095;
        } else {
            var10 = var9.field2095;
            var11 = var9.field2096;
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
        long var20 = class213.method3193(arg2, arg3, 2, var9.field2099 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field2101 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class206 var23;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var23 = var9.method3272(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class73(arg4, 22, arg5, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3729(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field2097 == 1) {
                arg8.method3459(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class206 var49;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var49 = var9.method3272(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class73(arg4, 10, arg5, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            if (var49 != null) {
                arg7.method3873(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field2097 != 0) {
                arg8.method3457(arg2, arg3, var10, var11, var9.field2098);
            }
        } else if (arg6 >= 12) {
            class206 var24;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var24 = var9.method3272(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3873(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field2097 != 0) {
                arg8.method3457(arg2, arg3, var10, var11, var9.field2098);
            }
        } else if (arg6 == 0) {
            class206 var25;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var25 = var9.method3272(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class73(arg4, 0, arg5, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3731(arg0, arg2, arg3, var17, var25, (class206) null, field989[arg5], 0, var20, var22);
            if (var9.field2097 != 0) {
                arg8.method3454(arg2, arg3, arg6, arg5, var9.field2098);
            }
        } else if (arg6 == 1) {
            class206 var26;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var26 = var9.method3272(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class73(arg4, 1, arg5, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3731(arg0, arg2, arg3, var17, var26, (class206) null, field990[arg5], 0, var20, var22);
            if (var9.field2097 != 0) {
                arg8.method3454(arg2, arg3, arg6, arg5, var9.field2098);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class206 var28;
            class206 var29;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var28 = var9.method3272(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method3272(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class73(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
                var29 = new class73(arg4, 2, var27, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3731(arg0, arg2, arg3, var17, var28, var29, field989[arg5], field989[var27], var20, var22);
            if (var9.field2097 != 0) {
                arg8.method3454(arg2, arg3, arg6, arg5, var9.field2098);
            }
        } else if (arg6 == 3) {
            class206 var30;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var30 = var9.method3272(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class73(arg4, 3, arg5, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3731(arg0, arg2, arg3, var17, var30, (class206) null, field990[arg5], 0, var20, var22);
            if (var9.field2097 != 0) {
                arg8.method3454(arg2, arg3, arg6, arg5, var9.field2098);
            }
        } else if (arg6 == 9) {
            class206 var31;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var31 = var9.method3272(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3873(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field2097 != 0) {
                arg8.method3457(arg2, arg3, var10, var11, var9.field2098);
            }
        } else if (arg6 == 4) {
            class206 var32;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var32 = var9.method3272(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3807(arg0, arg2, arg3, var17, var32, (class206) null, field989[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method3752(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class188.method1989(class213.method2942(var34)).field2104;
            }
            class206 var36;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var36 = var9.method3272(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3807(arg0, arg2, arg3, var17, var36, (class206) null, field989[arg5], 0, field991[arg5] * var33, field992[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method3752(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class188.method1989(class213.method2942(var38)).field2104 / 2;
            }
            class206 var40;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var40 = var9.method3272(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3807(arg0, arg2, arg3, var17, var40, (class206) null, 256, arg5, field996[arg5] * var37, field994[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class206 var42;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var42 = var9.method3272(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class73(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3807(arg0, arg2, arg3, var17, var42, (class206) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method3752(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class188.method1989(class213.method2942(var44)).field2104 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class206 var47;
            class206 var48;
            if (var9.field2103 == -1 && var9.field2092 == null) {
                var47 = var9.method3272(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method3272(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
                var48 = new class73(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field2103, var9.field2114, (class206) null);
            }
            arg7.method3807(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field996[arg5] * var43, field994[arg5] * var43, var20, var22);
        }
    }
}
