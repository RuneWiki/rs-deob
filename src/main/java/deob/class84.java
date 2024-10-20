package deob;

@ObfuscatedName("do")
public final class class84 {

    @ObfuscatedName("do.ak")
    public static int field1053 = 99;

    @ObfuscatedName("do.ay")
    public static final int[] field1060 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("do.au")
    public static final int[] field1048 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("do.as")
    public static final int[] field1054 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("do.aw")
    public static final int[] field1055 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("do.ad")
    public static final int[] field1056 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("do.ai")
    public static final int[] field1057 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("do.an")
    public static int field1058 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("do.am")
    public static int field1059 = (int) (Math.random() * 33.0D) - 16;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pu.ak(I)V")
    public static void method6717() {
        field1053 = 99;
        Statics.field2012 = new short[4][104][104];
        Statics.field1049 = new short[4][104][104];
        Statics.field2790 = new byte[4][104][104];
        Statics.field3976 = new byte[4][104][104];
        Statics.field4796 = new int[4][105][105];
        Statics.field2075 = new byte[4][105][105];
        Statics.field85 = new int[105][105];
        Statics.field2240 = new int[104];
        Statics.field1998 = new int[104];
        Statics.field1050 = new int[104];
        Statics.field1573 = new int[104];
        Statics.field1051 = new int[104];
    }

    @ObfuscatedName("eq.al(I)V")
    public static void method2878() {
        Statics.field2012 = (short[][][]) null;
        Statics.field1049 = (short[][][]) null;
        Statics.field2790 = (byte[][][]) null;
        Statics.field3976 = (byte[][][]) null;
        Statics.field4796 = (int[][][]) null;
        Statics.field2075 = (byte[][][]) null;
        Statics.field85 = (int[][]) null;
        Statics.field2240 = null;
        Statics.field1998 = null;
        Statics.field1050 = null;
        Statics.field1573 = null;
        Statics.field1051 = null;
    }

    @ObfuscatedName("im.aj(Ldt;IIIIB)V")
    public static final void method4145(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        int[][][] var5 = arg0.field1340;
        int var6 = arg0.field1347 - 1;
        int var7 = arg0.field1331 - 1;
        for (int var8 = arg2; var8 <= arg2 + arg4; var8++) {
            for (int var9 = arg1; var9 <= arg1 + arg3; var9++) {
                if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
                    Statics.field2075[0][var9][var8] = 127;
                    if (arg1 == var9 && var9 > 0) {
                        var5[0][var9][var8] = var5[0][var9 - 1][var8];
                    }
                    if (arg1 + arg3 == var9 && var9 < var6) {
                        var5[0][var9][var8] = var5[0][var9 + 1][var8];
                    }
                    if (arg2 == var8 && var8 > 0) {
                        var5[0][var9][var8] = var5[0][var9][var8 - 1];
                    }
                    if (arg2 + arg4 == var8 && var8 < var7) {
                        var5[0][var9][var8] = var5[0][var9][var8 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("sz.az(Ldt;[BIIIII)V")
    public static final void method8108(class102 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0.field1333 != null) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < 64; var7++) {
                    for (int var8 = 0; var8 < 64; var8++) {
                        if (arg2 + var7 > 0 && arg2 + var7 < arg0.field1333[var6].field2481.length && arg3 + var8 > 0 && arg3 + var8 < arg0.field1333[var6].field2481[arg2 + var7].length) {
                            arg0.field1333[var6].field2481[arg2 + var7][arg3 + var8] &= 0xBFFFFFFF;
                        }
                    }
                }
            }
        }
        class546 var9 = new class546(arg1);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg2 + var11;
                    int var14 = arg3 + var12;
                    method3086(arg0, var9, var10, var13, var14, arg4 + var13, arg5 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("ek.af(Ldt;[BIIIIIIIIII)V")
    public static final void method2860(class102 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class232[] var11 = arg0.field1333;
        if (var11 != null) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < var11[arg2].field2481.length && arg4 + var13 > 0 && arg4 + var13 < var11[arg2].field2481[arg3 + var12].length) {
                        var11[arg2].field2481[arg3 + var12][arg4 + var13] &= 0xBFFFFFFF;
                    }
                }
            }
        }
        class546 var14 = new class546(arg1);
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg5 == var15 && var16 >= arg6 && var16 < arg6 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
                        int var19 = var16 & 0x7;
                        int var20 = var17 & 0x7;
                        int var22 = arg8 & 0x3;
                        int var23;
                        if (var22 == 0) {
                            var23 = var19;
                        } else if (var22 == 1) {
                            var23 = var20;
                        } else if (var22 == 2) {
                            var23 = 7 - var19;
                        } else {
                            var23 = 7 - var20;
                        }
                        int var24 = arg3 + var23;
                        int var25 = arg4 + class351.method5427(var16 & 0x7, var17 & 0x7, arg8);
                        int var26 = (var16 & 0x7) + arg3 + arg9;
                        int var27 = (var17 & 0x7) + arg4 + arg10;
                        method3086(arg0, var14, arg2, var24, var25, var26, var27, arg8);
                    } else {
                        method3086(arg0, var14, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ic.aa([[[IIIII)V")
    public static final void method4065(int[][][] arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var5 = 0; var5 < 8; var5++) {
                arg0[arg1][arg2 + var4][arg3 + var5] = 0;
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                arg0[arg1][arg2][arg3 + var6] = arg0[arg1][arg2 - 1][arg3 + var6];
            }
        }
        if (arg3 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                arg0[arg1][arg2 + var7][arg3] = arg0[arg1][arg2 + var7][arg3 - 1];
            }
        }
        if (arg2 > 0 && arg0[arg1][arg2 - 1][arg3] != 0) {
            arg0[arg1][arg2][arg3] = arg0[arg1][arg2 - 1][arg3];
        } else if (arg3 > 0 && arg0[arg1][arg2][arg3 - 1] != 0) {
            arg0[arg1][arg2][arg3] = arg0[arg1][arg2][arg3 - 1];
        } else if (arg2 > 0 && arg3 > 0 && arg0[arg1][arg2 - 1][arg3 - 1] != 0) {
            arg0[arg1][arg2][arg3] = arg0[arg1][arg2 - 1][arg3 - 1];
        }
    }

    @ObfuscatedName("fq.at(Ldt;Lua;IIIIIIB)V")
    public static final void method3086(class102 arg0, class546 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[][][] var8 = arg0.field1340;
        byte[][][] var9 = arg0.field1341;
        if (arg2 < 0 || arg2 >= 4 || arg3 < 0 || arg3 >= var8[0].length - 1 || arg4 < 0 || arg4 >= var8[0][0].length - 1) {
            while (true) {
                int var12 = arg1.method8798();
                if (var12 == 0) {
                    break;
                }
                if (var12 == 1) {
                    arg1.method8796();
                    break;
                }
                if (var12 <= 49) {
                    arg1.method8926();
                }
            }
            return;
        }
        var9[arg2][arg3][arg4] = 0;
        while (true) {
            int var10 = arg1.method8798();
            if (var10 == 0) {
                if (arg2 == 0) {
                    var8[0][arg3][arg4] = -method3448(arg5 + 932731, arg6 + 556238) * 8;
                } else {
                    var8[arg2][arg3][arg4] = var8[arg2 - 1][arg3][arg4] - 240;
                }
                break;
            }
            if (var10 == 1) {
                int var11 = arg1.method8796();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg2 == 0) {
                    var8[0][arg3][arg4] = -var11 * 8;
                } else {
                    var8[arg2][arg3][arg4] = var8[arg2 - 1][arg3][arg4] - var11 * 8;
                }
                break;
            }
            if (var10 <= 49) {
                Statics.field1049[arg2][arg3][arg4] = (short) arg1.method8926();
                Statics.field2790[arg2][arg3][arg4] = (byte) ((var10 - 2) / 4);
                Statics.field3976[arg2][arg3][arg4] = (byte) (var10 - 2 + arg7 & 0x3);
            } else if (var10 <= 81) {
                var9[arg2][arg3][arg4] = (byte) (var10 - 49);
            } else {
                Statics.field2012[arg2][arg3][arg4] = (short) (var10 - 81);
            }
        }
    }

    @ObfuscatedName("sm.ab([BIII)Z")
    public static final boolean method8032(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class546 var4 = new class546(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8812();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8810();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8796() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class224 var16 = class224.method3868(var5);
                        if (var13 != 22 || !client.field642 || var16.field2293 != 0 || var16.field2321 == 1 || var16.field2314) {
                            if (!var16.method3877()) {
                                client.field700++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8810();
                if (var9 == 0) {
                    break;
                }
                var4.method8796();
            }
        }
    }

    @ObfuscatedName("fr.ac(Ldt;[BIII)V")
    public static final void method2969(class102 arg0, byte[] arg1, int arg2, int arg3) {
        class546 var4 = new class546(arg1);
        int var5 = -1;
        while (true) {
            int var6 = var4.method8812();
            if (var6 == 0) {
                return;
            }
            var5 += var6;
            int var7 = 0;
            while (true) {
                int var8 = var4.method8810();
                if (var8 == 0) {
                    break;
                }
                var7 += var8 - 1;
                int var9 = var7 & 0x3F;
                int var10 = var7 >> 6 & 0x3F;
                int var11 = var7 >> 12;
                int var12 = var4.method8796();
                int var13 = var12 >> 2;
                int var14 = var12 & 0x3;
                int var15 = arg2 + var10;
                int var16 = arg3 + var9;
                if (var15 > 0 && var16 > 0 && var15 < arg0.field1340[0].length - 2 && var16 < arg0.field1340[0][0].length - 2) {
                    int var17 = var11;
                    if ((arg0.field1341[1][var15][var16] & 0x2) == 2) {
                        var17 = var11 - 1;
                    }
                    class232 var18 = null;
                    if (var17 >= 0 && arg0.field1333 != null) {
                        var18 = arg0.field1333[var17];
                    }
                    method2913(arg0, var11, var15, var16, var5, var14, var13, var18);
                }
            }
        }
    }

    @ObfuscatedName("do.ao(Ldt;[BIIIIIII)V")
    public static final void method2155(class102 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class546 var9 = new class546(arg1);
        int var10 = -1;
        while (true) {
            int var11 = var9.method8812();
            if (var11 == 0) {
                return;
            }
            var10 += var11;
            int var12 = 0;
            while (true) {
                int var13 = var9.method8810();
                if (var13 == 0) {
                    break;
                }
                var12 += var13 - 1;
                int var14 = var12 & 0x3F;
                int var15 = var12 >> 6 & 0x3F;
                int var16 = var12 >> 12;
                int var17 = var9.method8796();
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                if (arg5 == var16 && var15 >= arg6 && var15 < arg6 + 8 && var14 >= arg7 && var14 < arg7 + 8) {
                    class224 var20 = class224.method3868(var10);
                    int var22 = var15 & 0x7;
                    int var23 = var14 & 0x7;
                    int var25 = var20.field2291;
                    int var26 = var20.field2292;
                    if ((var19 & 0x1) == 1) {
                        int var27 = var25;
                        var25 = var26;
                        var26 = var27;
                    }
                    int var28 = arg8 & 0x3;
                    int var29;
                    if (var28 == 0) {
                        var29 = var22;
                    } else if (var28 == 1) {
                        var29 = var23;
                    } else if (var28 == 2) {
                        var29 = 7 - var22 - (var25 - 1);
                    } else {
                        var29 = 7 - var23 - (var26 - 1);
                    }
                    int var30 = arg3 + var29;
                    int var32 = var15 & 0x7;
                    int var33 = var14 & 0x7;
                    int var35 = var20.field2291;
                    int var36 = var20.field2292;
                    if ((var19 & 0x1) == 1) {
                        int var37 = var35;
                        var35 = var36;
                        var36 = var37;
                    }
                    int var38 = arg8 & 0x3;
                    int var39;
                    if (var38 == 0) {
                        var39 = var33;
                    } else if (var38 == 1) {
                        var39 = 7 - var32 - (var35 - 1);
                    } else if (var38 == 2) {
                        var39 = 7 - var33 - (var36 - 1);
                    } else {
                        var39 = var32;
                    }
                    int var40 = arg4 + var39;
                    if (var30 > 0 && var40 > 0 && var30 < arg0.field1347 - 1 && var40 < arg0.field1331 - 1) {
                        int var41 = arg2;
                        if ((arg0.field1341[1][var30][var40] & 0x2) == 2) {
                            var41 = arg2 - 1;
                        }
                        class232 var42 = null;
                        if (var41 >= 0 && arg0.field1333 != null) {
                            var42 = arg0.field1333[var41];
                        }
                        method2913(arg0, arg2, var30, var40, var10, arg8 + var19 & 0x3, var18, var42);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fh.ah(Ldt;IIIIIILir;B)V")
    public static final void method2913(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class232 arg7) {
        if (client.field642 && (arg0.field1341[0][arg2][arg3] & 0x2) == 0 && (arg0.field1341[arg1][arg2][arg3] & 0x10) != 0) {
            return;
        }
        if (arg1 < field1053) {
            field1053 = arg1;
        }
        class224 var8 = class224.method3868(arg4);
        int var9;
        int var10;
        if (arg5 == 1 || arg5 == 3) {
            var9 = var8.field2292;
            var10 = var8.field2291;
        } else {
            var9 = var8.field2291;
            var10 = var8.field2292;
        }
        int var11;
        int var12;
        if (arg2 + var9 <= arg0.field1347) {
            var11 = (var9 >> 1) + arg2;
            var12 = (var9 + 1 >> 1) + arg2;
        } else {
            var11 = arg2;
            var12 = arg2 + 1;
        }
        int var13;
        int var14;
        if (arg3 + var10 <= arg0.field1331) {
            var13 = (var10 >> 1) + arg3;
            var14 = (var10 + 1 >> 1) + arg3;
        } else {
            var13 = arg3;
            var14 = arg3 + 1;
        }
        int[][] var15 = arg0.field1340[arg1];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg2 << 7) + (var9 << 6);
        int var18 = (arg3 << 7) + (var10 << 6);
        long var19 = class265.method3598(arg2, arg3, 2, var8.field2293 == 0, arg4, arg0.field1336);
        int var21 = (arg5 << 6) + arg6;
        if (var8.field2326 == 1) {
            var21 += 256;
        }
        if (var8.method3911()) {
            class72.method852(arg1, arg2, arg3, var8, arg5);
        }
        class253 var22 = arg0.field1332;
        if (arg6 == 22) {
            if (!client.field642 || var8.field2293 != 0 || var8.field2321 == 1 || var8.field2314) {
                class256 var23;
                if (var8.field2299 == -1 && var8.field2317 == null) {
                    var23 = var8.method3878(22, arg5, var15, var17, var16, var18);
                } else {
                    var23 = new class82(arg0, arg4, 22, arg5, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
                }
                var22.method4638(arg1, arg2, arg3, var16, var23, var19, var21);
                if (var8.field2321 == 1 && arg7 != null) {
                    arg7.method4116(arg2, arg3);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class256 var49;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var49 = var8.method3878(10, arg5, var15, var17, var16, var18);
            } else {
                var49 = new class82(arg0, arg4, 10, arg5, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            if (var49 != null && var22.method4511(arg1, arg2, arg3, var16, var9, var10, var49, arg6 == 11 ? 256 : 0, var19, var21) && var8.field2307) {
                int var50 = 15;
                if (var49 instanceof class264) {
                    var50 = ((class264) var49).method4808() / 4;
                    if (var50 > 30) {
                        var50 = 30;
                    }
                }
                for (int var51 = 0; var51 <= var9; var51++) {
                    for (int var52 = 0; var52 <= var10; var52++) {
                        if (var50 > Statics.field2075[arg1][arg2 + var51][arg3 + var52]) {
                            Statics.field2075[arg1][arg2 + var51][arg3 + var52] = (byte) var50;
                        }
                    }
                }
            }
            if (var8.field2321 != 0 && arg7 != null) {
                arg7.method4111(arg2, arg3, var9, var10, var8.field2294);
            }
        } else if (arg6 >= 12) {
            class256 var24;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var24 = var8.method3878(arg6, arg5, var15, var17, var16, var18);
            } else {
                var24 = new class82(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4511(arg1, arg2, arg3, var16, 1, 1, var24, 0, var19, var21);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
                Statics.field4796[arg1][arg2][arg3] |= 0x924;
            }
            if (var8.field2321 != 0 && arg7 != null) {
                arg7.method4111(arg2, arg3, var9, var10, var8.field2294);
            }
        } else if (arg6 == 0) {
            class256 var25;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var25 = var8.method3878(0, arg5, var15, var17, var16, var18);
            } else {
                var25 = new class82(arg0, arg4, 0, arg5, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4509(arg1, arg2, arg3, var16, var25, (class256) null, field1060[arg5], 0, var19, var21);
            if (arg5 == 0) {
                if (var8.field2307) {
                    Statics.field2075[arg1][arg2][arg3] = 50;
                    Statics.field2075[arg1][arg2][arg3 + 1] = 50;
                }
                if (var8.field2279) {
                    Statics.field4796[arg1][arg2][arg3] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var8.field2307) {
                    Statics.field2075[arg1][arg2][arg3 + 1] = 50;
                    Statics.field2075[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2279) {
                    Statics.field4796[arg1][arg2][arg3 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var8.field2307) {
                    Statics.field2075[arg1][arg2 + 1][arg3] = 50;
                    Statics.field2075[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2279) {
                    Statics.field4796[arg1][arg2 + 1][arg3] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var8.field2307) {
                    Statics.field2075[arg1][arg2][arg3] = 50;
                    Statics.field2075[arg1][arg2 + 1][arg3] = 50;
                }
                if (var8.field2279) {
                    Statics.field4796[arg1][arg2][arg3] |= 0x492;
                }
            }
            if (var8.field2321 != 0 && arg7 != null) {
                arg7.method4113(arg2, arg3, arg6, arg5, var8.field2294);
            }
            if (var8.field2300 != 16) {
                var22.method4536(arg1, arg2, arg3, var8.field2300);
            }
        } else if (arg6 == 1) {
            class256 var26;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var26 = var8.method3878(1, arg5, var15, var17, var16, var18);
            } else {
                var26 = new class82(arg0, arg4, 1, arg5, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4509(arg1, arg2, arg3, var16, var26, (class256) null, field1048[arg5], 0, var19, var21);
            if (var8.field2307) {
                if (arg5 == 0) {
                    Statics.field2075[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field2075[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field2075[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field2075[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2321 != 0 && arg7 != null) {
                arg7.method4113(arg2, arg3, arg6, arg5, var8.field2294);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class256 var28;
            class256 var29;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var28 = var8.method3878(2, arg5 + 4, var15, var17, var16, var18);
                var29 = var8.method3878(2, var27, var15, var17, var16, var18);
            } else {
                var28 = new class82(arg0, arg4, 2, arg5 + 4, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
                var29 = new class82(arg0, arg4, 2, var27, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4509(arg1, arg2, arg3, var16, var28, var29, field1060[arg5], field1060[var27], var19, var21);
            if (var8.field2279) {
                if (arg5 == 0) {
                    Statics.field4796[arg1][arg2][arg3] |= 0x249;
                    Statics.field4796[arg1][arg2][arg3 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    Statics.field4796[arg1][arg2][arg3 + 1] |= 0x492;
                    Statics.field4796[arg1][arg2 + 1][arg3] |= 0x249;
                } else if (arg5 == 2) {
                    Statics.field4796[arg1][arg2 + 1][arg3] |= 0x249;
                    Statics.field4796[arg1][arg2][arg3] |= 0x492;
                } else if (arg5 == 3) {
                    Statics.field4796[arg1][arg2][arg3] |= 0x492;
                    Statics.field4796[arg1][arg2][arg3] |= 0x249;
                }
            }
            if (var8.field2321 != 0 && arg7 != null) {
                arg7.method4113(arg2, arg3, arg6, arg5, var8.field2294);
            }
            if (var8.field2300 != 16) {
                var22.method4536(arg1, arg2, arg3, var8.field2300);
            }
        } else if (arg6 == 3) {
            class256 var30;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var30 = var8.method3878(3, arg5, var15, var17, var16, var18);
            } else {
                var30 = new class82(arg0, arg4, 3, arg5, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4509(arg1, arg2, arg3, var16, var30, (class256) null, field1048[arg5], 0, var19, var21);
            if (var8.field2307) {
                if (arg5 == 0) {
                    Statics.field2075[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field2075[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field2075[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field2075[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2321 != 0 && arg7 != null) {
                arg7.method4113(arg2, arg3, arg6, arg5, var8.field2294);
            }
        } else if (arg6 == 9) {
            class256 var31;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var31 = var8.method3878(arg6, arg5, var15, var17, var16, var18);
            } else {
                var31 = new class82(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4511(arg1, arg2, arg3, var16, 1, 1, var31, 0, var19, var21);
            if (var8.field2321 != 0 && arg7 != null) {
                arg7.method4111(arg2, arg3, var9, var10, var8.field2294);
            }
            if (var8.field2300 != 16) {
                var22.method4536(arg1, arg2, arg3, var8.field2300);
            }
        } else if (arg6 == 4) {
            class256 var32;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var32 = var8.method3878(4, arg5, var15, var17, var16, var18);
            } else {
                var32 = new class82(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4699(arg1, arg2, arg3, var16, var32, (class256) null, field1060[arg5], 0, 0, 0, var19, var21);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = var22.method4527(arg1, arg2, arg3);
            if (var34 != 0L) {
                var33 = class224.method3868(class265.method2622(var34)).field2300;
            }
            class256 var36;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var36 = var8.method3878(4, arg5, var15, var17, var16, var18);
            } else {
                var36 = new class82(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4699(arg1, arg2, arg3, var16, var36, (class256) null, field1060[arg5], 0, field1054[arg5] * var33, field1055[arg5] * var33, var19, var21);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = var22.method4527(arg1, arg2, arg3);
            if (var38 != 0L) {
                var37 = class224.method3868(class265.method2622(var38)).field2300 / 2;
            }
            class256 var40;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var40 = var8.method3878(4, arg5 + 4, var15, var17, var16, var18);
            } else {
                var40 = new class82(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4699(arg1, arg2, arg3, var16, var40, (class256) null, 256, arg5, field1056[arg5] * var37, field1057[arg5] * var37, var19, var21);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class256 var42;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var42 = var8.method3878(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class82(arg0, arg4, 4, var41 + 4, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4699(arg1, arg2, arg3, var16, var42, (class256) null, 256, var41, 0, 0, var19, var21);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = var22.method4527(arg1, arg2, arg3);
            if (var44 != 0L) {
                var43 = class224.method3868(class265.method2622(var44)).field2300 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class256 var47;
            class256 var48;
            if (var8.field2299 == -1 && var8.field2317 == null) {
                var47 = var8.method3878(4, arg5 + 4, var15, var17, var16, var18);
                var48 = var8.method3878(4, var46 + 4, var15, var17, var16, var18);
            } else {
                var47 = new class82(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
                var48 = new class82(arg0, arg4, 4, var46 + 4, arg1, arg2, arg3, var8.field2299, var8.field2304, (class256) null);
            }
            var22.method4699(arg1, arg2, arg3, var16, var47, var48, 256, arg5, field1056[arg5] * var43, field1057[arg5] * var43, var19, var21);
        }
    }

    @ObfuscatedName("uy.av(Ldt;I)V")
    public static final void method8665(class102 arg0) {
        int var1 = arg0.field1347;
        int var2 = arg0.field1331;
        int[][][] var3 = arg0.field1340;
        byte[][][] var4 = arg0.field1341;
        class253 var5 = arg0.field1332;
        class232[] var6 = arg0.field1333;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var8 = 0; var8 < var1; var8++) {
                for (int var9 = 0; var9 < var2; var9++) {
                    if ((arg0.field1341[var7][var8][var9] & 0x1) == 1) {
                        int var10 = var7;
                        if ((arg0.field1341[1][var8][var9] & 0x2) == 2) {
                            var10 = var7 - 1;
                        }
                        if (var10 >= 0 && var6 != null) {
                            var6[var10].method4115(var8, var9);
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
        for (int var11 = 0; var11 < 4; var11++) {
            byte[][] var12 = Statics.field2075[var11];
            boolean var13 = true;
            boolean var14 = true;
            boolean var15 = true;
            boolean var16 = true;
            boolean var17 = true;
            int var18 = (int) Math.sqrt(5100.0D);
            int var19 = var18 * 768 >> 8;
            for (int var20 = 1; var20 < var2 - 1; var20++) {
                for (int var21 = 1; var21 < var1 - 1; var21++) {
                    int var22 = var3[var11][var21 + 1][var20] - var3[var11][var21 - 1][var20];
                    int var23 = var3[var11][var21][var20 + 1] - var3[var11][var21][var20 - 1];
                    int var24 = (int) Math.sqrt((double) (var23 * var23 + var22 * var22 + 65536));
                    int var25 = (var22 << 8) / var24;
                    int var26 = 65536 / var24;
                    int var27 = (var23 << 8) / var24;
                    int var28 = (var27 * -50 + var25 * -50 + var26 * -10) / var19 + 96;
                    int var29 = (var12[var21][var20] >> 1) + (var12[var21][var20 + 1] >> 3) + (var12[var21][var20 - 1] >> 2) + (var12[var21 - 1][var20] >> 2) + (var12[var21 + 1][var20] >> 3);
                    Statics.field85[var21][var20] = var28 - var29;
                }
            }
            for (int var30 = 0; var30 < var2; var30++) {
                Statics.field2240[var30] = 0;
                Statics.field1998[var30] = 0;
                Statics.field1050[var30] = 0;
                Statics.field1573[var30] = 0;
                Statics.field1051[var30] = 0;
            }
            for (int var31 = -5; var31 < var1 + 5; var31++) {
                for (int var32 = 0; var32 < var2; var32++) {
                    int var33 = var31 + 5;
                    int var10002;
                    if (var33 >= 0 && var33 < var1) {
                        int var34 = (int) class328.method5918(15);
                        int var35 = Statics.field2012[var11][var33][var32] & var34;
                        if (var35 > 0) {
                            class216 var36 = class216.method3871(var35 - 1);
                            Statics.field2240[var32] += var36.field2213;
                            Statics.field1998[var32] += var36.field2209;
                            Statics.field1050[var32] += var36.field2214;
                            Statics.field1573[var32] += var36.field2215;
                            var10002 = Statics.field1051[var32]++;
                        }
                    }
                    int var37 = var31 - 5;
                    if (var37 >= 0 && var37 < var1) {
                        int var38 = (int) class328.method5918(15);
                        int var39 = Statics.field2012[var11][var37][var32] & var38;
                        if (var39 > 0) {
                            class216 var40 = class216.method3871(var39 - 1);
                            Statics.field2240[var32] -= var40.field2213;
                            Statics.field1998[var32] -= var40.field2209;
                            Statics.field1050[var32] -= var40.field2214;
                            Statics.field1573[var32] -= var40.field2215;
                            var10002 = Statics.field1051[var32]--;
                        }
                    }
                }
                if (var31 >= 1 && var31 < var1 - 1) {
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    int var44 = 0;
                    int var45 = 0;
                    for (int var46 = -5; var46 < var2 + 5; var46++) {
                        int var47 = var46 + 5;
                        if (var47 >= 0 && var47 < var2) {
                            var41 += Statics.field2240[var47];
                            var42 += Statics.field1998[var47];
                            var43 += Statics.field1050[var47];
                            var44 += Statics.field1573[var47];
                            var45 += Statics.field1051[var47];
                        }
                        int var48 = var46 - 5;
                        if (var48 >= 0 && var48 < var2) {
                            var41 -= Statics.field2240[var48];
                            var42 -= Statics.field1998[var48];
                            var43 -= Statics.field1050[var48];
                            var44 -= Statics.field1573[var48];
                            var45 -= Statics.field1051[var48];
                        }
                        if (var46 >= 1 && var46 < var2 - 1 && (!client.field642 || (var4[0][var31][var46] & 0x2) != 0 || (var4[var11][var31][var46] & 0x10) == 0)) {
                            if (var11 < field1053) {
                                field1053 = var11;
                            }
                            int var49 = (int) class328.method5918(15);
                            int var50 = Statics.field2012[var11][var31][var46] & var49;
                            int var51 = Statics.field1049[var11][var31][var46] & var49;
                            if (var50 > 0 || var51 > 0) {
                                int var52 = var3[var11][var31][var46];
                                int var53 = var3[var11][var31 + 1][var46];
                                int var54 = var3[var11][var31 + 1][var46 + 1];
                                int var55 = var3[var11][var31][var46 + 1];
                                int var56 = Statics.field85[var31][var46];
                                int var57 = Statics.field85[var31 + 1][var46];
                                int var58 = Statics.field85[var31 + 1][var46 + 1];
                                int var59 = Statics.field85[var31][var46 + 1];
                                int var60 = -1;
                                int var61 = -1;
                                if (var50 > 0) {
                                    int var62 = var41 * 256 / var44;
                                    int var63 = var42 / var45;
                                    int var64 = var43 / var45;
                                    var60 = Statics.method7307(var62, var63, var64);
                                    int var65 = field1058 + var62 & 0xFF;
                                    int var66 = field1059 + var64;
                                    if (var66 < 0) {
                                        var66 = 0;
                                    } else if (var66 > 255) {
                                        var66 = 255;
                                    }
                                    var61 = Statics.method7307(var65, var63, var66);
                                }
                                if (var11 > 0) {
                                    boolean var67 = true;
                                    if (var50 == 0 && Statics.field2790[var11][var31][var46] != 0) {
                                        var67 = false;
                                    }
                                    if (var51 > 0) {
                                        int var68 = var51 - 1;
                                        class226 var69 = (class226) class226.field2395.method5570((long) var68);
                                        class226 var70;
                                        if (var69 == null) {
                                            byte[] var71 = Statics.field2390.method6573(4, var68);
                                            class226 var72 = new class226();
                                            if (var71 != null) {
                                                var72.method3993(new class546(var71), var68);
                                            }
                                            var72.method3994();
                                            class226.field2395.method5564(var72, (long) var68);
                                            var70 = var72;
                                        } else {
                                            var70 = var69;
                                        }
                                        if (!var70.field2393) {
                                            var67 = false;
                                        }
                                    }
                                    if (var67 && var52 == var53 && var52 == var54 && var52 == var55) {
                                        Statics.field4796[var11][var31][var46] |= 0x924;
                                    }
                                }
                                int var73 = 0;
                                if (var61 != -1) {
                                    var73 = class248.field2666[method7043(var61, 96)];
                                }
                                if (var51 == 0) {
                                    var5.method4607(var11, var31, var46, 0, 0, -1, var52, var53, var54, var55, method7043(var60, var56), method7043(var60, var57), method7043(var60, var58), method7043(var60, var59), 0, 0, 0, 0, var73, 0);
                                } else {
                                    int var74 = Statics.field2790[var11][var31][var46] + 1;
                                    byte var75 = Statics.field3976[var11][var31][var46];
                                    int var76 = var51 - 1;
                                    class226 var77 = (class226) class226.field2395.method5570((long) var76);
                                    class226 var78;
                                    if (var77 == null) {
                                        byte[] var79 = Statics.field2390.method6573(4, var76);
                                        class226 var80 = new class226();
                                        if (var79 != null) {
                                            var80.method3993(new class546(var79), var76);
                                        }
                                        var80.method3994();
                                        class226.field2395.method5564(var80, (long) var76);
                                        var78 = var80;
                                    } else {
                                        var78 = var77;
                                    }
                                    int var82 = var78.field2402;
                                    int var83;
                                    int var84;
                                    if (var82 >= 0) {
                                        var83 = class248.field2670.field2978.method4752(var82);
                                        var84 = -1;
                                    } else if (var78.field2391 == 16711935) {
                                        var84 = -2;
                                        var82 = -1;
                                        var83 = -2;
                                    } else {
                                        var84 = Statics.method7307(var78.field2398, var78.field2396, var78.field2397);
                                        int var85 = field1058 + var78.field2398 & 0xFF;
                                        int var86 = field1059 + var78.field2397;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        var83 = Statics.method7307(var85, var78.field2396, var86);
                                    }
                                    int var87 = 0;
                                    if (var83 != -2) {
                                        var87 = class248.field2666[method80(var83, 96)];
                                    }
                                    if (var78.field2392 != -1) {
                                        int var88 = field1058 + var78.field2404 & 0xFF;
                                        int var89 = field1059 + var78.field2400;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        int var90 = Statics.method7307(var88, var78.field2399, var89);
                                        var87 = class248.field2666[method80(var90, 96)];
                                    }
                                    var5.method4607(var11, var31, var46, var74, var75, var82, var52, var53, var54, var55, method7043(var60, var56), method7043(var60, var57), method7043(var60, var58), method7043(var60, var59), method80(var84, var56), method80(var84, var57), method80(var84, var58), method80(var84, var59), var73, var87);
                                }
                            }
                        }
                    }
                }
            }
            for (int var91 = 1; var91 < var2 - 1; var91++) {
                for (int var92 = 1; var92 < var1 - 1; var92++) {
                    var5.method4517(var11, var92, var91, method5916(arg0, var11, var92, var91));
                }
            }
            Statics.field2012[var11] = (short[][]) null;
            Statics.field1049[var11] = (short[][]) null;
            Statics.field2790[var11] = (byte[][]) null;
            Statics.field3976[var11] = (byte[][]) null;
            Statics.field2075[var11] = (byte[][]) null;
        }
        var5.method4532(-50, -10, -50);
        for (int var93 = 0; var93 < var1; var93++) {
            for (int var94 = 0; var94 < var2; var94++) {
                if ((var4[1][var93][var94] & 0x2) == 2) {
                    var5.method4503(var93, var94);
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
                for (int var100 = 0; var100 <= var2; var100++) {
                    for (int var101 = 0; var101 <= var1; var101++) {
                        if ((Statics.field4796[var99][var101][var100] & var95) != 0) {
                            int var102 = var100;
                            int var103 = var100;
                            int var104 = var99;
                            int var105 = var99;
                            while (var102 > 0 && (Statics.field4796[var99][var101][var102 - 1] & var95) != 0) {
                                var102--;
                            }
                            while (var103 < var2 && (Statics.field4796[var99][var101][var103 + 1] & var95) != 0) {
                                var103++;
                            }
                            label357: while (var104 > 0) {
                                for (int var106 = var102; var106 <= var103; var106++) {
                                    if ((Statics.field4796[var104 - 1][var101][var106] & var95) == 0) {
                                        break label357;
                                    }
                                }
                                var104--;
                            }
                            label346: while (var105 < var98) {
                                for (int var107 = var102; var107 <= var103; var107++) {
                                    if ((Statics.field4796[var105 + 1][var101][var107] & var95) == 0) {
                                        break label346;
                                    }
                                }
                                var105++;
                            }
                            int var108 = (var105 + 1 - var104) * (var103 - var102 + 1);
                            if (var108 >= 8) {
                                short var109 = 240;
                                int var110 = var3[var105][var101][var102] - var109;
                                int var111 = var3[var104][var101][var102];
                                var5.method4585(var98, 1, var101 * 128, var101 * 128, var102 * 128, var103 * 128 + 128, var110, var111);
                                for (int var112 = var104; var112 <= var105; var112++) {
                                    for (int var113 = var102; var113 <= var103; var113++) {
                                        Statics.field4796[var112][var101][var113] &= ~var95;
                                    }
                                }
                            }
                        }
                        if ((Statics.field4796[var99][var101][var100] & var96) != 0) {
                            int var114 = var101;
                            int var115 = var101;
                            int var116 = var99;
                            int var117 = var99;
                            while (var114 > 0 && (Statics.field4796[var99][var114 - 1][var100] & var96) != 0) {
                                var114--;
                            }
                            while (var115 < var1 && (Statics.field4796[var99][var115 + 1][var100] & var96) != 0) {
                                var115++;
                            }
                            label410: while (var116 > 0) {
                                for (int var118 = var114; var118 <= var115; var118++) {
                                    if ((Statics.field4796[var116 - 1][var118][var100] & var96) == 0) {
                                        break label410;
                                    }
                                }
                                var116--;
                            }
                            label399: while (var117 < var98) {
                                for (int var119 = var114; var119 <= var115; var119++) {
                                    if ((Statics.field4796[var117 + 1][var119][var100] & var96) == 0) {
                                        break label399;
                                    }
                                }
                                var117++;
                            }
                            int var120 = (var117 + 1 - var116) * (var115 - var114 + 1);
                            if (var120 >= 8) {
                                short var121 = 240;
                                int var122 = var3[var117][var114][var100] - var121;
                                int var123 = var3[var116][var114][var100];
                                var5.method4585(var98, 2, var114 * 128, var115 * 128 + 128, var100 * 128, var100 * 128, var122, var123);
                                for (int var124 = var116; var124 <= var117; var124++) {
                                    for (int var125 = var114; var125 <= var115; var125++) {
                                        Statics.field4796[var124][var125][var100] &= ~var96;
                                    }
                                }
                            }
                        }
                        if ((Statics.field4796[var99][var101][var100] & var97) != 0) {
                            int var126 = var101;
                            int var127 = var101;
                            int var128 = var100;
                            int var129 = var100;
                            while (var128 > 0 && (Statics.field4796[var99][var101][var128 - 1] & var97) != 0) {
                                var128--;
                            }
                            while (var129 < var2 && (Statics.field4796[var99][var101][var129 + 1] & var97) != 0) {
                                var129++;
                            }
                            label463: while (var126 > 0) {
                                for (int var130 = var128; var130 <= var129; var130++) {
                                    if ((Statics.field4796[var99][var126 - 1][var130] & var97) == 0) {
                                        break label463;
                                    }
                                }
                                var126--;
                            }
                            label452: while (var127 < var1) {
                                for (int var131 = var128; var131 <= var129; var131++) {
                                    if ((Statics.field4796[var99][var127 + 1][var131] & var97) == 0) {
                                        break label452;
                                    }
                                }
                                var127++;
                            }
                            if ((var127 - var126 + 1) * (var129 - var128 + 1) >= 4) {
                                int var132 = var3[var99][var126][var128];
                                var5.method4585(var98, 4, var126 * 128, var127 * 128 + 128, var128 * 128, var129 * 128 + 128, var132, var132);
                                for (int var133 = var126; var133 <= var127; var133++) {
                                    for (int var134 = var128; var134 <= var129; var134++) {
                                        Statics.field4796[var99][var133][var134] &= ~var97;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("nk.aq(Ldt;IIIB)I")
    public static int method5916(class102 arg0, int arg1, int arg2, int arg3) {
        if ((arg0.field1341[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (arg0.field1341[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("hg.ap(IIB)I")
    public static final int method3448(int arg0, int arg1) {
        int var2 = method367(arg0 + 45365, arg1 + 91923, 4) - 128 + (method367(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method367(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ag.ae(IIII)I")
    public static final int method367(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method4316(var3, var5);
        int var8 = method4316(var3 + 1, var5);
        int var9 = method4316(var3, var5 + 1);
        int var10 = method4316(var3 + 1, var5 + 1);
        int var11 = 65536 - class248.field2669[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class248.field2669[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class248.field2669[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("jm.ax(III)I")
    public static final int method4316(int arg0, int arg1) {
        int var2 = method2883(arg0 - 1, arg1 - 1) + method2883(arg0 + 1, arg1 - 1) + method2883(arg0 - 1, arg1 + 1) + method2883(arg0 + 1, arg1 + 1);
        int var3 = method2883(arg0 - 1, arg1) + method2883(arg0 + 1, arg1) + method2883(arg0, arg1 - 1) + method2883(arg0, arg1 + 1);
        int var4 = method2883(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("eq.ay(III)I")
    public static final int method2883(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("pv.au(III)I")
    public static final int method7043(int arg0, int arg1) {
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

    @ObfuscatedName("ah.as(IIS)I")
    public static final int method80(int arg0, int arg1) {
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

    @ObfuscatedName("mu.ad(Ldt;IIIIIIIILir;B)V")
    public static final void method5833(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class232 arg9) {
        class224 var10 = class224.method3868(arg5);
        int var11 = arg8 >= 0 ? arg8 : var10.field2299;
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var12 = var10.field2292;
            var13 = var10.field2291;
        } else {
            var12 = var10.field2291;
            var13 = var10.field2292;
        }
        int var14;
        int var15;
        if (arg3 + var12 <= arg0.field1347) {
            var14 = (var12 >> 1) + arg3;
            var15 = (var12 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int var16;
        int var17;
        if (arg4 + var13 <= arg0.field1331) {
            var16 = (var13 >> 1) + arg4;
            var17 = (var13 + 1 >> 1) + arg4;
        } else {
            var16 = arg4;
            var17 = arg4 + 1;
        }
        int[][] var18 = arg0.field1340[arg2];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg3 << 7) + (var12 << 6);
        int var21 = (arg4 << 7) + (var13 << 6);
        class253 var22 = arg0.field1332;
        long var23 = class265.method3598(arg3, arg4, 2, var10.field2293 == 0, arg5, arg0.field1336);
        int var25 = (arg6 << 6) + arg7;
        if (var10.field2326 == 1) {
            var25 += 256;
        }
        if (arg7 == 22) {
            class256 var26;
            if (var11 == -1 && var10.field2317 == null) {
                var26 = var10.method3895(22, arg6, var18, var20, var19, var21);
            } else {
                var26 = new class82(arg0, arg5, 22, arg6, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4638(arg1, arg3, arg4, var19, var26, var23, var25);
            if (var10.field2321 == 1 && arg9 != null) {
                arg9.method4116(arg3, arg4);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class256 var52;
            if (var11 == -1 && var10.field2317 == null) {
                var52 = var10.method3895(10, arg6, var18, var20, var19, var21);
            } else {
                var52 = new class82(arg0, arg5, 10, arg6, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            if (var52 != null) {
                var22.method4511(arg1, arg3, arg4, var19, var12, var13, var52, arg7 == 11 ? 256 : 0, var23, var25);
            }
            if (var10.field2321 != 0 && arg9 != null) {
                arg9.method4111(arg3, arg4, var12, var13, var10.field2294);
            }
        } else if (arg7 >= 12) {
            class256 var27;
            if (var11 == -1 && var10.field2317 == null) {
                var27 = var10.method3895(arg7, arg6, var18, var20, var19, var21);
            } else {
                var27 = new class82(arg0, arg5, arg7, arg6, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4511(arg1, arg3, arg4, var19, 1, 1, var27, 0, var23, var25);
            if (var10.field2321 != 0 && arg9 != null) {
                arg9.method4111(arg3, arg4, var12, var13, var10.field2294);
            }
        } else if (arg7 == 0) {
            class256 var28;
            if (var11 == -1 && var10.field2317 == null) {
                var28 = var10.method3895(0, arg6, var18, var20, var19, var21);
            } else {
                var28 = new class82(arg0, arg5, 0, arg6, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4509(arg1, arg3, arg4, var19, var28, (class256) null, field1060[arg6], 0, var23, var25);
            if (var10.field2321 != 0 && arg9 != null) {
                arg9.method4113(arg3, arg4, arg7, arg6, var10.field2294);
            }
        } else if (arg7 == 1) {
            class256 var29;
            if (var11 == -1 && var10.field2317 == null) {
                var29 = var10.method3895(1, arg6, var18, var20, var19, var21);
            } else {
                var29 = new class82(arg0, arg5, 1, arg6, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4509(arg1, arg3, arg4, var19, var29, (class256) null, field1048[arg6], 0, var23, var25);
            if (var10.field2321 != 0 && arg9 != null) {
                arg9.method4113(arg3, arg4, arg7, arg6, var10.field2294);
            }
        } else if (arg7 == 2) {
            int var30 = arg6 + 1 & 0x3;
            class256 var31;
            class256 var32;
            if (var11 == -1 && var10.field2317 == null) {
                var31 = var10.method3895(2, arg6 + 4, var18, var20, var19, var21);
                var32 = var10.method3895(2, var30, var18, var20, var19, var21);
            } else {
                var31 = new class82(arg0, arg5, 2, arg6 + 4, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
                var32 = new class82(arg0, arg5, 2, var30, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4509(arg1, arg3, arg4, var19, var31, var32, field1060[arg6], field1060[var30], var23, var25);
            if (var10.field2321 != 0 && arg9 != null) {
                arg9.method4113(arg3, arg4, arg7, arg6, var10.field2294);
            }
        } else if (arg7 == 3) {
            class256 var33;
            if (var11 == -1 && var10.field2317 == null) {
                var33 = var10.method3895(3, arg6, var18, var20, var19, var21);
            } else {
                var33 = new class82(arg0, arg5, 3, arg6, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4509(arg1, arg3, arg4, var19, var33, (class256) null, field1048[arg6], 0, var23, var25);
            if (var10.field2321 != 0 && arg9 != null) {
                arg9.method4113(arg3, arg4, arg7, arg6, var10.field2294);
            }
        } else if (arg7 == 9) {
            class256 var34;
            if (var11 == -1 && var10.field2317 == null) {
                var34 = var10.method3895(arg7, arg6, var18, var20, var19, var21);
            } else {
                var34 = new class82(arg0, arg5, arg7, arg6, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4511(arg1, arg3, arg4, var19, 1, 1, var34, 0, var23, var25);
            if (var10.field2321 != 0 && arg9 != null) {
                arg9.method4111(arg3, arg4, var12, var13, var10.field2294);
            }
        } else if (arg7 == 4) {
            class256 var35;
            if (var11 == -1 && var10.field2317 == null) {
                var35 = var10.method3895(4, arg6, var18, var20, var19, var21);
            } else {
                var35 = new class82(arg0, arg5, 4, arg6, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4699(arg1, arg3, arg4, var19, var35, (class256) null, field1060[arg6], 0, 0, 0, var23, var25);
        } else if (arg7 == 5) {
            int var36 = 16;
            long var37 = var22.method4527(arg1, arg3, arg4);
            if (var37 != 0L) {
                var36 = class224.method3868(class265.method2622(var37)).field2300;
            }
            class256 var39;
            if (var11 == -1 && var10.field2317 == null) {
                var39 = var10.method3895(4, arg6, var18, var20, var19, var21);
            } else {
                var39 = new class82(arg0, arg5, 4, arg6, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4699(arg1, arg3, arg4, var19, var39, (class256) null, field1060[arg6], 0, field1054[arg6] * var36, field1055[arg6] * var36, var23, var25);
        } else if (arg7 == 6) {
            int var40 = 8;
            long var41 = var22.method4527(arg1, arg3, arg4);
            if (var41 != 0L) {
                var40 = class224.method3868(class265.method2622(var41)).field2300 / 2;
            }
            class256 var43;
            if (var11 == -1 && var10.field2317 == null) {
                var43 = var10.method3895(4, arg6 + 4, var18, var20, var19, var21);
            } else {
                var43 = new class82(arg0, arg5, 4, arg6 + 4, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4699(arg1, arg3, arg4, var19, var43, (class256) null, 256, arg6, field1056[arg6] * var40, field1057[arg6] * var40, var23, var25);
        } else if (arg7 == 7) {
            int var44 = arg6 + 2 & 0x3;
            class256 var45;
            if (var11 == -1 && var10.field2317 == null) {
                var45 = var10.method3895(4, var44 + 4, var18, var20, var19, var21);
            } else {
                var45 = new class82(arg0, arg5, 4, var44 + 4, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4699(arg1, arg3, arg4, var19, var45, (class256) null, 256, var44, 0, 0, var23, var25);
        } else if (arg7 == 8) {
            int var46 = 8;
            long var47 = var22.method4527(arg1, arg3, arg4);
            if (var47 != 0L) {
                var46 = class224.method3868(class265.method2622(var47)).field2300 / 2;
            }
            int var49 = arg6 + 2 & 0x3;
            class256 var50;
            class256 var51;
            if (var11 == -1 && var10.field2317 == null) {
                var50 = var10.method3895(4, arg6 + 4, var18, var20, var19, var21);
                var51 = var10.method3895(4, var49 + 4, var18, var20, var19, var21);
            } else {
                var50 = new class82(arg0, arg5, 4, arg6 + 4, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
                var51 = new class82(arg0, arg5, 4, var49 + 4, arg2, arg3, arg4, var11, var10.field2304, (class256) null);
            }
            var22.method4699(arg1, arg3, arg4, var19, var50, var51, 256, arg6, field1056[arg6] * var46, field1057[arg6] * var46, var23, var25);
        }
    }
}
