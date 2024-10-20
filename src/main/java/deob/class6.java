package deob;

@ObfuscatedName("a")
public final class class6 {

    @ObfuscatedName("a.z")
    public static int[][][] field103 = new int[4][105][105];

    @ObfuscatedName("a.n")
    public static byte[][][] field75 = new byte[4][104][104];

    @ObfuscatedName("a.u")
    public static int field77 = 99;

    @ObfuscatedName("a.q")
    public static final int[] field86 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("a.c")
    public static final int[] field96 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("a.h")
    public static final int[] field88 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("a.y")
    public static final int[] field76 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("a.r")
    public static final int[] field90 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("a.w")
    public static final int[] field91 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("a.p")
    public static int field92 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("a.s")
    public static int field93 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.z(I)V")
    public static void method570() {
        field77 = 99;
        Statics.field98 = new byte[4][104][104];
        Statics.field1496 = new byte[4][104][104];
        Statics.field1785 = new byte[4][104][104];
        Statics.field79 = new byte[4][104][104];
        Statics.field102 = new int[4][105][105];
        Statics.field89 = new byte[4][105][105];
        Statics.field1903 = new int[105][105];
        Statics.field155 = new int[104];
        Statics.field81 = new int[104];
        Statics.field970 = new int[104];
        Statics.field82 = new int[104];
        Statics.field1477 = new int[104];
    }

    @ObfuscatedName("eh.n(I)V")
    public static void method2844() {
        Statics.field98 = (byte[][][]) null;
        Statics.field1496 = (byte[][][]) null;
        Statics.field1785 = (byte[][][]) null;
        Statics.field79 = (byte[][][]) null;
        Statics.field102 = (int[][][]) null;
        Statics.field89 = (byte[][][]) null;
        Statics.field1903 = (int[][]) null;
        Statics.field155 = null;
        Statics.field81 = null;
        Statics.field970 = null;
        Statics.field82 = null;
        Statics.field1477 = null;
    }

    @ObfuscatedName("f.u(IIIII)V")
    public static final void method507(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field89[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field103[0][var5][var4] = field103[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field103[0][var5][var4] = field103[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field103[0][var5][var4] = field103[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field103[0][var5][var4] = field103[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.t([BIIIIIII[Lgq;B)V")
    public static final void method244(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class187[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2901[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class104 var11 = new class104(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class151.method2898(var13 & 0x7, var14 & 0x7, arg7);
                        int var19 = var13 & 0x7;
                        int var20 = var14 & 0x7;
                        int var22 = arg7 & 0x3;
                        int var23;
                        if (var22 == 0) {
                            var23 = var20;
                        } else if (var22 == 1) {
                            var23 = 7 - var19;
                        } else if (var22 == 2) {
                            var23 = 7 - var20;
                        } else {
                            var23 = var19;
                        }
                        method581(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method581(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.e(IIII)V")
    public static final void method529(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field103[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field103[arg0][arg1][arg2 + var5] = field103[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field103[arg0][arg1 + var6][arg2] = field103[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field103[arg0][arg1 - 1][arg2] != 0) {
            field103[arg0][arg1][arg2] = field103[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field103[arg0][arg1][arg2 - 1] != 0) {
            field103[arg0][arg1][arg2] = field103[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field103[arg0][arg1 - 1][arg2 - 1] != 0) {
            field103[arg0][arg1][arg2] = field103[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ad.a(Lcj;IIIIIII)V")
    public static final void method581(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2257();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2257();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2257();
                }
            }
            return;
        }
        field75[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2257();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field103[0][arg2][arg3] = -method116(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field103[arg1][arg2][arg3] = field103[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2257();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field103[0][arg2][arg3] = -var8 * 8;
                } else {
                    field103[arg1][arg2][arg3] = field103[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1496[arg1][arg2][arg3] = arg0.method2237();
                Statics.field1785[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field79[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field75[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field98[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ec.l([BIILbd;[Lgq;I)V")
    public static final void method2728(byte[] arg0, int arg1, int arg2, class76 arg3, class187[] arg4) {
        class104 var5 = new class104(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2204();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2204();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2257();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field75[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class187 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method575(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("e.v([BIIIIIIILbd;[Lgq;I)V")
    public static final void method42(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class76 arg8, class187[] arg9) {
        class104 var10 = new class104(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2204();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2204();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2257();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class33 var21 = class33.method115(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field828;
                    int var27 = var21.field836;
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
                    int var32 = arg3 + class151.method551(var16 & 0x7, var15 & 0x7, arg7, var21.field828, var21.field836, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field75[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class187 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method575(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.j(IIIIIILbd;Lgq;B)V")
    public static final void method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class76 arg6, class187 arg7) {
        if (client.field265 && (field75[0][arg1][arg2] & 0x2) == 0) {
            if ((field75[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field75[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field75[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field408 != var8) {
                return;
            }
        }
        if (arg0 < field77) {
            field77 = arg0;
        }
        class33 var9 = class33.method115(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field836;
            var11 = var9.field828;
        } else {
            var10 = var9.field828;
            var11 = var9.field836;
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
        int[][] var16 = field103[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field832 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field858 == 1) {
            var21 += 256;
        }
        if (var9.method653()) {
            class19 var22 = new class19();
            var22.field552 = arg0;
            var22.field553 = arg1 * 128;
            var22.field554 = arg2 * 128;
            int var23 = var9.field828;
            int var24 = var9.field836;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field836;
                var24 = var9.field828;
            }
            var22.field555 = (arg1 + var23) * 128;
            var22.field569 = (arg2 + var24) * 128;
            var22.field558 = var9.field857;
            var22.field565 = var9.field834 * 128;
            var22.field560 = var9.field859;
            var22.field561 = var9.field844;
            var22.field562 = var9.field837;
            if (var9.field842 != null) {
                var22.field559 = var9;
                var22.method519();
            }
            class19.field557.method3221(var22);
            if (var22.field562 != null) {
                var22.field556 = var22.field560 + (int) (Math.random() * (double) (var22.field561 - var22.field560));
            }
        }
        if (arg5 == 22) {
            if (!client.field265 || var9.field832 != 0 || var9.field830 == 1 || var9.field851) {
                class75 var25;
                if (var9.field840 == -1 && var9.field842 == null) {
                    var25 = var9.method646(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class10(arg3, 22, arg4, arg0, arg1, arg2, var9.field840, true, (class75) null);
                }
                arg6.method1623(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field830 == 1 && arg7 != null) {
                    arg7.method3445(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class75 var48;
            if (var9.field840 == -1 && var9.field842 == null) {
                var48 = var9.method646(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class10(arg3, 10, arg4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            if (var48 != null && arg6.method1617(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field816) {
                int var49 = 15;
                if (var48 instanceof class95) {
                    var49 = ((class95) var48).method1996() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field89[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field89[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field830 != 0 && arg7 != null) {
                arg7.method3443(arg1, arg2, var10, var11, var9.field831);
            }
        } else if (arg5 >= 12) {
            class75 var26;
            if (var9.field840 == -1 && var9.field842 == null) {
                var26 = var9.method646(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class10(arg3, arg5, arg4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1617(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field102[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field830 != 0 && arg7 != null) {
                arg7.method3443(arg1, arg2, var10, var11, var9.field831);
            }
        } else if (arg5 == 0) {
            class75 var27;
            if (var9.field840 == -1 && var9.field842 == null) {
                var27 = var9.method646(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class10(arg3, 0, arg4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1785(arg0, arg1, arg2, var17, var27, (class75) null, field86[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field816) {
                    Statics.field89[arg0][arg1][arg2] = 50;
                    Statics.field89[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field835) {
                    Statics.field102[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field816) {
                    Statics.field89[arg0][arg1][arg2 + 1] = 50;
                    Statics.field89[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field835) {
                    Statics.field102[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field816) {
                    Statics.field89[arg0][arg1 + 1][arg2] = 50;
                    Statics.field89[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field835) {
                    Statics.field102[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field816) {
                    Statics.field89[arg0][arg1][arg2] = 50;
                    Statics.field89[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field835) {
                    Statics.field102[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field830 != 0 && arg7 != null) {
                arg7.method3449(arg1, arg2, arg5, arg4, var9.field831);
            }
            if (var9.field823 != 16) {
                arg6.method1750(arg0, arg1, arg2, var9.field823);
            }
        } else if (arg5 == 1) {
            class75 var28;
            if (var9.field840 == -1 && var9.field842 == null) {
                var28 = var9.method646(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class10(arg3, 1, arg4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1785(arg0, arg1, arg2, var17, var28, (class75) null, field96[arg4], 0, var20, var21);
            if (var9.field816) {
                if (arg4 == 0) {
                    Statics.field89[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field89[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field89[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field89[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field830 != 0 && arg7 != null) {
                arg7.method3449(arg1, arg2, arg5, arg4, var9.field831);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class75 var30;
            class75 var31;
            if (var9.field840 == -1 && var9.field842 == null) {
                var30 = var9.method646(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method646(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class10(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field840, true, (class75) null);
                var31 = new class10(arg3, 2, var29, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1785(arg0, arg1, arg2, var17, var30, var31, field86[arg4], field86[var29], var20, var21);
            if (var9.field835) {
                if (arg4 == 0) {
                    Statics.field102[arg0][arg1][arg2] |= 0x249;
                    Statics.field102[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field102[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field102[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field102[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field102[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field102[arg0][arg1][arg2] |= 0x492;
                    Statics.field102[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field830 != 0 && arg7 != null) {
                arg7.method3449(arg1, arg2, arg5, arg4, var9.field831);
            }
            if (var9.field823 != 16) {
                arg6.method1750(arg0, arg1, arg2, var9.field823);
            }
        } else if (arg5 == 3) {
            class75 var32;
            if (var9.field840 == -1 && var9.field842 == null) {
                var32 = var9.method646(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class10(arg3, 3, arg4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1785(arg0, arg1, arg2, var17, var32, (class75) null, field96[arg4], 0, var20, var21);
            if (var9.field816) {
                if (arg4 == 0) {
                    Statics.field89[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field89[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field89[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field89[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field830 != 0 && arg7 != null) {
                arg7.method3449(arg1, arg2, arg5, arg4, var9.field831);
            }
        } else if (arg5 == 9) {
            class75 var33;
            if (var9.field840 == -1 && var9.field842 == null) {
                var33 = var9.method646(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class10(arg3, arg5, arg4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1617(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field830 != 0 && arg7 != null) {
                arg7.method3443(arg1, arg2, var10, var11, var9.field831);
            }
            if (var9.field823 != 16) {
                arg6.method1750(arg0, arg1, arg2, var9.field823);
            }
        } else if (arg5 == 4) {
            class75 var34;
            if (var9.field840 == -1 && var9.field842 == null) {
                var34 = var9.method646(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class10(arg3, 4, arg4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var34, (class75) null, field86[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1632(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class33.method115(var36 >> 14 & 0x7FFF).field823;
            }
            class75 var37;
            if (var9.field840 == -1 && var9.field842 == null) {
                var37 = var9.method646(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class10(arg3, 4, arg4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var37, (class75) null, field86[arg4], 0, field88[arg4] * var35, field76[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1632(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class33.method115(var39 >> 14 & 0x7FFF).field823 / 2;
            }
            class75 var40;
            if (var9.field840 == -1 && var9.field842 == null) {
                var40 = var9.method646(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class10(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var40, (class75) null, 256, arg4, field90[arg4] * var38, field91[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class75 var42;
            if (var9.field840 == -1 && var9.field842 == null) {
                var42 = var9.method646(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class10(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var42, (class75) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1632(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class33.method115(var44 >> 14 & 0x7FFF).field823 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class75 var46;
            class75 var47;
            if (var9.field840 == -1 && var9.field842 == null) {
                var46 = var9.method646(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method646(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class10(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field840, true, (class75) null);
                var47 = new class10(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field840, true, (class75) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field90[arg4] * var43, field91[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("es.k(Lbd;[Lgq;I)V")
    public static final void method2722(class76 arg0, class187[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field75[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field75[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3444(var3, var4);
                        }
                    }
                }
            }
        }
        field92 += (int) (Math.random() * 5.0D) - 2;
        if (field92 < -8) {
            field92 = -8;
        }
        if (field92 > 8) {
            field92 = 8;
        }
        field93 += (int) (Math.random() * 5.0D) - 2;
        if (field93 < -16) {
            field93 = -16;
        }
        if (field93 > 16) {
            field93 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field89[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field103[var6][var11 + 1][var10] - field103[var6][var11 - 1][var10];
                    int var13 = field103[var6][var11][var10 + 1] - field103[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1903[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field155[var20] = 0;
                Statics.field81[var20] = 0;
                Statics.field970[var20] = 0;
                Statics.field82[var20] = 0;
                Statics.field1477[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field98[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class34 var25 = class34.method2428(var24 - 1);
                            Statics.field155[var22] += var25.field868;
                            Statics.field81[var22] += var25.field869;
                            Statics.field970[var22] += var25.field870;
                            Statics.field82[var22] += var25.field871;
                            var10002 = Statics.field1477[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field98[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            int var28 = var27 - 1;
                            class34 var29 = (class34) class34.field873.method3183((long) var28);
                            class34 var30;
                            if (var29 == null) {
                                byte[] var31 = Statics.field872.method2768(1, var28);
                                class34 var32 = new class34();
                                if (var31 != null) {
                                    var32.method685(new class104(var31), var28);
                                }
                                var32.method690();
                                class34.field873.method3185(var32, (long) var28);
                                var30 = var32;
                            } else {
                                var30 = var29;
                            }
                            Statics.field155[var22] -= var30.field868;
                            Statics.field81[var22] -= var30.field869;
                            Statics.field970[var22] -= var30.field870;
                            Statics.field82[var22] -= var30.field871;
                            var10002 = Statics.field1477[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var34 = 0;
                    int var35 = 0;
                    int var36 = 0;
                    int var37 = 0;
                    int var38 = 0;
                    for (int var39 = -5; var39 < 109; var39++) {
                        int var40 = var39 + 5;
                        if (var40 >= 0 && var40 < 104) {
                            var34 += Statics.field155[var40];
                            var35 += Statics.field81[var40];
                            var36 += Statics.field970[var40];
                            var37 += Statics.field82[var40];
                            var38 += Statics.field1477[var40];
                        }
                        int var41 = var39 - 5;
                        if (var41 >= 0 && var41 < 104) {
                            var34 -= Statics.field155[var41];
                            var35 -= Statics.field81[var41];
                            var36 -= Statics.field970[var41];
                            var37 -= Statics.field82[var41];
                            var38 -= Statics.field1477[var41];
                        }
                        if (var39 >= 1 && var39 < 103) {
                            if (client.field265 && (field75[0][var21][var39] & 0x2) == 0) {
                                if ((field75[var6][var21][var39] & 0x10) != 0) {
                                    continue;
                                }
                                int var42;
                                if ((field75[var6][var21][var39] & 0x8) != 0) {
                                    var42 = 0;
                                } else if (var6 <= 0 || (field75[1][var21][var39] & 0x2) == 0) {
                                    var42 = var6;
                                } else {
                                    var42 = var6 - 1;
                                }
                                if (client.field408 != var42) {
                                    continue;
                                }
                            }
                            if (var6 < field77) {
                                field77 = var6;
                            }
                            int var43 = Statics.field98[var6][var21][var39] & 0xFF;
                            int var44 = Statics.field1496[var6][var21][var39] & 0xFF;
                            if (var43 > 0 || var44 > 0) {
                                int var45 = field103[var6][var21][var39];
                                int var46 = field103[var6][var21 + 1][var39];
                                int var47 = field103[var6][var21 + 1][var39 + 1];
                                int var48 = field103[var6][var21][var39 + 1];
                                int var49 = Statics.field1903[var21][var39];
                                int var50 = Statics.field1903[var21 + 1][var39];
                                int var51 = Statics.field1903[var21 + 1][var39 + 1];
                                int var52 = Statics.field1903[var21][var39 + 1];
                                int var53 = -1;
                                int var54 = -1;
                                if (var43 > 0) {
                                    int var55 = var34 * 256 / var37;
                                    int var56 = var35 / var38;
                                    int var57 = var36 / var38;
                                    var53 = method142(var55, var56, var57);
                                    int var58 = field92 + var55 & 0xFF;
                                    int var59 = field93 + var57;
                                    if (var59 < 0) {
                                        var59 = 0;
                                    } else if (var59 > 255) {
                                        var59 = 255;
                                    }
                                    var54 = method142(var58, var56, var59);
                                }
                                if (var6 > 0) {
                                    boolean var60 = true;
                                    if (var43 == 0 && Statics.field1785[var6][var21][var39] != 0) {
                                        var60 = false;
                                    }
                                    if (var44 > 0 && !class38.method2928(var44 - 1).field947) {
                                        var60 = false;
                                    }
                                    if (var60 && var45 == var46 && var45 == var47 && var45 == var48) {
                                        Statics.field102[var6][var21][var39] |= 0x924;
                                    }
                                }
                                int var61 = 0;
                                if (var54 != -1) {
                                    var61 = class81.field1430[method3161(var54, 96)];
                                }
                                if (var44 == 0) {
                                    arg0.method1638(var6, var21, var39, 0, 0, -1, var45, var46, var47, var48, method3161(var53, var49), method3161(var53, var50), method3161(var53, var51), method3161(var53, var52), 0, 0, 0, 0, var61, 0);
                                } else {
                                    int var62 = Statics.field1785[var6][var21][var39] + 1;
                                    byte var63 = Statics.field79[var6][var21][var39];
                                    class38 var64 = class38.method2928(var44 - 1);
                                    int var65 = var64.field933;
                                    int var66;
                                    int var67;
                                    if (var65 >= 0) {
                                        var66 = Statics.field1442.method1860(var65);
                                        var67 = -1;
                                    } else if (var64.field932 == 16711935) {
                                        var67 = -2;
                                        var65 = -1;
                                        var66 = -2;
                                    } else {
                                        var67 = method142(var64.field936, var64.field937, var64.field934);
                                        int var68 = field92 + var64.field936 & 0xFF;
                                        int var69 = field93 + var64.field934;
                                        if (var69 < 0) {
                                            var69 = 0;
                                        } else if (var69 > 255) {
                                            var69 = 255;
                                        }
                                        var66 = method142(var68, var64.field937, var69);
                                    }
                                    int var70 = 0;
                                    if (var66 != -2) {
                                        var70 = class81.field1430[method1979(var66, 96)];
                                    }
                                    if (var64.field935 != -1) {
                                        int var71 = field92 + var64.field939 & 0xFF;
                                        int var72 = field93 + var64.field941;
                                        if (var72 < 0) {
                                            var72 = 0;
                                        } else if (var72 > 255) {
                                            var72 = 255;
                                        }
                                        int var73 = method142(var71, var64.field940, var72);
                                        var70 = class81.field1430[method1979(var73, 96)];
                                    }
                                    arg0.method1638(var6, var21, var39, var62, var63, var65, var45, var46, var47, var48, method3161(var53, var49), method3161(var53, var50), method3161(var53, var51), method3161(var53, var52), method1979(var67, var49), method1979(var67, var50), method1979(var67, var51), method1979(var67, var52), var61, var70);
                                }
                            }
                        }
                    }
                }
            }
            for (int var74 = 1; var74 < 103; var74++) {
                for (int var75 = 1; var75 < 103; var75++) {
                    int var80;
                    if ((field75[var6][var75][var74] & 0x8) != 0) {
                        var80 = 0;
                    } else if (var6 <= 0 || (field75[1][var75][var74] & 0x2) == 0) {
                        var80 = var6;
                    } else {
                        var80 = var6 - 1;
                    }
                    arg0.method1611(var6, var75, var74, var80);
                }
            }
            Statics.field98[var6] = (byte[][]) null;
            Statics.field1496[var6] = (byte[][]) null;
            Statics.field1785[var6] = (byte[][]) null;
            Statics.field79[var6] = (byte[][]) null;
            Statics.field89[var6] = (byte[][]) null;
        }
        arg0.method1637(-50, -10, -50);
        for (int var81 = 0; var81 < 104; var81++) {
            for (int var82 = 0; var82 < 104; var82++) {
                if ((field75[1][var81][var82] & 0x2) == 2) {
                    arg0.method1671(var81, var82);
                }
            }
        }
        int var83 = 1;
        int var84 = 2;
        int var85 = 4;
        for (int var86 = 0; var86 < 4; var86++) {
            if (var86 > 0) {
                var83 <<= 0x3;
                var84 <<= 0x3;
                var85 <<= 0x3;
            }
            for (int var87 = 0; var87 <= var86; var87++) {
                for (int var88 = 0; var88 <= 104; var88++) {
                    for (int var89 = 0; var89 <= 104; var89++) {
                        if ((Statics.field102[var87][var89][var88] & var83) != 0) {
                            int var90 = var88;
                            int var91 = var88;
                            int var92 = var87;
                            int var93 = var87;
                            while (var90 > 0 && (Statics.field102[var87][var89][var90 - 1] & var83) != 0) {
                                var90--;
                            }
                            while (var91 < 104 && (Statics.field102[var87][var89][var91 + 1] & var83) != 0) {
                                var91++;
                            }
                            label360: while (var92 > 0) {
                                for (int var94 = var90; var94 <= var91; var94++) {
                                    if ((Statics.field102[var92 - 1][var89][var94] & var83) == 0) {
                                        break label360;
                                    }
                                }
                                var92--;
                            }
                            label349: while (var93 < var86) {
                                for (int var95 = var90; var95 <= var91; var95++) {
                                    if ((Statics.field102[var93 + 1][var89][var95] & var83) == 0) {
                                        break label349;
                                    }
                                }
                                var93++;
                            }
                            int var96 = (var93 + 1 - var92) * (var91 - var90 + 1);
                            if (var96 >= 8) {
                                short var97 = 240;
                                int var98 = field103[var93][var89][var90] - var97;
                                int var99 = field103[var92][var89][var90];
                                class76.method1621(var86, 1, var89 * 128, var89 * 128, var90 * 128, var91 * 128 + 128, var98, var99);
                                for (int var100 = var92; var100 <= var93; var100++) {
                                    for (int var101 = var90; var101 <= var91; var101++) {
                                        Statics.field102[var100][var89][var101] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field102[var87][var89][var88] & var84) != 0) {
                            int var102 = var89;
                            int var103 = var89;
                            int var104 = var87;
                            int var105 = var87;
                            while (var102 > 0 && (Statics.field102[var87][var102 - 1][var88] & var84) != 0) {
                                var102--;
                            }
                            while (var103 < 104 && (Statics.field102[var87][var103 + 1][var88] & var84) != 0) {
                                var103++;
                            }
                            label413: while (var104 > 0) {
                                for (int var106 = var102; var106 <= var103; var106++) {
                                    if ((Statics.field102[var104 - 1][var106][var88] & var84) == 0) {
                                        break label413;
                                    }
                                }
                                var104--;
                            }
                            label402: while (var105 < var86) {
                                for (int var107 = var102; var107 <= var103; var107++) {
                                    if ((Statics.field102[var105 + 1][var107][var88] & var84) == 0) {
                                        break label402;
                                    }
                                }
                                var105++;
                            }
                            int var108 = (var105 + 1 - var104) * (var103 - var102 + 1);
                            if (var108 >= 8) {
                                short var109 = 240;
                                int var110 = field103[var105][var102][var88] - var109;
                                int var111 = field103[var104][var102][var88];
                                class76.method1621(var86, 2, var102 * 128, var103 * 128 + 128, var88 * 128, var88 * 128, var110, var111);
                                for (int var112 = var104; var112 <= var105; var112++) {
                                    for (int var113 = var102; var113 <= var103; var113++) {
                                        Statics.field102[var112][var113][var88] &= ~var84;
                                    }
                                }
                            }
                        }
                        if ((Statics.field102[var87][var89][var88] & var85) != 0) {
                            int var114 = var89;
                            int var115 = var89;
                            int var116 = var88;
                            int var117 = var88;
                            while (var116 > 0 && (Statics.field102[var87][var89][var116 - 1] & var85) != 0) {
                                var116--;
                            }
                            while (var117 < 104 && (Statics.field102[var87][var89][var117 + 1] & var85) != 0) {
                                var117++;
                            }
                            label466: while (var114 > 0) {
                                for (int var118 = var116; var118 <= var117; var118++) {
                                    if ((Statics.field102[var87][var114 - 1][var118] & var85) == 0) {
                                        break label466;
                                    }
                                }
                                var114--;
                            }
                            label455: while (var115 < 104) {
                                for (int var119 = var116; var119 <= var117; var119++) {
                                    if ((Statics.field102[var87][var115 + 1][var119] & var85) == 0) {
                                        break label455;
                                    }
                                }
                                var115++;
                            }
                            if ((var115 - var114 + 1) * (var117 - var116 + 1) >= 4) {
                                int var120 = field103[var87][var114][var116];
                                class76.method1621(var86, 4, var114 * 128, var115 * 128 + 128, var116 * 128, var117 * 128 + 128, var120, var120);
                                for (int var121 = var114; var121 <= var115; var121++) {
                                    for (int var122 = var116; var122 <= var117; var122++) {
                                        Statics.field102[var87][var121][var122] &= ~var85;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.g(IIB)I")
    public static final int method116(int arg0, int arg1) {
        int var2 = method2729(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2729(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2729(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ec.d(IIIS)I")
    public static final int method2729(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2965(var3, var5);
        int var8 = method2965(var3 + 1, var5);
        int var9 = method2965(var3, var5 + 1);
        int var10 = method2965(var3 + 1, var5 + 1);
        int var11 = method986(var7, var8, var4, arg2);
        int var12 = method986(var9, var10, var4, arg2);
        return method986(var11, var12, var6, arg2);
    }

    @ObfuscatedName("al.b(IIIII)I")
    public static final int method986(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class81.field1446[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ei.i(IIB)I")
    public static final int method2965(int arg0, int arg1) {
        int var2 = method25(arg0 - 1, arg1 - 1) + method25(arg0 + 1, arg1 - 1) + method25(arg0 - 1, arg1 + 1) + method25(arg0 + 1, arg1 + 1);
        int var3 = method25(arg0 - 1, arg1) + method25(arg0 + 1, arg1) + method25(arg0, arg1 - 1) + method25(arg0, arg1 + 1);
        int var4 = method25(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("u.o(III)I")
    public static final int method25(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("fz.x(IIB)I")
    public static final int method3161(int arg0, int arg1) {
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

    @ObfuscatedName("cb.m(III)I")
    public static final int method1979(int arg0, int arg1) {
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

    @ObfuscatedName("k.f(IIIB)I")
    public static final int method142(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cb.q(III)Z")
    public static final boolean method1981(int arg0, int arg1) {
        class33 var2 = class33.method115(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method655(arg1);
    }
}
