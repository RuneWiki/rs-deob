package deob;

@ObfuscatedName("bl")
public final class class75 {

    @ObfuscatedName("bl.l")
    public static int[][][] field994 = new int[4][105][105];

    @ObfuscatedName("bl.q")
    public static byte[][][] field978 = new byte[4][104][104];

    @ObfuscatedName("bl.f")
    public static int field979 = 99;

    @ObfuscatedName("bl.p")
    public static final int[] field986 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("bl.z")
    public static final int[] field987 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("bl.h")
    public static final int[] field988 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("bl.o")
    public static final int[] field989 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("bl.r")
    public static final int[] field981 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("bl.n")
    public static final int[] field980 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("bl.u")
    public static int field991 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("bl.d")
    public static int field993 = (int) (Math.random() * 33.0D) - 16;

    public class75() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.l(I)V")
    public static void method1945() {
        Statics.field977 = (byte[][][]) null;
        Statics.field983 = (byte[][][]) null;
        Statics.field84 = (byte[][][]) null;
        Statics.field3761 = (byte[][][]) null;
        Statics.field3204 = (int[][][]) null;
        Statics.field3324 = (byte[][][]) null;
        Statics.field982 = (int[][]) null;
        Statics.field63 = null;
        Statics.field990 = null;
        Statics.field984 = null;
        Statics.field771 = null;
        Statics.field985 = null;
    }

    @ObfuscatedName("al.q(IIIII)V")
    public static final void method579(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3324[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field994[0][var5][var4] = field994[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field994[0][var5][var4] = field994[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field994[0][var5][var4] = field994[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field994[0][var5][var4] = field994[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("gt.f([BIIII[Lfy;I)V")
    public static final void method3645(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class173[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1979[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class401 var9 = new class401(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2639(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ex.j(Lot;IIIIIII)V")
    public static final void method2639(class401 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method6272();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method6272();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method6272();
                }
            }
            return;
        }
        field978[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method6272();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field994[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method296(var10 + 45365, var11 + 91923, 4) - 128 + (method296(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method296(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field994[arg1][arg2][arg3] = field994[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method6272();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field994[0][arg2][arg3] = -var15 * 8;
                } else {
                    field994[arg1][arg2][arg3] = field994[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field983[arg1][arg2][arg3] = arg0.method6273();
                Statics.field84[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field3761[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field978[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field977[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("et.m([BIIB)Z")
    public static final boolean method2493(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class401 var4 = new class401(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method6413();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method6286();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method6272() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class169 var16 = class169.method4277(var5);
                        if (var13 != 22 || !client.field569 || var16.field1841 != 0 || var16.field1839 == 1 || var16.field1828) {
                            if (!var16.method2948()) {
                                client.field546++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method6286();
                if (var9 == 0) {
                    break;
                }
                var4.method6272();
            }
        }
    }

    @ObfuscatedName("a.k(IIIIIILhy;Lfy;B)V")
    public static final void method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class213 arg6, class173 arg7) {
        if (client.field569 && (field978[0][arg1][arg2] & 0x2) == 0 && (field978[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field979) {
            field979 = arg0;
        }
        class169 var8 = class169.method4277(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field1829;
            var10 = var8.field1845;
        } else {
            var9 = var8.field1845;
            var10 = var8.field1829;
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
        int[][] var15 = field994[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class221.method4293(arg1, arg2, 2, var8.field1841 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field1864 == 1) {
            var21 += 256;
        }
        if (var8.method2960()) {
            class63.method4983(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field569 || var8.field1841 != 0 || var8.field1839 == 1 || var8.field1828) {
                class214 var22;
                if (var8.field1846 == -1 && var8.field1863 == null) {
                    var22 = var8.method2950(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class73(arg3, 22, arg4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
                }
                arg6.method3831(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field1839 == 1 && arg7 != null) {
                    arg7.method3129(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class214 var48;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var48 = var8.method2950(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class73(arg3, 10, arg4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            if (var48 != null && arg6.method3835(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field1840) {
                int var49 = 15;
                if (var48 instanceof class220) {
                    var49 = ((class220) var48).method4092() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > Statics.field3324[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field3324[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field1839 != 0 && arg7 != null) {
                arg7.method3128(arg1, arg2, var9, var10, var8.field1866);
            }
        } else if (arg5 >= 12) {
            class214 var23;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var23 = var8.method2950(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3835(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3204[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field1839 != 0 && arg7 != null) {
                arg7.method3128(arg1, arg2, var9, var10, var8.field1866);
            }
        } else if (arg5 == 0) {
            class214 var24;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var24 = var8.method2950(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class73(arg3, 0, arg4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3833(arg0, arg1, arg2, var16, var24, (class214) null, field986[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field1840) {
                    Statics.field3324[arg0][arg1][arg2] = 50;
                    Statics.field3324[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field1844) {
                    Statics.field3204[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field1840) {
                    Statics.field3324[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3324[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1844) {
                    Statics.field3204[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field1840) {
                    Statics.field3324[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3324[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field1844) {
                    Statics.field3204[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field1840) {
                    Statics.field3324[arg0][arg1][arg2] = 50;
                    Statics.field3324[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field1844) {
                    Statics.field3204[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field1839 != 0 && arg7 != null) {
                arg7.method3161(arg1, arg2, arg5, arg4, var8.field1866);
            }
            if (var8.field1838 != 16) {
                arg6.method3841(arg0, arg1, arg2, var8.field1838);
            }
        } else if (arg5 == 1) {
            class214 var25;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var25 = var8.method2950(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class73(arg3, 1, arg4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3833(arg0, arg1, arg2, var16, var25, (class214) null, field987[arg4], 0, var19, var21);
            if (var8.field1840) {
                if (arg4 == 0) {
                    Statics.field3324[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3324[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3324[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3324[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1839 != 0 && arg7 != null) {
                arg7.method3161(arg1, arg2, arg5, arg4, var8.field1866);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class214 var27;
            class214 var28;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var27 = var8.method2950(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method2950(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class73(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
                var28 = new class73(arg3, 2, var26, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3833(arg0, arg1, arg2, var16, var27, var28, field986[arg4], field986[var26], var19, var21);
            if (var8.field1844) {
                if (arg4 == 0) {
                    Statics.field3204[arg0][arg1][arg2] |= 0x249;
                    Statics.field3204[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3204[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3204[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3204[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3204[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3204[arg0][arg1][arg2] |= 0x492;
                    Statics.field3204[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field1839 != 0 && arg7 != null) {
                arg7.method3161(arg1, arg2, arg5, arg4, var8.field1866);
            }
            if (var8.field1838 != 16) {
                arg6.method3841(arg0, arg1, arg2, var8.field1838);
            }
        } else if (arg5 == 3) {
            class214 var29;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var29 = var8.method2950(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class73(arg3, 3, arg4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3833(arg0, arg1, arg2, var16, var29, (class214) null, field987[arg4], 0, var19, var21);
            if (var8.field1840) {
                if (arg4 == 0) {
                    Statics.field3324[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3324[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3324[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3324[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field1839 != 0 && arg7 != null) {
                arg7.method3161(arg1, arg2, arg5, arg4, var8.field1866);
            }
        } else if (arg5 == 9) {
            class214 var30;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var30 = var8.method2950(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class73(arg3, arg5, arg4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3835(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field1839 != 0 && arg7 != null) {
                arg7.method3128(arg1, arg2, var9, var10, var8.field1866);
            }
            if (var8.field1838 != 16) {
                arg6.method3841(arg0, arg1, arg2, var8.field1838);
            }
        } else if (arg5 == 4) {
            class214 var31;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var31 = var8.method2950(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3834(arg0, arg1, arg2, var16, var31, (class214) null, field986[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method3850(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class169.method4277(class221.method1972(var33)).field1838;
            }
            class214 var35;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var35 = var8.method2950(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class73(arg3, 4, arg4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3834(arg0, arg1, arg2, var16, var35, (class214) null, field986[arg4], 0, field988[arg4] * var32, field989[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method3850(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class169.method4277(class221.method1972(var37)).field1838 / 2;
            }
            class214 var39;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var39 = var8.method2950(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3834(arg0, arg1, arg2, var16, var39, (class214) null, 256, arg4, field981[arg4] * var36, field980[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class214 var41;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var41 = var8.method2950(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class73(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3834(arg0, arg1, arg2, var16, var41, (class214) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method3850(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class169.method4277(class221.method1972(var43)).field1838 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class214 var46;
            class214 var47;
            if (var8.field1846 == -1 && var8.field1863 == null) {
                var46 = var8.method2950(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method2950(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class73(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
                var47 = new class73(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field1846, var8.field1871, (class214) null);
            }
            arg6.method3834(arg0, arg1, arg2, var16, var46, var47, 256, arg4, field981[arg4] * var42, field980[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("h.t(IIII)I")
    public static final int method296(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method2623(var3, var5);
        int var8 = method2623(var3 + 1, var5);
        int var9 = method2623(var3, var5 + 1);
        int var10 = method2623(var3 + 1, var5 + 1);
        int var11 = method2739(var7, var8, var4, arg2);
        int var12 = method2739(var9, var10, var4, arg2);
        return method2739(var11, var12, var6, arg2);
    }

    @ObfuscatedName("fi.a(IIIIB)I")
    public static final int method2739(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class211.field2359[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("en.e(III)I")
    public static final int method2623(int arg0, int arg1) {
        int var2 = method731(arg0 - 1, arg1 - 1) + method731(arg0 + 1, arg1 - 1) + method731(arg0 - 1, arg1 + 1) + method731(arg0 + 1, arg1 + 1);
        int var3 = method731(arg0 - 1, arg1) + method731(arg0 + 1, arg1) + method731(arg0, arg1 - 1) + method731(arg0, arg1 + 1);
        int var4 = method731(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ac.i(III)I")
    public static final int method731(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dz.y(III)I")
    public static final int method2486(int arg0, int arg1) {
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

    @ObfuscatedName("al.w(III)I")
    public static final int method605(int arg0, int arg1) {
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

    @ObfuscatedName("fg.g(IIII)I")
    public static final int method2801(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dm.v(IIIIIIILhy;Lfy;I)V")
    public static final void method2378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class213 arg7, class173 arg8) {
        class169 var9 = class169.method4277(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field1829;
            var11 = var9.field1845;
        } else {
            var10 = var9.field1845;
            var11 = var9.field1829;
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
        int[][] var16 = field994[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class221.method4293(arg2, arg3, 2, var9.field1841 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field1864 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class214 var23;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var23 = var9.method2943(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class73(arg4, 22, arg5, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3831(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field1839 == 1) {
                arg8.method3129(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class214 var49;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var49 = var9.method2943(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class73(arg4, 10, arg5, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            if (var49 != null) {
                arg7.method3835(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field1839 != 0) {
                arg8.method3128(arg2, arg3, var10, var11, var9.field1866);
            }
        } else if (arg6 >= 12) {
            class214 var24;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var24 = var9.method2943(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3835(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field1839 != 0) {
                arg8.method3128(arg2, arg3, var10, var11, var9.field1866);
            }
        } else if (arg6 == 0) {
            class214 var25;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var25 = var9.method2943(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class73(arg4, 0, arg5, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3833(arg0, arg2, arg3, var17, var25, (class214) null, field986[arg5], 0, var20, var22);
            if (var9.field1839 != 0) {
                arg8.method3161(arg2, arg3, arg6, arg5, var9.field1866);
            }
        } else if (arg6 == 1) {
            class214 var26;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var26 = var9.method2943(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class73(arg4, 1, arg5, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3833(arg0, arg2, arg3, var17, var26, (class214) null, field987[arg5], 0, var20, var22);
            if (var9.field1839 != 0) {
                arg8.method3161(arg2, arg3, arg6, arg5, var9.field1866);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class214 var28;
            class214 var29;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var28 = var9.method2943(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method2943(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class73(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
                var29 = new class73(arg4, 2, var27, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3833(arg0, arg2, arg3, var17, var28, var29, field986[arg5], field986[var27], var20, var22);
            if (var9.field1839 != 0) {
                arg8.method3161(arg2, arg3, arg6, arg5, var9.field1866);
            }
        } else if (arg6 == 3) {
            class214 var30;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var30 = var9.method2943(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class73(arg4, 3, arg5, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3833(arg0, arg2, arg3, var17, var30, (class214) null, field987[arg5], 0, var20, var22);
            if (var9.field1839 != 0) {
                arg8.method3161(arg2, arg3, arg6, arg5, var9.field1866);
            }
        } else if (arg6 == 9) {
            class214 var31;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var31 = var9.method2943(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class73(arg4, arg6, arg5, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3835(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field1839 != 0) {
                arg8.method3128(arg2, arg3, var10, var11, var9.field1866);
            }
        } else if (arg6 == 4) {
            class214 var32;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var32 = var9.method2943(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3834(arg0, arg2, arg3, var17, var32, (class214) null, field986[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method3850(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class169.method4277(class221.method1972(var34)).field1838;
            }
            class214 var36;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var36 = var9.method2943(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class73(arg4, 4, arg5, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3834(arg0, arg2, arg3, var17, var36, (class214) null, field986[arg5], 0, field988[arg5] * var33, field989[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method3850(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class169.method4277(class221.method1972(var38)).field1838 / 2;
            }
            class214 var40;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var40 = var9.method2943(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3834(arg0, arg2, arg3, var17, var40, (class214) null, 256, arg5, field981[arg5] * var37, field980[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class214 var42;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var42 = var9.method2943(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class73(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3834(arg0, arg2, arg3, var17, var42, (class214) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method3850(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class169.method4277(class221.method1972(var44)).field1838 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class214 var47;
            class214 var48;
            if (var9.field1846 == -1 && var9.field1863 == null) {
                var47 = var9.method2943(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method2943(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class73(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
                var48 = new class73(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field1846, var9.field1871, (class214) null);
            }
            arg7.method3834(arg0, arg2, arg3, var17, var47, var48, 256, arg5, field981[arg5] * var43, field980[arg5] * var43, var20, var22);
        }
    }
}
