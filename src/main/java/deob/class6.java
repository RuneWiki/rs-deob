package deob;

@ObfuscatedName("r")
public final class class6 {

    @ObfuscatedName("r.t")
    public static int[][][] field101 = new int[4][105][105];

    @ObfuscatedName("r.i")
    public static byte[][][] field84 = new byte[4][104][104];

    @ObfuscatedName("r.g")
    public static int field85 = 99;

    @ObfuscatedName("r.c")
    public static final int[] field91 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("r.n")
    public static final int[] field92 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("r.q")
    public static final int[] field86 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("r.x")
    public static final int[] field94 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("r.v")
    public static final int[] field83 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("r.m")
    public static final int[] field96 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("r.w")
    public static int field97 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("r.e")
    public static int field98 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.t(IIIII)V")
    public static final void method2243(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field93[0][var5][var4] = 127;
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

    @ObfuscatedName("u.i([BIIII[Lds;I)V")
    public static final void method162(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class109[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1907[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class120 var9 = new class120(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2087(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("cp.g(Ldr;IIIIIIB)V")
    public static final void method2087(class120 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2334();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2334();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2334();
                }
            }
            return;
        }
        field84[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2334();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field101[0][arg2][arg3] = -method2233(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field101[arg1][arg2][arg3] = field101[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2334();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field101[0][arg2][arg3] = -var8 * 8;
                } else {
                    field101[arg1][arg2][arg3] = field101[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field88[arg1][arg2][arg3] = arg0.method2309();
                Statics.field87[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1082[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field84[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field2673[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("df.h(IIIIIILco;Lds;S)V")
    public static final void method2597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, class109 arg7) {
        if (client.field288 && (field84[0][arg1][arg2] & 0x2) == 0 && (field84[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field85) {
            field85 = arg0;
        }
        class41 var8 = class41.method948(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field924;
            var10 = var8.field955;
        } else {
            var9 = var8.field955;
            var10 = var8.field924;
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
        if (var8.field925 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field945 == 1) {
            var20 += 256;
        }
        if (var8.method759()) {
            class24.method565(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field288 || var8.field925 != 0 || var8.field932 == 1 || var8.field953) {
                class86 var21;
                if (var8.field928 == -1 && var8.field956 == null) {
                    var21 = var8.method756(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field928, true, (class86) null);
                }
                arg6.method1757(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field932 == 1 && arg7 != null) {
                    arg7.method2199(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class86 var44;
            if (var8.field928 == -1 && var8.field956 == null) {
                var44 = var8.method756(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            if (var44 != null && arg6.method1741(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field946) {
                int var45 = 15;
                if (var44 instanceof class106) {
                    var45 = ((class106) var44).method2109() / 4;
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
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2206(arg1, arg2, var9, var10, var8.field938);
            }
        } else if (arg5 >= 12) {
            class86 var22;
            if (var8.field928 == -1 && var8.field956 == null) {
                var22 = var8.method756(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1741(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1775[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2206(arg1, arg2, var9, var10, var8.field938);
            }
        } else if (arg5 == 0) {
            class86 var23;
            if (var8.field928 == -1 && var8.field956 == null) {
                var23 = var8.method756(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var23, (class86) null, field91[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field946) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field937) {
                    Statics.field1775[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field946) {
                    Statics.field93[arg0][arg1][arg2 + 1] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field937) {
                    Statics.field1775[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field946) {
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field937) {
                    Statics.field1775[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field946) {
                    Statics.field93[arg0][arg1][arg2] = 50;
                    Statics.field93[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field937) {
                    Statics.field1775[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2202(arg1, arg2, arg5, arg4, var8.field938);
            }
            if (var8.field939 != 16) {
                arg6.method1747(arg0, arg1, arg2, var8.field939);
            }
        } else if (arg5 == 1) {
            class86 var24;
            if (var8.field928 == -1 && var8.field956 == null) {
                var24 = var8.method756(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var24, (class86) null, field92[arg4], 0, var19, var20);
            if (var8.field946) {
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
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2202(arg1, arg2, arg5, arg4, var8.field938);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class86 var26;
            class86 var27;
            if (var8.field928 == -1 && var8.field956 == null) {
                var26 = var8.method756(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method756(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field928, true, (class86) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var26, var27, field91[arg4], field91[var25], var19, var20);
            if (var8.field937) {
                if (arg4 == 0) {
                    Statics.field1775[arg0][arg1][arg2] |= 0x249;
                    Statics.field1775[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1775[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1775[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1775[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1775[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1775[arg0][arg1][arg2] |= 0x492;
                    Statics.field1775[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2202(arg1, arg2, arg5, arg4, var8.field938);
            }
            if (var8.field939 != 16) {
                arg6.method1747(arg0, arg1, arg2, var8.field939);
            }
        } else if (arg5 == 3) {
            class86 var28;
            if (var8.field928 == -1 && var8.field956 == null) {
                var28 = var8.method756(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1899(arg0, arg1, arg2, var16, var28, (class86) null, field92[arg4], 0, var19, var20);
            if (var8.field946) {
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
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2202(arg1, arg2, arg5, arg4, var8.field938);
            }
        } else if (arg5 == 9) {
            class86 var29;
            if (var8.field928 == -1 && var8.field956 == null) {
                var29 = var8.method756(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1741(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field932 != 0 && arg7 != null) {
                arg7.method2206(arg1, arg2, var9, var10, var8.field938);
            }
            if (var8.field939 != 16) {
                arg6.method1747(arg0, arg1, arg2, var8.field939);
            }
        } else if (arg5 == 4) {
            class86 var30;
            if (var8.field928 == -1 && var8.field956 == null) {
                var30 = var8.method756(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1883(arg0, arg1, arg2, var16, var30, (class86) null, field91[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1851(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class41.method948(var32 >> 14 & 0x7FFF).field939;
            }
            class86 var33;
            if (var8.field928 == -1 && var8.field956 == null) {
                var33 = var8.method756(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1883(arg0, arg1, arg2, var16, var33, (class86) null, field91[arg4], 0, field86[arg4] * var31, field94[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1851(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method948(var35 >> 14 & 0x7FFF).field939 / 2;
            }
            class86 var36;
            if (var8.field928 == -1 && var8.field956 == null) {
                var36 = var8.method756(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1883(arg0, arg1, arg2, var16, var36, (class86) null, 256, arg4, field83[arg4] * var34, field96[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class86 var38;
            if (var8.field928 == -1 && var8.field956 == null) {
                var38 = var8.method756(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1883(arg0, arg1, arg2, var16, var38, (class86) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1851(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class41.method948(var40 >> 14 & 0x7FFF).field939 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class86 var42;
            class86 var43;
            if (var8.field928 == -1 && var8.field956 == null) {
                var42 = var8.method756(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method756(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field928, true, (class86) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field928, true, (class86) null);
            }
            arg6.method1883(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field83[arg4] * var39, field96[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("cg.z(IIII)I")
    public static int method1729(int arg0, int arg1, int arg2) {
        if ((field84[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field84[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dz.r(IIB)I")
    public static final int method2233(int arg0, int arg1) {
        int var2 = method2588(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2588(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2588(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("do.f(IIII)I")
    public static final int method2588(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method93(var3, var5);
        int var8 = method93(var3 + 1, var5);
        int var9 = method93(var3, var5 + 1);
        int var10 = method93(var3 + 1, var5 + 1);
        int var11 = method606(var7, var8, var4, arg2);
        int var12 = method606(var9, var10, var4, arg2);
        return method606(var11, var12, var6, arg2);
    }

    @ObfuscatedName("e.s(IIIII)I")
    public static final int method606(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class92.field1604[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("d.d(III)I")
    public static final int method93(int arg0, int arg1) {
        int var2 = method2599(arg0 - 1, arg1 - 1) + method2599(arg0 + 1, arg1 - 1) + method2599(arg0 - 1, arg1 + 1) + method2599(arg0 + 1, arg1 + 1);
        int var3 = method2599(arg0 - 1, arg1) + method2599(arg0 + 1, arg1) + method2599(arg0, arg1 - 1) + method2599(arg0, arg1 + 1);
        int var4 = method2599(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("df.l(IIB)I")
    public static final int method2599(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ak.y(IIS)I")
    public static final int method711(int arg0, int arg1) {
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

    @ObfuscatedName("dp.p(III)I")
    public static final int method2248(int arg0, int arg1) {
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

    @ObfuscatedName("v.k(IIII)I")
    public static final int method552(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ak.o(III)Z")
    public static final boolean method712(int arg0, int arg1) {
        class41 var2 = class41.method948(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method760(arg1);
    }
}
