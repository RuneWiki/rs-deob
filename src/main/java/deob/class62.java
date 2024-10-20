package deob;

@ObfuscatedName("bk")
public final class class62 {

    @ObfuscatedName("bk.c")
    public static int[][][] field763 = new int[4][105][105];

    @ObfuscatedName("bk.o")
    public static byte[][][] field752 = new byte[4][104][104];

    @ObfuscatedName("bk.i")
    public static int field755 = 99;

    @ObfuscatedName("bk.l")
    public static final int[] field764 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bk.q")
    public static final int[] field758 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bk.f")
    public static final int[] field759 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bk.j")
    public static final int[] field760 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bk.n")
    public static final int[] field761 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bk.z")
    public static final int[] field762 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bk.b")
    public static int field751 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bk.d")
    public static int field754 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.c(IIIIB)V")
    public static final void method648(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1950[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field763[0][var5][var4] = field763[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field763[0][var5][var4] = field763[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field763[0][var5][var4] = field763[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field763[0][var5][var4] = field763[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.o([BIIII[Lfu;I)V")
    public static final void method238(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class162[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2260[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class174 var9 = new class174(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method478(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("bj.i(IIII)V")
    public static final void method933(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field763[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field763[arg0][arg1][arg2 + var5] = field763[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field763[arg0][arg1 + var6][arg2] = field763[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field763[arg0][arg1 - 1][arg2] != 0) {
            field763[arg0][arg1][arg2] = field763[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field763[arg0][arg1][arg2 - 1] != 0) {
            field763[arg0][arg1][arg2] = field763[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field763[arg0][arg1 - 1][arg2 - 1] != 0) {
            field763[arg0][arg1][arg2] = field763[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ac.u(Lfp;IIIIIII)V")
    public static final void method478(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2843();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2843();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2843();
                }
            }
            return;
        }
        field752[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2843();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field763[0][arg2][arg3] = -method2599(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field763[arg1][arg2][arg3] = field763[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2843();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field763[0][arg2][arg3] = -var8 * 8;
                } else {
                    field763[arg1][arg2][arg3] = field763[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field29[arg1][arg2][arg3] = arg0.method3014();
                Statics.field753[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field289[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field752[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field2823[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bo.g([BIILej;[Lfu;I)V")
    public static final void method844(byte[] arg0, int arg1, int arg2, class140 arg3, class162[] arg4) {
        class174 var5 = new class174(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3016();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3016();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2843();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field752[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class162 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method170(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("b.m(IIIIIILej;Lfu;B)V")
    public static final void method170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class140 arg6, class162 arg7) {
        if (client.field919 && (field752[0][arg1][arg2] & 0x2) == 0 && (field752[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field755) {
            field755 = arg0;
        }
        class256 var8 = class256.method2825(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3425;
            var10 = var8.field3426;
        } else {
            var9 = var8.field3426;
            var10 = var8.field3425;
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
        int[][] var15 = field763[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3430 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3432 == 1) {
            var20 += 256;
        }
        if (var8.method4104()) {
            class83.method239(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field919 || var8.field3430 != 0 || var8.field3428 == 1 || var8.field3449) {
                class142 var21;
                if (var8.field3434 == -1 && var8.field3452 == null) {
                    var21 = var8.method4097(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class101(arg3, 22, arg4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
                }
                arg6.method2533(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3428 == 1 && arg7 != null) {
                    arg7.method2719(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class142 var44;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var44 = var8.method4097(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class101(arg3, 10, arg4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            if (var44 != null && arg6.method2434(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3442) {
                int var45 = 15;
                if (var44 instanceof class134) {
                    var45 = ((class134) var44).method2277() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field1950[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field1950[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3428 != 0 && arg7 != null) {
                arg7.method2744(arg1, arg2, var9, var10, var8.field3440);
            }
        } else if (arg5 >= 12) {
            class142 var22;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var22 = var8.method4097(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2434(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field756[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3428 != 0 && arg7 != null) {
                arg7.method2744(arg1, arg2, var9, var10, var8.field3440);
            }
        } else if (arg5 == 0) {
            class142 var23;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var23 = var8.method4097(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class101(arg3, 0, arg4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2432(arg0, arg1, arg2, var16, var23, (class142) null, field764[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3442) {
                    Statics.field1950[arg0][arg1][arg2] = 50;
                    Statics.field1950[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3433) {
                    Statics.field756[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3442) {
                    Statics.field1950[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1950[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3433) {
                    Statics.field756[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3442) {
                    Statics.field1950[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1950[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3433) {
                    Statics.field756[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3442) {
                    Statics.field1950[arg0][arg1][arg2] = 50;
                    Statics.field1950[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3433) {
                    Statics.field756[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3428 != 0 && arg7 != null) {
                arg7.method2716(arg1, arg2, arg5, arg4, var8.field3440);
            }
            if (var8.field3448 != 16) {
                arg6.method2457(arg0, arg1, arg2, var8.field3448);
            }
        } else if (arg5 == 1) {
            class142 var24;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var24 = var8.method4097(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class101(arg3, 1, arg4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2432(arg0, arg1, arg2, var16, var24, (class142) null, field758[arg4], 0, var19, var20);
            if (var8.field3442) {
                if (arg4 == 0) {
                    Statics.field1950[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1950[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1950[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1950[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3428 != 0 && arg7 != null) {
                arg7.method2716(arg1, arg2, arg5, arg4, var8.field3440);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class142 var26;
            class142 var27;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var26 = var8.method4097(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4097(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class101(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
                var27 = new class101(arg3, 2, var25, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2432(arg0, arg1, arg2, var16, var26, var27, field764[arg4], field764[var25], var19, var20);
            if (var8.field3433) {
                if (arg4 == 0) {
                    Statics.field756[arg0][arg1][arg2] |= 0x249;
                    Statics.field756[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field756[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field756[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field756[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field756[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field756[arg0][arg1][arg2] |= 0x492;
                    Statics.field756[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3428 != 0 && arg7 != null) {
                arg7.method2716(arg1, arg2, arg5, arg4, var8.field3440);
            }
            if (var8.field3448 != 16) {
                arg6.method2457(arg0, arg1, arg2, var8.field3448);
            }
        } else if (arg5 == 3) {
            class142 var28;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var28 = var8.method4097(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class101(arg3, 3, arg4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2432(arg0, arg1, arg2, var16, var28, (class142) null, field758[arg4], 0, var19, var20);
            if (var8.field3442) {
                if (arg4 == 0) {
                    Statics.field1950[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1950[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1950[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1950[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3428 != 0 && arg7 != null) {
                arg7.method2716(arg1, arg2, arg5, arg4, var8.field3440);
            }
        } else if (arg5 == 9) {
            class142 var29;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var29 = var8.method4097(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2434(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3428 != 0 && arg7 != null) {
                arg7.method2744(arg1, arg2, var9, var10, var8.field3440);
            }
            if (var8.field3448 != 16) {
                arg6.method2457(arg0, arg1, arg2, var8.field3448);
            }
        } else if (arg5 == 4) {
            class142 var30;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var30 = var8.method4097(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2433(arg0, arg1, arg2, var16, var30, (class142) null, field764[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2567(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class256.method2825(var32 >> 14 & 0x7FFF).field3448;
            }
            class142 var33;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var33 = var8.method4097(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2433(arg0, arg1, arg2, var16, var33, (class142) null, field764[arg4], 0, field759[arg4] * var31, field760[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2567(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class256.method2825(var35 >> 14 & 0x7FFF).field3448 / 2;
            }
            class142 var36;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var36 = var8.method4097(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2433(arg0, arg1, arg2, var16, var36, (class142) null, 256, arg4, field761[arg4] * var34, field762[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class142 var38;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var38 = var8.method4097(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class101(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2433(arg0, arg1, arg2, var16, var38, (class142) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2567(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class256.method2825(var40 >> 14 & 0x7FFF).field3448 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class142 var42;
            class142 var43;
            if (var8.field3434 == -1 && var8.field3452 == null) {
                var42 = var8.method4097(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4097(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
                var43 = new class101(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3434, true, (class142) null);
            }
            arg6.method2433(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field761[arg4] * var39, field762[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("bp.s(IIII)I")
    public static int method954(int arg0, int arg1, int arg2) {
        if ((field752[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field752[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ex.x(III)I")
    public static final int method2599(int arg0, int arg1) {
        int var2 = method459(arg0 + 45365, arg1 + 91923, 4) - 128 + (method459(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method459(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("at.p(IIII)I")
    public static final int method459(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1(var3, var5);
        int var8 = method1(var3 + 1, var5);
        int var9 = method1(var3, var5 + 1);
        int var10 = method1(var3 + 1, var5 + 1);
        int var11 = 65536 - class137.field1973[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class137.field1973[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class137.field1973[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("o.k(III)I")
    public static final int method1(int arg0, int arg1) {
        int var2 = method93(arg0 - 1, arg1 - 1) + method93(arg0 + 1, arg1 - 1) + method93(arg0 - 1, arg1 + 1) + method93(arg0 + 1, arg1 + 1);
        int var3 = method93(arg0 - 1, arg1) + method93(arg0 + 1, arg1) + method93(arg0, arg1 - 1) + method93(arg0, arg1 + 1);
        int var4 = method93(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("e.r(III)I")
    public static final int method93(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ai.w(III)I")
    public static final int method532(int arg0, int arg1) {
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

    @ObfuscatedName("ek.v(III)I")
    public static final int method2324(int arg0, int arg1) {
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

    @ObfuscatedName("ji.h(IIII)I")
    public static final int method4427(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("av.t(III)Z")
    public static final boolean method237(int arg0, int arg1) {
        class256 var2 = class256.method2825(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4095(arg1);
    }
}
