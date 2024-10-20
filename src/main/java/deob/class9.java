package deob;

@ObfuscatedName("n")
public final class class9 {

    @ObfuscatedName("n.a")
    public static int[][][] field127 = new int[4][105][105];

    @ObfuscatedName("n.r")
    public static byte[][][] field112 = new byte[4][104][104];

    @ObfuscatedName("n.u")
    public static int field115 = 99;

    @ObfuscatedName("n.m")
    public static final int[] field117 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("n.z")
    public static final int[] field118 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("n.h")
    public static final int[] field124 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("n.f")
    public static final int[] field111 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("n.w")
    public static final int[] field121 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("n.l")
    public static final int[] field113 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("n.d")
    public static int field123 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("n.y")
    public static int field126 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.a(I)V")
    public static void method1319() {
        field115 = 99;
        Statics.field114 = new byte[4][104][104];
        Statics.field1164 = new byte[4][104][104];
        Statics.field2438 = new byte[4][104][104];
        Statics.field122 = new byte[4][104][104];
        Statics.field1166 = new int[4][105][105];
        Statics.field1020 = new byte[4][105][105];
        Statics.field1015 = new int[105][105];
        Statics.field116 = new int[104];
        Statics.field1259 = new int[104];
        Statics.field1726 = new int[104];
        Statics.field2710 = new int[104];
        Statics.field1333 = new int[104];
    }

    @ObfuscatedName("o.r(IIIII)V")
    public static final void method114(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1020[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field127[0][var5][var4] = field127[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field127[0][var5][var4] = field127[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field127[0][var5][var4] = field127[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field127[0][var5][var4] = field127[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.u([BIIII[Lfi;B)V")
    public static final void method508(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class164[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2746[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class126 var9 = new class126(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method822(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("aa.t([BIIIIIII[Lfi;I)V")
    public static final void method748(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2746[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class126 var11 = new class126(arg0);
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
                        method822(var11, arg1, arg2 + var22, arg3 + class160.method2252(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method822(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.k(Ldf;IIIIIII)V")
    public static final void method822(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2481();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2481();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2481();
                }
            }
            return;
        }
        field112[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2481();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field127[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method188(var10 + 45365, var11 + 91923, 4) - 128 + (method188(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method188(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field127[arg1][arg2][arg3] = field127[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2481();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field127[0][arg2][arg3] = -var15 * 8;
                } else {
                    field127[arg1][arg2][arg3] = field127[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1164[arg1][arg2][arg3] = arg0.method2379();
                Statics.field2438[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field122[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field112[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field114[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("au.x([BIILch;[Lfi;B)V")
    public static final void method528(byte[] arg0, int arg1, int arg2, class95 arg3, class164[] arg4) {
        class126 var5 = new class126(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2391();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2391();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2481();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field112[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class164 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2311(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dn.v(IIIIIILch;Lfi;I)V")
    public static final void method2311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field597 && (field112[0][arg1][arg2] & 0x2) == 0) {
            if ((field112[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field112[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field112[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field574 != var8) {
                return;
            }
        }
        if (arg0 < field115) {
            field115 = arg0;
        }
        class32 var9 = class32.method582(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field807;
            var11 = var9.field809;
        } else {
            var10 = var9.field809;
            var11 = var9.field807;
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
        int[][] var16 = field127[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field813 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field835 == 1) {
            var21 += 256;
        }
        if (var9.method633()) {
            class7.method102(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field597 || var9.field813 != 0 || var9.field811 == 1 || var9.field805) {
                class94 var22;
                if (var9.field833 == -1 && var9.field828 == null) {
                    var22 = var9.method589(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
                }
                arg6.method1809(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field811 == 1 && arg7 != null) {
                    arg7.method3161(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var45;
            if (var9.field833 == -1 && var9.field828 == null) {
                var45 = var9.method589(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            if (var45 != null && arg6.method1835(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field825) {
                int var46 = 15;
                if (var45 instanceof class112) {
                    var46 = ((class112) var45).method2222() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field1020[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field1020[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field811 != 0 && arg7 != null) {
                arg7.method3175(arg1, arg2, var10, var11, var9.field806);
            }
        } else if (arg5 >= 12) {
            class94 var23;
            if (var9.field833 == -1 && var9.field828 == null) {
                var23 = var9.method589(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1835(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1166[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field811 != 0 && arg7 != null) {
                arg7.method3175(arg1, arg2, var10, var11, var9.field806);
            }
        } else if (arg5 == 0) {
            class94 var24;
            if (var9.field833 == -1 && var9.field828 == null) {
                var24 = var9.method589(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1811(arg0, arg1, arg2, var17, var24, (class94) null, field117[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field825) {
                    Statics.field1020[arg0][arg1][arg2] = 50;
                    Statics.field1020[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field816) {
                    Statics.field1166[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field825) {
                    Statics.field1020[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1020[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field816) {
                    Statics.field1166[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field825) {
                    Statics.field1020[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1020[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field816) {
                    Statics.field1166[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field825) {
                    Statics.field1020[arg0][arg1][arg2] = 50;
                    Statics.field1020[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field816) {
                    Statics.field1166[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field811 != 0 && arg7 != null) {
                arg7.method3158(arg1, arg2, arg5, arg4, var9.field806);
            }
            if (var9.field818 != 16) {
                arg6.method1819(arg0, arg1, arg2, var9.field818);
            }
        } else if (arg5 == 1) {
            class94 var25;
            if (var9.field833 == -1 && var9.field828 == null) {
                var25 = var9.method589(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1811(arg0, arg1, arg2, var17, var25, (class94) null, field118[arg4], 0, var20, var21);
            if (var9.field825) {
                if (arg4 == 0) {
                    Statics.field1020[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1020[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1020[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1020[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field811 != 0 && arg7 != null) {
                arg7.method3158(arg1, arg2, arg5, arg4, var9.field806);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field833 == -1 && var9.field828 == null) {
                var27 = var9.method589(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method589(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
                var28 = new class14(arg3, 2, var26, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1811(arg0, arg1, arg2, var17, var27, var28, field117[arg4], field117[var26], var20, var21);
            if (var9.field816) {
                if (arg4 == 0) {
                    Statics.field1166[arg0][arg1][arg2] |= 0x249;
                    Statics.field1166[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1166[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1166[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1166[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1166[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1166[arg0][arg1][arg2] |= 0x492;
                    Statics.field1166[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field811 != 0 && arg7 != null) {
                arg7.method3158(arg1, arg2, arg5, arg4, var9.field806);
            }
            if (var9.field818 != 16) {
                arg6.method1819(arg0, arg1, arg2, var9.field818);
            }
        } else if (arg5 == 3) {
            class94 var29;
            if (var9.field833 == -1 && var9.field828 == null) {
                var29 = var9.method589(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1811(arg0, arg1, arg2, var17, var29, (class94) null, field118[arg4], 0, var20, var21);
            if (var9.field825) {
                if (arg4 == 0) {
                    Statics.field1020[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1020[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1020[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1020[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field811 != 0 && arg7 != null) {
                arg7.method3158(arg1, arg2, arg5, arg4, var9.field806);
            }
        } else if (arg5 == 9) {
            class94 var30;
            if (var9.field833 == -1 && var9.field828 == null) {
                var30 = var9.method589(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1835(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field811 != 0 && arg7 != null) {
                arg7.method3175(arg1, arg2, var10, var11, var9.field806);
            }
            if (var9.field818 != 16) {
                arg6.method1819(arg0, arg1, arg2, var9.field818);
            }
        } else if (arg5 == 4) {
            class94 var31;
            if (var9.field833 == -1 && var9.field828 == null) {
                var31 = var9.method589(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1812(arg0, arg1, arg2, var17, var31, (class94) null, field117[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1829(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class32.method582(var33 >> 14 & 0x7FFF).field818;
            }
            class94 var34;
            if (var9.field833 == -1 && var9.field828 == null) {
                var34 = var9.method589(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1812(arg0, arg1, arg2, var17, var34, (class94) null, field117[arg4], 0, field124[arg4] * var32, field111[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1829(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method582(var36 >> 14 & 0x7FFF).field818 / 2;
            }
            class94 var37;
            if (var9.field833 == -1 && var9.field828 == null) {
                var37 = var9.method589(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1812(arg0, arg1, arg2, var17, var37, (class94) null, 256, arg4, field121[arg4] * var35, field113[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class94 var39;
            if (var9.field833 == -1 && var9.field828 == null) {
                var39 = var9.method589(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1812(arg0, arg1, arg2, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1829(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class32.method582(var41 >> 14 & 0x7FFF).field818 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field833 == -1 && var9.field828 == null) {
                var43 = var9.method589(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method589(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
                var44 = new class14(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field833, true, (class94) null);
            }
            arg6.method1812(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field121[arg4] * var40, field113[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("client.g(Lch;[Lfi;I)V")
    public static final void method505(class95 arg0, class164[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field112[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field112[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3160(var3, var4);
                        }
                    }
                }
            }
        }
        field123 += (int) (Math.random() * 5.0D) - 2;
        if (field123 < -8) {
            field123 = -8;
        }
        if (field123 > 8) {
            field123 = 8;
        }
        field126 += (int) (Math.random() * 5.0D) - 2;
        if (field126 < -16) {
            field126 = -16;
        }
        if (field126 > 16) {
            field126 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1020[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field127[var6][var11 + 1][var10] - field127[var6][var11 - 1][var10];
                    int var13 = field127[var6][var11][var10 + 1] - field127[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1015[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field116[var20] = 0;
                Statics.field1259[var20] = 0;
                Statics.field1726[var20] = 0;
                Statics.field2710[var20] = 0;
                Statics.field1333[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field114[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class33 var26 = (class33) class33.field846.method3208((long) var25);
                            class33 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field854.method2943(1, var25);
                                class33 var29 = new class33();
                                if (var28 != null) {
                                    var29.method637(new class126(var28), var25);
                                }
                                var29.method636();
                                class33.field846.method3210(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field116[var22] += var27.field849;
                            Statics.field1259[var22] += var27.field847;
                            Statics.field1726[var22] += var27.field851;
                            Statics.field2710[var22] += var27.field852;
                            var10002 = Statics.field1333[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field114[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class33 var34 = (class33) class33.field846.method3208((long) var33);
                            class33 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field854.method2943(1, var33);
                                class33 var37 = new class33();
                                if (var36 != null) {
                                    var37.method637(new class126(var36), var33);
                                }
                                var37.method636();
                                class33.field846.method3210(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field116[var22] -= var35.field849;
                            Statics.field1259[var22] -= var35.field847;
                            Statics.field1726[var22] -= var35.field851;
                            Statics.field2710[var22] -= var35.field852;
                            var10002 = Statics.field1333[var22]--;
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
                            var39 += Statics.field116[var45];
                            var40 += Statics.field1259[var45];
                            var41 += Statics.field1726[var45];
                            var42 += Statics.field2710[var45];
                            var43 += Statics.field1333[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field116[var46];
                            var40 -= Statics.field1259[var46];
                            var41 -= Statics.field1726[var46];
                            var42 -= Statics.field2710[var46];
                            var43 -= Statics.field1333[var46];
                        }
                        if (var44 >= 1 && var44 < 103) {
                            if (client.field597 && (field112[0][var21][var44] & 0x2) == 0) {
                                if ((field112[var6][var21][var44] & 0x10) != 0) {
                                    continue;
                                }
                                int var47;
                                if ((field112[var6][var21][var44] & 0x8) != 0) {
                                    var47 = 0;
                                } else if (var6 <= 0 || (field112[1][var21][var44] & 0x2) == 0) {
                                    var47 = var6;
                                } else {
                                    var47 = var6 - 1;
                                }
                                if (client.field574 != var47) {
                                    continue;
                                }
                            }
                            if (var6 < field115) {
                                field115 = var6;
                            }
                            int var48 = Statics.field114[var6][var21][var44] & 0xFF;
                            int var49 = Statics.field1164[var6][var21][var44] & 0xFF;
                            if (var48 > 0 || var49 > 0) {
                                int var50 = field127[var6][var21][var44];
                                int var51 = field127[var6][var21 + 1][var44];
                                int var52 = field127[var6][var21 + 1][var44 + 1];
                                int var53 = field127[var6][var21][var44 + 1];
                                int var54 = Statics.field1015[var21][var44];
                                int var55 = Statics.field1015[var21 + 1][var44];
                                int var56 = Statics.field1015[var21 + 1][var44 + 1];
                                int var57 = Statics.field1015[var21][var44 + 1];
                                int var58 = -1;
                                int var59 = -1;
                                if (var48 > 0) {
                                    int var60 = var39 * 256 / var42;
                                    int var61 = var40 / var43;
                                    int var62 = var41 / var43;
                                    var58 = method1601(var60, var61, var62);
                                    int var63 = field123 + var60 & 0xFF;
                                    int var64 = field126 + var62;
                                    if (var64 < 0) {
                                        var64 = 0;
                                    } else if (var64 > 255) {
                                        var64 = 255;
                                    }
                                    var59 = method1601(var63, var61, var64);
                                }
                                if (var6 > 0) {
                                    boolean var65 = true;
                                    if (var48 == 0 && Statics.field2438[var6][var21][var44] != 0) {
                                        var65 = false;
                                    }
                                    if (var49 > 0) {
                                        int var66 = var49 - 1;
                                        class37 var67 = (class37) class37.field919.method3208((long) var66);
                                        class37 var68;
                                        if (var67 == null) {
                                            byte[] var69 = Statics.field921.method2943(4, var66);
                                            class37 var70 = new class37();
                                            if (var69 != null) {
                                                var70.method728(new class126(var69), var66);
                                            }
                                            var70.method727();
                                            class37.field919.method3210(var70, (long) var66);
                                            var68 = var70;
                                        } else {
                                            var68 = var67;
                                        }
                                        if (!var68.field922) {
                                            var65 = false;
                                        }
                                    }
                                    if (var65 && var50 == var51 && var50 == var52 && var50 == var53) {
                                        Statics.field1166[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var71 = 0;
                                if (var59 != -1) {
                                    var71 = class104.field1746[method199(var59, 96)];
                                }
                                if (var49 == 0) {
                                    arg0.method1942(var6, var21, var44, 0, 0, -1, var50, var51, var52, var53, method199(var58, var54), method199(var58, var55), method199(var58, var56), method199(var58, var57), 0, 0, 0, 0, var71, 0);
                                } else {
                                    int var72 = Statics.field2438[var6][var21][var44] + 1;
                                    byte var73 = Statics.field122[var6][var21][var44];
                                    class37 var74 = class37.method619(var49 - 1);
                                    int var75 = var74.field925;
                                    int var76;
                                    int var77;
                                    if (var75 >= 0) {
                                        var76 = Statics.field1750.method2139(var75);
                                        var77 = -1;
                                    } else if (var74.field920 == 16711935) {
                                        var77 = -2;
                                        var75 = -1;
                                        var76 = -2;
                                    } else {
                                        var77 = method1601(var74.field924, var74.field918, var74.field926);
                                        int var78 = field123 + var74.field924 & 0xFF;
                                        int var79 = field126 + var74.field926;
                                        if (var79 < 0) {
                                            var79 = 0;
                                        } else if (var79 > 255) {
                                            var79 = 255;
                                        }
                                        var76 = method1601(var78, var74.field918, var79);
                                    }
                                    int var80 = 0;
                                    if (var76 != -2) {
                                        var80 = class104.field1746[method652(var76, 96)];
                                    }
                                    if (var74.field928 != -1) {
                                        int var81 = field123 + var74.field927 & 0xFF;
                                        int var82 = field126 + var74.field929;
                                        if (var82 < 0) {
                                            var82 = 0;
                                        } else if (var82 > 255) {
                                            var82 = 255;
                                        }
                                        int var83 = method1601(var81, var74.field933, var82);
                                        var80 = class104.field1746[method652(var83, 96)];
                                    }
                                    arg0.method1942(var6, var21, var44, var72, var73, var75, var50, var51, var52, var53, method199(var58, var54), method199(var58, var55), method199(var58, var56), method199(var58, var57), method652(var77, var54), method652(var77, var55), method652(var77, var56), method652(var77, var57), var71, var80);
                                }
                            }
                        }
                    }
                }
            }
            for (int var84 = 1; var84 < 103; var84++) {
                for (int var85 = 1; var85 < 103; var85++) {
                    int var90;
                    if ((field112[var6][var85][var84] & 0x8) != 0) {
                        var90 = 0;
                    } else if (var6 <= 0 || (field112[1][var85][var84] & 0x2) == 0) {
                        var90 = var6;
                    } else {
                        var90 = var6 - 1;
                    }
                    arg0.method1807(var6, var85, var84, var90);
                }
            }
            Statics.field114[var6] = (byte[][]) null;
            Statics.field1164[var6] = (byte[][]) null;
            Statics.field2438[var6] = (byte[][]) null;
            Statics.field122[var6] = (byte[][]) null;
            Statics.field1020[var6] = (byte[][]) null;
        }
        arg0.method1834(-50, -10, -50);
        for (int var91 = 0; var91 < 104; var91++) {
            for (int var92 = 0; var92 < 104; var92++) {
                if ((field112[1][var91][var92] & 0x2) == 2) {
                    arg0.method1805(var91, var92);
                }
            }
        }
        int var93 = 1;
        int var94 = 2;
        int var95 = 4;
        for (int var96 = 0; var96 < 4; var96++) {
            if (var96 > 0) {
                var93 <<= 0x3;
                var94 <<= 0x3;
                var95 <<= 0x3;
            }
            for (int var97 = 0; var97 <= var96; var97++) {
                for (int var98 = 0; var98 <= 104; var98++) {
                    for (int var99 = 0; var99 <= 104; var99++) {
                        if ((Statics.field1166[var97][var99][var98] & var93) != 0) {
                            int var100 = var98;
                            int var101 = var98;
                            int var102 = var97;
                            int var103 = var97;
                            while (var100 > 0 && (Statics.field1166[var97][var99][var100 - 1] & var93) != 0) {
                                var100--;
                            }
                            while (var101 < 104 && (Statics.field1166[var97][var99][var101 + 1] & var93) != 0) {
                                var101++;
                            }
                            label378: while (var102 > 0) {
                                for (int var104 = var100; var104 <= var101; var104++) {
                                    if ((Statics.field1166[var102 - 1][var99][var104] & var93) == 0) {
                                        break label378;
                                    }
                                }
                                var102--;
                            }
                            label367: while (var103 < var96) {
                                for (int var105 = var100; var105 <= var101; var105++) {
                                    if ((Statics.field1166[var103 + 1][var99][var105] & var93) == 0) {
                                        break label367;
                                    }
                                }
                                var103++;
                            }
                            int var106 = (var103 + 1 - var102) * (var101 - var100 + 1);
                            if (var106 >= 8) {
                                short var107 = 240;
                                int var108 = field127[var103][var99][var100] - var107;
                                int var109 = field127[var102][var99][var100];
                                class95.method1893(var96, 1, var99 * 128, var99 * 128, var100 * 128, var101 * 128 + 128, var108, var109);
                                for (int var110 = var102; var110 <= var103; var110++) {
                                    for (int var111 = var100; var111 <= var101; var111++) {
                                        Statics.field1166[var110][var99][var111] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1166[var97][var99][var98] & var94) != 0) {
                            int var112 = var99;
                            int var113 = var99;
                            int var114 = var97;
                            int var115 = var97;
                            while (var112 > 0 && (Statics.field1166[var97][var112 - 1][var98] & var94) != 0) {
                                var112--;
                            }
                            while (var113 < 104 && (Statics.field1166[var97][var113 + 1][var98] & var94) != 0) {
                                var113++;
                            }
                            label431: while (var114 > 0) {
                                for (int var116 = var112; var116 <= var113; var116++) {
                                    if ((Statics.field1166[var114 - 1][var116][var98] & var94) == 0) {
                                        break label431;
                                    }
                                }
                                var114--;
                            }
                            label420: while (var115 < var96) {
                                for (int var117 = var112; var117 <= var113; var117++) {
                                    if ((Statics.field1166[var115 + 1][var117][var98] & var94) == 0) {
                                        break label420;
                                    }
                                }
                                var115++;
                            }
                            int var118 = (var115 + 1 - var114) * (var113 - var112 + 1);
                            if (var118 >= 8) {
                                short var119 = 240;
                                int var120 = field127[var115][var112][var98] - var119;
                                int var121 = field127[var114][var112][var98];
                                class95.method1893(var96, 2, var112 * 128, var113 * 128 + 128, var98 * 128, var98 * 128, var120, var121);
                                for (int var122 = var114; var122 <= var115; var122++) {
                                    for (int var123 = var112; var123 <= var113; var123++) {
                                        Statics.field1166[var122][var123][var98] &= ~var94;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1166[var97][var99][var98] & var95) != 0) {
                            int var124 = var99;
                            int var125 = var99;
                            int var126 = var98;
                            int var127 = var98;
                            while (var126 > 0 && (Statics.field1166[var97][var99][var126 - 1] & var95) != 0) {
                                var126--;
                            }
                            while (var127 < 104 && (Statics.field1166[var97][var99][var127 + 1] & var95) != 0) {
                                var127++;
                            }
                            label484: while (var124 > 0) {
                                for (int var128 = var126; var128 <= var127; var128++) {
                                    if ((Statics.field1166[var97][var124 - 1][var128] & var95) == 0) {
                                        break label484;
                                    }
                                }
                                var124--;
                            }
                            label473: while (var125 < 104) {
                                for (int var129 = var126; var129 <= var127; var129++) {
                                    if ((Statics.field1166[var97][var125 + 1][var129] & var95) == 0) {
                                        break label473;
                                    }
                                }
                                var125++;
                            }
                            if ((var125 - var124 + 1) * (var127 - var126 + 1) >= 4) {
                                int var130 = field127[var97][var124][var126];
                                class95.method1893(var96, 4, var124 * 128, var125 * 128 + 128, var126 * 128, var127 * 128 + 128, var130, var130);
                                for (int var131 = var124; var131 <= var125; var131++) {
                                    for (int var132 = var126; var132 <= var127; var132++) {
                                        Statics.field1166[var97][var131][var132] &= ~var95;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.n(IIIB)I")
    public static final int method188(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2939(var3, var5);
        int var8 = method2939(var3 + 1, var5);
        int var9 = method2939(var3, var5 + 1);
        int var10 = method2939(var3 + 1, var5 + 1);
        int var11 = method49(var7, var8, var4, arg2);
        int var12 = method49(var9, var10, var4, arg2);
        return method49(var11, var12, var6, arg2);
    }

    @ObfuscatedName("g.q(IIIII)I")
    public static final int method49(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1754[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("eo.i(III)I")
    public static final int method2939(int arg0, int arg1) {
        int var2 = method507(arg0 - 1, arg1 - 1) + method507(arg0 + 1, arg1 - 1) + method507(arg0 - 1, arg1 + 1) + method507(arg0 + 1, arg1 + 1);
        int var3 = method507(arg0 - 1, arg1) + method507(arg0 + 1, arg1) + method507(arg0, arg1 - 1) + method507(arg0, arg1 + 1);
        int var4 = method507(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("au.p(III)I")
    public static final int method507(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("y.e(III)I")
    public static final int method199(int arg0, int arg1) {
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

    @ObfuscatedName("aq.o(III)I")
    public static final int method652(int arg0, int arg1) {
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

    @ObfuscatedName("cm.j(IIII)I")
    public static final int method1601(int arg0, int arg1, int arg2) {
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
}
