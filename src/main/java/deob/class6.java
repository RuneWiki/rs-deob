package deob;

@ObfuscatedName("g")
public final class class6 {

    @ObfuscatedName("g.n")
    public static int[][][] field75 = new int[4][105][105];

    @ObfuscatedName("g.d")
    public static byte[][][] field66 = new byte[4][104][104];

    @ObfuscatedName("g.z")
    public static int field68 = 99;

    @ObfuscatedName("g.v")
    public static final int[] field72 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("g.c")
    public static final int[] field73 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("g.p")
    public static final int[] field74 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("g.o")
    public static final int[] field71 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("g.b")
    public static final int[] field76 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("g.t")
    public static final int[] field77 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("g.w")
    public static int field78 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("g.i")
    public static int field67 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.n(I)V")
    public static void method2055() {
        field68 = 99;
        Statics.field1970 = new byte[4][104][104];
        Statics.field69 = new byte[4][104][104];
        Statics.field1933 = new byte[4][104][104];
        Statics.field576 = new byte[4][104][104];
        Statics.field219 = new int[4][105][105];
        Statics.field82 = new byte[4][105][105];
        Statics.field3039 = new int[105][105];
        Statics.field710 = new int[104];
        Statics.field81 = new int[104];
        Statics.field1301 = new int[104];
        Statics.field1491 = new int[104];
        Statics.field1307 = new int[104];
    }

    @ObfuscatedName("do.d(I)V")
    public static void method2172() {
        Statics.field1970 = (byte[][][]) null;
        Statics.field69 = (byte[][][]) null;
        Statics.field1933 = (byte[][][]) null;
        Statics.field576 = (byte[][][]) null;
        Statics.field219 = (int[][][]) null;
        Statics.field82 = (byte[][][]) null;
        Statics.field3039 = (int[][]) null;
        Statics.field710 = null;
        Statics.field81 = null;
        Statics.field1301 = null;
        Statics.field1491 = null;
        Statics.field1307 = null;
    }

    @ObfuscatedName("h.z(IIIIB)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field82[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field75[0][var5][var4] = field75[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field75[0][var5][var4] = field75[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field75[0][var5][var4] = field75[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field75[0][var5][var4] = field75[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.y([BIIII[Lhx;I)V")
    public static final void method1967(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class220[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3134[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class111 var9 = new class111(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method643(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("p.e([BIIIIIII[Lhx;B)V")
    public static final void method530(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class220[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3134[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class111 var11 = new class111(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method643(var11, arg1, arg2 + class168.method2868(var13 & 0x7, var14 & 0x7, arg7), arg3 + class168.method893(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method643(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.g(Ldl;IIIIIII)V")
    public static final void method643(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2228();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2228();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2228();
                }
            }
            return;
        }
        field66[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2228();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field75[0][arg2][arg3] = -method1945(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field75[arg1][arg2][arg3] = field75[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2228();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field75[0][arg2][arg3] = -var8 * 8;
                } else {
                    field75[arg1][arg2][arg3] = field75[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field69[arg1][arg2][arg3] = arg0.method2409();
                Statics.field1933[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field576[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field66[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1970[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bk.f([BIILct;[Lhx;I)V")
    public static final void method1487(byte[] arg0, int arg1, int arg2, class81 arg3, class220[] arg4) {
        class111 var5 = new class111(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2241();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2241();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2228();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field66[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class220 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method7(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("d.m(IIIIIILct;Lhx;I)V")
    public static final void method7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class220 arg7) {
        if (client.field338 && (field66[0][arg1][arg2] & 0x2) == 0) {
            if ((field66[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field66[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field66[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field293 != var8) {
                return;
            }
        }
        if (arg0 < field68) {
            field68 = arg0;
        }
        class38 var9 = class38.method1667(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field872;
            var11 = var9.field877;
        } else {
            var10 = var9.field877;
            var11 = var9.field872;
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
        int[][] var16 = field75[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field861 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field901 == 1) {
            var21 += 256;
        }
        if (var9.method723()) {
            class22.method659(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field338 || var9.field861 != 0 || var9.field875 == 1 || var9.field899) {
                class80 var22;
                if (var9.field884 == -1 && var9.field902 == null) {
                    var22 = var9.method738(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var9.field884, true, (class80) null);
                }
                arg6.method1683(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field875 == 1 && arg7 != null) {
                    arg7.method3790(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var45;
            if (var9.field884 == -1 && var9.field902 == null) {
                var45 = var9.method738(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            if (var45 != null && arg6.method1687(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field881) {
                int var46 = 15;
                if (var45 instanceof class100) {
                    var46 = ((class100) var45).method2074() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field82[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field82[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field875 != 0 && arg7 != null) {
                arg7.method3788(arg1, arg2, var10, var11, var9.field888);
            }
        } else if (arg5 >= 12) {
            class80 var23;
            if (var9.field884 == -1 && var9.field902 == null) {
                var23 = var9.method738(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1687(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field219[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field875 != 0 && arg7 != null) {
                arg7.method3788(arg1, arg2, var10, var11, var9.field888);
            }
        } else if (arg5 == 0) {
            class80 var24;
            if (var9.field884 == -1 && var9.field902 == null) {
                var24 = var9.method738(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1685(arg0, arg1, arg2, var17, var24, (class80) null, field72[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field881) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field883) {
                    Statics.field219[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field881) {
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field883) {
                    Statics.field219[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field881) {
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field883) {
                    Statics.field219[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field881) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field883) {
                    Statics.field219[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field875 != 0 && arg7 != null) {
                arg7.method3787(arg1, arg2, arg5, arg4, var9.field888);
            }
            if (var9.field886 != 16) {
                arg6.method1712(arg0, arg1, arg2, var9.field886);
            }
        } else if (arg5 == 1) {
            class80 var25;
            if (var9.field884 == -1 && var9.field902 == null) {
                var25 = var9.method738(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1685(arg0, arg1, arg2, var17, var25, (class80) null, field73[arg4], 0, var20, var21);
            if (var9.field881) {
                if (arg4 == 0) {
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field875 != 0 && arg7 != null) {
                arg7.method3787(arg1, arg2, arg5, arg4, var9.field888);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class80 var27;
            class80 var28;
            if (var9.field884 == -1 && var9.field902 == null) {
                var27 = var9.method738(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method738(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field884, true, (class80) null);
                var28 = new class12(arg3, 2, var26, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1685(arg0, arg1, arg2, var17, var27, var28, field72[arg4], field72[var26], var20, var21);
            if (var9.field883) {
                if (arg4 == 0) {
                    Statics.field219[arg0][arg1][arg2] |= 0x249;
                    Statics.field219[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field219[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field219[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field219[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field219[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field219[arg0][arg1][arg2] |= 0x492;
                    Statics.field219[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field875 != 0 && arg7 != null) {
                arg7.method3787(arg1, arg2, arg5, arg4, var9.field888);
            }
            if (var9.field886 != 16) {
                arg6.method1712(arg0, arg1, arg2, var9.field886);
            }
        } else if (arg5 == 3) {
            class80 var29;
            if (var9.field884 == -1 && var9.field902 == null) {
                var29 = var9.method738(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1685(arg0, arg1, arg2, var17, var29, (class80) null, field73[arg4], 0, var20, var21);
            if (var9.field881) {
                if (arg4 == 0) {
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field875 != 0 && arg7 != null) {
                arg7.method3787(arg1, arg2, arg5, arg4, var9.field888);
            }
        } else if (arg5 == 9) {
            class80 var30;
            if (var9.field884 == -1 && var9.field902 == null) {
                var30 = var9.method738(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1687(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field875 != 0 && arg7 != null) {
                arg7.method3788(arg1, arg2, var10, var11, var9.field888);
            }
            if (var9.field886 != 16) {
                arg6.method1712(arg0, arg1, arg2, var9.field886);
            }
        } else if (arg5 == 4) {
            class80 var31;
            if (var9.field884 == -1 && var9.field902 == null) {
                var31 = var9.method738(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1686(arg0, arg1, arg2, var17, var31, (class80) null, field72[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1703(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class38.method1667(var33 >> 14 & 0x7FFF).field886;
            }
            class80 var34;
            if (var9.field884 == -1 && var9.field902 == null) {
                var34 = var9.method738(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1686(arg0, arg1, arg2, var17, var34, (class80) null, field72[arg4], 0, field74[arg4] * var32, field71[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1703(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class38.method1667(var36 >> 14 & 0x7FFF).field886 / 2;
            }
            class80 var37;
            if (var9.field884 == -1 && var9.field902 == null) {
                var37 = var9.method738(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1686(arg0, arg1, arg2, var17, var37, (class80) null, 256, arg4, field76[arg4] * var35, field77[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class80 var39;
            if (var9.field884 == -1 && var9.field902 == null) {
                var39 = var9.method738(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class12(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1686(arg0, arg1, arg2, var17, var39, (class80) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1703(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class38.method1667(var41 >> 14 & 0x7FFF).field886 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class80 var43;
            class80 var44;
            if (var9.field884 == -1 && var9.field902 == null) {
                var43 = var9.method738(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method738(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field884, true, (class80) null);
                var44 = new class12(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field884, true, (class80) null);
            }
            arg6.method1686(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field76[arg4] * var40, field77[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("dl.a(Lct;[Lhx;I)V")
    public static final void method2441(class81 arg0, class220[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field66[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field66[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3802(var3, var4);
                        }
                    }
                }
            }
        }
        field78 += (int) (Math.random() * 5.0D) - 2;
        if (field78 < -8) {
            field78 = -8;
        }
        if (field78 > 8) {
            field78 = 8;
        }
        field67 += (int) (Math.random() * 5.0D) - 2;
        if (field67 < -16) {
            field67 = -16;
        }
        if (field67 > 16) {
            field67 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field82[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field75[var6][var11 + 1][var10] - field75[var6][var11 - 1][var10];
                    int var13 = field75[var6][var11][var10 + 1] - field75[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field3039[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field710[var20] = 0;
                Statics.field81[var20] = 0;
                Statics.field1301[var20] = 0;
                Statics.field1491[var20] = 0;
                Statics.field1307[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field1970[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class39 var25 = class39.method2057(var24 - 1);
                            Statics.field710[var22] += var25.field917;
                            Statics.field81[var22] += var25.field925;
                            Statics.field1301[var22] += var25.field919;
                            Statics.field1491[var22] += var25.field914;
                            var10002 = Statics.field1307[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field1970[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class39 var28 = class39.method2057(var27 - 1);
                            Statics.field710[var22] -= var28.field917;
                            Statics.field81[var22] -= var28.field925;
                            Statics.field1301[var22] -= var28.field919;
                            Statics.field1491[var22] -= var28.field914;
                            var10002 = Statics.field1307[var22]--;
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
                            var29 += Statics.field710[var35];
                            var30 += Statics.field81[var35];
                            var31 += Statics.field1301[var35];
                            var32 += Statics.field1491[var35];
                            var33 += Statics.field1307[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field710[var36];
                            var30 -= Statics.field81[var36];
                            var31 -= Statics.field1301[var36];
                            var32 -= Statics.field1491[var36];
                            var33 -= Statics.field1307[var36];
                        }
                        if (var34 >= 1 && var34 < 103) {
                            if (client.field338 && (field66[0][var21][var34] & 0x2) == 0) {
                                if ((field66[var6][var21][var34] & 0x10) != 0) {
                                    continue;
                                }
                                int var37;
                                if ((field66[var6][var21][var34] & 0x8) != 0) {
                                    var37 = 0;
                                } else if (var6 <= 0 || (field66[1][var21][var34] & 0x2) == 0) {
                                    var37 = var6;
                                } else {
                                    var37 = var6 - 1;
                                }
                                if (client.field293 != var37) {
                                    continue;
                                }
                            }
                            if (var6 < field68) {
                                field68 = var6;
                            }
                            int var38 = Statics.field1970[var6][var21][var34] & 0xFF;
                            int var39 = Statics.field69[var6][var21][var34] & 0xFF;
                            if (var38 > 0 || var39 > 0) {
                                int var40 = field75[var6][var21][var34];
                                int var41 = field75[var6][var21 + 1][var34];
                                int var42 = field75[var6][var21 + 1][var34 + 1];
                                int var43 = field75[var6][var21][var34 + 1];
                                int var44 = Statics.field3039[var21][var34];
                                int var45 = Statics.field3039[var21 + 1][var34];
                                int var46 = Statics.field3039[var21 + 1][var34 + 1];
                                int var47 = Statics.field3039[var21][var34 + 1];
                                int var48 = -1;
                                int var49 = -1;
                                if (var38 > 0) {
                                    int var50 = var29 * 256 / var32;
                                    int var51 = var30 / var33;
                                    int var52 = var31 / var33;
                                    var48 = method16(var50, var51, var52);
                                    int var53 = field78 + var50 & 0xFF;
                                    int var54 = field67 + var52;
                                    if (var54 < 0) {
                                        var54 = 0;
                                    } else if (var54 > 255) {
                                        var54 = 255;
                                    }
                                    var49 = method16(var53, var51, var54);
                                }
                                if (var6 > 0) {
                                    boolean var55 = true;
                                    if (var38 == 0 && Statics.field1933[var6][var21][var34] != 0) {
                                        var55 = false;
                                    }
                                    if (var39 > 0) {
                                        int var56 = var39 - 1;
                                        class43 var57 = (class43) class43.field992.method3411((long) var56);
                                        class43 var58;
                                        if (var57 == null) {
                                            byte[] var59 = Statics.field996.method2948(4, var56);
                                            class43 var60 = new class43();
                                            if (var59 != null) {
                                                var60.method841(new class111(var59), var56);
                                            }
                                            var60.method839();
                                            class43.field992.method3420(var60, (long) var56);
                                            var58 = var60;
                                        } else {
                                            var58 = var57;
                                        }
                                        if (!var58.field994) {
                                            var55 = false;
                                        }
                                    }
                                    if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
                                        Statics.field219[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var61 = 0;
                                if (var49 != -1) {
                                    var61 = class86.field1511[method603(var49, 96)];
                                }
                                if (var39 == 0) {
                                    arg0.method1730(var6, var21, var34, 0, 0, -1, var40, var41, var42, var43, method603(var48, var44), method603(var48, var45), method603(var48, var46), method603(var48, var47), 0, 0, 0, 0, var61, 0);
                                } else {
                                    int var62 = Statics.field1933[var6][var21][var34] + 1;
                                    byte var63 = Statics.field576[var6][var21][var34];
                                    int var64 = var39 - 1;
                                    class43 var65 = (class43) class43.field992.method3411((long) var64);
                                    class43 var66;
                                    if (var65 == null) {
                                        byte[] var67 = Statics.field996.method2948(4, var64);
                                        class43 var68 = new class43();
                                        if (var67 != null) {
                                            var68.method841(new class111(var67), var64);
                                        }
                                        var68.method839();
                                        class43.field992.method3420(var68, (long) var64);
                                        var66 = var68;
                                    } else {
                                        var66 = var65;
                                    }
                                    int var70 = var66.field1005;
                                    int var71;
                                    int var72;
                                    if (var70 >= 0) {
                                        var71 = Statics.field1512.method1931(var70);
                                        var72 = -1;
                                    } else if (var66.field993 == 16711935) {
                                        var72 = -2;
                                        var70 = -1;
                                        var71 = -2;
                                    } else {
                                        var72 = method16(var66.field997, var66.field998, var66.field999);
                                        int var73 = field78 + var66.field997 & 0xFF;
                                        int var74 = field67 + var66.field999;
                                        if (var74 < 0) {
                                            var74 = 0;
                                        } else if (var74 > 255) {
                                            var74 = 255;
                                        }
                                        var71 = method16(var73, var66.field998, var74);
                                    }
                                    int var75 = 0;
                                    if (var71 != -2) {
                                        var75 = class86.field1511[method859(var71, 96)];
                                    }
                                    if (var66.field1004 != -1) {
                                        int var76 = field78 + var66.field1000 & 0xFF;
                                        int var77 = field67 + var66.field995;
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = method16(var76, var66.field1001, var77);
                                        var75 = class86.field1511[method859(var78, 96)];
                                    }
                                    arg0.method1730(var6, var21, var34, var62, var63, var70, var40, var41, var42, var43, method603(var48, var44), method603(var48, var45), method603(var48, var46), method603(var48, var47), method859(var72, var44), method859(var72, var45), method859(var72, var46), method859(var72, var47), var61, var75);
                                }
                            }
                        }
                    }
                }
            }
            for (int var79 = 1; var79 < 103; var79++) {
                for (int var80 = 1; var80 < 103; var80++) {
                    int var85;
                    if ((field66[var6][var80][var79] & 0x8) != 0) {
                        var85 = 0;
                    } else if (var6 <= 0 || (field66[1][var80][var79] & 0x2) == 0) {
                        var85 = var6;
                    } else {
                        var85 = var6 - 1;
                    }
                    arg0.method1681(var6, var80, var79, var85);
                }
            }
            Statics.field1970[var6] = (byte[][]) null;
            Statics.field69[var6] = (byte[][]) null;
            Statics.field1933[var6] = (byte[][]) null;
            Statics.field576[var6] = (byte[][]) null;
            Statics.field82[var6] = (byte[][]) null;
        }
        arg0.method1708(-50, -10, -50);
        for (int var86 = 0; var86 < 104; var86++) {
            for (int var87 = 0; var87 < 104; var87++) {
                if ((field66[1][var86][var87] & 0x2) == 2) {
                    arg0.method1757(var86, var87);
                }
            }
        }
        int var88 = 1;
        int var89 = 2;
        int var90 = 4;
        for (int var91 = 0; var91 < 4; var91++) {
            if (var91 > 0) {
                var88 <<= 0x3;
                var89 <<= 0x3;
                var90 <<= 0x3;
            }
            for (int var92 = 0; var92 <= var91; var92++) {
                for (int var93 = 0; var93 <= 104; var93++) {
                    for (int var94 = 0; var94 <= 104; var94++) {
                        if ((Statics.field219[var92][var94][var93] & var88) != 0) {
                            int var95 = var93;
                            int var96 = var93;
                            int var97 = var92;
                            int var98 = var92;
                            while (var95 > 0 && (Statics.field219[var92][var94][var95 - 1] & var88) != 0) {
                                var95--;
                            }
                            while (var96 < 104 && (Statics.field219[var92][var94][var96 + 1] & var88) != 0) {
                                var96++;
                            }
                            label369: while (var97 > 0) {
                                for (int var99 = var95; var99 <= var96; var99++) {
                                    if ((Statics.field219[var97 - 1][var94][var99] & var88) == 0) {
                                        break label369;
                                    }
                                }
                                var97--;
                            }
                            label358: while (var98 < var91) {
                                for (int var100 = var95; var100 <= var96; var100++) {
                                    if ((Statics.field219[var98 + 1][var94][var100] & var88) == 0) {
                                        break label358;
                                    }
                                }
                                var98++;
                            }
                            int var101 = (var98 + 1 - var97) * (var96 - var95 + 1);
                            if (var101 >= 8) {
                                short var102 = 240;
                                int var103 = field75[var98][var94][var95] - var102;
                                int var104 = field75[var97][var94][var95];
                                class81.method1680(var91, 1, var94 * 128, var94 * 128, var95 * 128, var96 * 128 + 128, var103, var104);
                                for (int var105 = var97; var105 <= var98; var105++) {
                                    for (int var106 = var95; var106 <= var96; var106++) {
                                        Statics.field219[var105][var94][var106] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field219[var92][var94][var93] & var89) != 0) {
                            int var107 = var94;
                            int var108 = var94;
                            int var109 = var92;
                            int var110 = var92;
                            while (var107 > 0 && (Statics.field219[var92][var107 - 1][var93] & var89) != 0) {
                                var107--;
                            }
                            while (var108 < 104 && (Statics.field219[var92][var108 + 1][var93] & var89) != 0) {
                                var108++;
                            }
                            label422: while (var109 > 0) {
                                for (int var111 = var107; var111 <= var108; var111++) {
                                    if ((Statics.field219[var109 - 1][var111][var93] & var89) == 0) {
                                        break label422;
                                    }
                                }
                                var109--;
                            }
                            label411: while (var110 < var91) {
                                for (int var112 = var107; var112 <= var108; var112++) {
                                    if ((Statics.field219[var110 + 1][var112][var93] & var89) == 0) {
                                        break label411;
                                    }
                                }
                                var110++;
                            }
                            int var113 = (var110 + 1 - var109) * (var108 - var107 + 1);
                            if (var113 >= 8) {
                                short var114 = 240;
                                int var115 = field75[var110][var107][var93] - var114;
                                int var116 = field75[var109][var107][var93];
                                class81.method1680(var91, 2, var107 * 128, var108 * 128 + 128, var93 * 128, var93 * 128, var115, var116);
                                for (int var117 = var109; var117 <= var110; var117++) {
                                    for (int var118 = var107; var118 <= var108; var118++) {
                                        Statics.field219[var117][var118][var93] &= ~var89;
                                    }
                                }
                            }
                        }
                        if ((Statics.field219[var92][var94][var93] & var90) != 0) {
                            int var119 = var94;
                            int var120 = var94;
                            int var121 = var93;
                            int var122 = var93;
                            while (var121 > 0 && (Statics.field219[var92][var94][var121 - 1] & var90) != 0) {
                                var121--;
                            }
                            while (var122 < 104 && (Statics.field219[var92][var94][var122 + 1] & var90) != 0) {
                                var122++;
                            }
                            label475: while (var119 > 0) {
                                for (int var123 = var121; var123 <= var122; var123++) {
                                    if ((Statics.field219[var92][var119 - 1][var123] & var90) == 0) {
                                        break label475;
                                    }
                                }
                                var119--;
                            }
                            label464: while (var120 < 104) {
                                for (int var124 = var121; var124 <= var122; var124++) {
                                    if ((Statics.field219[var92][var120 + 1][var124] & var90) == 0) {
                                        break label464;
                                    }
                                }
                                var120++;
                            }
                            if ((var120 - var119 + 1) * (var122 - var121 + 1) >= 4) {
                                int var125 = field75[var92][var119][var121];
                                class81.method1680(var91, 4, var119 * 128, var120 * 128 + 128, var121 * 128, var122 * 128 + 128, var125, var125);
                                for (int var126 = var119; var126 <= var120; var126++) {
                                    for (int var127 = var121; var127 <= var122; var127++) {
                                        Statics.field219[var92][var126][var127] &= ~var90;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.h(III)I")
    public static final int method1945(int arg0, int arg1) {
        int var2 = method2825(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2825(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2825(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("er.l(IIII)I")
    public static final int method2825(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1961(var3, var5);
        int var8 = method1961(var3 + 1, var5);
        int var9 = method1961(var3, var5 + 1);
        int var10 = method1961(var3 + 1, var5 + 1);
        int var11 = method613(var7, var8, var4, arg2);
        int var12 = method613(var9, var10, var4, arg2);
        return method613(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ae.u(IIIII)I")
    public static final int method613(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class86.field1516[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ch.q(IIS)I")
    public static final int method1961(int arg0, int arg1) {
        int var2 = method3143(arg0 - 1, arg1 - 1) + method3143(arg0 + 1, arg1 - 1) + method3143(arg0 - 1, arg1 + 1) + method3143(arg0 + 1, arg1 + 1);
        int var3 = method3143(arg0 - 1, arg1) + method3143(arg0 + 1, arg1) + method3143(arg0, arg1 - 1) + method3143(arg0, arg1 + 1);
        int var4 = method3143(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("fy.k(III)I")
    public static final int method3143(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ad.x(IIB)I")
    public static final int method603(int arg0, int arg1) {
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

    @ObfuscatedName("aq.r(IIB)I")
    public static final int method859(int arg0, int arg1) {
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

    @ObfuscatedName("d.j(IIII)I")
    public static final int method16(int arg0, int arg1, int arg2) {
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
