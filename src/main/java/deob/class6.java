package deob;

@ObfuscatedName("c")
public final class class6 {

    @ObfuscatedName("c.l")
    public static int[][][] field76 = new int[4][105][105];

    @ObfuscatedName("c.y")
    public static byte[][][] field70 = new byte[4][104][104];

    @ObfuscatedName("c.g")
    public static int field72 = 99;

    @ObfuscatedName("c.i")
    public static final int[] field78 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("c.e")
    public static final int[] field82 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("c.h")
    public static final int[] field80 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("c.k")
    public static final int[] field81 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("c.v")
    public static final int[] field71 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("c.m")
    public static final int[] field83 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("c.d")
    public static int field84 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("c.q")
    public static int field85 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.l(B)V")
    public static void method36() {
        field72 = 99;
        Statics.field73 = new byte[4][104][104];
        Statics.field74 = new byte[4][104][104];
        Statics.field75 = new byte[4][104][104];
        Statics.field1871 = new byte[4][104][104];
        Statics.field9 = new int[4][105][105];
        Statics.field1885 = new byte[4][105][105];
        Statics.field2820 = new int[105][105];
        Statics.field77 = new int[104];
        Statics.field602 = new int[104];
        Statics.field1261 = new int[104];
        Statics.field2705 = new int[104];
        Statics.field994 = new int[104];
    }

    @ObfuscatedName("ep.y(I)V")
    public static void method2936() {
        Statics.field73 = (byte[][][]) null;
        Statics.field74 = (byte[][][]) null;
        Statics.field75 = (byte[][][]) null;
        Statics.field1871 = (byte[][][]) null;
        Statics.field9 = (int[][][]) null;
        Statics.field1885 = (byte[][][]) null;
        Statics.field2820 = (int[][]) null;
        Statics.field77 = null;
        Statics.field602 = null;
        Statics.field1261 = null;
        Statics.field2705 = null;
        Statics.field994 = null;
    }

    @ObfuscatedName("cp.g(IIIIB)V")
    public static final void method1781(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1885[0][var5][var4] = 127;
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

    @ObfuscatedName("i.j([BIIII[Lhr;I)V")
    public static final void method465(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class209[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2997[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class108 var9 = new class108(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method495(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ac.w(IIII)V")
    public static final void method991(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("k.c(Ldk;IIIIIII)V")
    public static final void method495(class108 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2291();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2291();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2291();
                }
            }
            return;
        }
        field70[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2291();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field76[0][arg2][arg3] = -method1878(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field76[arg1][arg2][arg3] = field76[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2291();
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
                Statics.field74[arg1][arg2][arg3] = arg0.method2292();
                Statics.field75[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1871[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field70[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field73[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("p.x([BIII)Z")
    public static final boolean method141(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class108 var4 = new class108(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2173();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2173();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2291() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class37 var16 = class37.method826(var5);
                        if (var13 != 22 || !client.field242 || var16.field835 != 0 || var16.field847 == 1 || var16.field844) {
                            if (!var16.method670()) {
                                client.field282++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2173();
                if (var9 == 0) {
                    break;
                }
                var4.method2291();
            }
        }
    }

    @ObfuscatedName("fb.f(IIIIIILcd;Lhr;I)V")
    public static final void method3209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class80 arg6, class209 arg7) {
        if (client.field242 && (field70[0][arg1][arg2] & 0x2) == 0) {
            if ((field70[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method33(arg0, arg1, arg2) != client.field289) {
                return;
            }
        }
        if (arg0 < field72) {
            field72 = arg0;
        }
        class37 var8 = class37.method826(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field869;
            var10 = var8.field845;
        } else {
            var9 = var8.field845;
            var10 = var8.field869;
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
        if (var8.field835 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field878 == 1) {
            var20 += 256;
        }
        if (var8.method663()) {
            class21.method2956(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field242 || var8.field835 != 0 || var8.field847 == 1 || var8.field844) {
                class79 var21;
                if (var8.field853 == -1 && var8.field857 == null) {
                    var21 = var8.method658(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field853, true, (class79) null);
                }
                arg6.method1621(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field847 == 1 && arg7 != null) {
                    arg7.method3664(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class79 var44;
            if (var8.field853 == -1 && var8.field857 == null) {
                var44 = var8.method658(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            if (var44 != null && arg6.method1682(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field861) {
                int var45 = 15;
                if (var44 instanceof class99) {
                    var45 = ((class99) var44).method2046() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field1885[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field1885[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field847 != 0 && arg7 != null) {
                arg7.method3636(arg1, arg2, var9, var10, var8.field848);
            }
        } else if (arg5 >= 12) {
            class79 var22;
            if (var8.field853 == -1 && var8.field857 == null) {
                var22 = var8.method658(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1682(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field9[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field847 != 0 && arg7 != null) {
                arg7.method3636(arg1, arg2, var9, var10, var8.field848);
            }
        } else if (arg5 == 0) {
            class79 var23;
            if (var8.field853 == -1 && var8.field857 == null) {
                var23 = var8.method658(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, var23, (class79) null, field78[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field861) {
                    Statics.field1885[arg0][arg1][arg2] = 50;
                    Statics.field1885[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field852) {
                    Statics.field9[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field861) {
                    Statics.field1885[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1885[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field852) {
                    Statics.field9[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field861) {
                    Statics.field1885[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1885[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field852) {
                    Statics.field9[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field861) {
                    Statics.field1885[arg0][arg1][arg2] = 50;
                    Statics.field1885[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field852) {
                    Statics.field9[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field847 != 0 && arg7 != null) {
                arg7.method3635(arg1, arg2, arg5, arg4, var8.field848);
            }
            if (var8.field870 != 16) {
                arg6.method1636(arg0, arg1, arg2, var8.field870);
            }
        } else if (arg5 == 1) {
            class79 var24;
            if (var8.field853 == -1 && var8.field857 == null) {
                var24 = var8.method658(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, var24, (class79) null, field82[arg4], 0, var19, var20);
            if (var8.field861) {
                if (arg4 == 0) {
                    Statics.field1885[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1885[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1885[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1885[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field847 != 0 && arg7 != null) {
                arg7.method3635(arg1, arg2, arg5, arg4, var8.field848);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class79 var26;
            class79 var27;
            if (var8.field853 == -1 && var8.field857 == null) {
                var26 = var8.method658(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method658(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field853, true, (class79) null);
                var27 = new class11(arg3, 2, var25, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, var26, var27, field78[arg4], field78[var25], var19, var20);
            if (var8.field852) {
                if (arg4 == 0) {
                    Statics.field9[arg0][arg1][arg2] |= 0x249;
                    Statics.field9[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field9[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field9[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field9[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field9[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field9[arg0][arg1][arg2] |= 0x492;
                    Statics.field9[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field847 != 0 && arg7 != null) {
                arg7.method3635(arg1, arg2, arg5, arg4, var8.field848);
            }
            if (var8.field870 != 16) {
                arg6.method1636(arg0, arg1, arg2, var8.field870);
            }
        } else if (arg5 == 3) {
            class79 var28;
            if (var8.field853 == -1 && var8.field857 == null) {
                var28 = var8.method658(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1623(arg0, arg1, arg2, var16, var28, (class79) null, field82[arg4], 0, var19, var20);
            if (var8.field861) {
                if (arg4 == 0) {
                    Statics.field1885[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1885[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1885[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1885[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field847 != 0 && arg7 != null) {
                arg7.method3635(arg1, arg2, arg5, arg4, var8.field848);
            }
        } else if (arg5 == 9) {
            class79 var29;
            if (var8.field853 == -1 && var8.field857 == null) {
                var29 = var8.method658(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1682(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field847 != 0 && arg7 != null) {
                arg7.method3636(arg1, arg2, var9, var10, var8.field848);
            }
            if (var8.field870 != 16) {
                arg6.method1636(arg0, arg1, arg2, var8.field870);
            }
        } else if (arg5 == 4) {
            class79 var30;
            if (var8.field853 == -1 && var8.field857 == null) {
                var30 = var8.method658(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1624(arg0, arg1, arg2, var16, var30, (class79) null, field78[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1641(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class37.method826(var32 >> 14 & 0x7FFF).field870;
            }
            class79 var33;
            if (var8.field853 == -1 && var8.field857 == null) {
                var33 = var8.method658(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1624(arg0, arg1, arg2, var16, var33, (class79) null, field78[arg4], 0, field80[arg4] * var31, field81[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1641(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class37.method826(var35 >> 14 & 0x7FFF).field870 / 2;
            }
            class79 var36;
            if (var8.field853 == -1 && var8.field857 == null) {
                var36 = var8.method658(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1624(arg0, arg1, arg2, var16, var36, (class79) null, 256, arg4, field71[arg4] * var34, field83[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class79 var38;
            if (var8.field853 == -1 && var8.field857 == null) {
                var38 = var8.method658(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class11(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1624(arg0, arg1, arg2, var16, var38, (class79) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1641(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class37.method826(var40 >> 14 & 0x7FFF).field870 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class79 var42;
            class79 var43;
            if (var8.field853 == -1 && var8.field857 == null) {
                var42 = var8.method658(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method658(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field853, true, (class79) null);
                var43 = new class11(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field853, true, (class79) null);
            }
            arg6.method1624(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field71[arg4] * var39, field83[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ab.t(Lcd;[Lhr;I)V")
    public static final void method901(class80 arg0, class209[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field70[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field70[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3637(var3, var4);
                        }
                    }
                }
            }
        }
        field84 += (int) (Math.random() * 5.0D) - 2;
        if (field84 < -8) {
            field84 = -8;
        }
        if (field84 > 8) {
            field84 = 8;
        }
        field85 += (int) (Math.random() * 5.0D) - 2;
        if (field85 < -16) {
            field85 = -16;
        }
        if (field85 > 16) {
            field85 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1885[var6];
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
                    Statics.field2820[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field77[var20] = 0;
                Statics.field602[var20] = 0;
                Statics.field1261[var20] = 0;
                Statics.field2705[var20] = 0;
                Statics.field994[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field73[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class38 var26 = (class38) class38.field882.method3225((long) var25);
                            class38 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field896.method2752(1, var25);
                                class38 var29 = new class38();
                                if (var28 != null) {
                                    var29.method694(new class108(var28), var25);
                                }
                                var29.method693();
                                class38.field882.method3211(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field77[var22] += var27.field884;
                            Statics.field602[var22] += var27.field889;
                            Statics.field1261[var22] += var27.field886;
                            Statics.field2705[var22] += var27.field887;
                            var10002 = Statics.field994[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field73[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class38 var34 = (class38) class38.field882.method3225((long) var33);
                            class38 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field896.method2752(1, var33);
                                class38 var37 = new class38();
                                if (var36 != null) {
                                    var37.method694(new class108(var36), var33);
                                }
                                var37.method693();
                                class38.field882.method3211(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field77[var22] -= var35.field884;
                            Statics.field602[var22] -= var35.field889;
                            Statics.field1261[var22] -= var35.field886;
                            Statics.field2705[var22] -= var35.field887;
                            var10002 = Statics.field994[var22]--;
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
                            var39 += Statics.field77[var45];
                            var40 += Statics.field602[var45];
                            var41 += Statics.field1261[var45];
                            var42 += Statics.field2705[var45];
                            var43 += Statics.field994[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field77[var46];
                            var40 -= Statics.field602[var46];
                            var41 -= Statics.field1261[var46];
                            var42 -= Statics.field2705[var46];
                            var43 -= Statics.field994[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field242 || (field70[0][var21][var44] & 0x2) != 0 || (field70[var6][var21][var44] & 0x10) == 0 && method33(var6, var21, var44) == client.field289)) {
                            if (var6 < field72) {
                                field72 = var6;
                            }
                            int var47 = Statics.field73[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field74[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field76[var6][var21][var44];
                                int var50 = field76[var6][var21 + 1][var44];
                                int var51 = field76[var6][var21 + 1][var44 + 1];
                                int var52 = field76[var6][var21][var44 + 1];
                                int var53 = Statics.field2820[var21][var44];
                                int var54 = Statics.field2820[var21 + 1][var44];
                                int var55 = Statics.field2820[var21 + 1][var44 + 1];
                                int var56 = Statics.field2820[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method1614(var59, var60, var61);
                                    int var62 = field84 + var59 & 0xFF;
                                    int var63 = field85 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method1614(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field75[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class42 var66 = (class42) class42.field958.method3225((long) var65);
                                        class42 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field971.method2752(4, var65);
                                            class42 var69 = new class42();
                                            if (var68 != null) {
                                                var69.method798(new class108(var68), var65);
                                            }
                                            var69.method797();
                                            class42.field958.method3211(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field969) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field9[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class85.field1451[method1866(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1648(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1866(var57, var53), method1866(var57, var54), method1866(var57, var55), method1866(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field75[var6][var21][var44] + 1;
                                    byte var72 = Statics.field1871[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class42 var74 = (class42) class42.field958.method3225((long) var73);
                                    class42 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field971.method2752(4, var73);
                                        class42 var77 = new class42();
                                        if (var76 != null) {
                                            var77.method798(new class108(var76), var73);
                                        }
                                        var77.method797();
                                        class42.field958.method3211(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field960;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1465.method1858(var79);
                                        var81 = -1;
                                    } else if (var75.field959 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method1614(var75.field961, var75.field964, var75.field965);
                                        int var82 = field84 + var75.field961 & 0xFF;
                                        int var83 = field85 + var75.field965;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method1614(var82, var75.field964, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class85.field1451[method2727(var80, 96)];
                                    }
                                    if (var75.field962 != -1) {
                                        int var85 = field84 + var75.field966 & 0xFF;
                                        int var86 = field85 + var75.field968;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method1614(var85, var75.field967, var86);
                                        var84 = class85.field1451[method2727(var87, 96)];
                                    }
                                    arg0.method1648(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method1866(var57, var53), method1866(var57, var54), method1866(var57, var55), method1866(var57, var56), method2727(var81, var53), method2727(var81, var54), method2727(var81, var55), method2727(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method1631(var6, var89, var88, method33(var6, var89, var88));
                }
            }
            Statics.field73[var6] = (byte[][]) null;
            Statics.field74[var6] = (byte[][]) null;
            Statics.field75[var6] = (byte[][]) null;
            Statics.field1871[var6] = (byte[][]) null;
            Statics.field1885[var6] = (byte[][]) null;
        }
        arg0.method1646(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field70[1][var90][var91] & 0x2) == 2) {
                    arg0.method1618(var90, var91);
                }
            }
        }
        int var92 = 1;
        int var93 = 2;
        int var94 = 4;
        for (int var95 = 0; var95 < 4; var95++) {
            if (var95 > 0) {
                var92 <<= 0x3;
                var93 <<= 0x3;
                var94 <<= 0x3;
            }
            for (int var96 = 0; var96 <= var95; var96++) {
                for (int var97 = 0; var97 <= 104; var97++) {
                    for (int var98 = 0; var98 <= 104; var98++) {
                        if ((Statics.field9[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field9[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field9[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label375: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field9[var101 - 1][var98][var103] & var92) == 0) {
                                        break label375;
                                    }
                                }
                                var101--;
                            }
                            label364: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field9[var102 + 1][var98][var104] & var92) == 0) {
                                        break label364;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field76[var102][var98][var99] - var106;
                                int var108 = field76[var101][var98][var99];
                                class80.method1635(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field9[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field9[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field9[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field9[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label428: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field9[var113 - 1][var115][var97] & var93) == 0) {
                                        break label428;
                                    }
                                }
                                var113--;
                            }
                            label417: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field9[var114 + 1][var116][var97] & var93) == 0) {
                                        break label417;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field76[var114][var111][var97] - var118;
                                int var120 = field76[var113][var111][var97];
                                class80.method1635(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field9[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field9[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field9[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field9[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label481: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field9[var96][var123 - 1][var127] & var94) == 0) {
                                        break label481;
                                    }
                                }
                                var123--;
                            }
                            label470: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field9[var96][var124 + 1][var128] & var94) == 0) {
                                        break label470;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field76[var96][var123][var125];
                                class80.method1635(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field9[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.n(IIII)I")
    public static int method33(int arg0, int arg1, int arg2) {
        if ((field70[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field70[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cn.p(IIB)I")
    public static final int method1878(int arg0, int arg1) {
        int var2 = method1998(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1998(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1998(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("cx.a(IIIB)I")
    public static final int method1998(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method157(var3, var5);
        int var8 = method157(var3 + 1, var5);
        int var9 = method157(var3, var5 + 1);
        int var10 = method157(var3 + 1, var5 + 1);
        int var11 = method622(var7, var8, var4, arg2);
        int var12 = method622(var9, var10, var4, arg2);
        return method622(var11, var12, var6, arg2);
    }

    @ObfuscatedName("au.o(IIIII)I")
    public static final int method622(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class85.field1469[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("b.b(III)I")
    public static final int method157(int arg0, int arg1) {
        int var2 = method1384(arg0 - 1, arg1 - 1) + method1384(arg0 + 1, arg1 - 1) + method1384(arg0 - 1, arg1 + 1) + method1384(arg0 + 1, arg1 + 1);
        int var3 = method1384(arg0 - 1, arg1) + method1384(arg0 + 1, arg1) + method1384(arg0, arg1 - 1) + method1384(arg0, arg1 + 1);
        int var4 = method1384(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bu.r(III)I")
    public static final int method1384(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cf.z(IIB)I")
    public static final int method1866(int arg0, int arg1) {
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

    @ObfuscatedName("ez.u(IIB)I")
    public static final int method2727(int arg0, int arg1) {
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

    @ObfuscatedName("cc.s(IIIB)I")
    public static final int method1614(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("db.i(III)Z")
    public static final boolean method2403(int arg0, int arg1) {
        class37 var2 = class37.method826(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method656(arg1);
    }

    @ObfuscatedName("cr.e(IIIIIIILcd;Lhr;I)V")
    public static final void method1989(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class80 arg7, class209 arg8) {
        class37 var9 = class37.method826(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field869;
            var11 = var9.field845;
        } else {
            var10 = var9.field845;
            var11 = var9.field869;
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
        if (var9.field835 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field878 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class79 var22;
            if (var9.field853 == -1 && var9.field857 == null) {
                var22 = var9.method659(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class11(arg4, 22, arg5, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1621(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field847 == 1) {
                arg8.method3664(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class79 var45;
            if (var9.field853 == -1 && var9.field857 == null) {
                var45 = var9.method659(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg4, 10, arg5, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            if (var45 != null) {
                arg7.method1682(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field847 != 0) {
                arg8.method3636(arg2, arg3, var10, var11, var9.field848);
            }
        } else if (arg6 >= 12) {
            class79 var23;
            if (var9.field853 == -1 && var9.field857 == null) {
                var23 = var9.method659(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1682(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field847 != 0) {
                arg8.method3636(arg2, arg3, var10, var11, var9.field848);
            }
        } else if (arg6 == 0) {
            class79 var24;
            if (var9.field853 == -1 && var9.field857 == null) {
                var24 = var9.method659(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg4, 0, arg5, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1623(arg0, arg2, arg3, var17, var24, (class79) null, field78[arg5], 0, var20, var21);
            if (var9.field847 != 0) {
                arg8.method3635(arg2, arg3, arg6, arg5, var9.field848);
            }
        } else if (arg6 == 1) {
            class79 var25;
            if (var9.field853 == -1 && var9.field857 == null) {
                var25 = var9.method659(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg4, 1, arg5, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1623(arg0, arg2, arg3, var17, var25, (class79) null, field82[arg5], 0, var20, var21);
            if (var9.field847 != 0) {
                arg8.method3635(arg2, arg3, arg6, arg5, var9.field848);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class79 var27;
            class79 var28;
            if (var9.field853 == -1 && var9.field857 == null) {
                var27 = var9.method659(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method659(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field853, true, (class79) null);
                var28 = new class11(arg4, 2, var26, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1623(arg0, arg2, arg3, var17, var27, var28, field78[arg5], field78[var26], var20, var21);
            if (var9.field847 != 0) {
                arg8.method3635(arg2, arg3, arg6, arg5, var9.field848);
            }
        } else if (arg6 == 3) {
            class79 var29;
            if (var9.field853 == -1 && var9.field857 == null) {
                var29 = var9.method659(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg4, 3, arg5, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1623(arg0, arg2, arg3, var17, var29, (class79) null, field82[arg5], 0, var20, var21);
            if (var9.field847 != 0) {
                arg8.method3635(arg2, arg3, arg6, arg5, var9.field848);
            }
        } else if (arg6 == 9) {
            class79 var30;
            if (var9.field853 == -1 && var9.field857 == null) {
                var30 = var9.method659(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1682(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field847 != 0) {
                arg8.method3636(arg2, arg3, var10, var11, var9.field848);
            }
        } else if (arg6 == 4) {
            class79 var31;
            if (var9.field853 == -1 && var9.field857 == null) {
                var31 = var9.method659(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1624(arg0, arg2, arg3, var17, var31, (class79) null, field78[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1641(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class37.method826(var33 >> 14 & 0x7FFF).field870;
            }
            class79 var34;
            if (var9.field853 == -1 && var9.field857 == null) {
                var34 = var9.method659(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1624(arg0, arg2, arg3, var17, var34, (class79) null, field78[arg5], 0, field80[arg5] * var32, field81[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1641(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class37.method826(var36 >> 14 & 0x7FFF).field870 / 2;
            }
            class79 var37;
            if (var9.field853 == -1 && var9.field857 == null) {
                var37 = var9.method659(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1624(arg0, arg2, arg3, var17, var37, (class79) null, 256, arg5, field71[arg5] * var35, field83[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class79 var39;
            if (var9.field853 == -1 && var9.field857 == null) {
                var39 = var9.method659(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1624(arg0, arg2, arg3, var17, var39, (class79) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1641(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class37.method826(var41 >> 14 & 0x7FFF).field870 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class79 var43;
            class79 var44;
            if (var9.field853 == -1 && var9.field857 == null) {
                var43 = var9.method659(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method659(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field853, true, (class79) null);
                var44 = new class11(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field853, true, (class79) null);
            }
            arg7.method1624(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field71[arg5] * var40, field83[arg5] * var40, var20, var21);
        }
    }
}
