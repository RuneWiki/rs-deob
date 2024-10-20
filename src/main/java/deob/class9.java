package deob;

@ObfuscatedName("y")
public final class class9 {

    @ObfuscatedName("y.p")
    public static int[][][] field126 = new int[4][105][105];

    @ObfuscatedName("y.l")
    public static byte[][][] field119 = new byte[4][104][104];

    @ObfuscatedName("y.d")
    public static int field123 = 99;

    @ObfuscatedName("y.b")
    public static final int[] field118 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("y.k")
    public static final int[] field124 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("y.t")
    public static final int[] field128 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("y.f")
    public static final int[] field129 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("y.h")
    public static final int[] field130 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("y.j")
    public static final int[] field136 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("y.q")
    public static int field132 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("y.z")
    public static int field133 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ci.p(I)V")
    public static void method2172() {
        field123 = 99;
        Statics.field131 = new byte[4][104][104];
        Statics.field736 = new byte[4][104][104];
        Statics.field122 = new byte[4][104][104];
        Statics.field2023 = new byte[4][104][104];
        Statics.field1295 = new int[4][105][105];
        Statics.field2834 = new byte[4][105][105];
        Statics.field121 = new int[105][105];
        Statics.field2736 = new int[104];
        Statics.field120 = new int[104];
        Statics.field113 = new int[104];
        Statics.field964 = new int[104];
        Statics.field1017 = new int[104];
    }

    @ObfuscatedName("dr.l(IIIIB)V")
    public static final void method2380(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2834[0][var5][var4] = 127;
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

    @ObfuscatedName("ah.d([BIIII[Ldc;I)V")
    public static final void method571(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class130[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2037[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class127 var9 = new class127(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2926(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("em.x(Lds;IIIIIII)V")
    public static final void method2926(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2498();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2498();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2498();
                }
            }
            return;
        }
        field119[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2498();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field126[0][arg2][arg3] = -method703(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field126[arg1][arg2][arg3] = field126[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2498();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field126[0][arg2][arg3] = -var8 * 8;
                } else {
                    field126[arg1][arg2][arg3] = field126[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field736[arg1][arg2][arg3] = arg0.method2499();
                Statics.field122[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2023[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field119[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field131[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ae.o([BIILcr;[Ldc;I)V")
    public static final void method669(byte[] arg0, int arg1, int arg2, class95 arg3, class130[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2511();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2511();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2498();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field119[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class130 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1285(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bg.a(IIIIIILcr;Ldc;S)V")
    public static final void method1285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field623 && (field119[0][arg1][arg2] & 0x2) == 0) {
            if ((field119[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field119[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field119[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field631 != var8) {
                return;
            }
        }
        if (arg0 < field123) {
            field123 = arg0;
        }
        class32 var9 = class32.method1332(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field837;
            var11 = var9.field810;
        } else {
            var10 = var9.field810;
            var11 = var9.field837;
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
        int[][] var16 = field126[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field841 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field818 == 1) {
            var21 += 256;
        }
        if (var9.method653()) {
            class7 var22 = new class7();
            var22.field85 = arg0;
            var22.field86 = arg1 * 128;
            var22.field84 = arg2 * 128;
            int var23 = var9.field810;
            int var24 = var9.field837;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field837;
                var24 = var9.field810;
            }
            var22.field105 = (arg1 + var23) * 128;
            var22.field100 = (arg2 + var24) * 128;
            var22.field91 = var9.field833;
            var22.field95 = var9.field840 * 128;
            var22.field93 = var9.field813;
            var22.field94 = var9.field839;
            var22.field88 = var9.field843;
            if (var9.field836 != null) {
                var22.field98 = var9;
                var22.method40();
            }
            class7.field107.method3422(var22);
            if (var22.field88 != null) {
                var22.field87 = var22.field93 + (int) (Math.random() * (double) (var22.field94 - var22.field93));
            }
        }
        if (arg5 == 22) {
            if (!client.field623 || var9.field841 != 0 || var9.field812 == 1 || var9.field797) {
                class94 var25;
                if (var9.field799 == -1 && var9.field836 == null) {
                    var25 = var9.method655(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field799, true, (class94) null);
                }
                arg6.method1909(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field812 == 1 && arg7 != null) {
                    arg7.method2729(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var48;
            if (var9.field799 == -1 && var9.field836 == null) {
                var48 = var9.method655(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            if (var48 != null && arg6.method1935(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field826) {
                int var49 = 15;
                if (var48 instanceof class112) {
                    var49 = ((class112) var48).method2309() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field2834[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field2834[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field812 != 0 && arg7 != null) {
                arg7.method2727(arg1, arg2, var10, var11, var9.field811);
            }
        } else if (arg5 >= 12) {
            class94 var26;
            if (var9.field799 == -1 && var9.field836 == null) {
                var26 = var9.method655(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1935(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1295[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field812 != 0 && arg7 != null) {
                arg7.method2727(arg1, arg2, var10, var11, var9.field811);
            }
        } else if (arg5 == 0) {
            class94 var27;
            if (var9.field799 == -1 && var9.field836 == null) {
                var27 = var9.method655(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1927(arg0, arg1, arg2, var17, var27, (class94) null, field118[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field826) {
                    Statics.field2834[arg0][arg1][arg2] = 50;
                    Statics.field2834[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field817) {
                    Statics.field1295[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field826) {
                    Statics.field2834[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2834[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field817) {
                    Statics.field1295[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field826) {
                    Statics.field2834[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2834[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field817) {
                    Statics.field1295[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field826) {
                    Statics.field2834[arg0][arg1][arg2] = 50;
                    Statics.field2834[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field817) {
                    Statics.field1295[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field812 != 0 && arg7 != null) {
                arg7.method2740(arg1, arg2, arg5, arg4, var9.field811);
            }
            if (var9.field829 != 16) {
                arg6.method1954(arg0, arg1, arg2, var9.field829);
            }
        } else if (arg5 == 1) {
            class94 var28;
            if (var9.field799 == -1 && var9.field836 == null) {
                var28 = var9.method655(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1927(arg0, arg1, arg2, var17, var28, (class94) null, field124[arg4], 0, var20, var21);
            if (var9.field826) {
                if (arg4 == 0) {
                    Statics.field2834[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2834[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2834[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2834[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field812 != 0 && arg7 != null) {
                arg7.method2740(arg1, arg2, arg5, arg4, var9.field811);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class94 var30;
            class94 var31;
            if (var9.field799 == -1 && var9.field836 == null) {
                var30 = var9.method655(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method655(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field799, true, (class94) null);
                var31 = new class14(arg3, 2, var29, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1927(arg0, arg1, arg2, var17, var30, var31, field118[arg4], field118[var29], var20, var21);
            if (var9.field817) {
                if (arg4 == 0) {
                    Statics.field1295[arg0][arg1][arg2] |= 0x249;
                    Statics.field1295[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1295[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1295[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1295[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1295[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1295[arg0][arg1][arg2] |= 0x492;
                    Statics.field1295[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field812 != 0 && arg7 != null) {
                arg7.method2740(arg1, arg2, arg5, arg4, var9.field811);
            }
            if (var9.field829 != 16) {
                arg6.method1954(arg0, arg1, arg2, var9.field829);
            }
        } else if (arg5 == 3) {
            class94 var32;
            if (var9.field799 == -1 && var9.field836 == null) {
                var32 = var9.method655(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1927(arg0, arg1, arg2, var17, var32, (class94) null, field124[arg4], 0, var20, var21);
            if (var9.field826) {
                if (arg4 == 0) {
                    Statics.field2834[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2834[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2834[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2834[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field812 != 0 && arg7 != null) {
                arg7.method2740(arg1, arg2, arg5, arg4, var9.field811);
            }
        } else if (arg5 == 9) {
            class94 var33;
            if (var9.field799 == -1 && var9.field836 == null) {
                var33 = var9.method655(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1935(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field812 != 0 && arg7 != null) {
                arg7.method2727(arg1, arg2, var10, var11, var9.field811);
            }
            if (var9.field829 != 16) {
                arg6.method1954(arg0, arg1, arg2, var9.field829);
            }
        } else if (arg5 == 4) {
            class94 var34;
            if (var9.field799 == -1 && var9.field836 == null) {
                var34 = var9.method655(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1912(arg0, arg1, arg2, var17, var34, (class94) null, field118[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1929(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method1332(var36 >> 14 & 0x7FFF).field829;
            }
            class94 var37;
            if (var9.field799 == -1 && var9.field836 == null) {
                var37 = var9.method655(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1912(arg0, arg1, arg2, var17, var37, (class94) null, field118[arg4], 0, field128[arg4] * var35, field129[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1929(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class32.method1332(var39 >> 14 & 0x7FFF).field829 / 2;
            }
            class94 var40;
            if (var9.field799 == -1 && var9.field836 == null) {
                var40 = var9.method655(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1912(arg0, arg1, arg2, var17, var40, (class94) null, 256, arg4, field130[arg4] * var38, field136[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            if (var9.field799 == -1 && var9.field836 == null) {
                var42 = var9.method655(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1912(arg0, arg1, arg2, var17, var42, (class94) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1929(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class32.method1332(var44 >> 14 & 0x7FFF).field829 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class94 var46;
            class94 var47;
            if (var9.field799 == -1 && var9.field836 == null) {
                var46 = var9.method655(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method655(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field799, true, (class94) null);
                var47 = new class14(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field799, true, (class94) null);
            }
            arg6.method1912(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field130[arg4] * var43, field136[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("ay.w(Lcr;[Ldc;B)V")
    public static final void method809(class95 arg0, class130[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field119[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field119[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2728(var3, var4);
                        }
                    }
                }
            }
        }
        field132 += (int) (Math.random() * 5.0D) - 2;
        if (field132 < -8) {
            field132 = -8;
        }
        if (field132 > 8) {
            field132 = 8;
        }
        field133 += (int) (Math.random() * 5.0D) - 2;
        if (field133 < -16) {
            field133 = -16;
        }
        if (field133 > 16) {
            field133 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2834[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field126[var6][var11 + 1][var10] - field126[var6][var11 - 1][var10];
                    int var13 = field126[var6][var11][var10 + 1] - field126[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field121[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field2736[var20] = 0;
                Statics.field120[var20] = 0;
                Statics.field113[var20] = 0;
                Statics.field964[var20] = 0;
                Statics.field1017[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field131[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class33 var25 = class33.method38(var24 - 1);
                            Statics.field2736[var22] += var25.field863;
                            Statics.field120[var22] += var25.field851;
                            Statics.field113[var22] += var25.field852;
                            Statics.field964[var22] += var25.field853;
                            var10002 = Statics.field1017[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field131[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class33 var28 = class33.method38(var27 - 1);
                            Statics.field2736[var22] -= var28.field863;
                            Statics.field120[var22] -= var28.field851;
                            Statics.field113[var22] -= var28.field852;
                            Statics.field964[var22] -= var28.field853;
                            var10002 = Statics.field1017[var22]--;
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
                            var29 += Statics.field2736[var35];
                            var30 += Statics.field120[var35];
                            var31 += Statics.field113[var35];
                            var32 += Statics.field964[var35];
                            var33 += Statics.field1017[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field2736[var36];
                            var30 -= Statics.field120[var36];
                            var31 -= Statics.field113[var36];
                            var32 -= Statics.field964[var36];
                            var33 -= Statics.field1017[var36];
                        }
                        if (var34 >= 1 && var34 < 103) {
                            if (client.field623 && (field119[0][var21][var34] & 0x2) == 0) {
                                if ((field119[var6][var21][var34] & 0x10) != 0) {
                                    continue;
                                }
                                int var37;
                                if ((field119[var6][var21][var34] & 0x8) != 0) {
                                    var37 = 0;
                                } else if (var6 <= 0 || (field119[1][var21][var34] & 0x2) == 0) {
                                    var37 = var6;
                                } else {
                                    var37 = var6 - 1;
                                }
                                if (client.field631 != var37) {
                                    continue;
                                }
                            }
                            if (var6 < field123) {
                                field123 = var6;
                            }
                            int var38 = Statics.field131[var6][var21][var34] & 0xFF;
                            int var39 = Statics.field736[var6][var21][var34] & 0xFF;
                            if (var38 > 0 || var39 > 0) {
                                int var40 = field126[var6][var21][var34];
                                int var41 = field126[var6][var21 + 1][var34];
                                int var42 = field126[var6][var21 + 1][var34 + 1];
                                int var43 = field126[var6][var21][var34 + 1];
                                int var44 = Statics.field121[var21][var34];
                                int var45 = Statics.field121[var21 + 1][var34];
                                int var46 = Statics.field121[var21 + 1][var34 + 1];
                                int var47 = Statics.field121[var21][var34 + 1];
                                int var48 = -1;
                                int var49 = -1;
                                if (var38 > 0) {
                                    int var50 = var29 * 256 / var32;
                                    int var51 = var30 / var33;
                                    int var52 = var31 / var33;
                                    var48 = method135(var50, var51, var52);
                                    int var53 = field132 + var50 & 0xFF;
                                    int var54 = field133 + var52;
                                    if (var54 < 0) {
                                        var54 = 0;
                                    } else if (var54 > 255) {
                                        var54 = 255;
                                    }
                                    var49 = method135(var53, var51, var54);
                                }
                                if (var6 > 0) {
                                    boolean var55 = true;
                                    if (var38 == 0 && Statics.field122[var6][var21][var34] != 0) {
                                        var55 = false;
                                    }
                                    if (var39 > 0) {
                                        int var56 = var39 - 1;
                                        class37 var57 = (class37) class37.field939.method3357((long) var56);
                                        class37 var58;
                                        if (var57 == null) {
                                            byte[] var59 = Statics.field930.method3078(4, var56);
                                            class37 var60 = new class37();
                                            if (var59 != null) {
                                                var60.method795(new class127(var59), var56);
                                            }
                                            var60.method793();
                                            class37.field939.method3364(var60, (long) var56);
                                            var58 = var60;
                                        } else {
                                            var58 = var57;
                                        }
                                        if (!var58.field934) {
                                            var55 = false;
                                        }
                                    }
                                    if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
                                        Statics.field1295[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var61 = 0;
                                if (var49 != -1) {
                                    var61 = class104.field1775[method2759(var49, 96)];
                                }
                                if (var39 == 0) {
                                    arg0.method1908(var6, var21, var34, 0, 0, -1, var40, var41, var42, var43, method2759(var48, var44), method2759(var48, var45), method2759(var48, var46), method2759(var48, var47), 0, 0, 0, 0, var61, 0);
                                } else {
                                    int var62 = Statics.field122[var6][var21][var34] + 1;
                                    byte var63 = Statics.field2023[var6][var21][var34];
                                    int var64 = var39 - 1;
                                    class37 var65 = (class37) class37.field939.method3357((long) var64);
                                    class37 var66;
                                    if (var65 == null) {
                                        byte[] var67 = Statics.field930.method3078(4, var64);
                                        class37 var68 = new class37();
                                        if (var67 != null) {
                                            var68.method795(new class127(var67), var64);
                                        }
                                        var68.method793();
                                        class37.field939.method3364(var68, (long) var64);
                                        var66 = var68;
                                    } else {
                                        var66 = var65;
                                    }
                                    int var70 = var66.field929;
                                    int var71;
                                    int var72;
                                    if (var70 >= 0) {
                                        var71 = Statics.field1776.method2233(var70);
                                        var72 = -1;
                                    } else if (var66.field927 == 16711935) {
                                        var72 = -2;
                                        var70 = -1;
                                        var71 = -2;
                                    } else {
                                        var72 = method135(var66.field932, var66.field933, var66.field928);
                                        int var73 = field132 + var66.field932 & 0xFF;
                                        int var74 = field133 + var66.field928;
                                        if (var74 < 0) {
                                            var74 = 0;
                                        } else if (var74 > 255) {
                                            var74 = 255;
                                        }
                                        var71 = method135(var73, var66.field933, var74);
                                    }
                                    int var75 = 0;
                                    if (var71 != -2) {
                                        var75 = class104.field1775[method1405(var71, 96)];
                                    }
                                    if (var66.field931 != -1) {
                                        int var76 = field132 + var66.field935 & 0xFF;
                                        int var77 = field133 + var66.field937;
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = method135(var76, var66.field936, var77);
                                        var75 = class104.field1775[method1405(var78, 96)];
                                    }
                                    arg0.method1908(var6, var21, var34, var62, var63, var70, var40, var41, var42, var43, method2759(var48, var44), method2759(var48, var45), method2759(var48, var46), method2759(var48, var47), method1405(var72, var44), method1405(var72, var45), method1405(var72, var46), method1405(var72, var47), var61, var75);
                                }
                            }
                        }
                    }
                }
            }
            for (int var79 = 1; var79 < 103; var79++) {
                for (int var80 = 1; var80 < 103; var80++) {
                    int var85;
                    if ((field119[var6][var80][var79] & 0x8) != 0) {
                        var85 = 0;
                    } else if (var6 <= 0 || (field119[1][var80][var79] & 0x2) == 0) {
                        var85 = var6;
                    } else {
                        var85 = var6 - 1;
                    }
                    arg0.method2046(var6, var80, var79, var85);
                }
            }
            Statics.field131[var6] = (byte[][]) null;
            Statics.field736[var6] = (byte[][]) null;
            Statics.field122[var6] = (byte[][]) null;
            Statics.field2023[var6] = (byte[][]) null;
            Statics.field2834[var6] = (byte[][]) null;
        }
        arg0.method1934(-50, -10, -50);
        for (int var86 = 0; var86 < 104; var86++) {
            for (int var87 = 0; var87 < 104; var87++) {
                if ((field119[1][var86][var87] & 0x2) == 2) {
                    arg0.method1905(var86, var87);
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
                        if ((Statics.field1295[var92][var94][var93] & var88) != 0) {
                            int var95 = var93;
                            int var96 = var93;
                            int var97 = var92;
                            int var98 = var92;
                            while (var95 > 0 && (Statics.field1295[var92][var94][var95 - 1] & var88) != 0) {
                                var95--;
                            }
                            while (var96 < 104 && (Statics.field1295[var92][var94][var96 + 1] & var88) != 0) {
                                var96++;
                            }
                            label369: while (var97 > 0) {
                                for (int var99 = var95; var99 <= var96; var99++) {
                                    if ((Statics.field1295[var97 - 1][var94][var99] & var88) == 0) {
                                        break label369;
                                    }
                                }
                                var97--;
                            }
                            label358: while (var98 < var91) {
                                for (int var100 = var95; var100 <= var96; var100++) {
                                    if ((Statics.field1295[var98 + 1][var94][var100] & var88) == 0) {
                                        break label358;
                                    }
                                }
                                var98++;
                            }
                            int var101 = (var98 + 1 - var97) * (var96 - var95 + 1);
                            if (var101 >= 8) {
                                short var102 = 240;
                                int var103 = field126[var98][var94][var95] - var102;
                                int var104 = field126[var97][var94][var95];
                                class95.method1961(var91, 1, var94 * 128, var94 * 128, var95 * 128, var96 * 128 + 128, var103, var104);
                                for (int var105 = var97; var105 <= var98; var105++) {
                                    for (int var106 = var95; var106 <= var96; var106++) {
                                        Statics.field1295[var105][var94][var106] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1295[var92][var94][var93] & var89) != 0) {
                            int var107 = var94;
                            int var108 = var94;
                            int var109 = var92;
                            int var110 = var92;
                            while (var107 > 0 && (Statics.field1295[var92][var107 - 1][var93] & var89) != 0) {
                                var107--;
                            }
                            while (var108 < 104 && (Statics.field1295[var92][var108 + 1][var93] & var89) != 0) {
                                var108++;
                            }
                            label422: while (var109 > 0) {
                                for (int var111 = var107; var111 <= var108; var111++) {
                                    if ((Statics.field1295[var109 - 1][var111][var93] & var89) == 0) {
                                        break label422;
                                    }
                                }
                                var109--;
                            }
                            label411: while (var110 < var91) {
                                for (int var112 = var107; var112 <= var108; var112++) {
                                    if ((Statics.field1295[var110 + 1][var112][var93] & var89) == 0) {
                                        break label411;
                                    }
                                }
                                var110++;
                            }
                            int var113 = (var110 + 1 - var109) * (var108 - var107 + 1);
                            if (var113 >= 8) {
                                short var114 = 240;
                                int var115 = field126[var110][var107][var93] - var114;
                                int var116 = field126[var109][var107][var93];
                                class95.method1961(var91, 2, var107 * 128, var108 * 128 + 128, var93 * 128, var93 * 128, var115, var116);
                                for (int var117 = var109; var117 <= var110; var117++) {
                                    for (int var118 = var107; var118 <= var108; var118++) {
                                        Statics.field1295[var117][var118][var93] &= ~var89;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1295[var92][var94][var93] & var90) != 0) {
                            int var119 = var94;
                            int var120 = var94;
                            int var121 = var93;
                            int var122 = var93;
                            while (var121 > 0 && (Statics.field1295[var92][var94][var121 - 1] & var90) != 0) {
                                var121--;
                            }
                            while (var122 < 104 && (Statics.field1295[var92][var94][var122 + 1] & var90) != 0) {
                                var122++;
                            }
                            label475: while (var119 > 0) {
                                for (int var123 = var121; var123 <= var122; var123++) {
                                    if ((Statics.field1295[var92][var119 - 1][var123] & var90) == 0) {
                                        break label475;
                                    }
                                }
                                var119--;
                            }
                            label464: while (var120 < 104) {
                                for (int var124 = var121; var124 <= var122; var124++) {
                                    if ((Statics.field1295[var92][var120 + 1][var124] & var90) == 0) {
                                        break label464;
                                    }
                                }
                                var120++;
                            }
                            if ((var120 - var119 + 1) * (var122 - var121 + 1) >= 4) {
                                int var125 = field126[var92][var119][var121];
                                class95.method1961(var91, 4, var119 * 128, var120 * 128 + 128, var121 * 128, var122 * 128 + 128, var125, var125);
                                for (int var126 = var119; var126 <= var120; var126++) {
                                    for (int var127 = var121; var127 <= var122; var127++) {
                                        Statics.field1295[var92][var126][var127] &= ~var90;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.i(IIB)I")
    public static final int method703(int arg0, int arg1) {
        int var2 = method16(arg0 + 45365, arg1 + 91923, 4) - 128 + (method16(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method16(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("d.y(IIIB)I")
    public static final int method16(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method143(var3, var5);
        int var8 = method143(var3 + 1, var5);
        int var9 = method143(var3, var5 + 1);
        int var10 = method143(var3 + 1, var5 + 1);
        int var11 = 65536 - class104.field1780[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = method2998(var9, var10, var4, arg2);
        int var15 = 65536 - class104.field1780[var6 * 1024 / arg2] >> 1;
        return ((65536 - var15) * var12 >> 16) + (var14 * var15 >> 16);
    }

    @ObfuscatedName("ec.m(IIIIB)I")
    public static final int method2998(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1780[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("g.u(IIB)I")
    public static final int method143(int arg0, int arg1) {
        int var2 = Statics.method2771(arg0 - 1, arg1 - 1) + Statics.method2771(arg0 + 1, arg1 - 1) + Statics.method2771(arg0 - 1, arg1 + 1) + Statics.method2771(arg0 + 1, arg1 + 1);
        int var3 = Statics.method2771(arg0 - 1, arg1) + Statics.method2771(arg0 + 1, arg1) + Statics.method2771(arg0, arg1 - 1) + Statics.method2771(arg0, arg1 + 1);
        int var4 = Statics.method2771(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ef.e(III)I")
    public static final int method2759(int arg0, int arg1) {
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

    @ObfuscatedName("by.r(III)I")
    public static final int method1405(int arg0, int arg1) {
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

    @ObfuscatedName("n.n(IIII)I")
    public static final int method135(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bw.g(IIIIIIILcr;Ldc;B)V")
    public static final void method1367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class130 arg8) {
        class32 var9 = class32.method1332(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field837;
            var11 = var9.field810;
        } else {
            var10 = var9.field810;
            var11 = var9.field837;
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
        int[][] var16 = field126[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field841 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field818 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field799 == -1 && var9.field836 == null) {
                var22 = var9.method649(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1909(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field812 == 1) {
                arg8.method2729(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field799 == -1 && var9.field836 == null) {
                var45 = var9.method649(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1935(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field812 != 0) {
                arg8.method2727(arg2, arg3, var10, var11, var9.field811);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field799 == -1 && var9.field836 == null) {
                var23 = var9.method649(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1935(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field812 != 0) {
                arg8.method2727(arg2, arg3, var10, var11, var9.field811);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field799 == -1 && var9.field836 == null) {
                var24 = var9.method649(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1927(arg0, arg2, arg3, var17, var24, (class94) null, field118[arg5], 0, var20, var21);
            if (var9.field812 != 0) {
                arg8.method2740(arg2, arg3, arg6, arg5, var9.field811);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field799 == -1 && var9.field836 == null) {
                var25 = var9.method649(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1927(arg0, arg2, arg3, var17, var25, (class94) null, field124[arg5], 0, var20, var21);
            if (var9.field812 != 0) {
                arg8.method2740(arg2, arg3, arg6, arg5, var9.field811);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field799 == -1 && var9.field836 == null) {
                var27 = var9.method649(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method649(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field799, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1927(arg0, arg2, arg3, var17, var27, var28, field118[arg5], field118[var26], var20, var21);
            if (var9.field812 != 0) {
                arg8.method2740(arg2, arg3, arg6, arg5, var9.field811);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field799 == -1 && var9.field836 == null) {
                var29 = var9.method649(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1927(arg0, arg2, arg3, var17, var29, (class94) null, field124[arg5], 0, var20, var21);
            if (var9.field812 != 0) {
                arg8.method2740(arg2, arg3, arg6, arg5, var9.field811);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field799 == -1 && var9.field836 == null) {
                var30 = var9.method649(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1935(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field812 != 0) {
                arg8.method2727(arg2, arg3, var10, var11, var9.field811);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field799 == -1 && var9.field836 == null) {
                var31 = var9.method649(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1912(arg0, arg2, arg3, var17, var31, (class94) null, field118[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1929(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method1332(var33 >> 14 & 0x7FFF).field829;
            }
            class94 var34;
            if (var9.field799 == -1 && var9.field836 == null) {
                var34 = var9.method649(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1912(arg0, arg2, arg3, var17, var34, (class94) null, field118[arg5], 0, field128[arg5] * var32, field129[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1929(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method1332(var36 >> 14 & 0x7FFF).field829 / 2;
            }
            class94 var37;
            if (var9.field799 == -1 && var9.field836 == null) {
                var37 = var9.method649(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1912(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field130[arg5] * var35, field136[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field799 == -1 && var9.field836 == null) {
                var39 = var9.method649(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1912(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1929(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method1332(var41 >> 14 & 0x7FFF).field829 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field799 == -1 && var9.field836 == null) {
                var43 = var9.method649(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method649(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field799, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field799, true, (class94) null);
            }
            arg7.method1912(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field130[arg5] * var40, field136[arg5] * var40, var20, var21);
        }
    }
}
