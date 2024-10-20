package deob;

@ObfuscatedName("aj")
public final class class51 {

    @ObfuscatedName("aj.y")
    public static int[][][] field501 = new int[4][105][105];

    @ObfuscatedName("aj.c")
    public static byte[][][] field488 = new byte[4][104][104];

    @ObfuscatedName("aj.n")
    public static int field489 = 99;

    @ObfuscatedName("aj.x")
    public static final int[] field495 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("aj.b")
    public static final int[] field494 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("aj.w")
    public static final int[] field497 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("aj.g")
    public static final int[] field498 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("aj.d")
    public static final int[] field499 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("aj.m")
    public static final int[] field500 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("aj.t")
    public static int field504 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("aj.h")
    public static int field491 = (int) (Math.random() * 33.0D) - 16;

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hx.y(B)V")
    public static void method4121() {
        field489 = 99;
        Statics.field485 = new byte[4][104][104];
        Statics.field490 = new byte[4][104][104];
        Statics.field1848 = new byte[4][104][104];
        Statics.field502 = new byte[4][104][104];
        Statics.field3865 = new int[4][105][105];
        Statics.field492 = new byte[4][105][105];
        Statics.field493 = new int[105][105];
        Statics.field487 = new int[104];
        Statics.field334 = new int[104];
        Statics.field1103 = new int[104];
        Statics.field2081 = new int[104];
        Statics.field2001 = new int[104];
    }

    @ObfuscatedName("e.c(B)V")
    public static void method92() {
        Statics.field485 = (byte[][][]) null;
        Statics.field490 = (byte[][][]) null;
        Statics.field1848 = (byte[][][]) null;
        Statics.field502 = (byte[][][]) null;
        Statics.field3865 = (int[][][]) null;
        Statics.field492 = (byte[][][]) null;
        Statics.field493 = (int[][]) null;
        Statics.field487 = null;
        Statics.field334 = null;
        Statics.field1103 = null;
        Statics.field2081 = null;
        Statics.field2001 = null;
    }

    @ObfuscatedName("kw.n(IIIIB)V")
    public static final void method5124(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field492[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field501[0][var5][var4] = field501[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field501[0][var5][var4] = field501[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field501[0][var5][var4] = field501[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field501[0][var5][var4] = field501[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.u([BIIIIIII[Lfw;B)V")
    public static final void method429(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2071[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class185 var11 = new class185(arg0);
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
                        method76(var11, arg1, arg2 + var22, arg3 + class232.method3881(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method76(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.i(Lge;IIIIIII)V")
    public static final void method76(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3299();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3299();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3299();
                }
            }
            return;
        }
        field488[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3299();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field501[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method1779(var10 + 45365, var11 + 91923, 4) - 128 + (method1779(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method1779(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field501[arg1][arg2][arg3] = field501[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3299();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field501[0][arg2][arg3] = -var15 * 8;
                } else {
                    field501[arg1][arg2][arg3] = field501[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field490[arg1][arg2][arg3] = arg0.method3319();
                Statics.field1848[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field502[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field488[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field485[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bw.p([BIIIIIIILdb;[Lfw;B)V")
    public static final void method1693(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class128 arg8, class167[] arg9) {
        class185 var10 = new class185(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3282();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3356();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3299();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class271 var21 = class271.method3187(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3437;
                    int var27 = var21.field3438;
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
                    int var36 = var21.field3437;
                    int var37 = var21.field3438;
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
                        if ((field488[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class167 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method436(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.e(IIIIIILdb;Lfw;I)V")
    public static final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class128 arg6, class167 arg7) {
        if (client.field631 && (field488[0][arg1][arg2] & 0x2) == 0 && (field488[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field489) {
            field489 = arg0;
        }
        class271 var8 = class271.method3187(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3438;
            var10 = var8.field3437;
        } else {
            var9 = var8.field3437;
            var10 = var8.field3438;
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
        int[][] var15 = field501[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class123.method4240(arg1, arg2, 2, var8.field3468 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3465 == 1) {
            var21 += 256;
        }
        if (var8.method4685()) {
            class70.method2864(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field631 || var8.field3468 != 0 || var8.field3433 == 1 || var8.field3460) {
                class130 var22;
                if (var8.field3445 == -1 && var8.field3439 == null) {
                    var22 = var8.method4723(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class88(arg3, 22, arg4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
                }
                arg6.method2678(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3433 == 1 && arg7 != null) {
                    arg7.method3118(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class130 var48;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var48 = var8.method4723(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class88(arg3, 10, arg4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            if (var48 != null && arg6.method2828(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3451) {
                int var49 = 15;
                if (var48 instanceof class122) {
                    var49 = ((class122) var48).method2475() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field492[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field492[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3433 != 0 && arg7 != null) {
                arg7.method3147(arg1, arg2, var9, var10, var8.field3440);
            }
        } else if (arg5 >= 12) {
            class130 var23;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var23 = var8.method4723(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2828(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3865[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3433 != 0 && arg7 != null) {
                arg7.method3147(arg1, arg2, var9, var10, var8.field3440);
            }
        } else if (arg5 == 0) {
            class130 var24;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var24 = var8.method4723(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class88(arg3, 0, arg4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2680(arg0, arg1, arg2, var16, var24, (class130) null, field495[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3451) {
                    Statics.field492[arg0][arg1][arg2] = 50;
                    Statics.field492[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3444) {
                    Statics.field3865[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3451) {
                    Statics.field492[arg0][arg1][arg2 + 1] = 50;
                    Statics.field492[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3444) {
                    Statics.field3865[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3451) {
                    Statics.field492[arg0][arg1 + 1][arg2] = 50;
                    Statics.field492[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3444) {
                    Statics.field3865[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3451) {
                    Statics.field492[arg0][arg1][arg2] = 50;
                    Statics.field492[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3444) {
                    Statics.field3865[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3433 != 0 && arg7 != null) {
                arg7.method3144(arg1, arg2, arg5, arg4, var8.field3440);
            }
            if (var8.field3446 != 16) {
                arg6.method2770(arg0, arg1, arg2, var8.field3446);
            }
        } else if (arg5 == 1) {
            class130 var25;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var25 = var8.method4723(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class88(arg3, 1, arg4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2680(arg0, arg1, arg2, var16, var25, (class130) null, field494[arg4], 0, var19, var21);
            if (var8.field3451) {
                if (arg4 == 0) {
                    Statics.field492[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field492[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field492[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field492[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3433 != 0 && arg7 != null) {
                arg7.method3144(arg1, arg2, arg5, arg4, var8.field3440);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class130 var27;
            class130 var28;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var27 = var8.method4723(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4723(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class88(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
                var28 = new class88(arg3, 2, var26, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2680(arg0, arg1, arg2, var16, var27, var28, field495[arg4], field495[var26], var19, var21);
            if (var8.field3444) {
                if (arg4 == 0) {
                    Statics.field3865[arg0][arg1][arg2] |= 0x249;
                    Statics.field3865[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3865[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3865[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3865[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3865[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3865[arg0][arg1][arg2] |= 0x492;
                    Statics.field3865[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3433 != 0 && arg7 != null) {
                arg7.method3144(arg1, arg2, arg5, arg4, var8.field3440);
            }
            if (var8.field3446 != 16) {
                arg6.method2770(arg0, arg1, arg2, var8.field3446);
            }
        } else if (arg5 == 3) {
            class130 var29;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var29 = var8.method4723(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class88(arg3, 3, arg4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2680(arg0, arg1, arg2, var16, var29, (class130) null, field494[arg4], 0, var19, var21);
            if (var8.field3451) {
                if (arg4 == 0) {
                    Statics.field492[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field492[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field492[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field492[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3433 != 0 && arg7 != null) {
                arg7.method3144(arg1, arg2, arg5, arg4, var8.field3440);
            }
        } else if (arg5 == 9) {
            class130 var30;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var30 = var8.method4723(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2828(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3433 != 0 && arg7 != null) {
                arg7.method3147(arg1, arg2, var9, var10, var8.field3440);
            }
            if (var8.field3446 != 16) {
                arg6.method2770(arg0, arg1, arg2, var8.field3446);
            }
        } else if (arg5 == 4) {
            class130 var31;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var31 = var8.method4723(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2783(arg0, arg1, arg2, var16, var31, (class130) null, field495[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2698(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class271.method3187(class123.method4726(var33)).field3446;
            }
            class130 var35;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var35 = var8.method4723(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2783(arg0, arg1, arg2, var16, var35, (class130) null, field495[arg4], 0, field497[arg4] * var32, field498[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2698(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class271.method3187(class123.method4726(var37)).field3446 / 2;
            }
            class130 var39;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var39 = var8.method4723(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2783(arg0, arg1, arg2, var16, var39, (class130) null, 256, arg4, field499[arg4] * var36, field500[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class130 var41;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var41 = var8.method4723(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class88(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2783(arg0, arg1, arg2, var16, var41, (class130) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2698(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class271.method3187(class123.method4726(var43)).field3446 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class130 var46;
            class130 var47;
            if (var8.field3445 == -1 && var8.field3439 == null) {
                var46 = var8.method4723(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4723(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
                var47 = new class88(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3445, true, (class130) null);
            }
            arg6.method2783(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field499[arg4] * var42, field500[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("cq.s(IIIB)I")
    public static final int method1779(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method645(var3, var5);
        int var8 = method645(var3 + 1, var5);
        int var9 = method645(var3, var5 + 1);
        int var10 = method645(var3 + 1, var5 + 1);
        int var11 = method3099(var7, var8, var4, arg2);
        int var12 = method3099(var9, var10, var4, arg2);
        return method3099(var11, var12, var6, arg2);
    }

    @ObfuscatedName("fa.v(IIIII)I")
    public static final int method3099(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class125.field1748[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ac.k(III)I")
    public static final int method645(int arg0, int arg1) {
        int var2 = Statics.method1884(arg0 - 1, arg1 - 1) + Statics.method1884(arg0 + 1, arg1 - 1) + Statics.method1884(arg0 - 1, arg1 + 1) + Statics.method1884(arg0 + 1, arg1 + 1);
        int var3 = Statics.method1884(arg0 - 1, arg1) + Statics.method1884(arg0 + 1, arg1) + Statics.method1884(arg0, arg1 - 1) + Statics.method1884(arg0, arg1 + 1);
        int var4 = Statics.method1884(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ac.q(III)I")
    public static final int method646(int arg0, int arg1) {
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

    @ObfuscatedName("aw.l(III)I")
    public static final int method628(int arg0, int arg1) {
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

    @ObfuscatedName("d.f(IIII)I")
    public static final int method278(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("az.z(III)Z")
    public static final boolean method664(int arg0, int arg1) {
        class271 var2 = class271.method3187(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4683(arg1);
    }

    @ObfuscatedName("u.a(IIIIIIILdb;Lfw;S)V")
    public static final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class128 arg7, class167 arg8) {
        class271 var9 = class271.method3187(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3438;
            var11 = var9.field3437;
        } else {
            var10 = var9.field3437;
            var11 = var9.field3438;
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
        int[][] var16 = field501[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class123.method4240(arg2, arg3, 2, var9.field3468 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3465 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class130 var23;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var23 = var9.method4708(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class88(arg4, 22, arg5, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2678(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3433 == 1) {
                arg8.method3118(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class130 var49;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var49 = var9.method4708(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class88(arg4, 10, arg5, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            if (var49 != null) {
                arg7.method2828(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3433 != 0) {
                arg8.method3147(arg2, arg3, var10, var11, var9.field3440);
            }
        } else if (arg6 >= 12) {
            class130 var24;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var24 = var9.method4708(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2828(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3433 != 0) {
                arg8.method3147(arg2, arg3, var10, var11, var9.field3440);
            }
        } else if (arg6 == 0) {
            class130 var25;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var25 = var9.method4708(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class88(arg4, 0, arg5, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2680(arg0, arg2, arg3, var17, var25, (class130) null, field495[arg5], 0, var20, var22);
            if (var9.field3433 != 0) {
                arg8.method3144(arg2, arg3, arg6, arg5, var9.field3440);
            }
        } else if (arg6 == 1) {
            class130 var26;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var26 = var9.method4708(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class88(arg4, 1, arg5, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2680(arg0, arg2, arg3, var17, var26, (class130) null, field494[arg5], 0, var20, var22);
            if (var9.field3433 != 0) {
                arg8.method3144(arg2, arg3, arg6, arg5, var9.field3440);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class130 var28;
            class130 var29;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var28 = var9.method4708(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4708(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class88(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3445, true, (class130) null);
                var29 = new class88(arg4, 2, var27, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2680(arg0, arg2, arg3, var17, var28, var29, field495[arg5], field495[var27], var20, var22);
            if (var9.field3433 != 0) {
                arg8.method3144(arg2, arg3, arg6, arg5, var9.field3440);
            }
        } else if (arg6 == 3) {
            class130 var30;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var30 = var9.method4708(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class88(arg4, 3, arg5, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2680(arg0, arg2, arg3, var17, var30, (class130) null, field494[arg5], 0, var20, var22);
            if (var9.field3433 != 0) {
                arg8.method3144(arg2, arg3, arg6, arg5, var9.field3440);
            }
        } else if (arg6 == 9) {
            class130 var31;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var31 = var9.method4708(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2828(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3433 != 0) {
                arg8.method3147(arg2, arg3, var10, var11, var9.field3440);
            }
        } else if (arg6 == 4) {
            class130 var32;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var32 = var9.method4708(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2783(arg0, arg2, arg3, var17, var32, (class130) null, field495[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2698(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class271.method3187(class123.method4726(var34)).field3446;
            }
            class130 var36;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var36 = var9.method4708(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2783(arg0, arg2, arg3, var17, var36, (class130) null, field495[arg5], 0, field497[arg5] * var33, field498[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2698(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class271.method3187(class123.method4726(var38)).field3446 / 2;
            }
            class130 var40;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var40 = var9.method4708(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2783(arg0, arg2, arg3, var17, var40, (class130) null, 256, arg5, field499[arg5] * var37, field500[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class130 var42;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var42 = var9.method4708(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class88(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2783(arg0, arg2, arg3, var17, var42, (class130) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2698(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class271.method3187(class123.method4726(var44)).field3446 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class130 var47;
            class130 var48;
            if (var9.field3445 == -1 && var9.field3439 == null) {
                var47 = var9.method4708(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4708(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3445, true, (class130) null);
                var48 = new class88(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3445, true, (class130) null);
            }
            arg7.method2783(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field499[arg5] * var43, field500[arg5] * var43, var20, var22);
        }
    }
}
