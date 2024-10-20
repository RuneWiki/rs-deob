package deob;

@ObfuscatedName("bi")
public final class class75 {

    @ObfuscatedName("bi.v")
    public static int[][][] field988 = new int[4][105][105];

    @ObfuscatedName("bi.c")
    public static byte[][][] field985 = new byte[4][104][104];

    @ObfuscatedName("bi.i")
    public static int field986 = 99;

    @ObfuscatedName("bi.g")
    public static final int[] field991 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bi.x")
    public static final int[] field990 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bi.a")
    public static final int[] field993 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bi.y")
    public static final int[] field994 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bi.j")
    public static final int[] field998 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bi.e")
    public static final int[] field996 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bi.z")
    public static int field997 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bi.h")
    public static int field992 = (int) (Math.random() * 33.0D) - 16;

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ll.v(I)V")
    public static void method5419() {
        field986 = 99;
        Statics.field987 = new byte[4][104][104];
        Statics.field69 = new byte[4][104][104];
        Statics.field1648 = new byte[4][104][104];
        Statics.field984 = new byte[4][104][104];
        Statics.field4546 = new int[4][105][105];
        Statics.field4375 = new byte[4][105][105];
        Statics.field999 = new int[105][105];
        Statics.field4277 = new int[104];
        Statics.field1406 = new int[104];
        Statics.field989 = new int[104];
        Statics.field4193 = new int[104];
        Statics.field4214 = new int[104];
    }

    @ObfuscatedName("cy.c(B)V")
    public static void method2250() {
        Statics.field987 = (byte[][][]) null;
        Statics.field69 = (byte[][][]) null;
        Statics.field1648 = (byte[][][]) null;
        Statics.field984 = (byte[][][]) null;
        Statics.field4546 = (int[][][]) null;
        Statics.field4375 = (byte[][][]) null;
        Statics.field999 = (int[][]) null;
        Statics.field4277 = null;
        Statics.field1406 = null;
        Statics.field989 = null;
        Statics.field4193 = null;
        Statics.field4214 = null;
    }

    @ObfuscatedName("pk.i(IIIIB)V")
    public static final void method6896(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field4375[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field988[0][var5][var4] = field988[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field988[0][var5][var4] = field988[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field988[0][var5][var4] = field988[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field988[0][var5][var4] = field988[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.f([BIIII[Lgv;I)V")
    public static final void method10(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class192[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2168[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class438 var9 = new class438(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.method288(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ke.b([BIIIIIII[Lgv;I)V")
    public static final void method5222(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class192[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2168[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class438 var11 = new class438(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class291.method1908(var13 & 0x7, var14 & 0x7, arg7);
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
                        Statics.method288(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        Statics.method288(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.n(IIII)V")
    public static final void method332(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field988[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field988[arg0][arg1][arg2 + var5] = field988[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field988[arg0][arg1 + var6][arg2] = field988[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field988[arg0][arg1 - 1][arg2] != 0) {
            field988[arg0][arg1][arg2] = field988[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field988[arg0][arg1][arg2 - 1] != 0) {
            field988[arg0][arg1][arg2] = field988[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field988[arg0][arg1 - 1][arg2 - 1] != 0) {
            field988[arg0][arg1][arg2] = field988[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ky.q([BIILhv;[Lgv;I)V")
    public static final void method5131(byte[] arg0, int arg1, int arg2, class234 arg3, class192[] arg4) {
        class438 var5 = new class438(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method7040();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method6986();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method6971();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field985[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class192 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method3074(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bi.o([BIIIIIIILhv;[Lgv;)V")
    public static final void method1923(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class234 arg8, class192[] arg9) {
        class438 var10 = new class438(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method7040();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method6986();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method6971();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class188 var21 = class188.method2828(var11);
                    int var22 = arg2 + class291.method3274(var16 & 0x7, var15 & 0x7, arg7, var21.field2031, var21.field2057, var20);
                    int var23 = arg3 + class291.method6475(var16 & 0x7, var15 & 0x7, arg7, var21.field2031, var21.field2057, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field985[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class192 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method3074(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fe.r(IIIIIILhv;Lgv;B)V")
    public static final void method3074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class234 arg6, class192 arg7) {
        if (client.field503 && (field985[0][arg1][arg2] & 0x2) == 0 && (field985[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field986) {
            field986 = arg0;
        }
        class188 var8 = class188.method2828(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2057;
            var10 = var8.field2031;
        } else {
            var9 = var8.field2031;
            var10 = var8.field2057;
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
        int[][] var15 = field988[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class242.method4607(arg1, arg2, 2, var8.field2034 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2055 == 1) {
            var21 += 256;
        }
        if (var8.method3336()) {
            class63.method5995(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field503 || var8.field2034 != 0 || var8.field2016 == 1 || var8.field2053) {
                class235 var22;
                if (var8.field2061 == -1 && var8.field2062 == null) {
                    var22 = var8.method3329(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class73(arg3, 22, arg4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
                }
                arg6.method4260(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2016 == 1 && arg7 != null) {
                    arg7.method3514(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class235 var48;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var48 = var8.method3329(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class73(arg3, 10, arg4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            if (var48 != null && arg6.method4404(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2046) {
                int var49 = 15;
                if (var48 instanceof class241) {
                    var49 = ((class241) var48).method4528() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field4375[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field4375[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2016 != 0 && arg7 != null) {
                arg7.method3512(arg1, arg2, var9, var10, var8.field2028);
            }
        } else if (arg5 >= 12) {
            class235 var23;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var23 = var8.method3329(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4404(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field4546[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2016 != 0 && arg7 != null) {
                arg7.method3512(arg1, arg2, var9, var10, var8.field2028);
            }
        } else if (arg5 == 0) {
            class235 var24;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var24 = var8.method3329(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class73(arg3, 0, arg4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4262(arg0, arg1, arg2, var16, var24, (class235) null, field991[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2046) {
                    Statics.field4375[arg0][arg1][arg2] = 50;
                    Statics.field4375[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2037) {
                    Statics.field4546[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2046) {
                    Statics.field4375[arg0][arg1][arg2 + 1] = 50;
                    Statics.field4375[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2037) {
                    Statics.field4546[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2046) {
                    Statics.field4375[arg0][arg1 + 1][arg2] = 50;
                    Statics.field4375[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2037) {
                    Statics.field4546[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2046) {
                    Statics.field4375[arg0][arg1][arg2] = 50;
                    Statics.field4375[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2037) {
                    Statics.field4546[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2016 != 0 && arg7 != null) {
                arg7.method3535(arg1, arg2, arg5, arg4, var8.field2028);
            }
            if (var8.field2039 != 16) {
                arg6.method4270(arg0, arg1, arg2, var8.field2039);
            }
        } else if (arg5 == 1) {
            class235 var25;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var25 = var8.method3329(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class73(arg3, 1, arg4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4262(arg0, arg1, arg2, var16, var25, (class235) null, field990[arg4], 0, var19, var21);
            if (var8.field2046) {
                if (arg4 == 0) {
                    Statics.field4375[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field4375[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field4375[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field4375[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2016 != 0 && arg7 != null) {
                arg7.method3535(arg1, arg2, arg5, arg4, var8.field2028);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class235 var27;
            class235 var28;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var27 = var8.method3329(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3329(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class73(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
                var28 = new class73(arg3, 2, var26, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4262(arg0, arg1, arg2, var16, var27, var28, field991[arg4], field991[var26], var19, var21);
            if (var8.field2037) {
                if (arg4 == 0) {
                    Statics.field4546[arg0][arg1][arg2] |= 0x249;
                    Statics.field4546[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field4546[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field4546[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field4546[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field4546[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field4546[arg0][arg1][arg2] |= 0x492;
                    Statics.field4546[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2016 != 0 && arg7 != null) {
                arg7.method3535(arg1, arg2, arg5, arg4, var8.field2028);
            }
            if (var8.field2039 != 16) {
                arg6.method4270(arg0, arg1, arg2, var8.field2039);
            }
        } else if (arg5 == 3) {
            class235 var29;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var29 = var8.method3329(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class73(arg3, 3, arg4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4262(arg0, arg1, arg2, var16, var29, (class235) null, field990[arg4], 0, var19, var21);
            if (var8.field2046) {
                if (arg4 == 0) {
                    Statics.field4375[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field4375[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field4375[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field4375[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2016 != 0 && arg7 != null) {
                arg7.method3535(arg1, arg2, arg5, arg4, var8.field2028);
            }
        } else if (arg5 == 9) {
            class235 var30;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var30 = var8.method3329(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4404(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2016 != 0 && arg7 != null) {
                arg7.method3512(arg1, arg2, var9, var10, var8.field2028);
            }
            if (var8.field2039 != 16) {
                arg6.method4270(arg0, arg1, arg2, var8.field2039);
            }
        } else if (arg5 == 4) {
            class235 var31;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var31 = var8.method3329(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4392(arg0, arg1, arg2, var16, var31, (class235) null, field991[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4279(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class188.method2828(class242.method2963(var33)).field2039;
            }
            class235 var35;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var35 = var8.method3329(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4392(arg0, arg1, arg2, var16, var35, (class235) null, field991[arg4], 0, field993[arg4] * var32, field994[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4279(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class188.method2828(class242.method2963(var37)).field2039 / 2;
            }
            class235 var39;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var39 = var8.method3329(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4392(arg0, arg1, arg2, var16, var39, (class235) null, 256, arg4, field998[arg4] * var36, field996[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class235 var41;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var41 = var8.method3329(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class73(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4392(arg0, arg1, arg2, var16, var41, (class235) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4279(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class188.method2828(class242.method2963(var43)).field2039 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class235 var46;
            class235 var47;
            if (var8.field2061 == -1 && var8.field2062 == null) {
                var46 = var8.method3329(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3329(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
                var47 = new class73(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2061, var8.field2064, (class235) null);
            }
            arg6.method4392(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field998[arg4] * var42, field996[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("nc.p(Lhv;[Lgv;I)V")
    public static final void method6278(class234 arg0, class192[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field985[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field985[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3513(var3, var4);
                        }
                    }
                }
            }
        }
        field997 += (int) (Math.random() * 5.0D) - 2;
        if (field997 < -8) {
            field997 = -8;
        }
        if (field997 > 8) {
            field997 = 8;
        }
        field992 += (int) (Math.random() * 5.0D) - 2;
        if (field992 < -16) {
            field992 = -16;
        }
        if (field992 > 16) {
            field992 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field4375[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field988[var6][var11 + 1][var10] - field988[var6][var11 - 1][var10];
                    int var13 = field988[var6][var11][var10 + 1] - field988[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field999[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field4277[var20] = 0;
                Statics.field1406[var20] = 0;
                Statics.field989[var20] = 0;
                Statics.field4193[var20] = 0;
                Statics.field4214[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field987[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class182 var25 = class182.method2672(var24 - 1);
                            Statics.field4277[var22] += var25.field1958;
                            Statics.field1406[var22] += var25.field1956;
                            Statics.field989[var22] += var25.field1955;
                            Statics.field4193[var22] += var25.field1961;
                            var10002 = Statics.field4214[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field987[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class182 var28 = class182.method2672(var27 - 1);
                            Statics.field4277[var22] -= var28.field1958;
                            Statics.field1406[var22] -= var28.field1956;
                            Statics.field989[var22] -= var28.field1955;
                            Statics.field4193[var22] -= var28.field1961;
                            var10002 = Statics.field4214[var22]--;
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
                            var29 += Statics.field4277[var35];
                            var30 += Statics.field1406[var35];
                            var31 += Statics.field989[var35];
                            var32 += Statics.field4193[var35];
                            var33 += Statics.field4214[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field4277[var36];
                            var30 -= Statics.field1406[var36];
                            var31 -= Statics.field989[var36];
                            var32 -= Statics.field4193[var36];
                            var33 -= Statics.field4214[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field503 || (field985[0][var21][var34] & 0x2) != 0 || (field985[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field986) {
                                field986 = var6;
                            }
                            int var37 = Statics.field987[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field69[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field988[var6][var21][var34];
                                int var40 = field988[var6][var21 + 1][var34];
                                int var41 = field988[var6][var21 + 1][var34 + 1];
                                int var42 = field988[var6][var21][var34 + 1];
                                int var43 = Statics.field999[var21][var34];
                                int var44 = Statics.field999[var21 + 1][var34];
                                int var45 = Statics.field999[var21 + 1][var34 + 1];
                                int var46 = Statics.field999[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method3000(var49, var50, var51);
                                    int var52 = field997 + var49 & 0xFF;
                                    int var53 = field992 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method3000(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field1648[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class190.method3018(var38 - 1).field2128) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field4546[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class231.field2571[method746(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method4259(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method746(var47, var43), method746(var47, var44), method746(var47, var45), method746(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field1648[var6][var21][var34] + 1;
                                    byte var57 = Statics.field984[var6][var21][var34];
                                    class190 var58 = class190.method3018(var38 - 1);
                                    int var59 = var58.field2127;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field2573.method4477(var59);
                                        var61 = -1;
                                    } else if (var58.field2125 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method3000(var58.field2124, var58.field2130, var58.field2132);
                                        int var62 = field997 + var58.field2124 & 0xFF;
                                        int var63 = field992 + var58.field2132;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method3000(var62, var58.field2130, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class231.field2571[Statics.method2803(var60, 96)];
                                    }
                                    if (var58.field2129 != -1) {
                                        int var65 = field997 + var58.field2126 & 0xFF;
                                        int var66 = field992 + var58.field2135;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method3000(var65, var58.field2131, var66);
                                        var64 = class231.field2571[Statics.method2803(var67, 96)];
                                    }
                                    arg0.method4259(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method746(var47, var43), method746(var47, var44), method746(var47, var45), method746(var47, var46), Statics.method2803(var61, var43), Statics.method2803(var61, var44), Statics.method2803(var61, var45), Statics.method2803(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field985[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field985[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method4380(var6, var69, var68, var74);
                }
            }
            Statics.field987[var6] = (byte[][]) null;
            Statics.field69[var6] = (byte[][]) null;
            Statics.field1648[var6] = (byte[][]) null;
            Statics.field984[var6] = (byte[][]) null;
            Statics.field4375[var6] = (byte[][]) null;
        }
        arg0.method4284(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field985[1][var75][var76] & 0x2) == 2) {
                    arg0.method4395(var75, var76);
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
                        if ((Statics.field4546[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field4546[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field4546[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field4546[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field4546[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field988[var87][var83][var84] - var91;
                                int var93 = field988[var86][var83][var84];
                                class234.method4334(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field4546[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field4546[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field4546[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field4546[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field4546[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field4546[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field988[var99][var96][var82] - var103;
                                int var105 = field988[var98][var96][var82];
                                class234.method4334(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field4546[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field4546[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field4546[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field4546[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field4546[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field4546[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field988[var81][var108][var110];
                                class234.method4334(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field4546[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("de.w(IIIB)I")
    public static final int method2493(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method5049(var3, var5);
        int var8 = method5049(var3 + 1, var5);
        int var9 = method5049(var3, var5 + 1);
        int var10 = method5049(var3 + 1, var5 + 1);
        int var11 = 65536 - class231.field2551[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class231.field2551[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class231.field2551[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("kk.k(IIB)I")
    public static final int method5049(int arg0, int arg1) {
        int var2 = method112(arg0 - 1, arg1 - 1) + method112(arg0 + 1, arg1 - 1) + method112(arg0 - 1, arg1 + 1) + method112(arg0 + 1, arg1 + 1);
        int var3 = method112(arg0 - 1, arg1) + method112(arg0 + 1, arg1) + method112(arg0, arg1 - 1) + method112(arg0, arg1 + 1);
        int var4 = method112(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("w.d(III)I")
    public static final int method112(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ac.m(III)I")
    public static final int method746(int arg0, int arg1) {
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

    @ObfuscatedName("fi.t(IIIB)I")
    public static final int method3000(int arg0, int arg1, int arg2) {
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
