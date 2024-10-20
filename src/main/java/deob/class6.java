package deob;

@ObfuscatedName("s")
public final class class6 {

    @ObfuscatedName("s.l")
    public static int[][][] field86 = new int[4][105][105];

    @ObfuscatedName("s.g")
    public static byte[][][] field81 = new byte[4][104][104];

    @ObfuscatedName("s.r")
    public static int field82 = 99;

    @ObfuscatedName("s.i")
    public static final int[] field91 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("s.v")
    public static final int[] field92 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("s.j")
    public static final int[] field93 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("s.x")
    public static final int[] field99 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("s.t")
    public static final int[] field95 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("s.y")
    public static final int[] field94 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("s.a")
    public static int field85 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("s.c")
    public static int field98 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.l(I)V")
    public static void method746() {
        field82 = 99;
        Statics.field83 = new byte[4][104][104];
        Statics.field1423 = new byte[4][104][104];
        Statics.field89 = new byte[4][104][104];
        Statics.field87 = new byte[4][104][104];
        Statics.field1705 = new int[4][105][105];
        Statics.field3276 = new byte[4][105][105];
        Statics.field208 = new int[105][105];
        Statics.field84 = new int[104];
        Statics.field88 = new int[104];
        Statics.field97 = new int[104];
        Statics.field810 = new int[104];
        Statics.field3226 = new int[104];
    }

    @ObfuscatedName("ee.g(I)V")
    public static void method3080() {
        Statics.field83 = (byte[][][]) null;
        Statics.field1423 = (byte[][][]) null;
        Statics.field89 = (byte[][][]) null;
        Statics.field87 = (byte[][][]) null;
        Statics.field1705 = (int[][][]) null;
        Statics.field3276 = (byte[][][]) null;
        Statics.field208 = (int[][]) null;
        Statics.field84 = null;
        Statics.field88 = null;
        Statics.field97 = null;
        Statics.field810 = null;
        Statics.field3226 = null;
    }

    @ObfuscatedName("db.r(IIIIB)V")
    public static final void method2406(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field3276[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field86[0][var5][var4] = field86[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field86[0][var5][var4] = field86[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field86[0][var5][var4] = field86[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field86[0][var5][var4] = field86[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.e([BIIIIIII[Ldo;I)V")
    public static final void method6(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class112[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1970[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class123 var11 = new class123(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class181.method1009(var13 & 0x7, var14 & 0x7, arg7);
                        int var19 = var13 & 0x7;
                        int var20 = var14 & 0x7;
                        int var22 = arg7 & 0x3;
                        int var23;
                        if (var22 == 0) {
                            var23 = var20;
                        } else if (var22 == 1) {
                            var23 = 7 - var19;
                        } else if (var22 == 2) {
                            var23 = 7 - var20;
                        } else {
                            var23 = var19;
                        }
                        method2139(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method2139(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cn.h(IIII)V")
    public static final void method2143(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field86[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field86[arg0][arg1][arg2 + var5] = field86[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field86[arg0][arg1 + var6][arg2] = field86[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field86[arg0][arg1 - 1][arg2] != 0) {
            field86[arg0][arg1][arg2] = field86[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field86[arg0][arg1][arg2 - 1] != 0) {
            field86[arg0][arg1][arg2] = field86[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field86[arg0][arg1 - 1][arg2 - 1] != 0) {
            field86[arg0][arg1][arg2] = field86[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cx.s(Ldc;IIIIIII)V")
    public static final void method2139(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method2490();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method2490();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method2490();
                }
            }
            return;
        }
        field81[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2490();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field86[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2972(var10 + 45365, var11 + 91923, 4) - 128 + (method2972(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2972(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field86[arg1][arg2][arg3] = field86[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method2490();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field86[0][arg2][arg3] = -var15 * 8;
                } else {
                    field86[arg1][arg2][arg3] = field86[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1423[arg1][arg2][arg3] = arg0.method2491();
                Statics.field89[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field87[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field81[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field83[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("eh.k([BIIB)Z")
    public static final boolean method2962(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class123 var4 = new class123(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2503();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2503();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2490() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class43 var16 = class43.method3115(var5);
                        if (var13 != 22 || !client.field302 || var16.field945 != 0 || var16.field999 == 1 || var16.field984) {
                            if (!var16.method832()) {
                                client.field494++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2503();
                if (var9 == 0) {
                    break;
                }
                var4.method2490();
            }
        }
    }

    @ObfuscatedName("dg.u([BIIIIIIILcs;[Ldo;S)V")
    public static final void method2264(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class90 arg8, class112[] arg9) {
        class123 var10 = new class123(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2503();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2503();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2490();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class43 var21 = class43.method3115(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field961;
                    int var27 = var21.field971;
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
                    int var36 = var21.field961;
                    int var37 = var21.field971;
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
                        if ((field81[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class112 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method3389(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.n(IIIIIILcs;Ldo;I)V")
    public static final void method3389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, class112 arg7) {
        if (client.field302 && (field81[0][arg1][arg2] & 0x2) == 0 && (field81[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field82) {
            field82 = arg0;
        }
        class43 var8 = class43.method3115(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field971;
            var10 = var8.field961;
        } else {
            var9 = var8.field961;
            var10 = var8.field971;
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
        int[][] var15 = field86[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field945 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field986 == 1) {
            var20 += 256;
        }
        if (var8.method835()) {
            class25.method2353(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field302 || var8.field945 != 0 || var8.field999 == 1 || var8.field984) {
                class89 var21;
                if (var8.field969 == -1 && var8.field987 == null) {
                    var21 = var8.method826(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field969, true, (class89) null);
                }
                arg6.method1930(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field999 == 1 && arg7 != null) {
                    arg7.method2374(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class89 var44;
            if (var8.field969 == -1 && var8.field987 == null) {
                var44 = var8.method826(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            if (var44 != null && arg6.method1889(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field977) {
                int var45 = 15;
                if (var44 instanceof class109) {
                    var45 = ((class109) var44).method2323() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field3276[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field3276[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field999 != 0 && arg7 != null) {
                arg7.method2367(arg1, arg2, var9, var10, var8.field962);
            }
        } else if (arg5 >= 12) {
            class89 var22;
            if (var8.field969 == -1 && var8.field987 == null) {
                var22 = var8.method826(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1889(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1705[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field999 != 0 && arg7 != null) {
                arg7.method2367(arg1, arg2, var9, var10, var8.field962);
            }
        } else if (arg5 == 0) {
            class89 var23;
            if (var8.field969 == -1 && var8.field987 == null) {
                var23 = var8.method826(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var23, (class89) null, field91[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field977) {
                    Statics.field3276[arg0][arg1][arg2] = 50;
                    Statics.field3276[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field954) {
                    Statics.field1705[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field977) {
                    Statics.field3276[arg0][arg1][arg2 + 1] = 50;
                    Statics.field3276[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field954) {
                    Statics.field1705[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field977) {
                    Statics.field3276[arg0][arg1 + 1][arg2] = 50;
                    Statics.field3276[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field954) {
                    Statics.field1705[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field977) {
                    Statics.field3276[arg0][arg1][arg2] = 50;
                    Statics.field3276[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field954) {
                    Statics.field1705[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field999 != 0 && arg7 != null) {
                arg7.method2378(arg1, arg2, arg5, arg4, var8.field962);
            }
            if (var8.field970 != 16) {
                arg6.method2014(arg0, arg1, arg2, var8.field970);
            }
        } else if (arg5 == 1) {
            class89 var24;
            if (var8.field969 == -1 && var8.field987 == null) {
                var24 = var8.method826(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var24, (class89) null, field92[arg4], 0, var19, var20);
            if (var8.field977) {
                if (arg4 == 0) {
                    Statics.field3276[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3276[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3276[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3276[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field999 != 0 && arg7 != null) {
                arg7.method2378(arg1, arg2, arg5, arg4, var8.field962);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class89 var26;
            class89 var27;
            if (var8.field969 == -1 && var8.field987 == null) {
                var26 = var8.method826(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method826(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field969, true, (class89) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var26, var27, field91[arg4], field91[var25], var19, var20);
            if (var8.field954) {
                if (arg4 == 0) {
                    Statics.field1705[arg0][arg1][arg2] |= 0x249;
                    Statics.field1705[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1705[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1705[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1705[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1705[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1705[arg0][arg1][arg2] |= 0x492;
                    Statics.field1705[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field999 != 0 && arg7 != null) {
                arg7.method2378(arg1, arg2, arg5, arg4, var8.field962);
            }
            if (var8.field970 != 16) {
                arg6.method2014(arg0, arg1, arg2, var8.field970);
            }
        } else if (arg5 == 3) {
            class89 var28;
            if (var8.field969 == -1 && var8.field987 == null) {
                var28 = var8.method826(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1887(arg0, arg1, arg2, var16, var28, (class89) null, field92[arg4], 0, var19, var20);
            if (var8.field977) {
                if (arg4 == 0) {
                    Statics.field3276[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field3276[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field3276[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field3276[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field999 != 0 && arg7 != null) {
                arg7.method2378(arg1, arg2, arg5, arg4, var8.field962);
            }
        } else if (arg5 == 9) {
            class89 var29;
            if (var8.field969 == -1 && var8.field987 == null) {
                var29 = var8.method826(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1889(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field999 != 0 && arg7 != null) {
                arg7.method2367(arg1, arg2, var9, var10, var8.field962);
            }
            if (var8.field970 != 16) {
                arg6.method2014(arg0, arg1, arg2, var8.field970);
            }
        } else if (arg5 == 4) {
            class89 var30;
            if (var8.field969 == -1 && var8.field987 == null) {
                var30 = var8.method826(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var30, (class89) null, field91[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1885(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class43.method3115(var32 >> 14 & 0x7FFF).field970;
            }
            class89 var33;
            if (var8.field969 == -1 && var8.field987 == null) {
                var33 = var8.method826(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var33, (class89) null, field91[arg4], 0, field93[arg4] * var31, field99[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1885(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class43.method3115(var35 >> 14 & 0x7FFF).field970 / 2;
            }
            class89 var36;
            if (var8.field969 == -1 && var8.field987 == null) {
                var36 = var8.method826(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var36, (class89) null, 256, arg4, field95[arg4] * var34, field94[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class89 var38;
            if (var8.field969 == -1 && var8.field987 == null) {
                var38 = var8.method826(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var38, (class89) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1885(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class43.method3115(var40 >> 14 & 0x7FFF).field970 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class89 var42;
            class89 var43;
            if (var8.field969 == -1 && var8.field987 == null) {
                var42 = var8.method826(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method826(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field969, true, (class89) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field969, true, (class89) null);
            }
            arg6.method1888(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field95[arg4] * var39, field94[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ey.b(IIIB)I")
    public static final int method2972(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method3281(var3, var5);
        int var8 = method3281(var3 + 1, var5);
        int var9 = method3281(var3, var5 + 1);
        int var10 = method3281(var3 + 1, var5 + 1);
        int var11 = 65536 - class95.field1663[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class95.field1663[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class95.field1663[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("fp.m(III)I")
    public static final int method3281(int arg0, int arg1) {
        int var2 = method717(arg0 - 1, arg1 - 1) + method717(arg0 + 1, arg1 - 1) + method717(arg0 - 1, arg1 + 1) + method717(arg0 + 1, arg1 + 1);
        int var3 = method717(arg0 - 1, arg1) + method717(arg0 + 1, arg1) + method717(arg0, arg1 - 1) + method717(arg0, arg1 + 1);
        int var4 = method717(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ak.q(III)I")
    public static final int method717(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dt.p(III)I")
    public static final int method2399(int arg0, int arg1) {
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

    @ObfuscatedName("ai.w(III)I")
    public static final int method788(int arg0, int arg1) {
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

    @ObfuscatedName("ee.o(IIII)I")
    public static final int method3085(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bq.d(III)Z")
    public static final boolean method1125(int arg0, int arg1) {
        class43 var2 = class43.method3115(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method824(arg1);
    }
}
