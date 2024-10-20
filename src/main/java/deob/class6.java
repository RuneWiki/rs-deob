package deob;

@ObfuscatedName("j")
public final class class6 {

    @ObfuscatedName("j.g")
    public static int[][][] field65 = new int[4][105][105];

    @ObfuscatedName("j.s")
    public static byte[][][] field66 = new byte[4][104][104];

    @ObfuscatedName("j.h")
    public static int field81 = 99;

    @ObfuscatedName("j.c")
    public static final int[] field73 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("j.l")
    public static final int[] field74 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("j.n")
    public static final int[] field82 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("j.d")
    public static final int[] field76 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("j.p")
    public static final int[] field68 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("j.z")
    public static final int[] field78 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("j.q")
    public static int field77 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("j.i")
    public static int field80 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.g(IIIII)V")
    public static final void method1601(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2889[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field65[0][var5][var4] = field65[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field65[0][var5][var4] = field65[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field65[0][var5][var4] = field65[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field65[0][var5][var4] = field65[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.s([BIIII[Lga;I)V")
    public static final void method99(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class198[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2961[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class107 var9 = new class107(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1857(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("i.h(IIII)V")
    public static final void method538(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field65[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field65[arg0][arg1][arg2 + var5] = field65[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field65[arg0][arg1 + var6][arg2] = field65[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field65[arg0][arg1 - 1][arg2] != 0) {
            field65[arg0][arg1][arg2] = field65[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field65[arg0][arg1][arg2 - 1] != 0) {
            field65[arg0][arg1][arg2] = field65[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field65[arg0][arg1 - 1][arg2 - 1] != 0) {
            field65[arg0][arg1][arg2] = field65[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cx.m(Ldi;IIIIIIB)V")
    public static final void method1857(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2101();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2101();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2101();
                }
            }
            return;
        }
        field66[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2101();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field65[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method14(var10 + 45365, var11 + 91923, 4) - 128 + (method14(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method14(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field65[arg1][arg2][arg3] = field65[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2101();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field65[0][arg2][arg3] = -var15 * 8;
                } else {
                    field65[arg1][arg2][arg3] = field65[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field69[arg1][arg2][arg3] = arg0.method2263();
                Statics.field2876[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field70[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field66[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field67[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cw.u([BIII)Z")
    public static final boolean method1939(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class107 var4 = new class107(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2114();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2114();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2101() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class36 var16 = class36.method2773(var5);
                        if (var13 != 22 || !client.field403 || var16.field867 != 0 || var16.field850 == 1 || var16.field828) {
                            if (!var16.method655()) {
                                client.field362++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2114();
                if (var9 == 0) {
                    break;
                }
                var4.method2101();
            }
        }
    }

    @ObfuscatedName("b.j([BIILcb;[Lga;B)V")
    public static final void method96(byte[] arg0, int arg1, int arg2, class79 arg3, class198[] arg4) {
        class107 var5 = new class107(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2114();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2114();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2101();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field66[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class198 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ay.b([BIIIIIIILcb;[Lga;I)V")
    public static final void method797(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79 arg8, class198[] arg9) {
        class107 var10 = new class107(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2114();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2114();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2101();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class36 var21 = class36.method2773(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field844;
                    int var27 = var21.field845;
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
                    int var36 = var21.field844;
                    int var37 = var21.field845;
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
                        if ((field66[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class198 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method2(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.v(IIIIIILcb;Lga;B)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class198 arg7) {
        if (client.field403 && (field66[0][arg1][arg2] & 0x2) == 0) {
            if ((field66[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method147(arg0, arg1, arg2) != client.field296) {
                return;
            }
        }
        if (arg0 < field81) {
            field81 = arg0;
        }
        class36 var8 = class36.method2773(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field845;
            var10 = var8.field844;
        } else {
            var9 = var8.field844;
            var10 = var8.field845;
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
        int[][] var15 = field65[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field867 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field851 == 1) {
            var20 += 256;
        }
        if (var8.method650()) {
            class20 var21 = new class20();
            var21.field539 = arg0;
            var21.field534 = arg1 * 128;
            var21.field538 = arg2 * 128;
            int var22 = var8.field844;
            int var23 = var8.field845;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field845;
                var23 = var8.field844;
            }
            var21.field536 = (arg1 + var22) * 128;
            var21.field537 = (arg2 + var23) * 128;
            var21.field551 = var8.field873;
            var21.field532 = var8.field874 * 128;
            var21.field535 = var8.field875;
            var21.field533 = var8.field876;
            var21.field543 = var8.field877;
            if (var8.field846 != null) {
                var21.field546 = var8;
                var21.method498();
            }
            class20.field542.method3200(var21);
            if (var21.field543 != null) {
                var21.field544 = var21.field535 + (int) (Math.random() * (double) (var21.field533 - var21.field535));
            }
        }
        if (arg5 == 22) {
            if (!client.field403 || var8.field867 != 0 || var8.field850 == 1 || var8.field828) {
                class78 var24;
                if (var8.field852 == -1 && var8.field846 == null) {
                    var24 = var8.method656(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field852, true, (class78) null);
                }
                arg6.method1614(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field850 == 1 && arg7 != null) {
                    arg7.method3495(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var47;
            if (var8.field852 == -1 && var8.field846 == null) {
                var47 = var8.method656(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            if (var47 != null && arg6.method1607(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field869) {
                int var48 = 15;
                if (var47 instanceof class98) {
                    var48 = ((class98) var47).method1960() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2889[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2889[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3473(arg1, arg2, var9, var10, var8.field847);
            }
        } else if (arg5 >= 12) {
            class78 var25;
            if (var8.field852 == -1 && var8.field846 == null) {
                var25 = var8.method656(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1607(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field72[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3473(arg1, arg2, var9, var10, var8.field847);
            }
        } else if (arg5 == 0) {
            class78 var26;
            if (var8.field852 == -1 && var8.field846 == null) {
                var26 = var8.method656(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var16, var26, (class78) null, field73[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field869) {
                    Statics.field2889[arg0][arg1][arg2] = 50;
                    Statics.field2889[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field829) {
                    Statics.field72[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field869) {
                    Statics.field2889[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2889[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field829) {
                    Statics.field72[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field869) {
                    Statics.field2889[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2889[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field829) {
                    Statics.field72[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field869) {
                    Statics.field2889[arg0][arg1][arg2] = 50;
                    Statics.field2889[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field829) {
                    Statics.field72[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3472(arg1, arg2, arg5, arg4, var8.field847);
            }
            if (var8.field853 != 16) {
                arg6.method1623(arg0, arg1, arg2, var8.field853);
            }
        } else if (arg5 == 1) {
            class78 var27;
            if (var8.field852 == -1 && var8.field846 == null) {
                var27 = var8.method656(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var16, var27, (class78) null, field74[arg4], 0, var19, var20);
            if (var8.field869) {
                if (arg4 == 0) {
                    Statics.field2889[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2889[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2889[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2889[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3472(arg1, arg2, arg5, arg4, var8.field847);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class78 var29;
            class78 var30;
            if (var8.field852 == -1 && var8.field846 == null) {
                var29 = var8.method656(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method656(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field852, true, (class78) null);
                var30 = new class11(arg3, 2, var28, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var16, var29, var30, field73[arg4], field73[var28], var19, var20);
            if (var8.field829) {
                if (arg4 == 0) {
                    Statics.field72[arg0][arg1][arg2] |= 0x249;
                    Statics.field72[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field72[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field72[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field72[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field72[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field72[arg0][arg1][arg2] |= 0x492;
                    Statics.field72[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3472(arg1, arg2, arg5, arg4, var8.field847);
            }
            if (var8.field853 != 16) {
                arg6.method1623(arg0, arg1, arg2, var8.field853);
            }
        } else if (arg5 == 3) {
            class78 var31;
            if (var8.field852 == -1 && var8.field846 == null) {
                var31 = var8.method656(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var16, var31, (class78) null, field74[arg4], 0, var19, var20);
            if (var8.field869) {
                if (arg4 == 0) {
                    Statics.field2889[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2889[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2889[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2889[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3472(arg1, arg2, arg5, arg4, var8.field847);
            }
        } else if (arg5 == 9) {
            class78 var32;
            if (var8.field852 == -1 && var8.field846 == null) {
                var32 = var8.method656(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1607(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field850 != 0 && arg7 != null) {
                arg7.method3473(arg1, arg2, var9, var10, var8.field847);
            }
            if (var8.field853 != 16) {
                arg6.method1623(arg0, arg1, arg2, var8.field853);
            }
        } else if (arg5 == 4) {
            class78 var33;
            if (var8.field852 == -1 && var8.field846 == null) {
                var33 = var8.method656(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var33, (class78) null, field73[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1618(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class36.method2773(var35 >> 14 & 0x7FFF).field853;
            }
            class78 var36;
            if (var8.field852 == -1 && var8.field846 == null) {
                var36 = var8.method656(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var36, (class78) null, field73[arg4], 0, field82[arg4] * var34, field76[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1618(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class36.method2773(var38 >> 14 & 0x7FFF).field853 / 2;
            }
            class78 var39;
            if (var8.field852 == -1 && var8.field846 == null) {
                var39 = var8.method656(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var39, (class78) null, 256, arg4, field68[arg4] * var37, field78[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class78 var41;
            if (var8.field852 == -1 && var8.field846 == null) {
                var41 = var8.method656(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class11(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var41, (class78) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1618(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class36.method2773(var43 >> 14 & 0x7FFF).field853 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class78 var45;
            class78 var46;
            if (var8.field852 == -1 && var8.field846 == null) {
                var45 = var8.method656(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method656(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field852, true, (class78) null);
                var46 = new class11(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field852, true, (class78) null);
            }
            arg6.method1625(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field68[arg4] * var42, field78[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("o.y(IIII)I")
    public static int method147(int arg0, int arg1, int arg2) {
        if ((field66[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field66[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("s.w(IIII)I")
    public static final int method14(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2651(var3, var5);
        int var8 = method2651(var3 + 1, var5);
        int var9 = method2651(var3, var5 + 1);
        int var10 = method2651(var3 + 1, var5 + 1);
        int var11 = method577(var7, var8, var4, arg2);
        int var12 = method577(var9, var10, var4, arg2);
        return method577(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ar.x(IIIII)I")
    public static final int method577(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1484[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("er.k(III)I")
    public static final int method2651(int arg0, int arg1) {
        int var2 = method491(arg0 - 1, arg1 - 1) + method491(arg0 + 1, arg1 - 1) + method491(arg0 - 1, arg1 + 1) + method491(arg0 + 1, arg1 + 1);
        int var3 = method491(arg0 - 1, arg1) + method491(arg0 + 1, arg1) + method491(arg0, arg1 - 1) + method491(arg0, arg1 + 1);
        int var4 = method491(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("t.o(IIB)I")
    public static final int method491(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dc.a(IIB)I")
    public static final int method2422(int arg0, int arg1) {
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

    @ObfuscatedName("bp.f(III)I")
    public static final int method1327(int arg0, int arg1) {
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

    @ObfuscatedName("c.r(IIII)I")
    public static final int method495(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cg.e(III)Z")
    public static final boolean method2043(int arg0, int arg1) {
        class36 var2 = class36.method2773(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method654(arg1);
    }
}
