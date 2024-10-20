package deob;

@ObfuscatedName("t")
public final class class9 {

    @ObfuscatedName("t.g")
    public static int[][][] field126 = new int[4][105][105];

    @ObfuscatedName("t.e")
    public static byte[][][] field125 = new byte[4][104][104];

    @ObfuscatedName("t.n")
    public static int field119 = 99;

    @ObfuscatedName("t.y")
    public static final int[] field129 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("t.b")
    public static final int[] field118 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("t.h")
    public static final int[] field131 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("t.f")
    public static final int[] field132 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("t.v")
    public static final int[] field133 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("t.u")
    public static final int[] field134 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("t.k")
    public static int field135 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("t.c")
    public static int field136 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.g(IIIII)V")
    public static final void method39(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field123[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field126[0][var5][var4] = field126[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field126[0][var5][var4] = field126[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field126[0][var5][var4] = field126[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field126[0][var5][var4] = field126[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.e(IIII)V")
    public static final void method214(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field126[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field126[arg0][arg1][arg2 + var5] = field126[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field126[arg0][arg1 + var6][arg2] = field126[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field126[arg0][arg1 - 1][arg2] != 0) {
            field126[arg0][arg1][arg2] = field126[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field126[arg0][arg1][arg2 - 1] != 0) {
            field126[arg0][arg1][arg2] = field126[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field126[arg0][arg1 - 1][arg2 - 1] != 0) {
            field126[arg0][arg1][arg2] = field126[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("an.n(Ldu;IIIIIIB)V")
    public static final void method706(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2485();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2485();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2485();
                }
            }
            return;
        }
        field125[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2485();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field126[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method24(var10 + 45365, var11 + 91923, 4) - 128 + (method24(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method24(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field126[arg1][arg2][arg3] = field126[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2485();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field126[0][arg2][arg3] = -var15 * 8;
                } else {
                    field126[arg1][arg2][arg3] = field126[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field117[arg1][arg2][arg3] = arg0.method2479();
                Statics.field122[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field363[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field125[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field121[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dt.j([BIII)Z")
    public static final boolean method2708(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class126 var4 = new class126(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2628();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2628();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2485() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class31 var16 = class31.method245(var5);
                        if (var13 != 22 || !client.field471 || var16.field830 != 0 || var16.field814 == 1 || var16.field836) {
                            if (!var16.method641()) {
                                client.field507++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2628();
                if (var9 == 0) {
                    break;
                }
                var4.method2485();
            }
        }
    }

    @ObfuscatedName("al.i(IIIIIILcs;Lfz;B)V")
    public static final void method549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class94 arg6, class162 arg7) {
        if (client.field471 && (field125[0][arg1][arg2] & 0x2) == 0) {
            if ((field125[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2252(arg0, arg1, arg2) != client.field520) {
                return;
            }
        }
        if (arg0 < field119) {
            field119 = arg0;
        }
        class31 var8 = class31.method245(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field813;
            var10 = var8.field812;
        } else {
            var9 = var8.field812;
            var10 = var8.field813;
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
        int[][] var15 = field126[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field830 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field819 == 1) {
            var20 += 256;
        }
        if (var8.method642()) {
            class7.method199(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field471 || var8.field830 != 0 || var8.field814 == 1 || var8.field836) {
                class93 var21;
                if (var8.field820 == -1 && var8.field806 == null) {
                    var21 = var8.method665(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field820, true, (class93) null);
                }
                arg6.method1945(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field814 == 1 && arg7 != null) {
                    arg7.method3262(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class93 var44;
            if (var8.field820 == -1 && var8.field806 == null) {
                var44 = var8.method665(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            if (var44 != null && arg6.method1883(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field828) {
                int var45 = 15;
                if (var44 instanceof class111) {
                    var45 = ((class111) var44).method2269() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field123[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field123[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field814 != 0 && arg7 != null) {
                arg7.method3281(arg1, arg2, var9, var10, var8.field815);
            }
        } else if (arg5 >= 12) {
            class93 var22;
            if (var8.field820 == -1 && var8.field806 == null) {
                var22 = var8.method665(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method1883(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field962[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field814 != 0 && arg7 != null) {
                arg7.method3281(arg1, arg2, var9, var10, var8.field815);
            }
        } else if (arg5 == 0) {
            class93 var23;
            if (var8.field820 == -1 && var8.field806 == null) {
                var23 = var8.method665(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method2055(arg0, arg1, arg2, var16, var23, (class93) null, field129[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field828) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field801) {
                    Statics.field962[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field828) {
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field801) {
                    Statics.field962[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field828) {
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field801) {
                    Statics.field962[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field828) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field801) {
                    Statics.field962[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field814 != 0 && arg7 != null) {
                arg7.method3259(arg1, arg2, arg5, arg4, var8.field815);
            }
            if (var8.field821 != 16) {
                arg6.method2011(arg0, arg1, arg2, var8.field821);
            }
        } else if (arg5 == 1) {
            class93 var24;
            if (var8.field820 == -1 && var8.field806 == null) {
                var24 = var8.method665(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method2055(arg0, arg1, arg2, var16, var24, (class93) null, field118[arg4], 0, var19, var20);
            if (var8.field828) {
                if (arg4 == 0) {
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field814 != 0 && arg7 != null) {
                arg7.method3259(arg1, arg2, arg5, arg4, var8.field815);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class93 var26;
            class93 var27;
            if (var8.field820 == -1 && var8.field806 == null) {
                var26 = var8.method665(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method665(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field820, true, (class93) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method2055(arg0, arg1, arg2, var16, var26, var27, field129[arg4], field129[var25], var19, var20);
            if (var8.field801) {
                if (arg4 == 0) {
                    Statics.field962[arg0][arg1][arg2] |= 0x249;
                    Statics.field962[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field962[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field962[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field962[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field962[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field962[arg0][arg1][arg2] |= 0x492;
                    Statics.field962[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field814 != 0 && arg7 != null) {
                arg7.method3259(arg1, arg2, arg5, arg4, var8.field815);
            }
            if (var8.field821 != 16) {
                arg6.method2011(arg0, arg1, arg2, var8.field821);
            }
        } else if (arg5 == 3) {
            class93 var28;
            if (var8.field820 == -1 && var8.field806 == null) {
                var28 = var8.method665(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method2055(arg0, arg1, arg2, var16, var28, (class93) null, field118[arg4], 0, var19, var20);
            if (var8.field828) {
                if (arg4 == 0) {
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field814 != 0 && arg7 != null) {
                arg7.method3259(arg1, arg2, arg5, arg4, var8.field815);
            }
        } else if (arg5 == 9) {
            class93 var29;
            if (var8.field820 == -1 && var8.field806 == null) {
                var29 = var8.method665(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method1883(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field814 != 0 && arg7 != null) {
                arg7.method3281(arg1, arg2, var9, var10, var8.field815);
            }
            if (var8.field821 != 16) {
                arg6.method2011(arg0, arg1, arg2, var8.field821);
            }
        } else if (arg5 == 4) {
            class93 var30;
            if (var8.field820 == -1 && var8.field806 == null) {
                var30 = var8.method665(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method1954(arg0, arg1, arg2, var16, var30, (class93) null, field129[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1899(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class31.method245(var32 >> 14 & 0x7FFF).field821;
            }
            class93 var33;
            if (var8.field820 == -1 && var8.field806 == null) {
                var33 = var8.method665(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method1954(arg0, arg1, arg2, var16, var33, (class93) null, field129[arg4], 0, field131[arg4] * var31, field132[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1899(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class31.method245(var35 >> 14 & 0x7FFF).field821 / 2;
            }
            class93 var36;
            if (var8.field820 == -1 && var8.field806 == null) {
                var36 = var8.method665(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method1954(arg0, arg1, arg2, var16, var36, (class93) null, 256, arg4, field133[arg4] * var34, field134[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class93 var38;
            if (var8.field820 == -1 && var8.field806 == null) {
                var38 = var8.method665(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method1954(arg0, arg1, arg2, var16, var38, (class93) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1899(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class31.method245(var40 >> 14 & 0x7FFF).field821 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class93 var42;
            class93 var43;
            if (var8.field820 == -1 && var8.field806 == null) {
                var42 = var8.method665(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method665(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field820, true, (class93) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field820, true, (class93) null);
            }
            arg6.method1954(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field133[arg4] * var39, field134[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("dh.o(IIIB)I")
    public static int method2252(int arg0, int arg1, int arg2) {
        if ((field125[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field125[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("n.l(IIII)I")
    public static final int method24(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method746(var3, var5);
        int var8 = method746(var3 + 1, var5);
        int var9 = method746(var3, var5 + 1);
        int var10 = method746(var3 + 1, var5 + 1);
        int var11 = 65536 - class103.field1757[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class103.field1757[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class103.field1757[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ao.p(III)I")
    public static final int method746(int arg0, int arg1) {
        int var2 = method116(arg0 - 1, arg1 - 1) + method116(arg0 + 1, arg1 - 1) + method116(arg0 - 1, arg1 + 1) + method116(arg0 + 1, arg1 + 1);
        int var3 = method116(arg0 - 1, arg1) + method116(arg0 + 1, arg1) + method116(arg0, arg1 - 1) + method116(arg0, arg1 + 1);
        int var4 = method116(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("z.t(IIB)I")
    public static final int method116(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("o.w(III)I")
    public static final int method40(int arg0, int arg1) {
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

    @ObfuscatedName("ag.r(III)I")
    public static final int method835(int arg0, int arg1) {
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

    @ObfuscatedName("bv.a(IIIB)I")
    public static final int method1341(int arg0, int arg1, int arg2) {
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
