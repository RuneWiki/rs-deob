package deob;

@ObfuscatedName("bk")
public final class class62 {

    @ObfuscatedName("bk.b")
    public static int[][][] field689 = new int[4][105][105];

    @ObfuscatedName("bk.q")
    public static byte[][][] field698 = new byte[4][104][104];

    @ObfuscatedName("bk.o")
    public static int field687 = 99;

    @ObfuscatedName("bk.x")
    public static final int[] field691 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bk.w")
    public static final int[] field692 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bk.j")
    public static final int[] field695 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bk.z")
    public static final int[] field694 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bk.e")
    public static final int[] field690 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bk.k")
    public static final int[] field696 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bk.n")
    public static int field697 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bk.i")
    public static int field686 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jp.b(B)V")
    public static void method4412() {
        Statics.field688 = (byte[][][]) null;
        Statics.field2765 = (byte[][][]) null;
        Statics.field1283 = (byte[][][]) null;
        Statics.field28 = (byte[][][]) null;
        Statics.field620 = (int[][][]) null;
        Statics.field2489 = (byte[][][]) null;
        Statics.field2470 = (int[][]) null;
        Statics.field2739 = null;
        Statics.field335 = null;
        Statics.field685 = null;
        Statics.field693 = null;
        Statics.field701 = null;
    }

    @ObfuscatedName("im.q(IIIII)V")
    public static final void method4121(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2489[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field689[0][var5][var4] = field689[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field689[0][var5][var4] = field689[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field689[0][var5][var4] = field689[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field689[0][var5][var4] = field689[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.o([BIIII[Lfq;B)V")
    public static final void method1840(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class176[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2225[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class194 var9 = new class194(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2137(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("dl.p(Lgn;IIIIIII)V")
    public static final void method2137(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method3247();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method3247();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method3247();
                }
            }
            return;
        }
        field698[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3247();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field689[0][arg2][arg3] = -method4912(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field689[arg1][arg2][arg3] = field689[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method3247();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field689[0][arg2][arg3] = -var8 * 8;
                } else {
                    field689[arg1][arg2][arg3] = field689[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2765[arg1][arg2][arg3] = arg0.method3248();
                Statics.field1283[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field28[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field698[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field688[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ag.a([BIII)Z")
    public static final boolean method553(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class194 var4 = new class194(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method3368();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method3368();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method3247() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class276 var16 = class276.method1566(var5);
                        if (var13 != 22 || !client.field826 || var16.field3537 != 0 || var16.field3542 == 1 || var16.field3556) {
                            if (!var16.method4558()) {
                                client.field845++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method3368();
                if (var9 == 0) {
                    break;
                }
                var4.method3247();
            }
        }
    }

    @ObfuscatedName("cw.h([BIIIIIIILev;[Lfq;B)V")
    public static final void method1693(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8, class176[] arg9) {
        class194 var10 = new class194(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3368();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3368();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method3247();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class276 var21 = class276.method1566(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field3533;
                    int var27 = var21.field3534;
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
                    int var36 = var21.field3533;
                    int var37 = var21.field3534;
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
                        if ((field698[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class176 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method149(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.l(IIIIIILev;Lfq;I)V")
    public static final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class137 arg6, class176 arg7) {
        if (client.field826 && (field698[0][arg1][arg2] & 0x2) == 0 && (field698[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field687) {
            field687 = arg0;
        }
        class276 var8 = class276.method1566(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3534;
            var10 = var8.field3533;
        } else {
            var9 = var8.field3533;
            var10 = var8.field3534;
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
        int[][] var15 = field689[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3537 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3552 == 1) {
            var20 += 256;
        }
        if (var8.method4567()) {
            class80 var21 = new class80();
            var21.field1206 = arg0;
            var21.field1203 = arg1 * 128;
            var21.field1204 = arg2 * 128;
            int var22 = var8.field3533;
            int var23 = var8.field3534;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3534;
                var23 = var8.field3533;
            }
            var21.field1205 = (arg1 + var22) * 128;
            var21.field1209 = (arg2 + var23) * 128;
            var21.field1208 = var8.field3562;
            var21.field1207 = var8.field3540 * 128;
            var21.field1210 = var8.field3564;
            var21.field1213 = var8.field3565;
            var21.field1212 = var8.field3566;
            if (var8.field3541 != null) {
                var21.field1215 = var8;
                var21.method1629();
            }
            class80.field1211.method3741(var21);
            if (var21.field1212 != null) {
                var21.field1217 = var21.field1210 + (int) (Math.random() * (double) (var21.field1213 - var21.field1210));
            }
        }
        if (arg5 == 22) {
            if (!client.field826 || var8.field3537 != 0 || var8.field3542 == 1 || var8.field3556) {
                class139 var24;
                if (var8.field3528 == -1 && var8.field3541 == null) {
                    var24 = var8.method4559(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class97(arg3, 22, arg4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
                }
                arg6.method2787(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3542 == 1 && arg7 != null) {
                    arg7.method3114(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class139 var47;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var47 = var8.method4559(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class97(arg3, 10, arg4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            if (var47 != null && arg6.method2681(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3549) {
                int var48 = 15;
                if (var47 instanceof class131) {
                    var48 = ((class131) var47).method2497() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field2489[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field2489[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3542 != 0 && arg7 != null) {
                arg7.method3088(arg1, arg2, var9, var10, var8.field3536);
            }
        } else if (arg5 >= 12) {
            class139 var25;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var25 = var8.method4559(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class97(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2681(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field620[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3542 != 0 && arg7 != null) {
                arg7.method3088(arg1, arg2, var9, var10, var8.field3536);
            }
        } else if (arg5 == 0) {
            class139 var26;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var26 = var8.method4559(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class97(arg3, 0, arg4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2679(arg0, arg1, arg2, var16, var26, (class139) null, field691[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3549) {
                    Statics.field2489[arg0][arg1][arg2] = 50;
                    Statics.field2489[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3559) {
                    Statics.field620[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3549) {
                    Statics.field2489[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2489[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3559) {
                    Statics.field620[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3549) {
                    Statics.field2489[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2489[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3559) {
                    Statics.field620[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3549) {
                    Statics.field2489[arg0][arg1][arg2] = 50;
                    Statics.field2489[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3559) {
                    Statics.field620[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3542 != 0 && arg7 != null) {
                arg7.method3087(arg1, arg2, arg5, arg4, var8.field3536);
            }
            if (var8.field3545 != 16) {
                arg6.method2687(arg0, arg1, arg2, var8.field3545);
            }
        } else if (arg5 == 1) {
            class139 var27;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var27 = var8.method4559(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class97(arg3, 1, arg4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2679(arg0, arg1, arg2, var16, var27, (class139) null, field692[arg4], 0, var19, var20);
            if (var8.field3549) {
                if (arg4 == 0) {
                    Statics.field2489[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2489[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2489[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2489[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3542 != 0 && arg7 != null) {
                arg7.method3087(arg1, arg2, arg5, arg4, var8.field3536);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class139 var29;
            class139 var30;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var29 = var8.method4559(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4559(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class97(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
                var30 = new class97(arg3, 2, var28, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2679(arg0, arg1, arg2, var16, var29, var30, field691[arg4], field691[var28], var19, var20);
            if (var8.field3559) {
                if (arg4 == 0) {
                    Statics.field620[arg0][arg1][arg2] |= 0x249;
                    Statics.field620[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field620[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field620[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field620[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field620[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field620[arg0][arg1][arg2] |= 0x492;
                    Statics.field620[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3542 != 0 && arg7 != null) {
                arg7.method3087(arg1, arg2, arg5, arg4, var8.field3536);
            }
            if (var8.field3545 != 16) {
                arg6.method2687(arg0, arg1, arg2, var8.field3545);
            }
        } else if (arg5 == 3) {
            class139 var31;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var31 = var8.method4559(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class97(arg3, 3, arg4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2679(arg0, arg1, arg2, var16, var31, (class139) null, field692[arg4], 0, var19, var20);
            if (var8.field3549) {
                if (arg4 == 0) {
                    Statics.field2489[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2489[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2489[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2489[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3542 != 0 && arg7 != null) {
                arg7.method3087(arg1, arg2, arg5, arg4, var8.field3536);
            }
        } else if (arg5 == 9) {
            class139 var32;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var32 = var8.method4559(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class97(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2681(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3542 != 0 && arg7 != null) {
                arg7.method3088(arg1, arg2, var9, var10, var8.field3536);
            }
            if (var8.field3545 != 16) {
                arg6.method2687(arg0, arg1, arg2, var8.field3545);
            }
        } else if (arg5 == 4) {
            class139 var33;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var33 = var8.method4559(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class97(arg3, 4, arg4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2680(arg0, arg1, arg2, var16, var33, (class139) null, field691[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2729(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class276.method1566(var35 >> 14 & 0x7FFF).field3545;
            }
            class139 var36;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var36 = var8.method4559(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class97(arg3, 4, arg4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2680(arg0, arg1, arg2, var16, var36, (class139) null, field691[arg4], 0, field695[arg4] * var34, field694[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2729(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class276.method1566(var38 >> 14 & 0x7FFF).field3545 / 2;
            }
            class139 var39;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var39 = var8.method4559(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class97(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2680(arg0, arg1, arg2, var16, var39, (class139) null, 256, arg4, field690[arg4] * var37, field696[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class139 var41;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var41 = var8.method4559(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class97(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2680(arg0, arg1, arg2, var16, var41, (class139) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2729(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class276.method1566(var43 >> 14 & 0x7FFF).field3545 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class139 var45;
            class139 var46;
            if (var8.field3528 == -1 && var8.field3541 == null) {
                var45 = var8.method4559(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4559(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class97(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
                var46 = new class97(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3528, true, (class139) null);
            }
            arg6.method2680(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field690[arg4] * var42, field696[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("ag.y(Lev;[Lfq;I)V")
    public static final void method554(class137 arg0, class176[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field698[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field698[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3096(var3, var4);
                        }
                    }
                }
            }
        }
        field697 += (int) (Math.random() * 5.0D) - 2;
        if (field697 < -8) {
            field697 = -8;
        }
        if (field697 > 8) {
            field697 = 8;
        }
        field686 += (int) (Math.random() * 5.0D) - 2;
        if (field686 < -16) {
            field686 = -16;
        }
        if (field686 > 16) {
            field686 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field2489[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field689[var6][var11 + 1][var10] - field689[var6][var11 - 1][var10];
                    int var13 = field689[var6][var11][var10 + 1] - field689[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2470[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field2739[var20] = 0;
                Statics.field335[var20] = 0;
                Statics.field685[var20] = 0;
                Statics.field693[var20] = 0;
                Statics.field701[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field688[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class267 var25 = class267.method1776(var24 - 1);
                            Statics.field2739[var22] += var25.field3439;
                            Statics.field335[var22] += var25.field3440;
                            Statics.field685[var22] += var25.field3436;
                            Statics.field693[var22] += var25.field3442;
                            var10002 = Statics.field701[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field688[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class267 var28 = class267.method1776(var27 - 1);
                            Statics.field2739[var22] -= var28.field3439;
                            Statics.field335[var22] -= var28.field3440;
                            Statics.field685[var22] -= var28.field3436;
                            Statics.field693[var22] -= var28.field3442;
                            var10002 = Statics.field701[var22]--;
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
                            var29 += Statics.field2739[var35];
                            var30 += Statics.field335[var35];
                            var31 += Statics.field685[var35];
                            var32 += Statics.field693[var35];
                            var33 += Statics.field701[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field2739[var36];
                            var30 -= Statics.field335[var36];
                            var31 -= Statics.field685[var36];
                            var32 -= Statics.field693[var36];
                            var33 -= Statics.field701[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field826 || (field698[0][var21][var34] & 0x2) != 0 || (field698[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field687) {
                                field687 = var6;
                            }
                            int var37 = Statics.field688[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field2765[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field689[var6][var21][var34];
                                int var40 = field689[var6][var21 + 1][var34];
                                int var41 = field689[var6][var21 + 1][var34 + 1];
                                int var42 = field689[var6][var21][var34 + 1];
                                int var43 = Statics.field2470[var21][var34];
                                int var44 = Statics.field2470[var21 + 1][var34];
                                int var45 = Statics.field2470[var21 + 1][var34 + 1];
                                int var46 = Statics.field2470[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method24(var49, var50, var51);
                                    int var52 = field697 + var49 & 0xFF;
                                    int var53 = field686 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method24(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field1283[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class280.method163(var38 - 1).field3673) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field620[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class134.field1908[method189(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2676(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method189(var47, var43), method189(var47, var44), method189(var47, var45), method189(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field1283[var6][var21][var34] + 1;
                                    byte var57 = Statics.field28[var6][var21][var34];
                                    class280 var58 = class280.method163(var38 - 1);
                                    int var59 = var58.field3668;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1913.method2365(var59);
                                        var61 = -1;
                                    } else if (var58.field3667 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method24(var58.field3665, var58.field3672, var58.field3677);
                                        int var62 = field697 + var58.field3665 & 0xFF;
                                        int var63 = field686 + var58.field3677;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method24(var62, var58.field3672, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class134.field1908[method152(var60, 96)];
                                    }
                                    if (var58.field3670 != -1) {
                                        int var65 = field697 + var58.field3674 & 0xFF;
                                        int var66 = field686 + var58.field3676;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method24(var65, var58.field3675, var66);
                                        var64 = class134.field1908[method152(var67, 96)];
                                    }
                                    arg0.method2676(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method189(var47, var43), method189(var47, var44), method189(var47, var45), method189(var47, var46), method152(var61, var43), method152(var61, var44), method152(var61, var45), method152(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method2806(var6, var69, var68, method159(var6, var69, var68));
                }
            }
            Statics.field688[var6] = (byte[][]) null;
            Statics.field2765[var6] = (byte[][]) null;
            Statics.field1283[var6] = (byte[][]) null;
            Statics.field28[var6] = (byte[][]) null;
            Statics.field2489[var6] = (byte[][]) null;
        }
        arg0.method2702(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field698[1][var70][var71] & 0x2) == 2) {
                    arg0.method2673(var70, var71);
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
                        if ((Statics.field620[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field620[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field620[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label337: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field620[var81 - 1][var78][var83] & var72) == 0) {
                                        break label337;
                                    }
                                }
                                var81--;
                            }
                            label326: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field620[var82 + 1][var78][var84] & var72) == 0) {
                                        break label326;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field689[var82][var78][var79] - var86;
                                int var88 = field689[var81][var78][var79];
                                class137.method2674(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field620[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field620[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field620[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field620[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label390: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field620[var93 - 1][var95][var77] & var73) == 0) {
                                        break label390;
                                    }
                                }
                                var93--;
                            }
                            label379: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field620[var94 + 1][var96][var77] & var73) == 0) {
                                        break label379;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field689[var94][var91][var77] - var98;
                                int var100 = field689[var93][var91][var77];
                                class137.method2674(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field620[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field620[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field620[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field620[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label443: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field620[var76][var103 - 1][var107] & var74) == 0) {
                                        break label443;
                                    }
                                }
                                var103--;
                            }
                            label432: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field620[var76][var104 + 1][var108] & var74) == 0) {
                                        break label432;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field689[var76][var103][var105];
                                class137.method2674(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field620[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.g(IIII)I")
    public static int method159(int arg0, int arg1, int arg2) {
        if ((field698[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field698[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("kc.c(III)I")
    public static final int method4912(int arg0, int arg1) {
        int var2 = method76(arg0 + 45365, arg1 + 91923, 4) - 128 + (method76(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method76(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("t.u(IIII)I")
    public static final int method76(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method263(var3, var5);
        int var8 = method263(var3 + 1, var5);
        int var9 = method263(var3, var5 + 1);
        int var10 = method263(var3 + 1, var5 + 1);
        int var11 = 65536 - class134.field1917[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class134.field1917[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class134.field1917[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ah.t(III)I")
    public static final int method263(int arg0, int arg1) {
        int var2 = method1729(arg0 - 1, arg1 - 1) + method1729(arg0 + 1, arg1 - 1) + method1729(arg0 - 1, arg1 + 1) + method1729(arg0 + 1, arg1 + 1);
        int var3 = method1729(arg0 - 1, arg1) + method1729(arg0 + 1, arg1) + method1729(arg0, arg1 - 1) + method1729(arg0, arg1 + 1);
        int var4 = method1729(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cl.f(III)I")
    public static final int method1729(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("n.m(III)I")
    public static final int method189(int arg0, int arg1) {
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

    @ObfuscatedName("w.x(III)I")
    public static final int method152(int arg0, int arg1) {
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

    @ObfuscatedName("y.w(IIII)I")
    public static final int method24(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("hu.j(III)Z")
    public static final boolean method4016(int arg0, int arg1) {
        class276 var2 = class276.method1566(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4557(arg1);
    }

    @ObfuscatedName("jw.z(IIIIIIILev;Lfq;I)V")
    public static final void method4784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class137 arg7, class176 arg8) {
        class276 var9 = class276.method1566(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3534;
            var11 = var9.field3533;
        } else {
            var10 = var9.field3533;
            var11 = var9.field3534;
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
        int[][] var16 = field689[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field3537 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field3552 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class139 var22;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var22 = var9.method4560(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class97(arg4, 22, arg5, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2787(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field3542 == 1) {
                arg8.method3114(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class139 var45;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var45 = var9.method4560(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class97(arg4, 10, arg5, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            if (var45 != null) {
                arg7.method2681(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field3542 != 0) {
                arg8.method3088(arg2, arg3, var10, var11, var9.field3536);
            }
        } else if (arg6 >= 12) {
            class139 var23;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var23 = var9.method4560(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class97(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2681(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field3542 != 0) {
                arg8.method3088(arg2, arg3, var10, var11, var9.field3536);
            }
        } else if (arg6 == 0) {
            class139 var24;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var24 = var9.method4560(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class97(arg4, 0, arg5, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2679(arg0, arg2, arg3, var17, var24, (class139) null, field691[arg5], 0, var20, var21);
            if (var9.field3542 != 0) {
                arg8.method3087(arg2, arg3, arg6, arg5, var9.field3536);
            }
        } else if (arg6 == 1) {
            class139 var25;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var25 = var9.method4560(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class97(arg4, 1, arg5, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2679(arg0, arg2, arg3, var17, var25, (class139) null, field692[arg5], 0, var20, var21);
            if (var9.field3542 != 0) {
                arg8.method3087(arg2, arg3, arg6, arg5, var9.field3536);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class139 var27;
            class139 var28;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var27 = var9.method4560(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method4560(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class97(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3528, true, (class139) null);
                var28 = new class97(arg4, 2, var26, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2679(arg0, arg2, arg3, var17, var27, var28, field691[arg5], field691[var26], var20, var21);
            if (var9.field3542 != 0) {
                arg8.method3087(arg2, arg3, arg6, arg5, var9.field3536);
            }
        } else if (arg6 == 3) {
            class139 var29;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var29 = var9.method4560(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class97(arg4, 3, arg5, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2679(arg0, arg2, arg3, var17, var29, (class139) null, field692[arg5], 0, var20, var21);
            if (var9.field3542 != 0) {
                arg8.method3087(arg2, arg3, arg6, arg5, var9.field3536);
            }
        } else if (arg6 == 9) {
            class139 var30;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var30 = var9.method4560(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class97(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2681(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field3542 != 0) {
                arg8.method3088(arg2, arg3, var10, var11, var9.field3536);
            }
        } else if (arg6 == 4) {
            class139 var31;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var31 = var9.method4560(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class97(arg4, 4, arg5, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2680(arg0, arg2, arg3, var17, var31, (class139) null, field691[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2729(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class276.method1566(var33 >> 14 & 0x7FFF).field3545;
            }
            class139 var34;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var34 = var9.method4560(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class97(arg4, 4, arg5, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2680(arg0, arg2, arg3, var17, var34, (class139) null, field691[arg5], 0, field695[arg5] * var32, field694[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2729(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class276.method1566(var36 >> 14 & 0x7FFF).field3545 / 2;
            }
            class139 var37;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var37 = var9.method4560(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class97(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2680(arg0, arg2, arg3, var17, var37, (class139) null, 256, arg5, field690[arg5] * var35, field696[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class139 var39;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var39 = var9.method4560(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class97(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2680(arg0, arg2, arg3, var17, var39, (class139) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2729(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class276.method1566(var41 >> 14 & 0x7FFF).field3545 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class139 var43;
            class139 var44;
            if (var9.field3528 == -1 && var9.field3541 == null) {
                var43 = var9.method4560(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method4560(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class97(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3528, true, (class139) null);
                var44 = new class97(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field3528, true, (class139) null);
            }
            arg7.method2680(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field690[arg5] * var40, field696[arg5] * var40, var20, var21);
        }
    }
}
