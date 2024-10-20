package deob;

@ObfuscatedName("m")
public final class class6 {

    @ObfuscatedName("m.a")
    public static int[][][] field94 = new int[4][105][105];

    @ObfuscatedName("m.v")
    public static byte[][][] field76 = new byte[4][104][104];

    @ObfuscatedName("m.i")
    public static int field92 = 99;

    @ObfuscatedName("m.u")
    public static final int[] field85 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("m.j")
    public static final int[] field77 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("m.g")
    public static final int[] field87 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("m.y")
    public static final int[] field88 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("m.p")
    public static final int[] field89 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("m.r")
    public static final int[] field90 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("m.z")
    public static int field75 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("m.c")
    public static int field78 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.a(I)V")
    public static void method1015() {
        field92 = 99;
        Statics.field93 = new byte[4][104][104];
        Statics.field1352 = new byte[4][104][104];
        Statics.field79 = new byte[4][104][104];
        Statics.field80 = new byte[4][104][104];
        Statics.field1864 = new int[4][105][105];
        Statics.field1523 = new byte[4][105][105];
        Statics.field592 = new int[105][105];
        Statics.field81 = new int[104];
        Statics.field82 = new int[104];
        Statics.field96 = new int[104];
        Statics.field84 = new int[104];
        Statics.field204 = new int[104];
    }

    @ObfuscatedName("cb.v(IIIII)V")
    public static final void method1852(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1523[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field94[0][var5][var4] = field94[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field94[0][var5][var4] = field94[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field94[0][var5][var4] = field94[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field94[0][var5][var4] = field94[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fl.i([BIIIIIII[Lhb;I)V")
    public static final void method2979(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class211[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3032[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class110 var11 = new class110(arg0);
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
                        method1328(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method1328(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("da.b(IIIB)V")
    public static final void method2461(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field94[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field94[arg0][arg1][arg2 + var5] = field94[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field94[arg0][arg1 + var6][arg2] = field94[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field94[arg0][arg1 - 1][arg2] != 0) {
            field94[arg0][arg1][arg2] = field94[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field94[arg0][arg1][arg2 - 1] != 0) {
            field94[arg0][arg1][arg2] = field94[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field94[arg0][arg1 - 1][arg2 - 1] != 0) {
            field94[arg0][arg1][arg2] = field94[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("bt.l(Ldi;IIIIIIB)V")
    public static final void method1328(class110 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2199();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2199();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2199();
                }
            }
            return;
        }
        field76[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2199();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field94[0][arg2][arg3] = -method1(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2199();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field94[0][arg2][arg3] = -var8 * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1352[arg1][arg2][arg3] = arg0.method2132();
                Statics.field79[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field80[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field76[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field93[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("d.m([BIILct;[Lhb;I)V")
    public static final void method140(byte[] arg0, int arg1, int arg2, class80 arg3, class211[] arg4) {
        class110 var5 = new class110(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2144();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2144();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2199();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field76[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class211 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2839(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ch.w([BIIIIIIILct;[Lhb;B)V")
    public static final void method1863(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class80 arg8, class211[] arg9) {
        class110 var10 = new class110(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2144();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2144();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2199();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class37 var21 = class37.method2964(var11);
                    int var22 = arg2 + class160.method1850(var16 & 0x7, var15 & 0x7, arg7, var21.field858, var21.field859, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field858;
                    int var28 = var21.field859;
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
                        if ((field76[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class211 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method2839(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ev.e(IIIIIILct;Lhb;I)V")
    public static final void method2839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class80 arg6, class211 arg7) {
        if (client.field262 && (field76[0][arg1][arg2] & 0x2) == 0) {
            if ((field76[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field76[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field76[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field313 != var8) {
                return;
            }
        }
        if (arg0 < field92) {
            field92 = arg0;
        }
        class37 var9 = class37.method2964(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field859;
            var11 = var9.field858;
        } else {
            var10 = var9.field858;
            var11 = var9.field859;
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
        int[][] var16 = field94[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field862 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field883 == 1) {
            var21 += 256;
        }
        if (var9.method682()) {
            class21 var22 = new class21();
            var22.field565 = arg0;
            var22.field555 = arg1 * 128;
            var22.field554 = arg2 * 128;
            int var23 = var9.field858;
            int var24 = var9.field859;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field859;
                var24 = var9.field858;
            }
            var22.field556 = (arg1 + var23) * 128;
            var22.field558 = (arg2 + var24) * 128;
            var22.field560 = var9.field887;
            var22.field557 = var9.field872 * 128;
            var22.field564 = var9.field889;
            var22.field563 = var9.field890;
            var22.field561 = var9.field885;
            if (var9.field884 != null) {
                var22.field567 = var9;
                var22.method512();
            }
            class21.field559.method3274(var22);
            if (var22.field561 != null) {
                var22.field566 = var22.field564 + (int) (Math.random() * (double) (var22.field563 - var22.field564));
            }
        }
        if (arg5 == 22) {
            if (!client.field262 || var9.field862 != 0 || var9.field842 == 1 || var9.field881) {
                class79 var25;
                if (var9.field875 == -1 && var9.field884 == null) {
                    var25 = var9.method671(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var9.field875, true, (class79) null);
                }
                arg6.method1598(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field842 == 1 && arg7 != null) {
                    arg7.method3598(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class79 var48;
            if (var9.field875 == -1 && var9.field884 == null) {
                var48 = var9.method671(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            if (var48 != null && arg6.method1602(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field860) {
                int var49 = 15;
                if (var48 instanceof class99) {
                    var49 = ((class99) var48).method2020() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field1523[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field1523[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field842 != 0 && arg7 != null) {
                arg7.method3577(arg1, arg2, var10, var11, var9.field861);
            }
        } else if (arg5 >= 12) {
            class79 var26;
            if (var9.field875 == -1 && var9.field884 == null) {
                var26 = var9.method671(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1602(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1864[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field842 != 0 && arg7 != null) {
                arg7.method3577(arg1, arg2, var10, var11, var9.field861);
            }
        } else if (arg5 == 0) {
            class79 var27;
            if (var9.field875 == -1 && var9.field884 == null) {
                var27 = var9.method671(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1631(arg0, arg1, arg2, var17, var27, (class79) null, field85[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field860) {
                    Statics.field1523[arg0][arg1][arg2] = 50;
                    Statics.field1523[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field865) {
                    Statics.field1864[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field860) {
                    Statics.field1523[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1523[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field865) {
                    Statics.field1864[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field860) {
                    Statics.field1523[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1523[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field865) {
                    Statics.field1864[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field860) {
                    Statics.field1523[arg0][arg1][arg2] = 50;
                    Statics.field1523[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field865) {
                    Statics.field1864[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field842 != 0 && arg7 != null) {
                arg7.method3576(arg1, arg2, arg5, arg4, var9.field861);
            }
            if (var9.field867 != 16) {
                arg6.method1608(arg0, arg1, arg2, var9.field867);
            }
        } else if (arg5 == 1) {
            class79 var28;
            if (var9.field875 == -1 && var9.field884 == null) {
                var28 = var9.method671(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1631(arg0, arg1, arg2, var17, var28, (class79) null, field77[arg4], 0, var20, var21);
            if (var9.field860) {
                if (arg4 == 0) {
                    Statics.field1523[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1523[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1523[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1523[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field842 != 0 && arg7 != null) {
                arg7.method3576(arg1, arg2, arg5, arg4, var9.field861);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class79 var30;
            class79 var31;
            if (var9.field875 == -1 && var9.field884 == null) {
                var30 = var9.method671(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method671(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field875, true, (class79) null);
                var31 = new class11(arg3, 2, var29, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1631(arg0, arg1, arg2, var17, var30, var31, field85[arg4], field85[var29], var20, var21);
            if (var9.field865) {
                if (arg4 == 0) {
                    Statics.field1864[arg0][arg1][arg2] |= 0x249;
                    Statics.field1864[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1864[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1864[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1864[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1864[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1864[arg0][arg1][arg2] |= 0x492;
                    Statics.field1864[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field842 != 0 && arg7 != null) {
                arg7.method3576(arg1, arg2, arg5, arg4, var9.field861);
            }
            if (var9.field867 != 16) {
                arg6.method1608(arg0, arg1, arg2, var9.field867);
            }
        } else if (arg5 == 3) {
            class79 var32;
            if (var9.field875 == -1 && var9.field884 == null) {
                var32 = var9.method671(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1631(arg0, arg1, arg2, var17, var32, (class79) null, field77[arg4], 0, var20, var21);
            if (var9.field860) {
                if (arg4 == 0) {
                    Statics.field1523[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1523[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1523[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1523[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field842 != 0 && arg7 != null) {
                arg7.method3576(arg1, arg2, arg5, arg4, var9.field861);
            }
        } else if (arg5 == 9) {
            class79 var33;
            if (var9.field875 == -1 && var9.field884 == null) {
                var33 = var9.method671(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1602(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field842 != 0 && arg7 != null) {
                arg7.method3577(arg1, arg2, var10, var11, var9.field861);
            }
            if (var9.field867 != 16) {
                arg6.method1608(arg0, arg1, arg2, var9.field867);
            }
        } else if (arg5 == 4) {
            class79 var34;
            if (var9.field875 == -1 && var9.field884 == null) {
                var34 = var9.method671(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1601(arg0, arg1, arg2, var17, var34, (class79) null, field85[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1618(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class37.method2964(var36 >> 14 & 0x7FFF).field867;
            }
            class79 var37;
            if (var9.field875 == -1 && var9.field884 == null) {
                var37 = var9.method671(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1601(arg0, arg1, arg2, var17, var37, (class79) null, field85[arg4], 0, field87[arg4] * var35, field88[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1618(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class37.method2964(var39 >> 14 & 0x7FFF).field867 / 2;
            }
            class79 var40;
            if (var9.field875 == -1 && var9.field884 == null) {
                var40 = var9.method671(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1601(arg0, arg1, arg2, var17, var40, (class79) null, 256, arg4, field89[arg4] * var38, field90[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class79 var42;
            if (var9.field875 == -1 && var9.field884 == null) {
                var42 = var9.method671(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class11(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1601(arg0, arg1, arg2, var17, var42, (class79) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1618(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class37.method2964(var44 >> 14 & 0x7FFF).field867 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class79 var46;
            class79 var47;
            if (var9.field875 == -1 && var9.field884 == null) {
                var46 = var9.method671(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method671(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field875, true, (class79) null);
                var47 = new class11(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field875, true, (class79) null);
            }
            arg6.method1601(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field89[arg4] * var43, field90[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("a.n(III)I")
    public static final int method1(int arg0, int arg1) {
        int var2 = method14(arg0 + 45365, arg1 + 91923, 4) - 128 + (method14(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method14(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("i.s(IIIB)I")
    public static final int method14(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2715(var3, var5);
        int var8 = method2715(var3 + 1, var5);
        int var9 = method2715(var3, var5 + 1);
        int var10 = method2715(var3 + 1, var5 + 1);
        int var11 = method923(var7, var8, var4, arg2);
        int var12 = method923(var9, var10, var4, arg2);
        return method923(var11, var12, var6, arg2);
    }

    @ObfuscatedName("aj.k(IIIII)I")
    public static final int method923(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1483[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("eu.f(III)I")
    public static final int method2715(int arg0, int arg1) {
        int var2 = method2(arg0 - 1, arg1 - 1) + method2(arg0 + 1, arg1 - 1) + method2(arg0 - 1, arg1 + 1) + method2(arg0 + 1, arg1 + 1);
        int var3 = method2(arg0 - 1, arg1) + method2(arg0 + 1, arg1) + method2(arg0, arg1 - 1) + method2(arg0, arg1 + 1);
        int var4 = method2(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("a.d(III)I")
    public static final int method2(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("aa.x(III)I")
    public static final int method733(int arg0, int arg1) {
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

    @ObfuscatedName("m.o(III)I")
    public static final int method86(int arg0, int arg1) {
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

    @ObfuscatedName("gt.q(IIII)I")
    public static final int method3357(int arg0, int arg1, int arg2) {
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
