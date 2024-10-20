package deob;

@ObfuscatedName("cf")
public final class class79 {

    @ObfuscatedName("cf.h")
    public static int[][][] field1027 = new int[4][105][105];

    @ObfuscatedName("cf.e")
    public static byte[][][] field1035 = new byte[4][104][104];

    @ObfuscatedName("cf.v")
    public static int field1028 = 99;

    @ObfuscatedName("cf.l")
    public static final int[] field1033 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("cf.t")
    public static final int[] field1037 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("cf.c")
    public static final int[] field1036 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("cf.p")
    public static final int[] field1030 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("cf.d")
    public static final int[] field1038 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("cf.y")
    public static final int[] field1026 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("cf.z")
    public static int field1040 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("cf.w")
    public static int field1041 = (int) (Math.random() * 33.0D) - 16;

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mg.h(I)V")
    public static void method5992() {
        field1028 = 99;
        Statics.field1029 = new short[4][104][104];
        Statics.field5063 = new short[4][104][104];
        Statics.field1034 = new byte[4][104][104];
        Statics.field4345 = new byte[4][104][104];
        Statics.field1817 = new int[4][105][105];
        Statics.field137 = new byte[4][105][105];
        Statics.field1031 = new int[105][105];
        Statics.field1032 = new int[104];
        Statics.field327 = new int[104];
        Statics.field1039 = new int[104];
        Statics.field1320 = new int[104];
        Statics.field906 = new int[104];
    }

    @ObfuscatedName("ni.e(I)V")
    public static void method6731() {
        Statics.field1029 = (short[][][]) null;
        Statics.field5063 = (short[][][]) null;
        Statics.field1034 = (byte[][][]) null;
        Statics.field4345 = (byte[][][]) null;
        Statics.field1817 = (int[][][]) null;
        Statics.field137 = (byte[][][]) null;
        Statics.field1031 = (int[][]) null;
        Statics.field1032 = null;
        Statics.field327 = null;
        Statics.field1039 = null;
        Statics.field1320 = null;
        Statics.field906 = null;
    }

    @ObfuscatedName("bt.v(IIIIB)V")
    public static final void method1924(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field137[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1027[0][var5][var4] = field1027[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1027[0][var5][var4] = field1027[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1027[0][var5][var4] = field1027[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1027[0][var5][var4] = field1027[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.x([BIIII[Lgw;I)V")
    public static final void method159(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class203[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2346[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class467 var9 = new class467(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    int var13 = arg1 + var11;
                    int var14 = arg2 + var12;
                    Statics.method2572(var9, var10, var13, var14, arg3 + var13, arg4 + var14, 0);
                }
            }
        }
    }

    @ObfuscatedName("as.m([BIIIIIIIII[Lgw;B)V")
    public static final void method355(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class203[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2346[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class467 var13 = new class467(arg0);
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
                        int var24 = arg3 + class300.method257(var15 & 0x7, var16 & 0x7, arg7);
                        int var25 = (var15 & 0x7) + arg2 + arg8;
                        int var26 = (var16 & 0x7) + arg3 + arg9;
                        Statics.method2572(var13, arg1, var23, var24, var25, var26, arg7);
                    } else {
                        Statics.method2572(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bl.q(IIII)V")
    public static final void method1091(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1027[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1027[arg0][arg1][arg2 + var5] = field1027[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1027[arg0][arg1 + var6][arg2] = field1027[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1027[arg0][arg1 - 1][arg2] != 0) {
            field1027[arg0][arg1][arg2] = field1027[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1027[arg0][arg1][arg2 - 1] != 0) {
            field1027[arg0][arg1][arg2] = field1027[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1027[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1027[arg0][arg1][arg2] = field1027[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cf.r([BIIB)Z")
    public static final boolean method2100(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class467 var4 = new class467(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method7974();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method7806();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method7792() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class196 var16 = class196.method3208(var5);
                        if (var13 != 22 || !client.field562 || var16.field2172 != 0 || var16.field2165 == 1 || var16.field2191) {
                            if (!var16.method3566()) {
                                client.field787++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method7806();
                if (var9 == 0) {
                    break;
                }
                var4.method7792();
            }
        }
    }

    @ObfuscatedName("em.u([BIILhc;[Lgw;B)V")
    public static final void method2896(byte[] arg0, int arg1, int arg2, class216 arg3, class203[] arg4) {
        class467 var5 = new class467(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method7974();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method7806();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method7792();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1035[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class203 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2631(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("cf.b([BIIIIIIILhc;[Lgw;)V")
    public static final void method2040(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class216 arg8, class203[] arg9) {
        class467 var10 = new class467(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method7974();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method7806();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method7792();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class196 var21 = class196.method3208(var11);
                    int var22 = arg2 + class300.method3645(var16 & 0x7, var15 & 0x7, arg7, var21.field2168, var21.field2169, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field2168;
                    int var28 = var21.field2169;
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
                        if ((field1035[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class203 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method2631(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dl.j(IIIIIILhc;Lgw;I)V")
    public static final void method2631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class216 arg6, class203 arg7) {
        if (client.field562 && (field1035[0][arg1][arg2] & 0x2) == 0 && (field1035[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1028) {
            field1028 = arg0;
        }
        class196 var8 = class196.method3208(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field2169;
            var10 = var8.field2168;
        } else {
            var9 = var8.field2168;
            var10 = var8.field2169;
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
        int[][] var15 = field1027[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class225.method574(arg1, arg2, 2, var8.field2172 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field2193 == 1) {
            var21 += 256;
        }
        if (var8.method3527()) {
            class67 var22 = new class67();
            var22.field845 = arg0;
            var22.field841 = arg1 * 128;
            var22.field839 = arg2 * 128;
            int var23 = var8.field2168;
            int var24 = var8.field2169;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field2169;
                var24 = var8.field2168;
            }
            var22.field842 = (arg1 + var23) * 128;
            var22.field844 = (arg2 + var24) * 128;
            var22.field846 = var8.field2201;
            var22.field848 = var8.field2182 * 128;
            var22.field843 = var8.field2199;
            var22.field840 = var8.field2200;
            var22.field850 = var8.field2161;
            if (var8.field2194 != null) {
                var22.field853 = var8;
                var22.method1757();
            }
            class67.field849.method6081(var22);
            if (var22.field850 != null) {
                var22.field851 = var22.field843 + (int) (Math.random() * (double) (var22.field840 - var22.field843));
            }
        }
        if (arg5 == 22) {
            if (!client.field562 || var8.field2172 != 0 || var8.field2165 == 1 || var8.field2191) {
                class218 var25;
                if (var8.field2176 == -1 && var8.field2194 == null) {
                    var25 = var8.method3520(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class77(arg3, 22, arg4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
                }
                arg6.method4049(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field2165 == 1 && arg7 != null) {
                    arg7.method3764(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class218 var51;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var51 = var8.method3520(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class77(arg3, 10, arg4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            if (var51 != null && arg6.method4053(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field2198) {
                int var52 = 15;
                if (var51 instanceof class224) {
                    var52 = ((class224) var51).method4276() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field137[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field137[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field2165 != 0 && arg7 != null) {
                arg7.method3796(arg1, arg2, var9, var10, var8.field2178);
            }
        } else if (arg5 >= 12) {
            class218 var26;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var26 = var8.method3520(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class77(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4053(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1817[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field2165 != 0 && arg7 != null) {
                arg7.method3796(arg1, arg2, var9, var10, var8.field2178);
            }
        } else if (arg5 == 0) {
            class218 var27;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var27 = var8.method3520(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class77(arg3, 0, arg4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4051(arg0, arg1, arg2, var16, var27, (class218) null, field1033[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field2198) {
                    Statics.field137[arg0][arg1][arg2] = 50;
                    Statics.field137[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field2189) {
                    Statics.field1817[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field2198) {
                    Statics.field137[arg0][arg1][arg2 + 1] = 50;
                    Statics.field137[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2189) {
                    Statics.field1817[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field2198) {
                    Statics.field137[arg0][arg1 + 1][arg2] = 50;
                    Statics.field137[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field2189) {
                    Statics.field1817[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field2198) {
                    Statics.field137[arg0][arg1][arg2] = 50;
                    Statics.field137[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field2189) {
                    Statics.field1817[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field2165 != 0 && arg7 != null) {
                arg7.method3761(arg1, arg2, arg5, arg4, var8.field2178);
            }
            if (var8.field2177 != 16) {
                arg6.method4059(arg0, arg1, arg2, var8.field2177);
            }
        } else if (arg5 == 1) {
            class218 var28;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var28 = var8.method3520(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class77(arg3, 1, arg4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4051(arg0, arg1, arg2, var16, var28, (class218) null, field1037[arg4], 0, var19, var21);
            if (var8.field2198) {
                if (arg4 == 0) {
                    Statics.field137[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field137[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field137[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field137[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2165 != 0 && arg7 != null) {
                arg7.method3761(arg1, arg2, arg5, arg4, var8.field2178);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class218 var30;
            class218 var31;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var30 = var8.method3520(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method3520(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class77(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
                var31 = new class77(arg3, 2, var29, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4051(arg0, arg1, arg2, var16, var30, var31, field1033[arg4], field1033[var29], var19, var21);
            if (var8.field2189) {
                if (arg4 == 0) {
                    Statics.field1817[arg0][arg1][arg2] |= 0x249;
                    Statics.field1817[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1817[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1817[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1817[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1817[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1817[arg0][arg1][arg2] |= 0x492;
                    Statics.field1817[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field2165 != 0 && arg7 != null) {
                arg7.method3761(arg1, arg2, arg5, arg4, var8.field2178);
            }
            if (var8.field2177 != 16) {
                arg6.method4059(arg0, arg1, arg2, var8.field2177);
            }
        } else if (arg5 == 3) {
            class218 var32;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var32 = var8.method3520(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class77(arg3, 3, arg4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4051(arg0, arg1, arg2, var16, var32, (class218) null, field1037[arg4], 0, var19, var21);
            if (var8.field2198) {
                if (arg4 == 0) {
                    Statics.field137[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field137[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field137[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field137[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field2165 != 0 && arg7 != null) {
                arg7.method3761(arg1, arg2, arg5, arg4, var8.field2178);
            }
        } else if (arg5 == 9) {
            class218 var33;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var33 = var8.method3520(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class77(arg3, arg5, arg4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4053(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field2165 != 0 && arg7 != null) {
                arg7.method3796(arg1, arg2, var9, var10, var8.field2178);
            }
            if (var8.field2177 != 16) {
                arg6.method4059(arg0, arg1, arg2, var8.field2177);
            }
        } else if (arg5 == 4) {
            class218 var34;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var34 = var8.method3520(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class77(arg3, 4, arg4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4052(arg0, arg1, arg2, var16, var34, (class218) null, field1033[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method4222(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class196.method3208(class225.method4236(var36)).field2177;
            }
            class218 var38;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var38 = var8.method3520(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class77(arg3, 4, arg4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4052(arg0, arg1, arg2, var16, var38, (class218) null, field1033[arg4], 0, field1036[arg4] * var35, field1030[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method4222(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class196.method3208(class225.method4236(var40)).field2177 / 2;
            }
            class218 var42;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var42 = var8.method3520(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class77(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4052(arg0, arg1, arg2, var16, var42, (class218) null, 256, arg4, field1038[arg4] * var39, field1026[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class218 var44;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var44 = var8.method3520(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class77(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4052(arg0, arg1, arg2, var16, var44, (class218) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method4222(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class196.method3208(class225.method4236(var46)).field2177 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class218 var49;
            class218 var50;
            if (var8.field2176 == -1 && var8.field2194 == null) {
                var49 = var8.method3520(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method3520(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class77(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
                var50 = new class77(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field2176, var8.field2185, (class218) null);
            }
            arg6.method4052(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field1038[arg4] * var45, field1026[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("ip.g(Lhc;[Lgw;I)V")
    public static final void method4470(class216 arg0, class203[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1035[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1035[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3763(var3, var4);
                        }
                    }
                }
            }
        }
        field1040 += (int) (Math.random() * 5.0D) - 2;
        if (field1040 < -8) {
            field1040 = -8;
        }
        if (field1040 > 8) {
            field1040 = 8;
        }
        field1041 += (int) (Math.random() * 5.0D) - 2;
        if (field1041 < -16) {
            field1041 = -16;
        }
        if (field1041 > 16) {
            field1041 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field137[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = field1027[var6][var16 + 1][var15] - field1027[var6][var16 - 1][var15];
                    int var18 = field1027[var6][var16][var15 + 1] - field1027[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    Statics.field1031[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                Statics.field1032[var25] = 0;
                Statics.field327[var25] = 0;
                Statics.field1039[var25] = 0;
                Statics.field1320[var25] = 0;
                Statics.field906[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = client.field516 < 209 ? (int) class285.method6675(8) : (int) class285.method6675(15);
                        int var30 = Statics.field1029[var6][var28][var27] & var29;
                        if (var30 > 0) {
                            class190 var31 = class190.method295(var30 - 1);
                            Statics.field1032[var27] += var31.field2096;
                            Statics.field327[var27] += var31.field2097;
                            Statics.field1039[var27] += var31.field2099;
                            Statics.field1320[var27] += var31.field2102;
                            var10002 = Statics.field906[var27]++;
                        }
                    }
                    int var32 = var26 - 5;
                    if (var32 >= 0 && var32 < 104) {
                        int var33 = client.field516 < 209 ? (int) class285.method6675(8) : (int) class285.method6675(15);
                        int var34 = Statics.field1029[var6][var32][var27] & var33;
                        if (var34 > 0) {
                            class190 var35 = class190.method295(var34 - 1);
                            Statics.field1032[var27] -= var35.field2096;
                            Statics.field327[var27] -= var35.field2097;
                            Statics.field1039[var27] -= var35.field2099;
                            Statics.field1320[var27] -= var35.field2102;
                            var10002 = Statics.field906[var27]--;
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
                            var36 += Statics.field1032[var42];
                            var37 += Statics.field327[var42];
                            var38 += Statics.field1039[var42];
                            var39 += Statics.field1320[var42];
                            var40 += Statics.field906[var42];
                        }
                        int var43 = var41 - 5;
                        if (var43 >= 0 && var43 < 104) {
                            var36 -= Statics.field1032[var43];
                            var37 -= Statics.field327[var43];
                            var38 -= Statics.field1039[var43];
                            var39 -= Statics.field1320[var43];
                            var40 -= Statics.field906[var43];
                        }
                        if (var41 >= 1 && var41 < 103 && (!client.field562 || (field1035[0][var26][var41] & 0x2) != 0 || (field1035[var6][var26][var41] & 0x10) == 0)) {
                            if (var6 < field1028) {
                                field1028 = var6;
                            }
                            int var44 = client.field516 < 209 ? (int) class285.method6675(8) : (int) class285.method6675(15);
                            int var45 = Statics.field1029[var6][var26][var41] & var44;
                            int var46 = Statics.field5063[var6][var26][var41] & var44;
                            if (var45 > 0 || var46 > 0) {
                                int var47 = field1027[var6][var26][var41];
                                int var48 = field1027[var6][var26 + 1][var41];
                                int var49 = field1027[var6][var26 + 1][var41 + 1];
                                int var50 = field1027[var6][var26][var41 + 1];
                                int var51 = Statics.field1031[var26][var41];
                                int var52 = Statics.field1031[var26 + 1][var41];
                                int var53 = Statics.field1031[var26 + 1][var41 + 1];
                                int var54 = Statics.field1031[var26][var41 + 1];
                                int var55 = -1;
                                int var56 = -1;
                                if (var45 > 0) {
                                    int var57 = var36 * 256 / var39;
                                    int var58 = var37 / var40;
                                    int var59 = var38 / var40;
                                    var55 = method6677(var57, var58, var59);
                                    int var60 = field1040 + var57 & 0xFF;
                                    int var61 = field1041 + var59;
                                    if (var61 < 0) {
                                        var61 = 0;
                                    } else if (var61 > 255) {
                                        var61 = 255;
                                    }
                                    var56 = method6677(var60, var58, var61);
                                }
                                if (var6 > 0) {
                                    boolean var62 = true;
                                    if (var45 == 0 && Statics.field1034[var6][var26][var41] != 0) {
                                        var62 = false;
                                    }
                                    if (var46 > 0) {
                                        int var63 = var46 - 1;
                                        class198 var64 = (class198) class198.field2265.method4917((long) var63);
                                        class198 var65;
                                        if (var64 == null) {
                                            byte[] var66 = Statics.field2264.method5909(4, var63);
                                            class198 var67 = new class198();
                                            if (var66 != null) {
                                                var67.method3648(new class467(var66), var63);
                                            }
                                            var67.method3647();
                                            class198.field2265.method4925(var67, (long) var63);
                                            var65 = var67;
                                        } else {
                                            var65 = var64;
                                        }
                                        if (!var65.field2268) {
                                            var62 = false;
                                        }
                                    }
                                    if (var62 && var47 == var48 && var47 == var49 && var47 == var50) {
                                        Statics.field1817[var6][var26][var41] |= 0x924;
                                    }
                                }
                                int var68 = 0;
                                if (var56 != -1) {
                                    var68 = class213.field2504[method3294(var56, 96)];
                                }
                                if (var46 == 0) {
                                    arg0.method4048(var6, var26, var41, 0, 0, -1, var47, var48, var49, var50, method3294(var55, var51), method3294(var55, var52), method3294(var55, var53), method3294(var55, var54), 0, 0, 0, 0, var68, 0);
                                } else {
                                    int var69 = Statics.field1034[var6][var26][var41] + 1;
                                    byte var70 = Statics.field4345[var6][var26][var41];
                                    int var71 = var46 - 1;
                                    class198 var72 = (class198) class198.field2265.method4917((long) var71);
                                    class198 var73;
                                    if (var72 == null) {
                                        byte[] var74 = Statics.field2264.method5909(4, var71);
                                        class198 var75 = new class198();
                                        if (var74 != null) {
                                            var75.method3648(new class467(var74), var71);
                                        }
                                        var75.method3647();
                                        class198.field2265.method4925(var75, (long) var71);
                                        var73 = var75;
                                    } else {
                                        var73 = var72;
                                    }
                                    int var77 = var73.field2267;
                                    int var78;
                                    int var79;
                                    if (var77 >= 0) {
                                        var78 = Statics.field2491.method4256(var77);
                                        var79 = -1;
                                    } else if (var73.field2266 == 16711935) {
                                        var79 = -2;
                                        var77 = -1;
                                        var78 = -2;
                                    } else {
                                        var79 = method6677(var73.field2272, var73.field2270, var73.field2271);
                                        int var80 = field1040 + var73.field2272 & 0xFF;
                                        int var81 = field1041 + var73.field2271;
                                        if (var81 < 0) {
                                            var81 = 0;
                                        } else if (var81 > 255) {
                                            var81 = 255;
                                        }
                                        var78 = method6677(var80, var73.field2270, var81);
                                    }
                                    int var82 = 0;
                                    if (var78 != -2) {
                                        var82 = class213.field2504[method4762(var78, 96)];
                                    }
                                    if (var73.field2269 != -1) {
                                        int var83 = field1040 + var73.field2273 & 0xFF;
                                        int var84 = field1041 + var73.field2275;
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        int var85 = method6677(var83, var73.field2274, var84);
                                        var82 = class213.field2504[method4762(var85, 96)];
                                    }
                                    arg0.method4048(var6, var26, var41, var69, var70, var77, var47, var48, var49, var50, method3294(var55, var51), method3294(var55, var52), method3294(var55, var53), method3294(var55, var54), method4762(var79, var51), method4762(var79, var52), method4762(var79, var53), method4762(var79, var54), var68, var82);
                                }
                            }
                        }
                    }
                }
            }
            for (int var86 = 1; var86 < 103; var86++) {
                for (int var87 = 1; var87 < 103; var87++) {
                    arg0.method4047(var6, var87, var86, method4872(var6, var87, var86));
                }
            }
            Statics.field1029[var6] = (short[][]) null;
            Statics.field5063[var6] = (short[][]) null;
            Statics.field1034[var6] = (byte[][]) null;
            Statics.field4345[var6] = (byte[][]) null;
            Statics.field137[var6] = (byte[][]) null;
        }
        arg0.method4074(-50, -10, -50);
        for (int var88 = 0; var88 < 104; var88++) {
            for (int var89 = 0; var89 < 104; var89++) {
                if ((field1035[1][var88][var89] & 0x2) == 2) {
                    arg0.method4045(var88, var89);
                }
            }
        }
        int var90 = 1;
        int var91 = 2;
        int var92 = 4;
        for (int var93 = 0; var93 < 4; var93++) {
            if (var93 > 0) {
                var90 <<= 0x3;
                var91 <<= 0x3;
                var92 <<= 0x3;
            }
            for (int var94 = 0; var94 <= var93; var94++) {
                for (int var95 = 0; var95 <= 104; var95++) {
                    for (int var96 = 0; var96 <= 104; var96++) {
                        if ((Statics.field1817[var94][var96][var95] & var90) != 0) {
                            int var97 = var95;
                            int var98 = var95;
                            int var99 = var94;
                            int var100 = var94;
                            while (var97 > 0 && (Statics.field1817[var94][var96][var97 - 1] & var90) != 0) {
                                var97--;
                            }
                            while (var98 < 104 && (Statics.field1817[var94][var96][var98 + 1] & var90) != 0) {
                                var98++;
                            }
                            label368: while (var99 > 0) {
                                for (int var101 = var97; var101 <= var98; var101++) {
                                    if ((Statics.field1817[var99 - 1][var96][var101] & var90) == 0) {
                                        break label368;
                                    }
                                }
                                var99--;
                            }
                            label357: while (var100 < var93) {
                                for (int var102 = var97; var102 <= var98; var102++) {
                                    if ((Statics.field1817[var100 + 1][var96][var102] & var90) == 0) {
                                        break label357;
                                    }
                                }
                                var100++;
                            }
                            int var103 = (var100 + 1 - var99) * (var98 - var97 + 1);
                            if (var103 >= 8) {
                                short var104 = 240;
                                int var105 = field1027[var100][var96][var97] - var104;
                                int var106 = field1027[var99][var96][var97];
                                class216.method4172(var93, 1, var96 * 128, var96 * 128, var97 * 128, var98 * 128 + 128, var105, var106);
                                for (int var107 = var99; var107 <= var100; var107++) {
                                    for (int var108 = var97; var108 <= var98; var108++) {
                                        Statics.field1817[var107][var96][var108] &= ~var90;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1817[var94][var96][var95] & var91) != 0) {
                            int var109 = var96;
                            int var110 = var96;
                            int var111 = var94;
                            int var112 = var94;
                            while (var109 > 0 && (Statics.field1817[var94][var109 - 1][var95] & var91) != 0) {
                                var109--;
                            }
                            while (var110 < 104 && (Statics.field1817[var94][var110 + 1][var95] & var91) != 0) {
                                var110++;
                            }
                            label421: while (var111 > 0) {
                                for (int var113 = var109; var113 <= var110; var113++) {
                                    if ((Statics.field1817[var111 - 1][var113][var95] & var91) == 0) {
                                        break label421;
                                    }
                                }
                                var111--;
                            }
                            label410: while (var112 < var93) {
                                for (int var114 = var109; var114 <= var110; var114++) {
                                    if ((Statics.field1817[var112 + 1][var114][var95] & var91) == 0) {
                                        break label410;
                                    }
                                }
                                var112++;
                            }
                            int var115 = (var112 + 1 - var111) * (var110 - var109 + 1);
                            if (var115 >= 8) {
                                short var116 = 240;
                                int var117 = field1027[var112][var109][var95] - var116;
                                int var118 = field1027[var111][var109][var95];
                                class216.method4172(var93, 2, var109 * 128, var110 * 128 + 128, var95 * 128, var95 * 128, var117, var118);
                                for (int var119 = var111; var119 <= var112; var119++) {
                                    for (int var120 = var109; var120 <= var110; var120++) {
                                        Statics.field1817[var119][var120][var95] &= ~var91;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1817[var94][var96][var95] & var92) != 0) {
                            int var121 = var96;
                            int var122 = var96;
                            int var123 = var95;
                            int var124 = var95;
                            while (var123 > 0 && (Statics.field1817[var94][var96][var123 - 1] & var92) != 0) {
                                var123--;
                            }
                            while (var124 < 104 && (Statics.field1817[var94][var96][var124 + 1] & var92) != 0) {
                                var124++;
                            }
                            label474: while (var121 > 0) {
                                for (int var125 = var123; var125 <= var124; var125++) {
                                    if ((Statics.field1817[var94][var121 - 1][var125] & var92) == 0) {
                                        break label474;
                                    }
                                }
                                var121--;
                            }
                            label463: while (var122 < 104) {
                                for (int var126 = var123; var126 <= var124; var126++) {
                                    if ((Statics.field1817[var94][var122 + 1][var126] & var92) == 0) {
                                        break label463;
                                    }
                                }
                                var122++;
                            }
                            if ((var122 - var121 + 1) * (var124 - var123 + 1) >= 4) {
                                int var127 = field1027[var94][var121][var123];
                                class216.method4172(var93, 4, var121 * 128, var122 * 128 + 128, var123 * 128, var124 * 128 + 128, var127, var127);
                                for (int var128 = var121; var128 <= var122; var128++) {
                                    for (int var129 = var123; var129 <= var124; var129++) {
                                        Statics.field1817[var94][var128][var129] &= ~var92;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ju.i(IIIB)I")
    public static int method4872(int arg0, int arg1, int arg2) {
        if ((field1035[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field1035[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bz.o(IIIB)I")
    public static final int method1693(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2920(var3, var5);
        int var8 = method2920(var3 + 1, var5);
        int var9 = method2920(var3, var5 + 1);
        int var10 = method2920(var3 + 1, var5 + 1);
        int var11 = method691(var7, var8, var4, arg2);
        int var12 = method691(var9, var10, var4, arg2);
        return method691(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ab.n(IIIIB)I")
    public static final int method691(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class213.field2509[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ec.k(III)I")
    public static final int method2920(int arg0, int arg1) {
        int var2 = method4752(arg0 - 1, arg1 - 1) + method4752(arg0 + 1, arg1 - 1) + method4752(arg0 - 1, arg1 + 1) + method4752(arg0 + 1, arg1 + 1);
        int var3 = method4752(arg0 - 1, arg1) + method4752(arg0 + 1, arg1) + method4752(arg0, arg1 - 1) + method4752(arg0, arg1 + 1);
        int var4 = method4752(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("io.a(III)I")
    public static final int method4752(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("gf.s(IIB)I")
    public static final int method3294(int arg0, int arg1) {
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

    @ObfuscatedName("im.l(III)I")
    public static final int method4762(int arg0, int arg1) {
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

    @ObfuscatedName("nk.t(IIII)I")
    public static final int method6677(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ln.c(III)Z")
    public static final boolean method5812(int arg0, int arg1) {
        class196 var2 = class196.method3208(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3518(arg1);
    }
}
