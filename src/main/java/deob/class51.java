package deob;

@ObfuscatedName("al")
public final class class51 {

    @ObfuscatedName("al.w")
    public static int[][][] field448 = new int[4][105][105];

    @ObfuscatedName("al.m")
    public static byte[][][] field446 = new byte[4][104][104];

    @ObfuscatedName("al.q")
    public static int field447 = 99;

    @ObfuscatedName("al.t")
    public static final int[] field455 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("al.u")
    public static final int[] field454 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("al.i")
    public static final int[] field457 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("al.z")
    public static final int[] field458 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("al.k")
    public static final int[] field459 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("al.r")
    public static final int[] field460 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("al.v")
    public static int field463 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("al.o")
    public static int field462 = (int) (Math.random() * 33.0D) - 16;

    public class51() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.w(I)V")
    public static void method3184() {
        field447 = 99;
        Statics.field451 = new byte[4][104][104];
        Statics.field1896 = new byte[4][104][104];
        Statics.field1056 = new byte[4][104][104];
        Statics.field449 = new byte[4][104][104];
        Statics.field535 = new int[4][105][105];
        Statics.field450 = new byte[4][105][105];
        Statics.field163 = new int[105][105];
        Statics.field461 = new int[104];
        Statics.field98 = new int[104];
        Statics.field452 = new int[104];
        Statics.field312 = new int[104];
        Statics.field453 = new int[104];
    }

    @ObfuscatedName("fr.m(I)V")
    public static void method3168() {
        Statics.field451 = (byte[][][]) null;
        Statics.field1896 = (byte[][][]) null;
        Statics.field1056 = (byte[][][]) null;
        Statics.field449 = (byte[][][]) null;
        Statics.field535 = (int[][][]) null;
        Statics.field450 = (byte[][][]) null;
        Statics.field163 = (int[][]) null;
        Statics.field461 = null;
        Statics.field98 = null;
        Statics.field452 = null;
        Statics.field312 = null;
        Statics.field453 = null;
    }

    @ObfuscatedName("bi.q(IIIII)V")
    public static final void method1485(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field450[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field448[0][var5][var4] = field448[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field448[0][var5][var4] = field448[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field448[0][var5][var4] = field448[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field448[0][var5][var4] = field448[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.x(Lgy;IIIIIII)V")
    public static final void method677(class183 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method3436();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method3436();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method3436();
                }
            }
            return;
        }
        field446[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3436();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field448[0][arg2][arg3] = -method1844(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field448[arg1][arg2][arg3] = field448[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method3436();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field448[0][arg2][arg3] = -var8 * 8;
                } else {
                    field448[arg1][arg2][arg3] = field448[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1896[arg1][arg2][arg3] = arg0.method3263();
                Statics.field1056[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field449[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field446[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field451[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("as.j([BIII)Z")
    public static final boolean method531(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class183 var4 = new class183(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3277();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3293();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3436() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class269 var16 = class269.method675(var5);
                        if (var13 != 22 || !client.field709 || var16.field3409 != 0 || var16.field3407 == 1 || var16.field3428) {
                            if (!var16.method4659()) {
                                client.field648++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3293();
                if (var9 == 0) {
                    break;
                }
                var4.method3436();
            }
        }
    }

    @ObfuscatedName("ge.a(IIIIIILdt;Lfm;I)V")
    public static final void method3586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class126 arg6, class165 arg7) {
        if (client.field709 && (field446[0][arg1][arg2] & 0x2) == 0 && (field446[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field447) {
            field447 = arg0;
        }
        class269 var8 = class269.method675(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3421;
            var10 = var8.field3405;
        } else {
            var9 = var8.field3405;
            var10 = var8.field3421;
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
        int[][] var15 = field448[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = Statics.method1038(arg1, arg2, 2, var8.field3409 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3430 == 1) {
            var21 += 256;
        }
        if (var8.method4675()) {
            class69.method4863(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field709 || var8.field3409 != 0 || var8.field3407 == 1 || var8.field3428) {
                class128 var22;
                if (var8.field3413 == -1 && var8.field3431 == null) {
                    var22 = var8.method4664(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class86(arg3, 22, arg4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
                }
                arg6.method2694(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3407 == 1 && arg7 != null) {
                    arg7.method3121(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class128 var48;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var48 = var8.method4664(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class86(arg3, 10, arg4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            if (var48 != null && arg6.method2698(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3400) {
                int var49 = 15;
                if (var48 instanceof class120) {
                    var49 = ((class120) var48).method2514() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field450[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field450[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3407 != 0 && arg7 != null) {
                arg7.method3112(arg1, arg2, var9, var10, var8.field3408);
            }
        } else if (arg5 >= 12) {
            class128 var23;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var23 = var8.method4664(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class86(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2698(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field535[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3407 != 0 && arg7 != null) {
                arg7.method3112(arg1, arg2, var9, var10, var8.field3408);
            }
        } else if (arg5 == 0) {
            class128 var24;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var24 = var8.method4664(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class86(arg3, 0, arg4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2696(arg0, arg1, arg2, var16, var24, (class128) null, field455[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3400) {
                    Statics.field450[arg0][arg1][arg2] = 50;
                    Statics.field450[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3394) {
                    Statics.field535[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3400) {
                    Statics.field450[arg0][arg1][arg2 + 1] = 50;
                    Statics.field450[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3394) {
                    Statics.field535[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3400) {
                    Statics.field450[arg0][arg1 + 1][arg2] = 50;
                    Statics.field450[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3394) {
                    Statics.field535[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3400) {
                    Statics.field450[arg0][arg1][arg2] = 50;
                    Statics.field450[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3394) {
                    Statics.field535[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3407 != 0 && arg7 != null) {
                arg7.method3111(arg1, arg2, arg5, arg4, var8.field3408);
            }
            if (var8.field3414 != 16) {
                arg6.method2817(arg0, arg1, arg2, var8.field3414);
            }
        } else if (arg5 == 1) {
            class128 var25;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var25 = var8.method4664(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class86(arg3, 1, arg4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2696(arg0, arg1, arg2, var16, var25, (class128) null, field454[arg4], 0, var19, var21);
            if (var8.field3400) {
                if (arg4 == 0) {
                    Statics.field450[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field450[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field450[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field450[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3407 != 0 && arg7 != null) {
                arg7.method3111(arg1, arg2, arg5, arg4, var8.field3408);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class128 var27;
            class128 var28;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var27 = var8.method4664(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4664(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class86(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
                var28 = new class86(arg3, 2, var26, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2696(arg0, arg1, arg2, var16, var27, var28, field455[arg4], field455[var26], var19, var21);
            if (var8.field3394) {
                if (arg4 == 0) {
                    Statics.field535[arg0][arg1][arg2] |= 0x249;
                    Statics.field535[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field535[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field535[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field535[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field535[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field535[arg0][arg1][arg2] |= 0x492;
                    Statics.field535[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3407 != 0 && arg7 != null) {
                arg7.method3111(arg1, arg2, arg5, arg4, var8.field3408);
            }
            if (var8.field3414 != 16) {
                arg6.method2817(arg0, arg1, arg2, var8.field3414);
            }
        } else if (arg5 == 3) {
            class128 var29;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var29 = var8.method4664(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class86(arg3, 3, arg4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2696(arg0, arg1, arg2, var16, var29, (class128) null, field454[arg4], 0, var19, var21);
            if (var8.field3400) {
                if (arg4 == 0) {
                    Statics.field450[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field450[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field450[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field450[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3407 != 0 && arg7 != null) {
                arg7.method3111(arg1, arg2, arg5, arg4, var8.field3408);
            }
        } else if (arg5 == 9) {
            class128 var30;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var30 = var8.method4664(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class86(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2698(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3407 != 0 && arg7 != null) {
                arg7.method3112(arg1, arg2, var9, var10, var8.field3408);
            }
            if (var8.field3414 != 16) {
                arg6.method2817(arg0, arg1, arg2, var8.field3414);
            }
        } else if (arg5 == 4) {
            class128 var31;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var31 = var8.method4664(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class86(arg3, 4, arg4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2697(arg0, arg1, arg2, var16, var31, (class128) null, field455[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2714(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class269.method675(class121.method94(var33)).field3414;
            }
            class128 var35;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var35 = var8.method4664(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class86(arg3, 4, arg4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2697(arg0, arg1, arg2, var16, var35, (class128) null, field455[arg4], 0, field457[arg4] * var32, field458[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2714(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class269.method675(class121.method94(var37)).field3414 / 2;
            }
            class128 var39;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var39 = var8.method4664(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class86(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2697(arg0, arg1, arg2, var16, var39, (class128) null, 256, arg4, field459[arg4] * var36, field460[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class128 var41;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var41 = var8.method4664(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class86(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2697(arg0, arg1, arg2, var16, var41, (class128) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2714(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class269.method675(class121.method94(var43)).field3414 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class128 var46;
            class128 var47;
            if (var8.field3413 == -1 && var8.field3431 == null) {
                var46 = var8.method4664(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4664(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class86(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
                var47 = new class86(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3413, true, (class128) null);
            }
            arg6.method2697(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field459[arg4] * var42, field460[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("v.l(Ldt;[Lfm;I)V")
    public static final void method435(class126 arg0, class165[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field446[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field446[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3134(var3, var4);
                        }
                    }
                }
            }
        }
        field463 += (int) (Math.random() * 5.0D) - 2;
        if (field463 < -8) {
            field463 = -8;
        }
        if (field463 > 8) {
            field463 = 8;
        }
        field462 += (int) (Math.random() * 5.0D) - 2;
        if (field462 < -16) {
            field462 = -16;
        }
        if (field462 > 16) {
            field462 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field450[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field448[var6][var11 + 1][var10] - field448[var6][var11 - 1][var10];
                    int var13 = field448[var6][var11][var10 + 1] - field448[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field163[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field461[var20] = 0;
                Statics.field98[var20] = 0;
                Statics.field452[var20] = 0;
                Statics.field312[var20] = 0;
                Statics.field453[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field451[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class260 var25 = class260.method2894(var24 - 1);
                            Statics.field461[var22] += var25.field3305;
                            Statics.field98[var22] += var25.field3306;
                            Statics.field452[var22] += var25.field3307;
                            Statics.field312[var22] += var25.field3308;
                            var10002 = Statics.field453[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field451[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class260 var28 = class260.method2894(var27 - 1);
                            Statics.field461[var22] -= var28.field3305;
                            Statics.field98[var22] -= var28.field3306;
                            Statics.field452[var22] -= var28.field3307;
                            Statics.field312[var22] -= var28.field3308;
                            var10002 = Statics.field453[var22]--;
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
                            var29 += Statics.field461[var35];
                            var30 += Statics.field98[var35];
                            var31 += Statics.field452[var35];
                            var32 += Statics.field312[var35];
                            var33 += Statics.field453[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field461[var36];
                            var30 -= Statics.field98[var36];
                            var31 -= Statics.field452[var36];
                            var32 -= Statics.field312[var36];
                            var33 -= Statics.field453[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field709 || (field446[0][var21][var34] & 0x2) != 0 || (field446[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field447) {
                                field447 = var6;
                            }
                            int var37 = Statics.field451[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field1896[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field448[var6][var21][var34];
                                int var40 = field448[var6][var21 + 1][var34];
                                int var41 = field448[var6][var21 + 1][var34 + 1];
                                int var42 = field448[var6][var21][var34 + 1];
                                int var43 = Statics.field163[var21][var34];
                                int var44 = Statics.field163[var21 + 1][var34];
                                int var45 = Statics.field163[var21 + 1][var34 + 1];
                                int var46 = Statics.field163[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method3070(var49, var50, var51);
                                    int var52 = field463 + var49 & 0xFF;
                                    int var53 = field462 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method3070(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field1056[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class273.method2969(var38 - 1).field3542) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field535[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class123.field1722[method186(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2820(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method186(var47, var43), method186(var47, var44), method186(var47, var45), method186(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field1056[var6][var21][var34] + 1;
                                    byte var57 = Statics.field449[var6][var21][var34];
                                    class273 var58 = class273.method2969(var38 - 1);
                                    int var59 = var58.field3543;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1713.method2373(var59);
                                        var61 = -1;
                                    } else if (var58.field3539 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method3070(var58.field3547, var58.field3544, var58.field3545);
                                        int var62 = field463 + var58.field3547 & 0xFF;
                                        int var63 = field462 + var58.field3545;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method3070(var62, var58.field3544, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class123.field1722[method669(var60, 96)];
                                    }
                                    if (var58.field3541 != -1) {
                                        int var65 = field463 + var58.field3546 & 0xFF;
                                        int var66 = field462 + var58.field3548;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method3070(var65, var58.field3537, var66);
                                        var64 = class123.field1722[method669(var67, 96)];
                                    }
                                    arg0.method2820(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method186(var47, var43), method186(var47, var44), method186(var47, var45), method186(var47, var46), method669(var61, var43), method669(var61, var44), method669(var61, var45), method669(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field446[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field446[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2692(var6, var69, var68, var74);
                }
            }
            Statics.field451[var6] = (byte[][]) null;
            Statics.field1896[var6] = (byte[][]) null;
            Statics.field1056[var6] = (byte[][]) null;
            Statics.field449[var6] = (byte[][]) null;
            Statics.field450[var6] = (byte[][]) null;
        }
        arg0.method2731(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field446[1][var75][var76] & 0x2) == 2) {
                    arg0.method2690(var75, var76);
                }
            }
        }
        int var77 = 1;
        int var78 = 2;
        int var79 = 4;
        for (int var80 = 0; var80 < 4; var80++) {
            if (var80 > 0) {
                var77 <<= 0x3;
                var78 <<= 0x3;
                var79 <<= 0x3;
            }
            for (int var81 = 0; var81 <= var80; var81++) {
                for (int var82 = 0; var82 <= 104; var82++) {
                    for (int var83 = 0; var83 <= 104; var83++) {
                        if ((Statics.field535[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field535[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field535[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field535[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field535[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field448[var87][var83][var84] - var91;
                                int var93 = field448[var86][var83][var84];
                                class126.method2818(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field535[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field535[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field535[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field535[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field535[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field535[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field448[var99][var96][var82] - var103;
                                int var105 = field448[var98][var96][var82];
                                class126.method2818(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field535[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field535[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field535[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field535[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field535[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field535[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field448[var81][var108][var110];
                                class126.method2818(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field535[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.d(III)I")
    public static final int method1844(int arg0, int arg1) {
        int var2 = method69(arg0 + 45365, arg1 + 91923, 4) - 128 + (method69(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method69(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("n.s(IIIB)I")
    public static final int method69(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method4236(var3, var5);
        int var8 = method4236(var3 + 1, var5);
        int var9 = method4236(var3, var5 + 1);
        int var10 = method4236(var3 + 1, var5 + 1);
        int var11 = method3071(var7, var8, var4, arg2);
        int var12 = method3071(var9, var10, var4, arg2);
        return method3071(var11, var12, var6, arg2);
    }

    @ObfuscatedName("fz.p(IIIII)I")
    public static final int method3071(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class123.field1709[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ix.g(IIB)I")
    public static final int method4236(int arg0, int arg1) {
        int var2 = Statics.method473(arg0 - 1, arg1 - 1) + Statics.method473(arg0 + 1, arg1 - 1) + Statics.method473(arg0 - 1, arg1 + 1) + Statics.method473(arg0 + 1, arg1 + 1);
        int var3 = Statics.method473(arg0 - 1, arg1) + Statics.method473(arg0 + 1, arg1) + Statics.method473(arg0, arg1 - 1) + Statics.method473(arg0, arg1 + 1);
        int var4 = Statics.method473(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("c.c(III)I")
    public static final int method186(int arg0, int arg1) {
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

    @ObfuscatedName("af.e(IIB)I")
    public static final int method669(int arg0, int arg1) {
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

    @ObfuscatedName("fz.t(IIII)I")
    public static final int method3070(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ai.u(III)Z")
    public static final boolean method448(int arg0, int arg1) {
        class269 var2 = class269.method675(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4662(arg1);
    }
}
