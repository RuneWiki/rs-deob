package deob;

@ObfuscatedName("m")
public final class class6 {

    @ObfuscatedName("m.g")
    public static int[][][] field93 = new int[4][105][105];

    @ObfuscatedName("m.s")
    public static byte[][][] field80 = new byte[4][104][104];

    @ObfuscatedName("m.v")
    public static int field75 = 99;

    @ObfuscatedName("m.w")
    public static final int[] field91 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("m.z")
    public static final int[] field81 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("m.x")
    public static final int[] field82 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("m.e")
    public static final int[] field90 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("m.a")
    public static final int[] field84 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("m.y")
    public static final int[] field85 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("m.f")
    public static int field87 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("m.u")
    public static int field83 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("o.g(IIIII)V")
    public static final void method29(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field580[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field93[0][var5][var4] = field93[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field93[0][var5][var4] = field93[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field93[0][var5][var4] = field93[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field93[0][var5][var4] = field93[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.s(Lde;IIIIIIB)V")
    public static final void method737(class107 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2116();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2116();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2116();
                }
            }
            return;
        }
        field80[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2116();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field93[0][arg2][arg3] = -Statics.method2861(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field93[arg1][arg2][arg3] = field93[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2116();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field93[0][arg2][arg3] = -var8 * 8;
                } else {
                    field93[arg1][arg2][arg3] = field93[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field77[arg1][arg2][arg3] = arg0.method2093();
                Statics.field78[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field74[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field80[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field76[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("m.v([BIII)Z")
    public static final boolean method65(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class107 var4 = new class107(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2112();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2112();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2116() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class36 var16 = class36.method2624(var5);
                        if (var13 != 22 || !client.field267 || var16.field847 != 0 || var16.field845 == 1 || var16.field828) {
                            if (!var16.method646()) {
                                client.field272++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2112();
                if (var9 == 0) {
                    break;
                }
                var4.method2116();
            }
        }
    }

    @ObfuscatedName("w.o([BIILcb;[Lgo;B)V")
    public static final void method460(byte[] arg0, int arg1, int arg2, class79 arg3, class198[] arg4) {
        class107 var5 = new class107(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2112();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2112();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2116();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field80[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class198 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method2364(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("du.k(IIIIIILcb;Lgo;I)V")
    public static final void method2364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class198 arg7) {
        if (client.field267 && (field80[0][arg1][arg2] & 0x2) == 0) {
            if ((field80[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (method1(arg0, arg1, arg2) != client.field397) {
                return;
            }
        }
        if (arg0 < field75) {
            field75 = arg0;
        }
        class36 var8 = class36.method2624(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field844;
            var10 = var8.field843;
        } else {
            var9 = var8.field843;
            var10 = var8.field844;
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
        int[][] var15 = field93[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field847 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field868 == 1) {
            var20 += 256;
        }
        if (var8.method665()) {
            class20.method44(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field267 || var8.field847 != 0 || var8.field845 == 1 || var8.field828) {
                class78 var21;
                if (var8.field833 == -1 && var8.field870 == null) {
                    var21 = var8.method647(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var8.field833, true, (class78) null);
                }
                arg6.method1582(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field845 == 1 && arg7 != null) {
                    arg7.method3453(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var44;
            if (var8.field833 == -1 && var8.field870 == null) {
                var44 = var8.method647(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            if (var44 != null && arg6.method1586(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field837) {
                int var45 = 15;
                if (var44 instanceof class98) {
                    var45 = ((class98) var44).method1952() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > Statics.field580[arg0][arg1 + var46][arg2 + var47]) {
                            Statics.field580[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field845 != 0 && arg7 != null) {
                arg7.method3451(arg1, arg2, var9, var10, var8.field846);
            }
        } else if (arg5 >= 12) {
            class78 var22;
            if (var8.field833 == -1 && var8.field870 == null) {
                var22 = var8.method647(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1586(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field676[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field845 != 0 && arg7 != null) {
                arg7.method3451(arg1, arg2, var9, var10, var8.field846);
            }
        } else if (arg5 == 0) {
            class78 var23;
            if (var8.field833 == -1 && var8.field870 == null) {
                var23 = var8.method647(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1709(arg0, arg1, arg2, var16, var23, (class78) null, field91[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field837) {
                    Statics.field580[arg0][arg1][arg2] = 50;
                    Statics.field580[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field850) {
                    Statics.field676[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field837) {
                    Statics.field580[arg0][arg1][arg2 + 1] = 50;
                    Statics.field580[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field850) {
                    Statics.field676[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field837) {
                    Statics.field580[arg0][arg1 + 1][arg2] = 50;
                    Statics.field580[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field850) {
                    Statics.field676[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field837) {
                    Statics.field580[arg0][arg1][arg2] = 50;
                    Statics.field580[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field850) {
                    Statics.field676[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field845 != 0 && arg7 != null) {
                arg7.method3473(arg1, arg2, arg5, arg4, var8.field846);
            }
            if (var8.field827 != 16) {
                arg6.method1689(arg0, arg1, arg2, var8.field827);
            }
        } else if (arg5 == 1) {
            class78 var24;
            if (var8.field833 == -1 && var8.field870 == null) {
                var24 = var8.method647(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1709(arg0, arg1, arg2, var16, var24, (class78) null, field81[arg4], 0, var19, var20);
            if (var8.field837) {
                if (arg4 == 0) {
                    Statics.field580[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field580[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field580[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field580[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field845 != 0 && arg7 != null) {
                arg7.method3473(arg1, arg2, arg5, arg4, var8.field846);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class78 var26;
            class78 var27;
            if (var8.field833 == -1 && var8.field870 == null) {
                var26 = var8.method647(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method647(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field833, true, (class78) null);
                var27 = new class11(arg3, 2, var25, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1709(arg0, arg1, arg2, var16, var26, var27, field91[arg4], field91[var25], var19, var20);
            if (var8.field850) {
                if (arg4 == 0) {
                    Statics.field676[arg0][arg1][arg2] |= 0x249;
                    Statics.field676[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field676[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field676[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field676[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field676[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field676[arg0][arg1][arg2] |= 0x492;
                    Statics.field676[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field845 != 0 && arg7 != null) {
                arg7.method3473(arg1, arg2, arg5, arg4, var8.field846);
            }
            if (var8.field827 != 16) {
                arg6.method1689(arg0, arg1, arg2, var8.field827);
            }
        } else if (arg5 == 3) {
            class78 var28;
            if (var8.field833 == -1 && var8.field870 == null) {
                var28 = var8.method647(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1709(arg0, arg1, arg2, var16, var28, (class78) null, field81[arg4], 0, var19, var20);
            if (var8.field837) {
                if (arg4 == 0) {
                    Statics.field580[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field580[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field580[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field580[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field845 != 0 && arg7 != null) {
                arg7.method3473(arg1, arg2, arg5, arg4, var8.field846);
            }
        } else if (arg5 == 9) {
            class78 var29;
            if (var8.field833 == -1 && var8.field870 == null) {
                var29 = var8.method647(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1586(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field845 != 0 && arg7 != null) {
                arg7.method3451(arg1, arg2, var9, var10, var8.field846);
            }
            if (var8.field827 != 16) {
                arg6.method1689(arg0, arg1, arg2, var8.field827);
            }
        } else if (arg5 == 4) {
            class78 var30;
            if (var8.field833 == -1 && var8.field870 == null) {
                var30 = var8.method647(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1697(arg0, arg1, arg2, var16, var30, (class78) null, field91[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1602(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class36.method2624(var32 >> 14 & 0x7FFF).field827;
            }
            class78 var33;
            if (var8.field833 == -1 && var8.field870 == null) {
                var33 = var8.method647(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1697(arg0, arg1, arg2, var16, var33, (class78) null, field91[arg4], 0, field82[arg4] * var31, field90[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1602(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class36.method2624(var35 >> 14 & 0x7FFF).field827 / 2;
            }
            class78 var36;
            if (var8.field833 == -1 && var8.field870 == null) {
                var36 = var8.method647(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1697(arg0, arg1, arg2, var16, var36, (class78) null, 256, arg4, field84[arg4] * var34, field85[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class78 var38;
            if (var8.field833 == -1 && var8.field870 == null) {
                var38 = var8.method647(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class11(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1697(arg0, arg1, arg2, var16, var38, (class78) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1602(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class36.method2624(var40 >> 14 & 0x7FFF).field827 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class78 var42;
            class78 var43;
            if (var8.field833 == -1 && var8.field870 == null) {
                var42 = var8.method647(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method647(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field833, true, (class78) null);
                var43 = new class11(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field833, true, (class78) null);
            }
            arg6.method1697(arg0, arg1, arg2, var16, var42, var43, 256, arg4, field84[arg4] * var39, field85[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("g.m(IIIS)I")
    public static int method1(int arg0, int arg1, int arg2) {
        if ((field80[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (field80[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("t.t(IIIB)I")
    public static final int method73(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method446(var3, var5);
        int var8 = method446(var3 + 1, var5);
        int var9 = method446(var3, var5 + 1);
        int var10 = method446(var3 + 1, var5 + 1);
        int var11 = method640(var7, var8, var4, arg2);
        int var12 = method640(var9, var10, var4, arg2);
        return method640(var11, var12, var6, arg2);
    }

    @ObfuscatedName("av.l(IIIIB)I")
    public static final int method640(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1491[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("client.p(III)I")
    public static final int method446(int arg0, int arg1) {
        int var2 = method2634(arg0 - 1, arg1 - 1) + method2634(arg0 + 1, arg1 - 1) + method2634(arg0 - 1, arg1 + 1) + method2634(arg0 + 1, arg1 + 1);
        int var3 = method2634(arg0 - 1, arg1) + method2634(arg0 + 1, arg1) + method2634(arg0, arg1 - 1) + method2634(arg0, arg1 + 1);
        int var4 = method2634(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ex.r(III)I")
    public static final int method2634(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("n.j(III)I")
    public static final int method156(int arg0, int arg1) {
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

    @ObfuscatedName("ct.c(IIB)I")
    public static final int method2025(int arg0, int arg1) {
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

    @ObfuscatedName("h.q(IIIB)I")
    public static final int method159(int arg0, int arg1, int arg2) {
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
