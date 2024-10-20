package deob;

@ObfuscatedName("bf")
public final class class62 {

    @ObfuscatedName("bf.a")
    public static int[][][] field696 = new int[4][105][105];

    @ObfuscatedName("bf.w")
    public static byte[][][] field711 = new byte[4][104][104];

    @ObfuscatedName("bf.e")
    public static int field695 = 99;

    @ObfuscatedName("bf.l")
    public static final int[] field702 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bf.m")
    public static final int[] field704 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bf.q")
    public static final int[] field705 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bf.b")
    public static final int[] field703 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bf.h")
    public static final int[] field706 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bf.d")
    public static final int[] field707 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bf.v")
    public static int field708 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bf.p")
    public static int field709 = (int) (Math.random() * 33.0D) - 16;

    public class62() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.a(B)V")
    public static void method2802() {
        field695 = 99;
        Statics.field694 = new byte[4][104][104];
        Statics.field2084 = new byte[4][104][104];
        Statics.field2227 = new byte[4][104][104];
        Statics.field414 = new byte[4][104][104];
        Statics.field1668 = new int[4][105][105];
        Statics.field1419 = new byte[4][105][105];
        Statics.field697 = new int[105][105];
        Statics.field698 = new int[104];
        Statics.field699 = new int[104];
        Statics.field311 = new int[104];
        Statics.field700 = new int[104];
        Statics.field29 = new int[104];
    }

    @ObfuscatedName("iy.w(IIIII)V")
    public static final void method3869(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1419[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field696[0][var5][var4] = field696[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field696[0][var5][var4] = field696[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field696[0][var5][var4] = field696[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field696[0][var5][var4] = field696[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cu.e([BIIII[Lfp;I)V")
    public static final void method1522(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class167[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2197[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class185 var9 = new class185(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1533(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("cz.k(Lgh;IIIIIIB)V")
    public static final void method1533(class185 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2962();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2962();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2962();
                }
            }
            return;
        }
        field711[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2962();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field696[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method962(var10 + 45365, var11 + 91923, 4) - 128 + (method962(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method962(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field696[arg1][arg2][arg3] = field696[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2962();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field696[0][arg2][arg3] = -var15 * 8;
                } else {
                    field696[arg1][arg2][arg3] = field696[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2084[arg1][arg2][arg3] = arg0.method3015();
                Statics.field2227[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field414[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field711[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field694[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bm.z(IIIIIILeh;Lfp;I)V")
    public static final void method940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class139 arg6, class167 arg7) {
        if (client.field1002 && (field711[0][arg1][arg2] & 0x2) == 0 && (field711[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field695) {
            field695 = arg0;
        }
        class267 var8 = class267.method2129(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3526;
            var10 = var8.field3544;
        } else {
            var9 = var8.field3544;
            var10 = var8.field3526;
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
        int[][] var15 = field696[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3529 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3550 == 1) {
            var20 += 256;
        }
        if (var8.method4297()) {
            class82 var21 = new class82();
            var21.field1226 = arg0;
            var21.field1224 = arg1 * 128;
            var21.field1225 = arg2 * 128;
            int var22 = var8.field3544;
            int var23 = var8.field3526;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field3526;
                var23 = var8.field3544;
            }
            var21.field1233 = (arg1 + var22) * 128;
            var21.field1237 = (arg2 + var23) * 128;
            var21.field1229 = var8.field3554;
            var21.field1222 = var8.field3555 * 128;
            var21.field1231 = var8.field3556;
            var21.field1232 = var8.field3547;
            var21.field1227 = var8.field3541;
            if (var8.field3551 != null) {
                var21.field1228 = var8;
                var21.method1413();
            }
            class82.field1236.method3446(var21);
            if (var21.field1227 != null) {
                var21.field1234 = var21.field1231 + (int) (Math.random() * (double) (var21.field1232 - var21.field1231));
            }
        }
        if (arg5 == 22) {
            if (!client.field1002 || var8.field3529 != 0 || var8.field3527 == 1 || var8.field3548) {
                class141 var24;
                if (var8.field3558 == -1 && var8.field3551 == null) {
                    var24 = var8.method4332(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class99(arg3, 22, arg4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
                }
                arg6.method2485(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field3527 == 1 && arg7 != null) {
                    arg7.method2854(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class141 var47;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var47 = var8.method4332(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class99(arg3, 10, arg4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            if (var47 != null && arg6.method2489(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3542) {
                int var48 = 15;
                if (var47 instanceof class133) {
                    var48 = ((class133) var47).method2304() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field1419[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field1419[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2835(arg1, arg2, var9, var10, var8.field3528);
            }
        } else if (arg5 >= 12) {
            class141 var25;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var25 = var8.method4332(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2489(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1668[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2835(arg1, arg2, var9, var10, var8.field3528);
            }
        } else if (arg5 == 0) {
            class141 var26;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var26 = var8.method4332(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class99(arg3, 0, arg4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2487(arg0, arg1, arg2, var16, var26, (class141) null, field702[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3542) {
                    Statics.field1419[arg0][arg1][arg2] = 50;
                    Statics.field1419[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3532) {
                    Statics.field1668[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3542) {
                    Statics.field1419[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1419[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3532) {
                    Statics.field1668[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3542) {
                    Statics.field1419[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1419[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3532) {
                    Statics.field1668[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3542) {
                    Statics.field1419[arg0][arg1][arg2] = 50;
                    Statics.field1419[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3532) {
                    Statics.field1668[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2834(arg1, arg2, arg5, arg4, var8.field3528);
            }
            if (var8.field3518 != 16) {
                arg6.method2558(arg0, arg1, arg2, var8.field3518);
            }
        } else if (arg5 == 1) {
            class141 var27;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var27 = var8.method4332(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class99(arg3, 1, arg4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2487(arg0, arg1, arg2, var16, var27, (class141) null, field704[arg4], 0, var19, var20);
            if (var8.field3542) {
                if (arg4 == 0) {
                    Statics.field1419[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1419[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1419[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1419[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2834(arg1, arg2, arg5, arg4, var8.field3528);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class141 var29;
            class141 var30;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var29 = var8.method4332(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method4332(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class99(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
                var30 = new class99(arg3, 2, var28, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2487(arg0, arg1, arg2, var16, var29, var30, field702[arg4], field702[var28], var19, var20);
            if (var8.field3532) {
                if (arg4 == 0) {
                    Statics.field1668[arg0][arg1][arg2] |= 0x249;
                    Statics.field1668[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1668[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1668[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1668[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1668[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1668[arg0][arg1][arg2] |= 0x492;
                    Statics.field1668[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2834(arg1, arg2, arg5, arg4, var8.field3528);
            }
            if (var8.field3518 != 16) {
                arg6.method2558(arg0, arg1, arg2, var8.field3518);
            }
        } else if (arg5 == 3) {
            class141 var31;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var31 = var8.method4332(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class99(arg3, 3, arg4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2487(arg0, arg1, arg2, var16, var31, (class141) null, field704[arg4], 0, var19, var20);
            if (var8.field3542) {
                if (arg4 == 0) {
                    Statics.field1419[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1419[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1419[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1419[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2834(arg1, arg2, arg5, arg4, var8.field3528);
            }
        } else if (arg5 == 9) {
            class141 var32;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var32 = var8.method4332(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class99(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2489(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field3527 != 0 && arg7 != null) {
                arg7.method2835(arg1, arg2, var9, var10, var8.field3528);
            }
            if (var8.field3518 != 16) {
                arg6.method2558(arg0, arg1, arg2, var8.field3518);
            }
        } else if (arg5 == 4) {
            class141 var33;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var33 = var8.method4332(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2585(arg0, arg1, arg2, var16, var33, (class141) null, field702[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method2505(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class267.method2129(var35 >> 14 & 0x7FFF).field3518;
            }
            class141 var36;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var36 = var8.method4332(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class99(arg3, 4, arg4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2585(arg0, arg1, arg2, var16, var36, (class141) null, field702[arg4], 0, field705[arg4] * var34, field703[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method2505(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class267.method2129(var38 >> 14 & 0x7FFF).field3518 / 2;
            }
            class141 var39;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var39 = var8.method4332(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2585(arg0, arg1, arg2, var16, var39, (class141) null, 256, arg4, field706[arg4] * var37, field707[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class141 var41;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var41 = var8.method4332(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class99(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2585(arg0, arg1, arg2, var16, var41, (class141) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method2505(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class267.method2129(var43 >> 14 & 0x7FFF).field3518 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class141 var45;
            class141 var46;
            if (var8.field3558 == -1 && var8.field3551 == null) {
                var45 = var8.method4332(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method4332(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class99(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
                var46 = new class99(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field3558, true, (class141) null);
            }
            arg6.method2585(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field706[arg4] * var42, field707[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("bl.t(IIII)I")
    public static final int method962(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method958(var3, var5);
        int var8 = method958(var3 + 1, var5);
        int var9 = method958(var3, var5 + 1);
        int var10 = method958(var3 + 1, var5 + 1);
        int var11 = 65536 - class136.field1926[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class136.field1926[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class136.field1926[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("bi.f(III)I")
    public static final int method958(int arg0, int arg1) {
        int var2 = method8(arg0 - 1, arg1 - 1) + method8(arg0 + 1, arg1 - 1) + method8(arg0 - 1, arg1 + 1) + method8(arg0 + 1, arg1 + 1);
        int var3 = method8(arg0 - 1, arg1) + method8(arg0 + 1, arg1) + method8(arg0, arg1 - 1) + method8(arg0, arg1 + 1);
        int var4 = method8(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("k.g(IIB)I")
    public static final int method8(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ch.x(III)I")
    public static final int method1363(int arg0, int arg1) {
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

    @ObfuscatedName("ft.c(IIB)I")
    public static final int method2865(int arg0, int arg1) {
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

    @ObfuscatedName("bj.n(IIII)I")
    public static final int method1001(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ag.y(III)Z")
    public static final boolean method227(int arg0, int arg1) {
        class267 var2 = class267.method2129(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4289(arg1);
    }
}
