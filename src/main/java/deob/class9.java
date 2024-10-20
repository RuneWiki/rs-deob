package deob;

@ObfuscatedName("u")
public final class class9 {

    @ObfuscatedName("u.t")
    public static int[][][] field138 = new int[4][105][105];

    @ObfuscatedName("u.l")
    public static byte[][][] field135 = new byte[4][104][104];

    @ObfuscatedName("u.c")
    public static int field159 = 99;

    @ObfuscatedName("u.r")
    public static final int[] field140 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("u.s")
    public static final int[] field149 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("u.g")
    public static final int[] field150 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("u.m")
    public static final int[] field145 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("u.a")
    public static final int[] field152 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("u.n")
    public static final int[] field153 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("u.v")
    public static int field154 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("u.e")
    public static int field146 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.t(I)V")
    public static void method138() {
        field159 = 99;
        Statics.field139 = new byte[4][104][104];
        Statics.field142 = new byte[4][104][104];
        Statics.field155 = new byte[4][104][104];
        Statics.field147 = new byte[4][104][104];
        Statics.field217 = new int[4][105][105];
        Statics.field141 = new byte[4][105][105];
        Statics.field2054 = new int[105][105];
        Statics.field136 = new int[104];
        Statics.field143 = new int[104];
        Statics.field144 = new int[104];
        Statics.field148 = new int[104];
        Statics.field157 = new int[104];
    }

    @ObfuscatedName("ak.l(IIIII)V")
    public static final void method563(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field141[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field138[0][var5][var4] = field138[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field138[0][var5][var4] = field138[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field138[0][var5][var4] = field138[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field138[0][var5][var4] = field138[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.c([BIIIIIII[Lfg;I)V")
    public static final void method2230(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2753[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class127 var11 = new class127(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method2927(var11, arg1, arg2 + class160.method2137(var13 & 0x7, var14 & 0x7, arg7), arg3 + class160.method150(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2927(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ei.d(Ldo;IIIIIII)V")
    public static final void method2927(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2438();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2438();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2438();
                }
            }
            return;
        }
        field135[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2438();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field138[0][arg2][arg3] = -method156(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field138[arg1][arg2][arg3] = field138[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2438();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field138[0][arg2][arg3] = -var8 * 8;
                } else {
                    field138[arg1][arg2][arg3] = field138[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field142[arg1][arg2][arg3] = arg0.method2629();
                Statics.field155[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field147[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field135[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field139[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("aq.b([BIII)Z")
    public static final boolean method701(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class127 var4 = new class127(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2423();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2423();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2438() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class32 var16 = class32.method1876(var5);
                        if (var13 != 22 || !client.field584 || var16.field852 != 0 || var16.field850 == 1 || var16.field872) {
                            if (!var16.method662()) {
                                client.field654++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2423();
                if (var9 == 0) {
                    break;
                }
                var4.method2438();
            }
        }
    }

    @ObfuscatedName("aq.i(IIIIIILcf;Lfg;I)V")
    public static final void method671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field584 && (field135[0][arg1][arg2] & 0x2) == 0) {
            if ((field135[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field135[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field135[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field502 != var8) {
                return;
            }
        }
        if (arg0 < field159) {
            field159 = arg0;
        }
        class32 var9 = class32.method1876(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field849;
            var11 = var9.field847;
        } else {
            var10 = var9.field847;
            var11 = var9.field849;
        }
        int var12;
        int var13;
        if (arg1 + var10 <= 104) {
            var12 = (var10 >> 1) + arg1;
            var13 = (var10 + 1 >> 1) + arg1;
        } else {
            var12 = arg1;
            var13 = arg1 + 1;
        }
        int var14;
        int var15;
        if (arg2 + var11 <= 104) {
            var14 = (var11 >> 1) + arg2;
            var15 = (var11 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int[][] var16 = field138[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field852 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field874 == 1) {
            var21 += 256;
        }
        if (var9.method668()) {
            class7.method228(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field584 || var9.field852 != 0 || var9.field850 == 1 || var9.field872) {
                class94 var22;
                if (var9.field856 == -1 && var9.field875 == null) {
                    var22 = var9.method678(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field856, true, (class94) null);
                }
                arg6.method1886(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field850 == 1 && arg7 != null) {
                    arg7.method3217(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var45;
            if (var9.field856 == -1 && var9.field875 == null) {
                var45 = var9.method678(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            if (var45 != null && arg6.method1890(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field883) {
                int var46 = 15;
                if (var45 instanceof class112) {
                    var46 = ((class112) var45).method2244() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field141[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field141[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field850 != 0 && arg7 != null) {
                arg7.method3215(arg1, arg2, var10, var11, var9.field851);
            }
        } else if (arg5 >= 12) {
            class94 var23;
            if (var9.field856 == -1 && var9.field875 == null) {
                var23 = var9.method678(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method1890(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field217[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field850 != 0 && arg7 != null) {
                arg7.method3215(arg1, arg2, var10, var11, var9.field851);
            }
        } else if (arg5 == 0) {
            class94 var24;
            if (var9.field856 == -1 && var9.field875 == null) {
                var24 = var9.method678(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method1934(arg0, arg1, arg2, var17, var24, (class94) null, field140[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field883) {
                    Statics.field141[arg0][arg1][arg2] = 50;
                    Statics.field141[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field863) {
                    Statics.field217[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field883) {
                    Statics.field141[arg0][arg1][arg2 + 1] = 50;
                    Statics.field141[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field863) {
                    Statics.field217[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field883) {
                    Statics.field141[arg0][arg1 + 1][arg2] = 50;
                    Statics.field141[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field863) {
                    Statics.field217[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field883) {
                    Statics.field141[arg0][arg1][arg2] = 50;
                    Statics.field141[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field863) {
                    Statics.field217[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field850 != 0 && arg7 != null) {
                arg7.method3214(arg1, arg2, arg5, arg4, var9.field851);
            }
            if (var9.field843 != 16) {
                arg6.method1896(arg0, arg1, arg2, var9.field843);
            }
        } else if (arg5 == 1) {
            class94 var25;
            if (var9.field856 == -1 && var9.field875 == null) {
                var25 = var9.method678(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method1934(arg0, arg1, arg2, var17, var25, (class94) null, field149[arg4], 0, var20, var21);
            if (var9.field883) {
                if (arg4 == 0) {
                    Statics.field141[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field141[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field141[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field141[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field850 != 0 && arg7 != null) {
                arg7.method3214(arg1, arg2, arg5, arg4, var9.field851);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field856 == -1 && var9.field875 == null) {
                var27 = var9.method678(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method678(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field856, true, (class94) null);
                var28 = new class14(arg3, 2, var26, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method1934(arg0, arg1, arg2, var17, var27, var28, field140[arg4], field140[var26], var20, var21);
            if (var9.field863) {
                if (arg4 == 0) {
                    Statics.field217[arg0][arg1][arg2] |= 0x249;
                    Statics.field217[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field217[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field217[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field217[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field217[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field217[arg0][arg1][arg2] |= 0x492;
                    Statics.field217[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field850 != 0 && arg7 != null) {
                arg7.method3214(arg1, arg2, arg5, arg4, var9.field851);
            }
            if (var9.field843 != 16) {
                arg6.method1896(arg0, arg1, arg2, var9.field843);
            }
        } else if (arg5 == 3) {
            class94 var29;
            if (var9.field856 == -1 && var9.field875 == null) {
                var29 = var9.method678(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method1934(arg0, arg1, arg2, var17, var29, (class94) null, field149[arg4], 0, var20, var21);
            if (var9.field883) {
                if (arg4 == 0) {
                    Statics.field141[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field141[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field141[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field141[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field850 != 0 && arg7 != null) {
                arg7.method3214(arg1, arg2, arg5, arg4, var9.field851);
            }
        } else if (arg5 == 9) {
            class94 var30;
            if (var9.field856 == -1 && var9.field875 == null) {
                var30 = var9.method678(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method1890(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field850 != 0 && arg7 != null) {
                arg7.method3215(arg1, arg2, var10, var11, var9.field851);
            }
            if (var9.field843 != 16) {
                arg6.method1896(arg0, arg1, arg2, var9.field843);
            }
        } else if (arg5 == 4) {
            class94 var31;
            if (var9.field856 == -1 && var9.field875 == null) {
                var31 = var9.method678(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method2001(arg0, arg1, arg2, var17, var31, (class94) null, field140[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1995(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class32.method1876(var33 >> 14 & 0x7FFF).field843;
            }
            class94 var34;
            if (var9.field856 == -1 && var9.field875 == null) {
                var34 = var9.method678(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method2001(arg0, arg1, arg2, var17, var34, (class94) null, field140[arg4], 0, field150[arg4] * var32, field145[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1995(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method1876(var36 >> 14 & 0x7FFF).field843 / 2;
            }
            class94 var37;
            if (var9.field856 == -1 && var9.field875 == null) {
                var37 = var9.method678(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method2001(arg0, arg1, arg2, var17, var37, (class94) null, 256, arg4, field152[arg4] * var35, field153[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class94 var39;
            if (var9.field856 == -1 && var9.field875 == null) {
                var39 = var9.method678(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method2001(arg0, arg1, arg2, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1995(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class32.method1876(var41 >> 14 & 0x7FFF).field843 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field856 == -1 && var9.field875 == null) {
                var43 = var9.method678(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method678(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field856, true, (class94) null);
                var44 = new class14(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field856, true, (class94) null);
            }
            arg6.method2001(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field152[arg4] * var40, field153[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("h.p(Lcf;[Lfg;I)V")
    public static final void method135(class95 arg0, class164[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field135[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field135[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3228(var3, var4);
                        }
                    }
                }
            }
        }
        field154 += (int) (Math.random() * 5.0D) - 2;
        if (field154 < -8) {
            field154 = -8;
        }
        if (field154 > 8) {
            field154 = 8;
        }
        field146 += (int) (Math.random() * 5.0D) - 2;
        if (field146 < -16) {
            field146 = -16;
        }
        if (field146 > 16) {
            field146 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field141[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field138[var6][var11 + 1][var10] - field138[var6][var11 - 1][var10];
                    int var13 = field138[var6][var11][var10 + 1] - field138[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2054[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field136[var20] = 0;
                Statics.field143[var20] = 0;
                Statics.field144[var20] = 0;
                Statics.field148[var20] = 0;
                Statics.field157[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field139[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class33 var26 = (class33) class33.field887.method3260((long) var25);
                            class33 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field891.method2987(1, var25);
                                class33 var29 = new class33();
                                if (var28 != null) {
                                    var29.method707(new class127(var28), var25);
                                }
                                var29.method714();
                                class33.field887.method3261(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field136[var22] += var27.field889;
                            Statics.field143[var22] += var27.field897;
                            Statics.field144[var22] += var27.field892;
                            Statics.field148[var22] += var27.field888;
                            var10002 = Statics.field157[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field139[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class33 var34 = (class33) class33.field887.method3260((long) var33);
                            class33 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field891.method2987(1, var33);
                                class33 var37 = new class33();
                                if (var36 != null) {
                                    var37.method707(new class127(var36), var33);
                                }
                                var37.method714();
                                class33.field887.method3261(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field136[var22] -= var35.field889;
                            Statics.field143[var22] -= var35.field897;
                            Statics.field144[var22] -= var35.field892;
                            Statics.field148[var22] -= var35.field888;
                            var10002 = Statics.field157[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var39 = 0;
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    for (int var44 = -5; var44 < 109; var44++) {
                        int var45 = var44 + 5;
                        if (var45 >= 0 && var45 < 104) {
                            var39 += Statics.field136[var45];
                            var40 += Statics.field143[var45];
                            var41 += Statics.field144[var45];
                            var42 += Statics.field148[var45];
                            var43 += Statics.field157[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field136[var46];
                            var40 -= Statics.field143[var46];
                            var41 -= Statics.field144[var46];
                            var42 -= Statics.field148[var46];
                            var43 -= Statics.field157[var46];
                        }
                        if (var44 >= 1 && var44 < 103) {
                            if (client.field584 && (field135[0][var21][var44] & 0x2) == 0) {
                                if ((field135[var6][var21][var44] & 0x10) != 0) {
                                    continue;
                                }
                                int var47;
                                if ((field135[var6][var21][var44] & 0x8) != 0) {
                                    var47 = 0;
                                } else if (var6 <= 0 || (field135[1][var21][var44] & 0x2) == 0) {
                                    var47 = var6;
                                } else {
                                    var47 = var6 - 1;
                                }
                                if (client.field502 != var47) {
                                    continue;
                                }
                            }
                            if (var6 < field159) {
                                field159 = var6;
                            }
                            int var48 = Statics.field139[var6][var21][var44] & 0xFF;
                            int var49 = Statics.field142[var6][var21][var44] & 0xFF;
                            if (var48 > 0 || var49 > 0) {
                                int var50 = field138[var6][var21][var44];
                                int var51 = field138[var6][var21 + 1][var44];
                                int var52 = field138[var6][var21 + 1][var44 + 1];
                                int var53 = field138[var6][var21][var44 + 1];
                                int var54 = Statics.field2054[var21][var44];
                                int var55 = Statics.field2054[var21 + 1][var44];
                                int var56 = Statics.field2054[var21 + 1][var44 + 1];
                                int var57 = Statics.field2054[var21][var44 + 1];
                                int var58 = -1;
                                int var59 = -1;
                                if (var48 > 0) {
                                    int var60 = var39 * 256 / var42;
                                    int var61 = var40 / var43;
                                    int var62 = var41 / var43;
                                    var58 = method2049(var60, var61, var62);
                                    int var63 = field154 + var60 & 0xFF;
                                    int var64 = field146 + var62;
                                    if (var64 < 0) {
                                        var64 = 0;
                                    } else if (var64 > 255) {
                                        var64 = 255;
                                    }
                                    var59 = method2049(var63, var61, var64);
                                }
                                if (var6 > 0) {
                                    boolean var65 = true;
                                    if (var48 == 0 && Statics.field155[var6][var21][var44] != 0) {
                                        var65 = false;
                                    }
                                    if (var49 > 0) {
                                        int var66 = var49 - 1;
                                        class37 var67 = (class37) class37.field958.method3260((long) var66);
                                        class37 var68;
                                        if (var67 == null) {
                                            byte[] var69 = Statics.field963.method2987(4, var66);
                                            class37 var70 = new class37();
                                            if (var69 != null) {
                                                var70.method818(new class127(var69), var66);
                                            }
                                            var70.method826();
                                            class37.field958.method3261(var70, (long) var66);
                                            var68 = var70;
                                        } else {
                                            var68 = var67;
                                        }
                                        if (!var68.field961) {
                                            var65 = false;
                                        }
                                    }
                                    if (var65 && var50 == var51 && var50 == var52 && var50 == var53) {
                                        Statics.field217[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var71 = 0;
                                if (var59 != -1) {
                                    var71 = class104.field1810[method38(var59, 96)];
                                }
                                if (var49 == 0) {
                                    arg0.method1885(var6, var21, var44, 0, 0, -1, var50, var51, var52, var53, method38(var58, var54), method38(var58, var55), method38(var58, var56), method38(var58, var57), 0, 0, 0, 0, var71, 0);
                                } else {
                                    int var72 = Statics.field155[var6][var21][var44] + 1;
                                    byte var73 = Statics.field147[var6][var21][var44];
                                    int var74 = var49 - 1;
                                    class37 var75 = (class37) class37.field958.method3260((long) var74);
                                    class37 var76;
                                    if (var75 == null) {
                                        byte[] var77 = Statics.field963.method2987(4, var74);
                                        class37 var78 = new class37();
                                        if (var77 != null) {
                                            var78.method818(new class127(var77), var74);
                                        }
                                        var78.method826();
                                        class37.field958.method3261(var78, (long) var74);
                                        var76 = var78;
                                    } else {
                                        var76 = var75;
                                    }
                                    int var80 = var76.field960;
                                    int var81;
                                    int var82;
                                    if (var80 >= 0) {
                                        var81 = Statics.field1811.method2193(var80);
                                        var82 = -1;
                                    } else if (var76.field973 == 16711935) {
                                        var82 = -2;
                                        var80 = -1;
                                        var81 = -2;
                                    } else {
                                        var82 = method2049(var76.field964, var76.field968, var76.field965);
                                        int var83 = field154 + var76.field964 & 0xFF;
                                        int var84 = field146 + var76.field965;
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        var81 = method2049(var83, var76.field968, var84);
                                    }
                                    int var85 = 0;
                                    if (var81 != -2) {
                                        var85 = class104.field1810[method1359(var81, 96)];
                                    }
                                    if (var76.field962 != -1) {
                                        int var86 = field154 + var76.field966 & 0xFF;
                                        int var87 = field146 + var76.field957;
                                        if (var87 < 0) {
                                            var87 = 0;
                                        } else if (var87 > 255) {
                                            var87 = 255;
                                        }
                                        int var88 = method2049(var86, var76.field970, var87);
                                        var85 = class104.field1810[method1359(var88, 96)];
                                    }
                                    arg0.method1885(var6, var21, var44, var72, var73, var80, var50, var51, var52, var53, method38(var58, var54), method38(var58, var55), method38(var58, var56), method38(var58, var57), method1359(var82, var54), method1359(var82, var55), method1359(var82, var56), method1359(var82, var57), var71, var85);
                                }
                            }
                        }
                    }
                }
            }
            for (int var89 = 1; var89 < 103; var89++) {
                for (int var90 = 1; var90 < 103; var90++) {
                    arg0.method1965(var6, var90, var89, method1675(var6, var90, var89));
                }
            }
            Statics.field139[var6] = (byte[][]) null;
            Statics.field142[var6] = (byte[][]) null;
            Statics.field155[var6] = (byte[][]) null;
            Statics.field147[var6] = (byte[][]) null;
            Statics.field141[var6] = (byte[][]) null;
        }
        arg0.method1911(-50, -10, -50);
        for (int var91 = 0; var91 < 104; var91++) {
            for (int var92 = 0; var92 < 104; var92++) {
                if ((field135[1][var91][var92] & 0x2) == 2) {
                    arg0.method1923(var91, var92);
                }
            }
        }
        int var93 = 1;
        int var94 = 2;
        int var95 = 4;
        for (int var96 = 0; var96 < 4; var96++) {
            if (var96 > 0) {
                var93 <<= 0x3;
                var94 <<= 0x3;
                var95 <<= 0x3;
            }
            for (int var97 = 0; var97 <= var96; var97++) {
                for (int var98 = 0; var98 <= 104; var98++) {
                    for (int var99 = 0; var99 <= 104; var99++) {
                        if ((Statics.field217[var97][var99][var98] & var93) != 0) {
                            int var100 = var98;
                            int var101 = var98;
                            int var102 = var97;
                            int var103 = var97;
                            while (var100 > 0 && (Statics.field217[var97][var99][var100 - 1] & var93) != 0) {
                                var100--;
                            }
                            while (var101 < 104 && (Statics.field217[var97][var99][var101 + 1] & var93) != 0) {
                                var101++;
                            }
                            label381: while (var102 > 0) {
                                for (int var104 = var100; var104 <= var101; var104++) {
                                    if ((Statics.field217[var102 - 1][var99][var104] & var93) == 0) {
                                        break label381;
                                    }
                                }
                                var102--;
                            }
                            label370: while (var103 < var96) {
                                for (int var105 = var100; var105 <= var101; var105++) {
                                    if ((Statics.field217[var103 + 1][var99][var105] & var93) == 0) {
                                        break label370;
                                    }
                                }
                                var103++;
                            }
                            int var106 = (var103 + 1 - var102) * (var101 - var100 + 1);
                            if (var106 >= 8) {
                                short var107 = 240;
                                int var108 = field138[var103][var99][var100] - var107;
                                int var109 = field138[var102][var99][var100];
                                class95.method1888(var96, 1, var99 * 128, var99 * 128, var100 * 128, var101 * 128 + 128, var108, var109);
                                for (int var110 = var102; var110 <= var103; var110++) {
                                    for (int var111 = var100; var111 <= var101; var111++) {
                                        Statics.field217[var110][var99][var111] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field217[var97][var99][var98] & var94) != 0) {
                            int var112 = var99;
                            int var113 = var99;
                            int var114 = var97;
                            int var115 = var97;
                            while (var112 > 0 && (Statics.field217[var97][var112 - 1][var98] & var94) != 0) {
                                var112--;
                            }
                            while (var113 < 104 && (Statics.field217[var97][var113 + 1][var98] & var94) != 0) {
                                var113++;
                            }
                            label434: while (var114 > 0) {
                                for (int var116 = var112; var116 <= var113; var116++) {
                                    if ((Statics.field217[var114 - 1][var116][var98] & var94) == 0) {
                                        break label434;
                                    }
                                }
                                var114--;
                            }
                            label423: while (var115 < var96) {
                                for (int var117 = var112; var117 <= var113; var117++) {
                                    if ((Statics.field217[var115 + 1][var117][var98] & var94) == 0) {
                                        break label423;
                                    }
                                }
                                var115++;
                            }
                            int var118 = (var115 + 1 - var114) * (var113 - var112 + 1);
                            if (var118 >= 8) {
                                short var119 = 240;
                                int var120 = field138[var115][var112][var98] - var119;
                                int var121 = field138[var114][var112][var98];
                                class95.method1888(var96, 2, var112 * 128, var113 * 128 + 128, var98 * 128, var98 * 128, var120, var121);
                                for (int var122 = var114; var122 <= var115; var122++) {
                                    for (int var123 = var112; var123 <= var113; var123++) {
                                        Statics.field217[var122][var123][var98] &= ~var94;
                                    }
                                }
                            }
                        }
                        if ((Statics.field217[var97][var99][var98] & var95) != 0) {
                            int var124 = var99;
                            int var125 = var99;
                            int var126 = var98;
                            int var127 = var98;
                            while (var126 > 0 && (Statics.field217[var97][var99][var126 - 1] & var95) != 0) {
                                var126--;
                            }
                            while (var127 < 104 && (Statics.field217[var97][var99][var127 + 1] & var95) != 0) {
                                var127++;
                            }
                            label487: while (var124 > 0) {
                                for (int var128 = var126; var128 <= var127; var128++) {
                                    if ((Statics.field217[var97][var124 - 1][var128] & var95) == 0) {
                                        break label487;
                                    }
                                }
                                var124--;
                            }
                            label476: while (var125 < 104) {
                                for (int var129 = var126; var129 <= var127; var129++) {
                                    if ((Statics.field217[var97][var125 + 1][var129] & var95) == 0) {
                                        break label476;
                                    }
                                }
                                var125++;
                            }
                            if ((var125 - var124 + 1) * (var127 - var126 + 1) >= 4) {
                                int var130 = field138[var97][var124][var126];
                                class95.method1888(var96, 4, var124 * 128, var125 * 128 + 128, var126 * 128, var127 * 128 + 128, var130, var130);
                                for (int var131 = var124; var131 <= var125; var131++) {
                                    for (int var132 = var126; var132 <= var127; var132++) {
                                        Statics.field217[var97][var131][var132] &= ~var95;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cu.y(IIII)I")
    public static int method1675(int arg0, int arg1, int arg2) {
        if ((field135[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field135[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("k.u(IIB)I")
    public static final int method156(int arg0, int arg1) {
        int var2 = method51(arg0 + 45365, arg1 + 91923, 4) - 128 + (method51(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method51(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("b.z(IIIB)I")
    public static final int method51(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method704(var3, var5);
        int var8 = method704(var3 + 1, var5);
        int var9 = method704(var3, var5 + 1);
        int var10 = method704(var3 + 1, var5 + 1);
        int var11 = 65536 - class104.field1815[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = method41(var9, var10, var4, arg2);
        return method41(var12, var14, var6, arg2);
    }

    @ObfuscatedName("d.j(IIIIB)I")
    public static final int method41(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1815[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("aq.h(III)I")
    public static final int method704(int arg0, int arg1) {
        int var2 = method2304(arg0 - 1, arg1 - 1) + method2304(arg0 + 1, arg1 - 1) + method2304(arg0 - 1, arg1 + 1) + method2304(arg0 + 1, arg1 + 1);
        int var3 = method2304(arg0 - 1, arg1) + method2304(arg0 + 1, arg1) + method2304(arg0, arg1 - 1) + method2304(arg0, arg1 + 1);
        int var4 = method2304(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dl.x(III)I")
    public static final int method2304(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("d.q(III)I")
    public static final int method38(int arg0, int arg1) {
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

    @ObfuscatedName("bq.w(III)I")
    public static final int method1359(int arg0, int arg1) {
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

    @ObfuscatedName("cx.k(IIII)I")
    public static final int method2049(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cv.o(IIB)Z")
    public static final boolean method1641(int arg0, int arg1) {
        class32 var2 = class32.method1876(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method673(arg1);
    }
}
