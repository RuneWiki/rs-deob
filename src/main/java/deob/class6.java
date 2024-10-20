package deob;

@ObfuscatedName("h")
public final class class6 {

    @ObfuscatedName("h.n")
    public static int[][][] field79 = new int[4][105][105];

    @ObfuscatedName("h.o")
    public static byte[][][] field68 = new byte[4][104][104];

    @ObfuscatedName("h.a")
    public static int field69 = 99;

    @ObfuscatedName("h.s")
    public static final int[] field78 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("h.p")
    public static final int[] field86 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("h.d")
    public static final int[] field70 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("h.j")
    public static final int[] field81 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("h.k")
    public static final int[] field82 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("h.y")
    public static final int[] field83 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("h.c")
    public static int field74 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("h.g")
    public static int field85 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gs.n(B)V")
    public static void method3544() {
        field69 = 99;
        Statics.field84 = new byte[4][104][104];
        Statics.field71 = new byte[4][104][104];
        Statics.field60 = new byte[4][104][104];
        Statics.field1691 = new byte[4][104][104];
        Statics.field677 = new int[4][105][105];
        Statics.field72 = new byte[4][105][105];
        Statics.field73 = new int[105][105];
        Statics.field1112 = new int[104];
        Statics.field76 = new int[104];
        Statics.field75 = new int[104];
        Statics.field2150 = new int[104];
        Statics.field1047 = new int[104];
    }

    @ObfuscatedName("ay.a([BIIII[Lhz;B)V")
    public static final void method813(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class220[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3127[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class111 var9 = new class111(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.method2174(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("p.w(IIII)V")
    public static final void method499(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field79[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field79[arg0][arg1][arg2 + var5] = field79[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field79[arg0][arg1 + var6][arg2] = field79[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field79[arg0][arg1 - 1][arg2] != 0) {
            field79[arg0][arg1][arg2] = field79[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field79[arg0][arg1][arg2 - 1] != 0) {
            field79[arg0][arg1][arg2] = field79[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field79[arg0][arg1 - 1][arg2 - 1] != 0) {
            field79[arg0][arg1][arg2] = field79[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("bb.h([BIIB)Z")
    public static final boolean method1145(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class111 var4 = new class111(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2247();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2247();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2234() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class38 var16 = class38.method2180(var5);
                        if (var13 != 22 || !client.field274 || var16.field922 != 0 || var16.field905 == 1 || var16.field894) {
                            if (!var16.method693()) {
                                client.field330++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2247();
                if (var9 == 0) {
                    break;
                }
                var4.method2234();
            }
        }
    }

    @ObfuscatedName("w.i([BIILcs;[Lhz;I)V")
    public static final void method22(byte[] arg0, int arg1, int arg2, class81 arg3, class220[] arg4) {
        class111 var5 = new class111(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2247();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2247();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2234();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field68[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class220 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method840(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ah.r([BIIIIIIILcs;[Lhz;I)V")
    public static final void method754(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class81 arg8, class220[] arg9) {
        class111 var10 = new class111(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2247();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2247();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2234();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class38 var21 = class38.method2180(var11);
                    int var22 = arg2 + class168.method2453(var16 & 0x7, var15 & 0x7, arg7, var21.field907, var21.field904, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field907;
                    int var28 = var21.field904;
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
                        if ((field68[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class220 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method840(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.l(IIIIIILcs;Lhz;B)V")
    public static final void method840(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class220 arg7) {
        if (client.field274 && (field68[0][arg1][arg2] & 0x2) == 0) {
            if ((field68[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method639(arg0, arg1, arg2) != client.field327) {
                return;
            }
        }
        if (arg0 < field69) {
            field69 = arg0;
        }
        class38 var8 = class38.method2180(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field904;
            var10 = var8.field907;
        } else {
            var9 = var8.field907;
            var10 = var8.field904;
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
        int[][] var15 = field79[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field922 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field928 == 1) {
            var20 += 256;
        }
        if (var8.method692()) {
            class22.method131(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field274 || var8.field922 != 0 || var8.field905 == 1 || var8.field894) {
                class80 var21;
                if (var8.field911 == -1 && var8.field929 == null) {
                    var21 = var8.method707(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var8.field911, true, (class80) null);
                }
                arg6.method1727(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field905 == 1 && arg7 != null) {
                    arg7.method3775(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var44;
            if (var8.field911 == -1 && var8.field929 == null) {
                var44 = var8.method707(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            if (var44 != null && arg6.method1801(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field914) {
                int var45 = 15;
                if (var44 instanceof class100) {
                    var45 = ((class100) var44).method2082() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field72[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field72[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field905 != 0 && arg7 != null) {
                arg7.method3770(arg1, arg2, var9, var10, var8.field906);
            }
        } else if (arg5 >= 12) {
            class80 var22;
            if (var8.field911 == -1 && var8.field929 == null) {
                var22 = var8.method707(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1801(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field677[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field905 != 0 && arg7 != null) {
                arg7.method3770(arg1, arg2, var9, var10, var8.field906);
            }
        } else if (arg5 == 0) {
            class80 var23;
            if (var8.field911 == -1 && var8.field929 == null) {
                var23 = var8.method707(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1713(arg0, arg1, arg2, var16, var23, (class80) null, field78[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field914) {
                    Statics.field72[arg0][arg1][arg2] = 50;
                    Statics.field72[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field910) {
                    Statics.field677[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field914) {
                    Statics.field72[arg0][arg1][arg2 + 1] = 50;
                    Statics.field72[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field910) {
                    Statics.field677[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field914) {
                    Statics.field72[arg0][arg1 + 1][arg2] = 50;
                    Statics.field72[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field910) {
                    Statics.field677[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field914) {
                    Statics.field72[arg0][arg1][arg2] = 50;
                    Statics.field72[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field910) {
                    Statics.field677[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field905 != 0 && arg7 != null) {
                arg7.method3772(arg1, arg2, arg5, arg4, var8.field906);
            }
            if (var8.field921 != 16) {
                arg6.method1721(arg0, arg1, arg2, var8.field921);
            }
        } else if (arg5 == 1) {
            class80 var24;
            if (var8.field911 == -1 && var8.field929 == null) {
                var24 = var8.method707(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1713(arg0, arg1, arg2, var16, var24, (class80) null, field86[arg4], 0, var19, var20);
            if (var8.field914) {
                if (arg4 == 0) {
                    Statics.field72[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field72[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field72[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field72[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field905 != 0 && arg7 != null) {
                arg7.method3772(arg1, arg2, arg5, arg4, var8.field906);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class80 var26;
            class80 var27;
            if (var8.field911 == -1 && var8.field929 == null) {
                var26 = var8.method707(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method707(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field911, true, (class80) null);
                var27 = new class12(arg3, 2, var25, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1713(arg0, arg1, arg2, var16, var26, var27, field78[arg4], field78[var25], var19, var20);
            if (var8.field910) {
                if (arg4 == 0) {
                    Statics.field677[arg0][arg1][arg2] |= 0x249;
                    Statics.field677[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field677[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field677[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field677[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field677[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field677[arg0][arg1][arg2] |= 0x492;
                    Statics.field677[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field905 != 0 && arg7 != null) {
                arg7.method3772(arg1, arg2, arg5, arg4, var8.field906);
            }
            if (var8.field921 != 16) {
                arg6.method1721(arg0, arg1, arg2, var8.field921);
            }
        } else if (arg5 == 3) {
            class80 var28;
            if (var8.field911 == -1 && var8.field929 == null) {
                var28 = var8.method707(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1713(arg0, arg1, arg2, var16, var28, (class80) null, field86[arg4], 0, var19, var20);
            if (var8.field914) {
                if (arg4 == 0) {
                    Statics.field72[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field72[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field72[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field72[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field905 != 0 && arg7 != null) {
                arg7.method3772(arg1, arg2, arg5, arg4, var8.field906);
            }
        } else if (arg5 == 9) {
            class80 var29;
            if (var8.field911 == -1 && var8.field929 == null) {
                var29 = var8.method707(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1801(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field905 != 0 && arg7 != null) {
                arg7.method3770(arg1, arg2, var9, var10, var8.field906);
            }
            if (var8.field921 != 16) {
                arg6.method1721(arg0, arg1, arg2, var8.field921);
            }
        } else if (arg5 == 4) {
            class80 var30;
            if (var8.field911 == -1 && var8.field929 == null) {
                var30 = var8.method707(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1714(arg0, arg1, arg2, var16, var30, (class80) null, field78[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1850(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class38.method2180(var32 >> 14 & 0x7FFF).field921;
            }
            class80 var33;
            if (var8.field911 == -1 && var8.field929 == null) {
                var33 = var8.method707(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1714(arg0, arg1, arg2, var16, var33, (class80) null, field78[arg4], 0, field70[arg4] * var31, field81[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1850(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class38.method2180(var35 >> 14 & 0x7FFF).field921 / 2;
            }
            class80 var36;
            if (var8.field911 == -1 && var8.field929 == null) {
                var36 = var8.method707(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1714(arg0, arg1, arg2, var16, var36, (class80) null, 256, arg4, field82[arg4] * var34, field83[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class80 var38;
            if (var8.field911 == -1 && var8.field929 == null) {
                var38 = var8.method707(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class12(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1714(arg0, arg1, arg2, var16, var38, (class80) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1850(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class38.method2180(var40 >> 14 & 0x7FFF).field921 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class80 var42;
            class80 var43;
            if (var8.field911 == -1 && var8.field929 == null) {
                var42 = var8.method707(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method707(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field911, true, (class80) null);
                var43 = new class12(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field911, true, (class80) null);
            }
            arg6.method1714(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field82[arg4] * var39, field83[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("bx.f(Lcs;[Lhz;I)V")
    public static final void method1481(class81 arg0, class220[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field68[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field68[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3774(var3, var4);
                        }
                    }
                }
            }
        }
        field74 += (int) (Math.random() * 5.0D) - 2;
        if (field74 < -8) {
            field74 = -8;
        }
        if (field74 > 8) {
            field74 = 8;
        }
        field85 += (int) (Math.random() * 5.0D) - 2;
        if (field85 < -16) {
            field85 = -16;
        }
        if (field85 > 16) {
            field85 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field72[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field79[var6][var11 + 1][var10] - field79[var6][var11 - 1][var10];
                    int var13 = field79[var6][var11][var10 + 1] - field79[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field73[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1112[var20] = 0;
                Statics.field76[var20] = 0;
                Statics.field75[var20] = 0;
                Statics.field2150[var20] = 0;
                Statics.field1047[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field84[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class39 var25 = class39.method838(var24 - 1);
                            Statics.field1112[var22] += var25.field944;
                            Statics.field76[var22] += var25.field945;
                            Statics.field75[var22] += var25.field946;
                            Statics.field2150[var22] += var25.field943;
                            var10002 = Statics.field1047[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field84[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class39 var28 = class39.method838(var27 - 1);
                            Statics.field1112[var22] -= var28.field944;
                            Statics.field76[var22] -= var28.field945;
                            Statics.field75[var22] -= var28.field946;
                            Statics.field2150[var22] -= var28.field943;
                            var10002 = Statics.field1047[var22]--;
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
                            var29 += Statics.field1112[var35];
                            var30 += Statics.field76[var35];
                            var31 += Statics.field75[var35];
                            var32 += Statics.field2150[var35];
                            var33 += Statics.field1047[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field1112[var36];
                            var30 -= Statics.field76[var36];
                            var31 -= Statics.field75[var36];
                            var32 -= Statics.field2150[var36];
                            var33 -= Statics.field1047[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field274 || (field68[0][var21][var34] & 0x2) != 0 || (field68[var6][var21][var34] & 0x10) == 0 && method639(var6, var21, var34) == client.field327)) {
                            if (var6 < field69) {
                                field69 = var6;
                            }
                            int var37 = Statics.field84[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field71[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field79[var6][var21][var34];
                                int var40 = field79[var6][var21 + 1][var34];
                                int var41 = field79[var6][var21 + 1][var34 + 1];
                                int var42 = field79[var6][var21][var34 + 1];
                                int var43 = Statics.field73[var21][var34];
                                int var44 = Statics.field73[var21 + 1][var34];
                                int var45 = Statics.field73[var21 + 1][var34 + 1];
                                int var46 = Statics.field73[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method468(var49, var50, var51);
                                    int var52 = field74 + var49 & 0xFF;
                                    int var53 = field85 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method468(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field60[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class43 var56 = (class43) class43.field1008.method3373((long) var55);
                                        class43 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field1015.method2925(4, var55);
                                            class43 var59 = new class43();
                                            if (var58 != null) {
                                                var59.method841(new class111(var58), var55);
                                            }
                                            var59.method855();
                                            class43.field1008.method3372(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field1011) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field677[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class86.field1514[method988(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1859(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method988(var47, var43), method988(var47, var44), method988(var47, var45), method988(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field60[var6][var21][var34] + 1;
                                    byte var62 = Statics.field1691[var6][var21][var34];
                                    int var63 = var38 - 1;
                                    class43 var64 = (class43) class43.field1008.method3373((long) var63);
                                    class43 var65;
                                    if (var64 == null) {
                                        byte[] var66 = Statics.field1015.method2925(4, var63);
                                        class43 var67 = new class43();
                                        if (var66 != null) {
                                            var67.method841(new class111(var66), var63);
                                        }
                                        var67.method855();
                                        class43.field1008.method3372(var67, (long) var63);
                                        var65 = var67;
                                    } else {
                                        var65 = var64;
                                    }
                                    int var69 = var65.field1010;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1516.method1941(var69);
                                        var71 = -1;
                                    } else if (var65.field1009 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method468(var65.field1014, var65.field1007, var65.field1019);
                                        int var72 = field74 + var65.field1014 & 0xFF;
                                        int var73 = field85 + var65.field1019;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method468(var72, var65.field1007, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class86.field1514[method2148(var70, 96)];
                                    }
                                    if (var65.field1012 != -1) {
                                        int var75 = field74 + var65.field1016 & 0xFF;
                                        int var76 = field85 + var65.field1021;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method468(var75, var65.field1013, var76);
                                        var74 = class86.field1514[method2148(var77, 96)];
                                    }
                                    arg0.method1859(var6, var21, var34, var61, var62, var69, var39, var40, var41, var42, method988(var47, var43), method988(var47, var44), method988(var47, var45), method988(var47, var46), method2148(var71, var43), method2148(var71, var44), method2148(var71, var45), method2148(var71, var46), var60, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1847(var6, var79, var78, method639(var6, var79, var78));
                }
            }
            Statics.field84[var6] = (byte[][]) null;
            Statics.field71[var6] = (byte[][]) null;
            Statics.field60[var6] = (byte[][]) null;
            Statics.field1691[var6] = (byte[][]) null;
            Statics.field72[var6] = (byte[][]) null;
        }
        arg0.method1736(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field68[1][var80][var81] & 0x2) == 2) {
                    arg0.method1707(var80, var81);
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
                        if ((Statics.field677[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field677[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field677[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label357: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field677[var91 - 1][var88][var93] & var82) == 0) {
                                        break label357;
                                    }
                                }
                                var91--;
                            }
                            label346: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field677[var92 + 1][var88][var94] & var82) == 0) {
                                        break label346;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field79[var92][var88][var89] - var96;
                                int var98 = field79[var91][var88][var89];
                                class81.method1835(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field677[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field677[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field677[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field677[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label410: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field677[var103 - 1][var105][var87] & var83) == 0) {
                                        break label410;
                                    }
                                }
                                var103--;
                            }
                            label399: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field677[var104 + 1][var106][var87] & var83) == 0) {
                                        break label399;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field79[var104][var101][var87] - var108;
                                int var110 = field79[var103][var101][var87];
                                class81.method1835(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field677[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field677[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field677[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field677[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label463: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field677[var86][var113 - 1][var117] & var84) == 0) {
                                        break label463;
                                    }
                                }
                                var113--;
                            }
                            label452: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field677[var86][var114 + 1][var118] & var84) == 0) {
                                        break label452;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field79[var86][var113][var115];
                                class81.method1835(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field677[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.e(IIII)I")
    public static int method639(int arg0, int arg1, int arg2) {
        if ((field68[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field68[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("i.z(III)I")
    public static final int method89(int arg0, int arg1) {
        int var2 = method861(arg0 + 45365, arg1 + 91923, 4) - 128 + (method861(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method861(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("at.v(IIII)I")
    public static final int method861(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3110(var3, var5);
        int var8 = method3110(var3 + 1, var5);
        int var9 = method3110(var3, var5 + 1);
        int var10 = method3110(var3 + 1, var5 + 1);
        int var11 = method110(var7, var8, var4, arg2);
        int var12 = method110(var9, var10, var4, arg2);
        return method110(var11, var12, var6, arg2);
    }

    @ObfuscatedName("f.x(IIIII)I")
    public static final int method110(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class86.field1521[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("fv.q(III)I")
    public static final int method3110(int arg0, int arg1) {
        int var2 = method15(arg0 - 1, arg1 - 1) + method15(arg0 + 1, arg1 - 1) + method15(arg0 - 1, arg1 + 1) + method15(arg0 + 1, arg1 + 1);
        int var3 = method15(arg0 - 1, arg1) + method15(arg0 + 1, arg1) + method15(arg0, arg1 - 1) + method15(arg0, arg1 + 1);
        int var4 = method15(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("a.b(IIB)I")
    public static final int method15(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ai.u(IIB)I")
    public static final int method988(int arg0, int arg1) {
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

    @ObfuscatedName("cx.t(IIB)I")
    public static final int method2148(int arg0, int arg1) {
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

    @ObfuscatedName("client.s(IIII)I")
    public static final int method468(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("en.p(IIIIIIILcs;Lhz;B)V")
    public static final void method2738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class81 arg7, class220 arg8) {
        class38 var9 = class38.method2180(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field904;
            var11 = var9.field907;
        } else {
            var10 = var9.field907;
            var11 = var9.field904;
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
        int[][] var16 = field79[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field922 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field928 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class80 var22;
            if (var9.field911 == -1 && var9.field929 == null) {
                var22 = var9.method709(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class12(arg4, 22, arg5, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1727(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field905 == 1) {
                arg8.method3775(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var45;
            if (var9.field911 == -1 && var9.field929 == null) {
                var45 = var9.method709(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class12(arg4, 10, arg5, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            if (var45 != null) {
                arg7.method1801(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field905 != 0) {
                arg8.method3770(arg2, arg3, var10, var11, var9.field906);
            }
        } else if (arg6 >= 12) {
            class80 var23;
            if (var9.field911 == -1 && var9.field929 == null) {
                var23 = var9.method709(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1801(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field905 != 0) {
                arg8.method3770(arg2, arg3, var10, var11, var9.field906);
            }
        } else if (arg6 == 0) {
            class80 var24;
            if (var9.field911 == -1 && var9.field929 == null) {
                var24 = var9.method709(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class12(arg4, 0, arg5, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1713(arg0, arg2, arg3, var17, var24, (class80) null, field78[arg5], 0, var20, var21);
            if (var9.field905 != 0) {
                arg8.method3772(arg2, arg3, arg6, arg5, var9.field906);
            }
        } else if (arg6 == 1) {
            class80 var25;
            if (var9.field911 == -1 && var9.field929 == null) {
                var25 = var9.method709(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class12(arg4, 1, arg5, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1713(arg0, arg2, arg3, var17, var25, (class80) null, field86[arg5], 0, var20, var21);
            if (var9.field905 != 0) {
                arg8.method3772(arg2, arg3, arg6, arg5, var9.field906);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class80 var27;
            class80 var28;
            if (var9.field911 == -1 && var9.field929 == null) {
                var27 = var9.method709(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method709(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class12(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field911, true, (class80) null);
                var28 = new class12(arg4, 2, var26, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1713(arg0, arg2, arg3, var17, var27, var28, field78[arg5], field78[var26], var20, var21);
            if (var9.field905 != 0) {
                arg8.method3772(arg2, arg3, arg6, arg5, var9.field906);
            }
        } else if (arg6 == 3) {
            class80 var29;
            if (var9.field911 == -1 && var9.field929 == null) {
                var29 = var9.method709(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class12(arg4, 3, arg5, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1713(arg0, arg2, arg3, var17, var29, (class80) null, field86[arg5], 0, var20, var21);
            if (var9.field905 != 0) {
                arg8.method3772(arg2, arg3, arg6, arg5, var9.field906);
            }
        } else if (arg6 == 9) {
            class80 var30;
            if (var9.field911 == -1 && var9.field929 == null) {
                var30 = var9.method709(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1801(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field905 != 0) {
                arg8.method3770(arg2, arg3, var10, var11, var9.field906);
            }
        } else if (arg6 == 4) {
            class80 var31;
            if (var9.field911 == -1 && var9.field929 == null) {
                var31 = var9.method709(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1714(arg0, arg2, arg3, var17, var31, (class80) null, field78[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1850(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class38.method2180(var33 >> 14 & 0x7FFF).field921;
            }
            class80 var34;
            if (var9.field911 == -1 && var9.field929 == null) {
                var34 = var9.method709(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1714(arg0, arg2, arg3, var17, var34, (class80) null, field78[arg5], 0, field70[arg5] * var32, field81[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1850(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class38.method2180(var36 >> 14 & 0x7FFF).field921 / 2;
            }
            class80 var37;
            if (var9.field911 == -1 && var9.field929 == null) {
                var37 = var9.method709(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1714(arg0, arg2, arg3, var17, var37, (class80) null, 256, arg5, field82[arg5] * var35, field83[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class80 var39;
            if (var9.field911 == -1 && var9.field929 == null) {
                var39 = var9.method709(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class12(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1714(arg0, arg2, arg3, var17, var39, (class80) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1850(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class38.method2180(var41 >> 14 & 0x7FFF).field921 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class80 var43;
            class80 var44;
            if (var9.field911 == -1 && var9.field929 == null) {
                var43 = var9.method709(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method709(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field911, true, (class80) null);
                var44 = new class12(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field911, true, (class80) null);
            }
            arg7.method1714(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field82[arg5] * var40, field83[arg5] * var40, var20, var21);
        }
    }
}
