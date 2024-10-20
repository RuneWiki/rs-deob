package deob;

@ObfuscatedName("dm")
public final class class82 {

    @ObfuscatedName("dm.am")
    public static int[][][] field1020 = new int[4][105][105];

    @ObfuscatedName("dm.ap")
    public static byte[][][] field1009 = new byte[4][104][104];

    @ObfuscatedName("dm.af")
    public static int field1017 = 99;

    @ObfuscatedName("dm.ay")
    public static final int[] field1015 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("dm.as")
    public static final int[] field1016 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("dm.ab")
    public static final int[] field1019 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("dm.ah")
    public static final int[] field1018 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("dm.ai")
    public static final int[] field1011 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("dm.ac")
    public static final int[] field1008 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("dm.al")
    public static int field1021 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("dm.at")
    public static int field1010 = (int) (Math.random() * 33.0D) - 16;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("sx.am(I)V")
    public static void method7981() {
        field1017 = 99;
        Statics.field1022 = new short[4][104][104];
        Statics.field1012 = new short[4][104][104];
        Statics.field1629 = new byte[4][104][104];
        Statics.field2279 = new byte[4][104][104];
        Statics.field1013 = new int[4][105][105];
        Statics.field5261 = new byte[4][105][105];
        Statics.field4591 = new int[105][105];
        Statics.field4419 = new int[104];
        Statics.field3628 = new int[104];
        Statics.field5097 = new int[104];
        Statics.field3273 = new int[104];
        Statics.field2428 = new int[104];
    }

    @ObfuscatedName("fc.ap(B)V")
    public static void method3089() {
        Statics.field1022 = (short[][][]) null;
        Statics.field1012 = (short[][][]) null;
        Statics.field1629 = (byte[][][]) null;
        Statics.field2279 = (byte[][][]) null;
        Statics.field1013 = (int[][][]) null;
        Statics.field5261 = (byte[][][]) null;
        Statics.field4591 = (int[][]) null;
        Statics.field4419 = null;
        Statics.field3628 = null;
        Statics.field5097 = null;
        Statics.field3273 = null;
        Statics.field2428 = null;
    }

    @ObfuscatedName("cn.af(IIIII)V")
    public static final void method1186(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field5261[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1020[0][var5][var4] = field1020[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1020[0][var5][var4] = field1020[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1020[0][var5][var4] = field1020[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1020[0][var5][var4] = field1020[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("br.aj([BIIII[Lii;I)V")
    public static final void method451(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class228[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2425[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class531 var9 = new class531(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    method3018(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("fo.aq([BIIIIIIIII[Lii;I)V")
    public static final void method3073(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class228[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2425[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class531 var13 = new class531(arg0);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
                        int var18 = var15 & 0x7;
                        int var19 = var16 & 0x7;
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
                        int var23 = arg2 + var22;
                        int var24 = arg3 + Statics.method7097(var15 & 0x7, var16 & 0x7, arg7);
                        int var25 = (var15 & 0x7) + arg2 + arg8;
                        int var26 = (var16 & 0x7) + arg3 + arg9;
                        method3018(var13, arg1, var23, var24, var25, var26, arg7);
                    } else {
                        method3018(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.ar(IIIB)V")
    public static final void method1108(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1020[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1020[arg0][arg1][arg2 + var5] = field1020[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1020[arg0][arg1 + var6][arg2] = field1020[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1020[arg0][arg1 - 1][arg2] != 0) {
            field1020[arg0][arg1][arg2] = field1020[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1020[arg0][arg1][arg2 - 1] != 0) {
            field1020[arg0][arg1][arg2] = field1020[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1020[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1020[arg0][arg1][arg2] = field1020[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("fi.ag(Luk;IIIIIII)V")
    public static final void method3018(class531 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = arg1 >= 0 && arg1 < 4 && arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104;
        if (!var7) {
            while (true) {
                int var17 = arg0.method8775();
                if (var17 == 0) {
                    break;
                }
                if (var17 == 1) {
                    arg0.method8561();
                    break;
                }
                if (var17 <= 49) {
                    arg0.method8564();
                }
            }
            return;
        }
        field1009[arg1][arg2][arg3] = 0;
        while (true) {
            int var8 = arg0.method8775();
            if (var8 == 0) {
                if (arg1 == 0) {
                    int[] var9 = field1020[0][arg2];
                    int var11 = arg4 + 932731;
                    int var12 = arg5 + 556238;
                    int var13 = method6318(var11 + 45365, var12 + 91923, 4) - 128 + (method6318(var11 + 10294, var12 + 37821, 2) - 128 >> 1) + (method6318(var11, var12, 1) - 128 >> 2);
                    int var14 = (int) ((double) var13 * 0.3D) + 35;
                    if (var14 < 10) {
                        var14 = 10;
                    } else if (var14 > 60) {
                        var14 = 60;
                    }
                    var9[arg3] = -var14 * 8;
                } else {
                    field1020[arg1][arg2][arg3] = field1020[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var8 == 1) {
                int var16 = arg0.method8561();
                if (var16 == 1) {
                    var16 = 0;
                }
                if (arg1 == 0) {
                    field1020[0][arg2][arg3] = -var16 * 8;
                } else {
                    field1020[arg1][arg2][arg3] = field1020[arg1 - 1][arg2][arg3] - var16 * 8;
                }
                break;
            }
            if (var8 <= 49) {
                Statics.field1012[arg1][arg2][arg3] = (short) arg0.method8564();
                Statics.field1629[arg1][arg2][arg3] = (byte) ((var8 - 2) / 4);
                Statics.field2279[arg1][arg2][arg3] = (byte) (var8 - 2 + arg6 & 0x3);
            } else if (var8 <= 81) {
                field1009[arg1][arg2][arg3] = (byte) (var8 - 49);
            } else {
                Statics.field1022[arg1][arg2][arg3] = (short) (var8 - 81);
            }
        }
    }

    @ObfuscatedName("nm.ao([BIII)Z")
    public static final boolean method5764(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class531 var4 = new class531(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8578();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8576();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8561() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class202 var16 = class202.method3023(var5);
                        if (var13 != 22 || !client.field503 || var16.field2114 != 0 || var16.field2112 == 1 || var16.field2133) {
                            if (!var16.method3624()) {
                                client.field556++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8576();
                if (var9 == 0) {
                    break;
                }
                var4.method8561();
            }
        }
    }

    @ObfuscatedName("ic.ae([BIILkn;[Lii;B)V")
    public static final void method3925(byte[] arg0, int arg1, int arg2, class274 arg3, class228[] arg4) {
        class531 var5 = new class531(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method8578();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method8576();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method8561();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1009[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class228 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1123(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dm.aa([BIIIIIIILkn;[Lii;)V")
    public static final void method2186(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class274 arg8, class228[] arg9) {
        class531 var10 = new class531(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method8578();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method8576();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method8561();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class202 var21 = class202.method3023(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2120;
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
                    int var33 = var16 & 0x7;
                    int var34 = var15 & 0x7;
                    int var36 = var21.field2120;
                    int var37 = var21.field2096;
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
                        if ((field1009[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class228 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method1123(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.au(IIIIIILkn;Lii;B)V")
    public static final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class274 arg6, class228 arg7) {
        if (client.field503 && (field1009[0][arg1][arg2] & 0x2) == 0 && (field1009[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1017) {
            field1017 = arg0;
        }
        class202 var8 = class202.method3023(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2096;
            var10 = var8.field2120;
        } else {
            var9 = var8.field2120;
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
        int[][] var15 = field1020[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class284.method2168(arg1, arg2, 2, var8.field2114 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2135 == 1) {
            var21 += 256;
        }
        if (var8.method3649()) {
            class70.method45(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field503 || var8.field2114 != 0 || var8.field2112 == 1 || var8.field2133) {
                class276 var22;
                if (var8.field2118 == -1 && var8.field2097 == null) {
                    var22 = var8.method3617(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class80(arg3, 22, arg4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
                }
                arg6.method4886(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2112 == 1 && arg7 != null) {
                    arg7.method4096(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class276 var48;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var48 = var8.method3617(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class80(arg3, 10, arg4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            if (var48 != null && arg6.method5019(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2126) {
                int var49 = 15;
                if (var48 instanceof class283) {
                    var49 = ((class283) var48).method5138() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field5261[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field5261[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2112 != 0 && arg7 != null) {
                arg7.method4085(arg1, arg2, var9, var10, var8.field2098);
            }
        } else if (arg5 >= 12) {
            class276 var23;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var23 = var8.method3617(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method5019(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1013[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2112 != 0 && arg7 != null) {
                arg7.method4085(arg1, arg2, var9, var10, var8.field2098);
            }
        } else if (arg5 == 0) {
            class276 var24;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var24 = var8.method3617(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class80(arg3, 0, arg4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method4986(arg0, arg1, arg2, var16, var24, (class276) null, field1015[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2126) {
                    Statics.field5261[arg0][arg1][arg2] = 50;
                    Statics.field5261[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2117) {
                    Statics.field1013[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2126) {
                    Statics.field5261[arg0][arg1][arg2 + 1] = 50;
                    Statics.field5261[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2117) {
                    Statics.field1013[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2126) {
                    Statics.field5261[arg0][arg1 + 1][arg2] = 50;
                    Statics.field5261[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2117) {
                    Statics.field1013[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2126) {
                    Statics.field5261[arg0][arg1][arg2] = 50;
                    Statics.field5261[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2117) {
                    Statics.field1013[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2112 != 0 && arg7 != null) {
                arg7.method4084(arg1, arg2, arg5, arg4, var8.field2098);
            }
            if (var8.field2119 != 16) {
                arg6.method4896(arg0, arg1, arg2, var8.field2119);
            }
        } else if (arg5 == 1) {
            class276 var25;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var25 = var8.method3617(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class80(arg3, 1, arg4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method4986(arg0, arg1, arg2, var16, var25, (class276) null, field1016[arg4], 0, var19, var21);
            if (var8.field2126) {
                if (arg4 == 0) {
                    Statics.field5261[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field5261[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field5261[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field5261[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2112 != 0 && arg7 != null) {
                arg7.method4084(arg1, arg2, arg5, arg4, var8.field2098);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class276 var27;
            class276 var28;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var27 = var8.method3617(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3617(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class80(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
                var28 = new class80(arg3, 2, var26, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method4986(arg0, arg1, arg2, var16, var27, var28, field1015[arg4], field1015[var26], var19, var21);
            if (var8.field2117) {
                if (arg4 == 0) {
                    Statics.field1013[arg0][arg1][arg2] |= 0x249;
                    Statics.field1013[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1013[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1013[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1013[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1013[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1013[arg0][arg1][arg2] |= 0x492;
                    Statics.field1013[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2112 != 0 && arg7 != null) {
                arg7.method4084(arg1, arg2, arg5, arg4, var8.field2098);
            }
            if (var8.field2119 != 16) {
                arg6.method4896(arg0, arg1, arg2, var8.field2119);
            }
        } else if (arg5 == 3) {
            class276 var29;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var29 = var8.method3617(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class80(arg3, 3, arg4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method4986(arg0, arg1, arg2, var16, var29, (class276) null, field1016[arg4], 0, var19, var21);
            if (var8.field2126) {
                if (arg4 == 0) {
                    Statics.field5261[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field5261[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field5261[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field5261[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2112 != 0 && arg7 != null) {
                arg7.method4084(arg1, arg2, arg5, arg4, var8.field2098);
            }
        } else if (arg5 == 9) {
            class276 var30;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var30 = var8.method3617(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method5019(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2112 != 0 && arg7 != null) {
                arg7.method4085(arg1, arg2, var9, var10, var8.field2098);
            }
            if (var8.field2119 != 16) {
                arg6.method4896(arg0, arg1, arg2, var8.field2119);
            }
        } else if (arg5 == 4) {
            class276 var31;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var31 = var8.method3617(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method4995(arg0, arg1, arg2, var16, var31, (class276) null, field1015[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4906(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class202.method3023(class284.method3222(var33)).field2119;
            }
            class276 var35;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var35 = var8.method3617(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method4995(arg0, arg1, arg2, var16, var35, (class276) null, field1015[arg4], 0, field1019[arg4] * var32, field1018[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4906(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class202.method3023(class284.method3222(var37)).field2119 / 2;
            }
            class276 var39;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var39 = var8.method3617(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method4995(arg0, arg1, arg2, var16, var39, (class276) null, 256, arg4, field1011[arg4] * var36, field1008[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class276 var41;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var41 = var8.method3617(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class80(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method4995(arg0, arg1, arg2, var16, var41, (class276) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4906(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class202.method3023(class284.method3222(var43)).field2119 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class276 var46;
            class276 var47;
            if (var8.field2118 == -1 && var8.field2097 == null) {
                var46 = var8.method3617(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3617(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
                var47 = new class80(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2118, var8.field2144, (class276) null);
            }
            arg6.method4995(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1011[arg4] * var42, field1008[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("eb.an(Lkn;[Lii;B)V")
    public static final void method2858(class274 arg0, class228[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1009[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1009[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method4112(var3, var4);
                        }
                    }
                }
            }
        }
        field1021 += (int) (Math.random() * 5.0D) - 2;
        if (field1021 < -8) {
            field1021 = -8;
        }
        if (field1021 > 8) {
            field1021 = 8;
        }
        field1010 += (int) (Math.random() * 5.0D) - 2;
        if (field1010 < -16) {
            field1010 = -16;
        }
        if (field1010 > 16) {
            field1010 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field5261[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1020[var6][var16 + 1][var15] - field1020[var6][var16 - 1][var15];
                    int var18 = field1020[var6][var16][var15 + 1] - field1020[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field4591[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field4419[var25] = 0;
                Statics.field3628[var25] = 0;
                Statics.field5097[var25] = 0;
                Statics.field3273[var25] = 0;
                Statics.field2428[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = (int) class318.method2610(15);
                        int var30 = Statics.field1022[var6][var28][var27] & var29;
                        if (var30 > 0) {
                            class195 var31 = class195.method3069(var30 - 1);
                            Statics.field4419[var27] += var31.field2038;
                            Statics.field3628[var27] += var31.field2039;
                            Statics.field5097[var27] += var31.field2035;
                            Statics.field3273[var27] += var31.field2041;
                            var10002 = Statics.field2428[var27]++;
                        }
                    }
                    int var32 = var26 - 5;
                    if (var32 >= 0 && var32 < 104) {
                        int var33 = (int) class318.method2610(15);
                        int var34 = Statics.field1022[var6][var32][var27] & var33;
                        if (var34 > 0) {
                            class195 var35 = class195.method3069(var34 - 1);
                            Statics.field4419[var27] -= var35.field2038;
                            Statics.field3628[var27] -= var35.field2039;
                            Statics.field5097[var27] -= var35.field2035;
                            Statics.field3273[var27] -= var35.field2041;
                            var10002 = Statics.field2428[var27]--;
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
                            var36 += Statics.field4419[var42];
                            var37 += Statics.field3628[var42];
                            var38 += Statics.field5097[var42];
                            var39 += Statics.field3273[var42];
                            var40 += Statics.field2428[var42];
                        }
                        int var43 = var41 - 5;
                        if (var43 >= 0 && var43 < 104) {
                            var36 -= Statics.field4419[var43];
                            var37 -= Statics.field3628[var43];
                            var38 -= Statics.field5097[var43];
                            var39 -= Statics.field3273[var43];
                            var40 -= Statics.field2428[var43];
                        }
                        if (var41 >= 1 && var41 < 103 && (!client.field503 || (field1009[0][var26][var41] & 0x2) != 0 || (field1009[var6][var26][var41] & 0x10) == 0)) {
                            if (var6 < field1017) {
                                field1017 = var6;
                            }
                            int var44 = (int) class318.method2610(15);
                            int var45 = Statics.field1022[var6][var26][var41] & var44;
                            int var46 = Statics.field1012[var6][var26][var41] & var44;
                            if (var45 > 0 || var46 > 0) {
                                int var47 = field1020[var6][var26][var41];
                                int var48 = field1020[var6][var26 + 1][var41];
                                int var49 = field1020[var6][var26 + 1][var41 + 1];
                                int var50 = field1020[var6][var26][var41 + 1];
                                int var51 = Statics.field4591[var26][var41];
                                int var52 = Statics.field4591[var26 + 1][var41];
                                int var53 = Statics.field4591[var26 + 1][var41 + 1];
                                int var54 = Statics.field4591[var26][var41 + 1];
                                int var55 = -1;
                                int var56 = -1;
                                if (var45 > 0) {
                                    int var57 = var36 * 256 / var39;
                                    int var58 = var37 / var40;
                                    int var59 = var38 / var40;
                                    var55 = class256.method433(var57, var58, var59);
                                    int var60 = field1021 + var57 & 0xFF;
                                    int var61 = field1010 + var59;
                                    if (var61 < 0) {
                                        var61 = 0;
                                    } else if (var61 > 255) {
                                        var61 = 255;
                                    }
                                    var56 = class256.method433(var60, var58, var61);
                                }
                                if (var6 > 0) {
                                    boolean var62 = true;
                                    if (var45 == 0 && Statics.field1629[var6][var26][var41] != 0) {
                                        var62 = false;
                                    }
                                    if (var46 > 0) {
                                        int var63 = var46 - 1;
                                        class204 var64 = (class204) class204.field2206.method5400((long) var63);
                                        class204 var65;
                                        if (var64 == null) {
                                            byte[] var66 = Statics.field4586.method6396(4, var63);
                                            class204 var67 = new class204();
                                            if (var66 != null) {
                                                var67.method3735(new class531(var66), var63);
                                            }
                                            var67.method3745();
                                            class204.field2206.method5402(var67, (long) var63);
                                            var65 = var67;
                                        } else {
                                            var65 = var64;
                                        }
                                        if (!var65.field2209) {
                                            var62 = false;
                                        }
                                    }
                                    if (var62 && var47 == var48 && var47 == var49 && var47 == var50) {
                                        Statics.field1013[var6][var26][var41] |= 0x924;
                                    }
                                }
                                int var68 = 0;
                                if (var56 != -1) {
                                    var68 = class270.field2807[method714(var56, 96)];
                                }
                                if (var46 == 0) {
                                    arg0.method4885(var6, var26, var41, 0, 0, -1, var47, var48, var49, var50, method714(var55, var51), method714(var55, var52), method714(var55, var53), method714(var55, var54), 0, 0, 0, 0, var68, 0);
                                } else {
                                    int var69 = Statics.field1629[var6][var26][var41] + 1;
                                    byte var70 = Statics.field2279[var6][var26][var41];
                                    int var71 = var46 - 1;
                                    class204 var72 = (class204) class204.field2206.method5400((long) var71);
                                    class204 var73;
                                    if (var72 == null) {
                                        byte[] var74 = Statics.field4586.method6396(4, var71);
                                        class204 var75 = new class204();
                                        if (var74 != null) {
                                            var75.method3735(new class531(var74), var71);
                                        }
                                        var75.method3745();
                                        class204.field2206.method5402(var75, (long) var71);
                                        var73 = var75;
                                    } else {
                                        var73 = var72;
                                    }
                                    int var77 = var73.field2208;
                                    int var78;
                                    int var79;
                                    if (var77 >= 0) {
                                        var78 = class270.field2810.field3095.method5089(var77);
                                        var79 = -1;
                                    } else if (var73.field2214 == 16711935) {
                                        var79 = -2;
                                        var77 = -1;
                                        var78 = -2;
                                    } else {
                                        var79 = class256.method433(var73.field2211, var73.field2212, var73.field2213);
                                        int var80 = field1021 + var73.field2211 & 0xFF;
                                        int var81 = field1010 + var73.field2213;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        var78 = class256.method433(var80, var73.field2212, var81);
                                    }
                                    int var82 = 0;
                                    if (var78 != -2) {
                                        var82 = class270.field2807[method673(var78, 96)];
                                    }
                                    if (var73.field2210 != -1) {
                                        int var83 = field1021 + var73.field2216 & 0xFF;
                                        int var84 = field1010 + var73.field2218;
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        int var85 = class256.method433(var83, var73.field2215, var84);
                                        var82 = class270.field2807[method673(var85, 96)];
                                    }
                                    arg0.method4885(var6, var26, var41, var69, var70, var77, var47, var48, var49, var50, method714(var55, var51), method714(var55, var52), method714(var55, var53), method714(var55, var54), method673(var79, var51), method673(var79, var52), method673(var79, var53), method673(var79, var54), var68, var82);
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
                    arg0.method5025(var6, var87, var86, var92);
                }
            }
            Statics.field1022[var6] = (short[][]) null;
            Statics.field1012[var6] = (short[][]) null;
            Statics.field1629[var6] = (byte[][]) null;
            Statics.field2279[var6] = (byte[][]) null;
            Statics.field5261[var6] = (byte[][]) null;
        }
        arg0.method4911(-50, -10, -50);
        for (int var93 = 0; var93 < 104; var93++) {
            for (int var94 = 0; var94 < 104; var94++) {
                if ((field1009[1][var93][var94] & 0x2) == 2) {
                    arg0.method5036(var93, var94);
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
                        if ((Statics.field1013[var99][var101][var100] & var95) != 0) {
                            int var102 = var100;
                            int var103 = var100;
                            int var104 = var99;
                            int var105 = var99;
                            while (var102 > 0 && (Statics.field1013[var99][var101][var102 - 1] & var95) != 0) {
                                var102--;
                            }
                            while (var103 < 104 && (Statics.field1013[var99][var101][var103 + 1] & var95) != 0) {
                                var103++;
                            }
                            label361: while (var104 > 0) {
                                for (int var106 = var102; var106 <= var103; var106++) {
                                    if ((Statics.field1013[var104 - 1][var101][var106] & var95) == 0) {
                                        break label361;
                                    }
                                }
                                var104--;
                            }
                            label350: while (var105 < var98) {
                                for (int var107 = var102; var107 <= var103; var107++) {
                                    if ((Statics.field1013[var105 + 1][var101][var107] & var95) == 0) {
                                        break label350;
                                    }
                                }
                                var105++;
                            }
                            int var108 = (var105 + 1 - var104) * (var103 - var102 + 1);
                            if (var108 >= 8) {
                                short var109 = 240;
                                int var110 = field1020[var105][var101][var102] - var109;
                                int var111 = field1020[var104][var101][var102];
                                class274.method4883(var98, 1, var101 * 128, var101 * 128, var102 * 128, var103 * 128 + 128, var110, var111);
                                for (int var112 = var104; var112 <= var105; var112++) {
                                    for (int var113 = var102; var113 <= var103; var113++) {
                                        Statics.field1013[var112][var101][var113] &= ~var95;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1013[var99][var101][var100] & var96) != 0) {
                            int var114 = var101;
                            int var115 = var101;
                            int var116 = var99;
                            int var117 = var99;
                            while (var114 > 0 && (Statics.field1013[var99][var114 - 1][var100] & var96) != 0) {
                                var114--;
                            }
                            while (var115 < 104 && (Statics.field1013[var99][var115 + 1][var100] & var96) != 0) {
                                var115++;
                            }
                            label414: while (var116 > 0) {
                                for (int var118 = var114; var118 <= var115; var118++) {
                                    if ((Statics.field1013[var116 - 1][var118][var100] & var96) == 0) {
                                        break label414;
                                    }
                                }
                                var116--;
                            }
                            label403: while (var117 < var98) {
                                for (int var119 = var114; var119 <= var115; var119++) {
                                    if ((Statics.field1013[var117 + 1][var119][var100] & var96) == 0) {
                                        break label403;
                                    }
                                }
                                var117++;
                            }
                            int var120 = (var117 + 1 - var116) * (var115 - var114 + 1);
                            if (var120 >= 8) {
                                short var121 = 240;
                                int var122 = field1020[var117][var114][var100] - var121;
                                int var123 = field1020[var116][var114][var100];
                                class274.method4883(var98, 2, var114 * 128, var115 * 128 + 128, var100 * 128, var100 * 128, var122, var123);
                                for (int var124 = var116; var124 <= var117; var124++) {
                                    for (int var125 = var114; var125 <= var115; var125++) {
                                        Statics.field1013[var124][var125][var100] &= ~var96;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1013[var99][var101][var100] & var97) != 0) {
                            int var126 = var101;
                            int var127 = var101;
                            int var128 = var100;
                            int var129 = var100;
                            while (var128 > 0 && (Statics.field1013[var99][var101][var128 - 1] & var97) != 0) {
                                var128--;
                            }
                            while (var129 < 104 && (Statics.field1013[var99][var101][var129 + 1] & var97) != 0) {
                                var129++;
                            }
                            label467: while (var126 > 0) {
                                for (int var130 = var128; var130 <= var129; var130++) {
                                    if ((Statics.field1013[var99][var126 - 1][var130] & var97) == 0) {
                                        break label467;
                                    }
                                }
                                var126--;
                            }
                            label456: while (var127 < 104) {
                                for (int var131 = var128; var131 <= var129; var131++) {
                                    if ((Statics.field1013[var99][var127 + 1][var131] & var97) == 0) {
                                        break label456;
                                    }
                                }
                                var127++;
                            }
                            if ((var127 - var126 + 1) * (var129 - var128 + 1) >= 4) {
                                int var132 = field1020[var99][var126][var128];
                                class274.method4883(var98, 4, var126 * 128, var127 * 128 + 128, var128 * 128, var129 * 128 + 128, var132, var132);
                                for (int var133 = var126; var133 <= var127; var133++) {
                                    for (int var134 = var128; var134 <= var129; var134++) {
                                        Statics.field1013[var99][var133][var134] &= ~var97;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("nw.ad(IIII)I")
    public static final int method6318(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2617(var3, var5);
        int var8 = method2617(var3 + 1, var5);
        int var9 = method2617(var3, var5 + 1);
        int var10 = method2617(var3 + 1, var5 + 1);
        int var11 = method2678(var7, var8, var4, arg2);
        int var12 = method2678(var9, var10, var4, arg2);
        return method2678(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ev.ax(IIIII)I")
    public static final int method2678(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class270.field2808[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("du.aw(IIB)I")
    public static final int method2617(int arg0, int arg1) {
        int var2 = method6285(arg0 - 1, arg1 - 1) + method6285(arg0 + 1, arg1 - 1) + method6285(arg0 - 1, arg1 + 1) + method6285(arg0 + 1, arg1 + 1);
        int var3 = method6285(arg0 - 1, arg1) + method6285(arg0 + 1, arg1) + method6285(arg0, arg1 - 1) + method6285(arg0, arg1 + 1);
        int var4 = method6285(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("nc.az(III)I")
    public static final int method6285(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bc.av(IIB)I")
    public static final int method714(int arg0, int arg1) {
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

    @ObfuscatedName("by.ak(III)I")
    public static final int method673(int arg0, int arg1) {
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

    @ObfuscatedName("rf.as(III)Z")
    public static final boolean method7718(int arg0, int arg1) {
        class202 var2 = class202.method3023(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3610(arg1);
    }

    @ObfuscatedName("ac.ab(IIIIIIIILkn;Lii;I)V")
    public static final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class274 arg8, class228 arg9) {
        class202 var10 = class202.method3023(arg4);
        int var11 = arg7 >= 0 ? arg7 : var10.field2118;
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var12 = var10.field2096;
            var13 = var10.field2120;
        } else {
            var12 = var10.field2120;
            var13 = var10.field2096;
        }
        int var14;
        int var15;
        if (arg2 + var12 <= 104) {
            var14 = (var12 >> 1) + arg2;
            var15 = (var12 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int var16;
        int var17;
        if (arg3 + var13 <= 104) {
            var16 = (var13 >> 1) + arg3;
            var17 = (var13 + 1 >> 1) + arg3;
        } else {
            var16 = arg3;
            var17 = arg3 + 1;
        }
        int[][] var18 = field1020[arg1];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg2 << 7) + (var12 << 6);
        int var21 = (arg3 << 7) + (var13 << 6);
        long var22 = class284.method2168(arg2, arg3, 2, var10.field2114 == 0, arg4);
        int var24 = (arg5 << 6) + arg6;
        if (var10.field2135 == 1) {
            var24 += 256;
        }
        if (arg6 == 22) {
            class276 var25;
            if (var11 == -1 && var10.field2097 == null) {
                var25 = var10.method3613(22, arg5, var18, var20, var19, var21);
            } else {
                var25 = new class80(arg4, 22, arg5, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4886(arg0, arg2, arg3, var19, var25, var22, var24);
            if (var10.field2112 == 1) {
                arg9.method4096(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class276 var51;
            if (var11 == -1 && var10.field2097 == null) {
                var51 = var10.method3613(10, arg5, var18, var20, var19, var21);
            } else {
                var51 = new class80(arg4, 10, arg5, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            if (var51 != null) {
                arg8.method5019(arg0, arg2, arg3, var19, var12, var13, var51, arg6 == 11 ? 256 : 0, var22, var24);
            }
            if (var10.field2112 != 0) {
                arg9.method4085(arg2, arg3, var12, var13, var10.field2098);
            }
        } else if (arg6 >= 12) {
            class276 var26;
            if (var11 == -1 && var10.field2097 == null) {
                var26 = var10.method3613(arg6, arg5, var18, var20, var19, var21);
            } else {
                var26 = new class80(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method5019(arg0, arg2, arg3, var19, 1, 1, var26, 0, var22, var24);
            if (var10.field2112 != 0) {
                arg9.method4085(arg2, arg3, var12, var13, var10.field2098);
            }
        } else if (arg6 == 0) {
            class276 var27;
            if (var11 == -1 && var10.field2097 == null) {
                var27 = var10.method3613(0, arg5, var18, var20, var19, var21);
            } else {
                var27 = new class80(arg4, 0, arg5, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4986(arg0, arg2, arg3, var19, var27, (class276) null, field1015[arg5], 0, var22, var24);
            if (var10.field2112 != 0) {
                arg9.method4084(arg2, arg3, arg6, arg5, var10.field2098);
            }
        } else if (arg6 == 1) {
            class276 var28;
            if (var11 == -1 && var10.field2097 == null) {
                var28 = var10.method3613(1, arg5, var18, var20, var19, var21);
            } else {
                var28 = new class80(arg4, 1, arg5, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4986(arg0, arg2, arg3, var19, var28, (class276) null, field1016[arg5], 0, var22, var24);
            if (var10.field2112 != 0) {
                arg9.method4084(arg2, arg3, arg6, arg5, var10.field2098);
            }
        } else if (arg6 == 2) {
            int var29 = arg5 + 1 & 0x3;
            class276 var30;
            class276 var31;
            if (var11 == -1 && var10.field2097 == null) {
                var30 = var10.method3613(2, arg5 + 4, var18, var20, var19, var21);
                var31 = var10.method3613(2, var29, var18, var20, var19, var21);
            } else {
                var30 = new class80(arg4, 2, arg5 + 4, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
                var31 = new class80(arg4, 2, var29, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4986(arg0, arg2, arg3, var19, var30, var31, field1015[arg5], field1015[var29], var22, var24);
            if (var10.field2112 != 0) {
                arg9.method4084(arg2, arg3, arg6, arg5, var10.field2098);
            }
        } else if (arg6 == 3) {
            class276 var32;
            if (var11 == -1 && var10.field2097 == null) {
                var32 = var10.method3613(3, arg5, var18, var20, var19, var21);
            } else {
                var32 = new class80(arg4, 3, arg5, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4986(arg0, arg2, arg3, var19, var32, (class276) null, field1016[arg5], 0, var22, var24);
            if (var10.field2112 != 0) {
                arg9.method4084(arg2, arg3, arg6, arg5, var10.field2098);
            }
        } else if (arg6 == 9) {
            class276 var33;
            if (var11 == -1 && var10.field2097 == null) {
                var33 = var10.method3613(arg6, arg5, var18, var20, var19, var21);
            } else {
                var33 = new class80(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method5019(arg0, arg2, arg3, var19, 1, 1, var33, 0, var22, var24);
            if (var10.field2112 != 0) {
                arg9.method4085(arg2, arg3, var12, var13, var10.field2098);
            }
        } else if (arg6 == 4) {
            class276 var34;
            if (var11 == -1 && var10.field2097 == null) {
                var34 = var10.method3613(4, arg5, var18, var20, var19, var21);
            } else {
                var34 = new class80(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4995(arg0, arg2, arg3, var19, var34, (class276) null, field1015[arg5], 0, 0, 0, var22, var24);
        } else if (arg6 == 5) {
            int var35 = 16;
            long var36 = arg8.method4906(arg0, arg2, arg3);
            if (var36 != 0L) {
                var35 = class202.method3023(class284.method3222(var36)).field2119;
            }
            class276 var38;
            if (var11 == -1 && var10.field2097 == null) {
                var38 = var10.method3613(4, arg5, var18, var20, var19, var21);
            } else {
                var38 = new class80(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4995(arg0, arg2, arg3, var19, var38, (class276) null, field1015[arg5], 0, field1019[arg5] * var35, field1018[arg5] * var35, var22, var24);
        } else if (arg6 == 6) {
            int var39 = 8;
            long var40 = arg8.method4906(arg0, arg2, arg3);
            if (var40 != 0L) {
                var39 = class202.method3023(class284.method3222(var40)).field2119 / 2;
            }
            class276 var42;
            if (var11 == -1 && var10.field2097 == null) {
                var42 = var10.method3613(4, arg5 + 4, var18, var20, var19, var21);
            } else {
                var42 = new class80(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4995(arg0, arg2, arg3, var19, var42, (class276) null, 256, arg5, field1011[arg5] * var39, field1008[arg5] * var39, var22, var24);
        } else if (arg6 == 7) {
            int var43 = arg5 + 2 & 0x3;
            class276 var44;
            if (var11 == -1 && var10.field2097 == null) {
                var44 = var10.method3613(4, var43 + 4, var18, var20, var19, var21);
            } else {
                var44 = new class80(arg4, 4, var43 + 4, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4995(arg0, arg2, arg3, var19, var44, (class276) null, 256, var43, 0, 0, var22, var24);
        } else if (arg6 == 8) {
            int var45 = 8;
            long var46 = arg8.method4906(arg0, arg2, arg3);
            if (var46 != 0L) {
                var45 = class202.method3023(class284.method3222(var46)).field2119 / 2;
            }
            int var48 = arg5 + 2 & 0x3;
            class276 var49;
            class276 var50;
            if (var11 == -1 && var10.field2097 == null) {
                var49 = var10.method3613(4, arg5 + 4, var18, var20, var19, var21);
                var50 = var10.method3613(4, var48 + 4, var18, var20, var19, var21);
            } else {
                var49 = new class80(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
                var50 = new class80(arg4, 4, var48 + 4, arg1, arg2, arg3, var11, var10.field2144, (class276) null);
            }
            arg8.method4995(arg0, arg2, arg3, var19, var49, var50, 256, arg5, field1011[arg5] * var45, field1008[arg5] * var45, var22, var24);
        }
    }
}
