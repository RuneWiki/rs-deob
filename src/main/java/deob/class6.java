package deob;

@ObfuscatedName("d")
public final class class6 {

    @ObfuscatedName("d.k")
    public static int[][][] field76 = new int[4][105][105];

    @ObfuscatedName("d.h")
    public static byte[][][] field71 = new byte[4][104][104];

    @ObfuscatedName("d.o")
    public static int field72 = 99;

    @ObfuscatedName("d.m")
    public static final int[] field77 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("d.y")
    public static final int[] field78 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("d.x")
    public static final int[] field83 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("d.n")
    public static final int[] field80 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("d.v")
    public static final int[] field81 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("d.s")
    public static final int[] field70 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("d.w")
    public static int field87 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("d.p")
    public static int field84 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.k(I)V")
    public static void method183() {
        field72 = 99;
        Statics.field73 = new byte[4][104][104];
        Statics.field2275 = new byte[4][104][104];
        Statics.field74 = new byte[4][104][104];
        Statics.field2631 = new byte[4][104][104];
        Statics.field79 = new int[4][105][105];
        Statics.field75 = new byte[4][105][105];
        Statics.field1361 = new int[105][105];
        Statics.field2029 = new int[104];
        Statics.field1562 = new int[104];
        Statics.field12 = new int[104];
        Statics.field666 = new int[104];
        Statics.field1527 = new int[104];
    }

    @ObfuscatedName("dh.h(IIIIB)V")
    public static final void method2588(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field75[0][var5][var4] = 127;
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

    @ObfuscatedName("cz.o([BIIIIIII[Ldb;I)V")
    public static final void method1754(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1855[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class119 var11 = new class119(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method545(var11, arg1, arg2 + class177.method2986(var13 & 0x7, var14 & 0x7, arg7), arg3 + class177.method1753(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method545(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gf.z(IIII)V")
    public static final void method3490(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field76[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field76[arg0][arg1][arg2 + var5] = field76[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field76[arg0][arg1 + var6][arg2] = field76[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field76[arg0][arg1 - 1][arg2] != 0) {
            field76[arg0][arg1][arg2] = field76[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field76[arg0][arg1][arg2 - 1] != 0) {
            field76[arg0][arg1][arg2] = field76[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field76[arg0][arg1 - 1][arg2 - 1] != 0) {
            field76[arg0][arg1][arg2] = field76[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("v.c(Ldk;IIIIIIB)V")
    public static final void method545(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2330();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2330();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2330();
                }
            }
            return;
        }
        field71[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2330();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field76[0][arg2][arg3] = -method2519(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field76[arg1][arg2][arg3] = field76[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2330();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field76[0][arg2][arg3] = -var8 * 8;
                } else {
                    field76[arg1][arg2][arg3] = field76[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2275[arg1][arg2][arg3] = arg0.method2413();
                Statics.field74[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2631[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field71[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field73[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fn.d([BIIIIIIILcy;[Ldb;I)V")
    public static final void method2979(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class86 arg8, class108[] arg9) {
        class119 var10 = new class119(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2314();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2314();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2330();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class41 var21 = class41.method2962(var11);
                    int var22 = arg2 + class177.method2824(var16 & 0x7, var15 & 0x7, arg7, var21.field912, var21.field913, var20);
                    int var23 = arg3 + class177.method1488(var16 & 0x7, var15 & 0x7, arg7, var21.field912, var21.field913, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field71[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class108 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method2636(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("di.l(IIIIIILcy;Ldb;I)V")
    public static final void method2636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field492 && (field71[0][arg1][arg2] & 0x2) == 0 && (field71[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field72) {
            field72 = arg0;
        }
        class41 var8 = class41.method2962(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field913;
            var10 = var8.field912;
        } else {
            var9 = var8.field912;
            var10 = var8.field913;
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
        if (var8.field922 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field906 == 1) {
            var20 += 256;
        }
        if (var8.method755()) {
            class24 var21 = new class24();
            var21.field602 = arg0;
            var21.field592 = arg1 * 128;
            var21.field591 = arg2 * 128;
            int var22 = var8.field912;
            int var23 = var8.field913;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field913;
                var23 = var8.field912;
            }
            var21.field594 = (arg1 + var22) * 128;
            var21.field601 = (arg2 + var23) * 128;
            var21.field597 = var8.field941;
            var21.field596 = var8.field942 * 128;
            var21.field599 = var8.field943;
            var21.field600 = var8.field944;
            var21.field593 = var8.field945;
            if (var8.field938 != null) {
                var21.field590 = var8;
                var21.method547();
            }
            class24.field595.method3588(var21);
            if (var21.field593 != null) {
                var21.field604 = var21.field599 + (int) (Math.random() * (double) (var21.field600 - var21.field599));
            }
        }
        if (arg5 == 22) {
            if (!client.field492 || var8.field922 != 0 || var8.field903 == 1 || var8.field935) {
                class85 var24;
                if (var8.field939 == -1 && var8.field938 == null) {
                    var24 = var8.method750(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field939, true, (class85) null);
                }
                arg6.method1865(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field903 == 1 && arg7 != null) {
                    arg7.method2221(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field939 == -1 && var8.field938 == null) {
                var47 = var8.method750(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            if (var47 != null && arg6.method1787(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field932) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2143() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field75[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field75[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field903 != 0 && arg7 != null) {
                arg7.method2219(arg1, arg2, var9, var10, var8.field915);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field939 == -1 && var8.field938 == null) {
                var25 = var8.method750(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1787(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field79[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field903 != 0 && arg7 != null) {
                arg7.method2219(arg1, arg2, var9, var10, var8.field915);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field939 == -1 && var8.field938 == null) {
                var26 = var8.method750(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1771(arg0, arg1, arg2, var16, var26, (class85) null, field77[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field932) {
                    Statics.field75[arg0][arg1][arg2] = 50;
                    Statics.field75[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field919) {
                    Statics.field79[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field932) {
                    Statics.field75[arg0][arg1][arg2 + 1] = 50;
                    Statics.field75[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field919) {
                    Statics.field79[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field932) {
                    Statics.field75[arg0][arg1 + 1][arg2] = 50;
                    Statics.field75[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field919) {
                    Statics.field79[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field932) {
                    Statics.field75[arg0][arg1][arg2] = 50;
                    Statics.field75[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field919) {
                    Statics.field79[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field903 != 0 && arg7 != null) {
                arg7.method2220(arg1, arg2, arg5, arg4, var8.field915);
            }
            if (var8.field900 != 16) {
                arg6.method1868(arg0, arg1, arg2, var8.field900);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field939 == -1 && var8.field938 == null) {
                var27 = var8.method750(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1771(arg0, arg1, arg2, var16, var27, (class85) null, field78[arg4], 0, var19, var20);
            if (var8.field932) {
                if (arg4 == 0) {
                    Statics.field75[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field75[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field75[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field75[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field903 != 0 && arg7 != null) {
                arg7.method2220(arg1, arg2, arg5, arg4, var8.field915);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field939 == -1 && var8.field938 == null) {
                var29 = var8.method750(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method750(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field939, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1771(arg0, arg1, arg2, var16, var29, var30, field77[arg4], field77[var28], var19, var20);
            if (var8.field919) {
                if (arg4 == 0) {
                    Statics.field79[arg0][arg1][arg2] |= 0x249;
                    Statics.field79[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field79[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field79[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field79[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field79[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field79[arg0][arg1][arg2] |= 0x492;
                    Statics.field79[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field903 != 0 && arg7 != null) {
                arg7.method2220(arg1, arg2, arg5, arg4, var8.field915);
            }
            if (var8.field900 != 16) {
                arg6.method1868(arg0, arg1, arg2, var8.field900);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field939 == -1 && var8.field938 == null) {
                var31 = var8.method750(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1771(arg0, arg1, arg2, var16, var31, (class85) null, field78[arg4], 0, var19, var20);
            if (var8.field932) {
                if (arg4 == 0) {
                    Statics.field75[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field75[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field75[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field75[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field903 != 0 && arg7 != null) {
                arg7.method2220(arg1, arg2, arg5, arg4, var8.field915);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field939 == -1 && var8.field938 == null) {
                var32 = var8.method750(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1787(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field903 != 0 && arg7 != null) {
                arg7.method2219(arg1, arg2, var9, var10, var8.field915);
            }
            if (var8.field900 != 16) {
                arg6.method1868(arg0, arg1, arg2, var8.field900);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field939 == -1 && var8.field938 == null) {
                var33 = var8.method750(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1853(arg0, arg1, arg2, var16, var33, (class85) null, field77[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1816(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method2962(var35 >> 14 & 0x7FFF).field900;
            }
            class85 var36;
            if (var8.field939 == -1 && var8.field938 == null) {
                var36 = var8.method750(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1853(arg0, arg1, arg2, var16, var36, (class85) null, field77[arg4], 0, field83[arg4] * var34, field80[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1816(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method2962(var38 >> 14 & 0x7FFF).field900 / 2;
            }
            class85 var39;
            if (var8.field939 == -1 && var8.field938 == null) {
                var39 = var8.method750(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1853(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field81[arg4] * var37, field70[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field939 == -1 && var8.field938 == null) {
                var41 = var8.method750(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1853(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1816(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method2962(var43 >> 14 & 0x7FFF).field900 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field939 == -1 && var8.field938 == null) {
                var45 = var8.method750(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method750(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field939, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field939, true, (class85) null);
            }
            arg6.method1853(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field81[arg4] * var42, field70[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cq.b(Lcy;[Ldb;I)V")
    public static final void method2124(class86 arg0, class108[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field71[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field71[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2217(var3, var4);
                        }
                    }
                }
            }
        }
        field87 += (int) (Math.random() * 5.0D) - 2;
        if (field87 < -8) {
            field87 = -8;
        }
        if (field87 > 8) {
            field87 = 8;
        }
        field84 += (int) (Math.random() * 5.0D) - 2;
        if (field84 < -16) {
            field84 = -16;
        }
        if (field84 > 16) {
            field84 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field75[var6];
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
                    Statics.field1361[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field2029[var20] = 0;
                Statics.field1562[var20] = 0;
                Statics.field12[var20] = 0;
                Statics.field666[var20] = 0;
                Statics.field1527[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field73[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class42 var25 = class42.method667(var24 - 1);
                            Statics.field2029[var22] += var25.field954;
                            Statics.field1562[var22] += var25.field955;
                            Statics.field12[var22] += var25.field957;
                            Statics.field666[var22] += var25.field966;
                            var10002 = Statics.field1527[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field73[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class42 var28 = class42.method667(var27 - 1);
                            Statics.field2029[var22] -= var28.field954;
                            Statics.field1562[var22] -= var28.field955;
                            Statics.field12[var22] -= var28.field957;
                            Statics.field666[var22] -= var28.field966;
                            var10002 = Statics.field1527[var22]--;
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
                            var29 += Statics.field2029[var35];
                            var30 += Statics.field1562[var35];
                            var31 += Statics.field12[var35];
                            var32 += Statics.field666[var35];
                            var33 += Statics.field1527[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field2029[var36];
                            var30 -= Statics.field1562[var36];
                            var31 -= Statics.field12[var36];
                            var32 -= Statics.field666[var36];
                            var33 -= Statics.field1527[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field492 || (field71[0][var21][var34] & 0x2) != 0 || (field71[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field72) {
                                field72 = var6;
                            }
                            int var37 = Statics.field73[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field2275[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field76[var6][var21][var34];
                                int var40 = field76[var6][var21 + 1][var34];
                                int var41 = field76[var6][var21 + 1][var34 + 1];
                                int var42 = field76[var6][var21][var34 + 1];
                                int var43 = Statics.field1361[var21][var34];
                                int var44 = Statics.field1361[var21 + 1][var34];
                                int var45 = Statics.field1361[var21 + 1][var34 + 1];
                                int var46 = Statics.field1361[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method540(var49, var50, var51);
                                    int var52 = field87 + var49 & 0xFF;
                                    int var53 = field84 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method540(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field74[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class47 var56 = (class47) class47.field1028.method3510((long) var55);
                                        class47 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field1033.method3118(4, var55);
                                            class47 var59 = new class47();
                                            if (var58 != null) {
                                                var59.method909(new class119(var58), var55);
                                            }
                                            var59.method910();
                                            class47.field1028.method3512(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field1030) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field79[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class91.field1536[method33(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1768(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method33(var47, var43), method33(var47, var44), method33(var47, var45), method33(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field74[var6][var21][var34] + 1;
                                    byte var62 = Statics.field2631[var6][var21][var34];
                                    int var63 = var38 - 1;
                                    class47 var64 = (class47) class47.field1028.method3510((long) var63);
                                    class47 var65;
                                    if (var64 == null) {
                                        byte[] var66 = Statics.field1033.method3118(4, var63);
                                        class47 var67 = new class47();
                                        if (var66 != null) {
                                            var67.method909(new class119(var66), var63);
                                        }
                                        var67.method910();
                                        class47.field1028.method3512(var67, (long) var63);
                                        var65 = var67;
                                    } else {
                                        var65 = var64;
                                    }
                                    int var69 = var65.field1032;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1532.method2018(var69);
                                        var71 = -1;
                                    } else if (var65.field1029 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method540(var65.field1027, var65.field1031, var65.field1035);
                                        int var72 = field87 + var65.field1027 & 0xFF;
                                        int var73 = field84 + var65.field1035;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method540(var72, var65.field1031, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class91.field1536[method2606(var70, 96)];
                                    }
                                    if (var65.field1037 != -1) {
                                        int var75 = field87 + var65.field1034 & 0xFF;
                                        int var76 = field84 + var65.field1038;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method540(var75, var65.field1043, var76);
                                        var74 = class91.field1536[method2606(var77, 96)];
                                    }
                                    arg0.method1768(var6, var21, var34, var61, var62, var69, var39, var40, var41, var42, method33(var47, var43), method33(var47, var44), method33(var47, var45), method33(var47, var46), method2606(var71, var43), method2606(var71, var44), method2606(var71, var45), method2606(var71, var46), var60, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field71[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field71[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method1935(var6, var79, var78, var84);
                }
            }
            Statics.field73[var6] = (byte[][]) null;
            Statics.field2275[var6] = (byte[][]) null;
            Statics.field74[var6] = (byte[][]) null;
            Statics.field2631[var6] = (byte[][]) null;
            Statics.field75[var6] = (byte[][]) null;
        }
        arg0.method1794(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field71[1][var85][var86] & 0x2) == 2) {
                    arg0.method1765(var85, var86);
                }
            }
        }
        int var87 = 1;
        int var88 = 2;
        int var89 = 4;
        for (int var90 = 0; var90 < 4; var90++) {
            if (var90 > 0) {
                var87 <<= 0x3;
                var88 <<= 0x3;
                var89 <<= 0x3;
            }
            for (int var91 = 0; var91 <= var90; var91++) {
                for (int var92 = 0; var92 <= 104; var92++) {
                    for (int var93 = 0; var93 <= 104; var93++) {
                        if ((Statics.field79[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field79[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field79[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label361: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field79[var96 - 1][var93][var98] & var87) == 0) {
                                        break label361;
                                    }
                                }
                                var96--;
                            }
                            label350: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field79[var97 + 1][var93][var99] & var87) == 0) {
                                        break label350;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field76[var97][var93][var94] - var101;
                                int var103 = field76[var96][var93][var94];
                                class86.method1929(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field79[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field79[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field79[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field79[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label414: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field79[var108 - 1][var110][var92] & var88) == 0) {
                                        break label414;
                                    }
                                }
                                var108--;
                            }
                            label403: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field79[var109 + 1][var111][var92] & var88) == 0) {
                                        break label403;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field76[var109][var106][var92] - var113;
                                int var115 = field76[var108][var106][var92];
                                class86.method1929(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field79[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field79[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field79[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field79[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label467: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field79[var91][var118 - 1][var122] & var89) == 0) {
                                        break label467;
                                    }
                                }
                                var118--;
                            }
                            label456: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field79[var91][var119 + 1][var123] & var89) == 0) {
                                        break label456;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field76[var91][var118][var120];
                                class86.method1929(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field79[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dk.j(IIB)I")
    public static final int method2519(int arg0, int arg1) {
        int var2 = method2259(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2259(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2259(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("dr.f(IIII)I")
    public static final int method2259(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3020(var3, var5);
        int var8 = method3020(var3 + 1, var5);
        int var9 = method3020(var3, var5 + 1);
        int var10 = method3020(var3 + 1, var5 + 1);
        int var11 = 65536 - class91.field1556[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class91.field1556[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class91.field1556[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("fl.i(IIB)I")
    public static final int method3020(int arg0, int arg1) {
        int var2 = method2213(arg0 - 1, arg1 - 1) + method2213(arg0 + 1, arg1 - 1) + method2213(arg0 - 1, arg1 + 1) + method2213(arg0 + 1, arg1 + 1);
        int var3 = method2213(arg0 - 1, arg1) + method2213(arg0 + 1, arg1) + method2213(arg0, arg1 - 1) + method2213(arg0, arg1 + 1);
        int var4 = method2213(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dp.g(IIB)I")
    public static final int method2213(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("o.t(IIS)I")
    public static final int method33(int arg0, int arg1) {
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

    @ObfuscatedName("du.e(III)I")
    public static final int method2606(int arg0, int arg1) {
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

    @ObfuscatedName("n.q(IIII)I")
    public static final int method540(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cu.u(IIIIIIILcy;Ldb;I)V")
    public static final void method2046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class86 arg7, class108 arg8) {
        class41 var9 = class41.method2962(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field913;
            var11 = var9.field912;
        } else {
            var10 = var9.field912;
            var11 = var9.field913;
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
        if (var9.field922 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field906 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class85 var22;
            if (var9.field939 == -1 && var9.field938 == null) {
                var22 = var9.method746(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1865(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field903 == 1) {
                arg8.method2221(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var45;
            if (var9.field939 == -1 && var9.field938 == null) {
                var45 = var9.method746(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            if (var45 != null) {
                arg7.method1787(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field903 != 0) {
                arg8.method2219(arg2, arg3, var10, var11, var9.field915);
            }
        } else if (arg6 >= 12) {
            class85 var23;
            if (var9.field939 == -1 && var9.field938 == null) {
                var23 = var9.method746(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1787(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field903 != 0) {
                arg8.method2219(arg2, arg3, var10, var11, var9.field915);
            }
        } else if (arg6 == 0) {
            class85 var24;
            if (var9.field939 == -1 && var9.field938 == null) {
                var24 = var9.method746(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1771(arg0, arg2, arg3, var17, var24, (class85) null, field77[arg5], 0, var20, var21);
            if (var9.field903 != 0) {
                arg8.method2220(arg2, arg3, arg6, arg5, var9.field915);
            }
        } else if (arg6 == 1) {
            class85 var25;
            if (var9.field939 == -1 && var9.field938 == null) {
                var25 = var9.method746(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1771(arg0, arg2, arg3, var17, var25, (class85) null, field78[arg5], 0, var20, var21);
            if (var9.field903 != 0) {
                arg8.method2220(arg2, arg3, arg6, arg5, var9.field915);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class85 var27;
            class85 var28;
            if (var9.field939 == -1 && var9.field938 == null) {
                var27 = var9.method746(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method746(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field939, true, (class85) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1771(arg0, arg2, arg3, var17, var27, var28, field77[arg5], field77[var26], var20, var21);
            if (var9.field903 != 0) {
                arg8.method2220(arg2, arg3, arg6, arg5, var9.field915);
            }
        } else if (arg6 == 3) {
            class85 var29;
            if (var9.field939 == -1 && var9.field938 == null) {
                var29 = var9.method746(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1771(arg0, arg2, arg3, var17, var29, (class85) null, field78[arg5], 0, var20, var21);
            if (var9.field903 != 0) {
                arg8.method2220(arg2, arg3, arg6, arg5, var9.field915);
            }
        } else if (arg6 == 9) {
            class85 var30;
            if (var9.field939 == -1 && var9.field938 == null) {
                var30 = var9.method746(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1787(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field903 != 0) {
                arg8.method2219(arg2, arg3, var10, var11, var9.field915);
            }
        } else if (arg6 == 4) {
            class85 var31;
            if (var9.field939 == -1 && var9.field938 == null) {
                var31 = var9.method746(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1853(arg0, arg2, arg3, var17, var31, (class85) null, field77[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1816(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class41.method2962(var33 >> 14 & 0x7FFF).field900;
            }
            class85 var34;
            if (var9.field939 == -1 && var9.field938 == null) {
                var34 = var9.method746(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1853(arg0, arg2, arg3, var17, var34, (class85) null, field77[arg5], 0, field83[arg5] * var32, field80[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1816(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class41.method2962(var36 >> 14 & 0x7FFF).field900 / 2;
            }
            class85 var37;
            if (var9.field939 == -1 && var9.field938 == null) {
                var37 = var9.method746(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1853(arg0, arg2, arg3, var17, var37, (class85) null, 256, arg5, field81[arg5] * var35, field70[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class85 var39;
            if (var9.field939 == -1 && var9.field938 == null) {
                var39 = var9.method746(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1853(arg0, arg2, arg3, var17, var39, (class85) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1816(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class41.method2962(var41 >> 14 & 0x7FFF).field900 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class85 var43;
            class85 var44;
            if (var9.field939 == -1 && var9.field938 == null) {
                var43 = var9.method746(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method746(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field939, true, (class85) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field939, true, (class85) null);
            }
            arg7.method1853(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field81[arg5] * var40, field70[arg5] * var40, var20, var21);
        }
    }
}
