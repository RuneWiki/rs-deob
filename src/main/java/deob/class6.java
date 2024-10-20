package deob;

@ObfuscatedName("o")
public final class class6 {

    @ObfuscatedName("o.t")
    public static int[][][] field67 = new int[4][105][105];

    @ObfuscatedName("o.b")
    public static byte[][][] field68 = new byte[4][104][104];

    @ObfuscatedName("o.p")
    public static int field69 = 99;

    @ObfuscatedName("o.w")
    public static final int[] field83 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("o.q")
    public static final int[] field81 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("o.g")
    public static final int[] field70 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("o.z")
    public static final int[] field82 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("o.m")
    public static final int[] field84 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("o.y")
    public static final int[] field88 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("o.n")
    public static int field85 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("o.s")
    public static int field86 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.t(I)V")
    public static void method2115() {
        Statics.field74 = (byte[][][]) null;
        Statics.field71 = (byte[][][]) null;
        Statics.field72 = (byte[][][]) null;
        Statics.field1535 = (byte[][][]) null;
        Statics.field1428 = (int[][][]) null;
        Statics.field73 = (byte[][][]) null;
        Statics.field2769 = (int[][]) null;
        Statics.field75 = null;
        Statics.field76 = null;
        Statics.field80 = null;
        Statics.field77 = null;
        Statics.field1592 = null;
    }

    @ObfuscatedName("g.b(IIIIB)V")
    public static final void method533(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field73[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field67[0][var5][var4] = field67[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field67[0][var5][var4] = field67[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field67[0][var5][var4] = field67[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field67[0][var5][var4] = field67[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bx.p([BIIIIIII[Lhg;I)V")
    public static final void method1465(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class220[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3140[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class111 var11 = new class111(arg0);
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
                        method3018(var11, arg1, arg2 + var22, arg3 + class168.method2109(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method3018(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.e(IIIB)V")
    public static final void method657(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field67[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field67[arg0][arg1][arg2 + var5] = field67[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field67[arg0][arg1 + var6][arg2] = field67[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field67[arg0][arg1 - 1][arg2] != 0) {
            field67[arg0][arg1][arg2] = field67[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field67[arg0][arg1][arg2 - 1] != 0) {
            field67[arg0][arg1][arg2] = field67[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field67[arg0][arg1 - 1][arg2 - 1] != 0) {
            field67[arg0][arg1][arg2] = field67[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("fi.i(Ldc;IIIIIII)V")
    public static final void method3018(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2172();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2172();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2172();
                }
            }
            return;
        }
        field68[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2172();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field67[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method165(var10 + 45365, var11 + 91923, 4) - 128 + (method165(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method165(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field67[arg1][arg2][arg3] = field67[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2172();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field67[0][arg2][arg3] = -var15 * 8;
                } else {
                    field67[arg1][arg2][arg3] = field67[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field71[arg1][arg2][arg3] = arg0.method2358();
                Statics.field72[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1535[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field68[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field74[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("de.o([BIIB)Z")
    public static final boolean method2477(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class111 var4 = new class111(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2185();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2185();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2172() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class38 var16 = class38.method1473(var5);
                        if (var13 != 22 || !client.field251 || var16.field857 != 0 || var16.field862 == 1 || var16.field883) {
                            if (!var16.method743()) {
                                client.field281++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2185();
                if (var9 == 0) {
                    break;
                }
                var4.method2172();
            }
        }
    }

    @ObfuscatedName("eu.f(IIIIIILcp;Lhg;B)V")
    public static final void method2789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class220 arg7) {
        if (client.field251 && (field68[0][arg1][arg2] & 0x2) == 0) {
            if ((field68[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1906(arg0, arg1, arg2) != client.field301) {
                return;
            }
        }
        if (arg0 < field69) {
            field69 = arg0;
        }
        class38 var8 = class38.method1473(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field859;
            var10 = var8.field860;
        } else {
            var9 = var8.field860;
            var10 = var8.field859;
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
        int[][] var15 = field67[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field857 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field851 == 1) {
            var20 += 256;
        }
        if (var8.method725()) {
            class22 var21 = new class22();
            var21.field563 = arg0;
            var21.field573 = arg1 * 128;
            var21.field559 = arg2 * 128;
            int var22 = var8.field860;
            int var23 = var8.field859;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field859;
                var23 = var8.field860;
            }
            var21.field557 = (arg1 + var22) * 128;
            var21.field570 = (arg2 + var23) * 128;
            var21.field561 = var8.field889;
            var21.field562 = var8.field885 * 128;
            var21.field558 = var8.field872;
            var21.field566 = var8.field892;
            var21.field567 = var8.field893;
            if (var8.field886 != null) {
                var21.field565 = var8;
                var21.method547();
            }
            class22.field560.method3442(var21);
            if (var21.field567 != null) {
                var21.field568 = var21.field558 + (int) (Math.random() * (double) (var21.field566 - var21.field558));
            }
        }
        if (arg5 == 22) {
            if (!client.field251 || var8.field857 != 0 || var8.field862 == 1 || var8.field883) {
                class80 var24;
                if (var8.field868 == -1 && var8.field886 == null) {
                    var24 = var8.method720(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var8.field868, true, (class80) null);
                }
                arg6.method1654(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field862 == 1 && arg7 != null) {
                    arg7.method3745(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var47;
            if (var8.field868 == -1 && var8.field886 == null) {
                var47 = var8.method720(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            if (var47 != null && arg6.method1658(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field890) {
                int var48 = 15;
                if (var47 instanceof class100) {
                    var48 = ((class100) var47).method2022() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field73[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field73[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3774(arg1, arg2, var9, var10, var8.field863);
            }
        } else if (arg5 >= 12) {
            class80 var25;
            if (var8.field868 == -1 && var8.field886 == null) {
                var25 = var8.method720(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1428[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3774(arg1, arg2, var9, var10, var8.field863);
            }
        } else if (arg5 == 0) {
            class80 var26;
            if (var8.field868 == -1 && var8.field886 == null) {
                var26 = var8.method720(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1656(arg0, arg1, arg2, var16, var26, (class80) null, field83[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field890) {
                    Statics.field73[arg0][arg1][arg2] = 50;
                    Statics.field73[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field867) {
                    Statics.field1428[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field890) {
                    Statics.field73[arg0][arg1][arg2 + 1] = 50;
                    Statics.field73[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field867) {
                    Statics.field1428[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field890) {
                    Statics.field73[arg0][arg1 + 1][arg2] = 50;
                    Statics.field73[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field867) {
                    Statics.field1428[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field890) {
                    Statics.field73[arg0][arg1][arg2] = 50;
                    Statics.field73[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field867) {
                    Statics.field1428[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3742(arg1, arg2, arg5, arg4, var8.field863);
            }
            if (var8.field869 != 16) {
                arg6.method1721(arg0, arg1, arg2, var8.field869);
            }
        } else if (arg5 == 1) {
            class80 var27;
            if (var8.field868 == -1 && var8.field886 == null) {
                var27 = var8.method720(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1656(arg0, arg1, arg2, var16, var27, (class80) null, field81[arg4], 0, var19, var20);
            if (var8.field890) {
                if (arg4 == 0) {
                    Statics.field73[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field73[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field73[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field73[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3742(arg1, arg2, arg5, arg4, var8.field863);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class80 var29;
            class80 var30;
            if (var8.field868 == -1 && var8.field886 == null) {
                var29 = var8.method720(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method720(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field868, true, (class80) null);
                var30 = new class12(arg3, 2, var28, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1656(arg0, arg1, arg2, var16, var29, var30, field83[arg4], field83[var28], var19, var20);
            if (var8.field867) {
                if (arg4 == 0) {
                    Statics.field1428[arg0][arg1][arg2] |= 0x249;
                    Statics.field1428[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1428[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1428[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1428[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1428[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1428[arg0][arg1][arg2] |= 0x492;
                    Statics.field1428[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3742(arg1, arg2, arg5, arg4, var8.field863);
            }
            if (var8.field869 != 16) {
                arg6.method1721(arg0, arg1, arg2, var8.field869);
            }
        } else if (arg5 == 3) {
            class80 var31;
            if (var8.field868 == -1 && var8.field886 == null) {
                var31 = var8.method720(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1656(arg0, arg1, arg2, var16, var31, (class80) null, field81[arg4], 0, var19, var20);
            if (var8.field890) {
                if (arg4 == 0) {
                    Statics.field73[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field73[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field73[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field73[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3742(arg1, arg2, arg5, arg4, var8.field863);
            }
        } else if (arg5 == 9) {
            class80 var32;
            if (var8.field868 == -1 && var8.field886 == null) {
                var32 = var8.method720(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1658(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field862 != 0 && arg7 != null) {
                arg7.method3774(arg1, arg2, var9, var10, var8.field863);
            }
            if (var8.field869 != 16) {
                arg6.method1721(arg0, arg1, arg2, var8.field869);
            }
        } else if (arg5 == 4) {
            class80 var33;
            if (var8.field868 == -1 && var8.field886 == null) {
                var33 = var8.method720(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1657(arg0, arg1, arg2, var16, var33, (class80) null, field83[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1674(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class38.method1473(var35 >> 14 & 0x7FFF).field869;
            }
            class80 var36;
            if (var8.field868 == -1 && var8.field886 == null) {
                var36 = var8.method720(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1657(arg0, arg1, arg2, var16, var36, (class80) null, field83[arg4], 0, field70[arg4] * var34, field82[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1674(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class38.method1473(var38 >> 14 & 0x7FFF).field869 / 2;
            }
            class80 var39;
            if (var8.field868 == -1 && var8.field886 == null) {
                var39 = var8.method720(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1657(arg0, arg1, arg2, var16, var39, (class80) null, 256, arg4, field84[arg4] * var37, field88[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class80 var41;
            if (var8.field868 == -1 && var8.field886 == null) {
                var41 = var8.method720(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class12(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1657(arg0, arg1, arg2, var16, var41, (class80) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1674(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class38.method1473(var43 >> 14 & 0x7FFF).field869 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class80 var45;
            class80 var46;
            if (var8.field868 == -1 && var8.field886 == null) {
                var45 = var8.method720(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method720(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field868, true, (class80) null);
                var46 = new class12(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field868, true, (class80) null);
            }
            arg6.method1657(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field84[arg4] * var42, field88[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cl.d(IIII)I")
    public static int method1906(int arg0, int arg1, int arg2) {
        if ((field68[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field68[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("c.j(IIIB)I")
    public static final int method165(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2807(var3, var5);
        int var8 = method2807(var3 + 1, var5);
        int var9 = method2807(var3, var5 + 1);
        int var10 = method2807(var3 + 1, var5 + 1);
        int var11 = method3514(var7, var8, var4, arg2);
        int var12 = method3514(var9, var10, var4, arg2);
        return method3514(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ge.x(IIIII)I")
    public static final int method3514(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class86.field1491[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ej.v(III)I")
    public static final int method2807(int arg0, int arg1) {
        int var2 = method7(arg0 - 1, arg1 - 1) + method7(arg0 + 1, arg1 - 1) + method7(arg0 - 1, arg1 + 1) + method7(arg0 + 1, arg1 + 1);
        int var3 = method7(arg0 - 1, arg1) + method7(arg0 + 1, arg1) + method7(arg0, arg1 - 1) + method7(arg0, arg1 + 1);
        int var4 = method7(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("b.a(III)I")
    public static final int method7(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bm.l(III)I")
    public static final int method1472(int arg0, int arg1) {
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

    @ObfuscatedName("at.h(IIB)I")
    public static final int method661(int arg0, int arg1) {
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

    @ObfuscatedName("ar.c(IIII)I")
    public static final int method875(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("p.u(IIB)Z")
    public static final boolean method23(int arg0, int arg1) {
        class38 var2 = class38.method1473(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method718(arg1);
    }
}
