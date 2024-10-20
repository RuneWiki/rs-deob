package deob;

@ObfuscatedName("bu")
public final class class65 {

    @ObfuscatedName("bu.z")
    public static int[][][] field527 = new int[4][105][105];

    @ObfuscatedName("bu.k")
    public static byte[][][] field519 = new byte[4][104][104];

    @ObfuscatedName("bu.s")
    public static int field520 = 99;

    @ObfuscatedName("bu.v")
    public static final int[] field525 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bu.j")
    public static final int[] field526 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bu.r")
    public static final int[] field518 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bu.u")
    public static final int[] field528 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bu.p")
    public static final int[] field535 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bu.b")
    public static final int[] field530 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bu.l")
    public static int field536 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bu.e")
    public static int field521 = (int) (Math.random() * 33.0D) - 16;

    public class65() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ge.z(I)V")
    public static void method3594() {
        field520 = 99;
        Statics.field529 = new byte[4][104][104];
        Statics.field522 = new byte[4][104][104];
        Statics.field3669 = new byte[4][104][104];
        Statics.field2050 = new byte[4][104][104];
        Statics.field2422 = new int[4][105][105];
        Statics.field123 = new byte[4][105][105];
        Statics.field283 = new int[105][105];
        Statics.field531 = new int[104];
        Statics.field524 = new int[104];
        Statics.field207 = new int[104];
        Statics.field372 = new int[104];
        Statics.field454 = new int[104];
    }

    @ObfuscatedName("cz.k(B)V")
    public static void method2102() {
        Statics.field529 = (byte[][][]) null;
        Statics.field522 = (byte[][][]) null;
        Statics.field3669 = (byte[][][]) null;
        Statics.field2050 = (byte[][][]) null;
        Statics.field2422 = (int[][][]) null;
        Statics.field123 = (byte[][][]) null;
        Statics.field283 = (int[][]) null;
        Statics.field531 = null;
        Statics.field524 = null;
        Statics.field207 = null;
        Statics.field372 = null;
        Statics.field454 = null;
    }

    @ObfuscatedName("bf.s(IIIIB)V")
    public static final void method1183(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field123[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field527[0][var5][var4] = field527[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field527[0][var5][var4] = field527[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field527[0][var5][var4] = field527[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field527[0][var5][var4] = field527[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.t(IIIB)V")
    public static final void method770(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field527[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field527[arg0][arg1][arg2 + var5] = field527[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field527[arg0][arg1 + var6][arg2] = field527[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field527[arg0][arg1 - 1][arg2] != 0) {
            field527[arg0][arg1][arg2] = field527[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field527[arg0][arg1][arg2 - 1] != 0) {
            field527[arg0][arg1][arg2] = field527[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field527[arg0][arg1 - 1][arg2 - 1] != 0) {
            field527[arg0][arg1][arg2] = field527[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cb.i(Lkf;IIIIIIB)V")
    public static final void method2142(class310 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method5193();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method5193();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method5193();
                }
            }
            return;
        }
        field519[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method5193();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field527[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method803(var10 + 45365, var11 + 91923, 4) - 128 + (method803(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method803(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field527[arg1][arg2][arg3] = field527[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method5193();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field527[0][arg2][arg3] = -var15 * 8;
                } else {
                    field527[arg1][arg2][arg3] = field527[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field522[arg1][arg2][arg3] = arg0.method5194();
                Statics.field3669[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2050[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field519[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field529[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("hc.o([BIIB)Z")
    public static final boolean method3771(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class310 var4 = new class310(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method5208();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method5207();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method5193() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class264 var16 = class264.method3595(var5);
                        if (var13 != 22 || !client.field676 || var16.field3391 != 0 || var16.field3389 == 1 || var16.field3396) {
                            if (!var16.method4320()) {
                                client.field896++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method5207();
                if (var9 == 0) {
                    break;
                }
                var4.method5193();
            }
        }
    }

    @ObfuscatedName("q.w(IIIIIILec;Lft;B)V")
    public static final void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class143 arg6, class182 arg7) {
        if (client.field676 && (field519[0][arg1][arg2] & 0x2) == 0 && (field519[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field520) {
            field520 = arg0;
        }
        class264 var8 = class264.method3595(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3388;
            var10 = var8.field3387;
        } else {
            var9 = var8.field3387;
            var10 = var8.field3388;
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
        int[][] var15 = field527[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class138.method3833(arg1, arg2, 2, var8.field3391 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3412 == 1) {
            var21 += 256;
        }
        if (var8.method4328()) {
            class85.method4703(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field676 || var8.field3391 != 0 || var8.field3389 == 1 || var8.field3396) {
                class145 var22;
                if (var8.field3395 == -1 && var8.field3413 == null) {
                    var22 = var8.method4344(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class103(arg3, 22, arg4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
                }
                arg6.method2952(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3389 == 1 && arg7 != null) {
                    arg7.method3342(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class145 var48;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var48 = var8.method4344(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class103(arg3, 10, arg4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            if (var48 != null && arg6.method3021(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3403) {
                int var49 = 15;
                if (var48 instanceof class137) {
                    var49 = ((class137) var48).method2774() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field123[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field123[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3389 != 0 && arg7 != null) {
                arg7.method3340(arg1, arg2, var9, var10, var8.field3390);
            }
        } else if (arg5 >= 12) {
            class145 var23;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var23 = var8.method4344(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method3021(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2422[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3389 != 0 && arg7 != null) {
                arg7.method3340(arg1, arg2, var9, var10, var8.field3390);
            }
        } else if (arg5 == 0) {
            class145 var24;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var24 = var8.method4344(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class103(arg3, 0, arg4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method2954(arg0, arg1, arg2, var16, var24, (class145) null, field525[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3403) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3417) {
                    Statics.field2422[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3403) {
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3417) {
                    Statics.field2422[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3403) {
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3417) {
                    Statics.field2422[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3403) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3417) {
                    Statics.field2422[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3389 != 0 && arg7 != null) {
                arg7.method3339(arg1, arg2, arg5, arg4, var8.field3390);
            }
            if (var8.field3373 != 16) {
                arg6.method2962(arg0, arg1, arg2, var8.field3373);
            }
        } else if (arg5 == 1) {
            class145 var25;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var25 = var8.method4344(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class103(arg3, 1, arg4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method2954(arg0, arg1, arg2, var16, var25, (class145) null, field526[arg4], 0, var19, var21);
            if (var8.field3403) {
                if (arg4 == 0) {
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3389 != 0 && arg7 != null) {
                arg7.method3339(arg1, arg2, arg5, arg4, var8.field3390);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class145 var27;
            class145 var28;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var27 = var8.method4344(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4344(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class103(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
                var28 = new class103(arg3, 2, var26, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method2954(arg0, arg1, arg2, var16, var27, var28, field525[arg4], field525[var26], var19, var21);
            if (var8.field3417) {
                if (arg4 == 0) {
                    Statics.field2422[arg0][arg1][arg2] |= 0x249;
                    Statics.field2422[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2422[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2422[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2422[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2422[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2422[arg0][arg1][arg2] |= 0x492;
                    Statics.field2422[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3389 != 0 && arg7 != null) {
                arg7.method3339(arg1, arg2, arg5, arg4, var8.field3390);
            }
            if (var8.field3373 != 16) {
                arg6.method2962(arg0, arg1, arg2, var8.field3373);
            }
        } else if (arg5 == 3) {
            class145 var29;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var29 = var8.method4344(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class103(arg3, 3, arg4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method2954(arg0, arg1, arg2, var16, var29, (class145) null, field526[arg4], 0, var19, var21);
            if (var8.field3403) {
                if (arg4 == 0) {
                    Statics.field123[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field123[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field123[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field123[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3389 != 0 && arg7 != null) {
                arg7.method3339(arg1, arg2, arg5, arg4, var8.field3390);
            }
        } else if (arg5 == 9) {
            class145 var30;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var30 = var8.method4344(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class103(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method3021(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3389 != 0 && arg7 != null) {
                arg7.method3340(arg1, arg2, var9, var10, var8.field3390);
            }
            if (var8.field3373 != 16) {
                arg6.method2962(arg0, arg1, arg2, var8.field3373);
            }
        } else if (arg5 == 4) {
            class145 var31;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var31 = var8.method4344(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method3051(arg0, arg1, arg2, var16, var31, (class145) null, field525[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2972(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class264.method3595(class138.method3219(var33)).field3373;
            }
            class145 var35;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var35 = var8.method4344(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class103(arg3, 4, arg4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method3051(arg0, arg1, arg2, var16, var35, (class145) null, field525[arg4], 0, field518[arg4] * var32, field528[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2972(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class264.method3595(class138.method3219(var37)).field3373 / 2;
            }
            class145 var39;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var39 = var8.method4344(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method3051(arg0, arg1, arg2, var16, var39, (class145) null, 256, arg4, field535[arg4] * var36, field530[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class145 var41;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var41 = var8.method4344(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class103(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method3051(arg0, arg1, arg2, var16, var41, (class145) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2972(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class264.method3595(class138.method3219(var43)).field3373 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class145 var46;
            class145 var47;
            if (var8.field3395 == -1 && var8.field3413 == null) {
                var46 = var8.method4344(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4344(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class103(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
                var47 = new class103(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3395, true, (class145) null);
            }
            arg6.method3051(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field535[arg4] * var42, field530[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("cu.g(Lec;[Lft;I)V")
    public static final void method1942(class143 arg0, class182[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field519[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field519[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3338(var3, var4);
                        }
                    }
                }
            }
        }
        field536 += (int) (Math.random() * 5.0D) - 2;
        if (field536 < -8) {
            field536 = -8;
        }
        if (field536 > 8) {
            field536 = 8;
        }
        field521 += (int) (Math.random() * 5.0D) - 2;
        if (field521 < -16) {
            field521 = -16;
        }
        if (field521 > 16) {
            field521 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field123[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field527[var6][var11 + 1][var10] - field527[var6][var11 - 1][var10];
                    int var13 = field527[var6][var11][var10 + 1] - field527[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field283[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field531[var20] = 0;
                Statics.field524[var20] = 0;
                Statics.field207[var20] = 0;
                Statics.field372[var20] = 0;
                Statics.field454[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field529[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class255 var26 = (class255) class255.field3282.method3170((long) var25);
                            class255 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field3285.method3873(1, var25);
                                class255 var29 = new class255();
                                if (var28 != null) {
                                    var29.method4147(new class310(var28), var25);
                                }
                                var29.method4138();
                                class255.field3282.method3169(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field531[var22] += var27.field3284;
                            Statics.field524[var22] += var27.field3281;
                            Statics.field207[var22] += var27.field3286;
                            Statics.field372[var22] += var27.field3287;
                            var10002 = Statics.field454[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field529[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class255 var34 = (class255) class255.field3282.method3170((long) var33);
                            class255 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field3285.method3873(1, var33);
                                class255 var37 = new class255();
                                if (var36 != null) {
                                    var37.method4147(new class310(var36), var33);
                                }
                                var37.method4138();
                                class255.field3282.method3169(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field531[var22] -= var35.field3284;
                            Statics.field524[var22] -= var35.field3281;
                            Statics.field207[var22] -= var35.field3286;
                            Statics.field372[var22] -= var35.field3287;
                            var10002 = Statics.field454[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var39 = 0;
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    for (int var44 = -5; var44 < 109; var44++) {
                        int var45 = var44 + 5;
                        if (var45 >= 0 && var45 < 104) {
                            var39 += Statics.field531[var45];
                            var40 += Statics.field524[var45];
                            var41 += Statics.field207[var45];
                            var42 += Statics.field372[var45];
                            var43 += Statics.field454[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field531[var46];
                            var40 -= Statics.field524[var46];
                            var41 -= Statics.field207[var46];
                            var42 -= Statics.field372[var46];
                            var43 -= Statics.field454[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field676 || (field519[0][var21][var44] & 0x2) != 0 || (field519[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field520) {
                                field520 = var6;
                            }
                            int var47 = Statics.field529[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field522[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field527[var6][var21][var44];
                                int var50 = field527[var6][var21 + 1][var44];
                                int var51 = field527[var6][var21 + 1][var44 + 1];
                                int var52 = field527[var6][var21][var44 + 1];
                                int var53 = Statics.field283[var21][var44];
                                int var54 = Statics.field283[var21 + 1][var44];
                                int var55 = Statics.field283[var21 + 1][var44 + 1];
                                int var56 = Statics.field283[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method804(var59, var60, var61);
                                    int var62 = field536 + var59 & 0xFF;
                                    int var63 = field521 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method804(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field3669[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class268.method2382(var48 - 1).field3526) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field2422[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class140.field1807[method1629(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method2951(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1629(var57, var53), method1629(var57, var54), method1629(var57, var55), method1629(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field3669[var6][var21][var44] + 1;
                                    byte var67 = Statics.field2050[var6][var21][var44];
                                    class268 var68 = class268.method2382(var48 - 1);
                                    int var69 = var68.field3523;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1808.method2615(var69);
                                        var71 = -1;
                                    } else if (var68.field3532 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method804(var68.field3530, var68.field3529, var68.field3527);
                                        int var72 = field536 + var68.field3530 & 0xFF;
                                        int var73 = field521 + var68.field3527;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method804(var72, var68.field3529, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class140.field1807[method3737(var70, 96)];
                                    }
                                    if (var68.field3524 != -1) {
                                        int var75 = field536 + var68.field3531 & 0xFF;
                                        int var76 = field521 + var68.field3533;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method804(var75, var68.field3525, var76);
                                        var74 = class140.field1807[method3737(var77, 96)];
                                    }
                                    arg0.method2951(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method1629(var57, var53), method1629(var57, var54), method1629(var57, var55), method1629(var57, var56), method3737(var71, var53), method3737(var71, var54), method3737(var71, var55), method3737(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field519[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field519[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method3050(var6, var79, var78, var84);
                }
            }
            Statics.field529[var6] = (byte[][]) null;
            Statics.field522[var6] = (byte[][]) null;
            Statics.field3669[var6] = (byte[][]) null;
            Statics.field2050[var6] = (byte[][]) null;
            Statics.field123[var6] = (byte[][]) null;
        }
        arg0.method2977(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field519[1][var85][var86] & 0x2) == 2) {
                    arg0.method2948(var85, var86);
                }
            }
        }
        int var87 = 1;
        int var88 = 2;
        int var89 = 4;
        for (int var90 = 0; var90 < 4; var90++) {
            if (var90 > 0) {
                var87 <<= 0x3;
                var88 <<= 0x3;
                var89 <<= 0x3;
            }
            for (int var91 = 0; var91 <= var90; var91++) {
                for (int var92 = 0; var92 <= 104; var92++) {
                    for (int var93 = 0; var93 <= 104; var93++) {
                        if ((Statics.field2422[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field2422[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field2422[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label361: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field2422[var96 - 1][var93][var98] & var87) == 0) {
                                        break label361;
                                    }
                                }
                                var96--;
                            }
                            label350: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field2422[var97 + 1][var93][var99] & var87) == 0) {
                                        break label350;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field527[var97][var93][var94] - var101;
                                int var103 = field527[var96][var93][var94];
                                class143.method2949(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field2422[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2422[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field2422[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field2422[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label414: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field2422[var108 - 1][var110][var92] & var88) == 0) {
                                        break label414;
                                    }
                                }
                                var108--;
                            }
                            label403: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field2422[var109 + 1][var111][var92] & var88) == 0) {
                                        break label403;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field527[var109][var106][var92] - var113;
                                int var115 = field527[var108][var106][var92];
                                class143.method2949(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field2422[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2422[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field2422[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field2422[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label467: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field2422[var91][var118 - 1][var122] & var89) == 0) {
                                        break label467;
                                    }
                                }
                                var118--;
                            }
                            label456: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field2422[var91][var119 + 1][var123] & var89) == 0) {
                                        break label456;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field527[var91][var118][var120];
                                class143.method2949(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field2422[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bp.m(IIIB)I")
    public static final int method803(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2020(var3, var5);
        int var8 = method2020(var3 + 1, var5);
        int var9 = method2020(var3, var5 + 1);
        int var10 = method2020(var3 + 1, var5 + 1);
        int var11 = method5529(var7, var8, var4, arg2);
        int var12 = method5529(var9, var10, var4, arg2);
        int var13 = 65536 - class140.field1794[var6 * 1024 / arg2] >> 1;
        return ((65536 - var13) * var11 >> 16) + (var12 * var13 >> 16);
    }

    @ObfuscatedName("lz.n(IIIIB)I")
    public static final int method5529(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class140.field1794[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ch.d(IIB)I")
    public static final int method2020(int arg0, int arg1) {
        int var2 = method1190(arg0 - 1, arg1 - 1) + method1190(arg0 + 1, arg1 - 1) + method1190(arg0 - 1, arg1 + 1) + method1190(arg0 + 1, arg1 + 1);
        int var3 = method1190(arg0 - 1, arg1) + method1190(arg0 + 1, arg1) + method1190(arg0, arg1 - 1) + method1190(arg0, arg1 + 1);
        int var4 = method1190(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bt.h(IIB)I")
    public static final int method1190(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bs.a(III)I")
    public static final int method1629(int arg0, int arg1) {
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

    @ObfuscatedName("hg.q(IIB)I")
    public static final int method3737(int arg0, int arg1) {
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

    @ObfuscatedName("bp.c(IIII)I")
    public static final int method804(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("jg.j(IIIIIIILec;Lft;B)V")
    public static final void method4315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class143 arg7, class182 arg8) {
        class264 var9 = class264.method3595(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3388;
            var11 = var9.field3387;
        } else {
            var10 = var9.field3387;
            var11 = var9.field3388;
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
        int[][] var16 = field527[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class138.method3833(arg2, arg3, 2, var9.field3391 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3412 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class145 var23;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var23 = var9.method4327(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class103(arg4, 22, arg5, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method2952(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3389 == 1) {
                arg8.method3342(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class145 var49;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var49 = var9.method4327(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class103(arg4, 10, arg5, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            if (var49 != null) {
                arg7.method3021(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3389 != 0) {
                arg8.method3340(arg2, arg3, var10, var11, var9.field3390);
            }
        } else if (arg6 >= 12) {
            class145 var24;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var24 = var9.method4327(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class103(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method3021(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3389 != 0) {
                arg8.method3340(arg2, arg3, var10, var11, var9.field3390);
            }
        } else if (arg6 == 0) {
            class145 var25;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var25 = var9.method4327(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class103(arg4, 0, arg5, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method2954(arg0, arg2, arg3, var17, var25, (class145) null, field525[arg5], 0, var20, var22);
            if (var9.field3389 != 0) {
                arg8.method3339(arg2, arg3, arg6, arg5, var9.field3390);
            }
        } else if (arg6 == 1) {
            class145 var26;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var26 = var9.method4327(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class103(arg4, 1, arg5, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method2954(arg0, arg2, arg3, var17, var26, (class145) null, field526[arg5], 0, var20, var22);
            if (var9.field3389 != 0) {
                arg8.method3339(arg2, arg3, arg6, arg5, var9.field3390);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class145 var28;
            class145 var29;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var28 = var9.method4327(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4327(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class103(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3395, true, (class145) null);
                var29 = new class103(arg4, 2, var27, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method2954(arg0, arg2, arg3, var17, var28, var29, field525[arg5], field525[var27], var20, var22);
            if (var9.field3389 != 0) {
                arg8.method3339(arg2, arg3, arg6, arg5, var9.field3390);
            }
        } else if (arg6 == 3) {
            class145 var30;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var30 = var9.method4327(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class103(arg4, 3, arg5, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method2954(arg0, arg2, arg3, var17, var30, (class145) null, field526[arg5], 0, var20, var22);
            if (var9.field3389 != 0) {
                arg8.method3339(arg2, arg3, arg6, arg5, var9.field3390);
            }
        } else if (arg6 == 9) {
            class145 var31;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var31 = var9.method4327(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class103(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method3021(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3389 != 0) {
                arg8.method3340(arg2, arg3, var10, var11, var9.field3390);
            }
        } else if (arg6 == 4) {
            class145 var32;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var32 = var9.method4327(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class103(arg4, 4, arg5, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method3051(arg0, arg2, arg3, var17, var32, (class145) null, field525[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2972(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class264.method3595(class138.method3219(var34)).field3373;
            }
            class145 var36;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var36 = var9.method4327(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class103(arg4, 4, arg5, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method3051(arg0, arg2, arg3, var17, var36, (class145) null, field525[arg5], 0, field518[arg5] * var33, field528[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2972(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class264.method3595(class138.method3219(var38)).field3373 / 2;
            }
            class145 var40;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var40 = var9.method4327(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class103(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method3051(arg0, arg2, arg3, var17, var40, (class145) null, 256, arg5, field535[arg5] * var37, field530[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class145 var42;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var42 = var9.method4327(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class103(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method3051(arg0, arg2, arg3, var17, var42, (class145) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2972(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class264.method3595(class138.method3219(var44)).field3373 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class145 var47;
            class145 var48;
            if (var9.field3395 == -1 && var9.field3413 == null) {
                var47 = var9.method4327(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4327(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class103(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3395, true, (class145) null);
                var48 = new class103(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3395, true, (class145) null);
            }
            arg7.method3051(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field535[arg5] * var43, field530[arg5] * var43, var20, var22);
        }
    }
}
