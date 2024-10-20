package deob;

@ObfuscatedName("l")
public final class class6 {

    @ObfuscatedName("l.z")
    public static int[][][] field98 = new int[4][105][105];

    @ObfuscatedName("l.q")
    public static byte[][][] field79 = new byte[4][104][104];

    @ObfuscatedName("l.k")
    public static int field94 = 99;

    @ObfuscatedName("l.u")
    public static final int[] field88 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("l.e")
    public static final int[] field89 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("l.m")
    public static final int[] field90 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("l.s")
    public static final int[] field91 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("l.x")
    public static final int[] field92 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("l.y")
    public static final int[] field93 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("l.w")
    public static int field80 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("l.o")
    public static int field95 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.z(I)V")
    public static void method625() {
        field94 = 99;
        Statics.field81 = new byte[4][104][104];
        Statics.field82 = new byte[4][104][104];
        Statics.field83 = new byte[4][104][104];
        Statics.field84 = new byte[4][104][104];
        Statics.field1060 = new int[4][105][105];
        Statics.field85 = new byte[4][105][105];
        Statics.field97 = new int[105][105];
        Statics.field759 = new int[104];
        Statics.field1897 = new int[104];
        Statics.field2048 = new int[104];
        Statics.field87 = new int[104];
        Statics.field188 = new int[104];
    }

    @ObfuscatedName("ft.q(IIIIB)V")
    public static final void method3120(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field85[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field98[0][var5][var4] = field98[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field98[0][var5][var4] = field98[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field98[0][var5][var4] = field98[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field98[0][var5][var4] = field98[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.k([BIIII[Ldv;I)V")
    public static final void method2925(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class108[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1892[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class119 var9 = new class119(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3600(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("fv.f([BIIIIIII[Ldv;I)V")
    public static final void method3167(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1892[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class119 var11 = new class119(arg0);
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
                        method3600(var11, arg1, arg2 + var22, arg3 + class177.method95(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method3600(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.d(IIII)V")
    public static final void method1990(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field98[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field98[arg0][arg1][arg2 + var5] = field98[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field98[arg0][arg1 + var6][arg2] = field98[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field98[arg0][arg1 - 1][arg2] != 0) {
            field98[arg0][arg1][arg2] = field98[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field98[arg0][arg1][arg2 - 1] != 0) {
            field98[arg0][arg1][arg2] = field98[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field98[arg0][arg1 - 1][arg2 - 1] != 0) {
            field98[arg0][arg1][arg2] = field98[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("hz.l(Lda;IIIIIII)V")
    public static final void method3600(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2457();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2457();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2457();
                }
            }
            return;
        }
        field79[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2457();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field98[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = Statics.method617(var10 + 45365, var11 + 91923, 4) - 128 + (Statics.method617(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (Statics.method617(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field98[arg1][arg2][arg3] = field98[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2457();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field98[0][arg2][arg3] = -var15 * 8;
                } else {
                    field98[arg1][arg2][arg3] = field98[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field82[arg1][arg2][arg3] = arg0.method2423();
                Statics.field83[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field84[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field79[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field81[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ea.r([BIIB)Z")
    public static final boolean method2657(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class119 var4 = new class119(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2301();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2301();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2457() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method3664(var5);
                        if (var13 != 22 || !client.field466 || var16.field932 != 0 || var16.field930 == 1 || var16.field951) {
                            if (!var16.method772()) {
                                client.field336++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2301();
                if (var9 == 0) {
                    break;
                }
                var4.method2457();
            }
        }
    }

    @ObfuscatedName("ag.g(IIIIIILci;Ldv;I)V")
    public static final void method965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field466 && (field79[0][arg1][arg2] & 0x2) == 0 && (field79[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field94) {
            field94 = arg0;
        }
        class41 var8 = class41.method3664(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field929;
            var10 = var8.field928;
        } else {
            var9 = var8.field928;
            var10 = var8.field929;
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
        int[][] var15 = field98[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field932 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field922 == 1) {
            var20 += 256;
        }
        if (var8.method798()) {
            class24 var21 = new class24();
            var21.field593 = arg0;
            var21.field594 = arg1 * 128;
            var21.field595 = arg2 * 128;
            int var22 = var8.field928;
            int var23 = var8.field929;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field929;
                var23 = var8.field928;
            }
            var21.field596 = (arg1 + var22) * 128;
            var21.field597 = (arg2 + var23) * 128;
            var21.field601 = var8.field957;
            var21.field607 = var8.field958 * 128;
            var21.field598 = var8.field959;
            var21.field604 = var8.field940;
            var21.field603 = var8.field961;
            if (var8.field954 != null) {
                var21.field592 = var8;
                var21.method557();
            }
            class24.field602.method3491(var21);
            if (var21.field603 != null) {
                var21.field599 = var21.field598 + (int) (Math.random() * (double) (var21.field604 - var21.field598));
            }
        }
        if (arg5 == 22) {
            if (!client.field466 || var8.field932 != 0 || var8.field930 == 1 || var8.field951) {
                class85 var24;
                if (var8.field937 == -1 && var8.field954 == null) {
                    var24 = var8.method791(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
                }
                arg6.method1728(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field930 == 1 && arg7 != null) {
                    arg7.method2186(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field937 == -1 && var8.field954 == null) {
                var47 = var8.method791(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            if (var47 != null && arg6.method1732(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field944) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2108() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field85[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field85[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field930 != 0 && arg7 != null) {
                arg7.method2184(arg1, arg2, var9, var10, var8.field955);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field937 == -1 && var8.field954 == null) {
                var25 = var8.method791(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1732(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1060[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field930 != 0 && arg7 != null) {
                arg7.method2184(arg1, arg2, var9, var10, var8.field955);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field937 == -1 && var8.field954 == null) {
                var26 = var8.method791(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1781(arg0, arg1, arg2, var16, var26, (class85) null, field88[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field944) {
                    Statics.field85[arg0][arg1][arg2] = 50;
                    Statics.field85[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field919) {
                    Statics.field1060[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field944) {
                    Statics.field85[arg0][arg1][arg2 + 1] = 50;
                    Statics.field85[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field919) {
                    Statics.field1060[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field944) {
                    Statics.field85[arg0][arg1 + 1][arg2] = 50;
                    Statics.field85[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field919) {
                    Statics.field1060[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field944) {
                    Statics.field85[arg0][arg1][arg2] = 50;
                    Statics.field85[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field919) {
                    Statics.field1060[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field930 != 0 && arg7 != null) {
                arg7.method2209(arg1, arg2, arg5, arg4, var8.field955);
            }
            if (var8.field941 != 16) {
                arg6.method1738(arg0, arg1, arg2, var8.field941);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field937 == -1 && var8.field954 == null) {
                var27 = var8.method791(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1781(arg0, arg1, arg2, var16, var27, (class85) null, field89[arg4], 0, var19, var20);
            if (var8.field944) {
                if (arg4 == 0) {
                    Statics.field85[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field85[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field85[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field85[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field930 != 0 && arg7 != null) {
                arg7.method2209(arg1, arg2, arg5, arg4, var8.field955);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field937 == -1 && var8.field954 == null) {
                var29 = var8.method791(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method791(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1781(arg0, arg1, arg2, var16, var29, var30, field88[arg4], field88[var28], var19, var20);
            if (var8.field919) {
                if (arg4 == 0) {
                    Statics.field1060[arg0][arg1][arg2] |= 0x249;
                    Statics.field1060[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1060[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1060[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1060[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1060[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1060[arg0][arg1][arg2] |= 0x492;
                    Statics.field1060[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field930 != 0 && arg7 != null) {
                arg7.method2209(arg1, arg2, arg5, arg4, var8.field955);
            }
            if (var8.field941 != 16) {
                arg6.method1738(arg0, arg1, arg2, var8.field941);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field937 == -1 && var8.field954 == null) {
                var31 = var8.method791(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1781(arg0, arg1, arg2, var16, var31, (class85) null, field89[arg4], 0, var19, var20);
            if (var8.field944) {
                if (arg4 == 0) {
                    Statics.field85[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field85[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field85[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field85[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field930 != 0 && arg7 != null) {
                arg7.method2209(arg1, arg2, arg5, arg4, var8.field955);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field937 == -1 && var8.field954 == null) {
                var32 = var8.method791(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1732(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field930 != 0 && arg7 != null) {
                arg7.method2184(arg1, arg2, var9, var10, var8.field955);
            }
            if (var8.field941 != 16) {
                arg6.method1738(arg0, arg1, arg2, var8.field941);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field937 == -1 && var8.field954 == null) {
                var33 = var8.method791(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1765(arg0, arg1, arg2, var16, var33, (class85) null, field88[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1748(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method3664(var35 >> 14 & 0x7FFF).field941;
            }
            class85 var36;
            if (var8.field937 == -1 && var8.field954 == null) {
                var36 = var8.method791(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1765(arg0, arg1, arg2, var16, var36, (class85) null, field88[arg4], 0, field90[arg4] * var34, field91[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1748(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method3664(var38 >> 14 & 0x7FFF).field941 / 2;
            }
            class85 var39;
            if (var8.field937 == -1 && var8.field954 == null) {
                var39 = var8.method791(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1765(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field92[arg4] * var37, field93[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field937 == -1 && var8.field954 == null) {
                var41 = var8.method791(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1765(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1748(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method3664(var43 >> 14 & 0x7FFF).field941 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field937 == -1 && var8.field954 == null) {
                var45 = var8.method791(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method791(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field937, true, (class85) null);
            }
            arg6.method1765(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field92[arg4] * var42, field93[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("x.h(IIII)I")
    public static int method554(int arg0, int arg1, int arg2) {
        if ((field79[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field79[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fy.j(III)I")
    public static final int method2964(int arg0, int arg1) {
        int var2 = Statics.method2228(arg0 - 1, arg1 - 1) + Statics.method2228(arg0 + 1, arg1 - 1) + Statics.method2228(arg0 - 1, arg1 + 1) + Statics.method2228(arg0 + 1, arg1 + 1);
        int var3 = Statics.method2228(arg0 - 1, arg1) + Statics.method2228(arg0 + 1, arg1) + Statics.method2228(arg0, arg1 - 1) + Statics.method2228(arg0, arg1 + 1);
        int var4 = Statics.method2228(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ac.b(IIB)I")
    public static final int method678(int arg0, int arg1) {
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

    @ObfuscatedName("h.c(IIB)I")
    public static final int method118(int arg0, int arg1) {
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

    @ObfuscatedName("dj.v(IIII)I")
    public static final int method2572(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("u.p(III)Z")
    public static final boolean method184(int arg0, int arg1) {
        class41 var2 = class41.method3664(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method792(arg1);
    }
}
