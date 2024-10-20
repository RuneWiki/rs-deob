package deob;

@ObfuscatedName("m")
public final class class9 {

    @ObfuscatedName("m.i")
    public static int[][][] field141 = new int[4][105][105];

    @ObfuscatedName("m.p")
    public static byte[][][] field134 = new byte[4][104][104];

    @ObfuscatedName("m.a")
    public static int field135 = 99;

    @ObfuscatedName("m.e")
    public static final int[] field148 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("m.s")
    public static final int[] field143 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("m.t")
    public static final int[] field156 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("m.r")
    public static final int[] field145 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("m.w")
    public static final int[] field153 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("m.x")
    public static final int[] field142 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("m.n")
    public static int field133 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("m.c")
    public static int field149 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.i(IIIII)V")
    public static final void method2813(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field968[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field141[0][var5][var4] = field141[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field141[0][var5][var4] = field141[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field141[0][var5][var4] = field141[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field141[0][var5][var4] = field141[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dg.p([BIIII[Lft;B)V")
    public static final void method2154(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class164[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2755[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class127 var9 = new class127(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method162(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("eg.a([BIIIIIII[Lft;I)V")
    public static final void method2664(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2755[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class127 var11 = new class127(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class160.method691(var13 & 0x7, var14 & 0x7, arg7);
                        int var19 = var13 & 0x7;
                        int var20 = var14 & 0x7;
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
                        method162(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method162(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.l(Ldn;IIIIIII)V")
    public static final void method162(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2411();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2411();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2411();
                }
            }
            return;
        }
        field134[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2411();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field141[0][arg2][arg3] = -method61(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field141[arg1][arg2][arg3] = field141[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2411();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field141[0][arg2][arg3] = -var8 * 8;
                } else {
                    field141[arg1][arg2][arg3] = field141[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field137[arg1][arg2][arg3] = arg0.method2475();
                Statics.field138[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field139[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field134[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field136[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("e.q(IIIIIILcl;Lft;B)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field487 && (field134[0][arg1][arg2] & 0x2) == 0) {
            if ((field134[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field134[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field134[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field539 != var8) {
                return;
            }
        }
        if (arg0 < field135) {
            field135 = arg0;
        }
        class32 var9 = class32.method1460(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field837;
            var11 = var9.field836;
        } else {
            var10 = var9.field836;
            var11 = var9.field837;
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
        int[][] var16 = field141[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field857 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field862 == 1) {
            var21 += 256;
        }
        if (var9.method654()) {
            class7.method3325(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field487 || var9.field857 != 0 || var9.field838 == 1 || var9.field860) {
                class94 var22;
                if (var9.field844 == -1 && var9.field856 == null) {
                    var22 = var9.method668(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
                }
                arg6.method1800(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field838 == 1 && arg7 != null) {
                    arg7.method3174(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var45;
            if (var9.field844 == -1 && var9.field856 == null) {
                var45 = var9.method668(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            if (var45 != null && arg6.method1933(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field852) {
                int var46 = 15;
                if (var45 instanceof class112) {
                    var46 = ((class112) var45).method2176() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field968[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field968[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3183(arg1, arg2, var10, var11, var9.field839);
            }
        } else if (arg5 >= 12) {
            class94 var23;
            if (var9.field844 == -1 && var9.field856 == null) {
                var23 = var9.method668(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1933(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field208[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3183(arg1, arg2, var10, var11, var9.field839);
            }
        } else if (arg5 == 0) {
            class94 var24;
            if (var9.field844 == -1 && var9.field856 == null) {
                var24 = var9.method668(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1948(arg0, arg1, arg2, var17, var24, (class94) null, field148[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field852) {
                    Statics.field968[arg0][arg1][arg2] = 50;
                    Statics.field968[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field843) {
                    Statics.field208[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field852) {
                    Statics.field968[arg0][arg1][arg2 + 1] = 50;
                    Statics.field968[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field843) {
                    Statics.field208[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field852) {
                    Statics.field968[arg0][arg1 + 1][arg2] = 50;
                    Statics.field968[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field843) {
                    Statics.field208[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field852) {
                    Statics.field968[arg0][arg1][arg2] = 50;
                    Statics.field968[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field843) {
                    Statics.field208[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3186(arg1, arg2, arg5, arg4, var9.field839);
            }
            if (var9.field829 != 16) {
                arg6.method1810(arg0, arg1, arg2, var9.field829);
            }
        } else if (arg5 == 1) {
            class94 var25;
            if (var9.field844 == -1 && var9.field856 == null) {
                var25 = var9.method668(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1948(arg0, arg1, arg2, var17, var25, (class94) null, field143[arg4], 0, var20, var21);
            if (var9.field852) {
                if (arg4 == 0) {
                    Statics.field968[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field968[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field968[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field968[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3186(arg1, arg2, arg5, arg4, var9.field839);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field844 == -1 && var9.field856 == null) {
                var27 = var9.method668(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method668(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
                var28 = new class14(arg3, 2, var26, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1948(arg0, arg1, arg2, var17, var27, var28, field148[arg4], field148[var26], var20, var21);
            if (var9.field843) {
                if (arg4 == 0) {
                    Statics.field208[arg0][arg1][arg2] |= 0x249;
                    Statics.field208[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field208[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field208[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field208[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field208[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field208[arg0][arg1][arg2] |= 0x492;
                    Statics.field208[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3186(arg1, arg2, arg5, arg4, var9.field839);
            }
            if (var9.field829 != 16) {
                arg6.method1810(arg0, arg1, arg2, var9.field829);
            }
        } else if (arg5 == 3) {
            class94 var29;
            if (var9.field844 == -1 && var9.field856 == null) {
                var29 = var9.method668(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1948(arg0, arg1, arg2, var17, var29, (class94) null, field143[arg4], 0, var20, var21);
            if (var9.field852) {
                if (arg4 == 0) {
                    Statics.field968[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field968[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field968[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field968[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3186(arg1, arg2, arg5, arg4, var9.field839);
            }
        } else if (arg5 == 9) {
            class94 var30;
            if (var9.field844 == -1 && var9.field856 == null) {
                var30 = var9.method668(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1933(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3183(arg1, arg2, var10, var11, var9.field839);
            }
            if (var9.field829 != 16) {
                arg6.method1810(arg0, arg1, arg2, var9.field829);
            }
        } else if (arg5 == 4) {
            class94 var31;
            if (var9.field844 == -1 && var9.field856 == null) {
                var31 = var9.method668(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1913(arg0, arg1, arg2, var17, var31, (class94) null, field148[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1801(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class32.method1460(var33 >> 14 & 0x7FFF).field829;
            }
            class94 var34;
            if (var9.field844 == -1 && var9.field856 == null) {
                var34 = var9.method668(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1913(arg0, arg1, arg2, var17, var34, (class94) null, field148[arg4], 0, field156[arg4] * var32, field145[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1801(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method1460(var36 >> 14 & 0x7FFF).field829 / 2;
            }
            class94 var37;
            if (var9.field844 == -1 && var9.field856 == null) {
                var37 = var9.method668(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1913(arg0, arg1, arg2, var17, var37, (class94) null, 256, arg4, field153[arg4] * var35, field142[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class94 var39;
            if (var9.field844 == -1 && var9.field856 == null) {
                var39 = var9.method668(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1913(arg0, arg1, arg2, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1801(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class32.method1460(var41 >> 14 & 0x7FFF).field829 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field844 == -1 && var9.field856 == null) {
                var43 = var9.method668(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method668(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
                var44 = new class14(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1913(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field153[arg4] * var40, field142[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("u.b(IIB)I")
    public static final int method61(int arg0, int arg1) {
        int var2 = method1603(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1603(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1603(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("cs.u(IIII)I")
    public static final int method1603(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method146(var3, var5);
        int var8 = method146(var3 + 1, var5);
        int var9 = method146(var3, var5 + 1);
        int var10 = method146(var3 + 1, var5 + 1);
        int var11 = 65536 - class104.field1781[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class104.field1781[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class104.field1781[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("k.d(III)I")
    public static final int method146(int arg0, int arg1) {
        int var2 = method269(arg0 - 1, arg1 - 1) + method269(arg0 + 1, arg1 - 1) + method269(arg0 - 1, arg1 + 1) + method269(arg0 + 1, arg1 + 1);
        int var3 = method269(arg0 - 1, arg1) + method269(arg0 + 1, arg1) + method269(arg0, arg1 - 1) + method269(arg0, arg1 + 1);
        int var4 = method269(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("az.m(III)I")
    public static final int method269(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ec.v(III)I")
    public static final int method2899(int arg0, int arg1) {
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

    @ObfuscatedName("da.j(III)I")
    public static final int method2337(int arg0, int arg1) {
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

    @ObfuscatedName("bw.h(III)Z")
    public static final boolean method1233(int arg0, int arg1) {
        class32 var2 = class32.method1460(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method648(arg1);
    }

    @ObfuscatedName("m.o(IIIIIIILcl;Lft;I)V")
    public static final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class164 arg8) {
        class32 var9 = class32.method1460(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field837;
            var11 = var9.field836;
        } else {
            var10 = var9.field836;
            var11 = var9.field837;
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
        int[][] var16 = field141[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field857 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field862 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field844 == -1 && var9.field856 == null) {
                var22 = var9.method666(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1800(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field838 == 1) {
                arg8.method3174(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field844 == -1 && var9.field856 == null) {
                var45 = var9.method666(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1933(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field838 != 0) {
                arg8.method3183(arg2, arg3, var10, var11, var9.field839);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field844 == -1 && var9.field856 == null) {
                var23 = var9.method666(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1933(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3183(arg2, arg3, var10, var11, var9.field839);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field844 == -1 && var9.field856 == null) {
                var24 = var9.method666(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1948(arg0, arg2, arg3, var17, var24, (class94) null, field148[arg5], 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3186(arg2, arg3, arg6, arg5, var9.field839);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field844 == -1 && var9.field856 == null) {
                var25 = var9.method666(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1948(arg0, arg2, arg3, var17, var25, (class94) null, field143[arg5], 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3186(arg2, arg3, arg6, arg5, var9.field839);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field844 == -1 && var9.field856 == null) {
                var27 = var9.method666(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method666(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1948(arg0, arg2, arg3, var17, var27, var28, field148[arg5], field148[var26], var20, var21);
            if (var9.field838 != 0) {
                arg8.method3186(arg2, arg3, arg6, arg5, var9.field839);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field844 == -1 && var9.field856 == null) {
                var29 = var9.method666(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1948(arg0, arg2, arg3, var17, var29, (class94) null, field143[arg5], 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3186(arg2, arg3, arg6, arg5, var9.field839);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field844 == -1 && var9.field856 == null) {
                var30 = var9.method666(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1933(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3183(arg2, arg3, var10, var11, var9.field839);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field844 == -1 && var9.field856 == null) {
                var31 = var9.method666(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1913(arg0, arg2, arg3, var17, var31, (class94) null, field148[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1801(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method1460(var33 >> 14 & 0x7FFF).field829;
            }
            class94 var34;
            if (var9.field844 == -1 && var9.field856 == null) {
                var34 = var9.method666(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1913(arg0, arg2, arg3, var17, var34, (class94) null, field148[arg5], 0, field156[arg5] * var32, field145[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1801(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method1460(var36 >> 14 & 0x7FFF).field829 / 2;
            }
            class94 var37;
            if (var9.field844 == -1 && var9.field856 == null) {
                var37 = var9.method666(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1913(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field153[arg5] * var35, field142[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field844 == -1 && var9.field856 == null) {
                var39 = var9.method666(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1913(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1801(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method1460(var41 >> 14 & 0x7FFF).field829 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field844 == -1 && var9.field856 == null) {
                var43 = var9.method666(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method666(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1913(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field153[arg5] * var40, field142[arg5] * var40, var20, var21);
        }
    }
}
