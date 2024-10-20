package deob;

@ObfuscatedName("g")
public final class class9 {

    @ObfuscatedName("g.z")
    public static int[][][] field121 = new int[4][105][105];

    @ObfuscatedName("g.h")
    public static byte[][][] field124 = new byte[4][104][104];

    @ObfuscatedName("g.c")
    public static int field122 = 99;

    @ObfuscatedName("g.q")
    public static final int[] field126 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("g.y")
    public static final int[] field129 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("g.a")
    public static final int[] field125 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("g.r")
    public static final int[] field131 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("g.x")
    public static final int[] field132 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("g.w")
    public static final int[] field133 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("g.j")
    public static int field137 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("g.s")
    public static int field134 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.z(I)V")
    public static void method1503() {
        Statics.field128 = (byte[][][]) null;
        Statics.field1802 = (byte[][][]) null;
        Statics.field130 = (byte[][][]) null;
        Statics.field1327 = (byte[][][]) null;
        Statics.field1030 = (int[][][]) null;
        Statics.field2277 = (byte[][][]) null;
        Statics.field2418 = (int[][]) null;
        Statics.field951 = null;
        Statics.field135 = null;
        Statics.field144 = null;
        Statics.field27 = null;
        Statics.field127 = null;
    }

    @ObfuscatedName("ec.h(IIIIB)V")
    public static final void method2668(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2277[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field121[0][var5][var4] = field121[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field121[0][var5][var4] = field121[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field121[0][var5][var4] = field121[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field121[0][var5][var4] = field121[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("dr.c([BIIII[Lfe;B)V")
    public static final void method2210(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class162[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2672[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class126 var9 = new class126(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1587(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("cu.p(Ldq;IIIIIII)V")
    public static final void method1587(class126 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2450();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2450();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2450();
                }
            }
            return;
        }
        field124[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2450();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field121[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method55(var10 + 45365, var11 + 91923, 4) - 128 + (method55(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method55(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field121[arg1][arg2][arg3] = field121[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2450();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field121[0][arg2][arg3] = -var15 * 8;
                } else {
                    field121[arg1][arg2][arg3] = field121[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1802[arg1][arg2][arg3] = arg0.method2451();
                Statics.field130[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1327[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field124[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field128[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("r.i([BIII)Z")
    public static final boolean method216(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class126 var4 = new class126(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2463();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2463();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2450() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class31 var16 = class31.method2662(var5);
                        if (var13 != 22 || !client.field475 || var16.field836 != 0 || var16.field834 == 1 || var16.field856) {
                            if (!var16.method652()) {
                                client.field527++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2463();
                if (var9 == 0) {
                    break;
                }
                var4.method2450();
            }
        }
    }

    @ObfuscatedName("x.v(IIIIIILch;Lfe;B)V")
    public static final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class94 arg6, class162 arg7) {
        if (client.field475 && (field124[0][arg1][arg2] & 0x2) == 0) {
            if ((field124[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1539(arg0, arg1, arg2) != client.field524) {
                return;
            }
        }
        if (arg0 < field122) {
            field122 = arg0;
        }
        class31 var8 = class31.method2662(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field829;
            var10 = var8.field832;
        } else {
            var9 = var8.field832;
            var10 = var8.field829;
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
        int[][] var15 = field121[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field836 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field858 == 1) {
            var20 += 256;
        }
        if (var8.method670()) {
            class7.method560(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field475 || var8.field836 != 0 || var8.field834 == 1 || var8.field856) {
                class93 var21;
                if (var8.field835 == -1 && var8.field817 == null) {
                    var21 = var8.method654(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field835, true, (class93) null);
                }
                arg6.method1842(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field834 == 1 && arg7 != null) {
                    arg7.method3188(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class93 var44;
            if (var8.field835 == -1 && var8.field817 == null) {
                var44 = var8.method654(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            if (var44 != null && arg6.method1918(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field848) {
                int var45 = 15;
                if (var44 instanceof class111) {
                    var45 = ((class111) var44).method2221() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field2277[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field2277[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field834 != 0 && arg7 != null) {
                arg7.method3187(arg1, arg2, var9, var10, var8.field855);
            }
        } else if (arg5 >= 12) {
            class93 var22;
            if (var8.field835 == -1 && var8.field817 == null) {
                var22 = var8.method654(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1918(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1030[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field834 != 0 && arg7 != null) {
                arg7.method3187(arg1, arg2, var9, var10, var8.field855);
            }
        } else if (arg5 == 0) {
            class93 var23;
            if (var8.field835 == -1 && var8.field817 == null) {
                var23 = var8.method654(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1844(arg0, arg1, arg2, var16, var23, (class93) null, field126[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field848) {
                    Statics.field2277[arg0][arg1][arg2] = 50;
                    Statics.field2277[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field839) {
                    Statics.field1030[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field848) {
                    Statics.field2277[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2277[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field839) {
                    Statics.field1030[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field848) {
                    Statics.field2277[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2277[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field839) {
                    Statics.field1030[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field848) {
                    Statics.field2277[arg0][arg1][arg2] = 50;
                    Statics.field2277[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field839) {
                    Statics.field1030[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field834 != 0 && arg7 != null) {
                arg7.method3201(arg1, arg2, arg5, arg4, var8.field855);
            }
            if (var8.field824 != 16) {
                arg6.method1852(arg0, arg1, arg2, var8.field824);
            }
        } else if (arg5 == 1) {
            class93 var24;
            if (var8.field835 == -1 && var8.field817 == null) {
                var24 = var8.method654(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1844(arg0, arg1, arg2, var16, var24, (class93) null, field129[arg4], 0, var19, var20);
            if (var8.field848) {
                if (arg4 == 0) {
                    Statics.field2277[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2277[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2277[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2277[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field834 != 0 && arg7 != null) {
                arg7.method3201(arg1, arg2, arg5, arg4, var8.field855);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class93 var26;
            class93 var27;
            if (var8.field835 == -1 && var8.field817 == null) {
                var26 = var8.method654(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method654(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field835, true, (class93) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1844(arg0, arg1, arg2, var16, var26, var27, field126[arg4], field126[var25], var19, var20);
            if (var8.field839) {
                if (arg4 == 0) {
                    Statics.field1030[arg0][arg1][arg2] |= 0x249;
                    Statics.field1030[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1030[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1030[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1030[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1030[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1030[arg0][arg1][arg2] |= 0x492;
                    Statics.field1030[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field834 != 0 && arg7 != null) {
                arg7.method3201(arg1, arg2, arg5, arg4, var8.field855);
            }
            if (var8.field824 != 16) {
                arg6.method1852(arg0, arg1, arg2, var8.field824);
            }
        } else if (arg5 == 3) {
            class93 var28;
            if (var8.field835 == -1 && var8.field817 == null) {
                var28 = var8.method654(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1844(arg0, arg1, arg2, var16, var28, (class93) null, field129[arg4], 0, var19, var20);
            if (var8.field848) {
                if (arg4 == 0) {
                    Statics.field2277[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2277[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2277[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2277[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field834 != 0 && arg7 != null) {
                arg7.method3201(arg1, arg2, arg5, arg4, var8.field855);
            }
        } else if (arg5 == 9) {
            class93 var29;
            if (var8.field835 == -1 && var8.field817 == null) {
                var29 = var8.method654(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1918(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field834 != 0 && arg7 != null) {
                arg7.method3187(arg1, arg2, var9, var10, var8.field855);
            }
            if (var8.field824 != 16) {
                arg6.method1852(arg0, arg1, arg2, var8.field824);
            }
        } else if (arg5 == 4) {
            class93 var30;
            if (var8.field835 == -1 && var8.field817 == null) {
                var30 = var8.method654(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1845(arg0, arg1, arg2, var16, var30, (class93) null, field126[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1862(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class31.method2662(var32 >> 14 & 0x7FFF).field824;
            }
            class93 var33;
            if (var8.field835 == -1 && var8.field817 == null) {
                var33 = var8.method654(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1845(arg0, arg1, arg2, var16, var33, (class93) null, field126[arg4], 0, field125[arg4] * var31, field131[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1862(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class31.method2662(var35 >> 14 & 0x7FFF).field824 / 2;
            }
            class93 var36;
            if (var8.field835 == -1 && var8.field817 == null) {
                var36 = var8.method654(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1845(arg0, arg1, arg2, var16, var36, (class93) null, 256, arg4, field132[arg4] * var34, field133[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class93 var38;
            if (var8.field835 == -1 && var8.field817 == null) {
                var38 = var8.method654(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1845(arg0, arg1, arg2, var16, var38, (class93) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1862(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class31.method2662(var40 >> 14 & 0x7FFF).field824 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class93 var42;
            class93 var43;
            if (var8.field835 == -1 && var8.field817 == null) {
                var42 = var8.method654(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method654(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field835, true, (class93) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field835, true, (class93) null);
            }
            arg6.method1845(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field132[arg4] * var39, field133[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("bq.l(IIIB)I")
    public static int method1539(int arg0, int arg1, int arg2) {
        if ((field124[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field124[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("l.m(IIII)I")
    public static final int method55(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1297(var3, var5);
        int var8 = method1297(var3 + 1, var5);
        int var9 = method1297(var3, var5 + 1);
        int var10 = method1297(var3 + 1, var5 + 1);
        int var11 = 65536 - class103.field1746[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class103.field1746[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class103.field1746[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("bl.g(IIB)I")
    public static final int method1297(int arg0, int arg1) {
        int var2 = method162(arg0 - 1, arg1 - 1) + method162(arg0 + 1, arg1 - 1) + method162(arg0 - 1, arg1 + 1) + method162(arg0 + 1, arg1 + 1);
        int var3 = method162(arg0 - 1, arg1) + method162(arg0 + 1, arg1) + method162(arg0, arg1 - 1) + method162(arg0, arg1 + 1);
        int var4 = method162(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("n.t(IIB)I")
    public static final int method162(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ca.o(III)I")
    public static final int method2172(int arg0, int arg1) {
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

    @ObfuscatedName("d.b(III)I")
    public static final int method128(int arg0, int arg1) {
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

    @ObfuscatedName("e.d(IIII)I")
    public static final int method146(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("am.k(IIB)Z")
    public static final boolean method785(int arg0, int arg1) {
        class31 var2 = class31.method2662(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method662(arg1);
    }

    @ObfuscatedName("i.f(IIIIIIILch;Lfe;I)V")
    public static final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class94 arg7, class162 arg8) {
        class31 var9 = class31.method2662(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field829;
            var11 = var9.field832;
        } else {
            var10 = var9.field832;
            var11 = var9.field829;
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
        int[][] var16 = field121[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field836 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field858 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class93 var22;
            if (var9.field835 == -1 && var9.field817 == null) {
                var22 = var9.method674(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1842(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field834 == 1) {
                arg8.method3188(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class93 var45;
            if (var9.field835 == -1 && var9.field817 == null) {
                var45 = var9.method674(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            if (var45 != null) {
                arg7.method1918(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field834 != 0) {
                arg8.method3187(arg2, arg3, var10, var11, var9.field855);
            }
        } else if (arg6 >= 12) {
            class93 var23;
            if (var9.field835 == -1 && var9.field817 == null) {
                var23 = var9.method674(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1918(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field834 != 0) {
                arg8.method3187(arg2, arg3, var10, var11, var9.field855);
            }
        } else if (arg6 == 0) {
            class93 var24;
            if (var9.field835 == -1 && var9.field817 == null) {
                var24 = var9.method674(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1844(arg0, arg2, arg3, var17, var24, (class93) null, field126[arg5], 0, var20, var21);
            if (var9.field834 != 0) {
                arg8.method3201(arg2, arg3, arg6, arg5, var9.field855);
            }
        } else if (arg6 == 1) {
            class93 var25;
            if (var9.field835 == -1 && var9.field817 == null) {
                var25 = var9.method674(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1844(arg0, arg2, arg3, var17, var25, (class93) null, field129[arg5], 0, var20, var21);
            if (var9.field834 != 0) {
                arg8.method3201(arg2, arg3, arg6, arg5, var9.field855);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class93 var27;
            class93 var28;
            if (var9.field835 == -1 && var9.field817 == null) {
                var27 = var9.method674(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method674(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field835, true, (class93) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1844(arg0, arg2, arg3, var17, var27, var28, field126[arg5], field126[var26], var20, var21);
            if (var9.field834 != 0) {
                arg8.method3201(arg2, arg3, arg6, arg5, var9.field855);
            }
        } else if (arg6 == 3) {
            class93 var29;
            if (var9.field835 == -1 && var9.field817 == null) {
                var29 = var9.method674(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1844(arg0, arg2, arg3, var17, var29, (class93) null, field129[arg5], 0, var20, var21);
            if (var9.field834 != 0) {
                arg8.method3201(arg2, arg3, arg6, arg5, var9.field855);
            }
        } else if (arg6 == 9) {
            class93 var30;
            if (var9.field835 == -1 && var9.field817 == null) {
                var30 = var9.method674(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1918(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field834 != 0) {
                arg8.method3187(arg2, arg3, var10, var11, var9.field855);
            }
        } else if (arg6 == 4) {
            class93 var31;
            if (var9.field835 == -1 && var9.field817 == null) {
                var31 = var9.method674(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1845(arg0, arg2, arg3, var17, var31, (class93) null, field126[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1862(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class31.method2662(var33 >> 14 & 0x7FFF).field824;
            }
            class93 var34;
            if (var9.field835 == -1 && var9.field817 == null) {
                var34 = var9.method674(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1845(arg0, arg2, arg3, var17, var34, (class93) null, field126[arg5], 0, field125[arg5] * var32, field131[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1862(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class31.method2662(var36 >> 14 & 0x7FFF).field824 / 2;
            }
            class93 var37;
            if (var9.field835 == -1 && var9.field817 == null) {
                var37 = var9.method674(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1845(arg0, arg2, arg3, var17, var37, (class93) null, 256, arg5, field132[arg5] * var35, field133[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class93 var39;
            if (var9.field835 == -1 && var9.field817 == null) {
                var39 = var9.method674(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1845(arg0, arg2, arg3, var17, var39, (class93) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1862(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class31.method2662(var41 >> 14 & 0x7FFF).field824 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class93 var43;
            class93 var44;
            if (var9.field835 == -1 && var9.field817 == null) {
                var43 = var9.method674(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method674(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field835, true, (class93) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field835, true, (class93) null);
            }
            arg7.method1845(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field132[arg5] * var40, field133[arg5] * var40, var20, var21);
        }
    }
}
