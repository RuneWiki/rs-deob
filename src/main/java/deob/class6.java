package deob;

@ObfuscatedName("b")
public final class class6 {

    @ObfuscatedName("b.f")
    public static int[][][] field79 = new int[4][105][105];

    @ObfuscatedName("b.e")
    public static byte[][][] field83 = new byte[4][104][104];

    @ObfuscatedName("b.n")
    public static int field80 = 99;

    @ObfuscatedName("b.q")
    public static final int[] field87 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("b.r")
    public static final int[] field88 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("b.a")
    public static final int[] field86 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("b.z")
    public static final int[] field90 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("b.p")
    public static final int[] field99 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("b.y")
    public static final int[] field92 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("b.s")
    public static int field95 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("b.g")
    public static int field94 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.f(I)V")
    public static void method2337() {
        field80 = 99;
        Statics.field1145 = new byte[4][104][104];
        Statics.field2925 = new byte[4][104][104];
        Statics.field77 = new byte[4][104][104];
        Statics.field81 = new byte[4][104][104];
        Statics.field716 = new int[4][105][105];
        Statics.field82 = new byte[4][105][105];
        Statics.field781 = new int[105][105];
        Statics.field89 = new int[104];
        Statics.field84 = new int[104];
        Statics.field91 = new int[104];
        Statics.field1833 = new int[104];
        Statics.field2037 = new int[104];
    }

    @ObfuscatedName("y.e(IIIII)V")
    public static final void method583(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field82[0][var5][var4] = 127;
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

    @ObfuscatedName("bo.n([BIIIIIII[Ldo;I)V")
    public static final void method1254(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class112[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1955[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class123 var11 = new class123(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var17 = arg2 + class181.method2268(var13 & 0x7, var14 & 0x7, arg7);
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
                        method2856(var11, arg1, var17, arg3 + var23, 0, 0, arg7);
                    } else {
                        method2856(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.t(Ldx;IIIIIII)V")
    public static final void method2856(class123 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2522();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2522();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2522();
                }
            }
            return;
        }
        field83[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2522();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field79[0][arg2][arg3] = -method662(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field79[arg1][arg2][arg3] = field79[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2522();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field79[0][arg2][arg3] = -var8 * 8;
                } else {
                    field79[arg1][arg2][arg3] = field79[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field2925[arg1][arg2][arg3] = arg0.method2400();
                Statics.field77[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field81[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field83[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field1145[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("bv.b(IIIIIILct;Ldo;I)V")
    public static final void method1092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class90 arg6, class112 arg7) {
        if (client.field287 && (field83[0][arg1][arg2] & 0x2) == 0 && (field83[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field80) {
            field80 = arg0;
        }
        class43 var8 = class43.method106(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field938;
            var10 = var8.field937;
        } else {
            var9 = var8.field937;
            var10 = var8.field938;
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
        if (var8.field959 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field962 == 1) {
            var20 += 256;
        }
        if (var8.method816()) {
            class25.method564(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field287 || var8.field959 != 0 || var8.field939 == 1 || var8.field932) {
                class89 var21;
                if (var8.field945 == -1 && var8.field963 == null) {
                    var21 = var8.method807(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field945, true, (class89) null);
                }
                arg6.method1861(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field939 == 1 && arg7 != null) {
                    arg7.method2293(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class89 var44;
            if (var8.field945 == -1 && var8.field963 == null) {
                var44 = var8.method807(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            if (var44 != null && arg6.method1937(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field953) {
                int var45 = 15;
                if (var44 instanceof class109) {
                    var45 = ((class109) var44).method2202() / 4;
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
            if (var8.field939 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, var9, var10, var8.field968);
            }
        } else if (arg5 >= 12) {
            class89 var22;
            if (var8.field945 == -1 && var8.field963 == null) {
                var22 = var8.method807(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1937(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field716[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field939 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, var9, var10, var8.field968);
            }
        } else if (arg5 == 0) {
            class89 var23;
            if (var8.field945 == -1 && var8.field963 == null) {
                var23 = var8.method807(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1863(arg0, arg1, arg2, var16, var23, (class89) null, field87[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field953) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field944) {
                    Statics.field716[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field953) {
                    Statics.field82[arg0][arg1][arg2 + 1] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field944) {
                    Statics.field716[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field953) {
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field944) {
                    Statics.field716[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field953) {
                    Statics.field82[arg0][arg1][arg2] = 50;
                    Statics.field82[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field944) {
                    Statics.field716[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field939 != 0 && arg7 != null) {
                arg7.method2280(arg1, arg2, arg5, arg4, var8.field968);
            }
            if (var8.field946 != 16) {
                arg6.method1928(arg0, arg1, arg2, var8.field946);
            }
        } else if (arg5 == 1) {
            class89 var24;
            if (var8.field945 == -1 && var8.field963 == null) {
                var24 = var8.method807(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1863(arg0, arg1, arg2, var16, var24, (class89) null, field88[arg4], 0, var19, var20);
            if (var8.field953) {
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
            if (var8.field939 != 0 && arg7 != null) {
                arg7.method2280(arg1, arg2, arg5, arg4, var8.field968);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class89 var26;
            class89 var27;
            if (var8.field945 == -1 && var8.field963 == null) {
                var26 = var8.method807(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method807(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field945, true, (class89) null);
                var27 = new class13(arg3, 2, var25, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1863(arg0, arg1, arg2, var16, var26, var27, field87[arg4], field87[var25], var19, var20);
            if (var8.field944) {
                if (arg4 == 0) {
                    Statics.field716[arg0][arg1][arg2] |= 0x249;
                    Statics.field716[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field716[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field716[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field716[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field716[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field716[arg0][arg1][arg2] |= 0x492;
                    Statics.field716[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field939 != 0 && arg7 != null) {
                arg7.method2280(arg1, arg2, arg5, arg4, var8.field968);
            }
            if (var8.field946 != 16) {
                arg6.method1928(arg0, arg1, arg2, var8.field946);
            }
        } else if (arg5 == 3) {
            class89 var28;
            if (var8.field945 == -1 && var8.field963 == null) {
                var28 = var8.method807(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1863(arg0, arg1, arg2, var16, var28, (class89) null, field88[arg4], 0, var19, var20);
            if (var8.field953) {
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
            if (var8.field939 != 0 && arg7 != null) {
                arg7.method2280(arg1, arg2, arg5, arg4, var8.field968);
            }
        } else if (arg5 == 9) {
            class89 var29;
            if (var8.field945 == -1 && var8.field963 == null) {
                var29 = var8.method807(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1937(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field939 != 0 && arg7 != null) {
                arg7.method2281(arg1, arg2, var9, var10, var8.field968);
            }
            if (var8.field946 != 16) {
                arg6.method1928(arg0, arg1, arg2, var8.field946);
            }
        } else if (arg5 == 4) {
            class89 var30;
            if (var8.field945 == -1 && var8.field963 == null) {
                var30 = var8.method807(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1912(arg0, arg1, arg2, var16, var30, (class89) null, field87[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1935(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class43.method106(var32 >> 14 & 0x7FFF).field946;
            }
            class89 var33;
            if (var8.field945 == -1 && var8.field963 == null) {
                var33 = var8.method807(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1912(arg0, arg1, arg2, var16, var33, (class89) null, field87[arg4], 0, field86[arg4] * var31, field90[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1935(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class43.method106(var35 >> 14 & 0x7FFF).field946 / 2;
            }
            class89 var36;
            if (var8.field945 == -1 && var8.field963 == null) {
                var36 = var8.method807(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1912(arg0, arg1, arg2, var16, var36, (class89) null, 256, arg4, field99[arg4] * var34, field92[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class89 var38;
            if (var8.field945 == -1 && var8.field963 == null) {
                var38 = var8.method807(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class13(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1912(arg0, arg1, arg2, var16, var38, (class89) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1935(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class43.method106(var40 >> 14 & 0x7FFF).field946 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class89 var42;
            class89 var43;
            if (var8.field945 == -1 && var8.field963 == null) {
                var42 = var8.method807(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method807(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field945, true, (class89) null);
                var43 = new class13(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field945, true, (class89) null);
            }
            arg6.method1912(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field99[arg4] * var39, field92[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("ax.m(III)I")
    public static final int method662(int arg0, int arg1) {
        int var2 = method3020(arg0 + 45365, arg1 + 91923, 4) - 128 + (method3020(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method3020(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("fp.k(IIIB)I")
    public static final int method3020(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1008(var3, var5);
        int var8 = method1008(var3 + 1, var5);
        int var9 = method1008(var3, var5 + 1);
        int var10 = method1008(var3 + 1, var5 + 1);
        int var11 = 65536 - class95.field1647[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class95.field1647[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class95.field1647[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("an.c(III)I")
    public static final int method1008(int arg0, int arg1) {
        int var2 = method1646(arg0 - 1, arg1 - 1) + method1646(arg0 + 1, arg1 - 1) + method1646(arg0 - 1, arg1 + 1) + method1646(arg0 + 1, arg1 + 1);
        int var3 = method1646(arg0 - 1, arg1) + method1646(arg0 + 1, arg1) + method1646(arg0, arg1 - 1) + method1646(arg0, arg1 + 1);
        int var4 = method1646(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cd.w(III)I")
    public static final int method1646(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("dc.l(III)I")
    public static final int method2273(int arg0, int arg1) {
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

    @ObfuscatedName("fj.h(III)I")
    public static final int method3181(int arg0, int arg1) {
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

    @ObfuscatedName("cn.u(III)Z")
    public static final boolean method1598(int arg0, int arg1) {
        class43 var2 = class43.method106(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method805(arg1);
    }
}
