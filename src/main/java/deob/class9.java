package deob;

@ObfuscatedName("c")
public final class class9 {

    @ObfuscatedName("c.p")
    public static int[][][] field136 = new int[4][105][105];

    @ObfuscatedName("c.i")
    public static byte[][][] field120 = new byte[4][104][104];

    @ObfuscatedName("c.o")
    public static int field143 = 99;

    @ObfuscatedName("c.b")
    public static final int[] field126 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("c.j")
    public static final int[] field130 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("c.h")
    public static final int[] field131 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("c.m")
    public static final int[] field132 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("c.y")
    public static final int[] field133 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("c.t")
    public static final int[] field127 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("c.k")
    public static int field135 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("c.z")
    public static int field142 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.p(I)V")
    public static void method1387() {
        field143 = 99;
        Statics.field134 = new byte[4][104][104];
        Statics.field271 = new byte[4][104][104];
        Statics.field123 = new byte[4][104][104];
        Statics.field124 = new byte[4][104][104];
        Statics.field139 = new int[4][105][105];
        Statics.field125 = new byte[4][105][105];
        Statics.field2032 = new int[105][105];
        Statics.field268 = new int[104];
        Statics.field2708 = new int[104];
        Statics.field1312 = new int[104];
        Statics.field137 = new int[104];
        Statics.field2324 = new int[104];
    }

    @ObfuscatedName("by.i(I)V")
    public static void method1397() {
        Statics.field134 = (byte[][][]) null;
        Statics.field271 = (byte[][][]) null;
        Statics.field123 = (byte[][][]) null;
        Statics.field124 = (byte[][][]) null;
        Statics.field139 = (int[][][]) null;
        Statics.field125 = (byte[][][]) null;
        Statics.field2032 = (int[][]) null;
        Statics.field268 = null;
        Statics.field2708 = null;
        Statics.field1312 = null;
        Statics.field137 = null;
        Statics.field2324 = null;
    }

    @ObfuscatedName("dm.n([BIIIIIII[Lfn;I)V")
    public static final void method2428(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2752[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
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
                        method1308(var11, arg1, arg2 + var22, arg3 + class160.method40(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1308(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.l(IIII)V")
    public static final void method829(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field136[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field136[arg0][arg1][arg2 + var5] = field136[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field136[arg0][arg1 + var6][arg2] = field136[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field136[arg0][arg1 - 1][arg2] != 0) {
            field136[arg0][arg1][arg2] = field136[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field136[arg0][arg1][arg2 - 1] != 0) {
            field136[arg0][arg1][arg2] = field136[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field136[arg0][arg1 - 1][arg2 - 1] != 0) {
            field136[arg0][arg1][arg2] = field136[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("bb.v(Ldt;IIIIIIB)V")
    public static final void method1308(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2659();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2659();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2659();
                }
            }
            return;
        }
        field120[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2659();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field136[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2726(var10 + 45365, var11 + 91923, 4) - 128 + (method2726(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2726(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field136[arg1][arg2][arg3] = field136[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2659();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field136[0][arg2][arg3] = -var15 * 8;
                } else {
                    field136[arg1][arg2][arg3] = field136[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field271[arg1][arg2][arg3] = arg0.method2656();
                Statics.field123[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field124[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field120[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field134[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("o.g([BIILcq;[Lfn;B)V")
    public static final void method31(byte[] arg0, int arg1, int arg2, class95 arg3, class164[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2501();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2501();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2659();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field120[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class164 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1434(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bu.x(IIIIIILcq;Lfn;B)V")
    public static final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field477 && (field120[0][arg1][arg2] & 0x2) == 0) {
            if ((field120[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field120[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field120[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field524 != var8) {
                return;
            }
        }
        if (arg0 < field143) {
            field143 = arg0;
        }
        class32 var9 = class32.method3258(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field854;
            var11 = var9.field829;
        } else {
            var10 = var9.field829;
            var11 = var9.field854;
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
        int[][] var16 = field136[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field832 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field826 == 1) {
            var21 += 256;
        }
        if (var9.method678()) {
            class7 var22 = new class7();
            var22.field102 = arg0;
            var22.field92 = arg1 * 128;
            var22.field93 = arg2 * 128;
            int var23 = var9.field829;
            int var24 = var9.field854;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field854;
                var24 = var9.field829;
            }
            var22.field94 = (arg1 + var23) * 128;
            var22.field96 = (arg2 + var24) * 128;
            var22.field97 = var9.field823;
            var22.field91 = var9.field859 * 128;
            var22.field99 = var9.field860;
            var22.field100 = var9.field861;
            var22.field105 = var9.field862;
            if (var9.field855 != null) {
                var22.field104 = var9;
                var22.method53();
            }
            class7.field106.method3328(var22);
            if (var22.field105 != null) {
                var22.field90 = var22.field99 + (int) (Math.random() * (double) (var22.field100 - var22.field99));
            }
        }
        if (arg5 == 22) {
            if (!client.field477 || var9.field832 != 0 || var9.field816 == 1 || var9.field852) {
                class94 var25;
                if (var9.field836 == -1 && var9.field855 == null) {
                    var25 = var9.method673(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field836, true, (class94) null);
                }
                arg6.method1925(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field816 == 1 && arg7 != null) {
                    arg7.method3221(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var48;
            if (var9.field836 == -1 && var9.field855 == null) {
                var48 = var9.method673(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            if (var48 != null && arg6.method1991(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field844) {
                int var49 = 15;
                if (var48 instanceof class112) {
                    var49 = ((class112) var48).method2273() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field125[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field125[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field816 != 0 && arg7 != null) {
                arg7.method3219(arg1, arg2, var10, var11, var9.field831);
            }
        } else if (arg5 >= 12) {
            class94 var26;
            if (var9.field836 == -1 && var9.field855 == null) {
                var26 = var9.method673(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1991(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field139[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field816 != 0 && arg7 != null) {
                arg7.method3219(arg1, arg2, var10, var11, var9.field831);
            }
        } else if (arg5 == 0) {
            class94 var27;
            if (var9.field836 == -1 && var9.field855 == null) {
                var27 = var9.method673(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1962(arg0, arg1, arg2, var17, var27, (class94) null, field126[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field844) {
                    Statics.field125[arg0][arg1][arg2] = 50;
                    Statics.field125[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field835) {
                    Statics.field139[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field844) {
                    Statics.field125[arg0][arg1][arg2 + 1] = 50;
                    Statics.field125[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field835) {
                    Statics.field139[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field844) {
                    Statics.field125[arg0][arg1 + 1][arg2] = 50;
                    Statics.field125[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field835) {
                    Statics.field139[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field844) {
                    Statics.field125[arg0][arg1][arg2] = 50;
                    Statics.field125[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field835) {
                    Statics.field139[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field816 != 0 && arg7 != null) {
                arg7.method3251(arg1, arg2, arg5, arg4, var9.field831);
            }
            if (var9.field837 != 16) {
                arg6.method1935(arg0, arg1, arg2, var9.field837);
            }
        } else if (arg5 == 1) {
            class94 var28;
            if (var9.field836 == -1 && var9.field855 == null) {
                var28 = var9.method673(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1962(arg0, arg1, arg2, var17, var28, (class94) null, field130[arg4], 0, var20, var21);
            if (var9.field844) {
                if (arg4 == 0) {
                    Statics.field125[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field125[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field125[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field125[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field816 != 0 && arg7 != null) {
                arg7.method3251(arg1, arg2, arg5, arg4, var9.field831);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class94 var30;
            class94 var31;
            if (var9.field836 == -1 && var9.field855 == null) {
                var30 = var9.method673(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method673(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field836, true, (class94) null);
                var31 = new class14(arg3, 2, var29, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1962(arg0, arg1, arg2, var17, var30, var31, field126[arg4], field126[var29], var20, var21);
            if (var9.field835) {
                if (arg4 == 0) {
                    Statics.field139[arg0][arg1][arg2] |= 0x249;
                    Statics.field139[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field139[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field139[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field139[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field139[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field139[arg0][arg1][arg2] |= 0x492;
                    Statics.field139[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field816 != 0 && arg7 != null) {
                arg7.method3251(arg1, arg2, arg5, arg4, var9.field831);
            }
            if (var9.field837 != 16) {
                arg6.method1935(arg0, arg1, arg2, var9.field837);
            }
        } else if (arg5 == 3) {
            class94 var32;
            if (var9.field836 == -1 && var9.field855 == null) {
                var32 = var9.method673(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1962(arg0, arg1, arg2, var17, var32, (class94) null, field130[arg4], 0, var20, var21);
            if (var9.field844) {
                if (arg4 == 0) {
                    Statics.field125[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field125[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field125[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field125[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field816 != 0 && arg7 != null) {
                arg7.method3251(arg1, arg2, arg5, arg4, var9.field831);
            }
        } else if (arg5 == 9) {
            class94 var33;
            if (var9.field836 == -1 && var9.field855 == null) {
                var33 = var9.method673(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1991(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field816 != 0 && arg7 != null) {
                arg7.method3219(arg1, arg2, var10, var11, var9.field831);
            }
            if (var9.field837 != 16) {
                arg6.method1935(arg0, arg1, arg2, var9.field837);
            }
        } else if (arg5 == 4) {
            class94 var34;
            if (var9.field836 == -1 && var9.field855 == null) {
                var34 = var9.method673(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1983(arg0, arg1, arg2, var17, var34, (class94) null, field126[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1945(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method3258(var36 >> 14 & 0x7FFF).field837;
            }
            class94 var37;
            if (var9.field836 == -1 && var9.field855 == null) {
                var37 = var9.method673(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1983(arg0, arg1, arg2, var17, var37, (class94) null, field126[arg4], 0, field131[arg4] * var35, field132[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1945(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class32.method3258(var39 >> 14 & 0x7FFF).field837 / 2;
            }
            class94 var40;
            if (var9.field836 == -1 && var9.field855 == null) {
                var40 = var9.method673(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1983(arg0, arg1, arg2, var17, var40, (class94) null, 256, arg4, field133[arg4] * var38, field127[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            if (var9.field836 == -1 && var9.field855 == null) {
                var42 = var9.method673(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1983(arg0, arg1, arg2, var17, var42, (class94) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1945(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class32.method3258(var44 >> 14 & 0x7FFF).field837 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class94 var46;
            class94 var47;
            if (var9.field836 == -1 && var9.field855 == null) {
                var46 = var9.method673(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method673(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field836, true, (class94) null);
                var47 = new class14(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field836, true, (class94) null);
            }
            arg6.method1983(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field133[arg4] * var43, field127[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("w.c(Lcq;[Lfn;I)V")
    public static final void method156(class95 arg0, class164[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field120[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field120[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3220(var3, var4);
                        }
                    }
                }
            }
        }
        field135 += (int) (Math.random() * 5.0D) - 2;
        if (field135 < -8) {
            field135 = -8;
        }
        if (field135 > 8) {
            field135 = 8;
        }
        field142 += (int) (Math.random() * 5.0D) - 2;
        if (field142 < -16) {
            field142 = -16;
        }
        if (field142 > 16) {
            field142 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field125[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field136[var6][var11 + 1][var10] - field136[var6][var11 - 1][var10];
                    int var13 = field136[var6][var11][var10 + 1] - field136[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2032[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field268[var20] = 0;
                Statics.field2708[var20] = 0;
                Statics.field1312[var20] = 0;
                Statics.field137[var20] = 0;
                Statics.field2324[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field134[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class33 var26 = (class33) class33.field869.method3264((long) var25);
                            class33 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field872.method3049(1, var25);
                                class33 var29 = new class33();
                                if (var28 != null) {
                                    var29.method715(new class127(var28), var25);
                                }
                                var29.method723();
                                class33.field869.method3269(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field268[var22] += var27.field867;
                            Statics.field2708[var22] += var27.field868;
                            Statics.field1312[var22] += var27.field875;
                            Statics.field137[var22] += var27.field870;
                            var10002 = Statics.field2324[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field134[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class33 var34 = (class33) class33.field869.method3264((long) var33);
                            class33 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field872.method3049(1, var33);
                                class33 var37 = new class33();
                                if (var36 != null) {
                                    var37.method715(new class127(var36), var33);
                                }
                                var37.method723();
                                class33.field869.method3269(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field268[var22] -= var35.field867;
                            Statics.field2708[var22] -= var35.field868;
                            Statics.field1312[var22] -= var35.field875;
                            Statics.field137[var22] -= var35.field870;
                            var10002 = Statics.field2324[var22]--;
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
                            var39 += Statics.field268[var45];
                            var40 += Statics.field2708[var45];
                            var41 += Statics.field1312[var45];
                            var42 += Statics.field137[var45];
                            var43 += Statics.field2324[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field268[var46];
                            var40 -= Statics.field2708[var46];
                            var41 -= Statics.field1312[var46];
                            var42 -= Statics.field137[var46];
                            var43 -= Statics.field2324[var46];
                        }
                        if (var44 >= 1 && var44 < 103) {
                            if (client.field477 && (field120[0][var21][var44] & 0x2) == 0) {
                                if ((field120[var6][var21][var44] & 0x10) != 0) {
                                    continue;
                                }
                                int var47;
                                if ((field120[var6][var21][var44] & 0x8) != 0) {
                                    var47 = 0;
                                } else if (var6 <= 0 || (field120[1][var21][var44] & 0x2) == 0) {
                                    var47 = var6;
                                } else {
                                    var47 = var6 - 1;
                                }
                                if (client.field524 != var47) {
                                    continue;
                                }
                            }
                            if (var6 < field143) {
                                field143 = var6;
                            }
                            int var48 = Statics.field134[var6][var21][var44] & 0xFF;
                            int var49 = Statics.field271[var6][var21][var44] & 0xFF;
                            if (var48 > 0 || var49 > 0) {
                                int var50 = field136[var6][var21][var44];
                                int var51 = field136[var6][var21 + 1][var44];
                                int var52 = field136[var6][var21 + 1][var44 + 1];
                                int var53 = field136[var6][var21][var44 + 1];
                                int var54 = Statics.field2032[var21][var44];
                                int var55 = Statics.field2032[var21 + 1][var44];
                                int var56 = Statics.field2032[var21 + 1][var44 + 1];
                                int var57 = Statics.field2032[var21][var44 + 1];
                                int var58 = -1;
                                int var59 = -1;
                                if (var48 > 0) {
                                    int var60 = var39 * 256 / var42;
                                    int var61 = var40 / var43;
                                    int var62 = var41 / var43;
                                    var58 = method167(var60, var61, var62);
                                    int var63 = field135 + var60 & 0xFF;
                                    int var64 = field142 + var62;
                                    if (var64 < 0) {
                                        var64 = 0;
                                    } else if (var64 > 255) {
                                        var64 = 255;
                                    }
                                    var59 = method167(var63, var61, var64);
                                }
                                if (var6 > 0) {
                                    boolean var65 = true;
                                    if (var48 == 0 && Statics.field123[var6][var21][var44] != 0) {
                                        var65 = false;
                                    }
                                    if (var49 > 0 && !class37.method1388(var49 - 1).field945) {
                                        var65 = false;
                                    }
                                    if (var65 && var50 == var51 && var50 == var52 && var50 == var53) {
                                        Statics.field139[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var66 = 0;
                                if (var59 != -1) {
                                    var66 = class104.field1767[method826(var59, 96)];
                                }
                                if (var49 == 0) {
                                    arg0.method1929(var6, var21, var44, 0, 0, -1, var50, var51, var52, var53, method826(var58, var54), method826(var58, var55), method826(var58, var56), method826(var58, var57), 0, 0, 0, 0, var66, 0);
                                } else {
                                    int var67 = Statics.field123[var6][var21][var44] + 1;
                                    byte var68 = Statics.field124[var6][var21][var44];
                                    class37 var69 = class37.method1388(var49 - 1);
                                    int var70 = var69.field947;
                                    int var71;
                                    int var72;
                                    if (var70 >= 0) {
                                        var71 = Statics.field1787.method2233(var70);
                                        var72 = -1;
                                    } else if (var69.field946 == 16711935) {
                                        var72 = -2;
                                        var70 = -1;
                                        var71 = -2;
                                    } else {
                                        var72 = method167(var69.field957, var69.field948, var69.field949);
                                        int var73 = field135 + var69.field957 & 0xFF;
                                        int var74 = field142 + var69.field949;
                                        if (var74 < 0) {
                                            var74 = 0;
                                        } else if (var74 > 255) {
                                            var74 = 255;
                                        }
                                        var71 = method167(var73, var69.field948, var74);
                                    }
                                    int var75 = 0;
                                    if (var71 != -2) {
                                        var75 = class104.field1767[method1625(var71, 96)];
                                    }
                                    if (var69.field942 != -1) {
                                        int var76 = field135 + var69.field958 & 0xFF;
                                        int var77 = field142 + var69.field952;
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = method167(var76, var69.field951, var77);
                                        var75 = class104.field1767[method1625(var78, 96)];
                                    }
                                    arg0.method1929(var6, var21, var44, var67, var68, var70, var50, var51, var52, var53, method826(var58, var54), method826(var58, var55), method826(var58, var56), method826(var58, var57), method1625(var72, var54), method1625(var72, var55), method1625(var72, var56), method1625(var72, var57), var66, var75);
                                }
                            }
                        }
                    }
                }
            }
            for (int var79 = 1; var79 < 103; var79++) {
                for (int var80 = 1; var80 < 103; var80++) {
                    int var85;
                    if ((field120[var6][var80][var79] & 0x8) != 0) {
                        var85 = 0;
                    } else if (var6 <= 0 || (field120[1][var80][var79] & 0x2) == 0) {
                        var85 = var6;
                    } else {
                        var85 = var6 - 1;
                    }
                    arg0.method1979(var6, var80, var79, var85);
                }
            }
            Statics.field134[var6] = (byte[][]) null;
            Statics.field271[var6] = (byte[][]) null;
            Statics.field123[var6] = (byte[][]) null;
            Statics.field124[var6] = (byte[][]) null;
            Statics.field125[var6] = (byte[][]) null;
        }
        arg0.method1938(-50, -10, -50);
        for (int var86 = 0; var86 < 104; var86++) {
            for (int var87 = 0; var87 < 104; var87++) {
                if ((field120[1][var86][var87] & 0x2) == 2) {
                    arg0.method1921(var86, var87);
                }
            }
        }
        int var88 = 1;
        int var89 = 2;
        int var90 = 4;
        for (int var91 = 0; var91 < 4; var91++) {
            if (var91 > 0) {
                var88 <<= 0x3;
                var89 <<= 0x3;
                var90 <<= 0x3;
            }
            for (int var92 = 0; var92 <= var91; var92++) {
                for (int var93 = 0; var93 <= 104; var93++) {
                    for (int var94 = 0; var94 <= 104; var94++) {
                        if ((Statics.field139[var92][var94][var93] & var88) != 0) {
                            int var95 = var93;
                            int var96 = var93;
                            int var97 = var92;
                            int var98 = var92;
                            while (var95 > 0 && (Statics.field139[var92][var94][var95 - 1] & var88) != 0) {
                                var95--;
                            }
                            while (var96 < 104 && (Statics.field139[var92][var94][var96 + 1] & var88) != 0) {
                                var96++;
                            }
                            label369: while (var97 > 0) {
                                for (int var99 = var95; var99 <= var96; var99++) {
                                    if ((Statics.field139[var97 - 1][var94][var99] & var88) == 0) {
                                        break label369;
                                    }
                                }
                                var97--;
                            }
                            label358: while (var98 < var91) {
                                for (int var100 = var95; var100 <= var96; var100++) {
                                    if ((Statics.field139[var98 + 1][var94][var100] & var88) == 0) {
                                        break label358;
                                    }
                                }
                                var98++;
                            }
                            int var101 = (var98 + 1 - var97) * (var96 - var95 + 1);
                            if (var101 >= 8) {
                                short var102 = 240;
                                int var103 = field136[var98][var94][var95] - var102;
                                int var104 = field136[var97][var94][var95];
                                class95.method1922(var91, 1, var94 * 128, var94 * 128, var95 * 128, var96 * 128 + 128, var103, var104);
                                for (int var105 = var97; var105 <= var98; var105++) {
                                    for (int var106 = var95; var106 <= var96; var106++) {
                                        Statics.field139[var105][var94][var106] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field139[var92][var94][var93] & var89) != 0) {
                            int var107 = var94;
                            int var108 = var94;
                            int var109 = var92;
                            int var110 = var92;
                            while (var107 > 0 && (Statics.field139[var92][var107 - 1][var93] & var89) != 0) {
                                var107--;
                            }
                            while (var108 < 104 && (Statics.field139[var92][var108 + 1][var93] & var89) != 0) {
                                var108++;
                            }
                            label422: while (var109 > 0) {
                                for (int var111 = var107; var111 <= var108; var111++) {
                                    if ((Statics.field139[var109 - 1][var111][var93] & var89) == 0) {
                                        break label422;
                                    }
                                }
                                var109--;
                            }
                            label411: while (var110 < var91) {
                                for (int var112 = var107; var112 <= var108; var112++) {
                                    if ((Statics.field139[var110 + 1][var112][var93] & var89) == 0) {
                                        break label411;
                                    }
                                }
                                var110++;
                            }
                            int var113 = (var110 + 1 - var109) * (var108 - var107 + 1);
                            if (var113 >= 8) {
                                short var114 = 240;
                                int var115 = field136[var110][var107][var93] - var114;
                                int var116 = field136[var109][var107][var93];
                                class95.method1922(var91, 2, var107 * 128, var108 * 128 + 128, var93 * 128, var93 * 128, var115, var116);
                                for (int var117 = var109; var117 <= var110; var117++) {
                                    for (int var118 = var107; var118 <= var108; var118++) {
                                        Statics.field139[var117][var118][var93] &= ~var89;
                                    }
                                }
                            }
                        }
                        if ((Statics.field139[var92][var94][var93] & var90) != 0) {
                            int var119 = var94;
                            int var120 = var94;
                            int var121 = var93;
                            int var122 = var93;
                            while (var121 > 0 && (Statics.field139[var92][var94][var121 - 1] & var90) != 0) {
                                var121--;
                            }
                            while (var122 < 104 && (Statics.field139[var92][var94][var122 + 1] & var90) != 0) {
                                var122++;
                            }
                            label475: while (var119 > 0) {
                                for (int var123 = var121; var123 <= var122; var123++) {
                                    if ((Statics.field139[var92][var119 - 1][var123] & var90) == 0) {
                                        break label475;
                                    }
                                }
                                var119--;
                            }
                            label464: while (var120 < 104) {
                                for (int var124 = var121; var124 <= var122; var124++) {
                                    if ((Statics.field139[var92][var120 + 1][var124] & var90) == 0) {
                                        break label464;
                                    }
                                }
                                var120++;
                            }
                            if ((var120 - var119 + 1) * (var122 - var121 + 1) >= 4) {
                                int var125 = field136[var92][var119][var121];
                                class95.method1922(var91, 4, var119 * 128, var120 * 128 + 128, var121 * 128, var122 * 128 + 128, var125, var125);
                                for (int var126 = var119; var126 <= var120; var126++) {
                                    for (int var127 = var121; var127 <= var122; var127++) {
                                        Statics.field139[var92][var126][var127] &= ~var90;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ec.f(IIII)I")
    public static final int method2726(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method158(var3, var5);
        int var8 = method158(var3 + 1, var5);
        int var9 = method158(var3, var5 + 1);
        int var10 = method158(var3 + 1, var5 + 1);
        int var11 = method2070(var7, var8, var4, arg2);
        int var12 = method2070(var9, var10, var4, arg2);
        return method2070(var11, var12, var6, arg2);
    }

    @ObfuscatedName("cz.r(IIIII)I")
    public static final int method2070(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1791[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("w.d(III)I")
    public static final int method158(int arg0, int arg1) {
        int var2 = method3(arg0 - 1, arg1 - 1) + method3(arg0 + 1, arg1 - 1) + method3(arg0 - 1, arg1 + 1) + method3(arg0 + 1, arg1 + 1);
        int var3 = method3(arg0 - 1, arg1) + method3(arg0 + 1, arg1) + method3(arg0, arg1 - 1) + method3(arg0, arg1 + 1);
        int var4 = method3(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("p.a(III)I")
    public static final int method3(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("aa.q(IIS)I")
    public static final int method826(int arg0, int arg1) {
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

    @ObfuscatedName("cd.u(III)I")
    public static final int method1625(int arg0, int arg1) {
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

    @ObfuscatedName("e.w(IIII)I")
    public static final int method167(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("i.s(IIB)Z")
    public static final boolean method12(int arg0, int arg1) {
        class32 var2 = class32.method3258(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method700(arg1);
    }

    @ObfuscatedName("o.e(IIIIIIILcq;Lfn;I)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class164 arg8) {
        class32 var9 = class32.method3258(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field854;
            var11 = var9.field829;
        } else {
            var10 = var9.field829;
            var11 = var9.field854;
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
        int[][] var16 = field136[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field832 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field826 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field836 == -1 && var9.field855 == null) {
                var22 = var9.method707(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1925(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field816 == 1) {
                arg8.method3221(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field836 == -1 && var9.field855 == null) {
                var45 = var9.method707(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1991(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field816 != 0) {
                arg8.method3219(arg2, arg3, var10, var11, var9.field831);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field836 == -1 && var9.field855 == null) {
                var23 = var9.method707(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1991(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field816 != 0) {
                arg8.method3219(arg2, arg3, var10, var11, var9.field831);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field836 == -1 && var9.field855 == null) {
                var24 = var9.method707(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1962(arg0, arg2, arg3, var17, var24, (class94) null, field126[arg5], 0, var20, var21);
            if (var9.field816 != 0) {
                arg8.method3251(arg2, arg3, arg6, arg5, var9.field831);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field836 == -1 && var9.field855 == null) {
                var25 = var9.method707(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1962(arg0, arg2, arg3, var17, var25, (class94) null, field130[arg5], 0, var20, var21);
            if (var9.field816 != 0) {
                arg8.method3251(arg2, arg3, arg6, arg5, var9.field831);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field836 == -1 && var9.field855 == null) {
                var27 = var9.method707(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method707(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field836, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1962(arg0, arg2, arg3, var17, var27, var28, field126[arg5], field126[var26], var20, var21);
            if (var9.field816 != 0) {
                arg8.method3251(arg2, arg3, arg6, arg5, var9.field831);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field836 == -1 && var9.field855 == null) {
                var29 = var9.method707(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1962(arg0, arg2, arg3, var17, var29, (class94) null, field130[arg5], 0, var20, var21);
            if (var9.field816 != 0) {
                arg8.method3251(arg2, arg3, arg6, arg5, var9.field831);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field836 == -1 && var9.field855 == null) {
                var30 = var9.method707(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1991(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field816 != 0) {
                arg8.method3219(arg2, arg3, var10, var11, var9.field831);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field836 == -1 && var9.field855 == null) {
                var31 = var9.method707(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1983(arg0, arg2, arg3, var17, var31, (class94) null, field126[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1945(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method3258(var33 >> 14 & 0x7FFF).field837;
            }
            class94 var34;
            if (var9.field836 == -1 && var9.field855 == null) {
                var34 = var9.method707(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1983(arg0, arg2, arg3, var17, var34, (class94) null, field126[arg5], 0, field131[arg5] * var32, field132[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1945(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method3258(var36 >> 14 & 0x7FFF).field837 / 2;
            }
            class94 var37;
            if (var9.field836 == -1 && var9.field855 == null) {
                var37 = var9.method707(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1983(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field133[arg5] * var35, field127[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field836 == -1 && var9.field855 == null) {
                var39 = var9.method707(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1983(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1945(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method3258(var41 >> 14 & 0x7FFF).field837 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field836 == -1 && var9.field855 == null) {
                var43 = var9.method707(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method707(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field836, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field836, true, (class94) null);
            }
            arg7.method1983(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field133[arg5] * var40, field127[arg5] * var40, var20, var21);
        }
    }
}
