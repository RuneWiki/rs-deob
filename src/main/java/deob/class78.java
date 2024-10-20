package deob;

@ObfuscatedName("bv")
public final class class78 {

    @ObfuscatedName("bv.f")
    public static int[][][] field1015 = new int[4][105][105];

    @ObfuscatedName("bv.w")
    public static byte[][][] field1009 = new byte[4][104][104];

    @ObfuscatedName("bv.v")
    public static int field1010 = 99;

    @ObfuscatedName("bv.u")
    public static final int[] field1016 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bv.x")
    public static final int[] field1017 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bv.a")
    public static final int[] field1018 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bv.q")
    public static final int[] field1008 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bv.d")
    public static final int[] field1020 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bv.e")
    public static final int[] field1021 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bv.g")
    public static int field1022 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bv.y")
    public static int field1023 = (int) (Math.random() * 33.0D) - 16;

    public class78() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gw.f(I)V")
    public static void method3416() {
        field1010 = 99;
        Statics.field1011 = new short[4][104][104];
        Statics.field1866 = new short[4][104][104];
        Statics.field1012 = new byte[4][104][104];
        Statics.field1013 = new byte[4][104][104];
        Statics.field3718 = new int[4][105][105];
        Statics.field1014 = new byte[4][105][105];
        Statics.field3795 = new int[105][105];
        Statics.field1333 = new int[104];
        Statics.field1806 = new int[104];
        Statics.field1025 = new int[104];
        Statics.field4907 = new int[104];
        Statics.field2765 = new int[104];
    }

    @ObfuscatedName("ns.w(B)V")
    public static void method6833() {
        Statics.field1011 = (short[][][]) null;
        Statics.field1866 = (short[][][]) null;
        Statics.field1012 = (byte[][][]) null;
        Statics.field1013 = (byte[][][]) null;
        Statics.field3718 = (int[][][]) null;
        Statics.field1014 = (byte[][][]) null;
        Statics.field3795 = (int[][]) null;
        Statics.field1333 = null;
        Statics.field1806 = null;
        Statics.field1025 = null;
        Statics.field4907 = null;
        Statics.field2765 = null;
    }

    @ObfuscatedName("t.v(IIIII)V")
    public static final void method175(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1014[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1015[0][var5][var4] = field1015[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1015[0][var5][var4] = field1015[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1015[0][var5][var4] = field1015[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1015[0][var5][var4] = field1015[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.s([BIIII[Lgv;I)V")
    public static final void method2852(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class207[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2354[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class474 var9 = new class474(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    method7399(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("ex.z([BIIIIIIIII[Lgv;I)V")
    public static final void method3002(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class207[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2354[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class474 var13 = new class474(arg0);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
                        int var17 = arg2 + class304.method2972(var15 & 0x7, var16 & 0x7, arg7);
                        int var18 = arg3 + class304.method3019(var15 & 0x7, var16 & 0x7, arg7);
                        int var19 = (var15 & 0x7) + arg2 + arg8;
                        int var20 = (var16 & 0x7) + arg3 + arg9;
                        method7399(var13, arg1, var17, var18, var19, var20, arg7);
                    } else {
                        method7399(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ix.j(IIII)V")
    public static final void method4516(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1015[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1015[arg0][arg1][arg2 + var5] = field1015[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1015[arg0][arg1 + var6][arg2] = field1015[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1015[arg0][arg1 - 1][arg2] != 0) {
            field1015[arg0][arg1][arg2] = field1015[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1015[arg0][arg1][arg2 - 1] != 0) {
            field1015[arg0][arg1][arg2] = field1015[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1015[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1015[arg0][arg1][arg2] = field1015[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("pf.i(Lrd;IIIIIII)V")
    public static final void method7399(class474 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class89.method2495(arg1, arg2, arg3)) {
            while (true) {
                int var16 = client.field506 < 209 ? arg0.method7964() : arg0.method8032();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method7964();
                    break;
                }
                if (var16 <= 49) {
                    if (client.field506 < 209) {
                        arg0.method7965();
                    } else {
                        arg0.method7967();
                    }
                }
            }
            return;
        }
        field1009[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = client.field506 < 209 ? arg0.method7964() : arg0.method8032();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field1015[0][arg2];
                    int var10 = arg4 + 932731;
                    int var11 = arg5 + 556238;
                    int var12 = method12(var10 + 45365, var11 + 91923, 4) - 128 + (method12(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method12(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field1015[arg1][arg2][arg3] = field1015[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method7964();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field1015[0][arg2][arg3] = -var15 * 8;
                } else {
                    field1015[arg1][arg2][arg3] = field1015[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1866[arg1][arg2][arg3] = client.field506 < 209 ? (short) arg0.method7965() : (short) arg0.method7967();
                Statics.field1012[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1013[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field1009[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1011[arg1][arg2][arg3] = (short) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ld.n([BIII)Z")
    public static final boolean method5969(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class474 var4 = new class474(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8129();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8059();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method7964() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class200 var16 = class200.method7839(var5);
                        if (var13 != 22 || !client.field501 || var16.field2173 != 0 || var16.field2204 == 1 || var16.field2192) {
                            if (!var16.method3624()) {
                                client.field568++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8059();
                if (var9 == 0) {
                    break;
                }
                var4.method7964();
            }
        }
    }

    @ObfuscatedName("ld.l([BIILhn;[Lgv;B)V")
    public static final void method5970(byte[] arg0, int arg1, int arg2, class220 arg3, class207[] arg4) {
        class474 var5 = new class474(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method8129();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method8059();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method7964();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1009[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class207 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method7127(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bv.k([BIIIIIIILhn;[Lgv;)V")
    public static final void method2172(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class220 arg8, class207[] arg9) {
        class474 var10 = new class474(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method8129();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method8059();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method7964();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class200 var21 = class200.method7839(var11);
                    int var22 = arg2 + class304.method4779(var16 & 0x7, var15 & 0x7, arg7, var21.field2181, var21.field2182, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field2181;
                    int var28 = var21.field2182;
                    if ((var20 & 0x1) == 1) {
                        int var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var30 = arg7 & 0x3;
                    int var31;
                    if (var30 == 0) {
                        var31 = var25;
                    } else if (var30 == 1) {
                        var31 = 7 - var24 - (var27 - 1);
                    } else if (var30 == 2) {
                        var31 = 7 - var25 - (var28 - 1);
                    } else {
                        var31 = var24;
                    }
                    int var32 = arg3 + var31;
                    if (var22 > 0 && var32 > 0 && var22 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field1009[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class207 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method7127(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ob.c(IIIIIILhn;Lgv;I)V")
    public static final void method7127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class220 arg6, class207 arg7) {
        if (client.field501 && (field1009[0][arg1][arg2] & 0x2) == 0 && (field1009[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1010) {
            field1010 = arg0;
        }
        class200 var8 = class200.method7839(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2182;
            var10 = var8.field2181;
        } else {
            var9 = var8.field2181;
            var10 = var8.field2182;
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
        int[][] var15 = field1015[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class229.method3883(arg1, arg2, 2, var8.field2173 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2194 == 1) {
            var21 += 256;
        }
        if (var8.method3615()) {
            class66 var22 = new class66();
            var22.field843 = arg0;
            var22.field834 = arg1 * 128;
            var22.field835 = arg2 * 128;
            int var23 = var8.field2181;
            int var24 = var8.field2182;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field2182;
                var24 = var8.field2181;
            }
            var22.field836 = (arg1 + var23) * 128;
            var22.field845 = (arg2 + var24) * 128;
            var22.field839 = var8.field2164;
            var22.field838 = var8.field2199 * 128;
            var22.field846 = var8.field2200;
            var22.field842 = var8.field2161;
            var22.field832 = var8.field2202;
            if (var8.field2180 != null) {
                var22.field837 = var8;
                var22.method1822();
            }
            class66.field847.method6236(var22);
            if (var22.field832 != null) {
                var22.field844 = var22.field846 + (int) (Math.random() * (double) (var22.field842 - var22.field846));
            }
        }
        if (arg5 == 22) {
            if (!client.field501 || var8.field2173 != 0 || var8.field2204 == 1 || var8.field2192) {
                class222 var25;
                if (var8.field2177 == -1 && var8.field2180 == null) {
                    var25 = var8.method3608(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class76(arg3, 22, arg4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
                }
                arg6.method4118(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field2204 == 1 && arg7 != null) {
                    arg7.method3848(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class222 var51;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var51 = var8.method3608(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class76(arg3, 10, arg4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            if (var51 != null && arg6.method4122(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2162) {
                int var52 = 15;
                if (var51 instanceof class228) {
                    var52 = ((class228) var51).method4340() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field1014[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field1014[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field2204 != 0 && arg7 != null) {
                arg7.method3846(arg1, arg2, var9, var10, var8.field2172);
            }
        } else if (arg5 >= 12) {
            class222 var26;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var26 = var8.method3608(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class76(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4122(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3718[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2204 != 0 && arg7 != null) {
                arg7.method3846(arg1, arg2, var9, var10, var8.field2172);
            }
        } else if (arg5 == 0) {
            class222 var27;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var27 = var8.method3608(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class76(arg3, 0, arg4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4151(arg0, arg1, arg2, var16, var27, (class222) null, field1016[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2162) {
                    Statics.field1014[arg0][arg1][arg2] = 50;
                    Statics.field1014[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2176) {
                    Statics.field3718[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2162) {
                    Statics.field1014[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1014[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2176) {
                    Statics.field3718[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2162) {
                    Statics.field1014[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1014[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2176) {
                    Statics.field3718[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2162) {
                    Statics.field1014[arg0][arg1][arg2] = 50;
                    Statics.field1014[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2176) {
                    Statics.field3718[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2204 != 0 && arg7 != null) {
                arg7.method3845(arg1, arg2, arg5, arg4, var8.field2172);
            }
            if (var8.field2178 != 16) {
                arg6.method4239(arg0, arg1, arg2, var8.field2178);
            }
        } else if (arg5 == 1) {
            class222 var28;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var28 = var8.method3608(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class76(arg3, 1, arg4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4151(arg0, arg1, arg2, var16, var28, (class222) null, field1017[arg4], 0, var19, var21);
            if (var8.field2162) {
                if (arg4 == 0) {
                    Statics.field1014[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1014[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1014[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1014[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2204 != 0 && arg7 != null) {
                arg7.method3845(arg1, arg2, arg5, arg4, var8.field2172);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class222 var30;
            class222 var31;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var30 = var8.method3608(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method3608(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class76(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
                var31 = new class76(arg3, 2, var29, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4151(arg0, arg1, arg2, var16, var30, var31, field1016[arg4], field1016[var29], var19, var21);
            if (var8.field2176) {
                if (arg4 == 0) {
                    Statics.field3718[arg0][arg1][arg2] |= 0x249;
                    Statics.field3718[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3718[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3718[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3718[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3718[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3718[arg0][arg1][arg2] |= 0x492;
                    Statics.field3718[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2204 != 0 && arg7 != null) {
                arg7.method3845(arg1, arg2, arg5, arg4, var8.field2172);
            }
            if (var8.field2178 != 16) {
                arg6.method4239(arg0, arg1, arg2, var8.field2178);
            }
        } else if (arg5 == 3) {
            class222 var32;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var32 = var8.method3608(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class76(arg3, 3, arg4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4151(arg0, arg1, arg2, var16, var32, (class222) null, field1017[arg4], 0, var19, var21);
            if (var8.field2162) {
                if (arg4 == 0) {
                    Statics.field1014[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1014[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1014[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1014[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2204 != 0 && arg7 != null) {
                arg7.method3845(arg1, arg2, arg5, arg4, var8.field2172);
            }
        } else if (arg5 == 9) {
            class222 var33;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var33 = var8.method3608(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class76(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4122(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field2204 != 0 && arg7 != null) {
                arg7.method3846(arg1, arg2, var9, var10, var8.field2172);
            }
            if (var8.field2178 != 16) {
                arg6.method4239(arg0, arg1, arg2, var8.field2178);
            }
        } else if (arg5 == 4) {
            class222 var34;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var34 = var8.method3608(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class76(arg3, 4, arg4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4121(arg0, arg1, arg2, var16, var34, (class222) null, field1016[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method4138(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class200.method7839(class229.method2897(var36)).field2178;
            }
            class222 var38;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var38 = var8.method3608(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class76(arg3, 4, arg4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4121(arg0, arg1, arg2, var16, var38, (class222) null, field1016[arg4], 0, field1018[arg4] * var35, field1008[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method4138(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class200.method7839(class229.method2897(var40)).field2178 / 2;
            }
            class222 var42;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var42 = var8.method3608(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class76(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4121(arg0, arg1, arg2, var16, var42, (class222) null, 256, arg4, field1020[arg4] * var39, field1021[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class222 var44;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var44 = var8.method3608(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class76(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4121(arg0, arg1, arg2, var16, var44, (class222) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method4138(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class200.method7839(class229.method2897(var46)).field2178 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class222 var49;
            class222 var50;
            if (var8.field2177 == -1 && var8.field2180 == null) {
                var49 = var8.method3608(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method3608(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class76(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
                var50 = new class76(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field2177, var8.field2203, (class222) null);
            }
            arg6.method4121(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field1020[arg4] * var45, field1021[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("qy.r(Lhn;[Lgv;I)V")
    public static final void method7665(class220 arg0, class207[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1009[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1009[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3863(var3, var4);
                        }
                    }
                }
            }
        }
        field1022 += (int) (Math.random() * 5.0D) - 2;
        if (field1022 < -8) {
            field1022 = -8;
        }
        if (field1022 > 8) {
            field1022 = 8;
        }
        field1023 += (int) (Math.random() * 5.0D) - 2;
        if (field1023 < -16) {
            field1023 = -16;
        }
        if (field1023 > 16) {
            field1023 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1014[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1015[var6][var16 + 1][var15] - field1015[var6][var16 - 1][var15];
                    int var18 = field1015[var6][var16][var15 + 1] - field1015[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field3795[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field1333[var25] = 0;
                Statics.field1806[var25] = 0;
                Statics.field1025[var25] = 0;
                Statics.field4907[var25] = 0;
                Statics.field2765[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = client.field506 < 209 ? (int) class289.method3570(8) : (int) class289.method3570(15);
                        int var30 = Statics.field1011[var6][var28][var27] & var29;
                        if (var30 > 0) {
                            class194 var31 = class194.method7212(var30 - 1);
                            Statics.field1333[var27] += var31.field2103;
                            Statics.field1806[var27] += var31.field2106;
                            Statics.field1025[var27] += var31.field2105;
                            Statics.field4907[var27] += var31.field2101;
                            var10002 = Statics.field2765[var27]++;
                        }
                    }
                    int var32 = var26 - 5;
                    if (var32 >= 0 && var32 < 104) {
                        int var33 = client.field506 < 209 ? (int) class289.method3570(8) : (int) class289.method3570(15);
                        int var34 = Statics.field1011[var6][var32][var27] & var33;
                        if (var34 > 0) {
                            class194 var35 = class194.method7212(var34 - 1);
                            Statics.field1333[var27] -= var35.field2103;
                            Statics.field1806[var27] -= var35.field2106;
                            Statics.field1025[var27] -= var35.field2105;
                            Statics.field4907[var27] -= var35.field2101;
                            var10002 = Statics.field2765[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var36 = 0;
                    int var37 = 0;
                    int var38 = 0;
                    int var39 = 0;
                    int var40 = 0;
                    for (int var41 = -5; var41 < 109; var41++) {
                        int var42 = var41 + 5;
                        if (var42 >= 0 && var42 < 104) {
                            var36 += Statics.field1333[var42];
                            var37 += Statics.field1806[var42];
                            var38 += Statics.field1025[var42];
                            var39 += Statics.field4907[var42];
                            var40 += Statics.field2765[var42];
                        }
                        int var43 = var41 - 5;
                        if (var43 >= 0 && var43 < 104) {
                            var36 -= Statics.field1333[var43];
                            var37 -= Statics.field1806[var43];
                            var38 -= Statics.field1025[var43];
                            var39 -= Statics.field4907[var43];
                            var40 -= Statics.field2765[var43];
                        }
                        if (var41 >= 1 && var41 < 103 && (!client.field501 || (field1009[0][var26][var41] & 0x2) != 0 || (field1009[var6][var26][var41] & 0x10) == 0)) {
                            if (var6 < field1010) {
                                field1010 = var6;
                            }
                            int var44 = client.field506 < 209 ? (int) class289.method3570(8) : (int) class289.method3570(15);
                            int var45 = Statics.field1011[var6][var26][var41] & var44;
                            int var46 = Statics.field1866[var6][var26][var41] & var44;
                            if (var45 > 0 || var46 > 0) {
                                int var47 = field1015[var6][var26][var41];
                                int var48 = field1015[var6][var26 + 1][var41];
                                int var49 = field1015[var6][var26 + 1][var41 + 1];
                                int var50 = field1015[var6][var26][var41 + 1];
                                int var51 = Statics.field3795[var26][var41];
                                int var52 = Statics.field3795[var26 + 1][var41];
                                int var53 = Statics.field3795[var26 + 1][var41 + 1];
                                int var54 = Statics.field3795[var26][var41 + 1];
                                int var55 = -1;
                                int var56 = -1;
                                if (var45 > 0) {
                                    int var57 = var36 * 256 / var39;
                                    int var58 = var37 / var40;
                                    int var59 = var38 / var40;
                                    var55 = method2991(var57, var58, var59);
                                    int var60 = field1022 + var57 & 0xFF;
                                    int var61 = field1023 + var59;
                                    if (var61 < 0) {
                                        var61 = 0;
                                    } else if (var61 > 255) {
                                        var61 = 255;
                                    }
                                    var56 = method2991(var60, var58, var61);
                                }
                                if (var6 > 0) {
                                    boolean var62 = true;
                                    if (var45 == 0 && Statics.field1012[var6][var26][var41] != 0) {
                                        var62 = false;
                                    }
                                    if (var46 > 0) {
                                        int var63 = var46 - 1;
                                        class202 var64 = (class202) class202.field2278.method5028((long) var63);
                                        class202 var65;
                                        if (var64 == null) {
                                            byte[] var66 = Statics.field2273.method5990(4, var63);
                                            class202 var67 = new class202();
                                            if (var66 != null) {
                                                var67.method3740(new class474(var66), var63);
                                            }
                                            var67.method3727();
                                            class202.field2278.method5027(var67, (long) var63);
                                            var65 = var67;
                                        } else {
                                            var65 = var64;
                                        }
                                        if (!var65.field2281) {
                                            var62 = false;
                                        }
                                    }
                                    if (var62 && var47 == var48 && var47 == var49 && var47 == var50) {
                                        Statics.field3718[var6][var26][var41] |= 0x924;
                                    }
                                }
                                int var68 = 0;
                                if (var56 != -1) {
                                    var68 = class217.field2511[method2605(var56, 96)];
                                }
                                if (var46 == 0) {
                                    arg0.method4222(var6, var26, var41, 0, 0, -1, var47, var48, var49, var50, method2605(var55, var51), method2605(var55, var52), method2605(var55, var53), method2605(var55, var54), 0, 0, 0, 0, var68, 0);
                                } else {
                                    int var69 = Statics.field1012[var6][var26][var41] + 1;
                                    byte var70 = Statics.field1013[var6][var26][var41];
                                    int var71 = var46 - 1;
                                    class202 var72 = (class202) class202.field2278.method5028((long) var71);
                                    class202 var73;
                                    if (var72 == null) {
                                        byte[] var74 = Statics.field2273.method5990(4, var71);
                                        class202 var75 = new class202();
                                        if (var74 != null) {
                                            var75.method3740(new class474(var74), var71);
                                        }
                                        var75.method3727();
                                        class202.field2278.method5027(var75, (long) var71);
                                        var73 = var75;
                                    } else {
                                        var73 = var72;
                                    }
                                    int var77 = var73.field2270;
                                    int var78;
                                    int var79;
                                    if (var77 >= 0) {
                                        var78 = Statics.field2512.method4304(var77);
                                        var79 = -1;
                                    } else if (var73.field2268 == 16711935) {
                                        var79 = -2;
                                        var77 = -1;
                                        var78 = -2;
                                    } else {
                                        var79 = method2991(var73.field2274, var73.field2269, var73.field2275);
                                        int var80 = field1022 + var73.field2274 & 0xFF;
                                        int var81 = field1023 + var73.field2275;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        var78 = method2991(var80, var73.field2269, var81);
                                    }
                                    int var82 = 0;
                                    if (var78 != -2) {
                                        var82 = class217.field2511[method3505(var78, 96)];
                                    }
                                    if (var73.field2272 != -1) {
                                        int var83 = field1022 + var73.field2276 & 0xFF;
                                        int var84 = field1023 + var73.field2277;
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        int var85 = method2991(var83, var73.field2271, var84);
                                        var82 = class217.field2511[method3505(var85, 96)];
                                    }
                                    arg0.method4222(var6, var26, var41, var69, var70, var77, var47, var48, var49, var50, method2605(var55, var51), method2605(var55, var52), method2605(var55, var53), method2605(var55, var54), method3505(var79, var51), method3505(var79, var52), method3505(var79, var53), method3505(var79, var54), var68, var82);
                                }
                            }
                        }
                    }
                }
            }
            for (int var86 = 1; var86 < 103; var86++) {
                for (int var87 = 1; var87 < 103; var87++) {
                    int var92;
                    if ((field1009[var6][var87][var86] & 0x8) != 0) {
                        var92 = 0;
                    } else if (var6 <= 0 || (field1009[1][var87][var86] & 0x2) == 0) {
                        var92 = var6;
                    } else {
                        var92 = var6 - 1;
                    }
                    arg0.method4116(var6, var87, var86, var92);
                }
            }
            Statics.field1011[var6] = (short[][]) null;
            Statics.field1866[var6] = (short[][]) null;
            Statics.field1012[var6] = (byte[][]) null;
            Statics.field1013[var6] = (byte[][]) null;
            Statics.field1014[var6] = (byte[][]) null;
        }
        arg0.method4143(-50, -10, -50);
        for (int var93 = 0; var93 < 104; var93++) {
            for (int var94 = 0; var94 < 104; var94++) {
                if ((field1009[1][var93][var94] & 0x2) == 2) {
                    arg0.method4173(var93, var94);
                }
            }
        }
        int var95 = 1;
        int var96 = 2;
        int var97 = 4;
        for (int var98 = 0; var98 < 4; var98++) {
            if (var98 > 0) {
                var95 <<= 0x3;
                var96 <<= 0x3;
                var97 <<= 0x3;
            }
            for (int var99 = 0; var99 <= var98; var99++) {
                for (int var100 = 0; var100 <= 104; var100++) {
                    for (int var101 = 0; var101 <= 104; var101++) {
                        if ((Statics.field3718[var99][var101][var100] & var95) != 0) {
                            int var102 = var100;
                            int var103 = var100;
                            int var104 = var99;
                            int var105 = var99;
                            while (var102 > 0 && (Statics.field3718[var99][var101][var102 - 1] & var95) != 0) {
                                var102--;
                            }
                            while (var103 < 104 && (Statics.field3718[var99][var101][var103 + 1] & var95) != 0) {
                                var103++;
                            }
                            label374: while (var104 > 0) {
                                for (int var106 = var102; var106 <= var103; var106++) {
                                    if ((Statics.field3718[var104 - 1][var101][var106] & var95) == 0) {
                                        break label374;
                                    }
                                }
                                var104--;
                            }
                            label363: while (var105 < var98) {
                                for (int var107 = var102; var107 <= var103; var107++) {
                                    if ((Statics.field3718[var105 + 1][var101][var107] & var95) == 0) {
                                        break label363;
                                    }
                                }
                                var105++;
                            }
                            int var108 = (var105 + 1 - var104) * (var103 - var102 + 1);
                            if (var108 >= 8) {
                                short var109 = 240;
                                int var110 = field1015[var105][var101][var102] - var109;
                                int var111 = field1015[var104][var101][var102];
                                class220.method4115(var98, 1, var101 * 128, var101 * 128, var102 * 128, var103 * 128 + 128, var110, var111);
                                for (int var112 = var104; var112 <= var105; var112++) {
                                    for (int var113 = var102; var113 <= var103; var113++) {
                                        Statics.field3718[var112][var101][var113] &= ~var95;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3718[var99][var101][var100] & var96) != 0) {
                            int var114 = var101;
                            int var115 = var101;
                            int var116 = var99;
                            int var117 = var99;
                            while (var114 > 0 && (Statics.field3718[var99][var114 - 1][var100] & var96) != 0) {
                                var114--;
                            }
                            while (var115 < 104 && (Statics.field3718[var99][var115 + 1][var100] & var96) != 0) {
                                var115++;
                            }
                            label427: while (var116 > 0) {
                                for (int var118 = var114; var118 <= var115; var118++) {
                                    if ((Statics.field3718[var116 - 1][var118][var100] & var96) == 0) {
                                        break label427;
                                    }
                                }
                                var116--;
                            }
                            label416: while (var117 < var98) {
                                for (int var119 = var114; var119 <= var115; var119++) {
                                    if ((Statics.field3718[var117 + 1][var119][var100] & var96) == 0) {
                                        break label416;
                                    }
                                }
                                var117++;
                            }
                            int var120 = (var117 + 1 - var116) * (var115 - var114 + 1);
                            if (var120 >= 8) {
                                short var121 = 240;
                                int var122 = field1015[var117][var114][var100] - var121;
                                int var123 = field1015[var116][var114][var100];
                                class220.method4115(var98, 2, var114 * 128, var115 * 128 + 128, var100 * 128, var100 * 128, var122, var123);
                                for (int var124 = var116; var124 <= var117; var124++) {
                                    for (int var125 = var114; var125 <= var115; var125++) {
                                        Statics.field3718[var124][var125][var100] &= ~var96;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3718[var99][var101][var100] & var97) != 0) {
                            int var126 = var101;
                            int var127 = var101;
                            int var128 = var100;
                            int var129 = var100;
                            while (var128 > 0 && (Statics.field3718[var99][var101][var128 - 1] & var97) != 0) {
                                var128--;
                            }
                            while (var129 < 104 && (Statics.field3718[var99][var101][var129 + 1] & var97) != 0) {
                                var129++;
                            }
                            label480: while (var126 > 0) {
                                for (int var130 = var128; var130 <= var129; var130++) {
                                    if ((Statics.field3718[var99][var126 - 1][var130] & var97) == 0) {
                                        break label480;
                                    }
                                }
                                var126--;
                            }
                            label469: while (var127 < 104) {
                                for (int var131 = var128; var131 <= var129; var131++) {
                                    if ((Statics.field3718[var99][var127 + 1][var131] & var97) == 0) {
                                        break label469;
                                    }
                                }
                                var127++;
                            }
                            if ((var127 - var126 + 1) * (var129 - var128 + 1) >= 4) {
                                int var132 = field1015[var99][var126][var128];
                                class220.method4115(var98, 4, var126 * 128, var127 * 128 + 128, var128 * 128, var129 * 128 + 128, var132, var132);
                                for (int var133 = var126; var133 <= var127; var133++) {
                                    for (int var134 = var128; var134 <= var129; var134++) {
                                        Statics.field3718[var99][var133][var134] &= ~var97;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.b(IIII)I")
    public static final int method12(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1125(var3, var5);
        int var8 = method1125(var3 + 1, var5);
        int var9 = method1125(var3, var5 + 1);
        int var10 = method1125(var3 + 1, var5 + 1);
        int var11 = method2895(var7, var8, var4, arg2);
        int var12 = method2895(var9, var10, var4, arg2);
        return method2895(var11, var12, var6, arg2);
    }

    @ObfuscatedName("de.m(IIIII)I")
    public static final int method2895(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class217.field2516[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bq.t(III)I")
    public static final int method1125(int arg0, int arg1) {
        int var2 = method1090(arg0 - 1, arg1 - 1) + method1090(arg0 + 1, arg1 - 1) + method1090(arg0 - 1, arg1 + 1) + method1090(arg0 + 1, arg1 + 1);
        int var3 = method1090(arg0 - 1, arg1) + method1090(arg0 + 1, arg1) + method1090(arg0, arg1 - 1) + method1090(arg0, arg1 + 1);
        int var4 = method1090(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bq.h(IIB)I")
    public static final int method1090(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cn.p(III)I")
    public static final int method2605(int arg0, int arg1) {
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

    @ObfuscatedName("gc.o(III)I")
    public static final int method3505(int arg0, int arg1) {
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

    @ObfuscatedName("ej.u(IIIB)I")
    public static final int method2991(int arg0, int arg1, int arg2) {
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
