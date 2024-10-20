package deob;

@ObfuscatedName("a")
public final class class6 {

    @ObfuscatedName("a.e")
    public static int[][][] field79 = new int[4][105][105];

    @ObfuscatedName("a.l")
    public static byte[][][] field90 = new byte[4][104][104];

    @ObfuscatedName("a.c")
    public static int field80 = 99;

    @ObfuscatedName("a.z")
    public static final int[] field88 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("a.y")
    public static final int[] field78 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("a.m")
    public static final int[] field89 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("a.v")
    public static final int[] field91 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("a.k")
    public static final int[] field83 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("a.n")
    public static final int[] field93 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("a.d")
    public static int field94 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("a.s")
    public static int field95 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.l(IIIII)V")
    public static final void method822(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field84[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field79[0][var5][var4] = field79[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field79[0][var5][var4] = field79[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field79[0][var5][var4] = field79[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field79[0][var5][var4] = field79[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.c(Ldd;IIIIIII)V")
    public static final void method1091(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2464();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2464();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2464();
                }
            }
            return;
        }
        field90[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2464();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field79[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2757(var10 + 45365, var11 + 91923, 4) - 128 + (method2757(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2757(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field79[arg1][arg2][arg3] = field79[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2464();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field79[0][arg2][arg3] = -var15 * 8;
                } else {
                    field79[arg1][arg2][arg3] = field79[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field92[arg1][arg2][arg3] = arg0.method2465();
                Statics.field3205[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field82[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field90[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field81[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("t.h([BIIIIIIILcq;[Ldc;B)V")
    public static final void method157(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class90 arg8, class112[] arg9) {
        class123 var10 = new class123(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2526();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2526();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2464();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class43 var21 = class43.method2943(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field960;
                    int var27 = var21.field1001;
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
                    int var32 = arg3 + class181.method3056(var16 & 0x7, var15 & 0x7, arg7, var21.field960, var21.field1001, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field90[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class112 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method3113(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fk.r(IIIIIILcq;Ldc;I)V")
    public static final void method3113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, class112 arg7) {
        if (client.field299 && (field90[0][arg1][arg2] & 0x2) == 0 && (field90[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field80) {
            field80 = arg0;
        }
        class43 var8 = class43.method2943(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field1001;
            var10 = var8.field960;
        } else {
            var9 = var8.field960;
            var10 = var8.field1001;
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
        int[][] var15 = field79[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field972 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field1000 == 1) {
            var20 += 256;
        }
        if (var8.method816()) {
            class25.method927(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field299 || var8.field972 != 0 || var8.field977 == 1 || var8.field998) {
                class89 var21;
                if (var8.field983 == -1 && var8.field970 == null) {
                    var21 = var8.method811(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field983, true, (class89) null);
                }
                arg6.method1894(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field977 == 1 && arg7 != null) {
                    arg7.method2335(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class89 var44;
            if (var8.field983 == -1 && var8.field970 == null) {
                var44 = var8.method811(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            if (var44 != null && arg6.method1898(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field996) {
                int var45 = 15;
                if (var44 instanceof class109) {
                    var45 = ((class109) var44).method2243() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field84[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field84[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field977 != 0 && arg7 != null) {
                arg7.method2361(arg1, arg2, var9, var10, var8.field978);
            }
        } else if (arg5 >= 12) {
            class89 var22;
            if (var8.field983 == -1 && var8.field970 == null) {
                var22 = var8.method811(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2118[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field977 != 0 && arg7 != null) {
                arg7.method2361(arg1, arg2, var9, var10, var8.field978);
            }
        } else if (arg5 == 0) {
            class89 var23;
            if (var8.field983 == -1 && var8.field970 == null) {
                var23 = var8.method811(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method1896(arg0, arg1, arg2, var16, var23, (class89) null, field88[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field996) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field982) {
                    Statics.field2118[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field996) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field982) {
                    Statics.field2118[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field996) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field982) {
                    Statics.field2118[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field996) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field982) {
                    Statics.field2118[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field977 != 0 && arg7 != null) {
                arg7.method2334(arg1, arg2, arg5, arg4, var8.field978);
            }
            if (var8.field961 != 16) {
                arg6.method1904(arg0, arg1, arg2, var8.field961);
            }
        } else if (arg5 == 1) {
            class89 var24;
            if (var8.field983 == -1 && var8.field970 == null) {
                var24 = var8.method811(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method1896(arg0, arg1, arg2, var16, var24, (class89) null, field78[arg4], 0, var19, var20);
            if (var8.field996) {
                if (arg4 == 0) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field977 != 0 && arg7 != null) {
                arg7.method2334(arg1, arg2, arg5, arg4, var8.field978);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class89 var26;
            class89 var27;
            if (var8.field983 == -1 && var8.field970 == null) {
                var26 = var8.method811(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method811(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field983, true, (class89) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method1896(arg0, arg1, arg2, var16, var26, var27, field88[arg4], field88[var25], var19, var20);
            if (var8.field982) {
                if (arg4 == 0) {
                    Statics.field2118[arg0][arg1][arg2] |= 0x249;
                    Statics.field2118[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2118[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2118[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2118[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2118[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2118[arg0][arg1][arg2] |= 0x492;
                    Statics.field2118[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field977 != 0 && arg7 != null) {
                arg7.method2334(arg1, arg2, arg5, arg4, var8.field978);
            }
            if (var8.field961 != 16) {
                arg6.method1904(arg0, arg1, arg2, var8.field961);
            }
        } else if (arg5 == 3) {
            class89 var28;
            if (var8.field983 == -1 && var8.field970 == null) {
                var28 = var8.method811(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method1896(arg0, arg1, arg2, var16, var28, (class89) null, field78[arg4], 0, var19, var20);
            if (var8.field996) {
                if (arg4 == 0) {
                    Statics.field84[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field84[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field84[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field84[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field977 != 0 && arg7 != null) {
                arg7.method2334(arg1, arg2, arg5, arg4, var8.field978);
            }
        } else if (arg5 == 9) {
            class89 var29;
            if (var8.field983 == -1 && var8.field970 == null) {
                var29 = var8.method811(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method1898(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field977 != 0 && arg7 != null) {
                arg7.method2361(arg1, arg2, var9, var10, var8.field978);
            }
            if (var8.field961 != 16) {
                arg6.method1904(arg0, arg1, arg2, var8.field961);
            }
        } else if (arg5 == 4) {
            class89 var30;
            if (var8.field983 == -1 && var8.field970 == null) {
                var30 = var8.method811(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method2012(arg0, arg1, arg2, var16, var30, (class89) null, field88[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1908(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class43.method2943(var32 >> 14 & 0x7FFF).field961;
            }
            class89 var33;
            if (var8.field983 == -1 && var8.field970 == null) {
                var33 = var8.method811(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method2012(arg0, arg1, arg2, var16, var33, (class89) null, field88[arg4], 0, field89[arg4] * var31, field91[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1908(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class43.method2943(var35 >> 14 & 0x7FFF).field961 / 2;
            }
            class89 var36;
            if (var8.field983 == -1 && var8.field970 == null) {
                var36 = var8.method811(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method2012(arg0, arg1, arg2, var16, var36, (class89) null, 256, arg4, field83[arg4] * var34, field93[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class89 var38;
            if (var8.field983 == -1 && var8.field970 == null) {
                var38 = var8.method811(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method2012(arg0, arg1, arg2, var16, var38, (class89) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1908(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class43.method2943(var40 >> 14 & 0x7FFF).field961 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class89 var42;
            class89 var43;
            if (var8.field983 == -1 && var8.field970 == null) {
                var42 = var8.method811(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method811(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field983, true, (class89) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field983, true, (class89) null);
            }
            arg6.method2012(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field83[arg4] * var39, field93[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("as.a(Lcq;[Ldc;I)V")
    public static final void method636(class90 arg0, class112[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field90[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field90[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2348(var3, var4);
                        }
                    }
                }
            }
        }
        field94 += (int) (Math.random() * 5.0D) - 2;
        if (field94 < -8) {
            field94 = -8;
        }
        if (field94 > 8) {
            field94 = 8;
        }
        field95 += (int) (Math.random() * 5.0D) - 2;
        if (field95 < -16) {
            field95 = -16;
        }
        if (field95 > 16) {
            field95 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field84[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field79[var6][var11 + 1][var10] - field79[var6][var11 - 1][var10];
                    int var13 = field79[var6][var11][var10 + 1] - field79[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field26[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field85[var20] = 0;
                Statics.field86[var20] = 0;
                Statics.field156[var20] = 0;
                Statics.field3229[var20] = 0;
                Statics.field753[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field81[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class44 var25 = class44.method574(var24 - 1);
                            Statics.field85[var22] += var25.field1012;
                            Statics.field86[var22] += var25.field1016;
                            Statics.field156[var22] += var25.field1014;
                            Statics.field3229[var22] += var25.field1015;
                            var10002 = Statics.field753[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field81[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class44 var28 = class44.method574(var27 - 1);
                            Statics.field85[var22] -= var28.field1012;
                            Statics.field86[var22] -= var28.field1016;
                            Statics.field156[var22] -= var28.field1014;
                            Statics.field3229[var22] -= var28.field1015;
                            var10002 = Statics.field753[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var29 = 0;
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = 0;
                    for (int var34 = -5; var34 < 109; var34++) {
                        int var35 = var34 + 5;
                        if (var35 >= 0 && var35 < 104) {
                            var29 += Statics.field85[var35];
                            var30 += Statics.field86[var35];
                            var31 += Statics.field156[var35];
                            var32 += Statics.field3229[var35];
                            var33 += Statics.field753[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field85[var36];
                            var30 -= Statics.field86[var36];
                            var31 -= Statics.field156[var36];
                            var32 -= Statics.field3229[var36];
                            var33 -= Statics.field753[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field299 || (field90[0][var21][var34] & 0x2) != 0 || (field90[var6][var21][var34] & 0x10) == 0)) {
                            if (var6 < field80) {
                                field80 = var6;
                            }
                            int var37 = Statics.field81[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field92[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field79[var6][var21][var34];
                                int var40 = field79[var6][var21 + 1][var34];
                                int var41 = field79[var6][var21 + 1][var34 + 1];
                                int var42 = field79[var6][var21][var34 + 1];
                                int var43 = Statics.field26[var21][var34];
                                int var44 = Statics.field26[var21 + 1][var34];
                                int var45 = Statics.field26[var21 + 1][var34 + 1];
                                int var46 = Statics.field26[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method743(var49, var50, var51);
                                    int var52 = field94 + var49 & 0xFF;
                                    int var53 = field95 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method743(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field3205[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class49.method76(var38 - 1).field1082) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field2118[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class95.field1652[Statics.method105(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1893(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, Statics.method105(var47, var43), Statics.method105(var47, var44), Statics.method105(var47, var45), Statics.method105(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field3205[var6][var21][var34] + 1;
                                    byte var57 = Statics.field82[var6][var21][var34];
                                    class49 var58 = class49.method76(var38 - 1);
                                    int var59 = var58.field1081;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1647.method2126(var59);
                                        var61 = -1;
                                    } else if (var58.field1083 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method743(var58.field1093, var58.field1087, var58.field1088);
                                        int var62 = field94 + var58.field1093 & 0xFF;
                                        int var63 = field95 + var58.field1088;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method743(var62, var58.field1087, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class95.field1652[method201(var60, 96)];
                                    }
                                    if (var58.field1085 != -1) {
                                        int var65 = field94 + var58.field1089 & 0xFF;
                                        int var66 = field95 + var58.field1091;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method743(var65, var58.field1090, var66);
                                        var64 = class95.field1652[method201(var67, 96)];
                                    }
                                    arg0.method1893(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, Statics.method105(var47, var43), Statics.method105(var47, var44), Statics.method105(var47, var45), Statics.method105(var47, var46), method201(var61, var43), method201(var61, var44), method201(var61, var45), method201(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    int var74;
                    if ((field90[var6][var69][var68] & 0x8) != 0) {
                        var74 = 0;
                    } else if (var6 <= 0 || (field90[1][var69][var68] & 0x2) == 0) {
                        var74 = var6;
                    } else {
                        var74 = var6 - 1;
                    }
                    arg0.method1959(var6, var69, var68, var74);
                }
            }
            Statics.field81[var6] = (byte[][]) null;
            Statics.field92[var6] = (byte[][]) null;
            Statics.field3205[var6] = (byte[][]) null;
            Statics.field82[var6] = (byte[][]) null;
            Statics.field84[var6] = (byte[][]) null;
        }
        arg0.method1919(-50, -10, -50);
        for (int var75 = 0; var75 < 104; var75++) {
            for (int var76 = 0; var76 < 104; var76++) {
                if ((field90[1][var75][var76] & 0x2) == 2) {
                    arg0.method1940(var75, var76);
                }
            }
        }
        int var77 = 1;
        int var78 = 2;
        int var79 = 4;
        for (int var80 = 0; var80 < 4; var80++) {
            if (var80 > 0) {
                var77 <<= 0x3;
                var78 <<= 0x3;
                var79 <<= 0x3;
            }
            for (int var81 = 0; var81 <= var80; var81++) {
                for (int var82 = 0; var82 <= 104; var82++) {
                    for (int var83 = 0; var83 <= 104; var83++) {
                        if ((Statics.field2118[var81][var83][var82] & var77) != 0) {
                            int var84 = var82;
                            int var85 = var82;
                            int var86 = var81;
                            int var87 = var81;
                            while (var84 > 0 && (Statics.field2118[var81][var83][var84 - 1] & var77) != 0) {
                                var84--;
                            }
                            while (var85 < 104 && (Statics.field2118[var81][var83][var85 + 1] & var77) != 0) {
                                var85++;
                            }
                            label343: while (var86 > 0) {
                                for (int var88 = var84; var88 <= var85; var88++) {
                                    if ((Statics.field2118[var86 - 1][var83][var88] & var77) == 0) {
                                        break label343;
                                    }
                                }
                                var86--;
                            }
                            label332: while (var87 < var80) {
                                for (int var89 = var84; var89 <= var85; var89++) {
                                    if ((Statics.field2118[var87 + 1][var83][var89] & var77) == 0) {
                                        break label332;
                                    }
                                }
                                var87++;
                            }
                            int var90 = (var87 + 1 - var86) * (var85 - var84 + 1);
                            if (var90 >= 8) {
                                short var91 = 240;
                                int var92 = field79[var87][var83][var84] - var91;
                                int var93 = field79[var86][var83][var84];
                                class90.method1891(var80, 1, var83 * 128, var83 * 128, var84 * 128, var85 * 128 + 128, var92, var93);
                                for (int var94 = var86; var94 <= var87; var94++) {
                                    for (int var95 = var84; var95 <= var85; var95++) {
                                        Statics.field2118[var94][var83][var95] &= ~var77;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2118[var81][var83][var82] & var78) != 0) {
                            int var96 = var83;
                            int var97 = var83;
                            int var98 = var81;
                            int var99 = var81;
                            while (var96 > 0 && (Statics.field2118[var81][var96 - 1][var82] & var78) != 0) {
                                var96--;
                            }
                            while (var97 < 104 && (Statics.field2118[var81][var97 + 1][var82] & var78) != 0) {
                                var97++;
                            }
                            label396: while (var98 > 0) {
                                for (int var100 = var96; var100 <= var97; var100++) {
                                    if ((Statics.field2118[var98 - 1][var100][var82] & var78) == 0) {
                                        break label396;
                                    }
                                }
                                var98--;
                            }
                            label385: while (var99 < var80) {
                                for (int var101 = var96; var101 <= var97; var101++) {
                                    if ((Statics.field2118[var99 + 1][var101][var82] & var78) == 0) {
                                        break label385;
                                    }
                                }
                                var99++;
                            }
                            int var102 = (var99 + 1 - var98) * (var97 - var96 + 1);
                            if (var102 >= 8) {
                                short var103 = 240;
                                int var104 = field79[var99][var96][var82] - var103;
                                int var105 = field79[var98][var96][var82];
                                class90.method1891(var80, 2, var96 * 128, var97 * 128 + 128, var82 * 128, var82 * 128, var104, var105);
                                for (int var106 = var98; var106 <= var99; var106++) {
                                    for (int var107 = var96; var107 <= var97; var107++) {
                                        Statics.field2118[var106][var107][var82] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field2118[var81][var83][var82] & var79) != 0) {
                            int var108 = var83;
                            int var109 = var83;
                            int var110 = var82;
                            int var111 = var82;
                            while (var110 > 0 && (Statics.field2118[var81][var83][var110 - 1] & var79) != 0) {
                                var110--;
                            }
                            while (var111 < 104 && (Statics.field2118[var81][var83][var111 + 1] & var79) != 0) {
                                var111++;
                            }
                            label449: while (var108 > 0) {
                                for (int var112 = var110; var112 <= var111; var112++) {
                                    if ((Statics.field2118[var81][var108 - 1][var112] & var79) == 0) {
                                        break label449;
                                    }
                                }
                                var108--;
                            }
                            label438: while (var109 < 104) {
                                for (int var113 = var110; var113 <= var111; var113++) {
                                    if ((Statics.field2118[var81][var109 + 1][var113] & var79) == 0) {
                                        break label438;
                                    }
                                }
                                var109++;
                            }
                            if ((var109 - var108 + 1) * (var111 - var110 + 1) >= 4) {
                                int var114 = field79[var81][var108][var110];
                                class90.method1891(var80, 4, var108 * 128, var109 * 128 + 128, var110 * 128, var111 * 128 + 128, var114, var114);
                                for (int var115 = var108; var115 <= var109; var115++) {
                                    for (int var116 = var110; var116 <= var111; var116++) {
                                        Statics.field2118[var81][var115][var116] &= ~var79;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dk.b(IIII)I")
    public static final int method2757(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1582(var3, var5);
        int var8 = method1582(var3 + 1, var5);
        int var9 = method1582(var3, var5 + 1);
        int var10 = method1582(var3 + 1, var5 + 1);
        int var11 = method2810(var7, var8, var4, arg2);
        int var12 = method2810(var9, var10, var4, arg2);
        return method2810(var11, var12, var6, arg2);
    }

    @ObfuscatedName("eq.u(IIIIB)I")
    public static final int method2810(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class95.field1654[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("bz.o(III)I")
    public static final int method1582(int arg0, int arg1) {
        int var2 = method15(arg0 - 1, arg1 - 1) + method15(arg0 + 1, arg1 - 1) + method15(arg0 - 1, arg1 + 1) + method15(arg0 + 1, arg1 + 1);
        int var3 = method15(arg0 - 1, arg1) + method15(arg0 + 1, arg1) + method15(arg0, arg1 - 1) + method15(arg0, arg1 + 1);
        int var4 = method15(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("c.p(III)I")
    public static final int method15(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("y.q(IIS)I")
    public static final int method201(int arg0, int arg1) {
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

    @ObfuscatedName("aa.g(IIII)I")
    public static final int method743(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("o.j(III)Z")
    public static final boolean method101(int arg0, int arg1) {
        class43 var2 = class43.method2943(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method809(arg1);
    }
}
