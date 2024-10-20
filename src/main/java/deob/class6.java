package deob;

@ObfuscatedName("u")
public final class class6 {

    @ObfuscatedName("u.i")
    public static int[][][] field96 = new int[4][105][105];

    @ObfuscatedName("u.h")
    public static byte[][][] field86 = new byte[4][104][104];

    @ObfuscatedName("u.e")
    public static int field87 = 99;

    @ObfuscatedName("u.k")
    public static final int[] field106 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("u.z")
    public static final int[] field98 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("u.q")
    public static final int[] field99 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("u.o")
    public static final int[] field100 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("u.f")
    public static final int[] field101 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("u.b")
    public static final int[] field102 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("u.t")
    public static int field107 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("u.a")
    public static int field88 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cj.i(S)V")
    public static void method1626() {
        field87 = 99;
        Statics.field103 = new byte[4][104][104];
        Statics.field89 = new byte[4][104][104];
        Statics.field90 = new byte[4][104][104];
        Statics.field91 = new byte[4][104][104];
        Statics.field108 = new int[4][105][105];
        Statics.field802 = new byte[4][105][105];
        Statics.field92 = new int[105][105];
        Statics.field93 = new int[104];
        Statics.field2752 = new int[104];
        Statics.field94 = new int[104];
        Statics.field95 = new int[104];
        Statics.field2 = new int[104];
    }

    @ObfuscatedName("ar.h(IIIII)V")
    public static final void method731(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field802[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field96[0][var5][var4] = field96[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field96[0][var5][var4] = field96[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field96[0][var5][var4] = field96[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field96[0][var5][var4] = field96[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.e([BIIIIIII[Lda;B)V")
    public static final void method2678(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class112[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1951[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class123 var11 = new class123(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method2988(var11, arg1, arg2 + class181.method3188(var13 & 0x7, var14 & 0x7, arg7), arg3 + class181.method2837(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2988(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fy.g(Ldn;IIIIIII)V")
    public static final void method2988(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2404();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2404();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2404();
                }
            }
            return;
        }
        field86[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2404();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field96[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method174(var10 + 45365, var11 + 91923, 4) - 128 + (method174(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method174(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field96[arg1][arg2][arg3] = field96[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2404();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field96[0][arg2][arg3] = -var15 * 8;
                } else {
                    field96[arg1][arg2][arg3] = field96[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field89[arg1][arg2][arg3] = arg0.method2405();
                Statics.field90[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field91[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field86[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field103[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("o.n(IIIIIILcx;Lda;I)V")
    public static final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, class112 arg7) {
        if (client.field305 && (field86[0][arg1][arg2] & 0x2) == 0 && (field86[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field87) {
            field87 = arg0;
        }
        class43 var8 = class43.method117(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field961;
            var10 = var8.field960;
        } else {
            var9 = var8.field960;
            var10 = var8.field961;
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
        int[][] var15 = field96[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field964 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field985 == 1) {
            var20 += 256;
        }
        if (var8.method815()) {
            class25.method643(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field305 || var8.field964 != 0 || var8.field962 == 1 || var8.field983) {
                class89 var21;
                if (var8.field956 == -1 && var8.field986 == null) {
                    var21 = var8.method810(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field956, true, (class89) null);
                }
                arg6.method1946(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field962 == 1 && arg7 != null) {
                    arg7.method2287(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class89 var44;
            if (var8.field956 == -1 && var8.field986 == null) {
                var44 = var8.method810(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            if (var44 != null && arg6.method1844(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field976) {
                int var45 = 15;
                if (var44 instanceof class109) {
                    var45 = ((class109) var44).method2206() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field802[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field802[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field962 != 0 && arg7 != null) {
                arg7.method2284(arg1, arg2, var9, var10, var8.field963);
            }
        } else if (arg5 >= 12) {
            class89 var22;
            if (var8.field956 == -1 && var8.field986 == null) {
                var22 = var8.method810(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1844(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field108[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field962 != 0 && arg7 != null) {
                arg7.method2284(arg1, arg2, var9, var10, var8.field963);
            }
        } else if (arg5 == 0) {
            class89 var23;
            if (var8.field956 == -1 && var8.field986 == null) {
                var23 = var8.method810(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1842(arg0, arg1, arg2, var16, var23, (class89) null, field106[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field976) {
                    Statics.field802[arg0][arg1][arg2] = 50;
                    Statics.field802[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field967) {
                    Statics.field108[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field976) {
                    Statics.field802[arg0][arg1][arg2 + 1] = 50;
                    Statics.field802[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field967) {
                    Statics.field108[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field976) {
                    Statics.field802[arg0][arg1 + 1][arg2] = 50;
                    Statics.field802[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field967) {
                    Statics.field108[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field976) {
                    Statics.field802[arg0][arg1][arg2] = 50;
                    Statics.field802[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field967) {
                    Statics.field108[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field962 != 0 && arg7 != null) {
                arg7.method2303(arg1, arg2, arg5, arg4, var8.field963);
            }
            if (var8.field945 != 16) {
                arg6.method1995(arg0, arg1, arg2, var8.field945);
            }
        } else if (arg5 == 1) {
            class89 var24;
            if (var8.field956 == -1 && var8.field986 == null) {
                var24 = var8.method810(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1842(arg0, arg1, arg2, var16, var24, (class89) null, field98[arg4], 0, var19, var20);
            if (var8.field976) {
                if (arg4 == 0) {
                    Statics.field802[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field802[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field802[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field802[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field962 != 0 && arg7 != null) {
                arg7.method2303(arg1, arg2, arg5, arg4, var8.field963);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class89 var26;
            class89 var27;
            if (var8.field956 == -1 && var8.field986 == null) {
                var26 = var8.method810(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method810(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field956, true, (class89) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1842(arg0, arg1, arg2, var16, var26, var27, field106[arg4], field106[var25], var19, var20);
            if (var8.field967) {
                if (arg4 == 0) {
                    Statics.field108[arg0][arg1][arg2] |= 0x249;
                    Statics.field108[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field108[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field108[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field108[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field108[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field108[arg0][arg1][arg2] |= 0x492;
                    Statics.field108[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field962 != 0 && arg7 != null) {
                arg7.method2303(arg1, arg2, arg5, arg4, var8.field963);
            }
            if (var8.field945 != 16) {
                arg6.method1995(arg0, arg1, arg2, var8.field945);
            }
        } else if (arg5 == 3) {
            class89 var28;
            if (var8.field956 == -1 && var8.field986 == null) {
                var28 = var8.method810(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1842(arg0, arg1, arg2, var16, var28, (class89) null, field98[arg4], 0, var19, var20);
            if (var8.field976) {
                if (arg4 == 0) {
                    Statics.field802[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field802[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field802[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field802[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field962 != 0 && arg7 != null) {
                arg7.method2303(arg1, arg2, arg5, arg4, var8.field963);
            }
        } else if (arg5 == 9) {
            class89 var29;
            if (var8.field956 == -1 && var8.field986 == null) {
                var29 = var8.method810(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1844(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field962 != 0 && arg7 != null) {
                arg7.method2284(arg1, arg2, var9, var10, var8.field963);
            }
            if (var8.field945 != 16) {
                arg6.method1995(arg0, arg1, arg2, var8.field945);
            }
        } else if (arg5 == 4) {
            class89 var30;
            if (var8.field956 == -1 && var8.field986 == null) {
                var30 = var8.method810(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1843(arg0, arg1, arg2, var16, var30, (class89) null, field106[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1860(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class43.method117(var32 >> 14 & 0x7FFF).field945;
            }
            class89 var33;
            if (var8.field956 == -1 && var8.field986 == null) {
                var33 = var8.method810(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1843(arg0, arg1, arg2, var16, var33, (class89) null, field106[arg4], 0, field99[arg4] * var31, field100[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1860(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class43.method117(var35 >> 14 & 0x7FFF).field945 / 2;
            }
            class89 var36;
            if (var8.field956 == -1 && var8.field986 == null) {
                var36 = var8.method810(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1843(arg0, arg1, arg2, var16, var36, (class89) null, 256, arg4, field101[arg4] * var34, field102[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class89 var38;
            if (var8.field956 == -1 && var8.field986 == null) {
                var38 = var8.method810(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1843(arg0, arg1, arg2, var16, var38, (class89) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1860(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class43.method117(var40 >> 14 & 0x7FFF).field945 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class89 var42;
            class89 var43;
            if (var8.field956 == -1 && var8.field986 == null) {
                var42 = var8.method810(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method810(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field956, true, (class89) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field956, true, (class89) null);
            }
            arg6.method1843(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field101[arg4] * var39, field102[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("z.u(Lcx;[Lda;I)V")
    public static final void method225(class90 arg0, class112[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field86[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field86[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2286(var3, var4);
                        }
                    }
                }
            }
        }
        field107 += (int) (Math.random() * 5.0D) - 2;
        if (field107 < -8) {
            field107 = -8;
        }
        if (field107 > 8) {
            field107 = 8;
        }
        field88 += (int) (Math.random() * 5.0D) - 2;
        if (field88 < -16) {
            field88 = -16;
        }
        if (field88 > 16) {
            field88 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field802[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field96[var6][var11 + 1][var10] - field96[var6][var11 - 1][var10];
                    int var13 = field96[var6][var11][var10 + 1] - field96[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field92[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field93[var20] = 0;
                Statics.field2752[var20] = 0;
                Statics.field94[var20] = 0;
                Statics.field95[var20] = 0;
                Statics.field2[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field103[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class44 var26 = (class44) class44.field997.method3541((long) var25);
                            class44 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field1001.method3086(1, var25);
                                class44 var29 = new class44();
                                if (var28 != null) {
                                    var29.method860(new class123(var28), var25);
                                }
                                var29.method849();
                                class44.field997.method3532(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field93[var22] += var27.field1006;
                            Statics.field2752[var22] += var27.field1000;
                            Statics.field94[var22] += var27.field999;
                            Statics.field95[var22] += var27.field1002;
                            var10002 = Statics.field2[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field103[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class44 var34 = (class44) class44.field997.method3541((long) var33);
                            class44 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field1001.method3086(1, var33);
                                class44 var37 = new class44();
                                if (var36 != null) {
                                    var37.method860(new class123(var36), var33);
                                }
                                var37.method849();
                                class44.field997.method3532(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field93[var22] -= var35.field1006;
                            Statics.field2752[var22] -= var35.field1000;
                            Statics.field94[var22] -= var35.field999;
                            Statics.field95[var22] -= var35.field1002;
                            var10002 = Statics.field2[var22]--;
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
                            var39 += Statics.field93[var45];
                            var40 += Statics.field2752[var45];
                            var41 += Statics.field94[var45];
                            var42 += Statics.field95[var45];
                            var43 += Statics.field2[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field93[var46];
                            var40 -= Statics.field2752[var46];
                            var41 -= Statics.field94[var46];
                            var42 -= Statics.field95[var46];
                            var43 -= Statics.field2[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field305 || (field86[0][var21][var44] & 0x2) != 0 || (field86[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field87) {
                                field87 = var6;
                            }
                            int var47 = Statics.field103[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field89[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field96[var6][var21][var44];
                                int var50 = field96[var6][var21 + 1][var44];
                                int var51 = field96[var6][var21 + 1][var44 + 1];
                                int var52 = field96[var6][var21][var44 + 1];
                                int var53 = Statics.field92[var21][var44];
                                int var54 = Statics.field92[var21 + 1][var44];
                                int var55 = Statics.field92[var21 + 1][var44 + 1];
                                int var56 = Statics.field92[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method656(var59, var60, var61);
                                    int var62 = field107 + var59 & 0xFF;
                                    int var63 = field88 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method656(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field90[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class49.method194(var48 - 1).field1069) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field108[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class95.field1638[method1031(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1839(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1031(var57, var53), method1031(var57, var54), method1031(var57, var55), method1031(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field90[var6][var21][var44] + 1;
                                    byte var67 = Statics.field91[var6][var21][var44];
                                    class49 var68 = class49.method194(var48 - 1);
                                    int var69 = var68.field1070;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1639.method2080(var69);
                                        var71 = -1;
                                    } else if (var68.field1073 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method656(var68.field1075, var68.field1074, var68.field1076);
                                        int var72 = field107 + var68.field1075 & 0xFF;
                                        int var73 = field88 + var68.field1076;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method656(var72, var68.field1074, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class95.field1638[method751(var70, 96)];
                                    }
                                    if (var68.field1071 != -1) {
                                        int var75 = field107 + var68.field1067 & 0xFF;
                                        int var76 = field88 + var68.field1078;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method656(var75, var68.field1077, var76);
                                        var74 = class95.field1638[method751(var77, 96)];
                                    }
                                    arg0.method1839(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method1031(var57, var53), method1031(var57, var54), method1031(var57, var55), method1031(var57, var56), method751(var71, var53), method751(var71, var54), method751(var71, var55), method751(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field86[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field86[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method1891(var6, var79, var78, var84);
                }
            }
            Statics.field103[var6] = (byte[][]) null;
            Statics.field89[var6] = (byte[][]) null;
            Statics.field90[var6] = (byte[][]) null;
            Statics.field91[var6] = (byte[][]) null;
            Statics.field802[var6] = (byte[][]) null;
        }
        arg0.method1865(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field86[1][var85][var86] & 0x2) == 2) {
                    arg0.method1836(var85, var86);
                }
            }
        }
        int var87 = 1;
        int var88 = 2;
        int var89 = 4;
        for (int var90 = 0; var90 < 4; var90++) {
            if (var90 > 0) {
                var87 <<= 0x3;
                var88 <<= 0x3;
                var89 <<= 0x3;
            }
            for (int var91 = 0; var91 <= var90; var91++) {
                for (int var92 = 0; var92 <= 104; var92++) {
                    for (int var93 = 0; var93 <= 104; var93++) {
                        if ((Statics.field108[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field108[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field108[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label361: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field108[var96 - 1][var93][var98] & var87) == 0) {
                                        break label361;
                                    }
                                }
                                var96--;
                            }
                            label350: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field108[var97 + 1][var93][var99] & var87) == 0) {
                                        break label350;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field96[var97][var93][var94] - var101;
                                int var103 = field96[var96][var93][var94];
                                class90.method1837(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field108[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field108[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field108[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field108[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label414: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field108[var108 - 1][var110][var92] & var88) == 0) {
                                        break label414;
                                    }
                                }
                                var108--;
                            }
                            label403: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field108[var109 + 1][var111][var92] & var88) == 0) {
                                        break label403;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field96[var109][var106][var92] - var113;
                                int var115 = field96[var108][var106][var92];
                                class90.method1837(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field108[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field108[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field108[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field108[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label467: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field108[var91][var118 - 1][var122] & var89) == 0) {
                                        break label467;
                                    }
                                }
                                var118--;
                            }
                            label456: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field108[var91][var119 + 1][var123] & var89) == 0) {
                                        break label456;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field96[var91][var118][var120];
                                class90.method1837(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field108[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.d(IIII)I")
    public static final int method174(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3916(var3, var5);
        int var8 = method3916(var3 + 1, var5);
        int var9 = method3916(var3, var5 + 1);
        int var10 = method3916(var3 + 1, var5 + 1);
        int var11 = 65536 - class95.field1643[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class95.field1643[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class95.field1643[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("hi.l(III)I")
    public static final int method3916(int arg0, int arg1) {
        int var2 = method651(arg0 - 1, arg1 - 1) + method651(arg0 + 1, arg1 - 1) + method651(arg0 - 1, arg1 + 1) + method651(arg0 + 1, arg1 + 1);
        int var3 = method651(arg0 - 1, arg1) + method651(arg0 + 1, arg1) + method651(arg0, arg1 - 1) + method651(arg0, arg1 + 1);
        int var4 = method651(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("aq.m(III)I")
    public static final int method651(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("at.j(IIB)I")
    public static final int method1031(int arg0, int arg1) {
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

    @ObfuscatedName("ah.y(IIB)I")
    public static final int method751(int arg0, int arg1) {
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

    @ObfuscatedName("an.s(IIIB)I")
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

    @ObfuscatedName("eo.p(III)Z")
    public static final boolean method2717(int arg0, int arg1) {
        class43 var2 = class43.method117(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method808(arg1);
    }
}
