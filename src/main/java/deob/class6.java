package deob;

@ObfuscatedName("q")
public final class class6 {

    @ObfuscatedName("q.n")
    public static int[][][] field89 = new int[4][105][105];

    @ObfuscatedName("q.x")
    public static byte[][][] field85 = new byte[4][104][104];

    @ObfuscatedName("q.k")
    public static int field86 = 99;

    @ObfuscatedName("q.t")
    public static final int[] field91 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("q.f")
    public static final int[] field92 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("q.g")
    public static final int[] field93 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("q.s")
    public static final int[] field94 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("q.y")
    public static final int[] field95 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("q.p")
    public static final int[] field96 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("q.b")
    public static int field97 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("q.l")
    public static int field101 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.n(B)V")
    public static void method4() {
        field86 = 99;
        Statics.field87 = new byte[4][104][104];
        Statics.field2477 = new byte[4][104][104];
        Statics.field2128 = new byte[4][104][104];
        Statics.field2969 = new byte[4][104][104];
        Statics.field725 = new int[4][105][105];
        Statics.field99 = new byte[4][105][105];
        Statics.field978 = new int[105][105];
        Statics.field1507 = new int[104];
        Statics.field1508 = new int[104];
        Statics.field1503 = new int[104];
        Statics.field1877 = new int[104];
        Statics.field994 = new int[104];
    }

    @ObfuscatedName("q.x(IIIII)V")
    public static final void method81(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field99[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field89[0][var5][var4] = field89[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field89[0][var5][var4] = field89[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field89[0][var5][var4] = field89[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field89[0][var5][var4] = field89[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.k(IIII)V")
    public static final void method160(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field89[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field89[arg0][arg1][arg2 + var5] = field89[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field89[arg0][arg1 + var6][arg2] = field89[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field89[arg0][arg1 - 1][arg2] != 0) {
            field89[arg0][arg1][arg2] = field89[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field89[arg0][arg1][arg2 - 1] != 0) {
            field89[arg0][arg1][arg2] = field89[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field89[arg0][arg1 - 1][arg2 - 1] != 0) {
            field89[arg0][arg1][arg2] = field89[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ao.i(Ldw;IIIIIII)V")
    public static final void method824(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2148();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2148();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2148();
                }
            }
            return;
        }
        field85[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2148();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field89[0][arg2][arg3] = -method710(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field89[arg1][arg2][arg3] = field89[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2148();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field89[0][arg2][arg3] = -var8 * 8;
                } else {
                    field89[arg1][arg2][arg3] = field89[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2477[arg1][arg2][arg3] = arg0.method2175();
                Statics.field2128[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2969[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field85[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field87[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ba.d([BIIB)Z")
    public static final boolean method1374(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class107 var4 = new class107(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2131();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2131();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2148() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class36 var16 = class36.method2071(var5);
                        if (var13 != 22 || !client.field262 || var16.field885 != 0 || var16.field854 == 1 || var16.field878) {
                            if (!var16.method678()) {
                                client.field378++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2131();
                if (var9 == 0) {
                    break;
                }
                var4.method2148();
            }
        }
    }

    @ObfuscatedName("client.q(IIIIIILcr;Lgy;I)V")
    public static final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class198 arg7) {
        if (client.field262 && (field85[0][arg1][arg2] & 0x2) == 0) {
            if ((field85[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1605(arg0, arg1, arg2) != client.field313) {
                return;
            }
        }
        if (arg0 < field86) {
            field86 = arg0;
        }
        class36 var8 = class36.method2071(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field860;
            var10 = var8.field855;
        } else {
            var9 = var8.field855;
            var10 = var8.field860;
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
        int[][] var15 = field89[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field885 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field880 == 1) {
            var20 += 256;
        }
        if (var8.method663()) {
            class20 var21 = new class20();
            var21.field563 = arg0;
            var21.field556 = arg1 * 128;
            var21.field557 = arg2 * 128;
            int var22 = var8.field855;
            int var23 = var8.field860;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field860;
                var23 = var8.field855;
            }
            var21.field558 = (arg1 + var22) * 128;
            var21.field555 = (arg2 + var23) * 128;
            var21.field561 = var8.field884;
            var21.field560 = var8.field886 * 128;
            var21.field559 = var8.field879;
            var21.field564 = var8.field887;
            var21.field562 = var8.field888;
            if (var8.field865 != null) {
                var21.field568 = var8;
                var21.method496();
            }
            class20.field571.method3181(var21);
            if (var21.field562 != null) {
                var21.field566 = var21.field559 + (int) (Math.random() * (double) (var21.field564 - var21.field559));
            }
        }
        if (arg5 == 22) {
            if (!client.field262 || var8.field885 != 0 || var8.field854 == 1 || var8.field878) {
                class78 var24;
                if (var8.field863 == -1 && var8.field865 == null) {
                    var24 = var8.method666(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field863, true, (class78) null);
                }
                arg6.method1620(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field854 == 1 && arg7 != null) {
                    arg7.method3442(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var47;
            if (var8.field863 == -1 && var8.field865 == null) {
                var47 = var8.method666(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            if (var47 != null && arg6.method1661(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field871) {
                int var48 = 15;
                if (var47 instanceof class98) {
                    var48 = ((class98) var47).method1992() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field99[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field99[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3441(arg1, arg2, var9, var10, var8.field856);
            }
        } else if (arg5 >= 12) {
            class78 var25;
            if (var8.field863 == -1 && var8.field865 == null) {
                var25 = var8.method666(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1661(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field725[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3441(arg1, arg2, var9, var10, var8.field856);
            }
        } else if (arg5 == 0) {
            class78 var26;
            if (var8.field863 == -1 && var8.field865 == null) {
                var26 = var8.method666(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1622(arg0, arg1, arg2, var16, var26, (class78) null, field91[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field871) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field875) {
                    Statics.field725[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field871) {
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field875) {
                    Statics.field725[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field871) {
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field875) {
                    Statics.field725[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field871) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field875) {
                    Statics.field725[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3432(arg1, arg2, arg5, arg4, var8.field856);
            }
            if (var8.field864 != 16) {
                arg6.method1634(arg0, arg1, arg2, var8.field864);
            }
        } else if (arg5 == 1) {
            class78 var27;
            if (var8.field863 == -1 && var8.field865 == null) {
                var27 = var8.method666(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1622(arg0, arg1, arg2, var16, var27, (class78) null, field92[arg4], 0, var19, var20);
            if (var8.field871) {
                if (arg4 == 0) {
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3432(arg1, arg2, arg5, arg4, var8.field856);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class78 var29;
            class78 var30;
            if (var8.field863 == -1 && var8.field865 == null) {
                var29 = var8.method666(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method666(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field863, true, (class78) null);
                var30 = new class11(arg3, 2, var28, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1622(arg0, arg1, arg2, var16, var29, var30, field91[arg4], field91[var28], var19, var20);
            if (var8.field875) {
                if (arg4 == 0) {
                    Statics.field725[arg0][arg1][arg2] |= 0x249;
                    Statics.field725[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field725[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field725[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field725[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field725[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field725[arg0][arg1][arg2] |= 0x492;
                    Statics.field725[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3432(arg1, arg2, arg5, arg4, var8.field856);
            }
            if (var8.field864 != 16) {
                arg6.method1634(arg0, arg1, arg2, var8.field864);
            }
        } else if (arg5 == 3) {
            class78 var31;
            if (var8.field863 == -1 && var8.field865 == null) {
                var31 = var8.method666(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1622(arg0, arg1, arg2, var16, var31, (class78) null, field92[arg4], 0, var19, var20);
            if (var8.field871) {
                if (arg4 == 0) {
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3432(arg1, arg2, arg5, arg4, var8.field856);
            }
        } else if (arg5 == 9) {
            class78 var32;
            if (var8.field863 == -1 && var8.field865 == null) {
                var32 = var8.method666(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1661(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3441(arg1, arg2, var9, var10, var8.field856);
            }
            if (var8.field864 != 16) {
                arg6.method1634(arg0, arg1, arg2, var8.field864);
            }
        } else if (arg5 == 4) {
            class78 var33;
            if (var8.field863 == -1 && var8.field865 == null) {
                var33 = var8.method666(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, var33, (class78) null, field91[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1682(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class36.method2071(var35 >> 14 & 0x7FFF).field864;
            }
            class78 var36;
            if (var8.field863 == -1 && var8.field865 == null) {
                var36 = var8.method666(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, var36, (class78) null, field91[arg4], 0, field93[arg4] * var34, field94[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1682(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class36.method2071(var38 >> 14 & 0x7FFF).field864 / 2;
            }
            class78 var39;
            if (var8.field863 == -1 && var8.field865 == null) {
                var39 = var8.method666(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, var39, (class78) null, 256, arg4, field95[arg4] * var37, field96[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class78 var41;
            if (var8.field863 == -1 && var8.field865 == null) {
                var41 = var8.method666(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class11(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, var41, (class78) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1682(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class36.method2071(var43 >> 14 & 0x7FFF).field864 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class78 var45;
            class78 var46;
            if (var8.field863 == -1 && var8.field865 == null) {
                var45 = var8.method666(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method666(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field863, true, (class78) null);
                var46 = new class11(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field863, true, (class78) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field95[arg4] * var42, field96[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("bt.m(Lcr;[Lgy;I)V")
    public static final void method1322(class79 arg0, class198[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field85[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field85[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3434(var3, var4);
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
        field101 += (int) (Math.random() * 5.0D) - 2;
        if (field101 < -16) {
            field101 = -16;
        }
        if (field101 > 16) {
            field101 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field99[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field89[var6][var11 + 1][var10] - field89[var6][var11 - 1][var10];
                    int var13 = field89[var6][var11][var10 + 1] - field89[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field978[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1507[var20] = 0;
                Statics.field1508[var20] = 0;
                Statics.field1503[var20] = 0;
                Statics.field1877[var20] = 0;
                Statics.field994[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field87[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class37 var25 = class37.method155(var24 - 1);
                            Statics.field1507[var22] += var25.field892;
                            Statics.field1508[var22] += var25.field893;
                            Statics.field1503[var22] += var25.field894;
                            Statics.field1877[var22] += var25.field889;
                            var10002 = Statics.field994[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field87[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class37 var28 = class37.method155(var27 - 1);
                            Statics.field1507[var22] -= var28.field892;
                            Statics.field1508[var22] -= var28.field893;
                            Statics.field1503[var22] -= var28.field894;
                            Statics.field1877[var22] -= var28.field889;
                            var10002 = Statics.field994[var22]--;
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
                            var29 += Statics.field1507[var35];
                            var30 += Statics.field1508[var35];
                            var31 += Statics.field1503[var35];
                            var32 += Statics.field1877[var35];
                            var33 += Statics.field994[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field1507[var36];
                            var30 -= Statics.field1508[var36];
                            var31 -= Statics.field1503[var36];
                            var32 -= Statics.field1877[var36];
                            var33 -= Statics.field994[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field262 || (field85[0][var21][var34] & 0x2) != 0 || (field85[var6][var21][var34] & 0x10) == 0 && method1605(var6, var21, var34) == client.field313)) {
                            if (var6 < field86) {
                                field86 = var6;
                            }
                            int var37 = Statics.field87[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field2477[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field89[var6][var21][var34];
                                int var40 = field89[var6][var21 + 1][var34];
                                int var41 = field89[var6][var21 + 1][var34 + 1];
                                int var42 = field89[var6][var21][var34 + 1];
                                int var43 = Statics.field978[var21][var34];
                                int var44 = Statics.field978[var21 + 1][var34];
                                int var45 = Statics.field978[var21 + 1][var34 + 1];
                                int var46 = Statics.field978[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method617(var49, var50, var51);
                                    int var52 = field97 + var49 & 0xFF;
                                    int var53 = field101 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method617(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field2128[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class41.method613(var38 - 1).field957) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field725[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class84.field1462[method1876(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1666(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method1876(var47, var43), method1876(var47, var44), method1876(var47, var45), method1876(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field2128[var6][var21][var34] + 1;
                                    byte var57 = Statics.field2969[var6][var21][var34];
                                    class41 var58 = class41.method613(var38 - 1);
                                    int var59 = var58.field953;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1463.method1838(var59);
                                        var61 = -1;
                                    } else if (var58.field955 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method617(var58.field959, var58.field956, var58.field961);
                                        int var62 = field97 + var58.field959 & 0xFF;
                                        int var63 = field101 + var58.field961;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method617(var62, var58.field956, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class84.field1462[method2079(var60, 96)];
                                    }
                                    if (var58.field954 != -1) {
                                        int var65 = field97 + var58.field962 & 0xFF;
                                        int var66 = field101 + var58.field964;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method617(var65, var58.field963, var66);
                                        var64 = class84.field1462[method2079(var67, 96)];
                                    }
                                    arg0.method1666(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method1876(var47, var43), method1876(var47, var44), method1876(var47, var45), method1876(var47, var46), method2079(var61, var43), method2079(var61, var44), method2079(var61, var45), method2079(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method1618(var6, var69, var68, method1605(var6, var69, var68));
                }
            }
            Statics.field87[var6] = (byte[][]) null;
            Statics.field2477[var6] = (byte[][]) null;
            Statics.field2128[var6] = (byte[][]) null;
            Statics.field2969[var6] = (byte[][]) null;
            Statics.field99[var6] = (byte[][]) null;
        }
        arg0.method1645(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field85[1][var70][var71] & 0x2) == 2) {
                    arg0.method1624(var70, var71);
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
                        if ((Statics.field725[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field725[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field725[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label339: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field725[var81 - 1][var78][var83] & var72) == 0) {
                                        break label339;
                                    }
                                }
                                var81--;
                            }
                            label328: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field725[var82 + 1][var78][var84] & var72) == 0) {
                                        break label328;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field89[var82][var78][var79] - var86;
                                int var88 = field89[var81][var78][var79];
                                class79.method1617(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field725[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field725[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field725[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field725[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label392: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field725[var93 - 1][var95][var77] & var73) == 0) {
                                        break label392;
                                    }
                                }
                                var93--;
                            }
                            label381: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field725[var94 + 1][var96][var77] & var73) == 0) {
                                        break label381;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field89[var94][var91][var77] - var98;
                                int var100 = field89[var93][var91][var77];
                                class79.method1617(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field725[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field725[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field725[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field725[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label445: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field725[var76][var103 - 1][var107] & var74) == 0) {
                                        break label445;
                                    }
                                }
                                var103--;
                            }
                            label434: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field725[var76][var104 + 1][var108] & var74) == 0) {
                                        break label434;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field89[var76][var103][var105];
                                class79.method1617(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field725[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.a(IIIB)I")
    public static int method1605(int arg0, int arg1, int arg2) {
        if ((field85[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field85[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ai.w(IIB)I")
    public static final int method710(int arg0, int arg1) {
        int var2 = method3105(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3105(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3105(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("fb.e(IIIB)I")
    public static final int method3105(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method131(var3, var5);
        int var8 = method131(var3 + 1, var5);
        int var9 = method131(var3, var5 + 1);
        int var10 = method131(var3 + 1, var5 + 1);
        int var11 = Statics.method2402(var7, var8, var4, arg2);
        int var12 = Statics.method2402(var9, var10, var4, arg2);
        return Statics.method2402(var11, var12, var6, arg2);
    }

    @ObfuscatedName("e.v(III)I")
    public static final int method131(int arg0, int arg1) {
        int var2 = method2775(arg0 - 1, arg1 - 1) + method2775(arg0 + 1, arg1 - 1) + method2775(arg0 - 1, arg1 + 1) + method2775(arg0 + 1, arg1 + 1);
        int var3 = method2775(arg0 - 1, arg1) + method2775(arg0 + 1, arg1) + method2775(arg0, arg1 - 1) + method2775(arg0, arg1 + 1);
        int var4 = method2775(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ez.z(III)I")
    public static final int method2775(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cn.j(III)I")
    public static final int method1876(int arg0, int arg1) {
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

    @ObfuscatedName("cf.r(III)I")
    public static final int method2079(int arg0, int arg1) {
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

    @ObfuscatedName("av.c(IIIB)I")
    public static final int method617(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("aw.u(IIB)Z")
    public static final boolean method596(int arg0, int arg1) {
        class36 var2 = class36.method2071(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method664(arg1);
    }

    @ObfuscatedName("f.h(IIIIIIILcr;Lgy;I)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class79 arg7, class198 arg8) {
        class36 var9 = class36.method2071(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field860;
            var11 = var9.field855;
        } else {
            var10 = var9.field855;
            var11 = var9.field860;
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
        int[][] var16 = field89[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field885 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field880 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class78 var22;
            if (var9.field863 == -1 && var9.field865 == null) {
                var22 = var9.method667(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class11(arg4, 22, arg5, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1620(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field854 == 1) {
                arg8.method3442(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var45;
            if (var9.field863 == -1 && var9.field865 == null) {
                var45 = var9.method667(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg4, 10, arg5, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            if (var45 != null) {
                arg7.method1661(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field854 != 0) {
                arg8.method3441(arg2, arg3, var10, var11, var9.field856);
            }
        } else if (arg6 >= 12) {
            class78 var23;
            if (var9.field863 == -1 && var9.field865 == null) {
                var23 = var9.method667(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1661(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3441(arg2, arg3, var10, var11, var9.field856);
            }
        } else if (arg6 == 0) {
            class78 var24;
            if (var9.field863 == -1 && var9.field865 == null) {
                var24 = var9.method667(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg4, 0, arg5, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1622(arg0, arg2, arg3, var17, var24, (class78) null, field91[arg5], 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3432(arg2, arg3, arg6, arg5, var9.field856);
            }
        } else if (arg6 == 1) {
            class78 var25;
            if (var9.field863 == -1 && var9.field865 == null) {
                var25 = var9.method667(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg4, 1, arg5, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1622(arg0, arg2, arg3, var17, var25, (class78) null, field92[arg5], 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3432(arg2, arg3, arg6, arg5, var9.field856);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class78 var27;
            class78 var28;
            if (var9.field863 == -1 && var9.field865 == null) {
                var27 = var9.method667(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method667(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field863, true, (class78) null);
                var28 = new class11(arg4, 2, var26, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1622(arg0, arg2, arg3, var17, var27, var28, field91[arg5], field91[var26], var20, var21);
            if (var9.field854 != 0) {
                arg8.method3432(arg2, arg3, arg6, arg5, var9.field856);
            }
        } else if (arg6 == 3) {
            class78 var29;
            if (var9.field863 == -1 && var9.field865 == null) {
                var29 = var9.method667(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg4, 3, arg5, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1622(arg0, arg2, arg3, var17, var29, (class78) null, field92[arg5], 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3432(arg2, arg3, arg6, arg5, var9.field856);
            }
        } else if (arg6 == 9) {
            class78 var30;
            if (var9.field863 == -1 && var9.field865 == null) {
                var30 = var9.method667(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1661(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3441(arg2, arg3, var10, var11, var9.field856);
            }
        } else if (arg6 == 4) {
            class78 var31;
            if (var9.field863 == -1 && var9.field865 == null) {
                var31 = var9.method667(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1623(arg0, arg2, arg3, var17, var31, (class78) null, field91[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1682(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class36.method2071(var33 >> 14 & 0x7FFF).field864;
            }
            class78 var34;
            if (var9.field863 == -1 && var9.field865 == null) {
                var34 = var9.method667(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1623(arg0, arg2, arg3, var17, var34, (class78) null, field91[arg5], 0, field93[arg5] * var32, field94[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1682(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class36.method2071(var36 >> 14 & 0x7FFF).field864 / 2;
            }
            class78 var37;
            if (var9.field863 == -1 && var9.field865 == null) {
                var37 = var9.method667(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1623(arg0, arg2, arg3, var17, var37, (class78) null, 256, arg5, field95[arg5] * var35, field96[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class78 var39;
            if (var9.field863 == -1 && var9.field865 == null) {
                var39 = var9.method667(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1623(arg0, arg2, arg3, var17, var39, (class78) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1682(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class36.method2071(var41 >> 14 & 0x7FFF).field864 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class78 var43;
            class78 var44;
            if (var9.field863 == -1 && var9.field865 == null) {
                var43 = var9.method667(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method667(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field863, true, (class78) null);
                var44 = new class11(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field863, true, (class78) null);
            }
            arg7.method1623(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field95[arg5] * var40, field96[arg5] * var40, var20, var21);
        }
    }
}
