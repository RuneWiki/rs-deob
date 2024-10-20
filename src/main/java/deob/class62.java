package deob;

@ObfuscatedName("bo")
public final class class62 {

    @ObfuscatedName("bo.s")
    public static int[][][] field911 = new int[4][105][105];

    @ObfuscatedName("bo.t")
    public static byte[][][] field901 = new byte[4][104][104];

    @ObfuscatedName("bo.v")
    public static int field902 = 99;

    @ObfuscatedName("bo.c")
    public static final int[] field908 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bo.i")
    public static final int[] field909 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bo.m")
    public static final int[] field906 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bo.b")
    public static final int[] field913 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bo.z")
    public static final int[] field904 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bo.d")
    public static final int[] field915 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bo.y")
    public static int field914 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bo.g")
    public static int field900 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fq.s(IIIII)V")
    public static final void method2939(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3114[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field911[0][var5][var4] = field911[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field911[0][var5][var4] = field911[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field911[0][var5][var4] = field911[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field911[0][var5][var4] = field911[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bv.t([BIIII[Lfy;I)V")
    public static final void method1610(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class160[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1889[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class385 var9 = new class385(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2277(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("fb.v([BIIIIIII[Lfy;I)V")
    public static final void method3148(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class160[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1889[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class385 var11 = new class385(arg0);
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
                        method2277(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method2277(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("kq.j(IIII)V")
    public static final void method4679(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field911[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field911[arg0][arg1][arg2 + var5] = field911[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field911[arg0][arg1 + var6][arg2] = field911[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field911[arg0][arg1 - 1][arg2] != 0) {
            field911[arg0][arg1][arg2] = field911[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field911[arg0][arg1][arg2 - 1] != 0) {
            field911[arg0][arg1][arg2] = field911[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field911[arg0][arg1 - 1][arg2 - 1] != 0) {
            field911[arg0][arg1][arg2] = field911[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("dg.l(Lnv;IIIIIII)V")
    public static final void method2277(class385 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method5958();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method5958();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method5958();
                }
            }
            return;
        }
        field901[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5958();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field911[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3960(var10 + 45365, var11 + 91923, 4) - 128 + (method3960(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3960(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field911[arg1][arg2][arg3] = field911[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method5958();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field911[0][arg2][arg3] = -var15 * 8;
                } else {
                    field911[arg1][arg2][arg3] = field911[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field895[arg1][arg2][arg3] = arg0.method5959();
                Statics.field916[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field910[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field901[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field3937[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("er.n([BIIIIIIILgw;[Lfy;B)V")
    public static final void method2375(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class200 arg8, class160[] arg9) {
        class385 var10 = new class385(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method6181();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5972();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method5958();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class156 var21 = class156.method2267(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field1750;
                    int var27 = var21.field1751;
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
                    int var32 = arg3 + class246.method3133(var16 & 0x7, var15 & 0x7, arg7, var21.field1750, var21.field1751, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field901[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class160 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method1293(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.w(IIIIIILgw;Lfy;I)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class200 arg6, class160 arg7) {
        if (client.field409 && (field901[0][arg1][arg2] & 0x2) == 0 && (field901[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field902) {
            field902 = arg0;
        }
        class156 var8 = class156.method2267(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field1751;
            var10 = var8.field1750;
        } else {
            var9 = var8.field1750;
            var10 = var8.field1751;
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
        int[][] var15 = field911[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class208.method3213(arg1, arg2, 2, var8.field1754 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field1775 == 1) {
            var21 += 256;
        }
        if (var8.method2683()) {
            class50.method3037(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field409 || var8.field1754 != 0 || var8.field1752 == 1 || var8.field1759) {
                class201 var22;
                if (var8.field1758 == -1 && var8.field1762 == null) {
                    var22 = var8.method2676(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class60(arg3, 22, arg4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
                }
                arg6.method3666(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field1752 == 1 && arg7 != null) {
                    arg7.method2877(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class201 var48;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var48 = var8.method2676(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class60(arg3, 10, arg4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            if (var48 != null && arg6.method3548(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field1765) {
                int var49 = 15;
                if (var48 instanceof class207) {
                    var49 = ((class207) var48).method3774() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field3114[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field3114[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field1752 != 0 && arg7 != null) {
                arg7.method2883(arg1, arg2, var9, var10, var8.field1779);
            }
        } else if (arg5 >= 12) {
            class201 var23;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var23 = var8.method2676(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class60(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3548(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1915[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field1752 != 0 && arg7 != null) {
                arg7.method2883(arg1, arg2, var9, var10, var8.field1779);
            }
        } else if (arg5 == 0) {
            class201 var24;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var24 = var8.method2676(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class60(arg3, 0, arg4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3546(arg0, arg1, arg2, var16, var24, (class201) null, field908[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field1765) {
                    Statics.field3114[arg0][arg1][arg2] = 50;
                    Statics.field3114[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field1757) {
                    Statics.field1915[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field1765) {
                    Statics.field3114[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3114[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1757) {
                    Statics.field1915[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field1765) {
                    Statics.field3114[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3114[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1757) {
                    Statics.field1915[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field1765) {
                    Statics.field3114[arg0][arg1][arg2] = 50;
                    Statics.field3114[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field1757) {
                    Statics.field1915[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field1752 != 0 && arg7 != null) {
                arg7.method2852(arg1, arg2, arg5, arg4, var8.field1779);
            }
            if (var8.field1745 != 16) {
                arg6.method3554(arg0, arg1, arg2, var8.field1745);
            }
        } else if (arg5 == 1) {
            class201 var25;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var25 = var8.method2676(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class60(arg3, 1, arg4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3546(arg0, arg1, arg2, var16, var25, (class201) null, field909[arg4], 0, var19, var21);
            if (var8.field1765) {
                if (arg4 == 0) {
                    Statics.field3114[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3114[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3114[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3114[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1752 != 0 && arg7 != null) {
                arg7.method2852(arg1, arg2, arg5, arg4, var8.field1779);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class201 var27;
            class201 var28;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var27 = var8.method2676(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method2676(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class60(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
                var28 = new class60(arg3, 2, var26, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3546(arg0, arg1, arg2, var16, var27, var28, field908[arg4], field908[var26], var19, var21);
            if (var8.field1757) {
                if (arg4 == 0) {
                    Statics.field1915[arg0][arg1][arg2] |= 0x249;
                    Statics.field1915[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1915[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1915[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1915[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1915[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1915[arg0][arg1][arg2] |= 0x492;
                    Statics.field1915[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field1752 != 0 && arg7 != null) {
                arg7.method2852(arg1, arg2, arg5, arg4, var8.field1779);
            }
            if (var8.field1745 != 16) {
                arg6.method3554(arg0, arg1, arg2, var8.field1745);
            }
        } else if (arg5 == 3) {
            class201 var29;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var29 = var8.method2676(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class60(arg3, 3, arg4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3546(arg0, arg1, arg2, var16, var29, (class201) null, field909[arg4], 0, var19, var21);
            if (var8.field1765) {
                if (arg4 == 0) {
                    Statics.field3114[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3114[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3114[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3114[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1752 != 0 && arg7 != null) {
                arg7.method2852(arg1, arg2, arg5, arg4, var8.field1779);
            }
        } else if (arg5 == 9) {
            class201 var30;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var30 = var8.method2676(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class60(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3548(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field1752 != 0 && arg7 != null) {
                arg7.method2883(arg1, arg2, var9, var10, var8.field1779);
            }
            if (var8.field1745 != 16) {
                arg6.method3554(arg0, arg1, arg2, var8.field1745);
            }
        } else if (arg5 == 4) {
            class201 var31;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var31 = var8.method2676(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class60(arg3, 4, arg4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3547(arg0, arg1, arg2, var16, var31, (class201) null, field908[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3564(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class156.method2267(class208.method1867(var33)).field1745;
            }
            class201 var35;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var35 = var8.method2676(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class60(arg3, 4, arg4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3547(arg0, arg1, arg2, var16, var35, (class201) null, field908[arg4], 0, field906[arg4] * var32, field913[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3564(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class156.method2267(class208.method1867(var37)).field1745 / 2;
            }
            class201 var39;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var39 = var8.method2676(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class60(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3547(arg0, arg1, arg2, var16, var39, (class201) null, 256, arg4, field904[arg4] * var36, field915[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class201 var41;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var41 = var8.method2676(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class60(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3547(arg0, arg1, arg2, var16, var41, (class201) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3564(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class156.method2267(class208.method1867(var43)).field1745 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class201 var46;
            class201 var47;
            if (var8.field1758 == -1 && var8.field1762 == null) {
                var46 = var8.method2676(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method2676(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class60(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
                var47 = new class60(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field1758, var8.field1734, (class201) null);
            }
            arg6.method3547(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field904[arg4] * var42, field915[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("hi.f(IIII)I")
    public static final int method3960(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method4579(var3, var5);
        int var8 = method4579(var3 + 1, var5);
        int var9 = method4579(var3, var5 + 1);
        int var10 = method4579(var3 + 1, var5 + 1);
        int var11 = Statics.method826(var7, var8, var4, arg2);
        int var12 = Statics.method826(var9, var10, var4, arg2);
        return Statics.method826(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ju.x(III)I")
    public static final int method4579(int arg0, int arg1) {
        int var2 = method2606(arg0 - 1, arg1 - 1) + method2606(arg0 + 1, arg1 - 1) + method2606(arg0 - 1, arg1 + 1) + method2606(arg0 + 1, arg1 + 1);
        int var3 = method2606(arg0 - 1, arg1) + method2606(arg0 + 1, arg1) + method2606(arg0, arg1 - 1) + method2606(arg0, arg1 + 1);
        int var4 = method2606(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ez.r(III)I")
    public static final int method2606(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bt.p(III)I")
    public static final int method1563(int arg0, int arg1) {
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

    @ObfuscatedName("aw.h(III)I")
    public static final int method1549(int arg0, int arg1) {
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

    @ObfuscatedName("bm.k(IIII)I")
    public static final int method1678(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dl.a(III)Z")
    public static final boolean method2278(int arg0, int arg1) {
        class156 var2 = class156.method2267(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method2674(arg1);
    }

    @ObfuscatedName("h.q(IIIIIIILgw;Lfy;I)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class200 arg7, class160 arg8) {
        class156 var9 = class156.method2267(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field1751;
            var11 = var9.field1750;
        } else {
            var10 = var9.field1750;
            var11 = var9.field1751;
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
        int[][] var16 = field911[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class208.method3213(arg2, arg3, 2, var9.field1754 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field1775 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class201 var23;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var23 = var9.method2687(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class60(arg4, 22, arg5, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3666(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field1752 == 1) {
                arg8.method2877(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class201 var49;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var49 = var9.method2687(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class60(arg4, 10, arg5, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            if (var49 != null) {
                arg7.method3548(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field1752 != 0) {
                arg8.method2883(arg2, arg3, var10, var11, var9.field1779);
            }
        } else if (arg6 >= 12) {
            class201 var24;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var24 = var9.method2687(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class60(arg4, arg6, arg5, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3548(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field1752 != 0) {
                arg8.method2883(arg2, arg3, var10, var11, var9.field1779);
            }
        } else if (arg6 == 0) {
            class201 var25;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var25 = var9.method2687(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class60(arg4, 0, arg5, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3546(arg0, arg2, arg3, var17, var25, (class201) null, field908[arg5], 0, var20, var22);
            if (var9.field1752 != 0) {
                arg8.method2852(arg2, arg3, arg6, arg5, var9.field1779);
            }
        } else if (arg6 == 1) {
            class201 var26;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var26 = var9.method2687(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class60(arg4, 1, arg5, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3546(arg0, arg2, arg3, var17, var26, (class201) null, field909[arg5], 0, var20, var22);
            if (var9.field1752 != 0) {
                arg8.method2852(arg2, arg3, arg6, arg5, var9.field1779);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class201 var28;
            class201 var29;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var28 = var9.method2687(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method2687(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class60(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
                var29 = new class60(arg4, 2, var27, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3546(arg0, arg2, arg3, var17, var28, var29, field908[arg5], field908[var27], var20, var22);
            if (var9.field1752 != 0) {
                arg8.method2852(arg2, arg3, arg6, arg5, var9.field1779);
            }
        } else if (arg6 == 3) {
            class201 var30;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var30 = var9.method2687(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class60(arg4, 3, arg5, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3546(arg0, arg2, arg3, var17, var30, (class201) null, field909[arg5], 0, var20, var22);
            if (var9.field1752 != 0) {
                arg8.method2852(arg2, arg3, arg6, arg5, var9.field1779);
            }
        } else if (arg6 == 9) {
            class201 var31;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var31 = var9.method2687(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class60(arg4, arg6, arg5, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3548(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field1752 != 0) {
                arg8.method2883(arg2, arg3, var10, var11, var9.field1779);
            }
        } else if (arg6 == 4) {
            class201 var32;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var32 = var9.method2687(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class60(arg4, 4, arg5, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3547(arg0, arg2, arg3, var17, var32, (class201) null, field908[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method3564(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class156.method2267(class208.method1867(var34)).field1745;
            }
            class201 var36;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var36 = var9.method2687(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class60(arg4, 4, arg5, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3547(arg0, arg2, arg3, var17, var36, (class201) null, field908[arg5], 0, field906[arg5] * var33, field913[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method3564(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class156.method2267(class208.method1867(var38)).field1745 / 2;
            }
            class201 var40;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var40 = var9.method2687(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class60(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3547(arg0, arg2, arg3, var17, var40, (class201) null, 256, arg5, field904[arg5] * var37, field915[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class201 var42;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var42 = var9.method2687(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class60(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3547(arg0, arg2, arg3, var17, var42, (class201) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method3564(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class156.method2267(class208.method1867(var44)).field1745 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class201 var47;
            class201 var48;
            if (var9.field1758 == -1 && var9.field1762 == null) {
                var47 = var9.method2687(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method2687(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class60(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
                var48 = new class60(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field1758, var9.field1734, (class201) null);
            }
            arg7.method3547(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field904[arg5] * var43, field915[arg5] * var43, var20, var22);
        }
    }
}
