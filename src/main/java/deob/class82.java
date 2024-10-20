package deob;

@ObfuscatedName("du")
public final class class82 {

    @ObfuscatedName("du.au")
    public static int[][][] field1048 = new int[4][105][105];

    @ObfuscatedName("du.ae")
    public static byte[][][] field1050 = new byte[4][104][104];

    @ObfuscatedName("du.ao")
    public static int field1040 = 99;

    @ObfuscatedName("du.ax")
    public static final int[] field1043 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("du.ah")
    public static final int[] field1044 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("du.as")
    public static final int[] field1045 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("du.ay")
    public static final int[] field1046 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("du.aj")
    public static final int[] field1052 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("du.av")
    public static final int[] field1049 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("du.aw")
    public static int field1047 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("du.ak")
    public static int field1053 = (int) (Math.random() * 33.0D) - 16;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("on.au(I)V")
    public static void method6369() {
        field1040 = 99;
        Statics.field1041 = new short[4][104][104];
        Statics.field2544 = new short[4][104][104];
        Statics.field1856 = new byte[4][104][104];
        Statics.field2834 = new byte[4][104][104];
        Statics.field4680 = new int[4][105][105];
        Statics.field2410 = new byte[4][105][105];
        Statics.field1795 = new int[105][105];
        Statics.field4952 = new int[104];
        Statics.field4804 = new int[104];
        Statics.field1042 = new int[104];
        Statics.field1537 = new int[104];
        Statics.field889 = new int[104];
    }

    @ObfuscatedName("ca.ae(B)V")
    public static void method1842() {
        Statics.field1041 = (short[][][]) null;
        Statics.field2544 = (short[][][]) null;
        Statics.field1856 = (byte[][][]) null;
        Statics.field2834 = (byte[][][]) null;
        Statics.field4680 = (int[][][]) null;
        Statics.field2410 = (byte[][][]) null;
        Statics.field1795 = (int[][]) null;
        Statics.field4952 = null;
        Statics.field4804 = null;
        Statics.field1042 = null;
        Statics.field1537 = null;
        Statics.field889 = null;
    }

    @ObfuscatedName("am.ao(IIIII)V")
    public static final void method259(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2410[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1048[0][var5][var4] = field1048[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1048[0][var5][var4] = field1048[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1048[0][var5][var4] = field1048[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1048[0][var5][var4] = field1048[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("kt.at([BIIII[Lis;I)V")
    public static final void method4998(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class214[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2379[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class515 var9 = new class515(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    method2076(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("ok.ai(IIII)V")
    public static final void method6355(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1048[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1048[arg0][arg1][arg2 + var5] = field1048[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1048[arg0][arg1 + var6][arg2] = field1048[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1048[arg0][arg1 - 1][arg2] != 0) {
            field1048[arg0][arg1][arg2] = field1048[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1048[arg0][arg1][arg2 - 1] != 0) {
            field1048[arg0][arg1][arg2] = field1048[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1048[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1048[arg0][arg1][arg2] = field1048[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cc.az(Ltm;IIIIIII)V")
    public static final void method2076(class515 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!Statics.method447(arg1, arg2, arg3)) {
            while (true) {
                int var16 = arg0.method8448();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method8300();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method8303();
                }
            }
            return;
        }
        field1050[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method8448();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field1048[0][arg2];
                    int var10 = arg4 + 932731;
                    int var11 = arg5 + 556238;
                    int var12 = method2955(var10 + 45365, var11 + 91923, 4) - 128 + (method2955(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2955(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field1048[arg1][arg2][arg3] = field1048[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method8300();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field1048[0][arg2][arg3] = -var15 * 8;
                } else {
                    field1048[arg1][arg2][arg3] = field1048[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2544[arg1][arg2][arg3] = (short) arg0.method8303();
                Statics.field1856[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2834[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field1050[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1041[arg1][arg2][arg3] = (short) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fg.ap([BIII)Z")
    public static final boolean method2956(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class515 var4 = new class515(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8318();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8436();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8300() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class206 var16 = class206.method3321(var5);
                        if (var13 != 22 || !client.field531 || var16.field2195 != 0 || var16.field2188 == 1 || var16.field2175) {
                            if (!var16.method3606()) {
                                client.field599++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8436();
                if (var9 == 0) {
                    break;
                }
                var4.method8300();
            }
        }
    }

    @ObfuscatedName("qc.aa([BIILiv;[Lis;I)V")
    public static final void method7224(byte[] arg0, int arg1, int arg2, class231 arg3, class214[] arg4) {
        class515 var5 = new class515(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method8318();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method8436();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method8300();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1050[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class214 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2857(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("du.af([BIIIIIIILiv;[Lis;)V")
    public static final void method2111(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class231 arg8, class214[] arg9) {
        class515 var10 = new class515(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method8318();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method8436();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method8300();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class206 var21 = class206.method3321(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2186;
                    int var27 = var21.field2171;
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
                    int var32 = arg3 + class326.method2188(var16 & 0x7, var15 & 0x7, arg7, var21.field2186, var21.field2171, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field1050[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class214 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method2857(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.ad(IIIIIILiv;Lis;I)V")
    public static final void method2857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class231 arg6, class214 arg7) {
        if (client.field531 && (field1050[0][arg1][arg2] & 0x2) == 0 && (field1050[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1040) {
            field1040 = arg0;
        }
        class206 var8 = class206.method3321(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2171;
            var10 = var8.field2186;
        } else {
            var9 = var8.field2186;
            var10 = var8.field2171;
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
        int[][] var15 = field1048[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class241.method7981(arg1, arg2, 2, var8.field2195 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2211 == 1) {
            var21 += 256;
        }
        if (var8.method3639()) {
            class70.method2982(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field531 || var8.field2195 != 0 || var8.field2188 == 1 || var8.field2175) {
                class233 var22;
                if (var8.field2198 == -1 && var8.field2212 == null) {
                    var22 = var8.method3607(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class80(arg3, 22, arg4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
                }
                arg6.method4207(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2188 == 1 && arg7 != null) {
                    arg7.method3836(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class233 var48;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var48 = var8.method3607(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class80(arg3, 10, arg4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            if (var48 != null && arg6.method4211(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2202) {
                int var49 = 15;
                if (var48 instanceof class240) {
                    var49 = ((class240) var48).method4452() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field2410[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field2410[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2188 != 0 && arg7 != null) {
                arg7.method3834(arg1, arg2, var9, var10, var8.field2189);
            }
        } else if (arg5 >= 12) {
            class233 var23;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var23 = var8.method3607(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4211(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field4680[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2188 != 0 && arg7 != null) {
                arg7.method3834(arg1, arg2, var9, var10, var8.field2189);
            }
        } else if (arg5 == 0) {
            class233 var24;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var24 = var8.method3607(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class80(arg3, 0, arg4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4243(arg0, arg1, arg2, var16, var24, (class233) null, field1043[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2202) {
                    Statics.field2410[arg0][arg1][arg2] = 50;
                    Statics.field2410[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2197) {
                    Statics.field4680[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2202) {
                    Statics.field2410[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2410[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2197) {
                    Statics.field4680[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2202) {
                    Statics.field2410[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2410[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2197) {
                    Statics.field4680[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2202) {
                    Statics.field2410[arg0][arg1][arg2] = 50;
                    Statics.field2410[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2197) {
                    Statics.field4680[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2188 != 0 && arg7 != null) {
                arg7.method3833(arg1, arg2, arg5, arg4, var8.field2189);
            }
            if (var8.field2192 != 16) {
                arg6.method4217(arg0, arg1, arg2, var8.field2192);
            }
        } else if (arg5 == 1) {
            class233 var25;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var25 = var8.method3607(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class80(arg3, 1, arg4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4243(arg0, arg1, arg2, var16, var25, (class233) null, field1044[arg4], 0, var19, var21);
            if (var8.field2202) {
                if (arg4 == 0) {
                    Statics.field2410[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2410[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2410[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2410[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2188 != 0 && arg7 != null) {
                arg7.method3833(arg1, arg2, arg5, arg4, var8.field2189);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class233 var27;
            class233 var28;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var27 = var8.method3607(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3607(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class80(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
                var28 = new class80(arg3, 2, var26, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4243(arg0, arg1, arg2, var16, var27, var28, field1043[arg4], field1043[var26], var19, var21);
            if (var8.field2197) {
                if (arg4 == 0) {
                    Statics.field4680[arg0][arg1][arg2] |= 0x249;
                    Statics.field4680[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field4680[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field4680[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field4680[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field4680[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field4680[arg0][arg1][arg2] |= 0x492;
                    Statics.field4680[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2188 != 0 && arg7 != null) {
                arg7.method3833(arg1, arg2, arg5, arg4, var8.field2189);
            }
            if (var8.field2192 != 16) {
                arg6.method4217(arg0, arg1, arg2, var8.field2192);
            }
        } else if (arg5 == 3) {
            class233 var29;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var29 = var8.method3607(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class80(arg3, 3, arg4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4243(arg0, arg1, arg2, var16, var29, (class233) null, field1044[arg4], 0, var19, var21);
            if (var8.field2202) {
                if (arg4 == 0) {
                    Statics.field2410[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2410[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2410[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2410[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2188 != 0 && arg7 != null) {
                arg7.method3833(arg1, arg2, arg5, arg4, var8.field2189);
            }
        } else if (arg5 == 9) {
            class233 var30;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var30 = var8.method3607(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4211(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2188 != 0 && arg7 != null) {
                arg7.method3834(arg1, arg2, var9, var10, var8.field2189);
            }
            if (var8.field2192 != 16) {
                arg6.method4217(arg0, arg1, arg2, var8.field2192);
            }
        } else if (arg5 == 4) {
            class233 var31;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var31 = var8.method3607(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4310(arg0, arg1, arg2, var16, var31, (class233) null, field1043[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4255(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class206.method3321(class241.method3275(var33)).field2192;
            }
            class233 var35;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var35 = var8.method3607(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4310(arg0, arg1, arg2, var16, var35, (class233) null, field1043[arg4], 0, field1045[arg4] * var32, field1046[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4255(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class206.method3321(class241.method3275(var37)).field2192 / 2;
            }
            class233 var39;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var39 = var8.method3607(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4310(arg0, arg1, arg2, var16, var39, (class233) null, 256, arg4, field1052[arg4] * var36, field1049[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class233 var41;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var41 = var8.method3607(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class80(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4310(arg0, arg1, arg2, var16, var41, (class233) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4255(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class206.method3321(class241.method3275(var43)).field2192 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class233 var46;
            class233 var47;
            if (var8.field2198 == -1 && var8.field2212 == null) {
                var46 = var8.method3607(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3607(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
                var47 = new class80(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2198, var8.field2203, (class233) null);
            }
            arg6.method4310(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1052[arg4] * var42, field1049[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("ep.aq(Liv;[Lis;I)V")
    public static final void method2861(class231 arg0, class214[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1050[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1050[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3835(var3, var4);
                        }
                    }
                }
            }
        }
        field1047 += (int) (Math.random() * 5.0D) - 2;
        if (field1047 < -8) {
            field1047 = -8;
        }
        if (field1047 > 8) {
            field1047 = 8;
        }
        field1053 += (int) (Math.random() * 5.0D) - 2;
        if (field1053 < -16) {
            field1053 = -16;
        }
        if (field1053 > 16) {
            field1053 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2410[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1048[var6][var16 + 1][var15] - field1048[var6][var16 - 1][var15];
                    int var18 = field1048[var6][var16][var15 + 1] - field1048[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field1795[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field4952[var25] = 0;
                Statics.field4804[var25] = 0;
                Statics.field1042[var25] = 0;
                Statics.field1537[var25] = 0;
                Statics.field889[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        long var29 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var31 = (int) var29;
                        int var32 = Statics.field1041[var6][var28][var27] & var31;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class200 var34 = (class200) class200.field2114.method5182((long) var33);
                            class200 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field2113.method6128(1, var33);
                                class200 var37 = new class200();
                                if (var36 != null) {
                                    var37.method3481(new class515(var36), var33);
                                }
                                var37.method3479();
                                class200.field2114.method5177(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field4952[var27] += var35.field2121;
                            Statics.field4804[var27] += var35.field2117;
                            Statics.field1042[var27] += var35.field2116;
                            Statics.field1537[var27] += var35.field2118;
                            var10002 = Statics.field889[var27]++;
                        }
                    }
                    int var39 = var26 - 5;
                    if (var39 >= 0 && var39 < 104) {
                        long var40 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var42 = (int) var40;
                        int var43 = Statics.field1041[var6][var39][var27] & var42;
                        if (var43 > 0) {
                            int var44 = var43 - 1;
                            class200 var45 = (class200) class200.field2114.method5182((long) var44);
                            class200 var46;
                            if (var45 == null) {
                                byte[] var47 = Statics.field2113.method6128(1, var44);
                                class200 var48 = new class200();
                                if (var47 != null) {
                                    var48.method3481(new class515(var47), var44);
                                }
                                var48.method3479();
                                class200.field2114.method5177(var48, (long) var44);
                                var46 = var48;
                            } else {
                                var46 = var45;
                            }
                            Statics.field4952[var27] -= var46.field2121;
                            Statics.field4804[var27] -= var46.field2117;
                            Statics.field1042[var27] -= var46.field2116;
                            Statics.field1537[var27] -= var46.field2118;
                            var10002 = Statics.field889[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var50 = 0;
                    int var51 = 0;
                    int var52 = 0;
                    int var53 = 0;
                    int var54 = 0;
                    for (int var55 = -5; var55 < 109; var55++) {
                        int var56 = var55 + 5;
                        if (var56 >= 0 && var56 < 104) {
                            var50 += Statics.field4952[var56];
                            var51 += Statics.field4804[var56];
                            var52 += Statics.field1042[var56];
                            var53 += Statics.field1537[var56];
                            var54 += Statics.field889[var56];
                        }
                        int var57 = var55 - 5;
                        if (var57 >= 0 && var57 < 104) {
                            var50 -= Statics.field4952[var57];
                            var51 -= Statics.field4804[var57];
                            var52 -= Statics.field1042[var57];
                            var53 -= Statics.field1537[var57];
                            var54 -= Statics.field889[var57];
                        }
                        if (var55 >= 1 && var55 < 103 && (!client.field531 || (field1050[0][var26][var55] & 0x2) != 0 || (field1050[var6][var26][var55] & 0x10) == 0)) {
                            if (var6 < field1040) {
                                field1040 = var6;
                            }
                            long var58 = (long) Math.pow(2.0D, 15.0D) - 1L;
                            int var60 = (int) var58;
                            int var61 = Statics.field1041[var6][var26][var55] & var60;
                            int var62 = Statics.field2544[var6][var26][var55] & var60;
                            if (var61 > 0 || var62 > 0) {
                                int var63 = field1048[var6][var26][var55];
                                int var64 = field1048[var6][var26 + 1][var55];
                                int var65 = field1048[var6][var26 + 1][var55 + 1];
                                int var66 = field1048[var6][var26][var55 + 1];
                                int var67 = Statics.field1795[var26][var55];
                                int var68 = Statics.field1795[var26 + 1][var55];
                                int var69 = Statics.field1795[var26 + 1][var55 + 1];
                                int var70 = Statics.field1795[var26][var55 + 1];
                                int var71 = -1;
                                int var72 = -1;
                                if (var61 > 0) {
                                    int var73 = var50 * 256 / var53;
                                    int var74 = var51 / var54;
                                    int var75 = var52 / var54;
                                    var71 = method2571(var73, var74, var75);
                                    int var76 = field1047 + var73 & 0xFF;
                                    int var77 = field1053 + var75;
                                    if (var77 < 0) {
                                        var77 = 0;
                                    } else if (var77 > 255) {
                                        var77 = 255;
                                    }
                                    var72 = method2571(var76, var74, var77);
                                }
                                if (var6 > 0) {
                                    boolean var78 = true;
                                    if (var61 == 0 && Statics.field1856[var6][var26][var55] != 0) {
                                        var78 = false;
                                    }
                                    if (var62 > 0) {
                                        int var79 = var62 - 1;
                                        class208 var80 = (class208) class208.field2295.method5182((long) var79);
                                        class208 var81;
                                        if (var80 == null) {
                                            byte[] var82 = Statics.field2302.method6128(4, var79);
                                            class208 var83 = new class208();
                                            if (var82 != null) {
                                                var83.method3722(new class515(var82), var79);
                                            }
                                            var83.method3721();
                                            class208.field2295.method5177(var83, (long) var79);
                                            var81 = var83;
                                        } else {
                                            var81 = var80;
                                        }
                                        if (!var81.field2291) {
                                            var78 = false;
                                        }
                                    }
                                    if (var78 && var63 == var64 && var63 == var65 && var63 == var66) {
                                        Statics.field4680[var6][var26][var55] |= 0x924;
                                    }
                                }
                                int var84 = 0;
                                if (var72 != -1) {
                                    var84 = class227.field2532[method2753(var72, 96)];
                                }
                                if (var62 == 0) {
                                    arg0.method4290(var6, var26, var55, 0, 0, -1, var63, var64, var65, var66, method2753(var71, var67), method2753(var71, var68), method2753(var71, var69), method2753(var71, var70), 0, 0, 0, 0, var84, 0);
                                } else {
                                    int var85 = Statics.field1856[var6][var26][var55] + 1;
                                    byte var86 = Statics.field2834[var6][var26][var55];
                                    int var87 = var62 - 1;
                                    class208 var88 = (class208) class208.field2295.method5182((long) var87);
                                    class208 var89;
                                    if (var88 == null) {
                                        byte[] var90 = Statics.field2302.method6128(4, var87);
                                        class208 var91 = new class208();
                                        if (var90 != null) {
                                            var91.method3722(new class515(var90), var87);
                                        }
                                        var91.method3721();
                                        class208.field2295.method5177(var91, (long) var87);
                                        var89 = var91;
                                    } else {
                                        var89 = var88;
                                    }
                                    int var93 = var89.field2288;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = class227.field2537.field2813.method4404(var93);
                                        var95 = -1;
                                    } else if (var89.field2289 == 16711935) {
                                        var95 = -2;
                                        var93 = -1;
                                        var94 = -2;
                                    } else {
                                        var95 = method2571(var89.field2293, var89.field2294, var89.field2301);
                                        int var96 = field1047 + var89.field2293 & 0xFF;
                                        int var97 = field1053 + var89.field2301;
                                        if (var97 < 0) {
                                            var97 = 0;
                                        } else if (var97 > 255) {
                                            var97 = 255;
                                        }
                                        var94 = method2571(var96, var89.field2294, var97);
                                    }
                                    int var98 = 0;
                                    if (var94 != -2) {
                                        var98 = class227.field2532[method1715(var94, 96)];
                                    }
                                    if (var89.field2292 != -1) {
                                        int var99 = field1047 + var89.field2297 & 0xFF;
                                        int var100 = field1053 + var89.field2298;
                                        if (var100 < 0) {
                                            var100 = 0;
                                        } else if (var100 > 255) {
                                            var100 = 255;
                                        }
                                        int var101 = method2571(var99, var89.field2296, var100);
                                        var98 = class227.field2532[method1715(var101, 96)];
                                    }
                                    arg0.method4290(var6, var26, var55, var85, var86, var93, var63, var64, var65, var66, method2753(var71, var67), method2753(var71, var68), method2753(var71, var69), method2753(var71, var70), method1715(var95, var67), method1715(var95, var68), method1715(var95, var69), method1715(var95, var70), var84, var98);
                                }
                            }
                        }
                    }
                }
            }
            for (int var102 = 1; var102 < 103; var102++) {
                for (int var103 = 1; var103 < 103; var103++) {
                    arg0.method4379(var6, var103, var102, method4589(var6, var103, var102));
                }
            }
            Statics.field1041[var6] = (short[][]) null;
            Statics.field2544[var6] = (short[][]) null;
            Statics.field1856[var6] = (byte[][]) null;
            Statics.field2834[var6] = (byte[][]) null;
            Statics.field2410[var6] = (byte[][]) null;
        }
        arg0.method4232(-50, -10, -50);
        for (int var104 = 0; var104 < 104; var104++) {
            for (int var105 = 0; var105 < 104; var105++) {
                if ((field1050[1][var104][var105] & 0x2) == 2) {
                    arg0.method4203(var104, var105);
                }
            }
        }
        int var106 = 1;
        int var107 = 2;
        int var108 = 4;
        for (int var109 = 0; var109 < 4; var109++) {
            if (var109 > 0) {
                var106 <<= 0x3;
                var107 <<= 0x3;
                var108 <<= 0x3;
            }
            for (int var110 = 0; var110 <= var109; var110++) {
                for (int var111 = 0; var111 <= 104; var111++) {
                    for (int var112 = 0; var112 <= 104; var112++) {
                        if ((Statics.field4680[var110][var112][var111] & var106) != 0) {
                            int var113 = var111;
                            int var114 = var111;
                            int var115 = var110;
                            int var116 = var110;
                            while (var113 > 0 && (Statics.field4680[var110][var112][var113 - 1] & var106) != 0) {
                                var113--;
                            }
                            while (var114 < 104 && (Statics.field4680[var110][var112][var114 + 1] & var106) != 0) {
                                var114++;
                            }
                            label373: while (var115 > 0) {
                                for (int var117 = var113; var117 <= var114; var117++) {
                                    if ((Statics.field4680[var115 - 1][var112][var117] & var106) == 0) {
                                        break label373;
                                    }
                                }
                                var115--;
                            }
                            label362: while (var116 < var109) {
                                for (int var118 = var113; var118 <= var114; var118++) {
                                    if ((Statics.field4680[var116 + 1][var112][var118] & var106) == 0) {
                                        break label362;
                                    }
                                }
                                var116++;
                            }
                            int var119 = (var116 + 1 - var115) * (var114 - var113 + 1);
                            if (var119 >= 8) {
                                short var120 = 240;
                                int var121 = field1048[var116][var112][var113] - var120;
                                int var122 = field1048[var115][var112][var113];
                                class231.method4204(var109, 1, var112 * 128, var112 * 128, var113 * 128, var114 * 128 + 128, var121, var122);
                                for (int var123 = var115; var123 <= var116; var123++) {
                                    for (int var124 = var113; var124 <= var114; var124++) {
                                        Statics.field4680[var123][var112][var124] &= ~var106;
                                    }
                                }
                            }
                        }
                        if ((Statics.field4680[var110][var112][var111] & var107) != 0) {
                            int var125 = var112;
                            int var126 = var112;
                            int var127 = var110;
                            int var128 = var110;
                            while (var125 > 0 && (Statics.field4680[var110][var125 - 1][var111] & var107) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field4680[var110][var126 + 1][var111] & var107) != 0) {
                                var126++;
                            }
                            label426: while (var127 > 0) {
                                for (int var129 = var125; var129 <= var126; var129++) {
                                    if ((Statics.field4680[var127 - 1][var129][var111] & var107) == 0) {
                                        break label426;
                                    }
                                }
                                var127--;
                            }
                            label415: while (var128 < var109) {
                                for (int var130 = var125; var130 <= var126; var130++) {
                                    if ((Statics.field4680[var128 + 1][var130][var111] & var107) == 0) {
                                        break label415;
                                    }
                                }
                                var128++;
                            }
                            int var131 = (var128 + 1 - var127) * (var126 - var125 + 1);
                            if (var131 >= 8) {
                                short var132 = 240;
                                int var133 = field1048[var128][var125][var111] - var132;
                                int var134 = field1048[var127][var125][var111];
                                class231.method4204(var109, 2, var125 * 128, var126 * 128 + 128, var111 * 128, var111 * 128, var133, var134);
                                for (int var135 = var127; var135 <= var128; var135++) {
                                    for (int var136 = var125; var136 <= var126; var136++) {
                                        Statics.field4680[var135][var136][var111] &= ~var107;
                                    }
                                }
                            }
                        }
                        if ((Statics.field4680[var110][var112][var111] & var108) != 0) {
                            int var137 = var112;
                            int var138 = var112;
                            int var139 = var111;
                            int var140 = var111;
                            while (var139 > 0 && (Statics.field4680[var110][var112][var139 - 1] & var108) != 0) {
                                var139--;
                            }
                            while (var140 < 104 && (Statics.field4680[var110][var112][var140 + 1] & var108) != 0) {
                                var140++;
                            }
                            label479: while (var137 > 0) {
                                for (int var141 = var139; var141 <= var140; var141++) {
                                    if ((Statics.field4680[var110][var137 - 1][var141] & var108) == 0) {
                                        break label479;
                                    }
                                }
                                var137--;
                            }
                            label468: while (var138 < 104) {
                                for (int var142 = var139; var142 <= var140; var142++) {
                                    if ((Statics.field4680[var110][var138 + 1][var142] & var108) == 0) {
                                        break label468;
                                    }
                                }
                                var138++;
                            }
                            if ((var138 - var137 + 1) * (var140 - var139 + 1) >= 4) {
                                int var143 = field1048[var110][var137][var139];
                                class231.method4204(var109, 4, var137 * 128, var138 * 128 + 128, var139 * 128, var140 * 128 + 128, var143, var143);
                                for (int var144 = var137; var144 <= var138; var144++) {
                                    for (int var145 = var139; var145 <= var140; var145++) {
                                        Statics.field4680[var110][var144][var145] &= ~var108;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jc.al(IIII)I")
    public static int method4589(int arg0, int arg1, int arg2) {
        if ((field1050[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field1050[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fp.an(IIIB)I")
    public static final int method2955(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method5444(var3, var5);
        int var8 = method5444(var3 + 1, var5);
        int var9 = method5444(var3, var5 + 1);
        int var10 = method5444(var3 + 1, var5 + 1);
        int var11 = method288(var7, var8, var4, arg2);
        int var12 = method288(var9, var10, var4, arg2);
        return method288(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ah.ar(IIIII)I")
    public static final int method288(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class227.field2533[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("md.ab(III)I")
    public static final int method5444(int arg0, int arg1) {
        int var2 = method6061(arg0 - 1, arg1 - 1) + method6061(arg0 + 1, arg1 - 1) + method6061(arg0 - 1, arg1 + 1) + method6061(arg0 + 1, arg1 + 1);
        int var3 = method6061(arg0 - 1, arg1) + method6061(arg0 + 1, arg1) + method6061(arg0, arg1 - 1) + method6061(arg0, arg1 + 1);
        int var4 = method6061(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("nr.ag(IIB)I")
    public static final int method6061(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ei.am(III)I")
    public static final int method2753(int arg0, int arg1) {
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

    @ObfuscatedName("client.ax(IIB)I")
    public static final int method1715(int arg0, int arg1) {
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

    @ObfuscatedName("ey.ah(IIIB)I")
    public static final int method2571(int arg0, int arg1, int arg2) {
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
