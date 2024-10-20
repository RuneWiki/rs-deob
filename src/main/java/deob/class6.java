package deob;

@ObfuscatedName("c")
public final class class6 {

    @ObfuscatedName("c.g")
    public static int[][][] field76 = new int[4][105][105];

    @ObfuscatedName("c.j")
    public static byte[][][] field83 = new byte[4][104][104];

    @ObfuscatedName("c.z")
    public static int field75 = 99;

    @ObfuscatedName("c.r")
    public static final int[] field65 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("c.q")
    public static final int[] field74 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("c.x")
    public static final int[] field64 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("c.t")
    public static final int[] field79 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("c.e")
    public static final int[] field77 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("c.m")
    public static final int[] field78 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("c.o")
    public static int field67 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("c.a")
    public static int field80 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gd.j(IIIIB)V")
    public static final void method3268(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2979[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field76[0][var5][var4] = field76[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field76[0][var5][var4] = field76[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field76[0][var5][var4] = field76[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field76[0][var5][var4] = field76[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.z([BIIII[Lhq;I)V")
    public static final void method602(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class209[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3002[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class108 var9 = new class108(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method855(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ab.b(Ldf;IIIIIII)V")
    public static final void method855(class108 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2083();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2083();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2083();
                }
            }
            return;
        }
        field83[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2083();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field76[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2632(var10 + 45365, var11 + 91923, 4) - 128 + (method2632(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2632(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field76[arg1][arg2][arg3] = field76[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2083();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field76[0][arg2][arg3] = -var15 * 8;
                } else {
                    field76[arg1][arg2][arg3] = field76[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field68[arg1][arg2][arg3] = arg0.method2173();
                Statics.field1517[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field69[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field83[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field66[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ah.k([BIILcc;[Lhq;I)V")
    public static final void method703(byte[] arg0, int arg1, int arg2, class80 arg3, class209[] arg4) {
        class108 var5 = new class108(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2215();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2215();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2083();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field83[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class209 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method575(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("aj.c(IIIIIILcc;Lhq;B)V")
    public static final void method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class80 arg6, class209 arg7) {
        if (client.field247 && (field83[0][arg1][arg2] & 0x2) == 0) {
            if ((field83[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method24(arg0, arg1, arg2) != client.field447) {
                return;
            }
        }
        if (arg0 < field75) {
            field75 = arg0;
        }
        class37 var8 = class37.method3266(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field866;
            var10 = var8.field865;
        } else {
            var9 = var8.field865;
            var10 = var8.field866;
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
        int[][] var15 = field76[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field869 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field890 == 1) {
            var20 += 256;
        }
        if (var8.method615()) {
            class21 var21 = new class21();
            var21.field543 = arg0;
            var21.field544 = arg1 * 128;
            var21.field545 = arg2 * 128;
            int var22 = var8.field865;
            int var23 = var8.field866;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field866;
                var23 = var8.field865;
            }
            var21.field551 = (arg1 + var22) * 128;
            var21.field547 = (arg2 + var23) * 128;
            var21.field548 = var8.field894;
            var21.field542 = var8.field895 * 128;
            var21.field549 = var8.field896;
            var21.field552 = var8.field870;
            var21.field559 = var8.field898;
            if (var8.field891 != null) {
                var21.field556 = var8;
                var21.method472();
            }
            class21.field553.method3169(var21);
            if (var21.field559 != null) {
                var21.field554 = var21.field549 + (int) (Math.random() * (double) (var21.field552 - var21.field549));
            }
        }
        if (arg5 == 22) {
            if (!client.field247 || var8.field869 != 0 || var8.field879 == 1 || var8.field888) {
                class79 var24;
                if (var8.field873 == -1 && var8.field891 == null) {
                    var24 = var8.method648(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field873, true, (class79) null);
                }
                arg6.method1566(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field879 == 1 && arg7 != null) {
                    arg7.method3487(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class79 var47;
            if (var8.field873 == -1 && var8.field891 == null) {
                var47 = var8.method648(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            if (var47 != null && arg6.method1569(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field881) {
                int var48 = 15;
                if (var47 instanceof class99) {
                    var48 = ((class99) var47).method1999() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2979[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2979[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field879 != 0 && arg7 != null) {
                arg7.method3511(arg1, arg2, var9, var10, var8.field868);
            }
        } else if (arg5 >= 12) {
            class79 var25;
            if (var8.field873 == -1 && var8.field891 == null) {
                var25 = var8.method648(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1569(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2683[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field879 != 0 && arg7 != null) {
                arg7.method3511(arg1, arg2, var9, var10, var8.field868);
            }
        } else if (arg5 == 0) {
            class79 var26;
            if (var8.field873 == -1 && var8.field891 == null) {
                var26 = var8.method648(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1568(arg0, arg1, arg2, var16, var26, (class79) null, field65[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field881) {
                    Statics.field2979[arg0][arg1][arg2] = 50;
                    Statics.field2979[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field882) {
                    Statics.field2683[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field881) {
                    Statics.field2979[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2979[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field882) {
                    Statics.field2683[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field881) {
                    Statics.field2979[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2979[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field882) {
                    Statics.field2683[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field881) {
                    Statics.field2979[arg0][arg1][arg2] = 50;
                    Statics.field2979[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field882) {
                    Statics.field2683[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field879 != 0 && arg7 != null) {
                arg7.method3484(arg1, arg2, arg5, arg4, var8.field868);
            }
            if (var8.field854 != 16) {
                arg6.method1576(arg0, arg1, arg2, var8.field854);
            }
        } else if (arg5 == 1) {
            class79 var27;
            if (var8.field873 == -1 && var8.field891 == null) {
                var27 = var8.method648(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1568(arg0, arg1, arg2, var16, var27, (class79) null, field74[arg4], 0, var19, var20);
            if (var8.field881) {
                if (arg4 == 0) {
                    Statics.field2979[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2979[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2979[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2979[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field879 != 0 && arg7 != null) {
                arg7.method3484(arg1, arg2, arg5, arg4, var8.field868);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class79 var29;
            class79 var30;
            if (var8.field873 == -1 && var8.field891 == null) {
                var29 = var8.method648(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method648(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field873, true, (class79) null);
                var30 = new class11(arg3, 2, var28, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1568(arg0, arg1, arg2, var16, var29, var30, field65[arg4], field65[var28], var19, var20);
            if (var8.field882) {
                if (arg4 == 0) {
                    Statics.field2683[arg0][arg1][arg2] |= 0x249;
                    Statics.field2683[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2683[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2683[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2683[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2683[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2683[arg0][arg1][arg2] |= 0x492;
                    Statics.field2683[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field879 != 0 && arg7 != null) {
                arg7.method3484(arg1, arg2, arg5, arg4, var8.field868);
            }
            if (var8.field854 != 16) {
                arg6.method1576(arg0, arg1, arg2, var8.field854);
            }
        } else if (arg5 == 3) {
            class79 var31;
            if (var8.field873 == -1 && var8.field891 == null) {
                var31 = var8.method648(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1568(arg0, arg1, arg2, var16, var31, (class79) null, field74[arg4], 0, var19, var20);
            if (var8.field881) {
                if (arg4 == 0) {
                    Statics.field2979[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2979[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2979[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2979[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field879 != 0 && arg7 != null) {
                arg7.method3484(arg1, arg2, arg5, arg4, var8.field868);
            }
        } else if (arg5 == 9) {
            class79 var32;
            if (var8.field873 == -1 && var8.field891 == null) {
                var32 = var8.method648(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1569(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field879 != 0 && arg7 != null) {
                arg7.method3511(arg1, arg2, var9, var10, var8.field868);
            }
            if (var8.field854 != 16) {
                arg6.method1576(arg0, arg1, arg2, var8.field854);
            }
        } else if (arg5 == 4) {
            class79 var33;
            if (var8.field873 == -1 && var8.field891 == null) {
                var33 = var8.method648(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1668(arg0, arg1, arg2, var16, var33, (class79) null, field65[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1586(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class37.method3266(var35 >> 14 & 0x7FFF).field854;
            }
            class79 var36;
            if (var8.field873 == -1 && var8.field891 == null) {
                var36 = var8.method648(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1668(arg0, arg1, arg2, var16, var36, (class79) null, field65[arg4], 0, field64[arg4] * var34, field79[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1586(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class37.method3266(var38 >> 14 & 0x7FFF).field854 / 2;
            }
            class79 var39;
            if (var8.field873 == -1 && var8.field891 == null) {
                var39 = var8.method648(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1668(arg0, arg1, arg2, var16, var39, (class79) null, 256, arg4, field77[arg4] * var37, field78[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class79 var41;
            if (var8.field873 == -1 && var8.field891 == null) {
                var41 = var8.method648(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class11(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1668(arg0, arg1, arg2, var16, var41, (class79) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1586(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class37.method3266(var43 >> 14 & 0x7FFF).field854 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class79 var45;
            class79 var46;
            if (var8.field873 == -1 && var8.field891 == null) {
                var45 = var8.method648(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method648(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field873, true, (class79) null);
                var46 = new class11(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field873, true, (class79) null);
            }
            arg6.method1668(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field77[arg4] * var42, field78[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("g.w(Lcc;[Lhq;I)V")
    public static final void method1(class80 arg0, class209[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field83[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field83[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3486(var3, var4);
                        }
                    }
                }
            }
        }
        field67 += (int) (Math.random() * 5.0D) - 2;
        if (field67 < -8) {
            field67 = -8;
        }
        if (field67 > 8) {
            field67 = 8;
        }
        field80 += (int) (Math.random() * 5.0D) - 2;
        if (field80 < -16) {
            field80 = -16;
        }
        if (field80 > 16) {
            field80 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2979[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field76[var6][var11 + 1][var10] - field76[var6][var11 - 1][var10];
                    int var13 = field76[var6][var11][var10 + 1] - field76[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2116[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field70[var20] = 0;
                Statics.field611[var20] = 0;
                Statics.field71[var20] = 0;
                Statics.field2096[var20] = 0;
                Statics.field2146[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field66[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class38 var26 = (class38) class38.field902.method3097((long) var25);
                            class38 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field911.method2660(1, var25);
                                class38 var29 = new class38();
                                if (var28 != null) {
                                    var29.method653(new class108(var28), var25);
                                }
                                var29.method654();
                                class38.field902.method3099(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field70[var22] += var27.field904;
                            Statics.field611[var22] += var27.field905;
                            Statics.field71[var22] += var27.field906;
                            Statics.field2096[var22] += var27.field910;
                            var10002 = Statics.field2146[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field66[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class38 var34 = (class38) class38.field902.method3097((long) var33);
                            class38 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field911.method2660(1, var33);
                                class38 var37 = new class38();
                                if (var36 != null) {
                                    var37.method653(new class108(var36), var33);
                                }
                                var37.method654();
                                class38.field902.method3099(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field70[var22] -= var35.field904;
                            Statics.field611[var22] -= var35.field905;
                            Statics.field71[var22] -= var35.field906;
                            Statics.field2096[var22] -= var35.field910;
                            var10002 = Statics.field2146[var22]--;
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
                            var39 += Statics.field70[var45];
                            var40 += Statics.field611[var45];
                            var41 += Statics.field71[var45];
                            var42 += Statics.field2096[var45];
                            var43 += Statics.field2146[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field70[var46];
                            var40 -= Statics.field611[var46];
                            var41 -= Statics.field71[var46];
                            var42 -= Statics.field2096[var46];
                            var43 -= Statics.field2146[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field247 || (field83[0][var21][var44] & 0x2) != 0 || (field83[var6][var21][var44] & 0x10) == 0 && method24(var6, var21, var44) == client.field447)) {
                            if (var6 < field75) {
                                field75 = var6;
                            }
                            int var47 = Statics.field66[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field68[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field76[var6][var21][var44];
                                int var50 = field76[var6][var21 + 1][var44];
                                int var51 = field76[var6][var21 + 1][var44 + 1];
                                int var52 = field76[var6][var21][var44 + 1];
                                int var53 = Statics.field2116[var21][var44];
                                int var54 = Statics.field2116[var21 + 1][var44];
                                int var55 = Statics.field2116[var21 + 1][var44 + 1];
                                int var56 = Statics.field2116[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method26(var59, var60, var61);
                                    int var62 = field67 + var59 & 0xFF;
                                    int var63 = field80 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method26(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field1517[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class42.method869(var48 - 1).field972) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field2683[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class85.field1475[method3091(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1612(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method3091(var57, var53), method3091(var57, var54), method3091(var57, var55), method3091(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field1517[var6][var21][var44] + 1;
                                    byte var67 = Statics.field69[var6][var21][var44];
                                    class42 var68 = class42.method869(var48 - 1);
                                    int var69 = var68.field968;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1473.method1823(var69);
                                        var71 = -1;
                                    } else if (var68.field970 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method26(var68.field974, var68.field971, var68.field976);
                                        int var72 = field67 + var68.field974 & 0xFF;
                                        int var73 = field80 + var68.field976;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method26(var72, var68.field971, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class85.field1475[method742(var70, 96)];
                                    }
                                    if (var68.field973 != -1) {
                                        int var75 = field67 + var68.field977 & 0xFF;
                                        int var76 = field80 + var68.field979;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method26(var75, var68.field978, var76);
                                        var74 = class85.field1475[method742(var77, 96)];
                                    }
                                    arg0.method1612(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method3091(var57, var53), method3091(var57, var54), method3091(var57, var55), method3091(var57, var56), method742(var71, var53), method742(var71, var54), method742(var71, var55), method742(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1564(var6, var79, var78, method24(var6, var79, var78));
                }
            }
            Statics.field66[var6] = (byte[][]) null;
            Statics.field68[var6] = (byte[][]) null;
            Statics.field1517[var6] = (byte[][]) null;
            Statics.field69[var6] = (byte[][]) null;
            Statics.field2979[var6] = (byte[][]) null;
        }
        arg0.method1708(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field83[1][var80][var81] & 0x2) == 2) {
                    arg0.method1562(var80, var81);
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
                        if ((Statics.field2683[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field2683[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field2683[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label357: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field2683[var91 - 1][var88][var93] & var82) == 0) {
                                        break label357;
                                    }
                                }
                                var91--;
                            }
                            label346: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field2683[var92 + 1][var88][var94] & var82) == 0) {
                                        break label346;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field76[var92][var88][var89] - var96;
                                int var98 = field76[var91][var88][var89];
                                class80.method1704(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field2683[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2683[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field2683[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field2683[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label410: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field2683[var103 - 1][var105][var87] & var83) == 0) {
                                        break label410;
                                    }
                                }
                                var103--;
                            }
                            label399: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field2683[var104 + 1][var106][var87] & var83) == 0) {
                                        break label399;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field76[var104][var101][var87] - var108;
                                int var110 = field76[var103][var101][var87];
                                class80.method1704(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field2683[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2683[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field2683[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field2683[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label463: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field2683[var86][var113 - 1][var117] & var84) == 0) {
                                        break label463;
                                    }
                                }
                                var113--;
                            }
                            label452: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field2683[var86][var114 + 1][var118] & var84) == 0) {
                                        break label452;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field76[var86][var113][var115];
                                class80.method1704(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field2683[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.l(IIII)I")
    public static int method24(int arg0, int arg1, int arg2) {
        if ((field83[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field83[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ee.n(IIII)I")
    public static final int method2632(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method17(var3, var5);
        int var8 = method17(var3 + 1, var5);
        int var9 = method17(var3, var5 + 1);
        int var10 = method17(var3 + 1, var5 + 1);
        int var11 = method4(var7, var8, var4, arg2);
        int var12 = method4(var9, var10, var4, arg2);
        return method4(var11, var12, var6, arg2);
    }

    @ObfuscatedName("g.d(IIIII)I")
    public static final int method4(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1465[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("z.h(III)I")
    public static final int method17(int arg0, int arg1) {
        int var2 = method2390(arg0 - 1, arg1 - 1) + method2390(arg0 + 1, arg1 - 1) + method2390(arg0 - 1, arg1 + 1) + method2390(arg0 + 1, arg1 + 1);
        int var3 = method2390(arg0 - 1, arg1) + method2390(arg0 + 1, arg1) + method2390(arg0, arg1 - 1) + method2390(arg0, arg1 + 1);
        int var4 = method2390(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("du.y(IIB)I")
    public static final int method2390(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ft.p(III)I")
    public static final int method3091(int arg0, int arg1) {
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

    @ObfuscatedName("aa.i(IIB)I")
    public static final int method742(int arg0, int arg1) {
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

    @ObfuscatedName("b.s(IIIB)I")
    public static final int method26(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("y.f(III)Z")
    public static final boolean method125(int arg0, int arg1) {
        class37 var2 = class37.method3266(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method617(arg1);
    }

    @ObfuscatedName("ap.u(IIIIIIILcc;Lhq;I)V")
    public static final void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class80 arg7, class209 arg8) {
        class37 var9 = class37.method3266(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field866;
            var11 = var9.field865;
        } else {
            var10 = var9.field865;
            var11 = var9.field866;
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
        int[][] var16 = field76[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field869 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field890 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class79 var22;
            if (var9.field873 == -1 && var9.field891 == null) {
                var22 = var9.method604(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class11(arg4, 22, arg5, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1566(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field879 == 1) {
                arg8.method3487(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class79 var45;
            if (var9.field873 == -1 && var9.field891 == null) {
                var45 = var9.method604(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg4, 10, arg5, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            if (var45 != null) {
                arg7.method1569(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field879 != 0) {
                arg8.method3511(arg2, arg3, var10, var11, var9.field868);
            }
        } else if (arg6 >= 12) {
            class79 var23;
            if (var9.field873 == -1 && var9.field891 == null) {
                var23 = var9.method604(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1569(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field879 != 0) {
                arg8.method3511(arg2, arg3, var10, var11, var9.field868);
            }
        } else if (arg6 == 0) {
            class79 var24;
            if (var9.field873 == -1 && var9.field891 == null) {
                var24 = var9.method604(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg4, 0, arg5, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1568(arg0, arg2, arg3, var17, var24, (class79) null, field65[arg5], 0, var20, var21);
            if (var9.field879 != 0) {
                arg8.method3484(arg2, arg3, arg6, arg5, var9.field868);
            }
        } else if (arg6 == 1) {
            class79 var25;
            if (var9.field873 == -1 && var9.field891 == null) {
                var25 = var9.method604(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg4, 1, arg5, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1568(arg0, arg2, arg3, var17, var25, (class79) null, field74[arg5], 0, var20, var21);
            if (var9.field879 != 0) {
                arg8.method3484(arg2, arg3, arg6, arg5, var9.field868);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class79 var27;
            class79 var28;
            if (var9.field873 == -1 && var9.field891 == null) {
                var27 = var9.method604(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method604(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field873, true, (class79) null);
                var28 = new class11(arg4, 2, var26, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1568(arg0, arg2, arg3, var17, var27, var28, field65[arg5], field65[var26], var20, var21);
            if (var9.field879 != 0) {
                arg8.method3484(arg2, arg3, arg6, arg5, var9.field868);
            }
        } else if (arg6 == 3) {
            class79 var29;
            if (var9.field873 == -1 && var9.field891 == null) {
                var29 = var9.method604(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg4, 3, arg5, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1568(arg0, arg2, arg3, var17, var29, (class79) null, field74[arg5], 0, var20, var21);
            if (var9.field879 != 0) {
                arg8.method3484(arg2, arg3, arg6, arg5, var9.field868);
            }
        } else if (arg6 == 9) {
            class79 var30;
            if (var9.field873 == -1 && var9.field891 == null) {
                var30 = var9.method604(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1569(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field879 != 0) {
                arg8.method3511(arg2, arg3, var10, var11, var9.field868);
            }
        } else if (arg6 == 4) {
            class79 var31;
            if (var9.field873 == -1 && var9.field891 == null) {
                var31 = var9.method604(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var31, (class79) null, field65[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1586(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class37.method3266(var33 >> 14 & 0x7FFF).field854;
            }
            class79 var34;
            if (var9.field873 == -1 && var9.field891 == null) {
                var34 = var9.method604(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var34, (class79) null, field65[arg5], 0, field64[arg5] * var32, field79[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1586(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class37.method3266(var36 >> 14 & 0x7FFF).field854 / 2;
            }
            class79 var37;
            if (var9.field873 == -1 && var9.field891 == null) {
                var37 = var9.method604(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var37, (class79) null, 256, arg5, field77[arg5] * var35, field78[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class79 var39;
            if (var9.field873 == -1 && var9.field891 == null) {
                var39 = var9.method604(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var39, (class79) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1586(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class37.method3266(var41 >> 14 & 0x7FFF).field854 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class79 var43;
            class79 var44;
            if (var9.field873 == -1 && var9.field891 == null) {
                var43 = var9.method604(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method604(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field873, true, (class79) null);
                var44 = new class11(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field873, true, (class79) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field77[arg5] * var40, field78[arg5] * var40, var20, var21);
        }
    }
}
