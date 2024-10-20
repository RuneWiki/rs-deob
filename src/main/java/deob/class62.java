package deob;

@ObfuscatedName("bg")
public final class class62 {

    @ObfuscatedName("bg.p")
    public static int[][][] field690 = new int[4][105][105];

    @ObfuscatedName("bg.i")
    public static byte[][][] field704 = new byte[4][104][104];

    @ObfuscatedName("bg.w")
    public static int field687 = 99;

    @ObfuscatedName("bg.f")
    public static final int[] field699 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bg.k")
    public static final int[] field698 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bg.e")
    public static final int[] field695 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bg.u")
    public static final int[] field696 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bg.g")
    public static final int[] field697 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bg.z")
    public static final int[] field693 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bg.b")
    public static int field700 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bg.c")
    public static int field685 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.p(B)V")
    public static void method890() {
        field687 = 99;
        Statics.field353 = new byte[4][104][104];
        Statics.field688 = new byte[4][104][104];
        Statics.field689 = new byte[4][104][104];
        Statics.field2160 = new byte[4][104][104];
        Statics.field691 = new int[4][105][105];
        Statics.field393 = new byte[4][105][105];
        Statics.field1372 = new int[105][105];
        Statics.field414 = new int[104];
        Statics.field25 = new int[104];
        Statics.field686 = new int[104];
        Statics.field1670 = new int[104];
        Statics.field3689 = new int[104];
    }

    @ObfuscatedName("co.i(I)V")
    public static void method1774() {
        Statics.field353 = (byte[][][]) null;
        Statics.field688 = (byte[][][]) null;
        Statics.field689 = (byte[][][]) null;
        Statics.field2160 = (byte[][][]) null;
        Statics.field691 = (int[][][]) null;
        Statics.field393 = (byte[][][]) null;
        Statics.field1372 = (int[][]) null;
        Statics.field414 = null;
        Statics.field25 = null;
        Statics.field686 = null;
        Statics.field1670 = null;
        Statics.field3689 = null;
    }

    @ObfuscatedName("il.w(IIIII)V")
    public static final void method4238(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field393[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field690[0][var5][var4] = field690[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field690[0][var5][var4] = field690[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field690[0][var5][var4] = field690[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field690[0][var5][var4] = field690[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.s(IIII)V")
    public static final void method332(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field690[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field690[arg0][arg1][arg2 + var5] = field690[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field690[arg0][arg1 + var6][arg2] = field690[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field690[arg0][arg1 - 1][arg2] != 0) {
            field690[arg0][arg1][arg2] = field690[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field690[arg0][arg1][arg2 - 1] != 0) {
            field690[arg0][arg1][arg2] = field690[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field690[arg0][arg1 - 1][arg2 - 1] != 0) {
            field690[arg0][arg1][arg2] = field690[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("is.j(Lgj;IIIIIIB)V")
    public static final void method4176(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3197();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3197();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3197();
                }
            }
            return;
        }
        field704[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3197();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field690[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1543(var10 + 45365, var11 + 91923, 4) - 128 + (method1543(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1543(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field690[arg1][arg2][arg3] = field690[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3197();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field690[0][arg2][arg3] = -var15 * 8;
                } else {
                    field690[arg1][arg2][arg3] = field690[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field688[arg1][arg2][arg3] = arg0.method3123();
                Statics.field689[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2160[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field704[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field353[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("hj.a([BIIIIIIILee;[Lfg;I)V")
    public static final void method3891(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8, class167[] arg9) {
        class185 var10 = new class185(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3136();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3136();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3197();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class267 var21 = class267.method2363(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3511;
                    int var27 = var21.field3512;
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
                    int var36 = var21.field3511;
                    int var37 = var21.field3512;
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
                        if ((field704[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class167 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method169(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.t(IIIIIILee;Lfg;B)V")
    public static final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class137 arg6, class167 arg7) {
        if (client.field827 && (field704[0][arg1][arg2] & 0x2) == 0 && (field704[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field687) {
            field687 = arg0;
        }
        class267 var8 = class267.method2363(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3512;
            var10 = var8.field3511;
        } else {
            var9 = var8.field3511;
            var10 = var8.field3512;
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
        int[][] var15 = field690[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3515 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3536 == 1) {
            var20 += 256;
        }
        if (var8.method4467()) {
            class80.method75(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field827 || var8.field3515 != 0 || var8.field3513 == 1 || var8.field3496) {
                class139 var21;
                if (var8.field3519 == -1 && var8.field3529 == null) {
                    var21 = var8.method4434(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class97(arg3, 22, arg4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
                }
                arg6.method2622(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3513 == 1 && arg7 != null) {
                    arg7.method2981(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class139 var44;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var44 = var8.method4434(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class97(arg3, 10, arg4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            if (var44 != null && arg6.method2628(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3527) {
                int var45 = 15;
                if (var44 instanceof class131) {
                    var45 = ((class131) var44).method2467() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field393[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field393[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3513 != 0 && arg7 != null) {
                arg7.method2973(arg1, arg2, var9, var10, var8.field3514);
            }
        } else if (arg5 >= 12) {
            class139 var22;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var22 = var8.method4434(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class97(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2628(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field691[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3513 != 0 && arg7 != null) {
                arg7.method2973(arg1, arg2, var9, var10, var8.field3514);
            }
        } else if (arg5 == 0) {
            class139 var23;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var23 = var8.method4434(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class97(arg3, 0, arg4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2624(arg0, arg1, arg2, var16, var23, (class139) null, field699[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3527) {
                    Statics.field393[arg0][arg1][arg2] = 50;
                    Statics.field393[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3518) {
                    Statics.field691[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3527) {
                    Statics.field393[arg0][arg1][arg2 + 1] = 50;
                    Statics.field393[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3518) {
                    Statics.field691[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3527) {
                    Statics.field393[arg0][arg1 + 1][arg2] = 50;
                    Statics.field393[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3518) {
                    Statics.field691[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3527) {
                    Statics.field393[arg0][arg1][arg2] = 50;
                    Statics.field393[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3518) {
                    Statics.field691[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3513 != 0 && arg7 != null) {
                arg7.method2991(arg1, arg2, arg5, arg4, var8.field3514);
            }
            if (var8.field3520 != 16) {
                arg6.method2735(arg0, arg1, arg2, var8.field3520);
            }
        } else if (arg5 == 1) {
            class139 var24;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var24 = var8.method4434(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class97(arg3, 1, arg4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2624(arg0, arg1, arg2, var16, var24, (class139) null, field698[arg4], 0, var19, var20);
            if (var8.field3527) {
                if (arg4 == 0) {
                    Statics.field393[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field393[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field393[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field393[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3513 != 0 && arg7 != null) {
                arg7.method2991(arg1, arg2, arg5, arg4, var8.field3514);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class139 var26;
            class139 var27;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var26 = var8.method4434(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4434(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class97(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
                var27 = new class97(arg3, 2, var25, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2624(arg0, arg1, arg2, var16, var26, var27, field699[arg4], field699[var25], var19, var20);
            if (var8.field3518) {
                if (arg4 == 0) {
                    Statics.field691[arg0][arg1][arg2] |= 0x249;
                    Statics.field691[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field691[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field691[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field691[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field691[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field691[arg0][arg1][arg2] |= 0x492;
                    Statics.field691[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3513 != 0 && arg7 != null) {
                arg7.method2991(arg1, arg2, arg5, arg4, var8.field3514);
            }
            if (var8.field3520 != 16) {
                arg6.method2735(arg0, arg1, arg2, var8.field3520);
            }
        } else if (arg5 == 3) {
            class139 var28;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var28 = var8.method4434(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class97(arg3, 3, arg4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2624(arg0, arg1, arg2, var16, var28, (class139) null, field698[arg4], 0, var19, var20);
            if (var8.field3527) {
                if (arg4 == 0) {
                    Statics.field393[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field393[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field393[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field393[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3513 != 0 && arg7 != null) {
                arg7.method2991(arg1, arg2, arg5, arg4, var8.field3514);
            }
        } else if (arg5 == 9) {
            class139 var29;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var29 = var8.method4434(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class97(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2628(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3513 != 0 && arg7 != null) {
                arg7.method2973(arg1, arg2, var9, var10, var8.field3514);
            }
            if (var8.field3520 != 16) {
                arg6.method2735(arg0, arg1, arg2, var8.field3520);
            }
        } else if (arg5 == 4) {
            class139 var30;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var30 = var8.method4434(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class97(arg3, 4, arg4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2625(arg0, arg1, arg2, var16, var30, (class139) null, field699[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2700(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class267.method2363(var32 >> 14 & 0x7FFF).field3520;
            }
            class139 var33;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var33 = var8.method4434(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class97(arg3, 4, arg4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2625(arg0, arg1, arg2, var16, var33, (class139) null, field699[arg4], 0, field695[arg4] * var31, field696[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2700(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class267.method2363(var35 >> 14 & 0x7FFF).field3520 / 2;
            }
            class139 var36;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var36 = var8.method4434(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class97(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2625(arg0, arg1, arg2, var16, var36, (class139) null, 256, arg4, field697[arg4] * var34, field693[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class139 var38;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var38 = var8.method4434(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class97(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2625(arg0, arg1, arg2, var16, var38, (class139) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2700(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class267.method2363(var40 >> 14 & 0x7FFF).field3520 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class139 var42;
            class139 var43;
            if (var8.field3519 == -1 && var8.field3529 == null) {
                var42 = var8.method4434(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4434(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class97(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
                var43 = new class97(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3519, true, (class139) null);
            }
            arg6.method2625(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field697[arg4] * var39, field693[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("bh.r(IIII)I")
    public static final int method1543(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method91(var3, var5);
        int var8 = method91(var3 + 1, var5);
        int var9 = method91(var3, var5 + 1);
        int var10 = method91(var3 + 1, var5 + 1);
        int var11 = 65536 - class134.field1911[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class134.field1911[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class134.field1911[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("y.m(III)I")
    public static final int method91(int arg0, int arg1) {
        int var2 = method557(arg0 - 1, arg1 - 1) + method557(arg0 + 1, arg1 - 1) + method557(arg0 - 1, arg1 + 1) + method557(arg0 + 1, arg1 + 1);
        int var3 = method557(arg0 - 1, arg1) + method557(arg0 + 1, arg1) + method557(arg0, arg1 - 1) + method557(arg0, arg1 + 1);
        int var4 = method557(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("aq.h(IIB)I")
    public static final int method557(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("av.o(III)I")
    public static final int method497(int arg0, int arg1) {
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

    @ObfuscatedName("ae.x(IIB)I")
    public static final int method328(int arg0, int arg1) {
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

    @ObfuscatedName("ab.q(IIIB)I")
    public static final int method546(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bo.d(III)Z")
    public static final boolean method1026(int arg0, int arg1) {
        class267 var2 = class267.method2363(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4441(arg1);
    }

    @ObfuscatedName("am.l(IIIIIIILee;Lfg;I)V")
    public static final void method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class137 arg7, class167 arg8) {
        class267 var9 = class267.method2363(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3512;
            var11 = var9.field3511;
        } else {
            var10 = var9.field3511;
            var11 = var9.field3512;
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
        int[][] var16 = field690[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field3515 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field3536 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class139 var22;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var22 = var9.method4449(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class97(arg4, 22, arg5, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2622(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field3513 == 1) {
                arg8.method2981(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class139 var45;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var45 = var9.method4449(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class97(arg4, 10, arg5, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            if (var45 != null) {
                arg7.method2628(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field3513 != 0) {
                arg8.method2973(arg2, arg3, var10, var11, var9.field3514);
            }
        } else if (arg6 >= 12) {
            class139 var23;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var23 = var9.method4449(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class97(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2628(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field3513 != 0) {
                arg8.method2973(arg2, arg3, var10, var11, var9.field3514);
            }
        } else if (arg6 == 0) {
            class139 var24;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var24 = var9.method4449(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class97(arg4, 0, arg5, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2624(arg0, arg2, arg3, var17, var24, (class139) null, field699[arg5], 0, var20, var21);
            if (var9.field3513 != 0) {
                arg8.method2991(arg2, arg3, arg6, arg5, var9.field3514);
            }
        } else if (arg6 == 1) {
            class139 var25;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var25 = var9.method4449(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class97(arg4, 1, arg5, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2624(arg0, arg2, arg3, var17, var25, (class139) null, field698[arg5], 0, var20, var21);
            if (var9.field3513 != 0) {
                arg8.method2991(arg2, arg3, arg6, arg5, var9.field3514);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class139 var27;
            class139 var28;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var27 = var9.method4449(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method4449(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class97(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3519, true, (class139) null);
                var28 = new class97(arg4, 2, var26, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2624(arg0, arg2, arg3, var17, var27, var28, field699[arg5], field699[var26], var20, var21);
            if (var9.field3513 != 0) {
                arg8.method2991(arg2, arg3, arg6, arg5, var9.field3514);
            }
        } else if (arg6 == 3) {
            class139 var29;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var29 = var9.method4449(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class97(arg4, 3, arg5, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2624(arg0, arg2, arg3, var17, var29, (class139) null, field698[arg5], 0, var20, var21);
            if (var9.field3513 != 0) {
                arg8.method2991(arg2, arg3, arg6, arg5, var9.field3514);
            }
        } else if (arg6 == 9) {
            class139 var30;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var30 = var9.method4449(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class97(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2628(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field3513 != 0) {
                arg8.method2973(arg2, arg3, var10, var11, var9.field3514);
            }
        } else if (arg6 == 4) {
            class139 var31;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var31 = var9.method4449(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class97(arg4, 4, arg5, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2625(arg0, arg2, arg3, var17, var31, (class139) null, field699[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2700(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class267.method2363(var33 >> 14 & 0x7FFF).field3520;
            }
            class139 var34;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var34 = var9.method4449(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class97(arg4, 4, arg5, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2625(arg0, arg2, arg3, var17, var34, (class139) null, field699[arg5], 0, field695[arg5] * var32, field696[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2700(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class267.method2363(var36 >> 14 & 0x7FFF).field3520 / 2;
            }
            class139 var37;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var37 = var9.method4449(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class97(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2625(arg0, arg2, arg3, var17, var37, (class139) null, 256, arg5, field697[arg5] * var35, field693[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class139 var39;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var39 = var9.method4449(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class97(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2625(arg0, arg2, arg3, var17, var39, (class139) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2700(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class267.method2363(var41 >> 14 & 0x7FFF).field3520 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class139 var43;
            class139 var44;
            if (var9.field3519 == -1 && var9.field3529 == null) {
                var43 = var9.method4449(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method4449(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class97(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3519, true, (class139) null);
                var44 = new class97(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field3519, true, (class139) null);
            }
            arg7.method2625(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field697[arg5] * var40, field693[arg5] * var40, var20, var21);
        }
    }
}
