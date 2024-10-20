package deob;

@ObfuscatedName("p")
public final class class6 {

    @ObfuscatedName("p.b")
    public static int[][][] field84 = new int[4][105][105];

    @ObfuscatedName("p.e")
    public static byte[][][] field78 = new byte[4][104][104];

    @ObfuscatedName("p.i")
    public static int field79 = 99;

    @ObfuscatedName("p.a")
    public static final int[] field93 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("p.m")
    public static final int[] field85 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("p.c")
    public static final int[] field86 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("p.j")
    public static final int[] field87 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("p.d")
    public static final int[] field88 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("p.l")
    public static final int[] field82 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("p.u")
    public static int field90 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("p.r")
    public static int field89 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.b(IIIII)V")
    public static final void method2441(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1943[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field84[0][var5][var4] = field84[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field84[0][var5][var4] = field84[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field84[0][var5][var4] = field84[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field84[0][var5][var4] = field84[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dt.e(Ldc;IIIIIIB)V")
    public static final void method2428(class110 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2142();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2142();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2142();
                }
            }
            return;
        }
        field78[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2142();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field84[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method443(var10 + 45365, var11 + 91923, 4) - 128 + (method443(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method443(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field84[arg1][arg2][arg3] = field84[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2142();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field84[0][arg2][arg3] = -var15 * 8;
                } else {
                    field84[arg1][arg2][arg3] = field84[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field91[arg1][arg2][arg3] = arg0.method2294();
                Statics.field2096[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field184[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field78[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field80[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cl.i([BIII)Z")
    public static final boolean method1861(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class110 var4 = new class110(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2155();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2155();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2142() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class37 var16 = class37.method2940(var5);
                        if (var13 != 22 || !client.field245 || var16.field848 != 0 || var16.field857 == 1 || var16.field878) {
                            if (!var16.method652()) {
                                client.field413++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2155();
                if (var9 == 0) {
                    break;
                }
                var4.method2142();
            }
        }
    }

    @ObfuscatedName("dx.k([BIILcf;[Lhi;I)V")
    public static final void method2396(byte[] arg0, int arg1, int arg2, class80 arg3, class211[] arg4) {
        class110 var5 = new class110(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2155();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2155();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2142();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field78[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class211 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method606(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("al.h(IIIIIILcf;Lhi;I)V")
    public static final void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class80 arg6, class211 arg7) {
        if (client.field245 && (field78[0][arg1][arg2] & 0x2) == 0) {
            if ((field78[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method5(arg0, arg1, arg2) != client.field296) {
                return;
            }
        }
        if (arg0 < field79) {
            field79 = arg0;
        }
        class37 var8 = class37.method2940(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field856;
            var10 = var8.field855;
        } else {
            var9 = var8.field855;
            var10 = var8.field856;
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
        int[][] var15 = field84[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field848 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field880 == 1) {
            var20 += 256;
        }
        if (var8.method668()) {
            class21.method1406(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field245 || var8.field848 != 0 || var8.field857 == 1 || var8.field878) {
                class79 var21;
                if (var8.field863 == -1 && var8.field881 == null) {
                    var21 = var8.method653(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field863, true, (class79) null);
                }
                arg6.method1609(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field857 == 1 && arg7 != null) {
                    arg7.method3622(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class79 var44;
            if (var8.field863 == -1 && var8.field881 == null) {
                var44 = var8.method653(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            if (var44 != null && arg6.method1726(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field871) {
                int var45 = 15;
                if (var44 instanceof class99) {
                    var45 = ((class99) var44).method1991() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field1943[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field1943[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3630(arg1, arg2, var9, var10, var8.field858);
            }
        } else if (arg5 >= 12) {
            class79 var22;
            if (var8.field863 == -1 && var8.field881 == null) {
                var22 = var8.method653(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1726(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2966[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3630(arg1, arg2, var9, var10, var8.field858);
            }
        } else if (arg5 == 0) {
            class79 var23;
            if (var8.field863 == -1 && var8.field881 == null) {
                var23 = var8.method653(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1611(arg0, arg1, arg2, var16, var23, (class79) null, field93[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field871) {
                    Statics.field1943[arg0][arg1][arg2] = 50;
                    Statics.field1943[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field862) {
                    Statics.field2966[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field871) {
                    Statics.field1943[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1943[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field862) {
                    Statics.field2966[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field871) {
                    Statics.field1943[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1943[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field862) {
                    Statics.field2966[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field871) {
                    Statics.field1943[arg0][arg1][arg2] = 50;
                    Statics.field1943[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field862) {
                    Statics.field2966[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3620(arg1, arg2, arg5, arg4, var8.field858);
            }
            if (var8.field864 != 16) {
                arg6.method1619(arg0, arg1, arg2, var8.field864);
            }
        } else if (arg5 == 1) {
            class79 var24;
            if (var8.field863 == -1 && var8.field881 == null) {
                var24 = var8.method653(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1611(arg0, arg1, arg2, var16, var24, (class79) null, field85[arg4], 0, var19, var20);
            if (var8.field871) {
                if (arg4 == 0) {
                    Statics.field1943[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1943[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1943[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1943[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3620(arg1, arg2, arg5, arg4, var8.field858);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class79 var26;
            class79 var27;
            if (var8.field863 == -1 && var8.field881 == null) {
                var26 = var8.method653(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method653(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field863, true, (class79) null);
                var27 = new class11(arg3, 2, var25, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1611(arg0, arg1, arg2, var16, var26, var27, field93[arg4], field93[var25], var19, var20);
            if (var8.field862) {
                if (arg4 == 0) {
                    Statics.field2966[arg0][arg1][arg2] |= 0x249;
                    Statics.field2966[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2966[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2966[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2966[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2966[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2966[arg0][arg1][arg2] |= 0x492;
                    Statics.field2966[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3620(arg1, arg2, arg5, arg4, var8.field858);
            }
            if (var8.field864 != 16) {
                arg6.method1619(arg0, arg1, arg2, var8.field864);
            }
        } else if (arg5 == 3) {
            class79 var28;
            if (var8.field863 == -1 && var8.field881 == null) {
                var28 = var8.method653(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1611(arg0, arg1, arg2, var16, var28, (class79) null, field85[arg4], 0, var19, var20);
            if (var8.field871) {
                if (arg4 == 0) {
                    Statics.field1943[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1943[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1943[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1943[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3620(arg1, arg2, arg5, arg4, var8.field858);
            }
        } else if (arg5 == 9) {
            class79 var29;
            if (var8.field863 == -1 && var8.field881 == null) {
                var29 = var8.method653(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1726(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field857 != 0 && arg7 != null) {
                arg7.method3630(arg1, arg2, var9, var10, var8.field858);
            }
            if (var8.field864 != 16) {
                arg6.method1619(arg0, arg1, arg2, var8.field864);
            }
        } else if (arg5 == 4) {
            class79 var30;
            if (var8.field863 == -1 && var8.field881 == null) {
                var30 = var8.method653(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1612(arg0, arg1, arg2, var16, var30, (class79) null, field93[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1629(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class37.method2940(var32 >> 14 & 0x7FFF).field864;
            }
            class79 var33;
            if (var8.field863 == -1 && var8.field881 == null) {
                var33 = var8.method653(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1612(arg0, arg1, arg2, var16, var33, (class79) null, field93[arg4], 0, field86[arg4] * var31, field87[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1629(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class37.method2940(var35 >> 14 & 0x7FFF).field864 / 2;
            }
            class79 var36;
            if (var8.field863 == -1 && var8.field881 == null) {
                var36 = var8.method653(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1612(arg0, arg1, arg2, var16, var36, (class79) null, 256, arg4, field88[arg4] * var34, field82[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class79 var38;
            if (var8.field863 == -1 && var8.field881 == null) {
                var38 = var8.method653(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class11(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1612(arg0, arg1, arg2, var16, var38, (class79) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1629(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class37.method2940(var40 >> 14 & 0x7FFF).field864 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class79 var42;
            class79 var43;
            if (var8.field863 == -1 && var8.field881 == null) {
                var42 = var8.method653(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method653(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field863, true, (class79) null);
                var43 = new class11(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field863, true, (class79) null);
            }
            arg6.method1612(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field88[arg4] * var39, field82[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("b.p(IIII)I")
    public static int method5(int arg0, int arg1, int arg2) {
        if ((field78[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field78[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("client.n(IIII)I")
    public static final int method443(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method579(var3, var5);
        int var8 = method579(var3 + 1, var5);
        int var9 = method579(var3, var5 + 1);
        int var10 = method579(var3 + 1, var5 + 1);
        int var11 = 65536 - class85.field1469[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class85.field1469[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class85.field1469[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("aa.o(IIB)I")
    public static final int method579(int arg0, int arg1) {
        int var2 = method537(arg0 - 1, arg1 - 1) + method537(arg0 + 1, arg1 - 1) + method537(arg0 - 1, arg1 + 1) + method537(arg0 + 1, arg1 + 1);
        int var3 = method537(arg0 - 1, arg1) + method537(arg0 + 1, arg1) + method537(arg0, arg1 - 1) + method537(arg0, arg1 + 1);
        int var4 = method537(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ao.g(III)I")
    public static final int method537(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ae.z(IIS)I")
    public static final int method607(int arg0, int arg1) {
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

    @ObfuscatedName("z.t(III)I")
    public static final int method115(int arg0, int arg1) {
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

    @ObfuscatedName("ep.y(IIIB)I")
    public static final int method2728(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cp.w(III)Z")
    public static final boolean method1769(int arg0, int arg1) {
        class37 var2 = class37.method2940(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method651(arg1);
    }

    @ObfuscatedName("l.x(IIIIIIILcf;Lhi;I)V")
    public static final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class80 arg7, class211 arg8) {
        class37 var9 = class37.method2940(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field856;
            var11 = var9.field855;
        } else {
            var10 = var9.field855;
            var11 = var9.field856;
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
        int[][] var16 = field84[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field848 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field880 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class79 var22;
            if (var9.field863 == -1 && var9.field881 == null) {
                var22 = var9.method654(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class11(arg4, 22, arg5, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1609(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field857 == 1) {
                arg8.method3622(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class79 var45;
            if (var9.field863 == -1 && var9.field881 == null) {
                var45 = var9.method654(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg4, 10, arg5, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            if (var45 != null) {
                arg7.method1726(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field857 != 0) {
                arg8.method3630(arg2, arg3, var10, var11, var9.field858);
            }
        } else if (arg6 >= 12) {
            class79 var23;
            if (var9.field863 == -1 && var9.field881 == null) {
                var23 = var9.method654(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1726(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3630(arg2, arg3, var10, var11, var9.field858);
            }
        } else if (arg6 == 0) {
            class79 var24;
            if (var9.field863 == -1 && var9.field881 == null) {
                var24 = var9.method654(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg4, 0, arg5, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1611(arg0, arg2, arg3, var17, var24, (class79) null, field93[arg5], 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3620(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 1) {
            class79 var25;
            if (var9.field863 == -1 && var9.field881 == null) {
                var25 = var9.method654(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg4, 1, arg5, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1611(arg0, arg2, arg3, var17, var25, (class79) null, field85[arg5], 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3620(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class79 var27;
            class79 var28;
            if (var9.field863 == -1 && var9.field881 == null) {
                var27 = var9.method654(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method654(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field863, true, (class79) null);
                var28 = new class11(arg4, 2, var26, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1611(arg0, arg2, arg3, var17, var27, var28, field93[arg5], field93[var26], var20, var21);
            if (var9.field857 != 0) {
                arg8.method3620(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 3) {
            class79 var29;
            if (var9.field863 == -1 && var9.field881 == null) {
                var29 = var9.method654(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg4, 3, arg5, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1611(arg0, arg2, arg3, var17, var29, (class79) null, field85[arg5], 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3620(arg2, arg3, arg6, arg5, var9.field858);
            }
        } else if (arg6 == 9) {
            class79 var30;
            if (var9.field863 == -1 && var9.field881 == null) {
                var30 = var9.method654(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg4, arg6, arg5, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1726(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field857 != 0) {
                arg8.method3630(arg2, arg3, var10, var11, var9.field858);
            }
        } else if (arg6 == 4) {
            class79 var31;
            if (var9.field863 == -1 && var9.field881 == null) {
                var31 = var9.method654(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1612(arg0, arg2, arg3, var17, var31, (class79) null, field93[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1629(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class37.method2940(var33 >> 14 & 0x7FFF).field864;
            }
            class79 var34;
            if (var9.field863 == -1 && var9.field881 == null) {
                var34 = var9.method654(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg4, 4, arg5, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1612(arg0, arg2, arg3, var17, var34, (class79) null, field93[arg5], 0, field86[arg5] * var32, field87[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1629(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class37.method2940(var36 >> 14 & 0x7FFF).field864 / 2;
            }
            class79 var37;
            if (var9.field863 == -1 && var9.field881 == null) {
                var37 = var9.method654(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1612(arg0, arg2, arg3, var17, var37, (class79) null, 256, arg5, field88[arg5] * var35, field82[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class79 var39;
            if (var9.field863 == -1 && var9.field881 == null) {
                var39 = var9.method654(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1612(arg0, arg2, arg3, var17, var39, (class79) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1629(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class37.method2940(var41 >> 14 & 0x7FFF).field864 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class79 var43;
            class79 var44;
            if (var9.field863 == -1 && var9.field881 == null) {
                var43 = var9.method654(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method654(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field863, true, (class79) null);
                var44 = new class11(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field863, true, (class79) null);
            }
            arg7.method1612(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field88[arg5] * var40, field82[arg5] * var40, var20, var21);
        }
    }
}
