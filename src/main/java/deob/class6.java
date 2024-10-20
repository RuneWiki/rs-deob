package deob;

@ObfuscatedName("k")
public final class class6 {

    @ObfuscatedName("k.e")
    public static int[][][] field91 = new int[4][105][105];

    @ObfuscatedName("k.p")
    public static byte[][][] field82 = new byte[4][104][104];

    @ObfuscatedName("k.a")
    public static int field99 = 99;

    @ObfuscatedName("k.z")
    public static final int[] field100 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("k.x")
    public static final int[] field92 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("k.q")
    public static final int[] field93 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("k.s")
    public static final int[] field94 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("k.j")
    public static final int[] field95 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("k.y")
    public static final int[] field96 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("k.r")
    public static int field97 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("k.h")
    public static int field98 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.e(IIIII)V")
    public static final void method508(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2468[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field91[0][var5][var4] = field91[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field91[0][var5][var4] = field91[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field91[0][var5][var4] = field91[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field91[0][var5][var4] = field91[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ed.p(Ldp;IIIIIII)V")
    public static final void method2671(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2125();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2125();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2125();
                }
            }
            return;
        }
        field82[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2125();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field91[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2366(var10 + 45365, var11 + 91923, 4) - 128 + (method2366(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2366(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field91[arg1][arg2][arg3] = field91[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2125();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field91[0][arg2][arg3] = -var15 * 8;
                } else {
                    field91[arg1][arg2][arg3] = field91[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field83[arg1][arg2][arg3] = arg0.method2201();
                Statics.field86[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2648[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field82[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field89[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("al.a([BIII)Z")
    public static final boolean method934(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class107 var4 = new class107(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2167();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2167();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2125() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class36 var16 = class36.method1794(var5);
                        if (var13 != 22 || !client.field260 || var16.field852 != 0 || var16.field844 == 1 || var16.field863) {
                            if (!var16.method653()) {
                                client.field312++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2167();
                if (var9 == 0) {
                    break;
                }
                var4.method2125();
            }
        }
    }

    @ObfuscatedName("dk.g([BIILcg;[Lgf;B)V")
    public static final void method2437(byte[] arg0, int arg1, int arg2, class79 arg3, class194[] arg4) {
        class107 var5 = new class107(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2167();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2167();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2125();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field82[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class194 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method850(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("at.u(IIIIIILcg;Lgf;B)V")
    public static final void method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class194 arg7) {
        if (client.field260 && (field82[0][arg1][arg2] & 0x2) == 0) {
            if ((field82[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method500(arg0, arg1, arg2) != client.field449) {
                return;
            }
        }
        if (arg0 < field99) {
            field99 = arg0;
        }
        class36 var8 = class36.method1794(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field824;
            var10 = var8.field840;
        } else {
            var9 = var8.field840;
            var10 = var8.field824;
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
        int[][] var15 = field91[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field852 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field873 == 1) {
            var20 += 256;
        }
        if (var8.method659()) {
            class20.method148(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field260 || var8.field852 != 0 || var8.field844 == 1 || var8.field863) {
                class78 var21;
                if (var8.field848 == -1 && var8.field866 == null) {
                    var21 = var8.method654(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field848, true, (class78) null);
                }
                arg6.method1783(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field844 == 1 && arg7 != null) {
                    arg7.method3469(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var44;
            if (var8.field848 == -1 && var8.field866 == null) {
                var44 = var8.method654(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            if (var44 != null && arg6.method1619(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field856) {
                int var45 = 15;
                if (var44 instanceof class98) {
                    var45 = ((class98) var44).method2028() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field2468[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field2468[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method3467(arg1, arg2, var9, var10, var8.field828);
            }
        } else if (arg5 >= 12) {
            class78 var22;
            if (var8.field848 == -1 && var8.field866 == null) {
                var22 = var8.method654(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1619(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field81[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method3467(arg1, arg2, var9, var10, var8.field828);
            }
        } else if (arg5 == 0) {
            class78 var23;
            if (var8.field848 == -1 && var8.field866 == null) {
                var23 = var8.method654(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1708(arg0, arg1, arg2, var16, var23, (class78) null, field100[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field856) {
                    Statics.field2468[arg0][arg1][arg2] = 50;
                    Statics.field2468[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field847) {
                    Statics.field81[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field856) {
                    Statics.field2468[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2468[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field847) {
                    Statics.field81[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field856) {
                    Statics.field2468[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2468[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field847) {
                    Statics.field81[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field856) {
                    Statics.field2468[arg0][arg1][arg2] = 50;
                    Statics.field2468[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field847) {
                    Statics.field81[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method3500(arg1, arg2, arg5, arg4, var8.field828);
            }
            if (var8.field849 != 16) {
                arg6.method1732(arg0, arg1, arg2, var8.field849);
            }
        } else if (arg5 == 1) {
            class78 var24;
            if (var8.field848 == -1 && var8.field866 == null) {
                var24 = var8.method654(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1708(arg0, arg1, arg2, var16, var24, (class78) null, field92[arg4], 0, var19, var20);
            if (var8.field856) {
                if (arg4 == 0) {
                    Statics.field2468[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2468[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2468[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2468[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method3500(arg1, arg2, arg5, arg4, var8.field828);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class78 var26;
            class78 var27;
            if (var8.field848 == -1 && var8.field866 == null) {
                var26 = var8.method654(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method654(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field848, true, (class78) null);
                var27 = new class11(arg3, 2, var25, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1708(arg0, arg1, arg2, var16, var26, var27, field100[arg4], field100[var25], var19, var20);
            if (var8.field847) {
                if (arg4 == 0) {
                    Statics.field81[arg0][arg1][arg2] |= 0x249;
                    Statics.field81[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field81[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field81[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field81[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field81[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field81[arg0][arg1][arg2] |= 0x492;
                    Statics.field81[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method3500(arg1, arg2, arg5, arg4, var8.field828);
            }
            if (var8.field849 != 16) {
                arg6.method1732(arg0, arg1, arg2, var8.field849);
            }
        } else if (arg5 == 3) {
            class78 var28;
            if (var8.field848 == -1 && var8.field866 == null) {
                var28 = var8.method654(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1708(arg0, arg1, arg2, var16, var28, (class78) null, field92[arg4], 0, var19, var20);
            if (var8.field856) {
                if (arg4 == 0) {
                    Statics.field2468[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2468[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2468[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2468[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method3500(arg1, arg2, arg5, arg4, var8.field828);
            }
        } else if (arg5 == 9) {
            class78 var29;
            if (var8.field848 == -1 && var8.field866 == null) {
                var29 = var8.method654(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1619(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method3467(arg1, arg2, var9, var10, var8.field828);
            }
            if (var8.field849 != 16) {
                arg6.method1732(arg0, arg1, arg2, var8.field849);
            }
        } else if (arg5 == 4) {
            class78 var30;
            if (var8.field848 == -1 && var8.field866 == null) {
                var30 = var8.method654(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1618(arg0, arg1, arg2, var16, var30, (class78) null, field100[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1635(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class36.method1794(var32 >> 14 & 0x7FFF).field849;
            }
            class78 var33;
            if (var8.field848 == -1 && var8.field866 == null) {
                var33 = var8.method654(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1618(arg0, arg1, arg2, var16, var33, (class78) null, field100[arg4], 0, field93[arg4] * var31, field94[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1635(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class36.method1794(var35 >> 14 & 0x7FFF).field849 / 2;
            }
            class78 var36;
            if (var8.field848 == -1 && var8.field866 == null) {
                var36 = var8.method654(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1618(arg0, arg1, arg2, var16, var36, (class78) null, 256, arg4, field95[arg4] * var34, field96[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class78 var38;
            if (var8.field848 == -1 && var8.field866 == null) {
                var38 = var8.method654(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class11(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1618(arg0, arg1, arg2, var16, var38, (class78) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1635(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class36.method1794(var40 >> 14 & 0x7FFF).field849 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class78 var42;
            class78 var43;
            if (var8.field848 == -1 && var8.field866 == null) {
                var42 = var8.method654(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method654(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field848, true, (class78) null);
                var43 = new class11(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field848, true, (class78) null);
            }
            arg6.method1618(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field95[arg4] * var39, field96[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("s.k(IIIB)I")
    public static int method500(int arg0, int arg1, int arg2) {
        if ((field82[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field82[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("do.m(IIII)I")
    public static final int method2366(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method824(var3, var5);
        int var8 = method824(var3 + 1, var5);
        int var9 = method824(var3, var5 + 1);
        int var10 = method824(var3 + 1, var5 + 1);
        int var11 = method2075(var7, var8, var4, arg2);
        int var12 = method2075(var9, var10, var4, arg2);
        return method2075(var11, var12, var6, arg2);
    }

    @ObfuscatedName("cc.t(IIIIB)I")
    public static final int method2075(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1470[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ad.l(III)I")
    public static final int method824(int arg0, int arg1) {
        int var2 = method2550(arg0 - 1, arg1 - 1) + method2550(arg0 + 1, arg1 - 1) + method2550(arg0 - 1, arg1 + 1) + method2550(arg0 + 1, arg1 + 1);
        int var3 = method2550(arg0 - 1, arg1) + method2550(arg0 + 1, arg1) + method2550(arg0, arg1 - 1) + method2550(arg0, arg1 + 1);
        int var4 = method2550(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dx.f(III)I")
    public static final int method2550(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("l.c(III)I")
    public static final int method97(int arg0, int arg1) {
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

    @ObfuscatedName("n.i(III)I")
    public static final int method151(int arg0, int arg1) {
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

    @ObfuscatedName("v.o(IIII)I")
    public static final int method149(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("g.d(IIIIIIILcg;Lgf;I)V")
    public static final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class79 arg7, class194 arg8) {
        class36 var9 = class36.method1794(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field824;
            var11 = var9.field840;
        } else {
            var10 = var9.field840;
            var11 = var9.field824;
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
        int[][] var16 = field91[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field852 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field873 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class78 var22;
            if (var9.field848 == -1 && var9.field866 == null) {
                var22 = var9.method655(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class11(arg4, 22, arg5, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1783(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field844 == 1) {
                arg8.method3469(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class78 var45;
            if (var9.field848 == -1 && var9.field866 == null) {
                var45 = var9.method655(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg4, 10, arg5, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            if (var45 != null) {
                arg7.method1619(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field844 != 0) {
                arg8.method3467(arg2, arg3, var10, var11, var9.field828);
            }
        } else if (arg6 >= 12) {
            class78 var23;
            if (var9.field848 == -1 && var9.field866 == null) {
                var23 = var9.method655(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1619(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3467(arg2, arg3, var10, var11, var9.field828);
            }
        } else if (arg6 == 0) {
            class78 var24;
            if (var9.field848 == -1 && var9.field866 == null) {
                var24 = var9.method655(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg4, 0, arg5, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1708(arg0, arg2, arg3, var17, var24, (class78) null, field100[arg5], 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3500(arg2, arg3, arg6, arg5, var9.field828);
            }
        } else if (arg6 == 1) {
            class78 var25;
            if (var9.field848 == -1 && var9.field866 == null) {
                var25 = var9.method655(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg4, 1, arg5, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1708(arg0, arg2, arg3, var17, var25, (class78) null, field92[arg5], 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3500(arg2, arg3, arg6, arg5, var9.field828);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class78 var27;
            class78 var28;
            if (var9.field848 == -1 && var9.field866 == null) {
                var27 = var9.method655(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method655(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field848, true, (class78) null);
                var28 = new class11(arg4, 2, var26, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1708(arg0, arg2, arg3, var17, var27, var28, field100[arg5], field100[var26], var20, var21);
            if (var9.field844 != 0) {
                arg8.method3500(arg2, arg3, arg6, arg5, var9.field828);
            }
        } else if (arg6 == 3) {
            class78 var29;
            if (var9.field848 == -1 && var9.field866 == null) {
                var29 = var9.method655(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg4, 3, arg5, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1708(arg0, arg2, arg3, var17, var29, (class78) null, field92[arg5], 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3500(arg2, arg3, arg6, arg5, var9.field828);
            }
        } else if (arg6 == 9) {
            class78 var30;
            if (var9.field848 == -1 && var9.field866 == null) {
                var30 = var9.method655(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1619(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3467(arg2, arg3, var10, var11, var9.field828);
            }
        } else if (arg6 == 4) {
            class78 var31;
            if (var9.field848 == -1 && var9.field866 == null) {
                var31 = var9.method655(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1618(arg0, arg2, arg3, var17, var31, (class78) null, field100[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1635(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class36.method1794(var33 >> 14 & 0x7FFF).field849;
            }
            class78 var34;
            if (var9.field848 == -1 && var9.field866 == null) {
                var34 = var9.method655(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1618(arg0, arg2, arg3, var17, var34, (class78) null, field100[arg5], 0, field93[arg5] * var32, field94[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1635(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class36.method1794(var36 >> 14 & 0x7FFF).field849 / 2;
            }
            class78 var37;
            if (var9.field848 == -1 && var9.field866 == null) {
                var37 = var9.method655(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1618(arg0, arg2, arg3, var17, var37, (class78) null, 256, arg5, field95[arg5] * var35, field96[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class78 var39;
            if (var9.field848 == -1 && var9.field866 == null) {
                var39 = var9.method655(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1618(arg0, arg2, arg3, var17, var39, (class78) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1635(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class36.method1794(var41 >> 14 & 0x7FFF).field849 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class78 var43;
            class78 var44;
            if (var9.field848 == -1 && var9.field866 == null) {
                var43 = var9.method655(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method655(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field848, true, (class78) null);
                var44 = new class11(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field848, true, (class78) null);
            }
            arg7.method1618(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field95[arg5] * var40, field96[arg5] * var40, var20, var21);
        }
    }
}
