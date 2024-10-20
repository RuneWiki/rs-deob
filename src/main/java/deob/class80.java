package deob;

@ObfuscatedName("dg")
public final class class80 {

    @ObfuscatedName("dg.aj")
    public static int[][][] field1000 = new int[4][105][105];

    @ObfuscatedName("dg.al")
    public static byte[][][] field994 = new byte[4][104][104];

    @ObfuscatedName("dg.ac")
    public static int field995 = 99;

    @ObfuscatedName("dg.ag")
    public static final int[] field999 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("dg.at")
    public static final int[] field1007 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("dg.af")
    public static final int[] field1001 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("dg.ai")
    public static final int[] field1003 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("dg.aw")
    public static final int[] field1004 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("dg.aa")
    public static final int[] field1005 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("dg.ah")
    public static int field993 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("dg.ad")
    public static int field1002 = (int) (Math.random() * 33.0D) - 16;

    public class80() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.aj(B)V")
    public static void method103() {
        field995 = 99;
        Statics.field996 = new short[4][104][104];
        Statics.field997 = new short[4][104][104];
        Statics.field82 = new byte[4][104][104];
        Statics.field998 = new byte[4][104][104];
        Statics.field89 = new int[4][105][105];
        Statics.field406 = new byte[4][105][105];
        Statics.field3446 = new int[105][105];
        Statics.field1006 = new int[104];
        Statics.field1577 = new int[104];
        Statics.field4301 = new int[104];
        Statics.field1319 = new int[104];
        Statics.field841 = new int[104];
    }

    @ObfuscatedName("bz.al(B)V")
    public static void method669() {
        Statics.field996 = (short[][][]) null;
        Statics.field997 = (short[][][]) null;
        Statics.field82 = (byte[][][]) null;
        Statics.field998 = (byte[][][]) null;
        Statics.field89 = (int[][][]) null;
        Statics.field406 = (byte[][][]) null;
        Statics.field3446 = (int[][]) null;
        Statics.field1006 = null;
        Statics.field1577 = null;
        Statics.field4301 = null;
        Statics.field1319 = null;
        Statics.field841 = null;
    }

    @ObfuscatedName("nb.ac(IIIII)V")
    public static final void method6050(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field406[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1000[0][var5][var4] = field1000[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1000[0][var5][var4] = field1000[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1000[0][var5][var4] = field1000[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1000[0][var5][var4] = field1000[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("co.ab([BIIII[Liz;B)V")
    public static final void method1052(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class210[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2318[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class478 var9 = new class478(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    method4878(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("ik.an([BIIIIIIIII[Liz;I)V")
    public static final void method4006(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class210[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2318[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class478 var13 = new class478(arg0);
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
                        int var25 = var15 & 0x7;
                        int var26 = var16 & 0x7;
                        int var28 = arg7 & 0x3;
                        int var29;
                        if (var28 == 0) {
                            var29 = var26;
                        } else if (var28 == 1) {
                            var29 = 7 - var25;
                        } else if (var28 == 2) {
                            var29 = 7 - var26;
                        } else {
                            var29 = var25;
                        }
                        int var30 = arg3 + var29;
                        int var31 = (var15 & 0x7) + arg2 + arg8;
                        int var32 = (var16 & 0x7) + arg3 + arg9;
                        method4878(var13, arg1, var23, var30, var31, var32, arg7);
                    } else {
                        method4878(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cm.ao(IIII)V")
    public static final void method1958(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1000[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1000[arg0][arg1][arg2 + var5] = field1000[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1000[arg0][arg1 + var6][arg2] = field1000[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1000[arg0][arg1 - 1][arg2] != 0) {
            field1000[arg0][arg1][arg2] = field1000[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1000[arg0][arg1][arg2 - 1] != 0) {
            field1000[arg0][arg1][arg2] = field1000[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1000[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1000[arg0][arg1][arg2] = field1000[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("kn.av(Lsy;IIIIIII)V")
    public static final void method4878(class478 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class91.method5783(arg1, arg2, arg3)) {
            while (true) {
                int var9 = arg0.method7905();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method7909();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method7882();
                }
            }
            return;
        }
        field994[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method7905();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field1000[0][arg2][arg3] = -method3809(arg4 + 932731, arg5 + 556238) * 8;
                } else {
                    field1000[arg1][arg2][arg3] = field1000[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method7909();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field1000[0][arg2][arg3] = -var8 * 8;
                } else {
                    field1000[arg1][arg2][arg3] = field1000[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field997[arg1][arg2][arg3] = (short) arg0.method7882();
                Statics.field82[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field998[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field994[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field996[arg1][arg2][arg3] = (short) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fh.aq([BIIB)Z")
    public static final boolean method2973(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class478 var4 = new class478(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method7980();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method7918();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method7909() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class203 var16 = Statics.method4396(var5);
                        if (var13 != 22 || !client.field486 || var16.field2144 != 0 || var16.field2124 == 1 || var16.field2163) {
                            if (!var16.method3538()) {
                                client.field549++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method7918();
                if (var9 == 0) {
                    break;
                }
                var4.method7909();
            }
        }
    }

    @ObfuscatedName("ji.ap([BIILir;[Liz;B)V")
    public static final void method4780(byte[] arg0, int arg1, int arg2, class223 arg3, class210[] arg4) {
        class478 var5 = new class478(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method7980();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method7918();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method7909();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field994[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class210 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method436(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dg.ar([BIIIIIIILir;[Liz;)V")
    public static final void method2063(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class223 arg8, class210[] arg9) {
        class478 var10 = new class478(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method7980();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method7918();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method7909();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class203 var21 = Statics.method4396(var11);
                    int var22 = arg2 + class307.method2709(var16 & 0x7, var15 & 0x7, arg7, var21.field2174, var21.field2141, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field2174;
                    int var28 = var21.field2141;
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
                        if ((field994[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class210 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method436(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.ak(IIIIIILir;Liz;I)V")
    public static final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class223 arg6, class210 arg7) {
        if (client.field486 && (field994[0][arg1][arg2] & 0x2) == 0 && (field994[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field995) {
            field995 = arg0;
        }
        class203 var8 = Statics.method4396(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2141;
            var10 = var8.field2174;
        } else {
            var9 = var8.field2174;
            var10 = var8.field2141;
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
        int[][] var15 = field1000[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class232.method2538(arg1, arg2, 2, var8.field2144 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2165 == 1) {
            var21 += 256;
        }
        if (var8.method3570()) {
            class67.method6746(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field486 || var8.field2144 != 0 || var8.field2124 == 1 || var8.field2163) {
                class225 var22;
                if (var8.field2160 == -1 && var8.field2129 == null) {
                    var22 = var8.method3544(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class78(arg3, 22, arg4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
                }
                arg6.method4039(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2124 == 1 && arg7 != null) {
                    arg7.method3778(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class225 var48;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var48 = var8.method3544(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class78(arg3, 10, arg4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            if (var48 != null && arg6.method4179(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2156) {
                int var49 = 15;
                if (var48 instanceof class231) {
                    var49 = ((class231) var48).method4268() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field406[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field406[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2124 != 0 && arg7 != null) {
                arg7.method3769(arg1, arg2, var9, var10, var8.field2143);
            }
        } else if (arg5 >= 12) {
            class225 var23;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var23 = var8.method3544(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class78(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4179(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field89[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2124 != 0 && arg7 != null) {
                arg7.method3769(arg1, arg2, var9, var10, var8.field2143);
            }
        } else if (arg5 == 0) {
            class225 var24;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var24 = var8.method3544(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class78(arg3, 0, arg4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4177(arg0, arg1, arg2, var16, var24, (class225) null, field999[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2156) {
                    Statics.field406[arg0][arg1][arg2] = 50;
                    Statics.field406[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2158) {
                    Statics.field89[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2156) {
                    Statics.field406[arg0][arg1][arg2 + 1] = 50;
                    Statics.field406[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2158) {
                    Statics.field89[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2156) {
                    Statics.field406[arg0][arg1 + 1][arg2] = 50;
                    Statics.field406[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2158) {
                    Statics.field89[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2156) {
                    Statics.field406[arg0][arg1][arg2] = 50;
                    Statics.field406[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2158) {
                    Statics.field89[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2124 != 0 && arg7 != null) {
                arg7.method3768(arg1, arg2, arg5, arg4, var8.field2143);
            }
            if (var8.field2139 != 16) {
                arg6.method4178(arg0, arg1, arg2, var8.field2139);
            }
        } else if (arg5 == 1) {
            class225 var25;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var25 = var8.method3544(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class78(arg3, 1, arg4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4177(arg0, arg1, arg2, var16, var25, (class225) null, field1007[arg4], 0, var19, var21);
            if (var8.field2156) {
                if (arg4 == 0) {
                    Statics.field406[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field406[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field406[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field406[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2124 != 0 && arg7 != null) {
                arg7.method3768(arg1, arg2, arg5, arg4, var8.field2143);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class225 var27;
            class225 var28;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var27 = var8.method3544(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3544(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class78(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
                var28 = new class78(arg3, 2, var26, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4177(arg0, arg1, arg2, var16, var27, var28, field999[arg4], field999[var26], var19, var21);
            if (var8.field2158) {
                if (arg4 == 0) {
                    Statics.field89[arg0][arg1][arg2] |= 0x249;
                    Statics.field89[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field89[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field89[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field89[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field89[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field89[arg0][arg1][arg2] |= 0x492;
                    Statics.field89[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2124 != 0 && arg7 != null) {
                arg7.method3768(arg1, arg2, arg5, arg4, var8.field2143);
            }
            if (var8.field2139 != 16) {
                arg6.method4178(arg0, arg1, arg2, var8.field2139);
            }
        } else if (arg5 == 3) {
            class225 var29;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var29 = var8.method3544(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class78(arg3, 3, arg4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4177(arg0, arg1, arg2, var16, var29, (class225) null, field1007[arg4], 0, var19, var21);
            if (var8.field2156) {
                if (arg4 == 0) {
                    Statics.field406[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field406[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field406[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field406[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2124 != 0 && arg7 != null) {
                arg7.method3768(arg1, arg2, arg5, arg4, var8.field2143);
            }
        } else if (arg5 == 9) {
            class225 var30;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var30 = var8.method3544(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class78(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4179(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2124 != 0 && arg7 != null) {
                arg7.method3769(arg1, arg2, var9, var10, var8.field2143);
            }
            if (var8.field2139 != 16) {
                arg6.method4178(arg0, arg1, arg2, var8.field2139);
            }
        } else if (arg5 == 4) {
            class225 var31;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var31 = var8.method3544(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class78(arg3, 4, arg4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4110(arg0, arg1, arg2, var16, var31, (class225) null, field999[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4059(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = Statics.method4396(class232.method4938(var33)).field2139;
            }
            class225 var35;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var35 = var8.method3544(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class78(arg3, 4, arg4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4110(arg0, arg1, arg2, var16, var35, (class225) null, field999[arg4], 0, field1001[arg4] * var32, field1003[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4059(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = Statics.method4396(class232.method4938(var37)).field2139 / 2;
            }
            class225 var39;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var39 = var8.method3544(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class78(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4110(arg0, arg1, arg2, var16, var39, (class225) null, 256, arg4, field1004[arg4] * var36, field1005[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class225 var41;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var41 = var8.method3544(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class78(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4110(arg0, arg1, arg2, var16, var41, (class225) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4059(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = Statics.method4396(class232.method4938(var43)).field2139 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class225 var46;
            class225 var47;
            if (var8.field2160 == -1 && var8.field2129 == null) {
                var46 = var8.method3544(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3544(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class78(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
                var47 = new class78(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2160, var8.field2149, (class225) null);
            }
            arg6.method4110(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1004[arg4] * var42, field1005[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("et.ax(Lir;[Liz;I)V")
    public static final void method2721(class223 arg0, class210[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field994[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field994[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3770(var3, var4);
                        }
                    }
                }
            }
        }
        field993 += (int) (Math.random() * 5.0D) - 2;
        if (field993 < -8) {
            field993 = -8;
        }
        if (field993 > 8) {
            field993 = 8;
        }
        field1002 += (int) (Math.random() * 5.0D) - 2;
        if (field1002 < -16) {
            field1002 = -16;
        }
        if (field1002 > 16) {
            field1002 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field406[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1000[var6][var16 + 1][var15] - field1000[var6][var16 - 1][var15];
                    int var18 = field1000[var6][var16][var15 + 1] - field1000[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field3446[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field1006[var25] = 0;
                Statics.field1577[var25] = 0;
                Statics.field4301[var25] = 0;
                Statics.field1319[var25] = 0;
                Statics.field841[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = (int) class292.method4778(15);
                        int var30 = Statics.field996[var6][var28][var27] & var29;
                        if (var30 > 0) {
                            class196 var31 = class196.method2925(var30 - 1);
                            Statics.field1006[var27] += var31.field2064;
                            Statics.field1577[var27] += var31.field2065;
                            Statics.field4301[var27] += var31.field2071;
                            Statics.field1319[var27] += var31.field2070;
                            var10002 = Statics.field841[var27]++;
                        }
                    }
                    int var32 = var26 - 5;
                    if (var32 >= 0 && var32 < 104) {
                        int var33 = (int) class292.method4778(15);
                        int var34 = Statics.field996[var6][var32][var27] & var33;
                        if (var34 > 0) {
                            class196 var35 = class196.method2925(var34 - 1);
                            Statics.field1006[var27] -= var35.field2064;
                            Statics.field1577[var27] -= var35.field2065;
                            Statics.field4301[var27] -= var35.field2071;
                            Statics.field1319[var27] -= var35.field2070;
                            var10002 = Statics.field841[var27]--;
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
                            var36 += Statics.field1006[var42];
                            var37 += Statics.field1577[var42];
                            var38 += Statics.field4301[var42];
                            var39 += Statics.field1319[var42];
                            var40 += Statics.field841[var42];
                        }
                        int var43 = var41 - 5;
                        if (var43 >= 0 && var43 < 104) {
                            var36 -= Statics.field1006[var43];
                            var37 -= Statics.field1577[var43];
                            var38 -= Statics.field4301[var43];
                            var39 -= Statics.field1319[var43];
                            var40 -= Statics.field841[var43];
                        }
                        if (var41 >= 1 && var41 < 103 && (!client.field486 || (field994[0][var26][var41] & 0x2) != 0 || (field994[var6][var26][var41] & 0x10) == 0)) {
                            if (var6 < field995) {
                                field995 = var6;
                            }
                            int var44 = (int) class292.method4778(15);
                            int var45 = Statics.field996[var6][var26][var41] & var44;
                            int var46 = Statics.field997[var6][var26][var41] & var44;
                            if (var45 > 0 || var46 > 0) {
                                int var47 = field1000[var6][var26][var41];
                                int var48 = field1000[var6][var26 + 1][var41];
                                int var49 = field1000[var6][var26 + 1][var41 + 1];
                                int var50 = field1000[var6][var26][var41 + 1];
                                int var51 = Statics.field3446[var26][var41];
                                int var52 = Statics.field3446[var26 + 1][var41];
                                int var53 = Statics.field3446[var26 + 1][var41 + 1];
                                int var54 = Statics.field3446[var26][var41 + 1];
                                int var55 = -1;
                                int var56 = -1;
                                if (var45 > 0) {
                                    int var57 = var36 * 256 / var39;
                                    int var58 = var37 / var40;
                                    int var59 = var38 / var40;
                                    var55 = Statics.method2761(var57, var58, var59);
                                    int var60 = field993 + var57 & 0xFF;
                                    int var61 = field1002 + var59;
                                    if (var61 < 0) {
                                        var61 = 0;
                                    } else if (var61 > 255) {
                                        var61 = 255;
                                    }
                                    var56 = Statics.method2761(var60, var58, var61);
                                }
                                if (var6 > 0) {
                                    boolean var62 = true;
                                    if (var45 == 0 && Statics.field82[var6][var26][var41] != 0) {
                                        var62 = false;
                                    }
                                    if (var46 > 0 && !class205.method154(var46 - 1).field2236) {
                                        var62 = false;
                                    }
                                    if (var62 && var47 == var48 && var47 == var49 && var47 == var50) {
                                        Statics.field89[var6][var26][var41] |= 0x924;
                                    }
                                }
                                int var63 = 0;
                                if (var56 != -1) {
                                    var63 = class220.field2488[method5599(var56, 96)];
                                }
                                if (var46 == 0) {
                                    arg0.method4134(var6, var26, var41, 0, 0, -1, var47, var48, var49, var50, method5599(var55, var51), method5599(var55, var52), method5599(var55, var53), method5599(var55, var54), 0, 0, 0, 0, var63, 0);
                                } else {
                                    int var64 = Statics.field82[var6][var26][var41] + 1;
                                    byte var65 = Statics.field998[var6][var26][var41];
                                    class205 var66 = class205.method154(var46 - 1);
                                    int var67 = var66.field2239;
                                    int var68;
                                    int var69;
                                    if (var67 >= 0) {
                                        var68 = Statics.field2489.method4213(var67);
                                        var69 = -1;
                                    } else if (var66.field2243 == 16711935) {
                                        var69 = -2;
                                        var67 = -1;
                                        var68 = -2;
                                    } else {
                                        var69 = Statics.method2761(var66.field2242, var66.field2238, var66.field2244);
                                        int var70 = field993 + var66.field2242 & 0xFF;
                                        int var71 = field1002 + var66.field2244;
                                        if (var71 < 0) {
                                            var71 = 0;
                                        } else if (var71 > 255) {
                                            var71 = 255;
                                        }
                                        var68 = Statics.method2761(var70, var66.field2238, var71);
                                    }
                                    int var72 = 0;
                                    if (var68 != -2) {
                                        var72 = class220.field2488[method1963(var68, 96)];
                                    }
                                    if (var66.field2247 != -1) {
                                        int var73 = field993 + var66.field2245 & 0xFF;
                                        int var74 = field1002 + var66.field2240;
                                        if (var74 < 0) {
                                            var74 = 0;
                                        } else if (var74 > 255) {
                                            var74 = 255;
                                        }
                                        int var75 = Statics.method2761(var73, var66.field2249, var74);
                                        var72 = class220.field2488[method1963(var75, 96)];
                                    }
                                    arg0.method4134(var6, var26, var41, var64, var65, var67, var47, var48, var49, var50, method5599(var55, var51), method5599(var55, var52), method5599(var55, var53), method5599(var55, var54), method1963(var69, var51), method1963(var69, var52), method1963(var69, var53), method1963(var69, var54), var63, var72);
                                }
                            }
                        }
                    }
                }
            }
            for (int var76 = 1; var76 < 103; var76++) {
                for (int var77 = 1; var77 < 103; var77++) {
                    int var82;
                    if ((field994[var6][var77][var76] & 0x8) != 0) {
                        var82 = 0;
                    } else if (var6 <= 0 || (field994[1][var77][var76] & 0x2) == 0) {
                        var82 = var6;
                    } else {
                        var82 = var6 - 1;
                    }
                    arg0.method4032(var6, var77, var76, var82);
                }
            }
            Statics.field996[var6] = (short[][]) null;
            Statics.field997[var6] = (short[][]) null;
            Statics.field82[var6] = (byte[][]) null;
            Statics.field998[var6] = (byte[][]) null;
            Statics.field406[var6] = (byte[][]) null;
        }
        arg0.method4081(-50, -10, -50);
        for (int var83 = 0; var83 < 104; var83++) {
            for (int var84 = 0; var84 < 104; var84++) {
                if ((field994[1][var83][var84] & 0x2) == 2) {
                    arg0.method4035(var83, var84);
                }
            }
        }
        int var85 = 1;
        int var86 = 2;
        int var87 = 4;
        for (int var88 = 0; var88 < 4; var88++) {
            if (var88 > 0) {
                var85 <<= 0x3;
                var86 <<= 0x3;
                var87 <<= 0x3;
            }
            for (int var89 = 0; var89 <= var88; var89++) {
                for (int var90 = 0; var90 <= 104; var90++) {
                    for (int var91 = 0; var91 <= 104; var91++) {
                        if ((Statics.field89[var89][var91][var90] & var85) != 0) {
                            int var92 = var90;
                            int var93 = var90;
                            int var94 = var89;
                            int var95 = var89;
                            while (var92 > 0 && (Statics.field89[var89][var91][var92 - 1] & var85) != 0) {
                                var92--;
                            }
                            while (var93 < 104 && (Statics.field89[var89][var91][var93 + 1] & var85) != 0) {
                                var93++;
                            }
                            label343: while (var94 > 0) {
                                for (int var96 = var92; var96 <= var93; var96++) {
                                    if ((Statics.field89[var94 - 1][var91][var96] & var85) == 0) {
                                        break label343;
                                    }
                                }
                                var94--;
                            }
                            label332: while (var95 < var88) {
                                for (int var97 = var92; var97 <= var93; var97++) {
                                    if ((Statics.field89[var95 + 1][var91][var97] & var85) == 0) {
                                        break label332;
                                    }
                                }
                                var95++;
                            }
                            int var98 = (var95 + 1 - var94) * (var93 - var92 + 1);
                            if (var98 >= 8) {
                                short var99 = 240;
                                int var100 = field1000[var95][var91][var92] - var99;
                                int var101 = field1000[var94][var91][var92];
                                class223.method4052(var88, 1, var91 * 128, var91 * 128, var92 * 128, var93 * 128 + 128, var100, var101);
                                for (int var102 = var94; var102 <= var95; var102++) {
                                    for (int var103 = var92; var103 <= var93; var103++) {
                                        Statics.field89[var102][var91][var103] &= ~var85;
                                    }
                                }
                            }
                        }
                        if ((Statics.field89[var89][var91][var90] & var86) != 0) {
                            int var104 = var91;
                            int var105 = var91;
                            int var106 = var89;
                            int var107 = var89;
                            while (var104 > 0 && (Statics.field89[var89][var104 - 1][var90] & var86) != 0) {
                                var104--;
                            }
                            while (var105 < 104 && (Statics.field89[var89][var105 + 1][var90] & var86) != 0) {
                                var105++;
                            }
                            label396: while (var106 > 0) {
                                for (int var108 = var104; var108 <= var105; var108++) {
                                    if ((Statics.field89[var106 - 1][var108][var90] & var86) == 0) {
                                        break label396;
                                    }
                                }
                                var106--;
                            }
                            label385: while (var107 < var88) {
                                for (int var109 = var104; var109 <= var105; var109++) {
                                    if ((Statics.field89[var107 + 1][var109][var90] & var86) == 0) {
                                        break label385;
                                    }
                                }
                                var107++;
                            }
                            int var110 = (var107 + 1 - var106) * (var105 - var104 + 1);
                            if (var110 >= 8) {
                                short var111 = 240;
                                int var112 = field1000[var107][var104][var90] - var111;
                                int var113 = field1000[var106][var104][var90];
                                class223.method4052(var88, 2, var104 * 128, var105 * 128 + 128, var90 * 128, var90 * 128, var112, var113);
                                for (int var114 = var106; var114 <= var107; var114++) {
                                    for (int var115 = var104; var115 <= var105; var115++) {
                                        Statics.field89[var114][var115][var90] &= ~var86;
                                    }
                                }
                            }
                        }
                        if ((Statics.field89[var89][var91][var90] & var87) != 0) {
                            int var116 = var91;
                            int var117 = var91;
                            int var118 = var90;
                            int var119 = var90;
                            while (var118 > 0 && (Statics.field89[var89][var91][var118 - 1] & var87) != 0) {
                                var118--;
                            }
                            while (var119 < 104 && (Statics.field89[var89][var91][var119 + 1] & var87) != 0) {
                                var119++;
                            }
                            label449: while (var116 > 0) {
                                for (int var120 = var118; var120 <= var119; var120++) {
                                    if ((Statics.field89[var89][var116 - 1][var120] & var87) == 0) {
                                        break label449;
                                    }
                                }
                                var116--;
                            }
                            label438: while (var117 < 104) {
                                for (int var121 = var118; var121 <= var119; var121++) {
                                    if ((Statics.field89[var89][var117 + 1][var121] & var87) == 0) {
                                        break label438;
                                    }
                                }
                                var117++;
                            }
                            if ((var117 - var116 + 1) * (var119 - var118 + 1) >= 4) {
                                int var122 = field1000[var89][var116][var118];
                                class223.method4052(var88, 4, var116 * 128, var117 * 128 + 128, var118 * 128, var119 * 128 + 128, var122, var122);
                                for (int var123 = var116; var123 <= var117; var123++) {
                                    for (int var124 = var118; var124 <= var119; var124++) {
                                        Statics.field89[var89][var123][var124] &= ~var87;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ij.as(III)I")
    public static final int method3809(int arg0, int arg1) {
        int var2 = method2586(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2586(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2586(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ee.ay(IIII)I")
    public static final int method2586(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2931(var3, var5);
        int var8 = method2931(var3 + 1, var5);
        int var9 = method2931(var3, var5 + 1);
        int var10 = method2931(var3 + 1, var5 + 1);
        int var11 = 65536 - class220.field2470[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class220.field2470[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class220.field2470[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ff.am(III)I")
    public static final int method2931(int arg0, int arg1) {
        int var2 = Statics.method96(arg0 - 1, arg1 - 1) + Statics.method96(arg0 + 1, arg1 - 1) + Statics.method96(arg0 - 1, arg1 + 1) + Statics.method96(arg0 + 1, arg1 + 1);
        int var3 = Statics.method96(arg0 - 1, arg1) + Statics.method96(arg0 + 1, arg1) + Statics.method96(arg0, arg1 - 1) + Statics.method96(arg0, arg1 + 1);
        int var4 = Statics.method96(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("my.ae(III)I")
    public static final int method5599(int arg0, int arg1) {
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

    @ObfuscatedName("cw.au(IIB)I")
    public static final int method1963(int arg0, int arg1) {
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
}
