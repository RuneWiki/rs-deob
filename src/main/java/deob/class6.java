package deob;

@ObfuscatedName("l")
public final class class6 {

    @ObfuscatedName("l.e")
    public static int[][][] field84 = new int[4][105][105];

    @ObfuscatedName("l.v")
    public static byte[][][] field72 = new byte[4][104][104];

    @ObfuscatedName("l.k")
    public static int field83 = 99;

    @ObfuscatedName("l.i")
    public static final int[] field86 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("l.u")
    public static final int[] field80 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("l.y")
    public static final int[] field82 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("l.o")
    public static final int[] field85 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("l.m")
    public static final int[] field81 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("l.h")
    public static final int[] field79 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("l.x")
    public static int field71 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("l.d")
    public static int field87 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.e(B)V")
    public static void method2052() {
        Statics.field74 = (byte[][][]) null;
        Statics.field2512 = (byte[][][]) null;
        Statics.field75 = (byte[][][]) null;
        Statics.field76 = (byte[][][]) null;
        Statics.field88 = (int[][][]) null;
        Statics.field2134 = (byte[][][]) null;
        Statics.field77 = (int[][]) null;
        Statics.field78 = null;
        Statics.field2126 = null;
        Statics.field2144 = null;
        Statics.field643 = null;
        Statics.field1898 = null;
    }

    @ObfuscatedName("w.v(IIIIB)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2134[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field84[0][var5][var4] = field84[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field84[0][var5][var4] = field84[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field84[0][var5][var4] = field84[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field84[0][var5][var4] = field84[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.k([BIIIIIII[Lhx;I)V")
    public static final void method2442(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class209[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3007[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class108 var11 = new class108(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class158.method1887(var13 & 0x7, var14 & 0x7, arg7);
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
                        method1594(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method1594(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ck.g(Ldd;IIIIIII)V")
    public static final void method1594(class108 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2122();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2122();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2122();
                }
            }
            return;
        }
        field72[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2122();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field84[0][arg2][arg3] = -method1074(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field84[arg1][arg2][arg3] = field84[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2122();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field84[0][arg2][arg3] = -var8 * 8;
                } else {
                    field84[arg1][arg2][arg3] = field84[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2512[arg1][arg2][arg3] = arg0.method2190();
                Statics.field75[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field76[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field72[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field74[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ak.q([BIIIIIIILcv;[Lhx;B)V")
    public static final void method835(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class80 arg8, class209[] arg9) {
        class108 var10 = new class108(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2135();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2135();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2122();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class37 var21 = class37.method2581(var11);
                    int var22 = arg2 + class158.method1876(var16 & 0x7, var15 & 0x7, arg7, var21.field858, var21.field859, var20);
                    int var23 = arg3 + class158.method1591(var16 & 0x7, var15 & 0x7, arg7, var21.field858, var21.field859, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field72[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class209 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method28(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.l(IIIIIILcv;Lhx;B)V")
    public static final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class80 arg6, class209 arg7) {
        if (client.field249 && (field72[0][arg1][arg2] & 0x2) == 0) {
            if ((field72[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2396(arg0, arg1, arg2) != client.field298) {
                return;
            }
        }
        if (arg0 < field83) {
            field83 = arg0;
        }
        class37 var8 = class37.method2581(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field859;
            var10 = var8.field858;
        } else {
            var9 = var8.field858;
            var10 = var8.field859;
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
        int[][] var15 = field84[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field874 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field887 == 1) {
            var20 += 256;
        }
        if (var8.method630()) {
            class21.method3357(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field249 || var8.field874 != 0 || var8.field854 == 1 || var8.field881) {
                class79 var21;
                if (var8.field866 == -1 && var8.field884 == null) {
                    var21 = var8.method634(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field866, true, (class79) null);
                }
                arg6.method1607(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field854 == 1 && arg7 != null) {
                    arg7.method3566(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class79 var44;
            if (var8.field866 == -1 && var8.field884 == null) {
                var44 = var8.method634(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            if (var44 != null && arg6.method1610(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field883) {
                int var45 = 15;
                if (var44 instanceof class99) {
                    var45 = ((class99) var44).method1974() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field2134[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field2134[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3562(arg1, arg2, var9, var10, var8.field861);
            }
        } else if (arg5 >= 12) {
            class79 var22;
            if (var8.field866 == -1 && var8.field884 == null) {
                var22 = var8.method634(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1610(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field88[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3562(arg1, arg2, var9, var10, var8.field861);
            }
        } else if (arg5 == 0) {
            class79 var23;
            if (var8.field866 == -1 && var8.field884 == null) {
                var23 = var8.method634(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1609(arg0, arg1, arg2, var16, var23, (class79) null, field86[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field883) {
                    Statics.field2134[arg0][arg1][arg2] = 50;
                    Statics.field2134[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field865) {
                    Statics.field88[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field883) {
                    Statics.field2134[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2134[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field865) {
                    Statics.field88[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field883) {
                    Statics.field2134[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2134[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field865) {
                    Statics.field88[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field883) {
                    Statics.field2134[arg0][arg1][arg2] = 50;
                    Statics.field2134[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field865) {
                    Statics.field88[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3561(arg1, arg2, arg5, arg4, var8.field861);
            }
            if (var8.field867 != 16) {
                arg6.method1617(arg0, arg1, arg2, var8.field867);
            }
        } else if (arg5 == 1) {
            class79 var24;
            if (var8.field866 == -1 && var8.field884 == null) {
                var24 = var8.method634(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1609(arg0, arg1, arg2, var16, var24, (class79) null, field80[arg4], 0, var19, var20);
            if (var8.field883) {
                if (arg4 == 0) {
                    Statics.field2134[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2134[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2134[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2134[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3561(arg1, arg2, arg5, arg4, var8.field861);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class79 var26;
            class79 var27;
            if (var8.field866 == -1 && var8.field884 == null) {
                var26 = var8.method634(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method634(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field866, true, (class79) null);
                var27 = new class11(arg3, 2, var25, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1609(arg0, arg1, arg2, var16, var26, var27, field86[arg4], field86[var25], var19, var20);
            if (var8.field865) {
                if (arg4 == 0) {
                    Statics.field88[arg0][arg1][arg2] |= 0x249;
                    Statics.field88[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field88[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field88[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field88[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field88[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field88[arg0][arg1][arg2] |= 0x492;
                    Statics.field88[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3561(arg1, arg2, arg5, arg4, var8.field861);
            }
            if (var8.field867 != 16) {
                arg6.method1617(arg0, arg1, arg2, var8.field867);
            }
        } else if (arg5 == 3) {
            class79 var28;
            if (var8.field866 == -1 && var8.field884 == null) {
                var28 = var8.method634(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1609(arg0, arg1, arg2, var16, var28, (class79) null, field80[arg4], 0, var19, var20);
            if (var8.field883) {
                if (arg4 == 0) {
                    Statics.field2134[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2134[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2134[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2134[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3561(arg1, arg2, arg5, arg4, var8.field861);
            }
        } else if (arg5 == 9) {
            class79 var29;
            if (var8.field866 == -1 && var8.field884 == null) {
                var29 = var8.method634(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1610(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field854 != 0 && arg7 != null) {
                arg7.method3562(arg1, arg2, var9, var10, var8.field861);
            }
            if (var8.field867 != 16) {
                arg6.method1617(arg0, arg1, arg2, var8.field867);
            }
        } else if (arg5 == 4) {
            class79 var30;
            if (var8.field866 == -1 && var8.field884 == null) {
                var30 = var8.method634(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1722(arg0, arg1, arg2, var16, var30, (class79) null, field86[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1627(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class37.method2581(var32 >> 14 & 0x7FFF).field867;
            }
            class79 var33;
            if (var8.field866 == -1 && var8.field884 == null) {
                var33 = var8.method634(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1722(arg0, arg1, arg2, var16, var33, (class79) null, field86[arg4], 0, field82[arg4] * var31, field85[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1627(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class37.method2581(var35 >> 14 & 0x7FFF).field867 / 2;
            }
            class79 var36;
            if (var8.field866 == -1 && var8.field884 == null) {
                var36 = var8.method634(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1722(arg0, arg1, arg2, var16, var36, (class79) null, 256, arg4, field81[arg4] * var34, field79[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class79 var38;
            if (var8.field866 == -1 && var8.field884 == null) {
                var38 = var8.method634(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class11(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1722(arg0, arg1, arg2, var16, var38, (class79) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1627(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class37.method2581(var40 >> 14 & 0x7FFF).field867 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class79 var42;
            class79 var43;
            if (var8.field866 == -1 && var8.field884 == null) {
                var42 = var8.method634(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method634(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field866, true, (class79) null);
                var43 = new class11(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field866, true, (class79) null);
            }
            arg6.method1722(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field81[arg4] * var39, field79[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("db.a(IIII)I")
    public static int method2396(int arg0, int arg1, int arg2) {
        if ((field72[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field72[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("bq.b(IIB)I")
    public static final int method1074(int arg0, int arg1) {
        int var2 = method3017(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3017(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3017(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("fz.z(IIII)I")
    public static final int method3017(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3332(var3, var5);
        int var8 = method3332(var3 + 1, var5);
        int var9 = method3332(var3, var5 + 1);
        int var10 = method3332(var3 + 1, var5 + 1);
        int var11 = method2889(var7, var8, var4, arg2);
        int var12 = method2889(var9, var10, var4, arg2);
        return method2889(var11, var12, var6, arg2);
    }

    @ObfuscatedName("fa.w(IIIII)I")
    public static final int method2889(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1501[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("gd.j(IIB)I")
    public static final int method3332(int arg0, int arg1) {
        int var2 = method554(arg0 - 1, arg1 - 1) + method554(arg0 + 1, arg1 - 1) + method554(arg0 - 1, arg1 + 1) + method554(arg0 + 1, arg1 + 1);
        int var3 = method554(arg0 - 1, arg1) + method554(arg0 + 1, arg1) + method554(arg0, arg1 - 1) + method554(arg0, arg1 + 1);
        int var4 = method554(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ah.p(IIB)I")
    public static final int method554(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ah.n(III)I")
    public static final int method553(int arg0, int arg1) {
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

    @ObfuscatedName("bg.r(IIB)I")
    public static final int method1330(int arg0, int arg1) {
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

    @ObfuscatedName("ap.s(IIII)I")
    public static final int method736(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("w.f(III)Z")
    public static final boolean method120(int arg0, int arg1) {
        class37 var2 = class37.method2581(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method659(arg1);
    }

    @ObfuscatedName("ad.c(IIIIIIILcv;Lhx;S)V")
    public static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class80 arg7, class209 arg8) {
        class37 var9 = class37.method2581(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field859;
            var11 = var9.field858;
        } else {
            var10 = var9.field858;
            var11 = var9.field859;
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
        int[][] var16 = field84[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field874 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field887 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class79 var22;
            if (var9.field866 == -1 && var9.field884 == null) {
                var22 = var9.method635(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class11(arg4, 22, arg5, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1607(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field854 == 1) {
                arg8.method3566(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class79 var45;
            if (var9.field866 == -1 && var9.field884 == null) {
                var45 = var9.method635(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg4, 10, arg5, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            if (var45 != null) {
                arg7.method1610(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field854 != 0) {
                arg8.method3562(arg2, arg3, var10, var11, var9.field861);
            }
        } else if (arg6 >= 12) {
            class79 var23;
            if (var9.field866 == -1 && var9.field884 == null) {
                var23 = var9.method635(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1610(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3562(arg2, arg3, var10, var11, var9.field861);
            }
        } else if (arg6 == 0) {
            class79 var24;
            if (var9.field866 == -1 && var9.field884 == null) {
                var24 = var9.method635(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg4, 0, arg5, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1609(arg0, arg2, arg3, var17, var24, (class79) null, field86[arg5], 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3561(arg2, arg3, arg6, arg5, var9.field861);
            }
        } else if (arg6 == 1) {
            class79 var25;
            if (var9.field866 == -1 && var9.field884 == null) {
                var25 = var9.method635(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg4, 1, arg5, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1609(arg0, arg2, arg3, var17, var25, (class79) null, field80[arg5], 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3561(arg2, arg3, arg6, arg5, var9.field861);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class79 var27;
            class79 var28;
            if (var9.field866 == -1 && var9.field884 == null) {
                var27 = var9.method635(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method635(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field866, true, (class79) null);
                var28 = new class11(arg4, 2, var26, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1609(arg0, arg2, arg3, var17, var27, var28, field86[arg5], field86[var26], var20, var21);
            if (var9.field854 != 0) {
                arg8.method3561(arg2, arg3, arg6, arg5, var9.field861);
            }
        } else if (arg6 == 3) {
            class79 var29;
            if (var9.field866 == -1 && var9.field884 == null) {
                var29 = var9.method635(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg4, 3, arg5, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1609(arg0, arg2, arg3, var17, var29, (class79) null, field80[arg5], 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3561(arg2, arg3, arg6, arg5, var9.field861);
            }
        } else if (arg6 == 9) {
            class79 var30;
            if (var9.field866 == -1 && var9.field884 == null) {
                var30 = var9.method635(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1610(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field854 != 0) {
                arg8.method3562(arg2, arg3, var10, var11, var9.field861);
            }
        } else if (arg6 == 4) {
            class79 var31;
            if (var9.field866 == -1 && var9.field884 == null) {
                var31 = var9.method635(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1722(arg0, arg2, arg3, var17, var31, (class79) null, field86[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1627(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class37.method2581(var33 >> 14 & 0x7FFF).field867;
            }
            class79 var34;
            if (var9.field866 == -1 && var9.field884 == null) {
                var34 = var9.method635(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1722(arg0, arg2, arg3, var17, var34, (class79) null, field86[arg5], 0, field82[arg5] * var32, field85[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1627(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class37.method2581(var36 >> 14 & 0x7FFF).field867 / 2;
            }
            class79 var37;
            if (var9.field866 == -1 && var9.field884 == null) {
                var37 = var9.method635(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1722(arg0, arg2, arg3, var17, var37, (class79) null, 256, arg5, field81[arg5] * var35, field79[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class79 var39;
            if (var9.field866 == -1 && var9.field884 == null) {
                var39 = var9.method635(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1722(arg0, arg2, arg3, var17, var39, (class79) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1627(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class37.method2581(var41 >> 14 & 0x7FFF).field867 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class79 var43;
            class79 var44;
            if (var9.field866 == -1 && var9.field884 == null) {
                var43 = var9.method635(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method635(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field866, true, (class79) null);
                var44 = new class11(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field866, true, (class79) null);
            }
            arg7.method1722(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field81[arg5] * var40, field79[arg5] * var40, var20, var21);
        }
    }
}
