package deob;

@ObfuscatedName("q")
public final class class6 {

    @ObfuscatedName("q.n")
    public static int[][][] field83 = new int[4][105][105];

    @ObfuscatedName("q.w")
    public static byte[][][] field65 = new byte[4][104][104];

    @ObfuscatedName("q.i")
    public static int field68 = 99;

    @ObfuscatedName("q.o")
    public static final int[] field73 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("q.a")
    public static final int[] field79 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("q.p")
    public static final int[] field75 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("q.t")
    public static final int[] field76 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("q.x")
    public static final int[] field77 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("q.d")
    public static final int[] field78 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("q.j")
    public static int field72 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("q.r")
    public static int field66 = (int) (Math.random() * 33.0D) - 16;

    public class6() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.n(B)V")
    public static void method2074() {
        field68 = 99;
        Statics.field3065 = new byte[4][104][104];
        Statics.field67 = new byte[4][104][104];
        Statics.field817 = new byte[4][104][104];
        Statics.field86 = new byte[4][104][104];
        Statics.field1843 = new int[4][105][105];
        Statics.field2188 = new byte[4][105][105];
        Statics.field69 = new int[105][105];
        Statics.field70 = new int[104];
        Statics.field1142 = new int[104];
        Statics.field2563 = new int[104];
        Statics.field71 = new int[104];
        Statics.field726 = new int[104];
    }

    @ObfuscatedName("cu.w(B)V")
    public static void method1622() {
        Statics.field3065 = (byte[][][]) null;
        Statics.field67 = (byte[][][]) null;
        Statics.field817 = (byte[][][]) null;
        Statics.field86 = (byte[][][]) null;
        Statics.field1843 = (int[][][]) null;
        Statics.field2188 = (byte[][][]) null;
        Statics.field69 = (int[][]) null;
        Statics.field70 = null;
        Statics.field1142 = null;
        Statics.field2563 = null;
        Statics.field71 = null;
        Statics.field726 = null;
    }

    @ObfuscatedName("bw.i(IIIII)V")
    public static final void method1091(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field2188[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field83[0][var5][var4] = field83[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field83[0][var5][var4] = field83[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field83[0][var5][var4] = field83[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field83[0][var5][var4] = field83[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ea.e(IIII)V")
    public static final void method2785(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field83[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field83[arg0][arg1][arg2 + var5] = field83[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field83[arg0][arg1 + var6][arg2] = field83[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field83[arg0][arg1 - 1][arg2] != 0) {
            field83[arg0][arg1][arg2] = field83[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field83[arg0][arg1][arg2 - 1] != 0) {
            field83[arg0][arg1][arg2] = field83[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field83[arg0][arg1 - 1][arg2 - 1] != 0) {
            field83[arg0][arg1][arg2] = field83[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("bx.h(Ldo;IIIIIII)V")
    public static final void method1439(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2155();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2155();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2155();
                }
            }
            return;
        }
        field65[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2155();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field83[0][arg2][arg3] = -method2560(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field83[arg1][arg2][arg3] = field83[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2155();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field83[0][arg2][arg3] = -var8 * 8;
                } else {
                    field83[arg1][arg2][arg3] = field83[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field67[arg1][arg2][arg3] = arg0.method2173();
                Statics.field817[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field86[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field65[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field3065[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cc.q([BIII)Z")
    public static final boolean method1993(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class111 var4 = new class111(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2168();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2168();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2155() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class38 var16 = class38.method595(var5);
                        if (var13 != 22 || !client.field263 || var16.field916 != 0 || var16.field884 == 1 || var16.field900) {
                            if (!var16.method679()) {
                                client.field315++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2168();
                if (var9 == 0) {
                    break;
                }
                var4.method2155();
            }
        }
    }

    @ObfuscatedName("x.l(IIIIIILcf;Lhk;B)V")
    public static final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, class220 arg7) {
        if (client.field263 && (field65[0][arg1][arg2] & 0x2) == 0) {
            if ((field65[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field65[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field65[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field312 != var8) {
                return;
            }
        }
        if (arg0 < field68) {
            field68 = arg0;
        }
        class38 var9 = class38.method595(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field905;
            var11 = var9.field882;
        } else {
            var10 = var9.field882;
            var11 = var9.field905;
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
        int[][] var16 = field83[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field916 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field907 == 1) {
            var21 += 256;
        }
        if (var9.method687()) {
            class22 var22 = new class22();
            var22.field568 = arg0;
            var22.field570 = arg1 * 128;
            var22.field571 = arg2 * 128;
            int var23 = var9.field882;
            int var24 = var9.field905;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field905;
                var24 = var9.field882;
            }
            var22.field572 = (arg1 + var23) * 128;
            var22.field585 = (arg2 + var24) * 128;
            var22.field575 = var9.field911;
            var22.field574 = var9.field912 * 128;
            var22.field569 = var9.field913;
            var22.field583 = var9.field914;
            var22.field579 = var9.field915;
            if (var9.field889 != null) {
                var22.field581 = var9;
                var22.method506();
            }
            class22.field577.method3377(var22);
            if (var22.field579 != null) {
                var22.field580 = var22.field569 + (int) (Math.random() * (double) (var22.field583 - var22.field569));
            }
        }
        if (arg5 == 22) {
            if (!client.field263 || var9.field916 != 0 || var9.field884 == 1 || var9.field900) {
                class80 var25;
                if (var9.field890 == -1 && var9.field889 == null) {
                    var25 = var9.method680(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class12(arg3, 22, arg4, arg0, arg1, arg2, var9.field890, true, (class80) null);
                }
                arg6.method1652(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field884 == 1 && arg7 != null) {
                    arg7.method3743(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class80 var48;
            if (var9.field890 == -1 && var9.field889 == null) {
                var48 = var9.method680(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class12(arg3, 10, arg4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            if (var48 != null && arg6.method1730(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field879) {
                int var49 = 15;
                if (var48 instanceof class100) {
                    var49 = ((class100) var48).method2003() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > Statics.field2188[arg0][arg1 + var50][arg2 + var51]) {
                            Statics.field2188[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field884 != 0 && arg7 != null) {
                arg7.method3741(arg1, arg2, var10, var11, var9.field908);
            }
        } else if (arg5 >= 12) {
            class80 var26;
            if (var9.field890 == -1 && var9.field889 == null) {
                var26 = var9.method680(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1730(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1843[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field884 != 0 && arg7 != null) {
                arg7.method3741(arg1, arg2, var10, var11, var9.field908);
            }
        } else if (arg5 == 0) {
            class80 var27;
            if (var9.field890 == -1 && var9.field889 == null) {
                var27 = var9.method680(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class12(arg3, 0, arg4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1633(arg0, arg1, arg2, var17, var27, (class80) null, field73[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field879) {
                    Statics.field2188[arg0][arg1][arg2] = 50;
                    Statics.field2188[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field869) {
                    Statics.field1843[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field879) {
                    Statics.field2188[arg0][arg1][arg2 + 1] = 50;
                    Statics.field2188[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field869) {
                    Statics.field1843[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field879) {
                    Statics.field2188[arg0][arg1 + 1][arg2] = 50;
                    Statics.field2188[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field869) {
                    Statics.field1843[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field879) {
                    Statics.field2188[arg0][arg1][arg2] = 50;
                    Statics.field2188[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field869) {
                    Statics.field1843[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field884 != 0 && arg7 != null) {
                arg7.method3740(arg1, arg2, arg5, arg4, var9.field908);
            }
            if (var9.field886 != 16) {
                arg6.method1641(arg0, arg1, arg2, var9.field886);
            }
        } else if (arg5 == 1) {
            class80 var28;
            if (var9.field890 == -1 && var9.field889 == null) {
                var28 = var9.method680(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class12(arg3, 1, arg4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1633(arg0, arg1, arg2, var17, var28, (class80) null, field79[arg4], 0, var20, var21);
            if (var9.field879) {
                if (arg4 == 0) {
                    Statics.field2188[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2188[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2188[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2188[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field884 != 0 && arg7 != null) {
                arg7.method3740(arg1, arg2, arg5, arg4, var9.field908);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class80 var30;
            class80 var31;
            if (var9.field890 == -1 && var9.field889 == null) {
                var30 = var9.method680(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method680(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class12(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field890, true, (class80) null);
                var31 = new class12(arg3, 2, var29, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1633(arg0, arg1, arg2, var17, var30, var31, field73[arg4], field73[var29], var20, var21);
            if (var9.field869) {
                if (arg4 == 0) {
                    Statics.field1843[arg0][arg1][arg2] |= 0x249;
                    Statics.field1843[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1843[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1843[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1843[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1843[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1843[arg0][arg1][arg2] |= 0x492;
                    Statics.field1843[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field884 != 0 && arg7 != null) {
                arg7.method3740(arg1, arg2, arg5, arg4, var9.field908);
            }
            if (var9.field886 != 16) {
                arg6.method1641(arg0, arg1, arg2, var9.field886);
            }
        } else if (arg5 == 3) {
            class80 var32;
            if (var9.field890 == -1 && var9.field889 == null) {
                var32 = var9.method680(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class12(arg3, 3, arg4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1633(arg0, arg1, arg2, var17, var32, (class80) null, field79[arg4], 0, var20, var21);
            if (var9.field879) {
                if (arg4 == 0) {
                    Statics.field2188[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field2188[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field2188[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field2188[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field884 != 0 && arg7 != null) {
                arg7.method3740(arg1, arg2, arg5, arg4, var9.field908);
            }
        } else if (arg5 == 9) {
            class80 var33;
            if (var9.field890 == -1 && var9.field889 == null) {
                var33 = var9.method680(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class12(arg3, arg5, arg4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1730(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field884 != 0 && arg7 != null) {
                arg7.method3741(arg1, arg2, var10, var11, var9.field908);
            }
            if (var9.field886 != 16) {
                arg6.method1641(arg0, arg1, arg2, var9.field886);
            }
        } else if (arg5 == 4) {
            class80 var34;
            if (var9.field890 == -1 && var9.field889 == null) {
                var34 = var9.method680(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1743(arg0, arg1, arg2, var17, var34, (class80) null, field73[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1629(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class38.method595(var36 >> 14 & 0x7FFF).field886;
            }
            class80 var37;
            if (var9.field890 == -1 && var9.field889 == null) {
                var37 = var9.method680(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class12(arg3, 4, arg4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1743(arg0, arg1, arg2, var17, var37, (class80) null, field73[arg4], 0, field75[arg4] * var35, field76[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1629(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class38.method595(var39 >> 14 & 0x7FFF).field886 / 2;
            }
            class80 var40;
            if (var9.field890 == -1 && var9.field889 == null) {
                var40 = var9.method680(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1743(arg0, arg1, arg2, var17, var40, (class80) null, 256, arg4, field77[arg4] * var38, field78[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class80 var42;
            if (var9.field890 == -1 && var9.field889 == null) {
                var42 = var9.method680(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class12(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1743(arg0, arg1, arg2, var17, var42, (class80) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1629(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class38.method595(var44 >> 14 & 0x7FFF).field886 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class80 var46;
            class80 var47;
            if (var9.field890 == -1 && var9.field889 == null) {
                var46 = var9.method680(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method680(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class12(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field890, true, (class80) null);
                var47 = new class12(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field890, true, (class80) null);
            }
            arg6.method1743(arg0, arg1, arg2, var17, var46, var47, 256, arg4, field77[arg4] * var43, field78[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("dr.c(III)I")
    public static final int method2560(int arg0, int arg1) {
        int var2 = method1894(arg0 + 45365, arg1 + 91923, 4) - 128 + (method1894(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method1894(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("cz.f(IIII)I")
    public static final int method1894(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method1899(var3, var5);
        int var8 = method1899(var3 + 1, var5);
        int var9 = method1899(var3, var5 + 1);
        int var10 = method1899(var3 + 1, var5 + 1);
        int var11 = 65536 - class86.field1513[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class86.field1513[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class86.field1513[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ci.s(IIB)I")
    public static final int method1899(int arg0, int arg1) {
        int var2 = method1896(arg0 - 1, arg1 - 1) + method1896(arg0 + 1, arg1 - 1) + method1896(arg0 - 1, arg1 + 1) + method1896(arg0 + 1, arg1 + 1);
        int var3 = method1896(arg0 - 1, arg1) + method1896(arg0 + 1, arg1) + method1896(arg0, arg1 - 1) + method1896(arg0, arg1 + 1);
        int var4 = method1896(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("ch.m(IIS)I")
    public static final int method1896(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ft.y(III)I")
    public static final int method3081(int arg0, int arg1) {
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

    @ObfuscatedName("i.b(III)I")
    public static final int method19(int arg0, int arg1) {
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

    @ObfuscatedName("dp.v(IIIB)I")
    public static final int method2518(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("fj.z(III)Z")
    public static final boolean method3033(int arg0, int arg1) {
        class38 var2 = class38.method595(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method695(arg1);
    }
}
