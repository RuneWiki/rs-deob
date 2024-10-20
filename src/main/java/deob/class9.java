package deob;

@ObfuscatedName("d")
public final class class9 {

    @ObfuscatedName("d.g")
    public static int[][][] field126 = new int[4][105][105];

    @ObfuscatedName("d.m")
    public static byte[][][] field129 = new byte[4][104][104];

    @ObfuscatedName("d.v")
    public static int field115 = 99;

    @ObfuscatedName("d.j")
    public static final int[] field119 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("d.x")
    public static final int[] field120 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("d.k")
    public static final int[] field130 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("d.a")
    public static final int[] field122 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("d.y")
    public static final int[] field118 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("d.q")
    public static final int[] field124 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("d.c")
    public static int field134 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("d.u")
    public static int field125 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dm.g(IIIIB)V")
    public static final void method2183(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2304[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field126[0][var5][var4] = field126[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field126[0][var5][var4] = field126[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field126[0][var5][var4] = field126[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field126[0][var5][var4] = field126[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.m(Ldr;IIIIIII)V")
    public static final void method123(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2414();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2414();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2414();
                }
            }
            return;
        }
        field129[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2414();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field126[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2300(var10 + 45365, var11 + 91923, 4) - 128 + (method2300(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2300(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field126[arg1][arg2][arg3] = field126[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2414();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field126[0][arg2][arg3] = -var15 * 8;
                } else {
                    field126[arg1][arg2][arg3] = field126[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field121[arg1][arg2][arg3] = arg0.method2415();
                Statics.field1298[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field244[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field129[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field375[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ct.v(IIIIIILcn;Lfc;B)V")
    public static final void method1568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field472 && (field129[0][arg1][arg2] & 0x2) == 0) {
            if ((field129[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field129[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field129[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field562 != var8) {
                return;
            }
        }
        if (arg0 < field115) {
            field115 = arg0;
        }
        class32 var9 = class32.method54(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field821;
            var11 = var9.field819;
        } else {
            var10 = var9.field819;
            var11 = var9.field821;
        }
        int var12;
        int var13;
        if (arg1 + var10 <= 104) {
            var12 = (var10 >> 1) + arg1;
            var13 = (var10 + 1 >> 1) + arg1;
        } else {
            var12 = arg1;
            var13 = arg1 + 1;
        }
        int var14;
        int var15;
        if (arg2 + var11 <= 104) {
            var14 = (var11 >> 1) + arg2;
            var15 = (var11 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int[][] var16 = field126[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field823 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field845 == 1) {
            var21 += 256;
        }
        if (var9.method644()) {
            class7 var22 = new class7();
            var22.field99 = arg0;
            var22.field88 = arg1 * 128;
            var22.field89 = arg2 * 128;
            int var23 = var9.field819;
            int var24 = var9.field821;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field821;
                var24 = var9.field819;
            }
            var22.field90 = (arg1 + var23) * 128;
            var22.field91 = (arg2 + var24) * 128;
            var22.field103 = var9.field824;
            var22.field93 = var9.field850 * 128;
            var22.field86 = var9.field851;
            var22.field95 = var9.field849;
            var22.field97 = var9.field810;
            if (var9.field846 != null) {
                var22.field102 = var9;
                var22.method49();
            }
            class7.field100.method3326(var22);
            if (var22.field97 != null) {
                var22.field98 = var22.field86 + (int) (Math.random() * (double) (var22.field95 - var22.field86));
            }
        }
        if (arg5 == 22) {
            if (!client.field472 || var9.field823 != 0 || var9.field833 == 1 || var9.field855) {
                class94 var25;
                if (var9.field806 == -1 && var9.field846 == null) {
                    var25 = var9.method634(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field806, true, (class94) null);
                }
                arg6.method1856(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field833 == 1 && arg7 != null) {
                    arg7.method3193(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var48;
            if (var9.field806 == -1 && var9.field846 == null) {
                var48 = var9.method634(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            if (var48 != null && arg6.method1860(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field835) {
                int var49 = 15;
                if (var48 instanceof class112) {
                    var49 = ((class112) var48).method2280() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field2304[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field2304[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field833 != 0 && arg7 != null) {
                arg7.method3218(arg1, arg2, var10, var11, var9.field822);
            }
        } else if (arg5 >= 12) {
            class94 var26;
            if (var9.field806 == -1 && var9.field846 == null) {
                var26 = var9.method634(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1860(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field59[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field833 != 0 && arg7 != null) {
                arg7.method3218(arg1, arg2, var10, var11, var9.field822);
            }
        } else if (arg5 == 0) {
            class94 var27;
            if (var9.field806 == -1 && var9.field846 == null) {
                var27 = var9.method634(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1881(arg0, arg1, arg2, var17, var27, (class94) null, field119[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field835) {
                    Statics.field2304[arg0][arg1][arg2] = 50;
                    Statics.field2304[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field813) {
                    Statics.field59[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field835) {
                    Statics.field2304[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2304[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field813) {
                    Statics.field59[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field835) {
                    Statics.field2304[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2304[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field813) {
                    Statics.field59[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field835) {
                    Statics.field2304[arg0][arg1][arg2] = 50;
                    Statics.field2304[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field813) {
                    Statics.field59[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field833 != 0 && arg7 != null) {
                arg7.method3211(arg1, arg2, arg5, arg4, var9.field822);
            }
            if (var9.field828 != 16) {
                arg6.method1866(arg0, arg1, arg2, var9.field828);
            }
        } else if (arg5 == 1) {
            class94 var28;
            if (var9.field806 == -1 && var9.field846 == null) {
                var28 = var9.method634(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1881(arg0, arg1, arg2, var17, var28, (class94) null, field120[arg4], 0, var20, var21);
            if (var9.field835) {
                if (arg4 == 0) {
                    Statics.field2304[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2304[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2304[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2304[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field833 != 0 && arg7 != null) {
                arg7.method3211(arg1, arg2, arg5, arg4, var9.field822);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class94 var30;
            class94 var31;
            if (var9.field806 == -1 && var9.field846 == null) {
                var30 = var9.method634(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method634(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field806, true, (class94) null);
                var31 = new class14(arg3, 2, var29, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1881(arg0, arg1, arg2, var17, var30, var31, field119[arg4], field119[var29], var20, var21);
            if (var9.field813) {
                if (arg4 == 0) {
                    Statics.field59[arg0][arg1][arg2] |= 0x249;
                    Statics.field59[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field59[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field59[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field59[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field59[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field59[arg0][arg1][arg2] |= 0x492;
                    Statics.field59[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field833 != 0 && arg7 != null) {
                arg7.method3211(arg1, arg2, arg5, arg4, var9.field822);
            }
            if (var9.field828 != 16) {
                arg6.method1866(arg0, arg1, arg2, var9.field828);
            }
        } else if (arg5 == 3) {
            class94 var32;
            if (var9.field806 == -1 && var9.field846 == null) {
                var32 = var9.method634(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1881(arg0, arg1, arg2, var17, var32, (class94) null, field120[arg4], 0, var20, var21);
            if (var9.field835) {
                if (arg4 == 0) {
                    Statics.field2304[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2304[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2304[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2304[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field833 != 0 && arg7 != null) {
                arg7.method3211(arg1, arg2, arg5, arg4, var9.field822);
            }
        } else if (arg5 == 9) {
            class94 var33;
            if (var9.field806 == -1 && var9.field846 == null) {
                var33 = var9.method634(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1860(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field833 != 0 && arg7 != null) {
                arg7.method3218(arg1, arg2, var10, var11, var9.field822);
            }
            if (var9.field828 != 16) {
                arg6.method1866(arg0, arg1, arg2, var9.field828);
            }
        } else if (arg5 == 4) {
            class94 var34;
            if (var9.field806 == -1 && var9.field846 == null) {
                var34 = var9.method634(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1859(arg0, arg1, arg2, var17, var34, (class94) null, field119[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method2001(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method54(var36 >> 14 & 0x7FFF).field828;
            }
            class94 var37;
            if (var9.field806 == -1 && var9.field846 == null) {
                var37 = var9.method634(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1859(arg0, arg1, arg2, var17, var37, (class94) null, field119[arg4], 0, field130[arg4] * var35, field122[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method2001(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class32.method54(var39 >> 14 & 0x7FFF).field828 / 2;
            }
            class94 var40;
            if (var9.field806 == -1 && var9.field846 == null) {
                var40 = var9.method634(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1859(arg0, arg1, arg2, var17, var40, (class94) null, 256, arg4, field118[arg4] * var38, field124[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            if (var9.field806 == -1 && var9.field846 == null) {
                var42 = var9.method634(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1859(arg0, arg1, arg2, var17, var42, (class94) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method2001(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class32.method54(var44 >> 14 & 0x7FFF).field828 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class94 var46;
            class94 var47;
            if (var9.field806 == -1 && var9.field846 == null) {
                var46 = var9.method634(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method634(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field806, true, (class94) null);
                var47 = new class14(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field806, true, (class94) null);
            }
            arg6.method1859(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field118[arg4] * var43, field124[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("do.r(IIIB)I")
    public static final int method2300(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method40(var3, var5);
        int var8 = method40(var3 + 1, var5);
        int var9 = method40(var3, var5 + 1);
        int var10 = method40(var3 + 1, var5 + 1);
        int var11 = 65536 - class104.field1779[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class104.field1779[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class104.field1779[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("n.n(III)I")
    public static final int method40(int arg0, int arg1) {
        int var2 = method202(arg0 - 1, arg1 - 1) + method202(arg0 + 1, arg1 - 1) + method202(arg0 - 1, arg1 + 1) + method202(arg0 + 1, arg1 + 1);
        int var3 = method202(arg0 - 1, arg1) + method202(arg0 + 1, arg1) + method202(arg0, arg1 - 1) + method202(arg0, arg1 + 1);
        int var4 = method202(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("q.i(IIB)I")
    public static final int method202(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("bv.s(IIB)I")
    public static final int method1542(int arg0, int arg1) {
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

    @ObfuscatedName("i.w(III)I")
    public static final int method45(int arg0, int arg1) {
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

    @ObfuscatedName("r.d(IIII)I")
    public static final int method34(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("as.t(IIB)Z")
    public static final boolean method872(int arg0, int arg1) {
        class32 var2 = class32.method54(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method632(arg1);
    }
}
