package deob;

@ObfuscatedName("g")
public final class class6 {

    @ObfuscatedName("g.s")
    public static int[][][] field83 = new int[4][105][105];

    @ObfuscatedName("g.z")
    public static byte[][][] field80 = new byte[4][104][104];

    @ObfuscatedName("g.t")
    public static int field67 = 99;

    @ObfuscatedName("g.o")
    public static final int[] field75 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("g.c")
    public static final int[] field85 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("g.i")
    public static final int[] field77 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("g.x")
    public static final int[] field78 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("g.v")
    public static final int[] field79 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("g.l")
    public static final int[] field72 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("g.e")
    public static int field81 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("g.j")
    public static int field82 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fx.s(I)V")
    public static void method3254() {
        field67 = 99;
        Statics.field3214 = new byte[4][104][104];
        Statics.field68 = new byte[4][104][104];
        Statics.field70 = new byte[4][104][104];
        Statics.field1262 = new byte[4][104][104];
        Statics.field217 = new int[4][105][105];
        Statics.field3198 = new byte[4][105][105];
        Statics.field165 = new int[105][105];
        Statics.field71 = new int[104];
        Statics.field777 = new int[104];
        Statics.field66 = new int[104];
        Statics.field2053 = new int[104];
        Statics.field73 = new int[104];
    }

    @ObfuscatedName("ee.z(B)V")
    public static void method2955() {
        Statics.field3214 = (byte[][][]) null;
        Statics.field68 = (byte[][][]) null;
        Statics.field70 = (byte[][][]) null;
        Statics.field1262 = (byte[][][]) null;
        Statics.field217 = (int[][][]) null;
        Statics.field3198 = (byte[][][]) null;
        Statics.field165 = (int[][]) null;
        Statics.field71 = null;
        Statics.field777 = null;
        Statics.field66 = null;
        Statics.field2053 = null;
        Statics.field73 = null;
    }

    @ObfuscatedName("bq.t(IIIII)V")
    public static final void method1542(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3198[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field83[0][var5][var4] = field83[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field83[0][var5][var4] = field83[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field83[0][var5][var4] = field83[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field83[0][var5][var4] = field83[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.y([BIIII[Ldk;S)V")
    public static final void method41(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class112[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1932[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class123 var9 = new class123(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2073(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("dx.p([BIIIIIII[Ldk;I)V")
    public static final void method2275(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class112[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1932[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class123 var11 = new class123(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class181.method705(var13 & 0x7, var14 & 0x7, arg7);
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
                        method2073(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method2073(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cz.g(Ldy;IIIIIIB)V")
    public static final void method2073(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2363();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2363();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2363();
                }
            }
            return;
        }
        field80[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2363();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field83[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1212(var10 + 45365, var11 + 91923, 4) - 128 + (method1212(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1212(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field83[arg1][arg2][arg3] = field83[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2363();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field83[0][arg2][arg3] = -var15 * 8;
                } else {
                    field83[arg1][arg2][arg3] = field83[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field68[arg1][arg2][arg3] = arg0.method2483();
                Statics.field70[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1262[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field80[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field3214[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("fs.m([BIII)Z")
    public static final boolean method3066(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class123 var4 = new class123(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2536();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2536();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2363() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class43 var16 = class43.method768(var5);
                        if (var13 != 22 || !client.field272 || var16.field928 != 0 || var16.field915 == 1 || var16.field947) {
                            if (!var16.method797()) {
                                client.field325++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2536();
                if (var9 == 0) {
                    break;
                }
                var4.method2363();
            }
        }
    }

    @ObfuscatedName("ee.f([BIILce;[Ldk;I)V")
    public static final void method2971(byte[] arg0, int arg1, int arg2, class90 arg3, class112[] arg4) {
        class123 var5 = new class123(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2536();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2536();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2363();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field80[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class112 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method1017(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("af.k(IIIIIILce;Ldk;I)V")
    public static final void method1017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, class112 arg7) {
        if (client.field272 && (field80[0][arg1][arg2] & 0x2) == 0 && (field80[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field67) {
            field67 = arg0;
        }
        class43 var8 = class43.method768(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field925;
            var10 = var8.field924;
        } else {
            var9 = var8.field924;
            var10 = var8.field925;
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
        int[][] var15 = field83[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field928 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field949 == 1) {
            var20 += 256;
        }
        if (var8.method808()) {
            class25 var21 = new class25();
            var21.field592 = arg0;
            var21.field595 = arg1 * 128;
            var21.field594 = arg2 * 128;
            int var22 = var8.field924;
            int var23 = var8.field925;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field925;
                var23 = var8.field924;
            }
            var21.field602 = (arg1 + var22) * 128;
            var21.field596 = (arg2 + var23) * 128;
            var21.field598 = var8.field953;
            var21.field597 = var8.field954 * 128;
            var21.field593 = var8.field955;
            var21.field601 = var8.field956;
            var21.field606 = var8.field957;
            if (var8.field950 != null) {
                var21.field605 = var8;
                var21.method581();
            }
            class25.field591.method3581(var21);
            if (var21.field606 != null) {
                var21.field603 = var21.field593 + (int) (Math.random() * (double) (var21.field601 - var21.field593));
            }
        }
        if (arg5 == 22) {
            if (!client.field272 || var8.field928 != 0 || var8.field915 == 1 || var8.field947) {
                class89 var24;
                if (var8.field933 == -1 && var8.field950 == null) {
                    var24 = var8.method803(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field933, true, (class89) null);
                }
                arg6.method1825(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field915 == 1 && arg7 != null) {
                    arg7.method2263(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class89 var47;
            if (var8.field933 == -1 && var8.field950 == null) {
                var47 = var8.method803(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            if (var47 != null && arg6.method1911(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field940) {
                int var48 = 15;
                if (var47 instanceof class109) {
                    var48 = ((class109) var47).method2236() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field3198[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field3198[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field915 != 0 && arg7 != null) {
                arg7.method2248(arg1, arg2, var9, var10, var8.field952);
            }
        } else if (arg5 >= 12) {
            class89 var25;
            if (var8.field933 == -1 && var8.field950 == null) {
                var25 = var8.method803(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1911(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field217[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field915 != 0 && arg7 != null) {
                arg7.method2248(arg1, arg2, var9, var10, var8.field952);
            }
        } else if (arg5 == 0) {
            class89 var26;
            if (var8.field933 == -1 && var8.field950 == null) {
                var26 = var8.method803(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1924(arg0, arg1, arg2, var16, var26, (class89) null, field75[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field940) {
                    Statics.field3198[arg0][arg1][arg2] = 50;
                    Statics.field3198[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field931) {
                    Statics.field217[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field940) {
                    Statics.field3198[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3198[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field931) {
                    Statics.field217[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field940) {
                    Statics.field3198[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3198[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field931) {
                    Statics.field217[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field940) {
                    Statics.field3198[arg0][arg1][arg2] = 50;
                    Statics.field3198[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field931) {
                    Statics.field217[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field915 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field952);
            }
            if (var8.field916 != 16) {
                arg6.method1835(arg0, arg1, arg2, var8.field916);
            }
        } else if (arg5 == 1) {
            class89 var27;
            if (var8.field933 == -1 && var8.field950 == null) {
                var27 = var8.method803(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1924(arg0, arg1, arg2, var16, var27, (class89) null, field85[arg4], 0, var19, var20);
            if (var8.field940) {
                if (arg4 == 0) {
                    Statics.field3198[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3198[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3198[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3198[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field915 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field952);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class89 var29;
            class89 var30;
            if (var8.field933 == -1 && var8.field950 == null) {
                var29 = var8.method803(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method803(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field933, true, (class89) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1924(arg0, arg1, arg2, var16, var29, var30, field75[arg4], field75[var28], var19, var20);
            if (var8.field931) {
                if (arg4 == 0) {
                    Statics.field217[arg0][arg1][arg2] |= 0x249;
                    Statics.field217[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field217[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field217[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field217[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field217[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field217[arg0][arg1][arg2] |= 0x492;
                    Statics.field217[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field915 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field952);
            }
            if (var8.field916 != 16) {
                arg6.method1835(arg0, arg1, arg2, var8.field916);
            }
        } else if (arg5 == 3) {
            class89 var31;
            if (var8.field933 == -1 && var8.field950 == null) {
                var31 = var8.method803(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1924(arg0, arg1, arg2, var16, var31, (class89) null, field85[arg4], 0, var19, var20);
            if (var8.field940) {
                if (arg4 == 0) {
                    Statics.field3198[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3198[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3198[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3198[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field915 != 0 && arg7 != null) {
                arg7.method2247(arg1, arg2, arg5, arg4, var8.field952);
            }
        } else if (arg5 == 9) {
            class89 var32;
            if (var8.field933 == -1 && var8.field950 == null) {
                var32 = var8.method803(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1911(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field915 != 0 && arg7 != null) {
                arg7.method2248(arg1, arg2, var9, var10, var8.field952);
            }
            if (var8.field916 != 16) {
                arg6.method1835(arg0, arg1, arg2, var8.field916);
            }
        } else if (arg5 == 4) {
            class89 var33;
            if (var8.field933 == -1 && var8.field950 == null) {
                var33 = var8.method803(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1828(arg0, arg1, arg2, var16, var33, (class89) null, field75[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1908(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class43.method768(var35 >> 14 & 0x7FFF).field916;
            }
            class89 var36;
            if (var8.field933 == -1 && var8.field950 == null) {
                var36 = var8.method803(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1828(arg0, arg1, arg2, var16, var36, (class89) null, field75[arg4], 0, field77[arg4] * var34, field78[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1908(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class43.method768(var38 >> 14 & 0x7FFF).field916 / 2;
            }
            class89 var39;
            if (var8.field933 == -1 && var8.field950 == null) {
                var39 = var8.method803(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1828(arg0, arg1, arg2, var16, var39, (class89) null, 256, arg4, field79[arg4] * var37, field72[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class89 var41;
            if (var8.field933 == -1 && var8.field950 == null) {
                var41 = var8.method803(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1828(arg0, arg1, arg2, var16, var41, (class89) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1908(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class43.method768(var43 >> 14 & 0x7FFF).field916 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class89 var45;
            class89 var46;
            if (var8.field933 == -1 && var8.field950 == null) {
                var45 = var8.method803(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method803(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field933, true, (class89) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field933, true, (class89) null);
            }
            arg6.method1828(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field79[arg4] * var42, field72[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("be.r(IIIB)I")
    public static final int method1212(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3065(var3, var5);
        int var8 = method3065(var3 + 1, var5);
        int var9 = method3065(var3, var5 + 1);
        int var10 = method3065(var3 + 1, var5 + 1);
        int var11 = method955(var7, var8, var4, arg2);
        int var12 = method955(var9, var10, var4, arg2);
        return method955(var11, var12, var6, arg2);
    }

    @ObfuscatedName("as.w(IIIII)I")
    public static final int method955(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class95.field1622[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("fs.u(IIB)I")
    public static final int method3065(int arg0, int arg1) {
        int var2 = method753(arg0 - 1, arg1 - 1) + method753(arg0 + 1, arg1 - 1) + method753(arg0 - 1, arg1 + 1) + method753(arg0 + 1, arg1 + 1);
        int var3 = method753(arg0 - 1, arg1) + method753(arg0 + 1, arg1) + method753(arg0, arg1 - 1) + method753(arg0, arg1 + 1);
        int var4 = method753(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ap.n(III)I")
    public static final int method753(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("f.d(IIS)I")
    public static final int method105(int arg0, int arg1) {
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

    @ObfuscatedName("en.a(III)I")
    public static final int method2848(int arg0, int arg1) {
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

    @ObfuscatedName("ah.b(IIIB)I")
    public static final int method652(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ft.q(IIB)Z")
    public static final boolean method2982(int arg0, int arg1) {
        class43 var2 = class43.method768(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method811(arg1);
    }
}
