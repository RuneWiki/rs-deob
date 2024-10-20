package deob;

@ObfuscatedName("f")
public final class class6 {

    @ObfuscatedName("f.p")
    public static int[][][] field74 = new int[4][105][105];

    @ObfuscatedName("f.y")
    public static byte[][][] field70 = new byte[4][104][104];

    @ObfuscatedName("f.d")
    public static int field68 = 99;

    @ObfuscatedName("f.j")
    public static final int[] field73 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("f.a")
    public static final int[] field67 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("f.x")
    public static final int[] field75 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("f.n")
    public static final int[] field76 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("f.v")
    public static final int[] field77 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("f.l")
    public static final int[] field78 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("f.t")
    public static int field79 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("f.i")
    public static int field80 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.p(IIIIB)V")
    public static final void method599(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field82[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field74[0][var5][var4] = field74[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field74[0][var5][var4] = field74[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field74[0][var5][var4] = field74[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field74[0][var5][var4] = field74[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.y([BIIII[Lhx;I)V")
    public static final void method2364(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class211[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3026[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class110 var9 = new class110(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method593(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("af.c(Ldg;IIIIIII)V")
    public static final void method593(class110 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2309();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2309();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2309();
                }
            }
            return;
        }
        field70[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2309();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field74[0][arg2][arg3] = -method3178(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field74[arg1][arg2][arg3] = field74[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2309();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field74[0][arg2][arg3] = -var8 * 8;
                } else {
                    field74[arg1][arg2][arg3] = field74[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field69[arg1][arg2][arg3] = arg0.method2125();
                Statics.field1819[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1663[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field70[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field695[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("x.r([BIIS)Z")
    public static final boolean method519(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class110 var4 = new class110(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2137();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2137();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2309() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class37 var16 = class37.method2053(var5);
                        if (var13 != 22 || !client.field317 || var16.field849 != 0 || var16.field836 == 1 || var16.field853) {
                            if (!var16.method706()) {
                                client.field290++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2137();
                if (var9 == 0) {
                    break;
                }
                var4.method2309();
            }
        }
    }

    @ObfuscatedName("d.f([BIILcb;[Lhx;I)V")
    public static final void method20(byte[] arg0, int arg1, int arg2, class80 arg3, class211[] arg4) {
        class110 var5 = new class110(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2137();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2137();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2309();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field70[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class211 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2537(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("de.z([BIIIIIIILcb;[Lhx;I)V")
    public static final void method2067(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class80 arg8, class211[] arg9) {
        class110 var10 = new class110(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2137();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2137();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2309();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class37 var21 = class37.method2053(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field856;
                    int var27 = var21.field831;
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
                    int var32 = arg3 + class160.method2438(var16 & 0x7, var15 & 0x7, arg7, var21.field856, var21.field831, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field70[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class211 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method2537(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.o(IIIIIILcb;Lhx;I)V")
    public static final void method2537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class80 arg6, class211 arg7) {
        if (client.field317 && (field70[0][arg1][arg2] & 0x2) == 0) {
            if ((field70[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method502(arg0, arg1, arg2) != client.field287) {
                return;
            }
        }
        if (arg0 < field68) {
            field68 = arg0;
        }
        class37 var8 = class37.method2053(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field831;
            var10 = var8.field856;
        } else {
            var9 = var8.field856;
            var10 = var8.field831;
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
        int[][] var15 = field74[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field849 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field855 == 1) {
            var20 += 256;
        }
        if (var8.method679()) {
            class21 var21 = new class21();
            var21.field528 = arg0;
            var21.field529 = arg1 * 128;
            var21.field530 = arg2 * 128;
            int var22 = var8.field856;
            int var23 = var8.field831;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field831;
                var23 = var8.field856;
            }
            var21.field539 = (arg1 + var22) * 128;
            var21.field533 = (arg2 + var23) * 128;
            var21.field532 = var8.field859;
            var21.field527 = var8.field860 * 128;
            var21.field536 = var8.field861;
            var21.field537 = var8.field862;
            var21.field538 = var8.field863;
            if (var8.field828 != null) {
                var21.field535 = var8;
                var21.method512();
            }
            class21.field531.method3256(var21);
            if (var21.field538 != null) {
                var21.field544 = var21.field536 + (int) (Math.random() * (double) (var21.field537 - var21.field536));
            }
        }
        if (arg5 == 22) {
            if (!client.field317 || var8.field849 != 0 || var8.field836 == 1 || var8.field853) {
                class79 var24;
                if (var8.field817 == -1 && var8.field828 == null) {
                    var24 = var8.method675(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field817, true, (class79) null);
                }
                arg6.method1629(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field836 == 1 && arg7 != null) {
                    arg7.method3611(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class79 var47;
            if (var8.field817 == -1 && var8.field828 == null) {
                var47 = var8.method675(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            if (var47 != null && arg6.method1633(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field846) {
                int var48 = 15;
                if (var47 instanceof class99) {
                    var48 = ((class99) var47).method1998() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field82[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field82[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method3626(arg1, arg2, var9, var10, var8.field825);
            }
        } else if (arg5 >= 12) {
            class79 var25;
            if (var8.field817 == -1 && var8.field828 == null) {
                var25 = var8.method675(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1633(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field72[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method3626(arg1, arg2, var9, var10, var8.field825);
            }
        } else if (arg5 == 0) {
            class79 var26;
            if (var8.field817 == -1 && var8.field828 == null) {
                var26 = var8.method675(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1669(arg0, arg1, arg2, var16, var26, (class79) null, field73[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field846) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field837) {
                    Statics.field72[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field846) {
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field837) {
                    Statics.field72[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field846) {
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field837) {
                    Statics.field72[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field846) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field837) {
                    Statics.field72[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method3608(arg1, arg2, arg5, arg4, var8.field825);
            }
            if (var8.field839 != 16) {
                arg6.method1764(arg0, arg1, arg2, var8.field839);
            }
        } else if (arg5 == 1) {
            class79 var27;
            if (var8.field817 == -1 && var8.field828 == null) {
                var27 = var8.method675(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1669(arg0, arg1, arg2, var16, var27, (class79) null, field67[arg4], 0, var19, var20);
            if (var8.field846) {
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
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method3608(arg1, arg2, arg5, arg4, var8.field825);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class79 var29;
            class79 var30;
            if (var8.field817 == -1 && var8.field828 == null) {
                var29 = var8.method675(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method675(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field817, true, (class79) null);
                var30 = new class11(arg3, 2, var28, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1669(arg0, arg1, arg2, var16, var29, var30, field73[arg4], field73[var28], var19, var20);
            if (var8.field837) {
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
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method3608(arg1, arg2, arg5, arg4, var8.field825);
            }
            if (var8.field839 != 16) {
                arg6.method1764(arg0, arg1, arg2, var8.field839);
            }
        } else if (arg5 == 3) {
            class79 var31;
            if (var8.field817 == -1 && var8.field828 == null) {
                var31 = var8.method675(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1669(arg0, arg1, arg2, var16, var31, (class79) null, field67[arg4], 0, var19, var20);
            if (var8.field846) {
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
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method3608(arg1, arg2, arg5, arg4, var8.field825);
            }
        } else if (arg5 == 9) {
            class79 var32;
            if (var8.field817 == -1 && var8.field828 == null) {
                var32 = var8.method675(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1633(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method3626(arg1, arg2, var9, var10, var8.field825);
            }
            if (var8.field839 != 16) {
                arg6.method1764(arg0, arg1, arg2, var8.field839);
            }
        } else if (arg5 == 4) {
            class79 var33;
            if (var8.field817 == -1 && var8.field828 == null) {
                var33 = var8.method675(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1632(arg0, arg1, arg2, var16, var33, (class79) null, field73[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1788(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class37.method2053(var35 >> 14 & 0x7FFF).field839;
            }
            class79 var36;
            if (var8.field817 == -1 && var8.field828 == null) {
                var36 = var8.method675(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1632(arg0, arg1, arg2, var16, var36, (class79) null, field73[arg4], 0, field75[arg4] * var34, field76[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1788(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class37.method2053(var38 >> 14 & 0x7FFF).field839 / 2;
            }
            class79 var39;
            if (var8.field817 == -1 && var8.field828 == null) {
                var39 = var8.method675(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1632(arg0, arg1, arg2, var16, var39, (class79) null, 256, arg4, field77[arg4] * var37, field78[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class79 var41;
            if (var8.field817 == -1 && var8.field828 == null) {
                var41 = var8.method675(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class11(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1632(arg0, arg1, arg2, var16, var41, (class79) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1788(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class37.method2053(var43 >> 14 & 0x7FFF).field839 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class79 var45;
            class79 var46;
            if (var8.field817 == -1 && var8.field828 == null) {
                var45 = var8.method675(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method675(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field817, true, (class79) null);
                var46 = new class11(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field817, true, (class79) null);
            }
            arg6.method1632(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field77[arg4] * var42, field78[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("c.k(Lcb;[Lhx;I)V")
    public static final void method25(class80 arg0, class211[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field70[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field70[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3610(var3, var4);
                        }
                    }
                }
            }
        }
        field79 += (int) (Math.random() * 5.0D) - 2;
        if (field79 < -8) {
            field79 = -8;
        }
        if (field79 > 8) {
            field79 = 8;
        }
        field80 += (int) (Math.random() * 5.0D) - 2;
        if (field80 < -16) {
            field80 = -16;
        }
        if (field80 > 16) {
            field80 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field82[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field74[var6][var11 + 1][var10] - field74[var6][var11 - 1][var10];
                    int var13 = field74[var6][var11][var10 + 1] - field74[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field3036[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field766[var20] = 0;
                Statics.field2937[var20] = 0;
                Statics.field71[var20] = 0;
                Statics.field2124[var20] = 0;
                Statics.field1808[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field695[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class38 var26 = (class38) class38.field866.method3198((long) var25);
                            class38 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field867.method2811(1, var25);
                                class38 var29 = new class38();
                                if (var28 != null) {
                                    var29.method713(new class110(var28), var25);
                                }
                                var29.method712();
                                class38.field866.method3193(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field766[var22] += var27.field868;
                            Statics.field2937[var22] += var27.field876;
                            Statics.field71[var22] += var27.field869;
                            Statics.field2124[var22] += var27.field865;
                            var10002 = Statics.field1808[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field695[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class38 var34 = (class38) class38.field866.method3198((long) var33);
                            class38 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field867.method2811(1, var33);
                                class38 var37 = new class38();
                                if (var36 != null) {
                                    var37.method713(new class110(var36), var33);
                                }
                                var37.method712();
                                class38.field866.method3193(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field766[var22] -= var35.field868;
                            Statics.field2937[var22] -= var35.field876;
                            Statics.field71[var22] -= var35.field869;
                            Statics.field2124[var22] -= var35.field865;
                            var10002 = Statics.field1808[var22]--;
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
                            var39 += Statics.field766[var45];
                            var40 += Statics.field2937[var45];
                            var41 += Statics.field71[var45];
                            var42 += Statics.field2124[var45];
                            var43 += Statics.field1808[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field766[var46];
                            var40 -= Statics.field2937[var46];
                            var41 -= Statics.field71[var46];
                            var42 -= Statics.field2124[var46];
                            var43 -= Statics.field1808[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field317 || (field70[0][var21][var44] & 0x2) != 0 || (field70[var6][var21][var44] & 0x10) == 0 && method502(var6, var21, var44) == client.field287)) {
                            if (var6 < field68) {
                                field68 = var6;
                            }
                            int var47 = Statics.field695[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field69[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field74[var6][var21][var44];
                                int var50 = field74[var6][var21 + 1][var44];
                                int var51 = field74[var6][var21 + 1][var44 + 1];
                                int var52 = field74[var6][var21][var44 + 1];
                                int var53 = Statics.field3036[var21][var44];
                                int var54 = Statics.field3036[var21 + 1][var44];
                                int var55 = Statics.field3036[var21 + 1][var44 + 1];
                                int var56 = Statics.field3036[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method847(var59, var60, var61);
                                    int var62 = field79 + var59 & 0xFF;
                                    int var63 = field80 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method847(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field1819[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class42.method139(var48 - 1).field947) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field72[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class85.field1478[method2075(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1770(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method2075(var57, var53), method2075(var57, var54), method2075(var57, var55), method2075(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field1819[var6][var21][var44] + 1;
                                    byte var67 = Statics.field1663[var6][var21][var44];
                                    class42 var68 = class42.method139(var48 - 1);
                                    int var69 = var68.field941;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1479.method1870(var69);
                                        var71 = -1;
                                    } else if (var68.field940 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method847(var68.field944, var68.field938, var68.field946);
                                        int var72 = field79 + var68.field944 & 0xFF;
                                        int var73 = field80 + var68.field946;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method847(var72, var68.field938, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class85.field1478[method1986(var70, 96)];
                                    }
                                    if (var68.field945 != -1) {
                                        int var75 = field79 + var68.field943 & 0xFF;
                                        int var76 = field80 + var68.field949;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method847(var75, var68.field948, var76);
                                        var74 = class85.field1478[method1986(var77, 96)];
                                    }
                                    arg0.method1770(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method2075(var57, var53), method2075(var57, var54), method2075(var57, var55), method2075(var57, var56), method1986(var71, var53), method1986(var71, var54), method1986(var71, var55), method1986(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1627(var6, var79, var78, method502(var6, var79, var78));
                }
            }
            Statics.field695[var6] = (byte[][]) null;
            Statics.field69[var6] = (byte[][]) null;
            Statics.field1819[var6] = (byte[][]) null;
            Statics.field1663[var6] = (byte[][]) null;
            Statics.field82[var6] = (byte[][]) null;
        }
        arg0.method1654(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field70[1][var80][var81] & 0x2) == 2) {
                    arg0.method1625(var80, var81);
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
                        if ((Statics.field72[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field72[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field72[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label357: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field72[var91 - 1][var88][var93] & var82) == 0) {
                                        break label357;
                                    }
                                }
                                var91--;
                            }
                            label346: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field72[var92 + 1][var88][var94] & var82) == 0) {
                                        break label346;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field74[var92][var88][var89] - var96;
                                int var98 = field74[var91][var88][var89];
                                class80.method1626(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field72[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field72[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field72[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field72[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label410: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field72[var103 - 1][var105][var87] & var83) == 0) {
                                        break label410;
                                    }
                                }
                                var103--;
                            }
                            label399: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field72[var104 + 1][var106][var87] & var83) == 0) {
                                        break label399;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field74[var104][var101][var87] - var108;
                                int var110 = field74[var103][var101][var87];
                                class80.method1626(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field72[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field72[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field72[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field72[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label463: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field72[var86][var113 - 1][var117] & var84) == 0) {
                                        break label463;
                                    }
                                }
                                var113--;
                            }
                            label452: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field72[var86][var114 + 1][var118] & var84) == 0) {
                                        break label452;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field74[var86][var113][var115];
                                class80.method1626(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field72[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.s(IIII)I")
    public static int method502(int arg0, int arg1, int arg2) {
        if ((field70[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field70[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fw.h(IIB)I")
    public static final int method3178(int arg0, int arg1) {
        int var2 = method94(arg0 + 45365, arg1 + 91923, 4) - 128 + (method94(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method94(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("o.m(IIII)I")
    public static final int method94(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method27(var3, var5);
        int var8 = method27(var3 + 1, var5);
        int var9 = method27(var3, var5 + 1);
        int var10 = method27(var3 + 1, var5 + 1);
        int var11 = method611(var7, var8, var4, arg2);
        int var12 = method611(var9, var10, var4, arg2);
        return method611(var11, var12, var6, arg2);
    }

    @ObfuscatedName("al.w(IIIIB)I")
    public static final int method611(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1483[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("r.q(IIS)I")
    public static final int method27(int arg0, int arg1) {
        int var2 = method548(arg0 - 1, arg1 - 1) + method548(arg0 + 1, arg1 - 1) + method548(arg0 - 1, arg1 + 1) + method548(arg0 + 1, arg1 + 1);
        int var3 = method548(arg0 - 1, arg1) + method548(arg0 + 1, arg1) + method548(arg0, arg1 - 1) + method548(arg0, arg1 + 1);
        int var4 = method548(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("t.u(III)I")
    public static final int method548(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("da.e(IIB)I")
    public static final int method2075(int arg0, int arg1) {
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

    @ObfuscatedName("cw.b(III)I")
    public static final int method1986(int arg0, int arg1) {
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

    @ObfuscatedName("an.g(IIIB)I")
    public static final int method847(int arg0, int arg1, int arg2) {
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
