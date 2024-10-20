package deob;

@ObfuscatedName("n")
public final class class9 {

    @ObfuscatedName("n.l")
    public static int[][][] field109 = new int[4][105][105];

    @ObfuscatedName("n.b")
    public static byte[][][] field110 = new byte[4][104][104];

    @ObfuscatedName("n.o")
    public static int field111 = 99;

    @ObfuscatedName("n.u")
    public static final int[] field116 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("n.d")
    public static final int[] field117 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("n.i")
    public static final int[] field129 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("n.p")
    public static final int[] field132 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("n.h")
    public static final int[] field112 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("n.f")
    public static final int[] field118 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("n.t")
    public static int field122 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("n.x")
    public static int field120 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.l(B)V")
    public static void method145() {
        Statics.field161 = (byte[][][]) null;
        Statics.field1732 = (byte[][][]) null;
        Statics.field128 = (byte[][][]) null;
        Statics.field113 = (byte[][][]) null;
        Statics.field2470 = (int[][][]) null;
        Statics.field114 = (byte[][][]) null;
        Statics.field115 = (int[][]) null;
        Statics.field1768 = null;
        Statics.field2742 = null;
        Statics.field24 = null;
        Statics.field1456 = null;
        Statics.field269 = null;
    }

    @ObfuscatedName("bm.b(IIIII)V")
    public static final void method1288(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field114[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field109[0][var5][var4] = field109[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field109[0][var5][var4] = field109[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field109[0][var5][var4] = field109[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field109[0][var5][var4] = field109[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.o([BIIII[Ldy;I)V")
    public static final void method727(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class130[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2038[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class127 var9 = new class127(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method1837(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("dp.w([BIIIIIII[Ldy;S)V")
    public static final void method2200(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class130[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2038[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class127 var11 = new class127(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var18 = var13 & 0x7;
                        int var19 = var14 & 0x7;
                        int var21 = arg7 & 0x3;
                        int var22;
                        if (var21 == 0) {
                            var22 = var18;
                        } else if (var21 == 1) {
                            var22 = var19;
                        } else if (var21 == 2) {
                            var22 = 7 - var18;
                        } else {
                            var22 = 7 - var19;
                        }
                        int var25 = arg2 + var22;
                        int var27 = var13 & 0x7;
                        int var28 = var14 & 0x7;
                        int var30 = arg7 & 0x3;
                        int var31;
                        if (var30 == 0) {
                            var31 = var28;
                        } else if (var30 == 1) {
                            var31 = 7 - var27;
                        } else if (var30 == 2) {
                            var31 = 7 - var28;
                        } else {
                            var31 = var27;
                        }
                        method1837(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method1837(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.r(IIII)V")
    public static final void method2730(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field109[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field109[arg0][arg1][arg2 + var5] = field109[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field109[arg0][arg1 + var6][arg2] = field109[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field109[arg0][arg1 - 1][arg2] != 0) {
            field109[arg0][arg1][arg2] = field109[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field109[arg0][arg1][arg2 - 1] != 0) {
            field109[arg0][arg1][arg2] = field109[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field109[arg0][arg1 - 1][arg2 - 1] != 0) {
            field109[arg0][arg1][arg2] = field109[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cg.k(Ldm;IIIIIII)V")
    public static final void method1837(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2440();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2440();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2440();
                }
            }
            return;
        }
        field110[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2440();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field109[0][arg2][arg3] = -method214(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field109[arg1][arg2][arg3] = field109[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2440();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field109[0][arg2][arg3] = -var8 * 8;
                } else {
                    field109[arg1][arg2][arg3] = field109[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1732[arg1][arg2][arg3] = arg0.method2438();
                Statics.field128[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field113[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field110[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field161[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ez.z(IIIIIILct;Ldy;I)V")
    public static final void method2737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class130 arg7) {
        if (client.field479 && (field110[0][arg1][arg2] & 0x2) == 0) {
            if ((field110[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method22(arg0, arg1, arg2) != client.field524) {
                return;
            }
        }
        if (arg0 < field111) {
            field111 = arg0;
        }
        class32 var8 = class32.method217(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field820;
            var10 = var8.field819;
        } else {
            var9 = var8.field819;
            var10 = var8.field820;
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
        int[][] var15 = field109[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field853 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field844 == 1) {
            var20 += 256;
        }
        if (var8.method667()) {
            class7.method176(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field479 || var8.field853 != 0 || var8.field831 == 1 || var8.field814) {
                class94 var21;
                if (var8.field827 == -1 && var8.field845 == null) {
                    var21 = var8.method674(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var8.field827, true, (class94) null);
                }
                arg6.method1853(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field831 == 1 && arg7 != null) {
                    arg7.method2681(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var44;
            if (var8.field827 == -1 && var8.field845 == null) {
                var44 = var8.method674(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            if (var44 != null && arg6.method1921(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field835) {
                int var45 = 15;
                if (var44 instanceof class112) {
                    var45 = ((class112) var44).method2232() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field114[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field114[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method2679(arg1, arg2, var9, var10, var8.field825);
            }
        } else if (arg5 >= 12) {
            class94 var22;
            if (var8.field827 == -1 && var8.field845 == null) {
                var22 = var8.method674(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field2470[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method2679(arg1, arg2, var9, var10, var8.field825);
            }
        } else if (arg5 == 0) {
            class94 var23;
            if (var8.field827 == -1 && var8.field845 == null) {
                var23 = var8.method674(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1855(arg0, arg1, arg2, var16, var23, (class94) null, field116[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field835) {
                    Statics.field114[arg0][arg1][arg2] = 50;
                    Statics.field114[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field826) {
                    Statics.field2470[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field835) {
                    Statics.field114[arg0][arg1][arg2 + 1] = 50;
                    Statics.field114[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field826) {
                    Statics.field2470[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field835) {
                    Statics.field114[arg0][arg1 + 1][arg2] = 50;
                    Statics.field114[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field826) {
                    Statics.field2470[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field835) {
                    Statics.field114[arg0][arg1][arg2] = 50;
                    Statics.field114[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field826) {
                    Statics.field2470[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method2696(arg1, arg2, arg5, arg4, var8.field825);
            }
            if (var8.field818 != 16) {
                arg6.method1989(arg0, arg1, arg2, var8.field818);
            }
        } else if (arg5 == 1) {
            class94 var24;
            if (var8.field827 == -1 && var8.field845 == null) {
                var24 = var8.method674(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1855(arg0, arg1, arg2, var16, var24, (class94) null, field117[arg4], 0, var19, var20);
            if (var8.field835) {
                if (arg4 == 0) {
                    Statics.field114[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field114[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field114[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field114[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method2696(arg1, arg2, arg5, arg4, var8.field825);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class94 var26;
            class94 var27;
            if (var8.field827 == -1 && var8.field845 == null) {
                var26 = var8.method674(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method674(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field827, true, (class94) null);
                var27 = new class14(arg3, 2, var25, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1855(arg0, arg1, arg2, var16, var26, var27, field116[arg4], field116[var25], var19, var20);
            if (var8.field826) {
                if (arg4 == 0) {
                    Statics.field2470[arg0][arg1][arg2] |= 0x249;
                    Statics.field2470[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field2470[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field2470[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field2470[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field2470[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field2470[arg0][arg1][arg2] |= 0x492;
                    Statics.field2470[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method2696(arg1, arg2, arg5, arg4, var8.field825);
            }
            if (var8.field818 != 16) {
                arg6.method1989(arg0, arg1, arg2, var8.field818);
            }
        } else if (arg5 == 3) {
            class94 var28;
            if (var8.field827 == -1 && var8.field845 == null) {
                var28 = var8.method674(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1855(arg0, arg1, arg2, var16, var28, (class94) null, field117[arg4], 0, var19, var20);
            if (var8.field835) {
                if (arg4 == 0) {
                    Statics.field114[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field114[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field114[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field114[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method2696(arg1, arg2, arg5, arg4, var8.field825);
            }
        } else if (arg5 == 9) {
            class94 var29;
            if (var8.field827 == -1 && var8.field845 == null) {
                var29 = var8.method674(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1921(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field831 != 0 && arg7 != null) {
                arg7.method2679(arg1, arg2, var9, var10, var8.field825);
            }
            if (var8.field818 != 16) {
                arg6.method1989(arg0, arg1, arg2, var8.field818);
            }
        } else if (arg5 == 4) {
            class94 var30;
            if (var8.field827 == -1 && var8.field845 == null) {
                var30 = var8.method674(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1856(arg0, arg1, arg2, var16, var30, (class94) null, field116[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1872(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class32.method217(var32 >> 14 & 0x7FFF).field818;
            }
            class94 var33;
            if (var8.field827 == -1 && var8.field845 == null) {
                var33 = var8.method674(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1856(arg0, arg1, arg2, var16, var33, (class94) null, field116[arg4], 0, field129[arg4] * var31, field132[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1872(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class32.method217(var35 >> 14 & 0x7FFF).field818 / 2;
            }
            class94 var36;
            if (var8.field827 == -1 && var8.field845 == null) {
                var36 = var8.method674(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1856(arg0, arg1, arg2, var16, var36, (class94) null, 256, arg4, field112[arg4] * var34, field118[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class94 var38;
            if (var8.field827 == -1 && var8.field845 == null) {
                var38 = var8.method674(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class14(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1856(arg0, arg1, arg2, var16, var38, (class94) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1872(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class32.method217(var40 >> 14 & 0x7FFF).field818 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class94 var42;
            class94 var43;
            if (var8.field827 == -1 && var8.field845 == null) {
                var42 = var8.method674(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method674(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field827, true, (class94) null);
                var43 = new class14(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field827, true, (class94) null);
            }
            arg6.method1856(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field112[arg4] * var39, field118[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("o.g(IIIS)I")
    public static int method22(int arg0, int arg1, int arg2) {
        if ((field110[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field110[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("i.n(IIB)I")
    public static final int method214(int arg0, int arg1) {
        int var2 = method2206(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2206(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2206(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("de.j(IIIB)I")
    public static final int method2206(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method142(var3, var5);
        int var8 = method142(var3 + 1, var5);
        int var9 = method142(var3, var5 + 1);
        int var10 = method142(var3 + 1, var5 + 1);
        int var11 = method169(var7, var8, var4, arg2);
        int var12 = method169(var9, var10, var4, arg2);
        return method169(var11, var12, var6, arg2);
    }

    @ObfuscatedName("u.c(IIIIS)I")
    public static final int method169(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class104.field1736[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("e.m(III)I")
    public static final int method142(int arg0, int arg1) {
        int var2 = method2021(arg0 - 1, arg1 - 1) + method2021(arg0 + 1, arg1 - 1) + method2021(arg0 - 1, arg1 + 1) + method2021(arg0 + 1, arg1 + 1);
        int var3 = method2021(arg0 - 1, arg1) + method2021(arg0 + 1, arg1) + method2021(arg0, arg1 - 1) + method2021(arg0, arg1 + 1);
        int var4 = method2021(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("cr.a(III)I")
    public static final int method2021(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("be.e(III)I")
    public static final int method1334(int arg0, int arg1) {
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

    @ObfuscatedName("bu.q(III)I")
    public static final int method1391(int arg0, int arg1) {
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

    @ObfuscatedName("bg.y(IIIB)I")
    public static final int method1434(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("bm.v(III)Z")
    public static final boolean method1273(int arg0, int arg1) {
        class32 var2 = class32.method217(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method633(arg1);
    }

    @ObfuscatedName("ef.s(IIIIIIILct;Ldy;I)V")
    public static final void method2889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class130 arg8) {
        class32 var9 = class32.method217(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field820;
            var11 = var9.field819;
        } else {
            var10 = var9.field819;
            var11 = var9.field820;
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
        int[][] var16 = field109[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field853 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field844 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field827 == -1 && var9.field845 == null) {
                var22 = var9.method636(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1853(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field831 == 1) {
                arg8.method2681(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field827 == -1 && var9.field845 == null) {
                var45 = var9.method636(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1921(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field831 != 0) {
                arg8.method2679(arg2, arg3, var10, var11, var9.field825);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field827 == -1 && var9.field845 == null) {
                var23 = var9.method636(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1921(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field831 != 0) {
                arg8.method2679(arg2, arg3, var10, var11, var9.field825);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field827 == -1 && var9.field845 == null) {
                var24 = var9.method636(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1855(arg0, arg2, arg3, var17, var24, (class94) null, field116[arg5], 0, var20, var21);
            if (var9.field831 != 0) {
                arg8.method2696(arg2, arg3, arg6, arg5, var9.field825);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field827 == -1 && var9.field845 == null) {
                var25 = var9.method636(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1855(arg0, arg2, arg3, var17, var25, (class94) null, field117[arg5], 0, var20, var21);
            if (var9.field831 != 0) {
                arg8.method2696(arg2, arg3, arg6, arg5, var9.field825);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field827 == -1 && var9.field845 == null) {
                var27 = var9.method636(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method636(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field827, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1855(arg0, arg2, arg3, var17, var27, var28, field116[arg5], field116[var26], var20, var21);
            if (var9.field831 != 0) {
                arg8.method2696(arg2, arg3, arg6, arg5, var9.field825);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field827 == -1 && var9.field845 == null) {
                var29 = var9.method636(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1855(arg0, arg2, arg3, var17, var29, (class94) null, field117[arg5], 0, var20, var21);
            if (var9.field831 != 0) {
                arg8.method2696(arg2, arg3, arg6, arg5, var9.field825);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field827 == -1 && var9.field845 == null) {
                var30 = var9.method636(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1921(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field831 != 0) {
                arg8.method2679(arg2, arg3, var10, var11, var9.field825);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field827 == -1 && var9.field845 == null) {
                var31 = var9.method636(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1856(arg0, arg2, arg3, var17, var31, (class94) null, field116[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1872(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method217(var33 >> 14 & 0x7FFF).field818;
            }
            class94 var34;
            if (var9.field827 == -1 && var9.field845 == null) {
                var34 = var9.method636(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1856(arg0, arg2, arg3, var17, var34, (class94) null, field116[arg5], 0, field129[arg5] * var32, field132[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1872(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method217(var36 >> 14 & 0x7FFF).field818 / 2;
            }
            class94 var37;
            if (var9.field827 == -1 && var9.field845 == null) {
                var37 = var9.method636(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1856(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field112[arg5] * var35, field118[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field827 == -1 && var9.field845 == null) {
                var39 = var9.method636(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1856(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1872(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method217(var41 >> 14 & 0x7FFF).field818 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field827 == -1 && var9.field845 == null) {
                var43 = var9.method636(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method636(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field827, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field827, true, (class94) null);
            }
            arg7.method1856(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field112[arg5] * var40, field118[arg5] * var40, var20, var21);
        }
    }
}
