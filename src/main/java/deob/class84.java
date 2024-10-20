package deob;

@ObfuscatedName("dq")
public final class class84 {

    @ObfuscatedName("dq.ac")
    public static int[][][] field1042 = new int[4][105][105];

    @ObfuscatedName("dq.al")
    public static byte[][][] field1032 = new byte[4][104][104];

    @ObfuscatedName("dq.ak")
    public static int field1033 = 99;

    @ObfuscatedName("dq.ai")
    public static final int[] field1037 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("dq.ae")
    public static final int[] field1038 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("dq.aw")
    public static final int[] field1039 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("dq.aq")
    public static final int[] field1034 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("dq.az")
    public static final int[] field1041 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("dq.at")
    public static final int[] field1043 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("dq.af")
    public static int field1031 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("dq.ad")
    public static int field1044 = (int) (Math.random() * 33.0D) - 16;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hy.ac(I)V")
    public static void method3293() {
        field1033 = 99;
        Statics.field842 = new short[4][104][104];
        Statics.field2821 = new short[4][104][104];
        Statics.field998 = new byte[4][104][104];
        Statics.field2005 = new byte[4][104][104];
        Statics.field1487 = new int[4][105][105];
        Statics.field1046 = new byte[4][105][105];
        Statics.field1740 = new int[105][105];
        Statics.field1003 = new int[104];
        Statics.field1597 = new int[104];
        Statics.field1035 = new int[104];
        Statics.field2922 = new int[104];
        Statics.field1009 = new int[104];
    }

    @ObfuscatedName("eu.al(I)V")
    public static void method2798() {
        Statics.field842 = (short[][][]) null;
        Statics.field2821 = (short[][][]) null;
        Statics.field998 = (byte[][][]) null;
        Statics.field2005 = (byte[][][]) null;
        Statics.field1487 = (int[][][]) null;
        Statics.field1046 = (byte[][][]) null;
        Statics.field1740 = (int[][]) null;
        Statics.field1003 = null;
        Statics.field1597 = null;
        Statics.field1035 = null;
        Statics.field2922 = null;
        Statics.field1009 = null;
    }

    @ObfuscatedName("cg.ak(IIIII)V")
    public static final void method1059(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1046[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1042[0][var5][var4] = field1042[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1042[0][var5][var4] = field1042[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1042[0][var5][var4] = field1042[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1042[0][var5][var4] = field1042[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("rj.ax([BIIII[Lih;I)V")
    public static final void method7478(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class228[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2397[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class530 var9 = new class530(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    Statics.method2592(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("eb.ao([BIIIIIIIII[Lih;B)V")
    public static final void method2767(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class228[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2397[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class530 var13 = new class530(arg0);
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
                        int var24 = arg3 + class341.method2980(var15 & 0x7, var16 & 0x7, arg7);
                        int var25 = (var15 & 0x7) + arg2 + arg8;
                        int var26 = (var16 & 0x7) + arg3 + arg9;
                        Statics.method2592(var13, arg1, var23, var24, var25, var26, arg7);
                    } else {
                        Statics.method2592(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.ah(IIIB)V")
    public static final void method13(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1042[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1042[arg0][arg1][arg2 + var5] = field1042[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1042[arg0][arg1 + var6][arg2] = field1042[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1042[arg0][arg1 - 1][arg2] != 0) {
            field1042[arg0][arg1][arg2] = field1042[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1042[arg0][arg1][arg2 - 1] != 0) {
            field1042[arg0][arg1][arg2] = field1042[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1042[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1042[arg0][arg1][arg2] = field1042[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("iv.ab([BIIS)Z")
    public static final boolean method3529(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class530 var4 = new class530(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8458();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8526();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8365() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class220 var16 = Statics.method2243(var5);
                        if (var13 != 22 || !client.field748 || var16.field2210 != 0 || var16.field2208 == 1 || var16.field2229) {
                            if (!var16.method3691()) {
                                client.field591++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8526();
                if (var9 == 0) {
                    break;
                }
                var4.method8365();
            }
        }
    }

    @ObfuscatedName("uy.am([BIILjt;[Lih;I)V")
    public static final void method8305(byte[] arg0, int arg1, int arg2, class245 arg3, class228[] arg4) {
        class530 var5 = new class530(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method8458();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method8526();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method8365();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1032[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class228 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method5333(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dq.av([BIIIIIIILjt;[Lih;)V")
    public static final void method2132(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class245 arg8, class228[] arg9) {
        class530 var10 = new class530(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method8458();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method8526();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method8365();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class220 var21 = Statics.method2243(var11);
                    int var22 = arg2 + class341.method3012(var16 & 0x7, var15 & 0x7, arg7, var21.field2206, var21.field2207, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field2206;
                    int var28 = var21.field2207;
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
                        if ((field1032[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class228 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method5333(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("mj.ag(IIIIIILjt;Lih;I)V")
    public static final void method5333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class245 arg6, class228 arg7) {
        if (client.field748 && (field1032[0][arg1][arg2] & 0x2) == 0 && (field1032[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1033) {
            field1033 = arg0;
        }
        class220 var8 = Statics.method2243(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2207;
            var10 = var8.field2206;
        } else {
            var9 = var8.field2206;
            var10 = var8.field2207;
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
        int[][] var15 = field1042[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class255.method6416(arg1, arg2, 2, var8.field2210 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2231 == 1) {
            var21 += 256;
        }
        if (var8.method3699()) {
            class71.method2381(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field748 || var8.field2210 != 0 || var8.field2208 == 1 || var8.field2229) {
                class247 var22;
                if (var8.field2214 == -1 && var8.field2232 == null) {
                    var22 = var8.method3692(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class82(arg3, 22, arg4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
                }
                arg6.method4300(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2208 == 1 && arg7 != null) {
                    arg7.method3947(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class247 var48;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var48 = var8.method3692(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class82(arg3, 10, arg4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            if (var48 != null && arg6.method4351(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2225) {
                int var49 = 15;
                if (var48 instanceof class254) {
                    var49 = ((class254) var48).method4545() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field1046[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field1046[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2208 != 0 && arg7 != null) {
                arg7.method3945(arg1, arg2, var9, var10, var8.field2234);
            }
        } else if (arg5 >= 12) {
            class247 var23;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var23 = var8.method3692(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class82(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4351(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1487[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2208 != 0 && arg7 != null) {
                arg7.method3945(arg1, arg2, var9, var10, var8.field2234);
            }
        } else if (arg5 == 0) {
            class247 var24;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var24 = var8.method3692(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class82(arg3, 0, arg4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4302(arg0, arg1, arg2, var16, var24, (class247) null, field1037[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2225) {
                    Statics.field1046[arg0][arg1][arg2] = 50;
                    Statics.field1046[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2194) {
                    Statics.field1487[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2225) {
                    Statics.field1046[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1046[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2194) {
                    Statics.field1487[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2225) {
                    Statics.field1046[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1046[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2194) {
                    Statics.field1487[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2225) {
                    Statics.field1046[arg0][arg1][arg2] = 50;
                    Statics.field1046[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2194) {
                    Statics.field1487[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2208 != 0 && arg7 != null) {
                arg7.method3974(arg1, arg2, arg5, arg4, var8.field2234);
            }
            if (var8.field2215 != 16) {
                arg6.method4361(arg0, arg1, arg2, var8.field2215);
            }
        } else if (arg5 == 1) {
            class247 var25;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var25 = var8.method3692(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class82(arg3, 1, arg4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4302(arg0, arg1, arg2, var16, var25, (class247) null, field1038[arg4], 0, var19, var21);
            if (var8.field2225) {
                if (arg4 == 0) {
                    Statics.field1046[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1046[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1046[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1046[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2208 != 0 && arg7 != null) {
                arg7.method3974(arg1, arg2, arg5, arg4, var8.field2234);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class247 var27;
            class247 var28;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var27 = var8.method3692(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3692(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class82(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
                var28 = new class82(arg3, 2, var26, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4302(arg0, arg1, arg2, var16, var27, var28, field1037[arg4], field1037[var26], var19, var21);
            if (var8.field2194) {
                if (arg4 == 0) {
                    Statics.field1487[arg0][arg1][arg2] |= 0x249;
                    Statics.field1487[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1487[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1487[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1487[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1487[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1487[arg0][arg1][arg2] |= 0x492;
                    Statics.field1487[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2208 != 0 && arg7 != null) {
                arg7.method3974(arg1, arg2, arg5, arg4, var8.field2234);
            }
            if (var8.field2215 != 16) {
                arg6.method4361(arg0, arg1, arg2, var8.field2215);
            }
        } else if (arg5 == 3) {
            class247 var29;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var29 = var8.method3692(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class82(arg3, 3, arg4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4302(arg0, arg1, arg2, var16, var29, (class247) null, field1038[arg4], 0, var19, var21);
            if (var8.field2225) {
                if (arg4 == 0) {
                    Statics.field1046[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1046[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1046[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1046[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2208 != 0 && arg7 != null) {
                arg7.method3974(arg1, arg2, arg5, arg4, var8.field2234);
            }
        } else if (arg5 == 9) {
            class247 var30;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var30 = var8.method3692(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class82(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4351(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2208 != 0 && arg7 != null) {
                arg7.method3945(arg1, arg2, var9, var10, var8.field2234);
            }
            if (var8.field2215 != 16) {
                arg6.method4361(arg0, arg1, arg2, var8.field2215);
            }
        } else if (arg5 == 4) {
            class247 var31;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var31 = var8.method3692(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class82(arg3, 4, arg4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4303(arg0, arg1, arg2, var16, var31, (class247) null, field1037[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4332(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = Statics.method2243(class255.method2100(var33)).field2215;
            }
            class247 var35;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var35 = var8.method3692(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class82(arg3, 4, arg4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4303(arg0, arg1, arg2, var16, var35, (class247) null, field1037[arg4], 0, field1039[arg4] * var32, field1034[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4332(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = Statics.method2243(class255.method2100(var37)).field2215 / 2;
            }
            class247 var39;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var39 = var8.method3692(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class82(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4303(arg0, arg1, arg2, var16, var39, (class247) null, 256, arg4, field1041[arg4] * var36, field1043[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class247 var41;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var41 = var8.method3692(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class82(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4303(arg0, arg1, arg2, var16, var41, (class247) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4332(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = Statics.method2243(class255.method2100(var43)).field2215 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class247 var46;
            class247 var47;
            if (var8.field2214 == -1 && var8.field2232 == null) {
                var46 = var8.method3692(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3692(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class82(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
                var47 = new class82(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2214, var8.field2240, (class247) null);
            }
            arg6.method4303(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1041[arg4] * var42, field1043[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("sa.aa(Ljt;[Lih;B)V")
    public static final void method7764(class245 arg0, class228[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1032[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1032[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3946(var3, var4);
                        }
                    }
                }
            }
        }
        field1031 += (int) (Math.random() * 5.0D) - 2;
        if (field1031 < -8) {
            field1031 = -8;
        }
        if (field1031 > 8) {
            field1031 = 8;
        }
        field1044 += (int) (Math.random() * 5.0D) - 2;
        if (field1044 < -16) {
            field1044 = -16;
        }
        if (field1044 > 16) {
            field1044 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1046[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1042[var6][var16 + 1][var15] - field1042[var6][var16 - 1][var15];
                    int var18 = field1042[var6][var16][var15 + 1] - field1042[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field1740[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field1003[var25] = 0;
                Statics.field1597[var25] = 0;
                Statics.field1035[var25] = 0;
                Statics.field2922[var25] = 0;
                Statics.field1009[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        long var29 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var31 = (int) var29;
                        int var32 = Statics.field842[var6][var28][var27] & var31;
                        if (var32 > 0) {
                            class212 var33 = class212.method3401(var32 - 1);
                            Statics.field1003[var27] += var33.field2136;
                            Statics.field1597[var27] += var33.field2134;
                            Statics.field1035[var27] += var33.field2135;
                            Statics.field2922[var27] += var33.field2133;
                            var10002 = Statics.field1009[var27]++;
                        }
                    }
                    int var34 = var26 - 5;
                    if (var34 >= 0 && var34 < 104) {
                        long var35 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var37 = (int) var35;
                        int var38 = Statics.field842[var6][var34][var27] & var37;
                        if (var38 > 0) {
                            class212 var39 = class212.method3401(var38 - 1);
                            Statics.field1003[var27] -= var39.field2136;
                            Statics.field1597[var27] -= var39.field2134;
                            Statics.field1035[var27] -= var39.field2135;
                            Statics.field2922[var27] -= var39.field2133;
                            var10002 = Statics.field1009[var27]--;
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
                            var40 += Statics.field1003[var46];
                            var41 += Statics.field1597[var46];
                            var42 += Statics.field1035[var46];
                            var43 += Statics.field2922[var46];
                            var44 += Statics.field1009[var46];
                        }
                        int var47 = var45 - 5;
                        if (var47 >= 0 && var47 < 104) {
                            var40 -= Statics.field1003[var47];
                            var41 -= Statics.field1597[var47];
                            var42 -= Statics.field1035[var47];
                            var43 -= Statics.field2922[var47];
                            var44 -= Statics.field1009[var47];
                        }
                        if (var45 >= 1 && var45 < 103 && (!client.field748 || (field1032[0][var26][var45] & 0x2) != 0 || (field1032[var6][var26][var45] & 0x10) == 0)) {
                            if (var6 < field1033) {
                                field1033 = var6;
                            }
                            long var48 = (long) Math.pow(2.0D, 15.0D) - 1L;
                            int var50 = (int) var48;
                            int var51 = Statics.field842[var6][var26][var45] & var50;
                            int var52 = Statics.field2821[var6][var26][var45] & var50;
                            if (var51 > 0 || var52 > 0) {
                                int var53 = field1042[var6][var26][var45];
                                int var54 = field1042[var6][var26 + 1][var45];
                                int var55 = field1042[var6][var26 + 1][var45 + 1];
                                int var56 = field1042[var6][var26][var45 + 1];
                                int var57 = Statics.field1740[var26][var45];
                                int var58 = Statics.field1740[var26 + 1][var45];
                                int var59 = Statics.field1740[var26 + 1][var45 + 1];
                                int var60 = Statics.field1740[var26][var45 + 1];
                                int var61 = -1;
                                int var62 = -1;
                                if (var51 > 0) {
                                    int var63 = var40 * 256 / var43;
                                    int var64 = var41 / var44;
                                    int var65 = var42 / var44;
                                    var61 = method3445(var63, var64, var65);
                                    int var66 = field1031 + var63 & 0xFF;
                                    int var67 = field1044 + var65;
                                    if (var67 < 0) {
                                        var67 = 0;
                                    } else if (var67 > 255) {
                                        var67 = 255;
                                    }
                                    var62 = method3445(var66, var64, var67);
                                }
                                if (var6 > 0) {
                                    boolean var68 = true;
                                    if (var51 == 0 && Statics.field998[var6][var26][var45] != 0) {
                                        var68 = false;
                                    }
                                    if (var52 > 0 && !Statics.method12(var52 - 1).field2304) {
                                        var68 = false;
                                    }
                                    if (var68 && var53 == var54 && var53 == var55 && var53 == var56) {
                                        Statics.field1487[var6][var26][var45] |= 0x924;
                                    }
                                }
                                int var69 = 0;
                                if (var62 != -1) {
                                    var69 = class241.field2555[method2231(var62, 96)];
                                }
                                if (var52 == 0) {
                                    arg0.method4299(var6, var26, var45, 0, 0, -1, var53, var54, var55, var56, method2231(var61, var57), method2231(var61, var58), method2231(var61, var59), method2231(var61, var60), 0, 0, 0, 0, var69, 0);
                                } else {
                                    int var70 = Statics.field998[var6][var26][var45] + 1;
                                    byte var71 = Statics.field2005[var6][var26][var45];
                                    class222 var72 = Statics.method12(var52 - 1);
                                    int var73 = var72.field2305;
                                    int var74;
                                    int var75;
                                    if (var73 >= 0) {
                                        var74 = class241.field2551.field2837.method4497(var73);
                                        var75 = -1;
                                    } else if (var72.field2301 == 16711935) {
                                        var75 = -2;
                                        var73 = -1;
                                        var74 = -2;
                                    } else {
                                        var75 = method3445(var72.field2306, var72.field2312, var72.field2308);
                                        int var76 = field1031 + var72.field2306 & 0xFF;
                                        int var77 = field1044 + var72.field2308;
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        var74 = method3445(var76, var72.field2312, var77);
                                    }
                                    int var78 = 0;
                                    if (var74 != -2) {
                                        var78 = class241.field2555[method3564(var74, 96)];
                                    }
                                    if (var72.field2310 != -1) {
                                        int var79 = field1031 + var72.field2309 & 0xFF;
                                        int var80 = field1044 + var72.field2311;
                                        if (var80 < 0) {
                                            var80 = 0;
                                        } else if (var80 > 255) {
                                            var80 = 255;
                                        }
                                        int var81 = method3445(var79, var72.field2302, var80);
                                        var78 = class241.field2555[method3564(var81, 96)];
                                    }
                                    arg0.method4299(var6, var26, var45, var70, var71, var73, var53, var54, var55, var56, method2231(var61, var57), method2231(var61, var58), method2231(var61, var59), method2231(var61, var60), method3564(var75, var57), method3564(var75, var58), method3564(var75, var59), method3564(var75, var60), var69, var78);
                                }
                            }
                        }
                    }
                }
            }
            for (int var82 = 1; var82 < 103; var82++) {
                for (int var83 = 1; var83 < 103; var83++) {
                    arg0.method4298(var6, var83, var82, method5168(var6, var83, var82));
                }
            }
            Statics.field842[var6] = (short[][]) null;
            Statics.field2821[var6] = (short[][]) null;
            Statics.field998[var6] = (byte[][]) null;
            Statics.field2005[var6] = (byte[][]) null;
            Statics.field1046[var6] = (byte[][]) null;
        }
        arg0.method4325(-50, -10, -50);
        for (int var84 = 0; var84 < 104; var84++) {
            for (int var85 = 0; var85 < 104; var85++) {
                if ((field1032[1][var84][var85] & 0x2) == 2) {
                    arg0.method4296(var84, var85);
                }
            }
        }
        int var86 = 1;
        int var87 = 2;
        int var88 = 4;
        for (int var89 = 0; var89 < 4; var89++) {
            if (var89 > 0) {
                var86 <<= 0x3;
                var87 <<= 0x3;
                var88 <<= 0x3;
            }
            for (int var90 = 0; var90 <= var89; var90++) {
                for (int var91 = 0; var91 <= 104; var91++) {
                    for (int var92 = 0; var92 <= 104; var92++) {
                        if ((Statics.field1487[var90][var92][var91] & var86) != 0) {
                            int var93 = var91;
                            int var94 = var91;
                            int var95 = var90;
                            int var96 = var90;
                            while (var93 > 0 && (Statics.field1487[var90][var92][var93 - 1] & var86) != 0) {
                                var93--;
                            }
                            while (var94 < 104 && (Statics.field1487[var90][var92][var94 + 1] & var86) != 0) {
                                var94++;
                            }
                            label337: while (var95 > 0) {
                                for (int var97 = var93; var97 <= var94; var97++) {
                                    if ((Statics.field1487[var95 - 1][var92][var97] & var86) == 0) {
                                        break label337;
                                    }
                                }
                                var95--;
                            }
                            label326: while (var96 < var89) {
                                for (int var98 = var93; var98 <= var94; var98++) {
                                    if ((Statics.field1487[var96 + 1][var92][var98] & var86) == 0) {
                                        break label326;
                                    }
                                }
                                var96++;
                            }
                            int var99 = (var96 + 1 - var95) * (var94 - var93 + 1);
                            if (var99 >= 8) {
                                short var100 = 240;
                                int var101 = field1042[var96][var92][var93] - var100;
                                int var102 = field1042[var95][var92][var93];
                                class245.method4297(var89, 1, var92 * 128, var92 * 128, var93 * 128, var94 * 128 + 128, var101, var102);
                                for (int var103 = var95; var103 <= var96; var103++) {
                                    for (int var104 = var93; var104 <= var94; var104++) {
                                        Statics.field1487[var103][var92][var104] &= ~var86;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1487[var90][var92][var91] & var87) != 0) {
                            int var105 = var92;
                            int var106 = var92;
                            int var107 = var90;
                            int var108 = var90;
                            while (var105 > 0 && (Statics.field1487[var90][var105 - 1][var91] & var87) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field1487[var90][var106 + 1][var91] & var87) != 0) {
                                var106++;
                            }
                            label390: while (var107 > 0) {
                                for (int var109 = var105; var109 <= var106; var109++) {
                                    if ((Statics.field1487[var107 - 1][var109][var91] & var87) == 0) {
                                        break label390;
                                    }
                                }
                                var107--;
                            }
                            label379: while (var108 < var89) {
                                for (int var110 = var105; var110 <= var106; var110++) {
                                    if ((Statics.field1487[var108 + 1][var110][var91] & var87) == 0) {
                                        break label379;
                                    }
                                }
                                var108++;
                            }
                            int var111 = (var108 + 1 - var107) * (var106 - var105 + 1);
                            if (var111 >= 8) {
                                short var112 = 240;
                                int var113 = field1042[var108][var105][var91] - var112;
                                int var114 = field1042[var107][var105][var91];
                                class245.method4297(var89, 2, var105 * 128, var106 * 128 + 128, var91 * 128, var91 * 128, var113, var114);
                                for (int var115 = var107; var115 <= var108; var115++) {
                                    for (int var116 = var105; var116 <= var106; var116++) {
                                        Statics.field1487[var115][var116][var91] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1487[var90][var92][var91] & var88) != 0) {
                            int var117 = var92;
                            int var118 = var92;
                            int var119 = var91;
                            int var120 = var91;
                            while (var119 > 0 && (Statics.field1487[var90][var92][var119 - 1] & var88) != 0) {
                                var119--;
                            }
                            while (var120 < 104 && (Statics.field1487[var90][var92][var120 + 1] & var88) != 0) {
                                var120++;
                            }
                            label443: while (var117 > 0) {
                                for (int var121 = var119; var121 <= var120; var121++) {
                                    if ((Statics.field1487[var90][var117 - 1][var121] & var88) == 0) {
                                        break label443;
                                    }
                                }
                                var117--;
                            }
                            label432: while (var118 < 104) {
                                for (int var122 = var119; var122 <= var120; var122++) {
                                    if ((Statics.field1487[var90][var118 + 1][var122] & var88) == 0) {
                                        break label432;
                                    }
                                }
                                var118++;
                            }
                            if ((var118 - var117 + 1) * (var120 - var119 + 1) >= 4) {
                                int var123 = field1042[var90][var117][var119];
                                class245.method4297(var89, 4, var117 * 128, var118 * 128 + 128, var119 * 128, var120 * 128 + 128, var123, var123);
                                for (int var124 = var117; var124 <= var118; var124++) {
                                    for (int var125 = var119; var125 <= var120; var125++) {
                                        Statics.field1487[var90][var124][var125] &= ~var88;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kd.ap(IIIB)I")
    public static int method5168(int arg0, int arg1, int arg2) {
        if ((field1032[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field1032[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("up.ay(IIB)I")
    public static final int method8630(int arg0, int arg1) {
        int var2 = Statics.method7153(arg0 + 45365, arg1 + 91923, 4) - 128 + (Statics.method7153(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Statics.method7153(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ca.aj(III)I")
    public static final int method2045(int arg0, int arg1) {
        int var2 = method2486(arg0 - 1, arg1 - 1) + method2486(arg0 + 1, arg1 - 1) + method2486(arg0 - 1, arg1 + 1) + method2486(arg0 + 1, arg1 + 1);
        int var3 = method2486(arg0 - 1, arg1) + method2486(arg0 + 1, arg1) + method2486(arg0, arg1 - 1) + method2486(arg0, arg1 + 1);
        int var4 = method2486(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dy.an(IIB)I")
    public static final int method2486(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dl.au(IIB)I")
    public static final int method2231(int arg0, int arg1) {
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

    @ObfuscatedName("ie.ai(IIB)I")
    public static final int method3564(int arg0, int arg1) {
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

    @ObfuscatedName("ht.ae(IIII)I")
    public static final int method3445(int arg0, int arg1, int arg2) {
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
