package deob;

@ObfuscatedName("b")
public final class class6 {

    @ObfuscatedName("b.z")
    public static int[][][] field74 = new int[4][105][105];

    @ObfuscatedName("b.j")
    public static byte[][][] field82 = new byte[4][104][104];

    @ObfuscatedName("b.a")
    public static int field84 = 99;

    @ObfuscatedName("b.t")
    public static final int[] field83 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("b.k")
    public static final int[] field91 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("b.e")
    public static final int[] field81 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("b.v")
    public static final int[] field85 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("b.n")
    public static final int[] field73 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("b.d")
    public static final int[] field87 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("b.m")
    public static int field88 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("b.g")
    public static int field89 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("af.z(I)V")
    public static void method564() {
        field84 = 99;
        Statics.field75 = new byte[4][104][104];
        Statics.field76 = new byte[4][104][104];
        Statics.field77 = new byte[4][104][104];
        Statics.field1975 = new byte[4][104][104];
        Statics.field80 = new int[4][105][105];
        Statics.field1797 = new byte[4][105][105];
        Statics.field78 = new int[105][105];
        Statics.field355 = new int[104];
        Statics.field79 = new int[104];
        Statics.field1421 = new int[104];
        Statics.field2482 = new int[104];
        Statics.field1901 = new int[104];
    }

    @ObfuscatedName("b.j(IIIIB)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field1797[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field74[0][var5][var4] = field74[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field74[0][var5][var4] = field74[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field74[0][var5][var4] = field74[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field74[0][var5][var4] = field74[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.a([BIIII[Lgy;B)V")
    public static final void method515(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class195[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2933[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class107 var9 = new class107(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method670(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("j.y([BIIIIIII[Lgy;I)V")
    public static final void method7(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class195[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2933[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class107 var11 = new class107(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        method670(var11, arg1, arg2 + class155.method3323(var13 & 0x7, var14 & 0x7, arg7), arg3 + class155.method575(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method670(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.i(Ldq;IIIIIII)V")
    public static final void method670(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2122();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2122();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2122();
                }
            }
            return;
        }
        field82[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2122();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field74[0][arg2][arg3] = -method157(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field74[arg1][arg2][arg3] = field74[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2122();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field74[0][arg2][arg3] = -var8 * 8;
                } else {
                    field74[arg1][arg2][arg3] = field74[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field76[arg1][arg2][arg3] = arg0.method2201();
                Statics.field77[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1975[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field82[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field75[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ck.b(IIIIIILcc;Lgy;I)V")
    public static final void method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class195 arg7) {
        if (client.field250 && (field82[0][arg1][arg2] & 0x2) == 0) {
            if ((field82[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field82[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field82[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field459 != var8) {
                return;
            }
        }
        if (arg0 < field84) {
            field84 = arg0;
        }
        class36 var9 = class36.method167(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field823;
            var11 = var9.field822;
        } else {
            var10 = var9.field822;
            var11 = var9.field823;
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
        int[][] var16 = field74[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field835 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field847 == 1) {
            var21 += 256;
        }
        if (var9.method631()) {
            class20.method2578(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field250 || var9.field835 != 0 || var9.field824 == 1 || var9.field851) {
                class78 var22;
                if (var9.field830 == -1 && var9.field848 == null) {
                    var22 = var9.method632(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var9.field830, true, (class78) null);
                }
                arg6.method1608(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field824 == 1 && arg7 != null) {
                    arg7.method3508(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var45;
            if (var9.field830 == -1 && var9.field848 == null) {
                var45 = var9.method632(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            if (var45 != null && arg6.method1612(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field812) {
                int var46 = 15;
                if (var45 instanceof class98) {
                    var46 = ((class98) var45).method1983() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field1797[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field1797[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method3507(arg1, arg2, var10, var11, var9.field813);
            }
        } else if (arg5 >= 12) {
            class78 var23;
            if (var9.field830 == -1 && var9.field848 == null) {
                var23 = var9.method632(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1612(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field80[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method3507(arg1, arg2, var10, var11, var9.field813);
            }
        } else if (arg5 == 0) {
            class78 var24;
            if (var9.field830 == -1 && var9.field848 == null) {
                var24 = var9.method632(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1610(arg0, arg1, arg2, var17, var24, (class78) null, field83[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field812) {
                    Statics.field1797[arg0][arg1][arg2] = 50;
                    Statics.field1797[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field829) {
                    Statics.field80[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field812) {
                    Statics.field1797[arg0][arg1][arg2 + 1] = 50;
                    Statics.field1797[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field829) {
                    Statics.field80[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field812) {
                    Statics.field1797[arg0][arg1 + 1][arg2] = 50;
                    Statics.field1797[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field829) {
                    Statics.field80[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field812) {
                    Statics.field1797[arg0][arg1][arg2] = 50;
                    Statics.field1797[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field829) {
                    Statics.field80[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method3482(arg1, arg2, arg5, arg4, var9.field813);
            }
            if (var9.field826 != 16) {
                arg6.method1618(arg0, arg1, arg2, var9.field826);
            }
        } else if (arg5 == 1) {
            class78 var25;
            if (var9.field830 == -1 && var9.field848 == null) {
                var25 = var9.method632(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1610(arg0, arg1, arg2, var17, var25, (class78) null, field91[arg4], 0, var20, var21);
            if (var9.field812) {
                if (arg4 == 0) {
                    Statics.field1797[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1797[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1797[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1797[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method3482(arg1, arg2, arg5, arg4, var9.field813);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class78 var27;
            class78 var28;
            if (var9.field830 == -1 && var9.field848 == null) {
                var27 = var9.method632(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method632(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field830, true, (class78) null);
                var28 = new class11(arg3, 2, var26, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1610(arg0, arg1, arg2, var17, var27, var28, field83[arg4], field83[var26], var20, var21);
            if (var9.field829) {
                if (arg4 == 0) {
                    Statics.field80[arg0][arg1][arg2] |= 0x249;
                    Statics.field80[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field80[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field80[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field80[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field80[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field80[arg0][arg1][arg2] |= 0x492;
                    Statics.field80[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method3482(arg1, arg2, arg5, arg4, var9.field813);
            }
            if (var9.field826 != 16) {
                arg6.method1618(arg0, arg1, arg2, var9.field826);
            }
        } else if (arg5 == 3) {
            class78 var29;
            if (var9.field830 == -1 && var9.field848 == null) {
                var29 = var9.method632(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1610(arg0, arg1, arg2, var17, var29, (class78) null, field91[arg4], 0, var20, var21);
            if (var9.field812) {
                if (arg4 == 0) {
                    Statics.field1797[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field1797[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field1797[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field1797[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method3482(arg1, arg2, arg5, arg4, var9.field813);
            }
        } else if (arg5 == 9) {
            class78 var30;
            if (var9.field830 == -1 && var9.field848 == null) {
                var30 = var9.method632(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1612(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field824 != 0 && arg7 != null) {
                arg7.method3507(arg1, arg2, var10, var11, var9.field813);
            }
            if (var9.field826 != 16) {
                arg6.method1618(arg0, arg1, arg2, var9.field826);
            }
        } else if (arg5 == 4) {
            class78 var31;
            if (var9.field830 == -1 && var9.field848 == null) {
                var31 = var9.method632(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1611(arg0, arg1, arg2, var17, var31, (class78) null, field83[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1627(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class36.method167(var33 >> 14 & 0x7FFF).field826;
            }
            class78 var34;
            if (var9.field830 == -1 && var9.field848 == null) {
                var34 = var9.method632(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1611(arg0, arg1, arg2, var17, var34, (class78) null, field83[arg4], 0, field81[arg4] * var32, field85[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1627(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class36.method167(var36 >> 14 & 0x7FFF).field826 / 2;
            }
            class78 var37;
            if (var9.field830 == -1 && var9.field848 == null) {
                var37 = var9.method632(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1611(arg0, arg1, arg2, var17, var37, (class78) null, 256, arg4, field73[arg4] * var35, field87[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class78 var39;
            if (var9.field830 == -1 && var9.field848 == null) {
                var39 = var9.method632(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class11(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1611(arg0, arg1, arg2, var17, var39, (class78) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1627(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class36.method167(var41 >> 14 & 0x7FFF).field826 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class78 var43;
            class78 var44;
            if (var9.field830 == -1 && var9.field848 == null) {
                var43 = var9.method632(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method632(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field830, true, (class78) null);
                var44 = new class11(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field830, true, (class78) null);
            }
            arg6.method1611(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field73[arg4] * var40, field87[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("l.s(Lcc;[Lgy;I)V")
    public static final void method161(class79 arg0, class195[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field82[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field82[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3484(var3, var4);
                        }
                    }
                }
            }
        }
        field88 += (int) (Math.random() * 5.0D) - 2;
        if (field88 < -8) {
            field88 = -8;
        }
        if (field88 > 8) {
            field88 = 8;
        }
        field89 += (int) (Math.random() * 5.0D) - 2;
        if (field89 < -16) {
            field89 = -16;
        }
        if (field89 > 16) {
            field89 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field1797[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field74[var6][var11 + 1][var10] - field74[var6][var11 - 1][var10];
                    int var13 = field74[var6][var11][var10 + 1] - field74[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field78[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field355[var20] = 0;
                Statics.field79[var20] = 0;
                Statics.field1421[var20] = 0;
                Statics.field2482[var20] = 0;
                Statics.field1901[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field75[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            int var25 = var24 - 1;
                            class37 var26 = (class37) class37.field858.method3162((long) var25);
                            class37 var27;
                            if (var26 == null) {
                                byte[] var28 = Statics.field860.method2705(1, var25);
                                class37 var29 = new class37();
                                if (var28 != null) {
                                    var29.method673(new class107(var28), var25);
                                }
                                var29.method672();
                                class37.field858.method3171(var29, (long) var25);
                                var27 = var29;
                            } else {
                                var27 = var26;
                            }
                            Statics.field355[var22] += var27.field857;
                            Statics.field79[var22] += var27.field866;
                            Statics.field1421[var22] += var27.field862;
                            Statics.field2482[var22] += var27.field863;
                            var10002 = Statics.field1901[var22]++;
                        }
                    }
                    int var31 = var21 - 5;
                    if (var31 >= 0 && var31 < 104) {
                        int var32 = Statics.field75[var6][var31][var22] & 0xFF;
                        if (var32 > 0) {
                            int var33 = var32 - 1;
                            class37 var34 = (class37) class37.field858.method3162((long) var33);
                            class37 var35;
                            if (var34 == null) {
                                byte[] var36 = Statics.field860.method2705(1, var33);
                                class37 var37 = new class37();
                                if (var36 != null) {
                                    var37.method673(new class107(var36), var33);
                                }
                                var37.method672();
                                class37.field858.method3171(var37, (long) var33);
                                var35 = var37;
                            } else {
                                var35 = var34;
                            }
                            Statics.field355[var22] -= var35.field857;
                            Statics.field79[var22] -= var35.field866;
                            Statics.field1421[var22] -= var35.field862;
                            Statics.field2482[var22] -= var35.field863;
                            var10002 = Statics.field1901[var22]--;
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
                            var39 += Statics.field355[var45];
                            var40 += Statics.field79[var45];
                            var41 += Statics.field1421[var45];
                            var42 += Statics.field2482[var45];
                            var43 += Statics.field1901[var45];
                        }
                        int var46 = var44 - 5;
                        if (var46 >= 0 && var46 < 104) {
                            var39 -= Statics.field355[var46];
                            var40 -= Statics.field79[var46];
                            var41 -= Statics.field1421[var46];
                            var42 -= Statics.field2482[var46];
                            var43 -= Statics.field1901[var46];
                        }
                        if (var44 >= 1 && var44 < 103 && (!client.field250 || (field82[0][var21][var44] & 0x2) != 0 || (field82[var6][var21][var44] & 0x10) == 0 && method771(var6, var21, var44) == client.field459)) {
                            if (var6 < field84) {
                                field84 = var6;
                            }
                            int var47 = Statics.field75[var6][var21][var44] & 0xFF;
                            int var48 = Statics.field76[var6][var21][var44] & 0xFF;
                            if (var47 > 0 || var48 > 0) {
                                int var49 = field74[var6][var21][var44];
                                int var50 = field74[var6][var21 + 1][var44];
                                int var51 = field74[var6][var21 + 1][var44 + 1];
                                int var52 = field74[var6][var21][var44 + 1];
                                int var53 = Statics.field78[var21][var44];
                                int var54 = Statics.field78[var21 + 1][var44];
                                int var55 = Statics.field78[var21 + 1][var44 + 1];
                                int var56 = Statics.field78[var21][var44 + 1];
                                int var57 = -1;
                                int var58 = -1;
                                if (var47 > 0) {
                                    int var59 = var39 * 256 / var42;
                                    int var60 = var40 / var43;
                                    int var61 = var41 / var43;
                                    var57 = method1780(var59, var60, var61);
                                    int var62 = field88 + var59 & 0xFF;
                                    int var63 = field89 + var61;
                                    if (var63 < 0) {
                                        var63 = 0;
                                    } else if (var63 > 255) {
                                        var63 = 255;
                                    }
                                    var58 = method1780(var62, var60, var63);
                                }
                                if (var6 > 0) {
                                    boolean var64 = true;
                                    if (var47 == 0 && Statics.field77[var6][var21][var44] != 0) {
                                        var64 = false;
                                    }
                                    if (var48 > 0 && !class41.method566(var48 - 1).field940) {
                                        var64 = false;
                                    }
                                    if (var64 && var49 == var50 && var49 == var51 && var49 == var52) {
                                        Statics.field80[var6][var21][var44] |= 0x924;
                                    }
                                }
                                int var65 = 0;
                                if (var58 != -1) {
                                    var65 = class84.field1449[Statics.method3052(var58, 96)];
                                }
                                if (var48 == 0) {
                                    arg0.method1607(var6, var21, var44, 0, 0, -1, var49, var50, var51, var52, Statics.method3052(var57, var53), Statics.method3052(var57, var54), Statics.method3052(var57, var55), Statics.method3052(var57, var56), 0, 0, 0, 0, var65, 0);
                                } else {
                                    int var66 = Statics.field77[var6][var21][var44] + 1;
                                    byte var67 = Statics.field1975[var6][var21][var44];
                                    class41 var68 = class41.method566(var48 - 1);
                                    int var69 = var68.field933;
                                    int var70;
                                    int var71;
                                    if (var69 >= 0) {
                                        var70 = Statics.field1450.method1845(var69);
                                        var71 = -1;
                                    } else if (var68.field946 == 16711935) {
                                        var71 = -2;
                                        var69 = -1;
                                        var70 = -2;
                                    } else {
                                        var71 = method1780(var68.field935, var68.field938, var68.field931);
                                        int var72 = field88 + var68.field935 & 0xFF;
                                        int var73 = field89 + var68.field931;
                                        if (var73 < 0) {
                                            var73 = 0;
                                        } else if (var73 > 255) {
                                            var73 = 255;
                                        }
                                        var70 = method1780(var72, var68.field938, var73);
                                    }
                                    int var74 = 0;
                                    if (var70 != -2) {
                                        var74 = class84.field1449[method495(var70, 96)];
                                    }
                                    if (var68.field936 != -1) {
                                        int var75 = field88 + var68.field934 & 0xFF;
                                        int var76 = field89 + var68.field942;
                                        if (var76 < 0) {
                                            var76 = 0;
                                        } else if (var76 > 255) {
                                            var76 = 255;
                                        }
                                        int var77 = method1780(var75, var68.field941, var76);
                                        var74 = class84.field1449[method495(var77, 96)];
                                    }
                                    arg0.method1607(var6, var21, var44, var66, var67, var69, var49, var50, var51, var52, Statics.method3052(var57, var53), Statics.method3052(var57, var54), Statics.method3052(var57, var55), Statics.method3052(var57, var56), method495(var71, var53), method495(var71, var54), method495(var71, var55), method495(var71, var56), var65, var74);
                                }
                            }
                        }
                    }
                }
            }
            for (int var78 = 1; var78 < 103; var78++) {
                for (int var79 = 1; var79 < 103; var79++) {
                    int var84;
                    if ((field82[var6][var79][var78] & 0x8) != 0) {
                        var84 = 0;
                    } else if (var6 <= 0 || (field82[1][var79][var78] & 0x2) == 0) {
                        var84 = var6;
                    } else {
                        var84 = var6 - 1;
                    }
                    arg0.method1766(var6, var79, var78, var84);
                }
            }
            Statics.field75[var6] = (byte[][]) null;
            Statics.field76[var6] = (byte[][]) null;
            Statics.field77[var6] = (byte[][]) null;
            Statics.field1975[var6] = (byte[][]) null;
            Statics.field1797[var6] = (byte[][]) null;
        }
        arg0.method1727(-50, -10, -50);
        for (int var85 = 0; var85 < 104; var85++) {
            for (int var86 = 0; var86 < 104; var86++) {
                if ((field82[1][var85][var86] & 0x2) == 2) {
                    arg0.method1604(var85, var86);
                }
            }
        }
        int var87 = 1;
        int var88 = 2;
        int var89 = 4;
        for (int var90 = 0; var90 < 4; var90++) {
            if (var90 > 0) {
                var87 <<= 0x3;
                var88 <<= 0x3;
                var89 <<= 0x3;
            }
            for (int var91 = 0; var91 <= var90; var91++) {
                for (int var92 = 0; var92 <= 104; var92++) {
                    for (int var93 = 0; var93 <= 104; var93++) {
                        if ((Statics.field80[var91][var93][var92] & var87) != 0) {
                            int var94 = var92;
                            int var95 = var92;
                            int var96 = var91;
                            int var97 = var91;
                            while (var94 > 0 && (Statics.field80[var91][var93][var94 - 1] & var87) != 0) {
                                var94--;
                            }
                            while (var95 < 104 && (Statics.field80[var91][var93][var95 + 1] & var87) != 0) {
                                var95++;
                            }
                            label363: while (var96 > 0) {
                                for (int var98 = var94; var98 <= var95; var98++) {
                                    if ((Statics.field80[var96 - 1][var93][var98] & var87) == 0) {
                                        break label363;
                                    }
                                }
                                var96--;
                            }
                            label352: while (var97 < var90) {
                                for (int var99 = var94; var99 <= var95; var99++) {
                                    if ((Statics.field80[var97 + 1][var93][var99] & var87) == 0) {
                                        break label352;
                                    }
                                }
                                var97++;
                            }
                            int var100 = (var97 + 1 - var96) * (var95 - var94 + 1);
                            if (var100 >= 8) {
                                short var101 = 240;
                                int var102 = field74[var97][var93][var94] - var101;
                                int var103 = field74[var96][var93][var94];
                                class79.method1646(var90, 1, var93 * 128, var93 * 128, var94 * 128, var95 * 128 + 128, var102, var103);
                                for (int var104 = var96; var104 <= var97; var104++) {
                                    for (int var105 = var94; var105 <= var95; var105++) {
                                        Statics.field80[var104][var93][var105] &= ~var87;
                                    }
                                }
                            }
                        }
                        if ((Statics.field80[var91][var93][var92] & var88) != 0) {
                            int var106 = var93;
                            int var107 = var93;
                            int var108 = var91;
                            int var109 = var91;
                            while (var106 > 0 && (Statics.field80[var91][var106 - 1][var92] & var88) != 0) {
                                var106--;
                            }
                            while (var107 < 104 && (Statics.field80[var91][var107 + 1][var92] & var88) != 0) {
                                var107++;
                            }
                            label416: while (var108 > 0) {
                                for (int var110 = var106; var110 <= var107; var110++) {
                                    if ((Statics.field80[var108 - 1][var110][var92] & var88) == 0) {
                                        break label416;
                                    }
                                }
                                var108--;
                            }
                            label405: while (var109 < var90) {
                                for (int var111 = var106; var111 <= var107; var111++) {
                                    if ((Statics.field80[var109 + 1][var111][var92] & var88) == 0) {
                                        break label405;
                                    }
                                }
                                var109++;
                            }
                            int var112 = (var109 + 1 - var108) * (var107 - var106 + 1);
                            if (var112 >= 8) {
                                short var113 = 240;
                                int var114 = field74[var109][var106][var92] - var113;
                                int var115 = field74[var108][var106][var92];
                                class79.method1646(var90, 2, var106 * 128, var107 * 128 + 128, var92 * 128, var92 * 128, var114, var115);
                                for (int var116 = var108; var116 <= var109; var116++) {
                                    for (int var117 = var106; var117 <= var107; var117++) {
                                        Statics.field80[var116][var117][var92] &= ~var88;
                                    }
                                }
                            }
                        }
                        if ((Statics.field80[var91][var93][var92] & var89) != 0) {
                            int var118 = var93;
                            int var119 = var93;
                            int var120 = var92;
                            int var121 = var92;
                            while (var120 > 0 && (Statics.field80[var91][var93][var120 - 1] & var89) != 0) {
                                var120--;
                            }
                            while (var121 < 104 && (Statics.field80[var91][var93][var121 + 1] & var89) != 0) {
                                var121++;
                            }
                            label469: while (var118 > 0) {
                                for (int var122 = var120; var122 <= var121; var122++) {
                                    if ((Statics.field80[var91][var118 - 1][var122] & var89) == 0) {
                                        break label469;
                                    }
                                }
                                var118--;
                            }
                            label458: while (var119 < 104) {
                                for (int var123 = var120; var123 <= var121; var123++) {
                                    if ((Statics.field80[var91][var119 + 1][var123] & var89) == 0) {
                                        break label458;
                                    }
                                }
                                var119++;
                            }
                            if ((var119 - var118 + 1) * (var121 - var120 + 1) >= 4) {
                                int var124 = field74[var91][var118][var120];
                                class79.method1646(var90, 4, var118 * 128, var119 * 128 + 128, var120 * 128, var121 * 128 + 128, var124, var124);
                                for (int var125 = var118; var125 <= var119; var125++) {
                                    for (int var126 = var120; var126 <= var121; var126++) {
                                        Statics.field80[var91][var125][var126] &= ~var89;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.q(IIII)I")
    public static int method771(int arg0, int arg1, int arg2) {
        if ((field82[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field82[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("l.p(III)I")
    public static final int method157(int arg0, int arg1) {
        int var2 = method2546(arg0 + 45365, arg1 + 91923, 4) - 128 + (method2546(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method2546(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("di.h(IIII)I")
    public static final int method2546(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method154(var3, var5);
        int var8 = method154(var3 + 1, var5);
        int var9 = method154(var3, var5 + 1);
        int var10 = method154(var3 + 1, var5 + 1);
        int var11 = 65536 - class84.field1454[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class84.field1454[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class84.field1454[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("c.r(IIB)I")
    public static final int method154(int arg0, int arg1) {
        int var2 = method2474(arg0 - 1, arg1 - 1) + method2474(arg0 + 1, arg1 - 1) + method2474(arg0 - 1, arg1 + 1) + method2474(arg0 + 1, arg1 + 1);
        int var3 = method2474(arg0 - 1, arg1) + method2474(arg0 + 1, arg1) + method2474(arg0, arg1 - 1) + method2474(arg0, arg1 + 1);
        int var4 = method2474(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("dm.o(III)I")
    public static final int method2474(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("v.u(III)I")
    public static final int method495(int arg0, int arg1) {
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

    @ObfuscatedName("cq.c(IIII)I")
    public static final int method1780(int arg0, int arg1, int arg2) {
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
