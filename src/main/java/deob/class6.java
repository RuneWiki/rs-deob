package deob;

@ObfuscatedName("r")
public final class class6 {

    @ObfuscatedName("r.o")
    public static int[][][] field88 = new int[4][105][105];

    @ObfuscatedName("r.l")
    public static byte[][][] field82 = new byte[4][104][104];

    @ObfuscatedName("r.g")
    public static int field73 = 99;

    @ObfuscatedName("r.t")
    public static final int[] field78 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("r.w")
    public static final int[] field79 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("r.p")
    public static final int[] field76 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("r.z")
    public static final int[] field81 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("r.s")
    public static final int[] field85 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("r.d")
    public static final int[] field83 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("r.b")
    public static int field84 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("r.e")
    public static int field80 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.o(I)V")
    public static void method3035() {
        field73 = 99;
        Statics.field2622 = new byte[4][104][104];
        Statics.field57 = new byte[4][104][104];
        Statics.field75 = new byte[4][104][104];
        Statics.field3021 = new byte[4][104][104];
        Statics.field1845 = new int[4][105][105];
        Statics.field1920 = new byte[4][105][105];
        Statics.field3107 = new int[105][105];
        Statics.field71 = new int[104];
        Statics.field183 = new int[104];
        Statics.field1370 = new int[104];
        Statics.field2015 = new int[104];
        Statics.field74 = new int[104];
    }

    @ObfuscatedName("w.l(I)V")
    public static void method538() {
        Statics.field2622 = (byte[][][]) null;
        Statics.field57 = (byte[][][]) null;
        Statics.field75 = (byte[][][]) null;
        Statics.field3021 = (byte[][][]) null;
        Statics.field1845 = (int[][][]) null;
        Statics.field1920 = (byte[][][]) null;
        Statics.field3107 = (int[][]) null;
        Statics.field71 = null;
        Statics.field183 = null;
        Statics.field1370 = null;
        Statics.field2015 = null;
        Statics.field74 = null;
    }

    @ObfuscatedName("er.g(IIIII)V")
    public static final void method2857(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1920[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field88[0][var5][var4] = field88[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field88[0][var5][var4] = field88[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field88[0][var5][var4] = field88[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field88[0][var5][var4] = field88[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.u([BIIII[Lhy;I)V")
    public static final void method2032(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class220[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3131[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class111 var9 = new class111(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("g.q([BIIIIIII[Lhy;I)V")
    public static final void method27(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class220[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3131[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class111 var11 = new class111(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method3(var11, arg1, arg2 + class168.method2535(var13 & 0x7, var14 & 0x7, arg7), arg3 + class168.method2034(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method3(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.r(IIIB)V")
    public static final void method142(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field88[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field88[arg0][arg1][arg2 + var5] = field88[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field88[arg0][arg1 + var6][arg2] = field88[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field88[arg0][arg1 - 1][arg2] != 0) {
            field88[arg0][arg1][arg2] = field88[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field88[arg0][arg1][arg2 - 1] != 0) {
            field88[arg0][arg1][arg2] = field88[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field88[arg0][arg1 - 1][arg2 - 1] != 0) {
            field88[arg0][arg1][arg2] = field88[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("l.v(Ldk;IIIIIIB)V")
    public static final void method3(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2219();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2219();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2219();
                }
            }
            return;
        }
        field82[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2219();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field88[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method975(var10 + 45365, var11 + 91923, 4) - 128 + (method975(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method975(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field88[arg1][arg2][arg3] = field88[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2219();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field88[0][arg2][arg3] = -var15 * 8;
                } else {
                    field88[arg1][arg2][arg3] = field88[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field57[arg1][arg2][arg3] = arg0.method2220();
                Statics.field75[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3021[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field82[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field2622[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("o.y([BIIIIIIILcy;[Lhy;B)V")
    public static final void method2(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class81 arg8, class220[] arg9) {
        class111 var10 = new class111(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2368();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2368();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2219();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class38 var21 = class38.method150(var11);
                    int var22 = arg2 + class168.method175(var16 & 0x7, var15 & 0x7, arg7, var21.field874, var21.field875, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field874;
                    int var28 = var21.field875;
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
                        if ((field82[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class220 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method3056(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fj.k(IIIIIILcy;Lhy;I)V")
    public static final void method3056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class220 arg7) {
        if (client.field263 && (field82[0][arg1][arg2] & 0x2) == 0) {
            if ((field82[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2025(arg0, arg1, arg2) != client.field314) {
                return;
            }
        }
        if (arg0 < field73) {
            field73 = arg0;
        }
        class38 var8 = class38.method150(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field875;
            var10 = var8.field874;
        } else {
            var9 = var8.field874;
            var10 = var8.field875;
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
        int[][] var15 = field88[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field878 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field899 == 1) {
            var20 += 256;
        }
        if (var8.method747()) {
            class22 var21 = new class22();
            var21.field578 = arg0;
            var21.field582 = arg1 * 128;
            var21.field580 = arg2 * 128;
            int var22 = var8.field874;
            int var23 = var8.field875;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field875;
                var23 = var8.field874;
            }
            var21.field581 = (arg1 + var22) * 128;
            var21.field590 = (arg2 + var23) * 128;
            var21.field584 = var8.field903;
            var21.field579 = var8.field904 * 128;
            var21.field586 = var8.field858;
            var21.field587 = var8.field860;
            var21.field588 = var8.field907;
            if (var8.field861 != null) {
                var21.field591 = var8;
                var21.method551();
            }
            class22.field583.method3470(var21);
            if (var21.field588 != null) {
                var21.field592 = var21.field586 + (int) (Math.random() * (double) (var21.field587 - var21.field586));
            }
        }
        if (arg5 == 22) {
            if (!client.field263 || var8.field878 != 0 || var8.field876 == 1 || var8.field897) {
                class80 var24;
                if (var8.field882 == -1 && var8.field861 == null) {
                    var24 = var8.method700(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var8.field882, true, (class80) null);
                }
                arg6.method1675(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field876 == 1 && arg7 != null) {
                    arg7.method3809(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var47;
            if (var8.field882 == -1 && var8.field861 == null) {
                var47 = var8.method700(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            if (var47 != null && arg6.method1679(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field889) {
                int var48 = 15;
                if (var47 instanceof class100) {
                    var48 = ((class100) var47).method2052() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field1920[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field1920[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field876 != 0 && arg7 != null) {
                arg7.method3792(arg1, arg2, var9, var10, var8.field905);
            }
        } else if (arg5 >= 12) {
            class80 var25;
            if (var8.field882 == -1 && var8.field861 == null) {
                var25 = var8.method700(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1679(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1845[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field876 != 0 && arg7 != null) {
                arg7.method3792(arg1, arg2, var9, var10, var8.field905);
            }
        } else if (arg5 == 0) {
            class80 var26;
            if (var8.field882 == -1 && var8.field861 == null) {
                var26 = var8.method700(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1677(arg0, arg1, arg2, var16, var26, (class80) null, field78[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field889) {
                    Statics.field1920[arg0][arg1][arg2] = 50;
                    Statics.field1920[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field881) {
                    Statics.field1845[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field889) {
                    Statics.field1920[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1920[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field881) {
                    Statics.field1845[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field889) {
                    Statics.field1920[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1920[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field881) {
                    Statics.field1845[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field889) {
                    Statics.field1920[arg0][arg1][arg2] = 50;
                    Statics.field1920[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field881) {
                    Statics.field1845[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field876 != 0 && arg7 != null) {
                arg7.method3791(arg1, arg2, arg5, arg4, var8.field905);
            }
            if (var8.field883 != 16) {
                arg6.method1785(arg0, arg1, arg2, var8.field883);
            }
        } else if (arg5 == 1) {
            class80 var27;
            if (var8.field882 == -1 && var8.field861 == null) {
                var27 = var8.method700(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1677(arg0, arg1, arg2, var16, var27, (class80) null, field79[arg4], 0, var19, var20);
            if (var8.field889) {
                if (arg4 == 0) {
                    Statics.field1920[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1920[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1920[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1920[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field876 != 0 && arg7 != null) {
                arg7.method3791(arg1, arg2, arg5, arg4, var8.field905);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class80 var29;
            class80 var30;
            if (var8.field882 == -1 && var8.field861 == null) {
                var29 = var8.method700(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method700(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field882, true, (class80) null);
                var30 = new class12(arg3, 2, var28, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1677(arg0, arg1, arg2, var16, var29, var30, field78[arg4], field78[var28], var19, var20);
            if (var8.field881) {
                if (arg4 == 0) {
                    Statics.field1845[arg0][arg1][arg2] |= 0x249;
                    Statics.field1845[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1845[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1845[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1845[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1845[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1845[arg0][arg1][arg2] |= 0x492;
                    Statics.field1845[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field876 != 0 && arg7 != null) {
                arg7.method3791(arg1, arg2, arg5, arg4, var8.field905);
            }
            if (var8.field883 != 16) {
                arg6.method1785(arg0, arg1, arg2, var8.field883);
            }
        } else if (arg5 == 3) {
            class80 var31;
            if (var8.field882 == -1 && var8.field861 == null) {
                var31 = var8.method700(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1677(arg0, arg1, arg2, var16, var31, (class80) null, field79[arg4], 0, var19, var20);
            if (var8.field889) {
                if (arg4 == 0) {
                    Statics.field1920[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1920[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1920[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1920[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field876 != 0 && arg7 != null) {
                arg7.method3791(arg1, arg2, arg5, arg4, var8.field905);
            }
        } else if (arg5 == 9) {
            class80 var32;
            if (var8.field882 == -1 && var8.field861 == null) {
                var32 = var8.method700(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1679(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field876 != 0 && arg7 != null) {
                arg7.method3792(arg1, arg2, var9, var10, var8.field905);
            }
            if (var8.field883 != 16) {
                arg6.method1785(arg0, arg1, arg2, var8.field883);
            }
        } else if (arg5 == 4) {
            class80 var33;
            if (var8.field882 == -1 && var8.field861 == null) {
                var33 = var8.method700(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1678(arg0, arg1, arg2, var16, var33, (class80) null, field78[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1695(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class38.method150(var35 >> 14 & 0x7FFF).field883;
            }
            class80 var36;
            if (var8.field882 == -1 && var8.field861 == null) {
                var36 = var8.method700(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1678(arg0, arg1, arg2, var16, var36, (class80) null, field78[arg4], 0, field76[arg4] * var34, field81[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1695(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class38.method150(var38 >> 14 & 0x7FFF).field883 / 2;
            }
            class80 var39;
            if (var8.field882 == -1 && var8.field861 == null) {
                var39 = var8.method700(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1678(arg0, arg1, arg2, var16, var39, (class80) null, 256, arg4, field85[arg4] * var37, field83[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class80 var41;
            if (var8.field882 == -1 && var8.field861 == null) {
                var41 = var8.method700(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class12(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1678(arg0, arg1, arg2, var16, var41, (class80) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1695(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class38.method150(var43 >> 14 & 0x7FFF).field883 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class80 var45;
            class80 var46;
            if (var8.field882 == -1 && var8.field861 == null) {
                var45 = var8.method700(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method700(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field882, true, (class80) null);
                var46 = new class12(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field882, true, (class80) null);
            }
            arg6.method1678(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field85[arg4] * var42, field83[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cc.c(IIII)I")
    public static int method2025(int arg0, int arg1, int arg2) {
        if ((field82[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field82[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ag.j(IIII)I")
    public static final int method975(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3394(var3, var5);
        int var8 = method3394(var3 + 1, var5);
        int var9 = method3394(var3, var5 + 1);
        int var10 = method3394(var3 + 1, var5 + 1);
        int var11 = 65536 - class86.field1478[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class86.field1478[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class86.field1478[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("fy.m(III)I")
    public static final int method3394(int arg0, int arg1) {
        int var2 = method2856(arg0 - 1, arg1 - 1) + method2856(arg0 + 1, arg1 - 1) + method2856(arg0 - 1, arg1 + 1) + method2856(arg0 + 1, arg1 + 1);
        int var3 = method2856(arg0 - 1, arg1) + method2856(arg0 + 1, arg1) + method2856(arg0, arg1 - 1) + method2856(arg0, arg1 + 1);
        int var4 = method2856(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("eb.a(III)I")
    public static final int method2856(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bq.f(IIB)I")
    public static final int method1404(int arg0, int arg1) {
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

    @ObfuscatedName("ax.i(III)I")
    public static final int method833(int arg0, int arg1) {
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

    @ObfuscatedName("j.n(IIII)I")
    public static final int method135(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("l.x(III)Z")
    public static final boolean method6(int arg0, int arg1) {
        class38 var2 = class38.method150(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method698(arg1);
    }
}
