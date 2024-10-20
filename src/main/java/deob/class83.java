package deob;

@ObfuscatedName("dl")
public final class class83 {

    @ObfuscatedName("dl.aq")
    public static int[][][] field1049 = new int[4][105][105];

    @ObfuscatedName("dl.aw")
    public static byte[][][] field1048 = new byte[4][104][104];

    @ObfuscatedName("dl.al")
    public static int field1052 = 99;

    @ObfuscatedName("dl.ad")
    public static final int[] field1061 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("dl.at")
    public static final int[] field1057 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("dl.ay")
    public static final int[] field1054 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("dl.ae")
    public static final int[] field1055 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("dl.ac")
    public static final int[] field1056 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("dl.ab")
    public static final int[] field1047 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("dl.av")
    public static int field1058 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("dl.ap")
    public static int field1059 = (int) (Math.random() * 33.0D) - 16;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.aq(B)V")
    public static void method600() {
        field1052 = 99;
        Statics.field4443 = new short[4][104][104];
        Statics.field4774 = new short[4][104][104];
        Statics.field1846 = new byte[4][104][104];
        Statics.field3877 = new byte[4][104][104];
        Statics.field1051 = new int[4][105][105];
        Statics.field1709 = new byte[4][105][105];
        Statics.field1050 = new int[105][105];
        Statics.field3892 = new int[104];
        Statics.field2355 = new int[104];
        Statics.field488 = new int[104];
        Statics.field1924 = new int[104];
        Statics.field3539 = new int[104];
    }

    @ObfuscatedName("dq.aw(I)V")
    public static void method2264() {
        Statics.field4443 = (short[][][]) null;
        Statics.field4774 = (short[][][]) null;
        Statics.field1846 = (byte[][][]) null;
        Statics.field3877 = (byte[][][]) null;
        Statics.field1051 = (int[][][]) null;
        Statics.field1709 = (byte[][][]) null;
        Statics.field1050 = (int[][]) null;
        Statics.field3892 = null;
        Statics.field2355 = null;
        Statics.field488 = null;
        Statics.field1924 = null;
        Statics.field3539 = null;
    }

    @ObfuscatedName("cf.al(IIIIB)V")
    public static final void method2106(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1709[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1049[0][var5][var4] = field1049[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1049[0][var5][var4] = field1049[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1049[0][var5][var4] = field1049[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1049[0][var5][var4] = field1049[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("sv.ai([BIIII[Liz;B)V")
    public static final void method7960(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class230[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2445[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class534 var9 = new class534(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    method3336(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("ay.ar([BIIIIIIIII[Liz;I)V")
    public static final void method264(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class230[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2445[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class534 var13 = new class534(arg0);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
                        int var17 = arg2 + class343.method2103(var15 & 0x7, var16 & 0x7, arg7);
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
                        method3336(var13, arg1, var17, var24, var25, var26, arg7);
                    } else {
                        method3336(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bk.as(IIII)V")
    public static final void method449(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1049[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1049[arg0][arg1][arg2 + var5] = field1049[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1049[arg0][arg1 + var6][arg2] = field1049[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1049[arg0][arg1 - 1][arg2] != 0) {
            field1049[arg0][arg1][arg2] = field1049[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1049[arg0][arg1][arg2 - 1] != 0) {
            field1049[arg0][arg1][arg2] = field1049[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1049[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1049[arg0][arg1][arg2] = field1049[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("hg.aa(Luq;IIIIIIB)V")
    public static final void method3336(class534 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class95.method3449(arg1, arg2, arg3)) {
            while (true) {
                int var16 = arg0.method8593();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method8591();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method8594();
                }
            }
            return;
        }
        field1048[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method8593();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field1049[0][arg2];
                    int var10 = arg4 + 932731;
                    int var11 = arg5 + 556238;
                    int var12 = method265(var10 + 45365, var11 + 91923, 4) - 128 + (method265(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method265(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field1049[arg1][arg2][arg3] = field1049[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method8591();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field1049[0][arg2][arg3] = -var15 * 8;
                } else {
                    field1049[arg1][arg2][arg3] = field1049[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field4774[arg1][arg2][arg3] = (short) arg0.method8594();
                Statics.field1846[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3877[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field1048[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field4443[arg1][arg2][arg3] = (short) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("eo.az([BIIB)Z")
    public static final boolean method2855(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class534 var4 = new class534(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8778();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8820();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8591() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class204 var16 = class204.method2849(var5);
                        if (var13 != 22 || !client.field716 || var16.field2145 != 0 || var16.field2135 == 1 || var16.field2140) {
                            if (!var16.method3593()) {
                                client.field622++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8820();
                if (var9 == 0) {
                    break;
                }
                var4.method8591();
            }
        }
    }

    @ObfuscatedName("gu.ao([BIILkq;[Liz;I)V")
    public static final void method3281(byte[] arg0, int arg1, int arg2, class276 arg3, class230[] arg4) {
        class534 var5 = new class534(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method8778();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method8820();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method8591();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1048[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class230 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method3697(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dl.au([BIIIIIIILkq;[Liz;)V")
    public static final void method2183(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class276 arg8, class230[] arg9) {
        class534 var10 = new class534(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method8778();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method8820();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method8591();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class204 var21 = class204.method2849(var11);
                    int var22 = arg2 + class343.method3443(var16 & 0x7, var15 & 0x7, arg7, var21.field2133, var21.field2134, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field2133;
                    int var28 = var21.field2134;
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
                        if ((field1048[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class230 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method3697(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hb.ak(IIIIIILkq;Liz;I)V")
    public static final void method3697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class276 arg6, class230 arg7) {
        if (client.field716 && (field1048[0][arg1][arg2] & 0x2) == 0 && (field1048[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1052) {
            field1052 = arg0;
        }
        class204 var8 = class204.method2849(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2134;
            var10 = var8.field2133;
        } else {
            var9 = var8.field2133;
            var10 = var8.field2134;
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
        int[][] var15 = field1049[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class286.method248(arg1, arg2, 2, var8.field2145 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2166 == 1) {
            var21 += 256;
        }
        if (var8.method3588()) {
            class71.method4622(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field716 || var8.field2145 != 0 || var8.field2135 == 1 || var8.field2140) {
                class278 var22;
                if (var8.field2141 == -1 && var8.field2159 == null) {
                    var22 = var8.method3594(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class81(arg3, 22, arg4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
                }
                arg6.method4895(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2135 == 1 && arg7 != null) {
                    arg7.method4082(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class278 var48;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var48 = var8.method3594(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class81(arg3, 10, arg4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            if (var48 != null && arg6.method4899(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2149) {
                int var49 = 15;
                if (var48 instanceof class285) {
                    var49 = ((class285) var48).method5174() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field1709[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field1709[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2135 != 0 && arg7 != null) {
                arg7.method4070(arg1, arg2, var9, var10, var8.field2136);
            }
        } else if (arg5 >= 12) {
            class278 var23;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var23 = var8.method3594(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class81(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method4899(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1051[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2135 != 0 && arg7 != null) {
                arg7.method4070(arg1, arg2, var9, var10, var8.field2136);
            }
        } else if (arg5 == 0) {
            class278 var24;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var24 = var8.method3594(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class81(arg3, 0, arg4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method5028(arg0, arg1, arg2, var16, var24, (class278) null, field1061[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2149) {
                    Statics.field1709[arg0][arg1][arg2] = 50;
                    Statics.field1709[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2169) {
                    Statics.field1051[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2149) {
                    Statics.field1709[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1709[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2169) {
                    Statics.field1051[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2149) {
                    Statics.field1709[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1709[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2169) {
                    Statics.field1051[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2149) {
                    Statics.field1709[arg0][arg1][arg2] = 50;
                    Statics.field1709[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2169) {
                    Statics.field1051[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2135 != 0 && arg7 != null) {
                arg7.method4102(arg1, arg2, arg5, arg4, var8.field2136);
            }
            if (var8.field2165 != 16) {
                arg6.method4905(arg0, arg1, arg2, var8.field2165);
            }
        } else if (arg5 == 1) {
            class278 var25;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var25 = var8.method3594(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class81(arg3, 1, arg4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method5028(arg0, arg1, arg2, var16, var25, (class278) null, field1057[arg4], 0, var19, var21);
            if (var8.field2149) {
                if (arg4 == 0) {
                    Statics.field1709[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1709[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1709[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1709[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2135 != 0 && arg7 != null) {
                arg7.method4102(arg1, arg2, arg5, arg4, var8.field2136);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class278 var27;
            class278 var28;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var27 = var8.method3594(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3594(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class81(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
                var28 = new class81(arg3, 2, var26, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method5028(arg0, arg1, arg2, var16, var27, var28, field1061[arg4], field1061[var26], var19, var21);
            if (var8.field2169) {
                if (arg4 == 0) {
                    Statics.field1051[arg0][arg1][arg2] |= 0x249;
                    Statics.field1051[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1051[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1051[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1051[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1051[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1051[arg0][arg1][arg2] |= 0x492;
                    Statics.field1051[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2135 != 0 && arg7 != null) {
                arg7.method4102(arg1, arg2, arg5, arg4, var8.field2136);
            }
            if (var8.field2165 != 16) {
                arg6.method4905(arg0, arg1, arg2, var8.field2165);
            }
        } else if (arg5 == 3) {
            class278 var29;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var29 = var8.method3594(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class81(arg3, 3, arg4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method5028(arg0, arg1, arg2, var16, var29, (class278) null, field1057[arg4], 0, var19, var21);
            if (var8.field2149) {
                if (arg4 == 0) {
                    Statics.field1709[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1709[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1709[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1709[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2135 != 0 && arg7 != null) {
                arg7.method4102(arg1, arg2, arg5, arg4, var8.field2136);
            }
        } else if (arg5 == 9) {
            class278 var30;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var30 = var8.method3594(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class81(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method4899(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2135 != 0 && arg7 != null) {
                arg7.method4070(arg1, arg2, var9, var10, var8.field2136);
            }
            if (var8.field2165 != 16) {
                arg6.method4905(arg0, arg1, arg2, var8.field2165);
            }
        } else if (arg5 == 4) {
            class278 var31;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var31 = var8.method3594(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class81(arg3, 4, arg4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method4898(arg0, arg1, arg2, var16, var31, (class278) null, field1061[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4915(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class204.method2849(class286.method1110(var33)).field2165;
            }
            class278 var35;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var35 = var8.method3594(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class81(arg3, 4, arg4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method4898(arg0, arg1, arg2, var16, var35, (class278) null, field1061[arg4], 0, field1054[arg4] * var32, field1055[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4915(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class204.method2849(class286.method1110(var37)).field2165 / 2;
            }
            class278 var39;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var39 = var8.method3594(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class81(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method4898(arg0, arg1, arg2, var16, var39, (class278) null, 256, arg4, field1056[arg4] * var36, field1047[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class278 var41;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var41 = var8.method3594(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class81(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method4898(arg0, arg1, arg2, var16, var41, (class278) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4915(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class204.method2849(class286.method1110(var43)).field2165 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class278 var46;
            class278 var47;
            if (var8.field2141 == -1 && var8.field2159 == null) {
                var46 = var8.method3594(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3594(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class81(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
                var47 = new class81(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2141, var8.field2168, (class278) null);
            }
            arg6.method4898(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1056[arg4] * var42, field1047[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("ch.ah(Lkq;[Liz;I)V")
    public static final void method999(class276 arg0, class230[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1048[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1048[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method4071(var3, var4);
                        }
                    }
                }
            }
        }
        field1058 += (int) (Math.random() * 5.0D) - 2;
        if (field1058 < -8) {
            field1058 = -8;
        }
        if (field1058 > 8) {
            field1058 = 8;
        }
        field1059 += (int) (Math.random() * 5.0D) - 2;
        if (field1059 < -16) {
            field1059 = -16;
        }
        if (field1059 > 16) {
            field1059 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1709[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1049[var6][var16 + 1][var15] - field1049[var6][var16 - 1][var15];
                    int var18 = field1049[var6][var16][var15 + 1] - field1049[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field1050[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field3892[var25] = 0;
                Statics.field2355[var25] = 0;
                Statics.field488[var25] = 0;
                Statics.field1924[var25] = 0;
                Statics.field3539[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        long var29 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var31 = (int) var29;
                        int var32 = Statics.field4443[var6][var28][var27] & var31;
                        if (var32 > 0) {
                            class196 var33 = Statics.method1133(var32 - 1);
                            Statics.field3892[var27] += var33.field2054;
                            Statics.field2355[var27] += var33.field2055;
                            Statics.field488[var27] += var33.field2056;
                            Statics.field1924[var27] += var33.field2057;
                            var10002 = Statics.field3539[var27]++;
                        }
                    }
                    int var34 = var26 - 5;
                    if (var34 >= 0 && var34 < 104) {
                        long var35 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var37 = (int) var35;
                        int var38 = Statics.field4443[var6][var34][var27] & var37;
                        if (var38 > 0) {
                            class196 var39 = Statics.method1133(var38 - 1);
                            Statics.field3892[var27] -= var39.field2054;
                            Statics.field2355[var27] -= var39.field2055;
                            Statics.field488[var27] -= var39.field2056;
                            Statics.field1924[var27] -= var39.field2057;
                            var10002 = Statics.field3539[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    int var44 = 0;
                    for (int var45 = -5; var45 < 109; var45++) {
                        int var46 = var45 + 5;
                        if (var46 >= 0 && var46 < 104) {
                            var40 += Statics.field3892[var46];
                            var41 += Statics.field2355[var46];
                            var42 += Statics.field488[var46];
                            var43 += Statics.field1924[var46];
                            var44 += Statics.field3539[var46];
                        }
                        int var47 = var45 - 5;
                        if (var47 >= 0 && var47 < 104) {
                            var40 -= Statics.field3892[var47];
                            var41 -= Statics.field2355[var47];
                            var42 -= Statics.field488[var47];
                            var43 -= Statics.field1924[var47];
                            var44 -= Statics.field3539[var47];
                        }
                        if (var45 >= 1 && var45 < 103 && (!client.field716 || (field1048[0][var26][var45] & 0x2) != 0 || (field1048[var6][var26][var45] & 0x10) == 0)) {
                            if (var6 < field1052) {
                                field1052 = var6;
                            }
                            long var48 = (long) Math.pow(2.0D, 15.0D) - 1L;
                            int var50 = (int) var48;
                            int var51 = Statics.field4443[var6][var26][var45] & var50;
                            int var52 = Statics.field4774[var6][var26][var45] & var50;
                            if (var51 > 0 || var52 > 0) {
                                int var53 = field1049[var6][var26][var45];
                                int var54 = field1049[var6][var26 + 1][var45];
                                int var55 = field1049[var6][var26 + 1][var45 + 1];
                                int var56 = field1049[var6][var26][var45 + 1];
                                int var57 = Statics.field1050[var26][var45];
                                int var58 = Statics.field1050[var26 + 1][var45];
                                int var59 = Statics.field1050[var26 + 1][var45 + 1];
                                int var60 = Statics.field1050[var26][var45 + 1];
                                int var61 = -1;
                                int var62 = -1;
                                if (var51 > 0) {
                                    int var63 = var40 * 256 / var43;
                                    int var64 = var41 / var44;
                                    int var65 = var42 / var44;
                                    var61 = method420(var63, var64, var65);
                                    int var66 = field1058 + var63 & 0xFF;
                                    int var67 = field1059 + var65;
                                    if (var67 < 0) {
                                        var67 = 0;
                                    } else if (var67 > 255) {
                                        var67 = 255;
                                    }
                                    var62 = method420(var66, var64, var67);
                                }
                                if (var6 > 0) {
                                    boolean var68 = true;
                                    if (var51 == 0 && Statics.field1846[var6][var26][var45] != 0) {
                                        var68 = false;
                                    }
                                    if (var52 > 0) {
                                        int var69 = var52 - 1;
                                        class206 var70 = (class206) class206.field2238.method5414((long) var69);
                                        class206 var71;
                                        if (var70 == null) {
                                            byte[] var72 = Statics.field2245.method6489(4, var69);
                                            class206 var73 = new class206();
                                            if (var72 != null) {
                                                var73.method3700(new class534(var72), var69);
                                            }
                                            var73.method3699();
                                            class206.field2238.method5421(var73, (long) var69);
                                            var71 = var73;
                                        } else {
                                            var71 = var70;
                                        }
                                        if (!var71.field2234) {
                                            var68 = false;
                                        }
                                    }
                                    if (var68 && var53 == var54 && var53 == var55 && var53 == var56) {
                                        Statics.field1051[var6][var26][var45] |= 0x924;
                                    }
                                }
                                int var74 = 0;
                                if (var62 != -1) {
                                    var74 = class272.field2817[method290(var62, 96)];
                                }
                                if (var52 == 0) {
                                    arg0.method4894(var6, var26, var45, 0, 0, -1, var53, var54, var55, var56, method290(var61, var57), method290(var61, var58), method290(var61, var59), method290(var61, var60), 0, 0, 0, 0, var74, 0);
                                } else {
                                    int var75 = Statics.field1846[var6][var26][var45] + 1;
                                    byte var76 = Statics.field3877[var6][var26][var45];
                                    int var77 = var52 - 1;
                                    class206 var78 = (class206) class206.field2238.method5414((long) var77);
                                    class206 var79;
                                    if (var78 == null) {
                                        byte[] var80 = Statics.field2245.method6489(4, var77);
                                        class206 var81 = new class206();
                                        if (var80 != null) {
                                            var81.method3700(new class534(var80), var77);
                                        }
                                        var81.method3699();
                                        class206.field2238.method5421(var81, (long) var77);
                                        var79 = var81;
                                    } else {
                                        var79 = var78;
                                    }
                                    int var83 = var79.field2237;
                                    int var84;
                                    int var85;
                                    if (var83 >= 0) {
                                        var84 = class272.field2821.field3091.method5107(var83);
                                        var85 = -1;
                                    } else if (var79.field2236 == 16711935) {
                                        var85 = -2;
                                        var83 = -1;
                                        var84 = -2;
                                    } else {
                                        var85 = method420(var79.field2240, var79.field2241, var79.field2242);
                                        int var86 = field1058 + var79.field2240 & 0xFF;
                                        int var87 = field1059 + var79.field2242;
                                        if (var87 < 0) {
                                            var87 = 0;
                                        } else if (var87 > 255) {
                                            var87 = 255;
                                        }
                                        var84 = method420(var86, var79.field2241, var87);
                                    }
                                    int var88 = 0;
                                    if (var84 != -2) {
                                        var88 = class272.field2817[method7982(var84, 96)];
                                    }
                                    if (var79.field2246 != -1) {
                                        int var89 = field1058 + var79.field2243 & 0xFF;
                                        int var90 = field1059 + var79.field2239;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        int var91 = method420(var89, var79.field2244, var90);
                                        var88 = class272.field2817[method7982(var91, 96)];
                                    }
                                    arg0.method4894(var6, var26, var45, var75, var76, var83, var53, var54, var55, var56, method290(var61, var57), method290(var61, var58), method290(var61, var59), method290(var61, var60), method7982(var85, var57), method7982(var85, var58), method7982(var85, var59), method7982(var85, var60), var74, var88);
                                }
                            }
                        }
                    }
                }
            }
            for (int var92 = 1; var92 < 103; var92++) {
                for (int var93 = 1; var93 < 103; var93++) {
                    arg0.method4927(var6, var93, var92, method4108(var6, var93, var92));
                }
            }
            Statics.field4443[var6] = (short[][]) null;
            Statics.field4774[var6] = (short[][]) null;
            Statics.field1846[var6] = (byte[][]) null;
            Statics.field3877[var6] = (byte[][]) null;
            Statics.field1709[var6] = (byte[][]) null;
        }
        arg0.method4920(-50, -10, -50);
        for (int var94 = 0; var94 < 104; var94++) {
            for (int var95 = 0; var95 < 104; var95++) {
                if ((field1048[1][var94][var95] & 0x2) == 2) {
                    arg0.method4891(var94, var95);
                }
            }
        }
        int var96 = 1;
        int var97 = 2;
        int var98 = 4;
        for (int var99 = 0; var99 < 4; var99++) {
            if (var99 > 0) {
                var96 <<= 0x3;
                var97 <<= 0x3;
                var98 <<= 0x3;
            }
            for (int var100 = 0; var100 <= var99; var100++) {
                for (int var101 = 0; var101 <= 104; var101++) {
                    for (int var102 = 0; var102 <= 104; var102++) {
                        if ((Statics.field1051[var100][var102][var101] & var96) != 0) {
                            int var103 = var101;
                            int var104 = var101;
                            int var105 = var100;
                            int var106 = var100;
                            while (var103 > 0 && (Statics.field1051[var100][var102][var103 - 1] & var96) != 0) {
                                var103--;
                            }
                            while (var104 < 104 && (Statics.field1051[var100][var102][var104 + 1] & var96) != 0) {
                                var104++;
                            }
                            label355: while (var105 > 0) {
                                for (int var107 = var103; var107 <= var104; var107++) {
                                    if ((Statics.field1051[var105 - 1][var102][var107] & var96) == 0) {
                                        break label355;
                                    }
                                }
                                var105--;
                            }
                            label344: while (var106 < var99) {
                                for (int var108 = var103; var108 <= var104; var108++) {
                                    if ((Statics.field1051[var106 + 1][var102][var108] & var96) == 0) {
                                        break label344;
                                    }
                                }
                                var106++;
                            }
                            int var109 = (var106 + 1 - var105) * (var104 - var103 + 1);
                            if (var109 >= 8) {
                                short var110 = 240;
                                int var111 = field1049[var106][var102][var103] - var110;
                                int var112 = field1049[var105][var102][var103];
                                class276.method4892(var99, 1, var102 * 128, var102 * 128, var103 * 128, var104 * 128 + 128, var111, var112);
                                for (int var113 = var105; var113 <= var106; var113++) {
                                    for (int var114 = var103; var114 <= var104; var114++) {
                                        Statics.field1051[var113][var102][var114] &= ~var96;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1051[var100][var102][var101] & var97) != 0) {
                            int var115 = var102;
                            int var116 = var102;
                            int var117 = var100;
                            int var118 = var100;
                            while (var115 > 0 && (Statics.field1051[var100][var115 - 1][var101] & var97) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field1051[var100][var116 + 1][var101] & var97) != 0) {
                                var116++;
                            }
                            label408: while (var117 > 0) {
                                for (int var119 = var115; var119 <= var116; var119++) {
                                    if ((Statics.field1051[var117 - 1][var119][var101] & var97) == 0) {
                                        break label408;
                                    }
                                }
                                var117--;
                            }
                            label397: while (var118 < var99) {
                                for (int var120 = var115; var120 <= var116; var120++) {
                                    if ((Statics.field1051[var118 + 1][var120][var101] & var97) == 0) {
                                        break label397;
                                    }
                                }
                                var118++;
                            }
                            int var121 = (var118 + 1 - var117) * (var116 - var115 + 1);
                            if (var121 >= 8) {
                                short var122 = 240;
                                int var123 = field1049[var118][var115][var101] - var122;
                                int var124 = field1049[var117][var115][var101];
                                class276.method4892(var99, 2, var115 * 128, var116 * 128 + 128, var101 * 128, var101 * 128, var123, var124);
                                for (int var125 = var117; var125 <= var118; var125++) {
                                    for (int var126 = var115; var126 <= var116; var126++) {
                                        Statics.field1051[var125][var126][var101] &= ~var97;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1051[var100][var102][var101] & var98) != 0) {
                            int var127 = var102;
                            int var128 = var102;
                            int var129 = var101;
                            int var130 = var101;
                            while (var129 > 0 && (Statics.field1051[var100][var102][var129 - 1] & var98) != 0) {
                                var129--;
                            }
                            while (var130 < 104 && (Statics.field1051[var100][var102][var130 + 1] & var98) != 0) {
                                var130++;
                            }
                            label461: while (var127 > 0) {
                                for (int var131 = var129; var131 <= var130; var131++) {
                                    if ((Statics.field1051[var100][var127 - 1][var131] & var98) == 0) {
                                        break label461;
                                    }
                                }
                                var127--;
                            }
                            label450: while (var128 < 104) {
                                for (int var132 = var129; var132 <= var130; var132++) {
                                    if ((Statics.field1051[var100][var128 + 1][var132] & var98) == 0) {
                                        break label450;
                                    }
                                }
                                var128++;
                            }
                            if ((var128 - var127 + 1) * (var130 - var129 + 1) >= 4) {
                                int var133 = field1049[var100][var127][var129];
                                class276.method4892(var99, 4, var127 * 128, var128 * 128 + 128, var129 * 128, var130 * 128 + 128, var133, var133);
                                for (int var134 = var127; var134 <= var128; var134++) {
                                    for (int var135 = var129; var135 <= var130; var135++) {
                                        Statics.field1051[var100][var134][var135] &= ~var98;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ih.aj(IIII)I")
    public static int method4108(int arg0, int arg1, int arg2) {
        if ((field1048[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field1048[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ay.af(IIII)I")
    public static final int method265(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1034(var3, var5);
        int var8 = method1034(var3 + 1, var5);
        int var9 = method1034(var3, var5 + 1);
        int var10 = method1034(var3 + 1, var5 + 1);
        int var11 = Statics.method2867(var7, var8, var4, arg2);
        int var12 = Statics.method2867(var9, var10, var4, arg2);
        return Statics.method2867(var11, var12, var6, arg2);
    }

    @ObfuscatedName("cn.an(III)I")
    public static final int method1034(int arg0, int arg1) {
        int var2 = method3833(arg0 - 1, arg1 - 1) + method3833(arg0 + 1, arg1 - 1) + method3833(arg0 - 1, arg1 + 1) + method3833(arg0 + 1, arg1 + 1);
        int var3 = method3833(arg0 - 1, arg1) + method3833(arg0 + 1, arg1) + method3833(arg0, arg1 - 1) + method3833(arg0, arg1 + 1);
        int var4 = method3833(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("il.ag(III)I")
    public static final int method3833(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ab.am(III)I")
    public static final int method290(int arg0, int arg1) {
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

    @ObfuscatedName("sl.ad(III)I")
    public static final int method7982(int arg0, int arg1) {
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

    @ObfuscatedName("ba.at(IIII)I")
    public static final int method420(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("jy.ay(III)Z")
    public static final boolean method4204(int arg0, int arg1) {
        class204 var2 = class204.method2849(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3592(arg1);
    }
}
