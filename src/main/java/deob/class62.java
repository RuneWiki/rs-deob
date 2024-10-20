package deob;

@ObfuscatedName("by")
public final class class62 {

    @ObfuscatedName("by.s")
    public static int[][][] field756 = new int[4][105][105];

    @ObfuscatedName("by.c")
    public static byte[][][] field750 = new byte[4][104][104];

    @ObfuscatedName("by.f")
    public static int field749 = 99;

    @ObfuscatedName("by.w")
    public static final int[] field755 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("by.i")
    public static final int[] field760 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("by.g")
    public static final int[] field758 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("by.a")
    public static final int[] field754 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("by.x")
    public static final int[] field759 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("by.b")
    public static final int[] field761 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("by.j")
    public static int field757 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("by.v")
    public static int field762 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.s(B)V")
    public static void method2695() {
        Statics.field751 = (byte[][][]) null;
        Statics.field2344 = (byte[][][]) null;
        Statics.field3299 = (byte[][][]) null;
        Statics.field753 = (byte[][][]) null;
        Statics.field249 = (int[][][]) null;
        Statics.field860 = (byte[][][]) null;
        Statics.field764 = (int[][]) null;
        Statics.field366 = null;
        Statics.field3740 = null;
        Statics.field354 = null;
        Statics.field2515 = null;
        Statics.field805 = null;
    }

    @ObfuscatedName("bo.c(IIIII)V")
    public static final void method1024(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field860[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field756[0][var5][var4] = field756[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field756[0][var5][var4] = field756[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field756[0][var5][var4] = field756[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field756[0][var5][var4] = field756[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("fu.f([BIIII[Lfb;I)V")
    public static final void method3174(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class165[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2305[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class177 var9 = new class177(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method461(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ay.m([BIIIIIII[Lfb;B)V")
    public static final void method477(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class165[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2305[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class177 var11 = new class177(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class219.method2338(var13 & 0x7, var14 & 0x7, arg7);
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
                        method461(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method461(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.t(Lfs;IIIIIII)V")
    public static final void method461(class177 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2965();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2965();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2965();
                }
            }
            return;
        }
        field750[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2965();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field756[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3833(var10 + 45365, var11 + 91923, 4) - 128 + (method3833(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3833(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field756[arg1][arg2][arg3] = field756[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2965();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field756[0][arg2][arg3] = -var15 * 8;
                } else {
                    field756[arg1][arg2][arg3] = field756[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2344[arg1][arg2][arg3] = arg0.method2966();
                Statics.field3299[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field753[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field750[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field751[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cl.p([BIII)Z")
    public static final boolean method1592(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class177 var4 = new class177(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2978();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2978();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2965() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class259 var16 = class259.method653(var5);
                        if (var13 != 22 || !client.field1082 || var16.field3466 != 0 || var16.field3464 == 1 || var16.field3485) {
                            if (!var16.method4241()) {
                                client.field973++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2978();
                if (var9 == 0) {
                    break;
                }
                var4.method2965();
            }
        }
    }

    @ObfuscatedName("be.d([BIILes;[Lfb;I)V")
    public static final void method999(byte[] arg0, int arg1, int arg2, class140 arg3, class165[] arg4) {
        class177 var5 = new class177(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2978();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2978();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2965();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field750[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class165 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method68(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("k.n(IIIIIILes;Lfb;I)V")
    public static final void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class140 arg6, class165 arg7) {
        if (client.field1082 && (field750[0][arg1][arg2] & 0x2) == 0 && (field750[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field749) {
            field749 = arg0;
        }
        class259 var8 = class259.method653(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3463;
            var10 = var8.field3484;
        } else {
            var9 = var8.field3484;
            var10 = var8.field3463;
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
        int[][] var15 = field756[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3466 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3487 == 1) {
            var20 += 256;
        }
        if (var8.method4249()) {
            class83.method3236(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field1082 || var8.field3466 != 0 || var8.field3464 == 1 || var8.field3485) {
                class142 var21;
                if (var8.field3473 == -1 && var8.field3488 == null) {
                    var21 = var8.method4253(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class101(arg3, 22, arg4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
                }
                arg6.method2528(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3464 == 1 && arg7 != null) {
                    arg7.method2864(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class142 var44;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var44 = var8.method4253(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class101(arg3, 10, arg4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            if (var44 != null && arg6.method2532(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3489) {
                int var45 = 15;
                if (var44 instanceof class134) {
                    var45 = ((class134) var44).method2388() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field860[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field860[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2851(arg1, arg2, var9, var10, var8.field3452);
            }
        } else if (arg5 >= 12) {
            class142 var22;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var22 = var8.method4253(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2532(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field249[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2851(arg1, arg2, var9, var10, var8.field3452);
            }
        } else if (arg5 == 0) {
            class142 var23;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var23 = var8.method4253(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class101(arg3, 0, arg4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2530(arg0, arg1, arg2, var16, var23, (class142) null, field755[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3489) {
                    Statics.field860[arg0][arg1][arg2] = 50;
                    Statics.field860[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3469) {
                    Statics.field249[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3489) {
                    Statics.field860[arg0][arg1][arg2 + 1] = 50;
                    Statics.field860[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3469) {
                    Statics.field249[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3489) {
                    Statics.field860[arg0][arg1 + 1][arg2] = 50;
                    Statics.field860[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3469) {
                    Statics.field249[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3489) {
                    Statics.field860[arg0][arg1][arg2] = 50;
                    Statics.field860[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3469) {
                    Statics.field249[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2865(arg1, arg2, arg5, arg4, var8.field3452);
            }
            if (var8.field3471 != 16) {
                arg6.method2538(arg0, arg1, arg2, var8.field3471);
            }
        } else if (arg5 == 1) {
            class142 var24;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var24 = var8.method4253(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class101(arg3, 1, arg4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2530(arg0, arg1, arg2, var16, var24, (class142) null, field760[arg4], 0, var19, var20);
            if (var8.field3489) {
                if (arg4 == 0) {
                    Statics.field860[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field860[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field860[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field860[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2865(arg1, arg2, arg5, arg4, var8.field3452);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class142 var26;
            class142 var27;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var26 = var8.method4253(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4253(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class101(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
                var27 = new class101(arg3, 2, var25, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2530(arg0, arg1, arg2, var16, var26, var27, field755[arg4], field755[var25], var19, var20);
            if (var8.field3469) {
                if (arg4 == 0) {
                    Statics.field249[arg0][arg1][arg2] |= 0x249;
                    Statics.field249[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field249[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field249[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field249[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field249[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field249[arg0][arg1][arg2] |= 0x492;
                    Statics.field249[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2865(arg1, arg2, arg5, arg4, var8.field3452);
            }
            if (var8.field3471 != 16) {
                arg6.method2538(arg0, arg1, arg2, var8.field3471);
            }
        } else if (arg5 == 3) {
            class142 var28;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var28 = var8.method4253(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class101(arg3, 3, arg4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2530(arg0, arg1, arg2, var16, var28, (class142) null, field760[arg4], 0, var19, var20);
            if (var8.field3489) {
                if (arg4 == 0) {
                    Statics.field860[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field860[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field860[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field860[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2865(arg1, arg2, arg5, arg4, var8.field3452);
            }
        } else if (arg5 == 9) {
            class142 var29;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var29 = var8.method4253(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class101(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2532(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3464 != 0 && arg7 != null) {
                arg7.method2851(arg1, arg2, var9, var10, var8.field3452);
            }
            if (var8.field3471 != 16) {
                arg6.method2538(arg0, arg1, arg2, var8.field3471);
            }
        } else if (arg5 == 4) {
            class142 var30;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var30 = var8.method4253(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2531(arg0, arg1, arg2, var16, var30, (class142) null, field755[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2548(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class259.method653(var32 >> 14 & 0x7FFF).field3471;
            }
            class142 var33;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var33 = var8.method4253(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class101(arg3, 4, arg4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2531(arg0, arg1, arg2, var16, var33, (class142) null, field755[arg4], 0, field758[arg4] * var31, field754[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2548(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class259.method653(var35 >> 14 & 0x7FFF).field3471 / 2;
            }
            class142 var36;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var36 = var8.method4253(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2531(arg0, arg1, arg2, var16, var36, (class142) null, 256, arg4, field759[arg4] * var34, field761[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class142 var38;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var38 = var8.method4253(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class101(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2531(arg0, arg1, arg2, var16, var38, (class142) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2548(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class259.method653(var40 >> 14 & 0x7FFF).field3471 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class142 var42;
            class142 var43;
            if (var8.field3473 == -1 && var8.field3488 == null) {
                var42 = var8.method4253(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4253(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class101(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
                var43 = new class101(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3473, true, (class142) null);
            }
            arg6.method2531(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field759[arg4] * var39, field761[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ix.z(IIII)I")
    public static final int method3833(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1414(var3, var5);
        int var8 = method1414(var3 + 1, var5);
        int var9 = method1414(var3, var5 + 1);
        int var10 = method1414(var3 + 1, var5 + 1);
        int var11 = 65536 - class137.field2019[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class137.field2019[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class137.field2019[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("cd.o(III)I")
    public static final int method1414(int arg0, int arg1) {
        int var2 = method459(arg0 - 1, arg1 - 1) + method459(arg0 + 1, arg1 - 1) + method459(arg0 - 1, arg1 + 1) + method459(arg0 + 1, arg1 + 1);
        int var3 = method459(arg0 - 1, arg1) + method459(arg0 + 1, arg1) + method459(arg0, arg1 - 1) + method459(arg0, arg1 + 1);
        int var4 = method459(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("av.u(IIB)I")
    public static final int method459(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ah.r(III)I")
    public static final int method550(int arg0, int arg1) {
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

    @ObfuscatedName("eo.l(III)I")
    public static final int method2718(int arg0, int arg1) {
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

    @ObfuscatedName("fu.y(IIII)I")
    public static final int method3170(int arg0, int arg1, int arg2) {
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
