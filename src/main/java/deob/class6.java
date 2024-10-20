package deob;

@ObfuscatedName("w")
public final class class6 {

    @ObfuscatedName("w.e")
    public static int[][][] field78 = new int[4][105][105];

    @ObfuscatedName("w.a")
    public static byte[][][] field70 = new byte[4][104][104];

    @ObfuscatedName("w.l")
    public static int field71 = 99;

    @ObfuscatedName("w.q")
    public static final int[] field86 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("w.d")
    public static final int[] field75 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("w.b")
    public static final int[] field79 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("w.x")
    public static final int[] field80 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("w.n")
    public static final int[] field81 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("w.v")
    public static final int[] field69 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("w.p")
    public static int field83 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("w.k")
    public static int field84 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.e(I)V")
    public static void method617() {
        field71 = 99;
        Statics.field72 = new byte[4][104][104];
        Statics.field3020 = new byte[4][104][104];
        Statics.field73 = new byte[4][104][104];
        Statics.field1265 = new byte[4][104][104];
        Statics.field3006 = new int[4][105][105];
        Statics.field74 = new byte[4][105][105];
        Statics.field199 = new int[105][105];
        Statics.field2743 = new int[104];
        Statics.field2980 = new int[104];
        Statics.field77 = new int[104];
        Statics.field2997 = new int[104];
        Statics.field1649 = new int[104];
    }

    @ObfuscatedName("v.a(IIIII)V")
    public static final void method545(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field74[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field78[0][var5][var4] = field78[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field78[0][var5][var4] = field78[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field78[0][var5][var4] = field78[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field78[0][var5][var4] = field78[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.l([BIIIIIII[Lhk;I)V")
    public static final void method678(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class219[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3078[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
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
                        method1475(var11, arg1, var25, arg3 + var31, 0, 0, arg7);
                    } else {
                        method1475(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.c(IIIB)V")
    public static final void method36(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field78[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field78[arg0][arg1][arg2 + var5] = field78[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field78[arg0][arg1 + var6][arg2] = field78[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field78[arg0][arg1 - 1][arg2] != 0) {
            field78[arg0][arg1][arg2] = field78[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field78[arg0][arg1][arg2 - 1] != 0) {
            field78[arg0][arg1][arg2] = field78[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field78[arg0][arg1 - 1][arg2 - 1] != 0) {
            field78[arg0][arg1][arg2] = field78[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("bz.u(Ldh;IIIIIIB)V")
    public static final void method1475(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2176();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2176();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2176();
                }
            }
            return;
        }
        field70[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2176();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field78[0][arg2][arg3] = -method2783(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field78[arg1][arg2][arg3] = field78[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2176();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field78[0][arg2][arg3] = -var8 * 8;
                } else {
                    field78[arg1][arg2][arg3] = field78[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field3020[arg1][arg2][arg3] = arg0.method2162();
                Statics.field73[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field1265[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field70[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field72[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("c.w([BIILcb;[Lhk;I)V")
    public static final void method34(byte[] arg0, int arg1, int arg2, class81 arg3, class219[] arg4) {
        class111 var5 = new class111(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method2188();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method2188();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2176();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((field70[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class219 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    method877(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("dj.i([BIIIIIIILcb;[Lhk;I)V")
    public static final void method2460(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class81 arg8, class219[] arg9) {
        class111 var10 = new class111(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2188();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2188();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2176();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class38 var21 = class38.method189(var11);
                    int var22 = arg2 + class167.method1463(var16 & 0x7, var15 & 0x7, arg7, var21.field867, var21.field845, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field867;
                    int var28 = var21.field845;
                    if ((var20 & 0x1) == 1) {
                        int var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var30 = arg7 & 0x3;
                    int var31;
                    if (var30 == 0) {
                        var31 = var25;
                    } else if (var30 == 1) {
                        var31 = 7 - var24 - (var27 - 1);
                    } else if (var30 == 2) {
                        var31 = 7 - var25 - (var28 - 1);
                    } else {
                        var31 = var24;
                    }
                    int var32 = arg3 + var31;
                    if (var22 > 0 && var32 > 0 && var22 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((field70[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class219 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        method877(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.r(IIIIIILcb;Lhk;B)V")
    public static final void method877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class219 arg7) {
        if (client.field241 && (field70[0][arg1][arg2] & 0x2) == 0) {
            if ((field70[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field70[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field70[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field298 != var8) {
                return;
            }
        }
        if (arg0 < field71) {
            field71 = arg0;
        }
        class38 var9 = class38.method189(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field845;
            var11 = var9.field867;
        } else {
            var10 = var9.field867;
            var11 = var9.field845;
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
        int[][] var16 = field78[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field876 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field852 == 1) {
            var21 += 256;
        }
        if (var9.method697()) {
            class22.method31(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field241 || var9.field876 != 0 || var9.field844 == 1 || var9.field843) {
                class80 var22;
                if (var9.field848 == -1 && var9.field870 == null) {
                    var22 = var9.method685(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var9.field848, true, (class80) null);
                }
                arg6.method1666(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field844 == 1 && arg7 != null) {
                    arg7.method3690(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var45;
            if (var9.field848 == -1 && var9.field870 == null) {
                var45 = var9.method685(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            if (var45 != null && arg6.method1670(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field860) {
                int var46 = 15;
                if (var45 instanceof class100) {
                    var46 = ((class100) var45).method2023() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field74[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field74[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field844 != 0 && arg7 != null) {
                arg7.method3697(arg1, arg2, var10, var11, var9.field847);
            }
        } else if (arg5 >= 12) {
            class80 var23;
            if (var9.field848 == -1 && var9.field870 == null) {
                var23 = var9.method685(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1670(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field3006[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field844 != 0 && arg7 != null) {
                arg7.method3697(arg1, arg2, var10, var11, var9.field847);
            }
        } else if (arg5 == 0) {
            class80 var24;
            if (var9.field848 == -1 && var9.field870 == null) {
                var24 = var9.method685(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1668(arg0, arg1, arg2, var17, var24, (class80) null, field86[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field860) {
                    Statics.field74[arg0][arg1][arg2] = 50;
                    Statics.field74[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field851) {
                    Statics.field3006[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field860) {
                    Statics.field74[arg0][arg1][arg2 + 1] = 50;
                    Statics.field74[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field851) {
                    Statics.field3006[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field860) {
                    Statics.field74[arg0][arg1 + 1][arg2] = 50;
                    Statics.field74[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field851) {
                    Statics.field3006[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field860) {
                    Statics.field74[arg0][arg1][arg2] = 50;
                    Statics.field74[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field851) {
                    Statics.field3006[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field844 != 0 && arg7 != null) {
                arg7.method3687(arg1, arg2, arg5, arg4, var9.field847);
            }
            if (var9.field853 != 16) {
                arg6.method1676(arg0, arg1, arg2, var9.field853);
            }
        } else if (arg5 == 1) {
            class80 var25;
            if (var9.field848 == -1 && var9.field870 == null) {
                var25 = var9.method685(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1668(arg0, arg1, arg2, var17, var25, (class80) null, field75[arg4], 0, var20, var21);
            if (var9.field860) {
                if (arg4 == 0) {
                    Statics.field74[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field74[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field74[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field74[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field844 != 0 && arg7 != null) {
                arg7.method3687(arg1, arg2, arg5, arg4, var9.field847);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class80 var27;
            class80 var28;
            if (var9.field848 == -1 && var9.field870 == null) {
                var27 = var9.method685(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method685(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field848, true, (class80) null);
                var28 = new class12(arg3, 2, var26, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1668(arg0, arg1, arg2, var17, var27, var28, field86[arg4], field86[var26], var20, var21);
            if (var9.field851) {
                if (arg4 == 0) {
                    Statics.field3006[arg0][arg1][arg2] |= 0x249;
                    Statics.field3006[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field3006[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field3006[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field3006[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field3006[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field3006[arg0][arg1][arg2] |= 0x492;
                    Statics.field3006[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field844 != 0 && arg7 != null) {
                arg7.method3687(arg1, arg2, arg5, arg4, var9.field847);
            }
            if (var9.field853 != 16) {
                arg6.method1676(arg0, arg1, arg2, var9.field853);
            }
        } else if (arg5 == 3) {
            class80 var29;
            if (var9.field848 == -1 && var9.field870 == null) {
                var29 = var9.method685(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1668(arg0, arg1, arg2, var17, var29, (class80) null, field75[arg4], 0, var20, var21);
            if (var9.field860) {
                if (arg4 == 0) {
                    Statics.field74[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field74[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field74[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field74[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field844 != 0 && arg7 != null) {
                arg7.method3687(arg1, arg2, arg5, arg4, var9.field847);
            }
        } else if (arg5 == 9) {
            class80 var30;
            if (var9.field848 == -1 && var9.field870 == null) {
                var30 = var9.method685(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1670(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field844 != 0 && arg7 != null) {
                arg7.method3697(arg1, arg2, var10, var11, var9.field847);
            }
            if (var9.field853 != 16) {
                arg6.method1676(arg0, arg1, arg2, var9.field853);
            }
        } else if (arg5 == 4) {
            class80 var31;
            if (var9.field848 == -1 && var9.field870 == null) {
                var31 = var9.method685(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1669(arg0, arg1, arg2, var17, var31, (class80) null, field86[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1686(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class38.method189(var33 >> 14 & 0x7FFF).field853;
            }
            class80 var34;
            if (var9.field848 == -1 && var9.field870 == null) {
                var34 = var9.method685(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1669(arg0, arg1, arg2, var17, var34, (class80) null, field86[arg4], 0, field79[arg4] * var32, field80[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1686(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class38.method189(var36 >> 14 & 0x7FFF).field853 / 2;
            }
            class80 var37;
            if (var9.field848 == -1 && var9.field870 == null) {
                var37 = var9.method685(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1669(arg0, arg1, arg2, var17, var37, (class80) null, 256, arg4, field81[arg4] * var35, field69[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class80 var39;
            if (var9.field848 == -1 && var9.field870 == null) {
                var39 = var9.method685(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class12(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1669(arg0, arg1, arg2, var17, var39, (class80) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1686(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class38.method189(var41 >> 14 & 0x7FFF).field853 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class80 var43;
            class80 var44;
            if (var9.field848 == -1 && var9.field870 == null) {
                var43 = var9.method685(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method685(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field848, true, (class80) null);
                var44 = new class12(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field848, true, (class80) null);
            }
            arg6.method1669(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field81[arg4] * var40, field69[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("eu.f(III)I")
    public static final int method2783(int arg0, int arg1) {
        int var2 = method29(arg0 + 45365, arg1 + 91923, 4) - 128 + (method29(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method29(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("l.g(IIIB)I")
    public static final int method29(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method26(var3, var5);
        int var8 = method26(var3 + 1, var5);
        int var9 = method26(var3, var5 + 1);
        int var10 = method26(var3 + 1, var5 + 1);
        int var11 = method2654(var7, var8, var4, arg2);
        int var12 = method2654(var9, var10, var4, arg2);
        return method2654(var11, var12, var6, arg2);
    }

    @ObfuscatedName("ec.o(IIIII)I")
    public static final int method2654(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class86.field1440[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("l.h(III)I")
    public static final int method26(int arg0, int arg1) {
        int var2 = method176(arg0 - 1, arg1 - 1) + method176(arg0 + 1, arg1 - 1) + method176(arg0 - 1, arg1 + 1) + method176(arg0 + 1, arg1 + 1);
        int var3 = method176(arg0 - 1, arg1) + method176(arg0 + 1, arg1) + method176(arg0, arg1 - 1) + method176(arg0, arg1 + 1);
        int var4 = method176(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("j.s(III)I")
    public static final int method176(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("c.j(IIB)I")
    public static final int method39(int arg0, int arg1) {
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

    @ObfuscatedName("cz.m(IIB)I")
    public static final int method2098(int arg0, int arg1) {
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

    @ObfuscatedName("hg.t(IIII)I")
    public static final int method3538(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("b.z(IIIIIIILcb;Lhk;I)V")
    public static final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class81 arg7, class219 arg8) {
        class38 var9 = class38.method189(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field845;
            var11 = var9.field867;
        } else {
            var10 = var9.field867;
            var11 = var9.field845;
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
        int[][] var16 = field78[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field876 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field852 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class80 var22;
            if (var9.field848 == -1 && var9.field870 == null) {
                var22 = var9.method686(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class12(arg4, 22, arg5, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1666(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field844 == 1) {
                arg8.method3690(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class80 var45;
            if (var9.field848 == -1 && var9.field870 == null) {
                var45 = var9.method686(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class12(arg4, 10, arg5, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            if (var45 != null) {
                arg7.method1670(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field844 != 0) {
                arg8.method3697(arg2, arg3, var10, var11, var9.field847);
            }
        } else if (arg6 >= 12) {
            class80 var23;
            if (var9.field848 == -1 && var9.field870 == null) {
                var23 = var9.method686(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1670(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3697(arg2, arg3, var10, var11, var9.field847);
            }
        } else if (arg6 == 0) {
            class80 var24;
            if (var9.field848 == -1 && var9.field870 == null) {
                var24 = var9.method686(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class12(arg4, 0, arg5, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var24, (class80) null, field86[arg5], 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3687(arg2, arg3, arg6, arg5, var9.field847);
            }
        } else if (arg6 == 1) {
            class80 var25;
            if (var9.field848 == -1 && var9.field870 == null) {
                var25 = var9.method686(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class12(arg4, 1, arg5, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var25, (class80) null, field75[arg5], 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3687(arg2, arg3, arg6, arg5, var9.field847);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class80 var27;
            class80 var28;
            if (var9.field848 == -1 && var9.field870 == null) {
                var27 = var9.method686(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method686(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class12(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field848, true, (class80) null);
                var28 = new class12(arg4, 2, var26, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var27, var28, field86[arg5], field86[var26], var20, var21);
            if (var9.field844 != 0) {
                arg8.method3687(arg2, arg3, arg6, arg5, var9.field847);
            }
        } else if (arg6 == 3) {
            class80 var29;
            if (var9.field848 == -1 && var9.field870 == null) {
                var29 = var9.method686(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class12(arg4, 3, arg5, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1668(arg0, arg2, arg3, var17, var29, (class80) null, field75[arg5], 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3687(arg2, arg3, arg6, arg5, var9.field847);
            }
        } else if (arg6 == 9) {
            class80 var30;
            if (var9.field848 == -1 && var9.field870 == null) {
                var30 = var9.method686(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class12(arg4, arg6, arg5, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1670(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field844 != 0) {
                arg8.method3697(arg2, arg3, var10, var11, var9.field847);
            }
        } else if (arg6 == 4) {
            class80 var31;
            if (var9.field848 == -1 && var9.field870 == null) {
                var31 = var9.method686(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1669(arg0, arg2, arg3, var17, var31, (class80) null, field86[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1686(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class38.method189(var33 >> 14 & 0x7FFF).field853;
            }
            class80 var34;
            if (var9.field848 == -1 && var9.field870 == null) {
                var34 = var9.method686(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class12(arg4, 4, arg5, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1669(arg0, arg2, arg3, var17, var34, (class80) null, field86[arg5], 0, field79[arg5] * var32, field80[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1686(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class38.method189(var36 >> 14 & 0x7FFF).field853 / 2;
            }
            class80 var37;
            if (var9.field848 == -1 && var9.field870 == null) {
                var37 = var9.method686(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1669(arg0, arg2, arg3, var17, var37, (class80) null, 256, arg5, field81[arg5] * var35, field69[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class80 var39;
            if (var9.field848 == -1 && var9.field870 == null) {
                var39 = var9.method686(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class12(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1669(arg0, arg2, arg3, var17, var39, (class80) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1686(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class38.method189(var41 >> 14 & 0x7FFF).field853 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class80 var43;
            class80 var44;
            if (var9.field848 == -1 && var9.field870 == null) {
                var43 = var9.method686(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method686(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class12(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field848, true, (class80) null);
                var44 = new class12(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field848, true, (class80) null);
            }
            arg7.method1669(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field81[arg5] * var40, field69[arg5] * var40, var20, var21);
        }
    }
}
