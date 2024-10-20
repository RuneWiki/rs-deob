package deob;

@ObfuscatedName("l")
public final class class6 {

    @ObfuscatedName("l.c")
    public static int[][][] field84 = new int[4][105][105];

    @ObfuscatedName("l.j")
    public static byte[][][] field77 = new byte[4][104][104];

    @ObfuscatedName("l.y")
    public static int field86 = 99;

    @ObfuscatedName("l.u")
    public static final int[] field89 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("l.a")
    public static final int[] field82 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("l.d")
    public static final int[] field83 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("l.m")
    public static final int[] field94 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("l.q")
    public static final int[] field85 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("l.e")
    public static final int[] field91 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("l.t")
    public static int field87 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("l.o")
    public static int field88 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ga.c(IIIII)V")
    public static final void method3342(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2020[0][var5][var4] = 127;
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

    @ObfuscatedName("cz.j([BIIII[Lhg;I)V")
    public static final void method2070(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class209[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3007[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class108 var9 = new class108(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method592(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("as.y(Ldx;IIIIIIB)V")
    public static final void method592(class108 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2134();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2134();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2134();
                }
            }
            return;
        }
        field77[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2134();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field84[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1798(var10 + 45365, var11 + 91923, 4) - 128 + (method1798(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1798(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field84[arg1][arg2][arg3] = field84[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2134();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field84[0][arg2][arg3] = -var15 * 8;
                } else {
                    field84[arg1][arg2][arg3] = field84[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field79[arg1][arg2][arg3] = arg0.method2229();
                Statics.field76[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2662[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field77[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1916[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("x.r(IIIIIILck;Lhg;B)V")
    public static final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class80 arg6, class209 arg7) {
        if (client.field255 && (field77[0][arg1][arg2] & 0x2) == 0) {
            if ((field77[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method490(arg0, arg1, arg2) != client.field306) {
                return;
            }
        }
        if (arg0 < field86) {
            field86 = arg0;
        }
        class37 var8 = class37.method1041(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field885;
            var10 = var8.field855;
        } else {
            var9 = var8.field855;
            var10 = var8.field885;
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
        if (var8.field886 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field880 == 1) {
            var20 += 256;
        }
        if (var8.method642()) {
            class21 var21 = new class21();
            var21.field550 = arg0;
            var21.field567 = arg1 * 128;
            var21.field552 = arg2 * 128;
            int var22 = var8.field855;
            int var23 = var8.field885;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field885;
                var23 = var8.field855;
            }
            var21.field553 = (arg1 + var22) * 128;
            var21.field554 = (arg2 + var23) * 128;
            var21.field556 = var8.field884;
            var21.field555 = var8.field859 * 128;
            var21.field558 = var8.field856;
            var21.field559 = var8.field845;
            var21.field560 = var8.field888;
            if (var8.field868 != null) {
                var21.field561 = var8;
                var21.method485();
            }
            class21.field549.method3241(var21);
            if (var21.field560 != null) {
                var21.field564 = var21.field558 + (int) (Math.random() * (double) (var21.field559 - var21.field558));
            }
        }
        if (arg5 == 22) {
            if (!client.field255 || var8.field886 != 0 || var8.field857 == 1 || var8.field878) {
                class79 var24;
                if (var8.field849 == -1 && var8.field868 == null) {
                    var24 = var8.method656(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field849, true, (class79) null);
                }
                arg6.method1627(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field857 == 1 && arg7 != null) {
                    arg7.method3581(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class79 var47;
            if (var8.field849 == -1 && var8.field868 == null) {
                var47 = var8.method656(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            if (var47 != null && arg6.method1631(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field887) {
                int var48 = 15;
                if (var47 instanceof class99) {
                    var48 = ((class99) var47).method1988() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2020[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2020[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3576(arg1, arg2, var9, var10, var8.field858);
            }
        } else if (arg5 >= 12) {
            class79 var25;
            if (var8.field849 == -1 && var8.field868 == null) {
                var25 = var8.method656(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1631(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1803[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3576(arg1, arg2, var9, var10, var8.field858);
            }
        } else if (arg5 == 0) {
            class79 var26;
            if (var8.field849 == -1 && var8.field868 == null) {
                var26 = var8.method656(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1629(arg0, arg1, arg2, var16, var26, (class79) null, field89[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field887) {
                    Statics.field2020[arg0][arg1][arg2] = 50;
                    Statics.field2020[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field877) {
                    Statics.field1803[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field887) {
                    Statics.field2020[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2020[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field877) {
                    Statics.field1803[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field887) {
                    Statics.field2020[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2020[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field877) {
                    Statics.field1803[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field887) {
                    Statics.field2020[arg0][arg1][arg2] = 50;
                    Statics.field2020[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field877) {
                    Statics.field1803[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3595(arg1, arg2, arg5, arg4, var8.field858);
            }
            if (var8.field865 != 16) {
                arg6.method1637(arg0, arg1, arg2, var8.field865);
            }
        } else if (arg5 == 1) {
            class79 var27;
            if (var8.field849 == -1 && var8.field868 == null) {
                var27 = var8.method656(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1629(arg0, arg1, arg2, var16, var27, (class79) null, field82[arg4], 0, var19, var20);
            if (var8.field887) {
                if (arg4 == 0) {
                    Statics.field2020[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2020[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2020[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2020[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3595(arg1, arg2, arg5, arg4, var8.field858);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class79 var29;
            class79 var30;
            if (var8.field849 == -1 && var8.field868 == null) {
                var29 = var8.method656(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method656(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field849, true, (class79) null);
                var30 = new class11(arg3, 2, var28, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1629(arg0, arg1, arg2, var16, var29, var30, field89[arg4], field89[var28], var19, var20);
            if (var8.field877) {
                if (arg4 == 0) {
                    Statics.field1803[arg0][arg1][arg2] |= 0x249;
                    Statics.field1803[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1803[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1803[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1803[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1803[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1803[arg0][arg1][arg2] |= 0x492;
                    Statics.field1803[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3595(arg1, arg2, arg5, arg4, var8.field858);
            }
            if (var8.field865 != 16) {
                arg6.method1637(arg0, arg1, arg2, var8.field865);
            }
        } else if (arg5 == 3) {
            class79 var31;
            if (var8.field849 == -1 && var8.field868 == null) {
                var31 = var8.method656(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1629(arg0, arg1, arg2, var16, var31, (class79) null, field82[arg4], 0, var19, var20);
            if (var8.field887) {
                if (arg4 == 0) {
                    Statics.field2020[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2020[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2020[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2020[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3595(arg1, arg2, arg5, arg4, var8.field858);
            }
        } else if (arg5 == 9) {
            class79 var32;
            if (var8.field849 == -1 && var8.field868 == null) {
                var32 = var8.method656(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1631(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3576(arg1, arg2, var9, var10, var8.field858);
            }
            if (var8.field865 != 16) {
                arg6.method1637(arg0, arg1, arg2, var8.field865);
            }
        } else if (arg5 == 4) {
            class79 var33;
            if (var8.field849 == -1 && var8.field868 == null) {
                var33 = var8.method656(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1733(arg0, arg1, arg2, var16, var33, (class79) null, field89[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1647(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class37.method1041(var35 >> 14 & 0x7FFF).field865;
            }
            class79 var36;
            if (var8.field849 == -1 && var8.field868 == null) {
                var36 = var8.method656(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1733(arg0, arg1, arg2, var16, var36, (class79) null, field89[arg4], 0, field83[arg4] * var34, field94[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1647(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class37.method1041(var38 >> 14 & 0x7FFF).field865 / 2;
            }
            class79 var39;
            if (var8.field849 == -1 && var8.field868 == null) {
                var39 = var8.method656(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1733(arg0, arg1, arg2, var16, var39, (class79) null, 256, arg4, field85[arg4] * var37, field91[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class79 var41;
            if (var8.field849 == -1 && var8.field868 == null) {
                var41 = var8.method656(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class11(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1733(arg0, arg1, arg2, var16, var41, (class79) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1647(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class37.method1041(var43 >> 14 & 0x7FFF).field865 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class79 var45;
            class79 var46;
            if (var8.field849 == -1 && var8.field868 == null) {
                var45 = var8.method656(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method656(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field849, true, (class79) null);
                var46 = new class11(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field849, true, (class79) null);
            }
            arg6.method1733(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field85[arg4] * var42, field91[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("d.f(IIII)I")
    public static int method490(int arg0, int arg1, int arg2) {
        if ((field77[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field77[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cu.l(IIII)I")
    public static final int method1798(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1341(var3, var5);
        int var8 = method1341(var3 + 1, var5);
        int var9 = method1341(var3, var5 + 1);
        int var10 = method1341(var3 + 1, var5 + 1);
        int var11 = method474(var7, var8, var4, arg2);
        int var12 = method474(var9, var10, var4, arg2);
        return method474(var11, var12, var6, arg2);
    }

    @ObfuscatedName("a.b(IIIIB)I")
    public static final int method474(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1473[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ba.k(III)I")
    public static final int method1341(int arg0, int arg1) {
        int var2 = method3406(arg0 - 1, arg1 - 1) + method3406(arg0 + 1, arg1 - 1) + method3406(arg0 - 1, arg1 + 1) + method3406(arg0 + 1, arg1 + 1);
        int var3 = method3406(arg0 - 1, arg1) + method3406(arg0 + 1, arg1) + method3406(arg0, arg1 - 1) + method3406(arg0, arg1 + 1);
        int var4 = method3406(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("gf.g(IIB)I")
    public static final int method3406(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("at.v(III)I")
    public static final int method528(int arg0, int arg1) {
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

    @ObfuscatedName("dz.i(III)I")
    public static final int method2444(int arg0, int arg1) {
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

    @ObfuscatedName("gz.x(IIII)I")
    public static final int method3383(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("fe.h(IIB)Z")
    public static final boolean method2926(int arg0, int arg1) {
        class37 var2 = class37.method1041(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method635(arg1);
    }

    @ObfuscatedName("ad.w(IIIIIIILck;Lhg;I)V")
    public static final void method731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class80 arg7, class209 arg8) {
        class37 var9 = class37.method1041(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field885;
            var11 = var9.field855;
        } else {
            var10 = var9.field855;
            var11 = var9.field885;
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
        if (var9.field886 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field880 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class79 var22;
            if (var9.field849 == -1 && var9.field868 == null) {
                var22 = var9.method638(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class11(arg4, 22, arg5, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1627(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field857 == 1) {
                arg8.method3581(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class79 var45;
            if (var9.field849 == -1 && var9.field868 == null) {
                var45 = var9.method638(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg4, 10, arg5, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            if (var45 != null) {
                arg7.method1631(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field857 != 0) {
                arg8.method3576(arg2, arg3, var10, var11, var9.field858);
            }
        } else if (arg6 >= 12) {
            class79 var23;
            if (var9.field849 == -1 && var9.field868 == null) {
                var23 = var9.method638(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1631(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3576(arg2, arg3, var10, var11, var9.field858);
            }
        } else if (arg6 == 0) {
            class79 var24;
            if (var9.field849 == -1 && var9.field868 == null) {
                var24 = var9.method638(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg4, 0, arg5, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1629(arg0, arg2, arg3, var17, var24, (class79) null, field89[arg5], 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3595(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 1) {
            class79 var25;
            if (var9.field849 == -1 && var9.field868 == null) {
                var25 = var9.method638(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg4, 1, arg5, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1629(arg0, arg2, arg3, var17, var25, (class79) null, field82[arg5], 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3595(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class79 var27;
            class79 var28;
            if (var9.field849 == -1 && var9.field868 == null) {
                var27 = var9.method638(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method638(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field849, true, (class79) null);
                var28 = new class11(arg4, 2, var26, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1629(arg0, arg2, arg3, var17, var27, var28, field89[arg5], field89[var26], var20, var21);
            if (var9.field857 != 0) {
                arg8.method3595(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 3) {
            class79 var29;
            if (var9.field849 == -1 && var9.field868 == null) {
                var29 = var9.method638(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg4, 3, arg5, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1629(arg0, arg2, arg3, var17, var29, (class79) null, field82[arg5], 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3595(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 9) {
            class79 var30;
            if (var9.field849 == -1 && var9.field868 == null) {
                var30 = var9.method638(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1631(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3576(arg2, arg3, var10, var11, var9.field858);
            }
        } else if (arg6 == 4) {
            class79 var31;
            if (var9.field849 == -1 && var9.field868 == null) {
                var31 = var9.method638(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1733(arg0, arg2, arg3, var17, var31, (class79) null, field89[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1647(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class37.method1041(var33 >> 14 & 0x7FFF).field865;
            }
            class79 var34;
            if (var9.field849 == -1 && var9.field868 == null) {
                var34 = var9.method638(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1733(arg0, arg2, arg3, var17, var34, (class79) null, field89[arg5], 0, field83[arg5] * var32, field94[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1647(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class37.method1041(var36 >> 14 & 0x7FFF).field865 / 2;
            }
            class79 var37;
            if (var9.field849 == -1 && var9.field868 == null) {
                var37 = var9.method638(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1733(arg0, arg2, arg3, var17, var37, (class79) null, 256, arg5, field85[arg5] * var35, field91[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class79 var39;
            if (var9.field849 == -1 && var9.field868 == null) {
                var39 = var9.method638(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1733(arg0, arg2, arg3, var17, var39, (class79) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1647(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class37.method1041(var41 >> 14 & 0x7FFF).field865 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class79 var43;
            class79 var44;
            if (var9.field849 == -1 && var9.field868 == null) {
                var43 = var9.method638(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method638(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field849, true, (class79) null);
                var44 = new class11(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field849, true, (class79) null);
            }
            arg7.method1733(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field85[arg5] * var40, field91[arg5] * var40, var20, var21);
        }
    }
}
