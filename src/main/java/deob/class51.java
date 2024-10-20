package deob;

@ObfuscatedName("ae")
public final class class51 {

    @ObfuscatedName("ae.c")
    public static int[][][] field495 = new int[4][105][105];

    @ObfuscatedName("ae.q")
    public static byte[][][] field487 = new byte[4][104][104];

    @ObfuscatedName("ae.m")
    public static int field499 = 99;

    @ObfuscatedName("ae.b")
    public static final int[] field493 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("ae.w")
    public static final int[] field494 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("ae.e")
    public static final int[] field501 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("ae.a")
    public static final int[] field496 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("ae.z")
    public static final int[] field497 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("ae.y")
    public static final int[] field490 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("ae.u")
    public static int field488 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("ae.f")
    public static int field500 = (int) (Math.random() * 33.0D) - 16;

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.c(I)V")
    public static void method3133() {
        field499 = 99;
        Statics.field1934 = new byte[4][104][104];
        Statics.field489 = new byte[4][104][104];
        Statics.field486 = new byte[4][104][104];
        Statics.field1917 = new byte[4][104][104];
        Statics.field8 = new int[4][105][105];
        Statics.field522 = new byte[4][105][105];
        Statics.field233 = new int[105][105];
        Statics.field3183 = new int[104];
        Statics.field1513 = new int[104];
        Statics.field498 = new int[104];
        Statics.field3377 = new int[104];
        Statics.field492 = new int[104];
    }

    @ObfuscatedName("ab.q(IIIIB)V")
    public static final void method550(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field522[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field495[0][var5][var4] = field495[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field495[0][var5][var4] = field495[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field495[0][var5][var4] = field495[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field495[0][var5][var4] = field495[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.m([BIIIIIII[Lfg;I)V")
    public static final void method480(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2070[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class185 var11 = new class185(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class232.method1586(var13 & 0x7, var14 & 0x7, arg7);
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
                        method31(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method31(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dj.j(IIIS)V")
    public static final void method2399(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field495[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field495[arg0][arg1][arg2 + var5] = field495[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field495[arg0][arg1 + var6][arg2] = field495[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field495[arg0][arg1 - 1][arg2] != 0) {
            field495[arg0][arg1][arg2] = field495[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field495[arg0][arg1][arg2 - 1] != 0) {
            field495[arg0][arg1][arg2] = field495[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field495[arg0][arg1 - 1][arg2 - 1] != 0) {
            field495[arg0][arg1][arg2] = field495[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("m.g(Lgg;IIIIIIB)V")
    public static final void method31(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3243();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3243();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3243();
                }
            }
            return;
        }
        field487[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3243();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field495[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3564(var10 + 45365, var11 + 91923, 4) - 128 + (method3564(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3564(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field495[arg1][arg2][arg3] = field495[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3243();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field495[0][arg2][arg3] = -var15 * 8;
                } else {
                    field495[arg1][arg2][arg3] = field495[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field489[arg1][arg2][arg3] = arg0.method3244();
                Statics.field486[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1917[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field487[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1934[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("c.i([BIII)Z")
    public static final boolean method11(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class185 var4 = new class185(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3257();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3256();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3243() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class271 var16 = class271.method2839(var5);
                        if (var13 != 22 || !client.field782 || var16.field3435 != 0 || var16.field3429 == 1 || var16.field3415) {
                            if (!var16.method4678()) {
                                client.field697++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3256();
                if (var9 == 0) {
                    break;
                }
                var4.method3243();
            }
        }
    }

    @ObfuscatedName("bf.h(IIIIIILdq;Lfg;I)V")
    public static final void method1083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class128 arg6, class167 arg7) {
        if (client.field782 && (field487[0][arg1][arg2] & 0x2) == 0 && (field487[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field499) {
            field499 = arg0;
        }
        class271 var8 = class271.method2839(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3433;
            var10 = var8.field3431;
        } else {
            var9 = var8.field3431;
            var10 = var8.field3433;
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
        int[][] var15 = field495[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class123.method2401(arg1, arg2, 2, var8.field3435 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3456 == 1) {
            var21 += 256;
        }
        if (var8.method4680()) {
            class70 var22 = new class70();
            var22.field1033 = arg0;
            var22.field1034 = arg1 * 128;
            var22.field1035 = arg2 * 128;
            int var23 = var8.field3431;
            int var24 = var8.field3433;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var8.field3433;
                var24 = var8.field3431;
            }
            var22.field1036 = (arg1 + var23) * 128;
            var22.field1046 = (arg2 + var24) * 128;
            var22.field1039 = var8.field3460;
            var22.field1042 = var8.field3450 * 128;
            var22.field1041 = var8.field3442;
            var22.field1040 = var8.field3417;
            var22.field1043 = var8.field3464;
            if (var8.field3457 != null) {
                var22.field1032 = var8;
                var22.method1578();
            }
            class70.field1037.method3740(var22);
            if (var22.field1043 != null) {
                var22.field1044 = var22.field1041 + (int) (Math.random() * (double) (var22.field1040 - var22.field1041));
            }
        }
        if (arg5 == 22) {
            if (!client.field782 || var8.field3435 != 0 || var8.field3429 == 1 || var8.field3415) {
                class130 var25;
                if (var8.field3439 == -1 && var8.field3457 == null) {
                    var25 = var8.method4688(22, arg4, var15, var17, var16, var18);
                } else {
                    var25 = new class88(arg3, 22, arg4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
                }
                arg6.method2721(arg0, arg1, arg2, var16, var25, var19, var21);
                if (var8.field3429 == 1 && arg7 != null) {
                    arg7.method3097(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class130 var51;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var51 = var8.method4688(10, arg4, var15, var17, var16, var18);
            } else {
                var51 = new class88(arg3, 10, arg4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            if (var51 != null && arg6.method2652(arg0, arg1, arg2, var16, var9, var10, var51, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3447) {
                int var52 = 15;
                if (var51 instanceof class122) {
                    var52 = ((class122) var51).method2422() / 4;
                    if (var52 > 30) {
                        var52 = 30;
                    }
                }
                for (int var53 = 0; var53 <= var9; var53++) {
                    for (int var54 = 0; var54 <= var10; var54++) {
                        if (var52 > Statics.field522[arg0][arg1 + var53][arg2 + var54]) {
                            Statics.field522[arg0][arg1 + var53][arg2 + var54] = (byte) var52;
                        }
                    }
                }
            }
            if (var8.field3429 != 0 && arg7 != null) {
                arg7.method3098(arg1, arg2, var9, var10, var8.field3423);
            }
        } else if (arg5 >= 12) {
            class130 var26;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var26 = var8.method4688(arg5, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2652(arg0, arg1, arg2, var16, 1, 1, var26, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field8[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3429 != 0 && arg7 != null) {
                arg7.method3098(arg1, arg2, var9, var10, var8.field3423);
            }
        } else if (arg5 == 0) {
            class130 var27;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var27 = var8.method4688(0, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class88(arg3, 0, arg4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2727(arg0, arg1, arg2, var16, var27, (class130) null, field493[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3447) {
                    Statics.field522[arg0][arg1][arg2] = 50;
                    Statics.field522[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3438) {
                    Statics.field8[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3447) {
                    Statics.field522[arg0][arg1][arg2 + 1] = 50;
                    Statics.field522[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3438) {
                    Statics.field8[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3447) {
                    Statics.field522[arg0][arg1 + 1][arg2] = 50;
                    Statics.field522[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3438) {
                    Statics.field8[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3447) {
                    Statics.field522[arg0][arg1][arg2] = 50;
                    Statics.field522[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3438) {
                    Statics.field8[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3429 != 0 && arg7 != null) {
                arg7.method3094(arg1, arg2, arg5, arg4, var8.field3423);
            }
            if (var8.field3440 != 16) {
                arg6.method2658(arg0, arg1, arg2, var8.field3440);
            }
        } else if (arg5 == 1) {
            class130 var28;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var28 = var8.method4688(1, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class88(arg3, 1, arg4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2727(arg0, arg1, arg2, var16, var28, (class130) null, field494[arg4], 0, var19, var21);
            if (var8.field3447) {
                if (arg4 == 0) {
                    Statics.field522[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field522[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field522[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field522[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3429 != 0 && arg7 != null) {
                arg7.method3094(arg1, arg2, arg5, arg4, var8.field3423);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class130 var30;
            class130 var31;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var30 = var8.method4688(2, arg4 + 4, var15, var17, var16, var18);
                var31 = var8.method4688(2, var29, var15, var17, var16, var18);
            } else {
                var30 = new class88(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
                var31 = new class88(arg3, 2, var29, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2727(arg0, arg1, arg2, var16, var30, var31, field493[arg4], field493[var29], var19, var21);
            if (var8.field3438) {
                if (arg4 == 0) {
                    Statics.field8[arg0][arg1][arg2] |= 0x249;
                    Statics.field8[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field8[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field8[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field8[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field8[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field8[arg0][arg1][arg2] |= 0x492;
                    Statics.field8[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3429 != 0 && arg7 != null) {
                arg7.method3094(arg1, arg2, arg5, arg4, var8.field3423);
            }
            if (var8.field3440 != 16) {
                arg6.method2658(arg0, arg1, arg2, var8.field3440);
            }
        } else if (arg5 == 3) {
            class130 var32;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var32 = var8.method4688(3, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class88(arg3, 3, arg4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2727(arg0, arg1, arg2, var16, var32, (class130) null, field494[arg4], 0, var19, var21);
            if (var8.field3447) {
                if (arg4 == 0) {
                    Statics.field522[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field522[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field522[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field522[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3429 != 0 && arg7 != null) {
                arg7.method3094(arg1, arg2, arg5, arg4, var8.field3423);
            }
        } else if (arg5 == 9) {
            class130 var33;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var33 = var8.method4688(arg5, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class88(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2652(arg0, arg1, arg2, var16, 1, 1, var33, 0, var19, var21);
            if (var8.field3429 != 0 && arg7 != null) {
                arg7.method3098(arg1, arg2, var9, var10, var8.field3423);
            }
            if (var8.field3440 != 16) {
                arg6.method2658(arg0, arg1, arg2, var8.field3440);
            }
        } else if (arg5 == 4) {
            class130 var34;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var34 = var8.method4688(4, arg4, var15, var17, var16, var18);
            } else {
                var34 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2651(arg0, arg1, arg2, var16, var34, (class130) null, field493[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            long var36 = arg6.method2668(arg0, arg1, arg2);
            if (var36 != 0L) {
                var35 = class271.method2839(class123.method2261(var36)).field3440;
            }
            class130 var38;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var38 = var8.method4688(4, arg4, var15, var17, var16, var18);
            } else {
                var38 = new class88(arg3, 4, arg4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2651(arg0, arg1, arg2, var16, var38, (class130) null, field493[arg4], 0, field501[arg4] * var35, field496[arg4] * var35, var19, var21);
        } else if (arg5 == 6) {
            int var39 = 8;
            long var40 = arg6.method2668(arg0, arg1, arg2);
            if (var40 != 0L) {
                var39 = class271.method2839(class123.method2261(var40)).field3440 / 2;
            }
            class130 var42;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var42 = var8.method4688(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2651(arg0, arg1, arg2, var16, var42, (class130) null, 256, arg4, field497[arg4] * var39, field490[arg4] * var39, var19, var21);
        } else if (arg5 == 7) {
            int var43 = arg4 + 2 & 0x3;
            class130 var44;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var44 = var8.method4688(4, var43 + 4, var15, var17, var16, var18);
            } else {
                var44 = new class88(arg3, 4, var43 + 4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2651(arg0, arg1, arg2, var16, var44, (class130) null, 256, var43, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var45 = 8;
            long var46 = arg6.method2668(arg0, arg1, arg2);
            if (var46 != 0L) {
                var45 = class271.method2839(class123.method2261(var46)).field3440 / 2;
            }
            int var48 = arg4 + 2 & 0x3;
            class130 var49;
            class130 var50;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var49 = var8.method4688(4, arg4 + 4, var15, var17, var16, var18);
                var50 = var8.method4688(4, var48 + 4, var15, var17, var16, var18);
            } else {
                var49 = new class88(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
                var50 = new class88(arg3, 4, var48 + 4, arg0, arg1, arg2, var8.field3439, true, (class130) null);
            }
            arg6.method2651(arg0, arg1, arg2, var16, var49, var50, 256, arg4, field497[arg4] * var45, field490[arg4] * var45, var19, var21);
        }
    }

    @ObfuscatedName("f.l(IIII)I")
    public static int method452(int arg0, int arg1, int arg2) {
        if ((field487[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field487[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ga.o(IIIB)I")
    public static final int method3564(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method28(var3, var5);
        int var8 = method28(var3 + 1, var5);
        int var9 = method28(var3, var5 + 1);
        int var10 = method28(var3 + 1, var5 + 1);
        int var11 = 65536 - class125.field1741[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class125.field1741[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class125.field1741[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("m.k(III)I")
    public static final int method28(int arg0, int arg1) {
        int var2 = method2413(arg0 - 1, arg1 - 1) + method2413(arg0 + 1, arg1 - 1) + method2413(arg0 - 1, arg1 + 1) + method2413(arg0 + 1, arg1 + 1);
        int var3 = method2413(arg0 - 1, arg1) + method2413(arg0 + 1, arg1) + method2413(arg0, arg1 - 1) + method2413(arg0, arg1 + 1);
        int var4 = method2413(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dt.v(IIB)I")
    public static final int method2413(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("m.p(III)I")
    public static final int method21(int arg0, int arg1) {
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

    @ObfuscatedName("a.n(IIB)I")
    public static final int method288(int arg0, int arg1) {
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

    @ObfuscatedName("p.t(IIII)I")
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
}
