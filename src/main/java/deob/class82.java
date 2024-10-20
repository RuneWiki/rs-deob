package deob;

@ObfuscatedName("da")
public final class class82 {

    @ObfuscatedName("da.at")
    public static int[][][] field1016 = new int[4][105][105];

    @ObfuscatedName("da.an")
    public static byte[][][] field1018 = new byte[4][104][104];

    @ObfuscatedName("da.av")
    public static int field1017 = 99;

    @ObfuscatedName("da.az")
    public static final int[] field1022 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("da.au")
    public static final int[] field1023 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("da.ai")
    public static final int[] field1015 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("da.aq")
    public static final int[] field1024 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("da.aw")
    public static final int[] field1026 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("da.ay")
    public static final int[] field1027 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("da.al")
    public static int field1028 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("da.am")
    public static int field1025 = (int) (Math.random() * 33.0D) - 16;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kw.at(I)V")
    public static void method4996() {
        field1017 = 99;
        Statics.field2622 = new short[4][104][104];
        Statics.field917 = new short[4][104][104];
        Statics.field1128 = new byte[4][104][104];
        Statics.field1019 = new byte[4][104][104];
        Statics.field1021 = new int[4][105][105];
        Statics.field3400 = new byte[4][105][105];
        Statics.field117 = new int[105][105];
        Statics.field1429 = new int[104];
        Statics.field2330 = new int[104];
        Statics.field1029 = new int[104];
        Statics.field1663 = new int[104];
        Statics.field1020 = new int[104];
    }

    @ObfuscatedName("gb.an(B)V")
    public static void method3061() {
        Statics.field2622 = (short[][][]) null;
        Statics.field917 = (short[][][]) null;
        Statics.field1128 = (byte[][][]) null;
        Statics.field1019 = (byte[][][]) null;
        Statics.field1021 = (int[][][]) null;
        Statics.field3400 = (byte[][][]) null;
        Statics.field117 = (int[][]) null;
        Statics.field1429 = null;
        Statics.field2330 = null;
        Statics.field1029 = null;
        Statics.field1663 = null;
        Statics.field1020 = null;
    }

    @ObfuscatedName("gj.av(IIIIB)V")
    public static final void method3227(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3400[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1016[0][var5][var4] = field1016[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1016[0][var5][var4] = field1016[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1016[0][var5][var4] = field1016[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1016[0][var5][var4] = field1016[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ja.as([BIIII[Lic;I)V")
    public static final void method4646(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class213[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2366[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class501 var9 = new class501(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    method312(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("ib.ax([BIIIIIIIII[Lic;B)V")
    public static final void method4346(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class213[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2366[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class501 var13 = new class501(arg0);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
                        int var17 = arg2 + class324.method6285(var15 & 0x7, var16 & 0x7, arg7);
                        int var19 = var15 & 0x7;
                        int var20 = var16 & 0x7;
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
                        int var24 = arg3 + var23;
                        int var25 = (var15 & 0x7) + arg2 + arg8;
                        int var26 = (var16 & 0x7) + arg3 + arg9;
                        method312(var13, arg1, var17, var24, var25, var26, arg7);
                    } else {
                        method312(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.ap(IIIB)V")
    public static final void method1093(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1016[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1016[arg0][arg1][arg2 + var5] = field1016[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1016[arg0][arg1 + var6][arg2] = field1016[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1016[arg0][arg1 - 1][arg2] != 0) {
            field1016[arg0][arg1][arg2] = field1016[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1016[arg0][arg1][arg2 - 1] != 0) {
            field1016[arg0][arg1][arg2] = field1016[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1016[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1016[arg0][arg1][arg2] = field1016[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("aw.ab(Ltz;IIIIIIB)V")
    public static final void method312(class501 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class93.method3149(arg1, arg2, arg3)) {
            while (true) {
                int var9 = arg0.method8195();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method8129();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method8268();
                }
            }
            return;
        }
        field1018[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method8195();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field1016[0][arg2][arg3] = -method2560(arg4 + 932731, arg5 + 556238) * 8;
                } else {
                    field1016[arg1][arg2][arg3] = field1016[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method8129();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field1016[0][arg2][arg3] = -var8 * 8;
                } else {
                    field1016[arg1][arg2][arg3] = field1016[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field917[arg1][arg2][arg3] = (short) arg0.method8268();
                Statics.field1128[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1019[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field1018[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field2622[arg1][arg2][arg3] = (short) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("es.ae([BIILiz;[Lic;I)V")
    public static final void method2751(byte[] arg0, int arg1, int arg2, class230 arg3, class213[] arg4) {
        class501 var5 = new class501(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method8243();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method8144();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method8129();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1018[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class213 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method5383(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("da.af([BIIIIIIILiz;[Lic;)V")
    public static final void method2070(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class230 arg8, class213[] arg9) {
        class501 var10 = new class501(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method8243();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method8144();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method8129();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class205 var21 = class205.method3219(var11);
                    int var22 = arg2 + class324.method320(var16 & 0x7, var15 & 0x7, arg7, var21.field2160, var21.field2161, var20);
                    int var23 = arg3 + class324.method4108(var16 & 0x7, var15 & 0x7, arg7, var21.field2160, var21.field2161, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field1018[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class213 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method5383(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("mc.ao(IIIIIILiz;Lic;I)V")
    public static final void method5383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class230 arg6, class213 arg7) {
        if (client.field508 && (field1018[0][arg1][arg2] & 0x2) == 0 && (field1018[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1017) {
            field1017 = arg0;
        }
        class205 var8 = class205.method3219(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2161;
            var10 = var8.field2160;
        } else {
            var9 = var8.field2160;
            var10 = var8.field2161;
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
        int[][] var15 = field1016[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class240.method6770(arg1, arg2, 2, var8.field2164 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2165 == 1) {
            var21 += 256;
        }
        if (var8.method3572()) {
            class70.method7829(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field508 || var8.field2164 != 0 || var8.field2162 == 1 || var8.field2183) {
                class232 var22;
                if (var8.field2181 == -1 && var8.field2152 == null) {
                    var22 = var8.method3594(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class80(arg3, 22, arg4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
                }
                arg6.method4273(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2162 == 1 && arg7 != null) {
                    arg7.method3826(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class232 var48;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var48 = var8.method3594(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class80(arg3, 10, arg4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            if (var48 != null && arg6.method4162(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2176) {
                int var49 = 15;
                if (var48 instanceof class239) {
                    var49 = ((class239) var48).method4479() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field3400[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field3400[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2162 != 0 && arg7 != null) {
                arg7.method3833(arg1, arg2, var9, var10, var8.field2192);
            }
        } else if (arg5 >= 12) {
            class232 var23;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var23 = var8.method3594(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4162(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1021[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2162 != 0 && arg7 != null) {
                arg7.method3833(arg1, arg2, var9, var10, var8.field2192);
            }
        } else if (arg5 == 0) {
            class232 var24;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var24 = var8.method3594(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class80(arg3, 0, arg4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4197(arg0, arg1, arg2, var16, var24, (class232) null, field1022[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2176) {
                    Statics.field3400[arg0][arg1][arg2] = 50;
                    Statics.field3400[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2167) {
                    Statics.field1021[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2176) {
                    Statics.field3400[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3400[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2167) {
                    Statics.field1021[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2176) {
                    Statics.field3400[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3400[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2167) {
                    Statics.field1021[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2176) {
                    Statics.field3400[arg0][arg1][arg2] = 50;
                    Statics.field3400[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2167) {
                    Statics.field1021[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2162 != 0 && arg7 != null) {
                arg7.method3840(arg1, arg2, arg5, arg4, var8.field2192);
            }
            if (var8.field2169 != 16) {
                arg6.method4190(arg0, arg1, arg2, var8.field2169);
            }
        } else if (arg5 == 1) {
            class232 var25;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var25 = var8.method3594(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class80(arg3, 1, arg4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4197(arg0, arg1, arg2, var16, var25, (class232) null, field1023[arg4], 0, var19, var21);
            if (var8.field2176) {
                if (arg4 == 0) {
                    Statics.field3400[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3400[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3400[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3400[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2162 != 0 && arg7 != null) {
                arg7.method3840(arg1, arg2, arg5, arg4, var8.field2192);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class232 var27;
            class232 var28;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var27 = var8.method3594(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3594(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class80(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
                var28 = new class80(arg3, 2, var26, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4197(arg0, arg1, arg2, var16, var27, var28, field1022[arg4], field1022[var26], var19, var21);
            if (var8.field2167) {
                if (arg4 == 0) {
                    Statics.field1021[arg0][arg1][arg2] |= 0x249;
                    Statics.field1021[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1021[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1021[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1021[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1021[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1021[arg0][arg1][arg2] |= 0x492;
                    Statics.field1021[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2162 != 0 && arg7 != null) {
                arg7.method3840(arg1, arg2, arg5, arg4, var8.field2192);
            }
            if (var8.field2169 != 16) {
                arg6.method4190(arg0, arg1, arg2, var8.field2169);
            }
        } else if (arg5 == 3) {
            class232 var29;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var29 = var8.method3594(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class80(arg3, 3, arg4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4197(arg0, arg1, arg2, var16, var29, (class232) null, field1023[arg4], 0, var19, var21);
            if (var8.field2176) {
                if (arg4 == 0) {
                    Statics.field3400[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3400[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3400[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3400[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2162 != 0 && arg7 != null) {
                arg7.method3840(arg1, arg2, arg5, arg4, var8.field2192);
            }
        } else if (arg5 == 9) {
            class232 var30;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var30 = var8.method3594(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4162(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2162 != 0 && arg7 != null) {
                arg7.method3833(arg1, arg2, var9, var10, var8.field2192);
            }
            if (var8.field2169 != 16) {
                arg6.method4190(arg0, arg1, arg2, var8.field2169);
            }
        } else if (arg5 == 4) {
            class232 var31;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var31 = var8.method3594(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4161(arg0, arg1, arg2, var16, var31, (class232) null, field1022[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4304(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class205.method3219(class240.method3900(var33)).field2169;
            }
            class232 var35;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var35 = var8.method3594(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4161(arg0, arg1, arg2, var16, var35, (class232) null, field1022[arg4], 0, field1015[arg4] * var32, field1024[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4304(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class205.method3219(class240.method3900(var37)).field2169 / 2;
            }
            class232 var39;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var39 = var8.method3594(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4161(arg0, arg1, arg2, var16, var39, (class232) null, 256, arg4, field1026[arg4] * var36, field1027[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class232 var41;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var41 = var8.method3594(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class80(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4161(arg0, arg1, arg2, var16, var41, (class232) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4304(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class205.method3219(class240.method3900(var43)).field2169 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class232 var46;
            class232 var47;
            if (var8.field2181 == -1 && var8.field2152 == null) {
                var46 = var8.method3594(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3594(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
                var47 = new class80(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2181, var8.field2173, (class232) null);
            }
            arg6.method4161(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1026[arg4] * var42, field1027[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("fe.aj(IIIB)I")
    public static int method2883(int arg0, int arg1, int arg2) {
        if ((field1018[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field1018[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("eu.ad(IIS)I")
    public static final int method2560(int arg0, int arg1) {
        int var2 = method6177(arg0 + 45365, arg1 + 91923, 4) - 128 + (method6177(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method6177(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("nl.ac(IIIB)I")
    public static final int method6177(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method7605(var3, var5);
        int var8 = method7605(var3 + 1, var5);
        int var9 = method7605(var3, var5 + 1);
        int var10 = method7605(var3 + 1, var5 + 1);
        int var11 = 65536 - class226.field2520[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class226.field2520[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class226.field2520[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ri.ag(IIS)I")
    public static final int method7605(int arg0, int arg1) {
        int var2 = method2704(arg0 - 1, arg1 - 1) + method2704(arg0 + 1, arg1 - 1) + method2704(arg0 - 1, arg1 + 1) + method2704(arg0 + 1, arg1 + 1);
        int var3 = method2704(arg0 - 1, arg1) + method2704(arg0 + 1, arg1) + method2704(arg0, arg1 - 1) + method2704(arg0, arg1 + 1);
        int var4 = method2704(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ek.ar(IIB)I")
    public static final int method2704(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dw.ah(IIB)I")
    public static final int method2133(int arg0, int arg1) {
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

    @ObfuscatedName("qz.az(III)I")
    public static final int method7276(int arg0, int arg1) {
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

    @ObfuscatedName("ba.au(IIII)I")
    public static final int method607(int arg0, int arg1, int arg2) {
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
