package deob;

@ObfuscatedName("bf")
public final class class63 {

    @ObfuscatedName("bf.d")
    public static int[][][] field750 = new int[4][105][105];

    @ObfuscatedName("bf.q")
    public static byte[][][] field735 = new byte[4][104][104];

    @ObfuscatedName("bf.x")
    public static int field736 = 99;

    @ObfuscatedName("bf.n")
    public static final int[] field744 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bf.c")
    public static final int[] field747 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bf.l")
    public static final int[] field734 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bf.m")
    public static final int[] field748 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bf.a")
    public static final int[] field746 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bf.h")
    public static final int[] field749 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bf.z")
    public static int field745 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bf.j")
    public static int field751 = (int) (Math.random() * 33.0D) - 16;

    public class63() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.d(I)V")
    public static void method892() {
        field736 = 99;
        Statics.field737 = new byte[4][104][104];
        Statics.field753 = new byte[4][104][104];
        Statics.field3185 = new byte[4][104][104];
        Statics.field739 = new byte[4][104][104];
        Statics.field743 = new int[4][105][105];
        Statics.field740 = new byte[4][105][105];
        Statics.field741 = new int[105][105];
        Statics.field738 = new int[104];
        Statics.field584 = new int[104];
        Statics.field780 = new int[104];
        Statics.field1674 = new int[104];
        Statics.field642 = new int[104];
    }

    @ObfuscatedName("o.q(IIIIB)V")
    public static final void method60(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field740[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field750[0][var5][var4] = field750[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field750[0][var5][var4] = field750[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field750[0][var5][var4] = field750[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field750[0][var5][var4] = field750[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.x(IIII)V")
    public static final void method615(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field750[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field750[arg0][arg1][arg2 + var5] = field750[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field750[arg0][arg1 + var6][arg2] = field750[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field750[arg0][arg1 - 1][arg2] != 0) {
            field750[arg0][arg1][arg2] = field750[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field750[arg0][arg1][arg2 - 1] != 0) {
            field750[arg0][arg1][arg2] = field750[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field750[arg0][arg1 - 1][arg2 - 1] != 0) {
            field750[arg0][arg1][arg2] = field750[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ad.y(Lfw;IIIIIIB)V")
    public static final void method459(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2921();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2921();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2921();
                }
            }
            return;
        }
        field735[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2921();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field750[0][arg2][arg3] = -method3180(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field750[arg1][arg2][arg3] = field750[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2921();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field750[0][arg2][arg3] = -var8 * 8;
                } else {
                    field750[arg1][arg2][arg3] = field750[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field753[arg1][arg2][arg3] = arg0.method3082();
                Statics.field3185[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field739[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field735[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field737[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("hx.e([BIIB)Z")
    public static final boolean method3656(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class174 var4 = new class174(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2927();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2927();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2921() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class256 var16 = class256.method997(var5);
                        if (var13 != 22 || !client.field898 || var16.field3464 != 0 || var16.field3424 == 1 || var16.field3443) {
                            if (!var16.method4122()) {
                                client.field952++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2927();
                if (var9 == 0) {
                    break;
                }
                var4.method2921();
            }
        }
    }

    @ObfuscatedName("fh.f([BIIIIIIILef;[Lfl;B)V")
    public static final void method2877(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class140 arg8, class162[] arg9) {
        class174 var10 = new class174(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2927();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2927();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2921();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class256 var21 = class256.method997(var11);
                    int var22 = arg2 + class216.method2359(var16 & 0x7, var15 & 0x7, arg7, var21.field3431, var21.field3453, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field3431;
                    int var28 = var21.field3453;
                    if ((var20 & 0x1) == 1) {
                        int var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var30 = arg7 & 0x3;
                    int var31;
                    if (var30 == 0) {
                        var31 = var25;
                    } else if (var30 == 1) {
                        var31 = 7 - var24 - (var27 - 1);
                    } else if (var30 == 2) {
                        var31 = 7 - var25 - (var28 - 1);
                    } else {
                        var31 = var24;
                    }
                    int var32 = arg3 + var31;
                    if (var22 > 0 && var32 > 0 && var22 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field735[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class162 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method713(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.v(IIIIIILef;Lfl;I)V")
    public static final void method713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class140 arg6, class162 arg7) {
        if (client.field898 && (field735[0][arg1][arg2] & 0x2) == 0 && (field735[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field736) {
            field736 = arg0;
        }
        class256 var8 = class256.method997(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3453;
            var10 = var8.field3431;
        } else {
            var9 = var8.field3431;
            var10 = var8.field3453;
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
        int[][] var15 = field750[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3464 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3433 == 1) {
            var20 += 256;
        }
        if (var8.method4130()) {
            class83.method1009(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field898 || var8.field3464 != 0 || var8.field3424 == 1 || var8.field3443) {
                class142 var21;
                if (var8.field3439 == -1 && var8.field3457 == null) {
                    var21 = var8.method4123(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class101(arg3, 22, arg4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
                }
                arg6.method2467(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3424 == 1 && arg7 != null) {
                    arg7.method2778(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class142 var44;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var44 = var8.method4123(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class101(arg3, 10, arg4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            if (var44 != null && arg6.method2471(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3415) {
                int var45 = 15;
                if (var44 instanceof class134) {
                    var45 = ((class134) var44).method2272() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field740[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field740[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3424 != 0 && arg7 != null) {
                arg7.method2776(arg1, arg2, var9, var10, var8.field3460);
            }
        } else if (arg5 >= 12) {
            class142 var22;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var22 = var8.method4123(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2471(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field743[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3424 != 0 && arg7 != null) {
                arg7.method2776(arg1, arg2, var9, var10, var8.field3460);
            }
        } else if (arg5 == 0) {
            class142 var23;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var23 = var8.method4123(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class101(arg3, 0, arg4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2469(arg0, arg1, arg2, var16, var23, (class142) null, field744[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3415) {
                    Statics.field740[arg0][arg1][arg2] = 50;
                    Statics.field740[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3438) {
                    Statics.field743[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3415) {
                    Statics.field740[arg0][arg1][arg2 + 1] = 50;
                    Statics.field740[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3438) {
                    Statics.field743[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3415) {
                    Statics.field740[arg0][arg1 + 1][arg2] = 50;
                    Statics.field740[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3438) {
                    Statics.field743[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3415) {
                    Statics.field740[arg0][arg1][arg2] = 50;
                    Statics.field740[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3438) {
                    Statics.field743[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3424 != 0 && arg7 != null) {
                arg7.method2781(arg1, arg2, arg5, arg4, var8.field3460);
            }
            if (var8.field3436 != 16) {
                arg6.method2477(arg0, arg1, arg2, var8.field3436);
            }
        } else if (arg5 == 1) {
            class142 var24;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var24 = var8.method4123(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class101(arg3, 1, arg4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2469(arg0, arg1, arg2, var16, var24, (class142) null, field747[arg4], 0, var19, var20);
            if (var8.field3415) {
                if (arg4 == 0) {
                    Statics.field740[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field740[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field740[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field740[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3424 != 0 && arg7 != null) {
                arg7.method2781(arg1, arg2, arg5, arg4, var8.field3460);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class142 var26;
            class142 var27;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var26 = var8.method4123(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4123(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class101(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
                var27 = new class101(arg3, 2, var25, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2469(arg0, arg1, arg2, var16, var26, var27, field744[arg4], field744[var25], var19, var20);
            if (var8.field3438) {
                if (arg4 == 0) {
                    Statics.field743[arg0][arg1][arg2] |= 0x249;
                    Statics.field743[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field743[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field743[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field743[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field743[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field743[arg0][arg1][arg2] |= 0x492;
                    Statics.field743[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3424 != 0 && arg7 != null) {
                arg7.method2781(arg1, arg2, arg5, arg4, var8.field3460);
            }
            if (var8.field3436 != 16) {
                arg6.method2477(arg0, arg1, arg2, var8.field3436);
            }
        } else if (arg5 == 3) {
            class142 var28;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var28 = var8.method4123(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class101(arg3, 3, arg4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2469(arg0, arg1, arg2, var16, var28, (class142) null, field747[arg4], 0, var19, var20);
            if (var8.field3415) {
                if (arg4 == 0) {
                    Statics.field740[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field740[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field740[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field740[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3424 != 0 && arg7 != null) {
                arg7.method2781(arg1, arg2, arg5, arg4, var8.field3460);
            }
        } else if (arg5 == 9) {
            class142 var29;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var29 = var8.method4123(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2471(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3424 != 0 && arg7 != null) {
                arg7.method2776(arg1, arg2, var9, var10, var8.field3460);
            }
            if (var8.field3436 != 16) {
                arg6.method2477(arg0, arg1, arg2, var8.field3436);
            }
        } else if (arg5 == 4) {
            class142 var30;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var30 = var8.method4123(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2470(arg0, arg1, arg2, var16, var30, (class142) null, field744[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2487(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class256.method997(var32 >> 14 & 0x7FFF).field3436;
            }
            class142 var33;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var33 = var8.method4123(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2470(arg0, arg1, arg2, var16, var33, (class142) null, field744[arg4], 0, field734[arg4] * var31, field748[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2487(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class256.method997(var35 >> 14 & 0x7FFF).field3436 / 2;
            }
            class142 var36;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var36 = var8.method4123(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2470(arg0, arg1, arg2, var16, var36, (class142) null, 256, arg4, field746[arg4] * var34, field749[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class142 var38;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var38 = var8.method4123(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class101(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2470(arg0, arg1, arg2, var16, var38, (class142) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2487(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class256.method997(var40 >> 14 & 0x7FFF).field3436 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class142 var42;
            class142 var43;
            if (var8.field3439 == -1 && var8.field3457 == null) {
                var42 = var8.method4123(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4123(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
                var43 = new class101(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3439, true, (class142) null);
            }
            arg6.method2470(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field746[arg4] * var39, field749[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("gv.t(IIIB)I")
    public static int method3408(int arg0, int arg1, int arg2) {
        if ((field735[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field735[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ga.i(III)I")
    public static final int method3180(int arg0, int arg1) {
        int var2 = method472(arg0 + 45365, arg1 + 91923, 4) - 128 + (method472(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method472(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ao.r(IIII)I")
    public static final int method472(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = Statics.method1478(var3, var5);
        int var8 = Statics.method1478(var3 + 1, var5);
        int var9 = Statics.method1478(var3, var5 + 1);
        int var10 = Statics.method1478(var3 + 1, var5 + 1);
        int var11 = 65536 - class137.field1992[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class137.field1992[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class137.field1992[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("bk.s(III)I")
    public static final int method1023(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("em.o(III)I")
    public static final int method2720(int arg0, int arg1) {
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
}
