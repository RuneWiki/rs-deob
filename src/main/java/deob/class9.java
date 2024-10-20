package deob;

@ObfuscatedName("z")
public final class class9 {

    @ObfuscatedName("z.g")
    public static int[][][] field135 = new int[4][105][105];

    @ObfuscatedName("z.h")
    public static byte[][][] field121 = new byte[4][104][104];

    @ObfuscatedName("z.s")
    public static int field122 = 99;

    @ObfuscatedName("z.a")
    public static final int[] field126 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("z.f")
    public static final int[] field140 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("z.y")
    public static final int[] field128 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("z.v")
    public static final int[] field129 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("z.w")
    public static final int[] field130 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("z.d")
    public static final int[] field127 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("z.i")
    public static int field131 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("z.c")
    public static int field133 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.g(IIIIB)V")
    public static final void method820(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field343[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field135[0][var5][var4] = field135[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field135[0][var5][var4] = field135[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field135[0][var5][var4] = field135[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field135[0][var5][var4] = field135[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.s(IIIS)V")
    public static final void method1258(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field135[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field135[arg0][arg1][arg2 + var5] = field135[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field135[arg0][arg1 + var6][arg2] = field135[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field135[arg0][arg1 - 1][arg2] != 0) {
            field135[arg0][arg1][arg2] = field135[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field135[arg0][arg1][arg2 - 1] != 0) {
            field135[arg0][arg1][arg2] = field135[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field135[arg0][arg1 - 1][arg2 - 1] != 0) {
            field135[arg0][arg1][arg2] = field135[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("j.o(Ldw;IIIIIII)V")
    public static final void method118(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2499();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2499();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2499();
                }
            }
            return;
        }
        field121[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2499();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field135[0][arg2][arg3] = -method2770(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field135[arg1][arg2][arg3] = field135[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2499();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field135[0][arg2][arg3] = -var8 * 8;
                } else {
                    field135[arg1][arg2][arg3] = field135[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field124[arg1][arg2][arg3] = arg0.method2500();
                Statics.field2330[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field88[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field121[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field123[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ch.p([BIII)Z")
    public static final boolean method1610(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class127 var4 = new class127(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2564();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2564();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2499() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class32 var16 = class32.method249(var5);
                        if (var13 != 22 || !client.field490 || var16.field828 != 0 || var16.field836 == 1 || var16.field855) {
                            if (!var16.method655()) {
                                client.field541++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2564();
                if (var9 == 0) {
                    break;
                }
                var4.method2499();
            }
        }
    }

    @ObfuscatedName("aj.x([BIILck;[Ldf;I)V")
    public static final void method785(byte[] arg0, int arg1, int arg2, class95 arg3, class130[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2564();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2564();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2499();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field121[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class130 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2426(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("cw.k([BIIIIIIILck;[Ldf;I)V")
    public static final void method1614(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, class130[] arg9) {
        class127 var10 = new class127(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2564();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2564();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2499();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class32 var21 = class32.method249(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field823;
                    int var27 = var21.field833;
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
                    int var32 = arg3 + class161.method1381(var16 & 0x7, var15 & 0x7, arg7, var21.field823, var21.field833, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field121[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class130 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method2426(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dr.r(IIIIIILck;Ldf;I)V")
    public static final void method2426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field490 && (field121[0][arg1][arg2] & 0x2) == 0) {
            if ((field121[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1213(arg0, arg1, arg2) != client.field538) {
                return;
            }
        }
        if (arg0 < field122) {
            field122 = arg0;
        }
        class32 var8 = class32.method249(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field833;
            var10 = var8.field823;
        } else {
            var9 = var8.field823;
            var10 = var8.field833;
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
        int[][] var15 = field135[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field828 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field857 == 1) {
            var20 += 256;
        }
        if (var8.method678()) {
            class7.method2240(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field490 || var8.field828 != 0 || var8.field836 == 1 || var8.field855) {
                class94 var21;
                if (var8.field840 == -1 && var8.field816 == null) {
                    var21 = var8.method651(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field840, true, (class94) null);
                }
                arg6.method1915(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field836 == 1 && arg7 != null) {
                    arg7.method2751(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var44;
            if (var8.field840 == -1 && var8.field816 == null) {
                var44 = var8.method651(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            if (var44 != null && arg6.method1963(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field848) {
                int var45 = 15;
                if (var44 instanceof class112) {
                    var45 = ((class112) var44).method2272() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field343[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field343[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method2729(arg1, arg2, var9, var10, var8.field831);
            }
        } else if (arg5 >= 12) {
            class94 var22;
            if (var8.field840 == -1 && var8.field816 == null) {
                var22 = var8.method651(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1963(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field399[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method2729(arg1, arg2, var9, var10, var8.field831);
            }
        } else if (arg5 == 0) {
            class94 var23;
            if (var8.field840 == -1 && var8.field816 == null) {
                var23 = var8.method651(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1906(arg0, arg1, arg2, var16, var23, (class94) null, field126[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field848) {
                    Statics.field343[arg0][arg1][arg2] = 50;
                    Statics.field343[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field839) {
                    Statics.field399[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field848) {
                    Statics.field343[arg0][arg1][arg2 + 1] = 50;
                    Statics.field343[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field839) {
                    Statics.field399[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field848) {
                    Statics.field343[arg0][arg1 + 1][arg2] = 50;
                    Statics.field343[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field839) {
                    Statics.field399[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field848) {
                    Statics.field343[arg0][arg1][arg2] = 50;
                    Statics.field343[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field839) {
                    Statics.field399[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method2728(arg1, arg2, arg5, arg4, var8.field831);
            }
            if (var8.field841 != 16) {
                arg6.method1914(arg0, arg1, arg2, var8.field841);
            }
        } else if (arg5 == 1) {
            class94 var24;
            if (var8.field840 == -1 && var8.field816 == null) {
                var24 = var8.method651(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1906(arg0, arg1, arg2, var16, var24, (class94) null, field140[arg4], 0, var19, var20);
            if (var8.field848) {
                if (arg4 == 0) {
                    Statics.field343[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field343[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field343[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field343[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method2728(arg1, arg2, arg5, arg4, var8.field831);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class94 var26;
            class94 var27;
            if (var8.field840 == -1 && var8.field816 == null) {
                var26 = var8.method651(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method651(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field840, true, (class94) null);
                var27 = new class14(arg3, 2, var25, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1906(arg0, arg1, arg2, var16, var26, var27, field126[arg4], field126[var25], var19, var20);
            if (var8.field839) {
                if (arg4 == 0) {
                    Statics.field399[arg0][arg1][arg2] |= 0x249;
                    Statics.field399[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field399[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field399[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field399[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field399[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field399[arg0][arg1][arg2] |= 0x492;
                    Statics.field399[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method2728(arg1, arg2, arg5, arg4, var8.field831);
            }
            if (var8.field841 != 16) {
                arg6.method1914(arg0, arg1, arg2, var8.field841);
            }
        } else if (arg5 == 3) {
            class94 var28;
            if (var8.field840 == -1 && var8.field816 == null) {
                var28 = var8.method651(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1906(arg0, arg1, arg2, var16, var28, (class94) null, field140[arg4], 0, var19, var20);
            if (var8.field848) {
                if (arg4 == 0) {
                    Statics.field343[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field343[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field343[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field343[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method2728(arg1, arg2, arg5, arg4, var8.field831);
            }
        } else if (arg5 == 9) {
            class94 var29;
            if (var8.field840 == -1 && var8.field816 == null) {
                var29 = var8.method651(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1963(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field836 != 0 && arg7 != null) {
                arg7.method2729(arg1, arg2, var9, var10, var8.field831);
            }
            if (var8.field841 != 16) {
                arg6.method1914(arg0, arg1, arg2, var8.field841);
            }
        } else if (arg5 == 4) {
            class94 var30;
            if (var8.field840 == -1 && var8.field816 == null) {
                var30 = var8.method651(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1907(arg0, arg1, arg2, var16, var30, (class94) null, field126[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1924(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class32.method249(var32 >> 14 & 0x7FFF).field841;
            }
            class94 var33;
            if (var8.field840 == -1 && var8.field816 == null) {
                var33 = var8.method651(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1907(arg0, arg1, arg2, var16, var33, (class94) null, field126[arg4], 0, field128[arg4] * var31, field129[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1924(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class32.method249(var35 >> 14 & 0x7FFF).field841 / 2;
            }
            class94 var36;
            if (var8.field840 == -1 && var8.field816 == null) {
                var36 = var8.method651(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1907(arg0, arg1, arg2, var16, var36, (class94) null, 256, arg4, field130[arg4] * var34, field127[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class94 var38;
            if (var8.field840 == -1 && var8.field816 == null) {
                var38 = var8.method651(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class14(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1907(arg0, arg1, arg2, var16, var38, (class94) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1924(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class32.method249(var40 >> 14 & 0x7FFF).field841 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            class94 var43;
            if (var8.field840 == -1 && var8.field816 == null) {
                var42 = var8.method651(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method651(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field840, true, (class94) null);
                var43 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field840, true, (class94) null);
            }
            arg6.method1907(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field130[arg4] * var39, field127[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("a.z(Lck;[Ldf;B)V")
    public static final void method182(class95 arg0, class130[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field121[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field121[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2730(var3, var4);
                        }
                    }
                }
            }
        }
        field131 += (int) (Math.random() * 5.0D) - 2;
        if (field131 < -8) {
            field131 = -8;
        }
        if (field131 > 8) {
            field131 = 8;
        }
        field133 += (int) (Math.random() * 5.0D) - 2;
        if (field133 < -16) {
            field133 = -16;
        }
        if (field133 > 16) {
            field133 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field343[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field135[var6][var11 + 1][var10] - field135[var6][var11 - 1][var10];
                    int var13 = field135[var6][var11][var10 + 1] - field135[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field873[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field125[var20] = 0;
                Statics.field1777[var20] = 0;
                Statics.field2467[var20] = 0;
                Statics.field1779[var20] = 0;
                Statics.field375[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field123[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class33 var25 = class33.method1535(var24 - 1);
                            Statics.field125[var22] += var25.field869;
                            Statics.field1777[var22] += var25.field870;
                            Statics.field2467[var22] += var25.field866;
                            Statics.field1779[var22] += var25.field871;
                            var10002 = Statics.field375[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field123[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class33 var28 = class33.method1535(var27 - 1);
                            Statics.field125[var22] -= var28.field869;
                            Statics.field1777[var22] -= var28.field870;
                            Statics.field2467[var22] -= var28.field866;
                            Statics.field1779[var22] -= var28.field871;
                            var10002 = Statics.field375[var22]--;
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
                            var29 += Statics.field125[var35];
                            var30 += Statics.field1777[var35];
                            var31 += Statics.field2467[var35];
                            var32 += Statics.field1779[var35];
                            var33 += Statics.field375[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field125[var36];
                            var30 -= Statics.field1777[var36];
                            var31 -= Statics.field2467[var36];
                            var32 -= Statics.field1779[var36];
                            var33 -= Statics.field375[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field490 || (field121[0][var21][var34] & 0x2) != 0 || (field121[var6][var21][var34] & 0x10) == 0 && method1213(var6, var21, var34) == client.field538)) {
                            if (var6 < field122) {
                                field122 = var6;
                            }
                            int var37 = Statics.field123[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field124[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field135[var6][var21][var34];
                                int var40 = field135[var6][var21 + 1][var34];
                                int var41 = field135[var6][var21 + 1][var34 + 1];
                                int var42 = field135[var6][var21][var34 + 1];
                                int var43 = Statics.field873[var21][var34];
                                int var44 = Statics.field873[var21 + 1][var34];
                                int var45 = Statics.field873[var21 + 1][var34 + 1];
                                int var46 = Statics.field873[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method59(var49, var50, var51);
                                    int var52 = field131 + var49 & 0xFF;
                                    int var53 = field133 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method59(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field2330[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0) {
                                        int var55 = var38 - 1;
                                        class37 var56 = (class37) class37.field952.method3303((long) var55);
                                        class37 var57;
                                        if (var56 == null) {
                                            byte[] var58 = Statics.field950.method3080(4, var55);
                                            class37 var59 = new class37();
                                            if (var58 != null) {
                                                var59.method803(new class127(var58), var55);
                                            }
                                            var59.method787();
                                            class37.field952.method3313(var59, (long) var55);
                                            var57 = var59;
                                        } else {
                                            var57 = var56;
                                        }
                                        if (!var57.field945) {
                                            var54 = false;
                                        }
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field399[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var60 = 0;
                                if (var48 != -1) {
                                    var60 = class104.field1763[Statics.method2763(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1980(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, Statics.method2763(var47, var43), Statics.method2763(var47, var44), Statics.method2763(var47, var45), Statics.method2763(var47, var46), 0, 0, 0, 0, var60, 0);
                                } else {
                                    int var61 = Statics.field2330[var6][var21][var34] + 1;
                                    byte var62 = Statics.field88[var6][var21][var34];
                                    int var63 = var38 - 1;
                                    class37 var64 = (class37) class37.field952.method3303((long) var63);
                                    class37 var65;
                                    if (var64 == null) {
                                        byte[] var66 = Statics.field950.method3080(4, var63);
                                        class37 var67 = new class37();
                                        if (var66 != null) {
                                            var67.method803(new class127(var66), var63);
                                        }
                                        var67.method787();
                                        class37.field952.method3313(var67, (long) var63);
                                        var65 = var67;
                                    } else {
                                        var65 = var64;
                                    }
                                    int var69 = var65.field944;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1759.method2226(var69);
                                        var71 = -1;
                                    } else if (var65.field943 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method59(var65.field947, var65.field948, var65.field949);
                                        int var72 = field131 + var65.field947 & 0xFF;
                                        int var73 = field133 + var65.field949;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method59(var72, var65.field948, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class104.field1763[method917(var70, 96)];
                                    }
                                    if (var65.field941 != -1) {
                                        int var75 = field131 + var65.field956 & 0xFF;
                                        int var76 = field133 + var65.field942;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method59(var75, var65.field951, var76);
                                        var74 = class104.field1763[method917(var77, 96)];
                                    }
                                    arg0.method1980(var6, var21, var34, var61, var62, var69, var39, var40, var41, var42, Statics.method2763(var47, var43), Statics.method2763(var47, var44), Statics.method2763(var47, var45), Statics.method2763(var47, var46), method917(var71, var43), method917(var71, var44), method917(var71, var45), method917(var71, var46), var60, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1902(var6, var79, var78, method1213(var6, var79, var78));
                }
            }
            Statics.field123[var6] = (byte[][]) null;
            Statics.field124[var6] = (byte[][]) null;
            Statics.field2330[var6] = (byte[][]) null;
            Statics.field88[var6] = (byte[][]) null;
            Statics.field343[var6] = (byte[][]) null;
        }
        arg0.method2044(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field121[1][var80][var81] & 0x2) == 2) {
                    arg0.method2012(var80, var81);
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
                        if ((Statics.field399[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field399[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field399[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label357: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field399[var91 - 1][var88][var93] & var82) == 0) {
                                        break label357;
                                    }
                                }
                                var91--;
                            }
                            label346: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field399[var92 + 1][var88][var94] & var82) == 0) {
                                        break label346;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field135[var92][var88][var89] - var96;
                                int var98 = field135[var91][var88][var89];
                                class95.method1974(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field399[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field399[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field399[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field399[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label410: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field399[var103 - 1][var105][var87] & var83) == 0) {
                                        break label410;
                                    }
                                }
                                var103--;
                            }
                            label399: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field399[var104 + 1][var106][var87] & var83) == 0) {
                                        break label399;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field135[var104][var101][var87] - var108;
                                int var110 = field135[var103][var101][var87];
                                class95.method1974(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field399[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field399[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field399[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field399[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label463: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field399[var86][var113 - 1][var117] & var84) == 0) {
                                        break label463;
                                    }
                                }
                                var113--;
                            }
                            label452: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field399[var86][var114 + 1][var118] & var84) == 0) {
                                        break label452;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field135[var86][var113][var115];
                                class95.method1974(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field399[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.n(IIIS)I")
    public static int method1213(int arg0, int arg1, int arg2) {
        if ((field121[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field121[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ei.j(III)I")
    public static final int method2770(int arg0, int arg1) {
        int var2 = method1(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("g.b(IIII)I")
    public static final int method1(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1896(var3, var5);
        int var8 = method1896(var3 + 1, var5);
        int var9 = method1896(var3, var5 + 1);
        int var10 = method1896(var3 + 1, var5 + 1);
        int var11 = method172(var7, var8, var4, arg2);
        int var12 = method172(var9, var10, var4, arg2);
        return method172(var11, var12, var6, arg2);
    }

    @ObfuscatedName("m.t(IIIIB)I")
    public static final int method172(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1743[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("cm.q(III)I")
    public static final int method1896(int arg0, int arg1) {
        int var2 = method159(arg0 - 1, arg1 - 1) + method159(arg0 + 1, arg1 - 1) + method159(arg0 - 1, arg1 + 1) + method159(arg0 + 1, arg1 + 1);
        int var3 = method159(arg0 - 1, arg1) + method159(arg0 + 1, arg1) + method159(arg0, arg1 - 1) + method159(arg0, arg1 + 1);
        int var4 = method159(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("e.e(III)I")
    public static final int method159(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("am.u(III)I")
    public static final int method917(int arg0, int arg1) {
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

    @ObfuscatedName("k.m(IIII)I")
    public static final int method59(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bw.a(IIIIIIILck;Ldf;B)V")
    public static final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class130 arg8) {
        class32 var9 = class32.method249(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field833;
            var11 = var9.field823;
        } else {
            var10 = var9.field823;
            var11 = var9.field833;
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
        int[][] var16 = field135[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field828 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field857 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field840 == -1 && var9.field816 == null) {
                var22 = var9.method653(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1915(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field836 == 1) {
                arg8.method2751(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field840 == -1 && var9.field816 == null) {
                var45 = var9.method653(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1963(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field836 != 0) {
                arg8.method2729(arg2, arg3, var10, var11, var9.field831);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field840 == -1 && var9.field816 == null) {
                var23 = var9.method653(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1963(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field836 != 0) {
                arg8.method2729(arg2, arg3, var10, var11, var9.field831);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field840 == -1 && var9.field816 == null) {
                var24 = var9.method653(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1906(arg0, arg2, arg3, var17, var24, (class94) null, field126[arg5], 0, var20, var21);
            if (var9.field836 != 0) {
                arg8.method2728(arg2, arg3, arg6, arg5, var9.field831);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field840 == -1 && var9.field816 == null) {
                var25 = var9.method653(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1906(arg0, arg2, arg3, var17, var25, (class94) null, field140[arg5], 0, var20, var21);
            if (var9.field836 != 0) {
                arg8.method2728(arg2, arg3, arg6, arg5, var9.field831);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field840 == -1 && var9.field816 == null) {
                var27 = var9.method653(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method653(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field840, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1906(arg0, arg2, arg3, var17, var27, var28, field126[arg5], field126[var26], var20, var21);
            if (var9.field836 != 0) {
                arg8.method2728(arg2, arg3, arg6, arg5, var9.field831);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field840 == -1 && var9.field816 == null) {
                var29 = var9.method653(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1906(arg0, arg2, arg3, var17, var29, (class94) null, field140[arg5], 0, var20, var21);
            if (var9.field836 != 0) {
                arg8.method2728(arg2, arg3, arg6, arg5, var9.field831);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field840 == -1 && var9.field816 == null) {
                var30 = var9.method653(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1963(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field836 != 0) {
                arg8.method2729(arg2, arg3, var10, var11, var9.field831);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field840 == -1 && var9.field816 == null) {
                var31 = var9.method653(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1907(arg0, arg2, arg3, var17, var31, (class94) null, field126[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1924(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method249(var33 >> 14 & 0x7FFF).field841;
            }
            class94 var34;
            if (var9.field840 == -1 && var9.field816 == null) {
                var34 = var9.method653(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1907(arg0, arg2, arg3, var17, var34, (class94) null, field126[arg5], 0, field128[arg5] * var32, field129[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1924(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method249(var36 >> 14 & 0x7FFF).field841 / 2;
            }
            class94 var37;
            if (var9.field840 == -1 && var9.field816 == null) {
                var37 = var9.method653(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1907(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field130[arg5] * var35, field127[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field840 == -1 && var9.field816 == null) {
                var39 = var9.method653(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1907(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1924(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method249(var41 >> 14 & 0x7FFF).field841 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field840 == -1 && var9.field816 == null) {
                var43 = var9.method653(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method653(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field840, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field840, true, (class94) null);
            }
            arg7.method1907(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field130[arg5] * var40, field127[arg5] * var40, var20, var21);
        }
    }
}
