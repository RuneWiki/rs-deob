package deob;

@ObfuscatedName("au")
public final class class51 {

    @ObfuscatedName("au.g")
    public static int[][][] field507 = new int[4][105][105];

    @ObfuscatedName("au.r")
    public static byte[][][] field493 = new byte[4][104][104];

    @ObfuscatedName("au.e")
    public static int field494 = 99;

    @ObfuscatedName("au.a")
    public static final int[] field492 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("au.t")
    public static final int[] field500 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("au.k")
    public static final int[] field498 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("au.z")
    public static final int[] field502 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("au.s")
    public static final int[] field503 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("au.y")
    public static final int[] field508 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("au.u")
    public static int field505 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("au.o")
    public static int field499 = (int) (Math.random() * 33.0D) - 16;

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.g(IIIII)V")
    public static final void method3427(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field504[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field507[0][var5][var4] = field507[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field507[0][var5][var4] = field507[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field507[0][var5][var4] = field507[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field507[0][var5][var4] = field507[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ja.r([BIIIIIII[Lfn;B)V")
    public static final void method4737(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2102[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
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
                        method2851(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method2851(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.e(Lgl;IIIIIIB)V")
    public static final void method2851(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method3679();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method3679();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method3679();
                }
            }
            return;
        }
        field493[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3679();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field507[0][arg2][arg3] = -method713(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field507[arg1][arg2][arg3] = field507[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method3679();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field507[0][arg2][arg3] = -var8 * 8;
                } else {
                    field507[arg1][arg2][arg3] = field507[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1933[arg1][arg2][arg3] = arg0.method3627();
                Statics.field495[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field65[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field493[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field189[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("gx.q([BIIB)Z")
    public static final boolean method3780(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class185 var4 = new class185(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3480();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3479();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3679() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class271 var16 = class271.method4591(var5);
                        if (var13 != 22 || !client.field649 || var16.field3471 != 0 || var16.field3496 == 1 || var16.field3490) {
                            if (!var16.method4866()) {
                                client.field754++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3479();
                if (var9 == 0) {
                    break;
                }
                var4.method3679();
            }
        }
    }

    @ObfuscatedName("ic.c([BIIIIIIILde;[Lfn;I)V")
    public static final void method4609(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class128 arg8, class167[] arg9) {
        class185 var10 = new class185(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3480();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3479();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3679();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class271 var21 = class271.method4591(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3502;
                    int var27 = var21.field3476;
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
                    int var36 = var21.field3502;
                    int var37 = var21.field3476;
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
                        if ((field493[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class167 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method362(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.i(IIIIIILde;Lfn;B)V")
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class128 arg6, class167 arg7) {
        if (client.field649 && (field493[0][arg1][arg2] & 0x2) == 0 && (field493[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field494) {
            field494 = arg0;
        }
        class271 var8 = class271.method4591(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3476;
            var10 = var8.field3502;
        } else {
            var9 = var8.field3502;
            var10 = var8.field3476;
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
        int[][] var15 = field507[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class123.method13(arg1, arg2, 2, var8.field3471 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3465 == 1) {
            var21 += 256;
        }
        if (var8.method4874()) {
            class70 var22 = new class70();
            var22.field1049 = arg0;
            var22.field1050 = arg1 * 128;
            var22.field1060 = arg2 * 128;
            int var23 = var8.field3502;
            int var24 = var8.field3476;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3476;
                var24 = var8.field3502;
            }
            var22.field1063 = (arg1 + var23) * 128;
            var22.field1053 = (arg2 + var24) * 128;
            var22.field1055 = var8.field3492;
            var22.field1054 = var8.field3497 * 128;
            var22.field1057 = var8.field3498;
            var22.field1058 = var8.field3499;
            var22.field1059 = var8.field3500;
            if (var8.field3481 != null) {
                var22.field1062 = var8;
                var22.method1725();
            }
            class70.field1052.method3957(var22);
            if (var22.field1059 != null) {
                var22.field1056 = var22.field1057 + (int) (Math.random() * (double) (var22.field1058 - var22.field1057));
            }
        }
        if (arg5 == 22) {
            if (!client.field649 || var8.field3471 != 0 || var8.field3496 == 1 || var8.field3490) {
                class130 var25;
                if (var8.field3475 == -1 && var8.field3481 == null) {
                    var25 = var8.method4880(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class88(arg3, 22, arg4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
                }
                arg6.method2861(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3496 == 1 && arg7 != null) {
                    arg7.method3314(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class130 var51;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var51 = var8.method4880(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class88(arg3, 10, arg4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            if (var51 != null && arg6.method2865(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3483) {
                int var52 = 15;
                if (var51 instanceof class122) {
                    var52 = ((class122) var51).method2673() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field504[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field504[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3496 != 0 && arg7 != null) {
                arg7.method3339(arg1, arg2, var9, var10, var8.field3469);
            }
        } else if (arg5 >= 12) {
            class130 var26;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var26 = var8.method4880(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2865(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field554[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3496 != 0 && arg7 != null) {
                arg7.method3339(arg1, arg2, var9, var10, var8.field3469);
            }
        } else if (arg5 == 0) {
            class130 var27;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var27 = var8.method4880(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class88(arg3, 0, arg4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2863(arg0, arg1, arg2, var16, var27, (class130) null, field492[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3483) {
                    Statics.field504[arg0][arg1][arg2] = 50;
                    Statics.field504[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3468) {
                    Statics.field554[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3483) {
                    Statics.field504[arg0][arg1][arg2 + 1] = 50;
                    Statics.field504[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3468) {
                    Statics.field554[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3483) {
                    Statics.field504[arg0][arg1 + 1][arg2] = 50;
                    Statics.field504[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3468) {
                    Statics.field554[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3483) {
                    Statics.field504[arg0][arg1][arg2] = 50;
                    Statics.field504[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3468) {
                    Statics.field554[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3496 != 0 && arg7 != null) {
                arg7.method3313(arg1, arg2, arg5, arg4, var8.field3469);
            }
            if (var8.field3459 != 16) {
                arg6.method2871(arg0, arg1, arg2, var8.field3459);
            }
        } else if (arg5 == 1) {
            class130 var28;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var28 = var8.method4880(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class88(arg3, 1, arg4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2863(arg0, arg1, arg2, var16, var28, (class130) null, field500[arg4], 0, var19, var21);
            if (var8.field3483) {
                if (arg4 == 0) {
                    Statics.field504[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field504[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field504[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field504[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3496 != 0 && arg7 != null) {
                arg7.method3313(arg1, arg2, arg5, arg4, var8.field3469);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class130 var30;
            class130 var31;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var30 = var8.method4880(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4880(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class88(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
                var31 = new class88(arg3, 2, var29, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2863(arg0, arg1, arg2, var16, var30, var31, field492[arg4], field492[var29], var19, var21);
            if (var8.field3468) {
                if (arg4 == 0) {
                    Statics.field554[arg0][arg1][arg2] |= 0x249;
                    Statics.field554[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field554[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field554[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field554[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field554[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field554[arg0][arg1][arg2] |= 0x492;
                    Statics.field554[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3496 != 0 && arg7 != null) {
                arg7.method3313(arg1, arg2, arg5, arg4, var8.field3469);
            }
            if (var8.field3459 != 16) {
                arg6.method2871(arg0, arg1, arg2, var8.field3459);
            }
        } else if (arg5 == 3) {
            class130 var32;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var32 = var8.method4880(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class88(arg3, 3, arg4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2863(arg0, arg1, arg2, var16, var32, (class130) null, field500[arg4], 0, var19, var21);
            if (var8.field3483) {
                if (arg4 == 0) {
                    Statics.field504[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field504[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field504[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field504[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3496 != 0 && arg7 != null) {
                arg7.method3313(arg1, arg2, arg5, arg4, var8.field3469);
            }
        } else if (arg5 == 9) {
            class130 var33;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var33 = var8.method4880(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2865(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3496 != 0 && arg7 != null) {
                arg7.method3339(arg1, arg2, var9, var10, var8.field3469);
            }
            if (var8.field3459 != 16) {
                arg6.method2871(arg0, arg1, arg2, var8.field3459);
            }
        } else if (arg5 == 4) {
            class130 var34;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var34 = var8.method4880(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2864(arg0, arg1, arg2, var16, var34, (class130) null, field492[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2881(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class271.method4591(class123.method1031(var36)).field3459;
            }
            class130 var38;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var38 = var8.method4880(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2864(arg0, arg1, arg2, var16, var38, (class130) null, field492[arg4], 0, field498[arg4] * var35, field502[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2881(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class271.method4591(class123.method1031(var40)).field3459 / 2;
            }
            class130 var42;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var42 = var8.method4880(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2864(arg0, arg1, arg2, var16, var42, (class130) null, 256, arg4, field503[arg4] * var39, field508[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class130 var44;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var44 = var8.method4880(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class88(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2864(arg0, arg1, arg2, var16, var44, (class130) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2881(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class271.method4591(class123.method1031(var46)).field3459 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class130 var49;
            class130 var50;
            if (var8.field3475 == -1 && var8.field3481 == null) {
                var49 = var8.method4880(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4880(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
                var50 = new class88(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3475, true, (class130) null);
            }
            arg6.method2864(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field503[arg4] * var45, field508[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("ak.p(III)I")
    public static final int method713(int arg0, int arg1) {
        int var2 = method3724(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3724(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3724(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("go.m(IIII)I")
    public static final int method3724(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3398(var3, var5);
        int var8 = method3398(var3 + 1, var5);
        int var9 = method3398(var3, var5 + 1);
        int var10 = method3398(var3 + 1, var5 + 1);
        int var11 = 65536 - class125.field1755[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class125.field1755[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class125.field1755[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("fo.d(III)I")
    public static final int method3398(int arg0, int arg1) {
        int var2 = method1848(arg0 - 1, arg1 - 1) + method1848(arg0 + 1, arg1 - 1) + method1848(arg0 - 1, arg1 + 1) + method1848(arg0 + 1, arg1 + 1);
        int var3 = method1848(arg0 - 1, arg1) + method1848(arg0 + 1, arg1) + method1848(arg0, arg1 - 1) + method1848(arg0, arg1 + 1);
        int var4 = method1848(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bd.j(IIB)I")
    public static final int method1848(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("iw.x(III)I")
    public static final int method4408(int arg0, int arg1) {
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

    @ObfuscatedName("al.v(III)I")
    public static final int method706(int arg0, int arg1) {
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

    @ObfuscatedName("jb.h(IIII)I")
    public static final int method4830(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dt.f(III)Z")
    public static final boolean method2567(int arg0, int arg1) {
        class271 var2 = class271.method4591(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4893(arg1);
    }

    @ObfuscatedName("r.a(IIIIIIILde;Lfn;I)V")
    public static final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class128 arg7, class167 arg8) {
        class271 var9 = class271.method4591(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3476;
            var11 = var9.field3502;
        } else {
            var10 = var9.field3502;
            var11 = var9.field3476;
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
        int[][] var16 = field507[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class123.method13(arg2, arg3, 2, var9.field3471 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3465 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class130 var23;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var23 = var9.method4868(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class88(arg4, 22, arg5, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2861(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3496 == 1) {
                arg8.method3314(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class130 var49;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var49 = var9.method4868(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class88(arg4, 10, arg5, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            if (var49 != null) {
                arg7.method2865(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3496 != 0) {
                arg8.method3339(arg2, arg3, var10, var11, var9.field3469);
            }
        } else if (arg6 >= 12) {
            class130 var24;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var24 = var9.method4868(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2865(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3496 != 0) {
                arg8.method3339(arg2, arg3, var10, var11, var9.field3469);
            }
        } else if (arg6 == 0) {
            class130 var25;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var25 = var9.method4868(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class88(arg4, 0, arg5, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2863(arg0, arg2, arg3, var17, var25, (class130) null, field492[arg5], 0, var20, var22);
            if (var9.field3496 != 0) {
                arg8.method3313(arg2, arg3, arg6, arg5, var9.field3469);
            }
        } else if (arg6 == 1) {
            class130 var26;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var26 = var9.method4868(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class88(arg4, 1, arg5, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2863(arg0, arg2, arg3, var17, var26, (class130) null, field500[arg5], 0, var20, var22);
            if (var9.field3496 != 0) {
                arg8.method3313(arg2, arg3, arg6, arg5, var9.field3469);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class130 var28;
            class130 var29;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var28 = var9.method4868(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4868(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class88(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3475, true, (class130) null);
                var29 = new class88(arg4, 2, var27, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2863(arg0, arg2, arg3, var17, var28, var29, field492[arg5], field492[var27], var20, var22);
            if (var9.field3496 != 0) {
                arg8.method3313(arg2, arg3, arg6, arg5, var9.field3469);
            }
        } else if (arg6 == 3) {
            class130 var30;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var30 = var9.method4868(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class88(arg4, 3, arg5, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2863(arg0, arg2, arg3, var17, var30, (class130) null, field500[arg5], 0, var20, var22);
            if (var9.field3496 != 0) {
                arg8.method3313(arg2, arg3, arg6, arg5, var9.field3469);
            }
        } else if (arg6 == 9) {
            class130 var31;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var31 = var9.method4868(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2865(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3496 != 0) {
                arg8.method3339(arg2, arg3, var10, var11, var9.field3469);
            }
        } else if (arg6 == 4) {
            class130 var32;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var32 = var9.method4868(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2864(arg0, arg2, arg3, var17, var32, (class130) null, field492[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2881(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class271.method4591(class123.method1031(var34)).field3459;
            }
            class130 var36;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var36 = var9.method4868(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2864(arg0, arg2, arg3, var17, var36, (class130) null, field492[arg5], 0, field498[arg5] * var33, field502[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2881(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class271.method4591(class123.method1031(var38)).field3459 / 2;
            }
            class130 var40;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var40 = var9.method4868(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2864(arg0, arg2, arg3, var17, var40, (class130) null, 256, arg5, field503[arg5] * var37, field508[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class130 var42;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var42 = var9.method4868(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class88(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2864(arg0, arg2, arg3, var17, var42, (class130) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2881(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class271.method4591(class123.method1031(var44)).field3459 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class130 var47;
            class130 var48;
            if (var9.field3475 == -1 && var9.field3481 == null) {
                var47 = var9.method4868(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4868(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3475, true, (class130) null);
                var48 = new class88(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3475, true, (class130) null);
            }
            arg7.method2864(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field503[arg5] * var43, field508[arg5] * var43, var20, var22);
        }
    }
}
