package deob;

@ObfuscatedName("bb")
public final class class75 {

    @ObfuscatedName("bb.i")
    public static int[][][] field969 = new int[4][105][105];

    @ObfuscatedName("bb.w")
    public static byte[][][] field955 = new byte[4][104][104];

    @ObfuscatedName("bb.s")
    public static int field957 = 99;

    @ObfuscatedName("bb.q")
    public static final int[] field965 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bb.d")
    public static final int[] field968 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bb.r")
    public static final int[] field967 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bb.m")
    public static final int[] field961 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bb.c")
    public static final int[] field958 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bb.f")
    public static final int[] field971 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bb.h")
    public static int field956 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bb.v")
    public static int field972 = (int) (Math.random() * 33.0D) - 16;

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.i(I)V")
    public static void method2394() {
        Statics.field966 = (byte[][][]) null;
        Statics.field959 = (byte[][][]) null;
        Statics.field960 = (byte[][][]) null;
        Statics.field970 = (byte[][][]) null;
        Statics.field963 = (int[][][]) null;
        Statics.field420 = (byte[][][]) null;
        Statics.field3213 = (int[][]) null;
        Statics.field1236 = null;
        Statics.field4288 = null;
        Statics.field962 = null;
        Statics.field7 = null;
        Statics.field1040 = null;
    }

    @ObfuscatedName("ir.w(IIIII)V")
    public static final void method4261(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field420[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field969[0][var5][var4] = field969[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field969[0][var5][var4] = field969[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field969[0][var5][var4] = field969[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field969[0][var5][var4] = field969[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ny.s([BIIII[Lfq;I)V")
    public static final void method5997(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class173[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1979[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class401 var9 = new class401(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method575(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("fu.a([BIIIIIII[Lfq;I)V")
    public static final void method3109(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class173[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1979[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class401 var11 = new class401(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var18 = var13 & 0x7;
                        int var19 = var14 & 0x7;
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
                        int var25 = arg2 + var22;
                        int var27 = var13 & 0x7;
                        int var28 = var14 & 0x7;
                        int var30 = arg7 & 0x3;
                        int var31;
                        if (var30 == 0) {
                            var31 = var28;
                        } else if (var30 == 1) {
                            var31 = 7 - var27;
                        } else if (var30 == 2) {
                            var31 = 7 - var28;
                        } else {
                            var31 = var27;
                        }
                        method575(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method575(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.o(Lop;IIIIIII)V")
    public static final void method575(class401 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method6240();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method6240();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method6240();
                }
            }
            return;
        }
        field955[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method6240();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field969[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = Statics.method283(var10 + 45365, var11 + 91923, 4) - 128 + (Statics.method283(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (Statics.method283(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field969[arg1][arg2][arg3] = field969[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method6240();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field969[0][arg2][arg3] = -var15 * 8;
                } else {
                    field969[arg1][arg2][arg3] = field969[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field959[arg1][arg2][arg3] = arg0.method6241();
                Statics.field960[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field970[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field955[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field966[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("b.g([BIIB)Z")
    public static final boolean method65(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class401 var4 = new class401(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method6255();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method6254();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method6240() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class169 var16 = Statics.method2740(var5);
                        if (var13 != 22 || !client.field467 || var16.field1869 != 0 || var16.field1841 == 1 || var16.field1862) {
                            if (!var16.method2975()) {
                                client.field524++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method6254();
                if (var9 == 0) {
                    break;
                }
                var4.method6240();
            }
        }
    }

    @ObfuscatedName("cn.e([BIILhf;[Lfq;I)V")
    public static final void method2051(byte[] arg0, int arg1, int arg2, class213 arg3, class173[] arg4) {
        class401 var5 = new class401(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method6255();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method6254();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method6240();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field955[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class173 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2150(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("cw.p(IIIIIILhf;Lfq;B)V")
    public static final void method2150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class213 arg6, class173 arg7) {
        if (client.field467 && (field955[0][arg1][arg2] & 0x2) == 0 && (field955[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field957) {
            field957 = arg0;
        }
        class169 var8 = Statics.method2740(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field1840;
            var10 = var8.field1828;
        } else {
            var9 = var8.field1828;
            var10 = var8.field1840;
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
        int[][] var15 = field969[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class221.method6189(arg1, arg2, 2, var8.field1869 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field1864 == 1) {
            var21 += 256;
        }
        if (var8.method2998()) {
            class63.method2427(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field467 || var8.field1869 != 0 || var8.field1841 == 1 || var8.field1862) {
                class214 var22;
                if (var8.field1847 == -1 && var8.field1824 == null) {
                    var22 = var8.method2976(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class73(arg3, 22, arg4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
                }
                arg6.method3977(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field1841 == 1 && arg7 != null) {
                    arg7.method3150(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class214 var48;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var48 = var8.method2976(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class73(arg3, 10, arg4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            if (var48 != null && arg6.method3837(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field1855) {
                int var49 = 15;
                if (var48 instanceof class220) {
                    var49 = ((class220) var48).method4079() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field420[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field420[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field1841 != 0 && arg7 != null) {
                arg7.method3148(arg1, arg2, var9, var10, var8.field1842);
            }
        } else if (arg5 >= 12) {
            class214 var23;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var23 = var8.method2976(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3837(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field963[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field1841 != 0 && arg7 != null) {
                arg7.method3148(arg1, arg2, var9, var10, var8.field1842);
            }
        } else if (arg5 == 0) {
            class214 var24;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var24 = var8.method2976(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class73(arg3, 0, arg4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3835(arg0, arg1, arg2, var16, var24, (class214) null, field965[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field1855) {
                    Statics.field420[arg0][arg1][arg2] = 50;
                    Statics.field420[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field1846) {
                    Statics.field963[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field1855) {
                    Statics.field420[arg0][arg1][arg2 + 1] = 50;
                    Statics.field420[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1846) {
                    Statics.field963[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field1855) {
                    Statics.field420[arg0][arg1 + 1][arg2] = 50;
                    Statics.field420[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1846) {
                    Statics.field963[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field1855) {
                    Statics.field420[arg0][arg1][arg2] = 50;
                    Statics.field420[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field1846) {
                    Statics.field963[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field1841 != 0 && arg7 != null) {
                arg7.method3147(arg1, arg2, arg5, arg4, var8.field1842);
            }
            if (var8.field1848 != 16) {
                arg6.method3935(arg0, arg1, arg2, var8.field1848);
            }
        } else if (arg5 == 1) {
            class214 var25;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var25 = var8.method2976(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class73(arg3, 1, arg4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3835(arg0, arg1, arg2, var16, var25, (class214) null, field968[arg4], 0, var19, var21);
            if (var8.field1855) {
                if (arg4 == 0) {
                    Statics.field420[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field420[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field420[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field420[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1841 != 0 && arg7 != null) {
                arg7.method3147(arg1, arg2, arg5, arg4, var8.field1842);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class214 var27;
            class214 var28;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var27 = var8.method2976(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method2976(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class73(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
                var28 = new class73(arg3, 2, var26, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3835(arg0, arg1, arg2, var16, var27, var28, field965[arg4], field965[var26], var19, var21);
            if (var8.field1846) {
                if (arg4 == 0) {
                    Statics.field963[arg0][arg1][arg2] |= 0x249;
                    Statics.field963[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field963[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field963[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field963[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field963[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field963[arg0][arg1][arg2] |= 0x492;
                    Statics.field963[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field1841 != 0 && arg7 != null) {
                arg7.method3147(arg1, arg2, arg5, arg4, var8.field1842);
            }
            if (var8.field1848 != 16) {
                arg6.method3935(arg0, arg1, arg2, var8.field1848);
            }
        } else if (arg5 == 3) {
            class214 var29;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var29 = var8.method2976(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class73(arg3, 3, arg4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3835(arg0, arg1, arg2, var16, var29, (class214) null, field968[arg4], 0, var19, var21);
            if (var8.field1855) {
                if (arg4 == 0) {
                    Statics.field420[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field420[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field420[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field420[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1841 != 0 && arg7 != null) {
                arg7.method3147(arg1, arg2, arg5, arg4, var8.field1842);
            }
        } else if (arg5 == 9) {
            class214 var30;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var30 = var8.method2976(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3837(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field1841 != 0 && arg7 != null) {
                arg7.method3148(arg1, arg2, var9, var10, var8.field1842);
            }
            if (var8.field1848 != 16) {
                arg6.method3935(arg0, arg1, arg2, var8.field1848);
            }
        } else if (arg5 == 4) {
            class214 var31;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var31 = var8.method2976(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3836(arg0, arg1, arg2, var16, var31, (class214) null, field965[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3853(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = Statics.method2740(class221.method300(var33)).field1848;
            }
            class214 var35;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var35 = var8.method2976(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3836(arg0, arg1, arg2, var16, var35, (class214) null, field965[arg4], 0, field967[arg4] * var32, field961[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3853(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = Statics.method2740(class221.method300(var37)).field1848 / 2;
            }
            class214 var39;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var39 = var8.method2976(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3836(arg0, arg1, arg2, var16, var39, (class214) null, 256, arg4, field958[arg4] * var36, field971[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class214 var41;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var41 = var8.method2976(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class73(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3836(arg0, arg1, arg2, var16, var41, (class214) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3853(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = Statics.method2740(class221.method300(var43)).field1848 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class214 var46;
            class214 var47;
            if (var8.field1847 == -1 && var8.field1824 == null) {
                var46 = var8.method2976(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method2976(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
                var47 = new class73(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field1847, var8.field1873, (class214) null);
            }
            arg6.method3836(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field958[arg4] * var42, field971[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("cz.b(IIIIB)I")
    public static final int method2241(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class211.field2370[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bn.x(IIB)I")
    public static final int method1896(int arg0, int arg1) {
        int var2 = method2403(arg0 - 1, arg1 - 1) + method2403(arg0 + 1, arg1 - 1) + method2403(arg0 - 1, arg1 + 1) + method2403(arg0 + 1, arg1 + 1);
        int var3 = method2403(arg0 - 1, arg1) + method2403(arg0 + 1, arg1) + method2403(arg0, arg1 - 1) + method2403(arg0, arg1 + 1);
        int var4 = method2403(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ds.y(III)I")
    public static final int method2403(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cy.k(III)I")
    public static final int method2321(int arg0, int arg1) {
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

    @ObfuscatedName("gh.t(III)I")
    public static final int method3528(int arg0, int arg1) {
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

    @ObfuscatedName("cp.u(III)Z")
    public static final boolean method2140(int arg0, int arg1) {
        class169 var2 = Statics.method2740(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method2987(arg1);
    }
}
