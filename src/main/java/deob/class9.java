package deob;

@ObfuscatedName("r")
public final class class9 {

    @ObfuscatedName("r.i")
    public static int[][][] field115 = new int[4][105][105];

    @ObfuscatedName("r.w")
    public static byte[][][] field122 = new byte[4][104][104];

    @ObfuscatedName("r.f")
    public static int field117 = 99;

    @ObfuscatedName("r.j")
    public static final int[] field125 = new int[] { 1, 2, 4, 8 };

    @ObfuscatedName("r.n")
    public static final int[] field126 = new int[] { 16, 32, 64, 128 };

    @ObfuscatedName("r.q")
    public static final int[] field116 = new int[] { 1, 0, -1, 0 };

    @ObfuscatedName("r.c")
    public static final int[] field128 = new int[] { 0, -1, 0, 1 };

    @ObfuscatedName("r.h")
    public static final int[] field129 = new int[] { 1, -1, -1, 1 };

    @ObfuscatedName("r.b")
    public static final int[] field135 = new int[] { -1, -1, 1, 1 };

    @ObfuscatedName("r.y")
    public static int field131 = (int) (Math.random() * 17.0D) - 8;

    @ObfuscatedName("r.x")
    public static int field120 = (int) (Math.random() * 33.0D) - 16;

    public class9() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.i(B)V")
    public static void method1858() {
        field117 = 99;
        Statics.field118 = new byte[4][104][104];
        Statics.field1046 = new byte[4][104][104];
        Statics.field119 = new byte[4][104][104];
        Statics.field2032 = new byte[4][104][104];
        Statics.field1511 = new int[4][105][105];
        Statics.field133 = new byte[4][105][105];
        Statics.field121 = new int[105][105];
        Statics.field127 = new int[104];
        Statics.field1513 = new int[104];
        Statics.field972 = new int[104];
        Statics.field24 = new int[104];
        Statics.field2054 = new int[104];
    }

    @ObfuscatedName("bq.w(IIIII)V")
    public static final void method1377(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    Statics.field133[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        field115[0][var5][var4] = field115[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        field115[0][var5][var4] = field115[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        field115[0][var5][var4] = field115[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        field115[0][var5][var4] = field115[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("cr.f([BIIII[Lfa;I)V")
    public static final void method1869(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class164[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2731[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class127 var9 = new class127(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method27(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("y.e([BIIIIIII[Lfa;B)V")
    public static final void method247(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class164[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field2731[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
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
                        method27(var11, arg1, arg2 + var22, arg3 + Statics.method58(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        method27(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dd.t(IIII)V")
    public static final void method2211(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                field115[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                field115[arg0][arg1][arg2 + var5] = field115[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                field115[arg0][arg1 + var6][arg2] = field115[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && field115[arg0][arg1 - 1][arg2] != 0) {
            field115[arg0][arg1][arg2] = field115[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && field115[arg0][arg1][arg2 - 1] != 0) {
            field115[arg0][arg1][arg2] = field115[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && field115[arg0][arg1 - 1][arg2 - 1] != 0) {
            field115[arg0][arg1][arg2] = field115[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("f.d(Ldz;IIIIIIB)V")
    public static final void method27(class127 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2472();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2472();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2472();
                }
            }
            return;
        }
        field122[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2472();
            if (var7 == 0) {
                if (arg1 == 0) {
                    field115[0][arg2][arg3] = -method12(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    field115[arg1][arg2][arg3] = field115[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2472();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    field115[0][arg2][arg3] = -var8 * 8;
                } else {
                    field115[arg1][arg2][arg3] = field115[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                Statics.field1046[arg1][arg2][arg3] = arg0.method2453();
                Statics.field119[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                Statics.field2032[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                field122[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                Statics.field118[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("u.p([BIII)Z")
    public static final boolean method157(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class127 var4 = new class127(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method2465();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method2465();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method2472() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class32 var16 = class32.method2660(var5);
                        if (var13 != 22 || !client.field733 || var16.field852 != 0 || var16.field838 == 1 || var16.field863) {
                            if (!var16.method639()) {
                                client.field511++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method2465();
                if (var9 == 0) {
                    break;
                }
                var4.method2472();
            }
        }
    }

    @ObfuscatedName("a.k([BIIIIIIILcy;[Lfa;I)V")
    public static final void method128(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, class164[] arg9) {
        class127 var10 = new class127(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method2465();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method2465();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2472();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class32 var21 = class32.method2660(var11);
                    int var23 = var16 & 0x7;
                    int var24 = var15 & 0x7;
                    int var26 = var21.field836;
                    int var27 = var21.field837;
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
                    int var36 = var21.field836;
                    int var37 = var21.field837;
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
                        if ((field122[1][var31][var41] & 0x2) == 2) {
                            var42 = arg1 - 1;
                        }
                        class164 var43 = null;
                        if (var42 >= 0) {
                            var43 = arg9[var42];
                        }
                        method272(arg1, var31, var41, var11, arg7 + var20 & 0x3, var19, arg8, var43);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.r(IIIIIILcy;Lfa;I)V")
    public static final void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class95 arg6, class164 arg7) {
        if (client.field733 && (field122[0][arg1][arg2] & 0x2) == 0) {
            if ((field122[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((field122[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (field122[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field532 != var8) {
                return;
            }
        }
        if (arg0 < field117) {
            field117 = arg0;
        }
        class32 var9 = class32.method2660(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field837;
            var11 = var9.field836;
        } else {
            var10 = var9.field836;
            var11 = var9.field837;
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
        int[][] var16 = field115[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field852 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field865 == 1) {
            var21 += 256;
        }
        if (var9.method645()) {
            class7.method1223(arg0, arg1, arg2, var9, arg4);
        }
        if (arg5 == 22) {
            if (!client.field733 || var9.field852 != 0 || var9.field838 == 1 || var9.field863) {
                class94 var22;
                if (var9.field844 == -1 && var9.field829 == null) {
                    var22 = var9.method646(22, arg4, var16, var18, var17, var19);
                } else {
                    var22 = new class14(arg3, 22, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
                }
                arg6.method1878(arg0, arg1, arg2, var17, var22, var20, var21);
                if (var9.field838 == 1 && arg7 != null) {
                    arg7.method3191(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class94 var45;
            if (var9.field844 == -1 && var9.field829 == null) {
                var45 = var9.method646(10, arg4, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg3, 10, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            if (var45 != null && arg6.method1872(arg0, arg1, arg2, var17, var10, var11, var45, arg5 == 11 ? 256 : 0, var20, var21) && var9.field826) {
                int var46 = 15;
                if (var45 instanceof class112) {
                    var46 = ((class112) var45).method2287() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > Statics.field133[arg0][arg1 + var47][arg2 + var48]) {
                            Statics.field133[arg0][arg1 + var47][arg2 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3189(arg1, arg2, var10, var11, var9.field839);
            }
        } else if (arg5 >= 12) {
            class94 var23;
            if (var9.field844 == -1 && var9.field829 == null) {
                var23 = var9.method646(arg5, arg4, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1872(arg0, arg1, arg2, var17, 1, 1, var23, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                Statics.field1511[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3189(arg1, arg2, var10, var11, var9.field839);
            }
        } else if (arg5 == 0) {
            class94 var24;
            if (var9.field844 == -1 && var9.field829 == null) {
                var24 = var9.method646(0, arg4, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg3, 0, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1879(arg0, arg1, arg2, var17, var24, (class94) null, field125[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field826) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field866) {
                    Statics.field1511[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field826) {
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field866) {
                    Statics.field1511[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field826) {
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field866) {
                    Statics.field1511[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field826) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field866) {
                    Statics.field1511[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3188(arg1, arg2, arg5, arg4, var9.field839);
            }
            if (var9.field845 != 16) {
                arg6.method1991(arg0, arg1, arg2, var9.field845);
            }
        } else if (arg5 == 1) {
            class94 var25;
            if (var9.field844 == -1 && var9.field829 == null) {
                var25 = var9.method646(1, arg4, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg3, 1, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1879(arg0, arg1, arg2, var17, var25, (class94) null, field126[arg4], 0, var20, var21);
            if (var9.field826) {
                if (arg4 == 0) {
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3188(arg1, arg2, arg5, arg4, var9.field839);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field844 == -1 && var9.field829 == null) {
                var27 = var9.method646(2, arg4 + 4, var16, var18, var17, var19);
                var28 = var9.method646(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
                var28 = new class14(arg3, 2, var26, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1879(arg0, arg1, arg2, var17, var27, var28, field125[arg4], field125[var26], var20, var21);
            if (var9.field866) {
                if (arg4 == 0) {
                    Statics.field1511[arg0][arg1][arg2] |= 0x249;
                    Statics.field1511[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    Statics.field1511[arg0][arg1][arg2 + 1] |= 0x492;
                    Statics.field1511[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    Statics.field1511[arg0][arg1 + 1][arg2] |= 0x249;
                    Statics.field1511[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    Statics.field1511[arg0][arg1][arg2] |= 0x492;
                    Statics.field1511[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3188(arg1, arg2, arg5, arg4, var9.field839);
            }
            if (var9.field845 != 16) {
                arg6.method1991(arg0, arg1, arg2, var9.field845);
            }
        } else if (arg5 == 3) {
            class94 var29;
            if (var9.field844 == -1 && var9.field829 == null) {
                var29 = var9.method646(3, arg4, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg3, 3, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1879(arg0, arg1, arg2, var17, var29, (class94) null, field126[arg4], 0, var20, var21);
            if (var9.field826) {
                if (arg4 == 0) {
                    Statics.field133[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    Statics.field133[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    Statics.field133[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    Statics.field133[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3188(arg1, arg2, arg5, arg4, var9.field839);
            }
        } else if (arg5 == 9) {
            class94 var30;
            if (var9.field844 == -1 && var9.field829 == null) {
                var30 = var9.method646(arg5, arg4, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg3, arg5, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1872(arg0, arg1, arg2, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field838 != 0 && arg7 != null) {
                arg7.method3189(arg1, arg2, var10, var11, var9.field839);
            }
            if (var9.field845 != 16) {
                arg6.method1991(arg0, arg1, arg2, var9.field845);
            }
        } else if (arg5 == 4) {
            class94 var31;
            if (var9.field844 == -1 && var9.field829 == null) {
                var31 = var9.method646(4, arg4, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1871(arg0, arg1, arg2, var17, var31, (class94) null, field125[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            int var33 = arg6.method1887(arg0, arg1, arg2);
            if (var33 != 0) {
                var32 = class32.method2660(var33 >> 14 & 0x7FFF).field845;
            }
            class94 var34;
            if (var9.field844 == -1 && var9.field829 == null) {
                var34 = var9.method646(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg3, 4, arg4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1871(arg0, arg1, arg2, var17, var34, (class94) null, field125[arg4], 0, field116[arg4] * var32, field128[arg4] * var32, var20, var21);
        } else if (arg5 == 6) {
            int var35 = 8;
            int var36 = arg6.method1887(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class32.method2660(var36 >> 14 & 0x7FFF).field845 / 2;
            }
            class94 var37;
            if (var9.field844 == -1 && var9.field829 == null) {
                var37 = var9.method646(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1871(arg0, arg1, arg2, var17, var37, (class94) null, 256, arg4, field129[arg4] * var35, field135[arg4] * var35, var20, var21);
        } else if (arg5 == 7) {
            int var38 = arg4 + 2 & 0x3;
            class94 var39;
            if (var9.field844 == -1 && var9.field829 == null) {
                var39 = var9.method646(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg3, 4, var38 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1871(arg0, arg1, arg2, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var40 = 8;
            int var41 = arg6.method1887(arg0, arg1, arg2);
            if (var41 != 0) {
                var40 = class32.method2660(var41 >> 14 & 0x7FFF).field845 / 2;
            }
            int var42 = arg4 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field844 == -1 && var9.field829 == null) {
                var43 = var9.method646(4, arg4 + 4, var16, var18, var17, var19);
                var44 = var9.method646(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
                var44 = new class14(arg3, 4, var42 + 4, arg0, arg1, arg2, var9.field844, true, (class94) null);
            }
            arg6.method1871(arg0, arg1, arg2, var17, var43, var44, 256, arg4, field129[arg4] * var40, field135[arg4] * var40, var20, var21);
        }
    }

    @ObfuscatedName("o.l(Lcy;[Lfa;I)V")
    public static final void method171(class95 arg0, class164[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((field122[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((field122[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3190(var3, var4);
                        }
                    }
                }
            }
        }
        field131 += (int) (Math.random() * 5.0D) - 2;
        if (field131 < -8) {
            field131 = -8;
        }
        if (field131 > 8) {
            field131 = 8;
        }
        field120 += (int) (Math.random() * 5.0D) - 2;
        if (field120 < -16) {
            field120 = -16;
        }
        if (field120 > 16) {
            field120 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = Statics.field133[var6];
            int var8 = (int) Math.sqrt(5100.0D);
            int var9 = var8 * 768 >> 8;
            for (int var10 = 1; var10 < 103; var10++) {
                for (int var11 = 1; var11 < 103; var11++) {
                    int var12 = field115[var6][var11 + 1][var10] - field115[var6][var11 - 1][var10];
                    int var13 = field115[var6][var11][var10 + 1] - field115[var6][var11][var10 - 1];
                    int var14 = (int) Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536));
                    int var15 = (var12 << 8) / var14;
                    int var16 = 65536 / var14;
                    int var17 = (var13 << 8) / var14;
                    int var18 = (var17 * -50 + var15 * -50 + var16 * -10) / var9 + 96;
                    int var19 = (var7[var11][var10] >> 1) + (var7[var11][var10 + 1] >> 3) + (var7[var11][var10 - 1] >> 2) + (var7[var11 - 1][var10] >> 2) + (var7[var11 + 1][var10] >> 3);
                    Statics.field121[var11][var10] = var18 - var19;
                }
            }
            for (int var20 = 0; var20 < 104; var20++) {
                Statics.field127[var20] = 0;
                Statics.field1513[var20] = 0;
                Statics.field972[var20] = 0;
                Statics.field24[var20] = 0;
                Statics.field2054[var20] = 0;
            }
            for (int var21 = -5; var21 < 109; var21++) {
                for (int var22 = 0; var22 < 104; var22++) {
                    int var23 = var21 + 5;
                    int var10002;
                    if (var23 >= 0 && var23 < 104) {
                        int var24 = Statics.field118[var6][var23][var22] & 0xFF;
                        if (var24 > 0) {
                            class33 var25 = class33.method1654(var24 - 1);
                            Statics.field127[var22] += var25.field876;
                            Statics.field1513[var22] += var25.field877;
                            Statics.field972[var22] += var25.field878;
                            Statics.field24[var22] += var25.field874;
                            var10002 = Statics.field2054[var22]++;
                        }
                    }
                    int var26 = var21 - 5;
                    if (var26 >= 0 && var26 < 104) {
                        int var27 = Statics.field118[var6][var26][var22] & 0xFF;
                        if (var27 > 0) {
                            class33 var28 = class33.method1654(var27 - 1);
                            Statics.field127[var22] -= var28.field876;
                            Statics.field1513[var22] -= var28.field877;
                            Statics.field972[var22] -= var28.field878;
                            Statics.field24[var22] -= var28.field874;
                            var10002 = Statics.field2054[var22]--;
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
                            var29 += Statics.field127[var35];
                            var30 += Statics.field1513[var35];
                            var31 += Statics.field972[var35];
                            var32 += Statics.field24[var35];
                            var33 += Statics.field2054[var35];
                        }
                        int var36 = var34 - 5;
                        if (var36 >= 0 && var36 < 104) {
                            var29 -= Statics.field127[var36];
                            var30 -= Statics.field1513[var36];
                            var31 -= Statics.field972[var36];
                            var32 -= Statics.field24[var36];
                            var33 -= Statics.field2054[var36];
                        }
                        if (var34 >= 1 && var34 < 103) {
                            if (client.field733 && (field122[0][var21][var34] & 0x2) == 0) {
                                if ((field122[var6][var21][var34] & 0x10) != 0) {
                                    continue;
                                }
                                int var37;
                                if ((field122[var6][var21][var34] & 0x8) != 0) {
                                    var37 = 0;
                                } else if (var6 <= 0 || (field122[1][var21][var34] & 0x2) == 0) {
                                    var37 = var6;
                                } else {
                                    var37 = var6 - 1;
                                }
                                if (client.field532 != var37) {
                                    continue;
                                }
                            }
                            if (var6 < field117) {
                                field117 = var6;
                            }
                            int var38 = Statics.field118[var6][var21][var34] & 0xFF;
                            int var39 = Statics.field1046[var6][var21][var34] & 0xFF;
                            if (var38 > 0 || var39 > 0) {
                                int var40 = field115[var6][var21][var34];
                                int var41 = field115[var6][var21 + 1][var34];
                                int var42 = field115[var6][var21 + 1][var34 + 1];
                                int var43 = field115[var6][var21][var34 + 1];
                                int var44 = Statics.field121[var21][var34];
                                int var45 = Statics.field121[var21 + 1][var34];
                                int var46 = Statics.field121[var21 + 1][var34 + 1];
                                int var47 = Statics.field121[var21][var34 + 1];
                                int var48 = -1;
                                int var49 = -1;
                                if (var38 > 0) {
                                    int var50 = var29 * 256 / var32;
                                    int var51 = var30 / var33;
                                    int var52 = var31 / var33;
                                    var48 = method1862(var50, var51, var52);
                                    int var53 = field131 + var50 & 0xFF;
                                    int var54 = field120 + var52;
                                    if (var54 < 0) {
                                        var54 = 0;
                                    } else if (var54 > 255) {
                                        var54 = 255;
                                    }
                                    var49 = method1862(var53, var51, var54);
                                }
                                if (var6 > 0) {
                                    boolean var55 = true;
                                    if (var38 == 0 && Statics.field119[var6][var21][var34] != 0) {
                                        var55 = false;
                                    }
                                    if (var39 > 0 && !class37.method1144(var39 - 1).field946) {
                                        var55 = false;
                                    }
                                    if (var55 && var40 == var41 && var40 == var42 && var40 == var43) {
                                        Statics.field1511[var6][var21][var34] |= 0x924;
                                    }
                                }
                                int var56 = 0;
                                if (var49 != -1) {
                                    var56 = class104.field1784[method2131(var49, 96)];
                                }
                                if (var39 == 0) {
                                    arg0.method1877(var6, var21, var34, 0, 0, -1, var40, var41, var42, var43, method2131(var48, var44), method2131(var48, var45), method2131(var48, var46), method2131(var48, var47), 0, 0, 0, 0, var56, 0);
                                } else {
                                    int var57 = Statics.field119[var6][var21][var34] + 1;
                                    byte var58 = Statics.field2032[var6][var21][var34];
                                    class37 var59 = class37.method1144(var39 - 1);
                                    int var60 = var59.field945;
                                    int var61;
                                    int var62;
                                    if (var60 >= 0) {
                                        var61 = Statics.field1780.method2200(var60);
                                        var62 = -1;
                                    } else if (var59.field944 == 16711935) {
                                        var62 = -2;
                                        var60 = -1;
                                        var61 = -2;
                                    } else {
                                        var62 = method1862(var59.field948, var59.field949, var59.field958);
                                        int var63 = field131 + var59.field948 & 0xFF;
                                        int var64 = field120 + var59.field958;
                                        if (var64 < 0) {
                                            var64 = 0;
                                        } else if (var64 > 255) {
                                            var64 = 255;
                                        }
                                        var61 = method1862(var63, var59.field949, var64);
                                    }
                                    int var65 = 0;
                                    if (var61 != -2) {
                                        var65 = class104.field1784[method153(var61, 96)];
                                    }
                                    if (var59.field947 != -1) {
                                        int var66 = field131 + var59.field942 & 0xFF;
                                        int var67 = field120 + var59.field953;
                                        if (var67 < 0) {
                                            var67 = 0;
                                        } else if (var67 > 255) {
                                            var67 = 255;
                                        }
                                        int var68 = method1862(var66, var59.field952, var67);
                                        var65 = class104.field1784[method153(var68, 96)];
                                    }
                                    arg0.method1877(var6, var21, var34, var57, var58, var60, var40, var41, var42, var43, method2131(var48, var44), method2131(var48, var45), method2131(var48, var46), method2131(var48, var47), method153(var62, var44), method153(var62, var45), method153(var62, var46), method153(var62, var47), var56, var65);
                                }
                            }
                        }
                    }
                }
            }
            for (int var69 = 1; var69 < 103; var69++) {
                for (int var70 = 1; var70 < 103; var70++) {
                    int var75;
                    if ((field122[var6][var70][var69] & 0x8) != 0) {
                        var75 = 0;
                    } else if (var6 <= 0 || (field122[1][var70][var69] & 0x2) == 0) {
                        var75 = var6;
                    } else {
                        var75 = var6 - 1;
                    }
                    arg0.method1876(var6, var70, var69, var75);
                }
            }
            Statics.field118[var6] = (byte[][]) null;
            Statics.field1046[var6] = (byte[][]) null;
            Statics.field119[var6] = (byte[][]) null;
            Statics.field2032[var6] = (byte[][]) null;
            Statics.field133[var6] = (byte[][]) null;
        }
        arg0.method1902(-50, -10, -50);
        for (int var76 = 0; var76 < 104; var76++) {
            for (int var77 = 0; var77 < 104; var77++) {
                if ((field122[1][var76][var77] & 0x2) == 2) {
                    arg0.method1874(var76, var77);
                }
            }
        }
        int var78 = 1;
        int var79 = 2;
        int var80 = 4;
        for (int var81 = 0; var81 < 4; var81++) {
            if (var81 > 0) {
                var78 <<= 0x3;
                var79 <<= 0x3;
                var80 <<= 0x3;
            }
            for (int var82 = 0; var82 <= var81; var82++) {
                for (int var83 = 0; var83 <= 104; var83++) {
                    for (int var84 = 0; var84 <= 104; var84++) {
                        if ((Statics.field1511[var82][var84][var83] & var78) != 0) {
                            int var85 = var83;
                            int var86 = var83;
                            int var87 = var82;
                            int var88 = var82;
                            while (var85 > 0 && (Statics.field1511[var82][var84][var85 - 1] & var78) != 0) {
                                var85--;
                            }
                            while (var86 < 104 && (Statics.field1511[var82][var84][var86 + 1] & var78) != 0) {
                                var86++;
                            }
                            label351: while (var87 > 0) {
                                for (int var89 = var85; var89 <= var86; var89++) {
                                    if ((Statics.field1511[var87 - 1][var84][var89] & var78) == 0) {
                                        break label351;
                                    }
                                }
                                var87--;
                            }
                            label340: while (var88 < var81) {
                                for (int var90 = var85; var90 <= var86; var90++) {
                                    if ((Statics.field1511[var88 + 1][var84][var90] & var78) == 0) {
                                        break label340;
                                    }
                                }
                                var88++;
                            }
                            int var91 = (var88 + 1 - var87) * (var86 - var85 + 1);
                            if (var91 >= 8) {
                                short var92 = 240;
                                int var93 = field115[var88][var84][var85] - var92;
                                int var94 = field115[var87][var84][var85];
                                class95.method1875(var81, 1, var84 * 128, var84 * 128, var85 * 128, var86 * 128 + 128, var93, var94);
                                for (int var95 = var87; var95 <= var88; var95++) {
                                    for (int var96 = var85; var96 <= var86; var96++) {
                                        Statics.field1511[var95][var84][var96] &= ~var78;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1511[var82][var84][var83] & var79) != 0) {
                            int var97 = var84;
                            int var98 = var84;
                            int var99 = var82;
                            int var100 = var82;
                            while (var97 > 0 && (Statics.field1511[var82][var97 - 1][var83] & var79) != 0) {
                                var97--;
                            }
                            while (var98 < 104 && (Statics.field1511[var82][var98 + 1][var83] & var79) != 0) {
                                var98++;
                            }
                            label404: while (var99 > 0) {
                                for (int var101 = var97; var101 <= var98; var101++) {
                                    if ((Statics.field1511[var99 - 1][var101][var83] & var79) == 0) {
                                        break label404;
                                    }
                                }
                                var99--;
                            }
                            label393: while (var100 < var81) {
                                for (int var102 = var97; var102 <= var98; var102++) {
                                    if ((Statics.field1511[var100 + 1][var102][var83] & var79) == 0) {
                                        break label393;
                                    }
                                }
                                var100++;
                            }
                            int var103 = (var100 + 1 - var99) * (var98 - var97 + 1);
                            if (var103 >= 8) {
                                short var104 = 240;
                                int var105 = field115[var100][var97][var83] - var104;
                                int var106 = field115[var99][var97][var83];
                                class95.method1875(var81, 2, var97 * 128, var98 * 128 + 128, var83 * 128, var83 * 128, var105, var106);
                                for (int var107 = var99; var107 <= var100; var107++) {
                                    for (int var108 = var97; var108 <= var98; var108++) {
                                        Statics.field1511[var107][var108][var83] &= ~var79;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1511[var82][var84][var83] & var80) != 0) {
                            int var109 = var84;
                            int var110 = var84;
                            int var111 = var83;
                            int var112 = var83;
                            while (var111 > 0 && (Statics.field1511[var82][var84][var111 - 1] & var80) != 0) {
                                var111--;
                            }
                            while (var112 < 104 && (Statics.field1511[var82][var84][var112 + 1] & var80) != 0) {
                                var112++;
                            }
                            label457: while (var109 > 0) {
                                for (int var113 = var111; var113 <= var112; var113++) {
                                    if ((Statics.field1511[var82][var109 - 1][var113] & var80) == 0) {
                                        break label457;
                                    }
                                }
                                var109--;
                            }
                            label446: while (var110 < 104) {
                                for (int var114 = var111; var114 <= var112; var114++) {
                                    if ((Statics.field1511[var82][var110 + 1][var114] & var80) == 0) {
                                        break label446;
                                    }
                                }
                                var110++;
                            }
                            if ((var110 - var109 + 1) * (var112 - var111 + 1) >= 4) {
                                int var115 = field115[var82][var109][var111];
                                class95.method1875(var81, 4, var109 * 128, var110 * 128 + 128, var111 * 128, var112 * 128 + 128, var115, var115);
                                for (int var116 = var109; var116 <= var110; var116++) {
                                    for (int var117 = var111; var117 <= var112; var117++) {
                                        Statics.field1511[var82][var116][var117] &= ~var80;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.a(III)I")
    public static final int method12(int arg0, int arg1) {
        int var2 = Statics.method238(arg0 + 45365, arg1 + 91923, 4) - 128 + (Statics.method238(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Statics.method238(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("i.s(IIB)I")
    public static final int method5(int arg0, int arg1) {
        int var2 = method38(arg0 - 1, arg1 - 1) + method38(arg0 + 1, arg1 - 1) + method38(arg0 - 1, arg1 + 1) + method38(arg0 + 1, arg1 + 1);
        int var3 = method38(arg0 - 1, arg1) + method38(arg0 + 1, arg1) + method38(arg0, arg1 - 1) + method38(arg0, arg1 + 1);
        int var4 = method38(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("t.m(IIB)I")
    public static final int method38(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("ce.u(IIB)I")
    public static final int method2131(int arg0, int arg1) {
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

    @ObfuscatedName("s.g(III)I")
    public static final int method153(int arg0, int arg1) {
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

    @ObfuscatedName("cz.o(IIIB)I")
    public static final int method1862(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cc.v(IIIIIIILcy;Lfa;I)V")
    public static final void method1665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class95 arg7, class164 arg8) {
        class32 var9 = class32.method2660(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field837;
            var11 = var9.field836;
        } else {
            var10 = var9.field836;
            var11 = var9.field837;
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
        int[][] var16 = field115[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field852 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field865 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class94 var22;
            if (var9.field844 == -1 && var9.field829 == null) {
                var22 = var9.method641(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class14(arg4, 22, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1878(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field838 == 1) {
                arg8.method3191(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var45;
            if (var9.field844 == -1 && var9.field829 == null) {
                var45 = var9.method641(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class14(arg4, 10, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            if (var45 != null) {
                arg7.method1872(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field838 != 0) {
                arg8.method3189(arg2, arg3, var10, var11, var9.field839);
            }
        } else if (arg6 >= 12) {
            class94 var23;
            if (var9.field844 == -1 && var9.field829 == null) {
                var23 = var9.method641(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1872(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3189(arg2, arg3, var10, var11, var9.field839);
            }
        } else if (arg6 == 0) {
            class94 var24;
            if (var9.field844 == -1 && var9.field829 == null) {
                var24 = var9.method641(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class14(arg4, 0, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1879(arg0, arg2, arg3, var17, var24, (class94) null, field125[arg5], 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3188(arg2, arg3, arg6, arg5, var9.field839);
            }
        } else if (arg6 == 1) {
            class94 var25;
            if (var9.field844 == -1 && var9.field829 == null) {
                var25 = var9.method641(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class14(arg4, 1, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1879(arg0, arg2, arg3, var17, var25, (class94) null, field126[arg5], 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3188(arg2, arg3, arg6, arg5, var9.field839);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class94 var27;
            class94 var28;
            if (var9.field844 == -1 && var9.field829 == null) {
                var27 = var9.method641(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method641(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class14(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
                var28 = new class14(arg4, 2, var26, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1879(arg0, arg2, arg3, var17, var27, var28, field125[arg5], field125[var26], var20, var21);
            if (var9.field838 != 0) {
                arg8.method3188(arg2, arg3, arg6, arg5, var9.field839);
            }
        } else if (arg6 == 3) {
            class94 var29;
            if (var9.field844 == -1 && var9.field829 == null) {
                var29 = var9.method641(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class14(arg4, 3, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1879(arg0, arg2, arg3, var17, var29, (class94) null, field126[arg5], 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3188(arg2, arg3, arg6, arg5, var9.field839);
            }
        } else if (arg6 == 9) {
            class94 var30;
            if (var9.field844 == -1 && var9.field829 == null) {
                var30 = var9.method641(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class14(arg4, arg6, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1872(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field838 != 0) {
                arg8.method3189(arg2, arg3, var10, var11, var9.field839);
            }
        } else if (arg6 == 4) {
            class94 var31;
            if (var9.field844 == -1 && var9.field829 == null) {
                var31 = var9.method641(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1871(arg0, arg2, arg3, var17, var31, (class94) null, field125[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1887(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class32.method2660(var33 >> 14 & 0x7FFF).field845;
            }
            class94 var34;
            if (var9.field844 == -1 && var9.field829 == null) {
                var34 = var9.method641(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class14(arg4, 4, arg5, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1871(arg0, arg2, arg3, var17, var34, (class94) null, field125[arg5], 0, field116[arg5] * var32, field128[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1887(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class32.method2660(var36 >> 14 & 0x7FFF).field845 / 2;
            }
            class94 var37;
            if (var9.field844 == -1 && var9.field829 == null) {
                var37 = var9.method641(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1871(arg0, arg2, arg3, var17, var37, (class94) null, 256, arg5, field129[arg5] * var35, field135[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class94 var39;
            if (var9.field844 == -1 && var9.field829 == null) {
                var39 = var9.method641(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class14(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1871(arg0, arg2, arg3, var17, var39, (class94) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1887(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class32.method2660(var41 >> 14 & 0x7FFF).field845 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class94 var43;
            class94 var44;
            if (var9.field844 == -1 && var9.field829 == null) {
                var43 = var9.method641(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method641(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class14(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
                var44 = new class14(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field844, true, (class94) null);
            }
            arg7.method1871(arg0, arg2, arg3, var17, var43, var44, 256, arg5, field129[arg5] * var40, field135[arg5] * var40, var20, var21);
        }
    }
}
