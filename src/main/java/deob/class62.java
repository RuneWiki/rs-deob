package deob;

@ObfuscatedName("be")
public final class class62 {

    @ObfuscatedName("be.m")
    public static int[][][] field740 = new int[4][105][105];

    @ObfuscatedName("be.p")
    public static byte[][][] field732 = new byte[4][104][104];

    @ObfuscatedName("be.i")
    public static int field726 = 99;

    @ObfuscatedName("be.r")
    public static final int[] field724 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("be.g")
    public static final int[] field733 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("be.z")
    public static final int[] field734 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("be.o")
    public static final int[] field735 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("be.d")
    public static final int[] field725 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("be.s")
    public static final int[] field737 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("be.f")
    public static int field738 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("be.q")
    public static int field731 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.m(B)V")
    public static void method3147() {
        field726 = 99;
        Statics.field727 = new byte[4][104][104];
        Statics.field3791 = new byte[4][104][104];
        Statics.field728 = new byte[4][104][104];
        Statics.field491 = new byte[4][104][104];
        Statics.field1711 = new int[4][105][105];
        Statics.field739 = new byte[4][105][105];
        Statics.field2687 = new int[105][105];
        Statics.field730 = new int[104];
        Statics.field633 = new int[104];
        Statics.field1228 = new int[104];
        Statics.field3400 = new int[104];
        Statics.field729 = new int[104];
    }

    @ObfuscatedName("ai.p(B)V")
    public static void method596() {
        Statics.field727 = (byte[][][]) null;
        Statics.field3791 = (byte[][][]) null;
        Statics.field728 = (byte[][][]) null;
        Statics.field491 = (byte[][][]) null;
        Statics.field1711 = (int[][][]) null;
        Statics.field739 = (byte[][][]) null;
        Statics.field2687 = (int[][]) null;
        Statics.field730 = null;
        Statics.field633 = null;
        Statics.field1228 = null;
        Statics.field3400 = null;
        Statics.field729 = null;
    }

    @ObfuscatedName("bv.i(IIIII)V")
    public static final void method1466(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field739[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field740[0][var5][var4] = field740[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field740[0][var5][var4] = field740[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field740[0][var5][var4] = field740[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field740[0][var5][var4] = field740[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dw.j([BIIII[Lfa;B)V")
    public static final void method2288(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class163[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2201[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class181 var9 = new class181(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1622(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("client.v([BIIIIIII[Lfa;B)V")
    public static final void method1400(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class163[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2201[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class181 var11 = new class181(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class223.method1036(var13 & 0x7, var14 & 0x7, arg7);
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
                        method1622(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method1622(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.x(IIIB)V")
    public static final void method1702(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field740[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field740[arg0][arg1][arg2 + var5] = field740[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field740[arg0][arg1 + var6][arg2] = field740[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field740[arg0][arg1 - 1][arg2] != 0) {
            field740[arg0][arg1][arg2] = field740[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field740[arg0][arg1][arg2 - 1] != 0) {
            field740[arg0][arg1][arg2] = field740[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field740[arg0][arg1 - 1][arg2 - 1] != 0) {
            field740[arg0][arg1][arg2] = field740[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cy.e(Lfv;IIIIIII)V")
    public static final void method1622(class181 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3012();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3012();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3012();
                }
            }
            return;
        }
        field732[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3012();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field740[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method264(var10 + 45365, var11 + 91923, 4) - 128 + (method264(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method264(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field740[arg1][arg2][arg3] = field740[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3012();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field740[0][arg2][arg3] = -var15 * 8;
                } else {
                    field740[arg1][arg2][arg3] = field740[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field3791[arg1][arg2][arg3] = arg0.method3013();
                Statics.field728[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field491[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field732[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field727[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ay.l([BIILec;[Lfa;I)V")
    public static final void method526(byte[] arg0, int arg1, int arg2, class139 arg3, class163[] arg4) {
        class181 var5 = new class181(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3140();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3140();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method3012();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field732[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class163 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2792(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ew.b(IIIIIILec;Lfa;I)V")
    public static final void method2792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class139 arg6, class163 arg7) {
        if (client.field875 && (field732[0][arg1][arg2] & 0x2) == 0 && (field732[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field726) {
            field726 = arg0;
        }
        class263 var8 = class263.method190(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3525;
            var10 = var8.field3503;
        } else {
            var9 = var8.field3503;
            var10 = var8.field3525;
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
        int[][] var15 = field740[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3507 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3528 == 1) {
            var20 += 256;
        }
        if (var8.method4340()) {
            class82.method4279(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field875 || var8.field3507 != 0 || var8.field3527 == 1 || var8.field3526) {
                class141 var21;
                if (var8.field3511 == -1 && var8.field3519 == null) {
                    var21 = var8.method4333(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class99(arg3, 22, arg4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
                }
                arg6.method2556(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3527 == 1 && arg7 != null) {
                    arg7.method2870(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class141 var44;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var44 = var8.method4333(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class99(arg3, 10, arg4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            if (var44 != null && arg6.method2560(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3505) {
                int var45 = 15;
                if (var44 instanceof class133) {
                    var45 = ((class133) var44).method2452() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field739[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field739[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2868(arg1, arg2, var9, var10, var8.field3506);
            }
        } else if (arg5 >= 12) {
            class141 var22;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var22 = var8.method4333(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2560(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1711[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2868(arg1, arg2, var9, var10, var8.field3506);
            }
        } else if (arg5 == 0) {
            class141 var23;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var23 = var8.method4333(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class99(arg3, 0, arg4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2578(arg0, arg1, arg2, var16, var23, (class141) null, field724[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3505) {
                    Statics.field739[arg0][arg1][arg2] = 50;
                    Statics.field739[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3510) {
                    Statics.field1711[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3505) {
                    Statics.field739[arg0][arg1][arg2 + 1] = 50;
                    Statics.field739[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3510) {
                    Statics.field1711[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3505) {
                    Statics.field739[arg0][arg1 + 1][arg2] = 50;
                    Statics.field739[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3510) {
                    Statics.field1711[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3505) {
                    Statics.field739[arg0][arg1][arg2] = 50;
                    Statics.field739[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3510) {
                    Statics.field1711[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2875(arg1, arg2, arg5, arg4, var8.field3506);
            }
            if (var8.field3492 != 16) {
                arg6.method2632(arg0, arg1, arg2, var8.field3492);
            }
        } else if (arg5 == 1) {
            class141 var24;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var24 = var8.method4333(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class99(arg3, 1, arg4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2578(arg0, arg1, arg2, var16, var24, (class141) null, field733[arg4], 0, var19, var20);
            if (var8.field3505) {
                if (arg4 == 0) {
                    Statics.field739[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field739[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field739[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field739[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2875(arg1, arg2, arg5, arg4, var8.field3506);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class141 var26;
            class141 var27;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var26 = var8.method4333(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4333(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class99(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
                var27 = new class99(arg3, 2, var25, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2578(arg0, arg1, arg2, var16, var26, var27, field724[arg4], field724[var25], var19, var20);
            if (var8.field3510) {
                if (arg4 == 0) {
                    Statics.field1711[arg0][arg1][arg2] |= 0x249;
                    Statics.field1711[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1711[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1711[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1711[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1711[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1711[arg0][arg1][arg2] |= 0x492;
                    Statics.field1711[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2875(arg1, arg2, arg5, arg4, var8.field3506);
            }
            if (var8.field3492 != 16) {
                arg6.method2632(arg0, arg1, arg2, var8.field3492);
            }
        } else if (arg5 == 3) {
            class141 var28;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var28 = var8.method4333(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class99(arg3, 3, arg4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2578(arg0, arg1, arg2, var16, var28, (class141) null, field733[arg4], 0, var19, var20);
            if (var8.field3505) {
                if (arg4 == 0) {
                    Statics.field739[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field739[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field739[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field739[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2875(arg1, arg2, arg5, arg4, var8.field3506);
            }
        } else if (arg5 == 9) {
            class141 var29;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var29 = var8.method4333(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2560(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2868(arg1, arg2, var9, var10, var8.field3506);
            }
            if (var8.field3492 != 16) {
                arg6.method2632(arg0, arg1, arg2, var8.field3492);
            }
        } else if (arg5 == 4) {
            class141 var30;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var30 = var8.method4333(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2559(arg0, arg1, arg2, var16, var30, (class141) null, field724[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2583(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class263.method190(var32 >> 14 & 0x7FFF).field3492;
            }
            class141 var33;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var33 = var8.method4333(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2559(arg0, arg1, arg2, var16, var33, (class141) null, field724[arg4], 0, field734[arg4] * var31, field735[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2583(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class263.method190(var35 >> 14 & 0x7FFF).field3492 / 2;
            }
            class141 var36;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var36 = var8.method4333(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2559(arg0, arg1, arg2, var16, var36, (class141) null, 256, arg4, field725[arg4] * var34, field737[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class141 var38;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var38 = var8.method4333(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class99(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2559(arg0, arg1, arg2, var16, var38, (class141) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2583(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class263.method190(var40 >> 14 & 0x7FFF).field3492 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class141 var42;
            class141 var43;
            if (var8.field3511 == -1 && var8.field3519 == null) {
                var42 = var8.method4333(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4333(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
                var43 = new class99(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3511, true, (class141) null);
            }
            arg6.method2559(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field725[arg4] * var39, field737[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ag.n(IIII)I")
    public static final int method264(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method741(var3, var5);
        int var8 = method741(var3 + 1, var5);
        int var9 = method741(var3, var5 + 1);
        int var10 = method741(var3 + 1, var5 + 1);
        int var11 = method2821(var7, var8, var4, arg2);
        int var12 = method2821(var9, var10, var4, arg2);
        return method2821(var11, var12, var6, arg2);
    }

    @ObfuscatedName("fp.c(IIIII)I")
    public static final int method2821(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class136.field1953[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bo.a(III)I")
    public static final int method741(int arg0, int arg1) {
        int var2 = method1(arg0 - 1, arg1 - 1) + method1(arg0 + 1, arg1 - 1) + method1(arg0 - 1, arg1 + 1) + method1(arg0 + 1, arg1 + 1);
        int var3 = method1(arg0 - 1, arg1) + method1(arg0 + 1, arg1) + method1(arg0, arg1 - 1) + method1(arg0, arg1 + 1);
        int var4 = method1(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("p.y(III)I")
    public static final int method1(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("jn.w(III)I")
    public static final int method4722(int arg0, int arg1) {
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

    @ObfuscatedName("aw.k(III)I")
    public static final int method536(int arg0, int arg1) {
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

    @ObfuscatedName("client.h(III)Z")
    public static final boolean method1462(int arg0, int arg1) {
        class263 var2 = class263.method190(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4331(arg1);
    }

    @ObfuscatedName("kb.u(IIIIIIILec;Lfa;S)V")
    public static final void method5016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class139 arg7, class163 arg8) {
        class263 var9 = class263.method190(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3525;
            var11 = var9.field3503;
        } else {
            var10 = var9.field3503;
            var11 = var9.field3525;
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
        int[][] var16 = field740[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field3507 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field3528 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class141 var22;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var22 = var9.method4334(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class99(arg4, 22, arg5, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2556(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field3527 == 1) {
                arg8.method2870(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class141 var45;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var45 = var9.method4334(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class99(arg4, 10, arg5, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            if (var45 != null) {
                arg7.method2560(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field3527 != 0) {
                arg8.method2868(arg2, arg3, var10, var11, var9.field3506);
            }
        } else if (arg6 >= 12) {
            class141 var23;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var23 = var9.method4334(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class99(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2560(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field3527 != 0) {
                arg8.method2868(arg2, arg3, var10, var11, var9.field3506);
            }
        } else if (arg6 == 0) {
            class141 var24;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var24 = var9.method4334(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class99(arg4, 0, arg5, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2578(arg0, arg2, arg3, var17, var24, (class141) null, field724[arg5], 0, var20, var21);
            if (var9.field3527 != 0) {
                arg8.method2875(arg2, arg3, arg6, arg5, var9.field3506);
            }
        } else if (arg6 == 1) {
            class141 var25;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var25 = var9.method4334(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class99(arg4, 1, arg5, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2578(arg0, arg2, arg3, var17, var25, (class141) null, field733[arg5], 0, var20, var21);
            if (var9.field3527 != 0) {
                arg8.method2875(arg2, arg3, arg6, arg5, var9.field3506);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class141 var27;
            class141 var28;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var27 = var9.method4334(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method4334(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class99(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3511, true, (class141) null);
                var28 = new class99(arg4, 2, var26, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2578(arg0, arg2, arg3, var17, var27, var28, field724[arg5], field724[var26], var20, var21);
            if (var9.field3527 != 0) {
                arg8.method2875(arg2, arg3, arg6, arg5, var9.field3506);
            }
        } else if (arg6 == 3) {
            class141 var29;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var29 = var9.method4334(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class99(arg4, 3, arg5, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2578(arg0, arg2, arg3, var17, var29, (class141) null, field733[arg5], 0, var20, var21);
            if (var9.field3527 != 0) {
                arg8.method2875(arg2, arg3, arg6, arg5, var9.field3506);
            }
        } else if (arg6 == 9) {
            class141 var30;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var30 = var9.method4334(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class99(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2560(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field3527 != 0) {
                arg8.method2868(arg2, arg3, var10, var11, var9.field3506);
            }
        } else if (arg6 == 4) {
            class141 var31;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var31 = var9.method4334(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class99(arg4, 4, arg5, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2559(arg0, arg2, arg3, var17, var31, (class141) null, field724[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2583(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class263.method190(var33 >> 14 & 0x7FFF).field3492;
            }
            class141 var34;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var34 = var9.method4334(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class99(arg4, 4, arg5, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2559(arg0, arg2, arg3, var17, var34, (class141) null, field724[arg5], 0, field734[arg5] * var32, field735[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2583(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class263.method190(var36 >> 14 & 0x7FFF).field3492 / 2;
            }
            class141 var37;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var37 = var9.method4334(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class99(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2559(arg0, arg2, arg3, var17, var37, (class141) null, 256, arg5, field725[arg5] * var35, field737[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class141 var39;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var39 = var9.method4334(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class99(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2559(arg0, arg2, arg3, var17, var39, (class141) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2583(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class263.method190(var41 >> 14 & 0x7FFF).field3492 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class141 var43;
            class141 var44;
            if (var9.field3511 == -1 && var9.field3519 == null) {
                var43 = var9.method4334(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method4334(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class99(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3511, true, (class141) null);
                var44 = new class99(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field3511, true, (class141) null);
            }
            arg7.method2559(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field725[arg5] * var40, field737[arg5] * var40, var20, var21);
        }
    }
}
