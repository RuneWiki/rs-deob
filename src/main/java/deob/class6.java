package deob;

@ObfuscatedName("e")
public final class class6 {

    @ObfuscatedName("e.y")
    public static int[][][] field89 = new int[4][105][105];

    @ObfuscatedName("e.k")
    public static byte[][][] field71 = new byte[4][104][104];

    @ObfuscatedName("e.g")
    public static int field72 = 99;

    @ObfuscatedName("e.x")
    public static final int[] field93 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("e.m")
    public static final int[] field81 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("e.a")
    public static final int[] field82 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("e.p")
    public static final int[] field83 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("e.c")
    public static final int[] field80 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("e.u")
    public static final int[] field85 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("e.d")
    public static int field86 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("e.o")
    public static int field87 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.y(IIIIB)V")
    public static final void method962(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field76[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field89[0][var5][var4] = field89[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field89[0][var5][var4] = field89[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field89[0][var5][var4] = field89[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field89[0][var5][var4] = field89[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("bp.k([BIIII[Lhd;I)V")
    public static final void method1364(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class220[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field3130[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class111 var9 = new class111(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method2791(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("dv.g([BIIIIIII[Lhd;B)V")
    public static final void method2093(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class220[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3130[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class111 var11 = new class111(arg0);
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
                        method2791(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method2791(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("el.n(Ldw;IIIIIIB)V")
    public static final void method2791(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2205();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2205();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2205();
                }
            }
            return;
        }
        field71[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2205();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field89[0][arg2][arg3] = -Statics.method3071(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field89[arg1][arg2][arg3] = field89[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2205();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field89[0][arg2][arg3] = -var8 * 8;
                } else {
                    field89[arg1][arg2][arg3] = field89[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field74[arg1][arg2][arg3] = arg0.method2199();
                Statics.field78[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field649[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field71[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field92[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("an.t([BIILck;[Lhd;B)V")
    public static final void method642(byte[] arg0, int arg1, int arg2, class81 arg3, class220[] arg4) {
        class111 var5 = new class111(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2173();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2173();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2205();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field71[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class220 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method11(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("k.e(IIIIIILck;Lhd;I)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class220 arg7) {
        if (client.field267 && (field71[0][arg1][arg2] & 0x2) == 0) {
            if ((field71[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (Statics.method2529(arg0, arg1, arg2) != client.field464) {
                return;
            }
        }
        if (arg0 < field72) {
            field72 = arg0;
        }
        class38 var8 = class38.method167(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field887;
            var10 = var8.field886;
        } else {
            var9 = var8.field886;
            var10 = var8.field887;
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
        int[][] var15 = field89[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field890 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field911 == 1) {
            var20 += 256;
        }
        if (var8.method736()) {
            class22.method882(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field267 || var8.field890 != 0 || var8.field917 == 1 || var8.field909) {
                class80 var21;
                if (var8.field870 == -1 && var8.field894 == null) {
                    var21 = var8.method713(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var8.field870, true, (class80) null);
                }
                arg6.method1643(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field917 == 1 && arg7 != null) {
                    arg7.method3743(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var44;
            if (var8.field870 == -1 && var8.field894 == null) {
                var44 = var8.method713(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            if (var44 != null && arg6.method1720(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field902) {
                int var45 = 15;
                if (var44 instanceof class100) {
                    var45 = ((class100) var44).method2002() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field76[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field76[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field917 != 0 && arg7 != null) {
                arg7.method3760(arg1, arg2, var9, var10, var8.field893);
            }
        } else if (arg5 >= 12) {
            class80 var22;
            if (var8.field870 == -1 && var8.field894 == null) {
                var22 = var8.method713(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1720(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field931[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field917 != 0 && arg7 != null) {
                arg7.method3760(arg1, arg2, var9, var10, var8.field893);
            }
        } else if (arg5 == 0) {
            class80 var23;
            if (var8.field870 == -1 && var8.field894 == null) {
                var23 = var8.method713(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1695(arg0, arg1, arg2, var16, var23, (class80) null, field93[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field902) {
                    Statics.field76[arg0][arg1][arg2] = 50;
                    Statics.field76[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field889) {
                    Statics.field931[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field902) {
                    Statics.field76[arg0][arg1][arg2 + 1] = 50;
                    Statics.field76[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field889) {
                    Statics.field931[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field902) {
                    Statics.field76[arg0][arg1 + 1][arg2] = 50;
                    Statics.field76[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field889) {
                    Statics.field931[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field902) {
                    Statics.field76[arg0][arg1][arg2] = 50;
                    Statics.field76[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field889) {
                    Statics.field931[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field917 != 0 && arg7 != null) {
                arg7.method3742(arg1, arg2, arg5, arg4, var8.field893);
            }
            if (var8.field895 != 16) {
                arg6.method1653(arg0, arg1, arg2, var8.field895);
            }
        } else if (arg5 == 1) {
            class80 var24;
            if (var8.field870 == -1 && var8.field894 == null) {
                var24 = var8.method713(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1695(arg0, arg1, arg2, var16, var24, (class80) null, field81[arg4], 0, var19, var20);
            if (var8.field902) {
                if (arg4 == 0) {
                    Statics.field76[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field76[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field76[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field76[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field917 != 0 && arg7 != null) {
                arg7.method3742(arg1, arg2, arg5, arg4, var8.field893);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class80 var26;
            class80 var27;
            if (var8.field870 == -1 && var8.field894 == null) {
                var26 = var8.method713(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method713(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field870, true, (class80) null);
                var27 = new class12(arg3, 2, var25, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1695(arg0, arg1, arg2, var16, var26, var27, field93[arg4], field93[var25], var19, var20);
            if (var8.field889) {
                if (arg4 == 0) {
                    Statics.field931[arg0][arg1][arg2] |= 0x249;
                    Statics.field931[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field931[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field931[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field931[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field931[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field931[arg0][arg1][arg2] |= 0x492;
                    Statics.field931[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field917 != 0 && arg7 != null) {
                arg7.method3742(arg1, arg2, arg5, arg4, var8.field893);
            }
            if (var8.field895 != 16) {
                arg6.method1653(arg0, arg1, arg2, var8.field895);
            }
        } else if (arg5 == 3) {
            class80 var28;
            if (var8.field870 == -1 && var8.field894 == null) {
                var28 = var8.method713(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1695(arg0, arg1, arg2, var16, var28, (class80) null, field81[arg4], 0, var19, var20);
            if (var8.field902) {
                if (arg4 == 0) {
                    Statics.field76[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field76[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field76[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field76[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field917 != 0 && arg7 != null) {
                arg7.method3742(arg1, arg2, arg5, arg4, var8.field893);
            }
        } else if (arg5 == 9) {
            class80 var29;
            if (var8.field870 == -1 && var8.field894 == null) {
                var29 = var8.method713(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1720(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field917 != 0 && arg7 != null) {
                arg7.method3760(arg1, arg2, var9, var10, var8.field893);
            }
            if (var8.field895 != 16) {
                arg6.method1653(arg0, arg1, arg2, var8.field895);
            }
        } else if (arg5 == 4) {
            class80 var30;
            if (var8.field870 == -1 && var8.field894 == null) {
                var30 = var8.method713(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1646(arg0, arg1, arg2, var16, var30, (class80) null, field93[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1645(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class38.method167(var32 >> 14 & 0x7FFF).field895;
            }
            class80 var33;
            if (var8.field870 == -1 && var8.field894 == null) {
                var33 = var8.method713(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1646(arg0, arg1, arg2, var16, var33, (class80) null, field93[arg4], 0, field82[arg4] * var31, field83[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1645(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class38.method167(var35 >> 14 & 0x7FFF).field895 / 2;
            }
            class80 var36;
            if (var8.field870 == -1 && var8.field894 == null) {
                var36 = var8.method713(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1646(arg0, arg1, arg2, var16, var36, (class80) null, 256, arg4, field80[arg4] * var34, field85[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class80 var38;
            if (var8.field870 == -1 && var8.field894 == null) {
                var38 = var8.method713(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class12(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1646(arg0, arg1, arg2, var16, var38, (class80) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1645(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class38.method167(var40 >> 14 & 0x7FFF).field895 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class80 var42;
            class80 var43;
            if (var8.field870 == -1 && var8.field894 == null) {
                var42 = var8.method713(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method713(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field870, true, (class80) null);
                var43 = new class12(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field870, true, (class80) null);
            }
            arg6.method1646(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field80[arg4] * var39, field85[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("a.q(Lck;[Lhd;I)V")
    public static final void method510(class81 arg0, class220[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field71[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field71[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3744(var3, var4);
                        }
                    }
                }
            }
        }
        field86 += (int) (Math.random() * 5.0D) - 2;
        if (field86 < -8) {
            field86 = -8;
        }
        if (field86 > 8) {
            field86 = 8;
        }
        field87 += (int) (Math.random() * 5.0D) - 2;
        if (field87 < -16) {
            field87 = -16;
        }
        if (field87 > 16) {
            field87 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field76[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field89[var6][var11 + 1][var10] - field89[var6][var11 - 1][var10];
                    int var13 = field89[var6][var11][var10 + 1] - field89[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field77[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field921[var20] = 0;
                Statics.field1098[var20] = 0;
                Statics.field1979[var20] = 0;
                Statics.field2057[var20] = 0;
                Statics.field2824[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field92[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class39 var25 = class39.method837(var24 - 1);
                            Statics.field921[var22] += var25.field924;
                            Statics.field1098[var22] += var25.field923;
                            Statics.field1979[var22] += var25.field926;
                            Statics.field2057[var22] += var25.field927;
                            var10002 = Statics.field2824[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field92[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class39 var28 = class39.method837(var27 - 1);
                            Statics.field921[var22] -= var28.field924;
                            Statics.field1098[var22] -= var28.field923;
                            Statics.field1979[var22] -= var28.field926;
                            Statics.field2057[var22] -= var28.field927;
                            var10002 = Statics.field2824[var22]--;
                        }
                    }
                }
                if (var21 >= 1 && var21 < 103) {
                    int var29 = 0;
                    int var30 = 0;
                    int var31 = 0;
                    int var32 = 0;
                    int var33 = 0;
                    for (int var34 = -5; var34 < 109; var34++) {
                        int var35 = var34 + 5;
                        if (var35 >= 0 && var35 < 104) {
                            var29 += Statics.field921[var35];
                            var30 += Statics.field1098[var35];
                            var31 += Statics.field1979[var35];
                            var32 += Statics.field2057[var35];
                            var33 += Statics.field2824[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field921[var36];
                            var30 -= Statics.field1098[var36];
                            var31 -= Statics.field1979[var36];
                            var32 -= Statics.field2057[var36];
                            var33 -= Statics.field2824[var36];
                        }
                        if (var34 >= 1 && var34 < 103 && (!client.field267 || (field71[0][var21][var34] & 0x2) != 0 || (field71[var6][var21][var34] & 0x10) == 0 && Statics.method2529(var6, var21, var34) == client.field464)) {
                            if (var6 < field72) {
                                field72 = var6;
                            }
                            int var37 = Statics.field92[var6][var21][var34] & 0xFF;
                            int var38 = Statics.field74[var6][var21][var34] & 0xFF;
                            if (var37 > 0 || var38 > 0) {
                                int var39 = field89[var6][var21][var34];
                                int var40 = field89[var6][var21 + 1][var34];
                                int var41 = field89[var6][var21 + 1][var34 + 1];
                                int var42 = field89[var6][var21][var34 + 1];
                                int var43 = Statics.field77[var21][var34];
                                int var44 = Statics.field77[var21 + 1][var34];
                                int var45 = Statics.field77[var21 + 1][var34 + 1];
                                int var46 = Statics.field77[var21][var34 + 1];
                                int var47 = -1;
                                int var48 = -1;
                                if (var37 > 0) {
                                    int var49 = var29 * 256 / var32;
                                    int var50 = var30 / var33;
                                    int var51 = var31 / var33;
                                    var47 = method1994(var49, var50, var51);
                                    int var52 = field86 + var49 & 0xFF;
                                    int var53 = field87 + var51;
                                    if (var53 < 0) {
                                        var53 = 0;
                                    } else if (var53 > 255) {
                                        var53 = 255;
                                    }
                                    var48 = method1994(var52, var50, var53);
                                }
                                if (var6 > 0) {
                                    boolean var54 = true;
                                    if (var37 == 0 && Statics.field78[var6][var21][var34] != 0) {
                                        var54 = false;
                                    }
                                    if (var38 > 0 && !class43.method3(var38 - 1).field992) {
                                        var54 = false;
                                    }
                                    if (var54 && var39 == var40 && var39 == var41 && var39 == var42) {
                                        Statics.field931[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var55 = 0;
                                if (var48 != -1) {
                                    var55 = class86.field1506[method485(var48, 96)];
                                }
                                if (var38 == 0) {
                                    arg0.method1642(var6, var21, var34, 0, 0, -1, var39, var40, var41, var42, method485(var47, var43), method485(var47, var44), method485(var47, var45), method485(var47, var46), 0, 0, 0, 0, var55, 0);
                                } else {
                                    int var56 = Statics.field78[var6][var21][var34] + 1;
                                    byte var57 = Statics.field649[var6][var21][var34];
                                    class43 var58 = class43.method3(var38 - 1);
                                    int var59 = var58.field995;
                                    int var60;
                                    int var61;
                                    if (var59 >= 0) {
                                        var60 = Statics.field1507.method1871(var59);
                                        var61 = -1;
                                    } else if (var58.field994 == 16711935) {
                                        var61 = -2;
                                        var59 = -1;
                                        var60 = -2;
                                    } else {
                                        var61 = method1994(var58.field998, var58.field996, var58.field1003);
                                        int var62 = field86 + var58.field998 & 0xFF;
                                        int var63 = field87 + var58.field1003;
                                        if (var63 < 0) {
                                            var63 = 0;
                                        } else if (var63 > 255) {
                                            var63 = 255;
                                        }
                                        var60 = method1994(var62, var58.field996, var63);
                                    }
                                    int var64 = 0;
                                    if (var60 != -2) {
                                        var64 = class86.field1506[method1897(var60, 96)];
                                    }
                                    if (var58.field997 != -1) {
                                        int var65 = field86 + var58.field1001 & 0xFF;
                                        int var66 = field87 + var58.field999;
                                        if (var66 < 0) {
                                            var66 = 0;
                                        } else if (var66 > 255) {
                                            var66 = 255;
                                        }
                                        int var67 = method1994(var65, var58.field1002, var66);
                                        var64 = class86.field1506[method1897(var67, 96)];
                                    }
                                    arg0.method1642(var6, var21, var34, var56, var57, var59, var39, var40, var41, var42, method485(var47, var43), method485(var47, var44), method485(var47, var45), method485(var47, var46), method1897(var61, var43), method1897(var61, var44), method1897(var61, var45), method1897(var61, var46), var55, var64);
                                }
                            }
                        }
                    }
                }
            }
            for (int var68 = 1; var68 < 103; var68++) {
                for (int var69 = 1; var69 < 103; var69++) {
                    arg0.method1641(var6, var69, var68, Statics.method2529(var6, var69, var68));
                }
            }
            Statics.field92[var6] = (byte[][]) null;
            Statics.field74[var6] = (byte[][]) null;
            Statics.field78[var6] = (byte[][]) null;
            Statics.field649[var6] = (byte[][]) null;
            Statics.field76[var6] = (byte[][]) null;
        }
        arg0.method1668(-50, -10, -50);
        for (int var70 = 0; var70 < 104; var70++) {
            for (int var71 = 0; var71 < 104; var71++) {
                if ((field71[1][var70][var71] & 0x2) == 2) {
                    arg0.method1688(var70, var71);
                }
            }
        }
        int var72 = 1;
        int var73 = 2;
        int var74 = 4;
        for (int var75 = 0; var75 < 4; var75++) {
            if (var75 > 0) {
                var72 <<= 0x3;
                var73 <<= 0x3;
                var74 <<= 0x3;
            }
            for (int var76 = 0; var76 <= var75; var76++) {
                for (int var77 = 0; var77 <= 104; var77++) {
                    for (int var78 = 0; var78 <= 104; var78++) {
                        if ((Statics.field931[var76][var78][var77] & var72) != 0) {
                            int var79 = var77;
                            int var80 = var77;
                            int var81 = var76;
                            int var82 = var76;
                            while (var79 > 0 && (Statics.field931[var76][var78][var79 - 1] & var72) != 0) {
                                var79--;
                            }
                            while (var80 < 104 && (Statics.field931[var76][var78][var80 + 1] & var72) != 0) {
                                var80++;
                            }
                            label339: while (var81 > 0) {
                                for (int var83 = var79; var83 <= var80; var83++) {
                                    if ((Statics.field931[var81 - 1][var78][var83] & var72) == 0) {
                                        break label339;
                                    }
                                }
                                var81--;
                            }
                            label328: while (var82 < var75) {
                                for (int var84 = var79; var84 <= var80; var84++) {
                                    if ((Statics.field931[var82 + 1][var78][var84] & var72) == 0) {
                                        break label328;
                                    }
                                }
                                var82++;
                            }
                            int var85 = (var82 + 1 - var81) * (var80 - var79 + 1);
                            if (var85 >= 8) {
                                short var86 = 240;
                                int var87 = field89[var82][var78][var79] - var86;
                                int var88 = field89[var81][var78][var79];
                                class81.method1742(var75, 1, var78 * 128, var78 * 128, var79 * 128, var80 * 128 + 128, var87, var88);
                                for (int var89 = var81; var89 <= var82; var89++) {
                                    for (int var90 = var79; var90 <= var80; var90++) {
                                        Statics.field931[var89][var78][var90] &= ~var72;
                                    }
                                }
                            }
                        }
                        if ((Statics.field931[var76][var78][var77] & var73) != 0) {
                            int var91 = var78;
                            int var92 = var78;
                            int var93 = var76;
                            int var94 = var76;
                            while (var91 > 0 && (Statics.field931[var76][var91 - 1][var77] & var73) != 0) {
                                var91--;
                            }
                            while (var92 < 104 && (Statics.field931[var76][var92 + 1][var77] & var73) != 0) {
                                var92++;
                            }
                            label392: while (var93 > 0) {
                                for (int var95 = var91; var95 <= var92; var95++) {
                                    if ((Statics.field931[var93 - 1][var95][var77] & var73) == 0) {
                                        break label392;
                                    }
                                }
                                var93--;
                            }
                            label381: while (var94 < var75) {
                                for (int var96 = var91; var96 <= var92; var96++) {
                                    if ((Statics.field931[var94 + 1][var96][var77] & var73) == 0) {
                                        break label381;
                                    }
                                }
                                var94++;
                            }
                            int var97 = (var94 + 1 - var93) * (var92 - var91 + 1);
                            if (var97 >= 8) {
                                short var98 = 240;
                                int var99 = field89[var94][var91][var77] - var98;
                                int var100 = field89[var93][var91][var77];
                                class81.method1742(var75, 2, var91 * 128, var92 * 128 + 128, var77 * 128, var77 * 128, var99, var100);
                                for (int var101 = var93; var101 <= var94; var101++) {
                                    for (int var102 = var91; var102 <= var92; var102++) {
                                        Statics.field931[var101][var102][var77] &= ~var73;
                                    }
                                }
                            }
                        }
                        if ((Statics.field931[var76][var78][var77] & var74) != 0) {
                            int var103 = var78;
                            int var104 = var78;
                            int var105 = var77;
                            int var106 = var77;
                            while (var105 > 0 && (Statics.field931[var76][var78][var105 - 1] & var74) != 0) {
                                var105--;
                            }
                            while (var106 < 104 && (Statics.field931[var76][var78][var106 + 1] & var74) != 0) {
                                var106++;
                            }
                            label445: while (var103 > 0) {
                                for (int var107 = var105; var107 <= var106; var107++) {
                                    if ((Statics.field931[var76][var103 - 1][var107] & var74) == 0) {
                                        break label445;
                                    }
                                }
                                var103--;
                            }
                            label434: while (var104 < 104) {
                                for (int var108 = var105; var108 <= var106; var108++) {
                                    if ((Statics.field931[var76][var104 + 1][var108] & var74) == 0) {
                                        break label434;
                                    }
                                }
                                var104++;
                            }
                            if ((var104 - var103 + 1) * (var106 - var105 + 1) >= 4) {
                                int var109 = field89[var76][var103][var105];
                                class81.method1742(var75, 4, var103 * 128, var104 * 128 + 128, var105 * 128, var106 * 128 + 128, var109, var109);
                                for (int var110 = var103; var110 <= var104; var110++) {
                                    for (int var111 = var105; var111 <= var106; var111++) {
                                        Statics.field931[var76][var110][var111] &= ~var74;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("et.b(IIII)I")
    public static final int method2796(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1060(var3, var5);
        int var8 = method1060(var3 + 1, var5);
        int var9 = method1060(var3, var5 + 1);
        int var10 = method1060(var3 + 1, var5 + 1);
        int var11 = method1361(var7, var8, var4, arg2);
        int var12 = method1361(var9, var10, var4, arg2);
        return method1361(var11, var12, var6, arg2);
    }

    @ObfuscatedName("bp.f(IIIII)I")
    public static final int method1361(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class86.field1501[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ad.i(III)I")
    public static final int method1060(int arg0, int arg1) {
        int var2 = method639(arg0 - 1, arg1 - 1) + method639(arg0 + 1, arg1 - 1) + method639(arg0 - 1, arg1 + 1) + method639(arg0 + 1, arg1 + 1);
        int var3 = method639(arg0 - 1, arg1) + method639(arg0 + 1, arg1) + method639(arg0, arg1 - 1) + method639(arg0, arg1 + 1);
        int var4 = method639(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("am.w(III)I")
    public static final int method639(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("client.l(III)I")
    public static final int method485(int arg0, int arg1) {
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

    @ObfuscatedName("cw.j(III)I")
    public static final int method1897(int arg0, int arg1) {
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

    @ObfuscatedName("ci.s(IIIB)I")
    public static final int method1994(int arg0, int arg1, int arg2) {
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
