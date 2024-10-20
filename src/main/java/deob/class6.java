package deob;

@ObfuscatedName("a")
public final class class6 {

    @ObfuscatedName("a.j")
    public static int[][][] field80 = new int[4][105][105];

    @ObfuscatedName("a.m")
    public static byte[][][] field87 = new byte[4][104][104];

    @ObfuscatedName("a.f")
    public static int field75 = 99;

    @ObfuscatedName("a.y")
    public static final int[] field83 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("a.v")
    public static final int[] field84 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("a.q")
    public static final int[] field79 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("a.x")
    public static final int[] field88 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("a.d")
    public static final int[] field73 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("a.o")
    public static final int[] field85 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("a.c")
    public static int field89 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("a.b")
    public static int field90 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.j(I)V")
    public static void method2040() {
        field75 = 99;
        Statics.field86 = new byte[4][104][104];
        Statics.field2646 = new byte[4][104][104];
        Statics.field77 = new byte[4][104][104];
        Statics.field2059 = new byte[4][104][104];
        Statics.field678 = new int[4][105][105];
        Statics.field2240 = new byte[4][105][105];
        Statics.field78 = new int[105][105];
        Statics.field76 = new int[104];
        Statics.field765 = new int[104];
        Statics.field2574 = new int[104];
        Statics.field3157 = new int[104];
        Statics.field74 = new int[104];
    }

    @ObfuscatedName("dl.m(I)V")
    public static void method2299() {
        Statics.field86 = (byte[][][]) null;
        Statics.field2646 = (byte[][][]) null;
        Statics.field77 = (byte[][][]) null;
        Statics.field2059 = (byte[][][]) null;
        Statics.field678 = (int[][][]) null;
        Statics.field2240 = (byte[][][]) null;
        Statics.field78 = (int[][]) null;
        Statics.field76 = null;
        Statics.field765 = null;
        Statics.field2574 = null;
        Statics.field3157 = null;
        Statics.field74 = null;
    }

    @ObfuscatedName("m.f(IIIII)V")
    public static final void method13(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2240[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field80[0][var5][var4] = field80[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field80[0][var5][var4] = field80[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field80[0][var5][var4] = field80[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field80[0][var5][var4] = field80[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.l([BIIII[Ldh;B)V")
    public static final void method137(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class108[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1880[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class119 var9 = new class119(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2805(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("v.u([BIIIIIII[Ldh;I)V")
    public static final void method234(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1880[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class119 var11 = new class119(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method2805(var11, arg1, arg2 + class177.method2940(var13 & 0x7, var14 & 0x7, arg7), arg3 + class177.method1958(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2805(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.a(IIII)V")
    public static final void method186(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field80[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field80[arg0][arg1][arg2 + var5] = field80[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field80[arg0][arg1 + var6][arg2] = field80[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field80[arg0][arg1 - 1][arg2] != 0) {
            field80[arg0][arg1][arg2] = field80[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field80[arg0][arg1][arg2 - 1] != 0) {
            field80[arg0][arg1][arg2] = field80[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field80[arg0][arg1 - 1][arg2 - 1] != 0) {
            field80[arg0][arg1][arg2] = field80[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("eu.h(Ldc;IIIIIIB)V")
    public static final void method2805(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2372();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2372();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2372();
                }
            }
            return;
        }
        field87[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2372();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field80[0][arg2][arg3] = -method1486(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field80[arg1][arg2][arg3] = field80[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2372();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field80[0][arg2][arg3] = -var8 * 8;
                } else {
                    field80[arg1][arg2][arg3] = field80[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2646[arg1][arg2][arg3] = arg0.method2373();
                Statics.field77[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2059[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field87[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field86[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ed.i([BIILch;[Ldh;B)V")
    public static final void method2970(byte[] arg0, int arg1, int arg2, class86 arg3, class108[] arg4) {
        class119 var5 = new class119(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2384();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2384();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2372();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field87[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class108 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method184(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("p.t(IIIIIILch;Ldh;I)V")
    public static final void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field528 && (field87[0][arg1][arg2] & 0x2) == 0 && (field87[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field75) {
            field75 = arg0;
        }
        class41 var8 = class41.method736(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field921;
            var10 = var8.field920;
        } else {
            var9 = var8.field920;
            var10 = var8.field921;
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
        int[][] var15 = field80[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field938 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field945 == 1) {
            var20 += 256;
        }
        if (var8.method821()) {
            class24.method49(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field528 || var8.field938 != 0 || var8.field922 == 1 || var8.field906) {
                class85 var21;
                if (var8.field926 == -1 && var8.field946 == null) {
                    var21 = var8.method816(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field926, true, (class85) null);
                }
                arg6.method1799(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field922 == 1 && arg7 != null) {
                    arg7.method2283(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var44;
            if (var8.field926 == -1 && var8.field946 == null) {
                var44 = var8.method816(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            if (var44 != null && arg6.method1803(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field912) {
                int var45 = 15;
                if (var44 instanceof class105) {
                    var45 = ((class105) var44).method2181() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field2240[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field2240[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field922 != 0 && arg7 != null) {
                arg7.method2262(arg1, arg2, var9, var10, var8.field923);
            }
        } else if (arg5 >= 12) {
            class85 var22;
            if (var8.field926 == -1 && var8.field946 == null) {
                var22 = var8.method816(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1803(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field678[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field922 != 0 && arg7 != null) {
                arg7.method2262(arg1, arg2, var9, var10, var8.field923);
            }
        } else if (arg5 == 0) {
            class85 var23;
            if (var8.field926 == -1 && var8.field946 == null) {
                var23 = var8.method816(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1840(arg0, arg1, arg2, var16, var23, (class85) null, field83[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field912) {
                    Statics.field2240[arg0][arg1][arg2] = 50;
                    Statics.field2240[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field927) {
                    Statics.field678[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field912) {
                    Statics.field2240[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2240[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field927) {
                    Statics.field678[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field912) {
                    Statics.field2240[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2240[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field927) {
                    Statics.field678[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field912) {
                    Statics.field2240[arg0][arg1][arg2] = 50;
                    Statics.field2240[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field927) {
                    Statics.field678[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field922 != 0 && arg7 != null) {
                arg7.method2286(arg1, arg2, arg5, arg4, var8.field923);
            }
            if (var8.field929 != 16) {
                arg6.method1798(arg0, arg1, arg2, var8.field929);
            }
        } else if (arg5 == 1) {
            class85 var24;
            if (var8.field926 == -1 && var8.field946 == null) {
                var24 = var8.method816(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1840(arg0, arg1, arg2, var16, var24, (class85) null, field84[arg4], 0, var19, var20);
            if (var8.field912) {
                if (arg4 == 0) {
                    Statics.field2240[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2240[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2240[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2240[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field922 != 0 && arg7 != null) {
                arg7.method2286(arg1, arg2, arg5, arg4, var8.field923);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class85 var26;
            class85 var27;
            if (var8.field926 == -1 && var8.field946 == null) {
                var26 = var8.method816(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method816(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field926, true, (class85) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1840(arg0, arg1, arg2, var16, var26, var27, field83[arg4], field83[var25], var19, var20);
            if (var8.field927) {
                if (arg4 == 0) {
                    Statics.field678[arg0][arg1][arg2] |= 0x249;
                    Statics.field678[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field678[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field678[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field678[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field678[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field678[arg0][arg1][arg2] |= 0x492;
                    Statics.field678[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field922 != 0 && arg7 != null) {
                arg7.method2286(arg1, arg2, arg5, arg4, var8.field923);
            }
            if (var8.field929 != 16) {
                arg6.method1798(arg0, arg1, arg2, var8.field929);
            }
        } else if (arg5 == 3) {
            class85 var28;
            if (var8.field926 == -1 && var8.field946 == null) {
                var28 = var8.method816(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1840(arg0, arg1, arg2, var16, var28, (class85) null, field84[arg4], 0, var19, var20);
            if (var8.field912) {
                if (arg4 == 0) {
                    Statics.field2240[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2240[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2240[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2240[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field922 != 0 && arg7 != null) {
                arg7.method2286(arg1, arg2, arg5, arg4, var8.field923);
            }
        } else if (arg5 == 9) {
            class85 var29;
            if (var8.field926 == -1 && var8.field946 == null) {
                var29 = var8.method816(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1803(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field922 != 0 && arg7 != null) {
                arg7.method2262(arg1, arg2, var9, var10, var8.field923);
            }
            if (var8.field929 != 16) {
                arg6.method1798(arg0, arg1, arg2, var8.field929);
            }
        } else if (arg5 == 4) {
            class85 var30;
            if (var8.field926 == -1 && var8.field946 == null) {
                var30 = var8.method816(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1942(arg0, arg1, arg2, var16, var30, (class85) null, field83[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1819(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class41.method736(var32 >> 14 & 0x7FFF).field929;
            }
            class85 var33;
            if (var8.field926 == -1 && var8.field946 == null) {
                var33 = var8.method816(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1942(arg0, arg1, arg2, var16, var33, (class85) null, field83[arg4], 0, field79[arg4] * var31, field88[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1819(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method736(var35 >> 14 & 0x7FFF).field929 / 2;
            }
            class85 var36;
            if (var8.field926 == -1 && var8.field946 == null) {
                var36 = var8.method816(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1942(arg0, arg1, arg2, var16, var36, (class85) null, 256, arg4, field73[arg4] * var34, field85[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class85 var38;
            if (var8.field926 == -1 && var8.field946 == null) {
                var38 = var8.method816(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1942(arg0, arg1, arg2, var16, var38, (class85) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1819(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class41.method736(var40 >> 14 & 0x7FFF).field929 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class85 var42;
            class85 var43;
            if (var8.field926 == -1 && var8.field946 == null) {
                var42 = var8.method816(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method816(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field926, true, (class85) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field926, true, (class85) null);
            }
            arg6.method1942(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field73[arg4] * var39, field85[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ah.k(Lch;[Ldh;B)V")
    public static final void method870(class86 arg0, class108[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field87[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field87[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2263(var3, var4);
                        }
                    }
                }
            }
        }
        field89 += (int) (Math.random() * 5.0D) - 2;
        if (field89 < -8) {
            field89 = -8;
        }
        if (field89 > 8) {
            field89 = 8;
        }
        field90 += (int) (Math.random() * 5.0D) - 2;
        if (field90 < -16) {
            field90 = -16;
        }
        if (field90 > 16) {
            field90 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2240[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field80[var6][var11 + 1][var10] - field80[var6][var11 - 1][var10];
                    int var13 = field80[var6][var11][var10 + 1] - field80[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field78[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field76[var20] = 0;
                Statics.field765[var20] = 0;
                Statics.field2574[var20] = 0;
                Statics.field3157[var20] = 0;
                Statics.field74[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field86[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class42 var25 = class42.method2060(var24 - 1);
                            Statics.field76[var22] += var25.field957;
                            Statics.field765[var22] += var25.field961;
                            Statics.field2574[var22] += var25.field962;
                            Statics.field3157[var22] += var25.field963;
                            var10002 = Statics.field74[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field86[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class42 var28 = class42.method2060(var27 - 1);
                            Statics.field76[var22] -= var28.field957;
                            Statics.field765[var22] -= var28.field961;
                            Statics.field2574[var22] -= var28.field962;
                            Statics.field3157[var22] -= var28.field963;
                            var10002 = Statics.field74[var22]--;
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
                            var29 += Statics.field76[var35];
                            var30 += Statics.field765[var35];
                            var31 += Statics.field2574[var35];
                            var32 += Statics.field3157[var35];
                            var33 += Statics.field74[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field76[var36];
                            var30 -= Statics.field765[var36];
                            var31 -= Statics.field2574[var36];
                            var32 -= Statics.field3157[var36];
                            var33 -= Statics.field74[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field528 || (field87[0][var21][var34] & 0x2) != 0 || (field87[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field75) {
                                field75 = var6;
                            }
                            int var37 = Statics.field86[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field2646[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field80[var6][var21][var34];
                                int var40 = field80[var6][var21 + 1][var34];
                                int var41 = field80[var6][var21 + 1][var34 + 1];
                                int var42 = field80[var6][var21][var34 + 1];
                                int var43 = Statics.field78[var21][var34];
                                int var44 = Statics.field78[var21 + 1][var34];
                                int var45 = Statics.field78[var21 + 1][var34 + 1];
                                int var46 = Statics.field78[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method2717(var49, var50, var51);
                                    int var52 = field89 + var49 & 0xFF;
                                    int var53 = field90 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method2717(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field77[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class47.method1584(var38 - 1).field1033) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field678[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class91.field1569[method3054(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1865(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method3054(var47, var43), method3054(var47, var44), method3054(var47, var45), method3054(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field77[var6][var21][var34] + 1;
                                    byte var57 = Statics.field2059[var6][var21][var34];
                                    class47 var58 = class47.method1584(var38 - 1);
                                    int var59 = var58.field1039;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1570.method2035(var59);
                                        var61 = -1;
                                    } else if (var58.field1042 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method2717(var58.field1035, var58.field1040, var58.field1041);
                                        int var62 = field89 + var58.field1035 & 0xFF;
                                        int var63 = field90 + var58.field1041;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method2717(var62, var58.field1040, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class91.field1569[method206(var60, 96)];
                                    }
                                    if (var58.field1037 != -1) {
                                        int var65 = field89 + var58.field1038 & 0xFF;
                                        int var66 = field90 + var58.field1044;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method2717(var65, var58.field1043, var66);
                                        var64 = class91.field1569[method206(var67, 96)];
                                    }
                                    arg0.method1865(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method3054(var47, var43), method3054(var47, var44), method3054(var47, var45), method3054(var47, var46), method206(var61, var43), method206(var61, var44), method206(var61, var45), method206(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method1894(var6, var69, var68, method3053(var6, var69, var68));
                }
            }
            Statics.field86[var6] = (byte[][]) null;
            Statics.field2646[var6] = (byte[][]) null;
            Statics.field77[var6] = (byte[][]) null;
            Statics.field2059[var6] = (byte[][]) null;
            Statics.field2240[var6] = (byte[][]) null;
        }
        arg0.method1818(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field87[1][var70][var71] & 0x2) == 2) {
                    arg0.method1795(var70, var71);
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
                        if ((Statics.field678[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field678[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field678[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label337: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field678[var81 - 1][var78][var83] & var72) == 0) {
                                        break label337;
                                    }
                                }
                                var81--;
                            }
                            label326: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field678[var82 + 1][var78][var84] & var72) == 0) {
                                        break label326;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field80[var82][var78][var79] - var86;
                                int var88 = field80[var81][var78][var79];
                                class86.method1796(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field678[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field678[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field678[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field678[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label390: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field678[var93 - 1][var95][var77] & var73) == 0) {
                                        break label390;
                                    }
                                }
                                var93--;
                            }
                            label379: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field678[var94 + 1][var96][var77] & var73) == 0) {
                                        break label379;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field80[var94][var91][var77] - var98;
                                int var100 = field80[var93][var91][var77];
                                class86.method1796(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field678[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field678[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field678[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field678[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label443: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field678[var76][var103 - 1][var107] & var74) == 0) {
                                        break label443;
                                    }
                                }
                                var103--;
                            }
                            label432: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field678[var76][var104 + 1][var108] & var74) == 0) {
                                        break label432;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field80[var76][var103][var105];
                                class86.method1796(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field678[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fr.s(IIII)I")
    public static int method3053(int arg0, int arg1, int arg2) {
        if ((field87[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field87[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("br.w(III)I")
    public static final int method1486(int arg0, int arg1) {
        int var2 = method730(arg0 + 45365, arg1 + 91923, 4) - 128 + (method730(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method730(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ax.e(IIII)I")
    public static final int method730(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2168(var3, var5);
        int var8 = method2168(var3 + 1, var5);
        int var9 = method2168(var3, var5 + 1);
        int var10 = method2168(var3 + 1, var5 + 1);
        int var11 = method3518(var7, var8, var4, arg2);
        int var12 = method3518(var9, var10, var4, arg2);
        return method3518(var11, var12, var6, arg2);
    }

    @ObfuscatedName("gy.z(IIIII)I")
    public static final int method3518(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class91.field1574[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ci.p(III)I")
    public static final int method2168(int arg0, int arg1) {
        int var2 = method988(arg0 - 1, arg1 - 1) + method988(arg0 + 1, arg1 - 1) + method988(arg0 - 1, arg1 + 1) + method988(arg0 + 1, arg1 + 1);
        int var3 = method988(arg0 - 1, arg1) + method988(arg0 + 1, arg1) + method988(arg0, arg1 - 1) + method988(arg0, arg1 + 1);
        int var4 = method988(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ad.r(III)I")
    public static final int method988(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("fr.g(III)I")
    public static final int method3054(int arg0, int arg1) {
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

    @ObfuscatedName("n.n(III)I")
    public static final int method206(int arg0, int arg1) {
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

    @ObfuscatedName("ex.y(IIII)I")
    public static final int method2717(int arg0, int arg1, int arg2) {
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
}
