package deob;

@ObfuscatedName("cg")
public final class class90 {

    @ObfuscatedName("cg.v")
    public static int[][][] field1128 = new int[4][105][105];

    @ObfuscatedName("cg.n")
    public static byte[][][] field1119 = new byte[4][104][104];

    @ObfuscatedName("cg.f")
    public static int field1120 = 99;

    @ObfuscatedName("cg.m")
    public static final int[] field1118 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("cg.x")
    public static final int[] field1126 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("cg.z")
    public static final int[] field1127 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("cg.w")
    public static final int[] field1124 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("cg.t")
    public static final int[] field1129 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("cg.h")
    public static final int[] field1130 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("cg.q")
    public static int field1131 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("cg.i")
    public static int field1132 = (int) (Math.random() * 33.0D) - 16;

    public class90() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.v(I)V")
    public static void method228() {
        field1120 = 99;
        Statics.field1121 = new byte[4][104][104];
        Statics.field3131 = new byte[4][104][104];
        Statics.field183 = new byte[4][104][104];
        Statics.field3129 = new byte[4][104][104];
        Statics.field1420 = new int[4][105][105];
        Statics.field4124 = new byte[4][105][105];
        Statics.field2814 = new int[105][105];
        Statics.field1113 = new int[104];
        Statics.field202 = new int[104];
        Statics.field1122 = new int[104];
        Statics.field1714 = new int[104];
        Statics.field3895 = new int[104];
    }

    @ObfuscatedName("ax.n(B)V")
    public static void method229() {
        Statics.field1121 = (byte[][][]) null;
        Statics.field3131 = (byte[][][]) null;
        Statics.field183 = (byte[][][]) null;
        Statics.field3129 = (byte[][][]) null;
        Statics.field1420 = (int[][][]) null;
        Statics.field4124 = (byte[][][]) null;
        Statics.field2814 = (int[][]) null;
        Statics.field1113 = null;
        Statics.field202 = null;
        Statics.field1122 = null;
        Statics.field1714 = null;
        Statics.field3895 = null;
    }

    @ObfuscatedName("eq.f(IIIII)V")
    public static final void method2844(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field4124[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1128[0][var5][var4] = field1128[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1128[0][var5][var4] = field1128[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1128[0][var5][var4] = field1128[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1128[0][var5][var4] = field1128[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fv.y([BIIII[Lfz;I)V")
    public static final void method3329(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class158[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1903[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class383 var9 = new class383(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3362(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("cb.p(IIII)V")
    public static final void method1908(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field1128[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field1128[arg0][arg1][arg2 + var5] = field1128[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field1128[arg0][arg1 + var6][arg2] = field1128[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field1128[arg0][arg1 - 1][arg2] != 0) {
            field1128[arg0][arg1][arg2] = field1128[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field1128[arg0][arg1][arg2 - 1] != 0) {
            field1128[arg0][arg1][arg2] = field1128[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field1128[arg0][arg1 - 1][arg2 - 1] != 0) {
            field1128[arg0][arg1][arg2] = field1128[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("gz.j(Lnd;IIIIIIB)V")
    public static final void method3362(class383 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method5965();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method5965();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method5965();
                }
            }
            return;
        }
        field1119[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5965();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field1128[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3566(var10 + 45365, var11 + 91923, 4) - 128 + (method3566(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3566(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field1128[arg1][arg2][arg3] = field1128[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method5965();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field1128[0][arg2][arg3] = -var15 * 8;
                } else {
                    field1128[arg1][arg2][arg3] = field1128[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field3131[arg1][arg2][arg3] = arg0.method5966();
                Statics.field183[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3129[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field1119[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1121[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("mv.r([BIIIIIIILgt;[Lfz;I)V")
    public static final void method5730(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class198 arg8, class158[] arg9) {
        class383 var10 = new class383(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method5959();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5979();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method5965();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class154 var21 = class154.method175(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field1791;
                    int var27 = var21.field1803;
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
                    int var32 = arg3 + class244.method3332(var16 & 0x7, var15 & 0x7, arg7, var21.field1791, var21.field1803, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field1119[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class158 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method66(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.b(IIIIIILgt;Lfz;B)V")
    public static final void method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class198 arg6, class158 arg7) {
        if (client.field642 && (field1119[0][arg1][arg2] & 0x2) == 0 && (field1119[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field1120) {
            field1120 = arg0;
        }
        class154 var8 = class154.method175(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field1803;
            var10 = var8.field1791;
        } else {
            var9 = var8.field1791;
            var10 = var8.field1803;
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
        int[][] var15 = field1128[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class206.method281(arg1, arg2, 2, var8.field1772 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field1793 == 1) {
            var21 += 256;
        }
        if (var8.method2724()) {
            class78.method4409(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field642 || var8.field1772 != 0 || var8.field1770 == 1 || var8.field1795) {
                class199 var22;
                if (var8.field1776 == -1 && var8.field1794 == null) {
                    var22 = var8.method2717(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class88(arg3, 22, arg4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
                }
                arg6.method3577(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field1770 == 1 && arg7 != null) {
                    arg7.method2924(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class199 var48;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var48 = var8.method2717(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class88(arg3, 10, arg4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            if (var48 != null && arg6.method3653(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field1784) {
                int var49 = 15;
                if (var48 instanceof class205) {
                    var49 = ((class205) var48).method3818() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field4124[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field4124[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field1770 != 0 && arg7 != null) {
                arg7.method2912(arg1, arg2, var9, var10, var8.field1789);
            }
        } else if (arg5 >= 12) {
            class199 var23;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var23 = var8.method2717(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3653(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1420[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field1770 != 0 && arg7 != null) {
                arg7.method2912(arg1, arg2, var9, var10, var8.field1789);
            }
        } else if (arg5 == 0) {
            class199 var24;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var24 = var8.method2717(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class88(arg3, 0, arg4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3579(arg0, arg1, arg2, var16, var24, (class199) null, field1118[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field1784) {
                    Statics.field4124[arg0][arg1][arg2] = 50;
                    Statics.field4124[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field1768) {
                    Statics.field1420[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field1784) {
                    Statics.field4124[arg0][arg1][arg2 + 1] = 50;
                    Statics.field4124[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1768) {
                    Statics.field1420[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field1784) {
                    Statics.field4124[arg0][arg1 + 1][arg2] = 50;
                    Statics.field4124[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1768) {
                    Statics.field1420[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field1784) {
                    Statics.field4124[arg0][arg1][arg2] = 50;
                    Statics.field4124[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field1768) {
                    Statics.field1420[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field1770 != 0 && arg7 != null) {
                arg7.method2923(arg1, arg2, arg5, arg4, var8.field1789);
            }
            if (var8.field1762 != 16) {
                arg6.method3613(arg0, arg1, arg2, var8.field1762);
            }
        } else if (arg5 == 1) {
            class199 var25;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var25 = var8.method2717(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class88(arg3, 1, arg4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3579(arg0, arg1, arg2, var16, var25, (class199) null, field1126[arg4], 0, var19, var21);
            if (var8.field1784) {
                if (arg4 == 0) {
                    Statics.field4124[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field4124[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field4124[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field4124[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1770 != 0 && arg7 != null) {
                arg7.method2923(arg1, arg2, arg5, arg4, var8.field1789);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class199 var27;
            class199 var28;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var27 = var8.method2717(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method2717(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class88(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
                var28 = new class88(arg3, 2, var26, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3579(arg0, arg1, arg2, var16, var27, var28, field1118[arg4], field1118[var26], var19, var21);
            if (var8.field1768) {
                if (arg4 == 0) {
                    Statics.field1420[arg0][arg1][arg2] |= 0x249;
                    Statics.field1420[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1420[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1420[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1420[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1420[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1420[arg0][arg1][arg2] |= 0x492;
                    Statics.field1420[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field1770 != 0 && arg7 != null) {
                arg7.method2923(arg1, arg2, arg5, arg4, var8.field1789);
            }
            if (var8.field1762 != 16) {
                arg6.method3613(arg0, arg1, arg2, var8.field1762);
            }
        } else if (arg5 == 3) {
            class199 var29;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var29 = var8.method2717(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class88(arg3, 3, arg4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3579(arg0, arg1, arg2, var16, var29, (class199) null, field1126[arg4], 0, var19, var21);
            if (var8.field1784) {
                if (arg4 == 0) {
                    Statics.field4124[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field4124[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field4124[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field4124[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1770 != 0 && arg7 != null) {
                arg7.method2923(arg1, arg2, arg5, arg4, var8.field1789);
            }
        } else if (arg5 == 9) {
            class199 var30;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var30 = var8.method2717(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3653(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field1770 != 0 && arg7 != null) {
                arg7.method2912(arg1, arg2, var9, var10, var8.field1789);
            }
            if (var8.field1762 != 16) {
                arg6.method3613(arg0, arg1, arg2, var8.field1762);
            }
        } else if (arg5 == 4) {
            class199 var31;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var31 = var8.method2717(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3580(arg0, arg1, arg2, var16, var31, (class199) null, field1118[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3596(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class154.method175(Statics.method1888(var33)).field1762;
            }
            class199 var35;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var35 = var8.method2717(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3580(arg0, arg1, arg2, var16, var35, (class199) null, field1118[arg4], 0, field1127[arg4] * var32, field1124[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3596(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class154.method175(Statics.method1888(var37)).field1762 / 2;
            }
            class199 var39;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var39 = var8.method2717(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3580(arg0, arg1, arg2, var16, var39, (class199) null, 256, arg4, field1129[arg4] * var36, field1130[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class199 var41;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var41 = var8.method2717(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class88(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3580(arg0, arg1, arg2, var16, var41, (class199) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3596(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class154.method175(Statics.method1888(var43)).field1762 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class199 var46;
            class199 var47;
            if (var8.field1776 == -1 && var8.field1794 == null) {
                var46 = var8.method2717(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method2717(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
                var47 = new class88(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field1776, var8.field1802, (class199) null);
            }
            arg6.method3580(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field1129[arg4] * var42, field1130[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("k.d(Lgt;[Lfz;I)V")
    public static final void method154(class198 arg0, class158[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field1119[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field1119[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2941(var3, var4);
                        }
                    }
                }
            }
        }
        field1131 += (int) (Math.random() * 5.0D) - 2;
        if (field1131 < -8) {
            field1131 = -8;
        }
        if (field1131 > 8) {
            field1131 = 8;
        }
        field1132 += (int) (Math.random() * 5.0D) - 2;
        if (field1132 < -16) {
            field1132 = -16;
        }
        if (field1132 > 16) {
            field1132 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field4124[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field1128[var6][var11 + 1][var10] - field1128[var6][var11 - 1][var10];
                    int var13 = field1128[var6][var11][var10 + 1] - field1128[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2814[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field1113[var20] = 0;
                Statics.field202[var20] = 0;
                Statics.field1122[var20] = 0;
                Statics.field1714[var20] = 0;
                Statics.field3895[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field1121[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class149 var25 = class149.method150(var24 - 1);
                            Statics.field1113[var22] += var25.field1697;
                            Statics.field202[var22] += var25.field1694;
                            Statics.field1122[var22] += var25.field1699;
                            Statics.field1714[var22] += var25.field1695;
                            var10002 = Statics.field3895[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field1121[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class149 var28 = class149.method150(var27 - 1);
                            Statics.field1113[var22] -= var28.field1697;
                            Statics.field202[var22] -= var28.field1694;
                            Statics.field1122[var22] -= var28.field1699;
                            Statics.field1714[var22] -= var28.field1695;
                            var10002 = Statics.field3895[var22]--;
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
                            var29 += Statics.field1113[var35];
                            var30 += Statics.field202[var35];
                            var31 += Statics.field1122[var35];
                            var32 += Statics.field1714[var35];
                            var33 += Statics.field3895[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field1113[var36];
                            var30 -= Statics.field202[var36];
                            var31 -= Statics.field1122[var36];
                            var32 -= Statics.field1714[var36];
                            var33 -= Statics.field3895[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field642 || (field1119[0][var21][var34] & 0x2) != 0 || (field1119[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field1120) {
                                field1120 = var6;
                            }
                            int var37 = Statics.field1121[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field3131[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field1128[var6][var21][var34];
                                int var40 = field1128[var6][var21 + 1][var34];
                                int var41 = field1128[var6][var21 + 1][var34 + 1];
                                int var42 = field1128[var6][var21][var34 + 1];
                                int var43 = Statics.field2814[var21][var34];
                                int var44 = Statics.field2814[var21 + 1][var34];
                                int var45 = Statics.field2814[var21 + 1][var34 + 1];
                                int var46 = Statics.field2814[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = Statics.method2419(var49, var50, var51);
                                    int var52 = field1131 + var49 & 0xFF;
                                    int var53 = field1132 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = Statics.method2419(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field183[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class156.method685(var38 - 1).field1864) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field1420[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class196.field2273[method2493(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method3576(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2493(var47, var43), method2493(var47, var44), method2493(var47, var45), method2493(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field183[var6][var21][var34] + 1;
                                    byte var57 = Statics.field3129[var6][var21][var34];
                                    class156 var58 = class156.method685(var38 - 1);
                                    int var59 = var58.field1863;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field2282.method3757(var59);
                                        var61 = -1;
                                    } else if (var58.field1866 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = Statics.method2419(var58.field1862, var58.field1868, var58.field1873);
                                        int var62 = field1131 + var58.field1862 & 0xFF;
                                        int var63 = field1132 + var58.field1873;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = Statics.method2419(var62, var58.field1868, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class196.field2273[method183(var60, 96)];
                                    }
                                    if (var58.field1865 != -1) {
                                        int var65 = field1131 + var58.field1869 & 0xFF;
                                        int var66 = field1132 + var58.field1871;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = Statics.method2419(var65, var58.field1870, var66);
                                        var64 = class196.field2273[method183(var67, 96)];
                                    }
                                    arg0.method3576(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method2493(var47, var43), method2493(var47, var44), method2493(var47, var45), method2493(var47, var46), method183(var61, var43), method183(var61, var44), method183(var61, var45), method183(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field1119[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field1119[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method3575(var6, var69, var68, var74);
                }
            }
            Statics.field1121[var6] = (byte[][]) null;
            Statics.field3131[var6] = (byte[][]) null;
            Statics.field183[var6] = (byte[][]) null;
            Statics.field3129[var6] = (byte[][]) null;
            Statics.field4124[var6] = (byte[][]) null;
        }
        arg0.method3601(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field1119[1][var75][var76] & 0x2) == 2) {
                    arg0.method3659(var75, var76);
                }
            }
        }
        int var77 = 1;
        int var78 = 2;
        int var79 = 4;
        for (int var80 = 0; var80 < 4; var80++) {
            if (var80 > 0) {
                var77 <<= 0x3;
                var78 <<= 0x3;
                var79 <<= 0x3;
            }
            for (int var81 = 0; var81 <= var80; var81++) {
                for (int var82 = 0; var82 <= 104; var82++) {
                    for (int var83 = 0; var83 <= 104; var83++) {
                        if ((Statics.field1420[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field1420[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field1420[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field1420[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field1420[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field1128[var87][var83][var84] - var91;
                                int var93 = field1128[var86][var83][var84];
                                class198.method3574(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field1420[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1420[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field1420[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field1420[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field1420[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field1420[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field1128[var99][var96][var82] - var103;
                                int var105 = field1128[var98][var96][var82];
                                class198.method3574(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field1420[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1420[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field1420[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field1420[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field1420[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field1420[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field1128[var81][var108][var110];
                                class198.method3574(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field1420[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ge.s(IIII)I")
    public static final int method3566(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3751(var3, var5);
        int var8 = method3751(var3 + 1, var5);
        int var9 = method3751(var3, var5 + 1);
        int var10 = method3751(var3 + 1, var5 + 1);
        int var11 = 65536 - class196.field2286[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = method684(var9, var10, var4, arg2);
        int var15 = 65536 - class196.field2286[var6 * 1024 / arg2] >> 1;
        return ((65536 - var15) * var12 >> 16) + (var14 * var15 >> 16);
    }

    @ObfuscatedName("bq.u(IIIIB)I")
    public static final int method684(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class196.field2286[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("gn.l(IIB)I")
    public static final int method3751(int arg0, int arg1) {
        int var2 = method4611(arg0 - 1, arg1 - 1) + method4611(arg0 + 1, arg1 - 1) + method4611(arg0 - 1, arg1 + 1) + method4611(arg0 + 1, arg1 + 1);
        int var3 = method4611(arg0 - 1, arg1) + method4611(arg0 + 1, arg1) + method4611(arg0, arg1 - 1) + method4611(arg0, arg1 + 1);
        int var4 = method4611(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("jt.o(III)I")
    public static final int method4611(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("et.c(IIB)I")
    public static final int method2493(int arg0, int arg1) {
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

    @ObfuscatedName("ae.e(III)I")
    public static final int method183(int arg0, int arg1) {
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

    @ObfuscatedName("av.a(IIIIIIILgt;Lfz;B)V")
    public static final void method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class198 arg7, class158 arg8) {
        class154 var9 = class154.method175(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field1803;
            var11 = var9.field1791;
        } else {
            var10 = var9.field1791;
            var11 = var9.field1803;
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
        int[][] var16 = field1128[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class206.method281(arg2, arg3, 2, var9.field1772 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field1793 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class199 var23;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var23 = var9.method2718(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class88(arg4, 22, arg5, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3577(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field1770 == 1) {
                arg8.method2924(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class199 var49;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var49 = var9.method2718(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class88(arg4, 10, arg5, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            if (var49 != null) {
                arg7.method3653(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field1770 != 0) {
                arg8.method2912(arg2, arg3, var10, var11, var9.field1789);
            }
        } else if (arg6 >= 12) {
            class199 var24;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var24 = var9.method2718(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3653(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field1770 != 0) {
                arg8.method2912(arg2, arg3, var10, var11, var9.field1789);
            }
        } else if (arg6 == 0) {
            class199 var25;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var25 = var9.method2718(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class88(arg4, 0, arg5, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3579(arg0, arg2, arg3, var17, var25, (class199) null, field1118[arg5], 0, var20, var22);
            if (var9.field1770 != 0) {
                arg8.method2923(arg2, arg3, arg6, arg5, var9.field1789);
            }
        } else if (arg6 == 1) {
            class199 var26;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var26 = var9.method2718(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class88(arg4, 1, arg5, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3579(arg0, arg2, arg3, var17, var26, (class199) null, field1126[arg5], 0, var20, var22);
            if (var9.field1770 != 0) {
                arg8.method2923(arg2, arg3, arg6, arg5, var9.field1789);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class199 var28;
            class199 var29;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var28 = var9.method2718(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method2718(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class88(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
                var29 = new class88(arg4, 2, var27, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3579(arg0, arg2, arg3, var17, var28, var29, field1118[arg5], field1118[var27], var20, var22);
            if (var9.field1770 != 0) {
                arg8.method2923(arg2, arg3, arg6, arg5, var9.field1789);
            }
        } else if (arg6 == 3) {
            class199 var30;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var30 = var9.method2718(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class88(arg4, 3, arg5, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3579(arg0, arg2, arg3, var17, var30, (class199) null, field1126[arg5], 0, var20, var22);
            if (var9.field1770 != 0) {
                arg8.method2923(arg2, arg3, arg6, arg5, var9.field1789);
            }
        } else if (arg6 == 9) {
            class199 var31;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var31 = var9.method2718(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3653(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field1770 != 0) {
                arg8.method2912(arg2, arg3, var10, var11, var9.field1789);
            }
        } else if (arg6 == 4) {
            class199 var32;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var32 = var9.method2718(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3580(arg0, arg2, arg3, var17, var32, (class199) null, field1118[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method3596(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class154.method175(Statics.method1888(var34)).field1762;
            }
            class199 var36;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var36 = var9.method2718(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3580(arg0, arg2, arg3, var17, var36, (class199) null, field1118[arg5], 0, field1127[arg5] * var33, field1124[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method3596(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class154.method175(Statics.method1888(var38)).field1762 / 2;
            }
            class199 var40;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var40 = var9.method2718(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3580(arg0, arg2, arg3, var17, var40, (class199) null, 256, arg5, field1129[arg5] * var37, field1130[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class199 var42;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var42 = var9.method2718(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class88(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3580(arg0, arg2, arg3, var17, var42, (class199) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method3596(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class154.method175(Statics.method1888(var44)).field1762 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class199 var47;
            class199 var48;
            if (var9.field1776 == -1 && var9.field1794 == null) {
                var47 = var9.method2718(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method2718(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
                var48 = new class88(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field1776, var9.field1802, (class199) null);
            }
            arg7.method3580(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field1129[arg5] * var43, field1130[arg5] * var43, var20, var22);
        }
    }
}
