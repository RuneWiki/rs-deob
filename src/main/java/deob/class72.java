package deob;

@ObfuscatedName("j")
public final class class72 {

    @ObfuscatedName("j.f")
    public static final int[] field1044 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("j.b")
    public static int field1035 = 99;

    @ObfuscatedName("j.c")
    public static byte[][][] field1050 = new byte[4][104][104];

    @ObfuscatedName("j.n")
    public static int field1045 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("j.l")
    public static final int[] field1041 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("j.h")
    public static final int[] field1047 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("j.w")
    public static final int[] field1039 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("j.v")
    public static int[][][] field1034 = new int[4][105][105];

    @ObfuscatedName("j.t")
    public static final int[] field1046 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("j.r")
    public static final int[] field1049 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("j.q")
    public static int field1051 = (int) (Math.random() * 33.0D) - 16;

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.m([BIILcw;[Lfs;I)V")
    public static final void method692(byte[] arg0, int arg1, int arg2, class139 arg3, class15[] arg4) {
        class28 var5 = new class28(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method325();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method325();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method450();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field1050[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class15 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2273(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("g.y(IIB)I")
    public static final int method906(int arg0, int arg1) {
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

    @ObfuscatedName("g.u(IIII)I")
    public static final int method907(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("i.a(III)I")
    public static final int method1217(int arg0, int arg1) {
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

    @ObfuscatedName("el.e(IIIIIIILcw;Lfs;I)V")
    public static final void method1358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class139 arg7, class15 arg8) {
        class181 var9 = class181.method925(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2758;
            var11 = var9.field2791;
        } else {
            var10 = var9.field2791;
            var11 = var9.field2758;
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
        int[][] var16 = field1034[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field2777 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field2799 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class107 var22;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var22 = var9.method3403(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class74(arg4, 22, arg5, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2309(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field2794 == 1) {
                arg8.method123(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class107 var45;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var45 = var9.method3403(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class74(arg4, 10, arg5, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            if (var45 != null) {
                arg7.method2378(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field2794 != 0) {
                arg8.method88(arg2, arg3, var10, var11, var9.field2767);
            }
        } else if (arg6 >= 12) {
            class107 var23;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var23 = var9.method3403(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class74(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2378(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field2794 != 0) {
                arg8.method88(arg2, arg3, var10, var11, var9.field2767);
            }
        } else if (arg6 == 0) {
            class107 var24;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var24 = var9.method3403(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class74(arg4, 0, arg5, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2311(arg0, arg2, arg3, var17, var24, (class107) null, field1044[arg5], 0, var20, var21);
            if (var9.field2794 != 0) {
                arg8.method110(arg2, arg3, arg6, arg5, var9.field2767);
            }
        } else if (arg6 == 1) {
            class107 var25;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var25 = var9.method3403(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class74(arg4, 1, arg5, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2311(arg0, arg2, arg3, var17, var25, (class107) null, field1047[arg5], 0, var20, var21);
            if (var9.field2794 != 0) {
                arg8.method110(arg2, arg3, arg6, arg5, var9.field2767);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class107 var27;
            class107 var28;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var27 = var9.method3403(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method3403(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class74(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2781, true, (class107) null);
                var28 = new class74(arg4, 2, var26, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2311(arg0, arg2, arg3, var17, var27, var28, field1044[arg5], field1044[var26], var20, var21);
            if (var9.field2794 != 0) {
                arg8.method110(arg2, arg3, arg6, arg5, var9.field2767);
            }
        } else if (arg6 == 3) {
            class107 var29;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var29 = var9.method3403(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class74(arg4, 3, arg5, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2311(arg0, arg2, arg3, var17, var29, (class107) null, field1047[arg5], 0, var20, var21);
            if (var9.field2794 != 0) {
                arg8.method110(arg2, arg3, arg6, arg5, var9.field2767);
            }
        } else if (arg6 == 9) {
            class107 var30;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var30 = var9.method3403(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class74(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2378(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2794 != 0) {
                arg8.method88(arg2, arg3, var10, var11, var9.field2767);
            }
        } else if (arg6 == 4) {
            class107 var31;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var31 = var9.method3403(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class74(arg4, 4, arg5, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2386(arg0, arg2, arg3, var17, var31, (class107) null, field1044[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method2329(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class181.method925(var33 >> 14 & 0x7FFF).field2782;
            }
            class107 var34;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var34 = var9.method3403(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class74(arg4, 4, arg5, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2386(arg0, arg2, arg3, var17, var34, (class107) null, field1044[arg5], 0, field1046[arg5] * var32, field1039[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method2329(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class181.method925(var36 >> 14 & 0x7FFF).field2782 / 2;
            }
            class107 var37;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var37 = var9.method3403(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class74(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2386(arg0, arg2, arg3, var17, var37, (class107) null, 256, arg5, field1049[arg5] * var35, field1041[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class107 var39;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var39 = var9.method3403(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class74(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2386(arg0, arg2, arg3, var17, var39, (class107) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method2329(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class181.method925(var41 >> 14 & 0x7FFF).field2782 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class107 var43;
            class107 var44;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var43 = var9.method3403(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method3403(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class74(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2781, true, (class107) null);
                var44 = new class74(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field2781, true, (class107) null);
            }
            arg7.method2386(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field1049[arg5] * var40, field1041[arg5] * var40, var20, var21);
        }
    }

    @ObfuscatedName("en.j(III)I")
    public static final int method1449(int arg0, int arg1) {
        int var2 = method2955(arg0 - 1, arg1 - 1) + method2955(arg0 + 1, arg1 - 1) + method2955(arg0 - 1, arg1 + 1) + method2955(arg0 + 1, arg1 + 1);
        int var3 = method2955(arg0 - 1, arg1) + method2955(arg0 + 1, arg1) + method2955(arg0, arg1 - 1) + method2955(arg0, arg1 + 1);
        int var4 = method2955(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("en.v(I)V")
    public static void method1450() {
        Statics.field1037 = (byte[][][]) null;
        Statics.field1036 = (byte[][][]) null;
        Statics.field1038 = (byte[][][]) null;
        Statics.field1040 = (byte[][][]) null;
        Statics.field2056 = (int[][][]) null;
        Statics.field1328 = (byte[][][]) null;
        Statics.field1877 = (int[][]) null;
        Statics.field523 = null;
        Statics.field1048 = null;
        Statics.field1065 = null;
        Statics.field569 = null;
        Statics.field973 = null;
    }

    @ObfuscatedName("em.k(III)Z")
    public static final boolean method1453(int arg0, int arg1) {
        class181 var2 = class181.method925(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3394(arg1);
    }

    @ObfuscatedName("y.z([BIIIIIIILcw;[Lfs;B)V")
    public static final void method1491(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class139 arg8, class15[] arg9) {
        class28 var10 = new class28(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method325();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method325();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method450();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class181 var21 = class181.method925(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field2791;
                    int var27 = var21.field2758;
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
                    int var32 = arg3 + class22.method3466(var16 & 0x7, var15 & 0x7, arg7, var21.field2791, var21.field2758, var20);
                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field1050[1][var31][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class15 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method2273(arg1, var31, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.b([BIIIIIII[Lfs;I)V")
    public static final void method1902(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class15[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field95[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class28 var11 = new class28(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method3036(var11, arg1, arg2 + class22.method3131(var13 & 0x7, var14 & 0x7, arg7), arg3 + class22.method923(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method3036(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bf.d(IIIB)I")
    public static final int method2175(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1449(var3, var5);
        int var8 = method1449(var3 + 1, var5);
        int var9 = method1449(var3, var5 + 1);
        int var10 = method1449(var3 + 1, var5 + 1);
        int var11 = 65536 - class155.field2332[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class155.field2332[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class155.field2332[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("dc.x(IIIIIILcw;Lfs;S)V")
    public static final void method2273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class139 arg6, class15 arg7) {
        if (client.field1464 && (field1050[0][arg1][arg2] & 0x2) == 0) {
            if ((field1050[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field1050[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field1050[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field1514 != var8) {
                return;
            }
        }
        if (arg0 < field1035) {
            field1035 = arg0;
        }
        class181 var9 = class181.method925(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field2758;
            var11 = var9.field2791;
        } else {
            var10 = var9.field2791;
            var11 = var9.field2758;
        }
        int var12;
        int var13;
        if (arg1 + var10 <= 104) {
            var12 = (var10 >> 1) + arg1;
            var13 = (var10 + 1 >> 1) + arg1;
        } else {
            var12 = arg1;
            var13 = arg1 + 1;
        }
        int var14;
        int var15;
        if (arg2 + var11 <= 104) {
            var14 = (var11 >> 1) + arg2;
            var15 = (var11 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int[][] var16 = field1034[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field2777 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field2799 == 1) {
            var21 += 256;
        }
        if (var9.method3393()) {
            class104.method2973(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field1464 || var9.field2777 != 0 || var9.field2794 == 1 || var9.field2797) {
                class107 var22;
                if (var9.field2781 == -1 && var9.field2800 == null) {
                    var22 = var9.method3406(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class74(arg3, 22, arg4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
                }
                arg6.method2309(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field2794 == 1 && arg7 != null) {
                    arg7.method123(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class107 var45;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var45 = var9.method3406(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class74(arg3, 10, arg4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            if (var45 != null && arg6.method2378(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field2789) {
                int var46 = 15;
                if (var45 instanceof class43) {
                    var46 = ((class43) var45).method821() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field1328[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field1328[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field2794 != 0 && arg7 != null) {
                arg7.method88(arg1, arg2, var10, var11, var9.field2767);
            }
        } else if (arg5 >= 12) {
            class107 var23;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var23 = var9.method3406(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class74(arg3, arg5, arg4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2378(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2056[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field2794 != 0 && arg7 != null) {
                arg7.method88(arg1, arg2, var10, var11, var9.field2767);
            }
        } else if (arg5 == 0) {
            class107 var24;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var24 = var9.method3406(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class74(arg3, 0, arg4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2311(arg0, arg1, arg2, var17, var24, (class107) null, field1044[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field2789) {
                    Statics.field1328[arg0][arg1][arg2] = 50;
                    Statics.field1328[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field2802) {
                    Statics.field2056[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field2789) {
                    Statics.field1328[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1328[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field2802) {
                    Statics.field2056[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field2789) {
                    Statics.field1328[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1328[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field2802) {
                    Statics.field2056[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field2789) {
                    Statics.field1328[arg0][arg1][arg2] = 50;
                    Statics.field1328[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field2802) {
                    Statics.field2056[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field2794 != 0 && arg7 != null) {
                arg7.method110(arg1, arg2, arg5, arg4, var9.field2767);
            }
            if (var9.field2782 != 16) {
                arg6.method2319(arg0, arg1, arg2, var9.field2782);
            }
        } else if (arg5 == 1) {
            class107 var25;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var25 = var9.method3406(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class74(arg3, 1, arg4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2311(arg0, arg1, arg2, var17, var25, (class107) null, field1047[arg4], 0, var20, var21);
            if (var9.field2789) {
                if (arg4 == 0) {
                    Statics.field1328[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1328[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1328[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1328[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field2794 != 0 && arg7 != null) {
                arg7.method110(arg1, arg2, arg5, arg4, var9.field2767);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class107 var27;
            class107 var28;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var27 = var9.method3406(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method3406(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class74(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
                var28 = new class74(arg3, 2, var26, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2311(arg0, arg1, arg2, var17, var27, var28, field1044[arg4], field1044[var26], var20, var21);
            if (var9.field2802) {
                if (arg4 == 0) {
                    Statics.field2056[arg0][arg1][arg2] |= 0x249;
                    Statics.field2056[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2056[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2056[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2056[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2056[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2056[arg0][arg1][arg2] |= 0x492;
                    Statics.field2056[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field2794 != 0 && arg7 != null) {
                arg7.method110(arg1, arg2, arg5, arg4, var9.field2767);
            }
            if (var9.field2782 != 16) {
                arg6.method2319(arg0, arg1, arg2, var9.field2782);
            }
        } else if (arg5 == 3) {
            class107 var29;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var29 = var9.method3406(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class74(arg3, 3, arg4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2311(arg0, arg1, arg2, var17, var29, (class107) null, field1047[arg4], 0, var20, var21);
            if (var9.field2789) {
                if (arg4 == 0) {
                    Statics.field1328[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1328[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1328[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1328[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field2794 != 0 && arg7 != null) {
                arg7.method110(arg1, arg2, arg5, arg4, var9.field2767);
            }
        } else if (arg5 == 9) {
            class107 var30;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var30 = var9.method3406(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class74(arg3, arg5, arg4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2378(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field2794 != 0 && arg7 != null) {
                arg7.method88(arg1, arg2, var10, var11, var9.field2767);
            }
            if (var9.field2782 != 16) {
                arg6.method2319(arg0, arg1, arg2, var9.field2782);
            }
        } else if (arg5 == 4) {
            class107 var31;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var31 = var9.method3406(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class74(arg3, 4, arg4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2386(arg0, arg1, arg2, var17, var31, (class107) null, field1044[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method2329(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class181.method925(var33 >> 14 & 0x7FFF).field2782;
            }
            class107 var34;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var34 = var9.method3406(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class74(arg3, 4, arg4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2386(arg0, arg1, arg2, var17, var34, (class107) null, field1044[arg4], 0, field1046[arg4] * var32, field1039[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method2329(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class181.method925(var36 >> 14 & 0x7FFF).field2782 / 2;
            }
            class107 var37;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var37 = var9.method3406(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class74(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2386(arg0, arg1, arg2, var17, var37, (class107) null, 256, arg4, field1049[arg4] * var35, field1041[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class107 var39;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var39 = var9.method3406(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class74(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2386(arg0, arg1, arg2, var17, var39, (class107) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method2329(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class181.method925(var41 >> 14 & 0x7FFF).field2782 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class107 var43;
            class107 var44;
            if (var9.field2781 == -1 && var9.field2800 == null) {
                var43 = var9.method3406(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method3406(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class74(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
                var44 = new class74(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field2781, true, (class107) null);
            }
            arg6.method2386(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field1049[arg4] * var40, field1041[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("cq.c(IIIII)V")
    public static final void method2629(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1328[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field1034[0][var5][var4] = field1034[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field1034[0][var5][var4] = field1034[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field1034[0][var5][var4] = field1034[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field1034[0][var5][var4] = field1034[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.g(III)I")
    public static final int method2955(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("aw.i(Ldv;IIIIIII)V")
    public static final void method3036(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method450();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method450();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method450();
                }
            }
            return;
        }
        field1050[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method450();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = field1034[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = method2175(var10 + 45365, var11 + 91923, 4) - 128 + (method2175(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (method2175(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    field1034[arg1][arg2][arg3] = field1034[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method450();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    field1034[0][arg2][arg3] = -var15 * 8;
                } else {
                    field1034[arg1][arg2][arg3] = field1034[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1036[arg1][arg2][arg3] = arg0.method313();
                Statics.field1038[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1040[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field1050[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1037[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }
}
