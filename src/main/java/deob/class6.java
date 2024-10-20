package deob;

@ObfuscatedName("n")
public final class class6 {

    @ObfuscatedName("n.b")
    public static int[][][] field74 = new int[4][105][105];

    @ObfuscatedName("n.u")
    public static byte[][][] field75 = new byte[4][104][104];

    @ObfuscatedName("n.x")
    public static int field76 = 99;

    @ObfuscatedName("n.h")
    public static final int[] field85 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("n.a")
    public static final int[] field86 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("n.w")
    public static final int[] field87 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("n.z")
    public static final int[] field94 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("n.v")
    public static final int[] field89 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("n.s")
    public static final int[] field92 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("n.r")
    public static int field88 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("n.d")
    public static int field91 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fm.b(I)V")
    public static void method2987() {
        field76 = 99;
        Statics.field77 = new byte[4][104][104];
        Statics.field78 = new byte[4][104][104];
        Statics.field79 = new byte[4][104][104];
        Statics.field80 = new byte[4][104][104];
        Statics.field1341 = new int[4][105][105];
        Statics.field230 = new byte[4][105][105];
        Statics.field81 = new int[105][105];
        Statics.field82 = new int[104];
        Statics.field575 = new int[104];
        Statics.field11 = new int[104];
        Statics.field788 = new int[104];
        Statics.field83 = new int[104];
    }

    @ObfuscatedName("w.u(IIIIB)V")
    public static final void method503(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field230[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field74[0][var5][var4] = field74[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field74[0][var5][var4] = field74[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field74[0][var5][var4] = field74[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field74[0][var5][var4] = field74[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.x([BIIIIIII[Lgt;I)V")
    public static final void method830(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class195[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2932[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class107 var11 = new class107(arg0);
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
                        method566(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method566(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.j(IIIB)V")
    public static final void method95(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field74[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field74[arg0][arg1][arg2 + var5] = field74[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field74[arg0][arg1 + var6][arg2] = field74[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field74[arg0][arg1 - 1][arg2] != 0) {
            field74[arg0][arg1][arg2] = field74[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field74[arg0][arg1][arg2 - 1] != 0) {
            field74[arg0][arg1][arg2] = field74[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field74[arg0][arg1 - 1][arg2 - 1] != 0) {
            field74[arg0][arg1][arg2] = field74[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("au.o(Ldh;IIIIIII)V")
    public static final void method566(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2134();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2134();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2134();
                }
            }
            return;
        }
        field75[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2134();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field74[0][arg2][arg3] = -method1609(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field74[arg1][arg2][arg3] = field74[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2134();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field74[0][arg2][arg3] = -var8 * 8;
                } else {
                    field74[arg1][arg2][arg3] = field74[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field78[arg1][arg2][arg3] = arg0.method2135();
                Statics.field79[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field80[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field75[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field77[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ay.y([BIIIIIIILci;[Lgt;B)V")
    public static final void method584(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79 arg8, class195[] arg9) {
        class107 var10 = new class107(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2147();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2147();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2134();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class36 var21 = class36.method28(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field879;
                    int var27 = var21.field873;
                    if ((var20 & 0x1) == 1) {
                        int var28 = var26;
                        var26 = var27;
                        var27 = var28;
                    }
                    int var29 = arg7 & 0x3;
                    int var30;
                    if (var29 == 0) {
                        var30 = var23;
                    } else if (var29 == 1) {
                        var30 = var24;
                    } else if (var29 == 2) {
                        var30 = 7 - var23 - (var26 - 1);
                    } else {
                        var30 = 7 - var24 - (var27 - 1);
                    }
                    int var31 = arg2 + var30;
                    int var32 = arg3 + class155.method2408(var16 & 0x7, var15 & 0x7, arg7, var21.field879, var21.field873, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field75[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class195 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method9(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.f(IIIIIILci;Lgt;B)V")
    public static final void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class195 arg7) {
        if (client.field264 && (field75[0][arg1][arg2] & 0x2) == 0) {
            if ((field75[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2863(arg0, arg1, arg2) != client.field312) {
                return;
            }
        }
        if (arg0 < field76) {
            field76 = arg0;
        }
        class36 var8 = class36.method28(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field873;
            var10 = var8.field879;
        } else {
            var9 = var8.field879;
            var10 = var8.field873;
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
        int[][] var15 = field74[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field849 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field851 == 1) {
            var20 += 256;
        }
        if (var8.method648()) {
            class20 var21 = new class20();
            var21.field549 = arg0;
            var21.field543 = arg1 * 128;
            var21.field544 = arg2 * 128;
            int var22 = var8.field879;
            int var23 = var8.field873;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field873;
                var23 = var8.field879;
            }
            var21.field545 = (arg1 + var22) * 128;
            var21.field546 = (arg2 + var23) * 128;
            var21.field548 = var8.field877;
            var21.field547 = var8.field878 * 128;
            var21.field555 = var8.field869;
            var21.field554 = var8.field880;
            var21.field552 = var8.field881;
            if (var8.field852 != null) {
                var21.field551 = var8;
                var21.method491();
            }
            class20.field541.method3180(var21);
            if (var21.field552 != null) {
                var21.field553 = var21.field555 + (int) (Math.random() * (double) (var21.field554 - var21.field555));
            }
        }
        if (arg5 == 22) {
            if (!client.field264 || var8.field849 != 0 || var8.field850 == 1 || var8.field848) {
                class78 var24;
                if (var8.field856 == -1 && var8.field852 == null) {
                    var24 = var8.method643(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field856, true, (class78) null);
                }
                arg6.method1643(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field850 == 1 && arg7 != null) {
                    arg7.method3467(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var47;
            if (var8.field856 == -1 && var8.field852 == null) {
                var47 = var8.method643(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            if (var47 != null && arg6.method1657(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field864) {
                int var48 = 15;
                if (var47 instanceof class98) {
                    var48 = ((class98) var47).method2020() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field230[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field230[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3443(arg1, arg2, var9, var10, var8.field875);
            }
        } else if (arg5 >= 12) {
            class78 var25;
            if (var8.field856 == -1 && var8.field852 == null) {
                var25 = var8.method643(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1657(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1341[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3443(arg1, arg2, var9, var10, var8.field875);
            }
        } else if (arg5 == 0) {
            class78 var26;
            if (var8.field856 == -1 && var8.field852 == null) {
                var26 = var8.method643(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1631(arg0, arg1, arg2, var16, var26, (class78) null, field85[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field864) {
                    Statics.field230[arg0][arg1][arg2] = 50;
                    Statics.field230[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field866) {
                    Statics.field1341[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field864) {
                    Statics.field230[arg0][arg1][arg2 + 1] = 50;
                    Statics.field230[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field866) {
                    Statics.field1341[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field864) {
                    Statics.field230[arg0][arg1 + 1][arg2] = 50;
                    Statics.field230[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field866) {
                    Statics.field1341[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field864) {
                    Statics.field230[arg0][arg1][arg2] = 50;
                    Statics.field230[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field866) {
                    Statics.field1341[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3442(arg1, arg2, arg5, arg4, var8.field875);
            }
            if (var8.field868 != 16) {
                arg6.method1625(arg0, arg1, arg2, var8.field868);
            }
        } else if (arg5 == 1) {
            class78 var27;
            if (var8.field856 == -1 && var8.field852 == null) {
                var27 = var8.method643(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1631(arg0, arg1, arg2, var16, var27, (class78) null, field86[arg4], 0, var19, var20);
            if (var8.field864) {
                if (arg4 == 0) {
                    Statics.field230[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field230[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field230[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field230[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3442(arg1, arg2, arg5, arg4, var8.field875);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class78 var29;
            class78 var30;
            if (var8.field856 == -1 && var8.field852 == null) {
                var29 = var8.method643(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method643(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field856, true, (class78) null);
                var30 = new class11(arg3, 2, var28, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1631(arg0, arg1, arg2, var16, var29, var30, field85[arg4], field85[var28], var19, var20);
            if (var8.field866) {
                if (arg4 == 0) {
                    Statics.field1341[arg0][arg1][arg2] |= 0x249;
                    Statics.field1341[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1341[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1341[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1341[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1341[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1341[arg0][arg1][arg2] |= 0x492;
                    Statics.field1341[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3442(arg1, arg2, arg5, arg4, var8.field875);
            }
            if (var8.field868 != 16) {
                arg6.method1625(arg0, arg1, arg2, var8.field868);
            }
        } else if (arg5 == 3) {
            class78 var31;
            if (var8.field856 == -1 && var8.field852 == null) {
                var31 = var8.method643(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1631(arg0, arg1, arg2, var16, var31, (class78) null, field86[arg4], 0, var19, var20);
            if (var8.field864) {
                if (arg4 == 0) {
                    Statics.field230[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field230[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field230[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field230[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3442(arg1, arg2, arg5, arg4, var8.field875);
            }
        } else if (arg5 == 9) {
            class78 var32;
            if (var8.field856 == -1 && var8.field852 == null) {
                var32 = var8.method643(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1657(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3443(arg1, arg2, var9, var10, var8.field875);
            }
            if (var8.field868 != 16) {
                arg6.method1625(arg0, arg1, arg2, var8.field868);
            }
        } else if (arg5 == 4) {
            class78 var33;
            if (var8.field856 == -1 && var8.field852 == null) {
                var33 = var8.method643(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1641(arg0, arg1, arg2, var16, var33, (class78) null, field85[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1689(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class36.method28(var35 >> 14 & 0x7FFF).field868;
            }
            class78 var36;
            if (var8.field856 == -1 && var8.field852 == null) {
                var36 = var8.method643(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1641(arg0, arg1, arg2, var16, var36, (class78) null, field85[arg4], 0, field87[arg4] * var34, field94[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1689(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class36.method28(var38 >> 14 & 0x7FFF).field868 / 2;
            }
            class78 var39;
            if (var8.field856 == -1 && var8.field852 == null) {
                var39 = var8.method643(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1641(arg0, arg1, arg2, var16, var39, (class78) null, 256, arg4, field89[arg4] * var37, field92[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class78 var41;
            if (var8.field856 == -1 && var8.field852 == null) {
                var41 = var8.method643(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class11(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1641(arg0, arg1, arg2, var16, var41, (class78) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1689(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class36.method28(var43 >> 14 & 0x7FFF).field868 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class78 var45;
            class78 var46;
            if (var8.field856 == -1 && var8.field852 == null) {
                var45 = var8.method643(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method643(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field856, true, (class78) null);
                var46 = new class11(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field856, true, (class78) null);
            }
            arg6.method1641(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field89[arg4] * var42, field92[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("ca.p(Lci;[Lgt;I)V")
    public static final void method2066(class79 arg0, class195[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field75[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field75[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3476(var3, var4);
                        }
                    }
                }
            }
        }
        field88 += (int) (Math.random() * 5.0D) - 2;
        if (field88 < -8) {
            field88 = -8;
        }
        if (field88 > 8) {
            field88 = 8;
        }
        field91 += (int) (Math.random() * 5.0D) - 2;
        if (field91 < -16) {
            field91 = -16;
        }
        if (field91 > 16) {
            field91 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field230[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field74[var6][var11 + 1][var10] - field74[var6][var11 - 1][var10];
                    int var13 = field74[var6][var11][var10 + 1] - field74[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field81[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field82[var20] = 0;
                Statics.field575[var20] = 0;
                Statics.field11[var20] = 0;
                Statics.field788[var20] = 0;
                Statics.field83[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field77[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class37 var26 = (class37) class37.field886.method3114((long) var25);
                            class37 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field892.method2692(1, var25);
                                class37 var29 = new class37();
                                if (var28 != null) {
                                    var29.method680(new class107(var28), var25);
                                }
                                var29.method685();
                                class37.field886.method3116(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field82[var22] += var27.field888;
                            Statics.field575[var22] += var27.field891;
                            Statics.field11[var22] += var27.field890;
                            Statics.field788[var22] += var27.field898;
                            var10002 = Statics.field83[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field77[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class37 var34 = (class37) class37.field886.method3114((long) var33);
                            class37 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field892.method2692(1, var33);
                                class37 var37 = new class37();
                                if (var36 != null) {
                                    var37.method680(new class107(var36), var33);
                                }
                                var37.method685();
                                class37.field886.method3116(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field82[var22] -= var35.field888;
                            Statics.field575[var22] -= var35.field891;
                            Statics.field11[var22] -= var35.field890;
                            Statics.field788[var22] -= var35.field898;
                            var10002 = Statics.field83[var22]--;
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
                            var39 += Statics.field82[var45];
                            var40 += Statics.field575[var45];
                            var41 += Statics.field11[var45];
                            var42 += Statics.field788[var45];
                            var43 += Statics.field83[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field82[var46];
                            var40 -= Statics.field575[var46];
                            var41 -= Statics.field11[var46];
                            var42 -= Statics.field788[var46];
                            var43 -= Statics.field83[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field264 || (field75[0][var21][var44] & 0x2) != 0 || (field75[var6][var21][var44] & 0x10) == 0 && method2863(var6, var21, var44) == client.field312)) {
                            if (var6 < field76) {
                                field76 = var6;
                            }
                            int var47 = Statics.field77[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field78[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field74[var6][var21][var44];
                                int var50 = field74[var6][var21 + 1][var44];
                                int var51 = field74[var6][var21 + 1][var44 + 1];
                                int var52 = field74[var6][var21][var44 + 1];
                                int var53 = Statics.field81[var21][var44];
                                int var54 = Statics.field81[var21 + 1][var44];
                                int var55 = Statics.field81[var21 + 1][var44 + 1];
                                int var56 = Statics.field81[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method27(var59, var60, var61);
                                    int var62 = field88 + var59 & 0xFF;
                                    int var63 = field91 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method27(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field79[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class41.method1613(var48 - 1).field966) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field1341[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class84.field1482[method132(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1628(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method132(var57, var53), method132(var57, var54), method132(var57, var55), method132(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field79[var6][var21][var44] + 1;
                                    byte var67 = Statics.field80[var6][var21][var44];
                                    class41 var68 = class41.method1613(var48 - 1);
                                    int var69 = var68.field965;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1460.method1854(var69);
                                        var71 = -1;
                                    } else if (var68.field962 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method27(var68.field968, var68.field972, var68.field975);
                                        int var72 = field88 + var68.field968 & 0xFF;
                                        int var73 = field91 + var68.field975;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method27(var72, var68.field972, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class84.field1482[Statics.method1405(var70, 96)];
                                    }
                                    if (var68.field967 != -1) {
                                        int var75 = field88 + var68.field970 & 0xFF;
                                        int var76 = field91 + var68.field973;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method27(var75, var68.field969, var76);
                                        var74 = class84.field1482[Statics.method1405(var77, 96)];
                                    }
                                    arg0.method1628(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method132(var57, var53), method132(var57, var54), method132(var57, var55), method132(var57, var56), Statics.method1405(var71, var53), Statics.method1405(var71, var54), Statics.method1405(var71, var55), Statics.method1405(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1627(var6, var79, var78, method2863(var6, var79, var78));
                }
            }
            Statics.field77[var6] = (byte[][]) null;
            Statics.field78[var6] = (byte[][]) null;
            Statics.field79[var6] = (byte[][]) null;
            Statics.field80[var6] = (byte[][]) null;
            Statics.field230[var6] = (byte[][]) null;
        }
        arg0.method1654(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field75[1][var80][var81] & 0x2) == 2) {
                    arg0.method1648(var80, var81);
                }
            }
        }
        int var82 = 1;
        int var83 = 2;
        int var84 = 4;
        for (int var85 = 0; var85 < 4; var85++) {
            if (var85 > 0) {
                var82 <<= 0x3;
                var83 <<= 0x3;
                var84 <<= 0x3;
            }
            for (int var86 = 0; var86 <= var85; var86++) {
                for (int var87 = 0; var87 <= 104; var87++) {
                    for (int var88 = 0; var88 <= 104; var88++) {
                        if ((Statics.field1341[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field1341[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field1341[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label357: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field1341[var91 - 1][var88][var93] & var82) == 0) {
                                        break label357;
                                    }
                                }
                                var91--;
                            }
                            label346: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field1341[var92 + 1][var88][var94] & var82) == 0) {
                                        break label346;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field74[var92][var88][var89] - var96;
                                int var98 = field74[var91][var88][var89];
                                class79.method1626(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field1341[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1341[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field1341[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field1341[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label410: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field1341[var103 - 1][var105][var87] & var83) == 0) {
                                        break label410;
                                    }
                                }
                                var103--;
                            }
                            label399: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field1341[var104 + 1][var106][var87] & var83) == 0) {
                                        break label399;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field74[var104][var101][var87] - var108;
                                int var110 = field74[var103][var101][var87];
                                class79.method1626(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field1341[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1341[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field1341[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field1341[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label463: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field1341[var86][var113 - 1][var117] & var84) == 0) {
                                        break label463;
                                    }
                                }
                                var113--;
                            }
                            label452: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field1341[var86][var114 + 1][var118] & var84) == 0) {
                                        break label452;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field74[var86][var113][var115];
                                class79.method1626(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field1341[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ez.l(IIII)I")
    public static int method2863(int arg0, int arg1, int arg2) {
        if ((field75[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field75[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ba.k(IIB)I")
    public static final int method1609(int arg0, int arg1) {
        int var2 = method4(arg0 + 45365, arg1 + 91923, 4) - 128 + (method4(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method4(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("b.q(IIII)I")
    public static final int method4(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2867(var3, var5);
        int var8 = method2867(var3 + 1, var5);
        int var9 = method2867(var3, var5 + 1);
        int var10 = method2867(var3 + 1, var5 + 1);
        int var11 = method162(var7, var8, var4, arg2);
        int var12 = method162(var9, var10, var4, arg2);
        return method162(var11, var12, var6, arg2);
    }

    @ObfuscatedName("c.e(IIIII)I")
    public static final int method162(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1484[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ez.t(III)I")
    public static final int method2867(int arg0, int arg1) {
        int var2 = method693(arg0 - 1, arg1 - 1) + method693(arg0 + 1, arg1 - 1) + method693(arg0 - 1, arg1 + 1) + method693(arg0 + 1, arg1 + 1);
        int var3 = method693(arg0 - 1, arg1) + method693(arg0 + 1, arg1) + method693(arg0, arg1 - 1) + method693(arg0, arg1 + 1);
        int var4 = method693(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("aj.g(III)I")
    public static final int method693(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("q.c(III)I")
    public static final int method132(int arg0, int arg1) {
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

    @ObfuscatedName("o.i(IIIB)I")
    public static final int method27(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ce.h(IIB)Z")
    public static final boolean method2055(int arg0, int arg1) {
        class36 var2 = class36.method28(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method661(arg1);
    }
}
