package deob;

@ObfuscatedName("j")
public final class class9 {

    @ObfuscatedName("j.u")
    public static int[][][] field137 = new int[4][105][105];

    @ObfuscatedName("j.k")
    public static byte[][][] field135 = new byte[4][104][104];

    @ObfuscatedName("j.x")
    public static int field126 = 99;

    @ObfuscatedName("j.v")
    public static final int[] field138 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("j.s")
    public static final int[] field130 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("j.f")
    public static final int[] field136 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("j.y")
    public static final int[] field132 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("j.t")
    public static final int[] field124 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("j.r")
    public static final int[] field125 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("j.p")
    public static int field140 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("j.o")
    public static int field141 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ew.u(I)V")
    public static void method2680() {
        Statics.field127 = (byte[][][]) null;
        Statics.field128 = (byte[][][]) null;
        Statics.field129 = (byte[][][]) null;
        Statics.field147 = (byte[][][]) null;
        Statics.field2329 = (int[][][]) null;
        Statics.field280 = (byte[][][]) null;
        Statics.field131 = (int[][]) null;
        Statics.field386 = null;
        Statics.field2759 = null;
        Statics.field1487 = null;
        Statics.field134 = null;
        Statics.field1433 = null;
    }

    @ObfuscatedName("z.k(IIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field280[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field137[0][var5][var4] = field137[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field137[0][var5][var4] = field137[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field137[0][var5][var4] = field137[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field137[0][var5][var4] = field137[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ey.x([BIIII[Lfw;I)V")
    public static final void method3094(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class163[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2729[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class126 var9 = new class126(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method573(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("af.m(Ldl;IIIIIII)V")
    public static final void method573(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2559();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2559();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2559();
                }
            }
            return;
        }
        field135[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2559();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field137[0][arg2][arg3] = -method2352(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field137[arg1][arg2][arg3] = field137[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2559();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field137[0][arg2][arg3] = -var8 * 8;
                } else {
                    field137[arg1][arg2][arg3] = field137[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field128[arg1][arg2][arg3] = arg0.method2449();
                Statics.field129[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field147[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field135[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field127[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("e.n([BIILca;[Lfw;B)V")
    public static final void method136(byte[] arg0, int arg1, int arg2, class94 arg3, class163[] arg4) {
        class126 var5 = new class126(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2580();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2580();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2559();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field135[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class163 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method801(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("bc.q([BIIIIIIILca;[Lfw;I)V")
    public static final void method1531(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8, class163[] arg9) {
        class126 var10 = new class126(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2580();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2580();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2559();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class31 var21 = class31.method132(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field852;
                    int var27 = var21.field840;
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
                    int var32 = arg3 + class159.method2371(var16 & 0x7, var15 & 0x7, arg7, var21.field852, var21.field840, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field135[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class163 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method801(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.a(IIIIIILca;Lfw;I)V")
    public static final void method801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class94 arg6, class163 arg7) {
        if (client.field472 && (field135[0][arg1][arg2] & 0x2) == 0) {
            if ((field135[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method126(arg0, arg1, arg2) != client.field523) {
                return;
            }
        }
        if (arg0 < field126) {
            field126 = arg0;
        }
        class31 var8 = class31.method132(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field840;
            var10 = var8.field852;
        } else {
            var9 = var8.field852;
            var10 = var8.field840;
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
        int[][] var15 = field137[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field811 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field850 == 1) {
            var20 += 256;
        }
        if (var8.method639()) {
            class7.method3139(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field472 || var8.field811 != 0 || var8.field826 == 1 || var8.field848) {
                class93 var21;
                if (var8.field832 == -1 && var8.field851 == null) {
                    var21 = var8.method618(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field832, true, (class93) null);
                }
                arg6.method1863(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field826 == 1 && arg7 != null) {
                    arg7.method3213(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class93 var44;
            if (var8.field832 == -1 && var8.field851 == null) {
                var44 = var8.method618(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            if (var44 != null && arg6.method1867(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field821) {
                int var45 = 15;
                if (var44 instanceof class111) {
                    var45 = ((class111) var44).method2300() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field280[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field280[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field826 != 0 && arg7 != null) {
                arg7.method3211(arg1, arg2, var9, var10, var8.field827);
            }
        } else if (arg5 >= 12) {
            class93 var22;
            if (var8.field832 == -1 && var8.field851 == null) {
                var22 = var8.method618(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1867(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2329[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field826 != 0 && arg7 != null) {
                arg7.method3211(arg1, arg2, var9, var10, var8.field827);
            }
        } else if (arg5 == 0) {
            class93 var23;
            if (var8.field832 == -1 && var8.field851 == null) {
                var23 = var8.method618(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1865(arg0, arg1, arg2, var16, var23, (class93) null, field138[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field821) {
                    Statics.field280[arg0][arg1][arg2] = 50;
                    Statics.field280[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field836) {
                    Statics.field2329[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field821) {
                    Statics.field280[arg0][arg1][arg2 + 1] = 50;
                    Statics.field280[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field836) {
                    Statics.field2329[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field821) {
                    Statics.field280[arg0][arg1 + 1][arg2] = 50;
                    Statics.field280[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field836) {
                    Statics.field2329[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field821) {
                    Statics.field280[arg0][arg1][arg2] = 50;
                    Statics.field280[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field836) {
                    Statics.field2329[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field826 != 0 && arg7 != null) {
                arg7.method3238(arg1, arg2, arg5, arg4, var8.field827);
            }
            if (var8.field833 != 16) {
                arg6.method1872(arg0, arg1, arg2, var8.field833);
            }
        } else if (arg5 == 1) {
            class93 var24;
            if (var8.field832 == -1 && var8.field851 == null) {
                var24 = var8.method618(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1865(arg0, arg1, arg2, var16, var24, (class93) null, field130[arg4], 0, var19, var20);
            if (var8.field821) {
                if (arg4 == 0) {
                    Statics.field280[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field280[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field280[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field280[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field826 != 0 && arg7 != null) {
                arg7.method3238(arg1, arg2, arg5, arg4, var8.field827);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class93 var26;
            class93 var27;
            if (var8.field832 == -1 && var8.field851 == null) {
                var26 = var8.method618(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method618(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field832, true, (class93) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1865(arg0, arg1, arg2, var16, var26, var27, field138[arg4], field138[var25], var19, var20);
            if (var8.field836) {
                if (arg4 == 0) {
                    Statics.field2329[arg0][arg1][arg2] |= 0x249;
                    Statics.field2329[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2329[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2329[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2329[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2329[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2329[arg0][arg1][arg2] |= 0x492;
                    Statics.field2329[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field826 != 0 && arg7 != null) {
                arg7.method3238(arg1, arg2, arg5, arg4, var8.field827);
            }
            if (var8.field833 != 16) {
                arg6.method1872(arg0, arg1, arg2, var8.field833);
            }
        } else if (arg5 == 3) {
            class93 var28;
            if (var8.field832 == -1 && var8.field851 == null) {
                var28 = var8.method618(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1865(arg0, arg1, arg2, var16, var28, (class93) null, field130[arg4], 0, var19, var20);
            if (var8.field821) {
                if (arg4 == 0) {
                    Statics.field280[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field280[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field280[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field280[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field826 != 0 && arg7 != null) {
                arg7.method3238(arg1, arg2, arg5, arg4, var8.field827);
            }
        } else if (arg5 == 9) {
            class93 var29;
            if (var8.field832 == -1 && var8.field851 == null) {
                var29 = var8.method618(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1867(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field826 != 0 && arg7 != null) {
                arg7.method3211(arg1, arg2, var9, var10, var8.field827);
            }
            if (var8.field833 != 16) {
                arg6.method1872(arg0, arg1, arg2, var8.field833);
            }
        } else if (arg5 == 4) {
            class93 var30;
            if (var8.field832 == -1 && var8.field851 == null) {
                var30 = var8.method618(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1866(arg0, arg1, arg2, var16, var30, (class93) null, field138[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1896(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class31.method132(var32 >> 14 & 0x7FFF).field833;
            }
            class93 var33;
            if (var8.field832 == -1 && var8.field851 == null) {
                var33 = var8.method618(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1866(arg0, arg1, arg2, var16, var33, (class93) null, field138[arg4], 0, field136[arg4] * var31, field132[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1896(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class31.method132(var35 >> 14 & 0x7FFF).field833 / 2;
            }
            class93 var36;
            if (var8.field832 == -1 && var8.field851 == null) {
                var36 = var8.method618(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1866(arg0, arg1, arg2, var16, var36, (class93) null, 256, arg4, field124[arg4] * var34, field125[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class93 var38;
            if (var8.field832 == -1 && var8.field851 == null) {
                var38 = var8.method618(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1866(arg0, arg1, arg2, var16, var38, (class93) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1896(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class31.method132(var40 >> 14 & 0x7FFF).field833 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class93 var42;
            class93 var43;
            if (var8.field832 == -1 && var8.field851 == null) {
                var42 = var8.method618(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method618(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field832, true, (class93) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field832, true, (class93) null);
            }
            arg6.method1866(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field124[arg4] * var39, field125[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("z.g(IIIB)I")
    public static int method126(int arg0, int arg1, int arg2) {
        if ((field135[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field135[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dj.j(III)I")
    public static final int method2352(int arg0, int arg1) {
        int var2 = method893(arg0 + 45365, arg1 + 91923, 4) - 128 + (method893(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method893(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("an.l(IIII)I")
    public static final int method893(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method35(var3, var5);
        int var8 = method35(var3 + 1, var5);
        int var9 = method35(var3, var5 + 1);
        int var10 = method35(var3 + 1, var5 + 1);
        int var11 = method226(var7, var8, var4, arg2);
        int var12 = method226(var9, var10, var4, arg2);
        return method226(var11, var12, var6, arg2);
    }

    @ObfuscatedName("p.w(IIIII)I")
    public static final int method226(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class103.field1747[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("m.z(III)I")
    public static final int method35(int arg0, int arg1) {
        int var2 = method149(arg0 - 1, arg1 - 1) + method149(arg0 + 1, arg1 - 1) + method149(arg0 - 1, arg1 + 1) + method149(arg0 + 1, arg1 + 1);
        int var3 = method149(arg0 - 1, arg1) + method149(arg0 + 1, arg1) + method149(arg0, arg1 - 1) + method149(arg0, arg1 + 1);
        int var4 = method149(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("c.e(III)I")
    public static final int method149(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ep.b(III)I")
    public static final int method2952(int arg0, int arg1) {
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

    @ObfuscatedName("q.c(III)I")
    public static final int method43(int arg0, int arg1) {
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

    @ObfuscatedName("aj.d(IIII)I")
    public static final int method807(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dp.h(IIB)Z")
    public static final boolean method2379(int arg0, int arg1) {
        class31 var2 = class31.method132(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method616(arg1);
    }

    @ObfuscatedName("l.i(IIIIIIILca;Lfw;B)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class94 arg7, class163 arg8) {
        class31 var9 = class31.method132(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field840;
            var11 = var9.field852;
        } else {
            var10 = var9.field852;
            var11 = var9.field840;
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
        int[][] var16 = field137[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field811 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field850 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class93 var22;
            if (var9.field832 == -1 && var9.field851 == null) {
                var22 = var9.method638(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1863(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field826 == 1) {
                arg8.method3213(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class93 var45;
            if (var9.field832 == -1 && var9.field851 == null) {
                var45 = var9.method638(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            if (var45 != null) {
                arg7.method1867(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field826 != 0) {
                arg8.method3211(arg2, arg3, var10, var11, var9.field827);
            }
        } else if (arg6 >= 12) {
            class93 var23;
            if (var9.field832 == -1 && var9.field851 == null) {
                var23 = var9.method638(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1867(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field826 != 0) {
                arg8.method3211(arg2, arg3, var10, var11, var9.field827);
            }
        } else if (arg6 == 0) {
            class93 var24;
            if (var9.field832 == -1 && var9.field851 == null) {
                var24 = var9.method638(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1865(arg0, arg2, arg3, var17, var24, (class93) null, field138[arg5], 0, var20, var21);
            if (var9.field826 != 0) {
                arg8.method3238(arg2, arg3, arg6, arg5, var9.field827);
            }
        } else if (arg6 == 1) {
            class93 var25;
            if (var9.field832 == -1 && var9.field851 == null) {
                var25 = var9.method638(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1865(arg0, arg2, arg3, var17, var25, (class93) null, field130[arg5], 0, var20, var21);
            if (var9.field826 != 0) {
                arg8.method3238(arg2, arg3, arg6, arg5, var9.field827);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class93 var27;
            class93 var28;
            if (var9.field832 == -1 && var9.field851 == null) {
                var27 = var9.method638(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method638(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field832, true, (class93) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1865(arg0, arg2, arg3, var17, var27, var28, field138[arg5], field138[var26], var20, var21);
            if (var9.field826 != 0) {
                arg8.method3238(arg2, arg3, arg6, arg5, var9.field827);
            }
        } else if (arg6 == 3) {
            class93 var29;
            if (var9.field832 == -1 && var9.field851 == null) {
                var29 = var9.method638(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1865(arg0, arg2, arg3, var17, var29, (class93) null, field130[arg5], 0, var20, var21);
            if (var9.field826 != 0) {
                arg8.method3238(arg2, arg3, arg6, arg5, var9.field827);
            }
        } else if (arg6 == 9) {
            class93 var30;
            if (var9.field832 == -1 && var9.field851 == null) {
                var30 = var9.method638(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1867(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field826 != 0) {
                arg8.method3211(arg2, arg3, var10, var11, var9.field827);
            }
        } else if (arg6 == 4) {
            class93 var31;
            if (var9.field832 == -1 && var9.field851 == null) {
                var31 = var9.method638(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1866(arg0, arg2, arg3, var17, var31, (class93) null, field138[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1896(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class31.method132(var33 >> 14 & 0x7FFF).field833;
            }
            class93 var34;
            if (var9.field832 == -1 && var9.field851 == null) {
                var34 = var9.method638(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1866(arg0, arg2, arg3, var17, var34, (class93) null, field138[arg5], 0, field136[arg5] * var32, field132[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1896(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class31.method132(var36 >> 14 & 0x7FFF).field833 / 2;
            }
            class93 var37;
            if (var9.field832 == -1 && var9.field851 == null) {
                var37 = var9.method638(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1866(arg0, arg2, arg3, var17, var37, (class93) null, 256, arg5, field124[arg5] * var35, field125[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class93 var39;
            if (var9.field832 == -1 && var9.field851 == null) {
                var39 = var9.method638(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1866(arg0, arg2, arg3, var17, var39, (class93) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1896(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class31.method132(var41 >> 14 & 0x7FFF).field833 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class93 var43;
            class93 var44;
            if (var9.field832 == -1 && var9.field851 == null) {
                var43 = var9.method638(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method638(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field832, true, (class93) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field832, true, (class93) null);
            }
            arg7.method1866(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field124[arg5] * var40, field125[arg5] * var40, var20, var21);
        }
    }
}
