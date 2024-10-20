package deob;

@ObfuscatedName("j")
public final class class6 {

    @ObfuscatedName("j.m")
    public static int[][][] field81 = new int[4][105][105];

    @ObfuscatedName("j.l")
    public static byte[][][] field73 = new byte[4][104][104];

    @ObfuscatedName("j.y")
    public static int field74 = 99;

    @ObfuscatedName("j.b")
    public static final int[] field90 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("j.f")
    public static final int[] field87 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("j.d")
    public static final int[] field82 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("j.q")
    public static final int[] field80 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("j.o")
    public static final int[] field84 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("j.w")
    public static final int[] field85 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("j.z")
    public static int field86 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("j.t")
    public static int field72 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.m(S)V")
    public static void method3289() {
        field74 = 99;
        Statics.field1061 = new byte[4][104][104];
        Statics.field59 = new byte[4][104][104];
        Statics.field2144 = new byte[4][104][104];
        Statics.field2632 = new byte[4][104][104];
        Statics.field1051 = new int[4][105][105];
        Statics.field2012 = new byte[4][105][105];
        Statics.field75 = new int[105][105];
        Statics.field76 = new int[104];
        Statics.field77 = new int[104];
        Statics.field249 = new int[104];
        Statics.field1027 = new int[104];
        Statics.field1044 = new int[104];
    }

    @ObfuscatedName("fj.l(I)V")
    public static void method3002() {
        Statics.field1061 = (byte[][][]) null;
        Statics.field59 = (byte[][][]) null;
        Statics.field2144 = (byte[][][]) null;
        Statics.field2632 = (byte[][][]) null;
        Statics.field1051 = (int[][][]) null;
        Statics.field2012 = (byte[][][]) null;
        Statics.field75 = (int[][]) null;
        Statics.field76 = null;
        Statics.field77 = null;
        Statics.field249 = null;
        Statics.field1027 = null;
        Statics.field1044 = null;
    }

    @ObfuscatedName("do.y(IIIII)V")
    public static final void method2677(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2012[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field81[0][var5][var4] = field81[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field81[0][var5][var4] = field81[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field81[0][var5][var4] = field81[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field81[0][var5][var4] = field81[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.u([BIIII[Ldl;I)V")
    public static final void method114(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class108[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field1852[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class119 var9 = new class119(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method280(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ej.k(IIII)V")
    public static final void method2747(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field81[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field81[arg0][arg1][arg2 + var5] = field81[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field81[arg0][arg1 + var6][arg2] = field81[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field81[arg0][arg1 - 1][arg2] != 0) {
            field81[arg0][arg1][arg2] = field81[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field81[arg0][arg1][arg2 - 1] != 0) {
            field81[arg0][arg1][arg2] = field81[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field81[arg0][arg1 - 1][arg2 - 1] != 0) {
            field81[arg0][arg1][arg2] = field81[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("client.j(Ldx;IIIIIII)V")
    public static final void method280(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2562();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2562();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2562();
                }
            }
            return;
        }
        field73[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2562();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field81[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method3298(var10 + 45365, var11 + 91923, 4) - 128 + (method3298(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method3298(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field81[arg1][arg2][arg3] = field81[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2562();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field81[0][arg2][arg3] = -var15 * 8;
                } else {
                    field81[arg1][arg2][arg3] = field81[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field59[arg1][arg2][arg3] = arg0.method2382();
                Statics.field2144[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2632[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field73[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1061[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("client.x(IIIIIILch;Ldl;I)V")
    public static final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field259 && (field73[0][arg1][arg2] & 0x2) == 0 && (field73[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field74) {
            field74 = arg0;
        }
        class41 var8 = class41.method85(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field898;
            var10 = var8.field930;
        } else {
            var9 = var8.field930;
            var10 = var8.field898;
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
        int[][] var15 = field81[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field901 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field922 == 1) {
            var20 += 256;
        }
        if (var8.method846()) {
            class24.method679(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field259 || var8.field901 != 0 || var8.field899 == 1 || var8.field920) {
                class85 var21;
                if (var8.field889 == -1 && var8.field923 == null) {
                    var21 = var8.method812(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field889, true, (class85) null);
                }
                arg6.method1921(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field899 == 1 && arg7 != null) {
                    arg7.method2272(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var44;
            if (var8.field889 == -1 && var8.field923 == null) {
                var44 = var8.method812(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            if (var44 != null && arg6.method1831(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field913) {
                int var45 = 15;
                if (var44 instanceof class105) {
                    var45 = ((class105) var44).method2190() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field2012[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field2012[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field899 != 0 && arg7 != null) {
                arg7.method2282(arg1, arg2, var9, var10, var8.field900);
            }
        } else if (arg5 >= 12) {
            class85 var22;
            if (var8.field889 == -1 && var8.field923 == null) {
                var22 = var8.method812(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1831(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1051[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field899 != 0 && arg7 != null) {
                arg7.method2282(arg1, arg2, var9, var10, var8.field900);
            }
        } else if (arg5 == 0) {
            class85 var23;
            if (var8.field889 == -1 && var8.field923 == null) {
                var23 = var8.method812(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, var23, (class85) null, field90[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field913) {
                    Statics.field2012[arg0][arg1][arg2] = 50;
                    Statics.field2012[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field907) {
                    Statics.field1051[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field913) {
                    Statics.field2012[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2012[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field907) {
                    Statics.field1051[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field913) {
                    Statics.field2012[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2012[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field907) {
                    Statics.field1051[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field913) {
                    Statics.field2012[arg0][arg1][arg2] = 50;
                    Statics.field2012[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field907) {
                    Statics.field1051[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field899 != 0 && arg7 != null) {
                arg7.method2269(arg1, arg2, arg5, arg4, var8.field900);
            }
            if (var8.field906 != 16) {
                arg6.method1837(arg0, arg1, arg2, var8.field906);
            }
        } else if (arg5 == 1) {
            class85 var24;
            if (var8.field889 == -1 && var8.field923 == null) {
                var24 = var8.method812(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, var24, (class85) null, field87[arg4], 0, var19, var20);
            if (var8.field913) {
                if (arg4 == 0) {
                    Statics.field2012[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2012[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2012[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2012[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field899 != 0 && arg7 != null) {
                arg7.method2269(arg1, arg2, arg5, arg4, var8.field900);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class85 var26;
            class85 var27;
            if (var8.field889 == -1 && var8.field923 == null) {
                var26 = var8.method812(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method812(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field889, true, (class85) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, var26, var27, field90[arg4], field90[var25], var19, var20);
            if (var8.field907) {
                if (arg4 == 0) {
                    Statics.field1051[arg0][arg1][arg2] |= 0x249;
                    Statics.field1051[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1051[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1051[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1051[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1051[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1051[arg0][arg1][arg2] |= 0x492;
                    Statics.field1051[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field899 != 0 && arg7 != null) {
                arg7.method2269(arg1, arg2, arg5, arg4, var8.field900);
            }
            if (var8.field906 != 16) {
                arg6.method1837(arg0, arg1, arg2, var8.field906);
            }
        } else if (arg5 == 3) {
            class85 var28;
            if (var8.field889 == -1 && var8.field923 == null) {
                var28 = var8.method812(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1926(arg0, arg1, arg2, var16, var28, (class85) null, field87[arg4], 0, var19, var20);
            if (var8.field913) {
                if (arg4 == 0) {
                    Statics.field2012[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2012[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2012[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2012[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field899 != 0 && arg7 != null) {
                arg7.method2269(arg1, arg2, arg5, arg4, var8.field900);
            }
        } else if (arg5 == 9) {
            class85 var29;
            if (var8.field889 == -1 && var8.field923 == null) {
                var29 = var8.method812(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1831(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field899 != 0 && arg7 != null) {
                arg7.method2282(arg1, arg2, var9, var10, var8.field900);
            }
            if (var8.field906 != 16) {
                arg6.method1837(arg0, arg1, arg2, var8.field906);
            }
        } else if (arg5 == 4) {
            class85 var30;
            if (var8.field889 == -1 && var8.field923 == null) {
                var30 = var8.method812(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1830(arg0, arg1, arg2, var16, var30, (class85) null, field90[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1856(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class41.method85(var32 >> 14 & 0x7FFF).field906;
            }
            class85 var33;
            if (var8.field889 == -1 && var8.field923 == null) {
                var33 = var8.method812(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1830(arg0, arg1, arg2, var16, var33, (class85) null, field90[arg4], 0, field82[arg4] * var31, field80[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1856(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method85(var35 >> 14 & 0x7FFF).field906 / 2;
            }
            class85 var36;
            if (var8.field889 == -1 && var8.field923 == null) {
                var36 = var8.method812(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1830(arg0, arg1, arg2, var16, var36, (class85) null, 256, arg4, field84[arg4] * var34, field85[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class85 var38;
            if (var8.field889 == -1 && var8.field923 == null) {
                var38 = var8.method812(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1830(arg0, arg1, arg2, var16, var38, (class85) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1856(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class41.method85(var40 >> 14 & 0x7FFF).field906 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class85 var42;
            class85 var43;
            if (var8.field889 == -1 && var8.field923 == null) {
                var42 = var8.method812(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method812(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field889, true, (class85) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field889, true, (class85) null);
            }
            arg6.method1830(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field84[arg4] * var39, field85[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("fu.g(IIIS)I")
    public static final int method3298(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method97(var3, var5);
        int var8 = method97(var3 + 1, var5);
        int var9 = method97(var3, var5 + 1);
        int var10 = method97(var3 + 1, var5 + 1);
        int var11 = 65536 - class91.field1536[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class91.field1536[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class91.field1536[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("i.e(III)I")
    public static final int method97(int arg0, int arg1) {
        int var2 = method98(arg0 - 1, arg1 - 1) + method98(arg0 + 1, arg1 - 1) + method98(arg0 - 1, arg1 + 1) + method98(arg0 + 1, arg1 + 1);
        int var3 = method98(arg0 - 1, arg1) + method98(arg0 + 1, arg1) + method98(arg0, arg1 - 1) + method98(arg0, arg1 + 1);
        int var4 = method98(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("i.p(III)I")
    public static final int method98(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dn.a(III)I")
    public static final int method2319(int arg0, int arg1) {
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

    @ObfuscatedName("z.v(IIB)I")
    public static final int method619(int arg0, int arg1) {
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

    @ObfuscatedName("di.c(IIII)I")
    public static final int method2696(int arg0, int arg1, int arg2) {
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
