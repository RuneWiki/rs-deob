package deob;

@ObfuscatedName("e")
public final class class60 {

    @ObfuscatedName("e.d")
    public static int field522 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("e.b")
    public static final int[] field524 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("e.c")
    public static final int[] field527 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("e.a")
    public static int field528 = (int) (Math.random() * 33.0D) - 16;

    @ObfuscatedName("e.o")
    public static int field513 = 99;

    @ObfuscatedName("e.j")
    public static int[][][] field511 = new int[4][105][105];

    @ObfuscatedName("e.k")
    public static final int[] field518 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("e.u")
    public static final int[] field525 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("e.q")
    public static final int[] field526 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("e.p")
    public static byte[][][] field512 = new byte[4][104][104];

    @ObfuscatedName("e.y")
    public static final int[] field523 = new int[] { 1, 0, -1, 0 };

    public class60() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.j(IIIIB)V")
    public static final void method770(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1079[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field511[0][var5][var4] = field511[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field511[0][var5][var4] = field511[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field511[0][var5][var4] = field511[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field511[0][var5][var4] = field511[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("eu.z(IIIIIIILcu;Lfj;B)V")
    public static final void method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class141 arg7, class8 arg8) {
        class184 var9 = Statics.method2861(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2834;
            var11 = var9.field2804;
        } else {
            var10 = var9.field2804;
            var11 = var9.field2834;
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
        int[][] var16 = field511[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field2808 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field2793 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class144 var22;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var22 = var9.method3498(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class80(arg4, 22, arg5, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2372(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field2799 == 1) {
                arg8.method168(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class144 var45;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var45 = var9.method3498(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class80(arg4, 10, arg5, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            if (var45 != null) {
                arg7.method2376(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field2799 != 0) {
                arg8.method204(arg2, arg3, var10, var11, var9.field2807);
            }
        } else if (arg6 >= 12) {
            class144 var23;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var23 = var9.method3498(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class80(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2376(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field2799 != 0) {
                arg8.method204(arg2, arg3, var10, var11, var9.field2807);
            }
        } else if (arg6 == 0) {
            class144 var24;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var24 = var9.method3498(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class80(arg4, 0, arg5, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2437(arg0, arg2, arg3, var17, var24, (class144) null, field527[arg5], 0, var20, var21);
            if (var9.field2799 != 0) {
                arg8.method165(arg2, arg3, arg6, arg5, var9.field2807);
            }
        } else if (arg6 == 1) {
            class144 var25;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var25 = var9.method3498(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class80(arg4, 1, arg5, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2437(arg0, arg2, arg3, var17, var25, (class144) null, field525[arg5], 0, var20, var21);
            if (var9.field2799 != 0) {
                arg8.method165(arg2, arg3, arg6, arg5, var9.field2807);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class144 var27;
            class144 var28;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var27 = var9.method3498(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method3498(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class80(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2812, true, (class144) null);
                var28 = new class80(arg4, 2, var26, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2437(arg0, arg2, arg3, var17, var27, var28, field527[arg5], field527[var26], var20, var21);
            if (var9.field2799 != 0) {
                arg8.method165(arg2, arg3, arg6, arg5, var9.field2807);
            }
        } else if (arg6 == 3) {
            class144 var29;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var29 = var9.method3498(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class80(arg4, 3, arg5, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2437(arg0, arg2, arg3, var17, var29, (class144) null, field525[arg5], 0, var20, var21);
            if (var9.field2799 != 0) {
                arg8.method165(arg2, arg3, arg6, arg5, var9.field2807);
            }
        } else if (arg6 == 9) {
            class144 var30;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var30 = var9.method3498(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class80(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2376(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2799 != 0) {
                arg8.method204(arg2, arg3, var10, var11, var9.field2807);
            }
        } else if (arg6 == 4) {
            class144 var31;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var31 = var9.method3498(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class80(arg4, 4, arg5, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2375(arg0, arg2, arg3, var17, var31, (class144) null, field527[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2392(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = Statics.method2861(var33 >> 14 & 0x7FFF).field2813;
            }
            class144 var34;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var34 = var9.method3498(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class80(arg4, 4, arg5, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2375(arg0, arg2, arg3, var17, var34, (class144) null, field527[arg5], 0, field523[arg5] * var32, field524[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2392(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = Statics.method2861(var36 >> 14 & 0x7FFF).field2813 / 2;
            }
            class144 var37;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var37 = var9.method3498(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class80(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2375(arg0, arg2, arg3, var17, var37, (class144) null, 256, arg5, field518[arg5] * var35, field526[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class144 var39;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var39 = var9.method3498(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class80(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2375(arg0, arg2, arg3, var17, var39, (class144) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2392(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = Statics.method2861(var41 >> 14 & 0x7FFF).field2813 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class144 var43;
            class144 var44;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var43 = var9.method3498(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method3498(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class80(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2812, true, (class144) null);
                var44 = new class80(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field2812, true, (class144) null);
            }
            arg7.method2375(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field518[arg5] * var40, field526[arg5] * var40, var20, var21);
        }
    }

    @ObfuscatedName("a.o(Ldy;IIIIIIB)V")
    public static final void method897(class31 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method512();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method512();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method512();
                }
            }
            return;
        }
        field512[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method512();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field511[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1342(var10 + 45365, var11 + 91923, 4) - 128 + (method1342(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1342(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field511[arg1][arg2][arg3] = field511[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method512();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field511[0][arg2][arg3] = -var15 * 8;
                } else {
                    field511[arg1][arg2][arg3] = field511[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field515[arg1][arg2][arg3] = arg0.method492();
                Statics.field530[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field481[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field512[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field516[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("n.n(III)I")
    public static final int method899(int arg0, int arg1) {
        int var2 = method1925(arg0 - 1, arg1 - 1) + method1925(arg0 + 1, arg1 - 1) + method1925(arg0 - 1, arg1 + 1) + method1925(arg0 + 1, arg1 + 1);
        int var3 = method1925(arg0 - 1, arg1) + method1925(arg0 + 1, arg1) + method1925(arg0, arg1 - 1) + method1925(arg0, arg1 + 1);
        int var4 = method1925(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("t.p(IIII)V")
    public static final void method1188(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field511[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field511[arg0][arg1][arg2 + var5] = field511[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field511[arg0][arg1 + var6][arg2] = field511[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field511[arg0][arg1 - 1][arg2] != 0) {
            field511[arg0][arg1][arg2] = field511[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field511[arg0][arg1][arg2 - 1] != 0) {
            field511[arg0][arg1][arg2] = field511[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field511[arg0][arg1 - 1][arg2 - 1] != 0) {
            field511[arg0][arg1][arg2] = field511[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ei.r(IIII)I")
    public static final int method1342(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method899(var3, var5);
        int var8 = method899(var3 + 1, var5);
        int var9 = method899(var3, var5 + 1);
        int var10 = method899(var3 + 1, var5 + 1);
        int var11 = 65536 - class151.field2286[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class151.field2286[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class151.field2286[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("bv.g(III)I")
    public static final int method1925(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bj.x(IIII)I")
    public static final int method2010(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ck.t(IIIIIILcu;Lfj;B)V")
    public static final void method2783(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class141 arg6, class8 arg7) {
        if (client.field1478 && (field512[0][arg1][arg2] & 0x2) == 0) {
            if ((field512[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field512[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field512[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field1527 != var8) {
                return;
            }
        }
        if (arg0 < field513) {
            field513 = arg0;
        }
        class184 var9 = Statics.method2861(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field2834;
            var11 = var9.field2804;
        } else {
            var10 = var9.field2804;
            var11 = var9.field2834;
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
        int[][] var16 = field511[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field2808 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field2793 == 1) {
            var21 += 256;
        }
        if (var9.method3500()) {
            class66.method3457(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field1478 || var9.field2808 != 0 || var9.field2799 == 1 || var9.field2828) {
                class144 var22;
                if (var9.field2812 == -1 && var9.field2831 == null) {
                    var22 = var9.method3499(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class80(arg3, 22, arg4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
                }
                arg6.method2372(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field2799 == 1 && arg7 != null) {
                    arg7.method168(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class144 var45;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var45 = var9.method3499(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class80(arg3, 10, arg4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            if (var45 != null && arg6.method2376(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field2837) {
                int var46 = 15;
                if (var45 instanceof class41) {
                    var46 = ((class41) var45).method646() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field1079[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field1079[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field2799 != 0 && arg7 != null) {
                arg7.method204(arg1, arg2, var10, var11, var9.field2807);
            }
        } else if (arg5 >= 12) {
            class144 var23;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var23 = var9.method3499(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2376(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1053[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field2799 != 0 && arg7 != null) {
                arg7.method204(arg1, arg2, var10, var11, var9.field2807);
            }
        } else if (arg5 == 0) {
            class144 var24;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var24 = var9.method3499(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class80(arg3, 0, arg4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2437(arg0, arg1, arg2, var17, var24, (class144) null, field527[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field2837) {
                    Statics.field1079[arg0][arg1][arg2] = 50;
                    Statics.field1079[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field2811) {
                    Statics.field1053[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field2837) {
                    Statics.field1079[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1079[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field2811) {
                    Statics.field1053[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field2837) {
                    Statics.field1079[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1079[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field2811) {
                    Statics.field1053[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field2837) {
                    Statics.field1079[arg0][arg1][arg2] = 50;
                    Statics.field1079[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field2811) {
                    Statics.field1053[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field2799 != 0 && arg7 != null) {
                arg7.method165(arg1, arg2, arg5, arg4, var9.field2807);
            }
            if (var9.field2813 != 16) {
                arg6.method2435(arg0, arg1, arg2, var9.field2813);
            }
        } else if (arg5 == 1) {
            class144 var25;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var25 = var9.method3499(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class80(arg3, 1, arg4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2437(arg0, arg1, arg2, var17, var25, (class144) null, field525[arg4], 0, var20, var21);
            if (var9.field2837) {
                if (arg4 == 0) {
                    Statics.field1079[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1079[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1079[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1079[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field2799 != 0 && arg7 != null) {
                arg7.method165(arg1, arg2, arg5, arg4, var9.field2807);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class144 var27;
            class144 var28;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var27 = var9.method3499(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method3499(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class80(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
                var28 = new class80(arg3, 2, var26, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2437(arg0, arg1, arg2, var17, var27, var28, field527[arg4], field527[var26], var20, var21);
            if (var9.field2811) {
                if (arg4 == 0) {
                    Statics.field1053[arg0][arg1][arg2] |= 0x249;
                    Statics.field1053[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1053[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1053[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1053[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1053[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1053[arg0][arg1][arg2] |= 0x492;
                    Statics.field1053[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field2799 != 0 && arg7 != null) {
                arg7.method165(arg1, arg2, arg5, arg4, var9.field2807);
            }
            if (var9.field2813 != 16) {
                arg6.method2435(arg0, arg1, arg2, var9.field2813);
            }
        } else if (arg5 == 3) {
            class144 var29;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var29 = var9.method3499(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class80(arg3, 3, arg4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2437(arg0, arg1, arg2, var17, var29, (class144) null, field525[arg4], 0, var20, var21);
            if (var9.field2837) {
                if (arg4 == 0) {
                    Statics.field1079[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1079[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1079[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1079[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field2799 != 0 && arg7 != null) {
                arg7.method165(arg1, arg2, arg5, arg4, var9.field2807);
            }
        } else if (arg5 == 9) {
            class144 var30;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var30 = var9.method3499(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class80(arg3, arg5, arg4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2376(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2799 != 0 && arg7 != null) {
                arg7.method204(arg1, arg2, var10, var11, var9.field2807);
            }
            if (var9.field2813 != 16) {
                arg6.method2435(arg0, arg1, arg2, var9.field2813);
            }
        } else if (arg5 == 4) {
            class144 var31;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var31 = var9.method3499(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2375(arg0, arg1, arg2, var17, var31, (class144) null, field527[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method2392(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = Statics.method2861(var33 >> 14 & 0x7FFF).field2813;
            }
            class144 var34;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var34 = var9.method3499(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class80(arg3, 4, arg4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2375(arg0, arg1, arg2, var17, var34, (class144) null, field527[arg4], 0, field523[arg4] * var32, field524[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method2392(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = Statics.method2861(var36 >> 14 & 0x7FFF).field2813 / 2;
            }
            class144 var37;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var37 = var9.method3499(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2375(arg0, arg1, arg2, var17, var37, (class144) null, 256, arg4, field518[arg4] * var35, field526[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class144 var39;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var39 = var9.method3499(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class80(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2375(arg0, arg1, arg2, var17, var39, (class144) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method2392(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = Statics.method2861(var41 >> 14 & 0x7FFF).field2813 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class144 var43;
            class144 var44;
            if (var9.field2812 == -1 && var9.field2831 == null) {
                var43 = var9.method3499(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method3499(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class80(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
                var44 = new class80(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field2812, true, (class144) null);
            }
            arg6.method2375(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field518[arg4] * var40, field526[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("ar.e(IIB)I")
    public static final int method3170(int arg0, int arg1) {
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

    @ObfuscatedName("af.h(Lcu;[Lfj;B)V")
    public static final void method3575(class141 arg0, class8[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field512[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field512[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method167(var3, var4);
                        }
                    }
                }
            }
        }
        field522 += (int) (Math.random() * 5.0D) - 2;
        if (field522 < -8) {
            field522 = -8;
        }
        if (field522 > 8) {
            field522 = 8;
        }
        field528 += (int) (Math.random() * 5.0D) - 2;
        if (field528 < -16) {
            field528 = -16;
        }
        if (field528 > 16) {
            field528 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1079[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field511[var6][var11 + 1][var10] - field511[var6][var11 - 1][var10];
                    int var13 = field511[var6][var11][var10 + 1] - field511[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field562[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field517[var20] = 0;
                Statics.field514[var20] = 0;
                Statics.field2645[var20] = 0;
                Statics.field1095[var20] = 0;
                Statics.field2630[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field516[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class180 var26 = (class180) class180.field2680.method908((long) var25);
                            class180 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field2673.method1083(1, var25);
                                class180 var29 = new class180();
                                if (var28 != null) {
                                    var29.method3415(new class31(var28), var25);
                                }
                                var29.method3414();
                                class180.field2680.method907(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field517[var22] += var27.field2672;
                            Statics.field514[var22] += var27.field2681;
                            Statics.field2645[var22] += var27.field2674;
                            Statics.field1095[var22] += var27.field2675;
                            var10002 = Statics.field2630[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field516[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            class180 var33 = class180.method857(var32 - 1);
                            Statics.field517[var22] -= var33.field2672;
                            Statics.field514[var22] -= var33.field2681;
                            Statics.field2645[var22] -= var33.field2674;
                            Statics.field1095[var22] -= var33.field2675;
                            var10002 = Statics.field2630[var22]--;
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
                            var34 += Statics.field517[var40];
                            var35 += Statics.field514[var40];
                            var36 += Statics.field2645[var40];
                            var37 += Statics.field1095[var40];
                            var38 += Statics.field2630[var40];
                        }
                        int var41 = var39 - 5;
                        if (var41 >= 0 && var41 < 104) {
                            var34 -= Statics.field517[var41];
                            var35 -= Statics.field514[var41];
                            var36 -= Statics.field2645[var41];
                            var37 -= Statics.field1095[var41];
                            var38 -= Statics.field2630[var41];
                        }
                        if (var39 >= 1 && var39 < 103) {
                            if (client.field1478 && (field512[0][var21][var39] & 0x2) == 0) {
                                if ((field512[var6][var21][var39] & 0x10) != 0) {
                                    continue;
                                }
                                int var42;
                                if ((field512[var6][var21][var39] & 0x8) != 0) {
                                    var42 = 0;
                                } else if (var6 <= 0 || (field512[1][var21][var39] & 0x2) == 0) {
                                    var42 = var6;
                                } else {
                                    var42 = var6 - 1;
                                }
                                if (client.field1527 != var42) {
                                    continue;
                                }
                            }
                            if (var6 < field513) {
                                field513 = var6;
                            }
                            int var43 = Statics.field516[var6][var21][var39] & 0xFF;
                            int var44 = Statics.field515[var6][var21][var39] & 0xFF;
                            if (var43 > 0 || var44 > 0) {
                                int var45 = field511[var6][var21][var39];
                                int var46 = field511[var6][var21 + 1][var39];
                                int var47 = field511[var6][var21 + 1][var39 + 1];
                                int var48 = field511[var6][var21][var39 + 1];
                                int var49 = Statics.field562[var21][var39];
                                int var50 = Statics.field562[var21 + 1][var39];
                                int var51 = Statics.field562[var21 + 1][var39 + 1];
                                int var52 = Statics.field562[var21][var39 + 1];
                                int var53 = -1;
                                int var54 = -1;
                                if (var43 > 0) {
                                    int var55 = var34 * 256 / var37;
                                    int var56 = var35 / var38;
                                    int var57 = var36 / var38;
                                    var53 = method2010(var55, var56, var57);
                                    int var58 = field522 + var55 & 0xFF;
                                    int var59 = field528 + var57;
                                    if (var59 < 0) {
                                        var59 = 0;
                                    } else if (var59 > 255) {
                                        var59 = 255;
                                    }
                                    var54 = method2010(var58, var56, var59);
                                }
                                if (var6 > 0) {
                                    boolean var60 = true;
                                    if (var43 == 0 && Statics.field530[var6][var21][var39] != 0) {
                                        var60 = false;
                                    }
                                    if (var44 > 0 && !class164.method298(var44 - 1).field2460) {
                                        var60 = false;
                                    }
                                    if (var60 && var45 == var46 && var45 == var47 && var45 == var48) {
                                        Statics.field1053[var6][var21][var39] |= 0x924;
                                    }
                                }
                                int var61 = 0;
                                if (var54 != -1) {
                                    var61 = class151.field2279[method3170(var54, 96)];
                                }
                                if (var44 == 0) {
                                    arg0.method2513(var6, var21, var39, 0, 0, -1, var45, var46, var47, var48, method3170(var53, var49), method3170(var53, var50), method3170(var53, var51), method3170(var53, var52), 0, 0, 0, 0, var61, 0);
                                } else {
                                    int var62 = Statics.field530[var6][var21][var39] + 1;
                                    byte var63 = Statics.field481[var6][var21][var39];
                                    class164 var64 = class164.method298(var44 - 1);
                                    int var65 = var64.field2459;
                                    int var66;
                                    int var67;
                                    if (var65 >= 0) {
                                        var66 = Statics.field2276.method739(var65);
                                        var67 = -1;
                                    } else if (var64.field2473 == 16711935) {
                                        var67 = -2;
                                        var65 = -1;
                                        var66 = -2;
                                    } else {
                                        var67 = method2010(var64.field2471, var64.field2463, var64.field2464);
                                        int var68 = field522 + var64.field2471 & 0xFF;
                                        int var69 = field528 + var64.field2464;
                                        if (var69 < 0) {
                                            var69 = 0;
                                        } else if (var69 > 255) {
                                            var69 = 255;
                                        }
                                        var66 = method2010(var68, var64.field2463, var69);
                                    }
                                    int var70 = 0;
                                    if (var66 != -2) {
                                        var70 = class151.field2279[Statics.method3433(var66, 96)];
                                    }
                                    if (var64.field2465 != -1) {
                                        int var71 = field522 + var64.field2462 & 0xFF;
                                        int var72 = field528 + var64.field2461;
                                        if (var72 < 0) {
                                            var72 = 0;
                                        } else if (var72 > 255) {
                                            var72 = 255;
                                        }
                                        int var73 = method2010(var71, var64.field2466, var72);
                                        var70 = class151.field2279[Statics.method3433(var73, 96)];
                                    }
                                    arg0.method2513(var6, var21, var39, var62, var63, var65, var45, var46, var47, var48, method3170(var53, var49), method3170(var53, var50), method3170(var53, var51), method3170(var53, var52), Statics.method3433(var67, var49), Statics.method3433(var67, var50), Statics.method3433(var67, var51), Statics.method3433(var67, var52), var61, var70);
                                }
                            }
                        }
                    }
                }
            }
            for (int var74 = 1; var74 < 103; var74++) {
                for (int var75 = 1; var75 < 103; var75++) {
                    int var80;
                    if ((field512[var6][var75][var74] & 0x8) != 0) {
                        var80 = 0;
                    } else if (var6 <= 0 || (field512[1][var75][var74] & 0x2) == 0) {
                        var80 = var6;
                    } else {
                        var80 = var6 - 1;
                    }
                    arg0.method2390(var6, var75, var74, var80);
                }
            }
            Statics.field516[var6] = (byte[][]) null;
            Statics.field515[var6] = (byte[][]) null;
            Statics.field530[var6] = (byte[][]) null;
            Statics.field481[var6] = (byte[][]) null;
            Statics.field1079[var6] = (byte[][]) null;
        }
        arg0.method2397(-50, -10, -50);
        for (int var81 = 0; var81 < 104; var81++) {
            for (int var82 = 0; var82 < 104; var82++) {
                if ((field512[1][var81][var82] & 0x2) == 2) {
                    arg0.method2383(var81, var82);
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
                        if ((Statics.field1053[var87][var89][var88] & var83) != 0) {
                            int var90 = var88;
                            int var91 = var88;
                            int var92 = var87;
                            int var93 = var87;
                            while (var90 > 0 && (Statics.field1053[var87][var89][var90 - 1] & var83) != 0) {
                                var90--;
                            }
                            while (var91 < 104 && (Statics.field1053[var87][var89][var91 + 1] & var83) != 0) {
                                var91++;
                            }
                            label360: while (var92 > 0) {
                                for (int var94 = var90; var94 <= var91; var94++) {
                                    if ((Statics.field1053[var92 - 1][var89][var94] & var83) == 0) {
                                        break label360;
                                    }
                                }
                                var92--;
                            }
                            label349: while (var93 < var86) {
                                for (int var95 = var90; var95 <= var91; var95++) {
                                    if ((Statics.field1053[var93 + 1][var89][var95] & var83) == 0) {
                                        break label349;
                                    }
                                }
                                var93++;
                            }
                            int var96 = (var93 + 1 - var92) * (var91 - var90 + 1);
                            if (var96 >= 8) {
                                short var97 = 240;
                                int var98 = field511[var93][var89][var90] - var97;
                                int var99 = field511[var92][var89][var90];
                                class141.method2369(var86, 1, var89 * 128, var89 * 128, var90 * 128, var91 * 128 + 128, var98, var99);
                                for (int var100 = var92; var100 <= var93; var100++) {
                                    for (int var101 = var90; var101 <= var91; var101++) {
                                        Statics.field1053[var100][var89][var101] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1053[var87][var89][var88] & var84) != 0) {
                            int var102 = var89;
                            int var103 = var89;
                            int var104 = var87;
                            int var105 = var87;
                            while (var102 > 0 && (Statics.field1053[var87][var102 - 1][var88] & var84) != 0) {
                                var102--;
                            }
                            while (var103 < 104 && (Statics.field1053[var87][var103 + 1][var88] & var84) != 0) {
                                var103++;
                            }
                            label413: while (var104 > 0) {
                                for (int var106 = var102; var106 <= var103; var106++) {
                                    if ((Statics.field1053[var104 - 1][var106][var88] & var84) == 0) {
                                        break label413;
                                    }
                                }
                                var104--;
                            }
                            label402: while (var105 < var86) {
                                for (int var107 = var102; var107 <= var103; var107++) {
                                    if ((Statics.field1053[var105 + 1][var107][var88] & var84) == 0) {
                                        break label402;
                                    }
                                }
                                var105++;
                            }
                            int var108 = (var105 + 1 - var104) * (var103 - var102 + 1);
                            if (var108 >= 8) {
                                short var109 = 240;
                                int var110 = field511[var105][var102][var88] - var109;
                                int var111 = field511[var104][var102][var88];
                                class141.method2369(var86, 2, var102 * 128, var103 * 128 + 128, var88 * 128, var88 * 128, var110, var111);
                                for (int var112 = var104; var112 <= var105; var112++) {
                                    for (int var113 = var102; var113 <= var103; var113++) {
                                        Statics.field1053[var112][var113][var88] &= ~var84;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1053[var87][var89][var88] & var85) != 0) {
                            int var114 = var89;
                            int var115 = var89;
                            int var116 = var88;
                            int var117 = var88;
                            while (var116 > 0 && (Statics.field1053[var87][var89][var116 - 1] & var85) != 0) {
                                var116--;
                            }
                            while (var117 < 104 && (Statics.field1053[var87][var89][var117 + 1] & var85) != 0) {
                                var117++;
                            }
                            label466: while (var114 > 0) {
                                for (int var118 = var116; var118 <= var117; var118++) {
                                    if ((Statics.field1053[var87][var114 - 1][var118] & var85) == 0) {
                                        break label466;
                                    }
                                }
                                var114--;
                            }
                            label455: while (var115 < 104) {
                                for (int var119 = var116; var119 <= var117; var119++) {
                                    if ((Statics.field1053[var87][var115 + 1][var119] & var85) == 0) {
                                        break label455;
                                    }
                                }
                                var115++;
                            }
                            if ((var115 - var114 + 1) * (var117 - var116 + 1) >= 4) {
                                int var120 = field511[var87][var114][var116];
                                class141.method2369(var86, 4, var114 * 128, var115 * 128 + 128, var116 * 128, var117 * 128 + 128, var120, var120);
                                for (int var121 = var114; var121 <= var115; var121++) {
                                    for (int var122 = var116; var122 <= var117; var122++) {
                                        Statics.field1053[var87][var121][var122] &= ~var85;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
