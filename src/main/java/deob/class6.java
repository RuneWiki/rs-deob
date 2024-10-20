package deob;

@ObfuscatedName("k")
public final class class6 {

    @ObfuscatedName("k.n")
    public static int[][][] field80 = new int[4][105][105];

    @ObfuscatedName("k.d")
    public static byte[][][] field79 = new byte[4][104][104];

    @ObfuscatedName("k.s")
    public static int field71 = 99;

    @ObfuscatedName("k.r")
    public static final int[] field77 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("k.u")
    public static final int[] field83 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("k.v")
    public static final int[] field81 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("k.a")
    public static final int[] field82 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("k.c")
    public static final int[] field69 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("k.l")
    public static final int[] field84 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("k.x")
    public static int field70 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("k.w")
    public static int field86 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.d([BIIIIIII[Ldt;I)V")
    public static final void method933(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field1868[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class119 var11 = new class119(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method2729(var11, arg1, arg2 + class177.method101(var13 & 0x7, var14 & 0x7, arg7), arg3 + class177.method776(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method2729(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.s(IIII)V")
    public static final void method2267(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field80[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field80[arg0][arg1][arg2 + var5] = field80[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field80[arg0][arg1 + var6][arg2] = field80[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field80[arg0][arg1 - 1][arg2] != 0) {
            field80[arg0][arg1][arg2] = field80[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field80[arg0][arg1][arg2 - 1] != 0) {
            field80[arg0][arg1][arg2] = field80[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field80[arg0][arg1 - 1][arg2 - 1] != 0) {
            field80[arg0][arg1][arg2] = field80[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ex.q(Ldq;IIIIIIB)V")
    public static final void method2729(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2338();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2338();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2338();
                }
            }
            return;
        }
        field79[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2338();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field80[0][arg2][arg3] = -Statics.method2913(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field80[arg1][arg2][arg3] = field80[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2338();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field80[0][arg2][arg3] = -var8 * 8;
                } else {
                    field80[arg1][arg2][arg3] = field80[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field3113[arg1][arg2][arg3] = arg0.method2330();
                Statics.field85[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field74[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field79[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field72[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cm.j([BIIIIIIILcg;[Ldt;I)V")
    public static final void method1918(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class86 arg8, class108[] arg9) {
        class119 var10 = new class119(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2351();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2351();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2338();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class41 var21 = class41.method116(var11);
                    int var22 = arg2 + class177.method176(var16 & 0x7, var15 & 0x7, arg7, var21.field914, var21.field908, var20);
                    int var23 = arg3 + class177.method2949(var16 & 0x7, var15 & 0x7, arg7, var21.field914, var21.field908, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg1;
                        if ((field79[1][var22][var23] & 0x2) == 2) {
                            var24 = arg1 - 1;
                        }
                        class108 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        method3197(arg1, var22, var23, var11, arg7 + var20 & 0x3, var19, arg8, var25);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fg.k(IIIIIILcg;Ldt;I)V")
    public static final void method3197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class86 arg6, class108 arg7) {
        if (client.field279 && (field79[0][arg1][arg2] & 0x2) == 0 && (field79[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < field71) {
            field71 = arg0;
        }
        class41 var8 = class41.method116(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field908;
            var10 = var8.field914;
        } else {
            var9 = var8.field914;
            var10 = var8.field908;
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
        int[][] var15 = field80[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field918 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field947 == 1) {
            var20 += 256;
        }
        if (var8.method799()) {
            class24 var21 = new class24();
            var21.field583 = arg0;
            var21.field584 = arg1 * 128;
            var21.field585 = arg2 * 128;
            int var22 = var8.field914;
            int var23 = var8.field908;
            if (arg4 == 1 || arg4 == 3) {
                var22 = var8.field908;
                var23 = var8.field914;
            }
            var21.field586 = (arg1 + var22) * 128;
            var21.field587 = (arg2 + var23) * 128;
            var21.field582 = var8.field943;
            var21.field588 = var8.field944 * 128;
            var21.field591 = var8.field945;
            var21.field592 = var8.field940;
            var21.field593 = var8.field905;
            if (var8.field915 != null) {
                var21.field596 = var8;
                var21.method578();
            }
            class24.field598.method3579(var21);
            if (var21.field593 != null) {
                var21.field594 = var21.field591 + (int) (Math.random() * (double) (var21.field592 - var21.field591));
            }
        }
        if (arg5 == 22) {
            if (!client.field279 || var8.field918 != 0 || var8.field916 == 1 || var8.field909) {
                class85 var24;
                if (var8.field917 == -1 && var8.field915 == null) {
                    var24 = var8.method805(22, arg4, var15, var17, var16, var18);
                } else {
                    var24 = new class13(arg3, 22, arg4, arg0, arg1, arg2, var8.field917, true, (class85) null);
                }
                arg6.method1749(arg0, arg1, arg2, var16, var24, var19, var20);
                if (var8.field916 == 1 && arg7 != null) {
                    arg7.method2246(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class85 var47;
            if (var8.field917 == -1 && var8.field915 == null) {
                var47 = var8.method805(10, arg4, var15, var17, var16, var18);
            } else {
                var47 = new class13(arg3, 10, arg4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            if (var47 != null && arg6.method1874(arg0, arg1, arg2, var16, var9, var10, var47, arg5 == 11 ? 256 : 0, var19, var20) && var8.field930) {
                int var48 = 15;
                if (var47 instanceof class105) {
                    var48 = ((class105) var47).method2206() / 4;
                    if (var48 > 30) {
                        var48 = 30;
                    }
                }
                for (int var49 = 0; var49 <= var9; var49++) {
                    for (int var50 = 0; var50 <= var10; var50++) {
                        if (var48 > Statics.field854[arg0][arg1 + var49][arg2 + var50]) {
                            Statics.field854[arg0][arg1 + var49][arg2 + var50] = (byte) var48;
                        }
                    }
                }
            }
            if (var8.field916 != 0 && arg7 != null) {
                arg7.method2226(arg1, arg2, var9, var10, var8.field921);
            }
        } else if (arg5 >= 12) {
            class85 var25;
            if (var8.field917 == -1 && var8.field915 == null) {
                var25 = var8.method805(arg5, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1874(arg0, arg1, arg2, var16, 1, 1, var25, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field203[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field916 != 0 && arg7 != null) {
                arg7.method2226(arg1, arg2, var9, var10, var8.field921);
            }
        } else if (arg5 == 0) {
            class85 var26;
            if (var8.field917 == -1 && var8.field915 == null) {
                var26 = var8.method805(0, arg4, var15, var17, var16, var18);
            } else {
                var26 = new class13(arg3, 0, arg4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1751(arg0, arg1, arg2, var16, var26, (class85) null, field77[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field930) {
                    Statics.field854[arg0][arg1][arg2] = 50;
                    Statics.field854[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field946) {
                    Statics.field203[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field930) {
                    Statics.field854[arg0][arg1][arg2 + 1] = 50;
                    Statics.field854[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field946) {
                    Statics.field203[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field930) {
                    Statics.field854[arg0][arg1 + 1][arg2] = 50;
                    Statics.field854[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field946) {
                    Statics.field203[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field930) {
                    Statics.field854[arg0][arg1][arg2] = 50;
                    Statics.field854[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field946) {
                    Statics.field203[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field916 != 0 && arg7 != null) {
                arg7.method2225(arg1, arg2, arg5, arg4, var8.field921);
            }
            if (var8.field923 != 16) {
                arg6.method1812(arg0, arg1, arg2, var8.field923);
            }
        } else if (arg5 == 1) {
            class85 var27;
            if (var8.field917 == -1 && var8.field915 == null) {
                var27 = var8.method805(1, arg4, var15, var17, var16, var18);
            } else {
                var27 = new class13(arg3, 1, arg4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1751(arg0, arg1, arg2, var16, var27, (class85) null, field83[arg4], 0, var19, var20);
            if (var8.field930) {
                if (arg4 == 0) {
                    Statics.field854[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field854[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field854[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field854[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field916 != 0 && arg7 != null) {
                arg7.method2225(arg1, arg2, arg5, arg4, var8.field921);
            }
        } else if (arg5 == 2) {
            int var28 = arg4 + 1 & 0x3;
            class85 var29;
            class85 var30;
            if (var8.field917 == -1 && var8.field915 == null) {
                var29 = var8.method805(2, arg4 + 4, var15, var17, var16, var18);
                var30 = var8.method805(2, var28, var15, var17, var16, var18);
            } else {
                var29 = new class13(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field917, true, (class85) null);
                var30 = new class13(arg3, 2, var28, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1751(arg0, arg1, arg2, var16, var29, var30, field77[arg4], field77[var28], var19, var20);
            if (var8.field946) {
                if (arg4 == 0) {
                    Statics.field203[arg0][arg1][arg2] |= 0x249;
                    Statics.field203[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field203[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field203[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field203[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field203[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field203[arg0][arg1][arg2] |= 0x492;
                    Statics.field203[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field916 != 0 && arg7 != null) {
                arg7.method2225(arg1, arg2, arg5, arg4, var8.field921);
            }
            if (var8.field923 != 16) {
                arg6.method1812(arg0, arg1, arg2, var8.field923);
            }
        } else if (arg5 == 3) {
            class85 var31;
            if (var8.field917 == -1 && var8.field915 == null) {
                var31 = var8.method805(3, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class13(arg3, 3, arg4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1751(arg0, arg1, arg2, var16, var31, (class85) null, field83[arg4], 0, var19, var20);
            if (var8.field930) {
                if (arg4 == 0) {
                    Statics.field854[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field854[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field854[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field854[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field916 != 0 && arg7 != null) {
                arg7.method2225(arg1, arg2, arg5, arg4, var8.field921);
            }
        } else if (arg5 == 9) {
            class85 var32;
            if (var8.field917 == -1 && var8.field915 == null) {
                var32 = var8.method805(arg5, arg4, var15, var17, var16, var18);
            } else {
                var32 = new class13(arg3, arg5, arg4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1874(arg0, arg1, arg2, var16, 1, 1, var32, 0, var19, var20);
            if (var8.field916 != 0 && arg7 != null) {
                arg7.method2226(arg1, arg2, var9, var10, var8.field921);
            }
            if (var8.field923 != 16) {
                arg6.method1812(arg0, arg1, arg2, var8.field923);
            }
        } else if (arg5 == 4) {
            class85 var33;
            if (var8.field917 == -1 && var8.field915 == null) {
                var33 = var8.method805(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1767(arg0, arg1, arg2, var16, var33, (class85) null, field77[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var34 = 16;
            int var35 = arg6.method1769(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class41.method116(var35 >> 14 & 0x7FFF).field923;
            }
            class85 var36;
            if (var8.field917 == -1 && var8.field915 == null) {
                var36 = var8.method805(4, arg4, var15, var17, var16, var18);
            } else {
                var36 = new class13(arg3, 4, arg4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1767(arg0, arg1, arg2, var16, var36, (class85) null, field77[arg4], 0, field81[arg4] * var34, field82[arg4] * var34, var19, var20);
        } else if (arg5 == 6) {
            int var37 = 8;
            int var38 = arg6.method1769(arg0, arg1, arg2);
            if (var38 != 0) {
                var37 = class41.method116(var38 >> 14 & 0x7FFF).field923 / 2;
            }
            class85 var39;
            if (var8.field917 == -1 && var8.field915 == null) {
                var39 = var8.method805(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1767(arg0, arg1, arg2, var16, var39, (class85) null, 256, arg4, field69[arg4] * var37, field84[arg4] * var37, var19, var20);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class85 var41;
            if (var8.field917 == -1 && var8.field915 == null) {
                var41 = var8.method805(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class13(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1767(arg0, arg1, arg2, var16, var41, (class85) null, 256, var40, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var42 = 8;
            int var43 = arg6.method1769(arg0, arg1, arg2);
            if (var43 != 0) {
                var42 = class41.method116(var43 >> 14 & 0x7FFF).field923 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class85 var45;
            class85 var46;
            if (var8.field917 == -1 && var8.field915 == null) {
                var45 = var8.method805(4, arg4 + 4, var15, var17, var16, var18);
                var46 = var8.method805(4, var44 + 4, var15, var17, var16, var18);
            } else {
                var45 = new class13(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field917, true, (class85) null);
                var46 = new class13(arg3, 4, var44 + 4, arg0, arg1, arg2, var8.field917, true, (class85) null);
            }
            arg6.method1767(arg0, arg1, arg2, var16, var45, var46, 256, arg4, field69[arg4] * var42, field84[arg4] * var42, var19, var20);
        }
    }

    @ObfuscatedName("el.i(Lcg;[Ldt;I)V")
    public static final void method2685(class86 arg0, class108[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field79[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field79[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method2227(var3, var4);
                        }
                    }
                }
            }
        }
        field70 += (int) (Math.random() * 5.0D) - 2;
        if (field70 < -8) {
            field70 = -8;
        }
        if (field70 > 8) {
            field70 = 8;
        }
        field86 += (int) (Math.random() * 5.0D) - 2;
        if (field86 < -16) {
            field86 = -16;
        }
        if (field86 > 16) {
            field86 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field854[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field80[var6][var11 + 1][var10] - field80[var6][var11 - 1][var10];
                    int var13 = field80[var6][var11][var10 + 1] - field80[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field2149[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field75[var20] = 0;
                Statics.field76[var20] = 0;
                Statics.field850[var20] = 0;
                Statics.field73[var20] = 0;
                Statics.field1378[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field72[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class42 var26 = (class42) class42.field952.method3478((long) var25);
                            class42 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field955.method3010(1, var25);
                                class42 var29 = new class42();
                                if (var28 != null) {
                                    var29.method821(new class119(var28), var25);
                                }
                                var29.method819();
                                class42.field952.method3481(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field75[var22] += var27.field954;
                            Statics.field76[var22] += var27.field953;
                            Statics.field850[var22] += var27.field951;
                            Statics.field73[var22] += var27.field958;
                            var10002 = Statics.field1378[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field72[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class42 var34 = (class42) class42.field952.method3478((long) var33);
                            class42 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field955.method3010(1, var33);
                                class42 var37 = new class42();
                                if (var36 != null) {
                                    var37.method821(new class119(var36), var33);
                                }
                                var37.method819();
                                class42.field952.method3481(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field75[var22] -= var35.field954;
                            Statics.field76[var22] -= var35.field953;
                            Statics.field850[var22] -= var35.field951;
                            Statics.field73[var22] -= var35.field958;
                            var10002 = Statics.field1378[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var39 = 0;
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    int var43 = 0;
                    for (int var44 = -5; var44 < 109; var44++) {
                        int var45 = var44 + 5;
                        if (var45 >= 0 && var45 < 104) {
                            var39 += Statics.field75[var45];
                            var40 += Statics.field76[var45];
                            var41 += Statics.field850[var45];
                            var42 += Statics.field73[var45];
                            var43 += Statics.field1378[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field75[var46];
                            var40 -= Statics.field76[var46];
                            var41 -= Statics.field850[var46];
                            var42 -= Statics.field73[var46];
                            var43 -= Statics.field1378[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field279 || (field79[0][var21][var44] & 0x2) != 0 || (field79[var6][var21][var44] & 0x10) == 0)) {
                            if (var6 < field71) {
                                field71 = var6;
                            }
                            int var47 = Statics.field72[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field3113[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field80[var6][var21][var44];
                                int var50 = field80[var6][var21 + 1][var44];
                                int var51 = field80[var6][var21 + 1][var44 + 1];
                                int var52 = field80[var6][var21][var44 + 1];
                                int var53 = Statics.field2149[var21][var44];
                                int var54 = Statics.field2149[var21 + 1][var44];
                                int var55 = Statics.field2149[var21 + 1][var44 + 1];
                                int var56 = Statics.field2149[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method2942(var59, var60, var61);
                                    int var62 = field70 + var59 & 0xFF;
                                    int var63 = field86 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method2942(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field85[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0) {
                                        int var65 = var48 - 1;
                                        class47 var66 = (class47) class47.field1028.method3478((long) var65);
                                        class47 var67;
                                        if (var66 == null) {
                                            byte[] var68 = Statics.field1029.method3010(4, var65);
                                            class47 var69 = new class47();
                                            if (var68 != null) {
                                                var69.method914(new class119(var68), var65);
                                            }
                                            var69.method913();
                                            class47.field1028.method3481(var69, (long) var65);
                                            var67 = var69;
                                        } else {
                                            var67 = var66;
                                        }
                                        if (!var67.field1040) {
                                            var64 = false;
                                        }
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field203[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var70 = 0;
                                if (var58 != -1) {
                                    var70 = class91.field1562[method1741(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1748(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, method1741(var57, var53), method1741(var57, var54), method1741(var57, var55), method1741(var57, var56), 0, 0, 0, 0, var70, 0);
                                } else {
                                    int var71 = Statics.field85[var6][var21][var44] + 1;
                                    byte var72 = Statics.field74[var6][var21][var44];
                                    int var73 = var48 - 1;
                                    class47 var74 = (class47) class47.field1028.method3478((long) var73);
                                    class47 var75;
                                    if (var74 == null) {
                                        byte[] var76 = Statics.field1029.method3010(4, var73);
                                        class47 var77 = new class47();
                                        if (var76 != null) {
                                            var77.method914(new class119(var76), var73);
                                        }
                                        var77.method913();
                                        class47.field1028.method3481(var77, (long) var73);
                                        var75 = var77;
                                    } else {
                                        var75 = var74;
                                    }
                                    int var79 = var75.field1030;
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = Statics.field1560.method1987(var79);
                                        var81 = -1;
                                    } else if (var75.field1035 == 16711935) {
                                        var81 = -2;
                                        var79 = -1;
                                        var80 = -2;
                                    } else {
                                        var81 = method2942(var75.field1027, var75.field1034, var75.field1041);
                                        int var82 = field70 + var75.field1027 & 0xFF;
                                        int var83 = field86 + var75.field1041;
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        var80 = method2942(var82, var75.field1034, var83);
                                    }
                                    int var84 = 0;
                                    if (var80 != -2) {
                                        var84 = class91.field1562[method2802(var80, 96)];
                                    }
                                    if (var75.field1032 != -1) {
                                        int var85 = field70 + var75.field1036 & 0xFF;
                                        int var86 = field86 + var75.field1038;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 255) {
                                            var86 = 255;
                                        }
                                        int var87 = method2942(var85, var75.field1031, var86);
                                        var84 = class91.field1562[method2802(var87, 96)];
                                    }
                                    arg0.method1748(var6, var21, var44, var71, var72, var79, var49, var50, var51, var52, method1741(var57, var53), method1741(var57, var54), method1741(var57, var55), method1741(var57, var56), method2802(var81, var53), method2802(var81, var54), method2802(var81, var55), method2802(var81, var56), var70, var84);
                                }
                            }
                        }
                    }
                }
            }
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    arg0.method1747(var6, var89, var88, method91(var6, var89, var88));
                }
            }
            Statics.field72[var6] = (byte[][]) null;
            Statics.field3113[var6] = (byte[][]) null;
            Statics.field85[var6] = (byte[][]) null;
            Statics.field74[var6] = (byte[][]) null;
            Statics.field854[var6] = (byte[][]) null;
        }
        arg0.method1808(-50, -10, -50);
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                if ((field79[1][var90][var91] & 0x2) == 2) {
                    arg0.method1912(var90, var91);
                }
            }
        }
        int var92 = 1;
        int var93 = 2;
        int var94 = 4;
        for (int var95 = 0; var95 < 4; var95++) {
            if (var95 > 0) {
                var92 <<= 0x3;
                var93 <<= 0x3;
                var94 <<= 0x3;
            }
            for (int var96 = 0; var96 <= var95; var96++) {
                for (int var97 = 0; var97 <= 104; var97++) {
                    for (int var98 = 0; var98 <= 104; var98++) {
                        if ((Statics.field203[var96][var98][var97] & var92) != 0) {
                            int var99 = var97;
                            int var100 = var97;
                            int var101 = var96;
                            int var102 = var96;
                            while (var99 > 0 && (Statics.field203[var96][var98][var99 - 1] & var92) != 0) {
                                var99--;
                            }
                            while (var100 < 104 && (Statics.field203[var96][var98][var100 + 1] & var92) != 0) {
                                var100++;
                            }
                            label373: while (var101 > 0) {
                                for (int var103 = var99; var103 <= var100; var103++) {
                                    if ((Statics.field203[var101 - 1][var98][var103] & var92) == 0) {
                                        break label373;
                                    }
                                }
                                var101--;
                            }
                            label362: while (var102 < var95) {
                                for (int var104 = var99; var104 <= var100; var104++) {
                                    if ((Statics.field203[var102 + 1][var98][var104] & var92) == 0) {
                                        break label362;
                                    }
                                }
                                var102++;
                            }
                            int var105 = (var102 + 1 - var101) * (var100 - var99 + 1);
                            if (var105 >= 8) {
                                short var106 = 240;
                                int var107 = field80[var102][var98][var99] - var106;
                                int var108 = field80[var101][var98][var99];
                                class86.method1746(var95, 1, var98 * 128, var98 * 128, var99 * 128, var100 * 128 + 128, var107, var108);
                                for (int var109 = var101; var109 <= var102; var109++) {
                                    for (int var110 = var99; var110 <= var100; var110++) {
                                        Statics.field203[var109][var98][var110] &= ~var92;
                                    }
                                }
                            }
                        }
                        if ((Statics.field203[var96][var98][var97] & var93) != 0) {
                            int var111 = var98;
                            int var112 = var98;
                            int var113 = var96;
                            int var114 = var96;
                            while (var111 > 0 && (Statics.field203[var96][var111 - 1][var97] & var93) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field203[var96][var112 + 1][var97] & var93) != 0) {
                                var112++;
                            }
                            label426: while (var113 > 0) {
                                for (int var115 = var111; var115 <= var112; var115++) {
                                    if ((Statics.field203[var113 - 1][var115][var97] & var93) == 0) {
                                        break label426;
                                    }
                                }
                                var113--;
                            }
                            label415: while (var114 < var95) {
                                for (int var116 = var111; var116 <= var112; var116++) {
                                    if ((Statics.field203[var114 + 1][var116][var97] & var93) == 0) {
                                        break label415;
                                    }
                                }
                                var114++;
                            }
                            int var117 = (var114 + 1 - var113) * (var112 - var111 + 1);
                            if (var117 >= 8) {
                                short var118 = 240;
                                int var119 = field80[var114][var111][var97] - var118;
                                int var120 = field80[var113][var111][var97];
                                class86.method1746(var95, 2, var111 * 128, var112 * 128 + 128, var97 * 128, var97 * 128, var119, var120);
                                for (int var121 = var113; var121 <= var114; var121++) {
                                    for (int var122 = var111; var122 <= var112; var122++) {
                                        Statics.field203[var121][var122][var97] &= ~var93;
                                    }
                                }
                            }
                        }
                        if ((Statics.field203[var96][var98][var97] & var94) != 0) {
                            int var123 = var98;
                            int var124 = var98;
                            int var125 = var97;
                            int var126 = var97;
                            while (var125 > 0 && (Statics.field203[var96][var98][var125 - 1] & var94) != 0) {
                                var125--;
                            }
                            while (var126 < 104 && (Statics.field203[var96][var98][var126 + 1] & var94) != 0) {
                                var126++;
                            }
                            label479: while (var123 > 0) {
                                for (int var127 = var125; var127 <= var126; var127++) {
                                    if ((Statics.field203[var96][var123 - 1][var127] & var94) == 0) {
                                        break label479;
                                    }
                                }
                                var123--;
                            }
                            label468: while (var124 < 104) {
                                for (int var128 = var125; var128 <= var126; var128++) {
                                    if ((Statics.field203[var96][var124 + 1][var128] & var94) == 0) {
                                        break label468;
                                    }
                                }
                                var124++;
                            }
                            if ((var124 - var123 + 1) * (var126 - var125 + 1) >= 4) {
                                int var129 = field80[var96][var123][var125];
                                class86.method1746(var95, 4, var123 * 128, var124 * 128 + 128, var125 * 128, var126 * 128 + 128, var129, var129);
                                for (int var130 = var123; var130 <= var124; var130++) {
                                    for (int var131 = var125; var131 <= var126; var131++) {
                                        Statics.field203[var96][var130][var131] &= ~var94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.m(IIIB)I")
    public static int method91(int arg0, int arg1, int arg2) {
        if ((field79[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field79[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("er.h(IIIB)I")
    public static final int method2698(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method164(var3, var5);
        int var8 = method164(var3 + 1, var5);
        int var9 = method164(var3, var5 + 1);
        int var10 = method164(var3 + 1, var5 + 1);
        int var11 = method570(var7, var8, var4, arg2);
        int var12 = method570(var9, var10, var4, arg2);
        return method570(var11, var12, var6, arg2);
    }

    @ObfuscatedName("c.e(IIIIB)I")
    public static final int method570(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class91.field1567[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("z.g(III)I")
    public static final int method164(int arg0, int arg1) {
        int var2 = method3195(arg0 - 1, arg1 - 1) + method3195(arg0 + 1, arg1 - 1) + method3195(arg0 - 1, arg1 + 1) + method3195(arg0 + 1, arg1 + 1);
        int var3 = method3195(arg0 - 1, arg1) + method3195(arg0 + 1, arg1) + method3195(arg0, arg1 - 1) + method3195(arg0, arg1 + 1);
        int var4 = method3195(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("fp.b(III)I")
    public static final int method3195(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cd.f(III)I")
    public static final int method1741(int arg0, int arg1) {
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

    @ObfuscatedName("ep.y(III)I")
    public static final int method2802(int arg0, int arg1) {
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

    @ObfuscatedName("ev.z(IIIB)I")
    public static final int method2942(int arg0, int arg1, int arg2) {
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
