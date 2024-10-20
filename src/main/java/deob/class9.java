package deob;

@ObfuscatedName("a")
public final class class9 {

    @ObfuscatedName("a.c")
    public static int[][][] field150 = new int[4][105][105];

    @ObfuscatedName("a.q")
    public static byte[][][] field141 = new byte[4][104][104];

    @ObfuscatedName("a.y")
    public static int field131 = 99;

    @ObfuscatedName("a.f")
    public static final int[] field137 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("a.o")
    public static final int[] field136 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("a.r")
    public static final int[] field147 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("a.k")
    public static final int[] field144 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("a.w")
    public static final int[] field139 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("a.e")
    public static final int[] field140 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("a.p")
    public static int field130 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("a.i")
    public static int field142 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.c(I)V")
    public static void method790() {
        field131 = 99;
        Statics.field1832 = new byte[4][104][104];
        Statics.field132 = new byte[4][104][104];
        Statics.field2480 = new byte[4][104][104];
        Statics.field2484 = new byte[4][104][104];
        Statics.field1838 = new int[4][105][105];
        Statics.field133 = new byte[4][105][105];
        Statics.field87 = new int[105][105];
        Statics.field1806 = new int[104];
        Statics.field80 = new int[104];
        Statics.field129 = new int[104];
        Statics.field1291 = new int[104];
        Statics.field369 = new int[104];
    }

    @ObfuscatedName("l.q(IIIII)V")
    public static final void method56(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field133[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field150[0][var5][var4] = field150[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field150[0][var5][var4] = field150[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field150[0][var5][var4] = field150[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field150[0][var5][var4] = field150[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.v(Ldg;IIIIIII)V")
    public static final void method209(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2383();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2383();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2383();
                }
            }
            return;
        }
        field141[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2383();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field150[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method716(var10 + 45365, var11 + 91923, 4) - 128 + (method716(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method716(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field150[arg1][arg2][arg3] = field150[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2383();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field150[0][arg2][arg3] = -var15 * 8;
                } else {
                    field150[arg1][arg2][arg3] = field150[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field132[arg1][arg2][arg3] = arg0.method2319();
                Statics.field2480[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2484[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field141[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1832[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("s.g([BIILck;[Ldp;I)V")
    public static final void method124(byte[] arg0, int arg1, int arg2, class95 arg3, class130[] arg4) {
        class127 var5 = new class127(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2331();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2331();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2383();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field141[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class130 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method520(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("client.x(IIIIIILck;Ldp;B)V")
    public static final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field499 && (field141[0][arg1][arg2] & 0x2) == 0) {
            if ((field141[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2588(arg0, arg1, arg2) != client.field710) {
                return;
            }
        }
        if (arg0 < field131) {
            field131 = arg0;
        }
        class32 var8 = class32.method1446(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field835;
            var10 = var8.field842;
        } else {
            var9 = var8.field842;
            var10 = var8.field835;
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
        int[][] var15 = field150[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field841 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field867 == 1) {
            var20 += 256;
        }
        if (var8.method617()) {
            class7.method23(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field499 || var8.field841 != 0 || var8.field844 == 1 || var8.field865) {
                class94 var21;
                if (var8.field850 == -1 && var8.field868 == null) {
                    var21 = var8.method613(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field850, true, (class94) null);
                }
                arg6.method1792(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field844 == 1 && arg7 != null) {
                    arg7.method2557(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var44;
            if (var8.field850 == -1 && var8.field868 == null) {
                var44 = var8.method613(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            if (var44 != null && arg6.method1805(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field858) {
                int var45 = 15;
                if (var44 instanceof class112) {
                    var45 = ((class112) var44).method2140() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field133[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field133[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method2555(arg1, arg2, var9, var10, var8.field845);
            }
        } else if (arg5 >= 12) {
            class94 var22;
            if (var8.field850 == -1 && var8.field868 == null) {
                var22 = var8.method613(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1805(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1838[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method2555(arg1, arg2, var9, var10, var8.field845);
            }
        } else if (arg5 == 0) {
            class94 var23;
            if (var8.field850 == -1 && var8.field868 == null) {
                var23 = var8.method613(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1794(arg0, arg1, arg2, var16, var23, (class94) null, field137[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field858) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field863) {
                    Statics.field1838[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field858) {
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field863) {
                    Statics.field1838[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field858) {
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field863) {
                    Statics.field1838[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field858) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field863) {
                    Statics.field1838[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method2554(arg1, arg2, arg5, arg4, var8.field845);
            }
            if (var8.field859 != 16) {
                arg6.method1802(arg0, arg1, arg2, var8.field859);
            }
        } else if (arg5 == 1) {
            class94 var24;
            if (var8.field850 == -1 && var8.field868 == null) {
                var24 = var8.method613(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1794(arg0, arg1, arg2, var16, var24, (class94) null, field136[arg4], 0, var19, var20);
            if (var8.field858) {
                if (arg4 == 0) {
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method2554(arg1, arg2, arg5, arg4, var8.field845);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class94 var26;
            class94 var27;
            if (var8.field850 == -1 && var8.field868 == null) {
                var26 = var8.method613(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method613(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field850, true, (class94) null);
                var27 = new class14(arg3, 2, var25, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1794(arg0, arg1, arg2, var16, var26, var27, field137[arg4], field137[var25], var19, var20);
            if (var8.field863) {
                if (arg4 == 0) {
                    Statics.field1838[arg0][arg1][arg2] |= 0x249;
                    Statics.field1838[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1838[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1838[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1838[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1838[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1838[arg0][arg1][arg2] |= 0x492;
                    Statics.field1838[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method2554(arg1, arg2, arg5, arg4, var8.field845);
            }
            if (var8.field859 != 16) {
                arg6.method1802(arg0, arg1, arg2, var8.field859);
            }
        } else if (arg5 == 3) {
            class94 var28;
            if (var8.field850 == -1 && var8.field868 == null) {
                var28 = var8.method613(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1794(arg0, arg1, arg2, var16, var28, (class94) null, field136[arg4], 0, var19, var20);
            if (var8.field858) {
                if (arg4 == 0) {
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method2554(arg1, arg2, arg5, arg4, var8.field845);
            }
        } else if (arg5 == 9) {
            class94 var29;
            if (var8.field850 == -1 && var8.field868 == null) {
                var29 = var8.method613(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1805(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field844 != 0 && arg7 != null) {
                arg7.method2555(arg1, arg2, var9, var10, var8.field845);
            }
            if (var8.field859 != 16) {
                arg6.method1802(arg0, arg1, arg2, var8.field859);
            }
        } else if (arg5 == 4) {
            class94 var30;
            if (var8.field850 == -1 && var8.field868 == null) {
                var30 = var8.method613(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var30, (class94) null, field137[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1812(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class32.method1446(var32 >> 14 & 0x7FFF).field859;
            }
            class94 var33;
            if (var8.field850 == -1 && var8.field868 == null) {
                var33 = var8.method613(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var33, (class94) null, field137[arg4], 0, field147[arg4] * var31, field144[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1812(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class32.method1446(var35 >> 14 & 0x7FFF).field859 / 2;
            }
            class94 var36;
            if (var8.field850 == -1 && var8.field868 == null) {
                var36 = var8.method613(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var36, (class94) null, 256, arg4, field139[arg4] * var34, field140[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class94 var38;
            if (var8.field850 == -1 && var8.field868 == null) {
                var38 = var8.method613(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class14(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var38, (class94) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1812(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class32.method1446(var40 >> 14 & 0x7FFF).field859 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            class94 var43;
            if (var8.field850 == -1 && var8.field868 == null) {
                var42 = var8.method613(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method613(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field850, true, (class94) null);
                var43 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field850, true, (class94) null);
            }
            arg6.method1795(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field139[arg4] * var39, field140[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ea.u(IIII)I")
    public static int method2588(int arg0, int arg1, int arg2) {
        if ((field141[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field141[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("an.l(IIIB)I")
    public static final int method716(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method723(var3, var5);
        int var8 = method723(var3 + 1, var5);
        int var9 = method723(var3, var5 + 1);
        int var10 = method723(var3 + 1, var5 + 1);
        int var11 = 65536 - class104.field1789[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class104.field1789[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class104.field1789[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ad.a(III)I")
    public static final int method723(int arg0, int arg1) {
        int var2 = Statics.method26(arg0 - 1, arg1 - 1) + Statics.method26(arg0 + 1, arg1 - 1) + Statics.method26(arg0 - 1, arg1 + 1) + Statics.method26(arg0 + 1, arg1 + 1);
        int var3 = Statics.method26(arg0 - 1, arg1) + Statics.method26(arg0 + 1, arg1) + Statics.method26(arg0, arg1 - 1) + Statics.method26(arg0, arg1 + 1);
        int var4 = Statics.method26(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bx.t(IIS)I")
    public static final int method1320(int arg0, int arg1) {
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

    @ObfuscatedName("ew.m(IIB)I")
    public static final int method2753(int arg0, int arg1) {
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

    @ObfuscatedName("v.s(IIII)I")
    public static final int method31(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("aw.j(IIB)Z")
    public static final boolean method868(int arg0, int arg1) {
        class32 var2 = class32.method1446(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method612(arg1);
    }
}
