package deob;

@ObfuscatedName("dm")
public final class class83 {

    @ObfuscatedName("dm.az")
    public static int[][][] field1030 = new int[4][105][105];

    @ObfuscatedName("dm.ah")
    public static byte[][][] field1047 = new byte[4][104][104];

    @ObfuscatedName("dm.af")
    public static int field1046 = 99;

    @ObfuscatedName("dm.ap")
    public static final int[] field1036 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("dm.av")
    public static final int[] field1045 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("dm.aa")
    public static final int[] field1038 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("dm.aq")
    public static final int[] field1039 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("dm.am")
    public static final int[] field1040 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("dm.ac")
    public static final int[] field1041 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("dm.ae")
    public static int field1042 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("dm.ak")
    public static int field1043 = (int) (Math.random() * 33.0D) - 16;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.az(I)V")
    public static void method1116() {
        field1046 = 99;
        Statics.field1031 = new short[4][104][104];
        Statics.field5130 = new short[4][104][104];
        Statics.field1032 = new byte[4][104][104];
        Statics.field1029 = new byte[4][104][104];
        Statics.field1834 = new int[4][105][105];
        Statics.field2751 = new byte[4][105][105];
        Statics.field3196 = new int[105][105];
        Statics.field825 = new int[104];
        Statics.field2961 = new int[104];
        Statics.field5294 = new int[104];
        Statics.field1034 = new int[104];
        Statics.field4474 = new int[104];
    }

    @ObfuscatedName("nz.ah(B)V")
    public static void method6043() {
        Statics.field1031 = (short[][][]) null;
        Statics.field5130 = (short[][][]) null;
        Statics.field1032 = (byte[][][]) null;
        Statics.field1029 = (byte[][][]) null;
        Statics.field1834 = (int[][][]) null;
        Statics.field2751 = (byte[][][]) null;
        Statics.field3196 = (int[][]) null;
        Statics.field825 = null;
        Statics.field2961 = null;
        Statics.field5294 = null;
        Statics.field1034 = null;
        Statics.field4474 = null;
    }

    @ObfuscatedName("mu.af(IIIIB)V")
    public static final void method5652(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2751[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1030[0][var5][var4] = field1030[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1030[0][var5][var4] = field1030[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1030[0][var5][var4] = field1030[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1030[0][var5][var4] = field1030[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("pv.at([BIIII[Lix;B)V")
    public static final void method6554(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class230[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2454[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class535 var9 = new class535(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    method1758(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("fl.an([BIIIIIIIII[Lix;B)V")
    public static final void method3009(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class230[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2454[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class535 var13 = new class535(arg0);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
                        int var17 = arg2 + class343.method617(var15 & 0x7, var16 & 0x7, arg7);
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
                        method1758(var13, arg1, var17, var24, var25, var26, arg7);
                    } else {
                        method1758(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hm.ao(IIII)V")
    public static final void method3394(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1030[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1030[arg0][arg1][arg2 + var5] = field1030[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1030[arg0][arg1 + var6][arg2] = field1030[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1030[arg0][arg1 - 1][arg2] != 0) {
            field1030[arg0][arg1][arg2] = field1030[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1030[arg0][arg1][arg2 - 1] != 0) {
            field1030[arg0][arg1][arg2] = field1030[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1030[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1030[arg0][arg1][arg2] = field1030[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cs.ab(Lur;IIIIIIB)V")
    public static final void method1758(class535 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = arg1 >= 0 && arg1 < 4 && arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104;
        if (!var7) {
            while (true) {
                int var17 = arg0.method8670();
                if (var17 == 0) {
                    break;
                }
                if (var17 == 1) {
                    arg0.method8462();
                    break;
                }
                if (var17 <= 49) {
                    arg0.method8465();
                }
            }
            return;
        }
        field1047[arg1][arg2][arg3] = 0;
        while (true) {
            int var8 = arg0.method8670();
            if (var8 == 0) {
                if (arg1 == 0) {
                    int[] var9 = field1030[0][arg2];
                    int var11 = arg4 + 932731;
                    int var12 = arg5 + 556238;
                    int var13 = method3373(var11 + 45365, var12 + 91923, 4) - 128 + (method3373(var11 + 10294, var12 + 37821, 2) - 128 >> 1) + (method3373(var11, var12, 1) - 128 >> 2);
                    int var14 = (int) ((double) var13 * 0.3D) + 35;
                    if (var14 < 10) {
                        var14 = 10;
                    } else if (var14 > 60) {
                        var14 = 60;
                    }
                    var9[arg3] = -var14 * 8;
                } else {
                    field1030[arg1][arg2][arg3] = field1030[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var8 == 1) {
                int var16 = arg0.method8462();
                if (var16 == 1) {
                    var16 = 0;
                }
                if (arg1 == 0) {
                    field1030[0][arg2][arg3] = -var16 * 8;
                } else {
                    field1030[arg1][arg2][arg3] = field1030[arg1 - 1][arg2][arg3] - var16 * 8;
                }
                break;
            }
            if (var8 <= 49) {
                Statics.field5130[arg1][arg2][arg3] = (short) arg0.method8465();
                Statics.field1032[arg1][arg2][arg3] = (byte) ((var8 - 2) / 4);
                Statics.field1029[arg1][arg2][arg3] = (byte) (var8 - 2 + arg6 & 0x3);
            } else if (var8 <= 81) {
                field1047[arg1][arg2][arg3] = (byte) (var8 - 49);
            } else {
                Statics.field1031[arg1][arg2][arg3] = (short) (var8 - 81);
            }
        }
    }

    @ObfuscatedName("be.aw([BIII)Z")
    public static final boolean method422(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class535 var4 = new class535(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8480();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8676();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8462() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class222 var16 = class222.method2212(var5);
                        if (var13 != 22 || !client.field658 || var16.field2266 != 0 || var16.field2265 == 1 || var16.field2288) {
                            if (!var16.method3747()) {
                                client.field728++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8676();
                if (var9 == 0) {
                    break;
                }
                var4.method8462();
            }
        }
    }

    @ObfuscatedName("ct.ad([BIILjp;[Lix;B)V")
    public static final void method1064(byte[] arg0, int arg1, int arg2, class247 arg3, class230[] arg4) {
        class535 var5 = new class535(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method8480();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method8676();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method8462();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1047[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class230 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method7882(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dm.al([BIIIIIIILjp;[Lix;)V")
    public static final void method2162(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class247 arg8, class230[] arg9) {
        class535 var10 = new class535(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method8480();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method8676();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method8462();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class222 var21 = class222.method2212(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2262;
                    int var27 = var21.field2263;
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
                    int var32 = arg3 + class343.method5349(var16 & 0x7, var15 & 0x7, arg7, var21.field2262, var21.field2263, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field1047[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class230 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method7882(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("sl.as(IIIIIILjp;Lix;B)V")
    public static final void method7882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class247 arg6, class230 arg7) {
        if (client.field658 && (field1047[0][arg1][arg2] & 0x2) == 0 && (field1047[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1046) {
            field1046 = arg0;
        }
        class222 var8 = class222.method2212(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2263;
            var10 = var8.field2262;
        } else {
            var9 = var8.field2262;
            var10 = var8.field2263;
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
        int[][] var15 = field1030[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class257.method3017(arg1, arg2, 2, var8.field2266 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2287 == 1) {
            var21 += 256;
        }
        if (var8.method3760()) {
            class71.method6436(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field658 || var8.field2266 != 0 || var8.field2265 == 1 || var8.field2288) {
                class249 var22;
                if (var8.field2270 == -1 && var8.field2290 == null) {
                    var22 = var8.method3753(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class81(arg3, 22, arg4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
                }
                arg6.method4350(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2265 == 1 && arg7 != null) {
                    arg7.method4031(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class249 var48;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var48 = var8.method3753(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class81(arg3, 10, arg4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            if (var48 != null && arg6.method4389(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2278) {
                int var49 = 15;
                if (var48 instanceof class256) {
                    var49 = ((class256) var48).method4582() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field2751[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field2751[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2265 != 0 && arg7 != null) {
                arg7.method4000(arg1, arg2, var9, var10, var8.field2275);
            }
        } else if (arg5 >= 12) {
            class249 var23;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var23 = var8.method3753(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class81(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4389(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1834[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2265 != 0 && arg7 != null) {
                arg7.method4000(arg1, arg2, var9, var10, var8.field2275);
            }
        } else if (arg5 == 0) {
            class249 var24;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var24 = var8.method3753(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class81(arg3, 0, arg4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4352(arg0, arg1, arg2, var16, var24, (class249) null, field1036[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2278) {
                    Statics.field2751[arg0][arg1][arg2] = 50;
                    Statics.field2751[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2269) {
                    Statics.field1834[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2278) {
                    Statics.field2751[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2751[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2269) {
                    Statics.field1834[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2278) {
                    Statics.field2751[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2751[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2269) {
                    Statics.field1834[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2278) {
                    Statics.field2751[arg0][arg1][arg2] = 50;
                    Statics.field2751[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2269) {
                    Statics.field1834[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2265 != 0 && arg7 != null) {
                arg7.method3999(arg1, arg2, arg5, arg4, var8.field2275);
            }
            if (var8.field2271 != 16) {
                arg6.method4473(arg0, arg1, arg2, var8.field2271);
            }
        } else if (arg5 == 1) {
            class249 var25;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var25 = var8.method3753(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class81(arg3, 1, arg4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4352(arg0, arg1, arg2, var16, var25, (class249) null, field1045[arg4], 0, var19, var21);
            if (var8.field2278) {
                if (arg4 == 0) {
                    Statics.field2751[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2751[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2751[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2751[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2265 != 0 && arg7 != null) {
                arg7.method3999(arg1, arg2, arg5, arg4, var8.field2275);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class249 var27;
            class249 var28;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var27 = var8.method3753(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3753(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class81(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
                var28 = new class81(arg3, 2, var26, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4352(arg0, arg1, arg2, var16, var27, var28, field1036[arg4], field1036[var26], var19, var21);
            if (var8.field2269) {
                if (arg4 == 0) {
                    Statics.field1834[arg0][arg1][arg2] |= 0x249;
                    Statics.field1834[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1834[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1834[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1834[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1834[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1834[arg0][arg1][arg2] |= 0x492;
                    Statics.field1834[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2265 != 0 && arg7 != null) {
                arg7.method3999(arg1, arg2, arg5, arg4, var8.field2275);
            }
            if (var8.field2271 != 16) {
                arg6.method4473(arg0, arg1, arg2, var8.field2271);
            }
        } else if (arg5 == 3) {
            class249 var29;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var29 = var8.method3753(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class81(arg3, 3, arg4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4352(arg0, arg1, arg2, var16, var29, (class249) null, field1045[arg4], 0, var19, var21);
            if (var8.field2278) {
                if (arg4 == 0) {
                    Statics.field2751[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2751[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2751[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2751[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2265 != 0 && arg7 != null) {
                arg7.method3999(arg1, arg2, arg5, arg4, var8.field2275);
            }
        } else if (arg5 == 9) {
            class249 var30;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var30 = var8.method3753(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class81(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4389(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2265 != 0 && arg7 != null) {
                arg7.method4000(arg1, arg2, var9, var10, var8.field2275);
            }
            if (var8.field2271 != 16) {
                arg6.method4473(arg0, arg1, arg2, var8.field2271);
            }
        } else if (arg5 == 4) {
            class249 var31;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var31 = var8.method3753(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class81(arg3, 4, arg4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4353(arg0, arg1, arg2, var16, var31, (class249) null, field1036[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4370(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class222.method2212(class257.method3531(var33)).field2271;
            }
            class249 var35;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var35 = var8.method3753(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class81(arg3, 4, arg4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4353(arg0, arg1, arg2, var16, var35, (class249) null, field1036[arg4], 0, field1038[arg4] * var32, field1039[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4370(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class222.method2212(class257.method3531(var37)).field2271 / 2;
            }
            class249 var39;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var39 = var8.method3753(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class81(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4353(arg0, arg1, arg2, var16, var39, (class249) null, 256, arg4, field1040[arg4] * var36, field1041[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class249 var41;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var41 = var8.method3753(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class81(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4353(arg0, arg1, arg2, var16, var41, (class249) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4370(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class222.method2212(class257.method3531(var43)).field2271 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class249 var46;
            class249 var47;
            if (var8.field2270 == -1 && var8.field2290 == null) {
                var46 = var8.method3753(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3753(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class81(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
                var47 = new class81(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2270, var8.field2281, (class249) null);
            }
            arg6.method4353(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1040[arg4] * var42, field1041[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("hr.ai(IIII)I")
    public static final int method3373(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3243(var3, var5);
        int var8 = method3243(var3 + 1, var5);
        int var9 = method3243(var3, var5 + 1);
        int var10 = method3243(var3 + 1, var5 + 1);
        int var11 = method3129(var7, var8, var4, arg2);
        int var12 = method3129(var9, var10, var4, arg2);
        return method3129(var11, var12, var6, arg2);
    }

    @ObfuscatedName("gc.ax(IIIII)I")
    public static final int method3129(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class243.field2613[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("go.ar(III)I")
    public static final int method3243(int arg0, int arg1) {
        int var2 = method2565(arg0 - 1, arg1 - 1) + method2565(arg0 + 1, arg1 - 1) + method2565(arg0 - 1, arg1 + 1) + method2565(arg0 + 1, arg1 + 1);
        int var3 = method2565(arg0 - 1, arg1) + method2565(arg0 + 1, arg1) + method2565(arg0, arg1 - 1) + method2565(arg0, arg1 + 1);
        int var4 = method2565(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ew.aj(III)I")
    public static final int method2565(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ln.au(IIS)I")
    public static final int method5242(int arg0, int arg1) {
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

    @ObfuscatedName("bt.ay(III)I")
    public static final int method792(int arg0, int arg1) {
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

    @ObfuscatedName("ft.ap(IIIB)I")
    public static final int method2938(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("mi.av(IIIIIIIILjp;Lix;I)V")
    public static final void method5376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class247 arg8, class230 arg9) {
        class222 var10 = class222.method2212(arg4);
        int var11 = arg7 >= 0 ? arg7 : var10.field2270;
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var12 = var10.field2263;
            var13 = var10.field2262;
        } else {
            var12 = var10.field2262;
            var13 = var10.field2263;
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
        int[][] var18 = field1030[arg1];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg2 << 7) + (var12 << 6);
        int var21 = (arg3 << 7) + (var13 << 6);
        long var22 = class257.method3017(arg2, arg3, 2, var10.field2266 == 0, arg4);
        int var24 = (arg5 << 6) + arg6;
        if (var10.field2287 == 1) {
            var24 += 256;
        }
        if (arg6 == 22) {
            class249 var25;
            if (var11 == -1 && var10.field2290 == null) {
                var25 = var10.method3752(22, arg5, var18, var20, var19, var21);
            } else {
                var25 = new class81(arg4, 22, arg5, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4350(arg0, arg2, arg3, var19, var25, var22, var24);
            if (var10.field2265 == 1) {
                arg9.method4031(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class249 var51;
            if (var11 == -1 && var10.field2290 == null) {
                var51 = var10.method3752(10, arg5, var18, var20, var19, var21);
            } else {
                var51 = new class81(arg4, 10, arg5, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            if (var51 != null) {
                arg8.method4389(arg0, arg2, arg3, var19, var12, var13, var51, arg6 == 11 ? 256 : 0, var22, var24);
            }
            if (var10.field2265 != 0) {
                arg9.method4000(arg2, arg3, var12, var13, var10.field2275);
            }
        } else if (arg6 >= 12) {
            class249 var26;
            if (var11 == -1 && var10.field2290 == null) {
                var26 = var10.method3752(arg6, arg5, var18, var20, var19, var21);
            } else {
                var26 = new class81(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4389(arg0, arg2, arg3, var19, 1, 1, var26, 0, var22, var24);
            if (var10.field2265 != 0) {
                arg9.method4000(arg2, arg3, var12, var13, var10.field2275);
            }
        } else if (arg6 == 0) {
            class249 var27;
            if (var11 == -1 && var10.field2290 == null) {
                var27 = var10.method3752(0, arg5, var18, var20, var19, var21);
            } else {
                var27 = new class81(arg4, 0, arg5, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4352(arg0, arg2, arg3, var19, var27, (class249) null, field1036[arg5], 0, var22, var24);
            if (var10.field2265 != 0) {
                arg9.method3999(arg2, arg3, arg6, arg5, var10.field2275);
            }
        } else if (arg6 == 1) {
            class249 var28;
            if (var11 == -1 && var10.field2290 == null) {
                var28 = var10.method3752(1, arg5, var18, var20, var19, var21);
            } else {
                var28 = new class81(arg4, 1, arg5, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4352(arg0, arg2, arg3, var19, var28, (class249) null, field1045[arg5], 0, var22, var24);
            if (var10.field2265 != 0) {
                arg9.method3999(arg2, arg3, arg6, arg5, var10.field2275);
            }
        } else if (arg6 == 2) {
            int var29 = arg5 + 1 & 0x3;
            class249 var30;
            class249 var31;
            if (var11 == -1 && var10.field2290 == null) {
                var30 = var10.method3752(2, arg5 + 4, var18, var20, var19, var21);
                var31 = var10.method3752(2, var29, var18, var20, var19, var21);
            } else {
                var30 = new class81(arg4, 2, arg5 + 4, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
                var31 = new class81(arg4, 2, var29, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4352(arg0, arg2, arg3, var19, var30, var31, field1036[arg5], field1036[var29], var22, var24);
            if (var10.field2265 != 0) {
                arg9.method3999(arg2, arg3, arg6, arg5, var10.field2275);
            }
        } else if (arg6 == 3) {
            class249 var32;
            if (var11 == -1 && var10.field2290 == null) {
                var32 = var10.method3752(3, arg5, var18, var20, var19, var21);
            } else {
                var32 = new class81(arg4, 3, arg5, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4352(arg0, arg2, arg3, var19, var32, (class249) null, field1045[arg5], 0, var22, var24);
            if (var10.field2265 != 0) {
                arg9.method3999(arg2, arg3, arg6, arg5, var10.field2275);
            }
        } else if (arg6 == 9) {
            class249 var33;
            if (var11 == -1 && var10.field2290 == null) {
                var33 = var10.method3752(arg6, arg5, var18, var20, var19, var21);
            } else {
                var33 = new class81(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4389(arg0, arg2, arg3, var19, 1, 1, var33, 0, var22, var24);
            if (var10.field2265 != 0) {
                arg9.method4000(arg2, arg3, var12, var13, var10.field2275);
            }
        } else if (arg6 == 4) {
            class249 var34;
            if (var11 == -1 && var10.field2290 == null) {
                var34 = var10.method3752(4, arg5, var18, var20, var19, var21);
            } else {
                var34 = new class81(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4353(arg0, arg2, arg3, var19, var34, (class249) null, field1036[arg5], 0, 0, 0, var22, var24);
        } else if (arg6 == 5) {
            int var35 = 16;
            long var36 = arg8.method4370(arg0, arg2, arg3);
            if (var36 != 0L) {
                var35 = class222.method2212(class257.method3531(var36)).field2271;
            }
            class249 var38;
            if (var11 == -1 && var10.field2290 == null) {
                var38 = var10.method3752(4, arg5, var18, var20, var19, var21);
            } else {
                var38 = new class81(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4353(arg0, arg2, arg3, var19, var38, (class249) null, field1036[arg5], 0, field1038[arg5] * var35, field1039[arg5] * var35, var22, var24);
        } else if (arg6 == 6) {
            int var39 = 8;
            long var40 = arg8.method4370(arg0, arg2, arg3);
            if (var40 != 0L) {
                var39 = class222.method2212(class257.method3531(var40)).field2271 / 2;
            }
            class249 var42;
            if (var11 == -1 && var10.field2290 == null) {
                var42 = var10.method3752(4, arg5 + 4, var18, var20, var19, var21);
            } else {
                var42 = new class81(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4353(arg0, arg2, arg3, var19, var42, (class249) null, 256, arg5, field1040[arg5] * var39, field1041[arg5] * var39, var22, var24);
        } else if (arg6 == 7) {
            int var43 = arg5 + 2 & 0x3;
            class249 var44;
            if (var11 == -1 && var10.field2290 == null) {
                var44 = var10.method3752(4, var43 + 4, var18, var20, var19, var21);
            } else {
                var44 = new class81(arg4, 4, var43 + 4, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4353(arg0, arg2, arg3, var19, var44, (class249) null, 256, var43, 0, 0, var22, var24);
        } else if (arg6 == 8) {
            int var45 = 8;
            long var46 = arg8.method4370(arg0, arg2, arg3);
            if (var46 != 0L) {
                var45 = class222.method2212(class257.method3531(var46)).field2271 / 2;
            }
            int var48 = arg5 + 2 & 0x3;
            class249 var49;
            class249 var50;
            if (var11 == -1 && var10.field2290 == null) {
                var49 = var10.method3752(4, arg5 + 4, var18, var20, var19, var21);
                var50 = var10.method3752(4, var48 + 4, var18, var20, var19, var21);
            } else {
                var49 = new class81(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
                var50 = new class81(arg4, 4, var48 + 4, arg1, arg2, arg3, var11, var10.field2281, (class249) null);
            }
            arg8.method4353(arg0, arg2, arg3, var19, var49, var50, 256, arg5, field1040[arg5] * var45, field1041[arg5] * var45, var22, var24);
        }
    }
}
