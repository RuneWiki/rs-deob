package deob;

@ObfuscatedName("dj")
public final class class82 {

    @ObfuscatedName("dj.aw")
    public static int[][][] field1023 = new int[4][105][105];

    @ObfuscatedName("dj.ay")
    public static byte[][][] field1030 = new byte[4][104][104];

    @ObfuscatedName("dj.ar")
    public static int field1024 = 99;

    @ObfuscatedName("dj.ad")
    public static final int[] field1028 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("dj.ao")
    public static final int[] field1029 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("dj.ac")
    public static final int[] field1038 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("dj.ak")
    public static final int[] field1035 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("dj.an")
    public static final int[] field1032 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("dj.af")
    public static final int[] field1033 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("dj.ai")
    public static int field1037 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("dj.al")
    public static int field1034 = (int) (Math.random() * 33.0D) - 16;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("my.aw(B)V")
    public static void method5502() {
        field1024 = 99;
        Statics.field1025 = new short[4][104][104];
        Statics.field1026 = new short[4][104][104];
        Statics.field105 = new byte[4][104][104];
        Statics.field1475 = new byte[4][104][104];
        Statics.field4682 = new int[4][105][105];
        Statics.field1900 = new byte[4][105][105];
        Statics.field1602 = new int[105][105];
        Statics.field1833 = new int[104];
        Statics.field3871 = new int[104];
        Statics.field1027 = new int[104];
        Statics.field4390 = new int[104];
        Statics.field1756 = new int[104];
    }

    @ObfuscatedName("gj.ay(I)V")
    public static void method3116() {
        Statics.field1025 = (short[][][]) null;
        Statics.field1026 = (short[][][]) null;
        Statics.field105 = (byte[][][]) null;
        Statics.field1475 = (byte[][][]) null;
        Statics.field4682 = (int[][][]) null;
        Statics.field1900 = (byte[][][]) null;
        Statics.field1602 = (int[][]) null;
        Statics.field1833 = null;
        Statics.field3871 = null;
        Statics.field1027 = null;
        Statics.field4390 = null;
        Statics.field1756 = null;
    }

    @ObfuscatedName("hu.ar(IIIII)V")
    public static final void method3516(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1900[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1023[0][var5][var4] = field1023[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1023[0][var5][var4] = field1023[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1023[0][var5][var4] = field1023[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1023[0][var5][var4] = field1023[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cr.am([BIIII[Lij;B)V")
    public static final void method1771(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class215[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2345[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class514 var9 = new class514(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    method2183(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("gi.as([BIIIIIIIII[Lij;I)V")
    public static final void method3240(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class215[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2345[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class514 var13 = new class514(arg0);
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
                        method2183(var13, arg1, var23, var30, var31, var32, arg7);
                    } else {
                        method2183(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.aj(IIIB)V")
    public static final void method1996(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1023[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1023[arg0][arg1][arg2 + var5] = field1023[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1023[arg0][arg1 + var6][arg2] = field1023[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1023[arg0][arg1 - 1][arg2] != 0) {
            field1023[arg0][arg1][arg2] = field1023[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1023[arg0][arg1][arg2 - 1] != 0) {
            field1023[arg0][arg1][arg2] = field1023[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1023[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1023[arg0][arg1][arg2] = field1023[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("di.ag(Lty;IIIIIIB)V")
    public static final void method2183(class514 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = arg1 >= 0 && arg1 < 4 && arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104;
        if (!var7) {
            while (true) {
                int var10 = arg0.method8246();
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method8244();
                    break;
                }
                if (var10 <= 49) {
                    arg0.method8497();
                }
            }
            return;
        }
        field1030[arg1][arg2][arg3] = 0;
        while (true) {
            int var8 = arg0.method8246();
            if (var8 == 0) {
                if (arg1 == 0) {
                    field1023[0][arg2][arg3] = -method2767(arg4 + 932731, arg5 + 556238) * 8;
                } else {
                    field1023[arg1][arg2][arg3] = field1023[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var8 == 1) {
                int var9 = arg0.method8244();
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg1 == 0) {
                    field1023[0][arg2][arg3] = -var9 * 8;
                } else {
                    field1023[arg1][arg2][arg3] = field1023[arg1 - 1][arg2][arg3] - var9 * 8;
                }
                break;
            }
            if (var8 <= 49) {
                Statics.field1026[arg1][arg2][arg3] = (short) arg0.method8497();
                Statics.field105[arg1][arg2][arg3] = (byte) ((var8 - 2) / 4);
                Statics.field1475[arg1][arg2][arg3] = (byte) (var8 - 2 + arg6 & 0x3);
            } else if (var8 <= 81) {
                field1030[arg1][arg2][arg3] = (byte) (var8 - 49);
            } else {
                Statics.field1025[arg1][arg2][arg3] = (short) (var8 - 81);
            }
        }
    }

    @ObfuscatedName("ao.av([BIILiz;[Lij;I)V")
    public static final void method275(byte[] arg0, int arg1, int arg2, class232 arg3, class215[] arg4) {
        class514 var5 = new class514(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method8262();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method8260();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method8244();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1030[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class215 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2272(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dj.ap([BIIIIIIILiz;[Lij;)V")
    public static final void method2097(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class232 arg8, class215[] arg9) {
        class514 var10 = new class514(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method8262();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method8260();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method8244();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class207 var21 = Statics.method2211(var11);
                    int var22 = arg2 + class327.method4656(var16 & 0x7, var15 & 0x7, arg7, var21.field2170, var21.field2174, var20);
                    int var23 = arg3 + class327.method1770(var16 & 0x7, var15 & 0x7, arg7, var21.field2170, var21.field2174, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field1030[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class215 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method2272(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dz.aq(IIIIIILiz;Lij;I)V")
    public static final void method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class232 arg6, class215 arg7) {
        if (client.field634 && (field1030[0][arg1][arg2] & 0x2) == 0 && (field1030[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1024) {
            field1024 = arg0;
        }
        class207 var8 = Statics.method2211(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2174;
            var10 = var8.field2170;
        } else {
            var9 = var8.field2170;
            var10 = var8.field2174;
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
        int[][] var15 = field1023[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class242.method7370(arg1, arg2, 2, var8.field2154 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2175 == 1) {
            var21 += 256;
        }
        if (var8.method3595()) {
            class70.method1180(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field634 || var8.field2154 != 0 || var8.field2152 == 1 || var8.field2173) {
                class234 var22;
                if (var8.field2160 == -1 && var8.field2176 == null) {
                    var22 = var8.method3601(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class80(arg3, 22, arg4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
                }
                arg6.method4197(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field2152 == 1 && arg7 != null) {
                    arg7.method3850(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class234 var48;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var48 = var8.method3601(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class80(arg3, 10, arg4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            if (var48 != null && arg6.method4201(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2166) {
                int var49 = 15;
                if (var48 instanceof class241) {
                    var49 = ((class241) var48).method4429() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field1900[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field1900[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field2152 != 0 && arg7 != null) {
                arg7.method3826(arg1, arg2, var9, var10, var8.field2135);
            }
        } else if (arg5 >= 12) {
            class234 var23;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var23 = var8.method3601(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4201(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field4682[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2152 != 0 && arg7 != null) {
                arg7.method3826(arg1, arg2, var9, var10, var8.field2135);
            }
        } else if (arg5 == 0) {
            class234 var24;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var24 = var8.method3601(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class80(arg3, 0, arg4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4199(arg0, arg1, arg2, var16, var24, (class234) null, field1028[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2166) {
                    Statics.field1900[arg0][arg1][arg2] = 50;
                    Statics.field1900[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2148) {
                    Statics.field4682[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2166) {
                    Statics.field1900[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1900[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2148) {
                    Statics.field4682[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2166) {
                    Statics.field1900[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1900[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2148) {
                    Statics.field4682[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2166) {
                    Statics.field1900[arg0][arg1][arg2] = 50;
                    Statics.field1900[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2148) {
                    Statics.field4682[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2152 != 0 && arg7 != null) {
                arg7.method3830(arg1, arg2, arg5, arg4, var8.field2135);
            }
            if (var8.field2159 != 16) {
                arg6.method4207(arg0, arg1, arg2, var8.field2159);
            }
        } else if (arg5 == 1) {
            class234 var25;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var25 = var8.method3601(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class80(arg3, 1, arg4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4199(arg0, arg1, arg2, var16, var25, (class234) null, field1029[arg4], 0, var19, var21);
            if (var8.field2166) {
                if (arg4 == 0) {
                    Statics.field1900[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1900[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1900[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1900[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2152 != 0 && arg7 != null) {
                arg7.method3830(arg1, arg2, arg5, arg4, var8.field2135);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class234 var27;
            class234 var28;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var27 = var8.method3601(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method3601(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class80(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
                var28 = new class80(arg3, 2, var26, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4199(arg0, arg1, arg2, var16, var27, var28, field1028[arg4], field1028[var26], var19, var21);
            if (var8.field2148) {
                if (arg4 == 0) {
                    Statics.field4682[arg0][arg1][arg2] |= 0x249;
                    Statics.field4682[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field4682[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field4682[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field4682[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field4682[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field4682[arg0][arg1][arg2] |= 0x492;
                    Statics.field4682[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2152 != 0 && arg7 != null) {
                arg7.method3830(arg1, arg2, arg5, arg4, var8.field2135);
            }
            if (var8.field2159 != 16) {
                arg6.method4207(arg0, arg1, arg2, var8.field2159);
            }
        } else if (arg5 == 3) {
            class234 var29;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var29 = var8.method3601(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class80(arg3, 3, arg4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4199(arg0, arg1, arg2, var16, var29, (class234) null, field1029[arg4], 0, var19, var21);
            if (var8.field2166) {
                if (arg4 == 0) {
                    Statics.field1900[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1900[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1900[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1900[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2152 != 0 && arg7 != null) {
                arg7.method3830(arg1, arg2, arg5, arg4, var8.field2135);
            }
        } else if (arg5 == 9) {
            class234 var30;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var30 = var8.method3601(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4201(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field2152 != 0 && arg7 != null) {
                arg7.method3826(arg1, arg2, var9, var10, var8.field2135);
            }
            if (var8.field2159 != 16) {
                arg6.method4207(arg0, arg1, arg2, var8.field2159);
            }
        } else if (arg5 == 4) {
            class234 var31;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var31 = var8.method3601(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4200(arg0, arg1, arg2, var16, var31, (class234) null, field1028[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method4217(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = Statics.method2211(class242.method7614(var33)).field2159;
            }
            class234 var35;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var35 = var8.method3601(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4200(arg0, arg1, arg2, var16, var35, (class234) null, field1028[arg4], 0, field1038[arg4] * var32, field1035[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method4217(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = Statics.method2211(class242.method7614(var37)).field2159 / 2;
            }
            class234 var39;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var39 = var8.method3601(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4200(arg0, arg1, arg2, var16, var39, (class234) null, 256, arg4, field1032[arg4] * var36, field1033[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class234 var41;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var41 = var8.method3601(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class80(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4200(arg0, arg1, arg2, var16, var41, (class234) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method4217(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = Statics.method2211(class242.method7614(var43)).field2159 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class234 var46;
            class234 var47;
            if (var8.field2160 == -1 && var8.field2176 == null) {
                var46 = var8.method3601(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method3601(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
                var47 = new class80(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field2160, var8.field2184, (class234) null);
            }
            arg6.method4200(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1032[arg4] * var42, field1033[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("qz.at(Liz;[Lij;I)V")
    public static final void method7257(class232 arg0, class215[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1030[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1030[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3827(var3, var4);
                        }
                    }
                }
            }
        }
        field1037 += (int) (Math.random() * 5.0D) - 2;
        if (field1037 < -8) {
            field1037 = -8;
        }
        if (field1037 > 8) {
            field1037 = 8;
        }
        field1034 += (int) (Math.random() * 5.0D) - 2;
        if (field1034 < -16) {
            field1034 = -16;
        }
        if (field1034 > 16) {
            field1034 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1900[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1023[var6][var16 + 1][var15] - field1023[var6][var16 - 1][var15];
                    int var18 = field1023[var6][var16][var15 + 1] - field1023[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field1602[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field1833[var25] = 0;
                Statics.field3871[var25] = 0;
                Statics.field1027[var25] = 0;
                Statics.field4390[var25] = 0;
                Statics.field1756[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = (int) class305.method1714(15);
                        int var30 = Statics.field1025[var6][var28][var27] & var29;
                        if (var30 > 0) {
                            int var31 = var30 - 1;
                            class200 var32 = (class200) class200.field2078.method5152((long) var31);
                            class200 var33;
                            if (var32 == null) {
                                byte[] var34 = Statics.field2080.method6117(1, var31);
                                class200 var35 = new class200();
                                if (var34 != null) {
                                    var35.method3473(new class514(var34), var31);
                                }
                                var35.method3458();
                                class200.field2078.method5149(var35, (long) var31);
                                var33 = var35;
                            } else {
                                var33 = var32;
                            }
                            Statics.field1833[var27] += var33.field2081;
                            Statics.field3871[var27] += var33.field2082;
                            Statics.field1027[var27] += var33.field2083;
                            Statics.field4390[var27] += var33.field2084;
                            var10002 = Statics.field1756[var27]++;
                        }
                    }
                    int var37 = var26 - 5;
                    if (var37 >= 0 && var37 < 104) {
                        int var38 = (int) class305.method1714(15);
                        int var39 = Statics.field1025[var6][var37][var27] & var38;
                        if (var39 > 0) {
                            int var40 = var39 - 1;
                            class200 var41 = (class200) class200.field2078.method5152((long) var40);
                            class200 var42;
                            if (var41 == null) {
                                byte[] var43 = Statics.field2080.method6117(1, var40);
                                class200 var44 = new class200();
                                if (var43 != null) {
                                    var44.method3473(new class514(var43), var40);
                                }
                                var44.method3458();
                                class200.field2078.method5149(var44, (long) var40);
                                var42 = var44;
                            } else {
                                var42 = var41;
                            }
                            Statics.field1833[var27] -= var42.field2081;
                            Statics.field3871[var27] -= var42.field2082;
                            Statics.field1027[var27] -= var42.field2083;
                            Statics.field4390[var27] -= var42.field2084;
                            var10002 = Statics.field1756[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var46 = 0;
                    int var47 = 0;
                    int var48 = 0;
                    int var49 = 0;
                    int var50 = 0;
                    for (int var51 = -5; var51 < 109; var51++) {
                        int var52 = var51 + 5;
                        if (var52 >= 0 && var52 < 104) {
                            var46 += Statics.field1833[var52];
                            var47 += Statics.field3871[var52];
                            var48 += Statics.field1027[var52];
                            var49 += Statics.field4390[var52];
                            var50 += Statics.field1756[var52];
                        }
                        int var53 = var51 - 5;
                        if (var53 >= 0 && var53 < 104) {
                            var46 -= Statics.field1833[var53];
                            var47 -= Statics.field3871[var53];
                            var48 -= Statics.field1027[var53];
                            var49 -= Statics.field4390[var53];
                            var50 -= Statics.field1756[var53];
                        }
                        if (var51 >= 1 && var51 < 103 && (!client.field634 || (field1030[0][var26][var51] & 0x2) != 0 || (field1030[var6][var26][var51] & 0x10) == 0)) {
                            if (var6 < field1024) {
                                field1024 = var6;
                            }
                            int var54 = (int) class305.method1714(15);
                            int var55 = Statics.field1025[var6][var26][var51] & var54;
                            int var56 = Statics.field1026[var6][var26][var51] & var54;
                            if (var55 > 0 || var56 > 0) {
                                int var57 = field1023[var6][var26][var51];
                                int var58 = field1023[var6][var26 + 1][var51];
                                int var59 = field1023[var6][var26 + 1][var51 + 1];
                                int var60 = field1023[var6][var26][var51 + 1];
                                int var61 = Statics.field1602[var26][var51];
                                int var62 = Statics.field1602[var26 + 1][var51];
                                int var63 = Statics.field1602[var26 + 1][var51 + 1];
                                int var64 = Statics.field1602[var26][var51 + 1];
                                int var65 = -1;
                                int var66 = -1;
                                if (var55 > 0) {
                                    int var67 = var46 * 256 / var49;
                                    int var68 = var47 / var50;
                                    int var69 = var48 / var50;
                                    var65 = method687(var67, var68, var69);
                                    int var70 = field1037 + var67 & 0xFF;
                                    int var71 = field1034 + var69;
                                    if (var71 < 0) {
                                        var71 = 0;
                                    } else if (var71 > 255) {
                                        var71 = 255;
                                    }
                                    var66 = method687(var70, var68, var71);
                                }
                                if (var6 > 0) {
                                    boolean var72 = true;
                                    if (var55 == 0 && Statics.field105[var6][var26][var51] != 0) {
                                        var72 = false;
                                    }
                                    if (var56 > 0 && !class209.method2884(var56 - 1).field2256) {
                                        var72 = false;
                                    }
                                    if (var72 && var57 == var58 && var57 == var59 && var57 == var60) {
                                        Statics.field4682[var6][var26][var51] |= 0x924;
                                    }
                                }
                                int var73 = 0;
                                if (var66 != -1) {
                                    var73 = class228.field2512[method7113(var66, 96)];
                                }
                                if (var56 == 0) {
                                    arg0.method4196(var6, var26, var51, 0, 0, -1, var57, var58, var59, var60, method7113(var65, var61), method7113(var65, var62), method7113(var65, var63), method7113(var65, var64), 0, 0, 0, 0, var73, 0);
                                } else {
                                    int var74 = Statics.field105[var6][var26][var51] + 1;
                                    byte var75 = Statics.field1475[var6][var26][var51];
                                    int var76 = var56 - 1;
                                    class209 var77 = (class209) class209.field2251.method5152((long) var76);
                                    class209 var78;
                                    if (var77 == null) {
                                        byte[] var79 = Statics.field2253.method6117(4, var76);
                                        class209 var80 = new class209();
                                        if (var79 != null) {
                                            var80.method3709(new class514(var79), var76);
                                        }
                                        var80.method3713();
                                        class209.field2251.method5149(var80, (long) var76);
                                        var78 = var80;
                                    } else {
                                        var78 = var77;
                                    }
                                    int var82 = var78.field2248;
                                    int var83;
                                    int var84;
                                    if (var82 >= 0) {
                                        var83 = class228.field2511.field2783.method4388(var82);
                                        var84 = -1;
                                    } else if (var78.field2247 == 16711935) {
                                        var84 = -2;
                                        var82 = -1;
                                        var83 = -2;
                                    } else {
                                        var84 = method687(var78.field2249, var78.field2245, var78.field2254);
                                        int var85 = field1037 + var78.field2249 & 0xFF;
                                        int var86 = field1034 + var78.field2254;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        var83 = method687(var85, var78.field2245, var86);
                                    }
                                    int var87 = 0;
                                    if (var83 != -2) {
                                        var87 = class228.field2512[method5032(var83, 96)];
                                    }
                                    if (var78.field2250 != -1) {
                                        int var88 = field1037 + var78.field2258 & 0xFF;
                                        int var89 = field1034 + var78.field2252;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 255) {
                                            var89 = 255;
                                        }
                                        int var90 = method687(var88, var78.field2255, var89);
                                        var87 = class228.field2512[method5032(var90, 96)];
                                    }
                                    arg0.method4196(var6, var26, var51, var74, var75, var82, var57, var58, var59, var60, method7113(var65, var61), method7113(var65, var62), method7113(var65, var63), method7113(var65, var64), method5032(var84, var61), method5032(var84, var62), method5032(var84, var63), method5032(var84, var64), var73, var87);
                                }
                            }
                        }
                    }
                }
            }
            for (int var91 = 1; var91 < 103; var91++) {
                for (int var92 = 1; var92 < 103; var92++) {
                    arg0.method4195(var6, var92, var91, method6942(var6, var92, var91));
                }
            }
            Statics.field1025[var6] = (short[][]) null;
            Statics.field1026[var6] = (short[][]) null;
            Statics.field105[var6] = (byte[][]) null;
            Statics.field1475[var6] = (byte[][]) null;
            Statics.field1900[var6] = (byte[][]) null;
        }
        arg0.method4222(-50, -10, -50);
        for (int var93 = 0; var93 < 104; var93++) {
            for (int var94 = 0; var94 < 104; var94++) {
                if ((field1030[1][var93][var94] & 0x2) == 2) {
                    arg0.method4193(var93, var94);
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
                        if ((Statics.field4682[var99][var101][var100] & var95) != 0) {
                            int var102 = var100;
                            int var103 = var100;
                            int var104 = var99;
                            int var105 = var99;
                            while (var102 > 0 && (Statics.field4682[var99][var101][var102 - 1] & var95) != 0) {
                                var102--;
                            }
                            while (var103 < 104 && (Statics.field4682[var99][var101][var103 + 1] & var95) != 0) {
                                var103++;
                            }
                            label364: while (var104 > 0) {
                                for (int var106 = var102; var106 <= var103; var106++) {
                                    if ((Statics.field4682[var104 - 1][var101][var106] & var95) == 0) {
                                        break label364;
                                    }
                                }
                                var104--;
                            }
                            label353: while (var105 < var98) {
                                for (int var107 = var102; var107 <= var103; var107++) {
                                    if ((Statics.field4682[var105 + 1][var101][var107] & var95) == 0) {
                                        break label353;
                                    }
                                }
                                var105++;
                            }
                            int var108 = (var105 + 1 - var104) * (var103 - var102 + 1);
                            if (var108 >= 8) {
                                short var109 = 240;
                                int var110 = field1023[var105][var101][var102] - var109;
                                int var111 = field1023[var104][var101][var102];
                                class232.method4194(var98, 1, var101 * 128, var101 * 128, var102 * 128, var103 * 128 + 128, var110, var111);
                                for (int var112 = var104; var112 <= var105; var112++) {
                                    for (int var113 = var102; var113 <= var103; var113++) {
                                        Statics.field4682[var112][var101][var113] &= ~var95;
                                    }
                                }
                            }
                        }
                        if ((Statics.field4682[var99][var101][var100] & var96) != 0) {
                            int var114 = var101;
                            int var115 = var101;
                            int var116 = var99;
                            int var117 = var99;
                            while (var114 > 0 && (Statics.field4682[var99][var114 - 1][var100] & var96) != 0) {
                                var114--;
                            }
                            while (var115 < 104 && (Statics.field4682[var99][var115 + 1][var100] & var96) != 0) {
                                var115++;
                            }
                            label417: while (var116 > 0) {
                                for (int var118 = var114; var118 <= var115; var118++) {
                                    if ((Statics.field4682[var116 - 1][var118][var100] & var96) == 0) {
                                        break label417;
                                    }
                                }
                                var116--;
                            }
                            label406: while (var117 < var98) {
                                for (int var119 = var114; var119 <= var115; var119++) {
                                    if ((Statics.field4682[var117 + 1][var119][var100] & var96) == 0) {
                                        break label406;
                                    }
                                }
                                var117++;
                            }
                            int var120 = (var117 + 1 - var116) * (var115 - var114 + 1);
                            if (var120 >= 8) {
                                short var121 = 240;
                                int var122 = field1023[var117][var114][var100] - var121;
                                int var123 = field1023[var116][var114][var100];
                                class232.method4194(var98, 2, var114 * 128, var115 * 128 + 128, var100 * 128, var100 * 128, var122, var123);
                                for (int var124 = var116; var124 <= var117; var124++) {
                                    for (int var125 = var114; var125 <= var115; var125++) {
                                        Statics.field4682[var124][var125][var100] &= ~var96;
                                    }
                                }
                            }
                        }
                        if ((Statics.field4682[var99][var101][var100] & var97) != 0) {
                            int var126 = var101;
                            int var127 = var101;
                            int var128 = var100;
                            int var129 = var100;
                            while (var128 > 0 && (Statics.field4682[var99][var101][var128 - 1] & var97) != 0) {
                                var128--;
                            }
                            while (var129 < 104 && (Statics.field4682[var99][var101][var129 + 1] & var97) != 0) {
                                var129++;
                            }
                            label470: while (var126 > 0) {
                                for (int var130 = var128; var130 <= var129; var130++) {
                                    if ((Statics.field4682[var99][var126 - 1][var130] & var97) == 0) {
                                        break label470;
                                    }
                                }
                                var126--;
                            }
                            label459: while (var127 < 104) {
                                for (int var131 = var128; var131 <= var129; var131++) {
                                    if ((Statics.field4682[var99][var127 + 1][var131] & var97) == 0) {
                                        break label459;
                                    }
                                }
                                var127++;
                            }
                            if ((var127 - var126 + 1) * (var129 - var128 + 1) >= 4) {
                                int var132 = field1023[var99][var126][var128];
                                class232.method4194(var98, 4, var126 * 128, var127 * 128 + 128, var128 * 128, var129 * 128 + 128, var132, var132);
                                for (int var133 = var126; var133 <= var127; var133++) {
                                    for (int var134 = var128; var134 <= var129; var134++) {
                                        Statics.field4682[var99][var133][var134] &= ~var97;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("po.ah(IIII)I")
    public static int method6942(int arg0, int arg1, int arg2) {
        if ((field1030[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field1030[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ed.ax(III)I")
    public static final int method2767(int arg0, int arg1) {
        int var2 = method7052(arg0 + 45365, arg1 + 91923, 4) - 128 + (method7052(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method7052(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("qc.aa(IIIB)I")
    public static final int method7052(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method5030(var3, var5);
        int var8 = method5030(var3 + 1, var5);
        int var9 = method5030(var3, var5 + 1);
        int var10 = method5030(var3 + 1, var5 + 1);
        int var11 = method2849(var7, var8, var4, arg2);
        int var12 = method2849(var9, var10, var4, arg2);
        return method2849(var11, var12, var6, arg2);
    }

    @ObfuscatedName("eu.au(IIIIB)I")
    public static final int method2849(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class228.field2510[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("kw.ae(III)I")
    public static final int method5030(int arg0, int arg1) {
        int var2 = method315(arg0 - 1, arg1 - 1) + method315(arg0 + 1, arg1 - 1) + method315(arg0 - 1, arg1 + 1) + method315(arg0 + 1, arg1 + 1);
        int var3 = method315(arg0 - 1, arg1) + method315(arg0 + 1, arg1) + method315(arg0, arg1 - 1) + method315(arg0, arg1 + 1);
        int var4 = method315(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("af.ab(III)I")
    public static final int method315(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("qd.ad(III)I")
    public static final int method7113(int arg0, int arg1) {
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

    @ObfuscatedName("kx.ao(IIB)I")
    public static final int method5032(int arg0, int arg1) {
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

    @ObfuscatedName("br.ac(IIII)I")
    public static final int method687(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("an.ak(III)Z")
    public static final boolean method304(int arg0, int arg1) {
        class207 var2 = Statics.method2211(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3615(arg1);
    }
}
