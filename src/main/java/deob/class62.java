package deob;

@ObfuscatedName("bs")
public final class class62 {

    @ObfuscatedName("bs.n")
    public static int[][][] field748 = new int[4][105][105];

    @ObfuscatedName("bs.p")
    public static byte[][][] field737 = new byte[4][104][104];

    @ObfuscatedName("bs.i")
    public static int field738 = 99;

    @ObfuscatedName("bs.v")
    public static final int[] field745 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bs.t")
    public static final int[] field746 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bs.w")
    public static final int[] field747 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bs.l")
    public static final int[] field753 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bs.q")
    public static final int[] field739 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bs.k")
    public static final int[] field750 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bs.d")
    public static int field751 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bs.u")
    public static int field736 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.n(I)V")
    public static void method156() {
        field738 = 99;
        Statics.field3212 = new byte[4][104][104];
        Statics.field740 = new byte[4][104][104];
        Statics.field352 = new byte[4][104][104];
        Statics.field755 = new byte[4][104][104];
        Statics.field644 = new int[4][105][105];
        Statics.field262 = new byte[4][105][105];
        Statics.field741 = new int[105][105];
        Statics.field2264 = new int[104];
        Statics.field742 = new int[104];
        Statics.field743 = new int[104];
        Statics.field570 = new int[104];
        Statics.field744 = new int[104];
    }

    @ObfuscatedName("d.p(IIIII)V")
    public static final void method192(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field262[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field748[0][var5][var4] = field748[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field748[0][var5][var4] = field748[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field748[0][var5][var4] = field748[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field748[0][var5][var4] = field748[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.i([BIIII[Lfo;B)V")
    public static final void method15(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class162[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2308[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class174 var9 = new class174(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1452(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ar.j([BIIIIIII[Lfo;I)V")
    public static final void method616(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2308[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class174 var11 = new class174(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method1452(var11, arg1, arg2 + class216.method2840(var13 & 0x7, var14 & 0x7, arg7), arg3 + class216.method999(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1452(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cw.f(Lfl;IIIIIII)V")
    public static final void method1452(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2925();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2925();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2925();
                }
            }
            return;
        }
        field737[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2925();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field748[0][arg2][arg3] = -method1900(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field748[arg1][arg2][arg3] = field748[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2925();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field748[0][arg2][arg3] = -var8 * 8;
                } else {
                    field748[arg1][arg2][arg3] = field748[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field740[arg1][arg2][arg3] = arg0.method2922();
                Statics.field352[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field755[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field737[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field3212[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("k.m(IIIIIILea;Lfo;I)V")
    public static final void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class140 arg6, class162 arg7) {
        if (client.field919 && (field737[0][arg1][arg2] & 0x2) == 0 && (field737[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field738) {
            field738 = arg0;
        }
        class256 var8 = class256.method937(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3446;
            var10 = var8.field3458;
        } else {
            var9 = var8.field3458;
            var10 = var8.field3446;
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
        int[][] var15 = field748[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3465 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3483 == 1) {
            var20 += 256;
        }
        if (var8.method4241()) {
            class83 var21 = new class83();
            var21.field1324 = arg0;
            var21.field1323 = arg1 * 128;
            var21.field1327 = arg2 * 128;
            int var22 = var8.field3458;
            int var23 = var8.field3446;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3446;
                var23 = var8.field3458;
            }
            var21.field1328 = (arg1 + var22) * 128;
            var21.field1335 = (arg2 + var23) * 128;
            var21.field1330 = var8.field3487;
            var21.field1329 = var8.field3488 * 128;
            var21.field1332 = var8.field3489;
            var21.field1333 = var8.field3490;
            var21.field1334 = var8.field3480;
            if (var8.field3484 != null) {
                var21.field1337 = var8;
                var21.method1465();
            }
            class83.field1326.method3384(var21);
            if (var21.field1334 != null) {
                var21.field1325 = var21.field1332 + (int) (Math.random() * (double) (var21.field1333 - var21.field1332));
            }
        }
        if (arg5 == 22) {
            if (!client.field919 || var8.field3465 != 0 || var8.field3460 == 1 || var8.field3477) {
                class142 var24;
                if (var8.field3466 == -1 && var8.field3484 == null) {
                    var24 = var8.method4252(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class101(arg3, 22, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
                }
                arg6.method2490(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3460 == 1 && arg7 != null) {
                    arg7.method2803(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class142 var47;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var47 = var8.method4252(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class101(arg3, 10, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            if (var47 != null && arg6.method2494(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3457) {
                int var48 = 15;
                if (var47 instanceof class134) {
                    var48 = ((class134) var47).method2326() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field262[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field262[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3460 != 0 && arg7 != null) {
                arg7.method2784(arg1, arg2, var9, var10, var8.field3461);
            }
        } else if (arg5 >= 12) {
            class142 var25;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var25 = var8.method4252(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2494(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field644[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3460 != 0 && arg7 != null) {
                arg7.method2784(arg1, arg2, var9, var10, var8.field3461);
            }
        } else if (arg5 == 0) {
            class142 var26;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var26 = var8.method4252(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class101(arg3, 0, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2492(arg0, arg1, arg2, var16, var26, (class142) null, field745[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3457) {
                    Statics.field262[arg0][arg1][arg2] = 50;
                    Statics.field262[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3454) {
                    Statics.field644[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3457) {
                    Statics.field262[arg0][arg1][arg2 + 1] = 50;
                    Statics.field262[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3454) {
                    Statics.field644[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3457) {
                    Statics.field262[arg0][arg1 + 1][arg2] = 50;
                    Statics.field262[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3454) {
                    Statics.field644[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3457) {
                    Statics.field262[arg0][arg1][arg2] = 50;
                    Statics.field262[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3454) {
                    Statics.field644[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3460 != 0 && arg7 != null) {
                arg7.method2786(arg1, arg2, arg5, arg4, var8.field3461);
            }
            if (var8.field3467 != 16) {
                arg6.method2659(arg0, arg1, arg2, var8.field3467);
            }
        } else if (arg5 == 1) {
            class142 var27;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var27 = var8.method4252(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class101(arg3, 1, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2492(arg0, arg1, arg2, var16, var27, (class142) null, field746[arg4], 0, var19, var20);
            if (var8.field3457) {
                if (arg4 == 0) {
                    Statics.field262[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field262[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field262[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field262[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3460 != 0 && arg7 != null) {
                arg7.method2786(arg1, arg2, arg5, arg4, var8.field3461);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class142 var29;
            class142 var30;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var29 = var8.method4252(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4252(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class101(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
                var30 = new class101(arg3, 2, var28, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2492(arg0, arg1, arg2, var16, var29, var30, field745[arg4], field745[var28], var19, var20);
            if (var8.field3454) {
                if (arg4 == 0) {
                    Statics.field644[arg0][arg1][arg2] |= 0x249;
                    Statics.field644[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field644[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field644[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field644[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field644[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field644[arg0][arg1][arg2] |= 0x492;
                    Statics.field644[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3460 != 0 && arg7 != null) {
                arg7.method2786(arg1, arg2, arg5, arg4, var8.field3461);
            }
            if (var8.field3467 != 16) {
                arg6.method2659(arg0, arg1, arg2, var8.field3467);
            }
        } else if (arg5 == 3) {
            class142 var31;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var31 = var8.method4252(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class101(arg3, 3, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2492(arg0, arg1, arg2, var16, var31, (class142) null, field746[arg4], 0, var19, var20);
            if (var8.field3457) {
                if (arg4 == 0) {
                    Statics.field262[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field262[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field262[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field262[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3460 != 0 && arg7 != null) {
                arg7.method2786(arg1, arg2, arg5, arg4, var8.field3461);
            }
        } else if (arg5 == 9) {
            class142 var32;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var32 = var8.method4252(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2494(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3460 != 0 && arg7 != null) {
                arg7.method2784(arg1, arg2, var9, var10, var8.field3461);
            }
            if (var8.field3467 != 16) {
                arg6.method2659(arg0, arg1, arg2, var8.field3467);
            }
        } else if (arg5 == 4) {
            class142 var33;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var33 = var8.method4252(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2493(arg0, arg1, arg2, var16, var33, (class142) null, field745[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2510(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class256.method937(var35 >> 14 & 0x7FFF).field3467;
            }
            class142 var36;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var36 = var8.method4252(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2493(arg0, arg1, arg2, var16, var36, (class142) null, field745[arg4], 0, field747[arg4] * var34, field753[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2510(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class256.method937(var38 >> 14 & 0x7FFF).field3467 / 2;
            }
            class142 var39;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var39 = var8.method4252(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2493(arg0, arg1, arg2, var16, var39, (class142) null, 256, arg4, field739[arg4] * var37, field750[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class142 var41;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var41 = var8.method4252(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class101(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2493(arg0, arg1, arg2, var16, var41, (class142) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2510(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class256.method937(var43 >> 14 & 0x7FFF).field3467 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class142 var45;
            class142 var46;
            if (var8.field3466 == -1 && var8.field3484 == null) {
                var45 = var8.method4252(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4252(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
                var46 = new class101(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3466, true, (class142) null);
            }
            arg6.method2493(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field739[arg4] * var42, field750[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("k.c(Lea;[Lfo;I)V")
    public static final void method179(class140 arg0, class162[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field737[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field737[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2785(var3, var4);
                        }
                    }
                }
            }
        }
        field751 += (int) (Math.random() * 5.0D) - 2;
        if (field751 < -8) {
            field751 = -8;
        }
        if (field751 > 8) {
            field751 = 8;
        }
        field736 += (int) (Math.random() * 5.0D) - 2;
        if (field736 < -16) {
            field736 = -16;
        }
        if (field736 > 16) {
            field736 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field262[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field748[var6][var11 + 1][var10] - field748[var6][var11 - 1][var10];
                    int var13 = field748[var6][var11][var10 + 1] - field748[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field741[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field2264[var20] = 0;
                Statics.field742[var20] = 0;
                Statics.field743[var20] = 0;
                Statics.field570[var20] = 0;
                Statics.field744[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field3212[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class247 var25 = class247.method2819(var24 - 1);
                            Statics.field2264[var22] += var25.field3347;
                            Statics.field742[var22] += var25.field3348;
                            Statics.field743[var22] += var25.field3349;
                            Statics.field570[var22] += var25.field3350;
                            var10002 = Statics.field744[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field3212[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class247 var28 = class247.method2819(var27 - 1);
                            Statics.field2264[var22] -= var28.field3347;
                            Statics.field742[var22] -= var28.field3348;
                            Statics.field743[var22] -= var28.field3349;
                            Statics.field570[var22] -= var28.field3350;
                            var10002 = Statics.field744[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var29 = 0;
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = 0;
                    for (int var34 = -5; var34 < 109; var34++) {
                        int var35 = var34 + 5;
                        if (var35 >= 0 && var35 < 104) {
                            var29 += Statics.field2264[var35];
                            var30 += Statics.field742[var35];
                            var31 += Statics.field743[var35];
                            var32 += Statics.field570[var35];
                            var33 += Statics.field744[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field2264[var36];
                            var30 -= Statics.field742[var36];
                            var31 -= Statics.field743[var36];
                            var32 -= Statics.field570[var36];
                            var33 -= Statics.field744[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field919 || (field737[0][var21][var34] & 0x2) != 0 || (field737[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field738) {
                                field738 = var6;
                            }
                            int var37 = Statics.field3212[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field740[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field748[var6][var21][var34];
                                int var40 = field748[var6][var21 + 1][var34];
                                int var41 = field748[var6][var21 + 1][var34 + 1];
                                int var42 = field748[var6][var21][var34 + 1];
                                int var43 = Statics.field741[var21][var34];
                                int var44 = Statics.field741[var21 + 1][var34];
                                int var45 = Statics.field741[var21 + 1][var34 + 1];
                                int var46 = Statics.field741[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method1004(var49, var50, var51);
                                    int var52 = field751 + var49 & 0xFF;
                                    int var53 = field736 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method1004(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field352[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class260.method18(var38 - 1).field3598) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field644[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class137.field2024[method102(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2489(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method102(var47, var43), method102(var47, var44), method102(var47, var45), method102(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field352[var6][var21][var34] + 1;
                                    byte var57 = Statics.field755[var6][var21][var34];
                                    class260 var58 = class260.method18(var38 - 1);
                                    int var59 = var58.field3600;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field2040.method2199(var59);
                                        var61 = -1;
                                    } else if (var58.field3604 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method1004(var58.field3602, var58.field3603, var58.field3596);
                                        int var62 = field751 + var58.field3602 & 0xFF;
                                        int var63 = field736 + var58.field3596;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method1004(var62, var58.field3603, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class137.field2024[method595(var60, 96)];
                                    }
                                    if (var58.field3601 != -1) {
                                        int var65 = field751 + var58.field3605 & 0xFF;
                                        int var66 = field736 + var58.field3607;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method1004(var65, var58.field3606, var66);
                                        var64 = class137.field2024[method595(var67, 96)];
                                    }
                                    arg0.method2489(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method102(var47, var43), method102(var47, var44), method102(var47, var45), method102(var47, var46), method595(var61, var43), method595(var61, var44), method595(var61, var45), method595(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method2488(var6, var69, var68, method254(var6, var69, var68));
                }
            }
            Statics.field3212[var6] = (byte[][]) null;
            Statics.field740[var6] = (byte[][]) null;
            Statics.field352[var6] = (byte[][]) null;
            Statics.field755[var6] = (byte[][]) null;
            Statics.field262[var6] = (byte[][]) null;
        }
        arg0.method2515(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field737[1][var70][var71] & 0x2) == 2) {
                    arg0.method2486(var70, var71);
                }
            }
        }
        int var72 = 1;
        int var73 = 2;
        int var74 = 4;
        for (int var75 = 0; var75 < 4; var75++) {
            if (var75 > 0) {
                var72 <<= 0x3;
                var73 <<= 0x3;
                var74 <<= 0x3;
            }
            for (int var76 = 0; var76 <= var75; var76++) {
                for (int var77 = 0; var77 <= 104; var77++) {
                    for (int var78 = 0; var78 <= 104; var78++) {
                        if ((Statics.field644[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field644[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field644[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label337: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field644[var81 - 1][var78][var83] & var72) == 0) {
                                        break label337;
                                    }
                                }
                                var81--;
                            }
                            label326: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field644[var82 + 1][var78][var84] & var72) == 0) {
                                        break label326;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field748[var82][var78][var79] - var86;
                                int var88 = field748[var81][var78][var79];
                                class140.method2524(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field644[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field644[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field644[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field644[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label390: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field644[var93 - 1][var95][var77] & var73) == 0) {
                                        break label390;
                                    }
                                }
                                var93--;
                            }
                            label379: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field644[var94 + 1][var96][var77] & var73) == 0) {
                                        break label379;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field748[var94][var91][var77] - var98;
                                int var100 = field748[var93][var91][var77];
                                class140.method2524(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field644[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field644[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field644[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field644[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label443: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field644[var76][var103 - 1][var107] & var74) == 0) {
                                        break label443;
                                    }
                                }
                                var103--;
                            }
                            label432: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field644[var76][var104 + 1][var108] & var74) == 0) {
                                        break label432;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field748[var76][var103][var105];
                                class140.method2524(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field644[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.z(IIIS)I")
    public static int method254(int arg0, int arg1, int arg2) {
        if ((field737[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field737[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dn.h(III)I")
    public static final int method1900(int arg0, int arg1) {
        int var2 = method4454(arg0 + 45365, arg1 + 91923, 4) - 128 + (method4454(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method4454(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("jj.g(IIII)I")
    public static final int method4454(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1612(var3, var5);
        int var8 = method1612(var3 + 1, var5);
        int var9 = method1612(var3, var5 + 1);
        int var10 = method1612(var3 + 1, var5 + 1);
        int var11 = method490(var7, var8, var4, arg2);
        int var12 = method490(var9, var10, var4, arg2);
        return method490(var11, var12, var6, arg2);
    }

    @ObfuscatedName("am.e(IIIII)I")
    public static final int method490(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class137.field2044[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("cc.o(III)I")
    public static final int method1612(int arg0, int arg1) {
        int var2 = method3800(arg0 - 1, arg1 - 1) + method3800(arg0 + 1, arg1 - 1) + method3800(arg0 - 1, arg1 + 1) + method3800(arg0 + 1, arg1 + 1);
        int var3 = method3800(arg0 - 1, arg1) + method3800(arg0 + 1, arg1) + method3800(arg0, arg1 - 1) + method3800(arg0, arg1 + 1);
        int var4 = method3800(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("hz.x(III)I")
    public static final int method3800(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("r.a(III)I")
    public static final int method102(int arg0, int arg1) {
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

    @ObfuscatedName("ar.y(III)I")
    public static final int method595(int arg0, int arg1) {
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

    @ObfuscatedName("bk.r(IIII)I")
    public static final int method1004(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("d.b(IIB)Z")
    public static final boolean method191(int arg0, int arg1) {
        class256 var2 = class256.method937(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4232(arg1);
    }
}
