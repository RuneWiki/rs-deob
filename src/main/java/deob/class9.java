package deob;

@ObfuscatedName("j")
public final class class9 {

    @ObfuscatedName("j.y")
    public static int[][][] field120 = new int[4][105][105];

    @ObfuscatedName("j.m")
    public static byte[][][] field133 = new byte[4][104][104];

    @ObfuscatedName("j.d")
    public static int field122 = 99;

    @ObfuscatedName("j.u")
    public static final int[] field121 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("j.z")
    public static final int[] field131 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("j.v")
    public static final int[] field132 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("j.w")
    public static final int[] field125 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("j.h")
    public static final int[] field134 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("j.q")
    public static final int[] field135 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("j.g")
    public static int field126 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("j.e")
    public static int field137 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.y(B)V")
    public static void method2702() {
        field122 = 99;
        Statics.field123 = new byte[4][104][104];
        Statics.field124 = new byte[4][104][104];
        Statics.field130 = new byte[4][104][104];
        Statics.field139 = new byte[4][104][104];
        Statics.field1822 = new int[4][105][105];
        Statics.field127 = new byte[4][105][105];
        Statics.field109 = new int[105][105];
        Statics.field128 = new int[104];
        Statics.field129 = new int[104];
        Statics.field2784 = new int[104];
        Statics.field259 = new int[104];
        Statics.field2029 = new int[104];
    }

    @ObfuscatedName("i.m(IIIII)V")
    public static final void method119(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field127[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field120[0][var5][var4] = field120[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field120[0][var5][var4] = field120[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field120[0][var5][var4] = field120[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field120[0][var5][var4] = field120[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.d(IIII)V")
    public static final void method691(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field120[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field120[arg0][arg1][arg2 + var5] = field120[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field120[arg0][arg1 + var6][arg2] = field120[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field120[arg0][arg1 - 1][arg2] != 0) {
            field120[arg0][arg1][arg2] = field120[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field120[arg0][arg1][arg2 - 1] != 0) {
            field120[arg0][arg1][arg2] = field120[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field120[arg0][arg1 - 1][arg2 - 1] != 0) {
            field120[arg0][arg1][arg2] = field120[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("m.n([BIILce;[Lfw;I)V")
    public static final void method17(byte[] arg0, int arg1, int arg2, class95 arg3, class164[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2637();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2637();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2534();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field133[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class164 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method512(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("client.s(IIIIIILce;Lfw;I)V")
    public static final void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field463 && (field133[0][arg1][arg2] & 0x2) == 0) {
            if ((field133[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method920(arg0, arg1, arg2) != client.field512) {
                return;
            }
        }
        if (arg0 < field122) {
            field122 = arg0;
        }
        class32 var8 = class32.method211(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field812;
            var10 = var8.field811;
        } else {
            var9 = var8.field811;
            var10 = var8.field812;
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
        int[][] var15 = field120[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field815 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field837 == 1) {
            var20 += 256;
        }
        if (var8.method671()) {
            class7 var21 = new class7();
            var21.field88 = arg0;
            var21.field89 = arg1 * 128;
            var21.field91 = arg2 * 128;
            int var22 = var8.field811;
            int var23 = var8.field812;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field812;
                var23 = var8.field811;
            }
            var21.field97 = (arg1 + var22) * 128;
            var21.field96 = (arg2 + var23) * 128;
            var21.field94 = var8.field841;
            var21.field92 = var8.field842 * 128;
            var21.field95 = var8.field843;
            var21.field100 = var8.field844;
            var21.field98 = var8.field808;
            if (var8.field838 != null) {
                var21.field101 = var8;
                var21.method43();
            }
            class7.field103.method3350(var21);
            if (var21.field98 != null) {
                var21.field99 = var21.field95 + (int) (Math.random() * (double) (var21.field100 - var21.field95));
            }
        }
        if (arg5 == 22) {
            if (!client.field463 || var8.field815 != 0 || var8.field831 == 1 || var8.field835) {
                class94 var24;
                if (var8.field816 == -1 && var8.field838 == null) {
                    var24 = var8.method638(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field816, true, (class94) null);
                }
                arg6.method1887(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field831 == 1 && arg7 != null) {
                    arg7.method3235(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var47;
            if (var8.field816 == -1 && var8.field838 == null) {
                var47 = var8.method638(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            if (var47 != null && arg6.method1954(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field820) {
                int var48 = 15;
                if (var47 instanceof class112) {
                    var48 = ((class112) var47).method2250() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field127[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field127[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method3231(arg1, arg2, var9, var10, var8.field802);
            }
        } else if (arg5 >= 12) {
            class94 var25;
            if (var8.field816 == -1 && var8.field838 == null) {
                var25 = var8.method638(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1954(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1822[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method3231(arg1, arg2, var9, var10, var8.field802);
            }
        } else if (arg5 == 0) {
            class94 var26;
            if (var8.field816 == -1 && var8.field838 == null) {
                var26 = var8.method638(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1891(arg0, arg1, arg2, var16, var26, (class94) null, field121[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field820) {
                    Statics.field127[arg0][arg1][arg2] = 50;
                    Statics.field127[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field797) {
                    Statics.field1822[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field820) {
                    Statics.field127[arg0][arg1][arg2 + 1] = 50;
                    Statics.field127[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field797) {
                    Statics.field1822[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field820) {
                    Statics.field127[arg0][arg1 + 1][arg2] = 50;
                    Statics.field127[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field797) {
                    Statics.field1822[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field820) {
                    Statics.field127[arg0][arg1][arg2] = 50;
                    Statics.field127[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field797) {
                    Statics.field1822[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method3232(arg1, arg2, arg5, arg4, var8.field802);
            }
            if (var8.field814 != 16) {
                arg6.method1899(arg0, arg1, arg2, var8.field814);
            }
        } else if (arg5 == 1) {
            class94 var27;
            if (var8.field816 == -1 && var8.field838 == null) {
                var27 = var8.method638(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1891(arg0, arg1, arg2, var16, var27, (class94) null, field131[arg4], 0, var19, var20);
            if (var8.field820) {
                if (arg4 == 0) {
                    Statics.field127[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field127[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field127[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field127[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method3232(arg1, arg2, arg5, arg4, var8.field802);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class94 var29;
            class94 var30;
            if (var8.field816 == -1 && var8.field838 == null) {
                var29 = var8.method638(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method638(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field816, true, (class94) null);
                var30 = new class14(arg3, 2, var28, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1891(arg0, arg1, arg2, var16, var29, var30, field121[arg4], field121[var28], var19, var20);
            if (var8.field797) {
                if (arg4 == 0) {
                    Statics.field1822[arg0][arg1][arg2] |= 0x249;
                    Statics.field1822[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1822[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1822[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1822[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1822[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1822[arg0][arg1][arg2] |= 0x492;
                    Statics.field1822[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method3232(arg1, arg2, arg5, arg4, var8.field802);
            }
            if (var8.field814 != 16) {
                arg6.method1899(arg0, arg1, arg2, var8.field814);
            }
        } else if (arg5 == 3) {
            class94 var31;
            if (var8.field816 == -1 && var8.field838 == null) {
                var31 = var8.method638(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1891(arg0, arg1, arg2, var16, var31, (class94) null, field131[arg4], 0, var19, var20);
            if (var8.field820) {
                if (arg4 == 0) {
                    Statics.field127[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field127[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field127[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field127[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method3232(arg1, arg2, arg5, arg4, var8.field802);
            }
        } else if (arg5 == 9) {
            class94 var32;
            if (var8.field816 == -1 && var8.field838 == null) {
                var32 = var8.method638(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1954(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method3231(arg1, arg2, var9, var10, var8.field802);
            }
            if (var8.field814 != 16) {
                arg6.method1899(arg0, arg1, arg2, var8.field814);
            }
        } else if (arg5 == 4) {
            class94 var33;
            if (var8.field816 == -1 && var8.field838 == null) {
                var33 = var8.method638(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1924(arg0, arg1, arg2, var16, var33, (class94) null, field121[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1909(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class32.method211(var35 >> 14 & 0x7FFF).field814;
            }
            class94 var36;
            if (var8.field816 == -1 && var8.field838 == null) {
                var36 = var8.method638(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1924(arg0, arg1, arg2, var16, var36, (class94) null, field121[arg4], 0, field132[arg4] * var34, field125[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1909(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class32.method211(var38 >> 14 & 0x7FFF).field814 / 2;
            }
            class94 var39;
            if (var8.field816 == -1 && var8.field838 == null) {
                var39 = var8.method638(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1924(arg0, arg1, arg2, var16, var39, (class94) null, 256, arg4, field134[arg4] * var37, field135[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class94 var41;
            if (var8.field816 == -1 && var8.field838 == null) {
                var41 = var8.method638(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class14(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1924(arg0, arg1, arg2, var16, var41, (class94) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1909(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class32.method211(var43 >> 14 & 0x7FFF).field814 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class94 var45;
            class94 var46;
            if (var8.field816 == -1 && var8.field838 == null) {
                var45 = var8.method638(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method638(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field816, true, (class94) null);
                var46 = new class14(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field816, true, (class94) null);
            }
            arg6.method1924(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field134[arg4] * var42, field135[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("t.x(Lce;[Lfw;I)V")
    public static final void method148(class95 arg0, class164[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field133[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field133[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3250(var3, var4);
                        }
                    }
                }
            }
        }
        field126 += (int) (Math.random() * 5.0D) - 2;
        if (field126 < -8) {
            field126 = -8;
        }
        if (field126 > 8) {
            field126 = 8;
        }
        field137 += (int) (Math.random() * 5.0D) - 2;
        if (field137 < -16) {
            field137 = -16;
        }
        if (field137 > 16) {
            field137 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field127[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field120[var6][var11 + 1][var10] - field120[var6][var11 - 1][var10];
                    int var13 = field120[var6][var11][var10 + 1] - field120[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field109[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field128[var20] = 0;
                Statics.field129[var20] = 0;
                Statics.field2784[var20] = 0;
                Statics.field259[var20] = 0;
                Statics.field2029[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field123[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class33 var26 = (class33) class33.field855.method3288((long) var25);
                            class33 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field853.method2991(1, var25);
                                class33 var29 = new class33();
                                if (var28 != null) {
                                    var29.method690(new class127(var28), var25);
                                }
                                var29.method689();
                                class33.field855.method3291(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field128[var22] += var27.field851;
                            Statics.field129[var22] += var27.field852;
                            Statics.field2784[var22] += var27.field849;
                            Statics.field259[var22] += var27.field848;
                            var10002 = Statics.field2029[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field123[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class33 var34 = (class33) class33.field855.method3288((long) var33);
                            class33 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field853.method2991(1, var33);
                                class33 var37 = new class33();
                                if (var36 != null) {
                                    var37.method690(new class127(var36), var33);
                                }
                                var37.method689();
                                class33.field855.method3291(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field128[var22] -= var35.field851;
                            Statics.field129[var22] -= var35.field852;
                            Statics.field2784[var22] -= var35.field849;
                            Statics.field259[var22] -= var35.field848;
                            var10002 = Statics.field2029[var22]--;
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
                            var39 += Statics.field128[var45];
                            var40 += Statics.field129[var45];
                            var41 += Statics.field2784[var45];
                            var42 += Statics.field259[var45];
                            var43 += Statics.field2029[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field128[var46];
                            var40 -= Statics.field129[var46];
                            var41 -= Statics.field2784[var46];
                            var42 -= Statics.field259[var46];
                            var43 -= Statics.field2029[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field463 || (field133[0][var21][var44] & 0x2) != 0 || (field133[var6][var21][var44] & 0x10) == 0 && method920(var6, var21, var44) == client.field512)) {
                            if (var6 < field122) {
                                field122 = var6;
                            }
                            int var47 = Statics.field123[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field124[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field120[var6][var21][var44];
                                int var50 = field120[var6][var21 + 1][var44];
                                int var51 = field120[var6][var21 + 1][var44 + 1];
                                int var52 = field120[var6][var21][var44 + 1];
                                int var53 = Statics.field109[var21][var44];
                                int var54 = Statics.field109[var21 + 1][var44];
                                int var55 = Statics.field109[var21 + 1][var44 + 1];
                                int var56 = Statics.field109[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method123(var59, var60, var61);
                                    int var62 = field126 + var59 & 0xFF;
                                    int var63 = field137 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method123(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field130[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class37 var66 = (class37) class37.field938.method3288((long) var65);
                                        class37 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field925.method2991(4, var65);
                                            class37 var69 = new class37();
                                            if (var68 != null) {
                                                var69.method789(new class127(var68), var65);
                                            }
                                            var69.method797();
                                            class37.field938.method3291(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field928) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field1822[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class104.field1759[method3078(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1888(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method3078(var57, var53), method3078(var57, var54), method3078(var57, var55), method3078(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field130[var6][var21][var44] + 1;
                                    byte var72 = Statics.field139[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class37 var74 = (class37) class37.field938.method3288((long) var73);
                                    class37 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field925.method2991(4, var73);
                                        class37 var77 = new class37();
                                        if (var76 != null) {
                                            var77.method789(new class127(var76), var73);
                                        }
                                        var77.method797();
                                        class37.field938.method3291(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field933;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1766.method2207(var79);
                                        var81 = -1;
                                    } else if (var75.field927 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method123(var75.field926, var75.field931, var75.field932);
                                        int var82 = field126 + var75.field926 & 0xFF;
                                        int var83 = field137 + var75.field932;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method123(var82, var75.field931, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class104.field1759[method2697(var80, 96)];
                                    }
                                    if (var75.field929 != -1) {
                                        int var85 = field126 + var75.field930 & 0xFF;
                                        int var86 = field137 + var75.field924;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method123(var85, var75.field934, var86);
                                        var84 = class104.field1759[method2697(var87, 96)];
                                    }
                                    arg0.method1888(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method3078(var57, var53), method3078(var57, var54), method3078(var57, var55), method3078(var57, var56), method2697(var81, var53), method2697(var81, var54), method2697(var81, var55), method2697(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method2006(var6, var89, var88, method920(var6, var89, var88));
                }
            }
            Statics.field123[var6] = (byte[][]) null;
            Statics.field124[var6] = (byte[][]) null;
            Statics.field130[var6] = (byte[][]) null;
            Statics.field139[var6] = (byte[][]) null;
            Statics.field127[var6] = (byte[][]) null;
        }
        arg0.method1914(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field133[1][var90][var91] & 0x2) == 2) {
                    arg0.method1999(var90, var91);
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
                        if ((Statics.field1822[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field1822[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field1822[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label375: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field1822[var101 - 1][var98][var103] & var92) == 0) {
                                        break label375;
                                    }
                                }
                                var101--;
                            }
                            label364: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field1822[var102 + 1][var98][var104] & var92) == 0) {
                                        break label364;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field120[var102][var98][var99] - var106;
                                int var108 = field120[var101][var98][var99];
                                class95.method1951(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field1822[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1822[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field1822[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field1822[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label428: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field1822[var113 - 1][var115][var97] & var93) == 0) {
                                        break label428;
                                    }
                                }
                                var113--;
                            }
                            label417: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field1822[var114 + 1][var116][var97] & var93) == 0) {
                                        break label417;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field120[var114][var111][var97] - var118;
                                int var120 = field120[var113][var111][var97];
                                class95.method1951(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field1822[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1822[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field1822[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field1822[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label481: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field1822[var96][var123 - 1][var127] & var94) == 0) {
                                        break label481;
                                    }
                                }
                                var123--;
                            }
                            label470: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field1822[var96][var124 + 1][var128] & var94) == 0) {
                                        break label470;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field120[var96][var123][var125];
                                class95.method1951(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field1822[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.b(IIII)I")
    public static int method920(int arg0, int arg1, int arg2) {
        if ((field133[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field133[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("v.j(IIII)I")
    public static final int method196(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method121(var3, var5);
        int var8 = method121(var3 + 1, var5);
        int var9 = method121(var3, var5 + 1);
        int var10 = method121(var3 + 1, var5 + 1);
        int var11 = method2696(var7, var8, var4, arg2);
        int var12 = method2696(var9, var10, var4, arg2);
        int var13 = 65536 - class104.field1771[var6 * 1024 / arg2] >> 1;
        return ((65536 - var13) * var11 >> 16) + (var12 * var13 >> 16);
    }

    @ObfuscatedName("em.p(IIIIB)I")
    public static final int method2696(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1771[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("i.l(III)I")
    public static final int method121(int arg0, int arg1) {
        int var2 = method1244(arg0 - 1, arg1 - 1) + method1244(arg0 + 1, arg1 - 1) + method1244(arg0 - 1, arg1 + 1) + method1244(arg0 + 1, arg1 + 1);
        int var3 = method1244(arg0 - 1, arg1) + method1244(arg0 + 1, arg1) + method1244(arg0, arg1 - 1) + method1244(arg0, arg1 + 1);
        int var4 = method1244(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("be.i(III)I")
    public static final int method1244(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("el.r(III)I")
    public static final int method3078(int arg0, int arg1) {
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

    @ObfuscatedName("es.o(III)I")
    public static final int method2697(int arg0, int arg1) {
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

    @ObfuscatedName("r.c(IIII)I")
    public static final int method123(int arg0, int arg1, int arg2) {
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
