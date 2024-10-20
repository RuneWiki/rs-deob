package deob;

@ObfuscatedName("s")
public final class class6 {

    @ObfuscatedName("s.i")
    public static int[][][] field97 = new int[4][105][105];

    @ObfuscatedName("s.v")
    public static byte[][][] field98 = new byte[4][104][104];

    @ObfuscatedName("s.f")
    public static int field79 = 99;

    @ObfuscatedName("s.l")
    public static final int[] field85 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("s.j")
    public static final int[] field86 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("s.m")
    public static final int[] field77 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("s.e")
    public static final int[] field88 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("s.u")
    public static final int[] field89 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("s.y")
    public static final int[] field90 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("s.t")
    public static int field91 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("s.q")
    public static int field94 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.i(IIIIB)V")
    public static final void method2614(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field82[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field97[0][var5][var4] = field97[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field97[0][var5][var4] = field97[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field97[0][var5][var4] = field97[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field97[0][var5][var4] = field97[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.v(Ldj;IIIIIII)V")
    public static final void method585(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2310();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2310();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2310();
                }
            }
            return;
        }
        field98[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2310();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field97[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = Statics.method1716(var10 + 45365, var11 + 91923, 4) - 128 + (Statics.method1716(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (Statics.method1716(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field97[arg1][arg2][arg3] = field97[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2310();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field97[0][arg2][arg3] = -var15 * 8;
                } else {
                    field97[arg1][arg2][arg3] = field97[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1446[arg1][arg2][arg3] = arg0.method2311();
                Statics.field1214[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field81[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field98[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field80[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("v.f([BIIB)Z")
    public static final boolean method9(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class119 var4 = new class119(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2323();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2323();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2310() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class41 var16 = class41.method1443(var5);
                        if (var13 != 22 || !client.field353 || var16.field955 != 0 || var16.field953 == 1 || var16.field936) {
                            if (!var16.method752()) {
                                client.field307++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2323();
                if (var9 == 0) {
                    break;
                }
                var4.method2310();
            }
        }
    }

    @ObfuscatedName("p.h(IIIIIILcb;Ldq;I)V")
    public static final void method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field353 && (field98[0][arg1][arg2] & 0x2) == 0 && (field98[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field79) {
            field79 = arg0;
        }
        class41 var8 = class41.method1443(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field952;
            var10 = var8.field944;
        } else {
            var9 = var8.field944;
            var10 = var8.field952;
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
        int[][] var15 = field97[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field955 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field941 == 1) {
            var20 += 256;
        }
        if (var8.method758()) {
            class24.method2100(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field353 || var8.field955 != 0 || var8.field953 == 1 || var8.field936) {
                class85 var21;
                if (var8.field959 == -1 && var8.field977 == null) {
                    var21 = var8.method753(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field959, true, (class85) null);
                }
                arg6.method1727(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field953 == 1 && arg7 != null) {
                    arg7.method2191(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var44;
            if (var8.field959 == -1 && var8.field977 == null) {
                var44 = var8.method753(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            if (var44 != null && arg6.method1738(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field976) {
                int var45 = 15;
                if (var44 instanceof class105) {
                    var45 = ((class105) var44).method2119() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field82[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field82[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2216(arg1, arg2, var9, var10, var8.field954);
            }
        } else if (arg5 >= 12) {
            class85 var22;
            if (var8.field959 == -1 && var8.field977 == null) {
                var22 = var8.method753(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1738(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field256[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2216(arg1, arg2, var9, var10, var8.field954);
            }
        } else if (arg5 == 0) {
            class85 var23;
            if (var8.field959 == -1 && var8.field977 == null) {
                var23 = var8.method753(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1736(arg0, arg1, arg2, var16, var23, (class85) null, field85[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field976) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field958) {
                    Statics.field256[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field976) {
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field958) {
                    Statics.field256[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field976) {
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field958) {
                    Statics.field256[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field976) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field958) {
                    Statics.field256[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2188(arg1, arg2, arg5, arg4, var8.field954);
            }
            if (var8.field960 != 16) {
                arg6.method1744(arg0, arg1, arg2, var8.field960);
            }
        } else if (arg5 == 1) {
            class85 var24;
            if (var8.field959 == -1 && var8.field977 == null) {
                var24 = var8.method753(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1736(arg0, arg1, arg2, var16, var24, (class85) null, field86[arg4], 0, var19, var20);
            if (var8.field976) {
                if (arg4 == 0) {
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2188(arg1, arg2, arg5, arg4, var8.field954);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class85 var26;
            class85 var27;
            if (var8.field959 == -1 && var8.field977 == null) {
                var26 = var8.method753(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method753(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field959, true, (class85) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1736(arg0, arg1, arg2, var16, var26, var27, field85[arg4], field85[var25], var19, var20);
            if (var8.field958) {
                if (arg4 == 0) {
                    Statics.field256[arg0][arg1][arg2] |= 0x249;
                    Statics.field256[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field256[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field256[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field256[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field256[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field256[arg0][arg1][arg2] |= 0x492;
                    Statics.field256[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2188(arg1, arg2, arg5, arg4, var8.field954);
            }
            if (var8.field960 != 16) {
                arg6.method1744(arg0, arg1, arg2, var8.field960);
            }
        } else if (arg5 == 3) {
            class85 var28;
            if (var8.field959 == -1 && var8.field977 == null) {
                var28 = var8.method753(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1736(arg0, arg1, arg2, var16, var28, (class85) null, field86[arg4], 0, var19, var20);
            if (var8.field976) {
                if (arg4 == 0) {
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2188(arg1, arg2, arg5, arg4, var8.field954);
            }
        } else if (arg5 == 9) {
            class85 var29;
            if (var8.field959 == -1 && var8.field977 == null) {
                var29 = var8.method753(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1738(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field953 != 0 && arg7 != null) {
                arg7.method2216(arg1, arg2, var9, var10, var8.field954);
            }
            if (var8.field960 != 16) {
                arg6.method1744(arg0, arg1, arg2, var8.field960);
            }
        } else if (arg5 == 4) {
            class85 var30;
            if (var8.field959 == -1 && var8.field977 == null) {
                var30 = var8.method753(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var30, (class85) null, field85[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1754(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class41.method1443(var32 >> 14 & 0x7FFF).field960;
            }
            class85 var33;
            if (var8.field959 == -1 && var8.field977 == null) {
                var33 = var8.method753(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var33, (class85) null, field85[arg4], 0, field77[arg4] * var31, field88[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1754(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method1443(var35 >> 14 & 0x7FFF).field960 / 2;
            }
            class85 var36;
            if (var8.field959 == -1 && var8.field977 == null) {
                var36 = var8.method753(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var36, (class85) null, 256, arg4, field89[arg4] * var34, field90[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class85 var38;
            if (var8.field959 == -1 && var8.field977 == null) {
                var38 = var8.method753(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var38, (class85) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1754(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class41.method1443(var40 >> 14 & 0x7FFF).field960 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class85 var42;
            class85 var43;
            if (var8.field959 == -1 && var8.field977 == null) {
                var42 = var8.method753(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method753(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field959, true, (class85) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field959, true, (class85) null);
            }
            arg6.method1737(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field89[arg4] * var39, field90[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("eh.a(IIIB)I")
    public static int method2739(int arg0, int arg1, int arg2) {
        if ((field98[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field98[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fo.p(III)I")
    public static final int method2921(int arg0, int arg1) {
        int var2 = method52(arg0 - 1, arg1 - 1) + method52(arg0 + 1, arg1 - 1) + method52(arg0 - 1, arg1 + 1) + method52(arg0 + 1, arg1 + 1);
        int var3 = method52(arg0 - 1, arg1) + method52(arg0 + 1, arg1) + method52(arg0, arg1 - 1) + method52(arg0, arg1 + 1);
        int var4 = method52(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("a.r(III)I")
    public static final int method52(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cv.k(III)I")
    public static final int method2097(int arg0, int arg1) {
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

    @ObfuscatedName("ax.d(III)I")
    public static final int method670(int arg0, int arg1) {
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

    @ObfuscatedName("ao.n(IIII)I")
    public static final int method972(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("eg.z(IIIIIIILcb;Ldq;I)V")
    public static final void method2692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class86 arg7, class108 arg8) {
        class41 var9 = class41.method1443(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field952;
            var11 = var9.field944;
        } else {
            var10 = var9.field944;
            var11 = var9.field952;
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
        int[][] var16 = field97[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field955 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field941 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class85 var22;
            if (var9.field959 == -1 && var9.field977 == null) {
                var22 = var9.method754(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1727(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field953 == 1) {
                arg8.method2191(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var45;
            if (var9.field959 == -1 && var9.field977 == null) {
                var45 = var9.method754(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            if (var45 != null) {
                arg7.method1738(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field953 != 0) {
                arg8.method2216(arg2, arg3, var10, var11, var9.field954);
            }
        } else if (arg6 >= 12) {
            class85 var23;
            if (var9.field959 == -1 && var9.field977 == null) {
                var23 = var9.method754(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1738(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field953 != 0) {
                arg8.method2216(arg2, arg3, var10, var11, var9.field954);
            }
        } else if (arg6 == 0) {
            class85 var24;
            if (var9.field959 == -1 && var9.field977 == null) {
                var24 = var9.method754(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1736(arg0, arg2, arg3, var17, var24, (class85) null, field85[arg5], 0, var20, var21);
            if (var9.field953 != 0) {
                arg8.method2188(arg2, arg3, arg6, arg5, var9.field954);
            }
        } else if (arg6 == 1) {
            class85 var25;
            if (var9.field959 == -1 && var9.field977 == null) {
                var25 = var9.method754(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1736(arg0, arg2, arg3, var17, var25, (class85) null, field86[arg5], 0, var20, var21);
            if (var9.field953 != 0) {
                arg8.method2188(arg2, arg3, arg6, arg5, var9.field954);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class85 var27;
            class85 var28;
            if (var9.field959 == -1 && var9.field977 == null) {
                var27 = var9.method754(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method754(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field959, true, (class85) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1736(arg0, arg2, arg3, var17, var27, var28, field85[arg5], field85[var26], var20, var21);
            if (var9.field953 != 0) {
                arg8.method2188(arg2, arg3, arg6, arg5, var9.field954);
            }
        } else if (arg6 == 3) {
            class85 var29;
            if (var9.field959 == -1 && var9.field977 == null) {
                var29 = var9.method754(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1736(arg0, arg2, arg3, var17, var29, (class85) null, field86[arg5], 0, var20, var21);
            if (var9.field953 != 0) {
                arg8.method2188(arg2, arg3, arg6, arg5, var9.field954);
            }
        } else if (arg6 == 9) {
            class85 var30;
            if (var9.field959 == -1 && var9.field977 == null) {
                var30 = var9.method754(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1738(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field953 != 0) {
                arg8.method2216(arg2, arg3, var10, var11, var9.field954);
            }
        } else if (arg6 == 4) {
            class85 var31;
            if (var9.field959 == -1 && var9.field977 == null) {
                var31 = var9.method754(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var31, (class85) null, field85[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1754(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class41.method1443(var33 >> 14 & 0x7FFF).field960;
            }
            class85 var34;
            if (var9.field959 == -1 && var9.field977 == null) {
                var34 = var9.method754(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var34, (class85) null, field85[arg5], 0, field77[arg5] * var32, field88[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1754(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class41.method1443(var36 >> 14 & 0x7FFF).field960 / 2;
            }
            class85 var37;
            if (var9.field959 == -1 && var9.field977 == null) {
                var37 = var9.method754(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var37, (class85) null, 256, arg5, field89[arg5] * var35, field90[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class85 var39;
            if (var9.field959 == -1 && var9.field977 == null) {
                var39 = var9.method754(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var39, (class85) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1754(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class41.method1443(var41 >> 14 & 0x7FFF).field960 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class85 var43;
            class85 var44;
            if (var9.field959 == -1 && var9.field977 == null) {
                var43 = var9.method754(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method754(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field959, true, (class85) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field959, true, (class85) null);
            }
            arg7.method1737(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field89[arg5] * var40, field90[arg5] * var40, var20, var21);
        }
    }
}
