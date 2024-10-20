package deob;

@ObfuscatedName("c")
public final class class9 {

    @ObfuscatedName("c.i")
    public static int[][][] field136 = new int[4][105][105];

    @ObfuscatedName("c.v")
    public static byte[][][] field140 = new byte[4][104][104];

    @ObfuscatedName("c.m")
    public static int field138 = 99;

    @ObfuscatedName("c.b")
    public static final int[] field153 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("c.n")
    public static final int[] field147 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("c.q")
    public static final int[] field146 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("c.r")
    public static final int[] field149 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("c.u")
    public static final int[] field150 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("c.p")
    public static final int[] field151 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("c.t")
    public static int field157 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("c.s")
    public static int field137 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.i(I)V")
    public static void method2248() {
        field138 = 99;
        Statics.field139 = new byte[4][104][104];
        Statics.field2558 = new byte[4][104][104];
        Statics.field144 = new byte[4][104][104];
        Statics.field1932 = new byte[4][104][104];
        Statics.field258 = new int[4][105][105];
        Statics.field141 = new byte[4][105][105];
        Statics.field294 = new int[105][105];
        Statics.field142 = new int[104];
        Statics.field966 = new int[104];
        Statics.field154 = new int[104];
        Statics.field148 = new int[104];
        Statics.field2707 = new int[104];
    }

    @ObfuscatedName("m.v(I)V")
    public static void method14() {
        Statics.field139 = (byte[][][]) null;
        Statics.field2558 = (byte[][][]) null;
        Statics.field144 = (byte[][][]) null;
        Statics.field1932 = (byte[][][]) null;
        Statics.field258 = (int[][][]) null;
        Statics.field141 = (byte[][][]) null;
        Statics.field294 = (int[][]) null;
        Statics.field142 = null;
        Statics.field966 = null;
        Statics.field154 = null;
        Statics.field148 = null;
        Statics.field2707 = null;
    }

    @ObfuscatedName("i.m(IIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field141[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field136[0][var5][var4] = field136[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field136[0][var5][var4] = field136[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field136[0][var5][var4] = field136[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field136[0][var5][var4] = field136[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dp.j(IIIS)V")
    public static final void method2738(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field136[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field136[arg0][arg1][arg2 + var5] = field136[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field136[arg0][arg1 + var6][arg2] = field136[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field136[arg0][arg1 - 1][arg2] != 0) {
            field136[arg0][arg1][arg2] = field136[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field136[arg0][arg1][arg2 - 1] != 0) {
            field136[arg0][arg1][arg2] = field136[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field136[arg0][arg1 - 1][arg2 - 1] != 0) {
            field136[arg0][arg1][arg2] = field136[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("eb.o(Lda;IIIIIII)V")
    public static final void method2745(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2491();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2491();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2491();
                }
            }
            return;
        }
        field140[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2491();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field136[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method825(var10 + 45365, var11 + 91923, 4) - 128 + (method825(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method825(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field136[arg1][arg2][arg3] = field136[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2491();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field136[0][arg2][arg3] = -var15 * 8;
                } else {
                    field136[arg1][arg2][arg3] = field136[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2558[arg1][arg2][arg3] = arg0.method2492();
                Statics.field144[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1932[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field140[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field139[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("q.l([BIII)Z")
    public static final boolean method215(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class127 var4 = new class127(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2570();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2570();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2491() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class32 var16 = class32.method701(var5);
                        if (var13 != 22 || !client.field486 || var16.field843 != 0 || var16.field861 == 1 || var16.field863) {
                            if (!var16.method684()) {
                                client.field541++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2570();
                if (var9 == 0) {
                    break;
                }
                var4.method2491();
            }
        }
    }

    @ObfuscatedName("at.g([BIILct;[Lfm;I)V")
    public static final void method801(byte[] arg0, int arg1, int arg2, class95 arg3, class164[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2570();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2570();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2491();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field140[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class164 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method34(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("l.w(IIIIIILct;Lfm;I)V")
    public static final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field486 && (field140[0][arg1][arg2] & 0x2) == 0) {
            if ((field140[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method129(arg0, arg1, arg2) != client.field538) {
                return;
            }
        }
        if (arg0 < field138) {
            field138 = arg0;
        }
        class32 var8 = class32.method701(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field840;
            var10 = var8.field842;
        } else {
            var9 = var8.field842;
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
        int[][] var15 = field136[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field843 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field850 == 1) {
            var20 += 256;
        }
        if (var8.method686()) {
            class7 var21 = new class7();
            var21.field99 = arg0;
            var21.field119 = arg1 * 128;
            var21.field100 = arg2 * 128;
            int var22 = var8.field842;
            int var23 = var8.field840;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field840;
                var23 = var8.field842;
            }
            var21.field102 = (arg1 + var22) * 128;
            var21.field103 = (arg2 + var23) * 128;
            var21.field105 = var8.field871;
            var21.field104 = var8.field868 * 128;
            var21.field121 = var8.field839;
            var21.field108 = var8.field837;
            var21.field109 = var8.field873;
            if (var8.field866 != null) {
                var21.field111 = var8;
                var21.method45();
            }
            class7.field101.method3364(var21);
            if (var21.field109 != null) {
                var21.field118 = var21.field121 + (int) (Math.random() * (double) (var21.field108 - var21.field121));
            }
        }
        if (arg5 == 22) {
            if (!client.field486 || var8.field843 != 0 || var8.field861 == 1 || var8.field863) {
                class94 var24;
                if (var8.field847 == -1 && var8.field866 == null) {
                    var24 = var8.method670(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field847, true, (class94) null);
                }
                arg6.method1902(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field861 == 1 && arg7 != null) {
                    arg7.method3286(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var47;
            if (var8.field847 == -1 && var8.field866 == null) {
                var47 = var8.method670(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            if (var47 != null && arg6.method1929(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field855) {
                int var48 = 15;
                if (var47 instanceof class112) {
                    var48 = ((class112) var47).method2275() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field141[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field141[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field861 != 0 && arg7 != null) {
                arg7.method3283(arg1, arg2, var9, var10, var8.field859);
            }
        } else if (arg5 >= 12) {
            class94 var25;
            if (var8.field847 == -1 && var8.field866 == null) {
                var25 = var8.method670(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1929(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field258[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field861 != 0 && arg7 != null) {
                arg7.method3283(arg1, arg2, var9, var10, var8.field859);
            }
        } else if (arg5 == 0) {
            class94 var26;
            if (var8.field847 == -1 && var8.field866 == null) {
                var26 = var8.method670(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1904(arg0, arg1, arg2, var16, var26, (class94) null, field153[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field855) {
                    Statics.field141[arg0][arg1][arg2] = 50;
                    Statics.field141[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field846) {
                    Statics.field258[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field855) {
                    Statics.field141[arg0][arg1][arg2 + 1] = 50;
                    Statics.field141[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field846) {
                    Statics.field258[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field855) {
                    Statics.field141[arg0][arg1 + 1][arg2] = 50;
                    Statics.field141[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field846) {
                    Statics.field258[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field855) {
                    Statics.field141[arg0][arg1][arg2] = 50;
                    Statics.field141[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field846) {
                    Statics.field258[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field861 != 0 && arg7 != null) {
                arg7.method3260(arg1, arg2, arg5, arg4, var8.field859);
            }
            if (var8.field848 != 16) {
                arg6.method2001(arg0, arg1, arg2, var8.field848);
            }
        } else if (arg5 == 1) {
            class94 var27;
            if (var8.field847 == -1 && var8.field866 == null) {
                var27 = var8.method670(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1904(arg0, arg1, arg2, var16, var27, (class94) null, field147[arg4], 0, var19, var20);
            if (var8.field855) {
                if (arg4 == 0) {
                    Statics.field141[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field141[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field141[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field141[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field861 != 0 && arg7 != null) {
                arg7.method3260(arg1, arg2, arg5, arg4, var8.field859);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class94 var29;
            class94 var30;
            if (var8.field847 == -1 && var8.field866 == null) {
                var29 = var8.method670(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method670(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field847, true, (class94) null);
                var30 = new class14(arg3, 2, var28, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1904(arg0, arg1, arg2, var16, var29, var30, field153[arg4], field153[var28], var19, var20);
            if (var8.field846) {
                if (arg4 == 0) {
                    Statics.field258[arg0][arg1][arg2] |= 0x249;
                    Statics.field258[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field258[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field258[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field258[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field258[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field258[arg0][arg1][arg2] |= 0x492;
                    Statics.field258[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field861 != 0 && arg7 != null) {
                arg7.method3260(arg1, arg2, arg5, arg4, var8.field859);
            }
            if (var8.field848 != 16) {
                arg6.method2001(arg0, arg1, arg2, var8.field848);
            }
        } else if (arg5 == 3) {
            class94 var31;
            if (var8.field847 == -1 && var8.field866 == null) {
                var31 = var8.method670(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1904(arg0, arg1, arg2, var16, var31, (class94) null, field147[arg4], 0, var19, var20);
            if (var8.field855) {
                if (arg4 == 0) {
                    Statics.field141[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field141[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field141[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field141[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field861 != 0 && arg7 != null) {
                arg7.method3260(arg1, arg2, arg5, arg4, var8.field859);
            }
        } else if (arg5 == 9) {
            class94 var32;
            if (var8.field847 == -1 && var8.field866 == null) {
                var32 = var8.method670(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1929(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field861 != 0 && arg7 != null) {
                arg7.method3283(arg1, arg2, var9, var10, var8.field859);
            }
            if (var8.field848 != 16) {
                arg6.method2001(arg0, arg1, arg2, var8.field848);
            }
        } else if (arg5 == 4) {
            class94 var33;
            if (var8.field847 == -1 && var8.field866 == null) {
                var33 = var8.method670(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1905(arg0, arg1, arg2, var16, var33, (class94) null, field153[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1950(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class32.method701(var35 >> 14 & 0x7FFF).field848;
            }
            class94 var36;
            if (var8.field847 == -1 && var8.field866 == null) {
                var36 = var8.method670(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1905(arg0, arg1, arg2, var16, var36, (class94) null, field153[arg4], 0, field146[arg4] * var34, field149[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1950(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class32.method701(var38 >> 14 & 0x7FFF).field848 / 2;
            }
            class94 var39;
            if (var8.field847 == -1 && var8.field866 == null) {
                var39 = var8.method670(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1905(arg0, arg1, arg2, var16, var39, (class94) null, 256, arg4, field150[arg4] * var37, field151[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class94 var41;
            if (var8.field847 == -1 && var8.field866 == null) {
                var41 = var8.method670(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class14(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1905(arg0, arg1, arg2, var16, var41, (class94) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1950(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class32.method701(var43 >> 14 & 0x7FFF).field848 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class94 var45;
            class94 var46;
            if (var8.field847 == -1 && var8.field866 == null) {
                var45 = var8.method670(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method670(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field847, true, (class94) null);
                var46 = new class14(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field847, true, (class94) null);
            }
            arg6.method1905(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field150[arg4] * var42, field151[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("y.c(IIII)I")
    public static int method129(int arg0, int arg1, int arg2) {
        if ((field140[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field140[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("aw.z(IIII)I")
    public static final int method825(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method714(var3, var5);
        int var8 = method714(var3 + 1, var5);
        int var9 = method714(var3, var5 + 1);
        int var10 = method714(var3 + 1, var5 + 1);
        int var11 = 65536 - class104.field1787[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class104.field1787[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class104.field1787[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("am.f(IIB)I")
    public static final int method714(int arg0, int arg1) {
        int var2 = method123(arg0 - 1, arg1 - 1) + method123(arg0 + 1, arg1 - 1) + method123(arg0 - 1, arg1 + 1) + method123(arg0 + 1, arg1 + 1);
        int var3 = method123(arg0 - 1, arg1) + method123(arg0 + 1, arg1) + method123(arg0, arg1 - 1) + method123(arg0, arg1 + 1);
        int var4 = method123(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("e.a(III)I")
    public static final int method123(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("en.d(III)I")
    public static final int method2750(int arg0, int arg1) {
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

    @ObfuscatedName("ef.e(III)I")
    public static final int method3152(int arg0, int arg1) {
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

    @ObfuscatedName("ch.y(IIII)I")
    public static final int method2074(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("h.k(IIIIIIILct;Lfm;I)V")
    public static final void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class164 arg8) {
        class32 var9 = class32.method701(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field840;
            var11 = var9.field842;
        } else {
            var10 = var9.field842;
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
        int[][] var16 = field136[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field843 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field850 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field847 == -1 && var9.field866 == null) {
                var22 = var9.method665(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1902(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field861 == 1) {
                arg8.method3286(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field847 == -1 && var9.field866 == null) {
                var45 = var9.method665(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1929(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field861 != 0) {
                arg8.method3283(arg2, arg3, var10, var11, var9.field859);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field847 == -1 && var9.field866 == null) {
                var23 = var9.method665(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1929(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field861 != 0) {
                arg8.method3283(arg2, arg3, var10, var11, var9.field859);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field847 == -1 && var9.field866 == null) {
                var24 = var9.method665(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1904(arg0, arg2, arg3, var17, var24, (class94) null, field153[arg5], 0, var20, var21);
            if (var9.field861 != 0) {
                arg8.method3260(arg2, arg3, arg6, arg5, var9.field859);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field847 == -1 && var9.field866 == null) {
                var25 = var9.method665(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1904(arg0, arg2, arg3, var17, var25, (class94) null, field147[arg5], 0, var20, var21);
            if (var9.field861 != 0) {
                arg8.method3260(arg2, arg3, arg6, arg5, var9.field859);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field847 == -1 && var9.field866 == null) {
                var27 = var9.method665(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method665(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field847, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1904(arg0, arg2, arg3, var17, var27, var28, field153[arg5], field153[var26], var20, var21);
            if (var9.field861 != 0) {
                arg8.method3260(arg2, arg3, arg6, arg5, var9.field859);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field847 == -1 && var9.field866 == null) {
                var29 = var9.method665(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1904(arg0, arg2, arg3, var17, var29, (class94) null, field147[arg5], 0, var20, var21);
            if (var9.field861 != 0) {
                arg8.method3260(arg2, arg3, arg6, arg5, var9.field859);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field847 == -1 && var9.field866 == null) {
                var30 = var9.method665(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1929(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field861 != 0) {
                arg8.method3283(arg2, arg3, var10, var11, var9.field859);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field847 == -1 && var9.field866 == null) {
                var31 = var9.method665(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1905(arg0, arg2, arg3, var17, var31, (class94) null, field153[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1950(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method701(var33 >> 14 & 0x7FFF).field848;
            }
            class94 var34;
            if (var9.field847 == -1 && var9.field866 == null) {
                var34 = var9.method665(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1905(arg0, arg2, arg3, var17, var34, (class94) null, field153[arg5], 0, field146[arg5] * var32, field149[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1950(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method701(var36 >> 14 & 0x7FFF).field848 / 2;
            }
            class94 var37;
            if (var9.field847 == -1 && var9.field866 == null) {
                var37 = var9.method665(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1905(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field150[arg5] * var35, field151[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field847 == -1 && var9.field866 == null) {
                var39 = var9.method665(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1905(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1950(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method701(var41 >> 14 & 0x7FFF).field848 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field847 == -1 && var9.field866 == null) {
                var43 = var9.method665(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method665(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field847, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field847, true, (class94) null);
            }
            arg7.method1905(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field150[arg5] * var40, field151[arg5] * var40, var20, var21);
        }
    }
}
