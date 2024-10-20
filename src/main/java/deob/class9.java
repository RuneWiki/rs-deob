package deob;

@ObfuscatedName("a")
public final class class9 {

    @ObfuscatedName("a.e")
    public static int[][][] field153 = new int[4][105][105];

    @ObfuscatedName("a.i")
    public static byte[][][] field133 = new byte[4][104][104];

    @ObfuscatedName("a.k")
    public static int field138 = 99;

    @ObfuscatedName("a.f")
    public static final int[] field145 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("a.s")
    public static final int[] field135 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("a.y")
    public static final int[] field147 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("a.r")
    public static final int[] field148 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("a.l")
    public static final int[] field132 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("a.n")
    public static final int[] field149 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("a.h")
    public static int field134 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("a.v")
    public static int field152 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.e(B)V")
    public static void method50() {
        Statics.field150 = (byte[][][]) null;
        Statics.field136 = (byte[][][]) null;
        Statics.field2020 = (byte[][][]) null;
        Statics.field146 = (byte[][][]) null;
        Statics.field143 = (int[][][]) null;
        Statics.field137 = (byte[][][]) null;
        Statics.field139 = (int[][]) null;
        Statics.field140 = null;
        Statics.field2429 = null;
        Statics.field2018 = null;
        Statics.field141 = null;
        Statics.field142 = null;
    }

    @ObfuscatedName("a.i(IIIII)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field137[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field153[0][var5][var4] = field153[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field153[0][var5][var4] = field153[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field153[0][var5][var4] = field153[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field153[0][var5][var4] = field153[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ez.k([BIIII[Lez;I)V")
    public static final void method2679(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class131[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2061[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class128 var9 = new class128(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2384(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("c.q([BIIIIIII[Lez;I)V")
    public static final void method172(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class131[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2061[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class128 var11 = new class128(arg0);
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
                        method2384(var11, arg1, arg2 + var22, arg3 + class163.method752(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2384(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("er.j(IIIB)V")
    public static final void method2984(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field153[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field153[arg0][arg1][arg2 + var5] = field153[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field153[arg0][arg1 + var6][arg2] = field153[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field153[arg0][arg1 - 1][arg2] != 0) {
            field153[arg0][arg1][arg2] = field153[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field153[arg0][arg1][arg2 - 1] != 0) {
            field153[arg0][arg1][arg2] = field153[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field153[arg0][arg1 - 1][arg2 - 1] != 0) {
            field153[arg0][arg1][arg2] = field153[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("da.z(Ldl;IIIIIII)V")
    public static final void method2384(class128 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2548();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2548();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2548();
                }
            }
            return;
        }
        field133[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2548();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field153[0][arg2][arg3] = -method2239(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field153[arg1][arg2][arg3] = field153[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2548();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field153[0][arg2][arg3] = -var8 * 8;
                } else {
                    field153[arg1][arg2][arg3] = field153[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field136[arg1][arg2][arg3] = arg0.method2455();
                Statics.field2020[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field146[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field133[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field150[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("g.w([BIILci;[Lez;I)V")
    public static final void method158(byte[] arg0, int arg1, int arg2, class96 arg3, class131[] arg4) {
        class128 var5 = new class128(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2536();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2536();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2548();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field133[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class131 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1887(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("co.a(IIIIIILci;Lez;I)V")
    public static final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class96 arg6, class131 arg7) {
        if (client.field505 && (field133[0][arg1][arg2] & 0x2) == 0) {
            if ((field133[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2713(arg0, arg1, arg2) != client.field499) {
                return;
            }
        }
        if (arg0 < field138) {
            field138 = arg0;
        }
        class33 var8 = class33.method266(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field865;
            var10 = var8.field848;
        } else {
            var9 = var8.field848;
            var10 = var8.field865;
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
        int[][] var15 = field153[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field852 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field873 == 1) {
            var20 += 256;
        }
        if (var8.method707()) {
            class7 var21 = new class7();
            var21.field95 = arg0;
            var21.field96 = arg1 * 128;
            var21.field114 = arg2 * 128;
            int var22 = var8.field848;
            int var23 = var8.field865;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field865;
                var23 = var8.field848;
            }
            var21.field104 = (arg1 + var22) * 128;
            var21.field99 = (arg2 + var23) * 128;
            var21.field101 = var8.field877;
            var21.field110 = var8.field849 * 128;
            var21.field103 = var8.field879;
            var21.field113 = var8.field880;
            var21.field94 = var8.field881;
            if (var8.field874 != null) {
                var21.field108 = var8;
                var21.method45();
            }
            class7.field115.method3328(var21);
            if (var21.field94 != null) {
                var21.field100 = var21.field103 + (int) (Math.random() * (double) (var21.field113 - var21.field103));
            }
        }
        if (arg5 == 22) {
            if (!client.field505 || var8.field852 != 0 || var8.field850 == 1 || var8.field872) {
                class95 var24;
                if (var8.field856 == -1 && var8.field874 == null) {
                    var24 = var8.method688(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field856, true, (class95) null);
                }
                arg6.method1896(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field850 == 1 && arg7 != null) {
                    arg7.method2683(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class95 var47;
            if (var8.field856 == -1 && var8.field874 == null) {
                var47 = var8.method688(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            if (var47 != null && arg6.method1900(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field864) {
                int var48 = 15;
                if (var47 instanceof class113) {
                    var48 = ((class113) var47).method2291() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field137[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field137[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method2681(arg1, arg2, var9, var10, var8.field851);
            }
        } else if (arg5 >= 12) {
            class95 var25;
            if (var8.field856 == -1 && var8.field874 == null) {
                var25 = var8.method688(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1900(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field143[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method2681(arg1, arg2, var9, var10, var8.field851);
            }
        } else if (arg5 == 0) {
            class95 var26;
            if (var8.field856 == -1 && var8.field874 == null) {
                var26 = var8.method688(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, var26, (class95) null, field145[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field864) {
                    Statics.field137[arg0][arg1][arg2] = 50;
                    Statics.field137[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field855) {
                    Statics.field143[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field864) {
                    Statics.field137[arg0][arg1][arg2 + 1] = 50;
                    Statics.field137[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field855) {
                    Statics.field143[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field864) {
                    Statics.field137[arg0][arg1 + 1][arg2] = 50;
                    Statics.field137[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field855) {
                    Statics.field143[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field864) {
                    Statics.field137[arg0][arg1][arg2] = 50;
                    Statics.field137[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field855) {
                    Statics.field143[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method2680(arg1, arg2, arg5, arg4, var8.field851);
            }
            if (var8.field857 != 16) {
                arg6.method1906(arg0, arg1, arg2, var8.field857);
            }
        } else if (arg5 == 1) {
            class95 var27;
            if (var8.field856 == -1 && var8.field874 == null) {
                var27 = var8.method688(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, var27, (class95) null, field135[arg4], 0, var19, var20);
            if (var8.field864) {
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
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method2680(arg1, arg2, arg5, arg4, var8.field851);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class95 var29;
            class95 var30;
            if (var8.field856 == -1 && var8.field874 == null) {
                var29 = var8.method688(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method688(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field856, true, (class95) null);
                var30 = new class14(arg3, 2, var28, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, var29, var30, field145[arg4], field145[var28], var19, var20);
            if (var8.field855) {
                if (arg4 == 0) {
                    Statics.field143[arg0][arg1][arg2] |= 0x249;
                    Statics.field143[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field143[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field143[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field143[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field143[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field143[arg0][arg1][arg2] |= 0x492;
                    Statics.field143[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method2680(arg1, arg2, arg5, arg4, var8.field851);
            }
            if (var8.field857 != 16) {
                arg6.method1906(arg0, arg1, arg2, var8.field857);
            }
        } else if (arg5 == 3) {
            class95 var31;
            if (var8.field856 == -1 && var8.field874 == null) {
                var31 = var8.method688(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, var31, (class95) null, field135[arg4], 0, var19, var20);
            if (var8.field864) {
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
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method2680(arg1, arg2, arg5, arg4, var8.field851);
            }
        } else if (arg5 == 9) {
            class95 var32;
            if (var8.field856 == -1 && var8.field874 == null) {
                var32 = var8.method688(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1900(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method2681(arg1, arg2, var9, var10, var8.field851);
            }
            if (var8.field857 != 16) {
                arg6.method1906(arg0, arg1, arg2, var8.field857);
            }
        } else if (arg5 == 4) {
            class95 var33;
            if (var8.field856 == -1 && var8.field874 == null) {
                var33 = var8.method688(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var33, (class95) null, field145[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1910(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class33.method266(var35 >> 14 & 0x7FFF).field857;
            }
            class95 var36;
            if (var8.field856 == -1 && var8.field874 == null) {
                var36 = var8.method688(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var36, (class95) null, field145[arg4], 0, field147[arg4] * var34, field148[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1910(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class33.method266(var38 >> 14 & 0x7FFF).field857 / 2;
            }
            class95 var39;
            if (var8.field856 == -1 && var8.field874 == null) {
                var39 = var8.method688(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var39, (class95) null, 256, arg4, field132[arg4] * var37, field149[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class95 var41;
            if (var8.field856 == -1 && var8.field874 == null) {
                var41 = var8.method688(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class14(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var41, (class95) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1910(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class33.method266(var43 >> 14 & 0x7FFF).field857 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class95 var45;
            class95 var46;
            if (var8.field856 == -1 && var8.field874 == null) {
                var45 = var8.method688(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method688(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field856, true, (class95) null);
                var46 = new class14(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field856, true, (class95) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field132[arg4] * var42, field149[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("ca.d(Lci;[Lez;I)V")
    public static final void method2048(class96 arg0, class131[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field133[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field133[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2682(var3, var4);
                        }
                    }
                }
            }
        }
        field134 += (int) (Math.random() * 5.0D) - 2;
        if (field134 < -8) {
            field134 = -8;
        }
        if (field134 > 8) {
            field134 = 8;
        }
        field152 += (int) (Math.random() * 5.0D) - 2;
        if (field152 < -16) {
            field152 = -16;
        }
        if (field152 > 16) {
            field152 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field137[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field153[var6][var11 + 1][var10] - field153[var6][var11 - 1][var10];
                    int var13 = field153[var6][var11][var10 + 1] - field153[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field139[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field140[var20] = 0;
                Statics.field2429[var20] = 0;
                Statics.field2018[var20] = 0;
                Statics.field141[var20] = 0;
                Statics.field142[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field150[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class34 var25 = class34.method680(var24 - 1);
                            Statics.field140[var22] += var25.field889;
                            Statics.field2429[var22] += var25.field887;
                            Statics.field2018[var22] += var25.field888;
                            Statics.field141[var22] += var25.field890;
                            var10002 = Statics.field142[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field150[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class34 var28 = class34.method680(var27 - 1);
                            Statics.field140[var22] -= var28.field889;
                            Statics.field2429[var22] -= var28.field887;
                            Statics.field2018[var22] -= var28.field888;
                            Statics.field141[var22] -= var28.field890;
                            var10002 = Statics.field142[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var29 = 0;
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = 0;
                    for (int var34 = -5; var34 < 109; var34++) {
                        int var35 = var34 + 5;
                        if (var35 >= 0 && var35 < 104) {
                            var29 += Statics.field140[var35];
                            var30 += Statics.field2429[var35];
                            var31 += Statics.field2018[var35];
                            var32 += Statics.field141[var35];
                            var33 += Statics.field142[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field140[var36];
                            var30 -= Statics.field2429[var36];
                            var31 -= Statics.field2018[var36];
                            var32 -= Statics.field141[var36];
                            var33 -= Statics.field142[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field505 || (field133[0][var21][var34] & 0x2) != 0 || (field133[var6][var21][var34] & 0x10) == 0 && method2713(var6, var21, var34) == client.field499)) {
                            if (var6 < field138) {
                                field138 = var6;
                            }
                            int var37 = Statics.field150[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field136[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field153[var6][var21][var34];
                                int var40 = field153[var6][var21 + 1][var34];
                                int var41 = field153[var6][var21 + 1][var34 + 1];
                                int var42 = field153[var6][var21][var34 + 1];
                                int var43 = Statics.field139[var21][var34];
                                int var44 = Statics.field139[var21 + 1][var34];
                                int var45 = Statics.field139[var21 + 1][var34 + 1];
                                int var46 = Statics.field139[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method282(var49, var50, var51);
                                    int var52 = field134 + var49 & 0xFF;
                                    int var53 = field152 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method282(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field2020[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class38.method156(var38 - 1).field964) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field143[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class105.field1778[method1469(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1895(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method1469(var47, var43), method1469(var47, var44), method1469(var47, var45), method1469(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field2020[var6][var21][var34] + 1;
                                    byte var57 = Statics.field146[var6][var21][var34];
                                    class38 var58 = class38.method156(var38 - 1);
                                    int var59 = var58.field963;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1775.method2213(var59);
                                        var61 = -1;
                                    } else if (var58.field961 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method282(var58.field966, var58.field967, var58.field972);
                                        int var62 = field134 + var58.field966 & 0xFF;
                                        int var63 = field152 + var58.field972;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method282(var62, var58.field967, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class105.field1778[method836(var60, 96)];
                                    }
                                    if (var58.field968 != -1) {
                                        int var65 = field134 + var58.field969 & 0xFF;
                                        int var66 = field152 + var58.field971;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method282(var65, var58.field965, var66);
                                        var64 = class105.field1778[method836(var67, 96)];
                                    }
                                    arg0.method1895(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method1469(var47, var43), method1469(var47, var44), method1469(var47, var45), method1469(var47, var46), method836(var61, var43), method836(var61, var44), method836(var61, var45), method836(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method1955(var6, var69, var68, method2713(var6, var69, var68));
                }
            }
            Statics.field150[var6] = (byte[][]) null;
            Statics.field136[var6] = (byte[][]) null;
            Statics.field2020[var6] = (byte[][]) null;
            Statics.field146[var6] = (byte[][]) null;
            Statics.field137[var6] = (byte[][]) null;
        }
        arg0.method1921(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field133[1][var70][var71] & 0x2) == 2) {
                    arg0.method1892(var70, var71);
                }
            }
        }
        int var72 = 1;
        int var73 = 2;
        int var74 = 4;
        for (int var75 = 0; var75 < 4; var75++) {
            if (var75 > 0) {
                var72 <<= 0x3;
                var73 <<= 0x3;
                var74 <<= 0x3;
            }
            for (int var76 = 0; var76 <= var75; var76++) {
                for (int var77 = 0; var77 <= 104; var77++) {
                    for (int var78 = 0; var78 <= 104; var78++) {
                        if ((Statics.field143[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field143[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field143[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label339: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field143[var81 - 1][var78][var83] & var72) == 0) {
                                        break label339;
                                    }
                                }
                                var81--;
                            }
                            label328: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field143[var82 + 1][var78][var84] & var72) == 0) {
                                        break label328;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field153[var82][var78][var79] - var86;
                                int var88 = field153[var81][var78][var79];
                                class96.method1893(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field143[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field143[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field143[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field143[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label392: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field143[var93 - 1][var95][var77] & var73) == 0) {
                                        break label392;
                                    }
                                }
                                var93--;
                            }
                            label381: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field143[var94 + 1][var96][var77] & var73) == 0) {
                                        break label381;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field153[var94][var91][var77] - var98;
                                int var100 = field153[var93][var91][var77];
                                class96.method1893(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field143[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field143[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field143[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field143[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label445: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field143[var76][var103 - 1][var107] & var74) == 0) {
                                        break label445;
                                    }
                                }
                                var103--;
                            }
                            label434: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field143[var76][var104 + 1][var108] & var74) == 0) {
                                        break label434;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field153[var76][var103][var105];
                                class96.method1893(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field143[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.u(IIII)I")
    public static int method2713(int arg0, int arg1, int arg2) {
        if ((field133[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field133[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dz.p(IIB)I")
    public static final int method2239(int arg0, int arg1) {
        int var2 = method3194(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3194(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3194(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("fp.t(IIIS)I")
    public static final int method3194(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1882(var3, var5);
        int var8 = method1882(var3 + 1, var5);
        int var9 = method1882(var3, var5 + 1);
        int var10 = method1882(var3 + 1, var5 + 1);
        int var11 = method206(var7, var8, var4, arg2);
        int var12 = method206(var9, var10, var4, arg2);
        return method206(var11, var12, var6, arg2);
    }

    @ObfuscatedName("r.g(IIIIB)I")
    public static final int method206(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class105.field1765[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("cz.o(III)I")
    public static final int method1882(int arg0, int arg1) {
        int var2 = method938(arg0 - 1, arg1 - 1) + method938(arg0 + 1, arg1 - 1) + method938(arg0 - 1, arg1 + 1) + method938(arg0 + 1, arg1 + 1);
        int var3 = method938(arg0 - 1, arg1) + method938(arg0 + 1, arg1) + method938(arg0, arg1 - 1) + method938(arg0, arg1 + 1);
        int var4 = method938(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("az.x(III)I")
    public static final int method938(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bb.c(III)I")
    public static final int method1469(int arg0, int arg1) {
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

    @ObfuscatedName("aq.b(III)I")
    public static final int method836(int arg0, int arg1) {
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

    @ObfuscatedName("ao.f(IIII)I")
    public static final int method282(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("h.s(III)Z")
    public static final boolean method256(int arg0, int arg1) {
        class33 var2 = class33.method266(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method686(arg1);
    }

    @ObfuscatedName("ae.y(IIIIIIILci;Lez;B)V")
    public static final void method767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class96 arg7, class131 arg8) {
        class33 var9 = class33.method266(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field865;
            var11 = var9.field848;
        } else {
            var10 = var9.field848;
            var11 = var9.field865;
        }
        int var12;
        int var13;
        if (arg2 + var10 <= 104) {
            var12 = (var10 >> 1) + arg2;
            var13 = (var10 + 1 >> 1) + arg2;
        } else {
            var12 = arg2;
            var13 = arg2 + 1;
        }
        int var14;
        int var15;
        if (arg3 + var11 <= 104) {
            var14 = (var11 >> 1) + arg3;
            var15 = (var11 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int[][] var16 = field153[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field852 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field873 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class95 var22;
            if (var9.field856 == -1 && var9.field874 == null) {
                var22 = var9.method689(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1896(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field850 == 1) {
                arg8.method2683(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class95 var45;
            if (var9.field856 == -1 && var9.field874 == null) {
                var45 = var9.method689(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            if (var45 != null) {
                arg7.method1900(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field850 != 0) {
                arg8.method2681(arg2, arg3, var10, var11, var9.field851);
            }
        } else if (arg6 >= 12) {
            class95 var23;
            if (var9.field856 == -1 && var9.field874 == null) {
                var23 = var9.method689(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1900(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field850 != 0) {
                arg8.method2681(arg2, arg3, var10, var11, var9.field851);
            }
        } else if (arg6 == 0) {
            class95 var24;
            if (var9.field856 == -1 && var9.field874 == null) {
                var24 = var9.method689(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1898(arg0, arg2, arg3, var17, var24, (class95) null, field145[arg5], 0, var20, var21);
            if (var9.field850 != 0) {
                arg8.method2680(arg2, arg3, arg6, arg5, var9.field851);
            }
        } else if (arg6 == 1) {
            class95 var25;
            if (var9.field856 == -1 && var9.field874 == null) {
                var25 = var9.method689(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1898(arg0, arg2, arg3, var17, var25, (class95) null, field135[arg5], 0, var20, var21);
            if (var9.field850 != 0) {
                arg8.method2680(arg2, arg3, arg6, arg5, var9.field851);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class95 var27;
            class95 var28;
            if (var9.field856 == -1 && var9.field874 == null) {
                var27 = var9.method689(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method689(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field856, true, (class95) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1898(arg0, arg2, arg3, var17, var27, var28, field145[arg5], field145[var26], var20, var21);
            if (var9.field850 != 0) {
                arg8.method2680(arg2, arg3, arg6, arg5, var9.field851);
            }
        } else if (arg6 == 3) {
            class95 var29;
            if (var9.field856 == -1 && var9.field874 == null) {
                var29 = var9.method689(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1898(arg0, arg2, arg3, var17, var29, (class95) null, field135[arg5], 0, var20, var21);
            if (var9.field850 != 0) {
                arg8.method2680(arg2, arg3, arg6, arg5, var9.field851);
            }
        } else if (arg6 == 9) {
            class95 var30;
            if (var9.field856 == -1 && var9.field874 == null) {
                var30 = var9.method689(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1900(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field850 != 0) {
                arg8.method2681(arg2, arg3, var10, var11, var9.field851);
            }
        } else if (arg6 == 4) {
            class95 var31;
            if (var9.field856 == -1 && var9.field874 == null) {
                var31 = var9.method689(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1899(arg0, arg2, arg3, var17, var31, (class95) null, field145[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1910(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class33.method266(var33 >> 14 & 0x7FFF).field857;
            }
            class95 var34;
            if (var9.field856 == -1 && var9.field874 == null) {
                var34 = var9.method689(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1899(arg0, arg2, arg3, var17, var34, (class95) null, field145[arg5], 0, field147[arg5] * var32, field148[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1910(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class33.method266(var36 >> 14 & 0x7FFF).field857 / 2;
            }
            class95 var37;
            if (var9.field856 == -1 && var9.field874 == null) {
                var37 = var9.method689(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1899(arg0, arg2, arg3, var17, var37, (class95) null, 256, arg5, field132[arg5] * var35, field149[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class95 var39;
            if (var9.field856 == -1 && var9.field874 == null) {
                var39 = var9.method689(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1899(arg0, arg2, arg3, var17, var39, (class95) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1910(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class33.method266(var41 >> 14 & 0x7FFF).field857 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class95 var43;
            class95 var44;
            if (var9.field856 == -1 && var9.field874 == null) {
                var43 = var9.method689(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method689(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field856, true, (class95) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field856, true, (class95) null);
            }
            arg7.method1899(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field132[arg5] * var40, field149[arg5] * var40, var20, var21);
        }
    }
}
