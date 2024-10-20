package deob;

@ObfuscatedName("i")
public final class class6 {

    @ObfuscatedName("i.m")
    public static int[][][] field97 = new int[4][105][105];

    @ObfuscatedName("i.k")
    public static byte[][][] field93 = new byte[4][104][104];

    @ObfuscatedName("i.y")
    public static int field79 = 99;

    @ObfuscatedName("i.c")
    public static final int[] field88 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("i.b")
    public static final int[] field92 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("i.s")
    public static final int[] field83 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("i.o")
    public static final int[] field94 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("i.h")
    public static final int[] field95 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("i.x")
    public static final int[] field96 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("i.e")
    public static int field99 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("i.z")
    public static int field84 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.k(IIIIB)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field86[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field97[0][var5][var4] = field97[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field97[0][var5][var4] = field97[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field97[0][var5][var4] = field97[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field97[0][var5][var4] = field97[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.y([BIIIIIII[Lgk;I)V")
    public static final void method2665(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class187[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2897[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class104 var11 = new class104(arg0);
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
                        method549(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method549(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.r(Lcb;IIIIIII)V")
    public static final void method549(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2190();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2190();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2190();
                }
            }
            return;
        }
        field93[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2190();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field97[0][arg2][arg3] = -method2816(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field97[arg1][arg2][arg3] = field97[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2190();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field97[0][arg2][arg3] = -var8 * 8;
                } else {
                    field97[arg1][arg2][arg3] = field97[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field100[arg1][arg2][arg3] = arg0.method2159();
                Statics.field80[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field85[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field93[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field82[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("i.i([BIILbf;[Lgk;I)V")
    public static final void method85(byte[] arg0, int arg1, int arg2, class76 arg3, class187[] arg4) {
        class104 var5 = new class104(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2143();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2143();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2190();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field93[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class187 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    Statics.method1870(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("z.f([BIIIIIIILbf;[Lgk;I)V")
    public static final void method547(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class76 arg8, class187[] arg9) {
        class104 var10 = new class104(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2143();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2143();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2190();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class33 var21 = class33.method13(var11);
                    int var22 = arg2 + class151.method551(var16 & 0x7, var15 & 0x7, arg7, var21.field813, var21.field816, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field813;
                    int var28 = var21.field816;
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
                        if ((field93[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class187 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        Statics.method1870(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.w(IIIB)I")
    public static int method577(int arg0, int arg1, int arg2) {
        if ((field93[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field93[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("es.u(III)I")
    public static final int method2816(int arg0, int arg1) {
        int var2 = method852(arg0 + 45365, arg1 + 91923, 4) - 128 + (method852(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method852(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ag.d(IIII)I")
    public static final int method852(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2643(var3, var5);
        int var8 = method2643(var3 + 1, var5);
        int var9 = method2643(var3, var5 + 1);
        int var10 = method2643(var3 + 1, var5 + 1);
        int var11 = 65536 - class81.field1449[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class81.field1449[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        return method36(var12, var15, var6, arg2);
    }

    @ObfuscatedName("g.t(IIIII)I")
    public static final int method36(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class81.field1449[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("dq.j(III)I")
    public static final int method2643(int arg0, int arg1) {
        int var2 = method1000(arg0 - 1, arg1 - 1) + method1000(arg0 + 1, arg1 - 1) + method1000(arg0 - 1, arg1 + 1) + method1000(arg0 + 1, arg1 + 1);
        int var3 = method1000(arg0 - 1, arg1) + method1000(arg0 + 1, arg1) + method1000(arg0, arg1 - 1) + method1000(arg0, arg1 + 1);
        int var4 = method1000(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ax.q(III)I")
    public static final int method1000(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("client.p(III)I")
    public static final int method471(int arg0, int arg1) {
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

    @ObfuscatedName("cx.v(III)I")
    public static final int method2059(int arg0, int arg1) {
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

    @ObfuscatedName("m.n(IIII)I")
    public static final int method2(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("co.l(III)Z")
    public static final boolean method1958(int arg0, int arg1) {
        class33 var2 = class33.method13(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method617(arg1);
    }

    @ObfuscatedName("p.c(IIIIIIILbf;Lgk;I)V")
    public static final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class76 arg7, class187 arg8) {
        class33 var9 = class33.method13(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field816;
            var11 = var9.field813;
        } else {
            var10 = var9.field813;
            var11 = var9.field816;
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
        int[][] var16 = field97[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field801 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field838 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class75 var22;
            if (var9.field821 == -1 && var9.field839 == null) {
                var22 = var9.method618(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class10(arg4, 22, arg5, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1754(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field803 == 1) {
                arg8.method3417(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class75 var45;
            if (var9.field821 == -1 && var9.field839 == null) {
                var45 = var9.method618(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class10(arg4, 10, arg5, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            if (var45 != null) {
                arg7.method1597(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field803 != 0) {
                arg8.method3401(arg2, arg3, var10, var11, var9.field852);
            }
        } else if (arg6 >= 12) {
            class75 var23;
            if (var9.field821 == -1 && var9.field839 == null) {
                var23 = var9.method618(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class10(arg4, arg6, arg5, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1597(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field803 != 0) {
                arg8.method3401(arg2, arg3, var10, var11, var9.field852);
            }
        } else if (arg6 == 0) {
            class75 var24;
            if (var9.field821 == -1 && var9.field839 == null) {
                var24 = var9.method618(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class10(arg4, 0, arg5, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1595(arg0, arg2, arg3, var17, var24, (class75) null, field88[arg5], 0, var20, var21);
            if (var9.field803 != 0) {
                arg8.method3400(arg2, arg3, arg6, arg5, var9.field852);
            }
        } else if (arg6 == 1) {
            class75 var25;
            if (var9.field821 == -1 && var9.field839 == null) {
                var25 = var9.method618(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class10(arg4, 1, arg5, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1595(arg0, arg2, arg3, var17, var25, (class75) null, field92[arg5], 0, var20, var21);
            if (var9.field803 != 0) {
                arg8.method3400(arg2, arg3, arg6, arg5, var9.field852);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class75 var27;
            class75 var28;
            if (var9.field821 == -1 && var9.field839 == null) {
                var27 = var9.method618(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method618(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class10(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field821, true, (class75) null);
                var28 = new class10(arg4, 2, var26, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1595(arg0, arg2, arg3, var17, var27, var28, field88[arg5], field88[var26], var20, var21);
            if (var9.field803 != 0) {
                arg8.method3400(arg2, arg3, arg6, arg5, var9.field852);
            }
        } else if (arg6 == 3) {
            class75 var29;
            if (var9.field821 == -1 && var9.field839 == null) {
                var29 = var9.method618(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class10(arg4, 3, arg5, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1595(arg0, arg2, arg3, var17, var29, (class75) null, field92[arg5], 0, var20, var21);
            if (var9.field803 != 0) {
                arg8.method3400(arg2, arg3, arg6, arg5, var9.field852);
            }
        } else if (arg6 == 9) {
            class75 var30;
            if (var9.field821 == -1 && var9.field839 == null) {
                var30 = var9.method618(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class10(arg4, arg6, arg5, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1597(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field803 != 0) {
                arg8.method3401(arg2, arg3, var10, var11, var9.field852);
            }
        } else if (arg6 == 4) {
            class75 var31;
            if (var9.field821 == -1 && var9.field839 == null) {
                var31 = var9.method618(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class10(arg4, 4, arg5, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1638(arg0, arg2, arg3, var17, var31, (class75) null, field88[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1655(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class33.method13(var33 >> 14 & 0x7FFF).field822;
            }
            class75 var34;
            if (var9.field821 == -1 && var9.field839 == null) {
                var34 = var9.method618(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class10(arg4, 4, arg5, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1638(arg0, arg2, arg3, var17, var34, (class75) null, field88[arg5], 0, field83[arg5] * var32, field94[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1655(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class33.method13(var36 >> 14 & 0x7FFF).field822 / 2;
            }
            class75 var37;
            if (var9.field821 == -1 && var9.field839 == null) {
                var37 = var9.method618(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class10(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1638(arg0, arg2, arg3, var17, var37, (class75) null, 256, arg5, field95[arg5] * var35, field96[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class75 var39;
            if (var9.field821 == -1 && var9.field839 == null) {
                var39 = var9.method618(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class10(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1638(arg0, arg2, arg3, var17, var39, (class75) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1655(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class33.method13(var41 >> 14 & 0x7FFF).field822 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class75 var43;
            class75 var44;
            if (var9.field821 == -1 && var9.field839 == null) {
                var43 = var9.method618(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method618(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class10(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field821, true, (class75) null);
                var44 = new class10(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field821, true, (class75) null);
            }
            arg7.method1638(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field95[arg5] * var40, field96[arg5] * var40, var20, var21);
        }
    }
}
