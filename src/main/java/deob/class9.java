package deob;

@ObfuscatedName("n")
public final class class9 {

    @ObfuscatedName("n.j")
    public static int[][][] field140 = new int[4][105][105];

    @ObfuscatedName("n.f")
    public static byte[][][] field120 = new byte[4][104][104];

    @ObfuscatedName("n.o")
    public static int field121 = 99;

    @ObfuscatedName("n.k")
    public static final int[] field129 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("n.w")
    public static final int[] field130 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("n.z")
    public static final int[] field142 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("n.p")
    public static final int[] field145 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("n.v")
    public static final int[] field134 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("n.d")
    public static final int[] field119 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("n.e")
    public static int field133 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("n.y")
    public static int field136 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.j(B)V")
    public static void method36() {
        Statics.field1988 = (byte[][][]) null;
        Statics.field122 = (byte[][][]) null;
        Statics.field123 = (byte[][][]) null;
        Statics.field124 = (byte[][][]) null;
        Statics.field128 = (int[][][]) null;
        Statics.field749 = (byte[][][]) null;
        Statics.field125 = (int[][]) null;
        Statics.field2765 = null;
        Statics.field126 = null;
        Statics.field1041 = null;
        Statics.field1995 = null;
        Statics.field127 = null;
    }

    @ObfuscatedName("e.f(IIIIB)V")
    public static final void method213(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field749[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field140[0][var5][var4] = field140[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field140[0][var5][var4] = field140[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field140[0][var5][var4] = field140[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field140[0][var5][var4] = field140[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.o([BIIIIIII[Ldu;I)V")
    public static final void method33(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class130[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2054[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class127 var11 = new class127(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var18 = var13 & 0x7;
                        int var19 = var14 & 0x7;
                        int var21 = arg7 & 0x3;
                        int var22;
                        if (var21 == 0) {
                            var22 = var18;
                        } else if (var21 == 1) {
                            var22 = var19;
                        } else if (var21 == 2) {
                            var22 = 7 - var18;
                        } else {
                            var22 = 7 - var19;
                        }
                        int var25 = arg2 + var22;
                        int var27 = var13 & 0x7;
                        int var28 = var14 & 0x7;
                        int var30 = arg7 & 0x3;
                        int var31;
                        if (var30 == 0) {
                            var31 = var28;
                        } else if (var30 == 1) {
                            var31 = 7 - var27;
                        } else if (var30 == 2) {
                            var31 = 7 - var28;
                        } else {
                            var31 = var27;
                        }
                        method216(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method216(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.h(IIIS)V")
    public static final void method87(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field140[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field140[arg0][arg1][arg2 + var5] = field140[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field140[arg0][arg1 + var6][arg2] = field140[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field140[arg0][arg1 - 1][arg2] != 0) {
            field140[arg0][arg1][arg2] = field140[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field140[arg0][arg1][arg2 - 1] != 0) {
            field140[arg0][arg1][arg2] = field140[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field140[arg0][arg1 - 1][arg2 - 1] != 0) {
            field140[arg0][arg1][arg2] = field140[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("e.u(Ldq;IIIIIII)V")
    public static final void method216(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2464();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2464();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2464();
                }
            }
            return;
        }
        field120[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2464();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field140[0][arg2][arg3] = -method711(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field140[arg1][arg2][arg3] = field140[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2464();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field140[0][arg2][arg3] = -var8 * 8;
                } else {
                    field140[arg1][arg2][arg3] = field140[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field122[arg1][arg2][arg3] = arg0.method2449();
                Statics.field123[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field124[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field120[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1988[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dv.q([BIIIIIIILcv;[Ldu;I)V")
    public static final void method2233(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, class130[] arg9) {
        class127 var10 = new class127(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2635();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2635();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2464();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class32 var21 = class32.method1406(var11);
                    int var22 = arg2 + class161.method3023(var16 & 0x7, var15 & 0x7, arg7, var21.field817, var21.field818, var20);
                    int var23 = arg3 + class161.method2403(var16 & 0x7, var15 & 0x7, arg7, var21.field817, var21.field818, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field120[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class130 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method202(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.t(IIIIIILcv;Ldu;B)V")
    public static final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field478 && (field120[0][arg1][arg2] & 0x2) == 0) {
            if ((field120[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1495(arg0, arg1, arg2) != client.field525) {
                return;
            }
        }
        if (arg0 < field121) {
            field121 = arg0;
        }
        class32 var8 = class32.method1406(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field818;
            var10 = var8.field817;
        } else {
            var9 = var8.field817;
            var10 = var8.field818;
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
        int[][] var15 = field140[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field821 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field842 == 1) {
            var20 += 256;
        }
        if (var8.method697()) {
            class7 var21 = new class7();
            var21.field88 = arg0;
            var21.field89 = arg1 * 128;
            var21.field107 = arg2 * 128;
            int var22 = var8.field817;
            int var23 = var8.field818;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field818;
                var23 = var8.field817;
            }
            var21.field91 = (arg1 + var22) * 128;
            var21.field92 = (arg2 + var23) * 128;
            var21.field94 = var8.field827;
            var21.field93 = var8.field840 * 128;
            var21.field96 = var8.field848;
            var21.field90 = var8.field849;
            var21.field98 = var8.field830;
            if (var8.field843 != null) {
                var21.field97 = var8;
                var21.method47();
            }
            class7.field101.method3312(var21);
            if (var21.field98 != null) {
                var21.field99 = var21.field96 + (int) (Math.random() * (double) (var21.field90 - var21.field96));
            }
        }
        if (arg5 == 22) {
            if (!client.field478 || var8.field821 != 0 || var8.field819 == 1 || var8.field825) {
                class94 var24;
                if (var8.field836 == -1 && var8.field843 == null) {
                    var24 = var8.method663(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field836, true, (class94) null);
                }
                arg6.method1896(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field819 == 1 && arg7 != null) {
                    arg7.method2691(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var47;
            if (var8.field836 == -1 && var8.field843 == null) {
                var47 = var8.method663(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            if (var47 != null && arg6.method1900(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field833) {
                int var48 = 15;
                if (var47 instanceof class112) {
                    var48 = ((class112) var47).method2242() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field749[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field749[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field819 != 0 && arg7 != null) {
                arg7.method2685(arg1, arg2, var9, var10, var8.field801);
            }
        } else if (arg5 >= 12) {
            class94 var25;
            if (var8.field836 == -1 && var8.field843 == null) {
                var25 = var8.method663(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1900(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field128[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field819 != 0 && arg7 != null) {
                arg7.method2685(arg1, arg2, var9, var10, var8.field801);
            }
        } else if (arg5 == 0) {
            class94 var26;
            if (var8.field836 == -1 && var8.field843 == null) {
                var26 = var8.method663(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, var26, (class94) null, field129[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field833) {
                    Statics.field749[arg0][arg1][arg2] = 50;
                    Statics.field749[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field834) {
                    Statics.field128[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field833) {
                    Statics.field749[arg0][arg1][arg2 + 1] = 50;
                    Statics.field749[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field834) {
                    Statics.field128[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field833) {
                    Statics.field749[arg0][arg1 + 1][arg2] = 50;
                    Statics.field749[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field834) {
                    Statics.field128[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field833) {
                    Statics.field749[arg0][arg1][arg2] = 50;
                    Statics.field749[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field834) {
                    Statics.field128[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field819 != 0 && arg7 != null) {
                arg7.method2684(arg1, arg2, arg5, arg4, var8.field801);
            }
            if (var8.field826 != 16) {
                arg6.method1950(arg0, arg1, arg2, var8.field826);
            }
        } else if (arg5 == 1) {
            class94 var27;
            if (var8.field836 == -1 && var8.field843 == null) {
                var27 = var8.method663(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, var27, (class94) null, field130[arg4], 0, var19, var20);
            if (var8.field833) {
                if (arg4 == 0) {
                    Statics.field749[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field749[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field749[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field749[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field819 != 0 && arg7 != null) {
                arg7.method2684(arg1, arg2, arg5, arg4, var8.field801);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class94 var29;
            class94 var30;
            if (var8.field836 == -1 && var8.field843 == null) {
                var29 = var8.method663(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method663(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field836, true, (class94) null);
                var30 = new class14(arg3, 2, var28, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, var29, var30, field129[arg4], field129[var28], var19, var20);
            if (var8.field834) {
                if (arg4 == 0) {
                    Statics.field128[arg0][arg1][arg2] |= 0x249;
                    Statics.field128[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field128[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field128[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field128[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field128[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field128[arg0][arg1][arg2] |= 0x492;
                    Statics.field128[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field819 != 0 && arg7 != null) {
                arg7.method2684(arg1, arg2, arg5, arg4, var8.field801);
            }
            if (var8.field826 != 16) {
                arg6.method1950(arg0, arg1, arg2, var8.field826);
            }
        } else if (arg5 == 3) {
            class94 var31;
            if (var8.field836 == -1 && var8.field843 == null) {
                var31 = var8.method663(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, var31, (class94) null, field130[arg4], 0, var19, var20);
            if (var8.field833) {
                if (arg4 == 0) {
                    Statics.field749[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field749[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field749[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field749[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field819 != 0 && arg7 != null) {
                arg7.method2684(arg1, arg2, arg5, arg4, var8.field801);
            }
        } else if (arg5 == 9) {
            class94 var32;
            if (var8.field836 == -1 && var8.field843 == null) {
                var32 = var8.method663(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1900(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field819 != 0 && arg7 != null) {
                arg7.method2685(arg1, arg2, var9, var10, var8.field801);
            }
            if (var8.field826 != 16) {
                arg6.method1950(arg0, arg1, arg2, var8.field826);
            }
        } else if (arg5 == 4) {
            class94 var33;
            if (var8.field836 == -1 && var8.field843 == null) {
                var33 = var8.method663(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var33, (class94) null, field129[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1916(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class32.method1406(var35 >> 14 & 0x7FFF).field826;
            }
            class94 var36;
            if (var8.field836 == -1 && var8.field843 == null) {
                var36 = var8.method663(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var36, (class94) null, field129[arg4], 0, field142[arg4] * var34, field145[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1916(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class32.method1406(var38 >> 14 & 0x7FFF).field826 / 2;
            }
            class94 var39;
            if (var8.field836 == -1 && var8.field843 == null) {
                var39 = var8.method663(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var39, (class94) null, 256, arg4, field134[arg4] * var37, field119[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class94 var41;
            if (var8.field836 == -1 && var8.field843 == null) {
                var41 = var8.method663(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class14(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var41, (class94) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1916(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class32.method1406(var43 >> 14 & 0x7FFF).field826 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class94 var45;
            class94 var46;
            if (var8.field836 == -1 && var8.field843 == null) {
                var45 = var8.method663(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method663(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field836, true, (class94) null);
                var46 = new class14(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field836, true, (class94) null);
            }
            arg6.method1959(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field134[arg4] * var42, field119[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cl.n(Lcv;[Ldu;I)V")
    public static final void method1580(class95 arg0, class130[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field120[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field120[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2686(var3, var4);
                        }
                    }
                }
            }
        }
        field133 += (int) (Math.random() * 5.0D) - 2;
        if (field133 < -8) {
            field133 = -8;
        }
        if (field133 > 8) {
            field133 = 8;
        }
        field136 += (int) (Math.random() * 5.0D) - 2;
        if (field136 < -16) {
            field136 = -16;
        }
        if (field136 > 16) {
            field136 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field749[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field140[var6][var11 + 1][var10] - field140[var6][var11 - 1][var10];
                    int var13 = field140[var6][var11][var10 + 1] - field140[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field125[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field2765[var20] = 0;
                Statics.field126[var20] = 0;
                Statics.field1041[var20] = 0;
                Statics.field1995[var20] = 0;
                Statics.field127[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field1988[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class33 var25 = class33.method2318(var24 - 1);
                            Statics.field2765[var22] += var25.field870;
                            Statics.field126[var22] += var25.field860;
                            Statics.field1041[var22] += var25.field863;
                            Statics.field1995[var22] += var25.field862;
                            var10002 = Statics.field127[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field1988[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class33 var28 = class33.method2318(var27 - 1);
                            Statics.field2765[var22] -= var28.field870;
                            Statics.field126[var22] -= var28.field860;
                            Statics.field1041[var22] -= var28.field863;
                            Statics.field1995[var22] -= var28.field862;
                            var10002 = Statics.field127[var22]--;
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
                            var29 += Statics.field2765[var35];
                            var30 += Statics.field126[var35];
                            var31 += Statics.field1041[var35];
                            var32 += Statics.field1995[var35];
                            var33 += Statics.field127[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field2765[var36];
                            var30 -= Statics.field126[var36];
                            var31 -= Statics.field1041[var36];
                            var32 -= Statics.field1995[var36];
                            var33 -= Statics.field127[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field478 || (field120[0][var21][var34] & 0x2) != 0 || (field120[var6][var21][var34] & 0x10) == 0 && method1495(var6, var21, var34) == client.field525)) {
                            if (var6 < field121) {
                                field121 = var6;
                            }
                            int var37 = Statics.field1988[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field122[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field140[var6][var21][var34];
                                int var40 = field140[var6][var21 + 1][var34];
                                int var41 = field140[var6][var21 + 1][var34 + 1];
                                int var42 = field140[var6][var21][var34 + 1];
                                int var43 = Statics.field125[var21][var34];
                                int var44 = Statics.field125[var21 + 1][var34];
                                int var45 = Statics.field125[var21 + 1][var34 + 1];
                                int var46 = Statics.field125[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method1876(var49, var50, var51);
                                    int var52 = field133 + var49 & 0xFF;
                                    int var53 = field136 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method1876(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field123[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class37.method142(var38 - 1).field946) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field128[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class104.field1786[method1577(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1895(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method1577(var47, var43), method1577(var47, var44), method1577(var47, var45), method1577(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field123[var6][var21][var34] + 1;
                                    byte var57 = Statics.field124[var6][var21][var34];
                                    class37 var58 = class37.method142(var38 - 1);
                                    int var59 = var58.field938;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1787.method2212(var59);
                                        var61 = -1;
                                    } else if (var58.field937 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method1876(var58.field941, var58.field939, var58.field942);
                                        int var62 = field133 + var58.field941 & 0xFF;
                                        int var63 = field136 + var58.field942;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method1876(var62, var58.field939, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class104.field1786[method1630(var60, 96)];
                                    }
                                    if (var58.field935 != -1) {
                                        int var65 = field133 + var58.field944 & 0xFF;
                                        int var66 = field136 + var58.field943;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method1876(var65, var58.field936, var66);
                                        var64 = class104.field1786[method1630(var67, 96)];
                                    }
                                    arg0.method1895(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method1577(var47, var43), method1577(var47, var44), method1577(var47, var45), method1577(var47, var46), method1630(var61, var43), method1630(var61, var44), method1630(var61, var45), method1630(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method1986(var6, var69, var68, method1495(var6, var69, var68));
                }
            }
            Statics.field1988[var6] = (byte[][]) null;
            Statics.field122[var6] = (byte[][]) null;
            Statics.field123[var6] = (byte[][]) null;
            Statics.field124[var6] = (byte[][]) null;
            Statics.field749[var6] = (byte[][]) null;
        }
        arg0.method1983(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field120[1][var70][var71] & 0x2) == 2) {
                    arg0.method1893(var70, var71);
                }
            }
        }
        int var72 = 1;
        int var73 = 2;
        int var74 = 4;
        for (int var75 = 0; var75 < 4; var75++) {
            if (var75 > 0) {
                var72 <<= 0x3;
                var73 <<= 0x3;
                var74 <<= 0x3;
            }
            for (int var76 = 0; var76 <= var75; var76++) {
                for (int var77 = 0; var77 <= 104; var77++) {
                    for (int var78 = 0; var78 <= 104; var78++) {
                        if ((Statics.field128[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field128[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field128[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label339: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field128[var81 - 1][var78][var83] & var72) == 0) {
                                        break label339;
                                    }
                                }
                                var81--;
                            }
                            label328: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field128[var82 + 1][var78][var84] & var72) == 0) {
                                        break label328;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field140[var82][var78][var79] - var86;
                                int var88 = field140[var81][var78][var79];
                                class95.method1912(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field128[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field128[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field128[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field128[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label392: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field128[var93 - 1][var95][var77] & var73) == 0) {
                                        break label392;
                                    }
                                }
                                var93--;
                            }
                            label381: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field128[var94 + 1][var96][var77] & var73) == 0) {
                                        break label381;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field140[var94][var91][var77] - var98;
                                int var100 = field140[var93][var91][var77];
                                class95.method1912(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field128[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field128[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field128[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field128[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label445: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field128[var76][var103 - 1][var107] & var74) == 0) {
                                        break label445;
                                    }
                                }
                                var103--;
                            }
                            label434: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field128[var76][var104 + 1][var108] & var74) == 0) {
                                        break label434;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field140[var76][var103][var105];
                                class95.method1912(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field128[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bn.i(IIII)I")
    public static int method1495(int arg0, int arg1, int arg2) {
        if ((field120[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field120[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("al.c(III)I")
    public static final int method711(int arg0, int arg1) {
        int var2 = method139(arg0 + 45365, arg1 + 91923, 4) - 128 + (method139(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method139(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("g.b(IIII)I")
    public static final int method139(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method145(var3, var5);
        int var8 = method145(var3 + 1, var5);
        int var9 = method145(var3, var5 + 1);
        int var10 = method145(var3 + 1, var5 + 1);
        int var11 = method2317(var7, var8, var4, arg2);
        int var12 = method2317(var9, var10, var4, arg2);
        return method2317(var11, var12, var6, arg2);
    }

    @ObfuscatedName("dx.m(IIIII)I")
    public static final int method2317(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1791[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("r.g(IIB)I")
    public static final int method145(int arg0, int arg1) {
        int var2 = method1530(arg0 - 1, arg1 - 1) + method1530(arg0 + 1, arg1 - 1) + method1530(arg0 - 1, arg1 + 1) + method1530(arg0 + 1, arg1 + 1);
        int var3 = method1530(arg0 - 1, arg1) + method1530(arg0 + 1, arg1) + method1530(arg0, arg1 - 1) + method1530(arg0, arg1 + 1);
        int var4 = method1530(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bg.x(IIB)I")
    public static final int method1530(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cl.r(III)I")
    public static final int method1577(int arg0, int arg1) {
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

    @ObfuscatedName("cc.s(III)I")
    public static final int method1630(int arg0, int arg1) {
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

    @ObfuscatedName("cw.l(IIII)I")
    public static final int method1876(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("db.k(IIB)Z")
    public static final boolean method2397(int arg0, int arg1) {
        class32 var2 = class32.method1406(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method661(arg1);
    }
}
