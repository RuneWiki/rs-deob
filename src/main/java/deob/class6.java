package deob;

@ObfuscatedName("e")
public final class class6 {

    @ObfuscatedName("e.j")
    public static int[][][] field92 = new int[4][105][105];

    @ObfuscatedName("e.z")
    public static byte[][][] field87 = new byte[4][104][104];

    @ObfuscatedName("e.y")
    public static int field90 = 99;

    @ObfuscatedName("e.s")
    public static final int[] field80 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("e.m")
    public static final int[] field81 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("e.v")
    public static final int[] field82 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("e.u")
    public static final int[] field73 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("e.p")
    public static final int[] field84 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("e.l")
    public static final int[] field85 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("e.w")
    public static int field76 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("e.x")
    public static int field94 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.j(I)V")
    public static void method26() {
        field90 = 99;
        Statics.field2888 = new byte[4][104][104];
        Statics.field93 = new byte[4][104][104];
        Statics.field77 = new byte[4][104][104];
        Statics.field2001 = new byte[4][104][104];
        Statics.field138 = new int[4][105][105];
        Statics.field78 = new byte[4][105][105];
        Statics.field2496 = new int[105][105];
        Statics.field79 = new int[104];
        Statics.field1351 = new int[104];
        Statics.field975 = new int[104];
        Statics.field2955 = new int[104];
        Statics.field1124 = new int[104];
    }

    @ObfuscatedName("u.z(S)V")
    public static void method468() {
        Statics.field2888 = (byte[][][]) null;
        Statics.field93 = (byte[][][]) null;
        Statics.field77 = (byte[][][]) null;
        Statics.field2001 = (byte[][][]) null;
        Statics.field138 = (int[][][]) null;
        Statics.field78 = (byte[][][]) null;
        Statics.field2496 = (int[][]) null;
        Statics.field79 = null;
        Statics.field1351 = null;
        Statics.field975 = null;
        Statics.field2955 = null;
        Statics.field1124 = null;
    }

    @ObfuscatedName("gx.y(IIIII)V")
    public static final void method3321(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field78[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field92[0][var5][var4] = field92[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field92[0][var5][var4] = field92[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field92[0][var5][var4] = field92[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field92[0][var5][var4] = field92[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dg.h(IIII)V")
    public static final void method2488(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field92[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field92[arg0][arg1][arg2 + var5] = field92[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field92[arg0][arg1 + var6][arg2] = field92[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field92[arg0][arg1 - 1][arg2] != 0) {
            field92[arg0][arg1][arg2] = field92[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field92[arg0][arg1][arg2 - 1] != 0) {
            field92[arg0][arg1][arg2] = field92[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field92[arg0][arg1 - 1][arg2 - 1] != 0) {
            field92[arg0][arg1][arg2] = field92[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("h.e([BIILcc;[Lgn;B)V")
    public static final void method36(byte[] arg0, int arg1, int arg2, class79 arg3, class195[] arg4) {
        class107 var5 = new class107(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2197();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2197();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2130();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field87[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class195 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method731(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ad.k(IIIIIILcc;Lgn;B)V")
    public static final void method731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class195 arg7) {
        if (client.field407 && (field87[0][arg1][arg2] & 0x2) == 0) {
            if ((field87[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2699(arg0, arg1, arg2) != client.field400) {
                return;
            }
        }
        if (arg0 < field90) {
            field90 = arg0;
        }
        class36 var8 = class36.method2079(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field854;
            var10 = var8.field878;
        } else {
            var9 = var8.field878;
            var10 = var8.field854;
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
        int[][] var15 = field92[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field858 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field879 == 1) {
            var20 += 256;
        }
        if (var8.method637()) {
            class20 var21 = new class20();
            var21.field554 = arg0;
            var21.field552 = arg1 * 128;
            var21.field553 = arg2 * 128;
            int var22 = var8.field878;
            int var23 = var8.field854;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field854;
                var23 = var8.field878;
            }
            var21.field564 = (arg1 + var22) * 128;
            var21.field555 = (arg2 + var23) * 128;
            var21.field551 = var8.field883;
            var21.field556 = var8.field884 * 128;
            var21.field567 = var8.field885;
            var21.field557 = var8.field886;
            var21.field561 = var8.field887;
            if (var8.field880 != null) {
                var21.field565 = var8;
                var21.method452();
            }
            class20.field560.method3253(var21);
            if (var21.field561 != null) {
                var21.field562 = var21.field567 + (int) (Math.random() * (double) (var21.field557 - var21.field567));
            }
        }
        if (arg5 == 22) {
            if (!client.field407 || var8.field858 != 0 || var8.field856 == 1 || var8.field877) {
                class78 var24;
                if (var8.field862 == -1 && var8.field880 == null) {
                    var24 = var8.method628(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field862, true, (class78) null);
                }
                arg6.method1613(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field856 == 1 && arg7 != null) {
                    arg7.method3485(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var47;
            if (var8.field862 == -1 && var8.field880 == null) {
                var47 = var8.method628(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            if (var47 != null && arg6.method1617(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field870) {
                int var48 = 15;
                if (var47 instanceof class98) {
                    var48 = ((class98) var47).method2050() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field78[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field78[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field856 != 0 && arg7 != null) {
                arg7.method3483(arg1, arg2, var9, var10, var8.field873);
            }
        } else if (arg5 >= 12) {
            class78 var25;
            if (var8.field862 == -1 && var8.field880 == null) {
                var25 = var8.method628(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1617(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field138[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field856 != 0 && arg7 != null) {
                arg7.method3483(arg1, arg2, var9, var10, var8.field873);
            }
        } else if (arg5 == 0) {
            class78 var26;
            if (var8.field862 == -1 && var8.field880 == null) {
                var26 = var8.method628(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1615(arg0, arg1, arg2, var16, var26, (class78) null, field80[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field870) {
                    Statics.field78[arg0][arg1][arg2] = 50;
                    Statics.field78[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field861) {
                    Statics.field138[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field870) {
                    Statics.field78[arg0][arg1][arg2 + 1] = 50;
                    Statics.field78[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field861) {
                    Statics.field138[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field870) {
                    Statics.field78[arg0][arg1 + 1][arg2] = 50;
                    Statics.field78[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field861) {
                    Statics.field138[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field870) {
                    Statics.field78[arg0][arg1][arg2] = 50;
                    Statics.field78[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field861) {
                    Statics.field138[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field856 != 0 && arg7 != null) {
                arg7.method3511(arg1, arg2, arg5, arg4, var8.field873);
            }
            if (var8.field859 != 16) {
                arg6.method1623(arg0, arg1, arg2, var8.field859);
            }
        } else if (arg5 == 1) {
            class78 var27;
            if (var8.field862 == -1 && var8.field880 == null) {
                var27 = var8.method628(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1615(arg0, arg1, arg2, var16, var27, (class78) null, field81[arg4], 0, var19, var20);
            if (var8.field870) {
                if (arg4 == 0) {
                    Statics.field78[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field78[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field78[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field78[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field856 != 0 && arg7 != null) {
                arg7.method3511(arg1, arg2, arg5, arg4, var8.field873);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class78 var29;
            class78 var30;
            if (var8.field862 == -1 && var8.field880 == null) {
                var29 = var8.method628(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method628(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field862, true, (class78) null);
                var30 = new class11(arg3, 2, var28, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1615(arg0, arg1, arg2, var16, var29, var30, field80[arg4], field80[var28], var19, var20);
            if (var8.field861) {
                if (arg4 == 0) {
                    Statics.field138[arg0][arg1][arg2] |= 0x249;
                    Statics.field138[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field138[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field138[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field138[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field138[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field138[arg0][arg1][arg2] |= 0x492;
                    Statics.field138[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field856 != 0 && arg7 != null) {
                arg7.method3511(arg1, arg2, arg5, arg4, var8.field873);
            }
            if (var8.field859 != 16) {
                arg6.method1623(arg0, arg1, arg2, var8.field859);
            }
        } else if (arg5 == 3) {
            class78 var31;
            if (var8.field862 == -1 && var8.field880 == null) {
                var31 = var8.method628(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1615(arg0, arg1, arg2, var16, var31, (class78) null, field81[arg4], 0, var19, var20);
            if (var8.field870) {
                if (arg4 == 0) {
                    Statics.field78[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field78[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field78[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field78[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field856 != 0 && arg7 != null) {
                arg7.method3511(arg1, arg2, arg5, arg4, var8.field873);
            }
        } else if (arg5 == 9) {
            class78 var32;
            if (var8.field862 == -1 && var8.field880 == null) {
                var32 = var8.method628(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1617(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field856 != 0 && arg7 != null) {
                arg7.method3483(arg1, arg2, var9, var10, var8.field873);
            }
            if (var8.field859 != 16) {
                arg6.method1623(arg0, arg1, arg2, var8.field859);
            }
        } else if (arg5 == 4) {
            class78 var33;
            if (var8.field862 == -1 && var8.field880 == null) {
                var33 = var8.method628(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1620(arg0, arg1, arg2, var16, var33, (class78) null, field80[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1727(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class36.method2079(var35 >> 14 & 0x7FFF).field859;
            }
            class78 var36;
            if (var8.field862 == -1 && var8.field880 == null) {
                var36 = var8.method628(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1620(arg0, arg1, arg2, var16, var36, (class78) null, field80[arg4], 0, field82[arg4] * var34, field73[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1727(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class36.method2079(var38 >> 14 & 0x7FFF).field859 / 2;
            }
            class78 var39;
            if (var8.field862 == -1 && var8.field880 == null) {
                var39 = var8.method628(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1620(arg0, arg1, arg2, var16, var39, (class78) null, 256, arg4, field84[arg4] * var37, field85[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class78 var41;
            if (var8.field862 == -1 && var8.field880 == null) {
                var41 = var8.method628(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class11(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1620(arg0, arg1, arg2, var16, var41, (class78) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1727(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class36.method2079(var43 >> 14 & 0x7FFF).field859 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class78 var45;
            class78 var46;
            if (var8.field862 == -1 && var8.field880 == null) {
                var45 = var8.method628(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method628(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field862, true, (class78) null);
                var46 = new class11(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field862, true, (class78) null);
            }
            arg6.method1620(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field84[arg4] * var42, field85[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("n.b(Lcc;[Lgn;I)V")
    public static final void method104(class79 arg0, class195[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field87[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field87[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3484(var3, var4);
                        }
                    }
                }
            }
        }
        field76 += (int) (Math.random() * 5.0D) - 2;
        if (field76 < -8) {
            field76 = -8;
        }
        if (field76 > 8) {
            field76 = 8;
        }
        field94 += (int) (Math.random() * 5.0D) - 2;
        if (field94 < -16) {
            field94 = -16;
        }
        if (field94 > 16) {
            field94 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field78[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field92[var6][var11 + 1][var10] - field92[var6][var11 - 1][var10];
                    int var13 = field92[var6][var11][var10 + 1] - field92[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2496[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field79[var20] = 0;
                Statics.field1351[var20] = 0;
                Statics.field975[var20] = 0;
                Statics.field2955[var20] = 0;
                Statics.field1124[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field2888[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class37 var26 = (class37) class37.field894.method3171((long) var25);
                            class37 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field891.method2739(1, var25);
                                class37 var29 = new class37();
                                if (var28 != null) {
                                    var29.method666(new class107(var28), var25);
                                }
                                var29.method667();
                                class37.field894.method3173(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field79[var22] += var27.field893;
                            Statics.field1351[var22] += var27.field896;
                            Statics.field975[var22] += var27.field890;
                            Statics.field2955[var22] += var27.field895;
                            var10002 = Statics.field1124[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field2888[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class37 var34 = (class37) class37.field894.method3171((long) var33);
                            class37 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field891.method2739(1, var33);
                                class37 var37 = new class37();
                                if (var36 != null) {
                                    var37.method666(new class107(var36), var33);
                                }
                                var37.method667();
                                class37.field894.method3173(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field79[var22] -= var35.field893;
                            Statics.field1351[var22] -= var35.field896;
                            Statics.field975[var22] -= var35.field890;
                            Statics.field2955[var22] -= var35.field895;
                            var10002 = Statics.field1124[var22]--;
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
                            var39 += Statics.field79[var45];
                            var40 += Statics.field1351[var45];
                            var41 += Statics.field975[var45];
                            var42 += Statics.field2955[var45];
                            var43 += Statics.field1124[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field79[var46];
                            var40 -= Statics.field1351[var46];
                            var41 -= Statics.field975[var46];
                            var42 -= Statics.field2955[var46];
                            var43 -= Statics.field1124[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field407 || (field87[0][var21][var44] & 0x2) != 0 || (field87[var6][var21][var44] & 0x10) == 0 && method2699(var6, var21, var44) == client.field400)) {
                            if (var6 < field90) {
                                field90 = var6;
                            }
                            int var47 = Statics.field2888[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field93[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field92[var6][var21][var44];
                                int var50 = field92[var6][var21 + 1][var44];
                                int var51 = field92[var6][var21 + 1][var44 + 1];
                                int var52 = field92[var6][var21][var44 + 1];
                                int var53 = Statics.field2496[var21][var44];
                                int var54 = Statics.field2496[var21 + 1][var44];
                                int var55 = Statics.field2496[var21 + 1][var44 + 1];
                                int var56 = Statics.field2496[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method33(var59, var60, var61);
                                    int var62 = field76 + var59 & 0xFF;
                                    int var63 = field94 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method33(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field77[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class41 var66 = (class41) class41.field972.method3171((long) var65);
                                        class41 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field957.method2739(4, var65);
                                            class41 var69 = new class41();
                                            if (var68 != null) {
                                                var69.method770(new class107(var68), var65);
                                            }
                                            var69.method789();
                                            class41.field972.method3173(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field961) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field138[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class84.field1481[method2405(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1612(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method2405(var57, var53), method2405(var57, var54), method2405(var57, var55), method2405(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field77[var6][var21][var44] + 1;
                                    byte var72 = Statics.field2001[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class41 var74 = (class41) class41.field972.method3171((long) var73);
                                    class41 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field957.method2739(4, var73);
                                        class41 var77 = new class41();
                                        if (var76 != null) {
                                            var77.method770(new class107(var76), var73);
                                        }
                                        var77.method789();
                                        class41.field972.method3173(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field960;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1465.method1862(var79);
                                        var81 = -1;
                                    } else if (var75.field959 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method33(var75.field963, var75.field964, var75.field965);
                                        int var82 = field76 + var75.field963 & 0xFF;
                                        int var83 = field94 + var75.field965;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method33(var82, var75.field964, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class84.field1481[Statics.method1599(var80, 96)];
                                    }
                                    if (var75.field966 != -1) {
                                        int var85 = field76 + var75.field962 & 0xFF;
                                        int var86 = field94 + var75.field968;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method33(var85, var75.field967, var86);
                                        var84 = class84.field1481[Statics.method1599(var87, 96)];
                                    }
                                    arg0.method1612(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method2405(var57, var53), method2405(var57, var54), method2405(var57, var55), method2405(var57, var56), Statics.method1599(var81, var53), Statics.method1599(var81, var54), Statics.method1599(var81, var55), Statics.method1599(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method1687(var6, var89, var88, method2699(var6, var89, var88));
                }
            }
            Statics.field2888[var6] = (byte[][]) null;
            Statics.field93[var6] = (byte[][]) null;
            Statics.field77[var6] = (byte[][]) null;
            Statics.field2001[var6] = (byte[][]) null;
            Statics.field78[var6] = (byte[][]) null;
        }
        arg0.method1679(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field87[1][var90][var91] & 0x2) == 2) {
                    arg0.method1780(var90, var91);
                }
            }
        }
        int var92 = 1;
        int var93 = 2;
        int var94 = 4;
        for (int var95 = 0; var95 < 4; var95++) {
            if (var95 > 0) {
                var92 <<= 0x3;
                var93 <<= 0x3;
                var94 <<= 0x3;
            }
            for (int var96 = 0; var96 <= var95; var96++) {
                for (int var97 = 0; var97 <= 104; var97++) {
                    for (int var98 = 0; var98 <= 104; var98++) {
                        if ((Statics.field138[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field138[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field138[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label375: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field138[var101 - 1][var98][var103] & var92) == 0) {
                                        break label375;
                                    }
                                }
                                var101--;
                            }
                            label364: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field138[var102 + 1][var98][var104] & var92) == 0) {
                                        break label364;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field92[var102][var98][var99] - var106;
                                int var108 = field92[var101][var98][var99];
                                class79.method1713(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field138[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field138[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field138[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field138[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label428: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field138[var113 - 1][var115][var97] & var93) == 0) {
                                        break label428;
                                    }
                                }
                                var113--;
                            }
                            label417: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field138[var114 + 1][var116][var97] & var93) == 0) {
                                        break label417;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field92[var114][var111][var97] - var118;
                                int var120 = field92[var113][var111][var97];
                                class79.method1713(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field138[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field138[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field138[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field138[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label481: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field138[var96][var123 - 1][var127] & var94) == 0) {
                                        break label481;
                                    }
                                }
                                var123--;
                            }
                            label470: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field138[var96][var124 + 1][var128] & var94) == 0) {
                                        break label470;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field92[var96][var123][var125];
                                class79.method1713(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field138[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ee.n(IIIB)I")
    public static int method2699(int arg0, int arg1, int arg2) {
        if ((field87[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field87[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("aa.a(IIB)I")
    public static final int method781(int arg0, int arg1) {
        int var2 = method1870(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1870(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1870(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("co.q(IIII)I")
    public static final int method1870(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method555(var3, var5);
        int var8 = method555(var3 + 1, var5);
        int var9 = method555(var3, var5 + 1);
        int var10 = method555(var3 + 1, var5 + 1);
        int var11 = method766(var7, var8, var4, arg2);
        int var12 = method766(var9, var10, var4, arg2);
        return method766(var11, var12, var6, arg2);
    }

    @ObfuscatedName("at.i(IIIII)I")
    public static final int method766(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1471[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ak.f(III)I")
    public static final int method555(int arg0, int arg1) {
        int var2 = Statics.method12(arg0 - 1, arg1 - 1) + Statics.method12(arg0 + 1, arg1 - 1) + Statics.method12(arg0 - 1, arg1 + 1) + Statics.method12(arg0 + 1, arg1 + 1);
        int var3 = Statics.method12(arg0 - 1, arg1) + Statics.method12(arg0 + 1, arg1) + Statics.method12(arg0, arg1 - 1) + Statics.method12(arg0, arg1 + 1);
        int var4 = Statics.method12(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dq.t(III)I")
    public static final int method2405(int arg0, int arg1) {
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

    @ObfuscatedName("h.d(IIIB)I")
    public static final int method33(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("g.g(III)Z")
    public static final boolean method437(int arg0, int arg1) {
        class36 var2 = class36.method2079(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method646(arg1);
    }
}
