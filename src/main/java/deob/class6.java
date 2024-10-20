package deob;

@ObfuscatedName("z")
public final class class6 {

    @ObfuscatedName("z.k")
    public static int[][][] field81 = new int[4][105][105];

    @ObfuscatedName("z.b")
    public static byte[][][] field82 = new byte[4][104][104];

    @ObfuscatedName("z.e")
    public static int field83 = 99;

    @ObfuscatedName("z.f")
    public static final int[] field89 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("z.v")
    public static final int[] field86 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("z.s")
    public static final int[] field91 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("z.r")
    public static final int[] field92 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("z.j")
    public static final int[] field93 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("z.h")
    public static final int[] field95 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("z.d")
    public static int field97 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("z.l")
    public static int field94 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.k(I)V")
    public static void method478() {
        field83 = 99;
        Statics.field96 = new byte[4][104][104];
        Statics.field2496 = new byte[4][104][104];
        Statics.field74 = new byte[4][104][104];
        Statics.field85 = new byte[4][104][104];
        Statics.field201 = new int[4][105][105];
        Statics.field88 = new byte[4][105][105];
        Statics.field1906 = new int[105][105];
        Statics.field87 = new int[104];
        Statics.field2009 = new int[104];
        Statics.field2753 = new int[104];
        Statics.field573 = new int[104];
        Statics.field84 = new int[104];
    }

    @ObfuscatedName("cq.b(I)V")
    public static void method1879() {
        Statics.field96 = (byte[][][]) null;
        Statics.field2496 = (byte[][][]) null;
        Statics.field74 = (byte[][][]) null;
        Statics.field85 = (byte[][][]) null;
        Statics.field201 = (int[][][]) null;
        Statics.field88 = (byte[][][]) null;
        Statics.field1906 = (int[][]) null;
        Statics.field87 = null;
        Statics.field2009 = null;
        Statics.field2753 = null;
        Statics.field573 = null;
        Statics.field84 = null;
    }

    @ObfuscatedName("m.e(IIIII)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field88[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field81[0][var5][var4] = field81[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field81[0][var5][var4] = field81[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field81[0][var5][var4] = field81[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field81[0][var5][var4] = field81[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.i([BIIII[Lgx;B)V")
    public static final void method170(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class197[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2953[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class107 var9 = new class107(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2058(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("cl.t(Ldi;IIIIIII)V")
    public static final void method2058(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2115();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2115();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2115();
                }
            }
            return;
        }
        field82[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2115();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field81[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method504(var10 + 45365, var11 + 91923, 4) - 128 + (method504(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method504(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field81[arg1][arg2][arg3] = field81[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2115();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field81[0][arg2][arg3] = -var15 * 8;
                } else {
                    field81[arg1][arg2][arg3] = field81[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2496[arg1][arg2][arg3] = arg0.method2116();
                Statics.field74[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field85[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field82[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field96[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("aw.z([BIILcb;[Lgx;B)V")
    public static final void method565(byte[] arg0, int arg1, int arg2, class79 arg3, class197[] arg4) {
        class107 var5 = new class107(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2128();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2128();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2115();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field82[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class197 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method684(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ai.c(IIIIIILcb;Lgx;B)V")
    public static final void method684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class197 arg7) {
        if (client.field279 && (field82[0][arg1][arg2] & 0x2) == 0) {
            if ((field82[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field82[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field82[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field309 != var8) {
                return;
            }
        }
        if (arg0 < field83) {
            field83 = arg0;
        }
        class36 var9 = class36.method93(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field839;
            var11 = var9.field854;
        } else {
            var10 = var9.field854;
            var11 = var9.field839;
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
        int[][] var16 = field81[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field851 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field872 == 1) {
            var21 += 256;
        }
        if (var9.method649()) {
            class20 var22 = new class20();
            var22.field543 = arg0;
            var22.field544 = arg1 * 128;
            var22.field545 = arg2 * 128;
            int var23 = var9.field854;
            int var24 = var9.field839;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field839;
                var24 = var9.field854;
            }
            var22.field554 = (arg1 + var23) * 128;
            var22.field547 = (arg2 + var24) * 128;
            var22.field546 = var9.field866;
            var22.field548 = var9.field877 * 128;
            var22.field551 = var9.field878;
            var22.field552 = var9.field879;
            var22.field553 = var9.field846;
            if (var9.field873 != null) {
                var22.field556 = var9;
                var22.method474();
            }
            class20.field550.method3223(var22);
            if (var22.field553 != null) {
                var22.field555 = var22.field551 + (int) (Math.random() * (double) (var22.field552 - var22.field551));
            }
        }
        if (arg5 == 22) {
            if (!client.field279 || var9.field851 != 0 || var9.field849 == 1 || var9.field853) {
                class78 var25;
                if (var9.field855 == -1 && var9.field873 == null) {
                    var25 = var9.method644(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var9.field855, true, (class78) null);
                }
                arg6.method1601(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field849 == 1 && arg7 != null) {
                    arg7.method3502(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var48;
            if (var9.field855 == -1 && var9.field873 == null) {
                var48 = var9.method644(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            if (var48 != null && arg6.method1744(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field848) {
                int var49 = 15;
                if (var48 instanceof class98) {
                    var49 = ((class98) var48).method1981() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field88[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field88[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3500(arg1, arg2, var10, var11, var9.field863);
            }
        } else if (arg5 >= 12) {
            class78 var26;
            if (var9.field855 == -1 && var9.field873 == null) {
                var26 = var9.method644(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1744(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field201[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3500(arg1, arg2, var10, var11, var9.field863);
            }
        } else if (arg5 == 0) {
            class78 var27;
            if (var9.field855 == -1 && var9.field873 == null) {
                var27 = var9.method644(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1714(arg0, arg1, arg2, var17, var27, (class78) null, field89[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field848) {
                    Statics.field88[arg0][arg1][arg2] = 50;
                    Statics.field88[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field831) {
                    Statics.field201[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field848) {
                    Statics.field88[arg0][arg1][arg2 + 1] = 50;
                    Statics.field88[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field831) {
                    Statics.field201[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field848) {
                    Statics.field88[arg0][arg1 + 1][arg2] = 50;
                    Statics.field88[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field831) {
                    Statics.field201[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field848) {
                    Statics.field88[arg0][arg1][arg2] = 50;
                    Statics.field88[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field831) {
                    Statics.field201[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3521(arg1, arg2, arg5, arg4, var9.field863);
            }
            if (var9.field850 != 16) {
                arg6.method1611(arg0, arg1, arg2, var9.field850);
            }
        } else if (arg5 == 1) {
            class78 var28;
            if (var9.field855 == -1 && var9.field873 == null) {
                var28 = var9.method644(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1714(arg0, arg1, arg2, var17, var28, (class78) null, field86[arg4], 0, var20, var21);
            if (var9.field848) {
                if (arg4 == 0) {
                    Statics.field88[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field88[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field88[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field88[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3521(arg1, arg2, arg5, arg4, var9.field863);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class78 var30;
            class78 var31;
            if (var9.field855 == -1 && var9.field873 == null) {
                var30 = var9.method644(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method644(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field855, true, (class78) null);
                var31 = new class11(arg3, 2, var29, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1714(arg0, arg1, arg2, var17, var30, var31, field89[arg4], field89[var29], var20, var21);
            if (var9.field831) {
                if (arg4 == 0) {
                    Statics.field201[arg0][arg1][arg2] |= 0x249;
                    Statics.field201[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field201[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field201[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field201[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field201[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field201[arg0][arg1][arg2] |= 0x492;
                    Statics.field201[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3521(arg1, arg2, arg5, arg4, var9.field863);
            }
            if (var9.field850 != 16) {
                arg6.method1611(arg0, arg1, arg2, var9.field850);
            }
        } else if (arg5 == 3) {
            class78 var32;
            if (var9.field855 == -1 && var9.field873 == null) {
                var32 = var9.method644(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1714(arg0, arg1, arg2, var17, var32, (class78) null, field86[arg4], 0, var20, var21);
            if (var9.field848) {
                if (arg4 == 0) {
                    Statics.field88[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field88[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field88[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field88[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3521(arg1, arg2, arg5, arg4, var9.field863);
            }
        } else if (arg5 == 9) {
            class78 var33;
            if (var9.field855 == -1 && var9.field873 == null) {
                var33 = var9.method644(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1744(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field849 != 0 && arg7 != null) {
                arg7.method3500(arg1, arg2, var10, var11, var9.field863);
            }
            if (var9.field850 != 16) {
                arg6.method1611(arg0, arg1, arg2, var9.field850);
            }
        } else if (arg5 == 4) {
            class78 var34;
            if (var9.field855 == -1 && var9.field873 == null) {
                var34 = var9.method644(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1604(arg0, arg1, arg2, var17, var34, (class78) null, field89[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1620(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class36.method93(var36 >> 14 & 0x7FFF).field850;
            }
            class78 var37;
            if (var9.field855 == -1 && var9.field873 == null) {
                var37 = var9.method644(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1604(arg0, arg1, arg2, var17, var37, (class78) null, field89[arg4], 0, field91[arg4] * var35, field92[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1620(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class36.method93(var39 >> 14 & 0x7FFF).field850 / 2;
            }
            class78 var40;
            if (var9.field855 == -1 && var9.field873 == null) {
                var40 = var9.method644(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1604(arg0, arg1, arg2, var17, var40, (class78) null, 256, arg4, field93[arg4] * var38, field95[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class78 var42;
            if (var9.field855 == -1 && var9.field873 == null) {
                var42 = var9.method644(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class11(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1604(arg0, arg1, arg2, var17, var42, (class78) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1620(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class36.method93(var44 >> 14 & 0x7FFF).field850 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class78 var46;
            class78 var47;
            if (var9.field855 == -1 && var9.field873 == null) {
                var46 = var9.method644(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method644(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field855, true, (class78) null);
                var47 = new class11(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field855, true, (class78) null);
            }
            arg6.method1604(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field93[arg4] * var43, field95[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("cd.o(Lcb;[Lgx;B)V")
    public static final void method1774(class79 arg0, class197[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field82[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field82[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3511(var3, var4);
                        }
                    }
                }
            }
        }
        field97 += (int) (Math.random() * 5.0D) - 2;
        if (field97 < -8) {
            field97 = -8;
        }
        if (field97 > 8) {
            field97 = 8;
        }
        field94 += (int) (Math.random() * 5.0D) - 2;
        if (field94 < -16) {
            field94 = -16;
        }
        if (field94 > 16) {
            field94 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field88[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field81[var6][var11 + 1][var10] - field81[var6][var11 - 1][var10];
                    int var13 = field81[var6][var11][var10 + 1] - field81[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1906[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field87[var20] = 0;
                Statics.field2009[var20] = 0;
                Statics.field2753[var20] = 0;
                Statics.field573[var20] = 0;
                Statics.field84[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field96[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class37 var25 = class37.method787(var24 - 1);
                            Statics.field87[var22] += var25.field885;
                            Statics.field2009[var22] += var25.field886;
                            Statics.field2753[var22] += var25.field887;
                            Statics.field573[var22] += var25.field882;
                            var10002 = Statics.field84[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field96[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class37 var28 = class37.method787(var27 - 1);
                            Statics.field87[var22] -= var28.field885;
                            Statics.field2009[var22] -= var28.field886;
                            Statics.field2753[var22] -= var28.field887;
                            Statics.field573[var22] -= var28.field882;
                            var10002 = Statics.field84[var22]--;
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
                            var29 += Statics.field87[var35];
                            var30 += Statics.field2009[var35];
                            var31 += Statics.field2753[var35];
                            var32 += Statics.field573[var35];
                            var33 += Statics.field84[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field87[var36];
                            var30 -= Statics.field2009[var36];
                            var31 -= Statics.field2753[var36];
                            var32 -= Statics.field573[var36];
                            var33 -= Statics.field84[var36];
                        }
                        if (var34 >= 1 && var34 < 103) {
                            if (client.field279 && (field82[0][var21][var34] & 0x2) == 0) {
                                if ((field82[var6][var21][var34] & 0x10) != 0) {
                                    continue;
                                }
                                int var37;
                                if ((field82[var6][var21][var34] & 0x8) != 0) {
                                    var37 = 0;
                                } else if (var6 <= 0 || (field82[1][var21][var34] & 0x2) == 0) {
                                    var37 = var6;
                                } else {
                                    var37 = var6 - 1;
                                }
                                if (client.field309 != var37) {
                                    continue;
                                }
                            }
                            if (var6 < field83) {
                                field83 = var6;
                            }
                            int var38 = Statics.field96[var6][var21][var34] & 0xFF;
                            int var39 = Statics.field2496[var6][var21][var34] & 0xFF;
                            if (var38 > 0 || var39 > 0) {
                                int var40 = field81[var6][var21][var34];
                                int var41 = field81[var6][var21 + 1][var34];
                                int var42 = field81[var6][var21 + 1][var34 + 1];
                                int var43 = field81[var6][var21][var34 + 1];
                                int var44 = Statics.field1906[var21][var34];
                                int var45 = Statics.field1906[var21 + 1][var34];
                                int var46 = Statics.field1906[var21 + 1][var34 + 1];
                                int var47 = Statics.field1906[var21][var34 + 1];
                                int var48 = -1;
                                int var49 = -1;
                                if (var38 > 0) {
                                    int var50 = var29 * 256 / var32;
                                    int var51 = var30 / var33;
                                    int var52 = var31 / var33;
                                    var48 = method105(var50, var51, var52);
                                    int var53 = field97 + var50 & 0xFF;
                                    int var54 = field94 + var52;
                                    if (var54 < 0) {
                                        var54 = 0;
                                    } else if (var54 > 255) {
                                        var54 = 255;
                                    }
                                    var49 = method105(var53, var51, var54);
                                }
                                if (var6 > 0) {
                                    boolean var55 = true;
                                    if (var38 == 0 && Statics.field74[var6][var21][var34] != 0) {
                                        var55 = false;
                                    }
                                    if (var39 > 0 && !class41.method135(var39 - 1).field962) {
                                        var55 = false;
                                    }
                                    if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
                                        Statics.field201[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var56 = 0;
                                if (var49 != -1) {
                                    var56 = class84.field1487[method759(var49, 96)];
                                }
                                if (var39 == 0) {
                                    arg0.method1600(var6, var21, var34, 0, 0, -1, var40, var41, var42, var43, method759(var48, var44), method759(var48, var45), method759(var48, var46), method759(var48, var47), 0, 0, 0, 0, var56, 0);
                                } else {
                                    int var57 = Statics.field74[var6][var21][var34] + 1;
                                    byte var58 = Statics.field85[var6][var21][var34];
                                    class41 var59 = class41.method135(var39 - 1);
                                    int var60 = var59.field968;
                                    int var61;
                                    int var62;
                                    if (var60 >= 0) {
                                        var61 = Statics.field1485.method1841(var60);
                                        var62 = -1;
                                    } else if (var59.field960 == 16711935) {
                                        var62 = -2;
                                        var60 = -1;
                                        var61 = -2;
                                    } else {
                                        var62 = method105(var59.field964, var59.field965, var59.field966);
                                        int var63 = field97 + var59.field964 & 0xFF;
                                        int var64 = field94 + var59.field966;
                                        if (var64 < 0) {
                                            var64 = 0;
                                        } else if (var64 > 255) {
                                            var64 = 255;
                                        }
                                        var61 = method105(var63, var59.field965, var64);
                                    }
                                    int var65 = 0;
                                    if (var61 != -2) {
                                        var65 = class84.field1487[method567(var61, 96)];
                                    }
                                    if (var59.field967 != -1) {
                                        int var66 = field97 + var59.field970 & 0xFF;
                                        int var67 = field94 + var59.field969;
                                        if (var67 < 0) {
                                            var67 = 0;
                                        } else if (var67 > 255) {
                                            var67 = 255;
                                        }
                                        int var68 = method105(var66, var59.field974, var67);
                                        var65 = class84.field1487[method567(var68, 96)];
                                    }
                                    arg0.method1600(var6, var21, var34, var57, var58, var60, var40, var41, var42, var43, method759(var48, var44), method759(var48, var45), method759(var48, var46), method759(var48, var47), method567(var62, var44), method567(var62, var45), method567(var62, var46), method567(var62, var47), var56, var65);
                                }
                            }
                        }
                    }
                }
            }
            for (int var69 = 1; var69 < 103; var69++) {
                for (int var70 = 1; var70 < 103; var70++) {
                    int var75;
                    if ((field82[var6][var70][var69] & 0x8) != 0) {
                        var75 = 0;
                    } else if (var6 <= 0 || (field82[1][var70][var69] & 0x2) == 0) {
                        var75 = var6;
                    } else {
                        var75 = var6 - 1;
                    }
                    arg0.method1599(var6, var70, var69, var75);
                }
            }
            Statics.field96[var6] = (byte[][]) null;
            Statics.field2496[var6] = (byte[][]) null;
            Statics.field74[var6] = (byte[][]) null;
            Statics.field85[var6] = (byte[][]) null;
            Statics.field88[var6] = (byte[][]) null;
        }
        arg0.method1626(-50, -10, -50);
        for (int var76 = 0; var76 < 104; var76++) {
            for (int var77 = 0; var77 < 104; var77++) {
                if ((field82[1][var76][var77] & 0x2) == 2) {
                    arg0.method1597(var76, var77);
                }
            }
        }
        int var78 = 1;
        int var79 = 2;
        int var80 = 4;
        for (int var81 = 0; var81 < 4; var81++) {
            if (var81 > 0) {
                var78 <<= 0x3;
                var79 <<= 0x3;
                var80 <<= 0x3;
            }
            for (int var82 = 0; var82 <= var81; var82++) {
                for (int var83 = 0; var83 <= 104; var83++) {
                    for (int var84 = 0; var84 <= 104; var84++) {
                        if ((Statics.field201[var82][var84][var83] & var78) != 0) {
                            int var85 = var83;
                            int var86 = var83;
                            int var87 = var82;
                            int var88 = var82;
                            while (var85 > 0 && (Statics.field201[var82][var84][var85 - 1] & var78) != 0) {
                                var85--;
                            }
                            while (var86 < 104 && (Statics.field201[var82][var84][var86 + 1] & var78) != 0) {
                                var86++;
                            }
                            label351: while (var87 > 0) {
                                for (int var89 = var85; var89 <= var86; var89++) {
                                    if ((Statics.field201[var87 - 1][var84][var89] & var78) == 0) {
                                        break label351;
                                    }
                                }
                                var87--;
                            }
                            label340: while (var88 < var81) {
                                for (int var90 = var85; var90 <= var86; var90++) {
                                    if ((Statics.field201[var88 + 1][var84][var90] & var78) == 0) {
                                        break label340;
                                    }
                                }
                                var88++;
                            }
                            int var91 = (var88 + 1 - var87) * (var86 - var85 + 1);
                            if (var91 >= 8) {
                                short var92 = 240;
                                int var93 = field81[var88][var84][var85] - var92;
                                int var94 = field81[var87][var84][var85];
                                class79.method1598(var81, 1, var84 * 128, var84 * 128, var85 * 128, var86 * 128 + 128, var93, var94);
                                for (int var95 = var87; var95 <= var88; var95++) {
                                    for (int var96 = var85; var96 <= var86; var96++) {
                                        Statics.field201[var95][var84][var96] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field201[var82][var84][var83] & var79) != 0) {
                            int var97 = var84;
                            int var98 = var84;
                            int var99 = var82;
                            int var100 = var82;
                            while (var97 > 0 && (Statics.field201[var82][var97 - 1][var83] & var79) != 0) {
                                var97--;
                            }
                            while (var98 < 104 && (Statics.field201[var82][var98 + 1][var83] & var79) != 0) {
                                var98++;
                            }
                            label404: while (var99 > 0) {
                                for (int var101 = var97; var101 <= var98; var101++) {
                                    if ((Statics.field201[var99 - 1][var101][var83] & var79) == 0) {
                                        break label404;
                                    }
                                }
                                var99--;
                            }
                            label393: while (var100 < var81) {
                                for (int var102 = var97; var102 <= var98; var102++) {
                                    if ((Statics.field201[var100 + 1][var102][var83] & var79) == 0) {
                                        break label393;
                                    }
                                }
                                var100++;
                            }
                            int var103 = (var100 + 1 - var99) * (var98 - var97 + 1);
                            if (var103 >= 8) {
                                short var104 = 240;
                                int var105 = field81[var100][var97][var83] - var104;
                                int var106 = field81[var99][var97][var83];
                                class79.method1598(var81, 2, var97 * 128, var98 * 128 + 128, var83 * 128, var83 * 128, var105, var106);
                                for (int var107 = var99; var107 <= var100; var107++) {
                                    for (int var108 = var97; var108 <= var98; var108++) {
                                        Statics.field201[var107][var108][var83] &= ~var79;
                                    }
                                }
                            }
                        }
                        if ((Statics.field201[var82][var84][var83] & var80) != 0) {
                            int var109 = var84;
                            int var110 = var84;
                            int var111 = var83;
                            int var112 = var83;
                            while (var111 > 0 && (Statics.field201[var82][var84][var111 - 1] & var80) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field201[var82][var84][var112 + 1] & var80) != 0) {
                                var112++;
                            }
                            label457: while (var109 > 0) {
                                for (int var113 = var111; var113 <= var112; var113++) {
                                    if ((Statics.field201[var82][var109 - 1][var113] & var80) == 0) {
                                        break label457;
                                    }
                                }
                                var109--;
                            }
                            label446: while (var110 < 104) {
                                for (int var114 = var111; var114 <= var112; var114++) {
                                    if ((Statics.field201[var82][var110 + 1][var114] & var80) == 0) {
                                        break label446;
                                    }
                                }
                                var110++;
                            }
                            if ((var110 - var109 + 1) * (var112 - var111 + 1) >= 4) {
                                int var115 = field81[var82][var109][var111];
                                class79.method1598(var81, 4, var109 * 128, var110 * 128 + 128, var111 * 128, var112 * 128 + 128, var115, var115);
                                for (int var116 = var109; var116 <= var110; var116++) {
                                    for (int var117 = var111; var117 <= var112; var117++) {
                                        Statics.field201[var82][var116][var117] &= ~var80;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.q(IIII)I")
    public static final int method504(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1419(var3, var5);
        int var8 = method1419(var3 + 1, var5);
        int var9 = method1419(var3, var5 + 1);
        int var10 = method1419(var3 + 1, var5 + 1);
        int var11 = 65536 - class84.field1489[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class84.field1489[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class84.field1489[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("be.w(III)I")
    public static final int method1419(int arg0, int arg1) {
        int var2 = method2898(arg0 - 1, arg1 - 1) + method2898(arg0 + 1, arg1 - 1) + method2898(arg0 - 1, arg1 + 1) + method2898(arg0 + 1, arg1 + 1);
        int var3 = method2898(arg0 - 1, arg1) + method2898(arg0 + 1, arg1) + method2898(arg0, arg1 - 1) + method2898(arg0, arg1 + 1);
        int var4 = method2898(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ew.y(III)I")
    public static final int method2898(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ae.p(IIB)I")
    public static final int method759(int arg0, int arg1) {
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

    @ObfuscatedName("aw.m(III)I")
    public static final int method567(int arg0, int arg1) {
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

    @ObfuscatedName("o.a(IIII)I")
    public static final int method105(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("i.u(IIS)Z")
    public static final boolean method21(int arg0, int arg1) {
        class36 var2 = class36.method93(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method639(arg1);
    }
}
