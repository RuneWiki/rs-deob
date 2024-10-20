package deob;

@ObfuscatedName("q")
public final class class6 {

    @ObfuscatedName("q.i")
    public static int[][][] field74 = new int[4][105][105];

    @ObfuscatedName("q.v")
    public static byte[][][] field76 = new byte[4][104][104];

    @ObfuscatedName("q.r")
    public static int field80 = 99;

    @ObfuscatedName("q.g")
    public static final int[] field93 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("q.u")
    public static final int[] field94 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("q.o")
    public static final int[] field81 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("q.k")
    public static final int[] field82 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("q.a")
    public static final int[] field83 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("q.j")
    public static final int[] field84 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("q.p")
    public static int field85 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("q.w")
    public static int field86 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.i(I)V")
    public static void method2531() {
        field80 = 99;
        Statics.field675 = new byte[4][104][104];
        Statics.field2248 = new byte[4][104][104];
        Statics.field73 = new byte[4][104][104];
        Statics.field200 = new byte[4][104][104];
        Statics.field1388 = new int[4][105][105];
        Statics.field79 = new byte[4][105][105];
        Statics.field141 = new int[105][105];
        Statics.field185 = new int[104];
        Statics.field1397 = new int[104];
        Statics.field78 = new int[104];
        Statics.field3190 = new int[104];
        Statics.field1101 = new int[104];
    }

    @ObfuscatedName("cp.v(I)V")
    public static void method1949() {
        Statics.field675 = (byte[][][]) null;
        Statics.field2248 = (byte[][][]) null;
        Statics.field73 = (byte[][][]) null;
        Statics.field200 = (byte[][][]) null;
        Statics.field1388 = (int[][][]) null;
        Statics.field79 = (byte[][][]) null;
        Statics.field141 = (int[][]) null;
        Statics.field185 = null;
        Statics.field1397 = null;
        Statics.field78 = null;
        Statics.field3190 = null;
        Statics.field1101 = null;
    }

    @ObfuscatedName("df.r(IIIII)V")
    public static final void method2574(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field79[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field74[0][var5][var4] = field74[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field74[0][var5][var4] = field74[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field74[0][var5][var4] = field74[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field74[0][var5][var4] = field74[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.n([BIIII[Ldd;I)V")
    public static final void method46(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class108[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1882[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class119 var9 = new class119(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3657(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("dr.x([BIIIIIII[Ldd;I)V")
    public static final void method2265(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1882[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
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
                        method3657(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method3657(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hj.h(Ldx;IIIIIIB)V")
    public static final void method3657(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2380();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2380();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2380();
                }
            }
            return;
        }
        field76[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2380();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field74[0][arg2][arg3] = -method2645(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field74[arg1][arg2][arg3] = field74[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2380();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field74[0][arg2][arg3] = -var8 * 8;
                } else {
                    field74[arg1][arg2][arg3] = field74[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2248[arg1][arg2][arg3] = arg0.method2346();
                Statics.field73[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field200[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field76[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field675[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ax.c(IIIIIILco;Ldd;I)V")
    public static final void method846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field291 && (field76[0][arg1][arg2] & 0x2) == 0 && (field76[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field80) {
            field80 = arg0;
        }
        class41 var8 = class41.method1767(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field937;
            var10 = var8.field936;
        } else {
            var9 = var8.field936;
            var10 = var8.field937;
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
        int[][] var15 = field74[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field940 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field961 == 1) {
            var20 += 256;
        }
        if (var8.method810()) {
            class24 var21 = new class24();
            var21.field600 = arg0;
            var21.field602 = arg1 * 128;
            var21.field603 = arg2 * 128;
            int var22 = var8.field936;
            int var23 = var8.field937;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field937;
                var23 = var8.field936;
            }
            var21.field605 = (arg1 + var22) * 128;
            var21.field606 = (arg2 + var23) * 128;
            var21.field610 = var8.field965;
            var21.field619 = var8.field947 * 128;
            var21.field609 = var8.field967;
            var21.field607 = var8.field968;
            var21.field611 = var8.field920;
            if (var8.field962 != null) {
                var21.field620 = var8;
                var21.method589();
            }
            class24.field604.method3529(var21);
            if (var21.field611 != null) {
                var21.field612 = var21.field609 + (int) (Math.random() * (double) (var21.field607 - var21.field609));
            }
        }
        if (arg5 == 22) {
            if (!client.field291 || var8.field940 != 0 || var8.field938 == 1 || var8.field959) {
                class85 var24;
                if (var8.field944 == -1 && var8.field962 == null) {
                    var24 = var8.method805(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field944, true, (class85) null);
                }
                arg6.method1776(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field938 == 1 && arg7 != null) {
                    arg7.method2228(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field944 == -1 && var8.field962 == null) {
                var47 = var8.method805(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            if (var47 != null && arg6.method1895(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field924) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2155() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field79[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field79[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2231(arg1, arg2, var9, var10, var8.field939);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field944 == -1 && var8.field962 == null) {
                var25 = var8.method805(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1895(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1388[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2231(arg1, arg2, var9, var10, var8.field939);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field944 == -1 && var8.field962 == null) {
                var26 = var8.method805(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1778(arg0, arg1, arg2, var16, var26, (class85) null, field93[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field924) {
                    Statics.field79[arg0][arg1][arg2] = 50;
                    Statics.field79[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field928) {
                    Statics.field1388[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field924) {
                    Statics.field79[arg0][arg1][arg2 + 1] = 50;
                    Statics.field79[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field928) {
                    Statics.field1388[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field924) {
                    Statics.field79[arg0][arg1 + 1][arg2] = 50;
                    Statics.field79[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field928) {
                    Statics.field1388[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field924) {
                    Statics.field79[arg0][arg1][arg2] = 50;
                    Statics.field79[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field928) {
                    Statics.field1388[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2230(arg1, arg2, arg5, arg4, var8.field939);
            }
            if (var8.field943 != 16) {
                arg6.method1786(arg0, arg1, arg2, var8.field943);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field944 == -1 && var8.field962 == null) {
                var27 = var8.method805(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1778(arg0, arg1, arg2, var16, var27, (class85) null, field94[arg4], 0, var19, var20);
            if (var8.field924) {
                if (arg4 == 0) {
                    Statics.field79[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field79[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field79[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field79[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2230(arg1, arg2, arg5, arg4, var8.field939);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field944 == -1 && var8.field962 == null) {
                var29 = var8.method805(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method805(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field944, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1778(arg0, arg1, arg2, var16, var29, var30, field93[arg4], field93[var28], var19, var20);
            if (var8.field928) {
                if (arg4 == 0) {
                    Statics.field1388[arg0][arg1][arg2] |= 0x249;
                    Statics.field1388[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1388[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1388[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1388[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1388[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1388[arg0][arg1][arg2] |= 0x492;
                    Statics.field1388[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2230(arg1, arg2, arg5, arg4, var8.field939);
            }
            if (var8.field943 != 16) {
                arg6.method1786(arg0, arg1, arg2, var8.field943);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field944 == -1 && var8.field962 == null) {
                var31 = var8.method805(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1778(arg0, arg1, arg2, var16, var31, (class85) null, field94[arg4], 0, var19, var20);
            if (var8.field924) {
                if (arg4 == 0) {
                    Statics.field79[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field79[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field79[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field79[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2230(arg1, arg2, arg5, arg4, var8.field939);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field944 == -1 && var8.field962 == null) {
                var32 = var8.method805(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1895(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field938 != 0 && arg7 != null) {
                arg7.method2231(arg1, arg2, var9, var10, var8.field939);
            }
            if (var8.field943 != 16) {
                arg6.method1786(arg0, arg1, arg2, var8.field943);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field944 == -1 && var8.field962 == null) {
                var33 = var8.method805(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1779(arg0, arg1, arg2, var16, var33, (class85) null, field93[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1796(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method1767(var35 >> 14 & 0x7FFF).field943;
            }
            class85 var36;
            if (var8.field944 == -1 && var8.field962 == null) {
                var36 = var8.method805(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1779(arg0, arg1, arg2, var16, var36, (class85) null, field93[arg4], 0, field81[arg4] * var34, field82[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1796(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method1767(var38 >> 14 & 0x7FFF).field943 / 2;
            }
            class85 var39;
            if (var8.field944 == -1 && var8.field962 == null) {
                var39 = var8.method805(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1779(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field83[arg4] * var37, field84[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field944 == -1 && var8.field962 == null) {
                var41 = var8.method805(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1779(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1796(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method1767(var43 >> 14 & 0x7FFF).field943 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field944 == -1 && var8.field962 == null) {
                var45 = var8.method805(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method805(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field944, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field944, true, (class85) null);
            }
            arg6.method1779(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field83[arg4] * var42, field84[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("dm.m(III)I")
    public static final int method2645(int arg0, int arg1) {
        int var2 = method3154(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3154(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3154(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ft.e(IIII)I")
    public static final int method3154(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3180(var3, var5);
        int var8 = method3180(var3 + 1, var5);
        int var9 = method3180(var3, var5 + 1);
        int var10 = method3180(var3 + 1, var5 + 1);
        int var11 = method765(var7, var8, var4, arg2);
        int var12 = method765(var9, var10, var4, arg2);
        return method765(var11, var12, var6, arg2);
    }

    @ObfuscatedName("an.z(IIIII)I")
    public static final int method765(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class91.field1581[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("fr.t(III)I")
    public static final int method3180(int arg0, int arg1) {
        int var2 = Statics.method1268(arg0 - 1, arg1 - 1) + Statics.method1268(arg0 + 1, arg1 - 1) + Statics.method1268(arg0 - 1, arg1 + 1) + Statics.method1268(arg0 + 1, arg1 + 1);
        int var3 = Statics.method1268(arg0 - 1, arg1) + Statics.method1268(arg0 + 1, arg1) + Statics.method1268(arg0, arg1 - 1) + Statics.method1268(arg0, arg1 + 1);
        int var4 = Statics.method1268(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dt.l(III)I")
    public static final int method2275(int arg0, int arg1) {
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

    @ObfuscatedName("dt.s(IIB)I")
    public static final int method2271(int arg0, int arg1) {
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

    @ObfuscatedName("cj.f(IIII)I")
    public static final int method2022(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ac.g(III)Z")
    public static final boolean method740(int arg0, int arg1) {
        class41 var2 = class41.method1767(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method829(arg1);
    }
}
