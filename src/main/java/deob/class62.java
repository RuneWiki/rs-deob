package deob;

@ObfuscatedName("bc")
public final class class62 {

    @ObfuscatedName("bc.p")
    public static int[][][] field764 = new int[4][105][105];

    @ObfuscatedName("bc.m")
    public static byte[][][] field750 = new byte[4][104][104];

    @ObfuscatedName("bc.e")
    public static int field760 = 99;

    @ObfuscatedName("bc.r")
    public static final int[] field749 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bc.l")
    public static final int[] field757 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bc.h")
    public static final int[] field758 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bc.d")
    public static final int[] field759 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bc.x")
    public static final int[] field753 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bc.b")
    public static final int[] field761 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bc.y")
    public static int field762 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bc.u")
    public static int field763 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.m(B)V")
    public static void method657() {
        Statics.field752 = (byte[][][]) null;
        Statics.field756 = (byte[][][]) null;
        Statics.field1398 = (byte[][][]) null;
        Statics.field3731 = (byte[][][]) null;
        Statics.field751 = (int[][][]) null;
        Statics.field3670 = (byte[][][]) null;
        Statics.field775 = (int[][]) null;
        Statics.field2649 = null;
        Statics.field754 = null;
        Statics.field2141 = null;
        Statics.field553 = null;
        Statics.field811 = null;
    }

    @ObfuscatedName("fw.e(IIIII)V")
    public static final void method3027(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3670[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field764[0][var5][var4] = field764[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field764[0][var5][var4] = field764[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field764[0][var5][var4] = field764[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field764[0][var5][var4] = field764[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("df.t(Lfr;IIIIIII)V")
    public static final void method1833(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2810();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2810();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2810();
                }
            }
            return;
        }
        field750[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2810();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field764[0][arg2][arg3] = -method80(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field764[arg1][arg2][arg3] = field764[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2810();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field764[0][arg2][arg3] = -var8 * 8;
                } else {
                    field764[arg1][arg2][arg3] = field764[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field756[arg1][arg2][arg3] = arg0.method2811();
                Statics.field1398[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3731[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field750[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field752[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("aw.w(IIIIIILeq;Lfa;I)V")
    public static final void method617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class140 arg6, class162 arg7) {
        if (client.field1056 && (field750[0][arg1][arg2] & 0x2) == 0 && (field750[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field760) {
            field760 = arg0;
        }
        class256 var8 = class256.method239(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3459;
            var10 = var8.field3458;
        } else {
            var9 = var8.field3458;
            var10 = var8.field3459;
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
        int[][] var15 = field764[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3446 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3483 == 1) {
            var20 += 256;
        }
        if (var8.method4084()) {
            class83.method1518(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field1056 || var8.field3446 != 0 || var8.field3477 == 1 || var8.field3481) {
                class142 var21;
                if (var8.field3466 == -1 && var8.field3484 == null) {
                    var21 = var8.method4090(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class101(arg3, 22, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
                }
                arg6.method2461(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3477 == 1 && arg7 != null) {
                    arg7.method2699(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class142 var44;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var44 = var8.method4090(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class101(arg3, 10, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            if (var44 != null && arg6.method2415(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3474) {
                int var45 = 15;
                if (var44 instanceof class134) {
                    var45 = ((class134) var44).method2226() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field3670[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field3670[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3477 != 0 && arg7 != null) {
                arg7.method2697(arg1, arg2, var9, var10, var8.field3469);
            }
        } else if (arg5 >= 12) {
            class142 var22;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var22 = var8.method4090(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2415(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field751[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3477 != 0 && arg7 != null) {
                arg7.method2697(arg1, arg2, var9, var10, var8.field3469);
            }
        } else if (arg5 == 0) {
            class142 var23;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var23 = var8.method4090(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class101(arg3, 0, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2413(arg0, arg1, arg2, var16, var23, (class142) null, field749[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3474) {
                    Statics.field3670[arg0][arg1][arg2] = 50;
                    Statics.field3670[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3480) {
                    Statics.field751[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3474) {
                    Statics.field3670[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3670[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3480) {
                    Statics.field751[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3474) {
                    Statics.field3670[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3670[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3480) {
                    Statics.field751[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3474) {
                    Statics.field3670[arg0][arg1][arg2] = 50;
                    Statics.field3670[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3480) {
                    Statics.field751[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3477 != 0 && arg7 != null) {
                arg7.method2705(arg1, arg2, arg5, arg4, var8.field3469);
            }
            if (var8.field3476 != 16) {
                arg6.method2421(arg0, arg1, arg2, var8.field3476);
            }
        } else if (arg5 == 1) {
            class142 var24;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var24 = var8.method4090(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class101(arg3, 1, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2413(arg0, arg1, arg2, var16, var24, (class142) null, field757[arg4], 0, var19, var20);
            if (var8.field3474) {
                if (arg4 == 0) {
                    Statics.field3670[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3670[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3670[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3670[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3477 != 0 && arg7 != null) {
                arg7.method2705(arg1, arg2, arg5, arg4, var8.field3469);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class142 var26;
            class142 var27;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var26 = var8.method4090(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4090(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class101(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
                var27 = new class101(arg3, 2, var25, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2413(arg0, arg1, arg2, var16, var26, var27, field749[arg4], field749[var25], var19, var20);
            if (var8.field3480) {
                if (arg4 == 0) {
                    Statics.field751[arg0][arg1][arg2] |= 0x249;
                    Statics.field751[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field751[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field751[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field751[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field751[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field751[arg0][arg1][arg2] |= 0x492;
                    Statics.field751[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3477 != 0 && arg7 != null) {
                arg7.method2705(arg1, arg2, arg5, arg4, var8.field3469);
            }
            if (var8.field3476 != 16) {
                arg6.method2421(arg0, arg1, arg2, var8.field3476);
            }
        } else if (arg5 == 3) {
            class142 var28;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var28 = var8.method4090(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class101(arg3, 3, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2413(arg0, arg1, arg2, var16, var28, (class142) null, field757[arg4], 0, var19, var20);
            if (var8.field3474) {
                if (arg4 == 0) {
                    Statics.field3670[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3670[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3670[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3670[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3477 != 0 && arg7 != null) {
                arg7.method2705(arg1, arg2, arg5, arg4, var8.field3469);
            }
        } else if (arg5 == 9) {
            class142 var29;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var29 = var8.method4090(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2415(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3477 != 0 && arg7 != null) {
                arg7.method2697(arg1, arg2, var9, var10, var8.field3469);
            }
            if (var8.field3476 != 16) {
                arg6.method2421(arg0, arg1, arg2, var8.field3476);
            }
        } else if (arg5 == 4) {
            class142 var30;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var30 = var8.method4090(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2527(arg0, arg1, arg2, var16, var30, (class142) null, field749[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2411(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class256.method239(var32 >> 14 & 0x7FFF).field3476;
            }
            class142 var33;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var33 = var8.method4090(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2527(arg0, arg1, arg2, var16, var33, (class142) null, field749[arg4], 0, field758[arg4] * var31, field759[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2411(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class256.method239(var35 >> 14 & 0x7FFF).field3476 / 2;
            }
            class142 var36;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var36 = var8.method4090(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2527(arg0, arg1, arg2, var16, var36, (class142) null, 256, arg4, field753[arg4] * var34, field761[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class142 var38;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var38 = var8.method4090(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class101(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2527(arg0, arg1, arg2, var16, var38, (class142) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2411(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class256.method239(var40 >> 14 & 0x7FFF).field3476 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class142 var42;
            class142 var43;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var42 = var8.method4090(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4090(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
                var43 = new class101(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2527(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field753[arg4] * var39, field761[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("n.z(IIII)I")
    public static int method61(int arg0, int arg1, int arg2) {
        if ((field750[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field750[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("g.j(III)I")
    public static final int method80(int arg0, int arg1) {
        int var2 = Statics.method2737(arg0 + 45365, arg1 + 91923, 4) - 128 + (Statics.method2737(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Statics.method2737(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ax.o(IIS)I")
    public static final int method215(int arg0, int arg1) {
        int var2 = method67(arg0 - 1, arg1 - 1) + method67(arg0 + 1, arg1 - 1) + method67(arg0 - 1, arg1 + 1) + method67(arg0 + 1, arg1 + 1);
        int var3 = method67(arg0 - 1, arg1) + method67(arg0 + 1, arg1) + method67(arg0, arg1 - 1) + method67(arg0, arg1 + 1);
        int var4 = method67(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("a.q(III)I")
    public static final int method67(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("az.n(III)I")
    public static final int method572(int arg0, int arg1) {
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

    @ObfuscatedName("ap.a(III)I")
    public static final int method249(int arg0, int arg1) {
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

    @ObfuscatedName("ct.v(IIB)Z")
    public static final boolean method1529(int arg0, int arg1) {
        class256 var2 = class256.method239(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4123(arg1);
    }
}
