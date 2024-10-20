package deob;

@ObfuscatedName("ds")
public final class class84 {

    @ObfuscatedName("ds.aq")
    public static int field1045 = 99;

    @ObfuscatedName("ds.al")
    public static final int[] field1041 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("ds.ay")
    public static final int[] field1042 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("ds.ao")
    public static final int[] field1043 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("ds.aa")
    public static final int[] field1044 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("ds.as")
    public static final int[] field1033 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("ds.aw")
    public static final int[] field1046 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("ds.at")
    public static int field1047 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("ds.af")
    public static int field1048 = (int) (Math.random() * 33.0D) - 16;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("if.aq(I)V")
    public static void method3986() {
        field1045 = 99;
        Statics.field1034 = new short[4][104][104];
        Statics.field1035 = new short[4][104][104];
        Statics.field1036 = new byte[4][104][104];
        Statics.field3811 = new byte[4][104][104];
        Statics.field111 = new int[4][105][105];
        Statics.field2750 = new byte[4][105][105];
        Statics.field1040 = new int[105][105];
        Statics.field1038 = new int[104];
        Statics.field1039 = new int[104];
        Statics.field106 = new int[104];
        Statics.field1037 = new int[104];
        Statics.field5293 = new int[104];
    }

    @ObfuscatedName("li.ag(Lde;IIIII)V")
    public static final void method5214(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        int[][][] var5 = arg0.field1328;
        int var6 = arg0.field1333 - 1;
        int var7 = arg0.field1321 - 1;
        for (int var8 = arg2; var8 <= arg2 + arg4; var8++) {
            for (int var9 = arg1; var9 <= arg1 + arg3; var9++) {
                if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
                    Statics.field2750[0][var9][var8] = 127;
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

    @ObfuscatedName("ca.ak(Lde;[BIIIII)V")
    public static final void method2123(class102 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0.field1318 != null) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < 64; var7++) {
                    for (int var8 = 0; var8 < 64; var8++) {
                        if (arg2 + var7 > 0 && arg2 + var7 < arg0.field1318[var6].field2474.length && arg3 + var8 > 0 && arg3 + var8 < arg0.field1318[var6].field2474[arg2 + var7].length) {
                            arg0.field1318[var6].field2474[arg2 + var7][arg3 + var8] &= 0xBFFFFFFF;
                        }
                    }
                }
            }
        }
        class547 var9 = new class547(arg1);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg2 + var11;
                    int var14 = arg3 + var12;
                    Statics.method4593(arg0, var9, var10, var13, var14, arg4 + var13, arg5 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("ih.ap(Lde;[BIIIIIIIIIB)V")
    public static final void method3919(class102 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class233[] var11 = arg0.field1318;
        if (var11 != null) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < var11[arg2].field2474.length && arg4 + var13 > 0 && arg4 + var13 < var11[arg2].field2474[arg3 + var12].length) {
                        var11[arg2].field2474[arg3 + var12][arg4 + var13] &= 0xBFFFFFFF;
                    }
                }
            }
        }
        class547 var14 = new class547(arg1);
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg5 == var15 && var16 >= arg6 && var16 < arg6 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
                        int var18 = arg3 + class352.method5798(var16 & 0x7, var17 & 0x7, arg8);
                        int var20 = var16 & 0x7;
                        int var21 = var17 & 0x7;
                        int var23 = arg8 & 0x3;
                        int var24;
                        if (var23 == 0) {
                            var24 = var21;
                        } else if (var23 == 1) {
                            var24 = 7 - var20;
                        } else if (var23 == 2) {
                            var24 = 7 - var21;
                        } else {
                            var24 = var20;
                        }
                        int var25 = arg4 + var24;
                        int var26 = (var16 & 0x7) + arg3 + arg9;
                        int var27 = (var17 & 0x7) + arg4 + arg10;
                        Statics.method4593(arg0, var14, arg2, var18, var25, var26, var27, arg8);
                    } else {
                        Statics.method4593(arg0, var14, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cd.an([[[IIIII)V")
    public static final void method1119(int[][][] arg0, int arg1, int arg2, int arg3) {
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

    @ObfuscatedName("ap.av([BIII)Z")
    public static final boolean method14(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class547 var4 = new class547(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8746();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8744();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8804() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class207 var16 = class207.method95(var5);
                        if (var13 != 22 || !client.field662 || var16.field2172 != 0 || var16.field2154 == 1 || var16.field2162) {
                            if (!var16.method3612()) {
                                client.field574++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8744();
                if (var9 == 0) {
                    break;
                }
                var4.method8804();
            }
        }
    }

    @ObfuscatedName("jd.ab(Lde;[BIII)V")
    public static final void method4097(class102 arg0, byte[] arg1, int arg2, int arg3) {
        class547 var4 = new class547(arg1);
        int var5 = -1;
        while (true) {
            int var6 = var4.method8746();
            if (var6 == 0) {
                return;
            }
            var5 += var6;
            int var7 = 0;
            while (true) {
                int var8 = var4.method8744();
                if (var8 == 0) {
                    break;
                }
                var7 += var8 - 1;
                int var9 = var7 & 0x3F;
                int var10 = var7 >> 6 & 0x3F;
                int var11 = var7 >> 12;
                int var12 = var4.method8804();
                int var13 = var12 >> 2;
                int var14 = var12 & 0x3;
                int var15 = arg2 + var10;
                int var16 = arg3 + var9;
                if (var15 > 0 && var16 > 0 && var15 < arg0.field1328[0].length - 2 && var16 < arg0.field1328[0][0].length - 2) {
                    int var17 = var11;
                    if ((arg0.field1326[1][var15][var16] & 0x2) == 2) {
                        var17 = var11 - 1;
                    }
                    class233 var18 = null;
                    if (var17 >= 0 && arg0.field1318 != null) {
                        var18 = arg0.field1318[var17];
                    }
                    method367(arg0, var11, var15, var16, var5, var14, var13, var18);
                }
            }
        }
    }

    @ObfuscatedName("ds.ai(Lde;[BIIIIIII)V")
    public static final void method2182(class102 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class547 var9 = new class547(arg1);
        int var10 = -1;
        while (true) {
            int var11 = var9.method8746();
            if (var11 == 0) {
                return;
            }
            var10 += var11;
            int var12 = 0;
            while (true) {
                int var13 = var9.method8744();
                if (var13 == 0) {
                    break;
                }
                var12 += var13 - 1;
                int var14 = var12 & 0x3F;
                int var15 = var12 >> 6 & 0x3F;
                int var16 = var12 >> 12;
                int var17 = var9.method8804();
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                if (arg5 == var16 && var15 >= arg6 && var15 < arg6 + 8 && var14 >= arg7 && var14 < arg7 + 8) {
                    class207 var20 = class207.method95(var10);
                    int var21 = arg3 + class352.method4013(var15 & 0x7, var14 & 0x7, arg8, var20.field2168, var20.field2169, var19);
                    int var23 = var15 & 0x7;
                    int var24 = var14 & 0x7;
                    int var26 = var20.field2168;
                    int var27 = var20.field2169;
                    if ((var19 & 0x1) == 1) {
                        int var28 = var26;
                        var26 = var27;
                        var27 = var28;
                    }
                    int var29 = arg8 & 0x3;
                    int var30;
                    if (var29 == 0) {
                        var30 = var24;
                    } else if (var29 == 1) {
                        var30 = 7 - var23 - (var26 - 1);
                    } else if (var29 == 2) {
                        var30 = 7 - var24 - (var27 - 1);
                    } else {
                        var30 = var23;
                    }
                    int var31 = arg4 + var30;
                    if (var21 > 0 && var31 > 0 && var21 < arg0.field1333 - 1 && var31 < arg0.field1321 - 1) {
                        int var32 = arg2;
                        if ((arg0.field1326[1][var21][var31] & 0x2) == 2) {
                            var32 = arg2 - 1;
                        }
                        class233 var33 = null;
                        if (var32 >= 0 && arg0.field1318 != null) {
                            var33 = arg0.field1318[var32];
                        }
                        method367(arg0, arg2, var21, var31, var10, arg8 + var19 & 0x3, var18, var33);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.ae(Lde;IIIIIILip;I)V")
    public static final void method367(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class233 arg7) {
        if (client.field662 && (arg0.field1326[0][arg2][arg3] & 0x2) == 0 && (arg0.field1326[arg1][arg2][arg3] & 0x10) != 0) {
            return;
        }
        if (arg1 < field1045) {
            field1045 = arg1;
        }
        class207 var8 = class207.method95(arg4);
        int var9;
        int var10;
        if (arg5 == 1 || arg5 == 3) {
            var9 = var8.field2169;
            var10 = var8.field2168;
        } else {
            var9 = var8.field2168;
            var10 = var8.field2169;
        }
        int var11;
        int var12;
        if (arg2 + var9 <= arg0.field1333) {
            var11 = (var9 >> 1) + arg2;
            var12 = (var9 + 1 >> 1) + arg2;
        } else {
            var11 = arg2;
            var12 = arg2 + 1;
        }
        int var13;
        int var14;
        if (arg3 + var10 <= arg0.field1321) {
            var13 = (var10 >> 1) + arg3;
            var14 = (var10 + 1 >> 1) + arg3;
        } else {
            var13 = arg3;
            var14 = arg3 + 1;
        }
        int[][] var15 = arg0.field1328[arg1];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg2 << 7) + (var9 << 6);
        int var18 = (arg3 << 7) + (var10 << 6);
        long var19 = class295.method3918(arg2, arg3, 2, var8.field2172 == 0, arg4, arg0.field1329);
        int var21 = (arg5 << 6) + arg6;
        if (var8.field2193 == 1) {
            var21 += 256;
        }
        if (var8.method3619()) {
            class72.method2973(arg1, arg2, arg3, var8, arg5);
        }
        class283 var22 = arg0.field1317;
        if (arg6 == 22) {
            if (!client.field662 || var8.field2172 != 0 || var8.field2154 == 1 || var8.field2162) {
                class286 var23;
                if (var8.field2176 == -1 && var8.field2194 == null) {
                    var23 = var8.method3613(22, arg5, var15, var17, var16, var18);
                } else {
                    var23 = new class82(arg0, arg4, 22, arg5, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
                }
                var22.method4932(arg1, arg2, arg3, var16, var23, var19, var21);
                if (var8.field2154 == 1 && arg7 != null) {
                    arg7.method4061(arg2, arg3);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class286 var49;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var49 = var8.method3613(10, arg5, var15, var17, var16, var18);
            } else {
                var49 = new class82(arg0, arg4, 10, arg5, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            if (var49 != null && var22.method4936(arg1, arg2, arg3, var16, var9, var10, var49, arg6 == 11 ? 256 : 0, var19, var21) && var8.field2184) {
                int var50 = 15;
                if (var49 instanceof class294) {
                    var50 = ((class294) var49).method5251() / 4;
                    if (var50 > 30) {
                        var50 = 30;
                    }
                }
                for (int var51 = 0; var51 <= var9; var51++) {
                    for (int var52 = 0; var52 <= var10; var52++) {
                        if (var50 > Statics.field2750[arg1][arg2 + var51][arg3 + var52]) {
                            Statics.field2750[arg1][arg2 + var51][arg3 + var52] = (byte) var50;
                        }
                    }
                }
            }
            if (var8.field2154 != 0 && arg7 != null) {
                arg7.method4059(arg2, arg3, var9, var10, var8.field2171);
            }
        } else if (arg6 >= 12) {
            class286 var24;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var24 = var8.method3613(arg6, arg5, var15, var17, var16, var18);
            } else {
                var24 = new class82(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method4936(arg1, arg2, arg3, var16, 1, 1, var24, 0, var19, var21);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
                Statics.field111[arg1][arg2][arg3] |= 0x924;
            }
            if (var8.field2154 != 0 && arg7 != null) {
                arg7.method4059(arg2, arg3, var9, var10, var8.field2171);
            }
        } else if (arg6 == 0) {
            class286 var25;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var25 = var8.method3613(0, arg5, var15, var17, var16, var18);
            } else {
                var25 = new class82(arg0, arg4, 0, arg5, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method4934(arg1, arg2, arg3, var16, var25, (class286) null, field1041[arg5], 0, var19, var21);
            if (arg5 == 0) {
                if (var8.field2184) {
                    Statics.field2750[arg1][arg2][arg3] = 50;
                    Statics.field2750[arg1][arg2][arg3 + 1] = 50;
                }
                if (var8.field2161) {
                    Statics.field111[arg1][arg2][arg3] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var8.field2184) {
                    Statics.field2750[arg1][arg2][arg3 + 1] = 50;
                    Statics.field2750[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2161) {
                    Statics.field111[arg1][arg2][arg3 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var8.field2184) {
                    Statics.field2750[arg1][arg2 + 1][arg3] = 50;
                    Statics.field2750[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2161) {
                    Statics.field111[arg1][arg2 + 1][arg3] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var8.field2184) {
                    Statics.field2750[arg1][arg2][arg3] = 50;
                    Statics.field2750[arg1][arg2 + 1][arg3] = 50;
                }
                if (var8.field2161) {
                    Statics.field111[arg1][arg2][arg3] |= 0x492;
                }
            }
            if (var8.field2154 != 0 && arg7 != null) {
                arg7.method4058(arg2, arg3, arg6, arg5, var8.field2171);
            }
            if (var8.field2177 != 16) {
                var22.method5027(arg1, arg2, arg3, var8.field2177);
            }
        } else if (arg6 == 1) {
            class286 var26;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var26 = var8.method3613(1, arg5, var15, var17, var16, var18);
            } else {
                var26 = new class82(arg0, arg4, 1, arg5, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method4934(arg1, arg2, arg3, var16, var26, (class286) null, field1042[arg5], 0, var19, var21);
            if (var8.field2184) {
                if (arg5 == 0) {
                    Statics.field2750[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field2750[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field2750[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field2750[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2154 != 0 && arg7 != null) {
                arg7.method4058(arg2, arg3, arg6, arg5, var8.field2171);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class286 var28;
            class286 var29;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var28 = var8.method3613(2, arg5 + 4, var15, var17, var16, var18);
                var29 = var8.method3613(2, var27, var15, var17, var16, var18);
            } else {
                var28 = new class82(arg0, arg4, 2, arg5 + 4, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
                var29 = new class82(arg0, arg4, 2, var27, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method4934(arg1, arg2, arg3, var16, var28, var29, field1041[arg5], field1041[var27], var19, var21);
            if (var8.field2161) {
                if (arg5 == 0) {
                    Statics.field111[arg1][arg2][arg3] |= 0x249;
                    Statics.field111[arg1][arg2][arg3 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    Statics.field111[arg1][arg2][arg3 + 1] |= 0x492;
                    Statics.field111[arg1][arg2 + 1][arg3] |= 0x249;
                } else if (arg5 == 2) {
                    Statics.field111[arg1][arg2 + 1][arg3] |= 0x249;
                    Statics.field111[arg1][arg2][arg3] |= 0x492;
                } else if (arg5 == 3) {
                    Statics.field111[arg1][arg2][arg3] |= 0x492;
                    Statics.field111[arg1][arg2][arg3] |= 0x249;
                }
            }
            if (var8.field2154 != 0 && arg7 != null) {
                arg7.method4058(arg2, arg3, arg6, arg5, var8.field2171);
            }
            if (var8.field2177 != 16) {
                var22.method5027(arg1, arg2, arg3, var8.field2177);
            }
        } else if (arg6 == 3) {
            class286 var30;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var30 = var8.method3613(3, arg5, var15, var17, var16, var18);
            } else {
                var30 = new class82(arg0, arg4, 3, arg5, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method4934(arg1, arg2, arg3, var16, var30, (class286) null, field1042[arg5], 0, var19, var21);
            if (var8.field2184) {
                if (arg5 == 0) {
                    Statics.field2750[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field2750[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field2750[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field2750[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2154 != 0 && arg7 != null) {
                arg7.method4058(arg2, arg3, arg6, arg5, var8.field2171);
            }
        } else if (arg6 == 9) {
            class286 var31;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var31 = var8.method3613(arg6, arg5, var15, var17, var16, var18);
            } else {
                var31 = new class82(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method4936(arg1, arg2, arg3, var16, 1, 1, var31, 0, var19, var21);
            if (var8.field2154 != 0 && arg7 != null) {
                arg7.method4059(arg2, arg3, var9, var10, var8.field2171);
            }
            if (var8.field2177 != 16) {
                var22.method5027(arg1, arg2, arg3, var8.field2177);
            }
        } else if (arg6 == 4) {
            class286 var32;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var32 = var8.method3613(4, arg5, var15, var17, var16, var18);
            } else {
                var32 = new class82(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method5024(arg1, arg2, arg3, var16, var32, (class286) null, field1041[arg5], 0, 0, 0, var19, var21);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = var22.method4952(arg1, arg2, arg3);
            if (var34 != 0L) {
                var33 = class207.method95(class295.method4017(var34)).field2177;
            }
            class286 var36;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var36 = var8.method3613(4, arg5, var15, var17, var16, var18);
            } else {
                var36 = new class82(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method5024(arg1, arg2, arg3, var16, var36, (class286) null, field1041[arg5], 0, field1043[arg5] * var33, field1044[arg5] * var33, var19, var21);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = var22.method4952(arg1, arg2, arg3);
            if (var38 != 0L) {
                var37 = class207.method95(class295.method4017(var38)).field2177 / 2;
            }
            class286 var40;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var40 = var8.method3613(4, arg5 + 4, var15, var17, var16, var18);
            } else {
                var40 = new class82(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method5024(arg1, arg2, arg3, var16, var40, (class286) null, 256, arg5, field1033[arg5] * var37, field1046[arg5] * var37, var19, var21);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class286 var42;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var42 = var8.method3613(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class82(arg0, arg4, 4, var41 + 4, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method5024(arg1, arg2, arg3, var16, var42, (class286) null, 256, var41, 0, 0, var19, var21);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = var22.method4952(arg1, arg2, arg3);
            if (var44 != 0L) {
                var43 = class207.method95(class295.method4017(var44)).field2177 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class286 var47;
            class286 var48;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var47 = var8.method3613(4, arg5 + 4, var15, var17, var16, var18);
                var48 = var8.method3613(4, var46 + 4, var15, var17, var16, var18);
            } else {
                var47 = new class82(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
                var48 = new class82(arg0, arg4, 4, var46 + 4, arg1, arg2, arg3, var8.field2176, var8.field2188, (class286) null);
            }
            var22.method5024(arg1, arg2, arg3, var16, var47, var48, 256, arg5, field1033[arg5] * var43, field1046[arg5] * var43, var19, var21);
        }
    }

    @ObfuscatedName("bx.au(Lde;B)V")
    public static final void method705(class102 arg0) {
        int var1 = arg0.field1333;
        int var2 = arg0.field1321;
        int[][][] var3 = arg0.field1328;
        byte[][][] var4 = arg0.field1326;
        class283 var5 = arg0.field1317;
        class233[] var6 = arg0.field1318;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var8 = 0; var8 < var1; var8++) {
                for (int var9 = 0; var9 < var2; var9++) {
                    if ((arg0.field1326[var7][var8][var9] & 0x1) == 1) {
                        int var10 = var7;
                        if ((arg0.field1326[1][var8][var9] & 0x2) == 2) {
                            var10 = var7 - 1;
                        }
                        if (var10 >= 0 && var6 != null) {
                            var6[var10].method4074(var8, var9);
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
        field1048 += (int) (Math.random() * 5.0D) - 2;
        if (field1048 < -16) {
            field1048 = -16;
        }
        if (field1048 > 16) {
            field1048 = 16;
        }
        for (int var11 = 0; var11 < 4; var11++) {
            byte[][] var12 = Statics.field2750[var11];
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
                    Statics.field1040[var21][var20] = var28 - var29;
                }
            }
            for (int var30 = 0; var30 < var2; var30++) {
                Statics.field1038[var30] = 0;
                Statics.field1039[var30] = 0;
                Statics.field106[var30] = 0;
                Statics.field1037[var30] = 0;
                Statics.field5293[var30] = 0;
            }
            for (int var31 = -5; var31 < var1 + 5; var31++) {
                for (int var32 = 0; var32 < var2; var32++) {
                    int var33 = var31 + 5;
                    int var10002;
                    if (var33 >= 0 && var33 < var1) {
                        long var34 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var36 = (int) var34;
                        int var37 = Statics.field1034[var11][var33][var32] & var36;
                        if (var37 > 0) {
                            int var38 = var37 - 1;
                            class199 var39 = (class199) class199.field2087.method5495((long) var38);
                            class199 var40;
                            if (var39 == null) {
                                byte[] var41 = Statics.field2092.method6539(1, var38);
                                class199 var42 = new class199();
                                if (var41 != null) {
                                    var42.method3490(new class547(var41), var38);
                                }
                                var42.method3489();
                                class199.field2087.method5498(var42, (long) var38);
                                var40 = var42;
                            } else {
                                var40 = var39;
                            }
                            Statics.field1038[var32] += var40.field2090;
                            Statics.field1039[var32] += var40.field2091;
                            Statics.field106[var32] += var40.field2088;
                            Statics.field1037[var32] += var40.field2097;
                            var10002 = Statics.field5293[var32]++;
                        }
                    }
                    int var44 = var31 - 5;
                    if (var44 >= 0 && var44 < var1) {
                        long var45 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var47 = (int) var45;
                        int var48 = Statics.field1034[var11][var44][var32] & var47;
                        if (var48 > 0) {
                            int var49 = var48 - 1;
                            class199 var50 = (class199) class199.field2087.method5495((long) var49);
                            class199 var51;
                            if (var50 == null) {
                                byte[] var52 = Statics.field2092.method6539(1, var49);
                                class199 var53 = new class199();
                                if (var52 != null) {
                                    var53.method3490(new class547(var52), var49);
                                }
                                var53.method3489();
                                class199.field2087.method5498(var53, (long) var49);
                                var51 = var53;
                            } else {
                                var51 = var50;
                            }
                            Statics.field1038[var32] -= var51.field2090;
                            Statics.field1039[var32] -= var51.field2091;
                            Statics.field106[var32] -= var51.field2088;
                            Statics.field1037[var32] -= var51.field2097;
                            var10002 = Statics.field5293[var32]--;
                        }
                    }
                }
                if (var31 >= 1 && var31 < var1 - 1) {
                    int var55 = 0;
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    for (int var60 = -5; var60 < var2 + 5; var60++) {
                        int var61 = var60 + 5;
                        if (var61 >= 0 && var61 < var2) {
                            var55 += Statics.field1038[var61];
                            var56 += Statics.field1039[var61];
                            var57 += Statics.field106[var61];
                            var58 += Statics.field1037[var61];
                            var59 += Statics.field5293[var61];
                        }
                        int var62 = var60 - 5;
                        if (var62 >= 0 && var62 < var2) {
                            var55 -= Statics.field1038[var62];
                            var56 -= Statics.field1039[var62];
                            var57 -= Statics.field106[var62];
                            var58 -= Statics.field1037[var62];
                            var59 -= Statics.field5293[var62];
                        }
                        if (var60 >= 1 && var60 < var2 - 1 && (!client.field662 || (var4[0][var31][var60] & 0x2) != 0 || (var4[var11][var31][var60] & 0x10) == 0)) {
                            if (var11 < field1045) {
                                field1045 = var11;
                            }
                            long var63 = (long) Math.pow(2.0D, 15.0D) - 1L;
                            int var65 = (int) var63;
                            int var66 = Statics.field1034[var11][var31][var60] & var65;
                            int var67 = Statics.field1035[var11][var31][var60] & var65;
                            if (var66 > 0 || var67 > 0) {
                                int var68 = var3[var11][var31][var60];
                                int var69 = var3[var11][var31 + 1][var60];
                                int var70 = var3[var11][var31 + 1][var60 + 1];
                                int var71 = var3[var11][var31][var60 + 1];
                                int var72 = Statics.field1040[var31][var60];
                                int var73 = Statics.field1040[var31 + 1][var60];
                                int var74 = Statics.field1040[var31 + 1][var60 + 1];
                                int var75 = Statics.field1040[var31][var60 + 1];
                                int var76 = -1;
                                int var77 = -1;
                                if (var66 > 0) {
                                    int var78 = var55 * 256 / var58;
                                    int var79 = var56 / var59;
                                    int var80 = var57 / var59;
                                    var76 = method2404(var78, var79, var80);
                                    int var81 = field1047 + var78 & 0xFF;
                                    int var82 = field1048 + var80;
                                    if (var82 < 0) {
                                        var82 = 0;
                                    } else if (var82 > 255) {
                                        var82 = 255;
                                    }
                                    var77 = method2404(var81, var79, var82);
                                }
                                if (var11 > 0) {
                                    boolean var83 = true;
                                    if (var66 == 0 && Statics.field1036[var11][var31][var60] != 0) {
                                        var83 = false;
                                    }
                                    if (var67 > 0 && !class209.method1105(var67 - 1).field2275) {
                                        var83 = false;
                                    }
                                    if (var83 && var68 == var69 && var68 == var70 && var68 == var71) {
                                        Statics.field111[var11][var31][var60] |= 0x924;
                                    }
                                }
                                int var84 = 0;
                                if (var77 != -1) {
                                    var84 = class278.field2880[method4041(var77, 96)];
                                }
                                if (var67 == 0) {
                                    var5.method4985(var11, var31, var60, 0, 0, -1, var68, var69, var70, var71, method4041(var76, var72), method4041(var76, var73), method4041(var76, var74), method4041(var76, var75), 0, 0, 0, 0, var84, 0);
                                } else {
                                    int var85 = Statics.field1036[var11][var31][var60] + 1;
                                    byte var86 = Statics.field3811[var11][var31][var60];
                                    class209 var87 = class209.method1105(var67 - 1);
                                    int var88 = var87.field2267;
                                    int var89;
                                    int var90;
                                    if (var88 >= 0) {
                                        var89 = class278.field2877.field3195.method5207(var88);
                                        var90 = -1;
                                    } else if (var87.field2269 == 16711935) {
                                        var90 = -2;
                                        var88 = -1;
                                        var89 = -2;
                                    } else {
                                        var90 = method2404(var87.field2271, var87.field2270, var87.field2274);
                                        int var91 = field1047 + var87.field2271 & 0xFF;
                                        int var92 = field1048 + var87.field2274;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        var89 = method2404(var91, var87.field2270, var92);
                                    }
                                    int var93 = 0;
                                    if (var89 != -2) {
                                        var93 = class278.field2880[method1834(var89, 96)];
                                    }
                                    if (var87.field2273 != -1) {
                                        int var94 = field1047 + var87.field2276 & 0xFF;
                                        int var95 = field1048 + var87.field2268;
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (var95 > 255) {
                                            var95 = 255;
                                        }
                                        int var96 = method2404(var94, var87.field2277, var95);
                                        var93 = class278.field2880[method1834(var96, 96)];
                                    }
                                    var5.method4985(var11, var31, var60, var85, var86, var88, var68, var69, var70, var71, method4041(var76, var72), method4041(var76, var73), method4041(var76, var74), method4041(var76, var75), method1834(var90, var72), method1834(var90, var73), method1834(var90, var74), method1834(var90, var75), var84, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var97 = 1; var97 < var2 - 1; var97++) {
                for (int var98 = 1; var98 < var1 - 1; var98++) {
                    int var103;
                    if ((arg0.field1326[var11][var98][var97] & 0x8) != 0) {
                        var103 = 0;
                    } else if (var11 <= 0 || (arg0.field1326[1][var98][var97] & 0x2) == 0) {
                        var103 = var11;
                    } else {
                        var103 = var11 - 1;
                    }
                    var5.method4930(var11, var98, var97, var103);
                }
            }
            Statics.field1034[var11] = (short[][]) null;
            Statics.field1035[var11] = (short[][]) null;
            Statics.field1036[var11] = (byte[][]) null;
            Statics.field3811[var11] = (byte[][]) null;
            Statics.field2750[var11] = (byte[][]) null;
        }
        var5.method5006(-50, -10, -50);
        for (int var104 = 0; var104 < var1; var104++) {
            for (int var105 = 0; var105 < var2; var105++) {
                if ((var4[1][var104][var105] & 0x2) == 2) {
                    var5.method4928(var104, var105);
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
                for (int var111 = 0; var111 <= var2; var111++) {
                    for (int var112 = 0; var112 <= var1; var112++) {
                        if ((Statics.field111[var110][var112][var111] & var106) != 0) {
                            int var113 = var111;
                            int var114 = var111;
                            int var115 = var110;
                            int var116 = var110;
                            while (var113 > 0 && (Statics.field111[var110][var112][var113 - 1] & var106) != 0) {
                                var113--;
                            }
                            while (var114 < var2 && (Statics.field111[var110][var112][var114 + 1] & var106) != 0) {
                                var114++;
                            }
                            label363: while (var115 > 0) {
                                for (int var117 = var113; var117 <= var114; var117++) {
                                    if ((Statics.field111[var115 - 1][var112][var117] & var106) == 0) {
                                        break label363;
                                    }
                                }
                                var115--;
                            }
                            label352: while (var116 < var109) {
                                for (int var118 = var113; var118 <= var114; var118++) {
                                    if ((Statics.field111[var116 + 1][var112][var118] & var106) == 0) {
                                        break label352;
                                    }
                                }
                                var116++;
                            }
                            int var119 = (var116 + 1 - var115) * (var114 - var113 + 1);
                            if (var119 >= 8) {
                                short var120 = 240;
                                int var121 = var3[var116][var112][var113] - var120;
                                int var122 = var3[var115][var112][var113];
                                var5.method4929(var109, 1, var112 * 128, var112 * 128, var113 * 128, var114 * 128 + 128, var121, var122);
                                for (int var123 = var115; var123 <= var116; var123++) {
                                    for (int var124 = var113; var124 <= var114; var124++) {
                                        Statics.field111[var123][var112][var124] &= ~var106;
                                    }
                                }
                            }
                        }
                        if ((Statics.field111[var110][var112][var111] & var107) != 0) {
                            int var125 = var112;
                            int var126 = var112;
                            int var127 = var110;
                            int var128 = var110;
                            while (var125 > 0 && (Statics.field111[var110][var125 - 1][var111] & var107) != 0) {
                                var125--;
                            }
                            while (var126 < var1 && (Statics.field111[var110][var126 + 1][var111] & var107) != 0) {
                                var126++;
                            }
                            label416: while (var127 > 0) {
                                for (int var129 = var125; var129 <= var126; var129++) {
                                    if ((Statics.field111[var127 - 1][var129][var111] & var107) == 0) {
                                        break label416;
                                    }
                                }
                                var127--;
                            }
                            label405: while (var128 < var109) {
                                for (int var130 = var125; var130 <= var126; var130++) {
                                    if ((Statics.field111[var128 + 1][var130][var111] & var107) == 0) {
                                        break label405;
                                    }
                                }
                                var128++;
                            }
                            int var131 = (var128 + 1 - var127) * (var126 - var125 + 1);
                            if (var131 >= 8) {
                                short var132 = 240;
                                int var133 = var3[var128][var125][var111] - var132;
                                int var134 = var3[var127][var125][var111];
                                var5.method4929(var109, 2, var125 * 128, var126 * 128 + 128, var111 * 128, var111 * 128, var133, var134);
                                for (int var135 = var127; var135 <= var128; var135++) {
                                    for (int var136 = var125; var136 <= var126; var136++) {
                                        Statics.field111[var135][var136][var111] &= ~var107;
                                    }
                                }
                            }
                        }
                        if ((Statics.field111[var110][var112][var111] & var108) != 0) {
                            int var137 = var112;
                            int var138 = var112;
                            int var139 = var111;
                            int var140 = var111;
                            while (var139 > 0 && (Statics.field111[var110][var112][var139 - 1] & var108) != 0) {
                                var139--;
                            }
                            while (var140 < var2 && (Statics.field111[var110][var112][var140 + 1] & var108) != 0) {
                                var140++;
                            }
                            label469: while (var137 > 0) {
                                for (int var141 = var139; var141 <= var140; var141++) {
                                    if ((Statics.field111[var110][var137 - 1][var141] & var108) == 0) {
                                        break label469;
                                    }
                                }
                                var137--;
                            }
                            label458: while (var138 < var1) {
                                for (int var142 = var139; var142 <= var140; var142++) {
                                    if ((Statics.field111[var110][var138 + 1][var142] & var108) == 0) {
                                        break label458;
                                    }
                                }
                                var138++;
                            }
                            if ((var138 - var137 + 1) * (var140 - var139 + 1) >= 4) {
                                int var143 = var3[var110][var137][var139];
                                var5.method4929(var109, 4, var137 * 128, var138 * 128 + 128, var139 * 128, var140 * 128 + 128, var143, var143);
                                for (int var144 = var137; var144 <= var138; var144++) {
                                    for (int var145 = var139; var145 <= var140; var145++) {
                                        Statics.field111[var110][var144][var145] &= ~var108;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gb.ah(IIB)I")
    public static final int method3269(int arg0, int arg1) {
        int var2 = method5911(arg0 + 45365, arg1 + 91923, 4) - 128 + (method5911(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method5911(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("nf.az(IIIB)I")
    public static final int method5911(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2104(var3, var5);
        int var8 = method2104(var3 + 1, var5);
        int var9 = method2104(var3, var5 + 1);
        int var10 = method2104(var3 + 1, var5 + 1);
        int var11 = method5543(var7, var8, var4, arg2);
        int var12 = method5543(var9, var10, var4, arg2);
        return method5543(var11, var12, var6, arg2);
    }

    @ObfuscatedName("mh.ax(IIIII)I")
    public static final int method5543(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class278.field2879[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ca.ac(III)I")
    public static final int method2104(int arg0, int arg1) {
        int var2 = method3265(arg0 - 1, arg1 - 1) + method3265(arg0 + 1, arg1 - 1) + method3265(arg0 - 1, arg1 + 1) + method3265(arg0 + 1, arg1 + 1);
        int var3 = method3265(arg0 - 1, arg1) + method3265(arg0 + 1, arg1) + method3265(arg0, arg1 - 1) + method3265(arg0, arg1 + 1);
        int var4 = method3265(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("gv.al(III)I")
    public static final int method3265(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ij.ay(III)I")
    public static final int method4041(int arg0, int arg1) {
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

    @ObfuscatedName("ci.ao(III)I")
    public static final int method1834(int arg0, int arg1) {
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

    @ObfuscatedName("dh.aa(IIII)I")
    public static final int method2404(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ca.as(Lde;IIIIIIIILip;S)V")
    public static final void method2109(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class233 arg9) {
        class207 var10 = class207.method95(arg5);
        int var11 = arg8 >= 0 ? arg8 : var10.field2176;
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var12 = var10.field2169;
            var13 = var10.field2168;
        } else {
            var12 = var10.field2168;
            var13 = var10.field2169;
        }
        int var14;
        int var15;
        if (arg3 + var12 <= arg0.field1333) {
            var14 = (var12 >> 1) + arg3;
            var15 = (var12 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int var16;
        int var17;
        if (arg4 + var13 <= arg0.field1321) {
            var16 = (var13 >> 1) + arg4;
            var17 = (var13 + 1 >> 1) + arg4;
        } else {
            var16 = arg4;
            var17 = arg4 + 1;
        }
        int[][] var18 = arg0.field1328[arg2];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg3 << 7) + (var12 << 6);
        int var21 = (arg4 << 7) + (var13 << 6);
        class283 var22 = arg0.field1317;
        long var23 = class295.method3918(arg3, arg4, 2, var10.field2172 == 0, arg5, arg0.field1329);
        int var25 = (arg6 << 6) + arg7;
        if (var10.field2193 == 1) {
            var25 += 256;
        }
        if (arg7 == 22) {
            class286 var26;
            if (var11 == -1 && var10.field2194 == null) {
                var26 = var10.method3656(22, arg6, var18, var20, var19, var21);
            } else {
                var26 = new class82(arg0, arg5, 22, arg6, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method4932(arg1, arg3, arg4, var19, var26, var23, var25);
            if (var10.field2154 == 1 && arg9 != null) {
                arg9.method4061(arg3, arg4);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class286 var52;
            if (var11 == -1 && var10.field2194 == null) {
                var52 = var10.method3656(10, arg6, var18, var20, var19, var21);
            } else {
                var52 = new class82(arg0, arg5, 10, arg6, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            if (var52 != null) {
                var22.method4936(arg1, arg3, arg4, var19, var12, var13, var52, arg7 == 11 ? 256 : 0, var23, var25);
            }
            if (var10.field2154 != 0 && arg9 != null) {
                arg9.method4059(arg3, arg4, var12, var13, var10.field2171);
            }
        } else if (arg7 >= 12) {
            class286 var27;
            if (var11 == -1 && var10.field2194 == null) {
                var27 = var10.method3656(arg7, arg6, var18, var20, var19, var21);
            } else {
                var27 = new class82(arg0, arg5, arg7, arg6, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method4936(arg1, arg3, arg4, var19, 1, 1, var27, 0, var23, var25);
            if (var10.field2154 != 0 && arg9 != null) {
                arg9.method4059(arg3, arg4, var12, var13, var10.field2171);
            }
        } else if (arg7 == 0) {
            class286 var28;
            if (var11 == -1 && var10.field2194 == null) {
                var28 = var10.method3656(0, arg6, var18, var20, var19, var21);
            } else {
                var28 = new class82(arg0, arg5, 0, arg6, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method4934(arg1, arg3, arg4, var19, var28, (class286) null, field1041[arg6], 0, var23, var25);
            if (var10.field2154 != 0 && arg9 != null) {
                arg9.method4058(arg3, arg4, arg7, arg6, var10.field2171);
            }
        } else if (arg7 == 1) {
            class286 var29;
            if (var11 == -1 && var10.field2194 == null) {
                var29 = var10.method3656(1, arg6, var18, var20, var19, var21);
            } else {
                var29 = new class82(arg0, arg5, 1, arg6, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method4934(arg1, arg3, arg4, var19, var29, (class286) null, field1042[arg6], 0, var23, var25);
            if (var10.field2154 != 0 && arg9 != null) {
                arg9.method4058(arg3, arg4, arg7, arg6, var10.field2171);
            }
        } else if (arg7 == 2) {
            int var30 = arg6 + 1 & 0x3;
            class286 var31;
            class286 var32;
            if (var11 == -1 && var10.field2194 == null) {
                var31 = var10.method3656(2, arg6 + 4, var18, var20, var19, var21);
                var32 = var10.method3656(2, var30, var18, var20, var19, var21);
            } else {
                var31 = new class82(arg0, arg5, 2, arg6 + 4, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
                var32 = new class82(arg0, arg5, 2, var30, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method4934(arg1, arg3, arg4, var19, var31, var32, field1041[arg6], field1041[var30], var23, var25);
            if (var10.field2154 != 0 && arg9 != null) {
                arg9.method4058(arg3, arg4, arg7, arg6, var10.field2171);
            }
        } else if (arg7 == 3) {
            class286 var33;
            if (var11 == -1 && var10.field2194 == null) {
                var33 = var10.method3656(3, arg6, var18, var20, var19, var21);
            } else {
                var33 = new class82(arg0, arg5, 3, arg6, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method4934(arg1, arg3, arg4, var19, var33, (class286) null, field1042[arg6], 0, var23, var25);
            if (var10.field2154 != 0 && arg9 != null) {
                arg9.method4058(arg3, arg4, arg7, arg6, var10.field2171);
            }
        } else if (arg7 == 9) {
            class286 var34;
            if (var11 == -1 && var10.field2194 == null) {
                var34 = var10.method3656(arg7, arg6, var18, var20, var19, var21);
            } else {
                var34 = new class82(arg0, arg5, arg7, arg6, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method4936(arg1, arg3, arg4, var19, 1, 1, var34, 0, var23, var25);
            if (var10.field2154 != 0 && arg9 != null) {
                arg9.method4059(arg3, arg4, var12, var13, var10.field2171);
            }
        } else if (arg7 == 4) {
            class286 var35;
            if (var11 == -1 && var10.field2194 == null) {
                var35 = var10.method3656(4, arg6, var18, var20, var19, var21);
            } else {
                var35 = new class82(arg0, arg5, 4, arg6, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method5024(arg1, arg3, arg4, var19, var35, (class286) null, field1041[arg6], 0, 0, 0, var23, var25);
        } else if (arg7 == 5) {
            int var36 = 16;
            long var37 = var22.method4952(arg1, arg3, arg4);
            if (var37 != 0L) {
                var36 = class207.method95(class295.method4017(var37)).field2177;
            }
            class286 var39;
            if (var11 == -1 && var10.field2194 == null) {
                var39 = var10.method3656(4, arg6, var18, var20, var19, var21);
            } else {
                var39 = new class82(arg0, arg5, 4, arg6, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method5024(arg1, arg3, arg4, var19, var39, (class286) null, field1041[arg6], 0, field1043[arg6] * var36, field1044[arg6] * var36, var23, var25);
        } else if (arg7 == 6) {
            int var40 = 8;
            long var41 = var22.method4952(arg1, arg3, arg4);
            if (var41 != 0L) {
                var40 = class207.method95(class295.method4017(var41)).field2177 / 2;
            }
            class286 var43;
            if (var11 == -1 && var10.field2194 == null) {
                var43 = var10.method3656(4, arg6 + 4, var18, var20, var19, var21);
            } else {
                var43 = new class82(arg0, arg5, 4, arg6 + 4, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method5024(arg1, arg3, arg4, var19, var43, (class286) null, 256, arg6, field1033[arg6] * var40, field1046[arg6] * var40, var23, var25);
        } else if (arg7 == 7) {
            int var44 = arg6 + 2 & 0x3;
            class286 var45;
            if (var11 == -1 && var10.field2194 == null) {
                var45 = var10.method3656(4, var44 + 4, var18, var20, var19, var21);
            } else {
                var45 = new class82(arg0, arg5, 4, var44 + 4, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method5024(arg1, arg3, arg4, var19, var45, (class286) null, 256, var44, 0, 0, var23, var25);
        } else if (arg7 == 8) {
            int var46 = 8;
            long var47 = var22.method4952(arg1, arg3, arg4);
            if (var47 != 0L) {
                var46 = class207.method95(class295.method4017(var47)).field2177 / 2;
            }
            int var49 = arg6 + 2 & 0x3;
            class286 var50;
            class286 var51;
            if (var11 == -1 && var10.field2194 == null) {
                var50 = var10.method3656(4, arg6 + 4, var18, var20, var19, var21);
                var51 = var10.method3656(4, var49 + 4, var18, var20, var19, var21);
            } else {
                var50 = new class82(arg0, arg5, 4, arg6 + 4, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
                var51 = new class82(arg0, arg5, 4, var49 + 4, arg2, arg3, arg4, var11, var10.field2188, (class286) null);
            }
            var22.method5024(arg1, arg3, arg4, var19, var50, var51, 256, arg6, field1033[arg6] * var46, field1046[arg6] * var46, var23, var25);
        }
    }
}
