package deob;

@ObfuscatedName("cd")
public final class class79 {

    @ObfuscatedName("cd.a")
    public static int[][][] field998 = new int[4][105][105];

    @ObfuscatedName("cd.f")
    public static byte[][][] field993 = new byte[4][104][104];

    @ObfuscatedName("cd.c")
    public static int field1003 = 99;

    @ObfuscatedName("cd.w")
    public static final int[] field1000 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("cd.m")
    public static final int[] field1001 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("cd.q")
    public static final int[] field992 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("cd.i")
    public static final int[] field1004 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("cd.e")
    public static final int[] field994 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("cd.g")
    public static final int[] field1005 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("cd.k")
    public static int field1006 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("cd.v")
    public static int field1007 = (int) (Math.random() * 33.0D) - 16;

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.a(I)V")
    public static void method2034() {
        field1003 = 99;
        Statics.field995 = new short[4][104][104];
        Statics.field1002 = new short[4][104][104];
        Statics.field997 = new byte[4][104][104];
        Statics.field1853 = new byte[4][104][104];
        Statics.field1411 = new int[4][105][105];
        Statics.field180 = new byte[4][105][105];
        Statics.field996 = new int[105][105];
        Statics.field182 = new int[104];
        Statics.field819 = new int[104];
        Statics.field4532 = new int[104];
        Statics.field1592 = new int[104];
        Statics.field4591 = new int[104];
    }

    @ObfuscatedName("be.f(I)V")
    public static void method1920() {
        Statics.field995 = (short[][][]) null;
        Statics.field1002 = (short[][][]) null;
        Statics.field997 = (byte[][][]) null;
        Statics.field1853 = (byte[][][]) null;
        Statics.field1411 = (int[][][]) null;
        Statics.field180 = (byte[][][]) null;
        Statics.field996 = (int[][]) null;
        Statics.field182 = null;
        Statics.field819 = null;
        Statics.field4532 = null;
        Statics.field1592 = null;
        Statics.field4591 = null;
    }

    @ObfuscatedName("ih.c(IIIII)V")
    public static final void method4745(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field180[0][var5][var4] = 127;
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

    @ObfuscatedName("i.x([BIIII[Lgr;I)V")
    public static final void method293(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class201[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2273[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class464 var9 = new class464(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method4493(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("gx.h([BIIIIIII[Lgr;B)V")
    public static final void method3407(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class201[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2273[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class464 var11 = new class464(arg0);
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
                        method4493(var11, arg1, arg2 + var22, arg3 + class297.method3588(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method4493(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ii.y(Lqr;IIIIIII)V")
    public static final void method4493(class464 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = client.field790 < 209 ? arg0.method7735() : arg0.method7716();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method7735();
                    break;
                }
                if (var9 <= 49) {
                    if (client.field790 < 209) {
                        arg0.method7881();
                    } else {
                        arg0.method7798();
                    }
                }
            }
            return;
        }
        field993[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = client.field790 < 209 ? arg0.method7735() : arg0.method7716();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field998[0][arg2][arg3] = -method12(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field998[arg1][arg2][arg3] = field998[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method7735();
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
                Statics.field1002[arg1][arg2][arg3] = client.field790 < 209 ? (short) arg0.method7881() : (short) arg0.method7798();
                Statics.field997[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1853[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field993[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field995[arg1][arg2][arg3] = (short) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("gr.d([BIIB)Z")
    public static final boolean method3696(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class464 var4 = new class464(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method7732();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method7801();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method7735() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class194 var16 = class194.method2141(var5);
                        if (var13 != 22 || !client.field494 || var16.field2101 != 0 || var16.field2099 == 1 || var16.field2097) {
                            if (!var16.method3417()) {
                                client.field560++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method7801();
                if (var9 == 0) {
                    break;
                }
                var4.method7735();
            }
        }
    }

    @ObfuscatedName("ms.n([BIILhf;[Lgr;B)V")
    public static final void method6259(byte[] arg0, int arg1, int arg2, class214 arg3, class201[] arg4) {
        class464 var5 = new class464(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method7732();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method7801();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method7735();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field993[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class201 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method7605(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("cd.r([BIIIIIIILhf;[Lgr;)V")
    public static final void method2081(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class214 arg8, class201[] arg9) {
        class464 var10 = new class464(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method7732();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method7801();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method7735();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class194 var21 = class194.method2141(var11);
                    int var22 = arg2 + class297.method2434(var16 & 0x7, var15 & 0x7, arg7, var21.field2129, var21.field2098, var20);
                    int var23 = arg3 + class297.method4312(var16 & 0x7, var15 & 0x7, arg7, var21.field2129, var21.field2098, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field993[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class201 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method7605(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("qp.l(IIIIIILhf;Lgr;I)V")
    public static final void method7605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class214 arg6, class201 arg7) {
        if (client.field494 && (field993[0][arg1][arg2] & 0x2) == 0 && (field993[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1003) {
            field1003 = arg0;
        }
        class194 var8 = class194.method2141(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2098;
            var10 = var8.field2129;
        } else {
            var9 = var8.field2129;
            var10 = var8.field2098;
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
        long var19 = class222.method3289(arg1, arg2, 2, var8.field2101 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2122 == 1) {
            var21 += 256;
        }
        if (var8.method3408()) {
            class67 var22 = new class67();
            var22.field823 = arg0;
            var22.field824 = arg1 * 128;
            var22.field835 = arg2 * 128;
            int var23 = var8.field2129;
            int var24 = var8.field2098;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field2098;
                var24 = var8.field2129;
            }
            var22.field833 = (arg1 + var23) * 128;
            var22.field827 = (arg2 + var24) * 128;
            var22.field829 = var8.field2126;
            var22.field825 = var8.field2127 * 128;
            var22.field831 = var8.field2115;
            var22.field832 = var8.field2131;
            var22.field826 = var8.field2130;
            if (var8.field2123 != null) {
                var22.field836 = var8;
                var22.method1766();
            }
            class67.field828.method6031(var22);
            if (var22.field826 != null) {
                var22.field822 = var22.field831 + (int) (Math.random() * (double) (var22.field832 - var22.field831));
            }
        }
        if (arg5 == 22) {
            if (!client.field494 || var8.field2101 != 0 || var8.field2099 == 1 || var8.field2097) {
                class215 var25;
                if (var8.field2105 == -1 && var8.field2123 == null) {
                    var25 = var8.method3414(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class77(arg3, 22, arg4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
                }
                arg6.method3930(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field2099 == 1 && arg7 != null) {
                    arg7.method3665(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class215 var51;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var51 = var8.method3414(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class77(arg3, 10, arg4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            if (var51 != null && arg6.method3968(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2113) {
                int var52 = 15;
                if (var51 instanceof class221) {
                    var52 = ((class221) var51).method4160() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field180[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field180[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field2099 != 0 && arg7 != null) {
                arg7.method3663(arg1, arg2, var9, var10, var8.field2100);
            }
        } else if (arg5 >= 12) {
            class215 var26;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var26 = var8.method3414(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class77(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method3968(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1411[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2099 != 0 && arg7 != null) {
                arg7.method3663(arg1, arg2, var9, var10, var8.field2100);
            }
        } else if (arg5 == 0) {
            class215 var27;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var27 = var8.method3414(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class77(arg3, 0, arg4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method4030(arg0, arg1, arg2, var16, var27, (class215) null, field1000[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2113) {
                    Statics.field180[arg0][arg1][arg2] = 50;
                    Statics.field180[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2120) {
                    Statics.field1411[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2113) {
                    Statics.field180[arg0][arg1][arg2 + 1] = 50;
                    Statics.field180[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2120) {
                    Statics.field1411[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2113) {
                    Statics.field180[arg0][arg1 + 1][arg2] = 50;
                    Statics.field180[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2120) {
                    Statics.field1411[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2113) {
                    Statics.field180[arg0][arg1][arg2] = 50;
                    Statics.field180[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2120) {
                    Statics.field1411[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2099 != 0 && arg7 != null) {
                arg7.method3662(arg1, arg2, arg5, arg4, var8.field2100);
            }
            if (var8.field2106 != 16) {
                arg6.method3940(arg0, arg1, arg2, var8.field2106);
            }
        } else if (arg5 == 1) {
            class215 var28;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var28 = var8.method3414(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class77(arg3, 1, arg4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method4030(arg0, arg1, arg2, var16, var28, (class215) null, field1001[arg4], 0, var19, var21);
            if (var8.field2113) {
                if (arg4 == 0) {
                    Statics.field180[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field180[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field180[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field180[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2099 != 0 && arg7 != null) {
                arg7.method3662(arg1, arg2, arg5, arg4, var8.field2100);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class215 var30;
            class215 var31;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var30 = var8.method3414(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method3414(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class77(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
                var31 = new class77(arg3, 2, var29, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method4030(arg0, arg1, arg2, var16, var30, var31, field1000[arg4], field1000[var29], var19, var21);
            if (var8.field2120) {
                if (arg4 == 0) {
                    Statics.field1411[arg0][arg1][arg2] |= 0x249;
                    Statics.field1411[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1411[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1411[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1411[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1411[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1411[arg0][arg1][arg2] |= 0x492;
                    Statics.field1411[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2099 != 0 && arg7 != null) {
                arg7.method3662(arg1, arg2, arg5, arg4, var8.field2100);
            }
            if (var8.field2106 != 16) {
                arg6.method3940(arg0, arg1, arg2, var8.field2106);
            }
        } else if (arg5 == 3) {
            class215 var32;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var32 = var8.method3414(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class77(arg3, 3, arg4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method4030(arg0, arg1, arg2, var16, var32, (class215) null, field1001[arg4], 0, var19, var21);
            if (var8.field2113) {
                if (arg4 == 0) {
                    Statics.field180[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field180[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field180[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field180[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2099 != 0 && arg7 != null) {
                arg7.method3662(arg1, arg2, arg5, arg4, var8.field2100);
            }
        } else if (arg5 == 9) {
            class215 var33;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var33 = var8.method3414(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class77(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method3968(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field2099 != 0 && arg7 != null) {
                arg7.method3663(arg1, arg2, var9, var10, var8.field2100);
            }
            if (var8.field2106 != 16) {
                arg6.method3940(arg0, arg1, arg2, var8.field2106);
            }
        } else if (arg5 == 4) {
            class215 var34;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var34 = var8.method3414(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class77(arg3, 4, arg4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method3943(arg0, arg1, arg2, var16, var34, (class215) null, field1000[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method3987(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class194.method2141(class222.method2431(var36)).field2106;
            }
            class215 var38;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var38 = var8.method3414(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class77(arg3, 4, arg4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method3943(arg0, arg1, arg2, var16, var38, (class215) null, field1000[arg4], 0, field992[arg4] * var35, field1004[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method3987(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class194.method2141(class222.method2431(var40)).field2106 / 2;
            }
            class215 var42;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var42 = var8.method3414(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class77(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method3943(arg0, arg1, arg2, var16, var42, (class215) null, 256, arg4, field994[arg4] * var39, field1005[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class215 var44;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var44 = var8.method3414(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class77(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method3943(arg0, arg1, arg2, var16, var44, (class215) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method3987(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class194.method2141(class222.method2431(var46)).field2106 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class215 var49;
            class215 var50;
            if (var8.field2105 == -1 && var8.field2123 == null) {
                var49 = var8.method3414(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method3414(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class77(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
                var50 = new class77(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field2105, var8.field2128, (class215) null);
            }
            arg6.method3943(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field994[arg4] * var45, field1005[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("ku.s(Lhf;[Lgr;S)V")
    public static final void method5659(class214 arg0, class201[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field993[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field993[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3664(var3, var4);
                        }
                    }
                }
            }
        }
        field1006 += (int) (Math.random() * 5.0D) - 2;
        if (field1006 < -8) {
            field1006 = -8;
        }
        if (field1006 > 8) {
            field1006 = 8;
        }
        field1007 += (int) (Math.random() * 5.0D) - 2;
        if (field1007 < -16) {
            field1007 = -16;
        }
        if (field1007 > 16) {
            field1007 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field180[var6];
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
                    Statics.field996[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field182[var25] = 0;
                Statics.field819[var25] = 0;
                Statics.field4532[var25] = 0;
                Statics.field1592[var25] = 0;
                Statics.field4591[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = client.field790 < 209 ? (int) class282.method2866(8) : (int) class282.method2866(15);
                        int var30 = Statics.field995[var6][var28][var27] & var29;
                        if (var30 > 0) {
                            int var31 = var30 - 1;
                            class188 var32 = (class188) class188.field2027.method4839((long) var31);
                            class188 var33;
                            if (var32 == null) {
                                byte[] var34 = Statics.field2025.method5859(1, var31);
                                class188 var35 = new class188();
                                if (var34 != null) {
                                    var35.method3293(new class464(var34), var31);
                                }
                                var35.method3292();
                                class188.field2027.method4834(var35, (long) var31);
                                var33 = var35;
                            } else {
                                var33 = var32;
                            }
                            Statics.field182[var27] += var33.field2024;
                            Statics.field819[var27] += var33.field2028;
                            Statics.field4532[var27] += var33.field2029;
                            Statics.field1592[var27] += var33.field2030;
                            var10002 = Statics.field4591[var27]++;
                        }
                    }
                    int var37 = var26 - 5;
                    if (var37 >= 0 && var37 < 104) {
                        int var38 = client.field790 < 209 ? (int) class282.method2866(8) : (int) class282.method2866(15);
                        int var39 = Statics.field995[var6][var37][var27] & var38;
                        if (var39 > 0) {
                            int var40 = var39 - 1;
                            class188 var41 = (class188) class188.field2027.method4839((long) var40);
                            class188 var42;
                            if (var41 == null) {
                                byte[] var43 = Statics.field2025.method5859(1, var40);
                                class188 var44 = new class188();
                                if (var43 != null) {
                                    var44.method3293(new class464(var43), var40);
                                }
                                var44.method3292();
                                class188.field2027.method4834(var44, (long) var40);
                                var42 = var44;
                            } else {
                                var42 = var41;
                            }
                            Statics.field182[var27] -= var42.field2024;
                            Statics.field819[var27] -= var42.field2028;
                            Statics.field4532[var27] -= var42.field2029;
                            Statics.field1592[var27] -= var42.field2030;
                            var10002 = Statics.field4591[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var46 = 0;
                    int var47 = 0;
                    int var48 = 0;
                    int var49 = 0;
                    int var50 = 0;
                    for (int var51 = -5; var51 < 109; var51++) {
                        int var52 = var51 + 5;
                        if (var52 >= 0 && var52 < 104) {
                            var46 += Statics.field182[var52];
                            var47 += Statics.field819[var52];
                            var48 += Statics.field4532[var52];
                            var49 += Statics.field1592[var52];
                            var50 += Statics.field4591[var52];
                        }
                        int var53 = var51 - 5;
                        if (var53 >= 0 && var53 < 104) {
                            var46 -= Statics.field182[var53];
                            var47 -= Statics.field819[var53];
                            var48 -= Statics.field4532[var53];
                            var49 -= Statics.field1592[var53];
                            var50 -= Statics.field4591[var53];
                        }
                        if (var51 >= 1 && var51 < 103 && (!client.field494 || (field993[0][var26][var51] & 0x2) != 0 || (field993[var6][var26][var51] & 0x10) == 0)) {
                            if (var6 < field1003) {
                                field1003 = var6;
                            }
                            int var54 = client.field790 < 209 ? (int) class282.method2866(8) : (int) class282.method2866(15);
                            int var55 = Statics.field995[var6][var26][var51] & var54;
                            int var56 = Statics.field1002[var6][var26][var51] & var54;
                            if (var55 > 0 || var56 > 0) {
                                int var57 = field998[var6][var26][var51];
                                int var58 = field998[var6][var26 + 1][var51];
                                int var59 = field998[var6][var26 + 1][var51 + 1];
                                int var60 = field998[var6][var26][var51 + 1];
                                int var61 = Statics.field996[var26][var51];
                                int var62 = Statics.field996[var26 + 1][var51];
                                int var63 = Statics.field996[var26 + 1][var51 + 1];
                                int var64 = Statics.field996[var26][var51 + 1];
                                int var65 = -1;
                                int var66 = -1;
                                if (var55 > 0) {
                                    int var67 = var46 * 256 / var49;
                                    int var68 = var47 / var50;
                                    int var69 = var48 / var50;
                                    var65 = method2670(var67, var68, var69);
                                    int var70 = field1006 + var67 & 0xFF;
                                    int var71 = field1007 + var69;
                                    if (var71 < 0) {
                                        var71 = 0;
                                    } else if (var71 > 255) {
                                        var71 = 255;
                                    }
                                    var66 = method2670(var70, var68, var71);
                                }
                                if (var6 > 0) {
                                    boolean var72 = true;
                                    if (var55 == 0 && Statics.field997[var6][var26][var51] != 0) {
                                        var72 = false;
                                    }
                                    if (var56 > 0) {
                                        int var73 = var56 - 1;
                                        class196 var74 = (class196) class196.field2196.method4839((long) var73);
                                        class196 var75;
                                        if (var74 == null) {
                                            byte[] var76 = Statics.field2201.method5859(4, var73);
                                            class196 var77 = new class196();
                                            if (var76 != null) {
                                                var77.method3539(new class464(var76), var73);
                                            }
                                            var77.method3538();
                                            class196.field2196.method4834(var77, (long) var73);
                                            var75 = var77;
                                        } else {
                                            var75 = var74;
                                        }
                                        if (!var75.field2199) {
                                            var72 = false;
                                        }
                                    }
                                    if (var72 && var57 == var58 && var57 == var59 && var57 == var60) {
                                        Statics.field1411[var6][var26][var51] |= 0x924;
                                    }
                                }
                                int var78 = 0;
                                if (var66 != -1) {
                                    var78 = class211.field2433[method5136(var66, 96)];
                                }
                                if (var56 == 0) {
                                    arg0.method3929(var6, var26, var51, 0, 0, -1, var57, var58, var59, var60, method5136(var65, var61), method5136(var65, var62), method5136(var65, var63), method5136(var65, var64), 0, 0, 0, 0, var78, 0);
                                } else {
                                    int var79 = Statics.field997[var6][var26][var51] + 1;
                                    byte var80 = Statics.field1853[var6][var26][var51];
                                    int var81 = var56 - 1;
                                    class196 var82 = (class196) class196.field2196.method4839((long) var81);
                                    class196 var83;
                                    if (var82 == null) {
                                        byte[] var84 = Statics.field2201.method5859(4, var81);
                                        class196 var85 = new class196();
                                        if (var84 != null) {
                                            var85.method3539(new class464(var84), var81);
                                        }
                                        var85.method3538();
                                        class196.field2196.method4834(var85, (long) var81);
                                        var83 = var85;
                                    } else {
                                        var83 = var82;
                                    }
                                    int var87 = var83.field2198;
                                    int var88;
                                    int var89;
                                    if (var87 >= 0) {
                                        var88 = Statics.field2422.method4125(var87);
                                        var89 = -1;
                                    } else if (var83.field2197 == 16711935) {
                                        var89 = -2;
                                        var87 = -1;
                                        var88 = -2;
                                    } else {
                                        var89 = method2670(var83.field2207, var83.field2195, var83.field2203);
                                        int var90 = field1006 + var83.field2207 & 0xFF;
                                        int var91 = field1007 + var83.field2203;
                                        if (var91 < 0) {
                                            var91 = 0;
                                        } else if (var91 > 255) {
                                            var91 = 255;
                                        }
                                        var88 = method2670(var90, var83.field2195, var91);
                                    }
                                    int var92 = 0;
                                    if (var88 != -2) {
                                        var92 = class211.field2433[method3210(var88, 96)];
                                    }
                                    if (var83.field2200 != -1) {
                                        int var93 = field1006 + var83.field2204 & 0xFF;
                                        int var94 = field1007 + var83.field2206;
                                        if (var94 < 0) {
                                            var94 = 0;
                                        } else if (var94 > 255) {
                                            var94 = 255;
                                        }
                                        int var95 = method2670(var93, var83.field2205, var94);
                                        var92 = class211.field2433[method3210(var95, 96)];
                                    }
                                    arg0.method3929(var6, var26, var51, var79, var80, var87, var57, var58, var59, var60, method5136(var65, var61), method5136(var65, var62), method5136(var65, var63), method5136(var65, var64), method3210(var89, var61), method3210(var89, var62), method3210(var89, var63), method3210(var89, var64), var78, var92);
                                }
                            }
                        }
                    }
                }
            }
            for (int var96 = 1; var96 < 103; var96++) {
                for (int var97 = 1; var97 < 103; var97++) {
                    int var102;
                    if ((field993[var6][var97][var96] & 0x8) != 0) {
                        var102 = 0;
                    } else if (var6 <= 0 || (field993[1][var97][var96] & 0x2) == 0) {
                        var102 = var6;
                    } else {
                        var102 = var6 - 1;
                    }
                    arg0.method3928(var6, var97, var96, var102);
                }
            }
            Statics.field995[var6] = (short[][]) null;
            Statics.field1002[var6] = (short[][]) null;
            Statics.field997[var6] = (byte[][]) null;
            Statics.field1853[var6] = (byte[][]) null;
            Statics.field180[var6] = (byte[][]) null;
        }
        arg0.method3955(-50, -10, -50);
        for (int var103 = 0; var103 < 104; var103++) {
            for (int var104 = 0; var104 < 104; var104++) {
                if ((field993[1][var103][var104] & 0x2) == 2) {
                    arg0.method3926(var103, var104);
                }
            }
        }
        int var105 = 1;
        int var106 = 2;
        int var107 = 4;
        for (int var108 = 0; var108 < 4; var108++) {
            if (var108 > 0) {
                var105 <<= 0x3;
                var106 <<= 0x3;
                var107 <<= 0x3;
            }
            for (int var109 = 0; var109 <= var108; var109++) {
                for (int var110 = 0; var110 <= 104; var110++) {
                    for (int var111 = 0; var111 <= 104; var111++) {
                        if ((Statics.field1411[var109][var111][var110] & var105) != 0) {
                            int var112 = var110;
                            int var113 = var110;
                            int var114 = var109;
                            int var115 = var109;
                            while (var112 > 0 && (Statics.field1411[var109][var111][var112 - 1] & var105) != 0) {
                                var112--;
                            }
                            while (var113 < 104 && (Statics.field1411[var109][var111][var113 + 1] & var105) != 0) {
                                var113++;
                            }
                            label392: while (var114 > 0) {
                                for (int var116 = var112; var116 <= var113; var116++) {
                                    if ((Statics.field1411[var114 - 1][var111][var116] & var105) == 0) {
                                        break label392;
                                    }
                                }
                                var114--;
                            }
                            label381: while (var115 < var108) {
                                for (int var117 = var112; var117 <= var113; var117++) {
                                    if ((Statics.field1411[var115 + 1][var111][var117] & var105) == 0) {
                                        break label381;
                                    }
                                }
                                var115++;
                            }
                            int var118 = (var115 + 1 - var114) * (var113 - var112 + 1);
                            if (var118 >= 8) {
                                short var119 = 240;
                                int var120 = field998[var115][var111][var112] - var119;
                                int var121 = field998[var114][var111][var112];
                                class214.method4012(var108, 1, var111 * 128, var111 * 128, var112 * 128, var113 * 128 + 128, var120, var121);
                                for (int var122 = var114; var122 <= var115; var122++) {
                                    for (int var123 = var112; var123 <= var113; var123++) {
                                        Statics.field1411[var122][var111][var123] &= ~var105;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1411[var109][var111][var110] & var106) != 0) {
                            int var124 = var111;
                            int var125 = var111;
                            int var126 = var109;
                            int var127 = var109;
                            while (var124 > 0 && (Statics.field1411[var109][var124 - 1][var110] & var106) != 0) {
                                var124--;
                            }
                            while (var125 < 104 && (Statics.field1411[var109][var125 + 1][var110] & var106) != 0) {
                                var125++;
                            }
                            label445: while (var126 > 0) {
                                for (int var128 = var124; var128 <= var125; var128++) {
                                    if ((Statics.field1411[var126 - 1][var128][var110] & var106) == 0) {
                                        break label445;
                                    }
                                }
                                var126--;
                            }
                            label434: while (var127 < var108) {
                                for (int var129 = var124; var129 <= var125; var129++) {
                                    if ((Statics.field1411[var127 + 1][var129][var110] & var106) == 0) {
                                        break label434;
                                    }
                                }
                                var127++;
                            }
                            int var130 = (var127 + 1 - var126) * (var125 - var124 + 1);
                            if (var130 >= 8) {
                                short var131 = 240;
                                int var132 = field998[var127][var124][var110] - var131;
                                int var133 = field998[var126][var124][var110];
                                class214.method4012(var108, 2, var124 * 128, var125 * 128 + 128, var110 * 128, var110 * 128, var132, var133);
                                for (int var134 = var126; var134 <= var127; var134++) {
                                    for (int var135 = var124; var135 <= var125; var135++) {
                                        Statics.field1411[var134][var135][var110] &= ~var106;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1411[var109][var111][var110] & var107) != 0) {
                            int var136 = var111;
                            int var137 = var111;
                            int var138 = var110;
                            int var139 = var110;
                            while (var138 > 0 && (Statics.field1411[var109][var111][var138 - 1] & var107) != 0) {
                                var138--;
                            }
                            while (var139 < 104 && (Statics.field1411[var109][var111][var139 + 1] & var107) != 0) {
                                var139++;
                            }
                            label498: while (var136 > 0) {
                                for (int var140 = var138; var140 <= var139; var140++) {
                                    if ((Statics.field1411[var109][var136 - 1][var140] & var107) == 0) {
                                        break label498;
                                    }
                                }
                                var136--;
                            }
                            label487: while (var137 < 104) {
                                for (int var141 = var138; var141 <= var139; var141++) {
                                    if ((Statics.field1411[var109][var137 + 1][var141] & var107) == 0) {
                                        break label487;
                                    }
                                }
                                var137++;
                            }
                            if ((var137 - var136 + 1) * (var139 - var138 + 1) >= 4) {
                                int var142 = field998[var109][var136][var138];
                                class214.method4012(var108, 4, var136 * 128, var137 * 128 + 128, var138 * 128, var139 * 128 + 128, var142, var142);
                                for (int var143 = var136; var143 <= var137; var143++) {
                                    for (int var144 = var138; var144 <= var139; var144++) {
                                        Statics.field1411[var109][var143][var144] &= ~var107;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.p(III)I")
    public static final int method12(int arg0, int arg1) {
        int var2 = method5703(arg0 + 45365, arg1 + 91923, 4) - 128 + (method5703(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method5703(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ls.b(IIIB)I")
    public static final int method5703(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method465(var3, var5);
        int var8 = method465(var3 + 1, var5);
        int var9 = method465(var3, var5 + 1);
        int var10 = method465(var3 + 1, var5 + 1);
        int var11 = 65536 - class211.field2438[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class211.field2438[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class211.field2438[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ad.o(III)I")
    public static final int method465(int arg0, int arg1) {
        int var2 = method4712(arg0 - 1, arg1 - 1) + method4712(arg0 + 1, arg1 - 1) + method4712(arg0 - 1, arg1 + 1) + method4712(arg0 + 1, arg1 + 1);
        int var3 = method4712(arg0 - 1, arg1) + method4712(arg0 + 1, arg1) + method4712(arg0, arg1 - 1) + method4712(arg0, arg1 + 1);
        int var4 = method4712(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ig.u(III)I")
    public static final int method4712(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("kg.z(III)I")
    public static final int method5136(int arg0, int arg1) {
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

    @ObfuscatedName("fb.t(III)I")
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

    @ObfuscatedName("dg.w(IIII)I")
    public static final int method2670(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("au.m(III)Z")
    public static final boolean method836(int arg0, int arg1) {
        class194 var2 = class194.method2141(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3449(arg1);
    }
}
