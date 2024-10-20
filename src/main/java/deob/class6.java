package deob;

@ObfuscatedName("c")
public final class class6 {

    @ObfuscatedName("c.v")
    public static int[][][] field101 = new int[4][105][105];

    @ObfuscatedName("c.f")
    public static byte[][][] field79 = new byte[4][104][104];

    @ObfuscatedName("c.i")
    public static int field94 = 99;

    @ObfuscatedName("c.u")
    public static final int[] field80 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("c.m")
    public static final int[] field91 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("c.e")
    public static final int[] field92 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("c.k")
    public static final int[] field93 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("c.r")
    public static final int[] field84 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("c.b")
    public static final int[] field95 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("c.t")
    public static int field96 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("c.g")
    public static int field97 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.v(IIIII)V")
    public static final void method119(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field99[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field101[0][var5][var4] = field101[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field101[0][var5][var4] = field101[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field101[0][var5][var4] = field101[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field101[0][var5][var4] = field101[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.f([BIIII[Ldk;I)V")
    public static final void method1951(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class108[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1880[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class119 var9 = new class119(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2031(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ci.i(IIIB)V")
    public static final void method2135(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field101[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field101[arg0][arg1][arg2 + var5] = field101[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field101[arg0][arg1 + var6][arg2] = field101[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field101[arg0][arg1 - 1][arg2] != 0) {
            field101[arg0][arg1][arg2] = field101[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field101[arg0][arg1][arg2 - 1] != 0) {
            field101[arg0][arg1][arg2] = field101[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field101[arg0][arg1 - 1][arg2 - 1] != 0) {
            field101[arg0][arg1][arg2] = field101[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ce.d(Ldx;IIIIIIB)V")
    public static final void method2031(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2400();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2400();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2400();
                }
            }
            return;
        }
        field79[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2400();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field101[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method784(var10 + 45365, var11 + 91923, 4) - 128 + (method784(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method784(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field101[arg1][arg2][arg3] = field101[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2400();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field101[0][arg2][arg3] = -var15 * 8;
                } else {
                    field101[arg1][arg2][arg3] = field101[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field102[arg1][arg2][arg3] = arg0.method2350();
                Statics.field82[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field83[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field79[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field3155[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("dw.o([BIIB)Z")
    public static final boolean method2614(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class119 var4 = new class119(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2362();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2362();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2400() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method151(var5);
                        if (var13 != 22 || !client.field294 || var16.field936 != 0 || var16.field942 == 1 || var16.field955) {
                            if (!var16.method775()) {
                                client.field292++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2362();
                if (var9 == 0) {
                    break;
                }
                var4.method2400();
            }
        }
    }

    @ObfuscatedName("a.c(IIIIIILcm;Ldk;I)V")
    public static final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field294 && (field79[0][arg1][arg2] & 0x2) == 0 && (field79[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field94) {
            field94 = arg0;
        }
        class41 var8 = class41.method151(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field933;
            var10 = var8.field928;
        } else {
            var9 = var8.field928;
            var10 = var8.field933;
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
        int[][] var15 = field101[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field936 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field957 == 1) {
            var20 += 256;
        }
        if (var8.method781()) {
            class24 var21 = new class24();
            var21.field603 = arg0;
            var21.field604 = arg1 * 128;
            var21.field605 = arg2 * 128;
            int var22 = var8.field928;
            int var23 = var8.field933;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field933;
                var23 = var8.field928;
            }
            var21.field606 = (arg1 + var22) * 128;
            var21.field614 = (arg2 + var23) * 128;
            var21.field609 = var8.field924;
            var21.field608 = var8.field947 * 128;
            var21.field611 = var8.field934;
            var21.field612 = var8.field964;
            var21.field613 = var8.field965;
            if (var8.field958 != null) {
                var21.field616 = var8;
                var21.method565();
            }
            class24.field617.method3558(var21);
            if (var21.field613 != null) {
                var21.field610 = var21.field611 + (int) (Math.random() * (double) (var21.field612 - var21.field611));
            }
        }
        if (arg5 == 22) {
            if (!client.field294 || var8.field936 != 0 || var8.field942 == 1 || var8.field955) {
                class85 var24;
                if (var8.field940 == -1 && var8.field958 == null) {
                    var24 = var8.method770(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field940, true, (class85) null);
                }
                arg6.method1794(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field942 == 1 && arg7 != null) {
                    arg7.method2244(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field940 == -1 && var8.field958 == null) {
                var47 = var8.method770(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            if (var47 != null && arg6.method1798(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field948) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2202() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field99[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field99[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field942 != 0 && arg7 != null) {
                arg7.method2245(arg1, arg2, var9, var10, var8.field935);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field940 == -1 && var8.field958 == null) {
                var25 = var8.method770(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1798(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1886[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field942 != 0 && arg7 != null) {
                arg7.method2245(arg1, arg2, var9, var10, var8.field935);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field940 == -1 && var8.field958 == null) {
                var26 = var8.method770(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var26, (class85) null, field80[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field948) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field939) {
                    Statics.field1886[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field948) {
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field939) {
                    Statics.field1886[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field948) {
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field939) {
                    Statics.field1886[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field948) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field939) {
                    Statics.field1886[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field942 != 0 && arg7 != null) {
                arg7.method2242(arg1, arg2, arg5, arg4, var8.field935);
            }
            if (var8.field925 != 16) {
                arg6.method1804(arg0, arg1, arg2, var8.field925);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field940 == -1 && var8.field958 == null) {
                var27 = var8.method770(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var27, (class85) null, field91[arg4], 0, var19, var20);
            if (var8.field948) {
                if (arg4 == 0) {
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field942 != 0 && arg7 != null) {
                arg7.method2242(arg1, arg2, arg5, arg4, var8.field935);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field940 == -1 && var8.field958 == null) {
                var29 = var8.method770(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method770(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field940, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var29, var30, field80[arg4], field80[var28], var19, var20);
            if (var8.field939) {
                if (arg4 == 0) {
                    Statics.field1886[arg0][arg1][arg2] |= 0x249;
                    Statics.field1886[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1886[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1886[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1886[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1886[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1886[arg0][arg1][arg2] |= 0x492;
                    Statics.field1886[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field942 != 0 && arg7 != null) {
                arg7.method2242(arg1, arg2, arg5, arg4, var8.field935);
            }
            if (var8.field925 != 16) {
                arg6.method1804(arg0, arg1, arg2, var8.field925);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field940 == -1 && var8.field958 == null) {
                var31 = var8.method770(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1796(arg0, arg1, arg2, var16, var31, (class85) null, field91[arg4], 0, var19, var20);
            if (var8.field948) {
                if (arg4 == 0) {
                    Statics.field99[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field99[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field99[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field99[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field942 != 0 && arg7 != null) {
                arg7.method2242(arg1, arg2, arg5, arg4, var8.field935);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field940 == -1 && var8.field958 == null) {
                var32 = var8.method770(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1798(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field942 != 0 && arg7 != null) {
                arg7.method2245(arg1, arg2, var9, var10, var8.field935);
            }
            if (var8.field925 != 16) {
                arg6.method1804(arg0, arg1, arg2, var8.field925);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field940 == -1 && var8.field958 == null) {
                var33 = var8.method770(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1840(arg0, arg1, arg2, var16, var33, (class85) null, field80[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1814(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method151(var35 >> 14 & 0x7FFF).field925;
            }
            class85 var36;
            if (var8.field940 == -1 && var8.field958 == null) {
                var36 = var8.method770(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1840(arg0, arg1, arg2, var16, var36, (class85) null, field80[arg4], 0, field92[arg4] * var34, field93[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1814(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method151(var38 >> 14 & 0x7FFF).field925 / 2;
            }
            class85 var39;
            if (var8.field940 == -1 && var8.field958 == null) {
                var39 = var8.method770(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1840(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field84[arg4] * var37, field95[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field940 == -1 && var8.field958 == null) {
                var41 = var8.method770(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1840(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1814(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method151(var43 >> 14 & 0x7FFF).field925 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field940 == -1 && var8.field958 == null) {
                var45 = var8.method770(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method770(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field940, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field940, true, (class85) null);
            }
            arg6.method1840(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field84[arg4] * var42, field95[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("aa.p(IIIB)I")
    public static final int method784(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method731(var3, var5);
        int var8 = method731(var3 + 1, var5);
        int var9 = method731(var3, var5 + 1);
        int var10 = method731(var3 + 1, var5 + 1);
        int var11 = method154(var7, var8, var4, arg2);
        int var12 = method154(var9, var10, var4, arg2);
        return method154(var11, var12, var6, arg2);
    }

    @ObfuscatedName("z.j(IIIII)I")
    public static final int method154(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class91.field1566[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ag.a(IIB)I")
    public static final int method731(int arg0, int arg1) {
        int var2 = method3106(arg0 - 1, arg1 - 1) + method3106(arg0 + 1, arg1 - 1) + method3106(arg0 - 1, arg1 + 1) + method3106(arg0 + 1, arg1 + 1);
        int var3 = method3106(arg0 - 1, arg1) + method3106(arg0 + 1, arg1) + method3106(arg0, arg1 - 1) + method3106(arg0, arg1 + 1);
        int var4 = method3106(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("fh.y(III)I")
    public static final int method3106(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ag.h(III)I")
    public static final int method733(int arg0, int arg1) {
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

    @ObfuscatedName("bc.z(IIB)I")
    public static final int method1188(int arg0, int arg1) {
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

    @ObfuscatedName("b.w(IIIB)I")
    public static final int method569(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("dj.l(IIIIIIILcm;Ldk;B)V")
    public static final void method2284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class86 arg7, class108 arg8) {
        class41 var9 = class41.method151(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field933;
            var11 = var9.field928;
        } else {
            var10 = var9.field928;
            var11 = var9.field933;
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
        int[][] var16 = field101[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field936 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field957 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class85 var22;
            if (var9.field940 == -1 && var9.field958 == null) {
                var22 = var9.method779(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1794(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field942 == 1) {
                arg8.method2244(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var45;
            if (var9.field940 == -1 && var9.field958 == null) {
                var45 = var9.method779(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            if (var45 != null) {
                arg7.method1798(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field942 != 0) {
                arg8.method2245(arg2, arg3, var10, var11, var9.field935);
            }
        } else if (arg6 >= 12) {
            class85 var23;
            if (var9.field940 == -1 && var9.field958 == null) {
                var23 = var9.method779(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1798(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field942 != 0) {
                arg8.method2245(arg2, arg3, var10, var11, var9.field935);
            }
        } else if (arg6 == 0) {
            class85 var24;
            if (var9.field940 == -1 && var9.field958 == null) {
                var24 = var9.method779(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1796(arg0, arg2, arg3, var17, var24, (class85) null, field80[arg5], 0, var20, var21);
            if (var9.field942 != 0) {
                arg8.method2242(arg2, arg3, arg6, arg5, var9.field935);
            }
        } else if (arg6 == 1) {
            class85 var25;
            if (var9.field940 == -1 && var9.field958 == null) {
                var25 = var9.method779(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1796(arg0, arg2, arg3, var17, var25, (class85) null, field91[arg5], 0, var20, var21);
            if (var9.field942 != 0) {
                arg8.method2242(arg2, arg3, arg6, arg5, var9.field935);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class85 var27;
            class85 var28;
            if (var9.field940 == -1 && var9.field958 == null) {
                var27 = var9.method779(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method779(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field940, true, (class85) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1796(arg0, arg2, arg3, var17, var27, var28, field80[arg5], field80[var26], var20, var21);
            if (var9.field942 != 0) {
                arg8.method2242(arg2, arg3, arg6, arg5, var9.field935);
            }
        } else if (arg6 == 3) {
            class85 var29;
            if (var9.field940 == -1 && var9.field958 == null) {
                var29 = var9.method779(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1796(arg0, arg2, arg3, var17, var29, (class85) null, field91[arg5], 0, var20, var21);
            if (var9.field942 != 0) {
                arg8.method2242(arg2, arg3, arg6, arg5, var9.field935);
            }
        } else if (arg6 == 9) {
            class85 var30;
            if (var9.field940 == -1 && var9.field958 == null) {
                var30 = var9.method779(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1798(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field942 != 0) {
                arg8.method2245(arg2, arg3, var10, var11, var9.field935);
            }
        } else if (arg6 == 4) {
            class85 var31;
            if (var9.field940 == -1 && var9.field958 == null) {
                var31 = var9.method779(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1840(arg0, arg2, arg3, var17, var31, (class85) null, field80[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1814(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class41.method151(var33 >> 14 & 0x7FFF).field925;
            }
            class85 var34;
            if (var9.field940 == -1 && var9.field958 == null) {
                var34 = var9.method779(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1840(arg0, arg2, arg3, var17, var34, (class85) null, field80[arg5], 0, field92[arg5] * var32, field93[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1814(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class41.method151(var36 >> 14 & 0x7FFF).field925 / 2;
            }
            class85 var37;
            if (var9.field940 == -1 && var9.field958 == null) {
                var37 = var9.method779(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1840(arg0, arg2, arg3, var17, var37, (class85) null, 256, arg5, field84[arg5] * var35, field95[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class85 var39;
            if (var9.field940 == -1 && var9.field958 == null) {
                var39 = var9.method779(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1840(arg0, arg2, arg3, var17, var39, (class85) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1814(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class41.method151(var41 >> 14 & 0x7FFF).field925 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class85 var43;
            class85 var44;
            if (var9.field940 == -1 && var9.field958 == null) {
                var43 = var9.method779(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method779(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field940, true, (class85) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field940, true, (class85) null);
            }
            arg7.method1840(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field84[arg5] * var40, field95[arg5] * var40, var20, var21);
        }
    }
}
