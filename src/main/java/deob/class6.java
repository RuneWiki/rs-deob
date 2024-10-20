package deob;

@ObfuscatedName("d")
public final class class6 {

    @ObfuscatedName("d.f")
    public static int[][][] field100 = new int[4][105][105];

    @ObfuscatedName("d.u")
    public static byte[][][] field83 = new byte[4][104][104];

    @ObfuscatedName("d.x")
    public static int field84 = 99;

    @ObfuscatedName("d.w")
    public static final int[] field92 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("d.v")
    public static final int[] field93 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("d.y")
    public static final int[] field94 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("d.c")
    public static final int[] field95 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("d.i")
    public static final int[] field96 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("d.a")
    public static final int[] field103 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("d.z")
    public static int field97 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("d.j")
    public static int field99 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.f(B)V")
    public static void method2886() {
        field84 = 99;
        Statics.field85 = new byte[4][104][104];
        Statics.field3181 = new byte[4][104][104];
        Statics.field82 = new byte[4][104][104];
        Statics.field87 = new byte[4][104][104];
        Statics.field287 = new int[4][105][105];
        Statics.field3160 = new byte[4][105][105];
        Statics.field148 = new int[105][105];
        Statics.field104 = new int[104];
        Statics.field88 = new int[104];
        Statics.field86 = new int[104];
        Statics.field91 = new int[104];
        Statics.field888 = new int[104];
    }

    @ObfuscatedName("dp.u(IIIIB)V")
    public static final void method2327(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3160[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field100[0][var5][var4] = field100[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field100[0][var5][var4] = field100[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field100[0][var5][var4] = field100[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field100[0][var5][var4] = field100[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.x([BIIIIIII[Lda;I)V")
    public static final void method2306(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class109[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1909[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class120 var11 = new class120(arg0);
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
                        method2088(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method2088(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.b(IIII)V")
    public static final void method46(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field100[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field100[arg0][arg1][arg2 + var5] = field100[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field100[arg0][arg1 + var6][arg2] = field100[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field100[arg0][arg1 - 1][arg2] != 0) {
            field100[arg0][arg1][arg2] = field100[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field100[arg0][arg1][arg2 - 1] != 0) {
            field100[arg0][arg1][arg2] = field100[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field100[arg0][arg1 - 1][arg2 - 1] != 0) {
            field100[arg0][arg1][arg2] = field100[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cp.l(Ldj;IIIIIII)V")
    public static final void method2088(class120 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2385();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2385();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2385();
                }
            }
            return;
        }
        field83[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2385();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field100[0][arg2][arg3] = -method2986(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field100[arg1][arg2][arg3] = field100[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2385();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field100[0][arg2][arg3] = -var8 * 8;
                } else {
                    field100[arg1][arg2][arg3] = field100[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field3181[arg1][arg2][arg3] = arg0.method2369();
                Statics.field82[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field87[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field83[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field85[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("u.d([BIIB)Z")
    public static final boolean method10(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class120 var4 = new class120(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2398();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2398();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2385() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method2950(var5);
                        if (var13 != 22 || !client.field297 || var16.field956 != 0 || var16.field954 == 1 || var16.field978) {
                            if (!var16.method818()) {
                                client.field348++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2398();
                if (var9 == 0) {
                    break;
                }
                var4.method2385();
            }
        }
    }

    @ObfuscatedName("az.n(IIIIIILco;Lda;I)V")
    public static final void method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, class109 arg7) {
        if (client.field297 && (field83[0][arg1][arg2] & 0x2) == 0 && (field83[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field84) {
            field84 = arg0;
        }
        class41 var8 = class41.method2950(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field938;
            var10 = var8.field946;
        } else {
            var9 = var8.field946;
            var10 = var8.field938;
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
        int[][] var15 = field100[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field956 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field977 == 1) {
            var20 += 256;
        }
        if (var8.method824()) {
            class24 var21 = new class24();
            var21.field605 = arg0;
            var21.field606 = arg1 * 128;
            var21.field607 = arg2 * 128;
            int var22 = var8.field946;
            int var23 = var8.field938;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field938;
                var23 = var8.field946;
            }
            var21.field616 = (arg1 + var22) * 128;
            var21.field617 = (arg2 + var23) * 128;
            var21.field611 = var8.field982;
            var21.field604 = var8.field936 * 128;
            var21.field613 = var8.field983;
            var21.field614 = var8.field984;
            var21.field615 = var8.field985;
            if (var8.field948 != null) {
                var21.field618 = var8;
                var21.method617();
            }
            class24.field609.method3610(var21);
            if (var21.field615 != null) {
                var21.field610 = var21.field613 + (int) (Math.random() * (double) (var21.field614 - var21.field613));
            }
        }
        if (arg5 == 22) {
            if (!client.field297 || var8.field956 != 0 || var8.field954 == 1 || var8.field978) {
                class86 var24;
                if (var8.field960 == -1 && var8.field948 == null) {
                    var24 = var8.method842(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
                }
                arg6.method1836(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field954 == 1 && arg7 != null) {
                    arg7.method2268(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class86 var47;
            if (var8.field960 == -1 && var8.field948 == null) {
                var47 = var8.method842(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            if (var47 != null && arg6.method1990(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field968) {
                int var48 = 15;
                if (var47 instanceof class106) {
                    var48 = ((class106) var47).method2197() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field3160[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field3160[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field954 != 0 && arg7 != null) {
                arg7.method2296(arg1, arg2, var9, var10, var8.field955);
            }
        } else if (arg5 >= 12) {
            class86 var25;
            if (var8.field960 == -1 && var8.field948 == null) {
                var25 = var8.method842(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1990(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field287[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field954 != 0 && arg7 != null) {
                arg7.method2296(arg1, arg2, var9, var10, var8.field955);
            }
        } else if (arg5 == 0) {
            class86 var26;
            if (var8.field960 == -1 && var8.field948 == null) {
                var26 = var8.method842(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, var26, (class86) null, field92[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field968) {
                    Statics.field3160[arg0][arg1][arg2] = 50;
                    Statics.field3160[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field959) {
                    Statics.field287[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field968) {
                    Statics.field3160[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3160[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field959) {
                    Statics.field287[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field968) {
                    Statics.field3160[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3160[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field959) {
                    Statics.field287[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field968) {
                    Statics.field3160[arg0][arg1][arg2] = 50;
                    Statics.field3160[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field959) {
                    Statics.field287[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field954 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, arg5, arg4, var8.field955);
            }
            if (var8.field961 != 16) {
                arg6.method1863(arg0, arg1, arg2, var8.field961);
            }
        } else if (arg5 == 1) {
            class86 var27;
            if (var8.field960 == -1 && var8.field948 == null) {
                var27 = var8.method842(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, var27, (class86) null, field93[arg4], 0, var19, var20);
            if (var8.field968) {
                if (arg4 == 0) {
                    Statics.field3160[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3160[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3160[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3160[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field954 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, arg5, arg4, var8.field955);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class86 var29;
            class86 var30;
            if (var8.field960 == -1 && var8.field948 == null) {
                var29 = var8.method842(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method842(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, var29, var30, field92[arg4], field92[var28], var19, var20);
            if (var8.field959) {
                if (arg4 == 0) {
                    Statics.field287[arg0][arg1][arg2] |= 0x249;
                    Statics.field287[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field287[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field287[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field287[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field287[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field287[arg0][arg1][arg2] |= 0x492;
                    Statics.field287[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field954 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, arg5, arg4, var8.field955);
            }
            if (var8.field961 != 16) {
                arg6.method1863(arg0, arg1, arg2, var8.field961);
            }
        } else if (arg5 == 3) {
            class86 var31;
            if (var8.field960 == -1 && var8.field948 == null) {
                var31 = var8.method842(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, var31, (class86) null, field93[arg4], 0, var19, var20);
            if (var8.field968) {
                if (arg4 == 0) {
                    Statics.field3160[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3160[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3160[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3160[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field954 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, arg5, arg4, var8.field955);
            }
        } else if (arg5 == 9) {
            class86 var32;
            if (var8.field960 == -1 && var8.field948 == null) {
                var32 = var8.method842(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1990(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field954 != 0 && arg7 != null) {
                arg7.method2296(arg1, arg2, var9, var10, var8.field955);
            }
            if (var8.field961 != 16) {
                arg6.method1863(arg0, arg1, arg2, var8.field961);
            }
        } else if (arg5 == 4) {
            class86 var33;
            if (var8.field960 == -1 && var8.field948 == null) {
                var33 = var8.method842(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1930(arg0, arg1, arg2, var16, var33, (class86) null, field92[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1856(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method2950(var35 >> 14 & 0x7FFF).field961;
            }
            class86 var36;
            if (var8.field960 == -1 && var8.field948 == null) {
                var36 = var8.method842(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1930(arg0, arg1, arg2, var16, var36, (class86) null, field92[arg4], 0, field94[arg4] * var34, field95[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1856(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method2950(var38 >> 14 & 0x7FFF).field961 / 2;
            }
            class86 var39;
            if (var8.field960 == -1 && var8.field948 == null) {
                var39 = var8.method842(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1930(arg0, arg1, arg2, var16, var39, (class86) null, 256, arg4, field96[arg4] * var37, field103[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class86 var41;
            if (var8.field960 == -1 && var8.field948 == null) {
                var41 = var8.method842(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1930(arg0, arg1, arg2, var16, var41, (class86) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1856(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method2950(var43 >> 14 & 0x7FFF).field961 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class86 var45;
            class86 var46;
            if (var8.field960 == -1 && var8.field948 == null) {
                var45 = var8.method842(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method842(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field960, true, (class86) null);
            }
            arg6.method1930(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field96[arg4] * var42, field103[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("df.m(Lco;[Lda;I)V")
    public static final void method2655(class87 arg0, class109[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field83[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field83[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2271(var3, var4);
                        }
                    }
                }
            }
        }
        field97 += (int) (Math.random() * 5.0D) - 2;
        if (field97 < -8) {
            field97 = -8;
        }
        if (field97 > 8) {
            field97 = 8;
        }
        field99 += (int) (Math.random() * 5.0D) - 2;
        if (field99 < -16) {
            field99 = -16;
        }
        if (field99 > 16) {
            field99 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field3160[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field100[var6][var11 + 1][var10] - field100[var6][var11 - 1][var10];
                    int var13 = field100[var6][var11][var10 + 1] - field100[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field148[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field104[var20] = 0;
                Statics.field88[var20] = 0;
                Statics.field86[var20] = 0;
                Statics.field91[var20] = 0;
                Statics.field888[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field85[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class42 var26 = (class42) class42.field988.method3530((long) var25);
                            class42 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field994.method3061(1, var25);
                                class42 var29 = new class42();
                                if (var28 != null) {
                                    var29.method852(new class120(var28), var25);
                                }
                                var29.method851();
                                class42.field988.method3521(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field104[var22] += var27.field990;
                            Statics.field88[var22] += var27.field992;
                            Statics.field86[var22] += var27.field995;
                            Statics.field91[var22] += var27.field993;
                            var10002 = Statics.field888[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field85[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class42 var34 = (class42) class42.field988.method3530((long) var33);
                            class42 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field994.method3061(1, var33);
                                class42 var37 = new class42();
                                if (var36 != null) {
                                    var37.method852(new class120(var36), var33);
                                }
                                var37.method851();
                                class42.field988.method3521(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field104[var22] -= var35.field990;
                            Statics.field88[var22] -= var35.field992;
                            Statics.field86[var22] -= var35.field995;
                            Statics.field91[var22] -= var35.field993;
                            var10002 = Statics.field888[var22]--;
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
                            var39 += Statics.field104[var45];
                            var40 += Statics.field88[var45];
                            var41 += Statics.field86[var45];
                            var42 += Statics.field91[var45];
                            var43 += Statics.field888[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field104[var46];
                            var40 -= Statics.field88[var46];
                            var41 -= Statics.field86[var46];
                            var42 -= Statics.field91[var46];
                            var43 -= Statics.field888[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field297 || (field83[0][var21][var44] & 0x2) != 0 || (field83[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field84) {
                                field84 = var6;
                            }
                            int var47 = Statics.field85[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field3181[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field100[var6][var21][var44];
                                int var50 = field100[var6][var21 + 1][var44];
                                int var51 = field100[var6][var21 + 1][var44 + 1];
                                int var52 = field100[var6][var21][var44 + 1];
                                int var53 = Statics.field148[var21][var44];
                                int var54 = Statics.field148[var21 + 1][var44];
                                int var55 = Statics.field148[var21 + 1][var44 + 1];
                                int var56 = Statics.field148[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method2952(var59, var60, var61);
                                    int var62 = field97 + var59 & 0xFF;
                                    int var63 = field99 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method2952(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field82[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class47 var66 = (class47) class47.field1061.method3530((long) var65);
                                        class47 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field1072.method3061(4, var65);
                                            class47 var69 = new class47();
                                            if (var68 != null) {
                                                var69.method977(new class120(var68), var65);
                                            }
                                            var69.method986();
                                            class47.field1061.method3521(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field1065) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field287[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class92.field1594[method1225(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1835(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1225(var57, var53), method1225(var57, var54), method1225(var57, var55), method1225(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field82[var6][var21][var44] + 1;
                                    byte var72 = Statics.field87[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class47 var74 = (class47) class47.field1061.method3530((long) var73);
                                    class47 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field1072.method3061(4, var73);
                                        class47 var77 = new class47();
                                        if (var76 != null) {
                                            var77.method977(new class120(var76), var73);
                                        }
                                        var77.method986();
                                        class47.field1061.method3521(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field1063;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1595.method2065(var79);
                                        var81 = -1;
                                    } else if (var75.field1060 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method2952(var75.field1066, var75.field1067, var75.field1068);
                                        int var82 = field97 + var75.field1066 & 0xFF;
                                        int var83 = field99 + var75.field1068;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method2952(var82, var75.field1067, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class92.field1594[method1585(var80, 96)];
                                    }
                                    if (var75.field1074 != -1) {
                                        int var85 = field97 + var75.field1069 & 0xFF;
                                        int var86 = field99 + var75.field1071;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method2952(var85, var75.field1062, var86);
                                        var84 = class92.field1594[method1585(var87, 96)];
                                    }
                                    arg0.method1835(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method1225(var57, var53), method1225(var57, var54), method1225(var57, var55), method1225(var57, var56), method1585(var81, var53), method1585(var81, var54), method1585(var81, var55), method1585(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    int var94;
                    if ((field83[var6][var89][var88] & 0x8) != 0) {
                        var94 = 0;
                    } else if (var6 <= 0 || (field83[1][var89][var88] & 0x2) == 0) {
                        var94 = var6;
                    } else {
                        var94 = var6 - 1;
                    }
                    arg0.method1904(var6, var89, var88, var94);
                }
            }
            Statics.field85[var6] = (byte[][]) null;
            Statics.field3181[var6] = (byte[][]) null;
            Statics.field82[var6] = (byte[][]) null;
            Statics.field87[var6] = (byte[][]) null;
            Statics.field3160[var6] = (byte[][]) null;
        }
        arg0.method1861(-50, -10, -50);
        for (int var95 = 0; var95 < 104; var95++) {
            for (int var96 = 0; var96 < 104; var96++) {
                if ((field83[1][var95][var96] & 0x2) == 2) {
                    arg0.method1832(var95, var96);
                }
            }
        }
        int var97 = 1;
        int var98 = 2;
        int var99 = 4;
        for (int var100 = 0; var100 < 4; var100++) {
            if (var100 > 0) {
                var97 <<= 0x3;
                var98 <<= 0x3;
                var99 <<= 0x3;
            }
            for (int var101 = 0; var101 <= var100; var101++) {
                for (int var102 = 0; var102 <= 104; var102++) {
                    for (int var103 = 0; var103 <= 104; var103++) {
                        if ((Statics.field287[var101][var103][var102] & var97) != 0) {
                            int var104 = var102;
                            int var105 = var102;
                            int var106 = var101;
                            int var107 = var101;
                            while (var104 > 0 && (Statics.field287[var101][var103][var104 - 1] & var97) != 0) {
                                var104--;
                            }
                            while (var105 < 104 && (Statics.field287[var101][var103][var105 + 1] & var97) != 0) {
                                var105++;
                            }
                            label379: while (var106 > 0) {
                                for (int var108 = var104; var108 <= var105; var108++) {
                                    if ((Statics.field287[var106 - 1][var103][var108] & var97) == 0) {
                                        break label379;
                                    }
                                }
                                var106--;
                            }
                            label368: while (var107 < var100) {
                                for (int var109 = var104; var109 <= var105; var109++) {
                                    if ((Statics.field287[var107 + 1][var103][var109] & var97) == 0) {
                                        break label368;
                                    }
                                }
                                var107++;
                            }
                            int var110 = (var107 + 1 - var106) * (var105 - var104 + 1);
                            if (var110 >= 8) {
                                short var111 = 240;
                                int var112 = field100[var107][var103][var104] - var111;
                                int var113 = field100[var106][var103][var104];
                                class87.method1955(var100, 1, var103 * 128, var103 * 128, var104 * 128, var105 * 128 + 128, var112, var113);
                                for (int var114 = var106; var114 <= var107; var114++) {
                                    for (int var115 = var104; var115 <= var105; var115++) {
                                        Statics.field287[var114][var103][var115] &= ~var97;
                                    }
                                }
                            }
                        }
                        if ((Statics.field287[var101][var103][var102] & var98) != 0) {
                            int var116 = var103;
                            int var117 = var103;
                            int var118 = var101;
                            int var119 = var101;
                            while (var116 > 0 && (Statics.field287[var101][var116 - 1][var102] & var98) != 0) {
                                var116--;
                            }
                            while (var117 < 104 && (Statics.field287[var101][var117 + 1][var102] & var98) != 0) {
                                var117++;
                            }
                            label432: while (var118 > 0) {
                                for (int var120 = var116; var120 <= var117; var120++) {
                                    if ((Statics.field287[var118 - 1][var120][var102] & var98) == 0) {
                                        break label432;
                                    }
                                }
                                var118--;
                            }
                            label421: while (var119 < var100) {
                                for (int var121 = var116; var121 <= var117; var121++) {
                                    if ((Statics.field287[var119 + 1][var121][var102] & var98) == 0) {
                                        break label421;
                                    }
                                }
                                var119++;
                            }
                            int var122 = (var119 + 1 - var118) * (var117 - var116 + 1);
                            if (var122 >= 8) {
                                short var123 = 240;
                                int var124 = field100[var119][var116][var102] - var123;
                                int var125 = field100[var118][var116][var102];
                                class87.method1955(var100, 2, var116 * 128, var117 * 128 + 128, var102 * 128, var102 * 128, var124, var125);
                                for (int var126 = var118; var126 <= var119; var126++) {
                                    for (int var127 = var116; var127 <= var117; var127++) {
                                        Statics.field287[var126][var127][var102] &= ~var98;
                                    }
                                }
                            }
                        }
                        if ((Statics.field287[var101][var103][var102] & var99) != 0) {
                            int var128 = var103;
                            int var129 = var103;
                            int var130 = var102;
                            int var131 = var102;
                            while (var130 > 0 && (Statics.field287[var101][var103][var130 - 1] & var99) != 0) {
                                var130--;
                            }
                            while (var131 < 104 && (Statics.field287[var101][var103][var131 + 1] & var99) != 0) {
                                var131++;
                            }
                            label485: while (var128 > 0) {
                                for (int var132 = var130; var132 <= var131; var132++) {
                                    if ((Statics.field287[var101][var128 - 1][var132] & var99) == 0) {
                                        break label485;
                                    }
                                }
                                var128--;
                            }
                            label474: while (var129 < 104) {
                                for (int var133 = var130; var133 <= var131; var133++) {
                                    if ((Statics.field287[var101][var129 + 1][var133] & var99) == 0) {
                                        break label474;
                                    }
                                }
                                var129++;
                            }
                            if ((var129 - var128 + 1) * (var131 - var130 + 1) >= 4) {
                                int var134 = field100[var101][var128][var130];
                                class87.method1955(var100, 4, var128 * 128, var129 * 128 + 128, var130 * 128, var131 * 128 + 128, var134, var134);
                                for (int var135 = var128; var135 <= var129; var135++) {
                                    for (int var136 = var130; var136 <= var131; var136++) {
                                        Statics.field287[var101][var135][var136] &= ~var99;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fv.g(III)I")
    public static final int method2986(int arg0, int arg1) {
        int var2 = method2961(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2961(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2961(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ed.s(IIII)I")
    public static final int method2961(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method106(var3, var5);
        int var8 = method106(var3 + 1, var5);
        int var9 = method106(var3, var5 + 1);
        int var10 = method106(var3 + 1, var5 + 1);
        int var11 = method672(var7, var8, var4, arg2);
        int var12 = method672(var9, var10, var4, arg2);
        int var13 = 65536 - class92.field1578[var6 * 1024 / arg2] >> 1;
        return ((65536 - var13) * var11 >> 16) + (var12 * var13 >> 16);
    }

    @ObfuscatedName("ag.r(IIIII)I")
    public static final int method672(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class92.field1578[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("m.k(III)I")
    public static final int method106(int arg0, int arg1) {
        int var2 = method2083(arg0 - 1, arg1 - 1) + method2083(arg0 + 1, arg1 - 1) + method2083(arg0 - 1, arg1 + 1) + method2083(arg0 + 1, arg1 + 1);
        int var3 = method2083(arg0 - 1, arg1) + method2083(arg0 + 1, arg1) + method2083(arg0, arg1 - 1) + method2083(arg0, arg1 + 1);
        int var4 = method2083(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cs.o(III)I")
    public static final int method2083(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bq.q(III)I")
    public static final int method1225(int arg0, int arg1) {
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

    @ObfuscatedName("bu.p(III)I")
    public static final int method1585(int arg0, int arg1) {
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

    @ObfuscatedName("er.h(IIII)I")
    public static final int method2952(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ad.e(IIIIIIILco;Lda;I)V")
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class87 arg7, class109 arg8) {
        class41 var9 = class41.method2950(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field938;
            var11 = var9.field946;
        } else {
            var10 = var9.field946;
            var11 = var9.field938;
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
        int[][] var16 = field100[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field956 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field977 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class86 var22;
            if (var9.field960 == -1 && var9.field948 == null) {
                var22 = var9.method820(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1836(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field954 == 1) {
                arg8.method2268(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class86 var45;
            if (var9.field960 == -1 && var9.field948 == null) {
                var45 = var9.method820(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            if (var45 != null) {
                arg7.method1990(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field954 != 0) {
                arg8.method2296(arg2, arg3, var10, var11, var9.field955);
            }
        } else if (arg6 >= 12) {
            class86 var23;
            if (var9.field960 == -1 && var9.field948 == null) {
                var23 = var9.method820(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1990(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field954 != 0) {
                arg8.method2296(arg2, arg3, var10, var11, var9.field955);
            }
        } else if (arg6 == 0) {
            class86 var24;
            if (var9.field960 == -1 && var9.field948 == null) {
                var24 = var9.method820(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1926(arg0, arg2, arg3, var17, var24, (class86) null, field92[arg5], 0, var20, var21);
            if (var9.field954 != 0) {
                arg8.method2267(arg2, arg3, arg6, arg5, var9.field955);
            }
        } else if (arg6 == 1) {
            class86 var25;
            if (var9.field960 == -1 && var9.field948 == null) {
                var25 = var9.method820(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1926(arg0, arg2, arg3, var17, var25, (class86) null, field93[arg5], 0, var20, var21);
            if (var9.field954 != 0) {
                arg8.method2267(arg2, arg3, arg6, arg5, var9.field955);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class86 var27;
            class86 var28;
            if (var9.field960 == -1 && var9.field948 == null) {
                var27 = var9.method820(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method820(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field960, true, (class86) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1926(arg0, arg2, arg3, var17, var27, var28, field92[arg5], field92[var26], var20, var21);
            if (var9.field954 != 0) {
                arg8.method2267(arg2, arg3, arg6, arg5, var9.field955);
            }
        } else if (arg6 == 3) {
            class86 var29;
            if (var9.field960 == -1 && var9.field948 == null) {
                var29 = var9.method820(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1926(arg0, arg2, arg3, var17, var29, (class86) null, field93[arg5], 0, var20, var21);
            if (var9.field954 != 0) {
                arg8.method2267(arg2, arg3, arg6, arg5, var9.field955);
            }
        } else if (arg6 == 9) {
            class86 var30;
            if (var9.field960 == -1 && var9.field948 == null) {
                var30 = var9.method820(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1990(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field954 != 0) {
                arg8.method2296(arg2, arg3, var10, var11, var9.field955);
            }
        } else if (arg6 == 4) {
            class86 var31;
            if (var9.field960 == -1 && var9.field948 == null) {
                var31 = var9.method820(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1930(arg0, arg2, arg3, var17, var31, (class86) null, field92[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1856(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class41.method2950(var33 >> 14 & 0x7FFF).field961;
            }
            class86 var34;
            if (var9.field960 == -1 && var9.field948 == null) {
                var34 = var9.method820(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1930(arg0, arg2, arg3, var17, var34, (class86) null, field92[arg5], 0, field94[arg5] * var32, field95[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1856(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class41.method2950(var36 >> 14 & 0x7FFF).field961 / 2;
            }
            class86 var37;
            if (var9.field960 == -1 && var9.field948 == null) {
                var37 = var9.method820(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1930(arg0, arg2, arg3, var17, var37, (class86) null, 256, arg5, field96[arg5] * var35, field103[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class86 var39;
            if (var9.field960 == -1 && var9.field948 == null) {
                var39 = var9.method820(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1930(arg0, arg2, arg3, var17, var39, (class86) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1856(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class41.method2950(var41 >> 14 & 0x7FFF).field961 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class86 var43;
            class86 var44;
            if (var9.field960 == -1 && var9.field948 == null) {
                var43 = var9.method820(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method820(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field960, true, (class86) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field960, true, (class86) null);
            }
            arg7.method1930(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field96[arg5] * var40, field103[arg5] * var40, var20, var21);
        }
    }
}
