package deob;

@ObfuscatedName("b")
public final class class6 {

    @ObfuscatedName("b.x")
    public static int[][][] field94 = new int[4][105][105];

    @ObfuscatedName("b.r")
    public static byte[][][] field72 = new byte[4][104][104];

    @ObfuscatedName("b.j")
    public static int field74 = 99;

    @ObfuscatedName("b.a")
    public static final int[] field83 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("b.e")
    public static final int[] field84 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("b.c")
    public static final int[] field85 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("b.n")
    public static final int[] field78 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("b.y")
    public static final int[] field91 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("b.k")
    public static final int[] field88 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("b.w")
    public static int field89 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("b.o")
    public static int field90 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.x(I)V")
    public static void method566() {
        field74 = 99;
        Statics.field86 = new byte[4][104][104];
        Statics.field1922 = new byte[4][104][104];
        Statics.field76 = new byte[4][104][104];
        Statics.field77 = new byte[4][104][104];
        Statics.field3215 = new int[4][105][105];
        Statics.field2105 = new byte[4][105][105];
        Statics.field75 = new int[105][105];
        Statics.field258 = new int[104];
        Statics.field79 = new int[104];
        Statics.field80 = new int[104];
        Statics.field2767 = new int[104];
        Statics.field185 = new int[104];
    }

    @ObfuscatedName("da.r(IIIII)V")
    public static final void method2203(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2105[0][var5][var4] = 127;
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

    @ObfuscatedName("fq.j([BIIIIIII[Ldh;S)V")
    public static final void method2991(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class112[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1964[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class123 var11 = new class123(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method184(var11, arg1, arg2 + class181.method2340(var13 & 0x7, var14 & 0x7, arg7), arg3 + class181.method722(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method184(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.i(Ldp;IIIIIII)V")
    public static final void method184(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2408();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2408();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2408();
                }
            }
            return;
        }
        field72[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2408();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field94[0][arg2][arg3] = -method2897(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2408();
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
                Statics.field1922[arg1][arg2][arg3] = arg0.method2409();
                Statics.field76[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field77[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field72[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field86[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("au.b([BIIB)Z")
    public static final boolean method705(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class123 var4 = new class123(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2421();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2421();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2408() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class43 var16 = class43.method12(var5);
                        if (var13 != 22 || !client.field315 || var16.field967 != 0 || var16.field941 == 1 || var16.field962) {
                            if (!var16.method771()) {
                                client.field338++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2421();
                if (var9 == 0) {
                    break;
                }
                var4.method2408();
            }
        }
    }

    @ObfuscatedName("eg.l([BIIIIIIILci;[Ldh;I)V")
    public static final void method2764(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class90 arg8, class112[] arg9) {
        class123 var10 = new class123(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2421();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2421();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2408();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class43 var21 = class43.method12(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field939;
                    int var27 = var21.field940;
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
                    int var33 = var16 & 0x7;
                    int var34 = var15 & 0x7;
                    int var36 = var21.field939;
                    int var37 = var21.field940;
                    if ((var20 & 0x1) == 1) {
                        int var38 = var36;
                        var36 = var37;
                        var37 = var38;
                    }
                    int var39 = arg7 & 0x3;
                    int var40;
                    if (var39 == 0) {
                        var40 = var34;
                    } else if (var39 == 1) {
                        var40 = 7 - var33 - (var36 - 1);
                    } else if (var39 == 2) {
                        var40 = 7 - var34 - (var37 - 1);
                    } else {
                        var40 = var33;
                    }
                    int var41 = arg3 + var40;
                    if (var31 > 0 && var41 > 0 && var31 < 103 && var41 < 103) {
                        int var42 = arg1;
                        if ((field72[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class112 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method2975(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ep.m(IIIIIILci;Ldh;I)V")
    public static final void method2975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, class112 arg7) {
        if (client.field315 && (field72[0][arg1][arg2] & 0x2) == 0 && (field72[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field74) {
            field74 = arg0;
        }
        class43 var8 = class43.method12(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field940;
            var10 = var8.field939;
        } else {
            var9 = var8.field939;
            var10 = var8.field940;
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
        int[][] var15 = field94[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field967 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field964 == 1) {
            var20 += 256;
        }
        if (var8.method766()) {
            class25.method3(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field315 || var8.field967 != 0 || var8.field941 == 1 || var8.field962) {
                class89 var21;
                if (var8.field947 == -1 && var8.field971 == null) {
                    var21 = var8.method772(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field947, true, (class89) null);
                }
                arg6.method1836(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field941 == 1 && arg7 != null) {
                    arg7.method2302(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class89 var44;
            if (var8.field947 == -1 && var8.field971 == null) {
                var44 = var8.method772(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            if (var44 != null && arg6.method1835(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field933) {
                int var45 = 15;
                if (var44 instanceof class109) {
                    var45 = ((class109) var44).method2225() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field2105[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field2105[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2300(arg1, arg2, var9, var10, var8.field974);
            }
        } else if (arg5 >= 12) {
            class89 var22;
            if (var8.field947 == -1 && var8.field971 == null) {
                var22 = var8.method772(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1835(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3215[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2300(arg1, arg2, var9, var10, var8.field974);
            }
        } else if (arg5 == 0) {
            class89 var23;
            if (var8.field947 == -1 && var8.field971 == null) {
                var23 = var8.method772(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var23, (class89) null, field83[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field933) {
                    Statics.field2105[arg0][arg1][arg2] = 50;
                    Statics.field2105[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field946) {
                    Statics.field3215[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field933) {
                    Statics.field2105[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2105[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field946) {
                    Statics.field3215[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field933) {
                    Statics.field2105[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2105[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field946) {
                    Statics.field3215[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field933) {
                    Statics.field2105[arg0][arg1][arg2] = 50;
                    Statics.field2105[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field946) {
                    Statics.field3215[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2299(arg1, arg2, arg5, arg4, var8.field974);
            }
            if (var8.field977 != 16) {
                arg6.method1841(arg0, arg1, arg2, var8.field977);
            }
        } else if (arg5 == 1) {
            class89 var24;
            if (var8.field947 == -1 && var8.field971 == null) {
                var24 = var8.method772(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var24, (class89) null, field84[arg4], 0, var19, var20);
            if (var8.field933) {
                if (arg4 == 0) {
                    Statics.field2105[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2105[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2105[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2105[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2299(arg1, arg2, arg5, arg4, var8.field974);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class89 var26;
            class89 var27;
            if (var8.field947 == -1 && var8.field971 == null) {
                var26 = var8.method772(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method772(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field947, true, (class89) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var26, var27, field83[arg4], field83[var25], var19, var20);
            if (var8.field946) {
                if (arg4 == 0) {
                    Statics.field3215[arg0][arg1][arg2] |= 0x249;
                    Statics.field3215[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3215[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3215[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3215[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3215[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3215[arg0][arg1][arg2] |= 0x492;
                    Statics.field3215[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2299(arg1, arg2, arg5, arg4, var8.field974);
            }
            if (var8.field977 != 16) {
                arg6.method1841(arg0, arg1, arg2, var8.field977);
            }
        } else if (arg5 == 3) {
            class89 var28;
            if (var8.field947 == -1 && var8.field971 == null) {
                var28 = var8.method772(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var28, (class89) null, field84[arg4], 0, var19, var20);
            if (var8.field933) {
                if (arg4 == 0) {
                    Statics.field2105[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2105[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2105[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2105[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2299(arg1, arg2, arg5, arg4, var8.field974);
            }
        } else if (arg5 == 9) {
            class89 var29;
            if (var8.field947 == -1 && var8.field971 == null) {
                var29 = var8.method772(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1835(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field941 != 0 && arg7 != null) {
                arg7.method2300(arg1, arg2, var9, var10, var8.field974);
            }
            if (var8.field977 != 16) {
                arg6.method1841(arg0, arg1, arg2, var8.field977);
            }
        } else if (arg5 == 4) {
            class89 var30;
            if (var8.field947 == -1 && var8.field971 == null) {
                var30 = var8.method772(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1834(arg0, arg1, arg2, var16, var30, (class89) null, field83[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1851(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class43.method12(var32 >> 14 & 0x7FFF).field977;
            }
            class89 var33;
            if (var8.field947 == -1 && var8.field971 == null) {
                var33 = var8.method772(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1834(arg0, arg1, arg2, var16, var33, (class89) null, field83[arg4], 0, field85[arg4] * var31, field78[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1851(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class43.method12(var35 >> 14 & 0x7FFF).field977 / 2;
            }
            class89 var36;
            if (var8.field947 == -1 && var8.field971 == null) {
                var36 = var8.method772(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1834(arg0, arg1, arg2, var16, var36, (class89) null, 256, arg4, field91[arg4] * var34, field88[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class89 var38;
            if (var8.field947 == -1 && var8.field971 == null) {
                var38 = var8.method772(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1834(arg0, arg1, arg2, var16, var38, (class89) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1851(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class43.method12(var40 >> 14 & 0x7FFF).field977 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class89 var42;
            class89 var43;
            if (var8.field947 == -1 && var8.field971 == null) {
                var42 = var8.method772(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method772(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field947, true, (class89) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field947, true, (class89) null);
            }
            arg6.method1834(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field91[arg4] * var39, field88[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("dq.p(Lci;[Ldh;I)V")
    public static final void method2336(class90 arg0, class112[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field72[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field72[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2297(var3, var4);
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
            byte[][] var7 = Statics.field2105[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field94[var6][var11 + 1][var10] - field94[var6][var11 - 1][var10];
                    int var13 = field94[var6][var11][var10 + 1] - field94[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field75[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field258[var20] = 0;
                Statics.field79[var20] = 0;
                Statics.field80[var20] = 0;
                Statics.field2767[var20] = 0;
                Statics.field185[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field86[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class44 var26 = (class44) class44.field979.method3533((long) var25);
                            class44 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field983.method3079(1, var25);
                                class44 var29 = new class44();
                                if (var28 != null) {
                                    var29.method819(new class123(var28), var25);
                                }
                                var29.method812();
                                class44.field979.method3535(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field258[var22] += var27.field981;
                            Statics.field79[var22] += var27.field982;
                            Statics.field80[var22] += var27.field990;
                            Statics.field2767[var22] += var27.field984;
                            var10002 = Statics.field185[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field86[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            class44 var33 = class44.method1544(var32 - 1);
                            Statics.field258[var22] -= var33.field981;
                            Statics.field79[var22] -= var33.field982;
                            Statics.field80[var22] -= var33.field990;
                            Statics.field2767[var22] -= var33.field984;
                            var10002 = Statics.field185[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var34 = 0;
                    int var35 = 0;
                    int var36 = 0;
                    int var37 = 0;
                    int var38 = 0;
                    for (int var39 = -5; var39 < 109; var39++) {
                        int var40 = var39 + 5;
                        if (var40 >= 0 && var40 < 104) {
                            var34 += Statics.field258[var40];
                            var35 += Statics.field79[var40];
                            var36 += Statics.field80[var40];
                            var37 += Statics.field2767[var40];
                            var38 += Statics.field185[var40];
                        }
                        int var41 = var39 - 5;
                        if (var41 >= 0 && var41 < 104) {
                            var34 -= Statics.field258[var41];
                            var35 -= Statics.field79[var41];
                            var36 -= Statics.field80[var41];
                            var37 -= Statics.field2767[var41];
                            var38 -= Statics.field185[var41];
                        }
                        if (var39 >= 1 && var39 < 103 && (!client.field315 || (field72[0][var21][var39] & 0x2) != 0 || (field72[var6][var21][var39] & 0x10) == 0)) {
                            if (var6 < field74) {
                                field74 = var6;
                            }
                            int var42 = Statics.field86[var6][var21][var39] & 0xFF;
                            int var43 = Statics.field1922[var6][var21][var39] & 0xFF;
                            if (var42 > 0 || var43 > 0) {
                                int var44 = field94[var6][var21][var39];
                                int var45 = field94[var6][var21 + 1][var39];
                                int var46 = field94[var6][var21 + 1][var39 + 1];
                                int var47 = field94[var6][var21][var39 + 1];
                                int var48 = Statics.field75[var21][var39];
                                int var49 = Statics.field75[var21 + 1][var39];
                                int var50 = Statics.field75[var21 + 1][var39 + 1];
                                int var51 = Statics.field75[var21][var39 + 1];
                                int var52 = -1;
                                int var53 = -1;
                                if (var42 > 0) {
                                    int var54 = var34 * 256 / var37;
                                    int var55 = var35 / var38;
                                    int var56 = var36 / var38;
                                    var52 = method3251(var54, var55, var56);
                                    int var57 = field89 + var54 & 0xFF;
                                    int var58 = field90 + var56;
                                    if (var58 < 0) {
                                        var58 = 0;
                                    } else if (var58 > 255) {
                                        var58 = 255;
                                    }
                                    var53 = method3251(var57, var55, var58);
                                }
                                if (var6 > 0) {
                                    boolean var59 = true;
                                    if (var42 == 0 && Statics.field76[var6][var21][var39] != 0) {
                                        var59 = false;
                                    }
                                    if (var43 > 0 && !class49.method42(var43 - 1).field1065) {
                                        var59 = false;
                                    }
                                    if (var59 && var44 == var45 && var44 == var46 && var44 == var47) {
                                        Statics.field3215[var6][var21][var39] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var53 != -1) {
                                    var60 = class95.field1636[method918(var53, 96)];
                                }
                                if (var43 == 0) {
                                    arg0.method1830(var6, var21, var39, 0, 0, -1, var44, var45, var46, var47, method918(var52, var48), method918(var52, var49), method918(var52, var50), method918(var52, var51), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field76[var6][var21][var39] + 1;
                                    byte var62 = Statics.field77[var6][var21][var39];
                                    class49 var63 = class49.method42(var43 - 1);
                                    int var64 = var63.field1056;
                                    int var65;
                                    int var66;
                                    if (var64 >= 0) {
                                        var65 = Statics.field1637.method2078(var64);
                                        var66 = -1;
                                    } else if (var63.field1055 == 16711935) {
                                        var66 = -2;
                                        var64 = -1;
                                        var65 = -2;
                                    } else {
                                        var66 = method3251(var63.field1059, var63.field1066, var63.field1069);
                                        int var67 = field89 + var63.field1059 & 0xFF;
                                        int var68 = field90 + var63.field1069;
                                        if (var68 < 0) {
                                            var68 = 0;
                                        } else if (var68 > 255) {
                                            var68 = 255;
                                        }
                                        var65 = method3251(var67, var63.field1066, var68);
                                    }
                                    int var69 = 0;
                                    if (var65 != -2) {
                                        var69 = class95.field1636[method3200(var65, 96)];
                                    }
                                    if (var63.field1058 != -1) {
                                        int var70 = field89 + var63.field1062 & 0xFF;
                                        int var71 = field90 + var63.field1064;
                                        if (var71 < 0) {
                                            var71 = 0;
                                        } else if (var71 > 255) {
                                            var71 = 255;
                                        }
                                        int var72 = method3251(var70, var63.field1063, var71);
                                        var69 = class95.field1636[method3200(var72, 96)];
                                    }
                                    arg0.method1830(var6, var21, var39, var61, var62, var64, var44, var45, var46, var47, method918(var52, var48), method918(var52, var49), method918(var52, var50), method918(var52, var51), method3200(var66, var48), method3200(var66, var49), method3200(var66, var50), method3200(var66, var51), var60, var69);
                                }
                            }
                        }
                    }
                }
            }
            for (int var73 = 1; var73 < 103; var73++) {
                for (int var74 = 1; var74 < 103; var74++) {
                    int var79;
                    if ((field72[var6][var74][var73] & 0x8) != 0) {
                        var79 = 0;
                    } else if (var6 <= 0 || (field72[1][var74][var73] & 0x2) == 0) {
                        var79 = var6;
                    } else {
                        var79 = var6 - 1;
                    }
                    arg0.method1864(var6, var74, var73, var79);
                }
            }
            Statics.field86[var6] = (byte[][]) null;
            Statics.field1922[var6] = (byte[][]) null;
            Statics.field76[var6] = (byte[][]) null;
            Statics.field77[var6] = (byte[][]) null;
            Statics.field2105[var6] = (byte[][]) null;
        }
        arg0.method1856(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field72[1][var80][var81] & 0x2) == 2) {
                    arg0.method1827(var80, var81);
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
                        if ((Statics.field3215[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field3215[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field3215[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label352: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field3215[var91 - 1][var88][var93] & var82) == 0) {
                                        break label352;
                                    }
                                }
                                var91--;
                            }
                            label341: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field3215[var92 + 1][var88][var94] & var82) == 0) {
                                        break label341;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field94[var92][var88][var89] - var96;
                                int var98 = field94[var91][var88][var89];
                                class90.method1975(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field3215[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3215[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field3215[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field3215[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label405: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field3215[var103 - 1][var105][var87] & var83) == 0) {
                                        break label405;
                                    }
                                }
                                var103--;
                            }
                            label394: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field3215[var104 + 1][var106][var87] & var83) == 0) {
                                        break label394;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field94[var104][var101][var87] - var108;
                                int var110 = field94[var103][var101][var87];
                                class90.method1975(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field3215[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field3215[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field3215[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field3215[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label458: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field3215[var86][var113 - 1][var117] & var84) == 0) {
                                        break label458;
                                    }
                                }
                                var113--;
                            }
                            label447: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field3215[var86][var114 + 1][var118] & var84) == 0) {
                                        break label447;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field94[var86][var113][var115];
                                class90.method1975(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field3215[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eb.f(IIB)I")
    public static final int method2897(int arg0, int arg1) {
        int var2 = method585(arg0 + 45365, arg1 + 91923, 4) - 128 + (method585(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method585(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("an.d(IIIB)I")
    public static final int method585(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2871(var3, var5);
        int var8 = method2871(var3 + 1, var5);
        int var9 = method2871(var3, var5 + 1);
        int var10 = method2871(var3 + 1, var5 + 1);
        int var11 = 65536 - class95.field1641[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class95.field1641[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class95.field1641[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ee.v(III)I")
    public static final int method2871(int arg0, int arg1) {
        int var2 = method2998(arg0 - 1, arg1 - 1) + method2998(arg0 + 1, arg1 - 1) + method2998(arg0 - 1, arg1 + 1) + method2998(arg0 + 1, arg1 + 1);
        int var3 = method2998(arg0 - 1, arg1) + method2998(arg0 + 1, arg1) + method2998(arg0, arg1 - 1) + method2998(arg0, arg1 + 1);
        int var4 = method2998(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("fl.q(III)I")
    public static final int method2998(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("aa.t(III)I")
    public static final int method918(int arg0, int arg1) {
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

    @ObfuscatedName("fi.g(IIB)I")
    public static final int method3200(int arg0, int arg1) {
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

    @ObfuscatedName("fj.s(IIIS)I")
    public static final int method3251(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("es.h(IIB)Z")
    public static final boolean method2830(int arg0, int arg1) {
        class43 var2 = class43.method12(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method770(arg1);
    }

    @ObfuscatedName("z.u(IIIIIIILci;Ldh;B)V")
    public static final void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class90 arg7, class112 arg8) {
        class43 var9 = class43.method12(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field940;
            var11 = var9.field939;
        } else {
            var10 = var9.field939;
            var11 = var9.field940;
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
        int[][] var16 = field94[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field967 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field964 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class89 var22;
            if (var9.field947 == -1 && var9.field971 == null) {
                var22 = var9.method781(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1836(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field941 == 1) {
                arg8.method2302(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class89 var45;
            if (var9.field947 == -1 && var9.field971 == null) {
                var45 = var9.method781(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            if (var45 != null) {
                arg7.method1835(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field941 != 0) {
                arg8.method2300(arg2, arg3, var10, var11, var9.field974);
            }
        } else if (arg6 >= 12) {
            class89 var23;
            if (var9.field947 == -1 && var9.field971 == null) {
                var23 = var9.method781(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1835(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field941 != 0) {
                arg8.method2300(arg2, arg3, var10, var11, var9.field974);
            }
        } else if (arg6 == 0) {
            class89 var24;
            if (var9.field947 == -1 && var9.field971 == null) {
                var24 = var9.method781(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1887(arg0, arg2, arg3, var17, var24, (class89) null, field83[arg5], 0, var20, var21);
            if (var9.field941 != 0) {
                arg8.method2299(arg2, arg3, arg6, arg5, var9.field974);
            }
        } else if (arg6 == 1) {
            class89 var25;
            if (var9.field947 == -1 && var9.field971 == null) {
                var25 = var9.method781(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1887(arg0, arg2, arg3, var17, var25, (class89) null, field84[arg5], 0, var20, var21);
            if (var9.field941 != 0) {
                arg8.method2299(arg2, arg3, arg6, arg5, var9.field974);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class89 var27;
            class89 var28;
            if (var9.field947 == -1 && var9.field971 == null) {
                var27 = var9.method781(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method781(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field947, true, (class89) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1887(arg0, arg2, arg3, var17, var27, var28, field83[arg5], field83[var26], var20, var21);
            if (var9.field941 != 0) {
                arg8.method2299(arg2, arg3, arg6, arg5, var9.field974);
            }
        } else if (arg6 == 3) {
            class89 var29;
            if (var9.field947 == -1 && var9.field971 == null) {
                var29 = var9.method781(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1887(arg0, arg2, arg3, var17, var29, (class89) null, field84[arg5], 0, var20, var21);
            if (var9.field941 != 0) {
                arg8.method2299(arg2, arg3, arg6, arg5, var9.field974);
            }
        } else if (arg6 == 9) {
            class89 var30;
            if (var9.field947 == -1 && var9.field971 == null) {
                var30 = var9.method781(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1835(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field941 != 0) {
                arg8.method2300(arg2, arg3, var10, var11, var9.field974);
            }
        } else if (arg6 == 4) {
            class89 var31;
            if (var9.field947 == -1 && var9.field971 == null) {
                var31 = var9.method781(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1834(arg0, arg2, arg3, var17, var31, (class89) null, field83[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1851(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class43.method12(var33 >> 14 & 0x7FFF).field977;
            }
            class89 var34;
            if (var9.field947 == -1 && var9.field971 == null) {
                var34 = var9.method781(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1834(arg0, arg2, arg3, var17, var34, (class89) null, field83[arg5], 0, field85[arg5] * var32, field78[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1851(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class43.method12(var36 >> 14 & 0x7FFF).field977 / 2;
            }
            class89 var37;
            if (var9.field947 == -1 && var9.field971 == null) {
                var37 = var9.method781(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1834(arg0, arg2, arg3, var17, var37, (class89) null, 256, arg5, field91[arg5] * var35, field88[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class89 var39;
            if (var9.field947 == -1 && var9.field971 == null) {
                var39 = var9.method781(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1834(arg0, arg2, arg3, var17, var39, (class89) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1851(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class43.method12(var41 >> 14 & 0x7FFF).field977 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class89 var43;
            class89 var44;
            if (var9.field947 == -1 && var9.field971 == null) {
                var43 = var9.method781(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method781(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field947, true, (class89) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field947, true, (class89) null);
            }
            arg7.method1834(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field91[arg5] * var40, field88[arg5] * var40, var20, var21);
        }
    }
}
