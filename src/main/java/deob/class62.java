package deob;

@ObfuscatedName("bb")
public final class class62 {

    @ObfuscatedName("bb.e")
    public static int[][][] field749 = new int[4][105][105];

    @ObfuscatedName("bb.o")
    public static byte[][][] field759 = new byte[4][104][104];

    @ObfuscatedName("bb.m")
    public static int field750 = 99;

    @ObfuscatedName("bb.z")
    public static final int[] field758 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bb.y")
    public static final int[] field757 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bb.p")
    public static final int[] field767 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bb.l")
    public static final int[] field753 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bb.x")
    public static final int[] field762 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bb.r")
    public static final int[] field748 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bb.t")
    public static int field764 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bb.a")
    public static int field765 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fz.e(IIIII)V")
    public static final void method2819(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field760[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field749[0][var5][var4] = field749[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field749[0][var5][var4] = field749[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field749[0][var5][var4] = field749[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field749[0][var5][var4] = field749[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.m(Lfw;IIIIIII)V")
    public static final void method2661(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2891();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2891();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2891();
                }
            }
            return;
        }
        field759[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2891();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field749[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method136(var10 + 45365, var11 + 91923, 4) - 128 + (method136(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method136(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field749[arg1][arg2][arg3] = field749[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2891();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field749[0][arg2][arg3] = -var15 * 8;
                } else {
                    field749[arg1][arg2][arg3] = field749[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field474[arg1][arg2][arg3] = arg0.method2944();
                Statics.field751[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field763[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field759[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field291[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("br.g([BIIB)Z")
    public static final boolean method990(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class174 var4 = new class174(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2904();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2904();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2891() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class256 var16 = class256.method4379(var5);
                        if (var13 != 22 || !client.field1066 || var16.field3430 != 0 || var16.field3443 == 1 || var16.field3453) {
                            if (!var16.method4149()) {
                                client.field1083++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2904();
                if (var9 == 0) {
                    break;
                }
                var4.method2891();
            }
        }
    }

    @ObfuscatedName("ex.d([BIILec;[Lfe;B)V")
    public static final void method2645(byte[] arg0, int arg1, int arg2, class140 arg3, class162[] arg4) {
        class174 var5 = new class174(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2904();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2904();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2891();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field759[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class162 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method984(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bc.b(IIIIIILec;Lfe;I)V")
    public static final void method984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class140 arg6, class162 arg7) {
        if (client.field1066 && (field759[0][arg1][arg2] & 0x2) == 0 && (field759[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field750) {
            field750 = arg0;
        }
        class256 var8 = class256.method4379(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3431;
            var10 = var8.field3436;
        } else {
            var9 = var8.field3436;
            var10 = var8.field3431;
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
        int[][] var15 = field749[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3430 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3455 == 1) {
            var20 += 256;
        }
        if (var8.method4194()) {
            class83 var21 = new class83();
            var21.field1321 = arg0;
            var21.field1322 = arg1 * 128;
            var21.field1323 = arg2 * 128;
            int var22 = var8.field3436;
            int var23 = var8.field3431;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3431;
                var23 = var8.field3436;
            }
            var21.field1331 = (arg1 + var22) * 128;
            var21.field1320 = (arg2 + var23) * 128;
            var21.field1327 = var8.field3442;
            var21.field1337 = var8.field3460 * 128;
            var21.field1329 = var8.field3461;
            var21.field1324 = var8.field3462;
            var21.field1332 = var8.field3463;
            if (var8.field3437 != null) {
                var21.field1334 = var8;
                var21.method1458();
            }
            class83.field1333.method3318(var21);
            if (var21.field1332 != null) {
                var21.field1326 = var21.field1329 + (int) (Math.random() * (double) (var21.field1324 - var21.field1329));
            }
        }
        if (arg5 == 22) {
            if (!client.field1066 || var8.field3430 != 0 || var8.field3443 == 1 || var8.field3453) {
                class142 var24;
                if (var8.field3438 == -1 && var8.field3437 == null) {
                    var24 = var8.method4150(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class101(arg3, 22, arg4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
                }
                arg6.method2466(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3443 == 1 && arg7 != null) {
                    arg7.method2766(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class142 var47;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var47 = var8.method4150(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class101(arg3, 10, arg4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            if (var47 != null && arg6.method2470(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3446) {
                int var48 = 15;
                if (var47 instanceof class134) {
                    var48 = ((class134) var47).method2283() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field760[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field760[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3443 != 0 && arg7 != null) {
                arg7.method2790(arg1, arg2, var9, var10, var8.field3433);
            }
        } else if (arg5 >= 12) {
            class142 var25;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var25 = var8.method4150(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2470(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2608[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3443 != 0 && arg7 != null) {
                arg7.method2790(arg1, arg2, var9, var10, var8.field3433);
            }
        } else if (arg5 == 0) {
            class142 var26;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var26 = var8.method4150(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class101(arg3, 0, arg4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2468(arg0, arg1, arg2, var16, var26, (class142) null, field758[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3446) {
                    Statics.field760[arg0][arg1][arg2] = 50;
                    Statics.field760[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3432) {
                    Statics.field2608[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3446) {
                    Statics.field760[arg0][arg1][arg2 + 1] = 50;
                    Statics.field760[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3432) {
                    Statics.field2608[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3446) {
                    Statics.field760[arg0][arg1 + 1][arg2] = 50;
                    Statics.field760[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3432) {
                    Statics.field2608[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3446) {
                    Statics.field760[arg0][arg1][arg2] = 50;
                    Statics.field760[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3432) {
                    Statics.field2608[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3443 != 0 && arg7 != null) {
                arg7.method2763(arg1, arg2, arg5, arg4, var8.field3433);
            }
            if (var8.field3429 != 16) {
                arg6.method2476(arg0, arg1, arg2, var8.field3429);
            }
        } else if (arg5 == 1) {
            class142 var27;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var27 = var8.method4150(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class101(arg3, 1, arg4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2468(arg0, arg1, arg2, var16, var27, (class142) null, field757[arg4], 0, var19, var20);
            if (var8.field3446) {
                if (arg4 == 0) {
                    Statics.field760[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field760[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field760[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field760[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3443 != 0 && arg7 != null) {
                arg7.method2763(arg1, arg2, arg5, arg4, var8.field3433);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class142 var29;
            class142 var30;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var29 = var8.method4150(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4150(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class101(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
                var30 = new class101(arg3, 2, var28, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2468(arg0, arg1, arg2, var16, var29, var30, field758[arg4], field758[var28], var19, var20);
            if (var8.field3432) {
                if (arg4 == 0) {
                    Statics.field2608[arg0][arg1][arg2] |= 0x249;
                    Statics.field2608[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2608[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2608[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2608[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2608[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2608[arg0][arg1][arg2] |= 0x492;
                    Statics.field2608[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3443 != 0 && arg7 != null) {
                arg7.method2763(arg1, arg2, arg5, arg4, var8.field3433);
            }
            if (var8.field3429 != 16) {
                arg6.method2476(arg0, arg1, arg2, var8.field3429);
            }
        } else if (arg5 == 3) {
            class142 var31;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var31 = var8.method4150(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class101(arg3, 3, arg4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2468(arg0, arg1, arg2, var16, var31, (class142) null, field757[arg4], 0, var19, var20);
            if (var8.field3446) {
                if (arg4 == 0) {
                    Statics.field760[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field760[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field760[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field760[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3443 != 0 && arg7 != null) {
                arg7.method2763(arg1, arg2, arg5, arg4, var8.field3433);
            }
        } else if (arg5 == 9) {
            class142 var32;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var32 = var8.method4150(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2470(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3443 != 0 && arg7 != null) {
                arg7.method2790(arg1, arg2, var9, var10, var8.field3433);
            }
            if (var8.field3429 != 16) {
                arg6.method2476(arg0, arg1, arg2, var8.field3429);
            }
        } else if (arg5 == 4) {
            class142 var33;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var33 = var8.method4150(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2469(arg0, arg1, arg2, var16, var33, (class142) null, field758[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2606(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class256.method4379(var35 >> 14 & 0x7FFF).field3429;
            }
            class142 var36;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var36 = var8.method4150(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2469(arg0, arg1, arg2, var16, var36, (class142) null, field758[arg4], 0, field767[arg4] * var34, field753[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2606(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class256.method4379(var38 >> 14 & 0x7FFF).field3429 / 2;
            }
            class142 var39;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var39 = var8.method4150(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2469(arg0, arg1, arg2, var16, var39, (class142) null, 256, arg4, field762[arg4] * var37, field748[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class142 var41;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var41 = var8.method4150(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class101(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2469(arg0, arg1, arg2, var16, var41, (class142) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2606(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class256.method4379(var43 >> 14 & 0x7FFF).field3429 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class142 var45;
            class142 var46;
            if (var8.field3438 == -1 && var8.field3437 == null) {
                var45 = var8.method4150(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4150(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
                var46 = new class101(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3438, true, (class142) null);
            }
            arg6.method2469(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field762[arg4] * var42, field748[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("hc.k(Lec;[Lfe;I)V")
    public static final void method3714(class140 arg0, class162[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field759[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field759[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2765(var3, var4);
                        }
                    }
                }
            }
        }
        field764 += (int) (Math.random() * 5.0D) - 2;
        if (field764 < -8) {
            field764 = -8;
        }
        if (field764 > 8) {
            field764 = 8;
        }
        field765 += (int) (Math.random() * 5.0D) - 2;
        if (field765 < -16) {
            field765 = -16;
        }
        if (field765 > 16) {
            field765 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field760[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field749[var6][var11 + 1][var10] - field749[var6][var11 - 1][var10];
                    int var13 = field749[var6][var11][var10 + 1] - field749[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field754[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field3734[var20] = 0;
                Statics.field3373[var20] = 0;
                Statics.field755[var20] = 0;
                Statics.field278[var20] = 0;
                Statics.field635[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field291[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class247 var25 = class247.method2800(var24 - 1);
                            Statics.field3734[var22] += var25.field3316;
                            Statics.field3373[var22] += var25.field3320;
                            Statics.field755[var22] += var25.field3321;
                            Statics.field278[var22] += var25.field3322;
                            var10002 = Statics.field635[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field291[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class247 var28 = class247.method2800(var27 - 1);
                            Statics.field3734[var22] -= var28.field3316;
                            Statics.field3373[var22] -= var28.field3320;
                            Statics.field755[var22] -= var28.field3321;
                            Statics.field278[var22] -= var28.field3322;
                            var10002 = Statics.field635[var22]--;
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
                            var29 += Statics.field3734[var35];
                            var30 += Statics.field3373[var35];
                            var31 += Statics.field755[var35];
                            var32 += Statics.field278[var35];
                            var33 += Statics.field635[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field3734[var36];
                            var30 -= Statics.field3373[var36];
                            var31 -= Statics.field755[var36];
                            var32 -= Statics.field278[var36];
                            var33 -= Statics.field635[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field1066 || (field759[0][var21][var34] & 0x2) != 0 || (field759[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field750) {
                                field750 = var6;
                            }
                            int var37 = Statics.field291[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field474[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field749[var6][var21][var34];
                                int var40 = field749[var6][var21 + 1][var34];
                                int var41 = field749[var6][var21 + 1][var34 + 1];
                                int var42 = field749[var6][var21][var34 + 1];
                                int var43 = Statics.field754[var21][var34];
                                int var44 = Statics.field754[var21 + 1][var34];
                                int var45 = Statics.field754[var21 + 1][var34 + 1];
                                int var46 = Statics.field754[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method3737(var49, var50, var51);
                                    int var52 = field764 + var49 & 0xFF;
                                    int var53 = field765 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method3737(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field751[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class260.method3909(var38 - 1).field3571) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field2608[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class137.field2030[method2649(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2465(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method2649(var47, var43), method2649(var47, var44), method2649(var47, var45), method2649(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field751[var6][var21][var34] + 1;
                                    byte var57 = Statics.field763[var6][var21][var34];
                                    class260 var58 = class260.method3909(var38 - 1);
                                    int var59 = var58.field3570;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field2031.method2156(var59);
                                        var61 = -1;
                                    } else if (var58.field3569 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method3737(var58.field3573, var58.field3574, var58.field3572);
                                        int var62 = field764 + var58.field3573 & 0xFF;
                                        int var63 = field765 + var58.field3572;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method3737(var62, var58.field3574, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class137.field2030[method2873(var60, 96)];
                                    }
                                    if (var58.field3568 != -1) {
                                        int var65 = field764 + var58.field3576 & 0xFF;
                                        int var66 = field765 + var58.field3578;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method3737(var65, var58.field3567, var66);
                                        var64 = class137.field2030[method2873(var67, 96)];
                                    }
                                    arg0.method2465(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method2649(var47, var43), method2649(var47, var44), method2649(var47, var45), method2649(var47, var46), method2873(var61, var43), method2873(var61, var44), method2873(var61, var45), method2873(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field759[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field759[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2464(var6, var69, var68, var74);
                }
            }
            Statics.field291[var6] = (byte[][]) null;
            Statics.field474[var6] = (byte[][]) null;
            Statics.field751[var6] = (byte[][]) null;
            Statics.field763[var6] = (byte[][]) null;
            Statics.field760[var6] = (byte[][]) null;
        }
        arg0.method2517(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field759[1][var75][var76] & 0x2) == 2) {
                    arg0.method2589(var75, var76);
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
                        if ((Statics.field2608[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field2608[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field2608[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field2608[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field2608[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field749[var87][var83][var84] - var91;
                                int var93 = field749[var86][var83][var84];
                                class140.method2463(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field2608[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2608[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field2608[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field2608[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field2608[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field2608[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field749[var99][var96][var82] - var103;
                                int var105 = field749[var98][var96][var82];
                                class140.method2463(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field2608[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2608[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field2608[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field2608[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field2608[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field2608[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field749[var81][var108][var110];
                                class140.method2463(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field2608[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.q(IIII)I")
    public static final int method136(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2861(var3, var5);
        int var8 = method2861(var3 + 1, var5);
        int var9 = method2861(var3, var5 + 1);
        int var10 = method2861(var3 + 1, var5 + 1);
        int var11 = 65536 - class137.field2035[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class137.field2035[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class137.field2035[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("fd.h(III)I")
    public static final int method2861(int arg0, int arg1) {
        int var2 = method156(arg0 - 1, arg1 - 1) + method156(arg0 + 1, arg1 - 1) + method156(arg0 - 1, arg1 + 1) + method156(arg0 + 1, arg1 + 1);
        int var3 = method156(arg0 - 1, arg1) + method156(arg0 + 1, arg1) + method156(arg0, arg1 - 1) + method156(arg0, arg1 + 1);
        int var4 = method156(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("a.i(III)I")
    public static final int method156(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ew.s(III)I")
    public static final int method2649(int arg0, int arg1) {
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

    @ObfuscatedName("fl.n(III)I")
    public static final int method2873(int arg0, int arg1) {
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

    @ObfuscatedName("ho.c(IIII)I")
    public static final int method3737(int arg0, int arg1, int arg2) {
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
