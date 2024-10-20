package deob;

@ObfuscatedName("bo")
public final class class65 {

    @ObfuscatedName("bo.m")
    public static int[][][] field533 = new int[4][105][105];

    @ObfuscatedName("bo.o")
    public static byte[][][] field522 = new byte[4][104][104];

    @ObfuscatedName("bo.q")
    public static int field523 = 99;

    @ObfuscatedName("bo.d")
    public static final int[] field528 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bo.e")
    public static final int[] field529 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bo.l")
    public static final int[] field524 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bo.t")
    public static final int[] field530 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bo.x")
    public static final int[] field532 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bo.b")
    public static final int[] field534 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bo.i")
    public static int field536 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bo.f")
    public static int field521 = (int) (Math.random() * 33.0D) - 16;

    public class65() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ez.m(I)V")
    public static void method3094() {
        Statics.field531 = (byte[][][]) null;
        Statics.field525 = (byte[][][]) null;
        Statics.field526 = (byte[][][]) null;
        Statics.field270 = (byte[][][]) null;
        Statics.field1032 = (int[][][]) null;
        Statics.field2037 = (byte[][][]) null;
        Statics.field527 = (int[][]) null;
        Statics.field2015 = null;
        Statics.field103 = null;
        Statics.field1562 = null;
        Statics.field3118 = null;
        Statics.field199 = null;
    }

    @ObfuscatedName("s.o(IIIII)V")
    public static final void method124(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2037[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field533[0][var5][var4] = field533[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field533[0][var5][var4] = field533[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field533[0][var5][var4] = field533[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field533[0][var5][var4] = field533[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.q([BIIIIIII[Lfz;I)V")
    public static final void method1685(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class182[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2123[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class310 var11 = new class310(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class226.method2901(var13 & 0x7, var14 & 0x7, arg7);
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
                        method3913(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method3913(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ic.j(Lkn;IIIIIII)V")
    public static final void method3913(class310 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method5227();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method5227();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method5227();
                }
            }
            return;
        }
        field522[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5227();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field533[0][arg2][arg3] = -method3402(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field533[arg1][arg2][arg3] = field533[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method5227();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field533[0][arg2][arg3] = -var8 * 8;
                } else {
                    field533[arg1][arg2][arg3] = field533[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field525[arg1][arg2][arg3] = arg0.method5228();
                Statics.field526[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field270[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field522[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field531[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("im.p([BIII)Z")
    public static final boolean method3873(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class310 var4 = new class310(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method5242();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method5395();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method5227() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class264 var16 = class264.method752(var5);
                        if (var13 != 22 || !client.field675 || var16.field3400 != 0 || var16.field3386 == 1 || var16.field3419) {
                            if (!var16.method4356()) {
                                client.field691++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method5395();
                if (var9 == 0) {
                    break;
                }
                var4.method5227();
            }
        }
    }

    @ObfuscatedName("ap.g([BIILem;[Lfz;I)V")
    public static final void method443(byte[] arg0, int arg1, int arg2, class143 arg3, class182[] arg4) {
        class310 var5 = new class310(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method5242();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method5395();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method5227();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field522[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class182 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method546(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ab.n([BIIIIIIILem;[Lfz;I)V")
    public static final void method314(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class143 arg8, class182[] arg9) {
        class310 var10 = new class310(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method5242();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method5395();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method5227();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class264 var21 = class264.method752(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3396;
                    int var27 = var21.field3397;
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
                    int var33 = var16 & 0x7;
                    int var34 = var15 & 0x7;
                    int var36 = var21.field3396;
                    int var37 = var21.field3397;
                    if ((var20 & 0x1) == 1) {
                        int var38 = var36;
                        var36 = var37;
                        var37 = var38;
                    }
                    int var39 = arg7 & 0x3;
                    int var40;
                    if (var39 == 0) {
                        var40 = var34;
                    } else if (var39 == 1) {
                        var40 = 7 - var33 - (var36 - 1);
                    } else if (var39 == 2) {
                        var40 = 7 - var34 - (var37 - 1);
                    } else {
                        var40 = var33;
                    }
                    int var41 = arg3 + var40;
                    if (var31 > 0 && var41 > 0 && var31 < 103 && var41 < 103) {
                        int var42 = arg1;
                        if ((field522[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class182 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method546(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.u(IIIIIILem;Lfz;I)V")
    public static final void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class143 arg6, class182 arg7) {
        if (client.field675 && (field522[0][arg1][arg2] & 0x2) == 0 && (field522[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field523) {
            field523 = arg0;
        }
        class264 var8 = class264.method752(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3397;
            var10 = var8.field3396;
        } else {
            var9 = var8.field3396;
            var10 = var8.field3397;
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
        int[][] var15 = field533[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class138.method3462(arg1, arg2, 2, var8.field3400 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3421 == 1) {
            var21 += 256;
        }
        if (var8.method4364()) {
            class85.method3399(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field675 || var8.field3400 != 0 || var8.field3386 == 1 || var8.field3419) {
                class145 var22;
                if (var8.field3384 == -1 && var8.field3422 == null) {
                    var22 = var8.method4357(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class103(arg3, 22, arg4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
                }
                arg6.method2912(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3386 == 1 && arg7 != null) {
                    arg7.method3347(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class145 var48;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var48 = var8.method4357(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class103(arg3, 10, arg4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            if (var48 != null && arg6.method3070(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3412) {
                int var49 = 15;
                if (var48 instanceof class137) {
                    var49 = ((class137) var48).method2713() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field2037[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field2037[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3386 != 0 && arg7 != null) {
                arg7.method3336(arg1, arg2, var9, var10, var8.field3399);
            }
        } else if (arg5 >= 12) {
            class145 var23;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var23 = var8.method4357(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method3070(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1032[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3386 != 0 && arg7 != null) {
                arg7.method3336(arg1, arg2, var9, var10, var8.field3399);
            }
        } else if (arg5 == 0) {
            class145 var24;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var24 = var8.method4357(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class103(arg3, 0, arg4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method2914(arg0, arg1, arg2, var16, var24, (class145) null, field528[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3412) {
                    Statics.field2037[arg0][arg1][arg2] = 50;
                    Statics.field2037[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3403) {
                    Statics.field1032[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3412) {
                    Statics.field2037[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2037[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3403) {
                    Statics.field1032[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3412) {
                    Statics.field2037[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2037[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3403) {
                    Statics.field1032[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3412) {
                    Statics.field2037[arg0][arg1][arg2] = 50;
                    Statics.field2037[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3403) {
                    Statics.field1032[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3386 != 0 && arg7 != null) {
                arg7.method3335(arg1, arg2, arg5, arg4, var8.field3399);
            }
            if (var8.field3405 != 16) {
                arg6.method2922(arg0, arg1, arg2, var8.field3405);
            }
        } else if (arg5 == 1) {
            class145 var25;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var25 = var8.method4357(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class103(arg3, 1, arg4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method2914(arg0, arg1, arg2, var16, var25, (class145) null, field529[arg4], 0, var19, var21);
            if (var8.field3412) {
                if (arg4 == 0) {
                    Statics.field2037[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2037[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2037[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2037[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3386 != 0 && arg7 != null) {
                arg7.method3335(arg1, arg2, arg5, arg4, var8.field3399);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class145 var27;
            class145 var28;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var27 = var8.method4357(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4357(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class103(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
                var28 = new class103(arg3, 2, var26, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method2914(arg0, arg1, arg2, var16, var27, var28, field528[arg4], field528[var26], var19, var21);
            if (var8.field3403) {
                if (arg4 == 0) {
                    Statics.field1032[arg0][arg1][arg2] |= 0x249;
                    Statics.field1032[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1032[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1032[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1032[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1032[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1032[arg0][arg1][arg2] |= 0x492;
                    Statics.field1032[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3386 != 0 && arg7 != null) {
                arg7.method3335(arg1, arg2, arg5, arg4, var8.field3399);
            }
            if (var8.field3405 != 16) {
                arg6.method2922(arg0, arg1, arg2, var8.field3405);
            }
        } else if (arg5 == 3) {
            class145 var29;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var29 = var8.method4357(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class103(arg3, 3, arg4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method2914(arg0, arg1, arg2, var16, var29, (class145) null, field529[arg4], 0, var19, var21);
            if (var8.field3412) {
                if (arg4 == 0) {
                    Statics.field2037[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2037[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2037[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2037[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3386 != 0 && arg7 != null) {
                arg7.method3335(arg1, arg2, arg5, arg4, var8.field3399);
            }
        } else if (arg5 == 9) {
            class145 var30;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var30 = var8.method4357(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method3070(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3386 != 0 && arg7 != null) {
                arg7.method3336(arg1, arg2, var9, var10, var8.field3399);
            }
            if (var8.field3405 != 16) {
                arg6.method2922(arg0, arg1, arg2, var8.field3405);
            }
        } else if (arg5 == 4) {
            class145 var31;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var31 = var8.method4357(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method3068(arg0, arg1, arg2, var16, var31, (class145) null, field528[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3084(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class264.method752(class138.method3443(var33)).field3405;
            }
            class145 var35;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var35 = var8.method4357(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method3068(arg0, arg1, arg2, var16, var35, (class145) null, field528[arg4], 0, field524[arg4] * var32, field530[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3084(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class264.method752(class138.method3443(var37)).field3405 / 2;
            }
            class145 var39;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var39 = var8.method4357(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method3068(arg0, arg1, arg2, var16, var39, (class145) null, 256, arg4, field532[arg4] * var36, field534[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class145 var41;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var41 = var8.method4357(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class103(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method3068(arg0, arg1, arg2, var16, var41, (class145) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3084(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class264.method752(class138.method3443(var43)).field3405 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class145 var46;
            class145 var47;
            if (var8.field3384 == -1 && var8.field3422 == null) {
                var46 = var8.method4357(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4357(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
                var47 = new class103(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3384, true, (class145) null);
            }
            arg6.method3068(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field532[arg4] * var42, field534[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("gj.a(III)I")
    public static final int method3402(int arg0, int arg1) {
        int var2 = method4265(arg0 + 45365, arg1 + 91923, 4) - 128 + (method4265(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method4265(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("iv.z(IIII)I")
    public static final int method4265(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2128(var3, var5);
        int var8 = method2128(var3 + 1, var5);
        int var9 = method2128(var3, var5 + 1);
        int var10 = method2128(var3 + 1, var5 + 1);
        int var11 = 65536 - class140.field1813[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class140.field1813[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class140.field1813[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("cx.w(III)I")
    public static final int method2128(int arg0, int arg1) {
        int var2 = method1720(arg0 - 1, arg1 - 1) + method1720(arg0 + 1, arg1 - 1) + method1720(arg0 - 1, arg1 + 1) + method1720(arg0 + 1, arg1 + 1);
        int var3 = method1720(arg0 - 1, arg1) + method1720(arg0 + 1, arg1) + method1720(arg0, arg1 - 1) + method1720(arg0, arg1 + 1);
        int var4 = method1720(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cz.y(IIB)I")
    public static final int method1720(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("id.c(III)I")
    public static final int method3874(int arg0, int arg1) {
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

    @ObfuscatedName("dw.h(III)I")
    public static final int method2187(int arg0, int arg1) {
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

    @ObfuscatedName("be.k(IIII)I")
    public static final int method748(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("u.r(IIS)Z")
    public static final boolean method73(int arg0, int arg1) {
        class264 var2 = class264.method752(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4355(arg1);
    }
}
