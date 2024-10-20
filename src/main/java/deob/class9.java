package deob;

@ObfuscatedName("u")
public final class class9 {

    @ObfuscatedName("u.f")
    public static int[][][] field129 = new int[4][105][105];

    @ObfuscatedName("u.t")
    public static byte[][][] field115 = new byte[4][104][104];

    @ObfuscatedName("u.n")
    public static int field116 = 99;

    @ObfuscatedName("u.m")
    public static final int[] field124 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("u.z")
    public static final int[] field125 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("u.w")
    public static final int[] field126 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("u.h")
    public static final int[] field127 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("u.y")
    public static final int[] field120 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("u.x")
    public static final int[] field118 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("u.p")
    public static int field119 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("u.i")
    public static int field131 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.f(B)V")
    public static void method240() {
        field116 = 99;
        Statics.field117 = new byte[4][104][104];
        Statics.field2058 = new byte[4][104][104];
        Statics.field1748 = new byte[4][104][104];
        Statics.field114 = new byte[4][104][104];
        Statics.field128 = new int[4][105][105];
        Statics.field134 = new byte[4][105][105];
        Statics.field1745 = new int[105][105];
        Statics.field132 = new int[104];
        Statics.field1802 = new int[104];
        Statics.field121 = new int[104];
        Statics.field123 = new int[104];
        Statics.field374 = new int[104];
    }

    @ObfuscatedName("ek.t(I)V")
    public static void method2958() {
        Statics.field117 = (byte[][][]) null;
        Statics.field2058 = (byte[][][]) null;
        Statics.field1748 = (byte[][][]) null;
        Statics.field114 = (byte[][][]) null;
        Statics.field128 = (int[][][]) null;
        Statics.field134 = (byte[][][]) null;
        Statics.field1745 = (int[][]) null;
        Statics.field132 = null;
        Statics.field1802 = null;
        Statics.field121 = null;
        Statics.field123 = null;
        Statics.field374 = null;
    }

    @ObfuscatedName("r.n(IIIIB)V")
    public static final void method43(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field134[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field129[0][var5][var4] = field129[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field129[0][var5][var4] = field129[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field129[0][var5][var4] = field129[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field129[0][var5][var4] = field129[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.e([BIIIIIII[Ldz;I)V")
    public static final void method229(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class130[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2036[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class127 var11 = new class127(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class161.method3125(var13 & 0x7, var14 & 0x7, arg7);
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
                        method876(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method876(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.l(IIII)V")
    public static final void method793(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field129[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field129[arg0][arg1][arg2 + var5] = field129[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field129[arg0][arg1 + var6][arg2] = field129[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field129[arg0][arg1 - 1][arg2] != 0) {
            field129[arg0][arg1][arg2] = field129[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field129[arg0][arg1][arg2 - 1] != 0) {
            field129[arg0][arg1][arg2] = field129[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field129[arg0][arg1 - 1][arg2 - 1] != 0) {
            field129[arg0][arg1][arg2] = field129[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ap.d(Ldq;IIIIIIB)V")
    public static final void method876(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2458();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2458();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2458();
                }
            }
            return;
        }
        field115[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2458();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field129[0][arg2][arg3] = -method1393(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field129[arg1][arg2][arg3] = field129[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2458();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field129[0][arg2][arg3] = -var8 * 8;
                } else {
                    field129[arg1][arg2][arg3] = field129[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2058[arg1][arg2][arg3] = arg0.method2459();
                Statics.field1748[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field114[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field115[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field117[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("r.r([BIILcr;[Ldz;I)V")
    public static final void method46(byte[] arg0, int arg1, int arg2, class95 arg3, class130[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2471();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2471();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2458();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field115[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class130 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("b.k([BIIIIIIILcr;[Ldz;I)V")
    public static final void method140(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, class130[] arg9) {
        class127 var10 = new class127(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2471();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2471();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2458();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class32 var21 = class32.method874(var11);
                    int var22 = arg2 + class161.method548(var16 & 0x7, var15 & 0x7, arg7, var21.field812, var21.field818, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field812;
                    int var28 = var21.field818;
                    if ((var20 & 0x1) == 1) {
                        int var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var30 = arg7 & 0x3;
                    int var31;
                    if (var30 == 0) {
                        var31 = var25;
                    } else if (var30 == 1) {
                        var31 = 7 - var24 - (var27 - 1);
                    } else if (var30 == 2) {
                        var31 = 7 - var25 - (var28 - 1);
                    } else {
                        var31 = var24;
                    }
                    int var32 = arg3 + var31;
                    if (var22 > 0 && var32 > 0 && var22 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field115[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class130 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method1(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.u(IIIIIILcr;Ldz;I)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field596 && (field115[0][arg1][arg2] & 0x2) == 0) {
            if ((field115[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field115[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field115[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field511 != var8) {
                return;
            }
        }
        if (arg0 < field116) {
            field116 = arg0;
        }
        class32 var9 = class32.method874(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field818;
            var11 = var9.field812;
        } else {
            var10 = var9.field812;
            var11 = var9.field818;
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
        int[][] var16 = field129[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field821 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field842 == 1) {
            var21 += 256;
        }
        if (var9.method655()) {
            class7 var22 = new class7();
            var22.field85 = arg0;
            var22.field86 = arg1 * 128;
            var22.field87 = arg2 * 128;
            int var23 = var9.field812;
            int var24 = var9.field818;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field818;
                var24 = var9.field812;
            }
            var22.field91 = (arg1 + var23) * 128;
            var22.field89 = (arg2 + var24) * 128;
            var22.field101 = var9.field846;
            var22.field84 = var9.field847 * 128;
            var22.field95 = var9.field848;
            var22.field94 = var9.field840;
            var22.field93 = var9.field853;
            if (var9.field827 != null) {
                var22.field98 = var9;
                var22.method48();
            }
            class7.field90.method3333(var22);
            if (var22.field93 != null) {
                var22.field96 = var22.field95 + (int) (Math.random() * (double) (var22.field94 - var22.field95));
            }
        }
        if (arg5 == 22) {
            if (!client.field596 || var9.field821 != 0 || var9.field819 == 1 || var9.field849) {
                class94 var25;
                if (var9.field825 == -1 && var9.field827 == null) {
                    var25 = var9.method634(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field825, true, (class94) null);
                }
                arg6.method1890(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field819 == 1 && arg7 != null) {
                    arg7.method2705(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var48;
            if (var9.field825 == -1 && var9.field827 == null) {
                var48 = var9.method634(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            if (var48 != null && arg6.method1894(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field833) {
                int var49 = 15;
                if (var48 instanceof class112) {
                    var49 = ((class112) var48).method2305() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field134[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field134[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field819 != 0 && arg7 != null) {
                arg7.method2688(arg1, arg2, var10, var11, var9.field820);
            }
        } else if (arg5 >= 12) {
            class94 var26;
            if (var9.field825 == -1 && var9.field827 == null) {
                var26 = var9.method634(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1894(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field128[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field819 != 0 && arg7 != null) {
                arg7.method2688(arg1, arg2, var10, var11, var9.field820);
            }
        } else if (arg5 == 0) {
            class94 var27;
            if (var9.field825 == -1 && var9.field827 == null) {
                var27 = var9.method634(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1892(arg0, arg1, arg2, var17, var27, (class94) null, field124[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field833) {
                    Statics.field134[arg0][arg1][arg2] = 50;
                    Statics.field134[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field850) {
                    Statics.field128[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field833) {
                    Statics.field134[arg0][arg1][arg2 + 1] = 50;
                    Statics.field134[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field850) {
                    Statics.field128[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field833) {
                    Statics.field134[arg0][arg1 + 1][arg2] = 50;
                    Statics.field134[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field850) {
                    Statics.field128[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field833) {
                    Statics.field134[arg0][arg1][arg2] = 50;
                    Statics.field134[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field850) {
                    Statics.field128[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field819 != 0 && arg7 != null) {
                arg7.method2687(arg1, arg2, arg5, arg4, var9.field820);
            }
            if (var9.field826 != 16) {
                arg6.method1980(arg0, arg1, arg2, var9.field826);
            }
        } else if (arg5 == 1) {
            class94 var28;
            if (var9.field825 == -1 && var9.field827 == null) {
                var28 = var9.method634(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1892(arg0, arg1, arg2, var17, var28, (class94) null, field125[arg4], 0, var20, var21);
            if (var9.field833) {
                if (arg4 == 0) {
                    Statics.field134[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field134[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field134[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field134[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field819 != 0 && arg7 != null) {
                arg7.method2687(arg1, arg2, arg5, arg4, var9.field820);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class94 var30;
            class94 var31;
            if (var9.field825 == -1 && var9.field827 == null) {
                var30 = var9.method634(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method634(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field825, true, (class94) null);
                var31 = new class14(arg3, 2, var29, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1892(arg0, arg1, arg2, var17, var30, var31, field124[arg4], field124[var29], var20, var21);
            if (var9.field850) {
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
            if (var9.field819 != 0 && arg7 != null) {
                arg7.method2687(arg1, arg2, arg5, arg4, var9.field820);
            }
            if (var9.field826 != 16) {
                arg6.method1980(arg0, arg1, arg2, var9.field826);
            }
        } else if (arg5 == 3) {
            class94 var32;
            if (var9.field825 == -1 && var9.field827 == null) {
                var32 = var9.method634(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1892(arg0, arg1, arg2, var17, var32, (class94) null, field125[arg4], 0, var20, var21);
            if (var9.field833) {
                if (arg4 == 0) {
                    Statics.field134[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field134[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field134[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field134[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field819 != 0 && arg7 != null) {
                arg7.method2687(arg1, arg2, arg5, arg4, var9.field820);
            }
        } else if (arg5 == 9) {
            class94 var33;
            if (var9.field825 == -1 && var9.field827 == null) {
                var33 = var9.method634(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1894(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field819 != 0 && arg7 != null) {
                arg7.method2688(arg1, arg2, var10, var11, var9.field820);
            }
            if (var9.field826 != 16) {
                arg6.method1980(arg0, arg1, arg2, var9.field826);
            }
        } else if (arg5 == 4) {
            class94 var34;
            if (var9.field825 == -1 && var9.field827 == null) {
                var34 = var9.method634(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1893(arg0, arg1, arg2, var17, var34, (class94) null, field124[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1910(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method874(var36 >> 14 & 0x7FFF).field826;
            }
            class94 var37;
            if (var9.field825 == -1 && var9.field827 == null) {
                var37 = var9.method634(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1893(arg0, arg1, arg2, var17, var37, (class94) null, field124[arg4], 0, field126[arg4] * var35, field127[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1910(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class32.method874(var39 >> 14 & 0x7FFF).field826 / 2;
            }
            class94 var40;
            if (var9.field825 == -1 && var9.field827 == null) {
                var40 = var9.method634(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1893(arg0, arg1, arg2, var17, var40, (class94) null, 256, arg4, field120[arg4] * var38, field118[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            if (var9.field825 == -1 && var9.field827 == null) {
                var42 = var9.method634(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1893(arg0, arg1, arg2, var17, var42, (class94) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1910(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class32.method874(var44 >> 14 & 0x7FFF).field826 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class94 var46;
            class94 var47;
            if (var9.field825 == -1 && var9.field827 == null) {
                var46 = var9.method634(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method634(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field825, true, (class94) null);
                var47 = new class14(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field825, true, (class94) null);
            }
            arg6.method1893(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field120[arg4] * var43, field118[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("ev.o(Lcr;[Ldz;I)V")
    public static final void method2740(class95 arg0, class130[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field115[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field115[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2711(var3, var4);
                        }
                    }
                }
            }
        }
        field119 += (int) (Math.random() * 5.0D) - 2;
        if (field119 < -8) {
            field119 = -8;
        }
        if (field119 > 8) {
            field119 = 8;
        }
        field131 += (int) (Math.random() * 5.0D) - 2;
        if (field131 < -16) {
            field131 = -16;
        }
        if (field131 > 16) {
            field131 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field134[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field129[var6][var11 + 1][var10] - field129[var6][var11 - 1][var10];
                    int var13 = field129[var6][var11][var10 + 1] - field129[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1745[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field132[var20] = 0;
                Statics.field1802[var20] = 0;
                Statics.field121[var20] = 0;
                Statics.field123[var20] = 0;
                Statics.field374[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field117[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class33 var26 = (class33) class33.field856.method3276((long) var25);
                            class33 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field864.method3035(1, var25);
                                class33 var29 = new class33();
                                if (var28 != null) {
                                    var29.method691(new class127(var28), var25);
                                }
                                var29.method674();
                                class33.field856.method3275(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field132[var22] += var27.field858;
                            Statics.field1802[var22] += var27.field868;
                            Statics.field121[var22] += var27.field859;
                            Statics.field123[var22] += var27.field861;
                            var10002 = Statics.field374[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field117[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class33 var34 = (class33) class33.field856.method3276((long) var33);
                            class33 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field864.method3035(1, var33);
                                class33 var37 = new class33();
                                if (var36 != null) {
                                    var37.method691(new class127(var36), var33);
                                }
                                var37.method674();
                                class33.field856.method3275(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field132[var22] -= var35.field858;
                            Statics.field1802[var22] -= var35.field868;
                            Statics.field121[var22] -= var35.field859;
                            Statics.field123[var22] -= var35.field861;
                            var10002 = Statics.field374[var22]--;
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
                            var39 += Statics.field132[var45];
                            var40 += Statics.field1802[var45];
                            var41 += Statics.field121[var45];
                            var42 += Statics.field123[var45];
                            var43 += Statics.field374[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field132[var46];
                            var40 -= Statics.field1802[var46];
                            var41 -= Statics.field121[var46];
                            var42 -= Statics.field123[var46];
                            var43 -= Statics.field374[var46];
                        }
                        if (var44 >= 1 && var44 < 103) {
                            if (client.field596 && (field115[0][var21][var44] & 0x2) == 0) {
                                if ((field115[var6][var21][var44] & 0x10) != 0) {
                                    continue;
                                }
                                int var47;
                                if ((field115[var6][var21][var44] & 0x8) != 0) {
                                    var47 = 0;
                                } else if (var6 <= 0 || (field115[1][var21][var44] & 0x2) == 0) {
                                    var47 = var6;
                                } else {
                                    var47 = var6 - 1;
                                }
                                if (client.field511 != var47) {
                                    continue;
                                }
                            }
                            if (var6 < field116) {
                                field116 = var6;
                            }
                            int var48 = Statics.field117[var6][var21][var44] & 0xFF;
                            int var49 = Statics.field2058[var6][var21][var44] & 0xFF;
                            if (var48 > 0 || var49 > 0) {
                                int var50 = field129[var6][var21][var44];
                                int var51 = field129[var6][var21 + 1][var44];
                                int var52 = field129[var6][var21 + 1][var44 + 1];
                                int var53 = field129[var6][var21][var44 + 1];
                                int var54 = Statics.field1745[var21][var44];
                                int var55 = Statics.field1745[var21 + 1][var44];
                                int var56 = Statics.field1745[var21 + 1][var44 + 1];
                                int var57 = Statics.field1745[var21][var44 + 1];
                                int var58 = -1;
                                int var59 = -1;
                                if (var48 > 0) {
                                    int var60 = var39 * 256 / var42;
                                    int var61 = var40 / var43;
                                    int var62 = var41 / var43;
                                    var58 = method2217(var60, var61, var62);
                                    int var63 = field119 + var60 & 0xFF;
                                    int var64 = field131 + var62;
                                    if (var64 < 0) {
                                        var64 = 0;
                                    } else if (var64 > 255) {
                                        var64 = 255;
                                    }
                                    var59 = method2217(var63, var61, var64);
                                }
                                if (var6 > 0) {
                                    boolean var65 = true;
                                    if (var48 == 0 && Statics.field1748[var6][var21][var44] != 0) {
                                        var65 = false;
                                    }
                                    if (var49 > 0) {
                                        int var66 = var49 - 1;
                                        class37 var67 = (class37) class37.field938.method3276((long) var66);
                                        class37 var68;
                                        if (var67 == null) {
                                            byte[] var69 = Statics.field931.method3035(4, var66);
                                            class37 var70 = new class37();
                                            if (var69 != null) {
                                                var70.method780(new class127(var69), var66);
                                            }
                                            var70.method779();
                                            class37.field938.method3275(var70, (long) var66);
                                            var68 = var70;
                                        } else {
                                            var68 = var67;
                                        }
                                        if (!var68.field934) {
                                            var65 = false;
                                        }
                                    }
                                    if (var65 && var50 == var51 && var50 == var52 && var50 == var53) {
                                        Statics.field128[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var71 = 0;
                                if (var59 != -1) {
                                    var71 = class104.field1751[method2741(var59, 96)];
                                }
                                if (var49 == 0) {
                                    arg0.method1889(var6, var21, var44, 0, 0, -1, var50, var51, var52, var53, method2741(var58, var54), method2741(var58, var55), method2741(var58, var56), method2741(var58, var57), 0, 0, 0, 0, var71, 0);
                                } else {
                                    int var72 = Statics.field1748[var6][var21][var44] + 1;
                                    byte var73 = Statics.field114[var6][var21][var44];
                                    int var74 = var49 - 1;
                                    class37 var75 = (class37) class37.field938.method3276((long) var74);
                                    class37 var76;
                                    if (var75 == null) {
                                        byte[] var77 = Statics.field931.method3035(4, var74);
                                        class37 var78 = new class37();
                                        if (var77 != null) {
                                            var78.method780(new class127(var77), var74);
                                        }
                                        var78.method779();
                                        class37.field938.method3275(var78, (long) var74);
                                        var76 = var78;
                                    } else {
                                        var76 = var75;
                                    }
                                    int var80 = var76.field933;
                                    int var81;
                                    int var82;
                                    if (var80 >= 0) {
                                        var81 = Statics.field1771.method2208(var80);
                                        var82 = -1;
                                    } else if (var76.field932 == 16711935) {
                                        var82 = -2;
                                        var80 = -1;
                                        var81 = -2;
                                    } else {
                                        var82 = method2217(var76.field942, var76.field930, var76.field936);
                                        int var83 = field119 + var76.field942 & 0xFF;
                                        int var84 = field131 + var76.field936;
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        var81 = method2217(var83, var76.field930, var84);
                                    }
                                    int var85 = 0;
                                    if (var81 != -2) {
                                        var85 = class104.field1751[method1696(var81, 96)];
                                    }
                                    if (var76.field935 != -1) {
                                        int var86 = field119 + var76.field939 & 0xFF;
                                        int var87 = field131 + var76.field941;
                                        if (var87 < 0) {
                                            var87 = 0;
                                        } else if (var87 > 255) {
                                            var87 = 255;
                                        }
                                        int var88 = method2217(var86, var76.field940, var87);
                                        var85 = class104.field1751[method1696(var88, 96)];
                                    }
                                    arg0.method1889(var6, var21, var44, var72, var73, var80, var50, var51, var52, var53, method2741(var58, var54), method2741(var58, var55), method2741(var58, var56), method2741(var58, var57), method1696(var82, var54), method1696(var82, var55), method1696(var82, var56), method1696(var82, var57), var71, var85);
                                }
                            }
                        }
                    }
                }
            }
            for (int var89 = 1; var89 < 103; var89++) {
                for (int var90 = 1; var90 < 103; var90++) {
                    int var95;
                    if ((field115[var6][var90][var89] & 0x8) != 0) {
                        var95 = 0;
                    } else if (var6 <= 0 || (field115[1][var90][var89] & 0x2) == 0) {
                        var95 = var6;
                    } else {
                        var95 = var6 - 1;
                    }
                    arg0.method1964(var6, var90, var89, var95);
                }
            }
            Statics.field117[var6] = (byte[][]) null;
            Statics.field2058[var6] = (byte[][]) null;
            Statics.field1748[var6] = (byte[][]) null;
            Statics.field114[var6] = (byte[][]) null;
            Statics.field134[var6] = (byte[][]) null;
        }
        arg0.method1915(-50, -10, -50);
        for (int var96 = 0; var96 < 104; var96++) {
            for (int var97 = 0; var97 < 104; var97++) {
                if ((field115[1][var96][var97] & 0x2) == 2) {
                    arg0.method1958(var96, var97);
                }
            }
        }
        int var98 = 1;
        int var99 = 2;
        int var100 = 4;
        for (int var101 = 0; var101 < 4; var101++) {
            if (var101 > 0) {
                var98 <<= 0x3;
                var99 <<= 0x3;
                var100 <<= 0x3;
            }
            for (int var102 = 0; var102 <= var101; var102++) {
                for (int var103 = 0; var103 <= 104; var103++) {
                    for (int var104 = 0; var104 <= 104; var104++) {
                        if ((Statics.field128[var102][var104][var103] & var98) != 0) {
                            int var105 = var103;
                            int var106 = var103;
                            int var107 = var102;
                            int var108 = var102;
                            while (var105 > 0 && (Statics.field128[var102][var104][var105 - 1] & var98) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field128[var102][var104][var106 + 1] & var98) != 0) {
                                var106++;
                            }
                            label387: while (var107 > 0) {
                                for (int var109 = var105; var109 <= var106; var109++) {
                                    if ((Statics.field128[var107 - 1][var104][var109] & var98) == 0) {
                                        break label387;
                                    }
                                }
                                var107--;
                            }
                            label376: while (var108 < var101) {
                                for (int var110 = var105; var110 <= var106; var110++) {
                                    if ((Statics.field128[var108 + 1][var104][var110] & var98) == 0) {
                                        break label376;
                                    }
                                }
                                var108++;
                            }
                            int var111 = (var108 + 1 - var107) * (var106 - var105 + 1);
                            if (var111 >= 8) {
                                short var112 = 240;
                                int var113 = field129[var108][var104][var105] - var112;
                                int var114 = field129[var107][var104][var105];
                                class95.method1887(var101, 1, var104 * 128, var104 * 128, var105 * 128, var106 * 128 + 128, var113, var114);
                                for (int var115 = var107; var115 <= var108; var115++) {
                                    for (int var116 = var105; var116 <= var106; var116++) {
                                        Statics.field128[var115][var104][var116] &= ~var98;
                                    }
                                }
                            }
                        }
                        if ((Statics.field128[var102][var104][var103] & var99) != 0) {
                            int var117 = var104;
                            int var118 = var104;
                            int var119 = var102;
                            int var120 = var102;
                            while (var117 > 0 && (Statics.field128[var102][var117 - 1][var103] & var99) != 0) {
                                var117--;
                            }
                            while (var118 < 104 && (Statics.field128[var102][var118 + 1][var103] & var99) != 0) {
                                var118++;
                            }
                            label440: while (var119 > 0) {
                                for (int var121 = var117; var121 <= var118; var121++) {
                                    if ((Statics.field128[var119 - 1][var121][var103] & var99) == 0) {
                                        break label440;
                                    }
                                }
                                var119--;
                            }
                            label429: while (var120 < var101) {
                                for (int var122 = var117; var122 <= var118; var122++) {
                                    if ((Statics.field128[var120 + 1][var122][var103] & var99) == 0) {
                                        break label429;
                                    }
                                }
                                var120++;
                            }
                            int var123 = (var120 + 1 - var119) * (var118 - var117 + 1);
                            if (var123 >= 8) {
                                short var124 = 240;
                                int var125 = field129[var120][var117][var103] - var124;
                                int var126 = field129[var119][var117][var103];
                                class95.method1887(var101, 2, var117 * 128, var118 * 128 + 128, var103 * 128, var103 * 128, var125, var126);
                                for (int var127 = var119; var127 <= var120; var127++) {
                                    for (int var128 = var117; var128 <= var118; var128++) {
                                        Statics.field128[var127][var128][var103] &= ~var99;
                                    }
                                }
                            }
                        }
                        if ((Statics.field128[var102][var104][var103] & var100) != 0) {
                            int var129 = var104;
                            int var130 = var104;
                            int var131 = var103;
                            int var132 = var103;
                            while (var131 > 0 && (Statics.field128[var102][var104][var131 - 1] & var100) != 0) {
                                var131--;
                            }
                            while (var132 < 104 && (Statics.field128[var102][var104][var132 + 1] & var100) != 0) {
                                var132++;
                            }
                            label493: while (var129 > 0) {
                                for (int var133 = var131; var133 <= var132; var133++) {
                                    if ((Statics.field128[var102][var129 - 1][var133] & var100) == 0) {
                                        break label493;
                                    }
                                }
                                var129--;
                            }
                            label482: while (var130 < 104) {
                                for (int var134 = var131; var134 <= var132; var134++) {
                                    if ((Statics.field128[var102][var130 + 1][var134] & var100) == 0) {
                                        break label482;
                                    }
                                }
                                var130++;
                            }
                            if ((var130 - var129 + 1) * (var132 - var131 + 1) >= 4) {
                                int var135 = field129[var102][var129][var131];
                                class95.method1887(var101, 4, var129 * 128, var130 * 128 + 128, var131 * 128, var132 * 128 + 128, var135, var135);
                                for (int var136 = var129; var136 <= var130; var136++) {
                                    for (int var137 = var131; var137 <= var132; var137++) {
                                        Statics.field128[var102][var136][var137] &= ~var100;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.g(IIB)I")
    public static final int method1393(int arg0, int arg1) {
        int var2 = method777(arg0 + 45365, arg1 + 91923, 4) - 128 + (method777(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method777(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("at.s(IIIB)I")
    public static final int method777(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method34(var3, var5);
        int var8 = method34(var3 + 1, var5);
        int var9 = method34(var3, var5 + 1);
        int var10 = method34(var3 + 1, var5 + 1);
        int var11 = Statics.method11(var7, var8, var4, arg2);
        int var12 = Statics.method11(var9, var10, var4, arg2);
        return Statics.method11(var11, var12, var6, arg2);
    }

    @ObfuscatedName("l.v(IIS)I")
    public static final int method34(int arg0, int arg1) {
        int var2 = method2744(arg0 - 1, arg1 - 1) + method2744(arg0 + 1, arg1 - 1) + method2744(arg0 - 1, arg1 + 1) + method2744(arg0 + 1, arg1 + 1);
        int var3 = method2744(arg0 - 1, arg1) + method2744(arg0 + 1, arg1) + method2744(arg0, arg1 - 1) + method2744(arg0, arg1 + 1);
        int var4 = method2744(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("el.j(III)I")
    public static final int method2744(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("el.q(III)I")
    public static final int method2741(int arg0, int arg1) {
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

    @ObfuscatedName("cn.a(III)I")
    public static final int method1696(int arg0, int arg1) {
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

    @ObfuscatedName("dw.c(IIII)I")
    public static final int method2217(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("l.m(III)Z")
    public static final boolean method30(int arg0, int arg1) {
        class32 var2 = class32.method874(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method656(arg1);
    }

    @ObfuscatedName("bf.z(IIIIIIILcr;Ldz;I)V")
    public static final void method1558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class130 arg8) {
        class32 var9 = class32.method874(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field818;
            var11 = var9.field812;
        } else {
            var10 = var9.field812;
            var11 = var9.field818;
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
        int[][] var16 = field129[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field821 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field842 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field825 == -1 && var9.field827 == null) {
                var22 = var9.method635(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1890(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field819 == 1) {
                arg8.method2705(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field825 == -1 && var9.field827 == null) {
                var45 = var9.method635(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1894(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field819 != 0) {
                arg8.method2688(arg2, arg3, var10, var11, var9.field820);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field825 == -1 && var9.field827 == null) {
                var23 = var9.method635(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1894(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field819 != 0) {
                arg8.method2688(arg2, arg3, var10, var11, var9.field820);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field825 == -1 && var9.field827 == null) {
                var24 = var9.method635(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1892(arg0, arg2, arg3, var17, var24, (class94) null, field124[arg5], 0, var20, var21);
            if (var9.field819 != 0) {
                arg8.method2687(arg2, arg3, arg6, arg5, var9.field820);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field825 == -1 && var9.field827 == null) {
                var25 = var9.method635(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1892(arg0, arg2, arg3, var17, var25, (class94) null, field125[arg5], 0, var20, var21);
            if (var9.field819 != 0) {
                arg8.method2687(arg2, arg3, arg6, arg5, var9.field820);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field825 == -1 && var9.field827 == null) {
                var27 = var9.method635(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method635(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field825, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1892(arg0, arg2, arg3, var17, var27, var28, field124[arg5], field124[var26], var20, var21);
            if (var9.field819 != 0) {
                arg8.method2687(arg2, arg3, arg6, arg5, var9.field820);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field825 == -1 && var9.field827 == null) {
                var29 = var9.method635(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1892(arg0, arg2, arg3, var17, var29, (class94) null, field125[arg5], 0, var20, var21);
            if (var9.field819 != 0) {
                arg8.method2687(arg2, arg3, arg6, arg5, var9.field820);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field825 == -1 && var9.field827 == null) {
                var30 = var9.method635(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1894(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field819 != 0) {
                arg8.method2688(arg2, arg3, var10, var11, var9.field820);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field825 == -1 && var9.field827 == null) {
                var31 = var9.method635(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1893(arg0, arg2, arg3, var17, var31, (class94) null, field124[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1910(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method874(var33 >> 14 & 0x7FFF).field826;
            }
            class94 var34;
            if (var9.field825 == -1 && var9.field827 == null) {
                var34 = var9.method635(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1893(arg0, arg2, arg3, var17, var34, (class94) null, field124[arg5], 0, field126[arg5] * var32, field127[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1910(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method874(var36 >> 14 & 0x7FFF).field826 / 2;
            }
            class94 var37;
            if (var9.field825 == -1 && var9.field827 == null) {
                var37 = var9.method635(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1893(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field120[arg5] * var35, field118[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field825 == -1 && var9.field827 == null) {
                var39 = var9.method635(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1893(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1910(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method874(var41 >> 14 & 0x7FFF).field826 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field825 == -1 && var9.field827 == null) {
                var43 = var9.method635(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method635(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field825, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field825, true, (class94) null);
            }
            arg7.method1893(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field120[arg5] * var40, field118[arg5] * var40, var20, var21);
        }
    }
}
