package deob;

@ObfuscatedName("g")
public final class class6 {

    @ObfuscatedName("g.h")
    public static int[][][] field89 = new int[4][105][105];

    @ObfuscatedName("g.q")
    public static byte[][][] field109 = new byte[4][104][104];

    @ObfuscatedName("g.v")
    public static int field107 = 99;

    @ObfuscatedName("g.r")
    public static final int[] field97 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("g.u")
    public static final int[] field98 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("g.m")
    public static final int[] field99 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("g.t")
    public static final int[] field100 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("g.z")
    public static final int[] field92 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("g.e")
    public static final int[] field102 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("g.y")
    public static int field103 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("g.a")
    public static int field104 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.h(I)V")
    public static void method2850() {
        field107 = 99;
        Statics.field2633 = new byte[4][104][104];
        Statics.field90 = new byte[4][104][104];
        Statics.field199 = new byte[4][104][104];
        Statics.field91 = new byte[4][104][104];
        Statics.field1609 = new int[4][105][105];
        Statics.field93 = new byte[4][105][105];
        Statics.field94 = new int[105][105];
        Statics.field3096 = new int[104];
        Statics.field791 = new int[104];
        Statics.field1372 = new int[104];
        Statics.field3144 = new int[104];
        Statics.field1629 = new int[104];
    }

    @ObfuscatedName("o.q(I)V")
    public static void method105() {
        Statics.field2633 = (byte[][][]) null;
        Statics.field90 = (byte[][][]) null;
        Statics.field199 = (byte[][][]) null;
        Statics.field91 = (byte[][][]) null;
        Statics.field1609 = (int[][][]) null;
        Statics.field93 = (byte[][][]) null;
        Statics.field94 = (int[][]) null;
        Statics.field3096 = null;
        Statics.field791 = null;
        Statics.field1372 = null;
        Statics.field3144 = null;
        Statics.field1629 = null;
    }

    @ObfuscatedName("bt.v(IIIII)V")
    public static final void method1488(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field93[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field89[0][var5][var4] = field89[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field89[0][var5][var4] = field89[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field89[0][var5][var4] = field89[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field89[0][var5][var4] = field89[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ek.n([BIIII[Lda;B)V")
    public static final void method2822(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class108[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1891[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class119 var9 = new class119(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method980(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ai.f([BIIIIIII[Lda;I)V")
    public static final void method958(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1891[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class119 var11 = new class119(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var18 = var13 & 0x7;
                        int var19 = var14 & 0x7;
                        int var21 = arg7 & 0x3;
                        int var22;
                        if (var21 == 0) {
                            var22 = var18;
                        } else if (var21 == 1) {
                            var22 = var19;
                        } else if (var21 == 2) {
                            var22 = 7 - var18;
                        } else {
                            var22 = 7 - var19;
                        }
                        int var25 = arg2 + var22;
                        int var27 = var13 & 0x7;
                        int var28 = var14 & 0x7;
                        int var30 = arg7 & 0x3;
                        int var31;
                        if (var30 == 0) {
                            var31 = var28;
                        } else if (var30 == 1) {
                            var31 = 7 - var27;
                        } else if (var30 == 2) {
                            var31 = 7 - var28;
                        } else {
                            var31 = var27;
                        }
                        method980(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method980(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.g(Ldm;IIIIIIB)V")
    public static final void method980(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2383();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2383();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2383();
                }
            }
            return;
        }
        field109[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2383();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field89[0][arg2][arg3] = -method2322(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field89[arg1][arg2][arg3] = field89[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2383();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field89[0][arg2][arg3] = -var8 * 8;
                } else {
                    field89[arg1][arg2][arg3] = field89[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field90[arg1][arg2][arg3] = arg0.method2370();
                Statics.field199[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field91[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field109[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field2633[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("da.o(IIIIIILcu;Lda;I)V")
    public static final void method2303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field301 && (field109[0][arg1][arg2] & 0x2) == 0 && (field109[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field107) {
            field107 = arg0;
        }
        class41 var8 = class41.method2325(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field978;
            var10 = var8.field928;
        } else {
            var9 = var8.field928;
            var10 = var8.field978;
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
        int[][] var15 = field89[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field943 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field968 == 1) {
            var20 += 256;
        }
        if (var8.method798()) {
            class24.method3752(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field301 || var8.field943 != 0 || var8.field937 == 1 || var8.field966) {
                class85 var21;
                if (var8.field949 == -1 && var8.field969 == null) {
                    var21 = var8.method771(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
                }
                arg6.method1840(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field937 == 1 && arg7 != null) {
                    arg7.method2269(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var44;
            if (var8.field949 == -1 && var8.field969 == null) {
                var44 = var8.method771(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            if (var44 != null && arg6.method1800(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field959) {
                int var45 = 15;
                if (var44 instanceof class105) {
                    var45 = ((class105) var44).method2223() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field93[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field93[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, var9, var10, var8.field946);
            }
        } else if (arg5 >= 12) {
            class85 var22;
            if (var8.field949 == -1 && var8.field969 == null) {
                var22 = var8.method771(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1609[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, var9, var10, var8.field946);
            }
        } else if (arg5 == 0) {
            class85 var23;
            if (var8.field949 == -1 && var8.field969 == null) {
                var23 = var8.method771(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1798(arg0, arg1, arg2, var16, var23, (class85) null, field97[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field959) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field950) {
                    Statics.field1609[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field959) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field950) {
                    Statics.field1609[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field959) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field950) {
                    Statics.field1609[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field959) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field950) {
                    Statics.field1609[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2266(arg1, arg2, arg5, arg4, var8.field946);
            }
            if (var8.field952 != 16) {
                arg6.method1889(arg0, arg1, arg2, var8.field952);
            }
        } else if (arg5 == 1) {
            class85 var24;
            if (var8.field949 == -1 && var8.field969 == null) {
                var24 = var8.method771(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1798(arg0, arg1, arg2, var16, var24, (class85) null, field98[arg4], 0, var19, var20);
            if (var8.field959) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2266(arg1, arg2, arg5, arg4, var8.field946);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class85 var26;
            class85 var27;
            if (var8.field949 == -1 && var8.field969 == null) {
                var26 = var8.method771(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method771(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1798(arg0, arg1, arg2, var16, var26, var27, field97[arg4], field97[var25], var19, var20);
            if (var8.field950) {
                if (arg4 == 0) {
                    Statics.field1609[arg0][arg1][arg2] |= 0x249;
                    Statics.field1609[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1609[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1609[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1609[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1609[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1609[arg0][arg1][arg2] |= 0x492;
                    Statics.field1609[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2266(arg1, arg2, arg5, arg4, var8.field946);
            }
            if (var8.field952 != 16) {
                arg6.method1889(arg0, arg1, arg2, var8.field952);
            }
        } else if (arg5 == 3) {
            class85 var28;
            if (var8.field949 == -1 && var8.field969 == null) {
                var28 = var8.method771(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1798(arg0, arg1, arg2, var16, var28, (class85) null, field98[arg4], 0, var19, var20);
            if (var8.field959) {
                if (arg4 == 0) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2266(arg1, arg2, arg5, arg4, var8.field946);
            }
        } else if (arg5 == 9) {
            class85 var29;
            if (var8.field949 == -1 && var8.field969 == null) {
                var29 = var8.method771(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1800(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field937 != 0 && arg7 != null) {
                arg7.method2267(arg1, arg2, var9, var10, var8.field946);
            }
            if (var8.field952 != 16) {
                arg6.method1889(arg0, arg1, arg2, var8.field952);
            }
        } else if (arg5 == 4) {
            class85 var30;
            if (var8.field949 == -1 && var8.field969 == null) {
                var30 = var8.method771(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1910(arg0, arg1, arg2, var16, var30, (class85) null, field97[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1957(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class41.method2325(var32 >> 14 & 0x7FFF).field952;
            }
            class85 var33;
            if (var8.field949 == -1 && var8.field969 == null) {
                var33 = var8.method771(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1910(arg0, arg1, arg2, var16, var33, (class85) null, field97[arg4], 0, field99[arg4] * var31, field100[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1957(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method2325(var35 >> 14 & 0x7FFF).field952 / 2;
            }
            class85 var36;
            if (var8.field949 == -1 && var8.field969 == null) {
                var36 = var8.method771(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1910(arg0, arg1, arg2, var16, var36, (class85) null, 256, arg4, field92[arg4] * var34, field102[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class85 var38;
            if (var8.field949 == -1 && var8.field969 == null) {
                var38 = var8.method771(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1910(arg0, arg1, arg2, var16, var38, (class85) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1957(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class41.method2325(var40 >> 14 & 0x7FFF).field952 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class85 var42;
            class85 var43;
            if (var8.field949 == -1 && var8.field969 == null) {
                var42 = var8.method771(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method771(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field949, true, (class85) null);
            }
            arg6.method1910(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field92[arg4] * var39, field102[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("bk.s(IIII)I")
    public static int method1245(int arg0, int arg1, int arg2) {
        if ((field109[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field109[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("do.k(III)I")
    public static final int method2322(int arg0, int arg1) {
        int var2 = Statics.method712(arg0 + 45365, arg1 + 91923, 4) - 128 + (Statics.method712(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Statics.method712(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("j.l(III)I")
    public static final int method193(int arg0, int arg1) {
        int var2 = method41(arg0 - 1, arg1 - 1) + method41(arg0 + 1, arg1 - 1) + method41(arg0 - 1, arg1 + 1) + method41(arg0 + 1, arg1 + 1);
        int var3 = method41(arg0 - 1, arg1) + method41(arg0 + 1, arg1) + method41(arg0, arg1 - 1) + method41(arg0, arg1 + 1);
        int var4 = method41(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("v.p(III)I")
    public static final int method41(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ed.d(IIB)I")
    public static final int method2729(int arg0, int arg1) {
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

    @ObfuscatedName("an.i(III)I")
    public static final int method732(int arg0, int arg1) {
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

    @ObfuscatedName("dt.x(IIII)I")
    public static final int method2336(int arg0, int arg1, int arg2) {
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
}
