package deob;

@ObfuscatedName("dg")
public final class class85 {

    @ObfuscatedName("dg.ap")
    public static int field1035 = 99;

    @ObfuscatedName("dg.az")
    public static final int[] field1044 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("dg.ag")
    public static final int[] field1045 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("dg.ad")
    public static final int[] field1046 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("dg.ac")
    public static final int[] field1034 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("dg.av")
    public static final int[] field1036 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("dg.ax")
    public static final int[] field1048 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("dg.aq")
    public static int field1049 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("dg.al")
    public static int field1051 = (int) (Math.random() * 33.0D) - 16;

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.ap(B)V")
    public static void method3116() {
        field1035 = 99;
        Statics.field1042 = new short[4][104][104];
        Statics.field1047 = new short[4][104][104];
        Statics.field1037 = new byte[4][104][104];
        Statics.field1038 = new byte[4][104][104];
        Statics.field5379 = new int[4][105][105];
        Statics.field1050 = new byte[4][105][105];
        Statics.field1040 = new int[105][105];
        Statics.field1041 = new int[104];
        Statics.field1039 = new int[104];
        Statics.field5570 = new int[104];
        Statics.field917 = new int[104];
        Statics.field1043 = new int[104];
    }

    @ObfuscatedName("db.aw(B)V")
    public static void method2497() {
        Statics.field1042 = (short[][][]) null;
        Statics.field1047 = (short[][][]) null;
        Statics.field1037 = (byte[][][]) null;
        Statics.field1038 = (byte[][][]) null;
        Statics.field5379 = (int[][][]) null;
        Statics.field1050 = (byte[][][]) null;
        Statics.field1040 = (int[][]) null;
        Statics.field1041 = null;
        Statics.field1039 = null;
        Statics.field5570 = null;
        Statics.field917 = null;
        Statics.field1043 = null;
    }

    @ObfuscatedName("dr.ak(Ldn;IIIII)V")
    public static final void method2371(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        int[][][] var5 = arg0.field1350;
        int var6 = arg0.field1345 - 1;
        int var7 = arg0.field1346 - 1;
        for (int var8 = arg2; var8 <= arg2 + arg4; var8++) {
            for (int var9 = arg1; var9 <= arg1 + arg3; var9++) {
                if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
                    Statics.field1050[0][var9][var8] = 127;
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

    @ObfuscatedName("rm.ai(Ldn;[BIIIIIIIIII)V")
    public static final void method8212(class104 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class271[] var11 = arg0.field1343;
        if (var11 != null) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < var11[arg2].field3012.length && arg4 + var13 > 0 && arg4 + var13 < var11[arg2].field3012[arg3 + var12].length) {
                        var11[arg2].field3012[arg3 + var12][arg4 + var13] &= 0xBFFFFFFF;
                    }
                }
            }
        }
        class558 var14 = new class558(arg1);
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
                        int var25 = arg4 + class355.method3840(var16 & 0x7, var17 & 0x7, arg8);
                        int var26 = (var16 & 0x7) + arg3 + arg9;
                        int var27 = (var17 & 0x7) + arg4 + arg10;
                        method3060(arg0, var14, arg2, var24, var25, var26, var27, arg8);
                    } else {
                        method3060(arg0, var14, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.ay([[[IIIII)V")
    public static final void method3352(int[][][] arg0, int arg1, int arg2, int arg3) {
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

    @ObfuscatedName("ed.as(Ldn;Lvl;IIIIIIB)V")
    public static final void method3060(class104 arg0, class558 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int[][][] var8 = arg0.field1350;
        byte[][][] var9 = arg0.field1351;
        if (arg2 < 0 || arg2 >= 4 || arg3 < 0 || arg3 >= var8[0].length - 1 || arg4 < 0 || arg4 >= var8[0][0].length - 1) {
            while (true) {
                int var19 = arg1.method9260();
                if (var19 == 0) {
                    break;
                }
                if (var19 == 1) {
                    arg1.method9258();
                    break;
                }
                if (var19 <= 49) {
                    arg1.method9261();
                }
            }
            return;
        }
        var9[arg2][arg3][arg4] = 0;
        while (true) {
            int var10 = arg1.method9260();
            if (var10 == 0) {
                if (arg2 == 0) {
                    int[] var11 = var8[0][arg3];
                    int var13 = arg5 + 932731;
                    int var14 = arg6 + 556238;
                    int var15 = method532(var13 + 45365, var14 + 91923, 4) - 128 + (method532(var13 + 10294, var14 + 37821, 2) - 128 >> 1) + (method532(var13, var14, 1) - 128 >> 2);
                    int var16 = (int) ((double) var15 * 0.3D) + 35;
                    if (var16 < 10) {
                        var16 = 10;
                    } else if (var16 > 60) {
                        var16 = 60;
                    }
                    var11[arg4] = -var16 * 8;
                } else {
                    var8[arg2][arg3][arg4] = var8[arg2 - 1][arg3][arg4] - 240;
                }
                break;
            }
            if (var10 == 1) {
                int var18 = arg1.method9258();
                if (var18 == 1) {
                    var18 = 0;
                }
                if (arg2 == 0) {
                    var8[0][arg3][arg4] = -var18 * 8;
                } else {
                    var8[arg2][arg3][arg4] = var8[arg2 - 1][arg3][arg4] - var18 * 8;
                }
                break;
            }
            if (var10 <= 49) {
                Statics.field1047[arg2][arg3][arg4] = (short) arg1.method9261();
                Statics.field1037[arg2][arg3][arg4] = (byte) ((var10 - 2) / 4);
                Statics.field1038[arg2][arg3][arg4] = (byte) (var10 - 2 + arg7 & 0x3);
            } else if (var10 <= 81) {
                var9[arg2][arg3][arg4] = (byte) (var10 - 49);
            } else {
                Statics.field1042[arg2][arg3][arg4] = (short) (var10 - 81);
            }
        }
    }

    @ObfuscatedName("dh.ae([BIIB)Z")
    public static final boolean method2385(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class558 var4 = new class558(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method9414();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method9274();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method9258() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class210 var16 = class210.method3109(var5);
                        if (var13 != 22 || !client.field506 || var16.field2194 != 0 || var16.field2189 == 1 || var16.field2210) {
                            if (!var16.method3961()) {
                                client.field572++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method9274();
                if (var9 == 0) {
                    break;
                }
                var4.method9258();
            }
        }
    }

    @ObfuscatedName("as.am(Ldn;[BIII)V")
    public static final void method43(class104 arg0, byte[] arg1, int arg2, int arg3) {
        class558 var4 = new class558(arg1);
        int var5 = -1;
        while (true) {
            int var6 = var4.method9414();
            if (var6 == 0) {
                return;
            }
            var5 += var6;
            int var7 = 0;
            while (true) {
                int var8 = var4.method9274();
                if (var8 == 0) {
                    break;
                }
                var7 += var8 - 1;
                int var9 = var7 & 0x3F;
                int var10 = var7 >> 6 & 0x3F;
                int var11 = var7 >> 12;
                int var12 = var4.method9258();
                int var13 = var12 >> 2;
                int var14 = var12 & 0x3;
                int var15 = arg2 + var10;
                int var16 = arg3 + var9;
                if (var15 > 0 && var16 > 0 && var15 < arg0.field1350[0].length - 2 && var16 < arg0.field1350[0][0].length - 2) {
                    int var17 = var11;
                    if ((arg0.field1351[1][var15][var16] & 0x2) == 2) {
                        var17 = var11 - 1;
                    }
                    class271 var18 = null;
                    if (var17 >= 0 && arg0.field1343 != null) {
                        var18 = arg0.field1343[var17];
                    }
                    method3122(arg0, var11, var15, var16, var5, var14, var13, var18);
                }
            }
        }
    }

    @ObfuscatedName("dg.at(Ldn;[BIIIIIII)V")
    public static final void method2428(class104 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class558 var9 = new class558(arg1);
        int var10 = -1;
        while (true) {
            int var11 = var9.method9414();
            if (var11 == 0) {
                return;
            }
            var10 += var11;
            int var12 = 0;
            while (true) {
                int var13 = var9.method9274();
                if (var13 == 0) {
                    break;
                }
                var12 += var13 - 1;
                int var14 = var12 & 0x3F;
                int var15 = var12 >> 6 & 0x3F;
                int var16 = var12 >> 12;
                int var17 = var9.method9258();
                int var18 = var17 >> 2;
                int var19 = var17 & 0x3;
                if (arg5 == var16 && var15 >= arg6 && var15 < arg6 + 8 && var14 >= arg7 && var14 < arg7 + 8) {
                    class210 var20 = class210.method3109(var10);
                    int var22 = var15 & 0x7;
                    int var23 = var14 & 0x7;
                    int var25 = var20.field2187;
                    int var26 = var20.field2216;
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
                    int var35 = var20.field2187;
                    int var36 = var20.field2216;
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
                    if (var30 > 0 && var40 > 0 && var30 < arg0.field1345 - 1 && var40 < arg0.field1346 - 1) {
                        int var41 = arg2;
                        if ((arg0.field1351[1][var30][var40] & 0x2) == 2) {
                            var41 = arg2 - 1;
                        }
                        class271 var42 = null;
                        if (var41 >= 0 && arg0.field1343 != null) {
                            var42 = arg0.field1343[var41];
                        }
                        method3122(arg0, arg2, var30, var40, var10, arg8 + var19 & 0x3, var18, var42);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ei.au(Ldn;IIIIIILko;I)V")
    public static final void method3122(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class271 arg7) {
        if (client.field506 && (arg0.field1351[0][arg2][arg3] & 0x2) == 0 && (arg0.field1351[arg1][arg2][arg3] & 0x10) != 0) {
            return;
        }
        if (arg1 < field1035) {
            field1035 = arg1;
        }
        class210 var8 = class210.method3109(arg4);
        int var9;
        int var10;
        if (arg5 == 1 || arg5 == 3) {
            var9 = var8.field2216;
            var10 = var8.field2187;
        } else {
            var9 = var8.field2187;
            var10 = var8.field2216;
        }
        int var11;
        int var12;
        if (arg2 + var9 <= arg0.field1345) {
            var11 = (var9 >> 1) + arg2;
            var12 = (var9 + 1 >> 1) + arg2;
        } else {
            var11 = arg2;
            var12 = arg2 + 1;
        }
        int var13;
        int var14;
        if (arg3 + var10 <= arg0.field1346) {
            var13 = (var10 >> 1) + arg3;
            var14 = (var10 + 1 >> 1) + arg3;
        } else {
            var13 = arg3;
            var14 = arg3 + 1;
        }
        int[][] var15 = arg0.field1350[arg1];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg2 << 7) + (var9 << 6);
        int var18 = (arg3 << 7) + (var10 << 6);
        long var19 = class257.method3345(arg2, arg3, 2, var8.field2194 == 0, arg4, arg0.field1354);
        int var21 = (arg5 << 6) + arg6;
        if (var8.field2195 == 1) {
            var21 += 256;
        }
        if (var8.method3959()) {
            class72.method3333(arg1, arg2, arg3, var8, arg5);
        }
        class245 var22 = arg0.field1352;
        if (arg6 == 22) {
            if (!client.field506 || var8.field2194 != 0 || var8.field2189 == 1 || var8.field2210) {
                class248 var23;
                if (var8.field2204 == -1 && var8.field2178 == null) {
                    var23 = var8.method3952(22, arg5, var15, var17, var16, var18);
                } else {
                    var23 = new class83(arg0, arg4, 22, arg5, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
                }
                var22.method4682(arg1, arg2, arg3, var16, var23, var19, var21);
                if (var8.field2189 == 1 && arg7 != null) {
                    arg7.method5272(arg2, arg3);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class248 var49;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var49 = var8.method3952(10, arg5, var15, var17, var16, var18);
            } else {
                var49 = new class83(arg0, arg4, 10, arg5, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            if (var49 != null && var22.method4769(arg1, arg2, arg3, var16, var9, var10, var49, arg6 == 11 ? 256 : 0, var19, var21) && var8.field2203) {
                int var50 = 15;
                if (var49 instanceof class256) {
                    var50 = ((class256) var49).method5003() / 4;
                    if (var50 > 30) {
                        var50 = 30;
                    }
                }
                for (int var51 = 0; var51 <= var9; var51++) {
                    for (int var52 = 0; var52 <= var10; var52++) {
                        if (var50 > Statics.field1050[arg1][arg2 + var51][arg3 + var52]) {
                            Statics.field1050[arg1][arg2 + var51][arg3 + var52] = (byte) var50;
                        }
                    }
                }
            }
            if (var8.field2189 != 0 && arg7 != null) {
                arg7.method5270(arg2, arg3, var9, var10, var8.field2190);
            }
        } else if (arg6 >= 12) {
            class248 var24;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var24 = var8.method3952(arg6, arg5, var15, var17, var16, var18);
            } else {
                var24 = new class83(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4769(arg1, arg2, arg3, var16, 1, 1, var24, 0, var19, var21);
            if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg1 > 0) {
                Statics.field5379[arg1][arg2][arg3] |= 0x924;
            }
            if (var8.field2189 != 0 && arg7 != null) {
                arg7.method5270(arg2, arg3, var9, var10, var8.field2190);
            }
        } else if (arg6 == 0) {
            class248 var25;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var25 = var8.method3952(0, arg5, var15, var17, var16, var18);
            } else {
                var25 = new class83(arg0, arg4, 0, arg5, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4869(arg1, arg2, arg3, var16, var25, (class248) null, field1044[arg5], 0, var19, var21);
            if (arg5 == 0) {
                if (var8.field2203) {
                    Statics.field1050[arg1][arg2][arg3] = 50;
                    Statics.field1050[arg1][arg2][arg3 + 1] = 50;
                }
                if (var8.field2207) {
                    Statics.field5379[arg1][arg2][arg3] |= 0x249;
                }
            } else if (arg5 == 1) {
                if (var8.field2203) {
                    Statics.field1050[arg1][arg2][arg3 + 1] = 50;
                    Statics.field1050[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2207) {
                    Statics.field5379[arg1][arg2][arg3 + 1] |= 0x492;
                }
            } else if (arg5 == 2) {
                if (var8.field2203) {
                    Statics.field1050[arg1][arg2 + 1][arg3] = 50;
                    Statics.field1050[arg1][arg2 + 1][arg3 + 1] = 50;
                }
                if (var8.field2207) {
                    Statics.field5379[arg1][arg2 + 1][arg3] |= 0x249;
                }
            } else if (arg5 == 3) {
                if (var8.field2203) {
                    Statics.field1050[arg1][arg2][arg3] = 50;
                    Statics.field1050[arg1][arg2 + 1][arg3] = 50;
                }
                if (var8.field2207) {
                    Statics.field5379[arg1][arg2][arg3] |= 0x492;
                }
            }
            if (var8.field2189 != 0 && arg7 != null) {
                arg7.method5269(arg2, arg3, arg6, arg5, var8.field2190);
            }
            if (var8.field2196 != 16) {
                var22.method4692(arg1, arg2, arg3, var8.field2196);
            }
        } else if (arg6 == 1) {
            class248 var26;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var26 = var8.method3952(1, arg5, var15, var17, var16, var18);
            } else {
                var26 = new class83(arg0, arg4, 1, arg5, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4869(arg1, arg2, arg3, var16, var26, (class248) null, field1045[arg5], 0, var19, var21);
            if (var8.field2203) {
                if (arg5 == 0) {
                    Statics.field1050[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field1050[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field1050[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field1050[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2189 != 0 && arg7 != null) {
                arg7.method5269(arg2, arg3, arg6, arg5, var8.field2190);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class248 var28;
            class248 var29;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var28 = var8.method3952(2, arg5 + 4, var15, var17, var16, var18);
                var29 = var8.method3952(2, var27, var15, var17, var16, var18);
            } else {
                var28 = new class83(arg0, arg4, 2, arg5 + 4, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
                var29 = new class83(arg0, arg4, 2, var27, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4869(arg1, arg2, arg3, var16, var28, var29, field1044[arg5], field1044[var27], var19, var21);
            if (var8.field2207) {
                if (arg5 == 0) {
                    Statics.field5379[arg1][arg2][arg3] |= 0x249;
                    Statics.field5379[arg1][arg2][arg3 + 1] |= 0x492;
                } else if (arg5 == 1) {
                    Statics.field5379[arg1][arg2][arg3 + 1] |= 0x492;
                    Statics.field5379[arg1][arg2 + 1][arg3] |= 0x249;
                } else if (arg5 == 2) {
                    Statics.field5379[arg1][arg2 + 1][arg3] |= 0x249;
                    Statics.field5379[arg1][arg2][arg3] |= 0x492;
                } else if (arg5 == 3) {
                    Statics.field5379[arg1][arg2][arg3] |= 0x492;
                    Statics.field5379[arg1][arg2][arg3] |= 0x249;
                }
            }
            if (var8.field2189 != 0 && arg7 != null) {
                arg7.method5269(arg2, arg3, arg6, arg5, var8.field2190);
            }
            if (var8.field2196 != 16) {
                var22.method4692(arg1, arg2, arg3, var8.field2196);
            }
        } else if (arg6 == 3) {
            class248 var30;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var30 = var8.method3952(3, arg5, var15, var17, var16, var18);
            } else {
                var30 = new class83(arg0, arg4, 3, arg5, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4869(arg1, arg2, arg3, var16, var30, (class248) null, field1045[arg5], 0, var19, var21);
            if (var8.field2203) {
                if (arg5 == 0) {
                    Statics.field1050[arg1][arg2][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    Statics.field1050[arg1][arg2 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    Statics.field1050[arg1][arg2 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    Statics.field1050[arg1][arg2][arg3] = 50;
                }
            }
            if (var8.field2189 != 0 && arg7 != null) {
                arg7.method5269(arg2, arg3, arg6, arg5, var8.field2190);
            }
        } else if (arg6 == 9) {
            class248 var31;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var31 = var8.method3952(arg6, arg5, var15, var17, var16, var18);
            } else {
                var31 = new class83(arg0, arg4, arg6, arg5, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4769(arg1, arg2, arg3, var16, 1, 1, var31, 0, var19, var21);
            if (var8.field2189 != 0 && arg7 != null) {
                arg7.method5270(arg2, arg3, var9, var10, var8.field2190);
            }
            if (var8.field2196 != 16) {
                var22.method4692(arg1, arg2, arg3, var8.field2196);
            }
        } else if (arg6 == 4) {
            class248 var32;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var32 = var8.method3952(4, arg5, var15, var17, var16, var18);
            } else {
                var32 = new class83(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4685(arg1, arg2, arg3, var16, var32, (class248) null, field1044[arg5], 0, 0, 0, var19, var21);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = var22.method4790(arg1, arg2, arg3);
            if (var34 != 0L) {
                var33 = class210.method3109(class257.method5896(var34)).field2196;
            }
            class248 var36;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var36 = var8.method3952(4, arg5, var15, var17, var16, var18);
            } else {
                var36 = new class83(arg0, arg4, 4, arg5, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4685(arg1, arg2, arg3, var16, var36, (class248) null, field1044[arg5], 0, field1046[arg5] * var33, field1034[arg5] * var33, var19, var21);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = var22.method4790(arg1, arg2, arg3);
            if (var38 != 0L) {
                var37 = class210.method3109(class257.method5896(var38)).field2196 / 2;
            }
            class248 var40;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var40 = var8.method3952(4, arg5 + 4, var15, var17, var16, var18);
            } else {
                var40 = new class83(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4685(arg1, arg2, arg3, var16, var40, (class248) null, 256, arg5, field1036[arg5] * var37, field1048[arg5] * var37, var19, var21);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class248 var42;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var42 = var8.method3952(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class83(arg0, arg4, 4, var41 + 4, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4685(arg1, arg2, arg3, var16, var42, (class248) null, 256, var41, 0, 0, var19, var21);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = var22.method4790(arg1, arg2, arg3);
            if (var44 != 0L) {
                var43 = class210.method3109(class257.method5896(var44)).field2196 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class248 var47;
            class248 var48;
            if (var8.field2204 == -1 && var8.field2178 == null) {
                var47 = var8.method3952(4, arg5 + 4, var15, var17, var16, var18);
                var48 = var8.method3952(4, var46 + 4, var15, var17, var16, var18);
            } else {
                var47 = new class83(arg0, arg4, 4, arg5 + 4, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
                var48 = new class83(arg0, arg4, 4, var46 + 4, arg1, arg2, arg3, var8.field2204, var8.field2222, (class248) null);
            }
            var22.method4685(arg1, arg2, arg3, var16, var47, var48, 256, arg5, field1036[arg5] * var43, field1048[arg5] * var43, var19, var21);
        }
    }

    @ObfuscatedName("tm.an(Ldn;B)V")
    public static final void method8660(class104 arg0) {
        int var1 = arg0.field1345;
        int var2 = arg0.field1346;
        int[][][] var3 = arg0.field1350;
        byte[][][] var4 = arg0.field1351;
        class245 var5 = arg0.field1352;
        class271[] var6 = arg0.field1343;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var8 = 0; var8 < var1; var8++) {
                for (int var9 = 0; var9 < var2; var9++) {
                    if ((arg0.field1351[var7][var8][var9] & 0x1) == 1) {
                        int var10 = var7;
                        if ((arg0.field1351[1][var8][var9] & 0x2) == 2) {
                            var10 = var7 - 1;
                        }
                        if (var10 >= 0 && var6 != null) {
                            var6[var10].method5271(var8, var9);
                        }
                    }
                }
            }
        }
        field1049 += (int) (Math.random() * 5.0D) - 2;
        if (field1049 < -8) {
            field1049 = -8;
        }
        if (field1049 > 8) {
            field1049 = 8;
        }
        field1051 += (int) (Math.random() * 5.0D) - 2;
        if (field1051 < -16) {
            field1051 = -16;
        }
        if (field1051 > 16) {
            field1051 = 16;
        }
        for (int var11 = 0; var11 < 4; var11++) {
            byte[][] var12 = Statics.field1050[var11];
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
                Statics.field1041[var30] = 0;
                Statics.field1039[var30] = 0;
                Statics.field5570[var30] = 0;
                Statics.field917[var30] = 0;
                Statics.field1043[var30] = 0;
            }
            for (int var31 = -5; var31 < var1 + 5; var31++) {
                for (int var32 = 0; var32 < var2; var32++) {
                    int var33 = var31 + 5;
                    int var10002;
                    if (var33 >= 0 && var33 < var1) {
                        long var34 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var36 = (int) var34;
                        int var37 = Statics.field1042[var11][var33][var32] & var36;
                        if (var37 > 0) {
                            class201 var38 = class201.method2349(var37 - 1);
                            Statics.field1041[var32] += var38.field2102;
                            Statics.field1039[var32] += var38.field2101;
                            Statics.field5570[var32] += var38.field2099;
                            Statics.field917[var32] += var38.field2105;
                            var10002 = Statics.field1043[var32]++;
                        }
                    }
                    int var39 = var31 - 5;
                    if (var39 >= 0 && var39 < var1) {
                        long var40 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var42 = (int) var40;
                        int var43 = Statics.field1042[var11][var39][var32] & var42;
                        if (var43 > 0) {
                            class201 var44 = class201.method2349(var43 - 1);
                            Statics.field1041[var32] -= var44.field2102;
                            Statics.field1039[var32] -= var44.field2101;
                            Statics.field5570[var32] -= var44.field2099;
                            Statics.field917[var32] -= var44.field2105;
                            var10002 = Statics.field1043[var32]--;
                        }
                    }
                }
                if (var31 >= 1 && var31 < var1 - 1) {
                    int var45 = 0;
                    int var46 = 0;
                    int var47 = 0;
                    int var48 = 0;
                    int var49 = 0;
                    for (int var50 = -5; var50 < var2 + 5; var50++) {
                        int var51 = var50 + 5;
                        if (var51 >= 0 && var51 < var2) {
                            var45 += Statics.field1041[var51];
                            var46 += Statics.field1039[var51];
                            var47 += Statics.field5570[var51];
                            var48 += Statics.field917[var51];
                            var49 += Statics.field1043[var51];
                        }
                        int var52 = var50 - 5;
                        if (var52 >= 0 && var52 < var2) {
                            var45 -= Statics.field1041[var52];
                            var46 -= Statics.field1039[var52];
                            var47 -= Statics.field5570[var52];
                            var48 -= Statics.field917[var52];
                            var49 -= Statics.field1043[var52];
                        }
                        if (var50 >= 1 && var50 < var2 - 1 && (!client.field506 || (var4[0][var31][var50] & 0x2) != 0 || (var4[var11][var31][var50] & 0x10) == 0)) {
                            if (var11 < field1035) {
                                field1035 = var11;
                            }
                            long var53 = (long) Math.pow(2.0D, 15.0D) - 1L;
                            int var55 = (int) var53;
                            int var56 = Statics.field1042[var11][var31][var50] & var55;
                            int var57 = Statics.field1047[var11][var31][var50] & var55;
                            if (var56 > 0 || var57 > 0) {
                                int var58 = var3[var11][var31][var50];
                                int var59 = var3[var11][var31 + 1][var50];
                                int var60 = var3[var11][var31 + 1][var50 + 1];
                                int var61 = var3[var11][var31][var50 + 1];
                                int var62 = Statics.field1040[var31][var50];
                                int var63 = Statics.field1040[var31 + 1][var50];
                                int var64 = Statics.field1040[var31 + 1][var50 + 1];
                                int var65 = Statics.field1040[var31][var50 + 1];
                                int var66 = -1;
                                int var67 = -1;
                                if (var56 > 0) {
                                    int var68 = var45 * 256 / var48;
                                    int var69 = var46 / var49;
                                    int var70 = var47 / var49;
                                    var66 = method6913(var68, var69, var70);
                                    int var71 = field1049 + var68 & 0xFF;
                                    int var72 = field1051 + var70;
                                    if (var72 < 0) {
                                        var72 = 0;
                                    } else if (var72 > 255) {
                                        var72 = 255;
                                    }
                                    var67 = method6913(var71, var69, var72);
                                }
                                if (var11 > 0) {
                                    boolean var73 = true;
                                    if (var56 == 0 && Statics.field1037[var11][var31][var50] != 0) {
                                        var73 = false;
                                    }
                                    if (var57 > 0) {
                                        int var74 = var57 - 1;
                                        class212 var75 = (class212) class212.field2292.method5928((long) var74);
                                        class212 var76;
                                        if (var75 == null) {
                                            byte[] var77 = Statics.field2293.method7009(4, var74);
                                            class212 var78 = new class212();
                                            if (var77 != null) {
                                                var78.method4077(new class558(var77), var74);
                                            }
                                            var78.method4071();
                                            class212.field2292.method5931(var78, (long) var74);
                                            var76 = var78;
                                        } else {
                                            var76 = var75;
                                        }
                                        if (!var76.field2301) {
                                            var73 = false;
                                        }
                                    }
                                    if (var73 && var58 == var59 && var58 == var60 && var58 == var61) {
                                        Statics.field5379[var11][var31][var50] |= 0x924;
                                    }
                                }
                                int var79 = 0;
                                if (var67 != -1) {
                                    var79 = class240.field2595[method2468(var67, 96)];
                                }
                                if (var57 == 0) {
                                    var5.method4779(var11, var31, var50, 0, 0, -1, var58, var59, var60, var61, method2468(var66, var62), method2468(var66, var63), method2468(var66, var64), method2468(var66, var65), 0, 0, 0, 0, var79, 0);
                                } else {
                                    int var80 = Statics.field1037[var11][var31][var50] + 1;
                                    byte var81 = Statics.field1038[var11][var31][var50];
                                    int var82 = var57 - 1;
                                    class212 var83 = (class212) class212.field2292.method5928((long) var82);
                                    class212 var84;
                                    if (var83 == null) {
                                        byte[] var85 = Statics.field2293.method7009(4, var82);
                                        class212 var86 = new class212();
                                        if (var85 != null) {
                                            var86.method4077(new class558(var85), var82);
                                        }
                                        var86.method4071();
                                        class212.field2292.method5931(var86, (long) var82);
                                        var84 = var86;
                                    } else {
                                        var84 = var83;
                                    }
                                    int var88 = var84.field2294;
                                    int var89;
                                    int var90;
                                    if (var88 >= 0) {
                                        var89 = class240.field2589.field2913.method4967(var88);
                                        var90 = -1;
                                    } else if (var84.field2299 == 16711935) {
                                        var90 = -2;
                                        var88 = -1;
                                        var89 = -2;
                                    } else {
                                        var90 = method6913(var84.field2295, var84.field2298, var84.field2303);
                                        int var91 = field1049 + var84.field2295 & 0xFF;
                                        int var92 = field1051 + var84.field2303;
                                        if (var92 < 0) {
                                            var92 = 0;
                                        } else if (var92 > 255) {
                                            var92 = 255;
                                        }
                                        var89 = method6913(var91, var84.field2298, var92);
                                    }
                                    int var93 = 0;
                                    if (var89 != -2) {
                                        var93 = class240.field2595[method3845(var89, 96)];
                                    }
                                    if (var84.field2296 != -1) {
                                        int var94 = field1049 + var84.field2300 & 0xFF;
                                        int var95 = field1051 + var84.field2291;
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (var95 > 255) {
                                            var95 = 255;
                                        }
                                        int var96 = method6913(var94, var84.field2302, var95);
                                        var93 = class240.field2595[method3845(var96, 96)];
                                    }
                                    var5.method4779(var11, var31, var50, var80, var81, var88, var58, var59, var60, var61, method2468(var66, var62), method2468(var66, var63), method2468(var66, var64), method2468(var66, var65), method3845(var90, var62), method3845(var90, var63), method3845(var90, var64), method3845(var90, var65), var79, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var97 = 1; var97 < var2 - 1; var97++) {
                for (int var98 = 1; var98 < var1 - 1; var98++) {
                    var5.method4680(var11, var98, var97, Statics.method2000(arg0, var11, var98, var97));
                }
            }
            Statics.field1042[var11] = (short[][]) null;
            Statics.field1047[var11] = (short[][]) null;
            Statics.field1037[var11] = (byte[][]) null;
            Statics.field1038[var11] = (byte[][]) null;
            Statics.field1050[var11] = (byte[][]) null;
        }
        var5.method4707(-50, -10, -50);
        for (int var99 = 0; var99 < var1; var99++) {
            for (int var100 = 0; var100 < var2; var100++) {
                if ((var4[1][var99][var100] & 0x2) == 2) {
                    var5.method4797(var99, var100);
                }
            }
        }
        int var101 = 1;
        int var102 = 2;
        int var103 = 4;
        for (int var104 = 0; var104 < 4; var104++) {
            if (var104 > 0) {
                var101 <<= 0x3;
                var102 <<= 0x3;
                var103 <<= 0x3;
            }
            for (int var105 = 0; var105 <= var104; var105++) {
                for (int var106 = 0; var106 <= var2; var106++) {
                    for (int var107 = 0; var107 <= var1; var107++) {
                        if ((Statics.field5379[var105][var107][var106] & var101) != 0) {
                            int var108 = var106;
                            int var109 = var106;
                            int var110 = var105;
                            int var111 = var105;
                            while (var108 > 0 && (Statics.field5379[var105][var107][var108 - 1] & var101) != 0) {
                                var108--;
                            }
                            while (var109 < var2 && (Statics.field5379[var105][var107][var109 + 1] & var101) != 0) {
                                var109++;
                            }
                            label357: while (var110 > 0) {
                                for (int var112 = var108; var112 <= var109; var112++) {
                                    if ((Statics.field5379[var110 - 1][var107][var112] & var101) == 0) {
                                        break label357;
                                    }
                                }
                                var110--;
                            }
                            label346: while (var111 < var104) {
                                for (int var113 = var108; var113 <= var109; var113++) {
                                    if ((Statics.field5379[var111 + 1][var107][var113] & var101) == 0) {
                                        break label346;
                                    }
                                }
                                var111++;
                            }
                            int var114 = (var111 + 1 - var110) * (var109 - var108 + 1);
                            if (var114 >= 8) {
                                short var115 = 240;
                                int var116 = var3[var111][var107][var108] - var115;
                                int var117 = var3[var110][var107][var108];
                                var5.method4679(var104, 1, var107 * 128, var107 * 128, var108 * 128, var109 * 128 + 128, var116, var117);
                                for (int var118 = var110; var118 <= var111; var118++) {
                                    for (int var119 = var108; var119 <= var109; var119++) {
                                        Statics.field5379[var118][var107][var119] &= ~var101;
                                    }
                                }
                            }
                        }
                        if ((Statics.field5379[var105][var107][var106] & var102) != 0) {
                            int var120 = var107;
                            int var121 = var107;
                            int var122 = var105;
                            int var123 = var105;
                            while (var120 > 0 && (Statics.field5379[var105][var120 - 1][var106] & var102) != 0) {
                                var120--;
                            }
                            while (var121 < var1 && (Statics.field5379[var105][var121 + 1][var106] & var102) != 0) {
                                var121++;
                            }
                            label410: while (var122 > 0) {
                                for (int var124 = var120; var124 <= var121; var124++) {
                                    if ((Statics.field5379[var122 - 1][var124][var106] & var102) == 0) {
                                        break label410;
                                    }
                                }
                                var122--;
                            }
                            label399: while (var123 < var104) {
                                for (int var125 = var120; var125 <= var121; var125++) {
                                    if ((Statics.field5379[var123 + 1][var125][var106] & var102) == 0) {
                                        break label399;
                                    }
                                }
                                var123++;
                            }
                            int var126 = (var123 + 1 - var122) * (var121 - var120 + 1);
                            if (var126 >= 8) {
                                short var127 = 240;
                                int var128 = var3[var123][var120][var106] - var127;
                                int var129 = var3[var122][var120][var106];
                                var5.method4679(var104, 2, var120 * 128, var121 * 128 + 128, var106 * 128, var106 * 128, var128, var129);
                                for (int var130 = var122; var130 <= var123; var130++) {
                                    for (int var131 = var120; var131 <= var121; var131++) {
                                        Statics.field5379[var130][var131][var106] &= ~var102;
                                    }
                                }
                            }
                        }
                        if ((Statics.field5379[var105][var107][var106] & var103) != 0) {
                            int var132 = var107;
                            int var133 = var107;
                            int var134 = var106;
                            int var135 = var106;
                            while (var134 > 0 && (Statics.field5379[var105][var107][var134 - 1] & var103) != 0) {
                                var134--;
                            }
                            while (var135 < var2 && (Statics.field5379[var105][var107][var135 + 1] & var103) != 0) {
                                var135++;
                            }
                            label463: while (var132 > 0) {
                                for (int var136 = var134; var136 <= var135; var136++) {
                                    if ((Statics.field5379[var105][var132 - 1][var136] & var103) == 0) {
                                        break label463;
                                    }
                                }
                                var132--;
                            }
                            label452: while (var133 < var1) {
                                for (int var137 = var134; var137 <= var135; var137++) {
                                    if ((Statics.field5379[var105][var133 + 1][var137] & var103) == 0) {
                                        break label452;
                                    }
                                }
                                var133++;
                            }
                            if ((var133 - var132 + 1) * (var135 - var134 + 1) >= 4) {
                                int var138 = var3[var105][var132][var134];
                                var5.method4679(var104, 4, var132 * 128, var133 * 128 + 128, var134 * 128, var135 * 128 + 128, var138, var138);
                                for (int var139 = var132; var139 <= var133; var139++) {
                                    for (int var140 = var134; var140 <= var135; var140++) {
                                        Statics.field5379[var105][var139][var140] &= ~var103;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.af(IIIS)I")
    public static final int method532(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method8311(var3, var5);
        int var8 = method8311(var3 + 1, var5);
        int var9 = method8311(var3, var5 + 1);
        int var10 = method8311(var3 + 1, var5 + 1);
        int var11 = method4211(var7, var8, var4, arg2);
        int var12 = method4211(var9, var10, var4, arg2);
        return method4211(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ic.ar(IIIII)I")
    public static final int method4211(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class240.field2592[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("su.ab(IIS)I")
    public static final int method8311(int arg0, int arg1) {
        int var2 = method3102(arg0 - 1, arg1 - 1) + method3102(arg0 + 1, arg1 - 1) + method3102(arg0 - 1, arg1 + 1) + method3102(arg0 + 1, arg1 + 1);
        int var3 = method3102(arg0 - 1, arg1) + method3102(arg0 + 1, arg1) + method3102(arg0, arg1 - 1) + method3102(arg0, arg1 + 1);
        int var4 = method3102(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ej.az(III)I")
    public static final int method3102(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dk.ag(III)I")
    public static final int method2468(int arg0, int arg1) {
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

    @ObfuscatedName("hp.ad(IIS)I")
    public static final int method3845(int arg0, int arg1) {
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

    @ObfuscatedName("oy.ac(IIIB)I")
    public static final int method6913(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bc.av(Ldn;IIIIIIIILko;I)V")
    public static final void method662(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class271 arg9) {
        class210 var10 = class210.method3109(arg5);
        int var11 = arg8 >= 0 ? arg8 : var10.field2204;
        int var12;
        int var13;
        if (arg6 == 1 || arg6 == 3) {
            var12 = var10.field2216;
            var13 = var10.field2187;
        } else {
            var12 = var10.field2187;
            var13 = var10.field2216;
        }
        int var14;
        int var15;
        if (arg3 + var12 <= arg0.field1345) {
            var14 = (var12 >> 1) + arg3;
            var15 = (var12 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int var16;
        int var17;
        if (arg4 + var13 <= arg0.field1346) {
            var16 = (var13 >> 1) + arg4;
            var17 = (var13 + 1 >> 1) + arg4;
        } else {
            var16 = arg4;
            var17 = arg4 + 1;
        }
        int[][] var18 = arg0.field1350[arg2];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg3 << 7) + (var12 << 6);
        int var21 = (arg4 << 7) + (var13 << 6);
        class245 var22 = arg0.field1352;
        long var23 = class257.method3345(arg3, arg4, 2, var10.field2194 == 0, arg5, arg0.field1354);
        int var25 = (arg6 << 6) + arg7;
        if (var10.field2195 == 1) {
            var25 += 256;
        }
        if (arg7 == 22) {
            class248 var26;
            if (var11 == -1 && var10.field2178 == null) {
                var26 = var10.method3953(22, arg6, var18, var20, var19, var21);
            } else {
                var26 = new class83(arg0, arg5, 22, arg6, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4682(arg1, arg3, arg4, var19, var26, var23, var25);
            if (var10.field2189 == 1 && arg9 != null) {
                arg9.method5272(arg3, arg4);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class248 var52;
            if (var11 == -1 && var10.field2178 == null) {
                var52 = var10.method3953(10, arg6, var18, var20, var19, var21);
            } else {
                var52 = new class83(arg0, arg5, 10, arg6, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            if (var52 != null) {
                var22.method4769(arg1, arg3, arg4, var19, var12, var13, var52, arg7 == 11 ? 256 : 0, var23, var25);
            }
            if (var10.field2189 != 0 && arg9 != null) {
                arg9.method5270(arg3, arg4, var12, var13, var10.field2190);
            }
        } else if (arg7 >= 12) {
            class248 var27;
            if (var11 == -1 && var10.field2178 == null) {
                var27 = var10.method3953(arg7, arg6, var18, var20, var19, var21);
            } else {
                var27 = new class83(arg0, arg5, arg7, arg6, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4769(arg1, arg3, arg4, var19, 1, 1, var27, 0, var23, var25);
            if (var10.field2189 != 0 && arg9 != null) {
                arg9.method5270(arg3, arg4, var12, var13, var10.field2190);
            }
        } else if (arg7 == 0) {
            class248 var28;
            if (var11 == -1 && var10.field2178 == null) {
                var28 = var10.method3953(0, arg6, var18, var20, var19, var21);
            } else {
                var28 = new class83(arg0, arg5, 0, arg6, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4869(arg1, arg3, arg4, var19, var28, (class248) null, field1044[arg6], 0, var23, var25);
            if (var10.field2189 != 0 && arg9 != null) {
                arg9.method5269(arg3, arg4, arg7, arg6, var10.field2190);
            }
        } else if (arg7 == 1) {
            class248 var29;
            if (var11 == -1 && var10.field2178 == null) {
                var29 = var10.method3953(1, arg6, var18, var20, var19, var21);
            } else {
                var29 = new class83(arg0, arg5, 1, arg6, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4869(arg1, arg3, arg4, var19, var29, (class248) null, field1045[arg6], 0, var23, var25);
            if (var10.field2189 != 0 && arg9 != null) {
                arg9.method5269(arg3, arg4, arg7, arg6, var10.field2190);
            }
        } else if (arg7 == 2) {
            int var30 = arg6 + 1 & 0x3;
            class248 var31;
            class248 var32;
            if (var11 == -1 && var10.field2178 == null) {
                var31 = var10.method3953(2, arg6 + 4, var18, var20, var19, var21);
                var32 = var10.method3953(2, var30, var18, var20, var19, var21);
            } else {
                var31 = new class83(arg0, arg5, 2, arg6 + 4, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
                var32 = new class83(arg0, arg5, 2, var30, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4869(arg1, arg3, arg4, var19, var31, var32, field1044[arg6], field1044[var30], var23, var25);
            if (var10.field2189 != 0 && arg9 != null) {
                arg9.method5269(arg3, arg4, arg7, arg6, var10.field2190);
            }
        } else if (arg7 == 3) {
            class248 var33;
            if (var11 == -1 && var10.field2178 == null) {
                var33 = var10.method3953(3, arg6, var18, var20, var19, var21);
            } else {
                var33 = new class83(arg0, arg5, 3, arg6, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4869(arg1, arg3, arg4, var19, var33, (class248) null, field1045[arg6], 0, var23, var25);
            if (var10.field2189 != 0 && arg9 != null) {
                arg9.method5269(arg3, arg4, arg7, arg6, var10.field2190);
            }
        } else if (arg7 == 9) {
            class248 var34;
            if (var11 == -1 && var10.field2178 == null) {
                var34 = var10.method3953(arg7, arg6, var18, var20, var19, var21);
            } else {
                var34 = new class83(arg0, arg5, arg7, arg6, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4769(arg1, arg3, arg4, var19, 1, 1, var34, 0, var23, var25);
            if (var10.field2189 != 0 && arg9 != null) {
                arg9.method5270(arg3, arg4, var12, var13, var10.field2190);
            }
        } else if (arg7 == 4) {
            class248 var35;
            if (var11 == -1 && var10.field2178 == null) {
                var35 = var10.method3953(4, arg6, var18, var20, var19, var21);
            } else {
                var35 = new class83(arg0, arg5, 4, arg6, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4685(arg1, arg3, arg4, var19, var35, (class248) null, field1044[arg6], 0, 0, 0, var23, var25);
        } else if (arg7 == 5) {
            int var36 = 16;
            long var37 = var22.method4790(arg1, arg3, arg4);
            if (var37 != 0L) {
                var36 = class210.method3109(class257.method5896(var37)).field2196;
            }
            class248 var39;
            if (var11 == -1 && var10.field2178 == null) {
                var39 = var10.method3953(4, arg6, var18, var20, var19, var21);
            } else {
                var39 = new class83(arg0, arg5, 4, arg6, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4685(arg1, arg3, arg4, var19, var39, (class248) null, field1044[arg6], 0, field1046[arg6] * var36, field1034[arg6] * var36, var23, var25);
        } else if (arg7 == 6) {
            int var40 = 8;
            long var41 = var22.method4790(arg1, arg3, arg4);
            if (var41 != 0L) {
                var40 = class210.method3109(class257.method5896(var41)).field2196 / 2;
            }
            class248 var43;
            if (var11 == -1 && var10.field2178 == null) {
                var43 = var10.method3953(4, arg6 + 4, var18, var20, var19, var21);
            } else {
                var43 = new class83(arg0, arg5, 4, arg6 + 4, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4685(arg1, arg3, arg4, var19, var43, (class248) null, 256, arg6, field1036[arg6] * var40, field1048[arg6] * var40, var23, var25);
        } else if (arg7 == 7) {
            int var44 = arg6 + 2 & 0x3;
            class248 var45;
            if (var11 == -1 && var10.field2178 == null) {
                var45 = var10.method3953(4, var44 + 4, var18, var20, var19, var21);
            } else {
                var45 = new class83(arg0, arg5, 4, var44 + 4, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4685(arg1, arg3, arg4, var19, var45, (class248) null, 256, var44, 0, 0, var23, var25);
        } else if (arg7 == 8) {
            int var46 = 8;
            long var47 = var22.method4790(arg1, arg3, arg4);
            if (var47 != 0L) {
                var46 = class210.method3109(class257.method5896(var47)).field2196 / 2;
            }
            int var49 = arg6 + 2 & 0x3;
            class248 var50;
            class248 var51;
            if (var11 == -1 && var10.field2178 == null) {
                var50 = var10.method3953(4, arg6 + 4, var18, var20, var19, var21);
                var51 = var10.method3953(4, var49 + 4, var18, var20, var19, var21);
            } else {
                var50 = new class83(arg0, arg5, 4, arg6 + 4, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
                var51 = new class83(arg0, arg5, 4, var49 + 4, arg2, arg3, arg4, var11, var10.field2222, (class248) null);
            }
            var22.method4685(arg1, arg3, arg4, var19, var50, var51, 256, arg6, field1036[arg6] * var46, field1048[arg6] * var46, var23, var25);
        }
    }
}
