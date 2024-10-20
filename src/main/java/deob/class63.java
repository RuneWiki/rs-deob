package deob;

@ObfuscatedName("bj")
public final class class63 {

    @ObfuscatedName("bj.d")
    public static int[][][] field738 = new int[4][105][105];

    @ObfuscatedName("bj.z")
    public static byte[][][] field736 = new byte[4][104][104];

    @ObfuscatedName("bj.n")
    public static int field737 = 99;

    @ObfuscatedName("bj.b")
    public static final int[] field744 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bj.c")
    public static final int[] field750 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bj.j")
    public static final int[] field746 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bj.l")
    public static final int[] field747 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bj.g")
    public static final int[] field748 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bj.w")
    public static final int[] field749 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bj.o")
    public static int field743 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bj.a")
    public static int field751 = (int) (Math.random() * 33.0D) - 16;

    public class63() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.d(I)V")
    public static void method150() {
        Statics.field2108 = (byte[][][]) null;
        Statics.field745 = (byte[][][]) null;
        Statics.field735 = (byte[][][]) null;
        Statics.field740 = (byte[][][]) null;
        Statics.field739 = (int[][][]) null;
        Statics.field741 = (byte[][][]) null;
        Statics.field742 = (int[][]) null;
        Statics.field328 = null;
        Statics.field3920 = null;
        Statics.field322 = null;
        Statics.field431 = null;
        Statics.field317 = null;
    }

    @ObfuscatedName("ed.z(IIIII)V")
    public static final void method2918(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field741[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field738[0][var5][var4] = field738[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field738[0][var5][var4] = field738[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field738[0][var5][var4] = field738[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field738[0][var5][var4] = field738[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cz.r(IIII)V")
    public static final void method1916(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field738[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field738[arg0][arg1][arg2 + var5] = field738[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field738[arg0][arg1 + var6][arg2] = field738[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field738[arg0][arg1 - 1][arg2] != 0) {
            field738[arg0][arg1][arg2] = field738[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field738[arg0][arg1][arg2 - 1] != 0) {
            field738[arg0][arg1][arg2] = field738[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field738[arg0][arg1 - 1][arg2 - 1] != 0) {
            field738[arg0][arg1][arg2] = field738[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ga.y([BIILec;[Lfb;I)V")
    public static final void method3177(byte[] arg0, int arg1, int arg2, class138 arg3, class177[] arg4) {
        class195 var5 = new class195(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3380();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3380();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method3330();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field736[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class177 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method29(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("k.k(IIIIIILec;Lfb;B)V")
    public static final void method29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class138 arg6, class177 arg7) {
        if (client.field862 && (field736[0][arg1][arg2] & 0x2) == 0 && (field736[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field737) {
            field737 = arg0;
        }
        class283 var8 = class283.method3065(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3605;
            var10 = var8.field3604;
        } else {
            var9 = var8.field3604;
            var10 = var8.field3605;
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
        int[][] var15 = field738[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field3608 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field3629 == 1) {
            var20 += 256;
        }
        if (var8.method4714()) {
            class81.method4984(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field862 || var8.field3608 != 0 || var8.field3616 == 1 || var8.field3632) {
                class140 var21;
                if (var8.field3612 == -1 && var8.field3630 == null) {
                    var21 = var8.method4732(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class98(arg3, 22, arg4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
                }
                arg6.method2706(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field3616 == 1 && arg7 != null) {
                    arg7.method3116(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class140 var44;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var44 = var8.method4732(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class98(arg3, 10, arg4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            if (var44 != null && arg6.method2710(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field3623) {
                int var45 = 15;
                if (var44 instanceof class132) {
                    var45 = ((class132) var44).method2530() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field741[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field741[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field3616 != 0 && arg7 != null) {
                arg7.method3115(arg1, arg2, var9, var10, var8.field3607);
            }
        } else if (arg5 >= 12) {
            class140 var22;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var22 = var8.method4732(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2710(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field739[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3616 != 0 && arg7 != null) {
                arg7.method3115(arg1, arg2, var9, var10, var8.field3607);
            }
        } else if (arg5 == 0) {
            class140 var23;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var23 = var8.method4732(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class98(arg3, 0, arg4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2708(arg0, arg1, arg2, var16, var23, (class140) null, field744[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field3623) {
                    Statics.field741[arg0][arg1][arg2] = 50;
                    Statics.field741[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3611) {
                    Statics.field739[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3623) {
                    Statics.field741[arg0][arg1][arg2 + 1] = 50;
                    Statics.field741[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3611) {
                    Statics.field739[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3623) {
                    Statics.field741[arg0][arg1 + 1][arg2] = 50;
                    Statics.field741[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3611) {
                    Statics.field739[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3623) {
                    Statics.field741[arg0][arg1][arg2] = 50;
                    Statics.field741[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3611) {
                    Statics.field739[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3616 != 0 && arg7 != null) {
                arg7.method3114(arg1, arg2, arg5, arg4, var8.field3607);
            }
            if (var8.field3635 != 16) {
                arg6.method2716(arg0, arg1, arg2, var8.field3635);
            }
        } else if (arg5 == 1) {
            class140 var24;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var24 = var8.method4732(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class98(arg3, 1, arg4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2708(arg0, arg1, arg2, var16, var24, (class140) null, field750[arg4], 0, var19, var20);
            if (var8.field3623) {
                if (arg4 == 0) {
                    Statics.field741[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field741[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field741[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field741[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3616 != 0 && arg7 != null) {
                arg7.method3114(arg1, arg2, arg5, arg4, var8.field3607);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class140 var26;
            class140 var27;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var26 = var8.method4732(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method4732(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class98(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
                var27 = new class98(arg3, 2, var25, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2708(arg0, arg1, arg2, var16, var26, var27, field744[arg4], field744[var25], var19, var20);
            if (var8.field3611) {
                if (arg4 == 0) {
                    Statics.field739[arg0][arg1][arg2] |= 0x249;
                    Statics.field739[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field739[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field739[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field739[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field739[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field739[arg0][arg1][arg2] |= 0x492;
                    Statics.field739[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3616 != 0 && arg7 != null) {
                arg7.method3114(arg1, arg2, arg5, arg4, var8.field3607);
            }
            if (var8.field3635 != 16) {
                arg6.method2716(arg0, arg1, arg2, var8.field3635);
            }
        } else if (arg5 == 3) {
            class140 var28;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var28 = var8.method4732(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class98(arg3, 3, arg4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2708(arg0, arg1, arg2, var16, var28, (class140) null, field750[arg4], 0, var19, var20);
            if (var8.field3623) {
                if (arg4 == 0) {
                    Statics.field741[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field741[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field741[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field741[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3616 != 0 && arg7 != null) {
                arg7.method3114(arg1, arg2, arg5, arg4, var8.field3607);
            }
        } else if (arg5 == 9) {
            class140 var29;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var29 = var8.method4732(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class98(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2710(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field3616 != 0 && arg7 != null) {
                arg7.method3115(arg1, arg2, var9, var10, var8.field3607);
            }
            if (var8.field3635 != 16) {
                arg6.method2716(arg0, arg1, arg2, var8.field3635);
            }
        } else if (arg5 == 4) {
            class140 var30;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var30 = var8.method4732(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2709(arg0, arg1, arg2, var16, var30, (class140) null, field744[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method2762(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class283.method3065(var32 >> 14 & 0x7FFF).field3635;
            }
            class140 var33;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var33 = var8.method4732(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class98(arg3, 4, arg4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2709(arg0, arg1, arg2, var16, var33, (class140) null, field744[arg4], 0, field746[arg4] * var31, field747[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method2762(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class283.method3065(var35 >> 14 & 0x7FFF).field3635 / 2;
            }
            class140 var36;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var36 = var8.method4732(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2709(arg0, arg1, arg2, var16, var36, (class140) null, 256, arg4, field748[arg4] * var34, field749[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class140 var38;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var38 = var8.method4732(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class98(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2709(arg0, arg1, arg2, var16, var38, (class140) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method2762(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class283.method3065(var40 >> 14 & 0x7FFF).field3635 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class140 var42;
            class140 var43;
            if (var8.field3612 == -1 && var8.field3630 == null) {
                var42 = var8.method4732(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method4732(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class98(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
                var43 = new class98(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field3612, true, (class140) null);
            }
            arg6.method2709(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field748[arg4] * var39, field749[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("a.s(Lec;[Lfb;I)V")
    public static final void method182(class138 arg0, class177[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field736[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field736[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3112(var3, var4);
                        }
                    }
                }
            }
        }
        field743 += (int) (Math.random() * 5.0D) - 2;
        if (field743 < -8) {
            field743 = -8;
        }
        if (field743 > 8) {
            field743 = 8;
        }
        field751 += (int) (Math.random() * 5.0D) - 2;
        if (field751 < -16) {
            field751 = -16;
        }
        if (field751 > 16) {
            field751 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field741[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field738[var6][var11 + 1][var10] - field738[var6][var11 - 1][var10];
                    int var13 = field738[var6][var11][var10 + 1] - field738[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field742[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field328[var20] = 0;
                Statics.field3920[var20] = 0;
                Statics.field322[var20] = 0;
                Statics.field431[var20] = 0;
                Statics.field317[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field2108[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class274 var25 = class274.method4455(var24 - 1);
                            Statics.field328[var22] += var25.field3498;
                            Statics.field3920[var22] += var25.field3499;
                            Statics.field322[var22] += var25.field3500;
                            Statics.field431[var22] += var25.field3501;
                            var10002 = Statics.field317[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field2108[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class274 var28 = class274.method4455(var27 - 1);
                            Statics.field328[var22] -= var28.field3498;
                            Statics.field3920[var22] -= var28.field3499;
                            Statics.field322[var22] -= var28.field3500;
                            Statics.field431[var22] -= var28.field3501;
                            var10002 = Statics.field317[var22]--;
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
                            var29 += Statics.field328[var35];
                            var30 += Statics.field3920[var35];
                            var31 += Statics.field322[var35];
                            var32 += Statics.field431[var35];
                            var33 += Statics.field317[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field328[var36];
                            var30 -= Statics.field3920[var36];
                            var31 -= Statics.field322[var36];
                            var32 -= Statics.field431[var36];
                            var33 -= Statics.field317[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field862 || (field736[0][var21][var34] & 0x2) != 0 || (field736[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field737) {
                                field737 = var6;
                            }
                            int var37 = Statics.field2108[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field745[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field738[var6][var21][var34];
                                int var40 = field738[var6][var21 + 1][var34];
                                int var41 = field738[var6][var21 + 1][var34 + 1];
                                int var42 = field738[var6][var21][var34 + 1];
                                int var43 = Statics.field742[var21][var34];
                                int var44 = Statics.field742[var21 + 1][var34];
                                int var45 = Statics.field742[var21 + 1][var34 + 1];
                                int var46 = Statics.field742[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = Statics.method183(var49, var50, var51);
                                    int var52 = field743 + var49 & 0xFF;
                                    int var53 = field751 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = Statics.method183(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field735[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class287.method729(var38 - 1).field3745) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field739[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class135.field1919[method1522(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method2705(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method1522(var47, var43), method1522(var47, var44), method1522(var47, var45), method1522(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field735[var6][var21][var34] + 1;
                                    byte var57 = Statics.field740[var6][var21][var34];
                                    class287 var58 = class287.method729(var38 - 1);
                                    int var59 = var58.field3744;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1941.method2394(var59);
                                        var61 = -1;
                                    } else if (var58.field3743 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = Statics.method183(var58.field3750, var58.field3741, var58.field3749);
                                        int var62 = field743 + var58.field3750 & 0xFF;
                                        int var63 = field751 + var58.field3749;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = Statics.method183(var62, var58.field3741, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class135.field1919[method677(var60, 96)];
                                    }
                                    if (var58.field3746 != -1) {
                                        int var65 = field743 + var58.field3748 & 0xFF;
                                        int var66 = field751 + var58.field3752;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = Statics.method183(var65, var58.field3742, var66);
                                        var64 = class135.field1919[method677(var67, 96)];
                                    }
                                    arg0.method2705(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method1522(var47, var43), method1522(var47, var44), method1522(var47, var45), method1522(var47, var46), method677(var61, var43), method677(var61, var44), method677(var61, var45), method677(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field736[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field736[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method2704(var6, var69, var68, var74);
                }
            }
            Statics.field2108[var6] = (byte[][]) null;
            Statics.field745[var6] = (byte[][]) null;
            Statics.field735[var6] = (byte[][]) null;
            Statics.field740[var6] = (byte[][]) null;
            Statics.field741[var6] = (byte[][]) null;
        }
        arg0.method2731(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field736[1][var75][var76] & 0x2) == 2) {
                    arg0.method2702(var75, var76);
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
                        if ((Statics.field739[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field739[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field739[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field739[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field739[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field738[var87][var83][var84] - var91;
                                int var93 = field738[var86][var83][var84];
                                class138.method2703(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field739[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field739[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field739[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field739[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field739[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field739[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field738[var99][var96][var82] - var103;
                                int var105 = field738[var98][var96][var82];
                                class138.method2703(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field739[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field739[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field739[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field739[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field739[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field739[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field738[var81][var108][var110];
                                class138.method2703(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field739[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.x(IIII)I")
    public static final int method23(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method16(var3, var5);
        int var8 = method16(var3 + 1, var5);
        int var9 = method16(var3, var5 + 1);
        int var10 = method16(var3 + 1, var5 + 1);
        int var11 = method965(var7, var8, var4, arg2);
        int var12 = method965(var9, var10, var4, arg2);
        return method965(var11, var12, var6, arg2);
    }

    @ObfuscatedName("be.h(IIIII)I")
    public static final int method965(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class135.field1945[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("y.t(III)I")
    public static final int method16(int arg0, int arg1) {
        int var2 = method176(arg0 - 1, arg1 - 1) + method176(arg0 + 1, arg1 - 1) + method176(arg0 - 1, arg1 + 1) + method176(arg0 + 1, arg1 + 1);
        int var3 = method176(arg0 - 1, arg1) + method176(arg0 + 1, arg1) + method176(arg0, arg1 - 1) + method176(arg0, arg1 + 1);
        int var4 = method176(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("o.i(III)I")
    public static final int method176(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bo.u(IIB)I")
    public static final int method1522(int arg0, int arg1) {
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

    @ObfuscatedName("bc.q(III)I")
    public static final int method677(int arg0, int arg1) {
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

    @ObfuscatedName("bu.f(III)Z")
    public static final boolean method730(int arg0, int arg1) {
        class283 var2 = class283.method3065(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4706(arg1);
    }
}
