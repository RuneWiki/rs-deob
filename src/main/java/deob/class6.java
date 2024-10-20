package deob;

@ObfuscatedName("g")
public final class class6 {

    @ObfuscatedName("g.v")
    public static int[][][] field90 = new int[4][105][105];

    @ObfuscatedName("g.t")
    public static byte[][][] field98 = new byte[4][104][104];

    @ObfuscatedName("g.f")
    public static int field77 = 99;

    @ObfuscatedName("g.b")
    public static final int[] field86 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("g.a")
    public static final int[] field87 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("g.i")
    public static final int[] field88 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("g.w")
    public static final int[] field96 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("g.x")
    public static final int[] field80 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("g.h")
    public static final int[] field91 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("g.z")
    public static int field85 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("g.u")
    public static int field93 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.v(I)V")
    public static void method905() {
        field77 = 99;
        Statics.field83 = new byte[4][104][104];
        Statics.field79 = new byte[4][104][104];
        Statics.field78 = new byte[4][104][104];
        Statics.field81 = new byte[4][104][104];
        Statics.field76 = new int[4][105][105];
        Statics.field82 = new byte[4][105][105];
        Statics.field2087 = new int[105][105];
        Statics.field92 = new int[104];
        Statics.field56 = new int[104];
        Statics.field84 = new int[104];
        Statics.field526 = new int[104];
        Statics.field710 = new int[104];
    }

    @ObfuscatedName("g.t(I)V")
    public static void method33() {
        Statics.field83 = (byte[][][]) null;
        Statics.field79 = (byte[][][]) null;
        Statics.field78 = (byte[][][]) null;
        Statics.field81 = (byte[][][]) null;
        Statics.field76 = (int[][][]) null;
        Statics.field82 = (byte[][][]) null;
        Statics.field2087 = (int[][]) null;
        Statics.field92 = null;
        Statics.field56 = null;
        Statics.field84 = null;
        Statics.field526 = null;
        Statics.field710 = null;
    }

    @ObfuscatedName("ai.f(IIIII)V")
    public static final void method595(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field82[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field90[0][var5][var4] = field90[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field90[0][var5][var4] = field90[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field90[0][var5][var4] = field90[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field90[0][var5][var4] = field90[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.l([BIIIIIII[Lhy;B)V")
    public static final void method1797(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class211[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3031[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class110 var11 = new class110(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method2309(var11, arg1, arg2 + class160.method614(var13 & 0x7, var14 & 0x7, arg7), arg3 + class160.method2905(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2309(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.g(Ldp;IIIIIIB)V")
    public static final void method2309(class110 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2257();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2257();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2257();
                }
            }
            return;
        }
        field98[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2257();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field90[0][arg2][arg3] = -method2749(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field90[arg1][arg2][arg3] = field90[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2257();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field90[0][arg2][arg3] = -var8 * 8;
                } else {
                    field90[arg1][arg2][arg3] = field90[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field79[arg1][arg2][arg3] = arg0.method2162();
                Statics.field78[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field81[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field98[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field83[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cc.k([BIILcf;[Lhy;I)V")
    public static final void method1897(byte[] arg0, int arg1, int arg2, class80 arg3, class211[] arg4) {
        class110 var5 = new class110(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2174();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2174();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2257();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field98[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class211 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method134(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("s.p(IIIIIILcf;Lhy;B)V")
    public static final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class80 arg6, class211 arg7) {
        if (client.field252 && (field98[0][arg1][arg2] & 0x2) == 0) {
            if ((field98[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field98[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field98[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field301 != var8) {
                return;
            }
        }
        if (arg0 < field77) {
            field77 = arg0;
        }
        class37 var9 = class37.method7(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field875;
            var11 = var9.field854;
        } else {
            var10 = var9.field854;
            var11 = var9.field875;
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
        int[][] var16 = field90[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field855 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field870 == 1) {
            var21 += 256;
        }
        if (var9.method666()) {
            class21.method606(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field252 || var9.field855 != 0 || var9.field856 == 1 || var9.field859) {
                class79 var22;
                if (var9.field861 == -1 && var9.field880 == null) {
                    var22 = var9.method661(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var9.field861, true, (class79) null);
                }
                arg6.method1622(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field856 == 1 && arg7 != null) {
                    arg7.method3650(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class79 var45;
            if (var9.field861 == -1 && var9.field880 == null) {
                var45 = var9.method661(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            if (var45 != null && arg6.method1626(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field877) {
                int var46 = 15;
                if (var45 instanceof class99) {
                    var46 = ((class99) var45).method2007() / 4;
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
            if (var9.field856 != 0 && arg7 != null) {
                arg7.method3632(arg1, arg2, var10, var11, var9.field843);
            }
        } else if (arg5 >= 12) {
            class79 var23;
            if (var9.field861 == -1 && var9.field880 == null) {
                var23 = var9.method661(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1626(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field76[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field856 != 0 && arg7 != null) {
                arg7.method3632(arg1, arg2, var10, var11, var9.field843);
            }
        } else if (arg5 == 0) {
            class79 var24;
            if (var9.field861 == -1 && var9.field880 == null) {
                var24 = var9.method661(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1668(arg0, arg1, arg2, var17, var24, (class79) null, field86[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field877) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field841) {
                    Statics.field76[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field877) {
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field841) {
                    Statics.field76[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field877) {
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field841) {
                    Statics.field76[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field877) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field841) {
                    Statics.field76[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field856 != 0 && arg7 != null) {
                arg7.method3658(arg1, arg2, arg5, arg4, var9.field843);
            }
            if (var9.field863 != 16) {
                arg6.method1766(arg0, arg1, arg2, var9.field863);
            }
        } else if (arg5 == 1) {
            class79 var25;
            if (var9.field861 == -1 && var9.field880 == null) {
                var25 = var9.method661(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1668(arg0, arg1, arg2, var17, var25, (class79) null, field87[arg4], 0, var20, var21);
            if (var9.field877) {
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
            if (var9.field856 != 0 && arg7 != null) {
                arg7.method3658(arg1, arg2, arg5, arg4, var9.field843);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class79 var27;
            class79 var28;
            if (var9.field861 == -1 && var9.field880 == null) {
                var27 = var9.method661(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method661(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field861, true, (class79) null);
                var28 = new class11(arg3, 2, var26, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1668(arg0, arg1, arg2, var17, var27, var28, field86[arg4], field86[var26], var20, var21);
            if (var9.field841) {
                if (arg4 == 0) {
                    Statics.field76[arg0][arg1][arg2] |= 0x249;
                    Statics.field76[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field76[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field76[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field76[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field76[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field76[arg0][arg1][arg2] |= 0x492;
                    Statics.field76[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field856 != 0 && arg7 != null) {
                arg7.method3658(arg1, arg2, arg5, arg4, var9.field843);
            }
            if (var9.field863 != 16) {
                arg6.method1766(arg0, arg1, arg2, var9.field863);
            }
        } else if (arg5 == 3) {
            class79 var29;
            if (var9.field861 == -1 && var9.field880 == null) {
                var29 = var9.method661(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1668(arg0, arg1, arg2, var17, var29, (class79) null, field87[arg4], 0, var20, var21);
            if (var9.field877) {
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
            if (var9.field856 != 0 && arg7 != null) {
                arg7.method3658(arg1, arg2, arg5, arg4, var9.field843);
            }
        } else if (arg5 == 9) {
            class79 var30;
            if (var9.field861 == -1 && var9.field880 == null) {
                var30 = var9.method661(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1626(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field856 != 0 && arg7 != null) {
                arg7.method3632(arg1, arg2, var10, var11, var9.field843);
            }
            if (var9.field863 != 16) {
                arg6.method1766(arg0, arg1, arg2, var9.field863);
            }
        } else if (arg5 == 4) {
            class79 var31;
            if (var9.field861 == -1 && var9.field880 == null) {
                var31 = var9.method661(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1625(arg0, arg1, arg2, var17, var31, (class79) null, field86[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1642(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class37.method7(var33 >> 14 & 0x7FFF).field863;
            }
            class79 var34;
            if (var9.field861 == -1 && var9.field880 == null) {
                var34 = var9.method661(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1625(arg0, arg1, arg2, var17, var34, (class79) null, field86[arg4], 0, field88[arg4] * var32, field96[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1642(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class37.method7(var36 >> 14 & 0x7FFF).field863 / 2;
            }
            class79 var37;
            if (var9.field861 == -1 && var9.field880 == null) {
                var37 = var9.method661(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1625(arg0, arg1, arg2, var17, var37, (class79) null, 256, arg4, field80[arg4] * var35, field91[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class79 var39;
            if (var9.field861 == -1 && var9.field880 == null) {
                var39 = var9.method661(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1625(arg0, arg1, arg2, var17, var39, (class79) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1642(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class37.method7(var41 >> 14 & 0x7FFF).field863 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class79 var43;
            class79 var44;
            if (var9.field861 == -1 && var9.field880 == null) {
                var43 = var9.method661(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method661(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field861, true, (class79) null);
                var44 = new class11(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field861, true, (class79) null);
            }
            arg6.method1625(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field80[arg4] * var40, field91[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("ed.y(III)I")
    public static final int method2749(int arg0, int arg1) {
        int var2 = method2863(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2863(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2863(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ei.m(IIIB)I")
    public static final int method2863(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2095(var3, var5);
        int var8 = method2095(var3 + 1, var5);
        int var9 = method2095(var3, var5 + 1);
        int var10 = method2095(var3 + 1, var5 + 1);
        int var11 = method496(var7, var8, var4, arg2);
        int var12 = method496(var9, var10, var4, arg2);
        return method496(var11, var12, var6, arg2);
    }

    @ObfuscatedName("i.o(IIIII)I")
    public static final int method496(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1483[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ds.c(IIB)I")
    public static final int method2095(int arg0, int arg1) {
        int var2 = method2756(arg0 - 1, arg1 - 1) + method2756(arg0 + 1, arg1 - 1) + method2756(arg0 - 1, arg1 + 1) + method2756(arg0 + 1, arg1 + 1);
        int var3 = method2756(arg0 - 1, arg1) + method2756(arg0 + 1, arg1) + method2756(arg0, arg1 - 1) + method2756(arg0, arg1 + 1);
        int var4 = method2756(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("eh.r(III)I")
    public static final int method2756(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("p.s(III)I")
    public static final int method78(int arg0, int arg1) {
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

    @ObfuscatedName("eu.q(IIII)I")
    public static final int method2753(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dy.e(IIIIIIILcf;Lhy;I)V")
    public static final void method2100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class80 arg7, class211 arg8) {
        class37 var9 = class37.method7(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field875;
            var11 = var9.field854;
        } else {
            var10 = var9.field854;
            var11 = var9.field875;
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
        int[][] var16 = field90[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field855 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field870 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class79 var22;
            if (var9.field861 == -1 && var9.field880 == null) {
                var22 = var9.method662(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class11(arg4, 22, arg5, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1622(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field856 == 1) {
                arg8.method3650(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class79 var45;
            if (var9.field861 == -1 && var9.field880 == null) {
                var45 = var9.method662(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg4, 10, arg5, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            if (var45 != null) {
                arg7.method1626(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field856 != 0) {
                arg8.method3632(arg2, arg3, var10, var11, var9.field843);
            }
        } else if (arg6 >= 12) {
            class79 var23;
            if (var9.field861 == -1 && var9.field880 == null) {
                var23 = var9.method662(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1626(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field856 != 0) {
                arg8.method3632(arg2, arg3, var10, var11, var9.field843);
            }
        } else if (arg6 == 0) {
            class79 var24;
            if (var9.field861 == -1 && var9.field880 == null) {
                var24 = var9.method662(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg4, 0, arg5, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var24, (class79) null, field86[arg5], 0, var20, var21);
            if (var9.field856 != 0) {
                arg8.method3658(arg2, arg3, arg6, arg5, var9.field843);
            }
        } else if (arg6 == 1) {
            class79 var25;
            if (var9.field861 == -1 && var9.field880 == null) {
                var25 = var9.method662(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg4, 1, arg5, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var25, (class79) null, field87[arg5], 0, var20, var21);
            if (var9.field856 != 0) {
                arg8.method3658(arg2, arg3, arg6, arg5, var9.field843);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class79 var27;
            class79 var28;
            if (var9.field861 == -1 && var9.field880 == null) {
                var27 = var9.method662(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method662(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field861, true, (class79) null);
                var28 = new class11(arg4, 2, var26, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var27, var28, field86[arg5], field86[var26], var20, var21);
            if (var9.field856 != 0) {
                arg8.method3658(arg2, arg3, arg6, arg5, var9.field843);
            }
        } else if (arg6 == 3) {
            class79 var29;
            if (var9.field861 == -1 && var9.field880 == null) {
                var29 = var9.method662(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg4, 3, arg5, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var29, (class79) null, field87[arg5], 0, var20, var21);
            if (var9.field856 != 0) {
                arg8.method3658(arg2, arg3, arg6, arg5, var9.field843);
            }
        } else if (arg6 == 9) {
            class79 var30;
            if (var9.field861 == -1 && var9.field880 == null) {
                var30 = var9.method662(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1626(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field856 != 0) {
                arg8.method3632(arg2, arg3, var10, var11, var9.field843);
            }
        } else if (arg6 == 4) {
            class79 var31;
            if (var9.field861 == -1 && var9.field880 == null) {
                var31 = var9.method662(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var31, (class79) null, field86[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1642(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class37.method7(var33 >> 14 & 0x7FFF).field863;
            }
            class79 var34;
            if (var9.field861 == -1 && var9.field880 == null) {
                var34 = var9.method662(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var34, (class79) null, field86[arg5], 0, field88[arg5] * var32, field96[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1642(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class37.method7(var36 >> 14 & 0x7FFF).field863 / 2;
            }
            class79 var37;
            if (var9.field861 == -1 && var9.field880 == null) {
                var37 = var9.method662(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var37, (class79) null, 256, arg5, field80[arg5] * var35, field91[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class79 var39;
            if (var9.field861 == -1 && var9.field880 == null) {
                var39 = var9.method662(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var39, (class79) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1642(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class37.method7(var41 >> 14 & 0x7FFF).field863 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class79 var43;
            class79 var44;
            if (var9.field861 == -1 && var9.field880 == null) {
                var43 = var9.method662(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method662(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field861, true, (class79) null);
                var44 = new class11(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field861, true, (class79) null);
            }
            arg7.method1625(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field80[arg5] * var40, field91[arg5] * var40, var20, var21);
        }
    }
}
