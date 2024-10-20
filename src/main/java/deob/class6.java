package deob;

@ObfuscatedName("m")
public final class class6 {

    @ObfuscatedName("m.j")
    public static int[][][] field94 = new int[4][105][105];

    @ObfuscatedName("m.l")
    public static byte[][][] field82 = new byte[4][104][104];

    @ObfuscatedName("m.a")
    public static int field83 = 99;

    @ObfuscatedName("m.z")
    public static final int[] field89 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("m.p")
    public static final int[] field81 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("m.w")
    public static final int[] field104 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("m.t")
    public static final int[] field90 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("m.c")
    public static final int[] field93 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("m.x")
    public static final int[] field102 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("m.e")
    public static int field95 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("m.v")
    public static int field84 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.j(B)V")
    public static void method966() {
        Statics.field91 = (byte[][][]) null;
        Statics.field1973 = (byte[][][]) null;
        Statics.field85 = (byte[][][]) null;
        Statics.field86 = (byte[][][]) null;
        Statics.field1384 = (int[][][]) null;
        Statics.field98 = (byte[][][]) null;
        Statics.field1104 = (int[][]) null;
        Statics.field265 = null;
        Statics.field1975 = null;
        Statics.field87 = null;
        Statics.field88 = null;
        Statics.field2745 = null;
    }

    @ObfuscatedName("i.l(IIIIB)V")
    public static final void method34(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field98[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field94[0][var5][var4] = field94[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field94[0][var5][var4] = field94[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field94[0][var5][var4] = field94[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field94[0][var5][var4] = field94[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.a([BIIII[Ldt;I)V")
    public static final void method2509(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class108[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1905[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class119 var9 = new class119(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method792(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("m.i([BIIIIIII[Ldt;I)V")
    public static final void method80(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1905[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
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
                        method792(var11, arg1, arg2 + var22, arg3 + class177.method2024(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method792(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.f(Ldc;IIIIIIB)V")
    public static final void method792(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2316();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2316();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2316();
                }
            }
            return;
        }
        field82[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2316();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field94[0][arg2][arg3] = -method123(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2316();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field94[0][arg2][arg3] = -var8 * 8;
                } else {
                    field94[arg1][arg2][arg3] = field94[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1973[arg1][arg2][arg3] = arg0.method2317();
                Statics.field85[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field86[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field82[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field91[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("db.m(IIIIIILcq;Ldt;B)V")
    public static final void method2569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field458 && (field82[0][arg1][arg2] & 0x2) == 0 && (field82[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field83) {
            field83 = arg0;
        }
        class41 var8 = class41.method981(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field934;
            var10 = var8.field933;
        } else {
            var9 = var8.field933;
            var10 = var8.field934;
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
        int[][] var15 = field94[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field937 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field918 == 1) {
            var20 += 256;
        }
        if (var8.method794()) {
            class24 var21 = new class24();
            var21.field604 = arg0;
            var21.field603 = arg1 * 128;
            var21.field606 = arg2 * 128;
            int var22 = var8.field933;
            int var23 = var8.field934;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field934;
                var23 = var8.field933;
            }
            var21.field611 = (arg1 + var22) * 128;
            var21.field608 = (arg2 + var23) * 128;
            var21.field610 = var8.field968;
            var21.field609 = var8.field963 * 128;
            var21.field612 = var8.field964;
            var21.field615 = var8.field965;
            var21.field620 = var8.field966;
            if (var8.field921 != null) {
                var21.field617 = var8;
                var21.method580();
            }
            class24.field616.method3523(var21);
            if (var21.field620 != null) {
                var21.field613 = var21.field612 + (int) (Math.random() * (double) (var21.field615 - var21.field612));
            }
        }
        if (arg5 == 22) {
            if (!client.field458 || var8.field937 != 0 || var8.field935 == 1 || var8.field956) {
                class85 var24;
                if (var8.field950 == -1 && var8.field921 == null) {
                    var24 = var8.method789(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field950, true, (class85) null);
                }
                arg6.method1766(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field935 == 1 && arg7 != null) {
                    arg7.method2213(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field950 == -1 && var8.field921 == null) {
                var47 = var8.method789(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            if (var47 != null && arg6.method1852(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field954) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2135() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field98[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field98[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field935 != 0 && arg7 != null) {
                arg7.method2210(arg1, arg2, var9, var10, var8.field919);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field950 == -1 && var8.field921 == null) {
                var25 = var8.method789(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1852(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1384[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field935 != 0 && arg7 != null) {
                arg7.method2210(arg1, arg2, var9, var10, var8.field919);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field950 == -1 && var8.field921 == null) {
                var26 = var8.method789(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1761(arg0, arg1, arg2, var16, var26, (class85) null, field89[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field954) {
                    Statics.field98[arg0][arg1][arg2] = 50;
                    Statics.field98[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field940) {
                    Statics.field1384[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field954) {
                    Statics.field98[arg0][arg1][arg2 + 1] = 50;
                    Statics.field98[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field940) {
                    Statics.field1384[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field954) {
                    Statics.field98[arg0][arg1 + 1][arg2] = 50;
                    Statics.field98[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field940) {
                    Statics.field1384[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field954) {
                    Statics.field98[arg0][arg1][arg2] = 50;
                    Statics.field98[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field940) {
                    Statics.field1384[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field935 != 0 && arg7 != null) {
                arg7.method2233(arg1, arg2, arg5, arg4, var8.field919);
            }
            if (var8.field962 != 16) {
                arg6.method1776(arg0, arg1, arg2, var8.field962);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field950 == -1 && var8.field921 == null) {
                var27 = var8.method789(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1761(arg0, arg1, arg2, var16, var27, (class85) null, field81[arg4], 0, var19, var20);
            if (var8.field954) {
                if (arg4 == 0) {
                    Statics.field98[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field98[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field98[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field98[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field935 != 0 && arg7 != null) {
                arg7.method2233(arg1, arg2, arg5, arg4, var8.field919);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field950 == -1 && var8.field921 == null) {
                var29 = var8.method789(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method789(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field950, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1761(arg0, arg1, arg2, var16, var29, var30, field89[arg4], field89[var28], var19, var20);
            if (var8.field940) {
                if (arg4 == 0) {
                    Statics.field1384[arg0][arg1][arg2] |= 0x249;
                    Statics.field1384[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1384[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1384[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1384[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1384[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1384[arg0][arg1][arg2] |= 0x492;
                    Statics.field1384[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field935 != 0 && arg7 != null) {
                arg7.method2233(arg1, arg2, arg5, arg4, var8.field919);
            }
            if (var8.field962 != 16) {
                arg6.method1776(arg0, arg1, arg2, var8.field962);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field950 == -1 && var8.field921 == null) {
                var31 = var8.method789(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1761(arg0, arg1, arg2, var16, var31, (class85) null, field81[arg4], 0, var19, var20);
            if (var8.field954) {
                if (arg4 == 0) {
                    Statics.field98[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field98[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field98[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field98[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field935 != 0 && arg7 != null) {
                arg7.method2233(arg1, arg2, arg5, arg4, var8.field919);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field950 == -1 && var8.field921 == null) {
                var32 = var8.method789(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1852(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field935 != 0 && arg7 != null) {
                arg7.method2210(arg1, arg2, var9, var10, var8.field919);
            }
            if (var8.field962 != 16) {
                arg6.method1776(arg0, arg1, arg2, var8.field962);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field950 == -1 && var8.field921 == null) {
                var33 = var8.method789(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1769(arg0, arg1, arg2, var16, var33, (class85) null, field89[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1786(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method981(var35 >> 14 & 0x7FFF).field962;
            }
            class85 var36;
            if (var8.field950 == -1 && var8.field921 == null) {
                var36 = var8.method789(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1769(arg0, arg1, arg2, var16, var36, (class85) null, field89[arg4], 0, field104[arg4] * var34, field90[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1786(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method981(var38 >> 14 & 0x7FFF).field962 / 2;
            }
            class85 var39;
            if (var8.field950 == -1 && var8.field921 == null) {
                var39 = var8.method789(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1769(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field93[arg4] * var37, field102[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field950 == -1 && var8.field921 == null) {
                var41 = var8.method789(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1769(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1786(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method981(var43 >> 14 & 0x7FFF).field962 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field950 == -1 && var8.field921 == null) {
                var45 = var8.method789(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method789(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field950, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field950, true, (class85) null);
            }
            arg6.method1769(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field93[arg4] * var42, field102[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("cv.o(IIII)I")
    public static int method1934(int arg0, int arg1, int arg2) {
        if ((field82[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field82[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("k.h(IIS)I")
    public static final int method123(int arg0, int arg1) {
        int var2 = method3444(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3444(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3444(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("gk.n(IIII)I")
    public static final int method3444(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1000(var3, var5);
        int var8 = method1000(var3 + 1, var5);
        int var9 = method1000(var3, var5 + 1);
        int var10 = method1000(var3 + 1, var5 + 1);
        int var11 = 65536 - class91.field1591[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class91.field1591[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class91.field1591[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ah.k(III)I")
    public static final int method1000(int arg0, int arg1) {
        int var2 = method782(arg0 - 1, arg1 - 1) + method782(arg0 + 1, arg1 - 1) + method782(arg0 - 1, arg1 + 1) + method782(arg0 + 1, arg1 + 1);
        int var3 = method782(arg0 - 1, arg1) + method782(arg0 + 1, arg1) + method782(arg0, arg1 - 1) + method782(arg0, arg1 + 1);
        int var4 = method782(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ao.r(III)I")
    public static final int method782(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("w.b(III)I")
    public static final int method560(int arg0, int arg1) {
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

    @ObfuscatedName("bp.u(IIII)I")
    public static final int method1521(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("g.g(IIB)Z")
    public static final boolean method162(int arg0, int arg1) {
        class41 var2 = class41.method981(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method807(arg1);
    }
}
