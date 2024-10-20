package deob;

@ObfuscatedName("u")
public final class class6 {

    @ObfuscatedName("u.n")
    public static int[][][] field101 = new int[4][105][105];

    @ObfuscatedName("u.q")
    public static byte[][][] field84 = new byte[4][104][104];

    @ObfuscatedName("u.c")
    public static int field85 = 99;

    @ObfuscatedName("u.z")
    public static final int[] field98 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("u.d")
    public static final int[] field104 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("u.a")
    public static final int[] field96 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("u.t")
    public static final int[] field97 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("u.k")
    public static final int[] field103 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("u.f")
    public static final int[] field99 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("u.g")
    public static int field100 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("u.i")
    public static int field95 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.n(I)V")
    public static void method999() {
        Statics.field3202 = (byte[][][]) null;
        Statics.field766 = (byte[][][]) null;
        Statics.field86 = (byte[][][]) null;
        Statics.field87 = (byte[][][]) null;
        Statics.field91 = (int[][][]) null;
        Statics.field93 = (byte[][][]) null;
        Statics.field1862 = (int[][]) null;
        Statics.field89 = null;
        Statics.field2884 = null;
        Statics.field2246 = null;
        Statics.field90 = null;
        Statics.field3132 = null;
    }

    @ObfuscatedName("da.q(IIIIB)V")
    public static final void method2623(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field93[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field101[0][var5][var4] = field101[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field101[0][var5][var4] = field101[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field101[0][var5][var4] = field101[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field101[0][var5][var4] = field101[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ey.c([BIIIIIII[Ldn;I)V")
    public static final void method2943(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1884[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class119 var11 = new class119(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class177.method657(var13 & 0x7, var14 & 0x7, arg7);
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
                        method1016(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method1016(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.l(Ldc;IIIIIII)V")
    public static final void method1016(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2360();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2360();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2360();
                }
            }
            return;
        }
        field84[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2360();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field101[0][arg2][arg3] = -method1778(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field101[arg1][arg2][arg3] = field101[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2360();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field101[0][arg2][arg3] = -var8 * 8;
                } else {
                    field101[arg1][arg2][arg3] = field101[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field766[arg1][arg2][arg3] = arg0.method2512();
                Statics.field86[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field87[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field84[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field3202[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dd.r(IIIIIILcl;Ldn;I)V")
    public static final void method2589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field293 && (field84[0][arg1][arg2] & 0x2) == 0 && (field84[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field85) {
            field85 = arg0;
        }
        class41 var8 = class41.method39(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field915;
            var10 = var8.field927;
        } else {
            var9 = var8.field927;
            var10 = var8.field915;
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
        int[][] var15 = field101[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field929 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field954 == 1) {
            var20 += 256;
        }
        if (var8.method810()) {
            class24.method2064(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field293 || var8.field929 != 0 || var8.field931 == 1 || var8.field952) {
                class85 var21;
                if (var8.field937 == -1 && var8.field964 == null) {
                    var21 = var8.method805(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
                }
                arg6.method1952(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field931 == 1 && arg7 != null) {
                    arg7.method2259(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var44;
            if (var8.field937 == -1 && var8.field964 == null) {
                var44 = var8.method805(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            if (var44 != null && arg6.method1797(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field948) {
                int var45 = 15;
                if (var44 instanceof class105) {
                    var45 = ((class105) var44).method2166() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field93[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field93[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, var9, var10, var8.field932);
            }
        } else if (arg5 >= 12) {
            class85 var22;
            if (var8.field937 == -1 && var8.field964 == null) {
                var22 = var8.method805(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1797(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field91[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, var9, var10, var8.field932);
            }
        } else if (arg5 == 0) {
            class85 var23;
            if (var8.field937 == -1 && var8.field964 == null) {
                var23 = var8.method805(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var23, (class85) null, field98[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field948) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field936) {
                    Statics.field91[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field948) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field936) {
                    Statics.field91[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field948) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field936) {
                    Statics.field91[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field948) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field936) {
                    Statics.field91[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field932);
            }
            if (var8.field938 != 16) {
                arg6.method1803(arg0, arg1, arg2, var8.field938);
            }
        } else if (arg5 == 1) {
            class85 var24;
            if (var8.field937 == -1 && var8.field964 == null) {
                var24 = var8.method805(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var24, (class85) null, field104[arg4], 0, var19, var20);
            if (var8.field948) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field932);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class85 var26;
            class85 var27;
            if (var8.field937 == -1 && var8.field964 == null) {
                var26 = var8.method805(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method805(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var26, var27, field98[arg4], field98[var25], var19, var20);
            if (var8.field936) {
                if (arg4 == 0) {
                    Statics.field91[arg0][arg1][arg2] |= 0x249;
                    Statics.field91[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field91[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field91[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field91[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field91[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field91[arg0][arg1][arg2] |= 0x492;
                    Statics.field91[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field932);
            }
            if (var8.field938 != 16) {
                arg6.method1803(arg0, arg1, arg2, var8.field938);
            }
        } else if (arg5 == 3) {
            class85 var28;
            if (var8.field937 == -1 && var8.field964 == null) {
                var28 = var8.method805(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var28, (class85) null, field104[arg4], 0, var19, var20);
            if (var8.field948) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field932);
            }
        } else if (arg5 == 9) {
            class85 var29;
            if (var8.field937 == -1 && var8.field964 == null) {
                var29 = var8.method805(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1797(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field931 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, var9, var10, var8.field932);
            }
            if (var8.field938 != 16) {
                arg6.method1803(arg0, arg1, arg2, var8.field938);
            }
        } else if (arg5 == 4) {
            class85 var30;
            if (var8.field937 == -1 && var8.field964 == null) {
                var30 = var8.method805(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var30, (class85) null, field98[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1906(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class41.method39(var32 >> 14 & 0x7FFF).field938;
            }
            class85 var33;
            if (var8.field937 == -1 && var8.field964 == null) {
                var33 = var8.method805(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var33, (class85) null, field98[arg4], 0, field96[arg4] * var31, field97[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1906(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method39(var35 >> 14 & 0x7FFF).field938 / 2;
            }
            class85 var36;
            if (var8.field937 == -1 && var8.field964 == null) {
                var36 = var8.method805(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var36, (class85) null, 256, arg4, field103[arg4] * var34, field99[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class85 var38;
            if (var8.field937 == -1 && var8.field964 == null) {
                var38 = var8.method805(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var38, (class85) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1906(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class41.method39(var40 >> 14 & 0x7FFF).field938 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class85 var42;
            class85 var43;
            if (var8.field937 == -1 && var8.field964 == null) {
                var42 = var8.method805(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method805(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field103[arg4] * var39, field99[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ey.u(Lcl;[Ldn;I)V")
    public static final void method2942(class86 arg0, class108[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field84[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field84[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2248(var3, var4);
                        }
                    }
                }
            }
        }
        field100 += (int) (Math.random() * 5.0D) - 2;
        if (field100 < -8) {
            field100 = -8;
        }
        if (field100 > 8) {
            field100 = 8;
        }
        field95 += (int) (Math.random() * 5.0D) - 2;
        if (field95 < -16) {
            field95 = -16;
        }
        if (field95 > 16) {
            field95 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field93[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field101[var6][var11 + 1][var10] - field101[var6][var11 - 1][var10];
                    int var13 = field101[var6][var11][var10 + 1] - field101[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1862[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field89[var20] = 0;
                Statics.field2884[var20] = 0;
                Statics.field2246[var20] = 0;
                Statics.field90[var20] = 0;
                Statics.field3132[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field3202[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class42 var25 = class42.method603(var24 - 1);
                            Statics.field89[var22] += var25.field970;
                            Statics.field2884[var22] += var25.field967;
                            Statics.field2246[var22] += var25.field972;
                            Statics.field90[var22] += var25.field973;
                            var10002 = Statics.field3132[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field3202[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class42 var28 = class42.method603(var27 - 1);
                            Statics.field89[var22] -= var28.field970;
                            Statics.field2884[var22] -= var28.field967;
                            Statics.field2246[var22] -= var28.field972;
                            Statics.field90[var22] -= var28.field973;
                            var10002 = Statics.field3132[var22]--;
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
                            var29 += Statics.field89[var35];
                            var30 += Statics.field2884[var35];
                            var31 += Statics.field2246[var35];
                            var32 += Statics.field90[var35];
                            var33 += Statics.field3132[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field89[var36];
                            var30 -= Statics.field2884[var36];
                            var31 -= Statics.field2246[var36];
                            var32 -= Statics.field90[var36];
                            var33 -= Statics.field3132[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field293 || (field84[0][var21][var34] & 0x2) != 0 || (field84[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field85) {
                                field85 = var6;
                            }
                            int var37 = Statics.field3202[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field766[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field101[var6][var21][var34];
                                int var40 = field101[var6][var21 + 1][var34];
                                int var41 = field101[var6][var21 + 1][var34 + 1];
                                int var42 = field101[var6][var21][var34 + 1];
                                int var43 = Statics.field1862[var21][var34];
                                int var44 = Statics.field1862[var21 + 1][var34];
                                int var45 = Statics.field1862[var21 + 1][var34 + 1];
                                int var46 = Statics.field1862[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method656(var49, var50, var51);
                                    int var52 = field100 + var49 & 0xFF;
                                    int var53 = field95 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method656(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field86[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class47.method108(var38 - 1).field1053) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field91[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class91.field1573[method758(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1792(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method758(var47, var43), method758(var47, var44), method758(var47, var45), method758(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field86[var6][var21][var34] + 1;
                                    byte var57 = Statics.field87[var6][var21][var34];
                                    class47 var58 = class47.method108(var38 - 1);
                                    int var59 = var58.field1052;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1564.method2020(var59);
                                        var61 = -1;
                                    } else if (var58.field1066 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method656(var58.field1055, var58.field1056, var58.field1057);
                                        int var62 = field100 + var58.field1055 & 0xFF;
                                        int var63 = field95 + var58.field1057;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method656(var62, var58.field1056, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class91.field1573[method1020(var60, 96)];
                                    }
                                    if (var58.field1063 != -1) {
                                        int var65 = field100 + var58.field1054 & 0xFF;
                                        int var66 = field95 + var58.field1060;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method656(var65, var58.field1049, var66);
                                        var64 = class91.field1573[method1020(var67, 96)];
                                    }
                                    arg0.method1792(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method758(var47, var43), method758(var47, var44), method758(var47, var45), method758(var47, var46), method1020(var61, var43), method1020(var61, var44), method1020(var61, var45), method1020(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field84[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field84[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method1890(var6, var69, var68, var74);
                }
            }
            Statics.field3202[var6] = (byte[][]) null;
            Statics.field766[var6] = (byte[][]) null;
            Statics.field86[var6] = (byte[][]) null;
            Statics.field87[var6] = (byte[][]) null;
            Statics.field93[var6] = (byte[][]) null;
        }
        arg0.method1870(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field84[1][var75][var76] & 0x2) == 2) {
                    arg0.method1839(var75, var76);
                }
            }
        }
        int var77 = 1;
        int var78 = 2;
        int var79 = 4;
        for (int var80 = 0; var80 < 4; var80++) {
            if (var80 > 0) {
                var77 <<= 0x3;
                var78 <<= 0x3;
                var79 <<= 0x3;
            }
            for (int var81 = 0; var81 <= var80; var81++) {
                for (int var82 = 0; var82 <= 104; var82++) {
                    for (int var83 = 0; var83 <= 104; var83++) {
                        if ((Statics.field91[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field91[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field91[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field91[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field91[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field101[var87][var83][var84] - var91;
                                int var93 = field101[var86][var83][var84];
                                class86.method1790(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field91[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field91[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field91[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field91[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field91[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field91[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field101[var99][var96][var82] - var103;
                                int var105 = field101[var98][var96][var82];
                                class86.method1790(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field91[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field91[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field91[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field91[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field91[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field91[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field101[var81][var108][var110];
                                class86.method1790(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field91[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ck.j(IIS)I")
    public static final int method1778(int arg0, int arg1) {
        int var2 = method128(arg0 + 45365, arg1 + 91923, 4) - 128 + (method128(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method128(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("h.w(IIIB)I")
    public static final int method128(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method797(var3, var5);
        int var8 = method797(var3 + 1, var5);
        int var9 = method797(var3, var5 + 1);
        int var10 = method797(var3 + 1, var5 + 1);
        int var11 = 65536 - class91.field1576[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class91.field1576[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        return method2688(var12, var15, var6, arg2);
    }

    @ObfuscatedName("eh.y(IIIII)I")
    public static final int method2688(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class91.field1576[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ao.o(III)I")
    public static final int method797(int arg0, int arg1) {
        int var2 = method3206(arg0 - 1, arg1 - 1) + method3206(arg0 + 1, arg1 - 1) + method3206(arg0 - 1, arg1 + 1) + method3206(arg0 + 1, arg1 + 1);
        int var3 = method3206(arg0 - 1, arg1) + method3206(arg0 + 1, arg1) + method3206(arg0, arg1 - 1) + method3206(arg0, arg1 + 1);
        int var4 = method3206(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("fb.h(III)I")
    public static final int method3206(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ai.e(III)I")
    public static final int method758(int arg0, int arg1) {
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

    @ObfuscatedName("aq.v(III)I")
    public static final int method1020(int arg0, int arg1) {
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

    @ObfuscatedName("ac.p(IIIB)I")
    public static final int method656(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ft.m(IIB)Z")
    public static final boolean method3219(int arg0, int arg1) {
        class41 var2 = class41.method39(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method809(arg1);
    }
}
