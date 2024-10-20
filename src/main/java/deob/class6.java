package deob;

@ObfuscatedName("l")
public final class class6 {

    @ObfuscatedName("l.g")
    public static int[][][] field86 = new int[4][105][105];

    @ObfuscatedName("l.v")
    public static byte[][][] field84 = new byte[4][104][104];

    @ObfuscatedName("l.z")
    public static int field74 = 99;

    @ObfuscatedName("l.s")
    public static final int[] field80 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("l.d")
    public static final int[] field72 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("l.m")
    public static final int[] field82 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("l.o")
    public static final int[] field83 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("l.b")
    public static final int[] field81 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("l.c")
    public static final int[] field85 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("l.w")
    public static int field88 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("l.u")
    public static int field87 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.v(IIIII)V")
    public static final void method1357(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field77[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field86[0][var5][var4] = field86[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field86[0][var5][var4] = field86[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field86[0][var5][var4] = field86[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field86[0][var5][var4] = field86[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.z([BIIIIIII[Lgi;S)V")
    public static final void method42(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class197[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2955[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class107 var11 = new class107(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method463(var11, arg1, arg2 + class155.method75(var13 & 0x7, var14 & 0x7, arg7), arg3 + class155.method158(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method463(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.h(IIII)V")
    public static final void method462(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field86[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field86[arg0][arg1][arg2 + var5] = field86[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field86[arg0][arg1 + var6][arg2] = field86[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field86[arg0][arg1 - 1][arg2] != 0) {
            field86[arg0][arg1][arg2] = field86[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field86[arg0][arg1][arg2 - 1] != 0) {
            field86[arg0][arg1][arg2] = field86[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field86[arg0][arg1 - 1][arg2 - 1] != 0) {
            field86[arg0][arg1][arg2] = field86[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("s.k(Ldm;IIIIIIB)V")
    public static final void method463(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2139();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2139();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2139();
                }
            }
            return;
        }
        field84[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2139();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field86[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = Statics.method126(var10 + 45365, var11 + 91923, 4) - 128 + (Statics.method126(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (Statics.method126(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field86[arg1][arg2][arg3] = field86[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2139();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field86[0][arg2][arg3] = -var15 * 8;
                } else {
                    field86[arg1][arg2][arg3] = field86[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field75[arg1][arg2][arg3] = arg0.method2140();
                Statics.field76[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1660[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field84[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1825[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bf.l([BIILcm;[Lgi;B)V")
    public static final void method1394(byte[] arg0, int arg1, int arg2, class79 arg3, class197[] arg4) {
        class107 var5 = new class107(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2152();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2152();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2139();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field84[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class197 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2561(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dx.e(IIIIIILcm;Lgi;S)V")
    public static final void method2561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class197 arg7) {
        if (client.field255 && (field84[0][arg1][arg2] & 0x2) == 0) {
            if ((field84[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field84[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field84[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field434 != var8) {
                return;
            }
        }
        if (arg0 < field74) {
            field74 = arg0;
        }
        class36 var9 = class36.method505(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field847;
            var11 = var9.field846;
        } else {
            var10 = var9.field846;
            var11 = var9.field847;
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
        int[][] var16 = field86[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field853 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field871 == 1) {
            var21 += 256;
        }
        if (var9.method670()) {
            class20.method36(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field255 || var9.field853 != 0 || var9.field859 == 1 || var9.field869) {
                class78 var22;
                if (var9.field854 == -1 && var9.field872 == null) {
                    var22 = var9.method643(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var9.field854, true, (class78) null);
                }
                arg6.method1634(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field859 == 1 && arg7 != null) {
                    arg7.method3476(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var45;
            if (var9.field854 == -1 && var9.field872 == null) {
                var45 = var9.method643(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            if (var45 != null && arg6.method1638(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field862) {
                int var46 = 15;
                if (var45 instanceof class98) {
                    var46 = ((class98) var45).method2005() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field77[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field77[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3471(arg1, arg2, var10, var11, var9.field879);
            }
        } else if (arg5 >= 12) {
            class78 var23;
            if (var9.field854 == -1 && var9.field872 == null) {
                var23 = var9.method643(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1638(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1263[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3471(arg1, arg2, var10, var11, var9.field879);
            }
        } else if (arg5 == 0) {
            class78 var24;
            if (var9.field854 == -1 && var9.field872 == null) {
                var24 = var9.method643(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1636(arg0, arg1, arg2, var17, var24, (class78) null, field80[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field862) {
                    Statics.field77[arg0][arg1][arg2] = 50;
                    Statics.field77[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field876) {
                    Statics.field1263[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field862) {
                    Statics.field77[arg0][arg1][arg2 + 1] = 50;
                    Statics.field77[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field876) {
                    Statics.field1263[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field862) {
                    Statics.field77[arg0][arg1 + 1][arg2] = 50;
                    Statics.field77[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field876) {
                    Statics.field1263[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field862) {
                    Statics.field77[arg0][arg1][arg2] = 50;
                    Statics.field77[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field876) {
                    Statics.field1263[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3470(arg1, arg2, arg5, arg4, var9.field879);
            }
            if (var9.field834 != 16) {
                arg6.method1718(arg0, arg1, arg2, var9.field834);
            }
        } else if (arg5 == 1) {
            class78 var25;
            if (var9.field854 == -1 && var9.field872 == null) {
                var25 = var9.method643(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1636(arg0, arg1, arg2, var17, var25, (class78) null, field72[arg4], 0, var20, var21);
            if (var9.field862) {
                if (arg4 == 0) {
                    Statics.field77[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field77[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field77[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field77[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3470(arg1, arg2, arg5, arg4, var9.field879);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class78 var27;
            class78 var28;
            if (var9.field854 == -1 && var9.field872 == null) {
                var27 = var9.method643(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method643(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field854, true, (class78) null);
                var28 = new class11(arg3, 2, var26, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1636(arg0, arg1, arg2, var17, var27, var28, field80[arg4], field80[var26], var20, var21);
            if (var9.field876) {
                if (arg4 == 0) {
                    Statics.field1263[arg0][arg1][arg2] |= 0x249;
                    Statics.field1263[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1263[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1263[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1263[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1263[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1263[arg0][arg1][arg2] |= 0x492;
                    Statics.field1263[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3470(arg1, arg2, arg5, arg4, var9.field879);
            }
            if (var9.field834 != 16) {
                arg6.method1718(arg0, arg1, arg2, var9.field834);
            }
        } else if (arg5 == 3) {
            class78 var29;
            if (var9.field854 == -1 && var9.field872 == null) {
                var29 = var9.method643(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1636(arg0, arg1, arg2, var17, var29, (class78) null, field72[arg4], 0, var20, var21);
            if (var9.field862) {
                if (arg4 == 0) {
                    Statics.field77[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field77[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field77[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field77[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3470(arg1, arg2, arg5, arg4, var9.field879);
            }
        } else if (arg5 == 9) {
            class78 var30;
            if (var9.field854 == -1 && var9.field872 == null) {
                var30 = var9.method643(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1638(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field859 != 0 && arg7 != null) {
                arg7.method3471(arg1, arg2, var10, var11, var9.field879);
            }
            if (var9.field834 != 16) {
                arg6.method1718(arg0, arg1, arg2, var9.field834);
            }
        } else if (arg5 == 4) {
            class78 var31;
            if (var9.field854 == -1 && var9.field872 == null) {
                var31 = var9.method643(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1637(arg0, arg1, arg2, var17, var31, (class78) null, field80[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1654(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class36.method505(var33 >> 14 & 0x7FFF).field834;
            }
            class78 var34;
            if (var9.field854 == -1 && var9.field872 == null) {
                var34 = var9.method643(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1637(arg0, arg1, arg2, var17, var34, (class78) null, field80[arg4], 0, field82[arg4] * var32, field83[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1654(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class36.method505(var36 >> 14 & 0x7FFF).field834 / 2;
            }
            class78 var37;
            if (var9.field854 == -1 && var9.field872 == null) {
                var37 = var9.method643(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1637(arg0, arg1, arg2, var17, var37, (class78) null, 256, arg4, field81[arg4] * var35, field85[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class78 var39;
            if (var9.field854 == -1 && var9.field872 == null) {
                var39 = var9.method643(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1637(arg0, arg1, arg2, var17, var39, (class78) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1654(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class36.method505(var41 >> 14 & 0x7FFF).field834 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class78 var43;
            class78 var44;
            if (var9.field854 == -1 && var9.field872 == null) {
                var43 = var9.method643(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method643(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field854, true, (class78) null);
                var44 = new class11(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field854, true, (class78) null);
            }
            arg6.method1637(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field81[arg4] * var40, field85[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("ac.j(Lcm;[Lgi;I)V")
    public static final void method523(class79 arg0, class197[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field84[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field84[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3473(var3, var4);
                        }
                    }
                }
            }
        }
        field88 += (int) (Math.random() * 5.0D) - 2;
        if (field88 < -8) {
            field88 = -8;
        }
        if (field88 > 8) {
            field88 = 8;
        }
        field87 += (int) (Math.random() * 5.0D) - 2;
        if (field87 < -16) {
            field87 = -16;
        }
        if (field87 > 16) {
            field87 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field77[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field86[var6][var11 + 1][var10] - field86[var6][var11 - 1][var10];
                    int var13 = field86[var6][var11][var10 + 1] - field86[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1258[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field73[var20] = 0;
                Statics.field79[var20] = 0;
                Statics.field1937[var20] = 0;
                Statics.field1850[var20] = 0;
                Statics.field1422[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field1825[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class37 var26 = (class37) class37.field884.method3166((long) var25);
                            class37 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field888.method2708(1, var25);
                                class37 var29 = new class37();
                                if (var28 != null) {
                                    var29.method694(new class107(var28), var25);
                                }
                                var29.method701();
                                class37.field884.method3167(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field73[var22] += var27.field886;
                            Statics.field79[var22] += var27.field887;
                            Statics.field1937[var22] += var27.field885;
                            Statics.field1850[var22] += var27.field890;
                            var10002 = Statics.field1422[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field1825[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class37 var34 = (class37) class37.field884.method3166((long) var33);
                            class37 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field888.method2708(1, var33);
                                class37 var37 = new class37();
                                if (var36 != null) {
                                    var37.method694(new class107(var36), var33);
                                }
                                var37.method701();
                                class37.field884.method3167(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field73[var22] -= var35.field886;
                            Statics.field79[var22] -= var35.field887;
                            Statics.field1937[var22] -= var35.field885;
                            Statics.field1850[var22] -= var35.field890;
                            var10002 = Statics.field1422[var22]--;
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
                            var39 += Statics.field73[var45];
                            var40 += Statics.field79[var45];
                            var41 += Statics.field1937[var45];
                            var42 += Statics.field1850[var45];
                            var43 += Statics.field1422[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field73[var46];
                            var40 -= Statics.field79[var46];
                            var41 -= Statics.field1937[var46];
                            var42 -= Statics.field1850[var46];
                            var43 -= Statics.field1422[var46];
                        }
                        if (var44 >= 1 && var44 < 103) {
                            if (client.field255 && (field84[0][var21][var44] & 0x2) == 0) {
                                if ((field84[var6][var21][var44] & 0x10) != 0) {
                                    continue;
                                }
                                int var47;
                                if ((field84[var6][var21][var44] & 0x8) != 0) {
                                    var47 = 0;
                                } else if (var6 <= 0 || (field84[1][var21][var44] & 0x2) == 0) {
                                    var47 = var6;
                                } else {
                                    var47 = var6 - 1;
                                }
                                if (client.field434 != var47) {
                                    continue;
                                }
                            }
                            if (var6 < field74) {
                                field74 = var6;
                            }
                            int var48 = Statics.field1825[var6][var21][var44] & 0xFF;
                            int var49 = Statics.field75[var6][var21][var44] & 0xFF;
                            if (var48 > 0 || var49 > 0) {
                                int var50 = field86[var6][var21][var44];
                                int var51 = field86[var6][var21 + 1][var44];
                                int var52 = field86[var6][var21 + 1][var44 + 1];
                                int var53 = field86[var6][var21][var44 + 1];
                                int var54 = Statics.field1258[var21][var44];
                                int var55 = Statics.field1258[var21 + 1][var44];
                                int var56 = Statics.field1258[var21 + 1][var44 + 1];
                                int var57 = Statics.field1258[var21][var44 + 1];
                                int var58 = -1;
                                int var59 = -1;
                                if (var48 > 0) {
                                    int var60 = var39 * 256 / var42;
                                    int var61 = var40 / var43;
                                    int var62 = var41 / var43;
                                    var58 = Statics.method926(var60, var61, var62);
                                    int var63 = field88 + var60 & 0xFF;
                                    int var64 = field87 + var62;
                                    if (var64 < 0) {
                                        var64 = 0;
                                    } else if (var64 > 255) {
                                        var64 = 255;
                                    }
                                    var59 = Statics.method926(var63, var61, var64);
                                }
                                if (var6 > 0) {
                                    boolean var65 = true;
                                    if (var48 == 0 && Statics.field76[var6][var21][var44] != 0) {
                                        var65 = false;
                                    }
                                    if (var49 > 0) {
                                        int var66 = var49 - 1;
                                        class41 var67 = (class41) class41.field953.method3166((long) var66);
                                        class41 var68;
                                        if (var67 == null) {
                                            byte[] var69 = Statics.field966.method2708(4, var66);
                                            class41 var70 = new class41();
                                            if (var69 != null) {
                                                var70.method806(new class107(var69), var66);
                                            }
                                            var70.method805();
                                            class41.field953.method3167(var70, (long) var66);
                                            var68 = var70;
                                        } else {
                                            var68 = var67;
                                        }
                                        if (!var68.field956) {
                                            var65 = false;
                                        }
                                    }
                                    if (var65 && var50 == var51 && var50 == var52 && var50 == var53) {
                                        Statics.field1263[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var71 = 0;
                                if (var59 != -1) {
                                    var71 = class84.field1478[method1802(var59, 96)];
                                }
                                if (var49 == 0) {
                                    arg0.method1633(var6, var21, var44, 0, 0, -1, var50, var51, var52, var53, method1802(var58, var54), method1802(var58, var55), method1802(var58, var56), method1802(var58, var57), 0, 0, 0, 0, var71, 0);
                                } else {
                                    int var72 = Statics.field76[var6][var21][var44] + 1;
                                    byte var73 = Statics.field1660[var6][var21][var44];
                                    int var74 = var49 - 1;
                                    class41 var75 = (class41) class41.field953.method3166((long) var74);
                                    class41 var76;
                                    if (var75 == null) {
                                        byte[] var77 = Statics.field966.method2708(4, var74);
                                        class41 var78 = new class41();
                                        if (var77 != null) {
                                            var78.method806(new class107(var77), var74);
                                        }
                                        var78.method805();
                                        class41.field953.method3167(var78, (long) var74);
                                        var76 = var78;
                                    } else {
                                        var76 = var75;
                                    }
                                    int var80 = var76.field955;
                                    int var81;
                                    int var82;
                                    if (var80 >= 0) {
                                        var81 = Statics.field1462.method1864(var80);
                                        var82 = -1;
                                    } else if (var76.field954 == 16711935) {
                                        var82 = -2;
                                        var80 = -1;
                                        var81 = -2;
                                    } else {
                                        var82 = Statics.method926(var76.field958, var76.field959, var76.field960);
                                        int var83 = field88 + var76.field958 & 0xFF;
                                        int var84 = field87 + var76.field960;
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        var81 = Statics.method926(var83, var76.field959, var84);
                                    }
                                    int var85 = 0;
                                    if (var81 != -2) {
                                        var85 = class84.field1478[method2802(var81, 96)];
                                    }
                                    if (var76.field952 != -1) {
                                        int var86 = field88 + var76.field961 & 0xFF;
                                        int var87 = field87 + var76.field963;
                                        if (var87 < 0) {
                                            var87 = 0;
                                        } else if (var87 > 255) {
                                            var87 = 255;
                                        }
                                        int var88 = Statics.method926(var86, var76.field965, var87);
                                        var85 = class84.field1478[method2802(var88, 96)];
                                    }
                                    arg0.method1633(var6, var21, var44, var72, var73, var80, var50, var51, var52, var53, method1802(var58, var54), method1802(var58, var55), method1802(var58, var56), method1802(var58, var57), method2802(var82, var54), method2802(var82, var55), method2802(var82, var56), method2802(var82, var57), var71, var85);
                                }
                            }
                        }
                    }
                }
            }
            for (int var89 = 1; var89 < 103; var89++) {
                for (int var90 = 1; var90 < 103; var90++) {
                    int var95;
                    if ((field84[var6][var90][var89] & 0x8) != 0) {
                        var95 = 0;
                    } else if (var6 <= 0 || (field84[1][var90][var89] & 0x2) == 0) {
                        var95 = var6;
                    } else {
                        var95 = var6 - 1;
                    }
                    arg0.method1689(var6, var90, var89, var95);
                }
            }
            Statics.field1825[var6] = (byte[][]) null;
            Statics.field75[var6] = (byte[][]) null;
            Statics.field76[var6] = (byte[][]) null;
            Statics.field1660[var6] = (byte[][]) null;
            Statics.field77[var6] = (byte[][]) null;
        }
        arg0.method1713(-50, -10, -50);
        for (int var96 = 0; var96 < 104; var96++) {
            for (int var97 = 0; var97 < 104; var97++) {
                if ((field84[1][var96][var97] & 0x2) == 2) {
                    arg0.method1630(var96, var97);
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
                        if ((Statics.field1263[var102][var104][var103] & var98) != 0) {
                            int var105 = var103;
                            int var106 = var103;
                            int var107 = var102;
                            int var108 = var102;
                            while (var105 > 0 && (Statics.field1263[var102][var104][var105 - 1] & var98) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field1263[var102][var104][var106 + 1] & var98) != 0) {
                                var106++;
                            }
                            label387: while (var107 > 0) {
                                for (int var109 = var105; var109 <= var106; var109++) {
                                    if ((Statics.field1263[var107 - 1][var104][var109] & var98) == 0) {
                                        break label387;
                                    }
                                }
                                var107--;
                            }
                            label376: while (var108 < var101) {
                                for (int var110 = var105; var110 <= var106; var110++) {
                                    if ((Statics.field1263[var108 + 1][var104][var110] & var98) == 0) {
                                        break label376;
                                    }
                                }
                                var108++;
                            }
                            int var111 = (var108 + 1 - var107) * (var106 - var105 + 1);
                            if (var111 >= 8) {
                                short var112 = 240;
                                int var113 = field86[var108][var104][var105] - var112;
                                int var114 = field86[var107][var104][var105];
                                class79.method1631(var101, 1, var104 * 128, var104 * 128, var105 * 128, var106 * 128 + 128, var113, var114);
                                for (int var115 = var107; var115 <= var108; var115++) {
                                    for (int var116 = var105; var116 <= var106; var116++) {
                                        Statics.field1263[var115][var104][var116] &= ~var98;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1263[var102][var104][var103] & var99) != 0) {
                            int var117 = var104;
                            int var118 = var104;
                            int var119 = var102;
                            int var120 = var102;
                            while (var117 > 0 && (Statics.field1263[var102][var117 - 1][var103] & var99) != 0) {
                                var117--;
                            }
                            while (var118 < 104 && (Statics.field1263[var102][var118 + 1][var103] & var99) != 0) {
                                var118++;
                            }
                            label440: while (var119 > 0) {
                                for (int var121 = var117; var121 <= var118; var121++) {
                                    if ((Statics.field1263[var119 - 1][var121][var103] & var99) == 0) {
                                        break label440;
                                    }
                                }
                                var119--;
                            }
                            label429: while (var120 < var101) {
                                for (int var122 = var117; var122 <= var118; var122++) {
                                    if ((Statics.field1263[var120 + 1][var122][var103] & var99) == 0) {
                                        break label429;
                                    }
                                }
                                var120++;
                            }
                            int var123 = (var120 + 1 - var119) * (var118 - var117 + 1);
                            if (var123 >= 8) {
                                short var124 = 240;
                                int var125 = field86[var120][var117][var103] - var124;
                                int var126 = field86[var119][var117][var103];
                                class79.method1631(var101, 2, var117 * 128, var118 * 128 + 128, var103 * 128, var103 * 128, var125, var126);
                                for (int var127 = var119; var127 <= var120; var127++) {
                                    for (int var128 = var117; var128 <= var118; var128++) {
                                        Statics.field1263[var127][var128][var103] &= ~var99;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1263[var102][var104][var103] & var100) != 0) {
                            int var129 = var104;
                            int var130 = var104;
                            int var131 = var103;
                            int var132 = var103;
                            while (var131 > 0 && (Statics.field1263[var102][var104][var131 - 1] & var100) != 0) {
                                var131--;
                            }
                            while (var132 < 104 && (Statics.field1263[var102][var104][var132 + 1] & var100) != 0) {
                                var132++;
                            }
                            label493: while (var129 > 0) {
                                for (int var133 = var131; var133 <= var132; var133++) {
                                    if ((Statics.field1263[var102][var129 - 1][var133] & var100) == 0) {
                                        break label493;
                                    }
                                }
                                var129--;
                            }
                            label482: while (var130 < 104) {
                                for (int var134 = var131; var134 <= var132; var134++) {
                                    if ((Statics.field1263[var102][var130 + 1][var134] & var100) == 0) {
                                        break label482;
                                    }
                                }
                                var130++;
                            }
                            if ((var130 - var129 + 1) * (var132 - var131 + 1) >= 4) {
                                int var135 = field86[var102][var129][var131];
                                class79.method1631(var101, 4, var129 * 128, var130 * 128 + 128, var131 * 128, var132 * 128 + 128, var135, var135);
                                for (int var136 = var129; var136 <= var130; var136++) {
                                    for (int var137 = var131; var137 <= var132; var137++) {
                                        Statics.field1263[var102][var136][var137] &= ~var100;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cz.f(IIIII)I")
    public static final int method1892(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1476[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("er.a(IIS)I")
    public static final int method2666(int arg0, int arg1) {
        int var2 = method86(arg0 - 1, arg1 - 1) + method86(arg0 + 1, arg1 - 1) + method86(arg0 - 1, arg1 + 1) + method86(arg0 + 1, arg1 + 1);
        int var3 = method86(arg0 - 1, arg1) + method86(arg0 + 1, arg1) + method86(arg0, arg1 - 1) + method86(arg0, arg1 + 1);
        int var4 = method86(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("e.i(IIB)I")
    public static final int method86(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("co.y(III)I")
    public static final int method1802(int arg0, int arg1) {
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

    @ObfuscatedName("eo.p(III)I")
    public static final int method2802(int arg0, int arg1) {
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
}
