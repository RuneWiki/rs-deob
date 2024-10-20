package deob;

@ObfuscatedName("p")
public final class class9 {

    @ObfuscatedName("p.c")
    public static int[][][] field157 = new int[4][105][105];

    @ObfuscatedName("p.j")
    public static byte[][][] field143 = new byte[4][104][104];

    @ObfuscatedName("p.f")
    public static int field137 = 99;

    @ObfuscatedName("p.g")
    public static final int[] field135 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("p.a")
    public static final int[] field144 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("p.v")
    public static final int[] field145 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("p.i")
    public static final int[] field149 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("p.k")
    public static final int[] field147 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("p.o")
    public static final int[] field148 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("p.d")
    public static int field151 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("p.u")
    public static int field150 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.c(I)V")
    public static void method222() {
        field137 = 99;
        Statics.field138 = new byte[4][104][104];
        Statics.field139 = new byte[4][104][104];
        Statics.field1800 = new byte[4][104][104];
        Statics.field2713 = new byte[4][104][104];
        Statics.field1256 = new int[4][105][105];
        Statics.field146 = new byte[4][105][105];
        Statics.field1768 = new int[105][105];
        Statics.field141 = new int[104];
        Statics.field1999 = new int[104];
        Statics.field140 = new int[104];
        Statics.field1288 = new int[104];
        Statics.field2040 = new int[104];
    }

    @ObfuscatedName("av.j(IIIII)V")
    public static final void method584(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field146[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field157[0][var5][var4] = field157[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field157[0][var5][var4] = field157[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field157[0][var5][var4] = field157[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field157[0][var5][var4] = field157[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.f(Ldl;IIIIIIB)V")
    public static final void method114(class125 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2326();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2326();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2326();
                }
            }
            return;
        }
        field143[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2326();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field157[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method134(var10 + 45365, var11 + 91923, 4) - 128 + (method134(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method134(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field157[arg1][arg2][arg3] = field157[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2326();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field157[0][arg2][arg3] = -var15 * 8;
                } else {
                    field157[arg1][arg2][arg3] = field157[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field139[arg1][arg2][arg3] = arg0.method2347();
                Statics.field1800[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2713[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field143[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field138[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("q.y([BIII)Z")
    public static final boolean method133(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class125 var4 = new class125(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2377();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2377();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2326() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class31 var16 = class31.method2519(var5);
                        if (var13 != 22 || !client.field528 || var16.field842 != 0 || var16.field815 == 1 || var16.field834) {
                            if (!var16.method589()) {
                                client.field520++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2377();
                if (var9 == 0) {
                    break;
                }
                var4.method2326();
            }
        }
    }

    @ObfuscatedName("b.x([BIIIIIIILcg;[Lfv;I)V")
    public static final void method118(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8, class162[] arg9) {
        class125 var10 = new class125(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2377();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2377();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2326();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class31 var21 = class31.method2519(var11);
                    int var22 = arg2 + class158.method2105(var16 & 0x7, var15 & 0x7, arg7, var21.field810, var21.field796, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field810;
                    int var28 = var21.field796;
                    if ((var20 & 0x1) == 1) {
                        int var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var30 = arg7 & 0x3;
                    int var31;
                    if (var30 == 0) {
                        var31 = var25;
                    } else if (var30 == 1) {
                        var31 = 7 - var24 - (var27 - 1);
                    } else if (var30 == 2) {
                        var31 = 7 - var25 - (var28 - 1);
                    } else {
                        var31 = var24;
                    }
                    int var32 = arg3 + var31;
                    if (var22 > 0 && var32 > 0 && var22 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field143[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class162 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method2574(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("en.e(IIIIIILcg;Lfv;I)V")
    public static final void method2574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class94 arg6, class162 arg7) {
        if (client.field528 && (field143[0][arg1][arg2] & 0x2) == 0) {
            if ((field143[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1368(arg0, arg1, arg2) != client.field517) {
                return;
            }
        }
        if (arg0 < field137) {
            field137 = arg0;
        }
        class31 var8 = class31.method2519(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field796;
            var10 = var8.field810;
        } else {
            var9 = var8.field810;
            var10 = var8.field796;
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
        int[][] var15 = field157[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field842 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field800 == 1) {
            var20 += 256;
        }
        if (var8.method595()) {
            class7.method704(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field528 || var8.field842 != 0 || var8.field815 == 1 || var8.field834) {
                class93 var21;
                if (var8.field818 == -1 && var8.field812 == null) {
                    var21 = var8.method624(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field818, true, (class93) null);
                }
                arg6.method1799(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field815 == 1 && arg7 != null) {
                    arg7.method3051(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class93 var44;
            if (var8.field818 == -1 && var8.field812 == null) {
                var44 = var8.method624(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            if (var44 != null && arg6.method1774(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field826) {
                int var45 = 15;
                if (var44 instanceof class111) {
                    var45 = ((class111) var44).method2123() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field146[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field146[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field815 != 0 && arg7 != null) {
                arg7.method3046(arg1, arg2, var9, var10, var8.field813);
            }
        } else if (arg5 >= 12) {
            class93 var22;
            if (var8.field818 == -1 && var8.field812 == null) {
                var22 = var8.method624(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1774(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1256[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field815 != 0 && arg7 != null) {
                arg7.method3046(arg1, arg2, var9, var10, var8.field813);
            }
        } else if (arg5 == 0) {
            class93 var23;
            if (var8.field818 == -1 && var8.field812 == null) {
                var23 = var8.method624(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1772(arg0, arg1, arg2, var16, var23, (class93) null, field135[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field826) {
                    Statics.field146[arg0][arg1][arg2] = 50;
                    Statics.field146[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field817) {
                    Statics.field1256[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field826) {
                    Statics.field146[arg0][arg1][arg2 + 1] = 50;
                    Statics.field146[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field817) {
                    Statics.field1256[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field826) {
                    Statics.field146[arg0][arg1 + 1][arg2] = 50;
                    Statics.field146[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field817) {
                    Statics.field1256[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field826) {
                    Statics.field146[arg0][arg1][arg2] = 50;
                    Statics.field146[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field817) {
                    Statics.field1256[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field815 != 0 && arg7 != null) {
                arg7.method3069(arg1, arg2, arg5, arg4, var8.field813);
            }
            if (var8.field819 != 16) {
                arg6.method1793(arg0, arg1, arg2, var8.field819);
            }
        } else if (arg5 == 1) {
            class93 var24;
            if (var8.field818 == -1 && var8.field812 == null) {
                var24 = var8.method624(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1772(arg0, arg1, arg2, var16, var24, (class93) null, field144[arg4], 0, var19, var20);
            if (var8.field826) {
                if (arg4 == 0) {
                    Statics.field146[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field146[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field146[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field146[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field815 != 0 && arg7 != null) {
                arg7.method3069(arg1, arg2, arg5, arg4, var8.field813);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class93 var26;
            class93 var27;
            if (var8.field818 == -1 && var8.field812 == null) {
                var26 = var8.method624(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method624(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field818, true, (class93) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1772(arg0, arg1, arg2, var16, var26, var27, field135[arg4], field135[var25], var19, var20);
            if (var8.field817) {
                if (arg4 == 0) {
                    Statics.field1256[arg0][arg1][arg2] |= 0x249;
                    Statics.field1256[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1256[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1256[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1256[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1256[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1256[arg0][arg1][arg2] |= 0x492;
                    Statics.field1256[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field815 != 0 && arg7 != null) {
                arg7.method3069(arg1, arg2, arg5, arg4, var8.field813);
            }
            if (var8.field819 != 16) {
                arg6.method1793(arg0, arg1, arg2, var8.field819);
            }
        } else if (arg5 == 3) {
            class93 var28;
            if (var8.field818 == -1 && var8.field812 == null) {
                var28 = var8.method624(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1772(arg0, arg1, arg2, var16, var28, (class93) null, field144[arg4], 0, var19, var20);
            if (var8.field826) {
                if (arg4 == 0) {
                    Statics.field146[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field146[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field146[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field146[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field815 != 0 && arg7 != null) {
                arg7.method3069(arg1, arg2, arg5, arg4, var8.field813);
            }
        } else if (arg5 == 9) {
            class93 var29;
            if (var8.field818 == -1 && var8.field812 == null) {
                var29 = var8.method624(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1774(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field815 != 0 && arg7 != null) {
                arg7.method3046(arg1, arg2, var9, var10, var8.field813);
            }
            if (var8.field819 != 16) {
                arg6.method1793(arg0, arg1, arg2, var8.field819);
            }
        } else if (arg5 == 4) {
            class93 var30;
            if (var8.field818 == -1 && var8.field812 == null) {
                var30 = var8.method624(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1836(arg0, arg1, arg2, var16, var30, (class93) null, field135[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1903(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class31.method2519(var32 >> 14 & 0x7FFF).field819;
            }
            class93 var33;
            if (var8.field818 == -1 && var8.field812 == null) {
                var33 = var8.method624(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1836(arg0, arg1, arg2, var16, var33, (class93) null, field135[arg4], 0, field145[arg4] * var31, field149[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1903(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class31.method2519(var35 >> 14 & 0x7FFF).field819 / 2;
            }
            class93 var36;
            if (var8.field818 == -1 && var8.field812 == null) {
                var36 = var8.method624(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1836(arg0, arg1, arg2, var16, var36, (class93) null, 256, arg4, field147[arg4] * var34, field148[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class93 var38;
            if (var8.field818 == -1 && var8.field812 == null) {
                var38 = var8.method624(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1836(arg0, arg1, arg2, var16, var38, (class93) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1903(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class31.method2519(var40 >> 14 & 0x7FFF).field819 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class93 var42;
            class93 var43;
            if (var8.field818 == -1 && var8.field812 == null) {
                var42 = var8.method624(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method624(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field818, true, (class93) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field818, true, (class93) null);
            }
            arg6.method1836(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field147[arg4] * var39, field148[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("av.m(Lcg;[Lfv;I)V")
    public static final void method583(class94 arg0, class162[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field143[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field143[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3047(var3, var4);
                        }
                    }
                }
            }
        }
        field151 += (int) (Math.random() * 5.0D) - 2;
        if (field151 < -8) {
            field151 = -8;
        }
        if (field151 > 8) {
            field151 = 8;
        }
        field150 += (int) (Math.random() * 5.0D) - 2;
        if (field150 < -16) {
            field150 = -16;
        }
        if (field150 > 16) {
            field150 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field146[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field157[var6][var11 + 1][var10] - field157[var6][var11 - 1][var10];
                    int var13 = field157[var6][var11][var10 + 1] - field157[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field1768[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field141[var20] = 0;
                Statics.field1999[var20] = 0;
                Statics.field140[var20] = 0;
                Statics.field1288[var20] = 0;
                Statics.field2040[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field138[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class32 var26 = (class32) class32.field847.method3087((long) var25);
                            class32 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field853.method2821(1, var25);
                                class32 var29 = new class32();
                                if (var28 != null) {
                                    var29.method640(new class125(var28), var25);
                                }
                                var29.method651();
                                class32.field847.method3089(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field141[var22] += var27.field848;
                            Statics.field1999[var22] += var27.field846;
                            Statics.field140[var22] += var27.field851;
                            Statics.field1288[var22] += var27.field852;
                            var10002 = Statics.field2040[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field138[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class32 var34 = (class32) class32.field847.method3087((long) var33);
                            class32 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field853.method2821(1, var33);
                                class32 var37 = new class32();
                                if (var36 != null) {
                                    var37.method640(new class125(var36), var33);
                                }
                                var37.method651();
                                class32.field847.method3089(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field141[var22] -= var35.field848;
                            Statics.field1999[var22] -= var35.field846;
                            Statics.field140[var22] -= var35.field851;
                            Statics.field1288[var22] -= var35.field852;
                            var10002 = Statics.field2040[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var39 = 0;
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    for (int var44 = -5; var44 < 109; var44++) {
                        int var45 = var44 + 5;
                        if (var45 >= 0 && var45 < 104) {
                            var39 += Statics.field141[var45];
                            var40 += Statics.field1999[var45];
                            var41 += Statics.field140[var45];
                            var42 += Statics.field1288[var45];
                            var43 += Statics.field2040[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field141[var46];
                            var40 -= Statics.field1999[var46];
                            var41 -= Statics.field140[var46];
                            var42 -= Statics.field1288[var46];
                            var43 -= Statics.field2040[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field528 || (field143[0][var21][var44] & 0x2) != 0 || (field143[var6][var21][var44] & 0x10) == 0 && method1368(var6, var21, var44) == client.field517)) {
                            if (var6 < field137) {
                                field137 = var6;
                            }
                            int var47 = Statics.field138[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field139[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field157[var6][var21][var44];
                                int var50 = field157[var6][var21 + 1][var44];
                                int var51 = field157[var6][var21 + 1][var44 + 1];
                                int var52 = field157[var6][var21][var44 + 1];
                                int var53 = Statics.field1768[var21][var44];
                                int var54 = Statics.field1768[var21 + 1][var44];
                                int var55 = Statics.field1768[var21 + 1][var44 + 1];
                                int var56 = Statics.field1768[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method712(var59, var60, var61);
                                    int var62 = field151 + var59 & 0xFF;
                                    int var63 = field150 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method712(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field1800[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class36.method2563(var48 - 1).field919) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field1256[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class103.field1758[method1452(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1769(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1452(var57, var53), method1452(var57, var54), method1452(var57, var55), method1452(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field1800[var6][var21][var44] + 1;
                                    byte var67 = Statics.field2713[var6][var21][var44];
                                    class36 var68 = class36.method2563(var48 - 1);
                                    int var69 = var68.field918;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1759.method2077(var69);
                                        var71 = -1;
                                    } else if (var68.field924 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method712(var68.field921, var68.field922, var68.field928);
                                        int var72 = field151 + var68.field921 & 0xFF;
                                        int var73 = field150 + var68.field928;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method712(var72, var68.field922, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class103.field1758[method2310(var70, 96)];
                                    }
                                    if (var68.field920 != -1) {
                                        int var75 = field151 + var68.field925 & 0xFF;
                                        int var76 = field150 + var68.field926;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method712(var75, var68.field915, var76);
                                        var74 = class103.field1758[method2310(var77, 96)];
                                    }
                                    arg0.method1769(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, method1452(var57, var53), method1452(var57, var54), method1452(var57, var55), method1452(var57, var56), method2310(var71, var53), method2310(var71, var54), method2310(var71, var55), method2310(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    arg0.method1768(var6, var79, var78, method1368(var6, var79, var78));
                }
            }
            Statics.field138[var6] = (byte[][]) null;
            Statics.field139[var6] = (byte[][]) null;
            Statics.field1800[var6] = (byte[][]) null;
            Statics.field2713[var6] = (byte[][]) null;
            Statics.field146[var6] = (byte[][]) null;
        }
        arg0.method1795(-50, -10, -50);
        for (int var80 = 0; var80 < 104; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                if ((field143[1][var80][var81] & 0x2) == 2) {
                    arg0.method1907(var80, var81);
                }
            }
        }
        int var82 = 1;
        int var83 = 2;
        int var84 = 4;
        for (int var85 = 0; var85 < 4; var85++) {
            if (var85 > 0) {
                var82 <<= 0x3;
                var83 <<= 0x3;
                var84 <<= 0x3;
            }
            for (int var86 = 0; var86 <= var85; var86++) {
                for (int var87 = 0; var87 <= 104; var87++) {
                    for (int var88 = 0; var88 <= 104; var88++) {
                        if ((Statics.field1256[var86][var88][var87] & var82) != 0) {
                            int var89 = var87;
                            int var90 = var87;
                            int var91 = var86;
                            int var92 = var86;
                            while (var89 > 0 && (Statics.field1256[var86][var88][var89 - 1] & var82) != 0) {
                                var89--;
                            }
                            while (var90 < 104 && (Statics.field1256[var86][var88][var90 + 1] & var82) != 0) {
                                var90++;
                            }
                            label357: while (var91 > 0) {
                                for (int var93 = var89; var93 <= var90; var93++) {
                                    if ((Statics.field1256[var91 - 1][var88][var93] & var82) == 0) {
                                        break label357;
                                    }
                                }
                                var91--;
                            }
                            label346: while (var92 < var85) {
                                for (int var94 = var89; var94 <= var90; var94++) {
                                    if ((Statics.field1256[var92 + 1][var88][var94] & var82) == 0) {
                                        break label346;
                                    }
                                }
                                var92++;
                            }
                            int var95 = (var92 + 1 - var91) * (var90 - var89 + 1);
                            if (var95 >= 8) {
                                short var96 = 240;
                                int var97 = field157[var92][var88][var89] - var96;
                                int var98 = field157[var91][var88][var89];
                                class94.method1767(var85, 1, var88 * 128, var88 * 128, var89 * 128, var90 * 128 + 128, var97, var98);
                                for (int var99 = var91; var99 <= var92; var99++) {
                                    for (int var100 = var89; var100 <= var90; var100++) {
                                        Statics.field1256[var99][var88][var100] &= ~var82;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1256[var86][var88][var87] & var83) != 0) {
                            int var101 = var88;
                            int var102 = var88;
                            int var103 = var86;
                            int var104 = var86;
                            while (var101 > 0 && (Statics.field1256[var86][var101 - 1][var87] & var83) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (Statics.field1256[var86][var102 + 1][var87] & var83) != 0) {
                                var102++;
                            }
                            label410: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((Statics.field1256[var103 - 1][var105][var87] & var83) == 0) {
                                        break label410;
                                    }
                                }
                                var103--;
                            }
                            label399: while (var104 < var85) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((Statics.field1256[var104 + 1][var106][var87] & var83) == 0) {
                                        break label399;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = field157[var104][var101][var87] - var108;
                                int var110 = field157[var103][var101][var87];
                                class94.method1767(var85, 2, var101 * 128, var102 * 128 + 128, var87 * 128, var87 * 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        Statics.field1256[var111][var112][var87] &= ~var83;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1256[var86][var88][var87] & var84) != 0) {
                            int var113 = var88;
                            int var114 = var88;
                            int var115 = var87;
                            int var116 = var87;
                            while (var115 > 0 && (Statics.field1256[var86][var88][var115 - 1] & var84) != 0) {
                                var115--;
                            }
                            while (var116 < 104 && (Statics.field1256[var86][var88][var116 + 1] & var84) != 0) {
                                var116++;
                            }
                            label463: while (var113 > 0) {
                                for (int var117 = var115; var117 <= var116; var117++) {
                                    if ((Statics.field1256[var86][var113 - 1][var117] & var84) == 0) {
                                        break label463;
                                    }
                                }
                                var113--;
                            }
                            label452: while (var114 < 104) {
                                for (int var118 = var115; var118 <= var116; var118++) {
                                    if ((Statics.field1256[var86][var114 + 1][var118] & var84) == 0) {
                                        break label452;
                                    }
                                }
                                var114++;
                            }
                            if ((var114 - var113 + 1) * (var116 - var115 + 1) >= 4) {
                                int var119 = field157[var86][var113][var115];
                                class94.method1767(var85, 4, var113 * 128, var114 * 128 + 128, var115 * 128, var116 * 128 + 128, var119, var119);
                                for (int var120 = var113; var120 <= var114; var120++) {
                                    for (int var121 = var115; var121 <= var116; var121++) {
                                        Statics.field1256[var86][var120][var121] &= ~var84;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.s(IIII)I")
    public static int method1368(int arg0, int arg1, int arg2) {
        if ((field143[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field143[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("q.p(IIIB)I")
    public static final int method134(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method789(var3, var5);
        int var8 = method789(var3 + 1, var5);
        int var9 = method789(var3, var5 + 1);
        int var10 = method789(var3 + 1, var5 + 1);
        int var11 = 65536 - class103.field1757[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class103.field1757[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class103.field1757[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ag.w(III)I")
    public static final int method789(int arg0, int arg1) {
        int var2 = method53(arg0 - 1, arg1 - 1) + method53(arg0 + 1, arg1 - 1) + method53(arg0 - 1, arg1 + 1) + method53(arg0 + 1, arg1 + 1);
        int var3 = method53(arg0 - 1, arg1) + method53(arg0 + 1, arg1) + method53(arg0, arg1 - 1) + method53(arg0, arg1 + 1);
        int var4 = method53(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("m.r(IIB)I")
    public static final int method53(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("by.n(III)I")
    public static final int method1452(int arg0, int arg1) {
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

    @ObfuscatedName("da.b(IIB)I")
    public static final int method2310(int arg0, int arg1) {
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

    @ObfuscatedName("aw.z(IIIB)I")
    public static final int method712(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("em.h(III)Z")
    public static final boolean method2903(int arg0, int arg1) {
        class31 var2 = class31.method2519(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method588(arg1);
    }
}
