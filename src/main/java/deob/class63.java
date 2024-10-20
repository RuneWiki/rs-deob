package deob;

@ObfuscatedName("bj")
public final class class63 {

    @ObfuscatedName("bj.o")
    public static int[][][] field745 = new int[4][105][105];

    @ObfuscatedName("bj.k")
    public static byte[][][] field740 = new byte[4][104][104];

    @ObfuscatedName("bj.t")
    public static int field748 = 99;

    @ObfuscatedName("bj.r")
    public static final int[] field750 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bj.j")
    public static final int[] field747 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bj.b")
    public static final int[] field739 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bj.g")
    public static final int[] field741 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bj.f")
    public static final int[] field753 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bj.p")
    public static final int[] field751 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bj.e")
    public static int field752 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bj.c")
    public static int field746 = (int) (Math.random() * 33.0D) - 16;

    public class63() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.o(I)V")
    public static void method1721() {
        Statics.field742 = (byte[][][]) null;
        Statics.field743 = (byte[][][]) null;
        Statics.field744 = (byte[][][]) null;
        Statics.field749 = (byte[][][]) null;
        Statics.field2521 = (int[][][]) null;
        Statics.field3832 = (byte[][][]) null;
        Statics.field1355 = (int[][]) null;
        Statics.field655 = null;
        Statics.field2497 = null;
        Statics.field3315 = null;
        Statics.field496 = null;
        Statics.field1357 = null;
    }

    @ObfuscatedName("a.k(IIIII)V")
    public static final void method43(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3832[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field745[0][var5][var4] = field745[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field745[0][var5][var4] = field745[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field745[0][var5][var4] = field745[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field745[0][var5][var4] = field745[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.t(IIII)V")
    public static final void method2822(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field745[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field745[arg0][arg1][arg2 + var5] = field745[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field745[arg0][arg1 + var6][arg2] = field745[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field745[arg0][arg1 - 1][arg2] != 0) {
            field745[arg0][arg1][arg2] = field745[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field745[arg0][arg1][arg2 - 1] != 0) {
            field745[arg0][arg1][arg2] = field745[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field745[arg0][arg1 - 1][arg2 - 1] != 0) {
            field745[arg0][arg1][arg2] = field745[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("l.h([BIILel;[Lfb;I)V")
    public static final void method74(byte[] arg0, int arg1, int arg2, class138 arg3, class177[] arg4) {
        class195 var5 = new class195(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3219();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3219();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method3205();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field740[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class177 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method566(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("ar.m(IIIIIILel;Lfb;I)V")
    public static final void method566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class138 arg6, class177 arg7) {
        if (client.field875 && (field740[0][arg1][arg2] & 0x2) == 0 && (field740[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field748) {
            field748 = arg0;
        }
        class283 var8 = class283.method713(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3607;
            var10 = var8.field3595;
        } else {
            var9 = var8.field3595;
            var10 = var8.field3607;
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
        int[][] var15 = field745[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3598 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3631 == 1) {
            var20 += 256;
        }
        if (var8.method4619()) {
            class81 var21 = new class81();
            var21.field1260 = arg0;
            var21.field1266 = arg1 * 128;
            var21.field1262 = arg2 * 128;
            int var22 = var8.field3595;
            int var23 = var8.field3607;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3607;
                var23 = var8.field3595;
            }
            var21.field1270 = (arg1 + var22) * 128;
            var21.field1263 = (arg2 + var23) * 128;
            var21.field1265 = var8.field3635;
            var21.field1274 = var8.field3636 * 128;
            var21.field1268 = var8.field3637;
            var21.field1269 = var8.field3616;
            var21.field1275 = var8.field3615;
            if (var8.field3632 != null) {
                var21.field1273 = var8;
                var21.method1649();
            }
            class81.field1264.method3690(var21);
            if (var21.field1275 != null) {
                var21.field1271 = var21.field1268 + (int) (Math.random() * (double) (var21.field1269 - var21.field1268));
            }
        }
        if (arg5 == 22) {
            if (!client.field875 || var8.field3598 != 0 || var8.field3608 == 1 || var8.field3606) {
                class140 var24;
                if (var8.field3600 == -1 && var8.field3632 == null) {
                    var24 = var8.method4612(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class98(arg3, 22, arg4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
                }
                arg6.method2631(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3608 == 1 && arg7 != null) {
                    arg7.method3076(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class140 var47;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var47 = var8.method4612(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class98(arg3, 10, arg4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            if (var47 != null && arg6.method2635(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3622) {
                int var48 = 15;
                if (var47 instanceof class132) {
                    var48 = ((class132) var47).method2466() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field3832[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field3832[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3608 != 0 && arg7 != null) {
                arg7.method3093(arg1, arg2, var9, var10, var8.field3609);
            }
        } else if (arg5 >= 12) {
            class140 var25;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var25 = var8.method4612(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2635(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2521[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3608 != 0 && arg7 != null) {
                arg7.method3093(arg1, arg2, var9, var10, var8.field3609);
            }
        } else if (arg5 == 0) {
            class140 var26;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var26 = var8.method4612(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class98(arg3, 0, arg4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2724(arg0, arg1, arg2, var16, var26, (class140) null, field750[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3622) {
                    Statics.field3832[arg0][arg1][arg2] = 50;
                    Statics.field3832[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3613) {
                    Statics.field2521[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3622) {
                    Statics.field3832[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3832[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3613) {
                    Statics.field2521[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3622) {
                    Statics.field3832[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3832[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3613) {
                    Statics.field2521[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3622) {
                    Statics.field3832[arg0][arg1][arg2] = 50;
                    Statics.field3832[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3613) {
                    Statics.field2521[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3608 != 0 && arg7 != null) {
                arg7.method3082(arg1, arg2, arg5, arg4, var8.field3609);
            }
            if (var8.field3612 != 16) {
                arg6.method2641(arg0, arg1, arg2, var8.field3612);
            }
        } else if (arg5 == 1) {
            class140 var27;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var27 = var8.method4612(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class98(arg3, 1, arg4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2724(arg0, arg1, arg2, var16, var27, (class140) null, field747[arg4], 0, var19, var20);
            if (var8.field3622) {
                if (arg4 == 0) {
                    Statics.field3832[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3832[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3832[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3832[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3608 != 0 && arg7 != null) {
                arg7.method3082(arg1, arg2, arg5, arg4, var8.field3609);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class140 var29;
            class140 var30;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var29 = var8.method4612(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4612(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class98(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
                var30 = new class98(arg3, 2, var28, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2724(arg0, arg1, arg2, var16, var29, var30, field750[arg4], field750[var28], var19, var20);
            if (var8.field3613) {
                if (arg4 == 0) {
                    Statics.field2521[arg0][arg1][arg2] |= 0x249;
                    Statics.field2521[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2521[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2521[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2521[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2521[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2521[arg0][arg1][arg2] |= 0x492;
                    Statics.field2521[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3608 != 0 && arg7 != null) {
                arg7.method3082(arg1, arg2, arg5, arg4, var8.field3609);
            }
            if (var8.field3612 != 16) {
                arg6.method2641(arg0, arg1, arg2, var8.field3612);
            }
        } else if (arg5 == 3) {
            class140 var31;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var31 = var8.method4612(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class98(arg3, 3, arg4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2724(arg0, arg1, arg2, var16, var31, (class140) null, field747[arg4], 0, var19, var20);
            if (var8.field3622) {
                if (arg4 == 0) {
                    Statics.field3832[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3832[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3832[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3832[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3608 != 0 && arg7 != null) {
                arg7.method3082(arg1, arg2, arg5, arg4, var8.field3609);
            }
        } else if (arg5 == 9) {
            class140 var32;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var32 = var8.method4612(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2635(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3608 != 0 && arg7 != null) {
                arg7.method3093(arg1, arg2, var9, var10, var8.field3609);
            }
            if (var8.field3612 != 16) {
                arg6.method2641(arg0, arg1, arg2, var8.field3612);
            }
        } else if (arg5 == 4) {
            class140 var33;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var33 = var8.method4612(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2634(arg0, arg1, arg2, var16, var33, (class140) null, field750[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2651(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class283.method713(var35 >> 14 & 0x7FFF).field3612;
            }
            class140 var36;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var36 = var8.method4612(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2634(arg0, arg1, arg2, var16, var36, (class140) null, field750[arg4], 0, field739[arg4] * var34, field741[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2651(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class283.method713(var38 >> 14 & 0x7FFF).field3612 / 2;
            }
            class140 var39;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var39 = var8.method4612(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2634(arg0, arg1, arg2, var16, var39, (class140) null, 256, arg4, field753[arg4] * var37, field751[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class140 var41;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var41 = var8.method4612(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class98(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2634(arg0, arg1, arg2, var16, var41, (class140) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2651(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class283.method713(var43 >> 14 & 0x7FFF).field3612 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class140 var45;
            class140 var46;
            if (var8.field3600 == -1 && var8.field3632 == null) {
                var45 = var8.method4612(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4612(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
                var46 = new class98(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3600, true, (class140) null);
            }
            arg6.method2634(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field753[arg4] * var42, field751[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("bq.z(IIB)I")
    public static final int method1018(int arg0, int arg1) {
        int var2 = method2825(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2825(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2825(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("ew.i(IIII)I")
    public static final int method2825(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method4144(var3, var5);
        int var8 = method4144(var3 + 1, var5);
        int var9 = method4144(var3, var5 + 1);
        int var10 = method4144(var3 + 1, var5 + 1);
        int var11 = method2054(var7, var8, var4, arg2);
        int var12 = method2054(var9, var10, var4, arg2);
        return method2054(var11, var12, var6, arg2);
    }

    @ObfuscatedName("df.u(IIIII)I")
    public static final int method2054(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class135.field1964[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("iy.x(III)I")
    public static final int method4144(int arg0, int arg1) {
        int var2 = method2317(arg0 - 1, arg1 - 1) + method2317(arg0 + 1, arg1 - 1) + method2317(arg0 - 1, arg1 + 1) + method2317(arg0 + 1, arg1 + 1);
        int var3 = method2317(arg0 - 1, arg1) + method2317(arg0 + 1, arg1) + method2317(arg0, arg1 - 1) + method2317(arg0, arg1 + 1);
        int var4 = method2317(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dy.y(IIB)I")
    public static final int method2317(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ed.a(III)I")
    public static final int method2824(int arg0, int arg1) {
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

    @ObfuscatedName("br.v(IIB)I")
    public static final int method920(int arg0, int arg1) {
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

    @ObfuscatedName("iv.q(IIII)I")
    public static final int method4127(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bv.r(III)Z")
    public static final boolean method1066(int arg0, int arg1) {
        class283 var2 = class283.method713(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4610(arg1);
    }

    @ObfuscatedName("iy.j(IIIIIIILel;Lfb;I)V")
    public static final void method4143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class138 arg7, class177 arg8) {
        class283 var9 = class283.method713(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3607;
            var11 = var9.field3595;
        } else {
            var10 = var9.field3595;
            var11 = var9.field3607;
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
        int[][] var16 = field745[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field3598 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field3631 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class140 var22;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var22 = var9.method4613(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class98(arg4, 22, arg5, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2631(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field3608 == 1) {
                arg8.method3076(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class140 var45;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var45 = var9.method4613(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class98(arg4, 10, arg5, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            if (var45 != null) {
                arg7.method2635(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field3608 != 0) {
                arg8.method3093(arg2, arg3, var10, var11, var9.field3609);
            }
        } else if (arg6 >= 12) {
            class140 var23;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var23 = var9.method4613(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class98(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2635(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field3608 != 0) {
                arg8.method3093(arg2, arg3, var10, var11, var9.field3609);
            }
        } else if (arg6 == 0) {
            class140 var24;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var24 = var9.method4613(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class98(arg4, 0, arg5, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2724(arg0, arg2, arg3, var17, var24, (class140) null, field750[arg5], 0, var20, var21);
            if (var9.field3608 != 0) {
                arg8.method3082(arg2, arg3, arg6, arg5, var9.field3609);
            }
        } else if (arg6 == 1) {
            class140 var25;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var25 = var9.method4613(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class98(arg4, 1, arg5, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2724(arg0, arg2, arg3, var17, var25, (class140) null, field747[arg5], 0, var20, var21);
            if (var9.field3608 != 0) {
                arg8.method3082(arg2, arg3, arg6, arg5, var9.field3609);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class140 var27;
            class140 var28;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var27 = var9.method4613(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method4613(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class98(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3600, true, (class140) null);
                var28 = new class98(arg4, 2, var26, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2724(arg0, arg2, arg3, var17, var27, var28, field750[arg5], field750[var26], var20, var21);
            if (var9.field3608 != 0) {
                arg8.method3082(arg2, arg3, arg6, arg5, var9.field3609);
            }
        } else if (arg6 == 3) {
            class140 var29;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var29 = var9.method4613(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class98(arg4, 3, arg5, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2724(arg0, arg2, arg3, var17, var29, (class140) null, field747[arg5], 0, var20, var21);
            if (var9.field3608 != 0) {
                arg8.method3082(arg2, arg3, arg6, arg5, var9.field3609);
            }
        } else if (arg6 == 9) {
            class140 var30;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var30 = var9.method4613(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class98(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2635(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field3608 != 0) {
                arg8.method3093(arg2, arg3, var10, var11, var9.field3609);
            }
        } else if (arg6 == 4) {
            class140 var31;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var31 = var9.method4613(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class98(arg4, 4, arg5, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2634(arg0, arg2, arg3, var17, var31, (class140) null, field750[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2651(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class283.method713(var33 >> 14 & 0x7FFF).field3612;
            }
            class140 var34;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var34 = var9.method4613(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class98(arg4, 4, arg5, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2634(arg0, arg2, arg3, var17, var34, (class140) null, field750[arg5], 0, field739[arg5] * var32, field741[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2651(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class283.method713(var36 >> 14 & 0x7FFF).field3612 / 2;
            }
            class140 var37;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var37 = var9.method4613(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class98(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2634(arg0, arg2, arg3, var17, var37, (class140) null, 256, arg5, field753[arg5] * var35, field751[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class140 var39;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var39 = var9.method4613(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class98(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2634(arg0, arg2, arg3, var17, var39, (class140) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2651(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class283.method713(var41 >> 14 & 0x7FFF).field3612 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class140 var43;
            class140 var44;
            if (var9.field3600 == -1 && var9.field3632 == null) {
                var43 = var9.method4613(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method4613(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class98(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3600, true, (class140) null);
                var44 = new class98(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field3600, true, (class140) null);
            }
            arg7.method2634(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field753[arg5] * var40, field751[arg5] * var40, var20, var21);
        }
    }
}
