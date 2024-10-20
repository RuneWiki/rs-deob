package deob;

@ObfuscatedName("bo")
public final class class62 {

    @ObfuscatedName("bo.i")
    public static int[][][] field782 = new int[4][105][105];

    @ObfuscatedName("bo.w")
    public static byte[][][] field770 = new byte[4][104][104];

    @ObfuscatedName("bo.a")
    public static int field771 = 99;

    @ObfuscatedName("bo.n")
    public static final int[] field776 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bo.u")
    public static final int[] field777 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bo.p")
    public static final int[] field778 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bo.q")
    public static final int[] field779 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bo.d")
    public static final int[] field773 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bo.h")
    public static final int[] field787 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bo.g")
    public static int field780 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bo.x")
    public static int field783 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.i(I)V")
    public static void method469() {
        field771 = 99;
        Statics.field774 = new byte[4][104][104];
        Statics.field781 = new byte[4][104][104];
        Statics.field519 = new byte[4][104][104];
        Statics.field840 = new byte[4][104][104];
        Statics.field556 = new int[4][105][105];
        Statics.field772 = new byte[4][105][105];
        Statics.field775 = new int[105][105];
        Statics.field317 = new int[104];
        Statics.field3191 = new int[104];
        Statics.field259 = new int[104];
        Statics.field2274 = new int[104];
        Statics.field2407 = new int[104];
    }

    @ObfuscatedName("aj.w(I)V")
    public static void method685() {
        Statics.field774 = (byte[][][]) null;
        Statics.field781 = (byte[][][]) null;
        Statics.field519 = (byte[][][]) null;
        Statics.field840 = (byte[][][]) null;
        Statics.field556 = (int[][][]) null;
        Statics.field772 = (byte[][][]) null;
        Statics.field775 = (int[][]) null;
        Statics.field317 = null;
        Statics.field3191 = null;
        Statics.field259 = null;
        Statics.field2274 = null;
        Statics.field2407 = null;
    }

    @ObfuscatedName("ah.a(IIIIB)V")
    public static final void method193(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field772[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field782[0][var5][var4] = field782[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field782[0][var5][var4] = field782[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field782[0][var5][var4] = field782[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field782[0][var5][var4] = field782[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.t([BIIIIIII[Lft;B)V")
    public static final void method310(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class162[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2307[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class174 var11 = new class174(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method1547(var11, arg1, arg2 + class216.method1435(var13 & 0x7, var14 & 0x7, arg7), arg3 + class216.method4069(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method1547(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ch.s(Lfp;IIIIIII)V")
    public static final void method1547(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3061();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3061();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3061();
                }
            }
            return;
        }
        field770[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3061();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field782[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method645(var10 + 45365, var11 + 91923, 4) - 128 + (method645(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method645(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field782[arg1][arg2][arg3] = field782[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3061();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field782[0][arg2][arg3] = -var15 * 8;
                } else {
                    field782[arg1][arg2][arg3] = field782[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field781[arg1][arg2][arg3] = arg0.method2930();
                Statics.field519[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field840[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field770[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field774[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("jr.r([BIII)Z")
    public static final boolean method4369(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class174 var4 = new class174(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2893();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2893();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3061() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class256 var16 = class256.method4092(var5);
                        if (var13 != 22 || !client.field931 || var16.field3489 != 0 || var16.field3464 == 1 || var16.field3475) {
                            if (!var16.method4157()) {
                                client.field984++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2893();
                if (var9 == 0) {
                    break;
                }
                var4.method3061();
            }
        }
    }

    @ObfuscatedName("t.v([BIIIIIIILew;[Lft;I)V")
    public static final void method12(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class140 arg8, class162[] arg9) {
        class174 var10 = new class174(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2893();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2893();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3061();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class256 var21 = class256.method4092(var11);
                    int var22 = arg2 + class216.method10(var16 & 0x7, var15 & 0x7, arg7, var21.field3462, var21.field3450, var20);
                    int var23 = arg3 + class216.method707(var16 & 0x7, var15 & 0x7, arg7, var21.field3462, var21.field3450, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field770[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class162 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method3585(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hg.y(IIIIIILew;Lft;I)V")
    public static final void method3585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class140 arg6, class162 arg7) {
        if (client.field931 && (field770[0][arg1][arg2] & 0x2) == 0 && (field770[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field771) {
            field771 = arg0;
        }
        class256 var8 = class256.method4092(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3450;
            var10 = var8.field3462;
        } else {
            var9 = var8.field3462;
            var10 = var8.field3450;
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
        int[][] var15 = field782[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3489 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3452 == 1) {
            var20 += 256;
        }
        if (var8.method4165()) {
            class83 var21 = new class83();
            var21.field1340 = arg0;
            var21.field1341 = arg1 * 128;
            var21.field1342 = arg2 * 128;
            int var22 = var8.field3462;
            int var23 = var8.field3450;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3450;
                var23 = var8.field3462;
            }
            var21.field1353 = (arg1 + var22) * 128;
            var21.field1344 = (arg2 + var23) * 128;
            var21.field1339 = var8.field3491;
            var21.field1345 = var8.field3492 * 128;
            var21.field1348 = var8.field3493;
            var21.field1349 = var8.field3494;
            var21.field1354 = var8.field3495;
            if (var8.field3473 != null) {
                var21.field1346 = var8;
                var21.method1484();
            }
            class83.field1350.method3322(var21);
            if (var21.field1354 != null) {
                var21.field1351 = var21.field1348 + (int) (Math.random() * (double) (var21.field1349 - var21.field1348));
            }
        }
        if (arg5 == 22) {
            if (!client.field931 || var8.field3489 != 0 || var8.field3464 == 1 || var8.field3475) {
                class142 var24;
                if (var8.field3470 == -1 && var8.field3473 == null) {
                    var24 = var8.method4154(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class101(arg3, 22, arg4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
                }
                arg6.method2449(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3464 == 1 && arg7 != null) {
                    arg7.method2756(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class142 var47;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var47 = var8.method4154(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class101(arg3, 10, arg4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            if (var47 != null && arg6.method2455(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3478) {
                int var48 = 15;
                if (var47 instanceof class134) {
                    var48 = ((class134) var47).method2329() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field772[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field772[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2745(arg1, arg2, var9, var10, var8.field3457);
            }
        } else if (arg5 >= 12) {
            class142 var25;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var25 = var8.method4154(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2455(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field556[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2745(arg1, arg2, var9, var10, var8.field3457);
            }
        } else if (arg5 == 0) {
            class142 var26;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var26 = var8.method4154(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class101(arg3, 0, arg4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2451(arg0, arg1, arg2, var16, var26, (class142) null, field776[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3478) {
                    Statics.field772[arg0][arg1][arg2] = 50;
                    Statics.field772[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3449) {
                    Statics.field556[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3478) {
                    Statics.field772[arg0][arg1][arg2 + 1] = 50;
                    Statics.field772[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3449) {
                    Statics.field556[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3478) {
                    Statics.field772[arg0][arg1 + 1][arg2] = 50;
                    Statics.field772[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3449) {
                    Statics.field556[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3478) {
                    Statics.field772[arg0][arg1][arg2] = 50;
                    Statics.field772[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3449) {
                    Statics.field556[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2760(arg1, arg2, arg5, arg4, var8.field3457);
            }
            if (var8.field3463 != 16) {
                arg6.method2621(arg0, arg1, arg2, var8.field3463);
            }
        } else if (arg5 == 1) {
            class142 var27;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var27 = var8.method4154(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class101(arg3, 1, arg4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2451(arg0, arg1, arg2, var16, var27, (class142) null, field777[arg4], 0, var19, var20);
            if (var8.field3478) {
                if (arg4 == 0) {
                    Statics.field772[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field772[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field772[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field772[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2760(arg1, arg2, arg5, arg4, var8.field3457);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class142 var29;
            class142 var30;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var29 = var8.method4154(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4154(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class101(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
                var30 = new class101(arg3, 2, var28, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2451(arg0, arg1, arg2, var16, var29, var30, field776[arg4], field776[var28], var19, var20);
            if (var8.field3449) {
                if (arg4 == 0) {
                    Statics.field556[arg0][arg1][arg2] |= 0x249;
                    Statics.field556[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field556[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field556[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field556[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field556[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field556[arg0][arg1][arg2] |= 0x492;
                    Statics.field556[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2760(arg1, arg2, arg5, arg4, var8.field3457);
            }
            if (var8.field3463 != 16) {
                arg6.method2621(arg0, arg1, arg2, var8.field3463);
            }
        } else if (arg5 == 3) {
            class142 var31;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var31 = var8.method4154(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class101(arg3, 3, arg4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2451(arg0, arg1, arg2, var16, var31, (class142) null, field777[arg4], 0, var19, var20);
            if (var8.field3478) {
                if (arg4 == 0) {
                    Statics.field772[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field772[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field772[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field772[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2760(arg1, arg2, arg5, arg4, var8.field3457);
            }
        } else if (arg5 == 9) {
            class142 var32;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var32 = var8.method4154(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2455(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2745(arg1, arg2, var9, var10, var8.field3457);
            }
            if (var8.field3463 != 16) {
                arg6.method2621(arg0, arg1, arg2, var8.field3463);
            }
        } else if (arg5 == 4) {
            class142 var33;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var33 = var8.method4154(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2452(arg0, arg1, arg2, var16, var33, (class142) null, field776[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2468(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class256.method4092(var35 >> 14 & 0x7FFF).field3463;
            }
            class142 var36;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var36 = var8.method4154(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2452(arg0, arg1, arg2, var16, var36, (class142) null, field776[arg4], 0, field778[arg4] * var34, field779[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2468(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class256.method4092(var38 >> 14 & 0x7FFF).field3463 / 2;
            }
            class142 var39;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var39 = var8.method4154(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2452(arg0, arg1, arg2, var16, var39, (class142) null, 256, arg4, field773[arg4] * var37, field787[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class142 var41;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var41 = var8.method4154(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class101(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2452(arg0, arg1, arg2, var16, var41, (class142) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2468(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class256.method4092(var43 >> 14 & 0x7FFF).field3463 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class142 var45;
            class142 var46;
            if (var8.field3470 == -1 && var8.field3473 == null) {
                var45 = var8.method4154(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4154(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
                var46 = new class101(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3470, true, (class142) null);
            }
            arg6.method2452(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field773[arg4] * var42, field787[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("client.j(Lew;[Lft;I)V")
    public static final void method1398(class140 arg0, class162[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field770[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field770[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2747(var3, var4);
                        }
                    }
                }
            }
        }
        field780 += (int) (Math.random() * 5.0D) - 2;
        if (field780 < -8) {
            field780 = -8;
        }
        if (field780 > 8) {
            field780 = 8;
        }
        field783 += (int) (Math.random() * 5.0D) - 2;
        if (field783 < -16) {
            field783 = -16;
        }
        if (field783 > 16) {
            field783 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field772[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field782[var6][var11 + 1][var10] - field782[var6][var11 - 1][var10];
                    int var13 = field782[var6][var11][var10 + 1] - field782[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field775[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field317[var20] = 0;
                Statics.field3191[var20] = 0;
                Statics.field259[var20] = 0;
                Statics.field2274[var20] = 0;
                Statics.field2407[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field774[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class247 var25 = class247.method3728(var24 - 1);
                            Statics.field317[var22] += var25.field3352;
                            Statics.field3191[var22] += var25.field3349;
                            Statics.field259[var22] += var25.field3354;
                            Statics.field2274[var22] += var25.field3355;
                            var10002 = Statics.field2407[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field774[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class247 var28 = class247.method3728(var27 - 1);
                            Statics.field317[var22] -= var28.field3352;
                            Statics.field3191[var22] -= var28.field3349;
                            Statics.field259[var22] -= var28.field3354;
                            Statics.field2274[var22] -= var28.field3355;
                            var10002 = Statics.field2407[var22]--;
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
                            var29 += Statics.field317[var35];
                            var30 += Statics.field3191[var35];
                            var31 += Statics.field259[var35];
                            var32 += Statics.field2274[var35];
                            var33 += Statics.field2407[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field317[var36];
                            var30 -= Statics.field3191[var36];
                            var31 -= Statics.field259[var36];
                            var32 -= Statics.field2274[var36];
                            var33 -= Statics.field2407[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field931 || (field770[0][var21][var34] & 0x2) != 0 || (field770[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field771) {
                                field771 = var6;
                            }
                            int var37 = Statics.field774[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field781[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field782[var6][var21][var34];
                                int var40 = field782[var6][var21 + 1][var34];
                                int var41 = field782[var6][var21 + 1][var34 + 1];
                                int var42 = field782[var6][var21][var34 + 1];
                                int var43 = Statics.field775[var21][var34];
                                int var44 = Statics.field775[var21 + 1][var34];
                                int var45 = Statics.field775[var21 + 1][var34 + 1];
                                int var46 = Statics.field775[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method3500(var49, var50, var51);
                                    int var52 = field780 + var49 & 0xFF;
                                    int var53 = field783 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method3500(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field519[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class260.method1563(var38 - 1).field3593) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field556[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class137.field2042[method993(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2444(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method993(var47, var43), method993(var47, var44), method993(var47, var45), method993(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field519[var6][var21][var34] + 1;
                                    byte var57 = Statics.field840[var6][var21][var34];
                                    class260 var58 = class260.method1563(var38 - 1);
                                    int var59 = var58.field3598;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field2029.method2162(var59);
                                        var61 = -1;
                                    } else if (var58.field3604 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method3500(var58.field3599, var58.field3600, var58.field3601);
                                        int var62 = field780 + var58.field3599 & 0xFF;
                                        int var63 = field783 + var58.field3601;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method3500(var62, var58.field3600, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class137.field2042[method496(var60, 96)];
                                    }
                                    if (var58.field3602 != -1) {
                                        int var65 = field780 + var58.field3597 & 0xFF;
                                        int var66 = field783 + var58.field3595;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method3500(var65, var58.field3603, var66);
                                        var64 = class137.field2042[method496(var67, 96)];
                                    }
                                    arg0.method2444(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method993(var47, var43), method993(var47, var44), method993(var47, var45), method993(var47, var46), method496(var61, var43), method496(var61, var44), method496(var61, var45), method496(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method2447(var6, var69, var68, method2261(var6, var69, var68));
                }
            }
            Statics.field774[var6] = (byte[][]) null;
            Statics.field781[var6] = (byte[][]) null;
            Statics.field519[var6] = (byte[][]) null;
            Statics.field840[var6] = (byte[][]) null;
            Statics.field772[var6] = (byte[][]) null;
        }
        arg0.method2473(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field770[1][var70][var71] & 0x2) == 2) {
                    arg0.method2542(var70, var71);
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
                        if ((Statics.field556[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field556[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field556[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label337: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field556[var81 - 1][var78][var83] & var72) == 0) {
                                        break label337;
                                    }
                                }
                                var81--;
                            }
                            label326: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field556[var82 + 1][var78][var84] & var72) == 0) {
                                        break label326;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field782[var82][var78][var79] - var86;
                                int var88 = field782[var81][var78][var79];
                                class140.method2446(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field556[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field556[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field556[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field556[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label390: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field556[var93 - 1][var95][var77] & var73) == 0) {
                                        break label390;
                                    }
                                }
                                var93--;
                            }
                            label379: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field556[var94 + 1][var96][var77] & var73) == 0) {
                                        break label379;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field782[var94][var91][var77] - var98;
                                int var100 = field782[var93][var91][var77];
                                class140.method2446(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field556[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field556[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field556[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field556[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label443: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field556[var76][var103 - 1][var107] & var74) == 0) {
                                        break label443;
                                    }
                                }
                                var103--;
                            }
                            label432: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field556[var76][var104 + 1][var108] & var74) == 0) {
                                        break label432;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field782[var76][var103][var105];
                                class140.method2446(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field556[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ef.k(IIII)I")
    public static int method2261(int arg0, int arg1, int arg2) {
        if ((field770[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field770[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ag.e(IIII)I")
    public static final int method645(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method114(var3, var5);
        int var8 = method114(var3 + 1, var5);
        int var9 = method114(var3, var5 + 1);
        int var10 = method114(var3 + 1, var5 + 1);
        int var11 = 65536 - class137.field2023[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class137.field2023[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class137.field2023[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("f.o(III)I")
    public static final int method114(int arg0, int arg1) {
        int var2 = method2709(arg0 - 1, arg1 - 1) + method2709(arg0 + 1, arg1 - 1) + method2709(arg0 - 1, arg1 + 1) + method2709(arg0 + 1, arg1 + 1);
        int var3 = method2709(arg0 - 1, arg1) + method2709(arg0 + 1, arg1) + method2709(arg0, arg1 - 1) + method2709(arg0, arg1 + 1);
        int var4 = method2709(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("fb.z(III)I")
    public static final int method2709(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bo.l(IIB)I")
    public static final int method993(int arg0, int arg1) {
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

    @ObfuscatedName("ac.c(III)I")
    public static final int method496(int arg0, int arg1) {
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

    @ObfuscatedName("gl.b(IIII)I")
    public static final int method3500(int arg0, int arg1, int arg2) {
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
