package deob;

@ObfuscatedName("y")
public final class class6 {

    @ObfuscatedName("y.t")
    public static int[][][] field82 = new int[4][105][105];

    @ObfuscatedName("y.o")
    public static byte[][][] field71 = new byte[4][104][104];

    @ObfuscatedName("y.i")
    public static int field88 = 99;

    @ObfuscatedName("y.k")
    public static final int[] field79 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("y.a")
    public static final int[] field80 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("y.d")
    public static final int[] field81 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("y.j")
    public static final int[] field85 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("y.s")
    public static final int[] field83 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("y.f")
    public static final int[] field84 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("y.e")
    public static int field72 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("y.q")
    public static int field86 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.t(I)V")
    public static void method2579() {
        field88 = 99;
        Statics.field77 = new byte[4][104][104];
        Statics.field74 = new byte[4][104][104];
        Statics.field75 = new byte[4][104][104];
        Statics.field73 = new byte[4][104][104];
        Statics.field2049 = new int[4][105][105];
        Statics.field1877 = new byte[4][105][105];
        Statics.field94 = new int[105][105];
        Statics.field1911 = new int[104];
        Statics.field1900 = new int[104];
        Statics.field144 = new int[104];
        Statics.field78 = new int[104];
        Statics.field57 = new int[104];
    }

    @ObfuscatedName("r.o(IIIIB)V")
    public static final void method153(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1877[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field82[0][var5][var4] = field82[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field82[0][var5][var4] = field82[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field82[0][var5][var4] = field82[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field82[0][var5][var4] = field82[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bf.i(Ldg;IIIIIII)V")
    public static final void method1588(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2118();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2118();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2118();
                }
            }
            return;
        }
        field71[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2118();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field82[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method83(var10 + 45365, var11 + 91923, 4) - 128 + (method83(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method83(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field82[arg1][arg2][arg3] = field82[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2118();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field82[0][arg2][arg3] = -var15 * 8;
                } else {
                    field82[arg1][arg2][arg3] = field82[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field74[arg1][arg2][arg3] = arg0.method2253();
                Statics.field75[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field73[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field71[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field77[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("co.p([BIIB)Z")
    public static final boolean method1860(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class107 var4 = new class107(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2198();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2198();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2118() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class36 var16 = class36.method3(var5);
                        if (var13 != 22 || !client.field258 || var16.field844 != 0 || var16.field842 == 1 || var16.field863) {
                            if (!var16.method660()) {
                                client.field308++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2198();
                if (var9 == 0) {
                    break;
                }
                var4.method2118();
            }
        }
    }

    @ObfuscatedName("p.c([BIIIIIIILcu;[Lgn;I)V")
    public static final void method27(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79 arg8, class197[] arg9) {
        class107 var10 = new class107(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2198();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2198();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2118();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class36 var21 = class36.method3(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field856;
                    int var27 = var21.field841;
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
                    int var33 = var16 & 0x7;
                    int var34 = var15 & 0x7;
                    int var36 = var21.field856;
                    int var37 = var21.field841;
                    if ((var20 & 0x1) == 1) {
                        int var38 = var36;
                        var36 = var37;
                        var37 = var38;
                    }
                    int var39 = arg7 & 0x3;
                    int var40;
                    if (var39 == 0) {
                        var40 = var34;
                    } else if (var39 == 1) {
                        var40 = 7 - var33 - (var36 - 1);
                    } else if (var39 == 2) {
                        var40 = 7 - var34 - (var37 - 1);
                    } else {
                        var40 = var33;
                    }
                    int var41 = arg3 + var40;
                    if (var31 > 0 && var41 > 0 && var31 < 103 && var41 < 103) {
                        int var42 = arg1;
                        if ((field71[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class197 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method524(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.y(IIIIIILcu;Lgn;I)V")
    public static final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class197 arg7) {
        if (client.field258 && (field71[0][arg1][arg2] & 0x2) == 0) {
            if ((field71[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method2448(arg0, arg1, arg2) != client.field305) {
                return;
            }
        }
        if (arg0 < field88) {
            field88 = arg0;
        }
        class36 var8 = class36.method3(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field841;
            var10 = var8.field856;
        } else {
            var9 = var8.field856;
            var10 = var8.field841;
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
        int[][] var15 = field82[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field844 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field858 == 1) {
            var20 += 256;
        }
        if (var8.method649()) {
            class20.method1041(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field258 || var8.field844 != 0 || var8.field842 == 1 || var8.field863) {
                class78 var21;
                if (var8.field872 == -1 && var8.field866 == null) {
                    var21 = var8.method644(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field872, true, (class78) null);
                }
                arg6.method1643(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field842 == 1 && arg7 != null) {
                    arg7.method3429(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var44;
            if (var8.field872 == -1 && var8.field866 == null) {
                var44 = var8.method644(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            if (var44 != null && arg6.method1713(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field871) {
                int var45 = 15;
                if (var44 instanceof class98) {
                    var45 = ((class98) var44).method2003() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field1877[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field1877[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field842 != 0 && arg7 != null) {
                arg7.method3427(arg1, arg2, var9, var10, var8.field848);
            }
        } else if (arg5 >= 12) {
            class78 var22;
            if (var8.field872 == -1 && var8.field866 == null) {
                var22 = var8.method644(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1713(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2049[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field842 != 0 && arg7 != null) {
                arg7.method3427(arg1, arg2, var9, var10, var8.field848);
            }
        } else if (arg5 == 0) {
            class78 var23;
            if (var8.field872 == -1 && var8.field866 == null) {
                var23 = var8.method644(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1599(arg0, arg1, arg2, var16, var23, (class78) null, field79[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field871) {
                    Statics.field1877[arg0][arg1][arg2] = 50;
                    Statics.field1877[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field847) {
                    Statics.field2049[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field871) {
                    Statics.field1877[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1877[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field847) {
                    Statics.field2049[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field871) {
                    Statics.field1877[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1877[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field847) {
                    Statics.field2049[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field871) {
                    Statics.field1877[arg0][arg1][arg2] = 50;
                    Statics.field1877[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field847) {
                    Statics.field2049[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field842 != 0 && arg7 != null) {
                arg7.method3426(arg1, arg2, arg5, arg4, var8.field848);
            }
            if (var8.field849 != 16) {
                arg6.method1607(arg0, arg1, arg2, var8.field849);
            }
        } else if (arg5 == 1) {
            class78 var24;
            if (var8.field872 == -1 && var8.field866 == null) {
                var24 = var8.method644(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1599(arg0, arg1, arg2, var16, var24, (class78) null, field80[arg4], 0, var19, var20);
            if (var8.field871) {
                if (arg4 == 0) {
                    Statics.field1877[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1877[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1877[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1877[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field842 != 0 && arg7 != null) {
                arg7.method3426(arg1, arg2, arg5, arg4, var8.field848);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class78 var26;
            class78 var27;
            if (var8.field872 == -1 && var8.field866 == null) {
                var26 = var8.method644(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method644(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field872, true, (class78) null);
                var27 = new class11(arg3, 2, var25, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1599(arg0, arg1, arg2, var16, var26, var27, field79[arg4], field79[var25], var19, var20);
            if (var8.field847) {
                if (arg4 == 0) {
                    Statics.field2049[arg0][arg1][arg2] |= 0x249;
                    Statics.field2049[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2049[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2049[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2049[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2049[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2049[arg0][arg1][arg2] |= 0x492;
                    Statics.field2049[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field842 != 0 && arg7 != null) {
                arg7.method3426(arg1, arg2, arg5, arg4, var8.field848);
            }
            if (var8.field849 != 16) {
                arg6.method1607(arg0, arg1, arg2, var8.field849);
            }
        } else if (arg5 == 3) {
            class78 var28;
            if (var8.field872 == -1 && var8.field866 == null) {
                var28 = var8.method644(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1599(arg0, arg1, arg2, var16, var28, (class78) null, field80[arg4], 0, var19, var20);
            if (var8.field871) {
                if (arg4 == 0) {
                    Statics.field1877[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1877[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1877[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1877[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field842 != 0 && arg7 != null) {
                arg7.method3426(arg1, arg2, arg5, arg4, var8.field848);
            }
        } else if (arg5 == 9) {
            class78 var29;
            if (var8.field872 == -1 && var8.field866 == null) {
                var29 = var8.method644(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1713(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field842 != 0 && arg7 != null) {
                arg7.method3427(arg1, arg2, var9, var10, var8.field848);
            }
            if (var8.field849 != 16) {
                arg6.method1607(arg0, arg1, arg2, var8.field849);
            }
        } else if (arg5 == 4) {
            class78 var30;
            if (var8.field872 == -1 && var8.field866 == null) {
                var30 = var8.method644(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1600(arg0, arg1, arg2, var16, var30, (class78) null, field79[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1617(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class36.method3(var32 >> 14 & 0x7FFF).field849;
            }
            class78 var33;
            if (var8.field872 == -1 && var8.field866 == null) {
                var33 = var8.method644(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1600(arg0, arg1, arg2, var16, var33, (class78) null, field79[arg4], 0, field81[arg4] * var31, field85[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1617(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class36.method3(var35 >> 14 & 0x7FFF).field849 / 2;
            }
            class78 var36;
            if (var8.field872 == -1 && var8.field866 == null) {
                var36 = var8.method644(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1600(arg0, arg1, arg2, var16, var36, (class78) null, 256, arg4, field83[arg4] * var34, field84[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class78 var38;
            if (var8.field872 == -1 && var8.field866 == null) {
                var38 = var8.method644(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class11(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1600(arg0, arg1, arg2, var16, var38, (class78) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1617(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class36.method3(var40 >> 14 & 0x7FFF).field849 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class78 var42;
            class78 var43;
            if (var8.field872 == -1 && var8.field866 == null) {
                var42 = var8.method644(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method644(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field872, true, (class78) null);
                var43 = new class11(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field872, true, (class78) null);
            }
            arg6.method1600(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field83[arg4] * var39, field84[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("dk.g(IIII)I")
    public static int method2448(int arg0, int arg1, int arg2) {
        if ((field71[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field71[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("g.l(IIII)I")
    public static final int method83(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method809(var3, var5);
        int var8 = method809(var3 + 1, var5);
        int var9 = method809(var3, var5 + 1);
        int var10 = method809(var3 + 1, var5 + 1);
        int var11 = method2552(var7, var8, var4, arg2);
        int var12 = method2552(var9, var10, var4, arg2);
        return method2552(var11, var12, var6, arg2);
    }

    @ObfuscatedName("dz.h(IIIIB)I")
    public static final int method2552(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1484[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("au.n(IIB)I")
    public static final int method809(int arg0, int arg1) {
        int var2 = method1857(arg0 - 1, arg1 - 1) + method1857(arg0 + 1, arg1 - 1) + method1857(arg0 - 1, arg1 + 1) + method1857(arg0 + 1, arg1 + 1);
        int var3 = method1857(arg0 - 1, arg1) + method1857(arg0 + 1, arg1) + method1857(arg0, arg1 - 1) + method1857(arg0, arg1 + 1);
        int var4 = method1857(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cf.w(IIB)I")
    public static final int method1857(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cw.m(III)I")
    public static final int method2072(int arg0, int arg1) {
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

    @ObfuscatedName("cf.x(III)I")
    public static final int method1853(int arg0, int arg1) {
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

    @ObfuscatedName("v.b(IIIB)I")
    public static final int method461(int arg0, int arg1, int arg2) {
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
